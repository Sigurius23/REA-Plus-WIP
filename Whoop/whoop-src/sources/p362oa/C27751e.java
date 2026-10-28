package p362oa;

import java.util.ArrayList;
import java.util.Arrays;
import p123en.AbstractC13361h;
import p499t9.AbstractC33618a;
import p516u8.AbstractC34587d0;
import p516u8.C34585c0;
import p516u8.C34608o;
import p516u8.C34610p;
import p607x8.C38059n;
import p690zr.AbstractC41023g0;
import qg3.C30352d;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: oa.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C27751e extends AbstractC13361h {

    /* JADX INFO: renamed from: p */
    public static final byte[] f111914p = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: q */
    public static final byte[] f111915q = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: o */
    public boolean f111916o;

    /* JADX INFO: renamed from: g */
    public static boolean m83844g(C38059n c38059n, byte[] bArr) {
        if (c38059n.m121848a() < bArr.length) {
            return false;
        }
        int i13 = c38059n.f163018b;
        byte[] bArr2 = new byte[bArr.length];
        c38059n.m121852e(bArr2, 0, bArr.length);
        c38059n.m121846F(i13);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // p123en.AbstractC13361h
    /* JADX INFO: renamed from: c */
    public final long mo37623c(C38059n c38059n) {
        byte[] bArr = c38059n.f163017a;
        return (((long) this.f46701f) * AbstractC33618a.m106218j(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // p123en.AbstractC13361h
    /* JADX INFO: renamed from: e */
    public final boolean mo37624e(C38059n c38059n, long j7, C30352d c30352d) {
        if (m83844g(c38059n, f111914p)) {
            byte[] bArrCopyOf = Arrays.copyOf(c38059n.f163017a, c38059n.f163019c);
            int i13 = bArrCopyOf[9] & 255;
            ArrayList arrayListM106209a = AbstractC33618a.m106209a(bArrCopyOf);
            if (((C34610p) c30352d.f124535x) == null) {
                C34608o c34608o = new C34608o();
                c34608o.f145740l = AbstractC34587d0.m109382o("audio/ogg");
                c34608o.f145741m = AbstractC34587d0.m109382o("audio/opus");
                c34608o.f145719C = i13;
                c34608o.f145720D = 48000;
                c34608o.f145744p = arrayListM106209a;
                c30352d.f124535x = new C34610p(c34608o);
                return true;
            }
        } else {
            if (!m83844g(c38059n, f111915q)) {
                AbstractC35849g.m113808j((C34610p) c30352d.f124535x);
                return false;
            }
            AbstractC35849g.m113808j((C34610p) c30352d.f124535x);
            if (!this.f111916o) {
                this.f111916o = true;
                c38059n.m121847G(8);
                C34585c0 c34585c0M106225q = AbstractC33618a.m106225q(AbstractC41023g0.m133253n(AbstractC33618a.m106229u(c38059n, false, false).f140425a));
                if (c34585c0M106225q != null) {
                    C34608o c34608oM109410a = ((C34610p) c30352d.f124535x).m109410a();
                    c34608oM109410a.f145739k = c34585c0M106225q.m109366b(((C34610p) c30352d.f124535x).f145781l);
                    c30352d.f124535x = new C34610p(c34608oM109410a);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // p123en.AbstractC13361h
    /* JADX INFO: renamed from: f */
    public final void mo37615f(boolean z4) {
        super.mo37615f(z4);
        if (z4) {
            this.f111916o = false;
        }
    }
}
