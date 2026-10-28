package ji2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import y71.C39274g;

/* JADX INFO: renamed from: ji2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Lji2/a;", "", "Lcom/whoop/design/util/TextResource;", "menuItemTitle", "menuItemSubtitle", "Ly71/g;", "leftIcon", "rightIcon", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "c", "Ly71/g;", "getLeftIcon", "()Ly71/g;", "d", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21722a {

    /* JADX INFO: renamed from: e */
    public static final int f83435e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource menuItemTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource menuItemSubtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C39274g leftIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C39274g rightIcon;

    static {
        int i13 = C39274g.f168929c;
        int i14 = TextResource.$stable;
        f83435e = i13 | i14 | i14;
    }

    public C21722a(TextResource menuItemTitle, TextResource menuItemSubtitle, C39274g c39274g, C39274g c39274g2) {
        AbstractC22676k.m65750j(menuItemTitle, "menuItemTitle");
        AbstractC22676k.m65750j(menuItemSubtitle, "menuItemSubtitle");
        this.menuItemTitle = menuItemTitle;
        this.menuItemSubtitle = menuItemSubtitle;
        this.leftIcon = c39274g;
        this.rightIcon = c39274g2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getMenuItemSubtitle() {
        return this.menuItemSubtitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getMenuItemTitle() {
        return this.menuItemTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C39274g getRightIcon() {
        return this.rightIcon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21722a)) {
            return false;
        }
        C21722a c21722a = (C21722a) other;
        return AbstractC22676k.m65745e(this.menuItemTitle, c21722a.menuItemTitle) && AbstractC22676k.m65745e(this.menuItemSubtitle, c21722a.menuItemSubtitle) && AbstractC22676k.m65745e(this.leftIcon, c21722a.leftIcon) && AbstractC22676k.m65745e(this.rightIcon, c21722a.rightIcon);
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.menuItemTitle.hashCode() * 31, this.menuItemSubtitle, 31);
        C39274g c39274g = this.leftIcon;
        int iHashCode = (iM95625a + (c39274g == null ? 0 : c39274g.hashCode())) * 31;
        C39274g c39274g2 = this.rightIcon;
        return iHashCode + (c39274g2 != null ? c39274g2.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.menuItemTitle;
        TextResource textResource2 = this.menuItemSubtitle;
        C39274g c39274g = this.leftIcon;
        C39274g c39274g2 = this.rightIcon;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("ActivitiesItem(menuItemTitle=", textResource, ", menuItemSubtitle=", textResource2, ", leftIcon=");
        sbM106658q.append(c39274g);
        sbM106658q.append(", rightIcon=");
        sbM106658q.append(c39274g2);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
