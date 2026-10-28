package yb0;

import androidx.health.platform.client.proto.C1533u;
import l83.C23454a0;
import p163g1.EnumC15209z3;
import p270k2.InterfaceC22131e;
import p292l1.EnumC23202x3;
import p390p1.InterfaceC28601c1;
import p635y2.InterfaceC39147y;
import p636y3.C39174f;
import p715kotlin.jvm.functions.Function1;
import p748zc1.AbstractC40342h0;
import p748zc1.AbstractC40374k;
import p748zc1.AbstractC40418o0;
import p748zc1.AbstractC40427p;
import p748zc1.AbstractC40527z;
import wb0.C37035f;
import yn2.AbstractC39675b;
import yw1.AbstractC39822i;
import z41.AbstractC40075j;
import z72.AbstractC40161g;
import zz0.AbstractC41251l;

/* JADX INFO: renamed from: yb0.e */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C39382e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f169454w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f169455x;

    public /* synthetic */ C39382e(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f169454w = i13;
        this.f169455x = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f169454w) {
            case 0:
                return AbstractC39384g.m125641z(this.f169455x, (String) obj);
            case 1:
                return AbstractC39384g.m125597A(this.f169455x, ((Double) obj).doubleValue());
            case 2:
                return AbstractC39388k.m125663K0(this.f169455x, (C37035f) obj);
            case 3:
                return AbstractC39388k.m125665L0(this.f169455x, (C37035f) obj);
            case 4:
                return AbstractC39388k.m125669N0(this.f169455x, (C37035f) obj);
            case 5:
                return AbstractC39388k.m125659I0(this.f169455x, obj);
            case 6:
                return Boolean.valueOf(AbstractC39675b.m126893q(this.f169455x, (EnumC23202x3) obj));
            case 7:
                return Boolean.valueOf(AbstractC39822i.m127680E(this.f169455x, (EnumC15209z3) obj));
            case 8:
                this.f169455x.setValue((InterfaceC39147y) obj);
                return C23454a0.f92919a;
            case 9:
                this.f169455x.setValue((InterfaceC39147y) obj);
                return C23454a0.f92919a;
            case 10:
                return AbstractC40075j.m128452e(this.f169455x, (InterfaceC39147y) obj);
            case 11:
                return AbstractC40075j.m128453f(this.f169455x, (InterfaceC22131e) obj);
            case 12:
                return AbstractC40161g.m128805S(this.f169455x, (C39174f) obj);
            case 13:
                return AbstractC40161g.m128810X(this.f169455x, (C39174f) obj);
            case 14:
                return AbstractC40374k.m130145h(this.f169455x, ((Boolean) obj).booleanValue());
            case 15:
                return AbstractC40427p.m130567e(this.f169455x, (String) obj);
            case 16:
                return AbstractC40427p.m130568f(this.f169455x, ((Boolean) obj).booleanValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC40527z.m131245d(this.f169455x, (AbstractC41251l) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC40342h0.m129841i(this.f169455x, obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC40342h0.m129843k(this.f169455x, obj);
            case 20:
                return AbstractC40342h0.m129845m(this.f169455x, obj);
            case 21:
                return AbstractC40418o0.m130476H(this.f169455x, ((Boolean) obj).booleanValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC40418o0.m130477I(this.f169455x, ((Boolean) obj).booleanValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC40418o0.m130478J(this.f169455x, ((Boolean) obj).booleanValue());
            case 24:
                return AbstractC40418o0.m130469A(this.f169455x, ((Boolean) obj).booleanValue());
            case 25:
                return AbstractC40418o0.m130470B(this.f169455x, ((Boolean) obj).booleanValue());
            case 26:
                return AbstractC40418o0.m130471C(this.f169455x, ((Boolean) obj).booleanValue());
            case 27:
                return AbstractC40418o0.m130472D(this.f169455x, ((Boolean) obj).booleanValue());
            case 28:
                return AbstractC40418o0.m130481M(this.f169455x, ((Boolean) obj).booleanValue());
            default:
                return AbstractC40418o0.m130482N(this.f169455x, ((Boolean) obj).booleanValue());
        }
    }
}
