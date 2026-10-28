package hms.webrtc;

/* JADX INFO: renamed from: hms.webrtc.e */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class RunnableC17481e implements Runnable {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f67580E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f67581F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67582w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f67583x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f67584y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f67585z;

    public /* synthetic */ RunnableC17481e(Object obj, Object obj2, Object obj3, float f13, boolean z4, int i13) {
        this.f67582w = i13;
        this.f67585z = obj;
        this.f67580E = obj2;
        this.f67581F = obj3;
        this.f67583x = f13;
        this.f67584y = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f67582w) {
            case 0:
                ((EglRenderer) this.f67585z).lambda$addFrameListener$3((RendererCommon.GlDrawer) this.f67580E, (EglRenderer.FrameListener) this.f67581F, this.f67583x, this.f67584y);
                break;
            default:
                ((org.webrtc.EglRenderer) this.f67585z).lambda$addFrameListener$1((org.webrtc.RendererCommon.GlDrawer) this.f67580E, (org.webrtc.EglRenderer.FrameListener) this.f67581F, this.f67583x, this.f67584y);
                break;
        }
    }
}
