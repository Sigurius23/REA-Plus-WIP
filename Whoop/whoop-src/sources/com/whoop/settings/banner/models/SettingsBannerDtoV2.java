package com.whoop.settings.banner.models;

import androidx.core.app.FrameMetricsAggregator;
import com.google.gson.annotations.SerializedName;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import db2.C11888a;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GFBS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eBu\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017Jn\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J'\u00100\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b.\u0010/R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\u0015R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00105\u0012\u0004\b7\u00104\u001a\u0004\b6\u0010\u0017R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00105\u0012\u0004\b9\u00104\u001a\u0004\b8\u0010\u0017R \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00105\u0012\u0004\b;\u00104\u001a\u0004\b:\u0010\u0017R \u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00105\u0012\u0004\b=\u00104\u001a\u0004\b<\u0010\u0017R \u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00105\u0012\u0004\b?\u00104\u001a\u0004\b>\u0010\u0017R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00105\u0012\u0004\bA\u00104\u001a\u0004\b@\u0010\u0017R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00105\u0012\u0004\bC\u00104\u001a\u0004\bB\u0010\u0017R\"\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00105\u0012\u0004\bE\u00104\u001a\u0004\bD\u0010\u0017¨\u0006H"}, m65681d2 = {"Lcom/whoop/settings/banner/models/SettingsBannerDtoV2;", "", "Lcom/whoop/navigation/e;", "destination", "", "backgroundImageUrl", "backgroundImageUrlV2", "ctaText", "category", "description", "title", "tag", "trackingValue", "<init>", "(Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/navigation/e;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/settings/banner/models/SettingsBannerDtoV2;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$settings_release", "(Lcom/whoop/settings/banner/models/SettingsBannerDtoV2;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "Ljava/lang/String;", "getBackgroundImageUrl", "getBackgroundImageUrl$annotations", "getBackgroundImageUrlV2", "getBackgroundImageUrlV2$annotations", "getCtaText", "getCtaText$annotations", "getCategory", "getCategory$annotations", "getDescription", "getDescription$annotations", "getTitle", "getTitle$annotations", "getTag", "getTag$annotations", "getTrackingValue", "getTrackingValue$annotations", "Companion", "$serializer", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SettingsBannerDtoV2 {

    @SerializedName("background_image")
    private final String backgroundImageUrl;

    @SerializedName("background_image_v2")
    private final String backgroundImageUrlV2;

    @SerializedName("category")
    private final String category;

    @SerializedName("cta_text")
    private final String ctaText;

    @SerializedName("description")
    private final String description;

    @SerializedName("destination")
    private final C9598e destination;

    @SerializedName("tag")
    private final String tag;

    @SerializedName("title")
    private final String title;

    @SerializedName("tracking_value")
    private final String trackingValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C11888a(0)), null, null, null, null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/settings/banner/models/SettingsBannerDtoV2$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/settings/banner/models/SettingsBannerDtoV2;", "serializer", "()Lwc3/c;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SettingsBannerDtoV2$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SettingsBannerDtoV2(int i13, C9598e c9598e, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, SettingsBannerDtoV2$$serializer.INSTANCE.getDescriptor());
        }
        this.destination = c9598e;
        this.backgroundImageUrl = str;
        this.backgroundImageUrlV2 = str2;
        this.ctaText = str3;
        this.category = str4;
        this.description = str5;
        this.title = str6;
        this.tag = str7;
        this.trackingValue = str8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ SettingsBannerDtoV2 copy$default(SettingsBannerDtoV2 settingsBannerDtoV2, C9598e c9598e, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c9598e = settingsBannerDtoV2.destination;
        }
        if ((i13 & 2) != 0) {
            str = settingsBannerDtoV2.backgroundImageUrl;
        }
        if ((i13 & 4) != 0) {
            str2 = settingsBannerDtoV2.backgroundImageUrlV2;
        }
        if ((i13 & 8) != 0) {
            str3 = settingsBannerDtoV2.ctaText;
        }
        if ((i13 & 16) != 0) {
            str4 = settingsBannerDtoV2.category;
        }
        if ((i13 & 32) != 0) {
            str5 = settingsBannerDtoV2.description;
        }
        if ((i13 & 64) != 0) {
            str6 = settingsBannerDtoV2.title;
        }
        if ((i13 & 128) != 0) {
            str7 = settingsBannerDtoV2.tag;
        }
        if ((i13 & 256) != 0) {
            str8 = settingsBannerDtoV2.trackingValue;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        String str13 = str4;
        String str14 = str2;
        return settingsBannerDtoV2.copy(c9598e, str, str14, str3, str13, str11, str12, str9, str10);
    }

    @InterfaceC37143h("background_image")
    public static /* synthetic */ void getBackgroundImageUrl$annotations() {
    }

    @InterfaceC37143h("background_image_v2")
    public static /* synthetic */ void getBackgroundImageUrlV2$annotations() {
    }

    @InterfaceC37143h("category")
    public static /* synthetic */ void getCategory$annotations() {
    }

    @InterfaceC37143h("cta_text")
    public static /* synthetic */ void getCtaText$annotations() {
    }

    @InterfaceC37143h("description")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @InterfaceC37143h("destination")
    public static /* synthetic */ void getDestination$annotations() {
    }

    @InterfaceC37143h("tag")
    public static /* synthetic */ void getTag$annotations() {
    }

    @InterfaceC37143h("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @InterfaceC37143h("tracking_value")
    public static /* synthetic */ void getTrackingValue$annotations() {
    }

    public static final /* synthetic */ void write$Self$settings_release(SettingsBannerDtoV2 self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.destination);
        output.encodeStringElement(serialDesc, 1, self.backgroundImageUrl);
        output.encodeStringElement(serialDesc, 2, self.backgroundImageUrlV2);
        output.encodeStringElement(serialDesc, 3, self.ctaText);
        output.encodeStringElement(serialDesc, 4, self.category);
        output.encodeStringElement(serialDesc, 5, self.description);
        output.encodeStringElement(serialDesc, 6, self.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.tag);
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.trackingValue);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBackgroundImageUrlV2() {
        return this.backgroundImageUrlV2;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTrackingValue() {
        return this.trackingValue;
    }

    public final SettingsBannerDtoV2 copy(C9598e destination, String backgroundImageUrl, String backgroundImageUrlV2, String ctaText, String category, String description, String title, String tag, String trackingValue) {
        AbstractC22676k.m65750j(destination, "destination");
        AbstractC22676k.m65750j(backgroundImageUrl, "backgroundImageUrl");
        AbstractC22676k.m65750j(backgroundImageUrlV2, "backgroundImageUrlV2");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(category, "category");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(title, "title");
        return new SettingsBannerDtoV2(destination, backgroundImageUrl, backgroundImageUrlV2, ctaText, category, description, title, tag, trackingValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingsBannerDtoV2)) {
            return false;
        }
        SettingsBannerDtoV2 settingsBannerDtoV2 = (SettingsBannerDtoV2) other;
        return AbstractC22676k.m65745e(this.destination, settingsBannerDtoV2.destination) && AbstractC22676k.m65745e(this.backgroundImageUrl, settingsBannerDtoV2.backgroundImageUrl) && AbstractC22676k.m65745e(this.backgroundImageUrlV2, settingsBannerDtoV2.backgroundImageUrlV2) && AbstractC22676k.m65745e(this.ctaText, settingsBannerDtoV2.ctaText) && AbstractC22676k.m65745e(this.category, settingsBannerDtoV2.category) && AbstractC22676k.m65745e(this.description, settingsBannerDtoV2.description) && AbstractC22676k.m65745e(this.title, settingsBannerDtoV2.title) && AbstractC22676k.m65745e(this.tag, settingsBannerDtoV2.tag) && AbstractC22676k.m65745e(this.trackingValue, settingsBannerDtoV2.trackingValue);
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final String getBackgroundImageUrlV2() {
        return this.backgroundImageUrlV2;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final String getDescription() {
        return this.description;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrackingValue() {
        return this.trackingValue;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.destination.hashCode() * 31, 31, this.backgroundImageUrl), 31, this.backgroundImageUrlV2), 31, this.ctaText), 31, this.category), 31, this.description), 31, this.title);
        String str = this.tag;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trackingValue;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        C9598e c9598e = this.destination;
        String str = this.backgroundImageUrl;
        String str2 = this.backgroundImageUrlV2;
        String str3 = this.ctaText;
        String str4 = this.category;
        String str5 = this.description;
        String str6 = this.title;
        String str7 = this.tag;
        String str8 = this.trackingValue;
        StringBuilder sb4 = new StringBuilder("SettingsBannerDtoV2(destination=");
        sb4.append(c9598e);
        sb4.append(", backgroundImageUrl=");
        sb4.append(str);
        sb4.append(", backgroundImageUrlV2=");
        AbstractC11266d.m30444B(sb4, str2, ", ctaText=", str3, ", category=");
        AbstractC11266d.m30444B(sb4, str4, ", description=", str5, ", title=");
        AbstractC11266d.m30444B(sb4, str6, ", tag=", str7, ", trackingValue=");
        return AbstractC25012a.m73376i(str8, ")", sb4);
    }

    public SettingsBannerDtoV2(C9598e destination, String backgroundImageUrl, String backgroundImageUrlV2, String ctaText, String category, String description, String title, String str, String str2) {
        AbstractC22676k.m65750j(destination, "destination");
        AbstractC22676k.m65750j(backgroundImageUrl, "backgroundImageUrl");
        AbstractC22676k.m65750j(backgroundImageUrlV2, "backgroundImageUrlV2");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(category, "category");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(title, "title");
        this.destination = destination;
        this.backgroundImageUrl = backgroundImageUrl;
        this.backgroundImageUrlV2 = backgroundImageUrlV2;
        this.ctaText = ctaText;
        this.category = category;
        this.description = description;
        this.title = title;
        this.tag = str;
        this.trackingValue = str2;
    }
}
