.class public final Lx03/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ln0/u;

.field public final b:Lc93/m;

.field public final c:Lp1/k1;

.field public final d:Lp1/f0;


# direct methods
.method public constructor <init>(Ln0/u;Lc93/m;)V
    .locals 1

    const-string v0, "lazyListState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "snapOffsetForItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx03/b;->a:Ln0/u;

    iput-object p2, p0, Lx03/b;->b:Lc93/m;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lx03/b;->c:Lp1/k1;

    new-instance p1, Lm5/k;

    const/16 p2, 0xe

    invoke-direct {p1, p0, p2}, Lm5/k;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object p1

    iput-object p1, p0, Lx03/b;->d:Lp1/f0;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 4

    iget-object v0, p0, Lx03/b;->a:Ln0/u;

    invoke-virtual {v0}, Ln0/u;->h()Ln0/n;

    move-result-object v1

    iget-object v1, v1, Ln0/n;->k:Ljava/lang/Object;

    invoke-static {v1}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/g;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    check-cast v1, Ln0/o;

    iget v2, v1, Ln0/o;->a:I

    invoke-virtual {v0}, Ln0/u;->h()Ln0/n;

    move-result-object v0

    iget v0, v0, Ln0/n;->n:I

    const/4 v3, 0x1

    sub-int/2addr v0, v3

    if-lt v2, v0, :cond_2

    iget v0, v1, Ln0/o;->o:I

    iget v1, v1, Ln0/o;->p:I

    add-int/2addr v0, v1

    iget-object v1, p0, Lx03/b;->a:Ln0/u;

    invoke-virtual {v1}, Ln0/u;->h()Ln0/n;

    move-result-object v1

    iget v1, v1, Ln0/n;->m:I

    iget-object v2, p0, Lx03/b;->c:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    sub-int/2addr v1, v2

    if-le v0, v1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0

    :cond_2
    :goto_1
    return v3
.end method

.method public final b()Z
    .locals 2

    iget-object v0, p0, Lx03/b;->a:Ln0/u;

    invoke-virtual {v0}, Ln0/u;->h()Ln0/n;

    move-result-object v0

    iget-object v0, v0, Ln0/n;->k:Ljava/lang/Object;

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/g;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast v0, Ln0/o;

    iget v1, v0, Ln0/o;->a:I

    if-gtz v1, :cond_2

    iget v0, v0, Ln0/o;->o:I

    if-gez v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0

    :cond_2
    :goto_1
    const/4 v0, 0x1

    return v0
.end method

