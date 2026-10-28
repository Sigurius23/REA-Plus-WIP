.class public abstract Lsl0/s3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u0081\u0001\u0010\u0011\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00032\u0014\u0008\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u00082\u0014\u0008\u0002\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u00082\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\rH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a1\u0010\u0019\u001a\u00020\u0006*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0017H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001c\u00b2\u0006\u000e\u0010\u001b\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Ll0/y;",
        "Lnl0/f;",
        "viewState",
        "Lkotlin/Function2;",
        "",
        "Lcom/whoop/bot/models/feedback/AiMessageFeedback;",
        "Ll83/a0;",
        "onFeedbackClicked",
        "Lkotlin/Function1;",
        "Lnl0/d;",
        "onViewEvent",
        "Lml0/a;",
        "onNavigationEvent",
        "",
        "isFromWrapper",
        "isWceLoading",
        "suppressAutoScroll",
        "t",
        "(Ll0/y;Lnl0/f;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZLandroidx/compose/runtime/Composer;II)V",
        "Ll0/u;",
        "",
        "threshold",
        "currentValue",
        "Lkotlin/Function0;",
        "onClick",
        "n",
        "(Ll0/u;IILc93/a;Landroidx/compose/runtime/Composer;I)V",
        "isVisible",
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
.method private static final A(Lnl0/d;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lml0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lbc3/c0;Lf0/r1;)Ll83/a0;
    .locals 2

    new-instance v0, Lsl0/s3$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lsl0/s3$c;-><init>(Lf0/r1;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Ll0/y;Lnl0/f;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v11, p9

    move-object/from16 v9, p10

    invoke-static/range {v1 .. v11}, Lsl0/s3;->t(Ll0/y;Lnl0/f;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic E(Lp1/c1;)Z
    .locals 0

    invoke-static {p0}, Lsl0/s3;->o(Lp1/c1;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic F(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lsl0/s3;->p(Lp1/c1;Z)V

    return-void
.end method

.method public static synthetic a(Lbc3/c0;Lf0/r1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsl0/s3;->C(Lbc3/c0;Lf0/r1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lsl0/s3;->q(Lc93/a;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lsl0/y0;Lnl0/f;Lh51/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lsl0/s3;->x(Lsl0/y0;Lnl0/f;Lh51/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ll0/y;Lnl0/f;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p11}, Lsl0/s3;->D(Ll0/y;Lnl0/f;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lnl0/d;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/s3;->A(Lnl0/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lnl0/d;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/s3;->u(Lnl0/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lml0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/s3;->v(Lml0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ll0/u;IILc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lsl0/s3;->s(Ll0/u;IILc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/s3;->r(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/whoop/bot/models/feedback/AiFeedbackType;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/s3;->z(Lcom/whoop/bot/models/feedback/AiFeedbackType;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lml0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/s3;->B(Lml0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/s3;->w(Lk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/whoop/data/repositories/FeatureFlagChecker;Lnl0/c;Lb3/x2;Lc93/m;Lcom/whoop/bot/models/feedback/AiFeedbackType;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lsl0/s3;->y(Lcom/whoop/data/repositories/FeatureFlagChecker;Lnl0/c;Lb3/x2;Lc93/m;Lcom/whoop/bot/models/feedback/AiFeedbackType;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Ll0/u;IILc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll0/u;",
            "II",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    const-string v0, "<this>"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p4

    check-cast v12, Lp1/q;

    const v0, 0x17023b93

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

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
    and-int/lit8 v7, v5, 0x30

    const/16 v8, 0x20

    if-nez v7, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->e(I)Z

    move-result v7

    if-eqz v7, :cond_2

    move v7, v8

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :cond_3
    and-int/lit16 v7, v5, 0x180

    const/16 v9, 0x100

    if-nez v7, :cond_5

    invoke-virtual {v12, v3}, Lp1/q;->e(I)Z

    move-result v7

    if-eqz v7, :cond_4

    move v7, v9

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v0, v7

    :cond_5
    and-int/lit16 v7, v5, 0xc00

    if-nez v7, :cond_7

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v0, v7

    :cond_7
    and-int/lit16 v7, v0, 0x493

    const/16 v10, 0x492

    const/4 v11, 0x0

    const/4 v13, 0x1

    if-eq v7, v10, :cond_8

    move v7, v13

    goto :goto_5

    :cond_8
    move v7, v11

    :goto_5
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v12, v10, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_e

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v7, v10, :cond_9

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v7, Lp1/c1;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    and-int/lit16 v6, v0, 0x380

    if-ne v6, v9, :cond_a

    move v6, v13

    goto :goto_6

    :cond_a
    move v6, v11

    :goto_6
    and-int/lit8 v0, v0, 0x70

    if-ne v0, v8, :cond_b

    move v0, v13

    goto :goto_7

    :cond_b
    move v0, v11

    :goto_7
    or-int/2addr v0, v6

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    const/4 v8, 0x0

    if-nez v0, :cond_c

    if-ne v6, v10, :cond_d

    :cond_c
    new-instance v6, Lsl0/s3$a;

    invoke-direct {v6, v3, v2, v7, v8}, Lsl0/s3$a;-><init>(IILp1/c1;Lq83/d;)V

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v6, Lc93/m;

    invoke-static {v14, v15, v6, v12}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    sget-object v0, Lb2/t;->w:Lb2/t;

    const-string v6, "ScrollToBottomArrow"

    invoke-static {v0, v6}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, Lb2/e;->H:Lb2/m;

    invoke-interface {v1, v0, v6}, Ll0/u;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    int-to-float v0, v13

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float v18, v0, v6

    const/16 v19, 0x7

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v7}, Lsl0/s3;->o(Lp1/c1;)Z

    move-result v6

    const/16 v7, 0x1f4

    const/4 v9, 0x6

    invoke-static {v7, v11, v8, v9}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v10

    const/4 v13, 0x2

    invoke-static {v10, v13}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v10

    invoke-static {v7, v11, v8, v9}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v7

    invoke-static {v7, v13}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v9

    new-instance v7, Lsl0/r0;

    const/4 v8, 0x4

    invoke-direct {v7, v4, v8}, Lsl0/r0;-><init>(Ljava/lang/Object;I)V

    const v8, 0x365455bb

    invoke-static {v8, v12, v7}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    const v13, 0x30d80

    const/16 v14, 0x10

    move-object v8, v10

    const/4 v10, 0x0

    move-object v7, v0

    invoke-static/range {v6 .. v14}, Landroidx/compose/animation/b;->f(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_8

    :cond_e
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_f

    new-instance v0, Lph1/h;

    invoke-direct/range {v0 .. v5}, Lph1/h;-><init>(Ll0/u;IILc93/a;I)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final o(Lp1/c1;)Z
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

.method private static final p(Lp1/c1;Z)V
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

.method private static final q(Lc93/a;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    const-string p3, "$this$AnimatedVisibility"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p1, 0x8

    int-to-float p1, p1

    const/4 p3, 0x4

    int-to-float p3, p3

    mul-float/2addr p1, p3

    sget-object v0, Lb2/t;->w:Lb2/t;

    invoke-static {p1, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    new-instance v2, Lj0/j;

    invoke-direct {v2}, Lj0/j;-><init>()V

    move-object v8, p2

    check-cast v8, Lp1/q;

    invoke-virtual {v8, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_0

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne p2, p1, :cond_1

    :cond_0
    new-instance p2, Lsl0/a;

    const/16 p1, 0xe

    invoke-direct {p2, p0, p1}, Lsl0/a;-><init>(Lc93/a;I)V

    invoke-virtual {v8, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v6, p2

    check-cast v6, Lc93/a;

    const/16 v7, 0x1c

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    sget-object p1, Lx81/d;->a:Lx81/d;

    sget p2, Lx81/d;->b:I

    invoke-virtual {p1, v8, p2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v1

    sget-object v3, Lt0/j;->a:Lt0/i;

    invoke-static {p0, v1, v2, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    sget-object v1, Lb2/e;->w:Lb2/m;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v3, v8, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v8, p0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v6, v8, Lp1/q;->S:Z

    if-eqz v6, :cond_2

    invoke-virtual {v8, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_0
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v8, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v8, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-nez v4, :cond_3

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    :cond_3
    invoke-static {v3, v8, v3, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v8, v1, p0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p0, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    sget-object v1, Lb2/e;->E:Lb2/m;

    invoke-virtual {p0, v0, v1}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/high16 v0, 0x43340000    # 180.0f

    invoke-static {v0, p0}, Landroidx/room/c1;->L(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    mul-float/2addr p3, p3

    invoke-static {p3, p0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {p1}, Lx81/d;->d()Lgz0/o0;

    move-result-object p0

    invoke-virtual {p0}, Lgz0/o0;->i()Lgz0/w;

    move-result-object p0

    invoke-virtual {p0}, Lgz0/w;->d()I

    move-result p0

    const/4 p3, 0x6

    invoke-static {p0, v8, p3}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v3

    sget p0, Lwk0/b;->y0:I

    invoke-static {p0, v8, v2}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v8, p2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->w()J

    move-result-wide v6

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 p0, 0x1

    invoke-virtual {v8, p0}, Lp1/q;->q(Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Ll0/u;IILc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lsl0/s3;->n(Ll0/u;IILc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final t(Ll0/y;Lnl0/f;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZLandroidx/compose/runtime/Composer;II)V
    .locals 40
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll0/y;",
            "Lnl0/f;",
            "Lc93/m;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "ZZZ",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    move/from16 v9, p9

    sget-object v10, Lb2/e;->M:Lb2/k;

    const-string v3, "<this>"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "viewState"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onFeedbackClicked"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p8

    check-cast v15, Lp1/q;

    const v3, -0x48e1bb25

    invoke-virtual {v15, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v9, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v9

    goto :goto_1

    :cond_1
    move v3, v9

    :goto_1
    and-int/lit8 v6, v9, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :cond_3
    and-int/lit16 v6, v9, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v3, v6

    :cond_5
    and-int/lit8 v6, p10, 0x4

    if-eqz v6, :cond_7

    or-int/lit16 v3, v3, 0xc00

    :cond_6
    move-object/from16 v8, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v8, v9, 0xc00

    if-nez v8, :cond_6

    move-object/from16 v8, p3

    invoke-virtual {v15, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_8

    const/16 v13, 0x800

    goto :goto_4

    :cond_8
    const/16 v13, 0x400

    :goto_4
    or-int/2addr v3, v13

    :goto_5
    and-int/lit8 v13, p10, 0x8

    if-eqz v13, :cond_a

    or-int/lit16 v3, v3, 0x6000

    :cond_9
    move-object/from16 v11, p4

    goto :goto_7

    :cond_a
    and-int/lit16 v11, v9, 0x6000

    if-nez v11, :cond_9

    move-object/from16 v11, p4

    invoke-virtual {v15, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_b

    const/16 v17, 0x4000

    goto :goto_6

    :cond_b
    const/16 v17, 0x2000

    :goto_6
    or-int v3, v3, v17

    :goto_7
    and-int/lit8 v17, p10, 0x10

    const/high16 v19, 0x30000

    if-eqz v17, :cond_c

    or-int v3, v3, v19

    move/from16 v14, p5

    goto :goto_9

    :cond_c
    and-int v19, v9, v19

    move/from16 v14, p5

    if-nez v19, :cond_e

    invoke-virtual {v15, v14}, Lp1/q;->h(Z)Z

    move-result v20

    if-eqz v20, :cond_d

    const/high16 v20, 0x20000

    goto :goto_8

    :cond_d
    const/high16 v20, 0x10000

    :goto_8
    or-int v3, v3, v20

    :cond_e
    :goto_9
    and-int/lit8 v20, p10, 0x20

    const/high16 v21, 0x180000

    if-eqz v20, :cond_f

    or-int v3, v3, v21

    move/from16 v7, p6

    goto :goto_b

    :cond_f
    and-int v21, v9, v21

    move/from16 v7, p6

    if-nez v21, :cond_11

    invoke-virtual {v15, v7}, Lp1/q;->h(Z)Z

    move-result v22

    if-eqz v22, :cond_10

    const/high16 v22, 0x100000

    goto :goto_a

    :cond_10
    const/high16 v22, 0x80000

    :goto_a
    or-int v3, v3, v22

    :cond_11
    :goto_b
    and-int/lit8 v22, p10, 0x40

    const/high16 v24, 0xc00000

    if-eqz v22, :cond_12

    or-int v3, v3, v24

    move/from16 v4, p7

    goto :goto_d

    :cond_12
    and-int v24, v9, v24

    move/from16 v4, p7

    if-nez v24, :cond_14

    invoke-virtual {v15, v4}, Lp1/q;->h(Z)Z

    move-result v25

    if-eqz v25, :cond_13

    const/high16 v25, 0x800000

    goto :goto_c

    :cond_13
    const/high16 v25, 0x400000

    :goto_c
    or-int v3, v3, v25

    :cond_14
    :goto_d
    const v25, 0x492493

    and-int v5, v3, v25

    const v12, 0x492492

    move/from16 v26, v13

    const/4 v13, 0x1

    const/4 v8, 0x0

    if-eq v5, v12, :cond_15

    move v5, v13

    goto :goto_e

    :cond_15
    move v5, v8

    :goto_e
    and-int/lit8 v12, v3, 0x1

    invoke-virtual {v15, v12, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_46

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_17

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v12, :cond_16

    new-instance v5, Lsl0/h3;

    const/16 v6, 0xb

    invoke-direct {v5, v6}, Lsl0/h3;-><init>(I)V

    invoke-virtual {v15, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v6, v5

    goto :goto_f

    :cond_17
    move-object/from16 v6, p3

    :goto_f
    if-eqz v26, :cond_19

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v12, :cond_18

    new-instance v5, Lsl0/h3;

    const/16 v11, 0xc

    invoke-direct {v5, v11}, Lsl0/h3;-><init>(I)V

    invoke-virtual {v15, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v7, v5

    goto :goto_10

    :cond_19
    move-object v7, v11

    :goto_10
    if-eqz v17, :cond_1a

    move/from16 v17, v8

    goto :goto_11

    :cond_1a
    move/from16 v17, v14

    :goto_11
    if-eqz v20, :cond_1b

    move/from16 v26, v8

    goto :goto_12

    :cond_1b
    move/from16 v26, p6

    :goto_12
    if-eqz v22, :cond_1c

    move v4, v8

    :cond_1c
    invoke-static {v8, v15, v13}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v5

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v12, :cond_1d

    new-instance v11, Lsl0/y0;

    invoke-direct {v11}, Lsl0/y0;-><init>()V

    invoke-virtual {v15, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v11, Lsl0/y0;

    invoke-static {}, Lx81/e;->p()Lp1/t1;

    move-result-object v14

    invoke-virtual {v15, v14}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v12, :cond_1e

    invoke-static {v15}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v13

    invoke-virtual {v15, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v13, Lbc3/c0;

    sget-object v8, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    invoke-virtual {v15, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/content/res/Configuration;

    move/from16 p6, v4

    sget-object v4, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v15, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly3/c;

    move-object/from16 v27, v6

    const/16 v6, 0x96

    int-to-float v6, v6

    invoke-interface {v4, v6}, Ly3/c;->q0(F)F

    move-result v6

    iget v8, v8, Landroid/content/res/Configuration;->screenHeightDp:I

    int-to-float v8, v8

    invoke-interface {v4, v8}, Ly3/c;->q0(F)F

    move-result v4

    const v8, 0x3e19999a    # 0.15f

    mul-float/2addr v4, v8

    invoke-static {v6, v4}, Ljava/lang/Math;->min(FF)F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v2}, Lnl0/f;->c()Lnl0/a;

    move-result-object v6

    invoke-virtual {v6}, Lnl0/a;->f()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    const/high16 v28, 0x70000

    move-object/from16 v29, v13

    and-int v13, v3, v28

    const/high16 v2, 0x20000

    if-ne v13, v2, :cond_1f

    const/4 v2, 0x1

    goto :goto_13

    :cond_1f
    const/4 v2, 0x0

    :goto_13
    or-int/2addr v2, v8

    const/high16 v8, 0x1c00000

    and-int/2addr v8, v3

    move/from16 p3, v2

    const/high16 v2, 0x800000

    if-ne v8, v2, :cond_20

    const/4 v2, 0x1

    goto :goto_14

    :cond_20
    const/4 v2, 0x0

    :goto_14
    or-int v2, p3, v2

    invoke-virtual {v15, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v2, v8

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v2, :cond_22

    if-ne v8, v12, :cond_21

    goto :goto_15

    :cond_21
    move/from16 v28, p6

    move/from16 v25, v17

    goto :goto_16

    :cond_22
    :goto_15
    new-instance v2, Lsl0/s3$b;

    const/4 v8, 0x0

    move-object/from16 p4, p1

    move-object/from16 p3, v2

    move-object/from16 p7, v5

    move-object/from16 p8, v8

    move/from16 p5, v17

    invoke-direct/range {p3 .. p8}, Lsl0/s3$b;-><init>(Lnl0/f;ZZLf0/r1;Lq83/d;)V

    move-object/from16 v8, p3

    move/from16 v25, p5

    move/from16 v28, p6

    invoke-virtual {v15, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_16
    check-cast v8, Lc93/m;

    invoke-static {v15, v8, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v6, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    move/from16 p4, v4

    invoke-static {v6, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v1, v4, v6}, Ll0/y;->a(Ll0/y;Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Lb2/e;->w:Lb2/m;

    move-object/from16 p8, v7

    const/4 v1, 0x0

    invoke-static {v6, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    move/from16 p6, v13

    move-object/from16 p5, v14

    iget-wide v13, v15, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v15, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v9, v15, Lp1/q;->S:Z

    if-eqz v9, :cond_23

    invoke-virtual {v15, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_17

    :cond_23
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_17
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v15, v9, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v15, v7, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    move-object/from16 p7, v11

    iget-boolean v11, v15, Lp1/q;->S:Z

    if-nez v11, :cond_24

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_25

    :cond_24
    invoke-static {v1, v15, v1, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_25
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v15, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v1, 0xe

    invoke-static {v8, v5, v1}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v11, Ll0/m;->a:Ll0/e;

    move/from16 v30, v1

    const/4 v11, 0x1

    int-to-float v1, v11

    const/16 v11, 0x8

    int-to-float v11, v11

    mul-float/2addr v1, v11

    sget-object v11, Lb2/e;->L:Lb2/l;

    invoke-static {v1, v11}, Ll0/m;->k(FLb2/g;)Ll0/k;

    move-result-object v11

    move/from16 v31, v1

    const/4 v1, 0x6

    invoke-static {v11, v10, v15, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    iget-wide v1, v15, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v15, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v15}, Lp1/q;->i0()V

    move-object/from16 v17, v5

    iget-boolean v5, v15, Lp1/q;->S:Z

    if-eqz v5, :cond_26

    invoke-virtual {v15, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_18

    :cond_26
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_18
    invoke-static {v15, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v15, Lp1/q;->S:Z

    if-nez v2, :cond_27

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_28

    :cond_27
    invoke-static {v1, v15, v1, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_28
    invoke-static {v15, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lnl0/f;->f()Lnl0/j;

    move-result-object v1

    const/4 v11, 0x3

    const/4 v2, 0x0

    if-nez v1, :cond_29

    const v0, 0x16d2c591

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    const/4 v1, 0x0

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    move/from16 v22, p4

    move-object/from16 v2, p5

    move-object/from16 v7, p8

    move v9, v3

    move-object v4, v8

    move/from16 v24, v11

    move-object/from16 v39, v12

    move-object/from16 v5, v17

    move-object/from16 v6, v27

    const/4 v0, 0x1

    const/high16 v8, 0x3f800000    # 1.0f

    move/from16 v3, p6

    goto/16 :goto_1f

    :cond_29
    const v4, 0x16d2c592

    invoke-virtual {v15, v4}, Lp1/q;->e0(I)V

    const-string v4, "educatonHubBox"

    invoke-static {v8, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4, v2, v11}, Landroidx/compose/animation/c;->a(Landroidx/compose/ui/Modifier;Ld0/e2;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v12, :cond_2a

    new-instance v2, Lsl0/h3;

    const/16 v5, 0xd

    invoke-direct {v2, v5}, Lsl0/h3;-><init>(I)V

    invoke-virtual {v15, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2a
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v4, v2}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v33

    const/4 v2, 0x2

    int-to-float v2, v2

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float v34, v2, v4

    const/16 v37, 0x0

    const/16 v38, 0xe

    const/16 v35, 0x0

    const/16 v36, 0x0

    invoke-static/range {v33 .. v38}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {v6, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    move-object/from16 v23, v12

    iget-wide v11, v15, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v15, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v11, v15, Lp1/q;->S:Z

    if-eqz v11, :cond_2b

    invoke-virtual {v15, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_19

    :cond_2b
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_19
    invoke-static {v15, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v15, Lp1/q;->S:Z

    if-nez v5, :cond_2c

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2d

    :cond_2c
    invoke-static {v4, v15, v4, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2d
    invoke-static {v15, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lnl0/j;->a()Lh51/f;

    move-result-object v5

    if-nez v5, :cond_2e

    const v0, 0x5fcdfb34

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    const/4 v1, 0x0

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    move/from16 v22, p4

    move-object/from16 v2, p5

    move-object/from16 v7, p8

    move v9, v3

    move-object v4, v8

    move-object/from16 v5, v17

    move-object/from16 v39, v23

    move-object/from16 v6, v27

    const/4 v0, 0x1

    const/high16 v8, 0x3f800000    # 1.0f

    const/16 v24, 0x3

    move/from16 v3, p6

    goto/16 :goto_1e

    :cond_2e
    const/4 v1, 0x0

    const v0, 0x5fcdfb35

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    move-object/from16 v2, p1

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v15, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    and-int/lit16 v4, v3, 0x1c00

    const/16 v6, 0x800

    if-ne v4, v6, :cond_2f

    const/4 v4, 0x1

    goto :goto_1a

    :cond_2f
    move v4, v1

    :goto_1a
    or-int/2addr v0, v4

    const v4, 0xe000

    and-int/2addr v4, v3

    const/16 v6, 0x4000

    if-ne v4, v6, :cond_30

    const/4 v4, 0x1

    goto :goto_1b

    :cond_30
    move v4, v1

    :goto_1b
    or-int/2addr v0, v4

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_32

    move-object/from16 v0, v23

    if-ne v4, v0, :cond_31

    goto :goto_1c

    :cond_31
    move/from16 v22, p4

    move-object/from16 v7, p8

    move v12, v1

    move v9, v3

    move-object v11, v8

    move-object/from16 v6, v27

    const/4 v1, 0x0

    const/high16 v32, 0x3f800000    # 1.0f

    goto :goto_1d

    :cond_32
    move-object/from16 v0, v23

    :goto_1c
    new-instance v2, Lsl0/q3;

    move-object v4, v8

    const/4 v8, 0x1

    move/from16 v22, p4

    move-object/from16 v7, p8

    move v12, v1

    move v9, v3

    move-object v11, v4

    move-object/from16 v6, v27

    const/4 v1, 0x0

    const/high16 v32, 0x3f800000    # 1.0f

    move-object/from16 v4, p1

    move-object/from16 v3, p7

    invoke-direct/range {v2 .. v8}, Lsl0/q3;-><init>(Lsl0/y0;Lnl0/f;Lh51/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v2

    :goto_1d
    move-object v14, v4

    check-cast v14, Lkotlin/jvm/functions/Function1;

    const/16 v2, 0x10

    sget v16, Lh51/f;->n:I

    move-object/from16 v3, v17

    const/16 v17, 0x6

    move v4, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v2, p5

    move-object/from16 v39, v0

    move v1, v4

    move-object v4, v11

    move/from16 v8, v32

    const/4 v0, 0x1

    const/16 v24, 0x3

    move-object v11, v5

    move-object v5, v3

    move/from16 v3, p6

    invoke-static/range {v11 .. v17}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    :goto_1e
    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    :goto_1f
    const v11, -0x18092c9a

    invoke-virtual {v15, v11}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lnl0/f;->c()Lnl0/a;

    move-result-object v11

    invoke-virtual {v11}, Lnl0/a;->f()Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v27

    :goto_20
    invoke-interface/range {v27 .. v27}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_3b

    invoke-interface/range {v27 .. v27}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lnl0/c;

    invoke-virtual {v11}, Lnl0/c;->g()Lnl0/b;

    move-result-object v12

    sget-object v13, Lnl0/b;->USER:Lnl0/b;

    if-ne v12, v13, :cond_33

    const v12, -0x744d0b50

    invoke-virtual {v15, v12}, Lp1/q;->e0(I)V

    move-object v12, v11

    invoke-virtual {v12}, Lnl0/c;->a()Ljava/lang/String;

    move-result-object v11

    move-object v13, v12

    invoke-virtual {v13}, Lnl0/c;->f()Ljava/util/List;

    move-result-object v12

    move-object v14, v13

    invoke-virtual {v14}, Lnl0/c;->m()Ljava/lang/Boolean;

    move-result-object v13

    invoke-virtual {v14}, Lnl0/c;->e()Ljava/lang/String;

    move-result-object v14

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v11 .. v17}, Lsl0/i3;->f(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    move-object/from16 v23, v2

    move-object/from16 v34, v4

    move-object v0, v5

    move-object/from16 v37, v6

    move-object/from16 v38, v7

    move/from16 v36, v8

    move/from16 p4, v9

    move-object/from16 v35, v10

    move/from16 v17, v25

    const/16 v25, 0x100

    const/16 v33, 0x6

    move v4, v1

    move v1, v3

    goto/16 :goto_26

    :cond_33
    move-object v14, v11

    const v11, -0x74492cc4

    invoke-virtual {v15, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v14}, Lnl0/c;->k()Z

    move-result v11

    if-nez v11, :cond_3a

    const v11, -0x74487340

    invoke-virtual {v15, v11}, Lp1/q;->e0(I)V

    invoke-static {v8, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static/range {v31 .. v31}, Ll0/m;->i(F)Ll0/k;

    move-result-object v12

    const/4 v13, 0x6

    invoke-static {v12, v10, v15, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v12

    iget-wide v0, v15, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    invoke-static {v15, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v13, v15, Lp1/q;->S:Z

    if-eqz v13, :cond_34

    invoke-virtual {v15, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_21

    :cond_34
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_21
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v15, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v15, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v8, v15, Lp1/q;->S:Z

    if-nez v8, :cond_35

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_36

    :cond_35
    invoke-static {v0, v15, v0, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_36
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v15, v0, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lb3/v1;->p:Lp1/u2;

    invoke-virtual {v15, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb3/x2;

    invoke-virtual/range {p1 .. p1}, Lnl0/f;->c()Lnl0/a;

    move-result-object v1

    invoke-virtual {v1}, Lnl0/a;->f()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual/range {p1 .. p1}, Lnl0/f;->c()Lnl0/a;

    move-result-object v8

    invoke-virtual {v8}, Lnl0/a;->f()Ljava/util/List;

    move-result-object v8

    invoke-static {v8}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    move-object v11, v4

    invoke-virtual {v14}, Lnl0/c;->h()Z

    move-result v4

    move-object v12, v5

    invoke-virtual {v14}, Lnl0/c;->a()Ljava/lang/String;

    move-result-object v5

    move-object v13, v6

    invoke-virtual {v14}, Lnl0/c;->f()Ljava/util/List;

    move-result-object v6

    move-object/from16 v16, v7

    const/high16 v18, 0x3f800000    # 1.0f

    invoke-virtual {v14}, Lnl0/c;->d()Z

    move-result v7

    move/from16 v19, v3

    move v3, v8

    invoke-virtual {v14}, Lnl0/c;->i()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v14}, Lnl0/c;->c()Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    move-result-object v20

    move-object/from16 v21, v11

    invoke-virtual {v14}, Lnl0/c;->j()Z

    move-result v11

    move-object/from16 v33, v12

    invoke-virtual {v14}, Lnl0/c;->l()Z

    move-result v12

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v34

    invoke-virtual {v15, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v35

    or-int v34, v34, v35

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v35

    or-int v34, v34, v35

    move/from16 p4, v1

    and-int/lit16 v1, v9, 0x380

    move-object/from16 v35, v10

    const/16 v10, 0x100

    if-ne v1, v10, :cond_37

    const/4 v1, 0x1

    goto :goto_22

    :cond_37
    const/4 v1, 0x0

    :goto_22
    or-int v1, v34, v1

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v1, :cond_39

    move-object/from16 v1, v39

    if-ne v10, v1, :cond_38

    goto :goto_23

    :cond_38
    move-object/from16 v39, v1

    move-object/from16 v1, p2

    goto :goto_24

    :cond_39
    move-object/from16 v1, v39

    :goto_23
    new-instance v10, Lry2/d;

    move-object/from16 v39, v1

    move-object/from16 v1, p2

    invoke-direct {v10, v2, v14, v0, v1}, Lry2/d;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lnl0/c;Lb3/x2;Lc93/m;)V

    invoke-virtual {v15, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_24
    check-cast v10, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v0, v9, 0x3

    and-int/lit8 v0, v0, 0xe

    const v14, 0x7fc00

    and-int/2addr v14, v9

    move-object/from16 v34, v21

    const/16 v21, 0x100

    move/from16 v36, v18

    move-object/from16 v18, v15

    move-object v15, v13

    move-object v13, v10

    const/4 v10, 0x0

    move v1, v14

    move/from16 v14, p4

    move/from16 p4, v9

    move-object/from16 v9, v20

    move/from16 v20, v1

    move-object/from16 v23, v2

    move/from16 v1, v19

    move/from16 v17, v25

    const/16 v25, 0x100

    move-object/from16 v2, p1

    move/from16 v19, v0

    move-object/from16 v0, v33

    const/16 v33, 0x6

    invoke-static/range {v2 .. v21}, Lsl0/g1;->n(Lnl0/f;ZZLjava/lang/String;Ljava/util/List;ZLjava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;ZZZLkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v37, v15

    move-object/from16 v38, v16

    move-object/from16 v15, v18

    const/4 v11, 0x1

    invoke-virtual {v15, v11}, Lp1/q;->q(Z)V

    const/4 v4, 0x0

    invoke-virtual {v15, v4}, Lp1/q;->q(Z)V

    goto :goto_25

    :cond_3a
    move-object/from16 v23, v2

    move-object/from16 v34, v4

    move-object v0, v5

    move-object/from16 v37, v6

    move-object/from16 v38, v7

    move/from16 v36, v8

    move/from16 p4, v9

    move-object/from16 v35, v10

    move/from16 v17, v25

    const/16 v25, 0x100

    const/16 v33, 0x6

    move v4, v1

    move v1, v3

    const v2, -0x74278039

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v4}, Lp1/q;->q(Z)V

    :goto_25
    invoke-virtual {v15, v4}, Lp1/q;->q(Z)V

    :goto_26
    move/from16 v9, p4

    move-object v5, v0

    move v3, v1

    move v1, v4

    move/from16 v25, v17

    move-object/from16 v2, v23

    move-object/from16 v4, v34

    move-object/from16 v10, v35

    move/from16 v8, v36

    move-object/from16 v6, v37

    move-object/from16 v7, v38

    const/4 v0, 0x1

    goto/16 :goto_20

    :cond_3b
    move v4, v1

    move v1, v3

    move-object v0, v5

    move-object/from16 v37, v6

    move-object/from16 v38, v7

    move/from16 p4, v9

    move/from16 v17, v25

    invoke-virtual {v15, v4}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, Lnl0/f;->k()Lnl0/m;

    move-result-object v2

    sget-object v3, Lnl0/m;->MESSAGE_LOADING:Lnl0/m;

    if-eq v2, v3, :cond_40

    invoke-virtual/range {p1 .. p1}, Lnl0/f;->c()Lnl0/a;

    move-result-object v2

    invoke-virtual {v2}, Lnl0/a;->f()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {v2, v3}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v2

    :cond_3c
    invoke-interface {v2}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v3

    if-eqz v3, :cond_3d

    invoke-interface {v2}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lnl0/c;

    invoke-virtual {v4}, Lnl0/c;->g()Lnl0/b;

    move-result-object v4

    sget-object v5, Lnl0/b;->ASSISTANT:Lnl0/b;

    if-ne v4, v5, :cond_3c

    move-object v2, v3

    goto :goto_27

    :cond_3d
    const/4 v2, 0x0

    :goto_27
    check-cast v2, Lnl0/c;

    if-eqz v2, :cond_3e

    invoke-virtual {v2}, Lnl0/c;->k()Z

    move-result v2

    const/4 v11, 0x1

    if-ne v2, v11, :cond_3e

    goto :goto_29

    :cond_3e
    if-eqz v26, :cond_3f

    goto :goto_29

    :cond_3f
    const v1, 0x1716396b

    invoke-virtual {v15, v1}, Lp1/q;->e0(I)V

    const/4 v1, 0x0

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    move-object/from16 v1, v39

    :goto_28
    const/4 v11, 0x1

    goto/16 :goto_2a

    :cond_40
    :goto_29
    const v2, 0x170dfbb9

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v3, v39

    if-ne v2, v3, :cond_41

    new-instance v2, Lsl0/h3;

    move/from16 v4, v30

    invoke-direct {v2, v4}, Lsl0/h3;-><init>(I)V

    invoke-virtual {v15, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_41
    move-object v13, v2

    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_42

    new-instance v2, Lsl0/h3;

    const/16 v4, 0xf

    invoke-direct {v2, v4}, Lsl0/h3;-><init>(I)V

    invoke-virtual {v15, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_42
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_43

    new-instance v4, Lsl0/h3;

    const/16 v5, 0x10

    invoke-direct {v4, v5}, Lsl0/h3;-><init>(I)V

    invoke-virtual {v15, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_43
    move-object/from16 v16, v4

    check-cast v16, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v4, p4, 0x3

    const/16 v30, 0xe

    and-int/lit8 v4, v4, 0xe

    const v5, 0x6036db0

    or-int v19, v4, v5

    or-int/lit16 v1, v1, 0x6db0

    const/16 v21, 0x6c0

    move-object/from16 v39, v3

    const/4 v3, 0x0

    const/4 v4, 0x1

    const-string v5, ""

    sget-object v6, Lm83/y;->w:Lm83/y;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x1

    move/from16 v20, v1

    move-object/from16 v18, v15

    move-object/from16 v1, v39

    move-object v15, v2

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v21}, Lsl0/g1;->n(Lnl0/f;ZZLjava/lang/String;Ljava/util/List;ZLjava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;ZZZLkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v18

    const/4 v4, 0x0

    invoke-virtual {v15, v4}, Lp1/q;->q(Z)V

    goto :goto_28

    :goto_2a
    invoke-virtual {v15, v11}, Lp1/q;->q(Z)V

    iget-object v2, v0, Lf0/r1;->d:Lp1/h1;

    invoke-virtual {v2}, Lp1/h1;->x()I

    move-result v2

    iget-object v3, v0, Lf0/r1;->a:Lp1/h1;

    invoke-virtual {v3}, Lp1/h1;->x()I

    move-result v3

    sub-int/2addr v2, v3

    move-object/from16 v13, v29

    invoke-virtual {v15, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_44

    if-ne v4, v1, :cond_45

    :cond_44
    new-instance v4, Lsl0/a0;

    const/16 v1, 0xa

    invoke-direct {v4, v1, v13, v0}, Lsl0/a0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v15, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_45
    check-cast v4, Lc93/a;

    const/4 v0, 0x6

    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    move/from16 p8, v0

    move-object/from16 p3, v1

    move/from16 p5, v2

    move-object/from16 p6, v4

    move-object/from16 p7, v15

    move/from16 p4, v22

    invoke-static/range {p3 .. p8}, Lsl0/s3;->n(Ll0/u;IILc93/a;Landroidx/compose/runtime/Composer;I)V

    const/4 v11, 0x1

    invoke-virtual {v15, v11}, Lp1/q;->q(Z)V

    move/from16 v6, v17

    move/from16 v7, v26

    move/from16 v8, v28

    move-object/from16 v4, v37

    move-object/from16 v5, v38

    goto :goto_2b

    :cond_46
    invoke-virtual {v15}, Lp1/q;->X()V

    move/from16 v7, p6

    move v8, v4

    move-object v5, v11

    move v6, v14

    move-object/from16 v4, p3

    :goto_2b
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_47

    new-instance v0, Lfh0/c;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lfh0/c;-><init>(Ll0/y;Lnl0/f;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZII)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_47
    return-void
.end method

.method private static final u(Lnl0/d;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lml0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lk2/e;)Ll83/a0;
    .locals 11

    const-string v0, "$this$drawBehind"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object v2

    invoke-interface {p0}, Lk2/e;->d()J

    move-result-wide v0

    const-wide v3, 0xffffffffL

    and-long/2addr v0, v3

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v5, v1

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    const/16 v7, 0x20

    shl-long/2addr v5, v7

    and-long/2addr v0, v3

    or-long/2addr v5, v0

    const/4 v0, 0x2

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-interface {p0, v0}, Ly3/c;->q0(F)F

    move-result v7

    const/4 v9, 0x0

    const/16 v10, 0x1f0

    const-wide/16 v3, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v10}, Lk2/e;->j(Lk2/e;Li2/t;JJFLi2/t0;FI)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lsl0/y0;Lnl0/f;Lh51/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 8

    const-string v0, "event"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    move-object v1, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    move-object v2, p5

    invoke-virtual/range {v1 .. v7}, Lsl0/y0;->a(Ljava/lang/Object;ILnl0/f;Lm91/u;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lcom/whoop/data/repositories/FeatureFlagChecker;Lnl0/c;Lb3/x2;Lc93/m;Lcom/whoop/bot/models/feedback/AiFeedbackType;)Ll83/a0;
    .locals 2

    const-string v0, "whoop-coach-feedback-v3"

    invoke-interface {p0, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    if-eqz p4, :cond_0

    new-instance p0, Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    invoke-virtual {p4}, Lcom/whoop/bot/models/feedback/AiFeedbackType;->getValue()Ljava/lang/String;

    move-result-object p4

    const-string v0, ""

    sget-object v1, Lm83/y;->w:Lm83/y;

    invoke-direct {p0, p4, v0, v1}, Lcom/whoop/bot/models/feedback/AiMessageFeedback;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lnl0/c;->c()Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    move-result-object p0

    :goto_0
    if-eqz p2, :cond_1

    check-cast p2, Lb3/x1;

    invoke-virtual {p2}, Lb3/x1;->a()V

    :cond_1
    invoke-virtual {p1}, Lnl0/c;->e()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lcom/whoop/bot/models/feedback/AiFeedbackType;)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
