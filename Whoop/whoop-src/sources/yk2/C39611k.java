package yk2;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.weeklyplan.weeklyplan.view.SummaryV2Fragment;
import hu2.InterfaceC17655b;
import jb1.C21536b;
import ls2.AbstractC24716a;
import o02.C27354e;
import p040c0.InterfaceC3770q;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;
import p720m91.C25308q;
import vt2.AbstractC36492a;
import vt2.AbstractC36498g;
import wt2.AbstractC37628i;
import yl0.AbstractC39619b;
import yo0.AbstractC39683e;
import yo2.AbstractC39693b;
import yq0.AbstractC39709b;
import yq0.AbstractC39710c;
import yt0.C39764c;
import yt0.C39767f;
import yt2.AbstractC39772c;
import yt2.AbstractC39780k;
import yt2.AbstractC39782m;
import yu2.AbstractC39795e;
import yv0.AbstractC39806i;

/* JADX INFO: renamed from: yk2.k */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C39611k implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f170381w;

    public /* synthetic */ C39611k(int i13) {
        this.f170381w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f170381w) {
            case 0:
                return AbstractC39612l.m126561q0((C25308q) obj);
            case 1:
                return AbstractC39612l.m126522U(obj);
            case 2:
                return AbstractC39619b.m126615p((Double) obj);
            case 3:
                return AbstractC39683e.m126930R((InterfaceC3770q) obj);
            case 4:
                return Integer.valueOf(AbstractC39683e.m126933U(((Integer) obj).intValue()));
            case 5:
                return AbstractC39683e.m126914B(((Boolean) obj).booleanValue());
            case 6:
                return AbstractC39693b.m127032c((C21536b) obj);
            case 7:
                return AbstractC39709b.m127065s((C21536b) obj);
            case 8:
                return AbstractC39709b.m127067u((C21536b) obj);
            case 9:
                return AbstractC39710c.m127078b((C25308q) obj);
            case 10:
                return C39764c.m127286l((InterfaceC33687a) obj);
            case 11:
                return C39767f.m127313v((InterfaceC33687a) obj);
            case 12:
                return AbstractC39772c.m127348u((AbstractC36498g) obj);
            case 13:
                return AbstractC39772c.m127325E((AbstractC36498g) obj);
            case 14:
                return SummaryV2Fragment.m27995K((C27354e) obj);
            case 15:
                return AbstractC39780k.m127383Y((AbstractC37628i) obj);
            case 16:
                return Integer.valueOf(AbstractC39780k.m127373O(((Integer) obj).intValue()));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC39780k.m127384Z((AbstractC36492a) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC39780k.m127420y((AbstractC36492a) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC39782m.m127482z(obj);
            case 20:
                return AbstractC39782m.m127449Y(((Boolean) obj).booleanValue());
            case 21:
                return AbstractC39782m.m127425A((AbstractC36498g) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC39782m.m127426B((AbstractC24716a) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC39782m.m127427C(((Boolean) obj).booleanValue());
            case 24:
                return AbstractC39782m.m127434J(obj);
            case 25:
                return AbstractC39782m.m127435K((AbstractC36498g) obj);
            case 26:
                return AbstractC39782m.m127448X((AbstractC24716a) obj);
            case 27:
                return AbstractC39795e.m127535D((InterfaceC17655b) obj);
            case 28:
                return AbstractC39806i.m127602d((C21536b) obj);
            default:
                return AbstractC39806i.m127603e((C23749z0) obj);
        }
    }
}
