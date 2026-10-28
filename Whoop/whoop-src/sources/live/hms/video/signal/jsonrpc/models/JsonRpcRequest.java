package live.hms.video.signal.jsonrpc.models;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import live.hms.video.signal.HMSSignalMethod;
import live.hms.video.utils.ExtensionUtilsKt;
import live.hms.video.utils.HMSConstantsKt;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\t\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\nB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\t\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0006\u0010\u0013\u001a\u00020\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u001f"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;", "", "id", "", "method", "params", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/signal/jsonrpc/models/HMSParams;)V", "Llive/hms/video/signal/HMSSignalMethod;", "(Llive/hms/video/signal/HMSSignalMethod;Llive/hms/video/signal/jsonrpc/models/HMSParams;)V", "(Ljava/lang/String;Llive/hms/video/signal/HMSSignalMethod;Llive/hms/video/signal/jsonrpc/models/HMSParams;)V", "getId", "()Ljava/lang/String;", "getMethod", "getParams", "()Llive/hms/video/signal/jsonrpc/models/HMSParams;", "version", "getVersion", "toJson", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class JsonRpcRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("id")
    private final String id;

    @SerializedName("method")
    private final String method;

    @SerializedName("params")
    private final HMSParams params;

    @SerializedName("jsonrpc")
    private final String version;

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest$Companion;", "", "<init>", "()V", "make", "", "method", "params", "Lcom/google/gson/JsonElement;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String make(String method, JsonElement params) {
            AbstractC22676k.m65750j(method, "method");
            AbstractC22676k.m65750j(params, "params");
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("method", method);
            jsonObject.add("params", params);
            jsonObject.addProperty("jsonrpc", HMSConstantsKt.cJsonRpcVersion);
            return ExtensionUtilsKt.toJson(jsonObject);
        }

        private Companion() {
        }
    }

    public JsonRpcRequest(String id4, String method, HMSParams params) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(method, "method");
        AbstractC22676k.m65750j(params, "params");
        this.id = id4;
        this.method = method;
        this.params = params;
        this.version = HMSConstantsKt.cJsonRpcVersion;
    }

    public static /* synthetic */ JsonRpcRequest copy$default(JsonRpcRequest jsonRpcRequest, String str, String str2, HMSParams hMSParams, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = jsonRpcRequest.id;
        }
        if ((i13 & 2) != 0) {
            str2 = jsonRpcRequest.method;
        }
        if ((i13 & 4) != 0) {
            hMSParams = jsonRpcRequest.params;
        }
        return jsonRpcRequest.copy(str, str2, hMSParams);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HMSParams getParams() {
        return this.params;
    }

    public final JsonRpcRequest copy(String id4, String method, HMSParams params) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(method, "method");
        AbstractC22676k.m65750j(params, "params");
        return new JsonRpcRequest(id4, method, params);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JsonRpcRequest)) {
            return false;
        }
        JsonRpcRequest jsonRpcRequest = (JsonRpcRequest) other;
        return AbstractC22676k.m65745e(this.id, jsonRpcRequest.id) && AbstractC22676k.m65745e(this.method, jsonRpcRequest.method) && AbstractC22676k.m65745e(this.params, jsonRpcRequest.params);
    }

    public final String getId() {
        return this.id;
    }

    public final String getMethod() {
        return this.method;
    }

    public final HMSParams getParams() {
        return this.params;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.params.hashCode() + AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.method);
    }

    public final String toJson() {
        JsonObject jsonObject = new JsonObject();
        if (!AbstractC39414r.m125890i0(this.id)) {
            jsonObject.addProperty("id", this.id);
        }
        jsonObject.addProperty("method", this.method);
        jsonObject.add("params", ExtensionUtilsKt.toJsonObject(this.params));
        jsonObject.addProperty("jsonrpc", HMSConstantsKt.cJsonRpcVersion);
        return ExtensionUtilsKt.toJson(jsonObject);
    }

    public String toString() {
        return "JsonRpcRequest(id=" + this.id + ", method=" + this.method + ", params=" + this.params + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JsonRpcRequest(HMSSignalMethod method, HMSParams params) {
        this("", method.toString(), params);
        AbstractC22676k.m65750j(method, "method");
        AbstractC22676k.m65750j(params, "params");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JsonRpcRequest(String id4, HMSSignalMethod method, HMSParams params) {
        this(id4, method.toString(), params);
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(method, "method");
        AbstractC22676k.m65750j(params, "params");
    }
}
