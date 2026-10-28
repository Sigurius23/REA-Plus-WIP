package p333n4;

/* JADX INFO: renamed from: n4.h */
/* JADX INFO: loaded from: classes5.dex */
public class C26252h extends C26251g {

    /* JADX INFO: renamed from: m */
    public int f104392m;

    public C26252h(AbstractC26260p abstractC26260p) {
        super(abstractC26260p);
        if (abstractC26260p instanceof C26256l) {
            this.f104384e = 2;
        } else {
            this.f104384e = 3;
        }
    }

    @Override // p333n4.C26251g
    /* JADX INFO: renamed from: d */
    public final void mo77918d(int i13) {
        if (this.f104389j) {
            return;
        }
        this.f104389j = true;
        this.f104386g = i13;
        for (InterfaceC26249e interfaceC26249e : this.f104390k) {
            interfaceC26249e.mo77901a(interfaceC26249e);
        }
    }
}
