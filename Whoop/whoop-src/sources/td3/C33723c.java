package td3;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import androidx.profileinstaller.RunnableC1650a;
import java.util.List;
import p031b9.RunnableC2833g0;
import p450r5.RunnableC30928b;

/* JADX INFO: renamed from: td3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C33723c extends ScanCallback {

    /* JADX INFO: renamed from: a */
    public long f141052a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C33724d f141053b;

    public C33723c(C33724d c33724d) {
        this.f141053b = c33724d;
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onBatchScanResults(List list) {
        this.f141053b.f141046i.post(new RunnableC30928b(13, this, list));
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanFailed(int i13) {
        this.f141053b.f141046i.post(new RunnableC2833g0(this, i13, 8));
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanResult(int i13, ScanResult scanResult) {
        this.f141053b.f141046i.post(new RunnableC1650a(this, scanResult, i13, 5));
    }
}
