.class public interface abstract Lk2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly3/c;


# direct methods
.method public static synthetic A0(Lk2/e;JJJFILi2/t0;I)V
    .locals 11

    and-int/lit8 v0, p10, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move v8, v0

    goto :goto_0

    :cond_0
    move/from16 v8, p7

    :goto_0
    and-int/lit8 v0, p10, 0x10

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    move v9, v0

    goto :goto_1

    :cond_1
    move/from16 v9, p8

    :goto_1
    and-int/lit8 v0, p10, 0x20

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    move-object v10, v0

    :goto_2
    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    move-wide/from16 v6, p5

    goto :goto_3

    :cond_2
    move-object/from16 v10, p9

    goto :goto_2

    :goto_3
    invoke-interface/range {v1 .. v10}, Lk2/e;->d0(JJJFILi2/t0;)V

    return-void
.end method

.method public static synthetic D(Lk2/e;JJJJLk2/f;FI)V
    .locals 15

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    const-wide/16 v1, 0x0

    move-wide v6, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v6, p3

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    invoke-interface {p0}, Lk2/e;->d()J

    move-result-wide v1

    invoke-static {v1, v2, v6, v7}, Lk2/e;->h0(JJ)J

    move-result-wide v1

    move-wide v8, v1

    goto :goto_1

    :cond_1
    move-wide/from16 v8, p5

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    sget-object v1, Lk2/h;->a:Lk2/h;

    move-object v12, v1

    goto :goto_2

    :cond_2
    move-object/from16 v12, p9

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    const/high16 v1, 0x3f800000    # 1.0f

    move v13, v1

    goto :goto_3

    :cond_3
    move/from16 v13, p10

    :goto_3
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_4

    const/4 v0, 0x3

    :goto_4
    move-object v3, p0

    move-wide/from16 v4, p1

    move-wide/from16 v10, p7

    move v14, v0

    goto :goto_5

    :cond_4
    const/4 v0, 0x0

    goto :goto_4

    :goto_5
    invoke-interface/range {v3 .. v14}, Lk2/e;->z0(JJJJLk2/f;FI)V

    return-void
.end method

.method public static synthetic G(Lk2/e;Li2/t;FJFLk2/f;I)V
    .locals 7

    and-int/lit8 v0, p7, 0x2

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lk2/e;->d()J

    move-result-wide v0

    invoke-static {v0, v1}, Lh2/e;->d(J)F

    move-result p2

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p2, v0

    :cond_0
    move v2, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_1

    invoke-interface {p0}, Lk2/e;->B0()J

    move-result-wide p3

    :cond_1
    move-wide v3, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_2

    const/high16 p5, 0x3f800000    # 1.0f

    :cond_2
    move v5, p5

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_3

    sget-object p6, Lk2/h;->a:Lk2/h;

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lk2/e;->x(Li2/t;FJFLk2/f;)V

    return-void
.end method

.method public static synthetic J0(Lk2/e;Li2/t;JJJFLk2/f;I)V
    .locals 10

    and-int/lit8 v0, p10, 0x2

    if-eqz v0, :cond_0

    const-wide/16 p2, 0x0

    :cond_0
    move-wide v2, p2

    and-int/lit8 p2, p10, 0x4

    if-eqz p2, :cond_1

    invoke-interface {p0}, Lk2/e;->d()J

    move-result-wide p2

    invoke-static {p2, p3, v2, v3}, Lk2/e;->h0(JJ)J

    move-result-wide p2

    move-wide v4, p2

    goto :goto_0

    :cond_1
    move-wide v4, p4

    :goto_0
    and-int/lit8 p2, p10, 0x10

    if-eqz p2, :cond_2

    const/high16 p2, 0x3f800000    # 1.0f

    move v8, p2

    goto :goto_1

    :cond_2
    move/from16 v8, p8

    :goto_1
    and-int/lit8 p2, p10, 0x20

    if-eqz p2, :cond_3

    sget-object p2, Lk2/h;->a:Lk2/h;

    move-object v9, p2

    :goto_2
    move-object v0, p0

    move-object v1, p1

    move-wide/from16 v6, p6

    goto :goto_3

    :cond_3
    move-object/from16 v9, p9

    goto :goto_2

    :goto_3
    invoke-interface/range {v0 .. v9}, Lk2/e;->m(Li2/t;JJJFLk2/f;)V

    return-void
