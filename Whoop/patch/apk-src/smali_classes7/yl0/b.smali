.class public abstract Lyl0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u001a9\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a5\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0010\u00b2\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lyl0/c;",
        "state",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onDismiss",
        "Lkotlin/Function1;",
        "",
        "onSave",
        "h",
        "(Lyl0/c;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "",
        "showKeyboard",
        "k",
        "(Lyl0/c;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "text",
        "bot_release"
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
.method public static synthetic a(Lyl0/c;Ll1/w3;Lkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lyl0/b;->i(Lyl0/c;Ll1/w3;Lkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lyl0/b;->n()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lyl0/c;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lyl0/b;->j(Lyl0/c;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lyl0/c;Ljava/util/Locale;Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lyl0/b;->o(Lyl0/c;Ljava/util/Locale;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Double;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyl0/b;->p(Ljava/lang/Double;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/Double;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lyl0/b;->q(Ljava/lang/Double;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lyl0/c;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lyl0/b;->r(Lyl0/c;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lyl0/c;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyl0/c;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    move/from16 v3, p4

    const-string v4, "state"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onDismiss"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onSave"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p3

    check-cast v15, Lp1/q;

    const v4, -0x5b1d5e67

    invoke-virtual {v15, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v3, 0x6

    const/4 v5, 0x2

    if-nez v4, :cond_1

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    or-int/2addr v4, v3

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    and-int/lit8 v6, v3, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_3
    and-int/lit16 v6, v3, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v4, v6

    :cond_5
    and-int/lit16 v6, v4, 0x93

    const/16 v7, 0x92

    if-eq v6, v7, :cond_6

    const/4 v6, 0x1

    goto :goto_4

    :cond_6
    const/4 v6, 0x0

    :goto_4
    and-int/lit8 v7, v4, 0x1

    invoke-virtual {v15, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_7

    const/4 v6, 0x0

    const/4 v7, 0x6

    invoke-static {v7, v6, v15, v5}, Ll1/n2;->g(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll1/w3;

    move-result-object v5

    new-instance v16, Lv41/g;

    invoke-virtual {v1}, Lyl0/c;->e()Ljava/lang/String;

    move-result-object v6

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v9, "toUpperCase(...)"

    invoke-static {v8, v6, v9}, Ld13/a;->e(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    const/16 v24, 0x7e

    const/16 v25, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v16 .. v25}, Lv41/g;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;Lv41/i0;Ly81/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lno0/h;

    const/16 v8, 0x1d

    invoke-direct {v6, v1, v5, v0, v8}, Lno0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v8, 0x4f000673

    invoke-static {v8, v15, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v14

    sget v6, Lv41/g;->h:I

    shl-int/2addr v6, v7

    shl-int/lit8 v4, v4, 0xf

    const/high16 v7, 0x380000

    and-int/2addr v4, v7

    or-int/2addr v4, v6

    const/16 v17, 0x180

    const/16 v18, 0xfb9

    const/4 v2, 0x0

    move-object v3, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v8, v16

    move/from16 v16, v4

    move-object v4, v8

    move-object/from16 v8, p1

    invoke-static/range {v2 .. v18}, Lv41/e;->g(Landroidx/compose/ui/Modifier;Ll1/w3;Lv41/g;Ly81/e;Lc93/a;Lc93/a;Lc93/a;Li2/a1;ZLny0/q;Li2/t;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    goto :goto_5

    :cond_7
    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_8

    new-instance v0, Lvv2/c;

    const/16 v5, 0xf

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lvv2/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final i(Lyl0/c;Ll1/w3;Lkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 9

    const-string v0, "$this$BottomSheetM3"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p3, p5, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p3, v0, :cond_0

    move p3, v2

    goto :goto_0

    :cond_0
    move p3, v1

    :goto_0
    and-int/2addr p5, v2

    move-object v6, p4

    check-cast v6, Lp1/q;

    invoke-virtual {v6, p5, p3}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-virtual {p1}, Ll1/w3;->c()Ll1/x3;

    move-result-object p1

    sget-object p3, Ll1/x3;->x:Ll1/x3;

    if-ne p1, p3, :cond_1

    move v4, v2

    goto :goto_1

    :cond_1
    move v4, v1

    :goto_1
    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, p0

    move-object v5, p2

    invoke-static/range {v3 .. v8}, Lyl0/b;->k(Lyl0/c;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_2

    :cond_2
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lyl0/c;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lyl0/b;->h(Lyl0/c;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k(Lyl0/c;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyl0/c;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSave"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v2, 0xa3b4092

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v4, 0x6

    const/4 v6, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v6

    :goto_0
    or-int/2addr v2, v4

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    and-int/lit8 v7, p5, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move/from16 v9, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v9, v4, 0x30

    if-nez v9, :cond_2

    move/from16 v9, p1

    invoke-virtual {v0, v9}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x20

    goto :goto_2

    :cond_4
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v2, v10

    :goto_3
    and-int/lit16 v10, v4, 0x180

    if-nez v10, :cond_6

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    const/16 v10, 0x100

    goto :goto_4

    :cond_5
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v2, v10

    :cond_6
    and-int/lit16 v10, v2, 0x93

    const/16 v12, 0x92

    const/4 v13, 0x0

    if-eq v10, v12, :cond_7

    const/4 v10, 0x1

    goto :goto_5

    :cond_7
    move v10, v13

    :goto_5
    and-int/lit8 v12, v2, 0x1

    invoke-virtual {v0, v12, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_1c

    if-eqz v7, :cond_8

    const/16 v20, 0x1

    goto :goto_6

    :cond_8
    move/from16 v20, v9

    :goto_6
    sget-object v7, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    invoke-virtual {v0, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/content/res/Configuration;

    invoke-virtual {v7}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object v7

    invoke-virtual {v7, v13}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v7

    const-string v9, "get(...)"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7}, Lyl0/p;->e(Ljava/util/Locale;)Ljava/util/Locale;

    move-result-object v7

    invoke-virtual {v1}, Lyl0/c;->g()Ljava/lang/Double;

    move-result-object v9

    invoke-virtual {v1}, Lyl0/c;->a()I

    move-result v10

    invoke-virtual {v0, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v0, v10}, Lp1/q;->e(I)Z

    move-result v10

    or-int/2addr v9, v10

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez v9, :cond_9

    if-ne v10, v12, :cond_c

    :cond_9
    invoke-virtual {v1}, Lyl0/c;->g()Ljava/lang/Double;

    move-result-object v9

    if-eqz v9, :cond_a

    invoke-virtual {v9}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v9

    invoke-virtual {v1}, Lyl0/c;->a()I

    move-result v11

    invoke-static {v9, v10, v11, v7}, Lyl0/p;->a(DILjava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    goto :goto_7

    :cond_a
    const/4 v9, 0x0

    :goto_7
    if-nez v9, :cond_b

    const-string v9, ""

    :cond_b
    invoke-static {v9}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v10

    invoke-virtual {v0, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v10, Lp1/c1;

    invoke-static {v10}, Lyl0/b;->l(Lp1/c1;)Ljava/lang/String;

    move-result-object v21

    invoke-virtual {v1}, Lyl0/c;->c()D

    move-result-wide v22

    invoke-virtual {v1}, Lyl0/c;->b()D

    move-result-wide v24

    move-object/from16 v26, v7

    invoke-static/range {v21 .. v26}, Lyl0/p;->c(Ljava/lang/String;DDLjava/util/Locale;)Z

    move-result v7

    move-object/from16 v9, v26

    invoke-static {v10}, Lyl0/b;->l(Lp1/c1;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v9}, Lyl0/p;->g(Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/Double;

    move-result-object v11

    move/from16 p1, v7

    const/high16 v7, 0x3f800000    # 1.0f

    move-object/from16 v16, v11

    sget-object v11, Lb2/t;->w:Lb2/t;

    move/from16 v17, v13

    invoke-static {v7, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/16 v18, 0x1

    int-to-float v14, v6

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v14, v8

    invoke-static {v14}, Ll0/m;->i(F)Ll0/k;

    move-result-object v8

    sget-object v14, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x6

    invoke-static {v8, v14, v0, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    move/from16 v22, v5

    iget-wide v5, v0, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v0, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v23, La3/l;->a:La3/k;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-eqz v15, :cond_d

    invoke-virtual {v0, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_d
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_8
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v0, v14, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v0, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v0, Lp1/q;->S:Z

    if-nez v8, :cond_e

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v8, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    :cond_e
    invoke-static {v5, v0, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v0, v5, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v10}, Lyl0/b;->l(Lp1/c1;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v1}, Lyl0/c;->d()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v1}, Lyl0/c;->f()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v14

    if-lez v14, :cond_10

    goto :goto_9

    :cond_10
    const/4 v13, 0x0

    :goto_9
    if-eqz v13, :cond_11

    new-instance v15, Lqz0/c$c;

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/4 v7, 0x0

    const/4 v14, 0x2

    invoke-direct {v15, v13, v7, v14, v7}, Lqz0/c$c;-><init>(Lcom/whoop/design/util/TextResource;Lb91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_a

    :cond_11
    const/4 v7, 0x0

    move-object v15, v7

    :goto_a
    new-instance v13, Lcom/whoop/design/util/TextResource$b;

    sget v7, Lwk0/b;->N:I

    new-instance v14, Lcom/whoop/design/util/TextResource$d$b;

    invoke-virtual {v1}, Lyl0/c;->c()D

    move-result-wide v25

    invoke-static/range {v25 .. v26}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    invoke-direct {v14, v4}, Lcom/whoop/design/util/TextResource$d$b;-><init>(Ljava/lang/Number;)V

    new-instance v4, Lcom/whoop/design/util/TextResource$d$b;

    invoke-virtual {v1}, Lyl0/c;->b()D

    move-result-wide v25

    move-object/from16 v27, v5

    invoke-static/range {v25 .. v26}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/whoop/design/util/TextResource$d$b;-><init>(Ljava/lang/Number;)V

    move-object/from16 v24, v4

    const/4 v5, 0x2

    new-array v4, v5, [Lcom/whoop/design/util/TextResource$d;

    aput-object v14, v4, v17

    aput-object v24, v4, v18

    invoke-direct {v13, v7, v4}, Lcom/whoop/design/util/TextResource$b;-><init>(I[Lcom/whoop/design/util/TextResource$d;)V

    invoke-virtual {v1}, Lyl0/c;->a()I

    move-result v4

    const/16 v7, 0x9

    if-lez v4, :cond_12

    move v4, v7

    goto :goto_b

    :cond_12
    const/4 v4, 0x3

    :goto_b
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v12, :cond_13

    new-instance v14, Lyc2/a;

    const/16 v5, 0xc

    invoke-direct {v14, v5}, Lyc2/a;-><init>(I)V

    invoke-virtual {v0, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    move-object/from16 v31, v14

    check-cast v31, Lc93/a;

    and-int/lit8 v5, v2, 0xe

    const/4 v14, 0x4

    if-ne v5, v14, :cond_14

    move/from16 v5, v18

    goto :goto_c

    :cond_14
    move/from16 v5, v17

    :goto_c
    invoke-virtual {v0, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v5, v14

    invoke-virtual {v0, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v5, v14

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v5, :cond_15

    if-ne v14, v12, :cond_16

    :cond_15
    new-instance v14, Lwc/e1;

    const/16 v5, 0x10

    invoke-direct {v14, v1, v9, v10, v5}, Lwc/e1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    move-object/from16 v32, v14

    check-cast v32, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v12, :cond_17

    new-instance v5, Lyk2/k;

    const/4 v14, 0x2

    invoke-direct {v5, v14}, Lyk2/k;-><init>(I)V

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object/from16 v33, v5

    check-cast v33, Lkotlin/jvm/functions/Function1;

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v9, v5, 0x3

    or-int/lit8 v9, v9, 0x6

    shl-int/2addr v5, v7

    or-int/2addr v5, v9

    sget v7, Lqz0/c$c;->d:I

    shl-int/lit8 v7, v7, 0x15

    or-int/2addr v5, v7

    sget v39, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v7, v39, 0x18

    or-int v35, v5, v7

    shl-int/lit8 v5, v2, 0xc

    const/high16 v7, 0x70000

    and-int v36, v5, v7

    const/high16 v37, 0x6180000

    const v38, 0x3ff6c74

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v5, v11

    const/4 v11, 0x0

    move-object v14, v12

    move-object v12, v15

    const/4 v15, 0x0

    move-object/from16 v19, v16

    const/16 v16, 0x0

    move/from16 v21, v18

    const/16 v18, 0x0

    move-object/from16 v24, v19

    const/16 v19, 0x0

    move/from16 v25, v21

    const/16 v21, 0x0

    move/from16 v26, v22

    const/16 v22, 0x0

    const/high16 v28, 0x3f800000    # 1.0f

    const/16 v23, 0x0

    move-object/from16 v29, v24

    const/16 v24, 0x0

    move/from16 v30, v25

    const/16 v25, 0x0

    move/from16 v34, v26

    const/16 v26, 0x0

    move-object/from16 v40, v5

    move-object/from16 v5, v27

    const/16 v27, 0x0

    move/from16 v41, v28

    const/16 v28, 0x0

    move-object/from16 v42, v29

    const/16 v29, 0x0

    move/from16 v43, v30

    const/16 v30, 0x0

    move/from16 v17, v4

    move-object v1, v14

    move-object/from16 v3, v40

    move-object/from16 v4, v42

    move/from16 v14, p1

    move/from16 v40, v34

    move-object/from16 v34, v0

    move/from16 v0, v41

    invoke-static/range {v5 .. v38}, Lqz0/f;->c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Lb91/a;Lc93/m;Lc93/m;Lqz0/c;Lcom/whoop/design/util/TextResource;ZLb91/a;ZIIIZLq3/g0;ZZLj0/i;Li2/a1;Lg1/e8;Ll0/k1;Lu0/q0;Landroid/icu/text/NumberFormat;ZLc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIII)V

    move/from16 v23, v20

    move-object/from16 v5, v34

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    if-eqz v4, :cond_18

    if-nez v14, :cond_18

    const/4 v6, 0x1

    goto :goto_d

    :cond_18
    const/4 v6, 0x0

    :goto_d
    sget v3, Lgy0/f;->A2:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v11

    invoke-virtual {v5, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    and-int/lit16 v2, v2, 0x380

    const/16 v7, 0x100

    if-ne v2, v7, :cond_19

    const/4 v13, 0x1

    goto :goto_e

    :cond_19
    const/4 v13, 0x0

    :goto_e
    or-int v2, v3, v13

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1b

    if-ne v3, v1, :cond_1a

    goto :goto_f

    :cond_1a
    move-object/from16 v1, p2

    goto :goto_10

    :cond_1b
    :goto_f
    new-instance v3, Lw71/i;

    move-object/from16 v1, p2

    invoke-direct {v3, v4, v1}, Lw71/i;-><init>(Ljava/lang/Double;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_10
    move-object/from16 v18, v3

    check-cast v18, Lc93/a;

    shl-int/lit8 v2, v39, 0x12

    or-int/lit8 v20, v2, 0x6

    const/16 v21, 0x0

    const/16 v22, 0x1fbc

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v19, v5

    move-object v5, v0

    invoke-static/range {v5 .. v22}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v19

    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    move/from16 v2, v23

    goto :goto_11

    :cond_1c
    move-object v5, v0

    move-object v1, v3

    invoke-virtual {v5}, Lp1/q;->X()V

    move v2, v9

    :goto_11
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1d

    new-instance v0, Lsl0/t1;

    const/16 v6, 0x8

    move/from16 v4, p4

    move/from16 v5, p5

    move-object v3, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v6}, Lsl0/t1;-><init>(Ljava/lang/Object;ZLjava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1d
    return-void
.end method

.method private static final l(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final m(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final n()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final o(Lyl0/c;Ljava/util/Locale;Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "newText"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lyl0/c;->a()I

    move-result p0

    invoke-static {p3, p0, p1}, Lyl0/p;->b(Ljava/lang/String;ILjava/util/Locale;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {p2, p3}, Lyl0/b;->m(Lp1/c1;Ljava/lang/String;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Ljava/lang/Double;)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Ljava/lang/Double;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lyl0/c;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lyl0/b;->k(Lyl0/c;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
