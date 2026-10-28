package p426qi;

import dj.AbstractC12062g;
import dj.ChoreographerFrameCallbackC12060e;

/* JADX INFO: renamed from: qi.p */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C30395p implements InterfaceC30401v {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f124717a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30402w f124718b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f124719c;

    public /* synthetic */ C30395p(C30402w c30402w, float f13, int i13) {
        this.f124717a = i13;
        this.f124718b = c30402w;
        this.f124719c = f13;
    }

    @Override // p426qi.InterfaceC30401v
    public final void run() {
        switch (this.f124717a) {
            case 0:
                C30402w c30402w = this.f124718b;
                C30387i c30387i = c30402w.f124769w;
                float f13 = this.f124719c;
                if (c30387i != null) {
                    ChoreographerFrameCallbackC12060e choreographerFrameCallbackC12060e = c30402w.f124770x;
                    choreographerFrameCallbackC12060e.m33249i(choreographerFrameCallbackC12060e.f39992J, AbstractC12062g.m33256f(c30387i.f124692l, c30387i.f124693m, f13));
                } else {
                    c30402w.f124732F.add(new C30395p(c30402w, f13, 0));
                }
                break;
            default:
                C30402w c30402w2 = this.f124718b;
                C30387i c30387i2 = c30402w2.f124769w;
                float f14 = this.f124719c;
                if (c30387i2 != null) {
                    c30402w2.m92894u((int) AbstractC12062g.m33256f(c30387i2.f124692l, c30387i2.f124693m, f14));
                } else {
                    c30402w2.f124732F.add(new C30395p(c30402w2, f14, 1));
                }
                break;
        }
    }
}
