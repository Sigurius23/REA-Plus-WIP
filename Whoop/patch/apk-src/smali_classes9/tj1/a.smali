.class public abstract Ltj1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "",
        "isConnected",
        "Lkotlin/Function1;",
        "Lnj1/a;",
        "Ll83/a0;",
        "onClick",
        "c",
        "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "health-connect_release"
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
.method public static synthetic a(ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ltj1/a;->e(ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ltj1/a;->d(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "onClick"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    const v3, 0x1629fbba

    invoke-virtual {v13, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v13, v0}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v5, v2, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_3

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v6

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit8 v5, v3, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v5, v7, :cond_4

    move v5, v9

    goto :goto_3

    :cond_4
    move v5, v8

    :goto_3
    and-int/lit8 v7, v3, 0x1

    invoke-virtual {v13, v7, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_b

    if-eqz v0, :cond_5

    sget v5, Lgj1/b;->c:I

    goto :goto_4

    :cond_5
    sget v5, Lgj1/b;->b:I

    :goto_4
    if-eqz v0, :cond_6

    const v7, 0x339a2124

    invoke-virtual {v13, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-static {v7, v13, v10, v8}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v10

    goto :goto_5

    :cond_6
    const v7, 0x339a2566

    invoke-virtual {v13, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v7, v13, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->a()J

    move-result-wide v10

    invoke-virtual {v13, v8}, Lp1/q;->q(Z)V

    :goto_5
    sget-object v7, Lny0/v;->TextLarge:Lny0/v;

    invoke-static {v5, v13, v8}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v12, Lb2/t;->w:Lb2/t;

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/4 v14, 0x5

    int-to-float v14, v14

    const/16 v15, 0x8

    int-to-float v15, v15

    mul-float/2addr v14, v15

    invoke-static {v14, v12}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    int-to-float v12, v9

    mul-float v20, v12, v15

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v12

    and-int/lit8 v14, v3, 0x70

    if-ne v14, v6, :cond_7

    move v6, v9

    goto :goto_6

    :cond_7
    move v6, v8

    :goto_6
    and-int/lit8 v3, v3, 0xe

    if-ne v3, v4, :cond_8

    move v8, v9

    :cond_8
    or-int v3, v6, v8

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_9

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v4, v3, :cond_a

    :cond_9
    new-instance v4, Lbv2/b;

    const/16 v3, 0xa

    invoke-direct {v4, v1, v0, v3}, Lbv2/b;-><init>(Lkotlin/jvm/functions/Function1;ZI)V

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v4, Lc93/a;

    const/16 v14, 0x36

    const/16 v15, 0x68

    move-object v6, v5

    move-object v5, v7

    const/4 v7, 0x0

    move-wide v8, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v22, v12

    move-object v12, v4

    move-object/from16 v4, v22

    invoke-static/range {v4 .. v15}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_7

    :cond_b
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_c

    new-instance v4, Lih2/a;

    const/4 v5, 0x3

    invoke-direct {v4, v0, v1, v2, v5}, Lih2/a;-><init>(ZLkotlin/jvm/functions/Function1;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    if-eqz p1, :cond_0

    sget-object p1, Lnj1/a$c;->a:Lnj1/a$c;

    goto :goto_0

    :cond_0
    sget-object p1, Lnj1/a$b;->a:Lnj1/a$b;

    :goto_0
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Ltj1/a;->c(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
