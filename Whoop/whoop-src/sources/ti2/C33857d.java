package ti2;

import gv1.AbstractC16241o;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ti2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lti2/d;", "", "", "showLottieTesterFab", "showLottieTesterSheet", "Lgv1/o;", "lottieTesterSource", "<init>", "(ZZLgv1/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "c", "Lgv1/o;", "()Lgv1/o;", "streaks_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33857d {

    /* JADX INFO: renamed from: d */
    public static final int f141791d = AbstractC16241o.f61698a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean showLottieTesterFab;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean showLottieTesterSheet;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC16241o lottieTesterSource;

    public C33857d(boolean z4, boolean z13, AbstractC16241o abstractC16241o) {
        this.showLottieTesterFab = z4;
        this.showLottieTesterSheet = z13;
        this.lottieTesterSource = abstractC16241o;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC16241o getLottieTesterSource() {
        return this.lottieTesterSource;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShowLottieTesterFab() {
        return this.showLottieTesterFab;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShowLottieTesterSheet() {
        return this.showLottieTesterSheet;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33857d)) {
            return false;
        }
        C33857d c33857d = (C33857d) other;
        return this.showLottieTesterFab == c33857d.showLottieTesterFab && this.showLottieTesterSheet == c33857d.showLottieTesterSheet && AbstractC22676k.m65745e(this.lottieTesterSource, c33857d.lottieTesterSource);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.showLottieTesterFab) * 31, 31, this.showLottieTesterSheet);
        AbstractC16241o abstractC16241o = this.lottieTesterSource;
        return iM8289b + (abstractC16241o == null ? 0 : abstractC16241o.hashCode());
    }

    public String toString() {
        boolean z4 = this.showLottieTesterFab;
        boolean z13 = this.showLottieTesterSheet;
        AbstractC16241o abstractC16241o = this.lottieTesterSource;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("StreaksLottieState(showLottieTesterFab=", ", showLottieTesterSheet=", ", lottieTesterSource=", z4, z13);
        sbM32002u.append(abstractC16241o);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C33857d(boolean z4, boolean z13, AbstractC16241o abstractC16241o, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? null : abstractC16241o);
    }
}
