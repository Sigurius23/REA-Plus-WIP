package com.whoop.membership.management.domain.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hb1.C17089l;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ@\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b1\u0010\u001b¨\u00064"}, m65681d2 = {"Lcom/whoop/membership/management/domain/models/items/MembershipFeaturesCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "tierImage", "", "Lcom/whoop/membership/management/domain/models/items/MembershipFeatureModel;", "features", "Lcom/whoop/membership/management/domain/models/items/CtaModel;", "cta", "style", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/management/domain/models/items/CtaModel;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/membership/management/domain/models/items/CtaModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/management/domain/models/items/MembershipFeaturesCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/membership/management/domain/models/items/CtaModel;", "component4", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/management/domain/models/items/CtaModel;Ljava/lang/String;)Lcom/whoop/membership/management/domain/models/items/MembershipFeaturesCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTierImage", "Ljava/util/List;", "getFeatures", "Lcom/whoop/membership/management/domain/models/items/CtaModel;", "getCta", "getStyle", "Companion", "$serializer", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MembershipFeaturesCardModel implements DesignSystemModel {
    private final CtaModel cta;
    private final List<MembershipFeatureModel> features;
    private final String style;
    private final String tierImage;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C17089l(22)), null, null};

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/management/domain/models/items/MembershipFeaturesCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/management/domain/models/items/MembershipFeaturesCardModel;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MembershipFeaturesCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MembershipFeaturesCardModel(int i13, String str, List list, CtaModel ctaModel, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, MembershipFeaturesCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.tierImage = str;
        this.features = list;
        this.cta = ctaModel;
        this.style = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(MembershipFeatureModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MembershipFeaturesCardModel copy$default(MembershipFeaturesCardModel membershipFeaturesCardModel, String str, List list, CtaModel ctaModel, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = membershipFeaturesCardModel.tierImage;
        }
        if ((i13 & 2) != 0) {
            list = membershipFeaturesCardModel.features;
        }
        if ((i13 & 4) != 0) {
            ctaModel = membershipFeaturesCardModel.cta;
        }
        if ((i13 & 8) != 0) {
            str2 = membershipFeaturesCardModel.style;
        }
        return membershipFeaturesCardModel.copy(str, list, ctaModel, str2);
    }

    public static final /* synthetic */ void write$Self$membership_release(MembershipFeaturesCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.tierImage);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.features);
        output.encodeNullableSerializableElement(serialDesc, 2, CtaModel$$serializer.INSTANCE, self.cta);
        output.encodeStringElement(serialDesc, 3, self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTierImage() {
        return this.tierImage;
    }

    public final List<MembershipFeatureModel> component2() {
        return this.features;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CtaModel getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public final MembershipFeaturesCardModel copy(String tierImage, List<MembershipFeatureModel> features, CtaModel cta, String style) {
        AbstractC22676k.m65750j(tierImage, "tierImage");
        AbstractC22676k.m65750j(features, "features");
        AbstractC22676k.m65750j(style, "style");
        return new MembershipFeaturesCardModel(tierImage, features, cta, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MembershipFeaturesCardModel)) {
            return false;
        }
        MembershipFeaturesCardModel membershipFeaturesCardModel = (MembershipFeaturesCardModel) other;
        return AbstractC22676k.m65745e(this.tierImage, membershipFeaturesCardModel.tierImage) && AbstractC22676k.m65745e(this.features, membershipFeaturesCardModel.features) && AbstractC22676k.m65745e(this.cta, membershipFeaturesCardModel.cta) && AbstractC22676k.m65745e(this.style, membershipFeaturesCardModel.style);
    }

    public final CtaModel getCta() {
        return this.cta;
    }

    public final List<MembershipFeatureModel> getFeatures() {
        return this.features;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getTierImage() {
        return this.tierImage;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.tierImage.hashCode() * 31, 31, this.features);
        CtaModel ctaModel = this.cta;
        return this.style.hashCode() + ((iM31983b + (ctaModel == null ? 0 : ctaModel.hashCode())) * 31);
    }

    public String toString() {
        String str = this.tierImage;
        List<MembershipFeatureModel> list = this.features;
        CtaModel ctaModel = this.cta;
        String str2 = this.style;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("MembershipFeaturesCardModel(tierImage=", str, ", features=", ", cta=", list);
        sbM94766o.append(ctaModel);
        sbM94766o.append(", style=");
        sbM94766o.append(str2);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public MembershipFeaturesCardModel(String tierImage, List<MembershipFeatureModel> features, CtaModel ctaModel, String style) {
        AbstractC22676k.m65750j(tierImage, "tierImage");
        AbstractC22676k.m65750j(features, "features");
        AbstractC22676k.m65750j(style, "style");
        this.tierImage = tierImage;
        this.features = features;
        this.cta = ctaModel;
        this.style = style;
    }
}
