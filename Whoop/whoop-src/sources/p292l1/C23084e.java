package p292l1;

import l83.C23454a0;
import p208i2.AbstractC17918w0;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p316m1.C24902g;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l1.e */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C23084e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91098w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C23196w3 f91099x;

    public /* synthetic */ C23084e(C23196w3 c23196w3, int i13) {
        this.f91098w = i13;
        this.f91099x = c23196w3;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        InterfaceC17886g0 interfaceC17886g0 = (InterfaceC17886g0) obj;
        switch (this.f91098w) {
            case 0:
                C24902g c24902g = this.f91099x.f91787e;
                float fM87022x = c24902g.f97550j.m87022x();
                float fM72992c = c24902g.m73008d().m72992c();
                float f13 = fM87022x < fM72992c ? fM72992c - fM87022x : 0.0f;
                if (f13 > 0.0f) {
                    C17920x0 c17920x0 = (C17920x0) interfaceC17886g0;
                    fIntBitsToFloat = (Float.intBitsToFloat((int) (c17920x0.f69653R & 4294967295L)) + f13) / Float.intBitsToFloat((int) (c17920x0.f69653R & 4294967295L));
                } else {
                    fIntBitsToFloat = 1.0f;
                }
                C17920x0 c17920x1 = (C17920x0) interfaceC17886g0;
                c17920x1.m51561r(fIntBitsToFloat);
                c17920x1.m51565y(AbstractC17918w0.m51524l(0.5f, 0.0f));
                break;
            default:
                C24902g c24902g2 = this.f91099x.f91787e;
                float fM87022x2 = c24902g2.f97550j.m87022x();
                float fM72992c2 = c24902g2.m73008d().m72992c();
                float f14 = fM87022x2 < fM72992c2 ? fM72992c2 - fM87022x2 : 0.0f;
                if (f14 > 0.0f) {
                    C17920x0 c17920x2 = (C17920x0) interfaceC17886g0;
                    fIntBitsToFloat2 = 1 / ((Float.intBitsToFloat((int) (c17920x2.f69653R & 4294967295L)) + f14) / Float.intBitsToFloat((int) (c17920x2.f69653R & 4294967295L)));
                } else {
                    fIntBitsToFloat2 = 1.0f;
                }
                C17920x0 c17920x3 = (C17920x0) interfaceC17886g0;
                c17920x3.m51561r(fIntBitsToFloat2);
                c17920x3.m51565y(AbstractC17918w0.m51524l(0.5f, 0.0f));
                break;
        }
        return C23454a0.f92919a;
    }
}
