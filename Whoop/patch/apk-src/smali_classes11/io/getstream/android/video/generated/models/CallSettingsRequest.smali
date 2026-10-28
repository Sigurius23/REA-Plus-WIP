.class public final Lio/getstream/android/video/generated/models/CallSettingsRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u00083\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u00c5\u0001\u0012\n\u0008\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\u0008\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\u0008\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\u0008\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\u0008\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\u0008\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\u0008\u0003\u0010 \u001a\u0004\u0018\u00010!\u00a2\u0006\u0002\u0010\"J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u001fH\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010!H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u00c9\u0001\u0010S\u001a\u00020\u00002\n\u0008\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\r2\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\u0008\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\u0008\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\u0008\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\u0008\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\u0008\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\u0008\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\u0008\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\u0008\u0003\u0010 \u001a\u0004\u0018\u00010!H\u00c6\u0001J\u0013\u0010T\u001a\u00020U2\u0008\u0010V\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010W\u001a\u00020XH\u00d6\u0001J\t\u0010Y\u001a\u00020ZH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010*R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010.R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u00100R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u00102R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u00104R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u00106R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u00108R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010:R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010<R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u0010>R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u0010@R\u0013\u0010 \u001a\u0004\u0018\u00010!\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u0010B\u00a8\u0006["
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/CallSettingsRequest;",
        "",
        "audio",
        "Lio/getstream/android/video/generated/models/AudioSettingsRequest;",
        "backstage",
        "Lio/getstream/android/video/generated/models/BackstageSettingsRequest;",
        "broadcasting",
        "Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;",
        "frameRecording",
        "Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;",
        "geofencing",
        "Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;",
        "individualRecording",
        "Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;",
        "ingress",
        "Lio/getstream/android/video/generated/models/IngressSettingsRequest;",
        "limits",
        "Lio/getstream/android/video/generated/models/LimitsSettingsRequest;",
        "rawRecording",
        "Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;",
        "recording",
        "Lio/getstream/android/video/generated/models/RecordSettingsRequest;",
        "ring",
        "Lio/getstream/android/video/generated/models/RingSettingsRequest;",
        "screensharing",
        "Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;",
        "session",
        "Lio/getstream/android/video/generated/models/SessionSettingsRequest;",
        "thumbnails",
        "Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;",
        "transcription",
        "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;",
        "video",
        "Lio/getstream/android/video/generated/models/VideoSettingsRequest;",
        "(Lio/getstream/android/video/generated/models/AudioSettingsRequest;Lio/getstream/android/video/generated/models/BackstageSettingsRequest;Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;Lio/getstream/android/video/generated/models/IngressSettingsRequest;Lio/getstream/android/video/generated/models/LimitsSettingsRequest;Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;Lio/getstream/android/video/generated/models/RecordSettingsRequest;Lio/getstream/android/video/generated/models/RingSettingsRequest;Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;Lio/getstream/android/video/generated/models/SessionSettingsRequest;Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;Lio/getstream/android/video/generated/models/VideoSettingsRequest;)V",
        "getAudio",
        "()Lio/getstream/android/video/generated/models/AudioSettingsRequest;",
        "getBackstage",
        "()Lio/getstream/android/video/generated/models/BackstageSettingsRequest;",
        "getBroadcasting",
        "()Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;",
        "getFrameRecording",
        "()Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;",
        "getGeofencing",
        "()Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;",
        "getIndividualRecording",
        "()Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;",
        "getIngress",
        "()Lio/getstream/android/video/generated/models/IngressSettingsRequest;",
        "getLimits",
        "()Lio/getstream/android/video/generated/models/LimitsSettingsRequest;",
        "getRawRecording",
        "()Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;",
        "getRecording",
        "()Lio/getstream/android/video/generated/models/RecordSettingsRequest;",
        "getRing",
        "()Lio/getstream/android/video/generated/models/RingSettingsRequest;",
        "getScreensharing",
        "()Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;",
        "getSession",
        "()Lio/getstream/android/video/generated/models/SessionSettingsRequest;",
        "getThumbnails",
        "()Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;",
        "getTranscription",
        "()Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;",
        "getVideo",
        "()Lio/getstream/android/video/generated/models/VideoSettingsRequest;",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final audio:Lio/getstream/android/video/generated/models/AudioSettingsRequest;

