.class final Lvd1/d$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvd1/d;->e(JLq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Lzj0/v0;",
        "<anonymous>",
        "(Lbc3/c0;)Lzj0/v0;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.domain.strap.strapalarm.StrapAlarmSdkImpl$setAlarm$2"
    f = "StrapAlarmSdkImpl.kt"
    l = {
        0x3d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:J

.field final synthetic F:Lvd1/d;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(JLvd1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lvd1/d;",
            "Lq83/d<",
            "-",
            "Lvd1/d$e;",
            ">;)V"
        }
    .end annotation

    iput-wide p1, p0, Lvd1/d$e;->E:J

    iput-object p3, p0, Lvd1/d$e;->F:Lvd1/d;

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

    new-instance p1, Lvd1/d$e;

    iget-wide v0, p0, Lvd1/d$e;->E:J

    iget-object v2, p0, Lvd1/d$e;->F:Lvd1/d;

    invoke-direct {p1, v0, v1, v2, p2}, Lvd1/d$e;-><init>(JLvd1/d;Lq83/d;)V

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
            "Lzj0/v0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lvd1/d$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvd1/d$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvd1/d$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvd1/d$e;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvd1/d$e;->z:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lvd1/d$e;->x:Ljava/lang/Object;

    check-cast v0, Lfk2/a;

    iget-object v0, p0, Lvd1/d$e;->w:Ljava/lang/Object;

    check-cast v0, Lorg/joda/time/DateTime;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lorg/joda/time/DateTime;

    iget-wide v4, p0, Lvd1/d$e;->E:J

    invoke-direct {p1, v4, v5}, Lorg/joda/time/DateTime;-><init>(J)V

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-static {v1, p1}, Lorg/joda/time/Minutes;->minutesBetween(Lorg/joda/time/ReadableInstant;Lorg/joda/time/ReadableInstant;)Lorg/joda/time/Minutes;

    move-result-object v1

    invoke-virtual {v1}, Lorg/joda/time/Minutes;->getMinutes()I

    move-result v1

    iget-object v4, p0, Lvd1/d$e;->F:Lvd1/d;

    invoke-static {v4}, Lvd1/d;->q(Lvd1/d;)Ltr2/n;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Sending setAlarm command to the strap with time "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", which is in "

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " minutes"

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v5, v2, [Lqr2/a$a;

    const-string v6, "WakeWindow"

    invoke-interface {v4, v6, p1, v5}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lfk2/a;

    iget-wide v4, p0, Lvd1/d$e;->E:J

    sget-object v6, Lfk2/a$c;->MILLIS:Lfk2/a$c;

    invoke-direct {p1, v4, v5, v6}, Lfk2/a;-><init>(JLfk2/a$c;)V

    iget-object v4, p0, Lvd1/d$e;->F:Lvd1/d;

    invoke-static {v4}, Lvd1/d;->s(Lvd1/d;)Ltd1/b;

    move-result-object v4

    const/4 v5, 0x0

    iput-object v5, p0, Lvd1/d$e;->w:Ljava/lang/Object;

    iput-object v5, p0, Lvd1/d$e;->x:Ljava/lang/Object;

    iput v1, p0, Lvd1/d$e;->y:I

    iput v3, p0, Lvd1/d$e;->z:I

    invoke-interface {v4, p1, p0}, Ltd1/b;->u(Lfk2/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    move-object v7, p1

    check-cast v7, Lzj0/v0;

    iget-object p1, p0, Lvd1/d$e;->F:Lvd1/d;

    sget-object v0, Llt0/e;->SET_ALARM_TIME:Llt0/e;

    invoke-static {p1, v7, v0}, Lvd1/d;->t(Lvd1/d;Lzj0/h;Llt0/e;)V

    iget-object p1, p0, Lvd1/d$e;->F:Lvd1/d;

    invoke-static {p1}, Lvd1/d;->r(Lvd1/d;)Lg82/a;

    move-result-object v3

    sget-object v4, Lf82/a;->PHONE_SET_ALARM_TIME:Lf82/a;

    iget-wide v0, p0, Lvd1/d$e;->E:J

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Lzj0/h;->W()Z

    move-result v2

    :cond_3
    move v8, v2

    const/4 v5, 0x0

    invoke-interface/range {v3 .. v8}, Lg82/a;->b(Lf82/a;Lf82/b;Ljava/lang/String;Lzj0/h;Z)V

    return-object v7
.end method
