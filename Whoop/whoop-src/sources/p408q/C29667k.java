package p408q;

import p184h5.InterfaceC16916u0;
import p474s.C32011t2;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: q.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C29667k extends AbstractC37978j {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f121275d;

    /* JADX INFO: renamed from: e */
    public boolean f121276e;

    /* JADX INFO: renamed from: f */
    public int f121277f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f121278g;

    public C29667k(C29668l c29668l) {
        this.f121275d = 0;
        this.f121278g = c29668l;
        this.f121276e = false;
        this.f121277f = 0;
    }

    @Override // x43.AbstractC37978j, p184h5.InterfaceC16916u0
    /* JADX INFO: renamed from: a */
    public void mo30518a() {
        switch (this.f121275d) {
            case 1:
                this.f121276e = true;
                break;
        }
    }

    @Override // x43.AbstractC37978j, p184h5.InterfaceC16916u0
    /* JADX INFO: renamed from: b */
    public final void mo30519b() {
        switch (this.f121275d) {
            case 0:
                if (!this.f121276e) {
                    this.f121276e = true;
                    InterfaceC16916u0 interfaceC16916u0 = ((C29668l) this.f121278g).f121282d;
                    if (interfaceC16916u0 != null) {
                        interfaceC16916u0.mo30519b();
                    }
                    break;
                }
                break;
            default:
                ((C32011t2) this.f121278g).f132828a.setVisibility(0);
                break;
        }
    }

    @Override // p184h5.InterfaceC16916u0
    /* JADX INFO: renamed from: c */
    public final void mo30520c() {
        switch (this.f121275d) {
            case 0:
                int i13 = this.f121277f + 1;
                this.f121277f = i13;
                C29668l c29668l = (C29668l) this.f121278g;
                if (i13 == c29668l.f121279a.size()) {
                    InterfaceC16916u0 interfaceC16916u0 = c29668l.f121282d;
                    if (interfaceC16916u0 != null) {
                        interfaceC16916u0.mo30520c();
                    }
                    this.f121277f = 0;
                    this.f121276e = false;
                    c29668l.f121283e = false;
                }
                break;
            default:
                if (!this.f121276e) {
                    ((C32011t2) this.f121278g).f132828a.setVisibility(this.f121277f);
                }
                break;
        }
    }

    public C29667k(C32011t2 c32011t2, int i13) {
        this.f121275d = 1;
        this.f121278g = c32011t2;
        this.f121277f = i13;
        this.f121276e = false;
    }
}
