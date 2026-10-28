package p719m22;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import mn1.AbstractC25717h;
import n31.AbstractC26217b;
import no0.AbstractC26971s;
import no0.AbstractC26979w;
import nr0.AbstractC27073f;
import nw0.AbstractC27208o;
import nx1.AbstractC27226h;
import ny0.AbstractC27249e;
import ny0.AbstractC27262k;
import o11.AbstractC27401g;
import o11.AbstractC27406l;
import o42.AbstractC27531k;
import o51.AbstractC27537c;
import ox2.AbstractC28459e;
import p721n22.Function0;
import p723o22.AbstractC27469c;
import pj2.AbstractC29321t;
import pp2.AbstractC29444h;
import q11.AbstractC29794d;
import q21.AbstractC29849h;
import q61.AbstractC29998b;
import q81.AbstractC30049g;

/* JADX INFO: renamed from: m22.t */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C24965t implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f97711w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f97712x;

    public /* synthetic */ C24965t(int i13, int i14) {
        this.f97711w = i14;
        this.f97712x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f97711w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC42789u.m73284u(this.f97712x, composer, iIntValue);
            case 1:
                return AbstractC25717h.m75789y(this.f97712x, composer, iIntValue);
            case 2:
                return AbstractC25717h.m75787w(this.f97712x, composer, iIntValue);
            case 3:
                return Function0.m77804i(this.f97712x, composer, iIntValue);
            case 4:
                return AbstractC26217b.m77830B(this.f97712x, composer, iIntValue);
            case 5:
                return AbstractC26971s.m80799w(this.f97712x, composer, iIntValue);
            case 6:
                return AbstractC26979w.m80845M(this.f97712x, composer, iIntValue);
            case 7:
                return AbstractC27073f.m81381F(this.f97712x, composer, iIntValue);
            case 8:
                return AbstractC27208o.m81895G(this.f97712x, composer, iIntValue);
            case 9:
                return AbstractC27226h.m82034y(this.f97712x, composer, iIntValue);
            case 10:
                return AbstractC27249e.m82126i(this.f97712x, composer, iIntValue);
            case 11:
                return AbstractC27262k.m82197i(this.f97712x, composer, iIntValue);
            case 12:
                return AbstractC27401g.m82567J(this.f97712x, composer, iIntValue);
            case 13:
                return AbstractC27406l.m82641B(this.f97712x, composer, iIntValue);
            case 14:
                return AbstractC27406l.m82644E(this.f97712x, composer, iIntValue);
            case 15:
                return AbstractC27469c.m82897c(this.f97712x, composer, iIntValue);
            case 16:
                return AbstractC27531k.m82998c0(this.f97712x, composer, iIntValue);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC27537c.m83077w(this.f97712x, composer, iIntValue);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC28459e.m86287L(this.f97712x, composer, iIntValue);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC29321t.m89192C(this.f97712x, composer, iIntValue);
            case 20:
                return AbstractC29444h.m89867p(this.f97712x, composer, iIntValue);
            case 21:
                return AbstractC29794d.m91257k(this.f97712x, composer, iIntValue);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC29794d.m91259m(this.f97712x, composer, iIntValue);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC29849h.m91407l(this.f97712x, composer, iIntValue);
            case 24:
                return AbstractC29849h.m91401f(this.f97712x, composer, iIntValue);
            case 25:
                return AbstractC29849h.m91405j(this.f97712x, composer, iIntValue);
            case 26:
                return AbstractC29849h.m91403h(this.f97712x, composer, iIntValue);
            case 27:
                return AbstractC29998b.m91774c(this.f97712x, composer, iIntValue);
            case 28:
                return AbstractC30049g.m92016D(this.f97712x, composer, iIntValue);
            default:
                return AbstractC30049g.m92014B(this.f97712x, composer, iIntValue);
        }
    }
}
