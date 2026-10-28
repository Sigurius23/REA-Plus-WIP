.class public final Lui/d0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Landroid/content/Context;

.field public final synthetic F:Lui/y;

.field public final synthetic G:Ljava/lang/String;

.field public final synthetic H:Ljava/lang/String;

.field public final synthetic I:Lp1/c1;

.field public w:Ljava/lang/Throwable;

.field public x:I

.field public y:I

.field public final synthetic z:Lh0/j1;


# direct methods
.method public constructor <init>(Lh0/j1;Landroid/content/Context;Lui/y;Ljava/lang/String;Ljava/lang/String;Lp1/c1;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lui/d0;->z:Lh0/j1;

    iput-object p2, p0, Lui/d0;->E:Landroid/content/Context;

    iput-object p3, p0, Lui/d0;->F:Lui/y;

    iput-object p4, p0, Lui/d0;->G:Ljava/lang/String;

    iput-object p5, p0, Lui/d0;->H:Ljava/lang/String;

    iput-object p6, p0, Lui/d0;->I:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8

    new-instance v0, Lui/d0;

    iget-object v5, p0, Lui/d0;->H:Ljava/lang/String;

    iget-object v6, p0, Lui/d0;->I:Lp1/c1;

    iget-object v1, p0, Lui/d0;->z:Lh0/j1;

    iget-object v2, p0, Lui/d0;->E:Landroid/content/Context;

    iget-object v3, p0, Lui/d0;->F:Lui/y;

    iget-object v4, p0, Lui/d0;->G:Ljava/lang/String;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lui/d0;-><init>(Lh0/j1;Landroid/content/Context;Lui/y;Ljava/lang/String;Ljava/lang/String;Lp1/c1;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lui/d0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lui/d0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lui/d0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lui/d0;->y:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v5, :cond_1

    if-ne v0, v4, :cond_0

    iget v6, p0, Lui/d0;->x:I

    iget-object v0, p0, Lui/d0;->w:Ljava/lang/Throwable;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v7, p1

    goto/16 :goto_8

    :catchall_0
    move-exception v0

    move v14, v6

    move-object v6, v0

    move v0, v14

    goto/16 :goto_a

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, p0, Lui/d0;->x:I

    iget-object v6, p0, Lui/d0;->w:Ljava/lang/Throwable;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v7, p1

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move v0, v2

    move-object v6, v3

    :goto_0
    iget-object v7, p0, Lui/d0;->I:Lp1/c1;

    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lui/r;

    iget-object v7, v7, Lui/r;->F:Lp1/f0;

    invoke-virtual {v7}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-nez v7, :cond_e

    if-eqz v0, :cond_4

    iget-object v7, p0, Lui/d0;->z:Lh0/j1;

    new-instance v8, Ljava/lang/Integer;

    invoke-direct {v8, v0}, Ljava/lang/Integer;-><init>(I)V

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v6, p0, Lui/d0;->w:Ljava/lang/Throwable;

    iput v0, p0, Lui/d0;->x:I

    iput v5, p0, Lui/d0;->y:I

    invoke-virtual {v7, v8, v6, p0}, Lh0/j1;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    if-ne v7, v1, :cond_3

    goto/16 :goto_7

    :cond_3
    :goto_1
    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_e

    :cond_4
    move-object v14, v6

    move v6, v0

    move-object v0, v14

    :try_start_1
    iget-object v7, p0, Lui/d0;->E:Landroid/content/Context;

    iget-object v8, p0, Lui/d0;->F:Lui/y;

    iget-object v9, p0, Lui/d0;->G:Ljava/lang/String;

    const/16 v10, 0x2f

    if-eqz v9, :cond_7

    invoke-static {v9}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_5

    goto :goto_2

    :cond_5
    invoke-static {v9, v10}, Lyb3/r;->Z(Ljava/lang/String;C)Z

    move-result v11

    if-eqz v11, :cond_6

    goto :goto_3

    :cond_6
    const-string v11, "/"

    invoke-virtual {v9, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    goto :goto_3

    :cond_7
    :goto_2
    move-object v9, v3

    :goto_3
    const-string v11, "fonts/"

    invoke-static {v11}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_8

    move-object v10, v3

    goto :goto_5

    :cond_8
    invoke-static {v11, v10}, Lyb3/r;->Z(Ljava/lang/String;C)Z

    move-result v10

    if-eqz v10, :cond_9

    :goto_4
    move-object v10, v11

    goto :goto_5

    :cond_9
    const-string v10, "/"

    invoke-virtual {v11, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    goto :goto_4

    :goto_5
    iget-object v11, p0, Lui/d0;->H:Ljava/lang/String;

    const-string v12, "."

    invoke-static {v11}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v13

    if-eqz v13, :cond_a

    goto :goto_6

    :cond_a
    invoke-static {v11, v12, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v13

    if-eqz v13, :cond_b

    goto :goto_6

    :cond_b
    invoke-virtual {v12, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    :goto_6
    const-string v12, "__LottieInternalDefaultCacheKey__"

    iput-object v0, p0, Lui/d0;->w:Ljava/lang/Throwable;

    iput v6, p0, Lui/d0;->x:I

    iput v4, p0, Lui/d0;->y:I

    move-object v13, p0

    invoke-static/range {v7 .. v13}, Lq83/g;->f(Landroid/content/Context;Lui/y;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v1, :cond_c

    :goto_7
    return-object v1

    :cond_c
    :goto_8
    check-cast v7, Lqi/i;

    iget-object v8, p0, Lui/d0;->I:Lp1/c1;

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lui/r;

    monitor-enter v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    const-string v9, "composition"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v9, v8, Lui/r;->z:Lp1/f0;

    invoke-virtual {v9}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v9, :cond_d

    :try_start_3
    monitor-exit v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_9

    :cond_d
    :try_start_4
    iget-object v9, v8, Lui/r;->x:Lp1/k1;

    invoke-virtual {v9, v7}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v9, v8, Lui/r;->w:Lbc3/t;

    invoke-virtual {v9, v7}, Lbc3/t1;->L(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    monitor-exit v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_9
    move v14, v6

    move-object v6, v0

    move v0, v14

    goto/16 :goto_0

    :catchall_1
    move-exception v0

    :try_start_6
    monitor-exit v8
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :try_start_7
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_a
    add-int/2addr v0, v5

    goto/16 :goto_0

    :cond_e
    iget-object v0, p0, Lui/d0;->I:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lui/r;

    iget-object v0, v0, Lui/r;->z:Lp1/f0;

    invoke-virtual {v0}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_10

    if-eqz v6, :cond_10

    iget-object v0, p0, Lui/d0;->I:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lui/r;

    monitor-enter v1

    :try_start_8
    iget-object v0, v1, Lui/r;->z:Lp1/f0;

    invoke-virtual {v0}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    if-eqz v0, :cond_f

    monitor-exit v1

    goto :goto_b

    :cond_f
    :try_start_9
    iget-object v0, v1, Lui/r;->y:Lp1/k1;

    invoke-virtual {v0, v6}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v0, v1, Lui/r;->w:Lbc3/t;

    invoke-virtual {v0, v6}, Lbc3/t;->completeExceptionally(Ljava/lang/Throwable;)Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    monitor-exit v1

    goto :goto_b

    :catchall_2
    move-exception v0

    :try_start_a
    monitor-exit v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    throw v0

    :cond_10
    :goto_b
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
