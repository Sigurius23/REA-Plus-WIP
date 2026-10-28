package fo;

import android.text.Layout;

/* JADX INFO: renamed from: fo.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C14661g {

    /* JADX INFO: renamed from: a */
    public String f54128a;

    /* JADX INFO: renamed from: b */
    public int f54129b;

    /* JADX INFO: renamed from: c */
    public boolean f54130c;

    /* JADX INFO: renamed from: d */
    public int f54131d;

    /* JADX INFO: renamed from: e */
    public boolean f54132e;

    /* JADX INFO: renamed from: k */
    public float f54138k;

    /* JADX INFO: renamed from: l */
    public String f54139l;

    /* JADX INFO: renamed from: o */
    public Layout.Alignment f54142o;

    /* JADX INFO: renamed from: p */
    public Layout.Alignment f54143p;

    /* JADX INFO: renamed from: r */
    public C14656b f54145r;

    /* JADX INFO: renamed from: f */
    public int f54133f = -1;

    /* JADX INFO: renamed from: g */
    public int f54134g = -1;

    /* JADX INFO: renamed from: h */
    public int f54135h = -1;

    /* JADX INFO: renamed from: i */
    public int f54136i = -1;

    /* JADX INFO: renamed from: j */
    public int f54137j = -1;

    /* JADX INFO: renamed from: m */
    public int f54140m = -1;

    /* JADX INFO: renamed from: n */
    public int f54141n = -1;

    /* JADX INFO: renamed from: q */
    public int f54144q = -1;

    /* JADX INFO: renamed from: s */
    public float f54146s = Float.MAX_VALUE;

    /* JADX INFO: renamed from: a */
    public final void m41883a(C14661g c14661g) {
        int i13;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c14661g != null) {
            if (!this.f54130c && c14661g.f54130c) {
                this.f54129b = c14661g.f54129b;
                this.f54130c = true;
            }
            if (this.f54135h == -1) {
                this.f54135h = c14661g.f54135h;
            }
            if (this.f54136i == -1) {
                this.f54136i = c14661g.f54136i;
            }
            if (this.f54128a == null && (str = c14661g.f54128a) != null) {
                this.f54128a = str;
            }
            if (this.f54133f == -1) {
                this.f54133f = c14661g.f54133f;
            }
            if (this.f54134g == -1) {
                this.f54134g = c14661g.f54134g;
            }
            if (this.f54141n == -1) {
                this.f54141n = c14661g.f54141n;
            }
            if (this.f54142o == null && (alignment2 = c14661g.f54142o) != null) {
                this.f54142o = alignment2;
            }
            if (this.f54143p == null && (alignment = c14661g.f54143p) != null) {
                this.f54143p = alignment;
            }
            if (this.f54144q == -1) {
                this.f54144q = c14661g.f54144q;
            }
            if (this.f54137j == -1) {
                this.f54137j = c14661g.f54137j;
                this.f54138k = c14661g.f54138k;
            }
            if (this.f54145r == null) {
                this.f54145r = c14661g.f54145r;
            }
            if (this.f54146s == Float.MAX_VALUE) {
                this.f54146s = c14661g.f54146s;
            }
            if (!this.f54132e && c14661g.f54132e) {
                this.f54131d = c14661g.f54131d;
                this.f54132e = true;
            }
            if (this.f54140m != -1 || (i13 = c14661g.f54140m) == -1) {
                return;
            }
            this.f54140m = i13;
        }
    }
}
