package com.whoop.design.models.binding;

import cd3.AbstractC4454f;
import kotlinx.serialization.json.JsonElement;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.design.models.binding.ContentBindingResolverKt$resolveBinding$$inlined$mergeAggregateForProperty$2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 176)
public final class C7001x1463188a implements Function1 {
    public static final C7001x1463188a INSTANCE = new C7001x1463188a();

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
