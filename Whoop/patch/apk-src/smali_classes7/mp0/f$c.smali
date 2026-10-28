.class final Lmp0/f$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmp0/f;->D()V
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
    c = "com.whoop.coaching.sleepcoach.wizard.AlarmTurnOffTutorialViewModel$loadOnBoardingState$1"
    f = "AlarmTurnOffTutorialViewModel.kt"
    l = {
        0x48
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lmp0/f;


# direct methods
.method public constructor <init>(Lmp0/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmp0/f;",
            "Lq83/d<",
            "-",
            "Lmp0/f$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmp0/f$c;->x:Lmp0/f;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lmp0/f$c;

    iget-object v0, p0, Lmp0/f$c;->x:Lmp0/f;

    invoke-direct {p1, v0, p2}, Lmp0/f$c;-><init>(Lmp0/f;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lmp0/f$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lmp0/f$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lmp0/f$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lmp0/f$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lmp0/f$c;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lmp0/f$c;->x:Lmp0/f;

    invoke-static {p1}, Lmp0/f;->y(Lmp0/f;)Lop0/d;

    move-result-object p1

    iput v2, p0, Lmp0/f$c;->w:I

    invoke-virtual {p1, p0}, Lop0/d;->h(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lcom/whoop/data/remote/commons/Resource;

    invoke-virtual {p1}, Lcom/whoop/data/remote/commons/Resource;->getStatus()Lcom/whoop/data/remote/commons/Status;

    move-result-object v0

    sget-object v1, Lcom/whoop/data/remote/commons/Status;->SUCCESS:Lcom/whoop/data/remote/commons/Status;

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lmp0/f$c;->x:Lmp0/f;

    invoke-static {v0}, Lmp0/f;->w(Lmp0/f;)Lnp0/h;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/data/remote/commons/Resource;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/remote/domain/dto/sleepcoach/SleepCoachOnBoardingResponseDto;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/dto/sleepcoach/SleepCoachOnBoardingResponseDto;->getAlarmOffOnBoardingState()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    sget-object v2, Lnp0/k;->ALARM_OFF_ONBOARDING_STATE:Lnp0/k;

    invoke-virtual {v1, p1, v2}, Lnp0/h;->a(Ljava/lang/String;Lnp0/k;)Lnp0/g;

    move-result-object p1

    invoke-virtual {v0, p1}, Lmp0/f;->H(Lnp0/g;)V

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
