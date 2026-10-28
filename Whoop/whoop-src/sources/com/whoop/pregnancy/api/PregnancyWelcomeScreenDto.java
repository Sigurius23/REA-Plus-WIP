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
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0018R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b-\u0010\u0018¨\u00061"}, m65681d2 = {"Lcom/whoop/pregnancy/api/PregnancyWelcomeScreenDto;", "", "", "title", "description", "button", "backgroundImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$pregnancy_release", "(Lcom/whoop/pregnancy/api/PregnancyWelcomeScreenDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/pregnancy/api/PregnancyWelcomeScreenDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getDescription", "getDescription$annotations", "getButton", "getButton$annotations", "getBackgroundImageUrl", "Companion", "$serializer", "a", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PregnancyWelcomeScreenDto {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String backgroundImageUrl;
    private final String button;
    private final String description;
    private final String title;

    /* JADX INFO: renamed from: com.whoop.pregnancy.api.PregnancyWelcomeScreenDto$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/pregnancy/api/PregnancyWelcomeScreenDto$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/pregnancy/api/PregnancyWelcomeScreenDto;", "serializer", "()Lwc3/c;", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PregnancyWelcomeScreenDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PregnancyWelcomeScreenDto(int i13, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, PregnancyWelcomeScreenDto$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.description = str2;
        this.button = str3;
        this.backgroundImageUrl = str4;
    }

    public static /* synthetic */ PregnancyWelcomeScreenDto copy$default(PregnancyWelcomeScreenDto pregnancyWelcomeScreenDto, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = pregnancyWelcomeScreenDto.title;
        }
        if ((i13 & 2) != 0) {
            str2 = pregnancyWelcomeScreenDto.description;
        }
        if ((i13 & 4) != 0) {
            str3 = pregnancyWelcomeScreenDto.button;
        }
        if ((i13 & 8) != 0) {
            str4 = pregnancyWelcomeScreenDto.backgroundImageUrl;
        }
        return pregnancyWelcomeScreenDto.copy(str, str2, str3, str4);
    }

    @InterfaceC37143h("button_display")
    public static /* synthetic */ void getButton$annotations() {
    }

    @InterfaceC37143h("description_display")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @InterfaceC37143h("title_display")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$pregnancy_release(PregnancyWelcomeScreenDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.description);
        output.encodeStringElement(serialDesc, 2, self.button);
        output.encodeStringElement(serialDesc, 3, self.backgroundImageUrl);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final PregnancyWelcomeScreenDto copy(String title, String description, String button, String backgroundImageUrl) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(button, "button");
        AbstractC22676k.m65750j(backgroundImageUrl, "backgroundImageUrl");
        return new PregnancyWelcomeScreenDto(title, description, button, backgroundImageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PregnancyWelcomeScreenDto)) {
            return false;
        }
        PregnancyWelcomeScreenDto pregnancyWelcomeScreenDto = (PregnancyWelcomeScreenDto) other;
        return AbstractC22676k.m65745e(this.title, pregnancyWelcomeScreenDto.title) && AbstractC22676k.m65745e(this.description, pregnancyWelcomeScreenDto.description) && AbstractC22676k.m65745e(this.button, pregnancyWelcomeScreenDto.button) && AbstractC22676k.m65745e(this.backgroundImageUrl, pregnancyWelcomeScreenDto.backgroundImageUrl);
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final String getButton() {
        return this.button;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.backgroundImageUrl.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.description), 31, this.button);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("PregnancyWelcomeScreenDto(title=", str, ", description=", str2, ", button="), this.button, ", backgroundImageUrl=", this.backgroundImageUrl, ")");
    }

    public PregnancyWelcomeScreenDto(String title, String description, String button, String backgroundImageUrl) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(button, "button");
        AbstractC22676k.m65750j(backgroundImageUrl, "backgroundImageUrl");
        this.title = title;
        this.description = description;
        this.button = button;
        this.backgroundImageUrl = backgroundImageUrl;
    }
}
