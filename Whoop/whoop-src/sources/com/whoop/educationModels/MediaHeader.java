package com.whoop.educationModels;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rB_\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ^\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001dR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010.\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010\u001dR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b5\u00101\u001a\u0004\b4\u0010\u001dR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00106\u0012\u0004\b8\u00101\u001a\u0004\b7\u0010!R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b:\u00101\u001a\u0004\b9\u0010\u001dR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010;\u0012\u0004\b=\u00101\u001a\u0004\b<\u0010$R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010.\u0012\u0004\b?\u00101\u001a\u0004\b>\u0010\u001d¨\u0006B"}, m65681d2 = {"Lcom/whoop/educationModels/MediaHeader;", "", "", "title", "subText", "imageUrl", "", "shareEnabled", "ctaIcon", "Lcom/whoop/educationModels/PodcastPicker;", "podcastPicker", "shareLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/educationModels/PodcastPicker;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/educationModels/PodcastPicker;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$education_models_release", "(Lcom/whoop/educationModels/MediaHeader;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "component6", "()Lcom/whoop/educationModels/PodcastPicker;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/educationModels/PodcastPicker;Ljava/lang/String;)Lcom/whoop/educationModels/MediaHeader;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getSubText", "getSubText$annotations", "getImageUrl", "getImageUrl$annotations", "Z", "getShareEnabled", "getShareEnabled$annotations", "getCtaIcon", "getCtaIcon$annotations", "Lcom/whoop/educationModels/PodcastPicker;", "getPodcastPicker", "getPodcastPicker$annotations", "getShareLink", "getShareLink$annotations", "Companion", "$serializer", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MediaHeader {

    @SerializedName("cta_icon")
    private final String ctaIcon;

    @SerializedName("image_url")
    private final String imageUrl;

    @SerializedName("podcast_picker")
    private final PodcastPicker podcastPicker;

    @SerializedName("share_enabled")
    private final boolean shareEnabled;

    @SerializedName("share_link")
    private final String shareLink;

    @SerializedName("sub_text")
    private final String subText;

    @SerializedName("title")
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/educationModels/MediaHeader$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/educationModels/MediaHeader;", "serializer", "()Lwc3/c;", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MediaHeader$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MediaHeader(int i13, String str, String str2, String str3, boolean z4, String str4, PodcastPicker podcastPicker, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, MediaHeader$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subText = str2;
        this.imageUrl = str3;
        this.shareEnabled = z4;
        this.ctaIcon = str4;
        this.podcastPicker = podcastPicker;
        this.shareLink = str5;
    }

    public static /* synthetic */ MediaHeader copy$default(MediaHeader mediaHeader, String str, String str2, String str3, boolean z4, String str4, PodcastPicker podcastPicker, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = mediaHeader.title;
        }
        if ((i13 & 2) != 0) {
            str2 = mediaHeader.subText;
        }
        if ((i13 & 4) != 0) {
            str3 = mediaHeader.imageUrl;
        }
        if ((i13 & 8) != 0) {
            z4 = mediaHeader.shareEnabled;
        }
        if ((i13 & 16) != 0) {
            str4 = mediaHeader.ctaIcon;
        }
        if ((i13 & 32) != 0) {
            podcastPicker = mediaHeader.podcastPicker;
        }
        if ((i13 & 64) != 0) {
            str5 = mediaHeader.shareLink;
        }
        PodcastPicker podcastPicker2 = podcastPicker;
        String str6 = str5;
        String str7 = str4;
        String str8 = str3;
        return mediaHeader.copy(str, str2, str8, z4, str7, podcastPicker2, str6);
    }

    @InterfaceC37143h("cta_icon")
    public static /* synthetic */ void getCtaIcon$annotations() {
    }

    @InterfaceC37143h("image_url")
    public static /* synthetic */ void getImageUrl$annotations() {
    }

    @InterfaceC37143h("podcast_picker")
    public static /* synthetic */ void getPodcastPicker$annotations() {
    }

    @InterfaceC37143h("share_enabled")
    public static /* synthetic */ void getShareEnabled$annotations() {
    }

    @InterfaceC37143h("share_link")
    public static /* synthetic */ void getShareLink$annotations() {
    }

    @InterfaceC37143h("sub_text")
    public static /* synthetic */ void getSubText$annotations() {
    }

    @InterfaceC37143h("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$education_models_release(MediaHeader self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.subText);
        output.encodeStringElement(serialDesc, 2, self.imageUrl);
        output.encodeBooleanElement(serialDesc, 3, self.shareEnabled);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.ctaIcon);
        output.encodeNullableSerializableElement(serialDesc, 5, PodcastPicker$$serializer.INSTANCE, self.podcastPicker);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.shareLink);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubText() {
        return this.subText;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShareEnabled() {
        return this.shareEnabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCtaIcon() {
        return this.ctaIcon;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PodcastPicker getPodcastPicker() {
        return this.podcastPicker;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getShareLink() {
        return this.shareLink;
    }

    public final MediaHeader copy(String title, String subText, String imageUrl, boolean shareEnabled, String ctaIcon, PodcastPicker podcastPicker, String shareLink) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        return new MediaHeader(title, subText, imageUrl, shareEnabled, ctaIcon, podcastPicker, shareLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaHeader)) {
            return false;
        }
        MediaHeader mediaHeader = (MediaHeader) other;
        return AbstractC22676k.m65745e(this.title, mediaHeader.title) && AbstractC22676k.m65745e(this.subText, mediaHeader.subText) && AbstractC22676k.m65745e(this.imageUrl, mediaHeader.imageUrl) && this.shareEnabled == mediaHeader.shareEnabled && AbstractC22676k.m65745e(this.ctaIcon, mediaHeader.ctaIcon) && AbstractC22676k.m65745e(this.podcastPicker, mediaHeader.podcastPicker) && AbstractC22676k.m65745e(this.shareLink, mediaHeader.shareLink);
    }

    public final String getCtaIcon() {
        return this.ctaIcon;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final PodcastPicker getPodcastPicker() {
        return this.podcastPicker;
    }

    public final boolean getShareEnabled() {
        return this.shareEnabled;
    }

    public final String getShareLink() {
        return this.shareLink;
    }

    public final String getSubText() {
        return this.subText;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subText;
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.imageUrl), 31, this.shareEnabled);
        String str2 = this.ctaIcon;
        int iHashCode2 = (iM8289b + (str2 == null ? 0 : str2.hashCode())) * 31;
        PodcastPicker podcastPicker = this.podcastPicker;
        int iHashCode3 = (iHashCode2 + (podcastPicker == null ? 0 : podcastPicker.hashCode())) * 31;
        String str3 = this.shareLink;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subText;
        String str3 = this.imageUrl;
        boolean z4 = this.shareEnabled;
        String str4 = this.ctaIcon;
        PodcastPicker podcastPicker = this.podcastPicker;
        String str5 = this.shareLink;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MediaHeader(title=", str, ", subText=", str2, ", imageUrl=");
        AbstractC38963t7.m124390t(sbM32001t, str3, ", shareEnabled=", z4, ", ctaIcon=");
        sbM32001t.append(str4);
        sbM32001t.append(", podcastPicker=");
        sbM32001t.append(podcastPicker);
        sbM32001t.append(", shareLink=");
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }

    public MediaHeader(String title, String str, String imageUrl, boolean z4, String str2, PodcastPicker podcastPicker, String str3) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        this.title = title;
        this.subText = str;
        this.imageUrl = imageUrl;
        this.shareEnabled = z4;
        this.ctaIcon = str2;
        this.podcastPicker = podcastPicker;
        this.shareLink = str3;
    }
}
