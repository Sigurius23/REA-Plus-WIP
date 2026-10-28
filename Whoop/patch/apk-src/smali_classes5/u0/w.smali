.class public final Lu0/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/r0;


# instance fields
.field public final synthetic a:Lu0/s0;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:Lq3/y;

.field public final synthetic d:Lq3/r;

.field public final synthetic e:Ly3/c;

.field public final synthetic f:I


# direct methods
.method public constructor <init>(Lu0/s0;Lkotlin/jvm/functions/Function1;Lq3/y;Lq3/r;Ly3/c;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/w;->a:Lu0/s0;

    iput-object p2, p0, Lu0/w;->b:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lu0/w;->c:Lq3/y;

    iput-object p4, p0, Lu0/w;->d:Lq3/r;

    iput-object p5, p0, Lu0/w;->e:Ly3/c;

    iput p6, p0, Lu0/w;->f:I

    return-void
.end method


# virtual methods
.method public final a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
    .locals 29

    move-object/from16 v1, p0

    iget-object v0, v1, Lu0/w;->a:Lu0/s0;

    invoke-static {}, Lyl/a;->c()Lz1/f;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lz1/f;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-static {v2}, Lyl/a;->e(Lz1/f;)Lz1/f;

    move-result-object v4

    :try_start_0
    invoke-virtual {v0}, Lu0/s0;->d()Lu0/p1;

    move-result-object v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v2, v4, v3}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    if-eqz v15, :cond_1

    iget-object v2, v15, Lu0/p1;->a:Ll3/r0;

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    iget-object v3, v0, Lu0/s0;->a:Lu0/c1;

    invoke-interface/range {p1 .. p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v10

    iget v4, v3, Lu0/c1;->f:I

    iget-boolean v5, v3, Lu0/c1;->e:Z

    iget v6, v3, Lu0/c1;->c:I

    const-wide v16, 0xffffffffL

    const/16 v18, 0x20

    if-eqz v2, :cond_8

    iget-object v11, v2, Ll3/r0;->b:Ll3/w;

    iget-object v12, v2, Ll3/r0;->a:Ll3/q0;

    iget-object v13, v3, Lu0/c1;->a:Ll3/g;

    iget-object v7, v3, Lu0/c1;->b:Ll3/v0;

    iget-object v8, v3, Lu0/c1;->i:Ljava/util/List;

    iget-object v14, v3, Lu0/c1;->g:Ly3/c;

    iget-object v9, v3, Lu0/c1;->h:Lp3/h;

    move-object/from16 v21, v2

    iget-object v2, v11, Ll3/w;->a:Laa3/i1;

    invoke-virtual {v2}, Laa3/i1;->b()Z

    move-result v2

    if-eqz v2, :cond_2

    move-wide/from16 v12, p3

    move-object/from16 v22, v0

    goto/16 :goto_3

    :cond_2
    iget-object v2, v12, Ll3/q0;->a:Ll3/g;

    move-object/from16 v22, v0

    iget-wide v0, v12, Ll3/q0;->j:J

    invoke-static {v2, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v2, v12, Ll3/q0;->b:Ll3/v0;

    invoke-virtual {v2, v7}, Ll3/v0;->d(Ll3/v0;)Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v2, v12, Ll3/q0;->c:Ljava/util/List;

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    iget v2, v12, Ll3/q0;->d:I

    if-ne v2, v6, :cond_7

    iget-boolean v2, v12, Ll3/q0;->e:Z

    if-ne v2, v5, :cond_7

    iget v2, v12, Ll3/q0;->f:I

    if-ne v2, v4, :cond_7

    iget-object v2, v12, Ll3/q0;->g:Ly3/c;

    invoke-static {v2, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v2, v12, Ll3/q0;->h:Ly3/m;

    if-ne v2, v10, :cond_7

    iget-object v2, v12, Ll3/q0;->i:Lp3/h;

    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-static/range {p3 .. p4}, Ly3/a;->k(J)I

    move-result v2

    invoke-static {v0, v1}, Ly3/a;->k(J)I

    move-result v7

    if-eq v2, v7, :cond_4

    goto :goto_2

    :cond_4
    if-nez v5, :cond_5

    const/4 v2, 0x2

    if-ne v4, v2, :cond_6

    :cond_5
    invoke-static/range {p3 .. p4}, Ly3/a;->i(J)I

    move-result v2

    invoke-static {v0, v1}, Ly3/a;->i(J)I

    move-result v7

    if-ne v2, v7, :cond_7

    invoke-static/range {p3 .. p4}, Ly3/a;->h(J)I

    move-result v2

    invoke-static {v0, v1}, Ly3/a;->h(J)I

    move-result v0

    if-ne v2, v0, :cond_7

    :cond_6
    new-instance v2, Ll3/q0;

    iget-object v0, v12, Ll3/q0;->a:Ll3/g;

    iget-object v4, v3, Lu0/c1;->b:Ll3/v0;

    iget-object v5, v12, Ll3/q0;->c:Ljava/util/List;

    iget v6, v12, Ll3/q0;->d:I

    iget-boolean v7, v12, Ll3/q0;->e:Z

    iget v8, v12, Ll3/q0;->f:I

    iget-object v9, v12, Ll3/q0;->g:Ly3/c;

    iget-object v10, v12, Ll3/q0;->h:Ly3/m;

    iget-object v1, v12, Ll3/q0;->i:Lp3/h;

    move-object v3, v11

    move-object v11, v1

    move-object v1, v3

    move-wide/from16 v12, p3

    move-object v3, v0

    move-object/from16 v14, v21

    const/4 v0, 0x0

    invoke-direct/range {v2 .. v13}, Ll3/q0;-><init>(Ll3/g;Ll3/v0;Ljava/util/List;IZILy3/c;Ly3/m;Lp3/h;J)V

    iget v3, v1, Ll3/w;->d:F

    invoke-static {v3}, Lwb3/f;->l(F)I

    move-result v3

    iget v4, v1, Ll3/w;->e:F

    invoke-static {v4}, Lwb3/f;->l(F)I

    move-result v4

    int-to-long v5, v3

    shl-long v5, v5, v18

    int-to-long v3, v4

    and-long v3, v3, v16

    or-long/2addr v3, v5

    invoke-static {v12, v13, v3, v4}, Ly3/b;->d(JJ)J

    move-result-wide v3

    new-instance v5, Ll3/r0;

    invoke-direct {v5, v2, v1, v3, v4}, Ll3/r0;-><init>(Ll3/q0;Ll3/w;J)V

    move-object/from16 v23, v14

    move-object/from16 p2, v15

    goto/16 :goto_8

    :cond_7
    :goto_2
    move-wide/from16 v12, p3

    :goto_3
    move-object/from16 v14, v21

    goto :goto_4

    :cond_8
    move-wide/from16 v12, p3

    move-object/from16 v22, v0

    move-object v14, v2

    :goto_4
    const/4 v0, 0x0

    invoke-virtual {v3, v10}, Lu0/c1;->a(Ly3/m;)V

    invoke-static {v12, v13}, Ly3/a;->k(J)I

    move-result v1

    if-nez v5, :cond_9

    const/4 v2, 0x2

    if-ne v4, v2, :cond_a

    :cond_9
    invoke-static {v12, v13}, Ly3/a;->e(J)Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-static {v12, v13}, Ly3/a;->i(J)I

    move-result v2

    goto :goto_5

    :cond_a
    const v2, 0x7fffffff

    :goto_5
    if-nez v5, :cond_b

    const/4 v5, 0x2

    if-ne v4, v5, :cond_b

    const/16 v27, 0x1

    goto :goto_6

    :cond_b
    move/from16 v27, v6

    :goto_6
    const-string v4, "layoutIntrinsics must be called first"

    if-ne v1, v2, :cond_c

    goto :goto_7

    :cond_c
    iget-object v5, v3, Lu0/c1;->j:Laa3/i1;

    if-eqz v5, :cond_11

    invoke-virtual {v5}, Laa3/i1;->c()F

    move-result v5

    invoke-static {v5}, Lwb3/f;->l(F)I

    move-result v5

    invoke-static {v5, v1, v2}, Le93/b;->n(III)I

    move-result v2

    :goto_7
    new-instance v23, Ll3/w;

    iget-object v1, v3, Lu0/c1;->j:Laa3/i1;

    if-eqz v1, :cond_10

    invoke-static {v12, v13}, Ly3/a;->h(J)I

    move-result v4

    invoke-static {v0, v2, v0, v4}, Lva3/l;->n(IIII)J

    move-result-wide v25

    iget v2, v3, Lu0/c1;->f:I

    move-object/from16 v24, v1

    move/from16 v28, v2

    invoke-direct/range {v23 .. v28}, Ll3/w;-><init>(Laa3/i1;JII)V

    move-object/from16 v1, v23

    iget v2, v1, Ll3/w;->d:F

    invoke-static {v2}, Lwb3/f;->l(F)I

    move-result v2

    iget v4, v1, Ll3/w;->e:F

    invoke-static {v4}, Lwb3/f;->l(F)I

    move-result v4

    int-to-long v5, v2

    shl-long v5, v5, v18

    int-to-long v7, v4

    and-long v7, v7, v16

    or-long v4, v5, v7

    invoke-static {v12, v13, v4, v5}, Ly3/b;->d(JJ)J

    move-result-wide v4

    new-instance v2, Ll3/r0;

    move-object v6, v2

    new-instance v2, Ll3/q0;

    iget-object v7, v3, Lu0/c1;->a:Ll3/g;

    move-wide v8, v4

    iget-object v4, v3, Lu0/c1;->b:Ll3/v0;

    iget-object v5, v3, Lu0/c1;->i:Ljava/util/List;

    move-object v11, v6

    iget v6, v3, Lu0/c1;->c:I

    move-object/from16 v19, v7

    iget-boolean v7, v3, Lu0/c1;->e:Z

    move-wide/from16 v20, v8

    iget v8, v3, Lu0/c1;->f:I

    iget-object v9, v3, Lu0/c1;->g:Ly3/c;

    iget-object v3, v3, Lu0/c1;->h:Lp3/h;

    move-object v0, v11

    move-object/from16 v23, v14

    move-object/from16 p2, v15

    move-wide/from16 v14, v20

    move-object v11, v3

    move-object/from16 v3, v19

    invoke-direct/range {v2 .. v13}, Ll3/q0;-><init>(Ll3/g;Ll3/v0;Ljava/util/List;IZILy3/c;Ly3/m;Lp3/h;J)V

    invoke-direct {v0, v2, v1, v14, v15}, Ll3/r0;-><init>(Ll3/q0;Ll3/w;J)V

    move-object v5, v0

    :goto_8
    iget-wide v0, v5, Ll3/r0;->c:J

    shr-long v2, v0, v18

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    and-long v0, v0, v16

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    move-object/from16 v14, v23

    invoke-static {v14, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    new-instance v2, Lu0/p1;

    if-eqz p2, :cond_d

    move-object/from16 v3, p2

    iget-object v14, v3, Lu0/p1;->c:Ly2/y;

    goto :goto_9

    :cond_d
    const/4 v14, 0x0

    :goto_9
    invoke-direct {v2, v5, v14}, Lu0/p1;-><init>(Ll3/r0;Ly2/y;)V

    move-object/from16 v3, v22

    iget-object v4, v3, Lu0/s0;->i:Lp1/k1;

    invoke-virtual {v4, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    const/4 v2, 0x0

    iput-boolean v2, v3, Lu0/s0;->p:Z

    move-object/from16 v6, p0

    iget-object v4, v6, Lu0/w;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {v4, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, v6, Lu0/w;->c:Lq3/y;

    iget-object v7, v6, Lu0/w;->d:Lq3/r;

    invoke-static {v3, v4, v7}, Lu0/n0;->s(Lu0/s0;Lq3/y;Lq3/r;)V

    goto :goto_a

    :cond_e
    move-object/from16 v6, p0

    move-object/from16 v3, v22

    const/4 v2, 0x0

    :goto_a
    iget v4, v6, Lu0/w;->f:I

    const/4 v7, 0x1

    if-ne v4, v7, :cond_f

    iget-object v4, v5, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v4, v2}, Ll3/w;->b(I)F

    move-result v2

    invoke-static {v2}, Lwb3/f;->l(F)I

    move-result v8

    goto :goto_b

    :cond_f
    move v8, v2

    :goto_b
    iget-object v2, v6, Lu0/w;->e:Ly3/c;

    invoke-interface {v2, v8}, Ly3/c;->e0(I)F

    move-result v2

    iget-object v3, v3, Lu0/s0;->g:Lp1/k1;

    new-instance v4, Ly3/f;

    invoke-direct {v4, v2}, Ly3/f;-><init>(F)V

    invoke-virtual {v3, v4}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    sget-object v2, Ly2/d;->a:Ly2/m;

    iget v3, v5, Ll3/r0;->d:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Ll83/k;

    invoke-direct {v4, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Ly2/d;->b:Ly2/m;

    iget v3, v5, Ll3/r0;->e:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v5, Ll83/k;

    invoke-direct {v5, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v5}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v2

    new-instance v3, Ldc1/c;

    const/16 v4, 0x1b

    invoke-direct {v3, v4}, Ldc1/c;-><init>(I)V

    move-object/from16 v4, p1

    invoke-interface {v4, v1, v0, v2, v3}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v0

    return-object v0

    :cond_10
    move-object/from16 v6, p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    move-object/from16 v6, p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    move-object v6, v1

    invoke-static {v2, v4, v3}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    throw v0
.end method

.method public final c(Ly2/r;Ljava/util/List;I)I
    .locals 0

    iget-object p2, p0, Lu0/w;->a:Lu0/s0;

    iget-object p3, p2, Lu0/s0;->a:Lu0/c1;

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object p1

    invoke-virtual {p3, p1}, Lu0/c1;->a(Ly3/m;)V

    iget-object p1, p2, Lu0/s0;->a:Lu0/c1;

    iget-object p1, p1, Lu0/c1;->j:Laa3/i1;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Laa3/i1;->c()F

    move-result p1

    invoke-static {p1}, Lwb3/f;->l(F)I

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "layoutIntrinsics must be called first"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
