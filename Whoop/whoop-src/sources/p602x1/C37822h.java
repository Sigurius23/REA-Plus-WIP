package p602x1;

import android.os.Trace;
import c93.InterfaceC4339a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p002a0.AbstractC0018e1;
import p002a0.C0057v0;
import p002a0.C0059w0;
import p004a2.C0154c;
import p390p1.C28594a2;
import p390p1.InterfaceC28691z1;
import p446r1.C30849c;

/* JADX INFO: renamed from: x1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C37822h {

    /* JADX INFO: renamed from: a */
    public Set f161968a;

    /* JADX INFO: renamed from: b */
    public C0154c f161969b;

    /* JADX INFO: renamed from: c */
    public final C30849c f161970c;

    /* JADX INFO: renamed from: d */
    public C0059w0 f161971d;

    /* JADX INFO: renamed from: e */
    public C30849c f161972e;

    /* JADX INFO: renamed from: f */
    public final C30849c f161973f;

    /* JADX INFO: renamed from: g */
    public final C30849c f161974g;

    /* JADX INFO: renamed from: h */
    public C0059w0 f161975h;

    /* JADX INFO: renamed from: i */
    public C0057v0 f161976i;

    /* JADX INFO: renamed from: j */
    public ArrayList f161977j;

    /* JADX INFO: renamed from: k */
    public C0059w0 f161978k;

    public C37822h() {
        C30849c c30849c = new C30849c(new C28594a2[16]);
        this.f161970c = c30849c;
        C0059w0 c0059w0 = AbstractC0018e1.f44a;
        this.f161971d = new C0059w0();
        this.f161972e = c30849c;
        this.f161973f = new C30849c(new Object[16]);
        this.f161974g = new C30849c(new InterfaceC4339a[16]);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m121349f(C28594a2 c28594a2, C30849c c30849c) {
        Object[] objArr = c30849c.f127227w;
        int i13 = c30849c.f127229y;
        for (int i14 = 0; i14 < i13; i14++) {
            InterfaceC28691z1 interfaceC28691z1 = ((C28594a2) objArr[i14]).f115707a;
            if (interfaceC28691z1 instanceof C37819e) {
                C30849c c30849cM121346b = ((C37819e) interfaceC28691z1).m121346b();
                if (c30849cM121346b.m94893k(c28594a2) || m121349f(c28594a2, c30849cM121346b)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m121350a() {
        this.f161968a = null;
        this.f161969b = null;
        C30849c c30849c = this.f161970c;
        c30849c.m94890g();
        this.f161971d.m137b();
        this.f161972e = c30849c;
        this.f161973f.m94890g();
        this.f161974g.m94890g();
        this.f161975h = null;
        this.f161976i = null;
        this.f161977j = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m121351b() {
        Set set = this.f161968a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                InterfaceC28691z1 interfaceC28691z1 = (InterfaceC28691z1) it.next();
                it.remove();
                interfaceC28691z1.mo15503c();
            }
            Trace.endSection();
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005d */
    /* JADX WARN: Bottom block not found for handler: all -> 0x00a0 */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m121352c() {
        /*
            r6 = this;
            java.util.Set r0 = r6.f161968a
            if (r0 != 0) goto L6
            goto La5
        L6:
            r1 = 0
            r6.f161978k = r1
            r1.c r1 = r6.f161973f
            int r2 = r1.f127229y
            if (r2 == 0) goto L67
            java.lang.String r2 = "Compose:onForgotten"
            android.os.Trace.beginSection(r2)
            a0.w0 r2 = r6.f161975h     // Catch: java.lang.Throwable -> L5d
            int r3 = r1.f127229y     // Catch: java.lang.Throwable -> L5d
            int r3 = r3 + (-1)
        L1a:
            r4 = -1
            if (r4 >= r3) goto L5f
            java.lang.Object[] r4 = r1.f127227w     // Catch: java.lang.Throwable -> L5d
            r4 = r4[r3]     // Catch: java.lang.Throwable -> L5d
            boolean r5 = r4 instanceof p390p1.C28594a2     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L33
            r5 = r4
            p1.a2 r5 = (p390p1.C28594a2) r5     // Catch: java.lang.Throwable -> L31
            p1.z1 r5 = r5.f115707a     // Catch: java.lang.Throwable -> L31
            r0.remove(r5)     // Catch: java.lang.Throwable -> L31
            r5.mo15504d()     // Catch: java.lang.Throwable -> L31
            goto L33
        L31:
            r0 = move-exception
            goto L4f
        L33:
            boolean r5 = r4 instanceof p390p1.InterfaceC28623i     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L4c
            if (r2 == 0) goto L46
            boolean r5 = r2.m138c(r4)     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L46
            r5 = r4
            p1.i r5 = (p390p1.InterfaceC28623i) r5     // Catch: java.lang.Throwable -> L31
            r5.mo617f()     // Catch: java.lang.Throwable -> L31
            goto L4c
        L46:
            r5 = r4
            p1.i r5 = (p390p1.InterfaceC28623i) r5     // Catch: java.lang.Throwable -> L31
            r5.mo608a()     // Catch: java.lang.Throwable -> L31
        L4c:
            int r3 = r3 + (-1)
            goto L1a
        L4f:
            a2.c r1 = r6.f161969b     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L5c
            i r2 = new i     // Catch: java.lang.Throwable -> L5d
            r3 = 2
            r2.<init>(r3, r1, r4)     // Catch: java.lang.Throwable -> L5d
            p098dt.AbstractC12350b.m34576Y(r0, r2)     // Catch: java.lang.Throwable -> L5d
        L5c:
            throw r0     // Catch: java.lang.Throwable -> L5d
        L5d:
            r0 = move-exception
            goto L63
        L5f:
            android.os.Trace.endSection()
            goto L67
        L63:
            android.os.Trace.endSection()
            throw r0
        L67:
            r1.c r0 = r6.f161970c
            int r1 = r0.f127229y
            if (r1 == 0) goto La5
            java.lang.String r1 = "Compose:onRemembered"
            android.os.Trace.beginSection(r1)
            java.util.Set r1 = r6.f161968a     // Catch: java.lang.Throwable -> La0
            if (r1 != 0) goto L77
            goto L9c
        L77:
            java.lang.Object[] r2 = r0.f127227w     // Catch: java.lang.Throwable -> La0
            int r0 = r0.f127229y     // Catch: java.lang.Throwable -> La0
            r3 = 0
        L7c:
            if (r3 >= r0) goto L9c
            r4 = r2[r3]     // Catch: java.lang.Throwable -> La0
            p1.a2 r4 = (p390p1.C28594a2) r4     // Catch: java.lang.Throwable -> La0
            p1.z1 r5 = r4.f115707a     // Catch: java.lang.Throwable -> La0
            r1.remove(r5)     // Catch: java.lang.Throwable -> La0
            r5.mo15502a()     // Catch: java.lang.Throwable -> L8d
            int r3 = r3 + 1
            goto L7c
        L8d:
            r0 = move-exception
            a2.c r1 = r6.f161969b     // Catch: java.lang.Throwable -> La0
            if (r1 == 0) goto L9b
            i r2 = new i     // Catch: java.lang.Throwable -> La0
            r3 = 2
            r2.<init>(r3, r1, r4)     // Catch: java.lang.Throwable -> La0
            p098dt.AbstractC12350b.m34576Y(r0, r2)     // Catch: java.lang.Throwable -> La0
        L9b:
            throw r0     // Catch: java.lang.Throwable -> La0
        L9c:
            android.os.Trace.endSection()
            return
        La0:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p602x1.C37822h.m121352c():void");
    }

    /* JADX INFO: renamed from: d */
    public final void m121353d() {
        C30849c c30849c = this.f161974g;
        if (c30849c.f127229y != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = c30849c.f127227w;
                int i13 = c30849c.f127229y;
                for (int i14 = 0; i14 < i13; i14++) {
                    ((InterfaceC4339a) objArr[i14]).invoke();
                }
                c30849c.m94890g();
            } finally {
                Trace.endSection();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m121354e(C28594a2 c28594a2) {
        if (this.f161971d.m138c(c28594a2)) {
            this.f161971d.m147l(c28594a2);
            if (!this.f161972e.m94893k(c28594a2)) {
                C30849c c30849c = this.f161970c;
                if (!c30849c.m94893k(c28594a2)) {
                    m121349f(c28594a2, c30849c);
                }
            }
            Set set = this.f161968a;
            if (set == null) {
                return;
            } else {
                set.add(c28594a2.f115707a);
            }
        }
        C0059w0 c0059w0 = this.f161978k;
        if (c0059w0 == null || !c0059w0.m138c(c28594a2)) {
            this.f161973f.m94885b(c28594a2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m121355g(Set set, C0154c c0154c) {
        m121350a();
        this.f161968a = set;
        this.f161969b = c0154c;
    }
}
