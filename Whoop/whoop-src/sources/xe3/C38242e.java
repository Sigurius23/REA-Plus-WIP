package xe3;

import af3.AbstractC0822a;
import af3.C0825b0;
import af3.C0831g;
import bf3.C3205d;
import cf3.AbstractC4545a;
import p188ha.C17039h;

/* JADX INFO: renamed from: xe3.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C38242e extends AbstractC4545a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f163959a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0822a f163960b;

    public C38242e(int i13) {
        this.f163959a = i13;
        switch (i13) {
            case 1:
                this.f163960b = new C0825b0();
                break;
            default:
                this.f163960b = new C0831g();
                break;
        }
    }

    /* JADX INFO: renamed from: j */
    private final void m122570j(C3205d c3205d) {
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: a */
    public void mo14221a(C3205d c3205d) {
        int i13 = this.f163959a;
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: c */
    public boolean mo14223c(AbstractC0822a abstractC0822a) {
        switch (this.f163959a) {
            case 0:
                return true;
            default:
                return super.mo14223c(abstractC0822a);
        }
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: f */
    public final AbstractC0822a mo14226f() {
        switch (this.f163959a) {
            case 0:
                return (C0831g) this.f163960b;
            default:
                return (C0825b0) this.f163960b;
        }
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: g */
    public boolean mo14227g() {
        switch (this.f163959a) {
            case 0:
                return true;
            default:
                return super.mo14227g();
        }
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: i */
    public final C17039h mo14229i(C38244g c38244g) {
        switch (this.f163959a) {
            case 0:
                return C17039h.m48099a(c38244g.f163967c);
            default:
                return null;
        }
    }
}
