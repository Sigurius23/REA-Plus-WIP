package p02;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import com.whoop.domain.model.User;
import com.whoop.profile.p067di.ProfileModule;
import l83.C23454a0;
import p005a3.C0230n0;
import p294l3.AbstractC23265l0;
import p294l3.C23283u0;
import p412q3.C29891y;
import p634y1.C39029b;
import pf1.C29150a;
import pi2.C29256a;
import pr2.C29493a;
import pw2.C29590a;
import uf3.C34911a;
import wb3.AbstractC37056f;
import xf3.C38266c;

/* JADX INFO: renamed from: p02.a */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C28589a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f115701w;

    public /* synthetic */ C28589a(int i13) {
        this.f115701w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f115701w) {
            case 0:
                return C28590b.m86973m((C38266c) obj, (C34911a) obj2);
            case 1:
                return C28590b.m86974n((C38266c) obj, (C34911a) obj2);
            case 2:
                return C28590b.m86975o((C38266c) obj, (C34911a) obj2);
            case 3:
                ((C0230n0) obj).f782d0 = true;
                return C23454a0.f92919a;
            case 4:
                return C29150a.m88582k((C38266c) obj, (C34911a) obj2);
            case 5:
                return C29150a.m88583l((C38266c) obj, (C34911a) obj2);
            case 6:
                return C29150a.m88584m((C38266c) obj, (C34911a) obj2);
            case 7:
                return C29150a.m88585n((C38266c) obj, (C34911a) obj2);
            case 8:
                return C29150a.m88586o((C38266c) obj, (C34911a) obj2);
            case 9:
                return C29150a.m88587p((C38266c) obj, (C34911a) obj2);
            case 10:
                return C29150a.m88589r((C38266c) obj, (C34911a) obj2);
            case 11:
                return C29150a.m88590s((C38266c) obj, (C34911a) obj2);
            case 12:
                return C29256a.m88892j((C38266c) obj, (C34911a) obj2);
            case 13:
                return C29256a.m88893k((C38266c) obj, (C34911a) obj2);
            case 14:
                return C29256a.m88894l((C38266c) obj, (C34911a) obj2);
            case 15:
                return C29256a.m88895m((C38266c) obj, (C34911a) obj2);
            case 16:
                return C29256a.m88896n((C38266c) obj, (C34911a) obj2);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C29256a.m88897o((C38266c) obj, (C34911a) obj2);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C29256a.m88898p((C38266c) obj, (C34911a) obj2);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C29256a.m88899q((C38266c) obj, (C34911a) obj2);
            case 20:
                return Boolean.valueOf(C29493a.m90112n((User) obj, (User) obj2));
            case 21:
                return C29590a.m90724e((C38266c) obj, (C34911a) obj2);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C29590a.m90725f((C38266c) obj, (C34911a) obj2);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C29590a.m90726g((C38266c) obj, (C34911a) obj2);
            case 24:
                C39029b c39029b = (C39029b) obj;
                C29891y c29891y = (C29891y) obj2;
                return AbstractC37056f.m118980f(AbstractC23265l0.m67324a(c29891y.f122125a, AbstractC23265l0.f92165a, c39029b), AbstractC23265l0.m67324a(new C23283u0(c29891y.f122126b), AbstractC23265l0.f92180p, c39029b));
            case 25:
                return ProfileModule.define$lambda$0$6((C38266c) obj, (C34911a) obj2);
            case 26:
                return ProfileModule.define$lambda$0$7((C38266c) obj, (C34911a) obj2);
            case 27:
                return ProfileModule.define$lambda$0$8((C38266c) obj, (C34911a) obj2);
            case 28:
                return ProfileModule.define$lambda$0$9((C38266c) obj, (C34911a) obj2);
            default:
                return ProfileModule.define$lambda$0$0((C38266c) obj, (C34911a) obj2);
        }
    }
}
