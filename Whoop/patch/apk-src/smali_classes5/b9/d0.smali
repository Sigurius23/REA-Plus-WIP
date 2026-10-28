.class public final Lb9/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr9/m;
.implements Ls9/a;
.implements Lb9/e1;


# instance fields
.field public w:Lr9/m;

.field public x:Ls9/a;

.field public y:Lr9/m;

.field public z:Ls9/a;


# virtual methods
.method public final a(ILjava/lang/Object;)V
    .locals 1

    const/4 v0, 0x7

    if-eq p1, v0, :cond_3

    const/16 v0, 0x8

    if-eq p1, v0, :cond_2

    const/16 v0, 0x2710

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    check-cast p2, Ls9/i;

    if-nez p2, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lb9/d0;->y:Lr9/m;

    iput-object p1, p0, Lb9/d0;->z:Ls9/a;

    return-void

    :cond_1
    invoke-virtual {p2}, Ls9/i;->getVideoFrameMetadataListener()Lr9/m;

    move-result-object p1

    iput-object p1, p0, Lb9/d0;->y:Lr9/m;

    invoke-virtual {p2}, Ls9/i;->getCameraMotionListener()Ls9/a;

    move-result-object p1

    iput-object p1, p0, Lb9/d0;->z:Ls9/a;

    return-void

    :cond_2
    check-cast p2, Ls9/a;

    iput-object p2, p0, Lb9/d0;->x:Ls9/a;

    return-void

    :cond_3
    check-cast p2, Lr9/m;

    iput-object p2, p0, Lb9/d0;->w:Lr9/m;

    return-void
.end method

.method public final b(J[F)V
    .locals 1

    iget-object v0, p0, Lb9/d0;->z:Ls9/a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Ls9/a;->b(J[F)V

    :cond_0
    iget-object v0, p0, Lb9/d0;->x:Ls9/a;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2, p3}, Ls9/a;->b(J[F)V

    :cond_1
    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Lb9/d0;->z:Ls9/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ls9/a;->c()V

    :cond_0
    iget-object v0, p0, Lb9/d0;->x:Ls9/a;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ls9/a;->c()V

    :cond_1
    return-void
.end method

.method public final d(JJLu8/p;Landroid/media/MediaFormat;)V
    .locals 8

    iget-object v0, p0, Lb9/d0;->y:Lr9/m;

    if-eqz v0, :cond_0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lr9/m;->d(JJLu8/p;Landroid/media/MediaFormat;)V

    move-object v7, v6

    move-object v6, v5

    move-wide v4, v3

    move-wide v2, v1

    goto :goto_0

    :cond_0
    move-wide v2, p1

    move-wide v4, p3

    move-object v6, p5

    move-object v7, p6

    :goto_0
    iget-object v1, p0, Lb9/d0;->w:Lr9/m;

    if-eqz v1, :cond_1

    invoke-interface/range {v1 .. v7}, Lr9/m;->d(JJLu8/p;Landroid/media/MediaFormat;)V

    :cond_1
    return-void
.end method
