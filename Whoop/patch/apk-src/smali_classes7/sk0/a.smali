.class public final Lsk0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnd1/j;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lsk0/a;",
        "Lnd1/j;",
        "<init>",
        "()V",
        "Ltf3/a;",
        "define",
        "()Ltf3/a;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lxf3/c;Luf3/a;)Lpj0/b;
    .locals 0

    invoke-static {p0, p1}, Lsk0/a;->e(Lxf3/c;Luf3/a;)Lpj0/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lxf3/c;Luf3/a;)Loj0/a;
    .locals 0

    invoke-static {p0, p1}, Lsk0/a;->d(Lxf3/c;Luf3/a;)Loj0/a;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ltf3/a;)Ll83/a0;
    .locals 12

    const-string v0, "$this$module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lre1/a;

    const/16 v0, 0xd

    invoke-direct {v5, v0}, Lre1/a;-><init>(I)V

    new-instance v1, Lqf3/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Loj0/a;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    sget-object v2, Lwf3/a;->e:Lvf3/c;

    const/4 v4, 0x0

    const/4 v6, 0x1

    invoke-direct/range {v1 .. v6}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v3, v4, v2}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v1}, Lrf3/b;-><init>(Lqf3/b;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lre1/a;

    const/16 v3, 0xe

    invoke-direct {v10, v3}, Lre1/a;-><init>(I)V

    move v11, v6

    new-instance v6, Lqf3/b;

    const-class v3, Lpj0/b;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v9, 0x0

    move-object v7, v2

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v2}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, p0, v0, v1}, Ldc/b;->C(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lxf3/c;Luf3/a;)Loj0/a;
    .locals 5

    const-string v0, "$this$single"

    const-string v1, "it"

    invoke-static {p0, v0, p1, v1, p0}, Lb9/y;->e(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Lxf3/c;)Landroid/content/Context;

    move-result-object p0

    new-instance p1, Ltk0/g;

    new-instance v0, Ltk0/b;

    sget-object v1, Ltr2/n;->a:Ltr2/n$a;

    const-string v2, "NordicPlatformScanner"

    invoke-virtual {v1, v2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v2

    invoke-direct {v0, v2}, Ltk0/b;-><init>(Ltr2/n;)V

    new-instance v2, Ltk0/a;

    const-class v3, Landroid/bluetooth/BluetoothManager;

    invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/bluetooth/BluetoothManager;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-direct {v2, p0, v3, v4}, Ltk0/a;-><init>(Landroid/content/Context;Landroid/bluetooth/BluetoothAdapter;I)V

    const-string p0, "WhoopBleScanner"

    invoke-virtual {v1, p0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p0

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v1

    sget-object v3, Lbc3/q0;->a:Lkc3/e;

    invoke-static {v1, v3}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object v1

    invoke-static {v1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v1

    invoke-direct {p1, v0, v2, p0, v1}, Ltk0/g;-><init>(Ltk0/d;Ltk0/e;Ltr2/n;Lbc3/c0;)V

    return-object p1
.end method

.method private static final e(Lxf3/c;Luf3/a;)Lpj0/b;
    .locals 4

    const-string v0, "$this$single"

    const-string v1, "it"

    invoke-static {p0, v0, p1, v1, p0}, Lb9/y;->e(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Lxf3/c;)Landroid/content/Context;

    move-result-object p0

    new-instance p1, Lrk0/a;

    const-class v0, Landroid/bluetooth/BluetoothManager;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/BluetoothManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    sget-object v2, Ltr2/n;->a:Ltr2/n$a;

    const-string v3, "BleTransport"

    invoke-virtual {v2, v3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v2

    invoke-direct {p1, p0, v0, v1, v2}, Lrk0/a;-><init>(Landroid/content/Context;Landroid/bluetooth/BluetoothAdapter;ILtr2/n;)V

    return-object p1
.end method


# virtual methods
.method public define()Ltf3/a;
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Lsk0/a;->c(Ltf3/a;)Ll83/a0;

    return-object v0
.end method

.method public bridge getDependencies()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lnd1/j;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Lnd1/j;->getDependencies()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge getKey()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lnd1/j;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
