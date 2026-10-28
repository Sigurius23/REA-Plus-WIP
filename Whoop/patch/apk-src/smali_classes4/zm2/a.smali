.class public abstract Lzm2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lvm2/d;",
        "appNavigator",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "c",
        "(Lvm2/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "app_prodStandardRelease"
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
.method public static synthetic a(Lvm2/d;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzm2/a;->e(Lvm2/d;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lvm2/d;Lcom/whoop/appconfiguration/TabConfiguration;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzm2/a;->d(Lvm2/d;Lcom/whoop/appconfiguration/TabConfiguration;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lvm2/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 10

    const-string v0, "appNavigator"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, p2

    check-cast v7, Lp1/q;

    const v0, 0x1e3a940b

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

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
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_2

    or-int/lit8 v0, v0, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_4

    invoke-virtual {v7, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :cond_4
    :goto_3
    and-int/lit8 v4, v0, 0x13

    const/16 v5, 0x12

    const/4 v6, 0x0

    const/4 v8, 0x1

    if-eq v4, v5, :cond_5

    move v4, v8

    goto :goto_4

    :cond_5
    move v4, v6

    :goto_4
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v7, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_a

    if-eqz v2, :cond_6

    sget-object v2, Lb2/t;->w:Lb2/t;

    move-object v3, v2

    goto :goto_5

    :cond_6
    move-object v3, p1

    :goto_5
    invoke-static {}, Lx81/e;->p()Lp1/t1;

    move-result-object v2

    invoke-virtual {v7, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v4, "aix-coach-bar-fab"

    invoke-interface {v2, v4}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7

    const-string v4, "aix-coach-bar-home"

    invoke-interface {v2, v4}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7

    move v4, v8

    goto :goto_6

    :cond_7
    move v4, v6

    :goto_6
    const-string v5, "aix-voice-realtime"

    invoke-interface {v2, v5}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v5

    sget v2, Lwk0/b;->n:I

    invoke-static {v7, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v2, :cond_8

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v8, v2, :cond_9

    :cond_8
    new-instance v8, Lx30/h1;

    const/16 v2, 0x13

    invoke-direct {v8, p0, v2}, Lx30/h1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v7, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v2, v8

    check-cast v2, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v8, v0, 0x70

    const/4 v9, 0x0

    invoke-static/range {v2 .. v9}, Ljm0/b;->d(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLjava/lang/String;Landroidx/compose/runtime/Composer;II)V

    goto :goto_7

    :cond_a
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v3, p1

    :goto_7
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_b

    new-instance v0, Lzi1/c0;

    const/4 v5, 0x6

    move-object v1, p0

    move v2, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lzi1/c0;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final d(Lvm2/d;Lcom/whoop/appconfiguration/TabConfiguration;)Ll83/a0;
    .locals 1

    const-string v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lvm2/d;->L0(Lcom/whoop/appconfiguration/TabConfiguration;)Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lvm2/d;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lzm2/a;->c(Lvm2/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
