.class final Lvd1/d$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvd1/d;->g(Lq83/d;)Ljava/lang/Object;
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
        "Lzj0/m;",
        "<anonymous>",
        "(Lbc3/c0;)Lzj0/m;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.domain.strap.strapalarm.StrapAlarmSdkImpl$getAlarmTime$2"
    f = "StrapAlarmSdkImpl.kt"
    l = {
        0x4d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lvd1/d;


# direct methods
.method public constructor <init>(Lvd1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvd1/d;",
            "Lq83/d<",
            "-",
            "Lvd1/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvd1/d$c;->x:Lvd1/d;

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

    new-instance p1, Lvd1/d$c;

    iget-object v0, p0, Lvd1/d$c;->x:Lvd1/d;

    invoke-direct {p1, v0, p2}, Lvd1/d$c;-><init>(Lvd1/d;Lq83/d;)V

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
            "Lzj0/m;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lvd1/d$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvd1/d$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvd1/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvd1/d$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvd1/d$c;->w:I

    const-string v2, "WakeWindow"

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lvd1/d$c;->x:Lvd1/d;

    invoke-static {p1}, Lvd1/d;->q(Lvd1/d;)Ltr2/n;

    move-result-object p1

    const-string v1, "Sending getAlarm command to the strap"

    new-array v5, v4, [Lqr2/a$a;

    invoke-interface {p1, v2, v1, v5}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lvd1/d$c;->x:Lvd1/d;

    invoke-static {p1}, Lvd1/d;->s(Lvd1/d;)Ltd1/b;

    move-result-object p1

    iput v3, p0, Lvd1/d$c;->w:I

    invoke-interface {p1, p0}, Ltd1/b;->g(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    move-object v9, p1

    check-cast v9, Lzj0/m;

    if-eqz v9, :cond_4

    new-instance p1, Lorg/joda/time/DateTime;

    invoke-virtual {v9}, Lzj0/c;->c0()J

    move-result-wide v0

    invoke-direct {p1, v0, v1}, Lorg/joda/time/DateTime;-><init>(J)V

    invoke-virtual {v9}, Lzj0/m;->d0()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "enabled"

    goto :goto_1

    :cond_3
    const-string v0, "disabled"

    :goto_1
    iget-object v1, p0, Lvd1/d$c;->x:Lvd1/d;

    invoke-static {v1}, Lvd1/d;->q(Lvd1/d;)Ltr2/n;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Strap alarm is "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " with time "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v4, [Lqr2/a$a;

    invoke-interface {v1, v2, p1, v0}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    :cond_4
    iget-object p1, p0, Lvd1/d$c;->x:Lvd1/d;

    sget-object v0, Llt0/e;->GET_ALARM_TIME:Llt0/e;

    invoke-static {p1, v9, v0}, Lvd1/d;->t(Lvd1/d;Lzj0/h;Llt0/e;)V

    iget-object p1, p0, Lvd1/d$c;->x:Lvd1/d;

    invoke-static {p1}, Lvd1/d;->r(Lvd1/d;)Lg82/a;

    move-result-object v5

    sget-object v6, Lf82/a;->PHONE_GET_ALARM_TIME:Lf82/a;

    if-eqz v9, :cond_5

    invoke-virtual {v9}, Lzj0/h;->W()Z

    move-result v4

    :cond_5
    move v10, v4

    const/4 v7, 0x0

    const-string v8, ""

    invoke-interface/range {v5 .. v10}, Lg82/a;->b(Lf82/a;Lf82/b;Ljava/lang/String;Lzj0/h;Z)V

    return-object v9
.end method
