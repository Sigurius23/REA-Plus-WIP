package p748zc1;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: zc1.j */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C40363j implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f174310w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f174311x;

    public /* synthetic */ C40363j(int i13, int i14) {
        this.f174310w = i14;
        this.f174311x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f174310w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC40374k.m130148k(this.f174311x, composer, iIntValue);
            case 1:
                return AbstractC40385l.m130217c(this.f174311x, composer, iIntValue);
            case 2:
                return AbstractC40396m.m130254e(this.f174311x, composer, iIntValue);
            case 3:
                return AbstractC40407n.m130404f(this.f174311x, composer, iIntValue);
            case 4:
                return AbstractC40417o.m130468c(this.f174311x, composer, iIntValue);
            case 5:
                return AbstractC40427p.m130569g(this.f174311x, composer, iIntValue);
            case 6:
                return AbstractC40437q.m130646c(this.f174311x, composer, iIntValue);
            case 7:
                return AbstractC40447r.m130730c(this.f174311x, composer, iIntValue);
            case 8:
                return AbstractC40457s.m130797c(this.f174311x, composer, iIntValue);
            case 9:
                return AbstractC40497w.m131068c(this.f174311x, composer, iIntValue);
            case 10:
                return AbstractC40507x.m131118c(this.f174311x, composer, iIntValue);
            case 11:
                return AbstractC40517y.m131206c(this.f174311x, composer, iIntValue);
            case 12:
                return AbstractC40527z.m131246e(this.f174311x, composer, iIntValue);
            case 13:
                return AbstractC40265a0.m129312c(this.f174311x, composer, iIntValue);
            case 14:
                return AbstractC40276b0.m129340c(this.f174311x, composer, iIntValue);
            case 15:
                return AbstractC40287c0.m129407c(this.f174311x, composer, iIntValue);
            case 16:
                return AbstractC40320f0.m129684c(this.f174311x, composer, iIntValue);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC40331g0.m129786c(this.f174311x, composer, iIntValue);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC40342h0.m129847o(this.f174311x, composer, iIntValue);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC40353i0.m129920g(this.f174311x, composer, iIntValue);
            case 20:
                return AbstractC40364j0.m130063c(this.f174311x, composer, iIntValue);
            case 21:
                return AbstractC40375k0.m130151c(this.f174311x, composer, iIntValue);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC40386l0.m130221d(this.f174311x, composer, iIntValue);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC40418o0.m130506u(this.f174311x, composer, iIntValue);
            case 24:
                return AbstractC40428p0.m130573d(this.f174311x, composer, iIntValue);
            case 25:
                return AbstractC40438q0.m130655i(this.f174311x, composer, iIntValue);
            case 26:
                return AbstractC40448r0.m130739i(this.f174311x, composer, iIntValue);
            case 27:
                return AbstractC40468t0.m130858c(this.f174311x, composer, iIntValue);
            case 28:
                return AbstractC40478u0.m130905c(this.f174311x, composer, iIntValue);
            default:
                return AbstractC40488v0.m130996c(this.f174311x, composer, iIntValue);
        }
    }
}
