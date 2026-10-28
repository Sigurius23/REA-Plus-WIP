.class public final Lxh/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxh/i;


# instance fields
.field public final a:Lrh/t;

.field public final b:Lki/a;

.field public final c:Lai/e;

.field public final d:Lai/e;


# direct methods
.method public constructor <init>(Lrh/t;Lki/a;Lai/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxh/f;->a:Lrh/t;

    iput-object p2, p0, Lxh/f;->b:Lki/a;

    iput-object p3, p0, Lxh/f;->c:Lai/e;

    new-instance p2, Lai/e;

    invoke-direct {p2, p1, p3}, Lai/e;-><init>(Lrh/t;Lai/e;)V

    iput-object p2, p0, Lxh/f;->d:Lai/e;

    return-void
.end method

.method public static final a(Lxh/f;Luh/h;Lrh/d;Lfi/i;Ljava/lang/Object;Lfi/o;Lrh/f;Ls83/c;)Ljava/lang/Object;
    .locals 7

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p7, Lxh/b;

    if-eqz v0, :cond_0

    move-object v0, p7

    check-cast v0, Lxh/b;

    iget v1, v0, Lxh/b;->K:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxh/b;->K:I

    goto :goto_0

    :cond_0
    new-instance v0, Lxh/b;

    invoke-direct {v0, p0, p7}, Lxh/b;-><init>(Lxh/f;Ls83/c;)V

    :goto_0
    iget-object p7, v0, Lxh/b;->I:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lxh/b;->K:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget p0, v0, Lxh/b;->H:I

    iget-object p1, v0, Lxh/b;->G:Lrh/f;

    iget-object p2, v0, Lxh/b;->F:Lfi/o;

    iget-object p3, v0, Lxh/b;->E:Ljava/lang/Object;

    iget-object p4, v0, Lxh/b;->z:Lfi/i;

    iget-object p5, v0, Lxh/b;->y:Lrh/d;

    iget-object p6, v0, Lxh/b;->x:Luh/h;

    iget-object v2, v0, Lxh/b;->w:Lxh/f;

    invoke-static {p7}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, v2

    move v2, p0

    move-object p0, v6

    move-object v6, p6

    move-object p6, p1

    move-object p1, v6

    move-object v6, p5

    move-object p5, p2

    move-object p2, v6

    move-object v6, p4

    move-object p4, p3

    move-object p3, v6

    goto :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p7}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 p7, 0x0

    :goto_1
    iget-object v2, p0, Lxh/f;->a:Lrh/t;

    iget-object v2, p2, Lrh/d;->g:Ll83/p;

    invoke-virtual {v2}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    :goto_2
    if-ge p7, v2, :cond_4

    iget-object v5, p2, Lrh/d;->g:Ll83/p;

    invoke-virtual {v5}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-interface {v5, p7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lsh/j;

    invoke-interface {v5, p1, p5}, Lsh/j;->a(Luh/h;Lfi/o;)Lsh/k;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-static {p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p7

    new-instance v2, Ll83/k;

    invoke-direct {v2, v5, p7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    add-int/lit8 p7, p7, 0x1

    goto :goto_2

    :cond_4
    move-object v2, v3

    :goto_3
    if-eqz v2, :cond_9

    iget-object p7, v2, Ll83/k;->w:Ljava/lang/Object;

    check-cast p7, Lsh/k;

    iget-object v2, v2, Ll83/k;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    add-int/2addr v2, v4

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p0, v0, Lxh/b;->w:Lxh/f;

    iput-object p1, v0, Lxh/b;->x:Luh/h;

    iput-object p2, v0, Lxh/b;->y:Lrh/d;

    iput-object p3, v0, Lxh/b;->z:Lfi/i;

    iput-object p4, v0, Lxh/b;->E:Ljava/lang/Object;

    iput-object p5, v0, Lxh/b;->F:Lfi/o;

    iput-object p6, v0, Lxh/b;->G:Lrh/f;

    iput v2, v0, Lxh/b;->H:I

    iput v4, v0, Lxh/b;->K:I

    invoke-interface {p7, v0}, Lsh/k;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p7

    if-ne p7, v1, :cond_5

    return-object v1

    :cond_5
    :goto_4
    check-cast p7, Lsh/i;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p7, :cond_8

    new-instance p0, Lxh/a;

    iget-object p2, p7, Lsh/i;->a:Lrh/j;

    iget-boolean p3, p7, Lsh/i;->b:Z

    iget-object p4, p1, Luh/h;->c:Lsh/h;

    iget-object p1, p1, Luh/h;->a:Lsh/q;

    instance-of p5, p1, Lsh/p;

    if-eqz p5, :cond_6

    check-cast p1, Lsh/p;

    goto :goto_5

    :cond_6
    move-object p1, v3

    :goto_5
    if-eqz p1, :cond_7

    iget-object v3, p1, Lsh/p;->y:Ljava/lang/String;

    :cond_7
    invoke-direct {p0, p2, p3, p4, v3}, Lxh/a;-><init>(Lrh/j;ZLsh/h;Ljava/lang/String;)V

    return-object p0

    :cond_8
    move p7, v2

    goto :goto_1

    :cond_9
    const-string p0, "Unable to create a decoder that supports: "

    invoke-static {p4, p0}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final b(Lxh/f;Lfi/i;Ljava/lang/Object;Lfi/o;Lrh/f;Ls83/c;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    instance-of v2, v1, Lxh/c;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lxh/c;

    iget v3, v2, Lxh/c;->K:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lxh/c;->K:I

    :goto_0
    move-object v6, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lxh/c;

    invoke-direct {v2, v0, v1}, Lxh/c;-><init>(Lxh/f;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v1, v6, Lxh/c;->I:Ljava/lang/Object;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v2, v6, Lxh/c;->K:I

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v3, 0x1

    const/4 v10, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v3, :cond_3

    if-eq v2, v9, :cond_2

    if-ne v2, v8, :cond_1

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v2, v6, Lxh/c;->E:Lkotlin/jvm/internal/g0;

    iget-object v0, v6, Lxh/c;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    iget-object v3, v6, Lxh/c;->y:Ljava/lang/Object;

    check-cast v3, Lrh/f;

    iget-object v4, v6, Lxh/c;->x:Lfi/i;

    iget-object v5, v6, Lxh/c;->w:Lxh/f;

    :try_start_0
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_a

    :cond_3
    iget-object v0, v6, Lxh/c;->H:Lkotlin/jvm/internal/g0;

    iget-object v2, v6, Lxh/c;->G:Lkotlin/jvm/internal/g0;

    iget-object v3, v6, Lxh/c;->F:Lkotlin/jvm/internal/g0;

    iget-object v4, v6, Lxh/c;->E:Lkotlin/jvm/internal/g0;

    iget-object v5, v6, Lxh/c;->z:Ljava/lang/Object;

    check-cast v5, Lrh/f;

    iget-object v11, v6, Lxh/c;->y:Ljava/lang/Object;

    iget-object v12, v6, Lxh/c;->x:Lfi/i;

    iget-object v13, v6, Lxh/c;->w:Lxh/f;

    :try_start_1
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v17, v3

    move-object/from16 v20, v4

    move-object/from16 v21, v5

    move-object/from16 v19, v11

    move-object v15, v13

    goto :goto_2

    :cond_4
    invoke-static {v1}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object v11

    move-object/from16 v1, p3

    iput-object v1, v11, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance v12, Lkotlin/jvm/internal/g0;

    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    iget-object v1, v0, Lxh/f;->a:Lrh/t;

    iget-object v1, v1, Lrh/t;->d:Lrh/d;

    iput-object v1, v12, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance v13, Lkotlin/jvm/internal/g0;

    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    :try_start_2
    iget-object v1, v11, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lfi/o;

    iget-object v2, v1, Lfi/o;->j:Lrh/i;

    sget-object v2, Lfi/k;->b:Lf93/a;

    invoke-static {v1, v2}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Bitmap$Config;

    invoke-static {v2}, Lx30/s0;->u(Landroid/graphics/Bitmap$Config;)Z

    iput-object v1, v11, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v12, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lrh/d;

    iget-object v2, v11, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v4, v2

    check-cast v4, Lfi/o;

    iput-object v0, v6, Lxh/c;->w:Lxh/f;

    move-object/from16 v2, p1

    iput-object v2, v6, Lxh/c;->x:Lfi/i;

    move-object/from16 v5, p2

    iput-object v5, v6, Lxh/c;->y:Ljava/lang/Object;

    move-object/from16 v14, p4

    iput-object v14, v6, Lxh/c;->z:Ljava/lang/Object;

    iput-object v11, v6, Lxh/c;->E:Lkotlin/jvm/internal/g0;

    iput-object v12, v6, Lxh/c;->F:Lkotlin/jvm/internal/g0;

    iput-object v13, v6, Lxh/c;->G:Lkotlin/jvm/internal/g0;

    iput-object v13, v6, Lxh/c;->H:Lkotlin/jvm/internal/g0;

    iput v3, v6, Lxh/c;->K:I

    move-object v3, v5

    move-object v5, v14

    invoke-virtual/range {v0 .. v6}, Lxh/f;->c(Lrh/d;Lfi/i;Ljava/lang/Object;Lfi/o;Lrh/f;Ls83/c;)Ljava/lang/Object;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v1, v7, :cond_5

    goto/16 :goto_8

    :cond_5
    move-object/from16 v15, p0

    move-object/from16 v19, p2

    move-object/from16 v21, p4

    move-object/from16 v20, v11

    move-object/from16 v17, v12

    move-object v0, v13

    move-object v2, v0

    move-object/from16 v12, p1

    :goto_2
    :try_start_3
    iput-object v1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object v0, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Luh/d;

    instance-of v3, v1, Luh/h;

    if-eqz v3, :cond_7

    iget-object v0, v12, Lfi/i;->i:Lq83/j;

    new-instance v14, Le00/c;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/16 v22, 0x0

    const/16 v23, 0x4

    move-object/from16 v16, v2

    move-object/from16 v18, v12

    :try_start_4
    invoke-direct/range {v14 .. v23}, Le00/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-object/from16 v4, v18

    move-object/from16 v11, v20

    move-object/from16 v3, v21

    :try_start_5
    iput-object v15, v6, Lxh/c;->w:Lxh/f;

    iput-object v4, v6, Lxh/c;->x:Lfi/i;

    iput-object v3, v6, Lxh/c;->y:Ljava/lang/Object;

    iput-object v11, v6, Lxh/c;->z:Ljava/lang/Object;

    iput-object v2, v6, Lxh/c;->E:Lkotlin/jvm/internal/g0;

    iput-object v10, v6, Lxh/c;->F:Lkotlin/jvm/internal/g0;

    iput-object v10, v6, Lxh/c;->G:Lkotlin/jvm/internal/g0;

    iput-object v10, v6, Lxh/c;->H:Lkotlin/jvm/internal/g0;

    iput v9, v6, Lxh/c;->K:I

    invoke-static {v0, v14, v6}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_6

    goto/16 :goto_8

    :cond_6
    move-object v0, v11

    move-object v5, v15

    :goto_3
    check-cast v1, Lxh/a;

    move-object v11, v0

    move-object v15, v5

    :goto_4
    move-object v12, v4

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object/from16 v2, v16

    goto/16 :goto_a

    :cond_7
    move-object v4, v12

    move-object/from16 v11, v20

    move-object/from16 v3, v21

    instance-of v1, v1, Luh/g;

    if-eqz v1, :cond_c

    new-instance v1, Lxh/a;

    move-object v5, v0

    check-cast v5, Luh/g;

    iget-object v5, v5, Luh/g;->a:Lrh/j;

    move-object v9, v0

    check-cast v9, Luh/g;

    iget-boolean v9, v9, Luh/g;->b:Z

    check-cast v0, Luh/g;

    iget-object v0, v0, Luh/g;->c:Lsh/h;

    invoke-direct {v1, v5, v9, v0, v10}, Lxh/a;-><init>(Lrh/j;ZLsh/h;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_4

    :goto_5
    iget-object v0, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    instance-of v2, v0, Luh/h;

    if-eqz v2, :cond_8

    check-cast v0, Luh/h;

    goto :goto_6

    :cond_8
    move-object v0, v10

    :goto_6
    if-eqz v0, :cond_9

    iget-object v0, v0, Luh/h;->a:Lsh/q;

    if-eqz v0, :cond_9

    :try_start_6
    invoke-static {v0}, Lm4/a;->w(Ljava/lang/AutoCloseable;)V
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_7

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    :cond_9
    :goto_7
    iget-object v0, v11, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lfi/o;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v10, v6, Lxh/c;->w:Lxh/f;

    iput-object v10, v6, Lxh/c;->x:Lfi/i;

    iput-object v10, v6, Lxh/c;->y:Ljava/lang/Object;

    iput-object v10, v6, Lxh/c;->z:Ljava/lang/Object;

    iput-object v10, v6, Lxh/c;->E:Lkotlin/jvm/internal/g0;

    iput-object v10, v6, Lxh/c;->F:Lkotlin/jvm/internal/g0;

    iput-object v10, v6, Lxh/c;->G:Lkotlin/jvm/internal/g0;

    iput-object v10, v6, Lxh/c;->H:Lkotlin/jvm/internal/g0;

    iput v8, v6, Lxh/c;->K:I

    invoke-static {v1, v12, v0, v3, v6}, Lsc3/l;->m(Lxh/a;Lfi/i;Lfi/o;Lrh/f;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_a

    :goto_8
    return-object v7

    :cond_a
    :goto_9
    check-cast v1, Lxh/a;

    iget-object v0, v1, Lxh/a;->a:Lrh/j;

    sget-object v2, Lki/l;->a:[Landroid/graphics/Bitmap$Config;

    instance-of v2, v0, Lrh/a;

    if-eqz v2, :cond_b

    check-cast v0, Lrh/a;

    iget-object v0, v0, Lrh/a;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    :cond_b
    return-object v1

    :cond_c
    :try_start_7
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :catchall_2
    move-exception v0

    move-object v2, v13

    :goto_a
    iget-object v1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    instance-of v2, v1, Luh/h;

    if-eqz v2, :cond_d

    move-object v10, v1

    check-cast v10, Luh/h;

    :cond_d
    if-eqz v10, :cond_e

    iget-object v1, v10, Luh/h;->a:Lsh/q;

    if-eqz v1, :cond_e

    :try_start_8
    invoke-static {v1}, Lm4/a;->w(Ljava/lang/AutoCloseable;)V
    :try_end_8
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    goto :goto_b

    :catch_2
    move-exception v0

    throw v0

    :catch_3
    :cond_e
    :goto_b
    throw v0
.end method


# virtual methods
.method public final c(Lrh/d;Lfi/i;Ljava/lang/Object;Lfi/o;Lrh/f;Ls83/c;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p6

    instance-of v1, v0, Lxh/d;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lxh/d;

    iget v2, v1, Lxh/d;->J:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lxh/d;->J:I

    move-object/from16 v2, p0

    goto :goto_0

    :cond_0
    new-instance v1, Lxh/d;

    move-object/from16 v2, p0

    invoke-direct {v1, v2, v0}, Lxh/d;-><init>(Lxh/f;Ls83/c;)V

    :goto_0
    iget-object v0, v1, Lxh/d;->H:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v1, Lxh/d;->J:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v6, :cond_1

    iget v4, v1, Lxh/d;->G:I

    iget-object v7, v1, Lxh/d;->F:Lrh/f;

    iget-object v8, v1, Lxh/d;->E:Lfi/o;

    iget-object v9, v1, Lxh/d;->z:Ljava/lang/Object;

    iget-object v10, v1, Lxh/d;->y:Lfi/i;

    iget-object v11, v1, Lxh/d;->x:Lrh/d;

    iget-object v12, v1, Lxh/d;->w:Lxh/f;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v16, v10

    move-object v10, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v9

    move v9, v4

    move-object/from16 v4, v16

    move-object/from16 v16, v8

    move-object v8, v7

    move-object/from16 v7, v16

    goto/16 :goto_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 v0, 0x0

    move-object/from16 v4, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move v9, v0

    move-object v10, v1

    move-object v12, v2

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    :goto_1
    iget-object v11, v12, Lxh/f;->a:Lrh/t;

    iget-object v13, v0, Lrh/d;->f:Ll83/p;

    invoke-virtual {v13}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/List;

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v13

    :goto_2
    if-ge v9, v13, :cond_4

    iget-object v14, v0, Lrh/d;->f:Ll83/p;

    invoke-virtual {v14}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/List;

    invoke-interface {v14, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll83/k;

    iget-object v15, v14, Ll83/k;->w:Ljava/lang/Object;

    check-cast v15, Luh/e;

    iget-object v14, v14, Ll83/k;->x:Ljava/lang/Object;

    check-cast v14, Lj93/d;

    invoke-interface {v14, v4}, Lj93/d;->isInstance(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_3

    const-string v14, "null cannot be cast to non-null type coil3.fetch.Fetcher.Factory<kotlin.Any>"

    invoke-static {v15, v14}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v15, v4, v7, v11}, Luh/e;->a(Ljava/lang/Object;Lfi/o;Lrh/t;)Luh/f;

    move-result-object v14

    if-eqz v14, :cond_3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    new-instance v11, Ll83/k;

    invoke-direct {v11, v14, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_4
    move-object v11, v5

    :goto_3
    if-eqz v11, :cond_9

    iget-object v9, v11, Ll83/k;->w:Ljava/lang/Object;

    check-cast v9, Luh/f;

    iget-object v11, v11, Ll83/k;->x:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    move-result v11

    add-int/2addr v11, v6

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v12, v10, Lxh/d;->w:Lxh/f;

    iput-object v0, v10, Lxh/d;->x:Lrh/d;

    iput-object v1, v10, Lxh/d;->y:Lfi/i;

    iput-object v4, v10, Lxh/d;->z:Ljava/lang/Object;

    iput-object v7, v10, Lxh/d;->E:Lfi/o;

    iput-object v8, v10, Lxh/d;->F:Lrh/f;

    iput v11, v10, Lxh/d;->G:I

    iput v6, v10, Lxh/d;->J:I

    invoke-interface {v9, v10}, Luh/f;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v3, :cond_5

    return-object v3

    :cond_5
    move/from16 v16, v11

    move-object v11, v0

    move-object v0, v9

    move/from16 v9, v16

    :goto_4
    move-object v13, v0

    check-cast v13, Luh/d;

    :try_start_0
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v13, :cond_6

    return-object v13

    :cond_6
    move-object v0, v11

    goto :goto_1

    :catchall_0
    move-exception v0

    instance-of v1, v13, Luh/h;

    if-eqz v1, :cond_7

    move-object v5, v13

    check-cast v5, Luh/h;

    :cond_7
    if-eqz v5, :cond_8

    iget-object v1, v5, Luh/h;->a:Lsh/q;

    if-eqz v1, :cond_8

    :try_start_1
    invoke-static {v1}, Lm4/a;->w(Ljava/lang/AutoCloseable;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_5

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    :cond_8
    :goto_5
    throw v0

    :cond_9
    const-string v0, "Unable to create a fetcher that supports: "

    invoke-static {v4, v0}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final intercept(Lxh/h;Lq83/d;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    iget-object v2, v1, Lxh/f;->d:Lai/e;

    instance-of v3, v0, Lxh/e;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lxh/e;

    iget v4, v3, Lxh/e;->z:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lxh/e;->z:I

    :goto_0
    move-object v10, v3

    goto :goto_1

    :cond_0
    new-instance v3, Lxh/e;

    check-cast v0, Ls83/c;

    invoke-direct {v3, v1, v0}, Lxh/e;-><init>(Lxh/f;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, v10, Lxh/e;->x:Ljava/lang/Object;

    sget-object v11, Lr83/a;->w:Lr83/a;

    iget v3, v10, Lxh/e;->z:I

    const/4 v12, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v12, :cond_1

    iget-object v2, v10, Lxh/e;->w:Lxh/k;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    goto/16 :goto_a

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    move-object/from16 v0, p1

    check-cast v0, Lxh/k;

    iget-object v15, v0, Lxh/k;->d:Lfi/i;

    iget-object v0, v15, Lfi/i;->b:Ljava/lang/Object;

    move-object/from16 v3, p1

    check-cast v3, Lxh/k;

    iget-object v3, v3, Lxh/k;->e:Lgi/i;

    if-eqz p1, :cond_3

    move-object/from16 v4, p1

    check-cast v4, Lxh/k;

    iget-object v4, v4, Lxh/k;->f:Lrh/f;

    :goto_2
    move-object v5, v4

    goto :goto_3

    :cond_3
    sget-object v4, Lrh/f;->a:Lrh/f;

    goto :goto_2

    :goto_3
    iget-object v4, v1, Lxh/f;->c:Lai/e;

    invoke-virtual {v4, v15, v3}, Lai/e;->e(Lfi/i;Lgi/i;)Lfi/o;

    move-result-object v4

    iget-object v6, v4, Lfi/o;->c:Lgi/g;

    iget-object v7, v1, Lxh/f;->a:Lrh/t;

    iget-object v7, v7, Lrh/t;->d:Lrh/d;

    iget-object v7, v7, Lrh/d;->b:Ljava/util/List;

    move-object v8, v7

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v8

    const/4 v13, 0x0

    :goto_4
    if-ge v13, v8, :cond_5

    invoke-interface {v7, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll83/k;

    iget-object v9, v14, Ll83/k;->w:Ljava/lang/Object;

    check-cast v9, Lzh/a;

    iget-object v14, v14, Ll83/k;->x:Ljava/lang/Object;

    check-cast v14, Lj93/d;

    invoke-interface {v14, v0}, Lj93/d;->isInstance(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_4

    const-string v14, "null cannot be cast to non-null type coil3.map.Mapper<kotlin.Any, *>"

    invoke-static {v9, v14}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v0, v4}, Lzh/a;->a(Ljava/lang/Object;Lfi/o;)Lrh/y;

    move-result-object v9

    if-eqz v9, :cond_4

    move-object v0, v9

    :cond_4
    add-int/lit8 v13, v13, 0x1

    goto :goto_4

    :cond_5
    invoke-virtual {v2, v15, v0, v4, v5}, Lai/e;->d(Lfi/i;Ljava/lang/Object;Lfi/o;Lrh/f;)Lai/b;

    move-result-object v7

    const/4 v8, 0x0

    if-eqz v7, :cond_6

    invoke-virtual {v2, v15, v7, v3, v6}, Lai/e;->b(Lfi/i;Lai/b;Lgi/i;Lgi/g;)Lai/c;

    move-result-object v2

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object/from16 v2, p1

    goto/16 :goto_a

    :cond_6
    move-object v2, v8

    :goto_5
    if-eqz v2, :cond_b

    iget-object v0, v2, Lai/c;->b:Ljava/util/Map;

    new-instance v13, Lfi/q;

    iget-object v14, v2, Lai/c;->a:Lrh/j;

    sget-object v16, Lsh/h;->w:Lsh/h;

    const-string v2, "coil#disk_cache_key"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_7

    check-cast v2, Ljava/lang/String;

    move-object/from16 v18, v2

    goto :goto_6

    :cond_7
    move-object/from16 v18, v8

    :goto_6
    const-string v2, "coil#is_sampled"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/Boolean;

    if-eqz v2, :cond_8

    move-object v8, v0

    check-cast v8, Ljava/lang/Boolean;

    :cond_8
    if-eqz v8, :cond_9

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move/from16 v19, v0

    goto :goto_7

    :cond_9
    const/16 v19, 0x0

    :goto_7
    if-eqz p1, :cond_a

    move-object/from16 v0, p1

    check-cast v0, Lxh/k;

    iget-boolean v0, v0, Lxh/k;->g:Z

    if-eqz v0, :cond_a

    move/from16 v20, v12

    :goto_8
    move-object/from16 v17, v7

    goto :goto_9

    :cond_a
    const/16 v20, 0x0

    goto :goto_8

    :goto_9
    invoke-direct/range {v13 .. v20}, Lfi/q;-><init>(Lrh/j;Lfi/i;Lsh/h;Lai/b;Ljava/lang/String;ZZ)V

    return-object v13

    :cond_b
    move-object/from16 v17, v7

    iget-object v13, v15, Lfi/i;->h:Lq83/j;

    move-object v3, v0

    new-instance v0, Le00/c;

    const/4 v8, 0x0

    const/4 v9, 0x5

    move-object/from16 v7, p1

    move-object v2, v15

    move-object/from16 v6, v17

    invoke-direct/range {v0 .. v9}, Le00/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object/from16 v1, p1

    check-cast v1, Lxh/k;

    iput-object v1, v10, Lxh/e;->w:Lxh/k;

    iput v12, v10, Lxh/e;->z:I

    invoke-static {v13, v0, v10}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v11, :cond_c

    return-object v11

    :cond_c
    return-object v0

    :goto_a
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    if-nez v1, :cond_d

    check-cast v2, Lxh/k;

    iget-object v1, v2, Lxh/k;->d:Lfi/i;

    invoke-static {v1, v0}, Ldc/a;->f(Lfi/i;Ljava/lang/Throwable;)Lfi/d;

    move-result-object v0

    return-object v0

    :cond_d
    throw v0
.end method
