package io.getstream.chat.android.client.audio;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.view.Surface;
import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0016\u00103\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00106R\u0016\u0010;\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010\"R\u0016\u0010<\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010\"R\u0016\u0010=\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010\"R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010@R2\u0010D\u001a\u0012\u0012\u0004\u0012\u00020\u00100Bj\b\u0012\u0004\u0012\u00020\u0010`C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010@R\u0016\u0010K\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u00101¨\u0006L"}, m65681d2 = {"Lio/getstream/chat/android/client/audio/WaveformExtractor;", "", "Landroid/content/Context;", "context", "", "key", "", "expectedPoints", "Lio/getstream/chat/android/client/audio/ExtractorCallBack;", "extractorCallBack", "<init>", "(Landroid/content/Context;Ljava/lang/String;ILio/getstream/chat/android/client/audio/ExtractorCallBack;)V", "path", "Landroid/media/MediaFormat;", "getFormat", "(Ljava/lang/String;)Landroid/media/MediaFormat;", "", "sample", "Ll83/a0;", "rms", "(F)V", "size", "Ljava/nio/ByteBuffer;", "buf", "handle8bit", "(ILjava/nio/ByteBuffer;)V", "handle16bit", "handle32bit", "start", "(Ljava/lang/String;)V", "stop", "()V", "Landroid/content/Context;", "Ljava/lang/String;", "I", "Lio/getstream/chat/android/client/audio/ExtractorCallBack;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Landroid/media/MediaCodec;", "decoder", "Landroid/media/MediaCodec;", "Landroid/media/MediaExtractor;", "extractor", "Landroid/media/MediaExtractor;", "durationInSeconds", "F", NotificationCompat.CATEGORY_PROGRESS, "currentProgress", "", "started", "Z", "Ljava/util/concurrent/CountDownLatch;", "finishCount", "Ljava/util/concurrent/CountDownLatch;", "inputEof", "sampleRate", "channels", "pcmEncodingBit", "", "totalSamples", "J", "samplesPerPoint", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "sampleData", "Ljava/util/ArrayList;", "getSampleData", "()Ljava/util/ArrayList;", "setSampleData", "(Ljava/util/ArrayList;)V", "sampleCount", "squaredSampleSum", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class WaveformExtractor {
    private int channels;
    private final Context context;
    private float currentProgress;
    private MediaCodec decoder;
    private float durationInSeconds;
    private final int expectedPoints;
    private MediaExtractor extractor;
    private final ExtractorCallBack extractorCallBack;
    private final CountDownLatch finishCount;
    private boolean inputEof;
    private final String key;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private int pcmEncodingBit;
    private float progress;
    private long sampleCount;
    private ArrayList<Float> sampleData;
    private int sampleRate;
    private long samplesPerPoint;
    private float squaredSampleSum;
    private volatile boolean started;
    private long totalSamples;

    public WaveformExtractor(Context context, String key, int i13, ExtractorCallBack extractorCallBack) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(extractorCallBack, "extractorCallBack");
        this.context = context;
        this.key = key;
        this.expectedPoints = i13;
        this.extractorCallBack = extractorCallBack;
        this.logger = AbstractC1772c1.m5382S(this, "WaveformExtractor");
        this.finishCount = new CountDownLatch(1);
        this.channels = 1;
        this.pcmEncodingBit = 16;
        this.sampleData = new ArrayList<>();
    }

    private final MediaFormat getFormat(String path) throws IOException {
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.extractor = mediaExtractor;
        mediaExtractor.setDataSource(this.context, Uri.parse(path), (Map<String, String>) null);
        int trackCount = mediaExtractor.getTrackCount();
        for (int i13 = 0; i13 < trackCount; i13++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i13);
            AbstractC22676k.m65749i(trackFormat, "getTrackFormat(...)");
            String string = trackFormat.getString("mime");
            if (string == null) {
                string = "";
            }
            if (AbstractC39414r.m125876U(string, "audio", false)) {
                this.durationInSeconds = trackFormat.getLong("durationUs") / 1000000.0f;
                mediaExtractor.selectTrack(i13);
                return trackFormat;
            }
        }
        return null;
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handle16bit(int size, ByteBuffer buf) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8295h(size, "[handle16bit] size: "), null);
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str2 = logger2.f9273a;
        if (interfaceC2339e2.isLoggable(enumC2341g, str2)) {
            logger2.f9274b.log(enumC2341g, str2, "[handle16bit] this.totalSamples: " + this.totalSamples + ", sampleRate: " + this.sampleRate + ", duration: " + this.durationInSeconds, null);
        }
        int i13 = size / (this.channels == 2 ? 4 : 2);
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = buf.get() | (buf.get() << 8);
            C2345k logger3 = getLogger();
            InterfaceC2339e interfaceC2339e3 = logger3.f9275c;
            String str3 = logger3.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
            if (interfaceC2339e3.isLoggable(enumC2341g2, str3)) {
                logger3.f9274b.log(enumC2341g2, str3, AbstractC2875y.m8295h(i15, "[handle16bit] amplitude: "), null);
            }
            float f13 = i15 / 32767.0f;
            if (this.channels == 2) {
                buf.get();
                buf.get();
            }
            rms(f13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handle32bit(int size, ByteBuffer buf) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8295h(size, "[handle32bit] size: "), null);
        }
        int i13 = size / (this.channels == 2 ? 8 : 4);
        for (int i14 = 0; i14 < i13; i14++) {
            float f13 = (((((long) buf.get()) | (((long) buf.get()) << 8)) | (((long) buf.get()) << 16)) | (((long) buf.get()) << 24)) / 2.1474836E9f;
            if (this.channels == 2) {
                buf.get();
                buf.get();
                buf.get();
                buf.get();
            }
            rms(f13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handle8bit(int size, ByteBuffer buf) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8295h(size, "[handle8bit] size: "), null);
        }
        int i13 = size / (this.channels == 2 ? 2 : 1);
        for (int i14 = 0; i14 < i13; i14++) {
            float f13 = buf.get() / 127.0f;
            if (this.channels == 2) {
                buf.get();
            }
            rms(f13);
        }
    }

    private final void rms(float sample) {
        long j7 = this.sampleCount;
        long j13 = this.samplesPerPoint;
        if (j7 == j13) {
            float f13 = this.currentProgress + 1.0f;
            this.currentProgress = f13;
            float f14 = f13 / this.expectedPoints;
            this.progress = f14;
            if (f14 > 1.0f) {
                stop();
                return;
            }
            float f15 = this.squaredSampleSum / j13;
            float fSqrt = (float) Math.sqrt(f15);
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                InterfaceC2344j interfaceC2344j = logger.f9274b;
                StringBuilder sbM8307t = AbstractC2875y.m8307t("[rms] sample: ", sample, ", averageSquaredSample: ", f15, ", rms: ");
                sbM8307t.append(fSqrt);
                interfaceC2344j.log(enumC2341g, str, sbM8307t.toString(), null);
            }
            this.sampleData.add(Float.valueOf(fSqrt));
            this.extractorCallBack.onProgress(this, this.progress);
            this.sampleCount = 0L;
            this.squaredSampleSum = 0.0f;
            HashMap map = new HashMap();
            map.put("waveformData", this.sampleData);
            map.put(NotificationCompat.CATEGORY_PROGRESS, Float.valueOf(this.progress));
            map.put("playerKey", this.key);
        }
        this.sampleCount++;
        this.squaredSampleSum += (float) Math.pow(sample, 2.0f);
    }

    public final ArrayList<Float> getSampleData() {
        return this.sampleData;
    }

    public final void setSampleData(ArrayList<Float> arrayList) {
        AbstractC22676k.m65750j(arrayList, "<set-?>");
        this.sampleData = arrayList;
    }

    public final void start(String path) {
        AbstractC22676k.m65750j(path, "path");
        try {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            EnumC2341g enumC2341g = EnumC2341g.INFO;
            if (interfaceC2339e.isLoggable(enumC2341g, logger.f9273a)) {
                logger.f9274b.log(enumC2341g, logger.f9273a, "[start] started: " + this.started + ", path: " + path, null);
            }
            if (this.started) {
                return;
            }
            this.started = true;
            MediaFormat format = getFormat(path);
            if (format == null) {
                throw new IllegalStateException("No audio format found");
            }
            String string = format.getString("mime");
            if (string == null) {
                throw new IllegalStateException("No MIME type found");
            }
            MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(string);
            mediaCodecCreateDecoderByType.configure(format, (Surface) null, (MediaCrypto) null, 0);
            mediaCodecCreateDecoderByType.setCallback(new MediaCodec.Callback() { // from class: io.getstream.chat.android.client.audio.WaveformExtractor$start$2$1
                @Override // android.media.MediaCodec.Callback
                public final void onError(MediaCodec codec, MediaCodec.CodecException e5) {
                    AbstractC22676k.m65750j(codec, "codec");
                    AbstractC22676k.m65750j(e5, "e");
                    this.this$0.finishCount.countDown();
                }

                @Override // android.media.MediaCodec.Callback
                public final void onInputBufferAvailable(MediaCodec codec, int index) {
                    MediaExtractor mediaExtractor;
                    ByteBuffer inputBuffer;
                    AbstractC22676k.m65750j(codec, "codec");
                    if (this.this$0.inputEof || (mediaExtractor = this.this$0.extractor) == null || (inputBuffer = codec.getInputBuffer(index)) == null) {
                        return;
                    }
                    WaveformExtractor waveformExtractor = this.this$0;
                    int sampleData = mediaExtractor.readSampleData(inputBuffer, 0);
                    if (sampleData > 0) {
                        codec.queueInputBuffer(index, 0, sampleData, mediaExtractor.getSampleTime(), 0);
                        mediaExtractor.advance();
                    } else {
                        codec.queueInputBuffer(index, 0, 0, 0L, 4);
                        waveformExtractor.inputEof = true;
                    }
                }

                @Override // android.media.MediaCodec.Callback
                public final void onOutputBufferAvailable(MediaCodec codec, int index, MediaCodec.BufferInfo info) {
                    ByteBuffer outputBuffer;
                    AbstractC22676k.m65750j(codec, "codec");
                    AbstractC22676k.m65750j(info, "info");
                    if (info.size > 0 && (outputBuffer = codec.getOutputBuffer(index)) != null) {
                        WaveformExtractor waveformExtractor = this.this$0;
                        int i13 = info.size;
                        outputBuffer.position(info.offset);
                        int i14 = waveformExtractor.pcmEncodingBit;
                        if (i14 == 8) {
                            waveformExtractor.handle8bit(i13, outputBuffer);
                        } else if (i14 == 16) {
                            waveformExtractor.handle16bit(i13, outputBuffer);
                        } else if (i14 == 32) {
                            waveformExtractor.handle32bit(i13, outputBuffer);
                        }
                        codec.releaseOutputBuffer(index, false);
                    }
                    if (WaveformExtractorKt.isEof(info)) {
                        this.this$0.stop();
                    }
                }

                @Override // android.media.MediaCodec.Callback
                public final void onOutputFormatChanged(MediaCodec codec, MediaFormat format2) {
                    int integer;
                    AbstractC22676k.m65750j(codec, "codec");
                    AbstractC22676k.m65750j(format2, "format");
                    this.this$0.sampleRate = format2.getInteger("sample-rate");
                    this.this$0.channels = format2.getInteger("channel-count");
                    WaveformExtractor waveformExtractor = this.this$0;
                    int i13 = 16;
                    if (format2.containsKey("pcm-encoding") && (integer = format2.getInteger("pcm-encoding")) != 2) {
                        if (integer == 3) {
                            i13 = 8;
                        } else if (integer == 4) {
                            i13 = 32;
                        }
                    }
                    waveformExtractor.pcmEncodingBit = i13;
                    WaveformExtractor waveformExtractor2 = this.this$0;
                    waveformExtractor2.totalSamples = (long) (this.this$0.durationInSeconds * waveformExtractor2.sampleRate);
                    WaveformExtractor waveformExtractor3 = this.this$0;
                    waveformExtractor3.samplesPerPoint = waveformExtractor3.totalSamples / ((long) this.this$0.expectedPoints);
                }
            });
            mediaCodecCreateDecoderByType.start();
            this.decoder = mediaCodecCreateDecoderByType;
        } catch (Exception unused) {
        }
    }

    public final void stop() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339e.isLoggable(enumC2341g, logger.f9273a)) {
            logger.f9274b.log(enumC2341g, logger.f9273a, AbstractC11266d.m30462p("[stop] started: ", this.started), null);
        }
        if (this.started) {
            this.started = false;
            MediaCodec mediaCodec = this.decoder;
            if (mediaCodec != null) {
                mediaCodec.stop();
            }
            MediaCodec mediaCodec2 = this.decoder;
            if (mediaCodec2 != null) {
                mediaCodec2.release();
            }
            MediaExtractor mediaExtractor = this.extractor;
            if (mediaExtractor != null) {
                mediaExtractor.release();
            }
            this.finishCount.countDown();
        }
    }
}
