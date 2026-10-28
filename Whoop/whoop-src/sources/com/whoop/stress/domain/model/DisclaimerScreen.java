package com.whoop.stress.domain.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
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

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJL\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b0\u0010,\u001a\u0004\b/\u0010\u001aR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b2\u0010,\u001a\u0004\b1\u0010\u001aR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b4\u0010,\u001a\u0004\b3\u0010\u001aR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010)\u0012\u0004\b6\u0010,\u001a\u0004\b5\u0010\u001a¨\u0006:"}, m65681d2 = {"Lcom/whoop/stress/domain/model/DisclaimerScreen;", "", "", "navigationTitle", "imageUrl", "title", "alert", "description", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$stress_release", "(Lcom/whoop/stress/domain/model/DisclaimerScreen;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/stress/domain/model/DisclaimerScreen;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNavigationTitle", "getNavigationTitle$annotations", "()V", "getImageUrl", "getImageUrl$annotations", "getTitle", "getTitle$annotations", "getAlert", "getAlert$annotations", "getDescription", "getDescription$annotations", "getButton", "getButton$annotations", "Companion", "$serializer", "a", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DisclaimerScreen {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("alert_display")
    private final String alert;

    @SerializedName("button_display")
    private final String button;

    @SerializedName("description_display")
    private final String description;

    @SerializedName("image_url")
    private final String imageUrl;

    @SerializedName("navigation_title_display")
    private final String navigationTitle;

    @SerializedName("title_display")
    private final String title;

    /* JADX INFO: renamed from: com.whoop.stress.domain.model.DisclaimerScreen$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/stress/domain/model/DisclaimerScreen$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/stress/domain/model/DisclaimerScreen;", "serializer", "()Lwc3/c;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DisclaimerScreen$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DisclaimerScreen(int i13, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, DisclaimerScreen$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationTitle = str;
        this.imageUrl = str2;
        this.title = str3;
        this.alert = str4;
        this.description = str5;
        this.button = str6;
    }

    public static /* synthetic */ DisclaimerScreen copy$default(DisclaimerScreen disclaimerScreen, String str, String str2, String str3, String str4, String str5, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = disclaimerScreen.navigationTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = disclaimerScreen.imageUrl;
        }
        if ((i13 & 4) != 0) {
            str3 = disclaimerScreen.title;
        }
        if ((i13 & 8) != 0) {
            str4 = disclaimerScreen.alert;
        }
        if ((i13 & 16) != 0) {
            str5 = disclaimerScreen.description;
        }
        if ((i13 & 32) != 0) {
            str6 = disclaimerScreen.button;
        }
        String str7 = str5;
        String str8 = str6;
        return disclaimerScreen.copy(str, str2, str3, str4, str7, str8);
    }

    @InterfaceC37143h("alert_display")
    public static /* synthetic */ void getAlert$annotations() {
    }

    @InterfaceC37143h("button_display")
    public static /* synthetic */ void getButton$annotations() {
    }

    @InterfaceC37143h("description_display")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @InterfaceC37143h("image_url")
    public static /* synthetic */ void getImageUrl$annotations() {
    }

    @InterfaceC37143h("navigation_title_display")
    public static /* synthetic */ void getNavigationTitle$annotations() {
    }

    @InterfaceC37143h("title_display")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$stress_release(DisclaimerScreen self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.navigationTitle);
        output.encodeStringElement(serialDesc, 1, self.imageUrl);
        output.encodeStringElement(serialDesc, 2, self.title);
        output.encodeStringElement(serialDesc, 3, self.alert);
        output.encodeStringElement(serialDesc, 4, self.description);
        output.encodeStringElement(serialDesc, 5, self.button);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAlert() {
        return this.alert;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getButton() {
        return this.button;
    }

    public final DisclaimerScreen copy(String navigationTitle, String imageUrl, String title, String alert, String description, String button) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(alert, "alert");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(button, "button");
        return new DisclaimerScreen(navigationTitle, imageUrl, title, alert, description, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclaimerScreen)) {
            return false;
        }
        DisclaimerScreen disclaimerScreen = (DisclaimerScreen) other;
        return AbstractC22676k.m65745e(this.navigationTitle, disclaimerScreen.navigationTitle) && AbstractC22676k.m65745e(this.imageUrl, disclaimerScreen.imageUrl) && AbstractC22676k.m65745e(this.title, disclaimerScreen.title) && AbstractC22676k.m65745e(this.alert, disclaimerScreen.alert) && AbstractC22676k.m65745e(this.description, disclaimerScreen.description) && AbstractC22676k.m65745e(this.button, disclaimerScreen.button);
    }

    public final String getAlert() {
        return this.alert;
    }

    public final String getButton() {
        return this.button;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.button.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.navigationTitle.hashCode() * 31, 31, this.imageUrl), 31, this.title), 31, this.alert), 31, this.description);
    }

    public String toString() {
        String str = this.navigationTitle;
        String str2 = this.imageUrl;
        String str3 = this.title;
        String str4 = this.alert;
        String str5 = this.description;
        String str6 = this.button;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DisclaimerScreen(navigationTitle=", str, ", imageUrl=", str2, ", title=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", alert=", str4, ", description=");
        return AbstractC11266d.m30464r(sbM32001t, str5, ", button=", str6, ")");
    }

    public DisclaimerScreen(String navigationTitle, String imageUrl, String title, String alert, String description, String button) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(alert, "alert");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(button, "button");
        this.navigationTitle = navigationTitle;
        this.imageUrl = imageUrl;
        this.title = title;
        this.alert = alert;
        this.description = description;
        this.button = button;
    }
}
