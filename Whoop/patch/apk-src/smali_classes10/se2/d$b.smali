.class final Lse2/d$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lse2/d;->k(Lec3/m;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lpg3/v0;",
        "Ll83/a0;",
        "<anonymous>",
        "()Lpg3/v0;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.sleep.coach.alarmWarning.domain.TurnoffAlarmWarningInteractor$callPostSmartAlarmOverride$2$overrideResponse$1"
    f = "TurnoffAlarmWarningInteractor.kt"
    l = {
        0x69
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lse2/d;

.field final synthetic z:Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;


# direct methods
.method public constructor <init>(Lse2/d;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lse2/d;",
            "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;",
            "Lq83/d<",
            "-",
            "Lse2/d$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lse2/d$b;->y:Lse2/d;

    iput-object p2, p0, Lse2/d$b;->z:Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

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

    new-instance v0, Lse2/d$b;

    iget-object v1, p0, Lse2/d$b;->y:Lse2/d;

    iget-object v2, p0, Lse2/d$b;->z:Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-direct {v0, v1, v2, p1}, Lse2/d$b;-><init>(Lse2/d;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lse2/d$b;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lse2/d$b;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lse2/d$b;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lse2/d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lse2/d$b;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lse2/d$b;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lse2/d$b;->y:Lse2/d;

    invoke-static {p1}, Lse2/d;->f(Lse2/d;)Lzr2/a;

    move-result-object v3

    iget-object p1, p0, Lse2/d$b;->z:Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-virtual {p1}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getUpperBoundLocalTime()Lorg/joda/time/LocalTime;

    move-result-object p1

    const/4 v1, 0x2

    const/4 v9, 0x0

    invoke-static {p1, v9, v1, v9}, Ltf2/a;->b(Lorg/joda/time/LocalTime;Lorg/joda/time/DateTime;ILjava/lang/Object;)Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-virtual {p1}, Lorg/joda/time/DateTime;->toLocalTime()Lorg/joda/time/LocalTime;

    move-result-object v5

    const/4 v7, 0x5

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lzr2/b;->c(Lzr2/a;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalTime;Lorg/joda/time/DateTimeZone;ILjava/lang/Object;)Lorg/joda/time/DateTime;

    move-result-object p1

    sget-object v1, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-virtual {p1, v1}, Lorg/joda/time/DateTime;->withZone(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractDateTime;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "toString(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lse2/d$b;->y:Lse2/d;

    invoke-static {v1}, Lse2/d;->i(Lse2/d;)Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;

    move-result-object v1

    new-instance v3, Lcom/whoop/sleep/coach/data/network/model/AlarmOverrideDto;

    invoke-direct {v3, p1, v9}, Lcom/whoop/sleep/coach/data/network/model/AlarmOverrideDto;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v9, p0, Lse2/d$b;->w:Ljava/lang/Object;

    iput v2, p0, Lse2/d$b;->x:I

    invoke-interface {v1, v3, p0}, Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;->postSmartAlarmOverride(Lcom/whoop/sleep/coach/data/network/model/AlarmOverrideDto;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
