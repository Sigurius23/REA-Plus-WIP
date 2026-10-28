.class public final Llm0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llm0/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000g\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0008\u0007*\u0001?\u0018\u0000 C2\u00020\u0001:\u0001DB=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00132\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0082@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ#\u0010\u001d\u001a\u00020\u00132\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u001f2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0082@\u00a2\u0006\u0004\u0008 \u0010\u001aJ\u001a\u0010!\u001a\u00020\u001f2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0082@\u00a2\u0006\u0004\u0008!\u0010\u001aJ!\u0010#\u001a\u00020\u00132\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\"\u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008#\u0010$J\u0019\u0010%\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008%\u0010&J\u0017\u0010)\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\'H\u0016\u00a2\u0006\u0004\u0008)\u0010*J\u0017\u0010+\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\'H\u0016\u00a2\u0006\u0004\u0008+\u0010*J\u000f\u0010,\u001a\u00020\u0013H\u0000\u00a2\u0006\u0004\u0008,\u0010-J\u000f\u0010.\u001a\u00020\u0013H\u0000\u00a2\u0006\u0004\u0008.\u0010-J\u0019\u0010/\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000\u00a2\u0006\u0004\u0008/\u00100J\u001f\u00103\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\r2\u0006\u00102\u001a\u00020\rH\u0000\u00a2\u0006\u0004\u00083\u00104J\u001f\u00105\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\r2\u0006\u00102\u001a\u00020\rH\u0000\u00a2\u0006\u0004\u00085\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00108R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u00109R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010:R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010>R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010A\u00a8\u0006E"
    }
    d2 = {
        "Llm0/d;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Landroid/content/Context;",
        "context",
        "Lfi0/a;",
        "analytics",
        "La6/g;",
        "Lf6/f;",
        "dataStorePreferences",
        "Lbc3/c0;",
        "coroutineScope",
        "Ltr2/n;",
        "logger",
        "",
        "sdkInt",
        "<init>",
        "(Landroid/content/Context;Lfi0/a;La6/g;Lbc3/c0;Ltr2/n;I)V",
        "Landroid/content/Intent;",
        "intent",
        "Ll83/a0;",
        "r",
        "(Landroid/content/Intent;)V",
        "q",
        "Landroid/bluetooth/BluetoothDevice;",
        "device",
        "p",
        "(Landroid/bluetooth/BluetoothDevice;Lq83/d;)Ljava/lang/Object;",
        "",
        "bondLossReason",
        "y",
        "(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)V",
        "",
        "v",
        "B",
        "wasDevicePreviouslyLost",
        "z",
        "(Landroid/bluetooth/BluetoothDevice;Z)V",
        "o",
        "(Landroid/content/Intent;)Landroid/bluetooth/BluetoothDevice;",
        "Landroidx/lifecycle/g0;",
        "owner",
        "onCreate",
        "(Landroidx/lifecycle/g0;)V",
        "onDestroy",
        "w",
        "()V",
        "A",
        "n",
        "(Landroid/content/Intent;)Ljava/lang/String;",
        "bondState",
        "previousBondState",
        "u",
        "(II)Z",
        "t",
        "Landroid/content/Context;",
        "x",
        "Lfi0/a;",
        "La6/g;",
        "Lbc3/c0;",
        "E",
        "Ltr2/n;",
        "F",
        "I",
        "lm0/d$g",
        "G",
        "Llm0/d$g;",
        "receiver",
        "H",
        "a",
        "connectivity_release"
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
.field public static final H:Llm0/d$a;

.field private static final I:Lf6/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/d;"
        }
    .end annotation
.end field


# instance fields
.field private final E:Ltr2/n;

.field private final F:I

.field private final G:Llm0/d$g;

.field private final w:Landroid/content/Context;

.field private final x:Lfi0/a;

.field private final y:La6/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La6/g;"
        }
    .end annotation
.end field

