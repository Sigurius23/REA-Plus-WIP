.class public final Lt23/x1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lt23/c0;

.field public final c:Lbc3/c0;

.field public final d:Lorg/webrtc/EglBase$Context;

.field public final e:Lt23/e1;

.field public final f:Lt23/a2;

.field public final g:Lt23/h3;

.field public final h:Lt23/f3;

.field public final i:Ll83/p;

.field public final j:Lq33/b;

.field public final k:Lq33/b;

.field public l:Lorg/webrtc/VideoSource;

.field public m:Lorg/webrtc/VideoSource;

.field public n:Lorg/webrtc/VideoTrack;

.field public o:Lorg/webrtc/VideoTrack;

.field public final p:Ljava/lang/Object;

.field public q:Z

.field public r:Lorg/webrtc/AudioSource;

.field public s:Lorg/webrtc/AudioTrack;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lt23/c0;Lhc3/d;Lorg/webrtc/EglBase$Context;ILt23/l;)V
    .locals 0

    const-string p5, "context"

    invoke-static {p1, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "scope"

    invoke-static {p3, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt23/x1;->a:Landroid/content/Context;

    iput-object p2, p0, Lt23/x1;->b:Lt23/c0;

    iput-object p3, p0, Lt23/x1;->c:Lbc3/c0;

    iput-object p4, p0, Lt23/x1;->d:Lorg/webrtc/EglBase$Context;

    new-instance p1, Lt23/e1;

    new-instance p2, Lng3/n;

    const/16 p3, 0x14

    invoke-direct {p2, p3}, Lng3/n;-><init>(I)V

    invoke-direct {p1, p0, p4, p2}, Lt23/e1;-><init>(Lt23/x1;Lorg/webrtc/EglBase$Context;Lng3/n;)V

    iput-object p1, p0, Lt23/x1;->e:Lt23/e1;

    new-instance p1, Lt23/a2;

    invoke-direct {p1, p0, p6}, Lt23/a2;-><init>(Lt23/x1;Lt23/l;)V

    iput-object p1, p0, Lt23/x1;->f:Lt23/a2;

    new-instance p2, Lt23/h3;

    invoke-direct {p2, p0, p1, p6}, Lt23/h3;-><init>(Lt23/x1;Lt23/a2;Lt23/l;)V

    iput-object p2, p0, Lt23/x1;->g:Lt23/h3;

    new-instance p1, Lt23/f3;

    invoke-direct {p1, p0, p4}, Lt23/f3;-><init>(Lt23/x1;Lorg/webrtc/EglBase$Context;)V

    iput-object p1, p0, Lt23/x1;->h:Lt23/f3;

    const-string p1, "Media:MediaManagerImpl"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lt23/x1;->i:Ll83/p;

    new-instance p1, Lq33/b;

    new-instance p2, Lt23/t1;

    invoke-direct {p2, p0}, Lt23/t1;-><init>(Lt23/x1;)V

    new-instance p3, Lt23/u1;

    invoke-direct {p3, p0}, Lt23/u1;-><init>(Lt23/x1;)V

    invoke-direct {p1, p2, p3}, Lq33/b;-><init>(Lc93/a;Lc93/a;)V

    iput-object p1, p0, Lt23/x1;->j:Lq33/b;

    new-instance p1, Lq33/b;

    new-instance p2, Lt23/w1;

    invoke-direct {p2, p0}, Lt23/w1;-><init>(Lt23/x1;)V

    sget-object p3, Lt23/v1;->w:Lt23/v1;

    invoke-direct {p1, p3, p2}, Lq33/b;-><init>(Lc93/a;Lc93/a;)V

    iput-object p1, p0, Lt23/x1;->k:Lq33/b;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt23/x1;->p:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lt23/x1;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lt23/x1;->s:Lorg/webrtc/AudioTrack;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lorg/webrtc/AudioTrack;->dispose()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lt23/x1;->r:Lorg/webrtc/AudioSource;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lorg/webrtc/MediaSource;->dispose()V

    :cond_1
    iget-object v1, p0, Lt23/x1;->n:Lorg/webrtc/VideoTrack;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lorg/webrtc/VideoTrack;->dispose()V

    :cond_2
    iget-object v1, p0, Lt23/x1;->l:Lorg/webrtc/VideoSource;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lorg/webrtc/VideoSource;->dispose()V

    :cond_3
    iget-object v1, p0, Lt23/x1;->o:Lorg/webrtc/VideoTrack;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lorg/webrtc/VideoTrack;->dispose()V

    :cond_4
    iget-object v1, p0, Lt23/x1;->m:Lorg/webrtc/VideoSource;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lorg/webrtc/VideoSource;->dispose()V

    :cond_5
    const/4 v1, 0x0

    iput-object v1, p0, Lt23/x1;->s:Lorg/webrtc/AudioTrack;

    iput-object v1, p0, Lt23/x1;->r:Lorg/webrtc/AudioSource;

    iput-object v1, p0, Lt23/x1;->n:Lorg/webrtc/VideoTrack;

    iput-object v1, p0, Lt23/x1;->l:Lorg/webrtc/VideoSource;

    iput-object v1, p0, Lt23/x1;->o:Lorg/webrtc/VideoTrack;

    iput-object v1, p0, Lt23/x1;->m:Lorg/webrtc/VideoSource;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public final b()Lorg/webrtc/AudioSource;
    .locals 4

    iget-object v0, p0, Lt23/x1;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lt23/x1;->r:Lorg/webrtc/AudioSource;

    if-nez v1, :cond_0

    iget-object v1, p0, Lt23/x1;->b:Lt23/c0;

    invoke-virtual {v1}, Lt23/c0;->j()Le33/j0;

    move-result-object v1

    new-instance v2, Lm5/k;

    const/4 v3, 0x6

    invoke-direct {v2, p0, v3}, Lm5/k;-><init>(Ljava/lang/Object;I)V

    invoke-static {v2}, Ln53/c;->a(Lm5/k;)Lorg/webrtc/MediaConstraints;

    move-result-object v2

    invoke-virtual {v1}, Le33/j0;->b()Lorg/webrtc/PeerConnectionFactory;

    move-result-object v1

    invoke-virtual {v1, v2}, Lorg/webrtc/PeerConnectionFactory;->createAudioSource(Lorg/webrtc/MediaConstraints;)Lorg/webrtc/AudioSource;

    move-result-object v1

    const-string v2, "createAudioSource(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lt23/x1;->r:Lorg/webrtc/AudioSource;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lt23/x1;->r:Lorg/webrtc/AudioSource;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public final c()Lorg/webrtc/VideoSource;
    .locals 4

    iget-object v0, p0, Lt23/x1;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lt23/x1;->l:Lorg/webrtc/VideoSource;

    if-nez v1, :cond_0

    iget-object v1, p0, Lt23/x1;->b:Lt23/c0;

    invoke-virtual {v1}, Lt23/c0;->j()Le33/j0;

    move-result-object v1

    iget-object v2, p0, Lt23/x1;->j:Lq33/b;

    const-string v3, "filterVideoProcessor"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Le33/j0;->b()Lorg/webrtc/PeerConnectionFactory;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lorg/webrtc/PeerConnectionFactory;->createVideoSource(Z)Lorg/webrtc/VideoSource;

    move-result-object v1

    invoke-virtual {v1, v2}, Lorg/webrtc/VideoSource;->setVideoProcessor(Lorg/webrtc/VideoProcessor;)V

    iput-object v1, p0, Lt23/x1;->l:Lorg/webrtc/VideoSource;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lt23/x1;->l:Lorg/webrtc/VideoSource;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public final d(Lkotlin/jvm/functions/Function1;)V
    .locals 5

    iget-object v0, p0, Lt23/x1;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lt23/x1;->q:Z

    if-eqz v1, :cond_1

    iget-object p1, p0, Lt23/x1;->i:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb23/k;

    iget-object v1, p1, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->F:Lb23/g;

    iget-object v3, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p1, Lb23/k;->b:Lb23/j;

    iget-object p1, p1, Lb23/k;->a:Ljava/lang/String;

    const-string v3, "[runOnAudioTrackIfAvailable] MediaManager already cleaned up; skipping audio track operation"

    const/4 v4, 0x0

    invoke-interface {v1, v2, p1, v3, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :cond_1
    :try_start_1
    iget-object v1, p0, Lt23/x1;->s:Lorg/webrtc/AudioTrack;

    if-nez v1, :cond_2

    iget-object v1, p0, Lt23/x1;->b:Lt23/c0;

    invoke-virtual {v1}, Lt23/c0;->j()Le33/j0;

    move-result-object v1

    invoke-virtual {p0}, Lt23/x1;->b()Lorg/webrtc/AudioSource;

    move-result-object v2

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "toString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Le33/j0;->b()Lorg/webrtc/PeerConnectionFactory;

    move-result-object v1

    invoke-virtual {v1, v3, v2}, Lorg/webrtc/PeerConnectionFactory;->createAudioTrack(Ljava/lang/String;Lorg/webrtc/AudioSource;)Lorg/webrtc/AudioTrack;

    move-result-object v1

    const-string v2, "createAudioTrack(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lt23/x1;->s:Lorg/webrtc/AudioTrack;

    :cond_2
    iget-object v1, p0, Lt23/x1;->s:Lorg/webrtc/AudioTrack;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public final e(Lkotlin/jvm/functions/Function1;)V
    .locals 5

    iget-object v0, p0, Lt23/x1;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lt23/x1;->q:Z

    if-eqz v1, :cond_1

    iget-object p1, p0, Lt23/x1;->i:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb23/k;

    iget-object v1, p1, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->F:Lb23/g;

    iget-object v3, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p1, Lb23/k;->b:Lb23/j;

    iget-object p1, p1, Lb23/k;->a:Ljava/lang/String;

    const-string v3, "[runOnVideoTrackIfAvailable] MediaManager already cleaned up; skipping video track operation"

    const/4 v4, 0x0

    invoke-interface {v1, v2, p1, v3, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :cond_1
    :try_start_1
    iget-object v1, p0, Lt23/x1;->n:Lorg/webrtc/VideoTrack;

    if-nez v1, :cond_2

    iget-object v1, p0, Lt23/x1;->b:Lt23/c0;

    invoke-virtual {v1}, Lt23/c0;->j()Le33/j0;

    move-result-object v1

    invoke-virtual {p0}, Lt23/x1;->c()Lorg/webrtc/VideoSource;

    move-result-object v2

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "toString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3, v2}, Le33/j0;->e(Ljava/lang/String;Lorg/webrtc/VideoSource;)Lorg/webrtc/VideoTrack;

    move-result-object v1

    iput-object v1, p0, Lt23/x1;->n:Lorg/webrtc/VideoTrack;

    :cond_2
    iget-object v1, p0, Lt23/x1;->n:Lorg/webrtc/VideoTrack;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method
