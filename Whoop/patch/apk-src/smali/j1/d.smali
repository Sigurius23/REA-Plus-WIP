.class public final synthetic Lj1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lj1/l;

.field public final synthetic x:Lp1/t2;

.field public final synthetic y:J

.field public final synthetic z:Li2/s0;


# direct methods
.method public synthetic constructor <init>(Lj1/l;Lp1/t2;JLi2/s0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj1/d;->w:Lj1/l;

    iput-object p2, p0, Lj1/d;->x:Lp1/t2;

    iput-wide p3, p0, Lj1/d;->y:J

    iput-object p5, p0, Lj1/d;->z:Li2/s0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    move-object/from16 v1, p0

    iget-wide v3, v1, Lj1/d;->y:J

    iget-object v0, v1, Lj1/d;->z:Li2/s0;

    move-object/from16 v2, p1

    check-cast v2, Lk2/e;

    iget-object v5, v1, Lj1/d;->w:Lj1/l;

    invoke-virtual {v5}, Lj1/l;->a()F

    move-result v6

    iget-object v5, v5, Lj1/l;->g:Lp1/g1;

    invoke-virtual {v5}, Lp1/g1;->x()F

    move-result v5

    div-float/2addr v6, v5

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F

    move-result v7

    const v8, 0x3ecccccd    # 0.4f

    sub-float/2addr v7, v8

    const/4 v9, 0x0

    invoke-static {v7, v9}, Ljava/lang/Math;->max(FF)F

    move-result v7

    const/4 v10, 0x5

    int-to-float v10, v10

    mul-float/2addr v7, v10

    const/4 v10, 0x3

    int-to-float v10, v10

    div-float/2addr v7, v10

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    sub-float/2addr v6, v5

    cmpg-float v10, v6, v9

    if-gez v10, :cond_0

    goto :goto_0

    :cond_0
    move v9, v6

    :goto_0
    const/high16 v6, 0x40000000    # 2.0f

    cmpl-float v10, v9, v6

    if-lez v10, :cond_1

    move v9, v6

    :cond_1
    float-to-double v10, v9

    const/4 v12, 0x2

    int-to-double v12, v12

    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v10

    double-to-float v10, v10

    const/4 v11, 0x4

    int-to-float v11, v11

    div-float/2addr v10, v11

    sub-float/2addr v9, v10

    const v10, 0x3f4ccccd    # 0.8f

    mul-float/2addr v10, v7

    const/high16 v11, -0x41800000    # -0.25f

    mul-float/2addr v8, v7

    add-float/2addr v8, v11

    add-float/2addr v8, v9

    const/high16 v9, 0x3f000000    # 0.5f

    mul-float/2addr v8, v9

    const/16 v9, 0x168

    int-to-float v9, v9

    mul-float v11, v8, v9

    add-float/2addr v10, v8

    mul-float/2addr v10, v9

    invoke-static {v5, v7}, Ljava/lang/Math;->min(FF)F

    move-result v5

    new-instance v14, Lc0/i1;

    invoke-direct {v14, v8, v11, v10, v5}, Lc0/i1;-><init>(FFFF)V

    iget-object v5, v1, Lj1/d;->x:Lp1/t2;

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v7

    invoke-interface {v2}, Lk2/e;->B0()J

    move-result-wide v12

    invoke-interface {v2}, Lk2/e;->t0()La3/p;

    move-result-object v15

    move-wide/from16 v16, v3

    invoke-virtual {v15}, La3/p;->A()J

    move-result-wide v3

    invoke-virtual {v15}, La3/p;->w()Li2/v;

    move-result-object v5

    invoke-interface {v5}, Li2/v;->q()V

    :try_start_0
    iget-object v5, v15, La3/p;->x:Ljava/lang/Object;

    check-cast v5, Laj/d;

    invoke-virtual {v5, v8, v12, v13}, Laj/d;->v(FJ)V

    sget v5, Lj1/g;->c:F

    invoke-interface {v2, v5}, Ly3/c;->q0(F)F

    move-result v5

    sget v8, Lj1/g;->d:F

    invoke-interface {v2, v8}, Ly3/c;->q0(F)F

    move-result v9

    div-float/2addr v9, v6

    add-float/2addr v9, v5

    new-instance v5, Lh2/c;

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljc/x;->L(J)J

    move-result-wide v12

    const/16 v6, 0x20

    shr-long/2addr v12, v6

    long-to-int v12, v12

    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v12

    sub-float/2addr v12, v9

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v18

    invoke-static/range {v18 .. v19}, Ljc/x;->L(J)J

    move-result-wide v18

    const-wide v20, 0xffffffffL

    move v13, v6

    move/from16 p1, v7

    and-long v6, v18, v20

    long-to-int v6, v6

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    sub-float/2addr v6, v9

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v18

    invoke-static/range {v18 .. v19}, Ljc/x;->L(J)J

    move-result-wide v18

    move-object/from16 v22, v0

    shr-long v0, v18, v13

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    add-float/2addr v0, v9

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v18

    invoke-static/range {v18 .. v19}, Ljc/x;->L(J)J

    move-result-wide v18
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    move-wide/from16 v23, v3

    and-long v3, v18, v20

    long-to-int v1, v3

    :try_start_1
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    add-float/2addr v1, v9

    invoke-direct {v5, v12, v6, v0, v1}, Lh2/c;-><init>(FFFF)V

    sub-float v6, v10, v11

    invoke-virtual {v5}, Lh2/c;->f()J

    move-result-wide v0

    invoke-virtual {v5}, Lh2/c;->e()J

    move-result-wide v9

    new-instance v25, Lk2/i;

    invoke-interface {v2, v8}, Ly3/c;->q0(F)F

    move-result v26

    const/16 v30, 0x0

    const/16 v31, 0x1a

    const/16 v27, 0x0

    const/16 v28, 0x2

    const/16 v29, 0x0

    invoke-direct/range {v25 .. v31}, Lk2/i;-><init>(FFIILi2/t0;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/16 v13, 0x300

    move-wide v7, v0

    move-object v0, v5

    move v5, v11

    move-wide/from16 v3, v16

    move-wide/from16 v32, v23

    move-object/from16 v12, v25

    move/from16 v11, p1

    :try_start_2
    invoke-static/range {v2 .. v13}, Lk2/e;->P(Lk2/e;JFFJJFLk2/i;I)V

    move-wide v5, v3

    move v7, v11

    move-object v8, v14

    move-object/from16 v3, v22

    move-object v4, v0

    invoke-static/range {v2 .. v8}, Lj1/g;->c(Lk2/e;Li2/s0;Lh2/c;JFLc0/i1;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-wide/from16 v1, v32

    invoke-static {v15, v1, v2}, Ld;->z(La3/p;J)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :catchall_0
    move-exception v0

    move-wide/from16 v1, v32

    goto :goto_1

    :catchall_1
    move-exception v0

    move-wide/from16 v1, v23

    goto :goto_1

    :catchall_2
    move-exception v0

    move-wide v1, v3

    :goto_1
    invoke-static {v15, v1, v2}, Ld;->z(La3/p;J)V

    throw v0
.end method
