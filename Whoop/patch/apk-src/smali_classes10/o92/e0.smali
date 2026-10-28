.class public final Lo92/e0;
.super Lm92/b;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lo92/e0;",
        "Lm92/b;",
        "Lo92/s;",
        "pushContext",
        "Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;",
        "smartAlarmTriggerRepository",
        "<init>",
        "(Lo92/s;Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)V",
        "Lm92/f;",
        "dataMap",
        "Landroid/content/Context;",
        "context",
        "Ll83/a0;",
        "a",
        "(Lm92/f;Landroid/content/Context;)V",
        "I",
        "Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;",
        "",
        "J",
        "Ljava/lang/String;",
        "n",
        "()Ljava/lang/String;",
        "logTag",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final I:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

.field private final J:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lo92/s;Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)V
    .locals 1

    const-string v0, "pushContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "smartAlarmTriggerRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lm92/b;-><init>(Lo92/s;)V

    iput-object p2, p0, Lo92/e0;->I:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    const-string p1, "SmartAlarmTriggeredPushNotification"

    iput-object p1, p0, Lo92/e0;->J:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic A(Lo92/e0;)Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;
    .locals 0

    iget-object p0, p0, Lo92/e0;->I:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;

    return-object p0
.end method

.method public static final synthetic z(Lo92/e0;)Lcom/whoop/data/repositories/NotificationRepository;
    .locals 0

    invoke-virtual {p0}, Lm92/b;->p()Lcom/whoop/data/repositories/NotificationRepository;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lm92/f;Landroid/content/Context;)V
    .locals 5

    const-string v0, "dataMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x3

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "data_payload"

    invoke-virtual {p1, v1}, Lm92/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Ljava/util/Map;

    invoke-static {v1, v2}, Lor2/i0;->f(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    const-string v2, "alarm_triggered_time"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lorg/joda/time/DateTime;

    if-eqz v2, :cond_0

    check-cast v1, Lorg/joda/time/DateTime;

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    invoke-virtual {p0}, Lm92/b;->l()Ltr2/n;

    move-result-object v2

    const-string v3, "SmartAlarmTriggeredNotificationReceived"

    const/4 v4, 0x0

    new-array v4, v4, [Lqr2/a$a;

    invoke-interface {v2, v3, v4}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p0}, Lm92/b;->q()Lbc3/c0;

    move-result-object v2

    new-instance v3, Lo92/e0$a;

    invoke-direct {v3, p0, v1, p1, v0}, Lo92/e0$a;-><init>(Lo92/e0;Lorg/joda/time/DateTime;Lm92/f;Lq83/d;)V

    invoke-static {v2, v0, v0, v3, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    invoke-virtual {p0}, Lm92/b;->q()Lbc3/c0;

    move-result-object v1

    new-instance v2, Lo92/e0$b;

    invoke-direct {v2, p1, p0, v0}, Lo92/e0$b;-><init>(Lm92/f;Lo92/e0;Lq83/d;)V

    invoke-static {v1, v0, v0, v2, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo92/e0;->J:Ljava/lang/String;

    return-object v0
.end method
