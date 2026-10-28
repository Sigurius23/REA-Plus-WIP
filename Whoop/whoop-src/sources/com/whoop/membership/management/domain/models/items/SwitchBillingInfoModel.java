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
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010 JL\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010 R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b2\u0010 ¨\u00065"}, m65681d2 = {"Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;", "", "", "title", "subtitle", "strikethroughPrice", "price", "Lcom/whoop/membership/management/domain/models/items/CtaModel;", "primaryCta", "secondaryCta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/management/domain/models/items/CtaModel;Lcom/whoop/membership/management/domain/models/items/CtaModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/management/domain/models/items/CtaModel;Lcom/whoop/membership/management/domain/models/items/CtaModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/whoop/membership/management/domain/models/items/CtaModel;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/management/domain/models/items/CtaModel;Lcom/whoop/membership/management/domain/models/items/CtaModel;)Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getStrikethroughPrice", "getPrice", "Lcom/whoop/membership/management/domain/models/items/CtaModel;", "getPrimaryCta", "getSecondaryCta", "Companion", "$serializer", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SwitchBillingInfoModel {
    private final String price;
    private final CtaModel primaryCta;
    private final CtaModel secondaryCta;
    private final String strikethroughPrice;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SwitchBillingInfoModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SwitchBillingInfoModel(int i13, String str, String str2, String str3, String str4, CtaModel ctaModel, CtaModel ctaModel2, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, SwitchBillingInfoModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = str2;
        this.strikethroughPrice = str3;
        this.price = str4;
        this.primaryCta = ctaModel;
        this.secondaryCta = ctaModel2;
    }

    public static /* synthetic */ SwitchBillingInfoModel copy$default(SwitchBillingInfoModel switchBillingInfoModel, String str, String str2, String str3, String str4, CtaModel ctaModel, CtaModel ctaModel2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = switchBillingInfoModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = switchBillingInfoModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            str3 = switchBillingInfoModel.strikethroughPrice;
        }
        if ((i13 & 8) != 0) {
            str4 = switchBillingInfoModel.price;
        }
        if ((i13 & 16) != 0) {
            ctaModel = switchBillingInfoModel.primaryCta;
        }
        if ((i13 & 32) != 0) {
            ctaModel2 = switchBillingInfoModel.secondaryCta;
        }
        CtaModel ctaModel3 = ctaModel;
        CtaModel ctaModel4 = ctaModel2;
        return switchBillingInfoModel.copy(str, str2, str3, str4, ctaModel3, ctaModel4);
    }

    public static final /* synthetic */ void write$Self$membership_release(SwitchBillingInfoModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.subtitle);
        output.encodeStringElement(serialDesc, 2, self.strikethroughPrice);
        output.encodeStringElement(serialDesc, 3, self.price);
        CtaModel$$serializer ctaModel$$serializer = CtaModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 4, ctaModel$$serializer, self.primaryCta);
        output.encodeSerializableElement(serialDesc, 5, ctaModel$$serializer, self.secondaryCta);
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
    public final String getStrikethroughPrice() {
        return this.strikethroughPrice;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CtaModel getPrimaryCta() {
        return this.primaryCta;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CtaModel getSecondaryCta() {
        return this.secondaryCta;
    }

    public final SwitchBillingInfoModel copy(String title, String subtitle, String strikethroughPrice, String price, CtaModel primaryCta, CtaModel secondaryCta) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(strikethroughPrice, "strikethroughPrice");
        AbstractC22676k.m65750j(price, "price");
        AbstractC22676k.m65750j(primaryCta, "primaryCta");
        AbstractC22676k.m65750j(secondaryCta, "secondaryCta");
        return new SwitchBillingInfoModel(title, subtitle, strikethroughPrice, price, primaryCta, secondaryCta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwitchBillingInfoModel)) {
            return false;
        }
        SwitchBillingInfoModel switchBillingInfoModel = (SwitchBillingInfoModel) other;
        return AbstractC22676k.m65745e(this.title, switchBillingInfoModel.title) && AbstractC22676k.m65745e(this.subtitle, switchBillingInfoModel.subtitle) && AbstractC22676k.m65745e(this.strikethroughPrice, switchBillingInfoModel.strikethroughPrice) && AbstractC22676k.m65745e(this.price, switchBillingInfoModel.price) && AbstractC22676k.m65745e(this.primaryCta, switchBillingInfoModel.primaryCta) && AbstractC22676k.m65745e(this.secondaryCta, switchBillingInfoModel.secondaryCta);
    }

    public final String getPrice() {
        return this.price;
    }

    public final CtaModel getPrimaryCta() {
        return this.primaryCta;
    }

    public final CtaModel getSecondaryCta() {
        return this.secondaryCta;
    }

    public final String getStrikethroughPrice() {
        return this.strikethroughPrice;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.secondaryCta.hashCode() + ((this.primaryCta.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.strikethroughPrice), 31, this.price)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.strikethroughPrice;
        String str4 = this.price;
        CtaModel ctaModel = this.primaryCta;
        CtaModel ctaModel2 = this.secondaryCta;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SwitchBillingInfoModel(title=", str, ", subtitle=", str2, ", strikethroughPrice=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", price=", str4, ", primaryCta=");
        sbM32001t.append(ctaModel);
        sbM32001t.append(", secondaryCta=");
        sbM32001t.append(ctaModel2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public SwitchBillingInfoModel(String title, String subtitle, String strikethroughPrice, String price, CtaModel primaryCta, CtaModel secondaryCta) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(strikethroughPrice, "strikethroughPrice");
        AbstractC22676k.m65750j(price, "price");
        AbstractC22676k.m65750j(primaryCta, "primaryCta");
        AbstractC22676k.m65750j(secondaryCta, "secondaryCta");
        this.title = title;
        this.subtitle = subtitle;
        this.strikethroughPrice = strikethroughPrice;
        this.price = price;
        this.primaryCta = primaryCta;
        this.secondaryCta = secondaryCta;
    }
}
