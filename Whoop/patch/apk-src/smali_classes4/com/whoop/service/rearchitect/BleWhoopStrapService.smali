.class public final Lcom/whoop/service/rearchitect/BleWhoopStrapService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;,
        Lcom/whoop/service/rearchitect/BleWhoopStrapService$b;,
        Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 M2\u00020\u0001:\u0003NOPB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\u000b\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0003J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0018\u0010\"\u001a\u00060\u001fR\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008*\u0010%\u001a\u0004\u0008+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008/\u0010%\u001a\u0004\u00080\u00101R(\u00109\u001a\u0004\u0018\u0001032\u0008\u00104\u001a\u0004\u0018\u0001038\u0002@BX\u0082\u000e\u00a2\u0006\u000c\n\u0004\u00085\u00106\"\u0004\u00087\u00108R \u0010>\u001a\u000c\u0012\u0006\u0008\u0001\u0012\u00020;\u0018\u00010:8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008D\u0010%\u001a\u0004\u0008E\u0010FR\u001a\u0010L\u001a\u0008\u0012\u0004\u0012\u00020I0H8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010K\u00a8\u0006Q"
    }
    d2 = {
        "Lcom/whoop/service/rearchitect/BleWhoopStrapService;",
        "Landroid/app/Service;",
        "<init>",
        "()V",
        "Landroid/content/Intent;",
        "intent",
        "Ll83/a0;",
        "m",
        "(Landroid/content/Intent;)V",
        "Landroid/bluetooth/BluetoothDevice;",
        "bluetoothDevice",
        "n",
        "(Landroid/bluetooth/BluetoothDevice;)V",
        "Ljk0/d;",
        "iWhoopStrap",
        "p",
        "(Ljk0/d;)V",
        "Lec3/l;",
        "Lst0/f;",
        "h",
        "(Ljk0/d;)Lec3/l;",
        "onDestroy",
        "Landroid/os/IBinder;",
        "onBind",
        "(Landroid/content/Intent;)Landroid/os/IBinder;",
        "Loh3/d;",
        "w",
        "Lq92/b;",
        "k",
        "()Loh3/d;",
        "log",
        "Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;",
        "x",
        "Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;",
        "whoopStrapServiceBinder",
        "Lq92/h;",
        "y",
        "Ll83/h;",
        "l",
        "()Lq92/h;",
        "whoopStrapSharedPrefs",
        "Lz82/b;",
        "z",
        "i",
        "()Lz82/b;",
        "analyticsManager",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "E",
        "getFeatureFlagChecker",
        "()Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lcom/whoop/service/rearchitect/c;",
        "value",
        "F",
        "Lcom/whoop/service/rearchitect/c;",
        "o",
        "(Lcom/whoop/service/rearchitect/c;)V",
        "whoopStrap",
        "Ljava/lang/Class;",
        "Lys0/a;",
        "G",
        "Ljava/lang/Class;",
        "implClass",
        "Lbc3/k1;",
        "H",
        "Lbc3/k1;",
        "monitorConnectionStateJob",
        "Lbc3/c0;",
        "I",
        "j",
        "()Lbc3/c0;",
        "coroutineScope",
        "Lg83/d;",
        "Lcom/whoop/service/rearchitect/b;",
        "J",
        "Lg83/d;",
        "notificationPubSub",
        "K",
        "a",
        "b",
        "c",
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


# static fields
.field public static final K:Lcom/whoop/service/rearchitect/BleWhoopStrapService$b;

.field static final synthetic L:[Lj93/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lj93/z;"
        }
    .end annotation
.end field


# instance fields
.field private final E:Ll83/h;

.field private volatile F:Lcom/whoop/service/rearchitect/c;

.field private G:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Lys0/a;",
            ">;"
        }
    .end annotation
.end field

.field private H:Lbc3/k1;

.field private final I:Ll83/h;

.field private final J:Lg83/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg83/d;"
        }
    .end annotation
.end field

.field private final w:Lq92/b;

.field private final x:Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;

.field private final y:Ll83/h;

