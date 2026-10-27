import com.atxx.jhmcp.*;
import com.google.gson.*;
import io.modelcontextprotocol.kotlin.sdk.types.CallToolResult;
import io.modelcontextprotocol.kotlin.sdk.types.TextContent;
import jadx.api.*;
import jadx.api.plugins.input.data.attributes.JadxAttrType;
import jadx.core.dex.info.FieldInfo;
import jadx.core.dex.nodes.*;
import java.lang.reflect.*;
import java.util.*;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.BuildersKt;

/** Real audited-JAR regression; synthetic protocol fixtures cannot prove absence of code generation. */
public class ReaJadxMetadataRegression {
  private static void require(boolean condition, String reason) {
    if (!condition) throw new AssertionError(reason);
  }

  private static JsonObject call(Method handle, Object bridge, String operation, JsonObject arguments)
      throws Exception {
    var input = (kotlinx.serialization.json.JsonObject)
        kotlinx.serialization.json.Json.Default.parseToJsonElement(arguments.toString());
    CallToolResult response;
    try {
      response = (CallToolResult) handle.invoke(bridge, operation, input);
    } catch (InvocationTargetException failure) {
      throw new AssertionError(operation + " failed", failure.getCause());
    }
    require(!Boolean.TRUE.equals(response.isError()), operation + " returned an error");
    require(response.getContent().size() == 1 && response.getContent().get(0) instanceof TextContent,
        "Unsupported response envelope");
    return JsonParser.parseString(((TextContent) response.getContent().get(0)).getText()).getAsJsonObject();
  }

  private static JsonObject arguments(String className) {
    JsonObject value = new JsonObject();
    value.addProperty("class_name", className);
    return value;
  }

  private static JsonObject annotation(JsonObject result, String className) {
    for (JsonElement item : result.getAsJsonArray("annotations")) {
      JsonObject value = item.getAsJsonObject();
      if (value.get("class").getAsString().equals(className)) return value.getAsJsonObject("values");
    }
    throw new AssertionError("Missing annotation " + className);
  }

  private static void requireString(JsonObject encoded, String expected) {
    require(encoded.get("kind").getAsString().equals("string")
        && encoded.get("value").getAsString().equals(expected), "Original annotation string changed");
  }

  private static void verifyAnnotations(SessionHolder holder, SessionConfig config, String dex,
      Constructor<?> constructor, Method handle) throws Exception {
    BuildersKt.runBlocking(EmptyCoroutineContext.INSTANCE,
        (scope, continuation) -> holder.load(dex, config, continuation));
    JadxSession session = holder.current();
    JadxDecompiler decompiler = session.getClasses().get(0).getClassNode().root().getDecompiler();
    Object bridge = constructor.newInstance(holder);
    String className = "rea.fixture.AnnotationFixture";
    JsonObject summary = call(handle, bridge, "get_class_summary", arguments(className));
    List<JsonObject> methods = new ArrayList<>();
    for (JsonElement item : summary.getAsJsonArray("methods")) {
      JsonObject method = item.getAsJsonObject();
      if (method.get("name").getAsString().equals("request")) methods.add(method);
    }
    require(methods.size() == 2, "Annotation fixture must contain two request overloads");
    List<JsonObject> selectors = new ArrayList<>();
    List<JsonObject> snapshots = new ArrayList<>();
    for (int index = 0; index < methods.size(); index++) {
      JsonObject selector = arguments(className);
      selector.addProperty("method_name", "request");
      selector.addProperty("overload_index", index);
      selectors.add(selector);
      JsonObject snapshot = call(handle, bridge, "get_annotation_values", selector);
      snapshots.add(snapshot);
      require(!snapshot.get("truncated").getAsBoolean(), "Small method annotations must be complete");
      require(snapshot.get("overload_index").getAsInt() == index
          && snapshot.get("overload_count").getAsInt() == 2, "Annotation overload identity changed");
      boolean noArguments = methods.get(index).get("signature").getAsString().startsWith("request()");
      String route = noArguments ? "/fixture/first" : "/fixture/second";
      String otherRoute = noArguments ? "/fixture/second" : "/fixture/first";
      JsonObject values = annotation(snapshot, "Lrea/fixture/AnnotationFixture$Marker;");
      requireString(values.getAsJsonObject("route"), route);
      JsonObject hasBody = values.getAsJsonObject("hasBody");
      require(hasBody.get("kind").getAsString().equals("boolean")
          && hasBody.getAsJsonPrimitive("value").isBoolean()
          && hasBody.get("value").getAsBoolean() == noArguments, "Original annotation boolean changed");
      JsonObject count = values.getAsJsonObject("count");
      require(count.get("kind").getAsString().equals("int") && count.get("value").getAsInt() == 7,
          "Original annotation integer changed");
      JsonObject nested = values.getAsJsonObject("nested");
      require(nested.get("kind").getAsString().equals("annotation"), "Nested annotation missing");
      requireString(nested.getAsJsonObject("value").getAsJsonObject("values").getAsJsonObject("value"), route);
      JsonArray routes = values.getAsJsonObject("routes").getAsJsonArray("value");
      require(routes.size() == 2, "Original annotation array changed");
      requireString(routes.get(0).getAsJsonObject(), route);
      requireString(routes.get(1).getAsJsonObject(), otherRoute);
      JsonObject mode = values.getAsJsonObject("mode");
      require(mode.get("kind").getAsString().equals("field")
          && mode.getAsJsonObject("value").get("name").getAsString().equals("ACTIVE"),
          "Original enum reference changed");
    }
    for (ClassNode node : decompiler.getRoot().getClasses())
      require(node.getState() == ProcessState.NOT_LOADED, "Annotation metadata generated source");
    for (int index = 0; index < selectors.size(); index++) {
      JsonObject body = call(handle, bridge, "get_method_body", selectors.get(index));
      require(body.get("mode").getAsString().equals("java"), "Annotation fixture did not generate Java");
      require(snapshots.get(index).equals(call(handle, bridge, "get_annotation_values", selectors.get(index))),
          "Parsed method annotation values changed after code generation");
    }
    ClassNode fixture = decompiler.getRoot().resolveClass(className);
    boolean replaced = fixture.getMethods().stream().filter(method -> method.getName().equals("request"))
        .anyMatch(method -> {
          var annotations = method.get(JadxAttrType.ANNOTATION_LIST);
          if (annotations == null) return false;
          var marker = annotations.get("Lrea/fixture/AnnotationFixture$Marker;");
          return marker != null && marker.getValues().get("route").getValue() instanceof FieldInfo;
        });
    require(replaced, "Fixture must exercise real JADX replacement of annotation literals with FieldInfo");
    // Reloading code must also leave the original method metadata intact.
    fixture.reloadCode();
    for (int index = 0; index < selectors.size(); index++)
      require(snapshots.get(index).equals(call(handle, bridge, "get_annotation_values", selectors.get(index))),
          "Parsed method annotation values changed after forced code regeneration");
  }