.end method

.method public static K0(Lk2/e;Li2/g;JJFLi2/y;II)V
    .locals 13

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_0

    move-wide v8, p2

    goto :goto_0

    :cond_0
    move-wide/from16 v8, p4

    :goto_0
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_1

    const/high16 v1, 0x3f800000    # 1.0f

    move v10, v1

    goto :goto_1

    :cond_1
    move/from16 v10, p6

    :goto_1
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    move v12, v0

    goto :goto_2

    :cond_2
    move/from16 v12, p8

    :goto_2
    const-wide/16 v4, 0x0

    move-object v2, p0

    move-object v3, p1

    move-wide v6, p2

    move-object/from16 v11, p7

    invoke-interface/range {v2 .. v12}, Lk2/e;->I(Li2/g;JJJFLi2/y;I)V

    return-void
.end method

.method public static synthetic L(Lk2/e;Li2/s0;Li2/t;FLk2/f;I)V
    .locals 6

    and-int/lit8 v0, p5, 0x4

    if-eqz v0, :cond_0

    const/high16 p3, 0x3f800000    # 1.0f

    :cond_0
    move v3, p3

    and-int/lit8 p3, p5, 0x8

    if-eqz p3, :cond_1

    sget-object p4, Lk2/h;->a:Lk2/h;

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p5, 0x20

    if-eqz p3, :cond_2

    const/4 p3, 0x3

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p3

    goto :goto_1

    :cond_2
    const/4 p3, 0x0

    goto :goto_0

    :goto_1
    invoke-interface/range {v0 .. v5}, Lk2/e;->B(Li2/s0;Li2/t;FLk2/f;I)V

    return-void
.end method

.method public static synthetic M(Lk2/e;JFJFLk2/f;I)V
    .locals 8

    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lk2/e;->d()J

    move-result-wide v0

    invoke-static {v0, v1}, Lh2/e;->d(J)F

    move-result p3

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p3, v0

    :cond_0
    move v3, p3

    and-int/lit8 p3, p8, 0x4

    if-eqz p3, :cond_1

    invoke-interface {p0}, Lk2/e;->B0()J

    move-result-wide p4

    :cond_1
    move-wide v4, p4

    and-int/lit8 p3, p8, 0x8

    if-eqz p3, :cond_2

    const/high16 p6, 0x3f800000    # 1.0f

    :cond_2
    move v6, p6

    and-int/lit8 p3, p8, 0x10

    if-eqz p3, :cond_3

    sget-object p3, Lk2/h;->a:Lk2/h;

    move-object v7, p3

    :goto_0
    move-object v0, p0

    move-wide v1, p1

    goto :goto_1

    :cond_3
    move-object v7, p7

    goto :goto_0

    :goto_1
    invoke-interface/range {v0 .. v7}, Lk2/e;->u0(JFJFLk2/f;)V

    return-void
.end method

.method public static synthetic P(Lk2/e;JFFJJFLk2/i;I)V
    .locals 13

    and-int/lit8 v0, p11, 0x10

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    move-wide v7, v0

    goto :goto_0

    :cond_0
    move-wide/from16 v7, p5

    :goto_0
    and-int/lit8 v0, p11, 0x20

    if-eqz v0, :cond_1

    invoke-interface {p0}, Lk2/e;->d()J

    move-result-wide v0

    invoke-static {v0, v1, v7, v8}, Lk2/e;->h0(JJ)J

    move-result-wide v0

    move-wide v9, v0

    goto :goto_1

    :cond_1
    move-wide/from16 v9, p7

    :goto_1
    and-int/lit8 v0, p11, 0x40

    if-eqz v0, :cond_2

    const/high16 v0, 0x3f800000    # 1.0f

    move v11, v0

    :goto_2
    move-object v2, p0

    move-wide v3, p1

    move/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v12, p10

    goto :goto_3

    :cond_2
    move/from16 v11, p9

    goto :goto_2

    :goto_3
    invoke-interface/range {v2 .. v12}, Lk2/e;->k0(JFFJJFLk2/f;)V

    return-void
