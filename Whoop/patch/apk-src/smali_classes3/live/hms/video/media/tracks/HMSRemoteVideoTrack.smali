.class public final Llive/hms/video/media/tracks/HMSRemoteVideoTrack;
.super Llive/hms/video/media/tracks/HMSVideoTrack;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/media/tracks/HMSRemoteTrack;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/media/tracks/HMSRemoteVideoTrack$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008!\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\t\u0018\u00002\u00020\u00012\u00020\u0002B+\u0008\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ!\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00142\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008 \u0010!J\u0013\u0010$\u001a\u0008\u0012\u0004\u0012\u00020#0\"\u00a2\u0006\u0004\u0008$\u0010%J\u001d\u0010)\u001a\u00020\u00112\u000c\u0010&\u001a\u0008\u0012\u0004\u0012\u00020#0\"H\u0000\u00a2\u0006\u0004\u0008\'\u0010(J\r\u0010*\u001a\u00020\u0014\u00a2\u0006\u0004\u0008*\u0010+J\u000f\u0010,\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008,\u0010-J\u0013\u0010.\u001a\u00020\u001a*\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008.\u0010/J\u0013\u00100\u001a\u00020\u0014*\u00020\u001aH\u0002\u00a2\u0006\u0004\u00080\u00101R\u001a\u0010\u0004\u001a\u00020\u00038\u0010X\u0090\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00102\u001a\u0004\u00083\u00104R\"\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u00105\u001a\u0004\u00086\u00107\"\u0004\u00088\u00109R\u001a\u0010:\u001a\u00020\u00078\u0006X\u0086D\u00a2\u0006\u000c\n\u0004\u0008:\u0010;\u001a\u0004\u0008<\u0010-R\u0016\u0010=\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008=\u0010>R\"\u0010?\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008?\u0010>\u001a\u0004\u0008@\u0010A\"\u0004\u0008B\u0010CR\u001c\u0010&\u001a\u0008\u0012\u0004\u0012\u00020#0\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008&\u0010DR!\u0010J\u001a\u0008\u0012\u0004\u0012\u00020\r0E8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008F\u0010G\u001a\u0004\u0008H\u0010IR*\u0010M\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@PX\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008M\u0010N\u001a\u0004\u0008M\u0010O\"\u0004\u0008P\u0010QR$\u0010R\u001a\u00020K2\u0006\u0010L\u001a\u00020K8V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008R\u0010O\"\u0004\u0008S\u0010Q\u00a8\u0006T"
    }
    d2 = {
        "Llive/hms/video/media/tracks/HMSRemoteVideoTrack;",
        "Llive/hms/video/media/tracks/HMSVideoTrack;",
        "Llive/hms/video/media/tracks/HMSRemoteTrack;",
        "Llive/hms/video/media/streams/HMSRemoteStream;",
        "stream",
        "Lhms/webrtc/VideoTrack;",
        "nativeTrack",
        "",
        "source",
        "",
        "ssrc",
        "<init>",
        "(Llive/hms/video/media/streams/HMSRemoteStream;Lhms/webrtc/VideoTrack;Ljava/lang/String;J)V",
        "Lhms/webrtc/VideoSink;",
        "sink",
        "Llive/hms/video/sdk/HMSAddSinkResultListener;",
        "resultListener",
        "Ll83/a0;",
        "addSink",
        "(Lhms/webrtc/VideoSink;Llive/hms/video/sdk/HMSAddSinkResultListener;)V",
        "Llive/hms/video/media/settings/HMSLayer;",
        "selectedLayer",
        "addSinkInternal",
        "(Lhms/webrtc/VideoSink;Llive/hms/video/media/settings/HMSLayer;)V",
        "removeSink",
        "(Lhms/webrtc/VideoSink;)V",
        "Llive/hms/video/media/settings/HMSSimulcastLayer;",
        "layer",
        "setExpectedLayer$lib_release",
        "(Llive/hms/video/media/settings/HMSSimulcastLayer;Llive/hms/video/sdk/HMSAddSinkResultListener;)V",
        "setExpectedLayer",
        "HMSLayer",
        "setLayer",
        "(Llive/hms/video/media/settings/HMSLayer;Llive/hms/video/sdk/HMSAddSinkResultListener;)V",
        "",
        "Llive/hms/video/media/settings/HMSSimulcastLayerDefinition;",
        "getLayerDefinition",
        "()Ljava/util/List;",
        "layerDefinition",
        "setLayerDefinition$lib_release",
        "(Ljava/util/List;)V",
        "setLayerDefinition",
        "getLayer",
        "()Llive/hms/video/media/settings/HMSLayer;",
        "toString",
        "()Ljava/lang/String;",
        "toSimulcastLayer",
        "(Llive/hms/video/media/settings/HMSLayer;)Llive/hms/video/media/settings/HMSSimulcastLayer;",
        "toHMSLayer",
        "(Llive/hms/video/media/settings/HMSSimulcastLayer;)Llive/hms/video/media/settings/HMSLayer;",
        "Llive/hms/video/media/streams/HMSRemoteStream;",
        "getStream$lib_release",
        "()Llive/hms/video/media/streams/HMSRemoteStream;",
        "J",
        "getSsrc",
        "()J",
        "setSsrc",
        "(J)V",
        "TAG",
        "Ljava/lang/String;",
        "getTAG",
        "expectedLayer",
        "Llive/hms/video/media/settings/HMSSimulcastLayer;",
        "currentLayer",
        "getCurrentLayer$lib_release",
        "()Llive/hms/video/media/settings/HMSSimulcastLayer;",
        "setCurrentLayer$lib_release",
        "(Llive/hms/video/media/settings/HMSSimulcastLayer;)V",
        "Ljava/util/List;",
        "Ljava/util/HashSet;",
        "sinksMap$delegate",
        "Ll83/h;",
        "getSinksMap",
        "()Ljava/util/HashSet;",
        "sinksMap",
        "",
        "value",
        "isDegraded",
        "Z",
        "()Z",
        "setDegraded$lib_release",
        "(Z)V",
        "isPlaybackAllowed",
        "setPlaybackAllowed",
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


# instance fields
.field private final TAG:Ljava/lang/String;

.field private currentLayer:Llive/hms/video/media/settings/HMSSimulcastLayer;

.field private expectedLayer:Llive/hms/video/media/settings/HMSSimulcastLayer;

.field private isDegraded:Z

.field private layerDefinition:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llive/hms/video/media/settings/HMSSimulcastLayerDefinition;",
            ">;"
        }
    .end annotation
