package com.whoop.design.models;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.BindCoercionKt;
import com.whoop.design.models.binding.BindingLoggerKt;
import com.whoop.design.models.binding.ContentBindingResolverKt;
import com.whoop.design.models.binding.ContentPathBindingsKt;
import com.whoop.design.models.binding.DotPathBindingsKt;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.design.models.binding.StateBindingDeserializerKt;
import com.whoop.design.models.binding.StateLookupKt;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003¨\u0006\t"}, m65681d2 = {"generatedBind", "Lcom/whoop/design/models/DesignModelWrapper;", "contentBinding", "", "", "aggregateBindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "accumulatedState", "", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DesignModelWrapperStateBindingKt {
    /* JADX WARN: Code duplicated, block: B:102:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:108:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:110:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:114:0x0203  */
    /* JADX WARN: Code duplicated, block: B:116:0x0207  */
    /* JADX WARN: Code duplicated, block: B:119:0x021f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0227  */
    /* JADX WARN: Code duplicated, block: B:122:0x022b  */
    /* JADX WARN: Code duplicated, block: B:130:0x023e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0244  */
    /* JADX WARN: Code duplicated, block: B:135:0x0249  */
    /* JADX WARN: Code duplicated, block: B:137:0x024c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0252  */
    /* JADX WARN: Code duplicated, block: B:146:0x0274  */
    /* JADX WARN: Code duplicated, block: B:148:0x027a  */
    /* JADX WARN: Code duplicated, block: B:149:0x027d  */
    /* JADX WARN: Code duplicated, block: B:151:0x0281  */
    /* JADX WARN: Code duplicated, block: B:154:0x029c  */
    /* JADX WARN: Code duplicated, block: B:157:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:159:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:161:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:162:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:164:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:165:0x02de  */
    /* JADX WARN: Code duplicated, block: B:167:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:168:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:170:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:171:0x030c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0316  */
    /* JADX WARN: Code duplicated, block: B:174:0x0323  */
    /* JADX WARN: Code duplicated, block: B:176:0x032d  */
    /* JADX WARN: Code duplicated, block: B:177:0x033a  */
    /* JADX WARN: Code duplicated, block: B:179:0x033e  */
    /* JADX WARN: Code duplicated, block: B:185:0x0361  */
    /* JADX WARN: Code duplicated, block: B:186:0x0363 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:188:0x0366  */
    /* JADX WARN: Code duplicated, block: B:191:0x0388  */
    /* JADX WARN: Code duplicated, block: B:192:0x038a  */
    /* JADX WARN: Code duplicated, block: B:194:0x038e  */
    /* JADX WARN: Code duplicated, block: B:196:0x0399  */
    /* JADX WARN: Code duplicated, block: B:200:0x039f  */
    /* JADX WARN: Code duplicated, block: B:202:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:205:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:207:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:208:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:216:0x03da  */
    /* JADX WARN: Code duplicated, block: B:220:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:221:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:224:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:226:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:233:0x0412  */
    /* JADX WARN: Code duplicated, block: B:235:0x0418  */
    /* JADX WARN: Code duplicated, block: B:236:0x041b  */
    /* JADX WARN: Code duplicated, block: B:238:0x041f  */
    /* JADX WARN: Code duplicated, block: B:241:0x0439  */
    /* JADX WARN: Code duplicated, block: B:244:0x043f  */
    /* JADX WARN: Code duplicated, block: B:246:0x0443  */
    /* JADX WARN: Code duplicated, block: B:248:0x0453  */
    /* JADX WARN: Code duplicated, block: B:249:0x0461  */
    /* JADX WARN: Code duplicated, block: B:251:0x046b  */
    /* JADX WARN: Code duplicated, block: B:252:0x0479  */
    /* JADX WARN: Code duplicated, block: B:254:0x0483  */
    /* JADX WARN: Code duplicated, block: B:255:0x0490  */
    /* JADX WARN: Code duplicated, block: B:257:0x049a  */
    /* JADX WARN: Code duplicated, block: B:258:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:260:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:261:0x04be  */
    /* JADX WARN: Code duplicated, block: B:263:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:264:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:266:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:272:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:273:0x04fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:275:0x0500  */
    /* JADX WARN: Code duplicated, block: B:278:0x0526  */
    /* JADX WARN: Code duplicated, block: B:279:0x0528  */
    /* JADX WARN: Code duplicated, block: B:281:0x052c  */
    /* JADX WARN: Code duplicated, block: B:283:0x0537  */
    /* JADX WARN: Code duplicated, block: B:287:0x053d  */
    /* JADX WARN: Code duplicated, block: B:289:0x0541  */
    /* JADX WARN: Code duplicated, block: B:292:0x0559  */
    /* JADX WARN: Code duplicated, block: B:294:0x0561  */
    /* JADX WARN: Code duplicated, block: B:295:0x0565  */
    /* JADX WARN: Code duplicated, block: B:303:0x0578  */
    /* JADX WARN: Code duplicated, block: B:307:0x057e  */
    /* JADX WARN: Code duplicated, block: B:308:0x0583  */
    /* JADX WARN: Code duplicated, block: B:310:0x0586  */
    /* JADX WARN: Code duplicated, block: B:312:0x058c  */
    /* JADX WARN: Code duplicated, block: B:319:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:321:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:323:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:325:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:330:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:333:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:335:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:337:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:338:0x0609  */
    /* JADX WARN: Code duplicated, block: B:340:0x0613  */
    /* JADX WARN: Code duplicated, block: B:341:0x0620  */
    /* JADX WARN: Code duplicated, block: B:343:0x062a  */
    /* JADX WARN: Code duplicated, block: B:344:0x0637  */
    /* JADX WARN: Code duplicated, block: B:346:0x0641  */
    /* JADX WARN: Code duplicated, block: B:347:0x064e  */
    /* JADX WARN: Code duplicated, block: B:349:0x0658  */
    /* JADX WARN: Code duplicated, block: B:350:0x0666  */
    /* JADX WARN: Code duplicated, block: B:352:0x0672  */
    /* JADX WARN: Code duplicated, block: B:353:0x067f  */
    /* JADX WARN: Code duplicated, block: B:355:0x0685  */
    /* JADX WARN: Code duplicated, block: B:361:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:362:0x06af  */
    /* JADX WARN: Code duplicated, block: B:363:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:366:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:369:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:370:0x06df  */
    /* JADX WARN: Code duplicated, block: B:372:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:374:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:378:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:380:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:383:0x0710  */
    /* JADX WARN: Code duplicated, block: B:385:0x0718  */
    /* JADX WARN: Code duplicated, block: B:386:0x071c  */
    /* JADX WARN: Code duplicated, block: B:394:0x072f  */
    /* JADX WARN: Code duplicated, block: B:398:0x0735  */
    /* JADX WARN: Code duplicated, block: B:399:0x073a  */
    /* JADX WARN: Code duplicated, block: B:401:0x073d  */
    /* JADX WARN: Code duplicated, block: B:403:0x0743  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:410:0x0765  */
    /* JADX WARN: Code duplicated, block: B:412:0x076b  */
    /* JADX WARN: Code duplicated, block: B:413:0x076e  */
    /* JADX WARN: Code duplicated, block: B:415:0x0772  */
    /* JADX WARN: Code duplicated, block: B:418:0x078c  */
    /* JADX WARN: Code duplicated, block: B:420:0x0790 A[PHI: r0
      0x0790: PHI (r0v28 java.lang.Object) = (r0v6 java.lang.Object), (r0v10 java.lang.Object) binds: [B:419:0x078e, B:447:0x0854] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:421:0x0793  */
    /* JADX WARN: Code duplicated, block: B:423:0x0797  */
    /* JADX WARN: Code duplicated, block: B:425:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:426:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:428:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:429:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:431:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:432:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:434:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:435:0x0800  */
    /* JADX WARN: Code duplicated, block: B:437:0x080a  */
    /* JADX WARN: Code duplicated, block: B:438:0x0818  */
    /* JADX WARN: Code duplicated, block: B:440:0x0824  */
    /* JADX WARN: Code duplicated, block: B:441:0x0832  */
    /* JADX WARN: Code duplicated, block: B:443:0x0836  */
    /* JADX WARN: Code duplicated, block: B:450:0x085a  */
    /* JADX WARN: Code duplicated, block: B:451:0x085c A[PHI: r10
      0x085c: PHI (r10v2 java.lang.Object) = (r10v1 java.lang.Object), (r10v17 java.lang.Object) binds: [B:454:0x0861, B:449:0x0858] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:452:0x085e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:454:0x0861  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final DesignModelWrapper generatedBind(DesignModelWrapper designModelWrapper, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, ? extends Object> accumulatedState) {
        Object objOverlayContentPathBindings;
        WithGeneratedBindings withGeneratedBindingsBind;
        DesignSystemModel model;
        Object primaryAnalyticEvent;
        ArrayList arrayList;
        Object obj;
        WithGeneratedBindings withGeneratedBindings;
        WithGeneratedBindings withGeneratedBindingsBind2;
        Object objOverlayContentPathBindings2;
        Object objBind;
        String strResolveContentBindingKey;
        Map<String, String> bindings;
        List arrayList2;
        Map<String, String> map3;
        WithGeneratedBindings withGeneratedBindings2;
        WithGeneratedBindings withGeneratedBindingsBind3;
        Object objOverlayContentPathBindings3;
        WithGeneratedBindings withGeneratedBindingsBind4;
        String strResolveContentBindingKey2;
        Map<String, AggregateBinding> aggregateBindings;
        List arrayList3;
        Map<String, AggregateBinding> map4;
        WithGeneratedBindings withGeneratedBindings3;
        WithGeneratedBindings withGeneratedBindingsBind5;
        Object objOverlayContentPathBindings4;
        WithGeneratedBindings withGeneratedBindingsBind6;
        String strResolveContentBindingKey3;
        Class cls;
        Class cls2;
        Map<String, String> primaryAnalyticEventBindings;
        List arrayList4;
        Map<String, String> map5;
        WithGeneratedBindings withGeneratedBindings4;
        WithGeneratedBindings withGeneratedBindingsBind7;
        Object obj2;
        WithGeneratedBindings withGeneratedBindingsBind8;
        String strResolveContentBindingKey4;
        Object objOverlayContentPathBindings5;
        Object objResolveStateRef;
        Object objUnwrapForCoercion;
        Object objUnwrapForCoercion2;
        C22673i0 c22673i0;
        InterfaceC21461d orCreateKotlinClass;
        Object objResolveStateRef2;
        Object objUnwrapForCoercion3;
        C22673i0 c22673i1;
        InterfaceC21461d orCreateKotlinClass2;
        Object objResolveStateRef3;
        Object objUnwrapForCoercion4;
        C22673i0 c22673i2;
        InterfaceC21461d orCreateKotlinClass3;
        Object objResolveStateRef4;
        Object objUnwrapForCoercion5;
        C22673i0 c22673i3;
        InterfaceC21461d orCreateKotlinClass4;
        AbstractC22676k.m65750j(designModelWrapper, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if ((map == null || map.isEmpty()) && ((map2 == null || map2.isEmpty()) && accumulatedState.isEmpty())) {
            return designModelWrapper;
        }
        DesignSystemModel model2 = designModelWrapper.getModel();
        if (model2 == null) {
            objOverlayContentPathBindings = null;
        } else if (model2 instanceof WithGeneratedBindings) {
            WithGeneratedBindings withGeneratedBindingsBind9 = ((WithGeneratedBindings) model2).bind(accumulatedState);
            if (!(withGeneratedBindingsBind9 instanceof DesignSystemModel)) {
                withGeneratedBindingsBind9 = null;
            }
            objOverlayContentPathBindings = (DesignSystemModel) withGeneratedBindingsBind9;
            if (objOverlayContentPathBindings == null) {
                objOverlayContentPathBindings = model2;
            }
        } else if (model2 instanceof List) {
            Iterable iterable = (Iterable) model2;
            List arrayList5 = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            for (Object obj3 : iterable) {
                WithGeneratedBindings withGeneratedBindings5 = obj3 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj3 : null;
                if (withGeneratedBindings5 != null && (withGeneratedBindingsBind = withGeneratedBindings5.bind(accumulatedState)) != null) {
                    obj3 = withGeneratedBindingsBind;
                }
                arrayList5.add(obj3);
            }
            objOverlayContentPathBindings = (DesignSystemModel) arrayList5;
        } else {
            objOverlayContentPathBindings = model2;
        }
        String strResolveContentBindingKey5 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "model") : null;
        Class cls3 = Byte.TYPE;
        Class cls4 = Short.TYPE;
        Class cls5 = Float.TYPE;
        Class cls6 = Double.TYPE;
        Class cls7 = Long.TYPE;
        Class cls8 = Integer.TYPE;
        if (strResolveContentBindingKey5 != null) {
            Object objResolveStateRef5 = StateLookupKt.resolveStateRef(strResolveContentBindingKey5, accumulatedState);
            if (objResolveStateRef5 != null) {
                BindingLoggerKt.logContentBinding("model", strResolveContentBindingKey5, objResolveStateRef5);
                Object objUnwrapForCoercion6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                if ((objUnwrapForCoercion6 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion6) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                    objOverlayContentPathBindings = null;
                } else {
                    objOverlayContentPathBindings = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                    if (objOverlayContentPathBindings == null) {
                        objOverlayContentPathBindings = null;
                    } else if (objOverlayContentPathBindings instanceof JsonElement) {
                        try {
                            objOverlayContentPathBindings = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)), (JsonElement) objOverlayContentPathBindings);
                        } catch (Exception unused) {
                            objOverlayContentPathBindings = null;
                        }
                    } else if (!(objOverlayContentPathBindings instanceof DesignSystemModel)) {
                        if (objOverlayContentPathBindings instanceof Number) {
                            C22673i0 c22673i4 = AbstractC22671h0.f89337a;
                            InterfaceC21461d orCreateKotlinClass5 = c22673i4.getOrCreateKotlinClass(DesignSystemModel.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls8))) {
                                objOverlayContentPathBindings = (DesignSystemModel) Integer.valueOf(((Number) objOverlayContentPathBindings).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls7))) {
                                objOverlayContentPathBindings = (DesignSystemModel) Long.valueOf(((Number) objOverlayContentPathBindings).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings = (DesignSystemModel) Double.valueOf(((Number) objOverlayContentPathBindings).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings = (DesignSystemModel) Float.valueOf(((Number) objOverlayContentPathBindings).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings = (DesignSystemModel) Short.valueOf(((Number) objOverlayContentPathBindings).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings = (DesignSystemModel) Byte.valueOf(((Number) objOverlayContentPathBindings).byteValue());
                            } else {
                                objOverlayContentPathBindings = null;
                            }
                        } else if (objOverlayContentPathBindings instanceof String) {
                            try {
                                objOverlayContentPathBindings = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)), AbstractC0770m.m1841c((String) objOverlayContentPathBindings));
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
                        objOverlayContentPathBindings = model2;
                    }
                }
            }
            model = (DesignSystemModel) DotPathBindingsKt.overlayAggregateBinding(map2, "model", accumulatedState, objOverlayContentPathBindings, "model", new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$3
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                    return invoke((DesignSystemModel) obj4);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(DesignSystemModel designSystemModel) {
                    try {
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)));
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, designSystemModel, interfaceC37138cM122336d);
                    } catch (Exception unused3) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$4
                /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.DesignSystemModel, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final DesignSystemModel invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)), json);
                    } catch (Exception unused3) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$5
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [com.whoop.design.models.DesignSystemModel] */
                /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.DesignSystemModel, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.DesignSystemModel, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final DesignSystemModel invoke(Object obj4) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj4);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        try {
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)), (JsonElement) UnwrapForCoercion);
                        } catch (Exception unused3) {
                            return null;
                        }
                    }
                    if (UnwrapForCoercion instanceof DesignSystemModel) {
                        return UnwrapForCoercion;
                    }
                    if (!(UnwrapForCoercion instanceof Number)) {
                        if (!(UnwrapForCoercion instanceof String)) {
                            return null;
                        }
                        try {
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)), AbstractC0770m.m1841c((String) UnwrapForCoercion));
                        } catch (Exception unused4) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(DesignSystemModel.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (DesignSystemModel) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                        return (DesignSystemModel) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                        return (DesignSystemModel) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                        return (DesignSystemModel) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                        return (DesignSystemModel) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (DesignSystemModel) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            });
            if (model == null) {
                model = designModelWrapper.getModel();
            }
            DesignSystemModel designSystemModel = model;
            primaryAnalyticEvent = designModelWrapper.getPrimaryAnalyticEvent();
            if (primaryAnalyticEvent == null) {
                objOverlayContentPathBindings2 = null;
            } else {
                if (primaryAnalyticEvent instanceof WithGeneratedBindings) {
                    objBind = ((WithGeneratedBindings) primaryAnalyticEvent).bind(accumulatedState);
                    if (!(objBind instanceof AnalyticEventModel)) {
                        objBind = null;
                    }
                    obj = (AnalyticEventModel) objBind;
                    if (obj == null) {
                        obj = primaryAnalyticEvent;
                    }
                } else if (primaryAnalyticEvent instanceof List) {
                    Iterable iterable2 = (Iterable) primaryAnalyticEvent;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
                    for (Object obj4 : iterable2) {
                        if (obj4 instanceof WithGeneratedBindings) {
                            withGeneratedBindings = (WithGeneratedBindings) obj4;
                        } else {
                            withGeneratedBindings = null;
                        }
                        if (withGeneratedBindings == null && (withGeneratedBindingsBind2 = withGeneratedBindings.bind(accumulatedState)) != null) {
                            obj4 = withGeneratedBindingsBind2;
                        }
                        arrayList.add(obj4);
                    }
                    obj = (AnalyticEventModel) arrayList;
                } else {
                    obj = primaryAnalyticEvent;
                }
                objOverlayContentPathBindings2 = obj;
            }
            if (r1 != 0) {
                strResolveContentBindingKey = BindingLoggerKt.resolveContentBindingKey(map, "primaryAnalyticEvent");
            } else {
                strResolveContentBindingKey = null;
            }
            if (strResolveContentBindingKey != null) {
                objResolveStateRef4 = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
                if (objResolveStateRef4 != null) {
                    BindingLoggerKt.logContentBinding("primaryAnalyticEvent", strResolveContentBindingKey, objResolveStateRef4);
                    objUnwrapForCoercion5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                    if (!(objUnwrapForCoercion5 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion5) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                        objOverlayContentPathBindings2 = null;
                    } else {
                        objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                        if (objOverlayContentPathBindings2 == null) {
                            objOverlayContentPathBindings2 = null;
                        } else if (objOverlayContentPathBindings2 instanceof JsonElement) {
                            JsonElement jsonElement = (JsonElement) objOverlayContentPathBindings2;
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AnalyticEventModel.INSTANCE.serializer(), jsonElement);
                            } catch (Exception unused3) {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (!(objOverlayContentPathBindings2 instanceof AnalyticEventModel)) {
                            if (objOverlayContentPathBindings2 instanceof Number) {
                                c22673i3 = AbstractC22671h0.f89337a;
                                orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(AnalyticEventModel.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls8))) {
                                    objOverlayContentPathBindings2 = (AnalyticEventModel) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls7))) {
                                    objOverlayContentPathBindings2 = (AnalyticEventModel) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings2 = (AnalyticEventModel) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings2 = (AnalyticEventModel) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings2 = (AnalyticEventModel) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings2 = (AnalyticEventModel) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                                } else {
                                    objOverlayContentPathBindings2 = null;
                                }
                            } else if (objOverlayContentPathBindings2 instanceof String) {
                                JsonPrimitive jsonPrimitiveM1841c = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AnalyticEventModel.INSTANCE.serializer(), jsonPrimitiveM1841c);
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
                            objOverlayContentPathBindings2 = primaryAnalyticEvent;
                        }
                    }
                }
            } else if (objOverlayContentPathBindings2 != null) {
                objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(r1, "primaryAnalyticEvent", accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$6
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                        return invoke((AnalyticEventModel) obj5);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(AnalyticEventModel v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(AnalyticEventModel.INSTANCE.serializer(), v13);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$7
                    /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.analytics.AnalyticEventModel, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final AnalyticEventModel invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(AnalyticEventModel.INSTANCE.serializer(), json);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                });
            }
            AnalyticEventModel analyticEventModel = (AnalyticEventModel) DotPathBindingsKt.overlayAggregateBinding(map2, "primaryAnalyticEvent", accumulatedState, objOverlayContentPathBindings2, "primaryAnalyticEvent", new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$8
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                    return invoke((AnalyticEventModel) obj5);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(AnalyticEventModel analyticEventModel2) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(AnalyticEventModel.INSTANCE.serializer());
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, analyticEventModel2, interfaceC37138cM122336d);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$9
                /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.analytics.AnalyticEventModel, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final AnalyticEventModel invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AnalyticEventModel.INSTANCE.serializer(), json);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$10
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.analytics.AnalyticEventModel, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.analytics.AnalyticEventModel, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final AnalyticEventModel invoke(Object obj5) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj5);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement2 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(AnalyticEventModel.INSTANCE.serializer(), jsonElement2);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                    if (UnwrapForCoercion instanceof AnalyticEventModel) {
                        return UnwrapForCoercion;
                    }
                    if (!(UnwrapForCoercion instanceof Number)) {
                        if (!(UnwrapForCoercion instanceof String)) {
                            return null;
                        }
                        JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(AnalyticEventModel.INSTANCE.serializer(), jsonPrimitiveM1841c2);
                        } catch (Exception unused6) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(AnalyticEventModel.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (AnalyticEventModel) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                        return (AnalyticEventModel) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                        return (AnalyticEventModel) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                        return (AnalyticEventModel) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                        return (AnalyticEventModel) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (AnalyticEventModel) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            });
            bindings = designModelWrapper.getBindings();
            if (bindings == null) {
                objOverlayContentPathBindings3 = null;
            } else {
                if (bindings instanceof WithGeneratedBindings) {
                    withGeneratedBindingsBind4 = ((WithGeneratedBindings) bindings).bind(accumulatedState);
                    if (!(withGeneratedBindingsBind4 instanceof Map)) {
                        withGeneratedBindingsBind4 = null;
                    }
                    map3 = (Map) withGeneratedBindingsBind4;
                    if (map3 == null) {
                        map3 = bindings;
                    }
                } else if (bindings instanceof List) {
                    Iterable iterable3 = (Iterable) bindings;
                    arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable3, 10));
                    for (Object obj5 : iterable3) {
                        if (obj5 instanceof WithGeneratedBindings) {
                            withGeneratedBindings2 = (WithGeneratedBindings) obj5;
                        } else {
                            withGeneratedBindings2 = null;
                        }
                        if (withGeneratedBindings2 == null && (withGeneratedBindingsBind3 = withGeneratedBindings2.bind(accumulatedState)) != null) {
                            obj5 = withGeneratedBindingsBind3;
                        }
                        arrayList2.add(obj5);
                    }
                    map3 = (Map) arrayList2;
                } else {
                    map3 = bindings;
                }
                objOverlayContentPathBindings3 = map3;
            }
            if (r1 != 0) {
                strResolveContentBindingKey2 = BindingLoggerKt.resolveContentBindingKey(r1, "bindings");
            } else {
                strResolveContentBindingKey2 = null;
            }
            if (strResolveContentBindingKey2 != null) {
                objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
                if (objResolveStateRef3 != null) {
                    BindingLoggerKt.logContentBinding("bindings", strResolveContentBindingKey2, objResolveStateRef3);
                    objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                    if (!(objUnwrapForCoercion4 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion4) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                        objOverlayContentPathBindings3 = null;
                    } else {
                        objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                        if (objOverlayContentPathBindings3 == null) {
                            objOverlayContentPathBindings3 = null;
                        } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                            JsonElement jsonElement2 = (JsonElement) objOverlayContentPathBindings3;
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                                objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer, stringSerializer), jsonElement2);
                            } catch (Exception unused5) {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else if (!(objOverlayContentPathBindings3 instanceof Map)) {
                            if (objOverlayContentPathBindings3 instanceof Number) {
                                c22673i2 = AbstractC22671h0.f89337a;
                                orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(Map.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls8))) {
                                    objOverlayContentPathBindings3 = (Map) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls7))) {
                                    objOverlayContentPathBindings3 = (Map) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings3 = (Map) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings3 = (Map) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings3 = (Map) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings3 = (Map) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                                } else {
                                    objOverlayContentPathBindings3 = null;
                                }
                            } else if (objOverlayContentPathBindings3 instanceof String) {
                                JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                                    objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), jsonPrimitiveM1841c2);
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
                            objOverlayContentPathBindings3 = bindings;
                        }
                    }
                }
            } else if (objOverlayContentPathBindings3 != null) {
                objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(r1, "bindings", accumulatedState, objOverlayContentPathBindings3, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$11
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj6) {
                        return invoke((Map<String, ? extends String>) obj6);
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
                        } catch (Exception unused7) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$12
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Map<String, ? extends String> invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), json);
                        } catch (Exception unused7) {
                            return null;
                        }
                    }
                });
            }
            Map map6 = (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "bindings", accumulatedState, objOverlayContentPathBindings3, "bindings", new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$13
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj6) {
                    return invoke((Map<String, ? extends String>) obj6);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Map<String, ? extends String> map7) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3));
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, map7, interfaceC37138cM122336d);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$14
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Map<String, ? extends String> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), json);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$15
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends java.lang.String>] */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Map<String, ? extends String> invoke(Object obj6) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj6);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement3 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), jsonElement3);
                        } catch (Exception unused7) {
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
                        JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer4 = StringSerializer.INSTANCE;
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer4, stringSerializer4), jsonPrimitiveM1841c3);
                        } catch (Exception unused8) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(Map.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (Map) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                        return (Map) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                        return (Map) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                        return (Map) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                        return (Map) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (Map) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            });
            aggregateBindings = designModelWrapper.getAggregateBindings();
            if (aggregateBindings == null) {
                objOverlayContentPathBindings4 = null;
            } else {
                if (aggregateBindings instanceof WithGeneratedBindings) {
                    withGeneratedBindingsBind6 = ((WithGeneratedBindings) aggregateBindings).bind(accumulatedState);
                    if (!(withGeneratedBindingsBind6 instanceof Map)) {
                        withGeneratedBindingsBind6 = null;
                    }
                    map4 = (Map) withGeneratedBindingsBind6;
                    if (map4 == null) {
                        map4 = aggregateBindings;
                    }
                } else if (aggregateBindings instanceof List) {
                    Iterable iterable4 = (Iterable) aggregateBindings;
                    arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable4, 10));
                    for (Object obj6 : iterable4) {
                        if (obj6 instanceof WithGeneratedBindings) {
                            withGeneratedBindings3 = (WithGeneratedBindings) obj6;
                        } else {
                            withGeneratedBindings3 = null;
                        }
                        if (withGeneratedBindings3 == null && (withGeneratedBindingsBind5 = withGeneratedBindings3.bind(accumulatedState)) != null) {
                            obj6 = withGeneratedBindingsBind5;
                        }
                        arrayList3.add(obj6);
                    }
                    map4 = (Map) arrayList3;
                } else {
                    map4 = aggregateBindings;
                }
                objOverlayContentPathBindings4 = map4;
            }
            if (r1 != 0) {
                strResolveContentBindingKey3 = BindingLoggerKt.resolveContentBindingKey(r1, "aggregateBindings");
            } else {
                strResolveContentBindingKey3 = null;
            }
            if (strResolveContentBindingKey3 != null) {
                objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
                if (objResolveStateRef2 != null) {
                    BindingLoggerKt.logContentBinding("aggregateBindings", strResolveContentBindingKey3, objResolveStateRef2);
                    objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (!(objUnwrapForCoercion3 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion3) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                        cls = cls3;
                        objOverlayContentPathBindings4 = null;
                    } else {
                        objOverlayContentPathBindings4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                        if (objOverlayContentPathBindings4 == null) {
                            cls = cls3;
                        } else {
                            if (objOverlayContentPathBindings4 instanceof JsonElement) {
                                JsonElement jsonElement3 = (JsonElement) objOverlayContentPathBindings4;
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement3);
                                } catch (Exception unused7) {
                                    objOverlayContentPathBindings4 = null;
                                }
                            } else {
                                if (!(objOverlayContentPathBindings4 instanceof Map)) {
                                    if (objOverlayContentPathBindings4 instanceof Number) {
                                        c22673i1 = AbstractC22671h0.f89337a;
                                        orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(Map.class);
                                        if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls8))) {
                                            objOverlayContentPathBindings4 = (Map) Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls7))) {
                                            objOverlayContentPathBindings4 = (Map) Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                            objOverlayContentPathBindings4 = (Map) Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                            objOverlayContentPathBindings4 = (Map) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                            objOverlayContentPathBindings4 = (Map) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                                        } else {
                                            cls = cls3;
                                            if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                                objOverlayContentPathBindings4 = (Map) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                                            }
                                        }
                                    } else {
                                        cls = cls3;
                                        if (objOverlayContentPathBindings4 instanceof String) {
                                            JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings4);
                                            try {
                                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                                objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c3);
                                            } catch (Exception unused8) {
                                                objOverlayContentPathBindings4 = null;
                                            }
                                            if (objOverlayContentPathBindings4 == null) {
                                            }
                                        }
                                    }
                                }
                                if (objOverlayContentPathBindings4 == null) {
                                    objOverlayContentPathBindings4 = aggregateBindings;
                                }
                            }
                            cls = cls3;
                            if (objOverlayContentPathBindings4 == null) {
                                objOverlayContentPathBindings4 = aggregateBindings;
                            }
                        }
                        objOverlayContentPathBindings4 = null;
                        if (objOverlayContentPathBindings4 == null) {
                            objOverlayContentPathBindings4 = aggregateBindings;
                        }
                    }
                } else {
                    cls = cls3;
                }
            } else {
                cls = cls3;
                if (objOverlayContentPathBindings4 != null) {
                    objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(r1, "aggregateBindings", accumulatedState, objOverlayContentPathBindings4, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$16
                        @Override // p715kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                            return invoke((Map<String, ? extends AggregateBinding>) obj7);
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
                            } catch (Exception unused9) {
                                return null;
                            }
                        }
                    }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$17
                        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Map<String, ? extends AggregateBinding> invoke(JsonElement json) {
                            AbstractC22676k.m65750j(json, "json");
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), json);
                            } catch (Exception unused9) {
                                return null;
                            }
                        }
                    });
                }
            }
            cls2 = cls;
            Map map7 = (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "aggregateBindings", accumulatedState, objOverlayContentPathBindings4, "aggregateBindings", new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$18
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                    return invoke((Map<String, ? extends AggregateBinding>) obj7);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Map<String, ? extends AggregateBinding> map8) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE);
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, map8, interfaceC37138cM122336d);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$19
                /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Map<String, ? extends AggregateBinding> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), json);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$20
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Map<String, ? extends AggregateBinding> invoke(Object obj7) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj7);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement4 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement4);
                        } catch (Exception unused9) {
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
                        JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c4);
                        } catch (Exception unused10) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(Map.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (Map) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                        return (Map) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                        return (Map) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                        return (Map) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                        return (Map) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (Map) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            });
            primaryAnalyticEventBindings = designModelWrapper.getPrimaryAnalyticEventBindings();
            if (primaryAnalyticEventBindings == null) {
                obj2 = null;
            } else {
                if (primaryAnalyticEventBindings instanceof WithGeneratedBindings) {
                    withGeneratedBindingsBind8 = ((WithGeneratedBindings) primaryAnalyticEventBindings).bind(accumulatedState);
                    if (!(withGeneratedBindingsBind8 instanceof Map)) {
                        withGeneratedBindingsBind8 = null;
                    }
                    map5 = (Map) withGeneratedBindingsBind8;
                    if (map5 == null) {
                        map5 = primaryAnalyticEventBindings;
                    }
                } else if (primaryAnalyticEventBindings instanceof List) {
                    Iterable iterable5 = (Iterable) primaryAnalyticEventBindings;
                    arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable5, 10));
                    for (Object obj7 : iterable5) {
                        if (obj7 instanceof WithGeneratedBindings) {
                            withGeneratedBindings4 = (WithGeneratedBindings) obj7;
                        } else {
                            withGeneratedBindings4 = null;
                        }
                        if (withGeneratedBindings4 == null && (withGeneratedBindingsBind7 = withGeneratedBindings4.bind(accumulatedState)) != null) {
                            obj7 = withGeneratedBindingsBind7;
                        }
                        arrayList4.add(obj7);
                    }
                    map5 = (Map) arrayList4;
                } else {
                    map5 = primaryAnalyticEventBindings;
                }
                obj2 = map5;
            }
            if (r1 != 0) {
                strResolveContentBindingKey4 = BindingLoggerKt.resolveContentBindingKey(r1, "primaryAnalyticEventBindings");
            } else {
                strResolveContentBindingKey4 = null;
            }
            if (strResolveContentBindingKey4 != null) {
                objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey4, accumulatedState);
                if (objResolveStateRef != null) {
                    BindingLoggerKt.logContentBinding("primaryAnalyticEventBindings", strResolveContentBindingKey4, objResolveStateRef);
                    objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (!(objUnwrapForCoercion instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                        obj2 = null;
                    } else {
                        objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                        if (objUnwrapForCoercion2 == null) {
                            objOverlayContentPathBindings5 = null;
                        } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                            JsonElement jsonElement4 = (JsonElement) objUnwrapForCoercion2;
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                                objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), jsonElement4);
                            } catch (Exception unused9) {
                                objOverlayContentPathBindings5 = null;
                            }
                        } else if (objUnwrapForCoercion2 instanceof Map) {
                            objOverlayContentPathBindings5 = objUnwrapForCoercion2;
                        } else {
                            if (objUnwrapForCoercion2 instanceof Number) {
                                c22673i0 = AbstractC22671h0.f89337a;
                                orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls8))) {
                                    objOverlayContentPathBindings5 = (Map) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls7))) {
                                    objOverlayContentPathBindings5 = (Map) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings5 = (Map) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings5 = (Map) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings5 = (Map) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                    objOverlayContentPathBindings5 = (Map) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                                }
                            } else if (objUnwrapForCoercion2 instanceof String) {
                                JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    StringSerializer stringSerializer4 = StringSerializer.INSTANCE;
                                    objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer4, stringSerializer4), jsonPrimitiveM1841c4);
                                } catch (Exception unused10) {
                                    objUnwrapForCoercion2 = null;
                                }
                                if (objUnwrapForCoercion2 != null) {
                                    objOverlayContentPathBindings5 = objUnwrapForCoercion2;
                                }
                            }
                            objOverlayContentPathBindings5 = null;
                        }
                        if (objOverlayContentPathBindings5 == null) {
                            obj2 = primaryAnalyticEventBindings;
                        } else {
                            obj2 = objOverlayContentPathBindings5;
                        }
                    }
                }
            } else if (obj2 != null) {
                objOverlayContentPathBindings5 = ContentPathBindingsKt.overlayContentPathBindings(r1, "primaryAnalyticEventBindings", accumulatedState, obj2, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$21
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                        return invoke((Map<String, ? extends String>) obj8);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(Map<String, ? extends String> v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer5 = StringSerializer.INSTANCE;
                            LinkedHashMapSerializer linkedHashMapSerializer = new LinkedHashMapSerializer(stringSerializer5, stringSerializer5);
                            AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                            stateBindingJson.getClass();
                            return AbstractC12313p.m34290h0(stateBindingJson, v13, linkedHashMapSerializer);
                        } catch (Exception unused11) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$22
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Map<String, ? extends String> invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer5 = StringSerializer.INSTANCE;
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer5, stringSerializer5), json);
                        } catch (Exception unused11) {
                            return null;
                        }
                    }
                });
                obj2 = objOverlayContentPathBindings5;
            }
            return (DesignModelWrapper) ContentBindingResolverKt.copyBindingsFrom(new DesignModelWrapper(designSystemModel, analyticEventModel, map6, map7, (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "primaryAnalyticEventBindings", accumulatedState, obj2, "primaryAnalyticEventBindings", new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$23
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                    return invoke((Map<String, ? extends String>) obj8);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Map<String, ? extends String> map8) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer5 = StringSerializer.INSTANCE;
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new LinkedHashMapSerializer(stringSerializer5, stringSerializer5));
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, map8, interfaceC37138cM122336d);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$24
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Map<String, ? extends String> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer5 = StringSerializer.INSTANCE;
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer5, stringSerializer5), json);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$25
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends java.lang.String>] */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Map<String, ? extends String> invoke(Object obj8) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj8);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement5 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer5 = StringSerializer.INSTANCE;
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer5, stringSerializer5), jsonElement5);
                        } catch (Exception unused11) {
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
                        JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer6 = StringSerializer.INSTANCE;
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer6, stringSerializer6), jsonPrimitiveM1841c5);
                        } catch (Exception unused12) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(Map.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (Map) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                        return (Map) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                        return (Map) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                        return (Map) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                        return (Map) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (Map) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            })), designModelWrapper);
        }
        if (objOverlayContentPathBindings != null) {
            objOverlayContentPathBindings = ContentPathBindingsKt.overlayContentPathBindings(map, "model", accumulatedState, objOverlayContentPathBindings, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$1
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                    return invoke((DesignSystemModel) obj8);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(DesignSystemModel v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        InterfaceC37138c interfaceC37138cM113842e = AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class));
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, v13, interfaceC37138cM113842e);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$2
                /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.DesignSystemModel, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final DesignSystemModel invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)), json);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            });
        }
        model = (DesignSystemModel) DotPathBindingsKt.overlayAggregateBinding(map2, "model", accumulatedState, objOverlayContentPathBindings, "model", new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$3
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                return invoke((DesignSystemModel) obj8);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(DesignSystemModel designSystemModel2) {
                try {
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, designSystemModel2, interfaceC37138cM122336d);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$4
            /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.DesignSystemModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final DesignSystemModel invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)), json);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$5
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [com.whoop.design.models.DesignSystemModel] */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.DesignSystemModel, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.DesignSystemModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final DesignSystemModel invoke(Object obj8) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj8);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)), (JsonElement) UnwrapForCoercion);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof DesignSystemModel) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    try {
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)), AbstractC0770m.m1841c((String) UnwrapForCoercion));
                    } catch (Exception unused12) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(DesignSystemModel.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (DesignSystemModel) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                    return (DesignSystemModel) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                    return (DesignSystemModel) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                    return (DesignSystemModel) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                    return (DesignSystemModel) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (DesignSystemModel) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (model == null) {
            model = designModelWrapper.getModel();
        }
        DesignSystemModel designSystemModel2 = model;
        primaryAnalyticEvent = designModelWrapper.getPrimaryAnalyticEvent();
        if (primaryAnalyticEvent == null) {
            objOverlayContentPathBindings2 = null;
        } else {
            if (primaryAnalyticEvent instanceof WithGeneratedBindings) {
                objBind = ((WithGeneratedBindings) primaryAnalyticEvent).bind(accumulatedState);
                if (!(objBind instanceof AnalyticEventModel)) {
                    objBind = null;
                }
                obj = (AnalyticEventModel) objBind;
                if (obj == null) {
                    obj = primaryAnalyticEvent;
                }
            } else if (primaryAnalyticEvent instanceof List) {
                Iterable iterable6 = (Iterable) primaryAnalyticEvent;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable6, 10));
                while (r2.hasNext()) {
                    if (obj4 instanceof WithGeneratedBindings) {
                        withGeneratedBindings = (WithGeneratedBindings) obj4;
                    } else {
                        withGeneratedBindings = null;
                    }
                    if (withGeneratedBindings == null) {
                    }
                    arrayList.add(obj4);
                }
                obj = (AnalyticEventModel) arrayList;
            } else {
                obj = primaryAnalyticEvent;
            }
            objOverlayContentPathBindings2 = obj;
        }
        if (r1 != 0) {
            strResolveContentBindingKey = BindingLoggerKt.resolveContentBindingKey(map, "primaryAnalyticEvent");
        } else {
            strResolveContentBindingKey = null;
        }
        if (strResolveContentBindingKey != null) {
            objResolveStateRef4 = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
            if (objResolveStateRef4 != null) {
                BindingLoggerKt.logContentBinding("primaryAnalyticEvent", strResolveContentBindingKey, objResolveStateRef4);
                objUnwrapForCoercion5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if (!(objUnwrapForCoercion5 instanceof String)) {
                    objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = null;
                    } else if (objOverlayContentPathBindings2 instanceof JsonElement) {
                        JsonElement jsonElement5 = (JsonElement) objOverlayContentPathBindings2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AnalyticEventModel.INSTANCE.serializer(), jsonElement5);
                    } else if (!(objOverlayContentPathBindings2 instanceof AnalyticEventModel)) {
                        if (objOverlayContentPathBindings2 instanceof Number) {
                            c22673i3 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(AnalyticEventModel.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls8))) {
                                objOverlayContentPathBindings2 = (AnalyticEventModel) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls7))) {
                                objOverlayContentPathBindings2 = (AnalyticEventModel) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings2 = (AnalyticEventModel) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings2 = (AnalyticEventModel) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings2 = (AnalyticEventModel) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings2 = (AnalyticEventModel) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                            } else {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (objOverlayContentPathBindings2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AnalyticEventModel.INSTANCE.serializer(), jsonPrimitiveM1841c5);
                            if (objOverlayContentPathBindings2 == null) {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else {
                            objOverlayContentPathBindings2 = null;
                        }
                    }
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = primaryAnalyticEvent;
                    }
                } else {
                    objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = null;
                    } else if (objOverlayContentPathBindings2 instanceof JsonElement) {
                        JsonElement jsonElement6 = (JsonElement) objOverlayContentPathBindings2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AnalyticEventModel.INSTANCE.serializer(), jsonElement6);
                    } else if (!(objOverlayContentPathBindings2 instanceof AnalyticEventModel)) {
                        if (objOverlayContentPathBindings2 instanceof Number) {
                            c22673i3 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(AnalyticEventModel.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls8))) {
                                objOverlayContentPathBindings2 = (AnalyticEventModel) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls7))) {
                                objOverlayContentPathBindings2 = (AnalyticEventModel) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings2 = (AnalyticEventModel) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings2 = (AnalyticEventModel) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings2 = (AnalyticEventModel) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings2 = (AnalyticEventModel) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                            } else {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (objOverlayContentPathBindings2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AnalyticEventModel.INSTANCE.serializer(), jsonPrimitiveM1841c6);
                            if (objOverlayContentPathBindings2 == null) {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else {
                            objOverlayContentPathBindings2 = null;
                        }
                    }
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = primaryAnalyticEvent;
                    }
                }
            }
        } else if (objOverlayContentPathBindings2 != null) {
            objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(r1, "primaryAnalyticEvent", accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$6
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                    return invoke((AnalyticEventModel) obj8);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(AnalyticEventModel v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(AnalyticEventModel.INSTANCE.serializer(), v13);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$7
                /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.analytics.AnalyticEventModel, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final AnalyticEventModel invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AnalyticEventModel.INSTANCE.serializer(), json);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            });
        }
        AnalyticEventModel analyticEventModel2 = (AnalyticEventModel) DotPathBindingsKt.overlayAggregateBinding(map2, "primaryAnalyticEvent", accumulatedState, objOverlayContentPathBindings2, "primaryAnalyticEvent", new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$8
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                return invoke((AnalyticEventModel) obj8);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(AnalyticEventModel analyticEventModel3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(AnalyticEventModel.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, analyticEventModel3, interfaceC37138cM122336d);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$9
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.analytics.AnalyticEventModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final AnalyticEventModel invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(AnalyticEventModel.INSTANCE.serializer(), json);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$10
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.analytics.AnalyticEventModel, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.analytics.AnalyticEventModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final AnalyticEventModel invoke(Object obj8) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj8);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement7 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AnalyticEventModel.INSTANCE.serializer(), jsonElement7);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof AnalyticEventModel) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c7 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(AnalyticEventModel.INSTANCE.serializer(), jsonPrimitiveM1841c7);
                    } catch (Exception unused12) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(AnalyticEventModel.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (AnalyticEventModel) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                    return (AnalyticEventModel) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                    return (AnalyticEventModel) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                    return (AnalyticEventModel) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                    return (AnalyticEventModel) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (AnalyticEventModel) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        bindings = designModelWrapper.getBindings();
        if (bindings == null) {
            objOverlayContentPathBindings3 = null;
        } else {
            if (bindings instanceof WithGeneratedBindings) {
                withGeneratedBindingsBind4 = ((WithGeneratedBindings) bindings).bind(accumulatedState);
                if (!(withGeneratedBindingsBind4 instanceof Map)) {
                    withGeneratedBindingsBind4 = null;
                }
                map3 = (Map) withGeneratedBindingsBind4;
                if (map3 == null) {
                    map3 = bindings;
                }
            } else if (bindings instanceof List) {
                Iterable iterable7 = (Iterable) bindings;
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable7, 10));
                while (r2.hasNext()) {
                    if (obj5 instanceof WithGeneratedBindings) {
                        withGeneratedBindings2 = (WithGeneratedBindings) obj5;
                    } else {
                        withGeneratedBindings2 = null;
                    }
                    if (withGeneratedBindings2 == null) {
                    }
                    arrayList2.add(obj5);
                }
                map3 = (Map) arrayList2;
            } else {
                map3 = bindings;
            }
            objOverlayContentPathBindings3 = map3;
        }
        if (r1 != 0) {
            strResolveContentBindingKey2 = BindingLoggerKt.resolveContentBindingKey(r1, "bindings");
        } else {
            strResolveContentBindingKey2 = null;
        }
        if (strResolveContentBindingKey2 != null) {
            objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
            if (objResolveStateRef3 != null) {
                BindingLoggerKt.logContentBinding("bindings", strResolveContentBindingKey2, objResolveStateRef3);
                objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if (!(objUnwrapForCoercion4 instanceof String)) {
                    objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = null;
                    } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                        JsonElement jsonElement7 = (JsonElement) objOverlayContentPathBindings3;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer5 = StringSerializer.INSTANCE;
                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer5, stringSerializer5), jsonElement7);
                    } else if (!(objOverlayContentPathBindings3 instanceof Map)) {
                        if (objOverlayContentPathBindings3 instanceof Number) {
                            c22673i2 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(Map.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls8))) {
                                objOverlayContentPathBindings3 = (Map) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls7))) {
                                objOverlayContentPathBindings3 = (Map) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings3 = (Map) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings3 = (Map) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings3 = (Map) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings3 = (Map) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                            } else {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else if (objOverlayContentPathBindings3 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c7 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer6 = StringSerializer.INSTANCE;
                            objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer6, stringSerializer6), jsonPrimitiveM1841c7);
                            if (objOverlayContentPathBindings3 == null) {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else {
                            objOverlayContentPathBindings3 = null;
                        }
                    }
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = bindings;
                    }
                } else {
                    objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = null;
                    } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                        JsonElement jsonElement8 = (JsonElement) objOverlayContentPathBindings3;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer7 = StringSerializer.INSTANCE;
                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer7, stringSerializer7), jsonElement8);
                    } else if (!(objOverlayContentPathBindings3 instanceof Map)) {
                        if (objOverlayContentPathBindings3 instanceof Number) {
                            c22673i2 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(Map.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls8))) {
                                objOverlayContentPathBindings3 = (Map) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls7))) {
                                objOverlayContentPathBindings3 = (Map) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings3 = (Map) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings3 = (Map) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings3 = (Map) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings3 = (Map) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                            } else {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else if (objOverlayContentPathBindings3 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c8 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer8 = StringSerializer.INSTANCE;
                            objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer8, stringSerializer8), jsonPrimitiveM1841c8);
                            if (objOverlayContentPathBindings3 == null) {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else {
                            objOverlayContentPathBindings3 = null;
                        }
                    }
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = bindings;
                    }
                }
            }
        } else if (objOverlayContentPathBindings3 != null) {
            objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(r1, "bindings", accumulatedState, objOverlayContentPathBindings3, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$11
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                    return invoke((Map<String, ? extends String>) obj8);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Map<String, ? extends String> v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer9 = StringSerializer.INSTANCE;
                        LinkedHashMapSerializer linkedHashMapSerializer = new LinkedHashMapSerializer(stringSerializer9, stringSerializer9);
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, v13, linkedHashMapSerializer);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$12
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Map<String, ? extends String> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer9 = StringSerializer.INSTANCE;
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer9, stringSerializer9), json);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            });
        }
        Map map8 = (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "bindings", accumulatedState, objOverlayContentPathBindings3, "bindings", new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$13
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                return invoke((Map<String, ? extends String>) obj8);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Map<String, ? extends String> map9) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    StringSerializer stringSerializer9 = StringSerializer.INSTANCE;
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new LinkedHashMapSerializer(stringSerializer9, stringSerializer9));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, map9, interfaceC37138cM122336d);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$14
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends String> invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    StringSerializer stringSerializer9 = StringSerializer.INSTANCE;
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer9, stringSerializer9), json);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$15
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends java.lang.String>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends String> invoke(Object obj8) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj8);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement9 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer9 = StringSerializer.INSTANCE;
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer9, stringSerializer9), jsonElement9);
                    } catch (Exception unused11) {
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
                    JsonPrimitive jsonPrimitiveM1841c9 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer10 = StringSerializer.INSTANCE;
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer10, stringSerializer10), jsonPrimitiveM1841c9);
                    } catch (Exception unused12) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(Map.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (Map) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                    return (Map) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                    return (Map) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                    return (Map) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                    return (Map) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (Map) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        aggregateBindings = designModelWrapper.getAggregateBindings();
        if (aggregateBindings == null) {
            objOverlayContentPathBindings4 = null;
        } else {
            if (aggregateBindings instanceof WithGeneratedBindings) {
                withGeneratedBindingsBind6 = ((WithGeneratedBindings) aggregateBindings).bind(accumulatedState);
                if (!(withGeneratedBindingsBind6 instanceof Map)) {
                    withGeneratedBindingsBind6 = null;
                }
                map4 = (Map) withGeneratedBindingsBind6;
                if (map4 == null) {
                    map4 = aggregateBindings;
                }
            } else if (aggregateBindings instanceof List) {
                Iterable iterable8 = (Iterable) aggregateBindings;
                arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable8, 10));
                while (r2.hasNext()) {
                    if (obj6 instanceof WithGeneratedBindings) {
                        withGeneratedBindings3 = (WithGeneratedBindings) obj6;
                    } else {
                        withGeneratedBindings3 = null;
                    }
                    if (withGeneratedBindings3 == null) {
                    }
                    arrayList3.add(obj6);
                }
                map4 = (Map) arrayList3;
            } else {
                map4 = aggregateBindings;
            }
            objOverlayContentPathBindings4 = map4;
        }
        if (r1 != 0) {
            strResolveContentBindingKey3 = BindingLoggerKt.resolveContentBindingKey(r1, "aggregateBindings");
        } else {
            strResolveContentBindingKey3 = null;
        }
        if (strResolveContentBindingKey3 != null) {
            objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
            if (objResolveStateRef2 != null) {
                BindingLoggerKt.logContentBinding("aggregateBindings", strResolveContentBindingKey3, objResolveStateRef2);
                objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                if (!(objUnwrapForCoercion3 instanceof String)) {
                    objOverlayContentPathBindings4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (objOverlayContentPathBindings4 == null) {
                        cls = cls3;
                    } else {
                        if (objOverlayContentPathBindings4 instanceof JsonElement) {
                            JsonElement jsonElement9 = (JsonElement) objOverlayContentPathBindings4;
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement9);
                        } else {
                            if (!(objOverlayContentPathBindings4 instanceof Map)) {
                                if (objOverlayContentPathBindings4 instanceof Number) {
                                    c22673i1 = AbstractC22671h0.f89337a;
                                    orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(Map.class);
                                    if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls8))) {
                                        objOverlayContentPathBindings4 = (Map) Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls7))) {
                                        objOverlayContentPathBindings4 = (Map) Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                        objOverlayContentPathBindings4 = (Map) Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                        objOverlayContentPathBindings4 = (Map) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                        objOverlayContentPathBindings4 = (Map) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                                    } else {
                                        cls = cls3;
                                        if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                            objOverlayContentPathBindings4 = (Map) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                                        }
                                    }
                                } else {
                                    cls = cls3;
                                    if (objOverlayContentPathBindings4 instanceof String) {
                                        JsonPrimitive jsonPrimitiveM1841c9 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings4);
                                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                                        objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c9);
                                        if (objOverlayContentPathBindings4 == null) {
                                        }
                                    }
                                }
                            }
                            if (objOverlayContentPathBindings4 == null) {
                                objOverlayContentPathBindings4 = aggregateBindings;
                            }
                        }
                        cls = cls3;
                        if (objOverlayContentPathBindings4 == null) {
                            objOverlayContentPathBindings4 = aggregateBindings;
                        }
                    }
                    objOverlayContentPathBindings4 = null;
                    if (objOverlayContentPathBindings4 == null) {
                        objOverlayContentPathBindings4 = aggregateBindings;
                    }
                } else {
                    objOverlayContentPathBindings4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (objOverlayContentPathBindings4 == null) {
                        cls = cls3;
                    } else {
                        if (objOverlayContentPathBindings4 instanceof JsonElement) {
                            JsonElement jsonElement10 = (JsonElement) objOverlayContentPathBindings4;
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement10);
                        } else {
                            if (!(objOverlayContentPathBindings4 instanceof Map)) {
                                if (objOverlayContentPathBindings4 instanceof Number) {
                                    c22673i1 = AbstractC22671h0.f89337a;
                                    orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(Map.class);
                                    if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls8))) {
                                        objOverlayContentPathBindings4 = (Map) Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls7))) {
                                        objOverlayContentPathBindings4 = (Map) Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                        objOverlayContentPathBindings4 = (Map) Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                        objOverlayContentPathBindings4 = (Map) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                        objOverlayContentPathBindings4 = (Map) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                                    } else {
                                        cls = cls3;
                                        if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                            objOverlayContentPathBindings4 = (Map) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                                        }
                                    }
                                } else {
                                    cls = cls3;
                                    if (objOverlayContentPathBindings4 instanceof String) {
                                        JsonPrimitive jsonPrimitiveM1841c10 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings4);
                                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                                        objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c10);
                                        if (objOverlayContentPathBindings4 == null) {
                                        }
                                    }
                                }
                            }
                            if (objOverlayContentPathBindings4 == null) {
                                objOverlayContentPathBindings4 = aggregateBindings;
                            }
                        }
                        cls = cls3;
                        if (objOverlayContentPathBindings4 == null) {
                            objOverlayContentPathBindings4 = aggregateBindings;
                        }
                    }
                    objOverlayContentPathBindings4 = null;
                    if (objOverlayContentPathBindings4 == null) {
                        objOverlayContentPathBindings4 = aggregateBindings;
                    }
                }
            } else {
                cls = cls3;
            }
        } else {
            cls = cls3;
            if (objOverlayContentPathBindings4 != null) {
                objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(r1, "aggregateBindings", accumulatedState, objOverlayContentPathBindings4, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$16
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                        return invoke((Map<String, ? extends AggregateBinding>) obj8);
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
                        } catch (Exception unused11) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$17
                    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Map<String, ? extends AggregateBinding> invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), json);
                        } catch (Exception unused11) {
                            return null;
                        }
                    }
                });
            }
        }
        cls2 = cls;
        Map map9 = (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "aggregateBindings", accumulatedState, objOverlayContentPathBindings4, "aggregateBindings", new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$18
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                return invoke((Map<String, ? extends AggregateBinding>) obj8);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Map<String, ? extends AggregateBinding> map10) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, map10, interfaceC37138cM122336d);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$19
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends AggregateBinding> invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), json);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$20
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends AggregateBinding> invoke(Object obj8) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj8);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement11 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement11);
                    } catch (Exception unused11) {
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
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c11);
                    } catch (Exception unused12) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(Map.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (Map) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                    return (Map) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                    return (Map) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                    return (Map) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                    return (Map) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (Map) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        primaryAnalyticEventBindings = designModelWrapper.getPrimaryAnalyticEventBindings();
        if (primaryAnalyticEventBindings == null) {
            obj2 = null;
        } else {
            if (primaryAnalyticEventBindings instanceof WithGeneratedBindings) {
                withGeneratedBindingsBind8 = ((WithGeneratedBindings) primaryAnalyticEventBindings).bind(accumulatedState);
                if (!(withGeneratedBindingsBind8 instanceof Map)) {
                    withGeneratedBindingsBind8 = null;
                }
                map5 = (Map) withGeneratedBindingsBind8;
                if (map5 == null) {
                    map5 = primaryAnalyticEventBindings;
                }
            } else if (primaryAnalyticEventBindings instanceof List) {
                Iterable iterable9 = (Iterable) primaryAnalyticEventBindings;
                arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable9, 10));
                while (r2.hasNext()) {
                    if (obj7 instanceof WithGeneratedBindings) {
                        withGeneratedBindings4 = (WithGeneratedBindings) obj7;
                    } else {
                        withGeneratedBindings4 = null;
                    }
                    if (withGeneratedBindings4 == null) {
                    }
                    arrayList4.add(obj7);
                }
                map5 = (Map) arrayList4;
            } else {
                map5 = primaryAnalyticEventBindings;
            }
            obj2 = map5;
        }
        if (r1 != 0) {
            strResolveContentBindingKey4 = BindingLoggerKt.resolveContentBindingKey(r1, "primaryAnalyticEventBindings");
        } else {
            strResolveContentBindingKey4 = null;
        }
        if (strResolveContentBindingKey4 != null) {
            objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey4, accumulatedState);
            if (objResolveStateRef != null) {
                BindingLoggerKt.logContentBinding("primaryAnalyticEventBindings", strResolveContentBindingKey4, objResolveStateRef);
                objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                if (!(objUnwrapForCoercion instanceof String)) {
                    objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (objUnwrapForCoercion2 == null) {
                        objOverlayContentPathBindings5 = null;
                    } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                        JsonElement jsonElement11 = (JsonElement) objUnwrapForCoercion2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer9 = StringSerializer.INSTANCE;
                        objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer9, stringSerializer9), jsonElement11);
                    } else if (objUnwrapForCoercion2 instanceof Map) {
                        if (objUnwrapForCoercion2 instanceof Number) {
                            c22673i0 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls8))) {
                                objOverlayContentPathBindings5 = (Map) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls7))) {
                                objOverlayContentPathBindings5 = (Map) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings5 = (Map) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings5 = (Map) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings5 = (Map) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings5 = (Map) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                            }
                        } else if (objUnwrapForCoercion2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c11 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer10 = StringSerializer.INSTANCE;
                            objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer10, stringSerializer10), jsonPrimitiveM1841c11);
                            if (objUnwrapForCoercion2 != null) {
                                objOverlayContentPathBindings5 = objUnwrapForCoercion2;
                            }
                        }
                        objOverlayContentPathBindings5 = null;
                    } else {
                        objOverlayContentPathBindings5 = objUnwrapForCoercion2;
                    }
                    if (objOverlayContentPathBindings5 == null) {
                        obj2 = primaryAnalyticEventBindings;
                    } else {
                        obj2 = objOverlayContentPathBindings5;
                    }
                } else {
                    objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (objUnwrapForCoercion2 == null) {
                        objOverlayContentPathBindings5 = null;
                    } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                        JsonElement jsonElement12 = (JsonElement) objUnwrapForCoercion2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer11 = StringSerializer.INSTANCE;
                        objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer11, stringSerializer11), jsonElement12);
                    } else if (objUnwrapForCoercion2 instanceof Map) {
                        if (objUnwrapForCoercion2 instanceof Number) {
                            c22673i0 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls8))) {
                                objOverlayContentPathBindings5 = (Map) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls7))) {
                                objOverlayContentPathBindings5 = (Map) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings5 = (Map) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings5 = (Map) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings5 = (Map) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings5 = (Map) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                            }
                        } else if (objUnwrapForCoercion2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c12 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer12 = StringSerializer.INSTANCE;
                            objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer12, stringSerializer12), jsonPrimitiveM1841c12);
                            if (objUnwrapForCoercion2 != null) {
                                objOverlayContentPathBindings5 = objUnwrapForCoercion2;
                            }
                        }
                        objOverlayContentPathBindings5 = null;
                    } else {
                        objOverlayContentPathBindings5 = objUnwrapForCoercion2;
                    }
                    if (objOverlayContentPathBindings5 == null) {
                        obj2 = primaryAnalyticEventBindings;
                    } else {
                        obj2 = objOverlayContentPathBindings5;
                    }
                }
            }
        } else if (obj2 != null) {
            objOverlayContentPathBindings5 = ContentPathBindingsKt.overlayContentPathBindings(r1, "primaryAnalyticEventBindings", accumulatedState, obj2, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$21
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                    return invoke((Map<String, ? extends String>) obj8);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Map<String, ? extends String> v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer13 = StringSerializer.INSTANCE;
                        LinkedHashMapSerializer linkedHashMapSerializer = new LinkedHashMapSerializer(stringSerializer13, stringSerializer13);
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, v13, linkedHashMapSerializer);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$22
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Map<String, ? extends String> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer13 = StringSerializer.INSTANCE;
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer13, stringSerializer13), json);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            });
            obj2 = objOverlayContentPathBindings5;
        }
        return (DesignModelWrapper) ContentBindingResolverKt.copyBindingsFrom(new DesignModelWrapper(designSystemModel2, analyticEventModel2, map8, map9, (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "primaryAnalyticEventBindings", accumulatedState, obj2, "primaryAnalyticEventBindings", new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$23
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                return invoke((Map<String, ? extends String>) obj8);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Map<String, ? extends String> map10) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    StringSerializer stringSerializer13 = StringSerializer.INSTANCE;
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new LinkedHashMapSerializer(stringSerializer13, stringSerializer13));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, map10, interfaceC37138cM122336d);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$24
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends String> invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    StringSerializer stringSerializer13 = StringSerializer.INSTANCE;
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer13, stringSerializer13), json);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.DesignModelWrapperStateBindingKt$generatedBind$$inlined$resolveBinding$25
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends java.lang.String>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends String> invoke(Object obj8) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj8);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement13 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer13 = StringSerializer.INSTANCE;
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer13, stringSerializer13), jsonElement13);
                    } catch (Exception unused11) {
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
                    JsonPrimitive jsonPrimitiveM1841c13 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer14 = StringSerializer.INSTANCE;
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer14, stringSerializer14), jsonPrimitiveM1841c13);
                    } catch (Exception unused12) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(Map.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (Map) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                    return (Map) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                    return (Map) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                    return (Map) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                    return (Map) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (Map) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        })), designModelWrapper);
    }

    public static /* synthetic */ DesignModelWrapper generatedBind$default(DesignModelWrapper designModelWrapper, Map map, Map map2, Map map3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map2 = null;
        }
        return generatedBind(designModelWrapper, map, map2, map3);
    }
}
