.class final Lnl1/a$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnl1/a;->d()V
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
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Ll83/k;",
        "Lgt0/h;",
        "Lws0/a;",
        "<destruct>",
        "Ll83/a0;",
        "<anonymous>",
        "(Ll83/k;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.domain.connectivity.firmware.NewFirmwareUpdateMonitor$observeFwUpdateStatus$2"
    f = "NewFirmwareUpdateMonitor.kt"
    l = {
        0x35,
        0x37
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lnl1/a;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lnl1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnl1/a;",
            "Lq83/d<",
            "-",
            "Lnl1/a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lnl1/a$c;->E:Lnl1/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lnl1/a$c;

    iget-object v1, p0, Lnl1/a$c;->E:Lnl1/a;

    invoke-direct {v0, v1, p2}, Lnl1/a$c;-><init>(Lnl1/a;Lq83/d;)V

    iput-object p1, v0, Lnl1/a$c;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ll83/k;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lnl1/a$c;->invoke(Ll83/k;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ll83/k;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/k;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lnl1/a$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lnl1/a$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lnl1/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lnl1/a$c;->z:Ljava/lang/Object;

    check-cast v0, Ll83/k;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lnl1/a$c;->y:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lnl1/a$c;->x:Ljava/lang/Object;

    check-cast v0, Lws0/a;

    iget-object v0, p0, Lnl1/a$c;->w:Ljava/lang/Object;

    check-cast v0, Lgt0/h;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast p1, Lgt0/h;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Lws0/a;

    invoke-virtual {v0}, Lws0/a;->b()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    iget-object p1, p0, Lnl1/a$c;->E:Lnl1/a;

    invoke-static {p1}, Lnl1/a;->b(Lnl1/a;)Lec3/p1;

    move-result-object p1

    sget-object v0, Lgt0/h$h;->b:Lgt0/h$h;

    iput-object v2, p0, Lnl1/a$c;->z:Ljava/lang/Object;

    iput-object v2, p0, Lnl1/a$c;->w:Ljava/lang/Object;

    iput-object v2, p0, Lnl1/a$c;->x:Ljava/lang/Object;

    iput v4, p0, Lnl1/a$c;->y:I

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v0, p0}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v5, v1, :cond_4

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lnl1/a$c;->E:Lnl1/a;

    invoke-static {v0}, Lnl1/a;->b(Lnl1/a;)Lec3/p1;

    move-result-object v0

    iput-object v2, p0, Lnl1/a$c;->z:Ljava/lang/Object;

    iput-object v2, p0, Lnl1/a$c;->w:Ljava/lang/Object;

    iput-object v2, p0, Lnl1/a$c;->x:Ljava/lang/Object;

    iput v3, p0, Lnl1/a$c;->y:I

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, p1, p0}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v5, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    :goto_2
    return-object v5
.end method
