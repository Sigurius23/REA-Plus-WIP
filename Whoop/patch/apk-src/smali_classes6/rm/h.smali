.class public final Lrm/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lko/o;

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:I

.field public final g:J

.field public h:I

.field public i:Z


# direct methods
.method public constructor <init>()V
    .locals 9

    new-instance v0, Lko/o;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lko/o;-><init>(I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v1, 0x9c4

    const/4 v2, 0x0

    const-string v3, "bufferForPlaybackMs"

    const-string v4, "0"

    invoke-static {v1, v2, v3, v4}, Lrm/h;->a(IILjava/lang/String;Ljava/lang/String;)V

    const/16 v5, 0x1388

    const-string v6, "bufferForPlaybackAfterRebufferMs"

    invoke-static {v5, v2, v6, v4}, Lrm/h;->a(IILjava/lang/String;Ljava/lang/String;)V

    const v7, 0xc350

    const-string v8, "minBufferMs"

    invoke-static {v7, v1, v8, v3}, Lrm/h;->a(IILjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7, v5, v8, v6}, Lrm/h;->a(IILjava/lang/String;Ljava/lang/String;)V

    const-string v3, "maxBufferMs"

    invoke-static {v7, v7, v3, v8}, Lrm/h;->a(IILjava/lang/String;Ljava/lang/String;)V

    const-string v3, "backBufferDurationMs"

    invoke-static {v2, v2, v3, v4}, Lrm/h;->a(IILjava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lrm/h;->a:Lko/o;

    int-to-long v3, v7

    invoke-static {v3, v4}, Llo/y;->z(J)J

    move-result-wide v6

    iput-wide v6, p0, Lrm/h;->b:J

    invoke-static {v3, v4}, Llo/y;->z(J)J

    move-result-wide v3

    iput-wide v3, p0, Lrm/h;->c:J

    int-to-long v0, v1

    invoke-static {v0, v1}, Llo/y;->z(J)J

    move-result-wide v0

    iput-wide v0, p0, Lrm/h;->d:J

    int-to-long v0, v5

    invoke-static {v0, v1}, Llo/y;->z(J)J

    move-result-wide v0

    iput-wide v0, p0, Lrm/h;->e:J

    const/4 v0, -0x1

    iput v0, p0, Lrm/h;->f:I

    const/high16 v0, 0xc80000

    iput v0, p0, Lrm/h;->h:I

    int-to-long v0, v2

    invoke-static {v0, v1}, Llo/y;->z(J)J

    move-result-wide v0

    iput-wide v0, p0, Lrm/h;->g:J

    return-void
.end method

.method public static a(IILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-lt p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    add-int/lit8 p1, p1, 0x15

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, p1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " cannot be less than "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Llo/a;->f(ZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final b(Z)V
    .locals 2

    iget v0, p0, Lrm/h;->f:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/high16 v0, 0xc80000

    :cond_0
    iput v0, p0, Lrm/h;->h:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lrm/h;->i:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lrm/h;->a:Lko/o;

    monitor-enter p1

    :try_start_0
    iget-boolean v1, p1, Lko/o;->b:Z

    if-eqz v1, :cond_1

    invoke-virtual {p1, v0}, Lko/o;->a(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit p1

    return-void

    :goto_1
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_2
    return-void
.end method
