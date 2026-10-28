package com.whoop.design.models;

import com.whoop.design.models.binding.AggregateBinding;
import java.util.Map;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J#\u0010\u0005\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR?\u0010\u0013\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u0002j\u0004\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00108&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\n¨\u0006\u0014À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/design/models/WithGeneratedBindings;", "", "", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;", "getBindings", "()Ljava/util/Map;", "setBindings", "(Ljava/util/Map;)V", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;", "getAggregateBindings", "setAggregateBindings", "aggregateBindings", "state-binding-annotations"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface WithGeneratedBindings {
    WithGeneratedBindings bind(Map<String, ? extends Object> accumulatedState);

    Map<String, AggregateBinding> getAggregateBindings();

    Map<String, String> getBindings();

    void setAggregateBindings(Map<String, AggregateBinding> map);

    void setBindings(Map<String, String> map);
}
