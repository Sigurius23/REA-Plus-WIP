.class public Landroid/support/v4/media/session/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/media/session/MediaController;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/HashMap;

.field public final e:Landroid/support/v4/media/session/MediaSessionCompat$Token;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroid/support/v4/media/session/f;->b:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/media/session/f;->c:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroid/support/v4/media/session/f;->d:Ljava/util/HashMap;

    iput-object p2, p0, Landroid/support/v4/media/session/f;->e:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    new-instance v0, Landroid/media/session/MediaController;

    iget-object v1, p2, Landroid/support/v4/media/session/MediaSessionCompat$Token;->x:Ljava/lang/Object;

    check-cast v1, Landroid/media/session/MediaSession$Token;

    invoke-direct {v0, p1, v1}, Landroid/media/session/MediaController;-><init>(Landroid/content/Context;Landroid/media/session/MediaSession$Token;)V

    iput-object v0, p0, Landroid/support/v4/media/session/f;->a:Landroid/media/session/MediaController;

    iget-object p1, p2, Landroid/support/v4/media/session/MediaSessionCompat$Token;->w:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object p2, p2, Landroid/support/v4/media/session/MediaSessionCompat$Token;->y:Landroid/support/v4/media/session/d;

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p2, :cond_0

    const-string p1, "android.support.v4.media.session.command.GET_EXTRA_BINDER"

    new-instance p2, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;

    const/4 v1, 0x0

    invoke-direct {p2, v1}, Landroid/os/ResultReceiver;-><init>(Landroid/os/Handler;)V

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v2, p2, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;->w:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, p1, v1, p2}, Landroid/media/session/MediaController;->sendCommand(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p2

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p2
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/media/session/f;->c:Ljava/util/ArrayList;

    iget-object v1, p0, Landroid/support/v4/media/session/f;->e:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    iget-object v2, v1, Landroid/support/v4/media/session/MediaSessionCompat$Token;->w:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v1, v1, Landroid/support/v4/media/session/MediaSessionCompat$Token;->y:Landroid/support/v4/media/session/d;

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Landroid/support/v4/media/session/e;

    invoke-direct {v0}, Landroid/support/v4/media/session/e;-><init>()V

    iget-object v1, p0, Landroid/support/v4/media/session/f;->d:Ljava/util/HashMap;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    throw v2

    :cond_2
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