.end method

.method public static synthetic X(Lk2/e;Li2/t;FFZJJLk2/i;II)V
    .locals 14

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_0

    const-wide/16 v1, 0x0

    move-wide v8, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v8, p5

    :goto_0
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_1

    invoke-interface {p0}, Lk2/e;->d()J

    move-result-wide v1

    invoke-static {v1, v2, v8, v9}, Lk2/e;->h0(JJ)J

    move-result-wide v1

    move-wide v10, v1

    goto :goto_1

    :cond_1
    move-wide/from16 v10, p7

    :goto_1
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_2

    sget-object v1, Lk2/h;->a:Lk2/h;

    move-object v12, v1

    goto :goto_2

    :cond_2
    move-object/from16 v12, p9

    :goto_2
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_3

    const/4 v0, 0x3

    move v13, v0

    :goto_3
    move-object v3, p0

    move-object v4, p1

    move/from16 v5, p2

    move/from16 v6, p3

    move/from16 v7, p4

    goto :goto_4

    :cond_3
    move/from16 v13, p10

    goto :goto_3

    :goto_4
    invoke-interface/range {v3 .. v13}, Lk2/e;->w(Li2/t;FFZJJLk2/f;I)V

    return-void
.end method

.method public static h0(JJ)J
    .locals 6

    const/16 v0, 0x20

    shr-long v1, p0, v0

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    shr-long v2, p2, v0

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    sub-float/2addr v1, v2

    const-wide v2, 0xffffffffL

    and-long/2addr p0, v2

    long-to-int p0, p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    and-long p1, p2, v2

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    sub-float/2addr p0, p1

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long p1, p1

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long v4, p0

    shl-long p0, p1, v0

    and-long p2, v4, v2

    or-long/2addr p0, p2

    return-wide p0
.end method

.method public static synthetic i0(Lk2/e;JJJFLi2/y;II)V
    .locals 12

    and-int/lit8 v0, p10, 0x2

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    move-wide v5, v0

    goto :goto_0

    :cond_0
    move-wide v5, p3

    :goto_0
    and-int/lit8 v0, p10, 0x4

    if-eqz v0, :cond_1

    invoke-interface {p0}, Lk2/e;->d()J

    move-result-wide v0

    invoke-static {v0, v1, v5, v6}, Lk2/e;->h0(JJ)J

    move-result-wide v0

    move-wide v7, v0

    goto :goto_1

    :cond_1
    move-wide/from16 v7, p5

    :goto_1
    and-int/lit8 v0, p10, 0x8

    if-eqz v0, :cond_2

    const/high16 v0, 0x3f800000    # 1.0f

    move v9, v0

    goto :goto_2

    :cond_2
    move/from16 v9, p7

    :goto_2
    and-int/lit8 v0, p10, 0x20

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    move-object v10, v0

    goto :goto_3

    :cond_3
    move-object/from16 v10, p8

    :goto_3
    and-int/lit8 v0, p10, 0x40

    if-eqz v0, :cond_4

    const/4 v0, 0x3

    move v11, v0

    :goto_4
    move-object v2, p0

    move-wide v3, p1

    goto :goto_5

    :cond_4
    move/from16 v11, p9

    goto :goto_4

    :goto_5
    invoke-interface/range {v2 .. v11}, Lk2/e;->n0(JJJFLi2/y;I)V

    return-void
.end method

.method public static synthetic j(Lk2/e;Li2/t;JJFLi2/t0;FI)V
    .locals 10

    and-int/lit8 v0, p9, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v8, v0

    goto :goto_0

    :cond_0
    move-object/from16 v8, p7

    :goto_0
    and-int/lit8 v0, p9, 0x40

    if-eqz v0, :cond_1

    const/high16 v0, 0x3f800000    # 1.0f

    move v9, v0

    :goto_1
    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    move/from16 v7, p6

    goto :goto_2

    :cond_1
    move/from16 v9, p8

    goto :goto_1

    :goto_2
    invoke-interface/range {v1 .. v9}, Lk2/e;->R(Li2/t;JJFLi2/t0;F)V

    return-void
