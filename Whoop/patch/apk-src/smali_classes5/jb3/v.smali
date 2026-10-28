.class public final Ljb3/v;
.super Lu93/c;
.source "SourceFile"


# instance fields
.field public final L:Lhb3/k;

.field public final M:Lqa3/b1;

.field public final N:Ljb3/a;


# direct methods
.method public constructor <init>(Lhb3/k;Lqa3/b1;I)V
    .locals 10

    iget-object v0, p1, Lhb3/k;->a:Lhb3/i;

    iget-object v2, v0, Lhb3/i;->a:Lkb3/k;

    iget-object v3, p1, Lhb3/k;->c:Lr93/k;

    iget-object v0, p1, Lhb3/k;->b:Lsa3/f;

    iget v1, p2, Lqa3/b1;->E:I

    invoke-static {v0, v1}, Le93/b;->F(Lsa3/f;I)Lva3/h;

    move-result-object v5

    iget-object v0, p2, Lqa3/b1;->G:Lqa3/a1;

    const-string v1, "getVariance(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    sget-object v0, Llb3/g1;->y:Llb3/g1;

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object v0, Llb3/g1;->E:Llb3/g1;

    goto :goto_0

    :cond_2
    sget-object v0, Llb3/g1;->z:Llb3/g1;

    goto :goto_0

    :goto_1
    iget-boolean v7, p2, Lqa3/b1;->F:Z

    sget-object v9, Lr93/v0;->x:Lr93/v0;

    sget-object v4, Ls93/g;->a:Ls93/f;

    move-object v1, p0

    move v8, p3

    invoke-direct/range {v1 .. v9}, Lu93/c;-><init>(Lkb3/n;Lr93/k;Ls93/i;Lva3/h;Llb3/g1;ZILr93/v0;)V

    iput-object p1, v1, Ljb3/v;->L:Lhb3/k;

    iput-object p2, v1, Ljb3/v;->M:Lqa3/b1;

    new-instance p1, Ljb3/a;

    new-instance p2, Lfa3/u;

    const/4 p3, 0x5

    invoke-direct {p2, p0, p3}, Lfa3/u;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p1, v2, p2}, Ljb3/a;-><init>(Lkb3/n;Lc93/a;)V

    iput-object p1, v1, Ljb3/v;->N:Ljb3/a;

    return-void
.end method


# virtual methods
.method public final K0()Ljava/util/List;
    .locals 4

    iget-object v0, p0, Ljb3/v;->L:Lhb3/k;

    iget-object v1, v0, Lhb3/k;->d:Lsa3/h;

    iget-object v2, p0, Ljb3/v;->M:Lqa3/b1;

    invoke-static {v2, v1}, Ljc/x;->A0(Lqa3/b1;Lsa3/h;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {p0}, Lcb3/e;->e(Lr93/k;)Lo93/h;

    move-result-object v0

    invoke-virtual {v0}, Lo93/h;->n()Llb3/c0;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    check-cast v1, Ljava/lang/Iterable;

    iget-object v0, v0, Lhb3/k;->h:Lhb3/h0;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/w0;

    invoke-virtual {v0, v3}, Lhb3/h0;->g(Lqa3/w0;)Llb3/y;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v2
.end method

.method public final getAnnotations()Ls93/i;
    .locals 1

    iget-object v0, p0, Ljb3/v;->N:Ljb3/a;

    return-object v0
.end method
