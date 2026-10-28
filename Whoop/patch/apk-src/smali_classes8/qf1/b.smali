.class final Lqf1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/data/repositories/FeatureFlagChecker;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lqf1/b;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "<init>",
        "()V",
        "",
        "featureName",
        "",
        "isFeatureEnabled",
        "(Ljava/lang/String;)Z",
        "Lcom/whoop/data/repositories/OnboardingFeatureFlag;",
        "featureFlag",
        "(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z",
        "feature-flag-ui_release"
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
.field public static final a:Lqf1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqf1/b;

    invoke-direct {v0}, Lqf1/b;-><init>()V

    sput-object v0, Lqf1/b;->a:Lqf1/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge getFeatureFlagsFlow()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    invoke-super {p0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->getFeatureFlagsFlow()Lec3/t1;

    move-result-object v0

    return-object v0
.end method

.method public isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z
    .locals 1

    .line 1
    const-string v0, "featureFlag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public isFeatureEnabled(Ljava/lang/String;)Z
    .locals 1

    .line 2
    const-string v0, "featureName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method
