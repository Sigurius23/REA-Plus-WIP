.class public final Ly42/d;
.super Lno/nordicsemi/android/ble/c;
.source "SourceFile"

# interfaces
.implements Lqd3/b;
.implements Lys0/a;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "MissingPermission"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly42/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001&B1\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u001f\u0010\u001aJ\u0017\u0010 \u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008 \u0010\u001aJ\u001f\u0010!\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008!\u0010\u001eJ\u000f\u0010#\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u0017\u0010&\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u0017\u0010(\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008(\u0010\u001aJ\u0017\u0010)\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008)\u0010\u001aJ\u0017\u0010+\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008+\u0010,J\u001f\u00101\u001a\u00020\"2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0016\u00a2\u0006\u0004\u00081\u00102J#\u00106\u001a\u00020\"2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020403H\u0016\u00a2\u0006\u0004\u00086\u00107J\u000f\u00108\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u00088\u00109J\u0018\u0010:\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0016H\u0082@\u00a2\u0006\u0004\u0008:\u0010;J\u0018\u0010<\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0016H\u0082@\u00a2\u0006\u0004\u0008<\u0010;J\u0017\u0010>\u001a\u00020=2\u0006\u0010%\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008>\u0010?R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010@R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010DR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008E\u0010FR\u001a\u0010I\u001a\u00020\u00108\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008G\u0010\u0011\u001a\u0004\u0008H\u0010\u0012\u00a8\u0006J"
    }
    d2 = {
        "Ly42/d;",
        "Lno/nordicsemi/android/ble/c;",
        "Lqd3/b;",
        "Lys0/a;",
        "Ltr2/n;",
        "logger",
        "Landroid/content/Context;",
        "context",
        "Lys0/a$a;",
        "puffinBleHandlerCallback",
        "Lqt0/a;",
        "bleScanner",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Ltr2/n;Landroid/content/Context;Lys0/a$a;Lqt0/a;Lbc3/c0;)V",
        "",
        "I",
        "()I",
        "Lno/nordicsemi/android/ble/b;",
        "H",
        "()Lno/nordicsemi/android/ble/b;",
        "Landroid/bluetooth/BluetoothDevice;",
        "device",
        "Ll83/a0;",
        "t",
        "(Landroid/bluetooth/BluetoothDevice;)V",
        "f",
        "reason",
        "e",
        "(Landroid/bluetooth/BluetoothDevice;I)V",
        "c",
        "u",
        "q",
        "",
        "k",
        "()Z",
        "bluetoothDevice",
        "a",
        "(Landroid/bluetooth/BluetoothDevice;)Z",
        "x",
        "d",
        "force",
        "y",
        "(Z)V",
        "Landroid/bluetooth/BluetoothGattCharacteristic;",
        "bluetoothGattCharacteristic",
        "",
        "data",
        "z",
        "(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Z",
        "",
        "Lys0/a$b;",
        "chars",
        "b",
        "(Ljava/util/Map;)Z",
        "v",
        "()V",
        "p0",
        "(Landroid/bluetooth/BluetoothDevice;Lq83/d;)Ljava/lang/Object;",
        "o0",
        "",
        "m0",
        "(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;",
        "Ltr2/n;",
        "l",
        "Lys0/a$a;",
        "m",
        "Lqt0/a;",
        "n",
        "Lbc3/c0;",
        "o",
        "w",
        "maxTransmissionUnit",
        "puffin_release"
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
.field private final k:Ltr2/n;

.field private final l:Lys0/a$a;

.field private final m:Lqt0/a;

.field private final n:Lbc3/c0;

.field private final o:I


# direct methods
.method public constructor <init>(Ltr2/n;Landroid/content/Context;Lys0/a$a;Lqt0/a;Lbc3/c0;)V
    .locals 2

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "puffinBleHandlerCallback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleScanner"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {p0, p2, v0}, Lno/nordicsemi/android/ble/c;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    .line 4
    iput-object p1, p0, Ly42/d;->k:Ltr2/n;

    .line 5
    iput-object p3, p0, Ly42/d;->l:Lys0/a$a;

    .line 6
    iput-object p4, p0, Ly42/d;->m:Lqt0/a;

    .line 7
    iput-object p5, p0, Ly42/d;->n:Lbc3/c0;

    .line 8
    invoke-virtual {p0, p0}, Lno/nordicsemi/android/ble/c;->Z(Lqd3/b;)V

    const/16 p1, 0xf7

    .line 9
    iput p1, p0, Ly42/d;->o:I

    return-void
.end method

