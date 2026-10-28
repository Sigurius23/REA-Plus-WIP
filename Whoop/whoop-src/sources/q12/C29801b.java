package q12;

import c93.InterfaceC4339a;
import p132f0.C13821r1;
import wr0.AbstractC37535j0;
import zq0.AbstractC40965f;

/* JADX INFO: renamed from: q12.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C29801b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f121840w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f121841x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C13821r1 f121842y;

    public /* synthetic */ C29801b(float f13, C13821r1 c13821r1) {
        this.f121840w = 0;
        this.f121842y = c13821r1;
        this.f121841x = f13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        float fM91316r;
        switch (this.f121840w) {
            case 0:
                fM91316r = AbstractC29803d.m91316r(this.f121842y, this.f121841x);
                break;
            case 1:
                fM91316r = AbstractC37535j0.m120386p(this.f121841x, this.f121842y);
                break;
            default:
                fM91316r = AbstractC40965f.m132932D(this.f121841x, this.f121842y);
                break;
        }
        return Float.valueOf(fM91316r);
    }

    public /* synthetic */ C29801b(float f13, C13821r1 c13821r1, int i13) {
        this.f121840w = i13;
        this.f121841x = f13;
        this.f121842y = c13821r1;
    }
}
