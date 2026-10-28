package com.whoop.shepherd.feature.welcome.domain.models;

import com.google.gson.annotations.SerializedName;
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
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001eR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010)\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010\u001a¨\u00065"}, m65681d2 = {"Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeScreenResponse;", "", "", "icon", "title", "description", "Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeButtonResponse;", "button", "backgroundImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeButtonResponse;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeButtonResponse;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$shepherd_release", "(Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeScreenResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeButtonResponse;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeButtonResponse;Ljava/lang/String;)Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeScreenResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getTitle", "getDescription", "Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeButtonResponse;", "getButton", "getButton$annotations", "()V", "getBackgroundImage", "getBackgroundImage$annotations", "Companion", "$serializer", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShepherdWelcomeScreenResponse {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("image_url")
    private final String backgroundImage;

    @SerializedName("welcome_button")
    private final ShepherdWelcomeButtonResponse button;

    @SerializedName("description")
    private final String description;

    @SerializedName("icon")
    private final String icon;

    @SerializedName("title")
    private final String title;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeScreenResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeScreenResponse;", "serializer", "()Lwc3/c;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShepherdWelcomeScreenResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ShepherdWelcomeScreenResponse(int i13, String str, String str2, String str3, ShepherdWelcomeButtonResponse shepherdWelcomeButtonResponse, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, ShepherdWelcomeScreenResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.icon = str;
        this.title = str2;
        this.description = str3;
        this.button = shepherdWelcomeButtonResponse;
        this.backgroundImage = str4;
    }

    public static /* synthetic */ ShepherdWelcomeScreenResponse copy$default(ShepherdWelcomeScreenResponse shepherdWelcomeScreenResponse, String str, String str2, String str3, ShepherdWelcomeButtonResponse shepherdWelcomeButtonResponse, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shepherdWelcomeScreenResponse.icon;
        }
        if ((i13 & 2) != 0) {
            str2 = shepherdWelcomeScreenResponse.title;
        }
        if ((i13 & 4) != 0) {
            str3 = shepherdWelcomeScreenResponse.description;
        }
        if ((i13 & 8) != 0) {
            shepherdWelcomeButtonResponse = shepherdWelcomeScreenResponse.button;
        }
        if ((i13 & 16) != 0) {
            str4 = shepherdWelcomeScreenResponse.backgroundImage;
        }
        String str5 = str4;
        String str6 = str3;
        return shepherdWelcomeScreenResponse.copy(str, str2, str6, shepherdWelcomeButtonResponse, str5);
    }

    @InterfaceC37143h("image_url")
    public static /* synthetic */ void getBackgroundImage$annotations() {
    }

    @InterfaceC37143h("welcome_button")
    public static /* synthetic */ void getButton$annotations() {
    }

    public static final /* synthetic */ void write$Self$shepherd_release(ShepherdWelcomeScreenResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.icon);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.description);
        output.encodeSerializableElement(serialDesc, 3, ShepherdWelcomeButtonResponse$$serializer.INSTANCE, self.button);
        output.encodeStringElement(serialDesc, 4, self.backgroundImage);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ShepherdWelcomeButtonResponse getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final ShepherdWelcomeScreenResponse copy(String icon, String title, String description, ShepherdWelcomeButtonResponse button, String backgroundImage) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(button, "button");
        AbstractC22676k.m65750j(backgroundImage, "backgroundImage");
        return new ShepherdWelcomeScreenResponse(icon, title, description, button, backgroundImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShepherdWelcomeScreenResponse)) {
            return false;
        }
        ShepherdWelcomeScreenResponse shepherdWelcomeScreenResponse = (ShepherdWelcomeScreenResponse) other;
        return AbstractC22676k.m65745e(this.icon, shepherdWelcomeScreenResponse.icon) && AbstractC22676k.m65745e(this.title, shepherdWelcomeScreenResponse.title) && AbstractC22676k.m65745e(this.description, shepherdWelcomeScreenResponse.description) && AbstractC22676k.m65745e(this.button, shepherdWelcomeScreenResponse.button) && AbstractC22676k.m65745e(this.backgroundImage, shepherdWelcomeScreenResponse.backgroundImage);
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final ShepherdWelcomeButtonResponse getButton() {
        return this.button;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.backgroundImage.hashCode() + ((this.button.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.icon.hashCode() * 31, 31, this.title), 31, this.description)) * 31);
    }

    public String toString() {
        String str = this.icon;
        String str2 = this.title;
        String str3 = this.description;
        ShepherdWelcomeButtonResponse shepherdWelcomeButtonResponse = this.button;
        String str4 = this.backgroundImage;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ShepherdWelcomeScreenResponse(icon=", str, ", title=", str2, ", description=");
        sbM32001t.append(str3);
        sbM32001t.append(", button=");
        sbM32001t.append(shepherdWelcomeButtonResponse);
        sbM32001t.append(", backgroundImage=");
        return AbstractC25012a.m73376i(str4, ")", sbM32001t);
    }

    public ShepherdWelcomeScreenResponse(String icon, String title, String description, ShepherdWelcomeButtonResponse button, String backgroundImage) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(button, "button");
        AbstractC22676k.m65750j(backgroundImage, "backgroundImage");
        this.icon = icon;
        this.title = title;
        this.description = description;
        this.button = button;
        this.backgroundImage = backgroundImage;
    }
}
