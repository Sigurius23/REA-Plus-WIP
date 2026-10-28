package com.whoop.integrations.domain.models.p061v2;

import androidx.profileinstaller.ProfileVerifier;
import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ej1.C13228a;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.EnumC27272p;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 e2\u00020\u0001:\u0002feB¯\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019BË\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0018\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010 J\u0012\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010 J\u0012\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b/\u0010.J\u0012\u00100\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010 J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010 J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010 J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010 JÜ\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b8\u0010 J\u0010\u00109\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010<\u001a\u00020\u00042\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b<\u0010=J'\u0010F\u001a\u00020C2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0001¢\u0006\u0004\bD\u0010ER\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010G\u001a\u0004\bH\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010I\u001a\u0004\b\u0005\u0010\"R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010G\u0012\u0004\bK\u0010L\u001a\u0004\bJ\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010G\u001a\u0004\bM\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010G\u001a\u0004\bN\u0010 R \u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010I\u0012\u0004\bP\u0010L\u001a\u0004\bO\u0010\"R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bQ\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010G\u001a\u0004\bR\u0010 R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010G\u0012\u0004\bT\u0010L\u001a\u0004\bS\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010U\u001a\u0004\bV\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010G\u001a\u0004\bW\u0010 R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010X\u001a\u0004\bY\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010X\u001a\u0004\bZ\u0010.R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010[\u001a\u0004\b\\\u00101R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010G\u0012\u0004\b^\u0010L\u001a\u0004\b]\u0010 R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010G\u0012\u0004\b`\u0010L\u001a\u0004\b_\u0010 R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010G\u0012\u0004\bb\u0010L\u001a\u0004\ba\u0010 R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010G\u0012\u0004\bd\u0010L\u001a\u0004\bc\u0010 ¨\u0006g"}, m65681d2 = {"Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;", "", "", "id", "", "isWhoopBuilt", "integrationId3P", "sectionTitle", "ctaTitle", "connected", "connectedStatusDisplay", "ctaConnectionUrl", "ctaDeepLinkUrl", "Lcom/whoop/design/models/InfoCalloutTileModel;", "infoCallout", "bottomDescriptionText", "showConnectedStatusIcon", "canShowDisconnectModal", "Lny0/p;", "ctaButtonStyle", "disconnectPopupTitle", "disconnectPopupDescription", "disconnectPopupPrimaryButtonTitle", "disconnectPopupSecondaryButtonTitle", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lny0/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lny0/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Lcom/whoop/design/models/InfoCalloutTileModel;", "component11", "component12", "()Ljava/lang/Boolean;", "component13", "component14", "()Lny0/p;", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lny0/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$integrations_release", "(Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "Z", "getIntegrationId3P", "getIntegrationId3P$annotations", "()V", "getSectionTitle", "getCtaTitle", "getConnected", "getConnected$annotations", "getConnectedStatusDisplay", "getCtaConnectionUrl", "getCtaDeepLinkUrl", "getCtaDeepLinkUrl$annotations", "Lcom/whoop/design/models/InfoCalloutTileModel;", "getInfoCallout", "getBottomDescriptionText", "Ljava/lang/Boolean;", "getShowConnectedStatusIcon", "getCanShowDisconnectModal", "Lny0/p;", "getCtaButtonStyle", "getDisconnectPopupTitle", "getDisconnectPopupTitle$annotations", "getDisconnectPopupDescription", "getDisconnectPopupDescription$annotations", "getDisconnectPopupPrimaryButtonTitle", "getDisconnectPopupPrimaryButtonTitle$annotations", "getDisconnectPopupSecondaryButtonTitle", "getDisconnectPopupSecondaryButtonTitle$annotations", "Companion", "$serializer", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class IntegrationsConnectionSectionRowModel {
    private final String bottomDescriptionText;
    private final Boolean canShowDisconnectModal;

    @SerializedName("section_connected")
    private final boolean connected;
    private final String connectedStatusDisplay;
    private final EnumC27272p ctaButtonStyle;
    private final String ctaConnectionUrl;

    @SerializedName("cta_deeplink_url")
    private final String ctaDeepLinkUrl;
    private final String ctaTitle;

    @SerializedName("disconnect_popup_description_display")
    private final String disconnectPopupDescription;

    @SerializedName("disconnect_popup_primary_button_display")
    private final String disconnectPopupPrimaryButtonTitle;

    @SerializedName("disconnect_popup_secondary_button_display")
    private final String disconnectPopupSecondaryButtonTitle;

    @SerializedName("disconnect_popup_title_display")
    private final String disconnectPopupTitle;
    private final String id;
    private final InfoCalloutTileModel infoCallout;

    @SerializedName("integration_id_3p")
    private final String integrationId3P;
    private final boolean isWhoopBuilt;
    private final String sectionTitle;
    private final Boolean showConnectedStatusIcon;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = InfoCalloutTileModel.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C13228a(19)), null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;", "serializer", "()Lwc3/c;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return IntegrationsConnectionSectionRowModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ IntegrationsConnectionSectionRowModel(int i13, String str, boolean z4, String str2, String str3, String str4, boolean z13, String str5, String str6, String str7, InfoCalloutTileModel infoCalloutTileModel, String str8, Boolean bool, Boolean bool2, EnumC27272p enumC27272p, String str9, String str10, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
        if (262143 != (i13 & 262143)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 262143, IntegrationsConnectionSectionRowModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.isWhoopBuilt = z4;
        this.integrationId3P = str2;
        this.sectionTitle = str3;
        this.ctaTitle = str4;
        this.connected = z13;
        this.connectedStatusDisplay = str5;
        this.ctaConnectionUrl = str6;
        this.ctaDeepLinkUrl = str7;
        this.infoCallout = infoCalloutTileModel;
        this.bottomDescriptionText = str8;
        this.showConnectedStatusIcon = bool;
        this.canShowDisconnectModal = bool2;
        this.ctaButtonStyle = enumC27272p;
        this.disconnectPopupTitle = str9;
        this.disconnectPopupDescription = str10;
        this.disconnectPopupPrimaryButtonTitle = str11;
        this.disconnectPopupSecondaryButtonTitle = str12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.button.IconButtonStyle", EnumC27272p.values());
    }

    public static /* synthetic */ IntegrationsConnectionSectionRowModel copy$default(IntegrationsConnectionSectionRowModel integrationsConnectionSectionRowModel, String str, boolean z4, String str2, String str3, String str4, boolean z13, String str5, String str6, String str7, InfoCalloutTileModel infoCalloutTileModel, String str8, Boolean bool, Boolean bool2, EnumC27272p enumC27272p, String str9, String str10, String str11, String str12, int i13, Object obj) {
        String str13;
        String str14;
        String str15 = (i13 & 1) != 0 ? integrationsConnectionSectionRowModel.id : str;
        boolean z14 = (i13 & 2) != 0 ? integrationsConnectionSectionRowModel.isWhoopBuilt : z4;
        String str16 = (i13 & 4) != 0 ? integrationsConnectionSectionRowModel.integrationId3P : str2;
        String str17 = (i13 & 8) != 0 ? integrationsConnectionSectionRowModel.sectionTitle : str3;
        String str18 = (i13 & 16) != 0 ? integrationsConnectionSectionRowModel.ctaTitle : str4;
        boolean z15 = (i13 & 32) != 0 ? integrationsConnectionSectionRowModel.connected : z13;
        String str19 = (i13 & 64) != 0 ? integrationsConnectionSectionRowModel.connectedStatusDisplay : str5;
        String str20 = (i13 & 128) != 0 ? integrationsConnectionSectionRowModel.ctaConnectionUrl : str6;
        String str21 = (i13 & 256) != 0 ? integrationsConnectionSectionRowModel.ctaDeepLinkUrl : str7;
        InfoCalloutTileModel infoCalloutTileModel2 = (i13 & 512) != 0 ? integrationsConnectionSectionRowModel.infoCallout : infoCalloutTileModel;
        String str22 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? integrationsConnectionSectionRowModel.bottomDescriptionText : str8;
        Boolean bool3 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? integrationsConnectionSectionRowModel.showConnectedStatusIcon : bool;
        Boolean bool4 = (i13 & 4096) != 0 ? integrationsConnectionSectionRowModel.canShowDisconnectModal : bool2;
        EnumC27272p enumC27272p2 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? integrationsConnectionSectionRowModel.ctaButtonStyle : enumC27272p;
        String str23 = str15;
        String str24 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? integrationsConnectionSectionRowModel.disconnectPopupTitle : str9;
        String str25 = (i13 & 32768) != 0 ? integrationsConnectionSectionRowModel.disconnectPopupDescription : str10;
        String str26 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? integrationsConnectionSectionRowModel.disconnectPopupPrimaryButtonTitle : str11;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
            str14 = str26;
            str13 = integrationsConnectionSectionRowModel.disconnectPopupSecondaryButtonTitle;
        } else {
            str13 = str12;
            str14 = str26;
        }
        return integrationsConnectionSectionRowModel.copy(str23, z14, str16, str17, str18, z15, str19, str20, str21, infoCalloutTileModel2, str22, bool3, bool4, enumC27272p2, str24, str25, str14, str13);
    }

    @InterfaceC37143h("section_connected")
    public static /* synthetic */ void getConnected$annotations() {
    }

    @InterfaceC37143h("cta_deeplink_url")
    public static /* synthetic */ void getCtaDeepLinkUrl$annotations() {
    }

    @InterfaceC37143h("disconnect_popup_description_display")
    public static /* synthetic */ void getDisconnectPopupDescription$annotations() {
    }

    @InterfaceC37143h("disconnect_popup_primary_button_display")
    public static /* synthetic */ void getDisconnectPopupPrimaryButtonTitle$annotations() {
    }

    @InterfaceC37143h("disconnect_popup_secondary_button_display")
    public static /* synthetic */ void getDisconnectPopupSecondaryButtonTitle$annotations() {
    }

    @InterfaceC37143h("disconnect_popup_title_display")
    public static /* synthetic */ void getDisconnectPopupTitle$annotations() {
    }

    @InterfaceC37143h("integration_id_3p")
    public static /* synthetic */ void getIntegrationId3P$annotations() {
    }

    public static final /* synthetic */ void write$Self$integrations_release(IntegrationsConnectionSectionRowModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeBooleanElement(serialDesc, 1, self.isWhoopBuilt);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.integrationId3P);
        output.encodeStringElement(serialDesc, 3, self.sectionTitle);
        output.encodeStringElement(serialDesc, 4, self.ctaTitle);
        output.encodeBooleanElement(serialDesc, 5, self.connected);
        output.encodeStringElement(serialDesc, 6, self.connectedStatusDisplay);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.ctaConnectionUrl);
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.ctaDeepLinkUrl);
        output.encodeNullableSerializableElement(serialDesc, 9, InfoCalloutTileModel$$serializer.INSTANCE, self.infoCallout);
        output.encodeNullableSerializableElement(serialDesc, 10, stringSerializer, self.bottomDescriptionText);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 11, booleanSerializer, self.showConnectedStatusIcon);
        output.encodeNullableSerializableElement(serialDesc, 12, booleanSerializer, self.canShowDisconnectModal);
        output.encodeNullableSerializableElement(serialDesc, 13, (InterfaceC37145j) interfaceC23462hArr[13].getValue(), self.ctaButtonStyle);
        output.encodeNullableSerializableElement(serialDesc, 14, stringSerializer, self.disconnectPopupTitle);
        output.encodeNullableSerializableElement(serialDesc, 15, stringSerializer, self.disconnectPopupDescription);
        output.encodeNullableSerializableElement(serialDesc, 16, stringSerializer, self.disconnectPopupPrimaryButtonTitle);
        output.encodeNullableSerializableElement(serialDesc, 17, stringSerializer, self.disconnectPopupSecondaryButtonTitle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final InfoCalloutTileModel getInfoCallout() {
        return this.infoCallout;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getBottomDescriptionText() {
        return this.bottomDescriptionText;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getShowConnectedStatusIcon() {
        return this.showConnectedStatusIcon;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getCanShowDisconnectModal() {
        return this.canShowDisconnectModal;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final EnumC27272p getCtaButtonStyle() {
        return this.ctaButtonStyle;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getDisconnectPopupTitle() {
        return this.disconnectPopupTitle;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getDisconnectPopupDescription() {
        return this.disconnectPopupDescription;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getDisconnectPopupPrimaryButtonTitle() {
        return this.disconnectPopupPrimaryButtonTitle;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getDisconnectPopupSecondaryButtonTitle() {
        return this.disconnectPopupSecondaryButtonTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsWhoopBuilt() {
        return this.isWhoopBuilt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIntegrationId3P() {
        return this.integrationId3P;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSectionTitle() {
        return this.sectionTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCtaTitle() {
        return this.ctaTitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getConnected() {
        return this.connected;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getConnectedStatusDisplay() {
        return this.connectedStatusDisplay;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCtaConnectionUrl() {
        return this.ctaConnectionUrl;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCtaDeepLinkUrl() {
        return this.ctaDeepLinkUrl;
    }

    public final IntegrationsConnectionSectionRowModel copy(String id4, boolean isWhoopBuilt, String integrationId3P, String sectionTitle, String ctaTitle, boolean connected, String connectedStatusDisplay, String ctaConnectionUrl, String ctaDeepLinkUrl, InfoCalloutTileModel infoCallout, String bottomDescriptionText, Boolean showConnectedStatusIcon, Boolean canShowDisconnectModal, EnumC27272p ctaButtonStyle, String disconnectPopupTitle, String disconnectPopupDescription, String disconnectPopupPrimaryButtonTitle, String disconnectPopupSecondaryButtonTitle) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(sectionTitle, "sectionTitle");
        AbstractC22676k.m65750j(ctaTitle, "ctaTitle");
        AbstractC22676k.m65750j(connectedStatusDisplay, "connectedStatusDisplay");
        return new IntegrationsConnectionSectionRowModel(id4, isWhoopBuilt, integrationId3P, sectionTitle, ctaTitle, connected, connectedStatusDisplay, ctaConnectionUrl, ctaDeepLinkUrl, infoCallout, bottomDescriptionText, showConnectedStatusIcon, canShowDisconnectModal, ctaButtonStyle, disconnectPopupTitle, disconnectPopupDescription, disconnectPopupPrimaryButtonTitle, disconnectPopupSecondaryButtonTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntegrationsConnectionSectionRowModel)) {
            return false;
        }
        IntegrationsConnectionSectionRowModel integrationsConnectionSectionRowModel = (IntegrationsConnectionSectionRowModel) other;
        return AbstractC22676k.m65745e(this.id, integrationsConnectionSectionRowModel.id) && this.isWhoopBuilt == integrationsConnectionSectionRowModel.isWhoopBuilt && AbstractC22676k.m65745e(this.integrationId3P, integrationsConnectionSectionRowModel.integrationId3P) && AbstractC22676k.m65745e(this.sectionTitle, integrationsConnectionSectionRowModel.sectionTitle) && AbstractC22676k.m65745e(this.ctaTitle, integrationsConnectionSectionRowModel.ctaTitle) && this.connected == integrationsConnectionSectionRowModel.connected && AbstractC22676k.m65745e(this.connectedStatusDisplay, integrationsConnectionSectionRowModel.connectedStatusDisplay) && AbstractC22676k.m65745e(this.ctaConnectionUrl, integrationsConnectionSectionRowModel.ctaConnectionUrl) && AbstractC22676k.m65745e(this.ctaDeepLinkUrl, integrationsConnectionSectionRowModel.ctaDeepLinkUrl) && AbstractC22676k.m65745e(this.infoCallout, integrationsConnectionSectionRowModel.infoCallout) && AbstractC22676k.m65745e(this.bottomDescriptionText, integrationsConnectionSectionRowModel.bottomDescriptionText) && AbstractC22676k.m65745e(this.showConnectedStatusIcon, integrationsConnectionSectionRowModel.showConnectedStatusIcon) && AbstractC22676k.m65745e(this.canShowDisconnectModal, integrationsConnectionSectionRowModel.canShowDisconnectModal) && this.ctaButtonStyle == integrationsConnectionSectionRowModel.ctaButtonStyle && AbstractC22676k.m65745e(this.disconnectPopupTitle, integrationsConnectionSectionRowModel.disconnectPopupTitle) && AbstractC22676k.m65745e(this.disconnectPopupDescription, integrationsConnectionSectionRowModel.disconnectPopupDescription) && AbstractC22676k.m65745e(this.disconnectPopupPrimaryButtonTitle, integrationsConnectionSectionRowModel.disconnectPopupPrimaryButtonTitle) && AbstractC22676k.m65745e(this.disconnectPopupSecondaryButtonTitle, integrationsConnectionSectionRowModel.disconnectPopupSecondaryButtonTitle);
    }

    public final String getBottomDescriptionText() {
        return this.bottomDescriptionText;
    }

    public final Boolean getCanShowDisconnectModal() {
        return this.canShowDisconnectModal;
    }

    public final boolean getConnected() {
        return this.connected;
    }

    public final String getConnectedStatusDisplay() {
        return this.connectedStatusDisplay;
    }

    public final EnumC27272p getCtaButtonStyle() {
        return this.ctaButtonStyle;
    }

    public final String getCtaConnectionUrl() {
        return this.ctaConnectionUrl;
    }

    public final String getCtaDeepLinkUrl() {
        return this.ctaDeepLinkUrl;
    }

    public final String getCtaTitle() {
        return this.ctaTitle;
    }

    public final String getDisconnectPopupDescription() {
        return this.disconnectPopupDescription;
    }

    public final String getDisconnectPopupPrimaryButtonTitle() {
        return this.disconnectPopupPrimaryButtonTitle;
    }

    public final String getDisconnectPopupSecondaryButtonTitle() {
        return this.disconnectPopupSecondaryButtonTitle;
    }

    public final String getDisconnectPopupTitle() {
        return this.disconnectPopupTitle;
    }

    public final String getId() {
        return this.id;
    }

    public final InfoCalloutTileModel getInfoCallout() {
        return this.infoCallout;
    }

    public final String getIntegrationId3P() {
        return this.integrationId3P;
    }

    public final String getSectionTitle() {
        return this.sectionTitle;
    }

    public final Boolean getShowConnectedStatusIcon() {
        return this.showConnectedStatusIcon;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.id.hashCode() * 31, 31, this.isWhoopBuilt);
        String str = this.integrationId3P;
        int iM30450d = AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM8289b + (str == null ? 0 : str.hashCode())) * 31, 31, this.sectionTitle), 31, this.ctaTitle), 31, this.connected), 31, this.connectedStatusDisplay);
        String str2 = this.ctaConnectionUrl;
        int iHashCode = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ctaDeepLinkUrl;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        InfoCalloutTileModel infoCalloutTileModel = this.infoCallout;
        int iHashCode3 = (iHashCode2 + (infoCalloutTileModel == null ? 0 : infoCalloutTileModel.hashCode())) * 31;
        String str4 = this.bottomDescriptionText;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.showConnectedStatusIcon;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canShowDisconnectModal;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        EnumC27272p enumC27272p = this.ctaButtonStyle;
        int iHashCode7 = (iHashCode6 + (enumC27272p == null ? 0 : enumC27272p.hashCode())) * 31;
        String str5 = this.disconnectPopupTitle;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.disconnectPopupDescription;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.disconnectPopupPrimaryButtonTitle;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.disconnectPopupSecondaryButtonTitle;
        return iHashCode10 + (str8 != null ? str8.hashCode() : 0);
    }

    public final boolean isWhoopBuilt() {
        return this.isWhoopBuilt;
    }

    public String toString() {
        String str = this.id;
        boolean z4 = this.isWhoopBuilt;
        String str2 = this.integrationId3P;
        String str3 = this.sectionTitle;
        String str4 = this.ctaTitle;
        boolean z13 = this.connected;
        String str5 = this.connectedStatusDisplay;
        String str6 = this.ctaConnectionUrl;
        String str7 = this.ctaDeepLinkUrl;
        InfoCalloutTileModel infoCalloutTileModel = this.infoCallout;
        String str8 = this.bottomDescriptionText;
        Boolean bool = this.showConnectedStatusIcon;
        Boolean bool2 = this.canShowDisconnectModal;
        EnumC27272p enumC27272p = this.ctaButtonStyle;
        String str9 = this.disconnectPopupTitle;
        String str10 = this.disconnectPopupDescription;
        String str11 = this.disconnectPopupPrimaryButtonTitle;
        String str12 = this.disconnectPopupSecondaryButtonTitle;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("IntegrationsConnectionSectionRowModel(id=", str, ", isWhoopBuilt=", ", integrationId3P=", z4);
        AbstractC11266d.m30444B(sbM73379l, str2, ", sectionTitle=", str3, ", ctaTitle=");
        AbstractC38963t7.m124390t(sbM73379l, str4, ", connected=", z13, ", connectedStatusDisplay=");
        AbstractC11266d.m30444B(sbM73379l, str5, ", ctaConnectionUrl=", str6, ", ctaDeepLinkUrl=");
        sbM73379l.append(str7);
        sbM73379l.append(", infoCallout=");
        sbM73379l.append(infoCalloutTileModel);
        sbM73379l.append(", bottomDescriptionText=");
        AbstractC36095b.m114692t(bool, str8, ", showConnectedStatusIcon=", ", canShowDisconnectModal=", sbM73379l);
        sbM73379l.append(bool2);
        sbM73379l.append(", ctaButtonStyle=");
        sbM73379l.append(enumC27272p);
        sbM73379l.append(", disconnectPopupTitle=");
        AbstractC11266d.m30444B(sbM73379l, str9, ", disconnectPopupDescription=", str10, ", disconnectPopupPrimaryButtonTitle=");
        return AbstractC11266d.m30464r(sbM73379l, str11, ", disconnectPopupSecondaryButtonTitle=", str12, ")");
    }

    public IntegrationsConnectionSectionRowModel(String id4, boolean z4, String str, String sectionTitle, String ctaTitle, boolean z13, String connectedStatusDisplay, String str2, String str3, InfoCalloutTileModel infoCalloutTileModel, String str4, Boolean bool, Boolean bool2, EnumC27272p enumC27272p, String str5, String str6, String str7, String str8) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(sectionTitle, "sectionTitle");
        AbstractC22676k.m65750j(ctaTitle, "ctaTitle");
        AbstractC22676k.m65750j(connectedStatusDisplay, "connectedStatusDisplay");
        this.id = id4;
        this.isWhoopBuilt = z4;
        this.integrationId3P = str;
        this.sectionTitle = sectionTitle;
        this.ctaTitle = ctaTitle;
        this.connected = z13;
        this.connectedStatusDisplay = connectedStatusDisplay;
        this.ctaConnectionUrl = str2;
        this.ctaDeepLinkUrl = str3;
        this.infoCallout = infoCalloutTileModel;
        this.bottomDescriptionText = str4;
        this.showConnectedStatusIcon = bool;
        this.canShowDisconnectModal = bool2;
        this.ctaButtonStyle = enumC27272p;
        this.disconnectPopupTitle = str5;
        this.disconnectPopupDescription = str6;
        this.disconnectPopupPrimaryButtonTitle = str7;
        this.disconnectPopupSecondaryButtonTitle = str8;
    }
}
