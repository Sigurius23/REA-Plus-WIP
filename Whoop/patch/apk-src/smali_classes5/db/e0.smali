.class public final Ldb/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu8/h0;
.implements Landroid/view/View$OnClickListener;
.implements Ldb/w;
.implements Ldb/n;


# instance fields
.field public final w:Lu8/m0;

.field public x:Ljava/lang/Object;

.field public final synthetic y:Landroidx/media3/ui/PlayerView;


# direct methods
.method public constructor <init>(Landroidx/media3/ui/PlayerView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldb/e0;->y:Landroidx/media3/ui/PlayerView;

    new-instance p1, Lu8/m0;

    invoke-direct {p1}, Lu8/m0;-><init>()V

    iput-object p1, p0, Ldb/e0;->w:Lu8/m0;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    sget p1, Landroidx/media3/ui/PlayerView;->j0:I

    iget-object p1, p0, Ldb/e0;->y:Landroidx/media3/ui/PlayerView;

    invoke-virtual {p1}, Landroidx/media3/ui/PlayerView;->j()V

    return-void
.end method

.method public final onCues(Lw8/c;)V
    .locals 1

    iget-object v0, p0, Ldb/e0;->y:Landroidx/media3/ui/PlayerView;

    iget-object v0, v0, Landroidx/media3/ui/PlayerView;->I:Landroidx/media3/ui/SubtitleView;

    if-eqz v0, :cond_0

    iget-object p1, p1, Lw8/c;->a:Lzr/g0;

    invoke-virtual {v0, p1}, Landroidx/media3/ui/SubtitleView;->setCues(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public final onPlayWhenReadyChanged(ZI)V
    .locals 0

    sget p1, Landroidx/media3/ui/PlayerView;->j0:I

    iget-object p1, p0, Ldb/e0;->y:Landroidx/media3/ui/PlayerView;

    invoke-virtual {p1}, Landroidx/media3/ui/PlayerView;->l()V

    invoke-virtual {p1}, Landroidx/media3/ui/PlayerView;->e()Z

    move-result p2

    if-eqz p2, :cond_1

    iget-boolean p2, p1, Landroidx/media3/ui/PlayerView;->g0:Z

    if-eqz p2, :cond_1

    iget-object p1, p1, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ldb/x;->f()V

    :cond_0
    return-void

    :cond_1
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroidx/media3/ui/PlayerView;->f(Z)V

    return-void
.end method

.method public final onPlaybackStateChanged(I)V
    .locals 1

    sget p1, Landroidx/media3/ui/PlayerView;->j0:I

    iget-object p1, p0, Ldb/e0;->y:Landroidx/media3/ui/PlayerView;

    invoke-virtual {p1}, Landroidx/media3/ui/PlayerView;->l()V

    invoke-virtual {p1}, Landroidx/media3/ui/PlayerView;->n()V

    invoke-virtual {p1}, Landroidx/media3/ui/PlayerView;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p1, Landroidx/media3/ui/PlayerView;->g0:Z

    if-eqz v0, :cond_1

    iget-object p1, p1, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ldb/x;->f()V

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/media3/ui/PlayerView;->f(Z)V

    return-void
.end method

.method public final onPositionDiscontinuity(Lu8/i0;Lu8/i0;I)V
    .locals 0

    sget p1, Landroidx/media3/ui/PlayerView;->j0:I

    iget-object p1, p0, Ldb/e0;->y:Landroidx/media3/ui/PlayerView;

    invoke-virtual {p1}, Landroidx/media3/ui/PlayerView;->e()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-boolean p2, p1, Landroidx/media3/ui/PlayerView;->g0:Z

    if-eqz p2, :cond_0

    iget-object p1, p1, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ldb/x;->f()V

    :cond_0
    return-void
.end method

.method public final onRenderedFirstFrame()V
    .locals 3

    iget-object v0, p0, Ldb/e0;->y:Landroidx/media3/ui/PlayerView;

    iget-object v1, v0, Landroidx/media3/ui/PlayerView;->y:Landroid/view/View;

    if-eqz v1, :cond_1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Landroidx/media3/ui/PlayerView;->G:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void

    :cond_0
    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->d()V

    :cond_1
    return-void
.end method

.method public final onSurfaceSizeChanged(II)V
    .locals 4

    iget-object p1, p0, Ldb/e0;->y:Landroidx/media3/ui/PlayerView;

    iget-object p2, p1, Landroidx/media3/ui/PlayerView;->z:Landroid/view/View;

    sget v0, Lx8/t;->a:I

    const/16 v1, 0x22

    if-ne v0, v1, :cond_0

    instance-of v0, p2, Landroid/view/SurfaceView;

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Landroidx/media3/ui/PlayerView;->i0:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroidx/media3/ui/PlayerView;->F:Ldb/h0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p1, Landroidx/media3/ui/PlayerView;->O:Landroid/os/Handler;

    check-cast p2, Landroid/view/SurfaceView;

    new-instance v2, Landroidx/fragment/app/m;

    const/16 v3, 0x16

    invoke-direct {v2, p1, v3}, Landroidx/fragment/app/m;-><init>(Ljava/lang/Object;I)V

    new-instance p1, Landroidx/fragment/app/d;

    const/4 v3, 0x5

    invoke-direct {p1, v0, p2, v2, v3}, Landroidx/fragment/app/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v1, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final onTracksChanged(Lu8/v0;)V
    .locals 7

    iget-object p1, p0, Ldb/e0;->y:Landroidx/media3/ui/PlayerView;

    iget-object v0, p1, Landroidx/media3/ui/PlayerView;->S:Lu8/j0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v1, v0

    check-cast v1, La2/a;

    const/16 v2, 0x11

    invoke-virtual {v1, v2}, La2/a;->A(I)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lb9/f0;

    invoke-virtual {v2}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v2

    goto :goto_0

    :cond_0
    sget-object v2, Lu8/o0;->a:Lu8/l0;

    :goto_0
    invoke-virtual {v2}, Lu8/o0;->p()Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v3, :cond_1

    iput-object v5, p0, Ldb/e0;->x:Ljava/lang/Object;

    goto :goto_2

    :cond_1
    const/16 v3, 0x1e

    invoke-virtual {v1, v3}, La2/a;->A(I)Z

    move-result v1

    iget-object v3, p0, Ldb/e0;->w:Lu8/m0;

    if-eqz v1, :cond_3

    move-object v1, v0

    check-cast v1, Lb9/f0;

    invoke-virtual {v1}, Lb9/f0;->d0()Lu8/v0;

    move-result-object v6

    iget-object v6, v6, Lu8/v0;->a:Lzr/g0;

    invoke-virtual {v6}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_3

    invoke-virtual {v1}, Lb9/f0;->L0()V

    iget-object v0, v1, Lb9/f0;->I0:Lb9/c1;

    iget-object v0, v0, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v0}, Lu8/o0;->p()Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v4

    goto :goto_1

    :cond_2
    iget-object v0, v1, Lb9/f0;->I0:Lb9/c1;

    iget-object v1, v0, Lb9/c1;->a:Lu8/o0;

    iget-object v0, v0, Lb9/c1;->b:Ll9/c0;

    iget-object v0, v0, Ll9/c0;->a:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Lu8/o0;->b(Ljava/lang/Object;)I

    move-result v0

    :goto_1
    const/4 v1, 0x1

    invoke-virtual {v2, v0, v3, v1}, Lu8/o0;->f(ILu8/m0;Z)Lu8/m0;

    move-result-object v0

    iget-object v0, v0, Lu8/m0;->b:Ljava/lang/Object;

    iput-object v0, p0, Ldb/e0;->x:Ljava/lang/Object;

    goto :goto_2

    :cond_3
    iget-object v1, p0, Ldb/e0;->x:Ljava/lang/Object;

    if-eqz v1, :cond_5

    invoke-virtual {v2, v1}, Lu8/o0;->b(Ljava/lang/Object;)I

    move-result v1

    const/4 v6, -0x1

    if-eq v1, v6, :cond_4

    invoke-virtual {v2, v1, v3, v4}, Lu8/o0;->f(ILu8/m0;Z)Lu8/m0;

    move-result-object v1

    iget v1, v1, Lu8/m0;->c:I

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->Z()I

    move-result v0

    if-ne v0, v1, :cond_4

    return-void

    :cond_4
    iput-object v5, p0, Ldb/e0;->x:Ljava/lang/Object;

    :cond_5
    :goto_2
    invoke-virtual {p1, v4}, Landroidx/media3/ui/PlayerView;->o(Z)V

    return-void
.end method

.method public final onVideoSizeChanged(Lu8/y0;)V
    .locals 2

    sget-object v0, Lu8/y0;->d:Lu8/y0;

    invoke-virtual {p1, v0}, Lu8/y0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Ldb/e0;->y:Landroidx/media3/ui/PlayerView;

    iget-object v0, p1, Landroidx/media3/ui/PlayerView;->S:Lu8/j0;

    if-eqz v0, :cond_1

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->i0()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/media3/ui/PlayerView;->k()V

    :cond_1
    :goto_0
    return-void
.end method
