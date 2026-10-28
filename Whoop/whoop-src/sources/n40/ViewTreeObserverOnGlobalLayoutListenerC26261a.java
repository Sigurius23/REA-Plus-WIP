package n40;

import android.view.View;
import android.view.ViewTreeObserver;
import com.whoop.community.presentation.login.JoinTeamLandingActivity;
import java.util.WeakHashMap;
import p184h5.AbstractC16880i0;
import p184h5.AbstractC16901p0;
import p184h5.C16905q1;
import p390p1.InterfaceC28601c1;

/* JADX INFO: renamed from: n40.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ViewTreeObserverOnGlobalLayoutListenerC26261a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f104415w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ View f104416x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f104417y;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC26261a(View view, int i13, Object obj) {
        this.f104415w = i13;
        this.f104416x = view;
        this.f104417y = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i13 = this.f104415w;
        Object obj = this.f104417y;
        View view = this.f104416x;
        switch (i13) {
            case 0:
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) obj;
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                C16905q1 c16905q1M47522a = AbstractC16880i0.m47522a(view);
                interfaceC28601c1.setValue(Boolean.valueOf(c16905q1M47522a != null ? c16905q1M47522a.f64864a.mo47535q(8) : true));
                break;
            default:
                JoinTeamLandingActivity.m19378b0(view, (JoinTeamLandingActivity) obj);
                break;
        }
    }
}
