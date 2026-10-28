package com.whoop.integrations.domain.models;

import c13.AbstractC3855a;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dq2.C12293a;
import io.getstream.chat.android.client.api.QueryParams;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0002LKBw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012B\u0093\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0012\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0019J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0019J\u0098\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u0010\u0010*\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00108\u0012\u0004\b>\u0010?\u001a\u0004\b=\u0010\u0019R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00108\u0012\u0004\bA\u0010?\u001a\u0004\b@\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\bB\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\bC\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\bD\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bF\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010E\u001a\u0004\bG\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\bH\u0010\u0019R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00108\u0012\u0004\bJ\u0010?\u001a\u0004\bI\u0010\u0019¨\u0006M"}, m65681d2 = {"Lcom/whoop/integrations/domain/models/IntegrationTabModel;", "", "", "id", "reportingKey", "Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;", "displayType", "title", "subtitle", "ctaText", "bannerImage", "iconImage", "", "connected", "connectedFrom3P", "screenName", "detailsUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;", "component4", "component5", "component6", "component7", "component8", "component9", "()Ljava/lang/Boolean;", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/integrations/domain/models/IntegrationTabModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$integrations_release", "(Lcom/whoop/integrations/domain/models/IntegrationTabModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getReportingKey", "Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;", "getDisplayType", "getTitle", "getTitle$annotations", "()V", "getSubtitle", "getSubtitle$annotations", "getCtaText", "getBannerImage", "getIconImage", "Ljava/lang/Boolean;", "getConnected", "getConnectedFrom3P", "getScreenName", "getDetailsUrl", "getDetailsUrl$annotations", "Companion", "$serializer", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class IntegrationTabModel {
    public static final int $stable = 0;

    @SerializedName("banner_image")
    private final String bannerImage;

    @SerializedName("connected")
    private final Boolean connected;

    @SerializedName("connected_from3_p")
    private final Boolean connectedFrom3P;

    @SerializedName("cta_text")
    private final String ctaText;

    @SerializedName(QueryParams.URL)
    private final String detailsUrl;

    @SerializedName("display_type")
    private final IntegrationTabDisplayType displayType;

    @SerializedName("icon_image")
    private final String iconImage;

    @SerializedName("id")
    private final String id;

    @SerializedName("reporting_key")
    private final String reportingKey;

    @SerializedName("screen_name")
    private final String screenName;

    @SerializedName("subtitle_display")
    private final String subtitle;

    @SerializedName("title_display")
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C12293a(4)), null, null, null, null, null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/integrations/domain/models/IntegrationTabModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/integrations/domain/models/IntegrationTabModel;", "serializer", "()Lwc3/c;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return IntegrationTabModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ IntegrationTabModel(int i13, String str, String str2, IntegrationTabDisplayType integrationTabDisplayType, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if (4095 != (i13 & 4095)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 4095, IntegrationTabModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.reportingKey = str2;
        this.displayType = integrationTabDisplayType;
        this.title = str3;
        this.subtitle = str4;
        this.ctaText = str5;
        this.bannerImage = str6;
        this.iconImage = str7;
        this.connected = bool;
        this.connectedFrom3P = bool2;
        this.screenName = str8;
        this.detailsUrl = str9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return IntegrationTabDisplayType.INSTANCE.serializer();
    }

    public static /* synthetic */ IntegrationTabModel copy$default(IntegrationTabModel integrationTabModel, String str, String str2, IntegrationTabDisplayType integrationTabDisplayType, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, String str8, String str9, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = integrationTabModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = integrationTabModel.reportingKey;
        }
        if ((i13 & 4) != 0) {
            integrationTabDisplayType = integrationTabModel.displayType;
        }
        if ((i13 & 8) != 0) {
            str3 = integrationTabModel.title;
        }
        if ((i13 & 16) != 0) {
            str4 = integrationTabModel.subtitle;
        }
        if ((i13 & 32) != 0) {
            str5 = integrationTabModel.ctaText;
        }
        if ((i13 & 64) != 0) {
            str6 = integrationTabModel.bannerImage;
        }
        if ((i13 & 128) != 0) {
            str7 = integrationTabModel.iconImage;
        }
        if ((i13 & 256) != 0) {
            bool = integrationTabModel.connected;
        }
        if ((i13 & 512) != 0) {
            bool2 = integrationTabModel.connectedFrom3P;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            str8 = integrationTabModel.screenName;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            str9 = integrationTabModel.detailsUrl;
        }
        String str10 = str8;
        String str11 = str9;
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        String str12 = str6;
        String str13 = str7;
        String str14 = str4;
        String str15 = str5;
        return integrationTabModel.copy(str, str2, integrationTabDisplayType, str3, str14, str15, str12, str13, bool3, bool4, str10, str11);
    }

    @InterfaceC37143h(QueryParams.URL)
    public static /* synthetic */ void getDetailsUrl$annotations() {
    }

    @InterfaceC37143h("subtitle_display")
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @InterfaceC37143h("title_display")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$integrations_release(IntegrationTabModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.reportingKey);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.displayType);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.title);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.ctaText);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.bannerImage);
        output.encodeStringElement(serialDesc, 7, self.iconImage);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 8, booleanSerializer, self.connected);
        output.encodeNullableSerializableElement(serialDesc, 9, booleanSerializer, self.connectedFrom3P);
        output.encodeNullableSerializableElement(serialDesc, 10, stringSerializer, self.screenName);
        output.encodeNullableSerializableElement(serialDesc, 11, stringSerializer, self.detailsUrl);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getConnectedFrom3P() {
        return this.connectedFrom3P;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getScreenName() {
        return this.screenName;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getDetailsUrl() {
        return this.detailsUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReportingKey() {
        return this.reportingKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final IntegrationTabDisplayType getDisplayType() {
        return this.displayType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBannerImage() {
        return this.bannerImage;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIconImage() {
        return this.iconImage;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getConnected() {
        return this.connected;
    }

    public final IntegrationTabModel copy(String id4, String reportingKey, IntegrationTabDisplayType displayType, String title, String subtitle, String ctaText, String bannerImage, String iconImage, Boolean connected, Boolean connectedFrom3P, String screenName, String detailsUrl) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(reportingKey, "reportingKey");
        AbstractC22676k.m65750j(displayType, "displayType");
        AbstractC22676k.m65750j(iconImage, "iconImage");
        return new IntegrationTabModel(id4, reportingKey, displayType, title, subtitle, ctaText, bannerImage, iconImage, connected, connectedFrom3P, screenName, detailsUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntegrationTabModel)) {
            return false;
        }
        IntegrationTabModel integrationTabModel = (IntegrationTabModel) other;
        return AbstractC22676k.m65745e(this.id, integrationTabModel.id) && AbstractC22676k.m65745e(this.reportingKey, integrationTabModel.reportingKey) && this.displayType == integrationTabModel.displayType && AbstractC22676k.m65745e(this.title, integrationTabModel.title) && AbstractC22676k.m65745e(this.subtitle, integrationTabModel.subtitle) && AbstractC22676k.m65745e(this.ctaText, integrationTabModel.ctaText) && AbstractC22676k.m65745e(this.bannerImage, integrationTabModel.bannerImage) && AbstractC22676k.m65745e(this.iconImage, integrationTabModel.iconImage) && AbstractC22676k.m65745e(this.connected, integrationTabModel.connected) && AbstractC22676k.m65745e(this.connectedFrom3P, integrationTabModel.connectedFrom3P) && AbstractC22676k.m65745e(this.screenName, integrationTabModel.screenName) && AbstractC22676k.m65745e(this.detailsUrl, integrationTabModel.detailsUrl);
    }

    public final String getBannerImage() {
        return this.bannerImage;
    }

    public final Boolean getConnected() {
        return this.connected;
    }

    public final Boolean getConnectedFrom3P() {
        return this.connectedFrom3P;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final String getDetailsUrl() {
        return this.detailsUrl;
    }

    public final IntegrationTabDisplayType getDisplayType() {
        return this.displayType;
    }

    public final String getIconImage() {
        return this.iconImage;
    }

    public final String getId() {
        return this.id;
    }

    public final String getReportingKey() {
        return this.reportingKey;
    }

    public final String getScreenName() {
        return this.screenName;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.displayType.hashCode() + AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.reportingKey)) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ctaText;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bannerImage;
        int iM30450d = AbstractC11266d.m30450d((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.iconImage);
        Boolean bool = this.connected;
        int iHashCode5 = (iM30450d + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.connectedFrom3P;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.screenName;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.detailsUrl;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.reportingKey;
        IntegrationTabDisplayType integrationTabDisplayType = this.displayType;
        String str3 = this.title;
        String str4 = this.subtitle;
        String str5 = this.ctaText;
        String str6 = this.bannerImage;
        String str7 = this.iconImage;
        Boolean bool = this.connected;
        Boolean bool2 = this.connectedFrom3P;
        String str8 = this.screenName;
        String str9 = this.detailsUrl;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("IntegrationTabModel(id=", str, ", reportingKey=", str2, ", displayType=");
        sbM32001t.append(integrationTabDisplayType);
        sbM32001t.append(", title=");
        sbM32001t.append(str3);
        sbM32001t.append(", subtitle=");
        AbstractC11266d.m30444B(sbM32001t, str4, ", ctaText=", str5, ", bannerImage=");
        AbstractC11266d.m30444B(sbM32001t, str6, ", iconImage=", str7, ", connected=");
        AbstractC3855a.m11839w(sbM32001t, bool, ", connectedFrom3P=", bool2, ", screenName=");
        return AbstractC11266d.m30464r(sbM32001t, str8, ", detailsUrl=", str9, ")");
    }

    public IntegrationTabModel(String id4, String reportingKey, IntegrationTabDisplayType displayType, String str, String str2, String str3, String str4, String iconImage, Boolean bool, Boolean bool2, String str5, String str6) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(reportingKey, "reportingKey");
        AbstractC22676k.m65750j(displayType, "displayType");
        AbstractC22676k.m65750j(iconImage, "iconImage");
        this.id = id4;
        this.reportingKey = reportingKey;
        this.displayType = displayType;
        this.title = str;
        this.subtitle = str2;
        this.ctaText = str3;
        this.bannerImage = str4;
        this.iconImage = iconImage;
        this.connected = bool;
        this.connectedFrom3P = bool2;
        this.screenName = str5;
        this.detailsUrl = str6;
    }
}
