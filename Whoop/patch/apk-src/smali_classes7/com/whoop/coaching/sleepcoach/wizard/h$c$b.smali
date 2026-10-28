.class final Lcom/whoop/coaching/sleepcoach/wizard/h$c$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/coaching/sleepcoach/wizard/h$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00020\u00042\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;",
        "cachedAlarm",
        "Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;",
        "userInputAlarm",
        "Ll83/k;",
        "<anonymous>",
        "(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;)Ll83/k;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.coaching.sleepcoach.wizard.TonightsSleepContainerViewModel$onCreate$1$3"
    f = "TonightsSleepContainerViewModel.kt"
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
            "Lcom/whoop/coaching/sleepcoach/wizard/h$c$b;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;",
            "Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;",
            "Lq83/d<",
            "-",
            "Ll83/k;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/coaching/sleepcoach/wizard/h$c$b;

    invoke-direct {v0, p3}, Lcom/whoop/coaching/sleepcoach/wizard/h$c$b;-><init>(Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/coaching/sleepcoach/wizard/h$c$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/coaching/sleepcoach/wizard/h$c$b;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/coaching/sleepcoach/wizard/h$c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    check-cast p2, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/coaching/sleepcoach/wizard/h$c$b;->f(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c$b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c$b;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/coaching/sleepcoach/wizard/h$c$b;->w:I

    if-nez v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Ll83/k;

    invoke-direct {p1, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
