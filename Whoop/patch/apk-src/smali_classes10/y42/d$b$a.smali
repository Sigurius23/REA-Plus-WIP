.class final Ly42/d$b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly42/d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "",
        "<anonymous>",
        "(Lbc3/c0;)Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.puffin.ble.PuffinBleManager$connectDevice$1$success$1"
    f = "PuffinBleManager.kt"
    l = {
        0x79,
        0x7f,
        0x87
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Landroid/bluetooth/BluetoothDevice;

.field final synthetic F:J

.field w:Z

.field x:Z

.field y:I

.field final synthetic z:Ly42/d;


# direct methods
.method public constructor <init>(Ly42/d;Landroid/bluetooth/BluetoothDevice;JLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly42/d;",
            "Landroid/bluetooth/BluetoothDevice;",
            "J",
            "Lq83/d<",
            "-",
            "Ly42/d$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ly42/d$b$a;->z:Ly42/d;

    iput-object p2, p0, Ly42/d$b$a;->E:Landroid/bluetooth/BluetoothDevice;

    iput-wide p3, p0, Ly42/d$b$a;->F:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Ly42/d$b$a;

    iget-object v1, p0, Ly42/d$b$a;->z:Ly42/d;

    iget-object v2, p0, Ly42/d$b$a;->E:Landroid/bluetooth/BluetoothDevice;

    iget-wide v3, p0, Ly42/d$b$a;->F:J

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Ly42/d$b$a;-><init>(Ly42/d;Landroid/bluetooth/BluetoothDevice;JLq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ly42/d$b$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ly42/d$b$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ly42/d$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ly42/d$b$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ly42/d$b$a;->y:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-boolean v1, p0, Ly42/d$b$a;->w:Z

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_4
    iget-object p1, p0, Ly42/d$b$a;->z:Ly42/d;

    iget-object v1, p0, Ly42/d$b$a;->E:Landroid/bluetooth/BluetoothDevice;

    iput v4, p0, Ly42/d$b$a;->y:I

    invoke-static {p1, v1, p0}, Ly42/d;->l0(Ly42/d;Landroid/bluetooth/BluetoothDevice;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto/16 :goto_3

    :cond_5
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_6

    iget-object p1, p0, Ly42/d$b$a;->z:Ly42/d;

    invoke-static {p1}, Ly42/d;->g0(Ly42/d;)Ltr2/n;

    move-result-object p1

    iget-object v6, p0, Ly42/d$b$a;->z:Ly42/d;

    iget-object v7, p0, Ly42/d$b$a;->E:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v6, v7}, Ly42/d;->i0(Ly42/d;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "Device "

    const-string v8, " not found during scan. Retrying..."

    invoke-static {v7, v6, v8}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-array v7, v5, [Lqr2/a$a;

    invoke-interface {p1, v6, v7}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_6
    iget-object p1, p0, Ly42/d$b$a;->z:Ly42/d;

    iget-object v6, p0, Ly42/d$b$a;->E:Landroid/bluetooth/BluetoothDevice;

    iput-boolean v1, p0, Ly42/d$b$a;->w:Z

    iput v3, p0, Ly42/d$b$a;->y:I

    invoke-static {p1, v6, p0}, Ly42/d;->k0(Ly42/d;Landroid/bluetooth/BluetoothDevice;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_3

    :cond_7
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Ly42/d$b$a;->z:Ly42/d;

    invoke-static {p1}, Ly42/d;->g0(Ly42/d;)Ltr2/n;

    move-result-object p1

    iget-object v0, p0, Ly42/d$b$a;->z:Ly42/d;

    iget-object v1, p0, Ly42/d$b$a;->E:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, v1}, Ly42/d;->i0(Ly42/d;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Successfully connected to "

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v5, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_8
    iget-object v6, p0, Ly42/d$b$a;->z:Ly42/d;

    invoke-static {v6}, Ly42/d;->g0(Ly42/d;)Ltr2/n;

    move-result-object v6

    iget-object v7, p0, Ly42/d$b$a;->z:Ly42/d;

    iget-object v8, p0, Ly42/d$b$a;->E:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v7, v8}, Ly42/d;->i0(Ly42/d;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "Connection to "

    const-string v9, " failed. Retrying..."

    invoke-static {v8, v7, v9}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-array v8, v5, [Lqr2/a$a;

    invoke-interface {v6, v7, v8}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    iget-wide v6, p0, Ly42/d$b$a;->F:J

    iput-boolean v1, p0, Ly42/d$b$a;->w:Z

    iput-boolean p1, p0, Ly42/d$b$a;->x:Z

    iput v2, p0, Ly42/d$b$a;->y:I

    invoke-static {v6, v7, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_3
    return-object v0
.end method
