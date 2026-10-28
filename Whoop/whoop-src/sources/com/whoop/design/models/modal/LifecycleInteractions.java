package com.whoop.design.models.modal;

import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.design.models.calendar.archmini.C7011a;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b \b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=Bb\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012+\b\u0002\u0010\u000e\u001a%\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006j\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r¢\u0006\u0004\b\u000f\u0010\u0010BY\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010!\u001a\u00020\u00002\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f0\u0006H\u0016¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010&J\u001e\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b'\u0010(J3\u0010)\u001a%\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006j\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b)\u0010(Jk\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062+\b\u0002\u0010\u000e\u001a%\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006j\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020\u00042\b\u00100\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b1\u00102R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010&R0\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u00107\u001a\u0004\b8\u0010(\"\u0004\b9\u0010:RE\u0010\u000e\u001a%\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006j\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u00107\u001a\u0004\b;\u0010(\"\u0004\b<\u0010:¨\u0006?"}, m65681d2 = {"Lcom/whoop/design/models/modal/LifecycleInteractions;", "Lcom/whoop/design/models/WithGeneratedBindings;", "Lcom/whoop/navigation/models/GenericInteraction;", "onStart", "", "systemBackDisabled", "", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/modal/LifecycleInteractions;Lzc3/c;Lyc3/g;)V", "write$Self", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/modal/LifecycleInteractions;", "component1", "()Lcom/whoop/navigation/models/GenericInteraction;", "component2", "()Z", "component3", "()Ljava/util/Map;", "component4", "copy", "(Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/modal/LifecycleInteractions;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/navigation/models/GenericInteraction;", "getOnStart", "Z", "getSystemBackDisabled", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LifecycleInteractions implements WithGeneratedBindings {
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final GenericInteraction onStart;
    private final boolean systemBackDisabled;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C7011a(24)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/modal/LifecycleInteractions$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/modal/LifecycleInteractions;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LifecycleInteractions$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public LifecycleInteractions() {
        this((GenericInteraction) null, false, (Map) null, (Map) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LifecycleInteractions copy$default(LifecycleInteractions lifecycleInteractions, GenericInteraction genericInteraction, boolean z4, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            genericInteraction = lifecycleInteractions.onStart;
        }
        if ((i13 & 2) != 0) {
            z4 = lifecycleInteractions.systemBackDisabled;
        }
        if ((i13 & 4) != 0) {
            map = lifecycleInteractions.bindings;
        }
        if ((i13 & 8) != 0) {
            map2 = lifecycleInteractions.aggregateBindings;
        }
        return lifecycleInteractions.copy(genericInteraction, z4, map, map2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(LifecycleInteractions self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.onStart != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, GenericInteraction$$serializer.INSTANCE, self.onStart);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.systemBackDisabled) {
            output.encodeBooleanElement(serialDesc, 1, self.systemBackDisabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public /* bridge */ /* synthetic */ WithGeneratedBindings bind(Map map) {
        return bind((Map<String, ? extends Object>) map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GenericInteraction getOnStart() {
        return this.onStart;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSystemBackDisabled() {
        return this.systemBackDisabled;
    }

    public final Map<String, String> component3() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component4() {
        return this.aggregateBindings;
    }

    public final LifecycleInteractions copy(GenericInteraction onStart, boolean systemBackDisabled, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        return new LifecycleInteractions(onStart, systemBackDisabled, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LifecycleInteractions)) {
            return false;
        }
        LifecycleInteractions lifecycleInteractions = (LifecycleInteractions) other;
        return AbstractC22676k.m65745e(this.onStart, lifecycleInteractions.onStart) && this.systemBackDisabled == lifecycleInteractions.systemBackDisabled && AbstractC22676k.m65745e(this.bindings, lifecycleInteractions.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, lifecycleInteractions.aggregateBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final GenericInteraction getOnStart() {
        return this.onStart;
    }

    public final boolean getSystemBackDisabled() {
        return this.systemBackDisabled;
    }

    public int hashCode() {
        GenericInteraction genericInteraction = this.onStart;
        int iM8289b = AbstractC2875y.m8289b((genericInteraction == null ? 0 : genericInteraction.hashCode()) * 31, 31, this.systemBackDisabled);
        Map<String, String> map = this.bindings;
        int iHashCode = (iM8289b + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode + (map2 != null ? map2.hashCode() : 0);
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
        GenericInteraction genericInteraction = this.onStart;
        boolean z4 = this.systemBackDisabled;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sb4 = new StringBuilder("LifecycleInteractions(onStart=");
        sb4.append(genericInteraction);
        sb4.append(", systemBackDisabled=");
        sb4.append(z4);
        sb4.append(", bindings=");
        return AbstractC30802r.m94765n(sb4, map, ", aggregateBindings=", map2, ")");
    }

    public /* synthetic */ LifecycleInteractions(int i13, GenericInteraction genericInteraction, boolean z4, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.onStart = null;
        } else {
            this.onStart = genericInteraction;
        }
        if ((i13 & 2) == 0) {
            this.systemBackDisabled = false;
        } else {
            this.systemBackDisabled = z4;
        }
        if ((i13 & 4) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 8) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public LifecycleInteractions bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return LifecycleInteractionsStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    public LifecycleInteractions(GenericInteraction genericInteraction, boolean z4, Map<String, String> map, Map<String, AggregateBinding> map2) {
        this.onStart = genericInteraction;
        this.systemBackDisabled = z4;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    public /* synthetic */ LifecycleInteractions(GenericInteraction genericInteraction, boolean z4, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : genericInteraction, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? null : map, (i13 & 8) != 0 ? null : map2);
    }
}
