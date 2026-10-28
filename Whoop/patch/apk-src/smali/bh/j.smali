.class public final Lbh/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh/e;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lmh/c;

.field public final c:Ll83/p;

.field public final d:Ll83/p;

.field public final e:Lqh/e;

.field public final f:Lhc3/d;

.field public final g:Lbu/c;

.field public final h:Lbh/b;

.field public final i:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lmh/c;Ll83/p;Ll83/p;Ll83/p;Lbh/b;Lqh/e;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move-object/from16 v2, p7

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v3, p1

    iput-object v3, v0, Lbh/j;->a:Landroid/content/Context;

    move-object/from16 v3, p2

    iput-object v3, v0, Lbh/j;->b:Lmh/c;

    move-object/from16 v3, p3

    iput-object v3, v0, Lbh/j;->c:Ll83/p;

    iput-object v1, v0, Lbh/j;->d:Ll83/p;

    iput-object v2, v0, Lbh/j;->e:Lqh/e;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v3

    sget-object v4, Lbc3/q0;->a:Lkc3/e;

    sget-object v4, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v4}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v4

    invoke-static {v3, v4}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object v3

    new-instance v4, Lbh/i;

    invoke-direct {v4, v0}, Lbh/i;-><init>(Lbh/j;)V

    invoke-interface {v3, v4}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v3

    invoke-static {v3}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v3

    iput-object v3, v0, Lbh/j;->f:Lhc3/d;

    new-instance v3, Lqh/g;

    invoke-direct {v3, v0}, Lqh/g;-><init>(Lbh/j;)V

    new-instance v4, Lbu/c;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iput-object v3, v4, Lbu/c;->w:Ljava/lang/Object;

    iput-object v4, v0, Lbh/j;->g:Lbu/c;

    new-instance v5, Laa3/i1;

    move-object/from16 v6, p6

    invoke-direct {v5, v6}, Laa3/i1;-><init>(Lbh/b;)V

    new-instance v6, Ljh/a;

    const/4 v7, 0x2

    invoke-direct {v6, v7}, Ljh/a;-><init>(I)V

    const-class v8, Lud3/e0;

    invoke-virtual {v5, v6, v8}, Laa3/i1;->k(Ljh/a;Ljava/lang/Class;)V

    new-instance v6, Ljh/a;

    const/4 v8, 0x5

    invoke-direct {v6, v8}, Ljh/a;-><init>(I)V

    const-class v9, Ljava/lang/String;

    invoke-virtual {v5, v6, v9}, Laa3/i1;->k(Ljh/a;Ljava/lang/Class;)V

    new-instance v6, Ljh/a;

    const/4 v9, 0x1

    invoke-direct {v6, v9}, Ljh/a;-><init>(I)V

    const-class v10, Landroid/net/Uri;

    invoke-virtual {v5, v6, v10}, Laa3/i1;->k(Ljh/a;Ljava/lang/Class;)V

    new-instance v6, Ljh/a;

    const/4 v11, 0x4

    invoke-direct {v6, v11}, Ljh/a;-><init>(I)V

    invoke-virtual {v5, v6, v10}, Laa3/i1;->k(Ljh/a;Ljava/lang/Class;)V

    new-instance v6, Ljh/a;

    const/4 v12, 0x3

    invoke-direct {v6, v12}, Ljh/a;-><init>(I)V

    const-class v13, Ljava/lang/Integer;

    invoke-virtual {v5, v6, v13}, Laa3/i1;->k(Ljh/a;Ljava/lang/Class;)V

    new-instance v6, Ljh/a;

    const/4 v13, 0x0

    invoke-direct {v6, v13}, Ljh/a;-><init>(I)V

    const-class v14, [B

    invoke-virtual {v5, v6, v14}, Laa3/i1;->k(Ljh/a;Ljava/lang/Class;)V

    new-instance v6, Lih/c;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iget-object v14, v5, Laa3/i1;->d:Ljava/lang/Object;

    check-cast v14, Ljava/util/ArrayList;

    new-instance v15, Ll83/k;

    invoke-direct {v15, v6, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v6, Lih/a;

    iget-boolean v15, v2, Lqh/e;->a:Z

    invoke-direct {v6, v15}, Lih/a;-><init>(Z)V

    new-instance v15, Ll83/k;

    const-class v7, Ljava/io/File;

    invoke-direct {v15, v6, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v6, Lgh/j;

    iget-boolean v15, v2, Lqh/e;->c:Z

    move-object/from16 v9, p5

    invoke-direct {v6, v9, v1, v15}, Lgh/j;-><init>(Ll83/p;Ll83/p;Z)V

    invoke-virtual {v5, v6, v10}, Laa3/i1;->j(Lgh/g;Ljava/lang/Class;)V

    new-instance v1, Lgh/a;

    invoke-direct {v1, v8}, Lgh/a;-><init>(I)V

    invoke-virtual {v5, v1, v7}, Laa3/i1;->j(Lgh/g;Ljava/lang/Class;)V

    new-instance v1, Lgh/a;

    invoke-direct {v1, v13}, Lgh/a;-><init>(I)V

    invoke-virtual {v5, v1, v10}, Laa3/i1;->j(Lgh/g;Ljava/lang/Class;)V

    new-instance v1, Lgh/a;

    invoke-direct {v1, v12}, Lgh/a;-><init>(I)V

    invoke-virtual {v5, v1, v10}, Laa3/i1;->j(Lgh/g;Ljava/lang/Class;)V

    new-instance v1, Lgh/a;

    const/4 v6, 0x6

    invoke-direct {v1, v6}, Lgh/a;-><init>(I)V

    invoke-virtual {v5, v1, v10}, Laa3/i1;->j(Lgh/g;Ljava/lang/Class;)V

    new-instance v1, Lgh/a;

    invoke-direct {v1, v11}, Lgh/a;-><init>(I)V

    const-class v6, Landroid/graphics/drawable/Drawable;

    invoke-virtual {v5, v1, v6}, Laa3/i1;->j(Lgh/g;Ljava/lang/Class;)V

    new-instance v1, Lgh/a;

    const/4 v6, 0x1

    invoke-direct {v1, v6}, Lgh/a;-><init>(I)V

    const-class v6, Landroid/graphics/Bitmap;

    invoke-virtual {v5, v1, v6}, Laa3/i1;->j(Lgh/g;Ljava/lang/Class;)V

    new-instance v1, Lgh/a;

    const/4 v6, 0x2

    invoke-direct {v1, v6}, Lgh/a;-><init>(I)V

    const-class v6, Ljava/nio/ByteBuffer;

    invoke-virtual {v5, v1, v6}, Laa3/i1;->j(Lgh/g;Ljava/lang/Class;)V

    new-instance v1, Ldh/c;

    iget v6, v2, Lqh/e;->d:I

    iget-object v2, v2, Lqh/e;->e:Ldh/m;

    invoke-direct {v1, v6, v2}, Ldh/c;-><init>(ILdh/m;)V

    iget-object v2, v5, Laa3/i1;->f:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lbh/b;

    iget-object v6, v5, Laa3/i1;->b:Ljava/lang/Object;

    check-cast v6, Ljava/util/ArrayList;

    invoke-static {v6}, Lq83/g;->b0(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v6

    iget-object v7, v5, Laa3/i1;->c:Ljava/lang/Object;

    check-cast v7, Ljava/util/ArrayList;

    invoke-static {v7}, Lq83/g;->b0(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v7

    invoke-static {v14}, Lq83/g;->b0(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v8

    iget-object v5, v5, Laa3/i1;->e:Ljava/lang/Object;

    check-cast v5, Ljava/util/ArrayList;

    invoke-static {v5}, Lq83/g;->b0(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v5

    invoke-static {v2}, Lq83/g;->b0(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v2

    move-object/from16 p1, v1

    move-object/from16 p6, v2

    move-object/from16 p5, v5

    move-object/from16 p2, v6

    move-object/from16 p3, v7

    move-object/from16 p4, v8

    invoke-direct/range {p1 .. p6}, Lbh/b;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    move-object/from16 v2, p2

    iput-object v1, v0, Lbh/j;->h:Lbh/b;

    move-object v6, v2

    check-cast v6, Ljava/util/Collection;

    new-instance v1, Lhh/g;

    invoke-direct {v1, v0, v3, v4}, Lhh/g;-><init>(Lbh/j;Lqh/g;Lbu/c;)V

    invoke-static {v1, v6}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, v0, Lbh/j;->i:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v13}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    return-void
.end method

.method public static final a(Lbh/j;Lmh/j;ILs83/c;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v0, p3

    instance-of v2, v0, Lbh/g;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lbh/g;

    iget v3, v2, Lbh/g;->H:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lbh/g;->H:I

    goto :goto_0

    :cond_0
    new-instance v2, Lbh/g;

    invoke-direct {v2, v1, v0}, Lbh/g;-><init>(Lbh/j;Ls83/c;)V

    :goto_0
    iget-object v0, v2, Lbh/g;->F:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lbh/g;->H:I

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v4, :cond_4

    if-eq v4, v7, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v1, v2, Lbh/g;->z:Lbh/c;

    iget-object v3, v2, Lbh/g;->y:Lmh/j;

    iget-object v4, v2, Lbh/g;->x:Lmh/a;

    iget-object v2, v2, Lbh/g;->w:Lbh/j;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v14, v2

    goto/16 :goto_7

    :catchall_0
    move-exception v0

    move-object v11, v1

    move-object v1, v2

    goto/16 :goto_d

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v1, v2, Lbh/g;->E:Landroid/graphics/Bitmap;

    iget-object v4, v2, Lbh/g;->z:Lbh/c;

    iget-object v6, v2, Lbh/g;->y:Lmh/j;

    iget-object v7, v2, Lbh/g;->x:Lmh/a;

    iget-object v9, v2, Lbh/g;->w:Lbh/j;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object/from16 v17, v1

    move-object/from16 v16, v4

    move-object v13, v6

    move-object v14, v9

    :goto_1
    move-object v4, v7

    goto/16 :goto_5

    :catchall_1
    move-exception v0

    move-object v11, v4

    move-object v3, v6

    :goto_2
    move-object v4, v7

    move-object v1, v9

    goto/16 :goto_d

    :cond_3
    iget-object v1, v2, Lbh/g;->z:Lbh/c;

    iget-object v4, v2, Lbh/g;->y:Lmh/j;

    iget-object v7, v2, Lbh/g;->x:Lmh/a;

    iget-object v9, v2, Lbh/g;->w:Lbh/j;

    :try_start_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object v11, v1

    move-object v1, v9

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object v11, v1

    move-object v3, v4

    goto :goto_2

    :cond_4
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lbh/j;->g:Lbu/c;

    invoke-interface {v2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v4

    invoke-static {v4}, Lbc3/f0;->s(Lq83/j;)Lbc3/k1;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v0, p1

    iget-object v9, v0, Lmh/j;->x:Landroidx/lifecycle/x;

    new-instance v10, Lmh/a;

    invoke-direct {v10, v9, v4}, Lmh/a;-><init>(Landroidx/lifecycle/x;Lbc3/k1;)V

    invoke-static {v0}, Lmh/j;->a(Lmh/j;)Lmh/h;

    move-result-object v0

    iget-object v4, v1, Lbh/j;->b:Lmh/c;

    iput-object v4, v0, Lmh/h;->b:Lmh/c;

    iput-object v8, v0, Lmh/h;->y:Lnh/g;

    invoke-virtual {v0}, Lmh/h;->a()Lmh/j;

    move-result-object v4

    sget-object v11, Lbh/c;->a:Lbh/c;

    :try_start_3
    iget-object v0, v4, Lmh/j;->b:Ljava/lang/Object;

    sget-object v12, Lmh/l;->a:Lmh/l;

    if-eq v0, v12, :cond_10

    invoke-virtual {v9, v10}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    if-nez p2, :cond_5

    iget-object v0, v4, Lmh/j;->x:Landroidx/lifecycle/x;

    iput-object v1, v2, Lbh/g;->w:Lbh/j;

    iput-object v10, v2, Lbh/g;->x:Lmh/a;

    iput-object v4, v2, Lbh/g;->y:Lmh/j;

    iput-object v11, v2, Lbh/g;->z:Lbh/c;

    iput v7, v2, Lbh/g;->H:I

    invoke-static {v0, v2}, Lkotlin/jvm/internal/j;->u(Landroidx/lifecycle/x;Ls83/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-ne v0, v3, :cond_5

    goto/16 :goto_6

    :catchall_3
    move-exception v0

    move-object v3, v4

    move-object v4, v10

    goto/16 :goto_d

    :cond_5
    move-object v7, v10

    :goto_3
    :try_start_4
    iget-object v0, v1, Lbh/j;->c:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkh/c;

    if-eqz v0, :cond_6

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_4

    :catchall_4
    move-exception v0

    move-object v3, v4

    move-object v4, v7

    goto/16 :goto_d

    :cond_6
    :goto_4
    iget-object v0, v4, Lmh/j;->B:Ljava/lang/Integer;

    iget-object v9, v4, Lmh/j;->F:Lmh/c;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v0}, Lqh/b;->b(Lmh/j;Ljava/lang/Integer;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v9, v4, Lmh/j;->c:Loh/a;

    if-eqz v9, :cond_7

    invoke-interface {v9, v0}, Loh/a;->e(Landroid/graphics/drawable/Drawable;)V

    :cond_7
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v4, Lmh/j;->d:Lmh/i;

    if-eqz v0, :cond_8

    invoke-interface {v0, v4}, Lmh/i;->b(Lmh/j;)V

    :cond_8
    iget-object v0, v4, Lmh/j;->y:Lnh/i;

    iput-object v1, v2, Lbh/g;->w:Lbh/j;

    iput-object v7, v2, Lbh/g;->x:Lmh/a;

    iput-object v4, v2, Lbh/g;->y:Lmh/j;

    iput-object v11, v2, Lbh/g;->z:Lbh/c;

    iput-object v8, v2, Lbh/g;->E:Landroid/graphics/Bitmap;

    iput v6, v2, Lbh/g;->H:I

    invoke-interface {v0, v2}, Lnh/i;->j(Lbh/g;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    if-ne v0, v3, :cond_9

    goto :goto_6

    :cond_9
    move-object v14, v1

    move-object v13, v4

    move-object/from16 v17, v8

    move-object/from16 v16, v11

    goto/16 :goto_1

    :goto_5
    :try_start_5
    move-object v15, v0

    check-cast v15, Lnh/h;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v13, Lmh/j;->t:Lbc3/z;

    new-instance v12, Lbh/h;

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v18}, Lbh/h;-><init>(Lmh/j;Lbh/j;Lnh/h;Lbh/c;Landroid/graphics/Bitmap;Lq83/d;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_7

    move-object/from16 v1, v16

    :try_start_6
    iput-object v14, v2, Lbh/g;->w:Lbh/j;

    iput-object v4, v2, Lbh/g;->x:Lmh/a;

    iput-object v13, v2, Lbh/g;->y:Lmh/j;

    iput-object v1, v2, Lbh/g;->z:Lbh/c;

    iput-object v8, v2, Lbh/g;->E:Landroid/graphics/Bitmap;

    iput v5, v2, Lbh/g;->H:I

    invoke-static {v0, v12, v2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    if-ne v0, v3, :cond_a

    :goto_6
    return-object v3

    :cond_a
    move-object v3, v13

    :goto_7
    :try_start_7
    check-cast v0, Lmh/k;

    instance-of v2, v0, Lmh/o;

    if-eqz v2, :cond_d

    move-object v2, v0

    check-cast v2, Lmh/o;

    iget-object v5, v3, Lmh/j;->c:Loh/a;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, v2, Lmh/o;->b:Lmh/j;

    instance-of v7, v5, Lch/j;

    if-nez v7, :cond_b

    goto :goto_8

    :cond_b
    iget-object v7, v6, Lmh/j;->j:Lph/e;

    check-cast v5, Lch/j;

    invoke-interface {v7, v5, v2}, Lph/e;->a(Lch/j;Lmh/k;)Lph/f;

    move-result-object v5

    instance-of v7, v5, Lph/d;

    if-eqz v7, :cond_c

    goto :goto_8

    :cond_c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v5}, Lph/f;->a()V

    :goto_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, v6, Lmh/j;->d:Lmh/i;

    if-eqz v5, :cond_e

    invoke-interface {v5, v6, v2}, Lmh/i;->a(Lmh/j;Lmh/o;)V

    goto :goto_b

    :goto_9
    move-object v11, v1

    :goto_a
    move-object v1, v14

    goto :goto_d

    :catchall_5
    move-exception v0

    goto :goto_9

    :cond_d
    instance-of v2, v0, Lmh/e;

    if-eqz v2, :cond_f

    move-object v2, v0

    check-cast v2, Lmh/e;

    iget-object v5, v3, Lmh/j;->c:Loh/a;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v5, v1}, Lbh/j;->c(Lmh/e;Loh/a;Lbh/c;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    :cond_e
    :goto_b
    iget-object v1, v4, Lmh/a;->w:Landroidx/lifecycle/x;

    invoke-virtual {v1, v4}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    return-object v0

    :cond_f
    :try_start_8
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    :catchall_6
    move-exception v0

    :goto_c
    move-object v11, v1

    move-object v3, v13

    goto :goto_a

    :catchall_7
    move-exception v0

    move-object/from16 v1, v16

    goto :goto_c

    :cond_10
    :try_start_9
    new-instance v0, Lcoil/request/NullRequestDataException;

    invoke-direct {v0}, Lcoil/request/NullRequestDataException;-><init>()V

    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :goto_d
    :try_start_a
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    if-eqz v2, :cond_12

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v3, Lmh/j;->d:Lmh/i;

    if-eqz v1, :cond_11

    invoke-interface {v1, v3}, Lmh/i;->c(Lmh/j;)V

    :cond_11
    throw v0

    :catchall_8
    move-exception v0

    goto :goto_e

    :cond_12
    iget-object v1, v1, Lbh/j;->g:Lbu/c;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v0}, Lbu/c;->B(Lmh/j;Ljava/lang/Throwable;)Lmh/e;

    move-result-object v0

    iget-object v1, v3, Lmh/j;->c:Loh/a;

    invoke-static {v0, v1, v11}, Lbh/j;->c(Lmh/e;Loh/a;Lbh/c;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    goto :goto_b

    :goto_e
    iget-object v1, v4, Lmh/a;->w:Landroidx/lifecycle/x;

    invoke-virtual {v1, v4}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    throw v0
.end method

.method public static c(Lmh/e;Loh/a;Lbh/c;)V
    .locals 2

    invoke-virtual {p0}, Lmh/e;->b()Lmh/j;

    move-result-object v0

    instance-of v1, p1, Lch/j;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lmh/e;->b()Lmh/j;

    move-result-object v1

    iget-object v1, v1, Lmh/j;->j:Lph/e;

    check-cast p1, Lch/j;

    invoke-interface {v1, p1, p0}, Lph/e;->a(Lch/j;Lmh/k;)Lph/f;

    move-result-object p1

    instance-of v1, p1, Lph/d;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Lph/f;->a()V

    :goto_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, v0, Lmh/j;->d:Lmh/i;

    if-eqz p1, :cond_2

    invoke-interface {p1, v0, p0}, Lmh/i;->d(Lmh/j;Lmh/e;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final b(Lmh/j;Ls83/c;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v0}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v0

    new-instance v1, La6/c;

    const/4 v2, 0x0

    const/16 v3, 0x9

    invoke-direct {v1, p0, p1, v2, v3}, La6/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
