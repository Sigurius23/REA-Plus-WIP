package com.whoop.design.models.items;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.BindCoercionKt;
import com.whoop.design.models.binding.BindingLoggerKt;
import com.whoop.design.models.binding.ContentBindingResolverKt;
import com.whoop.design.models.binding.ContentPathBindingsKt;
import com.whoop.design.models.binding.DotPathBindingsKt;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.design.models.binding.StateBindingDeserializerKt;
import com.whoop.design.models.binding.StateLookupKt;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import m83.AbstractC25267u;
import p097ds.AbstractC12313p;
import p549vb.AbstractC35862g;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003¨\u0006\t"}, m65681d2 = {"generatedBind", "Lcom/whoop/design/models/items/SelectableCellModel;", "contentBinding", "", "", "aggregateBindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "accumulatedState", "", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SelectableCellModelStateBindingKt {
    /* JADX WARN: Code duplicated, block: B:1014:0x1238  */
    /* JADX WARN: Code duplicated, block: B:1033:0x1278  */
    /* JADX WARN: Code duplicated, block: B:1103:0x13dc  */
    /* JADX WARN: Code duplicated, block: B:1122:0x141c  */
    /* JADX WARN: Code duplicated, block: B:1208:0x15bd  */
    /* JADX WARN: Code duplicated, block: B:1281:0x1725  */
    /* JADX WARN: Code duplicated, block: B:128:0x0222  */
    /* JADX WARN: Code duplicated, block: B:1300:0x1765  */
    /* JADX WARN: Code duplicated, block: B:1369:0x18b8  */
    /* JADX WARN: Code duplicated, block: B:1387:0x18f4  */
    /* JADX WARN: Code duplicated, block: B:1455:0x1a42  */
    /* JADX WARN: Code duplicated, block: B:1474:0x1a80  */
    /* JADX WARN: Code duplicated, block: B:147:0x0262  */
    /* JADX WARN: Code duplicated, block: B:1542:0x1bd8  */
    /* JADX WARN: Code duplicated, block: B:1568:0x1c3f A[PHI: r4
      0x1c3f: PHI (r4v140 java.lang.Object) = (r4v116 java.lang.Object), (r4v120 java.lang.Object) binds: [B:1567:0x1c3d, B:1595:0x1d05] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:219:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:238:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:307:0x0550  */
    /* JADX WARN: Code duplicated, block: B:326:0x0590  */
    /* JADX WARN: Code duplicated, block: B:395:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:414:0x0724  */
    /* JADX WARN: Code duplicated, block: B:481:0x087a  */
    /* JADX WARN: Code duplicated, block: B:500:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:572:0x0a1a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:591:0x0a5a  */
    /* JADX WARN: Code duplicated, block: B:658:0x0bb0  */
    /* JADX WARN: Code duplicated, block: B:676:0x0bef  */
    /* JADX WARN: Code duplicated, block: B:746:0x0d50  */
    /* JADX WARN: Code duplicated, block: B:764:0x0d8f  */
    /* JADX WARN: Code duplicated, block: B:834:0x0ef0  */
    /* JADX WARN: Code duplicated, block: B:852:0x0f2f  */
    /* JADX WARN: Code duplicated, block: B:924:0x108e  */
    /* JADX WARN: Code duplicated, block: B:944:0x10d0  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final SelectableCellModel generatedBind(SelectableCellModel selectableCellModel, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, ? extends Object> accumulatedState) {
        Object objOverlayContentPathBindings;
        WithGeneratedBindings withGeneratedBindingsBind;
        Object obj;
        WithGeneratedBindings withGeneratedBindingsBind2;
        Object objOverlayContentPathBindings2;
        Object obj2;
        Object obj3;
        WithGeneratedBindings withGeneratedBindingsBind3;
        Object objOverlayContentPathBindings3;
        Object obj4;
        Object obj5;
        WithGeneratedBindings withGeneratedBindingsBind4;
        Object objOverlayContentPathBindings4;
        Object obj6;
        Object obj7;
        WithGeneratedBindings withGeneratedBindingsBind5;
        Object objOverlayContentPathBindings5;
        Object obj8;
        Boolean bool;
        WithGeneratedBindings withGeneratedBindingsBind6;
        Object objOverlayContentPathBindings6;
        Object obj9;
        Object obj10;
        WithGeneratedBindings withGeneratedBindingsBind7;
        Object objOverlayContentPathBindings7;
        Object obj11;
        Boolean bool2;
        WithGeneratedBindings withGeneratedBindingsBind8;
        Object objOverlayContentPathBindings8;
        Object obj12;
        Boolean bool3;
        WithGeneratedBindings withGeneratedBindingsBind9;
        Object objOverlayContentPathBindings9;
        Object obj13;
        Boolean bool4;
        WithGeneratedBindings withGeneratedBindingsBind10;
        Object objOverlayContentPathBindings10;
        Object obj14;
        Action action;
        WithGeneratedBindings withGeneratedBindingsBind11;
        Object objOverlayContentPathBindings11;
        Object obj15;
        Object obj16;
        WithGeneratedBindings withGeneratedBindingsBind12;
        Object objOverlayContentPathBindings12;
        Object obj17;
        Action action2;
        WithGeneratedBindings withGeneratedBindingsBind13;
        Object objOverlayContentPathBindings13;
        Object obj18;
        List list;
        WithGeneratedBindings withGeneratedBindingsBind14;
        Object objOverlayContentPathBindings14;
        Object obj19;
        Object obj20;
        WithGeneratedBindings withGeneratedBindingsBind15;
        Object objOverlayContentPathBindings15;
        Object obj21;
        Object obj22;
        WithGeneratedBindings withGeneratedBindingsBind16;
        Object objOverlayContentPathBindings16;
        Map<String, String> map3;
        WithGeneratedBindings withGeneratedBindingsBind17;
        Object objOverlayContentPathBindings17;
        Map<String, AggregateBinding> map4;
        WithGeneratedBindings withGeneratedBindingsBind18;
        Object obj23;
        Object objOverlayContentPathBindings18;
        AbstractC22676k.m65750j(selectableCellModel, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if ((map == null || map.isEmpty()) && ((map2 == null || map2.isEmpty()) && accumulatedState.isEmpty())) {
            return selectableCellModel;
        }
        Object id4 = selectableCellModel.getId();
        if (id4 == null) {
            objOverlayContentPathBindings = null;
        } else if (id4 instanceof WithGeneratedBindings) {
            Object objBind = ((WithGeneratedBindings) id4).bind(accumulatedState);
            if (!(objBind instanceof String)) {
                objBind = null;
            }
            objOverlayContentPathBindings = (String) objBind;
            if (objOverlayContentPathBindings == null) {
                objOverlayContentPathBindings = id4;
            }
        } else if (id4 instanceof List) {
            Iterable iterable = (Iterable) id4;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            for (Object obj24 : iterable) {
                WithGeneratedBindings withGeneratedBindings = obj24 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj24 : null;
                if (withGeneratedBindings != null && (withGeneratedBindingsBind = withGeneratedBindings.bind(accumulatedState)) != null) {
                    obj24 = withGeneratedBindingsBind;
                }
                arrayList.add(obj24);
            }
            objOverlayContentPathBindings = (String) arrayList;
        } else {
            objOverlayContentPathBindings = id4;
        }
        String strResolveContentBindingKey = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "id") : null;
        Class cls = Byte.TYPE;
        Class cls2 = Short.TYPE;
        Class cls3 = Float.TYPE;
        Class cls4 = Double.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        if (strResolveContentBindingKey != null) {
            Object objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
            if (objResolveStateRef != null) {
                BindingLoggerKt.logContentBinding("id", strResolveContentBindingKey, objResolveStateRef);
                Object objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                if ((objUnwrapForCoercion instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                    objOverlayContentPathBindings = null;
                } else {
                    objOverlayContentPathBindings = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (objOverlayContentPathBindings == null) {
                        objOverlayContentPathBindings = null;
                    } else if (objOverlayContentPathBindings instanceof JsonElement) {
                        JsonElement jsonElement = (JsonElement) objOverlayContentPathBindings;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement);
                        } catch (Exception unused) {
                            objOverlayContentPathBindings = null;
                        }
                    } else {
                        boolean z4 = objOverlayContentPathBindings instanceof String;
                        if (!z4) {
                            if (objOverlayContentPathBindings instanceof Number) {
                                InterfaceC21461d interfaceC21461dM65688a = AbstractC22671h0.m65688a(String.class);
                                if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls6))) {
                                    objOverlayContentPathBindings = (String) Integer.valueOf(((Number) objOverlayContentPathBindings).intValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls5))) {
                                    objOverlayContentPathBindings = (String) Long.valueOf(((Number) objOverlayContentPathBindings).longValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls4))) {
                                    objOverlayContentPathBindings = (String) Double.valueOf(((Number) objOverlayContentPathBindings).doubleValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls3))) {
                                    objOverlayContentPathBindings = (String) Float.valueOf(((Number) objOverlayContentPathBindings).floatValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls2))) {
                                    objOverlayContentPathBindings = (String) Short.valueOf(((Number) objOverlayContentPathBindings).shortValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls))) {
                                    objOverlayContentPathBindings = (String) Byte.valueOf(((Number) objOverlayContentPathBindings).byteValue());
                                } else {
                                    objOverlayContentPathBindings = null;
                                }
                            } else if (z4) {
                                JsonPrimitive jsonPrimitiveM1841c = AbstractC0770m.m1841c((String) objOverlayContentPathBindings);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objOverlayContentPathBindings = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c);
                                } catch (Exception unused2) {
                                    objOverlayContentPathBindings = null;
                                }
                                if (objOverlayContentPathBindings == null) {
                                    objOverlayContentPathBindings = null;
                                }
                            } else {
                                objOverlayContentPathBindings = null;
                            }
                        }
                    }
                    if (objOverlayContentPathBindings == null) {
                        objOverlayContentPathBindings = id4;
                    }
                }
            }
        } else if (objOverlayContentPathBindings != null) {
            objOverlayContentPathBindings = ContentPathBindingsKt.overlayContentPathBindings(map, "id", accumulatedState, objOverlayContentPathBindings, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$1
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj25) {
                    return invoke((String) obj25);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(String v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(StringSerializer.INSTANCE, v13);
                    } catch (Exception unused3) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$2
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
                @Override // p715kotlin.jvm.functions.Function1
                public final String invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                    } catch (Exception unused3) {
                        return null;
                    }
                }
            });
        }
        String id5 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "id", accumulatedState, objOverlayContentPathBindings, "id", new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$3
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj25) {
                return invoke((String) obj25);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str, interfaceC37138cM122336d);
                } catch (Exception unused3) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$4
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                } catch (Exception unused3) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$5
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj25) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj25);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement2 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement2);
                    } catch (Exception unused3) {
                        return null;
                    }
                }
                boolean z13 = UnwrapForCoercion instanceof String;
                if (z13) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!z13) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c2);
                    } catch (Exception unused4) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (String) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (String) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (String) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (String) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (String) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (String) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (id5 == null) {
            id5 = selectableCellModel.getId();
        }
        String str = id5;
        Object title = selectableCellModel.getTitle();
        if (title == null) {
            objOverlayContentPathBindings2 = null;
        } else {
            if (title instanceof WithGeneratedBindings) {
                Object objBind2 = ((WithGeneratedBindings) title).bind(accumulatedState);
                if (!(objBind2 instanceof String)) {
                    objBind2 = null;
                }
                obj = (String) objBind2;
                if (obj == null) {
                    obj = title;
                }
            } else if (title instanceof List) {
                Iterable iterable2 = (Iterable) title;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
                for (Object obj25 : iterable2) {
                    WithGeneratedBindings withGeneratedBindings2 = obj25 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj25 : null;
                    if (withGeneratedBindings2 != null && (withGeneratedBindingsBind2 = withGeneratedBindings2.bind(accumulatedState)) != null) {
                        obj25 = withGeneratedBindingsBind2;
                    }
                    arrayList2.add(obj25);
                }
                obj = (String) arrayList2;
            } else {
                obj = title;
            }
            objOverlayContentPathBindings2 = obj;
        }
        String strResolveContentBindingKey2 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "title") : null;
        if (strResolveContentBindingKey2 != null) {
            Object objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
            if (objResolveStateRef2 != null) {
                BindingLoggerKt.logContentBinding("title", strResolveContentBindingKey2, objResolveStateRef2);
                Object objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                if ((objUnwrapForCoercion2 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion2)) {
                    obj2 = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj2), Boolean.TRUE)) {
                        objOverlayContentPathBindings2 = null;
                    }
                } else {
                    obj2 = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
                }
                objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                if (objOverlayContentPathBindings2 == null) {
                    objOverlayContentPathBindings2 = null;
                } else if (objOverlayContentPathBindings2 instanceof JsonElement) {
                    JsonElement jsonElement2 = (JsonElement) objOverlayContentPathBindings2;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement2);
                    } catch (Exception unused3) {
                        objOverlayContentPathBindings2 = null;
                    }
                } else {
                    boolean z13 = objOverlayContentPathBindings2 instanceof String;
                    if (!z13) {
                        if (objOverlayContentPathBindings2 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a2 = AbstractC22671h0.m65688a(String.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings2 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings2 = (String) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings2 = (String) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings2 = (String) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings2 = (String) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings2 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                            } else {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (z13) {
                            JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c2);
                            } catch (Exception unused4) {
                                objOverlayContentPathBindings2 = null;
                            }
                            if (objOverlayContentPathBindings2 == null) {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else {
                            objOverlayContentPathBindings2 = null;
                        }
                    }
                }
                if (objOverlayContentPathBindings2 == null) {
                    objOverlayContentPathBindings2 = title;
                }
            } else {
                obj2 = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
            }
        } else {
            obj2 = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
            if (objOverlayContentPathBindings2 != null) {
                objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(map, "title", accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$6
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj26) {
                        return invoke((String) obj26);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(String v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(StringSerializer.INSTANCE, v13);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$7
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final String invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj26 = obj2;
        String title2 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "title", accumulatedState, objOverlayContentPathBindings2, "title", new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$8
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj27) {
                return invoke((String) obj27);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str2) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str2, interfaceC37138cM122336d);
                } catch (Exception unused5) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$9
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                } catch (Exception unused5) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$10
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj27) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj27);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement3 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement3);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
                boolean z14 = UnwrapForCoercion instanceof String;
                if (z14) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!z14) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c3);
                    } catch (Exception unused6) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (String) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (String) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (String) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (String) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (String) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (String) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (title2 == null) {
            title2 = selectableCellModel.getTitle();
        }
        String str2 = title2;
        Object subtitle = selectableCellModel.getSubtitle();
        if (subtitle == null) {
            objOverlayContentPathBindings3 = null;
        } else {
            if (subtitle instanceof WithGeneratedBindings) {
                Object objBind3 = ((WithGeneratedBindings) subtitle).bind(accumulatedState);
                if (!(objBind3 instanceof String)) {
                    objBind3 = null;
                }
                obj3 = (String) objBind3;
                if (obj3 == null) {
                    obj3 = subtitle;
                }
            } else if (subtitle instanceof List) {
                Iterable iterable3 = (Iterable) subtitle;
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable3, 10));
                for (Object obj27 : iterable3) {
                    WithGeneratedBindings withGeneratedBindings3 = obj27 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj27 : null;
                    if (withGeneratedBindings3 != null && (withGeneratedBindingsBind3 = withGeneratedBindings3.bind(accumulatedState)) != null) {
                        obj27 = withGeneratedBindingsBind3;
                    }
                    arrayList3.add(obj27);
                }
                obj3 = (String) arrayList3;
            } else {
                obj3 = subtitle;
            }
            objOverlayContentPathBindings3 = obj3;
        }
        String strResolveContentBindingKey3 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "subtitle") : null;
        if (strResolveContentBindingKey3 != null) {
            Object objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
            if (objResolveStateRef3 != null) {
                BindingLoggerKt.logContentBinding("subtitle", strResolveContentBindingKey3, objResolveStateRef3);
                Object objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if ((objUnwrapForCoercion3 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion3)) {
                    obj4 = obj26;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj4), Boolean.TRUE)) {
                        objOverlayContentPathBindings3 = null;
                    }
                } else {
                    obj4 = obj26;
                }
                objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if (objOverlayContentPathBindings3 == null) {
                    objOverlayContentPathBindings3 = null;
                } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                    JsonElement jsonElement3 = (JsonElement) objOverlayContentPathBindings3;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement3);
                    } catch (Exception unused5) {
                        objOverlayContentPathBindings3 = null;
                    }
                } else {
                    boolean z14 = objOverlayContentPathBindings3 instanceof String;
                    if (!z14) {
                        if (objOverlayContentPathBindings3 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a3 = AbstractC22671h0.m65688a(String.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings3 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings3 = (String) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings3 = (String) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings3 = (String) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings3 = (String) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings3 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                            } else {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else if (z14) {
                            JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c3);
                            } catch (Exception unused6) {
                                objOverlayContentPathBindings3 = null;
                            }
                            if (objOverlayContentPathBindings3 == null) {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else {
                            objOverlayContentPathBindings3 = null;
                        }
                    }
                }
                if (objOverlayContentPathBindings3 == null) {
                    objOverlayContentPathBindings3 = subtitle;
                }
            } else {
                obj4 = obj26;
            }
        } else {
            obj4 = obj26;
            if (objOverlayContentPathBindings3 != null) {
                objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(map, "subtitle", accumulatedState, objOverlayContentPathBindings3, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$11
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj28) {
                        return invoke((String) obj28);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(String v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(StringSerializer.INSTANCE, v13);
                        } catch (Exception unused7) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$12
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final String invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                        } catch (Exception unused7) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj28 = obj4;
        String str3 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "subtitle", accumulatedState, objOverlayContentPathBindings3, "subtitle", new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$13
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj29) {
                return invoke((String) obj29);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str4) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str4, interfaceC37138cM122336d);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$14
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$15
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj29) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj29);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement4 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement4);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
                boolean z15 = UnwrapForCoercion instanceof String;
                if (z15) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!z15) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c4);
                    } catch (Exception unused8) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (String) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (String) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (String) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (String) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (String) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (String) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        Object leftIcon = selectableCellModel.getLeftIcon();
        if (leftIcon == null) {
            objOverlayContentPathBindings4 = null;
        } else {
            if (leftIcon instanceof WithGeneratedBindings) {
                Object objBind4 = ((WithGeneratedBindings) leftIcon).bind(accumulatedState);
                if (!(objBind4 instanceof String)) {
                    objBind4 = null;
                }
                obj5 = (String) objBind4;
                if (obj5 == null) {
                    obj5 = leftIcon;
                }
            } else if (leftIcon instanceof List) {
                Iterable iterable4 = (Iterable) leftIcon;
                ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable4, 10));
                for (Object obj29 : iterable4) {
                    WithGeneratedBindings withGeneratedBindings4 = obj29 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj29 : null;
                    if (withGeneratedBindings4 != null && (withGeneratedBindingsBind4 = withGeneratedBindings4.bind(accumulatedState)) != null) {
                        obj29 = withGeneratedBindingsBind4;
                    }
                    arrayList4.add(obj29);
                }
                obj5 = (String) arrayList4;
            } else {
                obj5 = leftIcon;
            }
            objOverlayContentPathBindings4 = obj5;
        }
        String strResolveContentBindingKey4 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "leftIcon") : null;
        if (strResolveContentBindingKey4 != null) {
            Object objResolveStateRef4 = StateLookupKt.resolveStateRef(strResolveContentBindingKey4, accumulatedState);
            if (objResolveStateRef4 != null) {
                BindingLoggerKt.logContentBinding("leftIcon", strResolveContentBindingKey4, objResolveStateRef4);
                Object objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if ((objUnwrapForCoercion4 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion4)) {
                    obj6 = obj28;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj6), Boolean.TRUE)) {
                        objOverlayContentPathBindings4 = null;
                    }
                } else {
                    obj6 = obj28;
                }
                objOverlayContentPathBindings4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if (objOverlayContentPathBindings4 == null) {
                    objOverlayContentPathBindings4 = null;
                } else if (objOverlayContentPathBindings4 instanceof JsonElement) {
                    JsonElement jsonElement4 = (JsonElement) objOverlayContentPathBindings4;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement4);
                    } catch (Exception unused7) {
                        objOverlayContentPathBindings4 = null;
                    }
                } else {
                    boolean z15 = objOverlayContentPathBindings4 instanceof String;
                    if (!z15) {
                        if (objOverlayContentPathBindings4 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a4 = AbstractC22671h0.m65688a(String.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings4 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings4 = (String) Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings4 = (String) Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings4 = (String) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings4 = (String) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings4 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                            } else {
                                objOverlayContentPathBindings4 = null;
                            }
                        } else if (z15) {
                            JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings4);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c4);
                            } catch (Exception unused8) {
                                objOverlayContentPathBindings4 = null;
                            }
                            if (objOverlayContentPathBindings4 == null) {
                                objOverlayContentPathBindings4 = null;
                            }
                        } else {
                            objOverlayContentPathBindings4 = null;
                        }
                    }
                }
                if (objOverlayContentPathBindings4 == null) {
                    objOverlayContentPathBindings4 = leftIcon;
                }
            } else {
                obj6 = obj28;
            }
        } else {
            obj6 = obj28;
            if (objOverlayContentPathBindings4 != null) {
                objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(map, "leftIcon", accumulatedState, objOverlayContentPathBindings4, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$16
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj30) {
                        return invoke((String) obj30);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(String v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(StringSerializer.INSTANCE, v13);
                        } catch (Exception unused9) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$17
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final String invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                        } catch (Exception unused9) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj30 = obj6;
        String str4 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "leftIcon", accumulatedState, objOverlayContentPathBindings4, "leftIcon", new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$18
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj31) {
                return invoke((String) obj31);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str5) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str5, interfaceC37138cM122336d);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$19
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$20
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj31) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj31);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement5 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement5);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
                boolean z16 = UnwrapForCoercion instanceof String;
                if (z16) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!z16) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c5);
                    } catch (Exception unused10) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (String) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (String) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (String) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (String) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (String) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (String) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        Object leftImageUrl = selectableCellModel.getLeftImageUrl();
        if (leftImageUrl == null) {
            objOverlayContentPathBindings5 = null;
        } else {
            if (leftImageUrl instanceof WithGeneratedBindings) {
                Object objBind5 = ((WithGeneratedBindings) leftImageUrl).bind(accumulatedState);
                if (!(objBind5 instanceof String)) {
                    objBind5 = null;
                }
                obj7 = (String) objBind5;
                if (obj7 == null) {
                    obj7 = leftImageUrl;
                }
            } else if (leftImageUrl instanceof List) {
                Iterable iterable5 = (Iterable) leftImageUrl;
                ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(iterable5, 10));
                for (Object obj31 : iterable5) {
                    WithGeneratedBindings withGeneratedBindings5 = obj31 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj31 : null;
                    if (withGeneratedBindings5 != null && (withGeneratedBindingsBind5 = withGeneratedBindings5.bind(accumulatedState)) != null) {
                        obj31 = withGeneratedBindingsBind5;
                    }
                    arrayList5.add(obj31);
                }
                obj7 = (String) arrayList5;
            } else {
                obj7 = leftImageUrl;
            }
            objOverlayContentPathBindings5 = obj7;
        }
        String strResolveContentBindingKey5 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "leftImageUrl") : null;
        if (strResolveContentBindingKey5 != null) {
            Object objResolveStateRef5 = StateLookupKt.resolveStateRef(strResolveContentBindingKey5, accumulatedState);
            if (objResolveStateRef5 != null) {
                BindingLoggerKt.logContentBinding("leftImageUrl", strResolveContentBindingKey5, objResolveStateRef5);
                Object objUnwrapForCoercion5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                if ((objUnwrapForCoercion5 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion5)) {
                    obj8 = obj30;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj8), Boolean.TRUE)) {
                        objOverlayContentPathBindings5 = null;
                    }
                } else {
                    obj8 = obj30;
                }
                objOverlayContentPathBindings5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                if (objOverlayContentPathBindings5 == null) {
                    objOverlayContentPathBindings5 = null;
                } else if (objOverlayContentPathBindings5 instanceof JsonElement) {
                    JsonElement jsonElement5 = (JsonElement) objOverlayContentPathBindings5;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement5);
                    } catch (Exception unused9) {
                        objOverlayContentPathBindings5 = null;
                    }
                } else {
                    boolean z16 = objOverlayContentPathBindings5 instanceof String;
                    if (!z16) {
                        if (objOverlayContentPathBindings5 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a5 = AbstractC22671h0.m65688a(String.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings5 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings5).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings5 = (String) Long.valueOf(((Number) objOverlayContentPathBindings5).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings5 = (String) Double.valueOf(((Number) objOverlayContentPathBindings5).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings5 = (String) Float.valueOf(((Number) objOverlayContentPathBindings5).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings5 = (String) Short.valueOf(((Number) objOverlayContentPathBindings5).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings5 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings5).byteValue());
                            } else {
                                objOverlayContentPathBindings5 = null;
                            }
                        } else if (z16) {
                            JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings5);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c5);
                            } catch (Exception unused10) {
                                objOverlayContentPathBindings5 = null;
                            }
                            if (objOverlayContentPathBindings5 == null) {
                                objOverlayContentPathBindings5 = null;
                            }
                        } else {
                            objOverlayContentPathBindings5 = null;
                        }
                    }
                }
                if (objOverlayContentPathBindings5 == null) {
                    objOverlayContentPathBindings5 = leftImageUrl;
                }
            } else {
                obj8 = obj30;
            }
        } else {
            obj8 = obj30;
            if (objOverlayContentPathBindings5 != null) {
                objOverlayContentPathBindings5 = ContentPathBindingsKt.overlayContentPathBindings(map, "leftImageUrl", accumulatedState, objOverlayContentPathBindings5, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$21
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj32) {
                        return invoke((String) obj32);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(String v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(StringSerializer.INSTANCE, v13);
                        } catch (Exception unused11) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$22
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final String invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                        } catch (Exception unused11) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj32 = obj8;
        String str5 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "leftImageUrl", accumulatedState, objOverlayContentPathBindings5, "leftImageUrl", new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$23
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj33) {
                return invoke((String) obj33);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str6) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str6, interfaceC37138cM122336d);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$24
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$25
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj33) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj33);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement6 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement6);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
                boolean z17 = UnwrapForCoercion instanceof String;
                if (z17) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!z17) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c6);
                    } catch (Exception unused12) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (String) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (String) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (String) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (String) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (String) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (String) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        Object objValueOf = Boolean.valueOf(selectableCellModel.getShouldTintLeftImage());
        if (objValueOf instanceof WithGeneratedBindings) {
            Object objBind6 = ((WithGeneratedBindings) objValueOf).bind(accumulatedState);
            if (!(objBind6 instanceof Boolean)) {
                objBind6 = null;
            }
            bool = (Boolean) objBind6;
            if (bool == null) {
                objOverlayContentPathBindings6 = objValueOf;
            } else {
                objOverlayContentPathBindings6 = bool;
            }
        } else if (objValueOf instanceof List) {
            Iterable iterable6 = (Iterable) objValueOf;
            ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(iterable6, 10));
            for (Object obj33 : iterable6) {
                WithGeneratedBindings withGeneratedBindings6 = obj33 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj33 : null;
                if (withGeneratedBindings6 != null && (withGeneratedBindingsBind6 = withGeneratedBindings6.bind(accumulatedState)) != null) {
                    obj33 = withGeneratedBindingsBind6;
                }
                arrayList6.add(obj33);
            }
            bool = (Boolean) arrayList6;
            objOverlayContentPathBindings6 = bool;
        } else {
            objOverlayContentPathBindings6 = objValueOf;
        }
        String strResolveContentBindingKey6 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "shouldTintLeftImage") : null;
        if (strResolveContentBindingKey6 != null) {
            Object objResolveStateRef6 = StateLookupKt.resolveStateRef(strResolveContentBindingKey6, accumulatedState);
            if (objResolveStateRef6 != null) {
                BindingLoggerKt.logContentBinding("shouldTintLeftImage", strResolveContentBindingKey6, objResolveStateRef6);
                Object objUnwrapForCoercion6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef6);
                if ((objUnwrapForCoercion6 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion6)) {
                    obj9 = obj32;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj9), Boolean.TRUE)) {
                        objOverlayContentPathBindings6 = null;
                    }
                } else {
                    obj9 = obj32;
                }
                objOverlayContentPathBindings6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef6);
                if (objOverlayContentPathBindings6 == null) {
                    objOverlayContentPathBindings6 = null;
                } else if (objOverlayContentPathBindings6 instanceof JsonElement) {
                    JsonElement jsonElement6 = (JsonElement) objOverlayContentPathBindings6;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings6 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement6);
                    } catch (Exception unused11) {
                        objOverlayContentPathBindings6 = null;
                    }
                } else if (!(objOverlayContentPathBindings6 instanceof Boolean)) {
                    if (objOverlayContentPathBindings6 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a6 = AbstractC22671h0.m65688a(Boolean.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings6 = (Boolean) Integer.valueOf(((Number) objOverlayContentPathBindings6).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings6 = (Boolean) Long.valueOf(((Number) objOverlayContentPathBindings6).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings6 = (Boolean) Double.valueOf(((Number) objOverlayContentPathBindings6).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings6 = (Boolean) Float.valueOf(((Number) objOverlayContentPathBindings6).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings6 = (Boolean) Short.valueOf(((Number) objOverlayContentPathBindings6).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings6 = (Boolean) Byte.valueOf(((Number) objOverlayContentPathBindings6).byteValue());
                        } else {
                            objOverlayContentPathBindings6 = null;
                        }
                    } else if (objOverlayContentPathBindings6 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings6);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings6 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c6);
                        } catch (Exception unused12) {
                            objOverlayContentPathBindings6 = null;
                        }
                        if (objOverlayContentPathBindings6 == null) {
                            objOverlayContentPathBindings6 = null;
                        }
                    } else {
                        objOverlayContentPathBindings6 = null;
                    }
                }
                if (objOverlayContentPathBindings6 == null) {
                    objOverlayContentPathBindings6 = objValueOf;
                }
            } else {
                obj9 = obj32;
            }
        } else {
            obj9 = obj32;
            objOverlayContentPathBindings6 = ContentPathBindingsKt.overlayContentPathBindings(map, "shouldTintLeftImage", accumulatedState, objOverlayContentPathBindings6, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$26
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj34) {
                    return invoke((Boolean) obj34);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Boolean v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(BooleanSerializer.INSTANCE, v13);
                    } catch (Exception unused13) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$27
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Boolean invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                    } catch (Exception unused13) {
                        return null;
                    }
                }
            });
        }
        Object obj34 = obj9;
        Boolean bool5 = (Boolean) DotPathBindingsKt.overlayAggregateBinding(map2, "shouldTintLeftImage", accumulatedState, objOverlayContentPathBindings6, "shouldTintLeftImage", new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$28
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj35) {
                return invoke((Boolean) obj35);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Boolean bool6) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(BooleanSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, bool6, interfaceC37138cM122336d);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$29
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Boolean invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$30
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Boolean, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Boolean, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj35) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj35);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement7 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement7);
                    } catch (Exception unused13) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof Boolean) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c7 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c7);
                    } catch (Exception unused14) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Boolean.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (Boolean) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (Boolean) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (Boolean) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (Boolean) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (Boolean) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (Boolean) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        boolean zBooleanValue = bool5 != null ? bool5.booleanValue() : selectableCellModel.getShouldTintLeftImage();
        Object selectionStyle = selectableCellModel.getSelectionStyle();
        if (selectionStyle == null) {
            objOverlayContentPathBindings7 = null;
        } else {
            if (selectionStyle instanceof WithGeneratedBindings) {
                Object objBind7 = ((WithGeneratedBindings) selectionStyle).bind(accumulatedState);
                if (!(objBind7 instanceof String)) {
                    objBind7 = null;
                }
                obj10 = (String) objBind7;
                if (obj10 == null) {
                    obj10 = selectionStyle;
                }
            } else if (selectionStyle instanceof List) {
                Iterable iterable7 = (Iterable) selectionStyle;
                ArrayList arrayList7 = new ArrayList(AbstractC25267u.m74163i0(iterable7, 10));
                for (Object obj35 : iterable7) {
                    WithGeneratedBindings withGeneratedBindings7 = obj35 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj35 : null;
                    if (withGeneratedBindings7 != null && (withGeneratedBindingsBind7 = withGeneratedBindings7.bind(accumulatedState)) != null) {
                        obj35 = withGeneratedBindingsBind7;
                    }
                    arrayList7.add(obj35);
                }
                obj10 = (String) arrayList7;
            } else {
                obj10 = selectionStyle;
            }
            objOverlayContentPathBindings7 = obj10;
        }
        String strResolveContentBindingKey7 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "selectionStyle") : null;
        if (strResolveContentBindingKey7 != null) {
            Object objResolveStateRef7 = StateLookupKt.resolveStateRef(strResolveContentBindingKey7, accumulatedState);
            if (objResolveStateRef7 != null) {
                BindingLoggerKt.logContentBinding("selectionStyle", strResolveContentBindingKey7, objResolveStateRef7);
                Object objUnwrapForCoercion7 = BindCoercionKt.unwrapForCoercion(objResolveStateRef7);
                if ((objUnwrapForCoercion7 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion7)) {
                    obj11 = obj34;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj11), Boolean.TRUE)) {
                        objOverlayContentPathBindings7 = null;
                    }
                } else {
                    obj11 = obj34;
                }
                objOverlayContentPathBindings7 = BindCoercionKt.unwrapForCoercion(objResolveStateRef7);
                if (objOverlayContentPathBindings7 == null) {
                    objOverlayContentPathBindings7 = null;
                } else if (objOverlayContentPathBindings7 instanceof JsonElement) {
                    JsonElement jsonElement7 = (JsonElement) objOverlayContentPathBindings7;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings7 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement7);
                    } catch (Exception unused13) {
                        objOverlayContentPathBindings7 = null;
                    }
                } else {
                    boolean z17 = objOverlayContentPathBindings7 instanceof String;
                    if (!z17) {
                        if (objOverlayContentPathBindings7 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a7 = AbstractC22671h0.m65688a(String.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings7 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings7).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings7 = (String) Long.valueOf(((Number) objOverlayContentPathBindings7).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings7 = (String) Double.valueOf(((Number) objOverlayContentPathBindings7).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings7 = (String) Float.valueOf(((Number) objOverlayContentPathBindings7).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings7 = (String) Short.valueOf(((Number) objOverlayContentPathBindings7).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings7 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings7).byteValue());
                            } else {
                                objOverlayContentPathBindings7 = null;
                            }
                        } else if (z17) {
                            JsonPrimitive jsonPrimitiveM1841c7 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings7);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings7 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c7);
                            } catch (Exception unused14) {
                                objOverlayContentPathBindings7 = null;
                            }
                            if (objOverlayContentPathBindings7 == null) {
                                objOverlayContentPathBindings7 = null;
                            }
                        } else {
                            objOverlayContentPathBindings7 = null;
                        }
                    }
                }
                if (objOverlayContentPathBindings7 == null) {
                    objOverlayContentPathBindings7 = selectionStyle;
                }
            } else {
                obj11 = obj34;
            }
        } else {
            obj11 = obj34;
            if (objOverlayContentPathBindings7 != null) {
                objOverlayContentPathBindings7 = ContentPathBindingsKt.overlayContentPathBindings(map, "selectionStyle", accumulatedState, objOverlayContentPathBindings7, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$31
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj36) {
                        return invoke((String) obj36);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(String v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(StringSerializer.INSTANCE, v13);
                        } catch (Exception unused15) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$32
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final String invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                        } catch (Exception unused15) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj36 = obj11;
        String str6 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "selectionStyle", accumulatedState, objOverlayContentPathBindings7, "selectionStyle", new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$33
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj37) {
                return invoke((String) obj37);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str7) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str7, interfaceC37138cM122336d);
                } catch (Exception unused15) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$34
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                } catch (Exception unused15) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$35
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj37) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj37);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement8 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement8);
                    } catch (Exception unused15) {
                        return null;
                    }
                }
                boolean z18 = UnwrapForCoercion instanceof String;
                if (z18) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!z18) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c8 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c8);
                    } catch (Exception unused16) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (String) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (String) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (String) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (String) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (String) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (String) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        Object objValueOf2 = Boolean.valueOf(selectableCellModel.getSelected());
        if (objValueOf2 instanceof WithGeneratedBindings) {
            Object objBind8 = ((WithGeneratedBindings) objValueOf2).bind(accumulatedState);
            if (!(objBind8 instanceof Boolean)) {
                objBind8 = null;
            }
            bool2 = (Boolean) objBind8;
            if (bool2 == null) {
                objOverlayContentPathBindings8 = objValueOf2;
            } else {
                objOverlayContentPathBindings8 = bool2;
            }
        } else if (objValueOf2 instanceof List) {
            Iterable iterable8 = (Iterable) objValueOf2;
            ArrayList arrayList8 = new ArrayList(AbstractC25267u.m74163i0(iterable8, 10));
            for (Object obj37 : iterable8) {
                WithGeneratedBindings withGeneratedBindings8 = obj37 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj37 : null;
                if (withGeneratedBindings8 != null && (withGeneratedBindingsBind8 = withGeneratedBindings8.bind(accumulatedState)) != null) {
                    obj37 = withGeneratedBindingsBind8;
                }
                arrayList8.add(obj37);
            }
            bool2 = (Boolean) arrayList8;
            objOverlayContentPathBindings8 = bool2;
        } else {
            objOverlayContentPathBindings8 = objValueOf2;
        }
        String strResolveContentBindingKey8 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "selected") : null;
        if (strResolveContentBindingKey8 != null) {
            Object objResolveStateRef8 = StateLookupKt.resolveStateRef(strResolveContentBindingKey8, accumulatedState);
            if (objResolveStateRef8 != null) {
                BindingLoggerKt.logContentBinding("selected", strResolveContentBindingKey8, objResolveStateRef8);
                Object objUnwrapForCoercion8 = BindCoercionKt.unwrapForCoercion(objResolveStateRef8);
                if ((objUnwrapForCoercion8 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion8)) {
                    obj12 = obj36;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj12), Boolean.TRUE)) {
                        objOverlayContentPathBindings8 = null;
                    }
                } else {
                    obj12 = obj36;
                }
                objOverlayContentPathBindings8 = BindCoercionKt.unwrapForCoercion(objResolveStateRef8);
                if (objOverlayContentPathBindings8 == null) {
                    objOverlayContentPathBindings8 = null;
                } else if (objOverlayContentPathBindings8 instanceof JsonElement) {
                    JsonElement jsonElement8 = (JsonElement) objOverlayContentPathBindings8;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings8 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement8);
                    } catch (Exception unused15) {
                        objOverlayContentPathBindings8 = null;
                    }
                } else if (!(objOverlayContentPathBindings8 instanceof Boolean)) {
                    if (objOverlayContentPathBindings8 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a8 = AbstractC22671h0.m65688a(Boolean.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings8 = (Boolean) Integer.valueOf(((Number) objOverlayContentPathBindings8).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings8 = (Boolean) Long.valueOf(((Number) objOverlayContentPathBindings8).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings8 = (Boolean) Double.valueOf(((Number) objOverlayContentPathBindings8).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings8 = (Boolean) Float.valueOf(((Number) objOverlayContentPathBindings8).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings8 = (Boolean) Short.valueOf(((Number) objOverlayContentPathBindings8).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings8 = (Boolean) Byte.valueOf(((Number) objOverlayContentPathBindings8).byteValue());
                        } else {
                            objOverlayContentPathBindings8 = null;
                        }
                    } else if (objOverlayContentPathBindings8 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c8 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings8);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings8 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c8);
                        } catch (Exception unused16) {
                            objOverlayContentPathBindings8 = null;
                        }
                        if (objOverlayContentPathBindings8 == null) {
                            objOverlayContentPathBindings8 = null;
                        }
                    } else {
                        objOverlayContentPathBindings8 = null;
                    }
                }
                if (objOverlayContentPathBindings8 == null) {
                    objOverlayContentPathBindings8 = objValueOf2;
                }
            } else {
                obj12 = obj36;
            }
        } else {
            obj12 = obj36;
            objOverlayContentPathBindings8 = ContentPathBindingsKt.overlayContentPathBindings(map, "selected", accumulatedState, objOverlayContentPathBindings8, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$36
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj38) {
                    return invoke((Boolean) obj38);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Boolean v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(BooleanSerializer.INSTANCE, v13);
                    } catch (Exception unused17) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$37
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Boolean invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                    } catch (Exception unused17) {
                        return null;
                    }
                }
            });
        }
        Object obj38 = obj12;
        Boolean bool6 = (Boolean) DotPathBindingsKt.overlayAggregateBinding(map2, "selected", accumulatedState, objOverlayContentPathBindings8, "selected", new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$38
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj39) {
                return invoke((Boolean) obj39);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Boolean bool7) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(BooleanSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, bool7, interfaceC37138cM122336d);
                } catch (Exception unused17) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$39
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Boolean invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                } catch (Exception unused17) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$40
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Boolean, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Boolean, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj39) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj39);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement9 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement9);
                    } catch (Exception unused17) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof Boolean) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c9 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c9);
                    } catch (Exception unused18) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Boolean.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (Boolean) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (Boolean) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (Boolean) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (Boolean) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (Boolean) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (Boolean) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        boolean zBooleanValue2 = bool6 != null ? bool6.booleanValue() : selectableCellModel.getSelected();
        Object objValueOf3 = Boolean.valueOf(selectableCellModel.getShowCheckbox());
        if (objValueOf3 instanceof WithGeneratedBindings) {
            Object objBind9 = ((WithGeneratedBindings) objValueOf3).bind(accumulatedState);
            if (!(objBind9 instanceof Boolean)) {
                objBind9 = null;
            }
            bool3 = (Boolean) objBind9;
            if (bool3 == null) {
                objOverlayContentPathBindings9 = objValueOf3;
            } else {
                objOverlayContentPathBindings9 = bool3;
            }
        } else if (objValueOf3 instanceof List) {
            Iterable iterable9 = (Iterable) objValueOf3;
            ArrayList arrayList9 = new ArrayList(AbstractC25267u.m74163i0(iterable9, 10));
            for (Object obj39 : iterable9) {
                WithGeneratedBindings withGeneratedBindings9 = obj39 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj39 : null;
                if (withGeneratedBindings9 != null && (withGeneratedBindingsBind9 = withGeneratedBindings9.bind(accumulatedState)) != null) {
                    obj39 = withGeneratedBindingsBind9;
                }
                arrayList9.add(obj39);
            }
            bool3 = (Boolean) arrayList9;
            objOverlayContentPathBindings9 = bool3;
        } else {
            objOverlayContentPathBindings9 = objValueOf3;
        }
        String strResolveContentBindingKey9 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "showCheckbox") : null;
        if (strResolveContentBindingKey9 != null) {
            Object objResolveStateRef9 = StateLookupKt.resolveStateRef(strResolveContentBindingKey9, accumulatedState);
            if (objResolveStateRef9 != null) {
                BindingLoggerKt.logContentBinding("showCheckbox", strResolveContentBindingKey9, objResolveStateRef9);
                Object objUnwrapForCoercion9 = BindCoercionKt.unwrapForCoercion(objResolveStateRef9);
                if ((objUnwrapForCoercion9 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion9)) {
                    obj13 = obj38;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj13), Boolean.TRUE)) {
                        objOverlayContentPathBindings9 = null;
                    }
                } else {
                    obj13 = obj38;
                }
                objOverlayContentPathBindings9 = BindCoercionKt.unwrapForCoercion(objResolveStateRef9);
                if (objOverlayContentPathBindings9 == null) {
                    objOverlayContentPathBindings9 = null;
                } else if (objOverlayContentPathBindings9 instanceof JsonElement) {
                    JsonElement jsonElement9 = (JsonElement) objOverlayContentPathBindings9;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings9 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement9);
                    } catch (Exception unused17) {
                        objOverlayContentPathBindings9 = null;
                    }
                } else if (!(objOverlayContentPathBindings9 instanceof Boolean)) {
                    if (objOverlayContentPathBindings9 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a9 = AbstractC22671h0.m65688a(Boolean.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings9 = (Boolean) Integer.valueOf(((Number) objOverlayContentPathBindings9).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings9 = (Boolean) Long.valueOf(((Number) objOverlayContentPathBindings9).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings9 = (Boolean) Double.valueOf(((Number) objOverlayContentPathBindings9).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings9 = (Boolean) Float.valueOf(((Number) objOverlayContentPathBindings9).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings9 = (Boolean) Short.valueOf(((Number) objOverlayContentPathBindings9).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings9 = (Boolean) Byte.valueOf(((Number) objOverlayContentPathBindings9).byteValue());
                        } else {
                            objOverlayContentPathBindings9 = null;
                        }
                    } else if (objOverlayContentPathBindings9 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c9 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings9);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings9 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c9);
                        } catch (Exception unused18) {
                            objOverlayContentPathBindings9 = null;
                        }
                        if (objOverlayContentPathBindings9 == null) {
                            objOverlayContentPathBindings9 = null;
                        }
                    } else {
                        objOverlayContentPathBindings9 = null;
                    }
                }
                if (objOverlayContentPathBindings9 == null) {
                    objOverlayContentPathBindings9 = objValueOf3;
                }
            } else {
                obj13 = obj38;
            }
        } else {
            obj13 = obj38;
            objOverlayContentPathBindings9 = ContentPathBindingsKt.overlayContentPathBindings(map, "showCheckbox", accumulatedState, objOverlayContentPathBindings9, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$41
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj40) {
                    return invoke((Boolean) obj40);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Boolean v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(BooleanSerializer.INSTANCE, v13);
                    } catch (Exception unused19) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$42
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Boolean invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                    } catch (Exception unused19) {
                        return null;
                    }
                }
            });
        }
        Object obj40 = obj13;
        Boolean bool7 = (Boolean) DotPathBindingsKt.overlayAggregateBinding(map2, "showCheckbox", accumulatedState, objOverlayContentPathBindings9, "showCheckbox", new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$43
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj41) {
                return invoke((Boolean) obj41);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Boolean bool8) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(BooleanSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, bool8, interfaceC37138cM122336d);
                } catch (Exception unused19) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$44
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Boolean invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                } catch (Exception unused19) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$45
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Boolean, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Boolean, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj41) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj41);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement10 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement10);
                    } catch (Exception unused19) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof Boolean) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c10 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c10);
                    } catch (Exception unused20) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Boolean.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (Boolean) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (Boolean) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (Boolean) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (Boolean) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (Boolean) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (Boolean) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        boolean zBooleanValue3 = bool7 != null ? bool7.booleanValue() : selectableCellModel.getShowCheckbox();
        Object objValueOf4 = Boolean.valueOf(selectableCellModel.isDisabled());
        if (objValueOf4 instanceof WithGeneratedBindings) {
            Object objBind10 = ((WithGeneratedBindings) objValueOf4).bind(accumulatedState);
            if (!(objBind10 instanceof Boolean)) {
                objBind10 = null;
            }
            bool4 = (Boolean) objBind10;
            if (bool4 == null) {
                objOverlayContentPathBindings10 = objValueOf4;
            } else {
                objOverlayContentPathBindings10 = bool4;
            }
        } else if (objValueOf4 instanceof List) {
            Iterable iterable10 = (Iterable) objValueOf4;
            ArrayList arrayList10 = new ArrayList(AbstractC25267u.m74163i0(iterable10, 10));
            for (Object obj41 : iterable10) {
                WithGeneratedBindings withGeneratedBindings10 = obj41 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj41 : null;
                if (withGeneratedBindings10 != null && (withGeneratedBindingsBind10 = withGeneratedBindings10.bind(accumulatedState)) != null) {
                    obj41 = withGeneratedBindingsBind10;
                }
                arrayList10.add(obj41);
            }
            bool4 = (Boolean) arrayList10;
            objOverlayContentPathBindings10 = bool4;
        } else {
            objOverlayContentPathBindings10 = objValueOf4;
        }
        String strResolveContentBindingKey10 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "isDisabled") : null;
        if (strResolveContentBindingKey10 != null) {
            Object objResolveStateRef10 = StateLookupKt.resolveStateRef(strResolveContentBindingKey10, accumulatedState);
            if (objResolveStateRef10 != null) {
                BindingLoggerKt.logContentBinding("isDisabled", strResolveContentBindingKey10, objResolveStateRef10);
                Object objUnwrapForCoercion10 = BindCoercionKt.unwrapForCoercion(objResolveStateRef10);
                if ((objUnwrapForCoercion10 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion10)) {
                    obj14 = obj40;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj14), Boolean.TRUE)) {
                        objOverlayContentPathBindings10 = null;
                    }
                } else {
                    obj14 = obj40;
                }
                objOverlayContentPathBindings10 = BindCoercionKt.unwrapForCoercion(objResolveStateRef10);
                if (objOverlayContentPathBindings10 == null) {
                    objOverlayContentPathBindings10 = null;
                } else if (objOverlayContentPathBindings10 instanceof JsonElement) {
                    JsonElement jsonElement10 = (JsonElement) objOverlayContentPathBindings10;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings10 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement10);
                    } catch (Exception unused19) {
                        objOverlayContentPathBindings10 = null;
                    }
                } else if (!(objOverlayContentPathBindings10 instanceof Boolean)) {
                    if (objOverlayContentPathBindings10 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a10 = AbstractC22671h0.m65688a(Boolean.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings10 = (Boolean) Integer.valueOf(((Number) objOverlayContentPathBindings10).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings10 = (Boolean) Long.valueOf(((Number) objOverlayContentPathBindings10).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings10 = (Boolean) Double.valueOf(((Number) objOverlayContentPathBindings10).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings10 = (Boolean) Float.valueOf(((Number) objOverlayContentPathBindings10).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings10 = (Boolean) Short.valueOf(((Number) objOverlayContentPathBindings10).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings10 = (Boolean) Byte.valueOf(((Number) objOverlayContentPathBindings10).byteValue());
                        } else {
                            objOverlayContentPathBindings10 = null;
                        }
                    } else if (objOverlayContentPathBindings10 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c10 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings10);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings10 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c10);
                        } catch (Exception unused20) {
                            objOverlayContentPathBindings10 = null;
                        }
                        if (objOverlayContentPathBindings10 == null) {
                            objOverlayContentPathBindings10 = null;
                        }
                    } else {
                        objOverlayContentPathBindings10 = null;
                    }
                }
                if (objOverlayContentPathBindings10 == null) {
                    objOverlayContentPathBindings10 = objValueOf4;
                }
            } else {
                obj14 = obj40;
            }
        } else {
            obj14 = obj40;
            objOverlayContentPathBindings10 = ContentPathBindingsKt.overlayContentPathBindings(map, "isDisabled", accumulatedState, objOverlayContentPathBindings10, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$46
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj42) {
                    return invoke((Boolean) obj42);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Boolean v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(BooleanSerializer.INSTANCE, v13);
                    } catch (Exception unused21) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$47
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Boolean invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                    } catch (Exception unused21) {
                        return null;
                    }
                }
            });
        }
        Object obj42 = obj14;
        Boolean bool8 = (Boolean) DotPathBindingsKt.overlayAggregateBinding(map2, "isDisabled", accumulatedState, objOverlayContentPathBindings10, "isDisabled", new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$48
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj43) {
                return invoke((Boolean) obj43);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Boolean bool9) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(BooleanSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, bool9, interfaceC37138cM122336d);
                } catch (Exception unused21) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$49
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Boolean invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                } catch (Exception unused21) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$50
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Boolean, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Boolean, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj43) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj43);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement11 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement11);
                    } catch (Exception unused21) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof Boolean) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c11 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c11);
                    } catch (Exception unused22) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Boolean.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (Boolean) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (Boolean) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (Boolean) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (Boolean) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (Boolean) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (Boolean) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        boolean zBooleanValue4 = bool8 != null ? bool8.booleanValue() : selectableCellModel.isDisabled();
        Action action3 = selectableCellModel.getAction();
        if (action3 == null) {
            objOverlayContentPathBindings11 = null;
        } else {
            if (action3 instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind19 = ((WithGeneratedBindings) action3).bind(accumulatedState);
                if (!(withGeneratedBindingsBind19 instanceof Action)) {
                    withGeneratedBindingsBind19 = null;
                }
                action = (Action) withGeneratedBindingsBind19;
                if (action == null) {
                    action = action3;
                }
            } else if (action3 instanceof List) {
                Iterable iterable11 = (Iterable) action3;
                List arrayList11 = new ArrayList(AbstractC25267u.m74163i0(iterable11, 10));
                for (Object obj43 : iterable11) {
                    WithGeneratedBindings withGeneratedBindings11 = obj43 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj43 : null;
                    if (withGeneratedBindings11 != null && (withGeneratedBindingsBind11 = withGeneratedBindings11.bind(accumulatedState)) != null) {
                        obj43 = withGeneratedBindingsBind11;
                    }
                    arrayList11.add(obj43);
                }
                action = (Action) arrayList11;
            } else {
                action = action3;
            }
            objOverlayContentPathBindings11 = action;
        }
        String strResolveContentBindingKey11 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "action") : null;
        if (strResolveContentBindingKey11 != null) {
            Object objResolveStateRef11 = StateLookupKt.resolveStateRef(strResolveContentBindingKey11, accumulatedState);
            if (objResolveStateRef11 != null) {
                BindingLoggerKt.logContentBinding("action", strResolveContentBindingKey11, objResolveStateRef11);
                Object objUnwrapForCoercion11 = BindCoercionKt.unwrapForCoercion(objResolveStateRef11);
                if ((objUnwrapForCoercion11 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion11)) {
                    obj15 = obj42;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj15), Boolean.TRUE)) {
                        objOverlayContentPathBindings11 = null;
                    }
                } else {
                    obj15 = obj42;
                }
                objOverlayContentPathBindings11 = BindCoercionKt.unwrapForCoercion(objResolveStateRef11);
                if (objOverlayContentPathBindings11 == null) {
                    objOverlayContentPathBindings11 = null;
                } else if (objOverlayContentPathBindings11 instanceof JsonElement) {
                    try {
                        objOverlayContentPathBindings11 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(Action.class)), (JsonElement) objOverlayContentPathBindings11);
                    } catch (Exception unused21) {
                        objOverlayContentPathBindings11 = null;
                    }
                } else if (!(objOverlayContentPathBindings11 instanceof Action)) {
                    if (objOverlayContentPathBindings11 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a11 = AbstractC22671h0.m65688a(Action.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings11 = (Action) Integer.valueOf(((Number) objOverlayContentPathBindings11).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings11 = (Action) Long.valueOf(((Number) objOverlayContentPathBindings11).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings11 = (Action) Double.valueOf(((Number) objOverlayContentPathBindings11).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings11 = (Action) Float.valueOf(((Number) objOverlayContentPathBindings11).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings11 = (Action) Short.valueOf(((Number) objOverlayContentPathBindings11).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings11 = (Action) Byte.valueOf(((Number) objOverlayContentPathBindings11).byteValue());
                        } else {
                            objOverlayContentPathBindings11 = null;
                        }
                    } else if (objOverlayContentPathBindings11 instanceof String) {
                        try {
                            objOverlayContentPathBindings11 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(Action.class)), AbstractC0770m.m1841c((String) objOverlayContentPathBindings11));
                        } catch (Exception unused22) {
                            objOverlayContentPathBindings11 = null;
                        }
                        if (objOverlayContentPathBindings11 == null) {
                            objOverlayContentPathBindings11 = null;
                        }
                    } else {
                        objOverlayContentPathBindings11 = null;
                    }
                }
                if (objOverlayContentPathBindings11 == null) {
                    objOverlayContentPathBindings11 = action3;
                }
            } else {
                obj15 = obj42;
            }
        } else {
            obj15 = obj42;
            if (objOverlayContentPathBindings11 != null) {
                objOverlayContentPathBindings11 = ContentPathBindingsKt.overlayContentPathBindings(map, "action", accumulatedState, objOverlayContentPathBindings11, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$51
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj44) {
                        return invoke((Action) obj44);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(Action v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            InterfaceC37138c interfaceC37138cM113842e = AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Action.class));
                            AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                            stateBindingJson.getClass();
                            return AbstractC12313p.m34290h0(stateBindingJson, v13, interfaceC37138cM113842e);
                        } catch (Exception unused23) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$52
                    /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.whoopaction.domain.models.Action, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Action invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Action.class)), json);
                        } catch (Exception unused23) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj44 = obj15;
        Action action4 = (Action) DotPathBindingsKt.overlayAggregateBinding(map2, "action", accumulatedState, objOverlayContentPathBindings11, "action", new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$53
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj45) {
                return invoke((Action) obj45);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Action action5) {
                try {
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Action.class)));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, action5, interfaceC37138cM122336d);
                } catch (Exception unused23) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$54
            /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.whoopaction.domain.models.Action, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Action invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Action.class)), json);
                } catch (Exception unused23) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$55
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [com.whoop.whoopaction.domain.models.Action] */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.whoopaction.domain.models.Action, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.whoopaction.domain.models.Action, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Action invoke(Object obj45) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj45);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Action.class)), (JsonElement) UnwrapForCoercion);
                    } catch (Exception unused23) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof Action) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    try {
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Action.class)), AbstractC0770m.m1841c((String) UnwrapForCoercion));
                    } catch (Exception unused24) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Action.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (Action) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (Action) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (Action) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (Action) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (Action) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (Action) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        Object interaction = selectableCellModel.getInteraction();
        if (interaction == null) {
            objOverlayContentPathBindings12 = null;
        } else {
            if (interaction instanceof WithGeneratedBindings) {
                Object objBind11 = ((WithGeneratedBindings) interaction).bind(accumulatedState);
                if (!(objBind11 instanceof GenericInteraction)) {
                    objBind11 = null;
                }
                obj16 = (GenericInteraction) objBind11;
                if (obj16 == null) {
                    obj16 = interaction;
                }
            } else if (interaction instanceof List) {
                Iterable iterable12 = (Iterable) interaction;
                ArrayList arrayList12 = new ArrayList(AbstractC25267u.m74163i0(iterable12, 10));
                for (Object obj45 : iterable12) {
                    WithGeneratedBindings withGeneratedBindings12 = obj45 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj45 : null;
                    if (withGeneratedBindings12 != null && (withGeneratedBindingsBind12 = withGeneratedBindings12.bind(accumulatedState)) != null) {
                        obj45 = withGeneratedBindingsBind12;
                    }
                    arrayList12.add(obj45);
                }
                obj16 = (GenericInteraction) arrayList12;
            } else {
                obj16 = interaction;
            }
            objOverlayContentPathBindings12 = obj16;
        }
        String strResolveContentBindingKey12 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "interaction") : null;
        if (strResolveContentBindingKey12 != null) {
            Object objResolveStateRef12 = StateLookupKt.resolveStateRef(strResolveContentBindingKey12, accumulatedState);
            if (objResolveStateRef12 != null) {
                BindingLoggerKt.logContentBinding("interaction", strResolveContentBindingKey12, objResolveStateRef12);
                Object objUnwrapForCoercion12 = BindCoercionKt.unwrapForCoercion(objResolveStateRef12);
                if ((objUnwrapForCoercion12 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion12)) {
                    obj17 = obj44;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj17), Boolean.TRUE)) {
                        objOverlayContentPathBindings12 = null;
                    }
                } else {
                    obj17 = obj44;
                }
                objOverlayContentPathBindings12 = BindCoercionKt.unwrapForCoercion(objResolveStateRef12);
                if (objOverlayContentPathBindings12 == null) {
                    objOverlayContentPathBindings12 = null;
                } else if (objOverlayContentPathBindings12 instanceof JsonElement) {
                    JsonElement jsonElement11 = (JsonElement) objOverlayContentPathBindings12;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings12 = StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), jsonElement11);
                    } catch (Exception unused23) {
                        objOverlayContentPathBindings12 = null;
                    }
                } else if (!(objOverlayContentPathBindings12 instanceof GenericInteraction)) {
                    if (objOverlayContentPathBindings12 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a12 = AbstractC22671h0.m65688a(GenericInteraction.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a12, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings12 = (GenericInteraction) Integer.valueOf(((Number) objOverlayContentPathBindings12).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a12, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings12 = (GenericInteraction) Long.valueOf(((Number) objOverlayContentPathBindings12).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a12, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings12 = (GenericInteraction) Double.valueOf(((Number) objOverlayContentPathBindings12).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a12, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings12 = (GenericInteraction) Float.valueOf(((Number) objOverlayContentPathBindings12).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a12, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings12 = (GenericInteraction) Short.valueOf(((Number) objOverlayContentPathBindings12).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a12, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings12 = (GenericInteraction) Byte.valueOf(((Number) objOverlayContentPathBindings12).byteValue());
                        } else {
                            objOverlayContentPathBindings12 = null;
                        }
                    } else if (objOverlayContentPathBindings12 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c11 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings12);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings12 = StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), jsonPrimitiveM1841c11);
                        } catch (Exception unused24) {
                            objOverlayContentPathBindings12 = null;
                        }
                        if (objOverlayContentPathBindings12 == null) {
                            objOverlayContentPathBindings12 = null;
                        }
                    } else {
                        objOverlayContentPathBindings12 = null;
                    }
                }
                if (objOverlayContentPathBindings12 == null) {
                    objOverlayContentPathBindings12 = interaction;
                }
            } else {
                obj17 = obj44;
            }
        } else {
            obj17 = obj44;
            if (objOverlayContentPathBindings12 != null) {
                objOverlayContentPathBindings12 = ContentPathBindingsKt.overlayContentPathBindings(map, "interaction", accumulatedState, objOverlayContentPathBindings12, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$56
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj46) {
                        return invoke((GenericInteraction) obj46);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(GenericInteraction v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(GenericInteraction.INSTANCE.serializer(), v13);
                        } catch (Exception unused25) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$57
                    /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.navigation.models.GenericInteraction, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final GenericInteraction invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), json);
                        } catch (Exception unused25) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj46 = obj17;
        GenericInteraction genericInteraction = (GenericInteraction) DotPathBindingsKt.overlayAggregateBinding(map2, "interaction", accumulatedState, objOverlayContentPathBindings12, "interaction", new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$58
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj47) {
                return invoke((GenericInteraction) obj47);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(GenericInteraction genericInteraction2) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(GenericInteraction.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, genericInteraction2, interfaceC37138cM122336d);
                } catch (Exception unused25) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$59
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.navigation.models.GenericInteraction, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final GenericInteraction invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), json);
                } catch (Exception unused25) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$60
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.navigation.models.GenericInteraction, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.navigation.models.GenericInteraction, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final GenericInteraction invoke(Object obj47) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj47);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement12 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), jsonElement12);
                    } catch (Exception unused25) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof GenericInteraction) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c12 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), jsonPrimitiveM1841c12);
                    } catch (Exception unused26) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(GenericInteraction.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (GenericInteraction) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (GenericInteraction) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (GenericInteraction) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (GenericInteraction) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (GenericInteraction) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (GenericInteraction) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        Action deselectAction = selectableCellModel.getDeselectAction();
        if (deselectAction == null) {
            objOverlayContentPathBindings13 = null;
        } else {
            if (deselectAction instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind20 = ((WithGeneratedBindings) deselectAction).bind(accumulatedState);
                if (!(withGeneratedBindingsBind20 instanceof Action)) {
                    withGeneratedBindingsBind20 = null;
                }
                action2 = (Action) withGeneratedBindingsBind20;
                if (action2 == null) {
                    action2 = deselectAction;
                }
            } else if (deselectAction instanceof List) {
                Iterable iterable13 = (Iterable) deselectAction;
                List arrayList13 = new ArrayList(AbstractC25267u.m74163i0(iterable13, 10));
                for (Object obj47 : iterable13) {
                    WithGeneratedBindings withGeneratedBindings13 = obj47 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj47 : null;
                    if (withGeneratedBindings13 != null && (withGeneratedBindingsBind13 = withGeneratedBindings13.bind(accumulatedState)) != null) {
                        obj47 = withGeneratedBindingsBind13;
                    }
                    arrayList13.add(obj47);
                }
                action2 = (Action) arrayList13;
            } else {
                action2 = deselectAction;
            }
            objOverlayContentPathBindings13 = action2;
        }
        String strResolveContentBindingKey13 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "deselectAction") : null;
        if (strResolveContentBindingKey13 != null) {
            Object objResolveStateRef13 = StateLookupKt.resolveStateRef(strResolveContentBindingKey13, accumulatedState);
            if (objResolveStateRef13 != null) {
                BindingLoggerKt.logContentBinding("deselectAction", strResolveContentBindingKey13, objResolveStateRef13);
                Object objUnwrapForCoercion13 = BindCoercionKt.unwrapForCoercion(objResolveStateRef13);
                if ((objUnwrapForCoercion13 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion13)) {
                    obj18 = obj46;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj18), Boolean.TRUE)) {
                        objOverlayContentPathBindings13 = null;
                    }
                } else {
                    obj18 = obj46;
                }
                objOverlayContentPathBindings13 = BindCoercionKt.unwrapForCoercion(objResolveStateRef13);
                if (objOverlayContentPathBindings13 == null) {
                    objOverlayContentPathBindings13 = null;
                } else if (objOverlayContentPathBindings13 instanceof JsonElement) {
                    try {
                        objOverlayContentPathBindings13 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(Action.class)), (JsonElement) objOverlayContentPathBindings13);
                    } catch (Exception unused25) {
                        objOverlayContentPathBindings13 = null;
                    }
                } else if (!(objOverlayContentPathBindings13 instanceof Action)) {
                    if (objOverlayContentPathBindings13 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a13 = AbstractC22671h0.m65688a(Action.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a13, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings13 = (Action) Integer.valueOf(((Number) objOverlayContentPathBindings13).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a13, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings13 = (Action) Long.valueOf(((Number) objOverlayContentPathBindings13).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a13, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings13 = (Action) Double.valueOf(((Number) objOverlayContentPathBindings13).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a13, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings13 = (Action) Float.valueOf(((Number) objOverlayContentPathBindings13).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a13, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings13 = (Action) Short.valueOf(((Number) objOverlayContentPathBindings13).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a13, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings13 = (Action) Byte.valueOf(((Number) objOverlayContentPathBindings13).byteValue());
                        } else {
                            objOverlayContentPathBindings13 = null;
                        }
                    } else if (objOverlayContentPathBindings13 instanceof String) {
                        try {
                            objOverlayContentPathBindings13 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(Action.class)), AbstractC0770m.m1841c((String) objOverlayContentPathBindings13));
                        } catch (Exception unused26) {
                            objOverlayContentPathBindings13 = null;
                        }
                        if (objOverlayContentPathBindings13 == null) {
                            objOverlayContentPathBindings13 = null;
                        }
                    } else {
                        objOverlayContentPathBindings13 = null;
                    }
                }
                if (objOverlayContentPathBindings13 == null) {
                    objOverlayContentPathBindings13 = deselectAction;
                }
            } else {
                obj18 = obj46;
            }
        } else {
            obj18 = obj46;
            if (objOverlayContentPathBindings13 != null) {
                objOverlayContentPathBindings13 = ContentPathBindingsKt.overlayContentPathBindings(map, "deselectAction", accumulatedState, objOverlayContentPathBindings13, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$61
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj48) {
                        return invoke((Action) obj48);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(Action v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            InterfaceC37138c interfaceC37138cM113842e = AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Action.class));
                            AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                            stateBindingJson.getClass();
                            return AbstractC12313p.m34290h0(stateBindingJson, v13, interfaceC37138cM113842e);
                        } catch (Exception unused27) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$62
                    /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.whoopaction.domain.models.Action, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Action invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Action.class)), json);
                        } catch (Exception unused27) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj48 = obj18;
        Action action5 = (Action) DotPathBindingsKt.overlayAggregateBinding(map2, "deselectAction", accumulatedState, objOverlayContentPathBindings13, "deselectAction", new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$63
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj49) {
                return invoke((Action) obj49);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Action action6) {
                try {
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Action.class)));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, action6, interfaceC37138cM122336d);
                } catch (Exception unused27) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$64
            /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.whoopaction.domain.models.Action, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Action invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Action.class)), json);
                } catch (Exception unused27) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$65
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [com.whoop.whoopaction.domain.models.Action] */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.whoopaction.domain.models.Action, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.whoopaction.domain.models.Action, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Action invoke(Object obj49) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj49);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Action.class)), (JsonElement) UnwrapForCoercion);
                    } catch (Exception unused27) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof Action) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    try {
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Action.class)), AbstractC0770m.m1841c((String) UnwrapForCoercion));
                    } catch (Exception unused28) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Action.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (Action) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (Action) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (Action) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (Action) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (Action) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (Action) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        List<String> searchKeys = selectableCellModel.getSearchKeys();
        if (searchKeys == null) {
            objOverlayContentPathBindings14 = null;
        } else {
            if (searchKeys instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind21 = ((WithGeneratedBindings) searchKeys).bind(accumulatedState);
                if (!(withGeneratedBindingsBind21 instanceof List)) {
                    withGeneratedBindingsBind21 = null;
                }
                list = (List) withGeneratedBindingsBind21;
                if (list == null) {
                    list = searchKeys;
                }
            } else {
                List<String> list2 = searchKeys;
                ArrayList arrayList14 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                for (Object obj49 : list2) {
                    WithGeneratedBindings withGeneratedBindings14 = obj49 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj49 : null;
                    if (withGeneratedBindings14 != null && (withGeneratedBindingsBind14 = withGeneratedBindings14.bind(accumulatedState)) != null) {
                        obj49 = withGeneratedBindingsBind14;
                    }
                    arrayList14.add(obj49);
                }
                list = arrayList14;
            }
            objOverlayContentPathBindings14 = list;
        }
        String strResolveContentBindingKey14 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "searchKeys") : null;
        if (strResolveContentBindingKey14 != null) {
            Object objResolveStateRef14 = StateLookupKt.resolveStateRef(strResolveContentBindingKey14, accumulatedState);
            if (objResolveStateRef14 != null) {
                BindingLoggerKt.logContentBinding("searchKeys", strResolveContentBindingKey14, objResolveStateRef14);
                Object objUnwrapForCoercion14 = BindCoercionKt.unwrapForCoercion(objResolveStateRef14);
                if ((objUnwrapForCoercion14 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion14)) {
                    obj19 = obj48;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj19), Boolean.TRUE)) {
                        objOverlayContentPathBindings14 = null;
                    }
                } else {
                    obj19 = obj48;
                }
                objOverlayContentPathBindings14 = BindCoercionKt.unwrapForCoercion(objResolveStateRef14);
                if (objOverlayContentPathBindings14 == null) {
                    objOverlayContentPathBindings14 = null;
                } else if (objOverlayContentPathBindings14 instanceof JsonElement) {
                    JsonElement jsonElement12 = (JsonElement) objOverlayContentPathBindings14;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings14 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), jsonElement12);
                    } catch (Exception unused27) {
                        objOverlayContentPathBindings14 = null;
                    }
                } else if (!(objOverlayContentPathBindings14 instanceof List)) {
                    if (objOverlayContentPathBindings14 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a14 = AbstractC22671h0.m65688a(List.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a14, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings14 = (List) Integer.valueOf(((Number) objOverlayContentPathBindings14).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a14, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings14 = (List) Long.valueOf(((Number) objOverlayContentPathBindings14).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a14, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings14 = (List) Double.valueOf(((Number) objOverlayContentPathBindings14).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a14, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings14 = (List) Float.valueOf(((Number) objOverlayContentPathBindings14).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a14, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings14 = (List) Short.valueOf(((Number) objOverlayContentPathBindings14).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a14, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings14 = (List) Byte.valueOf(((Number) objOverlayContentPathBindings14).byteValue());
                        } else {
                            objOverlayContentPathBindings14 = null;
                        }
                    } else if (objOverlayContentPathBindings14 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c12 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings14);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings14 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), jsonPrimitiveM1841c12);
                        } catch (Exception unused28) {
                            objOverlayContentPathBindings14 = null;
                        }
                        if (objOverlayContentPathBindings14 == null) {
                            objOverlayContentPathBindings14 = null;
                        }
                    } else {
                        objOverlayContentPathBindings14 = null;
                    }
                }
                if (objOverlayContentPathBindings14 == null) {
                    objOverlayContentPathBindings14 = searchKeys;
                }
            } else {
                obj19 = obj48;
            }
        } else {
            obj19 = obj48;
            if (objOverlayContentPathBindings14 != null) {
                objOverlayContentPathBindings14 = ContentPathBindingsKt.overlayContentPathBindings(map, "searchKeys", accumulatedState, objOverlayContentPathBindings14, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$66
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj50) {
                        return invoke((List<? extends String>) obj50);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(List<? extends String> v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            ArrayListSerializer arrayListSerializer = new ArrayListSerializer(StringSerializer.INSTANCE);
                            AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                            stateBindingJson.getClass();
                            return AbstractC12313p.m34290h0(stateBindingJson, v13, arrayListSerializer);
                        } catch (Exception unused29) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$67
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends java.lang.String>] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final List<? extends String> invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), json);
                        } catch (Exception unused29) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj50 = obj19;
        List<String> searchKeys2 = (List) DotPathBindingsKt.overlayAggregateBinding(map2, "searchKeys", accumulatedState, objOverlayContentPathBindings14, "searchKeys", new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$68
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj51) {
                return invoke((List<? extends String>) obj51);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(List<? extends String> list3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new ArrayListSerializer(StringSerializer.INSTANCE));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, list3, interfaceC37138cM122336d);
                } catch (Exception unused29) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$69
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends java.lang.String>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final List<? extends String> invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), json);
                } catch (Exception unused29) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$70
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<? extends java.lang.String>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List<? extends java.lang.String>] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List<? extends java.lang.String>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final List<? extends String> invoke(Object obj51) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj51);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement13 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), jsonElement13);
                    } catch (Exception unused29) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof List) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c13 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), jsonPrimitiveM1841c13);
                    } catch (Exception unused30) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(List.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (List) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (List) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (List) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (List) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (List) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (List) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (searchKeys2 == null) {
            searchKeys2 = selectableCellModel.getSearchKeys();
        }
        List<String> list3 = searchKeys2;
        Object sectionTitle = selectableCellModel.getSectionTitle();
        if (sectionTitle == null) {
            objOverlayContentPathBindings15 = null;
        } else {
            if (sectionTitle instanceof WithGeneratedBindings) {
                Object objBind12 = ((WithGeneratedBindings) sectionTitle).bind(accumulatedState);
                if (!(objBind12 instanceof String)) {
                    objBind12 = null;
                }
                obj20 = (String) objBind12;
                if (obj20 == null) {
                    obj20 = sectionTitle;
                }
            } else if (sectionTitle instanceof List) {
                Iterable iterable14 = (Iterable) sectionTitle;
                ArrayList arrayList15 = new ArrayList(AbstractC25267u.m74163i0(iterable14, 10));
                for (Object obj51 : iterable14) {
                    WithGeneratedBindings withGeneratedBindings15 = obj51 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj51 : null;
                    if (withGeneratedBindings15 != null && (withGeneratedBindingsBind15 = withGeneratedBindings15.bind(accumulatedState)) != null) {
                        obj51 = withGeneratedBindingsBind15;
                    }
                    arrayList15.add(obj51);
                }
                obj20 = (String) arrayList15;
            } else {
                obj20 = sectionTitle;
            }
            objOverlayContentPathBindings15 = obj20;
        }
        String strResolveContentBindingKey15 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "sectionTitle") : null;
        if (strResolveContentBindingKey15 != null) {
            Object objResolveStateRef15 = StateLookupKt.resolveStateRef(strResolveContentBindingKey15, accumulatedState);
            if (objResolveStateRef15 != null) {
                BindingLoggerKt.logContentBinding("sectionTitle", strResolveContentBindingKey15, objResolveStateRef15);
                Object objUnwrapForCoercion15 = BindCoercionKt.unwrapForCoercion(objResolveStateRef15);
                if ((objUnwrapForCoercion15 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion15)) {
                    obj21 = obj50;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj21), Boolean.TRUE)) {
                        objOverlayContentPathBindings15 = null;
                    }
                } else {
                    obj21 = obj50;
                }
                objOverlayContentPathBindings15 = BindCoercionKt.unwrapForCoercion(objResolveStateRef15);
                if (objOverlayContentPathBindings15 == null) {
                    objOverlayContentPathBindings15 = null;
                } else if (objOverlayContentPathBindings15 instanceof JsonElement) {
                    JsonElement jsonElement13 = (JsonElement) objOverlayContentPathBindings15;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings15 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement13);
                    } catch (Exception unused29) {
                        objOverlayContentPathBindings15 = null;
                    }
                } else {
                    boolean z18 = objOverlayContentPathBindings15 instanceof String;
                    if (!z18) {
                        if (objOverlayContentPathBindings15 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a15 = AbstractC22671h0.m65688a(String.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a15, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings15 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings15).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a15, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings15 = (String) Long.valueOf(((Number) objOverlayContentPathBindings15).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a15, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings15 = (String) Double.valueOf(((Number) objOverlayContentPathBindings15).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a15, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings15 = (String) Float.valueOf(((Number) objOverlayContentPathBindings15).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a15, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings15 = (String) Short.valueOf(((Number) objOverlayContentPathBindings15).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a15, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings15 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings15).byteValue());
                            } else {
                                objOverlayContentPathBindings15 = null;
                            }
                        } else if (z18) {
                            JsonPrimitive jsonPrimitiveM1841c13 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings15);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings15 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c13);
                            } catch (Exception unused30) {
                                objOverlayContentPathBindings15 = null;
                            }
                            if (objOverlayContentPathBindings15 == null) {
                                objOverlayContentPathBindings15 = null;
                            }
                        } else {
                            objOverlayContentPathBindings15 = null;
                        }
                    }
                }
                if (objOverlayContentPathBindings15 == null) {
                    objOverlayContentPathBindings15 = sectionTitle;
                }
            } else {
                obj21 = obj50;
            }
        } else {
            obj21 = obj50;
            if (objOverlayContentPathBindings15 != null) {
                objOverlayContentPathBindings15 = ContentPathBindingsKt.overlayContentPathBindings(map, "sectionTitle", accumulatedState, objOverlayContentPathBindings15, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$71
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj52) {
                        return invoke((String) obj52);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(String v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(StringSerializer.INSTANCE, v13);
                        } catch (Exception unused31) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$72
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final String invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                        } catch (Exception unused31) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj52 = obj21;
        String str7 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "sectionTitle", accumulatedState, objOverlayContentPathBindings15, "sectionTitle", new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$73
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj53) {
                return invoke((String) obj53);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str8) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str8, interfaceC37138cM122336d);
                } catch (Exception unused31) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$74
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                } catch (Exception unused31) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$75
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj53) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj53);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement14 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement14);
                    } catch (Exception unused31) {
                        return null;
                    }
                }
                boolean z19 = UnwrapForCoercion instanceof String;
                if (z19) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!z19) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c14 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c14);
                    } catch (Exception unused32) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (String) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (String) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (String) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (String) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (String) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (String) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        Object fixedHeightSize = selectableCellModel.getFixedHeightSize();
        if (fixedHeightSize == null) {
            objOverlayContentPathBindings16 = null;
        } else {
            if (fixedHeightSize instanceof WithGeneratedBindings) {
                Object objBind13 = ((WithGeneratedBindings) fixedHeightSize).bind(accumulatedState);
                if (!(objBind13 instanceof Double)) {
                    objBind13 = null;
                }
                obj22 = (Double) objBind13;
                if (obj22 == null) {
                    obj22 = fixedHeightSize;
                }
            } else if (fixedHeightSize instanceof List) {
                Iterable iterable15 = (Iterable) fixedHeightSize;
                ArrayList arrayList16 = new ArrayList(AbstractC25267u.m74163i0(iterable15, 10));
                for (Object obj53 : iterable15) {
                    WithGeneratedBindings withGeneratedBindings16 = obj53 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj53 : null;
                    if (withGeneratedBindings16 != null && (withGeneratedBindingsBind16 = withGeneratedBindings16.bind(accumulatedState)) != null) {
                        obj53 = withGeneratedBindingsBind16;
                    }
                    arrayList16.add(obj53);
                }
                obj22 = (Double) arrayList16;
            } else {
                obj22 = fixedHeightSize;
            }
            objOverlayContentPathBindings16 = obj22;
        }
        String strResolveContentBindingKey16 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "fixedHeightSize") : null;
        if (strResolveContentBindingKey16 != null) {
            Object objResolveStateRef16 = StateLookupKt.resolveStateRef(strResolveContentBindingKey16, accumulatedState);
            if (objResolveStateRef16 != null) {
                BindingLoggerKt.logContentBinding("fixedHeightSize", strResolveContentBindingKey16, objResolveStateRef16);
                Object objUnwrapForCoercion16 = BindCoercionKt.unwrapForCoercion(objResolveStateRef16);
                if ((objUnwrapForCoercion16 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion16) && AbstractC22676k.m65745e(accumulatedState.get(obj52), Boolean.TRUE)) {
                    objOverlayContentPathBindings16 = null;
                } else {
                    objOverlayContentPathBindings16 = BindCoercionKt.unwrapForCoercion(objResolveStateRef16);
                    if (objOverlayContentPathBindings16 == null) {
                        objOverlayContentPathBindings16 = null;
                    } else if (objOverlayContentPathBindings16 instanceof JsonElement) {
                        JsonElement jsonElement14 = (JsonElement) objOverlayContentPathBindings16;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings16 = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonElement14);
                        } catch (Exception unused31) {
                            objOverlayContentPathBindings16 = null;
                        }
                    } else if (!(objOverlayContentPathBindings16 instanceof Double)) {
                        if (objOverlayContentPathBindings16 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a16 = AbstractC22671h0.m65688a(Double.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a16, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings16 = (Double) Integer.valueOf(((Number) objOverlayContentPathBindings16).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a16, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings16 = (Double) Long.valueOf(((Number) objOverlayContentPathBindings16).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a16, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings16 = Double.valueOf(((Number) objOverlayContentPathBindings16).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a16, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings16 = (Double) Float.valueOf(((Number) objOverlayContentPathBindings16).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a16, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings16 = (Double) Short.valueOf(((Number) objOverlayContentPathBindings16).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a16, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings16 = (Double) Byte.valueOf(((Number) objOverlayContentPathBindings16).byteValue());
                            } else {
                                objOverlayContentPathBindings16 = null;
                            }
                        } else if (objOverlayContentPathBindings16 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c14 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings16);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings16 = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonPrimitiveM1841c14);
                            } catch (Exception unused32) {
                                objOverlayContentPathBindings16 = null;
                            }
                            if (objOverlayContentPathBindings16 == null) {
                                objOverlayContentPathBindings16 = null;
                            }
                        } else {
                            objOverlayContentPathBindings16 = null;
                        }
                    }
                    if (objOverlayContentPathBindings16 == null) {
                        objOverlayContentPathBindings16 = fixedHeightSize;
                    }
                }
            }
        } else if (objOverlayContentPathBindings16 != null) {
            objOverlayContentPathBindings16 = ContentPathBindingsKt.overlayContentPathBindings(map, "fixedHeightSize", accumulatedState, objOverlayContentPathBindings16, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$76
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj54) {
                    return invoke((Double) obj54);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Double v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(DoubleSerializer.INSTANCE, v13);
                    } catch (Exception unused33) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$77
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Double, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Double invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, json);
                    } catch (Exception unused33) {
                        return null;
                    }
                }
            });
        }
        Double d3 = (Double) DotPathBindingsKt.overlayAggregateBinding(map2, "fixedHeightSize", accumulatedState, objOverlayContentPathBindings16, "fixedHeightSize", new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$78
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj54) {
                return invoke((Double) obj54);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Double d14) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(DoubleSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, d14, interfaceC37138cM122336d);
                } catch (Exception unused33) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$79
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Double, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Double invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, json);
                } catch (Exception unused33) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$80
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Double, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Double, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Double invoke(Object obj54) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj54);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement15 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonElement15);
                    } catch (Exception unused33) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof Double) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c15 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonPrimitiveM1841c15);
                    } catch (Exception unused34) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Double.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (Double) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (Double) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (Double) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (Double) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (Double) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        Map<String, String> bindings = selectableCellModel.getBindings();
        if (bindings == null) {
            objOverlayContentPathBindings17 = null;
        } else {
            if (bindings instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind22 = ((WithGeneratedBindings) bindings).bind(accumulatedState);
                if (!(withGeneratedBindingsBind22 instanceof Map)) {
                    withGeneratedBindingsBind22 = null;
                }
                map3 = (Map) withGeneratedBindingsBind22;
                if (map3 == null) {
                    map3 = bindings;
                }
            } else if (bindings instanceof List) {
                Iterable iterable16 = (Iterable) bindings;
                List arrayList17 = new ArrayList(AbstractC25267u.m74163i0(iterable16, 10));
                for (Object obj54 : iterable16) {
                    WithGeneratedBindings withGeneratedBindings17 = obj54 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj54 : null;
                    if (withGeneratedBindings17 != null && (withGeneratedBindingsBind17 = withGeneratedBindings17.bind(accumulatedState)) != null) {
                        obj54 = withGeneratedBindingsBind17;
                    }
                    arrayList17.add(obj54);
                }
                map3 = (Map) arrayList17;
            } else {
                map3 = bindings;
            }
            objOverlayContentPathBindings17 = map3;
        }
        String strResolveContentBindingKey17 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "bindings") : null;
        if (strResolveContentBindingKey17 != null) {
            Object objResolveStateRef17 = StateLookupKt.resolveStateRef(strResolveContentBindingKey17, accumulatedState);
            if (objResolveStateRef17 != null) {
                BindingLoggerKt.logContentBinding("bindings", strResolveContentBindingKey17, objResolveStateRef17);
                Object objUnwrapForCoercion17 = BindCoercionKt.unwrapForCoercion(objResolveStateRef17);
                if ((objUnwrapForCoercion17 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion17) && AbstractC22676k.m65745e(accumulatedState.get(obj52), Boolean.TRUE)) {
                    objOverlayContentPathBindings17 = null;
                } else {
                    objOverlayContentPathBindings17 = BindCoercionKt.unwrapForCoercion(objResolveStateRef17);
                    if (objOverlayContentPathBindings17 == null) {
                        objOverlayContentPathBindings17 = null;
                    } else if (objOverlayContentPathBindings17 instanceof JsonElement) {
                        JsonElement jsonElement15 = (JsonElement) objOverlayContentPathBindings17;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer = StringSerializer.INSTANCE;
                            objOverlayContentPathBindings17 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer, stringSerializer), jsonElement15);
                        } catch (Exception unused33) {
                            objOverlayContentPathBindings17 = null;
                        }
                    } else if (!(objOverlayContentPathBindings17 instanceof Map)) {
                        if (objOverlayContentPathBindings17 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a17 = AbstractC22671h0.m65688a(Map.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a17, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings17 = (Map) Integer.valueOf(((Number) objOverlayContentPathBindings17).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a17, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings17 = (Map) Long.valueOf(((Number) objOverlayContentPathBindings17).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a17, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings17 = (Map) Double.valueOf(((Number) objOverlayContentPathBindings17).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a17, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings17 = (Map) Float.valueOf(((Number) objOverlayContentPathBindings17).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a17, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings17 = (Map) Short.valueOf(((Number) objOverlayContentPathBindings17).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a17, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings17 = (Map) Byte.valueOf(((Number) objOverlayContentPathBindings17).byteValue());
                            } else {
                                objOverlayContentPathBindings17 = null;
                            }
                        } else if (objOverlayContentPathBindings17 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c15 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings17);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                                objOverlayContentPathBindings17 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), jsonPrimitiveM1841c15);
                            } catch (Exception unused34) {
                                objOverlayContentPathBindings17 = null;
                            }
                            if (objOverlayContentPathBindings17 == null) {
                                objOverlayContentPathBindings17 = null;
                            }
                        } else {
                            objOverlayContentPathBindings17 = null;
                        }
                    }
                    if (objOverlayContentPathBindings17 == null) {
                        objOverlayContentPathBindings17 = bindings;
                    }
                }
            }
        } else if (objOverlayContentPathBindings17 != null) {
            objOverlayContentPathBindings17 = ContentPathBindingsKt.overlayContentPathBindings(map, "bindings", accumulatedState, objOverlayContentPathBindings17, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$81
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj55) {
                    return invoke((Map<String, ? extends String>) obj55);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Map<String, ? extends String> v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                        LinkedHashMapSerializer linkedHashMapSerializer = new LinkedHashMapSerializer(stringSerializer3, stringSerializer3);
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, v13, linkedHashMapSerializer);
                    } catch (Exception unused35) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$82
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Map<String, ? extends String> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), json);
                    } catch (Exception unused35) {
                        return null;
                    }
                }
            });
        }
        Map map5 = (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "bindings", accumulatedState, objOverlayContentPathBindings17, "bindings", new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$83
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj55) {
                return invoke((Map<String, ? extends String>) obj55);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Map<String, ? extends String> map6) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, map6, interfaceC37138cM122336d);
                } catch (Exception unused35) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$84
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends String> invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), json);
                } catch (Exception unused35) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$85
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends java.lang.String>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends String> invoke(Object obj55) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj55);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement16 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), jsonElement16);
                    } catch (Exception unused35) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof Map) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c16 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer4 = StringSerializer.INSTANCE;
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer4, stringSerializer4), jsonPrimitiveM1841c16);
                    } catch (Exception unused36) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (Map) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (Map) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (Map) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (Map) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (Map) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (Map) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        Map<String, AggregateBinding> aggregateBindings = selectableCellModel.getAggregateBindings();
        if (aggregateBindings == null) {
            obj23 = null;
        } else {
            if (aggregateBindings instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind23 = ((WithGeneratedBindings) aggregateBindings).bind(accumulatedState);
                if (!(withGeneratedBindingsBind23 instanceof Map)) {
                    withGeneratedBindingsBind23 = null;
                }
                map4 = (Map) withGeneratedBindingsBind23;
                if (map4 == null) {
                    map4 = aggregateBindings;
                }
            } else if (aggregateBindings instanceof List) {
                Iterable iterable17 = (Iterable) aggregateBindings;
                List arrayList18 = new ArrayList(AbstractC25267u.m74163i0(iterable17, 10));
                for (Object obj55 : iterable17) {
                    WithGeneratedBindings withGeneratedBindings18 = obj55 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj55 : null;
                    if (withGeneratedBindings18 != null && (withGeneratedBindingsBind18 = withGeneratedBindings18.bind(accumulatedState)) != null) {
                        obj55 = withGeneratedBindingsBind18;
                    }
                    arrayList18.add(obj55);
                }
                map4 = (Map) arrayList18;
            } else {
                map4 = aggregateBindings;
            }
            obj23 = map4;
        }
        String strResolveContentBindingKey18 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "aggregateBindings") : null;
        if (strResolveContentBindingKey18 != null) {
            Object objResolveStateRef18 = StateLookupKt.resolveStateRef(strResolveContentBindingKey18, accumulatedState);
            if (objResolveStateRef18 != null) {
                BindingLoggerKt.logContentBinding("aggregateBindings", strResolveContentBindingKey18, objResolveStateRef18);
                Object objUnwrapForCoercion18 = BindCoercionKt.unwrapForCoercion(objResolveStateRef18);
                if ((objUnwrapForCoercion18 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion18) && AbstractC22676k.m65745e(accumulatedState.get(obj52), Boolean.TRUE)) {
                    obj23 = null;
                } else {
                    Object objUnwrapForCoercion19 = BindCoercionKt.unwrapForCoercion(objResolveStateRef18);
                    if (objUnwrapForCoercion19 == null) {
                        objOverlayContentPathBindings18 = null;
                    } else if (objUnwrapForCoercion19 instanceof JsonElement) {
                        JsonElement jsonElement16 = (JsonElement) objUnwrapForCoercion19;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings18 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement16);
                        } catch (Exception unused35) {
                            objOverlayContentPathBindings18 = null;
                        }
                    } else if (objUnwrapForCoercion19 instanceof Map) {
                        objOverlayContentPathBindings18 = objUnwrapForCoercion19;
                    } else {
                        if (objUnwrapForCoercion19 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a18 = AbstractC22671h0.m65688a(Map.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a18, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings18 = (Map) Integer.valueOf(((Number) objUnwrapForCoercion19).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a18, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings18 = (Map) Long.valueOf(((Number) objUnwrapForCoercion19).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a18, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings18 = (Map) Double.valueOf(((Number) objUnwrapForCoercion19).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a18, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings18 = (Map) Float.valueOf(((Number) objUnwrapForCoercion19).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a18, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings18 = (Map) Short.valueOf(((Number) objUnwrapForCoercion19).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a18, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings18 = (Map) Byte.valueOf(((Number) objUnwrapForCoercion19).byteValue());
                            }
                        } else if (objUnwrapForCoercion19 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c16 = AbstractC0770m.m1841c((String) objUnwrapForCoercion19);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objUnwrapForCoercion19 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c16);
                            } catch (Exception unused36) {
                                objUnwrapForCoercion19 = null;
                            }
                            if (objUnwrapForCoercion19 != null) {
                                objOverlayContentPathBindings18 = objUnwrapForCoercion19;
                            }
                        }
                        objOverlayContentPathBindings18 = null;
                    }
                    obj23 = objOverlayContentPathBindings18 == null ? aggregateBindings : objOverlayContentPathBindings18;
                }
            }
        } else if (obj23 != null) {
            objOverlayContentPathBindings18 = ContentPathBindingsKt.overlayContentPathBindings(map, "aggregateBindings", accumulatedState, obj23, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$86
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj56) {
                    return invoke((Map<String, ? extends AggregateBinding>) obj56);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Map<String, ? extends AggregateBinding> v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        LinkedHashMapSerializer linkedHashMapSerializer = new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer());
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, v13, linkedHashMapSerializer);
                    } catch (Exception unused37) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$87
                /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Map<String, ? extends AggregateBinding> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), json);
                    } catch (Exception unused37) {
                        return null;
                    }
                }
            });
        }
        return (SelectableCellModel) ContentBindingResolverKt.copyBindingsFrom(new SelectableCellModel(str, str2, str3, str4, str5, zBooleanValue, str6, zBooleanValue2, zBooleanValue3, zBooleanValue4, action4, genericInteraction, action5, list3, str7, d3, map5, (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "aggregateBindings", accumulatedState, obj23, "aggregateBindings", new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$88
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj56) {
                return invoke((Map<String, ? extends AggregateBinding>) obj56);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Map<String, ? extends AggregateBinding> map6) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, map6, interfaceC37138cM122336d);
                } catch (Exception unused37) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$89
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends AggregateBinding> invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), json);
                } catch (Exception unused37) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SelectableCellModelStateBindingKt$generatedBind$$inlined$resolveBinding$90
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends AggregateBinding> invoke(Object obj56) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj56);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement17 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement17);
                    } catch (Exception unused37) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof Map) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c17 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c17);
                    } catch (Exception unused38) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (Map) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (Map) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (Map) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (Map) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (Map) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (Map) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        })), selectableCellModel);
    }

    public static /* synthetic */ SelectableCellModel generatedBind$default(SelectableCellModel selectableCellModel, Map map, Map map2, Map map3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map2 = null;
        }
        return generatedBind(selectableCellModel, map, map2, map3);
    }
}
