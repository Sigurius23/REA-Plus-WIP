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
import kotlinx.serialization.internal.ArrayListSerializer;
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
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003¨\u0006\t"}, m65681d2 = {"generatedBind", "Lcom/whoop/design/models/test/fixtures/ArrayBindTestFixture;", "contentBinding", "", "", "aggregateBindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "accumulatedState", "", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ArrayBindTestFixtureStateBindingKt {
    /* JADX WARN: Code duplicated, block: B:101:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:104:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:105:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:107:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:116:0x0207  */
    /* JADX WARN: Code duplicated, block: B:118:0x020f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0213  */
    /* JADX WARN: Code duplicated, block: B:130:0x0228  */
    /* JADX WARN: Code duplicated, block: B:131:0x022d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0232  */
    /* JADX WARN: Code duplicated, block: B:136:0x0238  */
    /* JADX WARN: Code duplicated, block: B:143:0x025a  */
    /* JADX WARN: Code duplicated, block: B:145:0x0260  */
    /* JADX WARN: Code duplicated, block: B:147:0x0265  */
    /* JADX WARN: Code duplicated, block: B:149:0x0269  */
    /* JADX WARN: Code duplicated, block: B:154:0x0287  */
    /* JADX WARN: Code duplicated, block: B:157:0x028c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0290  */
    /* JADX WARN: Code duplicated, block: B:161:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:163:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:165:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:166:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:168:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:169:0x02df  */
    /* JADX WARN: Code duplicated, block: B:171:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:172:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:174:0x0300  */
    /* JADX WARN: Code duplicated, block: B:175:0x030d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0317  */
    /* JADX WARN: Code duplicated, block: B:178:0x0324  */
    /* JADX WARN: Code duplicated, block: B:180:0x032a  */
    /* JADX WARN: Code duplicated, block: B:186:0x034d  */
    /* JADX WARN: Code duplicated, block: B:187:0x0350 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:189:0x0353  */
    /* JADX WARN: Code duplicated, block: B:192:0x0376  */
    /* JADX WARN: Code duplicated, block: B:195:0x0381  */
    /* JADX WARN: Code duplicated, block: B:196:0x0383  */
    /* JADX WARN: Code duplicated, block: B:198:0x0387  */
    /* JADX WARN: Code duplicated, block: B:200:0x0392  */
    /* JADX WARN: Code duplicated, block: B:203:0x0397  */
    /* JADX WARN: Code duplicated, block: B:204:0x0399  */
    /* JADX WARN: Code duplicated, block: B:207:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:209:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:210:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:221:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:222:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:224:0x03da  */
    /* JADX WARN: Code duplicated, block: B:226:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:233:0x0402  */
    /* JADX WARN: Code duplicated, block: B:235:0x0408  */
    /* JADX WARN: Code duplicated, block: B:236:0x040b  */
    /* JADX WARN: Code duplicated, block: B:238:0x040f  */
    /* JADX WARN: Code duplicated, block: B:241:0x0429  */
    /* JADX WARN: Code duplicated, block: B:243:0x042d A[PHI: r0
      0x042d: PHI (r0v28 java.lang.Object) = (r0v6 java.lang.Object), (r0v10 java.lang.Object) binds: [B:242:0x042b, B:270:0x04f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:244:0x0430  */
    /* JADX WARN: Code duplicated, block: B:246:0x0434  */
    /* JADX WARN: Code duplicated, block: B:248:0x0444  */
    /* JADX WARN: Code duplicated, block: B:249:0x0453  */
    /* JADX WARN: Code duplicated, block: B:251:0x045d  */
    /* JADX WARN: Code duplicated, block: B:252:0x046c  */
    /* JADX WARN: Code duplicated, block: B:254:0x0476  */
    /* JADX WARN: Code duplicated, block: B:255:0x0485  */
    /* JADX WARN: Code duplicated, block: B:257:0x048f  */
    /* JADX WARN: Code duplicated, block: B:258:0x049d  */
    /* JADX WARN: Code duplicated, block: B:260:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:261:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:263:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:264:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:266:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:273:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:274:0x04f9 A[PHI: r10
      0x04f9: PHI (r10v2 java.lang.Object) = (r10v1 java.lang.Object), (r10v17 java.lang.Object) binds: [B:277:0x04fe, B:272:0x04f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:275:0x04fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:277:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayBindTestFixture generatedBind(ArrayBindTestFixture arrayBindTestFixture, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, ? extends Object> accumulatedState) {
        Object objOverlayContentPathBindings;
        WithGeneratedBindings withGeneratedBindingsBind;
        String title;
        List<String> items;
        ArrayList arrayList;
        List list;
        WithGeneratedBindings withGeneratedBindings;
        WithGeneratedBindings withGeneratedBindingsBind2;
        Object objOverlayContentPathBindings2;
        WithGeneratedBindings withGeneratedBindingsBind3;
        String strResolveContentBindingKey;
        List<String> items2;
        List<Integer> optionalItems;
        ArrayList arrayList2;
        List list2;
        WithGeneratedBindings withGeneratedBindings2;
        WithGeneratedBindings withGeneratedBindingsBind4;
        Object obj;
        WithGeneratedBindings withGeneratedBindingsBind5;
        String strResolveContentBindingKey2;
        Object objOverlayContentPathBindings3;
        Object objResolveStateRef;
        Object objUnwrapForCoercion;
        Object objUnwrapForCoercion2;
        C22673i0 c22673i0;
        InterfaceC21461d orCreateKotlinClass;
        Object objResolveStateRef2;
        Object objUnwrapForCoercion3;
        List<String> list3;
        C22673i0 c22673i1;
        InterfaceC21461d orCreateKotlinClass2;
        List list4;
        AbstractC22676k.m65750j(arrayBindTestFixture, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if ((map == null || map.isEmpty()) && ((map2 == null || map2.isEmpty()) && accumulatedState.isEmpty())) {
            return arrayBindTestFixture;
        }
        Object title2 = arrayBindTestFixture.getTitle();
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
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            for (Object obj2 : iterable) {
                WithGeneratedBindings withGeneratedBindings3 = obj2 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj2 : null;
                if (withGeneratedBindings3 != null && (withGeneratedBindingsBind = withGeneratedBindings3.bind(accumulatedState)) != null) {
                    obj2 = withGeneratedBindingsBind;
                }
                arrayList3.add(obj2);
            }
            objOverlayContentPathBindings = (String) arrayList3;
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
            title = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "title", accumulatedState, objOverlayContentPathBindings, "title", new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$3
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
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$4
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
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$5
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
                title = arrayBindTestFixture.getTitle();
            }
            String str = title;
            items = arrayBindTestFixture.getItems();
            if (items == null) {
                objOverlayContentPathBindings2 = null;
            } else {
                if (items instanceof WithGeneratedBindings) {
                    withGeneratedBindingsBind3 = ((WithGeneratedBindings) items).bind(accumulatedState);
                    if (!(withGeneratedBindingsBind3 instanceof List)) {
                        withGeneratedBindingsBind3 = null;
                    }
                    list = (List) withGeneratedBindingsBind3;
                    if (list == null) {
                        list = items;
                    }
                } else {
                    List<String> list5 = items;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(list5, 10));
                    for (Object obj3 : list5) {
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
                    list = arrayList;
                }
                objOverlayContentPathBindings2 = list;
            }
            if (r1 != 0) {
                strResolveContentBindingKey = BindingLoggerKt.resolveContentBindingKey(map, "items");
            } else {
                strResolveContentBindingKey = null;
            }
            if (strResolveContentBindingKey != null) {
                objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
                if (objResolveStateRef2 != null) {
                    BindingLoggerKt.logContentBinding("items", strResolveContentBindingKey, objResolveStateRef2);
                    objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (!(objUnwrapForCoercion3 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion3) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                        objOverlayContentPathBindings2 = null;
                    } else {
                        objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                        if (objOverlayContentPathBindings2 == null) {
                            list3 = items;
                        } else {
                            if (objOverlayContentPathBindings2 instanceof JsonElement) {
                                JsonElement jsonElement2 = (JsonElement) objOverlayContentPathBindings2;
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), jsonElement2);
                                } catch (Exception unused3) {
                                    objOverlayContentPathBindings2 = null;
                                }
                            } else {
                                if (!(objOverlayContentPathBindings2 instanceof List)) {
                                    if (objOverlayContentPathBindings2 instanceof Number) {
                                        c22673i1 = AbstractC22671h0.f89337a;
                                        orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(List.class);
                                        list3 = items;
                                        if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                            list4 = (List) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                            list4 = (List) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                            list4 = (List) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls3))) {
                                            list4 = (List) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls2))) {
                                            list4 = (List) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                            list4 = (List) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                                        }
                                        objOverlayContentPathBindings2 = list4;
                                    } else {
                                        list3 = items;
                                        if (objOverlayContentPathBindings2 instanceof String) {
                                            JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                                            try {
                                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                                objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), jsonPrimitiveM1841c2);
                                            } catch (Exception unused4) {
                                                objOverlayContentPathBindings2 = null;
                                            }
                                            if (objOverlayContentPathBindings2 == null) {
                                            }
                                        }
                                    }
                                }
                                if (objOverlayContentPathBindings2 == null) {
                                    objOverlayContentPathBindings2 = list3;
                                }
                            }
                            list3 = items;
                            if (objOverlayContentPathBindings2 == null) {
                                objOverlayContentPathBindings2 = list3;
                            }
                        }
                        objOverlayContentPathBindings2 = null;
                        if (objOverlayContentPathBindings2 == null) {
                            objOverlayContentPathBindings2 = list3;
                        }
                    }
                }
            } else if (objOverlayContentPathBindings2 != null) {
                objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(r1, "items", accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$6
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                        return invoke((List<? extends String>) obj4);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(List<? extends String> v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            ArrayListSerializer arrayListSerializer = new ArrayListSerializer(StringSerializer.INSTANCE);
                            AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                            stateBindingJson.getClass();
                            return AbstractC12313p.m34290h0(stateBindingJson, v13, arrayListSerializer);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$7
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends java.lang.String>] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final List<? extends String> invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), json);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                });
            }
            items2 = (List) DotPathBindingsKt.overlayAggregateBinding(map2, "items", accumulatedState, objOverlayContentPathBindings2, "items", new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$8
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                    return invoke((List<? extends String>) obj4);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(List<? extends String> list6) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new ArrayListSerializer(StringSerializer.INSTANCE));
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, list6, interfaceC37138cM122336d);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$9
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends java.lang.String>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final List<? extends String> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), json);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$10
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<? extends java.lang.String>] */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List<? extends java.lang.String>] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List<? extends java.lang.String>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final List<? extends String> invoke(Object obj4) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj4);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement3 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), jsonElement3);
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
                        JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), jsonPrimitiveM1841c3);
                        } catch (Exception unused6) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i3 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(List.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (List) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Long.TYPE))) {
                        return (List) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Double.TYPE))) {
                        return (List) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Float.TYPE))) {
                        return (List) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Short.TYPE))) {
                        return (List) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (List) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            });
            if (items2 == null) {
                items2 = arrayBindTestFixture.getItems();
            }
            List<String> list6 = items2;
            optionalItems = arrayBindTestFixture.getOptionalItems();
            if (optionalItems == null) {
                obj = null;
            } else {
                if (optionalItems instanceof WithGeneratedBindings) {
                    withGeneratedBindingsBind5 = ((WithGeneratedBindings) optionalItems).bind(accumulatedState);
                    if (!(withGeneratedBindingsBind5 instanceof List)) {
                        withGeneratedBindingsBind5 = null;
                    }
                    list2 = (List) withGeneratedBindingsBind5;
                    if (list2 == null) {
                        list2 = optionalItems;
                    }
                } else {
                    List<Integer> list7 = optionalItems;
                    arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list7, 10));
                    for (Object obj4 : list7) {
                        if (obj4 instanceof WithGeneratedBindings) {
                            withGeneratedBindings2 = (WithGeneratedBindings) obj4;
                        } else {
                            withGeneratedBindings2 = null;
                        }
                        if (withGeneratedBindings2 == null && (withGeneratedBindingsBind4 = withGeneratedBindings2.bind(accumulatedState)) != null) {
                            obj4 = withGeneratedBindingsBind4;
                        }
                        arrayList2.add(obj4);
                    }
                    list2 = arrayList2;
                }
                obj = list2;
            }
            if (r1 != 0) {
                strResolveContentBindingKey2 = BindingLoggerKt.resolveContentBindingKey(r1, "optionalItems");
            } else {
                strResolveContentBindingKey2 = null;
            }
            if (strResolveContentBindingKey2 != null) {
                objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
                if (objResolveStateRef != null) {
                    BindingLoggerKt.logContentBinding("optionalItems", strResolveContentBindingKey2, objResolveStateRef);
                    objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (!(objUnwrapForCoercion instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                        obj = null;
                    } else {
                        objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                        if (objUnwrapForCoercion2 == null) {
                            objOverlayContentPathBindings3 = null;
                        } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                            JsonElement jsonElement3 = (JsonElement) objUnwrapForCoercion2;
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(IntSerializer.INSTANCE), jsonElement3);
                            } catch (Exception unused5) {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else if (objUnwrapForCoercion2 instanceof List) {
                            objOverlayContentPathBindings3 = objUnwrapForCoercion2;
                        } else {
                            if (objUnwrapForCoercion2 instanceof Number) {
                                c22673i0 = AbstractC22671h0.f89337a;
                                orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(List.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings3 = (List) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings3 = (List) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings3 = (List) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings3 = (List) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                    objOverlayContentPathBindings3 = (List) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
                                    objOverlayContentPathBindings3 = (List) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                                }
                            } else if (objUnwrapForCoercion2 instanceof String) {
                                JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(IntSerializer.INSTANCE), jsonPrimitiveM1841c3);
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
                            obj = optionalItems;
                        } else {
                            obj = objOverlayContentPathBindings3;
                        }
                    }
                }
            } else if (obj != null) {
                objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(r1, "optionalItems", accumulatedState, obj, new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$11
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                        return invoke((List<? extends Integer>) obj5);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(List<? extends Integer> v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            ArrayListSerializer arrayListSerializer = new ArrayListSerializer(IntSerializer.INSTANCE);
                            AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                            stateBindingJson.getClass();
                            return AbstractC12313p.m34290h0(stateBindingJson, v13, arrayListSerializer);
                        } catch (Exception unused7) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$12
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends java.lang.Integer>] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final List<? extends Integer> invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(IntSerializer.INSTANCE), json);
                        } catch (Exception unused7) {
                            return null;
                        }
                    }
                });
                obj = objOverlayContentPathBindings3;
            }
            return (ArrayBindTestFixture) ContentBindingResolverKt.copyBindingsFrom(new ArrayBindTestFixture(str, list6, (List) DotPathBindingsKt.overlayAggregateBinding(map2, "optionalItems", accumulatedState, obj, "optionalItems", new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$13
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                    return invoke((List<? extends Integer>) obj5);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(List<? extends Integer> list8) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new ArrayListSerializer(IntSerializer.INSTANCE));
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, list8, interfaceC37138cM122336d);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$14
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends java.lang.Integer>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final List<? extends Integer> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(IntSerializer.INSTANCE), json);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$15
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<? extends java.lang.Integer>] */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List<? extends java.lang.Integer>] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List<? extends java.lang.Integer>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final List<? extends Integer> invoke(Object obj5) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj5);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement4 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(IntSerializer.INSTANCE), jsonElement4);
                        } catch (Exception unused7) {
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
                        JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(IntSerializer.INSTANCE), jsonPrimitiveM1841c4);
                        } catch (Exception unused8) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i3 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(List.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (List) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Long.TYPE))) {
                        return (List) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Double.TYPE))) {
                        return (List) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Float.TYPE))) {
                        return (List) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Short.TYPE))) {
                        return (List) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (List) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            })), arrayBindTestFixture);
        }
        if (objOverlayContentPathBindings != null) {
            objOverlayContentPathBindings = ContentPathBindingsKt.overlayContentPathBindings(map, "title", accumulatedState, objOverlayContentPathBindings, new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$1
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                    return invoke((String) obj5);
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
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$2
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
        title = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "title", accumulatedState, objOverlayContentPathBindings, "title", new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$3
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                return invoke((String) obj5);
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
        }, new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$4
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
        }, new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$5
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj5) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj5);
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
            title = arrayBindTestFixture.getTitle();
        }
        String str2 = title;
        items = arrayBindTestFixture.getItems();
        if (items == null) {
            objOverlayContentPathBindings2 = null;
        } else {
            if (items instanceof WithGeneratedBindings) {
                withGeneratedBindingsBind3 = ((WithGeneratedBindings) items).bind(accumulatedState);
                if (!(withGeneratedBindingsBind3 instanceof List)) {
                    withGeneratedBindingsBind3 = null;
                }
                list = (List) withGeneratedBindingsBind3;
                if (list == null) {
                    list = items;
                }
            } else {
                List<String> list8 = items;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(list8, 10));
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
                list = arrayList;
            }
            objOverlayContentPathBindings2 = list;
        }
        if (r1 != 0) {
            strResolveContentBindingKey = BindingLoggerKt.resolveContentBindingKey(map, "items");
        } else {
            strResolveContentBindingKey = null;
        }
        if (strResolveContentBindingKey != null) {
            objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
            if (objResolveStateRef2 != null) {
                BindingLoggerKt.logContentBinding("items", strResolveContentBindingKey, objResolveStateRef2);
                objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                if (!(objUnwrapForCoercion3 instanceof String)) {
                    objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (objOverlayContentPathBindings2 == null) {
                        list3 = items;
                    } else {
                        if (objOverlayContentPathBindings2 instanceof JsonElement) {
                            JsonElement jsonElement4 = (JsonElement) objOverlayContentPathBindings2;
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), jsonElement4);
                        } else {
                            if (!(objOverlayContentPathBindings2 instanceof List)) {
                                if (objOverlayContentPathBindings2 instanceof Number) {
                                    c22673i1 = AbstractC22671h0.f89337a;
                                    orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(List.class);
                                    list3 = items;
                                    if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                        list4 = (List) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                        list4 = (List) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                        list4 = (List) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls3))) {
                                        list4 = (List) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls2))) {
                                        list4 = (List) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                        list4 = (List) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                                    }
                                    objOverlayContentPathBindings2 = list4;
                                } else {
                                    list3 = items;
                                    if (objOverlayContentPathBindings2 instanceof String) {
                                        JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), jsonPrimitiveM1841c4);
                                        if (objOverlayContentPathBindings2 == null) {
                                        }
                                    }
                                }
                            }
                            if (objOverlayContentPathBindings2 == null) {
                                objOverlayContentPathBindings2 = list3;
                            }
                        }
                        list3 = items;
                        if (objOverlayContentPathBindings2 == null) {
                            objOverlayContentPathBindings2 = list3;
                        }
                    }
                    objOverlayContentPathBindings2 = null;
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = list3;
                    }
                } else {
                    objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (objOverlayContentPathBindings2 == null) {
                        list3 = items;
                    } else {
                        if (objOverlayContentPathBindings2 instanceof JsonElement) {
                            JsonElement jsonElement5 = (JsonElement) objOverlayContentPathBindings2;
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), jsonElement5);
                        } else {
                            if (!(objOverlayContentPathBindings2 instanceof List)) {
                                if (objOverlayContentPathBindings2 instanceof Number) {
                                    c22673i1 = AbstractC22671h0.f89337a;
                                    orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(List.class);
                                    list3 = items;
                                    if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                        list4 = (List) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                        list4 = (List) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                        list4 = (List) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls3))) {
                                        list4 = (List) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls2))) {
                                        list4 = (List) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                                    } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                        list4 = (List) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                                    }
                                    objOverlayContentPathBindings2 = list4;
                                } else {
                                    list3 = items;
                                    if (objOverlayContentPathBindings2 instanceof String) {
                                        JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), jsonPrimitiveM1841c5);
                                        if (objOverlayContentPathBindings2 == null) {
                                        }
                                    }
                                }
                            }
                            if (objOverlayContentPathBindings2 == null) {
                                objOverlayContentPathBindings2 = list3;
                            }
                        }
                        list3 = items;
                        if (objOverlayContentPathBindings2 == null) {
                            objOverlayContentPathBindings2 = list3;
                        }
                    }
                    objOverlayContentPathBindings2 = null;
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = list3;
                    }
                }
            }
        } else if (objOverlayContentPathBindings2 != null) {
            objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(r1, "items", accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$6
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                    return invoke((List<? extends String>) obj5);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(List<? extends String> v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        ArrayListSerializer arrayListSerializer = new ArrayListSerializer(StringSerializer.INSTANCE);
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, v13, arrayListSerializer);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$7
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends java.lang.String>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final List<? extends String> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), json);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            });
        }
        items2 = (List) DotPathBindingsKt.overlayAggregateBinding(map2, "items", accumulatedState, objOverlayContentPathBindings2, "items", new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$8
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                return invoke((List<? extends String>) obj5);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(List<? extends String> list9) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new ArrayListSerializer(StringSerializer.INSTANCE));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, list9, interfaceC37138cM122336d);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$9
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends java.lang.String>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final List<? extends String> invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), json);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$10
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<? extends java.lang.String>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List<? extends java.lang.String>] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List<? extends java.lang.String>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final List<? extends String> invoke(Object obj5) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj5);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement6 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), jsonElement6);
                    } catch (Exception unused7) {
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
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(StringSerializer.INSTANCE), jsonPrimitiveM1841c6);
                    } catch (Exception unused8) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i3 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(List.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (List) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Long.TYPE))) {
                    return (List) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Double.TYPE))) {
                    return (List) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Float.TYPE))) {
                    return (List) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Short.TYPE))) {
                    return (List) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (List) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (items2 == null) {
            items2 = arrayBindTestFixture.getItems();
        }
        List<String> list9 = items2;
        optionalItems = arrayBindTestFixture.getOptionalItems();
        if (optionalItems == null) {
            obj = null;
        } else {
            if (optionalItems instanceof WithGeneratedBindings) {
                withGeneratedBindingsBind5 = ((WithGeneratedBindings) optionalItems).bind(accumulatedState);
                if (!(withGeneratedBindingsBind5 instanceof List)) {
                    withGeneratedBindingsBind5 = null;
                }
                list2 = (List) withGeneratedBindingsBind5;
                if (list2 == null) {
                    list2 = optionalItems;
                }
            } else {
                List<Integer> list10 = optionalItems;
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list10, 10));
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
                list2 = arrayList2;
            }
            obj = list2;
        }
        if (r1 != 0) {
            strResolveContentBindingKey2 = BindingLoggerKt.resolveContentBindingKey(r1, "optionalItems");
        } else {
            strResolveContentBindingKey2 = null;
        }
        if (strResolveContentBindingKey2 != null) {
            objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
            if (objResolveStateRef != null) {
                BindingLoggerKt.logContentBinding("optionalItems", strResolveContentBindingKey2, objResolveStateRef);
                objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                if (!(objUnwrapForCoercion instanceof String)) {
                    objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (objUnwrapForCoercion2 == null) {
                        objOverlayContentPathBindings3 = null;
                    } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                        JsonElement jsonElement6 = (JsonElement) objUnwrapForCoercion2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(IntSerializer.INSTANCE), jsonElement6);
                    } else if (objUnwrapForCoercion2 instanceof List) {
                        if (objUnwrapForCoercion2 instanceof Number) {
                            c22673i0 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(List.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings3 = (List) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings3 = (List) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings3 = (List) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings3 = (List) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings3 = (List) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings3 = (List) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                            }
                        } else if (objUnwrapForCoercion2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(IntSerializer.INSTANCE), jsonPrimitiveM1841c6);
                            if (objUnwrapForCoercion2 != null) {
                                objOverlayContentPathBindings3 = objUnwrapForCoercion2;
                            }
                        }
                        objOverlayContentPathBindings3 = null;
                    } else {
                        objOverlayContentPathBindings3 = objUnwrapForCoercion2;
                    }
                    if (objOverlayContentPathBindings3 == null) {
                        obj = optionalItems;
                    } else {
                        obj = objOverlayContentPathBindings3;
                    }
                } else {
                    objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (objUnwrapForCoercion2 == null) {
                        objOverlayContentPathBindings3 = null;
                    } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                        JsonElement jsonElement7 = (JsonElement) objUnwrapForCoercion2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(IntSerializer.INSTANCE), jsonElement7);
                    } else if (objUnwrapForCoercion2 instanceof List) {
                        if (objUnwrapForCoercion2 instanceof Number) {
                            c22673i0 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(List.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings3 = (List) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings3 = (List) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings3 = (List) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings3 = (List) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings3 = (List) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings3 = (List) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                            }
                        } else if (objUnwrapForCoercion2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c7 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(IntSerializer.INSTANCE), jsonPrimitiveM1841c7);
                            if (objUnwrapForCoercion2 != null) {
                                objOverlayContentPathBindings3 = objUnwrapForCoercion2;
                            }
                        }
                        objOverlayContentPathBindings3 = null;
                    } else {
                        objOverlayContentPathBindings3 = objUnwrapForCoercion2;
                    }
                    if (objOverlayContentPathBindings3 == null) {
                        obj = optionalItems;
                    } else {
                        obj = objOverlayContentPathBindings3;
                    }
                }
            }
        } else if (obj != null) {
            objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(r1, "optionalItems", accumulatedState, obj, new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$11
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                    return invoke((List<? extends Integer>) obj5);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(List<? extends Integer> v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        ArrayListSerializer arrayListSerializer = new ArrayListSerializer(IntSerializer.INSTANCE);
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, v13, arrayListSerializer);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$12
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends java.lang.Integer>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final List<? extends Integer> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(IntSerializer.INSTANCE), json);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            });
            obj = objOverlayContentPathBindings3;
        }
        return (ArrayBindTestFixture) ContentBindingResolverKt.copyBindingsFrom(new ArrayBindTestFixture(str2, list9, (List) DotPathBindingsKt.overlayAggregateBinding(map2, "optionalItems", accumulatedState, obj, "optionalItems", new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$13
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                return invoke((List<? extends Integer>) obj5);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(List<? extends Integer> list11) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new ArrayListSerializer(IntSerializer.INSTANCE));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, list11, interfaceC37138cM122336d);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$14
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends java.lang.Integer>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final List<? extends Integer> invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(IntSerializer.INSTANCE), json);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.test.fixtures.ArrayBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$15
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<? extends java.lang.Integer>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List<? extends java.lang.Integer>] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List<? extends java.lang.Integer>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final List<? extends Integer> invoke(Object obj5) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj5);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement8 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(IntSerializer.INSTANCE), jsonElement8);
                    } catch (Exception unused7) {
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
                    JsonPrimitive jsonPrimitiveM1841c8 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(IntSerializer.INSTANCE), jsonPrimitiveM1841c8);
                    } catch (Exception unused8) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i3 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(List.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (List) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Long.TYPE))) {
                    return (List) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Double.TYPE))) {
                    return (List) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Float.TYPE))) {
                    return (List) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Short.TYPE))) {
                    return (List) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (List) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        })), arrayBindTestFixture);
    }

    public static /* synthetic */ ArrayBindTestFixture generatedBind$default(ArrayBindTestFixture arrayBindTestFixture, Map map, Map map2, Map map3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map2 = null;
        }
        return generatedBind(arrayBindTestFixture, map, map2, map3);
    }
}
