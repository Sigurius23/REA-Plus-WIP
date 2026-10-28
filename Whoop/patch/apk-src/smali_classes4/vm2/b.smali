.class public final Lvm2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0008\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lvm2/b;",
        "",
        "Lf70/u;",
        "appDestinationRouter",
        "Lo02/d;",
        "navigationReducer",
        "",
        "homeFragmentDestinationId",
        "homeGraphDestinationId",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lf70/u;Lo02/d;IILcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V",
        "Lvm2/g;",
        "a",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lf70/u;",
        "b",
        "Lo02/d;",
        "c",
        "I",
        "d",
        "e",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "f",
        "Ltr2/n;",
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


# instance fields
.field private final a:Lf70/u;

.field private final b:Lo02/d;

.field private final c:I

.field private final d:I

.field private final e:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final f:Ltr2/n;


# direct methods
.method public constructor <init>(Lf70/u;Lo02/d;IILcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V
    .locals 1

    const-string v0, "appDestinationRouter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvm2/b;->a:Lf70/u;

    .line 3
    iput-object p2, p0, Lvm2/b;->b:Lo02/d;

    .line 4
    iput p3, p0, Lvm2/b;->c:I

    .line 5
    iput p4, p0, Lvm2/b;->d:I

    .line 6
    iput-object p5, p0, Lvm2/b;->e:Lcom/whoop/data/repositories/FeatureFlagChecker;

    .line 7
    iput-object p6, p0, Lvm2/b;->f:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lf70/u;Lo02/d;IILcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    .line 8
    sget-object p6, Ltr2/n;->a:Ltr2/n$a;

    const-string p7, "AppDestinationHelper"

    invoke-virtual {p6, p7}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p6

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 9
    invoke-direct/range {v0 .. v6}, Lvm2/b;-><init>(Lf70/u;Lo02/d;IILcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public final a(Lq83/d;)Ljava/lang/Object;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lvm2/g;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lvm2/b$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lvm2/b$a;

    iget v3, v2, Lvm2/b$a;->E:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lvm2/b$a;->E:I

    :goto_0
    move-object v6, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lvm2/b$a;

    invoke-direct {v2, v0, v1}, Lvm2/b$a;-><init>(Lvm2/b;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v6, Lvm2/b$a;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v6, Lvm2/b$a;->E:I

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v3, :cond_2

    if-ne v3, v9, :cond_1

    iget v2, v6, Lvm2/b$a;->x:I

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lvm2/b;->e:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v3, "pop-to-home-graph"

    invoke-interface {v1, v3}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget v3, v0, Lvm2/b;->d:I

    :goto_2
    move v11, v3

    goto :goto_3

    :cond_3
    iget v3, v0, Lvm2/b;->c:I

    goto :goto_2

    :goto_3
    iget-object v3, v0, Lvm2/b;->f:Ltr2/n;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "POP_TO_HOME_GRAPH enabled="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, ", popUpToId="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v5, v10, [Lqr2/a$a;

    invoke-interface {v3, v4, v5}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v3, v0, Lvm2/b;->a:Lf70/u;

    sget-object v4, Lf70/s;->APP_LAUNCH:Lf70/s;

    iput-boolean v1, v6, Lvm2/b$a;->w:Z

    iput v11, v6, Lvm2/b$a;->x:I

    iput v9, v6, Lvm2/b$a;->E:I

    const/4 v5, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, Lf70/u;->e(Lf70/u;Lf70/s;Ljava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_4

    return-object v2

    :cond_4
    move v2, v11

    :goto_4
    check-cast v1, Lf70/t;

    instance-of v3, v1, Lf70/t$b;

    const/4 v4, 0x0

    if-eqz v3, :cond_9

    check-cast v1, Lf70/t$b;

    invoke-virtual {v1}, Lf70/t$b;->a()Lcom/whoop/navigation/e;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v3

    sget-object v5, Lcom/whoop/navigation/AppScreen$u2;->w:Lcom/whoop/navigation/AppScreen$u2;

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    goto/16 :goto_5

    :cond_5
    iget-object v3, v0, Lvm2/b;->b:Lo02/d;

    invoke-virtual {v1}, Lf70/t$b;->a()Lcom/whoop/navigation/e;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v5

    invoke-interface {v3, v5}, Lo02/d;->a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;

    move-result-object v3

    instance-of v5, v3, Lj02/m0$m1;

    if-eqz v5, :cond_7

    iget-object v1, v0, Lvm2/b;->e:Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v4, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->FIX_HOME_FLASH_ON_REENTRY:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {v1, v4}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result v1

    new-instance v4, Leb/w0;

    invoke-direct {v4}, Leb/w0;-><init>()V

    invoke-static {v4, v2, v9}, Leb/w0;->b(Leb/w0;IZ)V

    if-nez v1, :cond_6

    invoke-static {v4}, Lor2/c1;->f(Leb/w0;)Leb/w0;

    :cond_6
    new-instance v1, Lvm2/g;

    move-object v11, v3

    check-cast v11, Lj02/m0$m1;

    invoke-virtual {v4}, Leb/w0;->a()Leb/x0;

    move-result-object v19

    const/16 v22, 0x37f

    const/16 v23, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v11 .. v23}, Lj02/m0$m1;->c(Lj02/m0$m1;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/GenericCachePolicy;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Leb/x0;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lj02/m0$m1;

    move-result-object v2

    invoke-direct {v1, v2, v10}, Lvm2/g;-><init>(Lj02/m0;Z)V

    return-object v1

    :cond_7
    instance-of v2, v3, Lj02/m0;

    if-eqz v2, :cond_8

    new-instance v1, Lvm2/g;

    check-cast v3, Lj02/m0;

    invoke-direct {v1, v3, v10}, Lvm2/g;-><init>(Lj02/m0;Z)V

    return-object v1

    :cond_8
    iget-object v2, v0, Lvm2/b;->f:Ltr2/n;

    invoke-virtual {v1}, Lf70/t$b;->a()Lcom/whoop/navigation/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "app/destination returned screen \'"

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\' but NavigationReducer could not map it"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v3, v10, [Lqr2/a$a;

    invoke-interface {v2, v1, v3}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v4

    :cond_9
    instance-of v3, v1, Lf70/t$a;

    if-eqz v3, :cond_a

    new-instance v3, Lvm2/g;

    new-instance v4, Lj02/m0$d;

    new-instance v5, Ljava/lang/Integer;

    invoke-direct {v5, v2}, Ljava/lang/Integer;-><init>(I)V

    check-cast v1, Lf70/t$a;

    invoke-virtual {v1}, Lf70/t$a;->a()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lf70/t$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v5, v2, v1}, Lj02/m0$d;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v3, v4, v10}, Lvm2/g;-><init>(Lj02/m0;Z)V

    return-object v3

    :cond_a
    instance-of v1, v1, Lf70/t$c;

    if-eqz v1, :cond_b

    :goto_5
    return-object v4

    :cond_b
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
