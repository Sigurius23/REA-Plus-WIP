package p734sl0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.bot.view.AiConversationFragment;
import nl0.C26804f;
import nl0.C26807i;
import nl0.C26810l;
import p132f0.C13821r1;
import p163g1.C15199y3;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p411q2.InterfaceC29805a;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: sl0.a0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32580a0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f134971w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f134972x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f134973y;

    public /* synthetic */ C32580a0(int i13, Object obj, Object obj2) {
        this.f134971w = i13;
        this.f134972x = obj;
        this.f134973y = obj2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f134971w) {
            case 0:
                return AbstractC32686w.l.m102561l((InterfaceC4339a) this.f134972x, (C32659q) this.f134973y);
            case 1:
                return Float.valueOf(AbstractC32650o0.e.m102090h((InterfaceC28670t2) this.f134972x, (InterfaceC39171c) this.f134973y));
            case 2:
                return AbstractC32619i.m101813E((C26810l) this.f134972x, (InterfaceC4351m) this.f134973y);
            case 3:
                return AbstractC32619i.m101814F((C26810l) this.f134972x, (Function1) this.f134973y);
            case 4:
                return AbstractC32686w.m102507M((C32659q) this.f134973y, (C26804f) this.f134972x);
            case 5:
                return AiConversationFragment.m18288u0((AiConversationFragment) this.f134972x, (InterfaceC28670t2) this.f134973y);
            case 6:
                return AbstractC32650o0.m102056G((InterfaceC4351m) this.f134972x, (InterfaceC28601c1) this.f134973y);
            case 7:
                return AbstractC32679u0.m102365b0((InterfaceC2994c0) this.f134972x, (C15199y3) this.f134973y);
            case 8:
                return AbstractC32656p1.m102154z((Function1) this.f134972x, (C26807i) this.f134973y);
            case 9:
                return AbstractC32697y2.m102595h((InterfaceC29805a) this.f134973y, (InterfaceC4339a) this.f134972x);
            default:
                return AbstractC32673s3.m102297C((InterfaceC2994c0) this.f134972x, (C13821r1) this.f134973y);
        }
    }

    public /* synthetic */ C32580a0(Object obj, Object obj2, boolean z4, int i13) {
        this.f134971w = i13;
        this.f134973y = obj;
        this.f134972x = obj2;
    }
}
