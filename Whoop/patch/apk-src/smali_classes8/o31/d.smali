.class public abstract Lo31/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a3\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000e\u00b2\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\r\u001a\u00020\u000c8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lo31/e;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onEvent",
        "d",
        "(Landroidx/compose/ui/Modifier;Lo31/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "",
        "searchQuery",
        "",
        "hasReportedFocus",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lo31/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lo31/d;->k(Landroidx/compose/ui/Modifier;Lo31/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lp1/c1;Lo31/e;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lo31/d;->j(Lkotlin/jvm/functions/Function1;Lp1/c1;Lo31/e;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lo31/e;Lp1/c1;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lo31/d;->i(Lo31/e;Lp1/c1;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lo31/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lo31/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "modifier"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v5, -0x4f696c40

    invoke-virtual {v0, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    and-int/lit16 v6, v4, 0x180

    const/16 v7, 0x100

    if-nez v6, :cond_5

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    move v6, v7

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    :cond_5
    and-int/lit16 v6, v5, 0x93

    const/16 v8, 0x92

    const/4 v10, 0x1

    if-eq v6, v8, :cond_6

    move v6, v10

    goto :goto_4

    :cond_6
    const/4 v6, 0x0

    :goto_4
    and-int/lit8 v8, v5, 0x1

    invoke-virtual {v0, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_12

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v6, v8, :cond_7

    const-string v6, ""

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v6, Lp1/c1;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v8, :cond_8

    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v11}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v11

    invoke-virtual {v0, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v11, Lp1/c1;

    invoke-static {v6}, Lo31/d;->e(Lp1/c1;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    and-int/lit16 v5, v5, 0x380

    if-ne v5, v7, :cond_9

    move v14, v10

    goto :goto_5

    :cond_9
    const/4 v14, 0x0

    :goto_5
    or-int/2addr v13, v14

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v13, :cond_a

    if-ne v14, v8, :cond_b

    :cond_a
    new-instance v14, Lo31/d$a;

    const/4 v13, 0x0

    invoke-direct {v14, v2, v6, v3, v13}, Lo31/d$a;-><init>(Lo31/e;Lp1/c1;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v0, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v14, Lc93/m;

    invoke-static {v0, v14, v12}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-static {v6}, Lo31/d;->e(Lp1/c1;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v2}, Lo31/e;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v2}, Lo31/e;->a()Ljava/lang/Integer;

    move-result-object v15

    invoke-virtual {v2}, Lo31/e;->b()I

    move-result v16

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-ne v5, v7, :cond_c

    move/from16 v18, v10

    goto :goto_6

    :cond_c
    const/16 v18, 0x0

    :goto_6
    or-int v17, v17, v18

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v17, :cond_d

    if-ne v9, v8, :cond_e

    :cond_d
    new-instance v9, Lo31/c;

    invoke-direct {v9, v2, v11, v3}, Lo31/c;-><init>(Lo31/e;Lp1/c1;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object/from16 v20, v9

    check-cast v20, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-ne v5, v7, :cond_f

    goto :goto_7

    :cond_f
    const/4 v10, 0x0

    :goto_7
    or-int v5, v9, v10

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_10

    if-ne v7, v8, :cond_11

    :cond_10
    new-instance v7, Lo31/c;

    invoke-direct {v7, v3, v6, v2}, Lo31/c;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;Lo31/e;)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object/from16 v21, v7

    check-cast v21, Lkotlin/jvm/functions/Function1;

    const/16 v24, 0x180

    const/16 v25, 0xfd0

    const-wide/16 v9, 0x0

    move-object v5, v12

    const/4 v12, 0x0

    move-object v6, v13

    const/4 v13, 0x0

    move-object v7, v14

    move-object v8, v15

    const-wide/16 v14, 0x0

    move/from16 v11, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v23, 0x0

    move-object/from16 v22, v0

    invoke-static/range {v5 .. v25}, Lhy0/v0;->j(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;JIZLg1/e8;JZLn0/u;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    goto :goto_8

    :cond_12
    move-object/from16 v22, v0

    invoke-virtual/range {v22 .. v22}, Lp1/q;->X()V

    :goto_8
    invoke-virtual/range {v22 .. v22}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_13

    new-instance v0, Lnx1/g;

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lnx1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ll83/e;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final e(Lp1/c1;)Ljava/lang/String;
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

.method private static final f(Lp1/c1;Ljava/lang/String;)V
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

.method private static final g(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final h(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final i(Lo31/e;Lp1/c1;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    if-nez p3, :cond_0

    const/4 p0, 0x0

    invoke-static {p1, p0}, Lo31/d;->h(Lp1/c1;Z)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lo31/d;->g(Lp1/c1;)Z

    move-result p3

    if-nez p3, :cond_1

    invoke-virtual {p0}, Lo31/e;->e()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p0

    if-eqz p0, :cond_1

    const/4 p3, 0x1

    invoke-static {p1, p3}, Lo31/d;->h(Lp1/c1;Z)V

    const/4 p1, 0x0

    invoke-static {p1, p0, p2}, Lev/n;->y(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;)V

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Lp1/c1;Lo31/e;Ljava/lang/Object;)Ll83/a0;
    .locals 4

    const-string v0, "event"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p3, Lhy0/x0$a;

    if-eqz v0, :cond_0

    const-string p0, ""

    invoke-static {p1, p0}, Lo31/d;->f(Lp1/c1;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    instance-of v0, p3, Lhy0/x0$c;

    if-eqz v0, :cond_5

    check-cast p3, Lhy0/x0$c;

    invoke-virtual {p3}, Lhy0/x0$c;->a()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2}, Lo31/e;->b()I

    move-result p3

    const/4 v0, 0x3

    if-ne p3, v0, :cond_3

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->isDigit(C)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p3, v2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_3
    invoke-virtual {p2}, Lo31/e;->c()Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-static {p2, p0}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_4
    invoke-static {p1, p0}, Lo31/d;->f(Lp1/c1;Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    invoke-interface {p0, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Landroidx/compose/ui/Modifier;Lo31/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lo31/d;->d(Landroidx/compose/ui/Modifier;Lo31/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic l(Lp1/c1;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lo31/d;->e(Lp1/c1;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
