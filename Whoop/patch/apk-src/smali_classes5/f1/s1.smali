.class public final Lf1/s1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final A:Lf1/p1;

.field public B:Z

.field public final a:Lu0/t1;

.field public b:Lq3/r;

.field public c:Lkotlin/jvm/functions/Function1;

.field public d:Lu0/s0;

.field public final e:Lp1/k1;

.field public f:Lq3/g0;

.field public g:Lc93/a;

.field public h:Lb3/r1;

.field public i:Lbc3/c0;

.field public j:Lf1/p;

.field public k:Lq2/a;

.field public l:Lg2/s;

.field public final m:Lp1/k1;

.field public final n:Lp1/k1;

.field public o:J

.field public p:Ll3/u0;

.field public q:J

.field public final r:Lp1/k1;

.field public final s:Lp1/k1;

.field public t:I

.field public u:Lq3/y;

.field public v:Lf1/e1;

.field public w:Ll3/u0;

.field public final x:Lp1/k1;

.field public final y:Lro/i;

.field public final z:Lf1/n1;


# direct methods
.method public constructor <init>(Lu0/t1;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/s1;->a:Lu0/t1;

    sget-object p1, Lu0/u1;->a:Lcom/google/android/material/datepicker/n;

    iput-object p1, p0, Lf1/s1;->b:Lq3/r;

    new-instance p1, Lu0/r;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lu0/r;-><init>(I)V

    iput-object p1, p0, Lf1/s1;->c:Lkotlin/jvm/functions/Function1;

    new-instance p1, Lq3/y;

    const/4 v0, 0x7

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-direct {p1, v0, v1, v2, v3}, Lq3/y;-><init>(ILjava/lang/String;J)V

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lf1/s1;->e:Lp1/k1;

    sget-object p1, Lq3/f0;->w:Lg40/h2;

    iput-object p1, p0, Lf1/s1;->f:Lq3/g0;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    iput-object v4, p0, Lf1/s1;->m:Lp1/k1;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lf1/s1;->n:Lp1/k1;

    iput-wide v2, p0, Lf1/s1;->o:J

    iput-wide v2, p0, Lf1/s1;->q:J

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lf1/s1;->r:Lp1/k1;

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lf1/s1;->s:Lp1/k1;

    const/4 p1, -0x1

    iput p1, p0, Lf1/s1;->t:I

    new-instance p1, Lq3/y;

    invoke-direct {p1, v0, v1, v2, v3}, Lq3/y;-><init>(ILjava/lang/String;J)V

    iput-object p1, p0, Lf1/s1;->u:Lq3/y;

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lf1/s1;->x:Lp1/k1;

    new-instance p1, Lro/i;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lro/i;-><init>(I)V

    iput-object p1, p0, Lf1/s1;->y:Lro/i;

    new-instance p1, Lf1/n1;

    invoke-direct {p1, p0}, Lf1/n1;-><init>(Lf1/s1;)V

    iput-object p1, p0, Lf1/s1;->z:Lf1/n1;

    new-instance p1, Lf1/p1;

    invoke-direct {p1, p0}, Lf1/p1;-><init>(Lf1/s1;)V

    iput-object p1, p0, Lf1/s1;->A:Lf1/p1;

    return-void
.end method

.method public static final a(Lf1/s1;Ll3/u0;)V
    .locals 11

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v0, p1, Ll3/u0;->a:J

    iget-object v3, p0, Lf1/s1;->j:Lf1/p;

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lf1/s1;->l()Ll3/g;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v4, v2, Ll3/g;->x:Ljava/lang/String;

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    iget-object v9, p0, Lf1/s1;->b:Lq3/r;

    const/16 v2, 0x20

    shr-long v5, v0, v2

    long-to-int v2, v5

    invoke-interface {v9, v2}, Lq3/r;->x(I)I

    move-result v2

    const-wide v5, 0xffffffffL

    and-long/2addr v0, v5

    long-to-int v0, v0

    invoke-interface {v9, v0}, Lq3/r;->x(I)I

    move-result v0

    invoke-static {v2, v0}, Lj93/l0;->f(II)J

    move-result-wide v5

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_3

    invoke-static {v5, v6}, Ll3/u0;->c(J)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lf1/s1;->i:Lbc3/c0;

    if-eqz v0, :cond_3

    new-instance v2, Lf1/o1;

    const/4 v10, 0x0

    move-object v8, p0

    move-object v7, p1

    invoke-direct/range {v2 .. v10}, Lf1/o1;-><init>(Lf1/p;Ljava/lang/String;JLl3/u0;Lf1/s1;Lq3/r;Lq83/d;)V

    const/4 p0, 0x3

    const/4 p1, 0x0

    invoke-static {v0, p1, p1, v2, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_3
    :goto_0
    return-void
.end method

.method public static final b(Lf1/s1;Ls83/c;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p1, Lf1/q1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lf1/q1;

    iget v1, v0, Lf1/q1;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf1/q1;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lf1/q1;

    invoke-direct {v0, p0, p1}, Lf1/q1;-><init>(Lf1/s1;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lf1/q1;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf1/q1;->y:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lf1/s1;->l()Ll3/g;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object v7, p1, Ll3/g;->x:Ljava/lang/String;

    if-eqz v7, :cond_5

    iget-object p1, p0, Lf1/s1;->w:Ll3/u0;

    if-eqz p1, :cond_5

    iget-wide v5, p1, Ll3/u0;->a:J

    move-wide v8, v5

    iget-object v6, p0, Lf1/s1;->j:Lf1/p;

    if-eqz v6, :cond_5

    iget-object p1, p0, Lf1/s1;->b:Lq3/r;

    const/16 v2, 0x20

    shr-long v10, v8, v2

    long-to-int v2, v10

    invoke-interface {p1, v2}, Lq3/r;->x(I)I

    move-result p1

    iget-object p0, p0, Lf1/s1;->b:Lq3/r;

    const-wide v10, 0xffffffffL

    and-long/2addr v8, v10

    long-to-int v2, v8

    invoke-interface {p0, v2}, Lq3/r;->x(I)I

    move-result p0

    invoke-static {p1, p0}, Lj93/l0;->f(II)J

    move-result-wide v8

    iput v4, v0, Lf1/q1;->y:I

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result p0

    if-nez p0, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {v8, v9}, Ll3/u0;->c(J)Z

    move-result p0

    if-eqz p0, :cond_4

    :goto_1
    move-object p0, v3

    goto :goto_2

    :cond_4
    new-instance v5, Lf0/c;

    const/4 v10, 0x0

    const/4 v11, 0x2

    invoke-direct/range {v5 .. v11}, Lf0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLq83/d;I)V

    iget-object p0, v6, Lf1/p;->a:Lq83/j;

    new-instance p1, Lb2/y;

    const/4 v2, 0x0

    invoke-direct {p1, v6, v5, v2}, Lb2/y;-><init>(Lf1/p;Lc93/m;Lq83/d;)V

    invoke-static {p0, p1, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    :goto_2
    if-ne p0, v1, :cond_5

    return-object v1

    :cond_5
    :goto_3
    return-object v3
.end method

.method public static final c(Lf1/s1;Lq3/y;JZZLf1/v;Z)J
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lf1/s1;->d:Lu0/s0;

    if-eqz v2, :cond_16

    invoke-virtual {v2}, Lu0/s0;->d()Lu0/p1;

    move-result-object v2

    if-nez v2, :cond_0

    goto/16 :goto_e

    :cond_0
    iget-object v3, v0, Lf1/s1;->b:Lq3/r;

    iget-wide v4, v1, Lq3/y;->b:J

    iget-object v1, v1, Lq3/y;->a:Ll3/g;

    sget v6, Ll3/u0;->c:I

    const/16 v6, 0x20

    shr-long v7, v4, v6

    long-to-int v7, v7

    invoke-interface {v3, v7}, Lq3/r;->x(I)I

    move-result v3

    iget-object v7, v0, Lf1/s1;->b:Lq3/r;

    const-wide v8, 0xffffffffL

    and-long v10, v4, v8

    long-to-int v10, v10

    invoke-interface {v7, v10}, Lq3/r;->x(I)I

    move-result v7

    invoke-static {v3, v7}, Lj93/l0;->f(II)J

    move-result-wide v10

    const/4 v3, 0x0

    move-wide/from16 v12, p2

    invoke-virtual {v2, v12, v13, v3}, Lu0/p1;->b(JZ)I

    move-result v7

    if-nez p5, :cond_2

    if-eqz p4, :cond_1

    goto :goto_0

    :cond_1
    shr-long v12, v10, v6

    long-to-int v12, v12

    move/from16 v17, v12

    goto :goto_1

    :cond_2
    :goto_0
    move/from16 v17, v7

    :goto_1
    if-eqz p5, :cond_4

    if-eqz p4, :cond_3

    goto :goto_2

    :cond_3
    and-long v12, v10, v8

    long-to-int v12, v12

    move/from16 v18, v12

    goto :goto_3

    :cond_4
    :goto_2
    move/from16 v18, v7

    :goto_3
    iget-object v12, v0, Lf1/s1;->v:Lf1/e1;

    const/4 v13, -0x1

    if-nez p4, :cond_6

    if-eqz v12, :cond_6

    iget v14, v0, Lf1/s1;->t:I

    if-ne v14, v13, :cond_5

    goto :goto_4

    :cond_5
    move/from16 v19, v14

    goto :goto_5

    :cond_6
    :goto_4
    move/from16 v19, v13

    :goto_5
    iget-object v2, v2, Lu0/p1;->a:Ll3/r0;

    new-instance v21, Lf1/e1;

    if-eqz p4, :cond_7

    const/4 v10, 0x0

    move-wide/from16 v28, v4

    move-wide/from16 v26, v8

    move-object/from16 v24, v10

    goto :goto_6

    :cond_7
    new-instance v13, Lf1/u;

    new-instance v14, Lf1/t;

    move-wide/from16 v26, v8

    shr-long v8, v10, v6

    long-to-int v8, v8

    invoke-static {v2, v8}, Lf1/y0;->v(Ll3/r0;I)Lw3/j;

    move-result-object v9

    move-wide/from16 v28, v4

    const-wide/16 v3, 0x1

    invoke-direct {v14, v9, v8, v3, v4}, Lf1/t;-><init>(Lw3/j;IJ)V

    new-instance v5, Lf1/t;

    and-long v8, v10, v26

    long-to-int v8, v8

    invoke-static {v2, v8}, Lf1/y0;->v(Ll3/r0;I)Lw3/j;

    move-result-object v9

    invoke-direct {v5, v9, v8, v3, v4}, Lf1/t;-><init>(Lw3/j;IJ)V

    invoke-static {v10, v11}, Ll3/u0;->g(J)Z

    move-result v3

    invoke-direct {v13, v14, v5, v3}, Lf1/u;-><init>(Lf1/t;Lf1/t;Z)V

    move-object/from16 v24, v13

    :goto_6
    new-instance v25, Lf1/r;

    const-wide/16 v14, 0x1

    const/16 v16, 0x1

    move-object/from16 v20, v2

    move-object/from16 v13, v25

    invoke-direct/range {v13 .. v20}, Lf1/r;-><init>(JIIIILl3/r0;)V

    const/16 v22, 0x1

    const/16 v23, 0x1

    move-object/from16 v20, v21

    move/from16 v21, p5

    invoke-direct/range {v20 .. v25}, Lf1/e1;-><init>(ZIILf1/u;Lf1/r;)V

    move-object/from16 v2, v20

    invoke-virtual {v2, v12}, Lf1/e1;->f(Lf1/q0;)Z

    move-result v3

    if-nez v3, :cond_8

    move-wide/from16 v4, v28

    goto :goto_7

    :cond_8
    iput-object v2, v0, Lf1/s1;->v:Lf1/e1;

    iput v7, v0, Lf1/s1;->t:I

    move-object/from16 v3, p6

    invoke-virtual {v3, v2}, Lf1/v;->a(Lf1/q0;)Lf1/u;

    move-result-object v2

    iget-object v3, v0, Lf1/s1;->b:Lq3/r;

    iget-object v4, v2, Lf1/u;->a:Lf1/t;

    iget v4, v4, Lf1/t;->b:I

    invoke-interface {v3, v4}, Lq3/r;->n(I)I

    move-result v3

    iget-object v4, v0, Lf1/s1;->b:Lq3/r;

    iget-object v2, v2, Lf1/u;->b:Lf1/t;

    iget v2, v2, Lf1/t;->b:I

    invoke-interface {v4, v2}, Lq3/r;->n(I)I

    move-result v2

    invoke-static {v3, v2}, Lj93/l0;->f(II)J

    move-result-wide v2

    move-wide/from16 v4, v28

    invoke-static {v2, v3, v4, v5}, Ll3/u0;->b(JJ)Z

    move-result v7

    if-eqz v7, :cond_9

    :goto_7
    return-wide v4

    :cond_9
    invoke-static {v2, v3}, Ll3/u0;->g(J)Z

    move-result v7

    invoke-static {v4, v5}, Ll3/u0;->g(J)Z

    move-result v8

    const/4 v9, 0x1

    if-eq v7, v8, :cond_a

    and-long v7, v2, v26

    long-to-int v7, v7

    shr-long v10, v2, v6

    long-to-int v6, v10

    invoke-static {v7, v6}, Lj93/l0;->f(II)J

    move-result-wide v6

    invoke-static {v6, v7, v4, v5}, Ll3/u0;->b(JJ)Z

    move-result v6

    if-eqz v6, :cond_a

    move v6, v9

    goto :goto_8

    :cond_a
    const/4 v6, 0x0

    :goto_8
    invoke-static {v2, v3}, Ll3/u0;->c(J)Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-static {v4, v5}, Ll3/u0;->c(J)Z

    move-result v4

    if-eqz v4, :cond_b

    move v4, v9

    goto :goto_9

    :cond_b
    const/4 v4, 0x0

    :goto_9
    if-eqz p7, :cond_c

    iget-object v5, v1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_c

    if-nez v6, :cond_c

    if-nez v4, :cond_c

    iget-object v4, v0, Lf1/s1;->k:Lq2/a;

    if-eqz v4, :cond_c

    const/16 v5, 0x9

    invoke-interface {v4, v5}, Lq2/a;->a(I)V

    :cond_c
    invoke-static {v1, v2, v3}, Lf1/s1;->e(Ll3/g;J)Lq3/y;

    move-result-object v1

    iget-object v4, v0, Lf1/s1;->c:Lkotlin/jvm/functions/Function1;

    invoke-interface {v4, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ll3/u0;

    invoke-direct {v1, v2, v3}, Ll3/u0;-><init>(J)V

    iput-object v1, v0, Lf1/s1;->w:Ll3/u0;

    if-nez p7, :cond_d

    invoke-static {v2, v3}, Ll3/u0;->c(J)Z

    move-result v1

    xor-int/2addr v1, v9

    invoke-virtual {v0, v1}, Lf1/s1;->s(Z)V

    :cond_d
    iget-object v1, v0, Lf1/s1;->d:Lu0/s0;

    if-eqz v1, :cond_e

    iget-object v1, v1, Lu0/s0;->q:Lp1/k1;

    invoke-static/range {p7 .. p7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v1, v4}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_e
    iget-object v1, v0, Lf1/s1;->d:Lu0/s0;

    if-eqz v1, :cond_10

    invoke-static {v2, v3}, Ll3/u0;->c(J)Z

    move-result v4

    if-nez v4, :cond_f

    invoke-static {v0, v9}, Lf1/y0;->x(Lf1/s1;Z)Z

    move-result v4

    if-eqz v4, :cond_f

    move v4, v9

    goto :goto_a

    :cond_f
    const/4 v4, 0x0

    :goto_a
    iget-object v1, v1, Lu0/s0;->m:Lp1/k1;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v1, v4}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_10
    iget-object v1, v0, Lf1/s1;->d:Lu0/s0;

    if-eqz v1, :cond_13

    invoke-static {v2, v3}, Ll3/u0;->c(J)Z

    move-result v4

    if-nez v4, :cond_11

    const/4 v4, 0x0

    invoke-static {v0, v4}, Lf1/y0;->x(Lf1/s1;Z)Z

    move-result v5

    if-eqz v5, :cond_12

    move v5, v9

    goto :goto_b

    :cond_11
    const/4 v4, 0x0

    :cond_12
    move v5, v4

    :goto_b
    iget-object v1, v1, Lu0/s0;->n:Lp1/k1;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v1, v5}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    goto :goto_c

    :cond_13
    const/4 v4, 0x0

    :goto_c
    iget-object v1, v0, Lf1/s1;->d:Lu0/s0;

    if-eqz v1, :cond_15

    invoke-static {v2, v3}, Ll3/u0;->c(J)Z

    move-result v5

    if-eqz v5, :cond_14

    invoke-static {v0, v9}, Lf1/y0;->x(Lf1/s1;Z)Z

    move-result v0

    if-eqz v0, :cond_14

    goto :goto_d

    :cond_14
    move v9, v4

    :goto_d
    iget-object v0, v1, Lu0/s0;->o:Lp1/k1;

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_15
    return-wide v2

    :cond_16
    :goto_e
    sget-wide v0, Ll3/u0;->b:J

    return-wide v0
.end method

.method public static e(Ll3/g;J)Lq3/y;
    .locals 2

    new-instance v0, Lq3/y;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lq3/y;-><init>(Ll3/g;JLl3/u0;)V

    return-object v0
.end method


# virtual methods
.method public final d(Z)Lbc3/c2;
    .locals 4

    iget-object v0, p0, Lf1/s1;->i:Lbc3/c0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v2, Lbc3/d0;->z:Lbc3/d0;

    new-instance v3, Lf1/k1;

    invoke-direct {v3, p0, p1, v1}, Lf1/k1;-><init>(Lf1/s1;ZLq83/d;)V

    const/4 p1, 0x1

    invoke-static {v0, v1, v2, v3, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v1
.end method

.method public final f()V
    .locals 5

    iget-object v0, p0, Lf1/s1;->i:Lbc3/c0;

    if-eqz v0, :cond_0

    sget-object v1, Lbc3/d0;->z:Lbc3/d0;

    new-instance v2, Lf1/m1;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v2, p0, v4, v3}, Lf1/m1;-><init>(Lf1/s1;Lq83/d;I)V

    const/4 v3, 0x1

    invoke-static {v0, v4, v1, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    return-void
.end method

.method public final g(Lh2/b;)V
    .locals 6

    invoke-virtual {p0}, Lf1/s1;->m()Lq3/y;

    move-result-object v0

    iget-wide v0, v0, Lq3/y;->b:J

    invoke-static {v0, v1}, Ll3/u0;->c(J)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lf1/s1;->d:Lu0/s0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lu0/s0;->d()Lu0/p1;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz p1, :cond_1

    if-eqz v0, :cond_1

    iget-object v2, p0, Lf1/s1;->b:Lq3/r;

    iget-wide v3, p1, Lh2/b;->a:J

    const/4 v5, 0x1

    invoke-virtual {v0, v3, v4, v5}, Lu0/p1;->b(JZ)I

    move-result v0

    invoke-interface {v2, v0}, Lq3/r;->n(I)I

    move-result v0

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lf1/s1;->m()Lq3/y;

    move-result-object v0

    iget-wide v2, v0, Lq3/y;->b:J

    invoke-static {v2, v3}, Ll3/u0;->e(J)I

    move-result v0

    :goto_1
    invoke-virtual {p0}, Lf1/s1;->m()Lq3/y;

    move-result-object v2

    invoke-static {v0, v0}, Lj93/l0;->f(II)J

    move-result-wide v3

    const/4 v0, 0x5

    invoke-static {v2, v1, v3, v4, v0}, Lq3/y;->b(Lq3/y;Ll3/g;JI)Lq3/y;

    move-result-object v0

    iget-object v1, p0, Lf1/s1;->c:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v0, v0, Lq3/y;->b:J

    new-instance v2, Ll3/u0;

    invoke-direct {v2, v0, v1}, Ll3/u0;-><init>(J)V

    iput-object v2, p0, Lf1/s1;->w:Ll3/u0;

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lf1/s1;->m()Lq3/y;

    move-result-object p1

    iget-object p1, p1, Lq3/y;->a:Ll3/g;

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_3

    sget-object p1, Lu0/g0;->y:Lu0/g0;

    goto :goto_2

    :cond_3
    sget-object p1, Lu0/g0;->w:Lu0/g0;

    :goto_2
    invoke-virtual {p0, p1}, Lf1/s1;->p(Lu0/g0;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lf1/s1;->s(Z)V

    return-void
.end method

.method public final h(Z)V
    .locals 1

    iget-object v0, p0, Lf1/s1;->d:Lu0/s0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lu0/s0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lf1/s1;->l:Lg2/s;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lg2/s;->c(Lg2/s;)V

    :cond_0
    invoke-virtual {p0}, Lf1/s1;->m()Lq3/y;

    move-result-object v0

    iput-object v0, p0, Lf1/s1;->u:Lq3/y;

    invoke-virtual {p0, p1}, Lf1/s1;->s(Z)V

    sget-object p1, Lu0/g0;->x:Lu0/g0;

    invoke-virtual {p0, p1}, Lf1/s1;->p(Lu0/g0;)V

    return-void
.end method

.method public final i()Lh2/b;
    .locals 1

    iget-object v0, p0, Lf1/s1;->s:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/b;

    return-object v0
.end method

.method public final j()Z
    .locals 1

    iget-object v0, p0, Lf1/s1;->n:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final k(Z)J
    .locals 5

    iget-object v0, p0, Lf1/s1;->d:Lu0/s0;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lu0/s0;->d()Lu0/p1;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, v0, Lu0/p1;->a:Ll3/r0;

    invoke-virtual {p0}, Lf1/s1;->l()Ll3/g;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    iget-object v2, v0, Ll3/r0;->a:Ll3/q0;

    iget-object v2, v2, Ll3/q0;->a:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    iget-object v1, v1, Ll3/g;->x:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Lf1/s1;->m()Lq3/y;

    move-result-object v1

    if-eqz p1, :cond_2

    iget-wide v1, v1, Lq3/y;->b:J

    sget v3, Ll3/u0;->c:I

    const/16 v3, 0x20

    shr-long/2addr v1, v3

    :goto_0
    long-to-int v1, v1

    goto :goto_1

    :cond_2
    iget-wide v1, v1, Lq3/y;->b:J

    sget v3, Ll3/u0;->c:I

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    goto :goto_0

    :goto_1
    iget-object v2, p0, Lf1/s1;->b:Lq3/r;

    invoke-interface {v2, v1}, Lq3/r;->x(I)I

    move-result v1

    invoke-virtual {p0}, Lf1/s1;->m()Lq3/y;

    move-result-object v2

    iget-wide v2, v2, Lq3/y;->b:J

    invoke-static {v2, v3}, Ll3/u0;->g(J)Z

    move-result v2

    invoke-static {v0, v1, p1, v2}, Lf1/y0;->u(Ll3/r0;IZZ)J

    move-result-wide v0

    return-wide v0

    :cond_3
    :goto_2
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    return-wide v0
.end method

.method public final l()Ll3/g;
    .locals 1

    iget-object v0, p0, Lf1/s1;->d:Lu0/s0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lu0/s0;->a:Lu0/c1;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lu0/c1;->a:Ll3/g;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final m()Lq3/y;
    .locals 1

    iget-object v0, p0, Lf1/s1;->e:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq3/y;

    return-object v0
.end method

.method public final n()V
    .locals 3

    iget-object v0, p0, Lf1/s1;->y:Lro/i;

    iget-object v0, v0, Lro/i;->x:Ljava/lang/Object;

    check-cast v0, La1/k;

    if-eqz v0, :cond_1

    iget-object v1, v0, La1/k;->U:Lbc3/c2;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    iput-object v2, v0, La1/k;->U:Lbc3/c2;

    :cond_1
    :goto_0
    return-void
.end method

.method public final o()V
    .locals 5

    iget-object v0, p0, Lf1/s1;->i:Lbc3/c0;

    if-eqz v0, :cond_0

    sget-object v1, Lbc3/d0;->z:Lbc3/d0;

    new-instance v2, Lf1/m1;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v2, p0, v4, v3}, Lf1/m1;-><init>(Lf1/s1;Lq83/d;I)V

    invoke-static {v0, v4, v1, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    return-void
.end method

.method public final p(Lu0/g0;)V
    .locals 2

    iget-object v0, p0, Lf1/s1;->d:Lu0/s0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lu0/s0;->a()Lu0/g0;

    move-result-object v1

    if-ne v1, p1, :cond_0

    const/4 v0, 0x0

    :cond_0
    if-eqz v0, :cond_1

    iget-object v0, v0, Lu0/s0;->k:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final q()V
    .locals 4

    invoke-static {}, Lyl/a;->c()Lz1/f;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lz1/f;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0}, Lyl/a;->e(Lz1/f;)Lz1/f;

    move-result-object v2

    :try_start_0
    invoke-virtual {p0}, Lf1/s1;->j()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lf1/s1;->d:Lu0/s0;

    if-eqz v3, :cond_1

    iget-object v3, v3, Lu0/s0;->q:Lp1/k1;

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v0, v2, v1}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p0, Lf1/s1;->y:Lro/i;

    invoke-virtual {v0}, Lro/i;->D()V

    return-void

    :catchall_0
    move-exception v3

    goto :goto_2

    :cond_2
    :goto_1
    invoke-static {v0, v2, v1}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    return-void

    :goto_2
    invoke-static {v0, v2, v1}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    throw v3
.end method

.method public final r(Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lf1/r1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lf1/r1;

    iget v1, v0, Lf1/r1;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf1/r1;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lf1/r1;

    invoke-direct {v0, p0, p1}, Lf1/r1;-><init>(Lf1/s1;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lf1/r1;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf1/r1;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lf1/r1;->w:Lf1/s1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lf1/s1;->h:Lb3/r1;

    const/4 v2, 0x0

    if-eqz p1, :cond_5

    iput-object p0, v0, Lf1/r1;->w:Lf1/s1;

    iput v3, v0, Lf1/r1;->z:I

    check-cast p1, Lb3/i;

    iget-object p1, p1, Lb3/i;->a:Lb3/j;

    iget-object p1, p1, Lb3/j;->a:Landroid/content/ClipboardManager;

    invoke-virtual {p1}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    move-result-object p1

    if-eqz p1, :cond_3

    new-instance v0, Lb3/q1;

    invoke-direct {v0, p1}, Lb3/q1;-><init>(Landroid/content/ClipData;)V

    move-object p1, v0

    goto :goto_1

    :cond_3
    move-object p1, v2

    :goto_1
    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object v0, p0

    :goto_2
    move-object v2, p1

    check-cast v2, Lb3/q1;

    goto :goto_3

    :cond_5
    move-object v0, p0

    :goto_3
    iget-object p1, v0, Lf1/s1;->x:Lp1/k1;

    invoke-virtual {p1, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final s(Z)V
    .locals 2

    iget-object v0, p0, Lf1/s1;->d:Lu0/s0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lu0/s0;->l:Lp1/k1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lf1/s1;->q()V

    return-void

    :cond_1
    invoke-virtual {p0}, Lf1/s1;->n()V

    return-void
.end method
