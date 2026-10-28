package live.hms.video.media.capturers;

import android.content.Context;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicBoolean;
import live.hms.video.utils.HMSLogger;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b \u0010!R\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, m65681d2 = {"Llive/hms/video/media/capturers/HMSWavCapturer;", "Llive/hms/video/media/capturers/HMSCapturer;", "Landroid/content/Context;", "context", "", "sampleRate", "numChannels", "bitsPerSample", "<init>", "(Landroid/content/Context;III)V", "rawRes", "Ll83/a0;", "loadUrl", "(I)V", "Ljava/nio/ByteBuffer;", "destBuffer", "", "readNext10ms", "(Ljava/nio/ByteBuffer;)Z", "close", "()V", "start", "stop", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "I", "Ljava/io/InputStream;", "fileInputStream", "Ljava/io/InputStream;", "bytesPer10ms", "", "TAG", "Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isStarted", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "", "lock", "Ljava/lang/Object;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSWavCapturer implements HMSCapturer {
    private final String TAG;
    private final int bitsPerSample;
    private int bytesPer10ms;
    private final Context context;
    private InputStream fileInputStream;
    private final AtomicBoolean isStarted;
    private final Object lock;
    private final int numChannels;
    private final int sampleRate;

    public HMSWavCapturer(Context context, int i13, int i14, int i15) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
        this.sampleRate = i13;
        this.numChannels = i14;
        this.bitsPerSample = i15;
        this.bytesPer10ms = -1;
        this.TAG = "HMSWavCapturer";
        this.isStarted = new AtomicBoolean(false);
        this.lock = new Object();
    }

    public final void close() {
        synchronized (this.lock) {
            HMSLogger.m71136d(this.TAG, "close");
            this.isStarted.set(false);
            try {
                InputStream inputStream = this.fileInputStream;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Throwable th3) {
                AbstractC34132o.m107888l(th3);
            }
        }
    }

    @Override // live.hms.video.media.capturers.HMSCapturer
    public void dispose() {
        HMSCapturer.DefaultImpls.dispose(this);
    }

    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: isStarted, reason: from getter */
    public final AtomicBoolean getIsStarted() {
        return this.isStarted;
    }

    public final void loadUrl(int rawRes) {
        synchronized (this.lock) {
            HMSLogger.m71136d(this.TAG, "loadUrl");
            this.isStarted.set(true);
            try {
                InputStream inputStream = this.fileInputStream;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Throwable th3) {
                AbstractC34132o.m107888l(th3);
            }
            InputStream inputStreamOpenRawResource = this.context.getResources().openRawResource(rawRes);
            this.fileInputStream = inputStreamOpenRawResource;
            if (inputStreamOpenRawResource == null) {
                throw new IllegalStateException("Failed to open raw resource for resource id: " + rawRes);
            }
            if (inputStreamOpenRawResource.skip(44L) < 44) {
                this.isStarted.set(false);
                HMSLogger.m71137e(this.TAG, "Invalid or corrupt WAV file (header too short).");
                throw new IllegalArgumentException("Invalid or corrupt WAV file: header too short");
            }
            int i13 = (((this.sampleRate * (this.bitsPerSample / 8)) * this.numChannels) * 10) / 1000;
            this.bytesPer10ms = i13;
            if (i13 <= 0) {
                this.isStarted.set(false);
                HMSLogger.m71137e(this.TAG, "Invalid WAV file: bytesPer10ms <= 0");
                throw new IllegalStateException("Invalid WAV file: bytesPer10ms <= 0");
            }
            HMSLogger.m71136d(this.TAG, "WAV file loaded successfully.");
        }
    }

    public final boolean readNext10ms(ByteBuffer destBuffer) {
        AbstractC22676k.m65750j(destBuffer, "destBuffer");
        synchronized (this.lock) {
            if (!this.isStarted.get()) {
                HMSLogger.m71137e(this.TAG, "WAV file not loaded.");
                return false;
            }
            destBuffer.order(ByteOrder.LITTLE_ENDIAN);
            destBuffer.clear();
            int i13 = this.bytesPer10ms;
            byte[] bArr = new byte[i13];
            InputStream inputStream = this.fileInputStream;
            if (inputStream == null) {
                return false;
            }
            if (inputStream.read(bArr, 0, i13) < this.bytesPer10ms) {
                HMSLogger.m71136d(this.TAG, "End of WAV file reached.");
                this.isStarted.set(false);
                return false;
            }
            destBuffer.put(bArr);
            destBuffer.flip();
            return true;
        }
    }

    @Override // live.hms.video.media.capturers.HMSCapturer
    public void start() {
    }

    @Override // live.hms.video.media.capturers.HMSCapturer
    public void stop() {
    }

    public /* synthetic */ HMSWavCapturer(Context context, int i13, int i14, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i13, (i16 & 4) != 0 ? 1 : i14, (i16 & 8) != 0 ? 16 : i15);
    }
}
