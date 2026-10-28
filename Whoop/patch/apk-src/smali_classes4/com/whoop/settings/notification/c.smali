.class public final Lcom/whoop/settings/notification/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u0008\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0082@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J \u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0082@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ!\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u001f2\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020 0\u001f\u00a2\u0006\u0004\u0008\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u00101\u00a8\u00062"
    }
    d2 = {
        "Lcom/whoop/settings/notification/c;",
        "",
        "Lcom/whoop/service/network/NotificationApi;",
        "api",
        "Lcom/whoop/shepherd/domain/ShepherdApi;",
        "shepherdApi",
        "Lin2/d;",
        "dispatcher",
        "Lic2/b;",
        "analyticsManager",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lwe1/a;",
        "entitlementChecker",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/service/network/NotificationApi;Lcom/whoop/shepherd/domain/ShepherdApi;Lin2/d;Lic2/b;Lcom/whoop/data/repositories/FeatureFlagChecker;Lwe1/a;Ltr2/n;)V",
        "Lcom/whoop/settings/notification/b;",
        "k",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "namespace",
        "h",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "i",
        "",
        "isDetectionOn",
        "isNotificationOn",
        "l",
        "(ZZLq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "Lcom/whoop/settings/notification/a;",
        "upstream",
        "j",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/service/network/NotificationApi;",
        "b",
        "Lcom/whoop/shepherd/domain/ShepherdApi;",
        "c",
        "Lin2/d;",
        "d",
        "Lic2/b;",
        "e",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "f",
        "Lwe1/a;",
        "g",
        "Ltr2/n;",
        "settings_release"
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
.field private final a:Lcom/whoop/service/network/NotificationApi;

.field private final b:Lcom/whoop/shepherd/domain/ShepherdApi;

.field private final c:Lin2/d;

.field private final d:Lic2/b;

.field private final e:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final f:Lwe1/a;

