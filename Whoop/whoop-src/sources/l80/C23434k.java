package l80;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.advancedlabs.presentation.models.AppointmentSummaryBottomSheet;
import lf0.AbstractC23917f2;
import lf0.AbstractC23918g;
import lf0.AbstractC23938l;
import lf0.AbstractC23940l1;
import lf0.AbstractC23962r;
import lf0.AbstractC23970t;
import lf0.C23946n;
import lf2.EnumC24009b;
import live.hms.video.sdk.managers.local.muteonphonecall.MuteOnPhoneCallManager;
import live.hms.video.sdk.models.enums.HMSRoomUpdate;
import lo0.InterfaceC24615z;
import m01.AbstractC24876d;
import m71.C25198a;
import m80.C25221c;
import m81.AbstractC25230e;
import mf2.AbstractC25511b;
import mf2.AbstractC25515f;
import mi2.AbstractC25580c;
import mx1.AbstractC26007m;
import n21.AbstractC26194h;
import n81.AbstractC26450c;
import nb0.AbstractC26536a;
import no0.C26938c;
import no0.C26945f;
import p294l3.C23277r0;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.functions.Function1;
import pf2.AbstractC29151a;
import pf2.AbstractC29152b;
import pf2.AbstractC29154d;

/* JADX INFO: renamed from: l80.k */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C23434k implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f92847w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f92848x;

    public /* synthetic */ C23434k(Function1 function1, int i13) {
        this.f92847w = i13;
        this.f92848x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f92847w) {
            case 0:
                return AbstractC23437n.m67936V(this.f92848x, (InterfaceC4339a) obj);
            case 1:
                return AbstractC23918g.m70354h(this.f92848x, (AppointmentSummaryBottomSheet) obj);
            case 2:
                return AbstractC23938l.m70468p(this.f92848x, (AppointmentSummaryBottomSheet) obj);
            case 3:
                return C23946n.m70534d(this.f92848x, (AppointmentSummaryBottomSheet) obj);
            case 4:
                return AbstractC23970t.m70656L(this.f92848x, obj);
            case 5:
                return AbstractC23970t.m70685v(this.f92848x, (AbstractC23962r) obj);
            case 6:
                return AbstractC23970t.m70686w(this.f92848x, obj);
            case 7:
                return AbstractC23970t.m70645A(this.f92848x, obj);
            case 8:
                return AbstractC23940l1.m70498j(this.f92848x, obj);
            case 9:
                return AbstractC23917f2.m70343w(this.f92848x, ((Boolean) obj).booleanValue());
            case 10:
                return MuteOnPhoneCallManager.onPhoneCallManager$lambda$2(this.f92848x, (HMSRoomUpdate) obj);
            case 11:
                return AbstractC24876d.m72919O(this.f92848x, obj);
            case 12:
                return AbstractC24876d.m72905A(this.f92848x, obj);
            case 13:
                return C25198a.m73775d(this.f92848x, obj);
            case 14:
                return C25221c.m73865d(this.f92848x, obj);
            case 15:
                return AbstractC25230e.m73967w(this.f92848x, ((Boolean) obj).booleanValue());
            case 16:
                return AbstractC25230e.m73968x(this.f92848x, (InterfaceC39147y) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC25511b.m75006i(this.f92848x, ((Boolean) obj).booleanValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC25515f.m75033U(this.f92848x, (AbstractC29151a) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC25515f.m75034V(this.f92848x, (EnumC24009b) obj);
            case 20:
                return AbstractC25515f.m75035W(this.f92848x, (AbstractC29152b) obj);
            case 21:
                return AbstractC25515f.m75036X(this.f92848x, (AbstractC29154d) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC25580c.m75233v(this.f92848x, ((Boolean) obj).booleanValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC26007m.m77252i0(this.f92848x, ((Integer) obj).intValue());
            case 24:
                return AbstractC26007m.m77244e0(this.f92848x, obj);
            case 25:
                return AbstractC26194h.m77782p(this.f92848x, (C23277r0) obj);
            case 26:
                return AbstractC26450c.m78329k(this.f92848x, obj);
            case 27:
                return AbstractC26536a.m78621l(this.f92848x, obj);
            case 28:
                return C26938c.m80439d(this.f92848x, (InterfaceC24615z) obj);
            default:
                return C26945f.m80472d(this.f92848x, (InterfaceC24615z) obj);
        }
    }
}
