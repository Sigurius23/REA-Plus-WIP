package g11;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import gh0.AbstractC15850e;
import gv1.AbstractC16233g;
import gv1.AbstractC16240n;
import h01.AbstractC16552s;
import hh0.AbstractC17286f;
import ib0.AbstractC18333d;
import iz0.AbstractC21048g;
import jg2.AbstractC21671c;
import jr1.AbstractC21896d;
import jr1.AbstractC21897e;
import js2.AbstractC21928f;
import l83.C23454a0;
import p390p1.InterfaceC28601c1;
import p707gt1.AbstractC16198l;

/* JADX INFO: renamed from: g11.b */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C15218b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f57141w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f57142x;

    public /* synthetic */ C15218b(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f57141w = i13;
        this.f57142x = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f57141w) {
            case 0:
                return AbstractC15219c.m43235B(this.f57142x);
            case 1:
                this.f57142x.setValue(Boolean.TRUE);
                return C23454a0.f92919a;
            case 2:
                this.f57142x.setValue(Boolean.TRUE);
                return C23454a0.f92919a;
            case 3:
                this.f57142x.setValue(Boolean.FALSE);
                return C23454a0.f92919a;
            case 4:
                this.f57142x.setValue(Boolean.TRUE);
                return C23454a0.f92919a;
            case 5:
                this.f57142x.setValue(Boolean.FALSE);
                return C23454a0.f92919a;
            case 6:
                return AbstractC15850e.m44706B(this.f57142x);
            case 7:
                return AbstractC15850e.m44707C(this.f57142x);
            case 8:
                return AbstractC16198l.m45804u(this.f57142x);
            case 9:
                return AbstractC16233g.m45944A(this.f57142x);
            case 10:
                return AbstractC16233g.m45947D(this.f57142x);
            case 11:
                return AbstractC16233g.m45951H(this.f57142x);
            case 12:
                return AbstractC16233g.m45987z(this.f57142x);
            case 13:
                return AbstractC16240n.m46017h(this.f57142x);
            case 14:
                return AbstractC16240n.m46018i(this.f57142x);
            case 15:
                this.f57142x.setValue(null);
                return C23454a0.f92919a;
            case 16:
                return AbstractC16552s.m46832u(this.f57142x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return Integer.valueOf(AbstractC16552s.m46834w(this.f57142x));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC17286f.m48947n(this.f57142x);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC17286f.m48954u(this.f57142x);
            case 20:
                return AbstractC18333d.m52784w(this.f57142x);
            case 21:
                return AbstractC21048g.m58868x0(this.f57142x);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                this.f57142x.setValue(Boolean.TRUE);
                return C23454a0.f92919a;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                this.f57142x.setValue(Boolean.TRUE);
                return C23454a0.f92919a;
            case 24:
                return AbstractC21671c.m60949h(this.f57142x);
            case 25:
                return AbstractC21896d.m62182J(this.f57142x);
            case 26:
                return AbstractC21897e.m62249u(this.f57142x);
            case 27:
                return AbstractC21897e.m62251w(this.f57142x);
            case 28:
                return AbstractC21928f.m62457w(this.f57142x);
            default:
                return AbstractC21928f.m62458x(this.f57142x);
        }
    }
}
