package o52;

import androidx.health.platform.client.proto.C1533u;
import bh3.InterfaceC3255b;
import com.whoop.data.local.room.dao.wipeable.C6517d;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.BleChooseStrapActivity;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.C10535e;
import com.whoop.realtime.presentation.C9889m;
import com.whoop.realtime.presentation.StartActivityActivity;
import com.whoop.realtime.service.RealTimeActivityService;
import com.whoop.whooplive.live.views.WhoopGraphView;
import com.whoop.whooplive.selfie.camera.CameraView;
import no0.C26944e0;
import p92.C29016e;
import p92.C29018g;
import p92.C29019h;
import pf.C29124b;
import qm2.C30485b;
import qm2.C30489f;
import qm2.C30492i;
import rq0.C31662e1;
import rq0.C31663f;
import rq0.C31666g;
import rq0.C31668g1;
import rq0.C31671h1;
import rq0.C31673i0;
import rq0.C31678k0;
import rq0.C31702w0;
import rq0.C31703x;

/* JADX INFO: renamed from: o52.m0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C27566m0 implements InterfaceC3255b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f110974w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f110975x;

    public /* synthetic */ C27566m0(Object obj, int i13) {
        this.f110974w = i13;
        this.f110975x = obj;
    }

    @Override // bh3.InterfaceC3255b
    /* JADX INFO: renamed from: b */
    public final void mo9472b(Object obj) {
        switch (this.f110974w) {
            case 0:
                StartActivityActivity.m23963k1((C27564l0) this.f110975x, obj);
                break;
            case 1:
                StartActivityActivity.m23969m1((C27564l0) this.f110975x, obj);
                break;
            case 2:
                StartActivityActivity.m23973o1((C27564l0) this.f110975x, obj);
                break;
            case 3:
                StartActivityActivity.m23993y1((StartActivityActivity) this.f110975x, (Boolean) obj);
                break;
            case 4:
                StartActivityActivity.m23913T1((C27564l0) this.f110975x, obj);
                break;
            case 5:
                StartActivityActivity.m23919V1((C27564l0) this.f110975x, obj);
                break;
            case 6:
                StartActivityActivity.m23954h1((C27564l0) this.f110975x, obj);
                break;
            case 7:
                C9889m.m24125x((C26944e0) this.f110975x, obj);
                break;
            case 8:
                C29019h.m88207e0((C29018g) this.f110975x, obj);
                break;
            case 9:
                C29019h.m88211g0((C29018g) this.f110975x, obj);
                break;
            case 10:
                BleChooseStrapActivity.m26942A1((C30485b) this.f110975x, obj);
                break;
            case 11:
                BleChooseStrapActivity.m26944B1((BleChooseStrapActivity) this.f110975x, (Throwable) obj);
                break;
            case 12:
                C30489f.m93361j0((C29124b) this.f110975x, obj);
                break;
            case 13:
                BleConnectStrapActivity.m27074V0((C30492i) this.f110975x, obj);
                break;
            case 14:
                C10535e.m27149C((C29124b) this.f110975x, obj);
                break;
            case 15:
                C31666g.m97979q((C6517d) this.f110975x, obj);
                break;
            case 16:
                C31666g.m97981s((C31663f) this.f110975x, obj);
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C31673i0.b.m98089s((C31663f) this.f110975x, obj);
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C31673i0.b.m98087q((C6517d) this.f110975x, obj);
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C31678k0.m98166s((C31663f) this.f110975x, obj);
                break;
            case 20:
                C31678k0.m98164q((C6517d) this.f110975x, obj);
                break;
            case 21:
                C31702w0.m98282q((C6517d) this.f110975x, obj);
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C31702w0.m98284s((C31663f) this.f110975x, obj);
                break;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C31662e1.b.m97965s((C31663f) this.f110975x, obj);
                break;
            case 24:
                C31662e1.b.m97963q((C6517d) this.f110975x, obj);
                break;
            case 25:
                C31671h1.m98014s0((C31668g1) this.f110975x, obj);
                break;
            case 26:
                ((RealTimeActivityService) obj).m24232o((C29016e) this.f110975x);
                break;
            case 27:
                WhoopGraphView.m28647h((C31703x) this.f110975x, obj);
                break;
            default:
                ((CameraView) this.f110975x).m28905e((Boolean) obj);
                break;
        }
    }
}
