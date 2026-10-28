package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class OnBillingServiceErrorNative implements OnBillingServiceError {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class OnBillingServiceErrorPeerCleaner implements Runnable {
        private long peer;

        public OnBillingServiceErrorPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnBillingServiceErrorNative.cleanNativePeer(this.peer);
        }
    }

    private OnBillingServiceErrorNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new OnBillingServiceErrorPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.OnBillingServiceError
    public native void run(BillingServiceError billingServiceError);
}
