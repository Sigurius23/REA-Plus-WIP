package c92;

import bh3.InterfaceC3255b;
import st0.AbstractC32962f;
import td1.EnumC33707e;

/* JADX INFO: renamed from: c92.f */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C4334f implements InterfaceC3255b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17595w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4335g f17596x;

    public /* synthetic */ C4334f(C4335g c4335g, int i13) {
        this.f17595w = i13;
        this.f17596x = c4335g;
    }

    @Override // bh3.InterfaceC3255b
    /* JADX INFO: renamed from: b */
    public final void mo9472b(Object obj) {
        switch (this.f17595w) {
            case 0:
                this.f17596x.m13674U((EnumC33707e) obj);
                break;
            default:
                this.f17596x.m13676W((AbstractC32962f) obj);
                break;
        }
    }
}
