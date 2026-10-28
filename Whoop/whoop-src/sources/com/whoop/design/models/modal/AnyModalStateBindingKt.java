package com.whoop.design.models.modal;

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
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003¨\u0006\t"}, m65681d2 = {"generatedBind", "Lcom/whoop/design/models/modal/AnyModal;", "contentBinding", "", "", "aggregateBindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "accumulatedState", "", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AnyModalStateBindingKt {
    /* JADX WARN: Code duplicated, block: B:102:0x01da  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:108:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:110:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:114:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:116:0x0200  */
    /* JADX WARN: Code duplicated, block: B:119:0x0218  */
    /* JADX WARN: Code duplicated, block: B:121:0x0220  */
    /* JADX WARN: Code duplicated, block: B:122:0x0224  */
    /* JADX WARN: Code duplicated, block: B:130:0x0237  */
    /* JADX WARN: Code duplicated, block: B:134:0x023d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0242  */
    /* JADX WARN: Code duplicated, block: B:137:0x0245  */
    /* JADX WARN: Code duplicated, block: B:139:0x024b  */
    /* JADX WARN: Code duplicated, block: B:146:0x026d  */
    /* JADX WARN: Code duplicated, block: B:148:0x0273  */
    /* JADX WARN: Code duplicated, block: B:149:0x0276  */
    /* JADX WARN: Code duplicated, block: B:151:0x027a  */
    /* JADX WARN: Code duplicated, block: B:154:0x0295  */
    /* JADX WARN: Code duplicated, block: B:157:0x029b  */
    /* JADX WARN: Code duplicated, block: B:159:0x029f  */
    /* JADX WARN: Code duplicated, block: B:161:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:162:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:164:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:165:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:167:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:168:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:170:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:171:0x0305  */
    /* JADX WARN: Code duplicated, block: B:173:0x030f  */
    /* JADX WARN: Code duplicated, block: B:174:0x031c  */
    /* JADX WARN: Code duplicated, block: B:176:0x0326  */
    /* JADX WARN: Code duplicated, block: B:177:0x0333  */
    /* JADX WARN: Code duplicated, block: B:179:0x0337  */
    /* JADX WARN: Code duplicated, block: B:185:0x035a  */
    /* JADX WARN: Code duplicated, block: B:186:0x035c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:188:0x035f  */
    /* JADX WARN: Code duplicated, block: B:191:0x0383  */
    /* JADX WARN: Code duplicated, block: B:192:0x0385  */
    /* JADX WARN: Code duplicated, block: B:194:0x0389  */
    /* JADX WARN: Code duplicated, block: B:196:0x0394  */
    /* JADX WARN: Code duplicated, block: B:200:0x039a  */
    /* JADX WARN: Code duplicated, block: B:202:0x039e  */
    /* JADX WARN: Code duplicated, block: B:205:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:207:0x03be  */
    /* JADX WARN: Code duplicated, block: B:208:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:216:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:220:0x03db  */
    /* JADX WARN: Code duplicated, block: B:221:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:223:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:225:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:232:0x040b  */
    /* JADX WARN: Code duplicated, block: B:234:0x0411  */
    /* JADX WARN: Code duplicated, block: B:235:0x0414  */
    /* JADX WARN: Code duplicated, block: B:237:0x0418  */
    /* JADX WARN: Code duplicated, block: B:240:0x0433  */
    /* JADX WARN: Code duplicated, block: B:242:0x0437 A[PHI: r0
      0x0437: PHI (r0v28 java.lang.Object) = (r0v6 java.lang.Object), (r0v10 java.lang.Object) binds: [B:241:0x0435, B:269:0x04fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:243:0x043a  */
    /* JADX WARN: Code duplicated, block: B:245:0x043e  */
    /* JADX WARN: Code duplicated, block: B:247:0x0450  */
    /* JADX WARN: Code duplicated, block: B:248:0x045f  */
    /* JADX WARN: Code duplicated, block: B:250:0x0469  */
    /* JADX WARN: Code duplicated, block: B:251:0x0478  */
    /* JADX WARN: Code duplicated, block: B:253:0x0482  */
    /* JADX WARN: Code duplicated, block: B:254:0x0491  */
    /* JADX WARN: Code duplicated, block: B:256:0x049b  */
    /* JADX WARN: Code duplicated, block: B:257:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:259:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:260:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:262:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:263:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:265:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:272:0x0502  */
    /* JADX WARN: Code duplicated, block: B:273:0x0504 A[PHI: r10
      0x0504: PHI (r10v2 java.lang.Object) = (r10v1 java.lang.Object), (r10v17 java.lang.Object) binds: [B:276:0x0509, B:271:0x0500] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:274:0x0506 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:276:0x0509  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final AnyModal generatedBind(AnyModal anyModal, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, ? extends Object> accumulatedState) {
        Object objOverlayContentPathBindings;
        WithGeneratedBindings withGeneratedBindingsBind;
        Modal modal;
        Object analyticEvents;
        ArrayList arrayList;
        Object obj;
        WithGeneratedBindings withGeneratedBindings;
        WithGeneratedBindings withGeneratedBindingsBind2;
        Object objOverlayContentPathBindings2;
        Object objBind;
        String strResolveContentBindingKey;
        Object modalLifecycleInteractions;
        ArrayList arrayList2;
        Object obj2;
        WithGeneratedBindings withGeneratedBindings2;
        WithGeneratedBindings withGeneratedBindingsBind3;
        Object obj3;
        Object objBind2;
        String strResolveContentBindingKey2;
        Object objOverlayContentPathBindings3;
        Object objResolveStateRef;
        Object objUnwrapForCoercion;
        Object objUnwrapForCoercion2;
        C22673i0 c22673i0;
        InterfaceC21461d orCreateKotlinClass;
        Object objResolveStateRef2;
        Object objUnwrapForCoercion3;
        C22673i0 c22673i1;
        InterfaceC21461d orCreateKotlinClass2;
        AbstractC22676k.m65750j(anyModal, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if ((map == null || map.isEmpty()) && ((map2 == null || map2.isEmpty()) && accumulatedState.isEmpty())) {
            return anyModal;
        }
        Modal modal2 = anyModal.getModal();
        if (modal2 == null) {
            objOverlayContentPathBindings = null;
        } else if (modal2 instanceof WithGeneratedBindings) {
            WithGeneratedBindings withGeneratedBindingsBind4 = ((WithGeneratedBindings) modal2).bind(accumulatedState);
            if (!(withGeneratedBindingsBind4 instanceof Modal)) {
                withGeneratedBindingsBind4 = null;
            }
            objOverlayContentPathBindings = (Modal) withGeneratedBindingsBind4;
            if (objOverlayContentPathBindings == null) {
                objOverlayContentPathBindings = modal2;
            }
        } else if (modal2 instanceof List) {
            Iterable iterable = (Iterable) modal2;
            List arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            for (Object obj4 : iterable) {
                WithGeneratedBindings withGeneratedBindings3 = obj4 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj4 : null;
                if (withGeneratedBindings3 != null && (withGeneratedBindingsBind = withGeneratedBindings3.bind(accumulatedState)) != null) {
                    obj4 = withGeneratedBindingsBind;
                }
                arrayList3.add(obj4);
            }
            objOverlayContentPathBindings = (Modal) arrayList3;
        } else {
            objOverlayContentPathBindings = modal2;
        }
        String strResolveContentBindingKey3 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "modal") : null;
        Class cls = Byte.TYPE;
        Class cls2 = Short.TYPE;
        Class cls3 = Float.TYPE;
        Class cls4 = Double.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        if (strResolveContentBindingKey3 != null) {
            Object objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
            if (objResolveStateRef3 != null) {
                BindingLoggerKt.logContentBinding("modal", strResolveContentBindingKey3, objResolveStateRef3);
                Object objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if ((objUnwrapForCoercion4 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion4) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                    objOverlayContentPathBindings = null;
                } else {
                    objOverlayContentPathBindings = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                    if (objOverlayContentPathBindings == null) {
                        objOverlayContentPathBindings = null;
                    } else if (objOverlayContentPathBindings instanceof JsonElement) {
                        JsonElement jsonElement = (JsonElement) objOverlayContentPathBindings;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings = StateBindingDeserializerKt.getStateBindingJson().m1830a(Modal.INSTANCE.serializer(), jsonElement);
                        } catch (Exception unused) {
                            objOverlayContentPathBindings = null;
                        }
                    } else if (!(objOverlayContentPathBindings instanceof Modal)) {
                        if (objOverlayContentPathBindings instanceof Number) {
                            C22673i0 c22673i2 = AbstractC22671h0.f89337a;
                            InterfaceC21461d orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(Modal.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings = (Modal) Integer.valueOf(((Number) objOverlayContentPathBindings).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings = (Modal) Long.valueOf(((Number) objOverlayContentPathBindings).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings = (Modal) Double.valueOf(((Number) objOverlayContentPathBindings).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings = (Modal) Float.valueOf(((Number) objOverlayContentPathBindings).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings = (Modal) Short.valueOf(((Number) objOverlayContentPathBindings).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings = (Modal) Byte.valueOf(((Number) objOverlayContentPathBindings).byteValue());
                            } else {
                                objOverlayContentPathBindings = null;
                            }
                        } else if (objOverlayContentPathBindings instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c = AbstractC0770m.m1841c((String) objOverlayContentPathBindings);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings = StateBindingDeserializerKt.getStateBindingJson().m1830a(Modal.INSTANCE.serializer(), jsonPrimitiveM1841c);
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
                        objOverlayContentPathBindings = modal2;
                    }
                }
            }
            modal = (Modal) DotPathBindingsKt.overlayAggregateBinding(map2, "modal", accumulatedState, objOverlayContentPathBindings, "modal", new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$3
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                    return invoke((Modal) obj5);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Modal modal3) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(Modal.INSTANCE.serializer());
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, modal3, interfaceC37138cM122336d);
                    } catch (Exception unused3) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$4
                /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.modal.Modal, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Modal invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(Modal.INSTANCE.serializer(), json);
                    } catch (Exception unused3) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$5
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [com.whoop.design.models.modal.Modal] */
                /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.modal.Modal, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.modal.Modal, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Modal invoke(Object obj5) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj5);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement2 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(Modal.INSTANCE.serializer(), jsonElement2);
                        } catch (Exception unused3) {
                            return null;
                        }
                    }
                    if (UnwrapForCoercion instanceof Modal) {
                        return UnwrapForCoercion;
                    }
                    if (!(UnwrapForCoercion instanceof Number)) {
                        if (!(UnwrapForCoercion instanceof String)) {
                            return null;
                        }
                        JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(Modal.INSTANCE.serializer(), jsonPrimitiveM1841c2);
                        } catch (Exception unused4) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i3 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(Modal.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (Modal) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Long.TYPE))) {
                        return (Modal) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Double.TYPE))) {
                        return (Modal) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Float.TYPE))) {
                        return (Modal) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Short.TYPE))) {
                        return (Modal) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (Modal) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            });
            if (modal == null) {
                modal = anyModal.getModal();
            }
            Modal modal3 = modal;
            analyticEvents = anyModal.getAnalyticEvents();
            if (analyticEvents == null) {
                objOverlayContentPathBindings2 = null;
            } else {
                if (analyticEvents instanceof WithGeneratedBindings) {
                    objBind = ((WithGeneratedBindings) analyticEvents).bind(accumulatedState);
                    if (!(objBind instanceof ModalAnalyticEventModel)) {
                        objBind = null;
                    }
                    obj = (ModalAnalyticEventModel) objBind;
                    if (obj == null) {
                        obj = analyticEvents;
                    }
                } else if (analyticEvents instanceof List) {
                    Iterable iterable2 = (Iterable) analyticEvents;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
                    for (Object obj5 : iterable2) {
                        if (obj5 instanceof WithGeneratedBindings) {
                            withGeneratedBindings = (WithGeneratedBindings) obj5;
                        } else {
                            withGeneratedBindings = null;
                        }
                        if (withGeneratedBindings == null && (withGeneratedBindingsBind2 = withGeneratedBindings.bind(accumulatedState)) != null) {
                            obj5 = withGeneratedBindingsBind2;
                        }
                        arrayList.add(obj5);
                    }
                    obj = (ModalAnalyticEventModel) arrayList;
                } else {
                    obj = analyticEvents;
                }
                objOverlayContentPathBindings2 = obj;
            }
            if (r1 != 0) {
                strResolveContentBindingKey = BindingLoggerKt.resolveContentBindingKey(map, "analyticEvents");
            } else {
                strResolveContentBindingKey = null;
            }
            if (strResolveContentBindingKey != null) {
                objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
                if (objResolveStateRef2 != null) {
                    BindingLoggerKt.logContentBinding("analyticEvents", strResolveContentBindingKey, objResolveStateRef2);
                    objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (!(objUnwrapForCoercion3 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion3) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                        objOverlayContentPathBindings2 = null;
                    } else {
                        objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                        if (objOverlayContentPathBindings2 == null) {
                            objOverlayContentPathBindings2 = null;
                        } else if (objOverlayContentPathBindings2 instanceof JsonElement) {
                            JsonElement jsonElement2 = (JsonElement) objOverlayContentPathBindings2;
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalAnalyticEventModel.INSTANCE.serializer(), jsonElement2);
                            } catch (Exception unused3) {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (!(objOverlayContentPathBindings2 instanceof ModalAnalyticEventModel)) {
                            if (objOverlayContentPathBindings2 instanceof Number) {
                                c22673i1 = AbstractC22671h0.f89337a;
                                orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(ModalAnalyticEventModel.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings2 = (ModalAnalyticEventModel) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings2 = (ModalAnalyticEventModel) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings2 = (ModalAnalyticEventModel) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings2 = (ModalAnalyticEventModel) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls2))) {
                                    objOverlayContentPathBindings2 = (ModalAnalyticEventModel) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                    objOverlayContentPathBindings2 = (ModalAnalyticEventModel) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                                } else {
                                    objOverlayContentPathBindings2 = null;
                                }
                            } else if (objOverlayContentPathBindings2 instanceof String) {
                                JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalAnalyticEventModel.INSTANCE.serializer(), jsonPrimitiveM1841c2);
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
                            objOverlayContentPathBindings2 = analyticEvents;
                        }
                    }
                }
            } else if (objOverlayContentPathBindings2 != null) {
                objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(r1, "analyticEvents", accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$6
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj6) {
                        return invoke((ModalAnalyticEventModel) obj6);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(ModalAnalyticEventModel v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(ModalAnalyticEventModel.INSTANCE.serializer(), v13);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$7
                    /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.modal.ModalAnalyticEventModel, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final ModalAnalyticEventModel invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalAnalyticEventModel.INSTANCE.serializer(), json);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                });
            }
            ModalAnalyticEventModel modalAnalyticEventModel = (ModalAnalyticEventModel) DotPathBindingsKt.overlayAggregateBinding(map2, "analyticEvents", accumulatedState, objOverlayContentPathBindings2, "analyticEvents", new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$8
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj6) {
                    return invoke((ModalAnalyticEventModel) obj6);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(ModalAnalyticEventModel modalAnalyticEventModel2) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(ModalAnalyticEventModel.INSTANCE.serializer());
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, modalAnalyticEventModel2, interfaceC37138cM122336d);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$9
                /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.modal.ModalAnalyticEventModel, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final ModalAnalyticEventModel invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalAnalyticEventModel.INSTANCE.serializer(), json);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$10
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.modal.ModalAnalyticEventModel, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.modal.ModalAnalyticEventModel, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final ModalAnalyticEventModel invoke(Object obj6) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj6);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement3 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalAnalyticEventModel.INSTANCE.serializer(), jsonElement3);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                    if (UnwrapForCoercion instanceof ModalAnalyticEventModel) {
                        return UnwrapForCoercion;
                    }
                    if (!(UnwrapForCoercion instanceof Number)) {
                        if (!(UnwrapForCoercion instanceof String)) {
                            return null;
                        }
                        JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalAnalyticEventModel.INSTANCE.serializer(), jsonPrimitiveM1841c3);
                        } catch (Exception unused6) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i3 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(ModalAnalyticEventModel.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (ModalAnalyticEventModel) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Long.TYPE))) {
                        return (ModalAnalyticEventModel) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Double.TYPE))) {
                        return (ModalAnalyticEventModel) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Float.TYPE))) {
                        return (ModalAnalyticEventModel) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Short.TYPE))) {
                        return (ModalAnalyticEventModel) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (ModalAnalyticEventModel) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            });
            modalLifecycleInteractions = anyModal.getModalLifecycleInteractions();
            if (modalLifecycleInteractions == null) {
                obj3 = null;
            } else {
                if (modalLifecycleInteractions instanceof WithGeneratedBindings) {
                    objBind2 = ((WithGeneratedBindings) modalLifecycleInteractions).bind(accumulatedState);
                    if (!(objBind2 instanceof ModalLifecycleInteractions)) {
                        objBind2 = null;
                    }
                    obj2 = (ModalLifecycleInteractions) objBind2;
                    if (obj2 == null) {
                        obj2 = modalLifecycleInteractions;
                    }
                } else if (modalLifecycleInteractions instanceof List) {
                    Iterable iterable3 = (Iterable) modalLifecycleInteractions;
                    arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable3, 10));
                    for (Object obj6 : iterable3) {
                        if (obj6 instanceof WithGeneratedBindings) {
                            withGeneratedBindings2 = (WithGeneratedBindings) obj6;
                        } else {
                            withGeneratedBindings2 = null;
                        }
                        if (withGeneratedBindings2 == null && (withGeneratedBindingsBind3 = withGeneratedBindings2.bind(accumulatedState)) != null) {
                            obj6 = withGeneratedBindingsBind3;
                        }
                        arrayList2.add(obj6);
                    }
                    obj2 = (ModalLifecycleInteractions) arrayList2;
                } else {
                    obj2 = modalLifecycleInteractions;
                }
                obj3 = obj2;
            }
            if (r1 != 0) {
                strResolveContentBindingKey2 = BindingLoggerKt.resolveContentBindingKey(r1, "modalLifecycleInteractions");
            } else {
                strResolveContentBindingKey2 = null;
            }
            if (strResolveContentBindingKey2 != null) {
                objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
                if (objResolveStateRef != null) {
                    BindingLoggerKt.logContentBinding("modalLifecycleInteractions", strResolveContentBindingKey2, objResolveStateRef);
                    objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (!(objUnwrapForCoercion instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                        obj3 = null;
                    } else {
                        objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                        if (objUnwrapForCoercion2 == null) {
                            objOverlayContentPathBindings3 = null;
                        } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                            JsonElement jsonElement3 = (JsonElement) objUnwrapForCoercion2;
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalLifecycleInteractions.INSTANCE.serializer(), jsonElement3);
                            } catch (Exception unused5) {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else if (objUnwrapForCoercion2 instanceof ModalLifecycleInteractions) {
                            objOverlayContentPathBindings3 = objUnwrapForCoercion2;
                        } else {
                            if (objUnwrapForCoercion2 instanceof Number) {
                                c22673i0 = AbstractC22671h0.f89337a;
                                orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(ModalLifecycleInteractions.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings3 = (ModalLifecycleInteractions) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings3 = (ModalLifecycleInteractions) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings3 = (ModalLifecycleInteractions) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings3 = (ModalLifecycleInteractions) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                    objOverlayContentPathBindings3 = (ModalLifecycleInteractions) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
                                    objOverlayContentPathBindings3 = (ModalLifecycleInteractions) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                                }
                            } else if (objUnwrapForCoercion2 instanceof String) {
                                JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalLifecycleInteractions.INSTANCE.serializer(), jsonPrimitiveM1841c3);
                                } catch (Exception unused6) {
                                    objUnwrapForCoercion2 = null;
                                }
                                if (objUnwrapForCoercion2 != null) {
                                    objOverlayContentPathBindings3 = objUnwrapForCoercion2;
                                }
                            }
                            objOverlayContentPathBindings3 = null;
                        }
                        if (objOverlayContentPathBindings3 == null) {
                            obj3 = modalLifecycleInteractions;
                        } else {
                            obj3 = objOverlayContentPathBindings3;
                        }
                    }
                }
            } else if (obj3 != null) {
                objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(r1, "modalLifecycleInteractions", accumulatedState, obj3, new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$11
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                        return invoke((ModalLifecycleInteractions) obj7);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(ModalLifecycleInteractions v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(ModalLifecycleInteractions.INSTANCE.serializer(), v13);
                        } catch (Exception unused7) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$12
                    /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.modal.ModalLifecycleInteractions, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final ModalLifecycleInteractions invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalLifecycleInteractions.INSTANCE.serializer(), json);
                        } catch (Exception unused7) {
                            return null;
                        }
                    }
                });
                obj3 = objOverlayContentPathBindings3;
            }
            return (AnyModal) ContentBindingResolverKt.copyBindingsFrom(new AnyModal(modal3, modalAnalyticEventModel, (ModalLifecycleInteractions) DotPathBindingsKt.overlayAggregateBinding(map2, "modalLifecycleInteractions", accumulatedState, obj3, "modalLifecycleInteractions", new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$13
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                    return invoke((ModalLifecycleInteractions) obj7);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(ModalLifecycleInteractions modalLifecycleInteractions2) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(ModalLifecycleInteractions.INSTANCE.serializer());
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, modalLifecycleInteractions2, interfaceC37138cM122336d);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$14
                /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.modal.ModalLifecycleInteractions, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final ModalLifecycleInteractions invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalLifecycleInteractions.INSTANCE.serializer(), json);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$15
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.modal.ModalLifecycleInteractions, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.modal.ModalLifecycleInteractions, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final ModalLifecycleInteractions invoke(Object obj7) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj7);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement4 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalLifecycleInteractions.INSTANCE.serializer(), jsonElement4);
                        } catch (Exception unused7) {
                            return null;
                        }
                    }
                    if (UnwrapForCoercion instanceof ModalLifecycleInteractions) {
                        return UnwrapForCoercion;
                    }
                    if (!(UnwrapForCoercion instanceof Number)) {
                        if (!(UnwrapForCoercion instanceof String)) {
                            return null;
                        }
                        JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalLifecycleInteractions.INSTANCE.serializer(), jsonPrimitiveM1841c4);
                        } catch (Exception unused8) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i3 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(ModalLifecycleInteractions.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (ModalLifecycleInteractions) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Long.TYPE))) {
                        return (ModalLifecycleInteractions) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Double.TYPE))) {
                        return (ModalLifecycleInteractions) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Float.TYPE))) {
                        return (ModalLifecycleInteractions) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Short.TYPE))) {
                        return (ModalLifecycleInteractions) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (ModalLifecycleInteractions) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            })), anyModal);
        }
        if (objOverlayContentPathBindings != null) {
            objOverlayContentPathBindings = ContentPathBindingsKt.overlayContentPathBindings(map, "modal", accumulatedState, objOverlayContentPathBindings, new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$1
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                    return invoke((Modal) obj7);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Modal v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(Modal.INSTANCE.serializer(), v13);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$2
                /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.modal.Modal, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Modal invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(Modal.INSTANCE.serializer(), json);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            });
        }
        modal = (Modal) DotPathBindingsKt.overlayAggregateBinding(map2, "modal", accumulatedState, objOverlayContentPathBindings, "modal", new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$3
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                return invoke((Modal) obj7);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Modal modal4) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(Modal.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, modal4, interfaceC37138cM122336d);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$4
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.modal.Modal, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Modal invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(Modal.INSTANCE.serializer(), json);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$5
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [com.whoop.design.models.modal.Modal] */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.modal.Modal, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.modal.Modal, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Modal invoke(Object obj7) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj7);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement4 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(Modal.INSTANCE.serializer(), jsonElement4);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof Modal) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(Modal.INSTANCE.serializer(), jsonPrimitiveM1841c4);
                    } catch (Exception unused8) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i3 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(Modal.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (Modal) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Long.TYPE))) {
                    return (Modal) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Double.TYPE))) {
                    return (Modal) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Float.TYPE))) {
                    return (Modal) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Short.TYPE))) {
                    return (Modal) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (Modal) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (modal == null) {
            modal = anyModal.getModal();
        }
        Modal modal4 = modal;
        analyticEvents = anyModal.getAnalyticEvents();
        if (analyticEvents == null) {
            objOverlayContentPathBindings2 = null;
        } else {
            if (analyticEvents instanceof WithGeneratedBindings) {
                objBind = ((WithGeneratedBindings) analyticEvents).bind(accumulatedState);
                if (!(objBind instanceof ModalAnalyticEventModel)) {
                    objBind = null;
                }
                obj = (ModalAnalyticEventModel) objBind;
                if (obj == null) {
                    obj = analyticEvents;
                }
            } else if (analyticEvents instanceof List) {
                Iterable iterable4 = (Iterable) analyticEvents;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable4, 10));
                while (r2.hasNext()) {
                    if (obj5 instanceof WithGeneratedBindings) {
                        withGeneratedBindings = (WithGeneratedBindings) obj5;
                    } else {
                        withGeneratedBindings = null;
                    }
                    if (withGeneratedBindings == null) {
                    }
                    arrayList.add(obj5);
                }
                obj = (ModalAnalyticEventModel) arrayList;
            } else {
                obj = analyticEvents;
            }
            objOverlayContentPathBindings2 = obj;
        }
        if (r1 != 0) {
            strResolveContentBindingKey = BindingLoggerKt.resolveContentBindingKey(map, "analyticEvents");
        } else {
            strResolveContentBindingKey = null;
        }
        if (strResolveContentBindingKey != null) {
            objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
            if (objResolveStateRef2 != null) {
                BindingLoggerKt.logContentBinding("analyticEvents", strResolveContentBindingKey, objResolveStateRef2);
                objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                if (!(objUnwrapForCoercion3 instanceof String)) {
                    objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = null;
                    } else if (objOverlayContentPathBindings2 instanceof JsonElement) {
                        JsonElement jsonElement4 = (JsonElement) objOverlayContentPathBindings2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalAnalyticEventModel.INSTANCE.serializer(), jsonElement4);
                    } else if (!(objOverlayContentPathBindings2 instanceof ModalAnalyticEventModel)) {
                        if (objOverlayContentPathBindings2 instanceof Number) {
                            c22673i1 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(ModalAnalyticEventModel.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings2 = (ModalAnalyticEventModel) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings2 = (ModalAnalyticEventModel) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings2 = (ModalAnalyticEventModel) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings2 = (ModalAnalyticEventModel) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings2 = (ModalAnalyticEventModel) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings2 = (ModalAnalyticEventModel) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                            } else {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (objOverlayContentPathBindings2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalAnalyticEventModel.INSTANCE.serializer(), jsonPrimitiveM1841c4);
                            if (objOverlayContentPathBindings2 == null) {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else {
                            objOverlayContentPathBindings2 = null;
                        }
                    }
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = analyticEvents;
                    }
                } else {
                    objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = null;
                    } else if (objOverlayContentPathBindings2 instanceof JsonElement) {
                        JsonElement jsonElement5 = (JsonElement) objOverlayContentPathBindings2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalAnalyticEventModel.INSTANCE.serializer(), jsonElement5);
                    } else if (!(objOverlayContentPathBindings2 instanceof ModalAnalyticEventModel)) {
                        if (objOverlayContentPathBindings2 instanceof Number) {
                            c22673i1 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(ModalAnalyticEventModel.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings2 = (ModalAnalyticEventModel) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings2 = (ModalAnalyticEventModel) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings2 = (ModalAnalyticEventModel) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings2 = (ModalAnalyticEventModel) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings2 = (ModalAnalyticEventModel) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings2 = (ModalAnalyticEventModel) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                            } else {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (objOverlayContentPathBindings2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalAnalyticEventModel.INSTANCE.serializer(), jsonPrimitiveM1841c5);
                            if (objOverlayContentPathBindings2 == null) {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else {
                            objOverlayContentPathBindings2 = null;
                        }
                    }
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = analyticEvents;
                    }
                }
            }
        } else if (objOverlayContentPathBindings2 != null) {
            objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(r1, "analyticEvents", accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$6
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                    return invoke((ModalAnalyticEventModel) obj7);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(ModalAnalyticEventModel v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(ModalAnalyticEventModel.INSTANCE.serializer(), v13);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$7
                /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.modal.ModalAnalyticEventModel, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final ModalAnalyticEventModel invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalAnalyticEventModel.INSTANCE.serializer(), json);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            });
        }
        ModalAnalyticEventModel modalAnalyticEventModel2 = (ModalAnalyticEventModel) DotPathBindingsKt.overlayAggregateBinding(map2, "analyticEvents", accumulatedState, objOverlayContentPathBindings2, "analyticEvents", new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$8
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                return invoke((ModalAnalyticEventModel) obj7);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(ModalAnalyticEventModel modalAnalyticEventModel3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(ModalAnalyticEventModel.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, modalAnalyticEventModel3, interfaceC37138cM122336d);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$9
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.modal.ModalAnalyticEventModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final ModalAnalyticEventModel invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalAnalyticEventModel.INSTANCE.serializer(), json);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$10
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.modal.ModalAnalyticEventModel, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.modal.ModalAnalyticEventModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final ModalAnalyticEventModel invoke(Object obj7) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj7);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement6 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalAnalyticEventModel.INSTANCE.serializer(), jsonElement6);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof ModalAnalyticEventModel) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalAnalyticEventModel.INSTANCE.serializer(), jsonPrimitiveM1841c6);
                    } catch (Exception unused8) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i3 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(ModalAnalyticEventModel.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (ModalAnalyticEventModel) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Long.TYPE))) {
                    return (ModalAnalyticEventModel) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Double.TYPE))) {
                    return (ModalAnalyticEventModel) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Float.TYPE))) {
                    return (ModalAnalyticEventModel) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Short.TYPE))) {
                    return (ModalAnalyticEventModel) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (ModalAnalyticEventModel) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        modalLifecycleInteractions = anyModal.getModalLifecycleInteractions();
        if (modalLifecycleInteractions == null) {
            obj3 = null;
        } else {
            if (modalLifecycleInteractions instanceof WithGeneratedBindings) {
                objBind2 = ((WithGeneratedBindings) modalLifecycleInteractions).bind(accumulatedState);
                if (!(objBind2 instanceof ModalLifecycleInteractions)) {
                    objBind2 = null;
                }
                obj2 = (ModalLifecycleInteractions) objBind2;
                if (obj2 == null) {
                    obj2 = modalLifecycleInteractions;
                }
            } else if (modalLifecycleInteractions instanceof List) {
                Iterable iterable5 = (Iterable) modalLifecycleInteractions;
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable5, 10));
                while (r2.hasNext()) {
                    if (obj6 instanceof WithGeneratedBindings) {
                        withGeneratedBindings2 = (WithGeneratedBindings) obj6;
                    } else {
                        withGeneratedBindings2 = null;
                    }
                    if (withGeneratedBindings2 == null) {
                    }
                    arrayList2.add(obj6);
                }
                obj2 = (ModalLifecycleInteractions) arrayList2;
            } else {
                obj2 = modalLifecycleInteractions;
            }
            obj3 = obj2;
        }
        if (r1 != 0) {
            strResolveContentBindingKey2 = BindingLoggerKt.resolveContentBindingKey(r1, "modalLifecycleInteractions");
        } else {
            strResolveContentBindingKey2 = null;
        }
        if (strResolveContentBindingKey2 != null) {
            objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
            if (objResolveStateRef != null) {
                BindingLoggerKt.logContentBinding("modalLifecycleInteractions", strResolveContentBindingKey2, objResolveStateRef);
                objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                if (!(objUnwrapForCoercion instanceof String)) {
                    objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (objUnwrapForCoercion2 == null) {
                        objOverlayContentPathBindings3 = null;
                    } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                        JsonElement jsonElement6 = (JsonElement) objUnwrapForCoercion2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalLifecycleInteractions.INSTANCE.serializer(), jsonElement6);
                    } else if (objUnwrapForCoercion2 instanceof ModalLifecycleInteractions) {
                        if (objUnwrapForCoercion2 instanceof Number) {
                            c22673i0 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(ModalLifecycleInteractions.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings3 = (ModalLifecycleInteractions) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings3 = (ModalLifecycleInteractions) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings3 = (ModalLifecycleInteractions) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings3 = (ModalLifecycleInteractions) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings3 = (ModalLifecycleInteractions) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings3 = (ModalLifecycleInteractions) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                            }
                        } else if (objUnwrapForCoercion2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalLifecycleInteractions.INSTANCE.serializer(), jsonPrimitiveM1841c6);
                            if (objUnwrapForCoercion2 != null) {
                                objOverlayContentPathBindings3 = objUnwrapForCoercion2;
                            }
                        }
                        objOverlayContentPathBindings3 = null;
                    } else {
                        objOverlayContentPathBindings3 = objUnwrapForCoercion2;
                    }
                    if (objOverlayContentPathBindings3 == null) {
                        obj3 = modalLifecycleInteractions;
                    } else {
                        obj3 = objOverlayContentPathBindings3;
                    }
                } else {
                    objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (objUnwrapForCoercion2 == null) {
                        objOverlayContentPathBindings3 = null;
                    } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                        JsonElement jsonElement7 = (JsonElement) objUnwrapForCoercion2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalLifecycleInteractions.INSTANCE.serializer(), jsonElement7);
                    } else if (objUnwrapForCoercion2 instanceof ModalLifecycleInteractions) {
                        if (objUnwrapForCoercion2 instanceof Number) {
                            c22673i0 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(ModalLifecycleInteractions.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings3 = (ModalLifecycleInteractions) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings3 = (ModalLifecycleInteractions) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings3 = (ModalLifecycleInteractions) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings3 = (ModalLifecycleInteractions) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings3 = (ModalLifecycleInteractions) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings3 = (ModalLifecycleInteractions) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                            }
                        } else if (objUnwrapForCoercion2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c7 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalLifecycleInteractions.INSTANCE.serializer(), jsonPrimitiveM1841c7);
                            if (objUnwrapForCoercion2 != null) {
                                objOverlayContentPathBindings3 = objUnwrapForCoercion2;
                            }
                        }
                        objOverlayContentPathBindings3 = null;
                    } else {
                        objOverlayContentPathBindings3 = objUnwrapForCoercion2;
                    }
                    if (objOverlayContentPathBindings3 == null) {
                        obj3 = modalLifecycleInteractions;
                    } else {
                        obj3 = objOverlayContentPathBindings3;
                    }
                }
            }
        } else if (obj3 != null) {
            objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(r1, "modalLifecycleInteractions", accumulatedState, obj3, new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$11
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                    return invoke((ModalLifecycleInteractions) obj7);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(ModalLifecycleInteractions v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(ModalLifecycleInteractions.INSTANCE.serializer(), v13);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$12
                /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.modal.ModalLifecycleInteractions, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final ModalLifecycleInteractions invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalLifecycleInteractions.INSTANCE.serializer(), json);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            });
            obj3 = objOverlayContentPathBindings3;
        }
        return (AnyModal) ContentBindingResolverKt.copyBindingsFrom(new AnyModal(modal4, modalAnalyticEventModel2, (ModalLifecycleInteractions) DotPathBindingsKt.overlayAggregateBinding(map2, "modalLifecycleInteractions", accumulatedState, obj3, "modalLifecycleInteractions", new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$13
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                return invoke((ModalLifecycleInteractions) obj7);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(ModalLifecycleInteractions modalLifecycleInteractions2) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(ModalLifecycleInteractions.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, modalLifecycleInteractions2, interfaceC37138cM122336d);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$14
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.modal.ModalLifecycleInteractions, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final ModalLifecycleInteractions invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalLifecycleInteractions.INSTANCE.serializer(), json);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.modal.AnyModalStateBindingKt$generatedBind$$inlined$resolveBinding$15
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.modal.ModalLifecycleInteractions, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.modal.ModalLifecycleInteractions, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final ModalLifecycleInteractions invoke(Object obj7) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj7);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement8 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalLifecycleInteractions.INSTANCE.serializer(), jsonElement8);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof ModalLifecycleInteractions) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c8 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(ModalLifecycleInteractions.INSTANCE.serializer(), jsonPrimitiveM1841c8);
                    } catch (Exception unused8) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i3 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(ModalLifecycleInteractions.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (ModalLifecycleInteractions) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Long.TYPE))) {
                    return (ModalLifecycleInteractions) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Double.TYPE))) {
                    return (ModalLifecycleInteractions) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Float.TYPE))) {
                    return (ModalLifecycleInteractions) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Short.TYPE))) {
                    return (ModalLifecycleInteractions) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (ModalLifecycleInteractions) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        })), anyModal);
    }

    public static /* synthetic */ AnyModal generatedBind$default(AnyModal anyModal, Map map, Map map2, Map map3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map2 = null;
        }
        return generatedBind(anyModal, map, map2, map3);
    }
}
