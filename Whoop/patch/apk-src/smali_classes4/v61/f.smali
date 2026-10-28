.class public abstract Lv61/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lj71/b$i;",
        "plotState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Landroidx/compose/ui/Modifier;Lj71/b$i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "design_release"
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
.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lv61/f;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lj71/b$i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lv61/f;->g(Landroidx/compose/ui/Modifier;Lj71/b$i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lv61/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lv61/f;->f(Lkotlin/jvm/functions/Function1;Lv61/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lj71/b$i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lj71/b$i;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "plotState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v1, -0x4dde35bf

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v4, 0x30

    if-nez v1, :cond_1

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x20

    goto :goto_0

    :cond_0
    const/16 v1, 0x10

    :goto_0
    or-int/2addr v1, v4

    goto :goto_1

    :cond_1
    move v1, v4

    :goto_1
    and-int/lit8 v3, p5, 0x4

    const/16 v5, 0x100

    if-eqz v3, :cond_3

    or-int/lit16 v1, v1, 0x180

    :cond_2
    move-object/from16 v6, p2

    goto :goto_3

    :cond_3
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_2

    move-object/from16 v6, p2

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    move v7, v5

    goto :goto_2

    :cond_4
    const/16 v7, 0x80

    :goto_2
    or-int/2addr v1, v7

    :goto_3
    and-int/lit16 v7, v1, 0x91

    const/16 v8, 0x90

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v7, v8, :cond_5

    move v7, v10

    goto :goto_4

    :cond_5
    move v7, v9

    :goto_4
    and-int/lit8 v8, v1, 0x1

    invoke-virtual {v0, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_e

    and-int/lit8 v7, p5, 0x1

    if-eqz v7, :cond_6

    sget-object v7, Lb2/t;->w:Lb2/t;

    goto :goto_5

    :cond_6
    move-object/from16 v7, p0

    :goto_5
    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v8, :cond_7

    new-instance v3, Lto1/h;

    const/16 v6, 0x19

    invoke-direct {v3, v6}, Lto1/h;-><init>(I)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_8
    move-object v3, v6

    :goto_6
    sget-object v6, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v0, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    move-object v14, v6

    check-cast v14, Landroid/content/Context;

    sget-object v6, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    invoke-virtual {v0, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/content/res/Configuration;

    iget v6, v6, Landroid/content/res/Configuration;->fontScale:F

    invoke-virtual {v2}, Lj71/b$i;->g()Lx61/a;

    move-result-object v11

    invoke-virtual {v11}, Lx61/a;->b()Z

    move-result v11

    if-eqz v11, :cond_9

    new-instance v11, Lx61/b;

    invoke-virtual {v2}, Lj71/b$i;->h()Ljava/util/List;

    move-result-object v12

    invoke-virtual {v2}, Lj71/b$i;->g()Lx61/a;

    move-result-object v13

    invoke-virtual {v13}, Lx61/a;->a()F

    move-result v16

    const/16 v18, 0xa

    const/16 v19, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    move/from16 v17, v6

    invoke-direct/range {v11 .. v19}, Lx61/b;-><init>(Ljava/util/List;Lx61/d;Landroid/content/Context;Lx61/c;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v11}, Lx61/b;->b()Ljava/util/List;

    move-result-object v6

    goto :goto_7

    :cond_9
    invoke-virtual {v2}, Lj71/b$i;->h()Ljava/util/List;

    move-result-object v6

    :goto_7
    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_d

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ly61/a;

    and-int/lit16 v12, v1, 0x380

    if-ne v12, v5, :cond_a

    move v12, v10

    goto :goto_9

    :cond_a
    move v12, v9

    :goto_9
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_b

    if-ne v13, v8, :cond_c

    :cond_b
    new-instance v13, Lb11/b;

    const/16 v12, 0x10

    invoke-direct {v13, v3, v12}, Lb11/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-static {v11, v13, v0, v9, v9}, Lv61/c;->c(Ly61/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_8

    :cond_d
    move-object v1, v7

    goto :goto_a

    :cond_e
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object/from16 v1, p0

    move-object v3, v6

    :goto_a
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_f

    new-instance v0, Laz0/a;

    const/16 v6, 0xa

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Laz0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final e(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Lv61/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Lj71/b$i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lv61/f;->d(Landroidx/compose/ui/Modifier;Lj71/b$i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
