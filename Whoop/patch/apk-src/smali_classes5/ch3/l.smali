.class public final Lch3/l;
.super Lxg3/s;
.source "SourceFile"


# instance fields
.field public final synthetic E:I

.field public final F:Lxg3/s;

.field public final G:Ljava/lang/Object;

.field public H:Z


# direct methods
.method public constructor <init>(Lxg3/s;Lbh3/g;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lch3/l;->E:I

    .line 2
    invoke-direct {p0}, Lxg3/s;-><init>()V

    .line 3
    iput-object p1, p0, Lch3/l;->F:Lxg3/s;

    .line 4
    iput-object p2, p0, Lch3/l;->G:Ljava/lang/Object;

    const-wide/16 p1, 0x0

    .line 5
    invoke-virtual {p0, p1, p2}, Lxg3/s;->e(J)V

    return-void
.end method

.method public synthetic constructor <init>(Lxg3/s;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lch3/l;->E:I

    invoke-direct {p0}, Lxg3/s;-><init>()V

    iput-object p1, p0, Lch3/l;->F:Lxg3/s;

    iput-object p2, p0, Lch3/l;->G:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final f(Lxg3/i;)V
    .locals 1

    iget v0, p0, Lch3/l;->E:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch3/l;->F:Lxg3/s;

    invoke-virtual {v0, p1}, Lxg3/s;->f(Lxg3/i;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lch3/l;->F:Lxg3/s;

    invoke-virtual {v0, p1}, Lxg3/s;->f(Lxg3/i;)V

    return-void

    :pswitch_1
    invoke-super {p0, p1}, Lxg3/s;->f(Lxg3/i;)V

    iget-object v0, p0, Lch3/l;->F:Lxg3/s;

    invoke-virtual {v0, p1}, Lxg3/s;->f(Lxg3/i;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onCompleted()V
    .locals 1

    iget v0, p0, Lch3/l;->E:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lch3/l;->H:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lch3/l;->F:Lxg3/s;

    invoke-interface {v0}, Lxg3/h;->onCompleted()V

    :goto_0
    return-void

    :pswitch_0
    iget-boolean v0, p0, Lch3/l;->H:Z

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lch3/l;->F:Lxg3/s;

    invoke-interface {v0}, Lxg3/h;->onCompleted()V

    :goto_1
    return-void

    :pswitch_1
    iget-boolean v0, p0, Lch3/l;->H:Z

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lch3/l;->F:Lxg3/s;

    invoke-interface {v0}, Lxg3/h;->onCompleted()V

    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    iget v0, p0, Lch3/l;->E:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lch3/l;->H:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lch3/l;->H:Z

    iget-object v0, p0, Lch3/l;->F:Lxg3/s;

    invoke-interface {v0, p1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void

    :pswitch_0
    iget-boolean v0, p0, Lch3/l;->H:Z

    if-eqz v0, :cond_1

    invoke-static {p1}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lch3/l;->H:Z

    iget-object v0, p0, Lch3/l;->F:Lxg3/s;

    invoke-interface {v0, p1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    :goto_1
    return-void

    :pswitch_1
    iget-boolean v0, p0, Lch3/l;->H:Z

    if-eqz v0, :cond_2

    invoke-static {p1}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lch3/l;->H:Z

    iget-object v0, p0, Lch3/l;->F:Lxg3/s;

    invoke-interface {v0, p1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lch3/l;->E:I

    packed-switch v0, :pswitch_data_0

    :try_start_0
    iget-object v0, p0, Lch3/l;->G:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lch3/l;->F:Lxg3/s;

    invoke-interface {v0, p1}, Lxg3/h;->onNext(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Ldt/b;->V(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lxg3/s;->b()V

    invoke-static {p1, v0}, Lrx/exceptions/OnErrorThrowable;->a(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    invoke-virtual {p0, v0}, Lch3/l;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void

    :pswitch_0
    :try_start_1
    iget-object v0, p0, Lch3/l;->G:Ljava/lang/Object;

    check-cast v0, Lbh3/g;

    invoke-interface {v0, p1}, Lbh3/g;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iget-object v0, p0, Lch3/l;->F:Lxg3/s;

    invoke-interface {v0, p1}, Lxg3/h;->onNext(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-static {v0}, Ldt/b;->V(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lxg3/s;->b()V

    invoke-static {p1, v0}, Lrx/exceptions/OnErrorThrowable;->a(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    invoke-virtual {p0, v0}, Lch3/l;->onError(Ljava/lang/Throwable;)V

    :goto_1
    return-void

    :pswitch_1
    :try_start_2
    iget-object v0, p0, Lch3/l;->G:Ljava/lang/Object;

    check-cast v0, Lbh3/g;

    invoke-interface {v0, p1}, Lbh3/g;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lch3/l;->F:Lxg3/s;

    invoke-interface {v0, p1}, Lxg3/h;->onNext(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, Lxg3/s;->e(J)V

    goto :goto_2

    :catchall_2
    move-exception v0

    invoke-static {v0}, Ldt/b;->V(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lxg3/s;->b()V

    invoke-static {p1, v0}, Lrx/exceptions/OnErrorThrowable;->a(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    invoke-virtual {p0, v0}, Lch3/l;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
