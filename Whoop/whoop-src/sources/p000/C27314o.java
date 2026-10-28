package p000;

import a80.AbstractC0548l;
import a81.AbstractC0567r;
import a90.AbstractC0585b;
import androidx.health.platform.client.proto.C1533u;
import aq1.AbstractC1912f;
import ay1.AbstractC2154b;
import az1.AbstractC2166g;
import az1.AbstractC2173n;
import b90.AbstractC2881c;
import b90.AbstractC2884f;
import be1.AbstractC3173g;
import bf0.AbstractC3190b;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import pv0.InterfaceC29574a;
import pv0.InterfaceC29575b;
import q20.C29824j;
import q20.C29828m;

/* JADX INFO: renamed from: o */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27314o implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f109377w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f109378x;

    public /* synthetic */ C27314o(Function1 function1, int i13) {
        this.f109377w = i13;
        this.f109378x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f109377w) {
            case 0:
                this.f109378x.invoke(new InterfaceC29575b.b(null, 1, null));
                return C23454a0.f92919a;
            case 1:
                this.f109378x.invoke(InterfaceC29574a.a.f120677a);
                return C23454a0.f92919a;
            case 2:
                this.f109378x.invoke(InterfaceC29574a.c.f120679a);
                return C23454a0.f92919a;
            case 3:
                return AbstractC0548l.m1354p(this.f109378x);
            case 4:
                return AbstractC0567r.m1456q(this.f109378x);
            case 5:
                return AbstractC0585b.m1518g(this.f109378x);
            case 6:
                return AbstractC0585b.m1519h(this.f109378x);
            case 7:
                return AbstractC1912f.m5861q(this.f109378x);
            case 8:
                return AbstractC1912f.m5867w(this.f109378x);
            case 9:
                return AbstractC2154b.m6707f(this.f109378x);
            case 10:
                return AbstractC2166g.m6742E(this.f109378x);
            case 11:
                return AbstractC2173n.m6795A(this.f109378x);
            case 12:
                this.f109378x.invoke(new C29828m(null, null, null, 7));
                return C23454a0.f92919a;
            case 13:
                this.f109378x.invoke(C29824j.f121906x);
                return C23454a0.f92919a;
            case 14:
                return AbstractC2881c.m8338m(this.f109378x);
            case 15:
                return AbstractC2881c.m8332g(this.f109378x);
            case 16:
                return AbstractC2884f.m8377y(this.f109378x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC3173g.m9093Z(this.f109378x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC3173g.m9078K(this.f109378x);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC3173g.m9079L(this.f109378x);
            case 20:
                return AbstractC3173g.m9080M(this.f109378x);
            case 21:
                return AbstractC3173g.m9083P(this.f109378x);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC3173g.m9084Q(this.f109378x);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC3173g.m9086S(this.f109378x);
            case 24:
                return AbstractC3173g.m9087T(this.f109378x);
            case 25:
                return AbstractC3173g.m9103e0(this.f109378x);
            case 26:
                return AbstractC3173g.m9105f0(this.f109378x);
            case 27:
                return AbstractC3173g.m9107g0(this.f109378x);
            case 28:
                return AbstractC3173g.m9109h0(this.f109378x);
            default:
                return AbstractC3190b.m9181g(this.f109378x);
        }
    }
}
