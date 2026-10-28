package p272k4;

import p108e4.C12685s;
import p242j4.InterfaceC21308h;
import p319m4.C25016e;
import p319m4.C25020i;

/* JADX INFO: renamed from: k4.g */
/* JADX INFO: loaded from: classes.dex */
public final class C22183g implements InterfaceC22180d, InterfaceC21308h {

    /* JADX INFO: renamed from: a */
    public final C12685s f86052a;

    /* JADX INFO: renamed from: b */
    public int f86053b;

    /* JADX INFO: renamed from: c */
    public C25020i f86054c;

    /* JADX INFO: renamed from: d */
    public int f86055d = -1;

    /* JADX INFO: renamed from: e */
    public int f86056e = -1;

    /* JADX INFO: renamed from: f */
    public float f86057f = 0.0f;

    /* JADX INFO: renamed from: g */
    public String f86058g;

    public C22183g(C12685s c12685s) {
        this.f86052a = c12685s;
    }

    @Override // p242j4.InterfaceC21308h
    /* JADX INFO: renamed from: a */
    public final C25016e mo59809a() {
        if (this.f86054c == null) {
            this.f86054c = new C25020i();
        }
        return this.f86054c;
    }

    @Override // p272k4.InterfaceC22180d, p242j4.InterfaceC21308h
    public final void apply() {
        this.f86054c.m73471W(this.f86053b);
        int i13 = this.f86055d;
        if (i13 != -1) {
            C25020i c25020i = this.f86054c;
            if (i13 <= -1) {
                c25020i.getClass();
                return;
            }
            c25020i.f98015r0 = -1.0f;
            c25020i.f98016s0 = i13;
            c25020i.f98017t0 = -1;
            return;
        }
        int i14 = this.f86056e;
        if (i14 != -1) {
            C25020i c25020i2 = this.f86054c;
            if (i14 <= -1) {
                c25020i2.getClass();
                return;
            }
            c25020i2.f98015r0 = -1.0f;
            c25020i2.f98016s0 = -1;
            c25020i2.f98017t0 = i14;
            return;
        }
        C25020i c25020i3 = this.f86054c;
        float f13 = this.f86057f;
        if (f13 <= -1.0f) {
            c25020i3.getClass();
            return;
        }
        c25020i3.f98015r0 = f13;
        c25020i3.f98016s0 = -1;
        c25020i3.f98017t0 = -1;
    }

    @Override // p242j4.InterfaceC21308h
    /* JADX INFO: renamed from: b */
    public final void mo59810b(C25016e c25016e) {
        if (c25016e instanceof C25020i) {
            this.f86054c = (C25020i) c25016e;
        } else {
            this.f86054c = null;
        }
    }

    @Override // p242j4.InterfaceC21308h
    /* JADX INFO: renamed from: c */
    public final InterfaceC22180d mo59811c() {
        return null;
    }

    @Override // p242j4.InterfaceC21308h
    public final Object getKey() {
        return this.f86058g;
    }
}
