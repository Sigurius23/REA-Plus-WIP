.class public final Lqi/w;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/drawable/Drawable$Callback;
.implements Landroid/graphics/drawable/Animatable;


# static fields
.field public static final q0:Ljava/util/List;

.field public static final r0:Ljava/util/concurrent/ThreadPoolExecutor;


# instance fields
.field public E:Z

.field public final F:Ljava/util/ArrayList;

.field public G:Lvi/a;

.field public H:Ljava/lang/String;

.field public I:Lb30/m;

.field public J:Ljava/util/Map;

.field public K:Ljava/lang/String;

.field public final L:Lad3/z;

.field public M:Z

.field public N:Z

.field public O:Lzi/c;

.field public P:I

.field public Q:Z

.field public R:Z

.field public S:Z

.field public T:Z

.field public U:Z

.field public V:Lqi/g0;

.field public W:Z

.field public final X:Landroid/graphics/Matrix;

.field public Y:Landroid/graphics/Bitmap;

.field public Z:Landroid/graphics/Canvas;

.field public a0:Landroid/graphics/Rect;

.field public b0:Landroid/graphics/RectF;

.field public c0:Lri/a;

.field public d0:Landroid/graphics/Rect;

.field public e0:Landroid/graphics/Rect;

.field public f0:Landroid/graphics/RectF;

.field public g0:Landroid/graphics/RectF;

.field public h0:Landroid/graphics/Matrix;

