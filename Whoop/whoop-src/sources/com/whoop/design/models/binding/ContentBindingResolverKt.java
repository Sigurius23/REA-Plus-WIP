package com.whoop.design.models.binding;

import cd3.AbstractC4454f;
import com.whoop.design.models.WithGeneratedBindings;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001an\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00062\b\u0010\u000b\u001a\u0004\u0018\u0001H\u0003H\u0086\b¢\u0006\u0002\u0010\f\u001aX\u0010\r\u001a\u0004\u0018\u0001H\u0003\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00062\b\u0010\u000b\u001a\u0004\u0018\u0001H\u0003H\u0081\b¢\u0006\u0002\u0010\u000e\u001a!\u0010\u000f\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u0010*\u0002H\u00032\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m65681d2 = {"BLANK_STATE_CLEARS_FIELD_KEY", "", "resolveBinding", "T", "", "contentBinding", "", "aggregateBindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "propertyName", "accumulatedState", "original", "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "resolveContentBinding", "(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "copyBindingsFrom", "Lcom/whoop/design/models/WithGeneratedBindings;", "source", "(Lcom/whoop/design/models/WithGeneratedBindings;Lcom/whoop/design/models/WithGeneratedBindings;)Lcom/whoop/design/models/WithGeneratedBindings;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ContentBindingResolverKt {
    public static final String BLANK_STATE_CLEARS_FIELD_KEY = "__archv2_blank_clears_field";

    /* JADX INFO: renamed from: com.whoop.design.models.binding.ContentBindingResolverKt$resolveContentBinding$1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 176)
    public static final class C70051 implements Function1 {
        public static final C70051 INSTANCE = null;

        static {
            AbstractC22676k.m65756p();
            throw null;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final JsonElement invoke(T v13) {
            AbstractC22676k.m65750j(v13, "v");
            try {
                AbstractC4454f abstractC4454f = StateBindingDeserializerKt.getStateBindingJson().f2764b;
                AbstractC22676k.m65756p();
                throw null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.design.models.binding.ContentBindingResolverKt$resolveContentBinding$2 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 176)
    public static final class C70062 implements Function1 {
        public static final C70062 INSTANCE = null;

        static {
            AbstractC22676k.m65756p();
            throw null;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final T invoke(JsonElement json) {
            AbstractC22676k.m65750j(json, "json");
            try {
                AbstractC4454f abstractC4454f = StateBindingDeserializerKt.getStateBindingJson().f2764b;
                AbstractC22676k.m65756p();
                throw null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static final <T extends WithGeneratedBindings> T copyBindingsFrom(T t14, WithGeneratedBindings source) {
        AbstractC22676k.m65750j(t14, "<this>");
        AbstractC22676k.m65750j(source, "source");
        t14.setBindings(source.getBindings());
        t14.setAggregateBindings(source.getAggregateBindings());
        return t14;
    }

    public static final <T> T resolveBinding(Map<String, String> map, Map<String, AggregateBinding> map2, String propertyName, Map<String, ? extends Object> accumulatedState, T t14) {
        WithGeneratedBindings withGeneratedBindingsBind;
        Object objUnwrapForCoercion;
        AbstractC22676k.m65750j(propertyName, "propertyName");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if (t14 == null) {
            t14 = null;
        } else {
            if (t14 instanceof WithGeneratedBindings) {
                ((WithGeneratedBindings) t14).bind(accumulatedState);
                AbstractC22676k.m65756p();
                throw null;
            }
            if (t14 instanceof List) {
                Iterable iterable = (Iterable) t14;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
                for (T t15 : iterable) {
                    WithGeneratedBindings withGeneratedBindings = t15 instanceof WithGeneratedBindings ? (WithGeneratedBindings) t15 : null;
                    if (withGeneratedBindings != null && (withGeneratedBindingsBind = withGeneratedBindings.bind(accumulatedState)) != null) {
                        t15 = (T) withGeneratedBindingsBind;
                    }
                    arrayList.add(t15);
                }
                AbstractC22676k.m65756p();
                throw null;
            }
        }
        String strResolveContentBindingKey = map != null ? BindingLoggerKt.resolveContentBindingKey(map, propertyName) : null;
        if (strResolveContentBindingKey != null) {
            Object objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
            if (objResolveStateRef != null) {
                BindingLoggerKt.logContentBinding(propertyName, strResolveContentBindingKey, objResolveStateRef);
                Object objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                if ((!(objUnwrapForCoercion2 instanceof String) || !AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion2) || !AbstractC22676k.m65745e(accumulatedState.get(BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) && (objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef)) != null) {
                    if (!(objUnwrapForCoercion instanceof JsonElement)) {
                        AbstractC22676k.m65756p();
                        throw null;
                    }
                    try {
                        AbstractC4454f abstractC4454f = StateBindingDeserializerKt.getStateBindingJson().f2764b;
                        AbstractC22676k.m65756p();
                        throw null;
                    } catch (Exception unused) {
                    }
                }
            }
        } else if (t14 != null) {
            AbstractC22676k.m65756p();
            throw null;
        }
        AbstractC22676k.m65756p();
        throw null;
    }

    public static final <T> T resolveContentBinding(Map<String, String> map, String propertyName, Map<String, ? extends Object> accumulatedState, T t14) {
        T t15;
        WithGeneratedBindings withGeneratedBindingsBind;
        AbstractC22676k.m65750j(propertyName, "propertyName");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if (t14 == null) {
            t15 = null;
        } else {
            if (t14 instanceof WithGeneratedBindings) {
                ((WithGeneratedBindings) t14).bind(accumulatedState);
                AbstractC22676k.m65756p();
                throw null;
            }
            if (t14 instanceof List) {
                Iterable iterable = (Iterable) t14;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
                for (T t16 : iterable) {
                    WithGeneratedBindings withGeneratedBindings = t16 instanceof WithGeneratedBindings ? (WithGeneratedBindings) t16 : null;
                    if (withGeneratedBindings != null && (withGeneratedBindingsBind = withGeneratedBindings.bind(accumulatedState)) != null) {
                        t16 = (T) withGeneratedBindingsBind;
                    }
                    arrayList.add(t16);
                }
                AbstractC22676k.m65756p();
                throw null;
            }
            t15 = t14;
        }
        String strResolveContentBindingKey = map != null ? BindingLoggerKt.resolveContentBindingKey(map, propertyName) : null;
        if (strResolveContentBindingKey != null) {
            Object objResolveStateRef = StateLookupKt.resolveStateRef(strResolveContentBindingKey, accumulatedState);
            if (objResolveStateRef != null) {
                BindingLoggerKt.logContentBinding(propertyName, strResolveContentBindingKey, objResolveStateRef);
                Object objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                if ((objUnwrapForCoercion instanceof String) && AbstractC39414r.m125890i0((CharSequence) objUnwrapForCoercion) && AbstractC22676k.m65745e(accumulatedState.get(BLANK_STATE_CLEARS_FIELD_KEY), Boolean.TRUE)) {
                    return null;
                }
                Object objUnwrapForCoercion2 = BindCoercionKt.unwrapForCoercion(objResolveStateRef);
                if (objUnwrapForCoercion2 == null) {
                    return t14;
                }
                if (!(objUnwrapForCoercion2 instanceof JsonElement)) {
                    AbstractC22676k.m65756p();
                    throw null;
                }
                try {
                    AbstractC4454f abstractC4454f = StateBindingDeserializerKt.getStateBindingJson().f2764b;
                    AbstractC22676k.m65756p();
                    throw null;
                } catch (Exception unused) {
                    return t14;
                }
            }
        } else if (t15 != null) {
            AbstractC22676k.m65756p();
            throw null;
        }
        return t15;
    }
}
