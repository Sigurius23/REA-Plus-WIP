package p027b3;

import android.view.ViewTreeObserver;
import androidx.compose.p018ui.platform.AndroidComposeView;
import com.amplitude.android.engagement.C4861a;
import com.google.crypto.tink.internal.C5101l0;
import p197hj.EnumC17339v;

/* JADX INFO: renamed from: b3.k */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewTreeObserverOnGlobalLayoutListenerC2396k implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9448w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f9449x;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC2396k(Object obj, int i13) {
        this.f9448w = i13;
        this.f9449x = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i13 = this.f9448w;
        Object obj = this.f9449x;
        switch (i13) {
            case 0:
                Class cls = AndroidComposeView.f4886h1;
                ((AndroidComposeView) obj).m3582O();
                break;
            default:
                C4861a c4861a = (C4861a) obj;
                C5101l0 c5101l0 = C4861a.f20259o;
                if (4 <= ((EnumC17339v) c5101l0.f21444y).f67150w) {
                    c5101l0.m16045Z(EnumC17339v.DEBUG, "OnGlobalLayout Listener fired, publishing view hierarchy mutation");
                }
                c4861a.f20263d.m53801a("globalThis.viewHierarchyMutationActions.publishViewHierarchyMutation()", null);
                break;
        }
    }
}
