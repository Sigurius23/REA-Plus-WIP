package com.whoop.design.models.items.recommendationtile;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import androidx.core.app.NotificationCompat;
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
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003¨\u0006\t"}, m65681d2 = {"generatedBind", "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;", "contentBinding", "", "", "aggregateBindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "accumulatedState", "", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class RecommendationTileModelStateBindingKt {
    /* JADX WARN: Code duplicated, block: B:128:0x0222  */
    /* JADX WARN: Code duplicated, block: B:147:0x0262  */
    /* JADX WARN: Code duplicated, block: B:220:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:240:0x040e  */
    /* JADX WARN: Code duplicated, block: B:326:0x05af  */
    /* JADX WARN: Code duplicated, block: B:399:0x0726  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:418:0x0766  */
    /* JADX WARN: Code duplicated, block: B:486:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:505:0x0911  */
    /* JADX WARN: Code duplicated, block: B:575:0x0a72  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:593:0x0ab1  */
    /* JADX WARN: Code duplicated, block: B:665:0x0c10  */
    /* JADX WARN: Code duplicated, block: B:684:0x0c50  */
    /* JADX WARN: Code duplicated, block: B:754:0x0db4  */
    /* JADX WARN: Code duplicated, block: B:774:0x0df6  */
    /* JADX WARN: Code duplicated, block: B:844:0x0f56  */
    /* JADX WARN: Code duplicated, block: B:870:0x0fbf A[PHI: r4
      0x0fbf: PHI (r4v94 java.lang.Object) = (r4v70 java.lang.Object), (r4v74 java.lang.Object) binds: [B:869:0x0fbd, B:897:0x1085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final RecommendationTileModel generatedBind(RecommendationTileModel recommendationTileModel, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, ? extends Object> accumulatedState) {
        Object objOverlayContentPathBindings;
        WithGeneratedBindings withGeneratedBindingsBind;
        Object obj;
        WithGeneratedBindings withGeneratedBindingsBind2;
        Object objOverlayContentPathBindings2;
        Object obj2;
        DesignSystemModel designSystemModel;
        WithGeneratedBindings withGeneratedBindingsBind3;
        Object objOverlayContentPathBindings3;
        Object obj3;
        List list;
        WithGeneratedBindings withGeneratedBindingsBind4;
        Object objOverlayContentPathBindings4;
        Object obj4;
        DesignSystemModel designSystemModel2;
        WithGeneratedBindings withGeneratedBindingsBind5;
        Object objOverlayContentPathBindings5;
        Object obj5;
        Boolean bool;
        WithGeneratedBindings withGeneratedBindingsBind6;
        Object objOverlayContentPathBindings6;
        Object obj6;
        Boolean bool2;
        WithGeneratedBindings withGeneratedBindingsBind7;
        Object objOverlayContentPathBindings7;
        Object obj7;
        Object obj8;
        WithGeneratedBindings withGeneratedBindingsBind8;
        Object objOverlayContentPathBindings8;
        Object obj9;
        Map<String, String> map3;
        WithGeneratedBindings withGeneratedBindingsBind9;
        Object objOverlayContentPathBindings9;
        Object obj10;
        Map<String, AggregateBinding> map4;
        WithGeneratedBindings withGeneratedBindingsBind10;
        Object obj11;
        Object objOverlayContentPathBindings10;
        AbstractC22676k.m65750j(recommendationTileModel, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if ((map == null || map.isEmpty()) && ((map2 == null || map2.isEmpty()) && accumulatedState.isEmpty())) {
            return recommendationTileModel;
        }
        Object recommendationId = recommendationTileModel.getRecommendationId();
        if (recommendationId == null) {
            objOverlayContentPathBindings = null;
        } else if (recommendationId instanceof WithGeneratedBindings) {
            Object objBind = ((WithGeneratedBindings) recommendationId).bind(accumulatedState);
            if (!(objBind instanceof String)) {
                objBind = null;
            }
            objOverlayContentPathBindings = (String) objBind;
            if (objOverlayContentPathBindings == null) {
                objOverlayContentPathBindings = recommendationId;
            }
        } else if (recommendationId instanceof List) {
            Iterable iterable = (Iterable) recommendationId;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            for (Object obj12 : iterable) {
                WithGeneratedBindings withGeneratedBindings = obj12 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj12 : null;
                if (withGeneratedBindings != null && (withGeneratedBindingsBind = withGeneratedBindings.bind(accumulatedState)) != null) {
                    obj12 = withGeneratedBindingsBind;
                }
                arrayList.add(obj12);
            }
            objOverlayContentPathBindings = (String) arrayList;
        } else {
            objOverlayContentPathBindings = recommendationId;
        }
        String strResolveContentBindingKey = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "recommendationId") : null;
        Class cls = Byte.TYPE;
        Class cls2 = Short.TYPE;
        Class cls3 = Float.TYPE;
        Class cls4 = Double.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        if (strResolveContentBindingKey != null) {
            Object objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
            if (objResolveStateRef != null) {
                BindingLoggerKt.logContentBinding("recommendationId", strResolveContentBindingKey, objResolveStateRef);
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
                        objOverlayContentPathBindings = recommendationId;
                    }
                }
            }
        } else if (objOverlayContentPathBindings != null) {
            objOverlayContentPathBindings = ContentPathBindingsKt.overlayContentPathBindings(map, "recommendationId", accumulatedState, objOverlayContentPathBindings, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$1
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj13) {
                    return invoke((String) obj13);
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
            }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$2
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
        String recommendationId2 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "recommendationId", accumulatedState, objOverlayContentPathBindings, "recommendationId", new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$3
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj13) {
                return invoke((String) obj13);
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
        }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$4
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
        }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$5
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj13) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj13);
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
        if (recommendationId2 == null) {
            recommendationId2 = recommendationTileModel.getRecommendationId();
        }
        String str = recommendationId2;
        Object status = recommendationTileModel.getStatus();
        if (status == null) {
            objOverlayContentPathBindings2 = null;
        } else {
            if (status instanceof WithGeneratedBindings) {
                Object objBind2 = ((WithGeneratedBindings) status).bind(accumulatedState);
                if (!(objBind2 instanceof RecommendationTileStatus)) {
                    objBind2 = null;
                }
                obj = (RecommendationTileStatus) objBind2;
                if (obj == null) {
                    obj = status;
                }
            } else if (status instanceof List) {
                Iterable iterable2 = (Iterable) status;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
                for (Object obj13 : iterable2) {
                    WithGeneratedBindings withGeneratedBindings2 = obj13 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj13 : null;
                    if (withGeneratedBindings2 != null && (withGeneratedBindingsBind2 = withGeneratedBindings2.bind(accumulatedState)) != null) {
                        obj13 = withGeneratedBindingsBind2;
                    }
                    arrayList2.add(obj13);
                }
                obj = (RecommendationTileStatus) arrayList2;
            } else {
                obj = status;
            }
            objOverlayContentPathBindings2 = obj;
        }
        String strResolveContentBindingKey2 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, NotificationCompat.CATEGORY_STATUS) : null;
        if (strResolveContentBindingKey2 != null) {
            Object objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
            if (objResolveStateRef2 != null) {
                BindingLoggerKt.logContentBinding(NotificationCompat.CATEGORY_STATUS, strResolveContentBindingKey2, objResolveStateRef2);
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
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(RecommendationTileStatus.INSTANCE.serializer(), jsonElement2);
                    } catch (Exception unused3) {
                        objOverlayContentPathBindings2 = null;
                    }
                } else if (!(objOverlayContentPathBindings2 instanceof RecommendationTileStatus)) {
                    if (objOverlayContentPathBindings2 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a2 = AbstractC22671h0.m65688a(RecommendationTileStatus.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings2 = (RecommendationTileStatus) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings2 = (RecommendationTileStatus) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings2 = (RecommendationTileStatus) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings2 = (RecommendationTileStatus) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings2 = (RecommendationTileStatus) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings2 = (RecommendationTileStatus) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                        } else {
                            objOverlayContentPathBindings2 = null;
                        }
                    } else if (objOverlayContentPathBindings2 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(RecommendationTileStatus.INSTANCE.serializer(), jsonPrimitiveM1841c2);
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
                    objOverlayContentPathBindings2 = status;
                }
            } else {
                obj2 = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
            }
        } else {
            obj2 = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
            if (objOverlayContentPathBindings2 != null) {
                objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(map, NotificationCompat.CATEGORY_STATUS, accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$6
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj14) {
                        return invoke((RecommendationTileStatus) obj14);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(RecommendationTileStatus v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(RecommendationTileStatus.INSTANCE.serializer(), v13);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$7
                    /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.items.recommendationtile.RecommendationTileStatus, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final RecommendationTileStatus invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(RecommendationTileStatus.INSTANCE.serializer(), json);
                        } catch (Exception unused5) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj14 = obj2;
        RecommendationTileStatus status2 = (RecommendationTileStatus) DotPathBindingsKt.overlayAggregateBinding(map2, NotificationCompat.CATEGORY_STATUS, accumulatedState, objOverlayContentPathBindings2, NotificationCompat.CATEGORY_STATUS, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$8
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj15) {
                return invoke((RecommendationTileStatus) obj15);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(RecommendationTileStatus recommendationTileStatus) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(RecommendationTileStatus.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, recommendationTileStatus, interfaceC37138cM122336d);
                } catch (Exception unused5) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$9
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.items.recommendationtile.RecommendationTileStatus, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final RecommendationTileStatus invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(RecommendationTileStatus.INSTANCE.serializer(), json);
                } catch (Exception unused5) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$10
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.items.recommendationtile.RecommendationTileStatus, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.items.recommendationtile.RecommendationTileStatus, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final RecommendationTileStatus invoke(Object obj15) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj15);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement3 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(RecommendationTileStatus.INSTANCE.serializer(), jsonElement3);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof RecommendationTileStatus) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(RecommendationTileStatus.INSTANCE.serializer(), jsonPrimitiveM1841c3);
                    } catch (Exception unused6) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(RecommendationTileStatus.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (RecommendationTileStatus) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (RecommendationTileStatus) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (RecommendationTileStatus) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (RecommendationTileStatus) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (RecommendationTileStatus) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (RecommendationTileStatus) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (status2 == null) {
            status2 = recommendationTileModel.getStatus();
        }
        RecommendationTileStatus recommendationTileStatus = status2;
        DesignSystemModel header = recommendationTileModel.getHeader();
        if (header == null) {
            objOverlayContentPathBindings3 = null;
        } else {
            if (header instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind11 = ((WithGeneratedBindings) header).bind(accumulatedState);
                if (!(withGeneratedBindingsBind11 instanceof DesignSystemModel)) {
                    withGeneratedBindingsBind11 = null;
                }
                designSystemModel = (DesignSystemModel) withGeneratedBindingsBind11;
                if (designSystemModel == null) {
                    designSystemModel = header;
                }
            } else if (header instanceof List) {
                Iterable iterable3 = (Iterable) header;
                List arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable3, 10));
                for (Object obj15 : iterable3) {
                    WithGeneratedBindings withGeneratedBindings3 = obj15 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj15 : null;
                    if (withGeneratedBindings3 != null && (withGeneratedBindingsBind3 = withGeneratedBindings3.bind(accumulatedState)) != null) {
                        obj15 = withGeneratedBindingsBind3;
                    }
                    arrayList3.add(obj15);
                }
                designSystemModel = (DesignSystemModel) arrayList3;
            } else {
                designSystemModel = header;
            }
            objOverlayContentPathBindings3 = designSystemModel;
        }
        String strResolveContentBindingKey3 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "header") : null;
        if (strResolveContentBindingKey3 != null) {
            Object objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
            if (objResolveStateRef3 != null) {
                BindingLoggerKt.logContentBinding("header", strResolveContentBindingKey3, objResolveStateRef3);
                Object objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if ((objUnwrapForCoercion3 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion3)) {
                    obj3 = obj14;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj3), Boolean.TRUE)) {
                        objOverlayContentPathBindings3 = null;
                    }
                } else {
                    obj3 = obj14;
                }
                objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if (objOverlayContentPathBindings3 == null) {
                    objOverlayContentPathBindings3 = null;
                } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                    try {
                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(DesignSystemModel.class)), (JsonElement) objOverlayContentPathBindings3);
                    } catch (Exception unused5) {
                        objOverlayContentPathBindings3 = null;
                    }
                } else if (!(objOverlayContentPathBindings3 instanceof DesignSystemModel)) {
                    if (objOverlayContentPathBindings3 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a3 = AbstractC22671h0.m65688a(DesignSystemModel.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings3 = (DesignSystemModel) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings3 = (DesignSystemModel) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings3 = (DesignSystemModel) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings3 = (DesignSystemModel) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings3 = (DesignSystemModel) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings3 = (DesignSystemModel) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                        } else {
                            objOverlayContentPathBindings3 = null;
                        }
                    } else if (objOverlayContentPathBindings3 instanceof String) {
                        try {
                            objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(DesignSystemModel.class)), AbstractC0770m.m1841c((String) objOverlayContentPathBindings3));
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
                    objOverlayContentPathBindings3 = header;
                }
            } else {
                obj3 = obj14;
            }
        } else {
            obj3 = obj14;
            if (objOverlayContentPathBindings3 != null) {
                objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(map, "header", accumulatedState, objOverlayContentPathBindings3, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$11
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj16) {
                        return invoke((DesignSystemModel) obj16);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(DesignSystemModel v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            InterfaceC37138c interfaceC37138cM113842e = AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class));
                            AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                            stateBindingJson.getClass();
                            return AbstractC12313p.m34290h0(stateBindingJson, v13, interfaceC37138cM113842e);
                        } catch (Exception unused7) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$12
                    /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.DesignSystemModel, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final DesignSystemModel invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)), json);
                        } catch (Exception unused7) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj16 = obj3;
        DesignSystemModel designSystemModel3 = (DesignSystemModel) DotPathBindingsKt.overlayAggregateBinding(map2, "header", accumulatedState, objOverlayContentPathBindings3, "header", new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$13
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj17) {
                return invoke((DesignSystemModel) obj17);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(DesignSystemModel designSystemModel4) {
                try {
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, designSystemModel4, interfaceC37138cM122336d);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$14
            /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.DesignSystemModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final DesignSystemModel invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)), json);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$15
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [com.whoop.design.models.DesignSystemModel] */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.DesignSystemModel, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.DesignSystemModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final DesignSystemModel invoke(Object obj17) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj17);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)), (JsonElement) UnwrapForCoercion);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof DesignSystemModel) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    try {
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)), AbstractC0770m.m1841c((String) UnwrapForCoercion));
                    } catch (Exception unused8) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(DesignSystemModel.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (DesignSystemModel) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (DesignSystemModel) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (DesignSystemModel) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (DesignSystemModel) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (DesignSystemModel) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (DesignSystemModel) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        List<DesignSystemModel> body = recommendationTileModel.getBody();
        if (body == null) {
            objOverlayContentPathBindings4 = null;
        } else {
            if (body instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind12 = ((WithGeneratedBindings) body).bind(accumulatedState);
                if (!(withGeneratedBindingsBind12 instanceof List)) {
                    withGeneratedBindingsBind12 = null;
                }
                list = (List) withGeneratedBindingsBind12;
                if (list == null) {
                    list = body;
                }
            } else {
                List<DesignSystemModel> list2 = body;
                ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                for (Object obj17 : list2) {
                    WithGeneratedBindings withGeneratedBindings4 = obj17 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj17 : null;
                    if (withGeneratedBindings4 != null && (withGeneratedBindingsBind4 = withGeneratedBindings4.bind(accumulatedState)) != null) {
                        obj17 = withGeneratedBindingsBind4;
                    }
                    arrayList4.add(obj17);
                }
                list = arrayList4;
            }
            objOverlayContentPathBindings4 = list;
        }
        String strResolveContentBindingKey4 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "body") : null;
        if (strResolveContentBindingKey4 != null) {
            Object objResolveStateRef4 = StateLookupKt.resolveStateRef(strResolveContentBindingKey4, accumulatedState);
            if (objResolveStateRef4 != null) {
                BindingLoggerKt.logContentBinding("body", strResolveContentBindingKey4, objResolveStateRef4);
                Object objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if ((objUnwrapForCoercion4 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion4)) {
                    obj4 = obj16;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj4), Boolean.TRUE)) {
                        objOverlayContentPathBindings4 = null;
                    }
                } else {
                    obj4 = obj16;
                }
                objOverlayContentPathBindings4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if (objOverlayContentPathBindings4 == null) {
                    objOverlayContentPathBindings4 = null;
                } else if (objOverlayContentPathBindings4 instanceof JsonElement) {
                    try {
                        objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(DesignSystemModel.class))), (JsonElement) objOverlayContentPathBindings4);
                    } catch (Exception unused7) {
                        objOverlayContentPathBindings4 = null;
                    }
                } else if (!(objOverlayContentPathBindings4 instanceof List)) {
                    if (objOverlayContentPathBindings4 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a4 = AbstractC22671h0.m65688a(List.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings4 = (List) Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings4 = (List) Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings4 = (List) Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings4 = (List) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings4 = (List) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings4 = (List) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                        } else {
                            objOverlayContentPathBindings4 = null;
                        }
                    } else if (objOverlayContentPathBindings4 instanceof String) {
                        try {
                            objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(DesignSystemModel.class))), AbstractC0770m.m1841c((String) objOverlayContentPathBindings4));
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
                    objOverlayContentPathBindings4 = body;
                }
            } else {
                obj4 = obj16;
            }
        } else {
            obj4 = obj16;
            if (objOverlayContentPathBindings4 != null) {
                objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(map, "body", accumulatedState, objOverlayContentPathBindings4, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$16
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj18) {
                        return invoke((List<? extends DesignSystemModel>) obj18);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(List<? extends DesignSystemModel> v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            ArrayListSerializer arrayListSerializer = new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)));
                            AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                            stateBindingJson.getClass();
                            return AbstractC12313p.m34290h0(stateBindingJson, v13, arrayListSerializer);
                        } catch (Exception unused9) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$17
                    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final List<? extends DesignSystemModel> invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))), json);
                        } catch (Exception unused9) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj18 = obj4;
        List<DesignSystemModel> body2 = (List) DotPathBindingsKt.overlayAggregateBinding(map2, "body", accumulatedState, objOverlayContentPathBindings4, "body", new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$18
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj19) {
                return invoke((List<? extends DesignSystemModel>) obj19);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(List<? extends DesignSystemModel> list3) {
                try {
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, list3, interfaceC37138cM122336d);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$19
            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final List<? extends DesignSystemModel> invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))), json);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$20
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final List<? extends DesignSystemModel> invoke(Object obj19) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj19);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))), (JsonElement) UnwrapForCoercion);
                    } catch (Exception unused9) {
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
                    } catch (Exception unused10) {
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
        if (body2 == null) {
            body2 = recommendationTileModel.getBody();
        }
        List<DesignSystemModel> list3 = body2;
        DesignSystemModel cta = recommendationTileModel.getCta();
        if (cta == null) {
            objOverlayContentPathBindings5 = null;
        } else {
            if (cta instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind13 = ((WithGeneratedBindings) cta).bind(accumulatedState);
                if (!(withGeneratedBindingsBind13 instanceof DesignSystemModel)) {
                    withGeneratedBindingsBind13 = null;
                }
                designSystemModel2 = (DesignSystemModel) withGeneratedBindingsBind13;
                if (designSystemModel2 == null) {
                    designSystemModel2 = cta;
                }
            } else if (cta instanceof List) {
                Iterable iterable4 = (Iterable) cta;
                List arrayList5 = new ArrayList(AbstractC25267u.m74163i0(iterable4, 10));
                for (Object obj19 : iterable4) {
                    WithGeneratedBindings withGeneratedBindings5 = obj19 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj19 : null;
                    if (withGeneratedBindings5 != null && (withGeneratedBindingsBind5 = withGeneratedBindings5.bind(accumulatedState)) != null) {
                        obj19 = withGeneratedBindingsBind5;
                    }
                    arrayList5.add(obj19);
                }
                designSystemModel2 = (DesignSystemModel) arrayList5;
            } else {
                designSystemModel2 = cta;
            }
            objOverlayContentPathBindings5 = designSystemModel2;
        }
        String strResolveContentBindingKey5 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "cta") : null;
        if (strResolveContentBindingKey5 != null) {
            Object objResolveStateRef5 = StateLookupKt.resolveStateRef(strResolveContentBindingKey5, accumulatedState);
            if (objResolveStateRef5 != null) {
                BindingLoggerKt.logContentBinding("cta", strResolveContentBindingKey5, objResolveStateRef5);
                Object objUnwrapForCoercion5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                if ((objUnwrapForCoercion5 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion5)) {
                    obj5 = obj18;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj5), Boolean.TRUE)) {
                        objOverlayContentPathBindings5 = null;
                    }
                } else {
                    obj5 = obj18;
                }
                objOverlayContentPathBindings5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                if (objOverlayContentPathBindings5 == null) {
                    objOverlayContentPathBindings5 = null;
                } else if (objOverlayContentPathBindings5 instanceof JsonElement) {
                    try {
                        objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(DesignSystemModel.class)), (JsonElement) objOverlayContentPathBindings5);
                    } catch (Exception unused9) {
                        objOverlayContentPathBindings5 = null;
                    }
                } else if (!(objOverlayContentPathBindings5 instanceof DesignSystemModel)) {
                    if (objOverlayContentPathBindings5 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a5 = AbstractC22671h0.m65688a(DesignSystemModel.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings5 = (DesignSystemModel) Integer.valueOf(((Number) objOverlayContentPathBindings5).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings5 = (DesignSystemModel) Long.valueOf(((Number) objOverlayContentPathBindings5).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings5 = (DesignSystemModel) Double.valueOf(((Number) objOverlayContentPathBindings5).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings5 = (DesignSystemModel) Float.valueOf(((Number) objOverlayContentPathBindings5).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings5 = (DesignSystemModel) Short.valueOf(((Number) objOverlayContentPathBindings5).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings5 = (DesignSystemModel) Byte.valueOf(((Number) objOverlayContentPathBindings5).byteValue());
                        } else {
                            objOverlayContentPathBindings5 = null;
                        }
                    } else if (objOverlayContentPathBindings5 instanceof String) {
                        try {
                            objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(DesignSystemModel.class)), AbstractC0770m.m1841c((String) objOverlayContentPathBindings5));
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
                    objOverlayContentPathBindings5 = cta;
                }
            } else {
                obj5 = obj18;
            }
        } else {
            obj5 = obj18;
            if (objOverlayContentPathBindings5 != null) {
                objOverlayContentPathBindings5 = ContentPathBindingsKt.overlayContentPathBindings(map, "cta", accumulatedState, objOverlayContentPathBindings5, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$21
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj20) {
                        return invoke((DesignSystemModel) obj20);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(DesignSystemModel v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            InterfaceC37138c interfaceC37138cM113842e = AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class));
                            AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                            stateBindingJson.getClass();
                            return AbstractC12313p.m34290h0(stateBindingJson, v13, interfaceC37138cM113842e);
                        } catch (Exception unused11) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$22
                    /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.DesignSystemModel, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final DesignSystemModel invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)), json);
                        } catch (Exception unused11) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj20 = obj5;
        DesignSystemModel designSystemModel4 = (DesignSystemModel) DotPathBindingsKt.overlayAggregateBinding(map2, "cta", accumulatedState, objOverlayContentPathBindings5, "cta", new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$23
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj21) {
                return invoke((DesignSystemModel) obj21);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(DesignSystemModel designSystemModel5) {
                try {
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, designSystemModel5, interfaceC37138cM122336d);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$24
            /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.DesignSystemModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final DesignSystemModel invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)), json);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$25
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [com.whoop.design.models.DesignSystemModel] */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.DesignSystemModel, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.DesignSystemModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final DesignSystemModel invoke(Object obj21) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj21);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)), (JsonElement) UnwrapForCoercion);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof DesignSystemModel) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    try {
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)), AbstractC0770m.m1841c((String) UnwrapForCoercion));
                    } catch (Exception unused12) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(DesignSystemModel.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (DesignSystemModel) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (DesignSystemModel) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (DesignSystemModel) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (DesignSystemModel) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (DesignSystemModel) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (DesignSystemModel) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        Object objValueOf = Boolean.valueOf(recommendationTileModel.isExpanded());
        if (objValueOf instanceof WithGeneratedBindings) {
            Object objBind3 = ((WithGeneratedBindings) objValueOf).bind(accumulatedState);
            if (!(objBind3 instanceof Boolean)) {
                objBind3 = null;
            }
            bool = (Boolean) objBind3;
            if (bool == null) {
                objOverlayContentPathBindings6 = objValueOf;
            } else {
                objOverlayContentPathBindings6 = bool;
            }
        } else if (objValueOf instanceof List) {
            Iterable iterable5 = (Iterable) objValueOf;
            ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(iterable5, 10));
            for (Object obj21 : iterable5) {
                WithGeneratedBindings withGeneratedBindings6 = obj21 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj21 : null;
                if (withGeneratedBindings6 != null && (withGeneratedBindingsBind6 = withGeneratedBindings6.bind(accumulatedState)) != null) {
                    obj21 = withGeneratedBindingsBind6;
                }
                arrayList6.add(obj21);
            }
            bool = (Boolean) arrayList6;
            objOverlayContentPathBindings6 = bool;
        } else {
            objOverlayContentPathBindings6 = objValueOf;
        }
        String strResolveContentBindingKey6 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "isExpanded") : null;
        if (strResolveContentBindingKey6 != null) {
            Object objResolveStateRef6 = StateLookupKt.resolveStateRef(strResolveContentBindingKey6, accumulatedState);
            if (objResolveStateRef6 != null) {
                BindingLoggerKt.logContentBinding("isExpanded", strResolveContentBindingKey6, objResolveStateRef6);
                Object objUnwrapForCoercion6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef6);
                if ((objUnwrapForCoercion6 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion6)) {
                    obj6 = obj20;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj6), Boolean.TRUE)) {
                        objOverlayContentPathBindings6 = null;
                    }
                } else {
                    obj6 = obj20;
                }
                objOverlayContentPathBindings6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef6);
                if (objOverlayContentPathBindings6 == null) {
                    objOverlayContentPathBindings6 = null;
                } else if (objOverlayContentPathBindings6 instanceof JsonElement) {
                    JsonElement jsonElement3 = (JsonElement) objOverlayContentPathBindings6;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings6 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement3);
                    } catch (Exception unused11) {
                        objOverlayContentPathBindings6 = null;
                    }
                } else if (!(objOverlayContentPathBindings6 instanceof Boolean)) {
                    if (objOverlayContentPathBindings6 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a6 = AbstractC22671h0.m65688a(Boolean.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings6 = (Boolean) Integer.valueOf(((Number) objOverlayContentPathBindings6).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings6 = (Boolean) Long.valueOf(((Number) objOverlayContentPathBindings6).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings6 = (Boolean) Double.valueOf(((Number) objOverlayContentPathBindings6).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings6 = (Boolean) Float.valueOf(((Number) objOverlayContentPathBindings6).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings6 = (Boolean) Short.valueOf(((Number) objOverlayContentPathBindings6).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings6 = (Boolean) Byte.valueOf(((Number) objOverlayContentPathBindings6).byteValue());
                        } else {
                            objOverlayContentPathBindings6 = null;
                        }
                    } else if (objOverlayContentPathBindings6 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings6);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings6 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c3);
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
                    objOverlayContentPathBindings6 = objValueOf;
                }
            } else {
                obj6 = obj20;
            }
        } else {
            obj6 = obj20;
            objOverlayContentPathBindings6 = ContentPathBindingsKt.overlayContentPathBindings(map, "isExpanded", accumulatedState, objOverlayContentPathBindings6, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$26
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj22) {
                    return invoke((Boolean) obj22);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Boolean v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(BooleanSerializer.INSTANCE, v13);
                    } catch (Exception unused13) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$27
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Boolean invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                    } catch (Exception unused13) {
                        return null;
                    }
                }
            });
        }
        Object obj22 = obj6;
        Boolean bool3 = (Boolean) DotPathBindingsKt.overlayAggregateBinding(map2, "isExpanded", accumulatedState, objOverlayContentPathBindings6, "isExpanded", new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$28
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj23) {
                return invoke((Boolean) obj23);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Boolean bool4) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(BooleanSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, bool4, interfaceC37138cM122336d);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$29
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Boolean invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$30
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Boolean, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Boolean, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj23) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj23);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement4 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement4);
                    } catch (Exception unused13) {
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
                    } catch (Exception unused14) {
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
        boolean zBooleanValue = bool3 != null ? bool3.booleanValue() : recommendationTileModel.isExpanded();
        Object objValueOf2 = Boolean.valueOf(recommendationTileModel.isSelected());
        if (objValueOf2 instanceof WithGeneratedBindings) {
            Object objBind4 = ((WithGeneratedBindings) objValueOf2).bind(accumulatedState);
            if (!(objBind4 instanceof Boolean)) {
                objBind4 = null;
            }
            bool2 = (Boolean) objBind4;
            if (bool2 == null) {
                objOverlayContentPathBindings7 = objValueOf2;
            } else {
                objOverlayContentPathBindings7 = bool2;
            }
        } else if (objValueOf2 instanceof List) {
            Iterable iterable6 = (Iterable) objValueOf2;
            ArrayList arrayList7 = new ArrayList(AbstractC25267u.m74163i0(iterable6, 10));
            for (Object obj23 : iterable6) {
                WithGeneratedBindings withGeneratedBindings7 = obj23 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj23 : null;
                if (withGeneratedBindings7 != null && (withGeneratedBindingsBind7 = withGeneratedBindings7.bind(accumulatedState)) != null) {
                    obj23 = withGeneratedBindingsBind7;
                }
                arrayList7.add(obj23);
            }
            bool2 = (Boolean) arrayList7;
            objOverlayContentPathBindings7 = bool2;
        } else {
            objOverlayContentPathBindings7 = objValueOf2;
        }
        String strResolveContentBindingKey7 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "isSelected") : null;
        if (strResolveContentBindingKey7 != null) {
            Object objResolveStateRef7 = StateLookupKt.resolveStateRef(strResolveContentBindingKey7, accumulatedState);
            if (objResolveStateRef7 != null) {
                BindingLoggerKt.logContentBinding("isSelected", strResolveContentBindingKey7, objResolveStateRef7);
                Object objUnwrapForCoercion7 = BindCoercionKt.unwrapForCoercion(objResolveStateRef7);
                if ((objUnwrapForCoercion7 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion7)) {
                    obj7 = obj22;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj7), Boolean.TRUE)) {
                        objOverlayContentPathBindings7 = null;
                    }
                } else {
                    obj7 = obj22;
                }
                objOverlayContentPathBindings7 = BindCoercionKt.unwrapForCoercion(objResolveStateRef7);
                if (objOverlayContentPathBindings7 == null) {
                    objOverlayContentPathBindings7 = null;
                } else if (objOverlayContentPathBindings7 instanceof JsonElement) {
                    JsonElement jsonElement4 = (JsonElement) objOverlayContentPathBindings7;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings7 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement4);
                    } catch (Exception unused13) {
                        objOverlayContentPathBindings7 = null;
                    }
                } else if (!(objOverlayContentPathBindings7 instanceof Boolean)) {
                    if (objOverlayContentPathBindings7 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a7 = AbstractC22671h0.m65688a(Boolean.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings7 = (Boolean) Integer.valueOf(((Number) objOverlayContentPathBindings7).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings7 = (Boolean) Long.valueOf(((Number) objOverlayContentPathBindings7).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings7 = (Boolean) Double.valueOf(((Number) objOverlayContentPathBindings7).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings7 = (Boolean) Float.valueOf(((Number) objOverlayContentPathBindings7).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings7 = (Boolean) Short.valueOf(((Number) objOverlayContentPathBindings7).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a7, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings7 = (Boolean) Byte.valueOf(((Number) objOverlayContentPathBindings7).byteValue());
                        } else {
                            objOverlayContentPathBindings7 = null;
                        }
                    } else if (objOverlayContentPathBindings7 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings7);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings7 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c4);
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
                    objOverlayContentPathBindings7 = objValueOf2;
                }
            } else {
                obj7 = obj22;
            }
        } else {
            obj7 = obj22;
            objOverlayContentPathBindings7 = ContentPathBindingsKt.overlayContentPathBindings(map, "isSelected", accumulatedState, objOverlayContentPathBindings7, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$31
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj24) {
                    return invoke((Boolean) obj24);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(Boolean v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(BooleanSerializer.INSTANCE, v13);
                    } catch (Exception unused15) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$32
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Boolean invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                    } catch (Exception unused15) {
                        return null;
                    }
                }
            });
        }
        Object obj24 = obj7;
        Boolean bool4 = (Boolean) DotPathBindingsKt.overlayAggregateBinding(map2, "isSelected", accumulatedState, objOverlayContentPathBindings7, "isSelected", new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$33
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj25) {
                return invoke((Boolean) obj25);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Boolean bool5) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(BooleanSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, bool5, interfaceC37138cM122336d);
                } catch (Exception unused15) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$34
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Boolean invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, json);
                } catch (Exception unused15) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$35
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Boolean, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Boolean, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj25) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj25);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement5 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement5);
                    } catch (Exception unused15) {
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
                    } catch (Exception unused16) {
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
        boolean zBooleanValue2 = bool4 != null ? bool4.booleanValue() : recommendationTileModel.isSelected();
        Object style = recommendationTileModel.getStyle();
        if (style == null) {
            objOverlayContentPathBindings8 = null;
        } else {
            if (style instanceof WithGeneratedBindings) {
                Object objBind5 = ((WithGeneratedBindings) style).bind(accumulatedState);
                if (!(objBind5 instanceof RecommendationTileLayoutStyle)) {
                    objBind5 = null;
                }
                obj8 = (RecommendationTileLayoutStyle) objBind5;
                if (obj8 == null) {
                    obj8 = style;
                }
            } else if (style instanceof List) {
                Iterable iterable7 = (Iterable) style;
                ArrayList arrayList8 = new ArrayList(AbstractC25267u.m74163i0(iterable7, 10));
                for (Object obj25 : iterable7) {
                    WithGeneratedBindings withGeneratedBindings8 = obj25 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj25 : null;
                    if (withGeneratedBindings8 != null && (withGeneratedBindingsBind8 = withGeneratedBindings8.bind(accumulatedState)) != null) {
                        obj25 = withGeneratedBindingsBind8;
                    }
                    arrayList8.add(obj25);
                }
                obj8 = (RecommendationTileLayoutStyle) arrayList8;
            } else {
                obj8 = style;
            }
            objOverlayContentPathBindings8 = obj8;
        }
        String strResolveContentBindingKey8 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "style") : null;
        if (strResolveContentBindingKey8 != null) {
            Object objResolveStateRef8 = StateLookupKt.resolveStateRef(strResolveContentBindingKey8, accumulatedState);
            if (objResolveStateRef8 != null) {
                BindingLoggerKt.logContentBinding("style", strResolveContentBindingKey8, objResolveStateRef8);
                Object objUnwrapForCoercion8 = BindCoercionKt.unwrapForCoercion(objResolveStateRef8);
                if ((objUnwrapForCoercion8 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion8)) {
                    obj9 = obj24;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj9), Boolean.TRUE)) {
                        objOverlayContentPathBindings8 = null;
                    }
                } else {
                    obj9 = obj24;
                }
                objOverlayContentPathBindings8 = BindCoercionKt.unwrapForCoercion(objResolveStateRef8);
                if (objOverlayContentPathBindings8 == null) {
                    objOverlayContentPathBindings8 = null;
                } else if (objOverlayContentPathBindings8 instanceof JsonElement) {
                    JsonElement jsonElement5 = (JsonElement) objOverlayContentPathBindings8;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings8 = StateBindingDeserializerKt.getStateBindingJson().m1830a(RecommendationTileLayoutStyle.INSTANCE.serializer(), jsonElement5);
                    } catch (Exception unused15) {
                        objOverlayContentPathBindings8 = null;
                    }
                } else if (!(objOverlayContentPathBindings8 instanceof RecommendationTileLayoutStyle)) {
                    if (objOverlayContentPathBindings8 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a8 = AbstractC22671h0.m65688a(RecommendationTileLayoutStyle.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings8 = (RecommendationTileLayoutStyle) Integer.valueOf(((Number) objOverlayContentPathBindings8).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings8 = (RecommendationTileLayoutStyle) Long.valueOf(((Number) objOverlayContentPathBindings8).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings8 = (RecommendationTileLayoutStyle) Double.valueOf(((Number) objOverlayContentPathBindings8).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings8 = (RecommendationTileLayoutStyle) Float.valueOf(((Number) objOverlayContentPathBindings8).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings8 = (RecommendationTileLayoutStyle) Short.valueOf(((Number) objOverlayContentPathBindings8).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a8, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings8 = (RecommendationTileLayoutStyle) Byte.valueOf(((Number) objOverlayContentPathBindings8).byteValue());
                        } else {
                            objOverlayContentPathBindings8 = null;
                        }
                    } else if (objOverlayContentPathBindings8 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings8);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings8 = StateBindingDeserializerKt.getStateBindingJson().m1830a(RecommendationTileLayoutStyle.INSTANCE.serializer(), jsonPrimitiveM1841c5);
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
                    objOverlayContentPathBindings8 = style;
                }
            } else {
                obj9 = obj24;
            }
        } else {
            obj9 = obj24;
            if (objOverlayContentPathBindings8 != null) {
                objOverlayContentPathBindings8 = ContentPathBindingsKt.overlayContentPathBindings(map, "style", accumulatedState, objOverlayContentPathBindings8, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$36
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj26) {
                        return invoke((RecommendationTileLayoutStyle) obj26);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(RecommendationTileLayoutStyle v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(RecommendationTileLayoutStyle.INSTANCE.serializer(), v13);
                        } catch (Exception unused17) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$37
                    /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.items.recommendationtile.RecommendationTileLayoutStyle, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final RecommendationTileLayoutStyle invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(RecommendationTileLayoutStyle.INSTANCE.serializer(), json);
                        } catch (Exception unused17) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj26 = obj9;
        RecommendationTileLayoutStyle recommendationTileLayoutStyle = (RecommendationTileLayoutStyle) DotPathBindingsKt.overlayAggregateBinding(map2, "style", accumulatedState, objOverlayContentPathBindings8, "style", new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$38
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj27) {
                return invoke((RecommendationTileLayoutStyle) obj27);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(RecommendationTileLayoutStyle recommendationTileLayoutStyle2) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(RecommendationTileLayoutStyle.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, recommendationTileLayoutStyle2, interfaceC37138cM122336d);
                } catch (Exception unused17) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$39
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.items.recommendationtile.RecommendationTileLayoutStyle, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final RecommendationTileLayoutStyle invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(RecommendationTileLayoutStyle.INSTANCE.serializer(), json);
                } catch (Exception unused17) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$40
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.items.recommendationtile.RecommendationTileLayoutStyle, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.items.recommendationtile.RecommendationTileLayoutStyle, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final RecommendationTileLayoutStyle invoke(Object obj27) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj27);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement6 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(RecommendationTileLayoutStyle.INSTANCE.serializer(), jsonElement6);
                    } catch (Exception unused17) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof RecommendationTileLayoutStyle) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(RecommendationTileLayoutStyle.INSTANCE.serializer(), jsonPrimitiveM1841c6);
                    } catch (Exception unused18) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(RecommendationTileLayoutStyle.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (RecommendationTileLayoutStyle) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (RecommendationTileLayoutStyle) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (RecommendationTileLayoutStyle) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (RecommendationTileLayoutStyle) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (RecommendationTileLayoutStyle) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (RecommendationTileLayoutStyle) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        Map<String, String> bindings = recommendationTileModel.getBindings();
        if (bindings == null) {
            objOverlayContentPathBindings9 = null;
        } else {
            if (bindings instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind14 = ((WithGeneratedBindings) bindings).bind(accumulatedState);
                if (!(withGeneratedBindingsBind14 instanceof Map)) {
                    withGeneratedBindingsBind14 = null;
                }
                map3 = (Map) withGeneratedBindingsBind14;
                if (map3 == null) {
                    map3 = bindings;
                }
            } else if (bindings instanceof List) {
                Iterable iterable8 = (Iterable) bindings;
                List arrayList9 = new ArrayList(AbstractC25267u.m74163i0(iterable8, 10));
                for (Object obj27 : iterable8) {
                    WithGeneratedBindings withGeneratedBindings9 = obj27 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj27 : null;
                    if (withGeneratedBindings9 != null && (withGeneratedBindingsBind9 = withGeneratedBindings9.bind(accumulatedState)) != null) {
                        obj27 = withGeneratedBindingsBind9;
                    }
                    arrayList9.add(obj27);
                }
                map3 = (Map) arrayList9;
            } else {
                map3 = bindings;
            }
            objOverlayContentPathBindings9 = map3;
        }
        String strResolveContentBindingKey9 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "bindings") : null;
        if (strResolveContentBindingKey9 != null) {
            Object objResolveStateRef9 = StateLookupKt.resolveStateRef(strResolveContentBindingKey9, accumulatedState);
            if (objResolveStateRef9 != null) {
                BindingLoggerKt.logContentBinding("bindings", strResolveContentBindingKey9, objResolveStateRef9);
                Object objUnwrapForCoercion9 = BindCoercionKt.unwrapForCoercion(objResolveStateRef9);
                if ((objUnwrapForCoercion9 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion9)) {
                    obj10 = obj26;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj10), Boolean.TRUE)) {
                        objOverlayContentPathBindings9 = null;
                    }
                } else {
                    obj10 = obj26;
                }
                objOverlayContentPathBindings9 = BindCoercionKt.unwrapForCoercion(objResolveStateRef9);
                if (objOverlayContentPathBindings9 == null) {
                    objOverlayContentPathBindings9 = null;
                } else if (objOverlayContentPathBindings9 instanceof JsonElement) {
                    JsonElement jsonElement6 = (JsonElement) objOverlayContentPathBindings9;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer = StringSerializer.INSTANCE;
                        objOverlayContentPathBindings9 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer, stringSerializer), jsonElement6);
                    } catch (Exception unused17) {
                        objOverlayContentPathBindings9 = null;
                    }
                } else if (!(objOverlayContentPathBindings9 instanceof Map)) {
                    if (objOverlayContentPathBindings9 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a9 = AbstractC22671h0.m65688a(Map.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings9 = (Map) Integer.valueOf(((Number) objOverlayContentPathBindings9).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings9 = (Map) Long.valueOf(((Number) objOverlayContentPathBindings9).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings9 = (Map) Double.valueOf(((Number) objOverlayContentPathBindings9).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings9 = (Map) Float.valueOf(((Number) objOverlayContentPathBindings9).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings9 = (Map) Short.valueOf(((Number) objOverlayContentPathBindings9).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a9, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings9 = (Map) Byte.valueOf(((Number) objOverlayContentPathBindings9).byteValue());
                        } else {
                            objOverlayContentPathBindings9 = null;
                        }
                    } else if (objOverlayContentPathBindings9 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings9);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                            objOverlayContentPathBindings9 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), jsonPrimitiveM1841c6);
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
                    objOverlayContentPathBindings9 = bindings;
                }
            } else {
                obj10 = obj26;
            }
        } else {
            obj10 = obj26;
            if (objOverlayContentPathBindings9 != null) {
                objOverlayContentPathBindings9 = ContentPathBindingsKt.overlayContentPathBindings(map, "bindings", accumulatedState, objOverlayContentPathBindings9, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$41
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj28) {
                        return invoke((Map<String, ? extends String>) obj28);
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
                        } catch (Exception unused19) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$42
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Map<String, ? extends String> invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), json);
                        } catch (Exception unused19) {
                            return null;
                        }
                    }
                });
            }
        }
        Object obj28 = obj10;
        Map map5 = (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "bindings", accumulatedState, objOverlayContentPathBindings9, "bindings", new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$43
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj29) {
                return invoke((Map<String, ? extends String>) obj29);
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
                } catch (Exception unused19) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$44
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends String> invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), json);
                } catch (Exception unused19) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$45
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends java.lang.String>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.String>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends String> invoke(Object obj29) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj29);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement7 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer3 = StringSerializer.INSTANCE;
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer3, stringSerializer3), jsonElement7);
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
                    JsonPrimitive jsonPrimitiveM1841c7 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        StringSerializer stringSerializer4 = StringSerializer.INSTANCE;
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(stringSerializer4, stringSerializer4), jsonPrimitiveM1841c7);
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
        });
        Map<String, AggregateBinding> aggregateBindings = recommendationTileModel.getAggregateBindings();
        if (aggregateBindings == null) {
            obj11 = null;
        } else {
            if (aggregateBindings instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind15 = ((WithGeneratedBindings) aggregateBindings).bind(accumulatedState);
                if (!(withGeneratedBindingsBind15 instanceof Map)) {
                    withGeneratedBindingsBind15 = null;
                }
                map4 = (Map) withGeneratedBindingsBind15;
                if (map4 == null) {
                    map4 = aggregateBindings;
                }
            } else if (aggregateBindings instanceof List) {
                Iterable iterable9 = (Iterable) aggregateBindings;
                List arrayList10 = new ArrayList(AbstractC25267u.m74163i0(iterable9, 10));
                for (Object obj29 : iterable9) {
                    WithGeneratedBindings withGeneratedBindings10 = obj29 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj29 : null;
                    if (withGeneratedBindings10 != null && (withGeneratedBindingsBind10 = withGeneratedBindings10.bind(accumulatedState)) != null) {
                        obj29 = withGeneratedBindingsBind10;
                    }
                    arrayList10.add(obj29);
                }
                map4 = (Map) arrayList10;
            } else {
                map4 = aggregateBindings;
            }
            obj11 = map4;
        }
        String strResolveContentBindingKey10 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "aggregateBindings") : null;
        if (strResolveContentBindingKey10 != null) {
            Object objResolveStateRef10 = StateLookupKt.resolveStateRef(strResolveContentBindingKey10, accumulatedState);
            if (objResolveStateRef10 != null) {
                BindingLoggerKt.logContentBinding("aggregateBindings", strResolveContentBindingKey10, objResolveStateRef10);
                Object objUnwrapForCoercion10 = BindCoercionKt.unwrapForCoercion(objResolveStateRef10);
                if ((objUnwrapForCoercion10 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion10) && AbstractC22676k.m65745e(accumulatedState.get(obj28), Boolean.TRUE)) {
                    obj11 = null;
                } else {
                    Object objUnwrapForCoercion11 = BindCoercionKt.unwrapForCoercion(objResolveStateRef10);
                    if (objUnwrapForCoercion11 == null) {
                        objOverlayContentPathBindings10 = null;
                    } else if (objUnwrapForCoercion11 instanceof JsonElement) {
                        JsonElement jsonElement7 = (JsonElement) objUnwrapForCoercion11;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings10 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement7);
                        } catch (Exception unused19) {
                            objOverlayContentPathBindings10 = null;
                        }
                    } else if (objUnwrapForCoercion11 instanceof Map) {
                        objOverlayContentPathBindings10 = objUnwrapForCoercion11;
                    } else {
                        if (objUnwrapForCoercion11 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a10 = AbstractC22671h0.m65688a(Map.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings10 = (Map) Integer.valueOf(((Number) objUnwrapForCoercion11).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings10 = (Map) Long.valueOf(((Number) objUnwrapForCoercion11).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings10 = (Map) Double.valueOf(((Number) objUnwrapForCoercion11).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings10 = (Map) Float.valueOf(((Number) objUnwrapForCoercion11).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings10 = (Map) Short.valueOf(((Number) objUnwrapForCoercion11).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a10, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings10 = (Map) Byte.valueOf(((Number) objUnwrapForCoercion11).byteValue());
                            }
                        } else if (objUnwrapForCoercion11 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c7 = AbstractC0770m.m1841c((String) objUnwrapForCoercion11);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objUnwrapForCoercion11 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c7);
                            } catch (Exception unused20) {
                                objUnwrapForCoercion11 = null;
                            }
                            if (objUnwrapForCoercion11 != null) {
                                objOverlayContentPathBindings10 = objUnwrapForCoercion11;
                            }
                        }
                        objOverlayContentPathBindings10 = null;
                    }
                    obj11 = objOverlayContentPathBindings10 == null ? aggregateBindings : objOverlayContentPathBindings10;
                }
            }
        } else if (obj11 != null) {
            objOverlayContentPathBindings10 = ContentPathBindingsKt.overlayContentPathBindings(map, "aggregateBindings", accumulatedState, obj11, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$46
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj30) {
                    return invoke((Map<String, ? extends AggregateBinding>) obj30);
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
                    } catch (Exception unused21) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$47
                /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final Map<String, ? extends AggregateBinding> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), json);
                    } catch (Exception unused21) {
                        return null;
                    }
                }
            });
        }
        return (RecommendationTileModel) ContentBindingResolverKt.copyBindingsFrom(new RecommendationTileModel(str, recommendationTileStatus, designSystemModel3, list3, designSystemModel4, zBooleanValue, zBooleanValue2, recommendationTileLayoutStyle, map5, (Map) DotPathBindingsKt.overlayAggregateBinding(map2, "aggregateBindings", accumulatedState, obj11, "aggregateBindings", new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$48
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj30) {
                return invoke((Map<String, ? extends AggregateBinding>) obj30);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(Map<String, ? extends AggregateBinding> map6) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, map6, interfaceC37138cM122336d);
                } catch (Exception unused21) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$49
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends AggregateBinding> invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), json);
                } catch (Exception unused21) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.items.recommendationtile.RecommendationTileModelStateBindingKt$generatedBind$$inlined$resolveBinding$50
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends com.whoop.design.models.binding.AggregateBinding>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final Map<String, ? extends AggregateBinding> invoke(Object obj30) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj30);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement8 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonElement8);
                    } catch (Exception unused21) {
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
                    JsonPrimitive jsonPrimitiveM1841c8 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new LinkedHashMapSerializer(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer()), jsonPrimitiveM1841c8);
                    } catch (Exception unused22) {
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
        })), recommendationTileModel);
    }

    public static /* synthetic */ RecommendationTileModel generatedBind$default(RecommendationTileModel recommendationTileModel, Map map, Map map2, Map map3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map2 = null;
        }
        return generatedBind(recommendationTileModel, map, map2, map3);
    }
}
