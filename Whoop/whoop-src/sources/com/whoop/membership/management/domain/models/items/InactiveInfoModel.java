package com.whoop.membership.management.domain.models.items;

import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJP\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b4\u0010!R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b5\u0010\u001c¨\u00068"}, m65681d2 = {"Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;", "", "", "title", "subtitle", "Lcom/whoop/membership/management/domain/models/items/DaysLeftModel;", "daysLeft", "Lcom/whoop/membership/management/domain/models/items/CtaModel;", "primaryCta", "secondaryCta", "trackingTier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/management/domain/models/items/DaysLeftModel;Lcom/whoop/membership/management/domain/models/items/CtaModel;Lcom/whoop/membership/management/domain/models/items/CtaModel;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/membership/management/domain/models/items/DaysLeftModel;Lcom/whoop/membership/management/domain/models/items/CtaModel;Lcom/whoop/membership/management/domain/models/items/CtaModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/membership/management/domain/models/items/DaysLeftModel;", "component4", "()Lcom/whoop/membership/management/domain/models/items/CtaModel;", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/management/domain/models/items/DaysLeftModel;Lcom/whoop/membership/management/domain/models/items/CtaModel;Lcom/whoop/membership/management/domain/models/items/CtaModel;Ljava/lang/String;)Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/whoop/membership/management/domain/models/items/DaysLeftModel;", "getDaysLeft", "Lcom/whoop/membership/management/domain/models/items/CtaModel;", "getPrimaryCta", "getSecondaryCta", "getTrackingTier", "Companion", "$serializer", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class InactiveInfoModel {
    private final DaysLeftModel daysLeft;
    private final CtaModel primaryCta;
    private final CtaModel secondaryCta;
    private final String subtitle;
    private final String title;
    private final String trackingTier;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return InactiveInfoModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ InactiveInfoModel(int i13, String str, String str2, DaysLeftModel daysLeftModel, CtaModel ctaModel, CtaModel ctaModel2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, InactiveInfoModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = str2;
        this.daysLeft = daysLeftModel;
        this.primaryCta = ctaModel;
        this.secondaryCta = ctaModel2;
        this.trackingTier = str3;
    }

    public static /* synthetic */ InactiveInfoModel copy$default(InactiveInfoModel inactiveInfoModel, String str, String str2, DaysLeftModel daysLeftModel, CtaModel ctaModel, CtaModel ctaModel2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = inactiveInfoModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = inactiveInfoModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            daysLeftModel = inactiveInfoModel.daysLeft;
        }
        if ((i13 & 8) != 0) {
            ctaModel = inactiveInfoModel.primaryCta;
        }
        if ((i13 & 16) != 0) {
            ctaModel2 = inactiveInfoModel.secondaryCta;
        }
        if ((i13 & 32) != 0) {
            str3 = inactiveInfoModel.trackingTier;
        }
        CtaModel ctaModel3 = ctaModel2;
        String str4 = str3;
        return inactiveInfoModel.copy(str, str2, daysLeftModel, ctaModel, ctaModel3, str4);
    }

    public static final /* synthetic */ void write$Self$membership_release(InactiveInfoModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 2, DaysLeftModel$$serializer.INSTANCE, self.daysLeft);
        CtaModel$$serializer ctaModel$$serializer = CtaModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 3, ctaModel$$serializer, self.primaryCta);
        output.encodeNullableSerializableElement(serialDesc, 4, ctaModel$$serializer, self.secondaryCta);
        output.encodeStringElement(serialDesc, 5, self.trackingTier);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DaysLeftModel getDaysLeft() {
        return this.daysLeft;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CtaModel getPrimaryCta() {
        return this.primaryCta;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CtaModel getSecondaryCta() {
        return this.secondaryCta;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTrackingTier() {
        return this.trackingTier;
    }

    public final InactiveInfoModel copy(String title, String subtitle, DaysLeftModel daysLeft, CtaModel primaryCta, CtaModel secondaryCta, String trackingTier) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(primaryCta, "primaryCta");
        AbstractC22676k.m65750j(trackingTier, "trackingTier");
        return new InactiveInfoModel(title, subtitle, daysLeft, primaryCta, secondaryCta, trackingTier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InactiveInfoModel)) {
            return false;
        }
        InactiveInfoModel inactiveInfoModel = (InactiveInfoModel) other;
        return AbstractC22676k.m65745e(this.title, inactiveInfoModel.title) && AbstractC22676k.m65745e(this.subtitle, inactiveInfoModel.subtitle) && AbstractC22676k.m65745e(this.daysLeft, inactiveInfoModel.daysLeft) && AbstractC22676k.m65745e(this.primaryCta, inactiveInfoModel.primaryCta) && AbstractC22676k.m65745e(this.secondaryCta, inactiveInfoModel.secondaryCta) && AbstractC22676k.m65745e(this.trackingTier, inactiveInfoModel.trackingTier);
    }

    public final DaysLeftModel getDaysLeft() {
        return this.daysLeft;
    }

    public final CtaModel getPrimaryCta() {
        return this.primaryCta;
    }

    public final CtaModel getSecondaryCta() {
        return this.secondaryCta;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrackingTier() {
        return this.trackingTier;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle);
        DaysLeftModel daysLeftModel = this.daysLeft;
        int iHashCode = (this.primaryCta.hashCode() + ((iM30450d + (daysLeftModel == null ? 0 : daysLeftModel.hashCode())) * 31)) * 31;
        CtaModel ctaModel = this.secondaryCta;
        return this.trackingTier.hashCode() + ((iHashCode + (ctaModel != null ? ctaModel.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        DaysLeftModel daysLeftModel = this.daysLeft;
        CtaModel ctaModel = this.primaryCta;
        CtaModel ctaModel2 = this.secondaryCta;
        String str3 = this.trackingTier;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("InactiveInfoModel(title=", str, ", subtitle=", str2, ", daysLeft=");
        sbM32001t.append(daysLeftModel);
        sbM32001t.append(", primaryCta=");
        sbM32001t.append(ctaModel);
        sbM32001t.append(", secondaryCta=");
        sbM32001t.append(ctaModel2);
        sbM32001t.append(", trackingTier=");
        sbM32001t.append(str3);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public InactiveInfoModel(String title, String subtitle, DaysLeftModel daysLeftModel, CtaModel primaryCta, CtaModel ctaModel, String trackingTier) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(primaryCta, "primaryCta");
        AbstractC22676k.m65750j(trackingTier, "trackingTier");
        this.title = title;
        this.subtitle = subtitle;
        this.daysLeft = daysLeftModel;
        this.primaryCta = primaryCta;
        this.secondaryCta = ctaModel;
        this.trackingTier = trackingTier;
    }
}
