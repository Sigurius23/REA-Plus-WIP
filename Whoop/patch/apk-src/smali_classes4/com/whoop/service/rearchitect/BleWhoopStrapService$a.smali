.class public final Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;
.super Landroid/os/Binder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/service/rearchitect/BleWhoopStrapService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;",
        "Landroid/os/Binder;",
        "<init>",
        "(Lcom/whoop/service/rearchitect/BleWhoopStrapService;)V",
        "Ljk0/d;",
        "f",
        "()Ljk0/d;",
        "Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;",
        "callback",
        "Ln73/b;",
        "c",
        "(Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;)Ln73/b;",
        "Landroid/bluetooth/BluetoothDevice;",
        "bluetoothDevice",
        "Ll83/a0;",
        "h",
        "(Landroid/bluetooth/BluetoothDevice;)V",
        "g",
        "()V",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic f:Lcom/whoop/service/rearchitect/BleWhoopStrapService;


# direct methods
.method public constructor <init>(Lcom/whoop/service/rearchitect/BleWhoopStrapService;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->f:Lcom/whoop/service/rearchitect/BleWhoopStrapService;

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/whoop/service/rearchitect/a;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;Lcom/whoop/service/rearchitect/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->d(Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;Lcom/whoop/service/rearchitect/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;Lcom/whoop/service/rearchitect/b;)Ll83/a0;
    .locals 1

    invoke-virtual {p1}, Lcom/whoop/service/rearchitect/b;->a()Ljk0/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/whoop/service/rearchitect/b;->a()Ljk0/d;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;->C(Ljk0/d;)V

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;->q()V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;)Ln73/b;
    .locals 3

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->f:Lcom/whoop/service/rearchitect/BleWhoopStrapService;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->d(Lcom/whoop/service/rearchitect/BleWhoopStrapService;)Lcom/whoop/service/rearchitect/c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->f:Lcom/whoop/service/rearchitect/BleWhoopStrapService;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->d(Lcom/whoop/service/rearchitect/BleWhoopStrapService;)Lcom/whoop/service/rearchitect/c;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.whoop.ble.strap.IWhoopStrap"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;->C(Ljk0/d;)V

    :cond_0
    iget-object v0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->f:Lcom/whoop/service/rearchitect/BleWhoopStrapService;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->c(Lcom/whoop/service/rearchitect/BleWhoopStrapService;)Lg83/d;

    move-result-object v0

    new-instance v1, Lcom/whoop/service/rearchitect/a;

    invoke-direct {v1, p1}, Lcom/whoop/service/rearchitect/a;-><init>(Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;)V

    new-instance p1, Lcom/whoop/data/repositories/c;

    const/16 v2, 0x15

    invoke-direct {p1, v1, v2}, Lcom/whoop/data/repositories/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lt73/b;

    sget-object v2, Lr73/a;->d:Ljc/a;

    invoke-direct {v1, p1, v2}, Lt73/b;-><init>(Lp73/b;Lp73/b;)V

    invoke-virtual {v0, v1}, Ll73/c;->c(Ll73/d;)V

    return-object v1
.end method

.method public final f()Ljk0/d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->f:Lcom/whoop/service/rearchitect/BleWhoopStrapService;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->d(Lcom/whoop/service/rearchitect/BleWhoopStrapService;)Lcom/whoop/service/rearchitect/c;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final g()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->f:Lcom/whoop/service/rearchitect/BleWhoopStrapService;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->b(Lcom/whoop/service/rearchitect/BleWhoopStrapService;)Loh3/d;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Removing whoop strap reference"

    invoke-virtual {v0, v2, v1}, Loh3/d;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->f:Lcom/whoop/service/rearchitect/BleWhoopStrapService;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->g(Lcom/whoop/service/rearchitect/BleWhoopStrapService;Lcom/whoop/service/rearchitect/c;)V

    iget-object v0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->f:Lcom/whoop/service/rearchitect/BleWhoopStrapService;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->c(Lcom/whoop/service/rearchitect/BleWhoopStrapService;)Lg83/d;

    move-result-object v0

    new-instance v2, Lcom/whoop/service/rearchitect/b;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v3, v1}, Lcom/whoop/service/rearchitect/b;-><init>(Ljk0/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v2}, Lg83/d;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public final h(Landroid/bluetooth/BluetoothDevice;)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->f:Lcom/whoop/service/rearchitect/BleWhoopStrapService;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->e(Lcom/whoop/service/rearchitect/BleWhoopStrapService;)Lq92/h;

    move-result-object v0

    invoke-virtual {v0}, Lq92/h;->a()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->f:Lcom/whoop/service/rearchitect/BleWhoopStrapService;

    invoke-static {v0, p1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->f(Lcom/whoop/service/rearchitect/BleWhoopStrapService;Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->f:Lcom/whoop/service/rearchitect/BleWhoopStrapService;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->b(Lcom/whoop/service/rearchitect/BleWhoopStrapService;)Loh3/d;

    move-result-object v0

    const-string v2, "Reinitializing WhoopStrapGatt object due to FAULTY state machine state"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v1}, Loh3/d;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->f:Lcom/whoop/service/rearchitect/BleWhoopStrapService;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->d(Lcom/whoop/service/rearchitect/BleWhoopStrapService;)Lcom/whoop/service/rearchitect/c;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/service/rearchitect/c;->k2()V

    :cond_1
    iget-object v0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->f:Lcom/whoop/service/rearchitect/BleWhoopStrapService;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->g(Lcom/whoop/service/rearchitect/BleWhoopStrapService;Lcom/whoop/service/rearchitect/c;)V

    iget-object v0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->f:Lcom/whoop/service/rearchitect/BleWhoopStrapService;

    invoke-static {v0, p1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->f(Lcom/whoop/service/rearchitect/BleWhoopStrapService;Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->f:Lcom/whoop/service/rearchitect/BleWhoopStrapService;

    invoke-static {p1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->d(Lcom/whoop/service/rearchitect/BleWhoopStrapService;)Lcom/whoop/service/rearchitect/c;

    move-result-object p1

    if-nez p1, :cond_3

    if-eqz v0, :cond_3

    iget-object p1, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->f:Lcom/whoop/service/rearchitect/BleWhoopStrapService;

    invoke-static {p1, v0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->f(Lcom/whoop/service/rearchitect/BleWhoopStrapService;Landroid/bluetooth/BluetoothDevice;)V

    iget-object p1, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->f:Lcom/whoop/service/rearchitect/BleWhoopStrapService;

    invoke-static {p1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->d(Lcom/whoop/service/rearchitect/BleWhoopStrapService;)Lcom/whoop/service/rearchitect/c;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->f:Lcom/whoop/service/rearchitect/BleWhoopStrapService;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->b(Lcom/whoop/service/rearchitect/BleWhoopStrapService;)Loh3/d;

    move-result-object v0

    const-string v2, "feature flag switched: reconnecting via nordic from cached strap"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v1}, Loh3/d;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lt92/b;->O()V

    :cond_3
    return-void
.end method
