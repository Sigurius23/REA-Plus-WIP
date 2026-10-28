package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import qo1.C30526a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0002<;B`\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012+\b\u0002\u0010\u000e\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r¢\u0006\u0004\b\u000f\u0010\u0010BY\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010!\u001a\u00020\u00022\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001f0\u0007H\u0016¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b%\u0010&J\u001e\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b'\u0010(J3\u0010)\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b)\u0010(Jk\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072+\b\u0002\u0010\u000e\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b,\u0010$J\u0010\u0010-\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\u00052\b\u0010/\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b0\u00101R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b\u0006\u0010&R0\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u00105\u001a\u0004\b6\u0010(\"\u0004\b7\u00108RE\u0010\u000e\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u00105\u001a\u0004\b9\u0010(\"\u0004\b:\u00108¨\u0006="}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsLoaderModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "text", "", "isPresented", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Ljava/lang/String;ZLjava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsLoaderModel;Lzc3/c;Lyc3/g;)V", "write$Self", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Ljava/util/Map;", "component4", "copy", "(Ljava/lang/String;ZLjava/util/Map;Ljava/util/Map;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsLoaderModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Z", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HormonalInsightsLoaderModel implements DesignSystemModel, WithGeneratedBindings {
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final boolean isPresented;
    private final String text;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C30526a(15)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsLoaderModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsLoaderModel;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HormonalInsightsLoaderModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HormonalInsightsLoaderModel(int i13, String str, boolean z4, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, HormonalInsightsLoaderModel$$serializer.INSTANCE.getDescriptor());
        }
        this.text = str;
        if ((i13 & 2) == 0) {
            this.isPresented = false;
        } else {
            this.isPresented = z4;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HormonalInsightsLoaderModel copy$default(HormonalInsightsLoaderModel hormonalInsightsLoaderModel, String str, boolean z4, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hormonalInsightsLoaderModel.text;
        }
        if ((i13 & 2) != 0) {
            z4 = hormonalInsightsLoaderModel.isPresented;
        }
        if ((i13 & 4) != 0) {
            map = hormonalInsightsLoaderModel.bindings;
        }
        if ((i13 & 8) != 0) {
            map2 = hormonalInsightsLoaderModel.aggregateBindings;
        }
        return hormonalInsightsLoaderModel.copy(str, z4, map, map2);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(HormonalInsightsLoaderModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.text);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.isPresented) {
            output.encodeBooleanElement(serialDesc, 1, self.isPresented);
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
    public WithGeneratedBindings bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return HormonalInsightsLoaderModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsPresented() {
        return this.isPresented;
    }

    public final Map<String, String> component3() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component4() {
        return this.aggregateBindings;
    }

    public final HormonalInsightsLoaderModel copy(String text, boolean isPresented, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        return new HormonalInsightsLoaderModel(text, isPresented, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HormonalInsightsLoaderModel)) {
            return false;
        }
        HormonalInsightsLoaderModel hormonalInsightsLoaderModel = (HormonalInsightsLoaderModel) other;
        return AbstractC22676k.m65745e(this.text, hormonalInsightsLoaderModel.text) && this.isPresented == hormonalInsightsLoaderModel.isPresented && AbstractC22676k.m65745e(this.bindings, hormonalInsightsLoaderModel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, hormonalInsightsLoaderModel.aggregateBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int iM8289b = AbstractC2875y.m8289b((str == null ? 0 : str.hashCode()) * 31, 31, this.isPresented);
        Map<String, String> map = this.bindings;
        int iHashCode = (iM8289b + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode + (map2 != null ? map2.hashCode() : 0);
    }

    public final boolean isPresented() {
        return this.isPresented;
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
        String str = this.text;
        boolean z4 = this.isPresented;
        return AbstractC30802r.m94765n(AbstractC25012a.m73379l("HormonalInsightsLoaderModel(text=", str, ", isPresented=", ", bindings=", z4), this.bindings, ", aggregateBindings=", this.aggregateBindings, ")");
    }

    public HormonalInsightsLoaderModel(String str, boolean z4, Map<String, String> map, Map<String, AggregateBinding> map2) {
        this.text = str;
        this.isPresented = z4;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    public /* synthetic */ HormonalInsightsLoaderModel(String str, boolean z4, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? null : map, (i13 & 8) != 0 ? null : map2);
    }
}
