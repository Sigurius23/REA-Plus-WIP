.class public final Lf0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ly3/c;

.field public b:J

.field public final c:Lf0/g0;

.field public final d:Lp1/k1;

.field public final e:Z

.field public f:Z

.field public g:J

.field public h:J

.field public final i:La3/o;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ly3/c;JLl0/k1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lf0/k;->a:Ly3/c;

    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    iput-wide v0, p0, Lf0/k;->b:J

    new-instance p2, Lf0/g0;

    invoke-static {p3, p4}, Li2/w0;->H(J)I

    move-result p3

    invoke-direct {p2, p1, p3}, Lf0/g0;-><init>(Landroid/content/Context;I)V

    iput-object p2, p0, Lf0/k;->c:Lf0/g0;

    sget-object p1, Lp1/v0;->y:Lp1/v0;

    new-instance p3, Lp1/k1;

    sget-object p4, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p3, p4, p1}, Lp1/k1;-><init>(Ljava/lang/Object;Lp1/o2;)V

    iput-object p3, p0, Lf0/k;->d:Lp1/k1;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lf0/k;->e:Z

    const-wide/16 p3, 0x0

    iput-wide p3, p0, Lf0/k;->g:J

    const-wide/16 p3, -0x1

    iput-wide p3, p0, Lf0/k;->h:J

    new-instance p1, Lf0/j;

    invoke-direct {p1, p0}, Lf0/j;-><init>(Lf0/k;)V

    invoke-static {p1}, Lu2/c0;->a(Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Lu2/h0;

    move-result-object p1

    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p4, 0x1f

    if-lt p3, p4, :cond_0

    new-instance p3, Lf0/t1;

    invoke-direct {p3, p1, p0, p2}, Lf0/t1;-><init>(Lu2/h0;Lf0/k;Lf0/g0;)V

    goto :goto_0

    :cond_0
    new-instance p3, Lf0/l0;

    invoke-direct {p3, p1, p0, p2, p5}, Lf0/l0;-><init>(Lu2/h0;Lf0/k;Lf0/g0;Ll0/k1;)V

    :goto_0
    iput-object p3, p0, Lf0/k;->i:La3/o;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lf0/k;->c:Lf0/g0;

    iget-object v1, v0, Lf0/g0;->d:Landroid/widget/EdgeEffect;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    xor-int/2addr v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    iget-object v4, v0, Lf0/g0;->e:Landroid/widget/EdgeEffect;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Landroid/widget/EdgeEffect;->onRelease()V

    invoke-virtual {v4}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v4

    if-eqz v4, :cond_2

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move v1, v3

    goto :goto_2

    :cond_2
    :goto_1
    move v1, v2

    :cond_3
    :goto_2
    iget-object v4, v0, Lf0/g0;->f:Landroid/widget/EdgeEffect;

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Landroid/widget/EdgeEffect;->onRelease()V

    invoke-virtual {v4}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v4

    if-eqz v4, :cond_5

    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    move v1, v3

    goto :goto_4

    :cond_5
    :goto_3
    move v1, v2

    :cond_6
    :goto_4
    iget-object v0, v0, Lf0/g0;->g:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_8

    if-eqz v1, :cond_7

    goto :goto_5

    :cond_7
    move v2, v3

    :cond_8
    :goto_5
    move v1, v2

    :cond_9
    if-eqz v1, :cond_a

    invoke-virtual {p0}, Lf0/k;->d()V

    :cond_a
    return-void
.end method

.method public final b(JLc93/m;Ls83/c;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    instance-of v3, v2, Lf0/i;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lf0/i;

    iget v4, v3, Lf0/i;->z:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lf0/i;->z:I

    goto :goto_0

    :cond_0
    new-instance v3, Lf0/i;

    invoke-direct {v3, v0, v2}, Lf0/i;-><init>(Lf0/k;Ls83/c;)V

    :goto_0
    iget-object v2, v3, Lf0/i;->x:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lf0/i;->z:I

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    iget-object v10, v0, Lf0/k;->c:Lf0/g0;

    if-eqz v5, :cond_3

    if-eq v5, v8, :cond_2

    if-ne v5, v7, :cond_1

    iget-wide v3, v3, Lf0/i;->w:J

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v6

    :cond_3
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-wide v11, v0, Lf0/k;->g:J

    invoke-static {v11, v12}, Lh2/e;->f(J)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-static/range {p1 .. p2}, Ly3/q;->a(J)Ly3/q;

    move-result-object v2

    iput v8, v3, Lf0/i;->z:I

    invoke-interface {v1, v2, v3}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_4

    goto/16 :goto_3

    :cond_4
    return-object v6

    :cond_5
    iget-object v2, v10, Lf0/g0;->f:Landroid/widget/EdgeEffect;

    invoke-static {v2}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v2

    const/16 v5, 0x20

    iget-object v8, v0, Lf0/k;->a:Ly3/c;

    if-eqz v2, :cond_6

    invoke-static/range {p1 .. p2}, Ly3/q;->d(J)F

    move-result v2

    cmpg-float v2, v2, v9

    if-gez v2, :cond_6

    invoke-virtual {v10}, Lf0/g0;->c()Landroid/widget/EdgeEffect;

    move-result-object v2

    invoke-static/range {p1 .. p2}, Ly3/q;->d(J)F

    move-result v11

    iget-wide v12, v0, Lf0/k;->g:J

    shr-long/2addr v12, v5

    long-to-int v5, v12

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    invoke-static {v2, v11, v5, v8}, Ldp/d;->i(Landroid/widget/EdgeEffect;FFLy3/c;)F

    move-result v2

    goto :goto_1

    :cond_6
    iget-object v2, v10, Lf0/g0;->g:Landroid/widget/EdgeEffect;

    invoke-static {v2}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-static/range {p1 .. p2}, Ly3/q;->d(J)F

    move-result v2

    cmpl-float v2, v2, v9

    if-lez v2, :cond_7

    invoke-virtual {v10}, Lf0/g0;->d()Landroid/widget/EdgeEffect;

    move-result-object v2

    invoke-static/range {p1 .. p2}, Ly3/q;->d(J)F

    move-result v11

    neg-float v11, v11

    iget-wide v12, v0, Lf0/k;->g:J

    shr-long/2addr v12, v5

    long-to-int v5, v12

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    invoke-static {v2, v11, v5, v8}, Ldp/d;->i(Landroid/widget/EdgeEffect;FFLy3/c;)F

    move-result v2

    neg-float v2, v2

    goto :goto_1

    :cond_7
    move v2, v9

    :goto_1
    iget-object v5, v10, Lf0/g0;->d:Landroid/widget/EdgeEffect;

    invoke-static {v5}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v5

    const-wide v11, 0xffffffffL

    if-eqz v5, :cond_8

    invoke-static/range {p1 .. p2}, Ly3/q;->e(J)F

    move-result v5

    cmpg-float v5, v5, v9

    if-gez v5, :cond_8

    invoke-virtual {v10}, Lf0/g0;->e()Landroid/widget/EdgeEffect;

    move-result-object v5

    invoke-static/range {p1 .. p2}, Ly3/q;->e(J)F

    move-result v13

    iget-wide v14, v0, Lf0/k;->g:J

    and-long/2addr v11, v14

    long-to-int v11, v11

    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v11

    invoke-static {v5, v13, v11, v8}, Ldp/d;->i(Landroid/widget/EdgeEffect;FFLy3/c;)F

    move-result v5

    goto :goto_2

    :cond_8
    iget-object v5, v10, Lf0/g0;->e:Landroid/widget/EdgeEffect;

    invoke-static {v5}, Lf0/g0;->g(Landroid/widget/EdgeEffect;)Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-static/range {p1 .. p2}, Ly3/q;->e(J)F

    move-result v5

    cmpl-float v5, v5, v9

    if-lez v5, :cond_9

    invoke-virtual {v10}, Lf0/g0;->b()Landroid/widget/EdgeEffect;

    move-result-object v5

    invoke-static/range {p1 .. p2}, Ly3/q;->e(J)F

    move-result v13

    neg-float v13, v13

    iget-wide v14, v0, Lf0/k;->g:J

    and-long/2addr v11, v14

    long-to-int v11, v11

    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v11

    invoke-static {v5, v13, v11, v8}, Ldp/d;->i(Landroid/widget/EdgeEffect;FFLy3/c;)F

    move-result v5

    neg-float v5, v5

    goto :goto_2

    :cond_9
    move v5, v9

    :goto_2
    invoke-static {v2, v5}, Ls4/i;->a(FF)J

    move-result-wide v11

    invoke-static {v11, v12}, Ly3/q;->c(J)Z

    move-result v2

    if-nez v2, :cond_a

    invoke-virtual {v0}, Lf0/k;->d()V

    :cond_a
    move-wide/from16 v13, p1

    invoke-static {v13, v14, v11, v12}, Ly3/q;->f(JJ)J

    move-result-wide v11

    invoke-static {v11, v12}, Ly3/q;->a(J)Ly3/q;

    move-result-object v2

    iput-wide v11, v3, Lf0/i;->w:J

    iput v7, v3, Lf0/i;->z:I

    invoke-interface {v1, v2, v3}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_b

    :goto_3
    return-object v4

    :cond_b
    move-wide v3, v11

    :goto_4
    check-cast v2, Ly3/q;

    invoke-virtual {v2}, Ly3/q;->j()J

    move-result-wide v1

    invoke-static {v3, v4, v1, v2}, Ly3/q;->f(JJ)J

    move-result-wide v1

    const/4 v3, 0x0

    iput-boolean v3, v0, Lf0/k;->f:Z

    invoke-static {v1, v2}, Ly3/q;->d(J)F

    move-result v3

    cmpl-float v3, v3, v9

    if-lez v3, :cond_c

    invoke-virtual {v10}, Lf0/g0;->c()Landroid/widget/EdgeEffect;

    move-result-object v3

    invoke-static {v1, v2}, Ly3/q;->d(J)F

    move-result v4

    invoke-static {v4}, Le93/b;->X(F)I

    move-result v4

    invoke-static {v3, v4}, Ldp/d;->Q(Landroid/widget/EdgeEffect;I)V

    goto :goto_5

    :cond_c
    invoke-static {v1, v2}, Ly3/q;->d(J)F

    move-result v3

    cmpg-float v3, v3, v9

    if-gez v3, :cond_d

    invoke-virtual {v10}, Lf0/g0;->d()Landroid/widget/EdgeEffect;

    move-result-object v3

    invoke-static {v1, v2}, Ly3/q;->d(J)F

    move-result v4

    invoke-static {v4}, Le93/b;->X(F)I

    move-result v4

    neg-int v4, v4

    invoke-static {v3, v4}, Ldp/d;->Q(Landroid/widget/EdgeEffect;I)V

    :cond_d
    :goto_5
    invoke-static {v1, v2}, Ly3/q;->e(J)F

    move-result v3

    cmpl-float v3, v3, v9

    if-lez v3, :cond_e

    invoke-virtual {v10}, Lf0/g0;->e()Landroid/widget/EdgeEffect;

    move-result-object v3

    invoke-static {v1, v2}, Ly3/q;->e(J)F

    move-result v1

    invoke-static {v1}, Le93/b;->X(F)I

    move-result v1

    invoke-static {v3, v1}, Ldp/d;->Q(Landroid/widget/EdgeEffect;I)V

    goto :goto_6

    :cond_e
    invoke-static {v1, v2}, Ly3/q;->e(J)F

    move-result v3

    cmpg-float v3, v3, v9

    if-gez v3, :cond_f

    invoke-virtual {v10}, Lf0/g0;->b()Landroid/widget/EdgeEffect;

    move-result-object v3

    invoke-static {v1, v2}, Ly3/q;->e(J)F

    move-result v1

    invoke-static {v1}, Le93/b;->X(F)I

    move-result v1

    neg-int v1, v1

    invoke-static {v3, v1}, Ldp/d;->Q(Landroid/widget/EdgeEffect;I)V

    :cond_f
    :goto_6
    invoke-virtual {v0}, Lf0/k;->a()V

    return-object v6
.end method

.method public final c()J
    .locals 8

    iget-wide v0, p0, Lf0/k;->b:J

    const-wide v2, 0x7fffffff7fffffffL

    and-long/2addr v2, v0

    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lf0/k;->g:J

    invoke-static {v0, v1}, Ljc/x;->L(J)J

    move-result-wide v0

    :goto_0
    const/16 v2, 0x20

    shr-long v3, v0, v2

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    iget-wide v4, p0, Lf0/k;->g:J

    shr-long/2addr v4, v2

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    div-float/2addr v3, v4

    const-wide v4, 0xffffffffL

    and-long/2addr v0, v4

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    iget-wide v6, p0, Lf0/k;->g:J

    and-long/2addr v6, v4

    long-to-int v1, v6

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    div-float/2addr v0, v1

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v6, v1

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    shl-long v2, v6, v2

    and-long/2addr v0, v4

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public final d()V
    .locals 2

    iget-boolean v0, p0, Lf0/k;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf0/k;->d:Lp1/k1;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final e(J)F
    .locals 6

    invoke-virtual {p0}, Lf0/k;->c()J

    move-result-wide v0

    const/16 v2, 0x20

    shr-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    const-wide v1, 0xffffffffL

    and-long/2addr p1, v1

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    iget-wide v3, p0, Lf0/k;->g:J

    and-long/2addr v3, v1

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    div-float/2addr p2, v3

    iget-object v3, p0, Lf0/k;->c:Lf0/g0;

    invoke-virtual {v3}, Lf0/g0;->b()Landroid/widget/EdgeEffect;

    move-result-object v3

    neg-float p2, p2

    const/4 v4, 0x1

    int-to-float v4, v4

    sub-float/2addr v4, v0

    invoke-static {v3, p2, v4}, Ldp/d;->R(Landroid/widget/EdgeEffect;FF)F

    move-result p2

    neg-float p2, p2

    iget-wide v4, p0, Lf0/k;->g:J

    and-long v0, v4, v1

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    mul-float/2addr v0, p2

    invoke-static {v3}, Ldp/d;->G(Landroid/widget/EdgeEffect;)F

    move-result p2

    const/4 v1, 0x0

    cmpg-float p2, p2, v1

    if-nez p2, :cond_0

    return v0

    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    return p1
.end method

.method public final f(J)F
    .locals 5

    invoke-virtual {p0}, Lf0/k;->c()J

    move-result-wide v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    const/16 v1, 0x20

    shr-long/2addr p1, v1

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    iget-wide v2, p0, Lf0/k;->g:J

    shr-long/2addr v2, v1

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    div-float/2addr p2, v2

    iget-object v2, p0, Lf0/k;->c:Lf0/g0;

    invoke-virtual {v2}, Lf0/g0;->c()Landroid/widget/EdgeEffect;

    move-result-object v2

    const/4 v3, 0x1

    int-to-float v3, v3

    sub-float/2addr v3, v0

    invoke-static {v2, p2, v3}, Ldp/d;->R(Landroid/widget/EdgeEffect;FF)F

    move-result p2

    iget-wide v3, p0, Lf0/k;->g:J

    shr-long v0, v3, v1

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    mul-float/2addr v0, p2

    invoke-static {v2}, Ldp/d;->G(Landroid/widget/EdgeEffect;)F

    move-result p2

    const/4 v1, 0x0

    cmpg-float p2, p2, v1

    if-nez p2, :cond_0

    return v0

    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    return p1
.end method

.method public final g(J)F
    .locals 5

    invoke-virtual {p0}, Lf0/k;->c()J

    move-result-wide v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    const/16 v1, 0x20

    shr-long/2addr p1, v1

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    iget-wide v2, p0, Lf0/k;->g:J

    shr-long/2addr v2, v1

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    div-float/2addr p2, v2

    iget-object v2, p0, Lf0/k;->c:Lf0/g0;

    invoke-virtual {v2}, Lf0/g0;->d()Landroid/widget/EdgeEffect;

    move-result-object v2

    neg-float p2, p2

    invoke-static {v2, p2, v0}, Ldp/d;->R(Landroid/widget/EdgeEffect;FF)F

    move-result p2

    neg-float p2, p2

    iget-wide v3, p0, Lf0/k;->g:J

    shr-long v0, v3, v1

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    mul-float/2addr v0, p2

    invoke-static {v2}, Ldp/d;->G(Landroid/widget/EdgeEffect;)F

    move-result p2

    const/4 v1, 0x0

    cmpg-float p2, p2, v1

    if-nez p2, :cond_0

    return v0

    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    return p1
.end method

.method public final h(J)F
    .locals 6

    invoke-virtual {p0}, Lf0/k;->c()J

    move-result-wide v0

    const/16 v2, 0x20

    shr-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    const-wide v1, 0xffffffffL

    and-long/2addr p1, v1

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    iget-wide v3, p0, Lf0/k;->g:J

    and-long/2addr v3, v1

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    div-float/2addr p2, v3

    iget-object v3, p0, Lf0/k;->c:Lf0/g0;

    invoke-virtual {v3}, Lf0/g0;->e()Landroid/widget/EdgeEffect;

    move-result-object v3

    invoke-static {v3, p2, v0}, Ldp/d;->R(Landroid/widget/EdgeEffect;FF)F

    move-result p2

    iget-wide v4, p0, Lf0/k;->g:J

    and-long v0, v4, v1

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    mul-float/2addr v0, p2

    invoke-static {v3}, Ldp/d;->G(Landroid/widget/EdgeEffect;)F

    move-result p2

    const/4 v1, 0x0

    cmpg-float p2, p2, v1

    if-nez p2, :cond_0

    return v0

    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    return p1
.end method

.method public final i(J)V
    .locals 10

    iget-wide v0, p0, Lf0/k;->g:J

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Lh2/e;->b(JJ)Z

    move-result v0

    iget-wide v1, p0, Lf0/k;->g:J

    invoke-static {p1, p2, v1, v2}, Lh2/e;->b(JJ)Z

    move-result v1

    iput-wide p1, p0, Lf0/k;->g:J

    if-nez v1, :cond_7

    const/16 v2, 0x20

    shr-long v3, p1, v2

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-static {v3}, Le93/b;->X(F)I

    move-result v3

    const-wide v4, 0xffffffffL

    and-long/2addr p1, v4

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-static {p1}, Le93/b;->X(F)I

    move-result p1

    int-to-long v6, v3

    shl-long/2addr v6, v2

    int-to-long p1, p1

    and-long/2addr p1, v4

    or-long/2addr p1, v6

    iget-object v3, p0, Lf0/k;->c:Lf0/g0;

    iput-wide p1, v3, Lf0/g0;->c:J

    iget-object v6, v3, Lf0/g0;->d:Landroid/widget/EdgeEffect;

    if-eqz v6, :cond_0

    shr-long v7, p1, v2

    long-to-int v7, v7

    and-long v8, p1, v4

    long-to-int v8, v8

    invoke-virtual {v6, v7, v8}, Landroid/widget/EdgeEffect;->setSize(II)V

    :cond_0
    iget-object v6, v3, Lf0/g0;->e:Landroid/widget/EdgeEffect;

    if-eqz v6, :cond_1

    shr-long v7, p1, v2

    long-to-int v7, v7

    and-long v8, p1, v4

    long-to-int v8, v8

    invoke-virtual {v6, v7, v8}, Landroid/widget/EdgeEffect;->setSize(II)V

    :cond_1
    iget-object v6, v3, Lf0/g0;->f:Landroid/widget/EdgeEffect;

    if-eqz v6, :cond_2

    and-long v7, p1, v4

    long-to-int v7, v7

    shr-long v8, p1, v2

    long-to-int v8, v8

    invoke-virtual {v6, v7, v8}, Landroid/widget/EdgeEffect;->setSize(II)V

    :cond_2
    iget-object v6, v3, Lf0/g0;->g:Landroid/widget/EdgeEffect;

    if-eqz v6, :cond_3

    and-long v7, p1, v4

    long-to-int v7, v7

    shr-long v8, p1, v2

    long-to-int v8, v8

    invoke-virtual {v6, v7, v8}, Landroid/widget/EdgeEffect;->setSize(II)V

    :cond_3
    iget-object v6, v3, Lf0/g0;->h:Landroid/widget/EdgeEffect;

    if-eqz v6, :cond_4

    shr-long v7, p1, v2

    long-to-int v7, v7

    and-long v8, p1, v4

    long-to-int v8, v8

    invoke-virtual {v6, v7, v8}, Landroid/widget/EdgeEffect;->setSize(II)V

    :cond_4
    iget-object v6, v3, Lf0/g0;->i:Landroid/widget/EdgeEffect;

    if-eqz v6, :cond_5

    shr-long v7, p1, v2

    long-to-int v7, v7

    and-long v8, p1, v4

    long-to-int v8, v8

    invoke-virtual {v6, v7, v8}, Landroid/widget/EdgeEffect;->setSize(II)V

    :cond_5
    iget-object v6, v3, Lf0/g0;->j:Landroid/widget/EdgeEffect;

    if-eqz v6, :cond_6

    and-long v7, p1, v4

    long-to-int v7, v7

    shr-long v8, p1, v2

    long-to-int v8, v8

    invoke-virtual {v6, v7, v8}, Landroid/widget/EdgeEffect;->setSize(II)V

    :cond_6
    iget-object v3, v3, Lf0/g0;->k:Landroid/widget/EdgeEffect;

    if-eqz v3, :cond_7

    and-long/2addr v4, p1

    long-to-int v4, v4

    shr-long/2addr p1, v2

    long-to-int p1, p1

    invoke-virtual {v3, v4, p1}, Landroid/widget/EdgeEffect;->setSize(II)V

    :cond_7
    if-nez v0, :cond_8

    if-nez v1, :cond_8

    invoke-virtual {p0}, Lf0/k;->a()V

    :cond_8
    return-void
.end method
