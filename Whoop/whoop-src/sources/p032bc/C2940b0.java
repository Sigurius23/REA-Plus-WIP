package p032bc;

/* JADX INFO: renamed from: bc.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2940b0 extends AbstractC2975x {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11827a;

    /* JADX INFO: renamed from: b */
    public AbstractC2974w f11828b;

    public /* synthetic */ C2940b0() {
        this.f11827a = 1;
    }

    @Override // p032bc.AbstractC2975x, p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: b */
    public void mo8571b(AbstractC2974w abstractC2974w) {
        switch (this.f11827a) {
            case 1:
                C2942c0 c2942c0 = (C2942c0) this.f11828b;
                if (!c2942c0.f11832h0) {
                    c2942c0.m8645N();
                    c2942c0.f11832h0 = true;
                }
                break;
        }
    }

    @Override // p032bc.AbstractC2975x, p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: c */
    public void mo8572c(AbstractC2974w abstractC2974w) {
        switch (this.f11827a) {
            case 1:
                C2942c0 c2942c0 = (C2942c0) this.f11828b;
                int i13 = c2942c0.f11831g0 - 1;
                c2942c0.f11831g0 = i13;
                if (i13 == 0) {
                    c2942c0.f11832h0 = false;
                    c2942c0.m8650n();
                }
                abstractC2974w.mo8576C(this);
                break;
            case 2:
                this.f11828b.mo8579F();
                abstractC2974w.mo8576C(this);
                break;
        }
    }

    @Override // p032bc.AbstractC2975x, p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: d */
    public void mo8573d(AbstractC2974w abstractC2974w) {
        switch (this.f11827a) {
            case 0:
                C2942c0 c2942c0 = (C2942c0) this.f11828b;
                c2942c0.f11829e0.remove(abstractC2974w);
                if (!c2942c0.mo8598u()) {
                    c2942c0.m8655z(c2942c0, InterfaceC2973v.f11904d, false);
                    c2942c0.f11924R = true;
                    c2942c0.m8655z(c2942c0, InterfaceC2973v.f11903c, false);
                }
                break;
        }
    }

    public /* synthetic */ C2940b0(AbstractC2974w abstractC2974w, int i13) {
        this.f11827a = i13;
        this.f11828b = abstractC2974w;
    }
}