.end method

.method public static synthetic u(Lk2/e;Li2/t;JJFLk2/f;II)V
    .locals 9

    and-int/lit8 v0, p9, 0x2

    if-eqz v0, :cond_0

    const-wide/16 p2, 0x0

    :cond_0
    move-wide v2, p2

    and-int/lit8 p2, p9, 0x4

    if-eqz p2, :cond_1

    invoke-interface {p0}, Lk2/e;->d()J

    move-result-wide p2

    invoke-static {p2, p3, v2, v3}, Lk2/e;->h0(JJ)J

    move-result-wide p2

    move-wide v4, p2

    goto :goto_0

    :cond_1
    move-wide v4, p4

    :goto_0
    and-int/lit8 p2, p9, 0x8

    if-eqz p2, :cond_2

    const/high16 p2, 0x3f800000    # 1.0f

    move v6, p2

    goto :goto_1

    :cond_2
    move v6, p6

    :goto_1
    and-int/lit8 p2, p9, 0x10

    if-eqz p2, :cond_3

    sget-object p2, Lk2/h;->a:Lk2/h;

    move-object v7, p2

    goto :goto_2

    :cond_3
    move-object/from16 v7, p7

    :goto_2
    and-int/lit8 p2, p9, 0x40

    if-eqz p2, :cond_4

    const/4 p2, 0x3

    move v8, p2

    :goto_3
    move-object v0, p0

    move-object v1, p1

    goto :goto_4

    :cond_4
    move/from16 v8, p8

    goto :goto_3

    :goto_4
    invoke-interface/range {v0 .. v8}, Lk2/e;->a0(Li2/t;JJFLk2/f;I)V

    return-void
.end method

.method public static synthetic z(Lk2/e;Li2/s0;JFLk2/f;I)V
    .locals 6

    and-int/lit8 v0, p6, 0x4

    if-eqz v0, :cond_0

    const/high16 p4, 0x3f800000    # 1.0f

    :cond_0
    move v4, p4

    and-int/lit8 p4, p6, 0x8

    if-eqz p4, :cond_1

    sget-object p5, Lk2/h;->a:Lk2/h;

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lk2/e;->E0(Li2/s0;JFLk2/f;)V

    return-void
.end method


# virtual methods
.method public abstract B(Li2/s0;Li2/t;FLk2/f;I)V
.end method

.method public B0()J
    .locals 2

    invoke-interface {p0}, Lk2/e;->t0()La3/p;

    move-result-object v0

    invoke-virtual {v0}, La3/p;->A()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljc/x;->L(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public abstract E0(Li2/s0;JFLk2/f;)V
.end method

.method public abstract I(Li2/g;JJJFLi2/y;I)V
.end method

.method public abstract R(Li2/t;JJFLi2/t0;F)V
.end method

.method public abstract a0(Li2/t;JJFLk2/f;I)V
.end method

.method public d()J
    .locals 2

    invoke-interface {p0}, Lk2/e;->t0()La3/p;

    move-result-object v0

    invoke-virtual {v0}, La3/p;->A()J

    move-result-wide v0

    return-wide v0
.end method

.method public abstract d0(JJJFILi2/t0;)V
.end method

.method public abstract getLayoutDirection()Ly3/m;
.end method

.method public abstract k0(JFFJJFLk2/f;)V
.end method

.method public abstract m(Li2/t;JJJFLk2/f;)V
.end method

.method public abstract n0(JJJFLi2/y;I)V
.end method

.method public abstract t0()La3/p;
.end method

.method public abstract u0(JFJFLk2/f;)V
.end method

.method public abstract w(Li2/t;FFZJJLk2/f;I)V
.end method

.method public abstract x(Li2/t;FJFLk2/f;)V
.end method

.method public abstract y0(Ljava/util/ArrayList;JF)V
.end method

.method public abstract z0(JJJJLk2/f;FI)V
.end method
