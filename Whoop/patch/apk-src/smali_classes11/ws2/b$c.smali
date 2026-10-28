.class final Lws2/b$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lws2/b;->k(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weeklyplan.customizeplan.domain.CustomizePlanApiInteractor$getCustomizationFlow$response$1"
    f = "CustomizePlanApiInteractor.kt"
    l = {
        0x37
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lws2/b;

.field final synthetic z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lws2/b;Ljava/util/List;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lws2/b;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Lws2/b$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lws2/b$c;->y:Lws2/b;

    iput-object p2, p0, Lws2/b$c;->z:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lws2/b$c;

    iget-object v1, p0, Lws2/b$c;->y:Lws2/b;

    iget-object v2, p0, Lws2/b$c;->z:Ljava/util/List;

    invoke-direct {v0, v1, v2, p1}, Lws2/b$c;-><init>(Lws2/b;Ljava/util/List;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lws2/b$c;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lws2/b$c;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lws2/b$c;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lws2/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lws2/b$c;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lws2/b$c;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponseMapper;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponseMapper;->INSTANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponseMapper;

    iget-object v1, p0, Lws2/b$c;->y:Lws2/b;

    invoke-static {v1}, Lws2/b;->e(Lws2/b;)Lcom/whoop/weeklyplan/api/WeeklyPlanApi;

    move-result-object v1

    iget-object v3, p0, Lws2/b$c;->z:Ljava/util/List;

    iput-object p1, p0, Lws2/b$c;->w:Ljava/lang/Object;

    iput v2, p0, Lws2/b$c;->x:I

    invoke-interface {v1, v3, p0}, Lcom/whoop/weeklyplan/api/WeeklyPlanApi;->customizeWeeklyPlanKotlinx(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    move-object p1, v1

    :goto_0
    check-cast p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponseKotlinx;

    invoke-virtual {v0, p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponseMapper;->mapKotlinxToGson(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponseKotlinx;)Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    move-result-object p1

    return-object p1
.end method
