.class public final Lno/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/opengl/GLSurfaceView$Renderer;
.implements Lno/c;
.implements Ls9/c;


# instance fields
.field public final E:[F

.field public final F:[F

.field public G:F

.field public H:F

.field public final I:[F

.field public final J:[F

.field public final K:Ljava/lang/Object;

.field public final synthetic L:Landroid/opengl/GLSurfaceView;

.field public final synthetic w:I

.field public final x:[F

.field public final y:[F

.field public final z:[F


# direct methods
.method public constructor <init>(Lno/m;Lno/k;)V
    .locals 4

    const/4 v0, 0x0

    iput v0, p0, Lno/l;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/l;->L:Landroid/opengl/GLSurfaceView;

    const/16 p1, 0x10

    .line 2
    new-array v0, p1, [F

    iput-object v0, p0, Lno/l;->x:[F

    .line 3
    new-array v0, p1, [F

    iput-object v0, p0, Lno/l;->y:[F

    .line 4
    new-array v0, p1, [F

    iput-object v0, p0, Lno/l;->z:[F

    .line 5
    new-array v1, p1, [F

    iput-object v1, p0, Lno/l;->E:[F

    .line 6
    new-array v2, p1, [F

    iput-object v2, p0, Lno/l;->F:[F

    .line 7
    new-array v3, p1, [F

    iput-object v3, p0, Lno/l;->I:[F

    .line 8
    new-array p1, p1, [F

    iput-object p1, p0, Lno/l;->J:[F

    .line 9
    iput-object p2, p0, Lno/l;->K:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 10
    invoke-static {v0, p1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 11
    invoke-static {v1, p1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 12
    invoke-static {v2, p1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    const p1, 0x40490fdb    # (float)Math.PI

    .line 13
    iput p1, p0, Lno/l;->H:F

    return-void
.end method

.method public constructor <init>(Ls9/i;Ls9/h;)V
    .locals 4

    const/4 v0, 0x1

    iput v0, p0, Lno/l;->w:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/l;->L:Landroid/opengl/GLSurfaceView;

    const/16 p1, 0x10

    .line 15
    new-array v0, p1, [F

    iput-object v0, p0, Lno/l;->x:[F

    .line 16
    new-array v0, p1, [F

    iput-object v0, p0, Lno/l;->y:[F

    .line 17
    new-array v0, p1, [F

    iput-object v0, p0, Lno/l;->z:[F

    .line 18
    new-array v1, p1, [F

    iput-object v1, p0, Lno/l;->E:[F

    .line 19
    new-array v2, p1, [F

    iput-object v2, p0, Lno/l;->F:[F

    .line 20
    new-array v3, p1, [F

    iput-object v3, p0, Lno/l;->I:[F

    .line 21
    new-array p1, p1, [F

    iput-object p1, p0, Lno/l;->J:[F

    .line 22
    iput-object p2, p0, Lno/l;->K:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 23
    invoke-static {v0, p1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 24
    invoke-static {v1, p1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 25
    invoke-static {v2, p1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    const p1, 0x40490fdb    # (float)Math.PI

    .line 26
    iput p1, p0, Lno/l;->H:F

    return-void
.end method

.method private final b(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 22

    move-object/from16 v1, p0

    monitor-enter p0

    :try_start_0
    iget-object v2, v1, Lno/l;->J:[F

    iget-object v4, v1, Lno/l;->z:[F

    iget-object v6, v1, Lno/l;->F:[F

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    iget-object v8, v1, Lno/l;->I:[F

    iget-object v10, v1, Lno/l;->E:[F

    iget-object v12, v1, Lno/l;->J:[F

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    iget-object v2, v1, Lno/l;->y:[F

    iget-object v4, v1, Lno/l;->x:[F

    iget-object v6, v1, Lno/l;->I:[F

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    iget-object v0, v1, Lno/l;->K:Ljava/lang/Object;

    check-cast v0, Lno/k;

    iget-object v4, v1, Lno/l;->y:[F

    const/16 v2, 0x4000

    invoke-static {v2}, Landroid/opengl/GLES20;->glClear(I)V

    invoke-static {}, Llo/a;->g()V

    iget-object v2, v0, Lno/k;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-virtual {v2, v8, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v2

    const/4 v10, 0x2

    if-eqz v2, :cond_7

    iget-object v2, v0, Lno/k;->J:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Landroid/graphics/SurfaceTexture;->updateTexImage()V

    invoke-static {}, Llo/a;->g()V

    iget-object v2, v0, Lno/k;->x:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v8, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v0, Lno/k;->G:[F

    invoke-static {v2, v9}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    :cond_0
    iget-object v2, v0, Lno/k;->J:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v2}, Landroid/graphics/SurfaceTexture;->getTimestamp()J

    move-result-wide v2

    iget-object v5, v0, Lno/k;->E:Llo/w;

    monitor-enter v5

    :try_start_1
    invoke-virtual {v5, v2, v3, v9}, Llo/w;->d(JZ)Ljava/lang/Object;

    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    monitor-exit v5

    check-cast v6, Ljava/lang/Long;

    if-eqz v6, :cond_4

    iget-object v5, v0, Lno/k;->z:Lb9/b;

    iget-object v11, v0, Lno/k;->G:[F

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    iget-object v12, v5, Lb9/b;->E:Ljava/lang/Object;

    check-cast v12, Llo/w;

    monitor-enter v12

    :try_start_2
    invoke-virtual {v12, v6, v7, v8}, Llo/w;->d(JZ)Ljava/lang/Object;

    move-result-object v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v12

    check-cast v6, [F

    if-nez v6, :cond_1

    goto :goto_1

    :cond_1
    iget-object v7, v5, Lb9/b;->z:Ljava/lang/Object;

    move-object v12, v7

    check-cast v12, [F

    aget v7, v6, v9

    aget v13, v6, v8

    neg-float v13, v13

    aget v6, v6, v10

    neg-float v6, v6

    invoke-static {v7, v13, v6}, Landroid/opengl/Matrix;->length(FFF)F

    move-result v14

    const/4 v15, 0x0

    cmpl-float v15, v14, v15

    if-eqz v15, :cond_2

    move-object/from16 v18, v11

    float-to-double v10, v14

    invoke-static {v10, v11}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v10

    double-to-float v10, v10

    div-float v15, v7, v14

    div-float v16, v13, v14

    div-float v17, v6, v14

    const/4 v13, 0x0

    move v14, v10

    invoke-static/range {v12 .. v17}, Landroid/opengl/Matrix;->setRotateM([FIFFFF)V

    goto :goto_0

    :cond_2
    move-object/from16 v18, v11

    invoke-static {v12, v9}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    :goto_0
    iget-boolean v6, v5, Lb9/b;->x:Z

    if-nez v6, :cond_3

    iget-object v6, v5, Lb9/b;->y:Ljava/lang/Object;

    check-cast v6, [F

    iget-object v7, v5, Lb9/b;->z:Ljava/lang/Object;

    check-cast v7, [F

    invoke-static {v6, v7}, Lb9/b;->g([F[F)V

    iput-boolean v8, v5, Lb9/b;->x:Z

    :cond_3
    iget-object v6, v5, Lb9/b;->y:Ljava/lang/Object;

    move-object v13, v6

    check-cast v13, [F

    iget-object v5, v5, Lb9/b;->z:Ljava/lang/Object;

    move-object v15, v5

    check-cast v15, [F

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    move-object/from16 v11, v18

    invoke-static/range {v11 .. v16}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v12
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :cond_4
    :goto_1
    iget-object v6, v0, Lno/k;->F:Llo/w;

    monitor-enter v6

    :try_start_4
    invoke-virtual {v6, v2, v3, v8}, Llo/w;->d(JZ)Ljava/lang/Object;

    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit v6

    check-cast v2, Lno/g;

    if-eqz v2, :cond_7

    iget-object v3, v0, Lno/k;->y:Lno/i;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lno/i;->a(Lno/g;)Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_2

    :cond_5
    iget v5, v2, Lno/g;->c:I

    iput v5, v3, Lno/i;->a:I

    new-instance v5, Lno/h;

    iget-object v6, v2, Lno/g;->a:Lno/e;

    iget-object v6, v6, Lno/e;->a:[Lno/f;

    aget-object v6, v6, v9

    invoke-direct {v5, v6}, Lno/h;-><init>(Lno/f;)V

    iput-object v5, v3, Lno/i;->b:Lno/h;

    iget-boolean v3, v2, Lno/g;->d:Z

    if-eqz v3, :cond_6

    goto :goto_2

    :cond_6
    iget-object v2, v2, Lno/g;->b:Lno/e;

    iget-object v2, v2, Lno/e;->a:[Lno/f;

    aget-object v2, v2, v9

    iget-object v3, v2, Lno/f;->c:[F

    array-length v5, v3

    invoke-static {v3}, Llo/a;->m([F)Ljava/nio/FloatBuffer;

    iget-object v2, v2, Lno/f;->d:[F

    invoke-static {v2}, Llo/a;->m([F)Ljava/nio/FloatBuffer;

    goto :goto_2

    :catchall_1
    move-exception v0

    :try_start_5
    monitor-exit v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v0

    :catchall_2
    move-exception v0

    :try_start_6
    monitor-exit v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw v0

    :cond_7
    :goto_2
    iget-object v2, v0, Lno/k;->H:[F

    iget-object v6, v0, Lno/k;->G:[F

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    iget-object v2, v0, Lno/k;->y:Lno/i;

    iget v3, v0, Lno/k;->I:I

    iget-object v0, v0, Lno/k;->H:[F

    iget-object v4, v2, Lno/i;->b:Lno/h;

    if-nez v4, :cond_8

    return-void

    :cond_8
    iget v5, v2, Lno/i;->a:I

    if-ne v5, v8, :cond_9

    sget-object v5, Lno/i;->j:[F

    goto :goto_3

    :cond_9
    const/4 v6, 0x2

    if-ne v5, v6, :cond_a

    sget-object v5, Lno/i;->k:[F

    goto :goto_3

    :cond_a
    sget-object v5, Lno/i;->i:[F

    :goto_3
    iget v6, v2, Lno/i;->e:I

    invoke-static {v6, v8, v9, v5, v9}, Landroid/opengl/GLES20;->glUniformMatrix3fv(IIZ[FI)V

    iget v5, v2, Lno/i;->d:I

    invoke-static {v5, v8, v9, v0, v9}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    const v0, 0x84c0

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    const v0, 0x8d65

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glBindTexture(II)V

    iget v0, v2, Lno/i;->h:I

    invoke-static {v0, v9}, Landroid/opengl/GLES20;->glUniform1i(II)V

    invoke-static {}, Llo/a;->g()V

    iget v10, v2, Lno/i;->f:I

    const/16 v14, 0xc

    iget-object v15, v4, Lno/h;->b:Ljava/nio/FloatBuffer;

    const/4 v11, 0x3

    const/16 v12, 0x1406

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    invoke-static {}, Llo/a;->g()V

    iget v0, v2, Lno/i;->g:I

    const/16 v20, 0x8

    iget-object v2, v4, Lno/h;->c:Ljava/nio/FloatBuffer;

    const/16 v17, 0x2

    const/16 v18, 0x1406

    const/16 v19, 0x0

    move/from16 v16, v0

    move-object/from16 v21, v2

    invoke-static/range {v16 .. v21}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    invoke-static {}, Llo/a;->g()V

    iget v0, v4, Lno/h;->d:I

    iget v2, v4, Lno/h;->a:I

    invoke-static {v0, v9, v2}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    invoke-static {}, Llo/a;->g()V

    return-void

    :catchall_3
    move-exception v0

    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw v0
.end method


# virtual methods
.method public final declared-synchronized a([FF)V
    .locals 6

    iget v0, p0, Lno/l;->w:I

    monitor-enter p0

    packed-switch v0, :pswitch_data_0

    :try_start_0
    iget-object v0, p0, Lno/l;->z:[F

    array-length v1, v0

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    neg-float p1, p2

    iput p1, p0, Lno/l;->H:F

    iget-object v0, p0, Lno/l;->E:[F

    iget p2, p0, Lno/l;->G:F

    neg-float v2, p2

    float-to-double p1, p1

    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    move-result-wide p1

    double-to-float v3, p1

    iget p1, p0, Lno/l;->H:F

    float-to-double p1, p1

    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    move-result-wide p1

    double-to-float v4, p1

    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->setRotateM([FIFFFF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :pswitch_0
    :try_start_2
    iget-object v0, p0, Lno/l;->z:[F

    array-length v1, v0

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    neg-float p1, p2

    iput p1, p0, Lno/l;->H:F

    iget-object v0, p0, Lno/l;->E:[F

    iget p2, p0, Lno/l;->G:F

    neg-float v2, p2

    float-to-double p1, p1

    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    move-result-wide p1

    double-to-float v3, p1

    iget p1, p0, Lno/l;->H:F

    float-to-double p1, p1

    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    move-result-wide p1

    double-to-float v4, p1

    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->setRotateM([FIFFFF)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p0

    return-void

    :catchall_1
    move-exception v0

    move-object p1, v0

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 20

    move-object/from16 v1, p0

    iget v0, v1, Lno/l;->w:I

    packed-switch v0, :pswitch_data_0

    monitor-enter p0

    :try_start_0
    iget-object v2, v1, Lno/l;->J:[F

    iget-object v4, v1, Lno/l;->z:[F

    iget-object v6, v1, Lno/l;->F:[F

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    iget-object v8, v1, Lno/l;->I:[F

    iget-object v10, v1, Lno/l;->E:[F

    iget-object v12, v1, Lno/l;->J:[F

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object v2, v1, Lno/l;->y:[F

    iget-object v4, v1, Lno/l;->x:[F

    iget-object v6, v1, Lno/l;->I:[F

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    iget-object v0, v1, Lno/l;->K:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ls9/h;

    iget-object v5, v1, Lno/l;->y:[F

    const/16 v0, 0x4000

    invoke-static {v0}, Landroid/opengl/GLES20;->glClear(I)V

    :try_start_1
    invoke-static {}, Lx8/a;->c()V
    :try_end_1
    .catch Landroidx/media3/common/util/GlUtil$GlException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v3, "SceneRenderer"

    const-string v4, "Failed to draw a frame"

    invoke-static {v3, v4, v0}, Lx8/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    iget-object v0, v2, Ls9/h;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v9, 0x1

    const/4 v10, 0x0

    invoke-virtual {v0, v9, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    const/4 v11, 0x2

    if-eqz v0, :cond_7

    iget-object v0, v2, Ls9/h;->J:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->updateTexImage()V

    :try_start_2
    invoke-static {}, Lx8/a;->c()V
    :try_end_2
    .catch Landroidx/media3/common/util/GlUtil$GlException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    const-string v3, "SceneRenderer"

    const-string v4, "Failed to draw a frame"

    invoke-static {v3, v4, v0}, Lx8/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    iget-object v0, v2, Ls9/h;->x:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v9, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v2, Ls9/h;->G:[F

    invoke-static {v0, v10}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    :cond_0
    iget-object v0, v2, Ls9/h;->J:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->getTimestamp()J

    move-result-wide v3

    iget-object v6, v2, Ls9/h;->E:Llo/w;

    monitor-enter v6

    :try_start_3
    invoke-virtual {v6, v3, v4, v10}, Llo/w;->d(JZ)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v6

    check-cast v0, Ljava/lang/Long;

    if-eqz v0, :cond_4

    iget-object v6, v2, Ls9/h;->z:Lb9/b;

    iget-object v12, v2, Ls9/h;->G:[F

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    iget-object v0, v6, Lb9/b;->E:Ljava/lang/Object;

    check-cast v0, Llo/w;

    invoke-virtual {v0, v7, v8}, Llo/w;->f(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    if-nez v0, :cond_1

    goto :goto_3

    :cond_1
    iget-object v7, v6, Lb9/b;->z:Ljava/lang/Object;

    move-object v13, v7

    check-cast v13, [F

    aget v7, v0, v10

    aget v8, v0, v9

    neg-float v8, v8

    aget v0, v0, v11

    neg-float v0, v0

    invoke-static {v7, v8, v0}, Landroid/opengl/Matrix;->length(FFF)F

    move-result v14

    const/4 v15, 0x0

    cmpl-float v15, v14, v15

    if-eqz v15, :cond_2

    move-object/from16 v19, v12

    float-to-double v11, v14

    invoke-static {v11, v12}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v11

    double-to-float v15, v11

    div-float v16, v7, v14

    div-float v17, v8, v14

    div-float v18, v0, v14

    const/4 v14, 0x0

    invoke-static/range {v13 .. v18}, Landroid/opengl/Matrix;->setRotateM([FIFFFF)V

    goto :goto_2

    :cond_2
    move-object/from16 v19, v12

    invoke-static {v13, v10}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    :goto_2
    iget-boolean v0, v6, Lb9/b;->x:Z

    if-nez v0, :cond_3

    iget-object v0, v6, Lb9/b;->y:Ljava/lang/Object;

    check-cast v0, [F

    iget-object v7, v6, Lb9/b;->z:Ljava/lang/Object;

    check-cast v7, [F

    invoke-static {v0, v7}, Lb9/b;->h([F[F)V

    iput-boolean v9, v6, Lb9/b;->x:Z

    :cond_3
    iget-object v0, v6, Lb9/b;->y:Ljava/lang/Object;

    move-object v14, v0

    check-cast v14, [F

    iget-object v0, v6, Lb9/b;->z:Ljava/lang/Object;

    move-object/from16 v16, v0

    check-cast v16, [F

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    move-object/from16 v12, v19

    invoke-static/range {v12 .. v17}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    :cond_4
    :goto_3
    iget-object v0, v2, Ls9/h;->F:Llo/w;

    invoke-virtual {v0, v3, v4}, Llo/w;->f(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls9/e;

    if-eqz v0, :cond_7

    iget-object v3, v2, Ls9/h;->y:Ls9/g;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Ls9/g;->b(Ls9/e;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_4

    :cond_5
    iget v4, v0, Ls9/e;->c:I

    iput v4, v3, Ls9/g;->a:I

    new-instance v4, Lno/h;

    iget-object v6, v0, Ls9/e;->a:Ls9/d;

    iget-object v6, v6, Ls9/d;->a:[Lno/f;

    aget-object v6, v6, v10

    const/4 v7, 0x0

    invoke-direct {v4, v6, v7}, Lno/h;-><init>(Lno/f;Z)V

    iput-object v4, v3, Ls9/g;->b:Lno/h;

    iget-boolean v3, v0, Ls9/e;->d:Z

    if-eqz v3, :cond_6

    goto :goto_4

    :cond_6
    iget-object v0, v0, Ls9/e;->b:Ls9/d;

    iget-object v0, v0, Ls9/d;->a:[Lno/f;

    aget-object v0, v0, v10

    iget-object v3, v0, Lno/f;->c:[F

    array-length v4, v3

    invoke-static {v3}, Lx8/a;->e([F)Ljava/nio/FloatBuffer;

    iget-object v0, v0, Lno/f;->d:[F

    invoke-static {v0}, Lx8/a;->e([F)Ljava/nio/FloatBuffer;

    goto :goto_4

    :catchall_0
    move-exception v0

    :try_start_4
    monitor-exit v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0

    :cond_7
    :goto_4
    iget-object v3, v2, Ls9/h;->H:[F

    iget-object v7, v2, Ls9/h;->G:[F

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    iget-object v3, v2, Ls9/h;->y:Ls9/g;

    iget v0, v2, Ls9/h;->I:I

    iget-object v2, v2, Ls9/h;->H:[F

    const-string v4, "ProjectionRenderer"

    iget-object v5, v3, Ls9/g;->b:Lno/h;

    if-nez v5, :cond_8

    goto/16 :goto_9

    :cond_8
    iget v6, v3, Ls9/g;->a:I

    if-ne v6, v9, :cond_9

    sget-object v6, Ls9/g;->j:[F

    goto :goto_5

    :cond_9
    const/4 v7, 0x2

    if-ne v6, v7, :cond_a

    sget-object v6, Ls9/g;->k:[F

    goto :goto_5

    :cond_a
    sget-object v6, Ls9/g;->i:[F

    :goto_5
    iget v7, v3, Ls9/g;->e:I

    invoke-static {v7, v9, v10, v6, v10}, Landroid/opengl/GLES20;->glUniformMatrix3fv(IIZ[FI)V

    iget v6, v3, Ls9/g;->d:I

    invoke-static {v6, v9, v10, v2, v10}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    const v2, 0x84c0

    invoke-static {v2}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    const v2, 0x8d65

    invoke-static {v2, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    iget v0, v3, Ls9/g;->h:I

    invoke-static {v0, v10}, Landroid/opengl/GLES20;->glUniform1i(II)V

    :try_start_5
    invoke-static {}, Lx8/a;->c()V
    :try_end_5
    .catch Landroidx/media3/common/util/GlUtil$GlException; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_6

    :catch_2
    move-exception v0

    const-string v2, "Failed to bind uniforms"

    invoke-static {v4, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_6
    iget v11, v3, Ls9/g;->f:I

    const/16 v15, 0xc

    iget-object v0, v5, Lno/h;->b:Ljava/nio/FloatBuffer;

    const/4 v12, 0x3

    const/16 v13, 0x1406

    const/4 v14, 0x0

    move-object/from16 v16, v0

    invoke-static/range {v11 .. v16}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    :try_start_6
    invoke-static {}, Lx8/a;->c()V
    :try_end_6
    .catch Landroidx/media3/common/util/GlUtil$GlException; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_7

    :catch_3
    move-exception v0

    const-string v2, "Failed to load position data"

    invoke-static {v4, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_7
    iget v11, v3, Ls9/g;->g:I

    const/16 v15, 0x8

    iget-object v0, v5, Lno/h;->c:Ljava/nio/FloatBuffer;

    const/4 v12, 0x2

    const/16 v13, 0x1406

    const/4 v14, 0x0

    move-object/from16 v16, v0

    invoke-static/range {v11 .. v16}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    :try_start_7
    invoke-static {}, Lx8/a;->c()V
    :try_end_7
    .catch Landroidx/media3/common/util/GlUtil$GlException; {:try_start_7 .. :try_end_7} :catch_4

    goto :goto_8

    :catch_4
    move-exception v0

    const-string v2, "Failed to load texture data"

    invoke-static {v4, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_8
    iget v0, v5, Lno/h;->d:I

    iget v2, v5, Lno/h;->a:I

    invoke-static {v0, v10, v2}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    :try_start_8
    invoke-static {}, Lx8/a;->c()V
    :try_end_8
    .catch Landroidx/media3/common/util/GlUtil$GlException; {:try_start_8 .. :try_end_8} :catch_5

    goto :goto_9

    :catch_5
    move-exception v0

    const-string v2, "Failed to render"

    invoke-static {v4, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_9
    return-void

    :catchall_1
    move-exception v0

    :try_start_9
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    throw v0

    :pswitch_0
    invoke-direct/range {p0 .. p1}, Lno/l;->b(Ljavax/microedition/khronos/opengles/GL10;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .locals 6

    iget p1, p0, Lno/l;->w:I

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    invoke-static {p1, p1, p2, p3}, Landroid/opengl/GLES20;->glViewport(IIII)V

    int-to-float p1, p2

    int-to-float p2, p3

    div-float v3, p1, p2

    const/high16 p1, 0x3f800000    # 1.0f

    cmpl-float p1, v3, p1

    if-lez p1, :cond_0

    const-wide p1, 0x4046800000000000L    # 45.0

    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Math;->tan(D)D

    move-result-wide p1

    float-to-double v0, v3

    div-double/2addr p1, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->atan(D)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide p1

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    mul-double/2addr p1, v0

    double-to-float p1, p1

    :goto_0
    move v2, p1

    goto :goto_1

    :cond_0
    const/high16 p1, 0x42b40000    # 90.0f

    goto :goto_0

    :goto_1
    const v4, 0x3dcccccd    # 0.1f

    const/high16 v5, 0x42c80000    # 100.0f

    iget-object v0, p0, Lno/l;->x:[F

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->perspectiveM([FIFFFF)V

    return-void

    :pswitch_0
    const/4 p1, 0x0

    invoke-static {p1, p1, p2, p3}, Landroid/opengl/GLES20;->glViewport(IIII)V

    int-to-float p1, p2

    int-to-float p2, p3

    div-float v3, p1, p2

    const/high16 p1, 0x3f800000    # 1.0f

    cmpl-float p1, v3, p1

    if-lez p1, :cond_1

    const-wide p1, 0x4046800000000000L    # 45.0

    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Math;->tan(D)D

    move-result-wide p1

    float-to-double v0, v3

    div-double/2addr p1, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->atan(D)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide p1

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    mul-double/2addr p1, v0

    double-to-float p1, p1

    :goto_2
    move v2, p1

    goto :goto_3

    :cond_1
    const/high16 p1, 0x42b40000    # 90.0f

    goto :goto_2

    :goto_3
    const v4, 0x3dcccccd    # 0.1f

    const/high16 v5, 0x42c80000    # 100.0f

    iget-object v0, p0, Lno/l;->x:[F

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->perspectiveM([FIFFFF)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final declared-synchronized onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 3

    iget p1, p0, Lno/l;->w:I

    monitor-enter p0

    packed-switch p1, :pswitch_data_0

    :try_start_0
    iget-object p1, p0, Lno/l;->L:Landroid/opengl/GLSurfaceView;

    check-cast p1, Ls9/i;

    iget-object p2, p0, Lno/l;->K:Ljava/lang/Object;

    check-cast p2, Ls9/h;

    invoke-virtual {p2}, Ls9/h;->a()Landroid/graphics/SurfaceTexture;

    move-result-object p2

    iget-object v0, p1, Ls9/i;->E:Landroid/os/Handler;

    new-instance v1, Lr5/b;

    const/16 v2, 0xa

    invoke-direct {v1, v2, p1, p2}, Lr5/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :pswitch_0
    :try_start_2
    iget-object p1, p0, Lno/l;->L:Landroid/opengl/GLSurfaceView;

    check-cast p1, Lno/m;

    iget-object p2, p0, Lno/l;->K:Ljava/lang/Object;

    check-cast p2, Lno/k;

    invoke-virtual {p2}, Lno/k;->a()Landroid/graphics/SurfaceTexture;

    move-result-object p2

    iget-object v0, p1, Lno/m;->E:Landroid/os/Handler;

    new-instance v1, Lio/sentry/android/core/r0;

    const/16 v2, 0x18

    invoke-direct {v1, v2, p1, p2}, Lio/sentry/android/core/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