.field private final backstage:Lio/getstream/android/video/generated/models/BackstageSettingsRequest;

.field private final broadcasting:Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;

.field private final frameRecording:Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;

.field private final geofencing:Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;

.field private final individualRecording:Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;

.field private final ingress:Lio/getstream/android/video/generated/models/IngressSettingsRequest;

.field private final limits:Lio/getstream/android/video/generated/models/LimitsSettingsRequest;

.field private final rawRecording:Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;

.field private final recording:Lio/getstream/android/video/generated/models/RecordSettingsRequest;

.field private final ring:Lio/getstream/android/video/generated/models/RingSettingsRequest;

.field private final screensharing:Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;

.field private final session:Lio/getstream/android/video/generated/models/SessionSettingsRequest;

.field private final thumbnails:Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;

.field private final transcription:Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;

.field private final video:Lio/getstream/android/video/generated/models/VideoSettingsRequest;


# direct methods
.method public constructor <init>()V
    .locals 19

    .line 1
    const v17, 0xffff

    const/16 v18, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v18}, Lio/getstream/android/video/generated/models/CallSettingsRequest;-><init>(Lio/getstream/android/video/generated/models/AudioSettingsRequest;Lio/getstream/android/video/generated/models/BackstageSettingsRequest;Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;Lio/getstream/android/video/generated/models/IngressSettingsRequest;Lio/getstream/android/video/generated/models/LimitsSettingsRequest;Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;Lio/getstream/android/video/generated/models/RecordSettingsRequest;Lio/getstream/android/video/generated/models/RingSettingsRequest;Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;Lio/getstream/android/video/generated/models/SessionSettingsRequest;Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;Lio/getstream/android/video/generated/models/VideoSettingsRequest;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/android/video/generated/models/AudioSettingsRequest;Lio/getstream/android/video/generated/models/BackstageSettingsRequest;Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;Lio/getstream/android/video/generated/models/IngressSettingsRequest;Lio/getstream/android/video/generated/models/LimitsSettingsRequest;Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;Lio/getstream/android/video/generated/models/RecordSettingsRequest;Lio/getstream/android/video/generated/models/RingSettingsRequest;Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;Lio/getstream/android/video/generated/models/SessionSettingsRequest;Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;Lio/getstream/android/video/generated/models/VideoSettingsRequest;)V
    .locals 0
    .param p1    # Lio/getstream/android/video/generated/models/AudioSettingsRequest;
        .annotation runtime Lqx/q;
            name = "audio"
        .end annotation
    .end param
    .param p2    # Lio/getstream/android/video/generated/models/BackstageSettingsRequest;
        .annotation runtime Lqx/q;
            name = "backstage"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;
        .annotation runtime Lqx/q;
            name = "broadcasting"
        .end annotation
    .end param
    .param p4    # Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;
        .annotation runtime Lqx/q;
            name = "frame_recording"
        .end annotation
    .end param
    .param p5    # Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;
        .annotation runtime Lqx/q;
            name = "geofencing"
        .end annotation
    .end param
    .param p6    # Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;
        .annotation runtime Lqx/q;
            name = "individual_recording"
        .end annotation
    .end param
    .param p7    # Lio/getstream/android/video/generated/models/IngressSettingsRequest;
        .annotation runtime Lqx/q;
            name = "ingress"
        .end annotation
    .end param
    .param p8    # Lio/getstream/android/video/generated/models/LimitsSettingsRequest;
        .annotation runtime Lqx/q;
            name = "limits"
        .end annotation
    .end param
    .param p9    # Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;
        .annotation runtime Lqx/q;
            name = "raw_recording"
        .end annotation
    .end param
    .param p10    # Lio/getstream/android/video/generated/models/RecordSettingsRequest;
        .annotation runtime Lqx/q;
            name = "recording"
        .end annotation
    .end param
    .param p11    # Lio/getstream/android/video/generated/models/RingSettingsRequest;
        .annotation runtime Lqx/q;
            name = "ring"
        .end annotation
    .end param
    .param p12    # Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;
        .annotation runtime Lqx/q;
            name = "screensharing"
        .end annotation
    .end param
    .param p13    # Lio/getstream/android/video/generated/models/SessionSettingsRequest;
        .annotation runtime Lqx/q;
            name = "session"
        .end annotation
    .end param
    .param p14    # Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;
        .annotation runtime Lqx/q;
            name = "thumbnails"
        .end annotation
    .end param
    .param p15    # Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;
        .annotation runtime Lqx/q;
            name = "transcription"
        .end annotation
    .end param
    .param p16    # Lio/getstream/android/video/generated/models/VideoSettingsRequest;
        .annotation runtime Lqx/q;
            name = "video"
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->audio:Lio/getstream/android/video/generated/models/AudioSettingsRequest;

    .line 4
    iput-object p2, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->backstage:Lio/getstream/android/video/generated/models/BackstageSettingsRequest;

    .line 5
    iput-object p3, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->broadcasting:Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;

    .line 6
    iput-object p4, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->frameRecording:Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;

    .line 7
    iput-object p5, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->geofencing:Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;

    .line 8
    iput-object p6, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->individualRecording:Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;

    .line 9
    iput-object p7, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->ingress:Lio/getstream/android/video/generated/models/IngressSettingsRequest;

    .line 10
    iput-object p8, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->limits:Lio/getstream/android/video/generated/models/LimitsSettingsRequest;

    .line 11
    iput-object p9, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->rawRecording:Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;

    .line 12
    iput-object p10, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->recording:Lio/getstream/android/video/generated/models/RecordSettingsRequest;

    .line 13
    iput-object p11, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->ring:Lio/getstream/android/video/generated/models/RingSettingsRequest;

    .line 14
    iput-object p12, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->screensharing:Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;

    .line 15
    iput-object p13, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->session:Lio/getstream/android/video/generated/models/SessionSettingsRequest;

    .line 16
    iput-object p14, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->thumbnails:Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;

    .line 17
    iput-object p15, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->transcription:Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->video:Lio/getstream/android/video/generated/models/VideoSettingsRequest;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/android/video/generated/models/AudioSettingsRequest;Lio/getstream/android/video/generated/models/BackstageSettingsRequest;Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;Lio/getstream/android/video/generated/models/IngressSettingsRequest;Lio/getstream/android/video/generated/models/LimitsSettingsRequest;Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;Lio/getstream/android/video/generated/models/RecordSettingsRequest;Lio/getstream/android/video/generated/models/RingSettingsRequest;Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;Lio/getstream/android/video/generated/models/SessionSettingsRequest;Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;Lio/getstream/android/video/generated/models/VideoSettingsRequest;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 17

    move/from16 v0, p17

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    const/4 v4, 0x0

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    const/4 v5, 0x0

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    const/4 v6, 0x0

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    const/4 v7, 0x0

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    const/4 v8, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    const/4 v9, 0x0

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    const/4 v10, 0x0

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    const/4 v11, 0x0

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    const/4 v12, 0x0

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v0, 0x800

    if-eqz v13, :cond_b

    const/4 v13, 0x0

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_c

    const/4 v14, 0x0

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v0, 0x2000

    if-eqz v15, :cond_d

    const/4 v15, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    and-int/lit16 v2, v0, 0x4000

    if-eqz v2, :cond_e

    const/4 v2, 0x0

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v0, v0, v16

    if-eqz v0, :cond_f

    const/16 p17, 0x0

    :goto_f
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    goto :goto_10

    :cond_f
    move-object/from16 p17, p16

    goto :goto_f

    .line 19
    :goto_10
    invoke-direct/range {p1 .. p17}, Lio/getstream/android/video/generated/models/CallSettingsRequest;-><init>(Lio/getstream/android/video/generated/models/AudioSettingsRequest;Lio/getstream/android/video/generated/models/BackstageSettingsRequest;Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;Lio/getstream/android/video/generated/models/IngressSettingsRequest;Lio/getstream/android/video/generated/models/LimitsSettingsRequest;Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;Lio/getstream/android/video/generated/models/RecordSettingsRequest;Lio/getstream/android/video/generated/models/RingSettingsRequest;Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;Lio/getstream/android/video/generated/models/SessionSettingsRequest;Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;Lio/getstream/android/video/generated/models/VideoSettingsRequest;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/CallSettingsRequest;Lio/getstream/android/video/generated/models/AudioSettingsRequest;Lio/getstream/android/video/generated/models/BackstageSettingsRequest;Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;Lio/getstream/android/video/generated/models/IngressSettingsRequest;Lio/getstream/android/video/generated/models/LimitsSettingsRequest;Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;Lio/getstream/android/video/generated/models/RecordSettingsRequest;Lio/getstream/android/video/generated/models/RingSettingsRequest;Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;Lio/getstream/android/video/generated/models/SessionSettingsRequest;Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;Lio/getstream/android/video/generated/models/VideoSettingsRequest;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/CallSettingsRequest;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p17

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->audio:Lio/getstream/android/video/generated/models/AudioSettingsRequest;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->backstage:Lio/getstream/android/video/generated/models/BackstageSettingsRequest;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->broadcasting:Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->frameRecording:Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->geofencing:Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->individualRecording:Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->ingress:Lio/getstream/android/video/generated/models/IngressSettingsRequest;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->limits:Lio/getstream/android/video/generated/models/LimitsSettingsRequest;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->rawRecording:Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->recording:Lio/getstream/android/video/generated/models/RecordSettingsRequest;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->ring:Lio/getstream/android/video/generated/models/RingSettingsRequest;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->screensharing:Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->session:Lio/getstream/android/video/generated/models/SessionSettingsRequest;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->thumbnails:Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->transcription:Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v1, v1, v16

    if-eqz v1, :cond_f

    iget-object v1, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->video:Lio/getstream/android/video/generated/models/VideoSettingsRequest;

    move-object/from16 p17, v1

    :goto_f
    move-object/from16 p2, p1

    move-object/from16 p1, v0

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    goto :goto_10

    :cond_f
    move-object/from16 p17, p16

    goto :goto_f

    :goto_10
    invoke-virtual/range {p1 .. p17}, Lio/getstream/android/video/generated/models/CallSettingsRequest;->copy(Lio/getstream/android/video/generated/models/AudioSettingsRequest;Lio/getstream/android/video/generated/models/BackstageSettingsRequest;Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;Lio/getstream/android/video/generated/models/IngressSettingsRequest;Lio/getstream/android/video/generated/models/LimitsSettingsRequest;Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;Lio/getstream/android/video/generated/models/RecordSettingsRequest;Lio/getstream/android/video/generated/models/RingSettingsRequest;Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;Lio/getstream/android/video/generated/models/SessionSettingsRequest;Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;Lio/getstream/android/video/generated/models/VideoSettingsRequest;)Lio/getstream/android/video/generated/models/CallSettingsRequest;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Lio/getstream/android/video/generated/models/AudioSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->audio:Lio/getstream/android/video/generated/models/AudioSettingsRequest;

    return-object v0
.end method

.method public final component10()Lio/getstream/android/video/generated/models/RecordSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->recording:Lio/getstream/android/video/generated/models/RecordSettingsRequest;

    return-object v0
.end method

.method public final component11()Lio/getstream/android/video/generated/models/RingSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->ring:Lio/getstream/android/video/generated/models/RingSettingsRequest;

    return-object v0
.end method

.method public final component12()Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->screensharing:Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;

    return-object v0
.end method

.method public final component13()Lio/getstream/android/video/generated/models/SessionSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->session:Lio/getstream/android/video/generated/models/SessionSettingsRequest;

    return-object v0
.end method

.method public final component14()Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->thumbnails:Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;

    return-object v0
.end method

.method public final component15()Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->transcription:Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;

    return-object v0
.end method

.method public final component16()Lio/getstream/android/video/generated/models/VideoSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->video:Lio/getstream/android/video/generated/models/VideoSettingsRequest;

    return-object v0
.end method

.method public final component2()Lio/getstream/android/video/generated/models/BackstageSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->backstage:Lio/getstream/android/video/generated/models/BackstageSettingsRequest;

    return-object v0
.end method

.method public final component3()Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->broadcasting:Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;

    return-object v0
.end method

.method public final component4()Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->frameRecording:Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;

    return-object v0
.end method

.method public final component5()Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->geofencing:Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;

    return-object v0
.end method

.method public final component6()Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->individualRecording:Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;

    return-object v0
.end method

.method public final component7()Lio/getstream/android/video/generated/models/IngressSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->ingress:Lio/getstream/android/video/generated/models/IngressSettingsRequest;

    return-object v0
.end method

.method public final component8()Lio/getstream/android/video/generated/models/LimitsSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->limits:Lio/getstream/android/video/generated/models/LimitsSettingsRequest;

    return-object v0
.end method

.method public final component9()Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->rawRecording:Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;

    return-object v0
.end method

.method public final copy(Lio/getstream/android/video/generated/models/AudioSettingsRequest;Lio/getstream/android/video/generated/models/BackstageSettingsRequest;Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;Lio/getstream/android/video/generated/models/IngressSettingsRequest;Lio/getstream/android/video/generated/models/LimitsSettingsRequest;Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;Lio/getstream/android/video/generated/models/RecordSettingsRequest;Lio/getstream/android/video/generated/models/RingSettingsRequest;Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;Lio/getstream/android/video/generated/models/SessionSettingsRequest;Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;Lio/getstream/android/video/generated/models/VideoSettingsRequest;)Lio/getstream/android/video/generated/models/CallSettingsRequest;
    .locals 17
    .param p1    # Lio/getstream/android/video/generated/models/AudioSettingsRequest;
        .annotation runtime Lqx/q;
            name = "audio"
        .end annotation
    .end param
    .param p2    # Lio/getstream/android/video/generated/models/BackstageSettingsRequest;
        .annotation runtime Lqx/q;
            name = "backstage"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;
        .annotation runtime Lqx/q;
            name = "broadcasting"
        .end annotation
    .end param
    .param p4    # Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;
        .annotation runtime Lqx/q;
            name = "frame_recording"
        .end annotation
    .end param
    .param p5    # Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;
        .annotation runtime Lqx/q;
            name = "geofencing"
        .end annotation
    .end param
    .param p6    # Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;
        .annotation runtime Lqx/q;
            name = "individual_recording"
        .end annotation
    .end param
    .param p7    # Lio/getstream/android/video/generated/models/IngressSettingsRequest;
        .annotation runtime Lqx/q;
            name = "ingress"
        .end annotation
    .end param
    .param p8    # Lio/getstream/android/video/generated/models/LimitsSettingsRequest;
        .annotation runtime Lqx/q;
            name = "limits"
        .end annotation
    .end param
    .param p9    # Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;
        .annotation runtime Lqx/q;
            name = "raw_recording"
        .end annotation
    .end param
    .param p10    # Lio/getstream/android/video/generated/models/RecordSettingsRequest;
        .annotation runtime Lqx/q;
            name = "recording"
        .end annotation
    .end param
    .param p11    # Lio/getstream/android/video/generated/models/RingSettingsRequest;
        .annotation runtime Lqx/q;
            name = "ring"
        .end annotation
    .end param
    .param p12    # Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;
        .annotation runtime Lqx/q;
            name = "screensharing"
        .end annotation
    .end param
    .param p13    # Lio/getstream/android/video/generated/models/SessionSettingsRequest;
        .annotation runtime Lqx/q;
            name = "session"
        .end annotation
    .end param
    .param p14    # Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;
        .annotation runtime Lqx/q;
            name = "thumbnails"
        .end annotation
    .end param
    .param p15    # Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;
        .annotation runtime Lqx/q;
            name = "transcription"
        .end annotation
    .end param
    .param p16    # Lio/getstream/android/video/generated/models/VideoSettingsRequest;
        .annotation runtime Lqx/q;
            name = "video"
        .end annotation
    .end param

    new-instance v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    invoke-direct/range {v0 .. v16}, Lio/getstream/android/video/generated/models/CallSettingsRequest;-><init>(Lio/getstream/android/video/generated/models/AudioSettingsRequest;Lio/getstream/android/video/generated/models/BackstageSettingsRequest;Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;Lio/getstream/android/video/generated/models/IngressSettingsRequest;Lio/getstream/android/video/generated/models/LimitsSettingsRequest;Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;Lio/getstream/android/video/generated/models/RecordSettingsRequest;Lio/getstream/android/video/generated/models/RingSettingsRequest;Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;Lio/getstream/android/video/generated/models/SessionSettingsRequest;Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;Lio/getstream/android/video/generated/models/VideoSettingsRequest;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/CallSettingsRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/CallSettingsRequest;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->audio:Lio/getstream/android/video/generated/models/AudioSettingsRequest;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSettingsRequest;->audio:Lio/getstream/android/video/generated/models/AudioSettingsRequest;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->backstage:Lio/getstream/android/video/generated/models/BackstageSettingsRequest;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSettingsRequest;->backstage:Lio/getstream/android/video/generated/models/BackstageSettingsRequest;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->broadcasting:Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSettingsRequest;->broadcasting:Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->frameRecording:Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSettingsRequest;->frameRecording:Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->geofencing:Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSettingsRequest;->geofencing:Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->individualRecording:Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSettingsRequest;->individualRecording:Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->ingress:Lio/getstream/android/video/generated/models/IngressSettingsRequest;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSettingsRequest;->ingress:Lio/getstream/android/video/generated/models/IngressSettingsRequest;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->limits:Lio/getstream/android/video/generated/models/LimitsSettingsRequest;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSettingsRequest;->limits:Lio/getstream/android/video/generated/models/LimitsSettingsRequest;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->rawRecording:Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSettingsRequest;->rawRecording:Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->recording:Lio/getstream/android/video/generated/models/RecordSettingsRequest;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSettingsRequest;->recording:Lio/getstream/android/video/generated/models/RecordSettingsRequest;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->ring:Lio/getstream/android/video/generated/models/RingSettingsRequest;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSettingsRequest;->ring:Lio/getstream/android/video/generated/models/RingSettingsRequest;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->screensharing:Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSettingsRequest;->screensharing:Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->session:Lio/getstream/android/video/generated/models/SessionSettingsRequest;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSettingsRequest;->session:Lio/getstream/android/video/generated/models/SessionSettingsRequest;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->thumbnails:Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSettingsRequest;->thumbnails:Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->transcription:Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallSettingsRequest;->transcription:Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->video:Lio/getstream/android/video/generated/models/VideoSettingsRequest;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/CallSettingsRequest;->video:Lio/getstream/android/video/generated/models/VideoSettingsRequest;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    return v2

    :cond_11
    return v0
.end method

.method public final getAudio()Lio/getstream/android/video/generated/models/AudioSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->audio:Lio/getstream/android/video/generated/models/AudioSettingsRequest;

    return-object v0
.end method

.method public final getBackstage()Lio/getstream/android/video/generated/models/BackstageSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->backstage:Lio/getstream/android/video/generated/models/BackstageSettingsRequest;

    return-object v0
.end method

.method public final getBroadcasting()Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->broadcasting:Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;

    return-object v0
.end method

.method public final getFrameRecording()Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->frameRecording:Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;

    return-object v0
.end method

.method public final getGeofencing()Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->geofencing:Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;

    return-object v0
.end method

.method public final getIndividualRecording()Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->individualRecording:Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;

    return-object v0
.end method

.method public final getIngress()Lio/getstream/android/video/generated/models/IngressSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->ingress:Lio/getstream/android/video/generated/models/IngressSettingsRequest;

    return-object v0
.end method

.method public final getLimits()Lio/getstream/android/video/generated/models/LimitsSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->limits:Lio/getstream/android/video/generated/models/LimitsSettingsRequest;

    return-object v0
.end method

.method public final getRawRecording()Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->rawRecording:Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;

    return-object v0
.end method

.method public final getRecording()Lio/getstream/android/video/generated/models/RecordSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->recording:Lio/getstream/android/video/generated/models/RecordSettingsRequest;

    return-object v0
.end method

.method public final getRing()Lio/getstream/android/video/generated/models/RingSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->ring:Lio/getstream/android/video/generated/models/RingSettingsRequest;

    return-object v0
.end method

.method public final getScreensharing()Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->screensharing:Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;

    return-object v0
.end method

.method public final getSession()Lio/getstream/android/video/generated/models/SessionSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->session:Lio/getstream/android/video/generated/models/SessionSettingsRequest;

    return-object v0
.end method

.method public final getThumbnails()Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->thumbnails:Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;

    return-object v0
.end method

.method public final getTranscription()Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->transcription:Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;

    return-object v0
.end method

.method public final getVideo()Lio/getstream/android/video/generated/models/VideoSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->video:Lio/getstream/android/video/generated/models/VideoSettingsRequest;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->audio:Lio/getstream/android/video/generated/models/AudioSettingsRequest;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/AudioSettingsRequest;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->backstage:Lio/getstream/android/video/generated/models/BackstageSettingsRequest;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/BackstageSettingsRequest;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->broadcasting:Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->frameRecording:Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->geofencing:Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->individualRecording:Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->ingress:Lio/getstream/android/video/generated/models/IngressSettingsRequest;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/IngressSettingsRequest;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->limits:Lio/getstream/android/video/generated/models/LimitsSettingsRequest;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/LimitsSettingsRequest;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->rawRecording:Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;

    if-nez v2, :cond_8

    move v2, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->recording:Lio/getstream/android/video/generated/models/RecordSettingsRequest;

    if-nez v2, :cond_9

    move v2, v1

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/RecordSettingsRequest;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->ring:Lio/getstream/android/video/generated/models/RingSettingsRequest;

    if-nez v2, :cond_a

    move v2, v1

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/RingSettingsRequest;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->screensharing:Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;

    if-nez v2, :cond_b

    move v2, v1

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->session:Lio/getstream/android/video/generated/models/SessionSettingsRequest;

    if-nez v2, :cond_c

    move v2, v1

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/SessionSettingsRequest;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->thumbnails:Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;

    if-nez v2, :cond_d

    move v2, v1

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;->hashCode()I

    move-result v2

    :goto_d
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->transcription:Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;

    if-nez v2, :cond_e

    move v2, v1

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;->hashCode()I

    move-result v2

    :goto_e
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->video:Lio/getstream/android/video/generated/models/VideoSettingsRequest;

    if-nez v2, :cond_f

    goto :goto_f

    :cond_f
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/VideoSettingsRequest;->hashCode()I

    move-result v1

    :goto_f
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->audio:Lio/getstream/android/video/generated/models/AudioSettingsRequest;

    iget-object v2, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->backstage:Lio/getstream/android/video/generated/models/BackstageSettingsRequest;

    iget-object v3, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->broadcasting:Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;

    iget-object v4, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->frameRecording:Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;

    iget-object v5, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->geofencing:Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;

    iget-object v6, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->individualRecording:Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;

    iget-object v7, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->ingress:Lio/getstream/android/video/generated/models/IngressSettingsRequest;

    iget-object v8, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->limits:Lio/getstream/android/video/generated/models/LimitsSettingsRequest;

    iget-object v9, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->rawRecording:Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;

    iget-object v10, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->recording:Lio/getstream/android/video/generated/models/RecordSettingsRequest;

    iget-object v11, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->ring:Lio/getstream/android/video/generated/models/RingSettingsRequest;

    iget-object v12, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->screensharing:Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;

    iget-object v13, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->session:Lio/getstream/android/video/generated/models/SessionSettingsRequest;

    iget-object v14, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->thumbnails:Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;

    iget-object v15, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->transcription:Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;

    move-object/from16 v16, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/CallSettingsRequest;->video:Lio/getstream/android/video/generated/models/VideoSettingsRequest;

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v17, v15

    const-string v15, "CallSettingsRequest(audio="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", backstage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", broadcasting="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", frameRecording="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", geofencing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", individualRecording="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ingress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", limits="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rawRecording="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", recording="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ring="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", screensharing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", session="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", thumbnails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transcription="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", video="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
