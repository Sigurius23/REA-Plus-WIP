package a80;

import androidx.health.platform.client.proto.C1533u;
import bg0.AbstractC3225g;
import ej1.AbstractC13259v;
import ev1.AbstractC13688g;
import gp2.AbstractC16070e;
import gz2.AbstractC16336c;
import ig0.AbstractC18466f;
import ig0.AbstractC18467g;
import ih1.AbstractC18524h;
import kf0.AbstractC22431f;
import km2.AbstractC22592c;
import p715kotlin.jvm.functions.Function1;
import p720m91.InterfaceC25312u;
import ph1.AbstractC29245i;
import pp2.AbstractC29450n;
import pq1.AbstractC29480d;
import qg0.AbstractC30343d;
import sc0.AbstractC32359g;
import sg2.AbstractC32461l;
import so2.AbstractC32849g;
import uf0.AbstractC34906g;

/* JADX INFO: renamed from: a80.j */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0546j implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1879w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f1880x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC25312u f1881y;

    public /* synthetic */ C0546j(Function1 function1, InterfaceC25312u interfaceC25312u, int i13) {
        this.f1879w = i13;
        this.f1880x = function1;
        this.f1881y = interfaceC25312u;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1879w) {
            case 0:
                return AbstractC0548l.m1353o(this.f1880x, this.f1881y, obj);
            case 1:
                return AbstractC0548l.m1351m(this.f1880x, this.f1881y, obj);
            case 2:
                return AbstractC3225g.m9304p(this.f1880x, this.f1881y, obj);
            case 3:
                return AbstractC3225g.m9312x(this.f1880x, this.f1881y, obj);
            case 4:
                return AbstractC13259v.m37294l(this.f1881y, this.f1880x, obj);
            case 5:
                return AbstractC13688g.m38638k(this.f1880x, this.f1881y, obj);
            case 6:
                return AbstractC13688g.m38640m(this.f1880x, this.f1881y, obj);
            case 7:
                return AbstractC16070e.m45396p(this.f1880x, this.f1881y, obj);
            case 8:
                return AbstractC16070e.m45394n(this.f1880x, this.f1881y, obj);
            case 9:
                return AbstractC16336c.m46535d(this.f1881y, this.f1880x, obj);
            case 10:
                return AbstractC18466f.m53231j(this.f1880x, this.f1881y, obj);
            case 11:
                return AbstractC18467g.m53253t(this.f1880x, this.f1881y, obj);
            case 12:
                return AbstractC18467g.m53246m(this.f1880x, this.f1881y, obj);
            case 13:
                return AbstractC18524h.m53679t(this.f1880x, this.f1881y, obj);
            case 14:
                return AbstractC18524h.m53672m(this.f1880x, this.f1881y, obj);
            case 15:
                return AbstractC22431f.m64634I(this.f1880x, this.f1881y, obj);
            case 16:
                return AbstractC22431f.m64644S(this.f1881y, this.f1880x, obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC22592c.m65509t(this.f1880x, this.f1881y, obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC29245i.m88797Y(this.f1880x, this.f1881y, obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC29245i.m88833z(this.f1880x, this.f1881y, obj);
            case 20:
                return AbstractC29450n.m89900n(this.f1880x, this.f1881y, obj);
            case 21:
                return AbstractC29450n.m89899m(this.f1880x, this.f1881y, obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC29480d.m90028e(this.f1880x, this.f1881y, obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC30343d.m92722m(this.f1880x, this.f1881y, obj);
            case 24:
                return AbstractC32359g.m100753l(this.f1880x, this.f1881y, obj);
            case 25:
                return AbstractC32359g.m100755n(this.f1880x, this.f1881y, obj);
            case 26:
                return AbstractC32461l.m101368h(this.f1881y, this.f1880x, obj);
            case 27:
                return AbstractC32849g.m103112n(this.f1880x, this.f1881y, obj);
            case 28:
                return AbstractC32849g.m103111m(this.f1880x, this.f1881y, obj);
            default:
                return AbstractC34906g.m110072o(this.f1880x, this.f1881y, obj);
        }
    }

    public /* synthetic */ C0546j(InterfaceC25312u interfaceC25312u, Function1 function1, int i13) {
        this.f1879w = i13;
        this.f1881y = interfaceC25312u;
        this.f1880x = function1;
    }
}
