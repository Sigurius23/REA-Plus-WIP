.class final Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$reportLwtReset$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->reportLwtReset(Lorg/joda/time/Instant;)V
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
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.data.repositories.SmartAlarmTriggerRepository$reportLwtReset$1"
    f = "SmartAlarmTriggerRepository.kt"
    l = {
        0x1e2
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $dto:Lcom/whoop/smart/alarm/data/network/model/StrapLatestWakeTimeDto;

.field final synthetic $newLwt:Lorg/joda/time/Instant;

.field label:I

.field final synthetic this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lcom/whoop/smart/alarm/data/network/model/StrapLatestWakeTimeDto;Lorg/joda/time/Instant;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;",
            "Lcom/whoop/smart/alarm/data/network/model/StrapLatestWakeTimeDto;",
            "Lorg/joda/time/Instant;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$reportLwtReset$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$reportLwtReset$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    iput-object p2, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$reportLwtReset$1;->$dto:Lcom/whoop/smart/alarm/data/network/model/StrapLatestWakeTimeDto;

    iput-object p3, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$reportLwtReset$1;->$newLwt:Lorg/joda/time/Instant;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$reportLwtReset$1;

    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$reportLwtReset$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    iget-object v1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$reportLwtReset$1;->$dto:Lcom/whoop/smart/alarm/data/network/model/StrapLatestWakeTimeDto;

    iget-object v2, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$reportLwtReset$1;->$newLwt:Lorg/joda/time/Instant;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$reportLwtReset$1;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lcom/whoop/smart/alarm/data/network/model/StrapLatestWakeTimeDto;Lorg/joda/time/Instant;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$reportLwtReset$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$reportLwtReset$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$reportLwtReset$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$reportLwtReset$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$reportLwtReset$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$reportLwtReset$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getSmartAlarmApi$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;

    move-result-object p1

    iget-object v1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$reportLwtReset$1;->$dto:Lcom/whoop/smart/alarm/data/network/model/StrapLatestWakeTimeDto;

    iput v2, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$reportLwtReset$1;->label:I

    invoke-interface {p1, v1, p0}, Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;->putNewStrapLatestWakeTime(Lcom/whoop/smart/alarm/data/network/model/StrapLatestWakeTimeDto;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v0, :cond_2

    return-object v0

    :goto_0
    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$reportLwtReset$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    const-string v1, "WakeWindow Failed to update backend with strap\'s latest wake time"

    invoke-virtual {v0, p1, v1}, Lhj0/n;->logRetrofitSuspendException(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/lang/String;

    sget-object p1, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker;->F:Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$a;

    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$reportLwtReset$1;->this$0:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    invoke-static {v0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getWorkManager$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Lic/p0;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$reportLwtReset$1;->$newLwt:Lorg/joda/time/Instant;

    invoke-virtual {p1, v0, v1}, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$a;->b(Lic/p0;Lorg/joda/time/Instant;)Lic/e0;

    :cond_2
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
