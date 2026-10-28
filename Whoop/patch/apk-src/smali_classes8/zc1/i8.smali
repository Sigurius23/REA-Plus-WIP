.class public abstract Lzc1/i8;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "i",
        "(Landroidx/compose/runtime/Composer;I)V",
        "design-showcase_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/i8;->j(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/i8;->q(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/i8;->o(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/i8;->k(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/i8;->l(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/i8;->p(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/i8;->m(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lzc1/i8;->n(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Landroidx/compose/runtime/Composer;I)V
    .locals 34

    move-object/from16 v1, p0

    check-cast v1, Lp1/q;

    const v2, 0x3093dea6

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    const/4 v2, 0x1

    if-eqz p1, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    and-int/lit8 v4, p1, 0x1

    invoke-virtual {v1, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_13

    sget-object v3, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v1, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    int-to-float v4, v2

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    sget-object v5, Lb2/e;->M:Lb2/k;

    const/4 v6, 0x6

    invoke-static {v4, v5, v1, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v7, v1, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v10, v1, Lp1/q;->S:Z

    if-eqz v10, :cond_1

    invoke-virtual {v1, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_1
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v1, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v1, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v7, v1, Lp1/q;->S:Z

    if-nez v7, :cond_2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    :cond_2
    invoke-static {v5, v1, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v1, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v4, "Default"

    invoke-static {v4, v1, v6}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const-string v21, "LEARN MORE"

    invoke-static/range {v21 .. v21}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const-string v5, "VIEW ALL"

    move-object v7, v4

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move-object v8, v5

    new-instance v5, Ly71/g;

    sget-object v22, Lx81/d;->a:Lx81/d;

    invoke-static/range {v22 .. v22}, Lih0/d0;->E(Lx81/d;)I

    move-result v9

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-direct {v5, v9, v8}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    invoke-static {}, Lh51/e;->c()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v1, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-nez v9, :cond_4

    if-ne v10, v11, :cond_5

    :cond_4
    new-instance v10, Lzc1/m4;

    const/16 v9, 0xe

    invoke-direct {v10, v3, v9}, Lzc1/m4;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v14, v10

    check-cast v14, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_6

    if-ne v10, v11, :cond_7

    :cond_6
    new-instance v10, Lzc1/e7;

    const/4 v9, 0x3

    invoke-direct {v10, v3, v9}, Lzc1/e7;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v15, v10

    check-cast v15, Lc93/a;

    sget v23, Lcom/whoop/design/util/TextResource;->$stable:I

    const/high16 v9, 0x30000

    or-int v24, v23, v9

    shl-int/lit8 v25, v23, 0x9

    or-int v9, v24, v25

    sget v10, Ly71/g;->c:I

    shl-int/lit8 v26, v10, 0xc

    or-int v18, v9, v26

    const/16 v19, 0x0

    const v20, 0x9f46

    move v9, v2

    const/4 v2, 0x0

    move-object v10, v3

    const/4 v3, 0x0

    move v12, v6

    const/4 v6, 0x1

    move-object/from16 v17, v1

    move-object v1, v7

    const/4 v7, 0x0

    move v13, v9

    const/4 v9, 0x0

    move-object/from16 v16, v10

    const/4 v10, 0x0

    move-object/from16 v27, v11

    const/4 v11, 0x0

    move/from16 v28, v12

    const/4 v12, 0x0

    move/from16 v29, v13

    const/4 v13, 0x0

    move-object/from16 v30, v16

    const/16 v16, 0x0

    move-object/from16 v31, v27

    move/from16 v0, v28

    invoke-static/range {v1 .. v20}, Lh51/d;->m(Lcom/whoop/design/util/TextResource;Li91/a;Lb91/c;Lcom/whoop/design/util/TextResource;Ly71/g;ZZLjava/util/List;Lb2/f;Lkotlin/jvm/functions/Function3;Ly81/e;Li91/a;Lkd1/o;Lkotlin/jvm/functions/Function1;Lc93/a;ZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v17

    const-string v2, "Default - no action"

    invoke-static {v2, v1, v0}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static/range {v21 .. v21}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {}, Lh51/e;->c()Ljava/util/List;

    move-result-object v8

    move-object/from16 v3, v30

    invoke-virtual {v1, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_8

    move-object/from16 v4, v31

    if-ne v5, v4, :cond_9

    goto :goto_2

    :cond_8
    move-object/from16 v4, v31

    :goto_2
    new-instance v5, Lzc1/m4;

    const/16 v6, 0xf

    invoke-direct {v5, v3, v6}, Lzc1/m4;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v14, v5

    check-cast v14, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_a

    if-ne v6, v4, :cond_b

    :cond_a
    new-instance v6, Lzc1/e7;

    const/4 v5, 0x4

    invoke-direct {v6, v3, v5}, Lzc1/e7;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v15, v6

    check-cast v15, Lc93/a;

    const/16 v19, 0x0

    const v20, 0x9f7e

    move-object/from16 v17, v1

    move-object v1, v2

    const/4 v2, 0x0

    move-object/from16 v30, v3

    const/4 v3, 0x0

    move-object/from16 v31, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    move/from16 v18, v23

    move-object/from16 v32, v30

    move-object/from16 v33, v31

    invoke-static/range {v1 .. v20}, Lh51/d;->m(Lcom/whoop/design/util/TextResource;Li91/a;Lb91/c;Lcom/whoop/design/util/TextResource;Ly71/g;ZZLjava/util/List;Lb2/f;Lkotlin/jvm/functions/Function3;Ly81/e;Li91/a;Lkd1/o;Lkotlin/jvm/functions/Function1;Lc93/a;ZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v17

    const-string v2, "Onboarding"

    invoke-static {v2, v1, v0}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const-string v0, "HOW IT WORKS"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v4, v33

    if-ne v2, v4, :cond_c

    sget-object v2, Lzc1/i8$a;->w:Lzc1/i8$a;

    invoke-virtual {v1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v2}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    const-string v3, "HIDE"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    move-object v6, v5

    new-instance v5, Ly71/g;

    invoke-static/range {v22 .. v22}, Lyb0/f;->a(Lx81/d;)I

    move-result v7

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-direct {v5, v7, v3}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    invoke-static {}, Lh51/e;->c()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_d

    sget-object v3, Lzc1/i8$b;->w:Lzc1/i8$b;

    invoke-virtual {v1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v11

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_e

    new-instance v3, Lzc1/h7;

    const/4 v7, 0x4

    invoke-direct {v3, v7}, Lzc1/h7;-><init>(I)V

    invoke-virtual {v1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v3}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v12

    move-object/from16 v3, v32

    invoke-virtual {v1, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_f

    if-ne v9, v4, :cond_10

    :cond_f
    new-instance v9, Lzc1/m4;

    const/16 v7, 0x10

    invoke-direct {v9, v3, v7}, Lzc1/m4;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object v14, v9

    check-cast v14, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_11

    if-ne v9, v4, :cond_12

    :cond_11
    new-instance v9, Lzc1/e7;

    const/4 v4, 0x5

    invoke-direct {v9, v3, v4}, Lzc1/e7;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object v15, v9

    check-cast v15, Lc93/a;

    sget v3, Li91/a;->a:I

    shl-int/lit8 v19, v3, 0x3

    or-int v3, v24, v19

    or-int v3, v3, v25

    or-int v18, v3, v26

    const v20, 0x9344

    const/4 v3, 0x0

    move-object v4, v6

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v1

    move-object v1, v0

    invoke-static/range {v1 .. v20}, Lh51/d;->m(Lcom/whoop/design/util/TextResource;Li91/a;Lb91/c;Lcom/whoop/design/util/TextResource;Ly71/g;ZZLjava/util/List;Lb2/f;Lkotlin/jvm/functions/Function3;Ly81/e;Li91/a;Lkd1/o;Lkotlin/jvm/functions/Function1;Lc93/a;ZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v17

    const/4 v9, 0x1

    invoke-virtual {v1, v9}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_13
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_14

    new-instance v1, Lzc1/t7;

    const/16 v2, 0x10

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lzc1/t7;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final j(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/String;

    const-string v0, " tile clicked"

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "ActionButtonClicked"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/String;

    const-string v0, " tile clicked"

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "ActionButtonClicked"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->j()J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->k()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/String;

    const-string v0, " tile clicked"

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "ActionButtonClicked"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/i8;->i(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
