.class public final Lhh/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhh/i;


# instance fields
.field public final a:Lbh/j;

.field public final b:Lqh/g;

.field public final c:Lbu/c;

.field public final d:Lad3/z;


# direct methods
.method public constructor <init>(Lbh/j;Lqh/g;Lbu/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhh/g;->a:Lbh/j;

    iput-object p2, p0, Lhh/g;->b:Lqh/g;

    iput-object p3, p0, Lhh/g;->c:Lbu/c;

    new-instance p2, Lad3/z;

    invoke-direct {p2, p1, p3}, Lad3/z;-><init>(Lbh/j;Lbu/c;)V

    iput-object p2, p0, Lhh/g;->d:Lad3/z;

    return-void
.end method

.method public static final b(Lhh/g;Lgh/n;Lbh/b;Lmh/j;Ljava/lang/Object;Lmh/m;Lbh/c;Ls83/c;)Ljava/lang/Object;
    .locals 8

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p7, Lhh/b;

    if-eqz v0, :cond_0

    move-object v0, p7

    check-cast v0, Lhh/b;

    iget v1, v0, Lhh/b;->K:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lhh/b;->K:I

    goto :goto_0

    :cond_0
    new-instance v0, Lhh/b;

    invoke-direct {v0, p0, p7}, Lhh/b;-><init>(Lhh/g;Ls83/c;)V

    :goto_0
    iget-object p7, v0, Lhh/b;->I:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lhh/b;->K:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget p0, v0, Lhh/b;->H:I

    iget-object p1, v0, Lhh/b;->G:Lbh/c;

    iget-object p2, v0, Lhh/b;->F:Lmh/m;

    iget-object p3, v0, Lhh/b;->E:Ljava/lang/Object;

    iget-object p4, v0, Lhh/b;->z:Lmh/j;

    iget-object p5, v0, Lhh/b;->y:Lbh/b;

    iget-object p6, v0, Lhh/b;->x:Lgh/n;

    iget-object v2, v0, Lhh/b;->w:Lhh/g;

    invoke-static {p7}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, v2

    move v2, p0

    move-object p0, v7

    move-object v7, p6

    move-object p6, p1

    move-object p1, v7

    move-object v7, p5

    move-object p5, p2

    move-object p2, v7

    move-object v7, p4

    move-object p4, p3

    move-object p3, v7

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
    iget-object v2, p0, Lhh/g;->a:Lbh/j;

    iget-object v2, p2, Lbh/b;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    :goto_2
    if-ge p7, v5, :cond_4

    invoke-interface {v2, p7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ldh/i;

    invoke-interface {v6, p1, p5}, Ldh/i;->a(Lgh/n;Lmh/m;)Ldh/j;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-static {p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p7

    new-instance v2, Ll83/k;

    invoke-direct {v2, v6, p7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    add-int/lit8 p7, p7, 0x1

    goto :goto_2

    :cond_4
    move-object v2, v3

    :goto_3
    if-eqz v2, :cond_9

    iget-object p7, v2, Ll83/k;->w:Ljava/lang/Object;

    check-cast p7, Ldh/j;

    iget-object v2, v2, Ll83/k;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    add-int/2addr v2, v4

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p0, v0, Lhh/b;->w:Lhh/g;

    iput-object p1, v0, Lhh/b;->x:Lgh/n;

    iput-object p2, v0, Lhh/b;->y:Lbh/b;

    iput-object p3, v0, Lhh/b;->z:Lmh/j;

    iput-object p4, v0, Lhh/b;->E:Ljava/lang/Object;

    iput-object p5, v0, Lhh/b;->F:Lmh/m;

    iput-object p6, v0, Lhh/b;->G:Lbh/c;

    iput v2, v0, Lhh/b;->H:I

    iput v4, v0, Lhh/b;->K:I

    invoke-interface {p7, v0}, Ldh/j;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p7

    if-ne p7, v1, :cond_5

    return-object v1

    :cond_5
    :goto_4
    check-cast p7, Ldh/h;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p7, :cond_8

    new-instance p0, Lhh/a;

    iget-object p2, p7, Ldh/h;->a:Landroid/graphics/drawable/Drawable;

    iget-boolean p3, p7, Ldh/h;->b:Z

    iget-object p4, p1, Lgh/n;->c:Ldh/g;

    iget-object p1, p1, Lgh/n;->a:Ldh/x;

    instance-of p5, p1, Ldh/p;

    if-eqz p5, :cond_6

    check-cast p1, Ldh/p;

    goto :goto_5

    :cond_6
    move-object p1, v3

    :goto_5
    if-eqz p1, :cond_7

    iget-object v3, p1, Ldh/p;->y:Ljava/lang/String;

    :cond_7
    invoke-direct {p0, p2, p3, p4, v3}, Lhh/a;-><init>(Landroid/graphics/drawable/Drawable;ZLdh/g;Ljava/lang/String;)V

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

.method public static final c(Lhh/g;Lmh/j;Ljava/lang/Object;Lmh/m;Lbh/c;Ls83/c;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v1, p5

    instance-of v3, v1, Lhh/c;

    if-eqz v3, :cond_0

    move-object v3, v1

    check-cast v3, Lhh/c;

    iget v4, v3, Lhh/c;->K:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lhh/c;->K:I

    :goto_0
    move-object v6, v3

    goto :goto_1

    :cond_0
    new-instance v3, Lhh/c;

    invoke-direct {v3, v0, v1}, Lhh/c;-><init>(Lhh/g;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v1, v6, Lhh/c;->I:Ljava/lang/Object;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v3, v6, Lhh/c;->K:I

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v4, 0x1

    const/4 v10, 0x0

    if-eqz v3, :cond_4

    if-eq v3, v4, :cond_3

    if-eq v3, v9, :cond_2

    if-ne v3, v8, :cond_1

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_b

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v2, v6, Lhh/c;->E:Lkotlin/jvm/internal/g0;

    iget-object v0, v6, Lhh/c;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    iget-object v3, v6, Lhh/c;->y:Ljava/lang/Object;

    check-cast v3, Lbh/c;

    iget-object v4, v6, Lhh/c;->x:Lmh/j;

    iget-object v5, v6, Lhh/c;->w:Lhh/g;

    :try_start_0
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_c

    :cond_3
    iget-object v0, v6, Lhh/c;->H:Lkotlin/jvm/internal/g0;

    iget-object v2, v6, Lhh/c;->G:Lkotlin/jvm/internal/g0;

    iget-object v3, v6, Lhh/c;->F:Lkotlin/jvm/internal/g0;

    iget-object v4, v6, Lhh/c;->E:Lkotlin/jvm/internal/g0;

    iget-object v5, v6, Lhh/c;->z:Ljava/lang/Object;

    check-cast v5, Lbh/c;

    iget-object v11, v6, Lhh/c;->y:Ljava/lang/Object;

    iget-object v12, v6, Lhh/c;->x:Lmh/j;

    iget-object v13, v6, Lhh/c;->w:Lhh/g;

    :try_start_1
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v20, v3

    move-object/from16 v23, v4

    move-object/from16 v24, v5

    move-object/from16 v22, v11

    move-object/from16 v18, v13

    goto/16 :goto_3

    :cond_4
    invoke-static {v1}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object v11

    move-object/from16 v1, p3

    iput-object v1, v11, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance v12, Lkotlin/jvm/internal/g0;

    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    iget-object v1, v0, Lhh/g;->a:Lbh/j;

    iget-object v1, v1, Lbh/j;->h:Lbh/b;

    iput-object v1, v12, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance v13, Lkotlin/jvm/internal/g0;

    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    :try_start_2
    iget-object v1, v0, Lhh/g;->c:Lbu/c;

    iget-object v3, v11, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v3, Lmh/m;

    invoke-virtual {v1, v3}, Lbu/c;->K(Lmh/m;)Lmh/m;

    move-result-object v1

    iput-object v1, v11, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object v1, v2, Lmh/j;->h:Ldh/i;

    if-eqz v1, :cond_6

    :try_start_3
    iget-object v3, v12, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v3, Lbh/b;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, v3, Lbh/b;->a:Ljava/util/List;

    check-cast v5, Ljava/util/Collection;

    invoke-static {v5}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v5

    iget-object v14, v3, Lbh/b;->b:Ljava/util/List;

    check-cast v14, Ljava/util/Collection;

    invoke-static {v14}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v14

    iget-object v15, v3, Lbh/b;->c:Ljava/util/List;

    check-cast v15, Ljava/util/Collection;

    invoke-static {v15}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v15

    iget-object v8, v3, Lbh/b;->d:Ljava/util/List;

    check-cast v8, Ljava/util/Collection;

    invoke-static {v8}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v8

    iget-object v3, v3, Lbh/b;->e:Ljava/util/List;

    check-cast v3, Ljava/util/Collection;

    invoke-static {v3}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v3

    if-eqz v1, :cond_5

    const/4 v9, 0x0

    invoke-virtual {v3, v9, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v2, v13

    goto/16 :goto_c

    :cond_5
    :goto_2
    new-instance v17, Lbh/b;

    invoke-static {v5}, Lq83/g;->b0(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v18

    invoke-static {v14}, Lq83/g;->b0(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v19

    invoke-static {v15}, Lq83/g;->b0(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v20

    invoke-static {v8}, Lq83/g;->b0(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v21

    invoke-static {v3}, Lq83/g;->b0(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v22

    invoke-direct/range {v17 .. v22}, Lbh/b;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    move-object/from16 v1, v17

    iput-object v1, v12, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :cond_6
    iget-object v1, v12, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lbh/b;

    iget-object v3, v11, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v3, Lmh/m;

    iput-object v0, v6, Lhh/c;->w:Lhh/g;

    iput-object v2, v6, Lhh/c;->x:Lmh/j;

    move-object/from16 v5, p2

    iput-object v5, v6, Lhh/c;->y:Ljava/lang/Object;

    move-object/from16 v8, p4

    iput-object v8, v6, Lhh/c;->z:Ljava/lang/Object;

    iput-object v11, v6, Lhh/c;->E:Lkotlin/jvm/internal/g0;

    iput-object v12, v6, Lhh/c;->F:Lkotlin/jvm/internal/g0;

    iput-object v13, v6, Lhh/c;->G:Lkotlin/jvm/internal/g0;

    iput-object v13, v6, Lhh/c;->H:Lkotlin/jvm/internal/g0;

    iput v4, v6, Lhh/c;->K:I

    move-object v4, v3

    move-object v3, v5

    move-object v5, v8

    invoke-virtual/range {v0 .. v6}, Lhh/g;->d(Lbh/b;Lmh/j;Ljava/lang/Object;Lmh/m;Lbh/c;Ls83/c;)Ljava/lang/Object;

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne v1, v7, :cond_7

    goto/16 :goto_a

    :cond_7
    move-object/from16 v18, p0

    move-object/from16 v22, p2

    move-object/from16 v24, p4

    move-object/from16 v23, v11

    move-object/from16 v20, v12

    move-object v0, v13

    move-object v2, v0

    move-object/from16 v12, p1

    :goto_3
    :try_start_4
    iput-object v1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object v0, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lgh/f;

    instance-of v3, v1, Lgh/n;

    if-eqz v3, :cond_9

    iget-object v0, v12, Lmh/j;->v:Lbc3/z;

    new-instance v17, Landroidx/lifecycle/g1;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const/16 v25, 0x0

    move-object/from16 v19, v2

    move-object/from16 v21, v12

    :try_start_5
    invoke-direct/range {v17 .. v25}, Landroidx/lifecycle/g1;-><init>(Lhh/g;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;Lmh/j;Ljava/lang/Object;Lkotlin/jvm/internal/g0;Lbh/c;Lq83/d;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    move-object/from16 v1, v17

    move-object/from16 v5, v18

    move-object/from16 v4, v21

    move-object/from16 v11, v23

    move-object/from16 v3, v24

    :try_start_6
    iput-object v5, v6, Lhh/c;->w:Lhh/g;

    iput-object v4, v6, Lhh/c;->x:Lmh/j;

    iput-object v3, v6, Lhh/c;->y:Ljava/lang/Object;

    iput-object v11, v6, Lhh/c;->z:Ljava/lang/Object;

    iput-object v2, v6, Lhh/c;->E:Lkotlin/jvm/internal/g0;

    iput-object v10, v6, Lhh/c;->F:Lkotlin/jvm/internal/g0;

    iput-object v10, v6, Lhh/c;->G:Lkotlin/jvm/internal/g0;

    iput-object v10, v6, Lhh/c;->H:Lkotlin/jvm/internal/g0;

    const/4 v8, 0x2

    iput v8, v6, Lhh/c;->K:I

    invoke-static {v0, v1, v6}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_8

    goto/16 :goto_a

    :cond_8
    move-object v0, v11

    :goto_4
    check-cast v1, Lhh/a;

    move-object v11, v0

    :goto_5
    move-object v14, v1

    move-object/from16 v17, v3

    move-object v12, v4

    move-object v13, v5

    goto :goto_6

    :catchall_2
    move-exception v0

    move-object/from16 v2, v19

    goto/16 :goto_c

    :cond_9
    move-object v4, v12

    move-object/from16 v5, v18

    move-object/from16 v11, v23

    move-object/from16 v3, v24

    instance-of v1, v1, Lgh/e;

    if-eqz v1, :cond_11

    new-instance v1, Lhh/a;

    check-cast v0, Lgh/e;

    invoke-virtual {v0}, Lgh/e;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v8, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v8, Lgh/e;

    invoke-virtual {v8}, Lgh/e;->c()Z

    move-result v8

    iget-object v9, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v9, Lgh/e;

    invoke-virtual {v9}, Lgh/e;->a()Ldh/g;

    move-result-object v9

    invoke-direct {v1, v0, v8, v9, v10}, Lhh/a;-><init>(Landroid/graphics/drawable/Drawable;ZLdh/g;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_5

    :goto_6
    iget-object v0, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    instance-of v1, v0, Lgh/n;

    if-eqz v1, :cond_a

    check-cast v0, Lgh/n;

    goto :goto_7

    :cond_a
    move-object v0, v10

    :goto_7
    if-eqz v0, :cond_b

    iget-object v0, v0, Lgh/n;->a:Ldh/x;

    invoke-static {v0}, Lqh/d;->a(Ljava/io/Closeable;)V

    :cond_b
    iget-object v0, v11, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v15, v0

    check-cast v15, Lmh/m;

    iput-object v10, v6, Lhh/c;->w:Lhh/g;

    iput-object v10, v6, Lhh/c;->x:Lmh/j;

    iput-object v10, v6, Lhh/c;->y:Ljava/lang/Object;

    iput-object v10, v6, Lhh/c;->z:Ljava/lang/Object;

    iput-object v10, v6, Lhh/c;->E:Lkotlin/jvm/internal/g0;

    iput-object v10, v6, Lhh/c;->F:Lkotlin/jvm/internal/g0;

    iput-object v10, v6, Lhh/c;->G:Lkotlin/jvm/internal/g0;

    iput-object v10, v6, Lhh/c;->H:Lkotlin/jvm/internal/g0;

    const/4 v0, 0x3

    iput v0, v6, Lhh/c;->K:I

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v12, Lmh/j;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_c

    :goto_8
    move-object v1, v14

    goto :goto_9

    :cond_c
    iget-object v1, v14, Lhh/a;->a:Landroid/graphics/drawable/Drawable;

    instance-of v1, v1, Landroid/graphics/drawable/BitmapDrawable;

    if-nez v1, :cond_d

    iget-boolean v1, v12, Lmh/j;->m:Z

    if-nez v1, :cond_d

    goto :goto_8

    :cond_d
    iget-object v1, v12, Lmh/j;->w:Lbc3/z;

    move-object/from16 v18, v12

    new-instance v12, Lhh/f;

    const/16 v19, 0x0

    move-object/from16 v16, v0

    invoke-direct/range {v12 .. v19}, Lhh/f;-><init>(Lhh/g;Lhh/a;Lmh/m;Ljava/util/List;Lbh/c;Lmh/j;Lq83/d;)V

    invoke-static {v1, v12, v6}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    :goto_9
    if-ne v1, v7, :cond_e

    :goto_a
    return-object v7

    :cond_e
    :goto_b
    check-cast v1, Lhh/a;

    iget-object v0, v1, Lhh/a;->a:Landroid/graphics/drawable/Drawable;

    instance-of v2, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v2, :cond_f

    move-object v10, v0

    check-cast v10, Landroid/graphics/drawable/BitmapDrawable;

    :cond_f
    if-eqz v10, :cond_10

    invoke-virtual {v10}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    :cond_10
    return-object v1

    :cond_11
    :try_start_7
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_c
    iget-object v1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    instance-of v2, v1, Lgh/n;

    if-eqz v2, :cond_12

    move-object v10, v1

    check-cast v10, Lgh/n;

    :cond_12
    if-eqz v10, :cond_13

    iget-object v1, v10, Lgh/n;->a:Ldh/x;

    invoke-static {v1}, Lqh/d;->a(Ljava/io/Closeable;)V

    :cond_13
    throw v0
.end method


# virtual methods
.method public final a(Lhh/h;Lq83/d;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v7, p1

    move-object/from16 v0, p2

    iget-object v2, v1, Lhh/g;->d:Lad3/z;

    instance-of v3, v0, Lhh/e;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lhh/e;

    iget v4, v3, Lhh/e;->E:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lhh/e;->E:I

    :goto_0
    move-object v9, v3

    goto :goto_1

    :cond_0
    new-instance v3, Lhh/e;

    check-cast v0, Ls83/c;

    invoke-direct {v3, v1, v0}, Lhh/e;-><init>(Lhh/g;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, v9, Lhh/e;->y:Ljava/lang/Object;

    sget-object v10, Lr83/a;->w:Lr83/a;

    iget v3, v9, Lhh/e;->E:I

    const/4 v11, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v11, :cond_1

    iget-object v2, v9, Lhh/e;->x:Lhh/k;

    iget-object v3, v9, Lhh/e;->w:Lhh/g;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    move-object v7, v2

    goto/16 :goto_8

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    move-object v0, v7

    check-cast v0, Lhh/k;

    iget-object v0, v0, Lhh/k;->d:Lmh/j;

    iget-object v3, v0, Lmh/j;->b:Ljava/lang/Object;

    move-object v4, v7

    check-cast v4, Lhh/k;

    iget-object v4, v4, Lhh/k;->e:Lnh/h;

    sget-object v5, Lqh/d;->a:[Landroid/graphics/Bitmap$Config;

    if-eqz v7, :cond_3

    move-object v5, v7

    check-cast v5, Lhh/k;

    iget-object v5, v5, Lhh/k;->f:Lbh/c;

    goto :goto_2

    :cond_3
    sget-object v5, Lbh/c;->a:Lbh/c;

    :goto_2
    iget-object v6, v1, Lhh/g;->c:Lbu/c;

    invoke-virtual {v6, v0, v4}, Lbu/c;->G(Lmh/j;Lnh/h;)Lmh/m;

    move-result-object v6

    iget-object v8, v6, Lmh/m;->e:Lnh/g;

    iget-object v12, v1, Lhh/g;->a:Lbh/j;

    iget-object v12, v12, Lbh/j;->h:Lbh/b;

    iget-object v12, v12, Lbh/b;->b:Ljava/util/List;

    move-object v13, v12

    check-cast v13, Ljava/util/Collection;

    invoke-interface {v13}, Ljava/util/Collection;->size()I

    move-result v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    const/4 v14, 0x0

    :goto_3
    if-ge v14, v13, :cond_5

    :try_start_2
    invoke-interface {v12, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll83/k;

    iget-object v11, v15, Ll83/k;->w:Ljava/lang/Object;

    check-cast v11, Ljh/a;

    iget-object v15, v15, Ll83/k;->x:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v15, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>"

    invoke-static {v11, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v11, v3, v6}, Ljh/a;->a(Ljava/lang/Object;Lmh/m;)Ljava/lang/Object;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v1, :cond_4

    move-object v3, v1

    :cond_4
    add-int/lit8 v14, v14, 0x1

    const/4 v11, 0x1

    move-object/from16 v1, p0

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_7

    :cond_5
    move-object v1, v6

    :try_start_3
    invoke-virtual {v2, v0, v3, v1, v5}, Lad3/z;->n(Lmh/j;Ljava/lang/Object;Lmh/m;Lbh/c;)Lkh/a;

    move-result-object v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    if-eqz v6, :cond_6

    :try_start_4
    invoke-virtual {v2, v0, v6, v4, v8}, Lad3/z;->m(Lmh/j;Lkh/a;Lnh/h;Lnh/g;)Lkh/b;

    move-result-object v2

    goto :goto_5

    :catchall_2
    move-exception v0

    move-object/from16 v1, p0

    :goto_4
    move-object v3, v1

    goto :goto_8

    :cond_6
    const/4 v2, 0x0

    :goto_5
    if-eqz v2, :cond_7

    invoke-static {v7, v0, v6, v2}, Lad3/z;->o(Lhh/h;Lmh/j;Lkh/a;Lkh/b;)Lmh/o;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    return-object v0

    :cond_7
    :try_start_5
    iget-object v11, v0, Lmh/j;->u:Lbc3/z;

    move-object v2, v0

    new-instance v0, Landroidx/lifecycle/g1;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    const/4 v8, 0x0

    move-object v4, v1

    move-object/from16 v1, p0

    :try_start_6
    invoke-direct/range {v0 .. v8}, Landroidx/lifecycle/g1;-><init>(Lhh/g;Lmh/j;Ljava/lang/Object;Lmh/m;Lbh/c;Lkh/a;Lhh/h;Lq83/d;)V

    iput-object v1, v9, Lhh/e;->w:Lhh/g;

    move-object/from16 v2, p1

    check-cast v2, Lhh/k;

    iput-object v2, v9, Lhh/e;->x:Lhh/k;

    const/4 v2, 0x1

    iput v2, v9, Lhh/e;->E:I

    invoke-static {v11, v0, v9}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    if-ne v0, v10, :cond_8

    return-object v10

    :cond_8
    return-object v0

    :catchall_3
    move-exception v0

    :goto_6
    move-object/from16 v7, p1

    goto :goto_4

    :catchall_4
    move-exception v0

    :goto_7
    move-object/from16 v1, p0

    goto :goto_6

    :goto_8
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    if-nez v2, :cond_9

    iget-object v2, v3, Lhh/g;->c:Lbu/c;

    check-cast v7, Lhh/k;

    iget-object v2, v7, Lhh/k;->d:Lmh/j;

    invoke-static {v2, v0}, Lbu/c;->B(Lmh/j;Ljava/lang/Throwable;)Lmh/e;

    move-result-object v0

    return-object v0

    :cond_9
    throw v0
.end method

.method public final d(Lbh/b;Lmh/j;Ljava/lang/Object;Lmh/m;Lbh/c;Ls83/c;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p6

    instance-of v1, v0, Lhh/d;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lhh/d;

    iget v2, v1, Lhh/d;->J:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lhh/d;->J:I

    move-object/from16 v2, p0

    goto :goto_0

    :cond_0
    new-instance v1, Lhh/d;

    move-object/from16 v2, p0

    invoke-direct {v1, v2, v0}, Lhh/d;-><init>(Lhh/g;Ls83/c;)V

    :goto_0
    iget-object v0, v1, Lhh/d;->H:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v1, Lhh/d;->J:I

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v6, :cond_1

    iget v4, v1, Lhh/d;->G:I

    iget-object v7, v1, Lhh/d;->F:Lbh/c;

    iget-object v8, v1, Lhh/d;->E:Lmh/m;

    iget-object v9, v1, Lhh/d;->z:Ljava/lang/Object;

    iget-object v10, v1, Lhh/d;->y:Lmh/j;

    iget-object v11, v1, Lhh/d;->x:Lbh/b;

    iget-object v12, v1, Lhh/d;->w:Lhh/g;

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
    iget-object v11, v12, Lhh/g;->a:Lbh/j;

    iget-object v11, v0, Lbh/b;->d:Ljava/util/List;

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v13

    :goto_2
    if-ge v9, v13, :cond_4

    invoke-interface {v11, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll83/k;

    iget-object v15, v14, Ll83/k;->w:Ljava/lang/Object;

    check-cast v15, Lgh/g;

    iget-object v14, v14, Ll83/k;->x:Ljava/lang/Object;

    check-cast v14, Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v14, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_3

    const-string v5, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>"

    invoke-static {v15, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v15, v4, v7}, Lgh/g;->a(Ljava/lang/Object;Lmh/m;)Lgh/h;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    new-instance v11, Ll83/k;

    invoke-direct {v11, v5, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_4
    const/4 v11, 0x0

    :goto_3
    if-eqz v11, :cond_9

    iget-object v5, v11, Ll83/k;->w:Ljava/lang/Object;

    check-cast v5, Lgh/h;

    iget-object v9, v11, Ll83/k;->x:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v9

    add-int/2addr v9, v6

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v12, v10, Lhh/d;->w:Lhh/g;

    iput-object v0, v10, Lhh/d;->x:Lbh/b;

    iput-object v1, v10, Lhh/d;->y:Lmh/j;

    iput-object v4, v10, Lhh/d;->z:Ljava/lang/Object;

    iput-object v7, v10, Lhh/d;->E:Lmh/m;

    iput-object v8, v10, Lhh/d;->F:Lbh/c;

    iput v9, v10, Lhh/d;->G:I

    iput v6, v10, Lhh/d;->J:I

    invoke-interface {v5, v10}, Lgh/h;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_5

    return-object v3

    :cond_5
    move-object v11, v0

    move-object v0, v5

    :goto_4
    move-object v5, v0

    check-cast v5, Lgh/f;

    :try_start_0
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v5, :cond_6

    return-object v5

    :cond_6
    move-object v0, v11

    goto :goto_1

    :catchall_0
    move-exception v0

    instance-of v1, v5, Lgh/n;

    if-eqz v1, :cond_7

    check-cast v5, Lgh/n;

    goto :goto_5

    :cond_7
    const/4 v5, 0x0

    :goto_5
    if-eqz v5, :cond_8

    iget-object v1, v5, Lgh/n;->a:Ldh/x;

    invoke-static {v1}, Lqh/d;->a(Ljava/io/Closeable;)V

    :cond_8
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
