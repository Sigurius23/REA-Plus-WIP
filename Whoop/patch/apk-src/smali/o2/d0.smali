.class public final Lo2/d0;
.super Lo2/b0;
.source "SourceFile"


# instance fields
.field public final b:Lo2/b;

.field public c:Ljava/lang/String;

.field public d:Z

.field public final e:Lio/sentry/android/core/internal/util/g;

.field public f:Lkotlin/jvm/internal/m;

.field public final g:Lp1/k1;

.field public h:Li2/p;

.field public final i:Lp1/k1;

.field public j:J

.field public k:F

.field public l:F

.field public final m:Lo2/c0;


# direct methods
.method public constructor <init>(Lo2/b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo2/d0;->b:Lo2/b;

    new-instance v0, Lo2/c0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo2/c0;-><init>(Lo2/d0;I)V

    iput-object v0, p1, Lo2/b;->i:Lkotlin/jvm/functions/Function1;

    const-string p1, ""

    iput-object p1, p0, Lo2/d0;->c:Ljava/lang/String;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lo2/d0;->d:Z

    new-instance p1, Lio/sentry/android/core/internal/util/g;

    invoke-direct {p1}, Lio/sentry/android/core/internal/util/g;-><init>()V

    iput-object p1, p0, Lo2/d0;->e:Lio/sentry/android/core/internal/util/g;

    sget-object p1, Lo2/f;->y:Lo2/f;

    iput-object p1, p0, Lo2/d0;->f:Lkotlin/jvm/internal/m;

    const/4 p1, 0x0

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lo2/d0;->g:Lp1/k1;

    new-instance p1, Lh2/e;

    const-wide/16 v0, 0x0

    invoke-direct {p1, v0, v1}, Lh2/e;-><init>(J)V

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lo2/d0;->i:Lp1/k1;

    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    iput-wide v0, p0, Lo2/d0;->j:J

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lo2/d0;->k:F

    iput p1, p0, Lo2/d0;->l:F

    new-instance p1, Lo2/c0;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lo2/c0;-><init>(Lo2/d0;I)V

    iput-object p1, p0, Lo2/d0;->m:Lo2/c0;

    return-void
.end method


# virtual methods
.method public final a(Lk2/e;)V
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lo2/d0;->e(Lk2/e;FLi2/y;)V

    return-void
.end method

.method public final e(Lk2/e;FLi2/y;)V
    .locals 34

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    iget-object v2, v0, Lo2/d0;->b:Lo2/b;

    iget-boolean v3, v2, Lo2/b;->d:Z

    const/4 v4, 0x5

    iget-object v5, v0, Lo2/d0;->g:Lp1/k1;

    const/4 v6, 0x1

    if-eqz v3, :cond_4

    iget-wide v8, v2, Lo2/b;->e:J

    const-wide/16 v10, 0x10

    cmp-long v3, v8, v10

    if-eqz v3, :cond_4

    invoke-virtual {v5}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li2/y;

    sget v8, Lo2/f0;->a:I

    instance-of v8, v3, Li2/p;

    const/4 v9, 0x3

    if-eqz v8, :cond_1

    check-cast v3, Li2/p;

    iget v3, v3, Li2/p;->c:I

    if-ne v3, v4, :cond_0

    goto :goto_0

    :cond_0
    if-ne v3, v9, :cond_4

    goto :goto_0

    :cond_1
    if-nez v3, :cond_4

    :goto_0
    instance-of v3, v1, Li2/p;

    if-eqz v3, :cond_3

    move-object v3, v1

    check-cast v3, Li2/p;

    iget v3, v3, Li2/p;->c:I

    if-ne v3, v4, :cond_2

    goto :goto_1

    :cond_2
    if-ne v3, v9, :cond_4

    goto :goto_1

    :cond_3
    if-nez v1, :cond_4

    :goto_1
    move v3, v6

    goto :goto_2

    :cond_4
    const/4 v3, 0x0

    :goto_2
    iget-boolean v8, v0, Lo2/d0;->d:Z

    iget-object v9, v0, Lo2/d0;->e:Lio/sentry/android/core/internal/util/g;

    if-nez v8, :cond_6

    iget-wide v10, v0, Lo2/d0;->j:J

    invoke-interface/range {p1 .. p1}, Lk2/e;->d()J

    move-result-wide v12

    invoke-static {v10, v11, v12, v13}, Lh2/e;->b(JJ)Z

    move-result v8

    if-eqz v8, :cond_6

    iget-object v8, v9, Lio/sentry/android/core/internal/util/g;->c:Ljava/lang/Object;

    check-cast v8, Li2/g;

    if-eqz v8, :cond_5

    invoke-virtual {v8}, Li2/g;->a()I

    move-result v8

    goto :goto_3

    :cond_5
    const/4 v8, 0x0

    :goto_3
    if-ne v3, v8, :cond_6

    goto/16 :goto_7

    :cond_6
    if-ne v3, v6, :cond_8

    iget-wide v10, v2, Lo2/b;->e:J

    sget v2, Lo2/f0;->a:I

    invoke-static {v10, v11}, Li2/x;->e(J)F

    move-result v2

    const/high16 v6, 0x3f800000    # 1.0f

    cmpg-float v2, v2, v6

    if-nez v2, :cond_7

    goto :goto_4

    :cond_7
    invoke-static {v6, v10, v11}, Li2/x;->c(FJ)J

    move-result-wide v10

    :goto_4
    new-instance v2, Li2/p;

    invoke-direct {v2, v10, v11, v4}, Li2/p;-><init>(JI)V

    goto :goto_5

    :cond_8
    const/4 v2, 0x0

    :goto_5
    iput-object v2, v0, Lo2/d0;->h:Li2/p;

    invoke-interface/range {p1 .. p1}, Lk2/e;->d()J

    move-result-wide v10

    const/16 v2, 0x20

    shr-long/2addr v10, v2

    long-to-int v4, v10

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    iget-object v6, v0, Lo2/d0;->i:Lp1/k1;

    invoke-virtual {v6}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lh2/e;

    iget-wide v10, v8, Lh2/e;->a:J

    shr-long/2addr v10, v2

    long-to-int v8, v10

    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    div-float/2addr v4, v8

    iput v4, v0, Lo2/d0;->k:F

    invoke-interface/range {p1 .. p1}, Lk2/e;->d()J

    move-result-wide v10

    const-wide v12, 0xffffffffL

    and-long/2addr v10, v12

    long-to-int v4, v10

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    invoke-virtual {v6}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lh2/e;

    iget-wide v10, v6, Lh2/e;->a:J

    and-long/2addr v10, v12

    long-to-int v6, v10

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    div-float/2addr v4, v6

    iput v4, v0, Lo2/d0;->l:F

    invoke-interface/range {p1 .. p1}, Lk2/e;->d()J

    move-result-wide v10

    shr-long/2addr v10, v2

    long-to-int v4, v10

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    float-to-double v10, v4

    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v10

    double-to-float v4, v10

    float-to-int v4, v4

    invoke-interface/range {p1 .. p1}, Lk2/e;->d()J

    move-result-wide v10

    and-long/2addr v10, v12

    long-to-int v6, v10

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    float-to-double v10, v6

    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v10

    double-to-float v6, v10

    float-to-int v6, v6

    int-to-long v10, v4

    shl-long/2addr v10, v2

    int-to-long v14, v6

    and-long/2addr v14, v12

    or-long/2addr v10, v14

    invoke-interface/range {p1 .. p1}, Lk2/e;->getLayoutDirection()Ly3/m;

    move-result-object v4

    iget-object v6, v9, Lio/sentry/android/core/internal/util/g;->c:Ljava/lang/Object;

    check-cast v6, Li2/g;

    iget-object v8, v9, Lio/sentry/android/core/internal/util/g;->d:Ljava/lang/Object;

    check-cast v8, Li2/c;

    if-eqz v6, :cond_9

    if-eqz v8, :cond_9

    shr-long v14, v10, v2

    long-to-int v14, v14

    iget-object v15, v6, Li2/g;->a:Landroid/graphics/Bitmap;

    move/from16 v16, v2

    invoke-virtual {v15}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    move-wide/from16 v17, v12

    if-gt v14, v2, :cond_a

    and-long v12, v10, v17

    long-to-int v2, v12

    invoke-virtual {v15}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v12

    if-gt v2, v12, :cond_a

    iget v2, v9, Lio/sentry/android/core/internal/util/g;->b:I

    if-ne v2, v3, :cond_a

    goto :goto_6

    :cond_9
    move/from16 v16, v2

    move-wide/from16 v17, v12

    :cond_a
    shr-long v12, v10, v16

    long-to-int v2, v12

    and-long v12, v10, v17

    long-to-int v6, v12

    invoke-static {v2, v6, v3}, Li2/w0;->h(III)Li2/g;

    move-result-object v6

    invoke-static {v6}, Li2/w0;->a(Li2/g;)Li2/c;

    move-result-object v8

    iput-object v6, v9, Lio/sentry/android/core/internal/util/g;->c:Ljava/lang/Object;

    iput-object v8, v9, Lio/sentry/android/core/internal/util/g;->d:Ljava/lang/Object;

    iput v3, v9, Lio/sentry/android/core/internal/util/g;->b:I

    :goto_6
    iput-wide v10, v9, Lio/sentry/android/core/internal/util/g;->a:J

    iget-object v2, v9, Lio/sentry/android/core/internal/util/g;->e:Ljava/lang/Object;

    move-object v12, v2

    check-cast v12, Lk2/b;

    invoke-static {v10, v11}, Lv63/b;->l(J)J

    move-result-wide v2

    iget-object v10, v12, Lk2/b;->w:Lk2/a;

    iget-object v11, v10, Lk2/a;->a:Ly3/c;

    iget-object v13, v10, Lk2/a;->b:Ly3/m;

    iget-object v14, v10, Lk2/a;->c:Li2/v;

    move-object/from16 v23, v8

    iget-wide v7, v10, Lk2/a;->d:J

    move-object/from16 v15, p1

    iput-object v15, v10, Lk2/a;->a:Ly3/c;

    iput-object v4, v10, Lk2/a;->b:Ly3/m;

    move-object/from16 v4, v23

    iput-object v4, v10, Lk2/a;->c:Li2/v;

    iput-wide v2, v10, Lk2/a;->d:J

    invoke-virtual {v4}, Li2/c;->q()V

    move-object v2, v13

    move-object v3, v14

    sget-wide v13, Li2/x;->b:J

    const/16 v21, 0x0

    const/16 v22, 0x3e

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v12 .. v22}, Lk2/e;->i0(Lk2/e;JJJFLi2/y;II)V

    iget-object v10, v0, Lo2/d0;->m:Lo2/c0;

    invoke-virtual {v10, v12}, Lo2/c0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4}, Li2/c;->g()V

    iget-object v4, v12, Lk2/b;->w:Lk2/a;

    iput-object v11, v4, Lk2/a;->a:Ly3/c;

    iput-object v2, v4, Lk2/a;->b:Ly3/m;

    iput-object v3, v4, Lk2/a;->c:Li2/v;

    iput-wide v7, v4, Lk2/a;->d:J

    iget-object v2, v6, Li2/g;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->prepareToDraw()V

    const/4 v2, 0x0

    iput-boolean v2, v0, Lo2/d0;->d:Z

    invoke-interface/range {p1 .. p1}, Lk2/e;->d()J

    move-result-wide v2

    iput-wide v2, v0, Lo2/d0;->j:J

    :goto_7
    if-eqz v1, :cond_b

    :goto_8
    move-object/from16 v31, v1

    goto :goto_9

    :cond_b
    invoke-virtual {v5}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li2/y;

    if-eqz v1, :cond_c

    invoke-virtual {v5}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li2/y;

    goto :goto_8

    :cond_c
    iget-object v1, v0, Lo2/d0;->h:Li2/p;

    goto :goto_8

    :goto_9
    iget-object v1, v9, Lio/sentry/android/core/internal/util/g;->c:Ljava/lang/Object;

    move-object/from16 v25, v1

    check-cast v25, Li2/g;

    if-eqz v25, :cond_d

    goto :goto_a

    :cond_d
    const-string v1, "drawCachedImage must be invoked first before attempting to draw the result into another destination"

    invoke-static {v1}, Lx2/a;->b(Ljava/lang/String;)V

    :goto_a
    iget-wide v1, v9, Lio/sentry/android/core/internal/util/g;->a:J

    const/16 v32, 0x0

    const/16 v33, 0x35a

    const-wide/16 v28, 0x0

    move-object/from16 v24, p1

    move/from16 v30, p2

    move-wide/from16 v26, v1

    invoke-static/range {v24 .. v33}, Lk2/e;->K0(Lk2/e;Li2/g;JJFLi2/y;II)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Params: \tname: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lo2/d0;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n\tviewportWidth: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lo2/d0;->i:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh2/e;

    iget-wide v2, v2, Lh2/e;->a:J

    const/16 v4, 0x20

    shr-long/2addr v2, v4

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, "\n\tviewportHeight: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh2/e;

    iget-wide v1, v1, Lh2/e;->a:J

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
