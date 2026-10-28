.class public final Lja3/y;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final x:Lja3/a0;


# direct methods
.method public synthetic constructor <init>(Lja3/a0;I)V
    .locals 0

    iput p2, p0, Lja3/y;->w:I

    iput-object p1, p0, Lja3/y;->x:Lja3/a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    iget v1, v0, Lja3/y;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const-string v4, "name"

    iget-object v5, v0, Lja3/y;->x:Lja3/a0;

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Lva3/h;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, v5, Lja3/a0;->g:Landroidx/lifecycle/h2;

    invoke-virtual {v3, v1}, Landroidx/lifecycle/h2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lub3/j;->a(Ljava/util/AbstractCollection;Ljava/lang/Object;)V

    invoke-virtual {v5, v2, v1}, Lja3/a0;->g(Ljava/util/ArrayList;Lva3/h;)V

    invoke-virtual {v5}, Lja3/a0;->j()Lr93/k;

    move-result-object v1

    sget v3, Lya3/f;->a:I

    sget-object v3, Lr93/f;->E:Lr93/f;

    invoke-static {v1, v3}, Lya3/f;->l(Lr93/k;Lr93/f;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, v5, Lja3/a0;->b:Lzt/q;

    iget-object v3, v1, Lzt/q;->x:Ljava/lang/Object;

    check-cast v3, Lia3/a;

    iget-object v3, v3, Lia3/a;->r:Ljc/b;

    invoke-virtual {v3, v1, v2}, Ljc/b;->n(Lzt/q;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    :goto_0
    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Lva3/h;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ljava/util/LinkedHashSet;

    iget-object v6, v5, Lja3/a0;->f:Lkb3/e;

    invoke-virtual {v6, v1}, Lkb3/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Collection;

    invoke-direct {v4, v6}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lu93/q0;

    invoke-static {v9, v2}, Lio/sentry/config/a;->o(Lr93/w;I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_1

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    check-cast v10, Ljava/util/List;

    invoke-interface {v10, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    if-eq v7, v3, :cond_3

    check-cast v6, Ljava/util/Collection;

    sget-object v7, Lja3/m;->y:Lja3/m;

    invoke-static {v6, v7}, Lya3/r;->e(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    move-result-object v7

    invoke-interface {v4, v6}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    invoke-interface {v4, v7}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    :cond_4
    invoke-virtual {v5, v4, v1}, Lja3/a0;->f(Ljava/util/LinkedHashSet;Lva3/h;)V

    iget-object v1, v5, Lja3/a0;->b:Lzt/q;

    iget-object v2, v1, Lzt/q;->x:Ljava/lang/Object;

    check-cast v2, Lia3/a;

    iget-object v2, v2, Lia3/a;->r:Ljc/b;

    invoke-virtual {v2, v1, v4}, Ljc/b;->n(Lzt/q;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    return-object v1

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Lva3/h;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v5, Lja3/a0;->c:Lja3/a0;

    if-eqz v4, :cond_5

    iget-object v2, v4, Lja3/a0;->g:Landroidx/lifecycle/h2;

    invoke-virtual {v2, v1}, Landroidx/lifecycle/h2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr93/n0;

    goto/16 :goto_9

    :cond_5
    iget-object v4, v5, Lja3/a0;->e:Lkb3/i;

    invoke-virtual {v4}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lja3/c;

    invoke-interface {v4, v1}, Lja3/c;->d(Lva3/h;)Lx93/t;

    move-result-object v1

    const/4 v4, 0x0

    if-eqz v1, :cond_12

    invoke-virtual {v1}, Lx93/t;->l()Z

    move-result v6

    if-nez v6, :cond_12

    new-instance v6, Lkotlin/jvm/internal/g0;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1}, Lx93/v;->h()Z

    move-result v7

    xor-int/lit8 v11, v7, 0x1

    iget-object v7, v5, Lja3/a0;->b:Lzt/q;

    invoke-static {v7, v1}, Lhg3/i;->j0(Lzt/q;Lma3/b;)Lia3/c;

    move-result-object v9

    iget-object v8, v7, Lzt/q;->x:Ljava/lang/Object;

    move-object v15, v8

    check-cast v15, Lia3/a;

    invoke-virtual {v5}, Lja3/a0;->j()Lr93/k;

    move-result-object v8

    sget-object v10, Lr93/a0;->w:Lr93/v0;

    invoke-virtual {v1}, Lx93/v;->f()Lr93/m1;

    move-result-object v10

    invoke-static {v10}, Lse/h;->U(Lr93/m1;)Lr93/r;

    move-result-object v10

    invoke-virtual {v1}, Lx93/v;->d()Lva3/h;

    move-result-object v12

    iget-object v13, v15, Lia3/a;->j:Lw93/d;

    invoke-virtual {v13, v1}, Lw93/d;->c(Lma3/d;)Lw93/f;

    move-result-object v13

    invoke-virtual {v1}, Lx93/v;->h()Z

    move-result v14

    move/from16 v16, v2

    const/4 v2, 0x0

    if-eqz v14, :cond_6

    invoke-virtual {v1}, Lx93/v;->i()Z

    move-result v14

    if-eqz v14, :cond_6

    move v14, v3

    goto :goto_3

    :cond_6
    move v14, v2

    :goto_3
    invoke-static/range {v8 .. v14}, Lha3/f;->R0(Lr93/k;Lia3/c;Lr93/r;ZLva3/h;Lw93/f;Z)Lha3/f;

    move-result-object v8

    iput-object v8, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual {v8, v4, v4, v4, v4}, Lu93/m0;->N0(Lu93/n0;Lu93/o0;Lu93/v;Lu93/v;)V

    iget-object v8, v7, Lzt/q;->E:Ljava/lang/Object;

    check-cast v8, La3/p;

    invoke-virtual {v1}, Lx93/t;->k()Lma3/e;

    move-result-object v9

    sget-object v10, Llb3/b1;->x:Llb3/b1;

    const/4 v11, 0x7

    invoke-static {v10, v2, v4, v11}, Lv8/b;->W(Llb3/b1;ZLja3/f0;I)Lka3/a;

    move-result-object v10

    invoke-virtual {v8, v9, v10}, La3/p;->Z(Lma3/e;Lka3/a;)Llb3/y;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Lo93/h;->G(Llb3/y;)Z

    move-result v8

    if-nez v8, :cond_7

    invoke-static/range {v18 .. v18}, Lo93/h;->H(Llb3/y;)Z

    move-result v8

    if-eqz v8, :cond_8

    :cond_7
    invoke-virtual {v1}, Lx93/v;->h()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-virtual {v1}, Lx93/v;->i()Z

    move-result v8

    :cond_8
    iget-object v8, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object/from16 v17, v8

    check-cast v17, Lu93/m0;

    invoke-virtual {v5}, Lja3/a0;->i()Lr93/q0;

    move-result-object v20

    const/16 v21, 0x0

    sget-object v19, Lm83/y;->w:Lm83/y;

    move-object/from16 v22, v19

    invoke-virtual/range {v17 .. v22}, Lu93/m0;->Q0(Llb3/y;Ljava/util/List;Lr93/q0;Lu93/p0;Ljava/util/List;)V

    invoke-virtual {v5}, Lja3/a0;->j()Lr93/k;

    move-result-object v8

    instance-of v9, v8, Lr93/e;

    if-eqz v9, :cond_9

    check-cast v8, Lr93/e;

    goto :goto_4

    :cond_9
    move-object v8, v4

    :goto_4
    if-eqz v8, :cond_a

    iget-object v9, v15, Lia3/a;->x:Ldb3/e;

    iget-object v10, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v10, Lu93/m0;

    check-cast v9, Ldb3/a;

    invoke-virtual {v9, v8, v10, v7}, Ldb3/a;->h(Lr93/e;Lu93/m0;Lzt/q;)Lu93/m0;

    move-result-object v7

    iput-object v7, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :cond_a
    iget-object v7, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v8, v7

    check-cast v8, Lr93/b1;

    check-cast v7, Lu93/m0;

    invoke-virtual {v7}, Lu93/x0;->getType()Llb3/y;

    move-result-object v7

    if-eqz v8, :cond_11

    if-eqz v7, :cond_10

    sget v9, Lya3/f;->a:I

    invoke-interface {v8}, Lr93/b1;->A()Z

    move-result v9

    if-nez v9, :cond_e

    invoke-static {v7}, Llb3/o;->e(Llb3/y;)Z

    move-result v9

    if-eqz v9, :cond_b

    goto :goto_6

    :cond_b
    invoke-static {v7}, Llb3/d1;->b(Llb3/y;)Z

    move-result v9

    if-eqz v9, :cond_c

    goto :goto_5

    :cond_c
    invoke-static {v8}, Lcb3/e;->e(Lr93/k;)Lo93/h;

    move-result-object v8

    invoke-static {v7}, Lo93/h;->G(Llb3/y;)Z

    move-result v9

    if-nez v9, :cond_d

    sget-object v9, Lmb3/d;->a:Lmb3/l;

    invoke-virtual {v8}, Lo93/h;->v()Llb3/c0;

    move-result-object v10

    invoke-virtual {v9, v10, v7}, Lmb3/l;->a(Llb3/y;Llb3/y;)Z

    move-result v10

    if-nez v10, :cond_d

    const-string v10, "Number"

    invoke-virtual {v8, v10}, Lo93/h;->k(Ljava/lang/String;)Lr93/e;

    move-result-object v10

    invoke-interface {v10}, Lr93/e;->i()Llb3/c0;

    move-result-object v10

    invoke-virtual {v9, v10, v7}, Lmb3/l;->a(Llb3/y;Llb3/y;)Z

    move-result v10

    if-nez v10, :cond_d

    invoke-virtual {v8}, Lo93/h;->e()Llb3/c0;

    move-result-object v8

    invoke-virtual {v9, v8, v7}, Lmb3/l;->a(Llb3/y;Llb3/y;)Z

    move-result v8

    if-nez v8, :cond_d

    invoke-static {v7}, Lo93/r;->c(Llb3/y;)Z

    move-result v7

    if-eqz v7, :cond_e

    :cond_d
    :goto_5
    iget-object v7, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v7, Lu93/m0;

    new-instance v8, Lja3/x;

    invoke-direct {v8, v5, v1, v6, v2}, Lja3/x;-><init>(Lja3/a0;Lx93/t;Lkotlin/jvm/internal/g0;I)V

    invoke-virtual {v7, v4, v8}, Lu93/m0;->O0(Lkb3/h;Lc93/a;)V

    :cond_e
    :goto_6
    iget-object v1, v15, Lia3/a;->g:Lga3/h;

    iget-object v4, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v4, Lr93/n0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v4, :cond_f

    iget-object v1, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lr93/n0;

    goto :goto_9

    :cond_f
    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v4, 0x6

    packed-switch v4, :pswitch_data_1

    const-string v5, "fqName"

    aput-object v5, v1, v2

    goto :goto_7

    :pswitch_2
    const-string v5, "javaClass"

    aput-object v5, v1, v2

    goto :goto_7

    :pswitch_3
    const-string v5, "field"

    aput-object v5, v1, v2

    goto :goto_7

    :pswitch_4
    const-string v5, "element"

    aput-object v5, v1, v2

    goto :goto_7

    :pswitch_5
    const-string v5, "descriptor"

    aput-object v5, v1, v2

    goto :goto_7

    :pswitch_6
    const-string v5, "member"

    aput-object v5, v1, v2

    :goto_7
    const-string v2, "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1"

    aput-object v2, v1, v3

    packed-switch v4, :pswitch_data_2

    const-string v2, "getClassResolvedFromSource"

    aput-object v2, v1, v16

    goto :goto_8

    :pswitch_7
    const-string v2, "recordClass"

    aput-object v2, v1, v16

    goto :goto_8

    :pswitch_8
    const-string v2, "recordField"

    aput-object v2, v1, v16

    goto :goto_8

    :pswitch_9
    const-string v2, "recordConstructor"

    aput-object v2, v1, v16

    goto :goto_8

    :pswitch_a
    const-string v2, "recordMethod"

    aput-object v2, v1, v16

    :goto_8
    const-string v2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_10
    const/16 v1, 0x42

    invoke-static {v1}, Lya3/f;->a(I)V

    throw v4

    :cond_11
    const/16 v1, 0x41

    invoke-static {v1}, Lya3/f;->a(I)V

    throw v4

    :cond_12
    move-object v1, v4

    :goto_9
    return-object v1

    :pswitch_b
    move-object/from16 v1, p1

    check-cast v1, Lva3/h;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v5, Lja3/a0;->c:Lja3/a0;

    if-eqz v2, :cond_13

    iget-object v2, v2, Lja3/a0;->f:Lkb3/e;

    invoke-virtual {v2, v1}, Lkb3/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    goto :goto_b

    :cond_13
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, v5, Lja3/a0;->e:Lkb3/i;

    invoke-virtual {v3}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lja3/c;

    invoke-interface {v3, v1}, Lja3/c;->f(Lva3/h;)Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_14
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lx93/w;

    invoke-virtual {v5, v4}, Lja3/a0;->m(Lx93/w;)Lha3/e;

    move-result-object v4

    invoke-virtual {v5, v4}, Lja3/a0;->k(Lha3/e;)Z

    move-result v6

    if-eqz v6, :cond_14

    iget-object v6, v5, Lja3/a0;->b:Lzt/q;

    iget-object v6, v6, Lzt/q;->x:Ljava/lang/Object;

    check-cast v6, Lia3/a;

    iget-object v6, v6, Lia3/a;->g:Lga3/h;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_15
    invoke-virtual {v5, v2, v1}, Lja3/a0;->c(Ljava/util/ArrayList;Lva3/h;)V

    move-object v1, v2

    :goto_b
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_5
        :pswitch_3
        :pswitch_5
        :pswitch_2
        :pswitch_5
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
    .end packed-switch
.end method
