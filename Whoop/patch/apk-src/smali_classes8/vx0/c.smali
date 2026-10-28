.class public abstract Lvx0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0003H\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a5\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a-\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u000f2\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001f\u00b2\u0006\u000c\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u001d\u001a\u00020\u001c8\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u001e\u001a\u00020\u001c8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lvx0/e;",
        "viewModel",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onNavigateBack",
        "w",
        "(Lvx0/e;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "",
        "title",
        "u",
        "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V",
        "s",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Lft0/b;",
        "device",
        "",
        "isPrimary",
        "enabled",
        "onUnpair",
        "p",
        "(Lft0/b;ZZLc93/a;Landroidx/compose/runtime/Composer;I)V",
        "Lmj0/e;",
        "candidate",
        "onPair",
        "n",
        "(Lmj0/e;ZLc93/a;Landroidx/compose/runtime/Composer;I)V",
        "Lvx0/d;",
        "uiState",
        "Lmj0/c;",
        "primaryState",
        "connectionState",
        "debug-tools_release"
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
.method private static final A(Lp1/t2;)Lmj0/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lmj0/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmj0/c;

    return-object p0
.end method

.method private static final B(Lp1/t2;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 3

    const-string v0, "$this$item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p1, v0, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    and-int/2addr p3, v2

    check-cast p2, Lp1/q;

    invoke-virtual {p2, p3, p1}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p0}, Lvx0/c;->x(Lp1/t2;)Lvx0/d;

    move-result-object p0

    invoke-virtual {p0}, Lvx0/d;->e()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    const-string p1, "Paired devices ("

    const-string p3, ")"

    invoke-static {p0, p1, p3}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p2, v1}, Lvx0/c;->u(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lft0/b;)Ljava/lang/Object;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lft0/b;->a()Ljava/lang/String;

    move-result-object p0

    const-string v0, "paired-"

    invoke-static {v0, p0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final D(Lvx0/e;Lp1/t2;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 31

    move-object/from16 v0, p0

    const-string v1, "$this$item"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p4, 0x11

    const/16 v2, 0x10

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v2, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    and-int/lit8 v2, p4, 0x1

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_a

    const-string v1, "Scan"

    const/4 v2, 0x6

    invoke-static {v1, v11, v2}, Lvx0/c;->u(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/16 v1, 0x8

    int-to-float v1, v1

    invoke-static {v1}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    sget-object v6, Lb2/e;->J:Lb2/l;

    invoke-static {v5, v6, v11, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v5, v11, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-eqz v10, :cond_1

    invoke-virtual {v11, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_1
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v11, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v11, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v6, v11, Lp1/q;->S:Z

    if-nez v6, :cond_2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    :cond_2
    invoke-static {v5, v11, v5, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v11, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_4

    if-ne v5, v6, :cond_5

    :cond_4
    new-instance v5, Lvx0/c$b;

    invoke-direct {v5, v0}, Lvx0/c$b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v5, Lj93/g;

    check-cast v5, Lc93/a;

    invoke-static/range {p1 .. p1}, Lvx0/c;->x(Lp1/t2;)Lvx0/d;

    move-result-object v2

    invoke-virtual {v2}, Lvx0/d;->g()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-static/range {p1 .. p1}, Lvx0/c;->x(Lp1/t2;)Lvx0/d;

    move-result-object v2

    invoke-virtual {v2}, Lvx0/d;->c()Z

    move-result v2

    if-nez v2, :cond_6

    move-object v2, v7

    move v7, v4

    goto :goto_2

    :cond_6
    move-object v2, v7

    move v7, v3

    :goto_2
    sget-object v17, Lvx0/b;->a:Lvx0/b;

    invoke-virtual/range {v17 .. v17}, Lvx0/b;->q()Lkotlin/jvm/functions/Function3;

    move-result-object v13

    const/high16 v15, 0x30000000

    const/16 v16, 0x1fa

    move-object v8, v6

    const/4 v6, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v12, v10

    const/4 v10, 0x0

    move-object v14, v11

    const/4 v11, 0x0

    move-object/from16 v18, v12

    const/4 v12, 0x0

    move-object/from16 v30, v18

    move-object/from16 v18, v2

    move-object/from16 v2, v30

    invoke-static/range {v5 .. v16}, Ldt/b;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/q1;Li2/a1;Lf0/t;Lg1/u0;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_7

    if-ne v6, v2, :cond_8

    :cond_7
    new-instance v6, Lvx0/c$c;

    invoke-direct {v6, v0}, Lvx0/c$c;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v14, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v6, Lj93/g;

    move-object v5, v6

    check-cast v5, Lc93/a;

    invoke-static/range {p1 .. p1}, Lvx0/c;->x(Lp1/t2;)Lvx0/d;

    move-result-object v0

    invoke-virtual {v0}, Lvx0/d;->g()Z

    move-result v7

    invoke-virtual/range {v17 .. v17}, Lvx0/b;->m()Lkotlin/jvm/functions/Function3;

    move-result-object v10

    const/high16 v12, 0x30000000

    const/16 v13, 0x1fa

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v11, v14

    invoke-static/range {v5 .. v13}, Ldt/b;->c(Lc93/a;Landroidx/compose/ui/Modifier;ZLf0/t;Lg1/m1;Lkotlin/jvm/functions/Function3;Lp1/q;II)V

    invoke-virtual {v14, v4}, Lp1/q;->q(Z)V

    invoke-static/range {p1 .. p1}, Lvx0/c;->x(Lp1/t2;)Lvx0/d;

    move-result-object v0

    invoke-virtual {v0}, Lvx0/d;->h()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_9

    const v0, 0xc54eb1a

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_9
    const v2, 0xc54eb1b

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    const v5, 0x3f333333    # 0.7f

    invoke-static {v2, v14, v4, v5}, Lev/n;->f(Lx81/d;Lp1/q;IF)J

    move-result-wide v11

    const/16 v2, 0xc

    invoke-static {v2}, Lv63/c;->h(I)J

    move-result-wide v15

    const/4 v9, 0x0

    const/16 v10, 0xd

    const/4 v6, 0x0

    const/4 v8, 0x0

    move v7, v1

    move-object/from16 v5, v18

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v28, 0x0

    const v29, 0x1fff0

    move-wide v7, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v26, v14

    move-wide v9, v15

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0xc30

    move-object v5, v0

    invoke-static/range {v5 .. v29}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v26

    invoke-virtual {v14, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_a
    move-object v14, v11

    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final E(Lp1/t2;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 3

    const-string v0, "$this$item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p1, v0, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    and-int/2addr p3, v2

    check-cast p2, Lp1/q;

    invoke-virtual {p2, p3, p1}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p0}, Lvx0/c;->x(Lp1/t2;)Lvx0/d;

    move-result-object p0

    invoke-virtual {p0}, Lvx0/d;->d()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    const-string p1, "Discovered ("

    const-string p3, ")"

    invoke-static {p0, p1, p3}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p2, v1}, Lvx0/c;->u(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lp1/t2;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 27

    const-string v0, "$this$item"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v2, p2

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static/range {p0 .. p0}, Lvx0/c;->x(Lp1/t2;)Lvx0/d;

    move-result-object v0

    invoke-virtual {v0}, Lvx0/d;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Listening for WHOOP advertisements\u2026"

    goto :goto_1

    :cond_1
    const-string v0, "Start scan to discover candidates"

    :goto_1
    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    const v4, 0x3f19999a    # 0.6f

    invoke-static {v1, v2, v3, v4}, Lev/n;->f(Lx81/d;Lp1/q;IF)J

    move-result-wide v4

    const/16 v1, 0xd

    invoke-static {v1}, Lv63/c;->h(I)J

    move-result-wide v6

    const/16 v25, 0x0

    const v26, 0x1fff2

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0xc00

    move-object/from16 v23, v2

    move-object v2, v0

    invoke-static/range {v2 .. v26}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    goto :goto_2

    :cond_2
    move-object/from16 v23, v2

    invoke-virtual/range {v23 .. v23}, Lp1/q;->X()V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final G(Lmj0/e;)Ljava/lang/Object;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lmj0/e;->a()Ljava/lang/String;

    move-result-object p0

    const-string v0, "discovered-"

    invoke-static {v0, p0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final H(Lvx0/e;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lvx0/c;->w(Lvx0/e;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic I(Lmj0/e;ZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lvx0/c;->n(Lmj0/e;ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic J(Lft0/b;ZZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lvx0/c;->p(Lft0/b;ZZLc93/a;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic K(Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1}, Lvx0/c;->s(Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic L(Lp1/t2;)Lvx0/d;
    .locals 0

    invoke-static {p0}, Lvx0/c;->x(Lp1/t2;)Lvx0/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lvx0/c;->v(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/t2;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lvx0/c;->F(Lp1/t2;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lvx0/c;->t(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp1/t2;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lvx0/c;->z(Lp1/t2;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lvx0/e;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lvx0/c;->H(Lvx0/e;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lvx0/e;Lp1/t2;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lvx0/c;->D(Lvx0/e;Lp1/t2;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lft0/b;ZZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lvx0/c;->r(Lft0/b;ZZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lmj0/e;ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lvx0/c;->o(Lmj0/e;ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lmj0/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lvx0/c;->G(Lmj0/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lp1/t2;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lvx0/c;->E(Lp1/t2;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lp1/t2;Lvx0/e;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lvx0/c;->y(Lp1/t2;Lvx0/e;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lft0/b;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lvx0/c;->C(Lft0/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lp1/t2;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lvx0/c;->B(Lp1/t2;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final n(Lmj0/e;ZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmj0/e;",
            "Z",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move/from16 v4, p4

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v0, 0x74c8664c

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    move-object/from16 v1, p0

    if-nez v0, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v2, v4, 0x30

    if-nez v2, :cond_3

    move/from16 v2, p1

    invoke-virtual {v14, v2}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    goto :goto_3

    :cond_3
    move/from16 v2, p1

    :goto_3
    and-int/lit16 v3, v4, 0x180

    if-nez v3, :cond_5

    move-object/from16 v3, p2

    invoke-virtual {v14, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_4

    :cond_4
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v0, v5

    goto :goto_5

    :cond_5
    move-object/from16 v3, p2

    :goto_5
    and-int/lit16 v5, v0, 0x93

    const/16 v6, 0x92

    if-eq v5, v6, :cond_6

    const/4 v5, 0x1

    goto :goto_6

    :cond_6
    const/4 v5, 0x0

    :goto_6
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v14, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_f

    sget-object v5, Lb2/t;->w:Lb2/t;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v9, Lb2/e;->K:Lb2/l;

    const/16 v10, 0x8

    int-to-float v10, v10

    invoke-static {v10}, Ll0/m;->i(F)Ll0/k;

    move-result-object v10

    const/16 v11, 0x36

    invoke-static {v10, v9, v14, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    iget-wide v10, v14, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v14, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v13, v14, Lp1/q;->S:Z

    if-eqz v13, :cond_7

    invoke-virtual {v14, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_7
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_7
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v14, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v14, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v15, v14, Lp1/q;->S:Z

    if-nez v15, :cond_8

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v15, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9

    :cond_8
    invoke-static {v10, v14, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v14, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v10, v9

    float-to-double v8, v6

    const-wide/16 v15, 0x0

    cmpl-double v8, v8, v15

    if-lez v8, :cond_a

    goto :goto_8

    :cond_a
    const-string v8, "invalid weight; must be greater than zero"

    invoke-static {v8}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_8
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v5, 0x1

    invoke-direct {v8, v6, v5}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    const/4 v15, 0x0

    invoke-static {v6, v9, v14, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    move-object/from16 p3, v6

    iget-wide v5, v14, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v14, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v15, v14, Lp1/q;->S:Z

    if-eqz v15, :cond_b

    invoke-virtual {v14, v12}, Lp1/q;->l(Lc93/a;)V

    :goto_9
    move-object/from16 v12, p3

    goto :goto_a

    :cond_b
    invoke-virtual {v14}, Lp1/q;->s0()V

    goto :goto_9

    :goto_a
    invoke-static {v14, v13, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v14, Lp1/q;->S:Z

    if-nez v6, :cond_c

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_d

    :cond_c
    invoke-static {v5, v14, v5, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v14, v7, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lmj0/e;->b()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_e

    const-string v5, "(unnamed)"

    :cond_e
    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v14, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v10

    sget-object v12, Lp3/r;->G:Lp3/r;

    const/16 v30, 0xe

    move-wide/from16 v34, v10

    move v11, v7

    move-wide/from16 v7, v34

    const/4 v13, 0x1

    invoke-static/range {v30 .. v30}, Lv63/c;->h(I)J

    move-result-wide v9

    const/16 v28, 0x0

    const v29, 0x1ffd2

    move-object v15, v6

    const/4 v6, 0x0

    move/from16 v16, v11

    const/4 v11, 0x0

    move/from16 v17, v13

    const/4 v13, 0x0

    move-object/from16 v26, v14

    move-object/from16 v18, v15

    const-wide/16 v14, 0x0

    move/from16 v19, v16

    const/16 v16, 0x0

    move/from16 v20, v17

    const/16 v17, 0x0

    move-object/from16 v21, v18

    move/from16 v22, v19

    const-wide/16 v18, 0x0

    move/from16 v23, v20

    const/16 v20, 0x0

    move-object/from16 v24, v21

    const/16 v21, 0x0

    move/from16 v25, v22

    const/16 v22, 0x0

    move/from16 v27, v23

    const/16 v23, 0x0

    move-object/from16 v31, v24

    const/16 v24, 0x0

    move/from16 v32, v25

    const/16 v25, 0x0

    move/from16 v33, v27

    const v27, 0x30c00

    move/from16 p3, v0

    move-object/from16 v0, v31

    move/from16 v1, v32

    move/from16 v2, v33

    invoke-static/range {v5 .. v29}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v26

    invoke-virtual/range {p0 .. p0}, Lmj0/e;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lmj0/e;->d()I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Lmj0/e;->c()Lnj0/f;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " \u00b7 rssi="

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " \u00b7 "

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const v6, 0x3f19999a    # 0.6f

    invoke-static {v0, v14, v1, v6}, Lev/n;->f(Lx81/d;Lp1/q;IF)J

    move-result-wide v7

    const/16 v0, 0xc

    invoke-static {v0}, Lv63/c;->h(I)J

    move-result-wide v9

    const v29, 0x1fff2

    const/4 v6, 0x0

    const/4 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v27, 0xc00

    invoke-static/range {v5 .. v29}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v26

    invoke-virtual {v14, v2}, Lp1/q;->q(Z)V

    sget-object v0, Lvx0/b;->a:Lvx0/b;

    invoke-virtual {v0}, Lvx0/b;->t()Lkotlin/jvm/functions/Function3;

    move-result-object v13

    shr-int/lit8 v0, p3, 0x6

    and-int/lit8 v0, v0, 0xe

    const/high16 v1, 0x30000000

    or-int/2addr v0, v1

    shl-int/lit8 v1, p3, 0x3

    and-int/lit16 v1, v1, 0x380

    or-int v15, v0, v1

    const/16 v16, 0x1fa

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v7, p1

    move-object v5, v3

    invoke-static/range {v5 .. v16}, Ldt/b;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/q1;Li2/a1;Lf0/t;Lg1/u0;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14, v2}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_f
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_b
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_10

    new-instance v0, Lsg2/o;

    const/4 v5, 0x5

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v5}, Lsg2/o;-><init>(Ljava/lang/Object;ZLjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final o(Lmj0/e;ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lvx0/c;->n(Lmj0/e;ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lft0/b;ZZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft0/b;",
            "ZZ",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move/from16 v2, p1

    move/from16 v5, p5

    move-object/from16 v12, p4

    check-cast v12, Lp1/q;

    const v0, 0x37de397a

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    move-object/from16 v1, p0

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v3, v5, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit16 v3, v5, 0x180

    if-nez v3, :cond_5

    move/from16 v3, p2

    invoke-virtual {v12, v3}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v0, v4

    goto :goto_4

    :cond_5
    move/from16 v3, p2

    :goto_4
    and-int/lit16 v4, v5, 0xc00

    if-nez v4, :cond_7

    move-object/from16 v4, p3

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x800

    goto :goto_5

    :cond_6
    const/16 v6, 0x400

    :goto_5
    or-int/2addr v0, v6

    goto :goto_6

    :cond_7
    move-object/from16 v4, p3

    :goto_6
    and-int/lit16 v6, v0, 0x493

    const/16 v7, 0x492

    const/4 v8, 0x0

    if-eq v6, v7, :cond_8

    const/4 v6, 0x1

    goto :goto_7

    :cond_8
    move v6, v8

    :goto_7
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v12, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-interface {v1}, Lft0/b;->getState()Lec3/f2;

    move-result-object v6

    invoke-static {v6, v12, v8}, Lp1/x;->o(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v31

    sget-object v6, Lb2/t;->w:Lb2/t;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v10, Lb2/e;->K:Lb2/l;

    const/16 v11, 0x8

    int-to-float v11, v11

    invoke-static {v11}, Ll0/m;->i(F)Ll0/k;

    move-result-object v11

    const/16 v13, 0x36

    invoke-static {v11, v10, v12, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v10

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v12, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_9

    invoke-virtual {v12, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_9
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_8
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v12, v15, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v12, v10, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-nez v8, :cond_a

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b

    :cond_a
    invoke-static {v11, v12, v11, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v12, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v1, v7

    const-wide/16 v17, 0x0

    cmpl-double v1, v1, v17

    if-lez v1, :cond_c

    goto :goto_9

    :cond_c
    const-string v1, "invalid weight; must be greater than zero"

    invoke-static {v1}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_9
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v2, 0x1

    invoke-direct {v1, v7, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    const/4 v9, 0x0

    invoke-static {v6, v7, v12, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v2, v12, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v12, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v7, v12, Lp1/q;->S:Z

    if-eqz v7, :cond_d

    invoke-virtual {v12, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_d
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v12, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v12, Lp1/q;->S:Z

    if-nez v3, :cond_e

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    :cond_e
    invoke-static {v2, v12, v2, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v12, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-interface/range {p0 .. p0}, Lft0/b;->a()Ljava/lang/String;

    move-result-object v1

    if-eqz p1, :cond_10

    const-string v2, " (primary)"

    goto :goto_b

    :cond_10
    const-string v2, ""

    :goto_b
    invoke-static {v1, v2}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v12, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v8

    sget-object v13, Lp3/r;->G:Lp3/r;

    const/16 v3, 0xe

    invoke-static {v3}, Lv63/c;->h(I)J

    move-result-wide v10

    const/16 v29, 0x0

    const v30, 0x1ffd2

    const/4 v7, 0x0

    move-object/from16 v27, v12

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x1

    const-wide/16 v15, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const-wide/16 v19, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v26, v25

    const/16 v25, 0x0

    move/from16 v28, v26

    const/16 v26, 0x0

    move/from16 v32, v28

    const v28, 0x30c00

    move/from16 p4, v3

    move/from16 v3, v32

    invoke-static/range {v6 .. v30}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v27

    invoke-interface/range {p0 .. p0}, Lft0/b;->getProtocol()Lnj0/f;

    move-result-object v6

    invoke-static/range {v31 .. v31}, Lvx0/c;->q(Lp1/t2;)Lmj0/c;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " \u00b7 state="

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const v7, 0x3f19999a    # 0.6f

    invoke-static {v1, v12, v2, v7}, Lev/n;->f(Lx81/d;Lp1/q;IF)J

    move-result-wide v8

    const/16 v1, 0xc

    invoke-static {v1}, Lv63/c;->h(I)J

    move-result-wide v10

    const v30, 0x1fff2

    const/4 v7, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v28, 0xc00

    invoke-static/range {v6 .. v30}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v27

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    sget-object v1, Lvx0/b;->a:Lvx0/b;

    invoke-virtual {v1}, Lvx0/b;->p()Lkotlin/jvm/functions/Function3;

    move-result-object v11

    shr-int/lit8 v1, v0, 0x9

    and-int/lit8 v1, v1, 0xe

    const/high16 v2, 0x30000000

    or-int/2addr v1, v2

    and-int/lit16 v0, v0, 0x380

    or-int v13, v1, v0

    const/16 v14, 0x1fa

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v8, p2

    move-object v6, v4

    invoke-static/range {v6 .. v14}, Ldt/b;->c(Lc93/a;Landroidx/compose/ui/Modifier;ZLf0/t;Lg1/m1;Lkotlin/jvm/functions/Function3;Lp1/q;II)V

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_11
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_c
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_12

    new-instance v0, Lg40/s0;

    const/4 v6, 0x1

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    invoke-direct/range {v0 .. v6}, Lg40/s0;-><init>(Ljava/lang/Object;ZZLjava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final q(Lp1/t2;)Lmj0/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lmj0/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmj0/c;

    return-object p0
.end method

.method private static final r(Lft0/b;ZZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lvx0/c;->p(Lft0/b;ZZLc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Landroidx/compose/runtime/Composer;I)V
    .locals 13

    move-object v10, p0

    check-cast v10, Lp1/q;

    const p0, -0x5b69a44e

    invoke-virtual {v10, p0}, Lp1/q;->g0(I)Lp1/q;

    const/4 p0, 0x1

    if-eqz p1, :cond_0

    move v0, p0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {v10, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x4

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, p0}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v11, 0x6

    const/16 v12, 0xfe

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    invoke-static/range {v0 .. v12}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lv41/c;

    const/4 v1, 0x7

    invoke-direct {v0, p1, v1}, Lv41/c;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final t(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lvx0/c;->s(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lp1/q;

    const v2, 0x1a2ab1a1

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v5, v2, 0x3

    if-eq v5, v3, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    and-int/lit8 v5, v2, 0x1

    invoke-virtual {v1, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_3

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v3, v1, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v5

    sget-object v7, Lp3/r;->I:Lp3/r;

    const/16 v3, 0x10

    invoke-static {v3}, Lv63/c;->h(I)J

    move-result-wide v8

    int-to-float v12, v4

    const/4 v13, 0x0

    const/4 v15, 0x5

    sget-object v10, Lb2/t;->w:Lb2/t;

    const/4 v11, 0x0

    move v14, v12

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    and-int/lit8 v2, v2, 0xe

    const v4, 0x30c30

    or-int v22, v2, v4

    const/16 v23, 0x0

    const v24, 0x1ffd0

    move-object/from16 v21, v1

    move-object v1, v3

    move-wide v2, v5

    const/4 v6, 0x0

    move-wide v4, v8

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v0 .. v24}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    goto :goto_3

    :cond_3
    move-object/from16 v21, v1

    invoke-virtual/range {v21 .. v21}, Lp1/q;->X()V

    :goto_3
    invoke-virtual/range {v21 .. v21}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_4

    new-instance v2, Lcp0/a;

    const/16 v3, 0x19

    move/from16 v4, p2

    invoke-direct {v2, v0, v4, v3}, Lcp0/a;-><init>(Ljava/lang/String;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method private static final v(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lvx0/c;->u(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final w(Lvx0/e;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvx0/e;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v4, p1

    move/from16 v10, p3

    const-string v1, "viewModel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onNavigateBack"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v1, -0xd7fbbe8

    invoke-virtual {v7, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v10, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v10

    goto :goto_1

    :cond_1
    move v1, v10

    :goto_1
    and-int/lit8 v2, v10, 0x30

    const/16 v11, 0x10

    if-nez v2, :cond_3

    invoke-virtual {v7, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    move v2, v11

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    const/4 v5, 0x0

    const/4 v12, 0x1

    if-eq v2, v3, :cond_4

    move v2, v12

    goto :goto_3

    :cond_4
    move v2, v5

    :goto_3
    and-int/lit8 v3, v1, 0x1

    invoke-virtual {v7, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-virtual {v0}, Lvx0/e;->l()Lec3/f2;

    move-result-object v2

    invoke-static {v2, v7, v5}, Lp1/x;->o(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v13

    const/high16 v14, 0x3f800000    # 1.0f

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v15}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v6, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v6, v7, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v7, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-eqz v9, :cond_5

    invoke-virtual {v7, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_4
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v7, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v7, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-nez v6, :cond_6

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    :cond_6
    invoke-static {v5, v7, v5, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v7, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v16, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    const-string v2, "WHOOP BLE DEBUG"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/w;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    const v33, 0xfffa

    const/16 v34, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-direct/range {v16 .. v34}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v2, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v2, v2, 0x3

    shl-int/lit8 v1, v1, 0x6

    and-int/lit16 v1, v1, 0x1c00

    or-int v8, v2, v1

    const/16 v9, 0x35

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v2, v16

    invoke-static/range {v1 .. v9}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v14, v15}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    int-to-float v2, v11

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/16 v1, 0xc

    int-to-float v1, v1

    invoke-static {v1}, Ll0/m;->i(F)Ll0/k;

    move-result-object v14

    invoke-virtual {v7, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_8

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_9

    :cond_8
    new-instance v2, Lum0/b;

    const/16 v1, 0x10

    invoke-direct {v2, v1, v13, v0}, Lum0/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object/from16 v19, v2

    check-cast v19, Lkotlin/jvm/functions/Function1;

    const/16 v21, 0x6006

    const/16 v22, 0x1ee

    move v1, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v20, v7

    invoke-static/range {v11 .. v22}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_a
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_b

    new-instance v2, Lv90/e;

    const/16 v3, 0xa

    invoke-direct {v2, v0, v4, v10, v3}, Lv90/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final x(Lp1/t2;)Lvx0/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lvx0/d;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lvx0/d;

    return-object p0
.end method

.method private static final y(Lp1/t2;Lvx0/e;Ln0/q;)Ll83/a0;
    .locals 10

    const-string v0, "$this$LazyColumn"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lvx0/b;->a:Lvx0/b;

    invoke-virtual {v0}, Lvx0/b;->o()Lkotlin/jvm/functions/Function3;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-static {p2, v2, v1, v3}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    new-instance v1, Lgt1/o;

    const/4 v4, 0x1

    invoke-direct {v1, p0, v4}, Lgt1/o;-><init>(Lp1/t2;I)V

    new-instance v4, Lx1/b;

    const/4 v5, 0x1

    const v6, 0x3facb6d6    # 1.3493297f

    invoke-direct {v4, v1, v5, v6}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p2, v2, v4, v3}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    invoke-virtual {v0}, Lvx0/b;->s()Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-static {p2, v2, v1, v3}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    new-instance v1, Lgt1/o;

    const/4 v4, 0x2

    invoke-direct {v1, p0, v4}, Lgt1/o;-><init>(Lp1/t2;I)V

    new-instance v4, Lx1/b;

    const v6, -0x54e8dfec

    invoke-direct {v4, v1, v5, v6}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p2, v2, v4, v3}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    invoke-static {p0}, Lvx0/c;->x(Lp1/t2;)Lvx0/d;

    move-result-object v1

    invoke-virtual {v1}, Lvx0/d;->e()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const v4, 0x2fd4df92

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lvx0/b;->k()Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-static {p2, v2, v1, v3}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lvx0/c;->x(Lp1/t2;)Lvx0/d;

    move-result-object v1

    invoke-virtual {v1}, Lvx0/d;->e()Ljava/util/List;

    move-result-object v1

    new-instance v6, Lvs2/d;

    const/16 v7, 0x10

    invoke-direct {v6, v7}, Lvs2/d;-><init>(I)V

    sget-object v7, Lvx0/c$e;->w:Lvx0/c$e;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v8

    new-instance v9, Lvx0/c$f;

    invoke-direct {v9, v6, v1}, Lvx0/c$f;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v6, Lvx0/c$g;

    invoke-direct {v6, v7, v1}, Lvx0/c$g;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v7, Lvx0/c$h;

    invoke-direct {v7, v1, p1, p0}, Lvx0/c$h;-><init>(Ljava/util/List;Lvx0/e;Lp1/t2;)V

    new-instance v1, Lx1/b;

    invoke-direct {v1, v7, v5, v4}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    move-object v7, p2

    check-cast v7, Ln0/f;

    invoke-virtual {v7, v8, v9, v6, v1}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    :goto_0
    invoke-virtual {v0}, Lvx0/b;->n()Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-static {p2, v2, v1, v3}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    new-instance v1, Lvv2/d;

    const/4 v6, 0x1

    invoke-direct {v1, v6, p1, p0}, Lvv2/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Lx1/b;

    const v7, 0x16818952

    invoke-direct {v6, v1, v5, v7}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p2, v2, v6, v3}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    invoke-virtual {v0}, Lvx0/b;->r()Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-static {p2, v2, v1, v3}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    new-instance v1, Lgt1/o;

    const/4 v6, 0x3

    invoke-direct {v1, p0, v6}, Lgt1/o;-><init>(Lp1/t2;I)V

    new-instance v6, Lx1/b;

    const v7, -0x7e140d70

    invoke-direct {v6, v1, v5, v7}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p2, v2, v6, v3}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    invoke-static {p0}, Lvx0/c;->x(Lp1/t2;)Lvx0/d;

    move-result-object v1

    invoke-virtual {v1}, Lvx0/d;->d()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance p1, Lgt1/o;

    const/4 v1, 0x4

    invoke-direct {p1, p0, v1}, Lgt1/o;-><init>(Lp1/t2;I)V

    new-instance p0, Lx1/b;

    const v1, -0x472a06e5

    invoke-direct {p0, p1, v5, v1}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p2, v2, p0, v3}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    goto :goto_1

    :cond_1
    invoke-static {p0}, Lvx0/c;->x(Lp1/t2;)Lvx0/d;

    move-result-object v1

    invoke-virtual {v1}, Lvx0/d;->d()Ljava/util/List;

    move-result-object v1

    new-instance v6, Lvs2/d;

    const/16 v7, 0x11

    invoke-direct {v6, v7}, Lvs2/d;-><init>(I)V

    sget-object v7, Lvx0/c$i;->w:Lvx0/c$i;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v8

    new-instance v9, Lvx0/c$j;

    invoke-direct {v9, v6, v1}, Lvx0/c$j;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v6, Lvx0/c$k;

    invoke-direct {v6, v7, v1}, Lvx0/c$k;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v7, Lvx0/c$l;

    invoke-direct {v7, v1, p1, p0}, Lvx0/c$l;-><init>(Ljava/util/List;Lvx0/e;Lp1/t2;)V

    new-instance p0, Lx1/b;

    invoke-direct {p0, v7, v5, v4}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    move-object p1, p2

    check-cast p1, Ln0/f;

    invoke-virtual {p1, v8, v9, v6, p0}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    :goto_1
    invoke-virtual {v0}, Lvx0/b;->l()Lkotlin/jvm/functions/Function3;

    move-result-object p0

    invoke-static {p2, v2, p0, v3}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lp1/t2;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 29

    const-string v0, "$this$item"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v2, p2

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "Primary sensor"

    const/4 v1, 0x6

    invoke-static {v0, v2, v1}, Lvx0/c;->u(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static/range {p0 .. p0}, Lvx0/c;->x(Lp1/t2;)Lvx0/d;

    move-result-object v0

    invoke-virtual {v0}, Lvx0/d;->f()Lft0/a;

    move-result-object v0

    const/16 v1, 0xe

    if-nez v0, :cond_1

    const v0, -0x1c0cfaa5

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v0, v2, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v6

    invoke-static {v1}, Lv63/c;->h(I)J

    move-result-wide v8

    const/16 v27, 0x0

    const v28, 0x1fff2

    const-string v4, "None"

    const/4 v5, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0xc06

    move-object/from16 v25, v2

    invoke-static/range {v4 .. v28}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_1
    const v4, -0x1c09aa81

    invoke-virtual {v2, v4}, Lp1/q;->e0(I)V

    invoke-interface {v0}, Lft0/b;->getState()Lec3/f2;

    move-result-object v4

    invoke-static {v4, v2, v3}, Lp1/x;->o(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v4

    invoke-interface {v0}, Lft0/b;->a()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0}, Lft0/b;->getProtocol()Lnj0/f;

    move-result-object v0

    invoke-static {v4}, Lvx0/c;->A(Lp1/t2;)Lmj0/c;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " \u00b7 "

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v0, v2, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v6

    invoke-static {v1}, Lv63/c;->h(I)J

    move-result-wide v8

    const/16 v27, 0x0

    const v28, 0x1fff2

    const/4 v5, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0xc00

    move-object/from16 v25, v2

    invoke-static/range {v4 .. v28}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
