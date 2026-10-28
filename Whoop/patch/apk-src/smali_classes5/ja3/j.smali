.class public final Lja3/j;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Lzt/q;

.field public final y:Lja3/o;


# direct methods
.method public constructor <init>(Lja3/o;Lzt/q;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lja3/j;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lja3/j;->y:Lja3/o;

    iput-object p2, p0, Lja3/j;->x:Lzt/q;

    return-void
.end method

.method public constructor <init>(Lzt/q;Lja3/o;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lja3/j;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lja3/j;->x:Lzt/q;

    iput-object p2, p0, Lja3/j;->y:Lja3/o;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 29

    move-object/from16 v0, p0

    iget v1, v0, Lja3/j;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Lja3/j;->x:Lzt/q;

    iget-object v2, v1, Lzt/q;->x:Ljava/lang/Object;

    check-cast v2, Lia3/a;

    iget-object v2, v2, Lia3/a;->x:Ldb3/e;

    iget-object v3, v0, Lja3/j;->y:Lja3/o;

    iget-object v3, v3, Lja3/o;->n:Lr93/e;

    check-cast v2, Ldb3/a;

    invoke-virtual {v2, v3, v1}, Ldb3/a;->f(Lr93/e;Lzt/q;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    return-object v1

    :pswitch_0
    iget-object v2, v0, Lja3/j;->y:Lja3/o;

    iget-object v1, v2, Lja3/o;->o:Lx93/n;

    iget-object v9, v2, Lja3/a0;->b:Lzt/q;

    iget-object v10, v2, Lja3/o;->n:Lr93/e;

    iget-object v3, v1, Lx93/n;->a:Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v3

    const-string v4, "getDeclaredConstructors(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lm83/n;->X([Ljava/lang/Object;)Lxb3/i;

    move-result-object v3

    sget-object v4, Lx93/i;->w:Lx93/i;

    new-instance v5, Lxb3/f;

    const/4 v11, 0x0

    invoke-direct {v5, v3, v11, v4}, Lxb3/f;-><init>(Lxb3/i;ZLkotlin/jvm/functions/Function1;)V

    sget-object v3, Lx93/j;->w:Lx93/j;

    invoke-static {v5, v3}, Lxb3/k;->A(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/s;

    move-result-object v3

    invoke-static {v3}, Lxb3/k;->E(Lxb3/i;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lx93/q;

    invoke-static {v9, v5}, Lhg3/i;->j0(Lzt/q;Lma3/b;)Lia3/c;

    move-result-object v6

    iget-object v7, v9, Lzt/q;->x:Ljava/lang/Object;

    check-cast v7, Lia3/a;

    iget-object v8, v7, Lia3/a;->j:Lw93/d;

    invoke-virtual {v8, v5}, Lw93/d;->c(Lma3/d;)Lw93/f;

    move-result-object v8

    invoke-static {v10, v6, v11, v8}, Lha3/b;->a1(Lr93/e;Ls93/i;ZLw93/f;)Lha3/b;

    move-result-object v6

    invoke-interface {v10}, Lr93/e;->j()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    iget-object v12, v9, Lzt/q;->z:Ljava/lang/Object;

    new-instance v13, Lia3/e;

    invoke-direct {v13, v9, v6, v5, v8}, Lia3/e;-><init>(Lzt/q;Lr93/l;Lma3/f;I)V

    new-instance v8, Lzt/q;

    invoke-direct {v8, v7, v13, v12}, Lzt/q;-><init>(Lia3/a;Lia3/f;Ll83/h;)V

    invoke-virtual {v5}, Lx93/q;->k()Ljava/util/List;

    move-result-object v7

    invoke-static {v8, v6, v7}, Lja3/a0;->n(Lzt/q;Lu93/x;Ljava/util/List;)Lcom/iterable/iterableapi/g1;

    move-result-object v7

    invoke-interface {v10}, Lr93/e;->j()Ljava/util/List;

    move-result-object v12

    const-string v13, "getDeclaredTypeParameters(...)"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Ljava/util/Collection;

    invoke-virtual {v5}, Lx93/q;->getTypeParameters()Ljava/util/ArrayList;

    move-result-object v13

    new-instance v14, Ljava/util/ArrayList;

    const/16 v15, 0xa

    invoke-static {v13, v15}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_0

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lx93/b0;

    iget-object v11, v8, Lzt/q;->y:Ljava/lang/Object;

    check-cast v11, Lia3/f;

    invoke-interface {v11, v15}, Lia3/f;->a(Lx93/b0;)Lr93/x0;

    move-result-object v11

    invoke-static {v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v14, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v11, 0x0

    goto :goto_1

    :cond_0
    invoke-static {v12, v14}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v11

    invoke-virtual {v7}, Lcom/iterable/iterableapi/g1;->c()Ljava/util/List;

    move-result-object v12

    invoke-virtual {v5}, Lx93/v;->f()Lr93/m1;

    move-result-object v5

    invoke-static {v5}, Lse/h;->U(Lr93/m1;)Lr93/r;

    move-result-object v5

    invoke-virtual {v6, v12, v5, v11}, Lu93/j;->Y0(Ljava/util/List;Lr93/r;Ljava/util/List;)V

    const/4 v5, 0x0

    invoke-virtual {v6, v5}, Lha3/b;->R0(Z)V

    invoke-virtual {v7}, Lcom/iterable/iterableapi/g1;->d()Z

    move-result v5

    invoke-virtual {v6, v5}, Lha3/b;->S0(Z)V

    invoke-interface {v10}, Lr93/e;->i()Llb3/c0;

    move-result-object v5

    invoke-virtual {v6, v5}, Lu93/x;->T0(Llb3/c0;)V

    iget-object v5, v8, Lzt/q;->x:Ljava/lang/Object;

    check-cast v5, Lia3/a;

    iget-object v5, v5, Lia3/a;->g:Lga3/h;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v11, 0x0

    goto/16 :goto_0

    :cond_1
    invoke-virtual {v1}, Lx93/n;->g()Z

    move-result v3

    iget-object v5, v1, Lx93/n;->a:Ljava/lang/Class;

    const-string v11, "PROTECTED_AND_PACKAGE"

    const-string v12, "getVisibility(...)"

    const/4 v6, 0x6

    iget-object v13, v0, Lja3/j;->x:Lzt/q;

    const/4 v14, 0x1

    sget-object v7, Ls93/g;->a:Ls93/f;

    const/4 v8, 0x0

    if-eqz v3, :cond_7

    iget-object v3, v9, Lzt/q;->x:Ljava/lang/Object;

    check-cast v3, Lia3/a;

    iget-object v3, v3, Lia3/a;->j:Lw93/d;

    invoke-virtual {v3, v1}, Lw93/d;->c(Lma3/d;)Lw93/f;

    move-result-object v3

    invoke-static {v10, v7, v14, v3}, Lha3/b;->a1(Lr93/e;Ls93/i;ZLw93/f;)Lha3/b;

    move-result-object v17

    invoke-virtual {v1}, Lx93/n;->f()Ljava/util/ArrayList;

    move-result-object v3

    new-instance v15, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v14

    invoke-direct {v15, v14}, Ljava/util/ArrayList;-><init>(I)V

    sget-object v14, Llb3/b1;->x:Llb3/b1;

    const/4 v0, 0x0

    invoke-static {v14, v0, v8, v6}, Lv8/b;->W(Llb3/b1;ZLja3/f0;I)Lka3/a;

    move-result-object v14

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/16 v19, 0x0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    add-int/lit8 v3, v19, 0x1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v6, v16

    check-cast v6, Lx93/z;

    iget-object v8, v9, Lzt/q;->E:Ljava/lang/Object;

    check-cast v8, La3/p;

    move-object/from16 v28, v0

    invoke-virtual {v6}, Lx93/z;->j()Lma3/e;

    move-result-object v0

    invoke-virtual {v8, v0, v14}, La3/p;->Z(Lma3/e;Lka3/a;)Llb3/y;

    move-result-object v22

    new-instance v16, Lu93/w0;

    invoke-virtual {v6}, Lx93/v;->d()Lva3/h;

    move-result-object v21

    iget-object v0, v9, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    iget-object v0, v0, Lia3/a;->j:Lw93/d;

    invoke-virtual {v0, v6}, Lw93/d;->c(Lma3/d;)Lw93/f;

    move-result-object v27

    const/16 v18, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v20, v7

    invoke-direct/range {v16 .. v27}, Lu93/w0;-><init>(Lr93/b;Lr93/a1;ILs93/i;Lva3/h;Llb3/y;ZZZLlb3/y;Lr93/s0;)V

    move-object/from16 v6, v16

    move-object/from16 v0, v17

    invoke-virtual {v15, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v19, v3

    move-object/from16 v0, v28

    const/4 v6, 0x6

    const/4 v8, 0x0

    goto :goto_2

    :cond_2
    move-object/from16 v0, v17

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lha3/b;->S0(Z)V

    invoke-interface {v10}, Lr93/e;->getVisibility()Lr93/r;

    move-result-object v6

    invoke-static {v6, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, Lfa3/p;->b:Lfa3/o;

    invoke-virtual {v6, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    sget-object v6, Lfa3/p;->c:Lfa3/o;

    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    invoke-virtual {v0, v15, v6}, Lu93/j;->X0(Ljava/util/List;Lr93/r;)V

    invoke-virtual {v0, v3}, Lha3/b;->R0(Z)V

    invoke-interface {v10}, Lr93/e;->i()Llb3/c0;

    move-result-object v3

    invoke-virtual {v0, v3}, Lu93/x;->T0(Llb3/c0;)V

    const/4 v3, 0x2

    invoke-static {v0, v3}, Lio/sentry/config/a;->o(Lr93/w;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_6

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lu93/j;

    invoke-static {v14, v3}, Lio/sentry/config/a;->o(Lr93/w;I)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_5

    goto :goto_4

    :cond_6
    :goto_3
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v13, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    iget-object v0, v0, Lia3/a;->g:Lga3/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_7
    :goto_4
    iget-object v0, v13, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    iget-object v0, v0, Lia3/a;->x:Ldb3/e;

    check-cast v0, Ldb3/a;

    invoke-virtual {v0, v10, v4, v13}, Ldb3/a;->a(Lr93/e;Ljava/util/ArrayList;Lzt/q;)V

    iget-object v0, v13, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    iget-object v0, v0, Lia3/a;->r:Ljc/b;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-virtual {v5}, Ljava/lang/Class;->isAnnotation()Z

    move-result v3

    invoke-virtual {v5}, Ljava/lang/Class;->isInterface()Z

    if-nez v3, :cond_8

    const/4 v8, 0x0

    goto/16 :goto_d

    :cond_8
    iget-object v4, v9, Lzt/q;->x:Ljava/lang/Object;

    check-cast v4, Lia3/a;

    iget-object v5, v9, Lzt/q;->E:Ljava/lang/Object;

    move-object v14, v5

    check-cast v14, La3/p;

    iget-object v4, v4, Lia3/a;->j:Lw93/d;

    invoke-virtual {v4, v1}, Lw93/d;->c(Lma3/d;)Lw93/f;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v10, v7, v5, v4}, Lha3/b;->a1(Lr93/e;Ls93/i;ZLw93/f;)Lha3/b;

    move-result-object v4

    if-eqz v3, :cond_f

    invoke-virtual {v1}, Lx93/n;->d()Ljava/util/Collection;

    move-result-object v1

    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v6

    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    sget-object v6, Llb3/b1;->x:Llb3/b1;

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static {v6, v5, v8, v7}, Lv8/b;->W(Llb3/b1;ZLja3/f0;I)Lka3/a;

    move-result-object v15

    check-cast v1, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lx93/w;

    invoke-virtual {v8}, Lx93/v;->d()Lva3/h;

    move-result-object v8

    move-object/from16 v16, v1

    sget-object v1, Lfa3/x;->b:Lva3/h;

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_9
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_6
    move-object/from16 v1, v16

    goto :goto_5

    :cond_a
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    invoke-static {v5}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx93/w;

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Lx93/w;->l()Lx93/a0;

    move-result-object v5

    instance-of v7, v5, Lx93/h;

    if-eqz v7, :cond_b

    new-instance v7, Ll83/k;

    check-cast v5, Lx93/h;

    move-object/from16 v16, v1

    const/4 v8, 0x1

    invoke-virtual {v14, v5, v15, v8}, La3/p;->Y(Lx93/h;Lka3/a;Z)Llb3/f1;

    move-result-object v1

    invoke-virtual {v5}, Lx93/h;->c()Lx93/a0;

    move-result-object v5

    invoke-virtual {v14, v5, v15}, La3/p;->Z(Lma3/e;Lka3/a;)Llb3/y;

    move-result-object v5

    invoke-direct {v7, v1, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_7

    :cond_b
    move-object/from16 v16, v1

    new-instance v7, Ll83/k;

    invoke-virtual {v14, v5, v15}, La3/p;->Z(Lma3/e;Lka3/a;)Llb3/y;

    move-result-object v1

    const/4 v8, 0x0

    invoke-direct {v7, v1, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_7
    iget-object v1, v7, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Llb3/y;

    iget-object v5, v7, Ll83/k;->x:Ljava/lang/Object;

    move-object v8, v5

    check-cast v8, Llb3/y;

    const/4 v5, 0x0

    move-object v7, v1

    move-object v1, v6

    move-object/from16 v6, v16

    invoke-virtual/range {v2 .. v8}, Lja3/o;->o(Ljava/util/ArrayList;Lha3/b;ILx93/w;Llb3/y;Llb3/y;)V

    goto :goto_8

    :cond_c
    move-object/from16 v16, v1

    move-object v1, v6

    :goto_8
    if-eqz v16, :cond_d

    const/16 v16, 0x1

    goto :goto_9

    :cond_d
    const/16 v16, 0x0

    :goto_9
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v5, 0x0

    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_e

    add-int/lit8 v17, v5, 0x1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lx93/w;

    invoke-virtual {v6}, Lx93/w;->l()Lx93/a0;

    move-result-object v7

    invoke-virtual {v14, v7, v15}, La3/p;->Z(Lma3/e;Lka3/a;)Llb3/y;

    move-result-object v7

    add-int v5, v5, v16

    const/4 v8, 0x0

    invoke-virtual/range {v2 .. v8}, Lja3/o;->o(Ljava/util/ArrayList;Lha3/b;ILx93/w;Llb3/y;Llb3/y;)V

    move/from16 v5, v17

    goto :goto_a

    :cond_e
    :goto_b
    const/4 v5, 0x0

    goto :goto_c

    :cond_f
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_b

    :goto_c
    invoke-virtual {v4, v5}, Lha3/b;->S0(Z)V

    invoke-interface {v10}, Lr93/e;->getVisibility()Lr93/r;

    move-result-object v1

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lfa3/p;->b:Lfa3/o;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    sget-object v1, Lfa3/p;->c:Lfa3/o;

    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_10
    invoke-virtual {v4, v3, v1}, Lu93/j;->X0(Ljava/util/List;Lr93/r;)V

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Lha3/b;->R0(Z)V

    invoke-interface {v10}, Lr93/e;->i()Llb3/c0;

    move-result-object v1

    invoke-virtual {v4, v1}, Lu93/x;->T0(Llb3/c0;)V

    iget-object v1, v9, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Lia3/a;

    iget-object v1, v1, Lia3/a;->g:Lga3/h;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v8, v4

    :goto_d
    invoke-static {v8}, Lwb3/f;->L(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    :cond_11
    invoke-virtual {v0, v13, v4}, Ljc/b;->n(Lzt/q;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