.field public final i0:[F

.field public j0:Landroid/graphics/Matrix;

.field public k0:Z

.field public l0:Lqi/a;

.field public final m0:Ljava/util/concurrent/Semaphore;

.field public final n0:Landroidx/lifecycle/z0;

.field public o0:F

.field public p0:I

.field public w:Lqi/i;

.field public final x:Ldj/e;

.field public final y:Z

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const-string v0, "reduced-motion"

    const-string v1, "reducedmotion"

    const-string v2, "reduced motion"

    const-string v3, "reduced_motion"

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lqi/w;->q0:Ljava/util/List;

    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v8, Ldj/d;

    invoke-direct {v8}, Ldj/d;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x2

    const-wide/16 v4, 0x23

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    sput-object v1, Lqi/w;->r0:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    new-instance v0, Ldj/e;

    invoke-direct {v0}, Ldj/e;-><init>()V

    iput-object v0, p0, Lqi/w;->x:Ldj/e;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lqi/w;->y:Z

    const/4 v2, 0x0

    iput-boolean v2, p0, Lqi/w;->z:Z

    iput-boolean v2, p0, Lqi/w;->E:Z

    iput v1, p0, Lqi/w;->p0:I

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Lqi/w;->F:Ljava/util/ArrayList;

    new-instance v3, Lad3/z;

    const/16 v4, 0x1b

    invoke-direct {v3, v4}, Lad3/z;-><init>(I)V

    iput-object v3, p0, Lqi/w;->L:Lad3/z;

    iput-boolean v2, p0, Lqi/w;->M:Z

    iput-boolean v1, p0, Lqi/w;->N:Z

    const/16 v3, 0xff

    iput v3, p0, Lqi/w;->P:I

    iput-boolean v2, p0, Lqi/w;->U:Z

    sget-object v3, Lqi/g0;->w:Lqi/g0;

    iput-object v3, p0, Lqi/w;->V:Lqi/g0;

    iput-boolean v2, p0, Lqi/w;->W:Z

    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    iput-object v3, p0, Lqi/w;->X:Landroid/graphics/Matrix;

    const/16 v3, 0x9

    new-array v3, v3, [F

    iput-object v3, p0, Lqi/w;->i0:[F

    iput-boolean v2, p0, Lqi/w;->k0:Z

    new-instance v2, Lqi/s;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lqi/s;-><init>(Ljava/lang/Object;I)V

    new-instance v3, Ljava/util/concurrent/Semaphore;

    invoke-direct {v3, v1}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object v3, p0, Lqi/w;->m0:Ljava/util/concurrent/Semaphore;

    new-instance v1, Landroidx/lifecycle/z0;

    const/16 v3, 0x12

    invoke-direct {v1, p0, v3}, Landroidx/lifecycle/z0;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Lqi/w;->n0:Landroidx/lifecycle/z0;

    const v1, -0x800001

    iput v1, p0, Lqi/w;->o0:F

    invoke-virtual {v0, v2}, Ldj/e;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-void
.end method

.method public static f(Landroid/graphics/Rect;Landroid/graphics/RectF;)V
    .locals 5

    iget v0, p1, Landroid/graphics/RectF;->left:F

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v0, v0

    iget v1, p1, Landroid/graphics/RectF;->top:F

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-int v1, v1

    iget v2, p1, Landroid/graphics/RectF;->right:F

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    float-to-double v3, p1

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int p1, v3

    invoke-virtual {p0, v0, v1, v2, p1}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method


# virtual methods
.method public final a(Lwi/e;Ljava/lang/Object;Ld1/j;)V
    .locals 6

    iget-object v0, p0, Lqi/w;->O:Lzi/c;

    if-nez v0, :cond_0

    new-instance v0, Lqi/o;

    invoke-direct {v0, p0, p1, p2, p3}, Lqi/o;-><init>(Lqi/w;Lwi/e;Ljava/lang/Object;Ld1/j;)V

    iget-object p1, p0, Lqi/w;->F:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    sget-object v1, Lwi/e;->c:Lwi/e;

    const/4 v2, 0x1

    if-ne p1, v1, :cond_1

    invoke-virtual {v0, p3, p2}, Lzi/c;->g(Ld1/j;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lwi/e;->c()Lwi/f;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lwi/e;->c()Lwi/f;

    move-result-object p1

    invoke-interface {p1, p3, p2}, Lwi/f;->g(Ld1/j;Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lqi/w;->O:Lzi/c;

    const/4 v1, 0x0

    if-nez v0, :cond_3

    const-string p1, "Cannot resolve KeyPath. Composition is not set yet."

    invoke-static {p1}, Ldj/c;->b(Ljava/lang/String;)V

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, p0, Lqi/w;->O:Lzi/c;

    new-instance v4, Lwi/e;

    new-array v5, v1, [Ljava/lang/String;

    invoke-direct {v4, v5}, Lwi/e;-><init>([Ljava/lang/String;)V

    invoke-virtual {v3, p1, v1, v0, v4}, Lzi/b;->d(Lwi/e;ILjava/util/ArrayList;Lwi/e;)V

    move-object p1, v0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_4

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwi/e;

    invoke-virtual {v0}, Lwi/e;->c()Lwi/f;

    move-result-object v0

    invoke-interface {v0, p3, p2}, Lwi/f;->g(Ld1/j;Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    xor-int/2addr v2, p1

    :goto_1
    if-eqz v2, :cond_5

    invoke-virtual {p0}, Lqi/w;->invalidateSelf()V

    sget-object p1, Lqi/a0;->z:Ljava/lang/Float;

    if-ne p2, p1, :cond_5

    iget-object p1, p0, Lqi/w;->x:Ldj/e;

    invoke-virtual {p1}, Ldj/e;->a()F

    move-result p1

    invoke-virtual {p0, p1}, Lqi/w;->w(F)V

    :cond_5
    return-void
.end method

.method public final b(Landroid/content/Context;)Z
    .locals 2

    iget-boolean v0, p0, Lqi/w;->z:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lqi/w;->y:Z

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    sget-object v0, Ldj/i;->a:Landroid/graphics/Matrix;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    const-string v0, "animator_duration_scale"

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p1, v0, v1}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    move-result p1

    const/4 v0, 0x0

    cmpl-float p1, p1, v0

    if-eqz p1, :cond_2

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final c()V
    .locals 31

    move-object/from16 v0, p0

    iget-object v3, v0, Lqi/w;->w:Lqi/i;

    if-nez v3, :cond_0

    return-void

    :cond_0
    new-instance v1, Lzi/c;

    sget-object v2, Lbj/r;->a:Lwe/o;

    iget-object v2, v3, Lqi/i;->k:Landroid/graphics/Rect;

    move-object v4, v1

    new-instance v1, Lzi/e;

    move-object v5, v2

    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    new-instance v12, Lxi/e;

    invoke-direct {v12}, Lxi/e;-><init>()V

    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    move-result v6

    int-to-float v6, v6

    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    move-result v5

    int-to-float v5, v5

    const/16 v27, 0x0

    const/16 v28, 0x1

    move-object v7, v4

    const-string v4, "__container"

    move/from16 v19, v5

    move/from16 v18, v6

    const-wide/16 v5, -0x1

    move-object v8, v7

    const/4 v7, 0x1

    move-object v10, v8

    const-wide/16 v8, -0x1

    move-object v11, v10

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x1

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v22, v11

    move-object v11, v2

    move-object/from16 v29, v22

    move-object/from16 v22, v2

    move-object/from16 v30, v29

    invoke-direct/range {v1 .. v28}, Lzi/e;-><init>(Ljava/util/List;Lqi/i;Ljava/lang/String;JIJLjava/lang/String;Ljava/util/List;Lxi/e;IIIFFFFLxi/d;Lso/q;Ljava/util/List;ILxi/b;ZLty/c;Lb30/m;I)V

    iget-object v2, v3, Lqi/i;->j:Ljava/util/ArrayList;

    move-object/from16 v4, v30

    invoke-direct {v4, v0, v1, v2, v3}, Lzi/c;-><init>(Lqi/w;Lzi/e;Ljava/util/List;Lqi/i;)V

    iput-object v4, v0, Lqi/w;->O:Lzi/c;

    iget-boolean v1, v0, Lqi/w;->R:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    invoke-virtual {v4, v1}, Lzi/c;->o(Z)V

    :cond_1
    iget-object v1, v0, Lqi/w;->O:Lzi/c;

    iget-boolean v2, v0, Lqi/w;->N:Z

    iput-boolean v2, v1, Lzi/c;->L:Z

    return-void
.end method

.method public final d()V
    .locals 3

    iget-object v0, p0, Lqi/w;->x:Ldj/e;

    iget-boolean v1, v0, Ldj/e;->M:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ldj/e;->cancel()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput v1, p0, Lqi/w;->p0:I

    :cond_0
    const/4 v1, 0x0

    iput-object v1, p0, Lqi/w;->w:Lqi/i;

    iput-object v1, p0, Lqi/w;->O:Lzi/c;

    iput-object v1, p0, Lqi/w;->G:Lvi/a;

    const v2, -0x800001

    iput v2, p0, Lqi/w;->o0:F

    iput-object v1, v0, Ldj/e;->L:Lqi/i;

    const/high16 v1, -0x31000000

    iput v1, v0, Ldj/e;->J:F

    const/high16 v1, 0x4f000000

    iput v1, v0, Ldj/e;->K:F

    invoke-virtual {p0}, Lqi/w;->invalidateSelf()V

    return-void
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 8

    iget-object v0, p0, Lqi/w;->O:Lzi/c;

    if-nez v0, :cond_0

    goto/16 :goto_6

    :cond_0
    iget-object v1, p0, Lqi/w;->l0:Lqi/a;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v1, Lqi/a;->w:Lqi/a;

    :goto_0
    sget-object v2, Lqi/a;->x:Lqi/a;

    const/4 v3, 0x0

    if-ne v1, v2, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    move v1, v3

    :goto_1
    iget-object v2, p0, Lqi/w;->n0:Landroidx/lifecycle/z0;

    sget-object v4, Lqi/w;->r0:Ljava/util/concurrent/ThreadPoolExecutor;

    iget-object v5, p0, Lqi/w;->x:Ldj/e;

    iget-object v6, p0, Lqi/w;->m0:Ljava/util/concurrent/Semaphore;

    if-eqz v1, :cond_3

    :try_start_0
    invoke-virtual {v6}, Ljava/util/concurrent/Semaphore;->acquire()V

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_3
    :goto_2
    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lqi/w;->x()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v5}, Ldj/e;->a()F

    move-result v7

    invoke-virtual {p0, v7}, Lqi/w;->w(F)V

    :cond_4
    iget-boolean v7, p0, Lqi/w;->E:Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v7, :cond_6

    :try_start_1
    iget-boolean v7, p0, Lqi/w;->W:Z

    if-eqz v7, :cond_5

    invoke-virtual {p0, p1, v0}, Lqi/w;->n(Landroid/graphics/Canvas;Lzi/c;)V

    goto :goto_3

    :cond_5
    invoke-virtual {p0, p1}, Lqi/w;->h(Landroid/graphics/Canvas;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    :try_start_2
    sget-object p1, Ldj/c;->a:Ldj/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_3

    :cond_6
    iget-boolean v7, p0, Lqi/w;->W:Z

    if-eqz v7, :cond_7

    invoke-virtual {p0, p1, v0}, Lqi/w;->n(Landroid/graphics/Canvas;Lzi/c;)V

    goto :goto_3

    :cond_7
    invoke-virtual {p0, p1}, Lqi/w;->h(Landroid/graphics/Canvas;)V

    :goto_3
    iput-boolean v3, p0, Lqi/w;->k0:Z
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_9

    invoke-virtual {v6}, Ljava/util/concurrent/Semaphore;->release()V

    iget p1, v0, Lzi/c;->K:F

    invoke-virtual {v5}, Ldj/e;->a()F

    move-result v0

    cmpl-float p1, p1, v0

    if-eqz p1, :cond_9

    :goto_4
    invoke-virtual {v4, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    goto :goto_6

    :goto_5
    if-eqz v1, :cond_8

    invoke-virtual {v6}, Ljava/util/concurrent/Semaphore;->release()V

    iget v0, v0, Lzi/c;->K:F

    invoke-virtual {v5}, Ldj/e;->a()F

    move-result v1

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_8

    invoke-virtual {v4, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    :cond_8
    throw p1

    :catch_0
    if-eqz v1, :cond_9

    invoke-virtual {v6}, Ljava/util/concurrent/Semaphore;->release()V

    iget p1, v0, Lzi/c;->K:F

    invoke-virtual {v5}, Ldj/e;->a()F

    move-result v0

    cmpl-float p1, p1, v0

    if-eqz p1, :cond_9

    goto :goto_4

    :cond_9
    :goto_6
    return-void
.end method

.method public final e()V
    .locals 5

    iget-object v0, p0, Lqi/w;->w:Lqi/i;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lqi/w;->V:Lqi/g0;

    iget v0, v0, Lqi/i;->o:I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v1, v3, :cond_2

    const/4 v4, 0x2

    if-eq v1, v4, :cond_1

    const/4 v1, 0x4

    if-le v0, v1, :cond_2

    :cond_1
    move v2, v3

    :cond_2
    iput-boolean v2, p0, Lqi/w;->W:Z

    return-void
.end method

.method public final g(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V
    .locals 10

    iget-object v0, p0, Lqi/w;->O:Lzi/c;

    iget-object v1, p0, Lqi/w;->w:Lqi/i;

    if-eqz v0, :cond_8

    if-nez v1, :cond_0

    goto/16 :goto_6

    :cond_0
    iget-object v1, p0, Lqi/w;->l0:Lqi/a;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v1, Lqi/a;->w:Lqi/a;

    :goto_0
    sget-object v2, Lqi/a;->x:Lqi/a;

    const/4 v3, 0x0

    if-ne v1, v2, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    move v1, v3

    :goto_1
    iget-object v2, p0, Lqi/w;->n0:Landroidx/lifecycle/z0;

    sget-object v4, Lqi/w;->r0:Ljava/util/concurrent/ThreadPoolExecutor;

    iget-object v5, p0, Lqi/w;->x:Ldj/e;

    iget-object v6, p0, Lqi/w;->m0:Ljava/util/concurrent/Semaphore;

    if-eqz v1, :cond_3

    :try_start_0
    invoke-virtual {v6}, Ljava/util/concurrent/Semaphore;->acquire()V

    invoke-virtual {p0}, Lqi/w;->x()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v5}, Ldj/e;->a()F

    move-result v7

    invoke-virtual {p0, v7}, Lqi/w;->w(F)V

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_3
    :goto_2
    iget-boolean v7, p0, Lqi/w;->E:Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v8, 0x0

    if-eqz v7, :cond_5

    :try_start_1
    iget v7, p0, Lqi/w;->P:I

    iget-boolean v9, p0, Lqi/w;->W:Z

    if-eqz v9, :cond_4

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    invoke-virtual {p0, p1, v0}, Lqi/w;->n(Landroid/graphics/Canvas;Lzi/c;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    goto :goto_3

    :cond_4
    invoke-virtual {v0, p1, p2, v7, v8}, Lzi/b;->c(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILdj/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    :try_start_2
    sget-object p1, Ldj/c;->a:Ldj/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_3

    :cond_5
    iget v7, p0, Lqi/w;->P:I

    iget-boolean v9, p0, Lqi/w;->W:Z

    if-eqz v9, :cond_6

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    invoke-virtual {p0, p1, v0}, Lqi/w;->n(Landroid/graphics/Canvas;Lzi/c;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    goto :goto_3

    :cond_6
    invoke-virtual {v0, p1, p2, v7, v8}, Lzi/b;->c(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILdj/a;)V

    :goto_3
    iput-boolean v3, p0, Lqi/w;->k0:Z
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_8

    invoke-virtual {v6}, Ljava/util/concurrent/Semaphore;->release()V

    iget p1, v0, Lzi/c;->K:F

    invoke-virtual {v5}, Ldj/e;->a()F

    move-result p2

    cmpl-float p1, p1, p2

    if-eqz p1, :cond_8

    :goto_4
    invoke-virtual {v4, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    goto :goto_6

    :goto_5
    if-eqz v1, :cond_7

    invoke-virtual {v6}, Ljava/util/concurrent/Semaphore;->release()V

    iget p2, v0, Lzi/c;->K:F

    invoke-virtual {v5}, Ldj/e;->a()F

    move-result v0

    cmpl-float p2, p2, v0

    if-eqz p2, :cond_7

    invoke-virtual {v4, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    :cond_7
    throw p1

    :catch_0
    if-eqz v1, :cond_8

    invoke-virtual {v6}, Ljava/util/concurrent/Semaphore;->release()V

    iget p1, v0, Lzi/c;->K:F

    invoke-virtual {v5}, Ldj/e;->a()F

    move-result p2

    cmpl-float p1, p1, p2

    if-eqz p1, :cond_8

    goto :goto_4

    :cond_8
    :goto_6
    return-void
.end method

.method public final getAlpha()I
    .locals 1

    iget v0, p0, Lqi/w;->P:I

    return v0
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    iget-object v0, p0, Lqi/w;->w:Lqi/i;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    iget-object v0, v0, Lqi/i;->k:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    iget-object v0, p0, Lqi/w;->w:Lqi/i;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    iget-object v0, v0, Lqi/i;->k:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    return v0
.end method

.method public final getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public final h(Landroid/graphics/Canvas;)V
    .locals 6

    iget-object v0, p0, Lqi/w;->O:Lzi/c;

    iget-object v1, p0, Lqi/w;->w:Lqi/i;

    if-eqz v0, :cond_2

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lqi/w;->X:Landroid/graphics/Matrix;

    invoke-virtual {v2}, Landroid/graphics/Matrix;->reset()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    invoke-virtual {v3}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v4

    int-to-float v4, v4

    iget-object v5, v1, Lqi/i;->k:Landroid/graphics/Rect;

    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v4, v5

    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v5

    int-to-float v5, v5

    iget-object v1, v1, Lqi/i;->k:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v5, v1

    iget v1, v3, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    iget v3, v3, Landroid/graphics/Rect;->top:I

    int-to-float v3, v3

    invoke-virtual {v2, v1, v3}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    invoke-virtual {v2, v4, v5}, Landroid/graphics/Matrix;->preScale(FF)Z

    :cond_1
    iget v1, p0, Lqi/w;->P:I

    const/4 v3, 0x0

    invoke-virtual {v0, p1, v2, v1, v3}, Lzi/b;->c(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILdj/a;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final i()Landroid/content/Context;
    .locals 3

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    instance-of v2, v0, Landroid/view/View;

    if-eqz v2, :cond_1

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v1
.end method

.method public final invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-interface {p1, p0}, Landroid/graphics/drawable/Drawable$Callback;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final invalidateSelf()V
    .locals 1

    iget-boolean v0, p0, Lqi/w;->k0:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lqi/w;->k0:Z

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Landroid/graphics/drawable/Drawable$Callback;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final isRunning()Z
    .locals 1

    invoke-virtual {p0}, Lqi/w;->k()Z

    move-result v0

    return v0
.end method

.method public final j()Lb30/m;
    .locals 2

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lqi/w;->I:Lb30/m;

    if-nez v0, :cond_1

    new-instance v0, Lb30/m;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v1

    invoke-direct {v0, v1}, Lb30/m;-><init>(Landroid/graphics/drawable/Drawable$Callback;)V

    iput-object v0, p0, Lqi/w;->I:Lb30/m;

    iget-object v1, p0, Lqi/w;->K:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Lb30/m;->I(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lqi/w;->I:Lb30/m;

    return-object v0
.end method

.method public final k()Z
    .locals 1

    iget-object v0, p0, Lqi/w;->x:Ldj/e;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-boolean v0, v0, Ldj/e;->M:Z

    return v0
.end method

.method public final l()V
    .locals 4

    iget-object v0, p0, Lqi/w;->F:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lqi/w;->x:Ldj/e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ldj/e;->g(Z)V

    iget-object v2, v0, Ldj/e;->y:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/animation/Animator$AnimatorPauseListener;

    invoke-interface {v3, v0}, Landroid/animation/Animator$AnimatorPauseListener;->onAnimationPause(Landroid/animation/Animator;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-nez v0, :cond_1

    iput v1, p0, Lqi/w;->p0:I

    :cond_1
    return-void
.end method

.method public final m()V
    .locals 5

    iget-object v0, p0, Lqi/w;->O:Lzi/c;

    if-nez v0, :cond_0

    new-instance v0, Lqi/t;

    invoke-direct {v0, p0}, Lqi/t;-><init>(Lqi/w;)V

    iget-object v1, p0, Lqi/w;->F:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-virtual {p0}, Lqi/w;->e()V

    invoke-virtual {p0}, Lqi/w;->i()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0}, Lqi/w;->b(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x1

    iget-object v2, p0, Lqi/w;->x:Ldj/e;

    if-nez v0, :cond_1

    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_6

    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_5

    iput-boolean v1, v2, Ldj/e;->M:Z

    invoke-virtual {v2}, Ldj/e;->d()Z

    move-result v0

    iget-object v3, v2, Ldj/e;->x:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/animation/Animator$AnimatorListener;

    invoke-interface {v4, v2, v0}, Landroid/animation/Animator$AnimatorListener;->onAnimationStart(Landroid/animation/Animator;Z)V

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Ldj/e;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v2}, Ldj/e;->b()F

    move-result v0

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Ldj/e;->c()F

    move-result v0

    :goto_1
    float-to-int v0, v0

    int-to-float v0, v0

    invoke-virtual {v2, v0}, Ldj/e;->h(F)V

    const-wide/16 v3, 0x0

    iput-wide v3, v2, Ldj/e;->F:J

    const/4 v0, 0x0

    iput v0, v2, Ldj/e;->I:I

    iget-boolean v3, v2, Ldj/e;->M:Z

    if-eqz v3, :cond_4

    invoke-virtual {v2, v0}, Ldj/e;->g(Z)V

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    :cond_4
    iput v1, p0, Lqi/w;->p0:I

    goto :goto_2

    :cond_5
    const/4 v0, 0x2

    iput v0, p0, Lqi/w;->p0:I

    :cond_6
    :goto_2
    invoke-virtual {p0}, Lqi/w;->i()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0}, Lqi/w;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_b

    sget-object v0, Lqi/w;->q0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v4, p0, Lqi/w;->w:Lqi/i;

    invoke-virtual {v4, v3}, Lqi/i;->d(Ljava/lang/String;)Lwi/h;

    move-result-object v3

    if-eqz v3, :cond_7

    :cond_8
    if-eqz v3, :cond_9

    iget v0, v3, Lwi/h;->b:F

    float-to-int v0, v0

    invoke-virtual {p0, v0}, Lqi/w;->q(I)V

    goto :goto_4

    :cond_9
    iget v0, v2, Ldj/e;->z:F

    const/4 v3, 0x0

    cmpg-float v0, v0, v3

    if-gez v0, :cond_a

    invoke-virtual {v2}, Ldj/e;->c()F

    move-result v0

    goto :goto_3

    :cond_a
    invoke-virtual {v2}, Ldj/e;->b()F

    move-result v0

    :goto_3
    float-to-int v0, v0

    invoke-virtual {p0, v0}, Lqi/w;->q(I)V

    :goto_4
    invoke-virtual {v2, v1}, Ldj/e;->g(Z)V

    invoke-virtual {v2}, Ldj/e;->d()Z

    move-result v0

    invoke-virtual {v2, v0}, Ldj/e;->e(Z)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-nez v0, :cond_b

    iput v1, p0, Lqi/w;->p0:I

    :cond_b
    return-void
.end method

.method public final n(Landroid/graphics/Canvas;Lzi/c;)V
    .locals 10

    iget-object v0, p0, Lqi/w;->w:Lqi/i;

    if-eqz v0, :cond_c

    if-nez p2, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v0, p0, Lqi/w;->Z:Landroid/graphics/Canvas;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0}, Landroid/graphics/Canvas;-><init>()V

    iput-object v0, p0, Lqi/w;->Z:Landroid/graphics/Canvas;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lqi/w;->g0:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lqi/w;->h0:Landroid/graphics/Matrix;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lqi/w;->j0:Landroid/graphics/Matrix;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lqi/w;->a0:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lqi/w;->b0:Landroid/graphics/RectF;

    new-instance v0, Lri/a;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lqi/w;->c0:Lri/a;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lqi/w;->d0:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lqi/w;->e0:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lqi/w;->f0:Landroid/graphics/RectF;

    :goto_0
    iget-object v0, p0, Lqi/w;->h0:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getMatrix(Landroid/graphics/Matrix;)V

    iget-object v0, p0, Lqi/w;->a0:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    iget-object v0, p0, Lqi/w;->a0:Landroid/graphics/Rect;

    iget-object v1, p0, Lqi/w;->b0:Landroid/graphics/RectF;

    iget v2, v0, Landroid/graphics/Rect;->left:I

    int-to-float v2, v2

    iget v3, v0, Landroid/graphics/Rect;->top:I

    int-to-float v3, v3

    iget v4, v0, Landroid/graphics/Rect;->right:I

    int-to-float v4, v4

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    int-to-float v0, v0

    invoke-virtual {v1, v2, v3, v4, v0}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v0, p0, Lqi/w;->h0:Landroid/graphics/Matrix;

    iget-object v1, p0, Lqi/w;->b0:Landroid/graphics/RectF;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    iget-object v0, p0, Lqi/w;->b0:Landroid/graphics/RectF;

    iget-object v1, p0, Lqi/w;->a0:Landroid/graphics/Rect;

    invoke-static {v1, v0}, Lqi/w;->f(Landroid/graphics/Rect;Landroid/graphics/RectF;)V

    iget-boolean v0, p0, Lqi/w;->N:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lqi/w;->g0:Landroid/graphics/RectF;

    invoke-virtual {p0}, Lqi/w;->getIntrinsicWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p0}, Lqi/w;->getIntrinsicHeight()I

    move-result v4

    int-to-float v4, v4

    const/4 v5, 0x0

    invoke-virtual {v0, v5, v5, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lqi/w;->g0:Landroid/graphics/RectF;

    invoke-virtual {p2, v0, v1, v2}, Lzi/c;->e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    :goto_1
    iget-object v0, p0, Lqi/w;->h0:Landroid/graphics/Matrix;

    iget-object v3, p0, Lqi/w;->g0:Landroid/graphics/RectF;

    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p0}, Lqi/w;->getIntrinsicWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Lqi/w;->getIntrinsicHeight()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v0, v4

    iget-object v4, p0, Lqi/w;->g0:Landroid/graphics/RectF;

    iget v5, v4, Landroid/graphics/RectF;->left:F

    mul-float/2addr v5, v3

    iget v6, v4, Landroid/graphics/RectF;->top:F

    mul-float/2addr v6, v0

    iget v7, v4, Landroid/graphics/RectF;->right:F

    mul-float/2addr v7, v3

    iget v8, v4, Landroid/graphics/RectF;->bottom:F

    mul-float/2addr v8, v0

    invoke-virtual {v4, v5, v6, v7, v8}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v4

    instance-of v5, v4, Landroid/view/View;

    const/4 v6, 0x1

    if-nez v5, :cond_4

    :cond_3
    move v4, v2

    goto :goto_2

    :cond_4
    check-cast v4, Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    instance-of v5, v4, Landroid/view/ViewGroup;

    if-eqz v5, :cond_3

    check-cast v4, Landroid/view/ViewGroup;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getClipChildren()Z

    move-result v4

    xor-int/2addr v4, v6

    :goto_2
    if-nez v4, :cond_5

    iget-object v4, p0, Lqi/w;->g0:Landroid/graphics/RectF;

    iget-object v5, p0, Lqi/w;->a0:Landroid/graphics/Rect;

    iget v7, v5, Landroid/graphics/Rect;->left:I

    int-to-float v7, v7

    iget v8, v5, Landroid/graphics/Rect;->top:I

    int-to-float v8, v8

    iget v9, v5, Landroid/graphics/Rect;->right:I

    int-to-float v9, v9

    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    int-to-float v5, v5

    invoke-virtual {v4, v7, v8, v9, v5}, Landroid/graphics/RectF;->intersect(FFFF)Z

    :cond_5
    iget-object v4, p0, Lqi/w;->g0:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v4

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v4, v4

    iget-object v5, p0, Lqi/w;->g0:Landroid/graphics/RectF;

    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    move-result v5

    float-to-double v7, v5

    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v7

    double-to-int v5, v7

    if-lez v4, :cond_c

    if-gtz v5, :cond_6

    goto/16 :goto_5

    :cond_6
    iget-object v7, p0, Lqi/w;->Y:Landroid/graphics/Bitmap;

    if-eqz v7, :cond_9

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    if-lt v7, v4, :cond_9

    iget-object v7, p0, Lqi/w;->Y:Landroid/graphics/Bitmap;

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    if-ge v7, v5, :cond_7

    goto :goto_3

    :cond_7
    iget-object v7, p0, Lqi/w;->Y:Landroid/graphics/Bitmap;

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    if-gt v7, v4, :cond_8

    iget-object v7, p0, Lqi/w;->Y:Landroid/graphics/Bitmap;

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    if-le v7, v5, :cond_a

    :cond_8
    iget-object v7, p0, Lqi/w;->Y:Landroid/graphics/Bitmap;

    invoke-static {v7, v2, v2, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v7

    iput-object v7, p0, Lqi/w;->Y:Landroid/graphics/Bitmap;

    iget-object v8, p0, Lqi/w;->Z:Landroid/graphics/Canvas;

    invoke-virtual {v8, v7}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    iput-boolean v6, p0, Lqi/w;->k0:Z

    goto :goto_4

    :cond_9
    :goto_3
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v4, v5, v7}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v7

    iput-object v7, p0, Lqi/w;->Y:Landroid/graphics/Bitmap;

    iget-object v8, p0, Lqi/w;->Z:Landroid/graphics/Canvas;

    invoke-virtual {v8, v7}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    iput-boolean v6, p0, Lqi/w;->k0:Z

    :cond_a
    :goto_4
    iget-boolean v6, p0, Lqi/w;->k0:Z

    if-eqz v6, :cond_b

    iget-object v6, p0, Lqi/w;->h0:Landroid/graphics/Matrix;

    iget-object v7, p0, Lqi/w;->i0:[F

    invoke-virtual {v6, v7}, Landroid/graphics/Matrix;->getValues([F)V

    aget v6, v7, v2

    const/4 v8, 0x4

    aget v7, v7, v8

    iget-object v8, p0, Lqi/w;->h0:Landroid/graphics/Matrix;

    iget-object v9, p0, Lqi/w;->X:Landroid/graphics/Matrix;

    invoke-virtual {v9, v8}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    invoke-virtual {v9, v3, v0}, Landroid/graphics/Matrix;->preScale(FF)Z

    iget-object v0, p0, Lqi/w;->g0:Landroid/graphics/RectF;

    iget v3, v0, Landroid/graphics/RectF;->left:F

    neg-float v3, v3

    iget v0, v0, Landroid/graphics/RectF;->top:F

    neg-float v0, v0

    invoke-virtual {v9, v3, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    const/high16 v0, 0x3f800000    # 1.0f

    div-float v3, v0, v6

    div-float/2addr v0, v7

    invoke-virtual {v9, v3, v0}, Landroid/graphics/Matrix;->postScale(FF)Z

    iget-object v0, p0, Lqi/w;->Y:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v2}, Landroid/graphics/Bitmap;->eraseColor(I)V

    iget-object v0, p0, Lqi/w;->Z:Landroid/graphics/Canvas;

    sget-object v3, Ldj/i;->a:Landroid/graphics/Matrix;

    invoke-virtual {v0, v3}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    iget-object v0, p0, Lqi/w;->Z:Landroid/graphics/Canvas;

    invoke-virtual {v0, v6, v7}, Landroid/graphics/Canvas;->scale(FF)V

    iget-object v0, p0, Lqi/w;->Z:Landroid/graphics/Canvas;

    iget v3, p0, Lqi/w;->P:I

    invoke-virtual {p2, v0, v9, v3, v1}, Lzi/b;->c(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILdj/a;)V

    iget-object p2, p0, Lqi/w;->h0:Landroid/graphics/Matrix;

    iget-object v0, p0, Lqi/w;->j0:Landroid/graphics/Matrix;

    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    iget-object p2, p0, Lqi/w;->j0:Landroid/graphics/Matrix;

    iget-object v0, p0, Lqi/w;->f0:Landroid/graphics/RectF;

    iget-object v1, p0, Lqi/w;->g0:Landroid/graphics/RectF;

    invoke-virtual {p2, v0, v1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    iget-object p2, p0, Lqi/w;->f0:Landroid/graphics/RectF;

    iget-object v0, p0, Lqi/w;->e0:Landroid/graphics/Rect;

    invoke-static {v0, p2}, Lqi/w;->f(Landroid/graphics/Rect;Landroid/graphics/RectF;)V

    :cond_b
    iget-object p2, p0, Lqi/w;->d0:Landroid/graphics/Rect;

    invoke-virtual {p2, v2, v2, v4, v5}, Landroid/graphics/Rect;->set(IIII)V

    iget-object p2, p0, Lqi/w;->Y:Landroid/graphics/Bitmap;

    iget-object v0, p0, Lqi/w;->d0:Landroid/graphics/Rect;

    iget-object v1, p0, Lqi/w;->e0:Landroid/graphics/Rect;

    iget-object v2, p0, Lqi/w;->c0:Lri/a;

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    :cond_c
    :goto_5
    return-void
.end method

.method public final o()V
    .locals 5

    iget-object v0, p0, Lqi/w;->O:Lzi/c;

    if-nez v0, :cond_0

    new-instance v0, Lqi/r;

    invoke-direct {v0, p0}, Lqi/r;-><init>(Lqi/w;)V

    iget-object v1, p0, Lqi/w;->F:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-virtual {p0}, Lqi/w;->e()V

    invoke-virtual {p0}, Lqi/w;->i()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0}, Lqi/w;->b(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x1

    iget-object v2, p0, Lqi/w;->x:Ldj/e;

    if-nez v0, :cond_1

    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_6

    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_5

    iput-boolean v1, v2, Ldj/e;->M:Z

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ldj/e;->g(Z)V

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    const-wide/16 v3, 0x0

    iput-wide v3, v2, Ldj/e;->F:J

    invoke-virtual {v2}, Ldj/e;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, v2, Ldj/e;->H:F

    invoke-virtual {v2}, Ldj/e;->c()F

    move-result v3

    cmpl-float v0, v0, v3

    if-nez v0, :cond_2

    invoke-virtual {v2}, Ldj/e;->b()F

    move-result v0

    invoke-virtual {v2, v0}, Ldj/e;->h(F)V

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Ldj/e;->d()Z

    move-result v0

    if-nez v0, :cond_3

    iget v0, v2, Ldj/e;->H:F

    invoke-virtual {v2}, Ldj/e;->b()F

    move-result v3

    cmpl-float v0, v0, v3

    if-nez v0, :cond_3

    invoke-virtual {v2}, Ldj/e;->c()F

    move-result v0

    invoke-virtual {v2, v0}, Ldj/e;->h(F)V

    :cond_3
    :goto_0
    iget-object v0, v2, Ldj/e;->y:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/animation/Animator$AnimatorPauseListener;

    invoke-interface {v3, v2}, Landroid/animation/Animator$AnimatorPauseListener;->onAnimationResume(Landroid/animation/Animator;)V

    goto :goto_1

    :cond_4
    iput v1, p0, Lqi/w;->p0:I

    goto :goto_2

    :cond_5
    const/4 v0, 0x3

    iput v0, p0, Lqi/w;->p0:I

    :cond_6
    :goto_2
    invoke-virtual {p0}, Lqi/w;->i()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0}, Lqi/w;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_8

    iget v0, v2, Ldj/e;->z:F

    const/4 v3, 0x0

    cmpg-float v0, v0, v3

    if-gez v0, :cond_7

    invoke-virtual {v2}, Ldj/e;->c()F

    move-result v0

    goto :goto_3

    :cond_7
    invoke-virtual {v2}, Ldj/e;->b()F

    move-result v0

    :goto_3
    float-to-int v0, v0

    invoke-virtual {p0, v0}, Lqi/w;->q(I)V

    invoke-virtual {v2, v1}, Ldj/e;->g(Z)V

    invoke-virtual {v2}, Ldj/e;->d()Z

    move-result v0

    invoke-virtual {v2, v0}, Ldj/e;->e(Z)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-nez v0, :cond_8

    iput v1, p0, Lqi/w;->p0:I

    :cond_8
    return-void
.end method

.method public final p(Lqi/i;)Z
    .locals 5

    iget-object v0, p0, Lqi/w;->w:Lqi/i;

    const/4 v1, 0x0

    if-ne v0, p1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lqi/w;->k0:Z

    invoke-virtual {p0}, Lqi/w;->d()V

    iput-object p1, p0, Lqi/w;->w:Lqi/i;

    invoke-virtual {p0}, Lqi/w;->c()V

    iget-object v2, p0, Lqi/w;->x:Ldj/e;

    iget-object v3, v2, Ldj/e;->L:Lqi/i;

    if-nez v3, :cond_1

    move v1, v0

    :cond_1
    iput-object p1, v2, Ldj/e;->L:Lqi/i;

    if-eqz v1, :cond_2

    iget v1, v2, Ldj/e;->J:F

    iget v3, p1, Lqi/i;->l:F

    invoke-static {v1, v3}, Ljava/lang/Math;->max(FF)F

    move-result v1

    iget v3, v2, Ldj/e;->K:F

    iget v4, p1, Lqi/i;->m:F

    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    move-result v3

    invoke-virtual {v2, v1, v3}, Ldj/e;->i(FF)V

    goto :goto_0

    :cond_2
    iget v1, p1, Lqi/i;->l:F

    float-to-int v1, v1

    int-to-float v1, v1

    iget v3, p1, Lqi/i;->m:F

    float-to-int v3, v3

    int-to-float v3, v3

    invoke-virtual {v2, v1, v3}, Ldj/e;->i(FF)V

    :goto_0
    iget v1, v2, Ldj/e;->H:F

    const/4 v3, 0x0

    iput v3, v2, Ldj/e;->H:F

    iput v3, v2, Ldj/e;->G:F

    float-to-int v1, v1

    int-to-float v1, v1

    invoke-virtual {v2, v1}, Ldj/e;->h(F)V

    invoke-virtual {v2}, Ldj/e;->f()V

    invoke-virtual {v2}, Ldj/e;->getAnimatedFraction()F

    move-result v1

    invoke-virtual {p0, v1}, Lqi/w;->w(F)V

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lqi/w;->F:Ljava/util/ArrayList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqi/v;

    if-eqz v3, :cond_3

    invoke-interface {v3}, Lqi/v;->run()V

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    iget-boolean v1, p0, Lqi/w;->Q:Z

    iget-object p1, p1, Lqi/i;->a:Lqi/e0;

    iput-boolean v1, p1, Lqi/e0;->a:Z

    invoke-virtual {p0}, Lqi/w;->e()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    instance-of v1, p1, Landroid/widget/ImageView;

    if-eqz v1, :cond_5

    check-cast p1, Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_5
    return v0
.end method

.method public final q(I)V
    .locals 2

    iget-object v0, p0, Lqi/w;->w:Lqi/i;

    if-nez v0, :cond_0

    new-instance v0, Lqi/n;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p1, v1}, Lqi/n;-><init>(Lqi/w;II)V

    iget-object p1, p0, Lqi/w;->F:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    iget-object v0, p0, Lqi/w;->x:Ldj/e;

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Ldj/e;->h(F)V

    return-void
.end method

.method public final r(I)V
    .locals 2

    iget-object v0, p0, Lqi/w;->w:Lqi/i;

    if-nez v0, :cond_0

    new-instance v0, Lqi/n;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lqi/n;-><init>(Lqi/w;II)V

    iget-object p1, p0, Lqi/w;->F:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    int-to-float p1, p1

    const v0, 0x3f7d70a4    # 0.99f

    add-float/2addr p1, v0

    iget-object v0, p0, Lqi/w;->x:Ldj/e;

    iget v1, v0, Ldj/e;->J:F

    invoke-virtual {v0, v1, p1}, Ldj/e;->i(FF)V

    return-void
.end method

.method public final s(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lqi/w;->w:Lqi/i;

    if-nez v0, :cond_0

    new-instance v0, Lqi/m;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lqi/m;-><init>(Lqi/w;Ljava/lang/String;I)V

    iget-object p1, p0, Lqi/w;->F:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lqi/i;->d(Ljava/lang/String;)Lwi/h;

    move-result-object v0

    if-eqz v0, :cond_1

    iget p1, v0, Lwi/h;->b:F

    iget v0, v0, Lwi/h;->c:F

    add-float/2addr p1, v0

    float-to-int p1, p1

    invoke-virtual {p0, p1}, Lqi/w;->r(I)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot find marker with name "

    const-string v2, "."

    invoke-static {v1, p1, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-interface {p1, p0, p2, p3, p4}, Landroid/graphics/drawable/Drawable$Callback;->scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public final setAlpha(I)V
    .locals 0

    iput p1, p0, Lqi/w;->P:I

    invoke-virtual {p0}, Lqi/w;->invalidateSelf()V

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    const-string p1, "Use addColorFilter instead."

    invoke-static {p1}, Ldj/c;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final setVisible(ZZ)Z
    .locals 2

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result p2

    const/4 v1, 0x3

    if-eqz p1, :cond_1

    iget p1, p0, Lqi/w;->p0:I

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lqi/w;->m()V

    return p2

    :cond_0
    if-ne p1, v1, :cond_3

    invoke-virtual {p0}, Lqi/w;->o()V

    return p2

    :cond_1
    iget-object p1, p0, Lqi/w;->x:Ldj/e;

    iget-boolean p1, p1, Ldj/e;->M:Z

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lqi/w;->l()V

    iput v1, p0, Lqi/w;->p0:I

    return p2

    :cond_2
    if-eqz v0, :cond_3

    const/4 p1, 0x1

    iput p1, p0, Lqi/w;->p0:I

    :cond_3
    return p2
.end method

.method public final start()V
    .locals 2

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v0

    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lqi/w;->m()V

    return-void
.end method

.method public final stop()V
    .locals 3

    iget-object v0, p0, Lqi/w;->F:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lqi/w;->x:Ldj/e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ldj/e;->g(Z)V

    invoke-virtual {v0}, Ldj/e;->d()Z

    move-result v2

    invoke-virtual {v0, v2}, Ldj/e;->e(Z)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-nez v0, :cond_0

    iput v1, p0, Lqi/w;->p0:I

    :cond_0
    return-void
.end method

.method public final t(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lqi/w;->w:Lqi/i;

    iget-object v1, p0, Lqi/w;->F:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Lqi/m;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lqi/m;-><init>(Lqi/w;Ljava/lang/String;I)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lqi/i;->d(Ljava/lang/String;)Lwi/h;

    move-result-object v0

    if-eqz v0, :cond_2

    iget p1, v0, Lwi/h;->b:F

    float-to-int p1, p1

    iget v0, v0, Lwi/h;->c:F

    float-to-int v0, v0

    add-int/2addr v0, p1

    iget-object v2, p0, Lqi/w;->w:Lqi/i;

    if-nez v2, :cond_1

    new-instance v2, Lqi/q;

    invoke-direct {v2, p0, p1, v0}, Lqi/q;-><init>(Lqi/w;II)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    int-to-float p1, p1

    int-to-float v0, v0

    const v1, 0x3f7d70a4    # 0.99f

    add-float/2addr v0, v1

    iget-object v1, p0, Lqi/w;->x:Ldj/e;

    invoke-virtual {v1, p1, v0}, Ldj/e;->i(FF)V

    return-void

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot find marker with name "

    const-string v2, "."

    invoke-static {v1, p1, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final u(I)V
    .locals 2

    iget-object v0, p0, Lqi/w;->w:Lqi/i;

    if-nez v0, :cond_0

    new-instance v0, Lqi/n;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lqi/n;-><init>(Lqi/w;II)V

    iget-object p1, p0, Lqi/w;->F:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    int-to-float p1, p1

    iget-object v0, p0, Lqi/w;->x:Ldj/e;

    iget v1, v0, Ldj/e;->K:F

    float-to-int v1, v1

    int-to-float v1, v1

    invoke-virtual {v0, p1, v1}, Ldj/e;->i(FF)V

    return-void
.end method

.method public final unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-interface {p1, p0, p2}, Landroid/graphics/drawable/Drawable$Callback;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final v(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lqi/w;->w:Lqi/i;

    if-nez v0, :cond_0

    new-instance v0, Lqi/m;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p1, v1}, Lqi/m;-><init>(Lqi/w;Ljava/lang/String;I)V

    iget-object p1, p0, Lqi/w;->F:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lqi/i;->d(Ljava/lang/String;)Lwi/h;

    move-result-object v0

    if-eqz v0, :cond_1

    iget p1, v0, Lwi/h;->b:F

    float-to-int p1, p1

    invoke-virtual {p0, p1}, Lqi/w;->u(I)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot find marker with name "

    const-string v2, "."

    invoke-static {v1, p1, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final w(F)V
    .locals 2

    iget-object v0, p0, Lqi/w;->w:Lqi/i;

    if-nez v0, :cond_0

    new-instance v0, Lqi/u;

    invoke-direct {v0, p0, p1}, Lqi/u;-><init>(Lqi/w;F)V

    iget-object p1, p0, Lqi/w;->F:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    iget v1, v0, Lqi/i;->l:F

    iget v0, v0, Lqi/i;->m:F

    invoke-static {v1, v0, p1}, Ldj/g;->f(FFF)F

    move-result p1

    iget-object v0, p0, Lqi/w;->x:Ldj/e;

    invoke-virtual {v0, p1}, Ldj/e;->h(F)V

    return-void
.end method

.method public final x()Z
    .locals 4

    iget-object v0, p0, Lqi/w;->w:Lqi/i;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v2, p0, Lqi/w;->o0:F

    iget-object v3, p0, Lqi/w;->x:Ldj/e;

    invoke-virtual {v3}, Ldj/e;->a()F

    move-result v3

    iput v3, p0, Lqi/w;->o0:F

    invoke-virtual {v0}, Lqi/i;->b()F

    move-result v0

    sub-float/2addr v3, v2

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v2

    mul-float/2addr v2, v0

    const/high16 v0, 0x42480000    # 50.0f

    cmpl-float v0, v2, v0

    if-ltz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method
