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
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003¨\u0006\t"}, m65681d2 = {"generatedBind", "Lcom/whoop/design/models/modal/BottomSheet;", "contentBinding", "", "", "aggregateBindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "accumulatedState", "", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class BottomSheetStateBindingKt {
    /* JADX WARN: Code duplicated, block: B:128:0x0222  */
    /* JADX WARN: Code duplicated, block: B:147:0x0262  */
    /* JADX WARN: Code duplicated, block: B:233:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:306:0x0578  */
    /* JADX WARN: Code duplicated, block: B:325:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:397:0x071a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:472:0x0897 A[PHI: r4
      0x0897: PHI (r4v70 java.lang.Object) = (r4v46 java.lang.Object), (r4v50 java.lang.Object) binds: [B:471:0x0895, B:499:0x095a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final BottomSheet generatedBind(BottomSheet bottomSheet, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, ? extends Object> accumulatedState) {
        Object objOverlayContentPathBindings;
        WithGeneratedBindings withGeneratedBindingsBind;
        Object obj;
        WithGeneratedBindings withGeneratedBindingsBind2;
        Object objOverlayContentPathBindings2;
        Object obj2;
        List list;
        WithGeneratedBindings withGeneratedBindingsBind3;
        Object objOverlayContentPathBindings3;
        Object obj3;
        Object obj4;
        WithGeneratedBindings withGeneratedBindingsBind4;
        Object objOverlayContentPathBindings4;
        Object obj5;
        Object objOverlayContentPathBindings5;
        Object obj6;
        Object objOverlayContentPathBindings6;
        AbstractC22676k.m65750j(bottomSheet, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if ((map == null || map.isEmpty()) && ((map2 == null || map2.isEmpty()) && accumulatedState.isEmpty())) {
            return bottomSheet;
        }
        Object id4 = bottomSheet.getId();
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
            for (Object obj7 : iterable) {
                WithGeneratedBindings withGeneratedBindings = obj7 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj7 : null;
                if (withGeneratedBindings != null && (withGeneratedBindingsBind = withGeneratedBindings.bind(accumulatedState)) != null) {
                    obj7 = withGeneratedBindingsBind;
                }
                arrayList.add(obj7);
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
            objOverlayContentPathBindings = ContentPathBindingsKt.overlayContentPathBindings(map, "id", accumulatedState, objOverlayContentPathBindings, new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$1
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                    return invoke((String) obj8);
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
            }, new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$2
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
        String id5 = (String) DotPathBindingsKt.overlayAggregateBinding(map2, "id", accumulatedState, objOverlayContentPathBindings, "id", new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$3
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj8) {
                return invoke((String) obj8);
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
        }, new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$4
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
        }, new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$5
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
            @Override // p715kotlin.jvm.functions.Function1
            public final String invoke(Object obj8) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj8);
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
            id5 = bottomSheet.getId();
        }
        String str = id5;
        Object navigationBar = bottomSheet.getNavigationBar();
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
                for (Object obj8 : iterable2) {
                    WithGeneratedBindings withGeneratedBindings2 = obj8 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj8 : null;
                    if (withGeneratedBindings2 != null && (withGeneratedBindingsBind2 = withGeneratedBindings2.bind(accumulatedState)) != null) {
                        obj8 = withGeneratedBindingsBind2;
                    }
                    arrayList2.add(obj8);
                }
                obj = (NavigationBarModel) arrayList2;
            } else {
                obj = navigationBar;
            }
            objOverlayContentPathBindings2 = obj;
        }
        String strResolveContentBindingKey2 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "navigationBar") : null;
        if (strResolveContentBindingKey2 != null) {
            Object objResolveStateRef2 = StateLookupKt.resolveStateRef(strResolveContentBindingKey2, accumulatedState);
            if (objResolveStateRef2 != null) {
                BindingLoggerKt.logContentBinding("navigationBar", strResolveContentBindingKey2, objResolveStateRef2);
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
                        objOverlayContentPathBindings2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(NavigationBarModel.INSTANCE.serializer(), jsonElement2);
                    } catch (Exception unused3) {
                        objOverlayContentPathBindings2 = null;
                    }
                } else if (!(objOverlayContentPathBindings2 instanceof NavigationBarModel)) {
                    if (objOverlayContentPathBindings2 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a2 = AbstractC22671h0.m65688a(NavigationBarModel.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings2 = (NavigationBarModel) Integer.valueOf(((Number) objOverlayContentPathBindings2).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings2 = (NavigationBarModel) Long.valueOf(((Number) objOverlayContentPathBindings2).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings2 = (NavigationBarModel) Double.valueOf(((Number) objOverlayContentPathBindings2).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings2 = (NavigationBarModel) Float.valueOf(((Number) objOverlayContentPathBindings2).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings2 = (NavigationBarModel) Short.valueOf(((Number) objOverlayContentPathBindings2).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a2, AbstractC22671h0.m65688a(cls))) {
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
            } else {
                obj2 = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
            }
        } else {
            obj2 = ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY;
            if (objOverlayContentPathBindings2 != null) {
                objOverlayContentPathBindings2 = ContentPathBindingsKt.overlayContentPathBindings(map, "navigationBar", accumulatedState, objOverlayContentPathBindings2, new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$6
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj9) {
                        return invoke((NavigationBarModel) obj9);
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
                }, new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$7
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
        }
        Object obj9 = obj2;
        NavigationBarModel navigationBarModel = (NavigationBarModel) DotPathBindingsKt.overlayAggregateBinding(map2, "navigationBar", accumulatedState, objOverlayContentPathBindings2, "navigationBar", new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$8
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj10) {
                return invoke((NavigationBarModel) obj10);
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
        }, new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$9
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
        }, new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$10
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.items.NavigationBarModel, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.items.NavigationBarModel, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final NavigationBarModel invoke(Object obj10) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj10);
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
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(NavigationBarModel.INSTANCE.serializer(), jsonPrimitiveM1841c3);
                    } catch (Exception unused6) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(NavigationBarModel.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (NavigationBarModel) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (NavigationBarModel) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (NavigationBarModel) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (NavigationBarModel) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (NavigationBarModel) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (NavigationBarModel) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        List<DesignSystemModel> items = bottomSheet.getItems();
        if (items == null) {
            objOverlayContentPathBindings3 = null;
        } else {
            if (items instanceof WithGeneratedBindings) {
                WithGeneratedBindings withGeneratedBindingsBind5 = ((WithGeneratedBindings) items).bind(accumulatedState);
                if (!(withGeneratedBindingsBind5 instanceof List)) {
                    withGeneratedBindingsBind5 = null;
                }
                list = (List) withGeneratedBindingsBind5;
                if (list == null) {
                    list = items;
                }
            } else {
                List<DesignSystemModel> list2 = items;
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                for (Object obj10 : list2) {
                    WithGeneratedBindings withGeneratedBindings3 = obj10 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj10 : null;
                    if (withGeneratedBindings3 != null && (withGeneratedBindingsBind3 = withGeneratedBindings3.bind(accumulatedState)) != null) {
                        obj10 = withGeneratedBindingsBind3;
                    }
                    arrayList3.add(obj10);
                }
                list = arrayList3;
            }
            objOverlayContentPathBindings3 = list;
        }
        String strResolveContentBindingKey3 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "items") : null;
        if (strResolveContentBindingKey3 != null) {
            Object objResolveStateRef3 = StateLookupKt.resolveStateRef(strResolveContentBindingKey3, accumulatedState);
            if (objResolveStateRef3 != null) {
                BindingLoggerKt.logContentBinding("items", strResolveContentBindingKey3, objResolveStateRef3);
                Object objUnwrapForCoercion3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if ((objUnwrapForCoercion3 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion3)) {
                    obj3 = obj9;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj3), Boolean.TRUE)) {
                        objOverlayContentPathBindings3 = null;
                    }
                } else {
                    obj3 = obj9;
                }
                objOverlayContentPathBindings3 = BindCoercionKt.unwrapForCoercion(objResolveStateRef3);
                if (objOverlayContentPathBindings3 == null) {
                    objOverlayContentPathBindings3 = null;
                } else if (objOverlayContentPathBindings3 instanceof JsonElement) {
                    try {
                        objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(DesignSystemModel.class))), (JsonElement) objOverlayContentPathBindings3);
                    } catch (Exception unused5) {
                        objOverlayContentPathBindings3 = null;
                    }
                } else if (!(objOverlayContentPathBindings3 instanceof List)) {
                    if (objOverlayContentPathBindings3 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a3 = AbstractC22671h0.m65688a(List.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings3 = (List) Integer.valueOf(((Number) objOverlayContentPathBindings3).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings3 = (List) Long.valueOf(((Number) objOverlayContentPathBindings3).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings3 = (List) Double.valueOf(((Number) objOverlayContentPathBindings3).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings3 = (List) Float.valueOf(((Number) objOverlayContentPathBindings3).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings3 = (List) Short.valueOf(((Number) objOverlayContentPathBindings3).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a3, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings3 = (List) Byte.valueOf(((Number) objOverlayContentPathBindings3).byteValue());
                        } else {
                            objOverlayContentPathBindings3 = null;
                        }
                    } else if (objOverlayContentPathBindings3 instanceof String) {
                        try {
                            objOverlayContentPathBindings3 = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().m1834e(), AbstractC22671h0.m65688a(DesignSystemModel.class))), AbstractC0770m.m1841c((String) objOverlayContentPathBindings3));
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
            } else {
                obj3 = obj9;
            }
        } else {
            obj3 = obj9;
            if (objOverlayContentPathBindings3 != null) {
                objOverlayContentPathBindings3 = ContentPathBindingsKt.overlayContentPathBindings(map, "items", accumulatedState, objOverlayContentPathBindings3, new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$11
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj11) {
                        return invoke((List<? extends DesignSystemModel>) obj11);
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
                }, new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$12
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
        }
        Object obj11 = obj3;
        List<DesignSystemModel> items2 = (List) DotPathBindingsKt.overlayAggregateBinding(map2, "items", accumulatedState, objOverlayContentPathBindings3, "items", new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$13
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj12) {
                return invoke((List<? extends DesignSystemModel>) obj12);
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
        }, new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$14
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
        }, new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$15
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List<? extends com.whoop.design.models.DesignSystemModel>] */
            @Override // p715kotlin.jvm.functions.Function1
            public final List<? extends DesignSystemModel> invoke(Object obj12) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj12);
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
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(new ArrayListSerializer(AbstractC35862g.m113842e(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class))), AbstractC0770m.m1841c((String) UnwrapForCoercion));
                    } catch (Exception unused8) {
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
        if (items2 == null) {
            items2 = bottomSheet.getItems();
        }
        List<DesignSystemModel> list3 = items2;
        Object height = bottomSheet.getHeight();
        if (height == null) {
            objOverlayContentPathBindings4 = null;
        } else {
            if (height instanceof WithGeneratedBindings) {
                Object objBind3 = ((WithGeneratedBindings) height).bind(accumulatedState);
                if (!(objBind3 instanceof BottomSheetHeight)) {
                    objBind3 = null;
                }
                obj4 = (BottomSheetHeight) objBind3;
                if (obj4 == null) {
                    obj4 = height;
                }
            } else if (height instanceof List) {
                Iterable iterable3 = (Iterable) height;
                ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable3, 10));
                for (Object obj12 : iterable3) {
                    WithGeneratedBindings withGeneratedBindings4 = obj12 instanceof WithGeneratedBindings ? (WithGeneratedBindings) obj12 : null;
                    if (withGeneratedBindings4 != null && (withGeneratedBindingsBind4 = withGeneratedBindings4.bind(accumulatedState)) != null) {
                        obj12 = withGeneratedBindingsBind4;
                    }
                    arrayList4.add(obj12);
                }
                obj4 = (BottomSheetHeight) arrayList4;
            } else {
                obj4 = height;
            }
            objOverlayContentPathBindings4 = obj4;
        }
        String strResolveContentBindingKey4 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "height") : null;
        if (strResolveContentBindingKey4 != null) {
            Object objResolveStateRef4 = StateLookupKt.resolveStateRef(strResolveContentBindingKey4, accumulatedState);
            if (objResolveStateRef4 != null) {
                BindingLoggerKt.logContentBinding("height", strResolveContentBindingKey4, objResolveStateRef4);
                Object objUnwrapForCoercion4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if ((objUnwrapForCoercion4 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion4)) {
                    obj5 = obj11;
                    if (AbstractC22676k.m65745e(accumulatedState.get(obj5), Boolean.TRUE)) {
                        objOverlayContentPathBindings4 = null;
                    }
                } else {
                    obj5 = obj11;
                }
                objOverlayContentPathBindings4 = BindCoercionKt.unwrapForCoercion(objResolveStateRef4);
                if (objOverlayContentPathBindings4 == null) {
                    objOverlayContentPathBindings4 = null;
                } else if (objOverlayContentPathBindings4 instanceof JsonElement) {
                    JsonElement jsonElement3 = (JsonElement) objOverlayContentPathBindings4;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BottomSheetHeight.INSTANCE.serializer(), jsonElement3);
                    } catch (Exception unused7) {
                        objOverlayContentPathBindings4 = null;
                    }
                } else if (!(objOverlayContentPathBindings4 instanceof BottomSheetHeight)) {
                    if (objOverlayContentPathBindings4 instanceof Number) {
                        InterfaceC21461d interfaceC21461dM65688a4 = AbstractC22671h0.m65688a(BottomSheetHeight.class);
                        if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls6))) {
                            objOverlayContentPathBindings4 = (BottomSheetHeight) Integer.valueOf(((Number) objOverlayContentPathBindings4).intValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls5))) {
                            objOverlayContentPathBindings4 = (BottomSheetHeight) Long.valueOf(((Number) objOverlayContentPathBindings4).longValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls4))) {
                            objOverlayContentPathBindings4 = (BottomSheetHeight) Double.valueOf(((Number) objOverlayContentPathBindings4).doubleValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls3))) {
                            objOverlayContentPathBindings4 = (BottomSheetHeight) Float.valueOf(((Number) objOverlayContentPathBindings4).floatValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls2))) {
                            objOverlayContentPathBindings4 = (BottomSheetHeight) Short.valueOf(((Number) objOverlayContentPathBindings4).shortValue());
                        } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a4, AbstractC22671h0.m65688a(cls))) {
                            objOverlayContentPathBindings4 = (BottomSheetHeight) Byte.valueOf(((Number) objOverlayContentPathBindings4).byteValue());
                        } else {
                            objOverlayContentPathBindings4 = null;
                        }
                    } else if (objOverlayContentPathBindings4 instanceof String) {
                        JsonPrimitive jsonPrimitiveM1841c3 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings4);
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings4 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BottomSheetHeight.INSTANCE.serializer(), jsonPrimitiveM1841c3);
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
                    objOverlayContentPathBindings4 = height;
                }
            } else {
                obj5 = obj11;
            }
        } else {
            obj5 = obj11;
            if (objOverlayContentPathBindings4 != null) {
                objOverlayContentPathBindings4 = ContentPathBindingsKt.overlayContentPathBindings(map, "height", accumulatedState, objOverlayContentPathBindings4, new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$16
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj13) {
                        return invoke((BottomSheetHeight) obj13);
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final JsonElement invoke(BottomSheetHeight v13) {
                        AbstractC22676k.m65750j(v13, "v");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1832c(BottomSheetHeight.INSTANCE.serializer(), v13);
                        } catch (Exception unused9) {
                            return null;
                        }
                    }
                }, new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$17
                    /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.modal.BottomSheetHeight, java.lang.Object] */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final BottomSheetHeight invoke(JsonElement json) {
                        AbstractC22676k.m65750j(json, "json");
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            return StateBindingDeserializerKt.getStateBindingJson().m1830a(BottomSheetHeight.INSTANCE.serializer(), json);
                        } catch (Exception unused9) {
                            return null;
                        }
                    }
                });
            }
        }
        BottomSheetHeight height2 = (BottomSheetHeight) DotPathBindingsKt.overlayAggregateBinding(map2, "height", accumulatedState, objOverlayContentPathBindings4, "height", new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$18
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj13) {
                return invoke((BottomSheetHeight) obj13);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(BottomSheetHeight bottomSheetHeight) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(BottomSheetHeight.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, bottomSheetHeight, interfaceC37138cM122336d);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$19
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.modal.BottomSheetHeight, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final BottomSheetHeight invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(BottomSheetHeight.INSTANCE.serializer(), json);
                } catch (Exception unused9) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$20
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.modal.BottomSheetHeight, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.modal.BottomSheetHeight, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final BottomSheetHeight invoke(Object obj13) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj13);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement4 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BottomSheetHeight.INSTANCE.serializer(), jsonElement4);
                    } catch (Exception unused9) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof BottomSheetHeight) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(BottomSheetHeight.INSTANCE.serializer(), jsonPrimitiveM1841c4);
                    } catch (Exception unused10) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(BottomSheetHeight.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (BottomSheetHeight) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (BottomSheetHeight) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (BottomSheetHeight) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (BottomSheetHeight) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (BottomSheetHeight) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (BottomSheetHeight) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (height2 == null) {
            height2 = bottomSheet.getHeight();
        }
        BottomSheetHeight bottomSheetHeight = height2;
        BottomSheetFixedHeader fixedHeader = bottomSheet.getFixedHeader();
        if (fixedHeader == null) {
            objOverlayContentPathBindings5 = null;
        } else {
            WithGeneratedBindings withGeneratedBindingsBind6 = fixedHeader.bind(accumulatedState);
            if (!(withGeneratedBindingsBind6 instanceof BottomSheetFixedHeader)) {
                withGeneratedBindingsBind6 = null;
            }
            BottomSheetFixedHeader bottomSheetFixedHeader = (BottomSheetFixedHeader) withGeneratedBindingsBind6;
            if (bottomSheetFixedHeader == null) {
                bottomSheetFixedHeader = fixedHeader;
            }
            objOverlayContentPathBindings5 = bottomSheetFixedHeader;
        }
        String strResolveContentBindingKey5 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "fixedHeader") : null;
        if (strResolveContentBindingKey5 != null) {
            Object objResolveStateRef5 = StateLookupKt.resolveStateRef(strResolveContentBindingKey5, accumulatedState);
            if (objResolveStateRef5 != null) {
                BindingLoggerKt.logContentBinding("fixedHeader", strResolveContentBindingKey5, objResolveStateRef5);
                Object objUnwrapForCoercion5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                if ((objUnwrapForCoercion5 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion5) && AbstractC22676k.m65745e(accumulatedState.get(obj5), Boolean.TRUE)) {
                    objOverlayContentPathBindings5 = null;
                } else {
                    objOverlayContentPathBindings5 = BindCoercionKt.unwrapForCoercion(objResolveStateRef5);
                    if (objOverlayContentPathBindings5 == null) {
                        objOverlayContentPathBindings5 = null;
                    } else if (objOverlayContentPathBindings5 instanceof JsonElement) {
                        JsonElement jsonElement4 = (JsonElement) objOverlayContentPathBindings5;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BottomSheetFixedHeader.INSTANCE.serializer(), jsonElement4);
                        } catch (Exception unused9) {
                            objOverlayContentPathBindings5 = null;
                        }
                    } else if (!(objOverlayContentPathBindings5 instanceof BottomSheetFixedHeader)) {
                        if (objOverlayContentPathBindings5 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a5 = AbstractC22671h0.m65688a(BottomSheetFixedHeader.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings5 = (BottomSheetFixedHeader) Integer.valueOf(((Number) objOverlayContentPathBindings5).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings5 = (BottomSheetFixedHeader) Long.valueOf(((Number) objOverlayContentPathBindings5).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings5 = (BottomSheetFixedHeader) Double.valueOf(((Number) objOverlayContentPathBindings5).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings5 = (BottomSheetFixedHeader) Float.valueOf(((Number) objOverlayContentPathBindings5).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings5 = (BottomSheetFixedHeader) Short.valueOf(((Number) objOverlayContentPathBindings5).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a5, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings5 = (BottomSheetFixedHeader) Byte.valueOf(((Number) objOverlayContentPathBindings5).byteValue());
                            } else {
                                objOverlayContentPathBindings5 = null;
                            }
                        } else if (objOverlayContentPathBindings5 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c4 = AbstractC0770m.m1841c((String) objOverlayContentPathBindings5);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objOverlayContentPathBindings5 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BottomSheetFixedHeader.INSTANCE.serializer(), jsonPrimitiveM1841c4);
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
                        objOverlayContentPathBindings5 = fixedHeader;
                    }
                }
            }
        } else if (objOverlayContentPathBindings5 != null) {
            objOverlayContentPathBindings5 = ContentPathBindingsKt.overlayContentPathBindings(map, "fixedHeader", accumulatedState, objOverlayContentPathBindings5, new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$21
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj13) {
                    return invoke((BottomSheetFixedHeader) obj13);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(BottomSheetFixedHeader v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(BottomSheetFixedHeader.INSTANCE.serializer(), v13);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$22
                /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.modal.BottomSheetFixedHeader, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final BottomSheetFixedHeader invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BottomSheetFixedHeader.INSTANCE.serializer(), json);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
            });
        }
        BottomSheetFixedHeader bottomSheetFixedHeader2 = (BottomSheetFixedHeader) DotPathBindingsKt.overlayAggregateBinding(map2, "fixedHeader", accumulatedState, objOverlayContentPathBindings5, "fixedHeader", new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$23
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj13) {
                return invoke((BottomSheetFixedHeader) obj13);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(BottomSheetFixedHeader bottomSheetFixedHeader3) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(BottomSheetFixedHeader.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, bottomSheetFixedHeader3, interfaceC37138cM122336d);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$24
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.modal.BottomSheetFixedHeader, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final BottomSheetFixedHeader invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(BottomSheetFixedHeader.INSTANCE.serializer(), json);
                } catch (Exception unused11) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$25
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.modal.BottomSheetFixedHeader, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.modal.BottomSheetFixedHeader, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final BottomSheetFixedHeader invoke(Object obj13) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj13);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement5 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BottomSheetFixedHeader.INSTANCE.serializer(), jsonElement5);
                    } catch (Exception unused11) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof BottomSheetFixedHeader) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(BottomSheetFixedHeader.INSTANCE.serializer(), jsonPrimitiveM1841c5);
                    } catch (Exception unused12) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(BottomSheetFixedHeader.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (BottomSheetFixedHeader) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (BottomSheetFixedHeader) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (BottomSheetFixedHeader) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (BottomSheetFixedHeader) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (BottomSheetFixedHeader) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (BottomSheetFixedHeader) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        BottomSheetFixedFooter fixedFooter = bottomSheet.getFixedFooter();
        if (fixedFooter == null) {
            obj6 = null;
        } else {
            WithGeneratedBindings withGeneratedBindingsBind7 = fixedFooter.bind(accumulatedState);
            if (!(withGeneratedBindingsBind7 instanceof BottomSheetFixedFooter)) {
                withGeneratedBindingsBind7 = null;
            }
            BottomSheetFixedFooter bottomSheetFixedFooter = (BottomSheetFixedFooter) withGeneratedBindingsBind7;
            if (bottomSheetFixedFooter == null) {
                bottomSheetFixedFooter = fixedFooter;
            }
            obj6 = bottomSheetFixedFooter;
        }
        String strResolveContentBindingKey6 = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "fixedFooter") : null;
        if (strResolveContentBindingKey6 != null) {
            Object objResolveStateRef6 = StateLookupKt.resolveStateRef(strResolveContentBindingKey6, accumulatedState);
            if (objResolveStateRef6 != null) {
                BindingLoggerKt.logContentBinding("fixedFooter", strResolveContentBindingKey6, objResolveStateRef6);
                Object objUnwrapForCoercion6 = BindCoercionKt.unwrapForCoercion(objResolveStateRef6);
                if ((objUnwrapForCoercion6 instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion6) && AbstractC22676k.m65745e(accumulatedState.get(obj5), Boolean.TRUE)) {
                    obj6 = null;
                } else {
                    Object objUnwrapForCoercion7 = BindCoercionKt.unwrapForCoercion(objResolveStateRef6);
                    if (objUnwrapForCoercion7 == null) {
                        objOverlayContentPathBindings6 = null;
                    } else if (objUnwrapForCoercion7 instanceof JsonElement) {
                        JsonElement jsonElement5 = (JsonElement) objUnwrapForCoercion7;
                        try {
                            StateBindingDeserializerKt.getStateBindingJson().getClass();
                            objOverlayContentPathBindings6 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BottomSheetFixedFooter.INSTANCE.serializer(), jsonElement5);
                        } catch (Exception unused11) {
                            objOverlayContentPathBindings6 = null;
                        }
                    } else if (objUnwrapForCoercion7 instanceof BottomSheetFixedFooter) {
                        objOverlayContentPathBindings6 = objUnwrapForCoercion7;
                    } else {
                        if (objUnwrapForCoercion7 instanceof Number) {
                            InterfaceC21461d interfaceC21461dM65688a6 = AbstractC22671h0.m65688a(BottomSheetFixedFooter.class);
                            if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls6))) {
                                objOverlayContentPathBindings6 = (BottomSheetFixedFooter) Integer.valueOf(((Number) objUnwrapForCoercion7).intValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls5))) {
                                objOverlayContentPathBindings6 = (BottomSheetFixedFooter) Long.valueOf(((Number) objUnwrapForCoercion7).longValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls4))) {
                                objOverlayContentPathBindings6 = (BottomSheetFixedFooter) Double.valueOf(((Number) objUnwrapForCoercion7).doubleValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls3))) {
                                objOverlayContentPathBindings6 = (BottomSheetFixedFooter) Float.valueOf(((Number) objUnwrapForCoercion7).floatValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls2))) {
                                objOverlayContentPathBindings6 = (BottomSheetFixedFooter) Short.valueOf(((Number) objUnwrapForCoercion7).shortValue());
                            } else if (AbstractC22676k.m65745e(interfaceC21461dM65688a6, AbstractC22671h0.m65688a(cls))) {
                                objOverlayContentPathBindings6 = (BottomSheetFixedFooter) Byte.valueOf(((Number) objUnwrapForCoercion7).byteValue());
                            }
                        } else if (objUnwrapForCoercion7 instanceof String) {
                            JsonPrimitive jsonPrimitiveM1841c5 = AbstractC0770m.m1841c((String) objUnwrapForCoercion7);
                            try {
                                StateBindingDeserializerKt.getStateBindingJson().getClass();
                                objUnwrapForCoercion7 = StateBindingDeserializerKt.getStateBindingJson().m1830a(BottomSheetFixedFooter.INSTANCE.serializer(), jsonPrimitiveM1841c5);
                            } catch (Exception unused12) {
                                objUnwrapForCoercion7 = null;
                            }
                            if (objUnwrapForCoercion7 != null) {
                                objOverlayContentPathBindings6 = objUnwrapForCoercion7;
                            }
                        }
                        objOverlayContentPathBindings6 = null;
                    }
                    obj6 = objOverlayContentPathBindings6 == null ? fixedFooter : objOverlayContentPathBindings6;
                }
            }
        } else if (obj6 != null) {
            objOverlayContentPathBindings6 = ContentPathBindingsKt.overlayContentPathBindings(map, "fixedFooter", accumulatedState, obj6, new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$26
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj13) {
                    return invoke((BottomSheetFixedFooter) obj13);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(BottomSheetFixedFooter v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1832c(BottomSheetFixedFooter.INSTANCE.serializer(), v13);
                    } catch (Exception unused13) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$27
                /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.modal.BottomSheetFixedFooter, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final BottomSheetFixedFooter invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BottomSheetFixedFooter.INSTANCE.serializer(), json);
                    } catch (Exception unused13) {
                        return null;
                    }
                }
            });
        }
        return (BottomSheet) ContentBindingResolverKt.copyBindingsFrom(new BottomSheet(str, navigationBarModel, list3, bottomSheetHeight, bottomSheetFixedHeader2, (BottomSheetFixedFooter) DotPathBindingsKt.overlayAggregateBinding(map2, "fixedFooter", accumulatedState, obj6, "fixedFooter", new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$28
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj13) {
                return invoke((BottomSheetFixedFooter) obj13);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(BottomSheetFixedFooter bottomSheetFixedFooter2) {
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(BottomSheetFixedFooter.INSTANCE.serializer());
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, bottomSheetFixedFooter2, interfaceC37138cM122336d);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$29
            /* JADX WARN: Type inference failed for: r3v2, types: [com.whoop.design.models.modal.BottomSheetFixedFooter, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final BottomSheetFixedFooter invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(BottomSheetFixedFooter.INSTANCE.serializer(), json);
                } catch (Exception unused13) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.modal.BottomSheetStateBindingKt$generatedBind$$inlined$resolveBinding$30
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.modal.BottomSheetFixedFooter, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.modal.BottomSheetFixedFooter, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final BottomSheetFixedFooter invoke(Object obj13) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj13);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    JsonElement jsonElement6 = (JsonElement) UnwrapForCoercion;
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(BottomSheetFixedFooter.INSTANCE.serializer(), jsonElement6);
                    } catch (Exception unused13) {
                        return null;
                    }
                }
                if (UnwrapForCoercion instanceof BottomSheetFixedFooter) {
                    return UnwrapForCoercion;
                }
                if (!(UnwrapForCoercion instanceof Number)) {
                    if (!(UnwrapForCoercion instanceof String)) {
                        return null;
                    }
                    JsonPrimitive jsonPrimitiveM1841c6 = AbstractC0770m.m1841c((String) UnwrapForCoercion);
                    try {
                        StateBindingDeserializerKt.getStateBindingJson().getClass();
                        objM1830a = StateBindingDeserializerKt.getStateBindingJson().m1830a(BottomSheetFixedFooter.INSTANCE.serializer(), jsonPrimitiveM1841c6);
                    } catch (Exception unused14) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(BottomSheetFixedFooter.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (BottomSheetFixedFooter) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    return (BottomSheetFixedFooter) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    return (BottomSheetFixedFooter) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    return (BottomSheetFixedFooter) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    return (BottomSheetFixedFooter) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (BottomSheetFixedFooter) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        })), bottomSheet);
    }

    public static /* synthetic */ BottomSheet generatedBind$default(BottomSheet bottomSheet, Map map, Map map2, Map map3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map2 = null;
        }
        return generatedBind(bottomSheet, map, map2, map3);
    }
}
