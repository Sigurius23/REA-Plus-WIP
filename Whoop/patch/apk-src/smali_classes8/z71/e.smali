.class public abstract Lz71/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a+\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0008\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a+\u0010\r\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u00012\u0006\u0010\u0008\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000b\u001a3\u0010\u0014\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lk2/e;",
        "",
        "overlayStrokeInPx",
        "Li2/s0;",
        "a",
        "(Lk2/e;F)Li2/s0;",
        "Li91/h;",
        "background",
        "meterCanvasPx",
        "Ll83/a0;",
        "d",
        "(Lk2/e;Li91/h;FF)V",
        "borderStrokePx",
        "c",
        "Lk2/i;",
        "stroke",
        "Lh2/e;",
        "size",
        "Lh2/b;",
        "topLeft",
        "b",
        "(Lk2/e;Li91/h;Lk2/i;JJ)V",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lk2/e;F)Li2/s0;
    .locals 18

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v5, v5

    const/16 v7, 0x20

    shl-long/2addr v3, v7

    const-wide v8, 0xffffffffL

    and-long/2addr v5, v8

    or-long/2addr v3, v5

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v5

    shr-long/2addr v5, v7

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v10

    and-long/2addr v10, v8

    long-to-int v6, v10

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v10, v5

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v5, v5

    shl-long/2addr v10, v7

    and-long/2addr v5, v8

    or-long/2addr v5, v10

    invoke-static {v3, v4, v5, v6}, Lhg3/i;->h(JJ)Lh2/c;

    move-result-object v3

    const/high16 v4, 0x435c0000    # 220.0f

    invoke-virtual {v0, v3, v2, v4}, Li2/j;->e(Lh2/c;FF)V

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v5

    shr-long/2addr v5, v7

    long-to-int v3, v5

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v3, v5

    sub-float v5, v3, p1

    float-to-double v10, v3

    const-wide v12, 0x400eb7c166fdfe3aL    # 3.839724354387525

    invoke-static {v12, v13}, Ljava/lang/Math;->cos(D)D

    move-result-wide v14

    mul-double/2addr v14, v10

    invoke-static {v12, v13}, Ljava/lang/Math;->sin(D)D

    move-result-wide v16

    mul-double v16, v16, v10

    float-to-double v5, v5

    invoke-static {v12, v13}, Ljava/lang/Math;->cos(D)D

    move-result-wide v10

    mul-double/2addr v10, v5

    invoke-static {v12, v13}, Ljava/lang/Math;->sin(D)D

    move-result-wide v12

    mul-double/2addr v12, v5

    add-double/2addr v14, v10

    const/4 v3, 0x2

    int-to-double v5, v3

    div-double/2addr v14, v5

    add-double v16, v16, v12

    div-double v5, v16, v5

    double-to-float v10, v14

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v11

    shr-long/2addr v11, v7

    long-to-int v11, v11

    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v11

    int-to-float v3, v3

    div-float/2addr v11, v3

    add-float/2addr v11, v10

    double-to-float v5, v5

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v12

    and-long/2addr v12, v8

    long-to-int v6, v12

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    div-float/2addr v6, v3

    add-float/2addr v6, v5

    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v10, v5

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v5, v5

    shl-long/2addr v10, v7

    and-long/2addr v5, v8

    or-long/2addr v5, v10

    div-float v10, p1, v3

    invoke-static {v10, v5, v6}, Lhg3/i;->i(FJ)Lh2/c;

    move-result-object v5

    const/high16 v6, 0x43340000    # 180.0f

    invoke-virtual {v0, v5, v4, v6}, Li2/j;->e(Lh2/c;FF)V

    add-float v2, p1, v2

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v11, v5

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v13, v2

    shl-long/2addr v11, v7

    and-long/2addr v13, v8

    or-long/2addr v11, v13

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v13

    shr-long/2addr v13, v7

    long-to-int v2, v13

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    sub-float v2, v2, p1

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v13

    and-long/2addr v13, v8

    long-to-int v5, v13

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    sub-float v5, v5, p1

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v13, v2

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    move v5, v7

    move-wide v15, v8

    int-to-long v7, v2

    shl-long/2addr v13, v5

    and-long/2addr v7, v15

    or-long/2addr v7, v13

    invoke-static {v11, v12, v7, v8}, Lhg3/i;->h(JJ)Lh2/c;

    move-result-object v2

    const/high16 v7, -0x3ca40000    # -220.0f

    invoke-virtual {v0, v2, v4, v7}, Li2/j;->e(Lh2/c;FF)V

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v7

    shr-long/2addr v7, v5

    long-to-int v2, v7

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    sub-float/2addr v2, v10

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v7

    and-long/2addr v7, v15

    long-to-int v1, v7

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    div-float/2addr v1, v3

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v7, v1

    shl-long v1, v2, v5

    and-long v3, v7, v15

    or-long/2addr v1, v3

    invoke-static {v10, v1, v2}, Lhg3/i;->i(FJ)Lh2/c;

    move-result-object v1

    invoke-virtual {v0, v1, v6, v6}, Li2/j;->e(Lh2/c;FF)V

    return-object v0
