package rq0;

import android.view.View;

/* JADX INFO: renamed from: rq0.s0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ViewOnClickListenerC31694s0 implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f131220w;

    public /* synthetic */ ViewOnClickListenerC31694s0(int i13) {
        this.f131220w = i13;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f131220w) {
            case 0:
                C31696t0.m98261w0(view);
                break;
            case 1:
                C31696t0.m98202H0(view);
                break;
            default:
                C31696t0.m98204I0(view);
                break;
        }
    }
}