.end field

.field private final sinksMap$delegate:Ll83/h;

.field private ssrc:J

.field private final stream:Llive/hms/video/media/streams/HMSRemoteStream;


# direct methods
.method public constructor <init>(Llive/hms/video/media/streams/HMSRemoteStream;Lhms/webrtc/VideoTrack;Ljava/lang/String;J)V
    .locals 1

    const-string v0, "stream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeTrack"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Llive/hms/video/media/tracks/HMSVideoTrack;-><init>(Llive/hms/video/media/streams/HMSMediaStream;Lhms/webrtc/VideoTrack;Ljava/lang/String;)V

    .line 4
    iput-object p1, p0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->stream:Llive/hms/video/media/streams/HMSRemoteStream;

    .line 5
    iput-wide p4, p0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->ssrc:J

    .line 6
    const-string p1, "HMSRemoteVideoTrack"

    iput-object p1, p0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->TAG:Ljava/lang/String;

    .line 7
    sget-object p1, Llive/hms/video/media/settings/HMSSimulcastLayer;->HIGH:Llive/hms/video/media/settings/HMSSimulcastLayer;

    iput-object p1, p0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->expectedLayer:Llive/hms/video/media/settings/HMSSimulcastLayer;

    .line 8
    sget-object p1, Llive/hms/video/media/settings/HMSSimulcastLayer;->NONE:Llive/hms/video/media/settings/HMSSimulcastLayer;

    .line 9
    iput-object p1, p0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->currentLayer:Llive/hms/video/media/settings/HMSSimulcastLayer;

    .line 10
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->layerDefinition:Ljava/util/List;

    .line 11
    new-instance p1, Llh1/a;

    const/4 p2, 0x6

    invoke-direct {p1, p2}, Llh1/a;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->sinksMap$delegate:Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(Llive/hms/video/media/streams/HMSRemoteStream;Lhms/webrtc/VideoTrack;Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_0

    .line 1
    const-string p3, "regular"

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    .line 2
    invoke-direct/range {v0 .. v5}, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;-><init>(Llive/hms/video/media/streams/HMSRemoteStream;Lhms/webrtc/VideoTrack;Ljava/lang/String;J)V

    return-void
.end method

.method public static synthetic a()Ljava/util/HashSet;
    .locals 1

    invoke-static {}, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->sinksMap_delegate$lambda$0()Ljava/util/HashSet;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$addSink$s-1053432802(Llive/hms/video/media/tracks/HMSRemoteVideoTrack;Lhms/webrtc/VideoSink;Llive/hms/video/sdk/HMSAddSinkResultListener;)V
    .locals 0

    invoke-super {p0, p1, p2}, Llive/hms/video/media/tracks/HMSVideoTrack;->addSink(Lhms/webrtc/VideoSink;Llive/hms/video/sdk/HMSAddSinkResultListener;)V

    return-void
.end method

.method public static final synthetic access$getExpectedLayer$p(Llive/hms/video/media/tracks/HMSRemoteVideoTrack;)Llive/hms/video/media/settings/HMSSimulcastLayer;
    .locals 0

    iget-object p0, p0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->expectedLayer:Llive/hms/video/media/settings/HMSSimulcastLayer;

    return-object p0
.end method

.method public static final synthetic access$getSinksMap(Llive/hms/video/media/tracks/HMSRemoteVideoTrack;)Ljava/util/HashSet;
    .locals 0

    invoke-direct {p0}, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->getSinksMap()Ljava/util/HashSet;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$removeSink$s-1053432802(Llive/hms/video/media/tracks/HMSRemoteVideoTrack;Lhms/webrtc/VideoSink;)V
    .locals 0

    invoke-super {p0, p1}, Llive/hms/video/media/tracks/HMSVideoTrack;->removeSink(Lhms/webrtc/VideoSink;)V

    return-void
.end method

.method public static final synthetic access$setEnabled$lib_release$s-1053432802(Llive/hms/video/media/tracks/HMSRemoteVideoTrack;ZLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-super {p0, p1, p2}, Llive/hms/video/media/tracks/HMSTrack;->setEnabled$lib_release(ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final getSinksMap()Ljava/util/HashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Lhms/webrtc/VideoSink;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->sinksMap$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashSet;

    return-object v0
.end method

.method public static synthetic setExpectedLayer$lib_release$default(Llive/hms/video/media/tracks/HMSRemoteVideoTrack;Llive/hms/video/media/settings/HMSSimulcastLayer;Llive/hms/video/sdk/HMSAddSinkResultListener;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->setExpectedLayer$lib_release(Llive/hms/video/media/settings/HMSSimulcastLayer;Llive/hms/video/sdk/HMSAddSinkResultListener;)V

    return-void
.end method

.method public static synthetic setLayer$default(Llive/hms/video/media/tracks/HMSRemoteVideoTrack;Llive/hms/video/media/settings/HMSLayer;Llive/hms/video/sdk/HMSAddSinkResultListener;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->setLayer(Llive/hms/video/media/settings/HMSLayer;Llive/hms/video/sdk/HMSAddSinkResultListener;)V

    return-void
.end method

.method private static final sinksMap_delegate$lambda$0()Ljava/util/HashSet;
    .locals 1

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    return-object v0
.end method

.method private final toHMSLayer(Llive/hms/video/media/settings/HMSSimulcastLayer;)Llive/hms/video/media/settings/HMSLayer;
    .locals 1

    sget-object v0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    sget-object p1, Llive/hms/video/media/settings/HMSLayer;->HIGH:Llive/hms/video/media/settings/HMSLayer;

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Llive/hms/video/media/settings/HMSLayer;->HIGH:Llive/hms/video/media/settings/HMSLayer;

    return-object p1

    :cond_2
    sget-object p1, Llive/hms/video/media/settings/HMSLayer;->MEDIUM:Llive/hms/video/media/settings/HMSLayer;

    return-object p1

    :cond_3
    sget-object p1, Llive/hms/video/media/settings/HMSLayer;->LOW:Llive/hms/video/media/settings/HMSLayer;

    return-object p1
.end method

.method private final toSimulcastLayer(Llive/hms/video/media/settings/HMSLayer;)Llive/hms/video/media/settings/HMSSimulcastLayer;
    .locals 1

    sget-object v0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    sget-object p1, Llive/hms/video/media/settings/HMSSimulcastLayer;->HIGH:Llive/hms/video/media/settings/HMSSimulcastLayer;

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Llive/hms/video/media/settings/HMSSimulcastLayer;->MEDIUM:Llive/hms/video/media/settings/HMSSimulcastLayer;

    return-object p1

    :cond_2
    sget-object p1, Llive/hms/video/media/settings/HMSSimulcastLayer;->LOW:Llive/hms/video/media/settings/HMSSimulcastLayer;

    return-object p1
.end method


# virtual methods
.method public addSink(Lhms/webrtc/VideoSink;Llive/hms/video/sdk/HMSAddSinkResultListener;)V
    .locals 3

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/media/tracks/HMSRemoteVideoTrack$addSink$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Llive/hms/video/media/tracks/HMSRemoteVideoTrack$addSink$1;-><init>(Llive/hms/video/media/tracks/HMSRemoteVideoTrack;Lhms/webrtc/VideoSink;Llive/hms/video/sdk/HMSAddSinkResultListener;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final addSinkInternal(Lhms/webrtc/VideoSink;Llive/hms/video/media/settings/HMSLayer;)V
    .locals 1

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedLayer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->toSimulcastLayer(Llive/hms/video/media/settings/HMSLayer;)Llive/hms/video/media/settings/HMSSimulcastLayer;

    move-result-object p2

    iput-object p2, p0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->expectedLayer:Llive/hms/video/media/settings/HMSSimulcastLayer;

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->addSink(Lhms/webrtc/VideoSink;Llive/hms/video/sdk/HMSAddSinkResultListener;)V

    return-void
.end method

.method public final getCurrentLayer$lib_release()Llive/hms/video/media/settings/HMSSimulcastLayer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->currentLayer:Llive/hms/video/media/settings/HMSSimulcastLayer;

    return-object v0
.end method

.method public final getLayer()Llive/hms/video/media/settings/HMSLayer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->expectedLayer:Llive/hms/video/media/settings/HMSSimulcastLayer;

    invoke-direct {p0, v0}, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->toHMSLayer(Llive/hms/video/media/settings/HMSSimulcastLayer;)Llive/hms/video/media/settings/HMSLayer;

    move-result-object v0

    return-object v0
.end method

.method public final getLayerDefinition()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/media/settings/HMSSimulcastLayerDefinition;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->layerDefinition:Ljava/util/List;

    return-object v0
.end method

.method public getSsrc()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->ssrc:J

    return-wide v0
.end method

.method public bridge synthetic getStream$lib_release()Llive/hms/video/media/streams/HMSMediaStream;
    .locals 1

    .line 1
    invoke-virtual {p0}, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->getStream$lib_release()Llive/hms/video/media/streams/HMSRemoteStream;

    move-result-object v0

    return-object v0
.end method

.method public getStream$lib_release()Llive/hms/video/media/streams/HMSRemoteStream;
    .locals 1

    .line 2
    iget-object v0, p0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->stream:Llive/hms/video/media/streams/HMSRemoteStream;

    return-object v0
.end method

.method public final getTAG()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method public isDegraded()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->isDegraded:Z

    return v0
.end method

.method public isPlaybackAllowed()Z
    .locals 1

    invoke-virtual {p0}, Llive/hms/video/media/tracks/HMSTrack;->isEnabled$lib_release()Z

    move-result v0

    return v0
.end method

.method public removeSink(Lhms/webrtc/VideoSink;)V
    .locals 3

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/media/tracks/HMSRemoteVideoTrack$removeSink$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Llive/hms/video/media/tracks/HMSRemoteVideoTrack$removeSink$1;-><init>(Llive/hms/video/media/tracks/HMSRemoteVideoTrack;Lhms/webrtc/VideoSink;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final setCurrentLayer$lib_release(Llive/hms/video/media/settings/HMSSimulcastLayer;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->currentLayer:Llive/hms/video/media/settings/HMSSimulcastLayer;

    return-void
.end method

.method public setDegraded$lib_release(Z)V
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->isDegraded:Z

    if-eq p1, v0, :cond_0

    iput-boolean p1, p0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->isDegraded:Z

    :cond_0
    return-void
.end method

.method public final setExpectedLayer$lib_release(Llive/hms/video/media/settings/HMSSimulcastLayer;Llive/hms/video/sdk/HMSAddSinkResultListener;)V
    .locals 3

    const-string v0, "layer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/media/tracks/HMSRemoteVideoTrack$setExpectedLayer$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Llive/hms/video/media/tracks/HMSRemoteVideoTrack$setExpectedLayer$1;-><init>(Llive/hms/video/media/tracks/HMSRemoteVideoTrack;Llive/hms/video/media/settings/HMSSimulcastLayer;Llive/hms/video/sdk/HMSAddSinkResultListener;Lq83/d;)V

    const/4 p2, 0x3

    invoke-static {v0, v2, v2, v1, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p2, Llive/hms/video/media/settings/HMSSimulcastLayer;->NONE:Llive/hms/video/media/settings/HMSSimulcastLayer;

    if-eq p1, p2, :cond_0

    iput-object p1, p0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->expectedLayer:Llive/hms/video/media/settings/HMSSimulcastLayer;

    :cond_0
    return-void
.end method

.method public final setLayer(Llive/hms/video/media/settings/HMSLayer;Llive/hms/video/sdk/HMSAddSinkResultListener;)V
    .locals 1

    const-string v0, "HMSLayer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->toSimulcastLayer(Llive/hms/video/media/settings/HMSLayer;)Llive/hms/video/media/settings/HMSSimulcastLayer;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->setExpectedLayer$lib_release(Llive/hms/video/media/settings/HMSSimulcastLayer;Llive/hms/video/sdk/HMSAddSinkResultListener;)V

    return-void
.end method

.method public final setLayerDefinition$lib_release(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Llive/hms/video/media/settings/HMSSimulcastLayerDefinition;",
            ">;)V"
        }
    .end annotation

    const-string v0, "layerDefinition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->layerDefinition:Ljava/util/List;

    return-void
.end method

.method public setPlaybackAllowed(Z)V
    .locals 3

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/media/tracks/HMSRemoteVideoTrack$isPlaybackAllowed$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Llive/hms/video/media/tracks/HMSRemoteVideoTrack$isPlaybackAllowed$1;-><init>(Llive/hms/video/media/tracks/HMSRemoteVideoTrack;ZLq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public setSsrc(J)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->ssrc:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HMSRemoteVideoTrack{trackId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llive/hms/video/media/tracks/HMSTrack;->isEnabled$lib_release()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
