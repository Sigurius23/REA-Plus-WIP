package p002a0;

/* JADX INFO: renamed from: a0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0007b extends AbstractC0038m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f19E;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f20z = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0007b(C0025h c0025h) {
        super(c0025h.f61y);
        this.f19E = c0025h;
    }

    @Override // p002a0.AbstractC0038m
    /* JADX INFO: renamed from: a */
    public final Object mo9a(int i13) {
        switch (this.f20z) {
            case 0:
                return ((C0022g) this.f19E).m38g(i13);
            default:
                return ((C0025h) this.f19E).f60x[i13];
        }
    }

    @Override // p002a0.AbstractC0038m
    /* JADX INFO: renamed from: b */
    public final void mo10b(int i13) {
        switch (this.f20z) {
            case 0:
                ((C0022g) this.f19E).mo40i(i13);
                break;
            default:
                ((C0025h) this.f19E).m60a(i13);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0007b(C0022g c0022g) {
        super(c0022g.f50y);
        this.f19E = c0022g;
    }
}
