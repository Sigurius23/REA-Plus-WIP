package dw1;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import e41.AbstractC12702g;
import e41.EnumC12706k;
import e61.C12758a;
import e61.C12759b;
import e81.C12843q;
import ek2.AbstractC13304a;
import eu2.AbstractC13650g;
import eu2.C13659p;
import ev1.C13682a;
import ev2.C13692a;
import ey0.C13734a;
import fa0.C14297d;
import fg2.C14460b;
import fo2.C14667e;
import h91.C17027b;
import p133f1.C13926b1;
import p163g1.C15093n7;
import p163g1.C15118q2;
import p163g1.C15136s0;
import p163g1.C15199y3;
import p163g1.EnumC15128r2;
import p163g1.EnumC15146t0;
import p635y2.InterfaceC39124q0;

/* JADX INFO: renamed from: dw1.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C12413a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f42219w;

    public /* synthetic */ C12413a(int i13) {
        this.f42219w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f42219w) {
            case 0:
                return C12414b.m34923c((Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return C12415c.m34926c((Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return Boolean.valueOf((((Boolean) obj).booleanValue() || ((Boolean) obj2).booleanValue()) ? false : true);
            case 3:
                return AbstractC12702g.m35508B((EnumC12706k) obj, (EnumC12706k) obj2);
            case 4:
                return C12758a.m35704c((Composer) obj, ((Integer) obj2).intValue());
            case 5:
                return C12759b.m35707c((Composer) obj, ((Integer) obj2).intValue());
            case 6:
                return C12843q.m36049e((Composer) obj, ((Integer) obj2).intValue());
            case 7:
                return C12843q.m36050f((Composer) obj, ((Integer) obj2).intValue());
            case 8:
                return C12843q.m36051g((Composer) obj, ((Integer) obj2).intValue());
            case 9:
                return AbstractC13304a.m37375n((C17027b) obj, ((Integer) obj2).intValue());
            case 10:
                return AbstractC13650g.m38469q(((Integer) obj).intValue(), (C13659p) obj2);
            case 11:
                return C13682a.m38602c((Composer) obj, ((Integer) obj2).intValue());
            case 12:
                return C13692a.m38670c((Composer) obj, ((Integer) obj2).intValue());
            case 13:
                return C13734a.m39006c((Composer) obj, ((Integer) obj2).intValue());
            case 14:
                return Long.valueOf(((C13926b1) obj2).f49649d.get());
            case 15:
                return C14297d.m40902c((Composer) obj, ((Integer) obj2).intValue());
            case 16:
                return C14460b.m41199e((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C14667e.m41924g((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C14667e.m41925h((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C14667e.m41926i((Composer) obj, ((Integer) obj2).intValue());
            case 20:
                return (EnumC15146t0) ((C15136s0) obj2).f56747a.f55770g.getValue();
            case 21:
                return (EnumC15128r2) ((C15118q2) obj2).f56638a.f55770g.getValue();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ((C15199y3) obj2).m43221b();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return Integer.valueOf(((InterfaceC39124q0) obj).mo438C(((Integer) obj2).intValue()));
            case 24:
                return Integer.valueOf(((InterfaceC39124q0) obj).mo447Q(((Integer) obj2).intValue()));
            case 25:
                return Integer.valueOf(((InterfaceC39124q0) obj).mo446O(((Integer) obj2).intValue()));
            case 26:
                return Integer.valueOf(((InterfaceC39124q0) obj).mo449b(((Integer) obj2).intValue()));
            case 27:
                return ((C15093n7) obj2).f56510c.getValue();
            case 28:
                return Integer.valueOf(((InterfaceC39124q0) obj).mo447Q(((Integer) obj2).intValue()));
            default:
                return Integer.valueOf(((InterfaceC39124q0) obj).mo438C(((Integer) obj2).intValue()));
        }
    }
}
