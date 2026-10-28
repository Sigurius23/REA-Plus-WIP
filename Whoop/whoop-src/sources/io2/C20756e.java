package io2;

import ad3.C0764g;
import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.navigation.C9598e;
import it2.AbstractC20932b;
import iw0.AbstractC20962c0;
import iw0.AbstractC20978k0;
import iw0.AbstractC20992x;
import ix1.AbstractC21021d;
import iz0.AbstractC21048g;
import java.util.Map;
import p291l0.C23000t1;
import p715kotlin.jvm.functions.Function1;
import p720m91.C25308q;

/* JADX INFO: renamed from: io2.e */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C20756e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f77966w;

    public /* synthetic */ C20756e(int i13) {
        this.f77966w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f77966w) {
            case 0:
                return AbstractC20760g.m57164f(obj);
            case 1:
                return AbstractC20770l.m57195b((C25308q) obj);
            case 2:
                return AbstractC20782s.m57289y(obj);
            case 3:
                return AbstractC20782s.m57280p((Modifier) obj);
            case 4:
                return AbstractC20749a0.m57117g(obj);
            case 5:
                return AbstractC20757e0.m57152f(obj);
            case 6:
                return AbstractC20773m0.m57205G(obj);
            case 7:
                return AbstractC20773m0.m57224p(obj);
            case 8:
                return AbstractC20773m0.m57232x(obj);
            case 9:
                return AbstractC20932b.m58114d((C0764g) obj);
            case 10:
                return AbstractC20992x.m58359I0(obj);
            case 11:
                return AbstractC20992x.m58362J0(obj);
            case 12:
                return AbstractC20992x.m58365K0((AnalyticEventModel) obj);
            case 13:
                return AbstractC20992x.m58368L0((String) obj);
            case 14:
                return AbstractC20992x.m58371M0(((Integer) obj).intValue());
            case 15:
                return AbstractC20992x.m58376O0((String) obj);
            case 16:
                return AbstractC20992x.m58378P0((C9598e) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC20992x.m58475z0((String) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC20992x.m58476z1((C9598e) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC20992x.m58436m0((C9598e) obj);
            case 20:
                return AbstractC20992x.m58335A0(obj);
            case 21:
                return AbstractC20962c0.m58256m((String) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC20962c0.m58252i((String) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC20978k0.m58323t((String) obj);
            case 24:
                return AbstractC20978k0.m58314k((String) obj);
            case 25:
                return AbstractC21021d.m58594c((Map.Entry) obj);
            case 26:
                return AbstractC21048g.m58828d0((String) obj);
            case 27:
                return AbstractC21048g.m58813S((String) obj);
            case 28:
                return AbstractC21048g.m58846m0((String) obj);
            default:
                return AbstractC21048g.m58852p0(C23000t1.f90727a, (Modifier) obj);
        }
    }
}
