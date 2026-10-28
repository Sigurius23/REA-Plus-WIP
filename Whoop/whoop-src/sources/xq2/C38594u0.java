package xq2;

import com.whoop.design.util.TextResource;
import kd1.AbstractC22403o;
import kr2.AbstractC22815d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: xq2.u0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0017\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m65681d2 = {"Lxq2/u0;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "headline", "bodyTitle", "bodyText", "Lkd1/o;", "backgroundImage", "Lkr2/d;", "theme", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lkr2/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "c", "d", "Lkd1/o;", "()Lkd1/o;", "Lkr2/d;", "f", "()Lkr2/d;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38594u0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f166058f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource headline;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource bodyTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource bodyText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC22403o backgroundImage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC22815d theme;

    static {
        int i13 = AbstractC22403o.f87638a;
        int i14 = TextResource.$stable;
        f166058f = i13 | i14 | i14 | i14;
    }

    public C38594u0(TextResource headline, TextResource bodyTitle, TextResource bodyText, AbstractC22403o backgroundImage, AbstractC22815d theme) {
        AbstractC22676k.m65750j(headline, "headline");
        AbstractC22676k.m65750j(bodyTitle, "bodyTitle");
        AbstractC22676k.m65750j(bodyText, "bodyText");
        AbstractC22676k.m65750j(backgroundImage, "backgroundImage");
        AbstractC22676k.m65750j(theme, "theme");
        this.headline = headline;
        this.bodyTitle = bodyTitle;
        this.bodyText = bodyText;
        this.backgroundImage = backgroundImage;
        this.theme = theme;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22403o getBackgroundImage() {
        return this.backgroundImage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getBodyText() {
        return this.bodyText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getBodyTitle() {
        return this.bodyTitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getHeadline() {
        return this.headline;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38594u0)) {
            return false;
        }
        C38594u0 c38594u0 = (C38594u0) other;
        return AbstractC22676k.m65745e(this.headline, c38594u0.headline) && AbstractC22676k.m65745e(this.bodyTitle, c38594u0.bodyTitle) && AbstractC22676k.m65745e(this.bodyText, c38594u0.bodyText) && AbstractC22676k.m65745e(this.backgroundImage, c38594u0.backgroundImage) && AbstractC22676k.m65745e(this.theme, c38594u0.theme);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AbstractC22815d getTheme() {
        return this.theme;
    }

    public int hashCode() {
        return this.theme.hashCode() + AbstractC30007c.m91833c(this.backgroundImage, AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.headline.hashCode() * 31, this.bodyTitle, 31), this.bodyText, 31), 31);
    }

    public String toString() {
        TextResource textResource = this.headline;
        TextResource textResource2 = this.bodyTitle;
        TextResource textResource3 = this.bodyText;
        AbstractC22403o abstractC22403o = this.backgroundImage;
        AbstractC22815d abstractC22815d = this.theme;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("YearInReviewSummaryCardState(headline=", textResource, ", bodyTitle=", textResource2, ", bodyText=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", backgroundImage=");
        sbM106658q.append(abstractC22403o);
        sbM106658q.append(", theme=");
        sbM106658q.append(abstractC22815d);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
