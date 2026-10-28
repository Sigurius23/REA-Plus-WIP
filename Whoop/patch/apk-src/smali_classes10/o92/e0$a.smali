.class final Lo92/e0$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo92/e0;->a(Lm92/f;Landroid/content/Context;)V
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
    c = "com.whoop.service.push.notifications.SmartAlarmTriggeredPushNotification$perform$1"
    f = "SmartAlarmTriggeredPushNotification.kt"
    l = {
        0x1c,
        0x1e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lorg/joda/time/DateTime;

.field final synthetic F:Lm92/f;

.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field final synthetic z:Lo92/e0;


# direct methods
.method public constructor <init>(Lo92/e0;Lorg/joda/time/DateTime;Lm92/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo92/e0;",
            "Lorg/joda/time/DateTime;",
            "Lm92/f;",
            "Lq83/d<",
            "-",
            "Lo92/e0$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo92/e0$a;->z:Lo92/e0;

    iput-object p2, p0, Lo92/e0$a;->E:Lorg/joda/time/DateTime;

    iput-object p3, p0, Lo92/e0$a;->F:Lm92/f;

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

    new-instance p1, Lo92/e0$a;

    iget-object v0, p0, Lo92/e0$a;->z:Lo92/e0;

    iget-object v1, p0, Lo92/e0$a;->E:Lorg/joda/time/DateTime;

    iget-object v2, p0, Lo92/e0$a;->F:Lm92/f;

    invoke-direct {p1, v0, v1, v2, p2}, Lo92/e0$a;-><init>(Lo92/e0;Lorg/joda/time/DateTime;Lm92/f;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lo92/e0$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo92/e0$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo92/e0$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lo92/e0$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lo92/e0$a;->y:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lo92/e0$a;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lo92/e0$a;->z:Lo92/e0;

    invoke-static {p1}, Lo92/e0;->A(Lo92/e0;)Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    move-result-object p1

    iget-object v1, p0, Lo92/e0$a;->E:Lorg/joda/time/DateTime;

    iput v3, p0, Lo92/e0$a;->y:I

    invoke-virtual {p1, v1, p0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->triggerSmartAlarmFromPush(Lorg/joda/time/DateTime;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lo92/e0$a;->F:Lm92/f;

    invoke-virtual {p1}, Lm92/f;->d()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v1, p0, Lo92/e0$a;->z:Lo92/e0;

    invoke-static {v1}, Lo92/e0;->z(Lo92/e0;)Lcom/whoop/data/repositories/NotificationRepository;

    move-result-object v1

    sget-object v3, Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;->FailedToOpen:Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;

    const/4 v4, 0x0

    iput-object v4, p0, Lo92/e0$a;->w:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, p0, Lo92/e0$a;->x:I

    iput v2, p0, Lo92/e0$a;->y:I

    invoke-virtual {v1, v3, p1, p0}, Lcom/whoop/data/repositories/NotificationRepository;->sendPushNotificationMetric(Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
