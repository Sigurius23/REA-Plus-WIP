.class public final Lo00/b;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# instance fields
.field public final E:Lwz/g0;

.field public final F:La00/g;

.field public final G:Lkotlin/jvm/functions/Function1;

.field public final H:Lec3/h2;

.field public final I:Lec3/r1;

.field public final J:Lec3/h2;

.field public final K:Lec3/r1;

.field public final w:Lqy/d;

.field public final x:Lxz/x;

.field public final y:Ln40/g;

.field public final z:Lwz/m1;


# direct methods
.method public constructor <init>(Lqy/d;Lxz/x;Ln40/g;Lwz/m1;Lwz/g0;Lwz/n0;La00/g;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lwz/a1;)V
    .locals 9

    move-object/from16 v3, p8

    const-string v4, "logger"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "linkAccountManager"

    invoke-static {p2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "navigationManager"

    invoke-static {p3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "dismissalCoordinator"

    invoke-static {p4, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "configuration"

    invoke-static {p5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "linkLaunchMode"

    invoke-static {p6, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "dismissWithResult"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Lo00/b;->w:Lqy/d;

    iput-object p2, p0, Lo00/b;->x:Lxz/x;

    iput-object p3, p0, Lo00/b;->y:Ln40/g;

    iput-object p4, p0, Lo00/b;->z:Lwz/m1;

    iput-object p5, p0, Lo00/b;->E:Lwz/g0;

    move-object/from16 p1, p7

    iput-object p1, p0, Lo00/b;->F:La00/g;

    iput-object v3, p0, Lo00/b;->G:Lkotlin/jvm/functions/Function1;

    new-instance v0, Lo00/a;

    if-eqz p10, :cond_0

    iget-object p1, p5, Lwz/g0;->w:Ly00/c8;

    invoke-static {p1, p6}, Lh00/n0;->e(Ly00/c8;Lwz/n0;)Lzy/b;

    move-result-object p1

    :goto_0
    move-object v3, p1

    goto :goto_1

    :cond_0
    const p1, 0x7f141042

    invoke-static {p1}, Ls4/i;->h(I)Lzy/b;

    move-result-object p1

    goto :goto_0

    :goto_1
    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v1, p9

    move-object/from16 v2, p10

    invoke-direct/range {v0 .. v8}, Lo00/a;-><init>(Ljava/lang/String;Lwz/a1;Lzy/c;ZLh20/a;Ly00/i;Lzy/c;Z)V

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lo00/b;->H:Lec3/h2;

    invoke-static {p1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lo00/b;->I:Lec3/r1;

    const/4 v0, 0x0

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lo00/b;->J:Lec3/h2;

    invoke-static {p1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lo00/b;->K:Lec3/r1;

    :try_start_0
    iget-object p1, p2, Lxz/x;->i:Lec3/r1;

    iget-object p1, p1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwz/a;

    if-eqz p1, :cond_3

    iget-object p1, p1, Lwz/a;->a:Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object p3, p2

    check-cast p3, Lwz/s0;

    iget-object p3, p3, Lwz/s0;->x:Ly00/c0;

    invoke-virtual {p3}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_4

    :cond_2
    move-object p2, v0

    :goto_2
    check-cast p2, Lwz/s0;

    if-eqz p2, :cond_3

    iget-object p1, p2, Lwz/s0;->x:Ly00/c0;

    move-object v2, p1

    goto :goto_3

    :cond_3
    move-object v2, v0

    :goto_3
    if-eqz v2, :cond_5

    iget-object v3, p0, Lo00/b;->H:Lec3/h2;

    :cond_4
    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object p1, v4

    check-cast p1, Lo00/a;

    invoke-virtual {v2}, Ly00/c0;->h()Z

    move-result p3

    const/4 p2, 0x0

    const/16 v5, 0xf6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move/from16 p7, p2

    move-object p2, v1

    move/from16 p8, v5

    move-object p4, v6

    move-object p5, v7

    move-object p6, v8

    invoke-static/range {p1 .. p8}, Lo00/a;->a(Lo00/a;Ljava/lang/String;ZLh20/a;Ly00/i;Lzy/c;ZI)Lo00/a;

    move-result-object p1

    invoke-virtual {v3, v4, p1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lo00/b;->J:Lec3/h2;

    invoke-virtual {p0, v2}, Lo00/b;->j(Ly00/c0;)Lb30/m0;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v0, p2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    goto :goto_5

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Payment details with id "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " not found"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_4
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_5
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_6

    iget-object p2, p0, Lo00/b;->w:Lqy/d;

    const-string p3, "Failed to render payment update screen"

    invoke-virtual {p2, p3, p1}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lo00/b;->y:Ln40/g;

    iget-object p1, p1, Ln40/g;->a:Lec3/w1;

    sget-object p2, Ln40/d;->a:Ln40/d;

    invoke-virtual {p1, p2}, Lec3/w1;->a(Ljava/lang/Object;)Z

    :cond_6
    return-void
.end method

.method public static final g(Lo00/b;Lh20/a;)Ly00/d5;
    .locals 9

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p1, Lh20/a;->a:Ljava/lang/Integer;

    iget-object v3, p1, Lh20/a;->b:Ljava/lang/Integer;

    iget-object p0, p0, Lo00/b;->I:Lec3/r1;

    iget-object p0, p0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo00/a;

    iget-object p0, p0, Lo00/a;->f:Ly00/i;

    if-eqz p0, :cond_0

    new-instance v0, Ly00/r4;

    iget-object p0, p0, Ly00/i;->w:Ljava/lang/String;

    invoke-direct {v0, p0}, Ly00/r4;-><init>(Ljava/lang/String;)V

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    new-instance v0, Ly00/s4;

    const/4 v6, 0x0

    const/16 v8, 0x30

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v8}, Ly00/s4;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ly00/r4;I)V

    iget-object p0, p1, Lh20/a;->d:Ly00/v3;

    const/16 p1, 0xc

    invoke-static {v0, p0, p1}, Lt9/p;->h(Ly00/s4;Ly00/v3;I)Ly00/d5;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final j(Ly00/c0;)Lb30/m0;
    .locals 31

    move-object/from16 v2, p0

    move-object/from16 v0, p1

    iget-object v1, v2, Lo00/b;->I:Lec3/r1;

    iget-object v3, v1, Lec3/r1;->w:Lec3/f2;

    iget-object v8, v1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo00/a;

    invoke-virtual {v1}, Lo00/a;->b()Z

    move-result v1

    const/4 v3, 0x0

    iget-object v4, v2, Lo00/b;->x:Lxz/x;

    iget-object v5, v2, Lo00/b;->E:Lwz/g0;

    const/4 v9, 0x1

    const/4 v6, 0x0

    if-eqz v1, :cond_13

    iget-object v1, v4, Lxz/x;->a:Lxz/f0;

    iget-object v1, v1, Lxz/f0;->b:Lec3/r1;

    iget-object v1, v1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwz/d;

    iget-object v1, v1, Lwz/d;->w:Ld00/l;

    const-string v7, "configuration"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v1, :cond_0

    goto/16 :goto_a

    :cond_0
    iget-object v7, v5, Lwz/g0;->N:Lh20/l1;

    iget-object v10, v5, Lwz/g0;->O:Lh20/i1;

    if-eqz v10, :cond_1

    iget-object v11, v10, Lh20/i1;->x:Ljava/lang/String;

    if-nez v11, :cond_3

    :cond_1
    iget-object v11, v1, Ld00/l;->H:Ljava/lang/String;

    invoke-virtual {v7}, Lh20/l1;->f()Z

    move-result v12

    if-eqz v12, :cond_2

    goto :goto_0

    :cond_2
    move-object v11, v6

    :cond_3
    :goto_0
    if-eqz v10, :cond_4

    iget-object v12, v10, Lh20/i1;->z:Ljava/lang/String;

    if-nez v12, :cond_5

    :cond_4
    invoke-virtual {v1}, Ld00/l;->f()Ljava/lang/String;

    invoke-virtual {v7}, Lh20/l1;->i()Z

    :cond_5
    if-eqz v10, :cond_6

    iget-object v1, v10, Lh20/i1;->y:Ljava/lang/String;

    move-object v13, v1

    goto :goto_1

    :cond_6
    move-object v13, v6

    :goto_1
    if-eqz v10, :cond_7

    iget-object v1, v10, Lh20/i1;->w:Lh20/x0;

    goto :goto_2

    :cond_7
    move-object v1, v6

    :goto_2
    if-nez v1, :cond_8

    move-object v12, v6

    goto :goto_5

    :cond_8
    iget-object v14, v1, Lh20/x0;->y:Ljava/lang/String;

    iget-object v15, v1, Lh20/x0;->z:Ljava/lang/String;

    iget-object v7, v1, Lh20/x0;->w:Ljava/lang/String;

    iget-object v10, v1, Lh20/x0;->F:Ljava/lang/String;

    iget-object v12, v1, Lh20/x0;->E:Ljava/lang/String;

    iget-object v1, v1, Lh20/x0;->x:Ljava/lang/String;

    if-eqz v1, :cond_9

    sget-object v16, Lcom/stripe/android/core/model/CountryCode;->Companion:Lcom/stripe/android/core/model/b;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lcom/stripe/android/core/model/b;->a(Ljava/lang/String;)Lcom/stripe/android/core/model/CountryCode;

    move-result-object v1

    move-object/from16 v19, v1

    :goto_3
    move-object/from16 v18, v12

    goto :goto_4

    :cond_9
    move-object/from16 v19, v6

    goto :goto_3

    :goto_4
    new-instance v12, Ly00/y;

    move-object/from16 v17, v7

    move-object/from16 v16, v10

    invoke-direct/range {v12 .. v19}, Ly00/y;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/model/CountryCode;)V

    :goto_5
    invoke-virtual {v0}, Ly00/c0;->b()Ly00/y;

    move-result-object v1

    if-eqz v1, :cond_c

    if-eqz v12, :cond_a

    iget-object v7, v12, Ly00/y;->G:Lcom/stripe/android/core/model/CountryCode;

    goto :goto_6

    :cond_a
    move-object v7, v6

    :goto_6
    iget-object v10, v1, Ly00/y;->G:Lcom/stripe/android/core/model/CountryCode;

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    if-eqz v12, :cond_b

    iget-object v7, v12, Ly00/y;->F:Ljava/lang/String;

    goto :goto_7

    :cond_b
    move-object v7, v6

    :goto_7
    iget-object v1, v1, Ly00/y;->F:Ljava/lang/String;

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    move v1, v9

    goto :goto_8

    :cond_c
    move v1, v3

    :goto_8
    invoke-virtual {v0}, Ly00/c0;->b()Ly00/y;

    move-result-object v7

    if-eqz v7, :cond_e

    if-eqz v1, :cond_d

    goto :goto_9

    :cond_d
    invoke-virtual {v0}, Ly00/c0;->b()Ly00/y;

    move-result-object v12

    :cond_e
    :goto_9
    if-nez v11, :cond_f

    invoke-virtual {v0}, Ly00/c0;->f()Ljava/lang/String;

    move-result-object v11

    :cond_f
    instance-of v1, v0, Ly00/a0;

    if-eqz v1, :cond_10

    check-cast v0, Ly00/a0;

    const/16 v1, 0xfcf

    invoke-static {v0, v3, v12, v11, v1}, Ly00/a0;->i(Ly00/a0;ZLy00/y;Ljava/lang/String;I)Ly00/a0;

    move-result-object v0

    goto :goto_a

    :cond_10
    instance-of v1, v0, Ly00/x;

    if-eqz v1, :cond_11

    check-cast v0, Ly00/x;

    const/16 v1, 0x3f

    invoke-static {v0, v3, v12, v11, v1}, Ly00/x;->i(Ly00/x;ZLy00/y;Ljava/lang/String;I)Ly00/x;

    move-result-object v0

    goto :goto_a

    :cond_11
    instance-of v1, v0, Ly00/b0;

    if-eqz v1, :cond_12

    goto :goto_a

    :cond_12
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_13
    :goto_a
    instance-of v1, v0, Ly00/a0;

    if-eqz v1, :cond_14

    move-object v7, v0

    check-cast v7, Ly00/a0;

    goto :goto_b

    :cond_14
    move-object v7, v6

    :goto_b
    if-eqz v7, :cond_19

    new-instance v10, Lb30/y;

    iget-object v7, v7, Ly00/a0;->L:Ljava/util/List;

    check-cast v7, Ljava/lang/Iterable;

    new-instance v11, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v7, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_15

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    sget-object v13, Ly00/i;->M:Lt9/c0;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v12}, Lt9/c0;->i(Ljava/lang/String;)Ly00/i;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_15
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_16
    :goto_d
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_17

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Ly00/i;

    sget-object v14, Ly00/i;->X:Ly00/i;

    if-eq v13, v14, :cond_16

    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_17
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-le v7, v9, :cond_18

    move v3, v9

    :cond_18
    sget-object v7, Lux/f;->w:Lux/f;

    invoke-direct {v10, v7, v3, v9}, Lb30/y;-><init>(Lux/a;ZZ)V

    move-object v14, v10

    goto :goto_e

    :cond_19
    move-object v14, v6

    :goto_e
    iget-object v3, v5, Lwz/g0;->N:Lh20/l1;

    invoke-static {v2}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v16

    iget-object v4, v4, Lxz/x;->a:Lxz/f0;

    iget-object v4, v4, Lxz/f0;->b:Lec3/r1;

    iget-object v4, v4, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v4}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwz/d;

    iget-object v4, v4, Lwz/d;->w:Ld00/l;

    if-eqz v4, :cond_1a

    invoke-virtual {v4}, Ld00/l;->f()Ljava/lang/String;

    move-result-object v4

    goto :goto_f

    :cond_1a
    move-object v4, v6

    :goto_f
    if-eqz v1, :cond_1b

    move-object v1, v0

    check-cast v1, Ly00/a0;

    goto :goto_10

    :cond_1b
    move-object v1, v6

    :goto_10
    if-eqz v1, :cond_1c

    iget-object v5, v1, Ly00/a0;->z:Ljava/lang/String;

    move-object/from16 v18, v5

    goto :goto_11

    :cond_1c
    move-object/from16 v18, v6

    :goto_11
    if-eqz v1, :cond_1d

    iget v5, v1, Ly00/a0;->J:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v19, v5

    goto :goto_12

    :cond_1d
    move-object/from16 v19, v6

    :goto_12
    if-eqz v1, :cond_1e

    iget v5, v1, Ly00/a0;->I:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v20, v5

    goto :goto_13

    :cond_1e
    move-object/from16 v20, v6

    :goto_13
    if-eqz v1, :cond_20

    iget-object v5, v1, Ly00/a0;->K:Ly00/i;

    if-nez v5, :cond_1f

    goto :goto_15

    :cond_1f
    :goto_14
    move-object/from16 v21, v5

    goto :goto_16

    :cond_20
    :goto_15
    sget-object v5, Ly00/i;->X:Ly00/i;

    goto :goto_14

    :goto_16
    if-eqz v1, :cond_21

    iget-object v5, v1, Ly00/a0;->K:Ly00/i;

    if-eqz v5, :cond_21

    iget-object v5, v5, Ly00/i;->w:Ljava/lang/String;

    move-object/from16 v22, v5

    goto :goto_17

    :cond_21
    move-object/from16 v22, v6

    :goto_17
    if-eqz v1, :cond_22

    iget-object v1, v1, Ly00/a0;->L:Ljava/util/List;

    if-eqz v1, :cond_22

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    goto :goto_18

    :cond_22
    move-object v1, v6

    :goto_18
    if-eqz v1, :cond_23

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_19

    :cond_23
    move-object v5, v6

    :goto_19
    if-eqz v5, :cond_24

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v5

    if-le v5, v9, :cond_24

    move-object/from16 v23, v1

    goto :goto_1a

    :cond_24
    move-object/from16 v23, v6

    :goto_1a
    invoke-virtual {v0}, Ly00/c0;->b()Ly00/y;

    move-result-object v1

    if-eqz v1, :cond_26

    iget-object v5, v1, Ly00/y;->x:Ljava/lang/String;

    iget-object v7, v1, Ly00/y;->y:Ljava/lang/String;

    iget-object v10, v1, Ly00/y;->E:Ljava/lang/String;

    iget-object v11, v1, Ly00/y;->z:Ljava/lang/String;

    iget-object v12, v1, Ly00/y;->F:Ljava/lang/String;

    iget-object v1, v1, Ly00/y;->G:Lcom/stripe/android/core/model/CountryCode;

    if-eqz v1, :cond_25

    invoke-virtual {v1}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v26, v1

    goto :goto_1b

    :cond_25
    move-object/from16 v26, v6

    :goto_1b
    new-instance v24, Ly00/c;

    move-object/from16 v27, v5

    move-object/from16 v28, v7

    move-object/from16 v25, v10

    move-object/from16 v30, v11

    move-object/from16 v29, v12

    invoke-direct/range {v24 .. v30}, Ly00/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v24

    goto :goto_1c

    :cond_26
    move-object v1, v6

    :goto_1c
    invoke-virtual {v0}, Ly00/c0;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Ly00/c0;->b()Ly00/y;

    move-result-object v7

    if-eqz v7, :cond_27

    iget-object v7, v7, Ly00/y;->w:Ljava/lang/String;

    goto :goto_1d

    :cond_27
    move-object v7, v6

    :goto_1d
    new-instance v10, Ly00/v3;

    invoke-direct {v10, v1, v5, v7, v4}, Ly00/v3;-><init>(Ly00/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v17, Lb30/i1;

    move-object/from16 v24, v10

    invoke-direct/range {v17 .. v24}, Lb30/i1;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ly00/i;Ljava/lang/String;Ljava/util/Set;Ly00/v3;)V

    iget-object v1, v3, Lh20/l1;->w:Lh20/k1;

    iget-object v4, v3, Lh20/l1;->z:Lh20/j1;

    iget-object v5, v3, Lh20/l1;->y:Lh20/k1;

    iget-object v7, v3, Lh20/l1;->x:Lh20/k1;

    invoke-interface {v8}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lo00/a;

    invoke-virtual {v10}, Lo00/a;->b()Z

    move-result v10

    if-eqz v10, :cond_28

    move-object v6, v7

    :cond_28
    if-nez v6, :cond_29

    sget-object v6, Lh20/k1;->x:Lh20/k1;

    :cond_29
    move-object/from16 v20, v6

    iget-object v0, v0, Ly00/c0;->x:Ljava/lang/String;

    sget-object v6, Ly00/f4;->G:Lt9/c0;

    const-string v6, "card"

    invoke-virtual {v0, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2a

    sget-object v0, Lh20/j1;->x:Lh20/j1;

    if-ne v4, v0, :cond_2a

    sget-object v4, Lh20/j1;->w:Lh20/j1;

    :cond_2a
    move-object/from16 v22, v4

    iget-boolean v0, v3, Lh20/l1;->E:Z

    invoke-interface {v8}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo00/a;

    invoke-virtual {v4}, Lo00/a;->b()Z

    move-result v4

    if-eqz v4, :cond_2b

    invoke-virtual {v3}, Lh20/l1;->b()Ljava/util/Set;

    move-result-object v3

    :goto_1e
    move-object/from16 v24, v3

    goto :goto_1f

    :cond_2b
    sget-object v3, Lm83/a0;->w:Lm83/a0;

    goto :goto_1e

    :goto_1f
    new-instance v18, Lh20/l1;

    move/from16 v23, v0

    move-object/from16 v19, v1

    move-object/from16 v21, v5

    invoke-direct/range {v18 .. v24}, Lh20/l1;-><init>(Lh20/k1;Lh20/k1;Lh20/k1;Lh20/j1;ZLjava/util/Set;)V

    new-instance v0, Lm7/l0;

    const/4 v6, 0x0

    const/16 v7, 0x1a

    const/4 v1, 0x1

    const-class v3, Lo00/b;

    const-string v4, "onCardUpdateParamsChanged"

    const-string v5, "onCardUpdateParamsChanged$paymentsheet_release(Lcom/stripe/android/paymentsheet/CardUpdateParams;)V"

    invoke-direct/range {v0 .. v7}, Lm7/l0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object/from16 v13, v18

    move-object/from16 v18, v0

    new-instance v0, Lm7/l0;

    const/16 v7, 0x1b

    const-class v3, Lo00/b;

    const-string v4, "onBrandChoiceChanged"

    const-string v5, "onBrandChoiceChanged(Lcom/stripe/android/model/CardBrand;)V"

    move-object/from16 v2, p0

    invoke-direct/range {v0 .. v7}, Lm7/l0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-interface {v8}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo00/a;

    invoke-virtual {v1}, Lo00/a;->b()Z

    move-result v1

    xor-int/lit8 v15, v1, 0x1

    new-instance v11, Lb30/m0;

    move-object/from16 v12, v17

    move-object/from16 v17, v0

    invoke-direct/range {v11 .. v18}, Lb30/m0;-><init>(Lb30/i1;Lh20/l1;Lb30/y;ZLbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-object v11
.end method
