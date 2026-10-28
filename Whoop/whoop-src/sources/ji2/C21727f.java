package ji2;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import y71.C39274g;

/* JADX INFO: renamed from: ji2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0013\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u000e\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u000e¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u00105R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b9\u00103\u001a\u0004\b=\u00105R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b6\u00105R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b8\u0010@R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bE\u00103\u001a\u0004\bF\u00105R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b1\u00103\u001a\u0004\bK\u00105R\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bL\u00103\u001a\u0004\bG\u00105R\u0017\u0010\u0018\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bC\u00103\u001a\u0004\bE\u00105R\u0017\u0010\u0019\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bK\u00103\u001a\u0004\bA\u00105R\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bI\u00103\u001a\u0004\b>\u00105R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00138\u0006¢\u0006\f\n\u0004\bM\u0010H\u001a\u0004\bL\u0010JR\u0017\u0010\u001d\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b=\u00103\u001a\u0004\b/\u00105R\u0017\u0010\u001e\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b;\u0010?\u001a\u0004\b2\u0010@R\u0017\u0010\u001f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b4\u00103\u001a\u0004\b+\u00105R\u0017\u0010 \u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bN\u0010?\u001a\u0004\bM\u0010@¨\u0006O"}, m65681d2 = {"Lji2/f;", "", "Lkd1/o;", "backgroundImageUrl", "", "iconUrl", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "descriptionDisplay", "buttonDisplay", "Ly71/g;", "statusIcon", "statusDisplay", "automaticallyPostDisplay", "", "automaticallyPostEnabled", "Lji2/a;", "selectedActivitiesItem", "automaticallyPostDescriptionDisplay", "", "Lji2/d;", "shareableGraphics", "shareableGraphicDescriptionDisplay", "disconnectBubbleTitleDisplay", "disconnectBubbleDescriptionDisplay", "disconnectBubbleConfirmButtonDisplay", "disconnectBubbleCancelButtonDisplay", "Lji2/c;", "selectableActivitiesList", "automaticallyImportDisplay", "automaticallyImportEnabled", "automaticallyImportDescriptionDisplay", "showImportToggle", "<init>", "(Lkd1/o;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLji2/a;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "f", "()Lkd1/o;", "b", "Ljava/lang/String;", "m", "c", "Lcom/whoop/design/util/TextResource;", "u", "()Lcom/whoop/design/util/TextResource;", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "g", "Ly71/g;", "t", "()Ly71/g;", "s", "i", "Z", "()Z", "j", "Lji2/a;", "o", "()Lji2/a;", "k", "getAutomaticallyPostDescriptionDisplay", "l", "Ljava/util/List;", "q", "()Ljava/util/List;", "p", "n", "r", "v", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21727f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o backgroundImageUrl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String iconUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource descriptionDisplay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource buttonDisplay;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C39274g statusIcon;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource statusDisplay;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource automaticallyPostDisplay;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean automaticallyPostEnabled;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C21722a selectedActivitiesItem;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final TextResource automaticallyPostDescriptionDisplay;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final List<C21725d> shareableGraphics;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final TextResource shareableGraphicDescriptionDisplay;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final TextResource disconnectBubbleTitleDisplay;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final TextResource disconnectBubbleDescriptionDisplay;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final TextResource disconnectBubbleConfirmButtonDisplay;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final TextResource disconnectBubbleCancelButtonDisplay;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final List<C21724c> selectableActivitiesList;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final TextResource automaticallyImportDisplay;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final boolean automaticallyImportEnabled;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final TextResource automaticallyImportDescriptionDisplay;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final boolean showImportToggle;

    public C21727f(AbstractC22403o backgroundImageUrl, String iconUrl, TextResource titleDisplay, TextResource descriptionDisplay, TextResource buttonDisplay, C39274g statusIcon, TextResource statusDisplay, TextResource automaticallyPostDisplay, boolean z4, C21722a selectedActivitiesItem, TextResource automaticallyPostDescriptionDisplay, List<C21725d> shareableGraphics, TextResource shareableGraphicDescriptionDisplay, TextResource disconnectBubbleTitleDisplay, TextResource disconnectBubbleDescriptionDisplay, TextResource disconnectBubbleConfirmButtonDisplay, TextResource disconnectBubbleCancelButtonDisplay, List<C21724c> selectableActivitiesList, TextResource automaticallyImportDisplay, boolean z13, TextResource automaticallyImportDescriptionDisplay, boolean z14) {
        AbstractC22676k.m65750j(backgroundImageUrl, "backgroundImageUrl");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(buttonDisplay, "buttonDisplay");
        AbstractC22676k.m65750j(statusIcon, "statusIcon");
        AbstractC22676k.m65750j(statusDisplay, "statusDisplay");
        AbstractC22676k.m65750j(automaticallyPostDisplay, "automaticallyPostDisplay");
        AbstractC22676k.m65750j(selectedActivitiesItem, "selectedActivitiesItem");
        AbstractC22676k.m65750j(automaticallyPostDescriptionDisplay, "automaticallyPostDescriptionDisplay");
        AbstractC22676k.m65750j(shareableGraphics, "shareableGraphics");
        AbstractC22676k.m65750j(shareableGraphicDescriptionDisplay, "shareableGraphicDescriptionDisplay");
        AbstractC22676k.m65750j(disconnectBubbleTitleDisplay, "disconnectBubbleTitleDisplay");
        AbstractC22676k.m65750j(disconnectBubbleDescriptionDisplay, "disconnectBubbleDescriptionDisplay");
        AbstractC22676k.m65750j(disconnectBubbleConfirmButtonDisplay, "disconnectBubbleConfirmButtonDisplay");
        AbstractC22676k.m65750j(disconnectBubbleCancelButtonDisplay, "disconnectBubbleCancelButtonDisplay");
        AbstractC22676k.m65750j(selectableActivitiesList, "selectableActivitiesList");
        AbstractC22676k.m65750j(automaticallyImportDisplay, "automaticallyImportDisplay");
        AbstractC22676k.m65750j(automaticallyImportDescriptionDisplay, "automaticallyImportDescriptionDisplay");
        this.backgroundImageUrl = backgroundImageUrl;
        this.iconUrl = iconUrl;
        this.titleDisplay = titleDisplay;
        this.descriptionDisplay = descriptionDisplay;
        this.buttonDisplay = buttonDisplay;
        this.statusIcon = statusIcon;
        this.statusDisplay = statusDisplay;
        this.automaticallyPostDisplay = automaticallyPostDisplay;
        this.automaticallyPostEnabled = z4;
        this.selectedActivitiesItem = selectedActivitiesItem;
        this.automaticallyPostDescriptionDisplay = automaticallyPostDescriptionDisplay;
        this.shareableGraphics = shareableGraphics;
        this.shareableGraphicDescriptionDisplay = shareableGraphicDescriptionDisplay;
        this.disconnectBubbleTitleDisplay = disconnectBubbleTitleDisplay;
        this.disconnectBubbleDescriptionDisplay = disconnectBubbleDescriptionDisplay;
        this.disconnectBubbleConfirmButtonDisplay = disconnectBubbleConfirmButtonDisplay;
        this.disconnectBubbleCancelButtonDisplay = disconnectBubbleCancelButtonDisplay;
        this.selectableActivitiesList = selectableActivitiesList;
        this.automaticallyImportDisplay = automaticallyImportDisplay;
        this.automaticallyImportEnabled = z13;
        this.automaticallyImportDescriptionDisplay = automaticallyImportDescriptionDisplay;
        this.showImportToggle = z14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getAutomaticallyImportDescriptionDisplay() {
        return this.automaticallyImportDescriptionDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getAutomaticallyImportDisplay() {
        return this.automaticallyImportDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getAutomaticallyImportEnabled() {
        return this.automaticallyImportEnabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getAutomaticallyPostDisplay() {
        return this.automaticallyPostDisplay;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getAutomaticallyPostEnabled() {
        return this.automaticallyPostEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21727f)) {
            return false;
        }
        C21727f c21727f = (C21727f) other;
        return AbstractC22676k.m65745e(this.backgroundImageUrl, c21727f.backgroundImageUrl) && AbstractC22676k.m65745e(this.iconUrl, c21727f.iconUrl) && AbstractC22676k.m65745e(this.titleDisplay, c21727f.titleDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, c21727f.descriptionDisplay) && AbstractC22676k.m65745e(this.buttonDisplay, c21727f.buttonDisplay) && AbstractC22676k.m65745e(this.statusIcon, c21727f.statusIcon) && AbstractC22676k.m65745e(this.statusDisplay, c21727f.statusDisplay) && AbstractC22676k.m65745e(this.automaticallyPostDisplay, c21727f.automaticallyPostDisplay) && this.automaticallyPostEnabled == c21727f.automaticallyPostEnabled && AbstractC22676k.m65745e(this.selectedActivitiesItem, c21727f.selectedActivitiesItem) && AbstractC22676k.m65745e(this.automaticallyPostDescriptionDisplay, c21727f.automaticallyPostDescriptionDisplay) && AbstractC22676k.m65745e(this.shareableGraphics, c21727f.shareableGraphics) && AbstractC22676k.m65745e(this.shareableGraphicDescriptionDisplay, c21727f.shareableGraphicDescriptionDisplay) && AbstractC22676k.m65745e(this.disconnectBubbleTitleDisplay, c21727f.disconnectBubbleTitleDisplay) && AbstractC22676k.m65745e(this.disconnectBubbleDescriptionDisplay, c21727f.disconnectBubbleDescriptionDisplay) && AbstractC22676k.m65745e(this.disconnectBubbleConfirmButtonDisplay, c21727f.disconnectBubbleConfirmButtonDisplay) && AbstractC22676k.m65745e(this.disconnectBubbleCancelButtonDisplay, c21727f.disconnectBubbleCancelButtonDisplay) && AbstractC22676k.m65745e(this.selectableActivitiesList, c21727f.selectableActivitiesList) && AbstractC22676k.m65745e(this.automaticallyImportDisplay, c21727f.automaticallyImportDisplay) && this.automaticallyImportEnabled == c21727f.automaticallyImportEnabled && AbstractC22676k.m65745e(this.automaticallyImportDescriptionDisplay, c21727f.automaticallyImportDescriptionDisplay) && this.showImportToggle == c21727f.showImportToggle;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AbstractC22403o getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getButtonDisplay() {
        return this.buttonDisplay;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showImportToggle) + AbstractC31061c.m95625a(AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11895b.m31983b(AbstractC31061c.m95625a((this.selectedActivitiesItem.hashCode() + AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC31061c.m95625a((this.statusIcon.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30450d(this.backgroundImageUrl.hashCode() * 31, 31, this.iconUrl), this.titleDisplay, 31), this.descriptionDisplay, 31), this.buttonDisplay, 31)) * 31, this.statusDisplay, 31), this.automaticallyPostDisplay, 31), 31, this.automaticallyPostEnabled)) * 31, this.automaticallyPostDescriptionDisplay, 31), 31, this.shareableGraphics), this.shareableGraphicDescriptionDisplay, 31), this.disconnectBubbleTitleDisplay, 31), this.disconnectBubbleDescriptionDisplay, 31), this.disconnectBubbleConfirmButtonDisplay, 31), this.disconnectBubbleCancelButtonDisplay, 31), 31, this.selectableActivitiesList), this.automaticallyImportDisplay, 31), 31, this.automaticallyImportEnabled), this.automaticallyImportDescriptionDisplay, 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getDisconnectBubbleCancelButtonDisplay() {
        return this.disconnectBubbleCancelButtonDisplay;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getDisconnectBubbleConfirmButtonDisplay() {
        return this.disconnectBubbleConfirmButtonDisplay;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextResource getDisconnectBubbleDescriptionDisplay() {
        return this.disconnectBubbleDescriptionDisplay;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextResource getDisconnectBubbleTitleDisplay() {
        return this.disconnectBubbleTitleDisplay;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: n */
    public final List<C21724c> m61241n() {
        return this.selectableActivitiesList;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final C21722a getSelectedActivitiesItem() {
        return this.selectedActivitiesItem;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final TextResource getShareableGraphicDescriptionDisplay() {
        return this.shareableGraphicDescriptionDisplay;
    }

    /* JADX INFO: renamed from: q */
    public final List<C21725d> m61244q() {
        return this.shareableGraphics;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getShowImportToggle() {
        return this.showImportToggle;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final TextResource getStatusDisplay() {
        return this.statusDisplay;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final C39274g getStatusIcon() {
        return this.statusIcon;
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.backgroundImageUrl;
        String str = this.iconUrl;
        TextResource textResource = this.titleDisplay;
        TextResource textResource2 = this.descriptionDisplay;
        TextResource textResource3 = this.buttonDisplay;
        C39274g c39274g = this.statusIcon;
        TextResource textResource4 = this.statusDisplay;
        TextResource textResource5 = this.automaticallyPostDisplay;
        boolean z4 = this.automaticallyPostEnabled;
        C21722a c21722a = this.selectedActivitiesItem;
        TextResource textResource6 = this.automaticallyPostDescriptionDisplay;
        List<C21725d> list = this.shareableGraphics;
        TextResource textResource7 = this.shareableGraphicDescriptionDisplay;
        TextResource textResource8 = this.disconnectBubbleTitleDisplay;
        TextResource textResource9 = this.disconnectBubbleDescriptionDisplay;
        TextResource textResource10 = this.disconnectBubbleConfirmButtonDisplay;
        TextResource textResource11 = this.disconnectBubbleCancelButtonDisplay;
        List<C21724c> list2 = this.selectableActivitiesList;
        TextResource textResource12 = this.automaticallyImportDisplay;
        boolean z13 = this.automaticallyImportEnabled;
        TextResource textResource13 = this.automaticallyImportDescriptionDisplay;
        boolean z14 = this.showImportToggle;
        StringBuilder sb4 = new StringBuilder("StravaSettingsConnected(backgroundImageUrl=");
        sb4.append(abstractC22403o);
        sb4.append(", iconUrl=");
        sb4.append(str);
        sb4.append(", titleDisplay=");
        AbstractC30007c.m91855y(sb4, textResource, ", descriptionDisplay=", textResource2, ", buttonDisplay=");
        sb4.append(textResource3);
        sb4.append(", statusIcon=");
        sb4.append(c39274g);
        sb4.append(", statusDisplay=");
        AbstractC30007c.m91855y(sb4, textResource4, ", automaticallyPostDisplay=", textResource5, ", automaticallyPostEnabled=");
        sb4.append(z4);
        sb4.append(", selectedActivitiesItem=");
        sb4.append(c21722a);
        sb4.append(", automaticallyPostDescriptionDisplay=");
        AbstractC21702c.m61143n(textResource6, ", shareableGraphics=", ", shareableGraphicDescriptionDisplay=", sb4, list);
        AbstractC30007c.m91855y(sb4, textResource7, ", disconnectBubbleTitleDisplay=", textResource8, ", disconnectBubbleDescriptionDisplay=");
        AbstractC30007c.m91855y(sb4, textResource9, ", disconnectBubbleConfirmButtonDisplay=", textResource10, ", disconnectBubbleCancelButtonDisplay=");
        AbstractC21702c.m61143n(textResource11, ", selectableActivitiesList=", ", automaticallyImportDisplay=", sb4, list2);
        AbstractC33745d.m106664w(textResource12, ", automaticallyImportEnabled=", ", automaticallyImportDescriptionDisplay=", sb4, z13);
        sb4.append(textResource13);
        sb4.append(", showImportToggle=");
        sb4.append(z14);
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }
}
