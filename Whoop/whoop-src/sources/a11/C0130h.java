package a11;

import a41.AbstractC0376l;
import a61.AbstractC0471d;
import ad1.C0751b;
import am2.AbstractC1026k;
import am2.AbstractC1046w;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import b01.AbstractC2187h;
import b41.AbstractC2715d;
import b71.AbstractC2781b;
import bz0.AbstractC3714d;
import c93.InterfaceC4351m;
import p698au1.AbstractC2068m;
import p700bd1.AbstractC3084b;

/* JADX INFO: renamed from: a11.h */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C0130h implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f387w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f388x;

    public /* synthetic */ C0130h(int i13, int i14) {
        this.f387w = i14;
        this.f388x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f387w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC0139q.m296G(this.f388x, composer, iIntValue);
            case 1:
                return AbstractC0139q.m312W(this.f388x, composer, iIntValue);
            case 2:
                return AbstractC0139q.m332t(this.f388x, composer, iIntValue);
            case 3:
                return AbstractC0139q.m302M(this.f388x, composer, iIntValue);
            case 4:
                return AbstractC0139q.m308S(this.f388x, composer, iIntValue);
            case 5:
                return AbstractC0376l.m1007F(this.f388x, composer, iIntValue);
            case 6:
                return AbstractC0376l.m1005D(this.f388x, composer, iIntValue);
            case 7:
                return AbstractC0471d.m1165n(this.f388x, composer, iIntValue);
            case 8:
                return AbstractC0471d.m1173v(this.f388x, composer, iIntValue);
            case 9:
                return AbstractC0471d.m1175x(this.f388x, composer, iIntValue);
            case 10:
                return AbstractC0471d.m1177z(this.f388x, composer, iIntValue);
            case 11:
                return AbstractC0471d.m1163l(this.f388x, composer, iIntValue);
            case 12:
                return AbstractC0471d.m1167p(this.f388x, composer, iIntValue);
            case 13:
                return AbstractC0471d.m1171t(this.f388x, composer, iIntValue);
            case 14:
                return AbstractC0471d.m1169r(this.f388x, composer, iIntValue);
            case 15:
                return C0751b.m1826e(this.f388x, composer, iIntValue);
            case 16:
                return AbstractC1026k.m2756b0(this.f388x, composer, iIntValue);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC1046w.m3051y(this.f388x, composer, iIntValue);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC2068m.m6514c(this.f388x, composer, iIntValue);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC2187h.m6890l(this.f388x, composer, iIntValue);
            case 20:
                return AbstractC2715d.m7602A(this.f388x, composer, iIntValue);
            case 21:
                return AbstractC2715d.m7606E(this.f388x, composer, iIntValue);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC2715d.m7604C(this.f388x, composer, iIntValue);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC2715d.m7636y(this.f388x, composer, iIntValue);
            case 24:
                return AbstractC2715d.m7634w(this.f388x, composer, iIntValue);
            case 25:
                return AbstractC2715d.m7632u(this.f388x, composer, iIntValue);
            case 26:
                return AbstractC2781b.m7879c(this.f388x, composer, iIntValue);
            case 27:
                return AbstractC3084b.m8843c(this.f388x, composer, iIntValue);
            case 28:
                return AbstractC3714d.m11536e(this.f388x, composer, iIntValue);
            default:
                return AbstractC3714d.m11538g(this.f388x, composer, iIntValue);
        }
    }
}
