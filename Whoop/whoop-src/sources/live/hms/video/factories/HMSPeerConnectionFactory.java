package live.hms.video.factories;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioRecord;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.preference.PreferenceManager;
import c93.InterfaceC4339a;
import f93.C14289a;
import f93.InterfaceC14292d;
import hms.webrtc.AudioProcessingFactory;
import hms.webrtc.EglBase;
import hms.webrtc.Logging;
import hms.webrtc.PeerConnectionFactory;
import hms.webrtc.VideoDecoderFactory;
import hms.webrtc.VideoEncoderFactory;
import hms.webrtc.audio.JavaAudioDeviceModule;
import hms.webrtc.audio.WebRtcAudioRecord;
import hms.webrtc.audio.WebRtcAudioTrack;
import j93.InterfaceC21493z;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import l83.InterfaceC23462h;
import live.hms.video.connection.degredation.C24117a;
import live.hms.video.encoder.video.SimulcastVideoEncoderFactoryWrapper;
import live.hms.video.error.ErrorFactory;
import live.hms.video.events.AnalyticsEventFactory;
import live.hms.video.events.AnalyticsEventsService;
import live.hms.video.factories.noisecancellation.NoiseCancellation;
import live.hms.video.factories.noisecancellation.NoiseCancellationFactoryImpl;
import live.hms.video.factories.noisecancellation.NoiseCancellationStatusChecker;
import live.hms.video.media.capturers.HMSWavCapturer;
import live.hms.video.media.settings.HMSAudioTrackSettings;
import live.hms.video.media.settings.HMSTrackSettings;
import live.hms.video.media.settings.HMSVideoTrackSettings;
import live.hms.video.sdk.HMSActionResultListener;
import live.hms.video.sdk.models.enums.AudioMixingMode;
import live.hms.video.utils.HMSLogger;
import live.hms.video.utils.HMSUtils;
import live.hms.video.utils.SharedEglContext;
import live.hms.video.utils.WertcAudioUtils;
import p088dc.AbstractC11895b;
import p479s4.AbstractC32122c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22686q;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0017\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\b\u0083\u0001\u0086\u0001\u0089\u0001\u0095\u0001\b\u0000\u0018\u0000 ¡\u00012\u00020\u0001:\u0002¡\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000fH\u0003¢\u0006\u0004\b(\u0010\u001bJ\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b)\u0010'J\u0017\u0010*\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000fH\u0002¢\u0006\u0004\b,\u0010\u001bJ)\u0010/\u001a\n .*\u0004\u0018\u00010-0-2\b\b\u0002\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000fH\u0002¢\u0006\u0004\b1\u0010\u001bJ'\u00107\u001a\u0002022\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u001c2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J\u0011\u0010:\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010H\u001a\u0004\bI\u0010JR\"\u0010L\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR+\u0010Z\u001a\u00020R2\u0006\u0010S\u001a\u00020R8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR+\u0010a\u001a\u00020[2\u0006\u0010S\u001a\u00020[8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\\\u0010U\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R(\u0010d\u001a\b\u0012\u0004\u0012\u00020c0b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR+\u0010p\u001a\u00020j2\u0006\u0010S\u001a\u00020j8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bk\u0010U\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR+\u0010w\u001a\u00020q2\u0006\u0010S\u001a\u00020q8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\br\u0010U\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u0016\u0010x\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010{\u001a\u00020z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0017\u0010\u0080\u0001\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010\u0082\u0001\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0081\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0019\u0010\u008c\u0001\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0019\u0010\u008e\u0001\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0019\u0010\u0090\u0001\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008d\u0001R\u0019\u0010\u0091\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0081\u0001R\u001c\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R!\u0010 \u0001\u001a\u00030\u009b\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001¨\u0006¢\u0001"}, m65681d2 = {"Llive/hms/video/factories/HMSPeerConnectionFactory;", "", "Landroid/content/Context;", "context", "Llive/hms/video/events/AnalyticsEventsService;", "analyticsEventsService", "Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;", "ncStatusChecker", "<init>", "(Landroid/content/Context;Llive/hms/video/events/AnalyticsEventsService;Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;)V", "Llive/hms/video/media/settings/HMSTrackSettings;", "hmsTrackSettings", "", "isSimulcastEnabled", "serverSoftwareEchoCancellationEnabled", "Ll83/a0;", "initialize", "(Llive/hms/video/media/settings/HMSTrackSettings;ZZ)V", "Landroid/media/projection/MediaProjection;", "mMediaProjection", "Llive/hms/video/sdk/models/enums/AudioMixingMode;", "audioMixingMode", "startAudioMixing", "(Landroid/media/projection/MediaProjection;Llive/hms/video/sdk/models/enums/AudioMixingMode;)V", "setAudioMixingMode", "(Llive/hms/video/sdk/models/enums/AudioMixingMode;)V", "stopAudioMixing", "()V", "", "audioResourceId", "Llive/hms/video/sdk/HMSActionResultListener;", "hmsActionResultListener", "streamAndPlayAudioFromRawFile", "(ILlive/hms/video/sdk/HMSActionResultListener;)V", "stopAudioFromRawFile", "(Llive/hms/video/sdk/HMSActionResultListener;)V", "Ljava/nio/ByteBuffer;", "micAudioByteBuffer", "scaleUpMicVolume", "(Ljava/nio/ByteBuffer;)V", "captureSystemAudio", "mixAudioBytes", "initAudioRecorder", "(Landroid/media/projection/MediaProjection;)V", "initchunk", "Lhms/webrtc/PeerConnectionFactory$Builder;", "kotlin.jvm.PlatformType", "getPeerConnectionFactoryBuilder", "(ZLlive/hms/video/media/settings/HMSTrackSettings;)Lhms/webrtc/PeerConnectionFactory$Builder;", "initPeerConnectionFactory", "", "buff", "len", "", "scale", "scaleValues", "([SIF)[S", "Ljava/util/concurrent/ScheduledExecutorService;", "newDefaultScheduler", "()Ljava/util/concurrent/ScheduledExecutorService;", "sendAECAnalytics", "(Landroid/content/Context;)V", "", "errorMessage", "sendMicCaptureFailedEvent", "(Ljava/lang/String;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Llive/hms/video/events/AnalyticsEventsService;", "getAnalyticsEventsService", "()Llive/hms/video/events/AnalyticsEventsService;", "Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;", "getNcStatusChecker", "()Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;", "Llive/hms/video/factories/noisecancellation/NoiseCancellation;", "noiseCancellation", "Llive/hms/video/factories/noisecancellation/NoiseCancellation;", "getNoiseCancellation", "()Llive/hms/video/factories/noisecancellation/NoiseCancellation;", "setNoiseCancellation", "(Llive/hms/video/factories/noisecancellation/NoiseCancellation;)V", "Lhms/webrtc/VideoEncoderFactory;", "<set-?>", "videoEncoderFactory$delegate", "Lf93/d;", "getVideoEncoderFactory", "()Lhms/webrtc/VideoEncoderFactory;", "setVideoEncoderFactory", "(Lhms/webrtc/VideoEncoderFactory;)V", "videoEncoderFactory", "Lhms/webrtc/VideoDecoderFactory;", "videoDecoderFactory$delegate", "getVideoDecoderFactory", "()Lhms/webrtc/VideoDecoderFactory;", "setVideoDecoderFactory", "(Lhms/webrtc/VideoDecoderFactory;)V", "videoDecoderFactory", "Llive/hms/video/factories/SafeVariable;", "Lhms/webrtc/PeerConnectionFactory;", "factory", "Llive/hms/video/factories/SafeVariable;", "getFactory", "()Llive/hms/video/factories/SafeVariable;", "setFactory", "(Llive/hms/video/factories/SafeVariable;)V", "Lhms/webrtc/audio/WebRtcAudioRecord;", "webrtcAudioRecord$delegate", "getWebrtcAudioRecord", "()Lhms/webrtc/audio/WebRtcAudioRecord;", "setWebrtcAudioRecord", "(Lhms/webrtc/audio/WebRtcAudioRecord;)V", "webrtcAudioRecord", "Lhms/webrtc/audio/WebRtcAudioTrack;", "webRtcAudioTrack$delegate", "getWebRtcAudioTrack", "()Lhms/webrtc/audio/WebRtcAudioTrack;", "setWebRtcAudioTrack", "(Lhms/webrtc/audio/WebRtcAudioTrack;)V", "webRtcAudioTrack", "_audioMixingMode", "Llive/hms/video/sdk/models/enums/AudioMixingMode;", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextSchedulerId", "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroid/media/AudioManager;", "audioManager", "Landroid/media/AudioManager;", "inputSampleRate", "I", "outputSampleRate", "live/hms/video/factories/HMSPeerConnectionFactory$audioRecordErrorCallback$1", "audioRecordErrorCallback", "Llive/hms/video/factories/HMSPeerConnectionFactory$audioRecordErrorCallback$1;", "live/hms/video/factories/HMSPeerConnectionFactory$audioTrackErrorCallback$1", "audioTrackErrorCallback", "Llive/hms/video/factories/HMSPeerConnectionFactory$audioTrackErrorCallback$1;", "live/hms/video/factories/HMSPeerConnectionFactory$audioRecordStateCallback$1", "audioRecordStateCallback", "Llive/hms/video/factories/HMSPeerConnectionFactory$audioRecordStateCallback$1;", "systemAudioByteBuffer", "Ljava/nio/ByteBuffer;", "systemAudioShortArray", "[S", "combinedByteBuffer", "capacity", "Landroid/media/AudioRecord;", "mAudioRecord", "Landroid/media/AudioRecord;", "live/hms/video/factories/HMSPeerConnectionFactory$audioBufferCallback$1", "audioBufferCallback", "Llive/hms/video/factories/HMSPeerConnectionFactory$audioBufferCallback$1;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isSystemAudioCaptureEnabled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Llive/hms/video/media/capturers/HMSWavCapturer;", "wavCapturer$delegate", "Ll83/h;", "getWavCapturer", "()Llive/hms/video/media/capturers/HMSWavCapturer;", "wavCapturer", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSPeerConnectionFactory {
    static final /* synthetic */ InterfaceC21493z[] $$delegatedProperties;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final int DEFAULT_AUDIO_FORMAT = 2;
    private static final int DEFAULT_AUDIO_SOURCE = 7;
    private static final float FILE_VOLUME_SCALE = 0.1f;
    private static final int INPUT_BITS_PER_SAMPLE = 16;
    private static final int INPUT_NUM_OF_CHANNELS = 1;
    private static final float MIC_VOLUME_SCALE = 5.0f;
    private static final int OUTPUT_BITS_PER_SAMPLE = 16;
    private static final int OUTPUT_NUM_OF_CHANNELS = 1;
    private static final boolean PREF_AEC_EVENT_DEFAULT = false;
    private static final String PREF_AEC_EVENT_KEY = "aec_event";
    private static final String TAG = "HMSPeerConnectionFactory";
    private AudioMixingMode _audioMixingMode;
    private final AnalyticsEventsService analyticsEventsService;
    private final HMSPeerConnectionFactory$audioBufferCallback$1 audioBufferCallback;
    private final AudioManager audioManager;
    private final HMSPeerConnectionFactory$audioRecordErrorCallback$1 audioRecordErrorCallback;
    private final HMSPeerConnectionFactory$audioRecordStateCallback$1 audioRecordStateCallback;
    private final HMSPeerConnectionFactory$audioTrackErrorCallback$1 audioTrackErrorCallback;
    private int capacity;
    private ByteBuffer combinedByteBuffer;
    private final Context context;
    private SafeVariable<PeerConnectionFactory> factory;
    private final int inputSampleRate;
    private final AtomicBoolean isSystemAudioCaptureEnabled;
    private AudioRecord mAudioRecord;
    private final NoiseCancellationStatusChecker ncStatusChecker;
    private AtomicInteger nextSchedulerId;
    public NoiseCancellation noiseCancellation;
    private final int outputSampleRate;
    private ByteBuffer systemAudioByteBuffer;
    private short[] systemAudioShortArray;

    /* JADX INFO: renamed from: videoDecoderFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC14292d videoDecoderFactory;

    /* JADX INFO: renamed from: videoEncoderFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC14292d videoEncoderFactory;

    /* JADX INFO: renamed from: wavCapturer$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h wavCapturer;

    /* JADX INFO: renamed from: webRtcAudioTrack$delegate, reason: from kotlin metadata */
    private final InterfaceC14292d webRtcAudioTrack;

    /* JADX INFO: renamed from: webrtcAudioRecord$delegate, reason: from kotlin metadata */
    private final InterfaceC14292d webrtcAudioRecord;

    static {
        C22686q c22686q = new C22686q(HMSPeerConnectionFactory.class, "videoEncoderFactory", "getVideoEncoderFactory()Lhms/webrtc/VideoEncoderFactory;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        $$delegatedProperties = new InterfaceC21493z[]{c22673i0.mutableProperty1(c22686q), AbstractC11895b.m31990i(HMSPeerConnectionFactory.class, "videoDecoderFactory", "getVideoDecoderFactory()Lhms/webrtc/VideoDecoderFactory;", 0, c22673i0), AbstractC11895b.m31990i(HMSPeerConnectionFactory.class, "webrtcAudioRecord", "getWebrtcAudioRecord()Lhms/webrtc/audio/WebRtcAudioRecord;", 0, c22673i0), AbstractC11895b.m31990i(HMSPeerConnectionFactory.class, "webRtcAudioTrack", "getWebRtcAudioTrack()Lhms/webrtc/audio/WebRtcAudioTrack;", 0, c22673i0)};
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [live.hms.video.factories.HMSPeerConnectionFactory$audioRecordErrorCallback$1] */
    /* JADX WARN: Type inference failed for: r2v5, types: [live.hms.video.factories.HMSPeerConnectionFactory$audioTrackErrorCallback$1] */
    /* JADX WARN: Type inference failed for: r2v6, types: [live.hms.video.factories.HMSPeerConnectionFactory$audioRecordStateCallback$1] */
    /* JADX WARN: Type inference failed for: r2v7, types: [live.hms.video.factories.HMSPeerConnectionFactory$audioBufferCallback$1] */
    public HMSPeerConnectionFactory(Context context, AnalyticsEventsService analyticsEventsService, NoiseCancellationStatusChecker ncStatusChecker) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(analyticsEventsService, "analyticsEventsService");
        AbstractC22676k.m65750j(ncStatusChecker, "ncStatusChecker");
        this.context = context;
        this.analyticsEventsService = analyticsEventsService;
        this.ncStatusChecker = ncStatusChecker;
        this.videoEncoderFactory = new C14289a(0);
        this.videoDecoderFactory = new C14289a(0);
        this.factory = new SafeVariable<>();
        this.webrtcAudioRecord = new C14289a(0);
        this.webRtcAudioTrack = new C14289a(0);
        this._audioMixingMode = AudioMixingMode.TALK_AND_MUSIC;
        this.nextSchedulerId = new AtomicInteger(0);
        Object systemService = context.getSystemService("audio");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        this.audioManager = audioManager;
        WertcAudioUtils.Companion companion = WertcAudioUtils.INSTANCE;
        this.inputSampleRate = companion.getSampleRate(audioManager);
        this.outputSampleRate = companion.getSampleRate(audioManager);
        this.audioRecordErrorCallback = new JavaAudioDeviceModule.AudioRecordErrorCallback() { // from class: live.hms.video.factories.HMSPeerConnectionFactory$audioRecordErrorCallback$1
            @Override // hms.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
            public void onWebRtcAudioRecordError(String errorMessage) {
                String str = "audioRecordErrorCallback:: onWebRtcAudioRecordError:: " + errorMessage;
                HMSLogger.m71137e("HMSPeerConnectionFactory", str);
                this.this$0.sendMicCaptureFailedEvent(str);
            }

            @Override // hms.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
            public void onWebRtcAudioRecordInitError(String errorMessage) {
                String str = "audioRecordErrorCallback:: onWebRtcAudioRecordError:: " + errorMessage;
                HMSLogger.m71137e("HMSPeerConnectionFactory", str);
                this.this$0.sendMicCaptureFailedEvent(str);
            }

            @Override // hms.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
            public void onWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode errorCode, String errorMessage) {
                String str = "audioRecordErrorCallback:: onWebRtcAudioRecordStartError:: " + errorCode + " ==> " + errorMessage;
                HMSLogger.m71137e("HMSPeerConnectionFactory", str);
                this.this$0.sendMicCaptureFailedEvent(str);
            }
        };
        this.audioTrackErrorCallback = new JavaAudioDeviceModule.AudioTrackErrorCallback() { // from class: live.hms.video.factories.HMSPeerConnectionFactory$audioTrackErrorCallback$1
            @Override // hms.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
            public void onWebRtcAudioTrackError(String errorMessage) {
                String str = "audioTrackErrorCallback:: onWebRtcAudioRecordError:: " + errorMessage;
                HMSLogger.m71137e("HMSPeerConnectionFactory", str);
                this.this$0.sendMicCaptureFailedEvent(str);
            }

            @Override // hms.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
            public void onWebRtcAudioTrackInitError(String errorMessage) {
                String str = "audioTrackErrorCallback:: onWebRtcAudioRecordInitError:: " + errorMessage;
                HMSLogger.m71137e("HMSPeerConnectionFactory", str);
                this.this$0.sendMicCaptureFailedEvent(str);
            }

            @Override // hms.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
            public void onWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode errorCode, String errorMessage) {
                String str = "audioTrackErrorCallback:: onWebRtcAudioRecordStartError:: " + errorCode + " ==> " + errorMessage;
                HMSLogger.m71137e("HMSPeerConnectionFactory", str);
                this.this$0.sendMicCaptureFailedEvent(str);
            }
        };
        this.audioRecordStateCallback = new JavaAudioDeviceModule.AudioRecordStateCallback() { // from class: live.hms.video.factories.HMSPeerConnectionFactory$audioRecordStateCallback$1
            @Override // hms.webrtc.audio.JavaAudioDeviceModule.AudioRecordStateCallback
            public void onWebRtcAudioRecordStart() {
                HMSLogger.INSTANCE.m71140v("HMSPeerConnectionFactory", "~~ onWebRtcAudioRecordStart ~~");
            }

            @Override // hms.webrtc.audio.JavaAudioDeviceModule.AudioRecordStateCallback
            public void onWebRtcAudioRecordStop() {
                HMSLogger.INSTANCE.m71140v("HMSPeerConnectionFactory", "~~ onWebRtcAudioRecordStop ~~");
            }
        };
        this.audioBufferCallback = new WebRtcAudioRecord.AudioBufferCallback() { // from class: live.hms.video.factories.HMSPeerConnectionFactory$audioBufferCallback$1
            @Override // hms.webrtc.audio.WebRtcAudioRecord.AudioBufferCallback
            public void onBuffer(ByteBuffer micByteBuffer, int micBytesRead) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.this$0._audioMixingMode == AudioMixingMode.TALK_AND_MUSIC || this.this$0._audioMixingMode == AudioMixingMode.MUSIC_ONLY) {
                    HMSLogger.m71136d("AudioMixing", "Mixing system audio and mic data");
                    if (this.this$0.getWavCapturer().getIsStarted().get()) {
                        HMSWavCapturer wavCapturer = this.this$0.getWavCapturer();
                        ByteBuffer byteBuffer = this.this$0.systemAudioByteBuffer;
                        if (byteBuffer == null) {
                            AbstractC22676k.m65757q("systemAudioByteBuffer");
                            throw null;
                        }
                        wavCapturer.readNext10ms(byteBuffer);
                    } else {
                        this.this$0.getWebrtcAudioRecord().isMixingNeeded(false);
                    }
                    if (this.this$0.isSystemAudioCaptureEnabled.get() && Build.VERSION.SDK_INT >= 29) {
                        this.this$0.getWebrtcAudioRecord().isMixingNeeded(true);
                        this.this$0.captureSystemAudio();
                    }
                    if (micByteBuffer != null) {
                        this.this$0.mixAudioBytes(micByteBuffer);
                    }
                } else {
                    HMSLogger.m71136d("AudioMixing", "Not Mixing system audio and mic data :: TALK_MODE");
                }
                HMSLogger.m71136d("HMSPeerConnectionFactory", " Callback took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms to finish");
            }
        };
        this.isSystemAudioCaptureEnabled = new AtomicBoolean(false);
        this.wavCapturer = AbstractC30060g.m92088H(new C24117a(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void captureSystemAudio() {
        AudioRecord audioRecord = this.mAudioRecord;
        AbstractC22676k.m65747g(audioRecord);
        ByteBuffer byteBuffer = this.systemAudioByteBuffer;
        if (byteBuffer == null) {
            AbstractC22676k.m65757q("systemAudioByteBuffer");
            throw null;
        }
        if (byteBuffer == null) {
            AbstractC22676k.m65757q("systemAudioByteBuffer");
            throw null;
        }
        HMSLogger.m71136d("AudioMixing", "Read " + audioRecord.read(byteBuffer, byteBuffer.capacity(), 0) + " bytes of System audio buffer");
    }

    private final PeerConnectionFactory.Builder getPeerConnectionFactoryBuilder(boolean isSimulcastEnabled, HMSTrackSettings hmsTrackSettings) {
        PeerConnectionFactory.Builder builder = PeerConnectionFactory.builder();
        builder.setOptions(new PeerConnectionFactory.Options());
        SharedEglContext sharedEglContext = SharedEglContext.INSTANCE;
        EglBase.Context context = sharedEglContext.getContext();
        HMSVideoTrackSettings videoSettings = hmsTrackSettings.getVideoSettings();
        boolean z4 = false;
        setVideoEncoderFactory(new SimulcastVideoEncoderFactoryWrapper(context, false, false, videoSettings != null && videoSettings.getForceSoftwareEncoder(), 6, null));
        EglBase.Context context2 = sharedEglContext.getContext();
        AbstractC22676k.m65749i(context2, "<get-context>(...)");
        HMSVideoTrackSettings videoSettings2 = hmsTrackSettings.getVideoSettings();
        setVideoDecoderFactory(new HMSVideoDecoderFactory(context2, videoSettings2 != null && videoSettings2.getForceSoftwareDecoder()));
        builder.setVideoEncoderFactory(getVideoEncoderFactory());
        builder.setVideoDecoderFactory(getVideoDecoderFactory());
        setNoiseCancellation(new NoiseCancellationFactoryImpl(this.ncStatusChecker).jniLoad(this.context));
        NoiseCancellation noiseCancellation = getNoiseCancellation();
        HMSAudioTrackSettings audioSettings = hmsTrackSettings.getAudioSettings();
        if (audioSettings != null && audioSettings.getEnableNoiseCancellation()) {
            z4 = true;
        }
        AudioProcessingFactory audioProcessingFactory = noiseCancellation.getAudioProcessingFactory(z4);
        if (audioProcessingFactory != null) {
            builder.setAudioProcessingFactory(audioProcessingFactory);
        }
        return builder;
    }

    public static /* synthetic */ PeerConnectionFactory.Builder getPeerConnectionFactoryBuilder$default(HMSPeerConnectionFactory hMSPeerConnectionFactory, boolean z4, HMSTrackSettings hMSTrackSettings, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        return hMSPeerConnectionFactory.getPeerConnectionFactoryBuilder(z4, hMSTrackSettings);
    }

    private final VideoDecoderFactory getVideoDecoderFactory() {
        return (VideoDecoderFactory) this.videoDecoderFactory.getValue(this, $$delegatedProperties[1]);
    }

    private final VideoEncoderFactory getVideoEncoderFactory() {
        return (VideoEncoderFactory) this.videoEncoderFactory.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMSWavCapturer getWavCapturer() {
        return (HMSWavCapturer) this.wavCapturer.getValue();
    }

    private final WebRtcAudioTrack getWebRtcAudioTrack() {
        return (WebRtcAudioTrack) this.webRtcAudioTrack.getValue(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WebRtcAudioRecord getWebrtcAudioRecord() {
        return (WebRtcAudioRecord) this.webrtcAudioRecord.getValue(this, $$delegatedProperties[2]);
    }

    private final void initAudioRecorder(MediaProjection mMediaProjection) {
        AudioRecord.getMinBufferSize(this.inputSampleRate, 16, 2);
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setEncoding(2).setSampleRate(this.inputSampleRate).setChannelMask(4).build();
        AudioPlaybackCaptureConfiguration audioPlaybackCaptureConfigurationBuild = new AudioPlaybackCaptureConfiguration.Builder(mMediaProjection).addMatchingUsage(1).addMatchingUsage(0).addMatchingUsage(14).build();
        AbstractC22676k.m65749i(audioPlaybackCaptureConfigurationBuild, "build(...)");
        if (AbstractC32122c.checkSelfPermission(this.context, "android.permission.RECORD_AUDIO") != 0) {
            return;
        }
        AudioRecord audioRecordBuild = new AudioRecord.Builder().setAudioFormat(audioFormatBuild).setAudioPlaybackCaptureConfig(audioPlaybackCaptureConfigurationBuild).build();
        this.mAudioRecord = audioRecordBuild;
        AbstractC22676k.m65747g(audioRecordBuild);
        audioRecordBuild.startRecording();
    }

    private final void initPeerConnectionFactory() {
        PeerConnectionFactory.InitializationOptions.Builder builder = PeerConnectionFactory.InitializationOptions.builder(this.context);
        builder.setFieldTrials("WebRTC-H264HighProfile/Enabled/WebRTC-MediaCodecVideoEncoder-AutomaticResize/Enabled/WebRTC-UseDifferentiatedCellularCosts/Enabled/");
        builder.setInjectableLogger(new C24148c(0), Logging.Severity.LS_VERBOSE);
        PeerConnectionFactory.initialize(builder.createInitializationOptions());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPeerConnectionFactory$lambda$3$lambda$2(String str, Logging.Severity severity, String str2) {
        HMSLogger hMSLogger = HMSLogger.INSTANCE;
        AbstractC22676k.m65747g(severity);
        AbstractC22676k.m65747g(str2);
        AbstractC22676k.m65747g(str);
        hMSLogger.webRTCLog$lib_release(severity, str2, str);
    }

    private final void initchunk() {
        int i13 = (this.inputSampleRate / 100) * 2;
        this.capacity = i13;
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i13).order(ByteOrder.nativeOrder());
        this.systemAudioByteBuffer = byteBufferOrder;
        if (byteBufferOrder != null) {
            this.systemAudioShortArray = new short[byteBufferOrder.capacity() / 2];
        } else {
            AbstractC22676k.m65757q("systemAudioByteBuffer");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    public static final PeerConnectionFactory initialize$lambda$0(HMSPeerConnectionFactory this$0, HMSTrackSettings hmsTrackSettings, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(hmsTrackSettings, "$hmsTrackSettings");
        this$0.initPeerConnectionFactory();
        boolean zBooleanValue = false;
        if (JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()) {
            HMSAudioTrackSettings audioSettings = hmsTrackSettings.getAudioSettings();
            if ((audioSettings != null ? audioSettings.getUseHardwareAcousticEchoCanceler() : null) != null) {
                Boolean useHardwareAcousticEchoCanceler = hmsTrackSettings.getAudioSettings().getUseHardwareAcousticEchoCanceler();
                if (useHardwareAcousticEchoCanceler != null) {
                    zBooleanValue = useHardwareAcousticEchoCanceler.booleanValue();
                } else {
                    zBooleanValue = true;
                }
            } else if (!z4) {
                zBooleanValue = true;
            }
        }
        this$0.setWebrtcAudioRecord(new WebRtcAudioRecord(this$0.context, this$0.newDefaultScheduler(), this$0.audioManager, 7, 2, this$0.audioRecordErrorCallback, this$0.audioRecordStateCallback, null, zBooleanValue, JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()));
        this$0.setWebRtcAudioTrack(new WebRtcAudioTrack(this$0.context, this$0.audioManager, null, this$0.audioTrackErrorCallback, null, false, false));
        PeerConnectionFactory peerConnectionFactoryCreatePeerConnectionFactory = this$0.getPeerConnectionFactoryBuilder(z13, hmsTrackSettings).setAudioDeviceModule(new JavaAudioDeviceModule(this$0.context, this$0.audioManager, this$0.getWebrtcAudioRecord(), this$0.getWebRtcAudioTrack(), this$0.inputSampleRate, this$0.outputSampleRate, false, false)).createPeerConnectionFactory();
        this$0.sendAECAnalytics(this$0.context);
        AbstractC22676k.m65747g(peerConnectionFactoryCreatePeerConnectionFactory);
        return peerConnectionFactoryCreatePeerConnectionFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void mixAudioBytes(ByteBuffer micAudioByteBuffer) {
        micAudioByteBuffer.position(0);
        ByteBuffer byteBuffer = this.systemAudioByteBuffer;
        if (byteBuffer == null) {
            AbstractC22676k.m65757q("systemAudioByteBuffer");
            throw null;
        }
        byteBuffer.position(0);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        ShortBuffer shortBufferAsShortBuffer = micAudioByteBuffer.order(byteOrder).asShortBuffer();
        int iLimit = micAudioByteBuffer.limit() / 2;
        short[] sArr = new short[iLimit];
        shortBufferAsShortBuffer.get(sArr);
        ByteBuffer byteBuffer2 = this.systemAudioByteBuffer;
        if (byteBuffer2 == null) {
            AbstractC22676k.m65757q("systemAudioByteBuffer");
            throw null;
        }
        ShortBuffer shortBufferAsShortBuffer2 = byteBuffer2.order(byteOrder).asShortBuffer();
        short[] sArr2 = this.systemAudioShortArray;
        if (sArr2 == null) {
            AbstractC22676k.m65757q("systemAudioShortArray");
            throw null;
        }
        shortBufferAsShortBuffer2.get(sArr2);
        scaleValues(sArr, iLimit, MIC_VOLUME_SCALE);
        short[] sArr3 = this.systemAudioShortArray;
        if (sArr3 == null) {
            AbstractC22676k.m65757q("systemAudioShortArray");
            throw null;
        }
        if (sArr3 == null) {
            AbstractC22676k.m65757q("systemAudioShortArray");
            throw null;
        }
        scaleValues(sArr3, sArr3.length, FILE_VOLUME_SCALE);
        HMSUtils hMSUtils = HMSUtils.INSTANCE;
        short[] sArr4 = this.systemAudioShortArray;
        if (sArr4 == null) {
            AbstractC22676k.m65757q("systemAudioShortArray");
            throw null;
        }
        if (sArr4 == null) {
            AbstractC22676k.m65757q("systemAudioShortArray");
            throw null;
        }
        this.combinedByteBuffer = ByteBuffer.wrap(hMSUtils.addAndConvertBuffers(sArr, iLimit, sArr4, sArr4.length));
        micAudioByteBuffer.clear();
        AudioMixingMode audioMixingMode = this._audioMixingMode;
        if (audioMixingMode == AudioMixingMode.TALK_AND_MUSIC) {
            HMSLogger.m71136d("AudioMixing", "Adding combinedByteBuffer");
            ByteBuffer byteBuffer3 = this.combinedByteBuffer;
            if (byteBuffer3 != null) {
                micAudioByteBuffer.put(byteBuffer3);
                return;
            } else {
                AbstractC22676k.m65757q("combinedByteBuffer");
                throw null;
            }
        }
        if (audioMixingMode == AudioMixingMode.MUSIC_ONLY) {
            HMSLogger.m71136d("AudioMixing", "Adding systemAudioByteBuffer");
            ByteBuffer byteBuffer4 = this.systemAudioByteBuffer;
            if (byteBuffer4 != null) {
                micAudioByteBuffer.put(byteBuffer4);
            } else {
                AbstractC22676k.m65757q("systemAudioByteBuffer");
                throw null;
            }
        }
    }

    private final ScheduledExecutorService newDefaultScheduler() {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        return Executors.newScheduledThreadPool(0, new ThreadFactory() { // from class: live.hms.video.factories.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return HMSPeerConnectionFactory.newDefaultScheduler$lambda$4(this.f95213w, atomicInteger, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread newDefaultScheduler$lambda$4(HMSPeerConnectionFactory this$0, AtomicInteger nextThreadId, Runnable runnable) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(nextThreadId, "$nextThreadId");
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
        threadNewThread.setName(String.format("WebRtcAudioRecordScheduler-%s-%s", Arrays.copyOf(new Object[]{Integer.valueOf(this$0.nextSchedulerId.getAndIncrement()), Integer.valueOf(nextThreadId.getAndIncrement())}, 2)));
        return threadNewThread;
    }

    private final void scaleUpMicVolume(ByteBuffer micAudioByteBuffer) {
        ShortBuffer shortBufferAsShortBuffer = micAudioByteBuffer.order(ByteOrder.LITTLE_ENDIAN).asShortBuffer();
        int iLimit = micAudioByteBuffer.limit() / 2;
        short[] sArr = new short[iLimit];
        shortBufferAsShortBuffer.get(sArr);
        scaleValues(sArr, iLimit, MIC_VOLUME_SCALE);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c A[PHI: r2
      0x000c: PHI (r2v2 int) = (r2v0 int), (r2v1 int) binds: [B:5:0x000a, B:8:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    private final short[] scaleValues(short[] buff, int len, float scale) {
        for (int i13 = 0; i13 < len; i13++) {
            int i14 = (int) (buff[i13] * scale);
            int i15 = 32767;
            if (i14 > 32767) {
                i14 = i15;
            } else {
                i15 = -32768;
                if (i14 < -32768) {
                    i14 = i15;
                }
            }
            buff[i13] = (short) i14;
        }
        return buff;
    }

    private final void sendAECAnalytics(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (defaultSharedPreferences.getBoolean(PREF_AEC_EVENT_KEY, false)) {
            return;
        }
        this.analyticsEventsService.queue(AnalyticsEventFactory.INSTANCE.audioEchoCancellation(JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()));
        defaultSharedPreferences.edit().putBoolean(PREF_AEC_EVENT_KEY, true).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendMicCaptureFailedEvent(String errorMessage) {
        this.analyticsEventsService.queue(AnalyticsEventFactory.INSTANCE.audioPublishFail(ErrorFactory.TracksErrors.MicCaptureFailed$default(ErrorFactory.TracksErrors.INSTANCE, ErrorFactory.Action.TRACK, errorMessage, null, null, 12, null)));
    }

    private final void setVideoDecoderFactory(VideoDecoderFactory videoDecoderFactory) {
        this.videoDecoderFactory.setValue(this, $$delegatedProperties[1], videoDecoderFactory);
    }

    private final void setVideoEncoderFactory(VideoEncoderFactory videoEncoderFactory) {
        this.videoEncoderFactory.setValue(this, $$delegatedProperties[0], videoEncoderFactory);
    }

    private final void setWebRtcAudioTrack(WebRtcAudioTrack webRtcAudioTrack) {
        this.webRtcAudioTrack.setValue(this, $$delegatedProperties[3], webRtcAudioTrack);
    }

    private final void setWebrtcAudioRecord(WebRtcAudioRecord webRtcAudioRecord) {
        this.webrtcAudioRecord.setValue(this, $$delegatedProperties[2], webRtcAudioRecord);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HMSWavCapturer wavCapturer_delegate$lambda$5(HMSPeerConnectionFactory this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        return new HMSWavCapturer(this$0.context, 48000, 0, 0, 12, null);
    }

    public final AnalyticsEventsService getAnalyticsEventsService() {
        return this.analyticsEventsService;
    }

    public final Context getContext() {
        return this.context;
    }

    public final SafeVariable<PeerConnectionFactory> getFactory() {
        return this.factory;
    }

    public final NoiseCancellationStatusChecker getNcStatusChecker() {
        return this.ncStatusChecker;
    }

    public final NoiseCancellation getNoiseCancellation() {
        NoiseCancellation noiseCancellation = this.noiseCancellation;
        if (noiseCancellation != null) {
            return noiseCancellation;
        }
        AbstractC22676k.m65757q("noiseCancellation");
        throw null;
    }

    public final void initialize(final HMSTrackSettings hmsTrackSettings, final boolean isSimulcastEnabled, final boolean serverSoftwareEchoCancellationEnabled) {
        AbstractC22676k.m65750j(hmsTrackSettings, "hmsTrackSettings");
        this.factory.initialize(new InterfaceC4339a() { // from class: live.hms.video.factories.b
            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                return HMSPeerConnectionFactory.initialize$lambda$0(this.f95215w, hmsTrackSettings, serverSoftwareEchoCancellationEnabled, isSimulcastEnabled);
            }
        });
    }

    public final void setAudioMixingMode(AudioMixingMode audioMixingMode) {
        AbstractC22676k.m65750j(audioMixingMode, "audioMixingMode");
        HMSLogger.m71136d("AudioMixing", "setting Audio Mixing mode to " + audioMixingMode);
        this._audioMixingMode = audioMixingMode;
    }

    public final void setFactory(SafeVariable<PeerConnectionFactory> safeVariable) {
        AbstractC22676k.m65750j(safeVariable, "<set-?>");
        this.factory = safeVariable;
    }

    public final void setNoiseCancellation(NoiseCancellation noiseCancellation) {
        AbstractC22676k.m65750j(noiseCancellation, "<set-?>");
        this.noiseCancellation = noiseCancellation;
    }

    public final void startAudioMixing(MediaProjection mMediaProjection, AudioMixingMode audioMixingMode) {
        AbstractC22676k.m65750j(mMediaProjection, "mMediaProjection");
        AbstractC22676k.m65750j(audioMixingMode, "audioMixingMode");
        HMSLogger.m71136d("AudioMixing", "starting audio mixing in " + audioMixingMode + " mode");
        initAudioRecorder(mMediaProjection);
        initchunk();
        this.isSystemAudioCaptureEnabled.set(true);
        getWebrtcAudioRecord().setBufferCallback(this.audioBufferCallback);
        this._audioMixingMode = audioMixingMode;
        getWebrtcAudioRecord().isMixingNeeded(true);
    }

    public final void stopAudioFromRawFile(HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        boolean z4 = getWavCapturer().getIsStarted().get();
        getWavCapturer().close();
        getWebrtcAudioRecord().isMixingNeeded(false);
        if (z4) {
            hmsActionResultListener.onSuccess();
        } else {
            hmsActionResultListener.onError(ErrorFactory.GenericErrors.Unknown$default(ErrorFactory.GenericErrors.INSTANCE, ErrorFactory.Action.PLUGIN, "Unable to stop because no wav file is playing", null, null, 8, null));
        }
    }

    public final void stopAudioMixing() {
        this.isSystemAudioCaptureEnabled.set(false);
        HMSLogger.m71136d("AudioMixing", "stopping Audio mixing");
        getWebrtcAudioRecord().isMixingNeeded(false);
    }

    public final void streamAndPlayAudioFromRawFile(int audioResourceId, HMSActionResultListener hmsActionResultListener) {
        Object objM107888l;
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        initchunk();
        try {
            getWavCapturer().loadUrl(audioResourceId);
            objM107888l = C23454a0.f92919a;
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        if (objM107888l instanceof C23467m) {
            hmsActionResultListener.onError(ErrorFactory.GenericErrors.Unknown$default(ErrorFactory.GenericErrors.INSTANCE, ErrorFactory.Action.PLUGIN, "Unable to start wav playback", C23468n.m68037a(objM107888l), null, 8, null));
            return;
        }
        getWebrtcAudioRecord().setBufferCallback(this.audioBufferCallback);
        getWebrtcAudioRecord().isMixingNeeded(true);
        hmsActionResultListener.onSuccess();
    }
}
