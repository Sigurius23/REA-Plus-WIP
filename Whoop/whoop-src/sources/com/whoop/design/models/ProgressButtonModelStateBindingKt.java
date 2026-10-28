package com.whoop.design.models;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import com.whoop.design.atomic.atom.icon.GlowStyle;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.BindCoercionKt;
import com.whoop.design.models.binding.BindingLoggerKt;
import com.whoop.design.models.binding.ContentBindingResolverKt;
import com.whoop.design.models.binding.ContentPathBindingsKt;
import com.whoop.design.models.binding.DotPathBindingsKt;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.design.models.binding.StateBindingDeserializerKt;
import com.whoop.design.models.binding.StateLookupKt;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
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
import p745y81.EnumC39333f;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003¨\u0006\t"}, m65681d2 = {"generatedBind", "Lcom/whoop/design/models/ProgressButtonModel;", "contentBinding", "", "", "aggregateBindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "accumulatedState", "", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ProgressButtonModelStateBindingKt {
    /* JADX WARN: Code duplicated, block: B:129:0x0230  */
    /* JADX WARN: Code duplicated, block: B:148:0x0270  */
    /* JADX WARN: Code duplicated, block: B:221:0x03da  */
    /* JADX WARN: Code duplicated, block: B:240:0x041a  */
    /* JADX WARN: Code duplicated, block: B:312:0x0576  */
    /* JADX WARN: Code duplicated, block: B:331:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:404:0x0724  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:423:0x0764  */
    /* JADX WARN: Code duplicated, block: B:502:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:521:0x0922  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:591:0x0a86  */
    /* JADX WARN: Code duplicated, block: B:610:0x0ac6  */
    /* JADX WARN: Code duplicated, block: B:680:0x0c1c  */
    /* JADX WARN: Code duplicated, block: B:699:0x0c5c  */
    /* JADX WARN: Code duplicated, block: B:769:0x0db4  */
    /* JADX WARN: Code duplicated, block: B:788:0x0df4  */
    /* JADX WARN: Code duplicated, block: B:858:0x0f58  */
    /* JADX WARN: Code duplicated, block: B:878:0x0f9a  */
    /* JADX WARN: Code duplicated, block: B:948:0x10fa  */
    /* JADX WARN: Code duplicated, block: B:974:0x1163 A[PHI: r4
      0x1163: PHI (r4v102 java.lang.Object) = (r4v78 java.lang.Object), (r4v82 java.lang.Object) binds: [B:973:0x1161, B:1001:0x1229] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ProgressButtonModel generatedBind(ProgressButtonModel progressButtonModel, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, ? extends Object> accumulatedState) {
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
        Map<String, String> map3;
        WithGeneratedBindings withGeneratedBindingsBind10;
        Object objOverlayContentPathBindings10;
        Object obj17;
        Map<String, AggregateBinding> map4;
        WithGeneratedBindings withGeneratedBindingsBind11;
        Object obj18;
        Object objOverlayContentPathBindings11;
        AbstractC22676k.m65750j(progressButtonModel, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if ((map == null || map.isEmpty()) && ((map2 == null || map2.isEmpty()) && accumulatedState.isEmpty())) {
            return progressButtonModel;
        }
        Object buttonType = progressButtonModel.getButtonType();
        if (buttonType == null) {
            objOverlayContentPathBindings = null;
        } else if (buttonType instanceof WithGeneratedBindings) {
            Object objBind = ((WithGeneratedBindings) buttonType).bind(accumulatedState);
            if (!(objBind instanceof ProgressButtonModel.ButtonType)) {
                objBind = null;
            }
            objOverlayContentPathBindings = (ProgressButtonModel.ButtonType) objBind;
            if (objOverlayContentPathBindings == null) {
                objOverlayContentPathBindings = buttonType;
            }
        } else if (buttonType instanceof List) {
            Iterable iterable = (Iterable) buttonType;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            for (Object obj19 : iterable) {
                WithGeneratedBindings withGeneratedBindings = obj19 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj19 : null;
                if (withGeneratedBindings != null && (withGeneratedBindingsBind = withGeneratedBindings.bind(accumulatedState)) != null) {
                    obj19 = withGeneratedBindingsBind;
                }
                arrayList.add(obj19);
            }
            objOverlayContentPathBindings = (ProgressButtonModel.ButtonType) arrayList;
        } else {
            objOverlayContentPathBindings = buttonType;
        }
        String strResolveContentBindingKey = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "buttonType") : null;
        Class cls = Byte.TYPE;
        Class cls2 = Short.TYPE;
        Class cls3 = Float.TYPE;
        Class cls4 = Double.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        if (strResolveContentBindingKey != null) {
            Object objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
            if (objResolveStateRef != null) {
                BindingLoggerKt.logContentBinding("buttonType", strResolveContentBindingKey, objResolveStateRef);
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
                            objOverlayContentPathBindings = StateBindingDeserializerKt.getStateBindingJson().m1830a(ProgressButtonModel.ButtonType.INSTANCE.serializer(), jsonElement);
                        } catch (Exception unused) {
                            objOverlayContentPathBindings = null;
                        }
                    } else if (!(objOverlayContentPathBindings instanceof ProgressButtonModel.ButtonType)) {
                        if (objOverlayContentPathBindings instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a = AbstractC22671h0.m65688a(ProgressButtonModel.ButtonType.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings = (ProgressButtonModel.ButtonType) Integer.valueOf(((Number) objOverlayContentPathBindings).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings = (ProgressButtonModel.ButtonType) Long.valueOf(((Number) objOverlayContentPathBindings).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings = (ProgressButtonModel.ButtonType) Double.valueOf(((Number) objOverlayContentPathBindings).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings = (ProgressButtonModel.ButtonType) Float.valueOf(((Number) objOverlayContentPathBindings).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings = (ProgressButtonModel.ButtonType) Short.valueOf(((Number) objOverlayContentPathBindings).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings = (ProgressButtonModel.ButtonType) Byte.valueOf(((Number) objOverlayContentPathBindings).byteValue());
                            } else {
                                objOverlayContentPathBindings = null;
                            }
                        } else if (objOverlayContentPathBindings instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c = AbstractC0770m.m1841c((String) objOverlayContentPathBindings);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings = StateBindingDeserializerKt.getStateBindingJson().m1830a(ProgressButtonModel.ButtonType.INSTANCE.serializer(), jsonPrimitiveM1841c);
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
                        objOverlayContentPathBindings = buttonType;
                    }
                }
            }
        } else if (objOverlayContentPathBindings != null) {
            objOverlayContentPathBindings = ContentPathBindingsKt.overlayContentPathBindings(map, "buttonType", accumulatedState, objOverlayContentPathBindings, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$1
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj20) {
                    return invoke((ProgressButtonModel.ButtonType) obj20);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(ProgressButtonModel.ButtonType v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(ProgressButtonModel.ButtonType.INSTANCE.serializer(), v13);
                    } catch (Exception unused3) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$2
                /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.ProgressButtonModel$ButtonType, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final ProgressButtonModel.ButtonType invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(ProgressButtonModel.ButtonType.INSTANCE.serializer(), json);
                    } catch (Exception unused3) {
                        return null;
                    }
                }
            });
        }
        ProgressButtonModel.ButtonType buttonType2 = (ProgressButtonModel.ButtonType) DotPathBindingsKt.overlayAggregateBinding(map2, "buttonType", accumulatedState, objOverlayContentPathBindings, "buttonType", new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$3
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj20) {
                return invoke((ProgressButtonModel.ButtonType) obj20);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(ProgressButtonModel.ButtonType buttonType3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(ProgressButtonModel.ButtonType.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, buttonType3, interfaceC37138cM122336d);
                } catch (Exception unused3) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$4
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.ProgressButtonModel$ButtonType, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final ProgressButtonModel.ButtonType invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(ProgressButtonModel.ButtonType.INSTANCE.serializer(), json);
                } catch (Exception unused3) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$5
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.ProgressButtonModel$ButtonType, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.ProgressButtonModel$ButtonType, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final ProgressButtonModel.ButtonType invoke(Object obj20) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj20);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement2 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(ProgressButtonModel.ButtonType.INSTANCE.serializer(), jsonElement2);
                    } catch (Exception unused3) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof ProgressButtonModel.ButtonType) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(ProgressButtonModel.ButtonType.INSTANCE.serializer(), jsonPrimitiveM1841c2);
                    } catch (Exception unused4) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(ProgressButtonModel.ButtonType.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (ProgressButtonModel.ButtonType) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (ProgressButtonModel.ButtonType) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (ProgressButtonModel.ButtonType) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (ProgressButtonModel.ButtonType) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (ProgressButtonModel.ButtonType) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (ProgressButtonModel.ButtonType) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (buttonType2 == null) {
            buttonType2 = progressButtonModel.getButtonType();
        }
        ProgressButtonModel.ButtonType buttonType3 = buttonType2;
        Object style = progressButtonModel.getStyle();
        if (style == null) {
            objOverlayContentPathBindings2 = null;
        } else {
            if (style instanceof WithGeneratedBindings) {
                Object objBind2 = ((WithGeneratedBindings) style).bind(accumulatedState);
                if (!(objBind2 instanceof ProgressButtonModel.ButtonStyle)) {
                    objBind2 = null;
                }
                obj = (ProgressButtonModel.ButtonStyle) objBind2;
                if (obj == null) {
                    obj = style;
                }
            } else if (style instanceof List) {
                Iterable iterable2 = (Iterable) style;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
                for (Object obj20 : iterable2) {
                    WithGeneratedBindings withGeneratedBindings2 = obj20 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj20 : null;
                    if (withGeneratedBindings2 != null && (withGeneratedBindingsBind2 = withGeneratedBindings2.bind(accumulatedState)) != null) {
                        obj20 = withGeneratedBindingsBind2;
                    }
                    arrayList2.add(obj20);
                }
                obj = (ProgressButtonModel.ButtonStyle) arrayList2;
            } else {
                obj = style;
            }
            objOverlayContentPathBindings2 = obj;
        }
        String strResolveContentBindingKey2 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "style") : null;
        if (strResolveContentBindingKey2 != null) {
            Object objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
            if (objResolveStateRef2 != null) {
                BindingLoggerKt.logContentBinding("style", strResolveContentBindingKey2, objResolveStateRef2);
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
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(ProgressButtonModel.ButtonStyle.INSTANCE.serializer(), jsonElement2);
                    } catch (Exception unused3) {
                        objOverlayContentPathBindings2 = null;
                    }
                } else if (!(objOverlayContentPathBindings2 instanceof ProgressButtonModel.ButtonStyle)) {
                    if (objOverlayContentPathBindings2 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a2 = AbstractC22671h0.m65688a(ProgressButtonModel.ButtonStyle.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings2 = (ProgressButtonModel.ButtonStyle) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings2 = (ProgressButtonModel.ButtonStyle) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings2 = (ProgressButtonModel.ButtonStyle) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings2 = (ProgressButtonModel.ButtonStyle) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings2 = (ProgressButtonModel.ButtonStyle) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings2 = (ProgressButtonModel.ButtonStyle) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                        } else {
                            objOverlayContentPathBindings2 = null;
                        }
                    } else if (objOverlayContentPathBindings2 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(ProgressButtonModel.ButtonStyle.INSTANCE.serializer(), jsonPrimitiveM1841c2);
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
                    objOverlayContentPathBindings2 = style;
                }
            } else {
                obj2 = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
            }
        } else {
            obj2 = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
            if (objOverlayContentPathBindings2 != null) {
                objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(map, "style", accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$6
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj21) {
                        return invoke((ProgressButtonModel.ButtonStyle) obj21);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(ProgressButtonModel.ButtonStyle v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(ProgressButtonModel.ButtonStyle.INSTANCE.serializer(), v13);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$7
                    /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.ProgressButtonModel$ButtonStyle, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final ProgressButtonModel.ButtonStyle invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(ProgressButtonModel.ButtonStyle.INSTANCE.serializer(), json);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj21 = obj2;
        ProgressButtonModel.ButtonStyle style2 = (ProgressButtonModel.ButtonStyle) DotPathBindingsKt.overlayAggregateBinding(map2, "style", accumulatedState, objOverlayContentPathBindings2, "style", new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$8
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj22) {
                return invoke((ProgressButtonModel.ButtonStyle) obj22);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(ProgressButtonModel.ButtonStyle buttonStyle) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(ProgressButtonModel.ButtonStyle.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, buttonStyle, interfaceC37138cM122336d);
                } catch (Exception unused5) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$9
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.ProgressButtonModel$ButtonStyle, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final ProgressButtonModel.ButtonStyle invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(ProgressButtonModel.ButtonStyle.INSTANCE.serializer(), json);
                } catch (Exception unused5) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$10
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.ProgressButtonModel$ButtonStyle, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.ProgressButtonModel$ButtonStyle, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final ProgressButtonModel.ButtonStyle invoke(Object obj22) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj22);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement3 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(ProgressButtonModel.ButtonStyle.INSTANCE.serializer(), jsonElement3);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof ProgressButtonModel.ButtonStyle) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(ProgressButtonModel.ButtonStyle.INSTANCE.serializer(), jsonPrimitiveM1841c3);
                    } catch (Exception unused6) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(ProgressButtonModel.ButtonStyle.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (ProgressButtonModel.ButtonStyle) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (ProgressButtonModel.ButtonStyle) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (ProgressButtonModel.ButtonStyle) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (ProgressButtonModel.ButtonStyle) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (ProgressButtonModel.ButtonStyle) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (ProgressButtonModel.ButtonStyle) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (style2 == null) {
            style2 = progressButtonModel.getStyle();
        }
        ProgressButtonModel.ButtonStyle buttonStyle = style2;
        Object icon = progressButtonModel.getIcon();
        if (icon == null) {
            objOverlayContentPathBindings3 = null;
        } else {
            if (icon instanceof WithGeneratedBindings) {
                Object objBind3 = ((WithGeneratedBindings) icon).bind(accumulatedState);
                if (!(objBind3 instanceof String)) {
                    objBind3 = null;
                }
                obj3 = (String) objBind3;
                if (obj3 == null) {
                    obj3 = icon;
                }
            } else if (icon instanceof List) {
                Iterable iterable3 = (Iterable) icon;
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable3, 10));
                for (Object obj22 : iterable3) {
                    WithGeneratedBindings withGeneratedBindings3 = obj22 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj22 : null;
                    if (withGeneratedBindings3 != null && (withGeneratedBindingsBind3 = withGeneratedBindings3.bind(accumulatedState)) != null) {
                        obj22 = withGeneratedBindingsBind3;
                    }
                    arrayList3.add(obj22);
                }
                obj3 = (String) arrayList3;
            } else {
                obj3 = icon;
            }
            objOverlayContentPathBindings3 = obj3;
        }
        String strResolveContentBindingKey3 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "icon") : null;
        if (strResolveContentBindingKey3 != null) {
            Object objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
            if (objResolveStateRef3 != null) {
                BindingLoggerKt.logContentBinding("icon", strResolveContentBindingKey3, objResolveStateRef3);
                Object objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if ((objUnwrapForCoercion3 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion3)) {
                    obj4 = obj21;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj4), Boolean.TRUE)) {
                        objOverlayContentPathBindings3 = null;
                    }
                } else {
                    obj4 = obj21;
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
                    boolean z4 = objOverlayContentPathBindings3 instanceof String;
                    if (!z4) {
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
                        } else if (z4) {
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
                    objOverlayContentPathBindings3 = icon;
                }
            } else {
                obj4 = obj21;
            }
        } else {
            obj4 = obj21;
            if (objOverlayContentPathBindings3 != null) {
                objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(map, "icon", accumulatedState, objOverlayContentPathBindings3, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$11
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj23) {
                        return invoke((String) obj23);
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
                }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$12
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
        Object obj23 = obj4;
        String icon2 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "icon", accumulatedState, objOverlayContentPathBindings3, "icon", new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$13
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj24) {
                return invoke((String) obj24);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str, interfaceC37138cM122336d);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$14
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
        }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$15
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj24) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj24);
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
                boolean z13 = UnwrapForCoercion instanceof String;
                if (z13) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!z13) {
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
        if (icon2 == null) {
            icon2 = progressButtonModel.getIcon();
        }
        String str = icon2;
        Object iconColor = progressButtonModel.getIconColor();
        if (iconColor == null) {
            objOverlayContentPathBindings4 = null;
        } else {
            if (iconColor instanceof WithGeneratedBindings) {
                Object objBind4 = ((WithGeneratedBindings) iconColor).bind(accumulatedState);
                if (!(objBind4 instanceof EnumC39333f)) {
                    objBind4 = null;
                }
                obj5 = (EnumC39333f) objBind4;
                if (obj5 == null) {
                    obj5 = iconColor;
                }
            } else if (iconColor instanceof List) {
                Iterable iterable4 = (Iterable) iconColor;
                ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable4, 10));
                for (Object obj24 : iterable4) {
                    WithGeneratedBindings withGeneratedBindings4 = obj24 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj24 : null;
                    if (withGeneratedBindings4 != null && (withGeneratedBindingsBind4 = withGeneratedBindings4.bind(accumulatedState)) != null) {
                        obj24 = withGeneratedBindingsBind4;
                    }
                    arrayList4.add(obj24);
                }
                obj5 = (EnumC39333f) arrayList4;
            } else {
                obj5 = iconColor;
            }
            objOverlayContentPathBindings4 = obj5;
        }
        String strResolveContentBindingKey4 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "iconColor") : null;
        if (strResolveContentBindingKey4 != null) {
            Object objResolveStateRef4 = StateLookupKt.resolveStateRef(strResolveContentBindingKey4, accumulatedState);
            if (objResolveStateRef4 != null) {
                BindingLoggerKt.logContentBinding("iconColor", strResolveContentBindingKey4, objResolveStateRef4);
                Object objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if ((objUnwrapForCoercion4 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion4)) {
                    obj6 = obj23;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj6), Boolean.TRUE)) {
                        objOverlayContentPathBindings4 = null;
                    }
                } else {
                    obj6 = obj23;
                }
                objOverlayContentPathBindings4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if (objOverlayContentPathBindings4 == null) {
                    objOverlayContentPathBindings4 = null;
                } else if (objOverlayContentPathBindings4 instanceof JsonElement) {
                    JsonElement jsonElement4 = (JsonElement) objOverlayContentPathBindings4;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values()), jsonElement4);
                    } catch (Exception unused7) {
                        objOverlayContentPathBindings4 = null;
                    }
                } else if (!(objOverlayContentPathBindings4 instanceof EnumC39333f)) {
                    if (objOverlayContentPathBindings4 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a4 = AbstractC22671h0.m65688a(EnumC39333f.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings4 = (EnumC39333f) Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings4 = (EnumC39333f) Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings4 = (EnumC39333f) Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings4 = (EnumC39333f) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings4 = (EnumC39333f) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings4 = (EnumC39333f) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                        } else {
                            objOverlayContentPathBindings4 = null;
                        }
                    } else if (objOverlayContentPathBindings4 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings4);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values()), jsonPrimitiveM1841c4);
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
                    objOverlayContentPathBindings4 = iconColor;
                }
            } else {
                obj6 = obj23;
            }
        } else {
            obj6 = obj23;
            if (objOverlayContentPathBindings4 != null) {
                objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(map, "iconColor", accumulatedState, objOverlayContentPathBindings4, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$16
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj25) {
                        return invoke((EnumC39333f) obj25);
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
                        } catch (Exception unused9) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$17
                    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, y81.f] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final EnumC39333f invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values()), json);
                        } catch (Exception unused9) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj25 = obj6;
        EnumC39333f iconColor2 = (EnumC39333f) DotPathBindingsKt.overlayAggregateBinding(map2, "iconColor", accumulatedState, objOverlayContentPathBindings4, "iconColor", new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$18
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj26) {
                return invoke((EnumC39333f) obj26);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(EnumC39333f enumC39333f) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new EnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values()));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, enumC39333f, interfaceC37138cM122336d);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$19
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, y81.f] */
            @Override // p715kotlin.jvm.functions.Function1
            public final EnumC39333f invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values()), json);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$20
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, y81.f] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, y81.f] */
            @Override // p715kotlin.jvm.functions.Function1
            public final EnumC39333f invoke(Object obj26) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj26);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement5 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values()), jsonElement5);
                    } catch (Exception unused9) {
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
                    JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values()), jsonPrimitiveM1841c5);
                    } catch (Exception unused10) {
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
        if (iconColor2 == null) {
            iconColor2 = progressButtonModel.getIconColor();
        }
        EnumC39333f enumC39333f = iconColor2;
        Object text = progressButtonModel.getText();
        if (text == null) {
            objOverlayContentPathBindings5 = null;
        } else {
            if (text instanceof WithGeneratedBindings) {
                Object objBind5 = ((WithGeneratedBindings) text).bind(accumulatedState);
                if (!(objBind5 instanceof TextResource)) {
                    objBind5 = null;
                }
                obj7 = (TextResource) objBind5;
                if (obj7 == null) {
                    obj7 = text;
                }
            } else if (text instanceof List) {
                Iterable iterable5 = (Iterable) text;
                ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(iterable5, 10));
                for (Object obj26 : iterable5) {
                    WithGeneratedBindings withGeneratedBindings5 = obj26 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj26 : null;
                    if (withGeneratedBindings5 != null && (withGeneratedBindingsBind5 = withGeneratedBindings5.bind(accumulatedState)) != null) {
                        obj26 = withGeneratedBindingsBind5;
                    }
                    arrayList5.add(obj26);
                }
                obj7 = (TextResource) arrayList5;
            } else {
                obj7 = text;
            }
            objOverlayContentPathBindings5 = obj7;
        }
        String strResolveContentBindingKey5 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "text") : null;
        if (strResolveContentBindingKey5 != null) {
            Object objResolveStateRef5 = StateLookupKt.resolveStateRef(strResolveContentBindingKey5, accumulatedState);
            if (objResolveStateRef5 != null) {
                BindingLoggerKt.logContentBinding("text", strResolveContentBindingKey5, objResolveStateRef5);
                Object objUnwrapForCoercion5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                if ((objUnwrapForCoercion5 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion5)) {
                    obj8 = obj25;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj8), Boolean.TRUE)) {
                        objOverlayContentPathBindings5 = null;
                    }
                } else {
                    obj8 = obj25;
                }
                objOverlayContentPathBindings5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                if (objOverlayContentPathBindings5 == null) {
                    objOverlayContentPathBindings5 = null;
                } else if (objOverlayContentPathBindings5 instanceof JsonElement) {
                    JsonElement jsonElement5 = (JsonElement) objOverlayContentPathBindings5;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(TextResource.INSTANCE.serializer(), jsonElement5);
                    } catch (Exception unused9) {
                        objOverlayContentPathBindings5 = null;
                    }
                } else if (!(objOverlayContentPathBindings5 instanceof TextResource)) {
                    if (objOverlayContentPathBindings5 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a5 = AbstractC22671h0.m65688a(TextResource.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings5 = (TextResource) Integer.valueOf(((Number) objOverlayContentPathBindings5).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings5 = (TextResource) Long.valueOf(((Number) objOverlayContentPathBindings5).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings5 = (TextResource) Double.valueOf(((Number) objOverlayContentPathBindings5).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings5 = (TextResource) Float.valueOf(((Number) objOverlayContentPathBindings5).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings5 = (TextResource) Short.valueOf(((Number) objOverlayContentPathBindings5).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings5 = (TextResource) Byte.valueOf(((Number) objOverlayContentPathBindings5).byteValue());
                        } else {
                            objOverlayContentPathBindings5 = null;
                        }
                    } else {
                        boolean z13 = objOverlayContentPathBindings5 instanceof String;
                        if (z13) {
                            objOverlayContentPathBindings5 = AbstractC8693b.m21278l((String) objOverlayContentPathBindings5);
                            if (objOverlayContentPathBindings5 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type com.whoop.design.util.TextResource");
                            }
                        } else if (z13) {
                            JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings5);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(TextResource.INSTANCE.serializer(), jsonPrimitiveM1841c5);
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
                    objOverlayContentPathBindings5 = text;
                }
            } else {
                obj8 = obj25;
            }
        } else {
            obj8 = obj25;
            if (objOverlayContentPathBindings5 != null) {
                objOverlayContentPathBindings5 = ContentPathBindingsKt.overlayContentPathBindings(map, "text", accumulatedState, objOverlayContentPathBindings5, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$21
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj27) {
                        return invoke((TextResource) obj27);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(TextResource v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(TextResource.INSTANCE.serializer(), v13);
                        } catch (Exception unused11) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$22
                    /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.util.TextResource, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final TextResource invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(TextResource.INSTANCE.serializer(), json);
                        } catch (Exception unused11) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj27 = obj8;
        TextResource text2 = (TextResource) DotPathBindingsKt.overlayAggregateBinding(map2, "text", accumulatedState, objOverlayContentPathBindings5, "text", new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$23
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj28) {
                return invoke((TextResource) obj28);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(TextResource textResource) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(TextResource.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, textResource, interfaceC37138cM122336d);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$24
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.util.TextResource, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final TextResource invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(TextResource.INSTANCE.serializer(), json);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$25
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [com.whoop.design.util.TextResource] */
            /* JADX WARN: Type inference failed for: r0v6, types: [com.whoop.design.util.TextResource, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.util.TextResource, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final TextResource invoke(Object obj28) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj28);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement6 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(TextResource.INSTANCE.serializer(), jsonElement6);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof TextResource) {
                    return UnwrapForCoercion;
                }
                if (UnwrapForCoercion instanceof Number) {
                    C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(TextResource.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (TextResource) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                        return (TextResource) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                        return (TextResource) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                        return (TextResource) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                        return (TextResource) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (TextResource) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
                boolean z14 = UnwrapForCoercion instanceof String;
                if (z14) {
                    TextResource textResourceM21278l = AbstractC8693b.m21278l((String) UnwrapForCoercion);
                    if (textResourceM21278l != null) {
                        return textResourceM21278l;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.whoop.design.util.TextResource");
                }
                if (!z14) {
                    return null;
                }
                JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(TextResource.INSTANCE.serializer(), jsonPrimitiveM1841c6);
                } catch (Exception unused12) {
                    objM1830a = null;
                }
                if (objM1830a != null) {
                    return objM1830a;
                }
                return null;
            }
        });
        if (text2 == null) {
            text2 = progressButtonModel.getText();
        }
        TextResource textResource = text2;
        Object glowStyle = progressButtonModel.getGlowStyle();
        if (glowStyle == null) {
            objOverlayContentPathBindings6 = null;
        } else {
            if (glowStyle instanceof WithGeneratedBindings) {
                Object objBind6 = ((WithGeneratedBindings) glowStyle).bind(accumulatedState);
                if (!(objBind6 instanceof GlowStyle)) {
                    objBind6 = null;
                }
                obj9 = (GlowStyle) objBind6;
                if (obj9 == null) {
                    obj9 = glowStyle;
                }
            } else if (glowStyle instanceof List) {
                Iterable iterable6 = (Iterable) glowStyle;
                ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(iterable6, 10));
                for (Object obj28 : iterable6) {
                    WithGeneratedBindings withGeneratedBindings6 = obj28 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj28 : null;
                    if (withGeneratedBindings6 != null && (withGeneratedBindingsBind6 = withGeneratedBindings6.bind(accumulatedState)) != null) {
                        obj28 = withGeneratedBindingsBind6;
                    }
                    arrayList6.add(obj28);
                }
                obj9 = (GlowStyle) arrayList6;
            } else {
                obj9 = glowStyle;
            }
            objOverlayContentPathBindings6 = obj9;
        }
        String strResolveContentBindingKey6 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "glowStyle") : null;
        if (strResolveContentBindingKey6 != null) {
            Object objResolveStateRef6 = StateLookupKt.resolveStateRef(strResolveContentBindingKey6, accumulatedState);
            if (objResolveStateRef6 != null) {
                BindingLoggerKt.logContentBinding("glowStyle", strResolveContentBindingKey6, objResolveStateRef6);
                Object objUnwrapForCoercion6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef6);
                if ((objUnwrapForCoercion6 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion6)) {
                    obj10 = obj27;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj10), Boolean.TRUE)) {
                        objOverlayContentPathBindings6 = null;
                    }
                } else {
                    obj10 = obj27;
                }
                objOverlayContentPathBindings6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef6);
                if (objOverlayContentPathBindings6 == null) {
                    objOverlayContentPathBindings6 = null;
                } else if (objOverlayContentPathBindings6 instanceof JsonElement) {
                    JsonElement jsonElement6 = (JsonElement) objOverlayContentPathBindings6;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings6 = StateBindingDeserializerKt.getStateBindingJson().m1830a(GlowStyle.INSTANCE.serializer(), jsonElement6);
                    } catch (Exception unused11) {
                        objOverlayContentPathBindings6 = null;
                    }
                } else if (!(objOverlayContentPathBindings6 instanceof GlowStyle)) {
                    if (objOverlayContentPathBindings6 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a6 = AbstractC22671h0.m65688a(GlowStyle.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings6 = (GlowStyle) Integer.valueOf(((Number) objOverlayContentPathBindings6).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings6 = (GlowStyle) Long.valueOf(((Number) objOverlayContentPathBindings6).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings6 = (GlowStyle) Double.valueOf(((Number) objOverlayContentPathBindings6).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings6 = (GlowStyle) Float.valueOf(((Number) objOverlayContentPathBindings6).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings6 = (GlowStyle) Short.valueOf(((Number) objOverlayContentPathBindings6).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings6 = (GlowStyle) Byte.valueOf(((Number) objOverlayContentPathBindings6).byteValue());
                        } else {
                            objOverlayContentPathBindings6 = null;
                        }
                    } else if (objOverlayContentPathBindings6 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings6);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings6 = StateBindingDeserializerKt.getStateBindingJson().m1830a(GlowStyle.INSTANCE.serializer(), jsonPrimitiveM1841c6);
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
                    objOverlayContentPathBindings6 = glowStyle;
                }
            } else {
                obj10 = obj27;
            }
        } else {
            obj10 = obj27;
            if (objOverlayContentPathBindings6 != null) {
                objOverlayContentPathBindings6 = ContentPathBindingsKt.overlayContentPathBindings(map, "glowStyle", accumulatedState, objOverlayContentPathBindings6, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$26
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj29) {
                        return invoke((GlowStyle) obj29);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(GlowStyle v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(GlowStyle.INSTANCE.serializer(), v13);
                        } catch (Exception unused13) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$27
                    /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.atomic.atom.icon.GlowStyle, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final GlowStyle invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(GlowStyle.INSTANCE.serializer(), json);
                        } catch (Exception unused13) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj29 = obj10;
        GlowStyle glowStyle2 = (GlowStyle) DotPathBindingsKt.overlayAggregateBinding(map2, "glowStyle", accumulatedState, objOverlayContentPathBindings6, "glowStyle", new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$28
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj30) {
                return invoke((GlowStyle) obj30);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(GlowStyle glowStyle3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(GlowStyle.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, glowStyle3, interfaceC37138cM122336d);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$29
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.atomic.atom.icon.GlowStyle, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final GlowStyle invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(GlowStyle.INSTANCE.serializer(), json);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$30
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.atomic.atom.icon.GlowStyle, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.atomic.atom.icon.GlowStyle, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final GlowStyle invoke(Object obj30) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj30);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement7 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(GlowStyle.INSTANCE.serializer(), jsonElement7);
                    } catch (Exception unused13) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof GlowStyle) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c7 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(GlowStyle.INSTANCE.serializer(), jsonPrimitiveM1841c7);
                    } catch (Exception unused14) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(GlowStyle.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (GlowStyle) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (GlowStyle) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (GlowStyle) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (GlowStyle) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (GlowStyle) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (GlowStyle) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        Object fillPercentage = progressButtonModel.getFillPercentage();
        if (fillPercentage == null) {
            objOverlayContentPathBindings7 = null;
        } else {
            if (fillPercentage instanceof WithGeneratedBindings) {
                Object objBind7 = ((WithGeneratedBindings) fillPercentage).bind(accumulatedState);
                if (!(objBind7 instanceof Float)) {
                    objBind7 = null;
                }
                obj11 = (Float) objBind7;
                if (obj11 == null) {
                    obj11 = fillPercentage;
                }
            } else if (fillPercentage instanceof List) {
                Iterable iterable7 = (Iterable) fillPercentage;
                ArrayList arrayList7 = new ArrayList(AbstractC25267u.m74163i0(iterable7, 10));
                for (Object obj30 : iterable7) {
                    WithGeneratedBindings withGeneratedBindings7 = obj30 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj30 : null;
                    if (withGeneratedBindings7 != null && (withGeneratedBindingsBind7 = withGeneratedBindings7.bind(accumulatedState)) != null) {
                        obj30 = withGeneratedBindingsBind7;
                    }
                    arrayList7.add(obj30);
                }
                obj11 = (Float) arrayList7;
            } else {
                obj11 = fillPercentage;
            }
            objOverlayContentPathBindings7 = obj11;
        }
        String strResolveContentBindingKey7 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "fillPercentage") : null;
        if (strResolveContentBindingKey7 != null) {
            Object objResolveStateRef7 = StateLookupKt.resolveStateRef(strResolveContentBindingKey7, accumulatedState);
            if (objResolveStateRef7 != null) {
                BindingLoggerKt.logContentBinding("fillPercentage", strResolveContentBindingKey7, objResolveStateRef7);
                Object objUnwrapForCoercion7 = BindCoercionKt.unwrapForCoercion(objResolveStateRef7);
                if ((objUnwrapForCoercion7 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion7)) {
                    obj12 = obj29;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj12), Boolean.TRUE)) {
                        objOverlayContentPathBindings7 = null;
                    }
                } else {
                    obj12 = obj29;
                }
                objOverlayContentPathBindings7 = BindCoercionKt.unwrapForCoercion(objResolveStateRef7);
                if (objOverlayContentPathBindings7 == null) {
                    objOverlayContentPathBindings7 = null;
                } else if (objOverlayContentPathBindings7 instanceof JsonElement) {
                    JsonElement jsonElement7 = (JsonElement) objOverlayContentPathBindings7;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings7 = StateBindingDeserializerKt.getStateBindingJson().m1830a(FloatSerializer.INSTANCE, jsonElement7);
                    } catch (Exception unused13) {
                        objOverlayContentPathBindings7 = null;
                    }
                } else if (!(objOverlayContentPathBindings7 instanceof Float)) {
                    if (objOverlayContentPathBindings7 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a7 = AbstractC22671h0.m65688a(Float.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings7 = (Float) Integer.valueOf(((Number) objOverlayContentPathBindings7).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings7 = (Float) Long.valueOf(((Number) objOverlayContentPathBindings7).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings7 = (Float) Double.valueOf(((Number) objOverlayContentPathBindings7).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings7 = Float.valueOf(((Number) objOverlayContentPathBindings7).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings7 = (Float) Short.valueOf(((Number) objOverlayContentPathBindings7).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings7 = (Float) Byte.valueOf(((Number) objOverlayContentPathBindings7).byteValue());
                        } else {
                            objOverlayContentPathBindings7 = null;
                        }
                    } else if (objOverlayContentPathBindings7 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c7 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings7);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings7 = StateBindingDeserializerKt.getStateBindingJson().m1830a(FloatSerializer.INSTANCE, jsonPrimitiveM1841c7);
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
                    objOverlayContentPathBindings7 = fillPercentage;
                }
            } else {
                obj12 = obj29;
            }
        } else {
            obj12 = obj29;
            if (objOverlayContentPathBindings7 != null) {
                objOverlayContentPathBindings7 = ContentPathBindingsKt.overlayContentPathBindings(map, "fillPercentage", accumulatedState, objOverlayContentPathBindings7, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$31
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj31) {
                        return invoke((Float) obj31);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(Float v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(FloatSerializer.INSTANCE, v13);
                        } catch (Exception unused15) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$32
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Float, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Float invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(FloatSerializer.INSTANCE, json);
                        } catch (Exception unused15) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj31 = obj12;
        Float f13 = (Float) DotPathBindingsKt.overlayAggregateBinding(map2, "fillPercentage", accumulatedState, objOverlayContentPathBindings7, "fillPercentage", new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$33
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj32) {
                return invoke((Float) obj32);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Float f14) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(FloatSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, f14, interfaceC37138cM122336d);
                } catch (Exception unused15) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$34
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Float, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Float invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(FloatSerializer.INSTANCE, json);
                } catch (Exception unused15) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$35
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Float, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Float, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Float invoke(Object obj32) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj32);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement8 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(FloatSerializer.INSTANCE, jsonElement8);
                    } catch (Exception unused15) {
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
                    JsonPrimitive jsonPrimitiveM1841c8 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(FloatSerializer.INSTANCE, jsonPrimitiveM1841c8);
                    } catch (Exception unused16) {
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
        Object objIsEnabled = progressButtonModel.isEnabled();
        if (objIsEnabled == null) {
            objOverlayContentPathBindings8 = null;
        } else {
            if (objIsEnabled instanceof WithGeneratedBindings) {
                Object objBind8 = ((WithGeneratedBindings) objIsEnabled).bind(accumulatedState);
                if (!(objBind8 instanceof Boolean)) {
                    objBind8 = null;
                }
                obj13 = (Boolean) objBind8;
                if (obj13 == null) {
                    obj13 = objIsEnabled;
                }
            } else if (objIsEnabled instanceof List) {
                Iterable iterable8 = (Iterable) objIsEnabled;
                ArrayList arrayList8 = new ArrayList(AbstractC25267u.m74163i0(iterable8, 10));
                for (Object obj32 : iterable8) {
                    WithGeneratedBindings withGeneratedBindings8 = obj32 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj32 : null;
                    if (withGeneratedBindings8 != null && (withGeneratedBindingsBind8 = withGeneratedBindings8.bind(accumulatedState)) != null) {
                        obj32 = withGeneratedBindingsBind8;
                    }
                    arrayList8.add(obj32);
                }
                obj13 = (Boolean) arrayList8;
            } else {
                obj13 = objIsEnabled;
            }
            objOverlayContentPathBindings8 = obj13;
        }
        String strResolveContentBindingKey8 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "isEnabled") : null;
        if (strResolveContentBindingKey8 != null) {
            Object objResolveStateRef8 = StateLookupKt.resolveStateRef(strResolveContentBindingKey8, accumulatedState);
            if (objResolveStateRef8 != null) {
                BindingLoggerKt.logContentBinding("isEnabled", strResolveContentBindingKey8, objResolveStateRef8);
                Object objUnwrapForCoercion8 = BindCoercionKt.unwrapForCoercion(objResolveStateRef8);
                if ((objUnwrapForCoercion8 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion8)) {
                    obj14 = obj31;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj14), Boolean.TRUE)) {
                        objOverlayContentPathBindings8 = null;
                    }
                } else {
                    obj14 = obj31;
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
                    objOverlayContentPathBindings8 = objIsEnabled;
                }
            } else {
                obj14 = obj31;
            }
        } else {
            obj14 = obj31;
            if (objOverlayContentPathBindings8 != null) {
                objOverlayContentPathBindings8 = ContentPathBindingsKt.overlayContentPathBindings(map, "isEnabled", accumulatedState, objOverlayContentPathBindings8, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$36
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj33) {
                        return invoke((Boolean) obj33);
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
                }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$37
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
        }
        Object obj33 = obj14;
        Boolean bool = (Boolean) DotPathBindingsKt.overlayAggregateBinding(map2, "isEnabled", accumulatedState, objOverlayContentPathBindings8, "isEnabled", new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$38
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj34) {
                return invoke((Boolean) obj34);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Boolean bool2) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(BooleanSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, bool2, interfaceC37138cM122336d);
                } catch (Exception unused17) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$39
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
        }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$40
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Boolean, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Boolean, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj34) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj34);
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
        Object interaction = progressButtonModel.getInteraction();
        if (interaction == null) {
            objOverlayContentPathBindings9 = null;
        } else {
            if (interaction instanceof WithGeneratedBindings) {
                Object objBind9 = ((WithGeneratedBindings) interaction).bind(accumulatedState);
                if (!(objBind9 instanceof GenericInteraction)) {
                    objBind9 = null;
                }
                obj15 = (GenericInteraction) objBind9;
                if (obj15 == null) {
                    obj15 = interaction;
                }
            } else if (interaction instanceof List) {
                Iterable iterable9 = (Iterable) interaction;
                ArrayList arrayList9 = new ArrayList(AbstractC25267u.m74163i0(iterable9, 10));
                for (Object obj34 : iterable9) {
                    WithGeneratedBindings withGeneratedBindings9 = obj34 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj34 : null;
                    if (withGeneratedBindings9 != null && (withGeneratedBindingsBind9 = withGeneratedBindings9.bind(accumulatedState)) != null) {
                        obj34 = withGeneratedBindingsBind9;
                    }
                    arrayList9.add(obj34);
                }
                obj15 = (GenericInteraction) arrayList9;
            } else {
                obj15 = interaction;
            }
            objOverlayContentPathBindings9 = obj15;
        }
        String strResolveContentBindingKey9 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "interaction") : null;
        if (strResolveContentBindingKey9 != null) {
            Object objResolveStateRef9 = StateLookupKt.resolveStateRef(strResolveContentBindingKey9, accumulatedState);
            if (objResolveStateRef9 != null) {
                BindingLoggerKt.logContentBinding("interaction", strResolveContentBindingKey9, objResolveStateRef9);
                Object objUnwrapForCoercion9 = BindCoercionKt.unwrapForCoercion(objResolveStateRef9);
                if ((objUnwrapForCoercion9 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion9)) {
                    obj16 = obj33;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj16), Boolean.TRUE)) {
                        objOverlayContentPathBindings9 = null;
                    }
                } else {
                    obj16 = obj33;
                }
                objOverlayContentPathBindings9 = BindCoercionKt.unwrapForCoercion(objResolveStateRef9);
                if (objOverlayContentPathBindings9 == null) {
                    objOverlayContentPathBindings9 = null;
                } else if (objOverlayContentPathBindings9 instanceof JsonElement) {
                    JsonElement jsonElement9 = (JsonElement) objOverlayContentPathBindings9;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings9 = StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), jsonElement9);
                    } catch (Exception unused17) {
                        objOverlayContentPathBindings9 = null;
                    }
                } else if (!(objOverlayContentPathBindings9 instanceof GenericInteraction)) {
                    if (objOverlayContentPathBindings9 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a9 = AbstractC22671h0.m65688a(GenericInteraction.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings9 = (GenericInteraction) Integer.valueOf(((Number) objOverlayContentPathBindings9).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings9 = (GenericInteraction) Long.valueOf(((Number) objOverlayContentPathBindings9).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings9 = (GenericInteraction) Double.valueOf(((Number) objOverlayContentPathBindings9).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings9 = (GenericInteraction) Float.valueOf(((Number) objOverlayContentPathBindings9).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings9 = (GenericInteraction) Short.valueOf(((Number) objOverlayContentPathBindings9).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings9 = (GenericInteraction) Byte.valueOf(((Number) objOverlayContentPathBindings9).byteValue());
                        } else {
                            objOverlayContentPathBindings9 = null;
                        }
                    } else if (objOverlayContentPathBindings9 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c9 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings9);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings9 = StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), jsonPrimitiveM1841c9);
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
                    objOverlayContentPathBindings9 = interaction;
                }
            } else {
                obj16 = obj33;
            }
        } else {
            obj16 = obj33;
            if (objOverlayContentPathBindings9 != null) {
                objOverlayContentPathBindings9 = ContentPathBindingsKt.overlayContentPathBindings(map, "interaction", accumulatedState, objOverlayContentPathBindings9, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$41
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj35) {
                        return invoke((GenericInteraction) obj35);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(GenericInteraction v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(GenericInteraction.INSTANCE.serializer(), v13);
                        } catch (Exception unused19) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$42
                    /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.navigation.models.GenericInteraction, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final GenericInteraction invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), json);
                        } catch (Exception unused19) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj35 = obj16;
        GenericInteraction genericInteraction = (GenericInteraction) DotPathBindingsKt.overlayAggregateBinding(map2, "interaction", accumulatedState, objOverlayContentPathBindings9, "interaction", new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$43
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj36) {
                return invoke((GenericInteraction) obj36);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(GenericInteraction genericInteraction2) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(GenericInteraction.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, genericInteraction2, interfaceC37138cM122336d);
                } catch (Exception unused19) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$44
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.navigation.models.GenericInteraction, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final GenericInteraction invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), json);
                } catch (Exception unused19) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$45
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.navigation.models.GenericInteraction, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.navigation.models.GenericInteraction, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final GenericInteraction invoke(Object obj36) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj36);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement10 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), jsonElement10);
                    } catch (Exception unused19) {
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
                    JsonPrimitive jsonPrimitiveM1841c10 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), jsonPrimitiveM1841c10);
                    } catch (Exception unused20) {
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
        Map<String, String> bindings = progressButtonModel.getBindings();
        if (bindings == null) {
            objOverlayContentPathBindings10 = null;
        } else {
            if (bindings instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind12 = ((WithGeneratedBindings) bindings).bind(accumulatedState);
                if (!(withGeneratedBindingsBind12 instanceof Map)) {
                    withGeneratedBindingsBind12 = null;
                }
                map3 = (Map) withGeneratedBindingsBind12;
                if (map3 == null) {
                    map3 = bindings;
                }
            } else if (bindings instanceof List) {
                Iterable iterable10 = (Iterable) bindings;
                List arrayList10 = new ArrayList(AbstractC25267u.m74163i0(iterable10, 10));
                for (Object obj36 : iterable10) {
                    WithGeneratedBindings withGeneratedBindings10 = obj36 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj36 : null;
                    if (withGeneratedBindings10 != null && (withGeneratedBindingsBind10 = withGeneratedBindings10.bind(accumulatedState)) != null) {
                        obj36 = withGeneratedBindingsBind10;
                    }
                    arrayList10.add(obj36);
                }
                map3 = (Map) arrayList10;
            } else {
                map3 = bindings;
            }
            objOverlayContentPathBindings10 = map3;
        }
        String strResolveContentBindingKey10 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "bindings") : null;
        if (strResolveContentBindingKey10 != null) {
            Object objResolveStateRef10 = StateLookupKt.resolveStateRef(strResolveContentBindingKey10, accumulatedState);
            if (objResolveStateRef10 != null) {
                BindingLoggerKt.logContentBinding("bindings", strResolveContentBindingKey10, objResolveStateRef10);
                Object objUnwrapForCoercion10 = BindCoercionKt.unwrapForCoercion(objResolveStateRef10);
                if ((objUnwrapForCoercion10 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion10)) {
                    obj17 = obj35;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj17), Boolean.TRUE)) {
                        objOverlayContentPathBindings10 = null;
                    }
                } else {
                    obj17 = obj35;
                }
                objOverlayContentPathBindings10 = BindCoercionKt.unwrapForCoercion(objResolveStateRef10);
                if (objOverlayContentPathBindings10 == null) {
                    objOverlayContentPathBindings10 = null;
                } else if (objOverlayContentPathBindings10 instanceof JsonElement) {
                    JsonElement jsonElement10 = (JsonElement) objOverlayContentPathBindings10;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer = StringSerializer.INSTANCE;
                        objOverlayContentPathBindings10 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer, stringSerializer), jsonElement10);
                    } catch (Exception unused19) {
                        objOverlayContentPathBindings10 = null;
                    }
                } else if (!(objOverlayContentPathBindings10 instanceof Map)) {
                    if (objOverlayContentPathBindings10 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a10 = AbstractC22671h0.m65688a(Map.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings10 = (Map) Integer.valueOf(((Number) objOverlayContentPathBindings10).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings10 = (Map) Long.valueOf(((Number) objOverlayContentPathBindings10).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings10 = (Map) Double.valueOf(((Number) objOverlayContentPathBindings10).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings10 = (Map) Float.valueOf(((Number) objOverlayContentPathBindings10).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings10 = (Map) Short.valueOf(((Number) objOverlayContentPathBindings10).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings10 = (Map) Byte.valueOf(((Number) objOverlayContentPathBindings10).byteValue());
                        } else {
                            objOverlayContentPathBindings10 = null;
                        }
                    } else if (objOverlayContentPathBindings10 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c10 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings10);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                            objOverlayContentPathBindings10 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), jsonPrimitiveM1841c10);
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
                    objOverlayContentPathBindings10 = bindings;
                }
            } else {
                obj17 = obj35;
            }
        } else {
            obj17 = obj35;
            if (objOverlayContentPathBindings10 != null) {
                objOverlayContentPathBindings10 = ContentPathBindingsKt.overlayContentPathBindings(map, "bindings", accumulatedState, objOverlayContentPathBindings10, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$46
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj37) {
                        return invoke((Map<String, ? extends String>) obj37);
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
                        } catch (Exception unused21) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$47
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Map<String, ? extends String> invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), json);
                        } catch (Exception unused21) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj37 = obj17;
        Map map5 = (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "bindings", accumulatedState, objOverlayContentPathBindings10, "bindings", new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$48
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj38) {
                return invoke((Map<String, ? extends String>) obj38);
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
                } catch (Exception unused21) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$49
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends String> invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), json);
                } catch (Exception unused21) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$50
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends java.lang.String>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends String> invoke(Object obj38) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj38);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement11 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), jsonElement11);
                    } catch (Exception unused21) {
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
                    JsonPrimitive jsonPrimitiveM1841c11 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer4 = StringSerializer.INSTANCE;
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer4, stringSerializer4), jsonPrimitiveM1841c11);
                    } catch (Exception unused22) {
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
        Map<String, AggregateBinding> aggregateBindings = progressButtonModel.getAggregateBindings();
        if (aggregateBindings == null) {
            obj18 = null;
        } else {
            if (aggregateBindings instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind13 = ((WithGeneratedBindings) aggregateBindings).bind(accumulatedState);
                if (!(withGeneratedBindingsBind13 instanceof Map)) {
                    withGeneratedBindingsBind13 = null;
                }
                map4 = (Map) withGeneratedBindingsBind13;
                if (map4 == null) {
                    map4 = aggregateBindings;
                }
            } else if (aggregateBindings instanceof List) {
                Iterable iterable11 = (Iterable) aggregateBindings;
                List arrayList11 = new ArrayList(AbstractC25267u.m74163i0(iterable11, 10));
                for (Object obj38 : iterable11) {
                    WithGeneratedBindings withGeneratedBindings11 = obj38 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj38 : null;
                    if (withGeneratedBindings11 != null && (withGeneratedBindingsBind11 = withGeneratedBindings11.bind(accumulatedState)) != null) {
                        obj38 = withGeneratedBindingsBind11;
                    }
                    arrayList11.add(obj38);
                }
                map4 = (Map) arrayList11;
            } else {
                map4 = aggregateBindings;
            }
            obj18 = map4;
        }
        String strResolveContentBindingKey11 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "aggregateBindings") : null;
        if (strResolveContentBindingKey11 != null) {
            Object objResolveStateRef11 = StateLookupKt.resolveStateRef(strResolveContentBindingKey11, accumulatedState);
            if (objResolveStateRef11 != null) {
                BindingLoggerKt.logContentBinding("aggregateBindings", strResolveContentBindingKey11, objResolveStateRef11);
                Object objUnwrapForCoercion11 = BindCoercionKt.unwrapForCoercion(objResolveStateRef11);
                if ((objUnwrapForCoercion11 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion11) && AbstractC22676k.m65745e(accumulatedState.get(obj37), Boolean.TRUE)) {
                    obj18 = null;
                } else {
                    Object objUnwrapForCoercion12 = BindCoercionKt.unwrapForCoercion(objResolveStateRef11);
                    if (objUnwrapForCoercion12 == null) {
                        objOverlayContentPathBindings11 = null;
                    } else if (objUnwrapForCoercion12 instanceof JsonElement) {
                        JsonElement jsonElement11 = (JsonElement) objUnwrapForCoercion12;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings11 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement11);
                        } catch (Exception unused21) {
                            objOverlayContentPathBindings11 = null;
                        }
                    } else if (objUnwrapForCoercion12 instanceof Map) {
                        objOverlayContentPathBindings11 = objUnwrapForCoercion12;
                    } else {
                        if (objUnwrapForCoercion12 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a11 = AbstractC22671h0.m65688a(Map.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings11 = (Map) Integer.valueOf(((Number) objUnwrapForCoercion12).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings11 = (Map) Long.valueOf(((Number) objUnwrapForCoercion12).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings11 = (Map) Double.valueOf(((Number) objUnwrapForCoercion12).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings11 = (Map) Float.valueOf(((Number) objUnwrapForCoercion12).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings11 = (Map) Short.valueOf(((Number) objUnwrapForCoercion12).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings11 = (Map) Byte.valueOf(((Number) objUnwrapForCoercion12).byteValue());
                            }
                        } else if (objUnwrapForCoercion12 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c11 = AbstractC0770m.m1841c((String) objUnwrapForCoercion12);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objUnwrapForCoercion12 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c11);
                            } catch (Exception unused22) {
                                objUnwrapForCoercion12 = null;
                            }
                            if (objUnwrapForCoercion12 != null) {
                                objOverlayContentPathBindings11 = objUnwrapForCoercion12;
                            }
                        }
                        objOverlayContentPathBindings11 = null;
                    }
                    obj18 = objOverlayContentPathBindings11 == null ? aggregateBindings : objOverlayContentPathBindings11;
                }
            }
        } else if (obj18 != null) {
            objOverlayContentPathBindings11 = ContentPathBindingsKt.overlayContentPathBindings(map, "aggregateBindings", accumulatedState, obj18, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$51
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj39) {
                    return invoke((Map<String, ? extends AggregateBinding>) obj39);
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
                    } catch (Exception unused23) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$52
                /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Map<String, ? extends AggregateBinding> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), json);
                    } catch (Exception unused23) {
                        return null;
                    }
                }
            });
        }
        return (ProgressButtonModel) ContentBindingResolverKt.copyBindingsFrom(new ProgressButtonModel(buttonType3, buttonStyle, str, enumC39333f, textResource, glowStyle2, f13, bool, genericInteraction, map5, (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "aggregateBindings", accumulatedState, obj18, "aggregateBindings", new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$53
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj39) {
                return invoke((Map<String, ? extends AggregateBinding>) obj39);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Map<String, ? extends AggregateBinding> map6) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, map6, interfaceC37138cM122336d);
                } catch (Exception unused23) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$54
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends AggregateBinding> invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), json);
                } catch (Exception unused23) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.ProgressButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$55
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends AggregateBinding> invoke(Object obj39) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj39);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement12 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement12);
                    } catch (Exception unused23) {
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
                    JsonPrimitive jsonPrimitiveM1841c12 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c12);
                    } catch (Exception unused24) {
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
        })), progressButtonModel);
    }

    public static /* synthetic */ ProgressButtonModel generatedBind$default(ProgressButtonModel progressButtonModel, Map map, Map map2, Map map3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map2 = null;
        }
        return generatedBind(progressButtonModel, map, map2, map3);
    }
}
