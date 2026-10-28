package xe3;

import af3.AbstractC0822a;
import af3.AbstractC0842r;
import af3.C0843s;
import af3.C0847w;
import cf3.AbstractC4545a;
import p188ha.C17039h;

/* JADX INFO: renamed from: xe3.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C38252o extends AbstractC4545a {

    /* JADX INFO: renamed from: a */
    public final C0843s f164016a = new C0843s();

    /* JADX INFO: renamed from: b */
    public final int f164017b;

    /* JADX INFO: renamed from: c */
    public boolean f164018c;

    public C38252o(int i13) {
        this.f164017b = i13;
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: c */
    public final boolean mo14223c(AbstractC0822a abstractC0822a) {
        if (!this.f164018c) {
            return true;
        }
        AbstractC0822a abstractC0822a2 = (AbstractC0822a) this.f164016a.f3038a;
        if (!(abstractC0822a2 instanceof AbstractC0842r)) {
            return true;
        }
        ((AbstractC0842r) abstractC0822a2).f3037g = false;
        return true;
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: f */
    public final AbstractC0822a mo14226f() {
        return this.f164016a;
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: g */
    public final boolean mo14227g() {
        return true;
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: i */
    public final C17039h mo14229i(C38244g c38244g) {
        if (c38244g.f163973i) {
            if (this.f164016a.f3039b == null) {
                return null;
            }
            AbstractC0822a abstractC0822aMo14226f = c38244g.m122578h().mo14226f();
            this.f164018c = (abstractC0822aMo14226f instanceof C0847w) || (abstractC0822aMo14226f instanceof C0843s);
            return C17039h.m48099a(c38244g.f163970f);
        }
        int i13 = c38244g.f163972h;
        int i14 = this.f164017b;
        if (i13 >= i14) {
            return new C17039h(-1, c38244g.f163968d + i14, false);
        }
        return null;
    }
}
