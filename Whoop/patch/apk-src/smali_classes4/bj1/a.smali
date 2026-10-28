.class public final Lbj1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbj1/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0001\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u001aR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lbj1/a;",
        "",
        "Lgt0/e;",
        "firmwareUpdateApi",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lpi1/a;",
        "analytics",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lgt0/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Lpi1/a;Ltr2/n;)V",
        "Lcj1/g$l;",
        "event",
        "Lcj1/g;",
        "a",
        "(Lcj1/g$l;)Lcj1/g;",
        "Lcom/whoop/navigation/e;",
        "navAction",
        "b",
        "(Lcom/whoop/navigation/e;)Lcj1/g;",
        "actionEvent",
        "c",
        "(Lcj1/g;)Lcj1/g;",
        "Lgt0/e;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Lpi1/a;",
        "d",
        "Ltr2/n;",
        "health_release"
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
.field private final a:Lgt0/e;

.field private final b:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final c:Lpi1/a;

.field private final d:Ltr2/n;


# direct methods
.method public constructor <init>(Lgt0/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Lpi1/a;Ltr2/n;)V
    .locals 1

    const-string v0, "firmwareUpdateApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbj1/a;->a:Lgt0/e;

    iput-object p2, p0, Lbj1/a;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p3, p0, Lbj1/a;->c:Lpi1/a;

    iput-object p4, p0, Lbj1/a;->d:Ltr2/n;

    return-void
.end method

.method private final a(Lcj1/g$l;)Lcj1/g;
    .locals 7

    invoke-virtual {p1}, Lcj1/g$l;->b()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lm91/u;

    if-eqz v1, :cond_0

    new-instance p1, Lcj1/g$b;

    check-cast v0, Lm91/u;

    invoke-direct {p1, v0}, Lcj1/g$b;-><init>(Lm91/u;)V

    return-object p1

    :cond_0
    instance-of v1, v0, Lcom/whoop/navigation/e;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/whoop/navigation/e;

    invoke-direct {p0, v0}, Lbj1/a;->b(Lcom/whoop/navigation/e;)Lcj1/g;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v1, v0, La11/b;

    if-eqz v1, :cond_2

    new-instance v0, Lcj1/g$b;

    invoke-virtual {p1}, Lcj1/g$l;->a()Lm91/u;

    move-result-object p1

    invoke-direct {v0, p1}, Lcj1/g$b;-><init>(Lm91/u;)V

    return-object v0

    :cond_2
    instance-of v1, v0, La11/a;

    const/4 v2, 0x0

    if-eqz v1, :cond_9

    move-object v1, v0

    check-cast v1, La11/a;

    sget-object v3, Lbj1/a$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v3, v1

    const/4 v3, 0x1

    if-eq v1, v3, :cond_8

    const/4 v3, 0x2

    if-eq v1, v3, :cond_7

    const/4 v3, 0x3

    if-eq v1, v3, :cond_6

    const/4 v3, 0x4

    const/4 v4, 0x0

    const-string v5, " not handled"

    const-string v6, "ConnectivityEventType "

    if-eq v1, v3, :cond_3

    iget-object p1, p0, Lbj1/a;->d:Ltr2/n;

    invoke-static {v0, v6, v5}, Lih0/d0;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v4, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v2

    :cond_3
    invoke-virtual {p1}, Lcj1/g$l;->a()Lm91/u;

    move-result-object p1

    instance-of v1, p1, La11/r;

    if-eqz v1, :cond_4

    check-cast p1, La11/r;

    goto :goto_0

    :cond_4
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_5

    invoke-virtual {p1}, La11/r;->c()La11/b;

    move-result-object v1

    sget-object v3, La11/b;->DEFAULT:La11/b;

    if-eq v1, v3, :cond_5

    new-instance v0, Lcj1/g$b;

    invoke-direct {v0, p1}, Lcj1/g$b;-><init>(Lm91/u;)V

    return-object v0

    :cond_5
    iget-object p1, p0, Lbj1/a;->d:Ltr2/n;

    invoke-static {v0, v6, v5}, Lih0/d0;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v4, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v2

    :cond_6
    sget-object p1, Lcj1/g$h$b;->a:Lcj1/g$h$b;

    return-object p1

    :cond_7
    sget-object p1, Lcj1/g$h$c;->a:Lcj1/g$h$c;

    return-object p1

    :cond_8
    sget-object p1, Lcj1/g$h$a;->a:Lcj1/g$h$a;

    return-object p1

    :cond_9
    instance-of p1, v0, Ll01/i;

    if-eqz p1, :cond_a

    new-instance p1, Lcj1/g$f;

    check-cast v0, Ll01/i;

    invoke-virtual {v0}, Ll01/i;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcj1/g$f;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_a
    instance-of p1, v0, Lc41/p1;

    if-eqz p1, :cond_b

    new-instance p1, Lcj1/g$f;

    check-cast v0, Lc41/p1;

    invoke-virtual {v0}, Lc41/p1;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcj1/g$f;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_b
    return-object v2
