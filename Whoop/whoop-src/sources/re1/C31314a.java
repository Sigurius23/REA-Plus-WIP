package re1;

import android.net.Uri;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import com.whoop.bot.models.feedback.AiMessageFeedback;
import l83.C23465k;
import p734sl0.AbstractC32597d2;
import p734sl0.AbstractC32619i;
import p734sl0.AbstractC32650o0;
import p734sl0.AbstractC32654p;
import p734sl0.AbstractC32679u0;
import p734sl0.C32631k1;
import p734sl0.C32636l1;
import p734sl0.C32646n1;
import p734sl0.C32651o1;
import p741vn1.EnumC36197a;
import ri0.C31444c;
import rj0.C31486a;
import rl0.C31510a;
import rm1.AbstractC31592f;
import rm1.AbstractC31594h;
import rm1.AbstractC31600n;
import rs2.AbstractC31797c;
import rx0.C31897b;
import sc0.C32353a;
import sg2.C32450a;
import sk0.C32571a;
import uf3.C34911a;
import xf3.C38266c;
import xk0.C38423a;

/* JADX INFO: renamed from: re1.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C31314a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f128884w;

    public /* synthetic */ C31314a(int i13) {
        this.f128884w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f128884w) {
            case 0:
                return C31315b.m96322c((Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return Boolean.valueOf(C31444c.m96804p((C23465k) obj, (C23465k) obj2));
            case 2:
                return C31486a.m96979e((C38266c) obj, (C34911a) obj2);
            case 3:
                return C31486a.m96980f((C38266c) obj, (C34911a) obj2);
            case 4:
                return C31486a.m96981g((C38266c) obj, (C34911a) obj2);
            case 5:
                return C31510a.m97089c((Composer) obj, ((Integer) obj2).intValue());
            case 6:
                return AbstractC31592f.m97387k((String) obj, (EnumC36197a) obj2);
            case 7:
                return AbstractC31594h.m97443x((String) obj, (EnumC36197a) obj2);
            case 8:
                return AbstractC31600n.m97545k((String) obj, (EnumC36197a) obj2);
            case 9:
                return AbstractC31797c.m98786u(obj, ((Integer) obj2).intValue());
            case 10:
                return C31897b.m99148d((C38266c) obj, (C34911a) obj2);
            case 11:
                return C32353a.m100718c((Composer) obj, ((Integer) obj2).intValue());
            case 12:
                return C32450a.m101330c((Composer) obj, ((Integer) obj2).intValue());
            case 13:
                return C32571a.m101624d((C38266c) obj, (C34911a) obj2);
            case 14:
                return C32571a.m101625e((C38266c) obj, (C34911a) obj2);
            case 15:
                return AbstractC32619i.m101823O((String) obj, (Uri) obj2);
            case 16:
                return AbstractC32619i.m101825Q((C38423a.a) obj, ((Boolean) obj2).booleanValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC32654p.m102108l((C38423a.a) obj, ((Boolean) obj2).booleanValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC32654p.m102114r((C38423a.a) obj, ((Boolean) obj2).booleanValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC32650o0.m102052C((C38423a.a) obj, ((Boolean) obj2).booleanValue());
            case 20:
                return AbstractC32679u0.m102385l0((C38423a.a) obj, ((Boolean) obj2).booleanValue());
            case 21:
                return AbstractC32679u0.m102328A0((String) obj, (AiMessageFeedback) obj2);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC32679u0.m102401t0((C38423a.a) obj, ((Boolean) obj2).booleanValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C32631k1.m101919c((Composer) obj, ((Integer) obj2).intValue());
            case 24:
                return C32636l1.m101923c((Composer) obj, ((Integer) obj2).intValue());
            case 25:
                return C32646n1.m102036c((Composer) obj, ((Integer) obj2).intValue());
            case 26:
                return C32651o1.m102095c((Composer) obj, ((Integer) obj2).intValue());
            case 27:
                return AbstractC32597d2.m101687P((String) obj, (Uri) obj2);
            case 28:
                return AbstractC32597d2.m101688Q((String) obj, (Uri) obj2);
            default:
                return AbstractC32597d2.m101689R((Uri) obj, (String) obj2);
        }
    }
}
