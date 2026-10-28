package com.whoop.onboarding.overlay.model;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import md1.C25452a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 32\u00020\u0001:\u000243BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJP\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b1\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b2\u0010\u001f¨\u00065"}, m65681d2 = {"Lcom/whoop/onboarding/overlay/model/OnboardingStep;", "", "Lcom/whoop/design/util/TextResource;", "header", "body", "buttonText", "", "imageUrl", "secondaryButtonText", "overlayStyle", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$onboarding_story_release", "(Lcom/whoop/onboarding/overlay/model/OnboardingStep;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "component4", "()Ljava/lang/String;", "component5", "component6", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/onboarding/overlay/model/OnboardingStep;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getHeader", "getBody", "getButtonText", "Ljava/lang/String;", "getImageUrl", "getSecondaryButtonText", "getOverlayStyle", "Companion", "$serializer", "onboarding-story_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class OnboardingStep {
    private final TextResource body;
    private final TextResource buttonText;
    private final TextResource header;
    private final String imageUrl;
    private final String overlayStyle;
    private final String secondaryButtonText;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/onboarding/overlay/model/OnboardingStep$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/onboarding/overlay/model/OnboardingStep;", "serializer", "()Lwc3/c;", "onboarding-story_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return OnboardingStep$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public OnboardingStep() {
        this((TextResource) null, (TextResource) null, (TextResource) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ OnboardingStep copy$default(OnboardingStep onboardingStep, TextResource textResource, TextResource textResource2, TextResource textResource3, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = onboardingStep.header;
        }
        if ((i13 & 2) != 0) {
            textResource2 = onboardingStep.body;
        }
        if ((i13 & 4) != 0) {
            textResource3 = onboardingStep.buttonText;
        }
        if ((i13 & 8) != 0) {
            str = onboardingStep.imageUrl;
        }
        if ((i13 & 16) != 0) {
            str2 = onboardingStep.secondaryButtonText;
        }
        if ((i13 & 32) != 0) {
            str3 = onboardingStep.overlayStyle;
        }
        String str4 = str2;
        String str5 = str3;
        return onboardingStep.copy(textResource, textResource2, textResource3, str, str4, str5);
    }

    public static final /* synthetic */ void write$Self$onboarding_story_release(OnboardingStep self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.header, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.header);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.body, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 1, C25452a.f99689a, self.body);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.buttonText, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 2, C25452a.f99689a, self.buttonText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.imageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.imageUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.secondaryButtonText != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.secondaryButtonText);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && AbstractC22676k.m65745e(self.overlayStyle, "TOP")) {
            return;
        }
        output.encodeStringElement(serialDesc, 5, self.overlayStyle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOverlayStyle() {
        return this.overlayStyle;
    }

    public final OnboardingStep copy(TextResource header, TextResource body, TextResource buttonText, String imageUrl, String secondaryButtonText, String overlayStyle) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        AbstractC22676k.m65750j(overlayStyle, "overlayStyle");
        return new OnboardingStep(header, body, buttonText, imageUrl, secondaryButtonText, overlayStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingStep)) {
            return false;
        }
        OnboardingStep onboardingStep = (OnboardingStep) other;
        return AbstractC22676k.m65745e(this.header, onboardingStep.header) && AbstractC22676k.m65745e(this.body, onboardingStep.body) && AbstractC22676k.m65745e(this.buttonText, onboardingStep.buttonText) && AbstractC22676k.m65745e(this.imageUrl, onboardingStep.imageUrl) && AbstractC22676k.m65745e(this.secondaryButtonText, onboardingStep.secondaryButtonText) && AbstractC22676k.m65745e(this.overlayStyle, onboardingStep.overlayStyle);
    }

    public final TextResource getBody() {
        return this.body;
    }

    public final TextResource getButtonText() {
        return this.buttonText;
    }

    public final TextResource getHeader() {
        return this.header;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getOverlayStyle() {
        return this.overlayStyle;
    }

    public final String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.header.hashCode() * 31, this.body, 31), this.buttonText, 31);
        String str = this.imageUrl;
        int iHashCode = (iM95625a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.secondaryButtonText;
        return this.overlayStyle.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        TextResource textResource = this.header;
        TextResource textResource2 = this.body;
        TextResource textResource3 = this.buttonText;
        String str = this.imageUrl;
        String str2 = this.secondaryButtonText;
        String str3 = this.overlayStyle;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("OnboardingStep(header=", textResource, ", body=", textResource2, ", buttonText=");
        AbstractC30007c.m91856z(sbM106658q, textResource3, ", imageUrl=", str, ", secondaryButtonText=");
        return AbstractC11266d.m30464r(sbM106658q, str2, ", overlayStyle=", str3, ")");
    }

    public /* synthetic */ OnboardingStep(int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.header = (i13 & 1) == 0 ? AbstractC8693b.m21267a() : textResource;
        if ((i13 & 2) == 0) {
            this.body = AbstractC8693b.m21267a();
        } else {
            this.body = textResource2;
        }
        if ((i13 & 4) == 0) {
            this.buttonText = AbstractC8693b.m21267a();
        } else {
            this.buttonText = textResource3;
        }
        if ((i13 & 8) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str;
        }
        if ((i13 & 16) == 0) {
            this.secondaryButtonText = null;
        } else {
            this.secondaryButtonText = str2;
        }
        if ((i13 & 32) == 0) {
            this.overlayStyle = "TOP";
        } else {
            this.overlayStyle = str3;
        }
    }

    public OnboardingStep(TextResource header, TextResource body, TextResource buttonText, String str, String str2, String overlayStyle) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        AbstractC22676k.m65750j(overlayStyle, "overlayStyle");
        this.header = header;
        this.body = body;
        this.buttonText = buttonText;
        this.imageUrl = str;
        this.secondaryButtonText = str2;
        this.overlayStyle = overlayStyle;
    }

    public /* synthetic */ OnboardingStep(TextResource textResource, TextResource textResource2, TextResource textResource3, String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? "TOP" : str3);
    }
}
