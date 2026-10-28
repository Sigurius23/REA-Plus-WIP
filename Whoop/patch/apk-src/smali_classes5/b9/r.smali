.class public final synthetic Lb9/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx8/f;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lb9/c1;


# direct methods
.method public synthetic constructor <init>(Lb9/c1;I)V
    .locals 0

    iput p2, p0, Lb9/r;->w:I

    iput-object p1, p0, Lb9/r;->x:Lb9/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lb9/r;->w:I

    check-cast p1, Lu8/h0;

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb9/r;->x:Lb9/c1;

    iget-object v0, v0, Lb9/c1;->f:Landroidx/media3/exoplayer/ExoPlaybackException;

    invoke-interface {p1, v0}, Lu8/h0;->onPlayerError(Landroidx/media3/common/PlaybackException;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lb9/r;->x:Lb9/c1;

    iget-object v0, v0, Lb9/c1;->f:Landroidx/media3/exoplayer/ExoPlaybackException;

    invoke-interface {p1, v0}, Lu8/h0;->onPlayerErrorChanged(Landroidx/media3/common/PlaybackException;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lb9/r;->x:Lb9/c1;

    iget-object v0, v0, Lb9/c1;->o:Lu8/e0;

    invoke-interface {p1, v0}, Lu8/h0;->onPlaybackParametersChanged(Lu8/e0;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lb9/r;->x:Lb9/c1;

    invoke-virtual {v0}, Lb9/c1;->l()Z

    move-result v0

    invoke-interface {p1, v0}, Lu8/h0;->onIsPlayingChanged(Z)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lb9/r;->x:Lb9/c1;

    iget v0, v0, Lb9/c1;->n:I

    invoke-interface {p1, v0}, Lu8/h0;->onPlaybackSuppressionReasonChanged(I)V

    return-void

    :pswitch_4
    iget-object v0, p0, Lb9/r;->x:Lb9/c1;

    iget-boolean v1, v0, Lb9/c1;->l:Z

    iget v0, v0, Lb9/c1;->m:I

    invoke-interface {p1, v1, v0}, Lu8/h0;->onPlayWhenReadyChanged(ZI)V

    return-void

    :pswitch_5
    iget-object v0, p0, Lb9/r;->x:Lb9/c1;

    iget v0, v0, Lb9/c1;->e:I

    invoke-interface {p1, v0}, Lu8/h0;->onPlaybackStateChanged(I)V

    return-void

    :pswitch_6
    iget-object v0, p0, Lb9/r;->x:Lb9/c1;

    iget-boolean v1, v0, Lb9/c1;->l:Z

    iget v0, v0, Lb9/c1;->e:I

    invoke-interface {p1, v1, v0}, Lu8/h0;->onPlayerStateChanged(ZI)V

    return-void

    :pswitch_7
    iget-object v0, p0, Lb9/r;->x:Lb9/c1;

    iget-boolean v1, v0, Lb9/c1;->g:Z

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v0, v0, Lb9/c1;->g:Z

    invoke-interface {p1, v0}, Lu8/h0;->onIsLoadingChanged(Z)V

    return-void

    :pswitch_8
    iget-object v0, p0, Lb9/r;->x:Lb9/c1;

    iget-object v0, v0, Lb9/c1;->i:Lo9/v;

    iget-object v0, v0, Lo9/v;->d:Lu8/v0;

    invoke-interface {p1, v0}, Lu8/h0;->onTracksChanged(Lu8/v0;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
