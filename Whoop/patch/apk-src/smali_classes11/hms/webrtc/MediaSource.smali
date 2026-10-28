.class public Lhms/webrtc/MediaSource;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhms/webrtc/MediaSource$State;
    }
.end annotation


# instance fields
.field private nativeSource:J

.field private final refCountDelegate:Lhms/webrtc/RefCountDelegate;


# direct methods
.method public constructor <init>(J)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lhms/webrtc/RefCountDelegate;

    new-instance v1, Lhms/webrtc/j;

    invoke-direct {v1, p1, p2}, Lhms/webrtc/j;-><init>(J)V

    invoke-direct {v0, v1}, Lhms/webrtc/RefCountDelegate;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Lhms/webrtc/MediaSource;->refCountDelegate:Lhms/webrtc/RefCountDelegate;

    iput-wide p1, p0, Lhms/webrtc/MediaSource;->nativeSource:J

    return-void
.end method

.method public static synthetic a(J)V
    .locals 0

    invoke-static {p0, p1}, Lhms/webrtc/MediaSource;->lambda$new$0(J)V

    return-void
.end method

.method private checkMediaSourceExists()V
    .locals 4

    iget-wide v0, p0, Lhms/webrtc/MediaSource;->nativeSource:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "MediaSource has been disposed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static synthetic lambda$new$0(J)V
    .locals 0

    invoke-static {p0, p1}, Lhms/webrtc/JniCommon;->nativeReleaseRef(J)V

    return-void
.end method

.method private static native nativeGetState(J)Lhms/webrtc/MediaSource$State;
.end method


# virtual methods
.method public dispose()V
    .locals 2

    invoke-direct {p0}, Lhms/webrtc/MediaSource;->checkMediaSourceExists()V

    iget-object v0, p0, Lhms/webrtc/MediaSource;->refCountDelegate:Lhms/webrtc/RefCountDelegate;

    invoke-virtual {v0}, Lhms/webrtc/RefCountDelegate;->release()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lhms/webrtc/MediaSource;->nativeSource:J

    return-void
.end method

.method public getNativeMediaSource()J
    .locals 2

    invoke-direct {p0}, Lhms/webrtc/MediaSource;->checkMediaSourceExists()V

    iget-wide v0, p0, Lhms/webrtc/MediaSource;->nativeSource:J

    return-wide v0
.end method

.method public runWithReference(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lhms/webrtc/MediaSource;->refCountDelegate:Lhms/webrtc/RefCountDelegate;

    invoke-virtual {v0}, Lhms/webrtc/RefCountDelegate;->safeRetain()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lhms/webrtc/MediaSource;->refCountDelegate:Lhms/webrtc/RefCountDelegate;

    invoke-virtual {p1}, Lhms/webrtc/RefCountDelegate;->release()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lhms/webrtc/MediaSource;->refCountDelegate:Lhms/webrtc/RefCountDelegate;

    invoke-virtual {v0}, Lhms/webrtc/RefCountDelegate;->release()V

    throw p1

    :cond_0
    return-void
.end method

.method public state()Lhms/webrtc/MediaSource$State;
    .locals 2

    invoke-direct {p0}, Lhms/webrtc/MediaSource;->checkMediaSourceExists()V

    iget-wide v0, p0, Lhms/webrtc/MediaSource;->nativeSource:J

    invoke-static {v0, v1}, Lhms/webrtc/MediaSource;->nativeGetState(J)Lhms/webrtc/MediaSource$State;

    move-result-object v0

    return-object v0
.end method
