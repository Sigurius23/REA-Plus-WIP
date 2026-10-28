package bd3;

import ad3.AbstractC0757c;

/* JADX INFO: renamed from: bd3.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C3135n extends C3130k {

    /* JADX INFO: renamed from: d */
    public final AbstractC0757c f12290d;

    /* JADX INFO: renamed from: e */
    public int f12291e;

    public C3135n(C3143v c3143v, AbstractC0757c abstractC0757c) {
        super(c3143v);
        this.f12290d = abstractC0757c;
    }

    @Override // bd3.C3130k
    /* JADX INFO: renamed from: a */
    public final void mo8990a() {
        this.f12276b = true;
        this.f12291e++;
    }

    @Override // bd3.C3130k
    /* JADX INFO: renamed from: b */
    public final void mo8991b() {
        this.f12276b = false;
        m8999j("\n");
        int i13 = this.f12291e;
        for (int i14 = 0; i14 < i13; i14++) {
            m8999j(this.f12290d.f2763a.f2795g);
        }
    }

    @Override // bd3.C3130k
    /* JADX INFO: renamed from: c */
    public final void mo8992c() {
        if (this.f12276b) {
            this.f12276b = false;
        } else {
            mo8991b();
        }
    }

    @Override // bd3.C3130k
    /* JADX INFO: renamed from: n */
    public final void mo9003n() {
        m8996g(' ');
    }

    @Override // bd3.C3130k
    /* JADX INFO: renamed from: o */
    public final void mo9004o() {
        this.f12291e--;
    }
}
