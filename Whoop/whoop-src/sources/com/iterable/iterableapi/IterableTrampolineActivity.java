package com.iterable.iterableapi;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import e93.AbstractC12889b;
import p098dt.AbstractC12350b;
import p314m.AbstractActivityC24852m;

/* JADX INFO: loaded from: classes6.dex */
public class IterableTrampolineActivity extends AbstractActivityC24852m {
    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC12350b.m34577Z("TrampolineActivity", "Notification Trampoline Activity created");
    }

    @Override // p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        AbstractC12350b.m34577Z("TrampolineActivity", "Notification Trampoline Activity destroyed");
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public final void onPause() {
        super.onPause();
        AbstractC12350b.m34577Z("TrampolineActivity", "Notification Trampoline Activity on pause");
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public final void onResume() {
        super.onResume();
        AbstractC12350b.m34577Z("TrampolineActivity", "Notification Trampoline Activity resumed");
        Intent intent = getIntent();
        if (intent == null) {
            AbstractC12350b.m34593n("TrampolineActivity", "Intent is null. Doing nothing.");
            finish();
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            AbstractC12350b.m34593n("TrampolineActivity", "Intent action is null. Doing nothing.");
            finish();
            return;
        }
        ((NotificationManager) getSystemService("notification")).cancel(intent.getIntExtra("requestCode", 0));
        AbstractC12889b.m36294x(this);
        if ("com.iterable.push.ACTION_PUSH_ACTION".equalsIgnoreCase(action)) {
            AbstractC12889b.m36245K(this, intent);
        }
        finish();
    }
}
