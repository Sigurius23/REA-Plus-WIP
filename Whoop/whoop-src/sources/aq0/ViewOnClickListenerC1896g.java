package aq0;

import android.view.View;

/* JADX INFO: renamed from: aq0.g */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ViewOnClickListenerC1896g implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7449w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C1906q f7450x;

    public /* synthetic */ ViewOnClickListenerC1896g(C1906q c1906q, int i13) {
        this.f7449w = i13;
        this.f7450x = c1906q;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f7449w) {
            case 0:
                C1906q.m5692F2(this.f7450x, view);
                break;
            default:
                C1906q.m5687E1(this.f7450x, view);
                break;
        }
    }
}
