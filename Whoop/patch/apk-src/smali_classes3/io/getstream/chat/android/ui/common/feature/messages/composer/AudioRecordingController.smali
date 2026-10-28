.class public final Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$Companion;,
        Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0007\n\u0002\u0010\u0015\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u0000 `2\u00020\u0001:\u0001`B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J%\u0010\u0014\u001a\u00020\u000e2\u0016\u0008\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0004\u0008\u001a\u0010\u0010J\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u001e\u0010\u0017J\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020 0\u001fH\u0086@\u00a2\u0006\u0004\u0008!\u0010\u0010J\u0010\u0010\"\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0004\u0008\"\u0010\u0010J\r\u0010#\u001a\u00020\u000e\u00a2\u0006\u0004\u0008#\u0010\u0017J\u000f\u0010$\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008$\u0010\u0017J\u0017\u0010\'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%H\u0002\u00a2\u0006\u0004\u0008\'\u0010(J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%H\u0002\u00a2\u0006\u0004\u0008)\u0010(J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020*H\u0002\u00a2\u0006\u0004\u0008,\u0010-J\u0017\u00100\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020.H\u0002\u00a2\u0006\u0004\u00080\u00101J\u000f\u00102\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u00082\u0010\u0017J\u0017\u00105\u001a\u00020\u000e2\u0006\u00104\u001a\u000203H\u0002\u00a2\u0006\u0004\u00085\u00106J\u001f\u00108\u001a\u0008\u0012\u0004\u0012\u00020\u001207*\u0008\u0012\u0004\u0012\u00020%07H\u0002\u00a2\u0006\u0004\u00088\u00109J\u0017\u00108\u001a\u00020\u00122\u0006\u0010:\u001a\u00020%H\u0002\u00a2\u0006\u0004\u00088\u0010;J\'\u0010=\u001a\u0008\u0012\u0004\u0012\u00020%07*\u0008\u0012\u0004\u0012\u00020%072\u0006\u0010<\u001a\u00020%H\u0002\u00a2\u0006\u0004\u0008=\u0010>J\u0013\u0010=\u001a\u00020%*\u00020?H\u0002\u00a2\u0006\u0004\u0008=\u0010@R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010AR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010BR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010CR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR\u001d\u0010I\u001a\u0008\u0012\u0004\u0012\u0002030H8\u0006\u00a2\u0006\u000c\n\u0004\u0008I\u0010J\u001a\u0004\u0008K\u0010LR\u0014\u0010M\u001a\u00020%8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008M\u0010NR\u0014\u0010O\u001a\u00020%8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008O\u0010NR$\u0010R\u001a\u0012\u0012\u0004\u0012\u00020%0Pj\u0008\u0012\u0004\u0012\u00020%`Q8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008R\u0010SR\u0014\u0010T\u001a\u00020%8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008T\u0010NR\u0014\u0010U\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008U\u0010NR$\u0010V\u001a\u0012\u0012\u0004\u0012\u00020%0Pj\u0008\u0012\u0004\u0012\u00020%`Q8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008V\u0010SR\u0016\u0010W\u001a\u00020%8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008W\u0010NR$\u0010X\u001a\u0012\u0012\u0004\u0012\u00020\u00120Pj\u0008\u0012\u0004\u0012\u00020\u0012`Q8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008X\u0010SR\u0014\u0010Y\u001a\u00020?8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Y\u0010ZR\u0016\u0010[\u001a\u00020%8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008[\u0010NR\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008]\u0010^R\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008_\u0010^\u00a8\u0006a"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;",
        "",
        "Lio/getstream/chat/android/client/audio/AudioPlayer;",
        "audioPlayer",
        "Ls23/g;",
        "mediaRecorder",
        "Lkotlin/Function1;",
        "Ljava/io/File;",
        "",
        "fileToUri",
        "Lbc3/c0;",
        "scope",
        "<init>",
        "(Lio/getstream/chat/android/client/audio/AudioPlayer;Ls23/g;Lkotlin/jvm/functions/Function1;Lbc3/c0;)V",
        "Ll83/a0;",
        "startRecording",
        "(Lq83/d;)Ljava/lang/Object;",
        "Ll83/k;",
        "",
        "offset",
        "holdRecording",
        "(Ll83/k;)V",
        "lockRecording",
        "()V",
        "cancelRecording",
        "toggleRecordingPlayback",
        "stopRecording",
        "progress",
        "seekRecordingTo",
        "(F)V",
        "pauseRecording",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/Attachment;",
        "completeRecordingSync",
        "completeRecording",
        "onCleared",
        "setupMediaRecorder",
        "",
        "maxAmplitude",
        "saveSamples",
        "(I)V",
        "processWave",
        "Lio/getstream/chat/android/client/audio/AudioState;",
        "playbackState",
        "onAudioStateChanged",
        "(Lio/getstream/chat/android/client/audio/AudioState;)V",
        "Lio/getstream/chat/android/client/audio/ProgressData;",
        "progressState",
        "onAudioPlayingProgress",
        "(Lio/getstream/chat/android/client/audio/ProgressData;)V",
        "clearData",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;",
        "state",
        "setState",
        "(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V",
        "",
        "normalize",
        "(Ljava/util/List;)Ljava/util/List;",
        "amplitude",
        "(I)F",
        "targetSamples",
        "downsampleMax",
        "(Ljava/util/List;I)Ljava/util/List;",
        "",
        "([I)I",
        "Lio/getstream/chat/android/client/audio/AudioPlayer;",
        "Ls23/g;",
        "Lkotlin/jvm/functions/Function1;",
        "Lbc3/c0;",
        "Lb23/k;",
        "logger",
        "Lb23/k;",
        "Lec3/p1;",
        "recordingState",
        "Lec3/p1;",
        "getRecordingState",
        "()Lec3/p1;",
        "drawPollingInterval",
        "I",
        "realPollingInterval",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "samples",
        "Ljava/util/ArrayList;",
        "samplesTarget",
        "samplesLimit",
        "samplesBuffer",
        "samplesBufferLimit",
        "waveform",
        "waveformBuffer",
        "[I",
        "waveformBufferCount",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "pendingCancel",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "pendingLock",
        "Companion",
        "stream-chat-android-ui-common_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8