.field private final g:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/service/network/NotificationApi;Lcom/whoop/shepherd/domain/ShepherdApi;Lin2/d;Lic2/b;Lcom/whoop/data/repositories/FeatureFlagChecker;Lwe1/a;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shepherdApi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entitlementChecker"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/settings/notification/c;->a:Lcom/whoop/service/network/NotificationApi;

    iput-object p2, p0, Lcom/whoop/settings/notification/c;->b:Lcom/whoop/shepherd/domain/ShepherdApi;

    iput-object p3, p0, Lcom/whoop/settings/notification/c;->c:Lin2/d;

    iput-object p4, p0, Lcom/whoop/settings/notification/c;->d:Lic2/b;

    iput-object p5, p0, Lcom/whoop/settings/notification/c;->e:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p6, p0, Lcom/whoop/settings/notification/c;->f:Lwe1/a;

    iput-object p7, p0, Lcom/whoop/settings/notification/c;->g:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Lcom/whoop/settings/notification/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/settings/notification/c;->h(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lcom/whoop/settings/notification/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/settings/notification/c;->i(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lcom/whoop/settings/notification/c;)Lic2/b;
    .locals 0

    iget-object p0, p0, Lcom/whoop/settings/notification/c;->d:Lic2/b;

    return-object p0
.end method

.method public static final synthetic d(Lcom/whoop/settings/notification/c;)Lcom/whoop/service/network/NotificationApi;
    .locals 0

    iget-object p0, p0, Lcom/whoop/settings/notification/c;->a:Lcom/whoop/service/network/NotificationApi;

    return-object p0
.end method

.method public static final synthetic e(Lcom/whoop/settings/notification/c;)Lcom/whoop/shepherd/domain/ShepherdApi;
    .locals 0

    iget-object p0, p0, Lcom/whoop/settings/notification/c;->b:Lcom/whoop/shepherd/domain/ShepherdApi;

    return-object p0
.end method

.method public static final synthetic f(Lcom/whoop/settings/notification/c;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/settings/notification/c;->k(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lcom/whoop/settings/notification/c;ZZLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/settings/notification/c;->l(ZZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final h(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/settings/notification/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/settings/notification/c;->c:Lin2/d;

    invoke-interface {v0}, Lin2/d;->b()Lq83/j;

    move-result-object v0

    new-instance v1, Lcom/whoop/settings/notification/c$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/settings/notification/c$a;-><init>(Lcom/whoop/settings/notification/c;Ljava/lang/String;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final i(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/settings/notification/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/settings/notification/c;->c:Lin2/d;

    invoke-interface {v0}, Lin2/d;->b()Lq83/j;

    move-result-object v0

    new-instance v1, Lcom/whoop/settings/notification/c$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/settings/notification/c$b;-><init>(Lcom/whoop/settings/notification/c;Ljava/lang/String;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final k(Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/settings/notification/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/settings/notification/c$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/settings/notification/c$d;

    iget v1, v0, Lcom/whoop/settings/notification/c$d;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/settings/notification/c$d;->E:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/whoop/settings/notification/c$d;

    invoke-direct {v0, p0, p1}, Lcom/whoop/settings/notification/c$d;-><init>(Lcom/whoop/settings/notification/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lcom/whoop/settings/notification/c$d;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lcom/whoop/settings/notification/c$d;->E:I

    const/4 v9, 0x2

    const/4 v2, 0x1

    const/4 v10, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v9, :cond_1

    iget-object v0, v6, Lcom/whoop/settings/notification/c$d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, v6, Lcom/whoop/settings/notification/c$d;->w:Ljava/lang/Object;

    check-cast v1, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p1, v2

    iget-object v2, p0, Lcom/whoop/settings/notification/c;->g:Ltr2/n;

    new-instance v5, Lcom/whoop/settings/notification/c$e;

    invoke-direct {v5, p0, v10}, Lcom/whoop/settings/notification/c$e;-><init>(Lcom/whoop/settings/notification/c;Lq83/d;)V

    iput p1, v6, Lcom/whoop/settings/notification/c$d;->E:I

    const/4 v3, 0x0

    const-string v4, "Failed to fetch settings notifications"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_4

    :cond_4
    :goto_2
    check-cast p1, Lu02/a;

    instance-of v1, p1, Lu02/a$c;

    if-eqz v1, :cond_5

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/domain/model/UserNotificationSettingsDto;

    invoke-virtual {p1}, Lcom/whoop/domain/model/UserNotificationSettingsDto;->getSettings()Ljava/util/List;

    move-result-object p1

    goto :goto_3

    :cond_5
    instance-of p1, p1, Lu02/a$b;

    if-eqz p1, :cond_a

    sget-object p1, Lm83/y;->w:Lm83/y;

    :goto_3
    iget-object v1, p0, Lcom/whoop/settings/notification/c;->e:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v2, "arrhythmia-notification-feature-android"

    invoke-interface {v1, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, p0, Lcom/whoop/settings/notification/c;->f:Lwe1/a;

    sget-object v2, Lcom/whoop/entitlements/Entitlement;->SHEPHERD:Lcom/whoop/entitlements/Entitlement;

    invoke-interface {v1, v2}, Lwe1/a;->b(Lcom/whoop/entitlements/Entitlement;)Z

    move-result v1

    if-eqz v1, :cond_9

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    iget-object v2, p0, Lcom/whoop/settings/notification/c;->g:Ltr2/n;

    new-instance v5, Lcom/whoop/settings/notification/c$f;

    invoke-direct {v5, p0, v10}, Lcom/whoop/settings/notification/c$f;-><init>(Lcom/whoop/settings/notification/c;Lq83/d;)V

    iput-object v10, v6, Lcom/whoop/settings/notification/c$d;->w:Ljava/lang/Object;

    iput-object p1, v6, Lcom/whoop/settings/notification/c$d;->x:Ljava/lang/Object;

    iput v9, v6, Lcom/whoop/settings/notification/c$d;->E:I

    const/4 v3, 0x0

    const-string v4, "Failed to fetch shepherd settings"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_6

    :goto_4
    return-object v0

    :cond_6
    move-object v0, p1

    move-object p1, v1

    :goto_5
    check-cast p1, Lu02/a;

    instance-of v1, p1, Lu02/a$c;

    if-eqz v1, :cond_7

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    move-object v10, p1

    check-cast v10, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;

    goto :goto_6

    :cond_7
    instance-of p1, p1, Lu02/a$b;

    if-eqz p1, :cond_8

    :goto_6
    move-object p1, v0

    goto :goto_7

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    :goto_7
    new-instance v0, Lcom/whoop/settings/notification/b$a;

    invoke-direct {v0, p1, v10}, Lcom/whoop/settings/notification/b$a;-><init>(Ljava/util/List;Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;)V

    return-object v0

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final l(ZZLq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lq83/d<",
            "-",
            "Lcom/whoop/settings/notification/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/settings/notification/c;->c:Lin2/d;

    invoke-interface {v0}, Lin2/d;->b()Lq83/j;

    move-result-object v0

    new-instance v1, Lcom/whoop/settings/notification/c$g;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, p0, v2}, Lcom/whoop/settings/notification/c$g;-><init>(ZZLcom/whoop/settings/notification/c;Lq83/d;)V

    invoke-static {v0, v1, p3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final j(Lec3/l;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/settings/notification/c$c;

    invoke-direct {v0, p1, p0}, Lcom/whoop/settings/notification/c$c;-><init>(Lec3/l;Lcom/whoop/settings/notification/c;)V

    return-object v0
.end method
