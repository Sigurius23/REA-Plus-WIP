.class public final Ls9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr9/m;
.implements Ls9/a;


# instance fields
.field public final E:Llo/w;

.field public final F:Llo/w;

.field public final G:[F

.field public final H:[F

.field public I:I

.field public J:Landroid/graphics/SurfaceTexture;

.field public volatile K:I

.field public L:I

.field public M:[B

.field public final w:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final x:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final y:Ls9/g;

.field public final z:Lb9/b;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ls9/h;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Ls9/h;->x:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ls9/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ls9/h;->y:Ls9/g;

    new-instance v0, Lb9/b;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lb9/b;-><init>(I)V

    iput-object v0, p0, Ls9/h;->z:Lb9/b;

    new-instance v0, Llo/w;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Llo/w;-><init>(I)V

    iput-object v0, p0, Ls9/h;->E:Llo/w;

    new-instance v0, Llo/w;

    invoke-direct {v0, v1}, Llo/w;-><init>(I)V

    iput-object v0, p0, Ls9/h;->F:Llo/w;

    const/16 v0, 0x10

    new-array v1, v0, [F

    iput-object v1, p0, Ls9/h;->G:[F

    new-array v0, v0, [F

    iput-object v0, p0, Ls9/h;->H:[F

    const/4 v0, 0x0

    iput v0, p0, Ls9/h;->K:I

    const/4 v0, -0x1

    iput v0, p0, Ls9/h;->L:I

    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/SurfaceTexture;
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v1, 0x3f000000    # 0.5f

    :try_start_0
    invoke-static {v1, v1, v1, v0}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    invoke-static {}, Lx8/a;->c()V

    iget-object v0, p0, Ls9/h;->y:Ls9/g;

    invoke-virtual {v0}, Ls9/g;->a()V

    invoke-static {}, Lx8/a;->c()V

    const/4 v0, 0x1

    new-array v1, v0, [I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    invoke-static {}, Lx8/a;->c()V

    aget v0, v1, v2

    const v1, 0x8d65

    invoke-static {v1, v0}, Lx8/a;->b(II)V

    iput v0, p0, Ls9/h;->I:I
    :try_end_0
    .catch Landroidx/media3/common/util/GlUtil$GlException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "SceneRenderer"

    const-string v2, "Failed to initialize the renderer"

    invoke-static {v1, v2, v0}, Lx8/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    new-instance v0, Landroid/graphics/SurfaceTexture;

    iget v1, p0, Ls9/h;->I:I

    invoke-direct {v0, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    iput-object v0, p0, Ls9/h;->J:Landroid/graphics/SurfaceTexture;

    new-instance v1, Lno/j;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lno/j;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    iget-object v0, p0, Ls9/h;->J:Landroid/graphics/SurfaceTexture;

    return-object v0
.end method

.method public final b(J[F)V
    .locals 1

    iget-object v0, p0, Ls9/h;->z:Lb9/b;

    iget-object v0, v0, Lb9/b;->E:Ljava/lang/Object;

    check-cast v0, Llo/w;

    invoke-virtual {v0, p1, p2, p3}, Llo/w;->a(JLjava/lang/Object;)V

    return-void
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Ls9/h;->E:Llo/w;

    invoke-virtual {v0}, Llo/w;->b()V

    iget-object v0, p0, Ls9/h;->z:Lb9/b;

    iget-object v1, v0, Lb9/b;->E:Ljava/lang/Object;

    check-cast v1, Llo/w;

    invoke-virtual {v1}, Llo/w;->b()V

    const/4 v1, 0x0

    iput-boolean v1, v0, Lb9/b;->x:Z

    iget-object v0, p0, Ls9/h;->x:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public final d(JJLu8/p;Landroid/media/MediaFormat;)V
    .locals 35

    move-object/from16 v0, p0

    move-wide/from16 v1, p3

    move-object/from16 v3, p5

    iget-object v4, v0, Ls9/h;->E:Llo/w;

    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v4, v1, v2, v5}, Llo/w;->a(JLjava/lang/Object;)V

    iget-object v4, v3, Lu8/p;->z:[B

    iget v3, v3, Lu8/p;->A:I

    iget-object v5, v0, Ls9/h;->M:[B

    iget v6, v0, Ls9/h;->L:I

    iput-object v4, v0, Ls9/h;->M:[B

    const/4 v4, -0x1

    if-ne v3, v4, :cond_0

    iget v3, v0, Ls9/h;->K:I

    :cond_0
    iput v3, v0, Ls9/h;->L:I

    if-ne v6, v3, :cond_1

    iget-object v3, v0, Ls9/h;->M:[B

    invoke-static {v5, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v3

    if-eqz v3, :cond_1

    return-void

    :cond_1
    iget-object v3, v0, Ls9/h;->M:[B

    const/4 v4, 0x2

    const/4 v6, 0x0

    const/4 v9, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_a

    iget v7, v0, Ls9/h;->L:I

    new-instance v8, Lx8/n;

    invoke-direct {v8, v3}, Lx8/n;-><init>([B)V

    const/4 v3, 0x4

    :try_start_0
    invoke-virtual {v8, v3}, Lx8/n;->G(I)V

    invoke-virtual {v8}, Lx8/n;->g()I

    move-result v3

    invoke-virtual {v8, v6}, Lx8/n;->F(I)V

    const v10, 0x70726f6a

    if-ne v3, v10, :cond_5

    const/16 v3, 0x8

    invoke-virtual {v8, v3}, Lx8/n;->G(I)V

    iget v3, v8, Lx8/n;->b:I

    iget v10, v8, Lx8/n;->c:I

    :goto_0
    if-ge v3, v10, :cond_6

    invoke-virtual {v8}, Lx8/n;->g()I

    move-result v11

    add-int/2addr v11, v3

    if-le v11, v3, :cond_6

    if-le v11, v10, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v8}, Lx8/n;->g()I

    move-result v3

    const v12, 0x79746d70

    if-eq v3, v12, :cond_4

    const v12, 0x6d736870

    if-ne v3, v12, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v8, v11}, Lx8/n;->F(I)V

    move v3, v11

    goto :goto_0

    :cond_4
    :goto_1
    invoke-virtual {v8, v11}, Lx8/n;->E(I)V

    invoke-static {v8}, Ls9/f;->x(Lx8/n;)Ljava/util/ArrayList;

    move-result-object v3

    goto :goto_3

    :cond_5
    invoke-static {v8}, Ls9/f;->x(Lx8/n;)Ljava/util/ArrayList;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    :cond_6
    :goto_2
    move-object v3, v5

    :goto_3
    if-nez v3, :cond_7

    goto :goto_4

    :cond_7
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-eq v8, v9, :cond_9

    if-eq v8, v4, :cond_8

    goto :goto_4

    :cond_8
    new-instance v5, Ls9/e;

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ls9/d;

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls9/d;

    invoke-direct {v5, v8, v3, v7}, Ls9/e;-><init>(Ls9/d;Ls9/d;I)V

    goto :goto_4

    :cond_9
    new-instance v5, Ls9/e;

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls9/d;

    invoke-direct {v5, v3, v3, v7}, Ls9/e;-><init>(Ls9/d;Ls9/d;I)V

    :cond_a
    :goto_4
    if-eqz v5, :cond_b

    invoke-static {v5}, Ls9/g;->b(Ls9/e;)Z

    move-result v3

    if-eqz v3, :cond_b

    goto/16 :goto_d

    :cond_b
    iget v3, v0, Ls9/h;->L:I

    const/high16 v5, 0x43340000    # 180.0f

    float-to-double v7, v5

    invoke-static {v7, v8}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v7

    double-to-float v5, v7

    const/high16 v7, 0x43b40000    # 360.0f

    float-to-double v7, v7

    invoke-static {v7, v8}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v7

    double-to-float v7, v7

    const/16 v8, 0x24

    int-to-float v10, v8

    div-float v10, v5, v10

    const/16 v11, 0x48

    int-to-float v12, v11

    div-float v12, v7, v12

    const/16 v13, 0x3e70

    new-array v13, v13, [F

    const/16 v14, 0x29a0

    new-array v14, v14, [F

    move v15, v6

    move/from16 v16, v15

    move/from16 v17, v16

    :goto_5
    if-ge v15, v8, :cond_12

    int-to-float v6, v15

    mul-float/2addr v6, v10

    const/high16 v18, 0x40000000    # 2.0f

    div-float v19, v5, v18

    sub-float v6, v6, v19

    add-int/lit8 v8, v15, 0x1

    int-to-float v9, v8

    mul-float/2addr v9, v10

    sub-float v9, v9, v19

    const/4 v11, 0x0

    :goto_6
    const/16 v4, 0x49

    if-ge v11, v4, :cond_11

    move/from16 v20, v5

    move/from16 v21, v6

    move/from16 v22, v7

    move/from16 v4, v16

    move/from16 v5, v17

    const/4 v6, 0x0

    const/4 v7, 0x2

    :goto_7
    if-ge v6, v7, :cond_10

    if-nez v6, :cond_c

    move/from16 v7, v21

    :goto_8
    move/from16 v23, v8

    goto :goto_9

    :cond_c
    move v7, v9

    goto :goto_8

    :goto_9
    int-to-float v8, v11

    mul-float/2addr v8, v12

    const v16, 0x40490fdb    # (float)Math.PI

    add-float v16, v8, v16

    div-float v17, v22, v18

    move/from16 v24, v8

    sub-float v8, v16, v17

    add-int/lit8 v16, v4, 0x1

    move/from16 v25, v9

    const/high16 v9, 0x42480000    # 50.0f

    move/from16 v26, v10

    float-to-double v9, v9

    move-wide/from16 v27, v9

    float-to-double v8, v8

    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    move-result-wide v29

    mul-double v29, v29, v27

    move-wide/from16 v31, v8

    float-to-double v7, v7

    invoke-static {v7, v8}, Ljava/lang/Math;->cos(D)D

    move-result-wide v9

    mul-double v9, v9, v29

    double-to-float v9, v9

    neg-float v9, v9

    aput v9, v13, v4

    add-int/lit8 v9, v4, 0x2

    invoke-static {v7, v8}, Ljava/lang/Math;->sin(D)D

    move-result-wide v29

    move-wide/from16 v33, v7

    mul-double v7, v29, v27

    double-to-float v7, v7

    aput v7, v13, v16

    add-int/lit8 v7, v4, 0x3

    invoke-static/range {v31 .. v32}, Ljava/lang/Math;->cos(D)D

    move-result-wide v16

    mul-double v16, v16, v27

    invoke-static/range {v33 .. v34}, Ljava/lang/Math;->cos(D)D

    move-result-wide v27

    move v10, v9

    mul-double v8, v27, v16

    double-to-float v8, v8

    aput v8, v13, v10

    add-int/lit8 v8, v5, 0x1

    div-float v9, v24, v22

    aput v9, v14, v5

    add-int/lit8 v9, v5, 0x2

    add-int v10, v15, v6

    int-to-float v10, v10

    mul-float v10, v10, v26

    div-float v10, v10, v20

    aput v10, v14, v8

    if-nez v11, :cond_d

    if-eqz v6, :cond_e

    :cond_d
    const/16 v8, 0x48

    goto :goto_a

    :cond_e
    const/4 v10, 0x1

    goto :goto_b

    :goto_a
    const/4 v10, 0x1

    if-ne v11, v8, :cond_f

    if-ne v6, v10, :cond_f

    :goto_b
    const/4 v8, 0x3

    invoke-static {v13, v4, v13, v7, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v4, v4, 0x6

    const/4 v8, 0x2

    invoke-static {v14, v5, v14, v9, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v5, v5, 0x4

    goto :goto_c

    :cond_f
    const/4 v8, 0x2

    move v4, v7

    move v5, v9

    :goto_c
    add-int/lit8 v6, v6, 0x1

    move v7, v8

    move/from16 v8, v23

    move/from16 v9, v25

    move/from16 v10, v26

    goto/16 :goto_7

    :cond_10
    move/from16 v23, v8

    move/from16 v25, v9

    move/from16 v26, v10

    const/4 v10, 0x1

    move v8, v7

    add-int/lit8 v11, v11, 0x1

    move/from16 v16, v4

    move/from16 v17, v5

    move/from16 v5, v20

    move/from16 v6, v21

    move/from16 v7, v22

    move/from16 v8, v23

    move/from16 v10, v26

    goto/16 :goto_6

    :cond_11
    move/from16 v23, v8

    move/from16 v15, v23

    const/4 v4, 0x2

    const/4 v6, 0x0

    const/16 v8, 0x24

    const/4 v9, 0x1

    const/16 v11, 0x48

    goto/16 :goto_5

    :cond_12
    move v10, v9

    new-instance v5, Lno/f;

    const/4 v10, 0x1

    move-object v7, v13

    move-object v8, v14

    const/4 v6, 0x0

    invoke-direct/range {v5 .. v10}, Lno/f;-><init>(I[F[FII)V

    new-instance v4, Ls9/e;

    new-instance v6, Ls9/d;

    filled-new-array {v5}, [Lno/f;

    move-result-object v5

    invoke-direct {v6, v5}, Ls9/d;-><init>([Lno/f;)V

    invoke-direct {v4, v6, v6, v3}, Ls9/e;-><init>(Ls9/d;Ls9/d;I)V

    move-object v5, v4

    :goto_d
    iget-object v3, v0, Ls9/h;->F:Llo/w;

    invoke-virtual {v3, v1, v2, v5}, Llo/w;->a(JLjava/lang/Object;)V

    return-void
.end method
