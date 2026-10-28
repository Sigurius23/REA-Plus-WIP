package com.whoop.membership.management.domain.models.items;

import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJZ\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b7\u0010#R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b8\u0010\u001d¨\u0006;"}, m65681d2 = {"Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;", "", "", "title", "fromMembership", "toMembership", "Lcom/whoop/membership/management/domain/models/items/DaysLeftModel;", "daysLeft", "Lcom/whoop/membership/management/domain/models/items/CtaModel;", "primaryCta", "secondaryCta", "trackingTier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/management/domain/models/items/DaysLeftModel;Lcom/whoop/membership/management/domain/models/items/CtaModel;Lcom/whoop/membership/management/domain/models/items/CtaModel;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/management/domain/models/items/DaysLeftModel;Lcom/whoop/membership/management/domain/models/items/CtaModel;Lcom/whoop/membership/management/domain/models/items/CtaModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/membership/management/domain/models/items/DaysLeftModel;", "component5", "()Lcom/whoop/membership/management/domain/models/items/CtaModel;", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/management/domain/models/items/DaysLeftModel;Lcom/whoop/membership/management/domain/models/items/CtaModel;Lcom/whoop/membership/management/domain/models/items/CtaModel;Ljava/lang/String;)Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getFromMembership", "getToMembership", "Lcom/whoop/membership/management/domain/models/items/DaysLeftModel;", "getDaysLeft", "Lcom/whoop/membership/management/domain/models/items/CtaModel;", "getPrimaryCta", "getSecondaryCta", "getTrackingTier", "Companion", "$serializer", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DowngradeInfoModel {
    private final DaysLeftModel daysLeft;
    private final String fromMembership;
    private final CtaModel primaryCta;
    private final CtaModel secondaryCta;
    private final String title;
    private final String toMembership;
    private final String trackingTier;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DowngradeInfoModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DowngradeInfoModel(int i13, String str, String str2, String str3, DaysLeftModel daysLeftModel, CtaModel ctaModel, CtaModel ctaModel2, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, DowngradeInfoModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.fromMembership = str2;
        this.toMembership = str3;
        this.daysLeft = daysLeftModel;
        this.primaryCta = ctaModel;
        this.secondaryCta = ctaModel2;
        this.trackingTier = str4;
    }

    public static /* synthetic */ DowngradeInfoModel copy$default(DowngradeInfoModel downgradeInfoModel, String str, String str2, String str3, DaysLeftModel daysLeftModel, CtaModel ctaModel, CtaModel ctaModel2, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = downgradeInfoModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = downgradeInfoModel.fromMembership;
        }
        if ((i13 & 4) != 0) {
            str3 = downgradeInfoModel.toMembership;
        }
        if ((i13 & 8) != 0) {
            daysLeftModel = downgradeInfoModel.daysLeft;
        }
        if ((i13 & 16) != 0) {
            ctaModel = downgradeInfoModel.primaryCta;
        }
        if ((i13 & 32) != 0) {
            ctaModel2 = downgradeInfoModel.secondaryCta;
        }
        if ((i13 & 64) != 0) {
            str4 = downgradeInfoModel.trackingTier;
        }
        CtaModel ctaModel3 = ctaModel2;
        String str5 = str4;
        CtaModel ctaModel4 = ctaModel;
        String str6 = str3;
        return downgradeInfoModel.copy(str, str2, str6, daysLeftModel, ctaModel4, ctaModel3, str5);
    }

    public static final /* synthetic */ void write$Self$membership_release(DowngradeInfoModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.fromMembership);
        output.encodeStringElement(serialDesc, 2, self.toMembership);
        output.encodeNullableSerializableElement(serialDesc, 3, DaysLeftModel$$serializer.INSTANCE, self.daysLeft);
        CtaModel$$serializer ctaModel$$serializer = CtaModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 4, ctaModel$$serializer, self.primaryCta);
        output.encodeNullableSerializableElement(serialDesc, 5, ctaModel$$serializer, self.secondaryCta);
        output.encodeStringElement(serialDesc, 6, self.trackingTier);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFromMembership() {
        return this.fromMembership;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getToMembership() {
        return this.toMembership;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DaysLeftModel getDaysLeft() {
        return this.daysLeft;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CtaModel getPrimaryCta() {
        return this.primaryCta;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CtaModel getSecondaryCta() {
        return this.secondaryCta;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTrackingTier() {
        return this.trackingTier;
    }

    public final DowngradeInfoModel copy(String title, String fromMembership, String toMembership, DaysLeftModel daysLeft, CtaModel primaryCta, CtaModel secondaryCta, String trackingTier) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(fromMembership, "fromMembership");
        AbstractC22676k.m65750j(toMembership, "toMembership");
        AbstractC22676k.m65750j(primaryCta, "primaryCta");
        AbstractC22676k.m65750j(trackingTier, "trackingTier");
        return new DowngradeInfoModel(title, fromMembership, toMembership, daysLeft, primaryCta, secondaryCta, trackingTier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DowngradeInfoModel)) {
            return false;
        }
        DowngradeInfoModel downgradeInfoModel = (DowngradeInfoModel) other;
        return AbstractC22676k.m65745e(this.title, downgradeInfoModel.title) && AbstractC22676k.m65745e(this.fromMembership, downgradeInfoModel.fromMembership) && AbstractC22676k.m65745e(this.toMembership, downgradeInfoModel.toMembership) && AbstractC22676k.m65745e(this.daysLeft, downgradeInfoModel.daysLeft) && AbstractC22676k.m65745e(this.primaryCta, downgradeInfoModel.primaryCta) && AbstractC22676k.m65745e(this.secondaryCta, downgradeInfoModel.secondaryCta) && AbstractC22676k.m65745e(this.trackingTier, downgradeInfoModel.trackingTier);
    }

    public final DaysLeftModel getDaysLeft() {
        return this.daysLeft;
    }

    public final String getFromMembership() {
        return this.fromMembership;
    }

    public final CtaModel getPrimaryCta() {
        return this.primaryCta;
    }

    public final CtaModel getSecondaryCta() {
        return this.secondaryCta;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getToMembership() {
        return this.toMembership;
    }

    public final String getTrackingTier() {
        return this.trackingTier;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.fromMembership), 31, this.toMembership);
        DaysLeftModel daysLeftModel = this.daysLeft;
        int iHashCode = (this.primaryCta.hashCode() + ((iM30450d + (daysLeftModel == null ? 0 : daysLeftModel.hashCode())) * 31)) * 31;
        CtaModel ctaModel = this.secondaryCta;
        return this.trackingTier.hashCode() + ((iHashCode + (ctaModel != null ? ctaModel.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.fromMembership;
        String str3 = this.toMembership;
        DaysLeftModel daysLeftModel = this.daysLeft;
        CtaModel ctaModel = this.primaryCta;
        CtaModel ctaModel2 = this.secondaryCta;
        String str4 = this.trackingTier;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DowngradeInfoModel(title=", str, ", fromMembership=", str2, ", toMembership=");
        sbM32001t.append(str3);
        sbM32001t.append(", daysLeft=");
        sbM32001t.append(daysLeftModel);
        sbM32001t.append(", primaryCta=");
        sbM32001t.append(ctaModel);
        sbM32001t.append(", secondaryCta=");
        sbM32001t.append(ctaModel2);
        sbM32001t.append(", trackingTier=");
        return AbstractC25012a.m73376i(str4, ")", sbM32001t);
    }

    public DowngradeInfoModel(String title, String fromMembership, String toMembership, DaysLeftModel daysLeftModel, CtaModel primaryCta, CtaModel ctaModel, String trackingTier) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(fromMembership, "fromMembership");
        AbstractC22676k.m65750j(toMembership, "toMembership");
        AbstractC22676k.m65750j(primaryCta, "primaryCta");
        AbstractC22676k.m65750j(trackingTier, "trackingTier");
        this.title = title;
        this.fromMembership = fromMembership;
        this.toMembership = toMembership;
        this.daysLeft = daysLeftModel;
        this.primaryCta = primaryCta;
        this.secondaryCta = ctaModel;
        this.trackingTier = trackingTier;
    }
}
