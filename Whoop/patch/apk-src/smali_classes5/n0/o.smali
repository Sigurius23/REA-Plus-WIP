.class public final Ln0/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/g;
.implements Lp0/e0;


# instance fields
.field public final a:I

.field public final b:Ljava/util/List;

.field public final c:Z

.field public final d:Lb2/f;

.field public final e:Lb2/g;

.field public final f:Ly3/m;

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:J

.field public final k:Ljava/lang/Object;

.field public final l:Ljava/lang/Object;

.field public final m:Landroidx/compose/foundation/lazy/layout/b;

.field public final n:J

.field public o:I

.field public final p:I

.field public final q:I

.field public final r:I

.field public s:Z

.field public t:I

.field public u:I

.field public v:I

.field public final w:[I


# direct methods
.method public constructor <init>(ILjava/util/List;ZLb2/f;Lb2/g;Ly3/m;IIIJLjava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/layout/b;J)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ln0/o;->a:I

    iput-object p2, p0, Ln0/o;->b:Ljava/util/List;

    iput-boolean p3, p0, Ln0/o;->c:Z

    iput-object p4, p0, Ln0/o;->d:Lb2/f;

    iput-object p5, p0, Ln0/o;->e:Lb2/g;

    iput-object p6, p0, Ln0/o;->f:Ly3/m;

    iput p7, p0, Ln0/o;->g:I

    iput p8, p0, Ln0/o;->h:I

    iput p9, p0, Ln0/o;->i:I

    iput-wide p10, p0, Ln0/o;->j:J

    iput-object p12, p0, Ln0/o;->k:Ljava/lang/Object;

    move-object/from16 p1, p13

    iput-object p1, p0, Ln0/o;->l:Ljava/lang/Object;

    move-object/from16 p1, p14

    iput-object p1, p0, Ln0/o;->m:Landroidx/compose/foundation/lazy/layout/b;

    move-wide/from16 p3, p15

    iput-wide p3, p0, Ln0/o;->n:J

    const/high16 p1, -0x80000000

    iput p1, p0, Ln0/o;->t:I

    move-object p1, p2

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p1

    const/4 p3, 0x0

    move p4, p3

    move p5, p4

    move p6, p5

    :goto_0
    if-ge p4, p1, :cond_2

    invoke-interface {p2, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/j1;

    iget-boolean v1, p0, Ln0/o;->c:Z

    if-eqz v1, :cond_0

    iget v2, v0, Ly2/j1;->x:I

    goto :goto_1

    :cond_0
    iget v2, v0, Ly2/j1;->w:I

    :goto_1
    add-int/2addr p5, v2

    if-nez v1, :cond_1

    iget v0, v0, Ly2/j1;->x:I

    goto :goto_2

    :cond_1
    iget v0, v0, Ly2/j1;->w:I

    :goto_2
    invoke-static {p6, v0}, Ljava/lang/Math;->max(II)I

    move-result p6

    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_2
    iput p5, p0, Ln0/o;->p:I

    iget p1, p0, Ln0/o;->i:I

    add-int/2addr p5, p1

    if-gez p5, :cond_3

    goto :goto_3

    :cond_3
    move p3, p5

    :goto_3
    iput p3, p0, Ln0/o;->q:I

    iput p6, p0, Ln0/o;->r:I

    iget-object p1, p0, Ln0/o;->b:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    new-array p1, p1, [I

    iput-object p1, p0, Ln0/o;->w:[I

    return-void
.end method


# virtual methods
.method public final a(IIII)V
    .locals 0

    invoke-virtual {p0, p1, p3, p4}, Ln0/o;->q(III)V

    return-void
.end method

.method public final b()I
    .locals 1

    iget-object v0, p0, Ln0/o;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Ln0/o;->s:Z

    return v0
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, Ln0/o;->n:J

    return-wide v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Ln0/o;->c:Z

    return v0
.end method

.method public final f()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Ln0/o;->q:I

    return v0
.end method

.method public final getIndex()I
    .locals 1

    iget v0, p0, Ln0/o;->a:I

    return v0
.end method

.method public final getKey()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ln0/o;->k:Ljava/lang/Object;

    return-object v0
.end method

.method public final h(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ln0/o;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly2/j1;

    invoke-virtual {p1}, Ly2/j1;->p()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final i()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ln0/o;->s:Z

    return-void
.end method

.method public final j(I)J
    .locals 6

    const-wide v0, 0xffffffffL

    const/16 v2, 0x20

    if-nez p1, :cond_1

    iget-object v3, p0, Ln0/o;->b:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_1

    iget-boolean p1, p0, Ln0/o;->c:Z

    const/4 v3, 0x0

    if-eqz p1, :cond_0

    iget p1, p0, Ln0/o;->o:I

    int-to-long v3, v3

    shl-long v2, v3, v2

    int-to-long v4, p1

    and-long/2addr v0, v4

    or-long/2addr v0, v2

    return-wide v0

    :cond_0
    iget p1, p0, Ln0/o;->o:I

    int-to-long v4, p1

    shl-long/2addr v4, v2

    int-to-long v2, v3

    and-long/2addr v0, v2

    or-long/2addr v0, v4

    return-wide v0

    :cond_1
    mul-int/lit8 p1, p1, 0x2

    iget-object v3, p0, Ln0/o;->w:[I

    aget v4, v3, p1

    add-int/lit8 p1, p1, 0x1

    aget p1, v3, p1

    int-to-long v3, v4

    shl-long v2, v3, v2

    int-to-long v4, p1

    and-long/2addr v0, v4

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public final k()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final l(IZ)V
    .locals 11

    iget-boolean v0, p0, Ln0/o;->s:Z

    if-eqz v0, :cond_0

    goto :goto_4

    :cond_0
    iget v0, p0, Ln0/o;->o:I

    add-int/2addr v0, p1

    iput v0, p0, Ln0/o;->o:I

    iget-object v0, p0, Ln0/o;->w:[I

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    iget-boolean v4, p0, Ln0/o;->c:Z

    if-ge v3, v1, :cond_4

    and-int/lit8 v5, v3, 0x1

    if-eqz v4, :cond_1

    if-nez v5, :cond_2

    :cond_1
    if-nez v4, :cond_3

    if-nez v5, :cond_3

    :cond_2
    aget v4, v0, v3

    add-int/2addr v4, p1

    aput v4, v0, v3

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    if-eqz p2, :cond_7

    iget-object p2, p0, Ln0/o;->b:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    :goto_1
    if-ge v2, p2, :cond_7

    iget-object v0, p0, Ln0/o;->m:Landroidx/compose/foundation/lazy/layout/b;

    iget-object v1, p0, Ln0/o;->k:Ljava/lang/Object;

    invoke-virtual {v0, v2, v1}, Landroidx/compose/foundation/lazy/layout/b;->a(ILjava/lang/Object;)Lp0/t;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-wide v5, v0, Lp0/t;->l:J

    const-wide v7, 0xffffffffL

    const/16 v1, 0x20

    if-eqz v4, :cond_5

    shr-long v9, v5, v1

    long-to-int v3, v9

    and-long/2addr v5, v7

    long-to-int v5, v5

    add-int/2addr v5, p1

    :goto_2
    int-to-long v9, v3

    shl-long/2addr v9, v1

    int-to-long v5, v5

    and-long/2addr v5, v7

    or-long/2addr v5, v9

    goto :goto_3

    :cond_5
    shr-long v9, v5, v1

    long-to-int v3, v9

    add-int/2addr v3, p1

    and-long/2addr v5, v7

    long-to-int v5, v5

    goto :goto_2

    :goto_3
    iput-wide v5, v0, Lp0/t;->l:J

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_7
    :goto_4
    return-void
.end method

.method public final m(J)I
    .locals 2

    iget-boolean v0, p0, Ln0/o;->c:Z

    if-eqz v0, :cond_0

    const-wide v0, 0xffffffffL

    and-long/2addr p1, v0

    :goto_0
    long-to-int p1, p1

    return p1

    :cond_0
    const/16 v0, 0x20

    shr-long/2addr p1, v0

    goto :goto_0
.end method

.method public final n()I
    .locals 1

    iget v0, p0, Ln0/o;->o:I

    return v0
.end method

.method public final o()I
    .locals 1

    iget v0, p0, Ln0/o;->p:I

    return v0
.end method

.method public final p(Ly2/i1;Z)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Ln0/o;->t:I

    const/high16 v3, -0x80000000

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "position() should be called first"

    invoke-static {v2}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_0
    iget-object v2, v0, Ln0/o;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_e

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly2/j1;

    iget v6, v0, Ln0/o;->u:I

    iget-boolean v7, v0, Ln0/o;->c:Z

    if-eqz v7, :cond_1

    iget v8, v5, Ly2/j1;->x:I

    goto :goto_2

    :cond_1
    iget v8, v5, Ly2/j1;->w:I

    :goto_2
    sub-int/2addr v6, v8

    iget v8, v0, Ln0/o;->v:I

    invoke-virtual {v0, v4}, Ln0/o;->j(I)J

    move-result-wide v9

    iget-object v11, v0, Ln0/o;->m:Landroidx/compose/foundation/lazy/layout/b;

    iget-object v12, v0, Ln0/o;->k:Ljava/lang/Object;

    invoke-virtual {v11, v4, v12}, Landroidx/compose/foundation/lazy/layout/b;->a(ILjava/lang/Object;)Lp0/t;

    move-result-object v11

    const/4 v12, 0x0

    if-eqz v11, :cond_7

    if-eqz p2, :cond_2

    iput-wide v9, v11, Lp0/t;->r:J

    move-object v15, v2

    move/from16 v16, v3

    goto :goto_3

    :cond_2
    iget-wide v13, v11, Lp0/t;->r:J

    move-object v15, v2

    move/from16 v16, v3

    sget-wide v2, Lp0/t;->s:J

    invoke-static {v13, v14, v2, v3}, Ly3/j;->b(JJ)Z

    move-result v2

    if-nez v2, :cond_3

    iget-wide v9, v11, Lp0/t;->r:J

    :cond_3
    iget-object v2, v11, Lp0/t;->q:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/j;

    iget-wide v2, v2, Ly3/j;->a:J

    invoke-static {v9, v10, v2, v3}, Ly3/j;->d(JJ)J

    move-result-wide v2

    invoke-virtual {v0, v9, v10}, Ln0/o;->m(J)I

    move-result v13

    if-gt v13, v6, :cond_4

    invoke-virtual {v0, v2, v3}, Ln0/o;->m(J)I

    move-result v13

    if-le v13, v6, :cond_5

    :cond_4
    invoke-virtual {v0, v9, v10}, Ln0/o;->m(J)I

    move-result v6

    if-lt v6, v8, :cond_6

    invoke-virtual {v0, v2, v3}, Ln0/o;->m(J)I

    move-result v6

    if-lt v6, v8, :cond_6

    :cond_5
    invoke-virtual {v11}, Lp0/t;->h()Z

    move-result v6

    if-eqz v6, :cond_6

    iget-object v6, v11, Lp0/t;->a:Lbc3/c0;

    new-instance v8, Lp0/r;

    const/4 v9, 0x1

    invoke-direct {v8, v11, v12, v9}, Lp0/r;-><init>(Lp0/t;Lq83/d;I)V

    const/4 v9, 0x3

    invoke-static {v6, v12, v12, v8, v9}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_6
    move-wide v9, v2

    :goto_3
    iget-object v12, v11, Lp0/t;->n:Ll2/c;

    goto :goto_4

    :cond_7
    move-object v15, v2

    move/from16 v16, v3

    :goto_4
    iget-wide v2, v0, Ln0/o;->j:J

    invoke-static {v9, v10, v2, v3}, Ly3/j;->d(JJ)J

    move-result-wide v2

    if-nez p2, :cond_8

    if-eqz v11, :cond_8

    iput-wide v2, v11, Lp0/t;->m:J

    :cond_8
    if-eqz v7, :cond_a

    if-eqz v12, :cond_9

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v1}, Ly2/i1;->a(Ly2/j1;Ly2/i1;)V

    iget-wide v6, v5, Ly2/j1;->E:J

    invoke-static {v2, v3, v6, v7}, Ly3/j;->d(JJ)J

    move-result-wide v2

    const/4 v6, 0x0

    invoke-virtual {v5, v2, v3, v6, v12}, Ly2/j1;->p0(JFLl2/c;)V

    goto :goto_6

    :cond_9
    invoke-static {v1, v5, v2, v3}, Ly2/i1;->t(Ly2/i1;Ly2/j1;J)V

    goto :goto_6

    :cond_a
    if-eqz v12, :cond_d

    invoke-virtual {v1}, Ly2/i1;->c()Ly3/m;

    move-result-object v6

    sget-object v7, Ly3/m;->w:Ly3/m;

    const/4 v8, 0x0

    if-eq v6, v7, :cond_c

    invoke-virtual {v1}, Ly2/i1;->e()I

    move-result v6

    if-nez v6, :cond_b

    goto :goto_5

    :cond_b
    invoke-virtual {v1}, Ly2/i1;->e()I

    move-result v6

    iget v7, v5, Ly2/j1;->w:I

    sub-int/2addr v6, v7

    const/16 v7, 0x20

    shr-long v9, v2, v7

    long-to-int v9, v9

    sub-int/2addr v6, v9

    const-wide v9, 0xffffffffL

    and-long/2addr v2, v9

    long-to-int v2, v2

    int-to-long v13, v6

    shl-long v6, v13, v7

    int-to-long v2, v2

    and-long/2addr v2, v9

    or-long/2addr v2, v6

    invoke-static {v5, v1}, Ly2/i1;->a(Ly2/j1;Ly2/i1;)V

    iget-wide v6, v5, Ly2/j1;->E:J

    invoke-static {v2, v3, v6, v7}, Ly3/j;->d(JJ)J

    move-result-wide v2

    invoke-virtual {v5, v2, v3, v8, v12}, Ly2/j1;->p0(JFLl2/c;)V

    goto :goto_6

    :cond_c
    :goto_5
    invoke-static {v5, v1}, Ly2/i1;->a(Ly2/j1;Ly2/i1;)V

    iget-wide v6, v5, Ly2/j1;->E:J

    invoke-static {v2, v3, v6, v7}, Ly3/j;->d(JJ)J

    move-result-wide v2

    invoke-virtual {v5, v2, v3, v8, v12}, Ly2/j1;->p0(JFLl2/c;)V

    goto :goto_6

    :cond_d
    invoke-static {v1, v5, v2, v3}, Ly2/i1;->p(Ly2/i1;Ly2/j1;J)V

    :goto_6
    add-int/lit8 v4, v4, 0x1

    move-object v2, v15

    move/from16 v3, v16

    goto/16 :goto_1

    :cond_e
    return-void
.end method

.method public final q(III)V
    .locals 10

    iput p1, p0, Ln0/o;->o:I

    iget-boolean v0, p0, Ln0/o;->c:Z

    if-eqz v0, :cond_0

    move v1, p3

    goto :goto_0

    :cond_0
    move v1, p2

    :goto_0
    iput v1, p0, Ln0/o;->t:I

    iget-object v1, p0, Ln0/o;->b:Ljava/util/List;

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_4

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly2/j1;

    mul-int/lit8 v5, v3, 0x2

    iget-object v6, p0, Ln0/o;->w:[I

    if-eqz v0, :cond_2

    iget-object v7, p0, Ln0/o;->d:Lb2/f;

    if-eqz v7, :cond_1

    iget v8, v4, Ly2/j1;->w:I

    iget-object v9, p0, Ln0/o;->f:Ly3/m;

    invoke-interface {v7, v8, p2, v9}, Lb2/f;->a(IILy3/m;)I

    move-result v7

    aput v7, v6, v5

    add-int/lit8 v5, v5, 0x1

    aput p1, v6, v5

    iget v4, v4, Ly2/j1;->x:I

    :goto_2
    add-int/2addr p1, v4

    goto :goto_3

    :cond_1
    const-string p1, "null horizontalAlignment when isVertical == true"

    invoke-static {p1}, Lk0/a;->b(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :cond_2
    aput p1, v6, v5

    add-int/lit8 v5, v5, 0x1

    iget-object v7, p0, Ln0/o;->e:Lb2/g;

    if-eqz v7, :cond_3

    iget v8, v4, Ly2/j1;->x:I

    check-cast v7, Lb2/l;

    invoke-virtual {v7, v8, p3}, Lb2/l;->a(II)I

    move-result v7

    aput v7, v6, v5

    iget v4, v4, Ly2/j1;->w:I

    goto :goto_2

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    const-string p1, "null verticalAlignment when isVertical == false"

    invoke-static {p1}, Lk0/a;->b(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :cond_4
    iget p1, p0, Ln0/o;->g:I

    neg-int p1, p1

    iput p1, p0, Ln0/o;->u:I

    iget p1, p0, Ln0/o;->t:I

    iget p2, p0, Ln0/o;->h:I

    add-int/2addr p1, p2

    iput p1, p0, Ln0/o;->v:I

    return-void
.end method
