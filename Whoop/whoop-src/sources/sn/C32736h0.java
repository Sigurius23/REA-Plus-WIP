package sn;

import android.net.Uri;
import cn.C4842d;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import mn.C25705c;
import p031b9.C2852m1;
import p097ds.AbstractC12313p;
import p284ko.C22623i0;
import p284ko.C22630n;
import p284ko.InterfaceC22607a0;
import p284ko.InterfaceC22628l;
import p309lo.AbstractC24543a;
import p499t9.C33650s;
import p588wm.C37364f;
import p588wm.InterfaceC37367i;
import q30.C29938w0;

/* JADX INFO: renamed from: sn.h0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32736h0 implements InterfaceC22607a0 {

    /* JADX INFO: renamed from: a */
    public final Uri f136092a;

    /* JADX INFO: renamed from: b */
    public final C22623i0 f136093b;

    /* JADX INFO: renamed from: c */
    public final C29938w0 f136094c;

    /* JADX INFO: renamed from: d */
    public final C32742k0 f136095d;

    /* JADX INFO: renamed from: e */
    public final C2852m1 f136096e;

    /* JADX INFO: renamed from: g */
    public volatile boolean f136098g;

    /* JADX INFO: renamed from: i */
    public long f136100i;

    /* JADX INFO: renamed from: j */
    public C22630n f136101j;

    /* JADX INFO: renamed from: l */
    public C32754q0 f136103l;

    /* JADX INFO: renamed from: m */
    public boolean f136104m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C32742k0 f136105n;

    /* JADX INFO: renamed from: f */
    public final C33650s f136097f = new C33650s();

    /* JADX INFO: renamed from: h */
    public boolean f136099h = true;

    /* JADX INFO: renamed from: k */
    public long f136102k = -1;

    public C32736h0(C32742k0 c32742k0, Uri uri, InterfaceC22628l interfaceC22628l, C29938w0 c29938w0, C32742k0 c32742k1, C2852m1 c2852m1) {
        this.f136105n = c32742k0;
        this.f136092a = uri;
        this.f136093b = new C22623i0(interfaceC22628l);
        this.f136094c = c29938w0;
        this.f136095d = c32742k1;
        this.f136096e = c2852m1;
        C32745m.f136165a.getAndIncrement();
        this.f136101j = m102712a(0L);
    }

    /* JADX INFO: renamed from: a */
    public final C22630n m102712a(long j7) {
        Map map = Collections.EMPTY_MAP;
        Map map2 = C32742k0.f136121l0;
        Uri uri = this.f136092a;
        AbstractC24543a.m71575k(uri, "The uri must be set.");
        return new C22630n(uri, 1, null, map2, j7, -1L, 6);
    }

    @Override // p284ko.InterfaceC22607a0
    /* JADX INFO: renamed from: b */
    public final void mo65549b() {
        InterfaceC22628l c32743l;
        int i13;
        int iMo3075i = 0;
        while (iMo3075i == 0 && !this.f136098g) {
            try {
                long j7 = this.f136097f.f140436a;
                C22630n c22630nM102712a = m102712a(j7);
                this.f136101j = c22630nM102712a;
                long jMo65551z = this.f136093b.mo65551z(c22630nM102712a);
                this.f136102k = jMo65551z;
                if (jMo65551z != -1) {
                    this.f136102k = jMo65551z + j7;
                }
                this.f136105n.f136135Q = C25705c.m75699b(this.f136093b.f88996w.getResponseHeaders());
                C22623i0 c22623i0 = this.f136093b;
                C25705c c25705c = this.f136105n.f136135Q;
                if (c25705c == null || (i13 = c25705c.f101214F) == -1) {
                    c32743l = c22623i0;
                } else {
                    c32743l = new C32743l(c22623i0, i13, this);
                    C32754q0 c32754q0M102716C = this.f136105n.m102716C(new C32740j0(0, true));
                    this.f136103l = c32754q0M102716C;
                    c32754q0M102716C.mo102730a(C32742k0.f136122m0);
                }
                this.f136094c.m91574x(c32743l, this.f136092a, this.f136093b.f88996w.getResponseHeaders(), j7, this.f136102k, this.f136095d);
                if (this.f136105n.f136135Q != null) {
                    InterfaceC37367i interfaceC37367i = (InterfaceC37367i) this.f136094c.f122261y;
                    if (interfaceC37367i instanceof C4842d) {
                        ((C4842d) interfaceC37367i).f20124q = true;
                    }
                }
                if (this.f136099h) {
                    C29938w0 c29938w0 = this.f136094c;
                    long j13 = this.f136100i;
                    InterfaceC37367i interfaceC37367i2 = (InterfaceC37367i) c29938w0.f122261y;
                    interfaceC37367i2.getClass();
                    interfaceC37367i2.mo3071b(j7, j13);
                    this.f136099h = false;
                }
                while (iMo3075i == 0 && !this.f136098g) {
                    try {
                        C2852m1 c2852m1 = this.f136096e;
                        synchronized (c2852m1) {
                            while (!c2852m1.f11320x) {
                                try {
                                    c2852m1.wait();
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        }
                        C29938w0 c29938w1 = this.f136094c;
                        C33650s c33650s = this.f136097f;
                        InterfaceC37367i interfaceC37367i3 = (InterfaceC37367i) c29938w1.f122261y;
                        interfaceC37367i3.getClass();
                        C37364f c37364f = (C37364f) c29938w1.f122262z;
                        c37364f.getClass();
                        iMo3075i = interfaceC37367i3.mo3075i(c37364f, c33650s);
                        C37364f c37364f2 = (C37364f) this.f136094c.f122262z;
                        long j14 = c37364f2 != null ? c37364f2.f159852z : -1L;
                        if (j14 > this.f136105n.f136127I + j7) {
                            C2852m1 c2852m2 = this.f136096e;
                            synchronized (c2852m2) {
                                c2852m2.f11320x = false;
                            }
                            C32742k0 c32742k0 = this.f136105n;
                            c32742k0.f136133O.post(c32742k0.f136132N);
                            j7 = j14;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (iMo3075i == 1) {
                    iMo3075i = 0;
                } else {
                    C37364f c37364f3 = (C37364f) this.f136094c.f122262z;
                    if ((c37364f3 != null ? c37364f3.f159852z : -1L) != -1) {
                        this.f136097f.f140436a = c37364f3 != null ? c37364f3.f159852z : -1L;
                    }
                }
                AbstractC12313p.m34305w(this.f136093b);
            } catch (Throwable th4) {
                if (iMo3075i != 1) {
                    C37364f c37364f4 = (C37364f) this.f136094c.f122262z;
                    if ((c37364f4 != null ? c37364f4.f159852z : -1L) != -1) {
                        this.f136097f.f140436a = c37364f4 != null ? c37364f4.f159852z : -1L;
                    }
                }
                AbstractC12313p.m34305w(this.f136093b);
                throw th4;
            }
        }
    }

    @Override // p284ko.InterfaceC22607a0
    /* JADX INFO: renamed from: c */
    public final void mo65550c() {
        this.f136098g = true;
    }
}
