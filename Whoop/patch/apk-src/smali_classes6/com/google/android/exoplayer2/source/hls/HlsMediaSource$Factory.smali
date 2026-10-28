.class public final Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsn/u;


# instance fields
.field public final a:Lty/c;

.field public final b:Lvn/c;

.field public final c:Lt9/c0;

.field public final d:Lux/f0;

.field public final e:Lng3/n;

.field public final f:Lf93/a;

.field public final g:Lg73/d;

.field public final h:Z

.field public final i:I

.field public final j:J


# direct methods
.method public constructor <init>(Lko/k;)V
    .locals 2

    new-instance v0, Lty/c;

    const/16 v1, 0xd

    invoke-direct {v0, p1, v1}, Lty/c;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->a:Lty/c;

    new-instance p1, Lf93/a;

    const/4 v0, 0x6

    invoke-direct {p1, v0}, Lf93/a;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->f:Lf93/a;

    new-instance p1, Lt9/c0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->c:Lt9/c0;

    sget-object p1, Lwn/c;->O:Lux/f0;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->d:Lux/f0;

    sget-object p1, Lvn/i;->a:Lvn/c;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->b:Lvn/c;

    new-instance p1, Lg73/d;

    const/16 v0, 0x11

    invoke-direct {p1, v0}, Lg73/d;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->g:Lg73/d;

    new-instance p1, Lng3/n;

    const/16 v0, 0x19

    invoke-direct {p1, v0}, Lng3/n;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->e:Lng3/n;

    const/4 p1, 0x1

    iput p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->i:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->j:J

    iput-boolean p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->h:Z

    return-void
.end method


# virtual methods
.method public final a(Lrm/k0;)Lsn/a;
    .locals 12

    iget-object v0, p1, Lrm/k0;->x:Lrm/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p1, Lrm/k0;->x:Lrm/i0;

    iget-object v0, v0, Lrm/i0;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    iget-object v3, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->c:Lt9/c0;

    if-nez v2, :cond_0

    new-instance v2, Lt9/u;

    invoke-direct {v2, v3, v0}, Lt9/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v3, v2

    :cond_0
    new-instance v0, Lvn/l;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->f:Lf93/a;

    invoke-virtual {v2, p1}, Lf93/a;->d(Lrm/k0;)Lvm/h;

    move-result-object v5

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->d:Lux/f0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v7, Lwn/c;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->a:Lty/c;

    iget-object v6, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->g:Lg73/d;

    invoke-direct {v7, v2, v6, v3}, Lwn/c;-><init>(Lty/c;Lg73/d;Lwn/p;)V

    iget-boolean v10, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->h:Z

    iget v11, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->i:I

    iget-object v3, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->b:Lvn/c;

    iget-object v4, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->e:Lng3/n;

    iget-wide v8, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->j:J

    move-object v1, p1

    invoke-direct/range {v0 .. v11}, Lvn/l;-><init>(Lrm/k0;Lty/c;Lvn/c;Lng3/n;Lvm/h;Lg73/d;Lwn/c;JZI)V

    return-object v0
.end method
