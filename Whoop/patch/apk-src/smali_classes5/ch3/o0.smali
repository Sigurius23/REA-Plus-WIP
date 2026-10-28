.class public final Lch3/o0;
.super Lxg3/s;
.source "SourceFile"


# instance fields
.field public final synthetic E:I

.field public final F:Lxg3/h;


# direct methods
.method public synthetic constructor <init>(Lxg3/h;I)V
    .locals 0

    .line 1
    iput p2, p0, Lch3/o0;->E:I

    invoke-direct {p0}, Lxg3/s;-><init>()V

    iput-object p1, p0, Lch3/o0;->F:Lxg3/h;

    return-void
.end method

.method public constructor <init>(Lxg3/s;Z)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lch3/o0;->E:I

    .line 2
    invoke-direct {p0, p1, p2}, Lxg3/s;-><init>(Lxg3/s;Z)V

    .line 3
    new-instance p2, Lih3/b;

    invoke-direct {p2, p1}, Lih3/b;-><init>(Lxg3/h;)V

    iput-object p2, p0, Lch3/o0;->F:Lxg3/h;

    return-void
.end method


# virtual methods
.method public d()V
    .locals 2

    iget v0, p0, Lch3/o0;->E:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Lxg3/s;->d()V

    return-void

    :pswitch_0
    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lxg3/s;->e(J)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onCompleted()V
    .locals 1

    iget v0, p0, Lch3/o0;->E:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch3/o0;->F:Lxg3/h;

    check-cast v0, Lih3/b;

    invoke-virtual {v0}, Lih3/b;->onCompleted()V

    return-void

    :pswitch_0
    iget-object v0, p0, Lch3/o0;->F:Lxg3/h;

    invoke-interface {v0}, Lxg3/h;->onCompleted()V

    return-void

    :pswitch_1
    iget-object v0, p0, Lch3/o0;->F:Lxg3/h;

    check-cast v0, Lch3/n0;

    invoke-virtual {v0}, Lch3/n0;->onCompleted()V

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

    iget v0, p0, Lch3/o0;->E:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch3/o0;->F:Lxg3/h;

    check-cast v0, Lih3/b;

    invoke-virtual {v0, p1}, Lih3/b;->onError(Ljava/lang/Throwable;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lch3/o0;->F:Lxg3/h;

    invoke-interface {v0, p1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lch3/o0;->F:Lxg3/h;

    check-cast v0, Lch3/n0;

    invoke-virtual {v0, p1}, Lch3/n0;->onError(Ljava/lang/Throwable;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lch3/o0;->E:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch3/o0;->F:Lxg3/h;

    check-cast v0, Lih3/b;

    invoke-virtual {v0, p1}, Lih3/b;->onNext(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lch3/o0;->F:Lxg3/h;

    invoke-interface {v0, p1}, Lxg3/h;->onNext(Ljava/lang/Object;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lch3/o0;->F:Lxg3/h;

    check-cast v0, Lch3/n0;

    invoke-virtual {v0, p1}, Lch3/n0;->onNext(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
