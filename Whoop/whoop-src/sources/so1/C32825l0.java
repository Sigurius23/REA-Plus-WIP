package so1;

import d13.AbstractC11478a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: so1.l0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lso1/l0;", "Lm91/u;", "", "title", "tile", "Lso1/n;", "infoButton", "", "showTileBackground", "<init>", "(Ljava/lang/String;Lm91/u;Lso1/n;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lm91/u;", "()Lm91/u;", "Lso1/n;", "()Lso1/n;", "d", "Z", "getShowTileBackground", "()Z", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32825l0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC25312u tile;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C32828n infoButton;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean showTileBackground;

    public C32825l0(String title, InterfaceC25312u tile, C32828n infoButton, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(tile, "tile");
        AbstractC22676k.m65750j(infoButton, "infoButton");
        this.title = title;
        this.tile = tile;
        this.infoButton = infoButton;
        this.showTileBackground = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C32828n getInfoButton() {
        return this.infoButton;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC25312u getTile() {
        return this.tile;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32825l0)) {
            return false;
        }
        C32825l0 c32825l0 = (C32825l0) other;
        return AbstractC22676k.m65745e(this.title, c32825l0.title) && AbstractC22676k.m65745e(this.tile, c32825l0.tile) && AbstractC22676k.m65745e(this.infoButton, c32825l0.infoButton) && this.showTileBackground == c32825l0.showTileBackground;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showTileBackground) + ((this.infoButton.hashCode() + AbstractC11478a.m30851c(this.tile, this.title.hashCode() * 31, 31)) * 31);
    }

    public String toString() {
        return "TileWithTitleViewState(title=" + this.title + ", tile=" + this.tile + ", infoButton=" + this.infoButton + ", showTileBackground=" + this.showTileBackground + ")";
    }
}
