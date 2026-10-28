package p123en;

import ai.C0902h;
import com.google.android.exoplayer2.ParserException;
import ed3.C13117a;
import ed3.C13131o;
import io.sentry.internal.debugmeta.C20378c;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import kr.C22786e;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p465rm.C31521c0;
import p499t9.C33650s;
import p588wm.C37364f;
import p588wm.InterfaceC37367i;
import p588wm.InterfaceC37368j;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37374p;
import p588wm.InterfaceC37377s;
import s40.AbstractC32145e0;

/* JADX INFO: renamed from: en.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C13357d implements InterfaceC37367i {

    /* JADX INFO: renamed from: a */
    public InterfaceC37369k f46684a;

    /* JADX INFO: renamed from: b */
    public AbstractC13361h f46685b;

    /* JADX INFO: renamed from: c */
    public boolean f46686c;

    /* JADX INFO: renamed from: a */
    public final boolean m37616a(InterfaceC37368j interfaceC37368j) {
        boolean zM100104k;
        C13358e c13358e = new C13358e(0);
        if (c13358e.m37618b(interfaceC37368j, true) && (c13358e.f46687a & 2) == 2) {
            int iMin = Math.min(c13358e.f46691e, 8);
            C13117a c13117a = new C13117a(iMin);
            interfaceC37368j.mo3103p(c13117a.f45381a, 0, iMin);
            c13117a.m36689K(0);
            if (c13117a.m36692a() >= 5 && c13117a.m36715y() == 127 && c13117a.m36716z() == 1179402563) {
                this.f46685b = new C13356c(0);
                return true;
            }
            c13117a.m36689K(0);
            try {
                zM100104k = AbstractC32145e0.m100104k(1, c13117a, true);
            } catch (ParserException unused) {
                zM100104k = false;
            }
            if (zM100104k) {
                this.f46685b = new C13362i(0);
            } else {
                c13117a.m36689K(0);
                if (C13360g.m37621g(c13117a, C13360g.f46694o)) {
                    this.f46685b = new C13360g(0);
                }
            }
            return true;
        }
        return false;
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: b */
    public final void mo3071b(long j7, long j13) {
        AbstractC13361h abstractC13361h = this.f46685b;
        if (abstractC13361h != null) {
            C13131o c13131o = (C13131o) abstractC13361h.f46705j;
            C13358e c13358e = (C13358e) c13131o.f45424e;
            c13358e.f46687a = 0;
            c13358e.f46688b = 0L;
            c13358e.f46689c = 0;
            c13358e.f46690d = 0;
            c13358e.f46691e = 0;
            ((C13117a) c13131o.f45425f).m36686H(0);
            c13131o.f45421b = -1;
            c13131o.f45423d = false;
            if (j7 == 0) {
                abstractC13361h.mo37615f(!abstractC13361h.f46703h);
                return;
            }
            if (abstractC13361h.f46700e != 0) {
                long j14 = (((long) abstractC13361h.f46701f) * j13) / 1000000;
                abstractC13361h.f46697b = j14;
                InterfaceC13359f interfaceC13359f = (InterfaceC13359f) abstractC13361h.f46708m;
                int i13 = AbstractC24567y.f95875a;
                interfaceC13359f.mo2200e(j14);
                abstractC13361h.f46700e = 2;
            }
        }
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: g */
    public final boolean mo3073g(InterfaceC37368j interfaceC37368j) {
        try {
            return m37616a(interfaceC37368j);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: h */
    public final void mo3074h(InterfaceC37369k interfaceC37369k) {
        this.f46684a = interfaceC37369k;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x018c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x018d  */
    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: i */
    public final int mo3075i(InterfaceC37368j interfaceC37368j, C33650s c33650s) throws ParserException, EOFException, InterruptedIOException {
        byte[] bArr;
        AbstractC24543a.m71574j(this.f46684a);
        if (this.f46685b == null) {
            if (!m37616a(interfaceC37368j)) {
                throw ParserException.m15562a(null, "Failed to determine bitstream type");
            }
            ((C37364f) interfaceC37368j).f159847F = 0;
        }
        if (!this.f46686c) {
            InterfaceC37377s interfaceC37377sMo3102o = this.f46684a.mo3102o(0, 1);
            this.f46684a.mo3098l();
            AbstractC13361h abstractC13361h = this.f46685b;
            abstractC13361h.f46707l = this.f46684a;
            abstractC13361h.f46706k = interfaceC37377sMo3102o;
            abstractC13361h.mo37615f(true);
            this.f46686c = true;
        }
        AbstractC13361h abstractC13361h2 = this.f46685b;
        C13131o c13131o = (C13131o) abstractC13361h2.f46705j;
        AbstractC24543a.m71574j((InterfaceC37377s) abstractC13361h2.f46706k);
        int i13 = AbstractC24567y.f95875a;
        int i14 = abstractC13361h2.f46700e;
        long j7 = -1;
        if (i14 != 0) {
            if (i14 == 1) {
                ((C37364f) interfaceC37368j).mo3100n((int) abstractC13361h2.f46698c);
                abstractC13361h2.f46700e = 2;
                return 0;
            }
            if (i14 != 2) {
                if (i14 == 3) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            long jMo2204k = ((InterfaceC13359f) abstractC13361h2.f46708m).mo2204k(interfaceC37368j);
            if (jMo2204k >= 0) {
                c33650s.f140436a = jMo2204k;
                return 1;
            }
            if (jMo2204k < -1) {
                abstractC13361h2.mo37622a(-(jMo2204k + 2));
            }
            if (!abstractC13361h2.f46703h) {
                InterfaceC37374p interfaceC37374pMo2199d = ((InterfaceC13359f) abstractC13361h2.f46708m).mo2199d();
                AbstractC24543a.m71574j(interfaceC37374pMo2199d);
                ((InterfaceC37369k) abstractC13361h2.f46707l).mo3111x(interfaceC37374pMo2199d);
                abstractC13361h2.f46703h = true;
            }
            if (abstractC13361h2.f46702g <= 0 && !c13131o.m36747h(interfaceC37368j)) {
                abstractC13361h2.f46700e = 3;
                return -1;
            }
            abstractC13361h2.f46702g = 0L;
            C13117a c13117a = (C13117a) c13131o.f45425f;
            long jMo37613b = abstractC13361h2.mo37613b(c13117a);
            if (jMo37613b >= 0) {
                long j13 = abstractC13361h2.f46699d;
                if (j13 + jMo37613b >= abstractC13361h2.f46697b) {
                    long j14 = (j13 * 1000000) / ((long) abstractC13361h2.f46701f);
                    ((InterfaceC37377s) abstractC13361h2.f46706k).mo102732c(c13117a.f45383c, c13117a);
                    ((InterfaceC37377s) abstractC13361h2.f46706k).mo102733d(j14, 1, c13117a.f45383c, 0, null);
                    abstractC13361h2.f46697b = -1L;
                }
            }
            abstractC13361h2.f46699d += jMo37613b;
            return 0;
        }
        while (true) {
            boolean zM36747h = c13131o.m36747h(interfaceC37368j);
            C13117a c13117a2 = (C13117a) c13131o.f45425f;
            if (!zM36747h) {
                abstractC13361h2.f46700e = 3;
                return -1;
            }
            long j15 = ((C37364f) interfaceC37368j).f159852z;
            long j16 = j7;
            long j17 = abstractC13361h2.f46698c;
            abstractC13361h2.f46702g = j15 - j17;
            if (!abstractC13361h2.mo37614d(c13117a2, j17, (C20378c) abstractC13361h2.f46709n)) {
                C31521c0 c31521c0 = (C31521c0) ((C20378c) abstractC13361h2.f46709n).f76422x;
                abstractC13361h2.f46701f = c31521c0.f130091Z;
                if (!abstractC13361h2.f46704i) {
                    ((InterfaceC37377s) abstractC13361h2.f46706k).mo102730a(c31521c0);
                    abstractC13361h2.f46704i = true;
                }
                C0902h c0902h = (C0902h) ((C20378c) abstractC13361h2.f46709n).f76423y;
                if (c0902h == null) {
                    long j18 = ((C37364f) interfaceC37368j).f159851y;
                    if (j18 == j16) {
                        abstractC13361h2.f46708m = new C22786e(27);
                    } else {
                        C13358e c13358e = (C13358e) c13131o.f45424e;
                        abstractC13361h2.f46708m = new C13355b(abstractC13361h2, abstractC13361h2.f46698c, j18, c13358e.f46690d + c13358e.f46691e, c13358e.f46688b, (c13358e.f46687a & 4) != 0);
                    }
                    abstractC13361h2.f46700e = 2;
                    bArr = c13117a2.f45381a;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    c13117a2.m36687I(c13117a2.f45383c, Arrays.copyOf(bArr, Math.max(65025, c13117a2.f45383c)));
                    return 0;
                }
                abstractC13361h2.f46708m = c0902h;
                abstractC13361h2.f46700e = 2;
                bArr = c13117a2.f45381a;
                if (bArr.length == 65025) {
                    return 0;
                }
                c13117a2.m36687I(c13117a2.f45383c, Arrays.copyOf(bArr, Math.max(65025, c13117a2.f45383c)));
                return 0;
            }
            abstractC13361h2.f46698c = ((C37364f) interfaceC37368j).f159852z;
            j7 = j16;
        }
    }

    @Override // p588wm.InterfaceC37367i
    public final void release() {
    }
}
