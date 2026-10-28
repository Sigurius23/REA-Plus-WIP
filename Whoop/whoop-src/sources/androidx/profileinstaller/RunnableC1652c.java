package androidx.profileinstaller;

/* JADX INFO: renamed from: androidx.profileinstaller.c */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC1652c implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f6521w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ProfileInstaller.DiagnosticsCallback f6522x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f6523y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f6524z;

    public /* synthetic */ RunnableC1652c(ProfileInstaller.DiagnosticsCallback diagnosticsCallback, int i13, Object obj, int i14) {
        this.f6521w = i14;
        this.f6522x = diagnosticsCallback;
        this.f6523y = i13;
        this.f6524z = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6521w) {
            case 0:
                this.f6522x.onResultReceived(this.f6523y, this.f6524z);
                break;
            default:
                this.f6522x.onDiagnosticReceived(this.f6523y, this.f6524z);
                break;
        }
    }
}