.field private final z:Lbc3/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llm0/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llm0/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llm0/d;->H:Llm0/d$a;

    const-string v0, "bond_loss_reported_devices"

    invoke-static {v0}, Lge3/g;->V(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    sput-object v0, Llm0/d;->I:Lf6/d;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lfi0/a;La6/g;Lbc3/c0;Ltr2/n;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lfi0/a;",
            "La6/g;",
            "Lbc3/c0;",
            "Ltr2/n;",
            "I)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataStorePreferences"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llm0/d;->w:Landroid/content/Context;

    iput-object p2, p0, Llm0/d;->x:Lfi0/a;

    iput-object p3, p0, Llm0/d;->y:La6/g;

    iput-object p4, p0, Llm0/d;->z:Lbc3/c0;

    iput-object p5, p0, Llm0/d;->E:Ltr2/n;

    iput p6, p0, Llm0/d;->F:I

    new-instance p1, Llm0/d$g;

    invoke-direct {p1, p0}, Llm0/d$g;-><init>(Llm0/d;)V

    iput-object p1, p0, Llm0/d;->G:Llm0/d$g;

    return-void
.end method

.method private final B(Landroid/bluetooth/BluetoothDevice;Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    instance-of v0, p2, Llm0/d$i;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Llm0/d$i;

    iget v1, v0, Llm0/d$i;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llm0/d$i;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Llm0/d$i;

    invoke-direct {v0, p0, p2}, Llm0/d$i;-><init>(Llm0/d;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Llm0/d$i;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llm0/d$i;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Llm0/d$i;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v0, v0, Llm0/d$i;->w:Ljava/lang/Object;

    check-cast v0, Landroid/bluetooth/BluetoothDevice;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    iget-object p2, p0, Llm0/d;->y:La6/g;

    invoke-interface {p2}, La6/g;->getData()Lec3/l;

    move-result-object p2

    const/4 v2, 0x0

    iput-object v2, v0, Llm0/d$i;->w:Ljava/lang/Object;

    iput-object p1, v0, Llm0/d$i;->x:Ljava/lang/Object;

    iput v3, v0, Llm0/d$i;->E:I

    invoke-static {p2, v0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast p2, Lf6/f;

    sget-object v0, Llm0/d;->I:Lf6/d;

    invoke-virtual {p2, v0}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Set;

    if-nez p2, :cond_5

    sget-object p2, Lm83/a0;->w:Lm83/a0;

    :cond_5
    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_6
    :goto_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public static final synthetic a(Llm0/d;)Lfi0/a;
    .locals 0

    iget-object p0, p0, Llm0/d;->x:Lfi0/a;

    return-object p0
.end method

.method public static final synthetic b()Lf6/d;
    .locals 1

    sget-object v0, Llm0/d;->I:Lf6/d;

    return-object v0
.end method

.method public static final synthetic c(Llm0/d;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Llm0/d;->E:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic d(Llm0/d;Landroid/bluetooth/BluetoothDevice;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Llm0/d;->p(Landroid/bluetooth/BluetoothDevice;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Llm0/d;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0, p1}, Llm0/d;->q(Landroid/content/Intent;)V

    return-void
.end method

.method public static final synthetic f(Llm0/d;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0, p1}, Llm0/d;->r(Landroid/content/Intent;)V

    return-void
.end method

.method public static final synthetic g(Llm0/d;Landroid/bluetooth/BluetoothDevice;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Llm0/d;->v(Landroid/bluetooth/BluetoothDevice;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Llm0/d;Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Llm0/d;->z(Landroid/bluetooth/BluetoothDevice;Z)V

    return-void
.end method

.method public static final synthetic l(Llm0/d;Landroid/bluetooth/BluetoothDevice;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Llm0/d;->B(Landroid/bluetooth/BluetoothDevice;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final o(Landroid/content/Intent;)Landroid/bluetooth/BluetoothDevice;
    .locals 3

    iget v0, p0, Llm0/d;->F:I

    const/16 v1, 0x21

    const-string v2, "android.bluetooth.device.extra.DEVICE"

    if-lt v0, v1, :cond_0

    const-class v0, Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p1, v2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    return-object p1

    :cond_0
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    return-object p1
.end method

.method private final p(Landroid/bluetooth/BluetoothDevice;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Llm0/d$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Llm0/d$b;

    iget v1, v0, Llm0/d$b;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llm0/d$b;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Llm0/d$b;

    invoke-direct {v0, p0, p2}, Llm0/d$b;-><init>(Llm0/d;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Llm0/d$b;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llm0/d$b;->E:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Llm0/d$b;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v0, v0, Llm0/d$b;->w:Ljava/lang/Object;

    check-cast v0, Landroid/bluetooth/BluetoothDevice;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    iget-object p2, p0, Llm0/d;->y:La6/g;

    new-instance v2, Llm0/d$c;

    const/4 v5, 0x0

    invoke-direct {v2, p1, v5}, Llm0/d$c;-><init>(Ljava/lang/String;Lq83/d;)V

    iput-object v5, v0, Llm0/d$b;->w:Ljava/lang/Object;

    iput-object p1, v0, Llm0/d$b;->x:Ljava/lang/Object;

    iput v4, v0, Llm0/d$b;->E:I

    invoke-static {p2, v2, v0}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    iget-object p2, p0, Llm0/d;->E:Ltr2/n;

    const-string v0, "Bond restored - re-enabled tracking for: "

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p2, p1, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_5
    :goto_2
    return-object v3
.end method

.method private final q(Landroid/content/Intent;)V
    .locals 8

    invoke-direct {p0, p1}, Llm0/d;->o(Landroid/content/Intent;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    const-string v1, "android.bluetooth.device.extra.BOND_STATE"

    const/high16 v2, -0x80000000

    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    const-string v3, "android.bluetooth.device.extra.PREVIOUS_BOND_STATE"

    invoke-virtual {p1, v3, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-virtual {p0, v1, p1}, Llm0/d;->u(II)Z

    move-result v2

    const/4 v3, 0x0

    const-string v4, ")"

    const-string v5, " ("

    const/4 v6, 0x0

    if-eqz v2, :cond_2

    iget-object p1, p0, Llm0/d;->E:Ltr2/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v6

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v6

    :goto_1
    const-string v7, "Bond restored: "

    invoke-static {v7, v1, v5, v2, v4}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v3, [Lqr2/a$a;

    invoke-interface {p1, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Llm0/d;->z:Lbc3/c0;

    new-instance v1, Llm0/d$d;

    invoke-direct {v1, p0, v0, v6}, Llm0/d$d;-><init>(Llm0/d;Landroid/bluetooth/BluetoothDevice;Lq83/d;)V

    const/4 v0, 0x3

    invoke-static {p1, v6, v6, v1, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_2
    invoke-virtual {p0, v1, p1}, Llm0/d;->t(II)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Llm0/d;->E:Ltr2/n;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_3
    move-object v1, v6

    :goto_2
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v6

    :cond_4
    const-string v0, "Bond lost: "

    invoke-static {v0, v1, v5, v6, v4}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_5
    return-void
.end method

.method private final r(Landroid/content/Intent;)V
    .locals 7

    invoke-direct {p0, p1}, Llm0/d;->o(Landroid/content/Intent;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p0, p1}, Llm0/d;->n(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Llm0/d;->E:Ltr2/n;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    :cond_1
    const-string v4, ", Device: "

    const-string v5, " ("

    const-string v6, "Bond key missing - Reason: "

    invoke-static {v6, p1, v4, v3, v5}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ")"

    invoke-static {v2, v4, v3}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0, v0, p1}, Llm0/d;->y(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)V

    return-void
.end method

.method private final v(Landroid/bluetooth/BluetoothDevice;Lq83/d;)Ljava/lang/Object;
    .locals 6
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

    instance-of v0, p2, Llm0/d$e;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Llm0/d$e;

    iget v1, v0, Llm0/d$e;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llm0/d$e;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Llm0/d$e;

    invoke-direct {v0, p0, p2}, Llm0/d$e;-><init>(Llm0/d;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Llm0/d$e;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llm0/d$e;->F:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Llm0/d$e;->y:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/b0;

    iget-object v1, v0, Llm0/d$e;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v0, v0, Llm0/d$e;->w:Ljava/lang/Object;

    check-cast v0, Landroid/bluetooth/BluetoothDevice;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    new-instance p2, Lkotlin/jvm/internal/b0;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iget-object v2, p0, Llm0/d;->y:La6/g;

    new-instance v4, Llm0/d$f;

    const/4 v5, 0x0

    invoke-direct {v4, p2, p1, v5}, Llm0/d$f;-><init>(Lkotlin/jvm/internal/b0;Ljava/lang/String;Lq83/d;)V

    iput-object v5, v0, Llm0/d$e;->w:Ljava/lang/Object;

    iput-object v5, v0, Llm0/d$e;->x:Ljava/lang/Object;

    iput-object p2, v0, Llm0/d$e;->y:Ljava/lang/Object;

    iput v3, v0, Llm0/d$e;->F:I

    invoke-static {v2, v4, v0}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object p1, p2

    :goto_1
    iget-boolean p1, p1, Lkotlin/jvm/internal/b0;->w:Z

    xor-int/2addr p1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_5
    :goto_2
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method private final y(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Llm0/d;->z:Lbc3/c0;

    new-instance v1, Llm0/d$h;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Llm0/d$h;-><init>(Llm0/d;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final z(Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 9

    iget-object v0, p0, Llm0/d;->x:Lfi0/a;

    const-string v1, "was_device_previously_reported_lost"

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p2, v1}, Lvl/b;->p(Ljava/lang/Boolean;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    const/16 v7, 0x15

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v2, "Recovered"

    const/4 v3, 0x0

    const-string v4, "Bond Loss"

    const/4 v5, 0x0

    invoke-static/range {v0 .. v8}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    iget-object p2, p0, Llm0/d;->E:Ltr2/n;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string v0, "Bond Loss recovered event tracked - Device: "

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p2, p1, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method


# virtual methods
.method public final A()V
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Llm0/d;->w:Landroid/content/Context;

    iget-object v2, p0, Llm0/d;->G:Llm0/d$g;

    invoke-virtual {v1, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    iget-object v1, p0, Llm0/d;->E:Ltr2/n;

    const-string v2, "BondLossReceiver unregistered"

    new-array v3, v0, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    iget-object v1, p0, Llm0/d;->E:Ltr2/n;

    const-string v2, "BondLossReceiver was already unregistered"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {v1, v2, v0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public final n(Landroid/content/Intent;)Ljava/lang/String;
    .locals 3

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Llm0/d;->F:I

    const/16 v1, 0x24

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return-object v2

    :cond_0
    const-string v0, "android.bluetooth.device.extra.BOND_LOSS_REASON"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    if-eq p1, v1, :cond_6

    if-eqz p1, :cond_5

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    iget-object v0, p0, Llm0/d;->E:Ltr2/n;

    const-string v1, "Unrecognized bond loss reason: "

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    const-string v0, "unrecognized_"

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const-string p1, "LE incoming pairing"

    return-object p1

    :cond_2
    const-string p1, "LE encryption failure"

    return-object p1

    :cond_3
    const-string p1, "Bluetooth incoming pairing"

    return-object p1

    :cond_4
    const-string p1, "Bluetooth authentication failure"

    return-object p1

    :cond_5
    const-string p1, "unknown"

    return-object p1

    :cond_6
    return-object v2
.end method

.method public onCreate(Landroidx/lifecycle/g0;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llm0/d;->w()V

    return-void
.end method

.method public onDestroy(Landroidx/lifecycle/g0;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llm0/d;->A()V

    return-void
.end method

.method public bridge onPause(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onPause(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onResume(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onResume(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onStart(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStart(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onStop(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStop(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public final t(II)Z
    .locals 1

    const/16 v0, 0xa

    if-ne p1, v0, :cond_0

    const/16 p1, 0xc

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final u(II)Z
    .locals 1

    const/16 v0, 0xc

    if-ne p1, v0, :cond_1

    const/16 p1, 0xa

    if-eq p2, p1, :cond_0

    const/16 p1, 0xb

    if-ne p2, p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final w()V
    .locals 5

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.bluetooth.device.action.BOND_STATE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget v1, p0, Llm0/d;->F:I

    const/16 v2, 0x24

    if-lt v1, v2, :cond_0

    const-string v1, "android.bluetooth.device.action.KEY_MISSING"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    :cond_0
    iget-object v1, p0, Llm0/d;->w:Landroid/content/Context;

    iget-object v3, p0, Llm0/d;->G:Llm0/d$g;

    const/4 v4, 0x2

    invoke-static {v1, v3, v0, v4}, Ls4/c;->registerReceiver(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    iget v0, p0, Llm0/d;->F:I

    if-lt v0, v2, :cond_1

    const-string v0, "ACTION_KEY_MISSING + ACTION_BOND_STATE_CHANGED"

    goto :goto_0

    :cond_1
    const-string v0, "ACTION_BOND_STATE_CHANGED"

    :goto_0
    iget-object v1, p0, Llm0/d;->E:Ltr2/n;

    const-string v2, "BondLossReceiver registered - Actions: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, v0, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method
