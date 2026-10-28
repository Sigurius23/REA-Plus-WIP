package no.nordicsemi.android.dfu;

/* JADX INFO: loaded from: classes3.dex */
public interface DfuProgressListener {
    void onDeviceConnected(String str);

    void onDeviceConnecting(String str);

    void onDeviceDisconnected(String str);

    void onDeviceDisconnecting(String str);

    void onDfuAborted(String str);

    void onDfuCompleted(String str);

    void onDfuProcessStarted(String str);

    void onDfuProcessStarting(String str);

    void onEnablingDfuMode(String str);

    void onError(String str, int i13, int i14, String str2);

    void onFirmwareValidating(String str);

    void onProgressChanged(String str, int i13, float f13, float f14, int i14, int i15);
}
