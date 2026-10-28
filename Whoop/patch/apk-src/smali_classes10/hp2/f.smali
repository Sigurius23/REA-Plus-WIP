.class public abstract Lhp2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\t\u00b2\u0006\u000c\u0010\u0008\u001a\u00020\u00078\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lhp2/g;",
        "viewState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "c",
        "(Lhp2/g;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "Landroid/content/ClipboardManager;",
        "clipboardManager",
        "universal-checkout_release"
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
.method public static synthetic a(Lhp2/g;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lhp2/f;->f(Lhp2/g;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Lhp2/g;Landroid/content/Context;Ljava/lang/String;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lhp2/f;->e(Ljava/lang/String;Lhp2/g;Landroid/content/Context;Ljava/lang/String;Lp1/t2;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lhp2/g;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 46

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p2

    check-cast v4, Lp1/q;

    const v0, 0x1b4c9034

    invoke-virtual {v4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v4, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int v0, p3, v0

    goto :goto_2

    :cond_2
    move/from16 v0, p3

    :goto_2
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-virtual {v4, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_3

    :cond_5
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v0, v6

    :goto_4
    and-int/lit8 v6, v0, 0x13

    const/16 v7, 0x12

    const/16 v28, 0x0

    if-eq v6, v7, :cond_6

    const/4 v6, 0x1

    goto :goto_5

    :cond_6
    move/from16 v6, v28

    :goto_5
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v4, v9, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_13

    sget-object v6, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_7

    move-object v3, v6

    goto :goto_6

    :cond_7
    move-object v3, v5

    :goto_6
    sget-object v5, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v4, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/content/Context;

    const-string v10, "clipboard"

    invoke-virtual {v9, v10}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    const-string v10, "null cannot be cast to non-null type android.content.ClipboardManager"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Landroid/content/ClipboardManager;

    invoke-static {v9, v4}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v9

    sget v10, Lln2/a;->c:I

    invoke-static {v4, v10}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    sget v11, Lln2/a;->i:I

    invoke-static {v4, v11}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v4, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/Context;

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-interface {v12, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const-wide/high16 v13, 0x4002000000000000L    # 2.25

    double-to-float v13, v13

    const/16 v14, 0x8

    int-to-float v15, v14

    mul-float/2addr v13, v15

    invoke-static {v13}, Ll0/m;->i(F)Ll0/k;

    move-result-object v13

    sget-object v2, Lb2/e;->M:Lb2/k;

    move-object/from16 v16, v3

    const/4 v3, 0x6

    invoke-static {v13, v2, v4, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v13

    move/from16 v17, v15

    iget-wide v14, v4, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v4, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v18, v7

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v3, v4, Lp1/q;->S:Z

    if-eqz v3, :cond_8

    invoke-virtual {v4, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_8
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_7
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v4, v3, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v4, v13, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v8, v4, Lp1/q;->S:Z

    if-nez v8, :cond_9

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    move/from16 v29, v0

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_8

    :cond_9
    move/from16 v29, v0

    :goto_8
    invoke-static {v14, v4, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v4, v0, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v8, 0x1

    int-to-float v12, v8

    move/from16 v14, v17

    const/4 v8, 0x6

    invoke-static {v12, v14, v2, v4, v8}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v2

    move-object v12, v9

    iget-wide v8, v4, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v4, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v4}, Lp1/q;->i0()V

    move-object/from16 v17, v5

    iget-boolean v5, v4, Lp1/q;->S:Z

    if-eqz v5, :cond_b

    invoke-virtual {v4, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_b
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v4, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v4, Lp1/q;->S:Z

    if-nez v2, :cond_c

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    :cond_c
    invoke-static {v8, v4, v8, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v4, v0, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lhp2/g;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v4, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v3, v4, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v7

    invoke-virtual {v3, v4, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->P()Lb91/a;

    move-result-object v22

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v26, v9, 0x12

    const v27, 0x2fffa

    move-object v9, v3

    const/4 v3, 0x0

    move-object/from16 v24, v4

    move-object v13, v6

    move-wide/from16 v44, v7

    move v8, v5

    move-wide/from16 v4, v44

    const-wide/16 v6, 0x0

    move v14, v8

    const/4 v8, 0x0

    move-object v15, v9

    const/4 v9, 0x0

    move-object/from16 v18, v10

    const/4 v10, 0x0

    move-object/from16 v23, v11

    move-object/from16 v21, v12

    const-wide/16 v11, 0x0

    move-object/from16 v25, v13

    const/4 v13, 0x0

    move/from16 v30, v14

    const/4 v14, 0x0

    move-object/from16 v32, v15

    move-object/from16 v31, v16

    const-wide/16 v15, 0x0

    move-object/from16 v33, v17

    const/16 v17, 0x0

    move-object/from16 v34, v18

    const/16 v18, 0x0

    const/16 v35, 0x6

    const/16 v19, 0x0

    const/16 v36, 0x1

    const/16 v20, 0x0

    move-object/from16 v37, v21

    const/16 v21, 0x0

    move-object/from16 v38, v23

    const/16 v23, 0x0

    move-object/from16 v39, v25

    const/16 v25, 0x0

    move v1, v2

    move/from16 v42, v30

    move-object/from16 v41, v33

    move-object/from16 v40, v34

    move-object/from16 v43, v39

    const/16 v30, 0x8

    move-object v2, v0

    move-object/from16 v0, v32

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v24

    invoke-virtual/range {p0 .. p0}, Lhp2/g;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v4, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move/from16 v14, v42

    invoke-virtual {v0, v4, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v5

    invoke-virtual {v0, v4, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->b()Lb91/a;

    move-result-object v22

    move-wide v4, v5

    const-wide/16 v6, 0x0

    const/4 v14, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    const/4 v8, 0x1

    invoke-virtual {v7, v8}, Lp1/q;->q(Z)V

    const/16 v0, 0xf

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v2, v1

    mul-float/2addr v0, v2

    move-object/from16 v13, v43

    invoke-static {v0, v13}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lhp2/g;->b()Ly71/o;

    move-result-object v10

    move-object/from16 v12, v37

    invoke-virtual {v7, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    move-object/from16 v2, v38

    invoke-virtual {v7, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v0, v3

    and-int/lit8 v3, v29, 0xe

    if-eq v3, v1, :cond_f

    and-int/lit8 v1, v29, 0x8

    if-eqz v1, :cond_e

    move-object/from16 v1, p0

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_10

    goto :goto_a

    :cond_e
    move-object/from16 v1, p0

    goto :goto_b

    :cond_f
    move-object/from16 v1, p0

    :goto_a
    move/from16 v28, v8

    :cond_10
    :goto_b
    or-int v0, v0, v28

    move-object/from16 v3, v41

    invoke-virtual {v7, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    move-object/from16 v4, v40

    invoke-virtual {v7, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v0, v5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_11

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v5, v0, :cond_12

    :cond_11
    new-instance v0, La00/h;

    const/16 v6, 0xa

    move-object v5, v2

    move-object v2, v1

    move-object v1, v5

    move-object v5, v12

    invoke-direct/range {v0 .. v6}, La00/h;-><init>(Ljava/lang/String;Ljava/lang/Object;Landroid/content/Context;Ljava/lang/String;Lp1/c1;I)V

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v0

    :cond_12
    move-object v3, v5

    check-cast v3, Lc93/a;

    sget v0, Ly71/o;->q:I

    shl-int/lit8 v0, v0, 0x3

    or-int/lit8 v5, v0, 0x6

    const/4 v6, 0x0

    move-object v4, v7

    move-object v1, v9

    move-object v2, v10

    invoke-static/range {v1 .. v6}, Ly71/n;->c(Landroidx/compose/ui/Modifier;Ly71/o;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v8}, Lp1/q;->q(Z)V

    move-object/from16 v3, v31

    goto :goto_c

    :cond_13
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object v3, v5

    :goto_c
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_14

    new-instance v0, Lfc0/e;

    const/16 v5, 0x15

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lfc0/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final d(Lp1/t2;)Landroid/content/ClipboardManager;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Landroid/content/ClipboardManager;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/ClipboardManager;

    return-object p0
.end method

.method private static final e(Ljava/lang/String;Lhp2/g;Landroid/content/Context;Ljava/lang/String;Lp1/t2;)Ll83/a0;
    .locals 0

    invoke-static {p4}, Lhp2/f;->d(Lp1/t2;)Landroid/content/ClipboardManager;

    move-result-object p4

    invoke-virtual {p1}, Lhp2/g;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object p0

    invoke-virtual {p4, p0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p1, 0x21

    if-ge p0, p1, :cond_0

    const/4 p0, 0x1

    invoke-static {p2, p3, p0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lhp2/g;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lhp2/f;->c(Lhp2/g;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
