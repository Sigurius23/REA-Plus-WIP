.class public final Lfa3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lya3/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final b(Lr93/b;Lr93/b;Lr93/e;)I
    .locals 6

    const-string p3, "superDescriptor"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "subDescriptor"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p3, p2, Lha3/e;

    const/4 v0, 0x3

    if-eqz p3, :cond_8

    move-object p3, p2

    check-cast p3, Lha3/e;

    invoke-virtual {p3}, Lu93/x;->getTypeParameters()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-static {p1, p2}, Lya3/n;->i(Lr93/b;Lr93/b;)Lya3/m;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lya3/m;->b()I

    move-result v1

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    if-eqz v1, :cond_2

    goto/16 :goto_2

    :cond_2
    invoke-virtual {p3}, Lu93/x;->v()Ljava/util/List;

    move-result-object v1

    const-string v3, "getValueParameters(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object v1

    sget-object v3, Lfa3/d;->E:Lfa3/d;

    invoke-static {v1, v3}, Lxb3/k;->A(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/s;

    move-result-object v1

    iget-object v3, p3, Lu93/x;->H:Llb3/y;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v4, Lb3/d3;

    invoke-direct {v4, v3, v0}, Lb3/d3;-><init>(Ljava/lang/Object;I)V

    const/4 v3, 0x2

    new-array v5, v3, [Lxb3/i;

    aput-object v1, v5, v2

    const/4 v1, 0x1

    aput-object v4, v5, v1

    invoke-static {v5}, Lm83/n;->X([Ljava/lang/Object;)Lxb3/i;

    move-result-object v4

    new-instance v5, Lxa0/a;

    invoke-direct {v5, v0}, Lxa0/a;-><init>(I)V

    invoke-static {v4, v5}, Lxb3/k;->v(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/g;

    move-result-object v4

    iget-object p3, p3, Lu93/x;->J:Lr93/q0;

    if-eqz p3, :cond_3

    check-cast p3, Lu93/d;

    invoke-virtual {p3}, Lu93/d;->getType()Llb3/y;

    move-result-object p3

    goto :goto_1

    :cond_3
    const/4 p3, 0x0

    :goto_1
    invoke-static {p3}, Lwb3/f;->L(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/lang/Iterable;

    invoke-static {p3}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object p3

    new-array v3, v3, [Lxb3/i;

    aput-object v4, v3, v2

    aput-object p3, v3, v1

    invoke-static {v3}, Lm83/n;->X([Ljava/lang/Object;)Lxb3/i;

    move-result-object p3

    new-instance v3, Lxa0/a;

    invoke-direct {v3, v0}, Lxa0/a;-><init>(I)V

    invoke-static {p3, v3}, Lxb3/k;->v(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/g;

    move-result-object p3

    new-instance v3, Lxb3/e;

    invoke-direct {v3, p3}, Lxb3/e;-><init>(Lxb3/g;)V

    :cond_4
    invoke-virtual {v3}, Lxb3/e;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-virtual {v3}, Lxb3/e;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Llb3/y;

    invoke-virtual {p3}, Llb3/y;->X()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_4

    invoke-virtual {p3}, Llb3/y;->p0()Llb3/f1;

    move-result-object p3

    instance-of p3, p3, Lka3/h;

    if-nez p3, :cond_4

    goto :goto_2

    :cond_5
    new-instance p3, Lka3/f;

    invoke-direct {p3}, Lka3/f;-><init>()V

    new-instance v3, Llb3/a1;

    invoke-direct {v3, p3}, Llb3/a1;-><init>(Llb3/y0;)V

    invoke-interface {p1, v3}, Lr93/u0;->d(Llb3/a1;)Lr93/l;

    move-result-object p1

    check-cast p1, Lr93/b;

    if-nez p1, :cond_6

    goto :goto_2

    :cond_6
    instance-of p3, p1, Lu93/q0;

    if-eqz p3, :cond_7

    move-object p3, p1

    check-cast p3, Lu93/q0;

    invoke-virtual {p3}, Lu93/x;->getTypeParameters()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_7

    invoke-interface {p3}, Lr93/w;->l0()Lr93/v;

    move-result-object p1

    invoke-interface {p1}, Lr93/v;->i()Lr93/v;

    move-result-object p1

    invoke-interface {p1}, Lr93/v;->build()Lr93/w;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_7
    sget-object p3, Lya3/n;->c:Lya3/n;

    invoke-virtual {p3, p1, p2, v2}, Lya3/n;->n(Lr93/b;Lr93/b;Z)Lya3/m;

    move-result-object p1

    invoke-virtual {p1}, Lya3/m;->b()I

    move-result p1

    const-string p2, "getResult(...)"

    invoke-static {p1, p2}, Ljh3/c;->m(ILjava/lang/String;)V

    sget-object p2, Lfa3/h;->a:[I

    invoke-static {p1}, Le4/p;->e(I)I

    move-result p1

    aget p1, p2, p1

    if-ne p1, v1, :cond_8

    return v1

    :cond_8
    :goto_2
    return v0
.end method
