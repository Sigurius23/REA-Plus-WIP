.class public final Lrk0/c;
.super Lno/nordicsemi/android/ble/c;
.source "SourceFile"

# interfaces
.implements Lpj0/a;
.implements Lqd3/b;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "MissingPermission"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrk0/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u0012\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0001\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u0000 C2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001kB?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001e\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014H\u0096@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014H\u0096@\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014H\u0096@\u00a2\u0006\u0004\u0008\u001b\u0010\u0019J\u001e\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u00142\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001e\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010 \u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008!\u0010\"J&\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010 \u001a\u00020\u00082\u0006\u0010$\u001a\u00020#H\u0096@\u00a2\u0006\u0004\u0008%\u0010&J\u001d\u0010(\u001a\u0008\u0012\u0004\u0012\u00020#0\'2\u0006\u0010 \u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008(\u0010)J\u000f\u0010*\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008*\u0010+J\u000f\u0010,\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\u0008,\u0010-J\u001f\u00101\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u001c2\u0006\u00100\u001a\u00020/H\u0016\u00a2\u0006\u0004\u00081\u00102J\u0017\u00105\u001a\u00020\u00122\u0006\u00104\u001a\u000203H\u0014\u00a2\u0006\u0004\u00085\u00106J\u000f\u00107\u001a\u00020\u0015H\u0014\u00a2\u0006\u0004\u00087\u0010+J\u000f\u00108\u001a\u00020\u0015H\u0014\u00a2\u0006\u0004\u00088\u0010+J\u0017\u00109\u001a\u00020\u00122\u0006\u00104\u001a\u000203H\u0000\u00a2\u0006\u0004\u00089\u00106J\u000f\u0010:\u001a\u00020\u0015H\u0000\u00a2\u0006\u0004\u0008:\u0010+J\u000f\u0010;\u001a\u00020\u0015H\u0000\u00a2\u0006\u0004\u0008;\u0010+J\u0017\u0010<\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008<\u0010=J\u001f\u0010?\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\u0008?\u0010@J\u0017\u0010A\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008A\u0010=J\u001f\u0010B\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\u0008B\u0010@J\u0017\u0010C\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008C\u0010=J\u0017\u0010D\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008D\u0010=JB\u0010J\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\u0008\u0000\u001082\u0006\u0010E\u001a\u00020/2\u001c\u0010I\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000G\u0012\u0006\u0012\u0004\u0018\u00010H0FH\u0080@\u00a2\u0006\u0004\u0008J\u0010KJ%\u0010M\u001a\u0008\u0012\u0004\u0012\u00020L0\u00142\u0006\u0010E\u001a\u00020/2\u0006\u0010 \u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008M\u0010NJ\u0017\u0010Q\u001a\u00020\u00152\u0006\u0010P\u001a\u00020OH\u0002\u00a2\u0006\u0004\u0008Q\u0010RR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008S\u0010TR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010UR\u001a\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008V\u0010WR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008X\u0010YR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Z\u0010[R\u001a\u0010^\u001a\u0008\u0012\u0004\u0012\u00020O0\\8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010]R \u0010b\u001a\u0008\u0012\u0004\u0012\u00020O0\'8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008B\u0010_\u001a\u0004\u0008`\u0010aR&\u0010e\u001a\u0014\u0012\u0004\u0012\u00020\u0008\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020#0\\0c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010dR\"\u0010g\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020f0c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010dR\u0014\u0010j\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008h\u0010i\u00a8\u0006l"
    }
    d2 = {
        "Lrk0/c;",
        "Lno/nordicsemi/android/ble/c;",
        "Lpj0/a;",
        "Lqd3/b;",
        "Landroid/content/Context;",
        "context",
        "Landroid/bluetooth/BluetoothDevice;",
        "device",
        "Ljava/util/UUID;",
        "serviceId",
        "",
        "characteristicIds",
        "Ltr2/n;",
        "logger",
        "Landroid/os/HandlerThread;",
        "callbackThread",
        "<init>",
        "(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/Set;Ltr2/n;Landroid/os/HandlerThread;)V",
        "",
        "autoConnect",
        "Lpj0/d;",
        "Ll83/a0;",
        "g",
        "(ZLq83/d;)Ljava/lang/Object;",
        "l",
        "(Lq83/d;)Ljava/lang/Object;",
        "s",
        "r",
        "",
        "preferred",
        "p",
        "(ILq83/d;)Ljava/lang/Object;",
        "characteristicId",
        "i",
        "(Ljava/util/UUID;Lq83/d;)Ljava/lang/Object;",
        "",
        "data",
        "j",
        "(Ljava/util/UUID;[BLq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "h",
        "(Ljava/util/UUID;)Lec3/l;",
        "close",
        "()V",
        "I",
        "()I",
        "priority",
        "",
        "message",
        "P",
        "(ILjava/lang/String;)V",
        "Landroid/bluetooth/BluetoothGatt;",
        "gatt",
        "O",
        "(Landroid/bluetooth/BluetoothGatt;)Z",
        "L",
        "T",
        "r0",
        "q0",
        "n0",
        "f",
        "(Landroid/bluetooth/BluetoothDevice;)V",
        "reason",
        "e",
        "(Landroid/bluetooth/BluetoothDevice;I)V",
        "c",
        "q",
        "t",
        "u",
        "operation",
        "Lkotlin/Function1;",
        "Lq83/d;",
        "",
        "request",
        "o0",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;",
        "",
        "s0",
        "(Ljava/lang/String;Ljava/util/UUID;)Lpj0/d;",
        "Lpj0/c;",
        "event",
        "m0",
        "(Lpj0/c;)V",
        "k",
        "Landroid/bluetooth/BluetoothDevice;",
        "Ljava/util/UUID;",
        "m",
        "Ljava/util/Set;",
        "n",
        "Ltr2/n;",
        "o",
        "Landroid/os/HandlerThread;",
        "Ldc3/l;",
        "Ldc3/l;",
        "_events",
        "Lec3/l;",
        "B",
        "()Lec3/l;",
        "events",
        "",
        "Ljava/util/Map;",
        "notificationChannels",
        "Landroid/bluetooth/BluetoothGattCharacteristic;",
        "resolved",
        "A",
        "()Z",
        "hasBond",
        "a",
        "whoop-ble-transport_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final t:Lrk0/c$a;

.field private static final u:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field private final k:Landroid/bluetooth/BluetoothDevice;

.field private final l:Ljava/util/UUID;

.field private final m:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;"
        }
    .end annotation
