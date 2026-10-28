package p704dk2;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.weightlifting.data.domain.WorkoutGroup;
import dn0.AbstractC12216p;
import do0.AbstractC12232f;
import e41.AbstractC12702g;
import e50.C12724c;
import eg2.AbstractC13176i;
import ej1.AbstractC13252o;
import ek2.AbstractC13304a;
import ep1.AbstractC13418m;
import f01.AbstractC13881n;
import f01.AbstractC13886o1;
import f01.AbstractC13900t0;
import f01.AbstractC13908w0;
import f90.AbstractC14281b;
import fa0.AbstractC14296c;
import fe0.AbstractC14415e;
import fu2.C14789d;
import g51.AbstractC15492b;
import n82.InterfaceC26456b;
import org.joda.time.LocalDateTime;
import p077d0.C11362i1;
import p163g1.AbstractC14987d7;
import p163g1.C15093n7;
import p163g1.C15118q2;
import p163g1.EnumC15128r2;
import p706eo0.AbstractC13376g;
import p715kotlin.jvm.functions.Function1;
import sp0.C32870j;
import tp0.EnumC34058c;
import vy0.AbstractC36597y;

/* JADX INFO: renamed from: dk2.i */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C12122i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f40345w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f40346x;

    public /* synthetic */ C12122i(Function1 function1) {
        this.f40345w = 28;
        C11362i1 c11362i1 = AbstractC14987d7.f56024a;
        this.f40346x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f40345w;
        Function1 function1 = this.f40346x;
        switch (i13) {
            case 0:
                return AbstractC12123j.m33566z(function1, ((Boolean) obj).booleanValue());
            case 1:
                return AbstractC12216p.m33898Y(function1, (AbstractC36597y) obj);
            case 2:
                return AbstractC12232f.m34022h(function1, (String) obj);
            case 3:
                return AbstractC12702g.m35523o(function1, ((Boolean) obj).booleanValue());
            case 4:
                return C12724c.m35576d(function1, obj);
            case 5:
                return AbstractC13176i.m36960R(function1, (String) obj);
            case 6:
                return AbstractC13176i.m36962T(function1, (String) obj);
            case 7:
                return AbstractC13252o.m37253p(function1, ((Boolean) obj).booleanValue());
            case 8:
                return AbstractC13304a.m37374m(function1, obj);
            case 9:
                return AbstractC13376g.m37684F(function1, (String) obj);
            case 10:
                return AbstractC13376g.m37688J(function1, obj);
            case 11:
                return AbstractC13418m.m38011y(function1, obj);
            case 12:
                return AbstractC13881n.m39399u(function1, obj);
            case 13:
                return AbstractC13881n.m39401w(function1, obj);
            case 14:
                return AbstractC13900t0.m39557i(function1, obj);
            case 15:
                return AbstractC13908w0.m39609g(function1, obj);
            case 16:
                return AbstractC13886o1.m39476m(function1, obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC14281b.m40775g(function1, (String) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC14296c.m40854Q(function1, (InterfaceC26456b) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC14296c.m40855R(function1, (String) obj);
            case 20:
                return AbstractC14296c.m40841D(function1, (EnumC34058c) obj);
            case 21:
                return AbstractC14296c.m40842E(function1, ((Boolean) obj).booleanValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC14296c.m40843F(function1, (C32870j) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC14296c.m40865a0(function1, (LocalDateTime) obj);
            case 24:
                return AbstractC14296c.m40871d0(function1, (LocalDateTime) obj);
            case 25:
                return AbstractC14415e.m41062C(function1, obj);
            case 26:
                return C14789d.m42475C(function1, (WorkoutGroup) obj);
            case 27:
                return new C15118q2((EnumC15128r2) obj, function1);
            case 28:
                C11362i1 c11362i1 = AbstractC14987d7.f56024a;
                return new C15093n7(obj, function1);
            default:
                return AbstractC15492b.m43695f(function1, obj);
        }
    }

    public /* synthetic */ C12122i(Function1 function1, int i13) {
        this.f40345w = i13;
        this.f40346x = function1;
    }
}
