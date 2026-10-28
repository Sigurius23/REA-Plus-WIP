package dc0;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import ep1.AbstractC13427v;
import j22.AbstractC21256e;
import m80.AbstractC25219a;
import m80.AbstractC25224f;
import mf2.AbstractC25511b;
import nw0.AbstractC27200g;
import nw0.AbstractC27203j;
import nx1.AbstractC27223e;
import nx1.AbstractC27226h;
import p715kotlin.jvm.functions.Function1;
import pt2.AbstractC29527i;
import pt2.AbstractC29530l;
import pt2.AbstractC29543y;
import ve2.AbstractC35929b;
import wa2.AbstractC36981a;
import z72.AbstractC40161g;

/* JADX INFO: renamed from: dc0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C11901c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f38899w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f38900x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f38901y;

    public /* synthetic */ C11901c(Function1 function1, int i13, Function1 function2) {
        this.f38899w = i13;
        this.f38900x = function1;
        this.f38901y = function2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f38899w) {
            case 0:
                return AbstractC11903e.m32040u(this.f38900x, this.f38901y);
            case 1:
                return AbstractC13427v.m38108r(this.f38900x, this.f38901y);
            case 2:
                return AbstractC21256e.m59615R(this.f38900x, this.f38901y);
            case 3:
                return AbstractC25219a.m73855k(this.f38900x, this.f38901y);
            case 4:
                return AbstractC25224f.m73927o(this.f38900x, this.f38901y);
            case 5:
                return AbstractC25511b.m75010m(this.f38900x, this.f38901y);
            case 6:
                return AbstractC27200g.m81788M(this.f38900x, this.f38901y);
            case 7:
                return AbstractC27200g.m81793R(this.f38900x, this.f38901y);
            case 8:
                return AbstractC27203j.m81863b0(this.f38900x, this.f38901y);
            case 9:
                return AbstractC27203j.m81888z(this.f38900x, this.f38901y);
            case 10:
                return AbstractC27203j.m81854U(this.f38900x, this.f38901y);
            case 11:
                return AbstractC27223e.m81992l(this.f38900x, this.f38901y);
            case 12:
                return AbstractC27226h.m82008C(this.f38900x, this.f38901y);
            case 13:
                return AbstractC29527i.m90247S(this.f38900x, this.f38901y);
            case 14:
                return AbstractC29527i.m90282z(this.f38900x, this.f38901y);
            case 15:
                return AbstractC29530l.m90303H(this.f38900x, this.f38901y);
            case 16:
                return AbstractC29530l.m90342v(this.f38900x, this.f38901y);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC29543y.m90485u(this.f38900x, this.f38901y);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC29543y.m90488x(this.f38900x, this.f38901y);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC29543y.m90480p(this.f38900x, this.f38901y);
            case 20:
                return AbstractC35929b.m114172i(this.f38900x, this.f38901y);
            case 21:
                return AbstractC35929b.m114173j(this.f38900x, this.f38901y);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC36981a.m118724k(this.f38900x, this.f38901y);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC36981a.m118725l(this.f38900x, this.f38901y);
            default:
                return AbstractC40161g.m128796J(this.f38900x, this.f38901y);
        }
    }
}
