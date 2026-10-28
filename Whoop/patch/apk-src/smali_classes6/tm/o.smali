.class public final Ltm/o;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field public final synthetic w:Landroid/media/AudioTrack;

.field public final synthetic x:Ltm/s;


# direct methods
.method public constructor <init>(Ltm/s;Landroid/media/AudioTrack;)V
    .locals 0

    iput-object p1, p0, Ltm/o;->x:Ltm/s;

    iput-object p2, p0, Ltm/o;->w:Landroid/media/AudioTrack;

    const-string p1, "ExoPlayer:AudioTrackReleaseThread"

    invoke-direct {p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ltm/o;->x:Ltm/s;

    iget-object v1, p0, Ltm/o;->w:Landroid/media/AudioTrack;

    :try_start_0
    invoke-virtual {v1}, Landroid/media/AudioTrack;->flush()V

    invoke-virtual {v1}, Landroid/media/AudioTrack;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, v0, Ltm/s;->h:Landroid/os/ConditionVariable;

    invoke-virtual {v0}, Landroid/os/ConditionVariable;->open()V

    return-void

    :catchall_0
    move-exception v1

    iget-object v0, v0, Ltm/s;->h:Landroid/os/ConditionVariable;

    invoke-virtual {v0}, Landroid/os/ConditionVariable;->open()V

    throw v1
.end method
