.class public Landroid/support/v4/media/session/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/media/session/j;


# instance fields
.field public final a:Landroid/media/session/MediaSession;

.field public final b:Landroid/support/v4/media/session/MediaSessionCompat$Token;

.field public final c:Ljava/lang/Object;

.field public final d:Landroid/os/RemoteCallbackList;

.field public e:Landroid/support/v4/media/session/PlaybackStateCompat;

.field public f:Landroid/support/v4/media/MediaMetadataCompat;

.field public g:La00/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroid/support/v4/media/session/l;->c:Ljava/lang/Object;

    new-instance v0, Landroid/os/RemoteCallbackList;

    invoke-direct {v0}, Landroid/os/RemoteCallbackList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/media/session/l;->d:Landroid/os/RemoteCallbackList;

    invoke-virtual {p0, p1, p2}, Landroid/support/v4/media/session/l;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/media/session/MediaSession;

    move-result-object p1

    iput-object p1, p0, Landroid/support/v4/media/session/l;->a:Landroid/media/session/MediaSession;

    new-instance p2, Landroid/support/v4/media/session/k;

    invoke-direct {p2, p0}, Landroid/support/v4/media/session/k;-><init>(Landroid/support/v4/media/session/l;)V

    new-instance v0, Landroid/support/v4/media/session/MediaSessionCompat$Token;

    invoke-virtual {p1}, Landroid/media/session/MediaSession;->getSessionToken()Landroid/media/session/MediaSession$Token;

    move-result-object v1

    invoke-direct {v0, v1, p2}, Landroid/support/v4/media/session/MediaSessionCompat$Token;-><init>(Ljava/lang/Object;Landroid/support/v4/media/session/k;)V

    iput-object v0, p0, Landroid/support/v4/media/session/l;->b:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Landroid/media/session/MediaSession;->setFlags(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr8/a;)V
    .locals 0

    return-void
.end method

.method public final b()La00/g;
    .locals 2

    iget-object v0, p0, Landroid/support/v4/media/session/l;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroid/support/v4/media/session/l;->g:La00/g;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public c(Landroid/content/Context;Ljava/lang/String;)Landroid/media/session/MediaSession;
    .locals 1

    new-instance v0, Landroid/media/session/MediaSession;

    invoke-direct {v0, p1, p2}, Landroid/media/session/MediaSession;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0
.end method
