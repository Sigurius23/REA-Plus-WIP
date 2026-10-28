package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

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
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.BooleanSerializer;
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
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003¨\u0006\t"}, m65681d2 = {"generatedBind", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsLoaderModel;", "contentBinding", "", "", "aggregateBindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "accumulatedState", "", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class HormonalInsightsLoaderModelStateBindingKt {
    /* JADX WARN: Code duplicated, block: B:101:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e8 A[PHI: r2
      0x01e8: PHI (r2v51 java.lang.Boolean) = (r2v13 java.lang.Boolean), (r2v56 java.lang.Boolean) binds: [B:123:0x0221, B:105:0x01e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:108:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:113:0x0206  */
    /* JADX WARN: Code duplicated, block: B:115:0x020e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0212  */
    /* JADX WARN: Code duplicated, block: B:124:0x0225  */
    /* JADX WARN: Code duplicated, block: B:127:0x022a  */
    /* JADX WARN: Code duplicated, block: B:128:0x022f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0232  */
    /* JADX WARN: Code duplicated, block: B:132:0x0238  */
    /* JADX WARN: Code duplicated, block: B:139:0x025a  */
    /* JADX WARN: Code duplicated, block: B:141:0x0260  */
    /* JADX WARN: Code duplicated, block: B:142:0x0263  */
    /* JADX WARN: Code duplicated, block: B:144:0x0267  */
    /* JADX WARN: Code duplicated, block: B:147:0x027c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0282  */
    /* JADX WARN: Code duplicated, block: B:152:0x0286  */
    /* JADX WARN: Code duplicated, block: B:154:0x0298  */
    /* JADX WARN: Code duplicated, block: B:155:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:157:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:158:0x02be  */
    /* JADX WARN: Code duplicated, block: B:160:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:161:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:163:0x02df  */
    /* JADX WARN: Code duplicated, block: B:164:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:166:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:167:0x0303  */
    /* JADX WARN: Code duplicated, block: B:169:0x030d  */
    /* JADX WARN: Code duplicated, block: B:170:0x031a  */
    /* JADX WARN: Code duplicated, block: B:172:0x031e  */
    /* JADX WARN: Code duplicated, block: B:178:0x033b  */
    /* JADX WARN: Code duplicated, block: B:179:0x033d  */
    /* JADX WARN: Code duplicated, block: B:182:0x035c  */
    /* JADX WARN: Code duplicated, block: B:184:0x0362  */
    /* JADX WARN: Code duplicated, block: B:187:0x036d  */
    /* JADX WARN: Code duplicated, block: B:188:0x036f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0373  */
    /* JADX WARN: Code duplicated, block: B:192:0x037e  */
    /* JADX WARN: Code duplicated, block: B:196:0x0384  */
    /* JADX WARN: Code duplicated, block: B:198:0x0388  */
    /* JADX WARN: Code duplicated, block: B:201:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:203:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:204:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:212:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:216:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:217:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:220:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:222:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:229:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:231:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:233:0x0402  */
    /* JADX WARN: Code duplicated, block: B:235:0x0406  */
    /* JADX WARN: Code duplicated, block: B:240:0x0424  */
    /* JADX WARN: Code duplicated, block: B:243:0x0429  */
    /* JADX WARN: Code duplicated, block: B:245:0x042d  */
    /* JADX WARN: Code duplicated, block: B:247:0x043f  */
    /* JADX WARN: Code duplicated, block: B:249:0x044e  */
    /* JADX WARN: Code duplicated, block: B:251:0x0458  */
    /* JADX WARN: Code duplicated, block: B:252:0x0465  */
    /* JADX WARN: Code duplicated, block: B:254:0x046f  */
    /* JADX WARN: Code duplicated, block: B:255:0x047c  */
    /* JADX WARN: Code duplicated, block: B:257:0x0486  */
    /* JADX WARN: Code duplicated, block: B:258:0x0493  */
    /* JADX WARN: Code duplicated, block: B:260:0x049d  */
    /* JADX WARN: Code duplicated, block: B:261:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:263:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:264:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:266:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:272:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:273:0x04ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:275:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:278:0x0518  */
    /* JADX WARN: Code duplicated, block: B:279:0x051a  */
    /* JADX WARN: Code duplicated, block: B:281:0x051e  */
    /* JADX WARN: Code duplicated, block: B:283:0x0529  */
    /* JADX WARN: Code duplicated, block: B:287:0x052f  */
    /* JADX WARN: Code duplicated, block: B:289:0x0533  */
    /* JADX WARN: Code duplicated, block: B:292:0x054b  */
    /* JADX WARN: Code duplicated, block: B:294:0x0553  */
    /* JADX WARN: Code duplicated, block: B:295:0x0557  */
    /* JADX WARN: Code duplicated, block: B:303:0x056a  */
    /* JADX WARN: Code duplicated, block: B:307:0x0570  */
    /* JADX WARN: Code duplicated, block: B:308:0x0575  */
    /* JADX WARN: Code duplicated, block: B:310:0x0578  */
    /* JADX WARN: Code duplicated, block: B:312:0x057e  */
    /* JADX WARN: Code duplicated, block: B:319:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:321:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:322:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:324:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:327:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:329:0x05d1 A[PHI: r0
      0x05d1: PHI (r0v28 java.lang.Object) = (r0v6 java.lang.Object), (r0v10 java.lang.Object) binds: [B:328:0x05cf, B:356:0x069b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:330:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:332:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:334:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:335:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:337:0x0601  */
    /* JADX WARN: Code duplicated, block: B:338:0x0610  */
    /* JADX WARN: Code duplicated, block: B:340:0x061a  */
    /* JADX WARN: Code duplicated, block: B:341:0x0629  */
    /* JADX WARN: Code duplicated, block: B:343:0x0633  */
    /* JADX WARN: Code duplicated, block: B:344:0x0641  */
    /* JADX WARN: Code duplicated, block: B:346:0x064b  */
    /* JADX WARN: Code duplicated, block: B:347:0x0659  */
    /* JADX WARN: Code duplicated, block: B:349:0x0665  */
    /* JADX WARN: Code duplicated, block: B:350:0x0673  */
    /* JADX WARN: Code duplicated, block: B:352:0x0677  */
    /* JADX WARN: Code duplicated, block: B:359:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:360:0x06a3 A[PHI: r10
      0x06a3: PHI (r10v2 java.lang.Object) = (r10v1 java.lang.Object), (r10v17 java.lang.Object) binds: [B:363:0x06a8, B:358:0x069f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:361:0x06a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:363:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final HormonalInsightsLoaderModel generatedBind(HormonalInsightsLoaderModel hormonalInsightsLoaderModel, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, ? extends Object> accumulatedState) {
        Object objOverlayContentPathBindings;
        WithGeneratedBindings withGeneratedBindingsBind;
        Object objValueOf;
        ArrayList arrayList;
        Boolean bool;
        WithGeneratedBindings withGeneratedBindings;
        WithGeneratedBindings withGeneratedBindingsBind2;
        Object objOverlayContentPathBindings2;
        String strResolveContentBindingKey;
        Boolean bool2;
        boolean zIsPresented;
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
        Object obj;
        WithGeneratedBindings withGeneratedBindingsBind6;
        String strResolveContentBindingKey3;
        Object objOverlayContentPathBindings4;
        Object objResolveStateRef;
        Object objUnwrapForCoercion;
        Object objUnwrapForCoercion2;
        C22673i0 c22673i0;
        InterfaceC21461d orCreateKotlinClass;
        Object objResolveStateRef2;
        Object objUnwrapForCoercion3;
        Map<String, String> map5;
        C22673i0 c22673i1;
        InterfaceC21461d orCreateKotlinClass2;
        Map map6;
        Object objResolveStateRef3;
        Object objUnwrapForCoercion4;
        C22673i0 c22673i2;
        InterfaceC21461d orCreateKotlinClass3;
        Object objBind;
        AbstractC22676k.m65750j(hormonalInsightsLoaderModel, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if ((map == null || map.isEmpty()) && ((map2 == null || map2.isEmpty()) && accumulatedState.isEmpty())) {
            return hormonalInsightsLoaderModel;
        }
        Object text = hormonalInsightsLoaderModel.getText();
        if (text == null) {
            objOverlayContentPathBindings = null;
        } else if (text instanceof WithGeneratedBindings) {
            Object objBind2 = ((WithGeneratedBindings) text).bind(accumulatedState);
            if (!(objBind2 instanceof String)) {
                objBind2 = null;
            }
            objOverlayContentPathBindings = (String) objBind2;
            if (objOverlayContentPathBindings == null) {
                objOverlayContentPathBindings = text;
            }
        } else if (text instanceof List) {
            Iterable iterable = (Iterable) text;
            ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            for (Object obj2 : iterable) {
                WithGeneratedBindings withGeneratedBindings4 = obj2 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj2 : null;
                if (withGeneratedBindings4 != null && (withGeneratedBindingsBind = withGeneratedBindings4.bind(accumulatedState)) != null) {
                    obj2 = withGeneratedBindingsBind;
                }
                arrayList4.add(obj2);
            }
            objOverlayContentPathBindings = (String) arrayList4;
        } else {
            objOverlayContentPathBindings = text;
        }
        String strResolveContentBindingKey4 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "text") : null;
        Class cls = Byte.TYPE;
        Class cls2 = Short.TYPE;
        Class cls3 = Float.TYPE;
        Class cls4 = Double.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        if (strResolveContentBindingKey4 != null) {
            Object objResolveStateRef4 = StateLookupKt.resolveStateRef(strResolveContentBindingKey4, accumulatedState);
            if (objResolveStateRef4 != null) {
                BindingLoggerKt.logContentBinding("text", strResolveContentBindingKey4, objResolveStateRef4);
                Object objUnwrapForCoercion5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if ((objUnwrapForCoercion5 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion5) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                    objOverlayContentPathBindings = null;
                } else {
                    objOverlayContentPathBindings = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
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
                                C22673i0 c22673i3 = AbstractC22671h0.f89337a;
                                InterfaceC21461d orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(String.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings = (String) Integer.valueOf(((Number) objOverlayContentPathBindings).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings = (String) Long.valueOf(((Number) objOverlayContentPathBindings).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings = (String) Double.valueOf(((Number) objOverlayContentPathBindings).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings = (String) Float.valueOf(((Number) objOverlayContentPathBindings).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls2))) {
                                    objOverlayContentPathBindings = (String) Short.valueOf(((Number) objOverlayContentPathBindings).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls))) {
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
                        objOverlayContentPathBindings = text;
                    }
                }
            }
            String str = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "text", accumulatedState, objOverlayContentPathBindings, "text", new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$3
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    return invoke((String) obj3);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(String str2) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, str2, interfaceC37138cM122336d);
                    } catch (Exception unused3) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$4
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
            }, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$5
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
                    C22673i0 c22673i4 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass5 = c22673i4.getOrCreateKotlinClass(String.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (String) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Long.TYPE))) {
                        return (String) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Double.TYPE))) {
                        return (String) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Float.TYPE))) {
                        return (String) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Short.TYPE))) {
                        return (String) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (String) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            });
            objValueOf = Boolean.valueOf(hormonalInsightsLoaderModel.isPresented());
            if (objValueOf instanceof WithGeneratedBindings) {
                objBind = ((WithGeneratedBindings) objValueOf).bind(accumulatedState);
                if (!(objBind instanceof Boolean)) {
                    objBind = null;
                }
                bool = (Boolean) objBind;
                if (bool == null) {
                    objOverlayContentPathBindings2 = objValueOf;
                } else {
                    objOverlayContentPathBindings2 = bool;
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
                bool = (Boolean) arrayList;
                objOverlayContentPathBindings2 = bool;
            } else {
                objOverlayContentPathBindings2 = objValueOf;
            }
            if (r1 != 0) {
                strResolveContentBindingKey = BindingLoggerKt.resolveContentBindingKey(map, "isPresented");
            } else {
                strResolveContentBindingKey = null;
            }
            if (strResolveContentBindingKey != null) {
                objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
                if (objResolveStateRef3 != null) {
                    BindingLoggerKt.logContentBinding("isPresented", strResolveContentBindingKey, objResolveStateRef3);
                    objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                    if (!(objUnwrapForCoercion4 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion4) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                        objOverlayContentPathBindings2 = null;
                    } else {
                        objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                        if (objOverlayContentPathBindings2 == null) {
                            objOverlayContentPathBindings2 = null;
                        } else if (objOverlayContentPathBindings2 instanceof JsonElement) {
                            JsonElement jsonElement2 = (JsonElement) objOverlayContentPathBindings2;
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement2);
                            } catch (Exception unused3) {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (!(objOverlayContentPathBindings2 instanceof Boolean)) {
                            if (objOverlayContentPathBindings2 instanceof Number) {
                                c22673i2 = AbstractC22671h0.f89337a;
                                orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(Boolean.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings2 = (Boolean) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings2 = (Boolean) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings2 = (Boolean) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings2 = (Boolean) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls2))) {
                                    objOverlayContentPathBindings2 = (Boolean) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls))) {
                                    objOverlayContentPathBindings2 = (Boolean) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                                } else {
                                    objOverlayContentPathBindings2 = null;
                                }
                            } else if (objOverlayContentPathBindings2 instanceof String) {
                                JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c2);
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
                objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(r1, "isPresented", accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$6
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                        return invoke((Boolean) obj4);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(Boolean v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(BooleanSerializer.INSTANCE, v13);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$7
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Boolean invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                });
            }
            bool2 = (Boolean) DotPathBindingsKt.overlayAggregateBinding(map2, "isPresented", accumulatedState, objOverlayContentPathBindings2, "isPresented", new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$8
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                    return invoke((Boolean) obj4);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Boolean bool3) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(BooleanSerializer.INSTANCE);
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, bool3, interfaceC37138cM122336d);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$9
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Boolean invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$10
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Boolean, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Boolean, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Boolean invoke(Object obj4) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj4);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement3 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement3);
                        } catch (Exception unused5) {
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
                        JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c3);
                        } catch (Exception unused6) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i4 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass5 = c22673i4.getOrCreateKotlinClass(Boolean.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (Boolean) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Long.TYPE))) {
                        return (Boolean) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Double.TYPE))) {
                        return (Boolean) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Float.TYPE))) {
                        return (Boolean) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Short.TYPE))) {
                        return (Boolean) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (Boolean) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            });
            if (bool2 != null) {
                zIsPresented = bool2.booleanValue();
            } else {
                zIsPresented = hormonalInsightsLoaderModel.isPresented();
            }
            boolean z13 = zIsPresented;
            bindings = hormonalInsightsLoaderModel.getBindings();
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
                objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
                if (objResolveStateRef2 != null) {
                    BindingLoggerKt.logContentBinding("bindings", strResolveContentBindingKey2, objResolveStateRef2);
                    objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (!(objUnwrapForCoercion3 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion3) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                        objOverlayContentPathBindings3 = null;
                    } else {
                        objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                        if (objOverlayContentPathBindings3 == null) {
                            map5 = bindings;
                        } else {
                            if (objOverlayContentPathBindings3 instanceof JsonElement) {
                                JsonElement jsonElement3 = (JsonElement) objOverlayContentPathBindings3;
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    StringSerializer stringSerializer = StringSerializer.INSTANCE;
                                    objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer, stringSerializer), jsonElement3);
                                } catch (Exception unused5) {
                                    objOverlayContentPathBindings3 = null;
                                }
                            } else {
                                if (!(objOverlayContentPathBindings3 instanceof Map)) {
                                    if (objOverlayContentPathBindings3 instanceof Number) {
                                        c22673i1 = AbstractC22671h0.f89337a;
                                        orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(Map.class);
                                        map5 = bindings;
                                        if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                            map6 = (Map) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                            map6 = (Map) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                            map6 = (Map) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls3))) {
                                            map6 = (Map) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls2))) {
                                            map6 = (Map) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                            map6 = (Map) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                                        }
                                        objOverlayContentPathBindings3 = map6;
                                    } else {
                                        map5 = bindings;
                                        if (objOverlayContentPathBindings3 instanceof String) {
                                            JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                                            try {
                                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                                StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                                                objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), jsonPrimitiveM1841c3);
                                            } catch (Exception unused6) {
                                                objOverlayContentPathBindings3 = null;
                                            }
                                            if (objOverlayContentPathBindings3 == null) {
                                            }
                                        }
                                    }
                                }
                                if (objOverlayContentPathBindings3 == null) {
                                    objOverlayContentPathBindings3 = map5;
                                }
                            }
                            map5 = bindings;
                            if (objOverlayContentPathBindings3 == null) {
                                objOverlayContentPathBindings3 = map5;
                            }
                        }
                        objOverlayContentPathBindings3 = null;
                        if (objOverlayContentPathBindings3 == null) {
                            objOverlayContentPathBindings3 = map5;
                        }
                    }
                }
            } else if (objOverlayContentPathBindings3 != null) {
                objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(r1, "bindings", accumulatedState, objOverlayContentPathBindings3, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$11
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                        return invoke((Map<String, ? extends String>) obj5);
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
                }, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$12
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
            Map map7 = (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "bindings", accumulatedState, objOverlayContentPathBindings3, "bindings", new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$13
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                    return invoke((Map<String, ? extends String>) obj5);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Map<String, ? extends String> map8) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3));
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, map8, interfaceC37138cM122336d);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$14
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
            }, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$15
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends java.lang.String>] */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Map<String, ? extends String> invoke(Object obj5) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj5);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement4 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), jsonElement4);
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
                        JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer4 = StringSerializer.INSTANCE;
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer4, stringSerializer4), jsonPrimitiveM1841c4);
                        } catch (Exception unused8) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i4 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass5 = c22673i4.getOrCreateKotlinClass(Map.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (Map) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Long.TYPE))) {
                        return (Map) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Double.TYPE))) {
                        return (Map) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Float.TYPE))) {
                        return (Map) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Short.TYPE))) {
                        return (Map) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (Map) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            });
            aggregateBindings = hormonalInsightsLoaderModel.getAggregateBindings();
            if (aggregateBindings == null) {
                obj = null;
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
                    for (Object obj5 : iterable4) {
                        if (obj5 instanceof WithGeneratedBindings) {
                            withGeneratedBindings3 = (WithGeneratedBindings) obj5;
                        } else {
                            withGeneratedBindings3 = null;
                        }
                        if (withGeneratedBindings3 == null && (withGeneratedBindingsBind5 = withGeneratedBindings3.bind(accumulatedState)) != null) {
                            obj5 = withGeneratedBindingsBind5;
                        }
                        arrayList3.add(obj5);
                    }
                    map4 = (Map) arrayList3;
                } else {
                    map4 = aggregateBindings;
                }
                obj = map4;
            }
            if (r1 != 0) {
                strResolveContentBindingKey3 = BindingLoggerKt.resolveContentBindingKey(r1, "aggregateBindings");
            } else {
                strResolveContentBindingKey3 = null;
            }
            if (strResolveContentBindingKey3 != null) {
                objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
                if (objResolveStateRef != null) {
                    BindingLoggerKt.logContentBinding("aggregateBindings", strResolveContentBindingKey3, objResolveStateRef);
                    objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (!(objUnwrapForCoercion instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                        obj = null;
                    } else {
                        objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                        if (objUnwrapForCoercion2 == null) {
                            objOverlayContentPathBindings4 = null;
                        } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                            JsonElement jsonElement4 = (JsonElement) objUnwrapForCoercion2;
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement4);
                            } catch (Exception unused7) {
                                objOverlayContentPathBindings4 = null;
                            }
                        } else if (objUnwrapForCoercion2 instanceof Map) {
                            objOverlayContentPathBindings4 = objUnwrapForCoercion2;
                        } else {
                            if (objUnwrapForCoercion2 instanceof Number) {
                                c22673i0 = AbstractC22671h0.f89337a;
                                orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings4 = (Map) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings4 = (Map) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings4 = (Map) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings4 = (Map) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                    objOverlayContentPathBindings4 = (Map) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
                                    objOverlayContentPathBindings4 = (Map) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                                }
                            } else if (objUnwrapForCoercion2 instanceof String) {
                                JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c4);
                                } catch (Exception unused8) {
                                    objUnwrapForCoercion2 = null;
                                }
                                if (objUnwrapForCoercion2 != null) {
                                    objOverlayContentPathBindings4 = objUnwrapForCoercion2;
                                }
                            }
                            objOverlayContentPathBindings4 = null;
                        }
                        if (objOverlayContentPathBindings4 == null) {
                            obj = aggregateBindings;
                        } else {
                            obj = objOverlayContentPathBindings4;
                        }
                    }
                }
            } else if (obj != null) {
                objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(r1, "aggregateBindings", accumulatedState, obj, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$16
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj6) {
                        return invoke((Map<String, ? extends AggregateBinding>) obj6);
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
                }, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$17
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
                obj = objOverlayContentPathBindings4;
            }
            return (HormonalInsightsLoaderModel) ContentBindingResolverKt.copyBindingsFrom(new HormonalInsightsLoaderModel(str, z13, map7, (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "aggregateBindings", accumulatedState, obj, "aggregateBindings", new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$18
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj6) {
                    return invoke((Map<String, ? extends AggregateBinding>) obj6);
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
            }, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$19
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
            }, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$20
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Map<String, ? extends AggregateBinding> invoke(Object obj6) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj6);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement5 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement5);
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
                        JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c5);
                        } catch (Exception unused10) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i4 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass5 = c22673i4.getOrCreateKotlinClass(Map.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (Map) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Long.TYPE))) {
                        return (Map) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Double.TYPE))) {
                        return (Map) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Float.TYPE))) {
                        return (Map) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Short.TYPE))) {
                        return (Map) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (Map) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            })), hormonalInsightsLoaderModel);
        }
        if (objOverlayContentPathBindings != null) {
            objOverlayContentPathBindings = ContentPathBindingsKt.overlayContentPathBindings(map, "text", accumulatedState, objOverlayContentPathBindings, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$1
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj6) {
                    return invoke((String) obj6);
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
            }, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$2
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
        String str2 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "text", accumulatedState, objOverlayContentPathBindings, "text", new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$3
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj6) {
                return invoke((String) obj6);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str3, interfaceC37138cM122336d);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$4
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
        }, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$5
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj6) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj6);
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
                C22673i0 c22673i4 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass5 = c22673i4.getOrCreateKotlinClass(String.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (String) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Long.TYPE))) {
                    return (String) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Double.TYPE))) {
                    return (String) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Float.TYPE))) {
                    return (String) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Short.TYPE))) {
                    return (String) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (String) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        objValueOf = Boolean.valueOf(hormonalInsightsLoaderModel.isPresented());
        if (objValueOf instanceof WithGeneratedBindings) {
            objBind = ((WithGeneratedBindings) objValueOf).bind(accumulatedState);
            if (!(objBind instanceof Boolean)) {
                objBind = null;
            }
            bool = (Boolean) objBind;
            if (bool == null) {
                objOverlayContentPathBindings2 = objValueOf;
            } else {
                objOverlayContentPathBindings2 = bool;
            }
        } else if (objValueOf instanceof List) {
            Iterable iterable5 = (Iterable) objValueOf;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable5, 10));
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
            bool = (Boolean) arrayList;
            objOverlayContentPathBindings2 = bool;
        } else {
            objOverlayContentPathBindings2 = objValueOf;
        }
        if (r1 != 0) {
            strResolveContentBindingKey = BindingLoggerKt.resolveContentBindingKey(map, "isPresented");
        } else {
            strResolveContentBindingKey = null;
        }
        if (strResolveContentBindingKey != null) {
            objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
            if (objResolveStateRef3 != null) {
                BindingLoggerKt.logContentBinding("isPresented", strResolveContentBindingKey, objResolveStateRef3);
                objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if (!(objUnwrapForCoercion4 instanceof String)) {
                    objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = null;
                    } else if (objOverlayContentPathBindings2 instanceof JsonElement) {
                        JsonElement jsonElement5 = (JsonElement) objOverlayContentPathBindings2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement5);
                    } else if (!(objOverlayContentPathBindings2 instanceof Boolean)) {
                        if (objOverlayContentPathBindings2 instanceof Number) {
                            c22673i2 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(Boolean.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings2 = (Boolean) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings2 = (Boolean) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings2 = (Boolean) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings2 = (Boolean) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings2 = (Boolean) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings2 = (Boolean) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                            } else {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (objOverlayContentPathBindings2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c5);
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
                    objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = null;
                    } else if (objOverlayContentPathBindings2 instanceof JsonElement) {
                        JsonElement jsonElement6 = (JsonElement) objOverlayContentPathBindings2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement6);
                    } else if (!(objOverlayContentPathBindings2 instanceof Boolean)) {
                        if (objOverlayContentPathBindings2 instanceof Number) {
                            c22673i2 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(Boolean.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings2 = (Boolean) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings2 = (Boolean) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings2 = (Boolean) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings2 = (Boolean) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings2 = (Boolean) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings2 = (Boolean) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                            } else {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (objOverlayContentPathBindings2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c6);
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
            objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(r1, "isPresented", accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$6
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj6) {
                    return invoke((Boolean) obj6);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Boolean v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(BooleanSerializer.INSTANCE, v13);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$7
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Boolean invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
            });
        }
        bool2 = (Boolean) DotPathBindingsKt.overlayAggregateBinding(map2, "isPresented", accumulatedState, objOverlayContentPathBindings2, "isPresented", new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$8
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj6) {
                return invoke((Boolean) obj6);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Boolean bool3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(BooleanSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, bool3, interfaceC37138cM122336d);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$9
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Boolean invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$10
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Boolean, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Boolean, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj6) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj6);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement7 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement7);
                    } catch (Exception unused9) {
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
                    } catch (Exception unused10) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i4 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass5 = c22673i4.getOrCreateKotlinClass(Boolean.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (Boolean) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Long.TYPE))) {
                    return (Boolean) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Double.TYPE))) {
                    return (Boolean) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Float.TYPE))) {
                    return (Boolean) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Short.TYPE))) {
                    return (Boolean) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (Boolean) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (bool2 != null) {
            zIsPresented = bool2.booleanValue();
        } else {
            zIsPresented = hormonalInsightsLoaderModel.isPresented();
        }
        boolean z14 = zIsPresented;
        bindings = hormonalInsightsLoaderModel.getBindings();
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
                Iterable iterable6 = (Iterable) bindings;
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable6, 10));
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
            objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
            if (objResolveStateRef2 != null) {
                BindingLoggerKt.logContentBinding("bindings", strResolveContentBindingKey2, objResolveStateRef2);
                objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                if (!(objUnwrapForCoercion3 instanceof String)) {
                    objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (objOverlayContentPathBindings3 == null) {
                        map5 = bindings;
                    } else {
                        if (objOverlayContentPathBindings3 instanceof JsonElement) {
                            JsonElement jsonElement7 = (JsonElement) objOverlayContentPathBindings3;
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                            objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), jsonElement7);
                        } else {
                            if (!(objOverlayContentPathBindings3 instanceof Map)) {
                                if (objOverlayContentPathBindings3 instanceof Number) {
                                    c22673i1 = AbstractC22671h0.f89337a;
                                    orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(Map.class);
                                    map5 = bindings;
                                    if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                        map6 = (Map) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                        map6 = (Map) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                        map6 = (Map) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls3))) {
                                        map6 = (Map) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls2))) {
                                        map6 = (Map) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                        map6 = (Map) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                                    }
                                    objOverlayContentPathBindings3 = map6;
                                } else {
                                    map5 = bindings;
                                    if (objOverlayContentPathBindings3 instanceof String) {
                                        JsonPrimitive jsonPrimitiveM1841c7 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                                        StringSerializer stringSerializer4 = StringSerializer.INSTANCE;
                                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer4, stringSerializer4), jsonPrimitiveM1841c7);
                                        if (objOverlayContentPathBindings3 == null) {
                                        }
                                    }
                                }
                            }
                            if (objOverlayContentPathBindings3 == null) {
                                objOverlayContentPathBindings3 = map5;
                            }
                        }
                        map5 = bindings;
                        if (objOverlayContentPathBindings3 == null) {
                            objOverlayContentPathBindings3 = map5;
                        }
                    }
                    objOverlayContentPathBindings3 = null;
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = map5;
                    }
                } else {
                    objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (objOverlayContentPathBindings3 == null) {
                        map5 = bindings;
                    } else {
                        if (objOverlayContentPathBindings3 instanceof JsonElement) {
                            JsonElement jsonElement8 = (JsonElement) objOverlayContentPathBindings3;
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer5 = StringSerializer.INSTANCE;
                            objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer5, stringSerializer5), jsonElement8);
                        } else {
                            if (!(objOverlayContentPathBindings3 instanceof Map)) {
                                if (objOverlayContentPathBindings3 instanceof Number) {
                                    c22673i1 = AbstractC22671h0.f89337a;
                                    orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(Map.class);
                                    map5 = bindings;
                                    if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                        map6 = (Map) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                        map6 = (Map) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                        map6 = (Map) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls3))) {
                                        map6 = (Map) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls2))) {
                                        map6 = (Map) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                        map6 = (Map) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                                    }
                                    objOverlayContentPathBindings3 = map6;
                                } else {
                                    map5 = bindings;
                                    if (objOverlayContentPathBindings3 instanceof String) {
                                        JsonPrimitive jsonPrimitiveM1841c8 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                                        StringSerializer stringSerializer6 = StringSerializer.INSTANCE;
                                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer6, stringSerializer6), jsonPrimitiveM1841c8);
                                        if (objOverlayContentPathBindings3 == null) {
                                        }
                                    }
                                }
                            }
                            if (objOverlayContentPathBindings3 == null) {
                                objOverlayContentPathBindings3 = map5;
                            }
                        }
                        map5 = bindings;
                        if (objOverlayContentPathBindings3 == null) {
                            objOverlayContentPathBindings3 = map5;
                        }
                    }
                    objOverlayContentPathBindings3 = null;
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = map5;
                    }
                }
            }
        } else if (objOverlayContentPathBindings3 != null) {
            objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(r1, "bindings", accumulatedState, objOverlayContentPathBindings3, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$11
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj6) {
                    return invoke((Map<String, ? extends String>) obj6);
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
                    } catch (Exception unused9) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$12
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Map<String, ? extends String> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer7 = StringSerializer.INSTANCE;
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer7, stringSerializer7), json);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
            });
        }
        Map map8 = (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "bindings", accumulatedState, objOverlayContentPathBindings3, "bindings", new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$13
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj6) {
                return invoke((Map<String, ? extends String>) obj6);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Map<String, ? extends String> map9) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    StringSerializer stringSerializer7 = StringSerializer.INSTANCE;
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new LinkedHashMapSerializer(stringSerializer7, stringSerializer7));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, map9, interfaceC37138cM122336d);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$14
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends String> invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    StringSerializer stringSerializer7 = StringSerializer.INSTANCE;
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer7, stringSerializer7), json);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$15
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
                    JsonElement jsonElement9 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer7 = StringSerializer.INSTANCE;
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer7, stringSerializer7), jsonElement9);
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
                    JsonPrimitive jsonPrimitiveM1841c9 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer8 = StringSerializer.INSTANCE;
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer8, stringSerializer8), jsonPrimitiveM1841c9);
                    } catch (Exception unused10) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i4 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass5 = c22673i4.getOrCreateKotlinClass(Map.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (Map) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Long.TYPE))) {
                    return (Map) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Double.TYPE))) {
                    return (Map) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Float.TYPE))) {
                    return (Map) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Short.TYPE))) {
                    return (Map) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (Map) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        aggregateBindings = hormonalInsightsLoaderModel.getAggregateBindings();
        if (aggregateBindings == null) {
            obj = null;
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
                Iterable iterable7 = (Iterable) aggregateBindings;
                arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable7, 10));
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
                map4 = (Map) arrayList3;
            } else {
                map4 = aggregateBindings;
            }
            obj = map4;
        }
        if (r1 != 0) {
            strResolveContentBindingKey3 = BindingLoggerKt.resolveContentBindingKey(r1, "aggregateBindings");
        } else {
            strResolveContentBindingKey3 = null;
        }
        if (strResolveContentBindingKey3 != null) {
            objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
            if (objResolveStateRef != null) {
                BindingLoggerKt.logContentBinding("aggregateBindings", strResolveContentBindingKey3, objResolveStateRef);
                objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                if (!(objUnwrapForCoercion instanceof String)) {
                    objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (objUnwrapForCoercion2 == null) {
                        objOverlayContentPathBindings4 = null;
                    } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                        JsonElement jsonElement9 = (JsonElement) objUnwrapForCoercion2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement9);
                    } else if (objUnwrapForCoercion2 instanceof Map) {
                        if (objUnwrapForCoercion2 instanceof Number) {
                            c22673i0 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings4 = (Map) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings4 = (Map) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings4 = (Map) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings4 = (Map) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings4 = (Map) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings4 = (Map) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                            }
                        } else if (objUnwrapForCoercion2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c9 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c9);
                            if (objUnwrapForCoercion2 != null) {
                                objOverlayContentPathBindings4 = objUnwrapForCoercion2;
                            }
                        }
                        objOverlayContentPathBindings4 = null;
                    } else {
                        objOverlayContentPathBindings4 = objUnwrapForCoercion2;
                    }
                    if (objOverlayContentPathBindings4 == null) {
                        obj = aggregateBindings;
                    } else {
                        obj = objOverlayContentPathBindings4;
                    }
                } else {
                    objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (objUnwrapForCoercion2 == null) {
                        objOverlayContentPathBindings4 = null;
                    } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                        JsonElement jsonElement10 = (JsonElement) objUnwrapForCoercion2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement10);
                    } else if (objUnwrapForCoercion2 instanceof Map) {
                        if (objUnwrapForCoercion2 instanceof Number) {
                            c22673i0 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings4 = (Map) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings4 = (Map) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings4 = (Map) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings4 = (Map) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings4 = (Map) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings4 = (Map) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                            }
                        } else if (objUnwrapForCoercion2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c10 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c10);
                            if (objUnwrapForCoercion2 != null) {
                                objOverlayContentPathBindings4 = objUnwrapForCoercion2;
                            }
                        }
                        objOverlayContentPathBindings4 = null;
                    } else {
                        objOverlayContentPathBindings4 = objUnwrapForCoercion2;
                    }
                    if (objOverlayContentPathBindings4 == null) {
                        obj = aggregateBindings;
                    } else {
                        obj = objOverlayContentPathBindings4;
                    }
                }
            }
        } else if (obj != null) {
            objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(r1, "aggregateBindings", accumulatedState, obj, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$16
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj6) {
                    return invoke((Map<String, ? extends AggregateBinding>) obj6);
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
            }, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$17
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
            obj = objOverlayContentPathBindings4;
        }
        return (HormonalInsightsLoaderModel) ContentBindingResolverKt.copyBindingsFrom(new HormonalInsightsLoaderModel(str2, z14, map8, (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "aggregateBindings", accumulatedState, obj, "aggregateBindings", new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$18
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj6) {
                return invoke((Map<String, ? extends AggregateBinding>) obj6);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Map<String, ? extends AggregateBinding> map9) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, map9, interfaceC37138cM122336d);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$19
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
        }, new Function1() { // from class: com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModelStateBindingKt$generatedBind$$inlined$resolveBinding$20
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends AggregateBinding> invoke(Object obj6) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj6);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement11 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement11);
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
                    JsonPrimitive jsonPrimitiveM1841c11 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c11);
                    } catch (Exception unused10) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i4 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass5 = c22673i4.getOrCreateKotlinClass(Map.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (Map) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Long.TYPE))) {
                    return (Map) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Double.TYPE))) {
                    return (Map) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Float.TYPE))) {
                    return (Map) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Short.TYPE))) {
                    return (Map) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (Map) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        })), hormonalInsightsLoaderModel);
    }

    public static /* synthetic */ HormonalInsightsLoaderModel generatedBind$default(HormonalInsightsLoaderModel hormonalInsightsLoaderModel, Map map, Map map2, Map map3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map2 = null;
        }
        return generatedBind(hormonalInsightsLoaderModel, map, map2, map3);
    }
}
