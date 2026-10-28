.class public abstract Lsz0/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "analyticEvent",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onEvent",
        "c",
        "(Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lsz0/t0;->e(Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lsz0/t0;->d(Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/analytics/AnalyticEventModel;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, 0x269036c0    # 1.0006847E-15f

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    const/16 v2, 0x20

    if-nez v1, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, v0, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v1, v3, :cond_4

    move v1, v5

    goto :goto_3

    :cond_4
    move v1, v4

    :goto_3
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {p2, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_9

    if-nez p0, :cond_5

    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_a

    new-instance v0, Lsz0/s0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p3, v1}, Lsz0/s0;-><init>(Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;II)V

    :goto_4
    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_5
    invoke-virtual {p0}, Lcom/whoop/analytics/AnalyticEventModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/analytics/AnalyticEventModel;->getCategory()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/analytics/AnalyticEventModel;->getAction()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/analytics/AnalyticEventModel;->getValue()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/analytics/AnalyticEventModel;->getSource()Ljava/lang/String;

    move-result-object v8

    filled-new-array {v1, v3, v6, v7, v8}, [Ljava/lang/Object;

    move-result-object v1

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v2, :cond_6

    move v4, v5

    :cond_6
    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v4

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_7

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v2, v0, :cond_8

    :cond_7
    new-instance v2, Lsz0/t0$a;

    const/4 v0, 0x0

    invoke-direct {v2, p1, p0, v0}, Lsz0/t0$a;-><init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/analytics/AnalyticEventModel;Lq83/d;)V

    invoke-virtual {p2, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v2, Lc93/m;

    invoke-static {v1, v2, p2}, Lp1/x;->j([Ljava/lang/Object;Lc93/m;Lp1/q;)V

    goto :goto_5

    :cond_9
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_a

    new-instance v0, Lsz0/s0;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p3, v1}, Lsz0/s0;-><init>(Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;II)V

    goto :goto_4

    :cond_a
    return-void
.end method

.method private static final d(Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lsz0/t0;->c(Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lsz0/t0;->c(Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
