package com.whoop.design.models.binding;

import ad3.AbstractC0770m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import nh3.AbstractC26725a;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qr2.AbstractC30556a;
import r61.C30985h;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u001a¥\u0001\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00012\u0006\u0010\b\u001a\u00028\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n2\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\n2\u0016\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n¢\u0006\u0004\b\u000f\u0010\u0010\u001a¥\u0001\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0018\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00130\u00122\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00012\u0016\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\nH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"T", "", "", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "propertyName", "", "accumulatedState", "base", "propertyWireKey", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "serialize", "deserialize", "coerce", "overlayAggregateBinding", "(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "wholeFieldSpec", "", "Ll83/k;", "pathBindings", "mergeAggregateBindingProperty", "(Ljava/lang/Object;Ljava/lang/String;Lcom/whoop/design/models/binding/AggregateBinding;Ljava/util/List;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "value", "anyToJsonElement", "(Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DotPathBindingsKt {
    public static final JsonElement anyToJsonElement(Object obj) {
        if (obj == null) {
            return JsonNull.INSTANCE;
        }
        if (obj instanceof JsonElement) {
            return (JsonElement) obj;
        }
        if (obj instanceof Boolean) {
            return AbstractC0770m.m1839a((Boolean) obj);
        }
        if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof Float)) {
            if (obj instanceof String) {
                return AbstractC0770m.m1841c((String) obj);
            }
            if (!(obj instanceof List)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                Object element = anyToJsonElement(it.next());
                if (element == null) {
                    element = JsonNull.INSTANCE;
                }
                AbstractC22676k.m65750j(element, "element");
                arrayList.add(element);
            }
            return new JsonArray(arrayList);
        }
        return AbstractC0770m.m1840b((Number) obj);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0141  */
    /* JADX WARN: Code duplicated, block: B:59:0x014d  */
    /* JADX WARN: Code duplicated, block: B:62:0x015f  */
    /* JADX WARN: Code duplicated, block: B:64:0x016f  */
    /* JADX WARN: Code duplicated, block: B:66:0x017d  */
    /* JADX WARN: Code duplicated, block: B:81:0x017a A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T mergeAggregateBindingProperty(T t14, String propertyWireKey, AggregateBinding aggregateBinding, List<C23465k> pathBindings, Map<String, ? extends Object> accumulatedState, Function1 coerce, Function1 function1, Function1 function2) {
        AggregateEvaluation aggregateEvaluationEvaluateAggregateBinding;
        JsonElement jsonElementAnyToJsonElement;
        JsonElement nestedValue$default;
        AbstractC22676k.m65750j(propertyWireKey, "propertyWireKey");
        AbstractC22676k.m65750j(pathBindings, "pathBindings");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        AbstractC22676k.m65750j(coerce, "coerce");
        if (aggregateBinding != null || !pathBindings.isEmpty()) {
            InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("JdslBinding");
            int i13 = 6;
            if (aggregateBinding != null && !pathBindings.isEmpty()) {
                interfaceC34116nM107848a.mo85222m(AbstractC2875y.m8300m("aggregate_bindings: property \"", propertyWireKey, "\" has both a whole-field spec and path specs [", AbstractC25265s.m74110N0(pathBindings, ", ", null, null, new C30985h(i13), 30), "]; whole-field wins and path specs are ignored."), new AbstractC30556a.a[0]);
            }
            if (aggregateBinding != null) {
                AggregateEvaluation aggregateEvaluationEvaluateAggregateBinding2 = AggregateBindingKt.evaluateAggregateBinding(aggregateBinding, accumulatedState);
                if (!(aggregateEvaluationEvaluateAggregateBinding2 instanceof AggregateEvaluation.NoUpdate)) {
                    if (!(aggregateEvaluationEvaluateAggregateBinding2 instanceof AggregateEvaluation.Update)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    T t15 = (T) ((AggregateEvaluation.Update) aggregateEvaluationEvaluateAggregateBinding2).getValue();
                    T t16 = (T) coerce.invoke(t15);
                    if (t16 != null) {
                        return t16;
                    }
                    if (t15 instanceof Boolean) {
                        return t15;
                    }
                    if (t15 instanceof JsonPrimitive) {
                        JsonPrimitive jsonPrimitive = (JsonPrimitive) t15;
                        if (AbstractC0770m.m1843e(jsonPrimitive) != null) {
                            return (T) AbstractC0770m.m1843e(jsonPrimitive);
                        }
                    }
                    StringBuilder sbM32001t = AbstractC11895b.m32001t("aggregate binding apply failed (coerce): property=\"", propertyWireKey, "\" op=", aggregateBinding.getOperation(), " raw=");
                    sbM32001t.append(t15);
                    interfaceC34116nM107848a.mo85222m(sbM32001t.toString(), new AbstractC30556a.a[0]);
                    return t14;
                }
            } else {
                if (function1 == null || function2 == null) {
                    interfaceC34116nM107848a.mo85222m(AbstractC11895b.m31996o("aggregate binding path bindings present but serialize/deserialize not provided: property=\"", propertyWireKey, "\""), new AbstractC30556a.a[0]);
                    return t14;
                }
                JsonElement jsonElement = (JsonElement) function1.invoke(t14);
                if (jsonElement == null) {
                    interfaceC34116nM107848a.mo85222m(AbstractC11895b.m31996o("aggregate binding serialize returned null: property=\"", propertyWireKey, "\""), new AbstractC30556a.a[0]);
                    return t14;
                }
                JsonElement jsonElement2 = jsonElement;
                boolean z4 = false;
                for (C23465k c23465k : pathBindings) {
                    String str = (String) c23465k.f92937w;
                    AggregateBinding aggregateBinding2 = (AggregateBinding) c23465k.f92938x;
                    List listM74161z0 = AbstractC25265s.m74161z0(AbstractC39414r.m125905x0(str, new char[]{'.'}, 0, i13), 1);
                    List list = listM74161z0;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        aggregateEvaluationEvaluateAggregateBinding = AggregateBindingKt.evaluateAggregateBinding(aggregateBinding2, accumulatedState);
                        if (aggregateEvaluationEvaluateAggregateBinding instanceof AggregateEvaluation.NoUpdate) {
                            interfaceC34116nM107848a.mo85228t(AbstractC2875y.m8300m("aggregate binding NoUpdate: property=\"", propertyWireKey, "\" path_key=\"", str, "\""), new AbstractC30556a.a[0]);
                        } else {
                            AbstractC22676k.m65748h(aggregateEvaluationEvaluateAggregateBinding, "null cannot be cast to non-null type com.whoop.design.models.binding.AggregateEvaluation.Update");
                            jsonElementAnyToJsonElement = anyToJsonElement(((AggregateEvaluation.Update) aggregateEvaluationEvaluateAggregateBinding).getValue());
                            if (jsonElementAnyToJsonElement != null) {
                                nestedValue$default = JsonPathSetterKt.setNestedValue$default(jsonElement2, listM74161z0, jsonElementAnyToJsonElement, false, 4, null);
                                if (nestedValue$default == null) {
                                    interfaceC34116nM107848a.mo85222m(AbstractC2875y.m8300m("aggregate binding invalid path: property=\"", propertyWireKey, "\" path_key=\"", str, "\""), new AbstractC30556a.a[0]);
                                } else {
                                    jsonElement2 = nestedValue$default;
                                    z4 = true;
                                }
                            }
                        }
                    } else {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                aggregateEvaluationEvaluateAggregateBinding = AggregateBindingKt.evaluateAggregateBinding(aggregateBinding2, accumulatedState);
                                if (aggregateEvaluationEvaluateAggregateBinding instanceof AggregateEvaluation.NoUpdate) {
                                    interfaceC34116nM107848a.mo85228t(AbstractC2875y.m8300m("aggregate binding NoUpdate: property=\"", propertyWireKey, "\" path_key=\"", str, "\""), new AbstractC30556a.a[0]);
                                } else {
                                    AbstractC22676k.m65748h(aggregateEvaluationEvaluateAggregateBinding, "null cannot be cast to non-null type com.whoop.design.models.binding.AggregateEvaluation.Update");
                                    jsonElementAnyToJsonElement = anyToJsonElement(((AggregateEvaluation.Update) aggregateEvaluationEvaluateAggregateBinding).getValue());
                                    if (jsonElementAnyToJsonElement != null) {
                                        nestedValue$default = JsonPathSetterKt.setNestedValue$default(jsonElement2, listM74161z0, jsonElementAnyToJsonElement, false, 4, null);
                                        if (nestedValue$default == null) {
                                            interfaceC34116nM107848a.mo85222m(AbstractC2875y.m8300m("aggregate binding invalid path: property=\"", propertyWireKey, "\" path_key=\"", str, "\""), new AbstractC30556a.a[0]);
                                        } else {
                                            jsonElement2 = nestedValue$default;
                                            z4 = true;
                                        }
                                    }
                                }
                            } else if (((String) it.next()).length() == 0) {
                                interfaceC34116nM107848a.mo85222m(AbstractC2875y.m8300m("aggregate binding malformed: property=\"", propertyWireKey, "\" path_key=\"", str, "\""), new AbstractC30556a.a[0]);
                            }
                        }
                    }
                    i13 = 6;
                }
                if (z4) {
                    T t17 = (T) function2.invoke(jsonElement2);
                    if (t17 != null) {
                        return t17;
                    }
                    interfaceC34116nM107848a.mo85222m(AbstractC11895b.m31996o("aggregate binding decode failed: property=\"", propertyWireKey, "\""), new AbstractC30556a.a[0]);
                    return t14;
                }
            }
        }
        return t14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence mergeAggregateBindingProperty$lambda$0(C23465k it) {
        AbstractC22676k.m65750j(it, "it");
        return (CharSequence) it.f92937w;
    }

    public static final <T> T overlayAggregateBinding(Map<String, AggregateBinding> map, String propertyName, Map<String, ? extends Object> accumulatedState, T t14, String str, Function1 function1, Function1 function2, Function1 coerce) {
        int i13;
        AbstractC22676k.m65750j(propertyName, "propertyName");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        AbstractC22676k.m65750j(coerce, "coerce");
        if (map == null || map.isEmpty()) {
            return t14;
        }
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("JdslBinding");
        AggregateBinding aggregateBinding = map.get(propertyName);
        if (aggregateBinding == null) {
            aggregateBinding = map.get(AggregateBindingKt.camelToSnakeCase(propertyName));
        }
        AggregateBinding aggregateBinding2 = aggregateBinding;
        String str2 = str == null ? propertyName : str;
        String strConcat = str2.concat(".");
        String strM8299l = AbstractC2875y.m8299l(AggregateBindingKt.camelToSnakeCase(str2), ".");
        Set<Map.Entry<String, AggregateBinding>> setEntrySet = map.entrySet();
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (T t15 : setEntrySet) {
            String str3 = (String) ((Map.Entry) t15).getKey();
            if (AbstractC39421y.m125930O(str3, strConcat, false) || AbstractC39421y.m125930O(str3, strM8299l, false)) {
                arrayList.add(t15);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        for (Map.Entry entry : arrayList) {
            arrayList2.add(new C23465k(entry.getKey(), entry.getValue()));
        }
        List listM74152u1 = AbstractC25265s.m74152u1(arrayList2, new Comparator() { // from class: com.whoop.design.models.binding.DotPathBindingsKt$overlayAggregateBinding$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t16, T t17) {
                return AbstractC30060g.m92127q((String) ((C23465k) t16).f92937w, (String) ((C23465k) t17).f92937w);
            }
        });
        if (aggregateBinding2 != null) {
            List<String> states = aggregateBinding2.getStates();
            if ((states instanceof Collection) && states.isEmpty()) {
                i13 = 0;
            } else {
                Iterator<T> it = states.iterator();
                i13 = 0;
                while (it.hasNext()) {
                    if (StateLookupKt.resolveStateRef((String) it.next(), accumulatedState) != null && (i13 = i13 + 1) < 0) {
                        AbstractC37056f.m118976c0();
                        throw null;
                    }
                }
            }
            if (i13 != aggregateBinding2.getStates().size()) {
                interfaceC34116nM107848a.mo85228t(AbstractC26725a.m79505i(AbstractC11895b.m32001t("aggregate_binding field=", propertyName, " op=", aggregateBinding2.getOperation(), " resolved="), i13, "/", aggregateBinding2.getStates().size(), " (some states missing)"), new AbstractC30556a.a[0]);
            }
        }
        return (T) mergeAggregateBindingProperty(t14, str2, aggregateBinding2, listM74152u1, accumulatedState, coerce, function1, function2);
    }

    public static /* synthetic */ Object overlayAggregateBinding$default(Map map, String str, Map map2, Object obj, String str2, Function1 function1, Function1 function2, Function1 function3, int i13, Object obj2) {
        if ((i13 & 16) != 0) {
            str2 = null;
        }
        if ((i13 & 32) != 0) {
            function1 = null;
        }
        if ((i13 & 64) != 0) {
            function2 = null;
        }
        return overlayAggregateBinding(map, str, map2, obj, str2, function1, function2, function3);
    }
}
