.class public final Lv70/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0086B\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lv70/g;",
        "",
        "Lf70/u;",
        "appDestinationRouter",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lf70/u;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lcom/whoop/navigation/e;",
        "fallbackAction",
        "Lv70/a;",
        "a",
        "(Lcom/whoop/navigation/e;Lq83/d;)Ljava/lang/Object;",
        "Lf70/u;",
        "b",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "activation_release"
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
.field private final a:Lf70/u;

.field private final b:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lf70/u;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "appDestinationRouter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv70/g;->a:Lf70/u;

    iput-object p2, p0, Lv70/g;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/navigation/e;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/navigation/e;",
            "Lq83/d<",
            "-",
            "Lv70/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lv70/g$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lv70/g$a;

    iget v1, v0, Lv70/g$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lv70/g$a;->z:I

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lv70/g$a;

    invoke-direct {v0, p0, p2}, Lv70/g$a;-><init>(Lv70/g;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v4, Lv70/g$a;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, Lv70/g$a;->z:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v4, Lv70/g$a;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lv70/g;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v1, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->APP_DESTINATION_TRIAL_ORDERED_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {p2, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result p2

    if-nez p2, :cond_3

    new-instance p2, Lv70/a$c;

    invoke-direct {p2, p1}, Lv70/a$c;-><init>(Lcom/whoop/navigation/e;)V

    return-object p2

    :cond_3
    iget-object v1, p0, Lv70/g;->a:Lf70/u;

    move p1, v2

    sget-object v2, Lf70/s;->TRIAL_ORDERED:Lf70/s;

    const/4 p2, 0x0

    iput-object p2, v4, Lv70/g$a;->w:Ljava/lang/Object;

    iput p1, v4, Lv70/g$a;->z:I

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lf70/u;->e(Lf70/u;Lf70/s;Ljava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_4

    return-object v0

    :cond_4
    :goto_2
    check-cast p2, Lf70/t;

    instance-of p1, p2, Lf70/t$b;

    if-eqz p1, :cond_5

    new-instance p1, Lv70/a$c;

    check-cast p2, Lf70/t$b;

    invoke-virtual {p2}, Lf70/t$b;->a()Lcom/whoop/navigation/e;

    move-result-object p2

    invoke-direct {p1, p2}, Lv70/a$c;-><init>(Lcom/whoop/navigation/e;)V

    return-object p1

    :cond_5
    instance-of p1, p2, Lf70/t$a;

    if-eqz p1, :cond_6

    new-instance p1, Lv70/a$a;

    check-cast p2, Lf70/t$a;

    invoke-virtual {p2}, Lf70/t$a;->a()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    move-result-object v0

    invoke-virtual {p2}, Lf70/t$a;->b()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, v0, p2}, Lv70/a$a;-><init>(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Ljava/lang/String;)V

    return-object p1

    :cond_6
    instance-of p1, p2, Lf70/t$c;

    if-eqz p1, :cond_7

    sget-object p1, Lv70/a$b;->a:Lv70/a$b;

    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
