package iz0;

import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.items.CtaTileModel;
import j00.C21108k;
import j01.AbstractC21125b;
import j02.C21175w0;
import j11.AbstractC21202e;
import j11.AbstractC21211n;
import j21.AbstractC21246e;
import j21.AbstractC21248g;
import j41.AbstractC21315c;
import j81.AbstractC21422f;
import java.util.List;
import jb1.C21536b;
import je2.AbstractC21626e;
import l40.C23328a;
import l83.C23454a0;
import p095dp.AbstractC12240d;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p251jg.EnumC21664q;
import p711j31.AbstractC21282m;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: iz0.d */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C21045d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f79795w;

    public /* synthetic */ C21045d(int i13) {
        this.f79795w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f79795w) {
            case 0:
                return AbstractC21048g.m58809O((String) obj);
            case 1:
                return AbstractC21048g.m58866w0((String) obj);
            case 2:
                return AbstractC21048g.m58793D0((String) obj);
            case 3:
                return AbstractC21048g.m58817W((String) obj);
            case 4:
                return AbstractC21048g.m58836h0((String) obj);
            case 5:
                C23328a it = (C23328a) obj;
                AbstractC22676k.m65750j(it, "it");
                if (!it.f92492b) {
                    it = null;
                }
                if (it != null) {
                    return it.f92491a;
                }
                return null;
            case 6:
                C23328a it3 = (C23328a) obj;
                AbstractC22676k.m65750j(it3, "it");
                if (!it3.f92492b) {
                    it3 = null;
                }
                if (it3 != null) {
                    return it3.f92491a;
                }
                return null;
            case 7:
                C23328a it4 = (C23328a) obj;
                AbstractC22676k.m65750j(it4, "it");
                if (!it4.f92492b) {
                    it4 = null;
                }
                if (it4 != null) {
                    return it4.f92491a;
                }
                return null;
            case 8:
                return Boolean.valueOf(((C21108k) obj).f80055l);
            case 9:
                InterfaceC18044z semantics = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(semantics, "$this$semantics");
                AbstractC18041w.m51812k("LinkLogoIcon", semantics);
                return C23454a0.f92919a;
            case 10:
                InterfaceC18044z semantics2 = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(semantics2, "$this$semantics");
                AbstractC18041w.m51812k("CircularProgressIndicator", semantics2);
                return C23454a0.f92919a;
            case 11:
                return AbstractC21125b.m58944j(obj);
            case 12:
                return C21175w0.m59417b((String) obj);
            case 13:
                return AbstractC21202e.m59449f(((Boolean) obj).booleanValue());
            case 14:
                return AbstractC21211n.m59479B(((Boolean) obj).booleanValue());
            case 15:
                return AbstractC21211n.m59503u(((Boolean) obj).booleanValue());
            case 16:
                return AbstractC21246e.m59574h((Modifier) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC21248g.m59582d(obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return Float.valueOf(AbstractC21282m.m59759f(((Float) obj).floatValue()));
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return Float.valueOf(AbstractC21282m.m59758e(((Float) obj).floatValue()));
            case 20:
                return AbstractC21315c.m59841d(obj);
            case 21:
                return AbstractC21422f.m60270n(obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC21626e.m60868e((C21536b) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC21626e.m60869f((C23749z0) obj);
            case 24:
                return AbstractC21626e.m60870g((CtaTileModel) obj);
            case 25:
                String it5 = (String) obj;
                AbstractC22676k.m65750j(it5, "it");
                Integer numM125932Q = AbstractC39421y.m125932Q(it5);
                return Integer.valueOf(numM125932Q != null ? numM125932Q.intValue() : (int) Double.parseDouble(it5));
            case 26:
                String it6 = (String) obj;
                AbstractC22676k.m65750j(it6, "it");
                Long lM125933R = AbstractC39421y.m125933R(it6);
                return Long.valueOf(lM125933R != null ? lM125933R.longValue() : (long) Double.parseDouble(it6));
            case 27:
                List it7 = (List) obj;
                AbstractC22676k.m65750j(it7, "it");
                it7.add(EnumC21664q.f83182x);
                return C23454a0.f92919a;
            case 28:
                List it8 = (List) obj;
                AbstractC22676k.m65750j(it8, "it");
                it8.add(EnumC21664q.f83184z);
                return C23454a0.f92919a;
            default:
                List it9 = (List) obj;
                AbstractC22676k.m65750j(it9, "it");
                AbstractC12240d.m34055U(it9, EnumC21664q.f83183y);
                return C23454a0.f92919a;
        }
    }
}
