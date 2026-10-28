.class public final Le4/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln4/c;


# instance fields
.field public final a:Lm4/f;

.field public final b:Ljava/util/LinkedHashMap;

.field public final c:Ljava/util/LinkedHashMap;

.field public final d:Ljava/util/LinkedHashMap;

.field public final e:Le4/s;

.field public final f:[I

.field public final g:[I


# direct methods
.method public constructor <init>(Ly3/c;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lm4/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lm4/e;-><init>(II)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Lm4/f;->r0:Ljava/util/ArrayList;

    new-instance v2, La3/p;

    invoke-direct {v2, v0}, La3/p;-><init>(Lm4/f;)V

    iput-object v2, v0, Lm4/f;->s0:La3/p;

    new-instance v2, Ln4/f;

    invoke-direct {v2, v0}, Ln4/f;-><init>(Lm4/f;)V

    iput-object v2, v0, Lm4/f;->t0:Ln4/f;

    const/4 v3, 0x0

    iput-object v3, v0, Lm4/f;->v0:Ln4/c;

    iput-boolean v1, v0, Lm4/f;->w0:Z

    new-instance v4, Lf4/c;

    invoke-direct {v4}, Lf4/c;-><init>()V

    iput-object v4, v0, Lm4/f;->x0:Lf4/c;

    iput v1, v0, Lm4/f;->A0:I

    iput v1, v0, Lm4/f;->B0:I

    const/4 v4, 0x4

    new-array v5, v4, [Lm4/c;

    iput-object v5, v0, Lm4/f;->C0:[Lm4/c;

    new-array v4, v4, [Lm4/c;

    iput-object v4, v0, Lm4/f;->D0:[Lm4/c;

    const/16 v4, 0x101

    iput v4, v0, Lm4/f;->E0:I

    iput-boolean v1, v0, Lm4/f;->F0:Z

    iput-boolean v1, v0, Lm4/f;->G0:Z

    iput-object v3, v0, Lm4/f;->H0:Ljava/lang/ref/WeakReference;

    iput-object v3, v0, Lm4/f;->I0:Ljava/lang/ref/WeakReference;

    iput-object v3, v0, Lm4/f;->J0:Ljava/lang/ref/WeakReference;

    iput-object v3, v0, Lm4/f;->K0:Ljava/lang/ref/WeakReference;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, v0, Lm4/f;->L0:Ljava/util/HashSet;

    new-instance v1, Ln4/b;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lm4/f;->M0:Ln4/b;

    iput-object p0, v0, Lm4/f;->v0:Ln4/c;

    iput-object p0, v2, Ln4/f;->h:Ljava/lang/Object;

    iput-object v0, p0, Le4/r;->a:Lm4/f;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Le4/r;->b:Ljava/util/LinkedHashMap;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Le4/r;->c:Ljava/util/LinkedHashMap;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Le4/r;->d:Ljava/util/LinkedHashMap;

    new-instance v0, Le4/s;

    invoke-direct {v0, p1}, Le4/s;-><init>(Ly3/c;)V

    iput-object v0, p0, Le4/r;->e:Le4/s;

    const/4 p1, 0x2

    new-array v0, p1, [I

    iput-object v0, p0, Le4/r;->f:[I

    new-array p1, p1, [I

    iput-object p1, p0, Le4/r;->g:[I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-void
.end method

.method public static d(IIIIZZI[I)V
    .locals 4

    invoke-static {p0}, Le4/p;->e(I)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_8

    if-eq v0, v2, :cond_7

    const/4 v3, 0x2

    if-eq v0, v3, :cond_1

    const/4 p1, 0x3

    if-ne v0, p1, :cond_0

    aput p6, p7, v1

    aput p6, p7, v2

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-static {p0}, Ljh3/c;->B(I)Ljava/lang/String;

    move-result-object p0

    const-string p2, " is not supported"

    invoke-virtual {p0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    if-nez p5, :cond_4

    if-eq p3, v2, :cond_2

    if-ne p3, v3, :cond_3

    :cond_2
    if-eq p3, v3, :cond_4

    if-ne p2, v2, :cond_4

    if-eqz p4, :cond_3

    goto :goto_0

    :cond_3
    move p0, v1

    goto :goto_1

    :cond_4
    :goto_0
    move p0, v2

    :goto_1
    if-eqz p0, :cond_5

    move p2, p1

    goto :goto_2

    :cond_5
    move p2, v1

    :goto_2
    aput p2, p7, v1

    if-eqz p0, :cond_6

    goto :goto_3

    :cond_6
    move p1, p6

    :goto_3
    aput p1, p7, v2

    return-void

    :cond_7
    aput v1, p7, v1

    aput p6, p7, v2

    return-void

    :cond_8
    aput p1, p7, v1

    aput p1, p7, v2

    return-void
.end method


# virtual methods
.method public final a(Lm4/e;Ln4/b;)V
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget-object v5, v1, Lm4/e;->k:Ljava/lang/String;

    iget-object v6, v0, Le4/r;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v6, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [Ljava/lang/Integer;

    iget v8, v2, Ln4/b;->a:I

    iget v9, v2, Ln4/b;->c:I

    iget v10, v1, Lm4/e;->s:I

    iget v11, v2, Ln4/b;->j:I

    const/4 v12, 0x1

    if-eqz v7, :cond_0

    aget-object v13, v7, v12

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    goto :goto_0

    :cond_0
    move v13, v3

    :goto_0
    invoke-virtual {v1}, Lm4/e;->l()I

    move-result v14

    if-ne v13, v14, :cond_1

    move v13, v12

    goto :goto_1

    :cond_1
    move v13, v12

    move v12, v3

    :goto_1
    invoke-virtual {v1}, Lm4/e;->B()Z

    move-result v14

    iget-object v15, v0, Le4/r;->e:Le4/s;

    move/from16 v17, v14

    iget-wide v13, v15, Le4/s;->l:J

    invoke-static {v13, v14}, Ly3/a;->i(J)I

    move-result v14

    move-object v13, v15

    iget-object v15, v0, Le4/r;->f:[I

    move/from16 v18, v3

    move-object v3, v13

    move/from16 v13, v17

    const/16 v16, 0x1

    invoke-static/range {v8 .. v15}, Le4/r;->d(IIIIZZI[I)V

    iget v8, v2, Ln4/b;->b:I

    iget v9, v2, Ln4/b;->d:I

    iget v10, v1, Lm4/e;->t:I

    iget v11, v2, Ln4/b;->j:I

    if-eqz v7, :cond_2

    aget-object v7, v7, v18

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    goto :goto_2

    :cond_2
    move/from16 v7, v18

    :goto_2
    invoke-virtual {v1}, Lm4/e;->r()I

    move-result v12

    if-ne v7, v12, :cond_3

    move/from16 v23, v16

    goto :goto_3

    :cond_3
    move/from16 v23, v18

    :goto_3
    invoke-virtual {v1}, Lm4/e;->C()Z

    move-result v24

    iget-wide v12, v3, Le4/s;->l:J

    invoke-static {v12, v13}, Ly3/a;->h(J)I

    move-result v25

    iget-object v7, v0, Le4/r;->g:[I

    move-object/from16 v26, v7

    move/from16 v19, v8

    move/from16 v20, v9

    move/from16 v21, v10

    move/from16 v22, v11

    invoke-static/range {v19 .. v26}, Le4/r;->d(IIIIZZI[I)V

    iget-object v7, v0, Le4/r;->f:[I

    aget v8, v7, v18

    aget v7, v7, v16

    iget-object v9, v0, Le4/r;->g:[I

    aget v10, v9, v18

    aget v9, v9, v16

    invoke-static {v8, v7, v10, v9}, Ly3/b;->a(IIII)J

    move-result-wide v7

    iget v9, v2, Ln4/b;->j:I

    const/4 v10, 0x3

    const/4 v11, 0x2

    move/from16 v13, v16

    if-eq v9, v13, :cond_5

    if-eq v9, v11, :cond_5

    iget v9, v2, Ln4/b;->a:I

    if-ne v9, v10, :cond_5

    iget v9, v1, Lm4/e;->s:I

    if-nez v9, :cond_5

    iget v9, v2, Ln4/b;->b:I

    if-ne v9, v10, :cond_5

    iget v9, v1, Lm4/e;->t:I

    if-eqz v9, :cond_4

    goto :goto_4

    :cond_4
    move/from16 v17, v11

    goto/16 :goto_c

    :cond_5
    :goto_4
    invoke-virtual {v0, v1, v7, v8}, Le4/r;->c(Lm4/e;J)J

    move-result-wide v12

    move/from16 v9, v18

    iput-boolean v9, v1, Lm4/e;->g:Z

    const/16 v9, 0x20

    shr-long v14, v12, v9

    long-to-int v9, v14

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    iget v15, v1, Lm4/e;->v:I

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    const/16 v19, 0x0

    if-lez v15, :cond_6

    move-object/from16 v15, v17

    :goto_5
    move/from16 v17, v11

    goto :goto_6

    :cond_6
    move-object/from16 v15, v19

    goto :goto_5

    :goto_6
    iget v11, v1, Lm4/e;->w:I

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v20

    if-lez v11, :cond_7

    move-object/from16 v11, v20

    goto :goto_7

    :cond_7
    move-object/from16 v11, v19

    :goto_7
    invoke-static {v14, v15, v11}, Le93/b;->s(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    move-result v11

    const-wide v14, 0xffffffffL

    and-long/2addr v12, v14

    long-to-int v12, v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    iget v14, v1, Lm4/e;->y:I

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    if-lez v14, :cond_8

    goto :goto_8

    :cond_8
    move-object/from16 v15, v19

    :goto_8
    iget v14, v1, Lm4/e;->z:I

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v20

    if-lez v14, :cond_9

    move-object/from16 v14, v20

    goto :goto_9

    :cond_9
    move-object/from16 v14, v19

    :goto_9
    invoke-static {v13, v15, v14}, Le93/b;->s(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object v13

    check-cast v13, Ljava/lang/Number;

    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    move-result v13

    if-eq v11, v9, :cond_a

    invoke-static {v7, v8}, Ly3/a;->j(J)I

    move-result v9

    invoke-static {v7, v8}, Ly3/a;->h(J)I

    move-result v7

    invoke-static {v11, v11, v9, v7}, Ly3/b;->a(IIII)J

    move-result-wide v7

    const/4 v9, 0x1

    goto :goto_a

    :cond_a
    const/4 v9, 0x0

    :goto_a
    if-eq v13, v12, :cond_b

    invoke-static {v7, v8}, Ly3/a;->k(J)I

    move-result v9

    invoke-static {v7, v8}, Ly3/a;->i(J)I

    move-result v7

    invoke-static {v9, v7, v13, v13}, Ly3/b;->a(IIII)J

    move-result-wide v7

    const/4 v12, 0x1

    goto :goto_b

    :cond_b
    move v12, v9

    :goto_b
    if-eqz v12, :cond_c

    invoke-virtual {v0, v1, v7, v8}, Le4/r;->c(Lm4/e;J)J

    const/4 v9, 0x0

    iput-boolean v9, v1, Lm4/e;->g:Z

    :cond_c
    :goto_c
    iget-object v7, v0, Le4/r;->b:Ljava/util/LinkedHashMap;

    iget-object v8, v1, Lm4/e;->g0:Ljava/lang/Object;

    invoke-virtual {v7, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly2/j1;

    if-eqz v7, :cond_d

    iget v8, v7, Ly2/j1;->w:I

    goto :goto_d

    :cond_d
    invoke-virtual {v1}, Lm4/e;->r()I

    move-result v8

    :goto_d
    iput v8, v2, Ln4/b;->e:I

    if-eqz v7, :cond_e

    iget v8, v7, Ly2/j1;->x:I

    goto :goto_e

    :cond_e
    invoke-virtual {v1}, Lm4/e;->l()I

    move-result v8

    :goto_e
    iput v8, v2, Ln4/b;->f:I

    const/high16 v8, -0x80000000

    if-eqz v7, :cond_12

    iget-object v9, v3, Le4/s;->i:Ljava/util/ArrayList;

    iget-boolean v11, v3, Le4/s;->j:Z

    if-eqz v11, :cond_11

    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    iget-object v11, v3, Le4/s;->h:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_f
    :goto_f
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_10

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    iget-object v13, v3, Le4/s;->c:Ljava/util/HashMap;

    invoke-virtual {v13, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lj4/h;

    invoke-interface {v12}, Lj4/h;->a()Lm4/e;

    move-result-object v12

    if-eqz v12, :cond_f

    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_10
    const/4 v12, 0x0

    iput-boolean v12, v3, Le4/s;->j:Z

    :cond_11
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    sget-object v1, Ly2/d;->a:Ly2/m;

    invoke-virtual {v7, v1}, Ly2/j1;->c0(Ly2/a;)I

    move-result v1

    goto :goto_10

    :cond_12
    move v1, v8

    :goto_10
    if-eq v1, v8, :cond_13

    const/4 v12, 0x1

    goto :goto_11

    :cond_13
    const/4 v12, 0x0

    :goto_11
    iput-boolean v12, v2, Ln4/b;->h:Z

    iput v1, v2, Ln4/b;->g:I

    invoke-virtual {v6, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_14

    new-array v1, v10, [Ljava/lang/Integer;

    const/16 v18, 0x0

    aput-object v4, v1, v18

    const/16 v16, 0x1

    aput-object v4, v1, v16

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v17

    invoke-interface {v6, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_12

    :cond_14
    const/16 v18, 0x0

    :goto_12
    check-cast v1, [Ljava/lang/Integer;

    iget v3, v2, Ln4/b;->e:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v18

    iget v3, v2, Ln4/b;->f:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v16, 0x1

    aput-object v3, v1, v16

    iget v3, v2, Ln4/b;->g:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v17

    iget v1, v2, Ln4/b;->e:I

    iget v3, v2, Ln4/b;->c:I

    if-ne v1, v3, :cond_16

    iget v1, v2, Ln4/b;->f:I

    iget v3, v2, Ln4/b;->d:I

    if-eq v1, v3, :cond_15

    goto :goto_13

    :cond_15
    move/from16 v3, v18

    goto :goto_14

    :cond_16
    :goto_13
    move/from16 v3, v16

    :goto_14
    iput-boolean v3, v2, Ln4/b;->i:Z

    return-void
.end method

.method public final b()V
    .locals 0

    return-void
.end method

.method public final c(Lm4/e;J)J
    .locals 5

    iget-object v0, p1, Lm4/e;->g0:Ljava/lang/Object;

    iget-object v1, p1, Lm4/e;->k:Ljava/lang/String;

    instance-of v2, p1, Lm4/l;

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    invoke-static {p2, p3}, Ly3/a;->g(J)Z

    move-result v0

    const/high16 v1, -0x80000000

    const/high16 v2, 0x40000000    # 2.0f

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-static {p2, p3}, Ly3/a;->e(J)Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    move v0, v3

    :goto_0
    invoke-static {p2, p3}, Ly3/a;->f(J)Z

    move-result v4

    if-eqz v4, :cond_2

    move v3, v2

    goto :goto_1

    :cond_2
    invoke-static {p2, p3}, Ly3/a;->d(J)Z

    move-result v2

    if-eqz v2, :cond_3

    move v3, v1

    :cond_3
    :goto_1
    check-cast p1, Lm4/l;

    invoke-static {p2, p3}, Ly3/a;->i(J)I

    move-result v1

    invoke-static {p2, p3}, Ly3/a;->h(J)I

    move-result p2

    invoke-virtual {p1, v0, v1, v3, p2}, Lm4/l;->Y(IIII)V

    iget p2, p1, Lm4/l;->A0:I

    iget p1, p1, Lm4/l;->B0:I

    invoke-static {p2, p1}, La0/q;->a(II)J

    move-result-wide p1

    return-wide p1

    :cond_4
    instance-of p1, v0, Ly2/q0;

    if-eqz p1, :cond_5

    move-object p1, v0

    check-cast p1, Ly2/q0;

    invoke-interface {p1, p2, p3}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p1

    iget-object p2, p0, Le4/r;->b:Ljava/util/LinkedHashMap;

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget p2, p1, Ly2/j1;->w:I

    iget p1, p1, Ly2/j1;->x:I

    invoke-static {p2, p1}, La0/q;->a(II)J

    move-result-wide p1

    return-wide p1

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Nothing to measure for widget: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "CCL"

    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v3, v3}, La0/q;->a(II)J

    move-result-wide p1

    return-wide p1
.end method

.method public final e(Ly2/i1;Ljava/util/List;)V
    .locals 10

    iget-object v0, p0, Le4/r;->d:Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget-object v1, p0, Le4/r;->a:Lm4/f;

    iget-object v1, v1, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v4, v2

    :goto_0
    if-ge v4, v3, :cond_2

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm4/e;

    iget-object v6, v5, Lm4/e;->g0:Ljava/lang/Object;

    instance-of v7, v6, Ly2/q0;

    if-eqz v7, :cond_1

    new-instance v7, Lj4/k;

    iget-object v5, v5, Lm4/e;->j:Lj4/k;

    iget-object v8, v5, Lj4/k;->a:Lm4/e;

    if-eqz v8, :cond_0

    invoke-virtual {v8}, Lm4/e;->s()I

    move-result v9

    iput v9, v5, Lj4/k;->b:I

    invoke-virtual {v8}, Lm4/e;->t()I

    move-result v9

    iput v9, v5, Lj4/k;->c:I

    invoke-virtual {v8}, Lm4/e;->s()I

    invoke-virtual {v8}, Lm4/e;->t()I

    iget-object v8, v8, Lm4/e;->j:Lj4/k;

    invoke-virtual {v5, v8}, Lj4/k;->a(Lj4/k;)V

    :cond_0
    invoke-direct {v7, v5}, Lj4/k;-><init>(Lj4/k;)V

    invoke-interface {v0, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    move v3, v2

    :goto_1
    if-ge v3, v1, :cond_d

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly2/q0;

    invoke-interface {v0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ly2/q0;

    invoke-static {v7}, Landroidx/compose/ui/layout/a;->a(Ly2/q0;)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_3

    invoke-static {v7}, Landroidx/compose/ui/layout/a;->a(Ly2/q0;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v4}, Landroidx/compose/ui/layout/a;->a(Ly2/q0;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_2

    :cond_4
    const/4 v6, 0x0

    :goto_2
    check-cast v6, Ly2/q0;

    if-nez v6, :cond_6

    goto :goto_5

    :cond_5
    move-object v6, v4

    :cond_6
    invoke-virtual {v0, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lj4/k;

    if-nez v5, :cond_7

    goto :goto_6

    :cond_7
    iget-object v7, p0, Le4/r;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v7, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly2/j1;

    if-nez v6, :cond_8

    goto :goto_6

    :cond_8
    invoke-interface {v0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c

    iget v7, v6, Ly2/j1;->w:I

    iget v6, v6, Ly2/j1;->x:I

    const/4 v8, 0x1

    if-ltz v7, :cond_9

    move v9, v8

    goto :goto_3

    :cond_9
    move v9, v2

    :goto_3
    if-ltz v6, :cond_a

    goto :goto_4

    :cond_a
    move v8, v2

    :goto_4
    and-int/2addr v8, v9

    if-nez v8, :cond_b

    const-string v8, "width and height must be >= 0"

    invoke-static {v8}, Ly3/i;->a(Ljava/lang/String;)V

    :cond_b
    invoke-static {v7, v7, v6, v6}, Ly3/b;->h(IIII)J

    move-result-wide v6

    invoke-interface {v4, v6, v7}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v4

    invoke-static {p1, v4, v5}, Lj93/l0;->T(Ly2/i1;Ly2/j1;Lj4/k;)V

    goto :goto_5

    :cond_c
    invoke-static {p1, v6, v5}, Lj93/l0;->T(Ly2/i1;Ly2/j1;Lj4/k;)V

    :goto_5
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_1

    :cond_d
    :goto_6
    return-void
.end method

.method public final f(JLy3/m;Le4/m;Ljava/util/List;I)J
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static/range {p1 .. p2}, Ly3/a;->k(J)I

    move-result v1

    invoke-static/range {p1 .. p2}, Ly3/a;->j(J)I

    move-result v2

    invoke-static {v1, v2}, Lv63/b;->a(II)J

    move-result-wide v1

    return-wide v1

    :cond_0
    invoke-static/range {p1 .. p2}, Ly3/a;->g(J)Z

    move-result v3

    sget-object v4, Lj4/f;->i:Ljava/lang/String;

    if-eqz v3, :cond_1

    invoke-static/range {p1 .. p2}, Ly3/a;->i(J)I

    move-result v3

    invoke-static {v3}, Lj4/f;->b(I)Lj4/f;

    move-result-object v3

    goto :goto_0

    :cond_1
    new-instance v3, Lj4/f;

    invoke-direct {v3, v4}, Lj4/f;-><init>(Ljava/lang/String;)V

    invoke-static/range {p1 .. p2}, Ly3/a;->k(J)I

    move-result v5

    if-ltz v5, :cond_2

    iput v5, v3, Lj4/f;->a:I

    :cond_2
    :goto_0
    iget-object v5, v0, Le4/r;->e:Le4/s;

    iget-object v6, v5, Le4/s;->f:Lj4/b;

    iget-object v7, v5, Le4/s;->d:Ljava/util/HashMap;

    iget-object v8, v5, Le4/s;->c:Ljava/util/HashMap;

    iget-object v9, v5, Le4/s;->f:Lj4/b;

    iput-object v3, v6, Lj4/b;->d0:Lj4/f;

    invoke-static/range {p1 .. p2}, Ly3/a;->f(J)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static/range {p1 .. p2}, Ly3/a;->h(J)I

    move-result v3

    invoke-static {v3}, Lj4/f;->b(I)Lj4/f;

    move-result-object v3

    goto :goto_1

    :cond_3
    new-instance v3, Lj4/f;

    invoke-direct {v3, v4}, Lj4/f;-><init>(Ljava/lang/String;)V

    invoke-static/range {p1 .. p2}, Ly3/a;->j(J)I

    move-result v4

    if-ltz v4, :cond_4

    iput v4, v3, Lj4/f;->a:I

    :cond_4
    :goto_1
    iput-object v3, v9, Lj4/b;->e0:Lj4/f;

    iget-object v3, v9, Lj4/b;->d0:Lj4/f;

    iget-object v10, v0, Le4/r;->a:Lm4/f;

    const/4 v4, 0x0

    invoke-virtual {v3, v10, v4}, Lj4/f;->a(Lm4/e;I)V

    iget-object v3, v9, Lj4/b;->e0:Lj4/f;

    const/4 v6, 0x1

    invoke-virtual {v3, v10, v6}, Lj4/f;->a(Lm4/e;I)V

    move-wide/from16 v11, p1

    iput-wide v11, v5, Le4/s;->l:J

    sget-object v3, Ly3/m;->x:Ly3/m;

    move-object/from16 v13, p3

    if-ne v13, v3, :cond_5

    move v3, v6

    goto :goto_2

    :cond_5
    move v3, v4

    :goto_2
    xor-int/2addr v3, v6

    iput-boolean v3, v5, Le4/s;->b:Z

    iget-object v3, v0, Le4/r;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->clear()V

    iget-object v3, v0, Le4/r;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->clear()V

    iget-object v3, v0, Le4/r;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->clear()V

    iget-object v3, v1, Le4/m;->F:Ljava/util/ArrayList;

    iget-boolean v13, v1, Le4/m;->z:Z

    if-nez v13, :cond_6

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v13

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v15

    if-eq v13, v15, :cond_7

    :cond_6
    move/from16 v16, v4

    goto :goto_5

    :cond_7
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v13

    move v15, v4

    :goto_3
    if-ge v15, v13, :cond_a

    invoke-interface {v2, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ly2/q0;

    invoke-interface/range {v16 .. v16}, Ly2/q0;->p()Ljava/lang/Object;

    move-result-object v14

    move/from16 v16, v4

    instance-of v4, v14, Le4/i;

    if-eqz v4, :cond_8

    check-cast v14, Le4/i;

    goto :goto_4

    :cond_8
    const/4 v14, 0x0

    :goto_4
    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v14, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    goto :goto_5

    :cond_9
    add-int/lit8 v15, v15, 0x1

    move/from16 v4, v16

    goto :goto_3

    :cond_a
    invoke-static {v5, v2}, Lj93/l0;->l(Le4/s;Ljava/util/List;)V

    goto/16 :goto_f

    :goto_5
    invoke-virtual {v8}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v8, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj4/h;

    invoke-interface {v4}, Lj4/h;->a()Lm4/e;

    move-result-object v4

    invoke-virtual {v4}, Lm4/e;->D()V

    goto :goto_6

    :cond_b
    invoke-virtual {v8}, Ljava/util/HashMap;->clear()V

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v8, v3, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/util/HashMap;->clear()V

    iget-object v3, v5, Le4/s;->e:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    iget-object v3, v5, Le4/s;->h:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    iput-boolean v6, v5, Le4/s;->j:Z

    iget-object v3, v1, Le4/m;->F:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    iget-object v3, v1, Le4/m;->y:Lz1/v;

    iget-object v4, v1, Le4/m;->E:Le4/l;

    new-instance v13, Lb3/f3;

    const/4 v14, 0x1

    invoke-direct {v13, v2, v1, v5, v14}, Lb3/f3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    sget-object v14, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v3, v13, v4, v14}, Lz1/v;->d(Lc93/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    move/from16 v3, v16

    iput-boolean v3, v1, Le4/m;->z:Z

    invoke-static {v5, v2}, Lj93/l0;->l(Le4/s;Ljava/util/List;)V

    iget-object v1, v10, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, v9, Lj4/b;->d0:Lj4/f;

    invoke-virtual {v1, v10, v3}, Lj4/f;->a(Lm4/e;I)V

    iget-object v1, v9, Lj4/b;->e0:Lj4/f;

    invoke-virtual {v1, v10, v6}, Lj4/f;->a(Lm4/e;I)V

    invoke-virtual {v7}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_c
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v7, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj4/g;

    invoke-virtual {v3}, Lj4/g;->s()Lm4/j;

    move-result-object v3

    if-eqz v3, :cond_c

    invoke-virtual {v8, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj4/h;

    if-nez v4, :cond_d

    invoke-virtual {v5, v2}, Le4/s;->b(Ljava/lang/Object;)Lj4/b;

    move-result-object v4

    :cond_d
    invoke-interface {v4, v3}, Lj4/h;->b(Lm4/e;)V

    goto :goto_7

    :cond_e
    invoke-virtual {v8}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_f
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj4/h;

    if-eq v3, v9, :cond_f

    invoke-interface {v3}, Lj4/h;->c()Lk4/d;

    move-result-object v4

    instance-of v4, v4, Lj4/g;

    if-eqz v4, :cond_f

    invoke-interface {v3}, Lj4/h;->c()Lk4/d;

    move-result-object v3

    check-cast v3, Lj4/g;

    invoke-virtual {v3}, Lj4/g;->s()Lm4/j;

    move-result-object v3

    if-eqz v3, :cond_f

    invoke-virtual {v8, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj4/h;

    if-nez v4, :cond_10

    invoke-virtual {v5, v2}, Le4/s;->b(Ljava/lang/Object;)Lj4/b;

    move-result-object v4

    :cond_10
    invoke-interface {v4, v3}, Lj4/h;->b(Lm4/e;)V

    goto :goto_8

    :cond_11
    invoke-virtual {v8}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj4/h;

    if-eq v2, v9, :cond_13

    invoke-interface {v2}, Lj4/h;->a()Lm4/e;

    move-result-object v3

    invoke-interface {v2}, Lj4/h;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lm4/e;->i0:Ljava/lang/String;

    const/4 v4, 0x0

    iput-object v4, v3, Lm4/e;->U:Lm4/f;

    invoke-interface {v2}, Lj4/h;->c()Lk4/d;

    move-result-object v5

    instance-of v5, v5, Lk4/g;

    if-eqz v5, :cond_12

    invoke-interface {v2}, Lj4/h;->apply()V

    :cond_12
    invoke-virtual {v10, v3}, Lm4/f;->V(Lm4/e;)V

    goto :goto_9

    :cond_13
    const/4 v4, 0x0

    invoke-interface {v2, v10}, Lj4/h;->b(Lm4/e;)V

    goto :goto_9

    :cond_14
    invoke-virtual {v7}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_17

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v7, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj4/g;

    invoke-virtual {v2}, Lj4/g;->s()Lm4/j;

    move-result-object v3

    if-eqz v3, :cond_16

    iget-object v3, v2, Lj4/g;->m0:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v8, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj4/h;

    invoke-virtual {v2}, Lj4/g;->s()Lm4/j;

    move-result-object v5

    invoke-interface {v4}, Lj4/h;->a()Lm4/e;

    move-result-object v4

    invoke-virtual {v5, v4}, Lm4/j;->V(Lm4/e;)V

    goto :goto_b

    :cond_15
    invoke-virtual {v2}, Lj4/g;->apply()V

    goto :goto_a

    :cond_16
    invoke-virtual {v2}, Lj4/g;->apply()V

    goto :goto_a

    :cond_17
    invoke-virtual {v8}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_18
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj4/h;

    if-eq v2, v9, :cond_18

    invoke-interface {v2}, Lj4/h;->c()Lk4/d;

    move-result-object v3

    instance-of v3, v3, Lj4/g;

    if-eqz v3, :cond_18

    invoke-interface {v2}, Lj4/h;->c()Lk4/d;

    move-result-object v3

    check-cast v3, Lj4/g;

    invoke-virtual {v3}, Lj4/g;->s()Lm4/j;

    move-result-object v4

    if-eqz v4, :cond_18

    iget-object v3, v3, Lj4/g;->m0:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lj4/h;

    if-eqz v6, :cond_19

    invoke-interface {v6}, Lj4/h;->a()Lm4/e;

    move-result-object v5

    invoke-virtual {v4, v5}, Lm4/j;->V(Lm4/e;)V

    goto :goto_d

    :cond_19
    instance-of v6, v5, Lj4/h;

    if-eqz v6, :cond_1a

    check-cast v5, Lj4/h;

    invoke-interface {v5}, Lj4/h;->a()Lm4/e;

    move-result-object v5

    invoke-virtual {v4, v5}, Lm4/j;->V(Lm4/e;)V

    goto :goto_d

    :cond_1a
    sget-object v6, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v13, "couldn\'t find reference for "

    invoke-direct {v7, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_d

    :cond_1b
    invoke-interface {v2}, Lj4/h;->apply()V

    goto :goto_c

    :cond_1c
    invoke-virtual {v8}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1d
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj4/h;

    invoke-interface {v3}, Lj4/h;->apply()V

    invoke-interface {v3}, Lj4/h;->a()Lm4/e;

    move-result-object v3

    if-eqz v3, :cond_1d

    if-eqz v2, :cond_1d

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v3, Lm4/e;->k:Ljava/lang/String;

    goto :goto_e

    :cond_1e
    :goto_f
    invoke-static {v11, v12}, Ly3/a;->i(J)I

    move-result v1

    invoke-virtual {v10, v1}, Lm4/e;->S(I)V

    invoke-static {v11, v12}, Ly3/a;->h(J)I

    move-result v1

    invoke-virtual {v10, v1}, Lm4/e;->N(I)V

    iget-object v1, v10, Lm4/f;->s0:La3/p;

    invoke-virtual {v1, v10}, La3/p;->a0(Lm4/f;)V

    move/from16 v1, p6

    iput v1, v10, Lm4/f;->E0:I

    const/16 v1, 0x200

    invoke-virtual {v10, v1}, Lm4/f;->c0(I)Z

    move-result v1

    sput-boolean v1, Lf4/c;->q:Z

    iget v11, v10, Lm4/f;->E0:I

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-virtual/range {v10 .. v17}, Lm4/f;->a0(IIIIIII)V

    invoke-virtual {v10}, Lm4/e;->r()I

    move-result v1

    invoke-virtual {v10}, Lm4/e;->l()I

    move-result v2

    invoke-static {v1, v2}, Lv63/b;->a(II)J

    move-result-wide v1

    return-wide v1
.end method
