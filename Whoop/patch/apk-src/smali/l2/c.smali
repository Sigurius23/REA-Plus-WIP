.class public final Ll2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ll2/e;

.field public b:Ly3/c;

.field public c:Ly3/m;

.field public d:Lkotlin/jvm/internal/m;

.field public final e:La3/m1;

.field public f:Landroid/graphics/Outline;

.field public g:Z

.field public h:J

.field public i:J

.field public j:F

.field public k:Li2/p0;

.field public l:Li2/s0;

.field public m:Li2/j;

.field public n:Z

.field public o:Lk2/b;

.field public p:Li2/h;

.field public q:I

.field public final r:Ll2/a;

.field public s:Z

.field public t:J

.field public u:J

.field public v:J

.field public w:Z

.field public x:Landroid/graphics/RectF;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toLowerCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "robolectric"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>(Ll2/e;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll2/c;->a:Ll2/e;

    sget-object v0, Lk2/d;->a:Ly3/d;

    iput-object v0, p0, Ll2/c;->b:Ly3/c;

    sget-object v0, Ly3/m;->w:Ly3/m;

    iput-object v0, p0, Ll2/c;->c:Ly3/m;

    sget-object v0, Ll2/b;->x:Ll2/b;

    iput-object v0, p0, Ll2/c;->d:Lkotlin/jvm/internal/m;

    new-instance v0, La3/m1;

    const/16 v1, 0x17

    invoke-direct {v0, p0, v1}, La3/m1;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Ll2/c;->e:La3/m1;

    const/4 v0, 0x1

    iput-boolean v0, p0, Ll2/c;->g:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Ll2/c;->h:J

    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    iput-wide v2, p0, Ll2/c;->i:J

    new-instance v4, Ll2/a;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iput-object v4, p0, Ll2/c;->r:Ll2/a;

    const/4 v4, 0x0

    invoke-interface {p1, v4}, Ll2/e;->s(Z)V

    iput-wide v0, p0, Ll2/c;->t:J

    iput-wide v0, p0, Ll2/c;->u:J

    iput-wide v2, p0, Ll2/c;->v:J

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 17

    move-object/from16 v0, p0

    iget-boolean v1, v0, Ll2/c;->g:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_f

    iget-boolean v1, v0, Ll2/c;->w:Z

    const/4 v3, 0x0

    iget-object v4, v0, Ll2/c;->a:Ll2/e;

    if-nez v1, :cond_1

    invoke-interface {v4}, Ll2/e;->N()F

    move-result v1

    const/4 v5, 0x0

    cmpl-float v1, v1, v5

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v4, v2}, Ll2/e;->s(Z)V

    const-wide/16 v5, 0x0

    invoke-interface {v4, v3, v5, v6}, Ll2/e;->E(Landroid/graphics/Outline;J)V

    goto/16 :goto_5

    :cond_1
    :goto_0
    iget-object v1, v0, Ll2/c;->l:Li2/s0;

    const-wide v5, 0xffffffffL

    const/16 v7, 0x20

    if-eqz v1, :cond_c

    iget-object v8, v0, Ll2/c;->x:Landroid/graphics/RectF;

    if-nez v8, :cond_2

    new-instance v8, Landroid/graphics/RectF;

    invoke-direct {v8}, Landroid/graphics/RectF;-><init>()V

    iput-object v8, v0, Ll2/c;->x:Landroid/graphics/RectF;

    :cond_2
    instance-of v9, v1, Li2/j;

    const-string v10, "Unable to obtain android.graphics.Path"

    if-eqz v9, :cond_b

    move-object v11, v1

    check-cast v11, Li2/j;

    iget-object v11, v11, Li2/j;->a:Landroid/graphics/Path;

    invoke-virtual {v11, v8, v2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v12, 0x1c

    const/4 v13, 0x1

    if-gt v11, v12, :cond_5

    move-object v12, v1

    check-cast v12, Li2/j;

    iget-object v12, v12, Li2/j;->a:Landroid/graphics/Path;

    invoke-virtual {v12}, Landroid/graphics/Path;->isConvex()Z

    move-result v12

    if-eqz v12, :cond_3

    goto :goto_1

    :cond_3
    iget-object v9, v0, Ll2/c;->f:Landroid/graphics/Outline;

    if-eqz v9, :cond_4

    invoke-virtual {v9}, Landroid/graphics/Outline;->setEmpty()V

    :cond_4
    iput-boolean v13, v0, Ll2/c;->n:Z

    move-object v12, v3

    goto :goto_3

    :cond_5
    :goto_1
    iget-object v12, v0, Ll2/c;->f:Landroid/graphics/Outline;

    if-nez v12, :cond_6

    new-instance v12, Landroid/graphics/Outline;

    invoke-direct {v12}, Landroid/graphics/Outline;-><init>()V

    iput-object v12, v0, Ll2/c;->f:Landroid/graphics/Outline;

    :cond_6
    const/16 v14, 0x1e

    if-lt v11, v14, :cond_7

    invoke-static {v12, v1}, Lb5/a;->m(Landroid/graphics/Outline;Li2/s0;)V

    goto :goto_2

    :cond_7
    if-eqz v9, :cond_a

    move-object v9, v1

    check-cast v9, Li2/j;

    iget-object v9, v9, Li2/j;->a:Landroid/graphics/Path;

    invoke-virtual {v12, v9}, Landroid/graphics/Outline;->setConvexPath(Landroid/graphics/Path;)V

    :goto_2
    invoke-virtual {v12}, Landroid/graphics/Outline;->canClip()Z

    move-result v9

    xor-int/2addr v9, v13

    iput-boolean v9, v0, Ll2/c;->n:Z

    :goto_3
    iput-object v1, v0, Ll2/c;->l:Li2/s0;

    if-eqz v12, :cond_8

    invoke-interface {v4}, Ll2/e;->a()F

    move-result v1

    invoke-virtual {v12, v1}, Landroid/graphics/Outline;->setAlpha(F)V

    move-object v3, v12

    :cond_8
    invoke-virtual {v8}, Landroid/graphics/RectF;->width()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-virtual {v8}, Landroid/graphics/RectF;->height()F

    move-result v8

    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    move-result v8

    int-to-long v9, v1

    shl-long/2addr v9, v7

    int-to-long v7, v8

    and-long/2addr v5, v7

    or-long/2addr v5, v9

    invoke-interface {v4, v3, v5, v6}, Ll2/e;->E(Landroid/graphics/Outline;J)V

    iget-boolean v1, v0, Ll2/c;->n:Z

    if-eqz v1, :cond_9

    iget-boolean v1, v0, Ll2/c;->w:Z

    if-eqz v1, :cond_9

    invoke-interface {v4, v2}, Ll2/e;->s(Z)V

    invoke-interface {v4}, Ll2/e;->e()V

    goto/16 :goto_5

    :cond_9
    iget-boolean v1, v0, Ll2/c;->w:Z

    invoke-interface {v4, v1}, Ll2/e;->s(Z)V

    goto/16 :goto_5

    :cond_a
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v1, v10}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_b
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v1, v10}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_c
    iget-boolean v1, v0, Ll2/c;->w:Z

    invoke-interface {v4, v1}, Ll2/e;->s(Z)V

    iget-object v1, v0, Ll2/c;->f:Landroid/graphics/Outline;

    if-nez v1, :cond_d

    new-instance v1, Landroid/graphics/Outline;

    invoke-direct {v1}, Landroid/graphics/Outline;-><init>()V

    iput-object v1, v0, Ll2/c;->f:Landroid/graphics/Outline;

    :cond_d
    move-object v8, v1

    iget-wide v9, v0, Ll2/c;->u:J

    invoke-static {v9, v10}, Lv63/b;->l(J)J

    move-result-wide v9

    iget-wide v11, v0, Ll2/c;->h:J

    iget-wide v13, v0, Ll2/c;->i:J

    const-wide v15, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v1, v13, v15

    if-nez v1, :cond_e

    goto :goto_4

    :cond_e
    move-wide v9, v13

    :goto_4
    shr-long v13, v11, v7

    long-to-int v1, v13

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    and-long/2addr v11, v5

    long-to-int v11, v11

    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v12

    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    move-result v12

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    shr-long v13, v9, v7

    long-to-int v14, v13

    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v13

    add-float/2addr v13, v1

    invoke-static {v13}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v11

    and-long/2addr v9, v5

    long-to-int v15, v9

    invoke-static {v15}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    add-float/2addr v9, v11

    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    move-result v9

    iget v13, v0, Ll2/c;->j:F

    move v11, v1

    move v10, v12

    move v12, v9

    move v9, v3

    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    invoke-interface {v4}, Ll2/e;->a()F

    move-result v1

    invoke-virtual {v8, v1}, Landroid/graphics/Outline;->setAlpha(F)V

    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-static {v15}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    int-to-long v9, v1

    shl-long/2addr v9, v7

    int-to-long v11, v3

    and-long/2addr v5, v11

    or-long/2addr v5, v9

    invoke-interface {v4, v8, v5, v6}, Ll2/e;->E(Landroid/graphics/Outline;J)V

    :cond_f
    :goto_5
    iput-boolean v2, v0, Ll2/c;->g:Z

    return-void
