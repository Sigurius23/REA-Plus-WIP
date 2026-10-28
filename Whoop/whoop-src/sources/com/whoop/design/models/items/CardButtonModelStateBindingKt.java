package com.whoop.design.models.items;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import com.whoop.analytics.AnalyticEventModel;
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
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.DismissEventModel;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
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
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003¨\u0006\t"}, m65681d2 = {"generatedBind", "Lcom/whoop/design/models/items/CardButtonModel;", "contentBinding", "", "", "aggregateBindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "accumulatedState", "", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CardButtonModelStateBindingKt {
    /* JADX WARN: Code duplicated, block: B:1000:0x1214  */
    /* JADX WARN: Code duplicated, block: B:1018:0x1250  */
    /* JADX WARN: Code duplicated, block: B:1085:0x139e  */
    /* JADX WARN: Code duplicated, block: B:1103:0x13da  */
    /* JADX WARN: Code duplicated, block: B:1170:0x1528  */
    /* JADX WARN: Code duplicated, block: B:1188:0x1564  */
    /* JADX WARN: Code duplicated, block: B:1255:0x16b2  */
    /* JADX WARN: Code duplicated, block: B:125:0x021c  */
    /* JADX WARN: Code duplicated, block: B:1273:0x16ee  */
    /* JADX WARN: Code duplicated, block: B:1340:0x183c  */
    /* JADX WARN: Code duplicated, block: B:1358:0x1878  */
    /* JADX WARN: Code duplicated, block: B:1426:0x19d6  */
    /* JADX WARN: Code duplicated, block: B:1444:0x1a12  */
    /* JADX WARN: Code duplicated, block: B:144:0x025c  */
    /* JADX WARN: Code duplicated, block: B:1512:0x1b64  */
    /* JADX WARN: Code duplicated, block: B:1530:0x1ba0  */
    /* JADX WARN: Code duplicated, block: B:1598:0x1cfe  */
    /* JADX WARN: Code duplicated, block: B:1617:0x1d3c  */
    /* JADX WARN: Code duplicated, block: B:1685:0x1e96  */
    /* JADX WARN: Code duplicated, block: B:1711:0x1efd A[PHI: r4
      0x1efd: PHI (r4v155 java.lang.Object) = (r4v131 java.lang.Object), (r4v135 java.lang.Object) binds: [B:1710:0x1efb, B:1738:0x1fc3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:223:0x03da  */
    /* JADX WARN: Code duplicated, block: B:242:0x041a  */
    /* JADX WARN: Code duplicated, block: B:311:0x056e  */
    /* JADX WARN: Code duplicated, block: B:330:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:399:0x0702  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:418:0x0742  */
    /* JADX WARN: Code duplicated, block: B:487:0x0896  */
    /* JADX WARN: Code duplicated, block: B:506:0x08d6  */
    /* JADX WARN: Code duplicated, block: B:578:0x0a30  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:597:0x0a70  */
    /* JADX WARN: Code duplicated, block: B:666:0x0bc4  */
    /* JADX WARN: Code duplicated, block: B:685:0x0c04  */
    /* JADX WARN: Code duplicated, block: B:755:0x0d6e  */
    /* JADX WARN: Code duplicated, block: B:774:0x0dae  */
    /* JADX WARN: Code duplicated, block: B:844:0x0f18  */
    /* JADX WARN: Code duplicated, block: B:863:0x0f58  */
    /* JADX WARN: Code duplicated, block: B:932:0x10b6  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final CardButtonModel generatedBind(CardButtonModel cardButtonModel, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, ? extends Object> accumulatedState) {
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
        Action action;
        WithGeneratedBindings withGeneratedBindingsBind9;
        Object objOverlayContentPathBindings9;
        Object obj15;
        Object obj16;
        WithGeneratedBindings withGeneratedBindingsBind10;
        Object objOverlayContentPathBindings10;
        Object obj17;
        Object objOverlayContentPathBindings11;
        Object obj18;
        WithGeneratedBindings withGeneratedBindingsBind11;
        Object objOverlayContentPathBindings12;
        Object obj19;
        WithGeneratedBindings withGeneratedBindingsBind12;
        Object objOverlayContentPathBindings13;
        Object obj20;
        WithGeneratedBindings withGeneratedBindingsBind13;
        Object objOverlayContentPathBindings14;
        Object obj21;
        WithGeneratedBindings withGeneratedBindingsBind14;
        Object objOverlayContentPathBindings15;
        Object obj22;
        WithGeneratedBindings withGeneratedBindingsBind15;
        Object objOverlayContentPathBindings16;
        Object obj23;
        WithGeneratedBindings withGeneratedBindingsBind16;
        Object objOverlayContentPathBindings17;
        Object obj24;
        WithGeneratedBindings withGeneratedBindingsBind17;
        Object objOverlayContentPathBindings18;
        Map<String, String> map3;
        WithGeneratedBindings withGeneratedBindingsBind18;
        Object objOverlayContentPathBindings19;
        Map<String, AggregateBinding> map4;
        WithGeneratedBindings withGeneratedBindingsBind19;
        Object obj25;
        Object objOverlayContentPathBindings20;
        AbstractC22676k.m65750j(cardButtonModel, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if ((map == null || map.isEmpty()) && ((map2 == null || map2.isEmpty()) && accumulatedState.isEmpty())) {
            return cardButtonModel;
        }
        Object id4 = cardButtonModel.getId();
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
            for (Object obj26 : iterable) {
                WithGeneratedBindings withGeneratedBindings = obj26 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj26 : null;
                if (withGeneratedBindings != null && (withGeneratedBindingsBind = withGeneratedBindings.bind(accumulatedState)) != null) {
                    obj26 = withGeneratedBindingsBind;
                }
                arrayList.add(obj26);
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
            objOverlayContentPathBindings = ContentPathBindingsKt.overlayContentPathBindings(map, "id", accumulatedState, objOverlayContentPathBindings, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$1
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj27) {
                    return invoke((String) obj27);
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
            }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$2
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
        String str = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "id", accumulatedState, objOverlayContentPathBindings, "id", new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$3
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj27) {
                return invoke((String) obj27);
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
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$4
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
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$5
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
        Object title = cardButtonModel.getTitle();
        if (title == null) {
            objOverlayContentPathBindings2 = null;
        } else {
            if (title instanceof WithGeneratedBindings) {
                Object objBind2 = ((WithGeneratedBindings) title).bind(accumulatedState);
                if (!(objBind2 instanceof TextResource)) {
                    objBind2 = null;
                }
                obj = (TextResource) objBind2;
                if (obj == null) {
                    obj = title;
                }
            } else if (title instanceof List) {
                Iterable iterable2 = (Iterable) title;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
                for (Object obj27 : iterable2) {
                    WithGeneratedBindings withGeneratedBindings2 = obj27 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj27 : null;
                    if (withGeneratedBindings2 != null && (withGeneratedBindingsBind2 = withGeneratedBindings2.bind(accumulatedState)) != null) {
                        obj27 = withGeneratedBindingsBind2;
                    }
                    arrayList2.add(obj27);
                }
                obj = (TextResource) arrayList2;
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
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(TextResource.INSTANCE.serializer(), jsonElement2);
                    } catch (Exception unused3) {
                        objOverlayContentPathBindings2 = null;
                    }
                } else if (!(objOverlayContentPathBindings2 instanceof TextResource)) {
                    if (objOverlayContentPathBindings2 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a2 = AbstractC22671h0.m65688a(TextResource.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings2 = (TextResource) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings2 = (TextResource) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings2 = (TextResource) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings2 = (TextResource) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings2 = (TextResource) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings2 = (TextResource) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                        } else {
                            objOverlayContentPathBindings2 = null;
                        }
                    } else {
                        boolean z13 = objOverlayContentPathBindings2 instanceof String;
                        if (z13) {
                            objOverlayContentPathBindings2 = AbstractC8693b.m21278l((String) objOverlayContentPathBindings2);
                            if (objOverlayContentPathBindings2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type com.whoop.design.util.TextResource");
                            }
                        } else if (z13) {
                            JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(TextResource.INSTANCE.serializer(), jsonPrimitiveM1841c2);
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
                objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(map, "title", accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$6
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj28) {
                        return invoke((TextResource) obj28);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(TextResource v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(TextResource.INSTANCE.serializer(), v13);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$7
                    /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.util.TextResource, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final TextResource invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(TextResource.INSTANCE.serializer(), json);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj28 = obj2;
        TextResource title2 = (TextResource) DotPathBindingsKt.overlayAggregateBinding(map2, "title", accumulatedState, objOverlayContentPathBindings2, "title", new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$8
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj29) {
                return invoke((TextResource) obj29);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(TextResource textResource) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(TextResource.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, textResource, interfaceC37138cM122336d);
                } catch (Exception unused5) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$9
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.util.TextResource, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final TextResource invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(TextResource.INSTANCE.serializer(), json);
                } catch (Exception unused5) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$10
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [com.whoop.design.util.TextResource] */
            /* JADX WARN: Type inference failed for: r0v6, types: [com.whoop.design.util.TextResource, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.util.TextResource, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final TextResource invoke(Object obj29) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj29);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement3 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(TextResource.INSTANCE.serializer(), jsonElement3);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof TextResource) {
                    return UnwrapForCoercion;
                }
                if (UnwrapForCoercion instanceof Number) {
                    C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                    InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(TextResource.class);
                    if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                        return (TextResource) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                        return (TextResource) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                        return (TextResource) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                        return (TextResource) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                        return (TextResource) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                    }
                    if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                        return (TextResource) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                    }
                    return null;
                }
                boolean z14 = UnwrapForCoercion instanceof String;
                if (z14) {
                    TextResource textResourceM21278l = AbstractC8693b.m21278l((String) UnwrapForCoercion);
                    if (textResourceM21278l != null) {
                        return textResourceM21278l;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.whoop.design.util.TextResource");
                }
                if (!z14) {
                    return null;
                }
                JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(TextResource.INSTANCE.serializer(), jsonPrimitiveM1841c3);
                } catch (Exception unused6) {
                    objM1830a = null;
                }
                if (objM1830a != null) {
                    return objM1830a;
                }
                return null;
            }
        });
        if (title2 == null) {
            title2 = cardButtonModel.getTitle();
        }
        TextResource textResource = title2;
        Object icon = cardButtonModel.getIcon();
        if (icon == null) {
            objOverlayContentPathBindings3 = null;
        } else {
            if (icon instanceof WithGeneratedBindings) {
                Object objBind3 = ((WithGeneratedBindings) icon).bind(accumulatedState);
                if (!(objBind3 instanceof String)) {
                    objBind3 = null;
                }
                obj3 = (String) objBind3;
                if (obj3 == null) {
                    obj3 = icon;
                }
            } else if (icon instanceof List) {
                Iterable iterable3 = (Iterable) icon;
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable3, 10));
                for (Object obj29 : iterable3) {
                    WithGeneratedBindings withGeneratedBindings3 = obj29 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj29 : null;
                    if (withGeneratedBindings3 != null && (withGeneratedBindingsBind3 = withGeneratedBindings3.bind(accumulatedState)) != null) {
                        obj29 = withGeneratedBindingsBind3;
                    }
                    arrayList3.add(obj29);
                }
                obj3 = (String) arrayList3;
            } else {
                obj3 = icon;
            }
            objOverlayContentPathBindings3 = obj3;
        }
        String strResolveContentBindingKey3 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "icon") : null;
        if (strResolveContentBindingKey3 != null) {
            Object objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
            if (objResolveStateRef3 != null) {
                BindingLoggerKt.logContentBinding("icon", strResolveContentBindingKey3, objResolveStateRef3);
                Object objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if ((objUnwrapForCoercion3 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion3)) {
                    obj4 = obj28;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj4), Boolean.TRUE)) {
                        objOverlayContentPathBindings3 = null;
                    }
                } else {
                    obj4 = obj28;
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
                    objOverlayContentPathBindings3 = icon;
                }
            } else {
                obj4 = obj28;
            }
        } else {
            obj4 = obj28;
            if (objOverlayContentPathBindings3 != null) {
                objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(map, "icon", accumulatedState, objOverlayContentPathBindings3, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$11
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
                        } catch (Exception unused7) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$12
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
        Object obj30 = obj4;
        String str2 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "icon", accumulatedState, objOverlayContentPathBindings3, "icon", new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$13
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj31) {
                return invoke((String) obj31);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str3, interfaceC37138cM122336d);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$14
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
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$15
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
        Object cardName = cardButtonModel.getCardName();
        if (cardName == null) {
            objOverlayContentPathBindings4 = null;
        } else {
            if (cardName instanceof WithGeneratedBindings) {
                Object objBind4 = ((WithGeneratedBindings) cardName).bind(accumulatedState);
                if (!(objBind4 instanceof String)) {
                    objBind4 = null;
                }
                obj5 = (String) objBind4;
                if (obj5 == null) {
                    obj5 = cardName;
                }
            } else if (cardName instanceof List) {
                Iterable iterable4 = (Iterable) cardName;
                ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable4, 10));
                for (Object obj31 : iterable4) {
                    WithGeneratedBindings withGeneratedBindings4 = obj31 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj31 : null;
                    if (withGeneratedBindings4 != null && (withGeneratedBindingsBind4 = withGeneratedBindings4.bind(accumulatedState)) != null) {
                        obj31 = withGeneratedBindingsBind4;
                    }
                    arrayList4.add(obj31);
                }
                obj5 = (String) arrayList4;
            } else {
                obj5 = cardName;
            }
            objOverlayContentPathBindings4 = obj5;
        }
        String strResolveContentBindingKey4 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "card_name") : null;
        if (strResolveContentBindingKey4 != null) {
            Object objResolveStateRef4 = StateLookupKt.resolveStateRef(strResolveContentBindingKey4, accumulatedState);
            if (objResolveStateRef4 != null) {
                BindingLoggerKt.logContentBinding("card_name", strResolveContentBindingKey4, objResolveStateRef4);
                Object objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if ((objUnwrapForCoercion4 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion4)) {
                    obj6 = obj30;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj6), Boolean.TRUE)) {
                        objOverlayContentPathBindings4 = null;
                    }
                } else {
                    obj6 = obj30;
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
                    objOverlayContentPathBindings4 = cardName;
                }
            } else {
                obj6 = obj30;
            }
        } else {
            obj6 = obj30;
            if (objOverlayContentPathBindings4 != null) {
                objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(map, "card_name", accumulatedState, objOverlayContentPathBindings4, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$16
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
                        } catch (Exception unused9) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$17
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
        Object obj32 = obj6;
        String str3 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "card_name", accumulatedState, objOverlayContentPathBindings4, "card_name", new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$18
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj33) {
                return invoke((String) obj33);
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
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$19
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
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$20
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
        Object featureType = cardButtonModel.getFeatureType();
        if (featureType == null) {
            objOverlayContentPathBindings5 = null;
        } else {
            if (featureType instanceof WithGeneratedBindings) {
                Object objBind5 = ((WithGeneratedBindings) featureType).bind(accumulatedState);
                if (!(objBind5 instanceof String)) {
                    objBind5 = null;
                }
                obj7 = (String) objBind5;
                if (obj7 == null) {
                    obj7 = featureType;
                }
            } else if (featureType instanceof List) {
                Iterable iterable5 = (Iterable) featureType;
                ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(iterable5, 10));
                for (Object obj33 : iterable5) {
                    WithGeneratedBindings withGeneratedBindings5 = obj33 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj33 : null;
                    if (withGeneratedBindings5 != null && (withGeneratedBindingsBind5 = withGeneratedBindings5.bind(accumulatedState)) != null) {
                        obj33 = withGeneratedBindingsBind5;
                    }
                    arrayList5.add(obj33);
                }
                obj7 = (String) arrayList5;
            } else {
                obj7 = featureType;
            }
            objOverlayContentPathBindings5 = obj7;
        }
        String strResolveContentBindingKey5 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "feature_type") : null;
        if (strResolveContentBindingKey5 != null) {
            Object objResolveStateRef5 = StateLookupKt.resolveStateRef(strResolveContentBindingKey5, accumulatedState);
            if (objResolveStateRef5 != null) {
                BindingLoggerKt.logContentBinding("feature_type", strResolveContentBindingKey5, objResolveStateRef5);
                Object objUnwrapForCoercion5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                if ((objUnwrapForCoercion5 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion5)) {
                    obj8 = obj32;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj8), Boolean.TRUE)) {
                        objOverlayContentPathBindings5 = null;
                    }
                } else {
                    obj8 = obj32;
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
                    objOverlayContentPathBindings5 = featureType;
                }
            } else {
                obj8 = obj32;
            }
        } else {
            obj8 = obj32;
            if (objOverlayContentPathBindings5 != null) {
                objOverlayContentPathBindings5 = ContentPathBindingsKt.overlayContentPathBindings(map, "feature_type", accumulatedState, objOverlayContentPathBindings5, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$21
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj34) {
                        return invoke((String) obj34);
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
                }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$22
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
        Object obj34 = obj8;
        String str4 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "feature_type", accumulatedState, objOverlayContentPathBindings5, "feature_type", new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$23
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj35) {
                return invoke((String) obj35);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str5) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str5, interfaceC37138cM122336d);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$24
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
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$25
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj35) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj35);
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
        Object style = cardButtonModel.getStyle();
        if (style == null) {
            objOverlayContentPathBindings6 = null;
        } else {
            if (style instanceof WithGeneratedBindings) {
                Object objBind6 = ((WithGeneratedBindings) style).bind(accumulatedState);
                if (!(objBind6 instanceof String)) {
                    objBind6 = null;
                }
                obj9 = (String) objBind6;
                if (obj9 == null) {
                    obj9 = style;
                }
            } else if (style instanceof List) {
                Iterable iterable6 = (Iterable) style;
                ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(iterable6, 10));
                for (Object obj35 : iterable6) {
                    WithGeneratedBindings withGeneratedBindings6 = obj35 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj35 : null;
                    if (withGeneratedBindings6 != null && (withGeneratedBindingsBind6 = withGeneratedBindings6.bind(accumulatedState)) != null) {
                        obj35 = withGeneratedBindingsBind6;
                    }
                    arrayList6.add(obj35);
                }
                obj9 = (String) arrayList6;
            } else {
                obj9 = style;
            }
            objOverlayContentPathBindings6 = obj9;
        }
        String strResolveContentBindingKey6 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "style") : null;
        if (strResolveContentBindingKey6 != null) {
            Object objResolveStateRef6 = StateLookupKt.resolveStateRef(strResolveContentBindingKey6, accumulatedState);
            if (objResolveStateRef6 != null) {
                BindingLoggerKt.logContentBinding("style", strResolveContentBindingKey6, objResolveStateRef6);
                Object objUnwrapForCoercion6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef6);
                if ((objUnwrapForCoercion6 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion6)) {
                    obj10 = obj34;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj10), Boolean.TRUE)) {
                        objOverlayContentPathBindings6 = null;
                    }
                } else {
                    obj10 = obj34;
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
                    objOverlayContentPathBindings6 = style;
                }
            } else {
                obj10 = obj34;
            }
        } else {
            obj10 = obj34;
            if (objOverlayContentPathBindings6 != null) {
                objOverlayContentPathBindings6 = ContentPathBindingsKt.overlayContentPathBindings(map, "style", accumulatedState, objOverlayContentPathBindings6, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$26
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
                        } catch (Exception unused13) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$27
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
        Object obj36 = obj10;
        String style2 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "style", accumulatedState, objOverlayContentPathBindings6, "style", new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$28
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj37) {
                return invoke((String) obj37);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str5) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str5, interfaceC37138cM122336d);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$29
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
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$30
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
        if (style2 == null) {
            style2 = cardButtonModel.getStyle();
        }
        String str5 = style2;
        Object backgroundStyle = cardButtonModel.getBackgroundStyle();
        if (backgroundStyle == null) {
            objOverlayContentPathBindings7 = null;
        } else {
            if (backgroundStyle instanceof WithGeneratedBindings) {
                Object objBind7 = ((WithGeneratedBindings) backgroundStyle).bind(accumulatedState);
                if (!(objBind7 instanceof String)) {
                    objBind7 = null;
                }
                obj11 = (String) objBind7;
                if (obj11 == null) {
                    obj11 = backgroundStyle;
                }
            } else if (backgroundStyle instanceof List) {
                Iterable iterable7 = (Iterable) backgroundStyle;
                ArrayList arrayList7 = new ArrayList(AbstractC25267u.m74163i0(iterable7, 10));
                for (Object obj37 : iterable7) {
                    WithGeneratedBindings withGeneratedBindings7 = obj37 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj37 : null;
                    if (withGeneratedBindings7 != null && (withGeneratedBindingsBind7 = withGeneratedBindings7.bind(accumulatedState)) != null) {
                        obj37 = withGeneratedBindingsBind7;
                    }
                    arrayList7.add(obj37);
                }
                obj11 = (String) arrayList7;
            } else {
                obj11 = backgroundStyle;
            }
            objOverlayContentPathBindings7 = obj11;
        }
        String strResolveContentBindingKey7 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "backgroundStyle") : null;
        if (strResolveContentBindingKey7 != null) {
            Object objResolveStateRef7 = StateLookupKt.resolveStateRef(strResolveContentBindingKey7, accumulatedState);
            if (objResolveStateRef7 != null) {
                BindingLoggerKt.logContentBinding("backgroundStyle", strResolveContentBindingKey7, objResolveStateRef7);
                Object objUnwrapForCoercion7 = BindCoercionKt.unwrapForCoercion(objResolveStateRef7);
                if ((objUnwrapForCoercion7 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion7)) {
                    obj12 = obj36;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj12), Boolean.TRUE)) {
                        objOverlayContentPathBindings7 = null;
                    }
                } else {
                    obj12 = obj36;
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
                    objOverlayContentPathBindings7 = backgroundStyle;
                }
            } else {
                obj12 = obj36;
            }
        } else {
            obj12 = obj36;
            if (objOverlayContentPathBindings7 != null) {
                objOverlayContentPathBindings7 = ContentPathBindingsKt.overlayContentPathBindings(map, "backgroundStyle", accumulatedState, objOverlayContentPathBindings7, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$31
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
                        } catch (Exception unused15) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$32
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
        Object obj38 = obj12;
        String str6 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "backgroundStyle", accumulatedState, objOverlayContentPathBindings7, "backgroundStyle", new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$33
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj39) {
                return invoke((String) obj39);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str7) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str7, interfaceC37138cM122336d);
                } catch (Exception unused15) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$34
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
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$35
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
        Object destination = cardButtonModel.getDestination();
        if (destination == null) {
            objOverlayContentPathBindings8 = null;
        } else {
            if (destination instanceof WithGeneratedBindings) {
                Object objBind8 = ((WithGeneratedBindings) destination).bind(accumulatedState);
                if (!(objBind8 instanceof C9598e)) {
                    objBind8 = null;
                }
                obj13 = (C9598e) objBind8;
                if (obj13 == null) {
                    obj13 = destination;
                }
            } else if (destination instanceof List) {
                Iterable iterable8 = (Iterable) destination;
                ArrayList arrayList8 = new ArrayList(AbstractC25267u.m74163i0(iterable8, 10));
                for (Object obj39 : iterable8) {
                    WithGeneratedBindings withGeneratedBindings8 = obj39 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj39 : null;
                    if (withGeneratedBindings8 != null && (withGeneratedBindingsBind8 = withGeneratedBindings8.bind(accumulatedState)) != null) {
                        obj39 = withGeneratedBindingsBind8;
                    }
                    arrayList8.add(obj39);
                }
                obj13 = (C9598e) arrayList8;
            } else {
                obj13 = destination;
            }
            objOverlayContentPathBindings8 = obj13;
        }
        String strResolveContentBindingKey8 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "destination") : null;
        if (strResolveContentBindingKey8 != null) {
            Object objResolveStateRef8 = StateLookupKt.resolveStateRef(strResolveContentBindingKey8, accumulatedState);
            if (objResolveStateRef8 != null) {
                BindingLoggerKt.logContentBinding("destination", strResolveContentBindingKey8, objResolveStateRef8);
                Object objUnwrapForCoercion8 = BindCoercionKt.unwrapForCoercion(objResolveStateRef8);
                if ((objUnwrapForCoercion8 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion8)) {
                    obj14 = obj38;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj14), Boolean.TRUE)) {
                        objOverlayContentPathBindings8 = null;
                    }
                } else {
                    obj14 = obj38;
                }
                objOverlayContentPathBindings8 = BindCoercionKt.unwrapForCoercion(objResolveStateRef8);
                if (objOverlayContentPathBindings8 == null) {
                    objOverlayContentPathBindings8 = null;
                } else if (objOverlayContentPathBindings8 instanceof JsonElement) {
                    try {
                        objOverlayContentPathBindings8 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(C9598e.class)), (JsonElement) objOverlayContentPathBindings8);
                    } catch (Exception unused15) {
                        objOverlayContentPathBindings8 = null;
                    }
                } else if (!(objOverlayContentPathBindings8 instanceof C9598e)) {
                    if (objOverlayContentPathBindings8 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a8 = AbstractC22671h0.m65688a(C9598e.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings8 = (C9598e) Integer.valueOf(((Number) objOverlayContentPathBindings8).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings8 = (C9598e) Long.valueOf(((Number) objOverlayContentPathBindings8).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings8 = (C9598e) Double.valueOf(((Number) objOverlayContentPathBindings8).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings8 = (C9598e) Float.valueOf(((Number) objOverlayContentPathBindings8).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings8 = (C9598e) Short.valueOf(((Number) objOverlayContentPathBindings8).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings8 = (C9598e) Byte.valueOf(((Number) objOverlayContentPathBindings8).byteValue());
                        } else {
                            objOverlayContentPathBindings8 = null;
                        }
                    } else if (objOverlayContentPathBindings8 instanceof String) {
                        try {
                            objOverlayContentPathBindings8 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(C9598e.class)), AbstractC0770m.m1841c((String) objOverlayContentPathBindings8));
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
                    objOverlayContentPathBindings8 = destination;
                }
            } else {
                obj14 = obj38;
            }
        } else {
            obj14 = obj38;
            if (objOverlayContentPathBindings8 != null) {
                objOverlayContentPathBindings8 = ContentPathBindingsKt.overlayContentPathBindings(map, "destination", accumulatedState, objOverlayContentPathBindings8, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$36
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj40) {
                        return invoke((C9598e) obj40);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(C9598e v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            InterfaceC37138c interfaceC37138cM113843f = AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class));
                            AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                            stateBindingJson.getClass();
                            return AbstractC12313p.m34290h0(stateBindingJson, v13, interfaceC37138cM113843f);
                        } catch (Exception unused17) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$37
                    /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.navigation.e, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final C9598e invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class)), json);
                        } catch (Exception unused17) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj40 = obj14;
        C9598e c9598e = (C9598e) DotPathBindingsKt.overlayAggregateBinding(map2, "destination", accumulatedState, objOverlayContentPathBindings8, "destination", new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$38
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj41) {
                return invoke((C9598e) obj41);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(C9598e c9598e2) {
                try {
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class)));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, c9598e2, interfaceC37138cM122336d);
                } catch (Exception unused17) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$39
            /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.navigation.e, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final C9598e invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class)), json);
                } catch (Exception unused17) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$40
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.navigation.e, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.navigation.e, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final C9598e invoke(Object obj41) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj41);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class)), (JsonElement) UnwrapForCoercion);
                    } catch (Exception unused17) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof C9598e) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    try {
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class)), AbstractC0770m.m1841c((String) UnwrapForCoercion));
                    } catch (Exception unused18) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C9598e.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (C9598e) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (C9598e) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (C9598e) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (C9598e) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (C9598e) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (C9598e) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        Action action2 = cardButtonModel.getAction();
        if (action2 == null) {
            objOverlayContentPathBindings9 = null;
        } else {
            if (action2 instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind20 = ((WithGeneratedBindings) action2).bind(accumulatedState);
                if (!(withGeneratedBindingsBind20 instanceof Action)) {
                    withGeneratedBindingsBind20 = null;
                }
                action = (Action) withGeneratedBindingsBind20;
                if (action == null) {
                    action = action2;
                }
            } else if (action2 instanceof List) {
                Iterable iterable9 = (Iterable) action2;
                List arrayList9 = new ArrayList(AbstractC25267u.m74163i0(iterable9, 10));
                for (Object obj41 : iterable9) {
                    WithGeneratedBindings withGeneratedBindings9 = obj41 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj41 : null;
                    if (withGeneratedBindings9 != null && (withGeneratedBindingsBind9 = withGeneratedBindings9.bind(accumulatedState)) != null) {
                        obj41 = withGeneratedBindingsBind9;
                    }
                    arrayList9.add(obj41);
                }
                action = (Action) arrayList9;
            } else {
                action = action2;
            }
            objOverlayContentPathBindings9 = action;
        }
        String strResolveContentBindingKey9 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "action") : null;
        if (strResolveContentBindingKey9 != null) {
            Object objResolveStateRef9 = StateLookupKt.resolveStateRef(strResolveContentBindingKey9, accumulatedState);
            if (objResolveStateRef9 != null) {
                BindingLoggerKt.logContentBinding("action", strResolveContentBindingKey9, objResolveStateRef9);
                Object objUnwrapForCoercion9 = BindCoercionKt.unwrapForCoercion(objResolveStateRef9);
                if ((objUnwrapForCoercion9 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion9)) {
                    obj15 = obj40;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj15), Boolean.TRUE)) {
                        objOverlayContentPathBindings9 = null;
                    }
                } else {
                    obj15 = obj40;
                }
                objOverlayContentPathBindings9 = BindCoercionKt.unwrapForCoercion(objResolveStateRef9);
                if (objOverlayContentPathBindings9 == null) {
                    objOverlayContentPathBindings9 = null;
                } else if (objOverlayContentPathBindings9 instanceof JsonElement) {
                    try {
                        objOverlayContentPathBindings9 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(Action.class)), (JsonElement) objOverlayContentPathBindings9);
                    } catch (Exception unused17) {
                        objOverlayContentPathBindings9 = null;
                    }
                } else if (!(objOverlayContentPathBindings9 instanceof Action)) {
                    if (objOverlayContentPathBindings9 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a9 = AbstractC22671h0.m65688a(Action.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings9 = (Action) Integer.valueOf(((Number) objOverlayContentPathBindings9).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings9 = (Action) Long.valueOf(((Number) objOverlayContentPathBindings9).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings9 = (Action) Double.valueOf(((Number) objOverlayContentPathBindings9).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings9 = (Action) Float.valueOf(((Number) objOverlayContentPathBindings9).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings9 = (Action) Short.valueOf(((Number) objOverlayContentPathBindings9).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings9 = (Action) Byte.valueOf(((Number) objOverlayContentPathBindings9).byteValue());
                        } else {
                            objOverlayContentPathBindings9 = null;
                        }
                    } else if (objOverlayContentPathBindings9 instanceof String) {
                        try {
                            objOverlayContentPathBindings9 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(Action.class)), AbstractC0770m.m1841c((String) objOverlayContentPathBindings9));
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
                if (objOverlayContentPathBindings9 == null) {
                    objOverlayContentPathBindings9 = action2;
                }
            } else {
                obj15 = obj40;
            }
        } else {
            obj15 = obj40;
            if (objOverlayContentPathBindings9 != null) {
                objOverlayContentPathBindings9 = ContentPathBindingsKt.overlayContentPathBindings(map, "action", accumulatedState, objOverlayContentPathBindings9, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$41
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj42) {
                        return invoke((Action) obj42);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(Action v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            InterfaceC37138c interfaceC37138cM113842e = AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Action.class));
                            AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                            stateBindingJson.getClass();
                            return AbstractC12313p.m34290h0(stateBindingJson, v13, interfaceC37138cM113842e);
                        } catch (Exception unused19) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$42
                    /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.whoopaction.domain.models.Action, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Action invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Action.class)), json);
                        } catch (Exception unused19) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj42 = obj15;
        Action action3 = (Action) DotPathBindingsKt.overlayAggregateBinding(map2, "action", accumulatedState, objOverlayContentPathBindings9, "action", new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$43
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj43) {
                return invoke((Action) obj43);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Action action4) {
                try {
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Action.class)));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, action4, interfaceC37138cM122336d);
                } catch (Exception unused19) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$44
            /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.whoopaction.domain.models.Action, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Action invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Action.class)), json);
                } catch (Exception unused19) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$45
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [com.whoop.whoopaction.domain.models.Action] */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.whoopaction.domain.models.Action, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.whoopaction.domain.models.Action, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Action invoke(Object obj43) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj43);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Action.class)), (JsonElement) UnwrapForCoercion);
                    } catch (Exception unused19) {
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
                    } catch (Exception unused20) {
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
        Object analyticEvent = cardButtonModel.getAnalyticEvent();
        if (analyticEvent == null) {
            objOverlayContentPathBindings10 = null;
        } else {
            if (analyticEvent instanceof WithGeneratedBindings) {
                Object objBind9 = ((WithGeneratedBindings) analyticEvent).bind(accumulatedState);
                if (!(objBind9 instanceof AnalyticEventModel)) {
                    objBind9 = null;
                }
                obj16 = (AnalyticEventModel) objBind9;
                if (obj16 == null) {
                    obj16 = analyticEvent;
                }
            } else if (analyticEvent instanceof List) {
                Iterable iterable10 = (Iterable) analyticEvent;
                ArrayList arrayList10 = new ArrayList(AbstractC25267u.m74163i0(iterable10, 10));
                for (Object obj43 : iterable10) {
                    WithGeneratedBindings withGeneratedBindings10 = obj43 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj43 : null;
                    if (withGeneratedBindings10 != null && (withGeneratedBindingsBind10 = withGeneratedBindings10.bind(accumulatedState)) != null) {
                        obj43 = withGeneratedBindingsBind10;
                    }
                    arrayList10.add(obj43);
                }
                obj16 = (AnalyticEventModel) arrayList10;
            } else {
                obj16 = analyticEvent;
            }
            objOverlayContentPathBindings10 = obj16;
        }
        String strResolveContentBindingKey10 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "analyticEvent") : null;
        if (strResolveContentBindingKey10 != null) {
            Object objResolveStateRef10 = StateLookupKt.resolveStateRef(strResolveContentBindingKey10, accumulatedState);
            if (objResolveStateRef10 != null) {
                BindingLoggerKt.logContentBinding("analyticEvent", strResolveContentBindingKey10, objResolveStateRef10);
                Object objUnwrapForCoercion10 = BindCoercionKt.unwrapForCoercion(objResolveStateRef10);
                if ((objUnwrapForCoercion10 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion10)) {
                    obj17 = obj42;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj17), Boolean.TRUE)) {
                        objOverlayContentPathBindings10 = null;
                    }
                } else {
                    obj17 = obj42;
                }
                objOverlayContentPathBindings10 = BindCoercionKt.unwrapForCoercion(objResolveStateRef10);
                if (objOverlayContentPathBindings10 == null) {
                    objOverlayContentPathBindings10 = null;
                } else if (objOverlayContentPathBindings10 instanceof JsonElement) {
                    JsonElement jsonElement8 = (JsonElement) objOverlayContentPathBindings10;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings10 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AnalyticEventModel.INSTANCE.serializer(), jsonElement8);
                    } catch (Exception unused19) {
                        objOverlayContentPathBindings10 = null;
                    }
                } else if (!(objOverlayContentPathBindings10 instanceof AnalyticEventModel)) {
                    if (objOverlayContentPathBindings10 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a10 = AbstractC22671h0.m65688a(AnalyticEventModel.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings10 = (AnalyticEventModel) Integer.valueOf(((Number) objOverlayContentPathBindings10).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings10 = (AnalyticEventModel) Long.valueOf(((Number) objOverlayContentPathBindings10).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings10 = (AnalyticEventModel) Double.valueOf(((Number) objOverlayContentPathBindings10).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings10 = (AnalyticEventModel) Float.valueOf(((Number) objOverlayContentPathBindings10).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings10 = (AnalyticEventModel) Short.valueOf(((Number) objOverlayContentPathBindings10).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings10 = (AnalyticEventModel) Byte.valueOf(((Number) objOverlayContentPathBindings10).byteValue());
                        } else {
                            objOverlayContentPathBindings10 = null;
                        }
                    } else if (objOverlayContentPathBindings10 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c8 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings10);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings10 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AnalyticEventModel.INSTANCE.serializer(), jsonPrimitiveM1841c8);
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
                if (objOverlayContentPathBindings10 == null) {
                    objOverlayContentPathBindings10 = analyticEvent;
                }
            } else {
                obj17 = obj42;
            }
        } else {
            obj17 = obj42;
            if (objOverlayContentPathBindings10 != null) {
                objOverlayContentPathBindings10 = ContentPathBindingsKt.overlayContentPathBindings(map, "analyticEvent", accumulatedState, objOverlayContentPathBindings10, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$46
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj44) {
                        return invoke((AnalyticEventModel) obj44);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(AnalyticEventModel v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(AnalyticEventModel.INSTANCE.serializer(), v13);
                        } catch (Exception unused21) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$47
                    /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.analytics.AnalyticEventModel, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final AnalyticEventModel invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(AnalyticEventModel.INSTANCE.serializer(), json);
                        } catch (Exception unused21) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj44 = obj17;
        AnalyticEventModel analyticEventModel = (AnalyticEventModel) DotPathBindingsKt.overlayAggregateBinding(map2, "analyticEvent", accumulatedState, objOverlayContentPathBindings10, "analyticEvent", new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$48
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj45) {
                return invoke((AnalyticEventModel) obj45);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(AnalyticEventModel analyticEventModel2) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(AnalyticEventModel.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, analyticEventModel2, interfaceC37138cM122336d);
                } catch (Exception unused21) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$49
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.analytics.AnalyticEventModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final AnalyticEventModel invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(AnalyticEventModel.INSTANCE.serializer(), json);
                } catch (Exception unused21) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$50
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.analytics.AnalyticEventModel, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.analytics.AnalyticEventModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final AnalyticEventModel invoke(Object obj45) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj45);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement9 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AnalyticEventModel.INSTANCE.serializer(), jsonElement9);
                    } catch (Exception unused21) {
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
                    JsonPrimitive jsonPrimitiveM1841c9 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(AnalyticEventModel.INSTANCE.serializer(), jsonPrimitiveM1841c9);
                    } catch (Exception unused22) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(AnalyticEventModel.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (AnalyticEventModel) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (AnalyticEventModel) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (AnalyticEventModel) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (AnalyticEventModel) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (AnalyticEventModel) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (AnalyticEventModel) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        AnyModal modal = cardButtonModel.getModal();
        if (modal == null) {
            objOverlayContentPathBindings11 = null;
        } else {
            WithGeneratedBindings withGeneratedBindingsBind21 = modal.bind(accumulatedState);
            if (!(withGeneratedBindingsBind21 instanceof AnyModal)) {
                withGeneratedBindingsBind21 = null;
            }
            AnyModal anyModal = (AnyModal) withGeneratedBindingsBind21;
            if (anyModal == null) {
                anyModal = modal;
            }
            objOverlayContentPathBindings11 = anyModal;
        }
        String strResolveContentBindingKey11 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "modal") : null;
        if (strResolveContentBindingKey11 != null) {
            Object objResolveStateRef11 = StateLookupKt.resolveStateRef(strResolveContentBindingKey11, accumulatedState);
            if (objResolveStateRef11 != null) {
                BindingLoggerKt.logContentBinding("modal", strResolveContentBindingKey11, objResolveStateRef11);
                Object objUnwrapForCoercion11 = BindCoercionKt.unwrapForCoercion(objResolveStateRef11);
                if ((objUnwrapForCoercion11 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion11) && AbstractC22676k.m65745e(accumulatedState.get(obj44), Boolean.TRUE)) {
                    objOverlayContentPathBindings11 = null;
                } else {
                    objOverlayContentPathBindings11 = BindCoercionKt.unwrapForCoercion(objResolveStateRef11);
                    if (objOverlayContentPathBindings11 == null) {
                        objOverlayContentPathBindings11 = null;
                    } else if (objOverlayContentPathBindings11 instanceof JsonElement) {
                        JsonElement jsonElement9 = (JsonElement) objOverlayContentPathBindings11;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings11 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AnyModal.INSTANCE.serializer(), jsonElement9);
                        } catch (Exception unused21) {
                            objOverlayContentPathBindings11 = null;
                        }
                    } else if (!(objOverlayContentPathBindings11 instanceof AnyModal)) {
                        if (objOverlayContentPathBindings11 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a11 = AbstractC22671h0.m65688a(AnyModal.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings11 = (AnyModal) Integer.valueOf(((Number) objOverlayContentPathBindings11).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings11 = (AnyModal) Long.valueOf(((Number) objOverlayContentPathBindings11).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings11 = (AnyModal) Double.valueOf(((Number) objOverlayContentPathBindings11).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings11 = (AnyModal) Float.valueOf(((Number) objOverlayContentPathBindings11).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings11 = (AnyModal) Short.valueOf(((Number) objOverlayContentPathBindings11).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a11, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings11 = (AnyModal) Byte.valueOf(((Number) objOverlayContentPathBindings11).byteValue());
                            } else {
                                objOverlayContentPathBindings11 = null;
                            }
                        } else if (objOverlayContentPathBindings11 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c9 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings11);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings11 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AnyModal.INSTANCE.serializer(), jsonPrimitiveM1841c9);
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
                        objOverlayContentPathBindings11 = modal;
                    }
                }
            }
        } else if (objOverlayContentPathBindings11 != null) {
            objOverlayContentPathBindings11 = ContentPathBindingsKt.overlayContentPathBindings(map, "modal", accumulatedState, objOverlayContentPathBindings11, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$51
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj45) {
                    return invoke((AnyModal) obj45);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(AnyModal v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(AnyModal.INSTANCE.serializer(), v13);
                    } catch (Exception unused23) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$52
                /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.modal.AnyModal, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final AnyModal invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AnyModal.INSTANCE.serializer(), json);
                    } catch (Exception unused23) {
                        return null;
                    }
                }
            });
        }
        AnyModal anyModal2 = (AnyModal) DotPathBindingsKt.overlayAggregateBinding(map2, "modal", accumulatedState, objOverlayContentPathBindings11, "modal", new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$53
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj45) {
                return invoke((AnyModal) obj45);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(AnyModal anyModal3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(AnyModal.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, anyModal3, interfaceC37138cM122336d);
                } catch (Exception unused23) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$54
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.modal.AnyModal, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final AnyModal invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(AnyModal.INSTANCE.serializer(), json);
                } catch (Exception unused23) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$55
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.modal.AnyModal, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.modal.AnyModal, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final AnyModal invoke(Object obj45) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj45);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement10 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AnyModal.INSTANCE.serializer(), jsonElement10);
                    } catch (Exception unused23) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof AnyModal) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c10 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(AnyModal.INSTANCE.serializer(), jsonPrimitiveM1841c10);
                    } catch (Exception unused24) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(AnyModal.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (AnyModal) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (AnyModal) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (AnyModal) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (AnyModal) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (AnyModal) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (AnyModal) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        Object size = cardButtonModel.getSize();
        if (size == null) {
            objOverlayContentPathBindings12 = null;
        } else {
            if (size instanceof WithGeneratedBindings) {
                Object objBind10 = ((WithGeneratedBindings) size).bind(accumulatedState);
                if (!(objBind10 instanceof String)) {
                    objBind10 = null;
                }
                obj18 = (String) objBind10;
                if (obj18 == null) {
                    obj18 = size;
                }
            } else if (size instanceof List) {
                Iterable iterable11 = (Iterable) size;
                ArrayList arrayList11 = new ArrayList(AbstractC25267u.m74163i0(iterable11, 10));
                for (Object obj45 : iterable11) {
                    WithGeneratedBindings withGeneratedBindings11 = obj45 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj45 : null;
                    if (withGeneratedBindings11 != null && (withGeneratedBindingsBind11 = withGeneratedBindings11.bind(accumulatedState)) != null) {
                        obj45 = withGeneratedBindingsBind11;
                    }
                    arrayList11.add(obj45);
                }
                obj18 = (String) arrayList11;
            } else {
                obj18 = size;
            }
            objOverlayContentPathBindings12 = obj18;
        }
        String strResolveContentBindingKey12 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "size") : null;
        if (strResolveContentBindingKey12 != null) {
            Object objResolveStateRef12 = StateLookupKt.resolveStateRef(strResolveContentBindingKey12, accumulatedState);
            if (objResolveStateRef12 != null) {
                BindingLoggerKt.logContentBinding("size", strResolveContentBindingKey12, objResolveStateRef12);
                Object objUnwrapForCoercion12 = BindCoercionKt.unwrapForCoercion(objResolveStateRef12);
                if ((objUnwrapForCoercion12 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion12) && AbstractC22676k.m65745e(accumulatedState.get(obj44), Boolean.TRUE)) {
                    objOverlayContentPathBindings12 = null;
                } else {
                    objOverlayContentPathBindings12 = BindCoercionKt.unwrapForCoercion(objResolveStateRef12);
                    if (objOverlayContentPathBindings12 == null) {
                        objOverlayContentPathBindings12 = null;
                    } else if (objOverlayContentPathBindings12 instanceof JsonElement) {
                        JsonElement jsonElement10 = (JsonElement) objOverlayContentPathBindings12;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings12 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement10);
                        } catch (Exception unused23) {
                            objOverlayContentPathBindings12 = null;
                        }
                    } else {
                        boolean z19 = objOverlayContentPathBindings12 instanceof String;
                        if (!z19) {
                            if (objOverlayContentPathBindings12 instanceof Number) {
                                InterfaceC21461d interfaceC21461dM65688a12 = AbstractC22671h0.m65688a(String.class);
                                if (AbstractC22676k.m65745e(interfaceC21461dM65688a12, AbstractC22671h0.m65688a(cls6))) {
                                    objOverlayContentPathBindings12 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings12).intValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a12, AbstractC22671h0.m65688a(cls5))) {
                                    objOverlayContentPathBindings12 = (String) Long.valueOf(((Number) objOverlayContentPathBindings12).longValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a12, AbstractC22671h0.m65688a(cls4))) {
                                    objOverlayContentPathBindings12 = (String) Double.valueOf(((Number) objOverlayContentPathBindings12).doubleValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a12, AbstractC22671h0.m65688a(cls3))) {
                                    objOverlayContentPathBindings12 = (String) Float.valueOf(((Number) objOverlayContentPathBindings12).floatValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a12, AbstractC22671h0.m65688a(cls2))) {
                                    objOverlayContentPathBindings12 = (String) Short.valueOf(((Number) objOverlayContentPathBindings12).shortValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a12, AbstractC22671h0.m65688a(cls))) {
                                    objOverlayContentPathBindings12 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings12).byteValue());
                                } else {
                                    objOverlayContentPathBindings12 = null;
                                }
                            } else if (z19) {
                                JsonPrimitive jsonPrimitiveM1841c10 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings12);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objOverlayContentPathBindings12 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c10);
                                } catch (Exception unused24) {
                                    objOverlayContentPathBindings12 = null;
                                }
                                if (objOverlayContentPathBindings12 == null) {
                                    objOverlayContentPathBindings12 = null;
                                }
                            } else {
                                objOverlayContentPathBindings12 = null;
                            }
                        }
                    }
                    if (objOverlayContentPathBindings12 == null) {
                        objOverlayContentPathBindings12 = size;
                    }
                }
            }
        } else if (objOverlayContentPathBindings12 != null) {
            objOverlayContentPathBindings12 = ContentPathBindingsKt.overlayContentPathBindings(map, "size", accumulatedState, objOverlayContentPathBindings12, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$56
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj46) {
                    return invoke((String) obj46);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(String v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(StringSerializer.INSTANCE, v13);
                    } catch (Exception unused25) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$57
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
                @Override // p715kotlin.jvm.functions.Function1
                public final String invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                    } catch (Exception unused25) {
                        return null;
                    }
                }
            });
        }
        String str7 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "size", accumulatedState, objOverlayContentPathBindings12, "size", new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$58
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj46) {
                return invoke((String) obj46);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str8) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str8, interfaceC37138cM122336d);
                } catch (Exception unused25) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$59
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                } catch (Exception unused25) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$60
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj46) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj46);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement11 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement11);
                    } catch (Exception unused25) {
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
                    JsonPrimitive jsonPrimitiveM1841c11 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c11);
                    } catch (Exception unused26) {
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
        Object textStyle = cardButtonModel.getTextStyle();
        if (textStyle == null) {
            objOverlayContentPathBindings13 = null;
        } else {
            if (textStyle instanceof WithGeneratedBindings) {
                Object objBind11 = ((WithGeneratedBindings) textStyle).bind(accumulatedState);
                if (!(objBind11 instanceof String)) {
                    objBind11 = null;
                }
                obj19 = (String) objBind11;
                if (obj19 == null) {
                    obj19 = textStyle;
                }
            } else if (textStyle instanceof List) {
                Iterable iterable12 = (Iterable) textStyle;
                ArrayList arrayList12 = new ArrayList(AbstractC25267u.m74163i0(iterable12, 10));
                for (Object obj46 : iterable12) {
                    WithGeneratedBindings withGeneratedBindings12 = obj46 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj46 : null;
                    if (withGeneratedBindings12 != null && (withGeneratedBindingsBind12 = withGeneratedBindings12.bind(accumulatedState)) != null) {
                        obj46 = withGeneratedBindingsBind12;
                    }
                    arrayList12.add(obj46);
                }
                obj19 = (String) arrayList12;
            } else {
                obj19 = textStyle;
            }
            objOverlayContentPathBindings13 = obj19;
        }
        String strResolveContentBindingKey13 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "textStyle") : null;
        if (strResolveContentBindingKey13 != null) {
            Object objResolveStateRef13 = StateLookupKt.resolveStateRef(strResolveContentBindingKey13, accumulatedState);
            if (objResolveStateRef13 != null) {
                BindingLoggerKt.logContentBinding("textStyle", strResolveContentBindingKey13, objResolveStateRef13);
                Object objUnwrapForCoercion13 = BindCoercionKt.unwrapForCoercion(objResolveStateRef13);
                if ((objUnwrapForCoercion13 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion13) && AbstractC22676k.m65745e(accumulatedState.get(obj44), Boolean.TRUE)) {
                    objOverlayContentPathBindings13 = null;
                } else {
                    objOverlayContentPathBindings13 = BindCoercionKt.unwrapForCoercion(objResolveStateRef13);
                    if (objOverlayContentPathBindings13 == null) {
                        objOverlayContentPathBindings13 = null;
                    } else if (objOverlayContentPathBindings13 instanceof JsonElement) {
                        JsonElement jsonElement11 = (JsonElement) objOverlayContentPathBindings13;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings13 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement11);
                        } catch (Exception unused25) {
                            objOverlayContentPathBindings13 = null;
                        }
                    } else {
                        boolean z24 = objOverlayContentPathBindings13 instanceof String;
                        if (!z24) {
                            if (objOverlayContentPathBindings13 instanceof Number) {
                                InterfaceC21461d interfaceC21461dM65688a13 = AbstractC22671h0.m65688a(String.class);
                                if (AbstractC22676k.m65745e(interfaceC21461dM65688a13, AbstractC22671h0.m65688a(cls6))) {
                                    objOverlayContentPathBindings13 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings13).intValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a13, AbstractC22671h0.m65688a(cls5))) {
                                    objOverlayContentPathBindings13 = (String) Long.valueOf(((Number) objOverlayContentPathBindings13).longValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a13, AbstractC22671h0.m65688a(cls4))) {
                                    objOverlayContentPathBindings13 = (String) Double.valueOf(((Number) objOverlayContentPathBindings13).doubleValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a13, AbstractC22671h0.m65688a(cls3))) {
                                    objOverlayContentPathBindings13 = (String) Float.valueOf(((Number) objOverlayContentPathBindings13).floatValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a13, AbstractC22671h0.m65688a(cls2))) {
                                    objOverlayContentPathBindings13 = (String) Short.valueOf(((Number) objOverlayContentPathBindings13).shortValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a13, AbstractC22671h0.m65688a(cls))) {
                                    objOverlayContentPathBindings13 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings13).byteValue());
                                } else {
                                    objOverlayContentPathBindings13 = null;
                                }
                            } else if (z24) {
                                JsonPrimitive jsonPrimitiveM1841c11 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings13);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objOverlayContentPathBindings13 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c11);
                                } catch (Exception unused26) {
                                    objOverlayContentPathBindings13 = null;
                                }
                                if (objOverlayContentPathBindings13 == null) {
                                    objOverlayContentPathBindings13 = null;
                                }
                            } else {
                                objOverlayContentPathBindings13 = null;
                            }
                        }
                    }
                    if (objOverlayContentPathBindings13 == null) {
                        objOverlayContentPathBindings13 = textStyle;
                    }
                }
            }
        } else if (objOverlayContentPathBindings13 != null) {
            objOverlayContentPathBindings13 = ContentPathBindingsKt.overlayContentPathBindings(map, "textStyle", accumulatedState, objOverlayContentPathBindings13, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$61
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj47) {
                    return invoke((String) obj47);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(String v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(StringSerializer.INSTANCE, v13);
                    } catch (Exception unused27) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$62
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
                @Override // p715kotlin.jvm.functions.Function1
                public final String invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                    } catch (Exception unused27) {
                        return null;
                    }
                }
            });
        }
        String str8 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "textStyle", accumulatedState, objOverlayContentPathBindings13, "textStyle", new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$63
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj47) {
                return invoke((String) obj47);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str9) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str9, interfaceC37138cM122336d);
                } catch (Exception unused27) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$64
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                } catch (Exception unused27) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$65
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj47) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj47);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement12 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement12);
                    } catch (Exception unused27) {
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
                    JsonPrimitive jsonPrimitiveM1841c12 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c12);
                    } catch (Exception unused28) {
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
        Object cornerRadius = cardButtonModel.getCornerRadius();
        if (cornerRadius == null) {
            objOverlayContentPathBindings14 = null;
        } else {
            if (cornerRadius instanceof WithGeneratedBindings) {
                Object objBind12 = ((WithGeneratedBindings) cornerRadius).bind(accumulatedState);
                if (!(objBind12 instanceof String)) {
                    objBind12 = null;
                }
                obj20 = (String) objBind12;
                if (obj20 == null) {
                    obj20 = cornerRadius;
                }
            } else if (cornerRadius instanceof List) {
                Iterable iterable13 = (Iterable) cornerRadius;
                ArrayList arrayList13 = new ArrayList(AbstractC25267u.m74163i0(iterable13, 10));
                for (Object obj47 : iterable13) {
                    WithGeneratedBindings withGeneratedBindings13 = obj47 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj47 : null;
                    if (withGeneratedBindings13 != null && (withGeneratedBindingsBind13 = withGeneratedBindings13.bind(accumulatedState)) != null) {
                        obj47 = withGeneratedBindingsBind13;
                    }
                    arrayList13.add(obj47);
                }
                obj20 = (String) arrayList13;
            } else {
                obj20 = cornerRadius;
            }
            objOverlayContentPathBindings14 = obj20;
        }
        String strResolveContentBindingKey14 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "cornerRadius") : null;
        if (strResolveContentBindingKey14 != null) {
            Object objResolveStateRef14 = StateLookupKt.resolveStateRef(strResolveContentBindingKey14, accumulatedState);
            if (objResolveStateRef14 != null) {
                BindingLoggerKt.logContentBinding("cornerRadius", strResolveContentBindingKey14, objResolveStateRef14);
                Object objUnwrapForCoercion14 = BindCoercionKt.unwrapForCoercion(objResolveStateRef14);
                if ((objUnwrapForCoercion14 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion14) && AbstractC22676k.m65745e(accumulatedState.get(obj44), Boolean.TRUE)) {
                    objOverlayContentPathBindings14 = null;
                } else {
                    objOverlayContentPathBindings14 = BindCoercionKt.unwrapForCoercion(objResolveStateRef14);
                    if (objOverlayContentPathBindings14 == null) {
                        objOverlayContentPathBindings14 = null;
                    } else if (objOverlayContentPathBindings14 instanceof JsonElement) {
                        JsonElement jsonElement12 = (JsonElement) objOverlayContentPathBindings14;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings14 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement12);
                        } catch (Exception unused27) {
                            objOverlayContentPathBindings14 = null;
                        }
                    } else {
                        boolean z25 = objOverlayContentPathBindings14 instanceof String;
                        if (!z25) {
                            if (objOverlayContentPathBindings14 instanceof Number) {
                                InterfaceC21461d interfaceC21461dM65688a14 = AbstractC22671h0.m65688a(String.class);
                                if (AbstractC22676k.m65745e(interfaceC21461dM65688a14, AbstractC22671h0.m65688a(cls6))) {
                                    objOverlayContentPathBindings14 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings14).intValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a14, AbstractC22671h0.m65688a(cls5))) {
                                    objOverlayContentPathBindings14 = (String) Long.valueOf(((Number) objOverlayContentPathBindings14).longValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a14, AbstractC22671h0.m65688a(cls4))) {
                                    objOverlayContentPathBindings14 = (String) Double.valueOf(((Number) objOverlayContentPathBindings14).doubleValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a14, AbstractC22671h0.m65688a(cls3))) {
                                    objOverlayContentPathBindings14 = (String) Float.valueOf(((Number) objOverlayContentPathBindings14).floatValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a14, AbstractC22671h0.m65688a(cls2))) {
                                    objOverlayContentPathBindings14 = (String) Short.valueOf(((Number) objOverlayContentPathBindings14).shortValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a14, AbstractC22671h0.m65688a(cls))) {
                                    objOverlayContentPathBindings14 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings14).byteValue());
                                } else {
                                    objOverlayContentPathBindings14 = null;
                                }
                            } else if (z25) {
                                JsonPrimitive jsonPrimitiveM1841c12 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings14);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objOverlayContentPathBindings14 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c12);
                                } catch (Exception unused28) {
                                    objOverlayContentPathBindings14 = null;
                                }
                                if (objOverlayContentPathBindings14 == null) {
                                    objOverlayContentPathBindings14 = null;
                                }
                            } else {
                                objOverlayContentPathBindings14 = null;
                            }
                        }
                    }
                    if (objOverlayContentPathBindings14 == null) {
                        objOverlayContentPathBindings14 = cornerRadius;
                    }
                }
            }
        } else if (objOverlayContentPathBindings14 != null) {
            objOverlayContentPathBindings14 = ContentPathBindingsKt.overlayContentPathBindings(map, "cornerRadius", accumulatedState, objOverlayContentPathBindings14, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$66
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj48) {
                    return invoke((String) obj48);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(String v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(StringSerializer.INSTANCE, v13);
                    } catch (Exception unused29) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$67
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
                @Override // p715kotlin.jvm.functions.Function1
                public final String invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                    } catch (Exception unused29) {
                        return null;
                    }
                }
            });
        }
        String str9 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "cornerRadius", accumulatedState, objOverlayContentPathBindings14, "cornerRadius", new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$68
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj48) {
                return invoke((String) obj48);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str10) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str10, interfaceC37138cM122336d);
                } catch (Exception unused29) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$69
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                } catch (Exception unused29) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$70
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj48) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj48);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement13 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement13);
                    } catch (Exception unused29) {
                        return null;
                    }
                }
                boolean z26 = UnwrapForCoercion instanceof String;
                if (z26) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!z26) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c13 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c13);
                    } catch (Exception unused30) {
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
        Object iconConfiguration = cardButtonModel.getIconConfiguration();
        if (iconConfiguration == null) {
            objOverlayContentPathBindings15 = null;
        } else {
            if (iconConfiguration instanceof WithGeneratedBindings) {
                Object objBind13 = ((WithGeneratedBindings) iconConfiguration).bind(accumulatedState);
                if (!(objBind13 instanceof String)) {
                    objBind13 = null;
                }
                obj21 = (String) objBind13;
                if (obj21 == null) {
                    obj21 = iconConfiguration;
                }
            } else if (iconConfiguration instanceof List) {
                Iterable iterable14 = (Iterable) iconConfiguration;
                ArrayList arrayList14 = new ArrayList(AbstractC25267u.m74163i0(iterable14, 10));
                for (Object obj48 : iterable14) {
                    WithGeneratedBindings withGeneratedBindings14 = obj48 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj48 : null;
                    if (withGeneratedBindings14 != null && (withGeneratedBindingsBind14 = withGeneratedBindings14.bind(accumulatedState)) != null) {
                        obj48 = withGeneratedBindingsBind14;
                    }
                    arrayList14.add(obj48);
                }
                obj21 = (String) arrayList14;
            } else {
                obj21 = iconConfiguration;
            }
            objOverlayContentPathBindings15 = obj21;
        }
        String strResolveContentBindingKey15 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "iconConfiguration") : null;
        if (strResolveContentBindingKey15 != null) {
            Object objResolveStateRef15 = StateLookupKt.resolveStateRef(strResolveContentBindingKey15, accumulatedState);
            if (objResolveStateRef15 != null) {
                BindingLoggerKt.logContentBinding("iconConfiguration", strResolveContentBindingKey15, objResolveStateRef15);
                Object objUnwrapForCoercion15 = BindCoercionKt.unwrapForCoercion(objResolveStateRef15);
                if ((objUnwrapForCoercion15 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion15) && AbstractC22676k.m65745e(accumulatedState.get(obj44), Boolean.TRUE)) {
                    objOverlayContentPathBindings15 = null;
                } else {
                    objOverlayContentPathBindings15 = BindCoercionKt.unwrapForCoercion(objResolveStateRef15);
                    if (objOverlayContentPathBindings15 == null) {
                        objOverlayContentPathBindings15 = null;
                    } else if (objOverlayContentPathBindings15 instanceof JsonElement) {
                        JsonElement jsonElement13 = (JsonElement) objOverlayContentPathBindings15;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings15 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement13);
                        } catch (Exception unused29) {
                            objOverlayContentPathBindings15 = null;
                        }
                    } else {
                        boolean z26 = objOverlayContentPathBindings15 instanceof String;
                        if (!z26) {
                            if (objOverlayContentPathBindings15 instanceof Number) {
                                InterfaceC21461d interfaceC21461dM65688a15 = AbstractC22671h0.m65688a(String.class);
                                if (AbstractC22676k.m65745e(interfaceC21461dM65688a15, AbstractC22671h0.m65688a(cls6))) {
                                    objOverlayContentPathBindings15 = (String) Integer.valueOf(((Number) objOverlayContentPathBindings15).intValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a15, AbstractC22671h0.m65688a(cls5))) {
                                    objOverlayContentPathBindings15 = (String) Long.valueOf(((Number) objOverlayContentPathBindings15).longValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a15, AbstractC22671h0.m65688a(cls4))) {
                                    objOverlayContentPathBindings15 = (String) Double.valueOf(((Number) objOverlayContentPathBindings15).doubleValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a15, AbstractC22671h0.m65688a(cls3))) {
                                    objOverlayContentPathBindings15 = (String) Float.valueOf(((Number) objOverlayContentPathBindings15).floatValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a15, AbstractC22671h0.m65688a(cls2))) {
                                    objOverlayContentPathBindings15 = (String) Short.valueOf(((Number) objOverlayContentPathBindings15).shortValue());
                                } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a15, AbstractC22671h0.m65688a(cls))) {
                                    objOverlayContentPathBindings15 = (String) Byte.valueOf(((Number) objOverlayContentPathBindings15).byteValue());
                                } else {
                                    objOverlayContentPathBindings15 = null;
                                }
                            } else if (z26) {
                                JsonPrimitive jsonPrimitiveM1841c13 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings15);
                                try {
                                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                                    objOverlayContentPathBindings15 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c13);
                                } catch (Exception unused30) {
                                    objOverlayContentPathBindings15 = null;
                                }
                                if (objOverlayContentPathBindings15 == null) {
                                    objOverlayContentPathBindings15 = null;
                                }
                            } else {
                                objOverlayContentPathBindings15 = null;
                            }
                        }
                    }
                    if (objOverlayContentPathBindings15 == null) {
                        objOverlayContentPathBindings15 = iconConfiguration;
                    }
                }
            }
        } else if (objOverlayContentPathBindings15 != null) {
            objOverlayContentPathBindings15 = ContentPathBindingsKt.overlayContentPathBindings(map, "iconConfiguration", accumulatedState, objOverlayContentPathBindings15, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$71
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj49) {
                    return invoke((String) obj49);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(String v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(StringSerializer.INSTANCE, v13);
                    } catch (Exception unused31) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$72
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
                @Override // p715kotlin.jvm.functions.Function1
                public final String invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                    } catch (Exception unused31) {
                        return null;
                    }
                }
            });
        }
        String str10 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "iconConfiguration", accumulatedState, objOverlayContentPathBindings15, "iconConfiguration", new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$73
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj49) {
                return invoke((String) obj49);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str11) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str11, interfaceC37138cM122336d);
                } catch (Exception unused31) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$74
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, json);
                } catch (Exception unused31) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$75
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj49) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj49);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement14 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement14);
                    } catch (Exception unused31) {
                        return null;
                    }
                }
                boolean z27 = UnwrapForCoercion instanceof String;
                if (z27) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!z27) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c14 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c14);
                    } catch (Exception unused32) {
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
        Object dismissEvent = cardButtonModel.getDismissEvent();
        if (dismissEvent == null) {
            objOverlayContentPathBindings16 = null;
        } else {
            if (dismissEvent instanceof WithGeneratedBindings) {
                Object objBind14 = ((WithGeneratedBindings) dismissEvent).bind(accumulatedState);
                if (!(objBind14 instanceof DismissEventModel)) {
                    objBind14 = null;
                }
                obj22 = (DismissEventModel) objBind14;
                if (obj22 == null) {
                    obj22 = dismissEvent;
                }
            } else if (dismissEvent instanceof List) {
                Iterable iterable15 = (Iterable) dismissEvent;
                ArrayList arrayList15 = new ArrayList(AbstractC25267u.m74163i0(iterable15, 10));
                for (Object obj49 : iterable15) {
                    WithGeneratedBindings withGeneratedBindings15 = obj49 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj49 : null;
                    if (withGeneratedBindings15 != null && (withGeneratedBindingsBind15 = withGeneratedBindings15.bind(accumulatedState)) != null) {
                        obj49 = withGeneratedBindingsBind15;
                    }
                    arrayList15.add(obj49);
                }
                obj22 = (DismissEventModel) arrayList15;
            } else {
                obj22 = dismissEvent;
            }
            objOverlayContentPathBindings16 = obj22;
        }
        String strResolveContentBindingKey16 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "dismiss_event") : null;
        if (strResolveContentBindingKey16 != null) {
            Object objResolveStateRef16 = StateLookupKt.resolveStateRef(strResolveContentBindingKey16, accumulatedState);
            if (objResolveStateRef16 != null) {
                BindingLoggerKt.logContentBinding("dismiss_event", strResolveContentBindingKey16, objResolveStateRef16);
                Object objUnwrapForCoercion16 = BindCoercionKt.unwrapForCoercion(objResolveStateRef16);
                if ((objUnwrapForCoercion16 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion16) && AbstractC22676k.m65745e(accumulatedState.get(obj44), Boolean.TRUE)) {
                    objOverlayContentPathBindings16 = null;
                } else {
                    objOverlayContentPathBindings16 = BindCoercionKt.unwrapForCoercion(objResolveStateRef16);
                    if (objOverlayContentPathBindings16 == null) {
                        objOverlayContentPathBindings16 = null;
                    } else if (objOverlayContentPathBindings16 instanceof JsonElement) {
                        JsonElement jsonElement14 = (JsonElement) objOverlayContentPathBindings16;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings16 = StateBindingDeserializerKt.getStateBindingJson().m1830a(DismissEventModel.INSTANCE.serializer(), jsonElement14);
                        } catch (Exception unused31) {
                            objOverlayContentPathBindings16 = null;
                        }
                    } else if (!(objOverlayContentPathBindings16 instanceof DismissEventModel)) {
                        if (objOverlayContentPathBindings16 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a16 = AbstractC22671h0.m65688a(DismissEventModel.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a16, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings16 = (DismissEventModel) Integer.valueOf(((Number) objOverlayContentPathBindings16).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a16, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings16 = (DismissEventModel) Long.valueOf(((Number) objOverlayContentPathBindings16).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a16, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings16 = (DismissEventModel) Double.valueOf(((Number) objOverlayContentPathBindings16).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a16, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings16 = (DismissEventModel) Float.valueOf(((Number) objOverlayContentPathBindings16).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a16, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings16 = (DismissEventModel) Short.valueOf(((Number) objOverlayContentPathBindings16).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a16, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings16 = (DismissEventModel) Byte.valueOf(((Number) objOverlayContentPathBindings16).byteValue());
                            } else {
                                objOverlayContentPathBindings16 = null;
                            }
                        } else if (objOverlayContentPathBindings16 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c14 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings16);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings16 = StateBindingDeserializerKt.getStateBindingJson().m1830a(DismissEventModel.INSTANCE.serializer(), jsonPrimitiveM1841c14);
                            } catch (Exception unused32) {
                                objOverlayContentPathBindings16 = null;
                            }
                            if (objOverlayContentPathBindings16 == null) {
                                objOverlayContentPathBindings16 = null;
                            }
                        } else {
                            objOverlayContentPathBindings16 = null;
                        }
                    }
                    if (objOverlayContentPathBindings16 == null) {
                        objOverlayContentPathBindings16 = dismissEvent;
                    }
                }
            }
        } else if (objOverlayContentPathBindings16 != null) {
            objOverlayContentPathBindings16 = ContentPathBindingsKt.overlayContentPathBindings(map, "dismiss_event", accumulatedState, objOverlayContentPathBindings16, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$76
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj50) {
                    return invoke((DismissEventModel) obj50);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(DismissEventModel v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(DismissEventModel.INSTANCE.serializer(), v13);
                    } catch (Exception unused33) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$77
                /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.navigation.DismissEventModel, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final DismissEventModel invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(DismissEventModel.INSTANCE.serializer(), json);
                    } catch (Exception unused33) {
                        return null;
                    }
                }
            });
        }
        DismissEventModel dismissEventModel = (DismissEventModel) DotPathBindingsKt.overlayAggregateBinding(map2, "dismiss_event", accumulatedState, objOverlayContentPathBindings16, "dismiss_event", new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$78
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj50) {
                return invoke((DismissEventModel) obj50);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(DismissEventModel dismissEventModel2) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(DismissEventModel.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, dismissEventModel2, interfaceC37138cM122336d);
                } catch (Exception unused33) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$79
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.navigation.DismissEventModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final DismissEventModel invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(DismissEventModel.INSTANCE.serializer(), json);
                } catch (Exception unused33) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$80
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.navigation.DismissEventModel, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.navigation.DismissEventModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final DismissEventModel invoke(Object obj50) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj50);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement15 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(DismissEventModel.INSTANCE.serializer(), jsonElement15);
                    } catch (Exception unused33) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof DismissEventModel) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c15 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(DismissEventModel.INSTANCE.serializer(), jsonPrimitiveM1841c15);
                    } catch (Exception unused34) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(DismissEventModel.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (DismissEventModel) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (DismissEventModel) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (DismissEventModel) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (DismissEventModel) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (DismissEventModel) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (DismissEventModel) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        Object objIsEnabled = cardButtonModel.isEnabled();
        if (objIsEnabled == null) {
            objOverlayContentPathBindings17 = null;
        } else {
            if (objIsEnabled instanceof WithGeneratedBindings) {
                Object objBind15 = ((WithGeneratedBindings) objIsEnabled).bind(accumulatedState);
                if (!(objBind15 instanceof Boolean)) {
                    objBind15 = null;
                }
                obj23 = (Boolean) objBind15;
                if (obj23 == null) {
                    obj23 = objIsEnabled;
                }
            } else if (objIsEnabled instanceof List) {
                Iterable iterable16 = (Iterable) objIsEnabled;
                ArrayList arrayList16 = new ArrayList(AbstractC25267u.m74163i0(iterable16, 10));
                for (Object obj50 : iterable16) {
                    WithGeneratedBindings withGeneratedBindings16 = obj50 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj50 : null;
                    if (withGeneratedBindings16 != null && (withGeneratedBindingsBind16 = withGeneratedBindings16.bind(accumulatedState)) != null) {
                        obj50 = withGeneratedBindingsBind16;
                    }
                    arrayList16.add(obj50);
                }
                obj23 = (Boolean) arrayList16;
            } else {
                obj23 = objIsEnabled;
            }
            objOverlayContentPathBindings17 = obj23;
        }
        String strResolveContentBindingKey17 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "is_enabled") : null;
        if (strResolveContentBindingKey17 != null) {
            Object objResolveStateRef17 = StateLookupKt.resolveStateRef(strResolveContentBindingKey17, accumulatedState);
            if (objResolveStateRef17 != null) {
                BindingLoggerKt.logContentBinding("is_enabled", strResolveContentBindingKey17, objResolveStateRef17);
                Object objUnwrapForCoercion17 = BindCoercionKt.unwrapForCoercion(objResolveStateRef17);
                if ((objUnwrapForCoercion17 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion17) && AbstractC22676k.m65745e(accumulatedState.get(obj44), Boolean.TRUE)) {
                    objOverlayContentPathBindings17 = null;
                } else {
                    objOverlayContentPathBindings17 = BindCoercionKt.unwrapForCoercion(objResolveStateRef17);
                    if (objOverlayContentPathBindings17 == null) {
                        objOverlayContentPathBindings17 = null;
                    } else if (objOverlayContentPathBindings17 instanceof JsonElement) {
                        JsonElement jsonElement15 = (JsonElement) objOverlayContentPathBindings17;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings17 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement15);
                        } catch (Exception unused33) {
                            objOverlayContentPathBindings17 = null;
                        }
                    } else if (!(objOverlayContentPathBindings17 instanceof Boolean)) {
                        if (objOverlayContentPathBindings17 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a17 = AbstractC22671h0.m65688a(Boolean.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a17, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings17 = (Boolean) Integer.valueOf(((Number) objOverlayContentPathBindings17).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a17, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings17 = (Boolean) Long.valueOf(((Number) objOverlayContentPathBindings17).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a17, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings17 = (Boolean) Double.valueOf(((Number) objOverlayContentPathBindings17).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a17, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings17 = (Boolean) Float.valueOf(((Number) objOverlayContentPathBindings17).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a17, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings17 = (Boolean) Short.valueOf(((Number) objOverlayContentPathBindings17).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a17, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings17 = (Boolean) Byte.valueOf(((Number) objOverlayContentPathBindings17).byteValue());
                            } else {
                                objOverlayContentPathBindings17 = null;
                            }
                        } else if (objOverlayContentPathBindings17 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c15 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings17);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings17 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c15);
                            } catch (Exception unused34) {
                                objOverlayContentPathBindings17 = null;
                            }
                            if (objOverlayContentPathBindings17 == null) {
                                objOverlayContentPathBindings17 = null;
                            }
                        } else {
                            objOverlayContentPathBindings17 = null;
                        }
                    }
                    if (objOverlayContentPathBindings17 == null) {
                        objOverlayContentPathBindings17 = objIsEnabled;
                    }
                }
            }
        } else if (objOverlayContentPathBindings17 != null) {
            objOverlayContentPathBindings17 = ContentPathBindingsKt.overlayContentPathBindings(map, "is_enabled", accumulatedState, objOverlayContentPathBindings17, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$81
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj51) {
                    return invoke((Boolean) obj51);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Boolean v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(BooleanSerializer.INSTANCE, v13);
                    } catch (Exception unused35) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$82
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Boolean invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                    } catch (Exception unused35) {
                        return null;
                    }
                }
            });
        }
        Boolean bool = (Boolean) DotPathBindingsKt.overlayAggregateBinding(map2, "is_enabled", accumulatedState, objOverlayContentPathBindings17, "is_enabled", new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$83
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj51) {
                return invoke((Boolean) obj51);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Boolean bool2) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(BooleanSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, bool2, interfaceC37138cM122336d);
                } catch (Exception unused35) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$84
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Boolean invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                } catch (Exception unused35) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$85
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Boolean, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Boolean, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj51) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj51);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement16 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement16);
                    } catch (Exception unused35) {
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
                    JsonPrimitive jsonPrimitiveM1841c16 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c16);
                    } catch (Exception unused36) {
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
        Object genericInteraction = cardButtonModel.getGenericInteraction();
        if (genericInteraction == null) {
            objOverlayContentPathBindings18 = null;
        } else {
            if (genericInteraction instanceof WithGeneratedBindings) {
                Object objBind16 = ((WithGeneratedBindings) genericInteraction).bind(accumulatedState);
                if (!(objBind16 instanceof GenericInteraction)) {
                    objBind16 = null;
                }
                obj24 = (GenericInteraction) objBind16;
                if (obj24 == null) {
                    obj24 = genericInteraction;
                }
            } else if (genericInteraction instanceof List) {
                Iterable iterable17 = (Iterable) genericInteraction;
                ArrayList arrayList17 = new ArrayList(AbstractC25267u.m74163i0(iterable17, 10));
                for (Object obj51 : iterable17) {
                    WithGeneratedBindings withGeneratedBindings17 = obj51 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj51 : null;
                    if (withGeneratedBindings17 != null && (withGeneratedBindingsBind17 = withGeneratedBindings17.bind(accumulatedState)) != null) {
                        obj51 = withGeneratedBindingsBind17;
                    }
                    arrayList17.add(obj51);
                }
                obj24 = (GenericInteraction) arrayList17;
            } else {
                obj24 = genericInteraction;
            }
            objOverlayContentPathBindings18 = obj24;
        }
        String strResolveContentBindingKey18 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "genericInteraction") : null;
        if (strResolveContentBindingKey18 != null) {
            Object objResolveStateRef18 = StateLookupKt.resolveStateRef(strResolveContentBindingKey18, accumulatedState);
            if (objResolveStateRef18 != null) {
                BindingLoggerKt.logContentBinding("genericInteraction", strResolveContentBindingKey18, objResolveStateRef18);
                Object objUnwrapForCoercion18 = BindCoercionKt.unwrapForCoercion(objResolveStateRef18);
                if ((objUnwrapForCoercion18 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion18) && AbstractC22676k.m65745e(accumulatedState.get(obj44), Boolean.TRUE)) {
                    objOverlayContentPathBindings18 = null;
                } else {
                    objOverlayContentPathBindings18 = BindCoercionKt.unwrapForCoercion(objResolveStateRef18);
                    if (objOverlayContentPathBindings18 == null) {
                        objOverlayContentPathBindings18 = null;
                    } else if (objOverlayContentPathBindings18 instanceof JsonElement) {
                        JsonElement jsonElement16 = (JsonElement) objOverlayContentPathBindings18;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings18 = StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), jsonElement16);
                        } catch (Exception unused35) {
                            objOverlayContentPathBindings18 = null;
                        }
                    } else if (!(objOverlayContentPathBindings18 instanceof GenericInteraction)) {
                        if (objOverlayContentPathBindings18 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a18 = AbstractC22671h0.m65688a(GenericInteraction.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a18, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings18 = (GenericInteraction) Integer.valueOf(((Number) objOverlayContentPathBindings18).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a18, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings18 = (GenericInteraction) Long.valueOf(((Number) objOverlayContentPathBindings18).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a18, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings18 = (GenericInteraction) Double.valueOf(((Number) objOverlayContentPathBindings18).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a18, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings18 = (GenericInteraction) Float.valueOf(((Number) objOverlayContentPathBindings18).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a18, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings18 = (GenericInteraction) Short.valueOf(((Number) objOverlayContentPathBindings18).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a18, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings18 = (GenericInteraction) Byte.valueOf(((Number) objOverlayContentPathBindings18).byteValue());
                            } else {
                                objOverlayContentPathBindings18 = null;
                            }
                        } else if (objOverlayContentPathBindings18 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c16 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings18);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings18 = StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), jsonPrimitiveM1841c16);
                            } catch (Exception unused36) {
                                objOverlayContentPathBindings18 = null;
                            }
                            if (objOverlayContentPathBindings18 == null) {
                                objOverlayContentPathBindings18 = null;
                            }
                        } else {
                            objOverlayContentPathBindings18 = null;
                        }
                    }
                    if (objOverlayContentPathBindings18 == null) {
                        objOverlayContentPathBindings18 = genericInteraction;
                    }
                }
            }
        } else if (objOverlayContentPathBindings18 != null) {
            objOverlayContentPathBindings18 = ContentPathBindingsKt.overlayContentPathBindings(map, "genericInteraction", accumulatedState, objOverlayContentPathBindings18, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$86
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj52) {
                    return invoke((GenericInteraction) obj52);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(GenericInteraction v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(GenericInteraction.INSTANCE.serializer(), v13);
                    } catch (Exception unused37) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$87
                /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.navigation.models.GenericInteraction, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final GenericInteraction invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), json);
                    } catch (Exception unused37) {
                        return null;
                    }
                }
            });
        }
        GenericInteraction genericInteraction2 = (GenericInteraction) DotPathBindingsKt.overlayAggregateBinding(map2, "genericInteraction", accumulatedState, objOverlayContentPathBindings18, "genericInteraction", new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$88
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj52) {
                return invoke((GenericInteraction) obj52);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(GenericInteraction genericInteraction3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(GenericInteraction.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, genericInteraction3, interfaceC37138cM122336d);
                } catch (Exception unused37) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$89
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.navigation.models.GenericInteraction, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final GenericInteraction invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), json);
                } catch (Exception unused37) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$90
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.navigation.models.GenericInteraction, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.navigation.models.GenericInteraction, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final GenericInteraction invoke(Object obj52) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj52);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement17 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), jsonElement17);
                    } catch (Exception unused37) {
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
                    JsonPrimitive jsonPrimitiveM1841c17 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(GenericInteraction.INSTANCE.serializer(), jsonPrimitiveM1841c17);
                    } catch (Exception unused38) {
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
        Map<String, String> bindings = cardButtonModel.getBindings();
        if (bindings == null) {
            objOverlayContentPathBindings19 = null;
        } else {
            if (bindings instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind22 = ((WithGeneratedBindings) bindings).bind(accumulatedState);
                if (!(withGeneratedBindingsBind22 instanceof Map)) {
                    withGeneratedBindingsBind22 = null;
                }
                map3 = (Map) withGeneratedBindingsBind22;
                if (map3 == null) {
                    map3 = bindings;
                }
            } else if (bindings instanceof List) {
                Iterable iterable18 = (Iterable) bindings;
                List arrayList18 = new ArrayList(AbstractC25267u.m74163i0(iterable18, 10));
                for (Object obj52 : iterable18) {
                    WithGeneratedBindings withGeneratedBindings18 = obj52 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj52 : null;
                    if (withGeneratedBindings18 != null && (withGeneratedBindingsBind18 = withGeneratedBindings18.bind(accumulatedState)) != null) {
                        obj52 = withGeneratedBindingsBind18;
                    }
                    arrayList18.add(obj52);
                }
                map3 = (Map) arrayList18;
            } else {
                map3 = bindings;
            }
            objOverlayContentPathBindings19 = map3;
        }
        String strResolveContentBindingKey19 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "bindings") : null;
        if (strResolveContentBindingKey19 != null) {
            Object objResolveStateRef19 = StateLookupKt.resolveStateRef(strResolveContentBindingKey19, accumulatedState);
            if (objResolveStateRef19 != null) {
                BindingLoggerKt.logContentBinding("bindings", strResolveContentBindingKey19, objResolveStateRef19);
                Object objUnwrapForCoercion19 = BindCoercionKt.unwrapForCoercion(objResolveStateRef19);
                if ((objUnwrapForCoercion19 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion19) && AbstractC22676k.m65745e(accumulatedState.get(obj44), Boolean.TRUE)) {
                    objOverlayContentPathBindings19 = null;
                } else {
                    objOverlayContentPathBindings19 = BindCoercionKt.unwrapForCoercion(objResolveStateRef19);
                    if (objOverlayContentPathBindings19 == null) {
                        objOverlayContentPathBindings19 = null;
                    } else if (objOverlayContentPathBindings19 instanceof JsonElement) {
                        JsonElement jsonElement17 = (JsonElement) objOverlayContentPathBindings19;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer = StringSerializer.INSTANCE;
                            objOverlayContentPathBindings19 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer, stringSerializer), jsonElement17);
                        } catch (Exception unused37) {
                            objOverlayContentPathBindings19 = null;
                        }
                    } else if (!(objOverlayContentPathBindings19 instanceof Map)) {
                        if (objOverlayContentPathBindings19 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a19 = AbstractC22671h0.m65688a(Map.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a19, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings19 = (Map) Integer.valueOf(((Number) objOverlayContentPathBindings19).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a19, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings19 = (Map) Long.valueOf(((Number) objOverlayContentPathBindings19).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a19, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings19 = (Map) Double.valueOf(((Number) objOverlayContentPathBindings19).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a19, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings19 = (Map) Float.valueOf(((Number) objOverlayContentPathBindings19).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a19, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings19 = (Map) Short.valueOf(((Number) objOverlayContentPathBindings19).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a19, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings19 = (Map) Byte.valueOf(((Number) objOverlayContentPathBindings19).byteValue());
                            } else {
                                objOverlayContentPathBindings19 = null;
                            }
                        } else if (objOverlayContentPathBindings19 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c17 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings19);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                                objOverlayContentPathBindings19 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), jsonPrimitiveM1841c17);
                            } catch (Exception unused38) {
                                objOverlayContentPathBindings19 = null;
                            }
                            if (objOverlayContentPathBindings19 == null) {
                                objOverlayContentPathBindings19 = null;
                            }
                        } else {
                            objOverlayContentPathBindings19 = null;
                        }
                    }
                    if (objOverlayContentPathBindings19 == null) {
                        objOverlayContentPathBindings19 = bindings;
                    }
                }
            }
        } else if (objOverlayContentPathBindings19 != null) {
            objOverlayContentPathBindings19 = ContentPathBindingsKt.overlayContentPathBindings(map, "bindings", accumulatedState, objOverlayContentPathBindings19, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$91
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj53) {
                    return invoke((Map<String, ? extends String>) obj53);
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
                    } catch (Exception unused39) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$92
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Map<String, ? extends String> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), json);
                    } catch (Exception unused39) {
                        return null;
                    }
                }
            });
        }
        Map map5 = (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "bindings", accumulatedState, objOverlayContentPathBindings19, "bindings", new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$93
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj53) {
                return invoke((Map<String, ? extends String>) obj53);
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
                } catch (Exception unused39) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$94
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends String> invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), json);
                } catch (Exception unused39) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$95
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends java.lang.String>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends String> invoke(Object obj53) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj53);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement18 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), jsonElement18);
                    } catch (Exception unused39) {
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
                    JsonPrimitive jsonPrimitiveM1841c18 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer4 = StringSerializer.INSTANCE;
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer4, stringSerializer4), jsonPrimitiveM1841c18);
                    } catch (Exception unused40) {
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
        Map<String, AggregateBinding> aggregateBindings = cardButtonModel.getAggregateBindings();
        if (aggregateBindings == null) {
            obj25 = null;
        } else {
            if (aggregateBindings instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind23 = ((WithGeneratedBindings) aggregateBindings).bind(accumulatedState);
                if (!(withGeneratedBindingsBind23 instanceof Map)) {
                    withGeneratedBindingsBind23 = null;
                }
                map4 = (Map) withGeneratedBindingsBind23;
                if (map4 == null) {
                    map4 = aggregateBindings;
                }
            } else if (aggregateBindings instanceof List) {
                Iterable iterable19 = (Iterable) aggregateBindings;
                List arrayList19 = new ArrayList(AbstractC25267u.m74163i0(iterable19, 10));
                for (Object obj53 : iterable19) {
                    WithGeneratedBindings withGeneratedBindings19 = obj53 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj53 : null;
                    if (withGeneratedBindings19 != null && (withGeneratedBindingsBind19 = withGeneratedBindings19.bind(accumulatedState)) != null) {
                        obj53 = withGeneratedBindingsBind19;
                    }
                    arrayList19.add(obj53);
                }
                map4 = (Map) arrayList19;
            } else {
                map4 = aggregateBindings;
            }
            obj25 = map4;
        }
        String strResolveContentBindingKey20 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "aggregateBindings") : null;
        if (strResolveContentBindingKey20 != null) {
            Object objResolveStateRef20 = StateLookupKt.resolveStateRef(strResolveContentBindingKey20, accumulatedState);
            if (objResolveStateRef20 != null) {
                BindingLoggerKt.logContentBinding("aggregateBindings", strResolveContentBindingKey20, objResolveStateRef20);
                Object objUnwrapForCoercion20 = BindCoercionKt.unwrapForCoercion(objResolveStateRef20);
                if ((objUnwrapForCoercion20 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion20) && AbstractC22676k.m65745e(accumulatedState.get(obj44), Boolean.TRUE)) {
                    obj25 = null;
                } else {
                    Object objUnwrapForCoercion21 = BindCoercionKt.unwrapForCoercion(objResolveStateRef20);
                    if (objUnwrapForCoercion21 == null) {
                        objOverlayContentPathBindings20 = null;
                    } else if (objUnwrapForCoercion21 instanceof JsonElement) {
                        JsonElement jsonElement18 = (JsonElement) objUnwrapForCoercion21;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings20 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement18);
                        } catch (Exception unused39) {
                            objOverlayContentPathBindings20 = null;
                        }
                    } else if (objUnwrapForCoercion21 instanceof Map) {
                        objOverlayContentPathBindings20 = objUnwrapForCoercion21;
                    } else {
                        if (objUnwrapForCoercion21 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a20 = AbstractC22671h0.m65688a(Map.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a20, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings20 = (Map) Integer.valueOf(((Number) objUnwrapForCoercion21).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a20, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings20 = (Map) Long.valueOf(((Number) objUnwrapForCoercion21).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a20, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings20 = (Map) Double.valueOf(((Number) objUnwrapForCoercion21).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a20, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings20 = (Map) Float.valueOf(((Number) objUnwrapForCoercion21).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a20, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings20 = (Map) Short.valueOf(((Number) objUnwrapForCoercion21).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a20, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings20 = (Map) Byte.valueOf(((Number) objUnwrapForCoercion21).byteValue());
                            }
                        } else if (objUnwrapForCoercion21 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c18 = AbstractC0770m.m1841c((String) objUnwrapForCoercion21);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objUnwrapForCoercion21 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c18);
                            } catch (Exception unused40) {
                                objUnwrapForCoercion21 = null;
                            }
                            if (objUnwrapForCoercion21 != null) {
                                objOverlayContentPathBindings20 = objUnwrapForCoercion21;
                            }
                        }
                        objOverlayContentPathBindings20 = null;
                    }
                    obj25 = objOverlayContentPathBindings20 == null ? aggregateBindings : objOverlayContentPathBindings20;
                }
            }
        } else if (obj25 != null) {
            objOverlayContentPathBindings20 = ContentPathBindingsKt.overlayContentPathBindings(map, "aggregateBindings", accumulatedState, obj25, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$96
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj54) {
                    return invoke((Map<String, ? extends AggregateBinding>) obj54);
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
                    } catch (Exception unused41) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$97
                /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Map<String, ? extends AggregateBinding> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), json);
                    } catch (Exception unused41) {
                        return null;
                    }
                }
            });
        }
        return (CardButtonModel) ContentBindingResolverKt.copyBindingsFrom(new CardButtonModel(str, textResource, str2, str3, str4, str5, str6, c9598e, action3, analyticEventModel, anyModal2, str7, str8, str9, str10, dismissEventModel, bool, genericInteraction2, map5, (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "aggregateBindings", accumulatedState, obj25, "aggregateBindings", new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$98
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj54) {
                return invoke((Map<String, ? extends AggregateBinding>) obj54);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Map<String, ? extends AggregateBinding> map6) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, map6, interfaceC37138cM122336d);
                } catch (Exception unused41) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$99
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends AggregateBinding> invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), json);
                } catch (Exception unused41) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.CardButtonModelStateBindingKt$generatedBind$$inlined$resolveBinding$100
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends AggregateBinding> invoke(Object obj54) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj54);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement19 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement19);
                    } catch (Exception unused41) {
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
                    JsonPrimitive jsonPrimitiveM1841c19 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c19);
                    } catch (Exception unused42) {
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
        })), cardButtonModel);
    }

    public static /* synthetic */ CardButtonModel generatedBind$default(CardButtonModel cardButtonModel, Map map, Map map2, Map map3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map2 = null;
        }
        return generatedBind(cardButtonModel, map, map2, map3);
    }
}
