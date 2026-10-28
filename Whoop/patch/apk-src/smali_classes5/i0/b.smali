.class public final Li0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li0/l;


# instance fields
.field public final synthetic a:Ln0/u;

.field public final synthetic b:Li0/n;


# direct methods
.method public constructor <init>(Ln0/u;Li0/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/b;->a:Ln0/u;

    iput-object p2, p0, Li0/b;->b:Li0/n;

    return-void
.end method


# virtual methods
.method public final a(F)F
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Li0/b;->a:Ln0/u;

    invoke-virtual {v1}, Ln0/u;->h()Ln0/n;

    move-result-object v2

    iget-object v2, v2, Ln0/n;->k:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    const/high16 v5, 0x7f800000    # Float.POSITIVE_INFINITY

    const/4 v6, 0x0

    move v9, v5

    move v7, v6

    const/high16 v8, -0x800000    # Float.NEGATIVE_INFINITY

    :goto_0
    const/4 v10, 0x0

    const/4 v11, 0x1

    if-ge v7, v3, :cond_4

    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ln0/g;

    instance-of v13, v12, Lp0/e0;

    if-eqz v13, :cond_0

    move-object v13, v12

    check-cast v13, Lp0/e0;

    goto :goto_1

    :cond_0
    const/4 v13, 0x0

    :goto_1
    if-eqz v13, :cond_1

    invoke-interface {v13}, Lp0/e0;->c()Z

    move-result v13

    if-ne v13, v11, :cond_1

    const/high16 v16, -0x800000    # Float.NEGATIVE_INFINITY

    goto :goto_2

    :cond_1
    invoke-virtual {v1}, Ln0/u;->h()Ln0/n;

    move-result-object v11

    invoke-static {v11}, Lse/h;->G(Ln0/n;)I

    move-result v11

    invoke-virtual {v1}, Ln0/u;->h()Ln0/n;

    move-result-object v13

    iget v13, v13, Ln0/n;->l:I

    neg-int v13, v13

    invoke-virtual {v1}, Ln0/u;->h()Ln0/n;

    move-result-object v14

    iget v14, v14, Ln0/n;->p:I

    check-cast v12, Ln0/o;

    iget v15, v12, Ln0/o;->p:I

    iget v12, v12, Ln0/o;->o:I

    const/high16 v16, -0x800000    # Float.NEGATIVE_INFINITY

    invoke-virtual {v1}, Ln0/u;->h()Ln0/n;

    move-result-object v4

    iget v4, v4, Ln0/n;->n:I

    iget-object v4, v0, Li0/b;->b:Li0/n;

    invoke-interface {v4, v11, v15, v13, v14}, Li0/n;->a(IIII)I

    move-result v4

    int-to-float v4, v4

    int-to-float v11, v12

    sub-float/2addr v11, v4

    cmpg-float v4, v11, v10

    if-gtz v4, :cond_2

    cmpl-float v4, v11, v8

    if-lez v4, :cond_2

    move v8, v11

    :cond_2
    cmpl-float v4, v11, v10

    if-ltz v4, :cond_3

    cmpg-float v4, v11, v9

    if-gez v4, :cond_3

    move v9, v11

    :cond_3
    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_4
    const/high16 v16, -0x800000    # Float.NEGATIVE_INFINITY

    iget-object v1, v1, Ln0/u;->f:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/n;

    iget-object v1, v1, Ln0/n;->i:Ly3/c;

    invoke-static/range {p1 .. p1}, Ljava/lang/Math;->abs(F)F

    move-result v2

    sget v3, Li0/k;->a:F

    invoke-interface {v1, v3}, Ly3/c;->q0(F)F

    move-result v1

    cmpg-float v1, v2, v1

    const/4 v2, 0x2

    if-gez v1, :cond_5

    goto :goto_3

    :cond_5
    cmpl-float v1, p1, v10

    if-lez v1, :cond_6

    move v6, v11

    goto :goto_3

    :cond_6
    move v6, v2

    :goto_3
    if-nez v6, :cond_7

    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpg-float v1, v1, v2

    if-gtz v1, :cond_a

    goto :goto_4

    :cond_7
    if-ne v6, v11, :cond_8

    :goto_4
    move v8, v9

    goto :goto_5

    :cond_8
    if-ne v6, v2, :cond_9

    goto :goto_5

    :cond_9
    move v8, v10

    :cond_a
    :goto_5
    cmpg-float v1, v8, v5

    if-nez v1, :cond_b

    goto :goto_6

    :cond_b
    cmpg-float v1, v8, v16

    if-nez v1, :cond_c

    :goto_6
    return v10

    :cond_c
    return v8
.end method

.method public final b(FF)F
    .locals 4

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget-object v0, p0, Li0/b;->a:Ln0/u;

    invoke-virtual {v0}, Ln0/u;->h()Ln0/n;

    move-result-object v0

    iget-object v1, v0, Ln0/n;->k:Ljava/lang/Object;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, v0, Ln0/n;->k:Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln0/g;

    check-cast v3, Ln0/o;

    iget v3, v3, Ln0/o;->p:I

    add-int/2addr v2, v3

    goto :goto_0

    :cond_1
    div-int/2addr v2, v1

    :goto_1
    int-to-float v0, v2

    sub-float/2addr p1, v0

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-gez v1, :cond_2

    move p1, v0

    :cond_2
    invoke-static {p2}, Ljava/lang/Math;->signum(F)F

    move-result p2

    mul-float/2addr p2, p1

    return p2
.end method
