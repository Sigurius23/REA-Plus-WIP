.class public final Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$this$flow:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field

.field final synthetic $start$inlined:Ljava/time/Instant;

.field final synthetic this$0:Lcom/whoop/bot/settings/CoachSettingsInteractor;


# direct methods
.method public constructor <init>(Lec3/m;Ljava/time/Instant;Lcom/whoop/bot/settings/CoachSettingsInteractor;)V
    .locals 0

    iput-object p2, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1;->$start$inlined:Ljava/time/Instant;

    iput-object p3, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1;->this$0:Lcom/whoop/bot/settings/CoachSettingsInteractor;

    iput-object p1, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1;->$$this$flow:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;

    iget v1, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;

    invoke-direct {v0, p0, p2}, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;-><init>(Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->label:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v2, :cond_6

    if-eq v2, v7, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-wide v4, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->J$0:J

    iget p1, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->I$0:I

    iget-object v2, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$3:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v6, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$2:Ljava/lang/Object;

    check-cast v6, Lu02/g;

    iget-object v7, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    iget-wide v5, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->J$0:J

    iget p1, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->I$0:I

    iget-object v2, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$3:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v9, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$2:Ljava/lang/Object;

    check-cast v9, Lu02/g;

    iget-object v10, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$1:Ljava/lang/Object;

    check-cast v10, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_4
    :goto_1
    iget-object p1, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lu02/g;

    iget-object p1, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_5
    iget-wide v9, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->J$0:J

    iget p1, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->I$0:I

    iget-object v2, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$3:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v11, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$2:Ljava/lang/Object;

    check-cast v11, Lu02/g;

    iget-object v12, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$1:Ljava/lang/Object;

    check-cast v12, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1;->$$this$flow:Lec3/m;

    move-object v11, p1

    check-cast v11, Lu02/g;

    iget-object p1, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1;->$start$inlined:Ljava/time/Instant;

    iget-object p2, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1;->this$0:Lcom/whoop/bot/settings/CoachSettingsInteractor;

    invoke-static {p2}, Lcom/whoop/bot/settings/CoachSettingsInteractor;->access$getClock$p(Lcom/whoop/bot/settings/CoachSettingsInteractor;)Ljava/time/Clock;

    move-result-object p2

    invoke-virtual {p2}, Ljava/time/Clock;->instant()Ljava/time/Instant;

    move-result-object p2

    invoke-static {p1, p2}, Ljava/time/Duration;->between(Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)Ljava/time/Duration;

    move-result-object p1

    invoke-virtual {p1}, Ljava/time/Duration;->toMillis()J

    move-result-wide v9

    const-wide/16 p1, 0x3e8

    sub-long/2addr p1, v9

    iput-object v8, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$0:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$1:Ljava/lang/Object;

    iput-object v11, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$2:Ljava/lang/Object;

    iput-object v2, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$3:Ljava/lang/Object;

    const/4 v12, 0x0

    iput v12, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->I$0:I

    iput-wide v9, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->J$0:J

    iput v7, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->label:I

    invoke-static {p1, p2, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto/16 :goto_5

    :cond_7
    move p1, v12

    :goto_2
    instance-of p2, v11, Lu02/e;

    if-eqz p2, :cond_8

    sget-object p2, Lcom/whoop/bot/settings/InternalEvent$ToggleError;->INSTANCE:Lcom/whoop/bot/settings/InternalEvent$ToggleError;

    iput-object v8, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$0:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$1:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$2:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$3:Ljava/lang/Object;

    iput p1, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->I$0:I

    iput-wide v9, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->J$0:J

    iput v6, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->label:I

    invoke-interface {v2, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    goto :goto_5

    :cond_8
    instance-of p2, v11, Lu02/h;

    if-eqz p2, :cond_c

    sget-object p2, Lcom/whoop/bot/settings/InternalEvent$SavingSuccess;->INSTANCE:Lcom/whoop/bot/settings/InternalEvent$SavingSuccess;

    iput-object v8, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$0:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$1:Ljava/lang/Object;

    iput-object v11, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$2:Ljava/lang/Object;

    iput-object v2, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$3:Ljava/lang/Object;

    iput p1, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->I$0:I

    iput-wide v9, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->J$0:J

    iput v5, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->label:I

    invoke-interface {v2, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_9

    goto :goto_5

    :cond_9
    move-wide v5, v9

    move-object v9, v11

    :goto_3
    sget-object p2, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object p2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v7, p2}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v10

    iput-object v8, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$0:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$1:Ljava/lang/Object;

    iput-object v9, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$2:Ljava/lang/Object;

    iput-object v2, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$3:Ljava/lang/Object;

    iput p1, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->I$0:I

    iput-wide v5, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->J$0:J

    iput v4, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->label:I

    invoke-static {v10, v11, v0}, Lbc3/m0;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_a

    goto :goto_5

    :cond_a
    move-wide v4, v5

    move-object v6, v9

    :goto_4
    new-instance p2, Lcom/whoop/bot/settings/InternalEvent$Success;

    check-cast v6, Lu02/h;

    invoke-virtual {v6}, Lu02/h;->a()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/bot/settings/CoachSettingsResponse;

    invoke-direct {p2, v6}, Lcom/whoop/bot/settings/InternalEvent$Success;-><init>(Lcom/whoop/bot/settings/CoachSettingsResponse;)V

    iput-object v8, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$0:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$1:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$2:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->L$3:Ljava/lang/Object;

    iput p1, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->I$0:I

    iput-wide v4, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->J$0:J

    iput v3, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1;->label:I

    invoke-interface {v2, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    :goto_5
    return-object v1

    :cond_b
    :goto_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
