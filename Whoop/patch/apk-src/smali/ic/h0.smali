.class public final synthetic Lic/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lic/y;Ljava/lang/String;Lc93/a;Landroidx/lifecycle/u0;Ld4/i;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lic/h0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lic/h0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lic/h0;->x:Ljava/lang/String;

    iput-object p3, p0, Lic/h0;->z:Ljava/lang/Object;

    iput-object p4, p0, Lic/h0;->E:Ljava/lang/Object;

    iput-object p5, p0, Lic/h0;->F:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ll3/v0;Ly3/m;Ljava/lang/String;Ly3/c;Lp3/h;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lic/h0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lic/h0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lic/h0;->z:Ljava/lang/Object;

    iput-object p3, p0, Lic/h0;->x:Ljava/lang/String;

    iput-object p4, p0, Lic/h0;->E:Ljava/lang/Object;

    iput-object p5, p0, Lic/h0;->F:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    iget v0, p0, Lic/h0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lic/h0;->y:Ljava/lang/Object;

    check-cast v0, Ll3/v0;

    iget-object v1, p0, Lic/h0;->z:Ljava/lang/Object;

    check-cast v1, Ly3/m;

    iget-object v3, p0, Lic/h0;->x:Ljava/lang/String;

    iget-object v2, p0, Lic/h0;->E:Ljava/lang/Object;

    move-object v8, v2

    check-cast v8, Ly3/c;

    iget-object v2, p0, Lic/h0;->F:Ljava/lang/Object;

    move-object v7, v2

    check-cast v7, Lp3/h;

    const-string v2, "BackgroundTextMeasurement"

    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v2

    instance-of v4, v2, Lz1/b;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    check-cast v2, Lz1/b;

    goto :goto_0

    :cond_0
    move-object v2, v5

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {v2, v5, v5}, Lz1/b;->C(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lz1/b;

    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v9, :cond_1

    :try_start_1
    invoke-virtual {v9}, Lz1/f;->j()Lz1/f;

    move-result-object v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {v0, v1}, Ljc/x;->p0(Ll3/v0;Ly3/m;)Ll3/v0;

    move-result-object v4

    sget-object v5, Lm83/y;->w:Lm83/y;

    new-instance v2, Lt3/c;

    move-object v6, v5

    invoke-direct/range {v2 .. v8}, Lt3/c;-><init>(Ljava/lang/String;Ll3/v0;Ljava/util/List;Ljava/util/List;Lp3/h;Ly3/c;)V

    invoke-virtual {v2}, Lt3/c;->c()F
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-static {v10}, Lz1/f;->q(Lz1/f;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-virtual {v9}, Lz1/b;->w()Lz1/q;

    move-result-object v0

    invoke-virtual {v0}, Lz1/q;->d()V

    invoke-virtual {v9}, Lz1/b;->c()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_2

    :catchall_1
    move-exception v0

    goto :goto_1

    :catchall_2
    move-exception v0

    :try_start_5
    invoke-static {v10}, Lz1/f;->q(Lz1/f;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_1
    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception v0

    :try_start_7
    invoke-virtual {v9}, Lz1/b;->c()V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot create a mutable snapshot of an read-only snapshot"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lic/h0;->y:Ljava/lang/Object;

    check-cast v0, Lic/y;

    iget-object v1, p0, Lic/h0;->x:Ljava/lang/String;

    iget-object v2, p0, Lic/h0;->z:Ljava/lang/Object;

    check-cast v2, Lc93/a;

    iget-object v3, p0, Lic/h0;->E:Ljava/lang/Object;

    check-cast v3, Landroidx/lifecycle/u0;

    iget-object v4, p0, Lic/h0;->F:Ljava/lang/Object;

    check-cast v4, Ld4/i;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lpf/c;->E()Z

    move-result v5

    if-eqz v5, :cond_2

    :try_start_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "label"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lpf/c;->Z(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    :cond_2
    :try_start_9
    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object v0, Lic/e0;->a:Lic/d0;

    invoke-virtual {v3, v0}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    invoke-virtual {v4, v0}, Ld4/i;->a(Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    goto :goto_3

    :catchall_4
    move-exception v0

    :try_start_a
    new-instance v1, Lic/b0;

    invoke-direct {v1, v0}, Lic/b0;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v3, v1}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    invoke-virtual {v4, v0}, Ld4/i;->b(Ljava/lang/Throwable;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    :goto_3
    if-eqz v5, :cond_3

    invoke-static {}, Landroid/os/Trace;->endSection()V

    :cond_3
    return-void

    :catchall_5
    move-exception v0

    if-eqz v5, :cond_4

    invoke-static {}, Landroid/os/Trace;->endSection()V

    :cond_4
    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
