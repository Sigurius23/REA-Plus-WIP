package p702ch0;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cp0.AbstractC10971k;
import l83.C23454a0;
import mx1.AbstractC26007m;
import os0.AbstractC28307c;
import ov2.AbstractC28403g;
import p390p1.AbstractC28683x;
import p477s2.AbstractC32073e;
import p704dk2.Function0;
import p708hb2.AbstractC42784j;
import p719m22.AbstractC42786k;
import p719m22.AbstractC42787l;
import p719m22.AbstractC42789u;
import p734sl0.AbstractC32656p1;
import qu2.AbstractC30643k;
import vy0.AbstractC36588p;

/* JADX INFO: renamed from: ch0.t */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4651t implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18950w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f18951x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f18952y;

    public /* synthetic */ C4651t(int i13, int i14, InterfaceC4339a interfaceC4339a) {
        this.f18950w = i14;
        this.f18951x = interfaceC4339a;
        this.f18952y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f18950w) {
            case 0:
                return AbstractC4653u.m14657w(this.f18951x, this.f18952y, composer, num.intValue());
            case 1:
                return AbstractC10971k.m29228j(this.f18951x, this.f18952y, composer, num.intValue());
            case 2:
                num.getClass();
                AbstractC32073e.m99749i(this.f18951x, composer, AbstractC28683x.m87244L(this.f18952y | 1));
                return C23454a0.f92919a;
            case 3:
                num.intValue();
                AbstractC32073e.m99733a(this.f18951x, composer, AbstractC28683x.m87244L(this.f18952y | 1));
                return C23454a0.f92919a;
            case 4:
                return Function0.m33509l(this.f18951x, this.f18952y, composer, num.intValue());
            case 5:
                return p705ea2.Function0.m36303c(this.f18951x, this.f18952y, composer, num.intValue());
            case 6:
                return p708hb2.Function0.m48279r(this.f18951x, this.f18952y, composer, num.intValue());
            case 7:
                return AbstractC42784j.m48315G(this.f18951x, this.f18952y, composer, num.intValue());
            case 8:
                return p718lz1.Function0.m72755o(this.f18951x, this.f18952y, composer, num.intValue());
            case 9:
                return AbstractC42786k.m73210f(this.f18951x, this.f18952y, composer, num.intValue());
            case 10:
                return AbstractC42787l.m73220f(this.f18951x, this.f18952y, composer, num.intValue());
            case 11:
                return AbstractC42789u.m73263C(this.f18951x, this.f18952y, composer, num.intValue());
            case 12:
                return AbstractC26007m.m77231W(this.f18951x, this.f18952y, composer, num.intValue());
            case 13:
                return p723o22.Function0.m82900c(this.f18951x, this.f18952y, composer, num.intValue());
            case 14:
                return AbstractC28307c.m85762i(this.f18951x, this.f18952y, composer, num.intValue());
            case 15:
                return AbstractC28403g.m86127h(this.f18951x, this.f18952y, composer, num.intValue());
            case 16:
                return p728ql2.Function0.m93251C(this.f18951x, this.f18952y, composer, num.intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return p728ql2.Function0.m93277x(this.f18951x, this.f18952y, composer, num.intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return p729qs0.Function0.m93734s(this.f18951x, this.f18952y, composer, num.intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC30643k.m94189l(this.f18951x, this.f18952y, composer, num.intValue());
            case 20:
                return p731rl2.Function0.m97108q(this.f18951x, this.f18952y, composer, num.intValue());
            case 21:
                return AbstractC32656p1.m102126E(this.f18951x, this.f18952y, composer, num.intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return p738tv0.Function0.m108115c(this.f18951x, this.f18952y, composer, num.intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC36588p.m117488v0(this.f18951x, this.f18952y, composer, num.intValue());
            case 24:
                return AbstractC36588p.m117380B0(this.f18951x, this.f18952y, composer, num.intValue());
            case 25:
                return AbstractC36588p.m117420V0(this.f18951x, this.f18952y, composer, num.intValue());
            default:
                return AbstractC36588p.m117455i1(this.f18951x, this.f18952y, composer, num.intValue());
        }
    }
}
