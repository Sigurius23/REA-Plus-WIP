.class final Lcom/whoop/settings/DebugFragment$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/settings/DebugFragment;->I3()V
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
    c = "com.whoop.settings.DebugFragment$clearAllDayZeroNotificationCardsTasksCompletion$1"
    f = "DebugFragment.kt"
    l = {
        0x21e,
        0x221,
        0x224,
        0x227,
        0x22a,
        0x22d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lcom/whoop/settings/DebugFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/settings/DebugFragment;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/settings/DebugFragment;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/settings/DebugFragment$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/settings/DebugFragment$c;->y:Lcom/whoop/settings/DebugFragment;

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

    new-instance p1, Lcom/whoop/settings/DebugFragment$c;

    iget-object v0, p0, Lcom/whoop/settings/DebugFragment$c;->y:Lcom/whoop/settings/DebugFragment;

    invoke-direct {p1, v0, p2}, Lcom/whoop/settings/DebugFragment$c;-><init>(Lcom/whoop/settings/DebugFragment;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/settings/DebugFragment$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/settings/DebugFragment$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/settings/DebugFragment$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/settings/DebugFragment$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/settings/DebugFragment$c;->x:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/settings/DebugFragment$c;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/home/domain/HomeApi;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_1
    iget-object v1, p0, Lcom/whoop/settings/DebugFragment$c;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/home/domain/HomeApi;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_2
    iget-object v1, p0, Lcom/whoop/settings/DebugFragment$c;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/home/domain/HomeApi;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_3
    iget-object v1, p0, Lcom/whoop/settings/DebugFragment$c;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/home/domain/HomeApi;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_4
    iget-object v1, p0, Lcom/whoop/settings/DebugFragment$c;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/home/domain/HomeApi;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_5
    iget-object v1, p0, Lcom/whoop/settings/DebugFragment$c;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/home/domain/HomeApi;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/settings/DebugFragment$c;->y:Lcom/whoop/settings/DebugFragment;

    invoke-static {p1}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object p1

    const-class v1, Lcom/whoop/home/domain/HomeApi;

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p1, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/home/domain/HomeApi;

    new-instance v1, Lcom/whoop/home/domain/dayOneTransition/TransitionOverlayCompleteBody;

    const/16 v4, 0x2e5b

    invoke-direct {v1, v4, v2}, Lcom/whoop/home/domain/dayOneTransition/TransitionOverlayCompleteBody;-><init>(IZ)V

    iput-object p1, p0, Lcom/whoop/settings/DebugFragment$c;->w:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, p0, Lcom/whoop/settings/DebugFragment$c;->x:I

    invoke-interface {p1, v1, p0}, Lcom/whoop/home/domain/HomeApi;->completeFeatureEducation(Lcom/whoop/home/domain/dayOneTransition/TransitionOverlayCompleteBody;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    goto/16 :goto_5

    :cond_0
    move-object v1, p1

    :goto_0
    new-instance p1, Lcom/whoop/home/domain/dayOneTransition/TransitionOverlayCompleteBody;

    const/16 v4, 0xfc

    invoke-direct {p1, v4, v2}, Lcom/whoop/home/domain/dayOneTransition/TransitionOverlayCompleteBody;-><init>(IZ)V

    iput-object v1, p0, Lcom/whoop/settings/DebugFragment$c;->w:Ljava/lang/Object;

    const/4 v4, 0x2

    iput v4, p0, Lcom/whoop/settings/DebugFragment$c;->x:I

    invoke-interface {v1, p1, p0}, Lcom/whoop/home/domain/HomeApi;->completeFeatureEducation(Lcom/whoop/home/domain/dayOneTransition/TransitionOverlayCompleteBody;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1

    goto :goto_5

    :cond_1
    :goto_1
    new-instance p1, Lcom/whoop/home/domain/dayOneTransition/TransitionOverlayCompleteBody;

    const/16 v4, 0xb87

    invoke-direct {p1, v4, v2}, Lcom/whoop/home/domain/dayOneTransition/TransitionOverlayCompleteBody;-><init>(IZ)V

    iput-object v1, p0, Lcom/whoop/settings/DebugFragment$c;->w:Ljava/lang/Object;

    const/4 v4, 0x3

    iput v4, p0, Lcom/whoop/settings/DebugFragment$c;->x:I

    invoke-interface {v1, p1, p0}, Lcom/whoop/home/domain/HomeApi;->completeFeatureEducation(Lcom/whoop/home/domain/dayOneTransition/TransitionOverlayCompleteBody;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_5

    :cond_2
    :goto_2
    new-instance p1, Lcom/whoop/home/domain/dayOneTransition/TransitionOverlayCompleteBody;

    const/16 v4, 0x2da

    invoke-direct {p1, v4, v2}, Lcom/whoop/home/domain/dayOneTransition/TransitionOverlayCompleteBody;-><init>(IZ)V

    iput-object v1, p0, Lcom/whoop/settings/DebugFragment$c;->w:Ljava/lang/Object;

    const/4 v4, 0x4

    iput v4, p0, Lcom/whoop/settings/DebugFragment$c;->x:I

    invoke-interface {v1, p1, p0}, Lcom/whoop/home/domain/HomeApi;->completeFeatureEducation(Lcom/whoop/home/domain/dayOneTransition/TransitionOverlayCompleteBody;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_5

    :cond_3
    :goto_3
    new-instance p1, Lcom/whoop/home/domain/dayOneTransition/TransitionOverlayCompleteBody;

    const/16 v4, 0x476e

    invoke-direct {p1, v4, v2}, Lcom/whoop/home/domain/dayOneTransition/TransitionOverlayCompleteBody;-><init>(IZ)V

    iput-object v3, p0, Lcom/whoop/settings/DebugFragment$c;->w:Ljava/lang/Object;

    const/4 v2, 0x5

    iput v2, p0, Lcom/whoop/settings/DebugFragment$c;->x:I

    invoke-interface {v1, p1, p0}, Lcom/whoop/home/domain/HomeApi;->completeFeatureEducation(Lcom/whoop/home/domain/dayOneTransition/TransitionOverlayCompleteBody;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_5

    :cond_4
    :goto_4
    iget-object p1, p0, Lcom/whoop/settings/DebugFragment$c;->y:Lcom/whoop/settings/DebugFragment;

    invoke-static {p1}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object p1

    const-class v1, Lcom/whoop/coaching/sleepcoach/data/network/api/SleepCoachOnboardingApi;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p1, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/coaching/sleepcoach/data/network/api/SleepCoachOnboardingApi;

    new-instance v1, Lcom/whoop/data/remote/domain/dto/sleepcoach/SleepCoachOnBoardingRequestDto;

    const-string v2, "SLEEP_COACH"

    invoke-direct {v1, v2, v2}, Lcom/whoop/data/remote/domain/dto/sleepcoach/SleepCoachOnBoardingRequestDto;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v3, p0, Lcom/whoop/settings/DebugFragment$c;->w:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, p0, Lcom/whoop/settings/DebugFragment$c;->x:I

    invoke-interface {p1, v1, p0}, Lcom/whoop/coaching/sleepcoach/data/network/api/SleepCoachOnboardingApi;->updateSleepCoachOnBoardingStatus(Lcom/whoop/data/remote/domain/dto/sleepcoach/SleepCoachOnBoardingRequestDto;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_5
    return-object v0

    :cond_5
    :goto_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
