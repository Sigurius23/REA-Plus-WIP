package hms.webrtc;

/* JADX INFO: renamed from: hms.webrtc.f */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class RunnableC17482f implements Runnable {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ float f67586E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f67587F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67588w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f67589x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f67590y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f67591z;

    public /* synthetic */ RunnableC17482f(Object obj, float f13, float f14, float f15, float f16, int i13) {
        this.f67588w = i13;
        this.f67587F = obj;
        this.f67589x = f13;
        this.f67590y = f14;
        this.f67591z = f15;
        this.f67586E = f16;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f67588w) {
            case 0:
                ((EglRenderer) this.f67587F).lambda$clearImage$6(this.f67589x, this.f67590y, this.f67591z, this.f67586E);
                break;
            default:
                ((org.webrtc.EglRenderer) this.f67587F).lambda$clearImage$5(this.f67589x, this.f67590y, this.f67591z, this.f67586E);
                break;
        }
    }
}
