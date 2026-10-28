package mp0;

import android.view.View;

/* JADX INFO: renamed from: mp0.y0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ViewOnClickListenerC25865y0 implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f101952w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C25867z0 f101953x;

    public /* synthetic */ ViewOnClickListenerC25865y0(C25867z0 c25867z0, int i13) {
        this.f101952w = i13;
        this.f101953x = c25867z0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f101952w) {
            case 0:
                C25867z0.m76435X(this.f101953x, view);
                break;
            default:
                C25867z0.m76437Z(this.f101953x, view);
                break;
        }
    }
}
