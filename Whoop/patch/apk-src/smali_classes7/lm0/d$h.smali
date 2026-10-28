.class final Llm0/d$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llm0/d;->y(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)V
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
    c = "com.whoop.broadcastlisteners.BondLossReceiver$trackBondLossEvent$1"
    f = "BondLossReceiver.kt"
    l = {
        0x97
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Llm0/d;

.field final synthetic y:Landroid/bluetooth/BluetoothDevice;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Llm0/d;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llm0/d;",
            "Landroid/bluetooth/BluetoothDevice;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Llm0/d$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llm0/d$h;->x:Llm0/d;

    iput-object p2, p0, Llm0/d$h;->y:Landroid/bluetooth/BluetoothDevice;

    iput-object p3, p0, Llm0/d$h;->z:Ljava/lang/String;

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

    new-instance p1, Llm0/d$h;

    iget-object v0, p0, Llm0/d$h;->x:Llm0/d;

    iget-object v1, p0, Llm0/d$h;->y:Landroid/bluetooth/BluetoothDevice;

    iget-object v2, p0, Llm0/d$h;->z:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Llm0/d$h;-><init>(Llm0/d;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llm0/d$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llm0/d$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llm0/d$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llm0/d$h;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llm0/d$h;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llm0/d$h;->x:Llm0/d;

    iget-object v1, p0, Llm0/d$h;->y:Landroid/bluetooth/BluetoothDevice;

    iput v2, p0, Llm0/d$h;->w:I

    invoke-static {p1, v1, p0}, Llm0/d;->g(Llm0/d;Landroid/bluetooth/BluetoothDevice;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Llm0/d$h;->x:Llm0/d;

    invoke-static {p1}, Llm0/d;->a(Llm0/d;)Lfi0/a;

    move-result-object v0

    const-string p1, "bond_loss_reason"

    iget-object v1, p0, Llm0/d$h;->z:Ljava/lang/String;

    invoke-static {p1, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    const/16 v7, 0x15

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v2, "Detected"

    const/4 v3, 0x0

    const-string v4, "Bond Loss"

    const/4 v5, 0x0

    invoke-static/range {v0 .. v8}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    iget-object p1, p0, Llm0/d$h;->x:Llm0/d;

    invoke-static {p1}, Llm0/d;->c(Llm0/d;)Ltr2/n;

    move-result-object p1

    iget-object v0, p0, Llm0/d$h;->y:Landroid/bluetooth/BluetoothDevice;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    iget-object v1, p0, Llm0/d$h;->z:Ljava/lang/String;

    const-string v2, "Bond loss event tracked - Device: "

    const-string v3, ", Reason: "

    invoke-static {v2, v0, v3, v1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
