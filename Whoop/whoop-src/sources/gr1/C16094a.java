package gr1;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import ny0.EnumC27272p;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: gr1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b(\u0010'R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b*\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b.\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b1\u0010\u001aR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b#\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b!\u0010-R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u00106\u001a\u0004\b$\u00108R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b7\u00109\u001a\u0004\b0\u0010:R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b&\u0010;\u001a\u0004\b2\u0010<¨\u0006="}, m65681d2 = {"Lgr1/a;", "", "", "id", "", "isWhoopBuilt", "integrationId3P", "Lcom/whoop/design/util/TextResource;", "sectionTitle", "ctaTitle", "connected", "connectedStatus", "connectionUrl", "deepLinkUrl", "Lm91/u;", "infoCallout", "bottomDescriptionText", "showConnectedStatusIcon", "canShowDisconnectModal", "Lny0/p;", "ctaButtonStyle", "Lgr1/e;", "disconnectPopup", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lm91/u;Lcom/whoop/design/util/TextResource;Ljava/lang/Boolean;Ljava/lang/Boolean;Lny0/p;Lgr1/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "j", "b", "Z", "o", "()Z", "c", "l", "d", "Lcom/whoop/design/util/TextResource;", "m", "()Lcom/whoop/design/util/TextResource;", "e", "g", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "Lm91/u;", "k", "()Lm91/u;", "Ljava/lang/Boolean;", "n", "()Ljava/lang/Boolean;", "Lny0/p;", "()Lny0/p;", "Lgr1/e;", "()Lgr1/e;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16094a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isWhoopBuilt;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String integrationId3P;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource sectionTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource ctaTitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean connected;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource connectedStatus;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String connectionUrl;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String deepLinkUrl;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC25312u infoCallout;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final TextResource bottomDescriptionText;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final Boolean showConnectedStatusIcon;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Boolean canShowDisconnectModal;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final EnumC27272p ctaButtonStyle;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final C16098e disconnectPopup;

    public C16094a(String id4, boolean z4, String str, TextResource sectionTitle, TextResource ctaTitle, boolean z13, TextResource connectedStatus, String str2, String str3, InterfaceC25312u interfaceC25312u, TextResource textResource, Boolean bool, Boolean bool2, EnumC27272p enumC27272p, C16098e disconnectPopup) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(sectionTitle, "sectionTitle");
        AbstractC22676k.m65750j(ctaTitle, "ctaTitle");
        AbstractC22676k.m65750j(connectedStatus, "connectedStatus");
        AbstractC22676k.m65750j(disconnectPopup, "disconnectPopup");
        this.id = id4;
        this.isWhoopBuilt = z4;
        this.integrationId3P = str;
        this.sectionTitle = sectionTitle;
        this.ctaTitle = ctaTitle;
        this.connected = z13;
        this.connectedStatus = connectedStatus;
        this.connectionUrl = str2;
        this.deepLinkUrl = str3;
        this.infoCallout = interfaceC25312u;
        this.bottomDescriptionText = textResource;
        this.showConnectedStatusIcon = bool;
        this.canShowDisconnectModal = bool2;
        this.ctaButtonStyle = enumC27272p;
        this.disconnectPopup = disconnectPopup;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getBottomDescriptionText() {
        return this.bottomDescriptionText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getCanShowDisconnectModal() {
        return this.canShowDisconnectModal;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getConnected() {
        return this.connected;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getConnectedStatus() {
        return this.connectedStatus;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getConnectionUrl() {
        return this.connectionUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16094a)) {
            return false;
        }
        C16094a c16094a = (C16094a) other;
        return AbstractC22676k.m65745e(this.id, c16094a.id) && this.isWhoopBuilt == c16094a.isWhoopBuilt && AbstractC22676k.m65745e(this.integrationId3P, c16094a.integrationId3P) && AbstractC22676k.m65745e(this.sectionTitle, c16094a.sectionTitle) && AbstractC22676k.m65745e(this.ctaTitle, c16094a.ctaTitle) && this.connected == c16094a.connected && AbstractC22676k.m65745e(this.connectedStatus, c16094a.connectedStatus) && AbstractC22676k.m65745e(this.connectionUrl, c16094a.connectionUrl) && AbstractC22676k.m65745e(this.deepLinkUrl, c16094a.deepLinkUrl) && AbstractC22676k.m65745e(this.infoCallout, c16094a.infoCallout) && AbstractC22676k.m65745e(this.bottomDescriptionText, c16094a.bottomDescriptionText) && AbstractC22676k.m65745e(this.showConnectedStatusIcon, c16094a.showConnectedStatusIcon) && AbstractC22676k.m65745e(this.canShowDisconnectModal, c16094a.canShowDisconnectModal) && this.ctaButtonStyle == c16094a.ctaButtonStyle && AbstractC22676k.m65745e(this.disconnectPopup, c16094a.disconnectPopup);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC27272p getCtaButtonStyle() {
        return this.ctaButtonStyle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getCtaTitle() {
        return this.ctaTitle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getDeepLinkUrl() {
        return this.deepLinkUrl;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.id.hashCode() * 31, 31, this.isWhoopBuilt);
        String str = this.integrationId3P;
        int iM95625a = AbstractC31061c.m95625a(AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC31061c.m95625a((iM8289b + (str == null ? 0 : str.hashCode())) * 31, this.sectionTitle, 31), this.ctaTitle, 31), 31, this.connected), this.connectedStatus, 31);
        String str2 = this.connectionUrl;
        int iHashCode = (iM95625a + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deepLinkUrl;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        InterfaceC25312u interfaceC25312u = this.infoCallout;
        int iHashCode3 = (iHashCode2 + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31;
        TextResource textResource = this.bottomDescriptionText;
        int iHashCode4 = (iHashCode3 + (textResource == null ? 0 : textResource.hashCode())) * 31;
        Boolean bool = this.showConnectedStatusIcon;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canShowDisconnectModal;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        EnumC27272p enumC27272p = this.ctaButtonStyle;
        return this.disconnectPopup.hashCode() + ((iHashCode6 + (enumC27272p != null ? enumC27272p.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C16098e getDisconnectPopup() {
        return this.disconnectPopup;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final InterfaceC25312u getInfoCallout() {
        return this.infoCallout;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getIntegrationId3P() {
        return this.integrationId3P;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextResource getSectionTitle() {
        return this.sectionTitle;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Boolean getShowConnectedStatusIcon() {
        return this.showConnectedStatusIcon;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getIsWhoopBuilt() {
        return this.isWhoopBuilt;
    }

    public String toString() {
        String str = this.id;
        boolean z4 = this.isWhoopBuilt;
        String str2 = this.integrationId3P;
        TextResource textResource = this.sectionTitle;
        TextResource textResource2 = this.ctaTitle;
        boolean z13 = this.connected;
        TextResource textResource3 = this.connectedStatus;
        String str3 = this.connectionUrl;
        String str4 = this.deepLinkUrl;
        InterfaceC25312u interfaceC25312u = this.infoCallout;
        TextResource textResource4 = this.bottomDescriptionText;
        Boolean bool = this.showConnectedStatusIcon;
        Boolean bool2 = this.canShowDisconnectModal;
        EnumC27272p enumC27272p = this.ctaButtonStyle;
        C16098e c16098e = this.disconnectPopup;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("ConnectionSection(id=", str, ", isWhoopBuilt=", ", integrationId3P=", z4);
        AbstractC30007c.m91826A(sbM73379l, str2, ", sectionTitle=", textResource, ", ctaTitle=");
        AbstractC33745d.m106664w(textResource2, ", connected=", ", connectedStatus=", sbM73379l, z13);
        AbstractC30007c.m91856z(sbM73379l, textResource3, ", connectionUrl=", str3, ", deepLinkUrl=");
        sbM73379l.append(str4);
        sbM73379l.append(", infoCallout=");
        sbM73379l.append(interfaceC25312u);
        sbM73379l.append(", bottomDescriptionText=");
        sbM73379l.append(textResource4);
        sbM73379l.append(", showConnectedStatusIcon=");
        sbM73379l.append(bool);
        sbM73379l.append(", canShowDisconnectModal=");
        sbM73379l.append(bool2);
        sbM73379l.append(", ctaButtonStyle=");
        sbM73379l.append(enumC27272p);
        sbM73379l.append(", disconnectPopup=");
        sbM73379l.append(c16098e);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }
}
