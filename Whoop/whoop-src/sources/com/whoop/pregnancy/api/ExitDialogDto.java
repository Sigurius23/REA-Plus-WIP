package com.whoop.pregnancy.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?@BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBk\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J`\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013J\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J'\u0010,\u001a\u00020)2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0013R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u0013R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010\u0013R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b5\u00101\u001a\u0004\b4\u0010\u0013R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b7\u00101\u001a\u0004\b6\u0010\u0013R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b9\u00101\u001a\u0004\b8\u0010\u0013R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010-\u0012\u0004\b;\u00101\u001a\u0004\b:\u0010\u0013R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010-\u0012\u0004\b=\u00101\u001a\u0004\b<\u0010\u0013¨\u0006A"}, m65681d2 = {"Lcom/whoop/pregnancy/api/ExitDialogDto;", "", "", "icon", "subtitle", "title", "description", "featuredDescription", "ctaText", "ctaUrl", "dismissText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/pregnancy/api/ExitDialogDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$pregnancy_release", "(Lcom/whoop/pregnancy/api/ExitDialogDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getIcon", "getSubtitle", "getSubtitle$annotations", "()V", "getTitle", "getTitle$annotations", "getDescription", "getDescription$annotations", "getFeaturedDescription", "getFeaturedDescription$annotations", "getCtaText", "getCtaText$annotations", "getCtaUrl", "getCtaUrl$annotations", "getDismissText", "getDismissText$annotations", "Companion", "$serializer", "a", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ExitDialogDto {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String ctaText;
    private final String ctaUrl;
    private final String description;
    private final String dismissText;
    private final String featuredDescription;
    private final String icon;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: com.whoop.pregnancy.api.ExitDialogDto$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/pregnancy/api/ExitDialogDto$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/pregnancy/api/ExitDialogDto;", "serializer", "()Lwc3/c;", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ExitDialogDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ExitDialogDto(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, ExitDialogDto$$serializer.INSTANCE.getDescriptor());
        }
        this.icon = str;
        this.subtitle = str2;
        this.title = str3;
        this.description = str4;
        this.featuredDescription = str5;
        this.ctaText = str6;
        this.ctaUrl = str7;
        this.dismissText = str8;
    }

    public static /* synthetic */ ExitDialogDto copy$default(ExitDialogDto exitDialogDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = exitDialogDto.icon;
        }
        if ((i13 & 2) != 0) {
            str2 = exitDialogDto.subtitle;
        }
        if ((i13 & 4) != 0) {
            str3 = exitDialogDto.title;
        }
        if ((i13 & 8) != 0) {
            str4 = exitDialogDto.description;
        }
        if ((i13 & 16) != 0) {
            str5 = exitDialogDto.featuredDescription;
        }
        if ((i13 & 32) != 0) {
            str6 = exitDialogDto.ctaText;
        }
        if ((i13 & 64) != 0) {
            str7 = exitDialogDto.ctaUrl;
        }
        if ((i13 & 128) != 0) {
            str8 = exitDialogDto.dismissText;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return exitDialogDto.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    @InterfaceC37143h("cta_button_display")
    public static /* synthetic */ void getCtaText$annotations() {
    }

    @InterfaceC37143h("cta_button_url")
    public static /* synthetic */ void getCtaUrl$annotations() {
    }

    @InterfaceC37143h("description_display")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @InterfaceC37143h("dismiss_button_display")
    public static /* synthetic */ void getDismissText$annotations() {
    }

    @InterfaceC37143h("featured_description_display")
    public static /* synthetic */ void getFeaturedDescription$annotations() {
    }

    @InterfaceC37143h("subtitle_display")
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @InterfaceC37143h("title_display")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$pregnancy_release(ExitDialogDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.icon);
        output.encodeStringElement(serialDesc, 1, self.subtitle);
        output.encodeStringElement(serialDesc, 2, self.title);
        output.encodeStringElement(serialDesc, 3, self.description);
        output.encodeStringElement(serialDesc, 4, self.featuredDescription);
        output.encodeStringElement(serialDesc, 5, self.ctaText);
        output.encodeStringElement(serialDesc, 6, self.ctaUrl);
        output.encodeStringElement(serialDesc, 7, self.dismissText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFeaturedDescription() {
        return this.featuredDescription;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCtaUrl() {
        return this.ctaUrl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDismissText() {
        return this.dismissText;
    }

    public final ExitDialogDto copy(String icon, String subtitle, String title, String description, String featuredDescription, String ctaText, String ctaUrl, String dismissText) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(featuredDescription, "featuredDescription");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(ctaUrl, "ctaUrl");
        AbstractC22676k.m65750j(dismissText, "dismissText");
        return new ExitDialogDto(icon, subtitle, title, description, featuredDescription, ctaText, ctaUrl, dismissText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExitDialogDto)) {
            return false;
        }
        ExitDialogDto exitDialogDto = (ExitDialogDto) other;
        return AbstractC22676k.m65745e(this.icon, exitDialogDto.icon) && AbstractC22676k.m65745e(this.subtitle, exitDialogDto.subtitle) && AbstractC22676k.m65745e(this.title, exitDialogDto.title) && AbstractC22676k.m65745e(this.description, exitDialogDto.description) && AbstractC22676k.m65745e(this.featuredDescription, exitDialogDto.featuredDescription) && AbstractC22676k.m65745e(this.ctaText, exitDialogDto.ctaText) && AbstractC22676k.m65745e(this.ctaUrl, exitDialogDto.ctaUrl) && AbstractC22676k.m65745e(this.dismissText, exitDialogDto.dismissText);
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final String getCtaUrl() {
        return this.ctaUrl;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDismissText() {
        return this.dismissText;
    }

    public final String getFeaturedDescription() {
        return this.featuredDescription;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.dismissText.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.icon.hashCode() * 31, 31, this.subtitle), 31, this.title), 31, this.description), 31, this.featuredDescription), 31, this.ctaText), 31, this.ctaUrl);
    }

    public String toString() {
        String str = this.icon;
        String str2 = this.subtitle;
        String str3 = this.title;
        String str4 = this.description;
        String str5 = this.featuredDescription;
        String str6 = this.ctaText;
        String str7 = this.ctaUrl;
        String str8 = this.dismissText;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ExitDialogDto(icon=", str, ", subtitle=", str2, ", title=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", description=", str4, ", featuredDescription=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", ctaText=", str6, ", ctaUrl=");
        return AbstractC11266d.m30464r(sbM32001t, str7, ", dismissText=", str8, ")");
    }

    public ExitDialogDto(String icon, String subtitle, String title, String description, String featuredDescription, String ctaText, String ctaUrl, String dismissText) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(featuredDescription, "featuredDescription");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(ctaUrl, "ctaUrl");
        AbstractC22676k.m65750j(dismissText, "dismissText");
        this.icon = icon;
        this.subtitle = subtitle;
        this.title = title;
        this.description = description;
        this.featuredDescription = featuredDescription;
        this.ctaText = ctaText;
        this.ctaUrl = ctaUrl;
        this.dismissText = dismissText;
    }
}
