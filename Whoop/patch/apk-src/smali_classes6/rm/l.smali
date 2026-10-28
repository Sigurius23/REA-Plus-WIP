.class public final synthetic Lrm/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llo/h;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lrm/v0;


# direct methods
.method public synthetic constructor <init>(Lrm/v0;I)V
    .locals 0

    iput p2, p0, Lrm/l;->w:I

    iput-object p1, p0, Lrm/l;->x:Lrm/v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lrm/l;->w:I

    check-cast p1, Lrm/z0;

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrm/l;->x:Lrm/v0;

    iget-object v0, v0, Lrm/v0;->n:Lrm/w0;

    invoke-interface {p1, v0}, Lrm/z0;->a(Lrm/w0;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lrm/l;->x:Lrm/v0;

    invoke-static {v0}, Lrm/u;->h0(Lrm/v0;)Z

    move-result v0

    invoke-interface {p1, v0}, Lrm/z0;->onIsPlayingChanged(Z)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lrm/l;->x:Lrm/v0;

    iget v0, v0, Lrm/v0;->m:I

    invoke-interface {p1, v0}, Lrm/z0;->onPlaybackSuppressionReasonChanged(I)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lrm/l;->x:Lrm/v0;

    iget v0, v0, Lrm/v0;->e:I

    invoke-interface {p1, v0}, Lrm/z0;->onPlaybackStateChanged(I)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lrm/l;->x:Lrm/v0;

    iget-boolean v1, v0, Lrm/v0;->l:Z

    iget v0, v0, Lrm/v0;->e:I

    invoke-interface {p1, v1, v0}, Lrm/z0;->onPlayerStateChanged(ZI)V

    return-void

    :pswitch_4
    iget-object v0, p0, Lrm/l;->x:Lrm/v0;

    iget-boolean v1, v0, Lrm/v0;->g:Z

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v0, v0, Lrm/v0;->g:Z

    invoke-interface {p1, v0}, Lrm/z0;->onIsLoadingChanged(Z)V

    return-void

    :pswitch_5
    iget-object v0, p0, Lrm/l;->x:Lrm/v0;

    iget-object v0, v0, Lrm/v0;->i:Lio/x;

    iget-object v0, v0, Lio/x;->d:Lrm/q1;

    invoke-interface {p1, v0}, Lrm/z0;->r(Lrm/q1;)V

    return-void

    :pswitch_6
    iget-object v0, p0, Lrm/l;->x:Lrm/v0;

    iget-object v0, v0, Lrm/v0;->f:Lcom/google/android/exoplayer2/ExoPlaybackException;

    invoke-interface {p1, v0}, Lrm/z0;->n(Lcom/google/android/exoplayer2/PlaybackException;)V

    return-void

    :pswitch_7
    iget-object v0, p0, Lrm/l;->x:Lrm/v0;

    iget-object v0, v0, Lrm/v0;->f:Lcom/google/android/exoplayer2/ExoPlaybackException;

    invoke-interface {p1, v0}, Lrm/z0;->l(Lcom/google/android/exoplayer2/PlaybackException;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
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
