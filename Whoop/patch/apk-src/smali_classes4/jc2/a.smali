.class public final Ljc2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljc2/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Ljc2/a;",
        "",
        "Lj02/o0;",
        "navigator",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lj02/o0;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lor2/s;",
        "legacyNavController",
        "Ll83/a0;",
        "a",
        "(Lor2/s;)V",
        "Lj02/o0;",
        "b",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "c",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final c:Ljc2/a$a;

.field public static final d:I


# instance fields
.field private final a:Lj02/o0;

.field private final b:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljc2/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljc2/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ljc2/a;->c:Ljc2/a$a;

    const/16 v0, 0x8

    sput v0, Ljc2/a;->d:I

    return-void
.end method

.method public constructor <init>(Lj02/o0;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljc2/a;->a:Lj02/o0;

    iput-object p2, p0, Ljc2/a;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method


# virtual methods
.method public final a(Lor2/s;)V
    .locals 13

    const-string v0, "legacyNavController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljc2/a;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "privacy-archv2-screen"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Ljc2/a;->a:Lj02/o0;

    new-instance v0, Lj02/m0$m1;

    new-instance v1, Lcom/whoop/navigation/models/ApiRequest;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const-string v2, "privacy-service-bff/v1/screen?source=settings"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/whoop/navigation/models/ApiRequest;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Lkotlinx/serialization/json/JsonElement;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v11, 0x3fe

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v0 .. v12}, Lj02/m0$m1;-><init>(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/GenericCachePolicy;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Leb/x0;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_0
    const-string v0, "whoop://com.whoop/privacyConsentFragment"

    invoke-virtual {p1, v0}, Lor2/s;->h(Ljava/lang/String;)V

    return-void
.end method
