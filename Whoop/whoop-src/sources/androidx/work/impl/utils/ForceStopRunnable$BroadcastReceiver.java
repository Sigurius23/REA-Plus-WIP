package androidx.work.impl.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import p218ic.C18389w;
import p457rc.RunnableC31219b;

/* JADX INFO: loaded from: classes.dex */
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final String f7363a = C18389w.m52887f("ForceStopRunnable$Rcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            return;
        }
        if (C18389w.m52886d().f71556a <= 2) {
            Log.v(f7363a, "Rescheduling alarm that keeps track of force-stops.");
        }
        RunnableC31219b.m96157c(context);
    }
}
