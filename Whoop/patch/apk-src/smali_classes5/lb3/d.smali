.class public final Llb3/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Llb3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llb3/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Llb3/d;->a:Llb3/d;

    return-void
.end method

.method public static final a(Lob3/o;Lob3/h;)Z
    .locals 2

    const-string v0, "c"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lob3/o;->P(Lob3/h;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    instance-of v0, p1, Lob3/d;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Lob3/d;

    invoke-interface {p0, p1}, Lob3/o;->k(Lob3/d;)Lob3/c;

    move-result-object p1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lob3/o;->x(Lob3/c;)Lob3/k;

    move-result-object p1

    invoke-static {p0, p1}, Lq83/g;->A(Lob3/o;Lob3/k;)Lob3/g;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p0, p1}, Lob3/o;->l0(Lob3/g;)Lob3/h;

    move-result-object p1

    invoke-interface {p0, p1}, Lob3/o;->P(Lob3/h;)Z

    move-result p0

    if-ne p0, v1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0

    :cond_2
    :goto_1
    return v1
.end method

.method public static final b(Lob3/o;Llb3/p0;Lob3/h;Lob3/h;Z)Z
    .locals 3

    const-string v0, "c"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p2}, Lob3/o;->X(Lob3/h;)Ljava/util/Collection;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    instance-of v0, p2, Ljava/util/Collection;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lob3/g;

    invoke-static {p0, v0}, Lq83/g;->d0(Lob3/o;Lob3/g;)Lob3/l;

    move-result-object v1

    invoke-static {p0, p3}, Lq83/g;->e0(Lob3/o;Lob3/h;)Lob3/l;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    if-eqz p4, :cond_1

    sget-object v1, Llb3/d;->a:Llb3/d;

    invoke-static {v1, p1, p3, v0}, Llb3/d;->k(Llb3/d;Llb3/p0;Lob3/g;Lob3/g;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static c(Llb3/p0;Lob3/o;Lob3/h;Lob3/l;)Ljava/util/List;
    .locals 7

    sget-object v0, Llb3/o0;->c:Llb3/o0;

    const-string v1, "c"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2, p3}, Lob3/o;->I(Lob3/h;Lob3/l;)V

    invoke-interface {p1, p3}, Lob3/o;->C(Lob3/l;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p1, p2}, Lob3/o;->j(Lob3/h;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p1, p3}, Lob3/o;->J(Lob3/l;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p1, p2}, Lq83/g;->e0(Lob3/o;Lob3/h;)Lob3/l;

    move-result-object p0

    invoke-interface {p1, p0, p3}, Lob3/o;->H(Lob3/l;Lob3/l;)Z

    move-result p0

    if-eqz p0, :cond_2

    sget-object p0, Lob3/b;->w:Lob3/b;

    invoke-interface {p1, p2}, Lob3/o;->G(Lob3/h;)Lob3/h;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    move-object p2, p0

    :goto_0
    invoke-static {p2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_1
    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0

    :cond_3
    new-instance v1, Lub3/f;

    invoke-direct {v1}, Lub3/f;-><init>()V

    invoke-virtual {p0}, Llb3/p0;->c()V

    iget-object v2, p0, Llb3/p0;->c:Lob3/o;

    iget-object v3, p0, Llb3/p0;->g:Ljava/util/ArrayDeque;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v4, p0, Llb3/p0;->h:Lub3/h;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3, p2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    :cond_4
    :goto_2
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_a

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lob3/h;

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4, p2}, Lub3/h;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    sget-object v5, Lob3/b;->w:Lob3/b;

    invoke-interface {p1, p2}, Lob3/o;->G(Lob3/h;)Lob3/h;

    move-result-object v5

    if-nez v5, :cond_5

    move-object v5, p2

    :cond_5
    invoke-static {p1, v5}, Lq83/g;->e0(Lob3/o;Lob3/h;)Lob3/l;

    move-result-object v6

    invoke-interface {p1, v6, p3}, Lob3/o;->H(Lob3/l;Lob3/l;)Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-virtual {v1, v5}, Lub3/f;->add(Ljava/lang/Object;)Z

    move-object v5, v0

    goto :goto_3

    :cond_6
    invoke-interface {p1, v5}, Lob3/o;->g(Lob3/g;)I

    move-result v6

    if-nez v6, :cond_7

    sget-object v5, Llb3/o0;->b:Llb3/o0;

    goto :goto_3

    :cond_7
    invoke-interface {v2, v5}, Lob3/o;->n(Lob3/h;)Ls2/e;

    move-result-object v5

    :goto_3
    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    goto :goto_4

    :cond_8
    const/4 v5, 0x0

    :goto_4
    if-nez v5, :cond_9

    goto :goto_2

    :cond_9
    invoke-interface {v2, p2}, Lob3/o;->T(Lob3/h;)Lob3/l;

    move-result-object p2

    invoke-interface {v2, p2}, Lob3/o;->s(Lob3/l;)Ljava/util/Collection;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lob3/g;

    invoke-virtual {v5, p0, v6}, Ls2/e;->i0(Llb3/p0;Lob3/g;)Lob3/h;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_a
    invoke-virtual {p0}, Llb3/p0;->a()V

    return-object v1
.end method

