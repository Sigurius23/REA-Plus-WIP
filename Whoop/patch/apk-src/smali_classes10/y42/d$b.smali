.class final Ly42/d$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly42/d;->x(Landroid/bluetooth/BluetoothDevice;)V
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
    c = "com.whoop.puffin.ble.PuffinBleManager$connectDevice$1"
    f = "PuffinBleManager.kt"
    l = {
        0x77
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:J

.field w:I

.field final synthetic x:Ly42/d;

.field final synthetic y:Landroid/bluetooth/BluetoothDevice;

.field final synthetic z:J


# direct methods
.method public constructor <init>(Ly42/d;Landroid/bluetooth/BluetoothDevice;JJLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly42/d;",
            "Landroid/bluetooth/BluetoothDevice;",
            "JJ",
            "Lq83/d<",
            "-",
            "Ly42/d$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ly42/d$b;->x:Ly42/d;

    iput-object p2, p0, Ly42/d$b;->y:Landroid/bluetooth/BluetoothDevice;

    iput-wide p3, p0, Ly42/d$b;->z:J

    iput-wide p5, p0, Ly42/d$b;->E:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8
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

    new-instance v0, Ly42/d$b;

    iget-object v1, p0, Ly42/d$b;->x:Ly42/d;

    iget-object v2, p0, Ly42/d$b;->y:Landroid/bluetooth/BluetoothDevice;

    iget-wide v3, p0, Ly42/d$b;->z:J

    iget-wide v5, p0, Ly42/d$b;->E:J

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Ly42/d$b;-><init>(Ly42/d;Landroid/bluetooth/BluetoothDevice;JJLq83/d;)V

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Ly42/d$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ly42/d$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ly42/d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ly42/d$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ly42/d$b;->w:I

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

    iget-object p1, p0, Ly42/d$b;->x:Ly42/d;

    invoke-static {p1}, Ly42/d;->g0(Ly42/d;)Ltr2/n;

    move-result-object p1

    iget-object v1, p0, Ly42/d$b;->x:Ly42/d;

    iget-object v4, p0, Ly42/d$b;->y:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v1, v4}, Ly42/d;->i0(Ly42/d;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "Starting scan and connect loop for "

    invoke-static {v4, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v4, v2, [Lqr2/a$a;

    invoke-interface {p1, v1, v4}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-wide v4, p0, Ly42/d$b;->z:J

    new-instance v6, Ly42/d$b$a;

    iget-object v7, p0, Ly42/d$b;->x:Ly42/d;

    iget-object v8, p0, Ly42/d$b;->y:Landroid/bluetooth/BluetoothDevice;

    iget-wide v9, p0, Ly42/d$b;->E:J

    const/4 v11, 0x0

    invoke-direct/range {v6 .. v11}, Ly42/d$b$a;-><init>(Ly42/d;Landroid/bluetooth/BluetoothDevice;JLq83/d;)V

    iput v3, p0, Ly42/d$b;->w:I

    invoke-static {v4, v5, v6, p0}, Lbc3/k2;->e(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    if-nez p1, :cond_3

    iget-object p1, p0, Ly42/d$b;->x:Ly42/d;

    invoke-static {p1}, Ly42/d;->g0(Ly42/d;)Ltr2/n;

    move-result-object p1

    iget-object v0, p0, Ly42/d$b;->x:Ly42/d;

    iget-object v1, p0, Ly42/d$b;->y:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, v1}, Ly42/d;->i0(Ly42/d;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v0

    iget-wide v3, p0, Ly42/d$b;->z:J

    invoke-static {v3, v4}, Lkotlin/time/Duration;->toString-impl(J)Ljava/lang/String;

    move-result-object v1

    const-string v3, "Failed to connect to "

    const-string v4, " after "

    invoke-static {v3, v0, v4, v1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
