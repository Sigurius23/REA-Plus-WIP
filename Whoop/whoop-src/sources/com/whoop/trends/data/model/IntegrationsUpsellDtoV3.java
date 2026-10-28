package com.whoop.trends.data.model;

import com.google.gson.annotations.SerializedName;
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
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJF\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b0\u0010,\u001a\u0004\b/\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00101\u0012\u0004\b3\u0010,\u001a\u0004\b2\u0010\u001eR\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b5\u0010,\u001a\u0004\b4\u0010\u001e¨\u00068"}, m65681d2 = {"Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;", "", "", "image", "title", "subtitle", "Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;", "primaryButton", "secondaryButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$trends_release", "(Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;)Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "getImage$annotations", "()V", "getTitle", "getTitle$annotations", "getSubtitle", "getSubtitle$annotations", "Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;", "getPrimaryButton", "getPrimaryButton$annotations", "getSecondaryButton", "getSecondaryButton$annotations", "Companion", "$serializer", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class IntegrationsUpsellDtoV3 {

    @SerializedName("image")
    private final String image;

    @SerializedName("primary_button")
    private final IntegrationsUpsellButtonDtoV3 primaryButton;

    @SerializedName("secondary_button")
    private final IntegrationsUpsellButtonDtoV3 secondaryButton;

    @SerializedName("subtitle")
    private final String subtitle;

    @SerializedName("title")
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;", "serializer", "()Lwc3/c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return IntegrationsUpsellDtoV3$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ IntegrationsUpsellDtoV3(int i13, String str, String str2, String str3, IntegrationsUpsellButtonDtoV3 integrationsUpsellButtonDtoV3, IntegrationsUpsellButtonDtoV3 integrationsUpsellButtonDtoV4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, IntegrationsUpsellDtoV3$$serializer.INSTANCE.getDescriptor());
        }
        this.image = str;
        this.title = str2;
        this.subtitle = str3;
        this.primaryButton = integrationsUpsellButtonDtoV3;
        this.secondaryButton = integrationsUpsellButtonDtoV4;
    }

    public static /* synthetic */ IntegrationsUpsellDtoV3 copy$default(IntegrationsUpsellDtoV3 integrationsUpsellDtoV3, String str, String str2, String str3, IntegrationsUpsellButtonDtoV3 integrationsUpsellButtonDtoV3, IntegrationsUpsellButtonDtoV3 integrationsUpsellButtonDtoV4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = integrationsUpsellDtoV3.image;
        }
        if ((i13 & 2) != 0) {
            str2 = integrationsUpsellDtoV3.title;
        }
        if ((i13 & 4) != 0) {
            str3 = integrationsUpsellDtoV3.subtitle;
        }
        if ((i13 & 8) != 0) {
            integrationsUpsellButtonDtoV3 = integrationsUpsellDtoV3.primaryButton;
        }
        if ((i13 & 16) != 0) {
            integrationsUpsellButtonDtoV4 = integrationsUpsellDtoV3.secondaryButton;
        }
        IntegrationsUpsellButtonDtoV3 integrationsUpsellButtonDtoV5 = integrationsUpsellButtonDtoV4;
        String str4 = str3;
        return integrationsUpsellDtoV3.copy(str, str2, str4, integrationsUpsellButtonDtoV3, integrationsUpsellButtonDtoV5);
    }

    @InterfaceC37143h("image")
    public static /* synthetic */ void getImage$annotations() {
    }

    @InterfaceC37143h("primary_button")
    public static /* synthetic */ void getPrimaryButton$annotations() {
    }

    @InterfaceC37143h("secondary_button")
    public static /* synthetic */ void getSecondaryButton$annotations() {
    }

    @InterfaceC37143h("subtitle")
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @InterfaceC37143h("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$trends_release(IntegrationsUpsellDtoV3 self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.image);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.subtitle);
        IntegrationsUpsellButtonDtoV3$$serializer integrationsUpsellButtonDtoV3$$serializer = IntegrationsUpsellButtonDtoV3$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 3, integrationsUpsellButtonDtoV3$$serializer, self.primaryButton);
        output.encodeNullableSerializableElement(serialDesc, 4, integrationsUpsellButtonDtoV3$$serializer, self.secondaryButton);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final IntegrationsUpsellButtonDtoV3 getPrimaryButton() {
        return this.primaryButton;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final IntegrationsUpsellButtonDtoV3 getSecondaryButton() {
        return this.secondaryButton;
    }

    public final IntegrationsUpsellDtoV3 copy(String image, String title, String subtitle, IntegrationsUpsellButtonDtoV3 primaryButton, IntegrationsUpsellButtonDtoV3 secondaryButton) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        return new IntegrationsUpsellDtoV3(image, title, subtitle, primaryButton, secondaryButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntegrationsUpsellDtoV3)) {
            return false;
        }
        IntegrationsUpsellDtoV3 integrationsUpsellDtoV3 = (IntegrationsUpsellDtoV3) other;
        return AbstractC22676k.m65745e(this.image, integrationsUpsellDtoV3.image) && AbstractC22676k.m65745e(this.title, integrationsUpsellDtoV3.title) && AbstractC22676k.m65745e(this.subtitle, integrationsUpsellDtoV3.subtitle) && AbstractC22676k.m65745e(this.primaryButton, integrationsUpsellDtoV3.primaryButton) && AbstractC22676k.m65745e(this.secondaryButton, integrationsUpsellDtoV3.secondaryButton);
    }

    public final String getImage() {
        return this.image;
    }

    public final IntegrationsUpsellButtonDtoV3 getPrimaryButton() {
        return this.primaryButton;
    }

    public final IntegrationsUpsellButtonDtoV3 getSecondaryButton() {
        return this.secondaryButton;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.image.hashCode() * 31, 31, this.title), 31, this.subtitle);
        IntegrationsUpsellButtonDtoV3 integrationsUpsellButtonDtoV3 = this.primaryButton;
        int iHashCode = (iM30450d + (integrationsUpsellButtonDtoV3 == null ? 0 : integrationsUpsellButtonDtoV3.hashCode())) * 31;
        IntegrationsUpsellButtonDtoV3 integrationsUpsellButtonDtoV4 = this.secondaryButton;
        return iHashCode + (integrationsUpsellButtonDtoV4 != null ? integrationsUpsellButtonDtoV4.hashCode() : 0);
    }

    public String toString() {
        String str = this.image;
        String str2 = this.title;
        String str3 = this.subtitle;
        IntegrationsUpsellButtonDtoV3 integrationsUpsellButtonDtoV3 = this.primaryButton;
        IntegrationsUpsellButtonDtoV3 integrationsUpsellButtonDtoV4 = this.secondaryButton;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("IntegrationsUpsellDtoV3(image=", str, ", title=", str2, ", subtitle=");
        sbM32001t.append(str3);
        sbM32001t.append(", primaryButton=");
        sbM32001t.append(integrationsUpsellButtonDtoV3);
        sbM32001t.append(", secondaryButton=");
        sbM32001t.append(integrationsUpsellButtonDtoV4);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public IntegrationsUpsellDtoV3(String image, String title, String subtitle, IntegrationsUpsellButtonDtoV3 integrationsUpsellButtonDtoV3, IntegrationsUpsellButtonDtoV3 integrationsUpsellButtonDtoV4) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
        this.primaryButton = integrationsUpsellButtonDtoV3;
        this.secondaryButton = integrationsUpsellButtonDtoV4;
    }
}
