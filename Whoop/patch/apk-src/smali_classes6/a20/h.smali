.class public final La20/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/a2;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, La20/h;->a:I

    iput-object p1, p0, La20/h;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lsz/l0;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, La20/h;->a:I

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, La20/h;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lv20/f;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, La20/h;->a:I

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La20/h;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lw20/k;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, La20/h;->a:I

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, La20/h;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Class;Ll8/c;)Landroidx/lifecycle/w1;
    .locals 48

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    iget v2, v0, La20/h;->a:I

    const/16 v5, 0x12

    const/16 v8, 0xe

    const/4 v9, 0x5

    const/4 v10, 0x3

    const/16 v12, 0xb

    const/4 v13, 0x1

    const/16 v14, 0xc

    const/4 v15, 0x7

    iget-object v4, v0, La20/h;->b:Ljava/lang/Object;

    const-string v3, "extras"

    const/4 v6, 0x0

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    packed-switch v2, :pswitch_data_0

    check-cast v4, Lx20/g;

    invoke-virtual {v4}, Lx20/g;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx20/s;

    new-instance v3, Lf30/f;

    iget-object v4, v2, Lx20/s;->a:Ljava/lang/String;

    invoke-direct {v3, v4}, Lf30/f;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lup/d;->K(Ll8/c;)Landroid/app/Application;

    move-result-object v4

    sget-object v6, Lbc3/q0;->a:Lkc3/e;

    sget-object v6, Lkc3/d;->w:Lkc3/d;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v7, Lt9/c0;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    new-instance v10, Lt9/p;

    invoke-direct {v10, v15}, Lt9/p;-><init>(I)V

    new-instance v11, Luy/a;

    invoke-direct {v11, v7, v13}, Luy/a;-><init>(Lt9/c0;I)V

    invoke-static {v11}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v7

    new-instance v11, Le20/a;

    sget-object v12, Ly20/a;->a:Ls10/c;

    invoke-direct {v11, v10, v12, v9}, Le20/a;-><init>(Ljava/lang/Object;Lv03/h;I)V

    invoke-static {v11}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v9

    invoke-static {v4}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v10

    new-instance v11, Lc20/g;

    const/16 v12, 0x10

    invoke-direct {v11, v10, v12}, Lc20/g;-><init>(Lv03/e;I)V

    new-instance v10, Lb10/c;

    invoke-direct {v10, v11, v8}, Lb10/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1}, Landroidx/lifecycle/o1;->e(Ll8/c;)Landroidx/lifecycle/k1;

    move-result-object v1

    new-instance v8, Lx20/w;

    new-instance v11, Lf30/e;

    new-instance v16, Lb10/z0;

    new-instance v12, Lal0/f;

    invoke-direct {v12, v4, v5}, Lal0/f;-><init>(Landroid/content/Context;I)V

    sget-object v19, Lb10/d;->x:Lb10/d;

    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v20, v13

    check-cast v20, Lq83/j;

    new-instance v13, Lb10/b;

    new-instance v14, Lal0/f;

    invoke-direct {v14, v4, v5}, Lal0/f;-><init>(Landroid/content/Context;I)V

    sget-object v5, Lm83/a0;->w:Lm83/a0;

    invoke-direct {v13, v4, v5, v14}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    new-instance v14, Lyy/j;

    invoke-interface {v9}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lqy/d;

    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lq83/j;

    invoke-direct {v14, v15, v7}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    invoke-interface {v9}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v24, v7

    check-cast v24, Lqy/d;

    move-object/from16 v17, v4

    move-object/from16 v21, v5

    move-object/from16 v18, v12

    move-object/from16 v22, v13

    move-object/from16 v23, v14

    invoke-direct/range {v16 .. v24}, Lb10/z0;-><init>(Landroid/content/Context;Lc93/a;Lb10/d;Lq83/j;Ljava/util/Set;Lb10/b;Lyy/j;Lqy/d;)V

    move-object/from16 v4, v16

    invoke-direct {v11, v4, v10, v3, v6}, Lf30/e;-><init>(Lb10/z0;Lb10/c;Lf30/f;Lbc3/z;)V

    new-instance v3, Lx20/f;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-direct {v8, v2, v11, v3, v1}, Lx20/w;-><init>(Lx20/s;Lf30/e;Lx20/f;Landroidx/lifecycle/k1;)V

    return-object v8

    :pswitch_0
    new-instance v1, Lw20/x;

    new-instance v2, Lw20/a;

    check-cast v4, Lw20/k;

    iget-object v3, v4, Lw20/k;->w:Ljava/lang/String;

    iget-object v5, v4, Lw20/k;->x:Ly00/i;

    iget-boolean v4, v4, Lw20/k;->z:Z

    invoke-direct {v2, v3, v5, v4}, Lw20/a;-><init>(Ljava/lang/String;Ly00/i;Z)V

    invoke-direct {v1, v2}, Lw20/x;-><init>(Lw20/a;)V

    return-object v1

    :pswitch_1
    new-instance v1, Lv20/r;

    new-instance v2, Lv20/p;

    check-cast v4, Lv20/f;

    iget-object v3, v4, Lv20/f;->w:Ljava/lang/String;

    iget-object v5, v4, Lv20/f;->x:Ljava/lang/String;

    iget-object v6, v4, Lv20/f;->y:Ljava/lang/String;

    iget-object v4, v4, Lv20/f;->z:Ljava/lang/String;

    invoke-direct {v2, v3, v5, v6, v4}, Lv20/p;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lv20/r;-><init>(Lv20/p;)V

    return-object v1

    :pswitch_2
    invoke-static {v1}, Landroidx/lifecycle/o1;->e(Ll8/c;)Landroidx/lifecycle/k1;

    move-result-object v2

    check-cast v4, Lu10/e;

    invoke-virtual {v4}, Lu10/e;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu10/i;

    iget-object v4, v3, Lu10/i;->z:Ljava/lang/String;

    iget-object v5, v3, Lu10/i;->w:Lv00/c0;

    invoke-static {v1}, Lup/d;->K(Ll8/c;)Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v13, Lh53/e;

    new-instance v7, Lt9/p;

    invoke-direct {v7, v15}, Lt9/p;-><init>(I)V

    new-instance v11, Lu00/e;

    invoke-direct {v11, v14}, Lu00/e;-><init>(I)V

    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    sget-object v14, Lu10/j;->a:Ls10/c;

    invoke-static {v14}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v14

    iput-object v14, v13, Lh53/e;->a:Ljava/lang/Object;

    invoke-static {v2}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v2

    iput-object v2, v13, Lh53/e;->b:Ljava/lang/Object;

    new-instance v14, Lc20/g;

    invoke-direct {v14, v2, v12}, Lc20/g;-><init>(Lv03/e;I)V

    invoke-static {v14}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v2

    iput-object v2, v13, Lh53/e;->c:Ljava/lang/Object;

    invoke-static {v5}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v2

    iput-object v2, v13, Lh53/e;->d:Ljava/lang/Object;

    new-instance v5, Lc20/g;

    invoke-direct {v5, v2, v8}, Lc20/g;-><init>(Lv03/e;I)V

    iget-object v2, v13, Lh53/e;->b:Ljava/lang/Object;

    check-cast v2, Lv03/e;

    iget-object v8, v13, Lh53/e;->c:Ljava/lang/Object;

    check-cast v8, Lv03/h;

    new-instance v14, Lay/w;

    invoke-direct {v14, v2, v8, v5, v15}, Lay/w;-><init>(Lv03/h;Lv03/h;Lv03/h;I)V

    invoke-static {v14}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v2

    iput-object v2, v13, Lh53/e;->e:Ljava/lang/Object;

    invoke-static {v1}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v1

    iput-object v1, v13, Lh53/e;->f:Ljava/lang/Object;

    sget-object v1, Ls10/b;->d:Ls10/c;

    new-instance v2, Le20/a;

    invoke-direct {v2, v7, v1, v9}, Le20/a;-><init>(Ljava/lang/Object;Lv03/h;I)V

    invoke-static {v2}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v1

    iput-object v1, v13, Lh53/e;->g:Ljava/lang/Object;

    sget-object v2, Ls10/b;->a:Lcy/b;

    new-instance v5, Lb20/g;

    invoke-direct {v5, v1, v2, v12}, Lb20/g;-><init>(Lv03/h;Lv03/h;I)V

    iput-object v5, v13, Lh53/e;->h:Ljava/lang/Object;

    iget-object v5, v13, Lh53/e;->f:Ljava/lang/Object;

    check-cast v5, Lv03/e;

    new-instance v7, La30/c;

    invoke-direct {v7, v5, v2, v1, v10}, La30/c;-><init>(Lv03/h;Lv03/h;Lv03/h;I)V

    iput-object v7, v13, Lh53/e;->i:Ljava/lang/Object;

    new-instance v1, Lp20/i;

    invoke-direct {v1, v5, v9}, Lp20/i;-><init>(Lv03/h;I)V

    iput-object v1, v13, Lh53/e;->j:Ljava/lang/Object;

    new-instance v7, Ls10/d;

    invoke-direct {v7, v1, v6}, Ls10/d;-><init>(Lp20/i;I)V

    iput-object v7, v13, Lh53/e;->k:Ljava/lang/Object;

    sget-object v1, Ls10/b;->f:Ls10/c;

    new-instance v8, La30/c;

    const/4 v9, 0x2

    invoke-direct {v8, v5, v7, v1, v9}, La30/c;-><init>(Lv03/h;Lv03/h;Lv03/h;I)V

    iput-object v8, v13, Lh53/e;->l:Ljava/lang/Object;

    invoke-static {v4}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v4

    new-instance v5, Lp20/i;

    const/4 v7, 0x6

    invoke-direct {v5, v4, v7}, Lp20/i;-><init>(Lv03/h;I)V

    iget-object v4, v13, Lh53/e;->f:Ljava/lang/Object;

    check-cast v4, Lv03/e;

    new-instance v7, La30/h;

    invoke-direct {v7, v4, v10}, La30/h;-><init>(Lv03/h;I)V

    sget-object v23, Ls10/b;->e:Ls10/c;

    iget-object v8, v13, Lh53/e;->h:Ljava/lang/Object;

    move-object/from16 v24, v8

    check-cast v24, Lb20/g;

    iget-object v8, v13, Lh53/e;->i:Ljava/lang/Object;

    move-object/from16 v25, v8

    check-cast v25, La30/c;

    iget-object v8, v13, Lh53/e;->l:Ljava/lang/Object;

    move-object/from16 v26, v8

    check-cast v26, La30/c;

    sget-object v27, Ls10/b;->c:Lcy/b;

    iget-object v8, v13, Lh53/e;->d:Ljava/lang/Object;

    move-object/from16 v31, v8

    check-cast v31, Lv03/e;

    new-instance v21, Lk20/b;

    move-object/from16 v29, v2

    move-object/from16 v22, v4

    move-object/from16 v28, v5

    move-object/from16 v30, v7

    invoke-direct/range {v21 .. v31}, Lk20/b;-><init>(Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/d;Lv03/h;La30/h;Lv03/h;)V

    invoke-static/range {v21 .. v21}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v2

    iput-object v2, v13, Lh53/e;->m:Ljava/lang/Object;

    new-instance v2, Lb10/c;

    invoke-direct {v2, v11, v6}, Lb10/c;-><init>(Ljava/lang/Object;I)V

    iget-object v4, v13, Lh53/e;->f:Ljava/lang/Object;

    move-object/from16 v22, v4

    check-cast v22, Lv03/e;

    iget-object v4, v13, Lh53/e;->k:Ljava/lang/Object;

    move-object/from16 v23, v4

    check-cast v23, Ls10/d;

    iget-object v4, v13, Lh53/e;->l:Ljava/lang/Object;

    move-object/from16 v27, v4

    check-cast v27, La30/c;

    iget-object v4, v13, Lh53/e;->h:Ljava/lang/Object;

    move-object/from16 v28, v4

    check-cast v28, Lb20/g;

    iget-object v4, v13, Lh53/e;->g:Ljava/lang/Object;

    move-object/from16 v24, v4

    check-cast v24, Lv03/h;

    new-instance v21, Lb10/a1;

    const/16 v30, 0x0

    move-object/from16 v26, v1

    move-object/from16 v25, v29

    move-object/from16 v29, v24

    move-object/from16 v24, v2

    invoke-direct/range {v21 .. v30}, Lb10/a1;-><init>(Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;I)V

    move-object/from16 v4, v27

    move-object/from16 v1, v28

    move-object/from16 v24, v29

    move-object/from16 v29, v25

    new-instance v2, Lb20/g;

    invoke-direct {v2, v1, v4, v6}, Lb20/g;-><init>(Lv03/h;Lv03/h;I)V

    iget-object v1, v13, Lh53/e;->j:Ljava/lang/Object;

    move-object/from16 v23, v1

    check-cast v23, Lp20/i;

    move-object/from16 v22, v21

    new-instance v21, Ld20/d;

    const/16 v28, 0x7

    move-object/from16 v25, v2

    move-object/from16 v27, v26

    move-object/from16 v26, v29

    invoke-direct/range {v21 .. v28}, Ld20/d;-><init>(Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;I)V

    invoke-static/range {v21 .. v21}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v1

    iput-object v1, v13, Lh53/e;->n:Ljava/lang/Object;

    new-instance v1, Lv03/b;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, v13, Lh53/e;->o:Ljava/lang/Object;

    sget-object v1, Ls10/b;->g:Ls10/c;

    invoke-static {v1}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v27

    new-instance v1, Lv03/b;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, v13, Lh53/e;->p:Ljava/lang/Object;

    iget-object v2, v13, Lh53/e;->m:Ljava/lang/Object;

    move-object/from16 v21, v2

    check-cast v21, Lv03/h;

    iget-object v2, v13, Lh53/e;->n:Ljava/lang/Object;

    move-object/from16 v22, v2

    check-cast v22, Lv03/h;

    iget-object v2, v13, Lh53/e;->c:Ljava/lang/Object;

    move-object/from16 v23, v2

    check-cast v23, Lv03/h;

    iget-object v2, v13, Lh53/e;->e:Ljava/lang/Object;

    move-object/from16 v24, v2

    check-cast v24, Lv03/h;

    iget-object v2, v13, Lh53/e;->o:Ljava/lang/Object;

    move-object/from16 v25, v2

    check-cast v25, Lv03/b;

    iget-object v2, v13, Lh53/e;->d:Ljava/lang/Object;

    move-object/from16 v26, v2

    check-cast v26, Lv03/e;

    iget-object v2, v13, Lh53/e;->a:Ljava/lang/Object;

    move-object/from16 v28, v2

    check-cast v28, Lv03/h;

    new-instance v20, Lc20/o;

    move-object/from16 v29, v1

    invoke-direct/range {v20 .. v29}, Lc20/o;-><init>(Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/b;)V

    move-object/from16 v1, v20

    new-instance v2, Lb10/c;

    invoke-direct {v2, v1, v12}, Lb10/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {v2}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v5

    iput-object v5, v13, Lh53/e;->q:Ljava/lang/Object;

    iget-object v1, v13, Lh53/e;->p:Ljava/lang/Object;

    check-cast v1, Lv03/b;

    iget-object v2, v13, Lh53/e;->d:Ljava/lang/Object;

    move-object v6, v2

    check-cast v6, Lv03/e;

    iget-object v2, v13, Lh53/e;->e:Ljava/lang/Object;

    move-object v7, v2

    check-cast v7, Lv03/h;

    iget-object v2, v13, Lh53/e;->c:Ljava/lang/Object;

    move-object v8, v2

    check-cast v8, Lv03/h;

    iget-object v2, v13, Lh53/e;->m:Ljava/lang/Object;

    move-object v9, v2

    check-cast v9, Lv03/h;

    iget-object v2, v13, Lh53/e;->o:Ljava/lang/Object;

    move-object v10, v2

    check-cast v10, Lv03/b;

    new-instance v4, Ld20/d;

    const/4 v11, 0x5

    invoke-direct/range {v4 .. v11}, Ld20/d;-><init>(Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;I)V

    invoke-static {v1, v4}, Lv03/b;->a(Lv03/h;Lv03/h;)V

    iget-object v1, v13, Lh53/e;->d:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lv03/e;

    iget-object v1, v13, Lh53/e;->e:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lv03/h;

    iget-object v1, v13, Lh53/e;->c:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lv03/h;

    iget-object v1, v13, Lh53/e;->q:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lv03/h;

    iget-object v1, v13, Lh53/e;->m:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Lv03/h;

    iget-object v1, v13, Lh53/e;->o:Ljava/lang/Object;

    move-object v10, v1

    check-cast v10, Lv03/b;

    new-instance v4, Ld20/d;

    const/4 v11, 0x4

    invoke-direct/range {v4 .. v11}, Ld20/d;-><init>(Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;I)V

    move-object v1, v9

    iget-object v2, v13, Lh53/e;->p:Ljava/lang/Object;

    move-object v9, v2

    check-cast v9, Lv03/b;

    move-object v7, v6

    move-object v6, v4

    new-instance v4, Lc20/b;

    move-object v8, v5

    const/4 v5, 0x2

    invoke-direct/range {v4 .. v9}, Lc20/b;-><init>(ILv03/d;Lv03/h;Lv03/h;Lv03/h;)V

    iget-object v2, v13, Lh53/e;->a:Ljava/lang/Object;

    check-cast v2, Lv03/h;

    new-instance v5, Lay/w;

    const/16 v6, 0x8

    invoke-direct {v5, v4, v2, v1, v6}, Lay/w;-><init>(Lv03/h;Lv03/h;Lv03/h;I)V

    invoke-static {v5}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v1

    invoke-static {v10, v1}, Lv03/b;->a(Lv03/h;Lv03/h;)V

    iget-object v1, v13, Lh53/e;->e:Ljava/lang/Object;

    check-cast v1, Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh20/f;

    iget-object v2, v3, Lu10/i;->x:La30/a;

    invoke-virtual {v1, v2}, Lh20/f;->a(La30/a;)V

    iget-object v1, v13, Lh53/e;->c:Ljava/lang/Object;

    check-cast v1, Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls10/f;

    iget-object v2, v3, Lu10/i;->y:Lq20/y;

    invoke-virtual {v1, v2}, Ls10/f;->a(Lq20/y;)V

    new-instance v1, Lu10/v;

    iget-object v2, v13, Lh53/e;->a:Ljava/lang/Object;

    check-cast v2, Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbc3/c0;

    invoke-direct {v1, v13, v2}, Lu10/v;-><init>(Lh53/e;Lbc3/c0;)V

    return-object v1

    :pswitch_3
    check-cast v4, Lt10/g;

    invoke-virtual {v4}, Lt10/g;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt10/p;

    iget-object v3, v2, Lt10/p;->x:Lv00/c0;

    iget-object v4, v2, Lt10/p;->w:Ljava/lang/String;

    iget-boolean v5, v2, Lt10/p;->y:Z

    iget-object v6, v2, Lt10/p;->z:Lc10/n;

    iget-object v7, v2, Lt10/p;->F:Ljava/lang/Integer;

    invoke-static {v1}, Lup/d;->K(Ll8/c;)Landroid/app/Application;

    move-result-object v29

    iget-object v8, v2, Lt10/p;->E:Ljava/lang/String;

    invoke-static {v1}, Landroidx/lifecycle/o1;->e(Ll8/c;)Landroidx/lifecycle/k1;

    move-result-object v30

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v19, Lt10/b;

    new-instance v1, Lt9/p;

    invoke-direct {v1, v15}, Lt9/p;-><init>(I)V

    new-instance v9, Lu00/e;

    invoke-direct {v9, v14}, Lu00/e;-><init>(I)V

    new-instance v10, Lg73/d;

    const/16 v11, 0x1b

    invoke-direct {v10, v11}, Lg73/d;-><init>(I)V

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v25

    move-object/from16 v20, v1

    move-object/from16 v23, v3

    move-object/from16 v24, v4

    move-object/from16 v27, v6

    move-object/from16 v26, v7

    move-object/from16 v28, v8

    move-object/from16 v21, v9

    move-object/from16 v22, v10

    invoke-direct/range {v19 .. v30}, Lt10/b;-><init>(Lt9/p;Lu00/e;Lg73/d;Lv00/c0;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Lc10/n;Ljava/lang/String;Landroid/app/Application;Landroidx/lifecycle/k1;)V

    move-object/from16 v1, v19

    iget-object v3, v1, Lt10/b;->d:Lv03/h;

    invoke-interface {v3}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls10/f;

    iget-object v2, v2, Lt10/p;->G:Lq20/y;

    invoke-virtual {v3, v2}, Ls10/f;->a(Lq20/y;)V

    new-instance v2, Lt10/n;

    iget-object v3, v1, Lt10/b;->b:Lv03/h;

    invoke-interface {v3}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbc3/c0;

    invoke-direct {v2, v1, v3}, Lt10/n;-><init>(Lt10/b;Lbc3/c0;)V

    return-object v2

    :pswitch_4
    invoke-static {v1}, Lup/d;->K(Ll8/c;)Landroid/app/Application;

    move-result-object v5

    invoke-static {v1}, Landroidx/lifecycle/o1;->e(Ll8/c;)Landroidx/lifecycle/k1;

    move-result-object v28

    new-instance v1, Lsz/m0;

    invoke-direct {v1, v5, v6}, Lsz/m0;-><init>(Landroid/app/Application;I)V

    new-instance v2, Lsz/m0;

    invoke-direct {v2, v5, v13}, Lsz/m0;-><init>(Landroid/app/Application;I)V

    const-string v3, "GooglePayPaymentMethodLauncher"

    invoke-static {v3}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    check-cast v4, Lsz/l0;

    iget-object v7, v4, Lsz/l0;->w:Lsz/c0;

    iget-object v8, v4, Lsz/l0;->F:Lux/a;

    iget-object v10, v4, Lsz/l0;->G:Lux/b;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v11, Lt9/c0;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lt9/p;

    invoke-direct {v6, v15}, Lt9/p;-><init>(I)V

    sget-object v16, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v7}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v7

    invoke-static {v5}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v12

    new-instance v9, Lc20/g;

    invoke-direct {v9, v12, v14}, Lc20/g;-><init>(Lv03/e;I)V

    invoke-static {v9}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v9

    new-instance v14, Lb20/g;

    invoke-direct {v14, v7, v9, v15}, Lb20/g;-><init>(Lv03/h;Lv03/h;I)V

    invoke-static {v14}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v9

    new-instance v14, Luy/a;

    invoke-direct {v14, v11, v13}, Luy/a;-><init>(Lt9/c0;I)V

    invoke-static {v14}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v11

    invoke-static/range {v16 .. v16}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v13

    new-instance v14, Le20/a;

    const/4 v15, 0x5

    invoke-direct {v14, v6, v13, v15}, Le20/a;-><init>(Ljava/lang/Object;Lv03/h;I)V

    invoke-static {v14}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v6

    invoke-static {v1}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v30

    invoke-static {v2}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v31

    invoke-static {v8}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v33

    invoke-static {v10}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v34

    new-instance v29, Ln10/s;

    const/16 v35, 0x1

    move-object/from16 v32, v7

    invoke-direct/range {v29 .. v35}, Ln10/s;-><init>(Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/e;I)V

    move-object/from16 v7, v30

    move-object/from16 v31, v32

    invoke-static/range {v29 .. v29}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v13

    new-instance v8, Lb20/g;

    const/16 v10, 0xb

    invoke-direct {v8, v6, v11, v10}, Lb20/g;-><init>(Lv03/h;Lv03/h;I)V

    invoke-static {v3}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v10

    new-instance v14, La30/c;

    const/4 v15, 0x2

    invoke-direct {v14, v12, v7, v10, v15}, La30/c;-><init>(Lv03/h;Lv03/h;Lv03/h;I)V

    invoke-static {v14}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v7

    new-instance v10, Lb20/g;

    const/4 v14, 0x0

    invoke-direct {v10, v8, v7, v14}, Lb20/g;-><init>(Lv03/h;Lv03/h;I)V

    invoke-static {v10}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v7

    new-instance v29, Ld20/d;

    const/16 v36, 0x2

    move-object/from16 v32, v6

    move-object/from16 v30, v12

    move-object/from16 v35, v34

    move-object/from16 v34, v33

    move-object/from16 v33, v7

    invoke-direct/range {v29 .. v36}, Ld20/d;-><init>(Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;I)V

    invoke-static/range {v29 .. v29}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v14

    new-instance v21, Lsz/p0;

    invoke-interface {v9}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v22, v6

    check-cast v22, Ldq/p;

    new-instance v15, Lyy/f;

    invoke-direct {v15, v1, v2}, Lyy/f;-><init>(Lc93/a;Lc93/a;)V

    new-instance v25, Lb10/z0;

    sget-object v7, Lb10/d;->x:Lb10/d;

    invoke-interface {v11}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lq83/j;

    new-instance v10, Lb10/b;

    invoke-direct {v10, v5, v3, v1}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    move-object v2, v11

    new-instance v11, Lyy/j;

    invoke-interface/range {v32 .. v32}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lqy/d;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq83/j;

    invoke-direct {v11, v6, v2}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    invoke-interface/range {v32 .. v32}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Lqy/d;

    move-object v6, v1

    move-object v9, v3

    move-object/from16 v24, v4

    move-object/from16 v4, v25

    invoke-direct/range {v4 .. v12}, Lb10/z0;-><init>(Landroid/content/Context;Lc93/a;Lb10/d;Lq83/j;Ljava/util/Set;Lb10/b;Lyy/j;Lqy/d;)V

    invoke-interface {v13}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v26, v1

    check-cast v26, Lux/q;

    invoke-interface {v14}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v27, v1

    check-cast v27, Lsz/q0;

    move-object/from16 v23, v15

    invoke-direct/range {v21 .. v28}, Lsz/p0;-><init>(Ldq/p;Lyy/f;Lsz/l0;Lb10/z0;Lux/q;Lsz/q0;Landroidx/lifecycle/k1;)V

    return-object v21

    :pswitch_5
    new-instance v1, Lb10/z0;

    move-object v2, v4

    check-cast v2, Landroid/content/Context;

    new-instance v3, Lq80/h;

    const/16 v4, 0x1a

    invoke-direct {v3, v0, v4}, Lq80/h;-><init>(Ljava/lang/Object;I)V

    sget-object v4, Lb10/c1;->a:Lb10/b1;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lb10/b1;->b:Lb10/d;

    const/4 v10, 0x0

    const v11, 0xfff8

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Lb10/z0;-><init>(Landroid/content/Context;Lc93/a;Lb10/d;Lqy/d;Lq83/j;Ljava/util/Set;Lyy/j;Lb10/b;Ljava/util/Set;I)V

    new-instance v2, Ls40/d0;

    new-instance v3, Lrm/p;

    const/16 v4, 0x9

    invoke-direct {v3, v0, v4}, Lrm/p;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v2, v3, v1}, Ls40/d0;-><init>(Lrm/p;Lb10/z0;)V

    return-object v2

    :pswitch_6
    check-cast v4, Li20/u0;

    move-object/from16 v2, p1

    invoke-interface {v4, v2, v1}, Li20/u0;->create(Ljava/lang/Class;Ll8/c;)Li20/v0;

    move-result-object v1

    return-object v1

    :pswitch_7
    invoke-static {v1}, Lup/d;->K(Ll8/c;)Landroid/app/Application;

    move-result-object v10

    invoke-static {v1}, Landroidx/lifecycle/o1;->e(Ll8/c;)Landroidx/lifecycle/k1;

    move-result-object v11

    check-cast v4, Lh20/s3;

    invoke-virtual {v4}, Lh20/s3;->invoke()Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lh20/w3;

    new-instance v2, Lp20/h;

    new-instance v3, Lu00/e;

    invoke-direct {v3, v14}, Lu00/e;-><init>(I)V

    new-instance v4, Lt9/c0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lt9/p;

    invoke-direct {v1, v15}, Lt9/p;-><init>(I)V

    new-instance v6, Lg73/d;

    invoke-direct {v6, v5}, Lg73/d;-><init>(I)V

    new-instance v7, Lng3/o;

    const/16 v5, 0xb

    const/4 v8, 0x0

    invoke-direct {v7, v5, v8}, Lng3/o;-><init>(IZ)V

    new-instance v5, Lng3/o;

    invoke-direct {v5, v14, v8}, Lng3/o;-><init>(IZ)V

    new-instance v9, Lg73/d;

    const/16 v8, 0x1b

    invoke-direct {v9, v8}, Lg73/d;-><init>(I)V

    move-object v8, v5

    move-object v5, v1

    invoke-direct/range {v2 .. v12}, Lp20/h;-><init>(Lu00/e;Lt9/c0;Lt9/p;Lg73/d;Lng3/o;Lng3/o;Lg73/d;Landroid/app/Application;Landroidx/lifecycle/k1;Lh20/w3;)V

    iget-object v1, v2, Lp20/h;->r:Lv03/b;

    invoke-virtual {v1}, Lv03/b;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh20/k4;

    const-string v2, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.PaymentSheetViewModel.Factory.create"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1

    :pswitch_8
    invoke-static {v1}, Lup/d;->K(Ll8/c;)Landroid/app/Application;

    move-result-object v8

    invoke-static {v1}, Landroidx/lifecycle/o1;->e(Ll8/c;)Landroidx/lifecycle/k1;

    move-result-object v31

    check-cast v4, Lh20/g0;

    invoke-virtual {v4}, Lh20/g0;->invoke()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v24, v1

    check-cast v24, Lh20/f0;

    new-instance v3, Lp20/f;

    new-instance v4, Lu00/e;

    invoke-direct {v4, v14}, Lu00/e;-><init>(I)V

    new-instance v5, Lng3/n;

    invoke-direct {v5, v14}, Lng3/n;-><init>(I)V

    new-instance v6, Lt9/c0;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lt9/p;

    invoke-direct {v7, v15}, Lt9/p;-><init>(I)V

    move-object/from16 v10, v24

    move-object/from16 v9, v31

    invoke-direct/range {v3 .. v10}, Lp20/f;-><init>(Lu00/e;Lng3/n;Lt9/c0;Lt9/p;Landroid/app/Application;Landroidx/lifecycle/k1;Lh20/f0;)V

    new-instance v23, Lh20/w0;

    iget-object v1, v3, Lp20/f;->d:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v25, v1

    check-cast v25, Lxz/f0;

    new-instance v1, Lu00/e;

    const/16 v5, 0xb

    invoke-direct {v1, v5}, Lu00/e;-><init>(I)V

    iget-object v2, v3, Lp20/f;->v:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v27, v2

    check-cast v27, Lwz/r0;

    iget-object v2, v3, Lp20/f;->z:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v28, v2

    check-cast v28, Lk20/a;

    iget-object v2, v3, Lp20/f;->A:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v29, v2

    check-cast v29, Lz20/g;

    iget-object v2, v3, Lp20/f;->n:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v30, v4

    check-cast v30, Lq83/j;

    iget-object v4, v3, Lp20/f;->B:Lv03/h;

    invoke-interface {v4}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v32, v4

    check-cast v32, Lh20/x;

    new-instance v4, Lzx/o;

    iget-object v5, v10, Lh20/f0;->F:Ljava/util/Set;

    invoke-static {v5}, Ls93/k;->c(Ljava/lang/Object;)V

    check-cast v5, Ljava/util/Set;

    sget-object v6, Lb10/d;->x:Lb10/d;

    new-instance v7, Lyy/j;

    iget-object v9, v3, Lp20/f;->q:Lv03/h;

    invoke-interface {v9}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lqy/d;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lq83/j;

    invoke-direct {v7, v9, v11}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    invoke-direct {v4, v8, v5, v6, v7}, Lzx/o;-><init>(Landroid/content/Context;Ljava/util/Set;Lb10/d;Lyy/j;)V

    new-instance v5, Lny/d;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lny/d;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lny/d;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v3}, Lp20/f;->a()Lb20/f;

    move-result-object v9

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq83/j;

    invoke-static {v6, v7, v9, v8, v2}, La30/c;->a(Lny/d;Lny/d;Lb20/f;Landroid/content/Context;Lq83/j;)Lny/h;

    move-result-object v2

    new-instance v6, Lny/d;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v3}, Lp20/f;->a()Lb20/f;

    move-result-object v7

    new-instance v8, Lny/c;

    invoke-virtual {v3}, Lp20/f;->a()Lb20/f;

    move-result-object v9

    iget-object v11, v3, Lp20/f;->D:Lb20/g;

    iget-object v12, v3, Lp20/f;->E:La30/h;

    invoke-direct {v8, v9, v11, v12}, Lny/c;-><init>(Lb20/f;Lk83/a;La30/h;)V

    invoke-static {v5, v2, v6, v7, v8}, Lay/w;->a(Lny/d;Lny/h;Lny/d;Lb20/f;Lny/c;)Lny/d;

    move-result-object v34

    iget-object v2, v3, Lp20/f;->w:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v35, v2

    check-cast v35, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    move-object/from16 v26, v1

    move-object/from16 v33, v4

    invoke-direct/range {v23 .. v35}, Lh20/w0;-><init>(Lh20/f0;Lxz/f0;Lu00/e;Lwz/r0;Lk20/a;Lz20/g;Lq83/j;Landroidx/lifecycle/k1;Lh20/x;Lzx/o;Lny/d;Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;)V

    return-object v23

    :pswitch_9
    check-cast v4, Lg20/e;

    invoke-virtual {v4}, Lg20/e;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg20/l;

    invoke-static {v1}, Lup/d;->K(Ll8/c;)Landroid/app/Application;

    move-result-object v3

    invoke-static {v1}, Landroidx/lifecycle/o1;->e(Ll8/c;)Landroidx/lifecycle/k1;

    move-result-object v34

    invoke-virtual {v2}, Lg20/l;->b()Z

    move-result v1

    new-instance v4, Lg20/m;

    const/4 v5, 0x0

    invoke-direct {v4, v2, v5}, Lg20/m;-><init>(Lg20/l;I)V

    new-instance v5, Lg20/m;

    invoke-direct {v5, v2, v13}, Lg20/m;-><init>(Lg20/l;I)V

    invoke-virtual {v2}, Lg20/l;->h()Ljava/util/Set;

    move-result-object v6

    invoke-virtual {v2}, Lg20/l;->f()Z

    move-result v7

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v9, Lu00/e;

    const/16 v10, 0x17

    invoke-direct {v9, v10}, Lu00/e;-><init>(I)V

    new-instance v10, Lu00/e;

    invoke-direct {v10, v14}, Lu00/e;-><init>(I)V

    new-instance v11, Lt9/c0;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    new-instance v12, Lt9/p;

    invoke-direct {v12, v15}, Lt9/p;-><init>(I)V

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    new-instance v14, Luy/a;

    invoke-direct {v14, v11, v13}, Luy/a;-><init>(Lt9/c0;I)V

    invoke-static {v14}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v27

    invoke-static {v1}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v1

    new-instance v14, Le20/a;

    const/4 v15, 0x5

    invoke-direct {v14, v12, v1, v15}, Le20/a;-><init>(Ljava/lang/Object;Lv03/h;I)V

    invoke-static {v14}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v12

    invoke-static {v3}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v14

    new-instance v15, Luy/a;

    const/4 v13, 0x0

    invoke-direct {v15, v11, v13}, Luy/a;-><init>(Lt9/c0;I)V

    invoke-static {v15}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v28

    invoke-static {v4}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v11

    invoke-static {v6}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v13

    new-instance v15, La30/c;

    const/4 v8, 0x2

    invoke-direct {v15, v14, v11, v13, v8}, La30/c;-><init>(Lv03/h;Lv03/h;Lv03/h;I)V

    new-instance v8, La30/h;

    const/16 v0, 0xe

    invoke-direct {v8, v9, v14, v0}, La30/h;-><init>(Ljava/lang/Object;Lv03/h;I)V

    invoke-static {v7}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v33

    new-instance v23, Lc20/o;

    move-object/from16 v26, v1

    move-object/from16 v32, v8

    move-object/from16 v24, v9

    move-object/from16 v30, v11

    move-object/from16 v31, v13

    move-object/from16 v25, v14

    move-object/from16 v29, v15

    invoke-direct/range {v23 .. v33}, Lc20/o;-><init>(Lu00/e;Lv03/e;Lv03/e;Lv03/h;Lv03/h;La30/c;Lv03/e;Lv03/e;La30/h;Lv03/e;)V

    move-object/from16 v0, v24

    move-object/from16 v7, v25

    move-object/from16 v1, v27

    move-object/from16 v8, v28

    move-object/from16 v25, v30

    invoke-static/range {v23 .. v23}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v9

    new-instance v11, La30/h;

    const/16 v13, 0xd

    invoke-direct {v11, v0, v7, v13}, La30/h;-><init>(Ljava/lang/Object;Lv03/h;I)V

    invoke-static {v11}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v11

    invoke-static {v5}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v5

    new-instance v13, Lb10/c;

    const/4 v14, 0x0

    invoke-direct {v13, v10, v14}, Lb10/c;-><init>(Ljava/lang/Object;I)V

    new-instance v10, Lb20/g;

    const/16 v14, 0xb

    invoke-direct {v10, v12, v1, v14}, Lb20/g;-><init>(Lv03/h;Lv03/h;I)V

    new-instance v26, Lb10/a1;

    const/16 v32, 0x0

    move-object/from16 v24, v7

    move-object/from16 v30, v10

    move-object/from16 v23, v26

    move-object/from16 v28, v31

    move-object/from16 v31, v12

    move-object/from16 v26, v13

    invoke-direct/range {v23 .. v32}, Lb10/a1;-><init>(Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;I)V

    move-object/from16 v26, v23

    new-instance v23, Ln10/l0;

    move-object/from16 v28, v27

    move-object/from16 v27, v31

    invoke-direct/range {v23 .. v28}, Ln10/l0;-><init>(Lv03/e;Lv03/e;Lb10/a1;Lv03/h;Lv03/h;)V

    move-object/from16 v27, v28

    invoke-static/range {v23 .. v23}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v1

    new-instance v23, Ln10/v;

    const/16 v29, 0x1

    move-object/from16 v27, v31

    invoke-direct/range {v23 .. v29}, Ln10/v;-><init>(Lv03/d;Lv03/d;Lv03/d;Lv03/h;Lv03/h;I)V

    move-object/from16 v12, v25

    move-object/from16 v10, v27

    move-object/from16 v7, v28

    invoke-static/range {v23 .. v23}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v13

    new-instance v14, Lcy/b;

    invoke-direct {v14, v0}, Lcy/b;-><init>(Lu00/e;)V

    invoke-static {v14}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v0

    instance-of v14, v2, Lg20/h;

    if-eqz v14, :cond_3

    check-cast v2, Lg20/h;

    iget-object v2, v2, Lg20/h;->F:Ly00/s;

    instance-of v14, v2, Ly00/q;

    if-eqz v14, :cond_1

    :cond_0
    :goto_0
    const/16 v35, 0x1

    goto :goto_2

    :cond_1
    instance-of v2, v2, Ly00/r;

    if-eqz v2, :cond_2

    :goto_1
    const/16 v35, 0x0

    goto :goto_2

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_3
    instance-of v14, v2, Lg20/g;

    if-nez v14, :cond_0

    instance-of v14, v2, Lg20/i;

    if-eqz v14, :cond_4

    goto :goto_0

    :cond_4
    instance-of v14, v2, Lg20/j;

    if-eqz v14, :cond_5

    goto :goto_1

    :cond_5
    instance-of v14, v2, Lg20/k;

    if-eqz v14, :cond_6

    check-cast v2, Lg20/k;

    iget-object v2, v2, Lg20/k;->F:Ly00/c8;

    instance-of v2, v2, Ly00/l3;

    move/from16 v35, v2

    goto :goto_2

    :cond_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :goto_2
    new-instance v2, Lb20/g;

    const/16 v14, 0xa

    invoke-direct {v2, v12, v5, v14}, Lb20/g;-><init>(Lv03/h;Lv03/h;I)V

    new-instance v5, Lg20/r;

    new-instance v23, Lb10/z0;

    sget-object v26, Lb10/d;->x:Lb10/d;

    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v27, v12

    check-cast v27, Lq83/j;

    new-instance v12, Lb10/b;

    invoke-direct {v12, v3, v6, v4}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    new-instance v14, Lyy/j;

    invoke-interface {v10}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lqy/d;

    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 p1, v0

    move-object/from16 v0, v16

    check-cast v0, Lq83/j;

    invoke-direct {v14, v15, v0}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    invoke-interface {v10}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v31, v0

    check-cast v31, Lqy/d;

    move-object/from16 v24, v3

    move-object/from16 v25, v4

    move-object/from16 v28, v6

    move-object/from16 v29, v12

    move-object/from16 v30, v14

    invoke-direct/range {v23 .. v31}, Lb10/z0;-><init>(Landroid/content/Context;Lc93/a;Lb10/d;Lq83/j;Ljava/util/Set;Lb10/b;Lyy/j;Lqy/d;)V

    move-object/from16 v0, v24

    move-object/from16 v3, v25

    move-object/from16 v4, v28

    invoke-interface {v9}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v26, v6

    check-cast v26, Lc20/a;

    invoke-interface {v11}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v27, v6

    check-cast v27, Lv10/a;

    invoke-static {v1}, Lv03/c;->a(Lv03/h;)Lu03/a;

    move-result-object v29

    invoke-static {v13}, Lv03/c;->a(Lv03/h;)Lu03/a;

    move-result-object v30

    new-instance v1, Lyy/j;

    invoke-interface {v10}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lqy/d;

    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lq83/j;

    invoke-direct {v1, v6, v7}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    new-instance v6, Lb10/b;

    invoke-direct {v6, v0, v4, v3}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    invoke-interface {v8}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v33, v3

    check-cast v33, Lq83/j;

    invoke-static {v0}, Le4/a;->G(Landroid/content/Context;)Z

    move-result v0

    invoke-interface/range {p1 .. p1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v36, v3

    check-cast v36, Lbz/c;

    move-object/from16 v31, v1

    move-object/from16 v28, v2

    move-object/from16 v32, v6

    move-object/from16 v25, v23

    move/from16 v24, v35

    move/from16 v35, v0

    move-object/from16 v23, v5

    invoke-direct/range {v23 .. v36}, Lg20/r;-><init>(ZLb10/z0;Lc20/a;Lv10/a;Lb20/g;Lu03/a;Lu03/a;Lyy/j;Lb10/b;Lq83/j;Landroidx/lifecycle/k1;ZLbz/c;)V

    return-object v23

    :pswitch_a
    check-cast v4, Ld20/j;

    invoke-virtual {v4}, Ld20/j;->invoke()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ld20/l;

    invoke-static {v1}, Lup/d;->K(Ll8/c;)Landroid/app/Application;

    move-result-object v5

    invoke-static {v1}, Landroidx/lifecycle/o1;->e(Ll8/c;)Landroidx/lifecycle/k1;

    move-result-object v0

    iget-boolean v1, v3, Ld20/l;->F:Z

    new-instance v6, Ld1/i;

    const/4 v8, 0x2

    invoke-direct {v6, v3, v8}, Ld1/i;-><init>(Ljava/lang/Object;I)V

    iget-object v9, v3, Ld20/l;->I:Ljava/util/Set;

    invoke-static {v5}, Le4/a;->G(Landroid/content/Context;)Z

    move-result v13

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lu00/e;

    invoke-direct {v2, v14}, Lu00/e;-><init>(I)V

    new-instance v4, Lt9/c0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lt9/p;

    invoke-direct {v7, v15}, Lt9/p;-><init>(I)V

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    new-instance v10, Luy/a;

    const/4 v11, 0x1

    invoke-direct {v10, v4, v11}, Luy/a;-><init>(Lt9/c0;I)V

    invoke-static {v10}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v4

    invoke-static {v8}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v8

    new-instance v10, Le20/a;

    const/4 v15, 0x5

    invoke-direct {v10, v7, v8, v15}, Le20/a;-><init>(Ljava/lang/Object;Lv03/h;I)V

    invoke-static {v10}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v7

    invoke-static {v5}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v10

    new-instance v11, La00/k;

    const/4 v15, 0x2

    invoke-direct {v11, v10, v8, v4, v15}, La00/k;-><init>(Lv03/e;Lv03/e;Lv03/h;I)V

    invoke-static {v11}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v14

    sget-object v8, Le20/c;->b:Lcy/b;

    invoke-static {v8}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v17

    invoke-static {v6}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v8

    new-instance v11, Lb10/c;

    const/4 v12, 0x0

    invoke-direct {v11, v2, v12}, Lb10/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {v9}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v2

    new-instance v12, La30/c;

    invoke-direct {v12, v10, v8, v2, v15}, La30/c;-><init>(Lv03/h;Lv03/h;Lv03/h;I)V

    new-instance v15, Lb20/g;

    move-object/from16 p1, v0

    const/16 v0, 0xb

    invoke-direct {v15, v7, v4, v0}, Lb20/g;-><init>(Lv03/h;Lv03/h;I)V

    new-instance v23, Lb10/a1;

    const/16 v32, 0x0

    move-object/from16 v28, v2

    move-object/from16 v27, v4

    move-object/from16 v31, v7

    move-object/from16 v25, v8

    move-object/from16 v24, v10

    move-object/from16 v26, v11

    move-object/from16 v29, v12

    move-object/from16 v30, v15

    invoke-direct/range {v23 .. v32}, Lb10/a1;-><init>(Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;I)V

    move-object/from16 v26, v29

    move-object/from16 v29, v27

    sget-object v0, Lyy/q;->a:Lyy/r;

    invoke-static {v0}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v27

    move-object/from16 v24, v23

    new-instance v23, Ld20/d;

    move-object/from16 v25, v30

    const/16 v30, 0x0

    move-object/from16 v28, v31

    invoke-direct/range {v23 .. v30}, Ld20/d;-><init>(Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;I)V

    invoke-static/range {v23 .. v23}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v0

    move v2, v1

    new-instance v1, Ld20/r;

    new-instance v4, Lb10/z0;

    sget-object v7, Lb10/d;->x:Lb10/d;

    invoke-interface/range {v29 .. v29}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lq83/j;

    new-instance v10, Lb10/b;

    invoke-direct {v10, v5, v9, v6}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    new-instance v11, Lyy/j;

    invoke-interface/range {v31 .. v31}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lqy/d;

    invoke-interface/range {v29 .. v29}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lq83/j;

    invoke-direct {v11, v12, v15}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    invoke-interface/range {v31 .. v31}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lqy/d;

    invoke-direct/range {v4 .. v12}, Lb10/z0;-><init>(Landroid/content/Context;Lc93/a;Lb10/d;Lq83/j;Ljava/util/Set;Lb10/b;Lyy/j;Lqy/d;)V

    move-object v10, v4

    new-instance v11, Lyy/j;

    invoke-interface/range {v31 .. v31}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lqy/d;

    invoke-interface/range {v29 .. v29}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lq83/j;

    invoke-direct {v11, v4, v7}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    new-instance v12, Lb10/b;

    invoke-direct {v12, v5, v9, v6}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    invoke-interface {v14}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v4

    move-object v14, v4

    check-cast v14, Lp30/a;

    invoke-interface/range {v17 .. v17}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v4

    move-object v15, v4

    check-cast v15, Lq30/p0;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld20/c;

    invoke-interface/range {v29 .. v29}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Lq83/j;

    const-string v4, "workContext"

    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v3, Ld20/l;->y:Ly00/c8;

    invoke-interface {v4}, Ly00/c8;->q0()Z

    move-result v4

    iget-object v6, v3, Ld20/l;->w:Lq30/q0;

    iget-object v8, v3, Ld20/l;->x:Lux/r;

    iget-object v8, v8, Lux/r;->x:Lux/s;

    iget-object v8, v8, Lux/s;->w:Lm30/h;

    iget-object v9, v3, Ld20/l;->z:Ly00/v7;

    move-object/from16 p2, v0

    const-string v0, "sdkData"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v9, Ly00/v7;->w:Ljava/lang/String;

    move-object/from16 v17, v1

    iget-object v1, v9, Ly00/v7;->x:Ljava/lang/String;

    move/from16 v19, v2

    iget-object v2, v9, Ly00/v7;->y:Ljava/lang/String;

    move-object/from16 v20, v3

    new-instance v3, Ly00/f7;

    iget-object v9, v9, Ly00/v7;->z:Ly00/u7;

    move/from16 v22, v4

    iget-object v4, v9, Ly00/u7;->w:Ljava/lang/String;

    move-object/from16 v23, v5

    iget-object v5, v9, Ly00/u7;->x:Ljava/lang/String;

    move-object/from16 v24, v7

    iget-object v7, v9, Ly00/u7;->y:Ljava/util/List;

    iget-object v9, v9, Ly00/u7;->z:Ljava/lang/String;

    move-object/from16 v25, v10

    const-string v10, "directoryServerId"

    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "dsCertificateData"

    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "rootCertsData"

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "X.509"

    move-object/from16 v26, v7

    invoke-static {v10}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v7

    move-object/from16 v27, v10

    new-instance v10, Ljava/io/ByteArrayInputStream;

    move-object/from16 v28, v11

    sget-object v11, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v5, v11}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v5

    const-string v11, "getBytes(...)"

    invoke-static {v5, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v10, v5}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v7, v10}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v5

    const-string v7, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/security/cert/X509Certificate;

    invoke-virtual {v5}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v5

    const-string v10, "getPublicKey(...)"

    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, v26

    check-cast v10, Ljava/lang/Iterable;

    move-object/from16 v26, v12

    new-instance v12, Ljava/util/ArrayList;

    move/from16 v30, v13

    const/16 v13, 0xa

    invoke-static {v10, v13}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    move-object/from16 v16, v10

    invoke-static/range {v27 .. v27}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v10

    move-object/from16 v31, v14

    new-instance v14, Ljava/io/ByteArrayInputStream;

    move-object/from16 v32, v15

    sget-object v15, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v13, v15}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v13

    invoke-static {v13, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v14, v13}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v10, v14}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v10

    invoke-static {v10, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Ljava/security/cert/X509Certificate;

    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v10, v16

    move-object/from16 v14, v31

    move-object/from16 v15, v32

    goto :goto_3

    :cond_7
    move-object/from16 v31, v14

    move-object/from16 v32, v15

    invoke-direct {v3, v4, v5, v12, v9}, Ly00/f7;-><init>(Ljava/lang/String;Ljava/security/PublicKey;Ljava/util/ArrayList;Ljava/lang/String;)V

    const-string v4, "source"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "directoryServerName"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serverTransactionId"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkTransactionId"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "uiCustomization"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v19, :cond_8

    sget-object v2, Lq30/o0;->d:Lq30/o0;

    goto :goto_4

    :cond_8
    sget-object v2, Lq30/o0;->c:Lq30/o0;

    :goto_4
    new-instance v4, Ln30/c;

    new-instance v5, Ln30/f;

    invoke-direct {v5, v6}, Ln30/f;-><init>(Lq30/q0;)V

    const/16 v9, 0xf0

    move-object v10, v6

    move-object v11, v8

    move-object/from16 v7, v24

    move-object v8, v2

    move-object v6, v5

    move/from16 v2, v22

    move-object/from16 v5, v23

    invoke-direct/range {v4 .. v9}, Ln30/c;-><init>(Landroid/content/Context;Ln30/f;Lq83/j;Lx30/s0;I)V

    new-instance v6, Lev/i;

    new-instance v9, Lq30/p0;

    new-instance v9, Lq30/e0;

    iget-object v3, v3, Ly00/f7;->y:Ljava/util/ArrayList;

    invoke-direct {v9, v2, v3, v4}, Lq30/e0;-><init>(ZLjava/util/ArrayList;Ln30/c;)V

    new-instance v3, Lo30/b;

    invoke-direct {v3, v2}, Lo30/b;-><init>(Z)V

    new-instance v2, Lla/b;

    const/16 v12, 0x1d

    invoke-direct {v2, v4, v12}, Lla/b;-><init>(Ljava/lang/Object;I)V

    new-instance v12, Lxl/a;

    const/16 v13, 0x1b

    invoke-direct {v12, v13, v4, v7}, Lxl/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, Lq30/u0;

    const/4 v14, 0x0

    invoke-direct {v13, v7, v14}, Lq30/u0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iput-object v10, v6, Lev/i;->a:Ljava/lang/Object;

    iput-object v9, v6, Lev/i;->b:Ljava/lang/Object;

    iput-object v3, v6, Lev/i;->c:Ljava/lang/Object;

    iput-object v2, v6, Lev/i;->d:Ljava/lang/Object;

    iput-object v12, v6, Lev/i;->e:Ljava/lang/Object;

    iput-object v13, v6, Lev/i;->f:Ljava/lang/Object;

    iput-object v11, v6, Lev/i;->g:Ljava/lang/Object;

    iput-object v4, v6, Lev/i;->h:Ljava/lang/Object;

    iput-object v8, v6, Lev/i;->i:Ljava/lang/Object;

    invoke-interface/range {v29 .. v29}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lq83/j;

    move-object/from16 v12, p1

    move-object/from16 v9, p2

    move-object v2, v5

    move-object v10, v6

    move-object/from16 v1, v17

    move-object/from16 v3, v20

    move-object/from16 v4, v25

    move-object/from16 v6, v26

    move-object/from16 v5, v28

    move/from16 v13, v30

    move-object/from16 v7, v31

    move-object/from16 v8, v32

    invoke-direct/range {v1 .. v13}, Ld20/r;-><init>(Landroid/app/Application;Ld20/l;Lb10/z0;Lyy/j;Lb10/b;Lp30/a;Lq30/p0;Ld20/c;Lev/i;Lq83/j;Landroidx/lifecycle/k1;Z)V

    return-object v1

    :pswitch_b
    invoke-static {v1}, Lup/d;->K(Ll8/c;)Landroid/app/Application;

    move-result-object v0

    check-cast v4, Lcz/g;

    iget-object v2, v4, Lcz/g;->x:Lcz/b;

    iget-object v3, v4, Lcz/g;->y:Ljava/lang/Integer;

    iget-object v4, v4, Lcz/g;->w:Lcz/h;

    invoke-static {v1}, Landroidx/lifecycle/o1;->e(Ll8/c;)Landroidx/lifecycle/k1;

    move-result-object v1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Lg73/d;

    const/16 v13, 0x1b

    invoke-direct {v5, v13}, Lg73/d;-><init>(I)V

    new-instance v6, Lu00/e;

    invoke-direct {v6, v14}, Lu00/e;-><init>(I)V

    invoke-static {v0}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v0

    invoke-static {v2}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v38

    invoke-static {v4}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v39

    sget-object v2, Lfz/b;->d:Lcy/b;

    new-instance v4, Lcy/b;

    const/16 v7, 0x8

    invoke-direct {v4, v7}, Lcy/b;-><init>(I)V

    sget-object v7, Lfz/b;->a:Lcy/b;

    new-instance v8, Lb20/g;

    const/16 v9, 0xb

    invoke-direct {v8, v4, v7, v9}, Lb20/g;-><init>(Lv03/h;Lv03/h;I)V

    new-instance v9, Lc20/g;

    const/4 v15, 0x2

    invoke-direct {v9, v0, v15}, Lc20/g;-><init>(Lv03/e;I)V

    new-instance v11, Lc20/g;

    invoke-direct {v11, v0, v10}, Lc20/g;-><init>(Lv03/e;I)V

    new-instance v12, Lfz/c;

    const/4 v13, 0x0

    invoke-direct {v12, v11, v13}, Lfz/c;-><init>(Lc20/g;I)V

    sget-object v14, Lfz/b;->c:Lcy/b;

    new-instance v10, La30/c;

    invoke-direct {v10, v9, v12, v14, v15}, La30/c;-><init>(Lv03/h;Lv03/h;Lv03/h;I)V

    new-instance v15, Ldz/m;

    invoke-direct {v15, v8, v10}, Ldz/m;-><init>(Lb20/g;La30/c;)V

    move-object/from16 p1, v1

    new-instance v1, Lb10/c;

    invoke-direct {v1, v6, v13}, Lb10/c;-><init>(Ljava/lang/Object;I)V

    new-instance v24, Lb10/a1;

    const/16 v33, 0x0

    move-object/from16 v27, v1

    move-object/from16 v32, v4

    move-object/from16 v28, v7

    move-object/from16 v31, v8

    move-object/from16 v25, v9

    move-object/from16 v30, v10

    move-object/from16 v26, v12

    move-object/from16 v29, v14

    invoke-direct/range {v24 .. v33}, Lb10/a1;-><init>(Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/h;I)V

    move-object/from16 v7, v25

    move-object/from16 v8, v26

    move-object/from16 v4, v28

    move-object/from16 v9, v29

    move-object/from16 v6, v31

    move-object/from16 v1, v32

    new-instance v12, Lfz/c;

    const/4 v13, 0x1

    invoke-direct {v12, v11, v13}, Lfz/c;-><init>(Lc20/g;I)V

    new-instance v14, Lb20/g;

    const/16 v13, 0xa

    invoke-direct {v14, v8, v12, v13}, Lb20/g;-><init>(Lv03/h;Lv03/h;I)V

    new-instance v12, Ln10/n0;

    invoke-direct {v12, v14}, Ln10/n0;-><init>(Lb20/g;)V

    new-instance v13, Ln10/o0;

    invoke-direct {v13, v12}, Ln10/o0;-><init>(Ln10/n0;)V

    invoke-static {v13}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v12

    new-instance v13, Le20/a;

    move-object/from16 p2, v4

    const/4 v4, 0x1

    invoke-direct {v13, v12, v1, v4}, Le20/a;-><init>(Ljava/lang/Object;Lv03/h;I)V

    new-instance v4, Lb10/c;

    const/4 v12, 0x4

    invoke-direct {v4, v1, v12}, Lb10/c;-><init>(Ljava/lang/Object;I)V

    move-object/from16 v25, v24

    new-instance v24, Lb30/m;

    const/16 v30, 0x9

    move-object/from16 v29, v1

    move-object/from16 v28, v4

    move-object/from16 v27, v13

    move-object/from16 v26, v14

    invoke-direct/range {v24 .. v30}, Lb30/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v1, v24

    move-object/from16 v32, v29

    new-instance v4, Ln10/l;

    invoke-direct {v4, v1}, Ln10/l;-><init>(Lb30/m;)V

    invoke-static {v4}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v1

    new-instance v4, Lc20/g;

    invoke-direct {v4, v1, v12}, Lc20/g;-><init>(Lv03/e;I)V

    new-instance v1, Ld1/j;

    const/16 v13, 0xe

    invoke-direct {v1, v13, v2, v9}, Ld1/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lg20/x;

    invoke-direct {v2, v1}, Lg20/x;-><init>(Ld1/j;)V

    invoke-static {v2}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v27

    if-nez v3, :cond_9

    sget-object v1, Lv03/e;->x:Lv03/e;

    :goto_5
    move-object/from16 v28, v1

    goto :goto_6

    :cond_9
    new-instance v1, Lv03/e;

    invoke-direct {v1, v3}, Lv03/e;-><init>(Ljava/lang/Object;)V

    goto :goto_5

    :goto_6
    new-instance v24, Ln10/l0;

    move-object/from16 v26, v4

    move-object/from16 v25, v5

    move-object/from16 v29, v11

    invoke-direct/range {v24 .. v29}, Ln10/l0;-><init>(Lg73/d;Lv03/h;Lv03/h;Lv03/d;Lv03/h;)V

    move-object/from16 v1, v24

    move-object/from16 v42, v29

    new-instance v2, Ldz/m;

    invoke-direct {v2, v10, v6}, Ldz/m;-><init>(La30/c;Lb20/g;)V

    new-instance v3, La30/h;

    const/16 v4, 0x8

    invoke-direct {v3, v0, v4}, La30/h;-><init>(Lv03/h;I)V

    sget-object v4, Lfz/b;->b:Lcy/b;

    new-instance v5, La30/c;

    const/16 v11, 0x9

    invoke-direct {v5, v6, v10, v4, v11}, La30/c;-><init>(Lv03/h;Lv03/h;Lv03/h;I)V

    new-instance v24, Le10/s0;

    move-object/from16 v27, p2

    move-object/from16 v25, v2

    move-object/from16 v26, v3

    move-object/from16 v28, v5

    move-object/from16 v29, v8

    move-object/from16 v30, v9

    invoke-direct/range {v24 .. v30}, Le10/s0;-><init>(Lv03/h;La30/h;Lv03/h;La30/c;Lv03/h;Lv03/h;)V

    move-object/from16 v3, v24

    move-object/from16 v4, v27

    new-instance v5, La30/c;

    invoke-direct {v5, v2, v8, v9, v12}, La30/c;-><init>(Lv03/h;Lv03/h;Lv03/h;I)V

    sget v6, Lv03/i;->y:I

    new-instance v6, Ljava/util/ArrayList;

    const/4 v8, 0x3

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    sget-object v9, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v6, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lv03/i;

    invoke-direct {v1, v6, v9}, Lv03/i;-><init>(Ljava/util/List;Ljava/util/List;)V

    new-instance v3, Lb10/c;

    invoke-direct {v3, v1, v8}, Lb10/c;-><init>(Ljava/lang/Object;I)V

    invoke-static/range {p1 .. p1}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v46

    new-instance v1, Lb20/g;

    invoke-direct {v1, v7, v4, v8}, Lb20/g;-><init>(Lv03/h;Lv03/h;I)V

    new-instance v5, La30/h;

    const/16 v6, 0xc

    invoke-direct {v5, v1, v6}, La30/h;-><init>(Lv03/h;I)V

    new-instance v24, Le10/s0;

    move-object/from16 v27, v2

    move-object/from16 v25, v3

    move-object/from16 v28, v4

    move-object/from16 v30, v5

    move-object/from16 v29, v32

    move-object/from16 v26, v46

    invoke-direct/range {v24 .. v30}, Le10/s0;-><init>(Lb10/c;Lv03/h;Lv03/h;Lv03/h;Lv03/h;La30/h;)V

    move-object/from16 v1, v29

    new-instance v3, La30/c;

    const/16 v4, 0x8

    invoke-direct {v3, v7, v1, v2, v4}, La30/c;-><init>(Lv03/h;Lv03/h;Lv03/h;I)V

    new-instance v4, Lay/w;

    const/4 v13, 0x1

    invoke-direct {v4, v3, v15, v2, v13}, Lay/w;-><init>(Lv03/h;Lv03/h;Lv03/h;I)V

    new-instance v3, La30/h;

    invoke-direct {v3, v7, v8}, La30/h;-><init>(Lv03/h;I)V

    new-instance v36, Lcz/o0;

    move-object/from16 v37, v0

    move-object/from16 v40, v1

    move-object/from16 v45, v2

    move-object/from16 v47, v3

    move-object/from16 v44, v4

    move-object/from16 v41, v15

    move-object/from16 v43, v24

    invoke-direct/range {v36 .. v47}, Lcz/o0;-><init>(Lv03/e;Lv03/e;Lv03/e;Lcy/b;Ldz/m;Lc20/g;Le10/s0;Lay/w;Ldz/m;Lv03/e;La30/h;)V

    invoke-static/range {v36 .. v36}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v0

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcz/n0;

    const-string v1, "null cannot be cast to non-null type T of com.stripe.android.customersheet.CustomerSheetViewModel.Factory.create"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :pswitch_c
    invoke-static {v1}, Lup/d;->K(Ll8/c;)Landroid/app/Application;

    move-result-object v6

    invoke-static {v1}, Landroidx/lifecycle/o1;->e(Ll8/c;)Landroidx/lifecycle/k1;

    move-result-object v13

    const/4 v0, 0x0

    const/4 v14, 0x0

    invoke-static {v14, v14, v0, v15}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v7

    check-cast v4, La20/a;

    invoke-virtual {v4}, La20/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lz10/e;

    new-instance v2, Lq/f;

    new-instance v3, Lt9/c0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lu00/e;

    const/16 v0, 0xc

    invoke-direct {v4, v0}, Lu00/e;-><init>(I)V

    new-instance v5, Lt9/p;

    invoke-direct {v5, v15}, Lt9/p;-><init>(I)V

    move-object v9, v8

    move-object v8, v13

    invoke-direct/range {v2 .. v9}, Lq/f;-><init>(Lt9/c0;Lu00/e;Lt9/p;Landroid/app/Application;Lec3/w1;Landroidx/lifecycle/k1;Lz10/e;)V

    move-object v8, v9

    new-instance v0, La20/j;

    new-instance v10, Ly10/h;

    invoke-virtual {v2}, Lq/f;->T0()Lb10/z0;

    move-result-object v1

    invoke-direct {v10, v1}, Ly10/h;-><init>(Lb10/z0;)V

    new-instance v11, Ly10/c;

    invoke-virtual {v2}, Lq/f;->T0()Lb10/z0;

    move-result-object v1

    invoke-direct {v11, v1}, Ly10/c;-><init>(Lb10/z0;)V

    new-instance v12, Ly10/h;

    invoke-virtual {v2}, Lq/f;->T0()Lb10/z0;

    move-result-object v1

    invoke-direct {v12, v1}, Ly10/h;-><init>(Lb10/z0;)V

    iget-object v1, v2, Lq/f;->E:Ljava/lang/Object;

    check-cast v1, Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lqy/d;

    move-object v9, v7

    move-object v7, v0

    invoke-direct/range {v7 .. v14}, La20/j;-><init>(Lz10/e;Lec3/w1;Ly10/h;Ly10/c;Ly10/h;Landroidx/lifecycle/k1;Lqy/d;)V

    return-object v7

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
