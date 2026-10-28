package zm1;

import androidx.health.platform.client.proto.C1533u;
import cs1.AbstractC11103c;
import java.util.List;
import jb1.C21536b;
import p208i2.InterfaceC17886g0;
import p270k2.InterfaceC22129c;
import p715kotlin.jvm.functions.Function1;
import p720m91.C25308q;
import vt2.AbstractC36498g;
import xo2.InterfaceC38495a;
import zo2.AbstractC40936g;
import zq0.AbstractC40960c0;
import zq0.AbstractC40965f;
import zq2.AbstractC40996i;
import zq2.AbstractC40998k;
import zq2.AbstractC41002o;
import zr1.AbstractC41068b;
import zr1.AbstractC41069c;
import zs2.C41077a;
import zs2.C41078b;
import zt2.AbstractC41134c;
import zt2.AbstractC41135d;
import zt2.AbstractC41140i;
import zt2.AbstractC41141j;
import zv2.AbstractC41169e;
import zv2.AbstractC41172h;
import zz0.AbstractC41246g;
import zz0.AbstractC41251l;

/* JADX INFO: renamed from: zm1.d */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C40893d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f176217w;

    public /* synthetic */ C40893d(int i13) {
        this.f176217w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f176217w) {
            case 0:
                return AbstractC40894e.m132539p(obj);
            case 1:
                return AbstractC40936g.m132835l((InterfaceC38495a) obj);
            case 2:
                return AbstractC40965f.m132940L(obj);
            case 3:
                return AbstractC40960c0.m132919j(obj);
            case 4:
                return AbstractC40996i.m133159y((InterfaceC22129c) obj);
            case 5:
                return AbstractC40998k.m133193w((InterfaceC22129c) obj);
            case 6:
                return AbstractC41002o.m133217f(((Float) obj).floatValue());
            case 7:
                return AbstractC41068b.m133322j((AbstractC11103c) obj);
            case 8:
                return AbstractC41068b.m133323k(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC41069c.m133348p((List) obj);
            case 10:
                return AbstractC41069c.m133352t((InterfaceC17886g0) obj);
            case 11:
                return C41077a.m133379c((C21536b) obj);
            case 12:
                return C41078b.m133382d((C21536b) obj);
            case 13:
                return AbstractC41134c.m133553f(obj);
            case 14:
                return AbstractC41135d.m133562f(obj);
            case 15:
                return AbstractC41140i.m133597i(obj);
            case 16:
                return AbstractC41140i.m133600l((C25308q) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC41141j.m133613j((AbstractC36498g) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC41169e.m133746m(obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC41172h.m133792M((Double) obj);
            default:
                return AbstractC41246g.m133985o((AbstractC41251l) obj);
        }
    }
}
