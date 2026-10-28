.class final Lqp1/f$k;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqp1/f;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lqp1/e;",
        "previousState",
        "",
        "currentAction",
        "<anonymous>",
        "(Lqp1/e;Ljava/lang/Object;)Lqp1/e;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor$interact$2"
    f = "HormonalSettingsInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lqp1/f$k;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lqp1/e;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqp1/e;",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "-",
            "Lqp1/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lqp1/f$k;

    invoke-direct {v0, p3}, Lqp1/f$k;-><init>(Lq83/d;)V

    iput-object p1, v0, Lqp1/f$k;->x:Ljava/lang/Object;

    iput-object p2, v0, Lqp1/f$k;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lqp1/f$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lqp1/e;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lqp1/f$k;->f(Lqp1/e;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lqp1/f$k;->x:Ljava/lang/Object;

    check-cast v0, Lqp1/e;

    iget-object v1, p0, Lqp1/f$k;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lqp1/f$k;->w:I

    if-nez v2, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lqp1/g$a;

    if-eqz p1, :cond_0

    const-string p1, "null cannot be cast to non-null type com.whoop.hormonalinsights.settings.domain.HormonalSettingsDomainResult.Success"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lqp1/e$f;

    const/4 p1, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, v1, v2}, Lqp1/e$f;->b(Lqp1/e$f;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;ZILjava/lang/Object;)Lqp1/e$f;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "null cannot be cast to non-null type com.whoop.hormonalinsights.settings.domain.HormonalSettingsDomainResult"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lqp1/e;

    return-object v1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