.end method

.method public final b()V
    .locals 15

    iget-boolean v0, p0, Ll2/c;->s:Z

    if-eqz v0, :cond_6

    iget v0, p0, Ll2/c;->q:I

    if-nez v0, :cond_6

    iget-object v0, p0, Ll2/c;->r:Ll2/a;

    iget-object v1, v0, Ll2/a;->b:Ljava/lang/Object;

    check-cast v1, Ll2/c;

    if-eqz v1, :cond_0

    iget v2, v1, Ll2/c;->q:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v1, Ll2/c;->q:I

    invoke-virtual {v1}, Ll2/c;->b()V

    const/4 v1, 0x0

    iput-object v1, v0, Ll2/a;->b:Ljava/lang/Object;

    :cond_0
    iget-object v0, v0, Ll2/a;->d:Ljava/lang/Object;

    check-cast v0, La0/w0;

    if-eqz v0, :cond_5

    iget-object v1, v0, La0/w0;->b:[Ljava/lang/Object;

    iget-object v2, v0, La0/w0;->a:[J

    array-length v3, v2

    add-int/lit8 v3, v3, -0x2

    if-ltz v3, :cond_4

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    aget-wide v6, v2, v5

    not-long v8, v6

    const/4 v10, 0x7

    shl-long/2addr v8, v10

    and-long/2addr v8, v6

    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v8, v10

    cmp-long v8, v8, v10

    if-eqz v8, :cond_3

    sub-int v8, v5, v3

    not-int v8, v8

    ushr-int/lit8 v8, v8, 0x1f

    const/16 v9, 0x8

    rsub-int/lit8 v8, v8, 0x8

    move v10, v4

    :goto_1
    if-ge v10, v8, :cond_2

    const-wide/16 v11, 0xff

    and-long/2addr v11, v6

    const-wide/16 v13, 0x80

    cmp-long v11, v11, v13

    if-gez v11, :cond_1

    shl-int/lit8 v11, v5, 0x3

    add-int/2addr v11, v10

    aget-object v11, v1, v11

    check-cast v11, Ll2/c;

    iget v12, v11, Ll2/c;->q:I

    add-int/lit8 v12, v12, -0x1

    iput v12, v11, Ll2/c;->q:I

    invoke-virtual {v11}, Ll2/c;->b()V

    :cond_1
    shr-long/2addr v6, v9

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_2
    if-ne v8, v9, :cond_4

    :cond_3
    if-eq v5, v3, :cond_4

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, La0/w0;->b()V

    :cond_5
    iget-object v0, p0, Ll2/c;->a:Ll2/e;

    invoke-interface {v0}, Ll2/e;->e()V

    :cond_6
    return-void
.end method

.method public final c(Lk2/e;)V
    .locals 14

    iget-object v0, p0, Ll2/c;->r:Ll2/a;

    iget-object v1, v0, Ll2/a;->b:Ljava/lang/Object;

    check-cast v1, Ll2/c;

    iput-object v1, v0, Ll2/a;->c:Ljava/lang/Object;

    iget-object v1, v0, Ll2/a;->d:Ljava/lang/Object;

    check-cast v1, La0/w0;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, La0/w0;->h()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, v0, Ll2/a;->e:Ljava/lang/Object;

    check-cast v2, La0/w0;

    if-nez v2, :cond_0

    sget-object v2, La0/e1;->a:La0/w0;

    new-instance v2, La0/w0;

    invoke-direct {v2}, La0/w0;-><init>()V

    iput-object v2, v0, Ll2/a;->e:Ljava/lang/Object;

    :cond_0
    invoke-virtual {v2, v1}, La0/w0;->j(La0/w0;)V

    invoke-virtual {v1}, La0/w0;->b()V

    :cond_1
    const/4 v1, 0x1

    iput-boolean v1, v0, Ll2/a;->a:Z

    iget-object v1, p0, Ll2/c;->d:Lkotlin/jvm/internal/m;

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    iput-boolean p1, v0, Ll2/a;->a:Z

    iget-object v1, v0, Ll2/a;->c:Ljava/lang/Object;

    check-cast v1, Ll2/c;

    if-eqz v1, :cond_2

    iget v2, v1, Ll2/c;->q:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v1, Ll2/c;->q:I

    invoke-virtual {v1}, Ll2/c;->b()V

    :cond_2
    iget-object v0, v0, Ll2/a;->e:Ljava/lang/Object;

    check-cast v0, La0/w0;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, La0/w0;->h()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, v0, La0/w0;->b:[Ljava/lang/Object;

    iget-object v2, v0, La0/w0;->a:[J

    array-length v3, v2

    add-int/lit8 v3, v3, -0x2

    if-ltz v3, :cond_6

    move v4, p1

    :goto_0
    aget-wide v5, v2, v4

    not-long v7, v5

    const/4 v9, 0x7

    shl-long/2addr v7, v9

    and-long/2addr v7, v5

    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v7, v9

    cmp-long v7, v7, v9

    if-eqz v7, :cond_5

    sub-int v7, v4, v3

    not-int v7, v7

    ushr-int/lit8 v7, v7, 0x1f

    const/16 v8, 0x8

    rsub-int/lit8 v7, v7, 0x8

    move v9, p1

    :goto_1
    if-ge v9, v7, :cond_4

    const-wide/16 v10, 0xff

    and-long/2addr v10, v5

    const-wide/16 v12, 0x80

    cmp-long v10, v10, v12

    if-gez v10, :cond_3

    shl-int/lit8 v10, v4, 0x3

    add-int/2addr v10, v9

    aget-object v10, v1, v10

    check-cast v10, Ll2/c;

    iget v11, v10, Ll2/c;->q:I

    add-int/lit8 v11, v11, -0x1

    iput v11, v10, Ll2/c;->q:I

    invoke-virtual {v10}, Ll2/c;->b()V

    :cond_3
    shr-long/2addr v5, v8

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_4
    if-ne v7, v8, :cond_6

    :cond_5
    if-eq v4, v3, :cond_6

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_6
    invoke-virtual {v0}, La0/w0;->b()V

    :cond_7
    return-void
.end method

.method public final d()Li2/p0;
    .locals 14

    iget-object v0, p0, Ll2/c;->k:Li2/p0;

    iget-object v1, p0, Ll2/c;->l:Li2/s0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    if-eqz v1, :cond_1

    new-instance v0, Li2/m0;

    invoke-direct {v0, v1}, Li2/m0;-><init>(Li2/s0;)V

    iput-object v0, p0, Ll2/c;->k:Li2/p0;

    return-object v0

    :cond_1
    iget-wide v0, p0, Ll2/c;->u:J

    invoke-static {v0, v1}, Lv63/b;->l(J)J

    move-result-wide v0

    iget-wide v2, p0, Ll2/c;->h:J

    iget-wide v4, p0, Ll2/c;->i:J

    const-wide v6, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v6, v4, v6

    if-nez v6, :cond_2

    goto :goto_0

    :cond_2
    move-wide v0, v4

    :goto_0
    const/16 v4, 0x20

    shr-long v5, v2, v4

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    const-wide v5, 0xffffffffL

    and-long/2addr v2, v5

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    shr-long v2, v0, v4

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    add-float v10, v2, v8

    and-long/2addr v0, v5

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    add-float v11, v0, v9

    iget v0, p0, Ll2/c;->j:F

    const/4 v1, 0x0

    cmpl-float v1, v0, v1

    if-lez v1, :cond_3

    new-instance v1, Li2/o0;

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v12, v0

    shl-long/2addr v2, v4

    and-long v4, v12, v5

    or-long v6, v2, v4

    invoke-static/range {v6 .. v11}, Lj93/l0;->d(JFFFF)Lh2/d;

    move-result-object v0

    invoke-direct {v1, v0}, Li2/o0;-><init>(Lh2/d;)V

    goto :goto_1

    :cond_3
    new-instance v1, Li2/n0;

    new-instance v0, Lh2/c;

    invoke-direct {v0, v8, v9, v10, v11}, Lh2/c;-><init>(FFFF)V

    invoke-direct {v1, v0}, Li2/n0;-><init>(Lh2/c;)V

    :goto_1
    iput-object v1, p0, Ll2/c;->k:Li2/p0;

    return-object v1
.end method

.method public final e(F)V
    .locals 2

    iget-object v0, p0, Ll2/c;->a:Ll2/e;

    invoke-interface {v0}, Ll2/e;->a()F

    move-result v1

    cmpg-float v1, v1, p1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-interface {v0, p1}, Ll2/e;->H(F)V

    return-void
.end method

.method public final f(JJF)V
    .locals 2

    iget-wide v0, p0, Ll2/c;->h:J

    invoke-static {v0, v1, p1, p2}, Lh2/b;->c(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, p0, Ll2/c;->i:J

    invoke-static {v0, v1, p3, p4}, Lh2/e;->b(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Ll2/c;->j:F

    cmpg-float v0, v0, p5

    if-nez v0, :cond_1

    iget-object v0, p0, Ll2/c;->l:Li2/s0;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Ll2/c;->k:Li2/p0;

    iput-object v0, p0, Ll2/c;->l:Li2/s0;

    const/4 v0, 0x1

    iput-boolean v0, p0, Ll2/c;->g:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Ll2/c;->n:Z

    iput-wide p1, p0, Ll2/c;->h:J

    iput-wide p3, p0, Ll2/c;->i:J

    iput p5, p0, Ll2/c;->j:F

    invoke-virtual {p0}, Ll2/c;->a()V

    return-void
.end method
