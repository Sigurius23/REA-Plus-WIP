.class public abstract Ljr1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lgr1/q;",
        "viewState",
        "Lkotlin/Function1;",
        "Lgr1/n;",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Lgr1/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "integrations_release"
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljr1/b;->d(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lgr1/q;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ljr1/b;->e(Lgr1/q;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lgr1/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgr1/q;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onViewEvent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, 0x64e7a750

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v2, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v5, v2, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_3

    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v6

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit8 v5, v4, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eq v5, v7, :cond_4

    move v5, v8

    goto :goto_3

    :cond_4
    move v5, v9

    :goto_3
    and-int/lit8 v7, v4, 0x1

    invoke-virtual {v3, v7, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-virtual {v0}, Lgr1/q;->g()Lgr1/k;

    move-result-object v5

    if-eqz v5, :cond_5

    const v4, 0x69c9fd10

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-virtual {v0}, Lgr1/q;->g()Lgr1/k;

    move-result-object v5

    invoke-virtual {v5}, Lgr1/k;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v6, Lsz0/p0$c;->f:I

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v7, v7, 0x3

    or-int v17, v6, v7

    const/16 v18, 0x0

    const/16 v19, 0xffc

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v20, v16

    move-object/from16 v16, v3

    move/from16 v3, v20

    invoke-static/range {v4 .. v19}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v16

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    goto/16 :goto_5

    :cond_5
    move-object v5, v3

    move v3, v9

    invoke-virtual {v0}, Lgr1/q;->i()Z

    move-result v7

    if-eqz v7, :cond_9

    const v7, 0x69cd0600

    invoke-virtual {v5, v7}, Lp1/q;->e0(I)V

    new-instance v9, Lsz0/p0$b;

    sget v7, Lzq1/b;->i:I

    invoke-static {v7}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v10

    const/4 v13, 0x6

    const/4 v14, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v10, Lzq1/b;->h:I

    invoke-static {v10}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v10

    and-int/lit8 v4, v4, 0x70

    if-ne v4, v6, :cond_6

    goto :goto_4

    :cond_6
    move v8, v3

    :goto_4
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v8, :cond_7

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v4, v6, :cond_8

    :cond_7
    new-instance v4, Ljp1/l;

    const/4 v6, 0x5

    invoke-direct {v4, v1, v6}, Ljp1/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v8, v4

    check-cast v8, Lc93/a;

    sget v4, Lsz0/p0$b;->h:I

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v6, 0x3

    or-int/2addr v4, v6

    sget v6, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v6, v6, 0x9

    or-int v17, v4, v6

    const/16 v18, 0x0

    const/16 v19, 0xfe4

    const/4 v6, 0x0

    move-object v4, v9

    const/4 v9, 0x0

    move-object/from16 v16, v5

    move-object v5, v7

    move-object v7, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v4 .. v19}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v16

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_9
    invoke-virtual {v0}, Lgr1/q;->h()Lgr1/m;

    move-result-object v4

    if-eqz v4, :cond_a

    const v4, 0x69d39e2b

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    new-instance v4, Lsz0/p0$h;

    sget v6, Lzq1/b;->j:I

    invoke-static {v6}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v7

    const/4 v11, 0x6

    const/4 v12, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    move-object v6, v4

    invoke-direct/range {v6 .. v12}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lgr1/q;->h()Lgr1/m;

    move-result-object v6

    invoke-virtual {v6}, Lgr1/m;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v7, Lsz0/p0$h;->h:I

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v8, v8, 0x3

    or-int v17, v7, v8

    const/16 v18, 0x0

    const/16 v19, 0xffc

    move-object/from16 v16, v5

    move-object v5, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v4 .. v19}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v16

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_a
    const v4, 0x69d71892

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_b
    move-object v5, v3

    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_c

    new-instance v4, Lig0/d;

    const/16 v5, 0xd

    invoke-direct {v4, v0, v1, v2, v5}, Lig0/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lgr1/n$h;->a:Lgr1/n$h;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lgr1/q;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Ljr1/b;->c(Lgr1/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
