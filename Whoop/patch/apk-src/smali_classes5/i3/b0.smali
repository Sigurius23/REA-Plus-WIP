.class public abstract Li3/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Ljava/util/Comparator;

.field public static final b:Li3/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x2

    new-array v1, v0, [Ljava/util/Comparator;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    if-nez v2, :cond_0

    sget-object v3, Li3/g;->y:Li3/g;

    goto :goto_1

    :cond_0
    sget-object v3, Li3/g;->x:Li3/g;

    :goto_1
    new-instance v4, Lf1/u0;

    invoke-direct {v4, v3}, Lf1/u0;-><init>(Ljava/util/Comparator;)V

    new-instance v3, Lf1/u0;

    const/4 v5, 0x2

    invoke-direct {v3, v4, v5}, Lf1/u0;-><init>(Ljava/lang/Object;I)V

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    sput-object v1, Li3/b0;->a:[Ljava/util/Comparator;

    sget-object v0, Li3/a0;->w:Li3/a0;

    sput-object v0, Li3/b0;->b:Li3/a0;

    return-void
.end method

.method public static final a(Li3/p;Ljava/util/ArrayList;La0/a1;La0/a1;La0/g0;)V
    .locals 3

    iget-object v0, p0, Li3/p;->d:Li3/l;

    sget-object v1, Li3/u;->m:Li3/y;

    iget-object v0, v0, Li3/l;->w:La0/v0;

    invoke-virtual {v0, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p3, p0}, La0/a1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    invoke-virtual {p2, p0}, La0/a1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    const/4 v1, 0x7

    if-eqz v0, :cond_3

    iget p1, p0, Li3/p;->g:I

    invoke-static {v1, p0}, Li3/p;->j(ILi3/p;)Ljava/util/List;

    move-result-object v0

    invoke-static {p0, p2, p3, v0}, Li3/b0;->b(Li3/p;La0/a1;La0/a1;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p4, p1, p0}, La0/g0;->h(ILjava/lang/Object;)V

    return-void

    :cond_3
    invoke-static {v1, p0}, Li3/p;->j(ILi3/p;)Ljava/util/List;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_4

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li3/p;

    invoke-static {v2, p1, p2, p3, p4}, Li3/b0;->a(Li3/p;Ljava/util/ArrayList;La0/a1;La0/a1;La0/g0;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public static final b(Li3/p;La0/a1;La0/a1;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 17

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    sget-object v2, La0/t;->a:La0/g0;

    new-instance v2, La0/g0;

    invoke-direct {v2}, La0/g0;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_0

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Li3/p;

    move-object/from16 v8, p1

    invoke-static {v7, v3, v8, v0, v2}, Li3/b0;->a(Li3/p;Ljava/util/ArrayList;La0/a1;La0/a1;La0/g0;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    move-object/from16 v6, p0

    iget-object v1, v6, Li3/p;->c:La3/n0;

    iget-object v1, v1, La3/n0;->Y:Ly3/m;

    sget-object v4, Ly3/m;->x:Ly3/m;

    if-ne v1, v4, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v7

    div-int/lit8 v7, v7, 0x2

    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {v3}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v7

    if-ltz v7, :cond_7

    const/4 v8, 0x0

    :goto_2
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Li3/p;

    if-eqz v8, :cond_5

    invoke-virtual {v9}, Li3/p;->h()Lh2/c;

    move-result-object v10

    iget v10, v10, Lh2/c;->b:F

    invoke-virtual {v9}, Li3/p;->h()Lh2/c;

    move-result-object v11

    iget v11, v11, Lh2/c;->d:F

    cmpl-float v12, v10, v11

    if-ltz v12, :cond_2

    const/4 v12, 0x1

    goto :goto_3

    :cond_2
    const/4 v12, 0x0

    :goto_3
    invoke-static {v4}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v13

    if-ltz v13, :cond_5

    const/4 v14, 0x0

    :goto_4
    invoke-virtual {v4, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll83/k;

    iget-object v15, v15, Ll83/k;->w:Ljava/lang/Object;

    check-cast v15, Lh2/c;

    iget v5, v15, Lh2/c;->b:F

    const/16 p0, 0x1

    iget v6, v15, Lh2/c;->d:F

    cmpl-float v16, v5, v6

    if-ltz v16, :cond_3

    move/from16 v16, p0

    goto :goto_5

    :cond_3
    const/16 v16, 0x0

    :goto_5
    if-nez v12, :cond_4

    if-nez v16, :cond_4

    invoke-static {v10, v5}, Ljava/lang/Math;->max(FF)F

    move-result v5

    invoke-static {v11, v6}, Ljava/lang/Math;->min(FF)F

    move-result v16

    cmpg-float v5, v5, v16

    if-gez v5, :cond_4

    new-instance v5, Lh2/c;

    iget v12, v15, Lh2/c;->a:F

    const/4 v13, 0x0

    invoke-static {v12, v13}, Ljava/lang/Math;->max(FF)F

    move-result v12

    iget v13, v15, Lh2/c;->b:F

    invoke-static {v13, v10}, Ljava/lang/Math;->max(FF)F

    move-result v10

    iget v13, v15, Lh2/c;->c:F

    const/high16 v15, 0x7f800000    # Float.POSITIVE_INFINITY

    invoke-static {v13, v15}, Ljava/lang/Math;->min(FF)F

    move-result v13

    invoke-static {v6, v11}, Ljava/lang/Math;->min(FF)F

    move-result v6

    invoke-direct {v5, v12, v10, v13, v6}, Lh2/c;-><init>(FFFF)V

    new-instance v6, Ll83/k;

    invoke-virtual {v4, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll83/k;

    iget-object v10, v10, Ll83/k;->x:Ljava/lang/Object;

    invoke-direct {v6, v5, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v14, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll83/k;

    iget-object v5, v5, Ll83/k;->x:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    invoke-interface {v5, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_4
    if-eq v14, v13, :cond_6

    add-int/lit8 v14, v14, 0x1

    goto :goto_4

    :cond_5
    const/16 p0, 0x1

    :cond_6
    invoke-virtual {v9}, Li3/p;->h()Lh2/c;

    move-result-object v5

    new-instance v6, Ll83/k;

    filled-new-array {v9}, [Li3/p;

    move-result-object v9

    invoke-static {v9}, Lwb3/f;->P([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v9

    invoke-direct {v6, v5, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_6
    if-eq v8, v7, :cond_8

    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_2

    :cond_7
    const/16 p0, 0x1

    :cond_8
    sget-object v3, Li3/g;->z:Li3/g;

    invoke-static {v4, v3}, Lm83/w;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    sget-object v5, Li3/b0;->a:[Ljava/util/Comparator;

    xor-int/lit8 v1, v1, 0x1

    aget-object v1, v5, v1

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_7
    if-ge v6, v5, :cond_9

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll83/k;

    iget-object v8, v7, Ll83/k;->x:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    invoke-static {v8, v1}, Lm83/w;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    iget-object v7, v7, Ll83/k;->x:Ljava/lang/Object;

    check-cast v7, Ljava/util/Collection;

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_7

    :cond_9
    new-instance v1, Lea2/l;

    const/4 v4, 0x3

    sget-object v5, Li3/b0;->b:Li3/a0;

    invoke-direct {v1, v5, v4}, Lea2/l;-><init>(Ljava/lang/Object;I)V

    invoke-static {v3, v1}, Lm83/w;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    const/4 v5, 0x0

    :goto_8
    invoke-static {v3}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v1

    if-gt v5, v1, :cond_c

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li3/p;

    iget v1, v1, Li3/p;->g:I

    invoke-virtual {v2, v1}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_b

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v4}, La0/a1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_a

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_9

    :cond_a
    add-int/lit8 v5, v5, 0x1

    :goto_9
    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-virtual {v3, v5, v4}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v5, v1

    goto :goto_8

    :cond_b
    add-int/lit8 v5, v5, 0x1

    goto :goto_8

    :cond_c
    return-object v3
.end method
