package com.whoop.design.models.binding;

import ad3.AbstractC0770m;
import ad3.C0783z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import live.hms.video.factories.MediaConstraintsFactory;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import n83.C26463f;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r61.C30985h;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yb3.C39410n;
import yb3.C39412p;
import yb3.InterfaceC39407k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001ae\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\f\u001a\u00028\u00002\u0016\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0014\u001a)\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001a\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001d\u0010 \u001a\u00020\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u001eH\u0002¢\u0006\u0004\b \u0010!\u001a)\u0010$\u001a\u00020\u00122\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001e2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b$\u0010%\u001a'\u0010(\u001a\u00020\u00192\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001e2\u0006\u0010'\u001a\u00020\"H\u0002¢\u0006\u0004\b(\u0010)\u001a)\u0010*\u001a\u00020\u00122\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001e2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b*\u0010%\u001a\u0019\u0010,\u001a\u0004\u0018\u00010\n2\u0006\u0010+\u001a\u00020\"H\u0002¢\u0006\u0004\b,\u0010-\u001a\u0013\u0010.\u001a\u00020\u0019*\u0004\u0018\u00010\n¢\u0006\u0004\b.\u0010/\u001a)\u00100\u001a\u00020\u00122\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001e2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b0\u0010%\u001a%\u00101\u001a\b\u0012\u0004\u0012\u00020\u00000\u001e2\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001eH\u0002¢\u0006\u0004\b1\u00102\u001a\u0017\u00104\u001a\u00020\u00192\u0006\u00103\u001a\u00020\u0000H\u0002¢\u0006\u0004\b4\u00105\u001a\u0019\u00107\u001a\u0004\u0018\u0001062\u0006\u0010\u0001\u001a\u00020\"H\u0002¢\u0006\u0004\b7\u00108\u001a+\u00109\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0002H\u0002¢\u0006\u0004\b9\u0010\u0014\u001a\u0017\u0010:\u001a\u00020\"2\u0006\u0010'\u001a\u00020\nH\u0002¢\u0006\u0004\b:\u0010;\u001a\u0011\u0010<\u001a\u00020\u0003*\u00020\u0003¢\u0006\u0004\b<\u0010=\"\u0014\u0010>\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u0010?\"\u0014\u0010@\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010?*@\u0010D\"\u001d\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\t0C2\u001d\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\t0C¨\u0006E"}, m65681d2 = {"Lkotlinx/serialization/json/JsonObject;", "element", "", "", "Lcom/whoop/design/models/binding/AggregateBinding;", "parseAggregateBindings", "(Lkotlinx/serialization/json/JsonObject;)Ljava/util/Map;", "T", "aggregateBindings", "propertyName", "", "accumulatedState", "base", "Lkotlin/Function1;", "coerce", "overlayAggregateBinding", "(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "binding", "Lcom/whoop/design/models/binding/AggregateEvaluation;", "evaluateAggregateBinding", "(Lcom/whoop/design/models/binding/AggregateBinding;Ljava/util/Map;)Lcom/whoop/design/models/binding/AggregateEvaluation;", "evaluateStringReplace", "template", "interpolateInlineBindings", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "", "containsInlineBindingToken", "(Ljava/lang/String;)Z", "toBindingString", "(Ljava/lang/Object;)Ljava/lang/String;", "", "aggregate", "evaluateEmptiness", "(Ljava/util/List;)Z", "Lkotlinx/serialization/json/JsonElement;", "parameter", "evaluateContains", "(Ljava/util/List;Lkotlinx/serialization/json/JsonElement;)Lcom/whoop/design/models/binding/AggregateEvaluation;", "list", "value", "aggregateListContains", "(Ljava/util/List;Lkotlinx/serialization/json/JsonElement;)Z", "evaluateMapCount", "el", "jsonElementToBindingValue", "(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;", "isTruthyJdslSelection", "(Ljava/lang/Object;)Z", "evaluateBuildCheckoutWithItems", "cartItemsFromAggregate", "(Ljava/util/List;)Ljava/util/List;", "obj", "isValidCheckoutLineItem", "(Lkotlinx/serialization/json/JsonObject;)Z", "", "jsonElementToPositiveInt", "(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Integer;", "evaluatePostStates", "stateValueToJsonElement", "(Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;", "camelToSnakeCase", "(Ljava/lang/String;)Ljava/lang/String;", "INLINE_BINDING_TOKEN_START", "Ljava/lang/String;", "INLINE_BINDING_TOKEN_END", "Lwc3/i;", "with", "Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;", "AggregateBindings", "state-binding-annotations"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AggregateBindingKt {
    private static final String INLINE_BINDING_TOKEN_END = "}}";
    private static final String INLINE_BINDING_TOKEN_START = "{{";

    private static final boolean aggregateListContains(List<? extends Object> list, JsonElement jsonElement) {
        for (Object obj : list) {
            if (obj != null) {
                if (AbstractC22676k.m65745e(stateValueToJsonElement(obj), jsonElement)) {
                    return true;
                }
                if (obj instanceof JsonArray) {
                    Iterable iterable = (Iterable) obj;
                    ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(jsonElementToBindingValue((JsonElement) it.next()));
                    }
                    if (aggregateListContains(arrayList, jsonElement)) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public static final String camelToSnakeCase(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        return new C39412p("([A-Z])").m125853g(str, new C30985h(5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence camelToSnakeCase$lambda$0(InterfaceC39407k it) {
        AbstractC22676k.m65750j(it, "it");
        String lowerCase = ((C39410n) it).m125845c().toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        return "_".concat(lowerCase);
    }

    private static final List<JsonObject> cartItemsFromAggregate(List<? extends Object> list) {
        boolean zIsEmpty = list.isEmpty();
        C25271y c25271y = C25271y.f99162w;
        if (zIsEmpty) {
            return c25271y;
        }
        if (list.size() != 1) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                JsonObject jsonObject = obj instanceof JsonObject ? (JsonObject) obj : null;
                if (jsonObject == null || !isValidCheckoutLineItem(jsonObject)) {
                    jsonObject = null;
                }
                if (jsonObject != null) {
                    arrayList.add(jsonObject);
                }
            }
            return arrayList;
        }
        Object obj2 = list.get(0);
        if (obj2 == null) {
            return c25271y;
        }
        if (!(obj2 instanceof JsonArray)) {
            return ((obj2 instanceof JsonObject) && isValidCheckoutLineItem((JsonObject) obj2)) ? AbstractC37056f.m118958J(obj2) : c25271y;
        }
        ArrayList arrayList2 = new ArrayList();
        for (JsonElement jsonElement : (Iterable) obj2) {
            JsonObject jsonObject2 = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
            if (jsonObject2 == null || !isValidCheckoutLineItem(jsonObject2)) {
                jsonObject2 = null;
            }
            if (jsonObject2 != null) {
                arrayList2.add(jsonObject2);
            }
        }
        return arrayList2;
    }

    public static final boolean containsInlineBindingToken(String str) {
        return str != null && AbstractC39414r.m125876U(str, INLINE_BINDING_TOKEN_START, false);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final AggregateEvaluation evaluateAggregateBinding(AggregateBinding binding, Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(binding, "binding");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        List<String> states = binding.getStates();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = states.iterator();
        while (it.hasNext()) {
            Object objResolveStateRef = StateLookupKt.resolveStateRef((String) it.next(), accumulatedState);
            if (objResolveStateRef != null) {
                arrayList.add(objResolveStateRef);
            }
        }
        String operation = binding.getOperation();
        if (operation == null) {
            return new AggregateEvaluation.Update(arrayList);
        }
        String lowerCase = operation.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        boolean z4 = true;
        switch (lowerCase.hashCode()) {
            case -567445985:
                if (lowerCase.equals("contains")) {
                    return evaluateContains(arrayList, binding.getOperationParameter());
                }
                break;
            case -135761730:
                if (lowerCase.equals("identity")) {
                    return new AggregateEvaluation.Update(arrayList);
                }
                break;
            case 96727:
                if (lowerCase.equals("and")) {
                    if (arrayList.size() != binding.getStates().size()) {
                        z4 = false;
                    } else if (!arrayList.isEmpty()) {
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            if (!isTruthyJdslSelection(it3.next())) {
                                z4 = false;
                            }
                        }
                    }
                    return new AggregateEvaluation.Update(Boolean.valueOf(z4));
                }
                break;
            case 94851343:
                if (lowerCase.equals("count")) {
                    return new AggregateEvaluation.Update(Integer.valueOf(arrayList.size()));
                }
                break;
            case 111603192:
                if (lowerCase.equals("is_empty")) {
                    return new AggregateEvaluation.Update(Boolean.valueOf(evaluateEmptiness(arrayList)));
                }
                break;
            case 303432716:
                if (lowerCase.equals("is_not_empty")) {
                    return new AggregateEvaluation.Update(Boolean.valueOf(!evaluateEmptiness(arrayList)));
                }
                break;
            case 475578447:
                if (lowerCase.equals("build_checkout_with_items")) {
                    return evaluateBuildCheckoutWithItems(arrayList, binding.getOperationParameter());
                }
                break;
            case 686440065:
                if (lowerCase.equals("post_states")) {
                    return evaluatePostStates(binding, accumulatedState);
                }
                break;
            case 1240654956:
                if (lowerCase.equals("map_count")) {
                    return evaluateMapCount(arrayList, binding.getOperationParameter());
                }
                break;
            case 1976375430:
                if (lowerCase.equals("string_replace")) {
                    return evaluateStringReplace(binding, accumulatedState);
                }
                break;
        }
        return new AggregateEvaluation.Update(arrayList);
    }

    private static final AggregateEvaluation evaluateBuildCheckoutWithItems(List<? extends Object> list, JsonElement jsonElement) {
        String strM1844f;
        List<JsonObject> listCartItemsFromAggregate = cartItemsFromAggregate(list);
        if (listCartItemsFromAggregate.isEmpty()) {
            return AggregateEvaluation.NoUpdate.INSTANCE;
        }
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject == null) {
            jsonObject = new JsonObject(C25272z.f99163w);
        }
        JsonElement jsonElement2 = (JsonElement) jsonObject.get((Object) "path");
        if (jsonElement2 != null && (strM1844f = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement2))) != null) {
            if (AbstractC39414r.m125890i0(strM1844f)) {
                strM1844f = null;
            }
            if (strM1844f != null) {
                JsonElement jsonElement3 = (JsonElement) jsonObject.get((Object) "source");
                String strM1844f2 = jsonElement3 != null ? AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement3)) : null;
                JsonElement jsonElement4 = (JsonElement) jsonObject.get((Object) "method");
                String strM1844f3 = jsonElement4 != null ? AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement4)) : null;
                Object obj = jsonObject.get((Object) "payload");
                JsonObject jsonObject2 = obj instanceof JsonObject ? (JsonObject) obj : null;
                ArrayList arrayList = new ArrayList();
                for (JsonObject element : listCartItemsFromAggregate) {
                    AbstractC22676k.m65750j(element, "element");
                    arrayList.add(element);
                }
                JsonArray jsonArray = new JsonArray(arrayList);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (jsonObject2 != null) {
                    for (Map.Entry<String, JsonElement> entry : jsonObject2.entrySet()) {
                        String key = entry.getKey();
                        JsonElement element2 = entry.getValue();
                        if (!AbstractC22676k.m65745e(key, "cart_items")) {
                            AbstractC22676k.m65750j(key, "key");
                            AbstractC22676k.m65750j(element2, "element");
                        }
                    }
                }
                JsonObject jsonObject3 = new JsonObject(linkedHashMap);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                JsonPrimitive element3 = AbstractC0770m.m1841c(strM1844f);
                AbstractC22676k.m65750j(element3, "element");
                if (strM1844f2 != null) {
                    JsonPrimitive element4 = AbstractC0770m.m1841c(strM1844f2);
                    AbstractC22676k.m65750j(element4, "element");
                }
                if (strM1844f3 != null) {
                    JsonPrimitive element5 = AbstractC0770m.m1841c(strM1844f3);
                    AbstractC22676k.m65750j(element5, "element");
                }
                JsonObject jsonObject4 = new JsonObject(linkedHashMap2);
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                JsonPrimitive element6 = AbstractC0770m.m1841c("CHECKOUT_WITH_ITEMS");
                AbstractC22676k.m65750j(element6, "element");
                return new AggregateEvaluation.Update(new JsonObject(linkedHashMap3));
            }
        }
        return AggregateEvaluation.NoUpdate.INSTANCE;
    }

    private static final AggregateEvaluation evaluateContains(List<? extends Object> list, JsonElement jsonElement) {
        return (jsonElement == null || (jsonElement instanceof JsonNull)) ? AggregateEvaluation.NoUpdate.INSTANCE : new AggregateEvaluation.Update(Boolean.valueOf(aggregateListContains(list, jsonElement)));
    }

    private static final boolean evaluateEmptiness(List<? extends Object> list) {
        if (list.isEmpty()) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof JsonArray) {
                arrayList.add(obj);
            }
        }
        if (list.size() != arrayList.size()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((JsonArray) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final AggregateEvaluation evaluateMapCount(List<? extends Object> list, JsonElement jsonElement) {
        if (!(jsonElement instanceof JsonArray)) {
            return AggregateEvaluation.NoUpdate.INSTANCE;
        }
        JsonElement jsonElement2 = (JsonElement) AbstractC25265s.m74102I0(list.size(), (List) jsonElement);
        if (jsonElement2 != null && jsonElement2 != JsonNull.INSTANCE) {
            return new AggregateEvaluation.Update(jsonElementToBindingValue(jsonElement2));
        }
        return AggregateEvaluation.NoUpdate.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x00be  */
    private static final AggregateEvaluation evaluatePostStates(AggregateBinding aggregateBinding, Map<String, ? extends Object> map) {
        String strM1844f;
        String strM1844f2;
        String key;
        String str;
        JsonElement jsonElement;
        String strM1844f3;
        JsonElement operationParameter = aggregateBinding.getOperationParameter();
        JsonObject jsonObject = operationParameter instanceof JsonObject ? (JsonObject) operationParameter : null;
        if (jsonObject == null) {
            return AggregateEvaluation.NoUpdate.INSTANCE;
        }
        JsonElement jsonElement2 = (JsonElement) jsonObject.get((Object) "method");
        if (jsonElement2 != null && (strM1844f = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement2))) != null) {
            if (AbstractC39414r.m125890i0(strM1844f)) {
                strM1844f = null;
            }
            if (strM1844f != null) {
                JsonElement jsonElement3 = (JsonElement) jsonObject.get((Object) "path");
                if (jsonElement3 != null && (strM1844f2 = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement3))) != null) {
                    if (AbstractC39414r.m125890i0(strM1844f2)) {
                        strM1844f2 = null;
                    }
                    if (strM1844f2 != null) {
                        Object obj = jsonObject.get((Object) "key_map");
                        JsonObject jsonObject2 = obj instanceof JsonObject ? (JsonObject) obj : null;
                        Object obj2 = jsonObject.get((Object) "media");
                        JsonObject jsonObject3 = obj2 instanceof JsonObject ? (JsonObject) obj2 : null;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (String str2 : aggregateBinding.getStates()) {
                            Object objResolveStateRef = StateLookupKt.resolveStateRef(str2, map);
                            if (objResolveStateRef != null) {
                                if (jsonObject2 == null || (jsonElement = (JsonElement) jsonObject2.get((Object) str2)) == null || (strM1844f3 = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement))) == null) {
                                    key = AbstractC39414r.m125874S0(str2, '$');
                                } else {
                                    if (AbstractC39414r.m125890i0(strM1844f3)) {
                                        strM1844f3 = null;
                                    }
                                    if (strM1844f3 == null) {
                                        key = AbstractC39414r.m125874S0(str2, '$');
                                    } else {
                                        key = strM1844f3;
                                    }
                                }
                                JsonElement jsonElement4 = jsonObject3 != null ? (JsonElement) jsonObject3.get((Object) str2) : null;
                                JsonObject jsonObject4 = jsonElement4 instanceof JsonObject ? (JsonObject) jsonElement4 : null;
                                if (jsonObject4 == null && linkedHashMap.containsKey(key)) {
                                    str = strM1844f;
                                } else {
                                    JsonElement element = stateValueToJsonElement(objResolveStateRef);
                                    str = strM1844f;
                                    AbstractC22676k.m65750j(key, "key");
                                    AbstractC22676k.m65750j(element, "element");
                                    if (jsonObject4 != null) {
                                        linkedHashMap.put(key, jsonObject4);
                                    }
                                }
                            } else {
                                str = strM1844f;
                            }
                            strM1844f = str;
                        }
                        String str3 = strM1844f;
                        JsonObject jsonObject5 = new JsonObject(linkedHashMap2);
                        C0783z c0783z = new C0783z(0);
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        JsonPrimitive element2 = AbstractC0770m.m1841c(str3);
                        AbstractC22676k.m65750j(element2, "element");
                        JsonPrimitive element3 = AbstractC0770m.m1841c(strM1844f2);
                        AbstractC22676k.m65750j(element3, "element");
                        c0783z.m1876u("request", new JsonObject(linkedHashMap3));
                        JsonElement jsonElement5 = (JsonElement) jsonObject.get((Object) "completion_destination");
                        if (jsonElement5 != null) {
                            c0783z.m1876u("completion_destination", jsonElement5);
                        }
                        JsonElement jsonElement6 = (JsonElement) jsonObject.get((Object) "dismiss_event");
                        if (jsonElement6 != null) {
                            c0783z.m1876u("dismiss_event", jsonElement6);
                        }
                        JsonElement jsonElement7 = (JsonElement) jsonObject.get((Object) "metric_event");
                        if (jsonElement7 != null) {
                            c0783z.m1876u("metric_event", jsonElement7);
                        }
                        if (!linkedHashMap.isEmpty()) {
                            c0783z.m1876u("media", new JsonObject(linkedHashMap));
                        }
                        JsonElement jsonElement8 = (JsonElement) jsonObject.get((Object) "refresh_after_action");
                        if (jsonElement8 != null) {
                            c0783z.m1876u("refresh_after_action", jsonElement8);
                        }
                        JsonObject jsonObjectM1861e = c0783z.m1861e();
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        JsonPrimitive element4 = AbstractC0770m.m1841c("UPDATE");
                        AbstractC22676k.m65750j(element4, "element");
                        JsonObject jsonObject6 = new JsonObject(linkedHashMap4);
                        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                        return new AggregateEvaluation.Update(new JsonObject(linkedHashMap5));
                    }
                }
                return AggregateEvaluation.NoUpdate.INSTANCE;
            }
        }
        return AggregateEvaluation.NoUpdate.INSTANCE;
    }

    private static final AggregateEvaluation evaluateStringReplace(AggregateBinding aggregateBinding, Map<String, ? extends Object> map) {
        String strM1844f;
        JsonElement operationParameter = aggregateBinding.getOperationParameter();
        JsonObject jsonObject = operationParameter instanceof JsonObject ? (JsonObject) operationParameter : null;
        if (jsonObject == null) {
            return AggregateEvaluation.NoUpdate.INSTANCE;
        }
        Object obj = jsonObject.get((Object) "string_to_replace");
        JsonPrimitive jsonPrimitive = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
        return (jsonPrimitive == null || (strM1844f = AbstractC0770m.m1844f(jsonPrimitive)) == null) ? AggregateEvaluation.NoUpdate.INSTANCE : new AggregateEvaluation.Update(interpolateInlineBindings(strM1844f, map));
    }

    public static final String interpolateInlineBindings(String template, Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(template, "template");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        StringBuilder sb4 = new StringBuilder(template.length());
        int i13 = 0;
        while (i13 < template.length()) {
            int iM125888g0 = AbstractC39414r.m125888g0(template, INLINE_BINDING_TOKEN_START, i13, false, 4);
            if (iM125888g0 < 0) {
                sb4.append((CharSequence) template, i13, template.length());
                break;
            }
            int i14 = iM125888g0 + 2;
            int iM125888g1 = AbstractC39414r.m125888g0(template, INLINE_BINDING_TOKEN_END, i14, false, 4);
            if (iM125888g1 < 0) {
                sb4.append((CharSequence) template, i13, template.length());
                break;
            }
            sb4.append((CharSequence) template, i13, iM125888g0);
            String strSubstring = template.substring(i14, iM125888g1);
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
            Object objResolveStateRef = StateLookupKt.resolveStateRef(AbstractC39414r.m125869O0(strSubstring).toString(), accumulatedState);
            String bindingString = objResolveStateRef != null ? toBindingString(objResolveStateRef) : null;
            if (bindingString == null) {
                bindingString = "";
            }
            sb4.append(bindingString);
            i13 = iM125888g1 + 2;
        }
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    public static final boolean isTruthyJdslSelection(Object obj) {
        String strM1844f;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (!(obj instanceof JsonPrimitive)) {
            if (obj instanceof String) {
                return ((String) obj).equalsIgnoreCase(MediaConstraintsFactory.kValueTrue);
            }
            return (obj instanceof JsonObject) && ((JsonObject) obj).get((Object) "sku") != null;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        if (AbstractC22676k.m65745e(AbstractC0770m.m1843e(jsonPrimitive), Boolean.TRUE)) {
            return true;
        }
        return (AbstractC22676k.m65745e(AbstractC0770m.m1843e(jsonPrimitive), Boolean.FALSE) || (strM1844f = AbstractC0770m.m1844f(jsonPrimitive)) == null || !strM1844f.equalsIgnoreCase(MediaConstraintsFactory.kValueTrue)) ? false : true;
    }

    private static final boolean isValidCheckoutLineItem(JsonObject jsonObject) {
        String strM1844f;
        JsonElement jsonElement;
        Integer numJsonElementToPositiveInt;
        JsonElement jsonElement2 = (JsonElement) jsonObject.get("sku");
        return (jsonElement2 == null || (strM1844f = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement2))) == null || !(AbstractC39414r.m125890i0(strM1844f) ^ true) || (jsonElement = (JsonElement) jsonObject.get("quantity")) == null || (numJsonElementToPositiveInt = jsonElementToPositiveInt(jsonElement)) == null || numJsonElementToPositiveInt.intValue() <= 0) ? false : true;
    }

    private static final Object jsonElementToBindingValue(JsonElement jsonElement) {
        if (!(jsonElement instanceof JsonPrimitive)) {
            if ((jsonElement instanceof JsonArray) || (jsonElement instanceof JsonObject)) {
                return jsonElement;
            }
            if (AbstractC22676k.m65745e(jsonElement, JsonNull.INSTANCE)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
        if (jsonPrimitive.isString()) {
            return jsonPrimitive.getContent();
        }
        if (AbstractC0770m.m1843e(jsonPrimitive) != null) {
            return AbstractC0770m.m1843e(jsonPrimitive);
        }
        if (AbstractC0770m.m1849k(jsonPrimitive) != null) {
            return AbstractC0770m.m1849k(jsonPrimitive);
        }
        return AbstractC0770m.m1845g(jsonPrimitive) != null ? AbstractC0770m.m1845g(jsonPrimitive) : AbstractC0770m.m1844f(jsonPrimitive);
    }

    private static final Integer jsonElementToPositiveInt(JsonElement jsonElement) {
        if (jsonElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
            Long lM1849k = AbstractC0770m.m1849k(jsonPrimitive);
            if (lM1849k != null) {
                Integer numValueOf = Integer.valueOf((int) lM1849k.longValue());
                if (numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    return numValueOf;
                }
            }
            Double dM1845g = AbstractC0770m.m1845g(jsonPrimitive);
            if (dM1845g != null) {
                Integer numValueOf2 = Integer.valueOf((int) dM1845g.doubleValue());
                if (numValueOf2.intValue() > 0) {
                    return numValueOf2;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c A[PHI: r0
      0x002c: PHI (r0v4 com.whoop.design.models.binding.AggregateBinding) = (r0v3 com.whoop.design.models.binding.AggregateBinding), (r0v6 com.whoop.design.models.binding.AggregateBinding) binds: [B:10:0x0029, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:21:0x0049 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T overlayAggregateBinding(Map<String, AggregateBinding> map, String propertyName, Map<String, ? extends Object> accumulatedState, T t14, Function1 coerce) {
        AggregateBinding aggregateBinding;
        AggregateEvaluation aggregateEvaluationEvaluateAggregateBinding;
        T t15;
        T t16;
        JsonPrimitive jsonPrimitive;
        AbstractC22676k.m65750j(propertyName, "propertyName");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        AbstractC22676k.m65750j(coerce, "coerce");
        if (map == null || (aggregateBinding = map.get(propertyName)) == null) {
            aggregateBinding = map != null ? map.get(camelToSnakeCase(propertyName)) : null;
            if (aggregateBinding != null) {
                aggregateEvaluationEvaluateAggregateBinding = evaluateAggregateBinding(aggregateBinding, accumulatedState);
                if (!(aggregateEvaluationEvaluateAggregateBinding instanceof AggregateEvaluation.NoUpdate)) {
                    if (aggregateEvaluationEvaluateAggregateBinding instanceof AggregateEvaluation.Update) {
                        throw new NoWhenBranchMatchedException();
                    }
                    t15 = (T) ((AggregateEvaluation.Update) aggregateEvaluationEvaluateAggregateBinding).getValue();
                    t16 = (T) coerce.invoke(t15);
                    if (t16 == null) {
                        return t16;
                    }
                    if (t15 instanceof Boolean) {
                        return t15;
                    }
                    if (t15 instanceof JsonPrimitive) {
                        jsonPrimitive = (JsonPrimitive) t15;
                        if (AbstractC0770m.m1843e(jsonPrimitive) != null) {
                            return (T) AbstractC0770m.m1843e(jsonPrimitive);
                        }
                    }
                }
            }
        } else {
            aggregateEvaluationEvaluateAggregateBinding = evaluateAggregateBinding(aggregateBinding, accumulatedState);
            if (!(aggregateEvaluationEvaluateAggregateBinding instanceof AggregateEvaluation.NoUpdate)) {
                if (aggregateEvaluationEvaluateAggregateBinding instanceof AggregateEvaluation.Update) {
                    throw new NoWhenBranchMatchedException();
                }
                t15 = (T) ((AggregateEvaluation.Update) aggregateEvaluationEvaluateAggregateBinding).getValue();
                t16 = (T) coerce.invoke(t15);
                if (t16 == null) {
                    return t16;
                }
                if (t15 instanceof Boolean) {
                    return t15;
                }
                if (t15 instanceof JsonPrimitive) {
                    jsonPrimitive = (JsonPrimitive) t15;
                    if (AbstractC0770m.m1843e(jsonPrimitive) != null) {
                        return (T) AbstractC0770m.m1843e(jsonPrimitive);
                    }
                }
            }
        }
        return t14;
    }

    public static final Map<String, AggregateBinding> parseAggregateBindings(JsonObject element) {
        AbstractC22676k.m65750j(element, "element");
        C26463f c26463f = new C26463f();
        for (Map.Entry<String, JsonElement> entry : element.entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            JsonElement jsonElement = null;
            JsonObject jsonObject = value instanceof JsonObject ? (JsonObject) value : null;
            if (jsonObject != null) {
                Object obj = jsonObject.get((Object) "states");
                JsonArray jsonArray = obj instanceof JsonArray ? (JsonArray) obj : null;
                if (jsonArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (JsonElement jsonElement2 : jsonArray) {
                        JsonPrimitive jsonPrimitive = jsonElement2 instanceof JsonPrimitive ? (JsonPrimitive) jsonElement2 : null;
                        String content = jsonPrimitive != null ? jsonPrimitive.getContent() : null;
                        if (content != null) {
                            arrayList.add(content);
                        }
                    }
                    JsonElement jsonElement3 = (JsonElement) jsonObject.get((Object) "operation");
                    String strM1844f = jsonElement3 != null ? AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement3)) : null;
                    JsonElement jsonElement4 = (JsonElement) jsonObject.get((Object) "operation_parameter");
                    if (jsonElement4 != null && !(jsonElement4 instanceof JsonNull)) {
                        jsonElement = jsonElement4;
                    }
                    c26463f.put(key, new AggregateBinding(arrayList, strM1844f, jsonElement));
                }
            }
        }
        return c26463f.m78380b();
    }

    private static final JsonElement stateValueToJsonElement(Object obj) {
        if (obj instanceof JsonElement) {
            return (JsonElement) obj;
        }
        if (obj instanceof Boolean) {
            return AbstractC0770m.m1839a((Boolean) obj);
        }
        if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Double)) {
            return obj instanceof String ? AbstractC0770m.m1841c((String) obj) : AbstractC0770m.m1841c(obj.toString());
        }
        return AbstractC0770m.m1840b((Number) obj);
    }

    private static final String toBindingString(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof JsonPrimitive) {
            return AbstractC0770m.m1844f((JsonPrimitive) obj);
        }
        if ((obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Double)) {
            return obj.toString();
        }
        return null;
    }
}
