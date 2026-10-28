package rm2;

import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.domain.model.teams.TeamUserListing;
import java.util.List;
import java.util.Map;
import jb1.C21536b;
import ny2.AbstractC27299a;
import p040c0.InterfaceC3770q;
import p134f2.C14015d;
import p208i2.InterfaceC17886g0;
import p270k2.InterfaceC22129c;
import p715kotlin.jvm.functions.Function1;
import p720m91.C25308q;
import p733ry2.AbstractC31914c;
import rp2.AbstractC31641a;
import rq0.C31696t0;
import rq0.C31707z;
import rq0.C31708z0;
import rq0.InterfaceC31687p;
import rq2.AbstractC31714a0;
import rq2.AbstractC31718c0;
import rq2.AbstractC31729i;
import rq2.AbstractC31733k;
import rr2.C31771h;
import rs2.AbstractC31795a;
import rs2.AbstractC31797c;
import rv2.C31847e;
import rx0.AbstractC31900e;
import rx0.AbstractC31902g;
import rx0.C31897b;
import s01.AbstractC32050f;
import s32.AbstractC32114f;
import v00.C35459c0;
import v00.C35484p;

/* JADX INFO: renamed from: rm2.d */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C31604d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f130617w;

    public /* synthetic */ C31604d(int i13) {
        this.f130617w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C35484p c35484p;
        switch (this.f130617w) {
            case 0:
                return AbstractC31605e.m97592d0((InterfaceC3770q) obj);
            case 1:
                return AbstractC31605e.m97596f0((InterfaceC3770q) obj);
            case 2:
                return AbstractC31605e.m97606k0((InterfaceC3770q) obj);
            case 3:
                return AbstractC31605e.m97610m0((InterfaceC3770q) obj);
            case 4:
                return AbstractC31641a.m97788c((C25308q) obj);
            case 5:
                return Boolean.valueOf(C31707z.m98318y((List) obj));
            case 6:
                return Boolean.valueOf(C31707z.m98317w((InterfaceC31687p) obj));
            case 7:
                return C31696t0.m98256r0((TeamUserListing) obj);
            case 8:
                return C31708z0.m98355V(((Float) obj).floatValue());
            case 9:
                return AbstractC31729i.m98463j(((Float) obj).floatValue());
            case 10:
                return AbstractC31733k.m98487i(((Float) obj).floatValue());
            case 11:
                return AbstractC31714a0.m98389h(((Float) obj).floatValue());
            case 12:
                return AbstractC31718c0.m98413t(((Float) obj).floatValue());
            case 13:
                return C31771h.m98650y((Map.Entry) obj);
            case 14:
                return C31771h.m98647v((Map.Entry) obj);
            case 15:
                return AbstractC31795a.m98749t((InterfaceC17886g0) obj);
            case 16:
                return AbstractC31797c.m98780o(obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC31797c.m98787v((InterfaceC3770q) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C31847e.m98981h((C21536b) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C31897b.m99149e((C21536b) obj);
            case 20:
                return AbstractC31900e.m99160h(obj);
            case 21:
                return AbstractC31902g.m99170i((String) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC31914c.m99297f((AbstractC27299a) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC32050f.m99608l(obj);
            case 24:
                return AbstractC32050f.m99617u((Modifier) obj);
            case 25:
                return AbstractC32050f.m99618v((C14015d) obj);
            case 26:
                return AbstractC32050f.m99613q(obj);
            case 27:
                return AbstractC32050f.m99619w((InterfaceC22129c) obj);
            case 28:
                C35459c0 c35459c0 = (C35459c0) obj;
                if (c35459c0 == null || (c35484p = c35459c0.f150973P) == null) {
                    return null;
                }
                return c35484p.f151058E;
            default:
                return AbstractC32114f.m99962k(obj);
        }
    }
}