.end method

.method private static final b(Lk2/e;Li91/h;Lk2/i;JJ)V
    .locals 25

    move-object/from16 v0, p1

    instance-of v1, v0, Li91/e;

    if-eqz v1, :cond_0

    check-cast v0, Li91/e;

    invoke-virtual {v0}, Li91/e;->a()Li2/t;

    move-result-object v2

    const/4 v11, 0x0

    const/16 v12, 0x340

    const/4 v3, 0x0

    const/high16 v4, 0x43b40000    # 360.0f

    const/4 v5, 0x0

    move-object/from16 v1, p0

    move-object/from16 v10, p2

    move-wide/from16 v8, p3

    move-wide/from16 v6, p5

    invoke-static/range {v1 .. v12}, Lk2/e;->X(Lk2/e;Li2/t;FFZJJLk2/i;II)V

    return-void

    :cond_0
    instance-of v1, v0, Li91/g;

    if-eqz v1, :cond_1

    check-cast v0, Li91/g;

    invoke-virtual {v0}, Li91/g;->a()J

    move-result-wide v14

    const/16 v22, 0x0

    const/16 v24, 0x340

    const/16 v16, 0x0

    const/high16 v17, 0x43b40000    # 360.0f

    move-object/from16 v13, p0

    move-object/from16 v23, p2

    move-wide/from16 v20, p3

    move-wide/from16 v18, p5

    invoke-static/range {v13 .. v24}, Lk2/e;->P(Lk2/e;JFFJJFLk2/i;I)V

    return-void

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public static final c(Lk2/e;Li91/h;FF)V
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "background"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sub-float/2addr p3, p2

    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, p2, v0

    new-instance v1, Lk2/i;

    const/4 v6, 0x0

    const/16 v7, 0x1e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v2, p2

    invoke-direct/range {v1 .. v7}, Lk2/i;-><init>(FFIILi2/t0;I)V

    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long v2, p2

    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long p2, p2

    const/16 v4, 0x20

    shl-long/2addr v2, v4

    const-wide v5, 0xffffffffL

    and-long/2addr p2, v5

    or-long/2addr p2, v2

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v7, v0

    shl-long/2addr v2, v4

    and-long v4, v7, v5

    or-long v6, v2, v4

    move-object v2, p1

    move-wide v4, p2

    move-object v3, v1

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lz71/e;->b(Lk2/e;Li91/h;Lk2/i;JJ)V

    return-void
.end method

.method public static final d(Lk2/e;Li91/h;FF)V
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "background"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sub-float/2addr p3, p2

    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, p2, v0

    new-instance v1, Lk2/i;

    const/4 v6, 0x0

    const/16 v7, 0x1e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v2, p2

    invoke-direct/range {v1 .. v7}, Lk2/i;-><init>(FFIILi2/t0;I)V

    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long v2, p2

    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long p2, p2

    const/16 v4, 0x20

    shl-long/2addr v2, v4

    const-wide v5, 0xffffffffL

    and-long/2addr p2, v5

    or-long/2addr p2, v2

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v7, v0

    shl-long/2addr v2, v4

    and-long v4, v7, v5

    or-long v6, v2, v4

    move-object v2, p1

    move-wide v4, p2

    move-object v3, v1

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lz71/e;->b(Lk2/e;Li91/h;Lk2/i;JJ)V

    return-void
.end method
