.class public final Llive/hms/video/factories/HMSPeerConnectionFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/factories/HMSPeerConnectionFactory$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00f4\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0017\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0008\u0003\n\u0002\u0008\u0003\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007*\u0008\u0083\u0001\u0086\u0001\u0089\u0001\u0095\u0001\u0008\u0000\u0018\u0000 \u00a1\u00012\u00020\u0001:\u0002\u00a1\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008 \u0010!J\u0015\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0002\u00a2\u0006\u0004\u0008&\u0010\'J\u000f\u0010(\u001a\u00020\u000fH\u0003\u00a2\u0006\u0004\u0008(\u0010\u001bJ\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0002\u00a2\u0006\u0004\u0008)\u0010\'J\u0017\u0010*\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u000f\u0010,\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008,\u0010\u001bJ)\u0010/\u001a\n .*\u0004\u0018\u00010-0-2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008/\u00100J\u000f\u00101\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u00081\u0010\u001bJ\'\u00107\u001a\u0002022\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u001c2\u0006\u00106\u001a\u000205H\u0002\u00a2\u0006\u0004\u00087\u00108J\u0011\u0010:\u001a\u0004\u0018\u000109H\u0002\u00a2\u0006\u0004\u0008:\u0010;J\u0017\u0010<\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008<\u0010=J\u0017\u0010@\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020>H\u0002\u00a2\u0006\u0004\u0008@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010B\u001a\u0004\u0008C\u0010DR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010E\u001a\u0004\u0008F\u0010GR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010H\u001a\u0004\u0008I\u0010JR\"\u0010L\u001a\u00020K8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008L\u0010M\u001a\u0004\u0008N\u0010O\"\u0004\u0008P\u0010QR+\u0010Z\u001a\u00020R2\u0006\u0010S\u001a\u00020R8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008T\u0010U\u001a\u0004\u0008V\u0010W\"\u0004\u0008X\u0010YR+\u0010a\u001a\u00020[2\u0006\u0010S\u001a\u00020[8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\\\u0010U\u001a\u0004\u0008]\u0010^\"\u0004\u0008_\u0010`R(\u0010d\u001a\u0008\u0012\u0004\u0012\u00020c0b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008d\u0010e\u001a\u0004\u0008f\u0010g\"\u0004\u0008h\u0010iR+\u0010p\u001a\u00020j2\u0006\u0010S\u001a\u00020j8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008k\u0010U\u001a\u0004\u0008l\u0010m\"\u0004\u0008n\u0010oR+\u0010w\u001a\u00020q2\u0006\u0010S\u001a\u00020q8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008r\u0010U\u001a\u0004\u0008s\u0010t\"\u0004\u0008u\u0010vR\u0016\u0010x\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008x\u0010yR\u0016\u0010{\u001a\u00020z8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008{\u0010|R\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008~\u0010\u007fR\u0017\u0010\u0080\u0001\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0080\u0001\u0010\u0081\u0001R\u0017\u0010\u0082\u0001\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0082\u0001\u0010\u0081\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008a\u0001\u0010\u008b\u0001R\u0019\u0010\u008c\u0001\u001a\u00020$8\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u008c\u0001\u0010\u008d\u0001R\u0019\u0010\u008e\u0001\u001a\u0002028\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u008e\u0001\u0010\u008f\u0001R\u0019\u0010\u0090\u0001\u001a\u00020$8\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u0090\u0001\u0010\u008d\u0001R\u0019\u0010\u0091\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0091\u0001\u0010\u0081\u0001R\u001c\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0096\u0001\u0010\u0097\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0099\u0001\u0010\u009a\u0001R!\u0010\u00a0\u0001\u001a\u00030\u009b\u00018BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u009c\u0001\u0010\u009d\u0001\u001a\u0006\u0008\u009e\u0001\u0010\u009f\u0001\u00a8\u0006\u00a2\u0001"
    }
    d2 = {
        "Llive/hms/video/factories/HMSPeerConnectionFactory;",
        "",
        "Landroid/content/Context;",
        "context",
        "Llive/hms/video/events/AnalyticsEventsService;",
        "analyticsEventsService",
        "Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;",
        "ncStatusChecker",
        "<init>",
        "(Landroid/content/Context;Llive/hms/video/events/AnalyticsEventsService;Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;)V",
        "Llive/hms/video/media/settings/HMSTrackSettings;",
        "hmsTrackSettings",
        "",
        "isSimulcastEnabled",
        "serverSoftwareEchoCancellationEnabled",
        "Ll83/a0;",
        "initialize",
        "(Llive/hms/video/media/settings/HMSTrackSettings;ZZ)V",
        "Landroid/media/projection/MediaProjection;",
        "mMediaProjection",
        "Llive/hms/video/sdk/models/enums/AudioMixingMode;",
        "audioMixingMode",
        "startAudioMixing",
        "(Landroid/media/projection/MediaProjection;Llive/hms/video/sdk/models/enums/AudioMixingMode;)V",
        "setAudioMixingMode",
        "(Llive/hms/video/sdk/models/enums/AudioMixingMode;)V",
        "stopAudioMixing",
        "()V",
        "",
        "audioResourceId",
        "Llive/hms/video/sdk/HMSActionResultListener;",
        "hmsActionResultListener",
        "streamAndPlayAudioFromRawFile",
        "(ILlive/hms/video/sdk/HMSActionResultListener;)V",
        "stopAudioFromRawFile",
        "(Llive/hms/video/sdk/HMSActionResultListener;)V",
        "Ljava/nio/ByteBuffer;",
        "micAudioByteBuffer",
        "scaleUpMicVolume",
        "(Ljava/nio/ByteBuffer;)V",
        "captureSystemAudio",
        "mixAudioBytes",
        "initAudioRecorder",
        "(Landroid/media/projection/MediaProjection;)V",
        "initchunk",
        "Lhms/webrtc/PeerConnectionFactory$Builder;",
        "kotlin.jvm.PlatformType",
        "getPeerConnectionFactoryBuilder",
        "(ZLlive/hms/video/media/settings/HMSTrackSettings;)Lhms/webrtc/PeerConnectionFactory$Builder;",
        "initPeerConnectionFactory",
        "",
        "buff",
        "len",
        "",
        "scale",
        "scaleValues",
        "([SIF)[S",
        "Ljava/util/concurrent/ScheduledExecutorService;",
        "newDefaultScheduler",
        "()Ljava/util/concurrent/ScheduledExecutorService;",
        "sendAECAnalytics",
        "(Landroid/content/Context;)V",
        "",
        "errorMessage",
        "sendMicCaptureFailedEvent",
        "(Ljava/lang/String;)V",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "Llive/hms/video/events/AnalyticsEventsService;",
        "getAnalyticsEventsService",
        "()Llive/hms/video/events/AnalyticsEventsService;",
        "Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;",
        "getNcStatusChecker",
        "()Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;",
        "Llive/hms/video/factories/noisecancellation/NoiseCancellation;",
        "noiseCancellation",
        "Llive/hms/video/factories/noisecancellation/NoiseCancellation;",
        "getNoiseCancellation",
        "()Llive/hms/video/factories/noisecancellation/NoiseCancellation;",
        "setNoiseCancellation",
        "(Llive/hms/video/factories/noisecancellation/NoiseCancellation;)V",
        "Lhms/webrtc/VideoEncoderFactory;",
        "<set-?>",
        "videoEncoderFactory$delegate",
        "Lf93/d;",
        "getVideoEncoderFactory",
        "()Lhms/webrtc/VideoEncoderFactory;",
        "setVideoEncoderFactory",
        "(Lhms/webrtc/VideoEncoderFactory;)V",
        "videoEncoderFactory",
        "Lhms/webrtc/VideoDecoderFactory;",
        "videoDecoderFactory$delegate",
        "getVideoDecoderFactory",
        "()Lhms/webrtc/VideoDecoderFactory;",
        "setVideoDecoderFactory",
        "(Lhms/webrtc/VideoDecoderFactory;)V",
        "videoDecoderFactory",
        "Llive/hms/video/factories/SafeVariable;",
        "Lhms/webrtc/PeerConnectionFactory;",
        "factory",
        "Llive/hms/video/factories/SafeVariable;",
        "getFactory",
        "()Llive/hms/video/factories/SafeVariable;",
        "setFactory",
        "(Llive/hms/video/factories/SafeVariable;)V",
        "Lhms/webrtc/audio/WebRtcAudioRecord;",
        "webrtcAudioRecord$delegate",
        "getWebrtcAudioRecord",
        "()Lhms/webrtc/audio/WebRtcAudioRecord;",
        "setWebrtcAudioRecord",
        "(Lhms/webrtc/audio/WebRtcAudioRecord;)V",
        "webrtcAudioRecord",
        "Lhms/webrtc/audio/WebRtcAudioTrack;",
        "webRtcAudioTrack$delegate",
        "getWebRtcAudioTrack",
        "()Lhms/webrtc/audio/WebRtcAudioTrack;",
        "setWebRtcAudioTrack",
        "(Lhms/webrtc/audio/WebRtcAudioTrack;)V",
        "webRtcAudioTrack",
        "_audioMixingMode",
        "Llive/hms/video/sdk/models/enums/AudioMixingMode;",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "nextSchedulerId",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "Landroid/media/AudioManager;",
        "audioManager",
        "Landroid/media/AudioManager;",
        "inputSampleRate",
        "I",
        "outputSampleRate",
        "live/hms/video/factories/HMSPeerConnectionFactory$audioRecordErrorCallback$1",
        "audioRecordErrorCallback",
        "Llive/hms/video/factories/HMSPeerConnectionFactory$audioRecordErrorCallback$1;",
        "live/hms/video/factories/HMSPeerConnectionFactory$audioTrackErrorCallback$1",
        "audioTrackErrorCallback",
        "Llive/hms/video/factories/HMSPeerConnectionFactory$audioTrackErrorCallback$1;",
        "live/hms/video/factories/HMSPeerConnectionFactory$audioRecordStateCallback$1",
        "audioRecordStateCallback",
        "Llive/hms/video/factories/HMSPeerConnectionFactory$audioRecordStateCallback$1;",
        "systemAudioByteBuffer",
        "Ljava/nio/ByteBuffer;",
        "systemAudioShortArray",
        "[S",
        "combinedByteBuffer",
        "capacity",
        "Landroid/media/AudioRecord;",
        "mAudioRecord",
        "Landroid/media/AudioRecord;",
        "live/hms/video/factories/HMSPeerConnectionFactory$audioBufferCallback$1",
        "audioBufferCallback",
        "Llive/hms/video/factories/HMSPeerConnectionFactory$audioBufferCallback$1;",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "isSystemAudioCaptureEnabled",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "Llive/hms/video/media/capturers/HMSWavCapturer;",
        "wavCapturer$delegate",
        "Ll83/h;",
        "getWavCapturer",
        "()Llive/hms/video/media/capturers/HMSWavCapturer;",
        "wavCapturer",
        "Companion",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field static final synthetic $$delegatedProperties:[Lj93/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lj93/z;"
        }
    .end annotation
.end field

.field private static final BUFFERS_PER_SECOND:I = 0x64

.field private static final CALLBACK_BUFFER_SIZE_MS:I = 0xa

.field public static final Companion:Llive/hms/video/factories/HMSPeerConnectionFactory$Companion;

.field private static final DEFAULT_AUDIO_FORMAT:I = 0x2

.field private static final DEFAULT_AUDIO_SOURCE:I = 0x7

.field private static final FILE_VOLUME_SCALE:F = 0.1f

.field private static final INPUT_BITS_PER_SAMPLE:I = 0x10

.field private static final INPUT_NUM_OF_CHANNELS:I = 0x1

.field private static final MIC_VOLUME_SCALE:F = 5.0f

.field private static final OUTPUT_BITS_PER_SAMPLE:I = 0x10

.field private static final OUTPUT_NUM_OF_CHANNELS:I = 0x1

.field private static final PREF_AEC_EVENT_DEFAULT:Z = false

.field private static final PREF_AEC_EVENT_KEY:Ljava/lang/String; = "aec_event"

.field private static final TAG:Ljava/lang/String; = "HMSPeerConnectionFactory"


# instance fields
.field private _audioMixingMode:Llive/hms/video/sdk/models/enums/AudioMixingMode;

.field private final analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

.field private final audioBufferCallback:Llive/hms/video/factories/HMSPeerConnectionFactory$audioBufferCallback$1;

.field private final audioManager:Landroid/media/AudioManager;

.field private final audioRecordErrorCallback:Llive/hms/video/factories/HMSPeerConnectionFactory$audioRecordErrorCallback$1;

.field private final audioRecordStateCallback:Llive/hms/video/factories/HMSPeerConnectionFactory$audioRecordStateCallback$1;

.field private final audioTrackErrorCallback:Llive/hms/video/factories/HMSPeerConnectionFactory$audioTrackErrorCallback$1;

.field private capacity:I

.field private combinedByteBuffer:Ljava/nio/ByteBuffer;

.field private final context:Landroid/content/Context;

.field private factory:Llive/hms/video/factories/SafeVariable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llive/hms/video/factories/SafeVariable<",
            "Lhms/webrtc/PeerConnectionFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final inputSampleRate:I

.field private final isSystemAudioCaptureEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private mAudioRecord:Landroid/media/AudioRecord;

.field private final ncStatusChecker:Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;

.field private nextSchedulerId:Ljava/util/concurrent/atomic/AtomicInteger;

.field public noiseCancellation:Llive/hms/video/factories/noisecancellation/NoiseCancellation;

.field private final outputSampleRate:I

.field private systemAudioByteBuffer:Ljava/nio/ByteBuffer;

.field private systemAudioShortArray:[S

.field private final videoDecoderFactory$delegate:Lf93/d;

.field private final videoEncoderFactory$delegate:Lf93/d;

.field private final wavCapturer$delegate:Ll83/h;

.field private final webRtcAudioTrack$delegate:Lf93/d;

.field private final webrtcAudioRecord$delegate:Lf93/d;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Llive/hms/video/factories/HMSPeerConnectionFactory;

    const-string v2, "videoEncoderFactory"

    const-string v3, "getVideoEncoderFactory()Lhms/webrtc/VideoEncoderFactory;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    const-string v3, "videoDecoderFactory"

    const-string v5, "getVideoDecoderFactory()Lhms/webrtc/VideoDecoderFactory;"

    invoke-static {v1, v3, v5, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v3

    const-string v5, "webrtcAudioRecord"

    const-string v6, "getWebrtcAudioRecord()Lhms/webrtc/audio/WebRtcAudioRecord;"

    invoke-static {v1, v5, v6, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v5

    const-string v6, "webRtcAudioTrack"

    const-string v7, "getWebRtcAudioTrack()Lhms/webrtc/audio/WebRtcAudioTrack;"

    invoke-static {v1, v6, v7, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v1

    const/4 v2, 0x4

    new-array v2, v2, [Lj93/z;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v3, v2, v0

    const/4 v0, 0x2

    aput-object v5, v2, v0

    const/4 v0, 0x3

    aput-object v1, v2, v0

    sput-object v2, Llive/hms/video/factories/HMSPeerConnectionFactory;->$$delegatedProperties:[Lj93/z;

    new-instance v0, Llive/hms/video/factories/HMSPeerConnectionFactory$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/factories/HMSPeerConnectionFactory$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/factories/HMSPeerConnectionFactory;->Companion:Llive/hms/video/factories/HMSPeerConnectionFactory$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Llive/hms/video/events/AnalyticsEventsService;Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsEventsService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ncStatusChecker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->context:Landroid/content/Context;

    iput-object p2, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    iput-object p3, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->ncStatusChecker:Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;

    new-instance p2, Lf93/a;

    const/4 p3, 0x0

    invoke-direct {p2, p3}, Lf93/a;-><init>(I)V

    iput-object p2, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->videoEncoderFactory$delegate:Lf93/d;

    new-instance p2, Lf93/a;

    invoke-direct {p2, p3}, Lf93/a;-><init>(I)V

    iput-object p2, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->videoDecoderFactory$delegate:Lf93/d;

    new-instance p2, Llive/hms/video/factories/SafeVariable;

    invoke-direct {p2}, Llive/hms/video/factories/SafeVariable;-><init>()V

    iput-object p2, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->factory:Llive/hms/video/factories/SafeVariable;

    new-instance p2, Lf93/a;

    invoke-direct {p2, p3}, Lf93/a;-><init>(I)V

    iput-object p2, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->webrtcAudioRecord$delegate:Lf93/d;

    new-instance p2, Lf93/a;

    invoke-direct {p2, p3}, Lf93/a;-><init>(I)V

    iput-object p2, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->webRtcAudioTrack$delegate:Lf93/d;

    sget-object p2, Llive/hms/video/sdk/models/enums/AudioMixingMode;->TALK_AND_MUSIC:Llive/hms/video/sdk/models/enums/AudioMixingMode;

    iput-object p2, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->_audioMixingMode:Llive/hms/video/sdk/models/enums/AudioMixingMode;

    new-instance p2, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p2, p3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p2, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->nextSchedulerId:Ljava/util/concurrent/atomic/AtomicInteger;

    const-string p2, "audio"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type android.media.AudioManager"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/media/AudioManager;

    iput-object p1, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->audioManager:Landroid/media/AudioManager;

    sget-object p2, Llive/hms/video/utils/WertcAudioUtils;->Companion:Llive/hms/video/utils/WertcAudioUtils$Companion;

    invoke-virtual {p2, p1}, Llive/hms/video/utils/WertcAudioUtils$Companion;->getSampleRate(Landroid/media/AudioManager;)I

    move-result v0

    iput v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->inputSampleRate:I

    invoke-virtual {p2, p1}, Llive/hms/video/utils/WertcAudioUtils$Companion;->getSampleRate(Landroid/media/AudioManager;)I

    move-result p1

    iput p1, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->outputSampleRate:I

    new-instance p1, Llive/hms/video/factories/HMSPeerConnectionFactory$audioRecordErrorCallback$1;

    invoke-direct {p1, p0}, Llive/hms/video/factories/HMSPeerConnectionFactory$audioRecordErrorCallback$1;-><init>(Llive/hms/video/factories/HMSPeerConnectionFactory;)V

    iput-object p1, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->audioRecordErrorCallback:Llive/hms/video/factories/HMSPeerConnectionFactory$audioRecordErrorCallback$1;

    new-instance p1, Llive/hms/video/factories/HMSPeerConnectionFactory$audioTrackErrorCallback$1;

    invoke-direct {p1, p0}, Llive/hms/video/factories/HMSPeerConnectionFactory$audioTrackErrorCallback$1;-><init>(Llive/hms/video/factories/HMSPeerConnectionFactory;)V

    iput-object p1, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->audioTrackErrorCallback:Llive/hms/video/factories/HMSPeerConnectionFactory$audioTrackErrorCallback$1;

    new-instance p1, Llive/hms/video/factories/HMSPeerConnectionFactory$audioRecordStateCallback$1;

    invoke-direct {p1}, Llive/hms/video/factories/HMSPeerConnectionFactory$audioRecordStateCallback$1;-><init>()V

    iput-object p1, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->audioRecordStateCallback:Llive/hms/video/factories/HMSPeerConnectionFactory$audioRecordStateCallback$1;

    new-instance p1, Llive/hms/video/factories/HMSPeerConnectionFactory$audioBufferCallback$1;

    invoke-direct {p1, p0}, Llive/hms/video/factories/HMSPeerConnectionFactory$audioBufferCallback$1;-><init>(Llive/hms/video/factories/HMSPeerConnectionFactory;)V

    iput-object p1, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->audioBufferCallback:Llive/hms/video/factories/HMSPeerConnectionFactory$audioBufferCallback$1;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->isSystemAudioCaptureEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Llive/hms/video/connection/degredation/a;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Llive/hms/video/connection/degredation/a;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->wavCapturer$delegate:Ll83/h;

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Lhms/webrtc/Logging$Severity;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Llive/hms/video/factories/HMSPeerConnectionFactory;->initPeerConnectionFactory$lambda$3$lambda$2(Ljava/lang/String;Lhms/webrtc/Logging$Severity;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$captureSystemAudio(Llive/hms/video/factories/HMSPeerConnectionFactory;)V
    .locals 0

    invoke-direct {p0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->captureSystemAudio()V

    return-void
.end method

.method public static final synthetic access$getSystemAudioByteBuffer$p(Llive/hms/video/factories/HMSPeerConnectionFactory;)Ljava/nio/ByteBuffer;
    .locals 0

    iget-object p0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->systemAudioByteBuffer:Ljava/nio/ByteBuffer;

    return-object p0
.end method

.method public static final synthetic access$getWavCapturer(Llive/hms/video/factories/HMSPeerConnectionFactory;)Llive/hms/video/media/capturers/HMSWavCapturer;
    .locals 0

    invoke-direct {p0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getWavCapturer()Llive/hms/video/media/capturers/HMSWavCapturer;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getWebrtcAudioRecord(Llive/hms/video/factories/HMSPeerConnectionFactory;)Lhms/webrtc/audio/WebRtcAudioRecord;
    .locals 0

    invoke-direct {p0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getWebrtcAudioRecord()Lhms/webrtc/audio/WebRtcAudioRecord;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$get_audioMixingMode$p(Llive/hms/video/factories/HMSPeerConnectionFactory;)Llive/hms/video/sdk/models/enums/AudioMixingMode;
    .locals 0

    iget-object p0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->_audioMixingMode:Llive/hms/video/sdk/models/enums/AudioMixingMode;

    return-object p0
.end method

.method public static final synthetic access$isSystemAudioCaptureEnabled$p(Llive/hms/video/factories/HMSPeerConnectionFactory;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->isSystemAudioCaptureEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static final synthetic access$mixAudioBytes(Llive/hms/video/factories/HMSPeerConnectionFactory;Ljava/nio/ByteBuffer;)V
    .locals 0

    invoke-direct {p0, p1}, Llive/hms/video/factories/HMSPeerConnectionFactory;->mixAudioBytes(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public static final synthetic access$sendMicCaptureFailedEvent(Llive/hms/video/factories/HMSPeerConnectionFactory;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Llive/hms/video/factories/HMSPeerConnectionFactory;->sendMicCaptureFailedEvent(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Llive/hms/video/factories/HMSPeerConnectionFactory;Llive/hms/video/media/settings/HMSTrackSettings;ZZ)Lhms/webrtc/PeerConnectionFactory;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Llive/hms/video/factories/HMSPeerConnectionFactory;->initialize$lambda$0(Llive/hms/video/factories/HMSPeerConnectionFactory;Llive/hms/video/media/settings/HMSTrackSettings;ZZ)Lhms/webrtc/PeerConnectionFactory;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llive/hms/video/factories/HMSPeerConnectionFactory;)Llive/hms/video/media/capturers/HMSWavCapturer;
    .locals 0

    invoke-static {p0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->wavCapturer_delegate$lambda$5(Llive/hms/video/factories/HMSPeerConnectionFactory;)Llive/hms/video/media/capturers/HMSWavCapturer;

    move-result-object p0

    return-object p0
.end method

.method private final captureSystemAudio()V
    .locals 4

    iget-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->mAudioRecord:Landroid/media/AudioRecord;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->systemAudioByteBuffer:Ljava/nio/ByteBuffer;

    const/4 v2, 0x0

    const-string v3, "systemAudioByteBuffer"

    if-eqz v1, :cond_1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/media/AudioRecord;->read(Ljava/nio/ByteBuffer;II)I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Read "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " bytes of System audio buffer"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AudioMixing"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method public static synthetic d(Llive/hms/video/factories/HMSPeerConnectionFactory;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 0

    invoke-static {p0, p1, p2}, Llive/hms/video/factories/HMSPeerConnectionFactory;->newDefaultScheduler$lambda$4(Llive/hms/video/factories/HMSPeerConnectionFactory;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object p0

    return-object p0
.end method

.method private final getPeerConnectionFactoryBuilder(ZLlive/hms/video/media/settings/HMSTrackSettings;)Lhms/webrtc/PeerConnectionFactory$Builder;
    .locals 10

    invoke-static {}, Lhms/webrtc/PeerConnectionFactory;->builder()Lhms/webrtc/PeerConnectionFactory$Builder;

    move-result-object p1

    new-instance v0, Lhms/webrtc/PeerConnectionFactory$Options;

    invoke-direct {v0}, Lhms/webrtc/PeerConnectionFactory$Options;-><init>()V

    invoke-virtual {p1, v0}, Lhms/webrtc/PeerConnectionFactory$Builder;->setOptions(Lhms/webrtc/PeerConnectionFactory$Options;)Lhms/webrtc/PeerConnectionFactory$Builder;

    new-instance v1, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper;

    sget-object v0, Llive/hms/video/utils/SharedEglContext;->INSTANCE:Llive/hms/video/utils/SharedEglContext;

    invoke-virtual {v0}, Llive/hms/video/utils/SharedEglContext;->getContext()Lhms/webrtc/EglBase$Context;

    move-result-object v2

    invoke-virtual {p2}, Llive/hms/video/media/settings/HMSTrackSettings;->getVideoSettings()Llive/hms/video/media/settings/HMSVideoTrackSettings;

    move-result-object v3

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getForceSoftwareEncoder()Z

    move-result v3

    if-ne v3, v9, :cond_0

    move v5, v9

    goto :goto_0

    :cond_0
    move v5, v8

    :goto_0
    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v7}, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper;-><init>(Lhms/webrtc/EglBase$Context;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v1}, Llive/hms/video/factories/HMSPeerConnectionFactory;->setVideoEncoderFactory(Lhms/webrtc/VideoEncoderFactory;)V

    new-instance v1, Llive/hms/video/factories/HMSVideoDecoderFactory;

    invoke-virtual {v0}, Llive/hms/video/utils/SharedEglContext;->getContext()Lhms/webrtc/EglBase$Context;

    move-result-object v0

    const-string v2, "<get-context>(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Llive/hms/video/media/settings/HMSTrackSettings;->getVideoSettings()Llive/hms/video/media/settings/HMSVideoTrackSettings;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getForceSoftwareDecoder()Z

    move-result v2

    if-ne v2, v9, :cond_1

    move v2, v9

    goto :goto_1

    :cond_1
    move v2, v8

    :goto_1
    invoke-direct {v1, v0, v2}, Llive/hms/video/factories/HMSVideoDecoderFactory;-><init>(Lhms/webrtc/EglBase$Context;Z)V

    invoke-direct {p0, v1}, Llive/hms/video/factories/HMSPeerConnectionFactory;->setVideoDecoderFactory(Lhms/webrtc/VideoDecoderFactory;)V

    invoke-direct {p0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getVideoEncoderFactory()Lhms/webrtc/VideoEncoderFactory;

    move-result-object v0

    invoke-virtual {p1, v0}, Lhms/webrtc/PeerConnectionFactory$Builder;->setVideoEncoderFactory(Lhms/webrtc/VideoEncoderFactory;)Lhms/webrtc/PeerConnectionFactory$Builder;

    invoke-direct {p0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getVideoDecoderFactory()Lhms/webrtc/VideoDecoderFactory;

    move-result-object v0

    invoke-virtual {p1, v0}, Lhms/webrtc/PeerConnectionFactory$Builder;->setVideoDecoderFactory(Lhms/webrtc/VideoDecoderFactory;)Lhms/webrtc/PeerConnectionFactory$Builder;

    new-instance v0, Llive/hms/video/factories/noisecancellation/NoiseCancellationFactoryImpl;

    iget-object v1, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->ncStatusChecker:Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;

    invoke-direct {v0, v1}, Llive/hms/video/factories/noisecancellation/NoiseCancellationFactoryImpl;-><init>(Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;)V

    iget-object v1, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->context:Landroid/content/Context;

    invoke-virtual {v0, v1}, Llive/hms/video/factories/noisecancellation/NoiseCancellationFactoryImpl;->jniLoad(Landroid/content/Context;)Llive/hms/video/factories/noisecancellation/NoiseCancellation;

    move-result-object v0

    invoke-virtual {p0, v0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->setNoiseCancellation(Llive/hms/video/factories/noisecancellation/NoiseCancellation;)V

    invoke-virtual {p0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getNoiseCancellation()Llive/hms/video/factories/noisecancellation/NoiseCancellation;

    move-result-object v0

    invoke-virtual {p2}, Llive/hms/video/media/settings/HMSTrackSettings;->getAudioSettings()Llive/hms/video/media/settings/HMSAudioTrackSettings;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Llive/hms/video/media/settings/HMSAudioTrackSettings;->getEnableNoiseCancellation()Z

    move-result p2

    if-ne p2, v9, :cond_2

    move v8, v9

    :cond_2
    invoke-interface {v0, v8}, Llive/hms/video/factories/noisecancellation/NoiseCancellation;->getAudioProcessingFactory(Z)Lhms/webrtc/AudioProcessingFactory;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p1, p2}, Lhms/webrtc/PeerConnectionFactory$Builder;->setAudioProcessingFactory(Lhms/webrtc/AudioProcessingFactory;)Lhms/webrtc/PeerConnectionFactory$Builder;

    :cond_3
    return-object p1
.end method

.method public static synthetic getPeerConnectionFactoryBuilder$default(Llive/hms/video/factories/HMSPeerConnectionFactory;ZLlive/hms/video/media/settings/HMSTrackSettings;ILjava/lang/Object;)Lhms/webrtc/PeerConnectionFactory$Builder;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getPeerConnectionFactoryBuilder(ZLlive/hms/video/media/settings/HMSTrackSettings;)Lhms/webrtc/PeerConnectionFactory$Builder;

    move-result-object p0

    return-object p0
.end method

.method private final getVideoDecoderFactory()Lhms/webrtc/VideoDecoderFactory;
    .locals 3

    iget-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->videoDecoderFactory$delegate:Lf93/d;

    sget-object v1, Llive/hms/video/factories/HMSPeerConnectionFactory;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhms/webrtc/VideoDecoderFactory;

    return-object v0
.end method

.method private final getVideoEncoderFactory()Lhms/webrtc/VideoEncoderFactory;
    .locals 3

    iget-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->videoEncoderFactory$delegate:Lf93/d;

    sget-object v1, Llive/hms/video/factories/HMSPeerConnectionFactory;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhms/webrtc/VideoEncoderFactory;

    return-object v0
.end method

.method private final getWavCapturer()Llive/hms/video/media/capturers/HMSWavCapturer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->wavCapturer$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llive/hms/video/media/capturers/HMSWavCapturer;

    return-object v0
.end method

.method private final getWebRtcAudioTrack()Lhms/webrtc/audio/WebRtcAudioTrack;
    .locals 3

    iget-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->webRtcAudioTrack$delegate:Lf93/d;

    sget-object v1, Llive/hms/video/factories/HMSPeerConnectionFactory;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhms/webrtc/audio/WebRtcAudioTrack;

    return-object v0
.end method

.method private final getWebrtcAudioRecord()Lhms/webrtc/audio/WebRtcAudioRecord;
    .locals 3

    iget-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->webrtcAudioRecord$delegate:Lf93/d;

    sget-object v1, Llive/hms/video/factories/HMSPeerConnectionFactory;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhms/webrtc/audio/WebRtcAudioRecord;

    return-object v0
.end method

.method private final initAudioRecorder(Landroid/media/projection/MediaProjection;)V
    .locals 3

    iget v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->inputSampleRate:I

    const/16 v1, 0x10

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    new-instance v0, Landroid/media/AudioFormat$Builder;

    invoke-direct {v0}, Landroid/media/AudioFormat$Builder;-><init>()V

    invoke-virtual {v0, v2}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    move-result-object v0

    iget v1, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->inputSampleRate:I

    invoke-virtual {v0, v1}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    move-result-object v0

    new-instance v1, Landroid/media/AudioPlaybackCaptureConfiguration$Builder;

    invoke-direct {v1, p1}, Landroid/media/AudioPlaybackCaptureConfiguration$Builder;-><init>(Landroid/media/projection/MediaProjection;)V

    const/4 p1, 0x1

    invoke-virtual {v1, p1}, Landroid/media/AudioPlaybackCaptureConfiguration$Builder;->addMatchingUsage(I)Landroid/media/AudioPlaybackCaptureConfiguration$Builder;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/media/AudioPlaybackCaptureConfiguration$Builder;->addMatchingUsage(I)Landroid/media/AudioPlaybackCaptureConfiguration$Builder;

    move-result-object p1

    const/16 v1, 0xe

    invoke-virtual {p1, v1}, Landroid/media/AudioPlaybackCaptureConfiguration$Builder;->addMatchingUsage(I)Landroid/media/AudioPlaybackCaptureConfiguration$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/media/AudioPlaybackCaptureConfiguration$Builder;->build()Landroid/media/AudioPlaybackCaptureConfiguration;

    move-result-object p1

    const-string v1, "build(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->context:Landroid/content/Context;

    const-string v2, "android.permission.RECORD_AUDIO"

    invoke-static {v1, v2}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    new-instance v1, Landroid/media/AudioRecord$Builder;

    invoke-direct {v1}, Landroid/media/AudioRecord$Builder;-><init>()V

    invoke-virtual {v1, v0}, Landroid/media/AudioRecord$Builder;->setAudioFormat(Landroid/media/AudioFormat;)Landroid/media/AudioRecord$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/media/AudioRecord$Builder;->setAudioPlaybackCaptureConfig(Landroid/media/AudioPlaybackCaptureConfiguration;)Landroid/media/AudioRecord$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/media/AudioRecord$Builder;->build()Landroid/media/AudioRecord;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->mAudioRecord:Landroid/media/AudioRecord;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/media/AudioRecord;->startRecording()V

    return-void
.end method

.method private final initPeerConnectionFactory()V
    .locals 3

    iget-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->context:Landroid/content/Context;

    invoke-static {v0}, Lhms/webrtc/PeerConnectionFactory$InitializationOptions;->builder(Landroid/content/Context;)Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;

    move-result-object v0

    const-string v1, "WebRTC-H264HighProfile/Enabled/WebRTC-MediaCodecVideoEncoder-AutomaticResize/Enabled/WebRTC-UseDifferentiatedCellularCosts/Enabled/"

    invoke-virtual {v0, v1}, Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;->setFieldTrials(Ljava/lang/String;)Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;

    new-instance v1, Llive/hms/video/factories/c;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Llive/hms/video/factories/c;-><init>(I)V

    sget-object v2, Lhms/webrtc/Logging$Severity;->LS_VERBOSE:Lhms/webrtc/Logging$Severity;

    invoke-virtual {v0, v1, v2}, Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;->setInjectableLogger(Lhms/webrtc/Loggable;Lhms/webrtc/Logging$Severity;)Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;

    invoke-virtual {v0}, Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;->createInitializationOptions()Lhms/webrtc/PeerConnectionFactory$InitializationOptions;

    move-result-object v0

    invoke-static {v0}, Lhms/webrtc/PeerConnectionFactory;->initialize(Lhms/webrtc/PeerConnectionFactory$InitializationOptions;)V

    return-void
.end method

.method private static final initPeerConnectionFactory$lambda$3$lambda$2(Ljava/lang/String;Lhms/webrtc/Logging$Severity;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, p2, p0}, Llive/hms/video/utils/HMSLogger;->webRTCLog$lib_release(Lhms/webrtc/Logging$Severity;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final initchunk()V
    .locals 2

    iget v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->inputSampleRate:I

    div-int/lit8 v0, v0, 0x64

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->capacity:I

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->systemAudioByteBuffer:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    new-array v0, v0, [S

    iput-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->systemAudioShortArray:[S

    return-void

    :cond_0
    const-string v0, "systemAudioByteBuffer"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private static final initialize$lambda$0(Llive/hms/video/factories/HMSPeerConnectionFactory;Llive/hms/video/media/settings/HMSTrackSettings;ZZ)Lhms/webrtc/PeerConnectionFactory;
    .locals 13

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$hmsTrackSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->initPeerConnectionFactory()V

    invoke-static {}, Lhms/webrtc/audio/JavaAudioDeviceModule;->isBuiltInAcousticEchoCancelerSupported()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Llive/hms/video/media/settings/HMSTrackSettings;->getAudioSettings()Llive/hms/video/media/settings/HMSAudioTrackSettings;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Llive/hms/video/media/settings/HMSAudioTrackSettings;->getUseHardwareAcousticEchoCanceler()Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v2, 0x1

    if-nez v0, :cond_2

    if-nez p2, :cond_3

    :cond_1
    move v1, v2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Llive/hms/video/media/settings/HMSTrackSettings;->getAudioSettings()Llive/hms/video/media/settings/HMSAudioTrackSettings;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/media/settings/HMSAudioTrackSettings;->getUseHardwareAcousticEchoCanceler()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :cond_3
    :goto_1
    move v11, v1

    invoke-static {}, Lhms/webrtc/audio/JavaAudioDeviceModule;->isBuiltInNoiseSuppressorSupported()Z

    move-result v12

    new-instance v2, Lhms/webrtc/audio/WebRtcAudioRecord;

    iget-object v3, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->context:Landroid/content/Context;

    invoke-direct {p0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->newDefaultScheduler()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v4

    iget-object v5, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->audioManager:Landroid/media/AudioManager;

    iget-object v8, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->audioRecordErrorCallback:Llive/hms/video/factories/HMSPeerConnectionFactory$audioRecordErrorCallback$1;

    iget-object v9, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->audioRecordStateCallback:Llive/hms/video/factories/HMSPeerConnectionFactory$audioRecordStateCallback$1;

    const/4 v10, 0x0

    const/4 v6, 0x7

    const/4 v7, 0x2

    invoke-direct/range {v2 .. v12}, Lhms/webrtc/audio/WebRtcAudioRecord;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Landroid/media/AudioManager;IILhms/webrtc/audio/JavaAudioDeviceModule$AudioRecordErrorCallback;Lhms/webrtc/audio/JavaAudioDeviceModule$AudioRecordStateCallback;Lhms/webrtc/audio/JavaAudioDeviceModule$SamplesReadyCallback;ZZ)V

    invoke-direct {p0, v2}, Llive/hms/video/factories/HMSPeerConnectionFactory;->setWebrtcAudioRecord(Lhms/webrtc/audio/WebRtcAudioRecord;)V

    new-instance v3, Lhms/webrtc/audio/WebRtcAudioTrack;

    iget-object v4, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->context:Landroid/content/Context;

    iget-object v5, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->audioManager:Landroid/media/AudioManager;

    iget-object v7, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->audioTrackErrorCallback:Llive/hms/video/factories/HMSPeerConnectionFactory$audioTrackErrorCallback$1;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v10}, Lhms/webrtc/audio/WebRtcAudioTrack;-><init>(Landroid/content/Context;Landroid/media/AudioManager;Landroid/media/AudioAttributes;Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackErrorCallback;Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStateCallback;ZZ)V

    invoke-direct {p0, v3}, Llive/hms/video/factories/HMSPeerConnectionFactory;->setWebRtcAudioTrack(Lhms/webrtc/audio/WebRtcAudioTrack;)V

    new-instance v4, Lhms/webrtc/audio/JavaAudioDeviceModule;

    iget-object v5, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->context:Landroid/content/Context;

    iget-object v6, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->audioManager:Landroid/media/AudioManager;

    invoke-direct {p0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getWebrtcAudioRecord()Lhms/webrtc/audio/WebRtcAudioRecord;

    move-result-object v7

    invoke-direct {p0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getWebRtcAudioTrack()Lhms/webrtc/audio/WebRtcAudioTrack;

    move-result-object v8

    iget v9, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->inputSampleRate:I

    iget v10, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->outputSampleRate:I

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v4 .. v12}, Lhms/webrtc/audio/JavaAudioDeviceModule;-><init>(Landroid/content/Context;Landroid/media/AudioManager;Lhms/webrtc/audio/WebRtcAudioRecord;Lhms/webrtc/audio/WebRtcAudioTrack;IIZZ)V

    move/from16 v0, p3

    invoke-direct {p0, v0, p1}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getPeerConnectionFactoryBuilder(ZLlive/hms/video/media/settings/HMSTrackSettings;)Lhms/webrtc/PeerConnectionFactory$Builder;

    move-result-object p1

    invoke-virtual {p1, v4}, Lhms/webrtc/PeerConnectionFactory$Builder;->setAudioDeviceModule(Lhms/webrtc/audio/AudioDeviceModule;)Lhms/webrtc/PeerConnectionFactory$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lhms/webrtc/PeerConnectionFactory$Builder;->createPeerConnectionFactory()Lhms/webrtc/PeerConnectionFactory;

    move-result-object p1

    iget-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->context:Landroid/content/Context;

    invoke-direct {p0, v0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->sendAECAnalytics(Landroid/content/Context;)V

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method

.method private final mixAudioBytes(Ljava/nio/ByteBuffer;)V
    .locals 8

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v1, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->systemAudioByteBuffer:Ljava/nio/ByteBuffer;

    const-string v2, "systemAudioByteBuffer"

    const/4 v3, 0x0

    if-eqz v1, :cond_a

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v1

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    new-array v5, v4, [S

    invoke-virtual {v1, v5}, Ljava/nio/ShortBuffer;->get([S)Ljava/nio/ShortBuffer;

    iget-object v1, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->systemAudioByteBuffer:Ljava/nio/ByteBuffer;

    if-eqz v1, :cond_9

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v0

    iget-object v1, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->systemAudioShortArray:[S

    const-string v6, "systemAudioShortArray"

    if-eqz v1, :cond_8

    invoke-virtual {v0, v1}, Ljava/nio/ShortBuffer;->get([S)Ljava/nio/ShortBuffer;

    const/high16 v0, 0x40a00000    # 5.0f

    invoke-direct {p0, v5, v4, v0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->scaleValues([SIF)[S

    iget-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->systemAudioShortArray:[S

    if-eqz v0, :cond_7

    if-eqz v0, :cond_6

    array-length v1, v0

    const v7, 0x3dcccccd    # 0.1f

    invoke-direct {p0, v0, v1, v7}, Llive/hms/video/factories/HMSPeerConnectionFactory;->scaleValues([SIF)[S

    sget-object v0, Llive/hms/video/utils/HMSUtils;->INSTANCE:Llive/hms/video/utils/HMSUtils;

    iget-object v1, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->systemAudioShortArray:[S

    if-eqz v1, :cond_5

    if-eqz v1, :cond_4

    array-length v6, v1

    invoke-virtual {v0, v5, v4, v1, v6}, Llive/hms/video/utils/HMSUtils;->addAndConvertBuffers([SI[SI)[B

    move-result-object v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->combinedByteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    iget-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->_audioMixingMode:Llive/hms/video/sdk/models/enums/AudioMixingMode;

    sget-object v1, Llive/hms/video/sdk/models/enums/AudioMixingMode;->TALK_AND_MUSIC:Llive/hms/video/sdk/models/enums/AudioMixingMode;

    const-string v4, "AudioMixing"

    if-ne v0, v1, :cond_1

    const-string v0, "Adding combinedByteBuffer"

    invoke-static {v4, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->combinedByteBuffer:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    return-void

    :cond_0
    const-string p1, "combinedByteBuffer"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_1
    sget-object v1, Llive/hms/video/sdk/models/enums/AudioMixingMode;->MUSIC_ONLY:Llive/hms/video/sdk/models/enums/AudioMixingMode;

    if-ne v0, v1, :cond_3

    const-string v0, "Adding systemAudioByteBuffer"

    invoke-static {v4, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->systemAudioByteBuffer:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_2

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    return-void

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_3
    return-void

    :cond_4
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_5
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_6
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_7
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_8
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_9
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_a
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3
.end method

.method private final newDefaultScheduler()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 3

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    new-instance v2, Llive/hms/video/factories/a;

    invoke-direct {v2, p0, v0}, Llive/hms/video/factories/a;-><init>(Llive/hms/video/factories/HMSPeerConnectionFactory;Ljava/util/concurrent/atomic/AtomicInteger;)V

    invoke-static {v1, v2}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method private static final newDefaultScheduler$lambda$4(Llive/hms/video/factories/HMSPeerConnectionFactory;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$nextThreadId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/concurrent/Executors;->defaultThreadFactory()Ljava/util/concurrent/ThreadFactory;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/concurrent/ThreadFactory;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object p2

    iget-object p0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->nextSchedulerId:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const/4 p1, 0x2

    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    const-string p1, "WebRtcAudioRecordScheduler-%s-%s"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    return-object p2
.end method

.method private final scaleUpMicVolume(Ljava/nio/ByteBuffer;)V
    .locals 2

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v0

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    new-array v1, p1, [S

    invoke-virtual {v0, v1}, Ljava/nio/ShortBuffer;->get([S)Ljava/nio/ShortBuffer;

    const/high16 v0, 0x40a00000    # 5.0f

    invoke-direct {p0, v1, p1, v0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->scaleValues([SIF)[S

    return-void
.end method

.method private final scaleValues([SIF)[S
    .locals 3

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_2

    aget-short v1, p1, v0

    int-to-float v1, v1

    mul-float/2addr v1, p3

    float-to-int v1, v1

    const/16 v2, 0x7fff

    if-le v1, v2, :cond_0

    :goto_1
    move v1, v2

    goto :goto_2

    :cond_0
    const/16 v2, -0x8000

    if-ge v1, v2, :cond_1

    goto :goto_1

    :cond_1
    :goto_2
    int-to-short v1, v1

    aput-short v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-object p1
.end method

.method private final sendAECAnalytics(Landroid/content/Context;)V
    .locals 3

    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    const/4 v0, 0x0

    const-string v1, "aec_event"

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lhms/webrtc/audio/JavaAudioDeviceModule;->isBuiltInAcousticEchoCancelerSupported()Z

    move-result v0

    sget-object v2, Llive/hms/video/events/AnalyticsEventFactory;->INSTANCE:Llive/hms/video/events/AnalyticsEventFactory;

    invoke-virtual {v2, v0}, Llive/hms/video/events/AnalyticsEventFactory;->audioEchoCancellation(Z)Llive/hms/video/events/AnalyticsEvent;

    move-result-object v0

    iget-object v2, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    invoke-virtual {v2, v0}, Llive/hms/video/events/AnalyticsEventsService;->queue(Llive/hms/video/events/AnalyticsEvent;)Llive/hms/video/events/AnalyticsEventsService;

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const/4 v0, 0x1

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    return-void
.end method

.method private final sendMicCaptureFailedEvent(Ljava/lang/String;)V
    .locals 7

    sget-object v0, Llive/hms/video/error/ErrorFactory$TracksErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$TracksErrors;

    sget-object v1, Llive/hms/video/error/ErrorFactory$Action;->TRACK:Llive/hms/video/error/ErrorFactory$Action;

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-static/range {v0 .. v6}, Llive/hms/video/error/ErrorFactory$TracksErrors;->MicCaptureFailed$default(Llive/hms/video/error/ErrorFactory$TracksErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p1

    sget-object v0, Llive/hms/video/events/AnalyticsEventFactory;->INSTANCE:Llive/hms/video/events/AnalyticsEventFactory;

    invoke-virtual {v0, p1}, Llive/hms/video/events/AnalyticsEventFactory;->audioPublishFail(Llive/hms/video/error/HMSException;)Llive/hms/video/events/AnalyticsEvent;

    move-result-object p1

    iget-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    invoke-virtual {v0, p1}, Llive/hms/video/events/AnalyticsEventsService;->queue(Llive/hms/video/events/AnalyticsEvent;)Llive/hms/video/events/AnalyticsEventsService;

    return-void
.end method

.method private final setVideoDecoderFactory(Lhms/webrtc/VideoDecoderFactory;)V
    .locals 3

    iget-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->videoDecoderFactory$delegate:Lf93/d;

    sget-object v1, Llive/hms/video/factories/HMSPeerConnectionFactory;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method private final setVideoEncoderFactory(Lhms/webrtc/VideoEncoderFactory;)V
    .locals 3

    iget-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->videoEncoderFactory$delegate:Lf93/d;

    sget-object v1, Llive/hms/video/factories/HMSPeerConnectionFactory;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method private final setWebRtcAudioTrack(Lhms/webrtc/audio/WebRtcAudioTrack;)V
    .locals 3

    iget-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->webRtcAudioTrack$delegate:Lf93/d;

    sget-object v1, Llive/hms/video/factories/HMSPeerConnectionFactory;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method private final setWebrtcAudioRecord(Lhms/webrtc/audio/WebRtcAudioRecord;)V
    .locals 3

    iget-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->webrtcAudioRecord$delegate:Lf93/d;

    sget-object v1, Llive/hms/video/factories/HMSPeerConnectionFactory;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method private static final wavCapturer_delegate$lambda$5(Llive/hms/video/factories/HMSPeerConnectionFactory;)Llive/hms/video/media/capturers/HMSWavCapturer;
    .locals 8

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/media/capturers/HMSWavCapturer;

    iget-object v2, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->context:Landroid/content/Context;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const v3, 0xbb80

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Llive/hms/video/media/capturers/HMSWavCapturer;-><init>(Landroid/content/Context;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method


# virtual methods
.method public final getAnalyticsEventsService()Llive/hms/video/events/AnalyticsEventsService;
    .locals 1

    iget-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    return-object v0
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->context:Landroid/content/Context;

    return-object v0
.end method

.method public final getFactory()Llive/hms/video/factories/SafeVariable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Llive/hms/video/factories/SafeVariable<",
            "Lhms/webrtc/PeerConnectionFactory;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->factory:Llive/hms/video/factories/SafeVariable;

    return-object v0
.end method

.method public final getNcStatusChecker()Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;
    .locals 1

    iget-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->ncStatusChecker:Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;

    return-object v0
.end method

.method public final getNoiseCancellation()Llive/hms/video/factories/noisecancellation/NoiseCancellation;
    .locals 1

    iget-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->noiseCancellation:Llive/hms/video/factories/noisecancellation/NoiseCancellation;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "noiseCancellation"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final initialize(Llive/hms/video/media/settings/HMSTrackSettings;ZZ)V
    .locals 2

    const-string v0, "hmsTrackSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->factory:Llive/hms/video/factories/SafeVariable;

    new-instance v1, Llive/hms/video/factories/b;

    invoke-direct {v1, p0, p1, p3, p2}, Llive/hms/video/factories/b;-><init>(Llive/hms/video/factories/HMSPeerConnectionFactory;Llive/hms/video/media/settings/HMSTrackSettings;ZZ)V

    invoke-virtual {v0, v1}, Llive/hms/video/factories/SafeVariable;->initialize(Lc93/a;)V

    return-void
.end method

.method public final setAudioMixingMode(Llive/hms/video/sdk/models/enums/AudioMixingMode;)V
    .locals 2

    const-string v0, "audioMixingMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "setting Audio Mixing mode to "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AudioMixing"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->_audioMixingMode:Llive/hms/video/sdk/models/enums/AudioMixingMode;

    return-void
.end method

.method public final setFactory(Llive/hms/video/factories/SafeVariable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/factories/SafeVariable<",
            "Lhms/webrtc/PeerConnectionFactory;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->factory:Llive/hms/video/factories/SafeVariable;

    return-void
.end method

.method public final setNoiseCancellation(Llive/hms/video/factories/noisecancellation/NoiseCancellation;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->noiseCancellation:Llive/hms/video/factories/noisecancellation/NoiseCancellation;

    return-void
.end method

.method public final startAudioMixing(Landroid/media/projection/MediaProjection;Llive/hms/video/sdk/models/enums/AudioMixingMode;)V
    .locals 2

    const-string v0, "mMediaProjection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "audioMixingMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "starting audio mixing in "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " mode"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AudioMixing"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Llive/hms/video/factories/HMSPeerConnectionFactory;->initAudioRecorder(Landroid/media/projection/MediaProjection;)V

    invoke-direct {p0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->initchunk()V

    iget-object p1, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->isSystemAudioCaptureEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-direct {p0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getWebrtcAudioRecord()Lhms/webrtc/audio/WebRtcAudioRecord;

    move-result-object p1

    iget-object v1, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->audioBufferCallback:Llive/hms/video/factories/HMSPeerConnectionFactory$audioBufferCallback$1;

    invoke-virtual {p1, v1}, Lhms/webrtc/audio/WebRtcAudioRecord;->setBufferCallback(Lhms/webrtc/audio/WebRtcAudioRecord$AudioBufferCallback;)V

    iput-object p2, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->_audioMixingMode:Llive/hms/video/sdk/models/enums/AudioMixingMode;

    invoke-direct {p0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getWebrtcAudioRecord()Lhms/webrtc/audio/WebRtcAudioRecord;

    move-result-object p1

    invoke-virtual {p1, v0}, Lhms/webrtc/audio/WebRtcAudioRecord;->isMixingNeeded(Z)V

    return-void
.end method

.method public final stopAudioFromRawFile(Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 10

    const-string v0, "hmsActionResultListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getWavCapturer()Llive/hms/video/media/capturers/HMSWavCapturer;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/media/capturers/HMSWavCapturer;->isStarted()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    invoke-direct {p0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getWavCapturer()Llive/hms/video/media/capturers/HMSWavCapturer;

    move-result-object v1

    invoke-virtual {v1}, Llive/hms/video/media/capturers/HMSWavCapturer;->close()V

    invoke-direct {p0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getWebrtcAudioRecord()Lhms/webrtc/audio/WebRtcAudioRecord;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lhms/webrtc/audio/WebRtcAudioRecord;->isMixingNeeded(Z)V

    if-eqz v0, :cond_0

    invoke-interface {p1}, Llive/hms/video/sdk/HMSActionResultListener;->onSuccess()V

    return-void

    :cond_0
    sget-object v3, Llive/hms/video/error/ErrorFactory$GenericErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$GenericErrors;

    sget-object v4, Llive/hms/video/error/ErrorFactory$Action;->PLUGIN:Llive/hms/video/error/ErrorFactory$Action;

    const/16 v8, 0x8

    const/4 v9, 0x0

    const-string v5, "Unable to stop because no wav file is playing"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Llive/hms/video/error/ErrorFactory$GenericErrors;->Unknown$default(Llive/hms/video/error/ErrorFactory$GenericErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object v0

    invoke-interface {p1, v0}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    return-void
.end method

.method public final stopAudioMixing()V
    .locals 3

    iget-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->isSystemAudioCaptureEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const-string v0, "AudioMixing"

    const-string v2, "stopping Audio mixing"

    invoke-static {v0, v2}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getWebrtcAudioRecord()Lhms/webrtc/audio/WebRtcAudioRecord;

    move-result-object v0

    invoke-virtual {v0, v1}, Lhms/webrtc/audio/WebRtcAudioRecord;->isMixingNeeded(Z)V

    return-void
.end method

.method public final streamAndPlayAudioFromRawFile(ILlive/hms/video/sdk/HMSActionResultListener;)V
    .locals 8

    const-string v0, "hmsActionResultListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->initchunk()V

    :try_start_0
    invoke-direct {p0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getWavCapturer()Llive/hms/video/media/capturers/HMSWavCapturer;

    move-result-object v0

    invoke-virtual {v0, p1}, Llive/hms/video/media/capturers/HMSWavCapturer;->loadUrl(I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_0
    instance-of v0, p1, Ll83/m;

    if-nez v0, :cond_0

    invoke-direct {p0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getWebrtcAudioRecord()Lhms/webrtc/audio/WebRtcAudioRecord;

    move-result-object p1

    iget-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory;->audioBufferCallback:Llive/hms/video/factories/HMSPeerConnectionFactory$audioBufferCallback$1;

    invoke-virtual {p1, v0}, Lhms/webrtc/audio/WebRtcAudioRecord;->setBufferCallback(Lhms/webrtc/audio/WebRtcAudioRecord$AudioBufferCallback;)V

    invoke-direct {p0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->getWebrtcAudioRecord()Lhms/webrtc/audio/WebRtcAudioRecord;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lhms/webrtc/audio/WebRtcAudioRecord;->isMixingNeeded(Z)V

    invoke-interface {p2}, Llive/hms/video/sdk/HMSActionResultListener;->onSuccess()V

    goto :goto_1

    :cond_0
    sget-object v1, Llive/hms/video/error/ErrorFactory$GenericErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$GenericErrors;

    sget-object v2, Llive/hms/video/error/ErrorFactory$Action;->PLUGIN:Llive/hms/video/error/ErrorFactory$Action;

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const-string v3, "Unable to start wav playback"

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Llive/hms/video/error/ErrorFactory$GenericErrors;->Unknown$default(Llive/hms/video/error/ErrorFactory$GenericErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p1

    invoke-interface {p2, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    :goto_1
    return-void
.end method
