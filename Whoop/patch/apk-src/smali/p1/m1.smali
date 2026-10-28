.class public final Lp1/m1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lp1/w;

.field public final b:Lp1/t;

.field public final c:Lp1/q;

.field public final d:Lc93/m;

.field public final e:Z

.field public final f:Lhb3/a0;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/util/concurrent/atomic/AtomicReference;

.field public i:La0/w0;

.field public final j:Lx1/h;

.field public final k:La3/p;


# direct methods
.method public constructor <init>(Lp1/w;Lp1/t;Lp1/q;La0/y0;Lc93/m;ZLhb3/a0;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/m1;->a:Lp1/w;

    iput-object p2, p0, Lp1/m1;->b:Lp1/t;

    iput-object p3, p0, Lp1/m1;->c:Lp1/q;

    iput-object p5, p0, Lp1/m1;->d:Lc93/m;

    iput-boolean p6, p0, Lp1/m1;->e:Z

    iput-object p7, p0, Lp1/m1;->f:Lhb3/a0;

    iput-object p8, p0, Lp1/m1;->g:Ljava/lang/Object;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object p2, Lp1/n1;->y:Lp1/n1;

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lp1/m1;->h:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object p1, La0/e1;->a:La0/w0;

    const-string p2, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lp1/m1;->i:La0/w0;

    new-instance p1, Lx1/h;

    invoke-direct {p1}, Lx1/h;-><init>()V

    invoke-virtual {p3}, Lp1/q;->D()La2/c;

    move-result-object p2

    invoke-virtual {p1, p4, p2}, Lx1/h;->g(Ljava/util/Set;La2/c;)V

    iput-object p1, p0, Lp1/m1;->j:Lx1/h;

    new-instance p1, La3/p;

    iget-object p2, p7, Lhb3/a0;->z:Ljava/lang/Object;

    invoke-direct {p1, p2}, La3/p;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lp1/m1;->k:La3/p;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lp1/m1;->h:Ljava/util/concurrent/atomic/AtomicReference;

    const-string v1, "Unexpected state change from: "

    :try_start_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp1/n1;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :catch_0
    move-exception v1

    goto :goto_0

    :pswitch_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "The paused composition has already been applied"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_1
    invoke-virtual {p0}, Lp1/m1;->b()V

    sget-object v2, Lp1/n1;->F:Lp1/n1;

    sget-object v3, Lp1/n1;->G:Lp1/n1;

    invoke-static {v0}, Lnh3/a;->y(Ljava/util/concurrent/atomic/AtomicReference;)Z

    move-result v4

    if-nez v4, :cond_0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " to: "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2e

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lp1/q1;->b(Ljava/lang/String;)V

    :cond_0
    return-void

    :pswitch_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "The paused composition has not completed yet"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_3
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "The paused composition has been cancelled"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_4
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "The paused composition is invalid because of a previous exception"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    sget-object v2, Lp1/n1;->w:Lp1/n1;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b()V
    .locals 5

    iget-object v0, p0, Lp1/m1;->g:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lp1/m1;->k:La3/p;

    iget-object v3, p0, Lp1/m1;->f:Lhb3/a0;

    iget-object v4, p0, Lp1/m1;->j:Lx1/h;

    invoke-virtual {v2, v3, v4}, La3/p;->G(Lhb3/a0;Lx1/h;)V

    iget-object v2, p0, Lp1/m1;->j:Lx1/h;

    invoke-virtual {v2}, Lx1/h;->c()V

    iget-object v2, p0, Lp1/m1;->j:Lx1/h;

    invoke-virtual {v2}, Lx1/h;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v2, p0, Lp1/m1;->j:Lx1/h;

    invoke-virtual {v2}, Lx1/h;->b()V

    iget-object v2, p0, Lp1/m1;->a:Lp1/w;

    iput-object v1, v2, Lp1/w;->Q:Lp1/m1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :catchall_1
    move-exception v2

    :try_start_2
    iget-object v3, p0, Lp1/m1;->j:Lx1/h;

    invoke-virtual {v3}, Lx1/h;->b()V

    iget-object v3, p0, Lp1/m1;->a:Lp1/w;

    iput-object v1, v3, Lp1/w;->Q:Lp1/m1;

    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    monitor-exit v0

    throw v1
.end method

.method public final c()Z
    .locals 2

    iget-object v0, p0, Lp1/m1;->h:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp1/n1;

    sget-object v1, Lp1/n1;->F:Lp1/n1;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final d()V
    .locals 4

    sget-object v0, Lp1/n1;->z:Lp1/n1;

    sget-object v1, Lp1/n1;->F:Lp1/n1;

    iget-object v2, p0, Lp1/m1;->h:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v2}, Lnh3/a;->z(Ljava/util/concurrent/atomic/AtomicReference;)Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected state change from: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " to: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x2e

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lp1/q1;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final e()V
    .locals 4

    iget-object v0, p0, Lp1/m1;->h:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/n1;->z:Lp1/n1;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lp1/n1;->F:Lp1/n1;

    invoke-static {v0}, Lnh3/a;->r(Ljava/util/concurrent/atomic/AtomicReference;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected state change from: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " to: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lp1/q1;->b(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final f(Lux/f0;)Z
    .locals 9

    iget-object v0, p0, Lp1/m1;->h:Ljava/util/concurrent/atomic/AtomicReference;

    :try_start_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp1/n1;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, p0, Lp1/m1;->a:Lp1/w;

    iget-object v3, p0, Lp1/m1;->b:Lp1/t;

    const/16 v4, 0x2e

    const-string v5, " to: "

    const-string v6, "Unexpected state change from: "

    packed-switch v1, :pswitch_data_0

    :try_start_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :catch_0
    move-exception p1

    goto/16 :goto_1

    :pswitch_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "The paused composition has been applied"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Pausable composition is complete and apply() should be applied"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_2
    const-string p1, "Recursive call to resume()"

    invoke-static {p1}, Lp1/r;->d(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :pswitch_3
    sget-object v1, Lp1/n1;->z:Lp1/n1;

    sget-object v7, Lp1/n1;->E:Lp1/n1;

    invoke-static {v0}, Lnh3/a;->w(Ljava/util/concurrent/atomic/AtomicReference;)Z

    move-result v8

    if-nez v8, :cond_0

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lp1/q1;->b(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :cond_0
    :try_start_2
    iget-object v8, p0, Lp1/m1;->i:La0/w0;

    invoke-virtual {v3, v2, p1, v8}, Lp1/t;->m(Lp1/w;Lux/f0;La0/w0;)La0/w0;

    move-result-object p1

    iput-object p1, p0, Lp1/m1;->i:La0/w0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-static {v0}, Lnh3/a;->x(Ljava/util/concurrent/atomic/AtomicReference;)Z

    move-result p1

    if-nez p1, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lp1/q1;->b(Ljava/lang/String;)V

    :cond_1
    iget-object p1, p0, Lp1/m1;->i:La0/w0;

    invoke-virtual {p1}, La0/w0;->g()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Lp1/m1;->d()V

    goto :goto_0

    :catchall_0
    move-exception p1

    sget-object v1, Lp1/n1;->E:Lp1/n1;

    sget-object v2, Lp1/n1;->z:Lp1/n1;

    invoke-static {v0}, Lnh3/a;->x(Ljava/util/concurrent/atomic/AtomicReference;)Z

    move-result v3

    if-nez v3, :cond_2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lp1/q1;->b(Ljava/lang/String;)V

    :cond_2
    throw p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    :pswitch_4
    iget-object v1, p0, Lp1/m1;->c:Lp1/q;

    iget-boolean v7, p0, Lp1/m1;->e:Z

    if-eqz v7, :cond_3

    const/16 v8, 0x64

    :try_start_4
    iput v8, v1, Lp1/q;->z:I

    const/4 v8, 0x1

    iput-boolean v8, v1, Lp1/q;->y:Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :cond_3
    :try_start_5
    iget-object v8, p0, Lp1/m1;->d:Lc93/m;

    invoke-virtual {v3, v2, p1, v8}, Lp1/t;->b(Lp1/w;Lux/f0;Lc93/m;)La0/w0;

    move-result-object p1

    iput-object p1, p0, Lp1/m1;->i:La0/w0;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-eqz v7, :cond_4

    :try_start_6
    invoke-virtual {v1}, Lp1/q;->v()V

    :cond_4
    sget-object p1, Lp1/n1;->y:Lp1/n1;

    sget-object v1, Lp1/n1;->z:Lp1/n1;

    invoke-static {v0}, Lnh3/a;->v(Ljava/util/concurrent/atomic/AtomicReference;)Z

    move-result v2

    if-nez v2, :cond_5

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lp1/q1;->b(Ljava/lang/String;)V

    :cond_5
    iget-object p1, p0, Lp1/m1;->i:La0/w0;

    invoke-virtual {p1}, La0/w0;->g()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Lp1/m1;->d()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :cond_6
    :goto_0
    invoke-virtual {p0}, Lp1/m1;->c()Z

    move-result p1

    return p1

    :catchall_1
    move-exception p1

    if-eqz v7, :cond_7

    :try_start_7
    invoke-virtual {v1}, Lp1/q;->v()V

    :cond_7
    throw p1

    :pswitch_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "The paused composition has been cancelled"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "The paused composition is invalid because of a previous exception"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    :goto_1
    sget-object v1, Lp1/n1;->w:Lp1/n1;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
