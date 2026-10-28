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
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import m83.AbstractC25267u;
import p097ds.AbstractC12313p;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p745y81.EnumC39333f;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003¨\u0006\t"}, m65681d2 = {"generatedBind", "Lcom/whoop/design/models/items/NumericInputSliderModel;", "contentBinding", "", "", "aggregateBindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "accumulatedState", "", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class NumericInputSliderModelStateBindingKt {
    /* JADX WARN: Code duplicated, block: B:124:0x0228  */
    /* JADX WARN: Code duplicated, block: B:142:0x0267  */
    /* JADX WARN: Code duplicated, block: B:212:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:231:0x0407  */
    /* JADX WARN: Code duplicated, block: B:301:0x0566  */
    /* JADX WARN: Code duplicated, block: B:319:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:37:0x0081  */
    /* JADX WARN: Code duplicated, block: B:391:0x0702  */
    /* JADX WARN: Code duplicated, block: B:410:0x0742  */
    /* JADX WARN: Code duplicated, block: B:481:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:499:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:571:0x0a4d  */
    /* JADX WARN: Code duplicated, block: B:589:0x0a89  */
    /* JADX WARN: Code duplicated, block: B:657:0x0be5  */
    /* JADX WARN: Code duplicated, block: B:675:0x0c21  */
    /* JADX WARN: Code duplicated, block: B:750:0x0d9e A[PHI: r4
      0x0d9e: PHI (r4v79 java.lang.Object) = (r4v55 java.lang.Object), (r4v59 java.lang.Object) binds: [B:749:0x0d9c, B:777:0x0e61] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final NumericInputSliderModel generatedBind(NumericInputSliderModel numericInputSliderModel, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, ? extends Object> accumulatedState) {
        Object objOverlayContentPathBindings;
        WithGeneratedBindings withGeneratedBindingsBind;
        Object obj;
        Float f13;
        WithGeneratedBindings withGeneratedBindingsBind2;
        Object objOverlayContentPathBindings2;
        Object obj2;
        Integer num;
        WithGeneratedBindings withGeneratedBindingsBind3;
        Object objOverlayContentPathBindings3;
        Object obj3;
        Integer num2;
        WithGeneratedBindings withGeneratedBindingsBind4;
        Object objOverlayContentPathBindings4;
        Object obj4;
        Object obj5;
        WithGeneratedBindings withGeneratedBindingsBind5;
        Object objOverlayContentPathBindings5;
        Object obj6;
        Float f14;
        WithGeneratedBindings withGeneratedBindingsBind6;
        Object objOverlayContentPathBindings6;
        Object obj7;
        Object obj8;
        WithGeneratedBindings withGeneratedBindingsBind7;
        Object objOverlayContentPathBindings7;
        Object obj9;
        WithGeneratedBindings withGeneratedBindingsBind8;
        Object objOverlayContentPathBindings8;
        Object obj10;
        Object objOverlayContentPathBindings9;
        AbstractC22676k.m65750j(numericInputSliderModel, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if ((map == null || map.isEmpty()) && ((map2 == null || map2.isEmpty()) && accumulatedState.isEmpty())) {
            return numericInputSliderModel;
        }
        Object objValueOf = Float.valueOf(numericInputSliderModel.getUpperBound());
        if (objValueOf instanceof WithGeneratedBindings) {
            Object objBind = ((WithGeneratedBindings) objValueOf).bind(accumulatedState);
            if (!(objBind instanceof Float)) {
                objBind = null;
            }
            objOverlayContentPathBindings = (Float) objBind;
            if (objOverlayContentPathBindings == null) {
                objOverlayContentPathBindings = objValueOf;
                obj = objOverlayContentPathBindings;
            } else {
                obj = objValueOf;
            }
        } else if (objValueOf instanceof List) {
            Iterable iterable = (Iterable) objValueOf;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            for (Object obj11 : iterable) {
                WithGeneratedBindings withGeneratedBindings = obj11 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj11 : null;
                if (withGeneratedBindings != null && (withGeneratedBindingsBind = withGeneratedBindings.bind(accumulatedState)) != null) {
                    obj11 = withGeneratedBindingsBind;
                }
                arrayList.add(obj11);
            }
            objOverlayContentPathBindings = (Float) arrayList;
            obj = objValueOf;
        } else {
            objOverlayContentPathBindings = objValueOf;
            obj = objOverlayContentPathBindings;
        }
        String strResolveContentBindingKey = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "upperBound") : null;
        Class cls = Byte.TYPE;
        Class cls2 = Short.TYPE;
        Class cls3 = Float.TYPE;
        Class cls4 = Double.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        if (strResolveContentBindingKey != null) {
            Object objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
            if (objResolveStateRef != null) {
                BindingLoggerKt.logContentBinding("upperBound", strResolveContentBindingKey, objResolveStateRef);
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
                            objOverlayContentPathBindings = StateBindingDeserializerKt.getStateBindingJson().m1830a(FloatSerializer.INSTANCE, jsonElement);
                        } catch (Exception unused) {
                            objOverlayContentPathBindings = null;
                        }
                    } else if (!(objOverlayContentPathBindings instanceof Float)) {
                        if (objOverlayContentPathBindings instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a = AbstractC22671h0.m65688a(Float.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings = (Float) Integer.valueOf(((Number) objOverlayContentPathBindings).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings = (Float) Long.valueOf(((Number) objOverlayContentPathBindings).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings = (Float) Double.valueOf(((Number) objOverlayContentPathBindings).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings = Float.valueOf(((Number) objOverlayContentPathBindings).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings = (Float) Short.valueOf(((Number) objOverlayContentPathBindings).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings = (Float) Byte.valueOf(((Number) objOverlayContentPathBindings).byteValue());
                            } else {
                                objOverlayContentPathBindings = null;
                            }
                        } else if (objOverlayContentPathBindings instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c = AbstractC0770m.m1841c((String) objOverlayContentPathBindings);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings = StateBindingDeserializerKt.getStateBindingJson().m1830a(FloatSerializer.INSTANCE, jsonPrimitiveM1841c);
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
                    if (objOverlayContentPathBindings == null) {
                        objOverlayContentPathBindings = obj;
                    }
                }
            }
        } else {
            objOverlayContentPathBindings = ContentPathBindingsKt.overlayContentPathBindings(map, "upperBound", accumulatedState, objOverlayContentPathBindings, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$1
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj12) {
                    return invoke((Float) obj12);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Float v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(FloatSerializer.INSTANCE, v13);
                    } catch (Exception unused3) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$2
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Float, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Float invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(FloatSerializer.INSTANCE, json);
                    } catch (Exception unused3) {
                        return null;
                    }
                }
            });
        }
        Float f15 = (Float) DotPathBindingsKt.overlayAggregateBinding(map2, "upperBound", accumulatedState, objOverlayContentPathBindings, "upperBound", new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$3
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj12) {
                return invoke((Float) obj12);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Float f16) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(FloatSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, f16, interfaceC37138cM122336d);
                } catch (Exception unused3) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$4
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Float, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Float invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(FloatSerializer.INSTANCE, json);
                } catch (Exception unused3) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$5
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Float, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Float, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Float invoke(Object obj12) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj12);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement2 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(FloatSerializer.INSTANCE, jsonElement2);
                    } catch (Exception unused3) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof Float) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(FloatSerializer.INSTANCE, jsonPrimitiveM1841c2);
                    } catch (Exception unused4) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Float.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (Float) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (Float) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (Float) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (Float) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (Float) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        float fFloatValue = f15 != null ? f15.floatValue() : numericInputSliderModel.getUpperBound();
        Object objValueOf2 = Float.valueOf(numericInputSliderModel.getLowerBound());
        if (objValueOf2 instanceof WithGeneratedBindings) {
            Object objBind2 = ((WithGeneratedBindings) objValueOf2).bind(accumulatedState);
            if (!(objBind2 instanceof Float)) {
                objBind2 = null;
            }
            f13 = (Float) objBind2;
            if (f13 == null) {
                objOverlayContentPathBindings2 = objValueOf2;
            } else {
                objOverlayContentPathBindings2 = f13;
            }
        } else if (objValueOf2 instanceof List) {
            Iterable iterable2 = (Iterable) objValueOf2;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
            for (Object obj12 : iterable2) {
                WithGeneratedBindings withGeneratedBindings2 = obj12 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj12 : null;
                if (withGeneratedBindings2 != null && (withGeneratedBindingsBind2 = withGeneratedBindings2.bind(accumulatedState)) != null) {
                    obj12 = withGeneratedBindingsBind2;
                }
                arrayList2.add(obj12);
            }
            f13 = (Float) arrayList2;
            objOverlayContentPathBindings2 = f13;
        } else {
            objOverlayContentPathBindings2 = objValueOf2;
        }
        String strResolveContentBindingKey2 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "lowerBound") : null;
        if (strResolveContentBindingKey2 != null) {
            Object objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
            if (objResolveStateRef2 != null) {
                BindingLoggerKt.logContentBinding("lowerBound", strResolveContentBindingKey2, objResolveStateRef2);
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
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(FloatSerializer.INSTANCE, jsonElement2);
                    } catch (Exception unused3) {
                        objOverlayContentPathBindings2 = null;
                    }
                } else if (!(objOverlayContentPathBindings2 instanceof Float)) {
                    if (objOverlayContentPathBindings2 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a2 = AbstractC22671h0.m65688a(Float.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings2 = (Float) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings2 = (Float) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings2 = (Float) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings2 = Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings2 = (Float) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings2 = (Float) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                        } else {
                            objOverlayContentPathBindings2 = null;
                        }
                    } else if (objOverlayContentPathBindings2 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(FloatSerializer.INSTANCE, jsonPrimitiveM1841c2);
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
                if (objOverlayContentPathBindings2 == null) {
                    objOverlayContentPathBindings2 = objValueOf2;
                }
            } else {
                obj2 = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
            }
        } else {
            obj2 = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
            objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(map, "lowerBound", accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$6
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj13) {
                    return invoke((Float) obj13);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Float v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(FloatSerializer.INSTANCE, v13);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$7
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Float, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Float invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(FloatSerializer.INSTANCE, json);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            });
        }
        Object obj13 = obj2;
        Float f16 = (Float) DotPathBindingsKt.overlayAggregateBinding(map2, "lowerBound", accumulatedState, objOverlayContentPathBindings2, "lowerBound", new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$8
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj14) {
                return invoke((Float) obj14);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Float f17) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(FloatSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, f17, interfaceC37138cM122336d);
                } catch (Exception unused5) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$9
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Float, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Float invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(FloatSerializer.INSTANCE, json);
                } catch (Exception unused5) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$10
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Float, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Float, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Float invoke(Object obj14) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj14);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement3 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(FloatSerializer.INSTANCE, jsonElement3);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof Float) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(FloatSerializer.INSTANCE, jsonPrimitiveM1841c3);
                    } catch (Exception unused6) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Float.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (Float) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (Float) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (Float) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (Float) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (Float) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        float fFloatValue2 = f16 != null ? f16.floatValue() : numericInputSliderModel.getLowerBound();
        Object objValueOf3 = Integer.valueOf(numericInputSliderModel.getStepSize());
        if (objValueOf3 instanceof WithGeneratedBindings) {
            Object objBind3 = ((WithGeneratedBindings) objValueOf3).bind(accumulatedState);
            if (!(objBind3 instanceof Integer)) {
                objBind3 = null;
            }
            num = (Integer) objBind3;
            if (num == null) {
                objOverlayContentPathBindings3 = objValueOf3;
            } else {
                objOverlayContentPathBindings3 = num;
            }
        } else if (objValueOf3 instanceof List) {
            Iterable iterable3 = (Iterable) objValueOf3;
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable3, 10));
            for (Object obj14 : iterable3) {
                WithGeneratedBindings withGeneratedBindings3 = obj14 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj14 : null;
                if (withGeneratedBindings3 != null && (withGeneratedBindingsBind3 = withGeneratedBindings3.bind(accumulatedState)) != null) {
                    obj14 = withGeneratedBindingsBind3;
                }
                arrayList3.add(obj14);
            }
            num = (Integer) arrayList3;
            objOverlayContentPathBindings3 = num;
        } else {
            objOverlayContentPathBindings3 = objValueOf3;
        }
        String strResolveContentBindingKey3 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "stepSize") : null;
        if (strResolveContentBindingKey3 != null) {
            Object objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
            if (objResolveStateRef3 != null) {
                BindingLoggerKt.logContentBinding("stepSize", strResolveContentBindingKey3, objResolveStateRef3);
                Object objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if ((objUnwrapForCoercion3 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion3)) {
                    obj3 = obj13;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj3), Boolean.TRUE)) {
                        objOverlayContentPathBindings3 = null;
                    }
                } else {
                    obj3 = obj13;
                }
                objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if (objOverlayContentPathBindings3 == null) {
                    objOverlayContentPathBindings3 = null;
                } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                    JsonElement jsonElement3 = (JsonElement) objOverlayContentPathBindings3;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, jsonElement3);
                    } catch (Exception unused5) {
                        objOverlayContentPathBindings3 = null;
                    }
                } else if (!(objOverlayContentPathBindings3 instanceof Integer)) {
                    if (objOverlayContentPathBindings3 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a3 = AbstractC22671h0.m65688a(Integer.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings3 = Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings3 = (Integer) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings3 = (Integer) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings3 = (Integer) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings3 = (Integer) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings3 = (Integer) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                        } else {
                            objOverlayContentPathBindings3 = null;
                        }
                    } else if (objOverlayContentPathBindings3 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, jsonPrimitiveM1841c3);
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
                if (objOverlayContentPathBindings3 == null) {
                    objOverlayContentPathBindings3 = objValueOf3;
                }
            } else {
                obj3 = obj13;
            }
        } else {
            obj3 = obj13;
            objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(map, "stepSize", accumulatedState, objOverlayContentPathBindings3, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$11
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj15) {
                    return invoke((Integer) obj15);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Integer v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(IntSerializer.INSTANCE, v13);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$12
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Integer, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Integer invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, json);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            });
        }
        Object obj15 = obj3;
        Integer num3 = (Integer) DotPathBindingsKt.overlayAggregateBinding(map2, "stepSize", accumulatedState, objOverlayContentPathBindings3, "stepSize", new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$13
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj16) {
                return invoke((Integer) obj16);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Integer num4) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(IntSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, num4, interfaceC37138cM122336d);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$14
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Integer, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Integer invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, json);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$15
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Integer, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Integer, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Integer invoke(Object obj16) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj16);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement4 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, jsonElement4);
                    } catch (Exception unused7) {
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
                    JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, jsonPrimitiveM1841c4);
                    } catch (Exception unused8) {
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
        int iIntValue = num3 != null ? num3.intValue() : numericInputSliderModel.getStepSize();
        Object objValueOf4 = Integer.valueOf(numericInputSliderModel.getBarThickness());
        if (objValueOf4 instanceof WithGeneratedBindings) {
            Object objBind4 = ((WithGeneratedBindings) objValueOf4).bind(accumulatedState);
            if (!(objBind4 instanceof Integer)) {
                objBind4 = null;
            }
            num2 = (Integer) objBind4;
            if (num2 == null) {
                objOverlayContentPathBindings4 = objValueOf4;
            } else {
                objOverlayContentPathBindings4 = num2;
            }
        } else if (objValueOf4 instanceof List) {
            Iterable iterable4 = (Iterable) objValueOf4;
            ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable4, 10));
            for (Object obj16 : iterable4) {
                WithGeneratedBindings withGeneratedBindings4 = obj16 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj16 : null;
                if (withGeneratedBindings4 != null && (withGeneratedBindingsBind4 = withGeneratedBindings4.bind(accumulatedState)) != null) {
                    obj16 = withGeneratedBindingsBind4;
                }
                arrayList4.add(obj16);
            }
            num2 = (Integer) arrayList4;
            objOverlayContentPathBindings4 = num2;
        } else {
            objOverlayContentPathBindings4 = objValueOf4;
        }
        String strResolveContentBindingKey4 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "barThickness") : null;
        if (strResolveContentBindingKey4 != null) {
            Object objResolveStateRef4 = StateLookupKt.resolveStateRef(strResolveContentBindingKey4, accumulatedState);
            if (objResolveStateRef4 != null) {
                BindingLoggerKt.logContentBinding("barThickness", strResolveContentBindingKey4, objResolveStateRef4);
                Object objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if ((objUnwrapForCoercion4 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion4)) {
                    obj4 = obj15;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj4), Boolean.TRUE)) {
                        objOverlayContentPathBindings4 = null;
                    }
                } else {
                    obj4 = obj15;
                }
                objOverlayContentPathBindings4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if (objOverlayContentPathBindings4 == null) {
                    objOverlayContentPathBindings4 = null;
                } else if (objOverlayContentPathBindings4 instanceof JsonElement) {
                    JsonElement jsonElement4 = (JsonElement) objOverlayContentPathBindings4;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, jsonElement4);
                    } catch (Exception unused7) {
                        objOverlayContentPathBindings4 = null;
                    }
                } else if (!(objOverlayContentPathBindings4 instanceof Integer)) {
                    if (objOverlayContentPathBindings4 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a4 = AbstractC22671h0.m65688a(Integer.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings4 = Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings4 = (Integer) Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings4 = (Integer) Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings4 = (Integer) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings4 = (Integer) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings4 = (Integer) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                        } else {
                            objOverlayContentPathBindings4 = null;
                        }
                    } else if (objOverlayContentPathBindings4 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings4);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, jsonPrimitiveM1841c4);
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
                if (objOverlayContentPathBindings4 == null) {
                    objOverlayContentPathBindings4 = objValueOf4;
                }
            } else {
                obj4 = obj15;
            }
        } else {
            obj4 = obj15;
            objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(map, "barThickness", accumulatedState, objOverlayContentPathBindings4, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$16
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj17) {
                    return invoke((Integer) obj17);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Integer v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(IntSerializer.INSTANCE, v13);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$17
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Integer, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Integer invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, json);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
            });
        }
        Object obj17 = obj4;
        Integer num4 = (Integer) DotPathBindingsKt.overlayAggregateBinding(map2, "barThickness", accumulatedState, objOverlayContentPathBindings4, "barThickness", new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$18
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj18) {
                return invoke((Integer) obj18);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Integer num5) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(IntSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, num5, interfaceC37138cM122336d);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$19
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Integer, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Integer invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, json);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$20
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Integer, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Integer, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Integer invoke(Object obj18) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj18);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement5 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, jsonElement5);
                    } catch (Exception unused9) {
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
                    JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, jsonPrimitiveM1841c5);
                    } catch (Exception unused10) {
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
        int iIntValue2 = num4 != null ? num4.intValue() : numericInputSliderModel.getBarThickness();
        Object barColor = numericInputSliderModel.getBarColor();
        if (barColor == null) {
            objOverlayContentPathBindings5 = null;
        } else {
            if (barColor instanceof WithGeneratedBindings) {
                Object objBind5 = ((WithGeneratedBindings) barColor).bind(accumulatedState);
                if (!(objBind5 instanceof EnumC39333f)) {
                    objBind5 = null;
                }
                obj5 = (EnumC39333f) objBind5;
                if (obj5 == null) {
                    obj5 = barColor;
                }
            } else if (barColor instanceof List) {
                Iterable iterable5 = (Iterable) barColor;
                ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(iterable5, 10));
                for (Object obj18 : iterable5) {
                    WithGeneratedBindings withGeneratedBindings5 = obj18 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj18 : null;
                    if (withGeneratedBindings5 != null && (withGeneratedBindingsBind5 = withGeneratedBindings5.bind(accumulatedState)) != null) {
                        obj18 = withGeneratedBindingsBind5;
                    }
                    arrayList5.add(obj18);
                }
                obj5 = (EnumC39333f) arrayList5;
            } else {
                obj5 = barColor;
            }
            objOverlayContentPathBindings5 = obj5;
        }
        String strResolveContentBindingKey5 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "barColor") : null;
        if (strResolveContentBindingKey5 != null) {
            Object objResolveStateRef5 = StateLookupKt.resolveStateRef(strResolveContentBindingKey5, accumulatedState);
            if (objResolveStateRef5 != null) {
                BindingLoggerKt.logContentBinding("barColor", strResolveContentBindingKey5, objResolveStateRef5);
                Object objUnwrapForCoercion5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                if ((objUnwrapForCoercion5 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion5)) {
                    obj6 = obj17;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj6), Boolean.TRUE)) {
                        objOverlayContentPathBindings5 = null;
                    }
                } else {
                    obj6 = obj17;
                }
                objOverlayContentPathBindings5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                if (objOverlayContentPathBindings5 == null) {
                    objOverlayContentPathBindings5 = null;
                } else if (objOverlayContentPathBindings5 instanceof JsonElement) {
                    JsonElement jsonElement5 = (JsonElement) objOverlayContentPathBindings5;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values()), jsonElement5);
                    } catch (Exception unused9) {
                        objOverlayContentPathBindings5 = null;
                    }
                } else if (!(objOverlayContentPathBindings5 instanceof EnumC39333f)) {
                    if (objOverlayContentPathBindings5 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a5 = AbstractC22671h0.m65688a(EnumC39333f.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings5 = (EnumC39333f) Integer.valueOf(((Number) objOverlayContentPathBindings5).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings5 = (EnumC39333f) Long.valueOf(((Number) objOverlayContentPathBindings5).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings5 = (EnumC39333f) Double.valueOf(((Number) objOverlayContentPathBindings5).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings5 = (EnumC39333f) Float.valueOf(((Number) objOverlayContentPathBindings5).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings5 = (EnumC39333f) Short.valueOf(((Number) objOverlayContentPathBindings5).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings5 = (EnumC39333f) Byte.valueOf(((Number) objOverlayContentPathBindings5).byteValue());
                        } else {
                            objOverlayContentPathBindings5 = null;
                        }
                    } else if (objOverlayContentPathBindings5 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings5);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values()), jsonPrimitiveM1841c5);
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
                if (objOverlayContentPathBindings5 == null) {
                    objOverlayContentPathBindings5 = barColor;
                }
            } else {
                obj6 = obj17;
            }
        } else {
            obj6 = obj17;
            if (objOverlayContentPathBindings5 != null) {
                objOverlayContentPathBindings5 = ContentPathBindingsKt.overlayContentPathBindings(map, "barColor", accumulatedState, objOverlayContentPathBindings5, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$21
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj19) {
                        return invoke((EnumC39333f) obj19);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(EnumC39333f v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            EnumSerializer enumSerializer = new EnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
                            AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                            stateBindingJson.getClass();
                            return AbstractC12313p.m34290h0(stateBindingJson, v13, enumSerializer);
                        } catch (Exception unused11) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$22
                    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, y81.f] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final EnumC39333f invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values()), json);
                        } catch (Exception unused11) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj19 = obj6;
        EnumC39333f barColor2 = (EnumC39333f) DotPathBindingsKt.overlayAggregateBinding(map2, "barColor", accumulatedState, objOverlayContentPathBindings5, "barColor", new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$23
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj20) {
                return invoke((EnumC39333f) obj20);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(EnumC39333f enumC39333f) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new EnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values()));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, enumC39333f, interfaceC37138cM122336d);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$24
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, y81.f] */
            @Override // p715kotlin.jvm.functions.Function1
            public final EnumC39333f invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values()), json);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$25
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, y81.f] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, y81.f] */
            @Override // p715kotlin.jvm.functions.Function1
            public final EnumC39333f invoke(Object obj20) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj20);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement6 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values()), jsonElement6);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof EnumC39333f) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values()), jsonPrimitiveM1841c6);
                    } catch (Exception unused12) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(EnumC39333f.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (EnumC39333f) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (EnumC39333f) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (EnumC39333f) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (EnumC39333f) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (EnumC39333f) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (EnumC39333f) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (barColor2 == null) {
            barColor2 = numericInputSliderModel.getBarColor();
        }
        EnumC39333f enumC39333f = barColor2;
        Object objValueOf5 = Float.valueOf(numericInputSliderModel.getSliderValue());
        if (objValueOf5 instanceof WithGeneratedBindings) {
            Object objBind6 = ((WithGeneratedBindings) objValueOf5).bind(accumulatedState);
            if (!(objBind6 instanceof Float)) {
                objBind6 = null;
            }
            f14 = (Float) objBind6;
            if (f14 == null) {
                objOverlayContentPathBindings6 = objValueOf5;
            } else {
                objOverlayContentPathBindings6 = f14;
            }
        } else if (objValueOf5 instanceof List) {
            Iterable iterable6 = (Iterable) objValueOf5;
            ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(iterable6, 10));
            for (Object obj20 : iterable6) {
                WithGeneratedBindings withGeneratedBindings6 = obj20 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj20 : null;
                if (withGeneratedBindings6 != null && (withGeneratedBindingsBind6 = withGeneratedBindings6.bind(accumulatedState)) != null) {
                    obj20 = withGeneratedBindingsBind6;
                }
                arrayList6.add(obj20);
            }
            f14 = (Float) arrayList6;
            objOverlayContentPathBindings6 = f14;
        } else {
            objOverlayContentPathBindings6 = objValueOf5;
        }
        String strResolveContentBindingKey6 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "sliderValue") : null;
        if (strResolveContentBindingKey6 != null) {
            Object objResolveStateRef6 = StateLookupKt.resolveStateRef(strResolveContentBindingKey6, accumulatedState);
            if (objResolveStateRef6 != null) {
                BindingLoggerKt.logContentBinding("sliderValue", strResolveContentBindingKey6, objResolveStateRef6);
                Object objUnwrapForCoercion6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef6);
                if ((objUnwrapForCoercion6 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion6)) {
                    obj7 = obj19;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj7), Boolean.TRUE)) {
                        objOverlayContentPathBindings6 = null;
                    }
                } else {
                    obj7 = obj19;
                }
                objOverlayContentPathBindings6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef6);
                if (objOverlayContentPathBindings6 == null) {
                    objOverlayContentPathBindings6 = null;
                } else if (objOverlayContentPathBindings6 instanceof JsonElement) {
                    JsonElement jsonElement6 = (JsonElement) objOverlayContentPathBindings6;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings6 = StateBindingDeserializerKt.getStateBindingJson().m1830a(FloatSerializer.INSTANCE, jsonElement6);
                    } catch (Exception unused11) {
                        objOverlayContentPathBindings6 = null;
                    }
                } else if (!(objOverlayContentPathBindings6 instanceof Float)) {
                    if (objOverlayContentPathBindings6 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a6 = AbstractC22671h0.m65688a(Float.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings6 = (Float) Integer.valueOf(((Number) objOverlayContentPathBindings6).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings6 = (Float) Long.valueOf(((Number) objOverlayContentPathBindings6).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings6 = (Float) Double.valueOf(((Number) objOverlayContentPathBindings6).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings6 = Float.valueOf(((Number) objOverlayContentPathBindings6).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings6 = (Float) Short.valueOf(((Number) objOverlayContentPathBindings6).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings6 = (Float) Byte.valueOf(((Number) objOverlayContentPathBindings6).byteValue());
                        } else {
                            objOverlayContentPathBindings6 = null;
                        }
                    } else if (objOverlayContentPathBindings6 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings6);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings6 = StateBindingDeserializerKt.getStateBindingJson().m1830a(FloatSerializer.INSTANCE, jsonPrimitiveM1841c6);
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
                    objOverlayContentPathBindings6 = objValueOf5;
                }
            } else {
                obj7 = obj19;
            }
        } else {
            obj7 = obj19;
            objOverlayContentPathBindings6 = ContentPathBindingsKt.overlayContentPathBindings(map, "sliderValue", accumulatedState, objOverlayContentPathBindings6, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$26
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj21) {
                    return invoke((Float) obj21);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Float v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(FloatSerializer.INSTANCE, v13);
                    } catch (Exception unused13) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$27
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Float, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Float invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(FloatSerializer.INSTANCE, json);
                    } catch (Exception unused13) {
                        return null;
                    }
                }
            });
        }
        Object obj21 = obj7;
        Float f17 = (Float) DotPathBindingsKt.overlayAggregateBinding(map2, "sliderValue", accumulatedState, objOverlayContentPathBindings6, "sliderValue", new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$28
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj22) {
                return invoke((Float) obj22);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Float f18) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(FloatSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, f18, interfaceC37138cM122336d);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$29
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Float, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Float invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(FloatSerializer.INSTANCE, json);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$30
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Float, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Float, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Float invoke(Object obj22) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj22);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement7 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(FloatSerializer.INSTANCE, jsonElement7);
                    } catch (Exception unused13) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof Float) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c7 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(FloatSerializer.INSTANCE, jsonPrimitiveM1841c7);
                    } catch (Exception unused14) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Float.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (Float) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (Float) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (Float) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (Float) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (Float) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        float fFloatValue3 = f17 != null ? f17.floatValue() : numericInputSliderModel.getSliderValue();
        Object startLabel = numericInputSliderModel.getStartLabel();
        if (startLabel == null) {
            objOverlayContentPathBindings7 = null;
        } else {
            if (startLabel instanceof WithGeneratedBindings) {
                Object objBind7 = ((WithGeneratedBindings) startLabel).bind(accumulatedState);
                if (!(objBind7 instanceof NumericInputSliderModel.StartLabel)) {
                    objBind7 = null;
                }
                obj8 = (NumericInputSliderModel.StartLabel) objBind7;
                if (obj8 == null) {
                    obj8 = startLabel;
                }
            } else if (startLabel instanceof List) {
                Iterable iterable7 = (Iterable) startLabel;
                ArrayList arrayList7 = new ArrayList(AbstractC25267u.m74163i0(iterable7, 10));
                for (Object obj22 : iterable7) {
                    WithGeneratedBindings withGeneratedBindings7 = obj22 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj22 : null;
                    if (withGeneratedBindings7 != null && (withGeneratedBindingsBind7 = withGeneratedBindings7.bind(accumulatedState)) != null) {
                        obj22 = withGeneratedBindingsBind7;
                    }
                    arrayList7.add(obj22);
                }
                obj8 = (NumericInputSliderModel.StartLabel) arrayList7;
            } else {
                obj8 = startLabel;
            }
            objOverlayContentPathBindings7 = obj8;
        }
        String strResolveContentBindingKey7 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "startLabel") : null;
        if (strResolveContentBindingKey7 != null) {
            Object objResolveStateRef7 = StateLookupKt.resolveStateRef(strResolveContentBindingKey7, accumulatedState);
            if (objResolveStateRef7 != null) {
                BindingLoggerKt.logContentBinding("startLabel", strResolveContentBindingKey7, objResolveStateRef7);
                Object objUnwrapForCoercion7 = BindCoercionKt.unwrapForCoercion(objResolveStateRef7);
                if ((objUnwrapForCoercion7 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion7) && AbstractC22676k.m65745e(accumulatedState.get(obj21), Boolean.TRUE)) {
                    objOverlayContentPathBindings7 = null;
                } else {
                    objOverlayContentPathBindings7 = BindCoercionKt.unwrapForCoercion(objResolveStateRef7);
                    if (objOverlayContentPathBindings7 == null) {
                        objOverlayContentPathBindings7 = null;
                    } else if (objOverlayContentPathBindings7 instanceof JsonElement) {
                        JsonElement jsonElement7 = (JsonElement) objOverlayContentPathBindings7;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings7 = StateBindingDeserializerKt.getStateBindingJson().m1830a(NumericInputSliderModel.StartLabel.INSTANCE.serializer(), jsonElement7);
                        } catch (Exception unused13) {
                            objOverlayContentPathBindings7 = null;
                        }
                    } else if (!(objOverlayContentPathBindings7 instanceof NumericInputSliderModel.StartLabel)) {
                        if (objOverlayContentPathBindings7 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a7 = AbstractC22671h0.m65688a(NumericInputSliderModel.StartLabel.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings7 = (NumericInputSliderModel.StartLabel) Integer.valueOf(((Number) objOverlayContentPathBindings7).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings7 = (NumericInputSliderModel.StartLabel) Long.valueOf(((Number) objOverlayContentPathBindings7).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings7 = (NumericInputSliderModel.StartLabel) Double.valueOf(((Number) objOverlayContentPathBindings7).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings7 = (NumericInputSliderModel.StartLabel) Float.valueOf(((Number) objOverlayContentPathBindings7).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings7 = (NumericInputSliderModel.StartLabel) Short.valueOf(((Number) objOverlayContentPathBindings7).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings7 = (NumericInputSliderModel.StartLabel) Byte.valueOf(((Number) objOverlayContentPathBindings7).byteValue());
                            } else {
                                objOverlayContentPathBindings7 = null;
                            }
                        } else if (objOverlayContentPathBindings7 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c7 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings7);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings7 = StateBindingDeserializerKt.getStateBindingJson().m1830a(NumericInputSliderModel.StartLabel.INSTANCE.serializer(), jsonPrimitiveM1841c7);
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
                    if (objOverlayContentPathBindings7 == null) {
                        objOverlayContentPathBindings7 = startLabel;
                    }
                }
            }
        } else if (objOverlayContentPathBindings7 != null) {
            objOverlayContentPathBindings7 = ContentPathBindingsKt.overlayContentPathBindings(map, "startLabel", accumulatedState, objOverlayContentPathBindings7, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$31
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj23) {
                    return invoke((NumericInputSliderModel.StartLabel) obj23);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(NumericInputSliderModel.StartLabel v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(NumericInputSliderModel.StartLabel.INSTANCE.serializer(), v13);
                    } catch (Exception unused15) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$32
                /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.items.NumericInputSliderModel$StartLabel, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final NumericInputSliderModel.StartLabel invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(NumericInputSliderModel.StartLabel.INSTANCE.serializer(), json);
                    } catch (Exception unused15) {
                        return null;
                    }
                }
            });
        }
        NumericInputSliderModel.StartLabel startLabel2 = (NumericInputSliderModel.StartLabel) DotPathBindingsKt.overlayAggregateBinding(map2, "startLabel", accumulatedState, objOverlayContentPathBindings7, "startLabel", new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$33
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj23) {
                return invoke((NumericInputSliderModel.StartLabel) obj23);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(NumericInputSliderModel.StartLabel startLabel3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(NumericInputSliderModel.StartLabel.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, startLabel3, interfaceC37138cM122336d);
                } catch (Exception unused15) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$34
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.items.NumericInputSliderModel$StartLabel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final NumericInputSliderModel.StartLabel invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(NumericInputSliderModel.StartLabel.INSTANCE.serializer(), json);
                } catch (Exception unused15) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$35
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.items.NumericInputSliderModel$StartLabel, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.items.NumericInputSliderModel$StartLabel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final NumericInputSliderModel.StartLabel invoke(Object obj23) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj23);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement8 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(NumericInputSliderModel.StartLabel.INSTANCE.serializer(), jsonElement8);
                    } catch (Exception unused15) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof NumericInputSliderModel.StartLabel) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c8 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(NumericInputSliderModel.StartLabel.INSTANCE.serializer(), jsonPrimitiveM1841c8);
                    } catch (Exception unused16) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(NumericInputSliderModel.StartLabel.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (NumericInputSliderModel.StartLabel) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (NumericInputSliderModel.StartLabel) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (NumericInputSliderModel.StartLabel) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (NumericInputSliderModel.StartLabel) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (NumericInputSliderModel.StartLabel) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (NumericInputSliderModel.StartLabel) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        Object endLabel = numericInputSliderModel.getEndLabel();
        if (endLabel == null) {
            objOverlayContentPathBindings8 = null;
        } else {
            if (endLabel instanceof WithGeneratedBindings) {
                Object objBind8 = ((WithGeneratedBindings) endLabel).bind(accumulatedState);
                if (!(objBind8 instanceof NumericInputSliderModel.EndLabel)) {
                    objBind8 = null;
                }
                obj9 = (NumericInputSliderModel.EndLabel) objBind8;
                if (obj9 == null) {
                    obj9 = endLabel;
                }
            } else if (endLabel instanceof List) {
                Iterable iterable8 = (Iterable) endLabel;
                ArrayList arrayList8 = new ArrayList(AbstractC25267u.m74163i0(iterable8, 10));
                for (Object obj23 : iterable8) {
                    WithGeneratedBindings withGeneratedBindings8 = obj23 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj23 : null;
                    if (withGeneratedBindings8 != null && (withGeneratedBindingsBind8 = withGeneratedBindings8.bind(accumulatedState)) != null) {
                        obj23 = withGeneratedBindingsBind8;
                    }
                    arrayList8.add(obj23);
                }
                obj9 = (NumericInputSliderModel.EndLabel) arrayList8;
            } else {
                obj9 = endLabel;
            }
            objOverlayContentPathBindings8 = obj9;
        }
        String strResolveContentBindingKey8 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "endLabel") : null;
        if (strResolveContentBindingKey8 != null) {
            Object objResolveStateRef8 = StateLookupKt.resolveStateRef(strResolveContentBindingKey8, accumulatedState);
            if (objResolveStateRef8 != null) {
                BindingLoggerKt.logContentBinding("endLabel", strResolveContentBindingKey8, objResolveStateRef8);
                Object objUnwrapForCoercion8 = BindCoercionKt.unwrapForCoercion(objResolveStateRef8);
                if ((objUnwrapForCoercion8 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion8) && AbstractC22676k.m65745e(accumulatedState.get(obj21), Boolean.TRUE)) {
                    objOverlayContentPathBindings8 = null;
                } else {
                    objOverlayContentPathBindings8 = BindCoercionKt.unwrapForCoercion(objResolveStateRef8);
                    if (objOverlayContentPathBindings8 == null) {
                        objOverlayContentPathBindings8 = null;
                    } else if (objOverlayContentPathBindings8 instanceof JsonElement) {
                        JsonElement jsonElement8 = (JsonElement) objOverlayContentPathBindings8;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings8 = StateBindingDeserializerKt.getStateBindingJson().m1830a(NumericInputSliderModel.EndLabel.INSTANCE.serializer(), jsonElement8);
                        } catch (Exception unused15) {
                            objOverlayContentPathBindings8 = null;
                        }
                    } else if (!(objOverlayContentPathBindings8 instanceof NumericInputSliderModel.EndLabel)) {
                        if (objOverlayContentPathBindings8 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a8 = AbstractC22671h0.m65688a(NumericInputSliderModel.EndLabel.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings8 = (NumericInputSliderModel.EndLabel) Integer.valueOf(((Number) objOverlayContentPathBindings8).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings8 = (NumericInputSliderModel.EndLabel) Long.valueOf(((Number) objOverlayContentPathBindings8).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings8 = (NumericInputSliderModel.EndLabel) Double.valueOf(((Number) objOverlayContentPathBindings8).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings8 = (NumericInputSliderModel.EndLabel) Float.valueOf(((Number) objOverlayContentPathBindings8).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings8 = (NumericInputSliderModel.EndLabel) Short.valueOf(((Number) objOverlayContentPathBindings8).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings8 = (NumericInputSliderModel.EndLabel) Byte.valueOf(((Number) objOverlayContentPathBindings8).byteValue());
                            } else {
                                objOverlayContentPathBindings8 = null;
                            }
                        } else if (objOverlayContentPathBindings8 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c8 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings8);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings8 = StateBindingDeserializerKt.getStateBindingJson().m1830a(NumericInputSliderModel.EndLabel.INSTANCE.serializer(), jsonPrimitiveM1841c8);
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
                        objOverlayContentPathBindings8 = endLabel;
                    }
                }
            }
        } else if (objOverlayContentPathBindings8 != null) {
            objOverlayContentPathBindings8 = ContentPathBindingsKt.overlayContentPathBindings(map, "endLabel", accumulatedState, objOverlayContentPathBindings8, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$36
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj24) {
                    return invoke((NumericInputSliderModel.EndLabel) obj24);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(NumericInputSliderModel.EndLabel v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(NumericInputSliderModel.EndLabel.INSTANCE.serializer(), v13);
                    } catch (Exception unused17) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$37
                /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.items.NumericInputSliderModel$EndLabel, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final NumericInputSliderModel.EndLabel invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(NumericInputSliderModel.EndLabel.INSTANCE.serializer(), json);
                    } catch (Exception unused17) {
                        return null;
                    }
                }
            });
        }
        NumericInputSliderModel.EndLabel endLabel2 = (NumericInputSliderModel.EndLabel) DotPathBindingsKt.overlayAggregateBinding(map2, "endLabel", accumulatedState, objOverlayContentPathBindings8, "endLabel", new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$38
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj24) {
                return invoke((NumericInputSliderModel.EndLabel) obj24);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(NumericInputSliderModel.EndLabel endLabel3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(NumericInputSliderModel.EndLabel.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, endLabel3, interfaceC37138cM122336d);
                } catch (Exception unused17) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$39
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.items.NumericInputSliderModel$EndLabel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final NumericInputSliderModel.EndLabel invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(NumericInputSliderModel.EndLabel.INSTANCE.serializer(), json);
                } catch (Exception unused17) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$40
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.items.NumericInputSliderModel$EndLabel, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.items.NumericInputSliderModel$EndLabel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final NumericInputSliderModel.EndLabel invoke(Object obj24) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj24);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement9 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(NumericInputSliderModel.EndLabel.INSTANCE.serializer(), jsonElement9);
                    } catch (Exception unused17) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof NumericInputSliderModel.EndLabel) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c9 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(NumericInputSliderModel.EndLabel.INSTANCE.serializer(), jsonPrimitiveM1841c9);
                    } catch (Exception unused18) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(NumericInputSliderModel.EndLabel.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (NumericInputSliderModel.EndLabel) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (NumericInputSliderModel.EndLabel) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (NumericInputSliderModel.EndLabel) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (NumericInputSliderModel.EndLabel) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (NumericInputSliderModel.EndLabel) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (NumericInputSliderModel.EndLabel) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        MultiWheelPickerModel picker = numericInputSliderModel.getPicker();
        if (picker == null) {
            obj10 = null;
        } else {
            WithGeneratedBindings withGeneratedBindingsBind9 = picker.bind(accumulatedState);
            if (!(withGeneratedBindingsBind9 instanceof MultiWheelPickerModel)) {
                withGeneratedBindingsBind9 = null;
            }
            MultiWheelPickerModel multiWheelPickerModel = (MultiWheelPickerModel) withGeneratedBindingsBind9;
            if (multiWheelPickerModel == null) {
                multiWheelPickerModel = picker;
            }
            obj10 = multiWheelPickerModel;
        }
        String strResolveContentBindingKey9 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "picker") : null;
        if (strResolveContentBindingKey9 != null) {
            Object objResolveStateRef9 = StateLookupKt.resolveStateRef(strResolveContentBindingKey9, accumulatedState);
            if (objResolveStateRef9 != null) {
                BindingLoggerKt.logContentBinding("picker", strResolveContentBindingKey9, objResolveStateRef9);
                Object objUnwrapForCoercion9 = BindCoercionKt.unwrapForCoercion(objResolveStateRef9);
                if ((objUnwrapForCoercion9 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion9) && AbstractC22676k.m65745e(accumulatedState.get(obj21), Boolean.TRUE)) {
                    obj10 = null;
                } else {
                    Object objUnwrapForCoercion10 = BindCoercionKt.unwrapForCoercion(objResolveStateRef9);
                    if (objUnwrapForCoercion10 == null) {
                        objOverlayContentPathBindings9 = null;
                    } else if (objUnwrapForCoercion10 instanceof JsonElement) {
                        JsonElement jsonElement9 = (JsonElement) objUnwrapForCoercion10;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings9 = StateBindingDeserializerKt.getStateBindingJson().m1830a(MultiWheelPickerModel.INSTANCE.serializer(), jsonElement9);
                        } catch (Exception unused17) {
                            objOverlayContentPathBindings9 = null;
                        }
                    } else if (objUnwrapForCoercion10 instanceof MultiWheelPickerModel) {
                        objOverlayContentPathBindings9 = objUnwrapForCoercion10;
                    } else {
                        if (objUnwrapForCoercion10 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a9 = AbstractC22671h0.m65688a(MultiWheelPickerModel.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings9 = (MultiWheelPickerModel) Integer.valueOf(((Number) objUnwrapForCoercion10).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings9 = (MultiWheelPickerModel) Long.valueOf(((Number) objUnwrapForCoercion10).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings9 = (MultiWheelPickerModel) Double.valueOf(((Number) objUnwrapForCoercion10).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings9 = (MultiWheelPickerModel) Float.valueOf(((Number) objUnwrapForCoercion10).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings9 = (MultiWheelPickerModel) Short.valueOf(((Number) objUnwrapForCoercion10).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings9 = (MultiWheelPickerModel) Byte.valueOf(((Number) objUnwrapForCoercion10).byteValue());
                            }
                        } else if (objUnwrapForCoercion10 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c9 = AbstractC0770m.m1841c((String) objUnwrapForCoercion10);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objUnwrapForCoercion10 = StateBindingDeserializerKt.getStateBindingJson().m1830a(MultiWheelPickerModel.INSTANCE.serializer(), jsonPrimitiveM1841c9);
                            } catch (Exception unused18) {
                                objUnwrapForCoercion10 = null;
                            }
                            if (objUnwrapForCoercion10 != null) {
                                objOverlayContentPathBindings9 = objUnwrapForCoercion10;
                            }
                        }
                        objOverlayContentPathBindings9 = null;
                    }
                    obj10 = objOverlayContentPathBindings9 == null ? picker : objOverlayContentPathBindings9;
                }
            }
        } else if (obj10 != null) {
            objOverlayContentPathBindings9 = ContentPathBindingsKt.overlayContentPathBindings(map, "picker", accumulatedState, obj10, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$41
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj24) {
                    return invoke((MultiWheelPickerModel) obj24);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(MultiWheelPickerModel v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(MultiWheelPickerModel.INSTANCE.serializer(), v13);
                    } catch (Exception unused19) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$42
                /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.items.MultiWheelPickerModel, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final MultiWheelPickerModel invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(MultiWheelPickerModel.INSTANCE.serializer(), json);
                    } catch (Exception unused19) {
                        return null;
                    }
                }
            });
        }
        return (NumericInputSliderModel) ContentBindingResolverKt.copyBindingsFrom(new NumericInputSliderModel(fFloatValue, fFloatValue2, iIntValue, iIntValue2, enumC39333f, fFloatValue3, startLabel2, endLabel2, (MultiWheelPickerModel) DotPathBindingsKt.overlayAggregateBinding(map2, "picker", accumulatedState, obj10, "picker", new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$43
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj24) {
                return invoke((MultiWheelPickerModel) obj24);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(MultiWheelPickerModel multiWheelPickerModel2) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(MultiWheelPickerModel.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, multiWheelPickerModel2, interfaceC37138cM122336d);
                } catch (Exception unused19) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$44
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.items.MultiWheelPickerModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final MultiWheelPickerModel invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(MultiWheelPickerModel.INSTANCE.serializer(), json);
                } catch (Exception unused19) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.NumericInputSliderModelStateBindingKt$generatedBind$$inlined$resolveBinding$45
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.items.MultiWheelPickerModel, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.items.MultiWheelPickerModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final MultiWheelPickerModel invoke(Object obj24) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj24);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement10 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(MultiWheelPickerModel.INSTANCE.serializer(), jsonElement10);
                    } catch (Exception unused19) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof MultiWheelPickerModel) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c10 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(MultiWheelPickerModel.INSTANCE.serializer(), jsonPrimitiveM1841c10);
                    } catch (Exception unused20) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(MultiWheelPickerModel.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (MultiWheelPickerModel) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (MultiWheelPickerModel) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (MultiWheelPickerModel) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (MultiWheelPickerModel) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (MultiWheelPickerModel) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (MultiWheelPickerModel) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        })), numericInputSliderModel);
    }

    public static /* synthetic */ NumericInputSliderModel generatedBind$default(NumericInputSliderModel numericInputSliderModel, Map map, Map map2, Map map3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map2 = null;
        }
        return generatedBind(numericInputSliderModel, map, map2, map3);
    }
}
