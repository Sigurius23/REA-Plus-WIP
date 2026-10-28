.class public final Lch3/p0;
.super Lxg3/s;
.source "SourceFile"


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Lxg3/s;


# direct methods
.method public constructor <init>(Lch3/o0;Lch3/o0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lch3/p0;->E:I

    .line 2
    iput-object p2, p0, Lch3/p0;->F:Lxg3/s;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lxg3/s;-><init>(Lxg3/s;Z)V

    return-void
.end method

.method public synthetic constructor <init>(Lxg3/s;I)V
    .locals 0

    .line 1
    iput p2, p0, Lch3/p0;->E:I

    iput-object p1, p0, Lch3/p0;->F:Lxg3/s;

    invoke-direct {p0}, Lxg3/s;-><init>()V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 2

    iget v0, p0, Lch3/p0;->E:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Lxg3/s;->d()V

    return-void

    :pswitch_0
    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p0, v0, v1}, Lxg3/s;->e(J)V

    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public f(Lxg3/i;)V
    .locals 1

    iget v0, p0, Lch3/p0;->E:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Lxg3/s;->f(Lxg3/i;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lch3/p0;->F:Lxg3/s;

    check-cast v0, Lch3/q0;

    iget-object v0, v0, Lch3/q0;->H:Ldh3/a;

    invoke-virtual {v0, p1}, Ldh3/a;->c(Lxg3/i;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onCompleted()V
    .locals 2

    iget v0, p0, Lch3/p0;->E:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch3/p0;->F:Lxg3/s;

    check-cast v0, Lch3/p0;

    invoke-virtual {v0}, Lch3/p0;->onCompleted()V

    return-void

    :pswitch_0
    iget-object v0, p0, Lch3/p0;->F:Lxg3/s;

    check-cast v0, Lch3/o0;

    :try_start_0
    invoke-virtual {v0}, Lch3/o0;->onCompleted()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lxg3/s;->b()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lxg3/s;->b()V

    throw v1

    :pswitch_1
    iget-object v0, p0, Lch3/p0;->F:Lxg3/s;

    check-cast v0, Lch3/q0;

    iget-object v0, v0, Lch3/q0;->G:Lxg3/s;

    invoke-interface {v0}, Lxg3/h;->onCompleted()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    iget v0, p0, Lch3/p0;->E:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch3/p0;->F:Lxg3/s;

    check-cast v0, Lch3/p0;

    invoke-virtual {v0, p1}, Lch3/p0;->onError(Ljava/lang/Throwable;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lch3/p0;->F:Lxg3/s;

    check-cast v0, Lch3/o0;

    :try_start_0
    invoke-virtual {v0, p1}, Lch3/o0;->onError(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lxg3/s;->b()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Lxg3/s;->b()V

    throw p1

    :pswitch_1
    iget-object v0, p0, Lch3/p0;->F:Lxg3/s;

    check-cast v0, Lch3/q0;

    iget-object v0, v0, Lch3/q0;->G:Lxg3/s;

    invoke-interface {v0, p1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lch3/p0;->E:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Lxg3/s;->onNext(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lch3/p0;->F:Lxg3/s;

    check-cast v0, Lch3/o0;

    invoke-virtual {v0, p1}, Lch3/o0;->onNext(Ljava/lang/Object;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lch3/p0;->F:Lxg3/s;

    check-cast v0, Lch3/q0;

    iget-object v0, v0, Lch3/q0;->G:Lxg3/s;

    invoke-interface {v0, p1}, Lxg3/h;->onNext(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
