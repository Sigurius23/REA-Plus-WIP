.class final Lri1/j$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lri1/j;->t(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Lri1/h;",
        "<anonymous>",
        "(Lbc3/c0;)Lri1/h;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.health.domain.HealthTabInteractor$getOfflineData$2"
    f = "HealthTabInteractor.kt"
    l = {
        0x101,
        0x106
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic E:Ljava/lang/Object;

.field final synthetic F:Lri1/j;

.field w:Ljava/lang/Object;

.field x:Z

.field y:Z

.field z:I


# direct methods
.method public constructor <init>(Lri1/j;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lri1/j;",
            "Lq83/d<",
            "-",
            "Lri1/j$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lri1/j$f;->F:Lri1/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lri1/j$f;

    iget-object v1, p0, Lri1/j$f;->F:Lri1/j;

    invoke-direct {v0, v1, p2}, Lri1/j$f;-><init>(Lri1/j;Lq83/d;)V

    iput-object p1, v0, Lri1/j$f;->E:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Lri1/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lri1/j$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lri1/j$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lri1/j$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lri1/j$f;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lri1/j$f;->E:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lri1/j$f;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lri1/j$f;->w:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-boolean v0, p0, Lri1/j$f;->y:Z

    iget-boolean v2, p0, Lri1/j$f;->x:Z

    iget-object v4, p0, Lri1/j$f;->w:Ljava/lang/Object;

    check-cast v4, Lbc3/i0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lri1/j$f$a;

    iget-object v2, p0, Lri1/j$f;->F:Lri1/j;

    invoke-direct {p1, v2, v5}, Lri1/j$f$a;-><init>(Lri1/j;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {v0, v5, p1, v2}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object p1

    iget-object v0, p0, Lri1/j$f;->F:Lri1/j;

    invoke-static {v0}, Lri1/j;->e(Lri1/j;)Lwe1/a;

    move-result-object v0

    sget-object v2, Lcom/whoop/entitlements/Entitlement;->LABRADOR:Lcom/whoop/entitlements/Entitlement;

    invoke-interface {v0, v2}, Lwe1/a;->b(Lcom/whoop/entitlements/Entitlement;)Z

    move-result v2

    iget-object v0, p0, Lri1/j$f;->F:Lri1/j;

    invoke-static {v0}, Lri1/j;->f(Lri1/j;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v0

    const-string v6, "labrador-entrypoint-bff"

    invoke-interface {v0, v6}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v2, :cond_5

    if-eqz v0, :cond_5

    iput-object v5, p0, Lri1/j$f;->E:Ljava/lang/Object;

    iput-object v5, p0, Lri1/j$f;->w:Ljava/lang/Object;

    iput-boolean v2, p0, Lri1/j$f;->x:Z

    iput-boolean v0, p0, Lri1/j$f;->y:Z

    iput v4, p0, Lri1/j$f;->z:I

    invoke-virtual {p1, p0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lri1/j$f;->F:Lri1/j;

    iput-object v5, p0, Lri1/j$f;->E:Ljava/lang/Object;

    iput-object v5, p0, Lri1/j$f;->w:Ljava/lang/Object;

    iput-boolean v2, p0, Lri1/j$f;->x:Z

    iput-boolean v0, p0, Lri1/j$f;->y:Z

    iput v3, p0, Lri1/j$f;->z:I

    invoke-static {p1, p0}, Lri1/j;->l(Lri1/j;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    :goto_2
    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance v0, Lcom/whoop/health/domain/models/HealthTabSectionModel;

    const-string v1, "NORMAL"

    invoke-direct {v0, p1, v1}, Lcom/whoop/health/domain/models/HealthTabSectionModel;-><init>(Ljava/util/List;Ljava/lang/String;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    new-instance v2, Lcom/whoop/health/domain/models/HealthTabResponse;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xe

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/whoop/health/domain/models/HealthTabResponse;-><init>(Ljava/util/List;Lcom/whoop/health/domain/models/AnalyticsData;Ljava/lang/String;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lri1/h;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x3d

    const/4 v12, 0x0

    move-object v6, v2

    invoke-direct/range {v4 .. v12}, Lri1/h;-><init>(Lri1/g;Lcom/whoop/health/domain/models/HealthTabResponse;ZZLyg2/d;Lsl1/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_5
    new-instance v5, Lri1/h;

    sget-object v6, Lri1/g$f;->a:Lri1/g$f;

    const/16 v12, 0x3e

    const/4 v13, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v13}, Lri1/h;-><init>(Lri1/g;Lcom/whoop/health/domain/models/HealthTabResponse;ZZLyg2/d;Lsl1/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5
.end method