.field private final z:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Lcom/whoop/service/rearchitect/BleWhoopStrapService;

    const-string v2, "log"

    const-string v3, "getLog()Ltimber/log/Timber$Tree;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->L:[Lj93/z;

    new-instance v0, Lcom/whoop/service/rearchitect/BleWhoopStrapService$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->K:Lcom/whoop/service/rearchitect/BleWhoopStrapService$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, Lq92/b;

    const-string v1, "BleWhoopStrapService"

    invoke-direct {v0, v1}, Lq92/b;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->w:Lq92/b;

    new-instance v0, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;

    invoke-direct {v0, p0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;-><init>(Lcom/whoop/service/rearchitect/BleWhoopStrapService;)V

    iput-object v0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->x:Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/service/rearchitect/BleWhoopStrapService$f;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$f;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->y:Ll83/h;

    new-instance v1, Lcom/whoop/service/rearchitect/BleWhoopStrapService$g;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$g;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->z:Ll83/h;

    new-instance v1, Lcom/whoop/service/rearchitect/BleWhoopStrapService$h;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$h;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->E:Ll83/h;

    new-instance v1, Lcom/whoop/service/rearchitect/BleWhoopStrapService$i;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$i;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->I:Ll83/h;

    new-instance v0, Lg83/d;

    invoke-direct {v0}, Lg83/d;-><init>()V

    iput-object v0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->J:Lg83/d;

    return-void
.end method

.method public static final synthetic a(Lcom/whoop/service/rearchitect/BleWhoopStrapService;Ljk0/d;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->h(Ljk0/d;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lcom/whoop/service/rearchitect/BleWhoopStrapService;)Loh3/d;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->k()Loh3/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lcom/whoop/service/rearchitect/BleWhoopStrapService;)Lg83/d;
    .locals 0

    iget-object p0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->J:Lg83/d;

    return-object p0
.end method

.method public static final synthetic d(Lcom/whoop/service/rearchitect/BleWhoopStrapService;)Lcom/whoop/service/rearchitect/c;
    .locals 0

    iget-object p0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->F:Lcom/whoop/service/rearchitect/c;

    return-object p0
.end method

.method public static final synthetic e(Lcom/whoop/service/rearchitect/BleWhoopStrapService;)Lq92/h;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->l()Lq92/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lcom/whoop/service/rearchitect/BleWhoopStrapService;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->n(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static final synthetic g(Lcom/whoop/service/rearchitect/BleWhoopStrapService;Lcom/whoop/service/rearchitect/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->o(Lcom/whoop/service/rearchitect/c;)V

    return-void
.end method

.method private final h(Ljk0/d;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljk0/d;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-interface {p1}, Lst0/l;->d0()Lec3/l;

    move-result-object v0

    new-instance v1, Lcom/whoop/service/rearchitect/BleWhoopStrapService$d;

    invoke-direct {v1, v0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$d;-><init>(Lec3/l;)V

    new-instance v0, Lcom/whoop/service/rearchitect/BleWhoopStrapService$e;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$e;-><init>(Lcom/whoop/service/rearchitect/BleWhoopStrapService;Ljk0/d;Lq83/d;)V

    new-instance p1, Lec3/j1;

    const/4 v2, 0x0

    invoke-direct {p1, v1, v0, v2}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    return-object p1
.end method

.method private final i()Lz82/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz82/b;

    return-object v0
.end method

.method private final j()Lbc3/c0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->I:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/c0;

    return-object v0
.end method

.method private final k()Loh3/d;
    .locals 3

    iget-object v0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->w:Lq92/b;

    sget-object v1, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->L:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lq92/b;->a(Ljava/lang/Object;Lj93/z;)Loh3/d;

    move-result-object v0

    return-object v0
.end method

.method private final l()Lq92/h;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq92/h;

    return-object v0
.end method

.method private final m(Landroid/content/Intent;)V
    .locals 5

    const-string v0, "btDevice="

    invoke-direct {p0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->k()Loh3/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "instantiateImplFromIntent"

    invoke-virtual {v1, v4, v3}, Loh3/d;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v1, "ble_handler_impl_class"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    :try_start_0
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    const-string v3, "null cannot be cast to non-null type java.lang.Class<out com.whoop.connectivityCore.ble.IBleHandler>"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Class;

    iput-object v1, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->G:Ljava/lang/Class;

    const-string v1, "whoop_strap"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {p0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->k()Loh3/d;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2}, Loh3/d;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez p1, :cond_1

    invoke-direct {p0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->l()Lq92/h;

    move-result-object p1

    invoke-virtual {p1}, Lq92/h;->a()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    :cond_1
    invoke-direct {p0, p1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->n(Landroid/bluetooth/BluetoothDevice;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    invoke-direct {p0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->k()Loh3/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Loh3/d;->c(Ljava/lang/Throwable;)V

    return-void

    :cond_2
    invoke-direct {p0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->k()Loh3/d;

    move-result-object p1

    const-string v0, "no valid intent"

    new-array v1, v2, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1}, Loh3/d;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private final n(Landroid/bluetooth/BluetoothDevice;)V
    .locals 14

    invoke-direct {p0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->k()Loh3/d;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "instantiateImpl "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v3}, Loh3/d;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->F:Lcom/whoop/service/rearchitect/c;

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->k()Loh3/d;

    move-result-object v0

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    const-string v3, "("

    const-string v4, ") :Creating a new object for Whoop Strap"

    invoke-static {v1, v3, v4}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Loh3/d;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v3, Lcom/whoop/service/rearchitect/c;->r1:Lcom/whoop/service/rearchitect/c$b;

    iget-object v6, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->G:Ljava/lang/Class;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v7, Lin2/a;

    invoke-direct {v7}, Lin2/a;-><init>()V

    invoke-direct {p0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->i()Lz82/b;

    move-result-object v8

    invoke-direct {p0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->l()Lq92/h;

    move-result-object v9

    const/16 v12, 0xc0

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v4, p0

    move-object v5, p1

    invoke-static/range {v3 .. v13}, Lcom/whoop/service/rearchitect/c$b;->b(Lcom/whoop/service/rearchitect/c$b;Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Ljava/lang/Class;Lin2/d;Lz82/b;Lq92/h;Landroid/os/HandlerThread;Lbc3/c0;ILjava/lang/Object;)Lcom/whoop/service/rearchitect/c;

    move-result-object p1

    move-object v1, v4

    invoke-direct {p0, p1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->o(Lcom/whoop/service/rearchitect/c;)V

    goto/16 :goto_3

    :cond_0
    move-object v1, p0

    move-object v5, p1

    iget-object p1, v1, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->F:Lcom/whoop/service/rearchitect/c;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lt92/b;->A()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    if-eqz v5, :cond_2

    invoke-virtual {v5}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_2
    move-object v3, v0

    :goto_1
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    invoke-direct {p0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->k()Loh3/d;

    move-result-object p1

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_3
    move-object v3, v0

    :goto_2
    iget-object v4, v1, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->F:Lcom/whoop/service/rearchitect/c;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lt92/b;->A()Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    :cond_4
    const-string v4, "User trying to connect to "

    const-string v6, " but already connected to "

    invoke-static {v4, v3, v6, v0}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v2}, Loh3/d;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, v1, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->F:Lcom/whoop/service/rearchitect/c;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/service/rearchitect/c;->k2()V

    :cond_5
    iget-object p1, v1, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->F:Lcom/whoop/service/rearchitect/c;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lt92/b;->z1()V

    :cond_6
    sget-object v0, Lcom/whoop/service/rearchitect/c;->r1:Lcom/whoop/service/rearchitect/c$b;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v3, v1, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->G:Ljava/lang/Class;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v4, Lin2/a;

    invoke-direct {v4}, Lin2/a;-><init>()V

    move-object v2, v5

    invoke-direct {p0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->i()Lz82/b;

    move-result-object v5

    invoke-direct {p0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->l()Lq92/h;

    move-result-object v6

    const/16 v9, 0xc0

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v10}, Lcom/whoop/service/rearchitect/c$b;->b(Lcom/whoop/service/rearchitect/c$b;Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Ljava/lang/Class;Lin2/d;Lz82/b;Lq92/h;Landroid/os/HandlerThread;Lbc3/c0;ILjava/lang/Object;)Lcom/whoop/service/rearchitect/c;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->o(Lcom/whoop/service/rearchitect/c;)V

    :cond_7
    :goto_3
    iget-object p1, v1, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->F:Lcom/whoop/service/rearchitect/c;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lt92/b;->O()V

    invoke-direct {p0, p1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->p(Ljk0/d;)V

    :cond_8
    return-void
.end method

.method private final o(Lcom/whoop/service/rearchitect/c;)V
    .locals 4

    invoke-direct {p0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->k()Loh3/d;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->F:Lcom/whoop/service/rearchitect/c;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "whoopStrap changed from "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " to "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Loh3/d;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->F:Lcom/whoop/service/rearchitect/c;

    return-void
.end method

.method private final p(Ljk0/d;)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->H:Lbc3/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    invoke-direct {p0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->j()Lbc3/c0;

    move-result-object v0

    new-instance v2, Lcom/whoop/service/rearchitect/BleWhoopStrapService$j;

    invoke-direct {v2, p0, p1, v1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$j;-><init>(Lcom/whoop/service/rearchitect/BleWhoopStrapService;Ljk0/d;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v1, v1, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->H:Lbc3/k1;

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->m(Landroid/content/Intent;)V

    iget-object p1, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->x:Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;

    return-object p1
.end method

.method public onDestroy()V
    .locals 3

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    invoke-direct {p0}, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->k()Loh3/d;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    invoke-virtual {v0, v2, v1}, Loh3/d;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->H:Lbc3/k1;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->F:Lcom/whoop/service/rearchitect/c;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/service/rearchitect/c;->k2()V

    :cond_1
    return-void
.end method
