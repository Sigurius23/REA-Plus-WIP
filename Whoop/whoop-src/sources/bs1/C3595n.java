package bs1;

import androidx.health.platform.client.proto.C1533u;
import bu1.AbstractC3636b;
import bu2.AbstractC3639b;
import bu2.AbstractC3646g;
import bu2.AbstractC3652m;
import bu2.AbstractC3663x;
import bv1.C3673c;
import bw2.AbstractC3685a;
import by1.AbstractC3700g;
import c11.AbstractC3841h;
import c21.AbstractC3889b;
import c31.AbstractC3923g;
import c31.AbstractC3924h;
import c31.AbstractC3926j;
import c31.EnumC3919c;
import com.whoop.navigation.C9598e;
import com.whoop.weightlifting.feature.onerepmax.measuremententry.models.MeasurementEntryItemModel;
import ft1.InterfaceC14768a;
import javax.net.ssl.HttpsURLConnection;
import jb1.C21536b;
import l83.C23454a0;
import o02.C27354e;
import p209i3.InterfaceC18044z;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.C25308q;

/* JADX INFO: renamed from: bs1.n */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C3595n implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14593w;

    public /* synthetic */ C3595n(int i13) {
        this.f14593w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f14593w) {
            case 0:
                return AbstractC3583c0.m10852j2(obj);
            case 1:
                return AbstractC3583c0.m10856k2(((Integer) obj).intValue());
            case 2:
                return AbstractC3583c0.m10781P0((String) obj);
            case 3:
                return AbstractC3583c0.m10839g1((C9598e) obj);
            case 4:
                return AbstractC3583c0.m10891t1((C9598e) obj);
            case 5:
                return AbstractC3583c0.m10911y1(((Boolean) obj).booleanValue());
            case 6:
                return AbstractC3636b.m11193h((InterfaceC14768a) obj);
            case 7:
                return AbstractC3636b.m11194i((String) obj);
            case 8:
                return AbstractC3636b.m11197l((Throwable) obj);
            case 9:
                return AbstractC3639b.m11214d(obj);
            case 10:
                return AbstractC3646g.m11243g(obj);
            case 11:
                return AbstractC3652m.m11272f(obj);
            case 12:
                return AbstractC3663x.m11310n(obj);
            case 13:
                return AbstractC3663x.m11314r(((Float) obj).floatValue());
            case 14:
                return C3673c.m11360d((C27354e) obj);
            case 15:
                return AbstractC3685a.m11462g((C21536b) obj);
            case 16:
                return AbstractC3685a.m11465j((C25308q) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC3685a.m11463h((C23749z0) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC3685a.m11464i((MeasurementEntryItemModel) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC3700g.m11516e(obj);
            case 20:
                return AbstractC3841h.m11751w(((Boolean) obj).booleanValue());
            case 21:
                return Integer.valueOf(AbstractC3841h.m11718X(((Integer) obj).intValue()));
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC3841h.m11752x(obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return Integer.valueOf(AbstractC3841h.m11717W(((Integer) obj).intValue()));
            case 24:
                AbstractC22676k.m65750j((HttpsURLConnection) obj, "<this>");
                return C23454a0.f92919a;
            case 25:
                return AbstractC3889b.m11870h(obj);
            case 26:
                return AbstractC3923g.m11911f((EnumC3919c) obj);
            case 27:
                return AbstractC3923g.m11913h((InterfaceC18044z) obj);
            case 28:
                return AbstractC3924h.m11919e((EnumC3919c) obj);
            default:
                return AbstractC3926j.m11932f((EnumC3919c) obj);
        }
    }
}
