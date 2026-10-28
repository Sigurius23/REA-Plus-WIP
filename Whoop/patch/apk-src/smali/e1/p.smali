.class public final Le1/p;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/c0;
.implements La3/r;
.implements La3/j2;


# instance fields
.field public O:Ll3/g;

.field public P:Ll3/v0;

.field public Q:Lp3/h;

.field public R:Lkotlin/jvm/functions/Function1;

.field public S:I

.field public T:Z

.field public U:I

.field public V:I

.field public W:Ljava/util/List;

.field public X:Lkotlin/jvm/functions/Function1;

.field public Y:Le1/j;

.field public Z:Li2/a0;

.field public a0:Lu0/z0;

.field public b0:Lkotlin/jvm/functions/Function1;

.field public c0:Ljava/util/Map;

.field public d0:Le1/e;

.field public e0:Le1/n;

.field public f0:Le1/o;


# direct methods
.method public constructor <init>(Ll3/g;Ll3/v0;Lp3/h;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Le1/j;Li2/a0;Lu0/z0;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Lb2/v;-><init>()V

    iput-object p1, p0, Le1/p;->O:Ll3/g;

    iput-object p2, p0, Le1/p;->P:Ll3/v0;

    iput-object p3, p0, Le1/p;->Q:Lp3/h;

    iput-object p4, p0, Le1/p;->R:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Le1/p;->S:I

    iput-boolean p6, p0, Le1/p;->T:Z

    iput p7, p0, Le1/p;->U:I

    iput p8, p0, Le1/p;->V:I

    iput-object p9, p0, Le1/p;->W:Ljava/util/List;

    iput-object p10, p0, Le1/p;->X:Lkotlin/jvm/functions/Function1;

    iput-object p11, p0, Le1/p;->Y:Le1/j;

    iput-object p12, p0, Le1/p;->Z:Li2/a0;

    iput-object p13, p0, Le1/p;->a0:Lu0/z0;

    iput-object p14, p0, Le1/p;->b0:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final E(La3/w0;Ly2/q0;I)I
    .locals 0

    invoke-virtual {p0, p1}, Le1/p;->Z0(Ly3/c;)Le1/e;

    move-result-object p2

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Le1/e;->a(ILy3/m;)I

    move-result p1

    return p1
.end method

.method public final M0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final O(La3/p0;)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    iget-object v0, v2, La3/p0;->w:Lk2/b;

    iget-boolean v3, v1, Lb2/v;->N:Z

    if-nez v3, :cond_0

    goto/16 :goto_d

    :cond_0
    iget-object v3, v1, Le1/p;->Y:Le1/j;

    const-wide v9, 0xffffffffL

    const/16 v11, 0x20

    const/4 v12, 0x0

    if-eqz v3, :cond_a

    iget-object v4, v3, Le1/j;->x:Lf1/a1;

    check-cast v4, Lf1/b1;

    invoke-virtual {v4}, Lf1/b1;->a()La0/k0;

    move-result-object v4

    iget-wide v5, v3, Le1/j;->w:J

    invoke-virtual {v4, v5, v6}, La0/k0;->e(J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf1/u;

    if-nez v4, :cond_1

    goto/16 :goto_5

    :cond_1
    invoke-virtual {v4}, Lf1/u;->c()Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v4}, Lf1/u;->d()Lf1/t;

    move-result-object v5

    invoke-virtual {v5}, Lf1/t;->a()I

    move-result v5

    goto :goto_0

    :cond_2
    invoke-virtual {v4}, Lf1/u;->b()Lf1/t;

    move-result-object v5

    invoke-virtual {v5}, Lf1/t;->a()I

    move-result v5

    :goto_0
    invoke-virtual {v4}, Lf1/u;->c()Z

    move-result v6

    if-nez v6, :cond_3

    invoke-virtual {v4}, Lf1/u;->b()Lf1/t;

    move-result-object v4

    invoke-virtual {v4}, Lf1/t;->a()I

    move-result v4

    goto :goto_1

    :cond_3
    invoke-virtual {v4}, Lf1/u;->d()Lf1/t;

    move-result-object v4

    invoke-virtual {v4}, Lf1/t;->a()I

    move-result v4

    :goto_1
    if-ne v5, v4, :cond_4

    goto/16 :goto_5

    :cond_4
    iget-object v6, v3, Le1/j;->E:Lf1/l;

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Lf1/l;->b()I

    move-result v6

    goto :goto_2

    :cond_5
    move v6, v12

    :goto_2
    if-le v5, v6, :cond_6

    move v5, v6

    :cond_6
    if-le v4, v6, :cond_7

    move v4, v6

    :cond_7
    iget-object v6, v3, Le1/j;->z:Le1/l;

    invoke-virtual {v6, v5, v4}, Le1/l;->c(II)Li2/j;

    move-result-object v4

    if-nez v4, :cond_8

    goto :goto_5

    :cond_8
    iget-object v5, v3, Le1/j;->z:Le1/l;

    invoke-virtual {v5}, Le1/l;->d()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v5

    shr-long/2addr v5, v11

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v16

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v5

    and-long/2addr v5, v9

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v17

    iget-object v5, v0, Lk2/b;->x:La3/p;

    invoke-virtual {v5}, La3/p;->A()J

    move-result-wide v6

    invoke-virtual {v5}, La3/p;->w()Li2/v;

    move-result-object v8

    invoke-interface {v8}, Li2/v;->q()V

    :try_start_0
    iget-object v8, v5, La3/p;->x:Ljava/lang/Object;

    move-object v13, v8

    check-cast v13, Laj/d;

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x1

    invoke-virtual/range {v13 .. v18}, Laj/d;->d(FFFFI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    move-object v8, v4

    move-object v13, v5

    :try_start_1
    iget-wide v4, v3, Le1/j;->y:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-wide v14, v6

    const/4 v7, 0x0

    move-object v3, v8

    const/16 v8, 0x3c

    const/4 v6, 0x0

    :try_start_2
    invoke-static/range {v2 .. v8}, Lk2/e;->z(Lk2/e;Li2/s0;JFLk2/f;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {v13, v14, v15}, Ld;->z(La3/p;J)V

    goto :goto_5

    :catchall_0
    move-exception v0

    goto :goto_4

    :catchall_1
    move-exception v0

    :goto_3
    move-wide v14, v6

    goto :goto_4

    :catchall_2
    move-exception v0

    move-object v13, v5

    goto :goto_3

    :goto_4
    invoke-static {v13, v14, v15}, Ld;->z(La3/p;J)V

    throw v0

    :cond_9
    move-object v8, v4

    iget-wide v4, v3, Le1/j;->y:J

    const/4 v7, 0x0

    move-object v3, v8

    const/16 v8, 0x3c

    const/4 v6, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v8}, Lk2/e;->z(Lk2/e;Li2/s0;JFLk2/f;I)V

    :cond_a
    :goto_5
    iget-object v0, v0, Lk2/b;->x:La3/p;

    invoke-virtual {v0}, La3/p;->w()Li2/v;

    move-result-object v3

    invoke-virtual/range {p0 .. p1}, Le1/p;->Z0(Ly3/c;)Le1/e;

    move-result-object v0

    iget-object v2, v0, Le1/e;->o:Ll3/r0;

    if-eqz v2, :cond_1c

    iget-object v0, v2, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v2}, Ll3/r0;->e()Z

    move-result v4

    const/4 v13, 0x1

    if-eqz v4, :cond_c

    iget v4, v1, Le1/p;->S:I

    const/4 v5, 0x3

    if-ne v4, v5, :cond_b

    goto :goto_6

    :cond_b
    move v14, v13

    goto :goto_7

    :cond_c
    :goto_6
    move v14, v12

    :goto_7
    if-eqz v14, :cond_d

    iget-wide v4, v2, Ll3/r0;->c:J

    shr-long v6, v4, v11

    long-to-int v2, v6

    int-to-float v2, v2

    and-long/2addr v4, v9

    long-to-int v4, v4

    int-to-float v4, v4

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v5, v2

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v7, v2

    shl-long v4, v5, v11

    and-long v6, v7, v9

    or-long/2addr v4, v6

    const-wide/16 v6, 0x0

    invoke-static {v6, v7, v4, v5}, Lhg3/i;->j(JJ)Lh2/c;

    move-result-object v2

    invoke-interface {v3}, Li2/v;->q()V

    invoke-static {v3, v2}, Li2/v;->h(Li2/v;Lh2/c;)V

    :cond_d
    :try_start_3
    iget-object v2, v1, Le1/p;->P:Ll3/v0;

    iget-object v2, v2, Ll3/v0;->a:Ll3/m0;

    iget-object v4, v2, Ll3/m0;->m:Lw3/l;

    if-nez v4, :cond_e

    sget-object v4, Lw3/l;->b:Lw3/l;

    :cond_e
    move-object v7, v4

    goto :goto_8

    :catchall_3
    move-exception v0

    goto/16 :goto_f

    :goto_8
    iget-object v4, v2, Ll3/m0;->n:Li2/z0;

    if-nez v4, :cond_f

    sget-object v4, Li2/z0;->d:Li2/z0;

    :cond_f
    move-object v6, v4

    iget-object v4, v2, Ll3/m0;->p:Lk2/f;

    if-nez v4, :cond_10

    sget-object v4, Lk2/h;->a:Lk2/h;

    :cond_10
    move-object v8, v4

    iget-object v2, v2, Ll3/m0;->a:Lw3/o;

    invoke-interface {v2}, Lw3/o;->c()Li2/t;

    move-result-object v4

    if-eqz v4, :cond_11

    iget-object v2, v1, Le1/p;->P:Ll3/v0;

    iget-object v2, v2, Ll3/v0;->a:Ll3/m0;

    iget-object v2, v2, Ll3/m0;->a:Lw3/o;

    invoke-interface {v2}, Lw3/o;->a()F

    move-result v5

    move-object v2, v0

    invoke-static/range {v2 .. v8}, Ll3/w;->j(Ll3/w;Li2/v;Li2/t;FLi2/z0;Lw3/l;Lk2/f;)V

    goto :goto_b

    :cond_11
    move-object v2, v0

    iget-object v0, v1, Le1/p;->Z:Li2/a0;

    if-eqz v0, :cond_12

    invoke-interface {v0}, Li2/a0;->a()J

    move-result-wide v4

    goto :goto_9

    :cond_12
    sget-wide v4, Li2/x;->n:J

    :goto_9
    const-wide/16 v9, 0x10

    cmp-long v0, v4, v9

    if-eqz v0, :cond_13

    goto :goto_a

    :cond_13
    iget-object v0, v1, Le1/p;->P:Ll3/v0;

    invoke-virtual {v0}, Ll3/v0;->c()J

    move-result-wide v4

    cmp-long v0, v4, v9

    if-eqz v0, :cond_14

    iget-object v0, v1, Le1/p;->P:Ll3/v0;

    invoke-virtual {v0}, Ll3/v0;->c()J

    move-result-wide v4

    goto :goto_a

    :cond_14
    sget-wide v4, Li2/x;->b:J

    :goto_a
    invoke-static/range {v2 .. v8}, Ll3/w;->i(Ll3/w;Li2/v;JLi2/z0;Lw3/l;Lk2/f;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :goto_b
    if-eqz v14, :cond_15

    invoke-interface {v3}, Li2/v;->g()V

    :cond_15
    iget-object v0, v1, Le1/p;->f0:Le1/o;

    if-eqz v0, :cond_16

    invoke-virtual {v0}, Le1/o;->d()Z

    move-result v0

    if-ne v0, v13, :cond_16

    move v0, v12

    goto :goto_c

    :cond_16
    iget-object v0, v1, Le1/p;->O:Ll3/g;

    invoke-static {v0}, Lhg3/i;->V(Ll3/g;)Z

    move-result v0

    :goto_c
    if-nez v0, :cond_1a

    iget-object v0, v1, Le1/p;->W:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    if-eqz v0, :cond_17

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_18

    :cond_17
    move v12, v13

    :cond_18
    if-nez v12, :cond_19

    goto :goto_e

    :cond_19
    :goto_d
    return-void

    :cond_1a
    :goto_e
    invoke-virtual/range {p1 .. p1}, La3/p0;->a()V

    return-void

    :goto_f
    if-eqz v14, :cond_1b

    invoke-interface {v3}, Li2/v;->g()V

    :cond_1b
    throw v0

    :cond_1c
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public final X0(ZZZZ)V
    .locals 10

    if-nez p2, :cond_0

    if-nez p3, :cond_0

    if-eqz p4, :cond_1

    :cond_0
    invoke-virtual {p0}, Le1/p;->Y0()Le1/e;

    move-result-object v0

    iget-object v1, p0, Le1/p;->O:Ll3/g;

    iget-object v2, p0, Le1/p;->P:Ll3/v0;

    iget-object v3, p0, Le1/p;->Q:Lp3/h;

    iget v4, p0, Le1/p;->S:I

    iget-boolean v5, p0, Le1/p;->T:Z

    iget v6, p0, Le1/p;->U:I

    iget v7, p0, Le1/p;->V:I

    iget-object v8, p0, Le1/p;->W:Ljava/util/List;

    iget-object v9, p0, Le1/p;->a0:Lu0/z0;

    iput-object v1, v0, Le1/e;->a:Ll3/g;

    invoke-virtual {v0, v2}, Le1/e;->f(Ll3/v0;)V

    iput-object v3, v0, Le1/e;->b:Lp3/h;

    iput v4, v0, Le1/e;->c:I

    iput-boolean v5, v0, Le1/e;->d:Z

    iput v6, v0, Le1/e;->e:I

    iput v7, v0, Le1/e;->f:I

    iput-object v8, v0, Le1/e;->g:Ljava/util/List;

    iput-object v9, v0, Le1/e;->h:Lu0/z0;

    iget-wide v1, v0, Le1/e;->s:J

    const/4 v3, 0x2

    shl-long/2addr v1, v3

    const-wide/16 v3, 0x2

    or-long/2addr v1, v3

    iput-wide v1, v0, Le1/e;->s:J

    const/4 v1, 0x0

    iput-object v1, v0, Le1/e;->m:Laa3/i1;

    iput-object v1, v0, Le1/e;->o:Ll3/r0;

    const/4 v2, -0x1

    iput v2, v0, Le1/e;->q:I

    iput v2, v0, Le1/e;->p:I

    iput-object v1, v0, Le1/e;->r:Le1/d;

    :cond_1
    iget-boolean v0, p0, Lb2/v;->N:Z

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    if-nez p2, :cond_3

    if-eqz p1, :cond_4

    iget-object v0, p0, Le1/p;->e0:Le1/n;

    if-eqz v0, :cond_4

    :cond_3
    invoke-static {p0}, La3/g;->j(La3/j2;)V

    :cond_4
    if-nez p2, :cond_5

    if-nez p3, :cond_5

    if-eqz p4, :cond_6

    :cond_5
    invoke-static {p0}, La3/g;->i(La3/c0;)V

    invoke-static {p0}, La3/g;->h(La3/r;)V

    :cond_6
    if-eqz p1, :cond_7

    invoke-static {p0}, La3/g;->h(La3/r;)V

    :cond_7
    :goto_0
    return-void
.end method

.method public final Y0()Le1/e;
    .locals 11

    iget-object v0, p0, Le1/p;->d0:Le1/e;

    if-nez v0, :cond_0

    new-instance v1, Le1/e;

    iget-object v2, p0, Le1/p;->O:Ll3/g;

    iget-object v3, p0, Le1/p;->P:Ll3/v0;

    iget-object v4, p0, Le1/p;->Q:Lp3/h;

    iget v5, p0, Le1/p;->S:I

    iget-boolean v6, p0, Le1/p;->T:Z

    iget v7, p0, Le1/p;->U:I

    iget v8, p0, Le1/p;->V:I

    iget-object v9, p0, Le1/p;->W:Ljava/util/List;

    iget-object v10, p0, Le1/p;->a0:Lu0/z0;

    invoke-direct/range {v1 .. v10}, Le1/e;-><init>(Ll3/g;Ll3/v0;Lp3/h;IZIILjava/util/List;Lu0/z0;)V

    iput-object v1, p0, Le1/p;->d0:Le1/e;

    :cond_0
    iget-object v0, p0, Le1/p;->d0:Le1/e;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final Z0(Ly3/c;)Le1/e;
    .locals 2

    iget-object v0, p0, Le1/p;->f0:Le1/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Le1/o;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Le1/o;->a()Le1/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Le1/e;->d(Ly3/c;)V

    return-object v0

    :cond_0
    invoke-virtual {p0}, Le1/p;->Y0()Le1/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Le1/e;->d(Ly3/c;)V

    return-object v0
.end method

.method public final a1(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Le1/j;Lkotlin/jvm/functions/Function1;)Z
    .locals 2

    iget-object v0, p0, Le1/p;->R:Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x1

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Le1/p;->R:Lkotlin/jvm/functions/Function1;

    move p1, v1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Le1/p;->X:Lkotlin/jvm/functions/Function1;

    if-eq v0, p2, :cond_1

    iput-object p2, p0, Le1/p;->X:Lkotlin/jvm/functions/Function1;

    move p1, v1

    :cond_1
    iget-object p2, p0, Le1/p;->Y:Le1/j;

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    iput-object p3, p0, Le1/p;->Y:Le1/j;

    move p1, v1

    :cond_2
    iget-object p2, p0, Le1/p;->b0:Lkotlin/jvm/functions/Function1;

    if-eq p2, p4, :cond_3

    iput-object p4, p0, Le1/p;->b0:Lkotlin/jvm/functions/Function1;

    return v1

    :cond_3
    return p1
.end method

.method public final b(Ly2/t0;Ly2/q0;J)Ly2/s0;
    .locals 6

    const-string v0, "TextAnnotatedStringNode:measure"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0, p1}, Le1/p;->Z0(Ly3/c;)Le1/e;

    move-result-object v0

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v1

    invoke-virtual {v0, p3, p4, v1}, Le1/e;->c(JLy3/m;)Z

    move-result p3

    iget-object p4, v0, Le1/e;->o:Ll3/r0;

    if-eqz p4, :cond_6

    iget-wide v0, p4, Ll3/r0;->c:J

    iget-object v2, p4, Ll3/r0;->b:Ll3/w;

    iget-object v2, v2, Ll3/w;->a:Laa3/i1;

    invoke-virtual {v2}, Laa3/i1;->b()Z

    if-eqz p3, :cond_4

    const/4 p3, 0x2

    invoke-static {p0, p3}, La3/g;->n(La3/n;I)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/node/NodeCoordinator;->n1()V

    iget-object v2, p0, Le1/p;->R:Lkotlin/jvm/functions/Function1;

    if-eqz v2, :cond_0

    invoke-interface {v2, p4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_1

    :cond_0
    :goto_0
    iget-object v2, p0, Le1/p;->Y:Le1/j;

    if-eqz v2, :cond_2

    iget-object v3, v2, Le1/j;->z:Le1/l;

    invoke-virtual {v3}, Le1/l;->e()Ll3/r0;

    move-result-object v3

    if-eqz v3, :cond_1

    iget-object v3, v3, Ll3/r0;->a:Ll3/q0;

    iget-object v3, v3, Ll3/q0;->a:Ll3/g;

    iget-object v4, p4, Ll3/r0;->a:Ll3/q0;

    iget-object v4, v4, Ll3/q0;->a:Ll3/g;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, v2, Le1/j;->x:Lf1/a1;

    iget-wide v4, v2, Le1/j;->w:J

    check-cast v3, Lf1/b1;

    invoke-virtual {v3, v4, v5}, Lf1/b1;->c(J)V

    :cond_1
    iget-object v3, v2, Le1/j;->z:Le1/l;

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v3, v5, p4, v4}, Le1/l;->a(Le1/l;Landroidx/compose/ui/node/NodeCoordinator;Ll3/r0;I)Le1/l;

    move-result-object v3

    iput-object v3, v2, Le1/j;->z:Le1/l;

    :cond_2
    iget-object v2, p0, Le1/p;->c0:Ljava/util/Map;

    if-nez v2, :cond_3

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, p3}, Ljava/util/LinkedHashMap;-><init>(I)V

    :cond_3
    sget-object p3, Ly2/d;->a:Ly2/m;

    iget v3, p4, Ll3/r0;->d:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, p3, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p3, Ly2/d;->b:Ly2/m;

    iget v3, p4, Ll3/r0;->e:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, p3, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v2, p0, Le1/p;->c0:Ljava/util/Map;

    :cond_4
    iget-object p3, p0, Le1/p;->X:Lkotlin/jvm/functions/Function1;

    if-eqz p3, :cond_5

    iget-object p4, p4, Ll3/r0;->f:Ljava/util/ArrayList;

    invoke-interface {p3, p4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    const/16 p3, 0x20

    shr-long p3, v0, p3

    long-to-int p3, p3

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int p4, v0

    invoke-static {p3, p3, p4, p4}, Lva3/l;->n(IIII)J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    iget-object v0, p0, Le1/p;->c0:Ljava/util/Map;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v1, Le1/m;

    const/4 v2, 0x0

    invoke-direct {v1, p2, v2}, Le1/m;-><init>(Ly2/j1;I)V

    invoke-interface {p1, p3, p4, v0, v1}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-object p1

    :cond_6
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1
.end method

.method public final b1(Ll3/v0;Ljava/util/List;IIZLp3/h;ILu0/z0;)Z
    .locals 2

    iget-object v0, p0, Le1/p;->P:Ll3/v0;

    invoke-virtual {v0, p1}, Ll3/v0;->d(Ll3/v0;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iput-object p1, p0, Le1/p;->P:Ll3/v0;

    iget-object p1, p0, Le1/p;->W:Ljava/util/List;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iput-object p2, p0, Le1/p;->W:Ljava/util/List;

    move v0, v1

    :cond_0
    iget p1, p0, Le1/p;->V:I

    if-eq p1, p3, :cond_1

    iput p3, p0, Le1/p;->V:I

    move v0, v1

    :cond_1
    iget p1, p0, Le1/p;->U:I

    if-eq p1, p4, :cond_2

    iput p4, p0, Le1/p;->U:I

    move v0, v1

    :cond_2
    iget-boolean p1, p0, Le1/p;->T:Z

    if-eq p1, p5, :cond_3

    iput-boolean p5, p0, Le1/p;->T:Z

    move v0, v1

    :cond_3
    iget-object p1, p0, Le1/p;->Q:Lp3/h;

    invoke-static {p1, p6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    iput-object p6, p0, Le1/p;->Q:Lp3/h;

    move v0, v1

    :cond_4
    iget p1, p0, Le1/p;->S:I

    if-ne p1, p7, :cond_5

    goto :goto_0

    :cond_5
    iput p7, p0, Le1/p;->S:I

    move v0, v1

    :goto_0
    iget-object p1, p0, Le1/p;->a0:Lu0/z0;

    invoke-static {p1, p8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    iput-object p8, p0, Le1/p;->a0:Lu0/z0;

    return v1

    :cond_6
    return v0
.end method

.method public final c1(Ll3/g;)Z
    .locals 3

    iget-object v0, p0, Le1/p;->O:Ll3/g;

    iget-object v0, v0, Ll3/g;->x:Ljava/lang/String;

    iget-object v1, p1, Ll3/g;->x:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Le1/p;->O:Ll3/g;

    iget-object v1, v1, Ll3/g;->w:Ljava/util/List;

    iget-object v2, p1, Ll3/g;->w:Ljava/util/List;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v0, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    if-eqz v1, :cond_2

    iput-object p1, p0, Le1/p;->O:Ll3/g;

    :cond_2
    if-nez v0, :cond_3

    const/4 p1, 0x0

    iput-object p1, p0, Le1/p;->f0:Le1/o;

    :cond_3
    return v1
.end method

.method public final g0(La3/w0;Ly2/q0;I)I
    .locals 0

    invoke-virtual {p0, p1}, Le1/p;->Z0(Ly3/c;)Le1/e;

    move-result-object p2

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object p1

    invoke-virtual {p2, p1}, Le1/e;->e(Ly3/m;)Laa3/i1;

    move-result-object p1

    invoke-virtual {p1}, Laa3/i1;->g()F

    move-result p1

    invoke-static {p1}, Lwb3/f;->l(F)I

    move-result p1

    return p1
.end method

.method public final n(Li3/z;)V
    .locals 6

    iget-object v0, p0, Le1/p;->e0:Le1/n;

    if-nez v0, :cond_0

    new-instance v0, Le1/n;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Le1/n;-><init>(Le1/p;I)V

    iput-object v0, p0, Le1/p;->e0:Le1/n;

    :cond_0
    iget-object v1, p0, Le1/p;->O:Ll3/g;

    invoke-static {p1, v1}, Li3/w;->l(Li3/z;Ll3/g;)V

    iget-object v1, p0, Le1/p;->f0:Le1/o;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Le1/o;->c()Ll3/g;

    move-result-object v2

    sget-object v3, Li3/u;->B:Li3/y;

    sget-object v4, Li3/w;->a:[Lj93/z;

    const/16 v5, 0xf

    aget-object v5, v4, v5

    invoke-virtual {v3, p1, v2}, Li3/y;->a(Li3/z;Ljava/lang/Object;)V

    invoke-virtual {v1}, Le1/o;->d()Z

    move-result v1

    sget-object v2, Li3/u;->C:Li3/y;

    const/16 v3, 0x10

    aget-object v3, v4, v3

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v2, p1, v1}, Li3/y;->a(Li3/z;Ljava/lang/Object;)V

    :cond_1
    new-instance v1, Le1/n;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Le1/n;-><init>(Le1/p;I)V

    sget-object v2, Li3/k;->k:Li3/y;

    new-instance v3, Li3/a;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v1}, Li3/a;-><init>(Ljava/lang/String;Ll83/e;)V

    move-object v1, p1

    check-cast v1, Li3/l;

    invoke-virtual {v1, v2, v3}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    new-instance v2, Le1/n;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v3}, Le1/n;-><init>(Le1/p;I)V

    sget-object v3, Li3/k;->l:Li3/y;

    new-instance v5, Li3/a;

    invoke-direct {v5, v4, v2}, Li3/a;-><init>(Ljava/lang/String;Ll83/e;)V

    invoke-virtual {v1, v3, v5}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    new-instance v2, La6/l0;

    const/16 v3, 0xa

    invoke-direct {v2, p0, v3}, La6/l0;-><init>(Ljava/lang/Object;I)V

    sget-object v3, Li3/k;->m:Li3/y;

    new-instance v5, Li3/a;

    invoke-direct {v5, v4, v2}, Li3/a;-><init>(Ljava/lang/String;Ll83/e;)V

    invoke-virtual {v1, v3, v5}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    invoke-static {p1, v0}, Li3/w;->b(Li3/z;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final o(La3/w0;Ly2/q0;I)I
    .locals 0

    invoke-virtual {p0, p1}, Le1/p;->Z0(Ly3/c;)Le1/e;

    move-result-object p2

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object p1

    invoke-virtual {p2, p1}, Le1/e;->e(Ly3/m;)Laa3/i1;

    move-result-object p1

    invoke-virtual {p1}, Laa3/i1;->c()F

    move-result p1

    invoke-static {p1}, Lwb3/f;->l(F)I

    move-result p1

    return p1
.end method

.method public final y(La3/w0;Ly2/q0;I)I
    .locals 0

    invoke-virtual {p0, p1}, Le1/p;->Z0(Ly3/c;)Le1/e;

    move-result-object p2

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Le1/e;->a(ILy3/m;)I

    move-result p1

    return p1
.end method
