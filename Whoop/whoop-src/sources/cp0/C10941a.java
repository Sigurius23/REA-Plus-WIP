package cp0;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import d42.AbstractC11696l;
import dp0.AbstractC12247c;
import h60.AbstractC16978g;
import ih0.AbstractC18491e0;
import jd2.AbstractC21613b;
import kd1.AbstractC22399k;
import l00.AbstractC23024f;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p708hb2.AbstractC17096d;
import p708hb2.AbstractC42784j;
import p708hb2.Function0;
import p748zc1.AbstractC40407n;
import pj2.AbstractC29318q;
import px0.AbstractC29593c;
import q22.AbstractC29854d;
import qs1.AbstractC30574a;
import sx1.AbstractC33074j;
import tx0.AbstractC34241d;
import vx0.AbstractC36555c;
import zq2.AbstractC41001n;

/* JADX INFO: renamed from: cp0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C10941a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f33834w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f33835x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f33836y;

    public /* synthetic */ C10941a(String str, int i13, int i14) {
        this.f33834w = i14;
        this.f33835x = str;
        this.f33836y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f33834w) {
            case 0:
                return AbstractC10944b.m29033i(this.f33835x, this.f33836y, composer, num.intValue());
            case 1:
                return AbstractC10944b.m29031g(this.f33835x, this.f33836y, composer, num.intValue());
            case 2:
                return AbstractC11696l.m31219g(this.f33835x, this.f33836y, composer, num.intValue());
            case 3:
                return AbstractC12247c.m34102g(this.f33835x, this.f33836y, composer, num.intValue());
            case 4:
                return AbstractC16978g.m47776o(this.f33835x, this.f33836y, composer, num.intValue());
            case 5:
                return AbstractC16978g.m47775n(this.f33835x, this.f33836y, composer, num.intValue());
            case 6:
                return Function0.m48283v(this.f33835x, this.f33836y, composer, num.intValue());
            case 7:
                return Function0.m48281t(this.f33835x, this.f33836y, composer, num.intValue());
            case 8:
                return AbstractC17096d.m48294j(this.f33835x, this.f33836y, composer, num.intValue());
            case 9:
                return AbstractC17096d.m48292h(this.f33835x, this.f33836y, composer, num.intValue());
            case 10:
                return AbstractC42784j.m48317I(this.f33835x, this.f33836y, composer, num.intValue());
            case 11:
                return AbstractC42784j.m48319K(this.f33835x, this.f33836y, composer, num.intValue());
            case 12:
                return AbstractC18491e0.m53488i0(this.f33835x, this.f33836y, composer, num.intValue());
            case 13:
                return AbstractC21613b.m60784h(this.f33835x, this.f33836y, composer, num.intValue());
            case 14:
                return AbstractC22399k.m64474d(this.f33835x, this.f33836y, composer, num.intValue());
            case 15:
                return AbstractC22399k.m64476f(this.f33835x, this.f33836y, composer, num.intValue());
            case 16:
                num.intValue();
                AbstractC23024f.m66794m(this.f33835x, composer, AbstractC28683x.m87244L(this.f33836y | 1));
                return C23454a0.f92919a;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                num.intValue();
                AbstractC23024f.m66788g(this.f33835x, composer, AbstractC28683x.m87244L(this.f33836y | 1));
                return C23454a0.f92919a;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC29318q.m89110K(this.f33835x, this.f33836y, composer, num.intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC29593c.m90764y(this.f33835x, this.f33836y, composer, num.intValue());
            case 20:
                return AbstractC29854d.m91449R(this.f33835x, this.f33836y, composer, num.intValue());
            case 21:
                return AbstractC30574a.m93768r(this.f33835x, this.f33836y, composer, num.intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC30574a.m93769s(this.f33835x, this.f33836y, composer, num.intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC33074j.m104749R(this.f33835x, this.f33836y, composer, num.intValue());
            case 24:
                return AbstractC34241d.m108265n(this.f33835x, this.f33836y, composer, num.intValue());
            case 25:
                return AbstractC36555c.m117242v(this.f33835x, this.f33836y, composer, num.intValue());
            case 26:
                return AbstractC40407n.m130408j(this.f33835x, this.f33836y, composer, num.intValue());
            default:
                return AbstractC41001n.m133211c(this.f33835x, this.f33836y, composer, num.intValue());
        }
    }
}
