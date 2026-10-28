.class final Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$4;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/bot/settings/CoachSettingsInteractor;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/whoop/bot/settings/CoachSettingsInternalState;",
        "internalState",
        "action",
        "Lcom/whoop/bot/settings/InternalEvent;"
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
    c = "com.whoop.bot.settings.CoachSettingsInteractor$interact$4"
    f = "CoachSettingsInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$4;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/whoop/bot/settings/CoachSettingsInternalState;Lcom/whoop/bot/settings/InternalEvent;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/bot/settings/CoachSettingsInternalState;",
            "Lcom/whoop/bot/settings/InternalEvent;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/bot/settings/CoachSettingsInternalState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$4;

    invoke-direct {v0, p3}, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$4;-><init>(Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$4;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$4;->L$1:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/whoop/bot/settings/CoachSettingsInternalState;

    check-cast p2, Lcom/whoop/bot/settings/InternalEvent;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$4;->invoke(Lcom/whoop/bot/settings/CoachSettingsInternalState;Lcom/whoop/bot/settings/InternalEvent;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$4;->L$0:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/bot/settings/CoachSettingsInternalState;

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$4;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/bot/settings/InternalEvent;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$4;->label:I

    if-nez v2, :cond_8

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lcom/whoop/bot/settings/InternalEvent$DismissError;->INSTANCE:Lcom/whoop/bot/settings/InternalEvent$DismissError;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance v2, Lcom/whoop/bot/settings/CoachSettingsDomainState$Success;

    invoke-virtual {v1}, Lcom/whoop/bot/settings/CoachSettingsInternalState;->getResponse()Lcom/whoop/bot/settings/CoachSettingsResponse;

    move-result-object p1

    invoke-direct {v2, p1}, Lcom/whoop/bot/settings/CoachSettingsDomainState$Success;-><init>(Lcom/whoop/bot/settings/CoachSettingsResponse;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/whoop/bot/settings/CoachSettingsInternalState;->copy$default(Lcom/whoop/bot/settings/CoachSettingsInternalState;Lcom/whoop/bot/settings/CoachSettingsDomainState;Lcom/whoop/bot/settings/CoachSettingsResponse;Lcom/whoop/bot/settings/InternalEvent$Toggle;ILjava/lang/Object;)Lcom/whoop/bot/settings/CoachSettingsInternalState;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lcom/whoop/bot/settings/InternalEvent$LoadSettingsError;->INSTANCE:Lcom/whoop/bot/settings/InternalEvent$LoadSettingsError;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object v2, Lcom/whoop/bot/settings/CoachSettingsDomainState$Error;->INSTANCE:Lcom/whoop/bot/settings/CoachSettingsDomainState$Error;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/whoop/bot/settings/CoachSettingsInternalState;->copy$default(Lcom/whoop/bot/settings/CoachSettingsInternalState;Lcom/whoop/bot/settings/CoachSettingsDomainState;Lcom/whoop/bot/settings/CoachSettingsResponse;Lcom/whoop/bot/settings/InternalEvent$Toggle;ILjava/lang/Object;)Lcom/whoop/bot/settings/CoachSettingsInternalState;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object p1, Lcom/whoop/bot/settings/InternalEvent$Loading;->INSTANCE:Lcom/whoop/bot/settings/InternalEvent$Loading;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object v2, Lcom/whoop/bot/settings/CoachSettingsDomainState$Loading;->INSTANCE:Lcom/whoop/bot/settings/CoachSettingsDomainState$Loading;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/whoop/bot/settings/CoachSettingsInternalState;->copy$default(Lcom/whoop/bot/settings/CoachSettingsInternalState;Lcom/whoop/bot/settings/CoachSettingsDomainState;Lcom/whoop/bot/settings/CoachSettingsResponse;Lcom/whoop/bot/settings/InternalEvent$Toggle;ILjava/lang/Object;)Lcom/whoop/bot/settings/CoachSettingsInternalState;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object p1, Lcom/whoop/bot/settings/InternalEvent$Saving;->INSTANCE:Lcom/whoop/bot/settings/InternalEvent$Saving;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object v2, Lcom/whoop/bot/settings/CoachSettingsDomainState$Saving;->INSTANCE:Lcom/whoop/bot/settings/CoachSettingsDomainState$Saving;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/whoop/bot/settings/CoachSettingsInternalState;->copy$default(Lcom/whoop/bot/settings/CoachSettingsInternalState;Lcom/whoop/bot/settings/CoachSettingsDomainState;Lcom/whoop/bot/settings/CoachSettingsResponse;Lcom/whoop/bot/settings/InternalEvent$Toggle;ILjava/lang/Object;)Lcom/whoop/bot/settings/CoachSettingsInternalState;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of p1, v0, Lcom/whoop/bot/settings/InternalEvent$Success;

    if-eqz p1, :cond_4

    new-instance v2, Lcom/whoop/bot/settings/CoachSettingsDomainState$Success;

    check-cast v0, Lcom/whoop/bot/settings/InternalEvent$Success;

    invoke-virtual {v0}, Lcom/whoop/bot/settings/InternalEvent$Success;->getResponse()Lcom/whoop/bot/settings/CoachSettingsResponse;

    move-result-object p1

    invoke-direct {v2, p1}, Lcom/whoop/bot/settings/CoachSettingsDomainState$Success;-><init>(Lcom/whoop/bot/settings/CoachSettingsResponse;)V

    invoke-virtual {v0}, Lcom/whoop/bot/settings/InternalEvent$Success;->getResponse()Lcom/whoop/bot/settings/CoachSettingsResponse;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/whoop/bot/settings/CoachSettingsInternalState;->copy$default(Lcom/whoop/bot/settings/CoachSettingsInternalState;Lcom/whoop/bot/settings/CoachSettingsDomainState;Lcom/whoop/bot/settings/CoachSettingsResponse;Lcom/whoop/bot/settings/InternalEvent$Toggle;ILjava/lang/Object;)Lcom/whoop/bot/settings/CoachSettingsInternalState;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, v0, Lcom/whoop/bot/settings/InternalEvent$Toggle;

    if-eqz p1, :cond_5

    sget-object v2, Lcom/whoop/bot/settings/CoachSettingsDomainState$Saving;->INSTANCE:Lcom/whoop/bot/settings/CoachSettingsDomainState$Saving;

    move-object v4, v0

    check-cast v4, Lcom/whoop/bot/settings/InternalEvent$Toggle;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/whoop/bot/settings/CoachSettingsInternalState;->copy$default(Lcom/whoop/bot/settings/CoachSettingsInternalState;Lcom/whoop/bot/settings/CoachSettingsDomainState;Lcom/whoop/bot/settings/CoachSettingsResponse;Lcom/whoop/bot/settings/InternalEvent$Toggle;ILjava/lang/Object;)Lcom/whoop/bot/settings/CoachSettingsInternalState;

    move-result-object p1

    return-object p1

    :cond_5
    sget-object p1, Lcom/whoop/bot/settings/InternalEvent$ToggleError;->INSTANCE:Lcom/whoop/bot/settings/InternalEvent$ToggleError;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    sget-object v2, Lcom/whoop/bot/settings/CoachSettingsDomainState$Error;->INSTANCE:Lcom/whoop/bot/settings/CoachSettingsDomainState$Error;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/whoop/bot/settings/CoachSettingsInternalState;->copy$default(Lcom/whoop/bot/settings/CoachSettingsInternalState;Lcom/whoop/bot/settings/CoachSettingsDomainState;Lcom/whoop/bot/settings/CoachSettingsResponse;Lcom/whoop/bot/settings/InternalEvent$Toggle;ILjava/lang/Object;)Lcom/whoop/bot/settings/CoachSettingsInternalState;

    move-result-object p1

    return-object p1

    :cond_6
    sget-object p1, Lcom/whoop/bot/settings/InternalEvent$SavingSuccess;->INSTANCE:Lcom/whoop/bot/settings/InternalEvent$SavingSuccess;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    sget-object v2, Lcom/whoop/bot/settings/CoachSettingsDomainState$Saved;->INSTANCE:Lcom/whoop/bot/settings/CoachSettingsDomainState$Saved;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/whoop/bot/settings/CoachSettingsInternalState;->copy$default(Lcom/whoop/bot/settings/CoachSettingsInternalState;Lcom/whoop/bot/settings/CoachSettingsDomainState;Lcom/whoop/bot/settings/CoachSettingsResponse;Lcom/whoop/bot/settings/InternalEvent$Toggle;ILjava/lang/Object;)Lcom/whoop/bot/settings/CoachSettingsInternalState;

    move-result-object p1

    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
