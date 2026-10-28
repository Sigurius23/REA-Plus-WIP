.class public final Lih3/c;
.super Lxg3/s;
.source "SourceFile"


# instance fields
.field public final synthetic E:I

.field public final F:Lxg3/s;


# direct methods
.method public constructor <init>(Lxg3/s;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lih3/c;->E:I

    .line 1
    invoke-direct {p0, p1, v0}, Lxg3/s;-><init>(Lxg3/s;Z)V

    .line 2
    iput-object p1, p0, Lih3/c;->F:Lxg3/s;

    return-void
.end method

.method public constructor <init>(Lxg3/s;Lxg3/s;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lih3/c;->E:I

    .line 3
    iput-object p2, p0, Lih3/c;->F:Lxg3/s;

    const/4 p2, 0x1

    .line 4
    invoke-direct {p0, p1, p2}, Lxg3/s;-><init>(Lxg3/s;Z)V

    return-void
.end method


# virtual methods
.method public final onCompleted()V
    .locals 1

    iget v0, p0, Lih3/c;->E:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lih3/c;->F:Lxg3/s;

    invoke-interface {v0}, Lxg3/h;->onCompleted()V

    return-void

    :pswitch_0
    iget-object v0, p0, Lih3/c;->F:Lxg3/s;

    invoke-interface {v0}, Lxg3/h;->onCompleted()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 4

    iget v0, p0, Lih3/c;->E:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lih3/c;->F:Lxg3/s;

    if-eqz p1, :cond_0

    :try_start_0
    new-instance v1, Lqg3/d;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, v3, v2, p1}, Lqg3/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lxg3/h;->onNext(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Lxg3/h;->onCompleted()V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v1, "error == null"

    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    :try_start_2
    invoke-interface {v0, p1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V
    :try_end_2
    .catch Lrx/exceptions/OnCompletedFailedException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lrx/exceptions/OnErrorFailedException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lrx/exceptions/OnErrorNotImplementedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-static {v0}, Ldt/b;->V(Ljava/lang/Throwable;)V

    new-instance v1, Lrx/exceptions/CompositeException;

    filled-new-array {p1, v0}, [Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v1, p1}, Lrx/exceptions/CompositeException;-><init>([Ljava/lang/Throwable;)V

    sget-object p1, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {p1}, Ljh3/f;->b()Ljh3/d;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_1

    :catch_0
    sget-object p1, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {p1}, Ljh3/f;->b()Ljh3/d;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_1
    return-void

    :pswitch_0
    iget-object v0, p0, Lih3/c;->F:Lxg3/s;

    invoke-interface {v0, p1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lih3/c;->E:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lpg3/v0;

    if-eqz p1, :cond_0

    new-instance v0, Lqg3/d;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v2, p1, v1}, Lqg3/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lih3/c;->F:Lxg3/s;

    invoke-interface {p1, v0}, Lxg3/h;->onNext(Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "response == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lih3/c;->F:Lxg3/s;

    invoke-interface {v0, p1}, Lxg3/h;->onNext(Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
