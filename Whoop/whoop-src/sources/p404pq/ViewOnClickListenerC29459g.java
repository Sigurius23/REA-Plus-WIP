package p404pq;

import android.view.View;

/* JADX INFO: renamed from: pq.g */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnClickListenerC29459g implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ DialogC29463k f119626w;

    public ViewOnClickListenerC29459g(DialogC29463k dialogC29463k) {
        this.f119626w = dialogC29463k;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DialogC29463k dialogC29463k = this.f119626w;
        if (dialogC29463k.f119639K && dialogC29463k.isShowing() && dialogC29463k.m89939o()) {
            dialogC29463k.cancel();
        }
    }
}
