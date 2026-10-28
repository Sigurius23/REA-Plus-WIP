.class final Lcom/whoop/cdm/WhoopCompanionDeviceService$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/cdm/WhoopCompanionDeviceService;->e()V
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
    c = "com.whoop.cdm.WhoopCompanionDeviceService$emitBleReconnect$1"
    f = "WhoopCompanionDeviceService.kt"
    l = {
        0x39
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/cdm/WhoopCompanionDeviceService;


# direct methods
.method public constructor <init>(Lcom/whoop/cdm/WhoopCompanionDeviceService;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/cdm/WhoopCompanionDeviceService;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/cdm/WhoopCompanionDeviceService$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/cdm/WhoopCompanionDeviceService$a;->x:Lcom/whoop/cdm/WhoopCompanionDeviceService;

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

    new-instance p1, Lcom/whoop/cdm/WhoopCompanionDeviceService$a;

    iget-object v0, p0, Lcom/whoop/cdm/WhoopCompanionDeviceService$a;->x:Lcom/whoop/cdm/WhoopCompanionDeviceService;

    invoke-direct {p1, v0, p2}, Lcom/whoop/cdm/WhoopCompanionDeviceService$a;-><init>(Lcom/whoop/cdm/WhoopCompanionDeviceService;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/cdm/WhoopCompanionDeviceService$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/cdm/WhoopCompanionDeviceService$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/cdm/WhoopCompanionDeviceService$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/cdm/WhoopCompanionDeviceService$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/cdm/WhoopCompanionDeviceService$a;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

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

    iget-object p1, p0, Lcom/whoop/cdm/WhoopCompanionDeviceService$a;->x:Lcom/whoop/cdm/WhoopCompanionDeviceService;

    invoke-static {p1}, Lcom/whoop/cdm/WhoopCompanionDeviceService;->b(Lcom/whoop/cdm/WhoopCompanionDeviceService;)Ltr2/n;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v4, "CDS"

    const-string v5, "Emitting BLE reconnect event"

    invoke-interface {p1, v4, v5, v1}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lcom/whoop/cdm/WhoopCompanionDeviceService$a;->x:Lcom/whoop/cdm/WhoopCompanionDeviceService;

    invoke-static {p1}, Lcom/whoop/cdm/WhoopCompanionDeviceService;->c(Lcom/whoop/cdm/WhoopCompanionDeviceService;)Lec3/o1;

    move-result-object p1

    iput v3, p0, Lcom/whoop/cdm/WhoopCompanionDeviceService$a;->w:I

    invoke-interface {p1, v2, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    return-object v2
.end method
