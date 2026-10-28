.class public final Lq00/p0;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# instance fields
.field public final E:Lla/b;

.field public final F:Lqy/d;

.field public final G:Ln40/g;

.field public final H:Lwz/n0;

.field public final I:Lwz/m1;

.field public final J:Lkotlin/jvm/functions/Function1;

.field public final K:Lkotlin/jvm/functions/Function1;

.field public final L:Ly00/c8;

.field public final M:Lec3/h2;

.field public final N:Lec3/r1;

.field public final O:Lg40/f3;

.field public final P:Lx30/e0;

.field public final w:Lwz/g0;

.field public final x:Ld00/l;

.field public final y:Lxz/x;

.field public final z:La00/g;


# direct methods
.method public constructor <init>(Lwz/g0;Ld00/l;Lxz/x;La00/g;Lla/b;Lqy/d;Ln40/g;Lwz/n0;Lwz/m1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 40

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    move-object/from16 v10, p11

    const-string v11, "configuration"

    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "linkAccountManager"

    invoke-static {v3, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v11, v4, Lla/b;->x:Ljava/lang/Object;

    check-cast v11, Ln83/c;

    const-string v12, "logger"

    invoke-static {v5, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "navigationManager"

    invoke-static {v6, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "linkLaunchMode"

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "dismissalCoordinator"

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "navigateAndClearStack"

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "dismissWithResult"

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object v1, v0, Lq00/p0;->w:Lwz/g0;

    iput-object v2, v0, Lq00/p0;->x:Ld00/l;

    iput-object v3, v0, Lq00/p0;->y:Lxz/x;

    move-object/from16 v3, p4

    iput-object v3, v0, Lq00/p0;->z:La00/g;

    iput-object v4, v0, Lq00/p0;->E:Lla/b;

    iput-object v5, v0, Lq00/p0;->F:Lqy/d;

    iput-object v6, v0, Lq00/p0;->G:Ln40/g;

    iput-object v7, v0, Lq00/p0;->H:Lwz/n0;

    iput-object v8, v0, Lq00/p0;->I:Lwz/m1;

    iput-object v9, v0, Lq00/p0;->J:Lkotlin/jvm/functions/Function1;

    iput-object v10, v0, Lq00/p0;->K:Lkotlin/jvm/functions/Function1;

    iget-object v3, v1, Lwz/g0;->w:Ly00/c8;

    iput-object v3, v0, Lq00/p0;->L:Ly00/c8;

    iget-object v14, v2, Ld00/l;->H:Ljava/lang/String;

    iget-boolean v15, v1, Lwz/g0;->Y:Z

    iget-boolean v2, v1, Lwz/g0;->H:Z

    const-string v4, "<this>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v4, v3, Ly00/l3;

    if-eqz v4, :cond_1

    if-eqz v2, :cond_0

    move-object v2, v3

    check-cast v2, Ly00/l3;

    sget-object v6, Ly00/f4;->G:Lt9/c0;

    const-string v6, "card"

    invoke-virtual {v2, v6}, Ly00/l3;->b(Ljava/lang/String;)Z

    move-result v2

    :goto_0
    move/from16 v20, v2

    goto :goto_1

    :cond_0
    move-object v2, v3

    check-cast v2, Ly00/l3;

    sget-object v6, Ly00/f4;->G:Lt9/c0;

    const-string v6, "link"

    invoke-virtual {v2, v6}, Ly00/l3;->b(Ljava/lang/String;)Z

    move-result v2

    goto :goto_0

    :cond_1
    instance-of v2, v3, Ly00/g6;

    if-eqz v2, :cond_f

    const/16 v20, 0x1

    :goto_1
    iget-object v2, v1, Lwz/g0;->x:Ljava/lang/String;

    iget-object v6, v1, Lwz/g0;->y:Ljava/lang/String;

    iget-object v8, v1, Lwz/g0;->K:Lux/a;

    iget-object v9, v1, Lwz/g0;->L:Lux/b;

    iget-boolean v10, v1, Lwz/g0;->W:Z

    invoke-static {v7}, Lq00/p0;->n(Lwz/n0;)Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_2

    const/4 v12, 0x1

    goto :goto_2

    :cond_2
    const/4 v12, 0x0

    :goto_2
    invoke-static {v3, v7}, Lh00/n0;->e(Ly00/c8;Lwz/n0;)Lzy/b;

    move-result-object v23

    instance-of v5, v7, Lwz/l0;

    const/4 v13, 0x0

    const v16, 0x7f141112

    if-nez v5, :cond_8

    instance-of v5, v7, Lwz/k0;

    if-eqz v5, :cond_3

    goto :goto_5

    :cond_3
    instance-of v3, v7, Lwz/m0;

    if-eqz v3, :cond_5

    move-object v3, v7

    check-cast v3, Lwz/m0;

    iget-boolean v3, v3, Lwz/m0;->z:Z

    if-eqz v3, :cond_4

    invoke-static/range {v16 .. v16}, Ls4/i;->h(I)Lzy/b;

    move-result-object v3

    :goto_3
    move-object/from16 v24, v3

    goto :goto_6

    :cond_4
    move-object/from16 v24, v13

    goto :goto_6

    :cond_5
    instance-of v3, v7, Lwz/i0;

    if-nez v3, :cond_7

    instance-of v3, v7, Lwz/j0;

    if-eqz v3, :cond_6

    goto :goto_4

    :cond_6
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_7
    :goto_4
    invoke-static/range {v16 .. v16}, Ls4/i;->h(I)Lzy/b;

    move-result-object v3

    goto :goto_3

    :cond_8
    :goto_5
    if-eqz v4, :cond_9

    const v3, 0x7f141118

    invoke-static {v3}, Ls4/i;->h(I)Lzy/b;

    move-result-object v3

    goto :goto_3

    :cond_9
    instance-of v3, v3, Ly00/g6;

    if-eqz v3, :cond_e

    invoke-static/range {v16 .. v16}, Ls4/i;->h(I)Lzy/b;

    move-result-object v3

    goto :goto_3

    :goto_6
    const v3, 0x7f141119

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, v1, Lwz/g0;->I:Ljava/util/Map;

    const-string v5, "link_show_prefer_debit_card_hint"

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    sget-object v5, Lq00/e;->c:Lq00/e;

    invoke-virtual {v11, v5}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v4, :cond_a

    if-eqz v5, :cond_a

    goto :goto_7

    :cond_a
    move-object v3, v13

    :goto_7
    if-eqz v3, :cond_b

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3}, Ls4/i;->h(I)Lzy/b;

    move-result-object v3

    move-object/from16 v34, v3

    goto :goto_8

    :cond_b
    move-object/from16 v34, v13

    :goto_8
    instance-of v3, v7, Lwz/m0;

    if-eqz v3, :cond_c

    move-object v3, v7

    check-cast v3, Lwz/m0;

    iget-object v3, v3, Lwz/m0;->w:Ly00/c0;

    if-nez v3, :cond_c

    iget-boolean v3, v1, Lwz/g0;->a0:Z

    if-eqz v3, :cond_c

    const/16 v35, 0x1

    goto :goto_9

    :cond_c
    const/16 v35, 0x0

    :goto_9
    iget-boolean v3, v1, Lwz/g0;->c0:Z

    iget-object v1, v1, Lwz/g0;->N:Lh20/l1;

    move v5, v12

    new-instance v12, Lq00/i0;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v27

    new-instance v4, Ll40/a;

    const/4 v5, 0x0

    invoke-direct {v4, v13, v5}, Ll40/a;-><init>(Ljava/lang/String;Z)V

    new-instance v7, Ll40/a;

    invoke-direct {v7, v13, v5}, Ll40/a;-><init>(Ljava/lang/String;Z)V

    const/16 v36, 0x0

    const/16 v39, 0x0

    move-object/from16 v16, v13

    sget-object v13, Lm83/y;->w:Lm83/y;

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    sget-object v32, Lq00/a;->a:Lq00/a;

    const/16 v33, 0x0

    move-object/from16 v38, v1

    move-object/from16 v21, v2

    move/from16 v37, v3

    move-object/from16 v30, v4

    move-object/from16 v22, v6

    move-object/from16 v31, v7

    move-object/from16 v17, v9

    move/from16 v26, v10

    move-object/from16 v25, v11

    move-object/from16 v1, v16

    move-object/from16 v16, v8

    invoke-direct/range {v12 .. v39}, Lq00/i0;-><init>(Ljava/util/List;Ljava/lang/String;ZLux/a;Lux/b;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Lzy/c;Lzy/c;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;Lzy/c;ZZZLh20/l1;Z)V

    invoke-static {v12}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, v0, Lq00/p0;->M:Lec3/h2;

    invoke-static {v2}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v3

    iput-object v3, v0, Lq00/p0;->N:Lec3/r1;

    new-instance v4, Lg40/f3;

    new-instance v6, Lg40/j0;

    invoke-direct {v6}, Lg40/j0;-><init>()V

    const/4 v7, 0x6

    invoke-direct {v4, v6, v1, v1, v7}, Lg40/f3;-><init>(Lg40/l3;Ljava/lang/String;Ldo0/c;I)V

    iput-object v4, v0, Lq00/p0;->O:Lg40/f3;

    new-instance v4, Lx30/e0;

    new-instance v6, Lpt2/k;

    const/16 v7, 0x12

    invoke-direct {v6, v7}, Lpt2/k;-><init>(I)V

    invoke-static {v3, v6}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v3

    const/4 v6, 0x5

    invoke-direct {v4, v1, v3, v6}, Lx30/e0;-><init>(Ld0/o2;Lec3/f2;I)V

    iput-object v4, v0, Lq00/p0;->P:Lx30/e0;

    :cond_d
    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lq00/i0;

    const/16 v16, 0x0

    const v17, 0xfffffbf

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v6 .. v17}, Lq00/i0;->a(Lq00/i0;Ljava/util/ArrayList;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;I)Lq00/i0;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-static {v0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v2

    new-instance v3, Lq00/j0;

    invoke-direct {v3, v0, v1, v5}, Lq00/j0;-><init>(Lq00/p0;Lq83/d;I)V

    const/4 v4, 0x3

    invoke-static {v2, v1, v1, v3, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-static {v0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v2

    new-instance v3, Lq00/j0;

    const/4 v6, 0x1

    invoke-direct {v3, v0, v1, v6}, Lq00/j0;-><init>(Lq00/p0;Lq83/d;I)V

    invoke-static {v2, v1, v1, v3, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-static {v0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v2

    new-instance v3, Lq00/j0;

    const/4 v5, 0x2

    invoke-direct {v3, v0, v1, v5}, Lq00/j0;-><init>(Lq00/p0;Lq83/d;I)V

    invoke-static {v2, v1, v1, v3, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-static {v0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v2

    new-instance v3, Lq00/j0;

    invoke-direct {v3, v0, v1, v4}, Lq00/j0;-><init>(Lq00/p0;Lq83/d;I)V

    invoke-static {v2, v1, v1, v3, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_e
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_f
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public static final g(Lq00/p0;Ly00/c0;Ls83/c;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lq00/p0;->w:Lwz/g0;

    instance-of v1, p2, Lq00/l0;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lq00/l0;

    iget v2, v1, Lq00/l0;->G:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lq00/l0;->G:I

    goto :goto_0

    :cond_0
    new-instance v1, Lq00/l0;

    invoke-direct {v1, p0, p2}, Lq00/l0;-><init>(Lq00/p0;Ls83/c;)V

    :goto_0
    iget-object p2, v1, Lq00/l0;->E:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lq00/l0;->G:I

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v6, :cond_2

    if-ne v3, v5, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-boolean p0, v1, Lq00/l0;->z:Z

    iget-object p1, v1, Lq00/l0;->y:Lwz/m1;

    iget-object v0, v1, Lq00/l0;->x:Ly00/c0;

    iget-object v3, v1, Lq00/l0;->w:Lq00/p0;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p2, p2, Ll83/n;->w:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p2, v0

    goto/16 :goto_7

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lq00/p0;->N:Lec3/r1;

    iget-object p2, p2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lq00/i0;

    iget-object v3, v0, Lwz/g0;->i0:Ly00/n;

    iget-object p2, p2, Lq00/i0;->r:Ll40/a;

    invoke-static {p2}, Lrv/n;->j(Ll40/a;)Ljava/util/Map;

    move-result-object p2

    sget-object v8, Ly00/f4;->G:Lt9/c0;

    const-string v8, "card"

    invoke-static {p2, v8, v4, v7, v3}, Ls4/i;->u(Ljava/util/Map;Ljava/lang/String;ZLy00/r3;Ly00/n;)Ly00/d5;

    move-result-object p2

    iget-object v3, p0, Lq00/p0;->I:Lwz/m1;

    iget-boolean v8, v3, Lwz/m1;->a:Z

    iput-boolean v4, v3, Lwz/m1;->a:Z

    :try_start_1
    new-instance v9, Ly00/i0;

    invoke-virtual {p1}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1}, Ly00/c0;->h()Z

    move-result v11

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    invoke-virtual {p2}, Ly00/d5;->c0()Ljava/util/Map;

    move-result-object p2

    iget-object v0, v0, Lwz/g0;->i0:Ly00/n;

    invoke-virtual {v0}, Ly00/n;->c0()Ljava/util/Map;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    check-cast p2, Ljava/util/LinkedHashMap;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-direct {v9, v10, v11, p2, v0}, Ly00/i0;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    iget-object p2, p0, Lq00/p0;->y:Lxz/x;

    iput-object p0, v1, Lq00/l0;->w:Lq00/p0;

    iput-object p1, v1, Lq00/l0;->x:Ly00/c0;

    iput-object v3, v1, Lq00/l0;->y:Lwz/m1;

    iput-boolean v8, v1, Lq00/l0;->z:Z

    iput v6, v1, Lq00/l0;->G:I

    invoke-virtual {p2, v9, v7, v1}, Lxz/x;->x(Ly00/i0;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne p2, v2, :cond_4

    goto :goto_3

    :cond_4
    move-object v0, p1

    move-object p1, v3

    move-object v3, p0

    move p0, v8

    :goto_1
    iput-boolean p0, p1, Lwz/m1;->a:Z

    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    if-nez p0, :cond_9

    check-cast p2, Ly00/d0;

    iget-object p0, p2, Ly00/d0;->w:Ljava/util/List;

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    move-object p1, v7

    :cond_5
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object v8, p2

    check-cast v8, Ly00/c0;

    invoke-virtual {v8}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    if-nez v4, :cond_6

    move-object p1, p2

    move v4, v6

    goto :goto_2

    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Collection contains more than one matching element."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7
    if-eqz v4, :cond_8

    check-cast p1, Ly00/c0;

    iput-object v7, v1, Lq00/l0;->w:Lq00/p0;

    iput-object v7, v1, Lq00/l0;->x:Ly00/c0;

    iput-object v7, v1, Lq00/l0;->y:Lwz/m1;

    iput v5, v1, Lq00/l0;->G:I

    invoke-virtual {v3, p1, v1}, Lq00/p0;->q(Ly00/c0;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v2, :cond_b

    :goto_3
    return-object v2

    :cond_8
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string p1, "Collection contains no element matching the predicate."

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9
    iget-object p1, v3, Lq00/p0;->M:Lec3/h2;

    :cond_a
    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lq00/i0;

    invoke-static {p0}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object v10

    const/4 v9, 0x0

    const v11, 0xfdfffbf

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v11}, Lq00/i0;->a(Lq00/i0;Ljava/util/ArrayList;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;I)Lq00/i0;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_a

    :cond_b
    :goto_4
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :catchall_1
    move-exception v0

    move-object p2, v0

    :goto_5
    move-object p1, v3

    move p0, v8

    goto :goto_7

    :goto_6
    move-object p2, p0

    goto :goto_5

    :catchall_2
    move-exception v0

    move-object p0, v0

    goto :goto_6

    :goto_7
    iput-boolean p0, p1, Lwz/m1;->a:Z

    throw p2
.end method

.method public static final j(Lq00/p0;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 12

    iget-object v0, p0, Lq00/p0;->F:Lqy/d;

    const-string v1, "WalletViewModel: "

    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2, p1}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p0, p0, Lq00/p0;->M:Lec3/h2;

    :cond_0
    invoke-virtual {p0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lq00/i0;

    invoke-static {p1}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object v10

    const/4 v8, 0x0

    const v11, 0xfcfffff

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    sget-object v9, Lq00/a;->a:Lq00/a;

    invoke-static/range {v0 .. v11}, Lq00/i0;->a(Lq00/i0;Ljava/util/ArrayList;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;I)Lq00/i0;

    move-result-object v0

    invoke-virtual {p0, p2, v0}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void
.end method

.method public static final l(Lq00/p0;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 12

    iget-object v0, p0, Lq00/p0;->F:Lqy/d;

    const-string v1, "WalletViewModel: "

    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2, p1}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p0, p0, Lq00/p0;->M:Lec3/h2;

    :cond_0
    invoke-virtual {p0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lq00/i0;

    invoke-static {p1}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object v10

    const/4 v9, 0x0

    const v11, 0xfdeffbf    # 2.19894E-29f

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v11}, Lq00/i0;->a(Lq00/i0;Ljava/util/ArrayList;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;I)Lq00/i0;

    move-result-object v0

    invoke-virtual {p0, p2, v0}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void
.end method

.method public static n(Lwz/n0;)Ljava/lang/String;
    .locals 2

    instance-of v0, p0, Lwz/l0;

    const/4 v1, 0x0

    if-nez v0, :cond_5

    instance-of v0, p0, Lwz/k0;

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    instance-of v0, p0, Lwz/m0;

    if-eqz v0, :cond_2

    check-cast p0, Lwz/m0;

    iget-object p0, p0, Lwz/m0;->w:Ly00/c0;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v1

    :cond_2
    instance-of v0, p0, Lwz/i0;

    if-eqz v0, :cond_3

    return-object v1

    :cond_3
    instance-of p0, p0, Lwz/j0;

    if-eqz p0, :cond_4

    return-object v1

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_5
    return-object v1
.end method

.method public static t(Lq00/p0;Z)V
    .locals 13

    iget-object p0, p0, Lq00/p0;->M:Lec3/h2;

    :goto_0
    invoke-virtual {p0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lq00/i0;

    const/4 v11, 0x0

    const v12, 0xffdffbf

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move v4, p1

    invoke-static/range {v1 .. v12}, Lq00/i0;->a(Lq00/i0;Ljava/util/ArrayList;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;I)Lq00/i0;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    move p1, v4

    goto :goto_0
.end method


# virtual methods
.method public final o(Ljava/lang/String;ZLs83/c;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lq00/m0;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lq00/m0;

    iget v3, v2, Lq00/m0;->F:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lq00/m0;->F:I

    goto :goto_0

    :cond_0
    new-instance v2, Lq00/m0;

    invoke-direct {v2, v0, v1}, Lq00/m0;-><init>(Lq00/p0;Ls83/c;)V

    :goto_0
    iget-object v1, v2, Lq00/m0;->z:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lq00/m0;->F:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-boolean v3, v2, Lq00/m0;->y:Z

    iget-object v4, v2, Lq00/m0;->x:Ljava/lang/String;

    iget-object v2, v2, Lq00/m0;->w:Lq00/p0;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v1, Ll83/n;

    iget-object v1, v1, Ll83/n;->w:Ljava/lang/Object;

    :goto_1
    move-object v6, v4

    goto :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lq00/p0;->L:Ly00/c8;

    iget-object v4, v0, Lq00/p0;->x:Ld00/l;

    invoke-static {v1, v4}, Ld00/n;->a(Ly00/c8;Ld00/l;)Ljava/util/Set;

    move-result-object v1

    iput-object v0, v2, Lq00/m0;->w:Lq00/p0;

    move-object/from16 v4, p1

    iput-object v4, v2, Lq00/m0;->x:Ljava/lang/String;

    move/from16 v6, p2

    iput-boolean v6, v2, Lq00/m0;->y:Z

    iput v5, v2, Lq00/m0;->F:I

    iget-object v5, v0, Lq00/p0;->y:Lxz/x;

    invoke-virtual {v5, v1, v2}, Lxz/x;->g(Ljava/util/Set;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_3

    return-object v3

    :cond_3
    move-object v2, v0

    move v3, v6

    goto :goto_1

    :goto_2
    invoke-static {v1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-nez v4, :cond_8

    check-cast v1, Ly00/d0;

    iget-object v1, v2, Lq00/p0;->M:Lec3/h2;

    :cond_4
    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lq00/i0;

    if-eqz v3, :cond_5

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_3
    move-object v8, v5

    goto :goto_4

    :cond_5
    iget-object v5, v4, Lq00/i0;->o:Ljava/lang/Boolean;

    goto :goto_3

    :goto_4
    if-eqz v3, :cond_6

    const/4 v5, 0x0

    :goto_5
    move-object v10, v5

    goto :goto_6

    :cond_6
    iget-object v5, v4, Lq00/i0;->q:Lzy/c;

    goto :goto_5

    :goto_6
    if-eqz v3, :cond_7

    sget-object v5, Lq00/a;->a:Lq00/a;

    :goto_7
    move-object v13, v5

    goto :goto_8

    :cond_7
    iget-object v5, v4, Lq00/i0;->t:Lq00/c;

    goto :goto_7

    :goto_8
    const/4 v14, 0x0

    const v15, 0xfed7fdf

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v4 .. v15}, Lq00/i0;->a(Lq00/i0;Ljava/util/ArrayList;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;I)Lq00/i0;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_9

    :cond_8
    iget-object v1, v2, Lq00/p0;->F:Lqy/d;

    const-string v3, "WalletViewModel Fatal error: "

    invoke-virtual {v1, v3, v4}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v1, v2, Lq00/p0;->K:Lkotlin/jvm/functions/Function1;

    new-instance v3, Lwz/o;

    iget-object v2, v2, Lq00/p0;->y:Lxz/x;

    invoke-static {v2}, Ls3/d;->j(Lxz/x;)Lwz/e;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Lwz/o;-><init>(Ljava/lang/Throwable;Lwz/e;)V

    invoke-interface {v1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_9
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method

.method public final p(Z)V
    .locals 13

    iget-object v0, p0, Lq00/p0;->M:Lec3/h2;

    if-eqz p1, :cond_1

    :cond_0
    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lq00/i0;

    new-instance v10, Lq00/b;

    const/4 v2, 0x0

    invoke-direct {v10, v2}, Lq00/b;-><init>(Ljz/f;)V

    const/4 v11, 0x0

    const v12, 0xfefffff

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v1 .. v12}, Lq00/i0;->a(Lq00/i0;Ljava/util/ArrayList;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;I)Lq00/i0;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lq00/p0;->F:Lqy/d;

    const-string v1, "WalletViewModel: Failed to present Financial Connections"

    invoke-virtual {p1, v1}, Lqy/d;->d(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lq00/i0;

    const/4 v11, 0x0

    const v12, 0xfefffff

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    sget-object v10, Lq00/a;->a:Lq00/a;

    invoke-static/range {v1 .. v12}, Lq00/i0;->a(Lq00/i0;Ljava/util/ArrayList;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;I)Lq00/i0;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    return-void
.end method

.method public final q(Ly00/c0;Ls83/c;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lq00/o0;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lq00/o0;

    iget v4, v3, Lq00/o0;->z:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lq00/o0;->z:I

    goto :goto_0

    :cond_0
    new-instance v3, Lq00/o0;

    invoke-direct {v3, v0, v2}, Lq00/o0;-><init>(Lq00/p0;Ls83/c;)V

    :goto_0
    iget-object v2, v3, Lq00/o0;->x:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lq00/o0;->z:I

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    const/4 v7, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v7, :cond_1

    iget-object v1, v3, Lq00/o0;->w:Lq00/p0;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lq00/p0;->w:Lwz/g0;

    iget-object v2, v2, Lwz/g0;->N:Lh20/l1;

    iget-object v11, v0, Lq00/p0;->x:Ld00/l;

    invoke-static {v1, v2, v11}, Lvd/e;->h0(Ly00/c0;Lh20/l1;Ld00/l;)Z

    move-result v2

    iget-object v5, v0, Lq00/p0;->P:Lx30/e0;

    const/4 v12, 0x0

    if-nez v2, :cond_5

    iget-object v2, v0, Lq00/p0;->M:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq00/i0;

    iget-boolean v2, v2, Lq00/i0;->n:Z

    if-eqz v2, :cond_5

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lq00/p0;->t(Lq00/p0;Z)V

    iget-object v2, v5, Lx30/e0;->q:Ln53/e;

    iget-object v2, v2, Ln53/e;->y:Ll83/e;

    check-cast v2, Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ll40/a;

    iget-boolean v3, v3, Ll40/a;->b:Z

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    move-object v2, v12

    :goto_1
    check-cast v2, Ll40/a;

    if-eqz v2, :cond_4

    iget-object v12, v2, Ll40/a;->a:Ljava/lang/String;

    :cond_4
    sget-object v2, Lwz/b1;->d:Lwz/b1;

    invoke-virtual {v1}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "paymentDetailsId"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v2, Lwz/e1;->a:Ljava/lang/String;

    new-instance v3, Ll83/k;

    const-string v4, "payment_details"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ll83/k;

    const-string v5, "is_billing_update_flow"

    invoke-direct {v4, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v5, "billing_update_cvc"

    invoke-direct {v1, v5, v12}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v4, v1}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v2, v1}, Lwz/n1;->c(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Lq00/p0;->G:Ln40/g;

    invoke-static {v2, v1}, Ln40/h;->b(Ln40/g;Ljava/lang/String;)V

    return-object v6

    :cond_5
    iget-object v2, v5, Lx30/e0;->q:Ln53/e;

    iget-object v2, v2, Ln53/e;->y:Ll83/e;

    check-cast v2, Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ll40/a;

    iget-boolean v5, v5, Ll40/a;->b:Z

    if-eqz v5, :cond_6

    goto :goto_2

    :cond_6
    move-object v2, v12

    :goto_2
    check-cast v2, Ll40/a;

    if-eqz v2, :cond_7

    iget-object v2, v2, Ll40/a;->a:Ljava/lang/String;

    goto :goto_3

    :cond_7
    move-object v2, v12

    :goto_3
    iget-object v5, v0, Lq00/p0;->y:Lxz/x;

    iget-object v5, v5, Lxz/x;->i:Lec3/r1;

    iget-object v5, v5, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v5}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwz/a;

    if-eqz v5, :cond_a

    iget-object v5, v5, Lwz/a;->a:Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lwz/s0;

    iget-object v9, v9, Lwz/s0;->x:Ly00/c0;

    invoke-virtual {v9}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    goto :goto_4

    :cond_9
    move-object v8, v12

    :goto_4
    check-cast v8, Lwz/s0;

    goto :goto_5

    :cond_a
    move-object v8, v12

    :goto_5
    new-instance v9, Lwz/s0;

    if-eqz v8, :cond_b

    iget-object v5, v8, Lwz/s0;->z:Ljava/lang/String;

    if-nez v5, :cond_c

    :cond_b
    invoke-virtual {v11}, Ld00/l;->f()Ljava/lang/String;

    move-result-object v5

    :cond_c
    invoke-direct {v9, v1, v2, v5}, Lwz/s0;-><init>(Ly00/c0;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, v3, Lq00/o0;->w:Lq00/p0;

    iput v7, v3, Lq00/o0;->z:I

    iget-object v10, v0, Lq00/p0;->z:La00/g;

    iget-object v1, v10, La00/g;->E:Ljava/lang/Object;

    check-cast v1, Lwz/n0;

    new-instance v8, La00/f;

    const/4 v13, 0x0

    invoke-direct/range {v8 .. v13}, La00/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v10, v1, v8, v9, v3}, La00/g;->i(Lwz/n0;La00/f;Lwz/u0;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_d

    return-object v4

    :cond_d
    move-object v1, v0

    :goto_6
    check-cast v2, La00/d;

    instance-of v3, v2, La00/a;

    if-eqz v3, :cond_f

    iget-object v3, v1, Lq00/p0;->M:Lec3/h2;

    :cond_e
    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lq00/i0;

    const/16 v17, 0x0

    const v18, 0xfffffbf

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v7 .. v18}, Lq00/i0;->a(Lq00/i0;Ljava/util/ArrayList;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;I)Lq00/i0;

    move-result-object v2

    invoke-virtual {v3, v1, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_f
    instance-of v3, v2, La00/c;

    if-eqz v3, :cond_11

    iget-object v3, v1, Lq00/p0;->M:Lec3/h2;

    :cond_10
    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lq00/i0;

    move-object v4, v2

    check-cast v4, La00/c;

    iget-object v13, v4, La00/c;->a:Lzy/c;

    const/16 v17, 0x0

    const v18, 0xffdffbf

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v7 .. v18}, Lq00/i0;->a(Lq00/i0;Ljava/util/ArrayList;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;I)Lq00/i0;

    move-result-object v4

    invoke-virtual {v3, v1, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    :goto_7
    return-object v6

    :cond_11
    instance-of v3, v2, La00/b;

    if-eqz v3, :cond_12

    iget-object v1, v1, Lq00/p0;->K:Lkotlin/jvm/functions/Function1;

    check-cast v2, La00/b;

    iget-object v2, v2, La00/b;->a:Lwz/n;

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v6

    :cond_12
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public final r()V
    .locals 15

    :cond_0
    iget-object v0, p0, Lq00/p0;->M:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lq00/i0;

    new-instance v11, Lq00/b;

    const/4 v14, 0x0

    invoke-direct {v11, v14}, Lq00/b;-><init>(Ljz/f;)V

    const/4 v12, 0x0

    const v13, 0xfefffff

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v2 .. v13}, Lq00/i0;->a(Lq00/i0;Ljava/util/ArrayList;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;I)Lq00/i0;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lq00/j0;

    const/4 v2, 0x4

    invoke-direct {v1, p0, v14, v2}, Lq00/j0;-><init>(Lq00/p0;Lq83/d;I)V

    const/4 v2, 0x3

    invoke-static {v0, v14, v14, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
