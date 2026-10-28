.class final Lvd1/d$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvd1/d;->d(Lf82/b;Lq83/d;)Ljava/lang/Object;
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
        "Lzj0/p0;",
        "<anonymous>",
        "(Lbc3/c0;)Lzj0/p0;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.domain.strap.strapalarm.StrapAlarmSdkImpl$runAlarm$2"
    f = "StrapAlarmSdkImpl.kt"
    l = {
        0x62
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lvd1/d;

.field final synthetic y:Lf82/b;


# direct methods
.method public constructor <init>(Lvd1/d;Lf82/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvd1/d;",
            "Lf82/b;",
            "Lq83/d<",
            "-",
            "Lvd1/d$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvd1/d$d;->x:Lvd1/d;

    iput-object p2, p0, Lvd1/d$d;->y:Lf82/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Lvd1/d$d;

    iget-object v0, p0, Lvd1/d$d;->x:Lvd1/d;

    iget-object v1, p0, Lvd1/d$d;->y:Lf82/b;

    invoke-direct {p1, v0, v1, p2}, Lvd1/d$d;-><init>(Lvd1/d;Lf82/b;Lq83/d;)V

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
            "Lzj0/p0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lvd1/d$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvd1/d$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvd1/d$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvd1/d$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvd1/d$d;->w:I

    const/4 v2, 0x0

    const/4 v3, 0x1

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

    iget-object p1, p0, Lvd1/d$d;->x:Lvd1/d;

    invoke-static {p1}, Lvd1/d;->q(Lvd1/d;)Ltr2/n;

    move-result-object p1

    const-string v1, "Sending runAlarm command to the strap"

    new-array v4, v2, [Lqr2/a$a;

    const-string v5, "WakeWindow"

    invoke-interface {p1, v5, v1, v4}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lvd1/d$d;->x:Lvd1/d;

    invoke-static {p1}, Lvd1/d;->s(Lvd1/d;)Ltd1/b;

    move-result-object p1

    sget-object v1, Lxj0/i0$a;->a:Lxj0/i0$a;

    iput v3, p0, Lvd1/d$d;->w:I

    invoke-interface {p1, v1, p0}, Ltd1/b;->w(Lxj0/i0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    move-object v7, p1

    check-cast v7, Lzj0/p0;

    iget-object p1, p0, Lvd1/d$d;->x:Lvd1/d;

    sget-object v0, Llt0/e;->RUN_ALARM:Llt0/e;

    invoke-static {p1, v7, v0}, Lvd1/d;->t(Lvd1/d;Lzj0/h;Llt0/e;)V

    iget-object p1, p0, Lvd1/d$d;->x:Lvd1/d;

    invoke-static {p1}, Lvd1/d;->r(Lvd1/d;)Lg82/a;

    move-result-object v3

    sget-object v4, Lf82/a;->PHONE_RUN_ALARM:Lf82/a;

    iget-object v5, p0, Lvd1/d$d;->y:Lf82/b;

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Lzj0/h;->W()Z

    move-result v2

    :cond_3
    move v8, v2

    const-string v6, ""

    invoke-interface/range {v3 .. v8}, Lg82/a;->b(Lf82/a;Lf82/b;Ljava/lang/String;Lzj0/h;Z)V

    return-object v7
.end method
