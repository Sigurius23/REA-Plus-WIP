package com.whoop.design.models.binding;

import cd3.AbstractC4454f;
import kotlinx.serialization.json.JsonElement;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.design.models.binding.ContentBindingResolverKt$resolveBinding$$inlined$mergeAggregateForProperty$3 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 176)
public final class C7002x1463188b implements Function1 {
    public static final C7002x1463188b INSTANCE = new C7002x1463188b();

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