.end method

.method private final b(Lcom/whoop/navigation/e;)Lcj1/g;
    .locals 8

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    instance-of v0, v0, Lcom/whoop/navigation/AppScreen$s2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbj1/a;->a:Lgt0/e;

    invoke-interface {v0}, Lgt0/e;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcj1/g$j;->a:Lcj1/g$j;

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    instance-of v0, v0, Lcom/whoop/navigation/AppScreen$s2;

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v0

    instance-of v0, v0, Lcom/whoop/navigation/HeartScreenerModel;

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v0

    instance-of v1, v0, Lcom/whoop/navigation/HeartScreenerModel;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/whoop/navigation/HeartScreenerModel;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    const-string v1, "health_tab"

    invoke-virtual {v0, v1}, Lcom/whoop/navigation/HeartScreenerModel;->copy(Ljava/lang/String;)Lcom/whoop/navigation/HeartScreenerModel;

    move-result-object v0

    if-eqz v0, :cond_2

    :goto_1
    move-object v3, v0

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v0

    goto :goto_1

    :goto_2
    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Lcom/whoop/navigation/e;->b(Lcom/whoop/navigation/e;Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILjava/lang/Object;)Lcom/whoop/navigation/e;

    move-result-object p1

    goto :goto_3

    :cond_3
    move-object v0, p1

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object p1

    instance-of p1, p1, Lcom/whoop/navigation/IntegrationsScreenModel;

    if-eqz p1, :cond_5

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type com.whoop.navigation.IntegrationsScreenModel"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/whoop/navigation/IntegrationsScreenModel;

    invoke-virtual {p1}, Lcom/whoop/navigation/IntegrationsScreenModel;->getSource()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_5

    :cond_4
    invoke-virtual {v0}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, p1

    check-cast v2, Lcom/whoop/navigation/IntegrationsScreenModel;

    const/4 v6, 0x5

    const/4 v7, 0x0

    const/4 v3, 0x0

    const-string v4, "health_tab"

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/whoop/navigation/IntegrationsScreenModel;->copy$default(Lcom/whoop/navigation/IntegrationsScreenModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILjava/lang/Object;)Lcom/whoop/navigation/IntegrationsScreenModel;

    move-result-object v2

    const/4 v4, 0x5

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Lcom/whoop/navigation/e;->b(Lcom/whoop/navigation/e;Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILjava/lang/Object;)Lcom/whoop/navigation/e;

    move-result-object p1

    goto :goto_3

    :cond_5
    move-object p1, v0

    :goto_3
    new-instance v0, Lcj1/g$c;

    invoke-direct {v0, p1}, Lcj1/g$c;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0
.end method


# virtual methods
.method public final c(Lcj1/g;)Lcj1/g;
    .locals 2

    const-string v0, "actionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcj1/g$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbj1/a;->c:Lpi1/a;

    move-object v1, p1

    check-cast v1, Lcj1/g$a;

    invoke-virtual {v0, v1}, Lpi1/a;->a(Lcj1/g$a;)V

    :cond_0
    instance-of v0, p1, Lcj1/g$l;

    if-eqz v0, :cond_1

    check-cast p1, Lcj1/g$l;

    invoke-direct {p0, p1}, Lbj1/a;->a(Lcj1/g$l;)Lcj1/g;

    move-result-object p1

    :cond_1
    return-object p1
.end method
