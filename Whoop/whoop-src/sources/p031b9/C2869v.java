package p031b9;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p211i5.InterfaceC18102o;
import p309lo.InterfaceC24550h;
import p465rm.C31545k0;
import p465rm.InterfaceC31582z0;
import p516u8.C34626x;
import p516u8.InterfaceC34595h0;
import p607x8.InterfaceC38051f;

/* JADX INFO: renamed from: b9.v */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C2869v implements InterfaceC38051f, InterfaceC18102o, InterfaceC24550h {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f11405w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f11406x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f11407y;

    public /* synthetic */ C2869v(Object obj, int i13, int i14) {
        this.f11405w = i14;
        this.f11407y = obj;
        this.f11406x = i13;
    }

    @Override // p607x8.InterfaceC38051f
    /* JADX INFO: renamed from: invoke */
    public void mo134038invoke(Object obj) {
        switch (this.f11405w) {
            case 0:
                ((InterfaceC34595h0) obj).onTimelineChanged(((C2822c1) this.f11407y).f11045a, this.f11406x);
                break;
            case 1:
                ((InterfaceC34595h0) obj).onMediaItemTransition((C34626x) this.f11407y, this.f11406x);
                break;
            default:
                ((InterfaceC31582z0) obj).mo97304c((C31545k0) this.f11407y, this.f11406x);
                break;
        }
    }

    @Override // p211i5.InterfaceC18102o
    /* JADX INFO: renamed from: m */
    public boolean mo2226m(View view) {
        ((SideSheetBehavior) this.f11407y).m15775I(this.f11406x);
        return true;
    }
}
