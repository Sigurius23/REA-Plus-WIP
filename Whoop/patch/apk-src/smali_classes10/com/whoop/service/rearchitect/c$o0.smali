.class final Lcom/whoop/service/rearchitect/c$o0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/service/rearchitect/c;->F3()V
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
    c = "com.whoop.service.rearchitect.WhoopStrap$transitionToReady$1"
    f = "WhoopStrap.kt"
    l = {
        0x57c,
        0x581
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lcom/whoop/service/rearchitect/c;


# direct methods
.method public constructor <init>(Lcom/whoop/service/rearchitect/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/service/rearchitect/c;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/service/rearchitect/c$o0;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/service/rearchitect/c$o0;->y:Lcom/whoop/service/rearchitect/c;

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

    new-instance p1, Lcom/whoop/service/rearchitect/c$o0;

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$o0;->y:Lcom/whoop/service/rearchitect/c;

    invoke-direct {p1, v0, p2}, Lcom/whoop/service/rearchitect/c$o0;-><init>(Lcom/whoop/service/rearchitect/c;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/service/rearchitect/c$o0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/service/rearchitect/c$o0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/service/rearchitect/c$o0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/service/rearchitect/c$o0;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/service/rearchitect/c$o0;->x:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$o0;->w:Ljava/lang/Object;

    check-cast v0, Lzj0/o;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, p0

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, p0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move p1, v3

    iget-object v3, p0, Lcom/whoop/service/rearchitect/c$o0;->y:Lcom/whoop/service/rearchitect/c;

    iput p1, p0, Lcom/whoop/service/rearchitect/c$o0;->x:I

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v8, 0x3

    const/4 v9, 0x0

    move-object v7, p0

    invoke-static/range {v3 .. v9}, Lcom/whoop/service/rearchitect/c;->e3(Lcom/whoop/service/rearchitect/c;IJLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lzj0/o;

    const/4 v1, 0x0

    if-nez p1, :cond_4

    iget-object p1, v7, Lcom/whoop/service/rearchitect/c$o0;->y:Lcom/whoop/service/rearchitect/c;

    invoke-static {p1}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object p1

    const-string v0, "After successful strap connection, failed to get BatteryPackInfoPacket"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1}, Loh3/d;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lzj0/o;->Z()Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    move-result-object v3

    sget-object v4, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;->PUFFIN:Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    if-ne v3, v4, :cond_5

    iget-object v3, v7, Lcom/whoop/service/rearchitect/c$o0;->y:Lcom/whoop/service/rearchitect/c;

    invoke-static {v3}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object v3

    invoke-virtual {p1}, Lzj0/o;->Z()Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    move-result-object v4

    invoke-virtual {p1}, Lzj0/o;->Y()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v8, "Sending connect command to "

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v1}, Loh3/d;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, v7, Lcom/whoop/service/rearchitect/c$o0;->y:Lcom/whoop/service/rearchitect/c;

    invoke-static {v1}, Lcom/whoop/service/rearchitect/c;->H2(Lcom/whoop/service/rearchitect/c;)Ly42/j;

    move-result-object v1

    invoke-virtual {p1}, Lzj0/o;->X()Ljava/lang/String;

    move-result-object p1

    sget-object v3, Lus0/d$c;->STRAP_CONNECTION:Lus0/d$c;

    const/4 v4, 0x0

    iput-object v4, v7, Lcom/whoop/service/rearchitect/c$o0;->w:Ljava/lang/Object;

    iput v2, v7, Lcom/whoop/service/rearchitect/c$o0;->x:I

    invoke-virtual {v1, p1, v3, p0}, Ly42/j;->c(Ljava/lang/String;Lus0/d$c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
