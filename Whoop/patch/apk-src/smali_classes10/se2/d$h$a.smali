.class final Lse2/d$h$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lse2/d$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lcom/whoop/sleep/coach/data/network/model/EligibilityResponseDto;"
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
    c = "com.whoop.sleep.coach.alarmWarning.domain.TurnoffAlarmWarningInteractor$interact$2$2$response$1"
    f = "TurnoffAlarmWarningInteractor.kt"
    l = {
        0x3c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lse2/d;

.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field final synthetic z:Lse2/a;


# direct methods
.method public constructor <init>(Lse2/a;Lse2/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lse2/a;",
            "Lse2/d;",
            "Lq83/d<",
            "-",
            "Lse2/d$h$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lse2/d$h$a;->z:Lse2/a;

    iput-object p2, p0, Lse2/d$h$a;->E:Lse2/d;

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

    new-instance v0, Lse2/d$h$a;

    iget-object v1, p0, Lse2/d$h$a;->z:Lse2/a;

    iget-object v2, p0, Lse2/d$h$a;->E:Lse2/d;

    invoke-direct {v0, v1, v2, p1}, Lse2/d$h$a;-><init>(Lse2/a;Lse2/d;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lse2/d$h$a;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Lcom/whoop/sleep/coach/data/network/model/EligibilityResponseDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lse2/d$h$a;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lse2/d$h$a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lse2/d$h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lse2/d$h$a;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lse2/d$h$a;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lse2/d$h$a;->z:Lse2/a;

    invoke-virtual {p1}, Lse2/a;->d()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lse2/d$h$a;->E:Lse2/d;

    iget-object v1, p0, Lse2/d$h$a;->z:Lse2/a;

    invoke-static {p1}, Lse2/d;->i(Lse2/d;)Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;

    move-result-object p1

    invoke-virtual {v1}, Lse2/a;->d()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    iput-object v3, p0, Lse2/d$h$a;->w:Ljava/lang/Object;

    const/4 v3, 0x0

    iput v3, p0, Lse2/d$h$a;->x:I

    iput v2, p0, Lse2/d$h$a;->y:I

    invoke-interface {p1, v1, p0}, Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;->getEligibility(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lcom/whoop/sleep/coach/data/network/model/EligibilityResponseDto;

    if-eqz p1, :cond_3

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/Exception;

    const-string v0, "Cannot make getEligibility call notificationId not found"

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
.end method
