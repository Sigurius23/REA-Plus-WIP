package p362oa;

import ai.C0902h;
import java.util.Arrays;
import p123en.AbstractC13361h;
import p499t9.AbstractC33618a;
import p499t9.C33652u;
import p499t9.C33653v;
import p516u8.AbstractC34587d0;
import p516u8.C34585c0;
import p516u8.C34608o;
import p516u8.C34610p;
import p607x8.C38059n;
import qg3.C30352d;

/* JADX INFO: renamed from: oa.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C27748b extends AbstractC13361h {

    /* JADX INFO: renamed from: o */
    public C33653v f111909o;

    /* JADX INFO: renamed from: p */
    public C0902h f111910p;

    @Override // p123en.AbstractC13361h
    /* JADX INFO: renamed from: c */
    public final long mo37623c(C38059n c38059n) {
        byte[] bArr = c38059n.f163017a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i13 = (bArr[2] & 255) >> 4;
        if (i13 == 6 || i13 == 7) {
            c38059n.m121847G(4);
            c38059n.m121841A();
        }
        int iM106227s = AbstractC33618a.m106227s(i13, c38059n);
        c38059n.m121846F(0);
        return iM106227s;
    }

    @Override // p123en.AbstractC13361h
    /* JADX INFO: renamed from: e */
    public final boolean mo37624e(C38059n c38059n, long j7, C30352d c30352d) {
        byte[] bArr = c38059n.f163017a;
        C33653v c33653v = this.f111909o;
        if (c33653v == null) {
            C33653v c33653v2 = new C33653v(bArr, 17, 0);
            this.f111909o = c33653v2;
            C34608o c34608oM109410a = c33653v2.m106294e(Arrays.copyOfRange(bArr, 9, c38059n.f163019c), null).m109410a();
            c34608oM109410a.f145740l = AbstractC34587d0.m109382o("audio/ogg");
            c30352d.f124535x = new C34610p(c34608oM109410a);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) != 3) {
            if (b != -1) {
                return true;
            }
            C0902h c0902h = this.f111910p;
            if (c0902h != null) {
                c0902h.f3295x = j7;
                c30352d.f124536y = c0902h;
            }
            ((C34610p) c30352d.f124535x).getClass();
            return false;
        }
        C33652u c33652uM106228t = AbstractC33618a.m106228t(c38059n);
        C33653v c33653v3 = new C33653v(c33653v.f140444b, c33653v.f140445c, c33653v.f140446d, c33653v.f140447e, c33653v.f140448f, c33653v.f140450h, c33653v.f140451i, c33653v.f140453k, c33652uM106228t, (C34585c0) c33653v.f140455m);
        this.f111909o = c33653v3;
        C0902h c0902h2 = new C0902h(8);
        c0902h2.f3297z = c33653v3;
        c0902h2.f3293E = c33652uM106228t;
        c0902h2.f3295x = -1L;
        c0902h2.f3296y = -1L;
        this.f111910p = c0902h2;
        return true;
    }

    @Override // p123en.AbstractC13361h
    /* JADX INFO: renamed from: f */
    public final void mo37615f(boolean z4) {
        super.mo37615f(z4);
        if (z4) {
            this.f111909o = null;
            this.f111910p = null;
        }
    }
}
