package com.whoop.user.journey.model.yearinreview;

import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CardButtonModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.user.journey.model.UserJourneyStep;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBa\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJX\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b4\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b5\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b6\u0010\u001c¨\u00069"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/ShareableStep;", "Lcom/whoop/user/journey/model/UserJourneyStep;", "", "shareableCardUrl", "shareButtonText", "Lcom/whoop/design/models/items/CardButtonModel;", "secondaryButton", "shareMessage", "name", "theme", "themeVariant", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/yearinreview/ShareableStep;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/items/CardButtonModel;", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/yearinreview/ShareableStep;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getShareableCardUrl", "getShareButtonText", "Lcom/whoop/design/models/items/CardButtonModel;", "getSecondaryButton", "getShareMessage", "getName", "getTheme", "getThemeVariant", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShareableStep implements UserJourneyStep {
    private final String name;
    private final CardButtonModel secondaryButton;
    private final String shareButtonText;
    private final String shareMessage;
    private final String shareableCardUrl;
    private final String theme;
    private final String themeVariant;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = CardButtonModel.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/ShareableStep$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/yearinreview/ShareableStep;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShareableStep$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ShareableStep(int i13, String str, String str2, CardButtonModel cardButtonModel, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, ShareableStep$$serializer.INSTANCE.getDescriptor());
        }
        this.shareableCardUrl = str;
        this.shareButtonText = str2;
        this.secondaryButton = cardButtonModel;
        this.shareMessage = str3;
        this.name = str4;
        this.theme = str5;
        this.themeVariant = str6;
    }

    public static /* synthetic */ ShareableStep copy$default(ShareableStep shareableStep, String str, String str2, CardButtonModel cardButtonModel, String str3, String str4, String str5, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shareableStep.shareableCardUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = shareableStep.shareButtonText;
        }
        if ((i13 & 4) != 0) {
            cardButtonModel = shareableStep.secondaryButton;
        }
        if ((i13 & 8) != 0) {
            str3 = shareableStep.shareMessage;
        }
        if ((i13 & 16) != 0) {
            str4 = shareableStep.name;
        }
        if ((i13 & 32) != 0) {
            str5 = shareableStep.theme;
        }
        if ((i13 & 64) != 0) {
            str6 = shareableStep.themeVariant;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        CardButtonModel cardButtonModel2 = cardButtonModel;
        return shareableStep.copy(str, str2, cardButtonModel2, str3, str9, str7, str8);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(ShareableStep self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.shareableCardUrl);
        output.encodeStringElement(serialDesc, 1, self.shareButtonText);
        output.encodeNullableSerializableElement(serialDesc, 2, CardButtonModel$$serializer.INSTANCE, self.secondaryButton);
        output.encodeStringElement(serialDesc, 3, self.shareMessage);
        output.encodeStringElement(serialDesc, 4, self.name);
        output.encodeStringElement(serialDesc, 5, self.theme);
        output.encodeStringElement(serialDesc, 6, self.themeVariant);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getShareableCardUrl() {
        return this.shareableCardUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getShareButtonText() {
        return this.shareButtonText;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CardButtonModel getSecondaryButton() {
        return this.secondaryButton;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getShareMessage() {
        return this.shareMessage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getThemeVariant() {
        return this.themeVariant;
    }

    public final ShareableStep copy(String shareableCardUrl, String shareButtonText, CardButtonModel secondaryButton, String shareMessage, String name, String theme, String themeVariant) {
        AbstractC22676k.m65750j(shareableCardUrl, "shareableCardUrl");
        AbstractC22676k.m65750j(shareButtonText, "shareButtonText");
        AbstractC22676k.m65750j(shareMessage, "shareMessage");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        return new ShareableStep(shareableCardUrl, shareButtonText, secondaryButton, shareMessage, name, theme, themeVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareableStep)) {
            return false;
        }
        ShareableStep shareableStep = (ShareableStep) other;
        return AbstractC22676k.m65745e(this.shareableCardUrl, shareableStep.shareableCardUrl) && AbstractC22676k.m65745e(this.shareButtonText, shareableStep.shareButtonText) && AbstractC22676k.m65745e(this.secondaryButton, shareableStep.secondaryButton) && AbstractC22676k.m65745e(this.shareMessage, shareableStep.shareMessage) && AbstractC22676k.m65745e(this.name, shareableStep.name) && AbstractC22676k.m65745e(this.theme, shareableStep.theme) && AbstractC22676k.m65745e(this.themeVariant, shareableStep.themeVariant);
    }

    public final String getName() {
        return this.name;
    }

    public final CardButtonModel getSecondaryButton() {
        return this.secondaryButton;
    }

    public final String getShareButtonText() {
        return this.shareButtonText;
    }

    public final String getShareMessage() {
        return this.shareMessage;
    }

    public final String getShareableCardUrl() {
        return this.shareableCardUrl;
    }

    public final String getTheme() {
        return this.theme;
    }

    public final String getThemeVariant() {
        return this.themeVariant;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.shareableCardUrl.hashCode() * 31, 31, this.shareButtonText);
        CardButtonModel cardButtonModel = this.secondaryButton;
        return this.themeVariant.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30450d + (cardButtonModel == null ? 0 : cardButtonModel.hashCode())) * 31, 31, this.shareMessage), 31, this.name), 31, this.theme);
    }

    public String toString() {
        String str = this.shareableCardUrl;
        String str2 = this.shareButtonText;
        CardButtonModel cardButtonModel = this.secondaryButton;
        String str3 = this.shareMessage;
        String str4 = this.name;
        String str5 = this.theme;
        String str6 = this.themeVariant;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ShareableStep(shareableCardUrl=", str, ", shareButtonText=", str2, ", secondaryButton=");
        sbM32001t.append(cardButtonModel);
        sbM32001t.append(", shareMessage=");
        sbM32001t.append(str3);
        sbM32001t.append(", name=");
        AbstractC11266d.m30444B(sbM32001t, str4, ", theme=", str5, ", themeVariant=");
        return AbstractC25012a.m73376i(str6, ")", sbM32001t);
    }

    public ShareableStep(String shareableCardUrl, String shareButtonText, CardButtonModel cardButtonModel, String shareMessage, String name, String theme, String themeVariant) {
        AbstractC22676k.m65750j(shareableCardUrl, "shareableCardUrl");
        AbstractC22676k.m65750j(shareButtonText, "shareButtonText");
        AbstractC22676k.m65750j(shareMessage, "shareMessage");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        this.shareableCardUrl = shareableCardUrl;
        this.shareButtonText = shareButtonText;
        this.secondaryButton = cardButtonModel;
        this.shareMessage = shareMessage;
        this.name = name;
        this.theme = theme;
        this.themeVariant = themeVariant;
    }
}
