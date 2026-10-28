package bl2;

import androidx.health.platform.client.proto.C1533u;
import as1.C1945f;
import bh3.InterfaceC3255b;
import com.whoop.p069ui.debug.MainConsoleFragment;
import com.whoop.realtime.presentation.RealTimeRecordActivity;
import com.whoop.service.push.PushService;
import cq0.C11058f;
import cq0.C11059g;
import java.util.List;
import lq0.C24656d;
import m92.C25327j;
import o52.C27544b0;
import o52.C27548d0;
import o52.C27561k;
import o52.C27563l;
import o52.C27565m;
import o52.C27567n;
import o52.C27575r;
import o52.C27585w;
import p003a1.C0103b;

/* JADX INFO: renamed from: bl2.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3374c implements InterfaceC3255b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13170w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f13171x;

    public /* synthetic */ C3374c(Object obj, int i13) {
        this.f13170w = i13;
        this.f13171x = obj;
    }

    @Override // bh3.InterfaceC3255b
    /* JADX INFO: renamed from: b */
    public final void mo9472b(Object obj) {
        switch (this.f13170w) {
            case 0:
                C3375d.m9745H((C0103b) this.f13171x, obj);
                break;
            case 1:
                C3375d.m9748M((C1945f) this.f13171x, obj);
                break;
            case 2:
                C11059g.m29758c0((C11058f) this.f13171x, obj);
                break;
            case 3:
                C11059g.m29753Z((C11058f) this.f13171x, obj);
                break;
            case 4:
                C25327j.m74378I((C25327j) this.f13171x, (Throwable) obj);
                break;
            case 5:
                C25327j.m74377H((C24656d) this.f13171x, obj);
                break;
            case 6:
                PushService.m24504u((C24656d) this.f13171x, obj);
                break;
            case 7:
                PushService.m24505v((PushService) this.f13171x, (Throwable) obj);
                break;
            case 8:
                ((MainConsoleFragment) this.f13171x).m26761F((List) obj);
                break;
            case 9:
                C27563l.m83181R((C27561k) this.f13171x, obj);
                break;
            case 10:
                C27567n.m83184A0((C27565m) this.f13171x, obj);
                break;
            case 11:
                C27567n.m83188C0((C27565m) this.f13171x, obj);
                break;
            case 12:
                C27567n.m83192E0((C27565m) this.f13171x, obj);
                break;
            case 13:
                C27567n.m83196G0((C27565m) this.f13171x, obj);
                break;
            case 14:
                C27567n.m83200J0((C27565m) this.f13171x, obj);
                break;
            case 15:
                C27567n.m83231n0((C27565m) this.f13171x, obj);
                break;
            case 16:
                C27567n.m83204L0((C27565m) this.f13171x, obj);
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C27567n.m83208N0((C27565m) this.f13171x, obj);
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C27567n.m83233q0((C27565m) this.f13171x, obj);
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C27567n.m83235t0((C27565m) this.f13171x, obj);
                break;
            case 20:
                C27567n.m83241y0((C27565m) this.f13171x, obj);
                break;
            case 21:
                C27567n.m83238w0((C27565m) this.f13171x, obj);
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C27585w.m83332r0((C27575r) this.f13171x, obj);
                break;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C27585w.m83335u0((C27575r) this.f13171x, obj);
                break;
            case 24:
                C27585w.m83338x0((C27575r) this.f13171x, obj);
                break;
            case 25:
                C27585w.m83288B0((C27575r) this.f13171x, obj);
                break;
            case 26:
                C27585w.m83290D0((C27575r) this.f13171x, obj);
                break;
            case 27:
                RealTimeRecordActivity.m23828n1((RealTimeRecordActivity) this.f13171x, (Long) obj);
                break;
            case 28:
                C27548d0.m83127b0((C27544b0) this.f13171x, obj);
                break;
            default:
                C27548d0.m83134i0((C27544b0) this.f13171x, obj);
                break;
        }
    }
}
