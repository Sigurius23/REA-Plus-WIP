.class public final Ljo/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrm/z0;
.implements Landroid/view/View$OnLayoutChangeListener;
.implements Landroid/view/View$OnClickListener;
.implements Ljo/r;


# instance fields
.field public final w:Lrm/m1;

.field public x:Ljava/lang/Object;

.field public final synthetic y:Lcom/google/android/exoplayer2/ui/StyledPlayerView;


# direct methods
.method public constructor <init>(Lcom/google/android/exoplayer2/ui/StyledPlayerView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljo/x;->y:Lcom/google/android/exoplayer2/ui/StyledPlayerView;

    new-instance p1, Lrm/m1;

    invoke-direct {p1}, Lrm/m1;-><init>()V

    iput-object p1, p0, Ljo/x;->w:Lrm/m1;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    sget p1, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->d0:I

    iget-object p1, p0, Ljo/x;->y:Lcom/google/android/exoplayer2/ui/StyledPlayerView;

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->g()Z

    return-void
.end method

.method public final onCues(Ljava/util/List;)V
    .locals 1

    iget-object v0, p0, Ljo/x;->y:Lcom/google/android/exoplayer2/ui/StyledPlayerView;

    iget-object v0, v0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->G:Lcom/google/android/exoplayer2/ui/SubtitleView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/ui/SubtitleView;->setCues(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    check-cast p1, Landroid/view/TextureView;

    iget-object p2, p0, Ljo/x;->y:Lcom/google/android/exoplayer2/ui/StyledPlayerView;

    iget p2, p2, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->b0:I

    invoke-static {p1, p2}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->a(Landroid/view/TextureView;I)V

    return-void
.end method

.method public final onPlayWhenReadyChanged(ZI)V
    .locals 0

    sget p1, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->d0:I

    iget-object p1, p0, Ljo/x;->y:Lcom/google/android/exoplayer2/ui/StyledPlayerView;

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->i()V

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->b()Z

    move-result p2

    if-eqz p2, :cond_1

    iget-boolean p2, p1, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->W:Z

    if-eqz p2, :cond_1

    iget-object p1, p1, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljo/s;->f()V

    :cond_0
    return-void

    :cond_1
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->c(Z)V

    return-void
.end method

.method public final onPlaybackStateChanged(I)V
    .locals 1

    sget p1, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->d0:I

    iget-object p1, p0, Ljo/x;->y:Lcom/google/android/exoplayer2/ui/StyledPlayerView;

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->i()V

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->k()V

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p1, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->W:Z

    if-eqz v0, :cond_1

    iget-object p1, p1, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljo/s;->f()V

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->c(Z)V

    return-void
.end method

.method public final onRenderedFirstFrame()V
    .locals 2

    iget-object v0, p0, Ljo/x;->y:Lcom/google/android/exoplayer2/ui/StyledPlayerView;

    iget-object v0, v0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->y:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public final p(Lrm/a1;Lrm/a1;I)V
    .locals 0

    sget p1, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->d0:I

    iget-object p1, p0, Ljo/x;->y:Lcom/google/android/exoplayer2/ui/StyledPlayerView;

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->b()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-boolean p2, p1, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->W:Z

    if-eqz p2, :cond_0

    iget-object p1, p1, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljo/s;->f()V

    :cond_0
    return-void
.end method

.method public final q(Lmo/r;)V
    .locals 0

    sget p1, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->d0:I

    iget-object p1, p0, Ljo/x;->y:Lcom/google/android/exoplayer2/ui/StyledPlayerView;

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->h()V

    return-void
.end method

.method public final r(Lrm/q1;)V
    .locals 7

    iget-object p1, p0, Ljo/x;->y:Lcom/google/android/exoplayer2/ui/StyledPlayerView;

    iget-object v0, p1, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->M:Lrm/b1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v0, Lrm/u;

    invoke-virtual {v0}, Lrm/u;->b0()Lrm/o1;

    move-result-object v1

    invoke-virtual {v1}, Lrm/o1;->p()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    iput-object v4, p0, Ljo/x;->x:Ljava/lang/Object;

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lrm/u;->B0()V

    iget-object v2, v0, Lrm/u;->K0:Lrm/v0;

    iget-object v2, v2, Lrm/v0;->i:Lio/x;

    iget-object v2, v2, Lio/x;->d:Lrm/q1;

    iget-object v2, v2, Lrm/q1;->w:Lzr/g0;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    iget-object v5, p0, Ljo/x;->w:Lrm/m1;

    if-nez v2, :cond_2

    invoke-virtual {v0}, Lrm/u;->B0()V

    iget-object v2, v0, Lrm/u;->K0:Lrm/v0;

    iget-object v2, v2, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v2}, Lrm/o1;->p()Z

    move-result v2

    if-eqz v2, :cond_1

    move v0, v3

    goto :goto_0

    :cond_1
    iget-object v0, v0, Lrm/u;->K0:Lrm/v0;

    iget-object v2, v0, Lrm/v0;->a:Lrm/o1;

    iget-object v0, v0, Lrm/v0;->b:Lsn/v;

    iget-object v0, v0, Lsn/t;->a:Ljava/lang/Object;

    invoke-virtual {v2, v0}, Lrm/o1;->b(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    const/4 v2, 0x1

    invoke-virtual {v1, v0, v5, v2}, Lrm/o1;->f(ILrm/m1;Z)Lrm/m1;

    move-result-object v0

    iget-object v0, v0, Lrm/m1;->x:Ljava/lang/Object;

    iput-object v0, p0, Ljo/x;->x:Ljava/lang/Object;

    goto :goto_1

    :cond_2
    iget-object v2, p0, Ljo/x;->x:Ljava/lang/Object;

    if-eqz v2, :cond_4

    invoke-virtual {v1, v2}, Lrm/o1;->b(Ljava/lang/Object;)I

    move-result v2

    const/4 v6, -0x1

    if-eq v2, v6, :cond_3

    invoke-virtual {v1, v2, v5, v3}, Lrm/o1;->f(ILrm/m1;Z)Lrm/m1;

    move-result-object v1

    iget v1, v1, Lrm/m1;->y:I

    invoke-virtual {v0}, Lrm/u;->Y()I

    move-result v0

    if-ne v0, v1, :cond_3

    return-void

    :cond_3
    iput-object v4, p0, Ljo/x;->x:Ljava/lang/Object;

    :cond_4
    :goto_1
    invoke-virtual {p1, v3}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->l(Z)V

    return-void
.end method
