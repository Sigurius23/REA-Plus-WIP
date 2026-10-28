package com.mapbox.common.module.okhttp;

import android.util.Log;
import com.mapbox.common.NetworkUsageMetricsMeter;
import java.io.IOException;
import p047c9.C4316g;
import ud3.AbstractC34798a0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34821j;
import ud3.InterfaceC34853z;
import zd3.C40571o;

/* JADX INFO: loaded from: classes6.dex */
public class NetworkUsageListener extends AbstractC34798a0 {
    public static NetworkUsageMetricCallback CALLBACK = null;
    public static final InterfaceC34853z FACTORY = new C4316g(16);
    private static final String TAG = "CommonNetworkUsage";
    private long bytesRequest;
    private long bytesResponse;
    private boolean reported;

    public interface NetworkUsageMetricCallback {
        void onBytesTransferred(String str, long j7, long j13);
    }

    private NetworkUsageListener() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC34798a0 lambda$static$0(InterfaceC34821j interfaceC34821j) {
        return new NetworkUsageListener();
    }

    private void notifyCallback(InterfaceC34821j interfaceC34821j) {
        if (this.reported) {
            return;
        }
        String str = ((C40571o) interfaceC34821j).f174722x.f146712a.f146570i;
        NetworkUsageMetricCallback networkUsageMetricCallback = CALLBACK;
        if (networkUsageMetricCallback != null) {
            try {
                networkUsageMetricCallback.onBytesTransferred(str, this.bytesRequest, this.bytesResponse);
            } catch (NullPointerException e5) {
                Log.w(TAG, "notifyCallback failed: ", e5);
            }
        }
        notifyInternalMetrics(str, (int) this.bytesRequest, (int) this.bytesResponse);
        this.reported = true;
    }

    public static void notifyInternalMetrics(String str, int i13, int i14) {
        NetworkUsageMetricsMeter.onBytesTransferred(str, i13, i14);
    }

    @Override // ud3.AbstractC34798a0
    public void callEnd(InterfaceC34821j interfaceC34821j) {
        super.callEnd(interfaceC34821j);
        notifyCallback(interfaceC34821j);
    }

    @Override // ud3.AbstractC34798a0
    public void callFailed(InterfaceC34821j interfaceC34821j, IOException iOException) {
        super.callFailed(interfaceC34821j, iOException);
        notifyCallback(interfaceC34821j);
    }

    @Override // ud3.AbstractC34798a0
    public void requestBodyEnd(InterfaceC34821j interfaceC34821j, long j7) {
        super.requestBodyEnd(interfaceC34821j, j7);
        this.bytesRequest += j7;
    }

    @Override // ud3.AbstractC34798a0
    public void requestHeadersEnd(InterfaceC34821j interfaceC34821j, C34832o0 c34832o0) {
        super.requestHeadersEnd(interfaceC34821j, c34832o0);
        long j7 = this.bytesRequest;
        String[] strArr = c34832o0.f146714c.f146548w;
        long length = strArr.length * 2;
        for (String str : strArr) {
            length += (long) str.length();
        }
        this.bytesRequest = length + j7;
    }

    @Override // ud3.AbstractC34798a0
    public void responseBodyEnd(InterfaceC34821j interfaceC34821j, long j7) {
        super.responseBodyEnd(interfaceC34821j, j7);
        this.bytesResponse += j7;
    }

    @Override // ud3.AbstractC34798a0
    public void responseHeadersEnd(InterfaceC34821j interfaceC34821j, C34850x0 c34850x0) {
        super.responseHeadersEnd(interfaceC34821j, c34850x0);
        long j7 = this.bytesResponse;
        String[] strArr = c34850x0.f146777F.f146548w;
        long length = strArr.length * 2;
        for (String str : strArr) {
            length += (long) str.length();
        }
        this.bytesResponse = length + j7;
    }
}
