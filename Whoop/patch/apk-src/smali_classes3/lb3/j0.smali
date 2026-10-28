.class public final Llb3/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ls93/i;Ls93/i;)V
    .locals 2

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls93/b;

    invoke-interface {v1}, Ls93/b;->b()Lva3/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ls93/b;

    invoke-interface {p2}, Ls93/b;->b()Lva3/e;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final b(La00/g;Llb3/k0;)Llb3/c0;
    .locals 7

    const-string v0, "attributes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v1 .. v6}, Llb3/j0;->c(La00/g;Llb3/k0;ZIZ)Llb3/c0;

    move-result-object p1

    return-object p1
.end method

.method public final c(La00/g;Llb3/k0;ZIZ)Llb3/c0;
    .locals 8

    new-instance v0, Llb3/v0;

    sget-object v1, Llb3/g1;->y:Llb3/g1;

    iget-object v2, p1, La00/g;->y:Ljava/lang/Object;

    check-cast v2, Lr93/w0;

    move-object v3, v2

    check-cast v3, Ljb3/u;

    invoke-virtual {v3}, Ljb3/u;->L0()Llb3/c0;

    move-result-object v3

    invoke-direct {v0, v3, v1}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1, p4}, Llb3/j0;->d(Llb3/u0;La00/g;Lr93/x0;I)Llb3/u0;

    move-result-object p4

    invoke-virtual {p4}, Llb3/u0;->b()Llb3/y;

    move-result-object v0

    const-string v3, "getType(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lse/a;->t(Llb3/y;)Llb3/c0;

    move-result-object v0

    invoke-static {v0}, Llb3/o;->e(Llb3/y;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p4}, Llb3/u0;->a()Llb3/g1;

    invoke-virtual {v0}, Llb3/y;->getAnnotations()Ls93/i;

    move-result-object p4

    invoke-static {p2}, Llb3/h;->a(Llb3/k0;)Ls93/i;

    move-result-object v3

    invoke-virtual {p0, p4, v3}, Llb3/j0;->a(Ls93/i;Ls93/i;)V

    invoke-static {v0}, Llb3/o;->e(Llb3/y;)Z

    move-result p4

    if-eqz p4, :cond_1

    goto/16 :goto_3

    :cond_1
    invoke-static {v0}, Llb3/o;->e(Llb3/y;)Z

    move-result p4

    if-eqz p4, :cond_2

    invoke-virtual {v0}, Llb3/y;->Y()Llb3/k0;

    move-result-object p4

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Llb3/y;->Y()Llb3/k0;

    move-result-object p4

    sget-object v3, Llb3/k0;->x:Lwe/o;

    const-string v4, "other"

    invoke-static {p4, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lrb3/d;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p4}, Lrb3/d;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_3

    move-object p4, p2

    goto :goto_2

    :cond_3
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, v3, Lwe/o;->w:Ljava/lang/Object;

    check-cast v3, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v3

    const-string v5, "<get-values>(...)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    iget-object v6, p2, Lrb3/d;->w:Lrb3/a;

    invoke-virtual {v6, v5}, Lrb3/a;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Llb3/g;

    iget-object v7, p4, Lrb3/d;->w:Lrb3/a;

    invoke-virtual {v7, v5}, Lrb3/a;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Llb3/g;

    if-nez v6, :cond_5

    if-eqz v5, :cond_4

    invoke-virtual {v5, v6}, Llb3/g;->a(Llb3/g;)Llb3/g;

    move-result-object v5

    goto :goto_1

    :cond_4
    move-object v5, v1

    goto :goto_1

    :cond_5
    invoke-virtual {v6, v5}, Llb3/g;->a(Llb3/g;)Llb3/g;

    move-result-object v5

    :goto_1
    invoke-static {v4, v5}, Lub3/j;->a(Ljava/util/AbstractCollection;Ljava/lang/Object;)V

    goto :goto_0

    :cond_6
    invoke-static {v4}, Lwe/o;->l(Ljava/util/List;)Llb3/k0;

    move-result-object p4

    :goto_2
    const/4 v3, 0x1

    invoke-static {v0, v1, p4, v3}, Lse/a;->X(Llb3/c0;Ljava/util/List;Llb3/k0;I)Llb3/c0;

    move-result-object v0

    :goto_3
    invoke-static {v0, p3}, Llb3/d1;->i(Llb3/c0;Z)Llb3/c0;

    move-result-object p4

    if-eqz p5, :cond_7

    check-cast v2, Lu93/g;

    iget-object p5, v2, Lu93/g;->I:Lu93/f;

    const-string v0, "getTypeConstructor(...)"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, La00/g;->z:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;

    invoke-static {p1, v0, p2, p5, p3}, Llb3/o;->k(Ljava/util/List;Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Llb3/k0;Llb3/q0;Z)Llb3/c0;

    move-result-object p1

    invoke-static {p4, p1}, Llb3/o;->o(Llb3/c0;Llb3/c0;)Llb3/c0;

    move-result-object p1

    return-object p1

    :cond_7
    return-object p4
