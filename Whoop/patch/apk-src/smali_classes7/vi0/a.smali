.class public abstract Lvi0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001aS\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\nH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a?\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\nH\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lti0/e;",
        "contentState",
        "Lcom/whoop/design/models/modal/AnyModal;",
        "nestedModal",
        "Lcom/whoop/design/models/modal/ModalAnalyticEventModel;",
        "modalAnalyticEvents",
        "Lfi0/a;",
        "analyticsWriter",
        "Liy1/c;",
        "metricWriter",
        "Lkotlin/Function1;",
        "Lri0/b;",
        "Ll83/a0;",
        "onEvent",
        "d",
        "(Lti0/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Liy1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "genericEvent",
        "h",
        "(Lri0/b;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lkotlin/jvm/functions/Function1;)V",
        "arch-v2_release"
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
.method public static synthetic a(Lti0/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Liy1/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lvi0/a;->g(Lti0/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Liy1/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;La81/t;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lvi0/a;->f(Lkotlin/jvm/functions/Function1;La81/t;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lkotlin/jvm/functions/Function1;Lri0/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lvi0/a;->e(Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lkotlin/jvm/functions/Function1;Lri0/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lti0/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Liy1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lti0/e;",
            "Lcom/whoop/design/models/modal/AnyModal;",
            "Lcom/whoop/design/models/modal/ModalAnalyticEventModel;",
            "Lfi0/a;",
            "Liy1/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move-object/from16 v9, p2

    move-object/from16 v7, p3

    move-object/from16 v10, p5

    move/from16 v11, p7

    const-string v1, "contentState"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onEvent"

    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p6

    check-cast v3, Lp1/q;

    const v1, 0x21efd25d

    invoke-virtual {v3, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v11, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v11

    goto :goto_1

    :cond_1
    move v1, v11

    :goto_1
    and-int/lit8 v2, v11, 0x30

    if-nez v2, :cond_4

    and-int/lit8 v2, v11, 0x40

    if-nez v2, :cond_2

    invoke-virtual {v3, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_2

    :cond_2
    invoke-virtual {v3, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_2
    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_3

    :cond_3
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v1, v2

    :cond_4
    and-int/lit16 v2, v11, 0x180

    const/16 v4, 0x100

    if-nez v2, :cond_7

    and-int/lit16 v2, v11, 0x200

    if-nez v2, :cond_5

    invoke-virtual {v3, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_4

    :cond_5
    invoke-virtual {v3, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_4
    if-eqz v2, :cond_6

    move v2, v4

    goto :goto_5

    :cond_6
    const/16 v2, 0x80

    :goto_5
    or-int/2addr v1, v2

    :cond_7
    and-int/lit16 v2, v11, 0xc00

    if-nez v2, :cond_9

    invoke-virtual {v3, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    const/16 v2, 0x800

    goto :goto_6

    :cond_8
    const/16 v2, 0x400

    :goto_6
    or-int/2addr v1, v2

    :cond_9
    and-int/lit16 v2, v11, 0x6000

    move-object/from16 v8, p4

    if-nez v2, :cond_b

    invoke-virtual {v3, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    const/16 v2, 0x4000

    goto :goto_7

    :cond_a
    const/16 v2, 0x2000

    :goto_7
    or-int/2addr v1, v2

    :cond_b
    const/high16 v2, 0x30000

    and-int/2addr v2, v11

    const/high16 v12, 0x20000

    if-nez v2, :cond_d

    invoke-virtual {v3, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    move v2, v12

    goto :goto_8

    :cond_c
    const/high16 v2, 0x10000

    :goto_8
    or-int/2addr v1, v2

    :cond_d
    move v13, v1

    const v1, 0x12493

    and-int/2addr v1, v13

    const v2, 0x12492

    if-eq v1, v2, :cond_e

    const/4 v1, 0x1

    goto :goto_9

    :cond_e
    const/4 v1, 0x0

    :goto_9
    and-int/lit8 v2, v13, 0x1

    invoke-virtual {v3, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_17

    and-int/lit16 v1, v13, 0x380

    if-eq v1, v4, :cond_10

    and-int/lit16 v1, v13, 0x200

    if-eqz v1, :cond_f

    invoke-virtual {v3, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    goto :goto_a

    :cond_f
    const/4 v1, 0x0

    goto :goto_b

    :cond_10
    :goto_a
    const/4 v1, 0x1

    :goto_b
    invoke-virtual {v3, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    const/high16 v2, 0x70000

    and-int/2addr v2, v13

    if-ne v2, v12, :cond_11

    const/4 v4, 0x1

    goto :goto_c

    :cond_11
    const/4 v4, 0x0

    :goto_c
    or-int/2addr v1, v4

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_12

    if-ne v4, v5, :cond_13

    :cond_12
    new-instance v4, La81/p;

    const/4 v1, 0x1

    invoke-direct {v4, v9, v7, v10, v1}, La81/p;-><init>(Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v3, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    move-object v1, v4

    check-cast v1, Lkotlin/jvm/functions/Function1;

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v4}, Ll0/f;->i(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move/from16 v16, v2

    move-object v2, v4

    and-int/lit8 v4, v13, 0xe

    move-object/from16 v17, v5

    const/4 v5, 0x0

    move/from16 v14, v16

    move-object/from16 v15, v17

    invoke-static/range {v0 .. v5}, Lzi0/a;->r(Lti0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    if-ne v14, v12, :cond_14

    const/4 v14, 0x1

    goto :goto_d

    :cond_14
    const/4 v14, 0x0

    :goto_d
    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v14, :cond_15

    if-ne v0, v15, :cond_16

    :cond_15
    new-instance v0, Lv41/b0;

    const/4 v1, 0x3

    invoke-direct {v0, v10, v1}, Lv41/b0;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v3, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    move-object v1, v0

    check-cast v1, Lkotlin/jvm/functions/Function1;

    sget v0, Lcom/whoop/design/models/modal/AnyModal;->$stable:I

    shr-int/lit8 v2, v13, 0x3

    and-int/lit8 v2, v2, 0xe

    or-int/2addr v0, v2

    shr-int/lit8 v2, v13, 0x6

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v0, v2

    and-int/lit16 v2, v13, 0x1c00

    or-int/2addr v0, v2

    const/16 v8, 0x30

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v7

    move v7, v0

    move-object v0, v6

    move-object v6, v3

    move-object v3, v2

    move-object/from16 v2, p4

    invoke-static/range {v0 .. v8}, La81/o;->P(Lcom/whoop/design/models/modal/AnyModal;Lkotlin/jvm/functions/Function1;Liy1/c;Lfi0/a;Lc93/a;Lc93/p;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v6

    goto :goto_e

    :cond_17
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_e
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_18

    new-instance v0, Lbe1/f;

    const/16 v8, 0xe

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object v3, v9

    move-object v6, v10

    move v7, v11

    invoke-direct/range {v0 .. v8}, Lbe1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final e(Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lkotlin/jvm/functions/Function1;Lri0/b;)Ll83/a0;
    .locals 1

    const-string v0, "genericEvent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, p0, p1, p2}, Lvi0/a;->h(Lri0/b;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;La81/t;)Ll83/a0;
    .locals 1

    const-string v0, "modalEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, La81/t$f;

    if-eqz v0, :cond_0

    new-instance v0, Lri0/b$t;

    check-cast p1, La81/t$f;

    invoke-virtual {p1}, La81/t$f;->a()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object p1

    invoke-direct {v0, p1}, Lri0/b$t;-><init>(Lcom/whoop/design/models/modal/AnyModal;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lui0/s;->a(La81/t;)Lri0/b;

    move-result-object v0

    :goto_0
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lti0/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Liy1/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p6, p6, 0x1

    invoke-static {p6}, Lp1/x;->L(I)I

    move-result v7

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p7

    invoke-static/range {v0 .. v7}, Lvi0/a;->d(Lti0/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Liy1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(Lri0/b;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lri0/b;",
            "Lcom/whoop/design/models/modal/ModalAnalyticEventModel;",
            "Lfi0/a;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "genericEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lvi0/b;->a(Lri0/b;)La81/t;

    move-result-object p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    instance-of v0, p0, La81/t$f;

    if-eqz v0, :cond_1

    new-instance p1, Lri0/b$t;

    check-cast p0, La81/t$f;

    invoke-virtual {p0}, La81/t$f;->a()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object p0

    invoke-direct {p1, p0}, Lri0/b$t;-><init>(Lcom/whoop/design/models/modal/AnyModal;)V

    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    instance-of v0, p0, La81/t$a;

    if-eqz v0, :cond_2

    invoke-static {p1, p2}, Lcom/whoop/design/models/modal/ModalTrackingKt;->trackModalDismissed(Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;)V

    sget-object p0, Lri0/b$e;->a:Lri0/b$e;

    invoke-interface {p3, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    invoke-static {p0}, Lui0/s;->a(La81/t;)Lri0/b;

    move-result-object p0

    invoke-interface {p3, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