.method public synthetic constructor <init>(Ltr2/n;Landroid/content/Context;Lys0/a$a;Lqt0/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p6, 0x1

    if-eqz p6, :cond_0

    .line 1
    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p6, "PuffinBleManager"

    invoke-virtual {p1, p6}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    :cond_0
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 2
    invoke-direct/range {p2 .. p7}, Ly42/d;-><init>(Ltr2/n;Landroid/content/Context;Lys0/a$a;Lqt0/a;Lbc3/c0;)V

    return-void
.end method

.method public static synthetic e0(Lys0/a$b;Ly42/d;Landroid/bluetooth/BluetoothDevice;Lnd3/a;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ly42/d;->n0(Lys0/a$b;Ly42/d;Landroid/bluetooth/BluetoothDevice;Lnd3/a;)V

    return-void
.end method

.method public static final synthetic f0(Ly42/d;)Lqt0/a;
    .locals 0

    iget-object p0, p0, Ly42/d;->m:Lqt0/a;

    return-object p0
.end method

.method public static final synthetic g0(Ly42/d;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Ly42/d;->k:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic h0(Ly42/d;)Lys0/a$a;
    .locals 0

    iget-object p0, p0, Ly42/d;->l:Lys0/a$a;

    return-object p0
.end method

.method public static final synthetic i0(Ly42/d;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Ly42/d;->m0(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j0(Ly42/d;I)Lno/nordicsemi/android/ble/g0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/c;->X(I)Lno/nordicsemi/android/ble/g0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k0(Ly42/d;Landroid/bluetooth/BluetoothDevice;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Ly42/d;->o0(Landroid/bluetooth/BluetoothDevice;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l0(Ly42/d;Landroid/bluetooth/BluetoothDevice;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Ly42/d;->p0(Landroid/bluetooth/BluetoothDevice;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final m0(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    const-string v0, "getAddress(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    return-object v0
.end method

.method private static final n0(Lys0/a$b;Ly42/d;Landroid/bluetooth/BluetoothDevice;Lnd3/a;)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "data"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object p2, p3, Lnd3/a;->w:[B

    const-string p3, "null cannot be cast to non-null type kotlin.ByteArray"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p2}, Lys0/a$b;->a([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    iget-object p1, p1, Ly42/d;->k:Ltr2/n;

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    const-string p3, "Failed to notify characteristic changed"

    invoke-interface {p1, p3, p0, p2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-void
.end method

.method private final o0(Landroid/bluetooth/BluetoothDevice;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lbc3/m;

    invoke-static {p2}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p2

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/c;->C(Landroid/bluetooth/BluetoothDevice;)Lno/nordicsemi/android/ble/e0;

    move-result-object p2

    new-instance v1, Ly42/d$c;

    invoke-direct {v1, p0, p1}, Ly42/d$c;-><init>(Ly42/d;Landroid/bluetooth/BluetoothDevice;)V

    iput-object v1, p2, Lno/nordicsemi/android/ble/k0;->f:Lmd3/a;

    new-instance v1, Ly42/d$d;

    invoke-direct {v1, v0}, Ly42/d$d;-><init>(Lbc3/k;)V

    iput-object v1, p2, Lno/nordicsemi/android/ble/k0;->g:Lmd3/e;

    new-instance v1, Ly42/d$e;

    invoke-direct {v1, p0, p1, v0}, Ly42/d$e;-><init>(Ly42/d;Landroid/bluetooth/BluetoothDevice;Lbc3/k;)V

    iput-object v1, p2, Lno/nordicsemi/android/ble/k0;->h:Lmd3/c;

    const/4 p1, 0x2

    iput p1, p2, Lno/nordicsemi/android/ble/e0;->r:I

    invoke-virtual {p2}, Lno/nordicsemi/android/ble/k0;->b()V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    return-object p1
.end method

.method private final p0(Landroid/bluetooth/BluetoothDevice;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Ly42/d$f;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ly42/d$f;

    iget v1, v0, Ly42/d$f;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly42/d$f;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Ly42/d$f;

    invoke-direct {v0, p0, p2}, Ly42/d$f;-><init>(Ly42/d;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Ly42/d$f;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ly42/d$f;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Ly42/d$f;->w:Ljava/lang/Object;

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    new-instance p2, Ly42/d$g;

    const/4 v2, 0x0

    invoke-direct {p2, p0, p1, v2}, Ly42/d$g;-><init>(Ly42/d;Landroid/bluetooth/BluetoothDevice;Lq83/d;)V

    iput-object p1, v0, Ly42/d$f;->w:Ljava/lang/Object;

    iput v4, v0, Ly42/d$f;->z:I

    const-wide/16 v5, 0x1388

    invoke-static {v5, v6, p2, v0}, Lbc3/k2;->d(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    if-eqz p2, :cond_4

    move v3, v4

    goto :goto_3

    :goto_2
    iget-object v0, p0, Ly42/d;->k:Ltr2/n;

    invoke-direct {p0, p1}, Ly42/d;->m0(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "Scan failed for "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {v0, p1, p2, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_4
    :goto_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public H()Lno/nordicsemi/android/ble/b;
    .locals 1

    new-instance v0, Ly42/d$a;

    invoke-direct {v0, p0}, Ly42/d$a;-><init>(Ly42/d;)V

    return-object v0
.end method

.method public I()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public a(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1

    const-string v0, "bluetoothDevice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public b(Ljava/util/Map;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Landroid/bluetooth/BluetoothGattCharacteristic;",
            "+",
            "Lys0/a$b;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "chars"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type com.whoop.connectivityCore.ble.IBleHandler.CharacteristicNotificationCallback"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lys0/a$b;

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v4

    iget-object v5, p0, Ly42/d;->k:Ltr2/n;

    invoke-interface {v3}, Lys0/a$b;->getName()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Registering "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, " for notifications with callback: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-array v7, v1, [Lqr2/a$a;

    invoke-interface {v5, v6, v7}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p0, v2}, Lno/nordicsemi/android/ble/c;->a0(Landroid/bluetooth/BluetoothGattCharacteristic;)Lno/nordicsemi/android/ble/o0;

    move-result-object v5

    new-instance v6, Ly42/b;

    invoke-direct {v6, v3, p0}, Ly42/b;-><init>(Lys0/a$b;Ly42/d;)V

    iput-object v6, v5, Lno/nordicsemi/android/ble/o0;->a:Lmd3/b;

    :try_start_0
    invoke-virtual {p0, v2}, Lno/nordicsemi/android/ble/c;->F(Landroid/bluetooth/BluetoothGattCharacteristic;)Lno/nordicsemi/android/ble/q0;

    move-result-object v2

    invoke-virtual {v2}, Lno/nordicsemi/android/ble/m0;->k()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    instance-of v0, p1, Lno/nordicsemi/android/ble/exception/RequestFailedException;

    const-string v2, "Failed to register notifications for "

    if-eqz v0, :cond_1

    iget-object v0, p0, Ly42/d;->k:Ltr2/n;

    check-cast p1, Lno/nordicsemi/android/ble/exception/RequestFailedException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " with status: "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, Lno/nordicsemi/android/ble/exception/RequestFailedException;->w:I

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v2, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_1

    :cond_1
    instance-of v0, p1, Ljava/lang/NullPointerException;

    if-eqz v0, :cond_2

    iget-object v0, p0, Ly42/d;->k:Ltr2/n;

    const-string v2, "Caught a NullPointerException while trying to register for notifications synchronously"

    new-array v3, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, p1, v3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Ly42/d;->k:Ltr2/n;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, p1, v3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_1
    return v1

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public c(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly42/d;->l:Lys0/a$a;

    invoke-interface {v0, p1}, Lys0/a$a;->c(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public d(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    const-string v0, "bluetoothDevice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/c;->E()Lno/nordicsemi/android/ble/f0;

    move-result-object p1

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/k0;->b()V

    return-void
.end method

.method public e(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 2

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly42/d;->l:Lys0/a$a;

    const-string v1, "Failed to connect"

    invoke-interface {v0, p1, p2, v1}, Lys0/a$a;->X0(Landroid/bluetooth/BluetoothDevice;ILjava/lang/String;)V

    return-void
.end method

.method public f(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly42/d;->l:Lys0/a$a;

    invoke-interface {v0, p1}, Lys0/a$a;->L(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public k()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public q(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    const-string p2, "device"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Ly42/d;->l:Lys0/a$a;

    invoke-interface {p2, p1}, Lys0/a$a;->V(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public t(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly42/d;->l:Lys0/a$a;

    invoke-interface {v0, p1}, Lys0/a$a;->C0(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public u(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly42/d;->l:Lys0/a$a;

    invoke-interface {v0, p1}, Lys0/a$a;->P(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public v()V
    .locals 0

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/c;->close()V

    return-void
.end method

.method public w()I
    .locals 1

    iget v0, p0, Ly42/d;->o:I

    return v0
.end method

.method public x(Landroid/bluetooth/BluetoothDevice;)V
    .locals 10

    const-string v0, "bluetoothDevice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/16 v0, 0x3c

    sget-object v1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v5

    iget-object v0, p0, Ly42/d;->n:Lbc3/c0;

    new-instance v2, Ly42/d$b;

    const/4 v9, 0x0

    const-wide/16 v7, 0x3e8

    move-object v3, p0

    move-object v4, p1

    invoke-direct/range {v2 .. v9}, Ly42/d$b;-><init>(Ly42/d;Landroid/bluetooth/BluetoothDevice;JJLq83/d;)V

    const/4 p1, 0x3

    const/4 v1, 0x0

    invoke-static {v0, v1, v1, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public y(Z)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/c;->V()Lno/nordicsemi/android/ble/k0;

    move-result-object p1

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/k0;->b()V

    :cond_0
    return-void
.end method

.method public z(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Z
    .locals 1

    const-string v0, "bluetoothGattCharacteristic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-virtual {p0, p1, p2, v0}, Lno/nordicsemi/android/ble/c;->d0(Landroid/bluetooth/BluetoothGattCharacteristic;[BI)Lno/nordicsemi/android/ble/q0;

    move-result-object p1

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/k0;->b()V

    const/4 p1, 0x1

    return p1
.end method
