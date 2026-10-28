package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36960g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B?\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBY\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$JR\u0010%\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b0\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010$¨\u0006:"}, m65681d2 = {"Lcom/whoop/design/models/items/MembershipComparisonTableModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "", "features", "Lcom/whoop/design/models/items/MembershipPlan;", "plans", "priceLabel", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "secondaryButton", "Lcom/whoop/design/models/items/CardButtonModel;", "button", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/CardButtonModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/MembershipComparisonTableModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Lcom/whoop/design/models/items/SecondaryButtonModel;", "component5", "()Lcom/whoop/design/models/items/CardButtonModel;", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/CardButtonModel;)Lcom/whoop/design/models/items/MembershipComparisonTableModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getFeatures", "getPlans", "Ljava/lang/String;", "getPriceLabel", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "getSecondaryButton", "Lcom/whoop/design/models/items/CardButtonModel;", "getButton", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MembershipComparisonTableModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final CardButtonModel button;
    private final List<String> features;
    private final List<MembershipPlan> plans;
    private final String priceLabel;
    private final SecondaryButtonModel secondaryButton;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/MembershipComparisonTableModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/MembershipComparisonTableModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MembershipComparisonTableModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C36960g(14)), AbstractC30060g.m92087G(enumC23463i, new C36960g(15)), null, null, null};
    }

    public /* synthetic */ MembershipComparisonTableModel(int i13, List list, List list2, String str, SecondaryButtonModel secondaryButtonModel, CardButtonModel cardButtonModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, MembershipComparisonTableModel$$serializer.INSTANCE.getDescriptor());
        }
        this.features = list;
        this.plans = list2;
        this.priceLabel = str;
        this.secondaryButton = secondaryButtonModel;
        this.button = cardButtonModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(MembershipPlan$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MembershipComparisonTableModel copy$default(MembershipComparisonTableModel membershipComparisonTableModel, List list, List list2, String str, SecondaryButtonModel secondaryButtonModel, CardButtonModel cardButtonModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = membershipComparisonTableModel.features;
        }
        if ((i13 & 2) != 0) {
            list2 = membershipComparisonTableModel.plans;
        }
        if ((i13 & 4) != 0) {
            str = membershipComparisonTableModel.priceLabel;
        }
        if ((i13 & 8) != 0) {
            secondaryButtonModel = membershipComparisonTableModel.secondaryButton;
        }
        if ((i13 & 16) != 0) {
            cardButtonModel = membershipComparisonTableModel.button;
        }
        CardButtonModel cardButtonModel2 = cardButtonModel;
        String str2 = str;
        return membershipComparisonTableModel.copy(list, list2, str2, secondaryButtonModel, cardButtonModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(MembershipComparisonTableModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.features);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.plans);
        output.encodeStringElement(serialDesc, 2, self.priceLabel);
        output.encodeNullableSerializableElement(serialDesc, 3, SecondaryButtonModel$$serializer.INSTANCE, self.secondaryButton);
        output.encodeNullableSerializableElement(serialDesc, 4, CardButtonModel$$serializer.INSTANCE, self.button);
    }

    public final List<String> component1() {
        return this.features;
    }

    public final List<MembershipPlan> component2() {
        return this.plans;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPriceLabel() {
        return this.priceLabel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SecondaryButtonModel getSecondaryButton() {
        return this.secondaryButton;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CardButtonModel getButton() {
        return this.button;
    }

    public final MembershipComparisonTableModel copy(List<String> features, List<MembershipPlan> plans, String priceLabel, SecondaryButtonModel secondaryButton, CardButtonModel button) {
        AbstractC22676k.m65750j(features, "features");
        AbstractC22676k.m65750j(plans, "plans");
        AbstractC22676k.m65750j(priceLabel, "priceLabel");
        return new MembershipComparisonTableModel(features, plans, priceLabel, secondaryButton, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MembershipComparisonTableModel)) {
            return false;
        }
        MembershipComparisonTableModel membershipComparisonTableModel = (MembershipComparisonTableModel) other;
        return AbstractC22676k.m65745e(this.features, membershipComparisonTableModel.features) && AbstractC22676k.m65745e(this.plans, membershipComparisonTableModel.plans) && AbstractC22676k.m65745e(this.priceLabel, membershipComparisonTableModel.priceLabel) && AbstractC22676k.m65745e(this.secondaryButton, membershipComparisonTableModel.secondaryButton) && AbstractC22676k.m65745e(this.button, membershipComparisonTableModel.button);
    }

    public final CardButtonModel getButton() {
        return this.button;
    }

    public final List<String> getFeatures() {
        return this.features;
    }

    public final List<MembershipPlan> getPlans() {
        return this.plans;
    }

    public final String getPriceLabel() {
        return this.priceLabel;
    }

    public final SecondaryButtonModel getSecondaryButton() {
        return this.secondaryButton;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11895b.m31983b(this.features.hashCode() * 31, 31, this.plans), 31, this.priceLabel);
        SecondaryButtonModel secondaryButtonModel = this.secondaryButton;
        int iHashCode = (iM30450d + (secondaryButtonModel == null ? 0 : secondaryButtonModel.hashCode())) * 31;
        CardButtonModel cardButtonModel = this.button;
        return iHashCode + (cardButtonModel != null ? cardButtonModel.hashCode() : 0);
    }

    public String toString() {
        List<String> list = this.features;
        List<MembershipPlan> list2 = this.plans;
        String str = this.priceLabel;
        SecondaryButtonModel secondaryButtonModel = this.secondaryButton;
        CardButtonModel cardButtonModel = this.button;
        StringBuilder sbM124380j = AbstractC38963t7.m124380j("MembershipComparisonTableModel(features=", ", plans=", list, ", priceLabel=", list2);
        sbM124380j.append(str);
        sbM124380j.append(", secondaryButton=");
        sbM124380j.append(secondaryButtonModel);
        sbM124380j.append(", button=");
        sbM124380j.append(cardButtonModel);
        sbM124380j.append(")");
        return sbM124380j.toString();
    }

    public MembershipComparisonTableModel(List<String> features, List<MembershipPlan> plans, String priceLabel, SecondaryButtonModel secondaryButtonModel, CardButtonModel cardButtonModel) {
        AbstractC22676k.m65750j(features, "features");
        AbstractC22676k.m65750j(plans, "plans");
        AbstractC22676k.m65750j(priceLabel, "priceLabel");
        this.features = features;
        this.plans = plans;
        this.priceLabel = priceLabel;
        this.secondaryButton = secondaryButtonModel;
        this.button = cardButtonModel;
    }
}
