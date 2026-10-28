.class public final Ll0/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/r0;
.implements Ll0/n1;


# instance fields
.field public final a:Ll0/l;

.field public final b:Lb2/f;


# direct methods
.method public constructor <init>(Ll0/l;Lb2/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll0/x;->a:Ll0/l;

    iput-object p2, p0, Ll0/x;->b:Lb2/f;

    return-void
.end method


# virtual methods
.method public final a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
    .locals 13

    invoke-static/range {p3 .. p4}, Ly3/a;->j(J)I

    move-result v1

    invoke-static/range {p3 .. p4}, Ly3/a;->k(J)I

    move-result v2

    invoke-static/range {p3 .. p4}, Ly3/a;->h(J)I

    move-result v3

    invoke-static/range {p3 .. p4}, Ly3/a;->i(J)I

    move-result v4

    iget-object v0, p0, Ll0/x;->a:Ll0/l;

    invoke-interface {v0}, Ll0/l;->a()F

    move-result v0

    invoke-interface {p1, v0}, Ly3/c;->F(F)I

    move-result v5

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    new-array v8, v0, [Ly2/j1;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v10

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v11, 0x0

    move-object v0, p0

    move-object v6, p1

    move-object v7, p2

    invoke-static/range {v0 .. v12}, Ll0/f;->j(Ll0/n1;IIIIILy2/t0;Ljava/util/List;[Ly2/j1;II[II)Ly2/s0;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ly2/r;Ljava/util/List;I)I
    .locals 9

    iget-object v0, p0, Ll0/x;->a:Ll0/l;

    invoke-interface {v0}, Ll0/l;->a()F

    move-result v0

    invoke-interface {p1, v0}, Ly3/c;->F(F)I

    move-result p1

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v2, 0x0

    move v3, v1

    move v4, v3

    move v5, v2

    :goto_0
    if-ge v1, v0, :cond_3

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly2/q0;

    invoke-static {v6}, Ll0/f;->g(Ly2/q0;)Ll0/o1;

    move-result-object v7

    invoke-static {v7}, Ll0/f;->h(Ll0/o1;)F

    move-result v7

    invoke-interface {v6, p3}, Ly2/q0;->C(I)I

    move-result v6

    cmpg-float v8, v7, v2

    if-nez v8, :cond_1

    add-int/2addr v4, v6

    goto :goto_1

    :cond_1
    cmpl-float v8, v7, v2

    if-lez v8, :cond_2

    add-float/2addr v5, v7

    int-to-float v6, v6

    div-float/2addr v6, v7

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    move-result v3

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    int-to-float p3, v3

    mul-float/2addr p3, v5

    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p3

    add-int/2addr p3, v4

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    mul-int/2addr p2, p1

    add-int/2addr p2, p3

    return p2
.end method

.method public final c(Ly2/r;Ljava/util/List;I)I
    .locals 11

    iget-object v0, p0, Ll0/x;->a:Ll0/l;

    invoke-interface {v0}, Ll0/l;->a()F

    move-result v0

    invoke-interface {p1, v0}, Ly3/c;->F(F)I

    move-result p1

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    mul-int/2addr v0, p1

    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result p1

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v1

    move v6, v4

    move v5, v3

    :goto_0
    const v7, 0x7fffffff

    if-ge v4, v2, :cond_4

    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly2/q0;

    invoke-static {v8}, Ll0/f;->g(Ly2/q0;)Ll0/o1;

    move-result-object v9

    invoke-static {v9}, Ll0/f;->h(Ll0/o1;)F

    move-result v9

    cmpg-float v10, v9, v3

    if-nez v10, :cond_2

    if-ne p3, v7, :cond_1

    move v9, v7

    goto :goto_1

    :cond_1
    sub-int v9, p3, p1

    :goto_1
    invoke-interface {v8, v7}, Ly2/q0;->b(I)I

    move-result v7

    invoke-static {v7, v9}, Ljava/lang/Math;->min(II)I

    move-result v7

    add-int/2addr p1, v7

    invoke-interface {v8, v7}, Ly2/q0;->Q(I)I

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    move-result v6

    goto :goto_2

    :cond_2
    cmpl-float v7, v9, v3

    if-lez v7, :cond_3

    add-float/2addr v5, v9

    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    cmpg-float v2, v5, v3

    if-nez v2, :cond_5

    move p1, v1

    goto :goto_3

    :cond_5
    if-ne p3, v7, :cond_6

    move p1, v7

    goto :goto_3

    :cond_6
    sub-int/2addr p3, p1

    invoke-static {p3, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p1, v5

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    :goto_3
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result p3

    :goto_4
    if-ge v1, p3, :cond_9

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/q0;

    invoke-static {v0}, Ll0/f;->g(Ly2/q0;)Ll0/o1;

    move-result-object v2

    invoke-static {v2}, Ll0/f;->h(Ll0/o1;)F

    move-result v2

    cmpl-float v4, v2, v3

    if-lez v4, :cond_8

    if-eq p1, v7, :cond_7

    int-to-float v4, p1

    mul-float/2addr v4, v2

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v2

    goto :goto_5

    :cond_7
    move v2, v7

    :goto_5
    invoke-interface {v0, v2}, Ly2/q0;->Q(I)I

    move-result v0

    invoke-static {v6, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    move v6, v0

    :cond_8
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_9
    return v6
.end method

.method public final d(Ly2/r;Ljava/util/List;I)I
    .locals 9

    iget-object v0, p0, Ll0/x;->a:Ll0/l;

    invoke-interface {v0}, Ll0/l;->a()F

    move-result v0

    invoke-interface {p1, v0}, Ly3/c;->F(F)I

    move-result p1

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v2, 0x0

    move v3, v1

    move v4, v3

    move v5, v2

    :goto_0
    if-ge v1, v0, :cond_3

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly2/q0;

    invoke-static {v6}, Ll0/f;->g(Ly2/q0;)Ll0/o1;

    move-result-object v7

    invoke-static {v7}, Ll0/f;->h(Ll0/o1;)F

    move-result v7

    invoke-interface {v6, p3}, Ly2/q0;->b(I)I

    move-result v6

    cmpg-float v8, v7, v2

    if-nez v8, :cond_1

    add-int/2addr v4, v6

    goto :goto_1

    :cond_1
    cmpl-float v8, v7, v2

    if-lez v8, :cond_2

    add-float/2addr v5, v7

    int-to-float v6, v6

    div-float/2addr v6, v7

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    move-result v3

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    int-to-float p3, v3

    mul-float/2addr p3, v5

    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p3

    add-int/2addr p3, v4

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    mul-int/2addr p2, p1

    add-int/2addr p2, p3

    return p2
.end method

.method public final e(Ly2/r;Ljava/util/List;I)I
    .locals 11

    iget-object v0, p0, Ll0/x;->a:Ll0/l;

    invoke-interface {v0}, Ll0/l;->a()F

    move-result v0

    invoke-interface {p1, v0}, Ly3/c;->F(F)I

    move-result p1

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    mul-int/2addr v0, p1

    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result p1

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v1

    move v6, v4

    move v5, v3

    :goto_0
    const v7, 0x7fffffff

    if-ge v4, v2, :cond_4

    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly2/q0;

    invoke-static {v8}, Ll0/f;->g(Ly2/q0;)Ll0/o1;

    move-result-object v9

    invoke-static {v9}, Ll0/f;->h(Ll0/o1;)F

    move-result v9

    cmpg-float v10, v9, v3

    if-nez v10, :cond_2

    if-ne p3, v7, :cond_1

    move v9, v7

    goto :goto_1

    :cond_1
    sub-int v9, p3, p1

    :goto_1
    invoke-interface {v8, v7}, Ly2/q0;->b(I)I

    move-result v7

    invoke-static {v7, v9}, Ljava/lang/Math;->min(II)I

    move-result v7

    add-int/2addr p1, v7

    invoke-interface {v8, v7}, Ly2/q0;->O(I)I

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    move-result v6

    goto :goto_2

    :cond_2
    cmpl-float v7, v9, v3

    if-lez v7, :cond_3

    add-float/2addr v5, v9

    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    cmpg-float v2, v5, v3

    if-nez v2, :cond_5

    move p1, v1

    goto :goto_3

    :cond_5
    if-ne p3, v7, :cond_6

    move p1, v7

    goto :goto_3

    :cond_6
    sub-int/2addr p3, p1

    invoke-static {p3, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p1, v5

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    :goto_3
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result p3

    :goto_4
    if-ge v1, p3, :cond_9

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/q0;

    invoke-static {v0}, Ll0/f;->g(Ly2/q0;)Ll0/o1;

    move-result-object v2

    invoke-static {v2}, Ll0/f;->h(Ll0/o1;)F

    move-result v2

    cmpl-float v4, v2, v3

    if-lez v4, :cond_8

    if-eq p1, v7, :cond_7

    int-to-float v4, p1

    mul-float/2addr v4, v2

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v2

    goto :goto_5

    :cond_7
    move v2, v7

    :goto_5
    invoke-interface {v0, v2}, Ly2/q0;->O(I)I

    move-result v0

    invoke-static {v6, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    move v6, v0

    :cond_8
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_9
    return v6
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ll0/x;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ll0/x;

    iget-object v1, p0, Ll0/x;->a:Ll0/l;

    iget-object v3, p1, Ll0/x;->a:Ll0/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ll0/x;->b:Lb2/f;

    iget-object p1, p1, Ll0/x;->b:Lb2/f;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final f(Ly2/j1;)I
    .locals 0

    iget p1, p1, Ly2/j1;->w:I

    return p1
.end method

.method public final g(IIIZ)J
    .locals 1

    const/4 v0, 0x0

    if-nez p4, :cond_0

    invoke-static {v0, p3, p1, p2}, Ly3/b;->a(IIII)J

    move-result-wide p1

    return-wide p1

    :cond_0
    invoke-static {v0, p3, p1, p2}, Lva3/l;->m(IIII)J

    move-result-wide p1

    return-wide p1
.end method

.method public final h(Ly2/j1;)I
    .locals 0

    iget p1, p1, Ly2/j1;->x:I

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Ll0/x;->a:Ll0/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll0/x;->b:Lb2/f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final i([Ly2/j1;Ly2/t0;I[III[IIII)Ly2/s0;
    .locals 7

    new-instance v0, Ll0/r;

    move-object v2, p0

    move-object v1, p1

    move-object v5, p2

    move v4, p3

    move-object v6, p4

    move v3, p6

    invoke-direct/range {v0 .. v6}, Ll0/r;-><init>([Ly2/j1;Ll0/x;IILy2/t0;[I)V

    sget-object p1, Lm83/z;->w:Lm83/z;

    invoke-interface {p2, p6, p5, p1, v0}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method

.method public final j(I[I[ILy2/t0;)V
    .locals 1

    iget-object v0, p0, Ll0/x;->a:Ll0/l;

    invoke-interface {v0, p4, p1, p2, p3}, Ll0/l;->b(Ly3/c;I[I[I)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ColumnMeasurePolicy(verticalArrangement="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll0/x;->a:Ll0/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", horizontalAlignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll0/x;->b:Lb2/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