.end method

.method public final d(Llb3/u0;La00/g;Lr93/x0;I)Llb3/u0;
    .locals 13

    move/from16 v7, p4

    iget-object v1, p2, La00/g;->y:Ljava/lang/Object;

    check-cast v1, Lr93/w0;

    const/16 v2, 0x64

    if-gt v7, v2, :cond_1c

    invoke-virtual {p1}, Llb3/u0;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static/range {p3 .. p3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static/range {p3 .. p3}, Llb3/d1;->j(Lr93/x0;)Llb3/h0;

    move-result-object v1

    return-object v1

    :cond_0
    invoke-virtual {p1}, Llb3/u0;->b()Llb3/y;

    move-result-object v1

    const-string v2, "getType(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Llb3/y;->i0()Llb3/q0;

    move-result-object v3

    const-string v4, "constructor"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v3}, Llb3/q0;->d()Lr93/h;

    move-result-object v3

    instance-of v4, v3, Lr93/x0;

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    iget-object v4, p2, La00/g;->E:Ljava/lang/Object;

    check-cast v4, Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llb3/u0;

    goto :goto_0

    :cond_1
    move-object v3, v5

    :goto_0
    if-nez v3, :cond_c

    invoke-virtual {p1}, Llb3/u0;->b()Llb3/y;

    move-result-object v1

    invoke-virtual {v1}, Llb3/y;->p0()Llb3/f1;

    move-result-object v1

    invoke-static {v1}, Lse/a;->t(Llb3/y;)Llb3/c0;

    move-result-object v8

    invoke-static {v8}, Llb3/o;->e(Llb3/y;)Z

    move-result v1

    if-nez v1, :cond_b

    sget-object v1, Lpb3/a;->y:Lpb3/a;

    invoke-static {v8, v1, v5}, Llb3/d1;->c(Llb3/y;Lkotlin/jvm/functions/Function1;Lub3/h;)Z

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_3

    :cond_2
    invoke-virtual {v8}, Llb3/y;->i0()Llb3/q0;

    move-result-object v1

    invoke-interface {v1}, Llb3/q0;->d()Lr93/h;

    move-result-object v3

    invoke-interface {v1}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    invoke-virtual {v8}, Llb3/y;->X()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    instance-of v4, v3, Lr93/x0;

    if-eqz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    instance-of v4, v3, Lr93/w0;

    const/4 v9, 0x0

    if-eqz v4, :cond_7

    check-cast v3, Lr93/w0;

    invoke-virtual {p2, v3}, La00/g;->u(Lr93/w0;)Z

    move-result v2

    if-eqz v2, :cond_4

    new-instance v1, Llb3/v0;

    sget-object v2, Llb3/g1;->y:Llb3/g1;

    sget-object v4, Lnb3/k;->F:Lnb3/k;

    check-cast v3, Lu93/n;

    invoke-virtual {v3}, Lu93/n;->getName()Lva3/h;

    move-result-object v3

    iget-object v3, v3, Lva3/h;->w:Ljava/lang/String;

    const-string v5, "toString(...)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Lnb3/l;->c(Lnb3/k;[Ljava/lang/String;)Lnb3/i;

    move-result-object v3

    invoke-direct {v1, v3, v2}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    return-object v1

    :cond_4
    invoke-virtual {v8}, Llb3/y;->X()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v2, v10}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v4, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 v11, v9, 0x1

    if-ltz v9, :cond_5

    check-cast v10, Llb3/u0;

    invoke-interface {v1}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lr93/x0;

    add-int/lit8 v12, v7, 0x1

    invoke-virtual {p0, v10, p2, v9, v12}, Llb3/j0;->d(Llb3/u0;La00/g;Lr93/x0;I)Llb3/u0;

    move-result-object v9

    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v9, v11

    goto :goto_1

    :cond_5
    invoke-static {}, Lwb3/f;->d0()V

    throw v5

    :cond_6
    invoke-static {p2, v3, v4}, Le4/a;->r(La00/g;Lr93/w0;Ljava/util/List;)La00/g;

    move-result-object v1

    invoke-virtual {v8}, Llb3/y;->Y()Llb3/k0;

    move-result-object v2

    invoke-virtual {v8}, Llb3/y;->k0()Z

    move-result v3

    add-int/lit8 v4, v7, 0x1

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Llb3/j0;->c(La00/g;Llb3/k0;ZIZ)Llb3/c0;

    move-result-object v1

    invoke-virtual {p0, v8, p2, v7}, Llb3/j0;->e(Llb3/c0;La00/g;I)Llb3/c0;

    move-result-object v2

    invoke-static {v1, v2}, Llb3/o;->o(Llb3/c0;Llb3/c0;)Llb3/c0;

    move-result-object v1

    new-instance v2, Llb3/v0;

    invoke-virtual {p1}, Llb3/u0;->a()Llb3/g1;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    return-object v2

    :cond_7
    invoke-virtual {p0, v8, p2, v7}, Llb3/j0;->e(Llb3/c0;La00/g;I)Llb3/c0;

    move-result-object v1

    invoke-static {v1}, Llb3/a1;->d(Llb3/y;)Llb3/a1;

    invoke-virtual {v1}, Llb3/y;->X()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v6, v9, 0x1

    if-ltz v9, :cond_9

    check-cast v4, Llb3/u0;

    invoke-virtual {v4}, Llb3/u0;->c()Z

    move-result v7

    if-nez v7, :cond_8

    invoke-virtual {v4}, Llb3/u0;->b()Llb3/y;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Lpb3/a;->x:Lpb3/a;

    invoke-static {v4, v7, v5}, Llb3/d1;->c(Llb3/y;Lkotlin/jvm/functions/Function1;Lub3/h;)Z

    move-result v4

    if-nez v4, :cond_8

    invoke-virtual {v8}, Llb3/y;->X()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Llb3/u0;

    invoke-virtual {v8}, Llb3/y;->i0()Llb3/q0;

    move-result-object v4

    invoke-interface {v4}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr93/x0;

    :cond_8
    move v9, v6

    goto :goto_2

    :cond_9
    invoke-static {}, Lwb3/f;->d0()V

    throw v5

    :cond_a
    new-instance v2, Llb3/v0;

    invoke-virtual {p1}, Llb3/u0;->a()Llb3/g1;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    return-object v2

    :cond_b
    :goto_3
    return-object p1

    :cond_c
    invoke-virtual {v3}, Llb3/u0;->c()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-static/range {p3 .. p3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static/range {p3 .. p3}, Llb3/d1;->j(Lr93/x0;)Llb3/h0;

    move-result-object v1

    return-object v1

    :cond_d
    invoke-virtual {v3}, Llb3/u0;->b()Llb3/y;

    move-result-object v2

    invoke-virtual {v2}, Llb3/y;->p0()Llb3/f1;

    move-result-object v2

    invoke-virtual {v3}, Llb3/u0;->a()Llb3/g1;

    move-result-object v3

    const-string v4, "getProjectionKind(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Llb3/u0;->a()Llb3/g1;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-ne v6, v3, :cond_e

    goto :goto_4

    :cond_e
    sget-object v4, Llb3/g1;->y:Llb3/g1;

    if-ne v6, v4, :cond_f

    goto :goto_4

    :cond_f
    if-ne v3, v4, :cond_10

    move-object v3, v6

    :cond_10
    :goto_4
    if-eqz p3, :cond_11

    invoke-interface/range {p3 .. p3}, Lr93/x0;->getVariance()Llb3/g1;

    move-result-object v4

    if-nez v4, :cond_12

    :cond_11
    sget-object v4, Llb3/g1;->y:Llb3/g1;

    :cond_12
    if-ne v4, v3, :cond_13

    goto :goto_5

    :cond_13
    sget-object v6, Llb3/g1;->y:Llb3/g1;

    if-ne v4, v6, :cond_14

    goto :goto_5

    :cond_14
    if-ne v3, v6, :cond_15

    move-object v3, v6

    :cond_15
    :goto_5
    invoke-virtual {v1}, Llb3/y;->getAnnotations()Ls93/i;

    move-result-object v4

    invoke-virtual {v2}, Llb3/y;->getAnnotations()Ls93/i;

    move-result-object v6

    invoke-virtual {p0, v4, v6}, Llb3/j0;->a(Ls93/i;Ls93/i;)V

    invoke-static {v2}, Lse/a;->t(Llb3/y;)Llb3/c0;

    move-result-object v2

    invoke-virtual {v1}, Llb3/y;->k0()Z

    move-result v4

    invoke-static {v2, v4}, Llb3/d1;->i(Llb3/c0;Z)Llb3/c0;

    move-result-object v2

    invoke-virtual {v1}, Llb3/y;->Y()Llb3/k0;

    move-result-object v1

    invoke-static {v2}, Llb3/o;->e(Llb3/y;)Z

    move-result v4

    if-eqz v4, :cond_16

    goto/16 :goto_9

    :cond_16
    invoke-static {v2}, Llb3/o;->e(Llb3/y;)Z

    move-result v4

    if-eqz v4, :cond_17

    invoke-virtual {v2}, Llb3/y;->Y()Llb3/k0;

    move-result-object v1

    goto :goto_8

    :cond_17
    invoke-virtual {v2}, Llb3/y;->Y()Llb3/k0;

    move-result-object v4

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Llb3/k0;->x:Lwe/o;

    const-string v7, "other"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lrb3/d;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_18

    invoke-virtual {v4}, Lrb3/d;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_18

    goto :goto_8

    :cond_18
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iget-object v6, v6, Lwe/o;->w:Ljava/lang/Object;

    check-cast v6, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v6}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v6

    const-string v8, "<get-values>(...)"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    iget-object v9, v1, Lrb3/d;->w:Lrb3/a;

    invoke-virtual {v9, v8}, Lrb3/a;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Llb3/g;

    iget-object v10, v4, Lrb3/d;->w:Lrb3/a;

    invoke-virtual {v10, v8}, Lrb3/a;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Llb3/g;

    if-nez v9, :cond_1a

    if-eqz v8, :cond_19

    invoke-virtual {v8, v9}, Llb3/g;->a(Llb3/g;)Llb3/g;

    move-result-object v8

    goto :goto_7

    :cond_19
    move-object v8, v5

    goto :goto_7

    :cond_1a
    invoke-virtual {v9, v8}, Llb3/g;->a(Llb3/g;)Llb3/g;

    move-result-object v8

    :goto_7
    invoke-static {v7, v8}, Lub3/j;->a(Ljava/util/AbstractCollection;Ljava/lang/Object;)V

    goto :goto_6

    :cond_1b
    invoke-static {v7}, Lwe/o;->l(Ljava/util/List;)Llb3/k0;

    move-result-object v1

    :goto_8
    const/4 v4, 0x1

    invoke-static {v2, v5, v1, v4}, Lse/a;->X(Llb3/c0;Ljava/util/List;Llb3/k0;I)Llb3/c0;

    move-result-object v2

    :goto_9
    new-instance v1, Llb3/v0;

    invoke-direct {v1, v2, v3}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    return-object v1

    :cond_1c
    new-instance v2, Ljava/lang/AssertionError;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Too deep recursion while expanding type alias "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v1, Lu93/n;

    invoke-virtual {v1}, Lu93/n;->getName()Lva3/h;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v2
