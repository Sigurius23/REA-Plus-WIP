package q53;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.TextureView;
import java.util.concurrent.CountDownLatch;
import lr.RunnableC24693e;
import org.webrtc.EglRenderer;
import org.webrtc.RendererCommon;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q53.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractTextureViewSurfaceTextureListenerC29990b extends TextureView implements VideoSink, TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: E */
    public int f122472E;

    /* JADX INFO: renamed from: F */
    public int f122473F;

    /* JADX INFO: renamed from: G */
    public int f122474G;

    /* JADX INFO: renamed from: w */
    public final RendererCommon.VideoLayoutMeasure f122475w;

    /* JADX INFO: renamed from: x */
    public final EglRenderer f122476x;

    /* JADX INFO: renamed from: y */
    public final Handler f122477y;

    /* JADX INFO: renamed from: z */
    public boolean f122478z;

    public AbstractTextureViewSurfaceTextureListenerC29990b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String resourceName = getResourceName();
        this.f122475w = new RendererCommon.VideoLayoutMeasure();
        this.f122476x = new EglRenderer(resourceName);
        this.f122477y = new Handler(Looper.getMainLooper());
        setSurfaceTextureListener(this);
    }

    private final String getResourceName() {
        try {
            return getResources().getResourceEntryName(getId()) + ": ";
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.f122476x.release();
        super.onDetachedFromWindow();
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        AbstractC22676k.m65750j(videoFrame, "videoFrame");
        this.f122476x.onFrame(videoFrame);
        if (!this.f122478z) {
            this.f122478z = true;
        }
        if (videoFrame.getRotatedWidth() == this.f122472E && videoFrame.getRotatedHeight() == this.f122473F && videoFrame.getRotation() == this.f122474G) {
            return;
        }
        this.f122472E = videoFrame.getRotatedWidth();
        this.f122473F = videoFrame.getRotatedHeight();
        this.f122474G = videoFrame.getRotation();
        final int i13 = 0;
        post(new Runnable(this) { // from class: q53.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AbstractTextureViewSurfaceTextureListenerC29990b f122471x;

            {
                this.f122471x = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        AbstractTextureViewSurfaceTextureListenerC29990b this$0 = this.f122471x;
                        AbstractC22676k.m65750j(this$0, "this$0");
                        this$0.requestLayout();
                        break;
                    default:
                        AbstractC22676k.m65750j(this.f122471x, "this$0");
                        break;
                }
            }
        });
        final int i14 = 1;
        this.f122477y.post(new Runnable(this) { // from class: q53.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AbstractTextureViewSurfaceTextureListenerC29990b f122471x;

            {
                this.f122471x = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        AbstractTextureViewSurfaceTextureListenerC29990b this$0 = this.f122471x;
                        AbstractC22676k.m65750j(this$0, "this$0");
                        this$0.requestLayout();
                        break;
                    default:
                        AbstractC22676k.m65750j(this.f122471x, "this$0");
                        break;
                }
            }
        });
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        this.f122476x.setLayoutAspectRatio((i15 - i13) / (i16 - i14));
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        ThreadUtils.checkIsOnMainThread();
        Point pointMeasure = this.f122475w.measure(i13, i14, this.f122472E, this.f122473F);
        AbstractC22676k.m65749i(pointMeasure, "measure(...)");
        setMeasuredDimension(pointMeasure.x, pointMeasure.y);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i13, int i14) {
        AbstractC22676k.m65750j(surfaceTexture, "surfaceTexture");
        this.f122476x.createEglSurface(surfaceTexture);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        AbstractC22676k.m65750j(surfaceTexture, "surfaceTexture");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f122476x.releaseEglSurface(new RunnableC24693e(countDownLatch, 9));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i13, int i14) {
        AbstractC22676k.m65750j(surfaceTexture, "surfaceTexture");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        AbstractC22676k.m65750j(surfaceTexture, "surfaceTexture");
    }

    public final void setMirror(boolean z4) {
        this.f122476x.setMirror(z4);
    }

    public final void setScalingType(RendererCommon.ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        this.f122475w.setScalingType(scalingType);
        requestLayout();
    }
}
