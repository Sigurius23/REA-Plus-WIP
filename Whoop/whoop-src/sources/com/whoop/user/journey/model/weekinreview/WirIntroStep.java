package com.whoop.user.journey.model.weekinreview;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.user.journey.model.UserJourneyStep;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJL\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b/\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b0\u0010\u001a¨\u00063"}, m65681d2 = {"Lcom/whoop/user/journey/model/weekinreview/WirIntroStep;", "Lcom/whoop/user/journey/model/UserJourneyStep;", "", "footerText", "footerSubText", "backgroundImageUrl", "name", "theme", "themeVariant", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/weekinreview/WirIntroStep;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/weekinreview/WirIntroStep;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFooterText", "getFooterSubText", "getBackgroundImageUrl", "getName", "getTheme", "getThemeVariant", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WirIntroStep implements UserJourneyStep {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String backgroundImageUrl;
    private final String footerSubText;
    private final String footerText;
    private final String name;
    private final String theme;
    private final String themeVariant;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/weekinreview/WirIntroStep$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/weekinreview/WirIntroStep;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WirIntroStep$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WirIntroStep(int i13, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, WirIntroStep$$serializer.INSTANCE.getDescriptor());
        }
        this.footerText = str;
        this.footerSubText = str2;
        this.backgroundImageUrl = str3;
        this.name = str4;
        this.theme = str5;
        this.themeVariant = str6;
    }

    public static /* synthetic */ WirIntroStep copy$default(WirIntroStep wirIntroStep, String str, String str2, String str3, String str4, String str5, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = wirIntroStep.footerText;
        }
        if ((i13 & 2) != 0) {
            str2 = wirIntroStep.footerSubText;
        }
        if ((i13 & 4) != 0) {
            str3 = wirIntroStep.backgroundImageUrl;
        }
        if ((i13 & 8) != 0) {
            str4 = wirIntroStep.name;
        }
        if ((i13 & 16) != 0) {
            str5 = wirIntroStep.theme;
        }
        if ((i13 & 32) != 0) {
            str6 = wirIntroStep.themeVariant;
        }
        String str7 = str5;
        String str8 = str6;
        return wirIntroStep.copy(str, str2, str3, str4, str7, str8);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(WirIntroStep self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.footerText);
        output.encodeStringElement(serialDesc, 1, self.footerSubText);
        output.encodeStringElement(serialDesc, 2, self.backgroundImageUrl);
        output.encodeStringElement(serialDesc, 3, self.name);
        output.encodeStringElement(serialDesc, 4, self.theme);
        output.encodeStringElement(serialDesc, 5, self.themeVariant);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFooterText() {
        return this.footerText;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFooterSubText() {
        return this.footerSubText;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getThemeVariant() {
        return this.themeVariant;
    }

    public final WirIntroStep copy(String footerText, String footerSubText, String backgroundImageUrl, String name, String theme, String themeVariant) {
        AbstractC22676k.m65750j(footerText, "footerText");
        AbstractC22676k.m65750j(footerSubText, "footerSubText");
        AbstractC22676k.m65750j(backgroundImageUrl, "backgroundImageUrl");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        return new WirIntroStep(footerText, footerSubText, backgroundImageUrl, name, theme, themeVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WirIntroStep)) {
            return false;
        }
        WirIntroStep wirIntroStep = (WirIntroStep) other;
        return AbstractC22676k.m65745e(this.footerText, wirIntroStep.footerText) && AbstractC22676k.m65745e(this.footerSubText, wirIntroStep.footerSubText) && AbstractC22676k.m65745e(this.backgroundImageUrl, wirIntroStep.backgroundImageUrl) && AbstractC22676k.m65745e(this.name, wirIntroStep.name) && AbstractC22676k.m65745e(this.theme, wirIntroStep.theme) && AbstractC22676k.m65745e(this.themeVariant, wirIntroStep.themeVariant);
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final String getFooterSubText() {
        return this.footerSubText;
    }

    public final String getFooterText() {
        return this.footerText;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTheme() {
        return this.theme;
    }

    public final String getThemeVariant() {
        return this.themeVariant;
    }

    public int hashCode() {
        return this.themeVariant.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.footerText.hashCode() * 31, 31, this.footerSubText), 31, this.backgroundImageUrl), 31, this.name), 31, this.theme);
    }

    public String toString() {
        String str = this.footerText;
        String str2 = this.footerSubText;
        String str3 = this.backgroundImageUrl;
        String str4 = this.name;
        String str5 = this.theme;
        String str6 = this.themeVariant;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("WirIntroStep(footerText=", str, ", footerSubText=", str2, ", backgroundImageUrl=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", name=", str4, ", theme=");
        return AbstractC11266d.m30464r(sbM32001t, str5, ", themeVariant=", str6, ")");
    }

    public WirIntroStep(String footerText, String footerSubText, String backgroundImageUrl, String name, String theme, String themeVariant) {
        AbstractC22676k.m65750j(footerText, "footerText");
        AbstractC22676k.m65750j(footerSubText, "footerSubText");
        AbstractC22676k.m65750j(backgroundImageUrl, "backgroundImageUrl");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        this.footerText = footerText;
        this.footerSubText = footerSubText;
        this.backgroundImageUrl = backgroundImageUrl;
        this.name = name;
        this.theme = theme;
        this.themeVariant = themeVariant;
    }
}
