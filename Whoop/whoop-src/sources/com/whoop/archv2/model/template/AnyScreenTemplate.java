package com.whoop.archv2.model.template;

import cj0.AbstractC4739a;
import com.whoop.cache.api.prefetch.PrefetchList;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.modal.LifecycleInteractions;
import java.util.Map;
import mi0.C25571a;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 72\u00020\u0001:\u00018Bl\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012+\b\u0002\u0010\u0010\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bj\u0004\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00130\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010\u001f\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bj\u0004\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000fHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJw\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b2+\b\u0002\u0010\u0010\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bj\u0004\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000fHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001cR0\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u001e\"\u0004\b3\u00104RE\u0010\u0010\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bj\u0004\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u00101\u001a\u0004\b5\u0010\u001e\"\u0004\b6\u00104¨\u00069"}, m65681d2 = {"Lcom/whoop/archv2/model/template/AnyScreenTemplate;", "Lcom/whoop/design/models/WithGeneratedBindings;", "Lcom/whoop/archv2/model/template/ScreenTemplate;", "template", "Lcom/whoop/cache/api/prefetch/PrefetchList;", "prefetchList", "Lcom/whoop/design/models/modal/LifecycleInteractions;", "lifecycleInteractions", "", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Lcom/whoop/archv2/model/template/ScreenTemplate;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/design/models/modal/LifecycleInteractions;Ljava/util/Map;Ljava/util/Map;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/archv2/model/template/AnyScreenTemplate;", "component1", "()Lcom/whoop/archv2/model/template/ScreenTemplate;", "component2", "()Lcom/whoop/cache/api/prefetch/PrefetchList;", "component3", "()Lcom/whoop/design/models/modal/LifecycleInteractions;", "component4", "()Ljava/util/Map;", "component5", "copy", "(Lcom/whoop/archv2/model/template/ScreenTemplate;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/design/models/modal/LifecycleInteractions;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/archv2/model/template/AnyScreenTemplate;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/archv2/model/template/ScreenTemplate;", "getTemplate", "Lcom/whoop/cache/api/prefetch/PrefetchList;", "getPrefetchList", "Lcom/whoop/design/models/modal/LifecycleInteractions;", "getLifecycleInteractions", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "a", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i(with = C25571a.class)
public final /* data */ class AnyScreenTemplate implements WithGeneratedBindings {
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final LifecycleInteractions lifecycleInteractions;
    private final PrefetchList prefetchList;
    private final ScreenTemplate template;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.archv2.model.template.AnyScreenTemplate$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/archv2/model/template/AnyScreenTemplate$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/archv2/model/template/AnyScreenTemplate;", "serializer", "()Lwc3/c;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return new C25571a();
        }

        private Companion() {
        }
    }

    public AnyScreenTemplate(ScreenTemplate template, PrefetchList prefetchList, LifecycleInteractions lifecycleInteractions, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(template, "template");
        this.template = template;
        this.prefetchList = prefetchList;
        this.lifecycleInteractions = lifecycleInteractions;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnyScreenTemplate copy$default(AnyScreenTemplate anyScreenTemplate, ScreenTemplate screenTemplate, PrefetchList prefetchList, LifecycleInteractions lifecycleInteractions, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            screenTemplate = anyScreenTemplate.template;
        }
        if ((i13 & 2) != 0) {
            prefetchList = anyScreenTemplate.prefetchList;
        }
        if ((i13 & 4) != 0) {
            lifecycleInteractions = anyScreenTemplate.lifecycleInteractions;
        }
        if ((i13 & 8) != 0) {
            map = anyScreenTemplate.bindings;
        }
        if ((i13 & 16) != 0) {
            map2 = anyScreenTemplate.aggregateBindings;
        }
        Map map3 = map2;
        LifecycleInteractions lifecycleInteractions2 = lifecycleInteractions;
        return anyScreenTemplate.copy(screenTemplate, prefetchList, lifecycleInteractions2, map, map3);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public /* bridge */ /* synthetic */ WithGeneratedBindings bind(Map map) {
        return bind((Map<String, ? extends Object>) map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ScreenTemplate getTemplate() {
        return this.template;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PrefetchList getPrefetchList() {
        return this.prefetchList;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LifecycleInteractions getLifecycleInteractions() {
        return this.lifecycleInteractions;
    }

    public final Map<String, String> component4() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component5() {
        return this.aggregateBindings;
    }

    public final AnyScreenTemplate copy(ScreenTemplate template, PrefetchList prefetchList, LifecycleInteractions lifecycleInteractions, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(template, "template");
        return new AnyScreenTemplate(template, prefetchList, lifecycleInteractions, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnyScreenTemplate)) {
            return false;
        }
        AnyScreenTemplate anyScreenTemplate = (AnyScreenTemplate) other;
        return AbstractC22676k.m65745e(this.template, anyScreenTemplate.template) && AbstractC22676k.m65745e(this.prefetchList, anyScreenTemplate.prefetchList) && AbstractC22676k.m65745e(this.lifecycleInteractions, anyScreenTemplate.lifecycleInteractions) && AbstractC22676k.m65745e(this.bindings, anyScreenTemplate.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, anyScreenTemplate.aggregateBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final LifecycleInteractions getLifecycleInteractions() {
        return this.lifecycleInteractions;
    }

    public final PrefetchList getPrefetchList() {
        return this.prefetchList;
    }

    public final ScreenTemplate getTemplate() {
        return this.template;
    }

    public int hashCode() {
        int iHashCode = this.template.hashCode() * 31;
        PrefetchList prefetchList = this.prefetchList;
        int iHashCode2 = (iHashCode + (prefetchList == null ? 0 : prefetchList.hashCode())) * 31;
        LifecycleInteractions lifecycleInteractions = this.lifecycleInteractions;
        int iHashCode3 = (iHashCode2 + (lifecycleInteractions == null ? 0 : lifecycleInteractions.hashCode())) * 31;
        Map<String, String> map = this.bindings;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode4 + (map2 != null ? map2.hashCode() : 0);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setAggregateBindings(Map<String, AggregateBinding> map) {
        this.aggregateBindings = map;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setBindings(Map<String, String> map) {
        this.bindings = map;
    }

    public String toString() {
        ScreenTemplate screenTemplate = this.template;
        PrefetchList prefetchList = this.prefetchList;
        LifecycleInteractions lifecycleInteractions = this.lifecycleInteractions;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sb4 = new StringBuilder("AnyScreenTemplate(template=");
        sb4.append(screenTemplate);
        sb4.append(", prefetchList=");
        sb4.append(prefetchList);
        sb4.append(", lifecycleInteractions=");
        sb4.append(lifecycleInteractions);
        sb4.append(", bindings=");
        sb4.append(map);
        sb4.append(", aggregateBindings=");
        return AbstractC13673n.m38565l(sb4, map2, ")");
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public AnyScreenTemplate bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return AbstractC4739a.m14836a(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    public /* synthetic */ AnyScreenTemplate(ScreenTemplate screenTemplate, PrefetchList prefetchList, LifecycleInteractions lifecycleInteractions, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(screenTemplate, (i13 & 2) != 0 ? null : prefetchList, (i13 & 4) != 0 ? null : lifecycleInteractions, (i13 & 8) != 0 ? null : map, (i13 & 16) != 0 ? null : map2);
    }
}
