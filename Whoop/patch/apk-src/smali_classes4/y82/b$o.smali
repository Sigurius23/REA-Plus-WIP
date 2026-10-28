.class final enum Ly82/b$o;
.super Ly82/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly82/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public synthetic constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x4

    const-string v1, "Set Alarm Time (Noon)"

    const-string v2, "SET_ALARM_TIME"

    invoke-direct {p0, v2, v0, v1}, Ly82/b$o;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Ly82/b;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public perform(Landroid/content/Context;)Ly82/b$t;
    .locals 9

    const-string p1, "WHOOP_ACTION_SET_ALARM_TIME"

    invoke-static {p1}, Ltr2/n;->d(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    const-class v0, Ly82/g;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly82/g;

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v1

    const/16 v2, 0xc

    invoke-virtual {v1, v2}, Lorg/joda/time/DateTime;->withHourOfDay(I)Lorg/joda/time/DateTime;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lorg/joda/time/DateTime;->withMinuteOfHour(I)Lorg/joda/time/DateTime;

    move-result-object v2

    invoke-virtual {v2, v3}, Lorg/joda/time/DateTime;->withSecondOfMinute(I)Lorg/joda/time/DateTime;

    move-result-object v2

    invoke-static {v1, v2}, Lorg/joda/time/Seconds;->secondsBetween(Lorg/joda/time/ReadableInstant;Lorg/joda/time/ReadableInstant;)Lorg/joda/time/Seconds;

    move-result-object v4

    invoke-virtual {v4}, Lorg/joda/time/Seconds;->getSeconds()I

    move-result v5

    if-gtz v5, :cond_0

    const/4 v4, 0x1

    invoke-virtual {v2, v4}, Lorg/joda/time/DateTime;->plusDays(I)Lorg/joda/time/DateTime;

    move-result-object v2

    invoke-static {v1, v2}, Lorg/joda/time/Seconds;->secondsBetween(Lorg/joda/time/ReadableInstant;Lorg/joda/time/ReadableInstant;)Lorg/joda/time/Seconds;

    move-result-object v4

    :cond_0
    new-instance v1, Lfk2/a;

    invoke-direct {v1}, Lfk2/a;-><init>()V

    new-instance v2, Lfk2/a;

    invoke-virtual {v1}, Lfk2/a;->f()J

    move-result-wide v5

    invoke-virtual {v4}, Lorg/joda/time/Seconds;->getSeconds()I

    move-result v4

    int-to-long v7, v4

    add-long/2addr v5, v7

    invoke-virtual {v1}, Lfk2/a;->e()J

    move-result-wide v7

    invoke-direct {v2, v5, v6, v7, v8}, Lfk2/a;-><init>(JJ)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Sending Set alarm time to gen 3 strap for "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lfk2/a;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {p1, v1, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {v2}, Lfk2/a;->j()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ly82/g;->h(J)V

    invoke-static {}, Ly82/b$t;->c()Ly82/b$t;

    move-result-object p1

    return-object p1
.end method
