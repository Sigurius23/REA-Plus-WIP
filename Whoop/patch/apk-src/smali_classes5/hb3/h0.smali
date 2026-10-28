.class public final Lhb3/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lhb3/k;

.field public final b:Lhb3/h0;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Landroidx/lifecycle/h2;

.field public final f:Landroidx/lifecycle/h2;

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lhb3/k;Lhb3/h0;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, "typeParameterProtos"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "debugName"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb3/h0;->a:Lhb3/k;

    iput-object p2, p0, Lhb3/h0;->b:Lhb3/h0;

    iput-object p4, p0, Lhb3/h0;->c:Ljava/lang/String;

    iput-object p5, p0, Lhb3/h0;->d:Ljava/lang/String;

    iget-object p1, p1, Lhb3/k;->a:Lhb3/i;

    iget-object p1, p1, Lhb3/i;->a:Lkb3/k;

    new-instance p2, Lhb3/e0;

    const/4 p4, 0x0

    invoke-direct {p2, p0, p4}, Lhb3/e0;-><init>(Lhb3/h0;I)V

    invoke-virtual {p1, p2}, Lkb3/k;->c(Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/h2;

    move-result-object p2

    iput-object p2, p0, Lhb3/h0;->e:Landroidx/lifecycle/h2;

    new-instance p2, Lhb3/e0;

    const/4 p4, 0x1

    invoke-direct {p2, p0, p4}, Lhb3/e0;-><init>(Lhb3/h0;I)V

    invoke-virtual {p1, p2}, Lkb3/k;->c(Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/h2;

    move-result-object p1

    iput-object p1, p0, Lhb3/h0;->f:Landroidx/lifecycle/h2;

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lm83/z;->w:Lm83/z;

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 p3, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_1

    add-int/lit8 p4, p3, 0x1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lqa3/b1;

    iget v0, p5, Lqa3/b1;->z:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Ljb3/v;

    iget-object v2, p0, Lhb3/h0;->a:Lhb3/k;

    invoke-direct {v1, v2, p5, p3}, Ljb3/v;-><init>(Lhb3/k;Lqa3/b1;I)V

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move p3, p4

    goto :goto_0

    :cond_1
    :goto_1
    iput-object p1, p0, Lhb3/h0;->g:Ljava/lang/Object;

    return-void
.end method

.method public static a(Llb3/c0;Llb3/y;)Llb3/c0;
    .locals 7

    invoke-static {p0}, Lio/sentry/config/a;->z(Llb3/y;)Lo93/h;

    move-result-object v0

    invoke-virtual {p0}, Llb3/y;->getAnnotations()Ls93/i;

    move-result-object v1

    invoke-static {p0}, Lcom/squareup/wire/n;->L(Llb3/y;)Llb3/y;

    move-result-object v2

    invoke-static {p0}, Lcom/squareup/wire/n;->E(Llb3/y;)Ljava/util/List;

    move-result-object v3

    invoke-static {p0}, Lcom/squareup/wire/n;->N(Llb3/y;)Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v5, v4}, Lm83/s;->A0(ILjava/util/List;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    move-object v5, v4

    new-instance v4, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v5, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Llb3/u0;

    invoke-virtual {v6}, Llb3/u0;->b()Llb3/y;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v6, 0x1

    move-object v5, p1

    invoke-static/range {v0 .. v6}, Lcom/squareup/wire/n;->t(Lo93/h;Ls93/i;Llb3/y;Ljava/util/List;Ljava/util/ArrayList;Llb3/y;Z)Llb3/c0;

    move-result-object p1

    invoke-virtual {p0}, Llb3/y;->k0()Z

    move-result p0

    invoke-virtual {p1, p0}, Llb3/c0;->u0(Z)Llb3/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lqa3/w0;Lhb3/h0;)Ljava/util/ArrayList;
    .locals 2

    iget-object v0, p0, Lqa3/w0;->z:Ljava/util/List;

    const-string v1, "getArgumentList(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Collection;

    iget-object v1, p1, Lhb3/h0;->a:Lhb3/k;

    iget-object v1, v1, Lhb3/k;->d:Lsa3/h;

    invoke-static {p0, v1}, Ljc/x;->f0(Lqa3/w0;Lsa3/h;)Lqa3/w0;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0, p1}, Lhb3/h0;->e(Lqa3/w0;Lhb3/h0;)Ljava/util/ArrayList;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    sget-object p0, Lm83/y;->w:Lm83/y;

    :cond_1
    check-cast p0, Ljava/lang/Iterable;

    invoke-static {v0, p0}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static f(Ljava/util/List;Ls93/i;Llb3/q0;Lr93/k;)Llb3/k0;
    .locals 1

    check-cast p0, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    const/16 p3, 0xa

    invoke-static {p0, p3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p3

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Llb3/k;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Ls93/i;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_0

    sget-object p3, Llb3/k0;->x:Lwe/o;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p3, Llb3/k0;->y:Llb3/k0;

    goto :goto_1

    :cond_0
    sget-object p3, Llb3/k0;->x:Lwe/o;

    new-instance v0, Llb3/g;

    invoke-direct {v0, p1}, Llb3/g;-><init>(Ls93/i;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lwe/o;->l(Ljava/util/List;)Llb3/k0;

    move-result-object p3

    :goto_1
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {p2}, Lm83/u;->j0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p0

    sget-object p1, Llb3/k0;->x:Lwe/o;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, Lwe/o;->l(Ljava/util/List;)Llb3/k0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lhb3/h0;Lqa3/w0;I)Lr93/e;
    .locals 3

    iget-object v0, p0, Lhb3/h0;->a:Lhb3/k;

    iget-object v1, v0, Lhb3/k;->b:Lsa3/f;

    invoke-static {v1, p2}, Le93/b;->E(Lsa3/f;I)Lva3/c;

    move-result-object p2

    new-instance v1, Ls;

    const/4 v2, 0x7

    invoke-direct {v1, p0, v2}, Ls;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, v1}, Lxb3/k;->x(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lxb3/i;

    move-result-object p0

    sget-object p1, Lhb3/f0;->w:Lhb3/f0;

    invoke-static {p0, p1}, Lxb3/k;->A(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/s;

    move-result-object p0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lxb3/s;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    move-object v1, p0

    check-cast v1, Lo63/h;

    invoke-virtual {v1}, Lo63/h;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lo63/h;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object p0, Lhb3/g0;->w:Lhb3/g0;

    invoke-static {p2, p0}, Lxb3/k;->x(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lxb3/i;

    move-result-object p0

    invoke-static {p0}, Lxb3/k;->p(Lxb3/i;)I

    move-result p0

    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v1, p0, :cond_1

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    iget-object p0, v0, Lhb3/k;->a:Lhb3/i;

    iget-object p0, p0, Lhb3/i;->l:Lzt/q;

    invoke-virtual {p0, p2, p1}, Lzt/q;->t(Lva3/c;Ljava/util/List;)Lr93/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lhb3/h0;->g:Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final c(I)Lr93/x0;
    .locals 2

    iget-object v0, p0, Lhb3/h0;->g:Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr93/x0;

    if-nez v0, :cond_1

    iget-object v0, p0, Lhb3/h0;->b:Lhb3/h0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lhb3/h0;->c(I)Lr93/x0;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    return-object v0
.end method

.method public final d(Lqa3/w0;Z)Llb3/c0;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lhb3/h0;->a:Lhb3/k;

    iget-object v3, v2, Lhb3/k;->d:Lsa3/h;

    iget-object v4, v2, Lhb3/k;->a:Lhb3/i;

    iget-object v5, v2, Lhb3/k;->c:Lr93/k;

    const-string v6, "proto"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lqa3/w0;->p()Z

    move-result v6

    const/16 v7, 0x80

    if-eqz v6, :cond_0

    iget v6, v1, Lqa3/w0;->I:I

    iget-object v8, v2, Lhb3/k;->b:Lsa3/f;

    invoke-static {v8, v6}, Le93/b;->E(Lsa3/f;I)Lva3/c;

    move-result-object v6

    iget-boolean v6, v6, Lva3/c;->c:Z

    if-eqz v6, :cond_1

    iget-object v6, v2, Lhb3/k;->a:Lhb3/i;

    iget-object v6, v6, Lhb3/i;->g:Lhb3/j;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_0
    iget v6, v1, Lqa3/w0;->y:I

    and-int/2addr v6, v7

    if-ne v6, v7, :cond_1

    iget v6, v1, Lqa3/w0;->L:I

    iget-object v8, v2, Lhb3/k;->b:Lsa3/f;

    invoke-static {v8, v6}, Le93/b;->E(Lsa3/f;I)Lva3/c;

    move-result-object v6

    iget-boolean v6, v6, Lva3/c;->c:Z

    if-eqz v6, :cond_1

    iget-object v6, v2, Lhb3/k;->a:Lhb3/i;

    iget-object v6, v6, Lhb3/i;->g:Lhb3/j;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1
    :goto_0
    invoke-virtual {v1}, Lqa3/w0;->p()Z

    move-result v6

    const-string v8, "getTypeConstructor(...)"

    const/4 v10, 0x0

    if-eqz v6, :cond_2

    iget v2, v1, Lqa3/w0;->I:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v6, v0, Lhb3/h0;->e:Landroidx/lifecycle/h2;

    invoke-virtual {v6, v2}, Landroidx/lifecycle/h2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr93/h;

    if-nez v2, :cond_8

    iget v2, v1, Lqa3/w0;->I:I

    invoke-static {v0, v1, v2}, Lhb3/h0;->h(Lhb3/h0;Lqa3/w0;I)Lr93/e;

    move-result-object v2

    goto/16 :goto_2

    :cond_2
    iget v6, v1, Lqa3/w0;->y:I

    and-int/lit8 v11, v6, 0x20

    const/16 v12, 0x20

    if-ne v11, v12, :cond_3

    iget v2, v1, Lqa3/w0;->J:I

    invoke-virtual {v0, v2}, Lhb3/h0;->c(I)Lr93/x0;

    move-result-object v2

    if-nez v2, :cond_8

    sget-object v2, Lnb3/l;->a:Lnb3/l;

    sget-object v2, Lnb3/k;->O:Lnb3/k;

    iget v6, v1, Lqa3/w0;->J:I

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    iget-object v7, v0, Lhb3/h0;->d:Ljava/lang/String;

    filled-new-array {v6, v7}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Lnb3/l;->d(Lnb3/k;[Ljava/lang/String;)Lnb3/j;

    move-result-object v2

    goto/16 :goto_3

    :cond_3
    and-int/lit8 v11, v6, 0x40

    const/16 v12, 0x40

    if-ne v11, v12, :cond_7

    iget-object v2, v2, Lhb3/k;->b:Lsa3/f;

    iget v6, v1, Lqa3/w0;->K:I

    invoke-interface {v2, v6}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lhb3/h0;->b()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v11, v7

    check-cast v11, Lr93/x0;

    invoke-interface {v11}, Lr93/k;->getName()Lva3/h;

    move-result-object v11

    invoke-virtual {v11}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    goto :goto_1

    :cond_5
    const/4 v7, 0x0

    :goto_1
    move-object v6, v7

    check-cast v6, Lr93/x0;

    if-nez v6, :cond_6

    sget-object v6, Lnb3/l;->a:Lnb3/l;

    sget-object v6, Lnb3/k;->P:Lnb3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v2, v7}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v2}, Lnb3/l;->d(Lnb3/k;[Ljava/lang/String;)Lnb3/j;

    move-result-object v2

    goto :goto_3

    :cond_6
    move-object v2, v6

    goto :goto_2

    :cond_7
    and-int/lit16 v2, v6, 0x80

    if-ne v2, v7, :cond_9

    iget v2, v1, Lqa3/w0;->L:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v6, v0, Lhb3/h0;->f:Landroidx/lifecycle/h2;

    invoke-virtual {v6, v2}, Landroidx/lifecycle/h2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr93/h;

    if-nez v2, :cond_8

    iget v2, v1, Lqa3/w0;->L:I

    invoke-static {v0, v1, v2}, Lhb3/h0;->h(Lhb3/h0;Lqa3/w0;I)Lr93/e;

    move-result-object v2

    :cond_8
    :goto_2
    invoke-interface {v2}, Lr93/h;->e()Llb3/q0;

    move-result-object v2

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_9
    sget-object v2, Lnb3/l;->a:Lnb3/l;

    sget-object v2, Lnb3/k;->R:Lnb3/k;

    new-array v6, v10, [Ljava/lang/String;

    invoke-static {v2, v6}, Lnb3/l;->d(Lnb3/k;[Ljava/lang/String;)Lnb3/j;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Llb3/q0;->d()Lr93/h;

    move-result-object v6

    invoke-static {v6}, Lnb3/l;->f(Lr93/k;)Z

    move-result v6

    const/4 v7, 0x1

    if-eqz v6, :cond_a

    sget-object v1, Lnb3/l;->a:Lnb3/l;

    sget-object v1, Lnb3/k;->W:Lnb3/k;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/String;

    sget-object v4, Lm83/y;->w:Lm83/y;

    invoke-static {v1, v4, v2, v3}, Lnb3/l;->e(Lnb3/k;Ljava/util/List;Llb3/q0;[Ljava/lang/String;)Lnb3/i;

    move-result-object v1

    return-object v1

    :cond_a
    new-instance v6, Ljb3/a;

    iget-object v11, v4, Lhb3/i;->a:Lkb3/k;

    new-instance v12, Lce3/p;

    invoke-direct {v12, v0, v1, v10, v7}, Lce3/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    invoke-direct {v6, v11, v12}, Ljb3/a;-><init>(Lkb3/n;Lc93/a;)V

    iget-object v11, v4, Lhb3/i;->r:Ljava/util/List;

    invoke-static {v11, v6, v2, v5}, Lhb3/h0;->f(Ljava/util/List;Ls93/i;Llb3/q0;Lr93/k;)Llb3/k0;

    move-result-object v11

    invoke-static {v1, v0}, Lhb3/h0;->e(Lqa3/w0;Lhb3/h0;)Ljava/util/ArrayList;

    move-result-object v12

    new-instance v13, Ljava/util/ArrayList;

    const/16 v14, 0xa

    invoke-static {v12, v14}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    move v14, v10

    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_13

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    add-int/lit8 v16, v14, 0x1

    if-ltz v14, :cond_12

    check-cast v15, Lqa3/u0;

    invoke-interface {v2}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v10

    const/16 v17, 0x0

    const-string v9, "getParameters(...)"

    invoke-static {v10, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v14, v10}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lr93/x0;

    iget-object v10, v15, Lqa3/u0;->y:Lqa3/t0;

    sget-object v14, Lqa3/t0;->E:Lqa3/t0;

    if-ne v10, v14, :cond_c

    if-nez v9, :cond_b

    new-instance v9, Llb3/g0;

    iget-object v10, v4, Lhb3/i;->b:Lr93/b0;

    invoke-interface {v10}, Lr93/b0;->c()Lo93/h;

    move-result-object v10

    invoke-direct {v9, v10}, Llb3/g0;-><init>(Lo93/h;)V

    goto :goto_6

    :cond_b
    new-instance v10, Llb3/h0;

    invoke-direct {v10, v9}, Llb3/h0;-><init>(Lr93/x0;)V

    move-object v9, v10

    goto :goto_6

    :cond_c
    const-string v9, "getProjection(...)"

    invoke-static {v10, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    if-eqz v9, :cond_10

    if-eq v9, v7, :cond_f

    const/4 v14, 0x2

    if-eq v9, v14, :cond_e

    const/4 v1, 0x3

    if-eq v9, v1, :cond_d

    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_d
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Only IN, OUT and INV are supported. Actual argument: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_e
    sget-object v9, Llb3/g1;->y:Llb3/g1;

    goto :goto_5

    :cond_f
    sget-object v9, Llb3/g1;->E:Llb3/g1;

    goto :goto_5

    :cond_10
    sget-object v9, Llb3/g1;->z:Llb3/g1;

    :goto_5
    invoke-static {v15, v3}, Ljc/x;->x0(Lqa3/u0;Lsa3/h;)Lqa3/w0;

    move-result-object v10

    if-nez v10, :cond_11

    new-instance v9, Llb3/v0;

    sget-object v10, Lnb3/k;->b0:Lnb3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v14

    filled-new-array {v14}, [Ljava/lang/String;

    move-result-object v14

    invoke-static {v10, v14}, Lnb3/l;->c(Lnb3/k;[Ljava/lang/String;)Lnb3/i;

    move-result-object v10

    invoke-direct {v9, v10}, Llb3/v0;-><init>(Llb3/y;)V

    goto :goto_6

    :cond_11
    new-instance v14, Llb3/v0;

    invoke-virtual {v0, v10}, Lhb3/h0;->g(Lqa3/w0;)Llb3/y;

    move-result-object v10

    invoke-direct {v14, v10, v9}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    move-object v9, v14

    :goto_6
    invoke-virtual {v13, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v14, v16

    const/4 v10, 0x0

    goto/16 :goto_4

    :cond_12
    const/16 v17, 0x0

    invoke-static {}, Lwb3/f;->d0()V

    throw v17

    :cond_13
    const/16 v17, 0x0

    invoke-static {v13}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v9

    invoke-interface {v2}, Llb3/q0;->d()Lr93/h;

    move-result-object v10

    if-eqz p2, :cond_17

    instance-of v12, v10, Lr93/w0;

    if-eqz v12, :cond_17

    check-cast v10, Lr93/w0;

    new-instance v8, Llb3/j0;

    invoke-direct {v8}, Llb3/j0;-><init>()V

    move-object/from16 v12, v17

    invoke-static {v12, v10, v9}, Le4/a;->r(La00/g;Lr93/w0;Ljava/util/List;)La00/g;

    move-result-object v9

    sget-object v10, Llb3/k0;->x:Lwe/o;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, Llb3/k0;->y:Llb3/k0;

    invoke-virtual {v8, v9, v10}, Llb3/j0;->b(La00/g;Llb3/k0;)Llb3/c0;

    move-result-object v8

    iget-object v4, v4, Lhb3/i;->r:Ljava/util/List;

    invoke-virtual {v8}, Llb3/y;->getAnnotations()Ls93/i;

    move-result-object v9

    invoke-static {v6, v9}, Lm83/s;->d1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_14

    sget-object v6, Ls93/g;->a:Ls93/f;

    goto :goto_7

    :cond_14
    new-instance v9, Ls93/j;

    const/4 v10, 0x0

    invoke-direct {v9, v6, v10}, Ls93/j;-><init>(Ljava/util/List;I)V

    move-object v6, v9

    :goto_7
    invoke-static {v4, v6, v2, v5}, Lhb3/h0;->f(Ljava/util/List;Ls93/i;Llb3/q0;Lr93/k;)Llb3/k0;

    move-result-object v2

    invoke-static {v8}, Llb3/d1;->e(Llb3/y;)Z

    move-result v4

    if-nez v4, :cond_16

    iget-boolean v4, v1, Lqa3/w0;->E:Z

    if-eqz v4, :cond_15

    goto :goto_8

    :cond_15
    const/4 v7, 0x0

    :cond_16
    :goto_8
    invoke-virtual {v8, v7}, Llb3/c0;->u0(Z)Llb3/c0;

    move-result-object v4

    invoke-virtual {v4, v2}, Llb3/c0;->v0(Llb3/k0;)Llb3/c0;

    move-result-object v2

    goto/16 :goto_f

    :cond_17
    move-object/from16 v12, v17

    sget-object v4, Lsa3/d;->a:Lsa3/b;

    iget v6, v1, Lqa3/w0;->Q:I

    invoke-virtual {v4, v6}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_24

    iget-boolean v4, v1, Lqa3/w0;->E:Z

    invoke-interface {v2}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    sub-int/2addr v6, v10

    if-eqz v6, :cond_1a

    if-eq v6, v7, :cond_19

    :cond_18
    :goto_9
    move-object v4, v12

    goto/16 :goto_d

    :cond_19
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v5

    sub-int/2addr v5, v7

    if-ltz v5, :cond_18

    invoke-interface {v2}, Llb3/q0;->c()Lo93/h;

    move-result-object v6

    invoke-virtual {v6, v5}, Lo93/h;->w(I)Lr93/e;

    move-result-object v5

    invoke-interface {v5}, Lr93/h;->e()Llb3/q0;

    move-result-object v5

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9, v11, v5, v4}, Llb3/o;->i(Ljava/util/List;Llb3/k0;Llb3/q0;Z)Llb3/c0;

    move-result-object v4

    goto/16 :goto_d

    :cond_1a
    invoke-static {v9, v11, v2, v4}, Llb3/o;->i(Ljava/util/List;Llb3/k0;Llb3/q0;Z)Llb3/c0;

    move-result-object v4

    invoke-static {v4}, Lcom/squareup/wire/n;->Q(Llb3/c0;)Z

    move-result v6

    if-nez v6, :cond_1b

    goto :goto_9

    :cond_1b
    invoke-static {v4}, Lcom/squareup/wire/n;->N(Llb3/y;)Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Llb3/u0;

    if-eqz v6, :cond_18

    invoke-virtual {v6}, Llb3/u0;->b()Llb3/y;

    move-result-object v6

    if-nez v6, :cond_1c

    goto :goto_9

    :cond_1c
    invoke-virtual {v6}, Llb3/y;->i0()Llb3/q0;

    move-result-object v8

    invoke-interface {v8}, Llb3/q0;->d()Lr93/h;

    move-result-object v8

    if-eqz v8, :cond_1d

    invoke-static {v8}, Lcb3/e;->g(Lr93/k;)Lva3/e;

    move-result-object v8

    goto :goto_a

    :cond_1d
    move-object v8, v12

    :goto_a
    invoke-virtual {v6}, Llb3/y;->X()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    if-ne v10, v7, :cond_22

    sget-object v7, Lo93/n;->g:Lva3/e;

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1e

    invoke-static {}, Lhb3/i0;->a()Lva3/e;

    move-result-object v7

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1e

    goto :goto_d

    :cond_1e
    invoke-virtual {v6}, Llb3/y;->X()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lm83/s;->p1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Llb3/u0;

    invoke-virtual {v6}, Llb3/u0;->b()Llb3/y;

    move-result-object v6

    const-string v7, "getType(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v7, v5, Lr93/b;

    if-eqz v7, :cond_1f

    check-cast v5, Lr93/b;

    goto :goto_b

    :cond_1f
    move-object v5, v12

    :goto_b
    if-eqz v5, :cond_20

    invoke-static {v5}, Lcb3/e;->c(Lr93/l;)Lva3/e;

    move-result-object v5

    goto :goto_c

    :cond_20
    move-object v5, v12

    :goto_c
    sget-object v7, Lhb3/d0;->a:Lva3/e;

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_21

    invoke-static {v4, v6}, Lhb3/h0;->a(Llb3/c0;Llb3/y;)Llb3/c0;

    move-result-object v4

    goto :goto_d

    :cond_21
    invoke-static {v4, v6}, Lhb3/h0;->a(Llb3/c0;Llb3/y;)Llb3/c0;

    move-result-object v4

    :cond_22
    :goto_d
    if-nez v4, :cond_23

    sget-object v4, Lnb3/l;->a:Lnb3/l;

    sget-object v4, Lnb3/k;->Q:Lnb3/k;

    const/4 v10, 0x0

    new-array v5, v10, [Ljava/lang/String;

    invoke-static {v4, v9, v2, v5}, Lnb3/l;->e(Lnb3/k;Ljava/util/List;Llb3/q0;[Ljava/lang/String;)Lnb3/i;

    move-result-object v2

    goto :goto_f

    :cond_23
    :goto_e
    move-object v2, v4

    goto :goto_f

    :cond_24
    iget-boolean v4, v1, Lqa3/w0;->E:Z

    invoke-static {v9, v11, v2, v4}, Llb3/o;->i(Ljava/util/List;Llb3/k0;Llb3/q0;Z)Llb3/c0;

    move-result-object v2

    sget-object v4, Lsa3/d;->b:Lsa3/b;

    iget v5, v1, Lqa3/w0;->Q:I

    invoke-virtual {v4, v5}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_26

    invoke-static {v2, v7}, Llb3/d;->m(Llb3/f1;Z)Llb3/l;

    move-result-object v4

    if-eqz v4, :cond_25

    goto :goto_e

    :cond_25
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "null DefinitelyNotNullType for \'"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x27

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_26
    :goto_f
    invoke-static {v1, v3}, Ljc/x;->c(Lqa3/w0;Lsa3/h;)Lqa3/w0;

    move-result-object v1

    if-eqz v1, :cond_27

    const/4 v10, 0x0

    invoke-virtual {v0, v1, v10}, Lhb3/h0;->d(Lqa3/w0;Z)Llb3/c0;

    move-result-object v1

    invoke-static {v2, v1}, Llb3/o;->o(Llb3/c0;Llb3/c0;)Llb3/c0;

    move-result-object v1

    return-object v1

    :cond_27
    return-object v2
.end method

.method public final g(Lqa3/w0;)Llb3/y;
    .locals 5

    const-string v0, "proto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p1, Lqa3/w0;->y:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lhb3/h0;->a:Lhb3/k;

    iget-object v1, v0, Lhb3/k;->b:Lsa3/f;

    iget v3, p1, Lqa3/w0;->F:I

    invoke-interface {v1, v3}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v2}, Lhb3/h0;->d(Lqa3/w0;Z)Llb3/c0;

    move-result-object v3

    iget-object v4, v0, Lhb3/k;->d:Lsa3/h;

    invoke-static {p1, v4}, Ljc/x;->H(Lqa3/w0;Lsa3/h;)Lqa3/w0;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0, v4, v2}, Lhb3/h0;->d(Lqa3/w0;Z)Llb3/c0;

    move-result-object v2

    iget-object v0, v0, Lhb3/k;->a:Lhb3/i;

    iget-object v0, v0, Lhb3/i;->j:Lhb3/p;

    invoke-interface {v0, p1, v1, v3, v2}, Lhb3/p;->c(Lqa3/w0;Ljava/lang/String;Llb3/c0;Llb3/c0;)Llb3/y;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1, v2}, Lhb3/h0;->d(Lqa3/w0;Z)Llb3/c0;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lhb3/h0;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lhb3/h0;->b:Lhb3/h0;

    if-nez v1, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, ". Child of "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Lhb3/h0;->c:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
