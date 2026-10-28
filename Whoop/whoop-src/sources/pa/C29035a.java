package pa;

import ba.C2893a;
import p499t9.C33631g0;
import p499t9.C33650s;
import p499t9.InterfaceC33644n;
import p499t9.InterfaceC33646o;
import p499t9.InterfaceC33648q;

/* JADX INFO: renamed from: pa.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C29035a implements InterfaceC33644n {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f117508a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC33644n f117509b;

    public C29035a(int i13, byte b) {
        this.f117508a = i13;
        switch (i13) {
            case 1:
                this.f117509b = new C33631g0(16973, 2, "image/bmp");
                break;
            default:
                this.f117509b = new C33631g0(35152, 2, "image/png");
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m88267a() {
    }

    /* JADX INFO: renamed from: c */
    private final void m88268c() {
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: b */
    public final void mo1540b(long j7, long j13) {
        switch (this.f117508a) {
            case 0:
                ((C33631g0) this.f117509b).mo1540b(j7, j13);
                break;
            case 1:
                ((C33631g0) this.f117509b).mo1540b(j7, j13);
                break;
            default:
                this.f117509b.mo1540b(j7, j13);
                break;
        }
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: g */
    public final void mo1541g(InterfaceC33648q interfaceC33648q) {
        switch (this.f117508a) {
            case 0:
                ((C33631g0) this.f117509b).mo1541g(interfaceC33648q);
                break;
            case 1:
                ((C33631g0) this.f117509b).mo1541g(interfaceC33648q);
                break;
            default:
                this.f117509b.mo1541g(interfaceC33648q);
                break;
        }
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: h */
    public final boolean mo1542h(InterfaceC33646o interfaceC33646o) {
        switch (this.f117508a) {
            case 0:
                return ((C33631g0) this.f117509b).mo1542h(interfaceC33646o);
            case 1:
                return ((C33631g0) this.f117509b).mo1542h(interfaceC33646o);
            default:
                return this.f117509b.mo1542h(interfaceC33646o);
        }
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: i */
    public final int mo1543i(InterfaceC33646o interfaceC33646o, C33650s c33650s) {
        switch (this.f117508a) {
            case 0:
                return ((C33631g0) this.f117509b).mo1543i(interfaceC33646o, c33650s);
            case 1:
                return ((C33631g0) this.f117509b).mo1543i(interfaceC33646o, c33650s);
            default:
                return this.f117509b.mo1543i(interfaceC33646o, c33650s);
        }
    }

    @Override // p499t9.InterfaceC33644n
    public final void release() {
        switch (this.f117508a) {
            case 0:
            case 1:
                break;
            default:
                this.f117509b.release();
                break;
        }
    }

    public C29035a(int i13) {
        this.f117508a = 2;
        if ((i13 & 1) != 0) {
            this.f117509b = new C33631g0(65496, 2, "image/jpeg");
        } else {
            this.f117509b = new C2893a();
        }
    }
}