.end field

.field private final n:Ltr2/n;

.field private final o:Landroid/os/HandlerThread;

.field private final p:Ldc3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc3/l;"
        }
    .end annotation
.end field

.field private final q:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final r:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/util/UUID;",
            "Ldc3/l;",
            ">;"
        }
    .end annotation
.end field

.field private volatile s:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/util/UUID;",
            "+",
            "Landroid/bluetooth/BluetoothGattCharacteristic;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrk0/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrk0/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lrk0/c;->t:Lrk0/c$a;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lrk0/c;->u:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/Set;Ltr2/n;Landroid/os/HandlerThread;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/bluetooth/BluetoothDevice;",
            "Ljava/util/UUID;",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;",
            "Ltr2/n;",
            "Landroid/os/HandlerThread;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "device"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serviceId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "characteristicIds"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callbackThread"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p6}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 10
    invoke-direct {p0, p1, v0}, Lno/nordicsemi/android/ble/c;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    .line 11
    iput-object p2, p0, Lrk0/c;->k:Landroid/bluetooth/BluetoothDevice;

    .line 12
    iput-object p3, p0, Lrk0/c;->l:Ljava/util/UUID;

    .line 13
    iput-object p4, p0, Lrk0/c;->m:Ljava/util/Set;

    .line 14
    iput-object p5, p0, Lrk0/c;->n:Ltr2/n;

    .line 15
    iput-object p6, p0, Lrk0/c;->o:Landroid/os/HandlerThread;

    const/16 p1, 0x10

    const/4 p2, 0x6

    const/4 p3, 0x0

    .line 16
    invoke-static {p1, p2, p3}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object p5

    iput-object p5, p0, Lrk0/c;->p:Ldc3/l;

    .line 17
    invoke-static {p5}, Lec3/v;->K(Ldc3/w;)Lec3/g;

    move-result-object p5

    iput-object p5, p0, Lrk0/c;->q:Lec3/l;

    .line 18
    check-cast p4, Ljava/lang/Iterable;

    .line 19
    new-instance p5, Ljava/util/LinkedHashMap;

    const/16 p6, 0xa

    invoke-static {p4, p6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p6

    invoke-static {p6}, Lm83/g0;->W(I)I

    move-result p6

    if-ge p6, p1, :cond_0

    goto :goto_0

    :cond_0
    move p1, p6

    :goto_0
    invoke-direct {p5, p1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 20
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    .line 21
    move-object p6, p4

    check-cast p6, Ljava/util/UUID;

    const/16 p6, 0x40

    .line 22
    invoke-static {p6, p2, p3}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object p6

    .line 23
    invoke-interface {p5, p4, p6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 24
    :cond_1
    iput-object p5, p0, Lrk0/c;->r:Ljava/util/Map;

    .line 25
    sget-object p1, Lm83/z;->w:Lm83/z;

    iput-object p1, p0, Lrk0/c;->s:Ljava/util/Map;

    .line 26
    invoke-virtual {p0, p0}, Lno/nordicsemi/android/ble/c;->Z(Lqd3/b;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/Set;Ltr2/n;Landroid/os/HandlerThread;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    .line 1
    new-instance p6, Landroid/os/HandlerThread;

    sget-object p7, Lrk0/c;->t:Lrk0/c$a;

    invoke-virtual {p7}, Lrk0/c$a;->a()I

    move-result p7

    const-string p8, "WhoopBle-"

    .line 2
    invoke-static {p7, p8}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p7

    .line 3
    invoke-direct {p6, p7}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {p6}, Ljava/lang/Thread;->start()V

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 4
    invoke-direct/range {v0 .. v6}, Lrk0/c;-><init>(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/Set;Ltr2/n;Landroid/os/HandlerThread;)V

    return-void
.end method

.method public static synthetic e0(Ldc3/l;Lrk0/c;Ljava/util/UUID;Landroid/bluetooth/BluetoothDevice;Lnd3/a;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lrk0/c;->p0(Ldc3/l;Lrk0/c;Ljava/util/UUID;Landroid/bluetooth/BluetoothDevice;Lnd3/a;)V

    return-void
.end method

.method public static final synthetic f0(Lrk0/c;)Lno/nordicsemi/android/ble/k0;
    .locals 0

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/c;->D()Lno/nordicsemi/android/ble/k0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g0(Lrk0/c;Landroid/bluetooth/BluetoothGattCharacteristic;)Lno/nordicsemi/android/ble/q0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/c;->F(Landroid/bluetooth/BluetoothGattCharacteristic;)Lno/nordicsemi/android/ble/q0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h0(Lrk0/c;)Landroid/bluetooth/BluetoothDevice;
    .locals 0

    iget-object p0, p0, Lrk0/c;->k:Landroid/bluetooth/BluetoothDevice;

    return-object p0
.end method

.method public static final synthetic i0()Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    sget-object v0, Lrk0/c;->u:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0
.end method

.method public static final synthetic j0(Lrk0/c;)Lno/nordicsemi/android/ble/k0;
    .locals 0

    invoke-virtual {p0}, Lno/nordicsemi/android/ble/c;->W()Lno/nordicsemi/android/ble/k0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k0(Lrk0/c;I)Lno/nordicsemi/android/ble/g0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/c;->X(I)Lno/nordicsemi/android/ble/g0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l0(Lrk0/c;Landroid/bluetooth/BluetoothGattCharacteristic;[BI)Lno/nordicsemi/android/ble/q0;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lno/nordicsemi/android/ble/c;->d0(Landroid/bluetooth/BluetoothGattCharacteristic;[BI)Lno/nordicsemi/android/ble/q0;

    move-result-object p0

    return-object p0
.end method

.method private final m0(Lpj0/c;)V
    .locals 4

    iget-object v0, p0, Lrk0/c;->n:Ltr2/n;

    iget-object v1, p0, Lrk0/c;->k:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "event: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lrk0/c;->p:Ldc3/l;

    invoke-interface {v0, p1}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ldc3/n;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lrk0/c;->n:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Dropped "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ": consumer is behind"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    return-void
.end method

.method private static final p0(Ldc3/l;Lrk0/c;Ljava/util/UUID;Landroid/bluetooth/BluetoothDevice;Lnd3/a;)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "data"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p4, Lnd3/a;->w:[B

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0, p3}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of p0, p0, Ldc3/n;

    if-eqz p0, :cond_1

    iget-object p0, p1, Lrk0/c;->n:Ltr2/n;

    array-length p1, p3

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Dropped "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " bytes from "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ": consumer is behind"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    invoke-interface {p0, p1, p2}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private final s0(Ljava/lang/String;Ljava/util/UUID;)Lpj0/d;
    .locals 4

    iget-object v0, p0, Lrk0/c;->n:Ltr2/n;

    iget-object v1, p0, Lrk0/c;->k:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Cannot "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ": it is not resolved on "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    invoke-interface {v0, p1, p2}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lpj0/d$d;->a:Lpj0/d$d;

    return-object p1
.end method


# virtual methods
.method public A()Z
    .locals 2

    iget-object v0, p0, Lrk0/c;->k:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v0

    const/16 v1, 0xc

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public B()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lrk0/c;->q:Lec3/l;

    return-object v0
.end method

.method public I()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method

.method public L()V
    .locals 0

    invoke-virtual {p0}, Lrk0/c;->q0()V

    return-void
.end method

.method public O(Landroid/bluetooth/BluetoothGatt;)Z
    .locals 1

    const-string v0, "gatt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lrk0/c;->r0(Landroid/bluetooth/BluetoothGatt;)Z

    move-result p1

    return p1
.end method

.method public P(ILjava/lang/String;)V
    .locals 3

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrk0/c;->n:Ltr2/n;

    const-string v1, "Nordic"

    const/4 v2, 0x0

    invoke-interface {v0, p1, v1, p2, v2}, Ltr2/n;->h(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public T()V
    .locals 0

    invoke-virtual {p0}, Lrk0/c;->n0()V

    return-void
.end method

.method public c(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lpj0/c$d;->a:Lpj0/c$d;

    invoke-direct {p0, p1}, Lrk0/c;->m0(Lpj0/c;)V

    return-void
.end method

.method public close()V
    .locals 3

    invoke-super {p0}, Lno/nordicsemi/android/ble/c;->close()V

    iget-object v0, p0, Lrk0/c;->p:Ldc3/l;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ldc3/x;->r(Ljava/lang/Throwable;)Z

    iget-object v0, p0, Lrk0/c;->r:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldc3/l;

    invoke-interface {v2, v1}, Ldc3/x;->r(Ljava/lang/Throwable;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lrk0/c;->o:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quitSafely()Z

    return-void
.end method

.method public e(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lpj0/c$c;

    invoke-direct {p1, p2}, Lpj0/c$c;-><init>(I)V

    invoke-direct {p0, p1}, Lrk0/c;->m0(Lpj0/c;)V

    return-void
.end method

.method public f(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lpj0/c$a;->a:Lpj0/c$a;

    invoke-direct {p0, p1}, Lrk0/c;->m0(Lpj0/c;)V

    return-void
.end method

.method public g(ZLq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lq83/d<",
            "-",
            "Lpj0/d<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lrk0/c$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lrk0/c$c;-><init>(Lrk0/c;ZLq83/d;)V

    const-string p1, "connect"

    invoke-virtual {p0, p1, v0, p2}, Lrk0/c;->o0(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/util/UUID;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "characteristicId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrk0/c;->r:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ldc3/l;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lec3/v;->K(Ldc3/w;)Lec3/g;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lec3/k;->w:Lec3/k;

    return-object p1
.end method

.method public i(Ljava/util/UUID;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            "Lq83/d<",
            "-",
            "Lpj0/d<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lrk0/c;->s:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/BluetoothGattCharacteristic;

    if-nez v0, :cond_0

    const-string p2, "enable notifications on"

    invoke-direct {p0, p2, p1}, Lrk0/c;->s0(Ljava/lang/String;Ljava/util/UUID;)Lpj0/d;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lrk0/c$e;

    const/4 v1, 0x0

    invoke-direct {p1, p0, v0, v1}, Lrk0/c$e;-><init>(Lrk0/c;Landroid/bluetooth/BluetoothGattCharacteristic;Lq83/d;)V

    const-string v0, "enableNotifications"

    invoke-virtual {p0, v0, p1, p2}, Lrk0/c;->o0(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/util/UUID;[BLq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            "[B",
            "Lq83/d<",
            "-",
            "Lpj0/d<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lrk0/c;->s:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/BluetoothGattCharacteristic;

    if-nez v0, :cond_0

    const-string p2, "write to"

    invoke-direct {p0, p2, p1}, Lrk0/c;->s0(Ljava/lang/String;Ljava/util/UUID;)Lpj0/d;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lrk0/c$i;

    const/4 v1, 0x0

    invoke-direct {p1, p0, v0, p2, v1}, Lrk0/c$i;-><init>(Lrk0/c;Landroid/bluetooth/BluetoothGattCharacteristic;[BLq83/d;)V

    const-string p2, "write"

    invoke-virtual {p0, p2, p1, p3}, Lrk0/c;->o0(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public l(Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpj0/d<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lrk0/c$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lrk0/c$d;-><init>(Lrk0/c;Lq83/d;)V

    const-string v1, "dropLink"

    invoke-virtual {p0, v1, v0, p1}, Lrk0/c;->o0(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final n0()V
    .locals 1

    sget-object v0, Lm83/z;->w:Lm83/z;

    iput-object v0, p0, Lrk0/c;->s:Ljava/util/Map;

    sget-object v0, Lpj0/c$f;->a:Lpj0/c$f;

    invoke-direct {p0, v0}, Lrk0/c;->m0(Lpj0/c;)V

    return-void
.end method

.method public final o0(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-",
            "Lpj0/d<",
            "+TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lrk0/c$g;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lrk0/c$g;

    iget v1, v0, Lrk0/c$g;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lrk0/c$g;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lrk0/c$g;

    invoke-direct {v0, p0, p3}, Lrk0/c$g;-><init>(Lrk0/c;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lrk0/c$g;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lrk0/c$g;->E:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lrk0/c$g;->x:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/functions/Function1;

    iget-object p1, v0, Lrk0/c$g;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lno/nordicsemi/android/ble/exception/RequestFailedException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lno/nordicsemi/android/ble/exception/DeviceDisconnectedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lno/nordicsemi/android/ble/exception/BluetoothDisabledException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lno/nordicsemi/android/ble/exception/InvalidRequestException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    goto :goto_2

    :catch_1
    move-exception p2

    goto :goto_3

    :catch_2
    move-exception p2

    goto :goto_4

    :catch_3
    move-exception p2

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iput-object p1, v0, Lrk0/c$g;->w:Ljava/lang/Object;

    const/4 p3, 0x0

    iput-object p3, v0, Lrk0/c$g;->x:Ljava/lang/Object;

    iput v3, v0, Lrk0/c$g;->E:I

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p2, Lpj0/d$e;

    invoke-direct {p2, p3}, Lpj0/d$e;-><init>(Ljava/lang/Object;)V
    :try_end_1
    .catch Lno/nordicsemi/android/ble/exception/RequestFailedException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lno/nordicsemi/android/ble/exception/DeviceDisconnectedException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lno/nordicsemi/android/ble/exception/BluetoothDisabledException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lno/nordicsemi/android/ble/exception/InvalidRequestException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p2

    :goto_2
    iget-object p3, p0, Lrk0/c;->n:Ltr2/n;

    const-string v0, " could not be issued"

    invoke-static {p1, v0}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v4, [Lqr2/a$a;

    invoke-interface {p3, p1, p2, v0}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget-object p1, Lpj0/d$d;->a:Lpj0/d$d;

    goto :goto_6

    :goto_3
    iget-object p3, p0, Lrk0/c;->n:Ltr2/n;

    const-string v0, " failed: Bluetooth is off"

    invoke-static {p1, v0}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v4, [Lqr2/a$a;

    invoke-interface {p3, p1, p2, v0}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget-object p1, Lpj0/d$a;->a:Lpj0/d$a;

    goto :goto_6

    :goto_4
    iget-object p3, p0, Lrk0/c;->n:Ltr2/n;

    const-string v0, " failed: the device disconnected"

    invoke-static {p1, v0}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v4, [Lqr2/a$a;

    invoke-interface {p3, p1, p2, v0}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget-object p1, Lpj0/d$b;->a:Lpj0/d$b;

    goto :goto_6

    :goto_5
    iget-object p3, p0, Lrk0/c;->n:Ltr2/n;

    const-string v0, " failed with status "

    iget v1, p2, Lno/nordicsemi/android/ble/exception/RequestFailedException;->w:I

    invoke-static {v1, p1, v0}, Lm4/a;->f(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v4, [Lqr2/a$a;

    invoke-interface {p3, p1, p2, v0}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance p1, Lpj0/d$c;

    invoke-direct {p1, v1}, Lpj0/d$c;-><init>(I)V

    :goto_6
    return-object p1
.end method

.method public p(ILq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Lpj0/d<",
            "Ljava/lang/Integer;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lrk0/c$h;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lrk0/c$h;-><init>(Lrk0/c;ILq83/d;)V

    const-string p1, "negotiateMtu"

    invoke-virtual {p0, p1, v0, p2}, Lrk0/c;->o0(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public q(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lpj0/c$b;

    invoke-direct {p1, p2}, Lpj0/c$b;-><init>(I)V

    invoke-direct {p0, p1}, Lrk0/c;->m0(Lpj0/c;)V

    return-void
.end method

.method public final q0()V
    .locals 5

    iget-object v0, p0, Lrk0/c;->s:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/UUID;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/bluetooth/BluetoothGattCharacteristic;

    iget-object v3, p0, Lrk0/c;->r:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ldc3/l;

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, Lno/nordicsemi/android/ble/c;->a0(Landroid/bluetooth/BluetoothGattCharacteristic;)Lno/nordicsemi/android/ble/o0;

    move-result-object v1

    new-instance v4, Lrk0/b;

    invoke-direct {v4, v3, p0, v2}, Lrk0/b;-><init>(Ldc3/l;Lrk0/c;Ljava/util/UUID;)V

    iput-object v4, v1, Lno/nordicsemi/android/ble/o0;->a:Lmd3/b;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public r(Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpj0/d<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lrk0/c$f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lrk0/c$f;-><init>(Lrk0/c;Lq83/d;)V

    const-string v1, "forgetBond"

    invoke-virtual {p0, v1, v0, p1}, Lrk0/c;->o0(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final r0(Landroid/bluetooth/BluetoothGatt;)Z
    .locals 6

    const-string v0, "gatt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lm83/z;->w:Lm83/z;

    iput-object v0, p0, Lrk0/c;->s:Ljava/util/Map;

    iget-object v0, p0, Lrk0/c;->l:Ljava/util/UUID;

    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object p1

    const-string v0, " is missing on "

    const/4 v1, 0x0

    if-nez p1, :cond_0

    iget-object p1, p0, Lrk0/c;->n:Ltr2/n;

    iget-object v2, p0, Lrk0/c;->l:Ljava/util/UUID;

    iget-object v3, p0, Lrk0/c;->k:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Service "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v2}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lpj0/c$e;

    invoke-direct {p1, v1}, Lpj0/c$e;-><init>(Z)V

    invoke-direct {p0, p1}, Lrk0/c;->m0(Lpj0/c;)V

    return v1

    :cond_0
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v3, p0, Lrk0/c;->m:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/UUID;

    invoke-virtual {p1, v4}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v5

    if-nez v5, :cond_1

    iget-object p1, p0, Lrk0/c;->n:Ltr2/n;

    iget-object v2, p0, Lrk0/c;->k:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Characteristic "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v2}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lpj0/c$e;

    invoke-direct {p1, v1}, Lpj0/c$e;-><init>(Z)V

    invoke-direct {p0, p1}, Lrk0/c;->m0(Lpj0/c;)V

    return v1

    :cond_1
    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    iput-object v2, p0, Lrk0/c;->s:Ljava/util/Map;

    new-instance p1, Lpj0/c$e;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lpj0/c$e;-><init>(Z)V

    invoke-direct {p0, p1}, Lrk0/c;->m0(Lpj0/c;)V

    return v0
.end method

.method public s(Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpj0/d<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lrk0/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lrk0/c$b;-><init>(Lrk0/c;Lq83/d;)V

    const-string v1, "bond"

    invoke-virtual {p0, v1, v0, p1}, Lrk0/c;->o0(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public t(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public u(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
