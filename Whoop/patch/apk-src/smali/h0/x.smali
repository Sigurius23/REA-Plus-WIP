.class public final Lh0/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/h1;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:[F

.field public final c:I


# direct methods
.method public constructor <init>(Ljava/util/List;[F)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/x;->a:Ljava/util/List;

    iput-object p2, p0, Lh0/x;->b:[F

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    array-length v1, p2

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DraggableAnchors were constructed with inconsistent key-value sizes. Keys: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " | Anchors: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lm83/n;->T0([F)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_0
    array-length p1, p2

    iput p1, p0, Lh0/x;->c:I

    return-void
.end method


# virtual methods
.method public final a(F)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lh0/x;->b:[F

    array-length v1, v0

    const/4 v2, -0x1

    const/high16 v3, 0x7f800000    # Float.POSITIVE_INFINITY

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v4, v1, :cond_1

    aget v6, v0, v4

    add-int/lit8 v7, v5, 0x1

    sub-float v6, p1, v6

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    cmpg-float v8, v6, v3

    if-gtz v8, :cond_0

    move v2, v5

    move v3, v6

    :cond_0
    add-int/lit8 v4, v4, 0x1

    move v5, v7

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lh0/x;->a:Ljava/util/List;

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(FZ)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lh0/x;->b:[F

    array-length v1, v0

    const/4 v2, -0x1

    const/high16 v3, 0x7f800000    # Float.POSITIVE_INFINITY

    const/4 v4, 0x0

    move v6, v3

    move v5, v4

    :goto_0
    if-ge v4, v1, :cond_3

    aget v7, v0, v4

    add-int/lit8 v8, v5, 0x1

    if-eqz p2, :cond_0

    sub-float/2addr v7, p1

    goto :goto_1

    :cond_0
    sub-float v7, p1, v7

    :goto_1
    const/4 v9, 0x0

    cmpg-float v9, v7, v9

    if-gez v9, :cond_1

    move v7, v3

    :cond_1
    cmpg-float v9, v7, v6

    if-gtz v9, :cond_2

    move v2, v5

    move v6, v7

    :cond_2
    add-int/lit8 v4, v4, 0x1

    move v5, v8

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lh0/x;->a:Ljava/util/List;

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c()F
    .locals 5

    const-string v0, "<this>"

    iget-object v1, p0, Lh0/x;->b:[F

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    aget v0, v1, v0

    array-length v2, v1

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    if-gt v3, v2, :cond_1

    :goto_0
    aget v4, v1, v3

    invoke-static {v0, v4}, Ljava/lang/Math;->max(FF)F

    move-result v0

    if-eq v3, v2, :cond_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0

    :cond_2
    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0
.end method

.method public final d()F
    .locals 5

    const-string v0, "<this>"

    iget-object v1, p0, Lh0/x;->b:[F

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    aget v0, v1, v0

    array-length v2, v1

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    if-gt v3, v2, :cond_1

    :goto_0
    aget v4, v1, v3

    invoke-static {v0, v4}, Ljava/lang/Math;->min(FF)F

    move-result v0

    if-eq v3, v2, :cond_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0

    :cond_2
    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0
.end method

.method public final e(Ljava/lang/Object;)F
    .locals 2

    iget-object v0, p0, Lh0/x;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    iget-object v0, p0, Lh0/x;->b:[F

    array-length v1, v0

    if-ge p1, v1, :cond_0

    aget p1, v0, p1

    return p1

    :cond_0
    const/high16 p1, 0x7fc00000    # Float.NaN

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lh0/x;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lh0/x;

    iget-object v1, p1, Lh0/x;->a:Ljava/util/List;

    iget-object v3, p0, Lh0/x;->a:Ljava/util/List;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lh0/x;->b:[F

    iget-object v3, p1, Lh0/x;->b:[F

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([F[F)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lh0/x;->c:I

    iget p1, p1, Lh0/x;->c:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lh0/x;->a:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lh0/x;->b:[F

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([F)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lh0/x;->c:I

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DraggableAnchors(anchors={"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lh0/x;->c:I

    if-ge v1, v2, :cond_2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lh0/x;->a:Ljava/util/List;

    invoke-static {v1, v4}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v4, 0x3d

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-ltz v1, :cond_0

    iget-object v4, p0, Lh0/x;->b:[F

    array-length v5, v4

    if-ge v1, v5, :cond_0

    aget v4, v4, v1

    goto :goto_1

    :cond_0
    const/high16 v4, 0x7fc00000    # Float.NaN

    :goto_1
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_1

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const-string v1, "})"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
