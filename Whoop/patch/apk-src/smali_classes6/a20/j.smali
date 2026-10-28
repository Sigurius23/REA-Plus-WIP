.class public final La20/j;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# instance fields
.field public final E:Ly10/h;

.field public final F:Landroidx/lifecycle/k1;

.field public final G:Lqy/d;

.field public final H:Lec3/w1;

.field public final w:Lz10/e;

.field public final x:Lec3/w1;

.field public final y:Ly10/h;

.field public final z:Ly10/c;


# direct methods
.method public constructor <init>(Lz10/e;Lec3/w1;Ly10/h;Ly10/c;Ly10/h;Landroidx/lifecycle/k1;Lqy/d;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, La20/j;->w:Lz10/e;

    iput-object p2, p0, La20/j;->x:Lec3/w1;

    iput-object p3, p0, La20/j;->y:Ly10/h;

    iput-object p4, p0, La20/j;->z:Ly10/c;

    iput-object p5, p0, La20/j;->E:Ly10/h;

    iput-object p6, p0, La20/j;->F:Landroidx/lifecycle/k1;

    iput-object p7, p0, La20/j;->G:Lqy/d;

    iput-object p2, p0, La20/j;->H:Lec3/w1;

    const-string p1, "key_has_launched"

    invoke-virtual {p6, p1}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance p2, La20/b;

    const/4 p3, 0x1

    const/4 p4, 0x0

    invoke-direct {p2, p0, p4, p3}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 p3, 0x3

    invoke-static {p1, p4, p4, p2, p3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    return-void
.end method

.method public static final g(La20/j;Ls83/c;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, La20/j;->w:Lz10/e;

    instance-of v3, v1, La20/i;

    if-eqz v3, :cond_0

    move-object v3, v1

    check-cast v3, La20/i;

    iget v4, v3, La20/i;->E:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, La20/i;->E:I

    :goto_0
    move-object v15, v3

    goto :goto_1

    :cond_0
    new-instance v3, La20/i;

    invoke-direct {v3, v0, v1}, La20/i;-><init>(La20/j;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v1, v15, La20/i;->y:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v15, La20/i;->E:I

    const/4 v5, 0x0

    packed-switch v4, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_1
    iget-object v0, v15, La20/i;->x:Ljava/lang/Object;

    iget-object v2, v15, La20/i;->w:Ljava/lang/Object;

    check-cast v2, La20/j;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v1, v5

    goto/16 :goto_b

    :pswitch_2
    iget-object v0, v15, La20/i;->w:Ljava/lang/Object;

    check-cast v0, La20/j;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v1, Ll83/n;

    iget-object v1, v1, Ll83/n;->w:Ljava/lang/Object;

    move-object v2, v1

    move-object v1, v5

    goto/16 :goto_5

    :pswitch_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v1, v2, Lz10/a;

    const-string v4, "instant_debits"

    if-eqz v1, :cond_6

    move-object v1, v2

    check-cast v1, Lz10/a;

    iget-object v6, v1, Lz10/a;->E:Lw10/d;

    invoke-static {v6}, Ldc/a;->k(Lw10/d;)Ljz/e;

    move-result-object v6

    move-object v7, v4

    iget-object v4, v0, La20/j;->y:Ly10/h;

    move-object v8, v5

    iget-object v5, v1, Lz10/a;->y:Ljava/lang/String;

    iget-object v9, v1, Lz10/a;->z:Ljava/lang/String;

    iget-object v10, v1, Lz10/a;->G:Ljava/lang/String;

    move-object v11, v7

    iget-object v7, v1, Lz10/a;->H:Ljava/lang/String;

    move-object v12, v8

    iget-object v8, v1, Lz10/a;->I:Ljava/lang/String;

    move-object v13, v9

    iget-object v9, v1, Lz10/a;->J:Ljava/lang/String;

    if-eqz v6, :cond_1

    iget-object v6, v6, Ljz/e;->y:Ly00/p2;

    move-object v14, v12

    goto :goto_2

    :cond_1
    move-object v6, v12

    move-object v14, v6

    :goto_2
    iget-object v12, v1, Lz10/a;->K:Ljava/lang/Integer;

    iget-object v1, v1, Lz10/a;->L:Ljava/lang/String;

    invoke-virtual {v2}, Lz10/e;->f()Lw10/d;

    move-result-object v2

    instance-of v14, v2, Lw10/a;

    if-eqz v14, :cond_2

    move-object v14, v11

    goto :goto_4

    :cond_2
    instance-of v11, v2, Lw10/c;

    if-nez v11, :cond_4

    instance-of v2, v2, Lw10/b;

    if-eqz v2, :cond_3

    goto :goto_3

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_4
    :goto_3
    const/4 v14, 0x0

    :goto_4
    iput-object v0, v15, La20/i;->w:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, v15, La20/i;->E:I

    move-object v11, v6

    move-object v6, v13

    move-object v13, v1

    const/4 v1, 0x0

    invoke-virtual/range {v4 .. v15}, Ly10/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/p2;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_5

    goto/16 :goto_d

    :cond_5
    :goto_5
    move-object v4, v0

    goto/16 :goto_9

    :cond_6
    move-object v11, v4

    move-object v1, v5

    instance-of v4, v2, Lz10/b;

    if-eqz v4, :cond_b

    move-object v4, v2

    check-cast v4, Lz10/b;

    iget-object v5, v4, Lz10/b;->E:Lw10/d;

    invoke-static {v5}, Ldc/a;->k(Lw10/d;)Ljz/e;

    move-result-object v5

    iget-object v6, v0, La20/j;->y:Ly10/h;

    iget-object v7, v4, Lz10/b;->y:Ljava/lang/String;

    move-object v8, v6

    iget-object v6, v4, Lz10/b;->z:Ljava/lang/String;

    iget-object v10, v4, Lz10/b;->F:Ljava/lang/String;

    move-object v9, v7

    iget-object v7, v4, Lz10/b;->H:Ljava/lang/String;

    move-object v12, v8

    iget-object v8, v4, Lz10/b;->I:Ljava/lang/String;

    iget-object v4, v4, Lz10/b;->J:Ljava/lang/String;

    if-eqz v5, :cond_7

    iget-object v5, v5, Ljz/e;->y:Ly00/p2;

    goto :goto_6

    :cond_7
    move-object v5, v1

    :goto_6
    invoke-virtual {v2}, Lz10/e;->f()Lw10/d;

    move-result-object v2

    instance-of v13, v2, Lw10/a;

    if-eqz v13, :cond_8

    move-object v14, v11

    goto :goto_8

    :cond_8
    instance-of v11, v2, Lw10/c;

    if-nez v11, :cond_a

    instance-of v2, v2, Lw10/b;

    if-eqz v2, :cond_9

    goto :goto_7

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_a
    :goto_7
    move-object v14, v1

    :goto_8
    iput-object v0, v15, La20/i;->w:Ljava/lang/Object;

    const/4 v2, 0x2

    iput v2, v15, La20/i;->E:I

    move-object v11, v5

    move-object v5, v9

    move-object v9, v4

    move-object v4, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-virtual/range {v4 .. v15}, Ly10/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/p2;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_5

    goto/16 :goto_d

    :cond_b
    instance-of v4, v2, Lz10/c;

    if-eqz v4, :cond_c

    iget-object v4, v0, La20/j;->y:Ly10/h;

    check-cast v2, Lz10/c;

    iget-object v5, v2, Lz10/c;->y:Ljava/lang/String;

    iget-object v7, v2, Lz10/c;->z:Ljava/lang/String;

    iget-object v8, v2, Lz10/c;->I:Ljava/lang/String;

    iget-object v6, v2, Lz10/c;->E:Ljava/lang/String;

    iget-object v9, v2, Lz10/c;->F:Lw10/d;

    iput-object v0, v15, La20/i;->w:Ljava/lang/Object;

    const/4 v2, 0x3

    iput v2, v15, La20/i;->E:I

    move-object v10, v15

    invoke-virtual/range {v4 .. v10}, Ly10/h;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lw10/d;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_5

    goto/16 :goto_d

    :cond_c
    instance-of v4, v2, Lz10/d;

    if-eqz v4, :cond_12

    iget-object v4, v0, La20/j;->y:Ly10/h;

    check-cast v2, Lz10/d;

    iget-object v5, v2, Lz10/d;->y:Ljava/lang/String;

    iget-object v7, v2, Lz10/d;->z:Ljava/lang/String;

    iget-object v8, v2, Lz10/d;->I:Ljava/lang/String;

    iget-object v6, v2, Lz10/d;->E:Ljava/lang/String;

    iget-object v9, v2, Lz10/d;->F:Lw10/d;

    iput-object v0, v15, La20/i;->w:Ljava/lang/Object;

    const/4 v2, 0x4

    iput v2, v15, La20/i;->E:I

    move-object v10, v15

    invoke-virtual/range {v4 .. v10}, Ly10/h;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lw10/d;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_5

    goto/16 :goto_d

    :goto_9
    instance-of v0, v2, Ll83/m;

    if-nez v0, :cond_e

    :try_start_0
    check-cast v2, Ly00/f2;

    iget-object v0, v2, Ly00/f2;->w:Ljava/lang/String;

    if-eqz v0, :cond_d

    goto :goto_a

    :cond_d
    const-string v0, "Required value was null."

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    goto :goto_a

    :cond_e
    move-object v0, v2

    :goto_a
    nop

    instance-of v2, v0, Ll83/m;

    if-nez v2, :cond_10

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v5, v4, La20/j;->G:Lqy/d;

    iget-object v6, v4, La20/j;->w:Lz10/e;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Bank account session created! "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "."

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Lqy/d;->a(Ljava/lang/String;)V

    iget-object v5, v4, La20/j;->F:Landroidx/lifecycle/k1;

    const-string v7, "key_has_launched"

    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v5, v8, v7}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Lz10/e;->f()Lw10/d;

    move-result-object v5

    invoke-static {v5}, Ldc/a;->k(Lw10/d;)Ljz/e;

    move-result-object v5

    iget-object v7, v4, La20/j;->x:Lec3/w1;

    invoke-virtual {v6}, Lz10/e;->i()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6}, Lz10/e;->k()Ljava/lang/String;

    move-result-object v6

    new-instance v9, La20/e;

    invoke-direct {v9, v8, v2, v6, v5}, La20/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljz/e;)V

    iput-object v4, v15, La20/i;->w:Ljava/lang/Object;

    iput-object v0, v15, La20/i;->x:Ljava/lang/Object;

    const/4 v2, 0x5

    iput v2, v15, La20/i;->E:I

    invoke-virtual {v7, v9, v15}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_f

    goto :goto_d

    :cond_f
    move-object v2, v4

    :goto_b
    move-object v4, v2

    :cond_10
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_11

    iput-object v0, v15, La20/i;->w:Ljava/lang/Object;

    iput-object v1, v15, La20/i;->x:Ljava/lang/Object;

    const/4 v0, 0x6

    iput v0, v15, La20/i;->E:I

    invoke-virtual {v4, v2, v15}, La20/j;->j(Ljava/lang/Throwable;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_11

    goto :goto_d

    :cond_11
    :goto_c
    sget-object v3, Ll83/a0;->a:Ll83/a0;

    :goto_d
    return-object v3

    :cond_12
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final j(Ljava/lang/Throwable;Ls83/c;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    iget-object v1, p0, La20/j;->G:Lqy/d;

    const-string v2, "Error"

    invoke-virtual {v1, v2, v0}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Lz10/q;

    invoke-direct {v0, p1}, Lz10/q;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0, p2}, La20/j;->l(Lz10/r;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final l(Lz10/r;Ls83/c;)Ljava/lang/Object;
    .locals 1

    new-instance v0, La20/d;

    invoke-direct {v0, p1}, La20/d;-><init>(Lz10/r;)V

    iget-object p1, p0, La20/j;->x:Lec3/w1;

    invoke-virtual {p1, v0, p2}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
