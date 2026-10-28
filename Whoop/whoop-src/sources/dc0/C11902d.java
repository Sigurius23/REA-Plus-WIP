package dc0;

import ac0.AbstractC0736a;
import androidx.health.platform.client.proto.C1533u;
import b11.AbstractC2283j;
import bc0.AbstractC2978a;
import com.whoop.settings.language.optout.models.LanguageBetaOptOutModel;
import dc2.AbstractC11914a;
import dd1.C11951e;
import dd1.C11956j;
import dd1.C11958l;
import dg1.C12008a;
import jb1.C21536b;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;

/* JADX INFO: renamed from: dc0.d */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C11902d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f38902w;

    public /* synthetic */ C11902d(int i13) {
        this.f38902w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f38902w) {
            case 0:
                return AbstractC11903e.m32031l((AbstractC0736a) obj);
            case 1:
                return AbstractC11903e.m32032m((AbstractC2978a) obj);
            case 2:
                return AbstractC11914a.m32181f((C21536b) obj);
            case 3:
                return AbstractC11914a.m32182g((C23749z0) obj);
            case 4:
                return AbstractC11914a.m32183h((LanguageBetaOptOutModel) obj);
            case 5:
                return C11951e.m32315R1(((Boolean) obj).booleanValue());
            case 6:
                return C11951e.m32359i1(((Boolean) obj).booleanValue());
            case 7:
                return C11951e.m32388r1(((Float) obj).floatValue());
            case 8:
                return C11951e.m32370l1((String) obj);
            case 9:
                return C11951e.m32303L1(obj);
            case 10:
                return C11951e.m32311P1((String) obj);
            case 11:
                return C11951e.m32340c2((String) obj);
            case 12:
                return C11951e.m32343d2((Double) obj);
            case 13:
                return C11956j.m32520N2((AbstractC2283j.a) obj);
            case 14:
                return C11956j.m32492E1(((Integer) obj).intValue());
            case 15:
                return C11956j.m32594m2(((Integer) obj).intValue());
            case 16:
                return C11956j.m32487C2(((Integer) obj).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C11956j.m32482A2(((Integer) obj).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C11956j.m32552Y1(((Integer) obj).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C11956j.m32555Z1(((Integer) obj).intValue());
            case 20:
                return C11956j.m32553Y2(((Integer) obj).intValue());
            case 21:
                return C11956j.m32624w2(((Integer) obj).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C11956j.m32529Q2(obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C11956j.m32615t2(obj);
            case 24:
                return C11956j.m32606q2(((Integer) obj).intValue());
            case 25:
                return C11958l.m32775v1(obj);
            case 26:
                return C11958l.m32749i1(((Float) obj).floatValue());
            case 27:
                return C11958l.m32757m1(obj);
            case 28:
                return C11958l.m32730Y0(obj);
            default:
                return C12008a.m33119b((C21536b) obj);
        }
    }
}