.end method

.method public final e(Llb3/c0;La00/g;I)Llb3/c0;
    .locals 8

    invoke-virtual {p1}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-virtual {p1}, Llb3/y;->X()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v6, v3, 0x1

    if-ltz v3, :cond_1

    check-cast v4, Llb3/u0;

    invoke-interface {v0}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr93/x0;

    add-int/lit8 v5, p3, 0x1

    invoke-virtual {p0, v4, p2, v3, v5}, Llb3/j0;->d(Llb3/u0;La00/g;Lr93/x0;I)Llb3/u0;

    move-result-object v3

    invoke-virtual {v3}, Llb3/u0;->c()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    new-instance v5, Llb3/v0;

    invoke-virtual {v3}, Llb3/u0;->a()Llb3/g1;

    move-result-object v7

    invoke-virtual {v3}, Llb3/u0;->b()Llb3/y;

    move-result-object v3

    invoke-virtual {v4}, Llb3/u0;->b()Llb3/y;

    move-result-object v4

    invoke-virtual {v4}, Llb3/y;->k0()Z

    move-result v4

    invoke-static {v3, v4}, Llb3/d1;->h(Llb3/y;Z)Llb3/y;

    move-result-object v3

    invoke-direct {v5, v3, v7}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    move-object v3, v5

    :goto_1
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v3, v6

    goto :goto_0

    :cond_1
    invoke-static {}, Lwb3/f;->d0()V

    throw v5

    :cond_2
    const/4 p2, 0x2

    invoke-static {p1, v2, v5, p2}, Lse/a;->X(Llb3/c0;Ljava/util/List;Llb3/k0;I)Llb3/c0;

    move-result-object p1

    return-object p1
.end method
