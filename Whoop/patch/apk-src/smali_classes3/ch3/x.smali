.class public final Lch3/x;
.super Lxg3/s;
.source "SourceFile"


# instance fields
.field public final synthetic E:I

.field public F:Z

.field public G:Ljava/lang/Object;

.field public final H:Lxg3/t;

.field public I:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lch3/a0;Lch3/o0;Lxg3/j;)V
    .locals 0

    const/4 p1, 0x0

    iput p1, p0, Lch3/x;->E:I

    .line 3
    invoke-direct {p0}, Lxg3/s;-><init>()V

    .line 4
    iput-object p2, p0, Lch3/x;->G:Ljava/lang/Object;

    .line 5
    iput-object p3, p0, Lch3/x;->H:Lxg3/t;

    .line 6
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lch3/x;->I:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lch3/d0;Lxg3/s;Lxg3/s;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lch3/x;->E:I

    .line 1
    iput-object p1, p0, Lch3/x;->I:Ljava/lang/Object;

    iput-object p3, p0, Lch3/x;->H:Lxg3/t;

    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p2, p1}, Lxg3/s;-><init>(Lxg3/s;Z)V

    return-void
.end method


# virtual methods
.method public final onCompleted()V
    .locals 2

    iget v0, p0, Lch3/x;->E:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch3/x;->H:Lxg3/t;

    check-cast v0, Lxg3/s;

    invoke-interface {v0}, Lxg3/h;->onCompleted()V

    return-void

    :pswitch_0
    :try_start_0
    iget-object v0, p0, Lch3/x;->H:Lxg3/t;

    check-cast v0, Lxg3/j;

    invoke-interface {v0}, Lxg3/t;->b()V

    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-boolean v0, p0, Lch3/x;->F:Z

    if-eqz v0, :cond_0

    monitor-exit p0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lch3/x;->F:Z

    iget-object v0, p0, Lch3/x;->I:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    iput-object v1, p0, Lch3/x;->I:Ljava/lang/Object;

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v1, p0, Lch3/x;->G:Ljava/lang/Object;

    check-cast v1, Lch3/o0;

    invoke-virtual {v1, v0}, Lch3/o0;->onNext(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object v0, p0, Lch3/x;->G:Ljava/lang/Object;

    check-cast v0, Lch3/o0;

    invoke-virtual {v0}, Lch3/o0;->onCompleted()V

    invoke-virtual {p0}, Lxg3/s;->b()V

    goto :goto_2

    :catchall_1
    move-exception v0

    goto :goto_1

    :goto_0
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_1
    iget-object v1, p0, Lch3/x;->G:Ljava/lang/Object;

    check-cast v1, Lch3/o0;

    invoke-static {v0, v1}, Ldt/b;->W(Ljava/lang/Throwable;Lxg3/h;)V

    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    iget v0, p0, Lch3/x;->E:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch3/x;->H:Lxg3/t;

    check-cast v0, Lxg3/s;

    invoke-interface {v0, p1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    return-void

    :pswitch_0
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lch3/x;->F:Z

    if-eqz v0, :cond_0

    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lch3/x;->F:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lch3/x;->I:Ljava/lang/Object;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lch3/x;->G:Ljava/lang/Object;

    check-cast v0, Lch3/o0;

    invoke-virtual {v0, p1}, Lch3/o0;->onError(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lxg3/s;->b()V

    :goto_0
    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 4

    iget v0, p0, Lch3/x;->E:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch3/x;->I:Ljava/lang/Object;

    check-cast v0, Lch3/d0;

    iget-object v1, p0, Lch3/x;->H:Lxg3/t;

    check-cast v1, Lxg3/s;

    iget-object v2, p0, Lch3/x;->G:Ljava/lang/Object;

    iput-object p1, p0, Lch3/x;->G:Ljava/lang/Object;

    iget-boolean v3, p0, Lch3/x;->F:Z

    if-eqz v3, :cond_1

    :try_start_0
    iget-object v0, v0, Lch3/d0;->x:Ljava/lang/Object;

    check-cast v0, Lch3/d0;

    invoke-virtual {v0, v2, p1}, Lch3/d0;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    invoke-interface {v1, p1}, Lxg3/h;->onNext(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, Lxg3/s;->e(J)V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0, v1, p1}, Ldt/b;->X(Ljava/lang/Throwable;Lxg3/h;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lch3/x;->F:Z

    invoke-interface {v1, p1}, Lxg3/h;->onNext(Ljava/lang/Object;)V

    :goto_0
    return-void

    :pswitch_0
    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, Lch3/x;->F:Z

    if-eqz v0, :cond_2

    monitor-exit p0

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_2
    iget-object v0, p0, Lch3/x;->I:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lch3/x;->I:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const v0, 0x7fffffff

    if-ne p1, v0, :cond_3

    iget-object p1, p0, Lch3/x;->I:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lch3/x;->I:Ljava/lang/Object;

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz p1, :cond_4

    iget-object v0, p0, Lch3/x;->G:Ljava/lang/Object;

    check-cast v0, Lch3/o0;

    invoke-virtual {v0, p1}, Lch3/o0;->onNext(Ljava/lang/Object;)V

    :cond_4
    :goto_2
    return-void

    :goto_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
