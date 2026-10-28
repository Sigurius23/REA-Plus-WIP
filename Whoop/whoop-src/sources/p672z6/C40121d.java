package p672z6;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import h91.C17027b;
import l83.C23454a0;
import p748zc1.AbstractC40342h0;
import p748zc1.C40288c1;
import p748zc1.C40332g1;
import p748zc1.C40354i1;
import p748zc1.C40365j1;
import p748zc1.C40376k1;
import uf3.C34911a;
import xf3.C38266c;
import zi2.C40701e;

/* JADX INFO: renamed from: z6.d */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C40121d implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f173168w;

    public /* synthetic */ C40121d(int i13) {
        this.f173168w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f173168w) {
            case 0:
                ((C40118a) obj).f173164c = ((Integer) obj2).intValue();
                return C23454a0.f92919a;
            case 1:
                return AbstractC40342h0.m129842j((C17027b) obj, ((Integer) obj2).intValue());
            case 2:
                return AbstractC40342h0.m129844l((C17027b) obj, ((Integer) obj2).intValue());
            case 3:
                return AbstractC40342h0.m129846n((C17027b) obj, ((Integer) obj2).intValue());
            case 4:
                return C40288c1.m129414l((Composer) obj, ((Integer) obj2).intValue());
            case 5:
                return C40288c1.m129416n((Composer) obj, ((Integer) obj2).intValue());
            case 6:
                return C40288c1.m129415m((Composer) obj, ((Integer) obj2).intValue());
            case 7:
                return C40288c1.m129417o((Composer) obj, ((Integer) obj2).intValue());
            case 8:
                return C40288c1.m129413k((Composer) obj, ((Integer) obj2).intValue());
            case 9:
                return C40332g1.m129792i((Composer) obj, ((Integer) obj2).intValue());
            case 10:
                return C40332g1.m129791h((Composer) obj, ((Integer) obj2).intValue());
            case 11:
                return C40332g1.m129790g((Composer) obj, ((Integer) obj2).intValue());
            case 12:
                return C40354i1.m129922c((Composer) obj, ((Integer) obj2).intValue());
            case 13:
                return C40365j1.m130072n((Composer) obj, ((Integer) obj2).intValue());
            case 14:
                return C40365j1.m130076r((Composer) obj, ((Integer) obj2).intValue());
            case 15:
                return C40365j1.m130074p((Composer) obj, ((Integer) obj2).intValue());
            case 16:
                return C40365j1.m130075q((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C40365j1.m130073o((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C40365j1.m130071m((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C40376k1.m130158k((Composer) obj, ((Integer) obj2).intValue());
            case 20:
                return C40376k1.m130159l((Composer) obj, ((Integer) obj2).intValue());
            case 21:
                return C40376k1.m130156i((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C40376k1.m130157j((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C40701e.m132168k((C38266c) obj, (C34911a) obj2);
            case 24:
                return C40701e.m132169l((C38266c) obj, (C34911a) obj2);
            case 25:
                return C40701e.m132170m((C38266c) obj, (C34911a) obj2);
            case 26:
                return C40701e.m132171n((C38266c) obj, (C34911a) obj2);
            case 27:
                return C40701e.m132172o((C38266c) obj, (C34911a) obj2);
            case 28:
                return C40701e.m132174q((C38266c) obj, (C34911a) obj2);
            default:
                return C40701e.m132175r((C38266c) obj, (C34911a) obj2);
        }
    }
}
