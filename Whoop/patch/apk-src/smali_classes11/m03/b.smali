.class public abstract Lm03/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a/\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000cH\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;",
        "viewState",
        "Landroid/content/Context;",
        "context",
        "Ll83/a0;",
        "e",
        "(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Landroid/content/Context;Landroidx/compose/runtime/Composer;I)V",
        "",
        "seed",
        "",
        "paceOfAgingScore",
        "yearsDifferenceScore",
        "",
        "contentDescription",
        "c",
        "(JFFLjava/lang/String;Landroidx/compose/runtime/Composer;I)V",
        "widget_release"
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
.method public static synthetic a(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Landroid/content/Context;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lm03/b;->f(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Landroid/content/Context;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(JFFLjava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lm03/b;->d(JFFLjava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(JFFLjava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 23

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v0, p6

    const-string v1, "contentDescription"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p5

    check-cast v9, Lp1/q;

    const v1, 0x645215ab

    invoke-virtual {v9, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v0, 0x6

    const/4 v2, 0x4

    move-wide/from16 v12, p0

    if-nez v1, :cond_1

    invoke-virtual {v9, v12, v13}, Lp1/q;->f(J)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v0

    goto :goto_1

    :cond_1
    move v1, v0

    :goto_1
    and-int/lit8 v6, v0, 0x30

    const/16 v7, 0x20

    if-nez v6, :cond_3

    invoke-virtual {v9, v3}, Lp1/q;->d(F)Z

    move-result v6

    if-eqz v6, :cond_2

    move v6, v7

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v1, v6

    :cond_3
    and-int/lit16 v6, v0, 0x180

    const/16 v8, 0x100

    if-nez v6, :cond_5

    invoke-virtual {v9, v4}, Lp1/q;->d(F)Z

    move-result v6

    if-eqz v6, :cond_4

    move v6, v8

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v1, v6

    :cond_5
    and-int/lit16 v6, v0, 0xc00

    if-nez v6, :cond_7

    invoke-virtual {v9, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x800

    goto :goto_4

    :cond_6
    const/16 v6, 0x400

    :goto_4
    or-int/2addr v1, v6

    :cond_7
    and-int/lit16 v6, v1, 0x493

    const/16 v10, 0x492

    const/4 v14, 0x1

    if-eq v6, v10, :cond_8

    move v6, v14

    goto :goto_5

    :cond_8
    const/4 v6, 0x0

    :goto_5
    and-int/lit8 v10, v1, 0x1

    invoke-virtual {v9, v10, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_12

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v6, v10, :cond_9

    new-instance v6, Ll03/a;

    const/4 v15, 0x0

    invoke-direct {v6, v15, v14, v15}, Ll03/a;-><init>(Lc51/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v6, Ll03/a;

    and-int/lit16 v15, v1, 0x380

    if-ne v15, v8, :cond_a

    move/from16 v16, v14

    goto :goto_6

    :cond_a
    const/16 v16, 0x0

    :goto_6
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v16, :cond_c

    if-ne v11, v10, :cond_b

    goto :goto_7

    :cond_b
    move-object v14, v11

    move/from16 v16, v15

    goto :goto_8

    :cond_c
    :goto_7
    sget-object v17, Ll03/c;->a:Ll03/c;

    move/from16 v16, v15

    float-to-double v14, v4

    const/16 v21, 0x2

    const/16 v22, 0x0

    const/16 v20, 0x0

    move-wide/from16 v18, v14

    invoke-static/range {v17 .. v22}, Ll03/c;->b(Ll03/c;DLc51/n;ILjava/lang/Object;)Ll83/k;

    move-result-object v14

    invoke-virtual {v9, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_8
    check-cast v14, Ll83/k;

    iget-object v15, v14, Ll83/k;->w:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Number;

    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    move-result v18

    iget-object v14, v14, Ll83/k;->x:Ljava/lang/Object;

    check-cast v14, Ljava/lang/Number;

    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    move-result v19

    and-int/lit8 v14, v1, 0xe

    if-ne v14, v2, :cond_d

    const/4 v2, 0x1

    goto :goto_9

    :cond_d
    const/4 v2, 0x0

    :goto_9
    and-int/lit8 v14, v1, 0x70

    if-ne v14, v7, :cond_e

    const/4 v7, 0x1

    goto :goto_a

    :cond_e
    const/4 v7, 0x0

    :goto_a
    or-int/2addr v2, v7

    move/from16 v7, v16

    if-ne v7, v8, :cond_f

    const/4 v11, 0x1

    goto :goto_b

    :cond_f
    const/4 v11, 0x0

    :goto_b
    or-int/2addr v2, v11

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_10

    if-ne v7, v10, :cond_11

    :cond_10
    new-instance v10, Ll03/b;

    float-to-double v14, v3

    float-to-double v7, v4

    const/16 v11, 0xc8

    move-wide/from16 v16, v7

    invoke-direct/range {v10 .. v19}, Ll03/b;-><init>(IJDDII)V

    invoke-virtual {v6, v10}, Ll03/a;->e(Ll03/b;)Landroid/graphics/Bitmap;

    move-result-object v7

    invoke-virtual {v9, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v7, Landroid/graphics/Bitmap;

    new-instance v5, Ln6/f;

    invoke-direct {v5, v7}, Ln6/f;-><init>(Landroid/graphics/Bitmap;)V

    sget-object v2, Ln6/m;->a:Ln6/m;

    invoke-static {v2}, Ls2/d;->k(Ln6/o;)Ln6/o;

    move-result-object v7

    shr-int/lit8 v1, v1, 0x6

    and-int/lit8 v10, v1, 0x70

    const/16 v11, 0x10

    const/4 v8, 0x1

    move-object/from16 v6, p4

    invoke-static/range {v5 .. v11}, Lo73/a;->d(Ln6/r;Ljava/lang/String;Ln6/o;ILandroidx/compose/runtime/Composer;II)V

    goto :goto_c

    :cond_12
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_c
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_13

    new-instance v0, Lm03/a;

    move-wide/from16 v1, p0

    move-object/from16 v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lm03/a;-><init>(JFFLjava/lang/String;I)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final d(JFFLjava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-wide v0, p0

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p6

    invoke-static/range {v0 .. v6}, Lm03/b;->c(JFFLjava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final e(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Landroid/content/Context;Landroidx/compose/runtime/Composer;I)V
    .locals 9

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p2

    check-cast v6, Lp1/q;

    const p2, -0x25aae337

    invoke-virtual {v6, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_1

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v0, p3, 0x30

    if-nez v0, :cond_3

    invoke-virtual {v6, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x20

    goto :goto_2

    :cond_2
    const/16 v0, 0x10

    :goto_2
    or-int/2addr p2, v0

    :cond_3
    and-int/lit8 v0, p2, 0x13

    const/16 v1, 0x12

    const/4 v8, 0x0

    if-eq v0, v1, :cond_4

    const/4 v0, 0x1

    goto :goto_3

    :cond_4
    move v0, v8

    :goto_3
    and-int/lit8 v1, p2, 0x1

    invoke-virtual {v6, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;->getAmoebaSeed()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;->getPaceOfAgingScore()Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;->getYearsDifferenceScore()Ljava/lang/Float;

    move-result-object v2

    if-eqz v0, :cond_6

    if-eqz v1, :cond_6

    if-nez v2, :cond_5

    goto :goto_4

    :cond_5
    const p2, -0x69599465

    invoke-virtual {v6, p2}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v0

    sget v1, Ld03/b;->c:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v1, "getString(...)"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x0

    move-wide v1, v3

    move v3, p2

    move v4, v0

    invoke-static/range {v1 .. v7}, Lm03/b;->c(JFFLjava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_6
    :goto_4
    const v0, -0x695a554c

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    shr-int/lit8 p2, p2, 0x3

    and-int/lit8 p2, p2, 0xe

    invoke-static {p1, v6, p2}, Lm03/e;->b(Landroid/content/Context;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_8

    new-instance v0, Lkl2/f;

    const/16 v1, 0x15

    invoke-direct {v0, p0, p1, p3, v1}, Lkl2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final f(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Landroid/content/Context;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lm03/b;->e(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Landroid/content/Context;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
