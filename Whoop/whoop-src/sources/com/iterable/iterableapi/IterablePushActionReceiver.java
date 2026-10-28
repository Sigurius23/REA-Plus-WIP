package com.iterable.iterableapi;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import e93.AbstractC12889b;

/* JADX INFO: loaded from: classes6.dex */
public class IterablePushActionReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ((NotificationManager) context.getSystemService("notification")).cancel(intent.getIntExtra("requestCode", 0));
        AbstractC12889b.m36294x(context);
        if ("com.iterable.push.ACTION_PUSH_ACTION".equalsIgnoreCase(intent.getAction())) {
            AbstractC12889b.m36245K(context, intent);
        }
    }
}
