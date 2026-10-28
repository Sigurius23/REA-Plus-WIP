package p163g1;

import p180h0.InterfaceC16392g1;
import p316m1.C24900f;
import p316m1.C24902g;

/* JADX INFO: renamed from: g1.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C15195y implements InterfaceC16392g1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57030a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f57031b;

    public /* synthetic */ C15195y(Object obj, int i13) {
        this.f57030a = i13;
        this.f57031b = obj;
    }

    @Override // p180h0.InterfaceC16392g1
    /* JADX INFO: renamed from: a */
    public final void mo29024a(float f13) {
        switch (this.f57030a) {
            case 0:
                C14947a0 c14947a0 = (C14947a0) this.f57031b;
                C15175w c15175w = c14947a0.f55778o;
                float fM43071f = c14947a0.m43071f(f13);
                C14947a0 c14947a1 = c15175w.f56944a;
                c14947a1.f55773j.m87023y(fM43071f);
                c14947a1.f55775l.m87023y(0.0f);
                break;
            case 1:
                ((C15091n5) this.f57031b).f56502a.invoke(Float.valueOf(f13));
                break;
            default:
                C24902g c24902g = (C24902g) this.f57031b;
                C24900f.m73004a(c24902g.f97554n, c24902g.m73009e(f13));
                break;
        }
    }
}
