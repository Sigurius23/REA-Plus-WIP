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
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
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
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003¨\u0006\t"}, m65681d2 = {"generatedBind", "Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixture;", "contentBinding", "", "", "aggregateBindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "accumulatedState", "", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class NestedChildBindTestFixtureStateBindingKt {
    /* JADX WARN: Code duplicated, block: B:46:0x009f A[PHI: r1
      0x009f: PHI (r1v30 java.lang.Object) = (r1v8 java.lang.Object), (r1v12 java.lang.Object) binds: [B:45:0x009d, B:73:0x0171] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x017b  */
    public static final NestedChildBindTestFixture generatedBind(NestedChildBindTestFixture nestedChildBindTestFixture, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, ? extends Object> accumulatedState) {
        PrimitiveBindTestFixture primitiveBindTestFixture;
        AbstractC22676k.m65750j(nestedChildBindTestFixture, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if ((map == null || map.isEmpty()) && ((map2 == null || map2.isEmpty()) && accumulatedState.isEmpty())) {
            return nestedChildBindTestFixture;
        }
        PrimitiveBindTestFixture child = nestedChildBindTestFixture.getChild();
        Object objOverlayContentPathBindings = null;
        if (child == null) {
            primitiveBindTestFixture = null;
        } else {
            WithGeneratedBindings withGeneratedBindingsBind = child.bind(accumulatedState);
            if (!(withGeneratedBindingsBind instanceof PrimitiveBindTestFixture)) {
                withGeneratedBindingsBind = null;
            }
            primitiveBindTestFixture = (PrimitiveBindTestFixture) withGeneratedBindingsBind;
            if (primitiveBindTestFixture == null) {
                primitiveBindTestFixture = child;
            }
        }
        String strResolveContentBindingKey = map != null ? BindingLoggerKt.resolveContentBindingKey(map, "child") : null;
        if (strResolveContentBindingKey != null) {
            Object objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
            if (objResolveStateRef != null) {
                BindingLoggerKt.logContentBinding("child", strResolveContentBindingKey, objResolveStateRef);
                Object objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                if (!(objUnwrapForCoercion instanceof String) || !AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion) || !AbstractC22676k.m65745e(accumulatedState.get(ContentBindingResolverKt.BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                    Object objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                    if (objUnwrapForCoercion2 != null) {
                        if (objUnwrapForCoercion2 instanceof JsonElement) {
                            try {
                                objOverlayContentPathBindings = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), (JsonElement) objUnwrapForCoercion2);
                            } catch (Exception unused) {
                            }
                        } else if (objUnwrapForCoercion2 instanceof PrimitiveBindTestFixture) {
                            objOverlayContentPathBindings = objUnwrapForCoercion2;
                        } else if (objUnwrapForCoercion2 instanceof Number) {
                            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                            InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(PrimitiveBindTestFixture.class);
                            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                                objOverlayContentPathBindings = (PrimitiveBindTestFixture) Integer.valueOf(((Number) objUnwrapForCoercion2).intValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                                objOverlayContentPathBindings = (PrimitiveBindTestFixture) Long.valueOf(((Number) objUnwrapForCoercion2).longValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                                objOverlayContentPathBindings = (PrimitiveBindTestFixture) Double.valueOf(((Number) objUnwrapForCoercion2).doubleValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                                objOverlayContentPathBindings = (PrimitiveBindTestFixture) Float.valueOf(((Number) objUnwrapForCoercion2).floatValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                                objOverlayContentPathBindings = (PrimitiveBindTestFixture) Short.valueOf(((Number) objUnwrapForCoercion2).shortValue());
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                                objOverlayContentPathBindings = (PrimitiveBindTestFixture) Byte.valueOf(((Number) objUnwrapForCoercion2).byteValue());
                            }
                        } else if (objUnwrapForCoercion2 instanceof String) {
                            try {
                                objUnwrapForCoercion2 = StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), AbstractC0770m.m1841c((String) objUnwrapForCoercion2));
                            } catch (Exception unused2) {
                                objUnwrapForCoercion2 = null;
                            }
                            if (objUnwrapForCoercion2 != null) {
                                objOverlayContentPathBindings = objUnwrapForCoercion2;
                            }
                        }
                    }
                    if (objOverlayContentPathBindings == null) {
                        objOverlayContentPathBindings = child;
                    }
                }
            } else {
                objOverlayContentPathBindings = primitiveBindTestFixture;
            }
        } else if (primitiveBindTestFixture == null) {
            objOverlayContentPathBindings = primitiveBindTestFixture;
        } else {
            objOverlayContentPathBindings = ContentPathBindingsKt.overlayContentPathBindings(map, "child", accumulatedState, primitiveBindTestFixture, new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedChildBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$1
                @Override // p715kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((PrimitiveBindTestFixture) obj);
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final JsonElement invoke(PrimitiveBindTestFixture v13) {
                    AbstractC22676k.m65750j(v13, "v");
                    try {
                        InterfaceC37138c interfaceC37138cM113843f = AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class));
                        AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                        stateBindingJson.getClass();
                        return AbstractC12313p.m34290h0(stateBindingJson, v13, interfaceC37138cM113843f);
                    } catch (Exception unused3) {
                        return null;
                    }
                }
            }, new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedChildBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$2
                /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.test.fixtures.PrimitiveBindTestFixture, java.lang.Object] */
                @Override // p715kotlin.jvm.functions.Function1
                public final PrimitiveBindTestFixture invoke(JsonElement json) {
                    AbstractC22676k.m65750j(json, "json");
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), json);
                    } catch (Exception unused3) {
                        return null;
                    }
                }
            });
        }
        PrimitiveBindTestFixture child2 = (PrimitiveBindTestFixture) DotPathBindingsKt.overlayAggregateBinding(map2, "child", accumulatedState, objOverlayContentPathBindings, "child", new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedChildBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$3
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((PrimitiveBindTestFixture) obj);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final JsonElement invoke(PrimitiveBindTestFixture primitiveBindTestFixture2) {
                try {
                    InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)));
                    AbstractC0757c stateBindingJson = StateBindingDeserializerKt.getStateBindingJson();
                    stateBindingJson.getClass();
                    return AbstractC12313p.m34290h0(stateBindingJson, primitiveBindTestFixture2, interfaceC37138cM122336d);
                } catch (Exception unused3) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedChildBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$4
            /* JADX WARN: Type inference failed for: r4v2, types: [com.whoop.design.models.test.fixtures.PrimitiveBindTestFixture, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final PrimitiveBindTestFixture invoke(JsonElement json) {
                AbstractC22676k.m65750j(json, "json");
                try {
                    return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), json);
                } catch (Exception unused3) {
                    return null;
                }
            }
        }, new Function1() { // from class: com.whoop.design.models.test.fixtures.NestedChildBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$5
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [com.whoop.design.models.test.fixtures.PrimitiveBindTestFixture, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.whoop.design.models.test.fixtures.PrimitiveBindTestFixture, java.lang.Object] */
            @Override // p715kotlin.jvm.functions.Function1
            public final PrimitiveBindTestFixture invoke(Object obj) {
                Object objM1830a;
                ?? UnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj);
                if (UnwrapForCoercion == 0) {
                    return null;
                }
                if (UnwrapForCoercion instanceof JsonElement) {
                    try {
                        return StateBindingDeserializerKt.getStateBindingJson().m1830a(AbstractC35862g.m113843f(StateBindingDeserializerKt.getStateBindingJson().f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PrimitiveBindTestFixture.class)), (JsonElement) UnwrapForCoercion);
                    } catch (Exception unused3) {
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
                    } catch (Exception unused4) {
                        objM1830a = null;
                    }
                    if (objM1830a != null) {
                        return objM1830a;
                    }
                    return null;
                }
                C22673i0 c22673i1 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(PrimitiveBindTestFixture.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(Integer.TYPE))) {
                    return (PrimitiveBindTestFixture) Integer.valueOf(((Number) UnwrapForCoercion).intValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(Long.TYPE))) {
                    return (PrimitiveBindTestFixture) Long.valueOf(((Number) UnwrapForCoercion).longValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(Double.TYPE))) {
                    return (PrimitiveBindTestFixture) Double.valueOf(((Number) UnwrapForCoercion).doubleValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(Float.TYPE))) {
                    return (PrimitiveBindTestFixture) Float.valueOf(((Number) UnwrapForCoercion).floatValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(Short.TYPE))) {
                    return (PrimitiveBindTestFixture) Short.valueOf(((Number) UnwrapForCoercion).shortValue());
                }
                if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(Byte.TYPE))) {
                    return (PrimitiveBindTestFixture) Byte.valueOf(((Number) UnwrapForCoercion).byteValue());
                }
                return null;
            }
        });
        if (child2 == null) {
            child2 = nestedChildBindTestFixture.getChild();
        }
        return (NestedChildBindTestFixture) ContentBindingResolverKt.copyBindingsFrom(new NestedChildBindTestFixture(child2), nestedChildBindTestFixture);
    }

    public static /* synthetic */ NestedChildBindTestFixture generatedBind$default(NestedChildBindTestFixture nestedChildBindTestFixture, Map map, Map map2, Map map3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map2 = null;
        }
        return generatedBind(nestedChildBindTestFixture, map, map2, map3);
    }
}
