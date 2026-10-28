package com.whoop.hormonalinsights.settings.domain.models;

import com.whoop.design.models.DesignSystemModel;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u0019¨\u00060"}, m65681d2 = {"Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsPrivacy;", "Lcom/whoop/design/models/DesignSystemModel;", "", "titleDisplay", "descriptionDisplay", "ctaTextDisplay", "ctaIcon", "ctaUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsPrivacy;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsPrivacy;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitleDisplay", "getDescriptionDisplay", "getCtaTextDisplay", "getCtaIcon", "getCtaUrl", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HormonalInsightsPrivacy implements DesignSystemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String ctaIcon;
    private final String ctaTextDisplay;
    private final String ctaUrl;
    private final String descriptionDisplay;
    private final String titleDisplay;

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsPrivacy$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsPrivacy;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HormonalInsightsPrivacy$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HormonalInsightsPrivacy(int i13, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, HormonalInsightsPrivacy$$serializer.INSTANCE.getDescriptor());
        }
        this.titleDisplay = str;
        this.descriptionDisplay = str2;
        this.ctaTextDisplay = str3;
        this.ctaIcon = str4;
        this.ctaUrl = str5;
    }

    public static /* synthetic */ HormonalInsightsPrivacy copy$default(HormonalInsightsPrivacy hormonalInsightsPrivacy, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hormonalInsightsPrivacy.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = hormonalInsightsPrivacy.descriptionDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = hormonalInsightsPrivacy.ctaTextDisplay;
        }
        if ((i13 & 8) != 0) {
            str4 = hormonalInsightsPrivacy.ctaIcon;
        }
        if ((i13 & 16) != 0) {
            str5 = hormonalInsightsPrivacy.ctaUrl;
        }
        String str6 = str5;
        String str7 = str3;
        return hormonalInsightsPrivacy.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(HormonalInsightsPrivacy self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.titleDisplay);
        output.encodeStringElement(serialDesc, 1, self.descriptionDisplay);
        output.encodeStringElement(serialDesc, 2, self.ctaTextDisplay);
        output.encodeStringElement(serialDesc, 3, self.ctaIcon);
        output.encodeStringElement(serialDesc, 4, self.ctaUrl);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCtaTextDisplay() {
        return this.ctaTextDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCtaIcon() {
        return this.ctaIcon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCtaUrl() {
        return this.ctaUrl;
    }

    public final HormonalInsightsPrivacy copy(String titleDisplay, String descriptionDisplay, String ctaTextDisplay, String ctaIcon, String ctaUrl) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(ctaTextDisplay, "ctaTextDisplay");
        AbstractC22676k.m65750j(ctaIcon, "ctaIcon");
        AbstractC22676k.m65750j(ctaUrl, "ctaUrl");
        return new HormonalInsightsPrivacy(titleDisplay, descriptionDisplay, ctaTextDisplay, ctaIcon, ctaUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HormonalInsightsPrivacy)) {
            return false;
        }
        HormonalInsightsPrivacy hormonalInsightsPrivacy = (HormonalInsightsPrivacy) other;
        return AbstractC22676k.m65745e(this.titleDisplay, hormonalInsightsPrivacy.titleDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, hormonalInsightsPrivacy.descriptionDisplay) && AbstractC22676k.m65745e(this.ctaTextDisplay, hormonalInsightsPrivacy.ctaTextDisplay) && AbstractC22676k.m65745e(this.ctaIcon, hormonalInsightsPrivacy.ctaIcon) && AbstractC22676k.m65745e(this.ctaUrl, hormonalInsightsPrivacy.ctaUrl);
    }

    public final String getCtaIcon() {
        return this.ctaIcon;
    }

    public final String getCtaTextDisplay() {
        return this.ctaTextDisplay;
    }

    public final String getCtaUrl() {
        return this.ctaUrl;
    }

    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        return this.ctaUrl.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.titleDisplay.hashCode() * 31, 31, this.descriptionDisplay), 31, this.ctaTextDisplay), 31, this.ctaIcon);
    }

    public String toString() {
        String str = this.titleDisplay;
        String str2 = this.descriptionDisplay;
        String str3 = this.ctaTextDisplay;
        String str4 = this.ctaIcon;
        String str5 = this.ctaUrl;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HormonalInsightsPrivacy(titleDisplay=", str, ", descriptionDisplay=", str2, ", ctaTextDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", ctaIcon=", str4, ", ctaUrl=");
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }

    public HormonalInsightsPrivacy(String titleDisplay, String descriptionDisplay, String ctaTextDisplay, String ctaIcon, String ctaUrl) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(ctaTextDisplay, "ctaTextDisplay");
        AbstractC22676k.m65750j(ctaIcon, "ctaIcon");
        AbstractC22676k.m65750j(ctaUrl, "ctaUrl");
        this.titleDisplay = titleDisplay;
        this.descriptionDisplay = descriptionDisplay;
        this.ctaTextDisplay = ctaTextDisplay;
        this.ctaIcon = ctaIcon;
        this.ctaUrl = ctaUrl;
    }
}