  public static void main(String[] args) throws Exception {
    SessionConfig config = new SessionConfig(1048576, 0, 90000L, 1, List.of(), List.of(), 64, ResourceMode.FULL);
    SessionHolder holder = new SessionHolder(config);
    try {
      BuildersKt.runBlocking(EmptyCoroutineContext.INSTANCE,
          (scope, continuation) -> holder.load(args[0], config, continuation));
      JadxSession session = holder.current();
      require(session != null && !session.getClasses().isEmpty(), "Fixture did not load classes");
      JadxDecompiler decompiler = session.getClasses().get(0).getClassNode().root().getDecompiler();
      IdentityHashMap<ClassNode, ProcessState> states = new IdentityHashMap<>();
      for (ClassNode node : decompiler.getRoot().getClasses()) {
        require(node.getState() == ProcessState.NOT_LOADED, "Fixture unexpectedly generated source");
        states.put(node, node.getState());
      }
      Class<?> bridgeType = Class.forName("ReaJadxBridge");
      Constructor<?> constructor = bridgeType.getDeclaredConstructor(SessionHolder.class);
      constructor.setAccessible(true);
      Object bridge = constructor.newInstance(holder);
      Method handle = bridgeType.getDeclaredMethod("handle", String.class, kotlinx.serialization.json.JsonObject.class);
      handle.setAccessible(true);
      JsonObject apiArgs = arguments("io.appium.android.apis.ApiDemos");
      JsonObject apiSummary = call(handle, bridge, "get_class_summary", apiArgs);
      for (var entry : states.entrySet()) require(entry.getKey().getState() == entry.getValue(),
          "Metadata generated source: " + entry.getKey().getRawName());
      require(states.size() == decompiler.getRoot().getClasses().size(), "Metadata changed class inventory");
      require(apiSummary.getAsJsonArray("fields").get(0).getAsJsonObject().get("type").getAsString().contains("Comparator"),
          "Generic field type was truncated");
      JsonObject componentArgs = arguments("androidx.activity.ComponentActivity");
      JsonObject componentSummary = call(handle, bridge, "get_class_summary", componentArgs);
      List<String> signatures = new ArrayList<>();
      for (JsonElement entry : componentSummary.getAsJsonArray("methods")) {
        JsonObject method = entry.getAsJsonObject();
        if (method.get("name").getAsString().equals("setContentView"))
          signatures.add(method.get("signature").getAsString());
      }
      require(signatures.size() == 3, "Fixture must contain three setContentView overloads");
      String[] declarations = { "setContentView(int ", "setContentView(View ", "setContentView(View view, ViewGroup.LayoutParams " };
      for (int index = 0; index < signatures.size(); index++) {
        JsonObject methodArgs = arguments("androidx.activity.ComponentActivity");
        methodArgs.addProperty("method_name", "setContentView");
        methodArgs.addProperty("overload_index", index);
        JsonObject first = call(handle, bridge, "get_method_body", methodArgs);
        require(first.equals(call(handle, bridge, "get_method_body", methodArgs)), "Repeated body changed");
        require(first.get("overload_index").getAsInt() == index && first.get("overload_count").getAsInt() == 3,
            "Overload envelope mismatch");
        require(first.get("mode").getAsString().equals("java"), "Fixture did not produce Java");
        require(first.get("body").getAsString().contains(declarations[index]), "Wrong overload: " + signatures.get(index));
      }
      require(componentSummary.equals(call(handle, bridge, "get_class_summary", componentArgs)),
          "Frozen summary changed after code generation");
      require(apiSummary.equals(call(handle, bridge, "get_class_summary", apiArgs)), "Unrelated frozen summary changed");
      BuildersKt.runBlocking(EmptyCoroutineContext.INSTANCE,
          (scope, continuation) -> holder.unload(continuation));
      verifyAnnotations(holder, config, args[1], constructor, handle);
      System.out.println("METADATA_REGRESSION_PASS classes=" + states.size()
          + " overloads=" + signatures.size() + " annotations=2");
    } finally {
      BuildersKt.runBlocking(EmptyCoroutineContext.INSTANCE,
          (scope, continuation) -> holder.unload(continuation));
    }
  }
}
