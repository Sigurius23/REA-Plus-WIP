package no.nordicsemi.android.dfu.internal.scanner;

/* JADX INFO: renamed from: no.nordicsemi.android.dfu.internal.scanner.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC26931a implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107445w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f107446x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ BootloaderScanner f107447y;

    public /* synthetic */ RunnableC26931a(BootloaderScanner bootloaderScanner, long j7, int i13) {
        this.f107445w = i13;
        this.f107447y = bootloaderScanner;
        this.f107446x = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f107445w) {
            case 0:
                ((BootloaderScannerLollipop) this.f107447y).lambda$searchUsing$0(this.f107446x);
                break;
            default:
                ((BootloaderScannerJB) this.f107447y).lambda$searchUsing$0(this.f107446x);
                break;
        }
    }
}
