package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36963j;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0002FEB\u0080\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012+\b\u0002\u0010\u0011\u001a%\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tj\u0004\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\u0004\b\u0012\u0010\u0013B{\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J#\u0010$\u001a\u00020\u00022\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\"0\tH\u0016¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b+\u0010*J\u001e\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b,\u0010-J3\u0010.\u001a%\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tj\u0004\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\b.\u0010-J\u008d\u0001\u0010/\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2+\b\u0002\u0010\u0011\u001a%\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tj\u0004\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b7\u00108R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b:\u0010'R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b;\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010*R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\b>\u0010*R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010-\"\u0004\bA\u0010BRE\u0010\u0011\u001a%\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tj\u0004\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010?\u001a\u0004\bC\u0010-\"\u0004\bD\u0010B¨\u0006G"}, m65681d2 = {"Lcom/whoop/design/models/items/SplitColumnModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "topContent", "bottomContent", "", "topChildPadding", "bottomChildPadding", "", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/SplitColumnModel;Lzc3/c;Lyc3/g;)V", "write$Self", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/lang/Double;", "component4", "component5", "()Ljava/util/Map;", "component6", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/SplitColumnModel;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTopContent", "getBottomContent", "Ljava/lang/Double;", "getTopChildPadding", "getBottomChildPadding", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SplitColumnModel implements DesignSystemModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final Double bottomChildPadding;
    private final List<DesignSystemModel> bottomContent;
    private final Double topChildPadding;
    private final List<DesignSystemModel> topContent;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/SplitColumnModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/SplitColumnModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SplitColumnModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C36963j(24)), AbstractC30060g.m92087G(enumC23463i, new C36963j(25)), null, null, AbstractC30060g.m92087G(enumC23463i, new C36963j(26)), null};
    }

    public /* synthetic */ SplitColumnModel(int i13, List list, List list2, Double d3, Double d14, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, SplitColumnModel$$serializer.INSTANCE.getDescriptor());
        }
        this.topContent = list;
        this.bottomContent = list2;
        if ((i13 & 4) == 0) {
            this.topChildPadding = null;
        } else {
            this.topChildPadding = d3;
        }
        if ((i13 & 8) == 0) {
            this.bottomChildPadding = null;
        } else {
            this.bottomChildPadding = d14;
        }
        if ((i13 & 16) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 32) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SplitColumnModel copy$default(SplitColumnModel splitColumnModel, List list, List list2, Double d3, Double d14, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = splitColumnModel.topContent;
        }
        if ((i13 & 2) != 0) {
            list2 = splitColumnModel.bottomContent;
        }
        if ((i13 & 4) != 0) {
            d3 = splitColumnModel.topChildPadding;
        }
        if ((i13 & 8) != 0) {
            d14 = splitColumnModel.bottomChildPadding;
        }
        if ((i13 & 16) != 0) {
            map = splitColumnModel.bindings;
        }
        if ((i13 & 32) != 0) {
            map2 = splitColumnModel.aggregateBindings;
        }
        Map map3 = map;
        Map map4 = map2;
        return splitColumnModel.copy(list, list2, d3, d14, map3, map4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(SplitColumnModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.topContent);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.bottomContent);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.topChildPadding != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, DoubleSerializer.INSTANCE, self.topChildPadding);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.bottomChildPadding != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, DoubleSerializer.INSTANCE, self.bottomChildPadding);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public WithGeneratedBindings bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return SplitColumnModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    public final List<DesignSystemModel> component1() {
        return this.topContent;
    }

    public final List<DesignSystemModel> component2() {
        return this.bottomContent;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getTopChildPadding() {
        return this.topChildPadding;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getBottomChildPadding() {
        return this.bottomChildPadding;
    }

    public final Map<String, String> component5() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component6() {
        return this.aggregateBindings;
    }

    public final SplitColumnModel copy(List<? extends DesignSystemModel> topContent, List<? extends DesignSystemModel> bottomContent, Double topChildPadding, Double bottomChildPadding, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(topContent, "topContent");
        AbstractC22676k.m65750j(bottomContent, "bottomContent");
        return new SplitColumnModel(topContent, bottomContent, topChildPadding, bottomChildPadding, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitColumnModel)) {
            return false;
        }
        SplitColumnModel splitColumnModel = (SplitColumnModel) other;
        return AbstractC22676k.m65745e(this.topContent, splitColumnModel.topContent) && AbstractC22676k.m65745e(this.bottomContent, splitColumnModel.bottomContent) && AbstractC22676k.m65745e(this.topChildPadding, splitColumnModel.topChildPadding) && AbstractC22676k.m65745e(this.bottomChildPadding, splitColumnModel.bottomChildPadding) && AbstractC22676k.m65745e(this.bindings, splitColumnModel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, splitColumnModel.aggregateBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final Double getBottomChildPadding() {
        return this.bottomChildPadding;
    }

    public final List<DesignSystemModel> getBottomContent() {
        return this.bottomContent;
    }

    public final Double getTopChildPadding() {
        return this.topChildPadding;
    }

    public final List<DesignSystemModel> getTopContent() {
        return this.topContent;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.topContent.hashCode() * 31, 31, this.bottomContent);
        Double d3 = this.topChildPadding;
        int iHashCode = (iM31983b + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d14 = this.bottomChildPadding;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Map<String, String> map = this.bindings;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode3 + (map2 != null ? map2.hashCode() : 0);
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
        List<DesignSystemModel> list = this.topContent;
        List<DesignSystemModel> list2 = this.bottomContent;
        Double d3 = this.topChildPadding;
        Double d14 = this.bottomChildPadding;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sbM124380j = AbstractC38963t7.m124380j("SplitColumnModel(topContent=", ", bottomContent=", list, ", topChildPadding=", list2);
        AbstractC21702c.m61146q(sbM124380j, d3, ", bottomChildPadding=", d14, ", bindings=");
        return AbstractC30802r.m94765n(sbM124380j, map, ", aggregateBindings=", map2, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SplitColumnModel(List<? extends DesignSystemModel> topContent, List<? extends DesignSystemModel> bottomContent, Double d3, Double d14, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(topContent, "topContent");
        AbstractC22676k.m65750j(bottomContent, "bottomContent");
        this.topContent = topContent;
        this.bottomContent = bottomContent;
        this.topChildPadding = d3;
        this.bottomChildPadding = d14;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    public /* synthetic */ SplitColumnModel(List list, List list2, Double d3, Double d14, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, (i13 & 4) != 0 ? null : d3, (i13 & 8) != 0 ? null : d14, (i13 & 16) != 0 ? null : map, (i13 & 32) != 0 ? null : map2);
    }
}
