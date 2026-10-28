package uz1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import p268k0.AbstractC22086a;
import p390p1.InterfaceC28601c1;
import p635y2.InterfaceC39147y;
import p715kotlin.KotlinNothingValueException;
import p744wt1.Function1;
import p748zc1.AbstractC40403m6;
import p748zc1.AbstractC40503w5;
import p748zc1.AbstractC40529z1;
import v11.AbstractC35551i;
import v51.AbstractC35703b;
import ve0.AbstractC35927e;
import vo1.AbstractC36229d;
import vo1.AbstractC36232g;
import vo1.AbstractC36243r;
import w71.AbstractC36880e0;
import w71.AbstractC36900s;
import w80.AbstractC36941b;
import wq1.AbstractC37509c;
import wz0.AbstractC37777d;
import xz0.AbstractC38754e;
import yb0.AbstractC39388k;

/* JADX INFO: renamed from: uz1.g */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C35429g implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f150904w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f150905x;

    public /* synthetic */ C35429g(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f150904w = i13;
        this.f150905x = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f150904w) {
            case 0:
                return AbstractC35430h.m112457y(this.f150905x);
            case 1:
                return AbstractC35551i.m112739t(this.f150905x);
            case 2:
                return AbstractC35703b.m113159n(this.f150905x);
            case 3:
                return AbstractC35703b.m113161p(this.f150905x);
            case 4:
                return AbstractC35927e.m114110I(this.f150905x);
            case 5:
                return AbstractC36229d.m115389I(this.f150905x);
            case 6:
                return AbstractC36229d.m115396P(this.f150905x);
            case 7:
                return AbstractC36232g.m115443Q(this.f150905x);
            case 8:
                return AbstractC36232g.m115435I(this.f150905x);
            case 9:
                return AbstractC36243r.m115560v0(this.f150905x);
            case 10:
                return AbstractC36900s.m118477l(this.f150905x);
            case 11:
                return AbstractC36880e0.m118304i(this.f150905x);
            case 12:
                return AbstractC36941b.m118561F(this.f150905x);
            case 13:
                return AbstractC37509c.m120217B(this.f150905x);
            case 14:
                return Function1.m120855B(this.f150905x);
            case 15:
                return AbstractC37777d.m121187H(this.f150905x);
            case 16:
                return AbstractC38754e.m124203r(this.f150905x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC39388k.m125673P0(this.f150905x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC39388k.m125677R0(this.f150905x);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC39388k.m125643A0(this.f150905x);
            case 20:
                return AbstractC39388k.m125649D0(this.f150905x);
            case 21:
                return AbstractC39388k.m125653F0(this.f150905x);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC39388k.m125657H0(this.f150905x);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                InterfaceC39147y interfaceC39147y = (InterfaceC39147y) this.f150905x.getValue();
                if (interfaceC39147y != null) {
                    return interfaceC39147y;
                }
                AbstractC22086a.m63161d("Required value was null.");
                throw new KotlinNothingValueException();
            case 24:
                InterfaceC39147y interfaceC39147y2 = (InterfaceC39147y) this.f150905x.getValue();
                if (interfaceC39147y2 != null) {
                    return interfaceC39147y2;
                }
                AbstractC22086a.m63161d("Required value was null.");
                throw new KotlinNothingValueException();
            case 25:
                return AbstractC40529z1.m131265G(this.f150905x);
            case 26:
                return AbstractC40529z1.m131266H(this.f150905x);
            case 27:
                return AbstractC40503w5.m131088k(this.f150905x);
            case 28:
                return AbstractC40503w5.m131089l(this.f150905x);
            default:
                return AbstractC40403m6.m130326G(this.f150905x);
        }
    }
}
