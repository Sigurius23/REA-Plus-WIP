.class public final synthetic Lab/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/r;
.implements Lyr/e;
.implements Lx8/f;
.implements Lbc/v;
.implements Lx8/g;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lab/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lb3/d2;)V
    .locals 0

    .line 2
    const/4 p1, 0x5

    iput p1, p0, Lab/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lu8/n;)V
    .locals 0

    check-cast p1, Lc9/b;

    return-void
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lc9/h;

    check-cast p1, Lx8/p;

    invoke-direct {v0, p1}, Lc9/h;-><init>(Lx8/p;)V

    return-object v0
.end method

.method public b(Lbc/u;Lbc/w;Z)V
    .locals 0

    iget p3, p0, Lab/a;->w:I

    packed-switch p3, :pswitch_data_0

    invoke-interface {p1}, Lbc/u;->e()V

    return-void

    :pswitch_0
    invoke-interface {p1}, Lbc/u;->a()V

    return-void

    :pswitch_1
    invoke-interface {p1, p2}, Lbc/u;->d(Lbc/w;)V

    return-void

    :pswitch_2
    invoke-interface {p1, p2}, Lbc/u;->c(Lbc/w;)V

    return-void

    :pswitch_3
    invoke-interface {p1, p2}, Lbc/u;->f(Lbc/w;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public d()[Lt9/n;
    .locals 6

    iget v0, p0, Lab/a;->w:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lbb/d;

    invoke-direct {v0}, Lbb/d;-><init>()V

    new-array v1, v1, [Lt9/n;

    aput-object v0, v1, v2

    return-object v1

    :pswitch_0
    new-instance v0, Lab/j0;

    new-instance v3, Lx8/s;

    const-wide/16 v4, 0x0

    invoke-direct {v3, v4, v5}, Lx8/s;-><init>(J)V

    new-instance v4, Lab/g;

    sget-object v5, Lzr/g0;->x:Lzr/e0;

    sget-object v5, Lzr/w0;->E:Lzr/w0;

    invoke-direct {v4, v5, v2}, Lab/g;-><init>(Ljava/util/List;I)V

    sget-object v5, Lqa/j;->p:Lng3/o;

    invoke-direct {v0, v1, v5, v3, v4}, Lab/j0;-><init>(ILqa/j;Lx8/s;Lab/g;)V

    new-array v1, v1, [Lt9/n;

    aput-object v0, v1, v2

    return-object v1

    :pswitch_1
    new-instance v0, Lab/d0;

    invoke-direct {v0}, Lab/d0;-><init>()V

    new-array v1, v1, [Lt9/n;

    aput-object v0, v1, v2

    return-object v1

    :pswitch_2
    new-instance v0, Lab/e;

    invoke-direct {v0, v2}, Lab/e;-><init>(I)V

    new-array v1, v1, [Lt9/n;

    aput-object v0, v1, v2

    return-object v1

    :pswitch_3
    new-instance v0, Lab/d;

    invoke-direct {v0}, Lab/d;-><init>()V

    new-array v1, v1, [Lt9/n;

    aput-object v0, v1, v2

    return-object v1

    :pswitch_4
    new-instance v0, Lab/b;

    invoke-direct {v0}, Lab/b;-><init>()V

    new-array v1, v1, [Lt9/n;

    aput-object v0, v1, v2

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 4

    iget v0, p0, Lab/a;->w:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    check-cast p1, Lc9/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :pswitch_1
    check-cast p1, Lc9/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :pswitch_2
    check-cast p1, Lc9/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :pswitch_3
    check-cast p1, Lc9/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :pswitch_4
    check-cast p1, Lc9/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :pswitch_5
    check-cast p1, Lc9/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :pswitch_6
    check-cast p1, Lc9/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :pswitch_7
    check-cast p1, Lc9/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :pswitch_8
    check-cast p1, Lc9/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :pswitch_9
    check-cast p1, Lc9/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :pswitch_a
    check-cast p1, Lc9/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :pswitch_b
    check-cast p1, Lc9/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :pswitch_c
    check-cast p1, Lc9/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :pswitch_d
    check-cast p1, Lc9/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :pswitch_e
    check-cast p1, Lu8/h0;

    invoke-interface {p1}, Lu8/h0;->onRenderedFirstFrame()V

    return-void

    :pswitch_f
    check-cast p1, Lu8/h0;

    new-instance v0, Landroidx/media3/exoplayer/ExoTimeoutException;

    const-string v1, "Player release timed out."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    new-instance v1, Landroidx/media3/exoplayer/ExoPlaybackException;

    const/4 v2, 0x2

    const/16 v3, 0x3eb

    invoke-direct {v1, v2, v0, v3}, Landroidx/media3/exoplayer/ExoPlaybackException;-><init>(ILjava/lang/Exception;I)V

    invoke-interface {p1, v1}, Lu8/h0;->onPlayerError(Landroidx/media3/common/PlaybackException;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_f
        :pswitch_e
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
