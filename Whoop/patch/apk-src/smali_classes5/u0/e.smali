.class public final Lu0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu0/z0;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J


# direct methods
.method public constructor <init>(JJJ)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lu0/e;->a:J

    iput-wide p3, p0, Lu0/e;->b:J

    iput-wide p5, p0, Lu0/e;->c:J

    sget-wide v0, Ly3/o;->c:J

    invoke-static {p1, p2, v0, v1}, Ly3/o;->a(JJ)Z

    move-result v2

    if-nez v2, :cond_7

    invoke-static {p3, p4, v0, v1}, Ly3/o;->a(JJ)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-static {p5, p6, v0, v1}, Ly3/o;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-static {p1, p2}, Ly3/o;->b(J)J

    move-result-wide v0

    invoke-static {p3, p4}, Ly3/o;->b(J)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ly3/p;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1, p2, p3, p4}, Lv63/c;->b(JJ)V

    invoke-static {p1, p2}, Ly3/o;->c(J)F

    move-result p1

    invoke-static {p3, p4}, Ly3/o;->c(J)F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-lez p1, :cond_0

    iput-wide p3, p0, Lu0/e;->a:J

    :cond_0
    invoke-static {p5, p6}, Ly3/o;->b(J)J

    move-result-wide p1

    const-wide v0, 0x100000000L

    invoke-static {p1, p2, v0, v1}, Ly3/p;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_2

    const p1, 0x38d1b717    # 1.0E-4f

    invoke-static {p1, v0, v1}, Lv63/c;->j(FJ)J

    move-result-wide p1

    invoke-static {p5, p6, p1, p2}, Lv63/c;->b(JJ)V

    invoke-static {p5, p6}, Ly3/o;->c(J)F

    move-result p5

    invoke-static {p1, p2}, Ly3/o;->c(J)F

    move-result p1

    invoke-static {p5, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-ltz p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    iget-wide p1, p0, Lu0/e;->a:J

    invoke-static {p1, p2}, Ly3/o;->c(J)F

    move-result p1

    const/4 p2, 0x0

    cmpg-float p1, p1, p2

    if-ltz p1, :cond_4

    invoke-static {p3, p4}, Ly3/o;->c(J)F

    move-result p1

    cmpg-float p1, p1, p2

    if-ltz p1, :cond_3

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "AutoSize.StepBased: maxFontSize must not be negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "AutoSize.StepBased: minFontSize must not be negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static a(Ll3/r0;)Z
    .locals 11

    iget-object v0, p0, Ll3/r0;->b:Ll3/w;

    iget-wide v1, p0, Ll3/r0;->c:J

    iget-object v3, p0, Ll3/r0;->a:Ll3/q0;

    iget v4, v3, Ll3/q0;->f:I

    const/16 v5, 0x20

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-ne v4, v7, :cond_0

    goto :goto_0

    :cond_0
    const/4 v8, 0x3

    if-ne v4, v8, :cond_3

    :goto_0
    shr-long/2addr v1, v5

    long-to-int v1, v1

    int-to-float v1, v1

    iget v0, v0, Ll3/w;->d:F

    cmpg-float v0, v1, v0

    if-gez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Ll3/r0;->d()Z

    move-result p0

    if-eqz p0, :cond_2

    :goto_1
    return v7

    :cond_2
    return v6

    :cond_3
    const/4 v8, 0x2

    const/4 v9, 0x5

    const/4 v10, 0x4

    if-ne v4, v10, :cond_4

    goto :goto_2

    :cond_4
    if-ne v4, v9, :cond_5

    goto :goto_2

    :cond_5
    if-ne v4, v8, :cond_c

    :goto_2
    iget v3, v0, Ll3/w;->f:I

    if-eqz v3, :cond_b

    if-eq v3, v7, :cond_a

    if-ne v4, v10, :cond_6

    goto :goto_3

    :cond_6
    if-ne v4, v9, :cond_9

    :goto_3
    shr-long/2addr v1, v5

    long-to-int v1, v1

    int-to-float v1, v1

    iget v0, v0, Ll3/w;->d:F

    cmpg-float v0, v1, v0

    if-gez v0, :cond_7

    goto :goto_4

    :cond_7
    invoke-virtual {p0}, Ll3/r0;->d()Z

    move-result p0

    if-eqz p0, :cond_8

    :goto_4
    return v7

    :cond_8
    return v6

    :cond_9
    if-ne v4, v8, :cond_b

    sub-int/2addr v3, v7

    invoke-virtual {p0, v3}, Ll3/r0;->l(I)Z

    move-result p0

    return p0

    :cond_a
    invoke-virtual {p0, v6}, Ll3/r0;->l(I)Z

    move-result p0

    return p0

    :cond_b
    return v6

    :cond_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TextOverflow type "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v3, Ll3/q0;->f:I

    invoke-static {v1}, Lv63/c;->m(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " is not supported."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final b(Le1/d;JLl3/g;)J
    .locals 8

    iget-wide v0, p0, Lu0/e;->c:J

    invoke-virtual {p1, v0, v1}, Le1/d;->K(J)F

    move-result p4

    iget-wide v0, p0, Lu0/e;->a:J

    invoke-virtual {p1, v0, v1}, Le1/d;->K(J)F

    move-result v0

    iget-wide v1, p0, Lu0/e;->b:J

    invoke-virtual {p1, v1, v2}, Le1/d;->K(J)F

    move-result v1

    add-float v2, v0, v1

    const/4 v3, 0x2

    int-to-float v3, v3

    div-float/2addr v2, v3

    move v5, v0

    move v4, v1

    :goto_0
    sub-float v6, v4, v5

    cmpl-float v6, v6, p4

    if-ltz v6, :cond_1

    invoke-interface {p1, v2}, Ly3/c;->q(F)J

    move-result-wide v6

    invoke-virtual {p1, p2, p3, v6, v7}, Le1/d;->b(JJ)Ll3/r0;

    move-result-object v6

    invoke-static {v6}, Lu0/e;->a(Ll3/r0;)Z

    move-result v6

    if-eqz v6, :cond_0

    move v4, v2

    goto :goto_1

    :cond_0
    move v5, v2

    :goto_1
    add-float v2, v5, v4

    div-float/2addr v2, v3

    goto :goto_0

    :cond_1
    sub-float/2addr v5, v0

    div-float/2addr v5, p4

    float-to-double v2, v5

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v2, p4

    add-float/2addr v2, v0

    add-float/2addr p4, v2

    cmpg-float v0, p4, v1

    if-gtz v0, :cond_2

    invoke-interface {p1, p4}, Ly3/c;->q(F)J

    move-result-wide v0

    invoke-virtual {p1, p2, p3, v0, v1}, Le1/d;->b(JJ)Ll3/r0;

    move-result-object p2

    invoke-static {p2}, Lu0/e;->a(Ll3/r0;)Z

    move-result p2

    if-nez p2, :cond_2

    move v2, p4

    :cond_2
    invoke-interface {p1, v2}, Ly3/c;->q(F)J

    move-result-wide p1

    return-wide p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    instance-of v2, p1, Lu0/e;

    if-nez v2, :cond_2

    return v1

    :cond_2
    check-cast p1, Lu0/e;

    iget-wide v2, p1, Lu0/e;->a:J

    iget-wide v4, p0, Lu0/e;->a:J

    invoke-static {v2, v3, v4, v5}, Ly3/o;->a(JJ)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-wide v2, p1, Lu0/e;->b:J

    iget-wide v4, p0, Lu0/e;->b:J

    invoke-static {v2, v3, v4, v5}, Ly3/o;->a(JJ)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-wide v2, p1, Lu0/e;->c:J

    iget-wide v4, p0, Lu0/e;->c:J

    invoke-static {v2, v3, v4, v5}, Ly3/o;->a(JJ)Z

    move-result p1

    if-nez p1, :cond_5

    return v1

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 4

    sget-object v0, Ly3/o;->b:[Ly3/p;

    iget-wide v0, p0, Lu0/e;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lu0/e;->b:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v1, p0, Lu0/e;->c:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
