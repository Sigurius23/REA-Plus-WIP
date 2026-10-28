package com.whoop.design.models.binding;

import com.whoop.design.models.WithGeneratedBindings;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a:\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u0001H\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m65681d2 = {"performBind", "T", "", "model", "state", "", "", "(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PerformBindKt {
    public static final <T> T performBind(T t14, Map<String, ? extends Object> state) {
        WithGeneratedBindings withGeneratedBindingsBind;
        AbstractC22676k.m65750j(state, "state");
        if (t14 == null) {
            return null;
        }
        if (t14 instanceof WithGeneratedBindings) {
            ((WithGeneratedBindings) t14).bind(state);
            AbstractC22676k.m65756p();
            throw null;
        }
        if (!(t14 instanceof List)) {
            return t14;
        }
        Iterable iterable = (Iterable) t14;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
        for (T t15 : iterable) {
            WithGeneratedBindings withGeneratedBindings = t15 instanceof WithGeneratedBindings ? (WithGeneratedBindings) t15 : null;
            if (withGeneratedBindings != null && (withGeneratedBindingsBind = withGeneratedBindings.bind(state)) != null) {
                t15 = (T) withGeneratedBindingsBind;
            }
            arrayList.add(t15);
        }
        AbstractC22676k.m65756p();
        throw null;
    }
}
