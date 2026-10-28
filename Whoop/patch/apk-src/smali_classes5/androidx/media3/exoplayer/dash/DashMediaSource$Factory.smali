.class public final Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/b0;


# instance fields
.field public final a:Lab/h0;

.field public final b:Lz8/e;

.field public final c:Lg9/b;

.field public final d:Lg73/a;

.field public final e:Ljc/b;

.field public final f:J

.field public final g:J


# direct methods
.method public constructor <init>(Lz8/e;)V
    .locals 3

    new-instance v0, Lab/h0;

    invoke-direct {v0, p1}, Lab/h0;-><init>(Lz8/e;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->a:Lab/h0;

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->b:Lz8/e;

    new-instance p1, Lg9/b;

    invoke-direct {p1}, Lg9/b;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->c:Lg9/b;

    new-instance p1, Ljc/b;

    const/16 v1, 0x11

    invoke-direct {p1, v1}, Ljc/b;-><init>(I)V

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->e:Ljc/b;

    const-wide/16 v1, 0x7530

    iput-wide v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->f:J

    const-wide/32 v1, 0x4c4b40

    iput-wide v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->g:J

    new-instance p1, Lg73/a;

    const/16 v1, 0x13

    invoke-direct {p1, v1}, Lg73/a;-><init>(I)V

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->d:Lg73/a;

    iget-object p1, v0, Lab/h0;->z:Ljava/lang/Object;

    check-cast p1, Lcom/iterable/iterableapi/g1;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/iterable/iterableapi/g1;->w:Z

    return-void
.end method


# virtual methods
.method public final a(Ljc/b;)V
    .locals 1

    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->a:Lab/h0;

    iget-object v0, v0, Lab/h0;->z:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/g1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, v0, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    return-void
.end method

.method public final b(Lu8/x;)Ll9/a;
    .locals 12

    iget-object v0, p1, Lu8/x;->b:Lu8/u;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lf9/e;

    invoke-direct {v0}, Lf9/e;-><init>()V

    iget-object v2, p1, Lu8/x;->b:Lu8/u;

    iget-object v2, v2, Lu8/u;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    new-instance v3, Lio/sentry/internal/debugmeta/c;

    const/16 v4, 0x16

    invoke-direct {v3, v4, v0, v2}, Lio/sentry/internal/debugmeta/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    move-object v3, v0

    :goto_0
    new-instance v0, Le9/h;

    iget-object v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->c:Lg9/b;

    invoke-virtual {v2, p1}, Lg9/b;->b(Lu8/x;)Lg9/h;

    move-result-object v6

    iget-wide v8, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->f:J

    iget-wide v10, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->g:J

    iget-object v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->b:Lz8/e;

    iget-object v4, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->a:Lab/h0;

    iget-object v5, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->d:Lg73/a;

    iget-object v7, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->e:Ljc/b;

    move-object v1, p1

    invoke-direct/range {v0 .. v11}, Le9/h;-><init>(Lu8/x;Lz8/e;Lp9/m;Lab/h0;Lg73/a;Lg9/h;Ljc/b;JJ)V

    return-object v0
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->a:Lab/h0;

    iget-object v0, v0, Lab/h0;->z:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/g1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final d(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->a:Lab/h0;

    iget-object v0, v0, Lab/h0;->z:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/g1;

    iput-boolean p1, v0, Lcom/iterable/iterableapi/g1;->w:Z

    return-void
.end method
