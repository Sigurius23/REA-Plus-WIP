package qa;

import java.io.EOFException;
import jh3.AbstractC21702c;
import p047c9.C4315f;
import p499t9.C33637j0;
import p499t9.InterfaceC33639k0;
import p516u8.AbstractC34587d0;
import p516u8.C34608o;
import p516u8.C34610p;
import p516u8.InterfaceC34594h;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: qa.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C30108m implements InterfaceC33639k0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC33639k0 f122847a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC30105j f122848b;

    /* JADX INFO: renamed from: g */
    public InterfaceC30107l f122853g;

    /* JADX INFO: renamed from: h */
    public C34610p f122854h;

    /* JADX INFO: renamed from: i */
    public boolean f122855i;

    /* JADX INFO: renamed from: d */
    public int f122850d = 0;

    /* JADX INFO: renamed from: e */
    public int f122851e = 0;

    /* JADX INFO: renamed from: f */
    public byte[] f122852f = AbstractC38065t.f163033c;

    /* JADX INFO: renamed from: c */
    public final C38059n f122849c = new C38059n();

    public C30108m(InterfaceC33639k0 interfaceC33639k0, InterfaceC30105j interfaceC30105j) {
        this.f122847a = interfaceC33639k0;
        this.f122848b = interfaceC30105j;
    }

    @Override // p499t9.InterfaceC33639k0
    /* JADX INFO: renamed from: a */
    public final void mo36173a(C34610p c34610p) {
        c34610p.f145783n.getClass();
        String str = c34610p.f145783n;
        AbstractC35849g.m113802d(AbstractC34587d0.m109376i(str) == 3);
        boolean zEquals = c34610p.equals(this.f122854h);
        InterfaceC30105j interfaceC30105j = this.f122848b;
        if (!zEquals) {
            this.f122854h = c34610p;
            this.f122853g = interfaceC30105j.mo60610g(c34610p) ? interfaceC30105j.mo60611h(c34610p) : null;
        }
        InterfaceC30107l interfaceC30107l = this.f122853g;
        InterfaceC33639k0 interfaceC33639k0 = this.f122847a;
        if (interfaceC30107l == null) {
            interfaceC33639k0.mo36173a(c34610p);
            return;
        }
        C34608o c34608oM109410a = c34610p.m109410a();
        c34608oM109410a.f145741m = AbstractC34587d0.m109382o("application/x-media3-cues");
        c34608oM109410a.f145738j = str;
        c34608oM109410a.f145746r = Long.MAX_VALUE;
        c34608oM109410a.f145725I = interfaceC30105j.mo60612i(c34610p);
        AbstractC21702c.m61152w(c34608oM109410a, interfaceC33639k0);
    }

    @Override // p499t9.InterfaceC33639k0
    /* JADX INFO: renamed from: b */
    public final void mo36174b(long j7, int i13, int i14, int i15, C33637j0 c33637j0) {
        if (this.f122853g == null) {
            this.f122847a.mo36174b(j7, i13, i14, i15, c33637j0);
            return;
        }
        AbstractC35849g.m113803e(c33637j0 == null, "DRM on subtitles is not supported");
        int i16 = (this.f122851e - i15) - i14;
        try {
            this.f122853g.mo91120k(this.f122852f, i16, i14, C30106k.f122844c, new C4315f(this, j7, i13));
        } catch (RuntimeException e5) {
            if (!this.f122855i) {
                throw e5;
            }
            AbstractC38046a.m121827v("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e5);
        }
        int i17 = i16 + i14;
        this.f122850d = i17;
        if (i17 == this.f122851e) {
            this.f122850d = 0;
            this.f122851e = 0;
        }
    }

    @Override // p499t9.InterfaceC33639k0
    /* JADX INFO: renamed from: c */
    public final int mo36175c(InterfaceC34594h interfaceC34594h, int i13, boolean z4) throws EOFException {
        if (this.f122853g == null) {
            return this.f122847a.mo36175c(interfaceC34594h, i13, z4);
        }
        m92228e(i13);
        int i14 = interfaceC34594h.read(this.f122852f, this.f122851e, i13);
        if (i14 != -1) {
            this.f122851e += i14;
            return i14;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p499t9.InterfaceC33639k0
    /* JADX INFO: renamed from: d */
    public final void mo36176d(C38059n c38059n, int i13, int i14) {
        if (this.f122853g == null) {
            this.f122847a.mo36176d(c38059n, i13, i14);
            return;
        }
        m92228e(i13);
        c38059n.m121852e(this.f122852f, this.f122851e, i13);
        this.f122851e += i13;
    }

    /* JADX INFO: renamed from: e */
    public final void m92228e(int i13) {
        int length = this.f122852f.length;
        int i14 = this.f122851e;
        if (length - i14 >= i13) {
            return;
        }
        int i15 = i14 - this.f122850d;
        int iMax = Math.max(i15 * 2, i13 + i15);
        byte[] bArr = this.f122852f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f122850d, bArr2, 0, i15);
        this.f122850d = 0;
        this.f122851e = i15;
        this.f122852f = bArr2;
    }
}
