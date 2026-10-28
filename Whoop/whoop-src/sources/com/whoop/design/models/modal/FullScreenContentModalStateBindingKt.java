package com.whoop.design.models.modal;

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
import com.whoop.design.models.binding.StateBindingDeserializerKt;
import com.whoop.design.models.binding.StateLookupKt;
import com.whoop.design.models.items.FooterModel;
import com.whoop.design.models.items.NavigationBarModel;
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
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003¨\u0006\t"}, m65681d2 = {"generatedBind", "Lcom/whoop/design/models/modal/FullScreenContentModal;", "contentBinding", "", "", "aggregateBindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "accumulatedState", "", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class FullScreenContentModalStateBindingKt {
    /* JADX WARN: Code duplicated, block: B:127:0x022b  */
    /* JADX WARN: Code duplicated, block: B:145:0x0267  */
    /* JADX WARN: Code duplicated, block: B:228:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:299:0x0571  */
    /* JADX WARN: Code duplicated, block: B:317:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:385:0x070d  */
    /* JADX WARN: Code duplicated, block: B:403:0x0749  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a9 A[PHI: r4
      0x01a9: PHI (r4v16 java.lang.Object) = (r4v14 java.lang.Object), (r4v14 java.lang.Object), (r4v207 java.lang.Object) binds: [B:97:0x01ac, B:48:0x00a2, B:94:0x01a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final FullScreenContentModal generatedBind(FullScreenContentModal fullScreenContentModal, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, ? extends Object> accumulatedState) {
        Object objOverlayContentPathBindings;
        WithGeneratedBindings withGeneratedBindingsBind;
        Map<String, String> map3;
        Object obj;
        WithGeneratedBindings withGeneratedBindingsBind2;
        Object objOverlayContentPathBindings2;
        List list;
        WithGeneratedBindings withGeneratedBindingsBind3;
        Object objOverlayContentPathBindings3;
        Object obj2;
        WithGeneratedBindings withGeneratedBindingsBind4;
        Object objOverlayContentPathBindings4;
        Object obj3;
        WithGeneratedBindings withGeneratedBindingsBind5;
        Object obj4;
        Object objOverlayContentPathBindings5;
        Object objM1830a;
        String str;
        AbstractC22676k.m65750j(fullScreenContentModal, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if ((map == null || map.isEmpty()) && ((map2 == null || map2.isEmpty()) && accumulatedState.isEmpty())) {
            return fullScreenContentModal;
        }
        Object id4 = fullScreenContentModal.getId();
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
            for (Object obj5 : iterable) {
                WithGeneratedBindings withGeneratedBindings = obj5 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj5 : null;
                if (withGeneratedBindings != null && (withGeneratedBindingsBind = withGeneratedBindings.bind(accumulatedState)) != null) {
                    obj5 = withGeneratedBindingsBind;
                }
                arrayList.add(obj5);
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
                    map3 = map;
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
                                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
                                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls6))) {
                                    str = (String) Integer.valueOf(((Number) objOverlayContentPathBindings).intValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                    str = (String) Long.valueOf(((Number) objOverlayContentPathBindings).longValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                    str = (String) Double.valueOf(((Number) objOverlayContentPathBindings).doubleValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                                    str = (String) Float.valueOf(((Number) objOverlayContentPathBindings).floatValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                    str = (String) Short.valueOf(((Number) objOverlayContentPathBindings).shortValue());
                                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
                                    str = (String) Byte.valueOf(((Number) objOverlayContentPathBindings).byteValue());
                                } else {
                                    objOverlayContentPathBindings = null;
                                }
                                objOverlayContentPathBindings = str;
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
                        map3 = map;
                        objOverlayContentPathBindings = id4;
                    } else {
                        map3 = map;
                    }
                }
            } else {
                map3 = map;
            }
        } else if (objOverlayContentPathBindings == null) {
            map3 = map;
        } else {
            objOverlayContentPathBindings = ContentPathBindingsKt.overlayContentPathBindings(map, "id", accumulatedState, objOverlayContentPathBindings, new Function1() { // from class: com.whoop.design.models.modal.FullScreenContentModalStateBindingKt$generatedBind$$inlined$resolveBinding$1
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
                    } catch (Exception unused3) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.modal.FullScreenContentModalStateBindingKt$generatedBind$$inlined$resolveBinding$2
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
            map3 = map;
        }
        String str2 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "id", accumulatedState, objOverlayContentPathBindings, "id", new Function1() { // from class: com.whoop.design.models.modal.FullScreenContentModalStateBindingKt$generatedBind$$inlined$resolveBinding$3
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
                } catch (Exception unused3) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.modal.FullScreenContentModalStateBindingKt$generatedBind$$inlined$resolveBinding$4
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
        }, new Function1() { // from class: com.whoop.design.models.modal.FullScreenContentModalStateBindingKt$generatedBind$$inlined$resolveBinding$5
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj6) {
                Object objM1830a2;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj6);
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
                        objM1830a2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c2);
                    } catch (Exception unused4) {
                        objM1830a2 = null;
                    }
                    if (objM1830a2 != null) {
                        return objM1830a2;
                    }
                    return null;
                }
                C22673i0 c22673i1 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(String.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (String) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(Long.TYPE))) {
                    return (String) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(Double.TYPE))) {
                    return (String) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(Float.TYPE))) {
                    return (String) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(Short.TYPE))) {
                    return (String) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (String) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        Object navigationBar = fullScreenContentModal.getNavigationBar();
        if (navigationBar == null) {
            objOverlayContentPathBindings2 = null;
        } else {
            if (navigationBar instanceof WithGeneratedBindings) {
                Object objBind2 = ((WithGeneratedBindings) navigationBar).bind(accumulatedState);
                if (!(objBind2 instanceof NavigationBarModel)) {
                    objBind2 = null;
                }
                obj = (NavigationBarModel) objBind2;
                if (obj == null) {
                    obj = navigationBar;
                }
            } else if (navigationBar instanceof List) {
                Iterable iterable2 = (Iterable) navigationBar;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
                for (Object obj6 : iterable2) {
                    WithGeneratedBindings withGeneratedBindings2 = obj6 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj6 : null;
                    if (withGeneratedBindings2 != null && (withGeneratedBindingsBind2 = withGeneratedBindings2.bind(accumulatedState)) != null) {
                        obj6 = withGeneratedBindingsBind2;
                    }
                    arrayList2.add(obj6);
                }
                obj = (NavigationBarModel) arrayList2;
            } else {
                obj = navigationBar;
            }
            objOverlayContentPathBindings2 = obj;
        }
        String strResolveContentBindingKey2 = map3 != null ? BindingLoggerKt.resolveContentBindingKey(map3, "navigationBar") : null;
        if (strResolveContentBindingKey2 != null) {
            Object objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
            if (objResolveStateRef2 != null) {
                BindingLoggerKt.logContentBinding("navigationBar", strResolveContentBindingKey2, objResolveStateRef2);
                Object objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                if ((objUnwrapForCoercion2 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion2) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                    objOverlayContentPathBindings2 = null;
                } else {
                    objOverlayContentPathBindings2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef2);
                    if (objOverlayContentPathBindings2 == null) {
                        objOverlayContentPathBindings2 = null;
                    } else if (objOverlayContentPathBindings2 instanceof JsonElement) {
                        JsonElement jsonElement2 = (JsonElement) objOverlayContentPathBindings2;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(NavigationBarModel.INSTANCE.serializer(), jsonElement2);
                        } catch (Exception unused3) {
                            objOverlayContentPathBindings2 = null;
                        }
                    } else if (!(objOverlayContentPathBindings2 instanceof NavigationBarModel)) {
                        if (objOverlayContentPathBindings2 instanceof Number) {
                            C22673i0 c22673i1 = AbstractC22671h0.f89337a;
                            InterfaceC21461d orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(NavigationBarModel.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings2 = (NavigationBarModel) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings2 = (NavigationBarModel) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings2 = (NavigationBarModel) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings2 = (NavigationBarModel) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings2 = (NavigationBarModel) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings2 = (NavigationBarModel) Byte.valueOf(((Number) objOverlayContentPathBindings2).byteValue());
                            } else {
                                objOverlayContentPathBindings2 = null;
                            }
                        } else if (objOverlayContentPathBindings2 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c2 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings2);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(NavigationBarModel.INSTANCE.serializer(), jsonPrimitiveM1841c2);
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
                        objOverlayContentPathBindings2 = navigationBar;
                    }
                }
            }
        } else if (objOverlayContentPathBindings2 != null) {
            objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(map3, "navigationBar", accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.design.models.modal.FullScreenContentModalStateBindingKt$generatedBind$$inlined$resolveBinding$6
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                    return invoke((NavigationBarModel) obj7);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(NavigationBarModel v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(NavigationBarModel.INSTANCE.serializer(), v13);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.modal.FullScreenContentModalStateBindingKt$generatedBind$$inlined$resolveBinding$7
                /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.items.NavigationBarModel, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final NavigationBarModel invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(NavigationBarModel.INSTANCE.serializer(), json);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
            });
        }
        NavigationBarModel navigationBarModel = (NavigationBarModel) DotPathBindingsKt.overlayAggregateBinding(map2, "navigationBar", accumulatedState, objOverlayContentPathBindings2, "navigationBar", new Function1() { // from class: com.whoop.design.models.modal.FullScreenContentModalStateBindingKt$generatedBind$$inlined$resolveBinding$8
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj7) {
                return invoke((NavigationBarModel) obj7);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(NavigationBarModel navigationBarModel2) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(NavigationBarModel.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, navigationBarModel2, interfaceC37138cM122336d);
                } catch (Exception unused5) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.modal.FullScreenContentModalStateBindingKt$generatedBind$$inlined$resolveBinding$9
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.items.NavigationBarModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final NavigationBarModel invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(NavigationBarModel.INSTANCE.serializer(), json);
                } catch (Exception unused5) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.modal.FullScreenContentModalStateBindingKt$generatedBind$$inlined$resolveBinding$10
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.items.NavigationBarModel, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.items.NavigationBarModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final NavigationBarModel invoke(Object obj7) {
                Object objM1830a2;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj7);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement3 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(NavigationBarModel.INSTANCE.serializer(), jsonElement3);
                    } catch (Exception unused5) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof NavigationBarModel) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(NavigationBarModel.INSTANCE.serializer(), jsonPrimitiveM1841c3);
                    } catch (Exception unused6) {
                        objM1830a2 = null;
                    }
                    if (objM1830a2 != null) {
                        return objM1830a2;
                    }
                    return null;
                }
                C22673i0 c22673i2 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(NavigationBarModel.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (NavigationBarModel) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Long.TYPE))) {
                    return (NavigationBarModel) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Double.TYPE))) {
                    return (NavigationBarModel) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Float.TYPE))) {
                    return (NavigationBarModel) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Short.TYPE))) {
                    return (NavigationBarModel) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (NavigationBarModel) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        List<DesignSystemModel> items = fullScreenContentModal.getItems();
        if (items == null) {
            objOverlayContentPathBindings3 = null;
        } else {
            if (items instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind6 = ((WithGeneratedBindings) items).bind(accumulatedState);
                if (!(withGeneratedBindingsBind6 instanceof List)) {
                    withGeneratedBindingsBind6 = null;
                }
                list = (List) withGeneratedBindingsBind6;
                if (list == null) {
                    list = items;
                }
            } else {
                List<DesignSystemModel> list2 = items;
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                for (Object obj7 : list2) {
                    WithGeneratedBindings withGeneratedBindings3 = obj7 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj7 : null;
                    if (withGeneratedBindings3 != null && (withGeneratedBindingsBind3 = withGeneratedBindings3.bind(accumulatedState)) != null) {
                        obj7 = withGeneratedBindingsBind3;
                    }
                    arrayList3.add(obj7);
                }
                list = arrayList3;
            }
            objOverlayContentPathBindings3 = list;
        }
        String strResolveContentBindingKey3 = map3 != null ? BindingLoggerKt.resolveContentBindingKey(map3, "items") : null;
        if (strResolveContentBindingKey3 != null) {
            Object objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
            if (objResolveStateRef3 != null) {
                BindingLoggerKt.logContentBinding("items", strResolveContentBindingKey3, objResolveStateRef3);
                Object objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if ((objUnwrapForCoercion3 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion3) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                    objOverlayContentPathBindings3 = null;
                } else {
                    objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                    if (objOverlayContentPathBindings3 == null) {
                        objOverlayContentPathBindings3 = null;
                    } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                        try {
                            objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))), (JsonElement) objOverlayContentPathBindings3);
                        } catch (Exception unused5) {
                            objOverlayContentPathBindings3 = null;
                        }
                    } else if (!(objOverlayContentPathBindings3 instanceof List)) {
                        if (objOverlayContentPathBindings3 instanceof Number) {
                            C22673i0 c22673i2 = AbstractC22671h0.f89337a;
                            InterfaceC21461d orCreateKotlinClass3 = c22673i2.getOrCreateKotlinClass(List.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings3 = (List) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings3 = (List) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings3 = (List) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings3 = (List) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings3 = (List) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i2.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings3 = (List) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                            } else {
                                objOverlayContentPathBindings3 = null;
                            }
                        } else if (objOverlayContentPathBindings3 instanceof String) {
                            try {
                                objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))), AbstractC0770m.m1841c((String) objOverlayContentPathBindings3));
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
                        objOverlayContentPathBindings3 = items;
                    }
                }
            }
        } else if (objOverlayContentPathBindings3 != null) {
            objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(map3, "items", accumulatedState, objOverlayContentPathBindings3, new Function1() { // from class: com.whoop.design.models.modal.FullScreenContentModalStateBindingKt$generatedBind$$inlined$resolveBinding$11
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                    return invoke((List<? extends DesignSystemModel>) obj8);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(List<? extends DesignSystemModel> v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        ArrayListSerializer arrayListSerializer = new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)));
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, v13, arrayListSerializer);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.modal.FullScreenContentModalStateBindingKt$generatedBind$$inlined$resolveBinding$12
                /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
                @Override // p715kotlin.jvm.functions.Function1
                public final List<? extends DesignSystemModel> invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))), json);
                    } catch (Exception unused7) {
                        return null;
                    }
                }
            });
        }
        List<DesignSystemModel> items2 = (List) DotPathBindingsKt.overlayAggregateBinding(map2, "items", accumulatedState, objOverlayContentPathBindings3, "items", new Function1() { // from class: com.whoop.design.models.modal.FullScreenContentModalStateBindingKt$generatedBind$$inlined$resolveBinding$13
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                return invoke((List<? extends DesignSystemModel>) obj8);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(List<? extends DesignSystemModel> list3) {
                try {
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, list3, interfaceC37138cM122336d);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.modal.FullScreenContentModalStateBindingKt$generatedBind$$inlined$resolveBinding$14
            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final List<? extends DesignSystemModel> invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))), json);
                } catch (Exception unused7) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.modal.FullScreenContentModalStateBindingKt$generatedBind$$inlined$resolveBinding$15
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final List<? extends DesignSystemModel> invoke(Object obj8) {
                Object objM1830a2;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj8);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))), (JsonElement) UnwrapForCoercion);
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
                    try {
                        objM1830a2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))), AbstractC0770m.m1841c((String) UnwrapForCoercion));
                    } catch (Exception unused8) {
                        objM1830a2 = null;
                    }
                    if (objM1830a2 != null) {
                        return objM1830a2;
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
            items2 = fullScreenContentModal.getItems();
        }
        List<DesignSystemModel> list3 = items2;
        Object footer = fullScreenContentModal.getFooter();
        if (footer == null) {
            objOverlayContentPathBindings4 = null;
        } else {
            if (footer instanceof WithGeneratedBindings) {
                Object objBind3 = ((WithGeneratedBindings) footer).bind(accumulatedState);
                if (!(objBind3 instanceof FooterModel)) {
                    objBind3 = null;
                }
                obj2 = (FooterModel) objBind3;
                if (obj2 == null) {
                    obj2 = footer;
                }
            } else if (footer instanceof List) {
                Iterable iterable3 = (Iterable) footer;
                ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable3, 10));
                for (Object obj8 : iterable3) {
                    WithGeneratedBindings withGeneratedBindings4 = obj8 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj8 : null;
                    if (withGeneratedBindings4 != null && (withGeneratedBindingsBind4 = withGeneratedBindings4.bind(accumulatedState)) != null) {
                        obj8 = withGeneratedBindingsBind4;
                    }
                    arrayList4.add(obj8);
                }
                obj2 = (FooterModel) arrayList4;
            } else {
                obj2 = footer;
            }
            objOverlayContentPathBindings4 = obj2;
        }
        String strResolveContentBindingKey4 = map3 != null ? BindingLoggerKt.resolveContentBindingKey(map3, "footer") : null;
        if (strResolveContentBindingKey4 != null) {
            Object objResolveStateRef4 = StateLookupKt.resolveStateRef(strResolveContentBindingKey4, accumulatedState);
            if (objResolveStateRef4 != null) {
                BindingLoggerKt.logContentBinding("footer", strResolveContentBindingKey4, objResolveStateRef4);
                Object objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if ((objUnwrapForCoercion4 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion4) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                    objOverlayContentPathBindings4 = null;
                } else {
                    objOverlayContentPathBindings4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                    if (objOverlayContentPathBindings4 == null) {
                        objOverlayContentPathBindings4 = null;
                    } else if (objOverlayContentPathBindings4 instanceof JsonElement) {
                        JsonElement jsonElement3 = (JsonElement) objOverlayContentPathBindings4;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(FooterModel.INSTANCE.serializer(), jsonElement3);
                        } catch (Exception unused7) {
                            objOverlayContentPathBindings4 = null;
                        }
                    } else if (!(objOverlayContentPathBindings4 instanceof FooterModel)) {
                        if (objOverlayContentPathBindings4 instanceof Number) {
                            C22673i0 c22673i3 = AbstractC22671h0.f89337a;
                            InterfaceC21461d orCreateKotlinClass4 = c22673i3.getOrCreateKotlinClass(FooterModel.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings4 = (FooterModel) Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings4 = (FooterModel) Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings4 = (FooterModel) Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings4 = (FooterModel) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings4 = (FooterModel) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i3.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings4 = (FooterModel) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                            } else {
                                objOverlayContentPathBindings4 = null;
                            }
                        } else if (objOverlayContentPathBindings4 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings4);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(FooterModel.INSTANCE.serializer(), jsonPrimitiveM1841c3);
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
                        objOverlayContentPathBindings4 = footer;
                    }
                }
            }
        } else if (objOverlayContentPathBindings4 != null) {
            objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(map3, "footer", accumulatedState, objOverlayContentPathBindings4, new Function1() { // from class: com.whoop.design.models.modal.FullScreenContentModalStateBindingKt$generatedBind$$inlined$resolveBinding$16
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj9) {
                    return invoke((FooterModel) obj9);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(FooterModel v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(FooterModel.INSTANCE.serializer(), v13);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.modal.FullScreenContentModalStateBindingKt$generatedBind$$inlined$resolveBinding$17
                /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.items.FooterModel, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final FooterModel invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(FooterModel.INSTANCE.serializer(), json);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
            });
        }
        FooterModel footerModel = (FooterModel) DotPathBindingsKt.overlayAggregateBinding(map2, "footer", accumulatedState, objOverlayContentPathBindings4, "footer", new Function1() { // from class: com.whoop.design.models.modal.FullScreenContentModalStateBindingKt$generatedBind$$inlined$resolveBinding$18
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj9) {
                return invoke((FooterModel) obj9);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(FooterModel footerModel2) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(FooterModel.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, footerModel2, interfaceC37138cM122336d);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.modal.FullScreenContentModalStateBindingKt$generatedBind$$inlined$resolveBinding$19
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.items.FooterModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final FooterModel invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(FooterModel.INSTANCE.serializer(), json);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.modal.FullScreenContentModalStateBindingKt$generatedBind$$inlined$resolveBinding$20
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.items.FooterModel, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.items.FooterModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final FooterModel invoke(Object obj9) {
                Object objM1830a2;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj9);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement4 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(FooterModel.INSTANCE.serializer(), jsonElement4);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof FooterModel) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(FooterModel.INSTANCE.serializer(), jsonPrimitiveM1841c4);
                    } catch (Exception unused10) {
                        objM1830a2 = null;
                    }
                    if (objM1830a2 != null) {
                        return objM1830a2;
                    }
                    return null;
                }
                C22673i0 c22673i4 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass5 = c22673i4.getOrCreateKotlinClass(FooterModel.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (FooterModel) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Long.TYPE))) {
                    return (FooterModel) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Double.TYPE))) {
                    return (FooterModel) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Float.TYPE))) {
                    return (FooterModel) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Short.TYPE))) {
                    return (FooterModel) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (FooterModel) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        Object backgroundImageUrl = fullScreenContentModal.getBackgroundImageUrl();
        if (backgroundImageUrl == null) {
            obj4 = null;
        } else {
            if (backgroundImageUrl instanceof WithGeneratedBindings) {
                Object objBind4 = ((WithGeneratedBindings) backgroundImageUrl).bind(accumulatedState);
                if (!(objBind4 instanceof String)) {
                    objBind4 = null;
                }
                obj3 = (String) objBind4;
                if (obj3 == null) {
                    obj3 = backgroundImageUrl;
                }
            } else if (backgroundImageUrl instanceof List) {
                Iterable iterable4 = (Iterable) backgroundImageUrl;
                ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(iterable4, 10));
                for (Object obj9 : iterable4) {
                    WithGeneratedBindings withGeneratedBindings5 = obj9 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj9 : null;
                    if (withGeneratedBindings5 != null && (withGeneratedBindingsBind5 = withGeneratedBindings5.bind(accumulatedState)) != null) {
                        obj9 = withGeneratedBindingsBind5;
                    }
                    arrayList5.add(obj9);
                }
                obj3 = (String) arrayList5;
            } else {
                obj3 = backgroundImageUrl;
            }
            obj4 = obj3;
        }
        String strResolveContentBindingKey5 = map3 != null ? BindingLoggerKt.resolveContentBindingKey(map3, "backgroundImageUrl") : null;
        if (strResolveContentBindingKey5 != null) {
            Object objResolveStateRef5 = StateLookupKt.resolveStateRef(strResolveContentBindingKey5, accumulatedState);
            if (objResolveStateRef5 != null) {
                BindingLoggerKt.logContentBinding("backgroundImageUrl", strResolveContentBindingKey5, objResolveStateRef5);
                Object objUnwrapForCoercion5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                if ((objUnwrapForCoercion5 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion5) && AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                    obj4 = null;
                } else {
                    Object objUnwrapForCoercion6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                    if (objUnwrapForCoercion6 == null) {
                        objOverlayContentPathBindings5 = null;
                    } else if (objUnwrapForCoercion6 instanceof JsonElement) {
                        JsonElement jsonElement4 = (JsonElement) objUnwrapForCoercion6;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement4);
                        } catch (Exception unused9) {
                            objOverlayContentPathBindings5 = null;
                        }
                    } else {
                        boolean z13 = objUnwrapForCoercion6 instanceof String;
                        if (z13) {
                            objOverlayContentPathBindings5 = objUnwrapForCoercion6;
                        } else if (objUnwrapForCoercion6 instanceof Number) {
                            C22673i0 c22673i4 = AbstractC22671h0.f89337a;
                            InterfaceC21461d orCreateKotlinClass5 = c22673i4.getOrCreateKotlinClass(String.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls6))) {
                                objOverlayContentPathBindings5 = (String) Integer.valueOf(((Number) objUnwrapForCoercion6).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls5))) {
                                objOverlayContentPathBindings5 = (String) Long.valueOf(((Number) objUnwrapForCoercion6).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls4))) {
                                objOverlayContentPathBindings5 = (String) Double.valueOf(((Number) objUnwrapForCoercion6).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls3))) {
                                objOverlayContentPathBindings5 = (String) Float.valueOf(((Number) objUnwrapForCoercion6).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls2))) {
                                objOverlayContentPathBindings5 = (String) Short.valueOf(((Number) objUnwrapForCoercion6).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i4.getOrCreateKotlinClass(cls))) {
                                objOverlayContentPathBindings5 = (String) Byte.valueOf(((Number) objUnwrapForCoercion6).byteValue());
                            } else {
                                objOverlayContentPathBindings5 = null;
                            }
                        } else if (z13) {
                            JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) objUnwrapForCoercion6);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c4);
                            } catch (Exception unused10) {
                                objM1830a = null;
                            }
                            if (objM1830a != null) {
                                objOverlayContentPathBindings5 = objM1830a;
                            } else {
                                objOverlayContentPathBindings5 = null;
                            }
                        } else {
                            objOverlayContentPathBindings5 = null;
                        }
                    }
                    obj4 = objOverlayContentPathBindings5 == null ? backgroundImageUrl : objOverlayContentPathBindings5;
                }
            }
        } else if (obj4 != null) {
            objOverlayContentPathBindings5 = ContentPathBindingsKt.overlayContentPathBindings(map3, "backgroundImageUrl", accumulatedState, obj4, new Function1() { // from class: com.whoop.design.models.modal.FullScreenContentModalStateBindingKt$generatedBind$$inlined$resolveBinding$21
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
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.modal.FullScreenContentModalStateBindingKt$generatedBind$$inlined$resolveBinding$22
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
        return (FullScreenContentModal) ContentBindingResolverKt.copyBindingsFrom(new FullScreenContentModal(str2, navigationBarModel, list3, footerModel, (String) DotPathBindingsKt.overlayAggregateBinding(map2, "backgroundImageUrl", accumulatedState, obj4, "backgroundImageUrl", new Function1() { // from class: com.whoop.design.models.modal.FullScreenContentModalStateBindingKt$generatedBind$$inlined$resolveBinding$23
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj10) {
                return invoke((String) obj10);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(String str3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, str3, interfaceC37138cM122336d);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.modal.FullScreenContentModalStateBindingKt$generatedBind$$inlined$resolveBinding$24
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
        }, new Function1() { // from class: com.whoop.design.models.modal.FullScreenContentModalStateBindingKt$generatedBind$$inlined$resolveBinding$25
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj10) {
                Object objM1830a2;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj10);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement5 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonElement5);
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
                    JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(StringSerializer.INSTANCE, jsonPrimitiveM1841c5);
                    } catch (Exception unused12) {
                        objM1830a2 = null;
                    }
                    if (objM1830a2 != null) {
                        return objM1830a2;
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
        })), fullScreenContentModal);
    }

    public static /* synthetic */ FullScreenContentModal generatedBind$default(FullScreenContentModal fullScreenContentModal, Map map, Map map2, Map map3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map2 = null;
        }
        return generatedBind(fullScreenContentModal, map, map2, map3);
    }
}
