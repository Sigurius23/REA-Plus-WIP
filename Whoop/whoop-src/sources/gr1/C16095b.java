package gr1;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import kd1.AbstractC22403o;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: gr1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001Bõ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J¤\u0002\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\r2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00182\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010.\u001a\u0004\b/\u0010'R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b5\u00103\u001a\u0004\b6\u00104R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b=\u00108\u001a\u0004\b>\u0010:R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u0010.\u001a\u0004\b?\u0010'R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b7\u0010BR\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bC\u00108\u001a\u0004\b;\u0010:R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bD\u00108\u001a\u0004\b5\u0010:R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bE\u0010.\u001a\u0004\b=\u0010'R\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bF\u00108\u001a\u0004\bG\u0010:R\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bG\u00108\u001a\u0004\bD\u0010:R\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bH\u00108\u001a\u0004\bE\u0010:R\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b6\u00108\u001a\u0004\bF\u0010:R\u0017\u0010\u0016\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b/\u0010A\u001a\u0004\bI\u0010BR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010.\u001a\u0004\bK\u0010'R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b?\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b>\u0010L\u001a\u0004\bO\u0010NR\u001f\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bC\u0010QR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bR\u0010L\u001a\u0004\bH\u0010NR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bK\u00108\u001a\u0004\bJ\u0010:R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b1\u0010L\u001a\u0004\b@\u0010NR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bI\u0010S\u001a\u0004\bR\u0010T¨\u0006U"}, m65681d2 = {"Lgr1/b;", "", "", "id", "reportingKey", "Lkd1/o;", "backgroundImage", "icon", "Lcom/whoop/design/util/TextResource;", "title", "description", "learnMoreButtonText", "learnMoreButtonDestinationUrl", "", "connected", "connectedStatus", "buttonText", "connectionUrl", "disconnectPopupTitle", "disconnectPopupDescription", "disconnectPopupPrimaryButtonText", "disconnectPopupSecondaryButtonText", "shouldPerformFullOauth", "providerId", "Lm91/u;", "upsellCtaTile", "overridePrimaryButton", "", "designItems", "footerDisclaimer", "lastUpdated", "descriptionFootnote", "Lgr1/s;", "privacyControls", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Lm91/u;Lm91/u;Ljava/util/List;Lm91/u;Lcom/whoop/design/util/TextResource;Lm91/u;Lgr1/s;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Lm91/u;Lm91/u;Ljava/util/List;Lm91/u;Lcom/whoop/design/util/TextResource;Lm91/u;Lgr1/s;)Lgr1/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "q", "b", "x", "c", "Lkd1/o;", "()Lkd1/o;", "d", "p", "e", "Lcom/whoop/design/util/TextResource;", "z", "()Lcom/whoop/design/util/TextResource;", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "t", "s", "i", "Z", "()Z", "j", "k", "l", "m", "n", "o", "y", "r", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lm91/u;", "A", "()Lm91/u;", "u", "Ljava/util/List;", "()Ljava/util/List;", "v", "Lgr1/s;", "()Lgr1/s;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16095b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String reportingKey;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o backgroundImage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC22403o icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource learnMoreButtonText;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String learnMoreButtonDestinationUrl;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean connected;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final TextResource connectedStatus;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final TextResource buttonText;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final String connectionUrl;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final TextResource disconnectPopupTitle;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final TextResource disconnectPopupDescription;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final TextResource disconnectPopupPrimaryButtonText;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final TextResource disconnectPopupSecondaryButtonText;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final boolean shouldPerformFullOauth;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final String providerId;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final InterfaceC25312u upsellCtaTile;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final InterfaceC25312u overridePrimaryButton;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final List<InterfaceC25312u> designItems;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final InterfaceC25312u footerDisclaimer;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final TextResource lastUpdated;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC25312u descriptionFootnote;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C16112s privacyControls;

    /* JADX WARN: Multi-variable type inference failed */
    public C16095b(String id4, String reportingKey, AbstractC22403o backgroundImage, AbstractC22403o icon, TextResource title, TextResource description, TextResource learnMoreButtonText, String str, boolean z4, TextResource connectedStatus, TextResource buttonText, String str2, TextResource disconnectPopupTitle, TextResource disconnectPopupDescription, TextResource disconnectPopupPrimaryButtonText, TextResource disconnectPopupSecondaryButtonText, boolean z13, String str3, InterfaceC25312u interfaceC25312u, InterfaceC25312u interfaceC25312u2, List<? extends InterfaceC25312u> list, InterfaceC25312u interfaceC25312u3, TextResource textResource, InterfaceC25312u interfaceC25312u4, C16112s c16112s) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(reportingKey, "reportingKey");
        AbstractC22676k.m65750j(backgroundImage, "backgroundImage");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(learnMoreButtonText, "learnMoreButtonText");
        AbstractC22676k.m65750j(connectedStatus, "connectedStatus");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        AbstractC22676k.m65750j(disconnectPopupTitle, "disconnectPopupTitle");
        AbstractC22676k.m65750j(disconnectPopupDescription, "disconnectPopupDescription");
        AbstractC22676k.m65750j(disconnectPopupPrimaryButtonText, "disconnectPopupPrimaryButtonText");
        AbstractC22676k.m65750j(disconnectPopupSecondaryButtonText, "disconnectPopupSecondaryButtonText");
        this.id = id4;
        this.reportingKey = reportingKey;
        this.backgroundImage = backgroundImage;
        this.icon = icon;
        this.title = title;
        this.description = description;
        this.learnMoreButtonText = learnMoreButtonText;
        this.learnMoreButtonDestinationUrl = str;
        this.connected = z4;
        this.connectedStatus = connectedStatus;
        this.buttonText = buttonText;
        this.connectionUrl = str2;
        this.disconnectPopupTitle = disconnectPopupTitle;
        this.disconnectPopupDescription = disconnectPopupDescription;
        this.disconnectPopupPrimaryButtonText = disconnectPopupPrimaryButtonText;
        this.disconnectPopupSecondaryButtonText = disconnectPopupSecondaryButtonText;
        this.shouldPerformFullOauth = z13;
        this.providerId = str3;
        this.upsellCtaTile = interfaceC25312u;
        this.overridePrimaryButton = interfaceC25312u2;
        this.designItems = list;
        this.footerDisclaimer = interfaceC25312u3;
        this.lastUpdated = textResource;
        this.descriptionFootnote = interfaceC25312u4;
        this.privacyControls = c16112s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C16095b m45513b(C16095b c16095b, String str, String str2, AbstractC22403o abstractC22403o, AbstractC22403o abstractC22403o2, TextResource textResource, TextResource textResource2, TextResource textResource3, String str3, boolean z4, TextResource textResource4, TextResource textResource5, String str4, TextResource textResource6, TextResource textResource7, TextResource textResource8, TextResource textResource9, boolean z13, String str5, InterfaceC25312u interfaceC25312u, InterfaceC25312u interfaceC25312u2, List list, InterfaceC25312u interfaceC25312u3, TextResource textResource10, InterfaceC25312u interfaceC25312u4, C16112s c16112s, int i13, Object obj) {
        C16112s c16112s2;
        InterfaceC25312u interfaceC25312u5;
        String str6 = (i13 & 1) != 0 ? c16095b.id : str;
        String str7 = (i13 & 2) != 0 ? c16095b.reportingKey : str2;
        AbstractC22403o abstractC22403o3 = (i13 & 4) != 0 ? c16095b.backgroundImage : abstractC22403o;
        AbstractC22403o abstractC22403o4 = (i13 & 8) != 0 ? c16095b.icon : abstractC22403o2;
        TextResource textResource11 = (i13 & 16) != 0 ? c16095b.title : textResource;
        TextResource textResource12 = (i13 & 32) != 0 ? c16095b.description : textResource2;
        TextResource textResource13 = (i13 & 64) != 0 ? c16095b.learnMoreButtonText : textResource3;
        String str8 = (i13 & 128) != 0 ? c16095b.learnMoreButtonDestinationUrl : str3;
        boolean z14 = (i13 & 256) != 0 ? c16095b.connected : z4;
        TextResource textResource14 = (i13 & 512) != 0 ? c16095b.connectedStatus : textResource4;
        TextResource textResource15 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c16095b.buttonText : textResource5;
        String str9 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c16095b.connectionUrl : str4;
        TextResource textResource16 = (i13 & 4096) != 0 ? c16095b.disconnectPopupTitle : textResource6;
        TextResource textResource17 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c16095b.disconnectPopupDescription : textResource7;
        String str10 = str6;
        TextResource textResource18 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c16095b.disconnectPopupPrimaryButtonText : textResource8;
        TextResource textResource19 = (i13 & 32768) != 0 ? c16095b.disconnectPopupSecondaryButtonText : textResource9;
        boolean z15 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? c16095b.shouldPerformFullOauth : z13;
        String str11 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? c16095b.providerId : str5;
        InterfaceC25312u interfaceC25312u6 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? c16095b.upsellCtaTile : interfaceC25312u;
        InterfaceC25312u interfaceC25312u7 = (i13 & 524288) != 0 ? c16095b.overridePrimaryButton : interfaceC25312u2;
        List list2 = (i13 & 1048576) != 0 ? c16095b.designItems : list;
        InterfaceC25312u interfaceC25312u8 = (i13 & 2097152) != 0 ? c16095b.footerDisclaimer : interfaceC25312u3;
        TextResource textResource20 = (i13 & 4194304) != 0 ? c16095b.lastUpdated : textResource10;
        InterfaceC25312u interfaceC25312u9 = (i13 & 8388608) != 0 ? c16095b.descriptionFootnote : interfaceC25312u4;
        if ((i13 & 16777216) != 0) {
            interfaceC25312u5 = interfaceC25312u9;
            c16112s2 = c16095b.privacyControls;
        } else {
            c16112s2 = c16112s;
            interfaceC25312u5 = interfaceC25312u9;
        }
        return c16095b.m45515a(str10, str7, abstractC22403o3, abstractC22403o4, textResource11, textResource12, textResource13, str8, z14, textResource14, textResource15, str9, textResource16, textResource17, textResource18, textResource19, z15, str11, interfaceC25312u6, interfaceC25312u7, list2, interfaceC25312u8, textResource20, interfaceC25312u5, c16112s2);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final InterfaceC25312u getUpsellCtaTile() {
        return this.upsellCtaTile;
    }

    /* JADX INFO: renamed from: a */
    public final C16095b m45515a(String id4, String reportingKey, AbstractC22403o backgroundImage, AbstractC22403o icon, TextResource title, TextResource description, TextResource learnMoreButtonText, String learnMoreButtonDestinationUrl, boolean connected, TextResource connectedStatus, TextResource buttonText, String connectionUrl, TextResource disconnectPopupTitle, TextResource disconnectPopupDescription, TextResource disconnectPopupPrimaryButtonText, TextResource disconnectPopupSecondaryButtonText, boolean shouldPerformFullOauth, String providerId, InterfaceC25312u upsellCtaTile, InterfaceC25312u overridePrimaryButton, List<? extends InterfaceC25312u> designItems, InterfaceC25312u footerDisclaimer, TextResource lastUpdated, InterfaceC25312u descriptionFootnote, C16112s privacyControls) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(reportingKey, "reportingKey");
        AbstractC22676k.m65750j(backgroundImage, "backgroundImage");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(learnMoreButtonText, "learnMoreButtonText");
        AbstractC22676k.m65750j(connectedStatus, "connectedStatus");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        AbstractC22676k.m65750j(disconnectPopupTitle, "disconnectPopupTitle");
        AbstractC22676k.m65750j(disconnectPopupDescription, "disconnectPopupDescription");
        AbstractC22676k.m65750j(disconnectPopupPrimaryButtonText, "disconnectPopupPrimaryButtonText");
        AbstractC22676k.m65750j(disconnectPopupSecondaryButtonText, "disconnectPopupSecondaryButtonText");
        return new C16095b(id4, reportingKey, backgroundImage, icon, title, description, learnMoreButtonText, learnMoreButtonDestinationUrl, connected, connectedStatus, buttonText, connectionUrl, disconnectPopupTitle, disconnectPopupDescription, disconnectPopupPrimaryButtonText, disconnectPopupSecondaryButtonText, shouldPerformFullOauth, providerId, upsellCtaTile, overridePrimaryButton, designItems, footerDisclaimer, lastUpdated, descriptionFootnote, privacyControls);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC22403o getBackgroundImage() {
        return this.backgroundImage;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getConnected() {
        return this.connected;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16095b)) {
            return false;
        }
        C16095b c16095b = (C16095b) other;
        return AbstractC22676k.m65745e(this.id, c16095b.id) && AbstractC22676k.m65745e(this.reportingKey, c16095b.reportingKey) && AbstractC22676k.m65745e(this.backgroundImage, c16095b.backgroundImage) && AbstractC22676k.m65745e(this.icon, c16095b.icon) && AbstractC22676k.m65745e(this.title, c16095b.title) && AbstractC22676k.m65745e(this.description, c16095b.description) && AbstractC22676k.m65745e(this.learnMoreButtonText, c16095b.learnMoreButtonText) && AbstractC22676k.m65745e(this.learnMoreButtonDestinationUrl, c16095b.learnMoreButtonDestinationUrl) && this.connected == c16095b.connected && AbstractC22676k.m65745e(this.connectedStatus, c16095b.connectedStatus) && AbstractC22676k.m65745e(this.buttonText, c16095b.buttonText) && AbstractC22676k.m65745e(this.connectionUrl, c16095b.connectionUrl) && AbstractC22676k.m65745e(this.disconnectPopupTitle, c16095b.disconnectPopupTitle) && AbstractC22676k.m65745e(this.disconnectPopupDescription, c16095b.disconnectPopupDescription) && AbstractC22676k.m65745e(this.disconnectPopupPrimaryButtonText, c16095b.disconnectPopupPrimaryButtonText) && AbstractC22676k.m65745e(this.disconnectPopupSecondaryButtonText, c16095b.disconnectPopupSecondaryButtonText) && this.shouldPerformFullOauth == c16095b.shouldPerformFullOauth && AbstractC22676k.m65745e(this.providerId, c16095b.providerId) && AbstractC22676k.m65745e(this.upsellCtaTile, c16095b.upsellCtaTile) && AbstractC22676k.m65745e(this.overridePrimaryButton, c16095b.overridePrimaryButton) && AbstractC22676k.m65745e(this.designItems, c16095b.designItems) && AbstractC22676k.m65745e(this.footerDisclaimer, c16095b.footerDisclaimer) && AbstractC22676k.m65745e(this.lastUpdated, c16095b.lastUpdated) && AbstractC22676k.m65745e(this.descriptionFootnote, c16095b.descriptionFootnote) && AbstractC22676k.m65745e(this.privacyControls, c16095b.privacyControls);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getConnectedStatus() {
        return this.connectedStatus;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getConnectionUrl() {
        return this.connectionUrl;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC30007c.m91833c(this.icon, AbstractC30007c.m91833c(this.backgroundImage, AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.reportingKey), 31), 31), this.title, 31), this.description, 31), this.learnMoreButtonText, 31);
        String str = this.learnMoreButtonDestinationUrl;
        int iM95625a2 = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC2875y.m8289b((iM95625a + (str == null ? 0 : str.hashCode())) * 31, 31, this.connected), this.connectedStatus, 31), this.buttonText, 31);
        String str2 = this.connectionUrl;
        int iM8289b = AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a((iM95625a2 + (str2 == null ? 0 : str2.hashCode())) * 31, this.disconnectPopupTitle, 31), this.disconnectPopupDescription, 31), this.disconnectPopupPrimaryButtonText, 31), this.disconnectPopupSecondaryButtonText, 31), 31, this.shouldPerformFullOauth);
        String str3 = this.providerId;
        int iHashCode = (iM8289b + (str3 == null ? 0 : str3.hashCode())) * 31;
        InterfaceC25312u interfaceC25312u = this.upsellCtaTile;
        int iHashCode2 = (iHashCode + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31;
        InterfaceC25312u interfaceC25312u2 = this.overridePrimaryButton;
        int iHashCode3 = (iHashCode2 + (interfaceC25312u2 == null ? 0 : interfaceC25312u2.hashCode())) * 31;
        List<InterfaceC25312u> list = this.designItems;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        InterfaceC25312u interfaceC25312u3 = this.footerDisclaimer;
        int iHashCode5 = (iHashCode4 + (interfaceC25312u3 == null ? 0 : interfaceC25312u3.hashCode())) * 31;
        TextResource textResource = this.lastUpdated;
        int iHashCode6 = (iHashCode5 + (textResource == null ? 0 : textResource.hashCode())) * 31;
        InterfaceC25312u interfaceC25312u4 = this.descriptionFootnote;
        int iHashCode7 = (iHashCode6 + (interfaceC25312u4 == null ? 0 : interfaceC25312u4.hashCode())) * 31;
        C16112s c16112s = this.privacyControls;
        return iHashCode7 + (c16112s != null ? c16112s.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final InterfaceC25312u getDescriptionFootnote() {
        return this.descriptionFootnote;
    }

    /* JADX INFO: renamed from: j */
    public final List<InterfaceC25312u> m45523j() {
        return this.designItems;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextResource getDisconnectPopupDescription() {
        return this.disconnectPopupDescription;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextResource getDisconnectPopupPrimaryButtonText() {
        return this.disconnectPopupPrimaryButtonText;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextResource getDisconnectPopupSecondaryButtonText() {
        return this.disconnectPopupSecondaryButtonText;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final TextResource getDisconnectPopupTitle() {
        return this.disconnectPopupTitle;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final InterfaceC25312u getFooterDisclaimer() {
        return this.footerDisclaimer;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final AbstractC22403o getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final TextResource getLastUpdated() {
        return this.lastUpdated;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getLearnMoreButtonDestinationUrl() {
        return this.learnMoreButtonDestinationUrl;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final TextResource getLearnMoreButtonText() {
        return this.learnMoreButtonText;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.reportingKey;
        AbstractC22403o abstractC22403o = this.backgroundImage;
        AbstractC22403o abstractC22403o2 = this.icon;
        TextResource textResource = this.title;
        TextResource textResource2 = this.description;
        TextResource textResource3 = this.learnMoreButtonText;
        String str3 = this.learnMoreButtonDestinationUrl;
        boolean z4 = this.connected;
        TextResource textResource4 = this.connectedStatus;
        TextResource textResource5 = this.buttonText;
        String str4 = this.connectionUrl;
        TextResource textResource6 = this.disconnectPopupTitle;
        TextResource textResource7 = this.disconnectPopupDescription;
        TextResource textResource8 = this.disconnectPopupPrimaryButtonText;
        TextResource textResource9 = this.disconnectPopupSecondaryButtonText;
        boolean z13 = this.shouldPerformFullOauth;
        String str5 = this.providerId;
        InterfaceC25312u interfaceC25312u = this.upsellCtaTile;
        InterfaceC25312u interfaceC25312u2 = this.overridePrimaryButton;
        List<InterfaceC25312u> list = this.designItems;
        InterfaceC25312u interfaceC25312u3 = this.footerDisclaimer;
        TextResource textResource10 = this.lastUpdated;
        InterfaceC25312u interfaceC25312u4 = this.descriptionFootnote;
        C16112s c16112s = this.privacyControls;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DetailsScreen(id=", str, ", reportingKey=", str2, ", backgroundImage=");
        sbM32001t.append(abstractC22403o);
        sbM32001t.append(", icon=");
        sbM32001t.append(abstractC22403o2);
        sbM32001t.append(", title=");
        AbstractC30007c.m91855y(sbM32001t, textResource, ", description=", textResource2, ", learnMoreButtonText=");
        AbstractC30007c.m91856z(sbM32001t, textResource3, ", learnMoreButtonDestinationUrl=", str3, ", connected=");
        AbstractC21702c.m61144o(textResource4, ", connectedStatus=", ", buttonText=", sbM32001t, z4);
        AbstractC30007c.m91856z(sbM32001t, textResource5, ", connectionUrl=", str4, ", disconnectPopupTitle=");
        AbstractC30007c.m91855y(sbM32001t, textResource6, ", disconnectPopupDescription=", textResource7, ", disconnectPopupPrimaryButtonText=");
        AbstractC30007c.m91855y(sbM32001t, textResource8, ", disconnectPopupSecondaryButtonText=", textResource9, ", shouldPerformFullOauth=");
        AbstractC38963t7.m124391u(sbM32001t, z13, ", providerId=", str5, ", upsellCtaTile=");
        sbM32001t.append(interfaceC25312u);
        sbM32001t.append(", overridePrimaryButton=");
        sbM32001t.append(interfaceC25312u2);
        sbM32001t.append(", designItems=");
        sbM32001t.append(list);
        sbM32001t.append(", footerDisclaimer=");
        sbM32001t.append(interfaceC25312u3);
        sbM32001t.append(", lastUpdated=");
        sbM32001t.append(textResource10);
        sbM32001t.append(", descriptionFootnote=");
        sbM32001t.append(interfaceC25312u4);
        sbM32001t.append(", privacyControls=");
        sbM32001t.append(c16112s);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final InterfaceC25312u getOverridePrimaryButton() {
        return this.overridePrimaryButton;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final C16112s getPrivacyControls() {
        return this.privacyControls;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getProviderId() {
        return this.providerId;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getReportingKey() {
        return this.reportingKey;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final boolean getShouldPerformFullOauth() {
        return this.shouldPerformFullOauth;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }
}