.field public static final Companion:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$Companion;

.field private static final MaxAmplitude:F = 32767.0f

.field private static final NoiseFloor:F = 50.0f


# instance fields
.field private final audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

.field private final drawPollingInterval:I

.field private final fileToUri:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final logger:Lb23/k;

.field private final mediaRecorder:Ls23/g;

.field private final pendingCancel:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final pendingLock:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final realPollingInterval:I

.field private final recordingState:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final samples:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final samplesBuffer:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private samplesBufferLimit:I

.field private final samplesLimit:I

.field private final samplesTarget:I

.field private final scope:Lbc3/c0;

.field private final waveform:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private final waveformBuffer:[I

.field private waveformBufferCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->Companion:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$Companion;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/audio/AudioPlayer;Ls23/g;Lkotlin/jvm/functions/Function1;Lbc3/c0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/audio/AudioPlayer;",
            "Ls23/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Lbc3/c0;",
            ")V"
        }
    .end annotation

    const-string v0, "audioPlayer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mediaRecorder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileToUri"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->mediaRecorder:Ls23/g;

    iput-object p3, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->fileToUri:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->scope:Lbc3/c0;

    new-instance p1, Lb23/k;

    sget-object p2, Lb23/i;->c:Lb23/j;

    sget-object p3, Lb23/i;->d:Lb23/e;

    const-string p4, "Chat:RecordController"

    invoke-direct {p1, p4, p2, p3}, Lb23/k;-><init>(Ljava/lang/String;Lb23/j;Lb23/e;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    sget-object p1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->recordingState:Lec3/p1;

    const/16 p1, 0x64

    iput p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->drawPollingInterval:I

    const/16 p2, 0xa

    iput p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->realPollingInterval:I

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samples:Ljava/util/ArrayList;

    iput p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samplesTarget:I

    const/16 p1, 0x3e8

    iput p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samplesLimit:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samplesBuffer:Ljava/util/ArrayList;

    const/4 p1, 0x1

    iput p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samplesBufferLimit:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->waveform:Ljava/util/ArrayList;

    new-array p1, p2, [I

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->waveformBuffer:[I

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->pendingCancel:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->pendingLock:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setupMediaRecorder()V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setupMediaRecorder$lambda$1(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;)V

    return-void
.end method

.method public static final synthetic access$getLogger$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;)Lb23/k;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    return-object p0
.end method

.method public static final synthetic access$getMediaRecorder$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;)Ls23/g;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->mediaRecorder:Ls23/g;

    return-object p0
.end method

.method public static final synthetic access$getRealPollingInterval$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;)I
    .locals 0

    iget p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->realPollingInterval:I

    return p0
.end method