.method public static d(Llb3/p0;Lob3/o;Lob3/h;Lob3/l;)Ljava/util/List;
    .locals 5

    invoke-static {p0, p1, p2, p3}, Llb3/d;->c(Llb3/p0;Lob3/o;Lob3/h;Lob3/l;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p2

    const/4 p3, 0x2

    if-ge p2, p3, :cond_0

    goto :goto_3

    :cond_0
    move-object p2, p0

    check-cast p2, Ljava/lang/Iterable;

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lob3/h;

    const-string v2, "<this>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v1}, Lob3/o;->M(Lob3/h;)Lob3/j;

    move-result-object v1

    invoke-interface {p1, v1}, Lob3/o;->Y(Lob3/j;)I

    move-result v2

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_3

    invoke-interface {p1, v1, v3}, Lob3/o;->D(Lob3/j;I)Lob3/k;

    move-result-object v4

    invoke-static {p1, v4}, Lq83/g;->A(Lob3/o;Lob3/k;)Lob3/g;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-interface {p1, v4}, Lob3/o;->r(Lob3/g;)Lob3/f;

    move-result-object v4

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    if-nez v4, :cond_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-virtual {p3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_5

    return-object p3

    :cond_5
    :goto_3
    return-object p0
.end method

.method public static g(Llb3/p0;Lob3/g;Lob3/g;)Z
    .locals 6

    const-string v0, "a"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llb3/p0;->c:Lob3/o;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0, p1}, Llb3/d;->i(Lob3/o;Lob3/g;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {v0, p2}, Llb3/d;->i(Lob3/o;Lob3/g;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0, p1}, Llb3/p0;->e(Lob3/g;)Llb3/y;

    move-result-object v1

    invoke-virtual {p0, v1}, Llb3/p0;->d(Lob3/g;)Llb3/f1;

    move-result-object v1

    invoke-virtual {p0, p2}, Llb3/p0;->e(Lob3/g;)Llb3/y;

    move-result-object v2

    invoke-virtual {p0, v2}, Llb3/p0;->d(Lob3/g;)Llb3/f1;

    move-result-object v2

    invoke-interface {v0, v1}, Lob3/o;->f(Lob3/g;)Lob3/h;

    move-result-object v3

    invoke-interface {v0, v1}, Lob3/o;->N(Lob3/g;)Lob3/l;

    move-result-object v4

    invoke-interface {v0, v2}, Lob3/o;->N(Lob3/g;)Lob3/l;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Lob3/o;->H(Lob3/l;Lob3/l;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v0, v3}, Lob3/o;->g(Lob3/g;)I

    move-result v4

    if-nez v4, :cond_3

    invoke-interface {v0, v1}, Lob3/o;->W(Llb3/f1;)Z

    move-result p0

    if-nez p0, :cond_4

    invoke-interface {v0, v2}, Lob3/o;->W(Llb3/f1;)Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {v0, v3}, Lob3/o;->R(Lob3/g;)Z

    move-result p0

    invoke-interface {v0, v2}, Lob3/o;->f(Lob3/g;)Lob3/h;

    move-result-object p1

    invoke-interface {v0, p1}, Lob3/o;->R(Lob3/g;)Z

    move-result p1

    if-ne p0, p1, :cond_5

    goto :goto_0

    :cond_3
    sget-object v0, Llb3/d;->a:Llb3/d;

    invoke-static {v0, p0, p1, p2}, Llb3/d;->k(Llb3/d;Llb3/p0;Lob3/g;Lob3/g;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v0, p0, p2, p1}, Llb3/d;->k(Llb3/d;Llb3/p0;Lob3/g;Lob3/g;)Z

    move-result p0

    if-eqz p0, :cond_5

    :cond_4
    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_5
    :goto_1
    const/4 p0, 0x0

    return p0
.end method

.method public static h(Lob3/o;Lob3/g;Lob3/h;)Lob3/m;
    .locals 7

    const-string v0, "c"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lob3/o;->g(Lob3/g;)I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x0

    if-ge v2, v0, :cond_6

    invoke-interface {p0, p1, v2}, Lob3/o;->K(Lob3/g;I)Lob3/k;

    move-result-object v4

    const-string v5, "<this>"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, v4}, Lob3/o;->B(Lob3/k;)Z

    move-result v6

    if-nez v6, :cond_0

    move-object v3, v4

    :cond_0
    if-eqz v3, :cond_5

    invoke-static {p0, v3}, Lq83/g;->A(Lob3/o;Lob3/k;)Lob3/g;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_3

    :cond_1
    invoke-static {p0, v3}, Lq83/g;->L(Lob3/o;Lob3/g;)Lob3/h;

    move-result-object v4

    invoke-interface {p0, v4}, Lob3/o;->e(Lob3/g;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p0, p2}, Lq83/g;->L(Lob3/o;Lob3/g;)Lob3/h;

    move-result-object v4

    invoke-interface {p0, v4}, Lob3/o;->e(Lob3/g;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    move v4, v1

    :goto_1
    invoke-virtual {v3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    if-eqz v4, :cond_3

    invoke-static {p0, v3}, Lq83/g;->d0(Lob3/o;Lob3/g;)Lob3/l;

    move-result-object v4

    invoke-static {p0, p2}, Lq83/g;->d0(Lob3/o;Lob3/g;)Lob3/l;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {p0, v3, p2}, Llb3/d;->h(Lob3/o;Lob3/g;Lob3/h;)Lob3/m;

    move-result-object v3

    if-eqz v3, :cond_5

    return-object v3

    :cond_4
    :goto_2
    invoke-static {p0, p1}, Lq83/g;->d0(Lob3/o;Lob3/g;)Lob3/l;

    move-result-object p1

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, v2}, Lob3/o;->c0(Lob3/l;I)Lob3/m;

    move-result-object p0

    return-object p0

    :cond_5
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_6
    return-object v3
.end method

.method public static i(Lob3/o;Lob3/g;)Z
    .locals 2

    invoke-static {p0, p1}, Lq83/g;->d0(Lob3/o;Lob3/g;)Lob3/l;

    move-result-object v0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lob3/o;->t(Lob3/l;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0, p1}, Lob3/o;->U(Lob3/g;)V

    invoke-interface {p0, p1}, Lob3/o;->f0(Lob3/g;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p0, p1}, Lob3/o;->o(Lob3/g;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p0, p1}, Lob3/o;->A(Lob3/g;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static j(Llb3/p0;Lob3/o;Lob3/j;Lob3/h;)Z
    .locals 10

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "capturedSubArguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3}, Lq83/g;->e0(Lob3/o;Lob3/h;)Lob3/l;

    move-result-object v0

    invoke-interface {p1, p2}, Lob3/o;->Y(Lob3/j;)I

    move-result v1

    invoke-static {p1, v0}, Lq83/g;->N(Lob3/o;Lob3/l;)I

    move-result v2

    const/4 v3, 0x0

    if-ne v1, v2, :cond_d

    invoke-interface {p1, p3}, Lob3/o;->g(Lob3/g;)I

    move-result v4

    if-eq v1, v4, :cond_0

    goto/16 :goto_4

    :cond_0
    move v1, v3

    :goto_0
    const/4 v4, 0x1

    if-ge v1, v2, :cond_c

    invoke-interface {p1, p3, v1}, Lob3/o;->K(Lob3/g;I)Lob3/k;

    move-result-object v5

    invoke-static {p1, v5}, Lq83/g;->A(Lob3/o;Lob3/k;)Lob3/g;

    move-result-object v6

    if-nez v6, :cond_1

    goto/16 :goto_3

    :cond_1
    invoke-interface {p1, p2, v1}, Lob3/o;->D(Lob3/j;I)Lob3/k;

    move-result-object v7

    const-string v8, "<this>"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v7}, Lob3/o;->i(Lob3/k;)Lob3/p;

    sget-object v8, Lob3/p;->z:Lob3/p;

    invoke-static {p1, v7}, Lq83/g;->A(Lob3/o;Lob3/k;)Lob3/g;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {p1, v0, v1}, Lob3/o;->c0(Lob3/l;I)Lob3/m;

    move-result-object v9

    invoke-interface {p1, v9}, Lob3/o;->l(Lob3/m;)Lob3/p;

    move-result-object v9

    invoke-interface {p1, v5}, Lob3/o;->i(Lob3/k;)Lob3/p;

    move-result-object v5

    if-ne v9, v8, :cond_2

    move-object v9, v5

    goto :goto_1

    :cond_2
    if-ne v5, v8, :cond_3

    goto :goto_1

    :cond_3
    if-ne v9, v5, :cond_4

    goto :goto_1

    :cond_4
    const/4 v9, 0x0

    :goto_1
    if-nez v9, :cond_5

    iget-boolean p0, p0, Llb3/p0;->a:Z

    return p0

    :cond_5
    if-ne v9, v8, :cond_6

    invoke-static {p1, v7, v6}, Llb3/d;->l(Lob3/o;Lob3/g;Lob3/g;)V

    invoke-static {p1, v6, v7}, Llb3/d;->l(Lob3/o;Lob3/g;Lob3/g;)V

    :cond_6
    iget v5, p0, Llb3/p0;->f:I

    const/16 v8, 0x64

    if-gt v5, v8, :cond_b

    add-int/lit8 v5, v5, 0x1

    iput v5, p0, Llb3/p0;->f:I

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    sget-object v8, Llb3/d;->a:Llb3/d;

    if-eqz v5, :cond_9

    if-eq v5, v4, :cond_8

    const/4 v4, 0x2

    if-ne v5, v4, :cond_7

    invoke-static {p0, v7, v6}, Llb3/d;->g(Llb3/p0;Lob3/g;Lob3/g;)Z

    move-result v4

    goto :goto_2

    :cond_7
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_8
    invoke-static {v8, p0, v7, v6}, Llb3/d;->k(Llb3/d;Llb3/p0;Lob3/g;Lob3/g;)Z

    move-result v4

    goto :goto_2

    :cond_9
    invoke-static {v8, p0, v6, v7}, Llb3/d;->k(Llb3/d;Llb3/p0;Lob3/g;Lob3/g;)Z

    move-result v4

    :goto_2
    iget v5, p0, Llb3/p0;->f:I

    add-int/lit8 v5, v5, -0x1

    iput v5, p0, Llb3/p0;->f:I

    if-nez v4, :cond_a

    goto :goto_4

    :cond_a
    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_b
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Arguments depth is too high. Some related argument: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_c
    return v4

    :cond_d
    :goto_4
    return v3
.end method

.method public static k(Llb3/d;Llb3/p0;Lob3/g;Lob3/g;)Z
    .locals 1

    const-string p0, "subType"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "superType"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-ne p2, p3, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    invoke-virtual {p1, p2, p3}, Llb3/p0;->b(Lob3/g;Lob3/g;)Z

    move-result p0

    if-nez p0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    iget-object p0, p1, Llb3/p0;->c:Lob3/o;

    sget-object v0, Llb3/d;->a:Llb3/d;

    invoke-virtual {v0, p1, p0, p2, p3}, Llb3/d;->e(Llb3/p0;Lob3/o;Lob3/g;Lob3/g;)Z

    move-result p0

    return p0
.end method

.method public static l(Lob3/o;Lob3/g;Lob3/g;)V
    .locals 2

    invoke-static {p0, p1}, Lq83/g;->k(Lob3/o;Lob3/g;)Lob3/h;

    move-result-object p1

    instance-of v0, p1, Lob3/d;

    if-eqz v0, :cond_2

    check-cast p1, Lob3/d;

    invoke-interface {p0, p1}, Lob3/o;->g0(Lob3/d;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-interface {p0, p1}, Lob3/o;->k(Lob3/d;)Lob3/c;

    move-result-object v0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lob3/o;->x(Lob3/c;)Lob3/k;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lob3/o;->B(Lob3/k;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0, p1}, Lob3/o;->O(Lob3/d;)Lob3/b;

    move-result-object p1

    sget-object v0, Lob3/b;->w:Lob3/b;

    if-eq p1, v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p0, p2}, Lq83/g;->d0(Lob3/o;Lob3/g;)Lob3/l;

    :cond_2
    :goto_0
    return-void
.end method

.method public static m(Llb3/f1;Z)Llb3/l;
    .locals 4

    const-string v0, "type"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Llb3/l;

    if-eqz v0, :cond_0

    check-cast p0, Llb3/l;

    return-object p0

    :cond_0
    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->d()Lr93/h;

    move-result-object v0

    instance-of v0, v0, Lr93/x0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    instance-of v0, p0, Lmb3/h;

    if-nez v0, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->d()Lr93/h;

    move-result-object v0

    instance-of v3, v0, Lu93/u0;

    if-eqz v3, :cond_2

    check-cast v0, Lu93/u0;

    goto :goto_0

    :cond_2
    move-object v0, v2

    :goto_0
    const/4 v3, 0x1

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lu93/u0;->O0()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    if-eqz p1, :cond_4

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->d()Lr93/h;

    move-result-object v0

    instance-of v0, v0, Lr93/x0;

    if-eqz v0, :cond_4

    invoke-static {p0}, Llb3/d1;->e(Llb3/y;)Z

    move-result v3

    goto :goto_1

    :cond_4
    invoke-static {p0}, Lug/m;->H(Llb3/f1;)Z

    move-result v0

    xor-int/2addr v3, v0

    :goto_1
    if-eqz v3, :cond_6

    instance-of v0, p0, Llb3/r;

    if-eqz v0, :cond_5

    move-object v0, p0

    check-cast v0, Llb3/r;

    iget-object v2, v0, Llb3/r;->x:Llb3/c0;

    invoke-virtual {v2}, Llb3/y;->i0()Llb3/q0;

    move-result-object v2

    iget-object v0, v0, Llb3/r;->y:Llb3/c0;

    invoke-virtual {v0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_5
    new-instance v0, Llb3/l;

    invoke-static {p0}, Lds/p;->M(Llb3/y;)Llb3/c0;

    move-result-object p0

    invoke-virtual {p0, v1}, Llb3/c0;->u0(Z)Llb3/c0;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Llb3/l;-><init>(Llb3/c0;Z)V

    return-object v0

    :cond_6
    return-object v2
.end method


# virtual methods
.method public e(Llb3/p0;Lob3/o;Lob3/g;Lob3/g;)Z
    .locals 19

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    invoke-virtual {v0, v2}, Llb3/p0;->e(Lob3/g;)Llb3/y;

    move-result-object v2

    invoke-virtual {v0, v2}, Llb3/p0;->d(Lob3/g;)Llb3/f1;

    move-result-object v2

    move-object/from16 v3, p4

    invoke-virtual {v0, v3}, Llb3/p0;->e(Lob3/g;)Llb3/y;

    move-result-object v3

    invoke-virtual {v0, v3}, Llb3/p0;->d(Lob3/g;)Llb3/f1;

    move-result-object v3

    invoke-static {v1, v2}, Lq83/g;->L(Lob3/o;Lob3/g;)Lob3/h;

    move-result-object v4

    const-string v5, "<this>"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v3}, Lob3/o;->l0(Lob3/g;)Lob3/h;

    move-result-object v6

    invoke-interface {v1, v4}, Lob3/o;->j0(Lob3/g;)Z

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-nez v7, :cond_0

    invoke-interface {v1, v6}, Lob3/o;->j0(Lob3/g;)Z

    move-result v7

    if-eqz v7, :cond_1

    :cond_0
    move-object/from16 v7, p0

    goto/16 :goto_5

    :cond_1
    invoke-interface {v1, v4}, Lob3/o;->p(Lob3/h;)V

    invoke-interface {v1, v4}, Lob3/o;->a0(Lob3/h;)V

    invoke-interface {v1, v6}, Lob3/o;->a0(Lob3/h;)V

    invoke-interface {v1, v6}, Lob3/o;->i0(Lob3/h;)Lob3/d;

    move-result-object v7

    if-eqz v7, :cond_2

    invoke-interface {v1, v7}, Lob3/o;->k0(Lob3/d;)Lob3/g;

    move-result-object v11

    goto :goto_0

    :cond_2
    const/4 v11, 0x0

    :goto_0
    if-eqz v7, :cond_5

    if-eqz v11, :cond_5

    invoke-static {v1, v6}, Lq83/g;->E(Lob3/o;Lob3/h;)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v1, v11}, Lob3/o;->Q(Lob3/g;)Lob3/g;

    move-result-object v11

    goto :goto_1

    :cond_3
    invoke-interface {v1, v6}, Lob3/o;->m(Lob3/h;)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v1, v11}, Lob3/o;->F(Lob3/g;)Lob3/g;

    move-result-object v11

    :cond_4
    :goto_1
    sget-object v7, Llb3/m0;->w:[Llb3/m0;

    move-object/from16 v7, p0

    invoke-static {v7, v0, v4, v11}, Llb3/d;->k(Llb3/d;Llb3/p0;Lob3/g;Lob3/g;)Z

    move-result v11

    if-eqz v11, :cond_6

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto/16 :goto_6

    :cond_5
    move-object/from16 v7, p0

    :cond_6
    invoke-static {v1, v6}, Lq83/g;->e0(Lob3/o;Lob3/h;)Lob3/l;

    move-result-object v11

    invoke-static {v11, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v11}, Lob3/o;->v(Lob3/l;)Z

    move-result v12

    if-eqz v12, :cond_a

    invoke-static {v1, v6}, Lq83/g;->E(Lob3/o;Lob3/h;)Z

    invoke-interface {v1, v11}, Lob3/o;->s(Lob3/l;)Ljava/util/Collection;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    instance-of v11, v6, Ljava/util/Collection;

    if-eqz v11, :cond_8

    move-object v11, v6

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_8

    :cond_7
    move v4, v9

    goto :goto_2

    :cond_8
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lob3/g;

    sget-object v12, Llb3/d;->a:Llb3/d;

    invoke-static {v12, v0, v4, v11}, Llb3/d;->k(Llb3/d;Llb3/p0;Lob3/g;Lob3/g;)Z

    move-result v11

    if-nez v11, :cond_9

    move v4, v8

    :goto_2
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    goto/16 :goto_6

    :cond_a
    invoke-static {v1, v4}, Lq83/g;->e0(Lob3/o;Lob3/h;)Lob3/l;

    move-result-object v11

    instance-of v12, v4, Lob3/d;

    if-nez v12, :cond_d

    invoke-static {v11, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v11}, Lob3/o;->v(Lob3/l;)Z

    move-result v12

    if-eqz v12, :cond_e

    invoke-interface {v1, v11}, Lob3/o;->s(Lob3/l;)Ljava/util/Collection;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    instance-of v12, v11, Ljava/util/Collection;

    if-eqz v12, :cond_b

    move-object v12, v11

    check-cast v12, Ljava/util/Collection;

    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_b

    goto :goto_3

    :cond_b
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_c
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_d

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lob3/g;

    instance-of v12, v12, Lob3/d;

    if-nez v12, :cond_c

    goto :goto_4

    :cond_d
    :goto_3
    invoke-static {v1, v6, v4}, Llb3/d;->h(Lob3/o;Lob3/g;Lob3/h;)Lob3/m;

    move-result-object v4

    if-eqz v4, :cond_e

    invoke-static {v1, v6}, Lq83/g;->e0(Lob3/o;Lob3/h;)Lob3/l;

    move-result-object v6

    invoke-interface {v1, v4, v6}, Lob3/o;->q(Lob3/m;Lob3/l;)Z

    move-result v4

    if-eqz v4, :cond_e

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_6

    :cond_e
    :goto_4
    const/4 v4, 0x0

    goto :goto_6

    :goto_5
    iget-boolean v11, v0, Llb3/p0;->a:Z

    if-eqz v11, :cond_f

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_6

    :cond_f
    invoke-static {v1, v4}, Lq83/g;->E(Lob3/o;Lob3/h;)Z

    move-result v11

    if-eqz v11, :cond_10

    invoke-static {v1, v6}, Lq83/g;->E(Lob3/o;Lob3/h;)Z

    move-result v11

    if-nez v11, :cond_10

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_6

    :cond_10
    invoke-interface {v1, v4}, Lob3/o;->d(Lob3/h;)Lob3/h;

    move-result-object v4

    invoke-interface {v1, v6}, Lob3/o;->d(Lob3/h;)Lob3/h;

    move-result-object v6

    invoke-static {v1, v4, v6}, Lcom/squareup/wire/n;->d0(Lob3/o;Lob3/g;Lob3/g;)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    :goto_6
    if-eqz v4, :cond_11

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_11
    invoke-static {v1, v2}, Lq83/g;->L(Lob3/o;Lob3/g;)Lob3/h;

    move-result-object v2

    invoke-interface {v1, v3}, Lob3/o;->l0(Lob3/g;)Lob3/h;

    move-result-object v3

    sget-object v4, Llb3/o0;->b:Llb3/o0;

    sget-object v6, Llb3/o0;->c:Llb3/o0;

    invoke-static {v0, v2, v3}, Lce/w;->X(Llb3/p0;Lob3/h;Lob3/h;)Z

    move-result v11

    iget-object v12, v0, Llb3/p0;->c:Lob3/o;

    if-nez v11, :cond_12

    return v8

    :cond_12
    invoke-interface {v1, v2}, Lob3/o;->P(Lob3/h;)Z

    move-result v11

    if-nez v11, :cond_14

    invoke-interface {v1, v3}, Lob3/o;->P(Lob3/h;)Z

    move-result v11

    if-nez v11, :cond_14

    :cond_13
    const/4 v11, 0x0

    goto :goto_9

    :cond_14
    invoke-static {v1, v2}, Llb3/d;->a(Lob3/o;Lob3/h;)Z

    move-result v11

    if-eqz v11, :cond_15

    invoke-static {v1, v3}, Llb3/d;->a(Lob3/o;Lob3/h;)Z

    move-result v11

    if-eqz v11, :cond_15

    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_9

    :cond_15
    invoke-interface {v1, v2}, Lob3/o;->P(Lob3/h;)Z

    move-result v11

    if-eqz v11, :cond_16

    invoke-static {v1, v0, v2, v3, v8}, Llb3/d;->b(Lob3/o;Llb3/p0;Lob3/h;Lob3/h;Z)Z

    move-result v11

    if-eqz v11, :cond_13

    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_9

    :cond_16
    invoke-interface {v1, v3}, Lob3/o;->P(Lob3/h;)Z

    move-result v11

    if-eqz v11, :cond_13

    invoke-static {v1, v2}, Lq83/g;->e0(Lob3/o;Lob3/h;)Lob3/l;

    move-result-object v11

    instance-of v13, v11, Llb3/x;

    if-eqz v13, :cond_19

    invoke-interface {v1, v11}, Lob3/o;->s(Lob3/l;)Ljava/util/Collection;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    instance-of v13, v11, Ljava/util/Collection;

    if-eqz v13, :cond_17

    move-object v13, v11

    check-cast v13, Ljava/util/Collection;

    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_17

    goto :goto_7

    :cond_17
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_18
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_19

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lob3/g;

    invoke-static {v1, v13}, Lq83/g;->k(Lob3/o;Lob3/g;)Lob3/h;

    move-result-object v13

    if-eqz v13, :cond_18

    invoke-interface {v1, v13}, Lob3/o;->P(Lob3/h;)Z

    move-result v13

    if-ne v13, v9, :cond_18

    goto :goto_8

    :cond_19
    :goto_7
    invoke-static {v1, v0, v3, v2, v9}, Llb3/d;->b(Lob3/o;Llb3/p0;Lob3/h;Lob3/h;Z)Z

    move-result v11

    if-eqz v11, :cond_13

    :goto_8
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_9
    if-eqz v11, :cond_1a

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_1a
    invoke-static {v1, v3}, Lq83/g;->e0(Lob3/o;Lob3/h;)Lob3/l;

    move-result-object v11

    invoke-static {v1, v2}, Lq83/g;->e0(Lob3/o;Lob3/h;)Lob3/l;

    move-result-object v13

    invoke-interface {v1, v13, v11}, Lob3/o;->H(Lob3/l;Lob3/l;)Z

    move-result v13

    if-eqz v13, :cond_1b

    invoke-static {v1, v11}, Lq83/g;->N(Lob3/o;Lob3/l;)I

    move-result v13

    if-nez v13, :cond_1b

    :goto_a
    move/from16 v17, v9

    goto/16 :goto_1b

    :cond_1b
    invoke-static {v1, v3}, Lq83/g;->e0(Lob3/o;Lob3/h;)Lob3/l;

    move-result-object v13

    invoke-static {v13, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v13}, Lob3/o;->b0(Lob3/l;)Z

    move-result v13

    if-eqz v13, :cond_1c

    goto :goto_a

    :cond_1c
    const-string v13, "superConstructor"

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "c"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v12, v2}, Lob3/o;->j(Lob3/h;)Z

    move-result v13

    if-eqz v13, :cond_1d

    invoke-static {v0, v12, v2, v11}, Llb3/d;->d(Llb3/p0;Lob3/o;Lob3/h;Lob3/l;)Ljava/util/List;

    move-result-object v13

    :goto_b
    move/from16 p3, v8

    goto/16 :goto_11

    :cond_1d
    invoke-interface {v12, v11}, Lob3/o;->C(Lob3/l;)Z

    move-result v13

    if-nez v13, :cond_1e

    invoke-interface {v12, v11}, Lob3/o;->m0(Lob3/l;)Z

    move-result v13

    if-nez v13, :cond_1e

    invoke-static {v0, v12, v2, v11}, Llb3/d;->c(Llb3/p0;Lob3/o;Lob3/h;Lob3/l;)Ljava/util/List;

    move-result-object v13

    goto :goto_b

    :cond_1e
    new-instance v13, Lub3/f;

    invoke-direct {v13}, Lub3/f;-><init>()V

    invoke-virtual {v0}, Llb3/p0;->c()V

    iget-object v14, v0, Llb3/p0;->g:Ljava/util/ArrayDeque;

    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v15, v0, Llb3/p0;->h:Lub3/h;

    invoke-static {v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v14, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    :goto_c
    invoke-virtual {v14}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v16

    if-nez v16, :cond_23

    invoke-virtual {v14}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v16

    move/from16 p3, v8

    move-object/from16 v8, v16

    check-cast v8, Lob3/h;

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v15, v8}, Lub3/h;->add(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_21

    invoke-interface {v12, v8}, Lob3/o;->j(Lob3/h;)Z

    move-result v16

    if-eqz v16, :cond_1f

    invoke-virtual {v13, v8}, Lub3/f;->add(Ljava/lang/Object;)Z

    move-object v10, v6

    goto :goto_d

    :cond_1f
    move-object v10, v4

    :goto_d
    invoke-virtual {v10, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_20

    goto :goto_e

    :cond_20
    const/4 v10, 0x0

    :goto_e
    if-nez v10, :cond_22

    :cond_21
    move/from16 v8, p3

    goto :goto_c

    :cond_22
    invoke-interface {v12, v8}, Lob3/o;->T(Lob3/h;)Lob3/l;

    move-result-object v8

    invoke-interface {v12, v8}, Lob3/o;->s(Lob3/l;)Ljava/util/Collection;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_21

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v9, v16

    check-cast v9, Lob3/g;

    invoke-virtual {v10, v0, v9}, Ls2/e;->i0(Llb3/p0;Lob3/g;)Lob3/h;

    move-result-object v9

    invoke-virtual {v14, v9}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    const/4 v9, 0x1

    goto :goto_f

    :cond_23
    move/from16 p3, v8

    invoke-virtual {v0}, Llb3/p0;->a()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v13}, Lub3/f;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_10
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_24

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lob3/h;

    invoke-static {v10}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0, v12, v10, v11}, Llb3/d;->d(Llb3/p0;Lob3/o;Lob3/h;Lob3/l;)Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    invoke-static {v8, v10}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_10

    :cond_24
    move-object v13, v8

    :goto_11
    invoke-interface {v13}, Ljava/util/List;->size()I

    check-cast v13, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v13, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_12
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_26

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lob3/h;

    invoke-virtual {v0, v13}, Llb3/p0;->d(Lob3/g;)Llb3/f1;

    move-result-object v14

    invoke-static {v1, v14}, Lq83/g;->k(Lob3/o;Lob3/g;)Lob3/h;

    move-result-object v14

    if-nez v14, :cond_25

    goto :goto_13

    :cond_25
    move-object v13, v14

    :goto_13
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_12

    :cond_26
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v10

    if-eqz v10, :cond_30

    const/4 v13, 0x1

    if-eq v10, v13, :cond_2f

    new-instance v4, Lob3/a;

    invoke-static {v1, v11}, Lq83/g;->N(Lob3/o;Lob3/l;)I

    move-result v6

    invoke-direct {v4, v6}, Lob3/a;-><init>(I)V

    invoke-static {v1, v11}, Lq83/g;->N(Lob3/o;Lob3/l;)I

    move-result v6

    move/from16 v10, p3

    move v12, v10

    :goto_14
    if-ge v10, v6, :cond_2d

    if-nez v12, :cond_28

    invoke-interface {v1, v11, v10}, Lob3/o;->c0(Lob3/l;I)Lob3/m;

    move-result-object v12

    invoke-interface {v1, v12}, Lob3/o;->l(Lob3/m;)Lob3/p;

    move-result-object v12

    sget-object v13, Lob3/p;->y:Lob3/p;

    if-eq v12, v13, :cond_27

    goto :goto_15

    :cond_27
    move/from16 v12, p3

    goto :goto_16

    :cond_28
    :goto_15
    const/4 v12, 0x1

    :goto_16
    if-nez v12, :cond_2c

    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v8, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_17
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_2b

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lob3/h;

    invoke-static {v15, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v15, v10}, Lob3/o;->S(Lob3/h;I)Lob3/k;

    move-result-object v9

    if-eqz v9, :cond_2a

    move/from16 v18, v6

    invoke-interface {v1, v9}, Lob3/o;->i(Lob3/k;)Lob3/p;

    move-result-object v6

    sget-object v7, Lob3/p;->z:Lob3/p;

    if-ne v6, v7, :cond_29

    goto :goto_18

    :cond_29
    const/4 v9, 0x0

    :goto_18
    if-eqz v9, :cond_2a

    invoke-static {v1, v9}, Lq83/g;->A(Lob3/o;Lob3/k;)Lob3/g;

    move-result-object v6

    if-eqz v6, :cond_2a

    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v7, p0

    move/from16 v6, v18

    const/16 v9, 0xa

    goto :goto_17

    :cond_2a
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Incorrect type: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", subType: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", superType: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2b
    move/from16 v18, v6

    invoke-interface {v1, v13}, Lob3/o;->z(Ljava/util/ArrayList;)Lob3/g;

    move-result-object v6

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v6}, Lob3/o;->e0(Lob3/g;)Lob3/k;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_19

    :cond_2c
    move/from16 v18, v6

    :goto_19
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v7, p0

    move/from16 v6, v18

    const/16 v9, 0xa

    goto/16 :goto_14

    :cond_2d
    if-nez v12, :cond_2e

    invoke-static {v0, v1, v4, v3}, Llb3/d;->j(Llb3/p0;Lob3/o;Lob3/j;Lob3/h;)Z

    move-result v2

    if-eqz v2, :cond_2e

    :goto_1a
    const/16 v17, 0x1

    goto :goto_1b

    :cond_2e
    new-instance v2, Llb3/c;

    invoke-direct {v2, v8, v0, v1, v3}, Llb3/c;-><init>(Ljava/util/AbstractCollection;Llb3/p0;Lob3/o;Lob3/h;)V

    new-instance v0, Llb3/l0;

    invoke-direct {v0}, Llb3/l0;-><init>()V

    invoke-virtual {v2, v0}, Llb3/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Llb3/l0;->a()Z

    move-result v0

    return v0

    :cond_2f
    invoke-static {v8}, Lm83/s;->E0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lob3/h;

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Lob3/o;->M(Lob3/h;)Lob3/j;

    move-result-object v2

    invoke-static {v0, v1, v2, v3}, Llb3/d;->j(Llb3/p0;Lob3/o;Lob3/j;Lob3/h;)Z

    move-result v0

    return v0

    :cond_30
    invoke-static {v1, v2}, Lq83/g;->e0(Lob3/o;Lob3/h;)Lob3/l;

    move-result-object v3

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v3}, Lob3/o;->C(Lob3/l;)Z

    move-result v7

    if-eqz v7, :cond_31

    invoke-interface {v1, v3}, Lob3/o;->u(Lob3/l;)Z

    move-result v0

    return v0

    :cond_31
    invoke-static {v1, v2}, Lq83/g;->e0(Lob3/o;Lob3/h;)Lob3/l;

    move-result-object v3

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v3}, Lob3/o;->u(Lob3/l;)Z

    move-result v3

    if-eqz v3, :cond_32

    goto :goto_1a

    :goto_1b
    return v17

    :cond_32
    invoke-virtual {v0}, Llb3/p0;->c()V

    iget-object v3, v0, Llb3/p0;->g:Ljava/util/ArrayDeque;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v7, v0, Llb3/p0;->h:Lub3/h;

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    :goto_1c
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_38

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lob3/h;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v7, v2}, Lub3/h;->add(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_37

    invoke-interface {v1, v2}, Lob3/o;->j(Lob3/h;)Z

    move-result v8

    if-eqz v8, :cond_33

    move-object v8, v6

    goto :goto_1d

    :cond_33
    move-object v8, v4

    :goto_1d
    invoke-virtual {v8, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_34

    goto :goto_1e

    :cond_34
    const/4 v8, 0x0

    :goto_1e
    if-nez v8, :cond_35

    goto :goto_1c

    :cond_35
    invoke-interface {v12, v2}, Lob3/o;->T(Lob3/h;)Lob3/l;

    move-result-object v2

    invoke-interface {v12, v2}, Lob3/o;->s(Lob3/l;)Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_37

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lob3/g;

    invoke-virtual {v8, v0, v9}, Ls2/e;->i0(Llb3/p0;Lob3/g;)Lob3/h;

    move-result-object v9

    invoke-static {v1, v9}, Lq83/g;->e0(Lob3/o;Lob3/h;)Lob3/l;

    move-result-object v10

    invoke-static {v10, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v10}, Lob3/o;->u(Lob3/l;)Z

    move-result v10

    if-eqz v10, :cond_36

    invoke-virtual {v0}, Llb3/p0;->a()V

    const/16 v17, 0x1

    return v17

    :cond_36
    const/16 v17, 0x1

    invoke-virtual {v3, v9}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_1f

    :cond_37
    const/16 v17, 0x1

    goto :goto_1c

    :cond_38
    invoke-virtual {v0}, Llb3/p0;->a()V

    return p3
.end method

.method public f(Llb3/q0;Ljava/util/List;)Llb3/y0;
    .locals 4

    const-string v0, "typeConstructor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v0

    const-string v1, "getParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr93/x0;

    if-eqz v2, :cond_1

    invoke-interface {v2}, Lr93/x0;->D()Z

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    invoke-interface {p1}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

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

    check-cast v1, Lr93/x0;

    invoke-interface {v1}, Lr93/x0;->e()Llb3/q0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    check-cast p2, Ljava/lang/Iterable;

    invoke-static {v0, p2}, Lm83/s;->K1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    new-instance p2, Llb3/r0;

    invoke-direct {p2, p1}, Llb3/r0;-><init>(Ljava/util/Map;)V

    return-object p2

    :cond_1
    new-instance p1, Llb3/u;

    check-cast v0, Ljava/util/Collection;

    const/4 v1, 0x0

    new-array v2, v1, [Lr93/x0;

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lr93/x0;

    check-cast p2, Ljava/util/Collection;

    new-array v2, v1, [Llb3/u0;

    invoke-interface {p2, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Llb3/u0;

    invoke-direct {p1, v0, p2, v1}, Llb3/u;-><init>([Lr93/x0;[Llb3/u0;Z)V

    return-object p1
.end method
