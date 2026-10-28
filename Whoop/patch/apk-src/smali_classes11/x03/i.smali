.class public final Lx03/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/o1;


# instance fields
.field public final a:Lx03/b;

.field public final b:Ld0/x;

.field public final c:Ld0/l;

.field public final d:Lbm/l;

.field public final e:Lkotlin/jvm/functions/Function1;

.field public final f:Lp1/k1;


# direct methods
.method public constructor <init>(Lx03/b;Ld0/x;Ld0/l;)V
    .locals 1

    const-string v0, "decayAnimationSpec"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "springAnimationSpec"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lx03/k;->b:Lx03/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx03/i;->a:Lx03/b;

    iput-object p2, p0, Lx03/i;->b:Ld0/x;

    iput-object p3, p0, Lx03/i;->c:Ld0/l;

    sget-object p1, Lbm/l;->w:Lbm/l;

    iput-object p1, p0, Lx03/i;->d:Lbm/l;

    iput-object v0, p0, Lx03/i;->e:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x0

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lx03/i;->f:Lp1/k1;

    return-void
.end method

.method public static final b(Lx03/i;Ld0/k;Lx03/c;ILkotlin/jvm/functions/Function1;)Z
    .locals 4

    invoke-virtual {p1}, Ld0/k;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iget-object p0, p0, Lx03/i;->a:Lx03/b;

    const/4 v0, 0x0

    cmpl-float v1, p1, v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lez v1, :cond_0

    invoke-virtual {p2}, Lx03/c;->a()I

    move-result v1

    if-lt v1, p3, :cond_0

    invoke-virtual {p2}, Lx03/c;->a()I

    move-result p1

    invoke-virtual {p0, p1}, Lx03/b;->c(I)I

    move-result p0

    goto :goto_0

    :cond_0
    cmpg-float p1, p1, v0

    if-gez p1, :cond_1

    invoke-virtual {p2}, Lx03/c;->a()I

    move-result p1

    sub-int/2addr p3, v3

    if-gt p1, p3, :cond_1

    invoke-virtual {p2}, Lx03/c;->a()I

    move-result p1

    add-int/2addr p1, v3

    invoke-virtual {p0, p1}, Lx03/b;->c(I)I

    move-result p0

    goto :goto_0

    :cond_1
    move p0, v2

    :goto_0
    if-eqz p0, :cond_2

    int-to-float p0, p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-interface {p4, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return v3

    :cond_2
    return v2
.end method


# virtual methods
.method public final a(Lh0/k2;FLq83/d;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p2

    iget-object v2, v0, Lx03/i;->a:Lx03/b;

    invoke-virtual {v2}, Lx03/b;->b()Z

    move-result v3

    iget-object v4, v2, Lx03/b;->a:Ln0/u;

    if-eqz v3, :cond_b

    invoke-virtual {v2}, Lx03/b;->a()Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v3, v0, Lx03/i;->e:Lkotlin/jvm/functions/Function1;

    invoke-interface {v3, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    const/4 v5, 0x0

    cmpl-float v6, v3, v5

    if-lez v6, :cond_a

    invoke-virtual {v2}, Lx03/b;->e()Lx03/c;

    move-result-object v6

    if-nez v6, :cond_1

    new-instance v2, Ljava/lang/Float;

    invoke-direct {v2, v1}, Ljava/lang/Float;-><init>(F)V

    return-object v2

    :cond_1
    const-string v7, "decayAnimationSpec"

    iget-object v8, v0, Lx03/i;->b:Ld0/x;

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lx03/b;->e()Lx03/c;

    move-result-object v7

    if-nez v7, :cond_2

    const/4 v3, -0x1

    goto/16 :goto_3

    :cond_2
    invoke-virtual {v2}, Lx03/b;->d()F

    move-result v9

    cmpg-float v10, v9, v5

    if-gtz v10, :cond_3

    invoke-virtual {v7}, Lx03/c;->a()I

    move-result v3

    goto/16 :goto_3

    :cond_3
    invoke-virtual {v7}, Lx03/c;->a()I

    move-result v10

    invoke-virtual {v2, v10}, Lx03/b;->c(I)I

    move-result v10

    invoke-virtual {v7}, Lx03/c;->a()I

    move-result v11

    add-int/lit8 v11, v11, 0x1

    invoke-virtual {v2, v11}, Lx03/b;->c(I)I

    move-result v11

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v12

    const/high16 v13, 0x3f000000    # 0.5f

    cmpg-float v12, v12, v13

    const/4 v13, 0x0

    if-gez v12, :cond_5

    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    move-result v3

    invoke-static {v11}, Ljava/lang/Math;->abs(I)I

    move-result v8

    if-ge v3, v8, :cond_4

    invoke-virtual {v7}, Lx03/c;->a()I

    move-result v3

    goto :goto_0

    :cond_4
    invoke-virtual {v7}, Lx03/c;->a()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    :goto_0
    invoke-virtual {v4}, Ln0/u;->h()Ln0/n;

    move-result-object v7

    iget v7, v7, Ln0/n;->n:I

    add-int/lit8 v7, v7, -0x1

    invoke-static {v3, v13, v7}, Le93/b;->n(III)I

    move-result v3

    goto :goto_3

    :cond_5
    invoke-static {v8, v5, v1}, Ld0/f;->k(Ld0/x;FF)F

    move-result v8

    neg-float v12, v3

    invoke-static {v8, v12, v3}, Le93/b;->m(FFF)F

    move-result v3

    cmpg-float v8, v1, v5

    if-gez v8, :cond_6

    int-to-float v8, v11

    add-float/2addr v3, v8

    cmpl-float v8, v3, v5

    if-lez v8, :cond_7

    :goto_1
    move v3, v5

    goto :goto_2

    :cond_6
    int-to-float v8, v10

    add-float/2addr v3, v8

    cmpg-float v8, v3, v5

    if-gez v8, :cond_7

    goto :goto_1

    :cond_7
    :goto_2
    float-to-double v11, v3

    float-to-double v8, v9

    div-double/2addr v11, v8

    int-to-double v14, v10

    div-double/2addr v14, v8

    sub-double/2addr v11, v14

    invoke-static {v11, v12}, Le93/b;->W(D)I

    move-result v3

    invoke-virtual {v7}, Lx03/c;->a()I

    move-result v7

    add-int/2addr v7, v3

    invoke-virtual {v4}, Ln0/u;->h()Ln0/n;

    move-result-object v3

    iget v3, v3, Ln0/n;->n:I

    add-int/lit8 v3, v3, -0x1

    invoke-static {v7, v13, v3}, Le93/b;->n(III)I

    move-result v3

    :goto_3
    cmpg-float v5, v1, v5

    if-gez v5, :cond_8

    invoke-virtual {v6}, Lx03/c;->a()I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_8
    invoke-virtual {v6}, Lx03/c;->a()I

    move-result v5

    :goto_4
    new-instance v6, Ljava/lang/Integer;

    invoke-direct {v6, v5}, Ljava/lang/Integer;-><init>(I)V

    new-instance v5, Ljava/lang/Integer;

    invoke-direct {v5, v3}, Ljava/lang/Integer;-><init>(I)V

    iget-object v3, v0, Lx03/i;->d:Lbm/l;

    invoke-virtual {v3, v2, v6, v5}, Lbm/l;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    if-ltz v2, :cond_9

    invoke-virtual {v4}, Ln0/u;->h()Ln0/n;

    move-result-object v3

    iget v3, v3, Ln0/n;->n:I

    if-ge v2, v3, :cond_9

    move-object/from16 v3, p3

    check-cast v3, Ls83/c;

    move-object/from16 v4, p1

    invoke-virtual {v0, v4, v2, v1, v3}, Lx03/i;->d(Lh0/k2;IFLs83/c;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_9
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Failed requirement."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Distance returned by maximumFlingDistance should be greater than 0"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_b
    :goto_5
    new-instance v2, Ljava/lang/Float;

    invoke-direct {v2, v1}, Ljava/lang/Float;-><init>(F)V

    return-object v2
.end method

.method public final c(F)F
    .locals 3

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    iget-object v2, p0, Lx03/i;->a:Lx03/b;

    if-gez v1, :cond_0

    invoke-virtual {v2}, Lx03/b;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    cmpl-float v1, p1, v0

    if-lez v1, :cond_1

    invoke-virtual {v2}, Lx03/b;->a()Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    return p1

    :cond_1
    return v0
.end method

.method public final d(Lh0/k2;IFLs83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p4, Lx03/e;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lx03/e;

    iget v1, v0, Lx03/e;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lx03/e;->G:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lx03/e;

    invoke-direct {v0, p0, p4}, Lx03/e;-><init>(Lx03/i;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p4, v6, Lx03/e;->E:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lx03/e;->G:I

    const/4 v8, 0x2

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v8, :cond_1

    iget-object p1, v6, Lx03/e;->w:Lx03/i;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p3, v6, Lx03/e;->z:F

    iget p2, v6, Lx03/e;->y:I

    iget-object p1, v6, Lx03/e;->x:Lh0/k2;

    iget-object v1, v6, Lx03/e;->w:Lx03/i;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, v6

    goto/16 :goto_3

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p4, p0, Lx03/i;->a:Lx03/b;

    invoke-virtual {p4}, Lx03/b;->e()Lx03/c;

    move-result-object v3

    if-nez v3, :cond_4

    new-instance p1, Ljava/lang/Float;

    invoke-direct {p1, p3}, Ljava/lang/Float;-><init>(F)V

    return-object p1

    :cond_4
    invoke-virtual {v3}, Lx03/c;->a()I

    move-result v1

    if-ne v1, p2, :cond_5

    invoke-virtual {v3}, Lx03/c;->a()I

    move-result v1

    invoke-virtual {p4, v1}, Lx03/b;->c(I)I

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {p0, p3}, Lx03/i;->c(F)F

    move-result p1

    new-instance p2, Ljava/lang/Float;

    invoke-direct {p2, p1}, Ljava/lang/Float;-><init>(F)V

    return-object p2

    :cond_5
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const/high16 v4, 0x3f000000    # 0.5f

    cmpg-float v1, v1, v4

    if-gez v1, :cond_7

    :cond_6
    move-object v2, p1

    move v4, p2

    move v5, p3

    move-object v7, v6

    goto :goto_4

    :cond_7
    iget-object v1, p0, Lx03/i;->b:Ld0/x;

    const/4 v4, 0x0

    invoke-static {v1, v4, p3}, Ld0/f;->k(Ld0/x;FF)F

    move-result v1

    cmpg-float v4, p3, v4

    if-gez v4, :cond_8

    invoke-virtual {v3}, Lx03/c;->a()I

    move-result v4

    invoke-virtual {p4, v4}, Lx03/b;->c(I)I

    move-result p4

    int-to-float p4, p4

    cmpg-float p4, v1, p4

    if-gtz p4, :cond_6

    goto :goto_2

    :cond_8
    invoke-virtual {v3}, Lx03/c;->a()I

    move-result v4

    add-int/2addr v4, v2

    invoke-virtual {p4, v4}, Lx03/b;->c(I)I

    move-result p4

    int-to-float p4, p4

    cmpl-float p4, v1, p4

    if-ltz p4, :cond_6

    :goto_2
    iput-object p0, v6, Lx03/e;->w:Lx03/i;

    iput-object p1, v6, Lx03/e;->x:Lh0/k2;

    iput p2, v6, Lx03/e;->y:I

    iput p3, v6, Lx03/e;->z:F

    iput v2, v6, Lx03/e;->G:I

    move-object v7, v6

    const/4 v6, 0x1

    move-object v1, p0

    move-object v2, p1

    move v4, p2

    move v5, p3

    invoke-virtual/range {v1 .. v7}, Lx03/i;->e(Lh0/k2;Lx03/c;IFZLs83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v0, :cond_9

    goto :goto_6

    :cond_9
    move-object v1, p0

    move-object p1, v2

    move p2, v4

    move p3, v5

    :goto_3
    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->floatValue()F

    move-result p4

    move-object v2, p1

    move v4, p2

    move v5, p4

    goto :goto_5

    :goto_4
    move-object v1, p0

    move p3, v5

    :goto_5
    iget-object p1, v1, Lx03/i;->a:Lx03/b;

    invoke-virtual {p1}, Lx03/b;->e()Lx03/c;

    move-result-object v3

    if-nez v3, :cond_a

    new-instance p1, Ljava/lang/Float;

    invoke-direct {p1, p3}, Ljava/lang/Float;-><init>(F)V

    return-object p1

    :cond_a
    invoke-virtual {v3}, Lx03/c;->a()I

    move-result p1

    if-ne p1, v4, :cond_b

    iget-object p1, v1, Lx03/i;->a:Lx03/b;

    invoke-virtual {p1, v4}, Lx03/b;->c(I)I

    move-result p1

    if-eqz p1, :cond_d

    :cond_b
    iput-object v1, v7, Lx03/e;->w:Lx03/i;

    const/4 p1, 0x0

    iput-object p1, v7, Lx03/e;->x:Lh0/k2;

    iput v8, v7, Lx03/e;->G:I

    move-object v6, v7

    invoke-virtual/range {v1 .. v6}, Lx03/i;->f(Lh0/k2;Lx03/c;IFLs83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v0, :cond_c

    :goto_6
    return-object v0

    :cond_c
    move-object p1, v1

    :goto_7
    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->floatValue()F

    move-result v5

    move-object v1, p1

    :cond_d
    invoke-virtual {v1, v5}, Lx03/i;->c(F)F

    move-result p1

    new-instance p2, Ljava/lang/Float;

    invoke-direct {p2, p1}, Ljava/lang/Float;-><init>(F)V

    return-object p2
.end method

.method public final e(Lh0/k2;Lx03/c;IFZLs83/c;)Ljava/lang/Object;
    .locals 14

    move/from16 v6, p3

    move/from16 v0, p4

    move-object/from16 v1, p6

    instance-of v2, v1, Lx03/f;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lx03/f;

    iget v3, v2, Lx03/f;->E:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lx03/f;->E:I

    :goto_0
    move-object v7, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lx03/f;

    invoke-direct {v2, p0, v1}, Lx03/f;-><init>(Lx03/i;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v1, v7, Lx03/f;->y:Ljava/lang/Object;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v2, v7, Lx03/f;->E:I

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v10, :cond_1

    iget-object p1, v7, Lx03/f;->x:Lkotlin/jvm/internal/d0;

    iget-object v2, v7, Lx03/f;->w:Lx03/i;

    :try_start_0
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual/range {p2 .. p2}, Lx03/c;->a()I

    move-result v1

    if-ne v1, v6, :cond_3

    iget-object v1, p0, Lx03/i;->a:Lx03/b;

    invoke-virtual/range {p2 .. p2}, Lx03/c;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Lx03/b;->c(I)I

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p0, v0}, Lx03/i;->c(F)F

    move-result p1

    new-instance v0, Ljava/lang/Float;

    invoke-direct {v0, p1}, Ljava/lang/Float;-><init>(F)V

    return-object v0

    :cond_3
    new-instance v3, Lkotlin/jvm/internal/d0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput v0, v3, Lkotlin/jvm/internal/d0;->w:F

    new-instance v1, Lkotlin/jvm/internal/d0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v11, 0x0

    if-eqz p5, :cond_4

    invoke-virtual/range {p2 .. p2}, Lx03/c;->a()I

    move-result v2

    sub-int v2, v6, v2

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    const/4 v4, 0x2

    if-lt v2, v4, :cond_4

    move v5, v10

    goto :goto_2

    :cond_4
    move v5, v11

    :goto_2
    :try_start_1
    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v6}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {p0, v2}, Lx03/i;->g(Ljava/lang/Integer;)V

    const/4 v2, 0x0

    const/16 v4, 0x1c

    invoke-static {v2, v0, v4}, Ld0/f;->b(FFI)Ld0/m;

    move-result-object v12

    iget-object v13, p0, Lx03/i;->b:Ld0/x;

    new-instance v0, Lx03/g;

    move-object v4, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lx03/g;-><init>(Lkotlin/jvm/internal/d0;Lh0/k2;Lkotlin/jvm/internal/d0;Lx03/i;ZI)V

    iput-object p0, v7, Lx03/f;->w:Lx03/i;

    iput-object v3, v7, Lx03/f;->x:Lkotlin/jvm/internal/d0;

    iput v10, v7, Lx03/f;->E:I

    invoke-static {v12, v13, v11, v0, v7}, Ld0/f;->f(Ld0/m;Ld0/x;ZLkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v8, :cond_5

    return-object v8

    :cond_5
    move-object v2, p0

    move-object p1, v3

    :goto_3
    invoke-virtual {v2, v9}, Lx03/i;->g(Ljava/lang/Integer;)V

    iget p1, p1, Lkotlin/jvm/internal/d0;->w:F

    new-instance v0, Ljava/lang/Float;

    invoke-direct {v0, p1}, Ljava/lang/Float;-><init>(F)V

    return-object v0

    :catchall_1
    move-exception v0

    move-object p1, v0

    move-object v2, p0

    :goto_4
    invoke-virtual {v2, v9}, Lx03/i;->g(Ljava/lang/Integer;)V

    throw p1
.end method

.method public final f(Lh0/k2;Lx03/c;IFLs83/c;)Ljava/lang/Object;
    .locals 12

    move-object/from16 v0, p5

    instance-of v1, v0, Lx03/h;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lx03/h;

    iget v2, v1, Lx03/h;->E:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lx03/h;->E:I

    :goto_0
    move-object v7, v1

    goto :goto_1

    :cond_0
    new-instance v1, Lx03/h;

    invoke-direct {v1, p0, v0}, Lx03/h;-><init>(Lx03/i;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, v7, Lx03/h;->y:Ljava/lang/Object;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v1, v7, Lx03/h;->E:I

    const/4 v10, 0x0

    const/4 v6, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v6, :cond_1

    iget-object p1, v7, Lx03/h;->x:Lkotlin/jvm/internal/d0;

    iget-object p2, v7, Lx03/h;->w:Lx03/i;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v3, Lkotlin/jvm/internal/d0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p2}, Lx03/c;->a()I

    move-result v0

    const/4 v1, 0x0

    if-le p3, v0, :cond_3

    cmpl-float v0, p4, v1

    if-lez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p2}, Lx03/c;->a()I

    move-result p2

    if-gt p3, p2, :cond_4

    cmpg-float p2, p4, v1

    if-gez p2, :cond_4

    :goto_2
    move/from16 v1, p4

    :cond_4
    iput v1, v3, Lkotlin/jvm/internal/d0;->w:F

    new-instance v1, Lkotlin/jvm/internal/d0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    :try_start_1
    new-instance p2, Ljava/lang/Integer;

    invoke-direct {p2, p3}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {p0, p2}, Lx03/i;->g(Ljava/lang/Integer;)V

    iget p2, v1, Lkotlin/jvm/internal/d0;->w:F

    iget v0, v3, Lkotlin/jvm/internal/d0;->w:F

    const/16 v2, 0x1c

    invoke-static {p2, v0, v2}, Ld0/f;->b(FFI)Ld0/m;

    move-result-object p2

    iget-object v0, p0, Lx03/i;->a:Lx03/b;

    invoke-virtual {v0, p3}, Lx03/b;->c(I)I

    move-result v0

    int-to-float v0, v0

    new-instance v8, Ljava/lang/Float;

    invoke-direct {v8, v0}, Ljava/lang/Float;-><init>(F)V

    iget-object v11, p0, Lx03/i;->c:Ld0/l;

    new-instance v0, Lg2/z;

    move-object v4, p0

    move-object v2, p1

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lg2/z;-><init>(Lkotlin/jvm/internal/d0;Lh0/k2;Lkotlin/jvm/internal/d0;Lx03/i;I)V

    move-object p1, v3

    iput-object p0, v7, Lx03/h;->w:Lx03/i;

    iput-object p1, v7, Lx03/h;->x:Lkotlin/jvm/internal/d0;

    iput v6, v7, Lx03/h;->E:I

    const/4 v5, 0x0

    move-object v3, v8

    const/4 v8, 0x4

    move-object v2, p2

    move-object v6, v0

    move-object v4, v11

    invoke-static/range {v2 .. v8}, Ld0/f;->i(Ld0/m;Ljava/lang/Float;Ld0/l;ZLkotlin/jvm/functions/Function1;Ls83/c;I)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p2, v9, :cond_5

    return-object v9

    :cond_5
    move-object p2, p0

    :goto_3
    invoke-virtual {p2, v10}, Lx03/i;->g(Ljava/lang/Integer;)V

    iget p1, p1, Lkotlin/jvm/internal/d0;->w:F

    new-instance p2, Ljava/lang/Float;

    invoke-direct {p2, p1}, Ljava/lang/Float;-><init>(F)V

    return-object p2

    :catchall_1
    move-exception v0

    move-object p1, v0

    move-object p2, p0

    :goto_4
    invoke-virtual {p2, v10}, Lx03/i;->g(Ljava/lang/Integer;)V

    throw p1
.end method

.method public final g(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Lx03/i;->f:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method
