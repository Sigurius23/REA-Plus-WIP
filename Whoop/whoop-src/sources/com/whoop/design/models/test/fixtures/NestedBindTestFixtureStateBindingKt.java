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
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003¨\u0006\t"}, m65681d2 = {"generatedBind", "Lcom/whoop/design/models/test/fixtures/NestedBindTestFixture;", "contentBinding", "", "", "aggregateBindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "accumulatedState", "", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class NestedBindTestFixtureStateBindingKt {
    /* JADX WARN: Code duplicated, block: B:101:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:104:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:107:0x01df  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:120:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:127:0x021c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0222  */
    /* JADX WARN: Code duplicated, block: B:131:0x0227  */
    /* JADX WARN: Code duplicated, block: B:133:0x022b  */
    /* JADX WARN: Code duplicated, block: B:138:0x024d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0252  */
    /* JADX WARN: Code duplicated, block: B:143:0x0256  */
    /* JADX WARN: Code duplicated, block: B:145:0x0268  */
    /* JADX WARN: Code duplicated, block: B:147:0x0277  */
    /* JADX WARN: Code duplicated, block: B:149:0x0281  */
    /* JADX WARN: Code duplicated, block: B:150:0x028e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0298  */
    /* JADX WARN: Code duplicated, block: B:153:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:155:0x02af  */
    /* JADX WARN: Code duplicated, block: B:156:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:158:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:159:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:161:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:162:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:164:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:170:0x0317  */
    /* JADX WARN: Code duplicated, block: B:171:0x031a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:173:0x031d  */
    /* JADX WARN: Code duplicated, block: B:176:0x0340  */
    /* JADX WARN: Code duplicated, block: B:179:0x034b  */
    /* JADX WARN: Code duplicated, block: B:180:0x034d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0355  */
    /* JADX WARN: Code duplicated, block: B:185:0x035a  */
    /* JADX WARN: Code duplicated, block: B:189:0x0360  */
    /* JADX WARN: Code duplicated, block: B:190:0x0365  */
    /* JADX WARN: Code duplicated, block: B:192:0x0368  */
    /* JADX WARN: Code duplicated, block: B:194:0x036e  */
    /* JADX WARN: Code duplicated, block: B:201:0x0390  */
    /* JADX WARN: Code duplicated, block: B:203:0x0396  */
    /* JADX WARN: Code duplicated, block: B:204:0x0399  */
    /* JADX WARN: Code duplicated, block: B:206:0x039d  */
    /* JADX WARN: Code duplicated, block: B:209:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:211:0x03bf A[PHI: r0
      0x03bf: PHI (r0v28 java.lang.Object) = (r0v6 java.lang.Object), (r0v10 java.lang.Object) binds: [B:210:0x03bd, B:238:0x0487] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:212:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:214:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:216:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:217:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:219:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:220:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:222:0x0408  */
    /* JADX WARN: Code duplicated, block: B:223:0x0417  */
    /* JADX WARN: Code duplicated, block: B:225:0x0421  */
    /* JADX WARN: Code duplicated, block: B:226:0x042f  */
    /* JADX WARN: Code duplicated, block: B:228:0x0439  */
    /* JADX WARN: Code duplicated, block: B:229:0x0447  */
    /* JADX WARN: Code duplicated, block: B:231:0x0453  */
    /* JADX WARN: Code duplicated, block: B:232:0x0461  */
    /* JADX WARN: Code duplicated, block: B:234:0x0465  */
    /* JADX WARN: Code duplicated, block: B:241:0x048d  */
    /* JADX WARN: Code duplicated, block: B:242:0x048f A[PHI: r9
      0x048f: PHI (r9v3 java.lang.Object) = (r9v2 java.lang.Object), (r9v18 java.lang.Object) binds: [B:245:0x0494, B:240:0x048b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:243:0x0491 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:245:0x0494  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final NestedBindTestFixture generatedBind(NestedBindTestFixture nestedBindTestFixture, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, ? extends Object> accumulatedState) {
        Object objOverlayContentPathBindings;
        WithGeneratedBindings withGeneratedBindingsBind;
        String title;
        PrimitiveBindTestFixture nested;
        WithGeneratedBindings withGeneratedBindingsBind2;
        PrimitiveBindTestFixture primitiveBindTestFixture;
        Object objOverlayContentPathBindings2;
        String strResolveContentBindingKey;
        PrimitiveBindTestFixture nested2;
        PrimitiveBindTestFixture optionalNested;
        WithGeneratedBindings withGeneratedBindingsBind3;
        PrimitiveBindTestFixture primitiveBindTestFixture2;
        Object obj;
        String strResolveContentBindingKey2;
        Object objOverlayContentPathBindings3;
        Object objResolveStateRef;
        Object objUnwrapForCoercion;
        Object objUnwrapForCoercion2;
        C22673i0 c22673i0;
        InterfaceC21461d orCreateKotlinClass;
        Object objResolveStateRef2;
        Object objUnwrapForCoercion3;
        PrimitiveBindTestFixture primitiveBindTestFixture3;
        C22673i0 c22673i1;
        InterfaceC21461d orCreateKotlinClass2;
        PrimitiveBindTestFixture primitiveBindTestFixture4;
        AbstractC22676k.m65750j(nestedBindTestFixture, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if ((map == null || map.isEmpty()) && ((map2 == null || map2.isEmpty()) && accumulatedState.isEmpty())) {
            return nestedBindTestFixture;
        }
        Object title2 = nestedBindTestFixture.getTitle();
        if (title2 == null) {
            objOverlayContentPathBindings = null;
        } else if (title2 instanceof WithGeneratedBindings) {
            Object objBind = ((WithGeneratedBindings) title2).bind(accumulatedState);
            if (!(objBind instanceof String)) {
                objBind = null;
            }
            objOverlayContentPathBindings = (String) objBind;
            if (objOverlayContentPathBindings == null) {
                objOverlayContentPathBindings = title2;
            }
        } else if (title2 instanceof List) {
            Iterable iterable = (Iterable) title2;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            for (Object obj2 : iterable) {
                WithGeneratedBindings withGeneratedBindings = obj2 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj2 : null;
                if (withGeneratedBindings != null && (withGeneratedBindingsBind = withGeneratedBindings.bind(accumulatedState)) != null) {
                    obj2 = withGeneratedBindingsBind;
                }
                arrayList.add(obj2);
            }
            objOverlayContentPathBindings = (String) arrayList;
        } else {
            objOverlayContentPathBindings = title2;
        }
        String strResolveContentBindingKey3 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "title") : null;
        Class cls = Byte.TYPE;
        Class cls2 = Short.TYPE;
        Class cls3 = Float.TYPE;
        Class cls4 = Double.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        if (strResolveContentBindingKey3 != null) {
            Object objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
            if (objResolveStateRef3 != null) {
                BindingLoggerKt.logContentBinding("title", strResolveContentBindingKey3, objResolveStateRef3);
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
                            objOverlayContentPathBindings = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement);
                        } catch (Exception unused) {
                            objOverlayContentPathBindings = null;
                        }
                    } else {
                        boolean z4 = objOverlayContentPathBindings instanceof String;
                        if (!z4) {
                            if (objOverlayContentPathBindings instanceof Number) {
                                C22673i0 c22673i2 = AbstractC22671h0.f89337a;
                                InterfaceC21461d orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(String.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings = (String) Integer.valueOf(((Number) objOverlayContentPathBindings).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings = (String) Long.valueOf(((Number) objOverlayContentPathBindings).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings = (String) Double.valueOf(((Number) objOverlayContentPathBindings).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings = (String) Float.valueOf(((Number) objOverlayContentPathBindings).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls2))) {
                                    objOverlayContentPathBindings = (String) Short.valueOf(((Number) objOverlayContentPathBindings).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls))) {
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
                        objOverlayContentPathBindings = title2;
                    }
                }
            }
            title = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "title", accumulatedState, objOverlayContentPathBindings, "title", new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$3
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
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$4
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
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$5
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
                    C22673i0 c22673i3 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(String.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (String) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Long.TYPE))) {
                        return (String) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Double.TYPE))) {
                        return (String) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Float.TYPE))) {
                        return (String) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Short.TYPE))) {
                        return (String) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (String) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            });
            if (title == null) {
                title = nestedBindTestFixture.getTitle();
            }
            String str = title;
            nested = nestedBindTestFixture.getNested();
            if (nested == null) {
                objOverlayContentPathBindings2 = null;
            } else {
                withGeneratedBindingsBind2 = nested.bind(accumulatedState);
                if (!(withGeneratedBindingsBind2 instanceof PrimitiveBindTestFixture)) {
                    withGeneratedBindingsBind2 = null;
                }
                primitiveBindTestFixture = (PrimitiveBindTestFixture) withGeneratedBindingsBind2;
                if (primitiveBindTestFixture == null) {
                    primitiveBindTestFixture = nested;
                }
                objOverlayContentPathBindings2 = primitiveBindTestFixture;
            }
            if (r1 != 0) {
                strResolveContentBindingKey = BindingLoggerKt.resolveContentBindingKey(map, "nested");
            } else {
                strResolveContentBindingKey = null;
            }
            if (strResolveContentBindingKey != null) {
                objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
                if (objResolveStateRef2 != null) {
                    BindingLoggerKt.logContentBinding("nested", strResolveContentBindingKey, objResolveStateRef2);
                    objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (!(objUnwrapForCoercion3 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion3) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                        objOverlayContentPathBindings2 = null;
                    } else {
                        objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                        if (objOverlayContentPathBindings2 == null) {
                            primitiveBindTestFixture3 = nested;
                        } else {
                            if (objOverlayContentPathBindings2 instanceof JsonElement) {
                                try {
                                    objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), (JsonElement) objOverlayContentPathBindings2);
                                } catch (Exception unused3) {
                                    objOverlayContentPathBindings2 = null;
                                }
                            } else {
                                if (!(objOverlayContentPathBindings2 instanceof PrimitiveBindTestFixture)) {
                                    if (objOverlayContentPathBindings2 instanceof Number) {
                                        c22673i1 = AbstractC22671h0.f89337a;
                                        orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(PrimitiveBindTestFixture.class);
                                        primitiveBindTestFixture3 = nested;
                                        if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                            primitiveBindTestFixture4 = (PrimitiveBindTestFixture) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                            primitiveBindTestFixture4 = (PrimitiveBindTestFixture) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                            primitiveBindTestFixture4 = (PrimitiveBindTestFixture) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls3))) {
                                            primitiveBindTestFixture4 = (PrimitiveBindTestFixture) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls2))) {
                                            primitiveBindTestFixture4 = (PrimitiveBindTestFixture) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                            primitiveBindTestFixture4 = (PrimitiveBindTestFixture) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                                        }
                                        objOverlayContentPathBindings2 = primitiveBindTestFixture4;
                                    } else {
                                        primitiveBindTestFixture3 = nested;
                                        if (objOverlayContentPathBindings2 instanceof String) {
                                            try {
                                                objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), AbstractC0770m.m1841c((String) objOverlayContentPathBindings2));
                                            } catch (Exception unused4) {
                                                objOverlayContentPathBindings2 = null;
                                            }
                                            if (objOverlayContentPathBindings2 == null) {
                                            }
                                        }
                                    }
                                }
                                if (objOverlayContentPathBindings2 == null) {
                                    objOverlayContentPathBindings2 = primitiveBindTestFixture3;
                                }
                            }
                            primitiveBindTestFixture3 = nested;
                            if (objOverlayContentPathBindings2 == null) {
                                objOverlayContentPathBindings2 = primitiveBindTestFixture3;
                            }
                        }
                        objOverlayContentPathBindings2 = null;
                        if (objOverlayContentPathBindings2 == null) {
                            objOverlayContentPathBindings2 = primitiveBindTestFixture3;
                        }
                    }
                }
            } else if (objOverlayContentPathBindings2 != null) {
                objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(r1, "nested", accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$6
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                        return invoke((PrimitiveBindTestFixture) obj3);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(PrimitiveBindTestFixture v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            InterfaceC37138c interfaceC37138cM113843f = AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class));
                            AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                            stateBindingJson.getClass();
                            return AbstractC12313p.m34290h0(stateBindingJson, v13, interfaceC37138cM113843f);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$7
                    /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.test.fixtures.PrimitiveBindTestFixture, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final PrimitiveBindTestFixture invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), json);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                });
            }
            nested2 = (PrimitiveBindTestFixture) DotPathBindingsKt.overlayAggregateBinding(map2, "nested", accumulatedState, objOverlayContentPathBindings2, "nested", new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$8
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    return invoke((PrimitiveBindTestFixture) obj3);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(PrimitiveBindTestFixture primitiveBindTestFixture5) {
                    try {
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)));
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, primitiveBindTestFixture5, interfaceC37138cM122336d);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$9
                /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.test.fixtures.PrimitiveBindTestFixture, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final PrimitiveBindTestFixture invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), json);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$10
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.test.fixtures.PrimitiveBindTestFixture, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.test.fixtures.PrimitiveBindTestFixture, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final PrimitiveBindTestFixture invoke(Object obj3) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj3);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        try {
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), (JsonElement) UnwrapForCoercion);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                    if (UnwrapForCoercion instanceof PrimitiveBindTestFixture) {
                        return UnwrapForCoercion;
                    }
                    if (!(UnwrapForCoercion instanceof Number)) {
                        if (!(UnwrapForCoercion instanceof String)) {
                            return null;
                        }
                        try {
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), AbstractC0770m.m1841c((String) UnwrapForCoercion));
                        } catch (Exception unused6) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i3 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(PrimitiveBindTestFixture.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (PrimitiveBindTestFixture) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Long.TYPE))) {
                        return (PrimitiveBindTestFixture) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Double.TYPE))) {
                        return (PrimitiveBindTestFixture) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Float.TYPE))) {
                        return (PrimitiveBindTestFixture) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Short.TYPE))) {
                        return (PrimitiveBindTestFixture) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (PrimitiveBindTestFixture) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            });
            if (nested2 == null) {
                nested2 = nestedBindTestFixture.getNested();
            }
            PrimitiveBindTestFixture primitiveBindTestFixture5 = nested2;
            optionalNested = nestedBindTestFixture.getOptionalNested();
            if (optionalNested == null) {
                obj = null;
            } else {
                withGeneratedBindingsBind3 = optionalNested.bind(accumulatedState);
                if (!(withGeneratedBindingsBind3 instanceof PrimitiveBindTestFixture)) {
                    withGeneratedBindingsBind3 = null;
                }
                primitiveBindTestFixture2 = (PrimitiveBindTestFixture) withGeneratedBindingsBind3;
                if (primitiveBindTestFixture2 == null) {
                    primitiveBindTestFixture2 = optionalNested;
                }
                obj = primitiveBindTestFixture2;
            }
            if (r1 != 0) {
                strResolveContentBindingKey2 = BindingLoggerKt.resolveContentBindingKey(r1, "optionalNested");
            } else {
                strResolveContentBindingKey2 = null;
            }
            if (strResolveContentBindingKey2 != null) {
                objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
                if (objResolveStateRef != null) {
                    BindingLoggerKt.logContentBinding("optionalNested", strResolveContentBindingKey2, objResolveStateRef);
                    objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (!(objUnwrapForCoercion instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                        obj = null;
                    } else {
                        objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                        if (objUnwrapForCoercion2 == null) {
                            objOverlayContentPathBindings3 = null;
                        } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                            try {
                                objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), (JsonElement) objUnwrapForCoercion2);
                            } catch (Exception unused5) {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else if (objUnwrapForCoercion2 instanceof PrimitiveBindTestFixture) {
                            objOverlayContentPathBindings3 = objUnwrapForCoercion2;
                        } else {
                            if (objUnwrapForCoercion2 instanceof Number) {
                                c22673i0 = AbstractC22671h0.f89337a;
                                orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(PrimitiveBindTestFixture.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings3 = (PrimitiveBindTestFixture) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings3 = (PrimitiveBindTestFixture) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings3 = (PrimitiveBindTestFixture) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings3 = (PrimitiveBindTestFixture) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                    objOverlayContentPathBindings3 = (PrimitiveBindTestFixture) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
                                    objOverlayContentPathBindings3 = (PrimitiveBindTestFixture) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                                }
                            } else if (objUnwrapForCoercion2 instanceof String) {
                                try {
                                    objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), AbstractC0770m.m1841c((String) objUnwrapForCoercion2));
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
                            obj = optionalNested;
                        } else {
                            obj = objOverlayContentPathBindings3;
                        }
                    }
                }
            } else if (obj != null) {
                objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(r1, "optionalNested", accumulatedState, obj, new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$11
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                        return invoke((PrimitiveBindTestFixture) obj3);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(PrimitiveBindTestFixture v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            InterfaceC37138c interfaceC37138cM113843f = AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class));
                            AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                            stateBindingJson.getClass();
                            return AbstractC12313p.m34290h0(stateBindingJson, v13, interfaceC37138cM113843f);
                        } catch (Exception unused7) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$12
                    /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.test.fixtures.PrimitiveBindTestFixture, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final PrimitiveBindTestFixture invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), json);
                        } catch (Exception unused7) {
                            return null;
                        }
                    }
                });
                obj = objOverlayContentPathBindings3;
            }
            return (NestedBindTestFixture) ContentBindingResolverKt.copyBindingsFrom(new NestedBindTestFixture(str, primitiveBindTestFixture5, (PrimitiveBindTestFixture) DotPathBindingsKt.overlayAggregateBinding(map2, "optionalNested", accumulatedState, obj, "optionalNested", new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$13
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    return invoke((PrimitiveBindTestFixture) obj3);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(PrimitiveBindTestFixture primitiveBindTestFixture6) {
                    try {
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)));
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, primitiveBindTestFixture6, interfaceC37138cM122336d);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$14
                /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.test.fixtures.PrimitiveBindTestFixture, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final PrimitiveBindTestFixture invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), json);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$15
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.test.fixtures.PrimitiveBindTestFixture, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.test.fixtures.PrimitiveBindTestFixture, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final PrimitiveBindTestFixture invoke(Object obj3) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj3);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        try {
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), (JsonElement) UnwrapForCoercion);
                        } catch (Exception unused7) {
                            return null;
                        }
                    }
                    if (UnwrapForCoercion instanceof PrimitiveBindTestFixture) {
                        return UnwrapForCoercion;
                    }
                    if (!(UnwrapForCoercion instanceof Number)) {
                        if (!(UnwrapForCoercion instanceof String)) {
                            return null;
                        }
                        try {
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), AbstractC0770m.m1841c((String) UnwrapForCoercion));
                        } catch (Exception unused8) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i3 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(PrimitiveBindTestFixture.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (PrimitiveBindTestFixture) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Long.TYPE))) {
                        return (PrimitiveBindTestFixture) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Double.TYPE))) {
                        return (PrimitiveBindTestFixture) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Float.TYPE))) {
                        return (PrimitiveBindTestFixture) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Short.TYPE))) {
                        return (PrimitiveBindTestFixture) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (PrimitiveBindTestFixture) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            })), nestedBindTestFixture);
        }
        if (objOverlayContentPathBindings != null) {
            objOverlayContentPathBindings = ContentPathBindingsKt.overlayContentPathBindings(map, "title", accumulatedState, objOverlayContentPathBindings, new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$1
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    return invoke((String) obj3);
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
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$2
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
        title = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "title", accumulatedState, objOverlayContentPathBindings, "title", new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$3
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
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$4
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
        }, new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$5
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
                    JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c2);
                    } catch (Exception unused8) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i3 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(String.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (String) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Long.TYPE))) {
                    return (String) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Double.TYPE))) {
                    return (String) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Float.TYPE))) {
                    return (String) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Short.TYPE))) {
                    return (String) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (String) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (title == null) {
            title = nestedBindTestFixture.getTitle();
        }
        String str2 = title;
        nested = nestedBindTestFixture.getNested();
        if (nested == null) {
            objOverlayContentPathBindings2 = null;
        } else {
            withGeneratedBindingsBind2 = nested.bind(accumulatedState);
            if (!(withGeneratedBindingsBind2 instanceof PrimitiveBindTestFixture)) {
                withGeneratedBindingsBind2 = null;
            }
            primitiveBindTestFixture = (PrimitiveBindTestFixture) withGeneratedBindingsBind2;
            if (primitiveBindTestFixture == null) {
                primitiveBindTestFixture = nested;
            }
            objOverlayContentPathBindings2 = primitiveBindTestFixture;
        }
        if (r1 != 0) {
            strResolveContentBindingKey = BindingLoggerKt.resolveContentBindingKey(map, "nested");
        } else {
            strResolveContentBindingKey = null;
        }
        if (strResolveContentBindingKey != null) {
            objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
            if (objResolveStateRef2 != null) {
                BindingLoggerKt.logContentBinding("nested", strResolveContentBindingKey, objResolveStateRef2);
                objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                if (!(objUnwrapForCoercion3 instanceof String)) {
                    objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (objOverlayContentPathBindings2 == null) {
                        primitiveBindTestFixture3 = nested;
                    } else {
                        if (objOverlayContentPathBindings2 instanceof JsonElement) {
                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), (JsonElement) objOverlayContentPathBindings2);
                        } else {
                            if (!(objOverlayContentPathBindings2 instanceof PrimitiveBindTestFixture)) {
                                if (objOverlayContentPathBindings2 instanceof Number) {
                                    c22673i1 = AbstractC22671h0.f89337a;
                                    orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(PrimitiveBindTestFixture.class);
                                    primitiveBindTestFixture3 = nested;
                                    if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                        primitiveBindTestFixture4 = (PrimitiveBindTestFixture) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                        primitiveBindTestFixture4 = (PrimitiveBindTestFixture) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                        primitiveBindTestFixture4 = (PrimitiveBindTestFixture) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls3))) {
                                        primitiveBindTestFixture4 = (PrimitiveBindTestFixture) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls2))) {
                                        primitiveBindTestFixture4 = (PrimitiveBindTestFixture) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                        primitiveBindTestFixture4 = (PrimitiveBindTestFixture) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                                    }
                                    objOverlayContentPathBindings2 = primitiveBindTestFixture4;
                                } else {
                                    primitiveBindTestFixture3 = nested;
                                    if (objOverlayContentPathBindings2 instanceof String) {
                                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), AbstractC0770m.m1841c((String) objOverlayContentPathBindings2));
                                        if (objOverlayContentPathBindings2 == null) {
                                        }
                                    }
                                }
                            }
                            if (objOverlayContentPathBindings2 == null) {
                                objOverlayContentPathBindings2 = primitiveBindTestFixture3;
                            }
                        }
                        primitiveBindTestFixture3 = nested;
                        if (objOverlayContentPathBindings2 == null) {
                            objOverlayContentPathBindings2 = primitiveBindTestFixture3;
                        }
                    }
                    objOverlayContentPathBindings2 = null;
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = primitiveBindTestFixture3;
                    }
                } else {
                    objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (objOverlayContentPathBindings2 == null) {
                        primitiveBindTestFixture3 = nested;
                    } else {
                        if (objOverlayContentPathBindings2 instanceof JsonElement) {
                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), (JsonElement) objOverlayContentPathBindings2);
                        } else {
                            if (!(objOverlayContentPathBindings2 instanceof PrimitiveBindTestFixture)) {
                                if (objOverlayContentPathBindings2 instanceof Number) {
                                    c22673i1 = AbstractC22671h0.f89337a;
                                    orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(PrimitiveBindTestFixture.class);
                                    primitiveBindTestFixture3 = nested;
                                    if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                        primitiveBindTestFixture4 = (PrimitiveBindTestFixture) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                        primitiveBindTestFixture4 = (PrimitiveBindTestFixture) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                        primitiveBindTestFixture4 = (PrimitiveBindTestFixture) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls3))) {
                                        primitiveBindTestFixture4 = (PrimitiveBindTestFixture) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls2))) {
                                        primitiveBindTestFixture4 = (PrimitiveBindTestFixture) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                        primitiveBindTestFixture4 = (PrimitiveBindTestFixture) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                                    }
                                    objOverlayContentPathBindings2 = primitiveBindTestFixture4;
                                } else {
                                    primitiveBindTestFixture3 = nested;
                                    if (objOverlayContentPathBindings2 instanceof String) {
                                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), AbstractC0770m.m1841c((String) objOverlayContentPathBindings2));
                                        if (objOverlayContentPathBindings2 == null) {
                                        }
                                    }
                                }
                            }
                            if (objOverlayContentPathBindings2 == null) {
                                objOverlayContentPathBindings2 = primitiveBindTestFixture3;
                            }
                        }
                        primitiveBindTestFixture3 = nested;
                        if (objOverlayContentPathBindings2 == null) {
                            objOverlayContentPathBindings2 = primitiveBindTestFixture3;
                        }
                    }
                    objOverlayContentPathBindings2 = null;
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = primitiveBindTestFixture3;
                    }
                }
            }
        } else if (objOverlayContentPathBindings2 != null) {
            objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(r1, "nested", accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$6
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    return invoke((PrimitiveBindTestFixture) obj3);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(PrimitiveBindTestFixture v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        InterfaceC37138c interfaceC37138cM113843f = AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class));
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, v13, interfaceC37138cM113843f);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$7
                /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.test.fixtures.PrimitiveBindTestFixture, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final PrimitiveBindTestFixture invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), json);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            });
        }
        nested2 = (PrimitiveBindTestFixture) DotPathBindingsKt.overlayAggregateBinding(map2, "nested", accumulatedState, objOverlayContentPathBindings2, "nested", new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$8
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                return invoke((PrimitiveBindTestFixture) obj3);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(PrimitiveBindTestFixture primitiveBindTestFixture6) {
                try {
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, primitiveBindTestFixture6, interfaceC37138cM122336d);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$9
            /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.test.fixtures.PrimitiveBindTestFixture, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final PrimitiveBindTestFixture invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), json);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$10
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.test.fixtures.PrimitiveBindTestFixture, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.test.fixtures.PrimitiveBindTestFixture, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final PrimitiveBindTestFixture invoke(Object obj3) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj3);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), (JsonElement) UnwrapForCoercion);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof PrimitiveBindTestFixture) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    try {
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), AbstractC0770m.m1841c((String) UnwrapForCoercion));
                    } catch (Exception unused8) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i3 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(PrimitiveBindTestFixture.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (PrimitiveBindTestFixture) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Long.TYPE))) {
                    return (PrimitiveBindTestFixture) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Double.TYPE))) {
                    return (PrimitiveBindTestFixture) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Float.TYPE))) {
                    return (PrimitiveBindTestFixture) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Short.TYPE))) {
                    return (PrimitiveBindTestFixture) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (PrimitiveBindTestFixture) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (nested2 == null) {
            nested2 = nestedBindTestFixture.getNested();
        }
        PrimitiveBindTestFixture primitiveBindTestFixture6 = nested2;
        optionalNested = nestedBindTestFixture.getOptionalNested();
        if (optionalNested == null) {
            obj = null;
        } else {
            withGeneratedBindingsBind3 = optionalNested.bind(accumulatedState);
            if (!(withGeneratedBindingsBind3 instanceof PrimitiveBindTestFixture)) {
                withGeneratedBindingsBind3 = null;
            }
            primitiveBindTestFixture2 = (PrimitiveBindTestFixture) withGeneratedBindingsBind3;
            if (primitiveBindTestFixture2 == null) {
                primitiveBindTestFixture2 = optionalNested;
            }
            obj = primitiveBindTestFixture2;
        }
        if (r1 != 0) {
            strResolveContentBindingKey2 = BindingLoggerKt.resolveContentBindingKey(r1, "optionalNested");
        } else {
            strResolveContentBindingKey2 = null;
        }
        if (strResolveContentBindingKey2 != null) {
            objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
            if (objResolveStateRef != null) {
                BindingLoggerKt.logContentBinding("optionalNested", strResolveContentBindingKey2, objResolveStateRef);
                objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                if (!(objUnwrapForCoercion instanceof String)) {
                    objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (objUnwrapForCoercion2 == null) {
                        objOverlayContentPathBindings3 = null;
                    } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), (JsonElement) objUnwrapForCoercion2);
                    } else if (objUnwrapForCoercion2 instanceof PrimitiveBindTestFixture) {
                        if (objUnwrapForCoercion2 instanceof Number) {
                            c22673i0 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(PrimitiveBindTestFixture.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings3 = (PrimitiveBindTestFixture) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings3 = (PrimitiveBindTestFixture) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings3 = (PrimitiveBindTestFixture) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings3 = (PrimitiveBindTestFixture) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings3 = (PrimitiveBindTestFixture) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings3 = (PrimitiveBindTestFixture) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                            }
                        } else if (objUnwrapForCoercion2 instanceof String) {
                            objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), AbstractC0770m.m1841c((String) objUnwrapForCoercion2));
                            if (objUnwrapForCoercion2 != null) {
                                objOverlayContentPathBindings3 = objUnwrapForCoercion2;
                            }
                        }
                        objOverlayContentPathBindings3 = null;
                    } else {
                        objOverlayContentPathBindings3 = objUnwrapForCoercion2;
                    }
                    if (objOverlayContentPathBindings3 == null) {
                        obj = optionalNested;
                    } else {
                        obj = objOverlayContentPathBindings3;
                    }
                } else {
                    objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (objUnwrapForCoercion2 == null) {
                        objOverlayContentPathBindings3 = null;
                    } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), (JsonElement) objUnwrapForCoercion2);
                    } else if (objUnwrapForCoercion2 instanceof PrimitiveBindTestFixture) {
                        if (objUnwrapForCoercion2 instanceof Number) {
                            c22673i0 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(PrimitiveBindTestFixture.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings3 = (PrimitiveBindTestFixture) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings3 = (PrimitiveBindTestFixture) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings3 = (PrimitiveBindTestFixture) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings3 = (PrimitiveBindTestFixture) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings3 = (PrimitiveBindTestFixture) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings3 = (PrimitiveBindTestFixture) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                            }
                        } else if (objUnwrapForCoercion2 instanceof String) {
                            objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), AbstractC0770m.m1841c((String) objUnwrapForCoercion2));
                            if (objUnwrapForCoercion2 != null) {
                                objOverlayContentPathBindings3 = objUnwrapForCoercion2;
                            }
                        }
                        objOverlayContentPathBindings3 = null;
                    } else {
                        objOverlayContentPathBindings3 = objUnwrapForCoercion2;
                    }
                    if (objOverlayContentPathBindings3 == null) {
                        obj = optionalNested;
                    } else {
                        obj = objOverlayContentPathBindings3;
                    }
                }
            }
        } else if (obj != null) {
            objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(r1, "optionalNested", accumulatedState, obj, new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$11
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    return invoke((PrimitiveBindTestFixture) obj3);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(PrimitiveBindTestFixture v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        InterfaceC37138c interfaceC37138cM113843f = AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class));
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, v13, interfaceC37138cM113843f);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$12
                /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.test.fixtures.PrimitiveBindTestFixture, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final PrimitiveBindTestFixture invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), json);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            });
            obj = objOverlayContentPathBindings3;
        }
        return (NestedBindTestFixture) ContentBindingResolverKt.copyBindingsFrom(new NestedBindTestFixture(str2, primitiveBindTestFixture6, (PrimitiveBindTestFixture) DotPathBindingsKt.overlayAggregateBinding(map2, "optionalNested", accumulatedState, obj, "optionalNested", new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$13
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                return invoke((PrimitiveBindTestFixture) obj3);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(PrimitiveBindTestFixture primitiveBindTestFixture7) {
                try {
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, primitiveBindTestFixture7, interfaceC37138cM122336d);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$14
            /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.test.fixtures.PrimitiveBindTestFixture, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final PrimitiveBindTestFixture invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), json);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$15
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.test.fixtures.PrimitiveBindTestFixture, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.test.fixtures.PrimitiveBindTestFixture, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final PrimitiveBindTestFixture invoke(Object obj3) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj3);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), (JsonElement) UnwrapForCoercion);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof PrimitiveBindTestFixture) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    try {
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), AbstractC0770m.m1841c((String) UnwrapForCoercion));
                    } catch (Exception unused8) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i3 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(PrimitiveBindTestFixture.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (PrimitiveBindTestFixture) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Long.TYPE))) {
                    return (PrimitiveBindTestFixture) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Double.TYPE))) {
                    return (PrimitiveBindTestFixture) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Float.TYPE))) {
                    return (PrimitiveBindTestFixture) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Short.TYPE))) {
                    return (PrimitiveBindTestFixture) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (PrimitiveBindTestFixture) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        })), nestedBindTestFixture);
    }

    public static /* synthetic */ NestedBindTestFixture generatedBind$default(NestedBindTestFixture nestedBindTestFixture, Map map, Map map2, Map map3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map2 = null;
        }
        return generatedBind(nestedBindTestFixture, map, map2, map3);
    }
}
