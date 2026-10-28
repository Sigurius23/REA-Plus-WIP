package hms.webrtc;

/* JADX INFO: renamed from: hms.webrtc.b */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class RunnableC17478b implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67575w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Camera1Session.C174292 f67576x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ byte[] f67577y;

    public /* synthetic */ RunnableC17478b(Camera1Session.C174292 c174292, byte[] bArr, int i13) {
        this.f67575w = i13;
        this.f67576x = c174292;
        this.f67577y = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f67575w) {
            case 0:
                this.f67576x.lambda$onPreviewFrame$1(this.f67577y);
                break;
            default:
                this.f67576x.lambda$onPreviewFrame$0(this.f67577y);
                break;
        }
    }
}
