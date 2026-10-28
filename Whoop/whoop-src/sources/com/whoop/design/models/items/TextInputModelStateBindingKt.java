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
import com.whoop.design.models.binding.StateBindingDeserializerKt;
import com.whoop.design.models.binding.StateLookupKt;
import com.whoop.navigation.models.GenericInteraction;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import m83.AbstractC25267u;
import p097ds.AbstractC12313p;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003¨\u0006\t"}, m65681d2 = {"generatedBind", "Lcom/whoop/design/models/items/TextInputModel;", "contentBinding", "", "", "aggregateBindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "accumulatedState", "", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TextInputModelStateBindingKt {
    /* JADX WARN: Code duplicated, block: B:1014:0x1220  */
    /* JADX WARN: Code duplicated, block: B:1033:0x1260  */
    /* JADX WARN: Code duplicated, block: B:1102:0x13b4  */
    /* JADX WARN: Code duplicated, block: B:1121:0x13f4  */
    /* JADX WARN: Code duplicated, block: B:1190:0x1548  */
    /* JADX WARN: Code duplicated, block: B:1209:0x1588  */
    /* JADX WARN: Code duplicated, block: B:1279:0x16ec  */
    /* JADX WARN: Code duplicated, block: B:128:0x0222  */
    /* JADX WARN: Code duplicated, block: B:1298:0x172c  */
    /* JADX WARN: Code duplicated, block: B:1368:0x1890  */
    /* JADX WARN: Code duplicated, block: B:1394:0x18ee A[PHI: r4
      0x18ee: PHI (r4v130 java.lang.Object) = (r4v106 java.lang.Object), (r4v110 java.lang.Object) binds: [B:1393:0x18ec, B:1420:0x19a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:147:0x0262  */
    /* JADX WARN: Code duplicated, block: B:216:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:235:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:304:0x054a  */
    /* JADX WARN: Code duplicated, block: B:323:0x058a  */
    /* JADX WARN: Code duplicated, block: B:392:0x06de  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:411:0x071e  */
    /* JADX WARN: Code duplicated, block: B:480:0x0872  */
    /* JADX WARN: Code duplicated, block: B:499:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:568:0x0a06  */
    /* JADX WARN: Code duplicated, block: B:587:0x0a46  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:656:0x0b9a  */
    /* JADX WARN: Code duplicated, block: B:675:0x0bda  */
    /* JADX WARN: Code duplicated, block: B:745:0x0d30  */
    /* JADX WARN: Code duplicated, block: B:764:0x0d70  */
    /* JADX WARN: Code duplicated, block: B:835:0x0ee0  */
    /* JADX WARN: Code duplicated, block: B:854:0x0f21  */
    /* JADX WARN: Code duplicated, block: B:924:0x1082  */
    /* JADX WARN: Code duplicated, block: B:942:0x10c1  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final TextInputModel generatedBind(TextInputModel textInputModel, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, ? extends Object> accumulatedState) {
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
        Object obj9;
        WithGeneratedBindings withGeneratedBindingsBind6;
        Object objOverlayContentPathBindings6;
        Object obj10;
        Object obj11;
        WithGeneratedBindings withGeneratedBindingsBind7;
        Object objOverlayContentPathBindings7;
        Object obj12;
        Object obj13;
        WithGeneratedBindings withGeneratedBindingsBind8;
        Object objOverlayContentPathBindings8;
        Object obj14;
        Object obj15;
        WithGeneratedBindings withGeneratedBindingsBind9;
        Object objOverlayContentPathBindings9;
        Object obj16;
        Boolean bool;
        WithGeneratedBindings withGeneratedBindingsBind10;
        Object objOverlayContentPathBindings10;
        Object obj17;
        Boolean bool2;
        WithGeneratedBindings withGeneratedBindingsBind11;
        Object objOverlayContentPathBindings11;
        Object obj18;
        Object obj19;
        WithGeneratedBindings withGeneratedBindingsBind12;
        Object objOverlayContentPathBindings12;
        Object obj20;
        Object obj21;
        WithGeneratedBindings withGeneratedBindingsBind13;
        Object objOverlayContentPathBindings13;
        Object obj22;
        Object obj23;
        WithGeneratedBindings withGeneratedBindingsBind14;
        Object objOverlayContentPathBindings14;
        Object obj24;
        Object obj25;
        WithGeneratedBindings withGeneratedBindingsBind15;
        Object objOverlayContentPathBindings15;
        Object obj26;
        Object obj27;
        WithGeneratedBindings withGeneratedBindingsBind16;
        Object obj28;
        Object objOverlayContentPathBindings16;
        AbstractC22676k.m65750j(textInputModel, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if ((map == null || map.isEmpty()) && ((map2 == null || map2.isEmpty()) && accumulatedState.isEmpty())) {
            return textInputModel;
        }
        Object id4 = textInputModel.getId();
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
            for (Object obj29 : iterable) {
                WithGeneratedBindings withGeneratedBindings = obj29 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj29 : null;
                if (withGeneratedBindings != null && (withGeneratedBindingsBind = withGeneratedBindings.bind(accumulatedState)) != null) {
                    obj29 = withGeneratedBindingsBind;
                }
                arrayList.add(obj29);
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
            objOverlayContentPathBindings = ContentPathBindingsKt.overlayContentPathBindings(map, "id", accumulatedState, objOverlayContentPathBindings, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$1
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
                    } catch (Exception unused3) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$2
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
        String id5 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "id", accumulatedState, objOverlayContentPathBindings, "id", new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$3
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj30) {
                return invoke((String) obj30);
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
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$4
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
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$5
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj30) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj30);
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
            id5 = textInputModel.getId();
        }
        String str = id5;
        Object label = textInputModel.getLabel();
        if (label == null) {
            objOverlayContentPathBindings2 = null;
        } else {
            if (label instanceof WithGeneratedBindings) {
                Object objBind2 = ((WithGeneratedBindings) label).bind(accumulatedState);
                if (!(objBind2 instanceof String)) {
                    objBind2 = null;
                }
                obj = (String) objBind2;
                if (obj == null) {
                    obj = label;
                }
            } else if (label instanceof List) {
                Iterable iterable2 = (Iterable) label;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
                for (Object obj30 : iterable2) {
                    WithGeneratedBindings withGeneratedBindings2 = obj30 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj30 : null;
                    if (withGeneratedBindings2 != null && (withGeneratedBindingsBind2 = withGeneratedBindings2.bind(accumulatedState)) != null) {
                        obj30 = withGeneratedBindingsBind2;
                    }
                    arrayList2.add(obj30);
                }
                obj = (String) arrayList2;
            } else {
                obj = label;
            }
            objOverlayContentPathBindings2 = obj;
        }
        String strResolveContentBindingKey2 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "label") : null;
        if (strResolveContentBindingKey2 != null) {
            Object objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
            if (objResolveStateRef2 != null) {
                BindingLoggerKt.logContentBinding("label", strResolveContentBindingKey2, objResolveStateRef2);
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
                    objOverlayContentPathBindings2 = label;
                }
            } else {
                obj2 = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
            }
        } else {
            obj2 = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
            if (objOverlayContentPathBindings2 != null) {
                objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(map, "label", accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$6
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj31) {
                        return invoke((String) obj31);
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
                }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$7
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
        Object obj31 = obj2;
        String str2 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "label", accumulatedState, objOverlayContentPathBindings2, "label", new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$8
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj32) {
                return invoke((String) obj32);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str3, interfaceC37138cM122336d);
                } catch (Exception unused5) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$9
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
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$10
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj32) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj32);
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
        Object placeholder = textInputModel.getPlaceholder();
        if (placeholder == null) {
            objOverlayContentPathBindings3 = null;
        } else {
            if (placeholder instanceof WithGeneratedBindings) {
                Object objBind3 = ((WithGeneratedBindings) placeholder).bind(accumulatedState);
                if (!(objBind3 instanceof String)) {
                    objBind3 = null;
                }
                obj3 = (String) objBind3;
                if (obj3 == null) {
                    obj3 = placeholder;
                }
            } else if (placeholder instanceof List) {
                Iterable iterable3 = (Iterable) placeholder;
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable3, 10));
                for (Object obj32 : iterable3) {
                    WithGeneratedBindings withGeneratedBindings3 = obj32 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj32 : null;
                    if (withGeneratedBindings3 != null && (withGeneratedBindingsBind3 = withGeneratedBindings3.bind(accumulatedState)) != null) {
                        obj32 = withGeneratedBindingsBind3;
                    }
                    arrayList3.add(obj32);
                }
                obj3 = (String) arrayList3;
            } else {
                obj3 = placeholder;
            }
            objOverlayContentPathBindings3 = obj3;
        }
        String strResolveContentBindingKey3 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "placeholder") : null;
        if (strResolveContentBindingKey3 != null) {
            Object objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
            if (objResolveStateRef3 != null) {
                BindingLoggerKt.logContentBinding("placeholder", strResolveContentBindingKey3, objResolveStateRef3);
                Object objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if ((objUnwrapForCoercion3 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion3)) {
                    obj4 = obj31;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj4), Boolean.TRUE)) {
                        objOverlayContentPathBindings3 = null;
                    }
                } else {
                    obj4 = obj31;
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
                    objOverlayContentPathBindings3 = placeholder;
                }
            } else {
                obj4 = obj31;
            }
        } else {
            obj4 = obj31;
            if (objOverlayContentPathBindings3 != null) {
                objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(map, "placeholder", accumulatedState, objOverlayContentPathBindings3, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$11
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj33) {
                        return invoke((String) obj33);
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
                }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$12
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
        Object obj33 = obj4;
        String str3 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "placeholder", accumulatedState, objOverlayContentPathBindings3, "placeholder", new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$13
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj34) {
                return invoke((String) obj34);
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
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$14
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
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$15
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj34) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj34);
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
        Object text = textInputModel.getText();
        if (text == null) {
            objOverlayContentPathBindings4 = null;
        } else {
            if (text instanceof WithGeneratedBindings) {
                Object objBind4 = ((WithGeneratedBindings) text).bind(accumulatedState);
                if (!(objBind4 instanceof String)) {
                    objBind4 = null;
                }
                obj5 = (String) objBind4;
                if (obj5 == null) {
                    obj5 = text;
                }
            } else if (text instanceof List) {
                Iterable iterable4 = (Iterable) text;
                ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable4, 10));
                for (Object obj34 : iterable4) {
                    WithGeneratedBindings withGeneratedBindings4 = obj34 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj34 : null;
                    if (withGeneratedBindings4 != null && (withGeneratedBindingsBind4 = withGeneratedBindings4.bind(accumulatedState)) != null) {
                        obj34 = withGeneratedBindingsBind4;
                    }
                    arrayList4.add(obj34);
                }
                obj5 = (String) arrayList4;
            } else {
                obj5 = text;
            }
            objOverlayContentPathBindings4 = obj5;
        }
        String strResolveContentBindingKey4 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "text") : null;
        if (strResolveContentBindingKey4 != null) {
            Object objResolveStateRef4 = StateLookupKt.resolveStateRef(strResolveContentBindingKey4, accumulatedState);
            if (objResolveStateRef4 != null) {
                BindingLoggerKt.logContentBinding("text", strResolveContentBindingKey4, objResolveStateRef4);
                Object objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if ((objUnwrapForCoercion4 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion4)) {
                    obj6 = obj33;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj6), Boolean.TRUE)) {
                        objOverlayContentPathBindings4 = null;
                    }
                } else {
                    obj6 = obj33;
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
                    objOverlayContentPathBindings4 = text;
                }
            } else {
                obj6 = obj33;
            }
        } else {
            obj6 = obj33;
            if (objOverlayContentPathBindings4 != null) {
                objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(map, "text", accumulatedState, objOverlayContentPathBindings4, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$16
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj35) {
                        return invoke((String) obj35);
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
                }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$17
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
        Object obj35 = obj6;
        String str4 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "text", accumulatedState, objOverlayContentPathBindings4, "text", new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$18
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj36) {
                return invoke((String) obj36);
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
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$19
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
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$20
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj36) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj36);
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
        Object icon = textInputModel.getIcon();
        if (icon == null) {
            objOverlayContentPathBindings5 = null;
        } else {
            if (icon instanceof WithGeneratedBindings) {
                Object objBind5 = ((WithGeneratedBindings) icon).bind(accumulatedState);
                if (!(objBind5 instanceof String)) {
                    objBind5 = null;
                }
                obj7 = (String) objBind5;
                if (obj7 == null) {
                    obj7 = icon;
                }
            } else if (icon instanceof List) {
                Iterable iterable5 = (Iterable) icon;
                ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(iterable5, 10));
                for (Object obj36 : iterable5) {
                    WithGeneratedBindings withGeneratedBindings5 = obj36 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj36 : null;
                    if (withGeneratedBindings5 != null && (withGeneratedBindingsBind5 = withGeneratedBindings5.bind(accumulatedState)) != null) {
                        obj36 = withGeneratedBindingsBind5;
                    }
                    arrayList5.add(obj36);
                }
                obj7 = (String) arrayList5;
            } else {
                obj7 = icon;
            }
            objOverlayContentPathBindings5 = obj7;
        }
        String strResolveContentBindingKey5 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "icon") : null;
        if (strResolveContentBindingKey5 != null) {
            Object objResolveStateRef5 = StateLookupKt.resolveStateRef(strResolveContentBindingKey5, accumulatedState);
            if (objResolveStateRef5 != null) {
                BindingLoggerKt.logContentBinding("icon", strResolveContentBindingKey5, objResolveStateRef5);
                Object objUnwrapForCoercion5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                if ((objUnwrapForCoercion5 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion5)) {
                    obj8 = obj35;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj8), Boolean.TRUE)) {
                        objOverlayContentPathBindings5 = null;
                    }
                } else {
                    obj8 = obj35;
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
                    objOverlayContentPathBindings5 = icon;
                }
            } else {
                obj8 = obj35;
            }
        } else {
            obj8 = obj35;
            if (objOverlayContentPathBindings5 != null) {
                objOverlayContentPathBindings5 = ContentPathBindingsKt.overlayContentPathBindings(map, "icon", accumulatedState, objOverlayContentPathBindings5, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$21
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj37) {
                        return invoke((String) obj37);
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
                }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$22
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
        Object obj37 = obj8;
        String str5 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "icon", accumulatedState, objOverlayContentPathBindings5, "icon", new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$23
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj38) {
                return invoke((String) obj38);
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
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$24
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
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$25
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj38) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj38);
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
        Object suffix = textInputModel.getSuffix();
        if (suffix == null) {
            objOverlayContentPathBindings6 = null;
        } else {
            if (suffix instanceof WithGeneratedBindings) {
                Object objBind6 = ((WithGeneratedBindings) suffix).bind(accumulatedState);
                if (!(objBind6 instanceof String)) {
                    objBind6 = null;
                }
                obj9 = (String) objBind6;
                if (obj9 == null) {
                    obj9 = suffix;
                }
            } else if (suffix instanceof List) {
                Iterable iterable6 = (Iterable) suffix;
                ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(iterable6, 10));
                for (Object obj38 : iterable6) {
                    WithGeneratedBindings withGeneratedBindings6 = obj38 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj38 : null;
                    if (withGeneratedBindings6 != null && (withGeneratedBindingsBind6 = withGeneratedBindings6.bind(accumulatedState)) != null) {
                        obj38 = withGeneratedBindingsBind6;
                    }
                    arrayList6.add(obj38);
                }
                obj9 = (String) arrayList6;
            } else {
                obj9 = suffix;
            }
            objOverlayContentPathBindings6 = obj9;
        }
        String strResolveContentBindingKey6 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "suffix") : null;
        if (strResolveContentBindingKey6 != null) {
            Object objResolveStateRef6 = StateLookupKt.resolveStateRef(strResolveContentBindingKey6, accumulatedState);
            if (objResolveStateRef6 != null) {
                BindingLoggerKt.logContentBinding("suffix", strResolveContentBindingKey6, objResolveStateRef6);
                Object objUnwrapForCoercion6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef6);
                if ((objUnwrapForCoercion6 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion6)) {
                    obj10 = obj37;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj10), Boolean.TRUE)) {
                        objOverlayContentPathBindings6 = null;
                    }
                } else {
                    obj10 = obj37;
                }
                objOverlayContentPathBindings6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef6);
                if (objOverlayContentPathBindings6 == null) {
                    objOverlayContentPathBindings6 = null;
                } else if (objOverlayContentPathBindings6 instanceof JsonElement) {
                    JsonElement jsonElement6 = (JsonElement) objOverlayContentPathBindings6;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings6 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement6);
                    } catch (Exception unused11) {
                        objOverlayContentPathBindings6 = null;
                    }
                } else {
                    boolean z17 = objOverlayContentPathBindings6 instanceof String;
                    if (!z17) {
                        if (objOverlayContentPathBindings6 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a6 = AbstractC22671h0.m65688a(String.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings6 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings6).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings6 = (String) Long.valueOf(((Number) objOverlayContentPathBindings6).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings6 = (String) Double.valueOf(((Number) objOverlayContentPathBindings6).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings6 = (String) Float.valueOf(((Number) objOverlayContentPathBindings6).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings6 = (String) Short.valueOf(((Number) objOverlayContentPathBindings6).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings6 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings6).byteValue());
                            } else {
                                objOverlayContentPathBindings6 = null;
                            }
                        } else if (z17) {
                            JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings6);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings6 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c6);
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
                }
                if (objOverlayContentPathBindings6 == null) {
                    objOverlayContentPathBindings6 = suffix;
                }
            } else {
                obj10 = obj37;
            }
        } else {
            obj10 = obj37;
            if (objOverlayContentPathBindings6 != null) {
                objOverlayContentPathBindings6 = ContentPathBindingsKt.overlayContentPathBindings(map, "suffix", accumulatedState, objOverlayContentPathBindings6, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$26
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj39) {
                        return invoke((String) obj39);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(String v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(StringSerializer.INSTANCE, v13);
                        } catch (Exception unused13) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$27
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final String invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                        } catch (Exception unused13) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj39 = obj10;
        String str6 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "suffix", accumulatedState, objOverlayContentPathBindings6, "suffix", new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$28
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj40) {
                return invoke((String) obj40);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str7) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str7, interfaceC37138cM122336d);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$29
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$30
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj40) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj40);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement7 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement7);
                    } catch (Exception unused13) {
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
                    JsonPrimitive jsonPrimitiveM1841c7 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c7);
                    } catch (Exception unused14) {
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
        Object caption = textInputModel.getCaption();
        if (caption == null) {
            objOverlayContentPathBindings7 = null;
        } else {
            if (caption instanceof WithGeneratedBindings) {
                Object objBind7 = ((WithGeneratedBindings) caption).bind(accumulatedState);
                if (!(objBind7 instanceof String)) {
                    objBind7 = null;
                }
                obj11 = (String) objBind7;
                if (obj11 == null) {
                    obj11 = caption;
                }
            } else if (caption instanceof List) {
                Iterable iterable7 = (Iterable) caption;
                ArrayList arrayList7 = new ArrayList(AbstractC25267u.m74163i0(iterable7, 10));
                for (Object obj40 : iterable7) {
                    WithGeneratedBindings withGeneratedBindings7 = obj40 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj40 : null;
                    if (withGeneratedBindings7 != null && (withGeneratedBindingsBind7 = withGeneratedBindings7.bind(accumulatedState)) != null) {
                        obj40 = withGeneratedBindingsBind7;
                    }
                    arrayList7.add(obj40);
                }
                obj11 = (String) arrayList7;
            } else {
                obj11 = caption;
            }
            objOverlayContentPathBindings7 = obj11;
        }
        String strResolveContentBindingKey7 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "caption") : null;
        if (strResolveContentBindingKey7 != null) {
            Object objResolveStateRef7 = StateLookupKt.resolveStateRef(strResolveContentBindingKey7, accumulatedState);
            if (objResolveStateRef7 != null) {
                BindingLoggerKt.logContentBinding("caption", strResolveContentBindingKey7, objResolveStateRef7);
                Object objUnwrapForCoercion7 = BindCoercionKt.unwrapForCoercion(objResolveStateRef7);
                if ((objUnwrapForCoercion7 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion7)) {
                    obj12 = obj39;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj12), Boolean.TRUE)) {
                        objOverlayContentPathBindings7 = null;
                    }
                } else {
                    obj12 = obj39;
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
                    boolean z18 = objOverlayContentPathBindings7 instanceof String;
                    if (!z18) {
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
                        } else if (z18) {
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
                    objOverlayContentPathBindings7 = caption;
                }
            } else {
                obj12 = obj39;
            }
        } else {
            obj12 = obj39;
            if (objOverlayContentPathBindings7 != null) {
                objOverlayContentPathBindings7 = ContentPathBindingsKt.overlayContentPathBindings(map, "caption", accumulatedState, objOverlayContentPathBindings7, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$31
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj41) {
                        return invoke((String) obj41);
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
                }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$32
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
        Object obj41 = obj12;
        String str7 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "caption", accumulatedState, objOverlayContentPathBindings7, "caption", new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$33
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj42) {
                return invoke((String) obj42);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str8) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str8, interfaceC37138cM122336d);
                } catch (Exception unused15) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$34
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
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$35
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj42) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj42);
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
                boolean z19 = UnwrapForCoercion instanceof String;
                if (z19) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!z19) {
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
        Object maxLength = textInputModel.getMaxLength();
        if (maxLength == null) {
            objOverlayContentPathBindings8 = null;
        } else {
            if (maxLength instanceof WithGeneratedBindings) {
                Object objBind8 = ((WithGeneratedBindings) maxLength).bind(accumulatedState);
                if (!(objBind8 instanceof Integer)) {
                    objBind8 = null;
                }
                obj13 = (Integer) objBind8;
                if (obj13 == null) {
                    obj13 = maxLength;
                }
            } else if (maxLength instanceof List) {
                Iterable iterable8 = (Iterable) maxLength;
                ArrayList arrayList8 = new ArrayList(AbstractC25267u.m74163i0(iterable8, 10));
                for (Object obj42 : iterable8) {
                    WithGeneratedBindings withGeneratedBindings8 = obj42 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj42 : null;
                    if (withGeneratedBindings8 != null && (withGeneratedBindingsBind8 = withGeneratedBindings8.bind(accumulatedState)) != null) {
                        obj42 = withGeneratedBindingsBind8;
                    }
                    arrayList8.add(obj42);
                }
                obj13 = (Integer) arrayList8;
            } else {
                obj13 = maxLength;
            }
            objOverlayContentPathBindings8 = obj13;
        }
        String strResolveContentBindingKey8 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "maxLength") : null;
        if (strResolveContentBindingKey8 != null) {
            Object objResolveStateRef8 = StateLookupKt.resolveStateRef(strResolveContentBindingKey8, accumulatedState);
            if (objResolveStateRef8 != null) {
                BindingLoggerKt.logContentBinding("maxLength", strResolveContentBindingKey8, objResolveStateRef8);
                Object objUnwrapForCoercion8 = BindCoercionKt.unwrapForCoercion(objResolveStateRef8);
                if ((objUnwrapForCoercion8 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion8)) {
                    obj14 = obj41;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj14), Boolean.TRUE)) {
                        objOverlayContentPathBindings8 = null;
                    }
                } else {
                    obj14 = obj41;
                }
                objOverlayContentPathBindings8 = BindCoercionKt.unwrapForCoercion(objResolveStateRef8);
                if (objOverlayContentPathBindings8 == null) {
                    objOverlayContentPathBindings8 = null;
                } else if (objOverlayContentPathBindings8 instanceof JsonElement) {
                    JsonElement jsonElement8 = (JsonElement) objOverlayContentPathBindings8;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings8 = StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, jsonElement8);
                    } catch (Exception unused15) {
                        objOverlayContentPathBindings8 = null;
                    }
                } else if (!(objOverlayContentPathBindings8 instanceof Integer)) {
                    if (objOverlayContentPathBindings8 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a8 = AbstractC22671h0.m65688a(Integer.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings8 = Integer.valueOf(((Number) objOverlayContentPathBindings8).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings8 = (Integer) Long.valueOf(((Number) objOverlayContentPathBindings8).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings8 = (Integer) Double.valueOf(((Number) objOverlayContentPathBindings8).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings8 = (Integer) Float.valueOf(((Number) objOverlayContentPathBindings8).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings8 = (Integer) Short.valueOf(((Number) objOverlayContentPathBindings8).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings8 = (Integer) Byte.valueOf(((Number) objOverlayContentPathBindings8).byteValue());
                        } else {
                            objOverlayContentPathBindings8 = null;
                        }
                    } else if (objOverlayContentPathBindings8 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c8 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings8);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings8 = StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, jsonPrimitiveM1841c8);
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
                    objOverlayContentPathBindings8 = maxLength;
                }
            } else {
                obj14 = obj41;
            }
        } else {
            obj14 = obj41;
            if (objOverlayContentPathBindings8 != null) {
                objOverlayContentPathBindings8 = ContentPathBindingsKt.overlayContentPathBindings(map, "maxLength", accumulatedState, objOverlayContentPathBindings8, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$36
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj43) {
                        return invoke((Integer) obj43);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(Integer v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(IntSerializer.INSTANCE, v13);
                        } catch (Exception unused17) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$37
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Integer, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Integer invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, json);
                        } catch (Exception unused17) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj43 = obj14;
        Integer num = (Integer) DotPathBindingsKt.overlayAggregateBinding(map2, "maxLength", accumulatedState, objOverlayContentPathBindings8, "maxLength", new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$38
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj44) {
                return invoke((Integer) obj44);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Integer num2) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(IntSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, num2, interfaceC37138cM122336d);
                } catch (Exception unused17) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$39
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Integer, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Integer invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, json);
                } catch (Exception unused17) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$40
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Integer, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Integer, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Integer invoke(Object obj44) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj44);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement9 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, jsonElement9);
                    } catch (Exception unused17) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof Integer) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c9 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, jsonPrimitiveM1841c9);
                    } catch (Exception unused18) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (Integer) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (Integer) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (Integer) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (Integer) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (Integer) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        Object keyboardType = textInputModel.getKeyboardType();
        if (keyboardType == null) {
            objOverlayContentPathBindings9 = null;
        } else {
            if (keyboardType instanceof WithGeneratedBindings) {
                Object objBind9 = ((WithGeneratedBindings) keyboardType).bind(accumulatedState);
                if (!(objBind9 instanceof TextInputKeyboardType)) {
                    objBind9 = null;
                }
                obj15 = (TextInputKeyboardType) objBind9;
                if (obj15 == null) {
                    obj15 = keyboardType;
                }
            } else if (keyboardType instanceof List) {
                Iterable iterable9 = (Iterable) keyboardType;
                ArrayList arrayList9 = new ArrayList(AbstractC25267u.m74163i0(iterable9, 10));
                for (Object obj44 : iterable9) {
                    WithGeneratedBindings withGeneratedBindings9 = obj44 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj44 : null;
                    if (withGeneratedBindings9 != null && (withGeneratedBindingsBind9 = withGeneratedBindings9.bind(accumulatedState)) != null) {
                        obj44 = withGeneratedBindingsBind9;
                    }
                    arrayList9.add(obj44);
                }
                obj15 = (TextInputKeyboardType) arrayList9;
            } else {
                obj15 = keyboardType;
            }
            objOverlayContentPathBindings9 = obj15;
        }
        String strResolveContentBindingKey9 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "keyboardType") : null;
        if (strResolveContentBindingKey9 != null) {
            Object objResolveStateRef9 = StateLookupKt.resolveStateRef(strResolveContentBindingKey9, accumulatedState);
            if (objResolveStateRef9 != null) {
                BindingLoggerKt.logContentBinding("keyboardType", strResolveContentBindingKey9, objResolveStateRef9);
                Object objUnwrapForCoercion9 = BindCoercionKt.unwrapForCoercion(objResolveStateRef9);
                if ((objUnwrapForCoercion9 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion9)) {
                    obj16 = obj43;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj16), Boolean.TRUE)) {
                        objOverlayContentPathBindings9 = null;
                    }
                } else {
                    obj16 = obj43;
                }
                objOverlayContentPathBindings9 = BindCoercionKt.unwrapForCoercion(objResolveStateRef9);
                if (objOverlayContentPathBindings9 == null) {
                    objOverlayContentPathBindings9 = null;
                } else if (objOverlayContentPathBindings9 instanceof JsonElement) {
                    JsonElement jsonElement9 = (JsonElement) objOverlayContentPathBindings9;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings9 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.TextInputKeyboardType", TextInputKeyboardType.values()), jsonElement9);
                    } catch (Exception unused17) {
                        objOverlayContentPathBindings9 = null;
                    }
                } else if (!(objOverlayContentPathBindings9 instanceof TextInputKeyboardType)) {
                    if (objOverlayContentPathBindings9 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a9 = AbstractC22671h0.m65688a(TextInputKeyboardType.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings9 = (TextInputKeyboardType) Integer.valueOf(((Number) objOverlayContentPathBindings9).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings9 = (TextInputKeyboardType) Long.valueOf(((Number) objOverlayContentPathBindings9).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings9 = (TextInputKeyboardType) Double.valueOf(((Number) objOverlayContentPathBindings9).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings9 = (TextInputKeyboardType) Float.valueOf(((Number) objOverlayContentPathBindings9).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings9 = (TextInputKeyboardType) Short.valueOf(((Number) objOverlayContentPathBindings9).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings9 = (TextInputKeyboardType) Byte.valueOf(((Number) objOverlayContentPathBindings9).byteValue());
                        } else {
                            objOverlayContentPathBindings9 = null;
                        }
                    } else if (objOverlayContentPathBindings9 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c9 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings9);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings9 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.TextInputKeyboardType", TextInputKeyboardType.values()), jsonPrimitiveM1841c9);
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
                    objOverlayContentPathBindings9 = keyboardType;
                }
            } else {
                obj16 = obj43;
            }
        } else {
            obj16 = obj43;
            if (objOverlayContentPathBindings9 != null) {
                objOverlayContentPathBindings9 = ContentPathBindingsKt.overlayContentPathBindings(map, "keyboardType", accumulatedState, objOverlayContentPathBindings9, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$41
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj45) {
                        return invoke((TextInputKeyboardType) obj45);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(TextInputKeyboardType v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            EnumSerializer enumSerializer = new EnumSerializer("com.whoop.design.models.items.TextInputKeyboardType", TextInputKeyboardType.values());
                            AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                            stateBindingJson.getClass();
                            return AbstractC12313p.m34290h0(stateBindingJson, v13, enumSerializer);
                        } catch (Exception unused19) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$42
                    /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.items.TextInputKeyboardType, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final TextInputKeyboardType invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.TextInputKeyboardType", TextInputKeyboardType.values()), json);
                        } catch (Exception unused19) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj45 = obj16;
        TextInputKeyboardType keyboardType2 = (TextInputKeyboardType) DotPathBindingsKt.overlayAggregateBinding(map2, "keyboardType", accumulatedState, objOverlayContentPathBindings9, "keyboardType", new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$43
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj46) {
                return invoke((TextInputKeyboardType) obj46);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(TextInputKeyboardType textInputKeyboardType) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new EnumSerializer("com.whoop.design.models.items.TextInputKeyboardType", TextInputKeyboardType.values()));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, textInputKeyboardType, interfaceC37138cM122336d);
                } catch (Exception unused19) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$44
            /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.items.TextInputKeyboardType, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final TextInputKeyboardType invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.TextInputKeyboardType", TextInputKeyboardType.values()), json);
                } catch (Exception unused19) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$45
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.items.TextInputKeyboardType, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.items.TextInputKeyboardType, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final TextInputKeyboardType invoke(Object obj46) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj46);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement10 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.TextInputKeyboardType", TextInputKeyboardType.values()), jsonElement10);
                    } catch (Exception unused19) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof TextInputKeyboardType) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c10 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.TextInputKeyboardType", TextInputKeyboardType.values()), jsonPrimitiveM1841c10);
                    } catch (Exception unused20) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(TextInputKeyboardType.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (TextInputKeyboardType) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (TextInputKeyboardType) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (TextInputKeyboardType) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (TextInputKeyboardType) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (TextInputKeyboardType) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (TextInputKeyboardType) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (keyboardType2 == null) {
            keyboardType2 = textInputModel.getKeyboardType();
        }
        TextInputKeyboardType textInputKeyboardType = keyboardType2;
        Object objValueOf = Boolean.valueOf(textInputModel.isSecure());
        if (objValueOf instanceof WithGeneratedBindings) {
            Object objBind10 = ((WithGeneratedBindings) objValueOf).bind(accumulatedState);
            if (!(objBind10 instanceof Boolean)) {
                objBind10 = null;
            }
            bool = (Boolean) objBind10;
            if (bool == null) {
                objOverlayContentPathBindings10 = objValueOf;
            } else {
                objOverlayContentPathBindings10 = bool;
            }
        } else if (objValueOf instanceof List) {
            Iterable iterable10 = (Iterable) objValueOf;
            ArrayList arrayList10 = new ArrayList(AbstractC25267u.m74163i0(iterable10, 10));
            for (Object obj46 : iterable10) {
                WithGeneratedBindings withGeneratedBindings10 = obj46 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj46 : null;
                if (withGeneratedBindings10 != null && (withGeneratedBindingsBind10 = withGeneratedBindings10.bind(accumulatedState)) != null) {
                    obj46 = withGeneratedBindingsBind10;
                }
                arrayList10.add(obj46);
            }
            bool = (Boolean) arrayList10;
            objOverlayContentPathBindings10 = bool;
        } else {
            objOverlayContentPathBindings10 = objValueOf;
        }
        String strResolveContentBindingKey10 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "isSecure") : null;
        if (strResolveContentBindingKey10 != null) {
            Object objResolveStateRef10 = StateLookupKt.resolveStateRef(strResolveContentBindingKey10, accumulatedState);
            if (objResolveStateRef10 != null) {
                BindingLoggerKt.logContentBinding("isSecure", strResolveContentBindingKey10, objResolveStateRef10);
                Object objUnwrapForCoercion10 = BindCoercionKt.unwrapForCoercion(objResolveStateRef10);
                if ((objUnwrapForCoercion10 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion10)) {
                    obj17 = obj45;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj17), Boolean.TRUE)) {
                        objOverlayContentPathBindings10 = null;
                    }
                } else {
                    obj17 = obj45;
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
                    objOverlayContentPathBindings10 = objValueOf;
                }
            } else {
                obj17 = obj45;
            }
        } else {
            obj17 = obj45;
            objOverlayContentPathBindings10 = ContentPathBindingsKt.overlayContentPathBindings(map, "isSecure", accumulatedState, objOverlayContentPathBindings10, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$46
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj47) {
                    return invoke((Boolean) obj47);
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
            }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$47
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
        Object obj47 = obj17;
        Boolean bool3 = (Boolean) DotPathBindingsKt.overlayAggregateBinding(map2, "isSecure", accumulatedState, objOverlayContentPathBindings10, "isSecure", new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$48
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj48) {
                return invoke((Boolean) obj48);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Boolean bool4) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(BooleanSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, bool4, interfaceC37138cM122336d);
                } catch (Exception unused21) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$49
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
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$50
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Boolean, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Boolean, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj48) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj48);
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
        boolean zBooleanValue = bool3 != null ? bool3.booleanValue() : textInputModel.isSecure();
        Object objValueOf2 = Boolean.valueOf(textInputModel.isDisabled());
        if (objValueOf2 instanceof WithGeneratedBindings) {
            Object objBind11 = ((WithGeneratedBindings) objValueOf2).bind(accumulatedState);
            if (!(objBind11 instanceof Boolean)) {
                objBind11 = null;
            }
            bool2 = (Boolean) objBind11;
            if (bool2 == null) {
                objOverlayContentPathBindings11 = objValueOf2;
            } else {
                objOverlayContentPathBindings11 = bool2;
            }
        } else if (objValueOf2 instanceof List) {
            Iterable iterable11 = (Iterable) objValueOf2;
            ArrayList arrayList11 = new ArrayList(AbstractC25267u.m74163i0(iterable11, 10));
            for (Object obj48 : iterable11) {
                WithGeneratedBindings withGeneratedBindings11 = obj48 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj48 : null;
                if (withGeneratedBindings11 != null && (withGeneratedBindingsBind11 = withGeneratedBindings11.bind(accumulatedState)) != null) {
                    obj48 = withGeneratedBindingsBind11;
                }
                arrayList11.add(obj48);
            }
            bool2 = (Boolean) arrayList11;
            objOverlayContentPathBindings11 = bool2;
        } else {
            objOverlayContentPathBindings11 = objValueOf2;
        }
        String strResolveContentBindingKey11 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "isDisabled") : null;
        if (strResolveContentBindingKey11 != null) {
            Object objResolveStateRef11 = StateLookupKt.resolveStateRef(strResolveContentBindingKey11, accumulatedState);
            if (objResolveStateRef11 != null) {
                BindingLoggerKt.logContentBinding("isDisabled", strResolveContentBindingKey11, objResolveStateRef11);
                Object objUnwrapForCoercion11 = BindCoercionKt.unwrapForCoercion(objResolveStateRef11);
                if ((objUnwrapForCoercion11 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion11)) {
                    obj18 = obj47;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj18), Boolean.TRUE)) {
                        objOverlayContentPathBindings11 = null;
                    }
                } else {
                    obj18 = obj47;
                }
                objOverlayContentPathBindings11 = BindCoercionKt.unwrapForCoercion(objResolveStateRef11);
                if (objOverlayContentPathBindings11 == null) {
                    objOverlayContentPathBindings11 = null;
                } else if (objOverlayContentPathBindings11 instanceof JsonElement) {
                    JsonElement jsonElement11 = (JsonElement) objOverlayContentPathBindings11;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings11 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement11);
                    } catch (Exception unused21) {
                        objOverlayContentPathBindings11 = null;
                    }
                } else if (!(objOverlayContentPathBindings11 instanceof Boolean)) {
                    if (objOverlayContentPathBindings11 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a11 = AbstractC22671h0.m65688a(Boolean.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings11 = (Boolean) Integer.valueOf(((Number) objOverlayContentPathBindings11).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings11 = (Boolean) Long.valueOf(((Number) objOverlayContentPathBindings11).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings11 = (Boolean) Double.valueOf(((Number) objOverlayContentPathBindings11).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings11 = (Boolean) Float.valueOf(((Number) objOverlayContentPathBindings11).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings11 = (Boolean) Short.valueOf(((Number) objOverlayContentPathBindings11).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings11 = (Boolean) Byte.valueOf(((Number) objOverlayContentPathBindings11).byteValue());
                        } else {
                            objOverlayContentPathBindings11 = null;
                        }
                    } else if (objOverlayContentPathBindings11 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c11 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings11);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings11 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c11);
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
                    objOverlayContentPathBindings11 = objValueOf2;
                }
            } else {
                obj18 = obj47;
            }
        } else {
            obj18 = obj47;
            objOverlayContentPathBindings11 = ContentPathBindingsKt.overlayContentPathBindings(map, "isDisabled", accumulatedState, objOverlayContentPathBindings11, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$51
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj49) {
                    return invoke((Boolean) obj49);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Boolean v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(BooleanSerializer.INSTANCE, v13);
                    } catch (Exception unused23) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$52
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Boolean invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                    } catch (Exception unused23) {
                        return null;
                    }
                }
            });
        }
        Object obj49 = obj18;
        Boolean bool4 = (Boolean) DotPathBindingsKt.overlayAggregateBinding(map2, "isDisabled", accumulatedState, objOverlayContentPathBindings11, "isDisabled", new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$53
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj50) {
                return invoke((Boolean) obj50);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Boolean bool5) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(BooleanSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, bool5, interfaceC37138cM122336d);
                } catch (Exception unused23) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$54
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Boolean invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                } catch (Exception unused23) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$55
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Boolean, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Boolean, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj50) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj50);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement12 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement12);
                    } catch (Exception unused23) {
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
                    JsonPrimitive jsonPrimitiveM1841c12 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c12);
                    } catch (Exception unused24) {
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
        boolean zBooleanValue2 = bool4 != null ? bool4.booleanValue() : textInputModel.isDisabled();
        Object stateUpdateValueKey = textInputModel.getStateUpdateValueKey();
        if (stateUpdateValueKey == null) {
            objOverlayContentPathBindings12 = null;
        } else {
            if (stateUpdateValueKey instanceof WithGeneratedBindings) {
                Object objBind12 = ((WithGeneratedBindings) stateUpdateValueKey).bind(accumulatedState);
                if (!(objBind12 instanceof String)) {
                    objBind12 = null;
                }
                obj19 = (String) objBind12;
                if (obj19 == null) {
                    obj19 = stateUpdateValueKey;
                }
            } else if (stateUpdateValueKey instanceof List) {
                Iterable iterable12 = (Iterable) stateUpdateValueKey;
                ArrayList arrayList12 = new ArrayList(AbstractC25267u.m74163i0(iterable12, 10));
                for (Object obj50 : iterable12) {
                    WithGeneratedBindings withGeneratedBindings12 = obj50 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj50 : null;
                    if (withGeneratedBindings12 != null && (withGeneratedBindingsBind12 = withGeneratedBindings12.bind(accumulatedState)) != null) {
                        obj50 = withGeneratedBindingsBind12;
                    }
                    arrayList12.add(obj50);
                }
                obj19 = (String) arrayList12;
            } else {
                obj19 = stateUpdateValueKey;
            }
            objOverlayContentPathBindings12 = obj19;
        }
        String strResolveContentBindingKey12 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "stateUpdateValueKey") : null;
        if (strResolveContentBindingKey12 != null) {
            Object objResolveStateRef12 = StateLookupKt.resolveStateRef(strResolveContentBindingKey12, accumulatedState);
            if (objResolveStateRef12 != null) {
                BindingLoggerKt.logContentBinding("stateUpdateValueKey", strResolveContentBindingKey12, objResolveStateRef12);
                Object objUnwrapForCoercion12 = BindCoercionKt.unwrapForCoercion(objResolveStateRef12);
                if ((objUnwrapForCoercion12 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion12)) {
                    obj20 = obj49;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj20), Boolean.TRUE)) {
                        objOverlayContentPathBindings12 = null;
                    }
                } else {
                    obj20 = obj49;
                }
                objOverlayContentPathBindings12 = BindCoercionKt.unwrapForCoercion(objResolveStateRef12);
                if (objOverlayContentPathBindings12 == null) {
                    objOverlayContentPathBindings12 = null;
                } else if (objOverlayContentPathBindings12 instanceof JsonElement) {
                    JsonElement jsonElement12 = (JsonElement) objOverlayContentPathBindings12;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings12 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement12);
                    } catch (Exception unused23) {
                        objOverlayContentPathBindings12 = null;
                    }
                } else {
                    boolean z19 = objOverlayContentPathBindings12 instanceof String;
                    if (!z19) {
                        if (objOverlayContentPathBindings12 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a12 = AbstractC22671h0.m65688a(String.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a12, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings12 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings12).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a12, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings12 = (String) Long.valueOf(((Number) objOverlayContentPathBindings12).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a12, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings12 = (String) Double.valueOf(((Number) objOverlayContentPathBindings12).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a12, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings12 = (String) Float.valueOf(((Number) objOverlayContentPathBindings12).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a12, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings12 = (String) Short.valueOf(((Number) objOverlayContentPathBindings12).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a12, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings12 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings12).byteValue());
                            } else {
                                objOverlayContentPathBindings12 = null;
                            }
                        } else if (z19) {
                            JsonPrimitive jsonPrimitiveM1841c12 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings12);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings12 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c12);
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
                }
                if (objOverlayContentPathBindings12 == null) {
                    objOverlayContentPathBindings12 = stateUpdateValueKey;
                }
            } else {
                obj20 = obj49;
            }
        } else {
            obj20 = obj49;
            if (objOverlayContentPathBindings12 != null) {
                objOverlayContentPathBindings12 = ContentPathBindingsKt.overlayContentPathBindings(map, "stateUpdateValueKey", accumulatedState, objOverlayContentPathBindings12, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$56
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj51) {
                        return invoke((String) obj51);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(String v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(StringSerializer.INSTANCE, v13);
                        } catch (Exception unused25) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$57
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final String invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                        } catch (Exception unused25) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj51 = obj20;
        String str8 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "stateUpdateValueKey", accumulatedState, objOverlayContentPathBindings12, "stateUpdateValueKey", new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$58
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj52) {
                return invoke((String) obj52);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str9) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str9, interfaceC37138cM122336d);
                } catch (Exception unused25) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$59
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                } catch (Exception unused25) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$60
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj52) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj52);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement13 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement13);
                    } catch (Exception unused25) {
                        return null;
                    }
                }
                boolean z24 = UnwrapForCoercion instanceof String;
                if (z24) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!z24) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c13 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c13);
                    } catch (Exception unused26) {
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
        Object errorStateKey = textInputModel.getErrorStateKey();
        if (errorStateKey == null) {
            objOverlayContentPathBindings13 = null;
        } else {
            if (errorStateKey instanceof WithGeneratedBindings) {
                Object objBind13 = ((WithGeneratedBindings) errorStateKey).bind(accumulatedState);
                if (!(objBind13 instanceof String)) {
                    objBind13 = null;
                }
                obj21 = (String) objBind13;
                if (obj21 == null) {
                    obj21 = errorStateKey;
                }
            } else if (errorStateKey instanceof List) {
                Iterable iterable13 = (Iterable) errorStateKey;
                ArrayList arrayList13 = new ArrayList(AbstractC25267u.m74163i0(iterable13, 10));
                for (Object obj52 : iterable13) {
                    WithGeneratedBindings withGeneratedBindings13 = obj52 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj52 : null;
                    if (withGeneratedBindings13 != null && (withGeneratedBindingsBind13 = withGeneratedBindings13.bind(accumulatedState)) != null) {
                        obj52 = withGeneratedBindingsBind13;
                    }
                    arrayList13.add(obj52);
                }
                obj21 = (String) arrayList13;
            } else {
                obj21 = errorStateKey;
            }
            objOverlayContentPathBindings13 = obj21;
        }
        String strResolveContentBindingKey13 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "errorStateKey") : null;
        if (strResolveContentBindingKey13 != null) {
            Object objResolveStateRef13 = StateLookupKt.resolveStateRef(strResolveContentBindingKey13, accumulatedState);
            if (objResolveStateRef13 != null) {
                BindingLoggerKt.logContentBinding("errorStateKey", strResolveContentBindingKey13, objResolveStateRef13);
                Object objUnwrapForCoercion13 = BindCoercionKt.unwrapForCoercion(objResolveStateRef13);
                if ((objUnwrapForCoercion13 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion13)) {
                    obj22 = obj51;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj22), Boolean.TRUE)) {
                        objOverlayContentPathBindings13 = null;
                    }
                } else {
                    obj22 = obj51;
                }
                objOverlayContentPathBindings13 = BindCoercionKt.unwrapForCoercion(objResolveStateRef13);
                if (objOverlayContentPathBindings13 == null) {
                    objOverlayContentPathBindings13 = null;
                } else if (objOverlayContentPathBindings13 instanceof JsonElement) {
                    JsonElement jsonElement13 = (JsonElement) objOverlayContentPathBindings13;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings13 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement13);
                    } catch (Exception unused25) {
                        objOverlayContentPathBindings13 = null;
                    }
                } else {
                    boolean z24 = objOverlayContentPathBindings13 instanceof String;
                    if (!z24) {
                        if (objOverlayContentPathBindings13 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a13 = AbstractC22671h0.m65688a(String.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a13, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings13 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings13).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a13, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings13 = (String) Long.valueOf(((Number) objOverlayContentPathBindings13).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a13, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings13 = (String) Double.valueOf(((Number) objOverlayContentPathBindings13).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a13, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings13 = (String) Float.valueOf(((Number) objOverlayContentPathBindings13).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a13, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings13 = (String) Short.valueOf(((Number) objOverlayContentPathBindings13).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a13, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings13 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings13).byteValue());
                            } else {
                                objOverlayContentPathBindings13 = null;
                            }
                        } else if (z24) {
                            JsonPrimitive jsonPrimitiveM1841c13 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings13);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings13 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c13);
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
                }
                if (objOverlayContentPathBindings13 == null) {
                    objOverlayContentPathBindings13 = errorStateKey;
                }
            } else {
                obj22 = obj51;
            }
        } else {
            obj22 = obj51;
            if (objOverlayContentPathBindings13 != null) {
                objOverlayContentPathBindings13 = ContentPathBindingsKt.overlayContentPathBindings(map, "errorStateKey", accumulatedState, objOverlayContentPathBindings13, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$61
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj53) {
                        return invoke((String) obj53);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(String v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(StringSerializer.INSTANCE, v13);
                        } catch (Exception unused27) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$62
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final String invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                        } catch (Exception unused27) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj53 = obj22;
        String str9 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "errorStateKey", accumulatedState, objOverlayContentPathBindings13, "errorStateKey", new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$63
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj54) {
                return invoke((String) obj54);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str10) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str10, interfaceC37138cM122336d);
                } catch (Exception unused27) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$64
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                } catch (Exception unused27) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$65
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj54) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj54);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement14 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement14);
                    } catch (Exception unused27) {
                        return null;
                    }
                }
                boolean z25 = UnwrapForCoercion instanceof String;
                if (z25) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!z25) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c14 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c14);
                    } catch (Exception unused28) {
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
        Object overrideTapInteraction = textInputModel.getOverrideTapInteraction();
        if (overrideTapInteraction == null) {
            objOverlayContentPathBindings14 = null;
        } else {
            if (overrideTapInteraction instanceof WithGeneratedBindings) {
                Object objBind14 = ((WithGeneratedBindings) overrideTapInteraction).bind(accumulatedState);
                if (!(objBind14 instanceof GenericInteraction)) {
                    objBind14 = null;
                }
                obj23 = (GenericInteraction) objBind14;
                if (obj23 == null) {
                    obj23 = overrideTapInteraction;
                }
            } else if (overrideTapInteraction instanceof List) {
                Iterable iterable14 = (Iterable) overrideTapInteraction;
                ArrayList arrayList14 = new ArrayList(AbstractC25267u.m74163i0(iterable14, 10));
                for (Object obj54 : iterable14) {
                    WithGeneratedBindings withGeneratedBindings14 = obj54 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj54 : null;
                    if (withGeneratedBindings14 != null && (withGeneratedBindingsBind14 = withGeneratedBindings14.bind(accumulatedState)) != null) {
                        obj54 = withGeneratedBindingsBind14;
                    }
                    arrayList14.add(obj54);
                }
                obj23 = (GenericInteraction) arrayList14;
            } else {
                obj23 = overrideTapInteraction;
            }
            objOverlayContentPathBindings14 = obj23;
        }
        String strResolveContentBindingKey14 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "overrideTapInteraction") : null;
        if (strResolveContentBindingKey14 != null) {
            Object objResolveStateRef14 = StateLookupKt.resolveStateRef(strResolveContentBindingKey14, accumulatedState);
            if (objResolveStateRef14 != null) {
                BindingLoggerKt.logContentBinding("overrideTapInteraction", strResolveContentBindingKey14, objResolveStateRef14);
                Object objUnwrapForCoercion14 = BindCoercionKt.unwrapForCoercion(objResolveStateRef14);
                if ((objUnwrapForCoercion14 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion14)) {
                    obj24 = obj53;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj24), Boolean.TRUE)) {
                        objOverlayContentPathBindings14 = null;
                    }
                } else {
                    obj24 = obj53;
                }
                objOverlayContentPathBindings14 = BindCoercionKt.unwrapForCoercion(objResolveStateRef14);
                if (objOverlayContentPathBindings14 == null) {
                    objOverlayContentPathBindings14 = null;
                } else if (objOverlayContentPathBindings14 instanceof JsonElement) {
                    JsonElement jsonElement14 = (JsonElement) objOverlayContentPathBindings14;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings14 = StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), jsonElement14);
                    } catch (Exception unused27) {
                        objOverlayContentPathBindings14 = null;
                    }
                } else if (!(objOverlayContentPathBindings14 instanceof GenericInteraction)) {
                    if (objOverlayContentPathBindings14 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a14 = AbstractC22671h0.m65688a(GenericInteraction.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a14, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings14 = (GenericInteraction) Integer.valueOf(((Number) objOverlayContentPathBindings14).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a14, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings14 = (GenericInteraction) Long.valueOf(((Number) objOverlayContentPathBindings14).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a14, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings14 = (GenericInteraction) Double.valueOf(((Number) objOverlayContentPathBindings14).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a14, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings14 = (GenericInteraction) Float.valueOf(((Number) objOverlayContentPathBindings14).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a14, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings14 = (GenericInteraction) Short.valueOf(((Number) objOverlayContentPathBindings14).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a14, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings14 = (GenericInteraction) Byte.valueOf(((Number) objOverlayContentPathBindings14).byteValue());
                        } else {
                            objOverlayContentPathBindings14 = null;
                        }
                    } else if (objOverlayContentPathBindings14 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c14 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings14);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings14 = StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), jsonPrimitiveM1841c14);
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
                    objOverlayContentPathBindings14 = overrideTapInteraction;
                }
            } else {
                obj24 = obj53;
            }
        } else {
            obj24 = obj53;
            if (objOverlayContentPathBindings14 != null) {
                objOverlayContentPathBindings14 = ContentPathBindingsKt.overlayContentPathBindings(map, "overrideTapInteraction", accumulatedState, objOverlayContentPathBindings14, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$66
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj55) {
                        return invoke((GenericInteraction) obj55);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(GenericInteraction v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(GenericInteraction.INSTANCE.serializer(), v13);
                        } catch (Exception unused29) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$67
                    /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.navigation.models.GenericInteraction, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final GenericInteraction invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), json);
                        } catch (Exception unused29) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj55 = obj24;
        GenericInteraction genericInteraction = (GenericInteraction) DotPathBindingsKt.overlayAggregateBinding(map2, "overrideTapInteraction", accumulatedState, objOverlayContentPathBindings14, "overrideTapInteraction", new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$68
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj56) {
                return invoke((GenericInteraction) obj56);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(GenericInteraction genericInteraction2) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(GenericInteraction.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, genericInteraction2, interfaceC37138cM122336d);
                } catch (Exception unused29) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$69
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.navigation.models.GenericInteraction, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final GenericInteraction invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), json);
                } catch (Exception unused29) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$70
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.navigation.models.GenericInteraction, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.navigation.models.GenericInteraction, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final GenericInteraction invoke(Object obj56) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj56);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement15 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), jsonElement15);
                    } catch (Exception unused29) {
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
                    JsonPrimitive jsonPrimitiveM1841c15 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), jsonPrimitiveM1841c15);
                    } catch (Exception unused30) {
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
        Object textInputValidation = textInputModel.getTextInputValidation();
        if (textInputValidation == null) {
            objOverlayContentPathBindings15 = null;
        } else {
            if (textInputValidation instanceof WithGeneratedBindings) {
                Object objBind15 = ((WithGeneratedBindings) textInputValidation).bind(accumulatedState);
                if (!(objBind15 instanceof TextInputValidation)) {
                    objBind15 = null;
                }
                obj25 = (TextInputValidation) objBind15;
                if (obj25 == null) {
                    obj25 = textInputValidation;
                }
            } else if (textInputValidation instanceof List) {
                Iterable iterable15 = (Iterable) textInputValidation;
                ArrayList arrayList15 = new ArrayList(AbstractC25267u.m74163i0(iterable15, 10));
                for (Object obj56 : iterable15) {
                    WithGeneratedBindings withGeneratedBindings15 = obj56 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj56 : null;
                    if (withGeneratedBindings15 != null && (withGeneratedBindingsBind15 = withGeneratedBindings15.bind(accumulatedState)) != null) {
                        obj56 = withGeneratedBindingsBind15;
                    }
                    arrayList15.add(obj56);
                }
                obj25 = (TextInputValidation) arrayList15;
            } else {
                obj25 = textInputValidation;
            }
            objOverlayContentPathBindings15 = obj25;
        }
        String strResolveContentBindingKey15 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "validation") : null;
        if (strResolveContentBindingKey15 != null) {
            Object objResolveStateRef15 = StateLookupKt.resolveStateRef(strResolveContentBindingKey15, accumulatedState);
            if (objResolveStateRef15 != null) {
                BindingLoggerKt.logContentBinding("validation", strResolveContentBindingKey15, objResolveStateRef15);
                Object objUnwrapForCoercion15 = BindCoercionKt.unwrapForCoercion(objResolveStateRef15);
                if ((objUnwrapForCoercion15 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion15)) {
                    obj26 = obj55;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj26), Boolean.TRUE)) {
                        objOverlayContentPathBindings15 = null;
                    }
                } else {
                    obj26 = obj55;
                }
                objOverlayContentPathBindings15 = BindCoercionKt.unwrapForCoercion(objResolveStateRef15);
                if (objOverlayContentPathBindings15 == null) {
                    objOverlayContentPathBindings15 = null;
                } else if (objOverlayContentPathBindings15 instanceof JsonElement) {
                    JsonElement jsonElement15 = (JsonElement) objOverlayContentPathBindings15;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings15 = StateBindingDeserializerKt.getStateBindingJson().m1830a(TextInputValidation.INSTANCE.serializer(), jsonElement15);
                    } catch (Exception unused29) {
                        objOverlayContentPathBindings15 = null;
                    }
                } else if (!(objOverlayContentPathBindings15 instanceof TextInputValidation)) {
                    if (objOverlayContentPathBindings15 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a15 = AbstractC22671h0.m65688a(TextInputValidation.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a15, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings15 = (TextInputValidation) Integer.valueOf(((Number) objOverlayContentPathBindings15).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a15, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings15 = (TextInputValidation) Long.valueOf(((Number) objOverlayContentPathBindings15).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a15, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings15 = (TextInputValidation) Double.valueOf(((Number) objOverlayContentPathBindings15).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a15, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings15 = (TextInputValidation) Float.valueOf(((Number) objOverlayContentPathBindings15).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a15, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings15 = (TextInputValidation) Short.valueOf(((Number) objOverlayContentPathBindings15).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a15, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings15 = (TextInputValidation) Byte.valueOf(((Number) objOverlayContentPathBindings15).byteValue());
                        } else {
                            objOverlayContentPathBindings15 = null;
                        }
                    } else if (objOverlayContentPathBindings15 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c15 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings15);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings15 = StateBindingDeserializerKt.getStateBindingJson().m1830a(TextInputValidation.INSTANCE.serializer(), jsonPrimitiveM1841c15);
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
                if (objOverlayContentPathBindings15 == null) {
                    objOverlayContentPathBindings15 = textInputValidation;
                }
            } else {
                obj26 = obj55;
            }
        } else {
            obj26 = obj55;
            if (objOverlayContentPathBindings15 != null) {
                objOverlayContentPathBindings15 = ContentPathBindingsKt.overlayContentPathBindings(map, "validation", accumulatedState, objOverlayContentPathBindings15, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$71
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj57) {
                        return invoke((TextInputValidation) obj57);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(TextInputValidation v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(TextInputValidation.INSTANCE.serializer(), v13);
                        } catch (Exception unused31) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$72
                    /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.items.TextInputValidation, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final TextInputValidation invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(TextInputValidation.INSTANCE.serializer(), json);
                        } catch (Exception unused31) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj57 = obj26;
        TextInputValidation textInputValidation2 = (TextInputValidation) DotPathBindingsKt.overlayAggregateBinding(map2, "validation", accumulatedState, objOverlayContentPathBindings15, "validation", new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$73
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj58) {
                return invoke((TextInputValidation) obj58);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(TextInputValidation textInputValidation3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(TextInputValidation.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, textInputValidation3, interfaceC37138cM122336d);
                } catch (Exception unused31) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$74
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.items.TextInputValidation, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final TextInputValidation invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(TextInputValidation.INSTANCE.serializer(), json);
                } catch (Exception unused31) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$75
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.items.TextInputValidation, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.items.TextInputValidation, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final TextInputValidation invoke(Object obj58) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj58);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement16 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(TextInputValidation.INSTANCE.serializer(), jsonElement16);
                    } catch (Exception unused31) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof TextInputValidation) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c16 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(TextInputValidation.INSTANCE.serializer(), jsonPrimitiveM1841c16);
                    } catch (Exception unused32) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(TextInputValidation.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (TextInputValidation) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (TextInputValidation) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (TextInputValidation) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (TextInputValidation) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (TextInputValidation) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (TextInputValidation) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        Object errorMessage = textInputModel.getErrorMessage();
        if (errorMessage == null) {
            obj28 = null;
        } else {
            if (errorMessage instanceof WithGeneratedBindings) {
                Object objBind16 = ((WithGeneratedBindings) errorMessage).bind(accumulatedState);
                if (!(objBind16 instanceof String)) {
                    objBind16 = null;
                }
                obj27 = (String) objBind16;
                if (obj27 == null) {
                    obj27 = errorMessage;
                }
            } else if (errorMessage instanceof List) {
                Iterable iterable16 = (Iterable) errorMessage;
                ArrayList arrayList16 = new ArrayList(AbstractC25267u.m74163i0(iterable16, 10));
                for (Object obj58 : iterable16) {
                    WithGeneratedBindings withGeneratedBindings16 = obj58 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj58 : null;
                    if (withGeneratedBindings16 != null && (withGeneratedBindingsBind16 = withGeneratedBindings16.bind(accumulatedState)) != null) {
                        obj58 = withGeneratedBindingsBind16;
                    }
                    arrayList16.add(obj58);
                }
                obj27 = (String) arrayList16;
            } else {
                obj27 = errorMessage;
            }
            obj28 = obj27;
        }
        String strResolveContentBindingKey16 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "errorMessage") : null;
        if (strResolveContentBindingKey16 != null) {
            Object objResolveStateRef16 = StateLookupKt.resolveStateRef(strResolveContentBindingKey16, accumulatedState);
            if (objResolveStateRef16 != null) {
                BindingLoggerKt.logContentBinding("errorMessage", strResolveContentBindingKey16, objResolveStateRef16);
                Object objUnwrapForCoercion16 = BindCoercionKt.unwrapForCoercion(objResolveStateRef16);
                if ((objUnwrapForCoercion16 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion16) && AbstractC22676k.m65745e(accumulatedState.get(obj57), Boolean.TRUE)) {
                    obj28 = null;
                } else {
                    Object objUnwrapForCoercion17 = BindCoercionKt.unwrapForCoercion(objResolveStateRef16);
                    if (objUnwrapForCoercion17 == null) {
                        objOverlayContentPathBindings16 = null;
                    } else if (objUnwrapForCoercion17 instanceof JsonElement) {
                        JsonElement jsonElement16 = (JsonElement) objUnwrapForCoercion17;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings16 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement16);
                        } catch (Exception unused31) {
                            objOverlayContentPathBindings16 = null;
                        }
                    } else {
                        boolean z25 = objUnwrapForCoercion17 instanceof String;
                        if (z25) {
                            objOverlayContentPathBindings16 = objUnwrapForCoercion17;
                        } else {
                            if (objUnwrapForCoercion17 instanceof Number) {
                                InterfaceC21461d interfaceC21461dM65688a16 = AbstractC22671h0.m65688a(String.class);
                                if (AbstractC22676k.m65745e(interfaceC21461dM65688a16, AbstractC22671h0.m65688a(cls6))) {
                                    objOverlayContentPathBindings16 = (String) Integer.valueOf(((Number) objUnwrapForCoercion17).intValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a16, AbstractC22671h0.m65688a(cls5))) {
                                    objOverlayContentPathBindings16 = (String) Long.valueOf(((Number) objUnwrapForCoercion17).longValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a16, AbstractC22671h0.m65688a(cls4))) {
                                    objOverlayContentPathBindings16 = (String) Double.valueOf(((Number) objUnwrapForCoercion17).doubleValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a16, AbstractC22671h0.m65688a(cls3))) {
                                    objOverlayContentPathBindings16 = (String) Float.valueOf(((Number) objUnwrapForCoercion17).floatValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a16, AbstractC22671h0.m65688a(cls2))) {
                                    objOverlayContentPathBindings16 = (String) Short.valueOf(((Number) objUnwrapForCoercion17).shortValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a16, AbstractC22671h0.m65688a(cls))) {
                                    objOverlayContentPathBindings16 = (String) Byte.valueOf(((Number) objUnwrapForCoercion17).byteValue());
                                }
                            } else if (z25) {
                                JsonPrimitive jsonPrimitiveM1841c16 = AbstractC0770m.m1841c((String) objUnwrapForCoercion17);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objUnwrapForCoercion17 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c16);
                                } catch (Exception unused32) {
                                    objUnwrapForCoercion17 = null;
                                }
                                if (objUnwrapForCoercion17 != null) {
                                    objOverlayContentPathBindings16 = objUnwrapForCoercion17;
                                }
                            }
                            objOverlayContentPathBindings16 = null;
                        }
                    }
                    obj28 = objOverlayContentPathBindings16 == null ? errorMessage : objOverlayContentPathBindings16;
                }
            }
        } else if (obj28 != null) {
            objOverlayContentPathBindings16 = ContentPathBindingsKt.overlayContentPathBindings(map, "errorMessage", accumulatedState, obj28, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$76
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj59) {
                    return invoke((String) obj59);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(String v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(StringSerializer.INSTANCE, v13);
                    } catch (Exception unused33) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$77
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
                @Override // p715kotlin.jvm.functions.Function1
                public final String invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                    } catch (Exception unused33) {
                        return null;
                    }
                }
            });
        }
        return (TextInputModel) ContentBindingResolverKt.copyBindingsFrom(new TextInputModel(str, str2, str3, str4, str5, str6, str7, num, textInputKeyboardType, zBooleanValue, zBooleanValue2, str8, str9, genericInteraction, textInputValidation2, (String) DotPathBindingsKt.overlayAggregateBinding(map2, "errorMessage", accumulatedState, obj28, "errorMessage", new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$78
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj59) {
                return invoke((String) obj59);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str10) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str10, interfaceC37138cM122336d);
                } catch (Exception unused33) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$79
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                } catch (Exception unused33) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.TextInputModelStateBindingKt$generatedBind$$inlined$resolveBinding$80
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj59) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj59);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement17 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement17);
                    } catch (Exception unused33) {
                        return null;
                    }
                }
                boolean z26 = UnwrapForCoercion instanceof String;
                if (z26) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!z26) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c17 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c17);
                    } catch (Exception unused34) {
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
        })), textInputModel);
    }

    public static /* synthetic */ TextInputModel generatedBind$default(TextInputModel textInputModel, Map map, Map map2, Map map3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map2 = null;
        }
        return generatedBind(textInputModel, map, map2, map3);
    }
}
