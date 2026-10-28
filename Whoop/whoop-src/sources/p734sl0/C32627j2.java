package p734sl0;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import aws.smithy.kotlin.runtime.time.ParseException;
import c93.InterfaceC4351m;
import com.whoop.profile.presentation.edit.C9723b;
import com.whoop.profile.view.components.ReferralsTileFooterViewState;
import com.whoop.profile.view.components.ReferralsTileHeaderViewState;
import com.whoop.profile.view.components.ReferralsTileKt;
import com.whoop.profile.view.components.ReferredListViewState;
import com.whoop.profile.view.components.ReferredMemberViewState;
import i51.AbstractC18111h;
import i93.C18284j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25305n;
import p741vn1.AbstractC36212p;
import rv2.InterfaceC31850h;
import so1.C32841y;
import so1.C32842z;
import sq2.AbstractC32888e;
import sq2.C32885b;
import sv2.AbstractC33042e;
import sx1.AbstractC33074j;
import t21.AbstractC33349g;
import t21.C33346d;
import td2.C33711b;
import td2.C33712c;
import td2.C33716g;
import tx0.AbstractC34241d;
import u21.AbstractC34483c;
import u21.C34485e;
import u71.AbstractC34573g;
import u71.C34576j;
import ud2.AbstractC34793b;
import ud2.AbstractC34794c;
import ug.AbstractC34924m;
import ug.C34917f;
import ul0.AbstractC35061c;
import ul0.C35063e;
import uq2.AbstractC35170g;
import uq2.C35165b;
import uq2.C35166c;
import uw0.AbstractC35304n;
import uw0.C35306p;
import ux1.C35370d;
import uz0.AbstractC35410d;
import uz0.AbstractC35411e;
import uz0.C35419m;
import uz0.C35420n;
import v90.AbstractC35814f;
import v90.AbstractC35825q;
import v90.C35809a;
import v90.C35816h;
import w41.AbstractC36801a0;
import w41.AbstractC36826z;
import wo1.AbstractC37474w;
import wo1.AbstractC37476y;
import wr0.AbstractC37566z;
import wr0.C37556u;
import wr0.C37560w;
import zk0.C40819i0;

/* JADX INFO: renamed from: sl0.j2 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32627j2 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f135225w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f135226x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f135227y;

    public /* synthetic */ C32627j2(int i13, C18284j c18284j) {
        this.f135225w = 11;
        this.f135226x = i13;
        this.f135227y = c18284j;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f135225w) {
            case 0:
                return AbstractC32637l2.m101952a0((C40819i0) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return AbstractC32888e.m103258d((C32885b) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return AbstractC33042e.m104548u0((InterfaceC31850h.b) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            case 3:
                return AbstractC33074j.m104751T((C35370d) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            case 4:
                return AbstractC33349g.m105729F((C33346d) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            case 5:
                return AbstractC34241d.m108277z((AbstractC18111h) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            case 6:
                return AbstractC34483c.m108981e((C34485e) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            case 7:
                return AbstractC34573g.m109334q((C34576j) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            case 8:
                return AbstractC34793b.m109806e((C33711b) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            case 9:
                return AbstractC34794c.m109814h((C33712c) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            case 10:
                return AbstractC34794c.m109811e((C33716g) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            case 11:
                C18284j c18284j = (C18284j) this.f135227y;
                String str = (String) obj;
                Integer num = (Integer) obj2;
                int iIntValue = num.intValue();
                AbstractC22676k.m65750j(str, "str");
                AbstractC34924m.m110128J(iIntValue, 0, str);
                C34917f c34917f = (C34917f) new C9723b(new C32587b2(12), this.f135226x, 2).invoke(str, num);
                int i13 = c34917f.f147021a;
                int iIntValue2 = ((Number) c34917f.f147022b).intValue();
                if (c18284j.m52655e(iIntValue2)) {
                    return new C34917f(i13, Integer.valueOf(iIntValue2));
                }
                throw new ParseException(str, iIntValue2 + " not in range " + c18284j, iIntValue);
            case 12:
                return AbstractC35061c.m110855s((C35063e) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            case 13:
                return AbstractC35170g.m111297h((C35165b) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            case 14:
                return AbstractC35170g.m111299j((C35166c) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            case 15:
                return AbstractC35304n.m112073x((C35306p.a) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            case 16:
                return AbstractC35410d.m112330c((C35419m) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC35411e.m112333c((C35420n) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ReferralsTileKt.ReferralsTileFooter$lambda$1((ReferralsTileFooterViewState) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ReferralsTileKt.ReferredMemberItem$lambda$1((ReferredMemberViewState) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            case 20:
                return ReferralsTileKt.ReferralsTileHeader$lambda$1((ReferralsTileHeaderViewState) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            case 21:
                return ReferralsTileKt.ReferredListSection$lambda$1((ReferredListViewState) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC35814f.m113557o((C35816h) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC35825q.m113652m((C35809a) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            case 24:
                return AbstractC36212p.m115247m((InterfaceC25305n) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            case 25:
                return AbstractC36801a0.m117938c((AbstractC36826z.b) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            case 26:
                return AbstractC37474w.m120155c((C32841y) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            case 27:
                return AbstractC37476y.m120163e((C32842z) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            case 28:
                return AbstractC37566z.m120587r((C37556u) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AbstractC37566z.m120581l((C37560w) this.f135227y, this.f135226x, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C32627j2(Object obj, int i13, int i14) {
        this.f135225w = i14;
        this.f135227y = obj;
        this.f135226x = i13;
    }
}
