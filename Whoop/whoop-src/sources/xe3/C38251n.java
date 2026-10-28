package xe3;

import af3.AbstractC0822a;
import af3.AbstractC0842r;
import af3.C0843s;
import cf3.AbstractC4545a;
import p188ha.C17039h;

/* JADX INFO: renamed from: xe3.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C38251n extends AbstractC4545a {

    /* JADX INFO: renamed from: a */
    public final AbstractC0842r f164013a;

    /* JADX INFO: renamed from: b */
    public boolean f164014b;

    /* JADX INFO: renamed from: c */
    public int f164015c;

    public C38251n(AbstractC0842r abstractC0842r) {
        this.f164013a = abstractC0842r;
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: c */
    public final boolean mo14223c(AbstractC0822a abstractC0822a) {
        if (!(abstractC0822a instanceof C0843s)) {
            return false;
        }
        if (this.f164014b && this.f164015c == 1) {
            this.f164013a.f3037g = false;
            this.f164014b = false;
        }
        return true;
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: f */
    public final AbstractC0822a mo14226f() {
        return this.f164013a;
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
            this.f164014b = true;
            this.f164015c = 0;
        } else if (this.f164014b) {
            this.f164015c++;
        }
        return C17039h.m48099a(c38244g.f163967c);
    }
}
