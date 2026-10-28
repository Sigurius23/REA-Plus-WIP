package mf2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import mi2.AbstractC25580c;
import mi2.AbstractC25589l;
import mm1.AbstractC25695i;
import mx1.AbstractC26007m;
import n80.AbstractC26447a;
import nb0.AbstractC26536a;
import no0.AbstractC26948g0;
import no0.AbstractC26950h0;
import no0.AbstractC26951i;
import no0.AbstractC26971s;
import no0.AbstractC26979w;
import no1.AbstractC26992f;
import nr0.AbstractC27073f;
import nw0.AbstractC27200g;
import nw0.AbstractC27203j;
import nw0.AbstractC27208o;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: mf2.e */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C25514e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f99914w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f99915x;

    public /* synthetic */ C25514e(Function1 function1, int i13) {
        this.f99914w = i13;
        this.f99915x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f99914w) {
            case 0:
                return AbstractC25515f.m75026N(this.f99915x);
            case 1:
                return AbstractC25515f.m75019G(this.f99915x);
            case 2:
                return AbstractC25580c.m75237z(this.f99915x);
            case 3:
                return AbstractC25589l.m75304q(this.f99915x);
            case 4:
                return AbstractC25589l.m75305r(this.f99915x);
            case 5:
                return AbstractC25589l.m75300m(this.f99915x);
            case 6:
                return AbstractC25589l.m75301n(this.f99915x);
            case 7:
                return AbstractC25695i.m75688m(this.f99915x);
            case 8:
                return AbstractC26007m.m77218J(this.f99915x);
            case 9:
                return AbstractC26447a.m78310k(this.f99915x);
            case 10:
                return AbstractC26447a.m78311l(this.f99915x);
            case 11:
                return AbstractC26536a.m78626q(this.f99915x);
            case 12:
                return AbstractC26536a.m78620k(this.f99915x);
            case 13:
                return p722ne2.Function1.m79143y(this.f99915x);
            case 14:
                return p722ne2.Function1.m79144z(this.f99915x);
            case 15:
                return p722ne2.Function1.m79130l(this.f99915x);
            case 16:
                return p722ne2.Function1.m79131m(this.f99915x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC26951i.m80539t(this.f99915x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC26971s.m80801y(this.f99915x);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC26979w.m80862b0(this.f99915x);
            case 20:
                return AbstractC26948g0.m80496s(this.f99915x);
            case 21:
                return AbstractC26948g0.m80497t(this.f99915x);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC26950h0.m80516m(this.f99915x);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC26992f.m80961f(this.f99915x);
            case 24:
                return AbstractC27073f.m81398p(this.f99915x);
            case 25:
                return AbstractC27200g.m81782G(this.f99915x);
            case 26:
                return AbstractC27203j.m81850Q(this.f99915x);
            case 27:
                return AbstractC27203j.m81847N(this.f99915x);
            case 28:
                return AbstractC27208o.m81897I(this.f99915x);
            default:
                return AbstractC27208o.m81933v(this.f99915x);
        }
    }
}
