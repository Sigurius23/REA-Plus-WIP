package p454r9;

import android.content.Context;
import android.opengl.GLSurfaceView;
import p010a9.AbstractC0583h;

/* JADX INFO: renamed from: r9.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C31086k extends GLSurfaceView implements InterfaceC31087l {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ int f128214x = 0;

    /* JADX INFO: renamed from: w */
    public final C31085j f128215w;

    public C31086k(Context context) {
        super(context, null);
        C31085j c31085j = new C31085j(this);
        this.f128215w = c31085j;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(c31085j);
        setRenderMode(0);
    }

    @Deprecated
    public InterfaceC31087l getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(AbstractC0583h abstractC0583h) {
        C31085j c31085j = this.f128215w;
        if (c31085j.f128208F.getAndSet(abstractC0583h) != null) {
            throw new ClassCastException();
        }
        c31085j.f128210w.requestRender();
    }
}
