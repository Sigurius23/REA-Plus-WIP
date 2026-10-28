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
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003¨\u0006\t"}, m65681d2 = {"generatedBind", "Lcom/whoop/design/models/items/MultiWheelPickerModel;", "contentBinding", "", "", "aggregateBindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "accumulatedState", "", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class MultiWheelPickerModelStateBindingKt {
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
    /* JADX WARN: Code duplicated, block: B:133:0x0230  */
    /* JADX WARN: Code duplicated, block: B:135:0x0236  */
    /* JADX WARN: Code duplicated, block: B:142:0x0258  */
    /* JADX WARN: Code duplicated, block: B:144:0x025e  */
    /* JADX WARN: Code duplicated, block: B:145:0x0261  */
    /* JADX WARN: Code duplicated, block: B:147:0x0265  */
    /* JADX WARN: Code duplicated, block: B:150:0x0283  */
    /* JADX WARN: Code duplicated, block: B:152:0x0287 A[PHI: r0
      0x0287: PHI (r0v28 java.lang.Object) = (r0v6 java.lang.Object), (r0v10 java.lang.Object) binds: [B:151:0x0285, B:179:0x034f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:153:0x028a  */
    /* JADX WARN: Code duplicated, block: B:155:0x028e  */
    /* JADX WARN: Code duplicated, block: B:157:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:158:0x02af  */
    /* JADX WARN: Code duplicated, block: B:160:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:161:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:163:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:166:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:167:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:169:0x0303  */
    /* JADX WARN: Code duplicated, block: B:170:0x0311  */
    /* JADX WARN: Code duplicated, block: B:172:0x031b  */
    /* JADX WARN: Code duplicated, block: B:173:0x0329  */
    /* JADX WARN: Code duplicated, block: B:175:0x032d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0355  */
    /* JADX WARN: Code duplicated, block: B:183:0x0357 A[PHI: r10
      0x0357: PHI (r10v2 java.lang.Object) = (r10v1 java.lang.Object), (r10v17 java.lang.Object) binds: [B:186:0x035c, B:181:0x0353] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:184:0x0359 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x035c  */
    /* JADX WARN: Code duplicated, block: B:189:0x037a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final MultiWheelPickerModel generatedBind(MultiWheelPickerModel multiWheelPickerModel, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, ? extends Object> accumulatedState) {
        Object objOverlayContentPathBindings;
        WithGeneratedBindings withGeneratedBindingsBind;
        String id4;
        List<MultiWheelPickerWheel> wheels;
        ArrayList arrayList;
        List list;
        WithGeneratedBindings withGeneratedBindings;
        WithGeneratedBindings withGeneratedBindingsBind2;
        Object obj;
        WithGeneratedBindings withGeneratedBindingsBind3;
        String strResolveContentBindingKey;
        Object objOverlayContentPathBindings2;
        List<MultiWheelPickerWheel> wheels2;
        Object objResolveStateRef;
        Object objUnwrapForCoercion;
        Object objUnwrapForCoercion2;
        C22673i0 c22673i0;
        InterfaceC21461d orCreateKotlinClass;
        AbstractC22676k.m65750j(multiWheelPickerModel, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if ((map == null || map.isEmpty()) && ((map2 == null || map2.isEmpty()) && accumulatedState.isEmpty())) {
            return multiWheelPickerModel;
        }
        Object id5 = multiWheelPickerModel.getId();
        if (id5 == null) {
            objOverlayContentPathBindings = null;
        } else if (id5 instanceof WithGeneratedBindings) {
            Object objBind = ((WithGeneratedBindings) id5).bind(accumulatedState);
            if (!(objBind instanceof String)) {
                objBind = null;
            }
            objOverlayContentPathBindings = (String) objBind;
            if (objOverlayContentPathBindings == null) {
                objOverlayContentPathBindings = id5;
            }
        } else if (id5 instanceof List) {
            Iterable iterable = (Iterable) id5;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            for (Object obj2 : iterable) {
                WithGeneratedBindings withGeneratedBindings2 = obj2 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj2 : null;
                if (withGeneratedBindings2 != null && (withGeneratedBindingsBind = withGeneratedBindings2.bind(accumulatedState)) != null) {
                    obj2 = withGeneratedBindingsBind;
                }
                arrayList2.add(obj2);
            }
            objOverlayContentPathBindings = (String) arrayList2;
        } else {
            objOverlayContentPathBindings = id5;
        }
        String strResolveContentBindingKey2 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "id") : null;
        Class cls = Byte.TYPE;
        Class cls2 = Short.TYPE;
        Class cls3 = Float.TYPE;
        Class cls4 = Double.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        if (strResolveContentBindingKey2 != null) {
            Object objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
            if (objResolveStateRef2 != null) {
                BindingLoggerKt.logContentBinding("id", strResolveContentBindingKey2, objResolveStateRef2);
                Object objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                if ((objUnwrapForCoercion3 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion3) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                    objOverlayContentPathBindings = null;
                } else {
                    objOverlayContentPathBindings = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
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
                                C22673i0 c22673i1 = AbstractC22671h0.f89337a;
                                InterfaceC21461d orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(String.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings = (String) Integer.valueOf(((Number) objOverlayContentPathBindings).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings = (String) Long.valueOf(((Number) objOverlayContentPathBindings).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings = (String) Double.valueOf(((Number) objOverlayContentPathBindings).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings = (String) Float.valueOf(((Number) objOverlayContentPathBindings).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls2))) {
                                    objOverlayContentPathBindings = (String) Short.valueOf(((Number) objOverlayContentPathBindings).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
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
                        objOverlayContentPathBindings = id5;
                    }
                }
            }
            id4 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "id", accumulatedState, objOverlayContentPathBindings, "id", new Function1() { // from class: com.whoop.design.models.items.MultiWheelPickerModelStateBindingKt$generatedBind$$inlined$resolveBinding$3
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
            }, new Function1() { // from class: com.whoop.design.models.items.MultiWheelPickerModelStateBindingKt$generatedBind$$inlined$resolveBinding$4
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
            }, new Function1() { // from class: com.whoop.design.models.items.MultiWheelPickerModelStateBindingKt$generatedBind$$inlined$resolveBinding$5
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
                    C22673i0 c22673i2 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(String.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (String) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Long.TYPE))) {
                        return (String) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Double.TYPE))) {
                        return (String) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Float.TYPE))) {
                        return (String) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Short.TYPE))) {
                        return (String) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (String) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            });
            if (id4 == null) {
                id4 = multiWheelPickerModel.getId();
            }
            String str = id4;
            wheels = multiWheelPickerModel.getWheels();
            if (wheels == null) {
                obj = null;
            } else {
                if (wheels instanceof WithGeneratedBindings) {
                    withGeneratedBindingsBind3 = ((WithGeneratedBindings) wheels).bind(accumulatedState);
                    if (!(withGeneratedBindingsBind3 instanceof List)) {
                        withGeneratedBindingsBind3 = null;
                    }
                    list = (List) withGeneratedBindingsBind3;
                    if (list == null) {
                        list = wheels;
                    }
                } else {
                    List<MultiWheelPickerWheel> list2 = wheels;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                    for (Object obj3 : list2) {
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
                obj = list;
            }
            if (r1 != 0) {
                strResolveContentBindingKey = BindingLoggerKt.resolveContentBindingKey(map, "wheels");
            } else {
                strResolveContentBindingKey = null;
            }
            if (strResolveContentBindingKey != null) {
                objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
                if (objResolveStateRef != null) {
                    BindingLoggerKt.logContentBinding("wheels", strResolveContentBindingKey, objResolveStateRef);
                    objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (!(objUnwrapForCoercion instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                        obj = null;
                    } else {
                        objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                        if (objUnwrapForCoercion2 == null) {
                            objOverlayContentPathBindings2 = null;
                        } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                            JsonElement jsonElement2 = (JsonElement) objUnwrapForCoercion2;
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(MultiWheelPickerWheel.INSTANCE.serializer()), jsonElement2);
                            } catch (Exception unused3) {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (objUnwrapForCoercion2 instanceof List) {
                            objOverlayContentPathBindings2 = objUnwrapForCoercion2;
                        } else {
                            if (objUnwrapForCoercion2 instanceof Number) {
                                c22673i0 = AbstractC22671h0.f89337a;
                                orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(List.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                    objOverlayContentPathBindings2 = (List) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                    objOverlayContentPathBindings2 = (List) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                    objOverlayContentPathBindings2 = (List) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                                    objOverlayContentPathBindings2 = (List) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                    objOverlayContentPathBindings2 = (List) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
                                    objOverlayContentPathBindings2 = (List) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                                }
                            } else if (objUnwrapForCoercion2 instanceof String) {
                                JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(MultiWheelPickerWheel.INSTANCE.serializer()), jsonPrimitiveM1841c2);
                                } catch (Exception unused4) {
                                    objUnwrapForCoercion2 = null;
                                }
                                if (objUnwrapForCoercion2 != null) {
                                    objOverlayContentPathBindings2 = objUnwrapForCoercion2;
                                }
                            }
                            objOverlayContentPathBindings2 = null;
                        }
                        if (objOverlayContentPathBindings2 == null) {
                            obj = wheels;
                        } else {
                            obj = objOverlayContentPathBindings2;
                        }
                    }
                }
            } else if (obj != null) {
                objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(r1, "wheels", accumulatedState, obj, new Function1() { // from class: com.whoop.design.models.items.MultiWheelPickerModelStateBindingKt$generatedBind$$inlined$resolveBinding$6
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                        return invoke((List<? extends MultiWheelPickerWheel>) obj4);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(List<? extends MultiWheelPickerWheel> v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            ArrayListSerializer arrayListSerializer = new ArrayListSerializer(MultiWheelPickerWheel.INSTANCE.serializer());
                            AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                            stateBindingJson.getClass();
                            return AbstractC12313p.m34290h0(stateBindingJson, v13, arrayListSerializer);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.MultiWheelPickerModelStateBindingKt$generatedBind$$inlined$resolveBinding$7
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.items.MultiWheelPickerWheel>] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final List<? extends MultiWheelPickerWheel> invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(MultiWheelPickerWheel.INSTANCE.serializer()), json);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                });
                obj = objOverlayContentPathBindings2;
            }
            wheels2 = (List) DotPathBindingsKt.overlayAggregateBinding(map2, "wheels", accumulatedState, obj, "wheels", new Function1() { // from class: com.whoop.design.models.items.MultiWheelPickerModelStateBindingKt$generatedBind$$inlined$resolveBinding$8
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                    return invoke((List<? extends MultiWheelPickerWheel>) obj4);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(List<? extends MultiWheelPickerWheel> list3) {
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new ArrayListSerializer(MultiWheelPickerWheel.INSTANCE.serializer()));
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, list3, interfaceC37138cM122336d);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.MultiWheelPickerModelStateBindingKt$generatedBind$$inlined$resolveBinding$9
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.items.MultiWheelPickerWheel>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final List<? extends MultiWheelPickerWheel> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(MultiWheelPickerWheel.INSTANCE.serializer()), json);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.MultiWheelPickerModelStateBindingKt$generatedBind$$inlined$resolveBinding$10
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<? extends com.whoop.design.models.items.MultiWheelPickerWheel>] */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.items.MultiWheelPickerWheel>] */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.items.MultiWheelPickerWheel>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final List<? extends MultiWheelPickerWheel> invoke(Object obj4) {
                    Object objM1830a;
                    ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj4);
                    if (UnwrapForCoercion == 0) {
                        return null;
                    }
                    if (UnwrapForCoercion instanceof JsonElement) {
                        JsonElement jsonElement3 = (JsonElement) UnwrapForCoercion;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(MultiWheelPickerWheel.INSTANCE.serializer()), jsonElement3);
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
                            objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(MultiWheelPickerWheel.INSTANCE.serializer()), jsonPrimitiveM1841c3);
                        } catch (Exception unused6) {
                            objM1830a = null;
                        }
                        if (objM1830a != null) {
                            return objM1830a;
                        }
                        return null;
                    }
                    C22673i0 c22673i2 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(List.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (List) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Long.TYPE))) {
                        return (List) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Double.TYPE))) {
                        return (List) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Float.TYPE))) {
                        return (List) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Short.TYPE))) {
                        return (List) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (List) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
            });
            if (wheels2 == null) {
                wheels2 = multiWheelPickerModel.getWheels();
            }
            return (MultiWheelPickerModel) ContentBindingResolverKt.copyBindingsFrom(new MultiWheelPickerModel(str, wheels2), multiWheelPickerModel);
        }
        if (objOverlayContentPathBindings != null) {
            objOverlayContentPathBindings = ContentPathBindingsKt.overlayContentPathBindings(map, "id", accumulatedState, objOverlayContentPathBindings, new Function1() { // from class: com.whoop.design.models.items.MultiWheelPickerModelStateBindingKt$generatedBind$$inlined$resolveBinding$1
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                    return invoke((String) obj4);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(String v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(StringSerializer.INSTANCE, v13);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.MultiWheelPickerModelStateBindingKt$generatedBind$$inlined$resolveBinding$2
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
                @Override // p715kotlin.jvm.functions.Function1
                public final String invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            });
        }
        id4 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "id", accumulatedState, objOverlayContentPathBindings, "id", new Function1() { // from class: com.whoop.design.models.items.MultiWheelPickerModelStateBindingKt$generatedBind$$inlined$resolveBinding$3
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                return invoke((String) obj4);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str2) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str2, interfaceC37138cM122336d);
                } catch (Exception unused5) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.MultiWheelPickerModelStateBindingKt$generatedBind$$inlined$resolveBinding$4
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                } catch (Exception unused5) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.MultiWheelPickerModelStateBindingKt$generatedBind$$inlined$resolveBinding$5
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj4) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj4);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement3 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement3);
                    } catch (Exception unused5) {
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
                    JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c3);
                    } catch (Exception unused6) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i2 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(String.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (String) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Long.TYPE))) {
                    return (String) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Double.TYPE))) {
                    return (String) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Float.TYPE))) {
                    return (String) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Short.TYPE))) {
                    return (String) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (String) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (id4 == null) {
            id4 = multiWheelPickerModel.getId();
        }
        String str2 = id4;
        wheels = multiWheelPickerModel.getWheels();
        if (wheels == null) {
            obj = null;
        } else {
            if (wheels instanceof WithGeneratedBindings) {
                withGeneratedBindingsBind3 = ((WithGeneratedBindings) wheels).bind(accumulatedState);
                if (!(withGeneratedBindingsBind3 instanceof List)) {
                    withGeneratedBindingsBind3 = null;
                }
                list = (List) withGeneratedBindingsBind3;
                if (list == null) {
                    list = wheels;
                }
            } else {
                List<MultiWheelPickerWheel> list3 = wheels;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
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
            obj = list;
        }
        if (r1 != 0) {
            strResolveContentBindingKey = BindingLoggerKt.resolveContentBindingKey(map, "wheels");
        } else {
            strResolveContentBindingKey = null;
        }
        if (strResolveContentBindingKey != null) {
            objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
            if (objResolveStateRef != null) {
                BindingLoggerKt.logContentBinding("wheels", strResolveContentBindingKey, objResolveStateRef);
                objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                if (!(objUnwrapForCoercion instanceof String)) {
                    objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (objUnwrapForCoercion2 == null) {
                        objOverlayContentPathBindings2 = null;
                    } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                        JsonElement jsonElement3 = (JsonElement) objUnwrapForCoercion2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(MultiWheelPickerWheel.INSTANCE.serializer()), jsonElement3);
                    } else if (objUnwrapForCoercion2 instanceof List) {
                        if (objUnwrapForCoercion2 instanceof Number) {
                            c22673i0 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(List.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings2 = (List) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings2 = (List) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings2 = (List) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings2 = (List) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings2 = (List) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings2 = (List) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                            }
                        } else if (objUnwrapForCoercion2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(MultiWheelPickerWheel.INSTANCE.serializer()), jsonPrimitiveM1841c3);
                            if (objUnwrapForCoercion2 != null) {
                                objOverlayContentPathBindings2 = objUnwrapForCoercion2;
                            }
                        }
                        objOverlayContentPathBindings2 = null;
                    } else {
                        objOverlayContentPathBindings2 = objUnwrapForCoercion2;
                    }
                    if (objOverlayContentPathBindings2 == null) {
                        obj = wheels;
                    } else {
                        obj = objOverlayContentPathBindings2;
                    }
                } else {
                    objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (objUnwrapForCoercion2 == null) {
                        objOverlayContentPathBindings2 = null;
                    } else if (objUnwrapForCoercion2 instanceof JsonElement) {
                        JsonElement jsonElement4 = (JsonElement) objUnwrapForCoercion2;
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(MultiWheelPickerWheel.INSTANCE.serializer()), jsonElement4);
                    } else if (objUnwrapForCoercion2 instanceof List) {
                        if (objUnwrapForCoercion2 instanceof Number) {
                            c22673i0 = AbstractC22671h0.f89337a;
                            orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(List.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings2 = (List) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings2 = (List) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings2 = (List) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings2 = (List) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings2 = (List) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings2 = (List) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                            }
                        } else if (objUnwrapForCoercion2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) objUnwrapForCoercion2);
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(MultiWheelPickerWheel.INSTANCE.serializer()), jsonPrimitiveM1841c4);
                            if (objUnwrapForCoercion2 != null) {
                                objOverlayContentPathBindings2 = objUnwrapForCoercion2;
                            }
                        }
                        objOverlayContentPathBindings2 = null;
                    } else {
                        objOverlayContentPathBindings2 = objUnwrapForCoercion2;
                    }
                    if (objOverlayContentPathBindings2 == null) {
                        obj = wheels;
                    } else {
                        obj = objOverlayContentPathBindings2;
                    }
                }
            }
        } else if (obj != null) {
            objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(r1, "wheels", accumulatedState, obj, new Function1() { // from class: com.whoop.design.models.items.MultiWheelPickerModelStateBindingKt$generatedBind$$inlined$resolveBinding$6
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                    return invoke((List<? extends MultiWheelPickerWheel>) obj4);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(List<? extends MultiWheelPickerWheel> v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        ArrayListSerializer arrayListSerializer = new ArrayListSerializer(MultiWheelPickerWheel.INSTANCE.serializer());
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, v13, arrayListSerializer);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.MultiWheelPickerModelStateBindingKt$generatedBind$$inlined$resolveBinding$7
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.items.MultiWheelPickerWheel>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final List<? extends MultiWheelPickerWheel> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(MultiWheelPickerWheel.INSTANCE.serializer()), json);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            });
            obj = objOverlayContentPathBindings2;
        }
        wheels2 = (List) DotPathBindingsKt.overlayAggregateBinding(map2, "wheels", accumulatedState, obj, "wheels", new Function1() { // from class: com.whoop.design.models.items.MultiWheelPickerModelStateBindingKt$generatedBind$$inlined$resolveBinding$8
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                return invoke((List<? extends MultiWheelPickerWheel>) obj4);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(List<? extends MultiWheelPickerWheel> list4) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new ArrayListSerializer(MultiWheelPickerWheel.INSTANCE.serializer()));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, list4, interfaceC37138cM122336d);
                } catch (Exception unused5) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.MultiWheelPickerModelStateBindingKt$generatedBind$$inlined$resolveBinding$9
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.items.MultiWheelPickerWheel>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final List<? extends MultiWheelPickerWheel> invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(MultiWheelPickerWheel.INSTANCE.serializer()), json);
                } catch (Exception unused5) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.MultiWheelPickerModelStateBindingKt$generatedBind$$inlined$resolveBinding$10
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<? extends com.whoop.design.models.items.MultiWheelPickerWheel>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.items.MultiWheelPickerWheel>] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.items.MultiWheelPickerWheel>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final List<? extends MultiWheelPickerWheel> invoke(Object obj4) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj4);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement5 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(MultiWheelPickerWheel.INSTANCE.serializer()), jsonElement5);
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
                    JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(MultiWheelPickerWheel.INSTANCE.serializer()), jsonPrimitiveM1841c5);
                    } catch (Exception unused6) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i2 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(List.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (List) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Long.TYPE))) {
                    return (List) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Double.TYPE))) {
                    return (List) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Float.TYPE))) {
                    return (List) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Short.TYPE))) {
                    return (List) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (List) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (wheels2 == null) {
            wheels2 = multiWheelPickerModel.getWheels();
        }
        return (MultiWheelPickerModel) ContentBindingResolverKt.copyBindingsFrom(new MultiWheelPickerModel(str2, wheels2), multiWheelPickerModel);
    }

    public static /* synthetic */ MultiWheelPickerModel generatedBind$default(MultiWheelPickerModel multiWheelPickerModel, Map map, Map map2, Map map3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map2 = null;
        }
        return generatedBind(multiWheelPickerModel, map, map2, map3);
    }
}
