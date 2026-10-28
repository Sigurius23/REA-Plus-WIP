package i21;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import i22.AbstractC18015c;
import i51.AbstractC18121r;
import ib0.AbstractC18333d;
import ib2.AbstractC18337b;
import id2.C18425j;
import ig0.AbstractC18467g;
import ig0.C18462b;
import ih0.AbstractC18486c;
import ih0.AbstractC18491e0;
import ih0.AbstractC18502l;
import ih0.AbstractC18504n;

/* JADX INFO: renamed from: i21.r */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C18008r implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69916w;

    public /* synthetic */ C18008r(int i13) {
        this.f69916w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f69916w) {
            case 0:
                return AbstractC18009s.m51703l();
            case 1:
                return AbstractC18010t.m51714j();
            case 2:
                return AbstractC18015c.m51736Q();
            case 3:
                return AbstractC18015c.m51737R();
            case 4:
                return AbstractC18015c.m51763x();
            case 5:
                return AbstractC18015c.m51721B();
            case 6:
                return AbstractC18015c.m51726G();
            case 7:
                return AbstractC18015c.m51727H();
            case 8:
                return AbstractC18015c.m51728I();
            case 9:
                return AbstractC18015c.m51729J();
            case 10:
                return AbstractC18015c.m51730K();
            case 11:
                return AbstractC18121r.m52030e();
            case 12:
                return AbstractC18333d.m52748F();
            case 13:
                return AbstractC18333d.m52756N();
            case 14:
                return AbstractC18337b.m52823q();
            case 15:
                return AbstractC18337b.m52803C();
            case 16:
                return AbstractC18337b.m52829w();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C18425j.m53043d();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C18462b.m53206e();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC18467g.m53249p();
            case 20:
                return AbstractC18486c.m53349c();
            case 21:
                return AbstractC18502l.m53610y();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return Boolean.valueOf(AbstractC18504n.m53615d());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC18491e0.m53519s1();
            case 24:
                return AbstractC18491e0.m53528v1();
            case 25:
                return AbstractC18491e0.m53507o1();
            case 26:
                return AbstractC18491e0.m53512q0();
            case 27:
                return AbstractC18491e0.m53510p1();
            case 28:
                return AbstractC18491e0.m53393C0();
            default:
                return AbstractC18491e0.m53456X0();
        }
    }
}
