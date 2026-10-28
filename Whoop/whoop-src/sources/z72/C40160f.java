package z72;

import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import b11.AbstractC2283j;
import e90.C12878a;
import p329n0.InterfaceC26064q;
import p715kotlin.jvm.functions.Function1;
import p748zc1.AbstractC40264a;
import p748zc1.AbstractC40341h;
import p748zc1.AbstractC40353i0;
import p748zc1.AbstractC40396m;
import p748zc1.AbstractC40398m1;
import p748zc1.AbstractC40438q0;
import p748zc1.AbstractC40458s0;
import p748zc1.AbstractC40509x1;
import p748zc1.C40299d1;
import r72.AbstractC31054a;
import v72.AbstractC35773d;
import w72.InterfaceC36912e;
import z80.AbstractC40180a;

/* JADX INFO: renamed from: z72.f */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C40160f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f173294w;

    public /* synthetic */ C40160f(int i13) {
        this.f173294w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f173294w) {
            case 0:
                return AbstractC40161g.m128856v0((InterfaceC36912e) obj);
            case 1:
                return AbstractC40161g.m128858w0((AbstractC31054a) obj);
            case 2:
                return AbstractC40161g.m128860x0((AbstractC35773d) obj);
            case 3:
                return AbstractC40163i.m128876i((Modifier) obj);
            case 4:
                return AbstractC40163i.m128877j((Modifier) obj);
            case 5:
                return AbstractC40163i.m128880m((Modifier) obj);
            case 6:
                return AbstractC40180a.m128903k((C12878a) obj);
            case 7:
                return AbstractC40264a.m129307d(obj);
            case 8:
                return AbstractC40341h.m129831l(obj);
            case 9:
                return AbstractC40396m.m130253d(obj);
            case 10:
                return AbstractC40353i0.m129918e(obj);
            case 11:
                return AbstractC40353i0.m129919f(obj);
            case 12:
                return AbstractC40438q0.m130653g(obj);
            case 13:
                return AbstractC40438q0.m130654h(obj);
            case 14:
                return AbstractC40458s0.m130808k(obj);
            case 15:
                return AbstractC40458s0.m130812o((InterfaceC26064q) obj);
            case 16:
                return AbstractC40458s0.m130813p(((Integer) obj).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C40299d1.m129497f(obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C40299d1.m129498g(obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC40398m1.m130285z((AbstractC2283j.a) obj);
            case 20:
                return AbstractC40398m1.m130256B((AbstractC2283j.a) obj);
            case 21:
                return AbstractC40398m1.m130258D((AbstractC2283j.a) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC40398m1.m130279t((AbstractC2283j.a) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC40398m1.m130281v((AbstractC2283j.a) obj);
            case 24:
                return AbstractC40398m1.m130277r((AbstractC2283j.a) obj);
            case 25:
                return AbstractC40398m1.m130283x((AbstractC2283j.a) obj);
            case 26:
                return AbstractC40509x1.m131152t(obj);
            case 27:
                return AbstractC40509x1.m131155w(obj);
            case 28:
                return AbstractC40509x1.m131158z(obj);
            default:
                return AbstractC40509x1.m131129F(obj);
        }
    }
}
