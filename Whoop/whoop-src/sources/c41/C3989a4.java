package c41;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import n41.C26271b;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: c41.a4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b$\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001d\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b%\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b \u0010\u0015R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b,\u0010/R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b(\u00102¨\u00063"}, m65681d2 = {"Lc41/a4;", "Lm91/u;", "", "offerId", "Lcom/whoop/design/util/TextResource;", "title", "markdownTitle", "Lc41/b4;", "borderStyle", "subtitle", "leadingIcon", "", "showChevron", "highlight", "Ln41/b;", "timerState", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lc41/b4;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZZLn41/b;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "Lcom/whoop/design/util/TextResource;", "i", "()Lcom/whoop/design/util/TextResource;", "c", "d", "Lc41/b4;", "()Lc41/b4;", "e", "g", "Z", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "getHighlight", "Ln41/b;", "()Ln41/b;", "j", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3989a4 implements InterfaceC25312u {

    /* JADX INFO: renamed from: k */
    public static final int f16226k = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String offerId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String markdownTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC3996b4 borderStyle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String leadingIcon;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean showChevron;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean highlight;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C26271b timerState;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C9598e navigation;

    public C3989a4(String str, TextResource textResource, String str2, EnumC3996b4 borderStyle, TextResource textResource2, String str3, boolean z4, boolean z13, C26271b c26271b, C9598e c9598e) {
        AbstractC22676k.m65750j(borderStyle, "borderStyle");
        this.offerId = str;
        this.title = textResource;
        this.markdownTitle = str2;
        this.borderStyle = borderStyle;
        this.subtitle = textResource2;
        this.leadingIcon = str3;
        this.showChevron = z4;
        this.highlight = z13;
        this.timerState = c26271b;
        this.navigation = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC3996b4 getBorderStyle() {
        return this.borderStyle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLeadingIcon() {
        return this.leadingIcon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMarkdownTitle() {
        return this.markdownTitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3989a4)) {
            return false;
        }
        C3989a4 c3989a4 = (C3989a4) other;
        return AbstractC22676k.m65745e(this.offerId, c3989a4.offerId) && AbstractC22676k.m65745e(this.title, c3989a4.title) && AbstractC22676k.m65745e(this.markdownTitle, c3989a4.markdownTitle) && this.borderStyle == c3989a4.borderStyle && AbstractC22676k.m65745e(this.subtitle, c3989a4.subtitle) && AbstractC22676k.m65745e(this.leadingIcon, c3989a4.leadingIcon) && this.showChevron == c3989a4.showChevron && this.highlight == c3989a4.highlight && AbstractC22676k.m65745e(this.timerState, c3989a4.timerState) && AbstractC22676k.m65745e(this.navigation, c3989a4.navigation);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getOfferId() {
        return this.offerId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getShowChevron() {
        return this.showChevron;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C26271b getTimerState() {
        return this.timerState;
    }

    public int hashCode() {
        String str = this.offerId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        TextResource textResource = this.title;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        String str2 = this.markdownTitle;
        int iHashCode3 = (this.borderStyle.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        TextResource textResource2 = this.subtitle;
        int iHashCode4 = (iHashCode3 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        String str3 = this.leadingIcon;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.showChevron), 31, this.highlight);
        C26271b c26271b = this.timerState;
        int iHashCode5 = (iM8289b + (c26271b == null ? 0 : c26271b.hashCode())) * 31;
        C9598e c9598e = this.navigation;
        return iHashCode5 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public String toString() {
        String str = this.offerId;
        TextResource textResource = this.title;
        String str2 = this.markdownTitle;
        EnumC3996b4 enumC3996b4 = this.borderStyle;
        TextResource textResource2 = this.subtitle;
        String str3 = this.leadingIcon;
        boolean z4 = this.showChevron;
        boolean z13 = this.highlight;
        C26271b c26271b = this.timerState;
        C9598e c9598e = this.navigation;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("OfferBannerViewState(offerId=", str, ", title=", textResource, ", markdownTitle=");
        sbM91847q.append(str2);
        sbM91847q.append(", borderStyle=");
        sbM91847q.append(enumC3996b4);
        sbM91847q.append(", subtitle=");
        AbstractC30007c.m91856z(sbM91847q, textResource2, ", leadingIcon=", str3, ", showChevron=");
        AbstractC38963t7.m124392v(sbM91847q, z4, ", highlight=", z13, ", timerState=");
        sbM91847q.append(c26271b);
        sbM91847q.append(", navigation=");
        sbM91847q.append(c9598e);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }
}
