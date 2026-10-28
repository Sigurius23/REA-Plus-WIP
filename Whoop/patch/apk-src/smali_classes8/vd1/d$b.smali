.class final Lvd1/d$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvd1/d;->a(Lq83/d;)Ljava/lang/Object;
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
        "Lzj0/j;",
        "<anonymous>",
        "(Lbc3/c0;)Lzj0/j;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.domain.strap.strapalarm.StrapAlarmSdkImpl$disableAlarm$2"
    f = "StrapAlarmSdkImpl.kt"
    l = {
        0x72
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
            "Lvd1/d$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvd1/d$b;->x:Lvd1/d;

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

    new-instance p1, Lvd1/d$b;

    iget-object v0, p0, Lvd1/d$b;->x:Lvd1/d;

    invoke-direct {p1, v0, p2}, Lvd1/d$b;-><init>(Lvd1/d;Lq83/d;)V

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
            "Lzj0/j;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lvd1/d$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvd1/d$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvd1/d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvd1/d$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvd1/d$b;->w:I

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

    iget-object p1, p0, Lvd1/d$b;->x:Lvd1/d;

    invoke-static {p1}, Lvd1/d;->q(Lvd1/d;)Ltr2/n;

    move-result-object p1

    const-string v1, "Sending disableAlarm command to the strap"

    new-array v4, v2, [Lqr2/a$a;

    const-string v5, "WakeWindow"

    invoke-interface {p1, v5, v1, v4}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lvd1/d$b;->x:Lvd1/d;

    invoke-static {p1}, Lvd1/d;->s(Lvd1/d;)Ltd1/b;

    move-result-object p1

    iput v3, p0, Lvd1/d$b;->w:I

    invoke-interface {p1, p0}, Ltd1/b;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    move-object v7, p1

    check-cast v7, Lzj0/j;

    iget-object p1, p0, Lvd1/d$b;->x:Lvd1/d;

    sget-object v0, Llt0/e;->DISABLE_ALARM:Llt0/e;

    invoke-static {p1, v7, v0}, Lvd1/d;->t(Lvd1/d;Lzj0/h;Llt0/e;)V

    iget-object p1, p0, Lvd1/d$b;->x:Lvd1/d;

    invoke-static {p1}, Lvd1/d;->r(Lvd1/d;)Lg82/a;

    move-result-object v3

    sget-object v4, Lf82/a;->PHONE_DISABLED_ALARM:Lf82/a;

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Lzj0/h;->W()Z

    move-result v2

    :cond_3
    move v8, v2

    const/4 v5, 0x0

    const-string v6, ""

    invoke-interface/range {v3 .. v8}, Lg82/a;->b(Lf82/a;Lf82/b;Ljava/lang/String;Lzj0/h;Z)V

    return-object v7
.end method
