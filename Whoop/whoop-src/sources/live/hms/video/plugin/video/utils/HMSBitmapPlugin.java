package live.hms.video.plugin.video.utils;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;
import android.os.Handler;
import hms.webrtc.SurfaceTextureHelper;
import hms.webrtc.TextureBufferImpl;
import hms.webrtc.VideoFrame;
import hms.webrtc.YuvConverter;
import java.util.concurrent.ConcurrentLinkedDeque;
import l83.C23454a0;
import live.hms.video.media.tracks.HMSLocalVideoTrack;
import live.hms.video.plugin.video.HMSVideoPlugin;
import live.hms.video.plugin.video.HMSVideoPluginType;
import live.hms.video.plugin.video.utils.HMSBitmapPlugin;
import live.hms.video.sdk.HMSPluginResultListener;
import live.hms.video.sdk.HMSSDK;
import live.hms.video.sdk.ProcessTimeVariables;
import live.hms.video.sdk.models.HMSLocalPeer;
import live.hms.video.utils.HMSLogger;
import live.hms.video.utils.VideoFrameToBitmapConverter;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 N2\u00020\u0001:\u0001NB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\"H\u0016¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010<R\u0016\u0010>\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010<R\u0016\u0010?\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010<R\u0016\u0010@\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010<R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010GR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010IR\u001c\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00100J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00100J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010L¨\u0006O"}, m65681d2 = {"Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;", "Llive/hms/video/plugin/video/HMSVideoPlugin;", "Llive/hms/video/sdk/HMSSDK;", "hmsSDK", "Llive/hms/video/plugin/video/utils/HMSBitmapUpdateListener;", "hmsBitmapUpdateListener", "<init>", "(Llive/hms/video/sdk/HMSSDK;Llive/hms/video/plugin/video/utils/HMSBitmapUpdateListener;)V", "", "newWidth", "newHeight", "Ll83/a0;", "initInputTextureBuffer", "(II)V", "Landroid/graphics/Bitmap;", "newBitmap", "", "frameTs", "Llive/hms/video/sdk/HMSPluginResultListener;", "outputListener", "startTime", "drawOutputBitmapOnFrame", "(Landroid/graphics/Bitmap;JLlive/hms/video/sdk/HMSPluginResultListener;J)V", "Llive/hms/video/plugin/video/HMSVideoPluginType;", "getPluginType", "()Llive/hms/video/plugin/video/HMSVideoPluginType;", "Lhms/webrtc/VideoFrame;", "inputVideoFrame", "", "skipProcessing", "processVideoFrame", "(Lhms/webrtc/VideoFrame;Llive/hms/video/sdk/HMSPluginResultListener;Ljava/lang/Boolean;)V", "stop", "()V", "", "getName", "()Ljava/lang/String;", "isSupported", "()Z", "init", "(Lq83/d;)Ljava/lang/Object;", "key", "setKey", "(Ljava/lang/String;)V", "Llive/hms/video/sdk/HMSSDK;", "getHmsSDK", "()Llive/hms/video/sdk/HMSSDK;", "Llive/hms/video/plugin/video/utils/HMSBitmapUpdateListener;", "getHmsBitmapUpdateListener", "()Llive/hms/video/plugin/video/utils/HMSBitmapUpdateListener;", "Lhms/webrtc/YuvConverter;", "yuvConverter", "Lhms/webrtc/YuvConverter;", "Lhms/webrtc/VideoFrame$TextureBuffer;", "inputTextureBuffer", "Lhms/webrtc/VideoFrame$TextureBuffer;", "Lhms/webrtc/SurfaceTextureHelper;", "surfTextureHelper", "Lhms/webrtc/SurfaceTextureHelper;", "inputWidth", "I", "inputHeight", "originalWidth", "originalHeight", "originalFps", "", "imageAspectRatio", "F", "inputFrameBitmap", "Landroid/graphics/Bitmap;", "effectsKey", "Ljava/lang/String;", "name", "Llive/hms/video/sdk/HMSPluginResultListener;", "Ljava/util/concurrent/ConcurrentLinkedDeque;", "startTimeQueue", "Ljava/util/concurrent/ConcurrentLinkedDeque;", "inputTimeQueue", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSBitmapPlugin implements HMSVideoPlugin {
    public static final String TAG = "HMSBitmapPlugin";
    private String effectsKey;
    private final HMSBitmapUpdateListener hmsBitmapUpdateListener;
    private final HMSSDK hmsSDK;
    private float imageAspectRatio;
    private Bitmap inputFrameBitmap;
    private int inputHeight;
    private VideoFrame.TextureBuffer inputTextureBuffer;
    private ConcurrentLinkedDeque<Long> inputTimeQueue;
    private int inputWidth;
    private String name;
    private int originalFps;
    private int originalHeight;
    private int originalWidth;
    private HMSPluginResultListener outputListener;
    private ConcurrentLinkedDeque<Long> startTimeQueue;
    private SurfaceTextureHelper surfTextureHelper;
    private final YuvConverter yuvConverter;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static int[] textures = new int[1];
    private static int MIN_API_LEVEL = 21;
    private static final int DEFAULT_BLUR_PERCENTAGE = 75;

    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\rX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, m65681d2 = {"Llive/hms/video/plugin/video/utils/HMSBitmapPlugin$Companion;", "", "<init>", "()V", "TAG", "", "textures", "", "getTextures", "()[I", "setTextures", "([I)V", "MIN_API_LEVEL", "", "getMIN_API_LEVEL", "()I", "setMIN_API_LEVEL", "(I)V", "DEFAULT_BLUR_PERCENTAGE", "getDEFAULT_BLUR_PERCENTAGE", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDEFAULT_BLUR_PERCENTAGE() {
            return HMSBitmapPlugin.DEFAULT_BLUR_PERCENTAGE;
        }

        public final int getMIN_API_LEVEL() {
            return HMSBitmapPlugin.MIN_API_LEVEL;
        }

        public final int[] getTextures() {
            return HMSBitmapPlugin.textures;
        }

        public final void setMIN_API_LEVEL(int i13) {
            HMSBitmapPlugin.MIN_API_LEVEL = i13;
        }

        public final void setTextures(int[] iArr) {
            AbstractC22676k.m65750j(iArr, "<set-?>");
            HMSBitmapPlugin.textures = iArr;
        }

        private Companion() {
        }
    }

    public HMSBitmapPlugin(HMSSDK hmsSDK, HMSBitmapUpdateListener hmsBitmapUpdateListener) {
        AbstractC22676k.m65750j(hmsSDK, "hmsSDK");
        AbstractC22676k.m65750j(hmsBitmapUpdateListener, "hmsBitmapUpdateListener");
        this.hmsSDK = hmsSDK;
        this.hmsBitmapUpdateListener = hmsBitmapUpdateListener;
        this.yuvConverter = new YuvConverter();
        this.imageAspectRatio = 1.0f;
        this.name = "@100mslive/hms-bitmap-plugin";
        GLES20.glGenTextures(1, textures, 0);
        this.startTimeQueue = new ConcurrentLinkedDeque<>();
        this.inputTimeQueue = new ConcurrentLinkedDeque<>();
    }

    private final void drawOutputBitmapOnFrame(final Bitmap newBitmap, final long frameTs, final HMSPluginResultListener outputListener, final long startTime) {
        SurfaceTextureHelper surfaceTextureHelper;
        SurfaceTextureHelper surfaceTextureHelper2;
        Handler handler;
        if (newBitmap == null || (surfaceTextureHelper = this.surfTextureHelper) == null || surfaceTextureHelper.getHandler() == null || (surfaceTextureHelper2 = this.surfTextureHelper) == null || (handler = surfaceTextureHelper2.getHandler()) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: hd3.a
            @Override // java.lang.Runnable
            public final void run() {
                HMSBitmapPlugin.drawOutputBitmapOnFrame$lambda$3(newBitmap, this, outputListener, frameTs, startTime);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void drawOutputBitmapOnFrame$lambda$3(Bitmap newBitmap, HMSBitmapPlugin this$0, HMSPluginResultListener hMSPluginResultListener, long j7, long j13) {
        AbstractC22676k.m65750j(newBitmap, "$newBitmap");
        AbstractC22676k.m65750j(this$0, "this$0");
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLUtils.texImage2D(3553, 0, newBitmap, 0);
        VideoFrame.I420Buffer i420BufferConvert = this$0.yuvConverter.convert(this$0.inputTextureBuffer);
        if (hMSPluginResultListener != null) {
            hMSPluginResultListener.onOutputResult(new VideoFrame(i420BufferConvert, 180, j7));
        }
        ProcessTimeVariables processTimeVariables = ProcessTimeVariables.INSTANCE;
        processTimeVariables.setTimeTakenWithoutML(System.currentTimeMillis() - j13);
        if (hMSPluginResultListener != null) {
            hMSPluginResultListener.onTimeTaken(processTimeVariables);
        }
    }

    private final void initInputTextureBuffer(int newWidth, int newHeight) {
        if (this.inputWidth == newWidth && this.inputHeight == newHeight) {
            return;
        }
        this.inputWidth = newWidth;
        this.inputHeight = newHeight;
        this.imageAspectRatio = newWidth / newHeight;
        VideoFrame.TextureBuffer textureBuffer = this.inputTextureBuffer;
        if (textureBuffer != null) {
            textureBuffer.release();
        }
        int i13 = this.inputWidth;
        int i14 = this.inputHeight;
        VideoFrame.TextureBuffer.Type type = VideoFrame.TextureBuffer.Type.RGB;
        int i15 = textures[0];
        Matrix matrix = new Matrix();
        matrix.postScale(-1.0f, 1.0f);
        SurfaceTextureHelper surfaceTextureHelper = this.surfTextureHelper;
        AbstractC22676k.m65747g(surfaceTextureHelper);
        this.inputTextureBuffer = new TextureBufferImpl(i13, i14, type, i15, matrix, surfaceTextureHelper.getHandler(), this.yuvConverter, (Runnable) null);
    }

    private static final C23454a0 processVideoFrame$lambda$1() {
        HMSLogger.m71137e(TAG, "Could not convert webrtc YUV frame to Bitmap");
        return C23454a0.f92919a;
    }

    public final HMSBitmapUpdateListener getHmsBitmapUpdateListener() {
        return this.hmsBitmapUpdateListener;
    }

    public final HMSSDK getHmsSDK() {
        return this.hmsSDK;
    }

    @Override // live.hms.video.plugin.video.HMSVideoPlugin
    public String getName() {
        return this.name;
    }

    @Override // live.hms.video.plugin.video.HMSVideoPlugin
    public HMSVideoPluginType getPluginType() {
        return HMSVideoPluginType.TRANSFORM;
    }

    @Override // live.hms.video.plugin.video.HMSVideoPlugin
    public Object init(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // live.hms.video.plugin.video.HMSVideoPlugin
    public boolean isSupported() {
        return Build.VERSION.SDK_INT >= MIN_API_LEVEL;
    }

    @Override // live.hms.video.plugin.video.HMSVideoPlugin
    public void processVideoFrame(VideoFrame inputVideoFrame, HMSPluginResultListener outputListener, Boolean skipProcessing) {
        HMSLocalVideoTrack videoTrack;
        AbstractC22676k.m65750j(inputVideoFrame, "inputVideoFrame");
        HMSLogger hMSLogger = HMSLogger.INSTANCE;
        hMSLogger.m71140v(TAG, "~~ New input frame received ~~");
        this.outputListener = outputListener;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.startTimeQueue.add(Long.valueOf(jCurrentTimeMillis));
        this.inputTimeQueue.add(Long.valueOf(inputVideoFrame.getTimestampNs()));
        if (this.surfTextureHelper == null) {
            HMSLocalPeer localPeer = this.hmsSDK.getLocalPeer();
            this.surfTextureHelper = (localPeer == null || (videoTrack = localPeer.getVideoTrack()) == null) ? null : videoTrack.getTextureHelper();
        }
        Bitmap bitmapConvertToBitmap$default = VideoFrameToBitmapConverter.Companion.convertToBitmap$default(VideoFrameToBitmapConverter.INSTANCE, inputVideoFrame, false, 2, null);
        this.inputFrameBitmap = bitmapConvertToBitmap$default;
        if (bitmapConvertToBitmap$default != null) {
            hMSLogger.m71139i(TAG, AbstractC11266d.m30457k(System.currentTimeMillis() - jCurrentTimeMillis, " ms", new StringBuilder("~~ Time taken to convert input to bitmap :: ")));
            initInputTextureBuffer(bitmapConvertToBitmap$default.getWidth(), bitmapConvertToBitmap$default.getHeight());
            drawOutputBitmapOnFrame(this.hmsBitmapUpdateListener.onFrame(bitmapConvertToBitmap$default), inputVideoFrame.getTimestampNs(), outputListener, jCurrentTimeMillis);
        }
    }

    @Override // live.hms.video.plugin.video.HMSVideoPlugin
    public void setKey(String key) {
        AbstractC22676k.m65750j(key, "key");
        HMSVideoPlugin.DefaultImpls.setKey(this, key);
        this.effectsKey = key;
    }

    @Override // live.hms.video.plugin.video.HMSVideoPlugin
    public void stop() {
        this.originalWidth = 0;
        this.originalHeight = 0;
        this.originalFps = 0;
    }
}
