package so1;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import ih0.AbstractC18489d0;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: so1.n0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0018\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b\u001c\u0010%¨\u0006&"}, m65681d2 = {"Lso1/n0;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "tileTitleDisplay", "", "Lso1/m0;", "statsViewState", "Lcom/whoop/navigation/e;", "infoButtonDestination", "", "showSectionTitle", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/navigation/e;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "b", "e", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Z", "()Z", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32829n0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource tileTitleDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C32827m0> statsViewState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C9598e infoButtonDestination;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean showSectionTitle;

    public C32829n0(TextResource titleDisplay, TextResource tileTitleDisplay, List<C32827m0> statsViewState, C9598e c9598e, boolean z4) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(tileTitleDisplay, "tileTitleDisplay");
        AbstractC22676k.m65750j(statsViewState, "statsViewState");
        this.titleDisplay = titleDisplay;
        this.tileTitleDisplay = tileTitleDisplay;
        this.statsViewState = statsViewState;
        this.infoButtonDestination = c9598e;
        this.showSectionTitle = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getInfoButtonDestination() {
        return this.infoButtonDestination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShowSectionTitle() {
        return this.showSectionTitle;
    }

    /* JADX INFO: renamed from: c */
    public final List<C32827m0> m103016c() {
        return this.statsViewState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTileTitleDisplay() {
        return this.tileTitleDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32829n0)) {
            return false;
        }
        C32829n0 c32829n0 = (C32829n0) other;
        return AbstractC22676k.m65745e(this.titleDisplay, c32829n0.titleDisplay) && AbstractC22676k.m65745e(this.tileTitleDisplay, c32829n0.tileTitleDisplay) && AbstractC22676k.m65745e(this.statsViewState, c32829n0.statsViewState) && AbstractC22676k.m65745e(this.infoButtonDestination, c32829n0.infoButtonDestination) && this.showSectionTitle == c32829n0.showSectionTitle;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC31061c.m95625a(this.titleDisplay.hashCode() * 31, this.tileTitleDisplay, 31), 31, this.statsViewState);
        C9598e c9598e = this.infoButtonDestination;
        return Boolean.hashCode(this.showSectionTitle) + ((iM31983b + (c9598e == null ? 0 : c9598e.hashCode())) * 31);
    }

    public String toString() {
        TextResource textResource = this.titleDisplay;
        TextResource textResource2 = this.tileTitleDisplay;
        List<C32827m0> list = this.statsViewState;
        C9598e c9598e = this.infoButtonDestination;
        boolean z4 = this.showSectionTitle;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("TypicalCycleTileViewState(titleDisplay=", textResource, ", tileTitleDisplay=", textResource2, ", statsViewState=");
        sbM106658q.append(list);
        sbM106658q.append(", infoButtonDestination=");
        sbM106658q.append(c9598e);
        sbM106658q.append(", showSectionTitle=");
        return AbstractC18489d0.m53372m(sbM106658q, z4, ")");
    }
}
