package com.whoop.design.models.test.fixtures;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
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
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003¨\u0006\t"}, m65681d2 = {"generatedBind", "Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;", "contentBinding", "", "", "aggregateBindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "accumulatedState", "", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PrimitiveBindTestFixtureStateBindingKt {
    /* JADX WARN: Code duplicated, block: B:101:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:104:0x01de  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ef A[PHI: r2
      0x01ef: PHI (r2v68 java.lang.Integer) = (r2v15 java.lang.Integer), (r2v73 java.lang.Integer) binds: [B:126:0x0228, B:108:0x01ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:116:0x020d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0215  */
    /* JADX WARN: Code duplicated, block: B:119:0x0219  */
    /* JADX WARN: Code duplicated, block: B:127:0x022c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0231  */
    /* JADX WARN: Code duplicated, block: B:131:0x0236  */
    /* JADX WARN: Code duplicated, block: B:133:0x0239  */
    /* JADX WARN: Code duplicated, block: B:135:0x023f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0261  */
    /* JADX WARN: Code duplicated, block: B:144:0x0267  */
    /* JADX WARN: Code duplicated, block: B:145:0x026a  */
    /* JADX WARN: Code duplicated, block: B:147:0x026e  */
    /* JADX WARN: Code duplicated, block: B:150:0x0283  */
    /* JADX WARN: Code duplicated, block: B:153:0x0289  */
    /* JADX WARN: Code duplicated, block: B:155:0x028d  */
    /* JADX WARN: Code duplicated, block: B:157:0x029f  */
    /* JADX WARN: Code duplicated, block: B:158:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:160:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:161:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:163:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:164:0x02da  */
    /* JADX WARN: Code duplicated, block: B:166:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:167:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:169:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:170:0x0308  */
    /* JADX WARN: Code duplicated, block: B:172:0x0312  */
    /* JADX WARN: Code duplicated, block: B:173:0x031f  */
    /* JADX WARN: Code duplicated, block: B:175:0x0323  */
    /* JADX WARN: Code duplicated, block: B:181:0x0340  */
    /* JADX WARN: Code duplicated, block: B:182:0x0342  */
    /* JADX WARN: Code duplicated, block: B:185:0x035e  */
    /* JADX WARN: Code duplicated, block: B:187:0x0365  */
    /* JADX WARN: Code duplicated, block: B:190:0x0376  */
    /* JADX WARN: Code duplicated, block: B:192:0x0381  */
    /* JADX WARN: Code duplicated, block: B:196:0x0387 A[PHI: r2
      0x0387: PHI (r2v61 java.lang.Boolean) = (r2v25 java.lang.Boolean), (r2v66 java.lang.Boolean) binds: [B:212:0x03c0, B:194:0x0384] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:197:0x0389  */
    /* JADX WARN: Code duplicated, block: B:199:0x038d  */
    /* JADX WARN: Code duplicated, block: B:202:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:204:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:205:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:213:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:216:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:217:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:219:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:221:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:228:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:230:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:231:0x0402  */
    /* JADX WARN: Code duplicated, block: B:233:0x0406  */
    /* JADX WARN: Code duplicated, block: B:236:0x041b  */
    /* JADX WARN: Code duplicated, block: B:239:0x0421  */
    /* JADX WARN: Code duplicated, block: B:241:0x0425  */
    /* JADX WARN: Code duplicated, block: B:243:0x0437  */
    /* JADX WARN: Code duplicated, block: B:244:0x0445  */
    /* JADX WARN: Code duplicated, block: B:246:0x044f  */
    /* JADX WARN: Code duplicated, block: B:247:0x045d  */
    /* JADX WARN: Code duplicated, block: B:249:0x0467  */
    /* JADX WARN: Code duplicated, block: B:250:0x0474  */
    /* JADX WARN: Code duplicated, block: B:252:0x047e  */
    /* JADX WARN: Code duplicated, block: B:253:0x048b  */
    /* JADX WARN: Code duplicated, block: B:255:0x0495  */
    /* JADX WARN: Code duplicated, block: B:256:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:258:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:259:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:261:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:267:0x04da  */
    /* JADX WARN: Code duplicated, block: B:268:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:271:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:273:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:276:0x0510  */
    /* JADX WARN: Code duplicated, block: B:278:0x051b  */
    /* JADX WARN: Code duplicated, block: B:282:0x0521 A[PHI: r2
      0x0521: PHI (r2v54 java.lang.Long) = (r2v35 java.lang.Long), (r2v59 java.lang.Long) binds: [B:298:0x055a, B:280:0x051e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:283:0x0523  */
    /* JADX WARN: Code duplicated, block: B:285:0x0527  */
    /* JADX WARN: Code duplicated, block: B:288:0x053f  */
    /* JADX WARN: Code duplicated, block: B:290:0x0547  */
    /* JADX WARN: Code duplicated, block: B:291:0x054b  */
    /* JADX WARN: Code duplicated, block: B:299:0x055e  */
    /* JADX WARN: Code duplicated, block: B:302:0x0563  */
    /* JADX WARN: Code duplicated, block: B:303:0x0568  */
    /* JADX WARN: Code duplicated, block: B:305:0x056b  */
    /* JADX WARN: Code duplicated, block: B:307:0x0571  */
    /* JADX WARN: Code duplicated, block: B:314:0x0593  */
    /* JADX WARN: Code duplicated, block: B:316:0x0599  */
    /* JADX WARN: Code duplicated, block: B:317:0x059c  */
    /* JADX WARN: Code duplicated, block: B:319:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:322:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:325:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:327:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:329:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:330:0x05df  */
    /* JADX WARN: Code duplicated, block: B:332:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:333:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:335:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:336:0x060c  */
    /* JADX WARN: Code duplicated, block: B:338:0x0616  */
    /* JADX WARN: Code duplicated, block: B:339:0x0623  */
    /* JADX WARN: Code duplicated, block: B:341:0x062d  */
    /* JADX WARN: Code duplicated, block: B:342:0x063a  */
    /* JADX WARN: Code duplicated, block: B:344:0x0644  */
    /* JADX WARN: Code duplicated, block: B:345:0x0651  */
    /* JADX WARN: Code duplicated, block: B:347:0x0655  */
    /* JADX WARN: Code duplicated, block: B:353:0x0672  */
    /* JADX WARN: Code duplicated, block: B:354:0x0674  */
    /* JADX WARN: Code duplicated, block: B:357:0x0690  */
    /* JADX WARN: Code duplicated, block: B:359:0x0697  */
    /* JADX WARN: Code duplicated, block: B:362:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:364:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:368:0x06b9 A[PHI: r2
      0x06b9: PHI (r2v47 java.lang.Double) = (r2v45 java.lang.Double), (r2v52 java.lang.Double) binds: [B:384:0x06f2, B:366:0x06b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:369:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:371:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:374:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:376:0x06df  */
    /* JADX WARN: Code duplicated, block: B:377:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:385:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:388:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:389:0x0700  */
    /* JADX WARN: Code duplicated, block: B:391:0x0703  */
    /* JADX WARN: Code duplicated, block: B:393:0x0709  */
    /* JADX WARN: Code duplicated, block: B:400:0x072b  */
    /* JADX WARN: Code duplicated, block: B:402:0x0731  */
    /* JADX WARN: Code duplicated, block: B:403:0x0734  */
    /* JADX WARN: Code duplicated, block: B:405:0x0738  */
    /* JADX WARN: Code duplicated, block: B:408:0x074d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:410:0x0751 A[PHI: r0
      0x0751: PHI (r0v31 java.lang.Object) = (r0v10 java.lang.Object), (r0v14 java.lang.Object) binds: [B:409:0x074f, B:437:0x080c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:411:0x0754  */
    /* JADX WARN: Code duplicated, block: B:413:0x0758  */
    /* JADX WARN: Code duplicated, block: B:415:0x076a  */
    /* JADX WARN: Code duplicated, block: B:416:0x0779  */
    /* JADX WARN: Code duplicated, block: B:418:0x0783  */
    /* JADX WARN: Code duplicated, block: B:419:0x0792  */
    /* JADX WARN: Code duplicated, block: B:421:0x079c  */
    /* JADX WARN: Code duplicated, block: B:422:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:424:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:425:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:427:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:428:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:430:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:431:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:433:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:440:0x0812  */
    /* JADX WARN: Code duplicated, block: B:442:0x0816  */
    /* JADX WARN: Code duplicated, block: B:445:0x0833  */
    /* JADX WARN: Code duplicated, block: B:447:0x083a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final PrimitiveBindTestFixture generatedBind(PrimitiveBindTestFixture primitiveBindTestFixture, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, ? extends Object> accumulatedState) {
        Object objOverlayContentPathBindings;
        WithGeneratedBindings withGeneratedBindingsBind;
        String stringValue;
        Object objValueOf;
        ArrayList arrayList;
        Integer num;
        WithGeneratedBindings withGeneratedBindings;
        WithGeneratedBindings withGeneratedBindingsBind2;
        Object objOverlayContentPathBindings2;
        String strResolveContentBindingKey;
        Integer num2;
        int intValue;
        Object objValueOf2;
        ArrayList arrayList2;
        Boolean bool;
        WithGeneratedBindings withGeneratedBindings2;
        WithGeneratedBindings withGeneratedBindingsBind3;
        Object objOverlayContentPathBindings3;
        String strResolveContentBindingKey2;
        Boolean bool2;
        boolean booleanValue;
        Object objValueOf3;
        ArrayList arrayList3;
        Long l7;
        WithGeneratedBindings withGeneratedBindings3;
        WithGeneratedBindings withGeneratedBindingsBind4;
        Object objOverlayContentPathBindings4;
        String strResolveContentBindingKey3;
        Long l12;
        long longValue;
        Object objValueOf4;
        ArrayList arrayList4;
        Double d3;
        WithGeneratedBindings withGeneratedBindings4;
        WithGeneratedBindings withGeneratedBindingsBind5;
        Object obj;
        String strResolveContentBindingKey4;
        Object objOverlayContentPathBindings5;
        Double d14;
        double doubleValue;
        Object objResolveStateRef;
        Object objUnwrapForCoercion;
        Object objUnwrapForCoercion2;
        C22673i0 c22673i0;
        InterfaceC21461d orCreateKotlinClass;
        Object objBind;
        Object objResolveStateRef2;
        Object objUnwrapForCoercion3;
        C22673i0 c22673i1;
        InterfaceC21461d orCreateKotlinClass2;
        Object objBind2;
        Object objResolveStateRef3;
        Object objUnwrapForCoercion4;
        C22673i0 c22673i2;
        InterfaceC21461d orCreateKotlinClass3;
        Object objBind3;
        Object objResolveStateRef4;
        Object objUnwrapForCoercion5;
        C22673i0 c22673i3;
        InterfaceC21461d orCreateKotlinClass4;
        Object objBind4;
        AbstractC22676k.m65750j(primitiveBindTestFixture, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if ((map == null || map.isEmpty()) && ((map2 == null || map2.isEmpty()) && accumulatedState.isEmpty())) {
            return primitiveBindTestFixture;
        }
        Object stringValue2 = primitiveBindTestFixture.getStringValue();
        if (stringValue2 == null) {
            objOverlayContentPathBindings = null;
        } else if (stringValue2 instanceof WithGeneratedBindings) {
            Object objBind5 = ((WithGeneratedBindings) stringValue2).bind(accumulatedState);
            if (!(objBind5 instanceof String)) {
                objBind5 = null;
            }
            objOverlayContentPathBindings = (String) objBind5;
            if (objOverlayContentPathBindings == null) {
                objOverlayContentPathBindings = stringValue2;
            }
        } else if (stringValue2 instanceof List) {
            Iterable iterable = (Iterable) stringValue2;
            ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            for (Object obj2 : iterable) {
                WithGeneratedBindings withGeneratedBindings5 = obj2 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj2 : null;
                if (withGeneratedBindings5 != null && (withGeneratedBindingsBind = withGeneratedBindings5.bind(accumulatedState)) != null) {
                    obj2 = withGeneratedBindingsBind;
                }
                arrayList5.add(obj2);
            }
            objOverlayContentPathBindings = (String) arrayList5;
        } else {
            objOverlayContentPathBindings = stringValue2;
        }
        String strResolveContentBindingKey5 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "stringValue") : null;
        Class cls = Byte.TYPE;
        Class cls2 = Short.TYPE;
        Class cls3 = Float.TYPE;
        Class cls4 = Double.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        if (strResolveContentBindingKey5 != null) {
            Object objResolveStateRef5 = StateLookupKt.resolveStateRef(strResolveContentBindingKey5, accumulatedState);
            if (objResolveStateRef5 != null) {
                BindingLoggerKt.logContentBinding("stringValue", strResolveContentBindingKey5, objResolveStateRef5);
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
                            objOverlayContentPathBindings = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement);
                        } catch (Exception unused) {
                            objOverlayContentPathBindings = null;
                        }
                    } else {
                        boolean z4 = objOverlayContentPathBindings instanceof String;
                        if (!z4) {
                            if (objOverlayContentPathBindings instanceof Number) {
                                C22673i0 c22673i4 = AbstractC22671h0.f89337a;
                                InterfaceC21461d orCreateKotlinClass5 = c22673i4.getOrCreateKotlinClass(String.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings = (String) Integer.valueOf(((Number) objOverlayContentPathBindings).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings = (String) Long.valueOf(((Number) objOverlayContentPathBindings).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings = (String) Double.valueOf(((Number) objOverlayContentPathBindings).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings = (String) Float.valueOf(((Number) objOverlayContentPathBindings).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls2))) {
                                    objOverlayContentPathBindings = (String) Short.valueOf(((Number) objOverlayContentPathBindings).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls))) {
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
                        objOverlayContentPathBindings = stringValue2;
                    }
                }
            }
            stringValue = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "stringValue", accumulatedState, objOverlayContentPathBindings, "stringValue", new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$3
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    return invoke((String) obj3);
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
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$4
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
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$5
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
                @Override // p715kotlin.jvm.functions.Function1
                public final String invoke(Object obj3) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj3);
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
            if (stringValue == null) {
                stringValue = primitiveBindTestFixture.getStringValue();
            }
            String str = stringValue;
            objValueOf = Integer.valueOf(primitiveBindTestFixture.getIntValue());
            if (objValueOf instanceof WithGeneratedBindings) {
                objBind4 = ((WithGeneratedBindings) objValueOf).bind(accumulatedState);
                if (!(objBind4 instanceof Integer)) {
                    objBind4 = null;
                }
                num = (Integer) objBind4;
                if (num == null) {
                    objOverlayContentPathBindings2 = objValueOf;
                } else {
                    objOverlayContentPathBindings2 = num;
                }
            } else if (objValueOf instanceof List) {
                Iterable iterable2 = (Iterable) objValueOf;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
                for (Object obj3 : iterable2) {
                    if (obj3 instanceof WithGeneratedBindings) {
                        withGeneratedBindings = (WithGeneratedBindings) obj3;
                    } else {
                        withGeneratedBindings = null;
                    }
                    if (withGeneratedBindings == null && (withGeneratedBindingsBind2 = withGeneratedBindings.bind(accumulatedState)) != null) {
                        obj3 = withGeneratedBindingsBind2;
                    }
                    arrayList.add(obj3);
                }
                num = (Integer) arrayList;
                objOverlayContentPathBindings2 = num;
            } else {
                objOverlayContentPathBindings2 = objValueOf;
            }
            if (r1 != 0) {
                strResolveContentBindingKey = BindingLoggerKt.resolveContentBindingKey(map, "intValue");
            } else {
                strResolveContentBindingKey = null;
            }
            if (strResolveContentBindingKey != null) {
                objResolveStateRef4 = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
                if (objResolveStateRef4 != null) {
                    BindingLoggerKt.logContentBinding("intValue", strResolveContentBindingKey, objResolveStateRef4);
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
                                objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, jsonElement2);
                            } catch (Exception unused3) {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (!(objOverlayContentPathBindings2 instanceof Integer)) {
                            if (objOverlayContentPathBindings2 instanceof Number) {
                                c22673i3 = AbstractC22671h0.f89337a;
                                orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(Integer.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings2 = Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings2 = (Integer) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings2 = (Integer) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings2 = (Integer) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls2))) {
                                    objOverlayContentPathBindings2 = (Integer) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls))) {
                                    objOverlayContentPathBindings2 = (Integer) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                                } else {
                                    objOverlayContentPathBindings2 = null;
                                }
                            } else if (objOverlayContentPathBindings2 instanceof String) {
                                JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, jsonPrimitiveM1841c2);
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
                            objOverlayContentPathBindings2 = objValueOf;
                        }
                    }
                }
            } else {
                objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(r1, "intValue", accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$6
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                        return invoke((Integer) obj4);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(Integer v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(IntSerializer.INSTANCE, v13);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$7
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Integer, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Integer invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, json);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                });
            }
            num2 = (Integer) DotPathBindingsKt.overlayAggregateBinding(map2, "intValue", accumulatedState, objOverlayContentPathBindings2, "intValue", new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$8
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                    return invoke((Integer) obj4);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Integer num3) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(IntSerializer.INSTANCE);
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, num3, interfaceC37138cM122336d);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$9
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Integer, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Integer invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, json);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$10
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Integer, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Integer, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Integer invoke(Object obj4) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj4);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement3 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, jsonElement3);
                        } catch (Exception unused5) {
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
                        JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, jsonPrimitiveM1841c3);
                        } catch (Exception unused6) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(Integer.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                        return Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                        return (Integer) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                        return (Integer) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                        return (Integer) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                        return (Integer) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (Integer) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            });
            if (num2 != null) {
                intValue = num2.intValue();
            } else {
                intValue = primitiveBindTestFixture.getIntValue();
            }
            int i13 = intValue;
            objValueOf2 = Boolean.valueOf(primitiveBindTestFixture.getBooleanValue());
            if (objValueOf2 instanceof WithGeneratedBindings) {
                objBind3 = ((WithGeneratedBindings) objValueOf2).bind(accumulatedState);
                if (!(objBind3 instanceof Boolean)) {
                    objBind3 = null;
                }
                bool = (Boolean) objBind3;
                if (bool == null) {
                    objOverlayContentPathBindings3 = objValueOf2;
                } else {
                    objOverlayContentPathBindings3 = bool;
                }
            } else if (objValueOf2 instanceof List) {
                Iterable iterable3 = (Iterable) objValueOf2;
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable3, 10));
                for (Object obj4 : iterable3) {
                    if (obj4 instanceof WithGeneratedBindings) {
                        withGeneratedBindings2 = (WithGeneratedBindings) obj4;
                    } else {
                        withGeneratedBindings2 = null;
                    }
                    if (withGeneratedBindings2 == null && (withGeneratedBindingsBind3 = withGeneratedBindings2.bind(accumulatedState)) != null) {
                        obj4 = withGeneratedBindingsBind3;
                    }
                    arrayList2.add(obj4);
                }
                bool = (Boolean) arrayList2;
                objOverlayContentPathBindings3 = bool;
            } else {
                objOverlayContentPathBindings3 = objValueOf2;
            }
            if (r1 != 0) {
                strResolveContentBindingKey2 = BindingLoggerKt.resolveContentBindingKey(r1, "booleanValue");
            } else {
                strResolveContentBindingKey2 = null;
            }
            if (strResolveContentBindingKey2 != null) {
                objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
                if (objResolveStateRef3 != null) {
                    BindingLoggerKt.logContentBinding("booleanValue", strResolveContentBindingKey2, objResolveStateRef3);
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
                                objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement3);
                            } catch (Exception unused5) {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else if (!(objOverlayContentPathBindings3 instanceof Boolean)) {
                            if (objOverlayContentPathBindings3 instanceof Number) {
                                c22673i2 = AbstractC22671h0.f89337a;
                                orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(Boolean.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings3 = (Boolean) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings3 = (Boolean) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings3 = (Boolean) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings3 = (Boolean) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls2))) {
                                    objOverlayContentPathBindings3 = (Boolean) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls))) {
                                    objOverlayContentPathBindings3 = (Boolean) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                                } else {
                                    objOverlayContentPathBindings3 = null;
                                }
                            } else if (objOverlayContentPathBindings3 instanceof String) {
                                JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c3);
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
                            objOverlayContentPathBindings3 = objValueOf2;
                        }
                    }
                }
            } else {
                objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(r1, "booleanValue", accumulatedState, objOverlayContentPathBindings3, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$11
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                        return invoke((Boolean) obj5);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(Boolean v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(BooleanSerializer.INSTANCE, v13);
                        } catch (Exception unused7) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$12
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Boolean invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                        } catch (Exception unused7) {
                            return null;
                        }
                    }
                });
            }
            bool2 = (Boolean) DotPathBindingsKt.overlayAggregateBinding(map2, "booleanValue", accumulatedState, objOverlayContentPathBindings3, "booleanValue", new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$13
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                    return invoke((Boolean) obj5);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Boolean bool3) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(BooleanSerializer.INSTANCE);
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, bool3, interfaceC37138cM122336d);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$14
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Boolean invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$15
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Boolean, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Boolean, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Boolean invoke(Object obj5) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj5);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement4 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement4);
                        } catch (Exception unused7) {
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
                        JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c4);
                        } catch (Exception unused8) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(Boolean.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (Boolean) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                        return (Boolean) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                        return (Boolean) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                        return (Boolean) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                        return (Boolean) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (Boolean) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            });
            if (bool2 != null) {
                booleanValue = bool2.booleanValue();
            } else {
                booleanValue = primitiveBindTestFixture.getBooleanValue();
            }
            boolean z13 = booleanValue;
            objValueOf3 = Long.valueOf(primitiveBindTestFixture.getLongValue());
            if (objValueOf3 instanceof WithGeneratedBindings) {
                objBind2 = ((WithGeneratedBindings) objValueOf3).bind(accumulatedState);
                if (!(objBind2 instanceof Long)) {
                    objBind2 = null;
                }
                l7 = (Long) objBind2;
                if (l7 == null) {
                    objOverlayContentPathBindings4 = objValueOf3;
                } else {
                    objOverlayContentPathBindings4 = l7;
                }
            } else if (objValueOf3 instanceof List) {
                Iterable iterable4 = (Iterable) objValueOf3;
                arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable4, 10));
                for (Object obj5 : iterable4) {
                    if (obj5 instanceof WithGeneratedBindings) {
                        withGeneratedBindings3 = (WithGeneratedBindings) obj5;
                    } else {
                        withGeneratedBindings3 = null;
                    }
                    if (withGeneratedBindings3 == null && (withGeneratedBindingsBind4 = withGeneratedBindings3.bind(accumulatedState)) != null) {
                        obj5 = withGeneratedBindingsBind4;
                    }
                    arrayList3.add(obj5);
                }
                l7 = (Long) arrayList3;
                objOverlayContentPathBindings4 = l7;
            } else {
                objOverlayContentPathBindings4 = objValueOf3;
            }
            if (r1 != 0) {
                strResolveContentBindingKey3 = BindingLoggerKt.resolveContentBindingKey(r1, "longValue");
            } else {
                strResolveContentBindingKey3 = null;
            }
            if (strResolveContentBindingKey3 != null) {
                objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
                if (objResolveStateRef2 != null) {
                    BindingLoggerKt.logContentBinding("longValue", strResolveContentBindingKey3, objResolveStateRef2);
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
                                objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(LongSerializer.INSTANCE, jsonElement4);
                            } catch (Exception unused7) {
                                objOverlayContentPathBindings4 = null;
                            }
                        } else if (!(objOverlayContentPathBindings4 instanceof Long)) {
                            if (objOverlayContentPathBindings4 instanceof Number) {
                                c22673i1 = AbstractC22671h0.f89337a;
                                orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(Long.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings4 = (Long) Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings4 = Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings4 = (Long) Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings4 = (Long) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls2))) {
                                    objOverlayContentPathBindings4 = (Long) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                    objOverlayContentPathBindings4 = (Long) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                                } else {
                                    objOverlayContentPathBindings4 = null;
                                }
                            } else if (objOverlayContentPathBindings4 instanceof String) {
                                JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings4);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(LongSerializer.INSTANCE, jsonPrimitiveM1841c4);
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
                            objOverlayContentPathBindings4 = objValueOf3;
                        }
                    }
                }
            } else {
                objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(r1, "longValue", accumulatedState, objOverlayContentPathBindings4, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$16
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj6) {
                        return invoke((Long) obj6);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(Long v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(LongSerializer.INSTANCE, v13);
                        } catch (Exception unused9) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$17
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Long, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Long invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(LongSerializer.INSTANCE, json);
                        } catch (Exception unused9) {
                            return null;
                        }
                    }
                });
            }
            l12 = (Long) DotPathBindingsKt.overlayAggregateBinding(map2, "longValue", accumulatedState, objOverlayContentPathBindings4, "longValue", new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$18
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj6) {
                    return invoke((Long) obj6);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Long l13) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(LongSerializer.INSTANCE);
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, l13, interfaceC37138cM122336d);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$19
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Long, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Long invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(LongSerializer.INSTANCE, json);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$20
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Long, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Long, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Long invoke(Object obj6) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj6);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement5 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(LongSerializer.INSTANCE, jsonElement5);
                        } catch (Exception unused9) {
                            return null;
                        }
                    }
                    if (UnwrapForCoercion instanceof Long) {
                        return UnwrapForCoercion;
                    }
                    if (!(UnwrapForCoercion instanceof Number)) {
                        if (!(UnwrapForCoercion instanceof String)) {
                            return null;
                        }
                        JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(LongSerializer.INSTANCE, jsonPrimitiveM1841c5);
                        } catch (Exception unused10) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(Long.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (Long) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                        return Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                        return (Long) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                        return (Long) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                        return (Long) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (Long) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            });
            if (l12 != null) {
                longValue = l12.longValue();
            } else {
                longValue = primitiveBindTestFixture.getLongValue();
            }
            long j7 = longValue;
            objValueOf4 = Double.valueOf(primitiveBindTestFixture.getDoubleValue());
            if (objValueOf4 instanceof WithGeneratedBindings) {
                objBind = ((WithGeneratedBindings) objValueOf4).bind(accumulatedState);
                if (!(objBind instanceof Double)) {
                    objBind = null;
                }
                d3 = (Double) objBind;
                if (d3 == null) {
                    obj = objValueOf4;
                } else {
                    obj = d3;
                }
            } else if (objValueOf4 instanceof List) {
                Iterable iterable5 = (Iterable) objValueOf4;
                arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable5, 10));
                for (Object obj6 : iterable5) {
                    if (obj6 instanceof WithGeneratedBindings) {
                        withGeneratedBindings4 = (WithGeneratedBindings) obj6;
                    } else {
                        withGeneratedBindings4 = null;
                    }
                    if (withGeneratedBindings4 == null && (withGeneratedBindingsBind5 = withGeneratedBindings4.bind(accumulatedState)) != null) {
                        obj6 = withGeneratedBindingsBind5;
                    }
                    arrayList4.add(obj6);
                }
                d3 = (Double) arrayList4;
                obj = d3;
            } else {
                obj = objValueOf4;
            }
            if (r1 != 0) {
                strResolveContentBindingKey4 = BindingLoggerKt.resolveContentBindingKey(r1, "doubleValue");
            } else {
                strResolveContentBindingKey4 = null;
            }
            if (strResolveContentBindingKey4 != null) {
                objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey4, accumulatedState);
                if (objResolveStateRef != null) {
                    BindingLoggerKt.logContentBinding("doubleValue", strResolveContentBindingKey4, objResolveStateRef);
                    objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (!(objUnwrapForCoercion instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                        obj = null;
                    } else {
                        objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                        if (objUnwrapForCoercion2 == null) {
                            objOverlayContentPathBindings5 = null;
                        } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                            JsonElement jsonElement5 = (JsonElement) objUnwrapForCoercion2;
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonElement5);
                            } catch (Exception unused9) {
                                objOverlayContentPathBindings5 = null;
                            }
                        } else if (objUnwrapForCoercion2 instanceof Double) {
                            objOverlayContentPathBindings5 = objUnwrapForCoercion2;
                        } else {
                            if (objUnwrapForCoercion2 instanceof Number) {
                                c22673i0 = AbstractC22671h0.f89337a;
                                orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Double.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings5 = (Double) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings5 = (Double) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings5 = Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings5 = (Double) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                    objOverlayContentPathBindings5 = (Double) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
                                    objOverlayContentPathBindings5 = (Double) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                                }
                            } else if (objUnwrapForCoercion2 instanceof String) {
                                JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonPrimitiveM1841c5);
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
                            obj = objValueOf4;
                        }
                    }
                }
                d14 = (Double) DotPathBindingsKt.overlayAggregateBinding(map2, "doubleValue", accumulatedState, obj, "doubleValue", new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$23
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                        return invoke((Double) obj7);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(Double d15) {
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(DoubleSerializer.INSTANCE);
                            AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                            stateBindingJson.getClass();
                            return AbstractC12313p.m34290h0(stateBindingJson, d15, interfaceC37138cM122336d);
                        } catch (Exception unused11) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$24
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Double, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Double invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, json);
                        } catch (Exception unused11) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$25
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Double, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Double, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Double invoke(Object obj7) {
                        Object objM1830a;
                        ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj7);
                        if (UnwrapForCoercion == 0) {
                            return null;
                        }
                        if (UnwrapForCoercion instanceof JsonElement) {
                            JsonElement jsonElement6 = (JsonElement) UnwrapForCoercion;
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                return StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonElement6);
                            } catch (Exception unused11) {
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
                            JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonPrimitiveM1841c6);
                            } catch (Exception unused12) {
                                objM1830a = null;
                            }
                            if (objM1830a != null) {
                                return objM1830a;
                            }
                            return null;
                        }
                        C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                        InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(Double.class);
                        if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                            return (Double) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                        }
                        if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                            return (Double) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                        }
                        if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                            return Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                        }
                        if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                            return (Double) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                        }
                        if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                            return (Double) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                        }
                        if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                            return (Double) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                        }
                        return null;
                    }
                });
                if (d14 != null) {
                    doubleValue = d14.doubleValue();
                } else {
                    doubleValue = primitiveBindTestFixture.getDoubleValue();
                }
                return (PrimitiveBindTestFixture) ContentBindingResolverKt.copyBindingsFrom(new PrimitiveBindTestFixture(str, i13, z13, j7, doubleValue), primitiveBindTestFixture);
            }
            objOverlayContentPathBindings5 = ContentPathBindingsKt.overlayContentPathBindings(r1, "doubleValue", accumulatedState, obj, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$21
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                    return invoke((Double) obj7);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Double v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(DoubleSerializer.INSTANCE, v13);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$22
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Double, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Double invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, json);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            });
            obj = objOverlayContentPathBindings5;
            d14 = (Double) DotPathBindingsKt.overlayAggregateBinding(map2, "doubleValue", accumulatedState, obj, "doubleValue", new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$23
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                    return invoke((Double) obj7);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Double d15) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(DoubleSerializer.INSTANCE);
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, d15, interfaceC37138cM122336d);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$24
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Double, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Double invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, json);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$25
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Double, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Double, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Double invoke(Object obj7) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj7);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement6 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonElement6);
                        } catch (Exception unused11) {
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
                        JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonPrimitiveM1841c6);
                        } catch (Exception unused12) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(Double.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (Double) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                        return (Double) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                        return Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                        return (Double) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                        return (Double) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (Double) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            });
            if (d14 != null) {
                doubleValue = d14.doubleValue();
            } else {
                doubleValue = primitiveBindTestFixture.getDoubleValue();
            }
            return (PrimitiveBindTestFixture) ContentBindingResolverKt.copyBindingsFrom(new PrimitiveBindTestFixture(str, i13, z13, j7, doubleValue), primitiveBindTestFixture);
        }
        if (objOverlayContentPathBindings != null) {
            objOverlayContentPathBindings = ContentPathBindingsKt.overlayContentPathBindings(map, "stringValue", accumulatedState, objOverlayContentPathBindings, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$1
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                    return invoke((String) obj7);
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
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$2
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
        stringValue = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "stringValue", accumulatedState, objOverlayContentPathBindings, "stringValue", new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$3
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                return invoke((String) obj7);
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
        }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$4
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
        }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$5
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj7) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj7);
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
        });
        if (stringValue == null) {
            stringValue = primitiveBindTestFixture.getStringValue();
        }
        String str2 = stringValue;
        objValueOf = Integer.valueOf(primitiveBindTestFixture.getIntValue());
        if (objValueOf instanceof WithGeneratedBindings) {
            objBind4 = ((WithGeneratedBindings) objValueOf).bind(accumulatedState);
            if (!(objBind4 instanceof Integer)) {
                objBind4 = null;
            }
            num = (Integer) objBind4;
            if (num == null) {
                objOverlayContentPathBindings2 = objValueOf;
            } else {
                objOverlayContentPathBindings2 = num;
            }
        } else if (objValueOf instanceof List) {
            Iterable iterable6 = (Iterable) objValueOf;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable6, 10));
            while (r2.hasNext()) {
                if (obj3 instanceof WithGeneratedBindings) {
                    withGeneratedBindings = (WithGeneratedBindings) obj3;
                } else {
                    withGeneratedBindings = null;
                }
                if (withGeneratedBindings == null) {
                }
                arrayList.add(obj3);
            }
            num = (Integer) arrayList;
            objOverlayContentPathBindings2 = num;
        } else {
            objOverlayContentPathBindings2 = objValueOf;
        }
        if (r1 != 0) {
            strResolveContentBindingKey = BindingLoggerKt.resolveContentBindingKey(map, "intValue");
        } else {
            strResolveContentBindingKey = null;
        }
        if (strResolveContentBindingKey != null) {
            objResolveStateRef4 = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
            if (objResolveStateRef4 != null) {
                BindingLoggerKt.logContentBinding("intValue", strResolveContentBindingKey, objResolveStateRef4);
                objUnwrapForCoercion5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if (!(objUnwrapForCoercion5 instanceof String)) {
                    objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = null;
                    } else if (objOverlayContentPathBindings2 instanceof JsonElement) {
                        JsonElement jsonElement6 = (JsonElement) objOverlayContentPathBindings2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, jsonElement6);
                    } else if (!(objOverlayContentPathBindings2 instanceof Integer)) {
                        if (objOverlayContentPathBindings2 instanceof Number) {
                            c22673i3 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(Integer.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings2 = Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings2 = (Integer) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings2 = (Integer) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings2 = (Integer) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings2 = (Integer) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings2 = (Integer) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                            } else {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (objOverlayContentPathBindings2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, jsonPrimitiveM1841c6);
                            if (objOverlayContentPathBindings2 == null) {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else {
                            objOverlayContentPathBindings2 = null;
                        }
                    }
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = objValueOf;
                    }
                } else {
                    objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = null;
                    } else if (objOverlayContentPathBindings2 instanceof JsonElement) {
                        JsonElement jsonElement7 = (JsonElement) objOverlayContentPathBindings2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, jsonElement7);
                    } else if (!(objOverlayContentPathBindings2 instanceof Integer)) {
                        if (objOverlayContentPathBindings2 instanceof Number) {
                            c22673i3 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(Integer.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings2 = Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings2 = (Integer) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings2 = (Integer) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings2 = (Integer) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings2 = (Integer) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings2 = (Integer) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                            } else {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (objOverlayContentPathBindings2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c7 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, jsonPrimitiveM1841c7);
                            if (objOverlayContentPathBindings2 == null) {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else {
                            objOverlayContentPathBindings2 = null;
                        }
                    }
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = objValueOf;
                    }
                }
            }
        } else {
            objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(r1, "intValue", accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$6
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                    return invoke((Integer) obj7);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Integer v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(IntSerializer.INSTANCE, v13);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$7
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Integer, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Integer invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, json);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            });
        }
        num2 = (Integer) DotPathBindingsKt.overlayAggregateBinding(map2, "intValue", accumulatedState, objOverlayContentPathBindings2, "intValue", new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$8
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                return invoke((Integer) obj7);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Integer num3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(IntSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, num3, interfaceC37138cM122336d);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$9
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Integer, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Integer invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, json);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$10
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Integer, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Integer, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Integer invoke(Object obj7) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj7);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement8 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, jsonElement8);
                    } catch (Exception unused11) {
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
                    JsonPrimitive jsonPrimitiveM1841c8 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, jsonPrimitiveM1841c8);
                    } catch (Exception unused12) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(Integer.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                    return Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                    return (Integer) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                    return (Integer) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                    return (Integer) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                    return (Integer) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (Integer) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (num2 != null) {
            intValue = num2.intValue();
        } else {
            intValue = primitiveBindTestFixture.getIntValue();
        }
        int i14 = intValue;
        objValueOf2 = Boolean.valueOf(primitiveBindTestFixture.getBooleanValue());
        if (objValueOf2 instanceof WithGeneratedBindings) {
            objBind3 = ((WithGeneratedBindings) objValueOf2).bind(accumulatedState);
            if (!(objBind3 instanceof Boolean)) {
                objBind3 = null;
            }
            bool = (Boolean) objBind3;
            if (bool == null) {
                objOverlayContentPathBindings3 = objValueOf2;
            } else {
                objOverlayContentPathBindings3 = bool;
            }
        } else if (objValueOf2 instanceof List) {
            Iterable iterable7 = (Iterable) objValueOf2;
            arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable7, 10));
            while (r2.hasNext()) {
                if (obj4 instanceof WithGeneratedBindings) {
                    withGeneratedBindings2 = (WithGeneratedBindings) obj4;
                } else {
                    withGeneratedBindings2 = null;
                }
                if (withGeneratedBindings2 == null) {
                }
                arrayList2.add(obj4);
            }
            bool = (Boolean) arrayList2;
            objOverlayContentPathBindings3 = bool;
        } else {
            objOverlayContentPathBindings3 = objValueOf2;
        }
        if (r1 != 0) {
            strResolveContentBindingKey2 = BindingLoggerKt.resolveContentBindingKey(r1, "booleanValue");
        } else {
            strResolveContentBindingKey2 = null;
        }
        if (strResolveContentBindingKey2 != null) {
            objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
            if (objResolveStateRef3 != null) {
                BindingLoggerKt.logContentBinding("booleanValue", strResolveContentBindingKey2, objResolveStateRef3);
                objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if (!(objUnwrapForCoercion4 instanceof String)) {
                    objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = null;
                    } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                        JsonElement jsonElement8 = (JsonElement) objOverlayContentPathBindings3;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement8);
                    } else if (!(objOverlayContentPathBindings3 instanceof Boolean)) {
                        if (objOverlayContentPathBindings3 instanceof Number) {
                            c22673i2 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(Boolean.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings3 = (Boolean) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings3 = (Boolean) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings3 = (Boolean) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings3 = (Boolean) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings3 = (Boolean) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings3 = (Boolean) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                            } else {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else if (objOverlayContentPathBindings3 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c8 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c8);
                            if (objOverlayContentPathBindings3 == null) {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else {
                            objOverlayContentPathBindings3 = null;
                        }
                    }
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = objValueOf2;
                    }
                } else {
                    objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = null;
                    } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                        JsonElement jsonElement9 = (JsonElement) objOverlayContentPathBindings3;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement9);
                    } else if (!(objOverlayContentPathBindings3 instanceof Boolean)) {
                        if (objOverlayContentPathBindings3 instanceof Number) {
                            c22673i2 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(Boolean.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings3 = (Boolean) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings3 = (Boolean) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings3 = (Boolean) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings3 = (Boolean) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings3 = (Boolean) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings3 = (Boolean) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                            } else {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else if (objOverlayContentPathBindings3 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c9 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c9);
                            if (objOverlayContentPathBindings3 == null) {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else {
                            objOverlayContentPathBindings3 = null;
                        }
                    }
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = objValueOf2;
                    }
                }
            }
        } else {
            objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(r1, "booleanValue", accumulatedState, objOverlayContentPathBindings3, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$11
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                    return invoke((Boolean) obj7);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Boolean v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(BooleanSerializer.INSTANCE, v13);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$12
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Boolean invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            });
        }
        bool2 = (Boolean) DotPathBindingsKt.overlayAggregateBinding(map2, "booleanValue", accumulatedState, objOverlayContentPathBindings3, "booleanValue", new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$13
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                return invoke((Boolean) obj7);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Boolean bool3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(BooleanSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, bool3, interfaceC37138cM122336d);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$14
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Boolean invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$15
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Boolean, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Boolean, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj7) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj7);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement10 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement10);
                    } catch (Exception unused11) {
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
                    } catch (Exception unused12) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(Boolean.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (Boolean) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                    return (Boolean) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                    return (Boolean) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                    return (Boolean) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                    return (Boolean) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (Boolean) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (bool2 != null) {
            booleanValue = bool2.booleanValue();
        } else {
            booleanValue = primitiveBindTestFixture.getBooleanValue();
        }
        boolean z14 = booleanValue;
        objValueOf3 = Long.valueOf(primitiveBindTestFixture.getLongValue());
        if (objValueOf3 instanceof WithGeneratedBindings) {
            objBind2 = ((WithGeneratedBindings) objValueOf3).bind(accumulatedState);
            if (!(objBind2 instanceof Long)) {
                objBind2 = null;
            }
            l7 = (Long) objBind2;
            if (l7 == null) {
                objOverlayContentPathBindings4 = objValueOf3;
            } else {
                objOverlayContentPathBindings4 = l7;
            }
        } else if (objValueOf3 instanceof List) {
            Iterable iterable8 = (Iterable) objValueOf3;
            arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable8, 10));
            while (r2.hasNext()) {
                if (obj5 instanceof WithGeneratedBindings) {
                    withGeneratedBindings3 = (WithGeneratedBindings) obj5;
                } else {
                    withGeneratedBindings3 = null;
                }
                if (withGeneratedBindings3 == null) {
                }
                arrayList3.add(obj5);
            }
            l7 = (Long) arrayList3;
            objOverlayContentPathBindings4 = l7;
        } else {
            objOverlayContentPathBindings4 = objValueOf3;
        }
        if (r1 != 0) {
            strResolveContentBindingKey3 = BindingLoggerKt.resolveContentBindingKey(r1, "longValue");
        } else {
            strResolveContentBindingKey3 = null;
        }
        if (strResolveContentBindingKey3 != null) {
            objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
            if (objResolveStateRef2 != null) {
                BindingLoggerKt.logContentBinding("longValue", strResolveContentBindingKey3, objResolveStateRef2);
                objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                if (!(objUnwrapForCoercion3 instanceof String)) {
                    objOverlayContentPathBindings4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (objOverlayContentPathBindings4 == null) {
                        objOverlayContentPathBindings4 = null;
                    } else if (objOverlayContentPathBindings4 instanceof JsonElement) {
                        JsonElement jsonElement10 = (JsonElement) objOverlayContentPathBindings4;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(LongSerializer.INSTANCE, jsonElement10);
                    } else if (!(objOverlayContentPathBindings4 instanceof Long)) {
                        if (objOverlayContentPathBindings4 instanceof Number) {
                            c22673i1 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(Long.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings4 = (Long) Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings4 = Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings4 = (Long) Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings4 = (Long) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings4 = (Long) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings4 = (Long) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                            } else {
                                objOverlayContentPathBindings4 = null;
                            }
                        } else if (objOverlayContentPathBindings4 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c10 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings4);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(LongSerializer.INSTANCE, jsonPrimitiveM1841c10);
                            if (objOverlayContentPathBindings4 == null) {
                                objOverlayContentPathBindings4 = null;
                            }
                        } else {
                            objOverlayContentPathBindings4 = null;
                        }
                    }
                    if (objOverlayContentPathBindings4 == null) {
                        objOverlayContentPathBindings4 = objValueOf3;
                    }
                } else {
                    objOverlayContentPathBindings4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (objOverlayContentPathBindings4 == null) {
                        objOverlayContentPathBindings4 = null;
                    } else if (objOverlayContentPathBindings4 instanceof JsonElement) {
                        JsonElement jsonElement11 = (JsonElement) objOverlayContentPathBindings4;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(LongSerializer.INSTANCE, jsonElement11);
                    } else if (!(objOverlayContentPathBindings4 instanceof Long)) {
                        if (objOverlayContentPathBindings4 instanceof Number) {
                            c22673i1 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(Long.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings4 = (Long) Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings4 = Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings4 = (Long) Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings4 = (Long) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings4 = (Long) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings4 = (Long) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                            } else {
                                objOverlayContentPathBindings4 = null;
                            }
                        } else if (objOverlayContentPathBindings4 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c11 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings4);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(LongSerializer.INSTANCE, jsonPrimitiveM1841c11);
                            if (objOverlayContentPathBindings4 == null) {
                                objOverlayContentPathBindings4 = null;
                            }
                        } else {
                            objOverlayContentPathBindings4 = null;
                        }
                    }
                    if (objOverlayContentPathBindings4 == null) {
                        objOverlayContentPathBindings4 = objValueOf3;
                    }
                }
            }
        } else {
            objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(r1, "longValue", accumulatedState, objOverlayContentPathBindings4, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$16
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                    return invoke((Long) obj7);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Long v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(LongSerializer.INSTANCE, v13);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$17
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Long, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Long invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(LongSerializer.INSTANCE, json);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            });
        }
        l12 = (Long) DotPathBindingsKt.overlayAggregateBinding(map2, "longValue", accumulatedState, objOverlayContentPathBindings4, "longValue", new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$18
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                return invoke((Long) obj7);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Long l13) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(LongSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, l13, interfaceC37138cM122336d);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$19
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Long, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Long invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(LongSerializer.INSTANCE, json);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$20
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Long, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Long, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Long invoke(Object obj7) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj7);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement12 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(LongSerializer.INSTANCE, jsonElement12);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof Long) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c12 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(LongSerializer.INSTANCE, jsonPrimitiveM1841c12);
                    } catch (Exception unused12) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(Long.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (Long) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                    return Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                    return (Long) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                    return (Long) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                    return (Long) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (Long) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (l12 != null) {
            longValue = l12.longValue();
        } else {
            longValue = primitiveBindTestFixture.getLongValue();
        }
        long j13 = longValue;
        objValueOf4 = Double.valueOf(primitiveBindTestFixture.getDoubleValue());
        if (objValueOf4 instanceof WithGeneratedBindings) {
            objBind = ((WithGeneratedBindings) objValueOf4).bind(accumulatedState);
            if (!(objBind instanceof Double)) {
                objBind = null;
            }
            d3 = (Double) objBind;
            if (d3 == null) {
                obj = objValueOf4;
            } else {
                obj = d3;
            }
        } else if (objValueOf4 instanceof List) {
            Iterable iterable9 = (Iterable) objValueOf4;
            arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable9, 10));
            while (r2.hasNext()) {
                if (obj6 instanceof WithGeneratedBindings) {
                    withGeneratedBindings4 = (WithGeneratedBindings) obj6;
                } else {
                    withGeneratedBindings4 = null;
                }
                if (withGeneratedBindings4 == null) {
                }
                arrayList4.add(obj6);
            }
            d3 = (Double) arrayList4;
            obj = d3;
        } else {
            obj = objValueOf4;
        }
        if (r1 != 0) {
            strResolveContentBindingKey4 = BindingLoggerKt.resolveContentBindingKey(r1, "doubleValue");
        } else {
            strResolveContentBindingKey4 = null;
        }
        if (strResolveContentBindingKey4 != null) {
            objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey4, accumulatedState);
            if (objResolveStateRef != null) {
                BindingLoggerKt.logContentBinding("doubleValue", strResolveContentBindingKey4, objResolveStateRef);
                objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                if (!(objUnwrapForCoercion instanceof String)) {
                    objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (objUnwrapForCoercion2 == null) {
                        objOverlayContentPathBindings5 = null;
                    } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                        JsonElement jsonElement12 = (JsonElement) objUnwrapForCoercion2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonElement12);
                    } else if (objUnwrapForCoercion2 instanceof Double) {
                        if (objUnwrapForCoercion2 instanceof Number) {
                            c22673i0 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Double.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings5 = (Double) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings5 = (Double) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings5 = Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings5 = (Double) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings5 = (Double) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings5 = (Double) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                            }
                        } else if (objUnwrapForCoercion2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c12 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonPrimitiveM1841c12);
                            if (objUnwrapForCoercion2 != null) {
                                objOverlayContentPathBindings5 = objUnwrapForCoercion2;
                            }
                        }
                        objOverlayContentPathBindings5 = null;
                    } else {
                        objOverlayContentPathBindings5 = objUnwrapForCoercion2;
                    }
                    if (objOverlayContentPathBindings5 == null) {
                        obj = objValueOf4;
                    }
                } else {
                    objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (objUnwrapForCoercion2 == null) {
                        objOverlayContentPathBindings5 = null;
                    } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                        JsonElement jsonElement13 = (JsonElement) objUnwrapForCoercion2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonElement13);
                    } else if (objUnwrapForCoercion2 instanceof Double) {
                        if (objUnwrapForCoercion2 instanceof Number) {
                            c22673i0 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Double.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings5 = (Double) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings5 = (Double) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings5 = Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings5 = (Double) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings5 = (Double) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings5 = (Double) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                            }
                        } else if (objUnwrapForCoercion2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c13 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonPrimitiveM1841c13);
                            if (objUnwrapForCoercion2 != null) {
                                objOverlayContentPathBindings5 = objUnwrapForCoercion2;
                            }
                        }
                        objOverlayContentPathBindings5 = null;
                    } else {
                        objOverlayContentPathBindings5 = objUnwrapForCoercion2;
                    }
                    if (objOverlayContentPathBindings5 == null) {
                        obj = objValueOf4;
                    }
                }
            }
            d14 = (Double) DotPathBindingsKt.overlayAggregateBinding(map2, "doubleValue", accumulatedState, obj, "doubleValue", new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$23
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                    return invoke((Double) obj7);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Double d15) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(DoubleSerializer.INSTANCE);
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, d15, interfaceC37138cM122336d);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$24
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Double, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Double invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, json);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$25
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Double, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Double, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Double invoke(Object obj7) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj7);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement14 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonElement14);
                        } catch (Exception unused11) {
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
                        JsonPrimitive jsonPrimitiveM1841c14 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonPrimitiveM1841c14);
                        } catch (Exception unused12) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(Double.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (Double) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                        return (Double) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                        return Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                        return (Double) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                        return (Double) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (Double) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            });
            if (d14 != null) {
                doubleValue = d14.doubleValue();
            } else {
                doubleValue = primitiveBindTestFixture.getDoubleValue();
            }
            return (PrimitiveBindTestFixture) ContentBindingResolverKt.copyBindingsFrom(new PrimitiveBindTestFixture(str2, i14, z14, j13, doubleValue), primitiveBindTestFixture);
        }
        objOverlayContentPathBindings5 = ContentPathBindingsKt.overlayContentPathBindings(r1, "doubleValue", accumulatedState, obj, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$21
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                return invoke((Double) obj7);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Double v13) {
                AbstractC22676k.m65750j(v13, "v");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1832c(DoubleSerializer.INSTANCE, v13);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$22
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Double, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Double invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, json);
                } catch (Exception unused11) {
                    return null;
                }
            }
        });
        obj = objOverlayContentPathBindings5;
        d14 = (Double) DotPathBindingsKt.overlayAggregateBinding(map2, "doubleValue", accumulatedState, obj, "doubleValue", new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$23
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                return invoke((Double) obj7);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Double d15) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(DoubleSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, d15, interfaceC37138cM122336d);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$24
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Double, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Double invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, json);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.test.fixtures.PrimitiveBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$25
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Double, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Double, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Double invoke(Object obj7) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj7);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement14 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonElement14);
                    } catch (Exception unused11) {
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
                    JsonPrimitive jsonPrimitiveM1841c14 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(DoubleSerializer.INSTANCE, jsonPrimitiveM1841c14);
                    } catch (Exception unused12) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i5 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass6 = c22673i5.getOrCreateKotlinClass(Double.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (Double) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Long.TYPE))) {
                    return (Double) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Double.TYPE))) {
                    return Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Float.TYPE))) {
                    return (Double) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Short.TYPE))) {
                    return (Double) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i5.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (Double) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (d14 != null) {
            doubleValue = d14.doubleValue();
        } else {
            doubleValue = primitiveBindTestFixture.getDoubleValue();
        }
        return (PrimitiveBindTestFixture) ContentBindingResolverKt.copyBindingsFrom(new PrimitiveBindTestFixture(str2, i14, z14, j13, doubleValue), primitiveBindTestFixture);
    }

    public static /* synthetic */ PrimitiveBindTestFixture generatedBind$default(PrimitiveBindTestFixture primitiveBindTestFixture, Map map, Map map2, Map map3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map2 = null;
        }
        return generatedBind(primitiveBindTestFixture, map, map2, map3);
    }
}
