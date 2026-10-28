.class public abstract Lzc1/c5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "o",
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
.method private static final A(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Primary Error"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Secondary Error"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/c5;->o(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/c5;->r(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/c5;->x(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lzc1/c5;->v()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/c5;->y(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/c5;->z(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/c5;->t(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g()Ll83/a0;
    .locals 1

    invoke-static {}, Lzc1/c5;->w()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/c5;->A(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/c5;->B(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/c5;->u(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/c5;->C(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/c5;->q(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/c5;->s(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/c5;->p(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final o(Landroidx/compose/runtime/Composer;I)V
    .locals 35

    move/from16 v0, p1

    move-object/from16 v4, p0

    check-cast v4, Lp1/q;

    const v1, 0x780db55c

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v1, 0x0

    const/4 v7, 0x1

    if-eqz v0, :cond_0

    move v2, v7

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {v4, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1c

    sget-object v2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v4, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroid/content/Context;

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v1, v4, v7}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v1

    const/16 v5, 0xe

    invoke-static {v2, v1, v5}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x2

    int-to-float v2, v2

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v2, v5

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    sget-object v5, Lb2/e;->M:Lb2/k;

    const/4 v9, 0x6

    invoke-static {v2, v5, v4, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v4, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-eqz v11, :cond_1

    invoke-virtual {v4, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v4, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v4, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-nez v6, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    :cond_2
    invoke-static {v5, v4, v5, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v4, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v4, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->o()J

    move-result-wide v1

    invoke-static {v1, v2}, Li91/c;->o(J)Li91/a;

    move-result-object v1

    invoke-static {v3, v1}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const-string v1, "Saving"

    invoke-static {v1, v4, v9}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object v12, Lsz0/p0$f;->e:Lsz0/p0$f;

    const-string v1, "Savings Support Text"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v4, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_4

    if-ne v2, v3, :cond_5

    :cond_4
    new-instance v2, Lzc1/l1;

    const/4 v1, 0x4

    invoke-direct {v2, v8, v1}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object/from16 v16, v2

    check-cast v16, Lc93/a;

    new-instance v1, Le31/c;

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x18

    const/16 v18, 0x0

    move-object v10, v1

    invoke-direct/range {v10 .. v18}, Le31/c;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Le31/a;Le31/a;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v5, Le31/c;->g:I

    const/4 v6, 0x6

    const/4 v2, 0x0

    move-object v10, v3

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Le31/b;->f(Le31/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "Loading.."

    invoke-static {v1, v4, v9}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object v12, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-virtual {v4, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_6

    if-ne v2, v10, :cond_7

    :cond_6
    new-instance v2, Lzc1/l1;

    const/16 v1, 0xc

    invoke-direct {v2, v8, v1}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object/from16 v16, v2

    check-cast v16, Lc93/a;

    new-instance v1, Le31/c;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x1c

    const/16 v18, 0x0

    move-object/from16 v34, v10

    move-object v10, v1

    move-object/from16 v1, v34

    invoke-direct/range {v10 .. v18}, Le31/c;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Le31/a;Le31/a;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v2, 0x0

    move-object/from16 v34, v10

    move-object v10, v1

    move-object/from16 v1, v34

    invoke-static/range {v1 .. v6}, Le31/b;->f(Le31/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "Saved.."

    invoke-static {v1, v4, v9}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v12, Lsz0/p0$h;

    const/16 v17, 0x7

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v12 .. v18}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v19, "Success support text"

    invoke-static/range {v19 .. v19}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v4, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_8

    if-ne v2, v10, :cond_9

    :cond_8
    new-instance v2, Lzc1/l1;

    const/16 v1, 0xd

    invoke-direct {v2, v8, v1}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object/from16 v16, v2

    check-cast v16, Lc93/a;

    new-instance v1, Le31/c;

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x18

    const/16 v18, 0x0

    move-object/from16 v34, v10

    move-object v10, v1

    move-object/from16 v1, v34

    invoke-direct/range {v10 .. v18}, Le31/c;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Le31/a;Le31/a;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v2, 0x0

    move-object/from16 v34, v10

    move-object v10, v1

    move-object/from16 v1, v34

    invoke-static/range {v1 .. v6}, Le31/b;->f(Le31/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "SuccessAutoDismiss.."

    invoke-static {v1, v4, v9}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v10, :cond_a

    new-instance v1, Lz91/a;

    const/16 v2, 0x15

    invoke-direct {v1, v2}, Lz91/a;-><init>(I)V

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object/from16 v16, v1

    check-cast v16, Lc93/a;

    new-instance v12, Lsz0/p0$h;

    const/4 v13, 0x0

    const-wide/16 v14, 0x7d0

    const/16 v17, 0x1

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v18}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v19 .. v19}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v10, :cond_b

    new-instance v1, Lz91/a;

    const/16 v2, 0x16

    invoke-direct {v1, v2}, Lz91/a;-><init>(I)V

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object/from16 v16, v1

    check-cast v16, Lc93/a;

    new-instance v1, Le31/c;

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x18

    const/16 v18, 0x0

    move-object/from16 v34, v10

    move-object v10, v1

    move-object/from16 v1, v34

    invoke-direct/range {v10 .. v18}, Le31/c;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Le31/a;Le31/a;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v2, 0x0

    move-object/from16 v34, v10

    move-object v10, v1

    move-object/from16 v1, v34

    invoke-static/range {v1 .. v6}, Le31/b;->f(Le31/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "Error.."

    invoke-static {v1, v4, v9}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v12, Lsz0/p0$b;

    const-string v19, "Error Title"

    invoke-static/range {v19 .. v19}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/16 v16, 0x6

    const/16 v17, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v12 .. v17}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v20, "Error support text"

    invoke-static/range {v20 .. v20}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    new-instance v14, Le31/a;

    const-string v27, "Error primary action"

    invoke-static/range {v27 .. v27}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    const/16 v25, 0x6

    const/16 v26, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v21, v14

    invoke-direct/range {v21 .. v26}, Le31/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_c

    if-ne v2, v10, :cond_d

    :cond_c
    new-instance v2, Lzc1/l1;

    const/16 v1, 0xe

    invoke-direct {v2, v8, v1}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object/from16 v16, v2

    check-cast v16, Lc93/a;

    new-instance v1, Le31/c;

    const/4 v15, 0x0

    const/16 v17, 0x10

    const/16 v18, 0x0

    move-object/from16 v34, v10

    move-object v10, v1

    move-object/from16 v1, v34

    invoke-direct/range {v10 .. v18}, Le31/c;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Le31/a;Le31/a;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_e

    if-ne v3, v1, :cond_f

    :cond_e
    new-instance v3, Lzc1/l1;

    const/4 v2, 0x5

    invoke-direct {v3, v8, v2}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object v2, v3

    check-cast v2, Lc93/a;

    const/4 v3, 0x0

    const/4 v6, 0x4

    move-object/from16 v34, v10

    move-object v10, v1

    move-object/from16 v1, v34

    invoke-static/range {v1 .. v6}, Le31/b;->f(Le31/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    new-instance v12, Lsz0/p0$b;

    invoke-static/range {v19 .. v19}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/16 v16, 0x6

    const/16 v17, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v12 .. v17}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v20 .. v20}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    new-instance v14, Le31/a;

    invoke-static/range {v27 .. v27}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    const/16 v25, 0x6

    const/16 v26, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v21, v14

    invoke-direct/range {v21 .. v26}, Le31/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Le31/a;

    const-string v17, "Error secondary action"

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    move-object/from16 v21, v15

    invoke-direct/range {v21 .. v26}, Le31/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_10

    if-ne v2, v10, :cond_11

    :cond_10
    new-instance v2, Lzc1/l1;

    const/4 v1, 0x6

    invoke-direct {v2, v8, v1}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object/from16 v16, v2

    check-cast v16, Lc93/a;

    new-instance v1, Le31/c;

    move-object/from16 v34, v10

    move-object v10, v1

    move-object/from16 v1, v34

    invoke-direct/range {v10 .. v16}, Le31/c;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Le31/a;Le31/a;Lc93/a;)V

    invoke-virtual {v4, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_12

    if-ne v3, v1, :cond_13

    :cond_12
    new-instance v3, Lzc1/l1;

    const/4 v2, 0x7

    invoke-direct {v3, v8, v2}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    move-object v2, v3

    check-cast v2, Lc93/a;

    invoke-virtual {v4, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_14

    if-ne v6, v1, :cond_15

    :cond_14
    new-instance v6, Lzc1/l1;

    const/16 v3, 0x8

    invoke-direct {v6, v8, v3}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object v3, v6

    check-cast v3, Lc93/a;

    const/4 v6, 0x0

    move-object/from16 v34, v10

    move-object v10, v1

    move-object/from16 v1, v34

    invoke-static/range {v1 .. v6}, Le31/b;->f(Le31/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    new-instance v21, Lsz0/p0$b;

    invoke-static/range {v19 .. v19}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    const/16 v25, 0x4

    const/16 v26, 0x0

    const/16 v23, 0x1

    const/16 v24, 0x0

    invoke-direct/range {v21 .. v26}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v20 .. v20}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    new-instance v14, Le31/a;

    invoke-static/range {v27 .. v27}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v29

    const/16 v32, 0x6

    const/16 v33, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v28, v14

    invoke-direct/range {v28 .. v33}, Le31/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Le31/a;

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v23

    const/16 v26, 0x6

    const/16 v27, 0x0

    const/16 v25, 0x0

    move-object/from16 v22, v15

    invoke-direct/range {v22 .. v27}, Le31/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_16

    if-ne v2, v10, :cond_17

    :cond_16
    new-instance v2, Lzc1/l1;

    const/16 v1, 0x9

    invoke-direct {v2, v8, v1}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object/from16 v16, v2

    check-cast v16, Lc93/a;

    new-instance v1, Le31/c;

    move-object v12, v10

    move-object v10, v1

    move-object v1, v12

    move-object/from16 v12, v21

    invoke-direct/range {v10 .. v16}, Le31/c;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Le31/a;Le31/a;Lc93/a;)V

    invoke-virtual {v4, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_18

    if-ne v3, v1, :cond_19

    :cond_18
    new-instance v3, Lzc1/l1;

    const/16 v2, 0xa

    invoke-direct {v3, v8, v2}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    move-object v2, v3

    check-cast v2, Lc93/a;

    invoke-virtual {v4, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_1a

    if-ne v6, v1, :cond_1b

    :cond_1a
    new-instance v6, Lzc1/l1;

    const/16 v1, 0xb

    invoke-direct {v6, v8, v1}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    move-object v3, v6

    check-cast v3, Lc93/a;

    const/4 v6, 0x0

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Le31/b;->f(Le31/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "Secondary Action Error Retry"

    invoke-static {v1, v4, v9}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v1, Le31/c;

    new-instance v12, Lsz0/p0$b;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    new-instance v3, Lkd1/o$a;

    sget v6, Lgy0/a;->t:I

    invoke-direct {v3, v6}, Lkd1/o$a;-><init>(I)V

    invoke-direct {v12, v2, v7, v3}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;)V

    const-string v2, "Couldn\'t load data."

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    new-instance v14, Le31/a;

    const-string v2, "RELOAD"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    new-instance v2, Lkd1/o$a;

    sget v3, Lgy0/a;->F2:I

    invoke-direct {v2, v3}, Lkd1/o$a;-><init>(I)V

    invoke-virtual {v2}, Lkd1/o$a;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    const/16 v18, 0x2

    const/16 v19, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v14 .. v19}, Le31/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v17, 0x28

    const/16 v18, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object v10, v1

    invoke-direct/range {v10 .. v18}, Le31/c;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Le31/a;Le31/a;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, Le31/b;->f(Le31/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_1c
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_1d

    new-instance v2, Lzc1/a5;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Lzc1/a5;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_1d
    return-void
.end method

.method private static final p(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Saving"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Loading"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Error"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Primary Error"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Secondary Error"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Saved"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final w()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final x(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Error"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Primary Error"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Error"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
