package p011aa;

import java.io.EOFException;
import java.io.InterruptedIOException;
import p499t9.C33631g0;
import p499t9.C33638k;
import p499t9.C33650s;
import p499t9.InterfaceC33644n;
import p499t9.InterfaceC33646o;
import p499t9.InterfaceC33648q;
import p607x8.C38059n;

/* JADX INFO: renamed from: aa.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C0590a implements InterfaceC33644n {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2098a;

    /* JADX INFO: renamed from: b */
    public final C38059n f2099b;

    /* JADX INFO: renamed from: c */
    public final C33631g0 f2100c;

    public C0590a(int i13) {
        this.f2098a = i13;
        switch (i13) {
            case 1:
                this.f2099b = new C38059n(4);
                this.f2100c = new C33631g0(-1, -1, "image/webp");
                break;
            case 2:
                this.f2099b = new C38059n(4);
                this.f2100c = new C33631g0(-1, -1, "image/avif");
                break;
            default:
                this.f2099b = new C38059n(4);
                this.f2100c = new C33631g0(-1, -1, "image/heif");
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m1537a() {
    }

    /* JADX INFO: renamed from: c */
    private final void m1538c() {
    }

    /* JADX INFO: renamed from: d */
    private final void m1539d() {
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: b */
    public final void mo1540b(long j7, long j13) {
        switch (this.f2098a) {
            case 0:
                this.f2100c.mo1540b(j7, j13);
                break;
            case 1:
                this.f2100c.mo1540b(j7, j13);
                break;
            default:
                this.f2100c.mo1540b(j7, j13);
                break;
        }
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: g */
    public final void mo1541g(InterfaceC33648q interfaceC33648q) {
        switch (this.f2098a) {
            case 0:
                this.f2100c.mo1541g(interfaceC33648q);
                break;
            case 1:
                this.f2100c.mo1541g(interfaceC33648q);
                break;
            default:
                this.f2100c.mo1541g(interfaceC33648q);
                break;
        }
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: h */
    public final boolean mo1542h(InterfaceC33646o interfaceC33646o) throws EOFException, InterruptedIOException {
        switch (this.f2098a) {
            case 0:
                C33638k c33638k = (C33638k) interfaceC33646o;
                c33638k.mo3078C(4, false);
                C38059n c38059n = this.f2099b;
                c38059n.m121843C(4);
                c33638k.mo3092c(c38059n.f163017a, 0, 4, false);
                if (c38059n.m121869v() != 1718909296) {
                    return false;
                }
                c38059n.m121843C(4);
                c33638k.mo3092c(c38059n.f163017a, 0, 4, false);
                return c38059n.m121869v() == ((long) 1751476579);
            case 1:
                C38059n c38059n2 = this.f2099b;
                c38059n2.m121843C(4);
                C33638k c33638k2 = (C33638k) interfaceC33646o;
                c33638k2.mo3092c(c38059n2.f163017a, 0, 4, false);
                if (c38059n2.m121869v() != 1380533830) {
                    return false;
                }
                c33638k2.mo3078C(4, false);
                c38059n2.m121843C(4);
                c33638k2.mo3092c(c38059n2.f163017a, 0, 4, false);
                return c38059n2.m121869v() == 1464156752;
            default:
                C33638k c33638k3 = (C33638k) interfaceC33646o;
                c33638k3.mo3078C(4, false);
                C38059n c38059n3 = this.f2099b;
                c38059n3.m121843C(4);
                c33638k3.mo3092c(c38059n3.f163017a, 0, 4, false);
                if (c38059n3.m121869v() != 1718909296) {
                    return false;
                }
                c38059n3.m121843C(4);
                c33638k3.mo3092c(c38059n3.f163017a, 0, 4, false);
                return c38059n3.m121869v() == ((long) 1635150182);
        }
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: i */
    public final int mo1543i(InterfaceC33646o interfaceC33646o, C33650s c33650s) {
        switch (this.f2098a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f2100c.mo1543i(interfaceC33646o, c33650s);
    }

    @Override // p499t9.InterfaceC33644n
    public final void release() {
        int i13 = this.f2098a;
    }
}
