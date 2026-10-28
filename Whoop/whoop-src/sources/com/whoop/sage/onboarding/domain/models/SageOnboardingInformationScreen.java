package com.whoop.sage.onboarding.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import h00.C16497d0;
import j72.EnumC21402g;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!JN\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010!¨\u00067"}, m65681d2 = {"Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInformationScreen;", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;", "", "imageUrl", "supertitle", "title", "subtitle", "nextButtonText", "Lj72/g;", "buttonNextId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj72/g;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj72/g;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sage_release", "(Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInformationScreen;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lj72/g;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj72/g;)Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInformationScreen;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImageUrl", "getSupertitle", "getTitle", "getSubtitle", "getNextButtonText", "Lj72/g;", "getButtonNextId", "Companion", "$serializer", "a", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SageOnboardingInformationScreen implements SageOnboardingContent {
    public static final int $stable = 0;
    private final EnumC21402g buttonNextId;
    private final String imageUrl;
    private final String nextButtonText;
    private final String subtitle;
    private final String supertitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C16497d0(22))};

    /* JADX INFO: renamed from: com.whoop.sage.onboarding.domain.models.SageOnboardingInformationScreen$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInformationScreen$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInformationScreen;", "serializer", "()Lwc3/c;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SageOnboardingInformationScreen$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SageOnboardingInformationScreen(int i13, String str, String str2, String str3, String str4, String str5, EnumC21402g enumC21402g, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, SageOnboardingInformationScreen$$serializer.INSTANCE.getDescriptor());
        }
        this.imageUrl = str;
        this.supertitle = str2;
        this.title = str3;
        this.subtitle = str4;
        this.nextButtonText = str5;
        this.buttonNextId = enumC21402g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.sage.onboarding.presentation.SageOnboardingScreenId", EnumC21402g.values());
    }

    public static /* synthetic */ SageOnboardingInformationScreen copy$default(SageOnboardingInformationScreen sageOnboardingInformationScreen, String str, String str2, String str3, String str4, String str5, EnumC21402g enumC21402g, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sageOnboardingInformationScreen.imageUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = sageOnboardingInformationScreen.supertitle;
        }
        if ((i13 & 4) != 0) {
            str3 = sageOnboardingInformationScreen.title;
        }
        if ((i13 & 8) != 0) {
            str4 = sageOnboardingInformationScreen.subtitle;
        }
        if ((i13 & 16) != 0) {
            str5 = sageOnboardingInformationScreen.nextButtonText;
        }
        if ((i13 & 32) != 0) {
            enumC21402g = sageOnboardingInformationScreen.buttonNextId;
        }
        String str6 = str5;
        EnumC21402g enumC21402g2 = enumC21402g;
        return sageOnboardingInformationScreen.copy(str, str2, str3, str4, str6, enumC21402g2);
    }

    public static final /* synthetic */ void write$Self$sage_release(SageOnboardingInformationScreen self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.imageUrl);
        output.encodeStringElement(serialDesc, 1, self.supertitle);
        output.encodeStringElement(serialDesc, 2, self.title);
        output.encodeStringElement(serialDesc, 3, self.subtitle);
        output.encodeStringElement(serialDesc, 4, self.nextButtonText);
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.buttonNextId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSupertitle() {
        return this.supertitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNextButtonText() {
        return this.nextButtonText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final EnumC21402g getButtonNextId() {
        return this.buttonNextId;
    }

    public final SageOnboardingInformationScreen copy(String imageUrl, String supertitle, String title, String subtitle, String nextButtonText, EnumC21402g buttonNextId) {
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(supertitle, "supertitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(nextButtonText, "nextButtonText");
        return new SageOnboardingInformationScreen(imageUrl, supertitle, title, subtitle, nextButtonText, buttonNextId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SageOnboardingInformationScreen)) {
            return false;
        }
        SageOnboardingInformationScreen sageOnboardingInformationScreen = (SageOnboardingInformationScreen) other;
        return AbstractC22676k.m65745e(this.imageUrl, sageOnboardingInformationScreen.imageUrl) && AbstractC22676k.m65745e(this.supertitle, sageOnboardingInformationScreen.supertitle) && AbstractC22676k.m65745e(this.title, sageOnboardingInformationScreen.title) && AbstractC22676k.m65745e(this.subtitle, sageOnboardingInformationScreen.subtitle) && AbstractC22676k.m65745e(this.nextButtonText, sageOnboardingInformationScreen.nextButtonText) && this.buttonNextId == sageOnboardingInformationScreen.buttonNextId;
    }

    public final EnumC21402g getButtonNextId() {
        return this.buttonNextId;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getNextButtonText() {
        return this.nextButtonText;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getSupertitle() {
        return this.supertitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.imageUrl.hashCode() * 31, 31, this.supertitle), 31, this.title), 31, this.subtitle), 31, this.nextButtonText);
        EnumC21402g enumC21402g = this.buttonNextId;
        return iM30450d + (enumC21402g == null ? 0 : enumC21402g.hashCode());
    }

    public String toString() {
        String str = this.imageUrl;
        String str2 = this.supertitle;
        String str3 = this.title;
        String str4 = this.subtitle;
        String str5 = this.nextButtonText;
        EnumC21402g enumC21402g = this.buttonNextId;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SageOnboardingInformationScreen(imageUrl=", str, ", supertitle=", str2, ", title=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", subtitle=", str4, ", nextButtonText=");
        sbM32001t.append(str5);
        sbM32001t.append(", buttonNextId=");
        sbM32001t.append(enumC21402g);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public SageOnboardingInformationScreen(String imageUrl, String supertitle, String title, String subtitle, String nextButtonText, EnumC21402g enumC21402g) {
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(supertitle, "supertitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(nextButtonText, "nextButtonText");
        this.imageUrl = imageUrl;
        this.supertitle = supertitle;
        this.title = title;
        this.subtitle = subtitle;
        this.nextButtonText = nextButtonText;
        this.buttonNextId = enumC21402g;
    }
}
