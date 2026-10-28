package hp2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import y71.C39282o;

/* JADX INFO: renamed from: hp2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0019\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u0015\u0010\f¨\u0006\u001e"}, m65681d2 = {"Lhp2/g;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Ly71/o;", "tile", "", "textToCopy", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/o;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "d", "Ly71/o;", "()Ly71/o;", "Ljava/lang/String;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17560g implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f67974e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C39282o tile;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String textToCopy;

    static {
        int i13 = C39282o.f168987q;
        int i14 = TextResource.$stable;
        f67974e = i13 | i14 | i14;
    }

    public C17560g(TextResource title, TextResource subtitle, C39282o tile, String textToCopy) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(tile, "tile");
        AbstractC22676k.m65750j(textToCopy, "textToCopy");
        this.title = title;
        this.subtitle = subtitle;
        this.tile = tile;
        this.textToCopy = textToCopy;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getTextToCopy() {
        return this.textToCopy;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C39282o getTile() {
        return this.tile;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17560g)) {
            return false;
        }
        C17560g c17560g = (C17560g) other;
        return AbstractC22676k.m65745e(this.title, c17560g.title) && AbstractC22676k.m65745e(this.subtitle, c17560g.subtitle) && AbstractC22676k.m65745e(this.tile, c17560g.tile) && AbstractC22676k.m65745e(this.textToCopy, c17560g.textToCopy);
    }

    public int hashCode() {
        return this.textToCopy.hashCode() + ((this.tile.hashCode() + AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31)) * 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        C39282o c39282o = this.tile;
        String str = this.textToCopy;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("ReimbursementTileViewState(title=", textResource, ", subtitle=", textResource2, ", tile=");
        sbM106658q.append(c39282o);
        sbM106658q.append(", textToCopy=");
        sbM106658q.append(str);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