.method public static final synthetic access$onAudioPlayingProgress(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Lio/getstream/chat/android/client/audio/ProgressData;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->onAudioPlayingProgress(Lio/getstream/chat/android/client/audio/ProgressData;)V

    return-void
.end method

.method public static final synthetic access$onAudioStateChanged(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Lio/getstream/chat/android/client/audio/AudioState;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->onAudioStateChanged(Lio/getstream/chat/android/client/audio/AudioState;)V

    return-void
.end method

.method public static final synthetic access$processWave(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;I)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->processWave(I)V

    return-void
.end method

.method public static final synthetic access$saveSamples(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;I)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->saveSamples(I)V

    return-void
.end method

.method public static final synthetic access$setState(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setState(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V

    return-void
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setupMediaRecorder$lambda$3(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;)V

    return-void
.end method

.method public static synthetic c(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;J)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setupMediaRecorder$lambda$10(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;J)V

    return-void
.end method

.method private final clearData()V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[clearData] no args"

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->waveform:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->waveformBuffer:[I

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lm83/n;->o0([II)V

    iput v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->waveformBufferCount:I

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samples:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samplesBuffer:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x1

    iput v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samplesBufferLimit:I

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->pendingCancel:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->pendingLock:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sget-object v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setState(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V

    return-void
.end method

.method public static synthetic d(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Ls23/g;II)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setupMediaRecorder$lambda$7(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Ls23/g;II)V

    return-void
.end method

.method private final downsampleMax([I)I
    .locals 4

    .line 1
    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    array-length v0, p1

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    .line 3
    aget v0, p1, v0

    .line 4
    array-length v1, p1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    if-gt v2, v1, :cond_1

    .line 5
    :goto_0
    aget v3, p1, v2

    if-ge v0, v3, :cond_0

    move v0, v3

    :cond_0
    if-eq v2, v1, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v0

    .line 6
    :cond_2
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    throw p1
.end method

.method private final downsampleMax(Ljava/util/List;I)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;I)",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 7
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    .line 8
    div-int/2addr v0, p2

    .line 9
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, p2, :cond_1

    move v4, v2

    move v5, v4

    :goto_1
    if-ge v4, v0, :cond_0

    mul-int v6, v3, v0

    add-int/2addr v6, v4

    .line 10
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    .line 11
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 12
    :cond_0
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public static synthetic e(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;I)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setupMediaRecorder$lambda$11(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;I)V

    return-void
.end method

.method public static synthetic f(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Ls23/g;II)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setupMediaRecorder$lambda$9(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Ls23/g;II)V

    return-void
.end method

.method public static synthetic g(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Ls23/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setupMediaRecorder$lambda$5(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Ls23/e;)V

    return-void
.end method

.method public static synthetic holdRecording$default(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Ll83/k;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->holdRecording(Ll83/k;)V

    return-void
.end method

.method private final normalize(I)F
    .locals 4

    const/4 v0, 0x0

    if-gtz p1, :cond_0

    return v0

    :cond_0
    const/16 v1, 0x14

    int-to-float v1, v1

    int-to-float p1, p1

    .line 7
    sget v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->MaxAmplitude:F

    div-float/2addr p1, v2

    float-to-double v2, p1

    invoke-static {v2, v3}, Ljava/lang/Math;->log10(D)D

    move-result-wide v2

    double-to-float p1, v2

    mul-float/2addr v1, p1

    const/high16 p1, -0x3db80000    # -50.0f

    invoke-static {v1, p1, v0}, Le93/b;->m(FFF)F

    move-result p1

    const/high16 v0, 0x42480000    # 50.0f

    add-float/2addr p1, v0

    div-float/2addr p1, v0

    return p1
.end method

.method private final normalize(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 1
    check-cast p1, Ljava/lang/Iterable;

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 4
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 5
    invoke-direct {p0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->normalize(I)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    .line 6
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private final onAudioPlayingProgress(Lio/getstream/chat/android/client/audio/ProgressData;)V
    .locals 11

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->recordingState:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    instance-of v1, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    if-eqz v1, :cond_2

    move-object v2, v0

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/audio/ProgressData;->getProgress()F

    move-result v7

    invoke-virtual {p1}, Lio/getstream/chat/android/client/audio/ProgressData;->getDuration()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_1
    move v3, p1

    goto :goto_2

    :cond_1
    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->getDurationInMs()I

    move-result p1

    goto :goto_1

    :goto_2
    const/16 v9, 0x26

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;ILjava/util/List;Lio/getstream/chat/android/models/Attachment;ZFIILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setState(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V

    :cond_2
    return-void
.end method

.method private final onAudioStateChanged(Lio/getstream/chat/android/client/audio/AudioState;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->recordingState:Lec3/p1;

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    instance-of v3, v2, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    const/4 v4, 0x0

    if-nez v3, :cond_1

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v3, v1, Lb23/k;->c:Lb23/e;

    iget-object v5, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->y:Lb23/g;

    invoke-interface {v3, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v3, "[onAudioStateChanged] rejected (state is not Overview): "

    invoke-static {v3, v2}, Lhc3/i;->d(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v6, v5, v2, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void

    :cond_1
    iget-object v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v5, v3, Lb23/k;->c:Lb23/e;

    iget-object v6, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->y:Lb23/g;

    invoke-interface {v5, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v8, "[onAudioStateChanged] playbackState: "

    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v7, v6, v5, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    move-object v8, v2

    check-cast v8, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    sget-object v2, Lio/getstream/chat/android/client/audio/AudioState;->PLAYING:Lio/getstream/chat/android/client/audio/AudioState;

    const/4 v3, 0x1

    if-ne v1, v2, :cond_3

    move v12, v3

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    move v12, v2

    :goto_0
    sget-object v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    if-eq v1, v3, :cond_4

    const/4 v2, 0x2

    if-eq v1, v2, :cond_4

    const/4 v1, 0x0

    :goto_1
    move v13, v1

    goto :goto_2

    :cond_4
    invoke-virtual {v8}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->getPlayingProgress()F

    move-result v1

    goto :goto_1

    :goto_2
    const/16 v15, 0x27

    const/16 v16, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;ILjava/util/List;Lio/getstream/chat/android/models/Attachment;ZFIILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setState(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V

    return-void
.end method

.method private final processWave(I)V
    .locals 9

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->waveformBuffer:[I

    iget v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->waveformBufferCount:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->waveformBufferCount:I

    aput p1, v0, v1

    array-length p1, v0

    if-ge v2, p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->downsampleMax([I)I

    move-result p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->normalize(I)F

    move-result p1

    const/4 v0, 0x0

    iput v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->waveformBufferCount:I

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->waveform:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->recordingState:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    instance-of v2, v1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    const/4 v6, 0x0

    if-eqz v3, :cond_1

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->waveform:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "[processWave] waveform.size("

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p1, "): "

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, v5, v4, p1, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;

    new-instance p1, Ljava/util/ArrayList;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->waveform:Ljava/util/ArrayList;

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v2, 0x1

    invoke-static {v1, v0, p1, v2, v6}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingStateKt;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;ILjava/util/List;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setState(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private final saveSamples(I)V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samplesBuffer:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samplesBuffer:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    iget v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samplesBufferLimit:I

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samplesBuffer:Ljava/util/ArrayList;

    invoke-static {p1}, Lm83/s;->W0(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samplesBuffer:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samples:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samples:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    iget v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samplesLimit:I

    if-le p1, v0, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samples:Ljava/util/ArrayList;

    iget v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samplesTarget:I

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->downsampleMax(Ljava/util/List;I)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samples:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samples:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samplesBufferLimit:I

    iget v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samplesLimit:I

    iget v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samplesTarget:I

    div-int/2addr v0, v1

    mul-int/2addr v0, p1

    iput v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samplesBufferLimit:I

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->x:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    iget v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samplesBufferLimit:I

    const-string v3, "[saveSamples] reached samples limit; samplesBufferLimit: "

    invoke-static {v0, v3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {p1, v2, v1, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private final setState(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->recordingState:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void
.end method

.method private final setupMediaRecorder()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->mediaRecorder:Ls23/g;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/a;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;)V

    check-cast v0, Ls23/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v1, v0, Ls23/d;->l:Lio/getstream/chat/android/ui/common/feature/messages/composer/a;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->mediaRecorder:Ls23/g;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/a;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;)V

    check-cast v0, Ls23/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v1, v0, Ls23/d;->m:Lio/getstream/chat/android/ui/common/feature/messages/composer/a;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->mediaRecorder:Ls23/g;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/a;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;)V

    check-cast v0, Ls23/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v1, v0, Ls23/d;->o:Lio/getstream/chat/android/ui/common/feature/messages/composer/a;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->mediaRecorder:Ls23/g;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/a;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;)V

    check-cast v0, Ls23/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v0, Ls23/d;->h:Landroid/media/MediaRecorder;

    if-eqz v2, :cond_0

    new-instance v3, Ls23/a;

    invoke-direct {v3, v1, v0}, Ls23/a;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/a;Ls23/d;)V

    invoke-virtual {v2, v3}, Landroid/media/MediaRecorder;->setOnErrorListener(Landroid/media/MediaRecorder$OnErrorListener;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->mediaRecorder:Ls23/g;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/a;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;)V

    check-cast v0, Ls23/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v0, Ls23/d;->h:Landroid/media/MediaRecorder;

    if-eqz v2, :cond_1

    new-instance v3, Ls23/b;

    invoke-direct {v3, v1, v0}, Ls23/b;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/a;Ls23/d;)V

    invoke-virtual {v2, v3}, Landroid/media/MediaRecorder;->setOnInfoListener(Landroid/media/MediaRecorder$OnInfoListener;)V

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->mediaRecorder:Ls23/g;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/a;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;)V

    check-cast v0, Ls23/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v1, v0, Ls23/d;->p:Lio/getstream/chat/android/ui/common/feature/messages/composer/a;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->mediaRecorder:Ls23/g;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/a;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;)V

    check-cast v0, Ls23/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v1, v0, Ls23/d;->n:Lio/getstream/chat/android/ui/common/feature/messages/composer/a;

    return-void
.end method

.method private static final setupMediaRecorder$lambda$1(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;)V
    .locals 4

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v0, p0, Lb23/k;->c:Lb23/e;

    sget-object v1, Lb23/g;->z:Lb23/g;

    iget-object v2, p0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    const-string v0, "[onRecorderStarted] no args"

    const/4 v3, 0x0

    invoke-interface {p0, v1, v2, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method private static final setupMediaRecorder$lambda$10(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;J)V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->scope:Lbc3/c0;

    sget-object v1, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v1}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getMain()Lbc3/z;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$setupMediaRecorder$6$1;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, p2, v3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$setupMediaRecorder$6$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;JLq83/d;)V

    const/4 p0, 0x2

    invoke-static {v0, v1, v3, v2, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private static final setupMediaRecorder$lambda$11(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;I)V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->scope:Lbc3/c0;

    sget-object v1, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v1}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getMain()Lbc3/z;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$setupMediaRecorder$7$1;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$setupMediaRecorder$7$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;ILq83/d;)V

    const/4 p0, 0x2

    invoke-static {v0, v1, v3, v2, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private static final setupMediaRecorder$lambda$3(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;)V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->recordingState:Lec3/p1;

    check-cast p0, Lec3/h2;

    invoke-virtual {p0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p0

    const-string v1, "[onRecorderStopped] recordingState: "

    invoke-static {p0, v1}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    invoke-interface {v0, v2, v3, p0, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method private static final setupMediaRecorder$lambda$5(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Ls23/e;)V
    .locals 5

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->recordingState:Lec3/p1;

    check-cast p0, Lec3/h2;

    invoke-virtual {p0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[onRecorderStateChanged] state: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "; recordingState: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    invoke-interface {v0, v2, v3, p0, p1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method private static final setupMediaRecorder$lambda$7(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Ls23/g;II)V
    .locals 3

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object p1, p0, Lb23/k;->c:Lb23/e;

    sget-object v0, Lb23/g;->F:Lb23/g;

    iget-object v1, p0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    const-string p1, "[onRecorderError] what: "

    const-string v2, ", extra: "

    invoke-static {p2, p3, p1, v2}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-interface {p0, v0, v1, p1, p2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method private static final setupMediaRecorder$lambda$9(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Ls23/g;II)V
    .locals 3

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object p1, p0, Lb23/k;->c:Lb23/e;

    sget-object v0, Lb23/g;->z:Lb23/g;

    iget-object v1, p0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    const-string p1, "[onRecorderInfo] what: "

    const-string v2, ", extra: "

    invoke-static {p2, p3, p1, v2}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-interface {p0, v0, v1, p1, p2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final cancelRecording()V
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->recordingState:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    instance-of v1, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->z:Lb23/g;

    invoke-interface {v1, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[cancelRecording] state is Idle, setting pending cancel"

    invoke-interface {v0, v4, v3, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->pendingCancel:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :cond_1
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v3, v1, Lb23/k;->c:Lb23/e;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->z:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v3, "[cancelRecording] state: "

    invoke-static {v3, v0}, Lhc3/i;->d(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v5, v4, v3, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->mediaRecorder:Ls23/g;

    check-cast v1, Ls23/d;

    invoke-virtual {v1}, Ls23/d;->d()V

    instance-of v1, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    if-eqz v1, :cond_3

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->isPlaying()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->getPlayingId()I

    move-result v0

    invoke-interface {v1, v0}, Lio/getstream/chat/android/client/audio/AudioPlayer;->resetAudio(I)V

    :cond_3
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->clearData()V

    sget-object v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setState(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V

    return-void
.end method

.method public final completeRecording(Lq83/d;)Ljava/lang/Object;
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$1;

    iget v3, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$1;->label:I

    const-string v5, "waveform_data"

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    const/4 v10, 0x0

    if-eqz v4, :cond_4

    if-eq v4, v8, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v3, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$1;->L$4:Ljava/lang/Object;

    check-cast v3, Ls23/f;

    iget-object v3, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$1;->L$3:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v3, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v3, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ln23/h;

    iget-object v2, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v9

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v4, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_3
    iget-object v3, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;

    iget-object v2, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v9

    :cond_4
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->recordingState:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v11, v1, Lb23/k;->c:Lb23/e;

    iget-object v12, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v13, Lb23/g;->E:Lb23/g;

    invoke-interface {v11, v13, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_5

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v11, "[completeRecording] state: "

    invoke-static {v11, v4}, Lhc3/i;->d(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v1, v13, v12, v11, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    instance-of v1, v4, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;

    if-eqz v1, :cond_6

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v13, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_d

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[completeRecording] rejected (state is Idle)"

    invoke-interface {v1, v13, v3, v2, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v9

    :cond_6
    instance-of v1, v4, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    if-eqz v1, :cond_8

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v6, v1, Lb23/k;->c:Lb23/e;

    iget-object v7, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v11, Lb23/g;->y:Lb23/g;

    invoke-interface {v6, v11, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v6, "[completeRecording] completing from Overview state"

    invoke-interface {v1, v11, v7, v6, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->getPlayingId()I

    move-result v6

    invoke-interface {v1, v6}, Lio/getstream/chat/android/client/audio/AudioPlayer;->resetAudio(I)V

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->clearData()V

    new-instance v1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->getAttachment()Lio/getstream/chat/android/models/Attachment;

    move-result-object v11

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->getAttachment()Lio/getstream/chat/android/models/Attachment;

    move-result-object v6

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Attachment;->getExtraData()Ljava/util/Map;

    move-result-object v6

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->getWaveform()Ljava/util/List;

    move-result-object v4

    new-instance v7, Ll83/k;

    invoke-direct {v7, v5, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v4

    invoke-static {v6, v4}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v31

    const v32, 0x7ffff

    const/16 v33, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-static/range {v11 .. v33}, Lio/getstream/chat/android/models/Attachment;->copy$default(Lio/getstream/chat/android/models/Attachment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/io/File;Lio/getstream/chat/android/models/Attachment$UploadState;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Attachment;

    move-result-object v4

    invoke-direct {v1, v4}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;-><init>(Lio/getstream/chat/android/models/Attachment;)V

    sget-object v4, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v4}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getMain()Lbc3/z;

    move-result-object v4

    new-instance v5, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$5;

    invoke-direct {v5, v0, v1, v10}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$5;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;Lq83/d;)V

    iput-object v10, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$1;->L$0:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$1;->L$1:Ljava/lang/Object;

    iput v8, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$1;->label:I

    invoke-static {v4, v5, v2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_d

    goto/16 :goto_2

    :cond_8
    sget-object v1, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v1}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object v1

    new-instance v8, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$result$1;

    invoke-direct {v8, v0, v10}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$result$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Lq83/d;)V

    iput-object v4, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$1;->L$0:Ljava/lang/Object;

    iput v7, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$1;->label:I

    invoke-static {v1, v8, v2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_9

    goto/16 :goto_2

    :cond_9
    :goto_1
    check-cast v1, Ln23/h;

    instance-of v7, v1, Ln23/f;

    if-eqz v7, :cond_b

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->F:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_a

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-virtual {v1}, Ln23/h;->a()Ln23/e;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "[completeRecording] failed: "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v5, v4, v1, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_a
    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->clearData()V

    sget-object v1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setState(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V

    return-object v9

    :cond_b
    iget-object v7, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samples:Ljava/util/ArrayList;

    iget v8, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samplesTarget:I

    invoke-direct {v0, v7, v8}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->downsampleMax(Ljava/util/List;I)Ljava/util/List;

    move-result-object v7

    invoke-direct {v0, v7}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->normalize(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->clearData()V

    invoke-virtual {v1}, Ln23/h;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls23/f;

    iget-object v11, v1, Ls23/f;->b:Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v11}, Lio/getstream/chat/android/models/Attachment;->getExtraData()Ljava/util/Map;

    move-result-object v8

    new-instance v12, Ll83/k;

    invoke-direct {v12, v5, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v12}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v5

    invoke-static {v8, v5}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v31

    const v32, 0x7ffff

    const/16 v33, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-static/range {v11 .. v33}, Lio/getstream/chat/android/models/Attachment;->copy$default(Lio/getstream/chat/android/models/Attachment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/io/File;Lio/getstream/chat/android/models/Attachment$UploadState;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Attachment;

    move-result-object v5

    iget v1, v1, Ls23/f;->a:I

    const-string v7, "attachment"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Ls23/f;

    invoke-direct {v7, v1, v5}, Ls23/f;-><init>(ILio/getstream/chat/android/models/Attachment;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v5, v1, Lb23/k;->c:Lb23/e;

    iget-object v8, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v11, Lb23/g;->y:Lb23/g;

    invoke-interface {v5, v11, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_c

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v5, "[completeRecording] complete from state: "

    invoke-static {v5, v4}, Lhc3/i;->d(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v11, v8, v4, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_c
    sget-object v1, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v1}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getMain()Lbc3/z;

    move-result-object v1

    new-instance v4, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$8;

    invoke-direct {v4, v0, v7, v10}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$8;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Ls23/f;Lq83/d;)V

    iput-object v10, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$1;->L$0:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$1;->L$1:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$1;->L$2:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$1;->L$3:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$1;->L$4:Ljava/lang/Object;

    iput v6, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecording$1;->label:I

    invoke-static {v1, v4, v2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_d

    :goto_2
    return-object v3

    :cond_d
    return-object v9
.end method

.method public final completeRecordingSync(Lq83/d;)Ljava/lang/Object;
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecordingSync$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecordingSync$1;

    iget v3, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecordingSync$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecordingSync$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecordingSync$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecordingSync$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecordingSync$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecordingSync$1;->label:I

    const/4 v5, 0x0

    const-string v6, "waveform_data"

    const/4 v7, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v7, :cond_1

    iget-object v2, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecordingSync$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->recordingState:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    iget-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v8, v4, Lb23/k;->c:Lb23/e;

    iget-object v9, v4, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->E:Lb23/g;

    invoke-interface {v8, v10, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    iget-object v4, v4, Lb23/k;->b:Lb23/j;

    const-string v8, "[completeRecordingSync] state: "

    invoke-static {v8, v1}, Lhc3/i;->d(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v4, v10, v9, v8, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    instance-of v4, v1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;

    if-eqz v4, :cond_5

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v10, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[completeRecordingSync] rejected (state is Idle)"

    invoke-interface {v1, v10, v3, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    new-instance v1, Ln23/f;

    new-instance v2, Ln23/a;

    const-string v3, "Recording is in Idle state"

    invoke-direct {v2, v3}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ln23/f;-><init>(Ln23/e;)V

    return-object v1

    :cond_5
    instance-of v4, v1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    if-eqz v4, :cond_7

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->y:Lb23/g;

    invoke-interface {v3, v7, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    const-string v3, "[completeRecordingSync] completing from Overview state"

    invoke-interface {v2, v7, v4, v3, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->clearData()V

    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->getAttachment()Lio/getstream/chat/android/models/Attachment;

    move-result-object v7

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->getAttachment()Lio/getstream/chat/android/models/Attachment;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Attachment;->getExtraData()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->getWaveform()Ljava/util/List;

    move-result-object v1

    new-instance v3, Ll83/k;

    invoke-direct {v3, v6, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v2, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v27

    const v28, 0x7ffff

    const/16 v29, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-static/range {v7 .. v29}, Lio/getstream/chat/android/models/Attachment;->copy$default(Lio/getstream/chat/android/models/Attachment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/io/File;Lio/getstream/chat/android/models/Attachment$UploadState;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Attachment;

    move-result-object v1

    sget-object v2, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;

    invoke-direct {v0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setState(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V

    new-instance v2, Ln23/g;

    invoke-direct {v2, v1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object v2

    :cond_7
    sget-object v4, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v4}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object v4

    new-instance v8, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecordingSync$result$1;

    invoke-direct {v8, v0, v5}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecordingSync$result$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Lq83/d;)V

    iput-object v1, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecordingSync$1;->L$0:Ljava/lang/Object;

    iput v7, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$completeRecordingSync$1;->label:I

    invoke-static {v4, v8, v2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_8

    return-object v3

    :cond_8
    move-object/from16 v30, v2

    move-object v2, v1

    move-object/from16 v1, v30

    :goto_1
    check-cast v1, Ln23/h;

    instance-of v3, v1, Ln23/f;

    if-eqz v3, :cond_a

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->F:Lb23/g;

    invoke-interface {v3, v6, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_9

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    move-object v3, v1

    check-cast v3, Ln23/f;

    iget-object v3, v3, Ln23/f;->a:Ln23/e;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "[completeRecordingSync] failed: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v6, v4, v3, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->clearData()V

    sget-object v2, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;

    invoke-direct {v0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setState(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V

    return-object v1

    :cond_a
    instance-of v3, v1, Ln23/g;

    if-eqz v3, :cond_c

    iget-object v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    iget-object v7, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->y:Lb23/g;

    invoke-interface {v4, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_b

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    const-string v4, "[completeRecordingSync] complete from state: "

    invoke-static {v4, v2}, Lhc3/i;->d(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v8, v7, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_b
    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samples:Ljava/util/ArrayList;

    iget v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samplesTarget:I

    invoke-direct {v0, v2, v3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->downsampleMax(Ljava/util/List;I)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->normalize(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->clearData()V

    check-cast v1, Ln23/g;

    iget-object v1, v1, Ln23/g;->a:Ljava/lang/Object;

    check-cast v1, Ls23/f;

    iget-object v7, v1, Ls23/f;->b:Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v7}, Lio/getstream/chat/android/models/Attachment;->getExtraData()Ljava/util/Map;

    move-result-object v1

    new-instance v3, Ll83/k;

    invoke-direct {v3, v6, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v1, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v27

    const v28, 0x7ffff

    const/16 v29, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-static/range {v7 .. v29}, Lio/getstream/chat/android/models/Attachment;->copy$default(Lio/getstream/chat/android/models/Attachment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/io/File;Lio/getstream/chat/android/models/Attachment$UploadState;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Attachment;

    move-result-object v1

    sget-object v2, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;

    invoke-direct {v0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setState(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V

    new-instance v2, Ln23/g;

    invoke-direct {v2, v1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object v2

    :cond_c
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public final getRecordingState()Lec3/p1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/p1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->recordingState:Lec3/p1;

    return-object v0
.end method

.method public final holdRecording(Ll83/k;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/k;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->recordingState:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    instance-of v1, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v1, p1, Lb23/k;->c:Lb23/e;

    iget-object v3, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v1, "[holdRecording] rejected (state is not Hold): "

    invoke-static {v1, v0}, Lhc3/i;->d(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v4, v3, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    if-nez p1, :cond_2

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->x:Lb23/g;

    invoke-interface {v0, v3, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "[holdRecording] rejected (offset is null)"

    invoke-interface {p1, v3, v1, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v3, v1, Lb23/k;->c:Lb23/e;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    iget-object v3, p1, Ll83/k;->w:Ljava/lang/Object;

    iget-object v6, p1, Ll83/k;->x:Ljava/lang/Object;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "[holdRecording] offset: Offset("

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ":"

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ")"

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v5, v4, v3, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    move-object v6, v0

    check-cast v6, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v9, p1

    invoke-static/range {v6 .. v11}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;ILjava/util/List;Ll83/k;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setState(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V

    return-void
.end method

.method public final lockRecording()V
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->recordingState:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    instance-of v1, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->z:Lb23/g;

    invoke-interface {v1, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[lockRecording] state is Idle, setting pending lock"

    invoke-interface {v0, v4, v3, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->pendingLock:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :cond_1
    instance-of v1, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;

    if-nez v1, :cond_3

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v3, v1, Lb23/k;->c:Lb23/e;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v3, "[lockRecording] rejected (state is not Hold): "

    invoke-static {v3, v0}, Lhc3/i;->d(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v5, v4, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    return-void

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v3, v1, Lb23/k;->c:Lb23/e;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->z:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v3, "[lockRecording] state: "

    invoke-static {v3, v0}, Lhc3/i;->d(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v5, v4, v3, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    new-instance v1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;->getDurationInMs()I

    move-result v2

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;->getWaveform()Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;-><init>(ILjava/util/List;)V

    invoke-direct {p0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setState(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V

    return-void
.end method

.method public final onCleared()V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[onCleared] no args"

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->mediaRecorder:Ls23/g;

    check-cast v0, Ls23/d;

    invoke-virtual {v0}, Ls23/d;->d()V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->recordingState:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    instance-of v1, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->getPlayingId()I

    move-result v0

    invoke-interface {v1, v0}, Lio/getstream/chat/android/client/audio/AudioPlayer;->resetAudio(I)V

    :cond_1
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->clearData()V

    return-void
.end method

.method public final pauseRecording()V
    .locals 11

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->recordingState:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    instance-of v1, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[pauseRecording] rejected (state is not Overview)"

    invoke-interface {v0, v4, v3, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void

    :cond_1
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v3, v1, Lb23/k;->c:Lb23/e;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->z:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v3, "[pauseRecording] state: "

    invoke-static {v3, v0}, Lhc3/i;->d(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v5, v4, v3, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    move-object v2, v0

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->getPlayingId()I

    move-result v0

    invoke-interface {v1, v0}, Lio/getstream/chat/android/client/audio/AudioPlayer;->startSeek(I)V

    const/16 v9, 0x37

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;ILjava/util/List;Lio/getstream/chat/android/models/Attachment;ZFIILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setState(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V

    return-void
.end method

.method public final seekRecordingTo(F)V
    .locals 13

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->recordingState:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    instance-of v1, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v0, v3, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "[seekRecordingTo] rejected (state is not Overview)"

    invoke-interface {p1, v3, v1, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    move-object v4, v0

    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->getAttachment()Lio/getstream/chat/android/models/Attachment;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->getUpload()Ljava/io/File;

    move-result-object v1

    if-nez v1, :cond_2

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v0, v3, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "[seekRecordingTo] rejected (audioFile is null)"

    invoke-interface {p1, v3, v1, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void

    :cond_2
    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->getDurationInMs()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, p1

    float-to-int v1, v1

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v5, v3, Lb23/k;->c:Lb23/e;

    iget-object v6, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->z:Lb23/g;

    invoke-interface {v5, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v8, "[seekRecordingTo] progress: "

    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v8, " ("

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, "ms), state: "

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v7, v6, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->getAttachment()Lio/getstream/chat/android/models/Attachment;

    move-result-object v0

    invoke-static {v0}, Lio/getstream/chat/android/client/audio/AudioHashKt;->getAudioHash(Lio/getstream/chat/android/models/Attachment;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    invoke-interface {v2, v1, v0}, Lio/getstream/chat/android/client/audio/AudioPlayer;->seekTo(II)V

    const/16 v11, 0x2f

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    move v9, p1

    invoke-static/range {v4 .. v12}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;ILjava/util/List;Lio/getstream/chat/android/models/Attachment;ZFIILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setState(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V

    return-void
.end method

.method public final startRecording(Lq83/d;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$1;

    iget v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$1;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$1;->label:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    const/4 v6, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v0, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->recordingState:Lec3/p1;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    instance-of v2, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;

    if-nez v2, :cond_4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[startRecording] rejected (state is not Idle): "

    invoke-static {v1, p1}, Lhc3/i;->d(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v3, v2, p1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    return-object v5

    :cond_4
    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v7, v2, Lb23/k;->c:Lb23/e;

    iget-object v8, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v9, Lb23/g;->z:Lb23/g;

    invoke-interface {v7, v9, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_5

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    const-string v7, "[startRecording] state: "

    invoke-static {v7, p1}, Lhc3/i;->d(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, v9, v8, p1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v7, "audio_recording_"

    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ".aac"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->pendingCancel:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->pendingLock:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sget-object v2, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v2}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object v2

    new-instance v7, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$4;

    invoke-direct {v7, p0, p1, v4}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$4;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Ljava/lang/String;Lq83/d;)V

    iput-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$1;->L$0:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$1;->label:I

    invoke-static {v2, v7, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    :goto_1
    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->pendingCancel:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "[startRecording] applying pending cancel"

    invoke-interface {p1, v2, v1, v0, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->mediaRecorder:Ls23/g;

    check-cast p1, Ls23/d;

    invoke-virtual {p1}, Ls23/d;->d()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->clearData()V

    return-object v5

    :cond_8
    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->pendingLock:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result p1

    if-eqz p1, :cond_a

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "[startRecording] applying pending lock"

    invoke-interface {p1, v2, v1, v0, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    new-instance p1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;

    sget-object v0, Lm83/y;->w:Lm83/y;

    invoke-direct {p1, v6, v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;-><init>(ILjava/util/List;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setState(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V

    return-object v5

    :cond_a
    new-instance v7, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;

    const/4 v11, 0x7

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;-><init>(ILjava/util/List;Ll83/k;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v7}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setState(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V

    return-object v5
.end method

.method public final stopRecording(Lq83/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$stopRecording$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$stopRecording$1;

    iget v3, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$stopRecording$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$stopRecording$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$stopRecording$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$stopRecording$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$stopRecording$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$stopRecording$1;->label:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    if-eqz v4, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v2, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$stopRecording$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->recordingState:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    instance-of v4, v1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;

    if-nez v4, :cond_4

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v6, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    const-string v3, "[stopRecording] rejected (state is not Locked): "

    invoke-static {v3, v1}, Lhc3/i;->d(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v6, v4, v1, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    return-object v7

    :cond_4
    iget-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v8, v4, Lb23/k;->c:Lb23/e;

    iget-object v9, v4, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->z:Lb23/g;

    invoke-interface {v8, v10, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_5

    iget-object v4, v4, Lb23/k;->b:Lb23/j;

    const-string v8, "[stopRecording] no args: "

    invoke-static {v8, v1}, Lhc3/i;->d(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v10, v9, v1, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    sget-object v1, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v1}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object v1

    new-instance v4, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$stopRecording$result$1;

    invoke-direct {v4, v0, v5}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$stopRecording$result$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Lq83/d;)V

    iput-object v5, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$stopRecording$1;->L$0:Ljava/lang/Object;

    iput v6, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$stopRecording$1;->label:I

    invoke-static {v1, v4, v2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_6

    return-object v3

    :cond_6
    :goto_1
    check-cast v1, Ln23/h;

    instance-of v2, v1, Ln23/f;

    if-eqz v2, :cond_8

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->F:Lb23/g;

    invoke-interface {v3, v6, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-virtual {v1}, Ln23/h;->a()Ln23/e;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v8, "[stopRecording] failed: "

    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v6, v4, v1, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->clearData()V

    sget-object v1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setState(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V

    return-object v7

    :cond_8
    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samples:Ljava/util/ArrayList;

    iget v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->samplesTarget:I

    invoke-direct {v0, v2, v3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->downsampleMax(Ljava/util/List;I)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->normalize(Ljava/util/List;)Ljava/util/List;

    move-result-object v10

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->clearData()V

    invoke-virtual {v1}, Ln23/h;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls23/f;

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->x:Lb23/g;

    invoke-interface {v3, v6, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_9

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v8, "[stopRecording] recorded: "

    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v6, v4, v3, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    new-instance v8, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    iget v9, v1, Ls23/f;->a:I

    iget-object v11, v1, Ls23/f;->b:Lio/getstream/chat/android/models/Attachment;

    const/16 v15, 0x38

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v8 .. v16}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;-><init>(ILjava/util/List;Lio/getstream/chat/android/models/Attachment;ZFIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v8}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setState(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V

    return-object v7
.end method

.method public final toggleRecordingPlayback()V
    .locals 15

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->recordingState:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    instance-of v1, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v3, v1, Lb23/k;->c:Lb23/e;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v3, "[toggleRecordingPlayback] rejected (state is not Locked): "

    invoke-static {v3, v0}, Lhc3/i;->d(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v5, v4, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v3, v1, Lb23/k;->c:Lb23/e;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->z:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    invoke-interface {v3}, Lio/getstream/chat/android/client/audio/AudioPlayer;->getCurrentState()Lio/getstream/chat/android/client/audio/AudioState;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "[toggleRecordingPlayback] state: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, ", playerState: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v5, v4, v3, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    move-object v6, v0

    check-cast v6, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    invoke-virtual {v6}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->getAttachment()Lio/getstream/chat/android/models/Attachment;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Attachment;->getUpload()Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v1, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[toggleRecordingPlayback] rejected (audioFile is null)"

    invoke-interface {v0, v4, v3, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    return-void

    :cond_3
    invoke-virtual {v6}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->getHasPlayingId()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {v6}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->getPlayingId()I

    move-result v1

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    invoke-interface {v3}, Lio/getstream/chat/android/client/audio/AudioPlayer;->getCurrentPlayingId()I

    move-result v3

    if-ne v1, v3, :cond_7

    invoke-virtual {v6}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[toggleRecordingPlayback] pause playback"

    invoke-interface {v0, v4, v3, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    invoke-interface {v0}, Lio/getstream/chat/android/client/audio/AudioPlayer;->pause()V

    const/16 v13, 0x37

    const/4 v14, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v6 .. v14}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;ILjava/util/List;Lio/getstream/chat/android/models/Attachment;ZFIILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setState(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V

    return-void

    :cond_5
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[toggleRecordingPlayback] resume playback"

    invoke-interface {v0, v4, v3, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    invoke-virtual {v6}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->getPlayingId()I

    move-result v1

    invoke-interface {v0, v1}, Lio/getstream/chat/android/client/audio/AudioPlayer;->resume(I)V

    const/16 v13, 0x37

    const/4 v14, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v6 .. v14}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;ILjava/util/List;Lio/getstream/chat/android/models/Attachment;ZFIILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setState(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V

    return-void

    :cond_7
    invoke-virtual {v6}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->getAttachment()Lio/getstream/chat/android/models/Attachment;

    move-result-object v1

    invoke-static {v1}, Lio/getstream/chat/android/client/audio/AudioHashKt;->getAudioHash(Lio/getstream/chat/android/models/Attachment;)I

    move-result v12

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->logger:Lb23/k;

    iget-object v3, v1, Lb23/k;->c:Lb23/e;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->y:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_8

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v3, "[toggleRecordingPlayback] start playback: "

    invoke-static {v12, v3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v5, v4, v3, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    new-instance v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$toggleRecordingPlayback$6;

    invoke-direct {v2, p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$toggleRecordingPlayback$6;-><init>(Ljava/lang/Object;)V

    invoke-interface {v1, v12, v2}, Lio/getstream/chat/android/client/audio/AudioPlayer;->registerOnProgressStateChange(ILkotlin/jvm/functions/Function1;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    new-instance v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$toggleRecordingPlayback$7;

    invoke-direct {v2, p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$toggleRecordingPlayback$7;-><init>(Ljava/lang/Object;)V

    invoke-interface {v1, v12, v2}, Lio/getstream/chat/android/client/audio/AudioPlayer;->registerOnAudioStateChange(ILkotlin/jvm/functions/Function1;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->audioPlayer:Lio/getstream/chat/android/client/audio/AudioPlayer;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->fileToUri:Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v1, v0, v12}, Lio/getstream/chat/android/client/audio/AudioPlayer;->play(Ljava/lang/String;I)V

    const/16 v13, 0x17

    const/4 v14, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static/range {v6 .. v14}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;ILjava/util/List;Lio/getstream/chat/android/models/Attachment;ZFIILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setState(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V

    return-void
.end method
