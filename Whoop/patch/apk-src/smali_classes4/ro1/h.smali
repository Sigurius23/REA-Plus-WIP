.class public final Lro1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj02/k0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lro1/h;",
        "Lj02/k0;",
        "Lj02/i0;",
        "navDeepLinkRequestHelper",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lj02/m0;",
        "navigationScreen",
        "Lj02/j0;",
        "provideNavigationData",
        "(Lj02/m0;)Lj02/j0;",
        "a",
        "Lj02/i0;",
        "b",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "hormonal-insights_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lj02/i0;

.field private final b:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "navDeepLinkRequestHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lro1/h;->a:Lj02/i0;

    .line 3
    iput-object p2, p0, Lro1/h;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method

.method public synthetic constructor <init>(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 4
    new-instance p1, Lj02/i0;

    invoke-direct {p1}, Lj02/i0;-><init>()V

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lro1/h;-><init>(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-void
.end method


# virtual methods
.method public provideNavigationData(Lj02/m0;)Lj02/j0;
    .locals 10

    const-string v0, "navigationScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lj02/m0$u2;

    const-string v1, "toString(...)"

    const-string v2, "date"

    if-eqz v0, :cond_0

    check-cast p1, Lj02/m0$u2;

    invoke-virtual {p1}, Lj02/m0$u2;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lj02/m0$u2;->c()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ll83/k;

    const-string v2, "source"

    invoke-direct {v0, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v0}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    const-string v0, "logCalendar"

    invoke-static {v0, p1}, Lor2/z;->b(Ljava/lang/String;Ljava/util/Map;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lro1/h;->a:Lj02/i0;

    invoke-virtual {v0, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    invoke-static {}, Lr80/c;->g()Leb/w0;

    move-result-object p1

    const/4 v0, 0x1

    iput-boolean v0, p1, Leb/w0;->a:Z

    invoke-virtual {p1}, Leb/w0;->a()Leb/x0;

    move-result-object v3

    new-instance v1, Lj02/j0$c;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lj02/m0$v2;

    const-string v3, "android-health-push-navigation"

    if-eqz v0, :cond_5

    const-string v0, "android-app://com.whoop/menstrual_cycle_insights"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    check-cast p1, Lj02/m0$v2;

    invoke-virtual {p1}, Lj02/m0$v2;->c()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-lez v5, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_2

    invoke-virtual {v0, v2, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_2
    invoke-virtual {p1}, Lj02/m0$v2;->d()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    const-string v4, "doPollUponEntry"

    invoke-virtual {v0, v4, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    invoke-virtual {p1}, Lj02/m0$v2;->e()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    const-string v4, "preSelectedLogValue"

    invoke-virtual {v0, v4, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_3
    invoke-virtual {p1}, Lj02/m0$v2;->b()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    const-string v2, "analyticsSource"

    invoke-virtual {v0, v2, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_4
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lro1/h;->a:Lj02/i0;

    invoke-virtual {v0, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v5

    iget-object p1, p0, Lro1/h;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-interface {p1, v3}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Lor2/c1;->c(Z)Leb/x0;

    move-result-object v6

    new-instance v4, Lj02/j0$c;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_5
    instance-of v0, p1, Lj02/m0$w2;

    if-eqz v0, :cond_8

    check-cast p1, Lj02/m0$w2;

    invoke-virtual {p1}, Lj02/m0$w2;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {p1}, Lj02/m0$w2;->b()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android-app://com.whoop/phaseCoaching?phase="

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_7
    :goto_1
    const-string p1, "android-app://com.whoop/phaseCoaching"

    :goto_2
    iget-object v0, p0, Lro1/h;->a:Lj02/i0;

    invoke-virtual {v0, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v5

    iget-object p1, p0, Lro1/h;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-interface {p1, v3}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Lor2/c1;->c(Z)Leb/x0;

    move-result-object v6

    new-instance v4, Lj02/j0$c;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_8
    sget-object p1, Lj02/j0$d;->a:Lj02/j0$d;

    return-object p1
.end method