.method public final c(I)I
    .locals 4

    iget-object v0, p0, Lx03/b;->a:Ln0/u;

    invoke-virtual {v0}, Ln0/u;->h()Ln0/n;

    move-result-object v0

    iget-object v0, v0, Ln0/n;->k:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object v0

    sget-object v1, Lx03/a;->w:Lx03/a;

    invoke-static {v0, v1}, Lxb3/k;->A(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/s;

    move-result-object v0

    iget-object v1, v0, Lxb3/s;->a:Lxb3/i;

    invoke-interface {v1}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, v0, Lxb3/s;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lx03/c;

    invoke-virtual {v3}, Lx03/c;->a()I

    move-result v3

    if-ne v3, p1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    check-cast v2, Lx03/c;

    iget-object v0, p0, Lx03/b;->b:Lc93/m;

    if-eqz v2, :cond_2

    iget-object p1, v2, Lx03/c;->a:Ln0/g;

    check-cast p1, Ln0/o;

    iget p1, p1, Ln0/o;->o:I

    invoke-interface {v0, p0, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    sub-int/2addr p1, v0

    return p1

    :cond_2
    invoke-virtual {p0}, Lx03/b;->e()Lx03/c;

    move-result-object v1

    if-nez v1, :cond_3

    const/4 p1, 0x0

    return p1

    :cond_3
    invoke-virtual {v1}, Lx03/c;->a()I

    move-result v2

    sub-int/2addr p1, v2

    int-to-float p1, p1

    invoke-virtual {p0}, Lx03/b;->d()F

    move-result v2

    mul-float/2addr v2, p1

    invoke-static {v2}, Le93/b;->X(F)I

    move-result p1

    iget-object v2, v1, Lx03/c;->a:Ln0/g;

    check-cast v2, Ln0/o;

    iget v2, v2, Ln0/o;->o:I

    add-int/2addr v2, p1

    invoke-interface {v0, p0, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    sub-int/2addr v2, p1

    return v2
.end method

.method public final d()F
    .locals 9

    iget-object v0, p0, Lx03/b;->a:Ln0/u;

    invoke-virtual {v0}, Ln0/u;->h()Ln0/n;

    move-result-object v1

    iget-object v2, v1, Ln0/n;->k:Ljava/lang/Object;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v1, v1, Ln0/n;->k:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_1

    move-object v4, v5

    goto :goto_0

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_0

    :cond_2
    move-object v6, v4

    check-cast v6, Ln0/g;

    check-cast v6, Ln0/o;

    iget v6, v6, Ln0/o;->o:I

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ln0/g;

    check-cast v8, Ln0/o;

    iget v8, v8, Ln0/o;->o:I

    if-le v6, v8, :cond_4

    move-object v4, v7

    move v6, v8

    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_3

    :goto_0
    move-object v7, v4

    check-cast v7, Ln0/g;

    if-nez v7, :cond_5

    goto :goto_2

    :cond_5
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_1

    :cond_6
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_1

    :cond_7
    move-object v2, v5

    check-cast v2, Ln0/g;

    check-cast v2, Ln0/o;

    iget v3, v2, Ln0/o;->o:I

    iget v2, v2, Ln0/o;->p:I

    add-int/2addr v3, v2

    :cond_8
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ln0/g;

    check-cast v4, Ln0/o;

    iget v6, v4, Ln0/o;->o:I

    iget v4, v4, Ln0/o;->p:I

    add-int/2addr v6, v4

    if-ge v3, v6, :cond_9

    move-object v5, v2

    move v3, v6

    :cond_9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_8

    :goto_1
    check-cast v5, Ln0/g;

    if-nez v5, :cond_a

    goto :goto_2

    :cond_a
    check-cast v7, Ln0/o;

    iget v2, v7, Ln0/o;->o:I

    check-cast v5, Ln0/o;

    iget v3, v5, Ln0/o;->o:I

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget v3, v7, Ln0/o;->o:I

    iget v4, v7, Ln0/o;->p:I

    add-int/2addr v3, v4

    iget v4, v5, Ln0/o;->o:I

    iget v5, v5, Ln0/o;->p:I

    add-int/2addr v4, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    sub-int/2addr v3, v2

    if-nez v3, :cond_b

    :goto_2
    const/high16 v0, -0x40800000    # -1.0f

    return v0

    :cond_b
    invoke-virtual {v0}, Ln0/u;->h()Ln0/n;

    move-result-object v0

    iget-object v2, v0, Ln0/n;->k:Ljava/lang/Object;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-lt v2, v4, :cond_c

    iget-object v0, v0, Ln0/n;->k:Ljava/lang/Object;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/g;

    const/4 v4, 0x1

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/g;

    check-cast v0, Ln0/o;

    iget v0, v0, Ln0/o;->o:I

    check-cast v2, Ln0/o;

    iget v4, v2, Ln0/o;->p:I

    iget v2, v2, Ln0/o;->o:I

    add-int/2addr v4, v2

    sub-int v5, v0, v4

    :cond_c
    add-int/2addr v3, v5

    int-to-float v0, v3

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method

.method public final e()Lx03/c;
    .locals 1

    iget-object v0, p0, Lx03/b;->d:Lp1/f0;

    invoke-virtual {v0}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx03/c;

    return-object v0
.end method
