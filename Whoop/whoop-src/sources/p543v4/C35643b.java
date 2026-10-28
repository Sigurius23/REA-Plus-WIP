package p543v4;

import android.graphics.Insets;
import p006a4.AbstractC0354a;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: v4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C35643b {

    /* JADX INFO: renamed from: e */
    public static final C35643b f151448e = new C35643b(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f151449a;

    /* JADX INFO: renamed from: b */
    public final int f151450b;

    /* JADX INFO: renamed from: c */
    public final int f151451c;

    /* JADX INFO: renamed from: d */
    public final int f151452d;

    public C35643b(int i13, int i14, int i15, int i16) {
        this.f151449a = i13;
        this.f151450b = i14;
        this.f151451c = i15;
        this.f151452d = i16;
    }

    /* JADX INFO: renamed from: a */
    public static C35643b m112839a(C35643b c35643b, C35643b c35643b2) {
        return m112840b(Math.max(c35643b.f151449a, c35643b2.f151449a), Math.max(c35643b.f151450b, c35643b2.f151450b), Math.max(c35643b.f151451c, c35643b2.f151451c), Math.max(c35643b.f151452d, c35643b2.f151452d));
    }

    /* JADX INFO: renamed from: b */
    public static C35643b m112840b(int i13, int i14, int i15, int i16) {
        return (i13 == 0 && i14 == 0 && i15 == 0 && i16 == 0) ? f151448e : new C35643b(i13, i14, i15, i16);
    }

    /* JADX INFO: renamed from: c */
    public static C35643b m112841c(Insets insets) {
        return m112840b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX INFO: renamed from: d */
    public final Insets m112842d() {
        return AbstractC0354a.m985y(this.f151449a, this.f151450b, this.f151451c, this.f151452d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C35643b.class != obj.getClass()) {
            return false;
        }
        C35643b c35643b = (C35643b) obj;
        return this.f151452d == c35643b.f151452d && this.f151449a == c35643b.f151449a && this.f151451c == c35643b.f151451c && this.f151450b == c35643b.f151450b;
    }

    public final int hashCode() {
        return (((((this.f151449a * 31) + this.f151450b) * 31) + this.f151451c) * 31) + this.f151452d;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Insets{left=");
        sb4.append(this.f151449a);
        sb4.append(", top=");
        sb4.append(this.f151450b);
        sb4.append(", right=");
        sb4.append(this.f151451c);
        sb4.append(", bottom=");
        return AbstractC11895b.m31999r(sb4, this.f151452d, '}');
    }
}
