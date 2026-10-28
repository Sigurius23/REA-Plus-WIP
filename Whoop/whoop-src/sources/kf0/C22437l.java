package kf0;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import com.whoop.membership.extensions.domain.models.OrderOption;
import i93.C18284j;
import kl2.C22566a;
import kw1.AbstractC22853d;
import l03.C23055e;
import l31.C23311e;
import lc0.C23819a;
import lf0.AbstractC23901b2;
import lh2.C24070a;
import p291l0.InterfaceC22940b2;
import p292l1.C23104h1;
import p292l1.C23196w3;
import p294l3.AbstractC23265l0;
import p294l3.C23251e0;
import p294l3.C23272p;
import p316m1.C24920r;
import p389p0.C28539n0;
import p571w3.C36769e;
import p571w3.C36782r;
import p571w3.C36783s;
import p635y2.InterfaceC39124q0;
import p636y3.InterfaceC39171c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: kf0.l */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C22437l implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f87793w;

    public /* synthetic */ C22437l(int i13) {
        this.f87793w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f87793w) {
            case 0:
                return C22438m.m64737c((Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return C22566a.m65308c((Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return AbstractC22853d.m66302O(((Integer) obj).intValue(), (OrderOption) obj2);
            case 3:
                return Integer.valueOf(((InterfaceC22940b2) obj).mo43079c((InterfaceC39171c) obj2));
            case 4:
                return C23055e.m67007c((Composer) obj, ((Integer) obj2).intValue());
            case 5:
                C23104h1 c23104h1 = (C23104h1) obj2;
                Long lM67085b = c23104h1.m67085b();
                Long lValueOf = Long.valueOf(((C24920r) c23104h1.f91243e.getValue()).f97603e);
                C18284j c18284j = c23104h1.f91239a;
                return AbstractC37056f.m118959K(lM67085b, lValueOf, Integer.valueOf(c18284j.f71133w), Integer.valueOf(c18284j.f71134x), Integer.valueOf(c23104h1.m67084a()));
            case 6:
                return Integer.valueOf(((InterfaceC39124q0) obj).mo438C(((Integer) obj2).intValue()));
            case 7:
                return Integer.valueOf(((InterfaceC39124q0) obj).mo447Q(((Integer) obj2).intValue()));
            case 8:
                return Integer.valueOf(((InterfaceC39124q0) obj).mo449b(((Integer) obj2).intValue()));
            case 9:
                return Integer.valueOf(((InterfaceC39124q0) obj).mo446O(((Integer) obj2).intValue()));
            case 10:
                return ((C23196w3) obj2).m67151c();
            case 11:
                return Integer.valueOf(((InterfaceC39124q0) obj).mo446O(((Integer) obj2).intValue()));
            case 12:
                return Integer.valueOf(((InterfaceC39124q0) obj).mo447Q(((Integer) obj2).intValue()));
            case 13:
                return Integer.valueOf(((InterfaceC39124q0) obj).mo438C(((Integer) obj2).intValue()));
            case 14:
                return Integer.valueOf(((InterfaceC39124q0) obj).mo449b(((Integer) obj2).intValue()));
            case 15:
                Boolean boolValueOf = Boolean.valueOf(((C23251e0) obj2).f92130a);
                C28539n0 c28539n0 = AbstractC23265l0.f92165a;
                return AbstractC37056f.m118980f(boolValueOf, new C23272p());
            case 16:
                return Integer.valueOf(((C36769e) obj2).f157338a);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C36783s c36783s = (C36783s) obj2;
                C36782r c36782r = new C36782r(c36783s.f157366a);
                C28539n0 c28539n1 = AbstractC23265l0.f92165a;
                return AbstractC37056f.m118980f(c36782r, Boolean.valueOf(c36783s.f157367b));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C23311e.m67410s((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C23311e.m67417z((Composer) obj, ((Integer) obj2).intValue());
            case 20:
                return C23311e.m67415x((Composer) obj, ((Integer) obj2).intValue());
            case 21:
                return C23311e.m67400A((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C23311e.m67412u((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C23311e.m67413v((Composer) obj, ((Integer) obj2).intValue());
            case 24:
                return C23311e.m67411t((Composer) obj, ((Integer) obj2).intValue());
            case 25:
                return C23311e.m67416y((Composer) obj, ((Integer) obj2).intValue());
            case 26:
                return C23311e.m67414w((Composer) obj, ((Integer) obj2).intValue());
            case 27:
                return C23819a.m69924c((Composer) obj, ((Integer) obj2).intValue());
            case 28:
                return AbstractC23901b2.m70254m((Composer) obj, ((Integer) obj2).intValue());
            default:
                return C24070a.m70990f((Composer) obj, ((Integer) obj2).intValue());
        }
    }
}
