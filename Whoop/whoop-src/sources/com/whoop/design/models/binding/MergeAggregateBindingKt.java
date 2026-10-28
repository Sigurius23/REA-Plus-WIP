package com.whoop.design.models.binding;

import cd3.AbstractC4454f;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aX\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u0001H\u0001H\u0086\b¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m65681d2 = {"mergeAggregateForProperty", "T", "", "aggregateBindings", "", "", "Lcom/whoop/design/models/binding/AggregateBinding;", "propertyName", "accumulatedState", "base", "(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class MergeAggregateBindingKt {

    /* JADX INFO: renamed from: com.whoop.design.models.binding.MergeAggregateBindingKt$mergeAggregateForProperty$1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 176)
    public static final class C70081 implements Function1 {
        public static final C70081 INSTANCE = null;

        static {
            AbstractC22676k.m65756p();
            throw null;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final JsonElement invoke(T t14) {
            try {
                AbstractC4454f abstractC4454f = StateBindingDeserializerKt.getStateBindingJson().f2764b;
                AbstractC22676k.m65756p();
                throw null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.design.models.binding.MergeAggregateBindingKt$mergeAggregateForProperty$2 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 176)
    public static final class C70092 implements Function1 {
        public static final C70092 INSTANCE = null;

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

    /* JADX INFO: renamed from: com.whoop.design.models.binding.MergeAggregateBindingKt$mergeAggregateForProperty$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 176)
    public static final class C70103 implements Function1 {
        public static final C70103 INSTANCE = null;

        static {
            AbstractC22676k.m65756p();
            throw null;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final T invoke(Object obj) {
            Object objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(obj);
            if (objUnwrapForCoercion == null) {
                return null;
            }
            if (!(objUnwrapForCoercion instanceof JsonElement)) {
                AbstractC22676k.m65756p();
                throw null;
            }
            try {
                AbstractC4454f abstractC4454f = StateBindingDeserializerKt.getStateBindingJson().f2764b;
                AbstractC22676k.m65756p();
                throw null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static final <T> T mergeAggregateForProperty(Map<String, AggregateBinding> map, String propertyName, Map<String, ? extends Object> accumulatedState, T t14) {
        AbstractC22676k.m65750j(propertyName, "propertyName");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        AbstractC22676k.m65756p();
        throw null;
    }
}
