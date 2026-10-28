.class public final Lj00/h;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# instance fields
.field public final E:Lqy/d;

.field public final F:J

.field public final G:Lj00/k;

.field public final H:Lec3/h2;

.field public final I:Lec3/h2;

.field public final J:Ljava/lang/String;

.field public final K:Ljava/lang/String;

.field public final L:Lg40/f3;

.field public final M:Lg40/z1;

.field public final N:Lg40/f3;

.field public final O:La33/d;

.field public final P:Ln53/e;

.field public final Q:Ln53/e;

.field public final R:Ln53/e;

.field public final S:Lec3/h2;

.field public final T:Lec3/r1;

.field public U:Z

.field public final w:Lj00/d0;

.field public final x:Lwz/g0;

.field public final y:Lxz/x;

.field public final z:Lyz/b;


# direct methods
.method public constructor <init>(Lj00/i0;Lj00/d0;Ljava/lang/Boolean;Lwz/g0;Lxz/x;Lyz/b;Lqy/d;)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v4, p2

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    const-string v7, "signupMode"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "config"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "linkAccountManager"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "linkEventsReporter"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "logger"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v2, Lwz/g0;->w:Ly00/c8;

    iget-boolean v8, v2, Lwz/g0;->U:Z

    iget-boolean v14, v2, Lwz/g0;->d0:Z

    iget-boolean v15, v2, Lwz/g0;->c0:Z

    iget-object v9, v2, Lwz/g0;->F:Lwz/f0;

    invoke-direct {v0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object v4, v0, Lj00/h;->w:Lj00/d0;

    iput-object v2, v0, Lj00/h;->x:Lwz/g0;

    iput-object v3, v0, Lj00/h;->y:Lxz/x;

    iput-object v5, v0, Lj00/h;->z:Lyz/b;

    iput-object v6, v0, Lj00/h;->E:Lqy/d;

    const-wide/16 v5, 0x3e8

    iput-wide v5, v0, Lj00/h;->F:J

    const/4 v5, 0x1

    if-eqz v1, :cond_0

    move/from16 v16, v5

    goto :goto_0

    :cond_0
    const/16 v16, 0x0

    :goto_0
    if-eqz v1, :cond_3

    instance-of v10, v1, Lj00/h0;

    if-eqz v10, :cond_1

    move-object v10, v1

    check-cast v10, Lj00/h0;

    iget-object v10, v10, Lj00/h0;->w:Ljava/lang/String;

    goto :goto_1

    :cond_1
    instance-of v10, v1, Lj00/g0;

    if-eqz v10, :cond_2

    move-object v10, v1

    check-cast v10, Lj00/g0;

    iget-object v10, v10, Lj00/g0;->w:Ljava/lang/String;

    :goto_1
    move-object/from16 v17, v10

    goto :goto_2

    :cond_2
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_3
    const/16 v17, 0x0

    :goto_2
    if-eqz v1, :cond_6

    instance-of v10, v1, Lj00/h0;

    if-eqz v10, :cond_4

    move-object v10, v1

    check-cast v10, Lj00/h0;

    iget-object v10, v10, Lj00/h0;->x:Ljava/lang/String;

    goto :goto_3

    :cond_4
    instance-of v10, v1, Lj00/g0;

    if-eqz v10, :cond_5

    const/4 v10, 0x0

    :goto_3
    move-object/from16 v18, v10

    goto :goto_4

    :cond_5
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_6
    const/16 v18, 0x0

    :goto_4
    if-eqz v1, :cond_9

    instance-of v10, v1, Lj00/h0;

    if-eqz v10, :cond_7

    move-object v10, v1

    check-cast v10, Lj00/h0;

    iget-object v10, v10, Lj00/h0;->z:Ljava/lang/String;

    goto :goto_5

    :cond_7
    instance-of v10, v1, Lj00/g0;

    if-eqz v10, :cond_8

    const/4 v10, 0x0

    :goto_5
    move-object/from16 v19, v10

    goto :goto_6

    :cond_8
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_9
    const/16 v19, 0x0

    :goto_6
    if-eqz v1, :cond_c

    instance-of v10, v1, Lj00/h0;

    if-eqz v10, :cond_a

    check-cast v1, Lj00/h0;

    iget-object v1, v1, Lj00/h0;->y:Ljava/lang/String;

    goto :goto_7

    :cond_a
    instance-of v1, v1, Lj00/g0;

    if-eqz v1, :cond_b

    const/4 v1, 0x0

    :goto_7
    move-object/from16 v20, v1

    goto :goto_8

    :cond_b
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_c
    const/16 v20, 0x0

    :goto_8
    if-eqz v15, :cond_e

    if-eqz p3, :cond_d

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    goto :goto_9

    :cond_d
    move v1, v14

    goto :goto_9

    :cond_e
    move/from16 v1, v16

    :goto_9
    if-eqz p3, :cond_f

    move v13, v5

    goto :goto_a

    :cond_f
    const/4 v13, 0x0

    :goto_a
    sget-object v10, Lj00/d0;->x:Lj00/d0;

    if-ne v4, v10, :cond_10

    move v11, v5

    goto :goto_b

    :cond_10
    const/4 v11, 0x0

    :goto_b
    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v12

    move/from16 p1, v11

    iget-object v11, v9, Lwz/f0;->x:Ljava/lang/String;

    if-eqz v11, :cond_12

    invoke-static {v11}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v21

    if-eqz v21, :cond_11

    goto :goto_c

    :cond_11
    const/16 v21, 0x0

    goto :goto_d

    :cond_12
    :goto_c
    move/from16 v21, v5

    :goto_d
    if-eqz p1, :cond_13

    if-nez v21, :cond_13

    sget-object v3, Lj00/c0;->x:Lj00/c0;

    invoke-virtual {v12, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    sget-object v3, Lj00/c0;->w:Lj00/c0;

    invoke-virtual {v12, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_13
    if-eqz p1, :cond_14

    sget-object v3, Lj00/c0;->w:Lj00/c0;

    invoke-virtual {v12, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    sget-object v3, Lj00/c0;->x:Lj00/c0;

    invoke-virtual {v12, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_14
    sget-object v3, Lj00/c0;->w:Lj00/c0;

    invoke-virtual {v12, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    sget-object v3, Lj00/c0;->x:Lj00/c0;

    invoke-virtual {v12, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    :goto_e
    invoke-static {v2}, Lse/g;->C(Lwz/g0;)Z

    move-result v3

    if-eqz v3, :cond_15

    sget-object v3, Lj00/c0;->y:Lj00/c0;

    invoke-virtual {v12, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_15
    invoke-static {v12}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v3

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    if-eqz v12, :cond_17

    if-ne v12, v5, :cond_16

    invoke-static {v3}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v12

    invoke-static {v3}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v12}, Ldt/b;->y(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v5

    goto :goto_f

    :cond_16
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_17
    invoke-static {v3}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v5

    :goto_f
    const-string v12, "US"

    if-eqz v8, :cond_18

    invoke-interface {v7}, Ly00/c8;->q()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_18

    sget-object v6, Lj00/d0;->w:Lj00/d0;

    if-ne v4, v6, :cond_18

    const/4 v6, 0x1

    goto :goto_10

    :cond_18
    const/4 v6, 0x0

    :goto_10
    if-eqz v17, :cond_1b

    invoke-static/range {v17 .. v17}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v21

    if-eqz v21, :cond_19

    goto :goto_11

    :cond_19
    if-eqz v18, :cond_1b

    invoke-static/range {v18 .. v18}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v21

    if-eqz v21, :cond_1a

    goto :goto_11

    :cond_1a
    const/16 v21, 0x0

    goto :goto_12

    :cond_1b
    :goto_11
    const/16 v21, 0x1

    :goto_12
    if-eqz v6, :cond_1c

    if-eqz v21, :cond_1c

    sget-object v21, Ln00/d;->y:Ln00/d;

    goto :goto_13

    :cond_1c
    sget-object v21, Ln00/d;->w:Ln00/d;

    :goto_13
    iget-object v2, v2, Lwz/g0;->x:Ljava/lang/String;

    if-nez v1, :cond_1e

    if-eqz v6, :cond_1d

    goto :goto_14

    :cond_1d
    move-object v1, v10

    const/4 v10, 0x0

    goto :goto_15

    :cond_1e
    :goto_14
    move-object v1, v10

    const/4 v10, 0x1

    :goto_15
    if-eqz v8, :cond_1f

    invoke-interface {v7}, Ly00/c8;->q()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1f

    sget-object v6, Lj00/d0;->w:Lj00/d0;

    if-ne v4, v6, :cond_1f

    const/4 v7, 0x1

    goto :goto_16

    :cond_1f
    const/4 v7, 0x0

    :goto_16
    if-eqz v15, :cond_21

    if-eqz v11, :cond_21

    invoke-static {v11}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_20

    goto :goto_18

    :cond_20
    sget-object v6, Lj00/d0;->w:Lj00/d0;

    if-ne v4, v6, :cond_21

    const/4 v8, 0x1

    :goto_17
    move-object v6, v1

    goto :goto_19

    :cond_21
    :goto_18
    const/4 v8, 0x0

    goto :goto_17

    :goto_19
    new-instance v1, Lj00/k;

    move-object v12, v9

    const/4 v9, 0x0

    move-object/from16 v22, v11

    const/4 v11, 0x0

    move-object/from16 v23, v6

    move-object v6, v5

    move-object v5, v3

    move-object v3, v2

    const/4 v2, 0x0

    move/from16 v24, v14

    move-object v14, v12

    move-object/from16 v12, v21

    move/from16 v21, v15

    move-object/from16 v15, v23

    invoke-direct/range {v1 .. v13}, Lj00/k;-><init>(Lj00/i0;Ljava/lang/String;Lj00/d0;Ljava/util/List;Ljava/util/Set;ZZZZZLn00/d;Z)V

    iput-object v1, v0, Lj00/h;->G:Lj00/k;

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Lj00/h;->H:Lec3/h2;

    iput-object v1, v0, Lj00/h;->I:Lec3/h2;

    if-ne v4, v15, :cond_22

    const/4 v3, 0x1

    goto :goto_1a

    :cond_22
    const/4 v3, 0x0

    :goto_1a
    sget-object v1, Lj00/c0;->w:Lj00/c0;

    invoke-interface {v6, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_23

    move-object/from16 v2, v22

    goto :goto_1b

    :cond_23
    const/4 v2, 0x0

    :goto_1b
    iput-object v2, v0, Lj00/h;->J:Ljava/lang/String;

    iget-object v4, v14, Lwz/f0;->y:Ljava/lang/String;

    sget-object v7, Lj00/c0;->x:Lj00/c0;

    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_24

    goto :goto_1c

    :cond_24
    const/4 v4, 0x0

    :goto_1c
    if-nez v4, :cond_25

    const-string v4, ""

    :cond_25
    iput-object v4, v0, Lj00/h;->K:Ljava/lang/String;

    iget-object v8, v14, Lwz/f0;->w:Ljava/lang/String;

    sget-object v9, Lj00/c0;->y:Lj00/c0;

    invoke-interface {v6, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_26

    move-object v6, v8

    goto :goto_1d

    :cond_26
    const/4 v6, 0x0

    :goto_1d
    sget-object v8, Lg40/z0;->F:Ljava/util/regex/Pattern;

    if-nez v17, :cond_27

    goto :goto_1e

    :cond_27
    move-object/from16 v2, v17

    :goto_1e
    invoke-static {v5}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v1, :cond_28

    if-eqz v3, :cond_28

    const/4 v1, 0x1

    goto :goto_1f

    :cond_28
    const/4 v1, 0x0

    :goto_1f
    new-instance v8, Lg40/f3;

    new-instance v10, Lg40/z0;

    const/4 v11, 0x1

    invoke-direct {v10, v1, v11}, Lg40/z0;-><init>(ZI)V

    const/4 v1, 0x4

    const/4 v12, 0x0

    invoke-direct {v8, v10, v2, v12, v1}, Lg40/f3;-><init>(Lg40/l3;Ljava/lang/String;Ldo0/c;I)V

    iput-object v8, v0, Lj00/h;->L:Lg40/f3;

    if-nez v18, :cond_29

    goto :goto_20

    :cond_29
    move-object/from16 v4, v18

    :goto_20
    if-nez v20, :cond_2a

    iget-object v2, v14, Lwz/f0;->z:Ljava/lang/String;

    goto :goto_21

    :cond_2a
    move-object/from16 v2, v20

    :goto_21
    invoke-static {v5}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v7, :cond_2b

    if-eqz v3, :cond_2b

    move v3, v11

    goto :goto_22

    :cond_2b
    const/4 v3, 0x0

    :goto_22
    const/16 v7, 0x14

    const/4 v10, 0x0

    invoke-static {v4, v7, v2, v3, v10}, Lg40/l0;->a(Ljava/lang/String;ILjava/lang/String;ZZ)Lg40/z1;

    move-result-object v2

    iput-object v2, v0, Lj00/h;->M:Lg40/z1;

    if-nez v19, :cond_2c

    goto :goto_23

    :cond_2c
    move-object/from16 v6, v19

    :goto_23
    new-instance v3, Lg40/f3;

    new-instance v4, Lg40/l1;

    invoke-direct {v4}, Lg40/l1;-><init>()V

    const/4 v12, 0x0

    invoke-direct {v3, v4, v6, v12, v1}, Lg40/f3;-><init>(Lg40/l3;Ljava/lang/String;Ldo0/c;I)V

    iput-object v3, v0, Lj00/h;->N:Lg40/f3;

    invoke-interface {v5, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2d

    move-object v6, v3

    goto :goto_24

    :cond_2d
    move-object v6, v12

    :goto_24
    filled-new-array {v8, v2, v6}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v4, La33/d;

    invoke-direct {v4, v1, v12}, La33/d;-><init>(Ljava/util/List;Lzy/c;)V

    iput-object v4, v0, Lj00/h;->O:La33/d;

    new-instance v1, Liz0/d;

    const/4 v4, 0x5

    invoke-direct {v1, v4}, Liz0/d;-><init>(I)V

    iget-object v4, v8, Lg40/f3;->x:Ln53/e;

    invoke-static {v4, v1}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v1

    iput-object v1, v0, Lj00/h;->P:Ln53/e;

    iget-object v1, v2, Lg40/z1;->m:Ln53/e;

    new-instance v2, Liz0/d;

    const/4 v4, 0x6

    invoke-direct {v2, v4}, Liz0/d;-><init>(I)V

    invoke-static {v1, v2}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v1

    iput-object v1, v0, Lj00/h;->Q:Ln53/e;

    new-instance v1, Liz0/d;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Liz0/d;-><init>(I)V

    iget-object v2, v3, Lg40/f3;->x:Ln53/e;

    invoke-static {v2, v1}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v1

    iput-object v1, v0, Lj00/h;->R:Ln53/e;

    const/4 v12, 0x0

    invoke-static {v12}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Lj00/h;->S:Lec3/h2;

    invoke-static {v1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v1

    iput-object v1, v0, Lj00/h;->T:Lec3/r1;

    if-eqz v21, :cond_2f

    if-eqz p3, :cond_2e

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    goto :goto_25

    :cond_2e
    move/from16 v14, v24

    goto :goto_25

    :cond_2f
    move/from16 v14, v16

    :goto_25
    iput-boolean v14, v0, Lj00/h;->U:Z

    invoke-static {v0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v1

    new-instance v2, Lj00/f;

    const/4 v10, 0x0

    const/4 v12, 0x0

    invoke-direct {v2, v0, v12, v10}, Lj00/f;-><init>(Lj00/h;Lq83/d;I)V

    const/4 v3, 0x3

    invoke-static {v1, v12, v12, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-static {v0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v1

    new-instance v2, Lj00/f;

    invoke-direct {v2, v0, v12, v11}, Lj00/f;-><init>(Lj00/h;Lq83/d;I)V

    invoke-static {v1, v12, v12, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static final g(Lj00/h;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lj00/d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lj00/d;

    iget v1, v0, Lj00/d;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lj00/d;->E:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lj00/d;

    invoke-direct {v0, p0, p2}, Lj00/d;-><init>(Lj00/h;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lj00/d;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lj00/d;->E:I

    const/4 v7, 0x0

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lj00/d;->x:Ljava/lang/String;

    iget-object p0, v6, Lj00/d;->w:Lj00/h;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p2, p2, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lj00/h;->S:Lec3/h2;

    invoke-virtual {p2, v7}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v1, p0, Lj00/h;->y:Lxz/x;

    sget-object v3, Ly00/c2;->x:Ly00/c2;

    iput-object p0, v6, Lj00/d;->w:Lj00/h;

    iput-object p1, v6, Lj00/d;->x:Ljava/lang/String;

    iput v2, v6, Lj00/d;->E:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Lxz/x;->k(Ljava/lang/String;Ly00/c2;ZLjava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    move-object p1, v2

    :goto_2
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_7

    check-cast p2, Ld00/l;

    if-eqz p2, :cond_5

    iget-object p2, p0, Lj00/h;->H:Lec3/h2;

    :cond_4
    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Lj00/k;

    new-instance v1, Lj00/g0;

    invoke-direct {v1, p1}, Lj00/g0;-><init>(Ljava/lang/String;)V

    sget-object v4, Ln00/d;->w:Ln00/d;

    const/4 v3, 0x0

    const/16 v5, 0x9fe

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lj00/k;->a(Lj00/k;Lj00/i0;ZZLn00/d;I)Lj00/k;

    move-result-object v0

    invoke-virtual {p2, p0, v0}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    goto :goto_3

    :cond_5
    iget-object p1, p0, Lj00/h;->H:Lec3/h2;

    :cond_6
    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lj00/k;

    sget-object v4, Ln00/d;->y:Ln00/d;

    const/4 v3, 0x0

    const/16 v5, 0x9ff

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lj00/k;->a(Lj00/k;Lj00/i0;ZZLn00/d;I)Lj00/k;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    iget-object p0, p0, Lj00/h;->z:Lyz/b;

    iget-object p1, p0, Lyz/b;->f:Lbz/c;

    sget-object p2, Lbz/b;->y:Lbz/b;

    invoke-static {p1, p2}, Lvd/e;->f0(Lbz/c;Lbz/b;)V

    sget-object p1, Lyz/c;->O:Lyz/c;

    invoke-virtual {p0, p1, v7}, Lyz/b;->a(Ldz/i;Ljava/util/Map;)V

    goto :goto_3

    :cond_7
    iget-object p1, p0, Lj00/h;->H:Lec3/h2;

    :cond_8
    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object v1, p2

    check-cast v1, Lj00/k;

    sget-object v5, Ln00/d;->w:Ln00/d;

    instance-of v4, v0, Lcom/stripe/android/core/exception/APIConnectionException;

    const/4 v3, 0x0

    const/16 v6, 0x9ff

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, Lj00/k;->a(Lj00/k;Lj00/i0;ZZLn00/d;I)Lj00/k;

    move-result-object v1

    invoke-virtual {p1, p2, v1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    if-nez v4, :cond_9

    invoke-static {v0}, Lv8/b;->x(Ljava/lang/Throwable;)Lzy/c;

    move-result-object p1

    iget-object p2, p0, Lj00/h;->E:Lqy/d;

    const-string v1, "Error: "

    invoke-virtual {p2, v1, v0}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p0, p0, Lj00/h;->S:Lec3/h2;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0, v7, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_9
    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final j(Lj00/h;Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Lj00/e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lj00/e;

    iget v1, v0, Lj00/e;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lj00/e;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lj00/e;

    invoke-direct {v0, p0, p1}, Lj00/e;-><init>(Lj00/h;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lj00/e;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lj00/e;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lj00/e;->w:Lj00/h;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lj00/h;->Q:Ln53/e;

    new-instance v2, Ld33/x;

    const/4 v4, 0x2

    const/4 v5, 0x5

    const/4 v6, 0x0

    invoke-direct {v2, v4, v5, v6}, Ld33/x;-><init>(IILq83/d;)V

    iput-object p0, v0, Lj00/e;->w:Lj00/h;

    iput v3, v0, Lj00/e;->z:I

    invoke-static {p1, v2, v0}, Lec3/v;->z(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    iget-object p0, p0, Lj00/h;->H:Lec3/h2;

    :cond_4
    invoke-virtual {p0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lj00/k;

    sget-object v4, Ln00/d;->y:Ln00/d;

    const/16 v5, 0xbff

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lj00/k;->a(Lj00/k;Lj00/i0;ZZLn00/d;I)Lj00/k;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lj00/h0;
    .locals 14

    iget-object v0, p0, Lj00/h;->G:Lj00/k;

    iget-object v1, v0, Lj00/k;->c:Lj00/d0;

    iget-boolean v2, v0, Lj00/k;->g:Z

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    move v5, v3

    goto :goto_1

    :cond_1
    :goto_0
    move v5, v4

    :goto_1
    if-eqz p1, :cond_11

    if-eqz v5, :cond_11

    if-eqz v1, :cond_11

    iget-object v5, v0, Lj00/k;->d:Ljava/util/List;

    sget-object v6, Lj00/c0;->y:Lj00/c0;

    invoke-interface {v5, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    if-eqz p3, :cond_2

    invoke-static/range {p3 .. p3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_3

    :cond_2
    move v5, v3

    goto :goto_2

    :cond_3
    move v5, v4

    :goto_2
    iget-object v6, p0, Lj00/h;->M:Lg40/z1;

    invoke-virtual {v6}, Lg40/z1;->u()Ljava/lang/String;

    move-result-object v10

    new-instance v7, Lj00/h0;

    iget-object v6, p0, Lj00/h;->J:Ljava/lang/String;

    if-eqz v6, :cond_4

    move v3, v4

    :cond_4
    iget-object v6, p0, Lj00/h;->K:Ljava/lang/String;

    invoke-static {v6}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v6

    iget-boolean v0, v0, Lj00/k;->f:Z

    iget-object v8, p0, Lj00/h;->x:Lwz/g0;

    iget-boolean v8, v8, Lwz/g0;->d0:Z

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_8

    if-ne v1, v4, :cond_7

    if-ne v3, v4, :cond_5

    sget-object v0, Lj00/e0;->E:Lj00/e0;

    :goto_3
    move-object v12, v0

    goto :goto_5

    :cond_5
    if-nez v3, :cond_6

    sget-object v0, Lj00/e0;->z:Lj00/e0;

    goto :goto_3

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    if-eqz v2, :cond_a

    if-eqz v8, :cond_9

    if-nez p4, :cond_9

    sget-object v0, Lj00/e0;->J:Lj00/e0;

    goto :goto_3

    :cond_9
    sget-object v0, Lj00/e0;->I:Lj00/e0;

    goto :goto_3

    :cond_a
    if-eqz v0, :cond_e

    if-eqz v3, :cond_b

    if-nez v6, :cond_b

    sget-object v0, Lj00/e0;->F:Lj00/e0;

    goto :goto_3

    :cond_b
    if-nez v3, :cond_d

    if-nez v6, :cond_c

    goto :goto_4

    :cond_c
    sget-object v0, Lj00/e0;->H:Lj00/e0;

    goto :goto_3

    :cond_d
    :goto_4
    sget-object v0, Lj00/e0;->G:Lj00/e0;

    goto :goto_3

    :cond_e
    if-eqz v3, :cond_f

    if-nez v6, :cond_f

    sget-object v0, Lj00/e0;->y:Lj00/e0;

    goto :goto_3

    :cond_f
    if-eqz v3, :cond_10

    sget-object v0, Lj00/e0;->x:Lj00/e0;

    goto :goto_3

    :cond_10
    sget-object v0, Lj00/e0;->w:Lj00/e0;

    goto :goto_3

    :goto_5
    const-string v13, "PHONE_NUMBER"

    move-object v8, p1

    move-object/from16 v9, p2

    move-object/from16 v11, p3

    invoke-direct/range {v7 .. v13}, Lj00/h0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj00/e0;Ljava/lang/String;)V

    if-eqz v5, :cond_11

    return-object v7

    :cond_11
    const/4 p1, 0x0

    return-object p1
.end method
