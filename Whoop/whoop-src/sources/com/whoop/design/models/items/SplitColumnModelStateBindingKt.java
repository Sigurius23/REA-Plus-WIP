package com.whoop.design.models.items;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import com.whoop.design.models.DesignSystemModel;
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
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
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
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003¨\u0006\t"}, m65681d2 = {"generatedBind", "Lcom/whoop/design/models/items/SplitColumnModel;", "contentBinding", "", "", "aggregateBindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "accumulatedState", "", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SplitColumnModelStateBindingKt {
    /* JADX WARN: Code duplicated, block: B:102:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:107:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:110:0x0201  */
    /* JADX WARN: Code duplicated, block: B:111:0x0203  */
    /* JADX WARN: Code duplicated, block: B:114:0x0219  */
    /* JADX WARN: Code duplicated, block: B:116:0x0221  */
    /* JADX WARN: Code duplicated, block: B:117:0x0225  */
    /* JADX WARN: Code duplicated, block: B:128:0x023a  */
    /* JADX WARN: Code duplicated, block: B:129:0x023f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0242  */
    /* JADX WARN: Code duplicated, block: B:133:0x0248  */
    /* JADX WARN: Code duplicated, block: B:140:0x026c  */
    /* JADX WARN: Code duplicated, block: B:143:0x0274  */
    /* JADX WARN: Code duplicated, block: B:144:0x0277  */
    /* JADX WARN: Code duplicated, block: B:146:0x027b  */
    /* JADX WARN: Code duplicated, block: B:149:0x029c  */
    /* JADX WARN: Code duplicated, block: B:152:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:154:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:156:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:159:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:160:0x02da  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:163:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:165:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:166:0x0309  */
    /* JADX WARN: Code duplicated, block: B:168:0x0313  */
    /* JADX WARN: Code duplicated, block: B:169:0x0320  */
    /* JADX WARN: Code duplicated, block: B:171:0x032a  */
    /* JADX WARN: Code duplicated, block: B:172:0x0337  */
    /* JADX WARN: Code duplicated, block: B:174:0x033b  */
    /* JADX WARN: Code duplicated, block: B:180:0x0364  */
    /* JADX WARN: Code duplicated, block: B:181:0x0366  */
    /* JADX WARN: Code duplicated, block: B:182:0x0369  */
    /* JADX WARN: Code duplicated, block: B:185:0x036e  */
    /* JADX WARN: Code duplicated, block: B:188:0x038c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0398  */
    /* JADX WARN: Code duplicated, block: B:192:0x039a  */
    /* JADX WARN: Code duplicated, block: B:194:0x039e  */
    /* JADX WARN: Code duplicated, block: B:196:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:200:0x03af  */
    /* JADX WARN: Code duplicated, block: B:202:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:205:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:207:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:208:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:216:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:220:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:221:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:224:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:226:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:233:0x0420  */
    /* JADX WARN: Code duplicated, block: B:235:0x0426  */
    /* JADX WARN: Code duplicated, block: B:236:0x0429  */
    /* JADX WARN: Code duplicated, block: B:238:0x042d  */
    /* JADX WARN: Code duplicated, block: B:241:0x0442  */
    /* JADX WARN: Code duplicated, block: B:244:0x0448  */
    /* JADX WARN: Code duplicated, block: B:246:0x044c  */
    /* JADX WARN: Code duplicated, block: B:248:0x045a  */
    /* JADX WARN: Code duplicated, block: B:249:0x0468  */
    /* JADX WARN: Code duplicated, block: B:251:0x0472  */
    /* JADX WARN: Code duplicated, block: B:252:0x0480  */
    /* JADX WARN: Code duplicated, block: B:254:0x048a  */
    /* JADX WARN: Code duplicated, block: B:255:0x0495  */
    /* JADX WARN: Code duplicated, block: B:257:0x049f  */
    /* JADX WARN: Code duplicated, block: B:258:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:260:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:261:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:263:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:264:0x04da  */
    /* JADX WARN: Code duplicated, block: B:266:0x04de  */
    /* JADX WARN: Code duplicated, block: B:272:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:273:0x04fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:275:0x0500  */
    /* JADX WARN: Code duplicated, block: B:278:0x0522  */
    /* JADX WARN: Code duplicated, block: B:279:0x0524  */
    /* JADX WARN: Code duplicated, block: B:281:0x0528  */
    /* JADX WARN: Code duplicated, block: B:283:0x0533  */
    /* JADX WARN: Code duplicated, block: B:287:0x0539  */
    /* JADX WARN: Code duplicated, block: B:289:0x053d  */
    /* JADX WARN: Code duplicated, block: B:292:0x0553  */
    /* JADX WARN: Code duplicated, block: B:294:0x055b  */
    /* JADX WARN: Code duplicated, block: B:295:0x055f  */
    /* JADX WARN: Code duplicated, block: B:303:0x0572  */
    /* JADX WARN: Code duplicated, block: B:307:0x0578  */
    /* JADX WARN: Code duplicated, block: B:308:0x057d  */
    /* JADX WARN: Code duplicated, block: B:310:0x0580  */
    /* JADX WARN: Code duplicated, block: B:312:0x0586  */
    /* JADX WARN: Code duplicated, block: B:319:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:321:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:322:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:324:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:327:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:330:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:332:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:334:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:335:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:337:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:338:0x0608  */
    /* JADX WARN: Code duplicated, block: B:340:0x0612  */
    /* JADX WARN: Code duplicated, block: B:341:0x061d  */
    /* JADX WARN: Code duplicated, block: B:343:0x0627  */
    /* JADX WARN: Code duplicated, block: B:344:0x0634  */
    /* JADX WARN: Code duplicated, block: B:346:0x063e  */
    /* JADX WARN: Code duplicated, block: B:347:0x064b  */
    /* JADX WARN: Code duplicated, block: B:349:0x0655  */
    /* JADX WARN: Code duplicated, block: B:350:0x0662  */
    /* JADX WARN: Code duplicated, block: B:352:0x0666  */
    /* JADX WARN: Code duplicated, block: B:358:0x0683  */
    /* JADX WARN: Code duplicated, block: B:359:0x0685 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:361:0x0688  */
    /* JADX WARN: Code duplicated, block: B:364:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:365:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:367:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:369:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:373:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:375:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:378:0x06db  */
    /* JADX WARN: Code duplicated, block: B:380:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:381:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:389:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:393:0x0700  */
    /* JADX WARN: Code duplicated, block: B:394:0x0705  */
    /* JADX WARN: Code duplicated, block: B:397:0x070a  */
    /* JADX WARN: Code duplicated, block: B:399:0x0710  */
    /* JADX WARN: Code duplicated, block: B:406:0x0732  */
    /* JADX WARN: Code duplicated, block: B:408:0x0738  */
    /* JADX WARN: Code duplicated, block: B:409:0x073b  */
    /* JADX WARN: Code duplicated, block: B:411:0x073f  */
    /* JADX WARN: Code duplicated, block: B:414:0x0759  */
    /* JADX WARN: Code duplicated, block: B:417:0x075f  */
    /* JADX WARN: Code duplicated, block: B:419:0x0763  */
    /* JADX WARN: Code duplicated, block: B:421:0x0771  */
    /* JADX WARN: Code duplicated, block: B:422:0x077f  */
    /* JADX WARN: Code duplicated, block: B:424:0x0789  */
    /* JADX WARN: Code duplicated, block: B:425:0x0797  */
    /* JADX WARN: Code duplicated, block: B:427:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:428:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:430:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:431:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:433:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:434:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:436:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:437:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:439:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:445:0x0819  */
    /* JADX WARN: Code duplicated, block: B:446:0x081b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:448:0x081e  */
    /* JADX WARN: Code duplicated, block: B:451:0x0840  */
    /* JADX WARN: Code duplicated, block: B:452:0x0842  */
    /* JADX WARN: Code duplicated, block: B:454:0x0846  */
    /* JADX WARN: Code duplicated, block: B:456:0x0851  */
    /* JADX WARN: Code duplicated, block: B:460:0x0857  */
    /* JADX WARN: Code duplicated, block: B:462:0x085b  */
    /* JADX WARN: Code duplicated, block: B:465:0x0871  */
    /* JADX WARN: Code duplicated, block: B:467:0x0879  */
    /* JADX WARN: Code duplicated, block: B:468:0x087d  */
    /* JADX WARN: Code duplicated, block: B:476:0x0890  */
    /* JADX WARN: Code duplicated, block: B:480:0x0896  */
    /* JADX WARN: Code duplicated, block: B:481:0x089b  */
    /* JADX WARN: Code duplicated, block: B:483:0x089e  */
    /* JADX WARN: Code duplicated, block: B:485:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:492:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:494:0x08cc  */
    /* JADX WARN: Code duplicated, block: B:495:0x08cf  */
    /* JADX WARN: Code duplicated, block: B:497:0x08d3  */
    /* JADX WARN: Code duplicated, block: B:500:0x08f3  */
    /* JADX WARN: Code duplicated, block: B:502:0x08f7 A[PHI: r4
      0x08f7: PHI (r4v71 java.lang.Object) = (r4v47 java.lang.Object), (r4v51 java.lang.Object) binds: [B:501:0x08f5, B:529:0x09bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:503:0x08fa  */
    /* JADX WARN: Code duplicated, block: B:505:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:507:0x090c  */
    /* JADX WARN: Code duplicated, block: B:508:0x091b  */
    /* JADX WARN: Code duplicated, block: B:510:0x0925  */
    /* JADX WARN: Code duplicated, block: B:511:0x0934  */
    /* JADX WARN: Code duplicated, block: B:513:0x093e  */
    /* JADX WARN: Code duplicated, block: B:514:0x094d  */
    /* JADX WARN: Code duplicated, block: B:516:0x0957  */
    /* JADX WARN: Code duplicated, block: B:517:0x0965  */
    /* JADX WARN: Code duplicated, block: B:519:0x096f  */
    /* JADX WARN: Code duplicated, block: B:520:0x097d  */
    /* JADX WARN: Code duplicated, block: B:522:0x0987  */
    /* JADX WARN: Code duplicated, block: B:523:0x0995  */
    /* JADX WARN: Code duplicated, block: B:525:0x0999  */
    /* JADX WARN: Code duplicated, block: B:532:0x09c3  */
    /* JADX WARN: Code duplicated, block: B:533:0x09c5 A[PHI: r10
      0x09c5: PHI (r10v3 java.lang.Object) = (r10v2 java.lang.Object), (r10v18 java.lang.Object) binds: [B:536:0x09ca, B:531:0x09c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:534:0x09c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:536:0x09ca  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:99:0x01df  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final SplitColumnModel generatedBind(SplitColumnModel splitColumnModel, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, ? extends Object> accumulatedState) {
        Object objOverlayContentPathBindings;
        WithGeneratedBindings withGeneratedBindingsBind;
        List<DesignSystemModel> topContent;
        List<DesignSystemModel> bottomContent;
        ArrayList arrayList;
        List list;
        WithGeneratedBindings withGeneratedBindings;
        WithGeneratedBindings withGeneratedBindingsBind2;
        Object objOverlayContentPathBindings2;
        WithGeneratedBindings withGeneratedBindingsBind3;
        String strResolveContentBindingKey;
        Object obj;
        List<DesignSystemModel> bottomContent2;
        Object topChildPadding;
        ArrayList arrayList2;
        Object obj2;
        WithGeneratedBindings withGeneratedBindings2;
        WithGeneratedBindings withGeneratedBindingsBind4;
        Object objOverlayContentPathBindings3;
        Object objBind;
        String strResolveContentBindingKey2;
        Object bottomChildPadding;
        ArrayList arrayList3;
        Object obj3;
        WithGeneratedBindings withGeneratedBindings3;
        WithGeneratedBindings withGeneratedBindingsBind5;
        Object objOverlayContentPathBindings4;
        Object objBind2;
        String strResolveContentBindingKey3;
        Map<String, String> bindings;
        List arrayList4;
        Map<String, String> map3;
        WithGeneratedBindings withGeneratedBindings4;
        WithGeneratedBindings withGeneratedBindingsBind6;
        Object objOverlayContentPathBindings5;
        WithGeneratedBindings withGeneratedBindingsBind7;
        String strResolveContentBindingKey4;
        Map<String, AggregateBinding> aggregateBindings;
        List arrayList5;
        Map<String, AggregateBinding> map4;
        WithGeneratedBindings withGeneratedBindings5;
        WithGeneratedBindings withGeneratedBindingsBind8;
        Object obj4;
        WithGeneratedBindings withGeneratedBindingsBind9;
        String strResolveContentBindingKey5;
        Object objOverlayContentPathBindings6;
        Object objResolveStateRef;
        Object objUnwrapForCoercion;
        Object objUnwrapForCoercion2;
        InterfaceC21461d interfaceC21461dM65688a;
        Object objResolveStateRef2;
        Object objUnwrapForCoercion3;
        InterfaceC21461d interfaceC21461dM65688a2;
        Object objResolveStateRef3;
        Object objUnwrapForCoercion4;
        InterfaceC21461d interfaceC21461dM65688a3;
        Object objResolveStateRef4;
        Object objUnwrapForCoercion5;
        InterfaceC21461d interfaceC21461dM65688a4;
        Object objResolveStateRef5;
        Object objUnwrapForCoercion6;
        InterfaceC21461d interfaceC21461dM65688a5;
        AbstractC22676k.m65750j(splitColumnModel, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if ((map == null || map.isEmpty()) && ((map2 == null || map2.isEmpty()) && accumulatedState.isEmpty())) {
            return splitColumnModel;
        }
        List<DesignSystemModel> topContent2 = splitColumnModel.getTopContent();
        if (topContent2 == null) {
            objOverlayContentPathBindings = null;
        } else if (topContent2 instanceof WithGeneratedBindings) {
            WithGeneratedBindings withGeneratedBindingsBind10 = ((WithGeneratedBindings) topContent2).bind(accumulatedState);
            if (!(withGeneratedBindingsBind10 instanceof List)) {
                withGeneratedBindingsBind10 = null;
            }
            objOverlayContentPathBindings = (List) withGeneratedBindingsBind10;
            if (objOverlayContentPathBindings == null) {
                objOverlayContentPathBindings = topContent2;
            }
        } else {
            List<DesignSystemModel> list2 = topContent2;
            ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            for (Object obj5 : list2) {
                WithGeneratedBindings withGeneratedBindings6 = obj5 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj5 : null;
                if (withGeneratedBindings6 != null && (withGeneratedBindingsBind = withGeneratedBindings6.bind(accumulatedState)) != null) {
                    obj5 = withGeneratedBindingsBind;
                }
                arrayList6.add(obj5);
            }
            objOverlayContentPathBindings = arrayList6;
        }
        String strResolveContentBindingKey6 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "topContent") : null;
        Class cls = Byte.TYPE;
        Class cls2 = Short.TYPE;
        Class cls3 = Float.TYPE;
        Class cls4 = Double.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        if (strResolveContentBindingKey6 != null) {
            Object objResolveStateRef6 = StateLookupKt.resolveStateRef(strResolveContentBindingKey6, accumulatedState);
            if (objResolveStateRef6 != null) {
                BindingLoggerKt.logContentBinding("topContent", strResolveContentBindingKey6, objResolveStateRef6);
                Object objUnwrapForCoercion7 = BindCoercionKt.unwrapForCoercion(objResolveStateRef6);
                if ((objUnwrapForCoercion7 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion7) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                    objOverlayContentPathBindings = null;
                } else {
                    objOverlayContentPathBindings = BindCoercionKt.unwrapForCoercion(objResolveStateRef6);
                    if (objOverlayContentPathBindings == null) {
                        objOverlayContentPathBindings = null;
                    } else if (objOverlayContentPathBindings instanceof JsonElement) {
                        try {
                            objOverlayContentPathBindings = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(DesignSystemModel.class))), (JsonElement) objOverlayContentPathBindings);
                        } catch (Exception unused) {
                            objOverlayContentPathBindings = null;
                        }
                    } else if (!(objOverlayContentPathBindings instanceof List)) {
                        if (objOverlayContentPathBindings instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a6 = AbstractC22671h0.m65688a(List.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings = (List) Integer.valueOf(((Number) objOverlayContentPathBindings).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings = (List) Long.valueOf(((Number) objOverlayContentPathBindings).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings = (List) Double.valueOf(((Number) objOverlayContentPathBindings).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings = (List) Float.valueOf(((Number) objOverlayContentPathBindings).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings = (List) Short.valueOf(((Number) objOverlayContentPathBindings).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings = (List) Byte.valueOf(((Number) objOverlayContentPathBindings).byteValue());
                            } else {
                                objOverlayContentPathBindings = null;
                            }
                        } else if (objOverlayContentPathBindings instanceof String) {
                            try {
                                objOverlayContentPathBindings = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(DesignSystemModel.class))), AbstractC0770m.m1841c((String) objOverlayContentPathBindings));
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
                        objOverlayContentPathBindings = topContent2;
                    }
                }
            }
            topContent = (List) DotPathBindingsKt.overlayAggregateBinding(map2, "topContent", accumulatedState, objOverlayContentPathBindings, "topContent", new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$3
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj6) {
                    return invoke((List<? extends DesignSystemModel>) obj6);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(List<? extends DesignSystemModel> list3) {
                    try {
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))));
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, list3, interfaceC37138cM122336d);
                    } catch (Exception unused3) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$4
                /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final List<? extends DesignSystemModel> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))), json);
                    } catch (Exception unused3) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$5
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
                /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final List<? extends DesignSystemModel> invoke(Object obj6) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj6);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        try {
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))), (JsonElement) UnwrapForCoercion);
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
                        try {
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))), AbstractC0770m.m1841c((String) UnwrapForCoercion));
                        } catch (Exception unused4) {
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
            if (topContent == null) {
                topContent = splitColumnModel.getTopContent();
            }
            List<DesignSystemModel> list3 = topContent;
            bottomContent = splitColumnModel.getBottomContent();
            if (bottomContent == null) {
                objOverlayContentPathBindings2 = null;
            } else {
                if (bottomContent instanceof WithGeneratedBindings) {
                    withGeneratedBindingsBind3 = ((WithGeneratedBindings) bottomContent).bind(accumulatedState);
                    if (!(withGeneratedBindingsBind3 instanceof List)) {
                        withGeneratedBindingsBind3 = null;
                    }
                    list = (List) withGeneratedBindingsBind3;
                    if (list == null) {
                        list = bottomContent;
                    }
                } else {
                    List<DesignSystemModel> list4 = bottomContent;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(list4, 10));
                    for (Object obj6 : list4) {
                        if (obj6 instanceof WithGeneratedBindings) {
                            withGeneratedBindings = (WithGeneratedBindings) obj6;
                        } else {
                            withGeneratedBindings = null;
                        }
                        if (withGeneratedBindings == null && (withGeneratedBindingsBind2 = withGeneratedBindings.bind(accumulatedState)) != null) {
                            obj6 = withGeneratedBindingsBind2;
                        }
                        arrayList.add(obj6);
                    }
                    list = arrayList;
                }
                objOverlayContentPathBindings2 = list;
            }
            if (r1 != 0) {
                strResolveContentBindingKey = BindingLoggerKt.resolveContentBindingKey(map, "bottomContent");
            } else {
                strResolveContentBindingKey = null;
            }
            if (strResolveContentBindingKey != null) {
                objResolveStateRef5 = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
                if (objResolveStateRef5 != null) {
                    BindingLoggerKt.logContentBinding("bottomContent", strResolveContentBindingKey, objResolveStateRef5);
                    objUnwrapForCoercion6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                    if ((objUnwrapForCoercion6 instanceof String) || !AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion6)) {
                        obj = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
                    } else {
                        obj = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
                        if (AbstractC22676k.m65745e(accumulatedState.get(obj), Boolean.TRUE)) {
                            objOverlayContentPathBindings2 = null;
                        }
                    }
                    objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = null;
                    } else if (objOverlayContentPathBindings2 instanceof JsonElement) {
                        try {
                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(DesignSystemModel.class))), (JsonElement) objOverlayContentPathBindings2);
                        } catch (Exception unused3) {
                            objOverlayContentPathBindings2 = null;
                        }
                    } else if (!(objOverlayContentPathBindings2 instanceof List)) {
                        if (objOverlayContentPathBindings2 instanceof Number) {
                            interfaceC21461dM65688a5 = AbstractC22671h0.m65688a(List.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings2 = (List) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings2 = (List) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings2 = (List) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings2 = (List) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings2 = (List) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings2 = (List) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                            } else {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (objOverlayContentPathBindings2 instanceof String) {
                            try {
                                objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(DesignSystemModel.class))), AbstractC0770m.m1841c((String) objOverlayContentPathBindings2));
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
                        objOverlayContentPathBindings2 = bottomContent;
                    }
                } else {
                    obj = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
                }
            } else {
                obj = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
                if (objOverlayContentPathBindings2 != null) {
                    objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(r1, "bottomContent", accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$6
                        @Override // p715kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                            return invoke((List<? extends DesignSystemModel>) obj7);
                        }

                        @Override // p715kotlin.jvm.functions.Function1
                        public final JsonElement invoke(List<? extends DesignSystemModel> v13) {
                            AbstractC22676k.m65750j(v13, "v");
                            try {
                                ArrayListSerializer arrayListSerializer = new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)));
                                AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                                stateBindingJson.getClass();
                                return AbstractC12313p.m34290h0(stateBindingJson, v13, arrayListSerializer);
                            } catch (Exception unused5) {
                                return null;
                            }
                        }
                    }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$7
                        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
                        @Override // p715kotlin.jvm.functions.Function1
                        public final List<? extends DesignSystemModel> invoke(JsonElement json) {
                            AbstractC22676k.m65750j(json, "json");
                            try {
                                return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))), json);
                            } catch (Exception unused5) {
                                return null;
                            }
                        }
                    });
                }
            }
            Object obj7 = obj;
            bottomContent2 = (List) DotPathBindingsKt.overlayAggregateBinding(map2, "bottomContent", accumulatedState, objOverlayContentPathBindings2, "bottomContent", new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$8
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                    return invoke((List<? extends DesignSystemModel>) obj8);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(List<? extends DesignSystemModel> list5) {
                    try {
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))));
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, list5, interfaceC37138cM122336d);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$9
                /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final List<? extends DesignSystemModel> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))), json);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$10
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
                /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final List<? extends DesignSystemModel> invoke(Object obj8) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj8);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        try {
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))), (JsonElement) UnwrapForCoercion);
                        } catch (Exception unused5) {
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
                        try {
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))), AbstractC0770m.m1841c((String) UnwrapForCoercion));
                        } catch (Exception unused6) {
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
            if (bottomContent2 == null) {
                bottomContent2 = splitColumnModel.getBottomContent();
            }
            List<DesignSystemModel> list5 = bottomContent2;
            topChildPadding = splitColumnModel.getTopChildPadding();
            if (topChildPadding == null) {
                objOverlayContentPathBindings3 = null;
            } else {
                if (topChildPadding instanceof WithGeneratedBindings) {
                    objBind = ((WithGeneratedBindings) topChildPadding).bind(accumulatedState);
                    if (!(objBind instanceof Double)) {
                        objBind = null;
                    }
                    obj2 = (Double) objBind;
                    if (obj2 == null) {
                        obj2 = topChildPadding;
                    }
                } else if (topChildPadding instanceof List) {
                    Iterable iterable = (Iterable) topChildPadding;
                    arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
                    for (Object obj8 : iterable) {
                        if (obj8 instanceof WithGeneratedBindings) {
                            withGeneratedBindings2 = (WithGeneratedBindings) obj8;
                        } else {
                            withGeneratedBindings2 = null;
                        }
                        if (withGeneratedBindings2 == null && (withGeneratedBindingsBind4 = withGeneratedBindings2.bind(accumulatedState)) != null) {
                            obj8 = withGeneratedBindingsBind4;
                        }
                        arrayList2.add(obj8);
                    }
                    obj2 = (Double) arrayList2;
                } else {
                    obj2 = topChildPadding;
                }
                objOverlayContentPathBindings3 = obj2;
            }
            if (r1 != 0) {
                strResolveContentBindingKey2 = BindingLoggerKt.resolveContentBindingKey(r1, "topChildPadding");
            } else {
                strResolveContentBindingKey2 = null;
            }
            if (strResolveContentBindingKey2 != null) {
                objResolveStateRef4 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
                if (objResolveStateRef4 != null) {
                    BindingLoggerKt.logContentBinding("topChildPadding", strResolveContentBindingKey2, objResolveStateRef4);
                    objUnwrapForCoercion5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                    if (!(objUnwrapForCoercion5 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion5) && AbstractC22676k.m65745e(accumulatedState.get(obj7), Boolean.TRUE)) {
                        objOverlayContentPathBindings3 = null;
                    } else {
                        objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                        if (objOverlayContentPathBindings3 == null) {
                            objOverlayContentPathBindings3 = null;
                        } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                            JsonElement jsonElement = (JsonElement) objOverlayContentPathBindings3;
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonElement);
                            } catch (Exception unused5) {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else if (!(objOverlayContentPathBindings3 instanceof Double)) {
                            if (objOverlayContentPathBindings3 instanceof Number) {
                                interfaceC21461dM65688a4 = AbstractC22671h0.m65688a(Double.class);
                                if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls6))) {
                                    objOverlayContentPathBindings3 = (Double) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls5))) {
                                    objOverlayContentPathBindings3 = (Double) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls4))) {
                                    objOverlayContentPathBindings3 = Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls3))) {
                                    objOverlayContentPathBindings3 = (Double) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls2))) {
                                    objOverlayContentPathBindings3 = (Double) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls))) {
                                    objOverlayContentPathBindings3 = (Double) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                                } else {
                                    objOverlayContentPathBindings3 = null;
                                }
                            } else if (objOverlayContentPathBindings3 instanceof String) {
                                JsonPrimitive jsonPrimitiveM1841c = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonPrimitiveM1841c);
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
                            objOverlayContentPathBindings3 = topChildPadding;
                        }
                    }
                }
            } else if (objOverlayContentPathBindings3 != null) {
                objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(r1, "topChildPadding", accumulatedState, objOverlayContentPathBindings3, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$11
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj9) {
                        return invoke((Double) obj9);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(Double v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(DoubleSerializer.INSTANCE, v13);
                        } catch (Exception unused7) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$12
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Double, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Double invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, json);
                        } catch (Exception unused7) {
                            return null;
                        }
                    }
                });
            }
            Double d3 = (Double) DotPathBindingsKt.overlayAggregateBinding(map2, "topChildPadding", accumulatedState, objOverlayContentPathBindings3, "topChildPadding", new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$13
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj9) {
                    return invoke((Double) obj9);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Double d14) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(DoubleSerializer.INSTANCE);
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, d14, interfaceC37138cM122336d);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$14
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Double, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Double invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, json);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$15
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Double, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Double, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Double invoke(Object obj9) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj9);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement2 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonElement2);
                        } catch (Exception unused7) {
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
                        JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonPrimitiveM1841c2);
                        } catch (Exception unused8) {
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
            bottomChildPadding = splitColumnModel.getBottomChildPadding();
            if (bottomChildPadding == null) {
                objOverlayContentPathBindings4 = null;
            } else {
                if (bottomChildPadding instanceof WithGeneratedBindings) {
                    objBind2 = ((WithGeneratedBindings) bottomChildPadding).bind(accumulatedState);
                    if (!(objBind2 instanceof Double)) {
                        objBind2 = null;
                    }
                    obj3 = (Double) objBind2;
                    if (obj3 == null) {
                        obj3 = bottomChildPadding;
                    }
                } else if (bottomChildPadding instanceof List) {
                    Iterable iterable2 = (Iterable) bottomChildPadding;
                    arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
                    for (Object obj9 : iterable2) {
                        if (obj9 instanceof WithGeneratedBindings) {
                            withGeneratedBindings3 = (WithGeneratedBindings) obj9;
                        } else {
                            withGeneratedBindings3 = null;
                        }
                        if (withGeneratedBindings3 == null && (withGeneratedBindingsBind5 = withGeneratedBindings3.bind(accumulatedState)) != null) {
                            obj9 = withGeneratedBindingsBind5;
                        }
                        arrayList3.add(obj9);
                    }
                    obj3 = (Double) arrayList3;
                } else {
                    obj3 = bottomChildPadding;
                }
                objOverlayContentPathBindings4 = obj3;
            }
            if (r1 != 0) {
                strResolveContentBindingKey3 = BindingLoggerKt.resolveContentBindingKey(r1, "bottomChildPadding");
            } else {
                strResolveContentBindingKey3 = null;
            }
            if (strResolveContentBindingKey3 != null) {
                objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
                if (objResolveStateRef3 != null) {
                    BindingLoggerKt.logContentBinding("bottomChildPadding", strResolveContentBindingKey3, objResolveStateRef3);
                    objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                    if (!(objUnwrapForCoercion4 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion4) && AbstractC22676k.m65745e(accumulatedState.get(obj7), Boolean.TRUE)) {
                        objOverlayContentPathBindings4 = null;
                    } else {
                        objOverlayContentPathBindings4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                        if (objOverlayContentPathBindings4 == null) {
                            objOverlayContentPathBindings4 = null;
                        } else if (objOverlayContentPathBindings4 instanceof JsonElement) {
                            JsonElement jsonElement2 = (JsonElement) objOverlayContentPathBindings4;
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonElement2);
                            } catch (Exception unused7) {
                                objOverlayContentPathBindings4 = null;
                            }
                        } else if (!(objOverlayContentPathBindings4 instanceof Double)) {
                            if (objOverlayContentPathBindings4 instanceof Number) {
                                interfaceC21461dM65688a3 = AbstractC22671h0.m65688a(Double.class);
                                if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls6))) {
                                    objOverlayContentPathBindings4 = (Double) Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls5))) {
                                    objOverlayContentPathBindings4 = (Double) Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls4))) {
                                    objOverlayContentPathBindings4 = Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls3))) {
                                    objOverlayContentPathBindings4 = (Double) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls2))) {
                                    objOverlayContentPathBindings4 = (Double) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls))) {
                                    objOverlayContentPathBindings4 = (Double) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                                } else {
                                    objOverlayContentPathBindings4 = null;
                                }
                            } else if (objOverlayContentPathBindings4 instanceof String) {
                                JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings4);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonPrimitiveM1841c2);
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
                            objOverlayContentPathBindings4 = bottomChildPadding;
                        }
                    }
                }
            } else if (objOverlayContentPathBindings4 != null) {
                objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(r1, "bottomChildPadding", accumulatedState, objOverlayContentPathBindings4, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$16
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj10) {
                        return invoke((Double) obj10);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(Double v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(DoubleSerializer.INSTANCE, v13);
                        } catch (Exception unused9) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$17
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Double, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Double invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, json);
                        } catch (Exception unused9) {
                            return null;
                        }
                    }
                });
            }
            Double d14 = (Double) DotPathBindingsKt.overlayAggregateBinding(map2, "bottomChildPadding", accumulatedState, objOverlayContentPathBindings4, "bottomChildPadding", new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$18
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj10) {
                    return invoke((Double) obj10);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Double d15) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(DoubleSerializer.INSTANCE);
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, d15, interfaceC37138cM122336d);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$19
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Double, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Double invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, json);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$20
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Double, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Double, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Double invoke(Object obj10) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj10);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement3 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonElement3);
                        } catch (Exception unused9) {
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
                        JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonPrimitiveM1841c3);
                        } catch (Exception unused10) {
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
            bindings = splitColumnModel.getBindings();
            if (bindings == null) {
                objOverlayContentPathBindings5 = null;
            } else {
                if (bindings instanceof WithGeneratedBindings) {
                    withGeneratedBindingsBind7 = ((WithGeneratedBindings) bindings).bind(accumulatedState);
                    if (!(withGeneratedBindingsBind7 instanceof Map)) {
                        withGeneratedBindingsBind7 = null;
                    }
                    map3 = (Map) withGeneratedBindingsBind7;
                    if (map3 == null) {
                        map3 = bindings;
                    }
                } else if (bindings instanceof List) {
                    Iterable iterable3 = (Iterable) bindings;
                    arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable3, 10));
                    for (Object obj10 : iterable3) {
                        if (obj10 instanceof WithGeneratedBindings) {
                            withGeneratedBindings4 = (WithGeneratedBindings) obj10;
                        } else {
                            withGeneratedBindings4 = null;
                        }
                        if (withGeneratedBindings4 == null && (withGeneratedBindingsBind6 = withGeneratedBindings4.bind(accumulatedState)) != null) {
                            obj10 = withGeneratedBindingsBind6;
                        }
                        arrayList4.add(obj10);
                    }
                    map3 = (Map) arrayList4;
                } else {
                    map3 = bindings;
                }
                objOverlayContentPathBindings5 = map3;
            }
            if (r1 != 0) {
                strResolveContentBindingKey4 = BindingLoggerKt.resolveContentBindingKey(r1, "bindings");
            } else {
                strResolveContentBindingKey4 = null;
            }
            if (strResolveContentBindingKey4 != null) {
                objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey4, accumulatedState);
                if (objResolveStateRef2 != null) {
                    BindingLoggerKt.logContentBinding("bindings", strResolveContentBindingKey4, objResolveStateRef2);
                    objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (!(objUnwrapForCoercion3 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion3) && AbstractC22676k.m65745e(accumulatedState.get(obj7), Boolean.TRUE)) {
                        objOverlayContentPathBindings5 = null;
                    } else {
                        objOverlayContentPathBindings5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                        if (objOverlayContentPathBindings5 == null) {
                            objOverlayContentPathBindings5 = null;
                        } else if (objOverlayContentPathBindings5 instanceof JsonElement) {
                            JsonElement jsonElement3 = (JsonElement) objOverlayContentPathBindings5;
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                                objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer, stringSerializer), jsonElement3);
                            } catch (Exception unused9) {
                                objOverlayContentPathBindings5 = null;
                            }
                        } else if (!(objOverlayContentPathBindings5 instanceof Map)) {
                            if (objOverlayContentPathBindings5 instanceof Number) {
                                interfaceC21461dM65688a2 = AbstractC22671h0.m65688a(Map.class);
                                if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls6))) {
                                    objOverlayContentPathBindings5 = (Map) Integer.valueOf(((Number) objOverlayContentPathBindings5).intValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls5))) {
                                    objOverlayContentPathBindings5 = (Map) Long.valueOf(((Number) objOverlayContentPathBindings5).longValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls4))) {
                                    objOverlayContentPathBindings5 = (Map) Double.valueOf(((Number) objOverlayContentPathBindings5).doubleValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls3))) {
                                    objOverlayContentPathBindings5 = (Map) Float.valueOf(((Number) objOverlayContentPathBindings5).floatValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls2))) {
                                    objOverlayContentPathBindings5 = (Map) Short.valueOf(((Number) objOverlayContentPathBindings5).shortValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls))) {
                                    objOverlayContentPathBindings5 = (Map) Byte.valueOf(((Number) objOverlayContentPathBindings5).byteValue());
                                } else {
                                    objOverlayContentPathBindings5 = null;
                                }
                            } else if (objOverlayContentPathBindings5 instanceof String) {
                                JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings5);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                                    objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), jsonPrimitiveM1841c3);
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
                            objOverlayContentPathBindings5 = bindings;
                        }
                    }
                }
            } else if (objOverlayContentPathBindings5 != null) {
                objOverlayContentPathBindings5 = ContentPathBindingsKt.overlayContentPathBindings(r1, "bindings", accumulatedState, objOverlayContentPathBindings5, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$21
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj11) {
                        return invoke((Map<String, ? extends String>) obj11);
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
                        } catch (Exception unused11) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$22
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Map<String, ? extends String> invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), json);
                        } catch (Exception unused11) {
                            return null;
                        }
                    }
                });
            }
            Map map5 = (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "bindings", accumulatedState, objOverlayContentPathBindings5, "bindings", new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$23
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj11) {
                    return invoke((Map<String, ? extends String>) obj11);
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
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$24
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Map<String, ? extends String> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), json);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$25
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends java.lang.String>] */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Map<String, ? extends String> invoke(Object obj11) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj11);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement4 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), jsonElement4);
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
                        JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer4 = StringSerializer.INSTANCE;
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer4, stringSerializer4), jsonPrimitiveM1841c4);
                        } catch (Exception unused12) {
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
            aggregateBindings = splitColumnModel.getAggregateBindings();
            if (aggregateBindings == null) {
                obj4 = null;
            } else {
                if (aggregateBindings instanceof WithGeneratedBindings) {
                    withGeneratedBindingsBind9 = ((WithGeneratedBindings) aggregateBindings).bind(accumulatedState);
                    if (!(withGeneratedBindingsBind9 instanceof Map)) {
                        withGeneratedBindingsBind9 = null;
                    }
                    map4 = (Map) withGeneratedBindingsBind9;
                    if (map4 == null) {
                        map4 = aggregateBindings;
                    }
                } else if (aggregateBindings instanceof List) {
                    Iterable iterable4 = (Iterable) aggregateBindings;
                    arrayList5 = new ArrayList(AbstractC25267u.m74163i0(iterable4, 10));
                    for (Object obj11 : iterable4) {
                        if (obj11 instanceof WithGeneratedBindings) {
                            withGeneratedBindings5 = (WithGeneratedBindings) obj11;
                        } else {
                            withGeneratedBindings5 = null;
                        }
                        if (withGeneratedBindings5 == null && (withGeneratedBindingsBind8 = withGeneratedBindings5.bind(accumulatedState)) != null) {
                            obj11 = withGeneratedBindingsBind8;
                        }
                        arrayList5.add(obj11);
                    }
                    map4 = (Map) arrayList5;
                } else {
                    map4 = aggregateBindings;
                }
                obj4 = map4;
            }
            if (r1 != 0) {
                strResolveContentBindingKey5 = BindingLoggerKt.resolveContentBindingKey(r1, "aggregateBindings");
            } else {
                strResolveContentBindingKey5 = null;
            }
            if (strResolveContentBindingKey5 != null) {
                objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey5, accumulatedState);
                if (objResolveStateRef != null) {
                    BindingLoggerKt.logContentBinding("aggregateBindings", strResolveContentBindingKey5, objResolveStateRef);
                    objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (!(objUnwrapForCoercion instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion) && AbstractC22676k.m65745e(accumulatedState.get(obj7), Boolean.TRUE)) {
                        obj4 = null;
                    } else {
                        objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                        if (objUnwrapForCoercion2 == null) {
                            objOverlayContentPathBindings6 = null;
                        } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                            JsonElement jsonElement4 = (JsonElement) objUnwrapForCoercion2;
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings6 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement4);
                            } catch (Exception unused11) {
                                objOverlayContentPathBindings6 = null;
                            }
                        } else if (objUnwrapForCoercion2 instanceof Map) {
                            objOverlayContentPathBindings6 = objUnwrapForCoercion2;
                        } else {
                            if (objUnwrapForCoercion2 instanceof Number) {
                                interfaceC21461dM65688a = AbstractC22671h0.m65688a(Map.class);
                                if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls6))) {
                                    objOverlayContentPathBindings6 = (Map) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls5))) {
                                    objOverlayContentPathBindings6 = (Map) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls4))) {
                                    objOverlayContentPathBindings6 = (Map) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls3))) {
                                    objOverlayContentPathBindings6 = (Map) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls2))) {
                                    objOverlayContentPathBindings6 = (Map) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls))) {
                                    objOverlayContentPathBindings6 = (Map) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                                }
                            } else if (objUnwrapForCoercion2 instanceof String) {
                                JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c4);
                                } catch (Exception unused12) {
                                    objUnwrapForCoercion2 = null;
                                }
                                if (objUnwrapForCoercion2 != null) {
                                    objOverlayContentPathBindings6 = objUnwrapForCoercion2;
                                }
                            }
                            objOverlayContentPathBindings6 = null;
                        }
                        if (objOverlayContentPathBindings6 == null) {
                            obj4 = aggregateBindings;
                        } else {
                            obj4 = objOverlayContentPathBindings6;
                        }
                    }
                }
            } else if (obj4 != null) {
                objOverlayContentPathBindings6 = ContentPathBindingsKt.overlayContentPathBindings(r1, "aggregateBindings", accumulatedState, obj4, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$26
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj12) {
                        return invoke((Map<String, ? extends AggregateBinding>) obj12);
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
                        } catch (Exception unused13) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$27
                    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Map<String, ? extends AggregateBinding> invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), json);
                        } catch (Exception unused13) {
                            return null;
                        }
                    }
                });
                obj4 = objOverlayContentPathBindings6;
            }
            return (SplitColumnModel) ContentBindingResolverKt.copyBindingsFrom(new SplitColumnModel(list3, list5, d3, d14, map5, (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "aggregateBindings", accumulatedState, obj4, "aggregateBindings", new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$28
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj12) {
                    return invoke((Map<String, ? extends AggregateBinding>) obj12);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Map<String, ? extends AggregateBinding> map6) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE);
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, map6, interfaceC37138cM122336d);
                    } catch (Exception unused13) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$29
                /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Map<String, ? extends AggregateBinding> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), json);
                    } catch (Exception unused13) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$30
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Map<String, ? extends AggregateBinding> invoke(Object obj12) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj12);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement5 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement5);
                        } catch (Exception unused13) {
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
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c5);
                        } catch (Exception unused14) {
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
            })), splitColumnModel);
        }
        if (objOverlayContentPathBindings != null) {
            objOverlayContentPathBindings = ContentPathBindingsKt.overlayContentPathBindings(map, "topContent", accumulatedState, objOverlayContentPathBindings, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$1
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj12) {
                    return invoke((List<? extends DesignSystemModel>) obj12);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(List<? extends DesignSystemModel> v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        ArrayListSerializer arrayListSerializer = new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)));
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, v13, arrayListSerializer);
                    } catch (Exception unused13) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$2
                /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final List<? extends DesignSystemModel> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))), json);
                    } catch (Exception unused13) {
                        return null;
                    }
                }
            });
        }
        topContent = (List) DotPathBindingsKt.overlayAggregateBinding(map2, "topContent", accumulatedState, objOverlayContentPathBindings, "topContent", new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$3
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj12) {
                return invoke((List<? extends DesignSystemModel>) obj12);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(List<? extends DesignSystemModel> list6) {
                try {
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, list6, interfaceC37138cM122336d);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$4
            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final List<? extends DesignSystemModel> invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))), json);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$5
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final List<? extends DesignSystemModel> invoke(Object obj12) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj12);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))), (JsonElement) UnwrapForCoercion);
                    } catch (Exception unused13) {
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
                    try {
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))), AbstractC0770m.m1841c((String) UnwrapForCoercion));
                    } catch (Exception unused14) {
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
        if (topContent == null) {
            topContent = splitColumnModel.getTopContent();
        }
        List<DesignSystemModel> list6 = topContent;
        bottomContent = splitColumnModel.getBottomContent();
        if (bottomContent == null) {
            objOverlayContentPathBindings2 = null;
        } else {
            if (bottomContent instanceof WithGeneratedBindings) {
                withGeneratedBindingsBind3 = ((WithGeneratedBindings) bottomContent).bind(accumulatedState);
                if (!(withGeneratedBindingsBind3 instanceof List)) {
                    withGeneratedBindingsBind3 = null;
                }
                list = (List) withGeneratedBindingsBind3;
                if (list == null) {
                    list = bottomContent;
                }
            } else {
                List<DesignSystemModel> list7 = bottomContent;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(list7, 10));
                while (r2.hasNext()) {
                    if (obj6 instanceof WithGeneratedBindings) {
                        withGeneratedBindings = (WithGeneratedBindings) obj6;
                    } else {
                        withGeneratedBindings = null;
                    }
                    if (withGeneratedBindings == null) {
                    }
                    arrayList.add(obj6);
                }
                list = arrayList;
            }
            objOverlayContentPathBindings2 = list;
        }
        if (r1 != 0) {
            strResolveContentBindingKey = BindingLoggerKt.resolveContentBindingKey(map, "bottomContent");
        } else {
            strResolveContentBindingKey = null;
        }
        if (strResolveContentBindingKey != null) {
            objResolveStateRef5 = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
            if (objResolveStateRef5 != null) {
                BindingLoggerKt.logContentBinding("bottomContent", strResolveContentBindingKey, objResolveStateRef5);
                objUnwrapForCoercion6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                if (objUnwrapForCoercion6 instanceof String) {
                    obj = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
                    objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = null;
                    } else if (objOverlayContentPathBindings2 instanceof JsonElement) {
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(DesignSystemModel.class))), (JsonElement) objOverlayContentPathBindings2);
                    } else if (!(objOverlayContentPathBindings2 instanceof List)) {
                        if (objOverlayContentPathBindings2 instanceof Number) {
                            interfaceC21461dM65688a5 = AbstractC22671h0.m65688a(List.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings2 = (List) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings2 = (List) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings2 = (List) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings2 = (List) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings2 = (List) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings2 = (List) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                            } else {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (objOverlayContentPathBindings2 instanceof String) {
                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(DesignSystemModel.class))), AbstractC0770m.m1841c((String) objOverlayContentPathBindings2));
                            if (objOverlayContentPathBindings2 == null) {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else {
                            objOverlayContentPathBindings2 = null;
                        }
                    }
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = bottomContent;
                    }
                } else {
                    obj = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
                    objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = null;
                    } else if (objOverlayContentPathBindings2 instanceof JsonElement) {
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(DesignSystemModel.class))), (JsonElement) objOverlayContentPathBindings2);
                    } else if (!(objOverlayContentPathBindings2 instanceof List)) {
                        if (objOverlayContentPathBindings2 instanceof Number) {
                            interfaceC21461dM65688a5 = AbstractC22671h0.m65688a(List.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings2 = (List) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings2 = (List) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings2 = (List) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings2 = (List) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings2 = (List) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings2 = (List) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                            } else {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (objOverlayContentPathBindings2 instanceof String) {
                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(DesignSystemModel.class))), AbstractC0770m.m1841c((String) objOverlayContentPathBindings2));
                            if (objOverlayContentPathBindings2 == null) {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else {
                            objOverlayContentPathBindings2 = null;
                        }
                    }
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = bottomContent;
                    }
                }
            } else {
                obj = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
            }
        } else {
            obj = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
            if (objOverlayContentPathBindings2 != null) {
                objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(r1, "bottomContent", accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$6
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj12) {
                        return invoke((List<? extends DesignSystemModel>) obj12);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(List<? extends DesignSystemModel> v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            ArrayListSerializer arrayListSerializer = new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)));
                            AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                            stateBindingJson.getClass();
                            return AbstractC12313p.m34290h0(stateBindingJson, v13, arrayListSerializer);
                        } catch (Exception unused13) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$7
                    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final List<? extends DesignSystemModel> invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))), json);
                        } catch (Exception unused13) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj12 = obj;
        bottomContent2 = (List) DotPathBindingsKt.overlayAggregateBinding(map2, "bottomContent", accumulatedState, objOverlayContentPathBindings2, "bottomContent", new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$8
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj13) {
                return invoke((List<? extends DesignSystemModel>) obj13);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(List<? extends DesignSystemModel> list8) {
                try {
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, list8, interfaceC37138cM122336d);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$9
            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final List<? extends DesignSystemModel> invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))), json);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$10
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final List<? extends DesignSystemModel> invoke(Object obj13) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj13);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))), (JsonElement) UnwrapForCoercion);
                    } catch (Exception unused13) {
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
                    try {
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))), AbstractC0770m.m1841c((String) UnwrapForCoercion));
                    } catch (Exception unused14) {
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
        if (bottomContent2 == null) {
            bottomContent2 = splitColumnModel.getBottomContent();
        }
        List<DesignSystemModel> list8 = bottomContent2;
        topChildPadding = splitColumnModel.getTopChildPadding();
        if (topChildPadding == null) {
            objOverlayContentPathBindings3 = null;
        } else {
            if (topChildPadding instanceof WithGeneratedBindings) {
                objBind = ((WithGeneratedBindings) topChildPadding).bind(accumulatedState);
                if (!(objBind instanceof Double)) {
                    objBind = null;
                }
                obj2 = (Double) objBind;
                if (obj2 == null) {
                    obj2 = topChildPadding;
                }
            } else if (topChildPadding instanceof List) {
                Iterable iterable5 = (Iterable) topChildPadding;
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable5, 10));
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
                obj2 = (Double) arrayList2;
            } else {
                obj2 = topChildPadding;
            }
            objOverlayContentPathBindings3 = obj2;
        }
        if (r1 != 0) {
            strResolveContentBindingKey2 = BindingLoggerKt.resolveContentBindingKey(r1, "topChildPadding");
        } else {
            strResolveContentBindingKey2 = null;
        }
        if (strResolveContentBindingKey2 != null) {
            objResolveStateRef4 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
            if (objResolveStateRef4 != null) {
                BindingLoggerKt.logContentBinding("topChildPadding", strResolveContentBindingKey2, objResolveStateRef4);
                objUnwrapForCoercion5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if (!(objUnwrapForCoercion5 instanceof String)) {
                    objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = null;
                    } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                        JsonElement jsonElement5 = (JsonElement) objOverlayContentPathBindings3;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonElement5);
                    } else if (!(objOverlayContentPathBindings3 instanceof Double)) {
                        if (objOverlayContentPathBindings3 instanceof Number) {
                            interfaceC21461dM65688a4 = AbstractC22671h0.m65688a(Double.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings3 = (Double) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings3 = (Double) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings3 = Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings3 = (Double) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings3 = (Double) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings3 = (Double) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                            } else {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else if (objOverlayContentPathBindings3 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonPrimitiveM1841c5);
                            if (objOverlayContentPathBindings3 == null) {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else {
                            objOverlayContentPathBindings3 = null;
                        }
                    }
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = topChildPadding;
                    }
                } else {
                    objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = null;
                    } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                        JsonElement jsonElement6 = (JsonElement) objOverlayContentPathBindings3;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonElement6);
                    } else if (!(objOverlayContentPathBindings3 instanceof Double)) {
                        if (objOverlayContentPathBindings3 instanceof Number) {
                            interfaceC21461dM65688a4 = AbstractC22671h0.m65688a(Double.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings3 = (Double) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings3 = (Double) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings3 = Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings3 = (Double) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings3 = (Double) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings3 = (Double) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                            } else {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else if (objOverlayContentPathBindings3 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonPrimitiveM1841c6);
                            if (objOverlayContentPathBindings3 == null) {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else {
                            objOverlayContentPathBindings3 = null;
                        }
                    }
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = topChildPadding;
                    }
                }
            }
        } else if (objOverlayContentPathBindings3 != null) {
            objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(r1, "topChildPadding", accumulatedState, objOverlayContentPathBindings3, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$11
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj13) {
                    return invoke((Double) obj13);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Double v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(DoubleSerializer.INSTANCE, v13);
                    } catch (Exception unused13) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$12
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Double, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Double invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, json);
                    } catch (Exception unused13) {
                        return null;
                    }
                }
            });
        }
        Double d15 = (Double) DotPathBindingsKt.overlayAggregateBinding(map2, "topChildPadding", accumulatedState, objOverlayContentPathBindings3, "topChildPadding", new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$13
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj13) {
                return invoke((Double) obj13);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Double d16) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(DoubleSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, d16, interfaceC37138cM122336d);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$14
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Double, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Double invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, json);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$15
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Double, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Double, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Double invoke(Object obj13) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj13);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement7 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonElement7);
                    } catch (Exception unused13) {
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
                    JsonPrimitive jsonPrimitiveM1841c7 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonPrimitiveM1841c7);
                    } catch (Exception unused14) {
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
        bottomChildPadding = splitColumnModel.getBottomChildPadding();
        if (bottomChildPadding == null) {
            objOverlayContentPathBindings4 = null;
        } else {
            if (bottomChildPadding instanceof WithGeneratedBindings) {
                objBind2 = ((WithGeneratedBindings) bottomChildPadding).bind(accumulatedState);
                if (!(objBind2 instanceof Double)) {
                    objBind2 = null;
                }
                obj3 = (Double) objBind2;
                if (obj3 == null) {
                    obj3 = bottomChildPadding;
                }
            } else if (bottomChildPadding instanceof List) {
                Iterable iterable6 = (Iterable) bottomChildPadding;
                arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable6, 10));
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
                obj3 = (Double) arrayList3;
            } else {
                obj3 = bottomChildPadding;
            }
            objOverlayContentPathBindings4 = obj3;
        }
        if (r1 != 0) {
            strResolveContentBindingKey3 = BindingLoggerKt.resolveContentBindingKey(r1, "bottomChildPadding");
        } else {
            strResolveContentBindingKey3 = null;
        }
        if (strResolveContentBindingKey3 != null) {
            objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
            if (objResolveStateRef3 != null) {
                BindingLoggerKt.logContentBinding("bottomChildPadding", strResolveContentBindingKey3, objResolveStateRef3);
                objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if (!(objUnwrapForCoercion4 instanceof String)) {
                    objOverlayContentPathBindings4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                    if (objOverlayContentPathBindings4 == null) {
                        objOverlayContentPathBindings4 = null;
                    } else if (objOverlayContentPathBindings4 instanceof JsonElement) {
                        JsonElement jsonElement7 = (JsonElement) objOverlayContentPathBindings4;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonElement7);
                    } else if (!(objOverlayContentPathBindings4 instanceof Double)) {
                        if (objOverlayContentPathBindings4 instanceof Number) {
                            interfaceC21461dM65688a3 = AbstractC22671h0.m65688a(Double.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings4 = (Double) Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings4 = (Double) Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings4 = Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings4 = (Double) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings4 = (Double) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings4 = (Double) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                            } else {
                                objOverlayContentPathBindings4 = null;
                            }
                        } else if (objOverlayContentPathBindings4 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c7 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings4);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonPrimitiveM1841c7);
                            if (objOverlayContentPathBindings4 == null) {
                                objOverlayContentPathBindings4 = null;
                            }
                        } else {
                            objOverlayContentPathBindings4 = null;
                        }
                    }
                    if (objOverlayContentPathBindings4 == null) {
                        objOverlayContentPathBindings4 = bottomChildPadding;
                    }
                } else {
                    objOverlayContentPathBindings4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                    if (objOverlayContentPathBindings4 == null) {
                        objOverlayContentPathBindings4 = null;
                    } else if (objOverlayContentPathBindings4 instanceof JsonElement) {
                        JsonElement jsonElement8 = (JsonElement) objOverlayContentPathBindings4;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonElement8);
                    } else if (!(objOverlayContentPathBindings4 instanceof Double)) {
                        if (objOverlayContentPathBindings4 instanceof Number) {
                            interfaceC21461dM65688a3 = AbstractC22671h0.m65688a(Double.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings4 = (Double) Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings4 = (Double) Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings4 = Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings4 = (Double) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings4 = (Double) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings4 = (Double) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                            } else {
                                objOverlayContentPathBindings4 = null;
                            }
                        } else if (objOverlayContentPathBindings4 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c8 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings4);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonPrimitiveM1841c8);
                            if (objOverlayContentPathBindings4 == null) {
                                objOverlayContentPathBindings4 = null;
                            }
                        } else {
                            objOverlayContentPathBindings4 = null;
                        }
                    }
                    if (objOverlayContentPathBindings4 == null) {
                        objOverlayContentPathBindings4 = bottomChildPadding;
                    }
                }
            }
        } else if (objOverlayContentPathBindings4 != null) {
            objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(r1, "bottomChildPadding", accumulatedState, objOverlayContentPathBindings4, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$16
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj13) {
                    return invoke((Double) obj13);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Double v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(DoubleSerializer.INSTANCE, v13);
                    } catch (Exception unused13) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$17
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Double, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Double invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, json);
                    } catch (Exception unused13) {
                        return null;
                    }
                }
            });
        }
        Double d16 = (Double) DotPathBindingsKt.overlayAggregateBinding(map2, "bottomChildPadding", accumulatedState, objOverlayContentPathBindings4, "bottomChildPadding", new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$18
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj13) {
                return invoke((Double) obj13);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Double d17) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(DoubleSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, d17, interfaceC37138cM122336d);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$19
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Double, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Double invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, json);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$20
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Double, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Double, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Double invoke(Object obj13) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj13);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement9 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonElement9);
                    } catch (Exception unused13) {
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
                    JsonPrimitive jsonPrimitiveM1841c9 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonPrimitiveM1841c9);
                    } catch (Exception unused14) {
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
        bindings = splitColumnModel.getBindings();
        if (bindings == null) {
            objOverlayContentPathBindings5 = null;
        } else {
            if (bindings instanceof WithGeneratedBindings) {
                withGeneratedBindingsBind7 = ((WithGeneratedBindings) bindings).bind(accumulatedState);
                if (!(withGeneratedBindingsBind7 instanceof Map)) {
                    withGeneratedBindingsBind7 = null;
                }
                map3 = (Map) withGeneratedBindingsBind7;
                if (map3 == null) {
                    map3 = bindings;
                }
            } else if (bindings instanceof List) {
                Iterable iterable7 = (Iterable) bindings;
                arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable7, 10));
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
                map3 = (Map) arrayList4;
            } else {
                map3 = bindings;
            }
            objOverlayContentPathBindings5 = map3;
        }
        if (r1 != 0) {
            strResolveContentBindingKey4 = BindingLoggerKt.resolveContentBindingKey(r1, "bindings");
        } else {
            strResolveContentBindingKey4 = null;
        }
        if (strResolveContentBindingKey4 != null) {
            objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey4, accumulatedState);
            if (objResolveStateRef2 != null) {
                BindingLoggerKt.logContentBinding("bindings", strResolveContentBindingKey4, objResolveStateRef2);
                objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                if (!(objUnwrapForCoercion3 instanceof String)) {
                    objOverlayContentPathBindings5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (objOverlayContentPathBindings5 == null) {
                        objOverlayContentPathBindings5 = null;
                    } else if (objOverlayContentPathBindings5 instanceof JsonElement) {
                        JsonElement jsonElement9 = (JsonElement) objOverlayContentPathBindings5;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                        objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), jsonElement9);
                    } else if (!(objOverlayContentPathBindings5 instanceof Map)) {
                        if (objOverlayContentPathBindings5 instanceof Number) {
                            interfaceC21461dM65688a2 = AbstractC22671h0.m65688a(Map.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings5 = (Map) Integer.valueOf(((Number) objOverlayContentPathBindings5).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings5 = (Map) Long.valueOf(((Number) objOverlayContentPathBindings5).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings5 = (Map) Double.valueOf(((Number) objOverlayContentPathBindings5).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings5 = (Map) Float.valueOf(((Number) objOverlayContentPathBindings5).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings5 = (Map) Short.valueOf(((Number) objOverlayContentPathBindings5).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings5 = (Map) Byte.valueOf(((Number) objOverlayContentPathBindings5).byteValue());
                            } else {
                                objOverlayContentPathBindings5 = null;
                            }
                        } else if (objOverlayContentPathBindings5 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c9 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings5);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer4 = StringSerializer.INSTANCE;
                            objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer4, stringSerializer4), jsonPrimitiveM1841c9);
                            if (objOverlayContentPathBindings5 == null) {
                                objOverlayContentPathBindings5 = null;
                            }
                        } else {
                            objOverlayContentPathBindings5 = null;
                        }
                    }
                    if (objOverlayContentPathBindings5 == null) {
                        objOverlayContentPathBindings5 = bindings;
                    }
                } else {
                    objOverlayContentPathBindings5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (objOverlayContentPathBindings5 == null) {
                        objOverlayContentPathBindings5 = null;
                    } else if (objOverlayContentPathBindings5 instanceof JsonElement) {
                        JsonElement jsonElement10 = (JsonElement) objOverlayContentPathBindings5;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer5 = StringSerializer.INSTANCE;
                        objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer5, stringSerializer5), jsonElement10);
                    } else if (!(objOverlayContentPathBindings5 instanceof Map)) {
                        if (objOverlayContentPathBindings5 instanceof Number) {
                            interfaceC21461dM65688a2 = AbstractC22671h0.m65688a(Map.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings5 = (Map) Integer.valueOf(((Number) objOverlayContentPathBindings5).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings5 = (Map) Long.valueOf(((Number) objOverlayContentPathBindings5).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings5 = (Map) Double.valueOf(((Number) objOverlayContentPathBindings5).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings5 = (Map) Float.valueOf(((Number) objOverlayContentPathBindings5).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings5 = (Map) Short.valueOf(((Number) objOverlayContentPathBindings5).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings5 = (Map) Byte.valueOf(((Number) objOverlayContentPathBindings5).byteValue());
                            } else {
                                objOverlayContentPathBindings5 = null;
                            }
                        } else if (objOverlayContentPathBindings5 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c10 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings5);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer6 = StringSerializer.INSTANCE;
                            objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer6, stringSerializer6), jsonPrimitiveM1841c10);
                            if (objOverlayContentPathBindings5 == null) {
                                objOverlayContentPathBindings5 = null;
                            }
                        } else {
                            objOverlayContentPathBindings5 = null;
                        }
                    }
                    if (objOverlayContentPathBindings5 == null) {
                        objOverlayContentPathBindings5 = bindings;
                    }
                }
            }
        } else if (objOverlayContentPathBindings5 != null) {
            objOverlayContentPathBindings5 = ContentPathBindingsKt.overlayContentPathBindings(r1, "bindings", accumulatedState, objOverlayContentPathBindings5, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$21
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj13) {
                    return invoke((Map<String, ? extends String>) obj13);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Map<String, ? extends String> v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer7 = StringSerializer.INSTANCE;
                        LinkedHashMapSerializer linkedHashMapSerializer = new LinkedHashMapSerializer(stringSerializer7, stringSerializer7);
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, v13, linkedHashMapSerializer);
                    } catch (Exception unused13) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$22
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Map<String, ? extends String> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer7 = StringSerializer.INSTANCE;
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer7, stringSerializer7), json);
                    } catch (Exception unused13) {
                        return null;
                    }
                }
            });
        }
        Map map6 = (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "bindings", accumulatedState, objOverlayContentPathBindings5, "bindings", new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$23
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj13) {
                return invoke((Map<String, ? extends String>) obj13);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Map<String, ? extends String> map7) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    StringSerializer stringSerializer7 = StringSerializer.INSTANCE;
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new LinkedHashMapSerializer(stringSerializer7, stringSerializer7));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, map7, interfaceC37138cM122336d);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$24
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends String> invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    StringSerializer stringSerializer7 = StringSerializer.INSTANCE;
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer7, stringSerializer7), json);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$25
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends java.lang.String>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends String> invoke(Object obj13) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj13);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement11 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer7 = StringSerializer.INSTANCE;
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer7, stringSerializer7), jsonElement11);
                    } catch (Exception unused13) {
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
                        StringSerializer stringSerializer8 = StringSerializer.INSTANCE;
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer8, stringSerializer8), jsonPrimitiveM1841c11);
                    } catch (Exception unused14) {
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
        aggregateBindings = splitColumnModel.getAggregateBindings();
        if (aggregateBindings == null) {
            obj4 = null;
        } else {
            if (aggregateBindings instanceof WithGeneratedBindings) {
                withGeneratedBindingsBind9 = ((WithGeneratedBindings) aggregateBindings).bind(accumulatedState);
                if (!(withGeneratedBindingsBind9 instanceof Map)) {
                    withGeneratedBindingsBind9 = null;
                }
                map4 = (Map) withGeneratedBindingsBind9;
                if (map4 == null) {
                    map4 = aggregateBindings;
                }
            } else if (aggregateBindings instanceof List) {
                Iterable iterable8 = (Iterable) aggregateBindings;
                arrayList5 = new ArrayList(AbstractC25267u.m74163i0(iterable8, 10));
                while (r2.hasNext()) {
                    if (obj11 instanceof WithGeneratedBindings) {
                        withGeneratedBindings5 = (WithGeneratedBindings) obj11;
                    } else {
                        withGeneratedBindings5 = null;
                    }
                    if (withGeneratedBindings5 == null) {
                    }
                    arrayList5.add(obj11);
                }
                map4 = (Map) arrayList5;
            } else {
                map4 = aggregateBindings;
            }
            obj4 = map4;
        }
        if (r1 != 0) {
            strResolveContentBindingKey5 = BindingLoggerKt.resolveContentBindingKey(r1, "aggregateBindings");
        } else {
            strResolveContentBindingKey5 = null;
        }
        if (strResolveContentBindingKey5 != null) {
            objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey5, accumulatedState);
            if (objResolveStateRef != null) {
                BindingLoggerKt.logContentBinding("aggregateBindings", strResolveContentBindingKey5, objResolveStateRef);
                objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                if (!(objUnwrapForCoercion instanceof String)) {
                    objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (objUnwrapForCoercion2 == null) {
                        objOverlayContentPathBindings6 = null;
                    } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                        JsonElement jsonElement11 = (JsonElement) objUnwrapForCoercion2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings6 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement11);
                    } else if (objUnwrapForCoercion2 instanceof Map) {
                        if (objUnwrapForCoercion2 instanceof Number) {
                            interfaceC21461dM65688a = AbstractC22671h0.m65688a(Map.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings6 = (Map) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings6 = (Map) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings6 = (Map) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings6 = (Map) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings6 = (Map) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings6 = (Map) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                            }
                        } else if (objUnwrapForCoercion2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c11 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c11);
                            if (objUnwrapForCoercion2 != null) {
                                objOverlayContentPathBindings6 = objUnwrapForCoercion2;
                            }
                        }
                        objOverlayContentPathBindings6 = null;
                    } else {
                        objOverlayContentPathBindings6 = objUnwrapForCoercion2;
                    }
                    if (objOverlayContentPathBindings6 == null) {
                        obj4 = aggregateBindings;
                    } else {
                        obj4 = objOverlayContentPathBindings6;
                    }
                } else {
                    objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (objUnwrapForCoercion2 == null) {
                        objOverlayContentPathBindings6 = null;
                    } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                        JsonElement jsonElement12 = (JsonElement) objUnwrapForCoercion2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings6 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement12);
                    } else if (objUnwrapForCoercion2 instanceof Map) {
                        if (objUnwrapForCoercion2 instanceof Number) {
                            interfaceC21461dM65688a = AbstractC22671h0.m65688a(Map.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings6 = (Map) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings6 = (Map) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings6 = (Map) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings6 = (Map) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings6 = (Map) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings6 = (Map) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                            }
                        } else if (objUnwrapForCoercion2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c12 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c12);
                            if (objUnwrapForCoercion2 != null) {
                                objOverlayContentPathBindings6 = objUnwrapForCoercion2;
                            }
                        }
                        objOverlayContentPathBindings6 = null;
                    } else {
                        objOverlayContentPathBindings6 = objUnwrapForCoercion2;
                    }
                    if (objOverlayContentPathBindings6 == null) {
                        obj4 = aggregateBindings;
                    } else {
                        obj4 = objOverlayContentPathBindings6;
                    }
                }
            }
        } else if (obj4 != null) {
            objOverlayContentPathBindings6 = ContentPathBindingsKt.overlayContentPathBindings(r1, "aggregateBindings", accumulatedState, obj4, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$26
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj13) {
                    return invoke((Map<String, ? extends AggregateBinding>) obj13);
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
                    } catch (Exception unused13) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$27
                /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Map<String, ? extends AggregateBinding> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), json);
                    } catch (Exception unused13) {
                        return null;
                    }
                }
            });
            obj4 = objOverlayContentPathBindings6;
        }
        return (SplitColumnModel) ContentBindingResolverKt.copyBindingsFrom(new SplitColumnModel(list6, list8, d15, d16, map6, (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "aggregateBindings", accumulatedState, obj4, "aggregateBindings", new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$28
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj13) {
                return invoke((Map<String, ? extends AggregateBinding>) obj13);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Map<String, ? extends AggregateBinding> map7) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, map7, interfaceC37138cM122336d);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$29
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends AggregateBinding> invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), json);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.SplitColumnModelStateBindingKt$generatedBind$$inlined$resolveBinding$30
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends AggregateBinding> invoke(Object obj13) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj13);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement13 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement13);
                    } catch (Exception unused13) {
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
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c13);
                    } catch (Exception unused14) {
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
        })), splitColumnModel);
    }

    public static /* synthetic */ SplitColumnModel generatedBind$default(SplitColumnModel splitColumnModel, Map map, Map map2, Map map3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map2 = null;
        }
        return generatedBind(splitColumnModel, map, map2, map3);
    }
}
