package p499t9;

import jh3.AbstractC21702c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p516u8.AbstractC34587d0;
import p516u8.C34608o;
import p607x8.C38059n;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: t9.g0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C33631g0 implements InterfaceC33644n {

    /* JADX INFO: renamed from: a */
    public final int f140373a;

    /* JADX INFO: renamed from: b */
    public final int f140374b;

    /* JADX INFO: renamed from: c */
    public final String f140375c;

    /* JADX INFO: renamed from: d */
    public int f140376d;

    /* JADX INFO: renamed from: e */
    public int f140377e;

    /* JADX INFO: renamed from: f */
    public InterfaceC33648q f140378f;

    /* JADX INFO: renamed from: g */
    public InterfaceC33639k0 f140379g;

    public C33631g0(int i13, int i14, String str) {
        this.f140373a = i13;
        this.f140374b = i14;
        this.f140375c = str;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: b */
    public final void mo1540b(long j7, long j13) {
        if (j7 == 0 || this.f140377e == 1) {
            this.f140377e = 1;
            this.f140376d = 0;
        }
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: g */
    public final void mo1541g(InterfaceC33648q interfaceC33648q) {
        this.f140378f = interfaceC33648q;
        InterfaceC33639k0 interfaceC33639k0Mo3101o = interfaceC33648q.mo3101o(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, 4);
        this.f140379g = interfaceC33639k0Mo3101o;
        C34608o c34608o = new C34608o();
        String str = this.f140375c;
        c34608o.f145740l = AbstractC34587d0.m109382o(str);
        c34608o.f145741m = AbstractC34587d0.m109382o(str);
        AbstractC21702c.m61152w(c34608o, interfaceC33639k0Mo3101o);
        this.f140378f.mo3098l();
        this.f140378f.mo3109v(new C33633h0());
        this.f140377e = 1;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: h */
    public final boolean mo1542h(InterfaceC33646o interfaceC33646o) {
        int i13 = this.f140374b;
        int i14 = this.f140373a;
        AbstractC35849g.m113807i((i14 == -1 || i13 == -1) ? false : true);
        C38059n c38059n = new C38059n(i13);
        ((C33638k) interfaceC33646o).mo3092c(c38059n.f163017a, 0, i13, false);
        return c38059n.m121873z() == i14;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: i */
    public final int mo1543i(InterfaceC33646o interfaceC33646o, C33650s c33650s) {
        int i13 = this.f140377e;
        if (i13 != 1) {
            if (i13 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        InterfaceC33639k0 interfaceC33639k0 = this.f140379g;
        interfaceC33639k0.getClass();
        int iMo36175c = interfaceC33639k0.mo36175c(interfaceC33646o, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, true);
        if (iMo36175c != -1) {
            this.f140376d += iMo36175c;
            return 0;
        }
        this.f140377e = 2;
        this.f140379g.mo36174b(0L, 1, this.f140376d, 0, null);
        this.f140376d = 0;
        return 0;
    }

    @Override // p499t9.InterfaceC33644n
    public final void release() {
    }
}
