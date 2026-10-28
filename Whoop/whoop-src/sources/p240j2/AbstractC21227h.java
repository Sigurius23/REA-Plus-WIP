package p240j2;

import p002a0.AbstractC0052t;
import p002a0.C0023g0;

/* JADX INFO: renamed from: j2.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21227h {

    /* JADX INFO: renamed from: a */
    public static final C0023g0 f81051a;

    static {
        C21236q c21236q = C21223d.f81023e;
        int i13 = c21236q.f81018c;
        C21224e c21224e = new C21224e(c21236q, c21236q, 1);
        int i14 = c21236q.f81018c;
        C21231l c21231l = C21223d.f81042x;
        int i15 = (c21231l.f81018c << 6) | i14;
        C21226g c21226g = new C21226g(c21236q, c21231l, 0);
        int i16 = (i14 << 6) | c21231l.f81018c;
        C21226g c21226g2 = new C21226g(c21231l, c21236q, 0);
        C0023g0 c0023g0 = AbstractC0052t.f161a;
        C0023g0 c0023g1 = new C0023g0();
        c0023g1.m51h(i13 | (i13 << 6), c21224e);
        c0023g1.m51h(i15, c21226g);
        c0023g1.m51h(i16, c21226g2);
        f81051a = c0023g1;
    }
}
