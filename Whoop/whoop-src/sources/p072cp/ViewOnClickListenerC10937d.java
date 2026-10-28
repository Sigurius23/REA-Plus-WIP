package p072cp;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* JADX INFO: renamed from: cp.d */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnClickListenerC10937d implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Context f33830w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Intent f33831x;

    public ViewOnClickListenerC10937d(Context context, Intent intent) {
        this.f33830w = context;
        this.f33831x = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f33830w.startActivity(this.f33831x);
        } catch (ActivityNotFoundException e5) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e5);
        }
    }
}
