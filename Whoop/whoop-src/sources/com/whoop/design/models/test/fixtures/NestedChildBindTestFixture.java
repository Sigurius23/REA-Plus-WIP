package com.whoop.design.models.test.fixtures;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR0\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!RE\u0010'\u001a%\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\"\u0018\u00010\u0007j\u0004\u0018\u0001`#¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\t0&8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!¨\u0006*"}, m65681d2 = {"Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixture;", "Lcom/whoop/design/models/WithGeneratedBindings;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;", "child", "<init>", "(Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;)V", "", "", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixture;", "component1", "()Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;", "copy", "(Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;)Lcom/whoop/design/models/test/fixtures/NestedChildBindTestFixture;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;", "getChild", "bindings", "Ljava/util/Map;", "getBindings", "()Ljava/util/Map;", "setBindings", "(Ljava/util/Map;)V", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "getAggregateBindings", "setAggregateBindings", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class NestedChildBindTestFixture implements WithGeneratedBindings, DesignSystemModel {
    public static final int $stable = 8;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final PrimitiveBindTestFixture child;

    public NestedChildBindTestFixture(PrimitiveBindTestFixture child) {
        AbstractC22676k.m65750j(child, "child");
        this.child = child;
    }

    public static /* synthetic */ NestedChildBindTestFixture copy$default(NestedChildBindTestFixture nestedChildBindTestFixture, PrimitiveBindTestFixture primitiveBindTestFixture, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            primitiveBindTestFixture = nestedChildBindTestFixture.child;
        }
        return nestedChildBindTestFixture.copy(primitiveBindTestFixture);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public /* bridge */ /* synthetic */ WithGeneratedBindings bind(Map map) {
        return bind((Map<String, ? extends Object>) map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PrimitiveBindTestFixture getChild() {
        return this.child;
    }

    public final NestedChildBindTestFixture copy(PrimitiveBindTestFixture child) {
        AbstractC22676k.m65750j(child, "child");
        return new NestedChildBindTestFixture(child);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NestedChildBindTestFixture) && AbstractC22676k.m65745e(this.child, ((NestedChildBindTestFixture) other).child);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final PrimitiveBindTestFixture getChild() {
        return this.child;
    }

    public int hashCode() {
        return this.child.hashCode();
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
        return "NestedChildBindTestFixture(child=" + this.child + ")";
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public NestedChildBindTestFixture bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return NestedChildBindTestFixtureStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }
}
