.class final Lug1/a$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug1/a;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lvk0/k;",
        "serviceState",
        "Lug1/i;",
        "action",
        "Lug1/j;",
        "<anonymous>",
        "(Lvk0/k;Lug1/i;)Lug1/j;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.firmwareUpdateService.strategy.BatteryPackUpdateStrategy$interact$1"
    f = "BatteryPackUpdateStrategy.kt"
    l = {
        0x6d,
        0x74
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lug1/a;


# direct methods
.method public constructor <init>(Lug1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lug1/a;",
            "Lq83/d<",
            "-",
            "Lug1/a$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lug1/a$f;->z:Lug1/a;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lvk0/k;Lug1/i;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvk0/k;",
            "Lug1/i;",
            "Lq83/d<",
            "-",
            "Lug1/j;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lug1/a$f;

    iget-object v1, p0, Lug1/a$f;->z:Lug1/a;

    invoke-direct {v0, v1, p3}, Lug1/a$f;-><init>(Lug1/a;Lq83/d;)V

    iput-object p1, v0, Lug1/a$f;->x:Ljava/lang/Object;

    iput-object p2, v0, Lug1/a$f;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lug1/a$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvk0/k;

    check-cast p2, Lug1/i;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lug1/a$f;->f(Lvk0/k;Lug1/i;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lug1/a$f;->x:Ljava/lang/Object;

    check-cast v0, Lvk0/k;

    iget-object v1, p0, Lug1/a$f;->y:Ljava/lang/Object;

    check-cast v1, Lug1/i;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lug1/a$f;->w:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v3, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

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

    iget-object p1, p0, Lug1/a$f;->z:Lug1/a;

    invoke-virtual {v1}, Lug1/i;->a()Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object v3

    invoke-static {p1, v3}, Lug1/a;->y(Lug1/a;Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)V

    sget-object p1, Lvk0/k$c;->a:Lvk0/k$c;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lug1/j$i;->b:Lug1/j$i;

    return-object p1

    :cond_3
    iget-object p1, p0, Lug1/a$f;->z:Lug1/a;

    invoke-virtual {v1}, Lug1/i;->a()Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object v0

    iput-object v6, p0, Lug1/a$f;->x:Ljava/lang/Object;

    iput-object v1, p0, Lug1/a$f;->y:Ljava/lang/Object;

    iput v5, p0, Lug1/a$f;->w:I

    invoke-static {p1, v0, p0}, Lug1/a;->e(Lug1/a;Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lug1/a$f;->z:Lug1/a;

    invoke-virtual {p1}, Lug1/a;->h()Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Firmware already up to date"

    invoke-interface {p1, v1, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lug1/j$c;->b:Lug1/j$c;

    return-object p1

    :cond_5
    instance-of p1, v1, Lug1/i$a;

    if-eqz p1, :cond_7

    iget-object p1, p0, Lug1/a$f;->z:Lug1/a;

    check-cast v1, Lug1/i$a;

    invoke-virtual {v1}, Lug1/i$a;->a()Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object v0

    iput-object v6, p0, Lug1/a$f;->x:Ljava/lang/Object;

    iput-object v6, p0, Lug1/a$f;->y:Ljava/lang/Object;

    iput v4, p0, Lug1/a$f;->w:I

    invoke-static {p1, v0, p0}, Lug1/a;->z(Lug1/a;Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_6

    :goto_1
    return-object v2

    :cond_6
    :goto_2
    check-cast p1, Lug1/j;

    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
