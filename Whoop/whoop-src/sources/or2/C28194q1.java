package or2;

import p319m4.AbstractC25012a;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: or2.q1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, m65681d2 = {"Lor2/q1;", "", "", "statusBarColor", "navBarColor", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C28194q1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int statusBarColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int navBarColor;

    public C28194q1(int i13, int i14) {
        this.statusBarColor = i13;
        this.navBarColor = i14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getNavBarColor() {
        return this.navBarColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getStatusBarColor() {
        return this.statusBarColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28194q1)) {
            return false;
        }
        C28194q1 c28194q1 = (C28194q1) other;
        return this.statusBarColor == c28194q1.statusBarColor && this.navBarColor == c28194q1.navBarColor;
    }

    public int hashCode() {
        return Integer.hashCode(this.navBarColor) + (Integer.hashCode(this.statusBarColor) * 31);
    }

    public String toString() {
        return AbstractC25012a.m73372e(this.statusBarColor, this.navBarColor, "SystemBarColors(statusBarColor=", ", navBarColor=", ")");
    }
}
