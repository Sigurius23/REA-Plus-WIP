package com.whoop.design.models.items.heightweight;

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
import com.whoop.design.models.items.heightpicker.HeightPickerModel;
import com.whoop.design.models.items.weightpicker.WeightPickerModel;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
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
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003¨\u0006\t"}, m65681d2 = {"generatedBind", "Lcom/whoop/design/models/items/heightweight/HeightWeightModel;", "contentBinding", "", "", "aggregateBindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "accumulatedState", "", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class HeightWeightModelStateBindingKt {
    /* JADX WARN: Code duplicated, block: B:102:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:105:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:111:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:113:0x0200  */
    /* JADX WARN: Code duplicated, block: B:116:0x0218  */
    /* JADX WARN: Code duplicated, block: B:118:0x0220  */
    /* JADX WARN: Code duplicated, block: B:119:0x0224  */
    /* JADX WARN: Code duplicated, block: B:127:0x0237  */
    /* JADX WARN: Code duplicated, block: B:131:0x023d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0242  */
    /* JADX WARN: Code duplicated, block: B:134:0x0245  */
    /* JADX WARN: Code duplicated, block: B:136:0x024b  */
    /* JADX WARN: Code duplicated, block: B:143:0x026d  */
    /* JADX WARN: Code duplicated, block: B:145:0x0273  */
    /* JADX WARN: Code duplicated, block: B:146:0x0276  */
    /* JADX WARN: Code duplicated, block: B:148:0x027a  */
    /* JADX WARN: Code duplicated, block: B:151:0x0295  */
    /* JADX WARN: Code duplicated, block: B:154:0x029b  */
    /* JADX WARN: Code duplicated, block: B:156:0x029f  */
    /* JADX WARN: Code duplicated, block: B:158:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:159:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:161:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:162:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:165:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:167:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:168:0x0305  */
    /* JADX WARN: Code duplicated, block: B:170:0x030f  */
    /* JADX WARN: Code duplicated, block: B:171:0x031c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0326  */
    /* JADX WARN: Code duplicated, block: B:174:0x0333  */
    /* JADX WARN: Code duplicated, block: B:176:0x0337  */
    /* JADX WARN: Code duplicated, block: B:182:0x035a  */
    /* JADX WARN: Code duplicated, block: B:183:0x035c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:185:0x035f  */
    /* JADX WARN: Code duplicated, block: B:188:0x0381  */
    /* JADX WARN: Code duplicated, block: B:189:0x0383  */
    /* JADX WARN: Code duplicated, block: B:191:0x0387  */
    /* JADX WARN: Code duplicated, block: B:193:0x0392  */
    /* JADX WARN: Code duplicated, block: B:197:0x0398  */
    /* JADX WARN: Code duplicated, block: B:199:0x039c  */
    /* JADX WARN: Code duplicated, block: B:202:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:204:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:205:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:213:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:217:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:218:0x03de  */
    /* JADX WARN: Code duplicated, block: B:220:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:222:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:229:0x0409  */
    /* JADX WARN: Code duplicated, block: B:231:0x040f  */
    /* JADX WARN: Code duplicated, block: B:232:0x0412  */
    /* JADX WARN: Code duplicated, block: B:234:0x0416  */
    /* JADX WARN: Code duplicated, block: B:237:0x0431  */
    /* JADX WARN: Code duplicated, block: B:240:0x0437  */
    /* JADX WARN: Code duplicated, block: B:242:0x043b  */
    /* JADX WARN: Code duplicated, block: B:244:0x044d  */
    /* JADX WARN: Code duplicated, block: B:245:0x045b  */
    /* JADX WARN: Code duplicated, block: B:247:0x0465  */
    /* JADX WARN: Code duplicated, block: B:248:0x0473  */
    /* JADX WARN: Code duplicated, block: B:250:0x047d  */
    /* JADX WARN: Code duplicated, block: B:251:0x048a  */
    /* JADX WARN: Code duplicated, block: B:253:0x0494  */
    /* JADX WARN: Code duplicated, block: B:254:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:256:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:257:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:259:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:260:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:262:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:268:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:269:0x04f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:271:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:274:0x051d  */
    /* JADX WARN: Code duplicated, block: B:275:0x051f  */
    /* JADX WARN: Code duplicated, block: B:277:0x0523  */
    /* JADX WARN: Code duplicated, block: B:279:0x052e  */
    /* JADX WARN: Code duplicated, block: B:283:0x0534  */
    /* JADX WARN: Code duplicated, block: B:285:0x0538  */
    /* JADX WARN: Code duplicated, block: B:288:0x0550  */
    /* JADX WARN: Code duplicated, block: B:290:0x0558  */
    /* JADX WARN: Code duplicated, block: B:291:0x055c  */
    /* JADX WARN: Code duplicated, block: B:299:0x056f  */
    /* JADX WARN: Code duplicated, block: B:303:0x0575  */
    /* JADX WARN: Code duplicated, block: B:304:0x057a  */
    /* JADX WARN: Code duplicated, block: B:307:0x057f  */
    /* JADX WARN: Code duplicated, block: B:309:0x0585  */
    /* JADX WARN: Code duplicated, block: B:316:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:318:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:319:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:321:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:324:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:327:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:329:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:331:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:332:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:334:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:335:0x0609  */
    /* JADX WARN: Code duplicated, block: B:337:0x0613  */
    /* JADX WARN: Code duplicated, block: B:338:0x0620  */
    /* JADX WARN: Code duplicated, block: B:340:0x062a  */
    /* JADX WARN: Code duplicated, block: B:341:0x0637  */
    /* JADX WARN: Code duplicated, block: B:343:0x0641  */
    /* JADX WARN: Code duplicated, block: B:344:0x064e  */
    /* JADX WARN: Code duplicated, block: B:346:0x0658  */
    /* JADX WARN: Code duplicated, block: B:347:0x0665 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:348:0x0667  */
    /* JADX WARN: Code duplicated, block: B:354:0x0684  */
    /* JADX WARN: Code duplicated, block: B:355:0x0686 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:357:0x0689  */
    /* JADX WARN: Code duplicated, block: B:360:0x06af  */
    /* JADX WARN: Code duplicated, block: B:361:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:363:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:365:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:369:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:371:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:374:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:376:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:377:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:385:0x0701  */
    /* JADX WARN: Code duplicated, block: B:389:0x0707  */
    /* JADX WARN: Code duplicated, block: B:390:0x070c  */
    /* JADX WARN: Code duplicated, block: B:392:0x070f  */
    /* JADX WARN: Code duplicated, block: B:394:0x0715  */
    /* JADX WARN: Code duplicated, block: B:401:0x0737  */
    /* JADX WARN: Code duplicated, block: B:403:0x073d  */
    /* JADX WARN: Code duplicated, block: B:404:0x0740  */
    /* JADX WARN: Code duplicated, block: B:406:0x0744  */
    /* JADX WARN: Code duplicated, block: B:409:0x0759  */
    /* JADX WARN: Code duplicated, block: B:411:0x075d A[PHI: r0
      0x075d: PHI (r0v28 java.lang.Object) = (r0v6 java.lang.Object), (r0v10 java.lang.Object) binds: [B:410:0x075b, B:437:0x0819] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:412:0x0760  */
    /* JADX WARN: Code duplicated, block: B:414:0x0764  */
    /* JADX WARN: Code duplicated, block: B:416:0x0774  */
    /* JADX WARN: Code duplicated, block: B:417:0x0783  */
    /* JADX WARN: Code duplicated, block: B:419:0x078d  */
    /* JADX WARN: Code duplicated, block: B:420:0x079c  */
    /* JADX WARN: Code duplicated, block: B:422:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:423:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:425:0x07be  */
    /* JADX WARN: Code duplicated, block: B:426:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:428:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:429:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:431:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:432:0x07fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:433:0x0800  */
    /* JADX WARN: Code duplicated, block: B:440:0x081f  */
    /* JADX WARN: Code duplicated, block: B:441:0x0821 A[PHI: r10
      0x0821: PHI (r10v2 java.lang.Object) = (r10v1 java.lang.Object), (r10v17 java.lang.Object) binds: [B:444:0x0826, B:439:0x081d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:442:0x0823 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:444:0x0826  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d9  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final HeightWeightModel generatedBind(HeightWeightModel heightWeightModel, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, ? extends Object> accumulatedState) {
        Object objOverlayContentPathBindings;
        WithGeneratedBindings withGeneratedBindingsBind;
        List<SegmentedControlDisplayModel> segmentedControl;
        Object heightPicker;
        ArrayList arrayList;
        Object obj;
        WithGeneratedBindings withGeneratedBindings;
        WithGeneratedBindings withGeneratedBindingsBind2;
        Object objOverlayContentPathBindings2;
        Object objBind;
        String strResolveContentBindingKey;
        Object weightPicker;
        ArrayList arrayList2;
        Object obj2;
        WithGeneratedBindings withGeneratedBindings2;
        WithGeneratedBindings withGeneratedBindingsBind3;
        Object objOverlayContentPathBindings3;
        Object objBind2;
        String strResolveContentBindingKey2;
        Object stateUpdateUnitKey;
        ArrayList arrayList3;
        Object obj3;
        WithGeneratedBindings withGeneratedBindings3;
        WithGeneratedBindings withGeneratedBindingsBind4;
        Object objOverlayContentPathBindings4;
        Object objBind3;
        String strResolveContentBindingKey3;
        Object unitType;
        ArrayList arrayList4;
        Object obj4;
        WithGeneratedBindings withGeneratedBindings4;
        WithGeneratedBindings withGeneratedBindingsBind5;
        Object obj5;
        Object objBind4;
        String strResolveContentBindingKey4;
        Object objOverlayContentPathBindings5;
        Object objResolveStateRef;
        Object objUnwrapForCoercion;
        Object objUnwrapForCoercion2;
        boolean z4;
        C22673i0 c22673i0;
        InterfaceC21461d orCreateKotlinClass;
        Object objResolveStateRef2;
        Object objUnwrapForCoercion3;
        boolean z13;
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
        AbstractC22676k.m65750j(heightWeightModel, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if ((map == null || map.isEmpty()) && ((map2 == null || map2.isEmpty()) && accumulatedState.isEmpty())) {
            return heightWeightModel;
        }
        List<SegmentedControlDisplayModel> segmentedControl2 = heightWeightModel.getSegmentedControl();
        if (segmentedControl2 == null) {
            objOverlayContentPathBindings = null;
        } else if (segmentedControl2 instanceof WithGeneratedBindings) {
            WithGeneratedBindings withGeneratedBindingsBind6 = ((WithGeneratedBindings) segmentedControl2).bind(accumulatedState);
            if (!(withGeneratedBindingsBind6 instanceof List)) {
                withGeneratedBindingsBind6 = null;
            }
            objOverlayContentPathBindings = (List) withGeneratedBindingsBind6;
            if (objOverlayContentPathBindings == null) {
                objOverlayContentPathBindings = segmentedControl2;
            }
        } else {
            List<SegmentedControlDisplayModel> list = segmentedControl2;
            ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (Object obj6 : list) {
                WithGeneratedBindings withGeneratedBindings5 = obj6 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj6 : null;
                if (withGeneratedBindings5 != null && (withGeneratedBindingsBind = withGeneratedBindings5.bind(accumulatedState)) != null) {
                    obj6 = withGeneratedBindingsBind;
                }
                arrayList5.add(obj6);
            }
            objOverlayContentPathBindings = arrayList5;
        }
        String strResolveContentBindingKey5 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "segmentedControl") : null;
        Class cls = Byte.TYPE;
        Class cls2 = Short.TYPE;
        Class cls3 = Float.TYPE;
        Class cls4 = Double.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        if (strResolveContentBindingKey5 != null) {
            Object objResolveStateRef5 = StateLookupKt.resolveStateRef(strResolveContentBindingKey5, accumulatedState);
            if (objResolveStateRef5 != null) {
                BindingLoggerKt.logContentBinding("segmentedControl", strResolveContentBindingKey5, objResolveStateRef5);
                Object objUnwrapForCoercion6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                if ((objUnwrapForCoercion6 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion6) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                    objOverlayContentPathBindings = null;
                } else {
                    objOverlayContentPathBindings = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                    if (objOverlayContentPathBindings == null) {
                        objOverlayContentPathBindings = null;
                    } else if (objOverlayContentPathBindings instanceof JsonElement) {
                        JsonElement jsonElement = (JsonElement) objOverlayContentPathBindings;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SegmentedControlDisplayModel.INSTANCE.serializer()), jsonElement);
                        } catch (Exception unused) {
                            objOverlayContentPathBindings = null;
                        }
                    } else if (!(objOverlayContentPathBindings instanceof List)) {
                        if (objOverlayContentPathBindings instanceof Number) {
                            C22673i0 c22673i4 = AbstractC22671h0.f89337a;
                            InterfaceC21461d orCreateKotlinClass5 = c22673i4.getOrCreateKotlinClass(List.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings = (List) Integer.valueOf(((Number) objOverlayContentPathBindings).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings = (List) Long.valueOf(((Number) objOverlayContentPathBindings).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings = (List) Double.valueOf(((Number) objOverlayContentPathBindings).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings = (List) Float.valueOf(((Number) objOverlayContentPathBindings).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings = (List) Short.valueOf(((Number) objOverlayContentPathBindings).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings = (List) Byte.valueOf(((Number) objOverlayContentPathBindings).byteValue());
                            } else {
                                objOverlayContentPathBindings = null;
                            }
                        } else if (objOverlayContentPathBindings instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c = AbstractC0770m.m1841c((String) objOverlayContentPathBindings);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SegmentedControlDisplayModel.INSTANCE.serializer()), jsonPrimitiveM1841c);
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
                        objOverlayContentPathBindings = segmentedControl2;
                    }
                }
            }
            segmentedControl = (List) DotPathBindingsKt.overlayAggregateBinding(map2, "segmentedControl", accumulatedState, objOverlayContentPathBindings, "segmentedControl", new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$3
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                    return invoke((List<? extends SegmentedControlDisplayModel>) obj7);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(List<? extends SegmentedControlDisplayModel> list2) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new ArrayListSerializer(SegmentedControlDisplayModel.INSTANCE.serializer()));
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, list2, interfaceC37138cM122336d);
                    } catch (Exception unused3) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$4
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.items.heightweight.SegmentedControlDisplayModel>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final List<? extends SegmentedControlDisplayModel> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SegmentedControlDisplayModel.INSTANCE.serializer()), json);
                    } catch (Exception unused3) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$5
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<? extends com.whoop.design.models.items.heightweight.SegmentedControlDisplayModel>] */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.items.heightweight.SegmentedControlDisplayModel>] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.items.heightweight.SegmentedControlDisplayModel>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final List<? extends SegmentedControlDisplayModel> invoke(Object obj7) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj7);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement2 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SegmentedControlDisplayModel.INSTANCE.serializer()), jsonElement2);
                        } catch (Exception unused3) {
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
                        JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SegmentedControlDisplayModel.INSTANCE.serializer()), jsonPrimitiveM1841c2);
                        } catch (Exception unused4) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(List.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (List) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                        return (List) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                        return (List) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                        return (List) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                        return (List) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (List) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            });
            if (segmentedControl == null) {
                segmentedControl = heightWeightModel.getSegmentedControl();
            }
            List<SegmentedControlDisplayModel> list2 = segmentedControl;
            heightPicker = heightWeightModel.getHeightPicker();
            if (heightPicker == null) {
                objOverlayContentPathBindings2 = null;
            } else {
                if (heightPicker instanceof WithGeneratedBindings) {
                    objBind = ((WithGeneratedBindings) heightPicker).bind(accumulatedState);
                    if (!(objBind instanceof HeightPickerModel)) {
                        objBind = null;
                    }
                    obj = (HeightPickerModel) objBind;
                    if (obj == null) {
                        obj = heightPicker;
                    }
                } else if (heightPicker instanceof List) {
                    Iterable iterable = (Iterable) heightPicker;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
                    for (Object obj7 : iterable) {
                        if (obj7 instanceof WithGeneratedBindings) {
                            withGeneratedBindings = (WithGeneratedBindings) obj7;
                        } else {
                            withGeneratedBindings = null;
                        }
                        if (withGeneratedBindings == null && (withGeneratedBindingsBind2 = withGeneratedBindings.bind(accumulatedState)) != null) {
                            obj7 = withGeneratedBindingsBind2;
                        }
                        arrayList.add(obj7);
                    }
                    obj = (HeightPickerModel) arrayList;
                } else {
                    obj = heightPicker;
                }
                objOverlayContentPathBindings2 = obj;
            }
            if (r1 != 0) {
                strResolveContentBindingKey = BindingLoggerKt.resolveContentBindingKey(map, "heightPicker");
            } else {
                strResolveContentBindingKey = null;
            }
            if (strResolveContentBindingKey != null) {
                objResolveStateRef4 = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
                if (objResolveStateRef4 != null) {
                    BindingLoggerKt.logContentBinding("heightPicker", strResolveContentBindingKey, objResolveStateRef4);
                    objUnwrapForCoercion5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                    if (!(objUnwrapForCoercion5 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion5) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                        objOverlayContentPathBindings2 = null;
                    } else {
                        objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                        if (objOverlayContentPathBindings2 == null) {
                            objOverlayContentPathBindings2 = null;
                        } else if (objOverlayContentPathBindings2 instanceof JsonElement) {
                            JsonElement jsonElement2 = (JsonElement) objOverlayContentPathBindings2;
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(HeightPickerModel.INSTANCE.serializer(), jsonElement2);
                            } catch (Exception unused3) {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (!(objOverlayContentPathBindings2 instanceof HeightPickerModel)) {
                            if (objOverlayContentPathBindings2 instanceof Number) {
                                c22673i3 = AbstractC22671h0.f89337a;
                                orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(HeightPickerModel.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings2 = (HeightPickerModel) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings2 = (HeightPickerModel) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings2 = (HeightPickerModel) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings2 = (HeightPickerModel) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls2))) {
                                    objOverlayContentPathBindings2 = (HeightPickerModel) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls))) {
                                    objOverlayContentPathBindings2 = (HeightPickerModel) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                                } else {
                                    objOverlayContentPathBindings2 = null;
                                }
                            } else if (objOverlayContentPathBindings2 instanceof String) {
                                JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(HeightPickerModel.INSTANCE.serializer(), jsonPrimitiveM1841c2);
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
                            objOverlayContentPathBindings2 = heightPicker;
                        }
                    }
                }
            } else if (objOverlayContentPathBindings2 != null) {
                objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(r1, "heightPicker", accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$6
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                        return invoke((HeightPickerModel) obj8);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(HeightPickerModel v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(HeightPickerModel.INSTANCE.serializer(), v13);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$7
                    /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.items.heightpicker.HeightPickerModel, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final HeightPickerModel invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(HeightPickerModel.INSTANCE.serializer(), json);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                });
            }
            HeightPickerModel heightPickerModel = (HeightPickerModel) DotPathBindingsKt.overlayAggregateBinding(map2, "heightPicker", accumulatedState, objOverlayContentPathBindings2, "heightPicker", new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$8
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                    return invoke((HeightPickerModel) obj8);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(HeightPickerModel heightPickerModel2) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(HeightPickerModel.INSTANCE.serializer());
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, heightPickerModel2, interfaceC37138cM122336d);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$9
                /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.items.heightpicker.HeightPickerModel, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final HeightPickerModel invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(HeightPickerModel.INSTANCE.serializer(), json);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$10
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.items.heightpicker.HeightPickerModel, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.items.heightpicker.HeightPickerModel, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final HeightPickerModel invoke(Object obj8) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj8);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement3 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(HeightPickerModel.INSTANCE.serializer(), jsonElement3);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                    if (UnwrapForCoercion instanceof HeightPickerModel) {
                        return UnwrapForCoercion;
                    }
                    if (!(UnwrapForCoercion instanceof Number)) {
                        if (!(UnwrapForCoercion instanceof String)) {
                            return null;
                        }
                        JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(HeightPickerModel.INSTANCE.serializer(), jsonPrimitiveM1841c3);
                        } catch (Exception unused6) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(HeightPickerModel.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (HeightPickerModel) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                        return (HeightPickerModel) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                        return (HeightPickerModel) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                        return (HeightPickerModel) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                        return (HeightPickerModel) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (HeightPickerModel) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            });
            weightPicker = heightWeightModel.getWeightPicker();
            if (weightPicker == null) {
                objOverlayContentPathBindings3 = null;
            } else {
                if (weightPicker instanceof WithGeneratedBindings) {
                    objBind2 = ((WithGeneratedBindings) weightPicker).bind(accumulatedState);
                    if (!(objBind2 instanceof WeightPickerModel)) {
                        objBind2 = null;
                    }
                    obj2 = (WeightPickerModel) objBind2;
                    if (obj2 == null) {
                        obj2 = weightPicker;
                    }
                } else if (weightPicker instanceof List) {
                    Iterable iterable2 = (Iterable) weightPicker;
                    arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
                    for (Object obj8 : iterable2) {
                        if (obj8 instanceof WithGeneratedBindings) {
                            withGeneratedBindings2 = (WithGeneratedBindings) obj8;
                        } else {
                            withGeneratedBindings2 = null;
                        }
                        if (withGeneratedBindings2 == null && (withGeneratedBindingsBind3 = withGeneratedBindings2.bind(accumulatedState)) != null) {
                            obj8 = withGeneratedBindingsBind3;
                        }
                        arrayList2.add(obj8);
                    }
                    obj2 = (WeightPickerModel) arrayList2;
                } else {
                    obj2 = weightPicker;
                }
                objOverlayContentPathBindings3 = obj2;
            }
            if (r1 != 0) {
                strResolveContentBindingKey2 = BindingLoggerKt.resolveContentBindingKey(r1, "weightPicker");
            } else {
                strResolveContentBindingKey2 = null;
            }
            if (strResolveContentBindingKey2 != null) {
                objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
                if (objResolveStateRef3 != null) {
                    BindingLoggerKt.logContentBinding("weightPicker", strResolveContentBindingKey2, objResolveStateRef3);
                    objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                    if (!(objUnwrapForCoercion4 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion4) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                        objOverlayContentPathBindings3 = null;
                    } else {
                        objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                        if (objOverlayContentPathBindings3 == null) {
                            objOverlayContentPathBindings3 = null;
                        } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                            JsonElement jsonElement3 = (JsonElement) objOverlayContentPathBindings3;
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(WeightPickerModel.INSTANCE.serializer(), jsonElement3);
                            } catch (Exception unused5) {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else if (!(objOverlayContentPathBindings3 instanceof WeightPickerModel)) {
                            if (objOverlayContentPathBindings3 instanceof Number) {
                                c22673i2 = AbstractC22671h0.f89337a;
                                orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(WeightPickerModel.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings3 = (WeightPickerModel) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings3 = (WeightPickerModel) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings3 = (WeightPickerModel) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings3 = (WeightPickerModel) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls2))) {
                                    objOverlayContentPathBindings3 = (WeightPickerModel) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls))) {
                                    objOverlayContentPathBindings3 = (WeightPickerModel) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                                } else {
                                    objOverlayContentPathBindings3 = null;
                                }
                            } else if (objOverlayContentPathBindings3 instanceof String) {
                                JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(WeightPickerModel.INSTANCE.serializer(), jsonPrimitiveM1841c3);
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
                            objOverlayContentPathBindings3 = weightPicker;
                        }
                    }
                }
            } else if (objOverlayContentPathBindings3 != null) {
                objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(r1, "weightPicker", accumulatedState, objOverlayContentPathBindings3, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$11
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj9) {
                        return invoke((WeightPickerModel) obj9);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(WeightPickerModel v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(WeightPickerModel.INSTANCE.serializer(), v13);
                        } catch (Exception unused7) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$12
                    /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.items.weightpicker.WeightPickerModel, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final WeightPickerModel invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(WeightPickerModel.INSTANCE.serializer(), json);
                        } catch (Exception unused7) {
                            return null;
                        }
                    }
                });
            }
            WeightPickerModel weightPickerModel = (WeightPickerModel) DotPathBindingsKt.overlayAggregateBinding(map2, "weightPicker", accumulatedState, objOverlayContentPathBindings3, "weightPicker", new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$13
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj9) {
                    return invoke((WeightPickerModel) obj9);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(WeightPickerModel weightPickerModel2) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(WeightPickerModel.INSTANCE.serializer());
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, weightPickerModel2, interfaceC37138cM122336d);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$14
                /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.items.weightpicker.WeightPickerModel, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final WeightPickerModel invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(WeightPickerModel.INSTANCE.serializer(), json);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$15
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.items.weightpicker.WeightPickerModel, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.items.weightpicker.WeightPickerModel, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final WeightPickerModel invoke(Object obj9) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj9);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement4 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(WeightPickerModel.INSTANCE.serializer(), jsonElement4);
                        } catch (Exception unused7) {
                            return null;
                        }
                    }
                    if (UnwrapForCoercion instanceof WeightPickerModel) {
                        return UnwrapForCoercion;
                    }
                    if (!(UnwrapForCoercion instanceof Number)) {
                        if (!(UnwrapForCoercion instanceof String)) {
                            return null;
                        }
                        JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(WeightPickerModel.INSTANCE.serializer(), jsonPrimitiveM1841c4);
                        } catch (Exception unused8) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(WeightPickerModel.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (WeightPickerModel) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                        return (WeightPickerModel) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                        return (WeightPickerModel) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                        return (WeightPickerModel) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                        return (WeightPickerModel) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (WeightPickerModel) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            });
            stateUpdateUnitKey = heightWeightModel.getStateUpdateUnitKey();
            if (stateUpdateUnitKey == null) {
                objOverlayContentPathBindings4 = null;
            } else {
                if (stateUpdateUnitKey instanceof WithGeneratedBindings) {
                    objBind3 = ((WithGeneratedBindings) stateUpdateUnitKey).bind(accumulatedState);
                    if (!(objBind3 instanceof String)) {
                        objBind3 = null;
                    }
                    obj3 = (String) objBind3;
                    if (obj3 == null) {
                        obj3 = stateUpdateUnitKey;
                    }
                } else if (stateUpdateUnitKey instanceof List) {
                    Iterable iterable3 = (Iterable) stateUpdateUnitKey;
                    arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable3, 10));
                    for (Object obj9 : iterable3) {
                        if (obj9 instanceof WithGeneratedBindings) {
                            withGeneratedBindings3 = (WithGeneratedBindings) obj9;
                        } else {
                            withGeneratedBindings3 = null;
                        }
                        if (withGeneratedBindings3 == null && (withGeneratedBindingsBind4 = withGeneratedBindings3.bind(accumulatedState)) != null) {
                            obj9 = withGeneratedBindingsBind4;
                        }
                        arrayList3.add(obj9);
                    }
                    obj3 = (String) arrayList3;
                } else {
                    obj3 = stateUpdateUnitKey;
                }
                objOverlayContentPathBindings4 = obj3;
            }
            if (r1 != 0) {
                strResolveContentBindingKey3 = BindingLoggerKt.resolveContentBindingKey(r1, "stateUpdateUnitKey");
            } else {
                strResolveContentBindingKey3 = null;
            }
            if (strResolveContentBindingKey3 != null) {
                objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
                if (objResolveStateRef2 != null) {
                    BindingLoggerKt.logContentBinding("stateUpdateUnitKey", strResolveContentBindingKey3, objResolveStateRef2);
                    objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (!(objUnwrapForCoercion3 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion3) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                        objOverlayContentPathBindings4 = null;
                    } else {
                        objOverlayContentPathBindings4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
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
                            z13 = objOverlayContentPathBindings4 instanceof String;
                            if (!z13) {
                                if (objOverlayContentPathBindings4 instanceof Number) {
                                    c22673i1 = AbstractC22671h0.f89337a;
                                    orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(String.class);
                                    if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                        objOverlayContentPathBindings4 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                        objOverlayContentPathBindings4 = (String) Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                        objOverlayContentPathBindings4 = (String) Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls3))) {
                                        objOverlayContentPathBindings4 = (String) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls2))) {
                                        objOverlayContentPathBindings4 = (String) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                        objOverlayContentPathBindings4 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                                    } else {
                                        objOverlayContentPathBindings4 = null;
                                    }
                                } else if (z13) {
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
                            objOverlayContentPathBindings4 = stateUpdateUnitKey;
                        }
                    }
                }
            } else if (objOverlayContentPathBindings4 != null) {
                objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(r1, "stateUpdateUnitKey", accumulatedState, objOverlayContentPathBindings4, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$16
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj10) {
                        return invoke((String) obj10);
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
                }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$17
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
            String str = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "stateUpdateUnitKey", accumulatedState, objOverlayContentPathBindings4, "stateUpdateUnitKey", new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$18
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj10) {
                    return invoke((String) obj10);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(String str2) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, str2, interfaceC37138cM122336d);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$19
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
            }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$20
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
                @Override // p715kotlin.jvm.functions.Function1
                public final String invoke(Object obj10) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj10);
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
                    boolean z14 = UnwrapForCoercion instanceof String;
                    if (z14) {
                        return UnwrapForCoercion;
                    }
                    if (!(UnwrapForCoercion instanceof Number)) {
                        if (!z14) {
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
                    C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(String.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (String) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                        return (String) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                        return (String) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                        return (String) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                        return (String) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (String) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            });
            unitType = heightWeightModel.getUnitType();
            if (unitType == null) {
                obj5 = null;
            } else {
                if (unitType instanceof WithGeneratedBindings) {
                    objBind4 = ((WithGeneratedBindings) unitType).bind(accumulatedState);
                    if (!(objBind4 instanceof String)) {
                        objBind4 = null;
                    }
                    obj4 = (String) objBind4;
                    if (obj4 == null) {
                        obj4 = unitType;
                    }
                } else if (unitType instanceof List) {
                    Iterable iterable4 = (Iterable) unitType;
                    arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable4, 10));
                    for (Object obj10 : iterable4) {
                        if (obj10 instanceof WithGeneratedBindings) {
                            withGeneratedBindings4 = (WithGeneratedBindings) obj10;
                        } else {
                            withGeneratedBindings4 = null;
                        }
                        if (withGeneratedBindings4 == null && (withGeneratedBindingsBind5 = withGeneratedBindings4.bind(accumulatedState)) != null) {
                            obj10 = withGeneratedBindingsBind5;
                        }
                        arrayList4.add(obj10);
                    }
                    obj4 = (String) arrayList4;
                } else {
                    obj4 = unitType;
                }
                obj5 = obj4;
            }
            if (r1 != 0) {
                strResolveContentBindingKey4 = BindingLoggerKt.resolveContentBindingKey(r1, "unitType");
            } else {
                strResolveContentBindingKey4 = null;
            }
            if (strResolveContentBindingKey4 != null) {
                objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey4, accumulatedState);
                if (objResolveStateRef != null) {
                    BindingLoggerKt.logContentBinding("unitType", strResolveContentBindingKey4, objResolveStateRef);
                    objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (!(objUnwrapForCoercion instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                        obj5 = null;
                    } else {
                        objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                        if (objUnwrapForCoercion2 == null) {
                            objOverlayContentPathBindings5 = null;
                        } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                            JsonElement jsonElement5 = (JsonElement) objUnwrapForCoercion2;
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement5);
                            } catch (Exception unused9) {
                                objOverlayContentPathBindings5 = null;
                            }
                        } else {
                            z4 = objUnwrapForCoercion2 instanceof String;
                            if (z4) {
                                objOverlayContentPathBindings5 = objUnwrapForCoercion2;
                            } else {
                                if (objUnwrapForCoercion2 instanceof Number) {
                                    c22673i0 = AbstractC22671h0.f89337a;
                                    orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
                                    if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                        objOverlayContentPathBindings5 = (String) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                        objOverlayContentPathBindings5 = (String) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                        objOverlayContentPathBindings5 = (String) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                                        objOverlayContentPathBindings5 = (String) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                        objOverlayContentPathBindings5 = (String) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
                                        objOverlayContentPathBindings5 = (String) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                                    }
                                } else if (z4) {
                                    JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                                    try {
                                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                                        objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c5);
                                    } catch (Exception unused10) {
                                        objUnwrapForCoercion2 = null;
                                    }
                                    if (objUnwrapForCoercion2 != null) {
                                        objOverlayContentPathBindings5 = objUnwrapForCoercion2;
                                    }
                                }
                                objOverlayContentPathBindings5 = null;
                            }
                        }
                        if (objOverlayContentPathBindings5 == null) {
                            obj5 = unitType;
                        } else {
                            obj5 = objOverlayContentPathBindings5;
                        }
                    }
                }
            } else if (obj5 != null) {
                objOverlayContentPathBindings5 = ContentPathBindingsKt.overlayContentPathBindings(r1, "unitType", accumulatedState, obj5, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$21
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj11) {
                        return invoke((String) obj11);
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
                }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$22
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
                obj5 = objOverlayContentPathBindings5;
            }
            return (HeightWeightModel) ContentBindingResolverKt.copyBindingsFrom(new HeightWeightModel(list2, heightPickerModel, weightPickerModel, str, (String) DotPathBindingsKt.overlayAggregateBinding(map2, "unitType", accumulatedState, obj5, "unitType", new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$23
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj11) {
                    return invoke((String) obj11);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(String str2) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, str2, interfaceC37138cM122336d);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$24
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
            }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$25
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
                @Override // p715kotlin.jvm.functions.Function1
                public final String invoke(Object obj11) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj11);
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
                    boolean z14 = UnwrapForCoercion instanceof String;
                    if (z14) {
                        return UnwrapForCoercion;
                    }
                    if (!(UnwrapForCoercion instanceof Number)) {
                        if (!z14) {
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
                    C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(String.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (String) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                        return (String) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                        return (String) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                        return (String) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                        return (String) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (String) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            })), heightWeightModel);
        }
        if (objOverlayContentPathBindings != null) {
            objOverlayContentPathBindings = ContentPathBindingsKt.overlayContentPathBindings(map, "segmentedControl", accumulatedState, objOverlayContentPathBindings, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$1
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj11) {
                    return invoke((List<? extends SegmentedControlDisplayModel>) obj11);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(List<? extends SegmentedControlDisplayModel> v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        ArrayListSerializer arrayListSerializer = new ArrayListSerializer(SegmentedControlDisplayModel.INSTANCE.serializer());
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, v13, arrayListSerializer);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$2
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.items.heightweight.SegmentedControlDisplayModel>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final List<? extends SegmentedControlDisplayModel> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SegmentedControlDisplayModel.INSTANCE.serializer()), json);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            });
        }
        segmentedControl = (List) DotPathBindingsKt.overlayAggregateBinding(map2, "segmentedControl", accumulatedState, objOverlayContentPathBindings, "segmentedControl", new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$3
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj11) {
                return invoke((List<? extends SegmentedControlDisplayModel>) obj11);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(List<? extends SegmentedControlDisplayModel> list3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new ArrayListSerializer(SegmentedControlDisplayModel.INSTANCE.serializer()));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, list3, interfaceC37138cM122336d);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$4
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.items.heightweight.SegmentedControlDisplayModel>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final List<? extends SegmentedControlDisplayModel> invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SegmentedControlDisplayModel.INSTANCE.serializer()), json);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$5
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<? extends com.whoop.design.models.items.heightweight.SegmentedControlDisplayModel>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.items.heightweight.SegmentedControlDisplayModel>] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.items.heightweight.SegmentedControlDisplayModel>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final List<? extends SegmentedControlDisplayModel> invoke(Object obj11) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj11);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement6 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SegmentedControlDisplayModel.INSTANCE.serializer()), jsonElement6);
                    } catch (Exception unused11) {
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
                    JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(SegmentedControlDisplayModel.INSTANCE.serializer()), jsonPrimitiveM1841c6);
                    } catch (Exception unused12) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(List.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (List) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                    return (List) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                    return (List) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                    return (List) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                    return (List) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (List) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (segmentedControl == null) {
            segmentedControl = heightWeightModel.getSegmentedControl();
        }
        List<SegmentedControlDisplayModel> list3 = segmentedControl;
        heightPicker = heightWeightModel.getHeightPicker();
        if (heightPicker == null) {
            objOverlayContentPathBindings2 = null;
        } else {
            if (heightPicker instanceof WithGeneratedBindings) {
                objBind = ((WithGeneratedBindings) heightPicker).bind(accumulatedState);
                if (!(objBind instanceof HeightPickerModel)) {
                    objBind = null;
                }
                obj = (HeightPickerModel) objBind;
                if (obj == null) {
                    obj = heightPicker;
                }
            } else if (heightPicker instanceof List) {
                Iterable iterable5 = (Iterable) heightPicker;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable5, 10));
                while (r2.hasNext()) {
                    if (obj7 instanceof WithGeneratedBindings) {
                        withGeneratedBindings = (WithGeneratedBindings) obj7;
                    } else {
                        withGeneratedBindings = null;
                    }
                    if (withGeneratedBindings == null) {
                    }
                    arrayList.add(obj7);
                }
                obj = (HeightPickerModel) arrayList;
            } else {
                obj = heightPicker;
            }
            objOverlayContentPathBindings2 = obj;
        }
        if (r1 != 0) {
            strResolveContentBindingKey = BindingLoggerKt.resolveContentBindingKey(map, "heightPicker");
        } else {
            strResolveContentBindingKey = null;
        }
        if (strResolveContentBindingKey != null) {
            objResolveStateRef4 = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
            if (objResolveStateRef4 != null) {
                BindingLoggerKt.logContentBinding("heightPicker", strResolveContentBindingKey, objResolveStateRef4);
                objUnwrapForCoercion5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if (!(objUnwrapForCoercion5 instanceof String)) {
                    objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = null;
                    } else if (objOverlayContentPathBindings2 instanceof JsonElement) {
                        JsonElement jsonElement6 = (JsonElement) objOverlayContentPathBindings2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(HeightPickerModel.INSTANCE.serializer(), jsonElement6);
                    } else if (!(objOverlayContentPathBindings2 instanceof HeightPickerModel)) {
                        if (objOverlayContentPathBindings2 instanceof Number) {
                            c22673i3 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(HeightPickerModel.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings2 = (HeightPickerModel) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings2 = (HeightPickerModel) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings2 = (HeightPickerModel) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings2 = (HeightPickerModel) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings2 = (HeightPickerModel) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings2 = (HeightPickerModel) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                            } else {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (objOverlayContentPathBindings2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(HeightPickerModel.INSTANCE.serializer(), jsonPrimitiveM1841c6);
                            if (objOverlayContentPathBindings2 == null) {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else {
                            objOverlayContentPathBindings2 = null;
                        }
                    }
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = heightPicker;
                    }
                } else {
                    objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = null;
                    } else if (objOverlayContentPathBindings2 instanceof JsonElement) {
                        JsonElement jsonElement7 = (JsonElement) objOverlayContentPathBindings2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(HeightPickerModel.INSTANCE.serializer(), jsonElement7);
                    } else if (!(objOverlayContentPathBindings2 instanceof HeightPickerModel)) {
                        if (objOverlayContentPathBindings2 instanceof Number) {
                            c22673i3 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(HeightPickerModel.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings2 = (HeightPickerModel) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings2 = (HeightPickerModel) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings2 = (HeightPickerModel) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings2 = (HeightPickerModel) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings2 = (HeightPickerModel) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings2 = (HeightPickerModel) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                            } else {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (objOverlayContentPathBindings2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c7 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(HeightPickerModel.INSTANCE.serializer(), jsonPrimitiveM1841c7);
                            if (objOverlayContentPathBindings2 == null) {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else {
                            objOverlayContentPathBindings2 = null;
                        }
                    }
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = heightPicker;
                    }
                }
            }
        } else if (objOverlayContentPathBindings2 != null) {
            objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(r1, "heightPicker", accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$6
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj11) {
                    return invoke((HeightPickerModel) obj11);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(HeightPickerModel v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(HeightPickerModel.INSTANCE.serializer(), v13);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$7
                /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.items.heightpicker.HeightPickerModel, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final HeightPickerModel invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(HeightPickerModel.INSTANCE.serializer(), json);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            });
        }
        HeightPickerModel heightPickerModel2 = (HeightPickerModel) DotPathBindingsKt.overlayAggregateBinding(map2, "heightPicker", accumulatedState, objOverlayContentPathBindings2, "heightPicker", new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$8
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj11) {
                return invoke((HeightPickerModel) obj11);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(HeightPickerModel heightPickerModel3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(HeightPickerModel.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, heightPickerModel3, interfaceC37138cM122336d);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$9
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.items.heightpicker.HeightPickerModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final HeightPickerModel invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(HeightPickerModel.INSTANCE.serializer(), json);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$10
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.items.heightpicker.HeightPickerModel, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.items.heightpicker.HeightPickerModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final HeightPickerModel invoke(Object obj11) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj11);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement8 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(HeightPickerModel.INSTANCE.serializer(), jsonElement8);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof HeightPickerModel) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c8 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(HeightPickerModel.INSTANCE.serializer(), jsonPrimitiveM1841c8);
                    } catch (Exception unused12) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(HeightPickerModel.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (HeightPickerModel) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                    return (HeightPickerModel) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                    return (HeightPickerModel) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                    return (HeightPickerModel) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                    return (HeightPickerModel) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (HeightPickerModel) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        weightPicker = heightWeightModel.getWeightPicker();
        if (weightPicker == null) {
            objOverlayContentPathBindings3 = null;
        } else {
            if (weightPicker instanceof WithGeneratedBindings) {
                objBind2 = ((WithGeneratedBindings) weightPicker).bind(accumulatedState);
                if (!(objBind2 instanceof WeightPickerModel)) {
                    objBind2 = null;
                }
                obj2 = (WeightPickerModel) objBind2;
                if (obj2 == null) {
                    obj2 = weightPicker;
                }
            } else if (weightPicker instanceof List) {
                Iterable iterable6 = (Iterable) weightPicker;
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable6, 10));
                while (r2.hasNext()) {
                    if (obj8 instanceof WithGeneratedBindings) {
                        withGeneratedBindings2 = (WithGeneratedBindings) obj8;
                    } else {
                        withGeneratedBindings2 = null;
                    }
                    if (withGeneratedBindings2 == null) {
                    }
                    arrayList2.add(obj8);
                }
                obj2 = (WeightPickerModel) arrayList2;
            } else {
                obj2 = weightPicker;
            }
            objOverlayContentPathBindings3 = obj2;
        }
        if (r1 != 0) {
            strResolveContentBindingKey2 = BindingLoggerKt.resolveContentBindingKey(r1, "weightPicker");
        } else {
            strResolveContentBindingKey2 = null;
        }
        if (strResolveContentBindingKey2 != null) {
            objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
            if (objResolveStateRef3 != null) {
                BindingLoggerKt.logContentBinding("weightPicker", strResolveContentBindingKey2, objResolveStateRef3);
                objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if (!(objUnwrapForCoercion4 instanceof String)) {
                    objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = null;
                    } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                        JsonElement jsonElement8 = (JsonElement) objOverlayContentPathBindings3;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(WeightPickerModel.INSTANCE.serializer(), jsonElement8);
                    } else if (!(objOverlayContentPathBindings3 instanceof WeightPickerModel)) {
                        if (objOverlayContentPathBindings3 instanceof Number) {
                            c22673i2 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(WeightPickerModel.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings3 = (WeightPickerModel) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings3 = (WeightPickerModel) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings3 = (WeightPickerModel) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings3 = (WeightPickerModel) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings3 = (WeightPickerModel) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings3 = (WeightPickerModel) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                            } else {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else if (objOverlayContentPathBindings3 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c8 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(WeightPickerModel.INSTANCE.serializer(), jsonPrimitiveM1841c8);
                            if (objOverlayContentPathBindings3 == null) {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else {
                            objOverlayContentPathBindings3 = null;
                        }
                    }
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = weightPicker;
                    }
                } else {
                    objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = null;
                    } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                        JsonElement jsonElement9 = (JsonElement) objOverlayContentPathBindings3;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(WeightPickerModel.INSTANCE.serializer(), jsonElement9);
                    } else if (!(objOverlayContentPathBindings3 instanceof WeightPickerModel)) {
                        if (objOverlayContentPathBindings3 instanceof Number) {
                            c22673i2 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(WeightPickerModel.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings3 = (WeightPickerModel) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings3 = (WeightPickerModel) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings3 = (WeightPickerModel) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings3 = (WeightPickerModel) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings3 = (WeightPickerModel) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings3 = (WeightPickerModel) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                            } else {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else if (objOverlayContentPathBindings3 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c9 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(WeightPickerModel.INSTANCE.serializer(), jsonPrimitiveM1841c9);
                            if (objOverlayContentPathBindings3 == null) {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else {
                            objOverlayContentPathBindings3 = null;
                        }
                    }
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = weightPicker;
                    }
                }
            }
        } else if (objOverlayContentPathBindings3 != null) {
            objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(r1, "weightPicker", accumulatedState, objOverlayContentPathBindings3, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$11
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj11) {
                    return invoke((WeightPickerModel) obj11);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(WeightPickerModel v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(WeightPickerModel.INSTANCE.serializer(), v13);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$12
                /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.items.weightpicker.WeightPickerModel, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final WeightPickerModel invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(WeightPickerModel.INSTANCE.serializer(), json);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            });
        }
        WeightPickerModel weightPickerModel2 = (WeightPickerModel) DotPathBindingsKt.overlayAggregateBinding(map2, "weightPicker", accumulatedState, objOverlayContentPathBindings3, "weightPicker", new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$13
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj11) {
                return invoke((WeightPickerModel) obj11);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(WeightPickerModel weightPickerModel3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(WeightPickerModel.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, weightPickerModel3, interfaceC37138cM122336d);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$14
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.items.weightpicker.WeightPickerModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final WeightPickerModel invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(WeightPickerModel.INSTANCE.serializer(), json);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$15
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.items.weightpicker.WeightPickerModel, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.items.weightpicker.WeightPickerModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final WeightPickerModel invoke(Object obj11) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj11);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement10 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(WeightPickerModel.INSTANCE.serializer(), jsonElement10);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof WeightPickerModel) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c10 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(WeightPickerModel.INSTANCE.serializer(), jsonPrimitiveM1841c10);
                    } catch (Exception unused12) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(WeightPickerModel.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (WeightPickerModel) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                    return (WeightPickerModel) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                    return (WeightPickerModel) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                    return (WeightPickerModel) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                    return (WeightPickerModel) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (WeightPickerModel) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        stateUpdateUnitKey = heightWeightModel.getStateUpdateUnitKey();
        if (stateUpdateUnitKey == null) {
            objOverlayContentPathBindings4 = null;
        } else {
            if (stateUpdateUnitKey instanceof WithGeneratedBindings) {
                objBind3 = ((WithGeneratedBindings) stateUpdateUnitKey).bind(accumulatedState);
                if (!(objBind3 instanceof String)) {
                    objBind3 = null;
                }
                obj3 = (String) objBind3;
                if (obj3 == null) {
                    obj3 = stateUpdateUnitKey;
                }
            } else if (stateUpdateUnitKey instanceof List) {
                Iterable iterable7 = (Iterable) stateUpdateUnitKey;
                arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable7, 10));
                while (r2.hasNext()) {
                    if (obj9 instanceof WithGeneratedBindings) {
                        withGeneratedBindings3 = (WithGeneratedBindings) obj9;
                    } else {
                        withGeneratedBindings3 = null;
                    }
                    if (withGeneratedBindings3 == null) {
                    }
                    arrayList3.add(obj9);
                }
                obj3 = (String) arrayList3;
            } else {
                obj3 = stateUpdateUnitKey;
            }
            objOverlayContentPathBindings4 = obj3;
        }
        if (r1 != 0) {
            strResolveContentBindingKey3 = BindingLoggerKt.resolveContentBindingKey(r1, "stateUpdateUnitKey");
        } else {
            strResolveContentBindingKey3 = null;
        }
        if (strResolveContentBindingKey3 != null) {
            objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
            if (objResolveStateRef2 != null) {
                BindingLoggerKt.logContentBinding("stateUpdateUnitKey", strResolveContentBindingKey3, objResolveStateRef2);
                objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                if (!(objUnwrapForCoercion3 instanceof String)) {
                    objOverlayContentPathBindings4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (objOverlayContentPathBindings4 == null) {
                        objOverlayContentPathBindings4 = null;
                    } else if (objOverlayContentPathBindings4 instanceof JsonElement) {
                        JsonElement jsonElement10 = (JsonElement) objOverlayContentPathBindings4;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement10);
                    } else {
                        z13 = objOverlayContentPathBindings4 instanceof String;
                        if (!z13) {
                            if (objOverlayContentPathBindings4 instanceof Number) {
                                c22673i1 = AbstractC22671h0.f89337a;
                                orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(String.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings4 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings4 = (String) Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings4 = (String) Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings4 = (String) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls2))) {
                                    objOverlayContentPathBindings4 = (String) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                    objOverlayContentPathBindings4 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                                } else {
                                    objOverlayContentPathBindings4 = null;
                                }
                            } else if (z13) {
                                JsonPrimitive jsonPrimitiveM1841c10 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings4);
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c10);
                                if (objOverlayContentPathBindings4 == null) {
                                    objOverlayContentPathBindings4 = null;
                                }
                            } else {
                                objOverlayContentPathBindings4 = null;
                            }
                        }
                    }
                    if (objOverlayContentPathBindings4 == null) {
                        objOverlayContentPathBindings4 = stateUpdateUnitKey;
                    }
                } else {
                    objOverlayContentPathBindings4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (objOverlayContentPathBindings4 == null) {
                        objOverlayContentPathBindings4 = null;
                    } else if (objOverlayContentPathBindings4 instanceof JsonElement) {
                        JsonElement jsonElement11 = (JsonElement) objOverlayContentPathBindings4;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement11);
                    } else {
                        z13 = objOverlayContentPathBindings4 instanceof String;
                        if (!z13) {
                            if (objOverlayContentPathBindings4 instanceof Number) {
                                c22673i1 = AbstractC22671h0.f89337a;
                                orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(String.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings4 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings4 = (String) Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings4 = (String) Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings4 = (String) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls2))) {
                                    objOverlayContentPathBindings4 = (String) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                    objOverlayContentPathBindings4 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                                } else {
                                    objOverlayContentPathBindings4 = null;
                                }
                            } else if (z13) {
                                JsonPrimitive jsonPrimitiveM1841c11 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings4);
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c11);
                                if (objOverlayContentPathBindings4 == null) {
                                    objOverlayContentPathBindings4 = null;
                                }
                            } else {
                                objOverlayContentPathBindings4 = null;
                            }
                        }
                    }
                    if (objOverlayContentPathBindings4 == null) {
                        objOverlayContentPathBindings4 = stateUpdateUnitKey;
                    }
                }
            }
        } else if (objOverlayContentPathBindings4 != null) {
            objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(r1, "stateUpdateUnitKey", accumulatedState, objOverlayContentPathBindings4, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$16
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj11) {
                    return invoke((String) obj11);
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
            }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$17
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
        String str2 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "stateUpdateUnitKey", accumulatedState, objOverlayContentPathBindings4, "stateUpdateUnitKey", new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$18
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj11) {
                return invoke((String) obj11);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str3, interfaceC37138cM122336d);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$19
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
        }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$20
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj11) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj11);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement12 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement12);
                    } catch (Exception unused11) {
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
                    JsonPrimitive jsonPrimitiveM1841c12 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c12);
                    } catch (Exception unused12) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(String.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (String) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                    return (String) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                    return (String) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                    return (String) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                    return (String) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (String) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        unitType = heightWeightModel.getUnitType();
        if (unitType == null) {
            obj5 = null;
        } else {
            if (unitType instanceof WithGeneratedBindings) {
                objBind4 = ((WithGeneratedBindings) unitType).bind(accumulatedState);
                if (!(objBind4 instanceof String)) {
                    objBind4 = null;
                }
                obj4 = (String) objBind4;
                if (obj4 == null) {
                    obj4 = unitType;
                }
            } else if (unitType instanceof List) {
                Iterable iterable8 = (Iterable) unitType;
                arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable8, 10));
                while (r2.hasNext()) {
                    if (obj10 instanceof WithGeneratedBindings) {
                        withGeneratedBindings4 = (WithGeneratedBindings) obj10;
                    } else {
                        withGeneratedBindings4 = null;
                    }
                    if (withGeneratedBindings4 == null) {
                    }
                    arrayList4.add(obj10);
                }
                obj4 = (String) arrayList4;
            } else {
                obj4 = unitType;
            }
            obj5 = obj4;
        }
        if (r1 != 0) {
            strResolveContentBindingKey4 = BindingLoggerKt.resolveContentBindingKey(r1, "unitType");
        } else {
            strResolveContentBindingKey4 = null;
        }
        if (strResolveContentBindingKey4 != null) {
            objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey4, accumulatedState);
            if (objResolveStateRef != null) {
                BindingLoggerKt.logContentBinding("unitType", strResolveContentBindingKey4, objResolveStateRef);
                objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                if (!(objUnwrapForCoercion instanceof String)) {
                    objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (objUnwrapForCoercion2 == null) {
                        objOverlayContentPathBindings5 = null;
                    } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                        JsonElement jsonElement12 = (JsonElement) objUnwrapForCoercion2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement12);
                    } else {
                        z4 = objUnwrapForCoercion2 instanceof String;
                        if (z4) {
                            if (objUnwrapForCoercion2 instanceof Number) {
                                c22673i0 = AbstractC22671h0.f89337a;
                                orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings5 = (String) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings5 = (String) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings5 = (String) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings5 = (String) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                    objOverlayContentPathBindings5 = (String) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
                                    objOverlayContentPathBindings5 = (String) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                                }
                            } else if (z4) {
                                JsonPrimitive jsonPrimitiveM1841c12 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c12);
                                if (objUnwrapForCoercion2 != null) {
                                    objOverlayContentPathBindings5 = objUnwrapForCoercion2;
                                }
                            }
                            objOverlayContentPathBindings5 = null;
                        } else {
                            objOverlayContentPathBindings5 = objUnwrapForCoercion2;
                        }
                    }
                    if (objOverlayContentPathBindings5 == null) {
                        obj5 = unitType;
                    } else {
                        obj5 = objOverlayContentPathBindings5;
                    }
                } else {
                    objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (objUnwrapForCoercion2 == null) {
                        objOverlayContentPathBindings5 = null;
                    } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                        JsonElement jsonElement13 = (JsonElement) objUnwrapForCoercion2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement13);
                    } else {
                        z4 = objUnwrapForCoercion2 instanceof String;
                        if (z4) {
                            if (objUnwrapForCoercion2 instanceof Number) {
                                c22673i0 = AbstractC22671h0.f89337a;
                                orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings5 = (String) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings5 = (String) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings5 = (String) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings5 = (String) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                    objOverlayContentPathBindings5 = (String) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
                                    objOverlayContentPathBindings5 = (String) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                                }
                            } else if (z4) {
                                JsonPrimitive jsonPrimitiveM1841c13 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c13);
                                if (objUnwrapForCoercion2 != null) {
                                    objOverlayContentPathBindings5 = objUnwrapForCoercion2;
                                }
                            }
                            objOverlayContentPathBindings5 = null;
                        } else {
                            objOverlayContentPathBindings5 = objUnwrapForCoercion2;
                        }
                    }
                    if (objOverlayContentPathBindings5 == null) {
                        obj5 = unitType;
                    } else {
                        obj5 = objOverlayContentPathBindings5;
                    }
                }
            }
        } else if (obj5 != null) {
            objOverlayContentPathBindings5 = ContentPathBindingsKt.overlayContentPathBindings(r1, "unitType", accumulatedState, obj5, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$21
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj11) {
                    return invoke((String) obj11);
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
            }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$22
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
            obj5 = objOverlayContentPathBindings5;
        }
        return (HeightWeightModel) ContentBindingResolverKt.copyBindingsFrom(new HeightWeightModel(list3, heightPickerModel2, weightPickerModel2, str2, (String) DotPathBindingsKt.overlayAggregateBinding(map2, "unitType", accumulatedState, obj5, "unitType", new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$23
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj11) {
                return invoke((String) obj11);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str3, interfaceC37138cM122336d);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$24
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
        }, new Function1() { // from class: com.whoop.design.models.items.heightweight.HeightWeightModelStateBindingKt$generatedBind$$inlined$resolveBinding$25
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj11) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj11);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement14 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement14);
                    } catch (Exception unused11) {
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
                    JsonPrimitive jsonPrimitiveM1841c14 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c14);
                    } catch (Exception unused12) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(String.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (String) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                    return (String) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                    return (String) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                    return (String) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                    return (String) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (String) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        })), heightWeightModel);
    }

    public static /* synthetic */ HeightWeightModel generatedBind$default(HeightWeightModel heightWeightModel, Map map, Map map2, Map map3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map2 = null;
        }
        return generatedBind(heightWeightModel, map, map2, map3);
    }
}
