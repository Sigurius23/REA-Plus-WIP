package k01;

import c41.C4118t0;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import f01.EnumC13892q1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: k01.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001Bõ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010!\u001a\u00020\u0006\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bE\u0010;\u001a\u0004\b6\u0010)R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bF\u00103\u001a\u0004\bA\u00105R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bG\u00103\u001a\u0004\b=\u00105R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bH\u00103\u001a\u0004\bE\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\b/\u0010KR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b<\u00103\u001a\u0004\bL\u00105R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u00103\u001a\u0004\bM\u00105R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b4\u00103\u001a\u0004\bN\u00105R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bQ\u00103\u001a\u0004\bS\u00105R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bN\u0010T\u001a\u0004\bI\u0010UR\u0017\u0010\u001b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bM\u0010;\u001a\u0004\bO\u0010)R\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bL\u0010V\u001a\u0004\b2\u0010WR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bS\u0010X\u001a\u0004\bH\u0010YR\u0019\u0010 \u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bZ\u00103\u001a\u0004\b[\u00105R\u0017\u0010!\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\\\u00107\u001a\u0004\b]\u00109R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b^\u00100\u001a\u0004\bG\u0010'R\u0019\u0010#\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b_\u0010>\u001a\u0004\bF\u0010@¨\u0006`"}, m65681d2 = {"Lk01/e;", "Lm91/u;", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "Ly81/f;", "titleForegroundColor", "", "leftIcon", "rightIcon", "Li2/x;", "rightIconColor", "bedTimeIcon", "bedTimeTitle", "bedTimeTimeDisplay", "bedtimePeriodDisplay", "Lc41/t0;", "alarmStatus", "wakeTimeTitle", "wakeTimeTimeDisplay", "wakeTimeSubTitle", "Lk01/f;", "wakeTimeLabelStyle", "waketimePeriodDisplay", "Lk01/a;", "heightStyle", "wakeTimeIcon", "Lf01/q1;", "backgroundStyle", "Lcom/whoop/navigation/e;", "destination", "waketimeSubtitle", "tileBackgroundColor", "ctaButtonText", "ctaButtonIcon", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ly81/f;ILjava/lang/Integer;Li2/x;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/t0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk01/f;Lcom/whoop/design/util/TextResource;Lk01/a;ILf01/q1;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;Ly81/f;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "n", "()Lcom/whoop/design/util/TextResource;", "c", "Ly81/f;", "getTitleForegroundColor", "()Ly81/f;", "d", "I", "l", "e", "Ljava/lang/Integer;", "m", "()Ljava/lang/Integer;", "f", "Li2/x;", "getRightIconColor-QN2ZGVo", "()Li2/x;", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "j", "k", "Lc41/t0;", "()Lc41/t0;", "s", "r", "q", "o", "Lk01/f;", "p", "()Lk01/f;", "t", "Lk01/a;", "()Lk01/a;", "Lf01/q1;", "()Lf01/q1;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "u", "getWaketimeSubtitle", "v", "getTileBackgroundColor", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "x", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22093e implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC39333f titleForegroundColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int leftIcon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Integer rightIcon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C17919x rightIconColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int bedTimeIcon;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource bedTimeTitle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final TextResource bedTimeTimeDisplay;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final TextResource bedtimePeriodDisplay;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C4118t0 alarmStatus;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final TextResource wakeTimeTitle;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final TextResource wakeTimeTimeDisplay;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final TextResource wakeTimeSubTitle;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final EnumC22094f wakeTimeLabelStyle;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final TextResource waketimePeriodDisplay;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final EnumC22089a heightStyle;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final int wakeTimeIcon;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final EnumC13892q1 backgroundStyle;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final TextResource waketimeSubtitle;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final EnumC39333f tileBackgroundColor;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String ctaButtonText;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final Integer ctaButtonIcon;

    public /* synthetic */ C22093e(String str, TextResource textResource, EnumC39333f enumC39333f, int i13, Integer num, C17919x c17919x, int i14, TextResource textResource2, TextResource textResource3, TextResource textResource4, C4118t0 c4118t0, TextResource textResource5, TextResource textResource6, TextResource textResource7, EnumC22094f enumC22094f, TextResource textResource8, EnumC22089a enumC22089a, int i15, EnumC13892q1 enumC13892q1, C9598e c9598e, TextResource textResource9, EnumC39333f enumC39333f2, String str2, Integer num2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textResource, enumC39333f, i13, num, c17919x, i14, textResource2, textResource3, textResource4, c4118t0, textResource5, textResource6, textResource7, enumC22094f, textResource8, enumC22089a, i15, enumC13892q1, c9598e, textResource9, enumC39333f2, str2, num2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C4118t0 getAlarmStatus() {
        return this.alarmStatus;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC13892q1 getBackgroundStyle() {
        return this.backgroundStyle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getBedTimeIcon() {
        return this.bedTimeIcon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getBedTimeTimeDisplay() {
        return this.bedTimeTimeDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22093e)) {
            return false;
        }
        C22093e c22093e = (C22093e) other;
        return AbstractC22676k.m65745e(this.id, c22093e.id) && AbstractC22676k.m65745e(this.title, c22093e.title) && this.titleForegroundColor == c22093e.titleForegroundColor && this.leftIcon == c22093e.leftIcon && AbstractC22676k.m65745e(this.rightIcon, c22093e.rightIcon) && AbstractC22676k.m65745e(this.rightIconColor, c22093e.rightIconColor) && this.bedTimeIcon == c22093e.bedTimeIcon && AbstractC22676k.m65745e(this.bedTimeTitle, c22093e.bedTimeTitle) && AbstractC22676k.m65745e(this.bedTimeTimeDisplay, c22093e.bedTimeTimeDisplay) && AbstractC22676k.m65745e(this.bedtimePeriodDisplay, c22093e.bedtimePeriodDisplay) && AbstractC22676k.m65745e(this.alarmStatus, c22093e.alarmStatus) && AbstractC22676k.m65745e(this.wakeTimeTitle, c22093e.wakeTimeTitle) && AbstractC22676k.m65745e(this.wakeTimeTimeDisplay, c22093e.wakeTimeTimeDisplay) && AbstractC22676k.m65745e(this.wakeTimeSubTitle, c22093e.wakeTimeSubTitle) && this.wakeTimeLabelStyle == c22093e.wakeTimeLabelStyle && AbstractC22676k.m65745e(this.waketimePeriodDisplay, c22093e.waketimePeriodDisplay) && this.heightStyle == c22093e.heightStyle && this.wakeTimeIcon == c22093e.wakeTimeIcon && this.backgroundStyle == c22093e.backgroundStyle && AbstractC22676k.m65745e(this.destination, c22093e.destination) && AbstractC22676k.m65745e(this.waketimeSubtitle, c22093e.waketimeSubtitle) && this.tileBackgroundColor == c22093e.tileBackgroundColor && AbstractC22676k.m65745e(this.ctaButtonText, c22093e.ctaButtonText) && AbstractC22676k.m65745e(this.ctaButtonIcon, c22093e.ctaButtonIcon);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getBedTimeTitle() {
        return this.bedTimeTitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getBedtimePeriodDisplay() {
        return this.bedtimePeriodDisplay;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getCtaButtonIcon() {
        return this.ctaButtonIcon;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.leftIcon, AbstractC21702c.m61132c(this.titleForegroundColor, AbstractC31061c.m95625a(this.id.hashCode() * 31, this.title, 31), 31), 31);
        Integer num = this.rightIcon;
        int iHashCode = (iM30448b + (num == null ? 0 : num.hashCode())) * 31;
        C17919x c17919x = this.rightIconColor;
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30448b(this.bedTimeIcon, (iHashCode + (c17919x == null ? 0 : Long.hashCode(c17919x.f69639a))) * 31, 31), this.bedTimeTitle, 31), this.bedTimeTimeDisplay, 31);
        TextResource textResource = this.bedtimePeriodDisplay;
        int iHashCode2 = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        C4118t0 c4118t0 = this.alarmStatus;
        int iM95625a2 = AbstractC31061c.m95625a(AbstractC31061c.m95625a((iHashCode2 + (c4118t0 == null ? 0 : c4118t0.hashCode())) * 31, this.wakeTimeTitle, 31), this.wakeTimeTimeDisplay, 31);
        TextResource textResource2 = this.wakeTimeSubTitle;
        int iHashCode3 = (iM95625a2 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        EnumC22094f enumC22094f = this.wakeTimeLabelStyle;
        int iHashCode4 = (iHashCode3 + (enumC22094f == null ? 0 : enumC22094f.hashCode())) * 31;
        TextResource textResource3 = this.waketimePeriodDisplay;
        int iHashCode5 = (this.backgroundStyle.hashCode() + AbstractC11266d.m30448b(this.wakeTimeIcon, (this.heightStyle.hashCode() + ((iHashCode4 + (textResource3 == null ? 0 : textResource3.hashCode())) * 31)) * 31, 31)) * 31;
        C9598e c9598e = this.destination;
        int iHashCode6 = (iHashCode5 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        TextResource textResource4 = this.waketimeSubtitle;
        int iM61132c = AbstractC21702c.m61132c(this.tileBackgroundColor, (iHashCode6 + (textResource4 == null ? 0 : textResource4.hashCode())) * 31, 31);
        String str = this.ctaButtonText;
        int iHashCode7 = (iM61132c + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.ctaButtonIcon;
        return iHashCode7 + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getCtaButtonText() {
        return this.ctaButtonText;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final EnumC22089a getHeightStyle() {
        return this.heightStyle;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Integer getRightIcon() {
        return this.rightIcon;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getWakeTimeIcon() {
        return this.wakeTimeIcon;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final EnumC22094f getWakeTimeLabelStyle() {
        return this.wakeTimeLabelStyle;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final TextResource getWakeTimeSubTitle() {
        return this.wakeTimeSubTitle;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final TextResource getWakeTimeTimeDisplay() {
        return this.wakeTimeTimeDisplay;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final TextResource getWakeTimeTitle() {
        return this.wakeTimeTitle;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final TextResource getWaketimePeriodDisplay() {
        return this.waketimePeriodDisplay;
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.title;
        EnumC39333f enumC39333f = this.titleForegroundColor;
        int i13 = this.leftIcon;
        Integer num = this.rightIcon;
        C17919x c17919x = this.rightIconColor;
        int i14 = this.bedTimeIcon;
        TextResource textResource2 = this.bedTimeTitle;
        TextResource textResource3 = this.bedTimeTimeDisplay;
        TextResource textResource4 = this.bedtimePeriodDisplay;
        C4118t0 c4118t0 = this.alarmStatus;
        TextResource textResource5 = this.wakeTimeTitle;
        TextResource textResource6 = this.wakeTimeTimeDisplay;
        TextResource textResource7 = this.wakeTimeSubTitle;
        EnumC22094f enumC22094f = this.wakeTimeLabelStyle;
        TextResource textResource8 = this.waketimePeriodDisplay;
        EnumC22089a enumC22089a = this.heightStyle;
        int i15 = this.wakeTimeIcon;
        EnumC13892q1 enumC13892q1 = this.backgroundStyle;
        C9598e c9598e = this.destination;
        TextResource textResource9 = this.waketimeSubtitle;
        EnumC39333f enumC39333f2 = this.tileBackgroundColor;
        String str2 = this.ctaButtonText;
        Integer num2 = this.ctaButtonIcon;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("SleepPlannerAlarmCardViewState(id=", str, ", title=", textResource, ", titleForegroundColor=");
        sbM91847q.append(enumC39333f);
        sbM91847q.append(", leftIcon=");
        sbM91847q.append(i13);
        sbM91847q.append(", rightIcon=");
        sbM91847q.append(num);
        sbM91847q.append(", rightIconColor=");
        sbM91847q.append(c17919x);
        sbM91847q.append(", bedTimeIcon=");
        sbM91847q.append(i14);
        sbM91847q.append(", bedTimeTitle=");
        sbM91847q.append(textResource2);
        sbM91847q.append(", bedTimeTimeDisplay=");
        AbstractC30007c.m91855y(sbM91847q, textResource3, ", bedtimePeriodDisplay=", textResource4, ", alarmStatus=");
        sbM91847q.append(c4118t0);
        sbM91847q.append(", wakeTimeTitle=");
        sbM91847q.append(textResource5);
        sbM91847q.append(", wakeTimeTimeDisplay=");
        AbstractC30007c.m91855y(sbM91847q, textResource6, ", wakeTimeSubTitle=", textResource7, ", wakeTimeLabelStyle=");
        sbM91847q.append(enumC22094f);
        sbM91847q.append(", waketimePeriodDisplay=");
        sbM91847q.append(textResource8);
        sbM91847q.append(", heightStyle=");
        sbM91847q.append(enumC22089a);
        sbM91847q.append(", wakeTimeIcon=");
        sbM91847q.append(i15);
        sbM91847q.append(", backgroundStyle=");
        sbM91847q.append(enumC13892q1);
        sbM91847q.append(", destination=");
        sbM91847q.append(c9598e);
        sbM91847q.append(", waketimeSubtitle=");
        sbM91847q.append(textResource9);
        sbM91847q.append(", tileBackgroundColor=");
        sbM91847q.append(enumC39333f2);
        sbM91847q.append(", ctaButtonText=");
        sbM91847q.append(str2);
        sbM91847q.append(", ctaButtonIcon=");
        sbM91847q.append(num2);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }

    private C22093e(String id4, TextResource title, EnumC39333f titleForegroundColor, int i13, Integer num, C17919x c17919x, int i14, TextResource bedTimeTitle, TextResource bedTimeTimeDisplay, TextResource textResource, C4118t0 c4118t0, TextResource wakeTimeTitle, TextResource wakeTimeTimeDisplay, TextResource textResource2, EnumC22094f enumC22094f, TextResource textResource3, EnumC22089a heightStyle, int i15, EnumC13892q1 backgroundStyle, C9598e c9598e, TextResource textResource4, EnumC39333f tileBackgroundColor, String str, Integer num2) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(titleForegroundColor, "titleForegroundColor");
        AbstractC22676k.m65750j(bedTimeTitle, "bedTimeTitle");
        AbstractC22676k.m65750j(bedTimeTimeDisplay, "bedTimeTimeDisplay");
        AbstractC22676k.m65750j(wakeTimeTitle, "wakeTimeTitle");
        AbstractC22676k.m65750j(wakeTimeTimeDisplay, "wakeTimeTimeDisplay");
        AbstractC22676k.m65750j(heightStyle, "heightStyle");
        AbstractC22676k.m65750j(backgroundStyle, "backgroundStyle");
        AbstractC22676k.m65750j(tileBackgroundColor, "tileBackgroundColor");
        this.id = id4;
        this.title = title;
        this.titleForegroundColor = titleForegroundColor;
        this.leftIcon = i13;
        this.rightIcon = num;
        this.rightIconColor = c17919x;
        this.bedTimeIcon = i14;
        this.bedTimeTitle = bedTimeTitle;
        this.bedTimeTimeDisplay = bedTimeTimeDisplay;
        this.bedtimePeriodDisplay = textResource;
        this.alarmStatus = c4118t0;
        this.wakeTimeTitle = wakeTimeTitle;
        this.wakeTimeTimeDisplay = wakeTimeTimeDisplay;
        this.wakeTimeSubTitle = textResource2;
        this.wakeTimeLabelStyle = enumC22094f;
        this.waketimePeriodDisplay = textResource3;
        this.heightStyle = heightStyle;
        this.wakeTimeIcon = i15;
        this.backgroundStyle = backgroundStyle;
        this.destination = c9598e;
        this.waketimeSubtitle = textResource4;
        this.tileBackgroundColor = tileBackgroundColor;
        this.ctaButtonText = str;
        this.ctaButtonIcon = num2;
    }

    public /* synthetic */ C22093e(String str, TextResource textResource, EnumC39333f enumC39333f, int i13, Integer num, C17919x c17919x, int i14, TextResource textResource2, TextResource textResource3, TextResource textResource4, C4118t0 c4118t0, TextResource textResource5, TextResource textResource6, TextResource textResource7, EnumC22094f enumC22094f, TextResource textResource8, EnumC22089a enumC22089a, int i15, EnumC13892q1 enumC13892q1, C9598e c9598e, TextResource textResource9, EnumC39333f enumC39333f2, String str2, Integer num2, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? "" : str, textResource, (i16 & 4) != 0 ? EnumC39333f.BRAND_WHITE : enumC39333f, i13, num, (i16 & 32) != 0 ? null : c17919x, i14, textResource2, textResource3, (i16 & 512) != 0 ? null : textResource4, c4118t0, textResource5, textResource6, (i16 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : textResource7, (i16 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : enumC22094f, (32768 & i16) != 0 ? null : textResource8, (65536 & i16) != 0 ? EnumC22089a.DEFAULT : enumC22089a, i15, enumC13892q1, c9598e, (1048576 & i16) != 0 ? null : textResource9, (2097152 & i16) != 0 ? EnumC39333f.WHITE_5 : enumC39333f2, (4194304 & i16) != 0 ? null : str2, (i16 & 8388608) != 0 ? null : num2, null);
    }
}
