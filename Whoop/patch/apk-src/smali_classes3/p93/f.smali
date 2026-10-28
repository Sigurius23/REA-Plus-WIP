.class public final Lp93/f;
.super Lu93/q0;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lr93/k;Lp93/f;IZ)V
    .locals 7

    sget-object v4, Lrb3/s;->g:Lva3/h;

    sget-object v6, Lr93/s0;->q:Lr93/v0;

    sget-object v3, Ls93/g;->a:Ls93/f;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p3

    invoke-direct/range {v0 .. v6}, Lu93/q0;-><init>(Lr93/k;Lu93/q0;Ls93/i;Lva3/h;ILr93/s0;)V

    const/4 p1, 0x1

    iput-boolean p1, v0, Lu93/x;->N:Z

    iput-boolean p4, v0, Lu93/x;->V:Z

    const/4 p1, 0x0

    iput-boolean p1, v0, Lu93/x;->W:Z

    return-void
.end method


# virtual methods
.method public final L0(ILr93/k;Lr93/w;Lr93/s0;Ls93/i;Lva3/h;)Lu93/x;
    .locals 0

    const-string p4, "newOwner"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "kind"

    invoke-static {p1, p4}, Lih0/d0;->w(ILjava/lang/String;)V

    const-string p4, "annotations"

    invoke-static {p5, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p4, Lp93/f;

    check-cast p3, Lp93/f;

    iget-boolean p5, p0, Lu93/x;->V:Z

    invoke-direct {p4, p2, p3, p1, p5}, Lp93/f;-><init>(Lr93/k;Lp93/f;IZ)V

    return-object p4
.end method

.method public final M0(Lu93/w;)Lu93/x;
    .locals 9

    invoke-super {p0, p1}, Lu93/x;->M0(Lu93/w;)Lu93/x;

    move-result-object p1

    check-cast p1, Lp93/f;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lu93/x;->v()Ljava/util/List;

    move-result-object v0

    const-string v1, "getValueParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    instance-of v2, v0, Ljava/util/Collection;

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_3

    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr93/a1;

    check-cast v2, Lu93/x0;

    invoke-virtual {v2}, Lu93/x0;->getType()Llb3/y;

    move-result-object v2

    const-string v3, "getType(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/squareup/wire/n;->w(Llb3/y;)Lva3/h;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Lu93/x;->v()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr93/a1;

    check-cast v5, Lu93/x0;

    invoke-virtual {v5}, Lu93/x0;->getType()Llb3/y;

    move-result-object v5

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lcom/squareup/wire/n;->w(Llb3/y;)Lva3/h;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lu93/x;->v()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v0, v3

    const/4 v3, 0x1

    if-nez v0, :cond_6

    invoke-virtual {p1}, Lu93/x;->v()Ljava/util/List;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v2, v5}, Lm83/s;->K1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_4

    goto/16 :goto_3

    :cond_4
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll83/k;

    iget-object v7, v6, Ll83/k;->w:Ljava/lang/Object;

    check-cast v7, Lva3/h;

    iget-object v6, v6, Ll83/k;->x:Ljava/lang/Object;

    check-cast v6, Lr93/a1;

    check-cast v6, Lu93/n;

    invoke-virtual {v6}, Lu93/n;->getName()Lva3/h;

    move-result-object v6

    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    :cond_6
    invoke-virtual {p1}, Lu93/x;->v()Ljava/util/List;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v5, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr93/a1;

    move-object v6, v5

    check-cast v6, Lu93/n;

    invoke-virtual {v6}, Lu93/n;->getName()Lva3/h;

    move-result-object v6

    const-string v7, "getName(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, v5

    check-cast v7, Lu93/w0;

    iget v7, v7, Lu93/w0;->G:I

    sub-int v8, v7, v0

    if-ltz v8, :cond_7

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lva3/h;

    if-eqz v8, :cond_7

    move-object v6, v8

    :cond_7
    invoke-interface {v5, p1, v6, v7}, Lr93/a1;->o(Lp93/f;Lva3/h;I)Lr93/a1;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_8
    sget-object v0, Llb3/a1;->b:Llb3/a1;

    invoke-virtual {p1, v0}, Lu93/x;->P0(Llb3/a1;)Lu93/w;

    move-result-object v0

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_a

    :cond_9
    move v3, v5

    goto :goto_2

    :cond_a
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lva3/h;

    if-nez v4, :cond_b

    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v0, Lu93/w;->V:Ljava/lang/Boolean;

    iput-object v1, v0, Lu93/w;->G:Ljava/util/List;

    invoke-virtual {p1}, Lu93/q0;->V0()Lu93/q0;

    move-result-object v1

    iput-object v1, v0, Lu93/w;->E:Lr93/w;

    invoke-super {p1, v0}, Lu93/x;->M0(Lu93/w;)Lu93/x;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_c
    :goto_3
    return-object p1
.end method

.method public final isExternal()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final isInline()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final q()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
