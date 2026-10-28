.class public final Lb3/f2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La3/a2;


# instance fields
.field public E:Lc93/a;

.field public F:J

.field public G:Z

.field public final H:[F

.field public I:[F

.field public J:Z

.field public K:Ly3/c;

.field public L:Ly3/m;

.field public final M:Lk2/b;

.field public N:I

.field public O:J

.field public P:Li2/p0;

.field public Q:Z

.field public R:Z

.field public S:Z

.field public T:Z

.field public final U:La3/m1;

.field public w:Ll2/c;

.field public final x:Li2/f0;

.field public final y:Landroidx/compose/ui/platform/AndroidComposeView;

.field public z:Lc93/m;


# direct methods
.method public constructor <init>(Ll2/c;Li2/f0;Landroidx/compose/ui/platform/AndroidComposeView;Lc93/m;Lc93/a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/f2;->w:Ll2/c;

    iput-object p2, p0, Lb3/f2;->x:Li2/f0;

    iput-object p3, p0, Lb3/f2;->y:Landroidx/compose/ui/platform/AndroidComposeView;

    iput-object p4, p0, Lb3/f2;->z:Lc93/m;

    iput-object p5, p0, Lb3/f2;->E:Lc93/a;

    const p1, 0x7fffffff

    int-to-long p1, p1

    const/16 p3, 0x20

    shl-long p3, p1, p3

    const-wide v0, 0xffffffffL

    and-long/2addr p1, v0

    or-long/2addr p1, p3

    iput-wide p1, p0, Lb3/f2;->F:J

    invoke-static {}, Li2/l0;->a()[F

    move-result-object p1

    iput-object p1, p0, Lb3/f2;->H:[F

    invoke-static {}, Lvb/g;->a()Ly3/d;

    move-result-object p1

    iput-object p1, p0, Lb3/f2;->K:Ly3/c;

    sget-object p1, Ly3/m;->w:Ly3/m;

    iput-object p1, p0, Lb3/f2;->L:Ly3/m;

    new-instance p1, Lk2/b;

    invoke-direct {p1}, Lk2/b;-><init>()V

    iput-object p1, p0, Lb3/f2;->M:Lk2/b;

    sget-wide p1, Li2/e1;->b:J

    iput-wide p1, p0, Lb3/f2;->O:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Lb3/f2;->S:Z

    new-instance p1, La3/m1;

    const/4 p2, 0x6

    invoke-direct {p1, p0, p2}, La3/m1;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lb3/f2;->U:La3/m1;

    return-void
.end method


# virtual methods
.method public final a()[F
    .locals 5

    iget-object v0, p0, Lb3/f2;->I:[F

    if-nez v0, :cond_0

    invoke-static {}, Li2/l0;->a()[F

    move-result-object v0

    iput-object v0, p0, Lb3/f2;->I:[F

    :cond_0
    iget-boolean v1, p0, Lb3/f2;->R:Z

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-nez v1, :cond_1

    aget v1, v0, v2

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_3

    return-object v3

    :cond_1
    iput-boolean v2, p0, Lb3/f2;->R:Z

    invoke-virtual {p0}, Lb3/f2;->b()[F

    move-result-object v1

    iget-boolean v4, p0, Lb3/f2;->S:Z

    if-eqz v4, :cond_2

    return-object v1

    :cond_2
    invoke-static {v1, v0}, Lb3/o0;->m([F[F)Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_3
    return-object v0

    :cond_4
    const/high16 v1, 0x7fc00000    # Float.NaN

    aput v1, v0, v2

    return-object v3
.end method

.method public final b()[F
    .locals 24

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lb3/f2;->Q:Z

    iget-object v2, v0, Lb3/f2;->H:[F

    if-eqz v1, :cond_2

    iget-object v1, v0, Lb3/f2;->w:Ll2/c;

    iget-wide v3, v1, Ll2/c;->v:J

    iget-object v1, v1, Ll2/c;->a:Ll2/e;

    const-wide v5, 0x7fffffff7fffffffL

    and-long/2addr v5, v3

    const-wide v7, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v5, v5, v7

    if-nez v5, :cond_0

    iget-wide v3, v0, Lb3/f2;->F:J

    invoke-static {v3, v4}, Lv63/b;->l(J)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljc/x;->L(J)J

    move-result-wide v3

    :cond_0
    const/16 v5, 0x20

    shr-long v5, v3, v5

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    const-wide v6, 0xffffffffL

    and-long/2addr v3, v6

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-interface {v1}, Ll2/e;->J()F

    move-result v4

    invoke-interface {v1}, Ll2/e;->I()F

    move-result v6

    invoke-interface {v1}, Ll2/e;->K()F

    move-result v7

    invoke-interface {v1}, Ll2/e;->i()F

    move-result v8

    invoke-interface {v1}, Ll2/e;->k()F

    move-result v9

    invoke-interface {v1}, Ll2/e;->z()F

    move-result v10

    invoke-interface {v1}, Ll2/e;->O()F

    move-result v1

    float-to-double v11, v7

    const-wide v13, 0x3f91df46a2529d39L    # 0.017453292519943295

    mul-double/2addr v11, v13

    move-wide v15, v13

    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    move-result-wide v13

    double-to-float v7, v13

    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    move-result-wide v11

    double-to-float v11, v11

    neg-float v12, v7

    mul-float v13, v6, v11

    const/high16 v14, 0x3f800000    # 1.0f

    mul-float v17, v14, v7

    sub-float v13, v13, v17

    mul-float/2addr v6, v7

    mul-float v17, v14, v11

    add-float v17, v17, v6

    move v6, v14

    move-wide/from16 v18, v15

    float-to-double v14, v8

    mul-double v14, v14, v18

    move/from16 v16, v6

    move v8, v7

    invoke-static {v14, v15}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    double-to-float v6, v6

    invoke-static {v14, v15}, Ljava/lang/Math;->cos(D)D

    move-result-wide v14

    double-to-float v7, v14

    neg-float v14, v6

    mul-float v15, v8, v6

    mul-float/2addr v8, v7

    mul-float v20, v11, v6

    mul-float v21, v11, v7

    mul-float v22, v4, v7

    mul-float v23, v17, v6

    add-float v23, v23, v22

    neg-float v4, v4

    mul-float/2addr v4, v6

    mul-float v17, v17, v7

    add-float v17, v17, v4

    move v6, v3

    float-to-double v3, v9

    mul-double v3, v3, v18

    move-wide/from16 v18, v3

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->sin(D)D

    move-result-wide v3

    double-to-float v3, v3

    move v9, v6

    move v4, v7

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->cos(D)D

    move-result-wide v6

    double-to-float v6, v6

    neg-float v7, v3

    mul-float v18, v7, v4

    mul-float v19, v6, v15

    add-float v19, v19, v18

    mul-float/2addr v4, v6

    mul-float/2addr v15, v3

    add-float/2addr v15, v4

    mul-float v4, v3, v11

    mul-float/2addr v11, v6

    mul-float/2addr v7, v14

    mul-float v18, v6, v8

    add-float v18, v18, v7

    mul-float/2addr v6, v14

    mul-float/2addr v3, v8

    add-float/2addr v3, v6

    mul-float/2addr v15, v10

    mul-float/2addr v4, v10

    mul-float/2addr v3, v10

    mul-float v19, v19, v1

    mul-float/2addr v11, v1

    mul-float v18, v18, v1

    mul-float v20, v20, v16

    mul-float v12, v12, v16

    mul-float v21, v21, v16

    array-length v1, v2

    const/16 v6, 0x10

    const/4 v7, 0x0

    if-ge v1, v6, :cond_1

    goto :goto_0

    :cond_1
    aput v15, v2, v7

    const/4 v1, 0x1

    aput v4, v2, v1

    const/4 v1, 0x2

    aput v3, v2, v1

    const/4 v1, 0x3

    const/4 v6, 0x0

    aput v6, v2, v1

    const/4 v1, 0x4

    aput v19, v2, v1

    const/4 v1, 0x5

    aput v11, v2, v1

    const/4 v1, 0x6

    aput v18, v2, v1

    const/4 v1, 0x7

    aput v6, v2, v1

    const/16 v1, 0x8

    aput v20, v2, v1

    const/16 v1, 0x9

    aput v12, v2, v1

    const/16 v1, 0xa

    aput v21, v2, v1

    const/16 v1, 0xb

    aput v6, v2, v1

    neg-float v1, v5

    mul-float/2addr v15, v1

    mul-float v6, v9, v19

    sub-float/2addr v15, v6

    add-float v15, v15, v23

    add-float/2addr v15, v5

    const/16 v5, 0xc

    aput v15, v2, v5

    mul-float/2addr v4, v1

    mul-float v5, v9, v11

    sub-float/2addr v4, v5

    add-float/2addr v4, v13

    add-float/2addr v4, v9

    const/16 v5, 0xd

    aput v4, v2, v5

    mul-float/2addr v1, v3

    mul-float v3, v9, v18

    sub-float/2addr v1, v3

    add-float v1, v1, v17

    const/16 v3, 0xe

    aput v1, v2, v3

    const/16 v1, 0xf

    aput v16, v2, v1

    :goto_0
    iput-boolean v7, v0, Lb3/f2;->Q:Z

    invoke-static {v2}, Li2/w0;->v([F)Z

    move-result v1

    iput-boolean v1, v0, Lb3/f2;->S:Z

    :cond_2
    return-object v2
.end method

.method public final c(Lh2/a;Z)V
    .locals 1

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lb3/f2;->a()[F

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lb3/f2;->b()[F

    move-result-object p2

    :goto_0
    iget-boolean v0, p0, Lb3/f2;->S:Z

    if-nez v0, :cond_2

    if-nez p2, :cond_1

    const/4 p2, 0x0

    iput p2, p1, Lh2/a;->a:F

    iput p2, p1, Lh2/a;->b:F

    iput p2, p1, Lh2/a;->c:F

    iput p2, p1, Lh2/a;->d:F

    return-void

    :cond_1
    invoke-static {p2, p1}, Li2/l0;->c([FLh2/a;)V

    :cond_2
    return-void
.end method

.method public final d(JZ)J
    .locals 1

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lb3/f2;->a()[F

    move-result-object p3

    if-nez p3, :cond_1

    const-wide p1, 0x7f8000007f800000L    # 1.404448428688076E306

    return-wide p1

    :cond_0
    invoke-virtual {p0}, Lb3/f2;->b()[F

    move-result-object p3

    :cond_1
    iget-boolean v0, p0, Lb3/f2;->S:Z

    if-eqz v0, :cond_2

    return-wide p1

    :cond_2
    invoke-static {p1, p2, p3}, Li2/l0;->b(J[F)J

    move-result-wide p1

    return-wide p1
.end method

.method public final e(J)V
    .locals 7

    iget-object v0, p0, Lb3/f2;->y:Landroidx/compose/ui/platform/AndroidComposeView;

    iget-boolean v1, v0, Landroidx/compose/ui/platform/AndroidComposeView;->F:Z

    if-eqz v1, :cond_0

    const/high16 v1, -0x3f800000    # -4.0f

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->P(F)V

    :cond_0
    iget-object v1, p0, Lb3/f2;->w:Ll2/c;

    iget-wide v2, v1, Ll2/c;->t:J

    invoke-static {v2, v3, p1, p2}, Ly3/j;->b(JJ)Z

    move-result v2

    if-nez v2, :cond_1

    iput-wide p1, v1, Ll2/c;->t:J

    iget-wide v2, v1, Ll2/c;->u:J

    iget-object v1, v1, Ll2/c;->a:Ll2/e;

    const/16 v4, 0x20

    shr-long v4, p1, v4

    long-to-int v4, v4

    const-wide v5, 0xffffffffL

    and-long/2addr p1, v5

    long-to-int p1, p1

    invoke-interface {v1, v4, v2, v3, p1}, Ll2/e;->f(IJI)V

    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-interface {p1, v0, v0}, Landroid/view/ViewParent;->onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V

    :cond_2
    return-void
.end method

.method public final f(J)V
    .locals 2

    iget-wide v0, p0, Lb3/f2;->F:J

    invoke-static {p1, p2, v0, v1}, Ly3/l;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lb3/f2;->y:Landroidx/compose/ui/platform/AndroidComposeView;

    iget-boolean v1, v0, Landroidx/compose/ui/platform/AndroidComposeView;->F:Z

    if-eqz v1, :cond_0

    const/high16 v1, -0x3f800000    # -4.0f

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->P(F)V

    :cond_0
    iput-wide p1, p0, Lb3/f2;->F:J

    iget-boolean p1, p0, Lb3/f2;->J:Z

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lb3/f2;->G:Z

    if-nez p1, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    iget-boolean p1, p0, Lb3/f2;->J:Z

    const/4 p2, 0x1

    if-eq p2, p1, :cond_1

    iput-boolean p2, p0, Lb3/f2;->J:Z

    invoke-virtual {v0, p0, p2}, Landroidx/compose/ui/platform/AndroidComposeView;->z(La3/a2;Z)V

    :cond_1
    return-void
.end method

.method public final g()V
    .locals 13

    iget-boolean v0, p0, Lb3/f2;->J:Z

    if-eqz v0, :cond_2

    iget-wide v0, p0, Lb3/f2;->O:J

    sget-wide v2, Li2/e1;->b:J

    invoke-static {v0, v1, v2, v3}, Li2/e1;->a(JJ)Z

    move-result v0

    const-wide v1, 0xffffffffL

    const/16 v3, 0x20

    if-nez v0, :cond_0

    iget-object v0, p0, Lb3/f2;->w:Ll2/c;

    iget-wide v4, v0, Ll2/c;->u:J

    iget-wide v6, p0, Lb3/f2;->F:J

    invoke-static {v4, v5, v6, v7}, Ly3/l;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lb3/f2;->w:Ll2/c;

    iget-wide v4, p0, Lb3/f2;->O:J

    invoke-static {v4, v5}, Li2/e1;->b(J)F

    move-result v4

    iget-wide v5, p0, Lb3/f2;->F:J

    shr-long/2addr v5, v3

    long-to-int v5, v5

    int-to-float v5, v5

    mul-float/2addr v4, v5

    iget-wide v5, p0, Lb3/f2;->O:J

    invoke-static {v5, v6}, Li2/e1;->c(J)F

    move-result v5

    iget-wide v6, p0, Lb3/f2;->F:J

    and-long/2addr v6, v1

    long-to-int v6, v6

    int-to-float v6, v6

    mul-float/2addr v5, v6

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v6, v4

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    shl-long/2addr v6, v3

    and-long/2addr v4, v1

    or-long/2addr v4, v6

    iget-wide v6, v0, Ll2/c;->v:J

    invoke-static {v6, v7, v4, v5}, Lh2/b;->c(JJ)Z

    move-result v6

    if-nez v6, :cond_0

    iput-wide v4, v0, Ll2/c;->v:J

    iget-object v0, v0, Ll2/c;->a:Ll2/e;

    invoke-interface {v0, v4, v5}, Ll2/e;->G(J)V

    :cond_0
    iget-object v0, p0, Lb3/f2;->w:Ll2/c;

    iget-object v4, p0, Lb3/f2;->K:Ly3/c;

    iget-object v5, p0, Lb3/f2;->L:Ly3/m;

    iget-wide v6, p0, Lb3/f2;->F:J

    iget-wide v8, v0, Ll2/c;->u:J

    iget-object v10, v0, Ll2/c;->a:Ll2/e;

    invoke-static {v8, v9, v6, v7}, Ly3/l;->a(JJ)Z

    move-result v8

    if-nez v8, :cond_1

    iput-wide v6, v0, Ll2/c;->u:J

    iget-wide v8, v0, Ll2/c;->t:J

    shr-long v11, v8, v3

    long-to-int v3, v11

    and-long/2addr v1, v8

    long-to-int v1, v1

    invoke-interface {v10, v3, v6, v7, v1}, Ll2/e;->f(IJI)V

    iget-wide v1, v0, Ll2/c;->i:J

    const-wide v6, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v1, v1, v6

    if-nez v1, :cond_1

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll2/c;->g:Z

    invoke-virtual {v0}, Ll2/c;->a()V

    :cond_1
    iput-object v4, v0, Ll2/c;->b:Ly3/c;

    iput-object v5, v0, Ll2/c;->c:Ly3/m;

    iget-object v1, p0, Lb3/f2;->U:La3/m1;

    iput-object v1, v0, Ll2/c;->d:Lkotlin/jvm/internal/m;

    iget-object v1, v0, Ll2/c;->e:La3/m1;

    invoke-interface {v10, v4, v5, v0, v1}, Ll2/e;->A(Ly3/c;Ly3/m;Ll2/c;La3/m1;)V

    iget-boolean v0, p0, Lb3/f2;->J:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lb3/f2;->J:Z

    iget-object v1, p0, Lb3/f2;->y:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v1, p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->z(La3/a2;Z)V

    :cond_2
    return-void
.end method

.method public final invalidate()V
    .locals 3

    iget-boolean v0, p0, Lb3/f2;->J:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lb3/f2;->G:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lb3/f2;->y:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    iget-boolean v1, p0, Lb3/f2;->J:Z

    const/4 v2, 0x1

    if-eq v2, v1, :cond_0

    iput-boolean v2, p0, Lb3/f2;->J:Z

    invoke-virtual {v0, p0, v2}, Landroidx/compose/ui/platform/AndroidComposeView;->z(La3/a2;Z)V

    :cond_0
    return-void
.end method
