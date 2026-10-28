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
import com.whoop.whoopaction.domain.models.Action;
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
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003¨\u0006\t"}, m65681d2 = {"generatedBind", "Lcom/whoop/design/models/items/PricingSelectionCardModel;", "contentBinding", "", "", "aggregateBindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "accumulatedState", "", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PricingSelectionCardModelStateBindingKt {
    /* JADX WARN: Code duplicated, block: B:1039:0x1273 A[PHI: r4
      0x1273: PHI (r4v108 java.lang.Object) = (r4v84 java.lang.Object), (r4v88 java.lang.Object) binds: [B:1038:0x1271, B:1066:0x1339] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:125:0x021c  */
    /* JADX WARN: Code duplicated, block: B:144:0x025c  */
    /* JADX WARN: Code duplicated, block: B:216:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:235:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:304:0x054a  */
    /* JADX WARN: Code duplicated, block: B:323:0x058a  */
    /* JADX WARN: Code duplicated, block: B:395:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:414:0x0724  */
    /* JADX WARN: Code duplicated, block: B:483:0x0878  */
    /* JADX WARN: Code duplicated, block: B:502:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:571:0x0a0c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:590:0x0a4c  */
    /* JADX WARN: Code duplicated, block: B:659:0x0ba0  */
    /* JADX WARN: Code duplicated, block: B:678:0x0be0  */
    /* JADX WARN: Code duplicated, block: B:748:0x0d44  */
    /* JADX WARN: Code duplicated, block: B:767:0x0d84  */
    /* JADX WARN: Code duplicated, block: B:839:0x0ede  */
    /* JADX WARN: Code duplicated, block: B:858:0x0f1e  */
    /* JADX WARN: Code duplicated, block: B:930:0x1077  */
    /* JADX WARN: Code duplicated, block: B:948:0x10b3  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final PricingSelectionCardModel generatedBind(PricingSelectionCardModel pricingSelectionCardModel, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, ? extends Object> accumulatedState) {
        Object objOverlayContentPathBindings;
        WithGeneratedBindings withGeneratedBindingsBind;
        Object obj;
        WithGeneratedBindings withGeneratedBindingsBind2;
        Object objOverlayContentPathBindings2;
        Object obj2;
        Object obj3;
        WithGeneratedBindings withGeneratedBindingsBind3;
        Object objOverlayContentPathBindings3;
        Object obj4;
        Object obj5;
        WithGeneratedBindings withGeneratedBindingsBind4;
        Object objOverlayContentPathBindings4;
        Object obj6;
        Object obj7;
        WithGeneratedBindings withGeneratedBindingsBind5;
        Object objOverlayContentPathBindings5;
        Object obj8;
        Object obj9;
        WithGeneratedBindings withGeneratedBindingsBind6;
        Object objOverlayContentPathBindings6;
        Object obj10;
        Object obj11;
        WithGeneratedBindings withGeneratedBindingsBind7;
        Object objOverlayContentPathBindings7;
        Object obj12;
        Object obj13;
        WithGeneratedBindings withGeneratedBindingsBind8;
        Object objOverlayContentPathBindings8;
        Object obj14;
        Object obj15;
        WithGeneratedBindings withGeneratedBindingsBind9;
        Object objOverlayContentPathBindings9;
        Object obj16;
        Object obj17;
        WithGeneratedBindings withGeneratedBindingsBind10;
        Object objOverlayContentPathBindings10;
        Object obj18;
        Action action;
        WithGeneratedBindings withGeneratedBindingsBind11;
        Object objOverlayContentPathBindings11;
        List list;
        WithGeneratedBindings withGeneratedBindingsBind12;
        Object obj19;
        Object objOverlayContentPathBindings12;
        AbstractC22676k.m65750j(pricingSelectionCardModel, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if ((map == null || map.isEmpty()) && ((map2 == null || map2.isEmpty()) && accumulatedState.isEmpty())) {
            return pricingSelectionCardModel;
        }
        Object id4 = pricingSelectionCardModel.getId();
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
            for (Object obj20 : iterable) {
                WithGeneratedBindings withGeneratedBindings = obj20 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj20 : null;
                if (withGeneratedBindings != null && (withGeneratedBindingsBind = withGeneratedBindings.bind(accumulatedState)) != null) {
                    obj20 = withGeneratedBindingsBind;
                }
                arrayList.add(obj20);
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
            objOverlayContentPathBindings = ContentPathBindingsKt.overlayContentPathBindings(map, "id", accumulatedState, objOverlayContentPathBindings, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$1
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj21) {
                    return invoke((String) obj21);
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
            }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$2
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
        String str = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "id", accumulatedState, objOverlayContentPathBindings, "id", new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$3
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj21) {
                return invoke((String) obj21);
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
        }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$4
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
        }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$5
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj21) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj21);
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
        Object title = pricingSelectionCardModel.getTitle();
        if (title == null) {
            objOverlayContentPathBindings2 = null;
        } else {
            if (title instanceof WithGeneratedBindings) {
                Object objBind2 = ((WithGeneratedBindings) title).bind(accumulatedState);
                if (!(objBind2 instanceof String)) {
                    objBind2 = null;
                }
                obj = (String) objBind2;
                if (obj == null) {
                    obj = title;
                }
            } else if (title instanceof List) {
                Iterable iterable2 = (Iterable) title;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
                for (Object obj21 : iterable2) {
                    WithGeneratedBindings withGeneratedBindings2 = obj21 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj21 : null;
                    if (withGeneratedBindings2 != null && (withGeneratedBindingsBind2 = withGeneratedBindings2.bind(accumulatedState)) != null) {
                        obj21 = withGeneratedBindingsBind2;
                    }
                    arrayList2.add(obj21);
                }
                obj = (String) arrayList2;
            } else {
                obj = title;
            }
            objOverlayContentPathBindings2 = obj;
        }
        String strResolveContentBindingKey2 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "title") : null;
        if (strResolveContentBindingKey2 != null) {
            Object objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
            if (objResolveStateRef2 != null) {
                BindingLoggerKt.logContentBinding("title", strResolveContentBindingKey2, objResolveStateRef2);
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
                    objOverlayContentPathBindings2 = title;
                }
            } else {
                obj2 = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
            }
        } else {
            obj2 = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
            if (objOverlayContentPathBindings2 != null) {
                objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(map, "title", accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$6
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj22) {
                        return invoke((String) obj22);
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
                }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$7
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
        Object obj22 = obj2;
        String title2 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "title", accumulatedState, objOverlayContentPathBindings2, "title", new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$8
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj23) {
                return invoke((String) obj23);
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
        }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$9
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
        }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$10
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj23) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj23);
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
        if (title2 == null) {
            title2 = pricingSelectionCardModel.getTitle();
        }
        String str2 = title2;
        Object subtitle = pricingSelectionCardModel.getSubtitle();
        if (subtitle == null) {
            objOverlayContentPathBindings3 = null;
        } else {
            if (subtitle instanceof WithGeneratedBindings) {
                Object objBind3 = ((WithGeneratedBindings) subtitle).bind(accumulatedState);
                if (!(objBind3 instanceof String)) {
                    objBind3 = null;
                }
                obj3 = (String) objBind3;
                if (obj3 == null) {
                    obj3 = subtitle;
                }
            } else if (subtitle instanceof List) {
                Iterable iterable3 = (Iterable) subtitle;
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable3, 10));
                for (Object obj23 : iterable3) {
                    WithGeneratedBindings withGeneratedBindings3 = obj23 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj23 : null;
                    if (withGeneratedBindings3 != null && (withGeneratedBindingsBind3 = withGeneratedBindings3.bind(accumulatedState)) != null) {
                        obj23 = withGeneratedBindingsBind3;
                    }
                    arrayList3.add(obj23);
                }
                obj3 = (String) arrayList3;
            } else {
                obj3 = subtitle;
            }
            objOverlayContentPathBindings3 = obj3;
        }
        String strResolveContentBindingKey3 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "subtitle") : null;
        if (strResolveContentBindingKey3 != null) {
            Object objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
            if (objResolveStateRef3 != null) {
                BindingLoggerKt.logContentBinding("subtitle", strResolveContentBindingKey3, objResolveStateRef3);
                Object objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if ((objUnwrapForCoercion3 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion3)) {
                    obj4 = obj22;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj4), Boolean.TRUE)) {
                        objOverlayContentPathBindings3 = null;
                    }
                } else {
                    obj4 = obj22;
                }
                objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if (objOverlayContentPathBindings3 == null) {
                    objOverlayContentPathBindings3 = null;
                } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                    JsonElement jsonElement3 = (JsonElement) objOverlayContentPathBindings3;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement3);
                    } catch (Exception unused5) {
                        objOverlayContentPathBindings3 = null;
                    }
                } else {
                    boolean z14 = objOverlayContentPathBindings3 instanceof String;
                    if (!z14) {
                        if (objOverlayContentPathBindings3 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a3 = AbstractC22671h0.m65688a(String.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings3 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings3 = (String) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings3 = (String) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings3 = (String) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings3 = (String) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings3 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                            } else {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else if (z14) {
                            JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings3);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c3);
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
                }
                if (objOverlayContentPathBindings3 == null) {
                    objOverlayContentPathBindings3 = subtitle;
                }
            } else {
                obj4 = obj22;
            }
        } else {
            obj4 = obj22;
            if (objOverlayContentPathBindings3 != null) {
                objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(map, "subtitle", accumulatedState, objOverlayContentPathBindings3, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$11
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj24) {
                        return invoke((String) obj24);
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
                }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$12
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
        }
        Object obj24 = obj4;
        String str3 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "subtitle", accumulatedState, objOverlayContentPathBindings3, "subtitle", new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$13
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj25) {
                return invoke((String) obj25);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str4) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str4, interfaceC37138cM122336d);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$14
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
        }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$15
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj25) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj25);
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
                boolean z15 = UnwrapForCoercion instanceof String;
                if (z15) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!z15) {
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
        Object priceLabel = pricingSelectionCardModel.getPriceLabel();
        if (priceLabel == null) {
            objOverlayContentPathBindings4 = null;
        } else {
            if (priceLabel instanceof WithGeneratedBindings) {
                Object objBind4 = ((WithGeneratedBindings) priceLabel).bind(accumulatedState);
                if (!(objBind4 instanceof String)) {
                    objBind4 = null;
                }
                obj5 = (String) objBind4;
                if (obj5 == null) {
                    obj5 = priceLabel;
                }
            } else if (priceLabel instanceof List) {
                Iterable iterable4 = (Iterable) priceLabel;
                ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable4, 10));
                for (Object obj25 : iterable4) {
                    WithGeneratedBindings withGeneratedBindings4 = obj25 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj25 : null;
                    if (withGeneratedBindings4 != null && (withGeneratedBindingsBind4 = withGeneratedBindings4.bind(accumulatedState)) != null) {
                        obj25 = withGeneratedBindingsBind4;
                    }
                    arrayList4.add(obj25);
                }
                obj5 = (String) arrayList4;
            } else {
                obj5 = priceLabel;
            }
            objOverlayContentPathBindings4 = obj5;
        }
        String strResolveContentBindingKey4 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "priceLabel") : null;
        if (strResolveContentBindingKey4 != null) {
            Object objResolveStateRef4 = StateLookupKt.resolveStateRef(strResolveContentBindingKey4, accumulatedState);
            if (objResolveStateRef4 != null) {
                BindingLoggerKt.logContentBinding("priceLabel", strResolveContentBindingKey4, objResolveStateRef4);
                Object objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if ((objUnwrapForCoercion4 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion4)) {
                    obj6 = obj24;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj6), Boolean.TRUE)) {
                        objOverlayContentPathBindings4 = null;
                    }
                } else {
                    obj6 = obj24;
                }
                objOverlayContentPathBindings4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
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
                    boolean z15 = objOverlayContentPathBindings4 instanceof String;
                    if (!z15) {
                        if (objOverlayContentPathBindings4 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a4 = AbstractC22671h0.m65688a(String.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings4 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings4 = (String) Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings4 = (String) Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings4 = (String) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings4 = (String) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings4 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                            } else {
                                objOverlayContentPathBindings4 = null;
                            }
                        } else if (z15) {
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
                    objOverlayContentPathBindings4 = priceLabel;
                }
            } else {
                obj6 = obj24;
            }
        } else {
            obj6 = obj24;
            if (objOverlayContentPathBindings4 != null) {
                objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(map, "priceLabel", accumulatedState, objOverlayContentPathBindings4, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$16
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj26) {
                        return invoke((String) obj26);
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
                }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$17
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
        }
        Object obj26 = obj6;
        String priceLabel2 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "priceLabel", accumulatedState, objOverlayContentPathBindings4, "priceLabel", new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$18
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj27) {
                return invoke((String) obj27);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str4) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str4, interfaceC37138cM122336d);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$19
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
        }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$20
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj27) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj27);
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
                boolean z16 = UnwrapForCoercion instanceof String;
                if (z16) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!z16) {
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
        if (priceLabel2 == null) {
            priceLabel2 = pricingSelectionCardModel.getPriceLabel();
        }
        String str4 = priceLabel2;
        Object priceLabelSize = pricingSelectionCardModel.getPriceLabelSize();
        if (priceLabelSize == null) {
            objOverlayContentPathBindings5 = null;
        } else {
            if (priceLabelSize instanceof WithGeneratedBindings) {
                Object objBind5 = ((WithGeneratedBindings) priceLabelSize).bind(accumulatedState);
                if (!(objBind5 instanceof String)) {
                    objBind5 = null;
                }
                obj7 = (String) objBind5;
                if (obj7 == null) {
                    obj7 = priceLabelSize;
                }
            } else if (priceLabelSize instanceof List) {
                Iterable iterable5 = (Iterable) priceLabelSize;
                ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(iterable5, 10));
                for (Object obj27 : iterable5) {
                    WithGeneratedBindings withGeneratedBindings5 = obj27 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj27 : null;
                    if (withGeneratedBindings5 != null && (withGeneratedBindingsBind5 = withGeneratedBindings5.bind(accumulatedState)) != null) {
                        obj27 = withGeneratedBindingsBind5;
                    }
                    arrayList5.add(obj27);
                }
                obj7 = (String) arrayList5;
            } else {
                obj7 = priceLabelSize;
            }
            objOverlayContentPathBindings5 = obj7;
        }
        String strResolveContentBindingKey5 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "priceLabelSize") : null;
        if (strResolveContentBindingKey5 != null) {
            Object objResolveStateRef5 = StateLookupKt.resolveStateRef(strResolveContentBindingKey5, accumulatedState);
            if (objResolveStateRef5 != null) {
                BindingLoggerKt.logContentBinding("priceLabelSize", strResolveContentBindingKey5, objResolveStateRef5);
                Object objUnwrapForCoercion5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                if ((objUnwrapForCoercion5 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion5)) {
                    obj8 = obj26;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj8), Boolean.TRUE)) {
                        objOverlayContentPathBindings5 = null;
                    }
                } else {
                    obj8 = obj26;
                }
                objOverlayContentPathBindings5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                if (objOverlayContentPathBindings5 == null) {
                    objOverlayContentPathBindings5 = null;
                } else if (objOverlayContentPathBindings5 instanceof JsonElement) {
                    JsonElement jsonElement5 = (JsonElement) objOverlayContentPathBindings5;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement5);
                    } catch (Exception unused9) {
                        objOverlayContentPathBindings5 = null;
                    }
                } else {
                    boolean z16 = objOverlayContentPathBindings5 instanceof String;
                    if (!z16) {
                        if (objOverlayContentPathBindings5 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a5 = AbstractC22671h0.m65688a(String.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings5 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings5).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings5 = (String) Long.valueOf(((Number) objOverlayContentPathBindings5).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings5 = (String) Double.valueOf(((Number) objOverlayContentPathBindings5).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings5 = (String) Float.valueOf(((Number) objOverlayContentPathBindings5).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings5 = (String) Short.valueOf(((Number) objOverlayContentPathBindings5).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings5 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings5).byteValue());
                            } else {
                                objOverlayContentPathBindings5 = null;
                            }
                        } else if (z16) {
                            JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings5);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c5);
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
                }
                if (objOverlayContentPathBindings5 == null) {
                    objOverlayContentPathBindings5 = priceLabelSize;
                }
            } else {
                obj8 = obj26;
            }
        } else {
            obj8 = obj26;
            if (objOverlayContentPathBindings5 != null) {
                objOverlayContentPathBindings5 = ContentPathBindingsKt.overlayContentPathBindings(map, "priceLabelSize", accumulatedState, objOverlayContentPathBindings5, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$21
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj28) {
                        return invoke((String) obj28);
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
                }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$22
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
        }
        Object obj28 = obj8;
        String str5 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "priceLabelSize", accumulatedState, objOverlayContentPathBindings5, "priceLabelSize", new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$23
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj29) {
                return invoke((String) obj29);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str6) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str6, interfaceC37138cM122336d);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$24
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
        }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$25
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj29) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj29);
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
                boolean z17 = UnwrapForCoercion instanceof String;
                if (z17) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!z17) {
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
        Object priceSubLabel = pricingSelectionCardModel.getPriceSubLabel();
        if (priceSubLabel == null) {
            objOverlayContentPathBindings6 = null;
        } else {
            if (priceSubLabel instanceof WithGeneratedBindings) {
                Object objBind6 = ((WithGeneratedBindings) priceSubLabel).bind(accumulatedState);
                if (!(objBind6 instanceof String)) {
                    objBind6 = null;
                }
                obj9 = (String) objBind6;
                if (obj9 == null) {
                    obj9 = priceSubLabel;
                }
            } else if (priceSubLabel instanceof List) {
                Iterable iterable6 = (Iterable) priceSubLabel;
                ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(iterable6, 10));
                for (Object obj29 : iterable6) {
                    WithGeneratedBindings withGeneratedBindings6 = obj29 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj29 : null;
                    if (withGeneratedBindings6 != null && (withGeneratedBindingsBind6 = withGeneratedBindings6.bind(accumulatedState)) != null) {
                        obj29 = withGeneratedBindingsBind6;
                    }
                    arrayList6.add(obj29);
                }
                obj9 = (String) arrayList6;
            } else {
                obj9 = priceSubLabel;
            }
            objOverlayContentPathBindings6 = obj9;
        }
        String strResolveContentBindingKey6 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "priceSubLabel") : null;
        if (strResolveContentBindingKey6 != null) {
            Object objResolveStateRef6 = StateLookupKt.resolveStateRef(strResolveContentBindingKey6, accumulatedState);
            if (objResolveStateRef6 != null) {
                BindingLoggerKt.logContentBinding("priceSubLabel", strResolveContentBindingKey6, objResolveStateRef6);
                Object objUnwrapForCoercion6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef6);
                if ((objUnwrapForCoercion6 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion6)) {
                    obj10 = obj28;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj10), Boolean.TRUE)) {
                        objOverlayContentPathBindings6 = null;
                    }
                } else {
                    obj10 = obj28;
                }
                objOverlayContentPathBindings6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef6);
                if (objOverlayContentPathBindings6 == null) {
                    objOverlayContentPathBindings6 = null;
                } else if (objOverlayContentPathBindings6 instanceof JsonElement) {
                    JsonElement jsonElement6 = (JsonElement) objOverlayContentPathBindings6;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings6 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement6);
                    } catch (Exception unused11) {
                        objOverlayContentPathBindings6 = null;
                    }
                } else {
                    boolean z17 = objOverlayContentPathBindings6 instanceof String;
                    if (!z17) {
                        if (objOverlayContentPathBindings6 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a6 = AbstractC22671h0.m65688a(String.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings6 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings6).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings6 = (String) Long.valueOf(((Number) objOverlayContentPathBindings6).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings6 = (String) Double.valueOf(((Number) objOverlayContentPathBindings6).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings6 = (String) Float.valueOf(((Number) objOverlayContentPathBindings6).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings6 = (String) Short.valueOf(((Number) objOverlayContentPathBindings6).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings6 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings6).byteValue());
                            } else {
                                objOverlayContentPathBindings6 = null;
                            }
                        } else if (z17) {
                            JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings6);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings6 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c6);
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
                }
                if (objOverlayContentPathBindings6 == null) {
                    objOverlayContentPathBindings6 = priceSubLabel;
                }
            } else {
                obj10 = obj28;
            }
        } else {
            obj10 = obj28;
            if (objOverlayContentPathBindings6 != null) {
                objOverlayContentPathBindings6 = ContentPathBindingsKt.overlayContentPathBindings(map, "priceSubLabel", accumulatedState, objOverlayContentPathBindings6, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$26
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj30) {
                        return invoke((String) obj30);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(String v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(StringSerializer.INSTANCE, v13);
                        } catch (Exception unused13) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$27
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final String invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                        } catch (Exception unused13) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj30 = obj10;
        String str6 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "priceSubLabel", accumulatedState, objOverlayContentPathBindings6, "priceSubLabel", new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$28
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj31) {
                return invoke((String) obj31);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str7) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str7, interfaceC37138cM122336d);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$29
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$30
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj31) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj31);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement7 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement7);
                    } catch (Exception unused13) {
                        return null;
                    }
                }
                boolean z18 = UnwrapForCoercion instanceof String;
                if (z18) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!z18) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c7 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c7);
                    } catch (Exception unused14) {
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
        Object priceSubLabelMarkdown = pricingSelectionCardModel.getPriceSubLabelMarkdown();
        if (priceSubLabelMarkdown == null) {
            objOverlayContentPathBindings7 = null;
        } else {
            if (priceSubLabelMarkdown instanceof WithGeneratedBindings) {
                Object objBind7 = ((WithGeneratedBindings) priceSubLabelMarkdown).bind(accumulatedState);
                if (!(objBind7 instanceof String)) {
                    objBind7 = null;
                }
                obj11 = (String) objBind7;
                if (obj11 == null) {
                    obj11 = priceSubLabelMarkdown;
                }
            } else if (priceSubLabelMarkdown instanceof List) {
                Iterable iterable7 = (Iterable) priceSubLabelMarkdown;
                ArrayList arrayList7 = new ArrayList(AbstractC25267u.m74163i0(iterable7, 10));
                for (Object obj31 : iterable7) {
                    WithGeneratedBindings withGeneratedBindings7 = obj31 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj31 : null;
                    if (withGeneratedBindings7 != null && (withGeneratedBindingsBind7 = withGeneratedBindings7.bind(accumulatedState)) != null) {
                        obj31 = withGeneratedBindingsBind7;
                    }
                    arrayList7.add(obj31);
                }
                obj11 = (String) arrayList7;
            } else {
                obj11 = priceSubLabelMarkdown;
            }
            objOverlayContentPathBindings7 = obj11;
        }
        String strResolveContentBindingKey7 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "priceSubLabelMarkdown") : null;
        if (strResolveContentBindingKey7 != null) {
            Object objResolveStateRef7 = StateLookupKt.resolveStateRef(strResolveContentBindingKey7, accumulatedState);
            if (objResolveStateRef7 != null) {
                BindingLoggerKt.logContentBinding("priceSubLabelMarkdown", strResolveContentBindingKey7, objResolveStateRef7);
                Object objUnwrapForCoercion7 = BindCoercionKt.unwrapForCoercion(objResolveStateRef7);
                if ((objUnwrapForCoercion7 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion7)) {
                    obj12 = obj30;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj12), Boolean.TRUE)) {
                        objOverlayContentPathBindings7 = null;
                    }
                } else {
                    obj12 = obj30;
                }
                objOverlayContentPathBindings7 = BindCoercionKt.unwrapForCoercion(objResolveStateRef7);
                if (objOverlayContentPathBindings7 == null) {
                    objOverlayContentPathBindings7 = null;
                } else if (objOverlayContentPathBindings7 instanceof JsonElement) {
                    JsonElement jsonElement7 = (JsonElement) objOverlayContentPathBindings7;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings7 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement7);
                    } catch (Exception unused13) {
                        objOverlayContentPathBindings7 = null;
                    }
                } else {
                    boolean z18 = objOverlayContentPathBindings7 instanceof String;
                    if (!z18) {
                        if (objOverlayContentPathBindings7 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a7 = AbstractC22671h0.m65688a(String.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings7 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings7).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings7 = (String) Long.valueOf(((Number) objOverlayContentPathBindings7).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings7 = (String) Double.valueOf(((Number) objOverlayContentPathBindings7).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings7 = (String) Float.valueOf(((Number) objOverlayContentPathBindings7).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings7 = (String) Short.valueOf(((Number) objOverlayContentPathBindings7).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings7 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings7).byteValue());
                            } else {
                                objOverlayContentPathBindings7 = null;
                            }
                        } else if (z18) {
                            JsonPrimitive jsonPrimitiveM1841c7 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings7);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings7 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c7);
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
                }
                if (objOverlayContentPathBindings7 == null) {
                    objOverlayContentPathBindings7 = priceSubLabelMarkdown;
                }
            } else {
                obj12 = obj30;
            }
        } else {
            obj12 = obj30;
            if (objOverlayContentPathBindings7 != null) {
                objOverlayContentPathBindings7 = ContentPathBindingsKt.overlayContentPathBindings(map, "priceSubLabelMarkdown", accumulatedState, objOverlayContentPathBindings7, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$31
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj32) {
                        return invoke((String) obj32);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(String v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(StringSerializer.INSTANCE, v13);
                        } catch (Exception unused15) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$32
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final String invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                        } catch (Exception unused15) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj32 = obj12;
        String str7 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "priceSubLabelMarkdown", accumulatedState, objOverlayContentPathBindings7, "priceSubLabelMarkdown", new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$33
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj33) {
                return invoke((String) obj33);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str8) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str8, interfaceC37138cM122336d);
                } catch (Exception unused15) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$34
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                } catch (Exception unused15) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$35
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj33) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj33);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement8 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement8);
                    } catch (Exception unused15) {
                        return null;
                    }
                }
                boolean z19 = UnwrapForCoercion instanceof String;
                if (z19) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!z19) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c8 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c8);
                    } catch (Exception unused16) {
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
        Object tag = pricingSelectionCardModel.getTag();
        if (tag == null) {
            objOverlayContentPathBindings8 = null;
        } else {
            if (tag instanceof WithGeneratedBindings) {
                Object objBind8 = ((WithGeneratedBindings) tag).bind(accumulatedState);
                if (!(objBind8 instanceof TagModel)) {
                    objBind8 = null;
                }
                obj13 = (TagModel) objBind8;
                if (obj13 == null) {
                    obj13 = tag;
                }
            } else if (tag instanceof List) {
                Iterable iterable8 = (Iterable) tag;
                ArrayList arrayList8 = new ArrayList(AbstractC25267u.m74163i0(iterable8, 10));
                for (Object obj33 : iterable8) {
                    WithGeneratedBindings withGeneratedBindings8 = obj33 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj33 : null;
                    if (withGeneratedBindings8 != null && (withGeneratedBindingsBind8 = withGeneratedBindings8.bind(accumulatedState)) != null) {
                        obj33 = withGeneratedBindingsBind8;
                    }
                    arrayList8.add(obj33);
                }
                obj13 = (TagModel) arrayList8;
            } else {
                obj13 = tag;
            }
            objOverlayContentPathBindings8 = obj13;
        }
        String strResolveContentBindingKey8 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "tag") : null;
        if (strResolveContentBindingKey8 != null) {
            Object objResolveStateRef8 = StateLookupKt.resolveStateRef(strResolveContentBindingKey8, accumulatedState);
            if (objResolveStateRef8 != null) {
                BindingLoggerKt.logContentBinding("tag", strResolveContentBindingKey8, objResolveStateRef8);
                Object objUnwrapForCoercion8 = BindCoercionKt.unwrapForCoercion(objResolveStateRef8);
                if ((objUnwrapForCoercion8 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion8)) {
                    obj14 = obj32;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj14), Boolean.TRUE)) {
                        objOverlayContentPathBindings8 = null;
                    }
                } else {
                    obj14 = obj32;
                }
                objOverlayContentPathBindings8 = BindCoercionKt.unwrapForCoercion(objResolveStateRef8);
                if (objOverlayContentPathBindings8 == null) {
                    objOverlayContentPathBindings8 = null;
                } else if (objOverlayContentPathBindings8 instanceof JsonElement) {
                    JsonElement jsonElement8 = (JsonElement) objOverlayContentPathBindings8;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings8 = StateBindingDeserializerKt.getStateBindingJson().m1830a(TagModel.INSTANCE.serializer(), jsonElement8);
                    } catch (Exception unused15) {
                        objOverlayContentPathBindings8 = null;
                    }
                } else if (!(objOverlayContentPathBindings8 instanceof TagModel)) {
                    if (objOverlayContentPathBindings8 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a8 = AbstractC22671h0.m65688a(TagModel.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings8 = (TagModel) Integer.valueOf(((Number) objOverlayContentPathBindings8).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings8 = (TagModel) Long.valueOf(((Number) objOverlayContentPathBindings8).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings8 = (TagModel) Double.valueOf(((Number) objOverlayContentPathBindings8).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings8 = (TagModel) Float.valueOf(((Number) objOverlayContentPathBindings8).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings8 = (TagModel) Short.valueOf(((Number) objOverlayContentPathBindings8).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings8 = (TagModel) Byte.valueOf(((Number) objOverlayContentPathBindings8).byteValue());
                        } else {
                            objOverlayContentPathBindings8 = null;
                        }
                    } else if (objOverlayContentPathBindings8 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c8 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings8);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings8 = StateBindingDeserializerKt.getStateBindingJson().m1830a(TagModel.INSTANCE.serializer(), jsonPrimitiveM1841c8);
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
                    objOverlayContentPathBindings8 = tag;
                }
            } else {
                obj14 = obj32;
            }
        } else {
            obj14 = obj32;
            if (objOverlayContentPathBindings8 != null) {
                objOverlayContentPathBindings8 = ContentPathBindingsKt.overlayContentPathBindings(map, "tag", accumulatedState, objOverlayContentPathBindings8, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$36
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj34) {
                        return invoke((TagModel) obj34);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(TagModel v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(TagModel.INSTANCE.serializer(), v13);
                        } catch (Exception unused17) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$37
                    /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.items.TagModel, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final TagModel invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(TagModel.INSTANCE.serializer(), json);
                        } catch (Exception unused17) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj34 = obj14;
        TagModel tagModel = (TagModel) DotPathBindingsKt.overlayAggregateBinding(map2, "tag", accumulatedState, objOverlayContentPathBindings8, "tag", new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$38
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj35) {
                return invoke((TagModel) obj35);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(TagModel tagModel2) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(TagModel.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, tagModel2, interfaceC37138cM122336d);
                } catch (Exception unused17) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$39
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.items.TagModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final TagModel invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(TagModel.INSTANCE.serializer(), json);
                } catch (Exception unused17) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$40
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.items.TagModel, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.items.TagModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final TagModel invoke(Object obj35) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj35);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement9 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(TagModel.INSTANCE.serializer(), jsonElement9);
                    } catch (Exception unused17) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof TagModel) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c9 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(TagModel.INSTANCE.serializer(), jsonPrimitiveM1841c9);
                    } catch (Exception unused18) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(TagModel.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (TagModel) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (TagModel) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (TagModel) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (TagModel) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (TagModel) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (TagModel) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        Object description = pricingSelectionCardModel.getDescription();
        if (description == null) {
            objOverlayContentPathBindings9 = null;
        } else {
            if (description instanceof WithGeneratedBindings) {
                Object objBind9 = ((WithGeneratedBindings) description).bind(accumulatedState);
                if (!(objBind9 instanceof String)) {
                    objBind9 = null;
                }
                obj15 = (String) objBind9;
                if (obj15 == null) {
                    obj15 = description;
                }
            } else if (description instanceof List) {
                Iterable iterable9 = (Iterable) description;
                ArrayList arrayList9 = new ArrayList(AbstractC25267u.m74163i0(iterable9, 10));
                for (Object obj35 : iterable9) {
                    WithGeneratedBindings withGeneratedBindings9 = obj35 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj35 : null;
                    if (withGeneratedBindings9 != null && (withGeneratedBindingsBind9 = withGeneratedBindings9.bind(accumulatedState)) != null) {
                        obj35 = withGeneratedBindingsBind9;
                    }
                    arrayList9.add(obj35);
                }
                obj15 = (String) arrayList9;
            } else {
                obj15 = description;
            }
            objOverlayContentPathBindings9 = obj15;
        }
        String strResolveContentBindingKey9 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "description") : null;
        if (strResolveContentBindingKey9 != null) {
            Object objResolveStateRef9 = StateLookupKt.resolveStateRef(strResolveContentBindingKey9, accumulatedState);
            if (objResolveStateRef9 != null) {
                BindingLoggerKt.logContentBinding("description", strResolveContentBindingKey9, objResolveStateRef9);
                Object objUnwrapForCoercion9 = BindCoercionKt.unwrapForCoercion(objResolveStateRef9);
                if ((objUnwrapForCoercion9 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion9)) {
                    obj16 = obj34;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj16), Boolean.TRUE)) {
                        objOverlayContentPathBindings9 = null;
                    }
                } else {
                    obj16 = obj34;
                }
                objOverlayContentPathBindings9 = BindCoercionKt.unwrapForCoercion(objResolveStateRef9);
                if (objOverlayContentPathBindings9 == null) {
                    objOverlayContentPathBindings9 = null;
                } else if (objOverlayContentPathBindings9 instanceof JsonElement) {
                    JsonElement jsonElement9 = (JsonElement) objOverlayContentPathBindings9;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings9 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement9);
                    } catch (Exception unused17) {
                        objOverlayContentPathBindings9 = null;
                    }
                } else {
                    boolean z19 = objOverlayContentPathBindings9 instanceof String;
                    if (!z19) {
                        if (objOverlayContentPathBindings9 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a9 = AbstractC22671h0.m65688a(String.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings9 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings9).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings9 = (String) Long.valueOf(((Number) objOverlayContentPathBindings9).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings9 = (String) Double.valueOf(((Number) objOverlayContentPathBindings9).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings9 = (String) Float.valueOf(((Number) objOverlayContentPathBindings9).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings9 = (String) Short.valueOf(((Number) objOverlayContentPathBindings9).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings9 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings9).byteValue());
                            } else {
                                objOverlayContentPathBindings9 = null;
                            }
                        } else if (z19) {
                            JsonPrimitive jsonPrimitiveM1841c9 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings9);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings9 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c9);
                            } catch (Exception unused18) {
                                objOverlayContentPathBindings9 = null;
                            }
                            if (objOverlayContentPathBindings9 == null) {
                                objOverlayContentPathBindings9 = null;
                            }
                        } else {
                            objOverlayContentPathBindings9 = null;
                        }
                    }
                }
                if (objOverlayContentPathBindings9 == null) {
                    objOverlayContentPathBindings9 = description;
                }
            } else {
                obj16 = obj34;
            }
        } else {
            obj16 = obj34;
            if (objOverlayContentPathBindings9 != null) {
                objOverlayContentPathBindings9 = ContentPathBindingsKt.overlayContentPathBindings(map, "description", accumulatedState, objOverlayContentPathBindings9, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$41
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj36) {
                        return invoke((String) obj36);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(String v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(StringSerializer.INSTANCE, v13);
                        } catch (Exception unused19) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$42
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final String invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                        } catch (Exception unused19) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj36 = obj16;
        String description2 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "description", accumulatedState, objOverlayContentPathBindings9, "description", new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$43
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj37) {
                return invoke((String) obj37);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str8) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str8, interfaceC37138cM122336d);
                } catch (Exception unused19) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$44
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                } catch (Exception unused19) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$45
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj37) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj37);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement10 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement10);
                    } catch (Exception unused19) {
                        return null;
                    }
                }
                boolean z24 = UnwrapForCoercion instanceof String;
                if (z24) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!z24) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c10 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c10);
                    } catch (Exception unused20) {
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
        if (description2 == null) {
            description2 = pricingSelectionCardModel.getDescription();
        }
        String str8 = description2;
        Object style = pricingSelectionCardModel.getStyle();
        if (style == null) {
            objOverlayContentPathBindings10 = null;
        } else {
            if (style instanceof WithGeneratedBindings) {
                Object objBind10 = ((WithGeneratedBindings) style).bind(accumulatedState);
                if (!(objBind10 instanceof String)) {
                    objBind10 = null;
                }
                obj17 = (String) objBind10;
                if (obj17 == null) {
                    obj17 = style;
                }
            } else if (style instanceof List) {
                Iterable iterable10 = (Iterable) style;
                ArrayList arrayList10 = new ArrayList(AbstractC25267u.m74163i0(iterable10, 10));
                for (Object obj37 : iterable10) {
                    WithGeneratedBindings withGeneratedBindings10 = obj37 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj37 : null;
                    if (withGeneratedBindings10 != null && (withGeneratedBindingsBind10 = withGeneratedBindings10.bind(accumulatedState)) != null) {
                        obj37 = withGeneratedBindingsBind10;
                    }
                    arrayList10.add(obj37);
                }
                obj17 = (String) arrayList10;
            } else {
                obj17 = style;
            }
            objOverlayContentPathBindings10 = obj17;
        }
        String strResolveContentBindingKey10 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "style") : null;
        if (strResolveContentBindingKey10 != null) {
            Object objResolveStateRef10 = StateLookupKt.resolveStateRef(strResolveContentBindingKey10, accumulatedState);
            if (objResolveStateRef10 != null) {
                BindingLoggerKt.logContentBinding("style", strResolveContentBindingKey10, objResolveStateRef10);
                Object objUnwrapForCoercion10 = BindCoercionKt.unwrapForCoercion(objResolveStateRef10);
                if ((objUnwrapForCoercion10 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion10)) {
                    obj18 = obj36;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj18), Boolean.TRUE)) {
                        objOverlayContentPathBindings10 = null;
                    }
                } else {
                    obj18 = obj36;
                }
                objOverlayContentPathBindings10 = BindCoercionKt.unwrapForCoercion(objResolveStateRef10);
                if (objOverlayContentPathBindings10 == null) {
                    objOverlayContentPathBindings10 = null;
                } else if (objOverlayContentPathBindings10 instanceof JsonElement) {
                    JsonElement jsonElement10 = (JsonElement) objOverlayContentPathBindings10;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings10 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement10);
                    } catch (Exception unused19) {
                        objOverlayContentPathBindings10 = null;
                    }
                } else {
                    boolean z24 = objOverlayContentPathBindings10 instanceof String;
                    if (!z24) {
                        if (objOverlayContentPathBindings10 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a10 = AbstractC22671h0.m65688a(String.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings10 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings10).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings10 = (String) Long.valueOf(((Number) objOverlayContentPathBindings10).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings10 = (String) Double.valueOf(((Number) objOverlayContentPathBindings10).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings10 = (String) Float.valueOf(((Number) objOverlayContentPathBindings10).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings10 = (String) Short.valueOf(((Number) objOverlayContentPathBindings10).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings10 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings10).byteValue());
                            } else {
                                objOverlayContentPathBindings10 = null;
                            }
                        } else if (z24) {
                            JsonPrimitive jsonPrimitiveM1841c10 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings10);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings10 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c10);
                            } catch (Exception unused20) {
                                objOverlayContentPathBindings10 = null;
                            }
                            if (objOverlayContentPathBindings10 == null) {
                                objOverlayContentPathBindings10 = null;
                            }
                        } else {
                            objOverlayContentPathBindings10 = null;
                        }
                    }
                }
                if (objOverlayContentPathBindings10 == null) {
                    objOverlayContentPathBindings10 = style;
                }
            } else {
                obj18 = obj36;
            }
        } else {
            obj18 = obj36;
            if (objOverlayContentPathBindings10 != null) {
                objOverlayContentPathBindings10 = ContentPathBindingsKt.overlayContentPathBindings(map, "style", accumulatedState, objOverlayContentPathBindings10, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$46
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj38) {
                        return invoke((String) obj38);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(String v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(StringSerializer.INSTANCE, v13);
                        } catch (Exception unused21) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$47
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final String invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                        } catch (Exception unused21) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj38 = obj18;
        String style2 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "style", accumulatedState, objOverlayContentPathBindings10, "style", new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$48
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj39) {
                return invoke((String) obj39);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str9) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str9, interfaceC37138cM122336d);
                } catch (Exception unused21) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$49
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                } catch (Exception unused21) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$50
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj39) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj39);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement11 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement11);
                    } catch (Exception unused21) {
                        return null;
                    }
                }
                boolean z25 = UnwrapForCoercion instanceof String;
                if (z25) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!z25) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c11 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c11);
                    } catch (Exception unused22) {
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
        if (style2 == null) {
            style2 = pricingSelectionCardModel.getStyle();
        }
        String str9 = style2;
        Action action2 = pricingSelectionCardModel.getAction();
        if (action2 == null) {
            objOverlayContentPathBindings11 = null;
        } else {
            if (action2 instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind13 = ((WithGeneratedBindings) action2).bind(accumulatedState);
                if (!(withGeneratedBindingsBind13 instanceof Action)) {
                    withGeneratedBindingsBind13 = null;
                }
                action = (Action) withGeneratedBindingsBind13;
                if (action == null) {
                    action = action2;
                }
            } else if (action2 instanceof List) {
                Iterable iterable11 = (Iterable) action2;
                List arrayList11 = new ArrayList(AbstractC25267u.m74163i0(iterable11, 10));
                for (Object obj39 : iterable11) {
                    WithGeneratedBindings withGeneratedBindings11 = obj39 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj39 : null;
                    if (withGeneratedBindings11 != null && (withGeneratedBindingsBind11 = withGeneratedBindings11.bind(accumulatedState)) != null) {
                        obj39 = withGeneratedBindingsBind11;
                    }
                    arrayList11.add(obj39);
                }
                action = (Action) arrayList11;
            } else {
                action = action2;
            }
            objOverlayContentPathBindings11 = action;
        }
        String strResolveContentBindingKey11 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "action") : null;
        if (strResolveContentBindingKey11 != null) {
            Object objResolveStateRef11 = StateLookupKt.resolveStateRef(strResolveContentBindingKey11, accumulatedState);
            if (objResolveStateRef11 != null) {
                BindingLoggerKt.logContentBinding("action", strResolveContentBindingKey11, objResolveStateRef11);
                Object objUnwrapForCoercion11 = BindCoercionKt.unwrapForCoercion(objResolveStateRef11);
                if ((objUnwrapForCoercion11 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion11) && AbstractC22676k.m65745e(accumulatedState.get(obj38), Boolean.TRUE)) {
                    objOverlayContentPathBindings11 = null;
                } else {
                    objOverlayContentPathBindings11 = BindCoercionKt.unwrapForCoercion(objResolveStateRef11);
                    if (objOverlayContentPathBindings11 == null) {
                        objOverlayContentPathBindings11 = null;
                    } else if (objOverlayContentPathBindings11 instanceof JsonElement) {
                        try {
                            objOverlayContentPathBindings11 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(Action.class)), (JsonElement) objOverlayContentPathBindings11);
                        } catch (Exception unused21) {
                            objOverlayContentPathBindings11 = null;
                        }
                    } else if (!(objOverlayContentPathBindings11 instanceof Action)) {
                        if (objOverlayContentPathBindings11 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a11 = AbstractC22671h0.m65688a(Action.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings11 = (Action) Integer.valueOf(((Number) objOverlayContentPathBindings11).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings11 = (Action) Long.valueOf(((Number) objOverlayContentPathBindings11).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings11 = (Action) Double.valueOf(((Number) objOverlayContentPathBindings11).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings11 = (Action) Float.valueOf(((Number) objOverlayContentPathBindings11).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings11 = (Action) Short.valueOf(((Number) objOverlayContentPathBindings11).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings11 = (Action) Byte.valueOf(((Number) objOverlayContentPathBindings11).byteValue());
                            } else {
                                objOverlayContentPathBindings11 = null;
                            }
                        } else if (objOverlayContentPathBindings11 instanceof String) {
                            try {
                                objOverlayContentPathBindings11 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(Action.class)), AbstractC0770m.m1841c((String) objOverlayContentPathBindings11));
                            } catch (Exception unused22) {
                                objOverlayContentPathBindings11 = null;
                            }
                            if (objOverlayContentPathBindings11 == null) {
                                objOverlayContentPathBindings11 = null;
                            }
                        } else {
                            objOverlayContentPathBindings11 = null;
                        }
                    }
                    if (objOverlayContentPathBindings11 == null) {
                        objOverlayContentPathBindings11 = action2;
                    }
                }
            }
        } else if (objOverlayContentPathBindings11 != null) {
            objOverlayContentPathBindings11 = ContentPathBindingsKt.overlayContentPathBindings(map, "action", accumulatedState, objOverlayContentPathBindings11, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$51
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj40) {
                    return invoke((Action) obj40);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Action v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        InterfaceC37138c interfaceC37138cM113842e = AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Action.class));
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, v13, interfaceC37138cM113842e);
                    } catch (Exception unused23) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$52
                /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.whoopaction.domain.models.Action, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Action invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Action.class)), json);
                    } catch (Exception unused23) {
                        return null;
                    }
                }
            });
        }
        Action action3 = (Action) DotPathBindingsKt.overlayAggregateBinding(map2, "action", accumulatedState, objOverlayContentPathBindings11, "action", new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$53
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj40) {
                return invoke((Action) obj40);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Action action4) {
                try {
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Action.class)));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, action4, interfaceC37138cM122336d);
                } catch (Exception unused23) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$54
            /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.whoopaction.domain.models.Action, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Action invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Action.class)), json);
                } catch (Exception unused23) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$55
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [com.whoop.whoopaction.domain.models.Action] */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.whoopaction.domain.models.Action, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.whoopaction.domain.models.Action, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Action invoke(Object obj40) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj40);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Action.class)), (JsonElement) UnwrapForCoercion);
                    } catch (Exception unused23) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof Action) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    try {
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Action.class)), AbstractC0770m.m1841c((String) UnwrapForCoercion));
                    } catch (Exception unused24) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Action.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (Action) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (Action) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (Action) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (Action) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (Action) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (Action) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        List<TagModel> features = pricingSelectionCardModel.getFeatures();
        if (features == null) {
            obj19 = null;
        } else {
            if (features instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind14 = ((WithGeneratedBindings) features).bind(accumulatedState);
                if (!(withGeneratedBindingsBind14 instanceof List)) {
                    withGeneratedBindingsBind14 = null;
                }
                list = (List) withGeneratedBindingsBind14;
                if (list == null) {
                    list = features;
                }
            } else {
                List<TagModel> list2 = features;
                ArrayList arrayList12 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                for (Object obj40 : list2) {
                    WithGeneratedBindings withGeneratedBindings12 = obj40 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj40 : null;
                    if (withGeneratedBindings12 != null && (withGeneratedBindingsBind12 = withGeneratedBindings12.bind(accumulatedState)) != null) {
                        obj40 = withGeneratedBindingsBind12;
                    }
                    arrayList12.add(obj40);
                }
                list = arrayList12;
            }
            obj19 = list;
        }
        String strResolveContentBindingKey12 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "features") : null;
        if (strResolveContentBindingKey12 != null) {
            Object objResolveStateRef12 = StateLookupKt.resolveStateRef(strResolveContentBindingKey12, accumulatedState);
            if (objResolveStateRef12 != null) {
                BindingLoggerKt.logContentBinding("features", strResolveContentBindingKey12, objResolveStateRef12);
                Object objUnwrapForCoercion12 = BindCoercionKt.unwrapForCoercion(objResolveStateRef12);
                if ((objUnwrapForCoercion12 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion12) && AbstractC22676k.m65745e(accumulatedState.get(obj38), Boolean.TRUE)) {
                    obj19 = null;
                } else {
                    Object objUnwrapForCoercion13 = BindCoercionKt.unwrapForCoercion(objResolveStateRef12);
                    if (objUnwrapForCoercion13 == null) {
                        objOverlayContentPathBindings12 = null;
                    } else if (objUnwrapForCoercion13 instanceof JsonElement) {
                        JsonElement jsonElement11 = (JsonElement) objUnwrapForCoercion13;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings12 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(TagModel.INSTANCE.serializer()), jsonElement11);
                        } catch (Exception unused23) {
                            objOverlayContentPathBindings12 = null;
                        }
                    } else if (objUnwrapForCoercion13 instanceof List) {
                        objOverlayContentPathBindings12 = objUnwrapForCoercion13;
                    } else {
                        if (objUnwrapForCoercion13 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a12 = AbstractC22671h0.m65688a(List.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a12, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings12 = (List) Integer.valueOf(((Number) objUnwrapForCoercion13).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a12, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings12 = (List) Long.valueOf(((Number) objUnwrapForCoercion13).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a12, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings12 = (List) Double.valueOf(((Number) objUnwrapForCoercion13).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a12, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings12 = (List) Float.valueOf(((Number) objUnwrapForCoercion13).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a12, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings12 = (List) Short.valueOf(((Number) objUnwrapForCoercion13).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a12, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings12 = (List) Byte.valueOf(((Number) objUnwrapForCoercion13).byteValue());
                            }
                        } else if (objUnwrapForCoercion13 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c11 = AbstractC0770m.m1841c((String) objUnwrapForCoercion13);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objUnwrapForCoercion13 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(TagModel.INSTANCE.serializer()), jsonPrimitiveM1841c11);
                            } catch (Exception unused24) {
                                objUnwrapForCoercion13 = null;
                            }
                            if (objUnwrapForCoercion13 != null) {
                                objOverlayContentPathBindings12 = objUnwrapForCoercion13;
                            }
                        }
                        objOverlayContentPathBindings12 = null;
                    }
                    obj19 = objOverlayContentPathBindings12 == null ? features : objOverlayContentPathBindings12;
                }
            }
        } else if (obj19 != null) {
            objOverlayContentPathBindings12 = ContentPathBindingsKt.overlayContentPathBindings(map, "features", accumulatedState, obj19, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$56
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj41) {
                    return invoke((List<? extends TagModel>) obj41);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(List<? extends TagModel> v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        ArrayListSerializer arrayListSerializer = new ArrayListSerializer(TagModel.INSTANCE.serializer());
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, v13, arrayListSerializer);
                    } catch (Exception unused25) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$57
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.items.TagModel>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final List<? extends TagModel> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(TagModel.INSTANCE.serializer()), json);
                    } catch (Exception unused25) {
                        return null;
                    }
                }
            });
        }
        return (PricingSelectionCardModel) ContentBindingResolverKt.copyBindingsFrom(new PricingSelectionCardModel(str, str2, str3, str4, str5, str6, str7, tagModel, str8, str9, action3, (List) DotPathBindingsKt.overlayAggregateBinding(map2, "features", accumulatedState, obj19, "features", new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$58
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj41) {
                return invoke((List<? extends TagModel>) obj41);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(List<? extends TagModel> list3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new ArrayListSerializer(TagModel.INSTANCE.serializer()));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, list3, interfaceC37138cM122336d);
                } catch (Exception unused25) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$59
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.items.TagModel>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final List<? extends TagModel> invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(TagModel.INSTANCE.serializer()), json);
                } catch (Exception unused25) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.PricingSelectionCardModelStateBindingKt$generatedBind$$inlined$resolveBinding$60
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<? extends com.whoop.design.models.items.TagModel>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.items.TagModel>] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.items.TagModel>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final List<? extends TagModel> invoke(Object obj41) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj41);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement12 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(TagModel.INSTANCE.serializer()), jsonElement12);
                    } catch (Exception unused25) {
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
                    JsonPrimitive jsonPrimitiveM1841c12 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(TagModel.INSTANCE.serializer()), jsonPrimitiveM1841c12);
                    } catch (Exception unused26) {
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
        })), pricingSelectionCardModel);
    }

    public static /* synthetic */ PricingSelectionCardModel generatedBind$default(PricingSelectionCardModel pricingSelectionCardModel, Map map, Map map2, Map map3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map2 = null;
        }
        return generatedBind(pricingSelectionCardModel, map, map2, map3);
    }
}
