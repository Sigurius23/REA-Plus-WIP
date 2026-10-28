package mp0;

import android.view.View;

/* JADX INFO: renamed from: mp0.y */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ViewOnClickListenerC25864y implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f101950w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C25818b0 f101951x;

    public /* synthetic */ ViewOnClickListenerC25864y(C25818b0 c25818b0, int i13) {
        this.f101950w = i13;
        this.f101951x = c25818b0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f101950w) {
            case 0:
                C25818b0.m76078N0(this.f101951x, view);
                break;
            default:
                C25818b0.m76082P0(this.f101951x, view);
                break;
        }
    }
}
