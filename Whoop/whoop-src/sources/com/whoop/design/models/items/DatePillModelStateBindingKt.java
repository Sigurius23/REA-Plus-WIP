package com.whoop.design.models.items;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import androidx.core.app.NotificationCompat;
import com.mapbox.common.HttpHeaders;
import com.whoop.design.models.DateDisplay;
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
import com.whoop.navigation.models.GenericInteraction;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumSerializer;
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
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003¨\u0006\t"}, m65681d2 = {"generatedBind", "Lcom/whoop/design/models/items/DatePillModel;", "contentBinding", "", "", "aggregateBindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "accumulatedState", "", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DatePillModelStateBindingKt {
    /* JADX WARN: Code duplicated, block: B:128:0x0222  */
    /* JADX WARN: Code duplicated, block: B:147:0x0262  */
    /* JADX WARN: Code duplicated, block: B:216:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:234:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:303:0x0555  */
    /* JADX WARN: Code duplicated, block: B:320:0x0590  */
    /* JADX WARN: Code duplicated, block: B:391:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:409:0x0725  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:480:0x088b  */
    /* JADX WARN: Code duplicated, block: B:498:0x08c7  */
    /* JADX WARN: Code duplicated, block: B:566:0x0a27  */
    /* JADX WARN: Code duplicated, block: B:584:0x0a63  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:652:0x0bbf  */
    /* JADX WARN: Code duplicated, block: B:671:0x0bfd  */
    /* JADX WARN: Code duplicated, block: B:739:0x0d55  */
    /* JADX WARN: Code duplicated, block: B:765:0x0dbc A[PHI: r4
      0x0dbc: PHI (r4v89 java.lang.Object) = (r4v65 java.lang.Object), (r4v69 java.lang.Object) binds: [B:764:0x0dba, B:792:0x0e82] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final DatePillModel generatedBind(DatePillModel datePillModel, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, ? extends Object> accumulatedState) {
        Object objOverlayContentPathBindings;
        WithGeneratedBindings withGeneratedBindingsBind;
        Object obj;
        WithGeneratedBindings withGeneratedBindingsBind2;
        Object objOverlayContentPathBindings2;
        Object obj2;
        Object obj3;
        WithGeneratedBindings withGeneratedBindingsBind3;
        Object objOverlayContentPathBindings3;
        Boolean bool;
        WithGeneratedBindings withGeneratedBindingsBind4;
        Object objOverlayContentPathBindings4;
        Object obj4;
        WithGeneratedBindings withGeneratedBindingsBind5;
        Object objOverlayContentPathBindings5;
        Object obj5;
        WithGeneratedBindings withGeneratedBindingsBind6;
        Object objOverlayContentPathBindings6;
        Object obj6;
        WithGeneratedBindings withGeneratedBindingsBind7;
        Object objOverlayContentPathBindings7;
        Map<String, String> map3;
        WithGeneratedBindings withGeneratedBindingsBind8;
        Object objOverlayContentPathBindings8;
        Map<String, AggregateBinding> map4;
        WithGeneratedBindings withGeneratedBindingsBind9;
        Object obj7;
        Object objOverlayContentPathBindings9;
        AbstractC22676k.m65750j(datePillModel, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if ((map == null || map.isEmpty()) && ((map2 == null || map2.isEmpty()) && accumulatedState.isEmpty())) {
            return datePillModel;
        }
        Object id4 = datePillModel.getId();
        if (id4 == null) {
            objOverlayContentPathBindings = null;
        } else if (id4 instanceof WithGeneratedBindings) {
            Object objBind = ((WithGeneratedBindings) id4).bind(accumulatedState);
            if (!(objBind instanceof String)) {
                objBind = null;
            }
            objOverlayContentPathBindings = (String) objBind;
            if (objOverlayContentPathBindings == null) {
                objOverlayContentPathBindings = id4;
            }
        } else if (id4 instanceof List) {
            Iterable iterable = (Iterable) id4;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            for (Object obj8 : iterable) {
                WithGeneratedBindings withGeneratedBindings = obj8 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj8 : null;
                if (withGeneratedBindings != null && (withGeneratedBindingsBind = withGeneratedBindings.bind(accumulatedState)) != null) {
                    obj8 = withGeneratedBindingsBind;
                }
                arrayList.add(obj8);
            }
            objOverlayContentPathBindings = (String) arrayList;
        } else {
            objOverlayContentPathBindings = id4;
        }
        String strResolveContentBindingKey = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "id") : null;
        Class cls = Byte.TYPE;
        Class cls2 = Short.TYPE;
        Class cls3 = Float.TYPE;
        Class cls4 = Double.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        if (strResolveContentBindingKey != null) {
            Object objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
            if (objResolveStateRef != null) {
                BindingLoggerKt.logContentBinding("id", strResolveContentBindingKey, objResolveStateRef);
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
                            objOverlayContentPathBindings = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement);
                        } catch (Exception unused) {
                            objOverlayContentPathBindings = null;
                        }
                    } else {
                        boolean z4 = objOverlayContentPathBindings instanceof String;
                        if (!z4) {
                            if (objOverlayContentPathBindings instanceof Number) {
                                InterfaceC21461d interfaceC21461dM65688a = AbstractC22671h0.m65688a(String.class);
                                if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls6))) {
                                    objOverlayContentPathBindings = (String) Integer.valueOf(((Number) objOverlayContentPathBindings).intValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls5))) {
                                    objOverlayContentPathBindings = (String) Long.valueOf(((Number) objOverlayContentPathBindings).longValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls4))) {
                                    objOverlayContentPathBindings = (String) Double.valueOf(((Number) objOverlayContentPathBindings).doubleValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls3))) {
                                    objOverlayContentPathBindings = (String) Float.valueOf(((Number) objOverlayContentPathBindings).floatValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls2))) {
                                    objOverlayContentPathBindings = (String) Short.valueOf(((Number) objOverlayContentPathBindings).shortValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a, AbstractC22671h0.m65688a(cls))) {
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
                        objOverlayContentPathBindings = id4;
                    }
                }
            }
        } else if (objOverlayContentPathBindings != null) {
            objOverlayContentPathBindings = ContentPathBindingsKt.overlayContentPathBindings(map, "id", accumulatedState, objOverlayContentPathBindings, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$1
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj9) {
                    return invoke((String) obj9);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(String v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(StringSerializer.INSTANCE, v13);
                    } catch (Exception unused3) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$2
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
            });
        }
        String id5 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "id", accumulatedState, objOverlayContentPathBindings, "id", new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$3
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj9) {
                return invoke((String) obj9);
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
        }, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$4
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
        }, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$5
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj9) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj9);
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
        if (id5 == null) {
            id5 = datePillModel.getId();
        }
        String str = id5;
        Object date = datePillModel.getDate();
        if (date == null) {
            objOverlayContentPathBindings2 = null;
        } else {
            if (date instanceof WithGeneratedBindings) {
                Object objBind2 = ((WithGeneratedBindings) date).bind(accumulatedState);
                if (!(objBind2 instanceof String)) {
                    objBind2 = null;
                }
                obj = (String) objBind2;
                if (obj == null) {
                    obj = date;
                }
            } else if (date instanceof List) {
                Iterable iterable2 = (Iterable) date;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
                for (Object obj9 : iterable2) {
                    WithGeneratedBindings withGeneratedBindings2 = obj9 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj9 : null;
                    if (withGeneratedBindings2 != null && (withGeneratedBindingsBind2 = withGeneratedBindings2.bind(accumulatedState)) != null) {
                        obj9 = withGeneratedBindingsBind2;
                    }
                    arrayList2.add(obj9);
                }
                obj = (String) arrayList2;
            } else {
                obj = date;
            }
            objOverlayContentPathBindings2 = obj;
        }
        String strResolveContentBindingKey2 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, HttpHeaders.DATE) : null;
        if (strResolveContentBindingKey2 != null) {
            Object objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
            if (objResolveStateRef2 != null) {
                BindingLoggerKt.logContentBinding(HttpHeaders.DATE, strResolveContentBindingKey2, objResolveStateRef2);
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
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement2);
                    } catch (Exception unused3) {
                        objOverlayContentPathBindings2 = null;
                    }
                } else {
                    boolean z13 = objOverlayContentPathBindings2 instanceof String;
                    if (!z13) {
                        if (objOverlayContentPathBindings2 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a2 = AbstractC22671h0.m65688a(String.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings2 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings2 = (String) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings2 = (String) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings2 = (String) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings2 = (String) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings2 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                            } else {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (z13) {
                            JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c2);
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
                }
                if (objOverlayContentPathBindings2 == null) {
                    objOverlayContentPathBindings2 = date;
                }
            } else {
                obj2 = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
            }
        } else {
            obj2 = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
            if (objOverlayContentPathBindings2 != null) {
                objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(map, HttpHeaders.DATE, accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$6
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
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$7
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
        }
        Object obj10 = obj2;
        String str2 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, HttpHeaders.DATE, accumulatedState, objOverlayContentPathBindings2, HttpHeaders.DATE, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$8
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
                } catch (Exception unused5) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$9
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
        }, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$10
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
                    JsonElement jsonElement3 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement3);
                    } catch (Exception unused5) {
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
        Object display = datePillModel.getDisplay();
        if (display == null) {
            objOverlayContentPathBindings3 = null;
        } else {
            if (display instanceof WithGeneratedBindings) {
                Object objBind3 = ((WithGeneratedBindings) display).bind(accumulatedState);
                if (!(objBind3 instanceof DateDisplay)) {
                    objBind3 = null;
                }
                obj3 = (DateDisplay) objBind3;
                if (obj3 == null) {
                    obj3 = display;
                }
            } else if (display instanceof List) {
                Iterable iterable3 = (Iterable) display;
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable3, 10));
                for (Object obj11 : iterable3) {
                    WithGeneratedBindings withGeneratedBindings3 = obj11 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj11 : null;
                    if (withGeneratedBindings3 != null && (withGeneratedBindingsBind3 = withGeneratedBindings3.bind(accumulatedState)) != null) {
                        obj11 = withGeneratedBindingsBind3;
                    }
                    arrayList3.add(obj11);
                }
                obj3 = (DateDisplay) arrayList3;
            } else {
                obj3 = display;
            }
            objOverlayContentPathBindings3 = obj3;
        }
        String strResolveContentBindingKey3 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "display") : null;
        if (strResolveContentBindingKey3 != null) {
            Object objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
            if (objResolveStateRef3 != null) {
                BindingLoggerKt.logContentBinding("display", strResolveContentBindingKey3, objResolveStateRef3);
                Object objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if ((objUnwrapForCoercion3 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion3) && AbstractC22676k.m65745e(accumulatedState.get(obj10), Boolean.TRUE)) {
                    objOverlayContentPathBindings3 = null;
                } else {
                    objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = null;
                    } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                        JsonElement jsonElement3 = (JsonElement) objOverlayContentPathBindings3;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(DateDisplay.INSTANCE.serializer(), jsonElement3);
                        } catch (Exception unused5) {
                            objOverlayContentPathBindings3 = null;
                        }
                    } else if (!(objOverlayContentPathBindings3 instanceof DateDisplay)) {
                        if (objOverlayContentPathBindings3 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a3 = AbstractC22671h0.m65688a(DateDisplay.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings3 = (DateDisplay) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings3 = (DateDisplay) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings3 = (DateDisplay) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings3 = (DateDisplay) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings3 = (DateDisplay) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings3 = (DateDisplay) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                            } else {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else if (objOverlayContentPathBindings3 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(DateDisplay.INSTANCE.serializer(), jsonPrimitiveM1841c3);
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
                        objOverlayContentPathBindings3 = display;
                    }
                }
            }
        } else if (objOverlayContentPathBindings3 != null) {
            objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(map, "display", accumulatedState, objOverlayContentPathBindings3, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$11
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj12) {
                    return invoke((DateDisplay) obj12);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(DateDisplay v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(DateDisplay.INSTANCE.serializer(), v13);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$12
                /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.DateDisplay, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final DateDisplay invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(DateDisplay.INSTANCE.serializer(), json);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            });
        }
        DateDisplay display2 = (DateDisplay) DotPathBindingsKt.overlayAggregateBinding(map2, "display", accumulatedState, objOverlayContentPathBindings3, "display", new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$13
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj12) {
                return invoke((DateDisplay) obj12);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(DateDisplay dateDisplay) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(DateDisplay.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, dateDisplay, interfaceC37138cM122336d);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$14
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.DateDisplay, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final DateDisplay invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(DateDisplay.INSTANCE.serializer(), json);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$15
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.DateDisplay, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.DateDisplay, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final DateDisplay invoke(Object obj12) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj12);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement4 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(DateDisplay.INSTANCE.serializer(), jsonElement4);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof DateDisplay) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(DateDisplay.INSTANCE.serializer(), jsonPrimitiveM1841c4);
                    } catch (Exception unused8) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(DateDisplay.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (DateDisplay) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (DateDisplay) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (DateDisplay) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (DateDisplay) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (DateDisplay) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (DateDisplay) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (display2 == null) {
            display2 = datePillModel.getDisplay();
        }
        DateDisplay dateDisplay = display2;
        Object objValueOf = Boolean.valueOf(datePillModel.isSelected());
        if (objValueOf instanceof WithGeneratedBindings) {
            Object objBind4 = ((WithGeneratedBindings) objValueOf).bind(accumulatedState);
            if (!(objBind4 instanceof Boolean)) {
                objBind4 = null;
            }
            bool = (Boolean) objBind4;
            if (bool == null) {
                objOverlayContentPathBindings4 = objValueOf;
            } else {
                objOverlayContentPathBindings4 = bool;
            }
        } else if (objValueOf instanceof List) {
            Iterable iterable4 = (Iterable) objValueOf;
            ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable4, 10));
            for (Object obj12 : iterable4) {
                WithGeneratedBindings withGeneratedBindings4 = obj12 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj12 : null;
                if (withGeneratedBindings4 != null && (withGeneratedBindingsBind4 = withGeneratedBindings4.bind(accumulatedState)) != null) {
                    obj12 = withGeneratedBindingsBind4;
                }
                arrayList4.add(obj12);
            }
            bool = (Boolean) arrayList4;
            objOverlayContentPathBindings4 = bool;
        } else {
            objOverlayContentPathBindings4 = objValueOf;
        }
        String strResolveContentBindingKey4 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "isSelected") : null;
        if (strResolveContentBindingKey4 != null) {
            Object objResolveStateRef4 = StateLookupKt.resolveStateRef(strResolveContentBindingKey4, accumulatedState);
            if (objResolveStateRef4 != null) {
                BindingLoggerKt.logContentBinding("isSelected", strResolveContentBindingKey4, objResolveStateRef4);
                Object objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if ((objUnwrapForCoercion4 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion4) && AbstractC22676k.m65745e(accumulatedState.get(obj10), Boolean.TRUE)) {
                    objOverlayContentPathBindings4 = null;
                } else {
                    objOverlayContentPathBindings4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                    if (objOverlayContentPathBindings4 == null) {
                        objOverlayContentPathBindings4 = null;
                    } else if (objOverlayContentPathBindings4 instanceof JsonElement) {
                        JsonElement jsonElement4 = (JsonElement) objOverlayContentPathBindings4;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement4);
                        } catch (Exception unused7) {
                            objOverlayContentPathBindings4 = null;
                        }
                    } else if (!(objOverlayContentPathBindings4 instanceof Boolean)) {
                        if (objOverlayContentPathBindings4 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a4 = AbstractC22671h0.m65688a(Boolean.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings4 = (Boolean) Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings4 = (Boolean) Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings4 = (Boolean) Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings4 = (Boolean) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings4 = (Boolean) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings4 = (Boolean) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                            } else {
                                objOverlayContentPathBindings4 = null;
                            }
                        } else if (objOverlayContentPathBindings4 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings4);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c4);
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
                        objOverlayContentPathBindings4 = objValueOf;
                    }
                }
            }
        } else {
            objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(map, "isSelected", accumulatedState, objOverlayContentPathBindings4, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$16
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj13) {
                    return invoke((Boolean) obj13);
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
            }, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$17
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
        Boolean bool2 = (Boolean) DotPathBindingsKt.overlayAggregateBinding(map2, "isSelected", accumulatedState, objOverlayContentPathBindings4, "isSelected", new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$18
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj13) {
                return invoke((Boolean) obj13);
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
        }, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$19
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
        }, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$20
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Boolean, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Boolean, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj13) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj13);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement5 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement5);
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
                    JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c5);
                    } catch (Exception unused10) {
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
        boolean zBooleanValue = bool2 != null ? bool2.booleanValue() : datePillModel.isSelected();
        Object status = datePillModel.getStatus();
        if (status == null) {
            objOverlayContentPathBindings5 = null;
        } else {
            if (status instanceof WithGeneratedBindings) {
                Object objBind5 = ((WithGeneratedBindings) status).bind(accumulatedState);
                if (!(objBind5 instanceof DatePillStatus)) {
                    objBind5 = null;
                }
                obj4 = (DatePillStatus) objBind5;
                if (obj4 == null) {
                    obj4 = status;
                }
            } else if (status instanceof List) {
                Iterable iterable5 = (Iterable) status;
                ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(iterable5, 10));
                for (Object obj13 : iterable5) {
                    WithGeneratedBindings withGeneratedBindings5 = obj13 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj13 : null;
                    if (withGeneratedBindings5 != null && (withGeneratedBindingsBind5 = withGeneratedBindings5.bind(accumulatedState)) != null) {
                        obj13 = withGeneratedBindingsBind5;
                    }
                    arrayList5.add(obj13);
                }
                obj4 = (DatePillStatus) arrayList5;
            } else {
                obj4 = status;
            }
            objOverlayContentPathBindings5 = obj4;
        }
        String strResolveContentBindingKey5 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, NotificationCompat.CATEGORY_STATUS) : null;
        if (strResolveContentBindingKey5 != null) {
            Object objResolveStateRef5 = StateLookupKt.resolveStateRef(strResolveContentBindingKey5, accumulatedState);
            if (objResolveStateRef5 != null) {
                BindingLoggerKt.logContentBinding(NotificationCompat.CATEGORY_STATUS, strResolveContentBindingKey5, objResolveStateRef5);
                Object objUnwrapForCoercion5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                if ((objUnwrapForCoercion5 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion5) && AbstractC22676k.m65745e(accumulatedState.get(obj10), Boolean.TRUE)) {
                    objOverlayContentPathBindings5 = null;
                } else {
                    objOverlayContentPathBindings5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                    if (objOverlayContentPathBindings5 == null) {
                        objOverlayContentPathBindings5 = null;
                    } else if (objOverlayContentPathBindings5 instanceof JsonElement) {
                        JsonElement jsonElement5 = (JsonElement) objOverlayContentPathBindings5;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.DatePillStatus", DatePillStatus.values()), jsonElement5);
                        } catch (Exception unused9) {
                            objOverlayContentPathBindings5 = null;
                        }
                    } else if (!(objOverlayContentPathBindings5 instanceof DatePillStatus)) {
                        if (objOverlayContentPathBindings5 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a5 = AbstractC22671h0.m65688a(DatePillStatus.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings5 = (DatePillStatus) Integer.valueOf(((Number) objOverlayContentPathBindings5).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings5 = (DatePillStatus) Long.valueOf(((Number) objOverlayContentPathBindings5).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings5 = (DatePillStatus) Double.valueOf(((Number) objOverlayContentPathBindings5).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings5 = (DatePillStatus) Float.valueOf(((Number) objOverlayContentPathBindings5).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings5 = (DatePillStatus) Short.valueOf(((Number) objOverlayContentPathBindings5).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings5 = (DatePillStatus) Byte.valueOf(((Number) objOverlayContentPathBindings5).byteValue());
                            } else {
                                objOverlayContentPathBindings5 = null;
                            }
                        } else if (objOverlayContentPathBindings5 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings5);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.DatePillStatus", DatePillStatus.values()), jsonPrimitiveM1841c5);
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
                        objOverlayContentPathBindings5 = status;
                    }
                }
            }
        } else if (objOverlayContentPathBindings5 != null) {
            objOverlayContentPathBindings5 = ContentPathBindingsKt.overlayContentPathBindings(map, NotificationCompat.CATEGORY_STATUS, accumulatedState, objOverlayContentPathBindings5, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$21
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj14) {
                    return invoke((DatePillStatus) obj14);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(DatePillStatus v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        EnumSerializer enumSerializer = new EnumSerializer("com.whoop.design.models.items.DatePillStatus", DatePillStatus.values());
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, v13, enumSerializer);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$22
                /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.items.DatePillStatus, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final DatePillStatus invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.DatePillStatus", DatePillStatus.values()), json);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            });
        }
        DatePillStatus status2 = (DatePillStatus) DotPathBindingsKt.overlayAggregateBinding(map2, NotificationCompat.CATEGORY_STATUS, accumulatedState, objOverlayContentPathBindings5, NotificationCompat.CATEGORY_STATUS, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$23
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj14) {
                return invoke((DatePillStatus) obj14);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(DatePillStatus datePillStatus) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new EnumSerializer("com.whoop.design.models.items.DatePillStatus", DatePillStatus.values()));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, datePillStatus, interfaceC37138cM122336d);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$24
            /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.items.DatePillStatus, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final DatePillStatus invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.DatePillStatus", DatePillStatus.values()), json);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$25
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.items.DatePillStatus, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.items.DatePillStatus, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final DatePillStatus invoke(Object obj14) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj14);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement6 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.DatePillStatus", DatePillStatus.values()), jsonElement6);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof DatePillStatus) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.models.items.DatePillStatus", DatePillStatus.values()), jsonPrimitiveM1841c6);
                    } catch (Exception unused12) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(DatePillStatus.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (DatePillStatus) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (DatePillStatus) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (DatePillStatus) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (DatePillStatus) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (DatePillStatus) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (DatePillStatus) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (status2 == null) {
            status2 = datePillModel.getStatus();
        }
        DatePillStatus datePillStatus = status2;
        Object selectedColor = datePillModel.getSelectedColor();
        if (selectedColor == null) {
            objOverlayContentPathBindings6 = null;
        } else {
            if (selectedColor instanceof WithGeneratedBindings) {
                Object objBind6 = ((WithGeneratedBindings) selectedColor).bind(accumulatedState);
                if (!(objBind6 instanceof EnumC39333f)) {
                    objBind6 = null;
                }
                obj5 = (EnumC39333f) objBind6;
                if (obj5 == null) {
                    obj5 = selectedColor;
                }
            } else if (selectedColor instanceof List) {
                Iterable iterable6 = (Iterable) selectedColor;
                ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(iterable6, 10));
                for (Object obj14 : iterable6) {
                    WithGeneratedBindings withGeneratedBindings6 = obj14 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj14 : null;
                    if (withGeneratedBindings6 != null && (withGeneratedBindingsBind6 = withGeneratedBindings6.bind(accumulatedState)) != null) {
                        obj14 = withGeneratedBindingsBind6;
                    }
                    arrayList6.add(obj14);
                }
                obj5 = (EnumC39333f) arrayList6;
            } else {
                obj5 = selectedColor;
            }
            objOverlayContentPathBindings6 = obj5;
        }
        String strResolveContentBindingKey6 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "selectedColor") : null;
        if (strResolveContentBindingKey6 != null) {
            Object objResolveStateRef6 = StateLookupKt.resolveStateRef(strResolveContentBindingKey6, accumulatedState);
            if (objResolveStateRef6 != null) {
                BindingLoggerKt.logContentBinding("selectedColor", strResolveContentBindingKey6, objResolveStateRef6);
                Object objUnwrapForCoercion6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef6);
                if ((objUnwrapForCoercion6 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion6) && AbstractC22676k.m65745e(accumulatedState.get(obj10), Boolean.TRUE)) {
                    objOverlayContentPathBindings6 = null;
                } else {
                    objOverlayContentPathBindings6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef6);
                    if (objOverlayContentPathBindings6 == null) {
                        objOverlayContentPathBindings6 = null;
                    } else if (objOverlayContentPathBindings6 instanceof JsonElement) {
                        JsonElement jsonElement6 = (JsonElement) objOverlayContentPathBindings6;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings6 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values()), jsonElement6);
                        } catch (Exception unused11) {
                            objOverlayContentPathBindings6 = null;
                        }
                    } else if (!(objOverlayContentPathBindings6 instanceof EnumC39333f)) {
                        if (objOverlayContentPathBindings6 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a6 = AbstractC22671h0.m65688a(EnumC39333f.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings6 = (EnumC39333f) Integer.valueOf(((Number) objOverlayContentPathBindings6).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings6 = (EnumC39333f) Long.valueOf(((Number) objOverlayContentPathBindings6).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings6 = (EnumC39333f) Double.valueOf(((Number) objOverlayContentPathBindings6).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings6 = (EnumC39333f) Float.valueOf(((Number) objOverlayContentPathBindings6).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings6 = (EnumC39333f) Short.valueOf(((Number) objOverlayContentPathBindings6).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings6 = (EnumC39333f) Byte.valueOf(((Number) objOverlayContentPathBindings6).byteValue());
                            } else {
                                objOverlayContentPathBindings6 = null;
                            }
                        } else if (objOverlayContentPathBindings6 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings6);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings6 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values()), jsonPrimitiveM1841c6);
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
                        objOverlayContentPathBindings6 = selectedColor;
                    }
                }
            }
        } else if (objOverlayContentPathBindings6 != null) {
            objOverlayContentPathBindings6 = ContentPathBindingsKt.overlayContentPathBindings(map, "selectedColor", accumulatedState, objOverlayContentPathBindings6, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$26
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj15) {
                    return invoke((EnumC39333f) obj15);
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
                    } catch (Exception unused13) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$27
                /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, y81.f] */
                @Override // p715kotlin.jvm.functions.Function1
                public final EnumC39333f invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values()), json);
                    } catch (Exception unused13) {
                        return null;
                    }
                }
            });
        }
        EnumC39333f enumC39333f = (EnumC39333f) DotPathBindingsKt.overlayAggregateBinding(map2, "selectedColor", accumulatedState, objOverlayContentPathBindings6, "selectedColor", new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$28
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj15) {
                return invoke((EnumC39333f) obj15);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(EnumC39333f enumC39333f2) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new EnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values()));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, enumC39333f2, interfaceC37138cM122336d);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$29
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, y81.f] */
            @Override // p715kotlin.jvm.functions.Function1
            public final EnumC39333f invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values()), json);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$30
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, y81.f] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, y81.f] */
            @Override // p715kotlin.jvm.functions.Function1
            public final EnumC39333f invoke(Object obj15) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj15);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement7 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values()), jsonElement7);
                    } catch (Exception unused13) {
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
                    JsonPrimitive jsonPrimitiveM1841c7 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new EnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values()), jsonPrimitiveM1841c7);
                    } catch (Exception unused14) {
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
        Object interaction = datePillModel.getInteraction();
        if (interaction == null) {
            objOverlayContentPathBindings7 = null;
        } else {
            if (interaction instanceof WithGeneratedBindings) {
                Object objBind7 = ((WithGeneratedBindings) interaction).bind(accumulatedState);
                if (!(objBind7 instanceof GenericInteraction)) {
                    objBind7 = null;
                }
                obj6 = (GenericInteraction) objBind7;
                if (obj6 == null) {
                    obj6 = interaction;
                }
            } else if (interaction instanceof List) {
                Iterable iterable7 = (Iterable) interaction;
                ArrayList arrayList7 = new ArrayList(AbstractC25267u.m74163i0(iterable7, 10));
                for (Object obj15 : iterable7) {
                    WithGeneratedBindings withGeneratedBindings7 = obj15 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj15 : null;
                    if (withGeneratedBindings7 != null && (withGeneratedBindingsBind7 = withGeneratedBindings7.bind(accumulatedState)) != null) {
                        obj15 = withGeneratedBindingsBind7;
                    }
                    arrayList7.add(obj15);
                }
                obj6 = (GenericInteraction) arrayList7;
            } else {
                obj6 = interaction;
            }
            objOverlayContentPathBindings7 = obj6;
        }
        String strResolveContentBindingKey7 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "interaction") : null;
        if (strResolveContentBindingKey7 != null) {
            Object objResolveStateRef7 = StateLookupKt.resolveStateRef(strResolveContentBindingKey7, accumulatedState);
            if (objResolveStateRef7 != null) {
                BindingLoggerKt.logContentBinding("interaction", strResolveContentBindingKey7, objResolveStateRef7);
                Object objUnwrapForCoercion7 = BindCoercionKt.unwrapForCoercion(objResolveStateRef7);
                if ((objUnwrapForCoercion7 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion7) && AbstractC22676k.m65745e(accumulatedState.get(obj10), Boolean.TRUE)) {
                    objOverlayContentPathBindings7 = null;
                } else {
                    objOverlayContentPathBindings7 = BindCoercionKt.unwrapForCoercion(objResolveStateRef7);
                    if (objOverlayContentPathBindings7 == null) {
                        objOverlayContentPathBindings7 = null;
                    } else if (objOverlayContentPathBindings7 instanceof JsonElement) {
                        JsonElement jsonElement7 = (JsonElement) objOverlayContentPathBindings7;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings7 = StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), jsonElement7);
                        } catch (Exception unused13) {
                            objOverlayContentPathBindings7 = null;
                        }
                    } else if (!(objOverlayContentPathBindings7 instanceof GenericInteraction)) {
                        if (objOverlayContentPathBindings7 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a7 = AbstractC22671h0.m65688a(GenericInteraction.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings7 = (GenericInteraction) Integer.valueOf(((Number) objOverlayContentPathBindings7).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings7 = (GenericInteraction) Long.valueOf(((Number) objOverlayContentPathBindings7).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings7 = (GenericInteraction) Double.valueOf(((Number) objOverlayContentPathBindings7).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings7 = (GenericInteraction) Float.valueOf(((Number) objOverlayContentPathBindings7).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings7 = (GenericInteraction) Short.valueOf(((Number) objOverlayContentPathBindings7).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings7 = (GenericInteraction) Byte.valueOf(((Number) objOverlayContentPathBindings7).byteValue());
                            } else {
                                objOverlayContentPathBindings7 = null;
                            }
                        } else if (objOverlayContentPathBindings7 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c7 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings7);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings7 = StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), jsonPrimitiveM1841c7);
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
                        objOverlayContentPathBindings7 = interaction;
                    }
                }
            }
        } else if (objOverlayContentPathBindings7 != null) {
            objOverlayContentPathBindings7 = ContentPathBindingsKt.overlayContentPathBindings(map, "interaction", accumulatedState, objOverlayContentPathBindings7, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$31
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj16) {
                    return invoke((GenericInteraction) obj16);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(GenericInteraction v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(GenericInteraction.INSTANCE.serializer(), v13);
                    } catch (Exception unused15) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$32
                /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.navigation.models.GenericInteraction, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final GenericInteraction invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), json);
                    } catch (Exception unused15) {
                        return null;
                    }
                }
            });
        }
        GenericInteraction genericInteraction = (GenericInteraction) DotPathBindingsKt.overlayAggregateBinding(map2, "interaction", accumulatedState, objOverlayContentPathBindings7, "interaction", new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$33
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj16) {
                return invoke((GenericInteraction) obj16);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(GenericInteraction genericInteraction2) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(GenericInteraction.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, genericInteraction2, interfaceC37138cM122336d);
                } catch (Exception unused15) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$34
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.navigation.models.GenericInteraction, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final GenericInteraction invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), json);
                } catch (Exception unused15) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$35
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.navigation.models.GenericInteraction, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.navigation.models.GenericInteraction, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final GenericInteraction invoke(Object obj16) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj16);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement8 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), jsonElement8);
                    } catch (Exception unused15) {
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
                    JsonPrimitive jsonPrimitiveM1841c8 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), jsonPrimitiveM1841c8);
                    } catch (Exception unused16) {
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
        Map<String, String> bindings = datePillModel.getBindings();
        if (bindings == null) {
            objOverlayContentPathBindings8 = null;
        } else {
            if (bindings instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind10 = ((WithGeneratedBindings) bindings).bind(accumulatedState);
                if (!(withGeneratedBindingsBind10 instanceof Map)) {
                    withGeneratedBindingsBind10 = null;
                }
                map3 = (Map) withGeneratedBindingsBind10;
                if (map3 == null) {
                    map3 = bindings;
                }
            } else if (bindings instanceof List) {
                Iterable iterable8 = (Iterable) bindings;
                List arrayList8 = new ArrayList(AbstractC25267u.m74163i0(iterable8, 10));
                for (Object obj16 : iterable8) {
                    WithGeneratedBindings withGeneratedBindings8 = obj16 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj16 : null;
                    if (withGeneratedBindings8 != null && (withGeneratedBindingsBind8 = withGeneratedBindings8.bind(accumulatedState)) != null) {
                        obj16 = withGeneratedBindingsBind8;
                    }
                    arrayList8.add(obj16);
                }
                map3 = (Map) arrayList8;
            } else {
                map3 = bindings;
            }
            objOverlayContentPathBindings8 = map3;
        }
        String strResolveContentBindingKey8 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "bindings") : null;
        if (strResolveContentBindingKey8 != null) {
            Object objResolveStateRef8 = StateLookupKt.resolveStateRef(strResolveContentBindingKey8, accumulatedState);
            if (objResolveStateRef8 != null) {
                BindingLoggerKt.logContentBinding("bindings", strResolveContentBindingKey8, objResolveStateRef8);
                Object objUnwrapForCoercion8 = BindCoercionKt.unwrapForCoercion(objResolveStateRef8);
                if ((objUnwrapForCoercion8 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion8) && AbstractC22676k.m65745e(accumulatedState.get(obj10), Boolean.TRUE)) {
                    objOverlayContentPathBindings8 = null;
                } else {
                    objOverlayContentPathBindings8 = BindCoercionKt.unwrapForCoercion(objResolveStateRef8);
                    if (objOverlayContentPathBindings8 == null) {
                        objOverlayContentPathBindings8 = null;
                    } else if (objOverlayContentPathBindings8 instanceof JsonElement) {
                        JsonElement jsonElement8 = (JsonElement) objOverlayContentPathBindings8;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer = StringSerializer.INSTANCE;
                            objOverlayContentPathBindings8 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer, stringSerializer), jsonElement8);
                        } catch (Exception unused15) {
                            objOverlayContentPathBindings8 = null;
                        }
                    } else if (!(objOverlayContentPathBindings8 instanceof Map)) {
                        if (objOverlayContentPathBindings8 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a8 = AbstractC22671h0.m65688a(Map.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings8 = (Map) Integer.valueOf(((Number) objOverlayContentPathBindings8).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings8 = (Map) Long.valueOf(((Number) objOverlayContentPathBindings8).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings8 = (Map) Double.valueOf(((Number) objOverlayContentPathBindings8).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings8 = (Map) Float.valueOf(((Number) objOverlayContentPathBindings8).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings8 = (Map) Short.valueOf(((Number) objOverlayContentPathBindings8).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings8 = (Map) Byte.valueOf(((Number) objOverlayContentPathBindings8).byteValue());
                            } else {
                                objOverlayContentPathBindings8 = null;
                            }
                        } else if (objOverlayContentPathBindings8 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c8 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings8);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                                objOverlayContentPathBindings8 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), jsonPrimitiveM1841c8);
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
                        objOverlayContentPathBindings8 = bindings;
                    }
                }
            }
        } else if (objOverlayContentPathBindings8 != null) {
            objOverlayContentPathBindings8 = ContentPathBindingsKt.overlayContentPathBindings(map, "bindings", accumulatedState, objOverlayContentPathBindings8, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$36
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj17) {
                    return invoke((Map<String, ? extends String>) obj17);
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
                    } catch (Exception unused17) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$37
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Map<String, ? extends String> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), json);
                    } catch (Exception unused17) {
                        return null;
                    }
                }
            });
        }
        Map map5 = (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "bindings", accumulatedState, objOverlayContentPathBindings8, "bindings", new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$38
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj17) {
                return invoke((Map<String, ? extends String>) obj17);
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
                } catch (Exception unused17) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$39
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends String> invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), json);
                } catch (Exception unused17) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$40
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends java.lang.String>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends String> invoke(Object obj17) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj17);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement9 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), jsonElement9);
                    } catch (Exception unused17) {
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
                        StringSerializer stringSerializer4 = StringSerializer.INSTANCE;
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer4, stringSerializer4), jsonPrimitiveM1841c9);
                    } catch (Exception unused18) {
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
        Map<String, AggregateBinding> aggregateBindings = datePillModel.getAggregateBindings();
        if (aggregateBindings == null) {
            obj7 = null;
        } else {
            if (aggregateBindings instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind11 = ((WithGeneratedBindings) aggregateBindings).bind(accumulatedState);
                if (!(withGeneratedBindingsBind11 instanceof Map)) {
                    withGeneratedBindingsBind11 = null;
                }
                map4 = (Map) withGeneratedBindingsBind11;
                if (map4 == null) {
                    map4 = aggregateBindings;
                }
            } else if (aggregateBindings instanceof List) {
                Iterable iterable9 = (Iterable) aggregateBindings;
                List arrayList9 = new ArrayList(AbstractC25267u.m74163i0(iterable9, 10));
                for (Object obj17 : iterable9) {
                    WithGeneratedBindings withGeneratedBindings9 = obj17 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj17 : null;
                    if (withGeneratedBindings9 != null && (withGeneratedBindingsBind9 = withGeneratedBindings9.bind(accumulatedState)) != null) {
                        obj17 = withGeneratedBindingsBind9;
                    }
                    arrayList9.add(obj17);
                }
                map4 = (Map) arrayList9;
            } else {
                map4 = aggregateBindings;
            }
            obj7 = map4;
        }
        String strResolveContentBindingKey9 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "aggregateBindings") : null;
        if (strResolveContentBindingKey9 != null) {
            Object objResolveStateRef9 = StateLookupKt.resolveStateRef(strResolveContentBindingKey9, accumulatedState);
            if (objResolveStateRef9 != null) {
                BindingLoggerKt.logContentBinding("aggregateBindings", strResolveContentBindingKey9, objResolveStateRef9);
                Object objUnwrapForCoercion9 = BindCoercionKt.unwrapForCoercion(objResolveStateRef9);
                if ((objUnwrapForCoercion9 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion9) && AbstractC22676k.m65745e(accumulatedState.get(obj10), Boolean.TRUE)) {
                    obj7 = null;
                } else {
                    Object objUnwrapForCoercion10 = BindCoercionKt.unwrapForCoercion(objResolveStateRef9);
                    if (objUnwrapForCoercion10 == null) {
                        objOverlayContentPathBindings9 = null;
                    } else if (objUnwrapForCoercion10 instanceof JsonElement) {
                        JsonElement jsonElement9 = (JsonElement) objUnwrapForCoercion10;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings9 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement9);
                        } catch (Exception unused17) {
                            objOverlayContentPathBindings9 = null;
                        }
                    } else if (objUnwrapForCoercion10 instanceof Map) {
                        objOverlayContentPathBindings9 = objUnwrapForCoercion10;
                    } else {
                        if (objUnwrapForCoercion10 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a9 = AbstractC22671h0.m65688a(Map.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings9 = (Map) Integer.valueOf(((Number) objUnwrapForCoercion10).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings9 = (Map) Long.valueOf(((Number) objUnwrapForCoercion10).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings9 = (Map) Double.valueOf(((Number) objUnwrapForCoercion10).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings9 = (Map) Float.valueOf(((Number) objUnwrapForCoercion10).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings9 = (Map) Short.valueOf(((Number) objUnwrapForCoercion10).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings9 = (Map) Byte.valueOf(((Number) objUnwrapForCoercion10).byteValue());
                            }
                        } else if (objUnwrapForCoercion10 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c9 = AbstractC0770m.m1841c((String) objUnwrapForCoercion10);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objUnwrapForCoercion10 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c9);
                            } catch (Exception unused18) {
                                objUnwrapForCoercion10 = null;
                            }
                            if (objUnwrapForCoercion10 != null) {
                                objOverlayContentPathBindings9 = objUnwrapForCoercion10;
                            }
                        }
                        objOverlayContentPathBindings9 = null;
                    }
                    obj7 = objOverlayContentPathBindings9 == null ? aggregateBindings : objOverlayContentPathBindings9;
                }
            }
        } else if (obj7 != null) {
            objOverlayContentPathBindings9 = ContentPathBindingsKt.overlayContentPathBindings(map, "aggregateBindings", accumulatedState, obj7, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$41
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj18) {
                    return invoke((Map<String, ? extends AggregateBinding>) obj18);
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
                    } catch (Exception unused19) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$42
                /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Map<String, ? extends AggregateBinding> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), json);
                    } catch (Exception unused19) {
                        return null;
                    }
                }
            });
        }
        return (DatePillModel) ContentBindingResolverKt.copyBindingsFrom(new DatePillModel(str, str2, dateDisplay, zBooleanValue, datePillStatus, enumC39333f, genericInteraction, map5, (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "aggregateBindings", accumulatedState, obj7, "aggregateBindings", new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$43
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj18) {
                return invoke((Map<String, ? extends AggregateBinding>) obj18);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Map<String, ? extends AggregateBinding> map6) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, map6, interfaceC37138cM122336d);
                } catch (Exception unused19) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$44
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends AggregateBinding> invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), json);
                } catch (Exception unused19) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.DatePillModelStateBindingKt$generatedBind$$inlined$resolveBinding$45
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends AggregateBinding> invoke(Object obj18) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj18);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement10 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement10);
                    } catch (Exception unused19) {
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
                    JsonPrimitive jsonPrimitiveM1841c10 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c10);
                    } catch (Exception unused20) {
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
        })), datePillModel);
    }

    public static /* synthetic */ DatePillModel generatedBind$default(DatePillModel datePillModel, Map map, Map map2, Map map3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map2 = null;
        }
        return generatedBind(datePillModel, map, map2, map3);
    }
}
