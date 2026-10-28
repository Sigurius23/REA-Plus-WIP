package kf1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import kg0.C22453a;
import ki0.C22501a;
import kr0.C22804a;
import kv1.C22844a;
import p294l3.AbstractC23265l0;
import p294l3.C23254g;
import p294l3.C23263k0;
import p571w3.C36776l;
import p571w3.C36780p;
import p571w3.C36781q;
import p634y1.C39029b;
import p636y3.C39183o;
import p636y3.EnumC39181m;
import uf3.C34911a;
import wb3.AbstractC37056f;
import xf3.C38266c;

/* JADX INFO: renamed from: kf1.a */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C22440a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f87796w;

    public /* synthetic */ C22440a(int i13) {
        this.f87796w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f87796w) {
            case 0:
                return C22441b.m64750k((C38266c) obj, (C34911a) obj2);
            case 1:
                return C22441b.m64751l((C38266c) obj, (C34911a) obj2);
            case 2:
                return C22453a.m64831z((C38266c) obj, (C34911a) obj2);
            case 3:
                return C22453a.m64804B((C38266c) obj, (C34911a) obj2);
            case 4:
                return C22453a.m64805C((C38266c) obj, (C34911a) obj2);
            case 5:
                return C22453a.m64821p((C38266c) obj, (C34911a) obj2);
            case 6:
                return C22453a.m64823r((C38266c) obj, (C34911a) obj2);
            case 7:
                return C22453a.m64824s((C38266c) obj, (C34911a) obj2);
            case 8:
                return C22453a.m64822q((C38266c) obj, (C34911a) obj2);
            case 9:
                return C22453a.m64825t((C38266c) obj, (C34911a) obj2);
            case 10:
                return C22453a.m64826u((C38266c) obj, (C34911a) obj2);
            case 11:
                return C22453a.m64827v((C38266c) obj, (C34911a) obj2);
            case 12:
                return C22453a.m64829x((C38266c) obj, (C34911a) obj2);
            case 13:
                return C22453a.m64830y((C38266c) obj, (C34911a) obj2);
            case 14:
                return C22501a.m64999f((C38266c) obj, (C34911a) obj2);
            case 15:
                return C22501a.m65000g((C38266c) obj, (C34911a) obj2);
            case 16:
                return C22501a.m65001h((C38266c) obj, (C34911a) obj2);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C22804a.m66044f((C38266c) obj, (C34911a) obj2);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C22804a.m66045g((C38266c) obj, (C34911a) obj2);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C22804a.m66046h((C38266c) obj, (C34911a) obj2);
            case 20:
                return C22804a.m66047i((C38266c) obj, (C34911a) obj2);
            case 21:
                return C22844a.m66233g((C38266c) obj, (C34911a) obj2);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C22844a.m66235i((C38266c) obj, (C34911a) obj2);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C22844a.m66236j((C38266c) obj, (C34911a) obj2);
            case 24:
                return C22844a.m66237k((C38266c) obj, (C34911a) obj2);
            case 25:
                return Integer.valueOf(Math.round((1 + (((EnumC39181m) obj2) != EnumC39181m.f168423w ? (-1.0f) * (-1) : -1.0f)) * (((Integer) obj).intValue() / 2.0f)));
            case 26:
                C23254g c23254g = (C23254g) obj2;
                return AbstractC37056f.m118980f(c23254g.f92135x, AbstractC23265l0.m67324a(c23254g.f92134w, AbstractC23265l0.f92166b, (C39029b) obj));
            case 27:
                return Integer.valueOf(((C36776l) obj2).f157354a);
            case 28:
                C36780p c36780p = (C36780p) obj2;
                return AbstractC37056f.m118980f(Float.valueOf(c36780p.f157358a), Float.valueOf(c36780p.f157359b));
            default:
                C39029b c39029b = (C39029b) obj;
                C36781q c36781q = (C36781q) obj2;
                C39183o c39183o = new C39183o(c36781q.f157361a);
                C23263k0 c23263k0 = AbstractC23265l0.f92183s;
                return AbstractC37056f.m118980f(AbstractC23265l0.m67324a(c39183o, c23263k0, c39029b), AbstractC23265l0.m67324a(new C39183o(c36781q.f157362b), c23263k0, c39029b));
        }
    }
}
