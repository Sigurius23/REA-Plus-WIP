.class public final Lja3/o;
.super Lja3/a0;
.source "SourceFile"


# static fields
.field public static final synthetic v:I


# instance fields
.field public final n:Lr93/e;

.field public final o:Lx93/n;

.field public final p:Z

.field public final q:Lkb3/i;

.field public final r:Lkb3/i;

.field public final s:Lkb3/i;

.field public final t:Lkb3/i;

.field public final u:Landroidx/lifecycle/h2;


# direct methods
.method public constructor <init>(Lzt/q;Lr93/e;Lx93/n;ZLja3/o;)V
    .locals 1

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jClass"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p5}, Lja3/a0;-><init>(Lzt/q;Lja3/o;)V

    iput-object p2, p0, Lja3/o;->n:Lr93/e;

    iput-object p3, p0, Lja3/o;->o:Lx93/n;

    iput-boolean p4, p0, Lja3/o;->p:Z

    iget-object p2, p1, Lzt/q;->x:Ljava/lang/Object;

    check-cast p2, Lia3/a;

    iget-object p2, p2, Lia3/a;->a:Lkb3/n;

    new-instance p3, Lja3/j;

    invoke-direct {p3, p0, p1}, Lja3/j;-><init>(Lja3/o;Lzt/q;)V

    move-object p4, p2

    check-cast p4, Lkb3/k;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p5, Lkb3/i;

    invoke-direct {p5, p4, p3}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object p5, p0, Lja3/o;->q:Lkb3/i;

    new-instance p3, Lja3/k;

    const/4 p4, 0x0

    invoke-direct {p3, p0, p4}, Lja3/k;-><init>(Lja3/o;I)V

    move-object p4, p2

    check-cast p4, Lkb3/k;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p5, Lkb3/i;

    invoke-direct {p5, p4, p3}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object p5, p0, Lja3/o;->r:Lkb3/i;

    new-instance p3, Lja3/j;

    invoke-direct {p3, p1, p0}, Lja3/j;-><init>(Lzt/q;Lja3/o;)V

    move-object p4, p2

    check-cast p4, Lkb3/k;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p5, Lkb3/i;

    invoke-direct {p5, p4, p3}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object p5, p0, Lja3/o;->s:Lkb3/i;

    new-instance p3, Lja3/k;

    const/4 p4, 0x1

    invoke-direct {p3, p0, p4}, Lja3/k;-><init>(Lja3/o;I)V

    move-object p4, p2

    check-cast p4, Lkb3/k;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p5, Lkb3/i;

    invoke-direct {p5, p4, p3}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object p5, p0, Lja3/o;->t:Lkb3/i;

    new-instance p3, Lja3/l;

    const/4 p4, 0x0

    invoke-direct {p3, p4, p0, p1}, Lja3/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    check-cast p2, Lkb3/k;

    invoke-virtual {p2, p3}, Lkb3/k;->c(Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/h2;

    move-result-object p1

    iput-object p1, p0, Lja3/o;->u:Landroidx/lifecycle/h2;

    return-void
.end method

.method public static C(Lu93/q0;Lr93/w;)Z
    .locals 4

    const/4 v0, 0x2

    invoke-static {p0, v0}, Lio/sentry/config/a;->o(Lr93/w;I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Lr93/w;->a()Lr93/w;

    move-result-object v2

    const-string v3, "getOriginal(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v0}, Lio/sentry/config/a;->o(Lr93/w;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Lja3/o;->w(Lr93/w;Lr93/w;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static t(Lu93/q0;Lr93/w;Ljava/util/AbstractCollection;)Lu93/q0;
    .locals 2

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu93/q0;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, v0, Lu93/x;->c0:Lr93/w;

    if-nez v1, :cond_1

    invoke-static {v0, p1}, Lja3/o;->w(Lr93/w;Lr93/w;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Lr93/w;->l0()Lr93/v;

    move-result-object p0

    invoke-interface {p0}, Lr93/v;->k()Lr93/v;

    move-result-object p0

    invoke-interface {p0}, Lr93/v;->build()Lr93/w;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p0, Lu93/q0;

    :cond_2
    :goto_0
    return-object p0
.end method

.method public static u(Lu93/q0;)Lu93/q0;
    .locals 5

    invoke-virtual {p0}, Lu93/x;->v()Ljava/util/List;

    move-result-object v0

    const-string v1, "getValueParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr93/a1;

    const/4 v2, 0x0

    if-eqz v0, :cond_5

    move-object v3, v0

    check-cast v3, Lu93/x0;

    invoke-virtual {v3}, Lu93/x0;->getType()Llb3/y;

    move-result-object v3

    invoke-virtual {v3}, Llb3/y;->i0()Llb3/q0;

    move-result-object v3

    invoke-interface {v3}, Llb3/q0;->d()Lr93/h;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-static {v3}, Lcb3/e;->h(Lr93/k;)Lva3/f;

    move-result-object v3

    invoke-virtual {v3}, Lva3/f;->d()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lva3/f;->i()Lva3/e;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v2

    :goto_1
    sget-object v4, Lo93/n;->g:Lva3/e;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    move-object v0, v2

    :goto_2
    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-interface {p0}, Lr93/w;->l0()Lr93/v;

    move-result-object v2

    invoke-virtual {p0}, Lu93/x;->v()Ljava/util/List;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-static {v1, p0}, Lm83/s;->A0(ILjava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-interface {v2, p0}, Lr93/v;->b(Ljava/util/List;)Lr93/v;

    move-result-object p0

    check-cast v0, Lu93/x0;

    invoke-virtual {v0}, Lu93/x0;->getType()Llb3/y;

    move-result-object v0

    invoke-virtual {v0}, Llb3/y;->X()Ljava/util/List;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb3/u0;

    invoke-virtual {v0}, Llb3/u0;->b()Llb3/y;

    move-result-object v0

    invoke-interface {p0, v0}, Lr93/v;->n(Llb3/y;)Lr93/v;

    move-result-object p0

    invoke-interface {p0}, Lr93/v;->build()Lr93/w;

    move-result-object p0

    check-cast p0, Lu93/q0;

    if-eqz p0, :cond_4

    iput-boolean v1, p0, Lu93/x;->V:Z

    :cond_4
    return-object p0

    :cond_5
    :goto_3
    return-object v2
.end method

.method public static w(Lr93/w;Lr93/w;)Z
    .locals 3

    sget-object v0, Lya3/n;->c:Lya3/n;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p0, v1}, Lya3/n;->n(Lr93/b;Lr93/b;Z)Lya3/m;

    move-result-object v0

    invoke-virtual {v0}, Lya3/m;->b()I

    move-result v0

    const-string v2, "getResult(...)"

    invoke-static {v0, v2}, Ljh3/c;->m(ILjava/lang/String;)V

    if-ne v0, v1, :cond_0

    invoke-static {p1, p0}, Ljc/x;->D(Lr93/b;Lr93/b;)Z

    move-result p0

    if-nez p0, :cond_0

    return v1

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static x(Lr93/n0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lu93/q0;
    .locals 4

    invoke-static {p1}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object p1

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lu93/q0;

    invoke-virtual {p2}, Lu93/x;->v()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    sget-object v1, Lmb3/d;->a:Lmb3/l;

    iget-object v2, p2, Lu93/x;->H:Llb3/y;

    if-nez v2, :cond_2

    const/4 v1, 0x0

    goto :goto_0

    :cond_2
    invoke-interface {p0}, Lr93/z0;->getType()Llb3/y;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lmb3/l;->b(Llb3/y;Llb3/y;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_3

    move-object v0, p2

    :cond_3
    :goto_1
    if-eqz v0, :cond_0

    :cond_4
    return-object v0
.end method

.method public static z(Lr93/n0;Lkotlin/jvm/functions/Function1;)Lu93/q0;
    .locals 5

    invoke-interface {p0}, Lr93/k;->getName()Lva3/h;

    move-result-object v0

    invoke-virtual {v0}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "asString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lfa3/w;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu93/q0;

    invoke-virtual {v0}, Lu93/x;->v()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, v0, Lu93/x;->H:Llb3/y;

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    sget-object v3, Lo93/h;->e:Lva3/h;

    sget-object v3, Lo93/m;->d:Lva3/f;

    invoke-static {v2, v3}, Lo93/h;->E(Llb3/y;Lva3/f;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    sget-object v2, Lmb3/d;->a:Lmb3/l;

    invoke-virtual {v0}, Lu93/x;->v()Ljava/util/List;

    move-result-object v3

    const-string v4, "getValueParameters(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lm83/s;->p1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr93/a1;

    check-cast v3, Lu93/x0;

    invoke-virtual {v3}, Lu93/x0;->getType()Llb3/y;

    move-result-object v3

    invoke-interface {p0}, Lr93/z0;->getType()Llb3/y;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lmb3/l;->a(Llb3/y;Llb3/y;)Z

    move-result v2

    if-eqz v2, :cond_4

    move-object v1, v0

    :cond_4
    :goto_0
    if-eqz v1, :cond_0

    :cond_5
    return-object v1
.end method


# virtual methods
.method public final A(Lva3/h;)Ljava/util/LinkedHashSet;
    .locals 4

    invoke-virtual {p0}, Lja3/o;->s()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llb3/y;

    invoke-virtual {v2}, Llb3/y;->u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v2

    sget-object v3, Lz93/c;->E:Lz93/c;

    invoke-interface {v2, p1, v3}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final B(Lva3/h;)Ljava/util/Set;
    .locals 5

    invoke-virtual {p0}, Lja3/o;->s()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llb3/y;

    invoke-virtual {v2}, Llb3/y;->u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v2

    sget-object v3, Lz93/c;->E:Lz93/c;

    invoke-interface {v2, p1, v3}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr93/n0;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-static {v1, v3}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public final D(Lu93/q0;)Z
    .locals 6

    invoke-virtual {p1}, Lu93/n;->getName()Lva3/h;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lse/b;->G(Lva3/h;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v2, v0, Ljava/util/Collection;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lva3/h;

    invoke-virtual {p0, v2}, Lja3/o;->B(Lva3/h;)Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    instance-of v3, v2, Ljava/util/Collection;

    if-eqz v3, :cond_2

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr93/n0;

    new-instance v4, Landroidx/room/d;

    const/4 v5, 0x2

    invoke-direct {v4, v5, p1, p0}, Landroidx/room/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v3, v4}, Lja3/o;->v(Lr93/n0;Lkotlin/jvm/functions/Function1;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Lr93/b1;->A()Z

    move-result v3

    if-nez v3, :cond_16

    invoke-virtual {p1}, Lu93/n;->getName()Lva3/h;

    move-result-object v3

    invoke-virtual {v3}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v3

    const-string v4, "asString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lfa3/w;->b(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_7

    :cond_4
    :goto_1
    sget-object v0, Lfa3/g0;->a:Ljava/util/ArrayList;

    invoke-virtual {p1}, Lu93/n;->getName()Lva3/h;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lfa3/g0;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lva3/h;

    if-nez v0, :cond_5

    goto/16 :goto_4

    :cond_5
    invoke-virtual {p0, v0}, Lja3/o;->A(Lva3/h;)Ljava/util/LinkedHashSet;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_6
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lu93/q0;

    invoke-static {v5}, Lse/g;->t(Lu93/q0;)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    invoke-interface {p1}, Lr93/w;->l0()Lr93/v;

    move-result-object v2

    invoke-interface {v2, v0}, Lr93/v;->d(Lva3/h;)Lr93/v;

    invoke-interface {v2}, Lr93/v;->z()Lr93/v;

    invoke-interface {v2}, Lr93/v;->s()Lr93/v;

    invoke-interface {v2}, Lr93/v;->build()Lr93/w;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v0, Lu93/q0;

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_4

    :cond_9
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu93/q0;

    invoke-static {v3}, Lfa3/c;->a(Lu93/q0;)Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-virtual {v0}, Lu93/q0;->V0()Lu93/q0;

    move-result-object v4

    goto :goto_3

    :cond_b
    move-object v4, v0

    :goto_3
    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v4, v3}, Lja3/o;->w(Lr93/w;Lr93/w;)Z

    move-result v3

    if-eqz v3, :cond_a

    goto/16 :goto_7

    :cond_c
    :goto_4
    sget v0, Lfa3/e;->l:I

    invoke-virtual {p1}, Lu93/n;->getName()Lva3/h;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lfa3/e;->b(Lva3/h;)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_6

    :cond_d
    invoke-virtual {p1}, Lu93/n;->getName()Lva3/h;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lja3/o;->A(Lva3/h;)Ljava/util/LinkedHashSet;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_e
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu93/q0;

    invoke-static {v3}, Lfa3/e;->a(Lr93/w;)Lr93/w;

    move-result-object v3

    if-eqz v3, :cond_e

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_f
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_10

    goto :goto_6

    :cond_10
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr93/w;

    invoke-static {p1, v2}, Lja3/o;->C(Lu93/q0;Lr93/w;)Z

    move-result v2

    if-eqz v2, :cond_11

    goto :goto_7

    :cond_12
    :goto_6
    invoke-static {p1}, Lja3/o;->u(Lu93/q0;)Lu93/q0;

    move-result-object v0

    if-nez v0, :cond_13

    goto :goto_8

    :cond_13
    invoke-virtual {p1}, Lu93/n;->getName()Lva3/h;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lja3/o;->A(Lva3/h;)Ljava/util/LinkedHashSet;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_14

    goto :goto_8

    :cond_14
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_15
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu93/q0;

    invoke-interface {v1}, Lr93/w;->isSuspend()Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-static {v0, v1}, Lja3/o;->w(Lr93/w;Lr93/w;)Z

    move-result v1

    if-eqz v1, :cond_15

    :cond_16
    :goto_7
    const/4 p1, 0x0

    return p1

    :cond_17
    :goto_8
    const/4 p1, 0x1

    return p1
.end method

.method public final E(Lva3/h;)Ljava/util/ArrayList;
    .locals 2

    iget-object v0, p0, Lja3/a0;->e:Lkb3/i;

    invoke-virtual {v0}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lja3/c;

    invoke-interface {v0, p1}, Lja3/c;->f(Lva3/h;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx93/w;

    invoke-virtual {p0, v1}, Lja3/a0;->m(Lx93/w;)Lha3/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final F(Lva3/h;)Ljava/util/ArrayList;
    .locals 4

    invoke-virtual {p0, p1}, Lja3/o;->A(Lva3/h;)Ljava/util/LinkedHashSet;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lu93/q0;

    invoke-static {v2}, Lse/g;->t(Lu93/q0;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v2}, Lfa3/e;->a(Lr93/w;)Lr93/w;

    move-result-object v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public final a(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;
    .locals 0

    const-string p2, "kindFilter"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lja3/o;->r:Lkb3/i;

    invoke-virtual {p1}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    iget-object p2, p0, Lja3/o;->t:Lkb3/i;

    invoke-virtual {p2}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p1, p2}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/reflect/jvm/internal/impl/resolve/scopes/l;)Ljava/util/Set;
    .locals 4

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lja3/o;->n:Lr93/e;

    invoke-interface {v0}, Lr93/h;->e()Llb3/q0;

    move-result-object v1

    invoke-interface {v1}, Llb3/q0;->getSupertypes()Ljava/util/Collection;

    move-result-object v1

    const-string v2, "getSupertypes(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llb3/y;

    invoke-virtual {v3}, Llb3/y;->u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v3

    invoke-interface {v3}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getFunctionNames()Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v2, v3}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lja3/a0;->e:Lkb3/i;

    invoke-virtual {v1}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lja3/c;

    invoke-interface {v3}, Lja3/c;->a()Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-virtual {v2, v3}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v1}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lja3/c;

    invoke-interface {v1}, Lja3/c;->b()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v2, v1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0, p1, p2}, Lja3/o;->a(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Lja3/a0;->b:Lzt/q;

    iget-object p2, p1, Lzt/q;->x:Ljava/lang/Object;

    check-cast p2, Lia3/a;

    iget-object p2, p2, Lia3/a;->x:Ldb3/e;

    check-cast p2, Ldb3/a;

    invoke-virtual {p2, v0, p1}, Ldb3/a;->e(Lr93/e;Lzt/q;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    return-object v2
.end method

.method public final c(Ljava/util/ArrayList;Lva3/h;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "name"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, Lja3/o;->o:Lx93/n;

    invoke-virtual {v3}, Lx93/n;->g()Z

    move-result v3

    iget-object v4, v0, Lja3/o;->n:Lr93/e;

    iget-object v5, v0, Lja3/a0;->b:Lzt/q;

    if-eqz v3, :cond_3

    iget-object v3, v0, Lja3/a0;->e:Lkb3/i;

    invoke-virtual {v3}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lja3/c;

    invoke-interface {v6, v2}, Lja3/c;->e(Lva3/h;)Lx93/z;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lu93/q0;

    invoke-virtual {v7}, Lu93/x;->v()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {v3}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lja3/c;

    invoke-interface {v3, v2}, Lja3/c;->e(Lva3/h;)Lx93/z;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v5, v3}, Lhg3/i;->j0(Lzt/q;Lma3/b;)Lia3/c;

    move-result-object v6

    iget-object v7, v5, Lzt/q;->x:Ljava/lang/Object;

    check-cast v7, Lia3/a;

    invoke-virtual {v3}, Lx93/v;->d()Lva3/h;

    move-result-object v8

    iget-object v9, v7, Lia3/a;->j:Lw93/d;

    invoke-virtual {v9, v3}, Lw93/d;->c(Lma3/d;)Lw93/f;

    move-result-object v9

    const/4 v10, 0x1

    invoke-static {v4, v6, v8, v9, v10}, Lha3/e;->Y0(Lr93/k;Lia3/c;Lva3/h;Lw93/f;Z)Lha3/e;

    move-result-object v11

    sget-object v6, Llb3/b1;->x:Llb3/b1;

    const/4 v8, 0x0

    const/4 v9, 0x6

    const/4 v10, 0x0

    invoke-static {v6, v10, v8, v9}, Lv8/b;->W(Llb3/b1;ZLja3/f0;I)Lka3/a;

    move-result-object v6

    iget-object v8, v5, Lzt/q;->E:Ljava/lang/Object;

    check-cast v8, La3/p;

    invoke-virtual {v3}, Lx93/z;->j()Lma3/e;

    move-result-object v3

    invoke-virtual {v8, v3, v6}, La3/p;->Z(Lma3/e;Lka3/a;)Llb3/y;

    move-result-object v17

    invoke-virtual {v0}, Lja3/o;->i()Lr93/q0;

    move-result-object v13

    sget-object v3, Lr93/a0;->w:Lr93/v0;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v18, Lr93/a0;->z:Lr93/a0;

    sget-object v19, Lr93/q;->e:Lr93/p;

    const/16 v20, 0x0

    const/4 v12, 0x0

    sget-object v14, Lm83/y;->w:Lm83/y;

    move-object v15, v14

    move-object/from16 v16, v14

    invoke-virtual/range {v11 .. v20}, Lha3/e;->X0(Lr93/q0;Lr93/q0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Llb3/y;Lr93/a0;Lr93/r;Ljava/util/Map;)Lu93/q0;

    invoke-static {v10, v10}, Lev/n;->a(ZZ)I

    move-result v3

    iput v3, v11, Lha3/e;->e0:I

    iget-object v3, v7, Lia3/a;->g:Lga3/h;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_1
    iget-object v3, v5, Lzt/q;->x:Ljava/lang/Object;

    check-cast v3, Lia3/a;

    iget-object v3, v3, Lia3/a;->x:Ldb3/e;

    check-cast v3, Ldb3/a;

    invoke-virtual {v3, v4, v2, v1, v5}, Ldb3/a;->b(Lr93/e;Lva3/h;Ljava/util/ArrayList;Lzt/q;)V

    return-void
.end method

.method public final d()Lja3/c;
    .locals 3

    new-instance v0, Lja3/a;

    iget-object v1, p0, Lja3/o;->o:Lx93/n;

    sget-object v2, Lja3/m;->x:Lja3/m;

    invoke-direct {v0, v1, v2}, Lja3/a;-><init>(Lx93/n;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public final f(Ljava/util/LinkedHashSet;Lva3/h;)V
    .locals 10

    const-string v3, "name"

    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lja3/o;->A(Lva3/h;)Ljava/util/LinkedHashSet;

    move-result-object v4

    sget-object v3, Lfa3/g0;->a:Ljava/util/ArrayList;

    sget-object v3, Lfa3/g0;->j:Ljava/util/HashSet;

    invoke-virtual {v3, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-static {p2}, Lfa3/e;->b(Lva3/h;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr93/w;

    invoke-interface {v5}, Lr93/w;->isSuspend()Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_2

    :cond_2
    :goto_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lu93/q0;

    invoke-virtual {p0, v6}, Lja3/o;->D(Lu93/q0;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    const/4 v4, 0x0

    invoke-virtual {p0, p1, p2, v3, v4}, Lja3/o;->p(Ljava/util/LinkedHashSet;Lva3/h;Ljava/util/ArrayList;Z)V

    return-void

    :cond_5
    :goto_2
    sget v3, Lub3/h;->y:I

    invoke-static {}, Lub3/j;->c()Lub3/h;

    move-result-object v9

    iget-object v3, p0, Lja3/a0;->b:Lzt/q;

    iget-object v3, v3, Lzt/q;->x:Ljava/lang/Object;

    check-cast v3, Lia3/a;

    iget-object v3, v3, Lia3/a;->u:Lmb3/k;

    check-cast v3, Lmb3/l;

    iget-object v8, v3, Lmb3/l;->d:Lya3/n;

    sget-object v5, Lm83/y;->w:Lm83/y;

    iget-object v6, p0, Lja3/o;->n:Lr93/e;

    sget-object v7, Lhb3/o;->a:Lhb3/j;

    move-object v3, p2

    invoke-static/range {v3 .. v8}, Lbi/g;->U(Lva3/h;Ljava/util/AbstractCollection;Ljava/util/Collection;Lr93/e;Lhb3/o;Lya3/n;)Ljava/util/LinkedHashSet;

    move-result-object v1

    move-object v6, v4

    new-instance v5, Lg40/f4;

    const/16 v3, 0xd

    invoke-direct {v5, p0, v3}, Lg40/f4;-><init>(Lja3/o;I)V

    move-object v4, p1

    move-object v0, p0

    move-object v2, p1

    move-object v3, v1

    move-object v1, p2

    invoke-virtual/range {v0 .. v5}, Lja3/o;->q(Lva3/h;Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;Ljava/util/AbstractSet;Lkotlin/jvm/functions/Function1;)V

    new-instance v5, Lg40/f4;

    const/16 v1, 0xe

    invoke-direct {v5, p0, v1}, Lg40/f4;-><init>(Lja3/o;I)V

    move-object v1, p2

    move-object v4, v9

    invoke-virtual/range {v0 .. v5}, Lja3/o;->q(Lva3/h;Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;Ljava/util/AbstractSet;Lkotlin/jvm/functions/Function1;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_6
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lu93/q0;

    invoke-virtual {p0, v7}, Lja3/o;->D(Lu93/q0;)Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    invoke-static {v3, v4}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {p0, p1, p2, v3, v4}, Lja3/o;->p(Ljava/util/LinkedHashSet;Lva3/h;Ljava/util/ArrayList;Z)V

    return-void
.end method

.method public final g(Ljava/util/ArrayList;Lva3/h;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    move-object/from16 v1, p2

    const-string v2, "name"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lja3/o;->o:Lx93/n;

    iget-object v2, v2, Lx93/n;->a:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Class;->isAnnotation()Z

    move-result v2

    const/4 v4, 0x0

    iget-object v5, v0, Lja3/a0;->b:Lzt/q;

    const/4 v6, 0x0

    if-eqz v2, :cond_1

    iget-object v2, v0, Lja3/a0;->e:Lkb3/i;

    invoke-virtual {v2}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lja3/c;

    invoke-interface {v2, v1}, Lja3/c;->f(Lva3/h;)Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lm83/s;->q1(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx93/w;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v7, Lr93/a0;->w:Lr93/v0;

    invoke-static {v5, v2}, Lhg3/i;->j0(Lzt/q;Lma3/b;)Lia3/c;

    move-result-object v9

    invoke-virtual {v2}, Lx93/v;->f()Lr93/m1;

    move-result-object v7

    invoke-static {v7}, Lse/h;->U(Lr93/m1;)Lr93/r;

    move-result-object v10

    invoke-virtual {v2}, Lx93/v;->d()Lva3/h;

    move-result-object v12

    iget-object v7, v5, Lzt/q;->x:Ljava/lang/Object;

    check-cast v7, Lia3/a;

    iget-object v7, v7, Lia3/a;->j:Lw93/d;

    invoke-virtual {v7, v2}, Lw93/d;->c(Lma3/d;)Lw93/f;

    move-result-object v13

    const/4 v14, 0x0

    iget-object v8, v0, Lja3/o;->n:Lr93/e;

    const/4 v11, 0x0

    invoke-static/range {v8 .. v14}, Lha3/f;->R0(Lr93/k;Lia3/c;Lr93/r;ZLva3/h;Lw93/f;Z)Lha3/f;

    move-result-object v15

    sget-object v7, Ls93/g;->a:Ls93/f;

    invoke-static {v15, v7}, Lya3/p;->e(Lr93/n0;Ls93/i;)Lu93/n0;

    move-result-object v7

    invoke-virtual {v15, v7, v6, v6, v6}, Lu93/m0;->N0(Lu93/n0;Lu93/o0;Lu93/v;Lu93/v;)V

    const-string v8, "<this>"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v8, v5, Lzt/q;->z:Ljava/lang/Object;

    iget-object v9, v5, Lzt/q;->x:Ljava/lang/Object;

    check-cast v9, Lia3/a;

    new-instance v10, Lia3/e;

    invoke-direct {v10, v5, v15, v2, v4}, Lia3/e;-><init>(Lzt/q;Lr93/l;Lma3/f;I)V

    new-instance v11, Lzt/q;

    invoke-direct {v11, v9, v10, v8}, Lzt/q;-><init>(Lia3/a;Lia3/f;Ll83/h;)V

    invoke-static {v2, v11}, Lja3/a0;->e(Lx93/w;Lzt/q;)Llb3/y;

    move-result-object v16

    invoke-virtual {v0}, Lja3/o;->i()Lr93/q0;

    move-result-object v18

    const/16 v19, 0x0

    sget-object v17, Lm83/y;->w:Lm83/y;

    move-object/from16 v20, v17

    invoke-virtual/range {v15 .. v20}, Lu93/m0;->Q0(Llb3/y;Ljava/util/List;Lr93/q0;Lu93/p0;Ljava/util/List;)V

    move-object/from16 v2, v16

    iput-object v2, v7, Lu93/n0;->N:Llb3/y;

    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    invoke-virtual {v0, v1}, Lja3/o;->B(Lva3/h;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_2

    return-void

    :cond_2
    sget v7, Lub3/h;->y:I

    invoke-static {}, Lub3/j;->c()Lub3/h;

    move-result-object v7

    invoke-static {}, Lub3/j;->c()Lub3/h;

    move-result-object v8

    new-instance v9, Lja3/n;

    invoke-direct {v9, v0, v4}, Lja3/n;-><init>(Lja3/o;I)V

    invoke-virtual {v0, v2, v3, v7, v9}, Lja3/o;->r(Ljava/util/Set;Ljava/util/AbstractCollection;Lub3/h;Lkotlin/jvm/functions/Function1;)V

    invoke-static {v2, v7}, Ldt/b;->z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v4

    new-instance v7, Lja3/n;

    const/4 v9, 0x1

    invoke-direct {v7, v0, v9}, Lja3/n;-><init>(Lja3/o;I)V

    invoke-virtual {v0, v4, v8, v6, v7}, Lja3/o;->r(Ljava/util/Set;Ljava/util/AbstractCollection;Lub3/h;Lkotlin/jvm/functions/Function1;)V

    invoke-static {v2, v8}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v2

    iget-object v4, v5, Lzt/q;->x:Ljava/lang/Object;

    check-cast v4, Lia3/a;

    iget-object v5, v4, Lia3/a;->f:Lhb3/o;

    iget-object v4, v4, Lia3/a;->u:Lmb3/k;

    check-cast v4, Lmb3/l;

    iget-object v6, v4, Lmb3/l;->d:Lya3/n;

    iget-object v4, v0, Lja3/o;->n:Lr93/e;

    invoke-static/range {v1 .. v6}, Lbi/g;->U(Lva3/h;Ljava/util/AbstractCollection;Ljava/util/Collection;Lr93/e;Lhb3/o;Lya3/n;)Ljava/util/LinkedHashSet;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lja3/o;->recordLookup(Lva3/h;Lz93/a;)V

    iget-object p2, p0, Lja3/a0;->c:Lja3/a0;

    check-cast p2, Lja3/o;

    if-eqz p2, :cond_0

    iget-object p2, p2, Lja3/o;->u:Landroidx/lifecycle/h2;

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1}, Landroidx/lifecycle/h2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lr93/e;

    if-eqz p2, :cond_0

    return-object p2

    :cond_0
    iget-object p2, p0, Lja3/o;->u:Landroidx/lifecycle/h2;

    invoke-virtual {p2, p1}, Landroidx/lifecycle/h2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr93/h;

    return-object p1
.end method

.method public final getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lja3/o;->recordLookup(Lva3/h;Lz93/a;)V

    invoke-super {p0, p1, p2}, Lja3/a0;->getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public final getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lja3/o;->recordLookup(Lva3/h;Lz93/a;)V

    invoke-super {p0, p1, p2}, Lja3/a0;->getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;)Ljava/util/Set;
    .locals 2

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lja3/o;->o:Lx93/n;

    iget-object p1, p1, Lx93/n;->a:Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Class;->isAnnotation()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lja3/a0;->getFunctionNames()Ljava/util/Set;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/util/LinkedHashSet;

    iget-object v0, p0, Lja3/a0;->e:Lkb3/i;

    invoke-virtual {v0}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lja3/c;

    invoke-interface {v0}, Lja3/c;->c()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-direct {p1, v0}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    iget-object v0, p0, Lja3/o;->n:Lr93/e;

    invoke-interface {v0}, Lr93/h;->e()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->getSupertypes()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "getSupertypes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llb3/y;

    invoke-virtual {v1}, Llb3/y;->u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v1

    invoke-interface {v1}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getVariableNames()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {p1, v1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_1
    return-object p1
.end method

.method public final i()Lr93/q0;
    .locals 2

    iget-object v0, p0, Lja3/o;->n:Lr93/e;

    if-eqz v0, :cond_0

    sget v1, Lya3/f;->a:I

    invoke-interface {v0}, Lr93/e;->q0()Lr93/q0;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lya3/f;->a(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final j()Lr93/k;
    .locals 1

    iget-object v0, p0, Lja3/o;->n:Lr93/e;

    return-object v0
.end method

.method public final k(Lha3/e;)Z
    .locals 1

    iget-object v0, p0, Lja3/o;->o:Lx93/n;

    iget-object v0, v0, Lx93/n;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isAnnotation()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0, p1}, Lja3/o;->D(Lu93/q0;)Z

    move-result p1

    return p1
.end method

.method public final l(Lx93/w;Ljava/util/ArrayList;Llb3/y;Ljava/util/List;)Lja3/z;
    .locals 7

    const-string v0, "method"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "valueParameters"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lja3/a0;->b:Lzt/q;

    iget-object p1, p1, Lzt/q;->x:Ljava/lang/Object;

    check-cast p1, Lia3/a;

    iget-object p1, p1, Lia3/a;->e:Lga3/h;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, Lja3/o;->n:Lr93/e;

    if-eqz p1, :cond_0

    new-instance p1, La33/d;

    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {p1, p3, p4, p2}, La33/d;-><init>(Llb3/y;Ljava/util/List;Ljava/util/ArrayList;)V

    new-instance v0, Lja3/z;

    invoke-virtual {p1}, La33/d;->w()Llb3/y;

    move-result-object v1

    const-string p2, "getReturnType(...)"

    invoke-static {v1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, La33/d;->y()Ljava/util/List;

    move-result-object v3

    const-string p2, "getValueParameters(...)"

    invoke-static {v3, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, La33/d;->x()Ljava/util/List;

    move-result-object v4

    invoke-virtual {p1}, La33/d;->r()Ljava/util/List;

    const-string p1, "getErrors(...)"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v6}, Lja3/z;-><init>(Llb3/y;Llb3/y;Ljava/util/List;Ljava/util/List;ZLjava/util/List;)V

    return-object v0

    :cond_0
    const/4 p1, 0x1

    invoke-static {p1}, Lga3/h;->a(I)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final o(Ljava/util/ArrayList;Lha3/b;ILx93/w;Llb3/y;Llb3/y;)V
    .locals 12

    move-object/from16 v0, p5

    move-object/from16 v1, p6

    invoke-virtual/range {p4 .. p4}, Lx93/v;->d()Lva3/h;

    move-result-object v5

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    const/4 v3, 0x0

    invoke-static {v0, v3}, Llb3/d1;->g(Llb3/y;Z)Llb3/f1;

    move-result-object v6

    invoke-virtual/range {p4 .. p4}, Lx93/w;->j()Z

    move-result v7

    if-eqz v1, :cond_0

    invoke-static {v1, v3}, Llb3/d1;->g(Llb3/y;Z)Llb3/f1;

    move-result-object v2

    :cond_0
    move-object v10, v2

    iget-object v0, p0, Lja3/a0;->b:Lzt/q;

    iget-object v0, v0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    iget-object v0, v0, Lia3/a;->j:Lw93/d;

    move-object/from16 v1, p4

    invoke-virtual {v0, v1}, Lw93/d;->c(Lma3/d;)Lw93/f;

    move-result-object v11

    new-instance v0, Lu93/w0;

    const/4 v2, 0x0

    sget-object v4, Ls93/g;->a:Ls93/f;

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p2

    move v3, p3

    invoke-direct/range {v0 .. v11}, Lu93/w0;-><init>(Lr93/b;Lr93/a1;ILs93/i;Lva3/h;Llb3/y;ZZZLlb3/y;Lr93/s0;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    const/4 p1, 0x2

    invoke-static {p1}, Llb3/d1;->a(I)V

    throw v2
.end method

.method public final p(Ljava/util/LinkedHashSet;Lva3/h;Ljava/util/ArrayList;Z)V
    .locals 7

    iget-object v0, p0, Lja3/a0;->b:Lzt/q;

    iget-object v0, v0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    iget-object v5, v0, Lia3/a;->f:Lhb3/o;

    iget-object v0, v0, Lia3/a;->u:Lmb3/k;

    check-cast v0, Lmb3/l;

    iget-object v6, v0, Lmb3/l;->d:Lya3/n;

    iget-object v4, p0, Lja3/o;->n:Lr93/e;

    move-object v3, p1

    move-object v1, p2

    move-object v2, p3

    invoke-static/range {v1 .. v6}, Lbi/g;->U(Lva3/h;Ljava/util/AbstractCollection;Ljava/util/Collection;Lr93/e;Lhb3/o;Lya3/n;)Ljava/util/LinkedHashSet;

    move-result-object p1

    if-nez p4, :cond_0

    invoke-interface {v3, p1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    return-void

    :cond_0
    invoke-static {v3, p1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p2

    new-instance p3, Ljava/util/ArrayList;

    const/16 p4, 0xa

    invoke-static {p1, p4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lu93/q0;

    invoke-static {p4}, Lse/g;->B(Lr93/c;)Lr93/c;

    move-result-object v0

    check-cast v0, Lu93/q0;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p4, v0, p2}, Lja3/o;->t(Lu93/q0;Lr93/w;Ljava/util/AbstractCollection;)Lu93/q0;

    move-result-object p4

    :goto_1
    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v3, p3}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final q(Lva3/h;Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;Ljava/util/AbstractSet;Lkotlin/jvm/functions/Function1;)V
    .locals 10

    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu93/q0;

    invoke-static {v0}, Lse/g;->A(Lr93/c;)Lr93/c;

    move-result-object v1

    check-cast v1, Lu93/q0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    :cond_0
    move-object v1, v2

    goto :goto_2

    :cond_1
    invoke-static {v1}, Lse/g;->z(Lr93/c;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v3}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v3

    invoke-interface {p5, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu93/q0;

    invoke-interface {v4}, Lr93/w;->l0()Lr93/v;

    move-result-object v4

    invoke-interface {v4, p1}, Lr93/v;->d(Lva3/h;)Lr93/v;

    invoke-interface {v4}, Lr93/v;->z()Lr93/v;

    invoke-interface {v4}, Lr93/v;->s()Lr93/v;

    invoke-interface {v4}, Lr93/v;->build()Lr93/w;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v4, Lu93/q0;

    invoke-static {v1}, Lfa3/c;->a(Lu93/q0;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v4}, Lu93/q0;->V0()Lu93/q0;

    move-result-object v5

    goto :goto_1

    :cond_3
    move-object v5, v4

    :goto_1
    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v5, v1}, Lja3/o;->w(Lr93/w;Lr93/w;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-static {v4, v1, p2}, Lja3/o;->t(Lu93/q0;Lr93/w;Ljava/util/AbstractCollection;)Lu93/q0;

    move-result-object v1

    :goto_2
    invoke-static {p4, v1}, Lub3/j;->a(Ljava/util/AbstractCollection;Ljava/lang/Object;)V

    invoke-static {v0}, Lfa3/e;->a(Lr93/w;)Lr93/w;

    move-result-object v1

    const-string v3, "getName(...)"

    if-nez v1, :cond_5

    :cond_4
    move-object v1, v2

    goto/16 :goto_7

    :cond_5
    move-object v4, v1

    check-cast v4, Lu93/n;

    invoke-virtual {v4}, Lu93/n;->getName()Lva3/h;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p5, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lu93/q0;

    invoke-static {v6, v1}, Lja3/o;->C(Lu93/q0;Lr93/w;)Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_3

    :cond_7
    move-object v5, v2

    :goto_3
    check-cast v5, Lu93/q0;

    if-eqz v5, :cond_9

    invoke-interface {v5}, Lr93/w;->l0()Lr93/v;

    move-result-object v4

    invoke-interface {v1}, Lr93/b;->v()Ljava/util/List;

    move-result-object v6

    const-string v7, "getValueParameters(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v6, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lr93/a1;

    check-cast v9, Lu93/x0;

    invoke-virtual {v9}, Lu93/x0;->getType()Llb3/y;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    invoke-virtual {v5}, Lu93/x;->v()Ljava/util/List;

    move-result-object v5

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/util/Collection;

    invoke-static {v8, v5, v1}, Lce/w;->E(Ljava/util/ArrayList;Ljava/util/Collection;Lr93/w;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-interface {v4, v5}, Lr93/v;->b(Ljava/util/List;)Lr93/v;

    invoke-interface {v4}, Lr93/v;->z()Lr93/v;

    invoke-interface {v4}, Lr93/v;->s()Lr93/v;

    invoke-interface {v4}, Lr93/v;->u()Lr93/v;

    invoke-interface {v4}, Lr93/v;->build()Lr93/w;

    move-result-object v4

    check-cast v4, Lu93/q0;

    goto :goto_5

    :cond_9
    move-object v4, v2

    :goto_5
    if-eqz v4, :cond_4

    invoke-virtual {p0, v4}, Lja3/o;->D(Lu93/q0;)Z

    move-result v5

    if-eqz v5, :cond_a

    goto :goto_6

    :cond_a
    move-object v4, v2

    :goto_6
    if-eqz v4, :cond_4

    invoke-static {v4, v1, p2}, Lja3/o;->t(Lu93/q0;Lr93/w;Ljava/util/AbstractCollection;)Lu93/q0;

    move-result-object v1

    :goto_7
    invoke-static {p4, v1}, Lub3/j;->a(Ljava/util/AbstractCollection;Ljava/lang/Object;)V

    invoke-interface {v0}, Lr93/w;->isSuspend()Z

    move-result v1

    if-nez v1, :cond_b

    goto :goto_9

    :cond_b
    invoke-virtual {v0}, Lu93/n;->getName()Lva3/h;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p5, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu93/q0;

    invoke-static {v3}, Lja3/o;->u(Lu93/q0;)Lu93/q0;

    move-result-object v3

    if-eqz v3, :cond_d

    invoke-static {v3, v0}, Lja3/o;->w(Lr93/w;Lr93/w;)Z

    move-result v4

    if-eqz v4, :cond_d

    goto :goto_8

    :cond_d
    move-object v3, v2

    :goto_8
    if-eqz v3, :cond_c

    move-object v2, v3

    :cond_e
    :goto_9
    invoke-static {p4, v2}, Lub3/j;->a(Ljava/util/AbstractCollection;Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_f
    return-void
.end method

.method public final r(Ljava/util/Set;Ljava/util/AbstractCollection;Lub3/h;Lkotlin/jvm/functions/Function1;)V
    .locals 11

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr93/n0;

    invoke-virtual {p0, v0, p4}, Lja3/o;->v(Lr93/n0;Lkotlin/jvm/functions/Function1;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {p0, v0, p4}, Lja3/o;->y(Lr93/n0;Lkotlin/jvm/functions/Function1;)Lu93/q0;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v0}, Lr93/b1;->A()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v0, p4}, Lja3/o;->z(Lr93/n0;Lkotlin/jvm/functions/Function1;)Lu93/q0;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    move-object v3, v2

    :goto_0
    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lu93/x;->k()Lr93/a0;

    invoke-virtual {v1}, Lu93/x;->k()Lr93/a0;

    :cond_3
    new-instance v4, Lha3/d;

    iget-object v5, p0, Lja3/o;->n:Lr93/e;

    invoke-direct {v4, v5, v1, v3, v0}, Lha3/d;-><init>(Lr93/e;Lu93/q0;Lu93/q0;Lr93/n0;)V

    iget-object v5, v1, Lu93/x;->H:Llb3/y;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lja3/o;->i()Lr93/q0;

    move-result-object v7

    const/4 v8, 0x0

    sget-object v6, Lm83/y;->w:Lm83/y;

    move-object v9, v6

    invoke-virtual/range {v4 .. v9}, Lu93/m0;->Q0(Llb3/y;Ljava/util/List;Lr93/q0;Lu93/p0;Ljava/util/List;)V

    invoke-virtual {v1}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v1}, Lu93/o;->getSource()Lr93/s0;

    move-result-object v7

    invoke-static {v4, v5, v6, v7}, Lya3/p;->k(Lr93/n0;Ls93/i;ZLr93/s0;)Lu93/n0;

    move-result-object v10

    iput-object v1, v10, Lu93/k0;->M:Lr93/w;

    invoke-virtual {v4}, Lu93/x0;->getType()Llb3/y;

    move-result-object v1

    invoke-virtual {v10, v1}, Lu93/n0;->M0(Llb3/y;)V

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lu93/x;->v()Ljava/util/List;

    move-result-object v1

    const-string v5, "getValueParameters(...)"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr93/a1;

    if-eqz v1, :cond_4

    invoke-virtual {v3}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v5

    check-cast v1, Lal/a;

    invoke-virtual {v1}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v6

    invoke-virtual {v3}, Lu93/x;->getVisibility()Lr93/r;

    move-result-object v8

    invoke-virtual {v3}, Lu93/o;->getSource()Lr93/s0;

    move-result-object v9

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lya3/p;->l(Lr93/n0;Ls93/i;Ls93/i;ZLr93/r;Lr93/s0;)Lu93/o0;

    move-result-object v1

    iput-object v3, v1, Lu93/k0;->M:Lr93/w;

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "No parameter found for "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_5
    move-object v1, v2

    :goto_1
    invoke-virtual {v4, v10, v1, v2, v2}, Lu93/m0;->N0(Lu93/n0;Lu93/o0;Lu93/v;Lu93/v;)V

    move-object v2, v4

    :goto_2
    if-eqz v2, :cond_0

    invoke-interface {p2, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    if-eqz p3, :cond_6

    invoke-virtual {p3, v0}, Lub3/h;->add(Ljava/lang/Object;)Z

    :cond_6
    return-void
.end method

.method public final recordLookup(Lva3/h;Lz93/a;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "location"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lja3/a0;->b:Lzt/q;

    iget-object p1, p1, Lzt/q;->x:Ljava/lang/Object;

    check-cast p1, Lia3/a;

    iget-object p1, p1, Lia3/a;->n:Lz93/b;

    const-string p2, "<this>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "scopeOwner"

    iget-object p2, p0, Lja3/o;->n:Lr93/e;

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final s()Ljava/util/Collection;
    .locals 3

    iget-boolean v0, p0, Lja3/o;->p:Z

    const-string v1, "getSupertypes(...)"

    iget-object v2, p0, Lja3/o;->n:Lr93/e;

    if-eqz v0, :cond_0

    invoke-interface {v2}, Lr93/h;->e()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->getSupertypes()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_0
    iget-object v0, p0, Lja3/a0;->b:Lzt/q;

    iget-object v0, v0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    iget-object v0, v0, Lia3/a;->u:Lmb3/k;

    check-cast v0, Lmb3/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "classDescriptor"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Lr93/h;->e()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->getSupertypes()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Lazy Java member scope for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lja3/o;->o:Lx93/n;

    invoke-virtual {v1}, Lx93/n;->c()Lva3/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final v(Lr93/n0;Lkotlin/jvm/functions/Function1;)Z
    .locals 1

    invoke-static {p1}, Lo73/a;->P(Lr93/n0;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lja3/o;->y(Lr93/n0;Lkotlin/jvm/functions/Function1;)Lu93/q0;

    move-result-object v0

    invoke-static {p1, p2}, Lja3/o;->z(Lr93/n0;Lkotlin/jvm/functions/Function1;)Lu93/q0;

    move-result-object p2

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p1}, Lr93/b1;->A()Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lu93/x;->k()Lr93/a0;

    move-result-object p1

    invoke-virtual {v0}, Lu93/x;->k()Lr93/a0;

    move-result-object p2

    if-ne p1, p2, :cond_3

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final y(Lr93/n0;Lkotlin/jvm/functions/Function1;)Lu93/q0;
    .locals 3

    invoke-interface {p1}, Lr93/n0;->getGetter()Lu93/n0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lse/g;->A(Lr93/c;)Lr93/c;

    move-result-object v0

    check-cast v0, Lr93/o0;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Ls2/e;->x(Lr93/o0;)Ljava/lang/String;

    move-result-object v1

    :cond_1
    if-eqz v1, :cond_2

    iget-object v2, p0, Lja3/o;->n:Lr93/e;

    invoke-static {v2, v0}, Lse/g;->D(Lr93/e;Lr93/c;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p1, v1, p2}, Lja3/o;->x(Lr93/n0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lu93/q0;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-interface {p1}, Lr93/k;->getName()Lva3/h;

    move-result-object v0

    invoke-virtual {v0}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "asString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lfa3/w;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, p2}, Lja3/o;->x(Lr93/n0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lu93/q0;

    move-result-object p1

    return-object p1
.end method
