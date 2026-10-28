.class public final Lj02/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lj02/x;",
        "",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lz92/a;",
        "userInfoAccessor",
        "Lj92/t;",
        "topPrivateDomainHelper",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;Lz92/a;Lj92/t;)V",
        "Lcom/whoop/domain/model/WhoopUri;",
        "whoopUri",
        "Lcom/whoop/navigation/NavigationScreenModel;",
        "b",
        "(Lcom/whoop/domain/model/WhoopUri;)Lcom/whoop/navigation/NavigationScreenModel;",
        "a",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Lz92/a;",
        "c",
        "Lj92/t;",
        "navigation_release"
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
.field private final a:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final b:Lz92/a;

.field private final c:Lj92/t;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lz92/a;Lj92/t;)V
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userInfoAccessor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "topPrivateDomainHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lj02/x;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    .line 3
    iput-object p2, p0, Lj02/x;->b:Lz92/a;

    .line 4
    iput-object p3, p0, Lj02/x;->c:Lj92/t;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lz92/a;Lj92/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    new-instance p3, Lj92/t;

    invoke-direct {p3}, Lj92/t;-><init>()V

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lj02/x;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lz92/a;Lj92/t;)V

    return-void
.end method

.method public static final synthetic a(Lj02/x;)Lz92/a;
    .locals 0

    iget-object p0, p0, Lj02/x;->b:Lz92/a;

    return-object p0
.end method


# virtual methods
.method public final b(Lcom/whoop/domain/model/WhoopUri;)Lcom/whoop/navigation/NavigationScreenModel;
    .locals 7

    const-string v0, "whoopUri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Lcom/iterable/iterableapi/v;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lcom/iterable/iterableapi/v;-><init>(I)V

    invoke-virtual {v1, v0, p1}, Lcom/iterable/iterableapi/v;->d(Lud3/e0;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/iterable/iterableapi/v;->b()Lud3/e0;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object p1, v0

    :goto_0
    if-nez p1, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v1, p1, Lud3/e0;->f:Ljava/util/ArrayList;

    iget-object v2, p0, Lj02/x;->c:Lj92/t;

    invoke-static {v2, p1}, Lj92/u;->b(Lj92/t;Lud3/e0;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_1

    :cond_1
    iget-object v2, p0, Lj02/x;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v3, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->PASSWORD_RESET_FLOW:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {v2, v3}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2

    invoke-static {v1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v4, "reset-password-v2"

    invoke-static {v2, v4, v3}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_2

    goto/16 :goto_1

    :cond_2
    new-instance v2, Lj02/x$a;

    invoke-direct {v2, p0, v0}, Lj02/x$a;-><init>(Lj02/x;Lq83/d;)V

    sget-object v3, Lq83/k;->w:Lq83/k;

    invoke-static {v3, v2}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_3

    new-instance p1, Lcom/whoop/navigation/LoginScreenModel;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lcom/whoop/navigation/LoginScreenModel;-><init>(Z)V

    return-object p1

    :cond_3
    invoke-static {v1}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v2

    invoke-static {v1}, Lm83/s;->k1(Ljava/util/ArrayList;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "toLowerCase(...)"

    const-string v5, "US"

    if-eqz v3, :cond_4

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v6, v5, v3, v6, v4}, Lr80/c;->q(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-static {v1}, Lm83/s;->k1(Ljava/util/ArrayList;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_5

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v6, v5, v3, v6, v4}, Lr80/c;->q(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-static {v1}, Lm83/s;->k1(Ljava/util/ArrayList;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_6

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v6, v5, v3, v6, v4}, Lr80/c;->q(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_6
    invoke-static {v2}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v2

    invoke-static {v1}, Lm83/s;->k1(Ljava/util/ArrayList;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_a

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_7

    goto :goto_1

    :cond_7
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_1

    :cond_8
    invoke-virtual {p1}, Lud3/e0;->d()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_9

    const-string p1, ""

    :cond_9
    invoke-static {}, Lj02/y;->a()Ljava/util/List;

    move-result-object v1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v0, p0, Lj02/x;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "android-dynamic-deeplink-analytics"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v3, p1, v0}, Lj02/a0;->c(Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/navigation/GenericScreenModel;

    move-result-object p1

    return-object p1

    :cond_a
    :goto_1
    return-object v0
.end method
