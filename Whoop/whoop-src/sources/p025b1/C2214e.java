package p025b1;

import android.view.ActionMode;
import androidx.lifecycle.AbstractC1613o1;
import androidx.media3.exoplayer.ExoPlayer;
import bc3.C3033m;
import c93.InterfaceC4339a;
import p031b9.C2817b;
import p031b9.C2830f0;
import p043c4.C3958f0;
import p043c4.DialogC3954d0;
import p133f1.C13977s1;
import p133f1.C13988w0;
import p179h.C16347e;
import p292l1.C23203x4;
import p292l1.DialogC23087e2;
import p389p0.C28524g0;
import p389p0.C28535l0;
import p389p0.C28562z;
import p390p1.InterfaceC28620h0;
import p667z0.C39924f;
import p668z1.C39973v;
import vd1.C35909c;

/* JADX INFO: renamed from: b1.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C2214e implements InterfaceC28620h0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8836a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f8837b;

    public /* synthetic */ C2214e(Object obj, int i13) {
        this.f8836a = i13;
        this.f8837b = obj;
    }

    @Override // p390p1.InterfaceC28620h0
    public final void dispose() {
        switch (this.f8836a) {
            case 0:
                C2211b c2211b = (C2211b) ((C2212c) this.f8837b).f8830c.getValue();
                if (c2211b != null) {
                    c2211b.close();
                }
                break;
            case 1:
                DialogC3954d0 dialogC3954d0 = (DialogC3954d0) this.f8837b;
                dialogC3954d0.dismiss();
                dialogC3954d0.f16113G.m7235d();
                break;
            case 2:
                C3958f0 c3958f0 = (C3958f0) this.f8837b;
                c3958f0.m7235d();
                AbstractC1613o1.m5024n(c3958f0, null);
                c3958f0.f16132O.removeViewImmediate(c3958f0);
                break;
            case 3:
                ((InterfaceC4339a) this.f8837b).invoke();
                break;
            case 4:
                C13988w0 c13988w0 = (C13988w0) this.f8837b;
                c13988w0.m39805j();
                c13988w0.f49908i.setValue(Boolean.FALSE);
                break;
            case 5:
                ((C16347e) this.f8837b).m43011h();
                break;
            case 6:
                DialogC23087e2 dialogC23087e2 = (DialogC23087e2) this.f8837b;
                dialogC23087e2.dismiss();
                dialogC23087e2.f91111H.m7235d();
                break;
            case 7:
                C3033m c3033m = ((C23203x4) this.f8837b).f91826c;
                if (c3033m != null) {
                    c3033m.cancel(null);
                }
                break;
            case 8:
                ((C28562z) this.f8837b).f115567d = null;
                break;
            case 9:
                C28535l0 c28535l0 = (C28535l0) this.f8837b;
                C2817b c2817b = c28535l0.f115449c;
                if (c2817b != null) {
                    c2817b.f11023x = false;
                }
                c28535l0.f115449c = null;
                break;
            case 10:
                ((C28524g0) this.f8837b).f115430f = true;
                break;
            case 11:
                ((C2830f0) ((ExoPlayer) this.f8837b)).m8117r0();
                break;
            case 12:
                ((C13977s1) this.f8837b).m39784n();
                break;
            default:
                C39924f c39924f = (C39924f) this.f8837b;
                C39973v c39973v = c39924f.f172354e;
                C35909c c35909c = c39973v.f172501h;
                if (c35909c != null) {
                    c35909c.m114042a();
                }
                c39973v.m128201a();
                ActionMode actionMode = c39924f.f172357h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                c39924f.f172357h = null;
                break;
        }
    }
}
