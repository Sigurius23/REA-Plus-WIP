.class public final Lf1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf1/q0;


# instance fields
.field public final a:La0/i0;

.field public final b:Ljava/util/List;

.field public final c:I

.field public final d:I

.field public final e:Z

.field public final f:Lf1/u;


# direct methods
.method public constructor <init>(La0/i0;Ljava/util/List;IIZLf1/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/k;->a:La0/i0;

    iput-object p2, p0, Lf1/k;->b:Ljava/util/List;

    iput p3, p0, Lf1/k;->c:I

    iput p4, p0, Lf1/k;->d:I

    iput-boolean p5, p0, Lf1/k;->e:Z

    iput-object p6, p0, Lf1/k;->f:Lf1/u;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    const/4 p3, 0x1

    if-le p1, p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    if-nez p3, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "MultiSelectionLayout requires an infoList size greater than 1, was "

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p2, 0x2e

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lk0/a;->c(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public static m(La0/k0;Lf1/u;Lf1/r;II)V
    .locals 4

    iget-boolean p1, p1, Lf1/u;->c:Z

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    new-instance p1, Lf1/u;

    invoke-virtual {p2, p4}, Lf1/r;->a(I)Lf1/t;

    move-result-object v2

    invoke-virtual {p2, p3}, Lf1/r;->a(I)Lf1/t;

    move-result-object v3

    if-le p4, p3, :cond_0

    move v0, v1

    :cond_0
    invoke-direct {p1, v2, v3, v0}, Lf1/u;-><init>(Lf1/t;Lf1/t;Z)V

    goto :goto_0

    :cond_1
    new-instance p1, Lf1/u;

    invoke-virtual {p2, p3}, Lf1/r;->a(I)Lf1/t;

    move-result-object v2

    invoke-virtual {p2, p4}, Lf1/r;->a(I)Lf1/t;

    move-result-object v3

    if-le p3, p4, :cond_2

    move v0, v1

    :cond_2
    invoke-direct {p1, v2, v3, v0}, Lf1/u;-><init>(Lf1/t;Lf1/t;Z)V

    :goto_0
    if-gt p3, p4, :cond_3

    goto :goto_1

    :cond_3
    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "minOffset should be less than or equal to maxOffset: "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lk0/a;->c(Ljava/lang/String;)V

    :goto_1
    iget-wide p2, p2, Lf1/r;->a:J

    invoke-virtual {p0, p2, p3}, La0/k0;->c(J)I

    move-result p4

    iget-object v0, p0, La0/k0;->c:[Ljava/lang/Object;

    aget-object v1, v0, p4

    iget-object p0, p0, La0/k0;->b:[J

    aput-wide p2, p0, p4

    aput-object p1, v0, p4

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lf1/k;->e:Z

    return v0
.end method

.method public final b()Lf1/r;
    .locals 1

    iget-boolean v0, p0, Lf1/k;->e:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lf1/k;->k()Lf1/r;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lf1/k;->j()Lf1/r;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lf1/r;
    .locals 2

    invoke-virtual {p0}, Lf1/k;->e()Lf1/g;

    move-result-object v0

    sget-object v1, Lf1/g;->w:Lf1/g;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lf1/k;->j()Lf1/r;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lf1/k;->k()Lf1/r;

    move-result-object v0

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lf1/k;->d:I

    return v0
.end method

.method public final e()Lf1/g;
    .locals 2

    iget v0, p0, Lf1/k;->c:I

    iget v1, p0, Lf1/k;->d:I

    if-ge v0, v1, :cond_0

    sget-object v0, Lf1/g;->x:Lf1/g;

    return-object v0

    :cond_0
    if-le v0, v1, :cond_1

    sget-object v0, Lf1/g;->w:Lf1/g;

    return-object v0

    :cond_1
    div-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lf1/k;->b:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf1/r;

    invoke-virtual {v0}, Lf1/r;->b()Lf1/g;

    move-result-object v0

    return-object v0
.end method

.method public final f(Lf1/q0;)Z
    .locals 11

    iget-object v0, p0, Lf1/k;->f:Lf1/u;

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    if-eqz p1, :cond_4

    instance-of v0, p1, Lf1/k;

    if-eqz v0, :cond_4

    check-cast p1, Lf1/k;

    iget-object v0, p1, Lf1/k;->b:Ljava/util/List;

    iget-boolean v2, p1, Lf1/k;->e:Z

    iget-boolean v3, p0, Lf1/k;->e:Z

    if-ne v3, v2, :cond_4

    iget v2, p0, Lf1/k;->c:I

    iget v3, p1, Lf1/k;->c:I

    if-ne v2, v3, :cond_4

    iget v2, p0, Lf1/k;->d:I

    iget p1, p1, Lf1/k;->d:I

    if-ne v2, p1, :cond_4

    iget-object p1, p0, Lf1/k;->b:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-eq v2, v3, :cond_0

    goto :goto_2

    :cond_0
    move-object v2, p1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_3

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf1/r;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lf1/r;

    iget-wide v7, v5, Lf1/r;->a:J

    iget-wide v9, v6, Lf1/r;->a:J

    cmp-long v7, v7, v9

    if-nez v7, :cond_2

    iget v7, v5, Lf1/r;->c:I

    iget v8, v6, Lf1/r;->c:I

    if-ne v7, v8, :cond_2

    iget v5, v5, Lf1/r;->d:I

    iget v6, v6, Lf1/r;->d:I

    if-eq v5, v6, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v1

    :cond_3
    return v3

    :cond_4
    :goto_2
    return v1
.end method

.method public final g(Lkotlin/jvm/functions/Function1;)V
    .locals 3

    invoke-virtual {p0}, Lf1/k;->c()Lf1/r;

    move-result-object v0

    iget-wide v0, v0, Lf1/r;->a:J

    invoke-virtual {p0, v0, v1}, Lf1/k;->n(J)I

    move-result v0

    invoke-virtual {p0}, Lf1/k;->e()Lf1/g;

    move-result-object v1

    sget-object v2, Lf1/g;->w:Lf1/g;

    if-ne v1, v2, :cond_0

    invoke-virtual {p0}, Lf1/k;->k()Lf1/r;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lf1/k;->j()Lf1/r;

    move-result-object v1

    :goto_0
    iget-wide v1, v1, Lf1/r;->a:J

    invoke-virtual {p0, v1, v2}, Lf1/k;->n(J)I

    move-result v1

    add-int/lit8 v0, v0, 0x1

    if-lt v0, v1, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    if-ge v0, v1, :cond_2

    iget-object v2, p0, Lf1/k;->b:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    return-void
.end method

.method public final getSize()I
    .locals 1

    iget-object v0, p0, Lf1/k;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final h(Lf1/u;)La0/k0;
    .locals 9

    iget-object v0, p1, Lf1/u;->a:Lf1/t;

    iget-boolean v1, p1, Lf1/u;->c:Z

    iget-wide v2, v0, Lf1/t;->c:J

    iget v4, v0, Lf1/t;->b:I

    iget-object v5, p1, Lf1/u;->b:Lf1/t;

    iget-wide v6, v5, Lf1/t;->c:J

    iget v8, v5, Lf1/t;->b:I

    cmp-long v2, v2, v6

    if-nez v2, :cond_3

    if-eqz v1, :cond_0

    if-ge v4, v8, :cond_2

    :cond_0
    if-nez v1, :cond_1

    if-gt v4, v8, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unexpectedly miss-crossed selection: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lk0/a;->c(Ljava/lang/String;)V

    :cond_2
    :goto_0
    iget-wide v0, v0, Lf1/t;->c:J

    sget-object v2, La0/w;->a:La0/k0;

    new-instance v2, La0/k0;

    invoke-direct {v2}, La0/k0;-><init>()V

    invoke-virtual {v2, v0, v1, p1}, La0/k0;->h(JLjava/lang/Object;)V

    return-object v2

    :cond_3
    sget-object v2, La0/w;->a:La0/k0;

    new-instance v2, La0/k0;

    invoke-direct {v2}, La0/k0;-><init>()V

    if-eqz v1, :cond_4

    move-object v3, v5

    goto :goto_1

    :cond_4
    move-object v3, v0

    :goto_1
    invoke-virtual {p0}, Lf1/k;->c()Lf1/r;

    move-result-object v4

    iget v3, v3, Lf1/t;->b:I

    invoke-virtual {p0}, Lf1/k;->c()Lf1/r;

    move-result-object v6

    iget-object v6, v6, Lf1/r;->f:Ll3/r0;

    iget-object v6, v6, Ll3/r0;->a:Ll3/q0;

    iget-object v6, v6, Ll3/q0;->a:Ll3/g;

    iget-object v6, v6, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    invoke-static {v2, p1, v4, v3, v6}, Lf1/k;->m(La0/k0;Lf1/u;Lf1/r;II)V

    new-instance v3, Lcom/whoop/profile/view/edit/n;

    invoke-direct {v3, p0, v2, p1}, Lcom/whoop/profile/view/edit/n;-><init>(Lf1/k;La0/k0;Lf1/u;)V

    invoke-virtual {p0, v3}, Lf1/k;->g(Lkotlin/jvm/functions/Function1;)V

    if-eqz v1, :cond_5

    goto :goto_2

    :cond_5
    move-object v0, v5

    :goto_2
    invoke-virtual {p0}, Lf1/k;->e()Lf1/g;

    move-result-object v1

    sget-object v3, Lf1/g;->w:Lf1/g;

    if-ne v1, v3, :cond_6

    invoke-virtual {p0}, Lf1/k;->k()Lf1/r;

    move-result-object v1

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Lf1/k;->j()Lf1/r;

    move-result-object v1

    :goto_3
    const/4 v3, 0x0

    iget v0, v0, Lf1/t;->b:I

    invoke-static {v2, p1, v1, v3, v0}, Lf1/k;->m(La0/k0;Lf1/u;Lf1/r;II)V

    return-object v2
.end method

.method public final i()Lf1/u;
    .locals 1

    iget-object v0, p0, Lf1/k;->f:Lf1/u;

    return-object v0
.end method

.method public final j()Lf1/r;
    .locals 2

    iget v0, p0, Lf1/k;->d:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lf1/k;->o(IZ)I

    move-result v0

    iget-object v1, p0, Lf1/k;->b:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf1/r;

    return-object v0
.end method

.method public final k()Lf1/r;
    .locals 2

    iget v0, p0, Lf1/k;->c:I

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lf1/k;->o(IZ)I

    move-result v0

    iget-object v1, p0, Lf1/k;->b:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf1/r;

    return-object v0
.end method

.method public final l()I
    .locals 1

    iget v0, p0, Lf1/k;->c:I

    return v0
.end method

.method public final n(J)I
    .locals 3

    :try_start_0
    iget-object v0, p0, Lf1/k;->a:La0/i0;

    invoke-virtual {v0, p1, p2}, La0/i0;->c(J)I

    move-result p1
    :try_end_0
    .catch Ljava/util/NoSuchElementException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Invalid selectableId: "

    invoke-static {p1, p2, v2}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final o(IZ)I
    .locals 3

    invoke-virtual {p0}, Lf1/k;->e()Lf1/g;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    if-eq v0, v2, :cond_3

    if-ne v0, v1, :cond_0

    :goto_0
    move p2, v2

    goto :goto_1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :cond_3
    :goto_1
    xor-int/2addr p2, v2

    sub-int/2addr p1, p2

    div-int/2addr p1, v1

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MultiSelectionLayout(isStartHandle="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lf1/k;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", startPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lf1/k;->c:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    int-to-float v1, v1

    const/4 v3, 0x2

    int-to-float v3, v3

    div-float/2addr v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", endPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lf1/k;->d:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    div-float/2addr v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", crossed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lf1/k;->e()Lf1/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", infos="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "[\n\t"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lf1/k;->b:Ljava/util/List;

    move-object v4, v3

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-ge v6, v4, :cond_1

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lf1/r;

    if-eqz v2, :cond_0

    move v2, v5

    goto :goto_1

    :cond_0
    const-string v8, ",\n\t"

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, " -> "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string v2, "\n]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "toString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
