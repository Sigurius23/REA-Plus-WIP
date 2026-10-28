package live.hms.videoview.textureview;

import android.os.Handler;
import android.os.Looper;
import hms.webrtc.RendererCommon;
import io.sentry.RunnableC20277c7;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"live/hms/videoview/textureview/HMSTextureRenderer$init$1$1", "Lhms/webrtc/RendererCommon$RendererEvents;", "Ll83/a0;", "onFirstFrameRendered", "()V", "", "width", "height", "rotation", "onFrameResolutionChanged", "(III)V", "videoview_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSTextureRenderer$init$1$1 implements RendererCommon.RendererEvents {
    final /* synthetic */ HMSTextureRenderer this$0;

    public HMSTextureRenderer$init$1$1(HMSTextureRenderer hMSTextureRenderer) {
        this.this$0 = hMSTextureRenderer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFirstFrameRendered$lambda$0(HMSTextureRenderer this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        this$0.getVideoTrackManager().onFirstFrameRendered();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFrameResolutionChanged$lambda$1(HMSTextureRenderer this$0, int i13, int i14, int i15) {
        AbstractC22676k.m65750j(this$0, "this$0");
        this$0.getVideoTrackManager().onFrameResolutionChanged(i13, i14, i15);
        this$0.surfaceTexture.setDefaultBufferSize(i13, i14);
    }

    @Override // hms.webrtc.RendererCommon.RendererEvents
    public void onFirstFrameRendered() {
        new Handler(Looper.getMainLooper()).post(new RunnableC20277c7(this.this$0, 29));
    }

    @Override // hms.webrtc.RendererCommon.RendererEvents
    public void onFrameResolutionChanged(final int width, int height, final int rotation) {
        int i13 = rotation % 180;
        final int i14 = i13 == 0 ? width : height;
        if (i13 == 0) {
            width = height;
        }
        Handler handler = new Handler(Looper.getMainLooper());
        final HMSTextureRenderer hMSTextureRenderer = this.this$0;
        handler.post(new Runnable() { // from class: live.hms.videoview.textureview.b
            @Override // java.lang.Runnable
            public final void run() {
                HMSTextureRenderer$init$1$1.onFrameResolutionChanged$lambda$1(hMSTextureRenderer, i14, width, rotation);
            }
        });
    }
}
