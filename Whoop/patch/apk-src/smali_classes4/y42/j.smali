.class public final Ly42/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0010%\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001Bg\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u0013\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u001d0%\u00a2\u0006\u0004\u0008&\u0010\'J\"\u0010*\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020(H\u0086@\u00a2\u0006\u0004\u0008*\u0010+J\u0013\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u001d0,\u00a2\u0006\u0004\u0008-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00106R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00108R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010>R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u0010@R\u001a\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010DR \u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0E8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR\u001c\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0I8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010K\u00a8\u0006M"
    }
    d2 = {
        "Ly42/j;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Ltr2/n;",
        "logger",
        "Landroid/content/Context;",
        "context",
        "Landroid/bluetooth/BluetoothAdapter;",
        "bluetoothAdapter",
        "Ld52/a;",
        "puffinPacketParser",
        "Lbc3/c0;",
        "coroutineScope",
        "Lus0/e;",
        "connectivityAnalytics",
        "Lvk0/b;",
        "bleTaskExecutor",
        "Lx42/d;",
        "puffinMemfaultFactory",
        "Lqt0/a;",
        "bleScanner",
        "La6/g;",
        "Lf6/f;",
        "dataStorePreferences",
        "Lus0/a;",
        "backgroundUsageAggregator",
        "<init>",
        "(Ltr2/n;Landroid/content/Context;Landroid/bluetooth/BluetoothAdapter;Ld52/a;Lbc3/c0;Lus0/e;Lvk0/b;Lx42/d;Lqt0/a;La6/g;Lus0/a;)V",
        "",
        "macAddress",
        "Ly42/a;",
        "f",
        "(Ljava/lang/String;)Ly42/a;",
        "Landroidx/lifecycle/g0;",
        "owner",
        "Ll83/a0;",
        "onCreate",
        "(Landroidx/lifecycle/g0;)V",
        "",
        "d",
        "()Ljava/util/List;",
        "Lus0/d$c;",
        "source",
        "c",
        "(Ljava/lang/String;Lus0/d$c;Lq83/d;)Ljava/lang/Object;",
        "Lec3/t1;",
        "e",
        "()Lec3/t1;",
        "w",
        "Ltr2/n;",
        "x",
        "Landroid/content/Context;",
        "y",
        "Landroid/bluetooth/BluetoothAdapter;",
        "z",
        "Ld52/a;",
        "E",
        "Lbc3/c0;",
        "F",
        "Lus0/e;",
        "G",
        "Lvk0/b;",
        "H",
        "Lx42/d;",
        "I",
        "Lqt0/a;",
        "J",
        "La6/g;",
        "K",
        "Lus0/a;",
        "",
        "L",
        "Ljava/util/Map;",
        "puffins",
        "Lec3/o1;",
        "M",
        "Lec3/o1;",
        "connectedPuffinFlow",
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
.field private final E:Lbc3/c0;

.field private final F:Lus0/e;

.field private final G:Lvk0/b;

.field private final H:Lx42/d;

.field private final I:Lqt0/a;

.field private final J:La6/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La6/g;"
        }
    .end annotation
.end field

.field private final K:Lus0/a;

.field private final L:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ly42/a;",
            ">;"
        }
    .end annotation
.end field

.field private final M:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final w:Ltr2/n;

.field private final x:Landroid/content/Context;

.field private final y:Landroid/bluetooth/BluetoothAdapter;

.field private final z:Ld52/a;


# direct methods
.method public constructor <init>(Ltr2/n;Landroid/content/Context;Landroid/bluetooth/BluetoothAdapter;Ld52/a;Lbc3/c0;Lus0/e;Lvk0/b;Lx42/d;Lqt0/a;La6/g;Lus0/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr2/n;",
            "Landroid/content/Context;",
            "Landroid/bluetooth/BluetoothAdapter;",
            "Ld52/a;",
            "Lbc3/c0;",
            "Lus0/e;",
            "Lvk0/b;",
            "Lx42/d;",
            "Lqt0/a;",
            "La6/g;",
            "Lus0/a;",
            ")V"
        }
    .end annotation

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothAdapter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "puffinPacketParser"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectivityAnalytics"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleTaskExecutor"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "puffinMemfaultFactory"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleScanner"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataStorePreferences"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundUsageAggregator"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly42/j;->w:Ltr2/n;

    iput-object p2, p0, Ly42/j;->x:Landroid/content/Context;

    iput-object p3, p0, Ly42/j;->y:Landroid/bluetooth/BluetoothAdapter;

    iput-object p4, p0, Ly42/j;->z:Ld52/a;

    iput-object p5, p0, Ly42/j;->E:Lbc3/c0;

    iput-object p6, p0, Ly42/j;->F:Lus0/e;

    iput-object p7, p0, Ly42/j;->G:Lvk0/b;

    iput-object p8, p0, Ly42/j;->H:Lx42/d;

    iput-object p9, p0, Ly42/j;->I:Lqt0/a;

    iput-object p10, p0, Ly42/j;->J:La6/g;

    iput-object p11, p0, Ly42/j;->K:Lus0/a;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Ly42/j;->L:Ljava/util/Map;

    const/4 p1, 0x0

    const/4 p2, 0x6

    const/4 p3, 0x1

    const/4 p4, 0x0

    invoke-static {p3, p4, p1, p2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Ly42/j;->M:Lec3/o1;

    return-void
.end method

.method public static final synthetic a(Ly42/j;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Ly42/j;->M:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic b(Ly42/j;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Ly42/j;->w:Ltr2/n;

    return-object p0
.end method

.method private final f(Ljava/lang/String;)Ly42/a;
    .locals 20

    move-object/from16 v0, p0

    :try_start_0
    new-instance v1, Ly42/e;

    iget-object v3, v0, Ly42/j;->E:Lbc3/c0;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v2, 0x0

    move-object/from16 v4, p1

    :try_start_1
    invoke-direct/range {v1 .. v6}, Ly42/e;-><init>(Ltr2/n;Lbc3/c0;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lz42/a;

    iget-object v7, v0, Ly42/j;->z:Ld52/a;

    iget-object v8, v0, Ly42/j;->E:Lbc3/c0;

    iget-object v10, v0, Ly42/j;->K:Lus0/a;

    const/16 v11, 0x9

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v12}, Lz42/a;-><init>(Ltr2/n;Ld52/a;Lbc3/c0;Lq83/j;Lus0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lz42/c;

    iget-object v8, v0, Ly42/j;->z:Ld52/a;

    iget-object v9, v0, Ly42/j;->E:Lbc3/c0;

    iget-object v11, v0, Ly42/j;->K:Lus0/a;

    const/16 v12, 0x9

    const/4 v13, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v13}, Lz42/c;-><init>(Ltr2/n;Ld52/a;Lbc3/c0;Lq83/j;Lus0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lz42/b;

    iget-object v9, v0, Ly42/j;->z:Ld52/a;

    iget-object v10, v0, Ly42/j;->E:Lbc3/c0;

    iget-object v12, v0, Ly42/j;->K:Lus0/a;

    const/16 v13, 0x9

    const/4 v14, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v14}, Lz42/b;-><init>(Ltr2/n;Ld52/a;Lbc3/c0;Lq83/j;Lus0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lz42/d;

    iget-object v10, v0, Ly42/j;->E:Lbc3/c0;

    iget-object v12, v0, Ly42/j;->K:Lus0/a;

    const/4 v13, 0x5

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v14}, Lz42/d;-><init>(Ltr2/n;Lbc3/c0;Lq83/j;Lus0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, v0, Ly42/j;->y:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v2, v4}, Landroid/bluetooth/BluetoothAdapter;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    move-object v10, v5

    move-object v5, v1

    new-instance v1, Ly42/h;

    iget-object v3, v0, Ly42/j;->x:Landroid/content/Context;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object v12, v7

    iget-object v7, v0, Ly42/j;->E:Lbc3/c0;

    iget-object v9, v0, Ly42/j;->F:Lus0/e;

    iget-object v14, v0, Ly42/j;->G:Lvk0/b;

    iget-object v15, v0, Ly42/j;->I:Lqt0/a;

    iget-object v11, v0, Ly42/j;->J:La6/g;

    iget-object v13, v0, Ly42/j;->K:Lus0/a;

    const/16 v18, 0x41

    const/16 v19, 0x0

    move-object/from16 v16, v11

    move-object v11, v6

    move-object v6, v2

    const/4 v2, 0x0

    move-object/from16 v17, v13

    move-object v13, v8

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v19}, Ly42/h;-><init>(Ltr2/n;Landroid/content/Context;Ljava/lang/String;Ly42/e;Landroid/bluetooth/BluetoothDevice;Lbc3/c0;Lbc3/z;Lus0/e;Lz42/a;Lz42/c;Lz42/b;Lz42/d;Lvk0/b;Lqt0/a;La6/g;Lus0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Ly42/h;->l1()V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v1

    :catch_0
    move-object/from16 v4, p1

    :catch_1
    iget-object v1, v0, Ly42/j;->w:Ltr2/n;

    const-string v2, "Invalid mac address - "

    invoke-static {v2, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    const/4 v1, 0x0

    return-object v1
.end method


# virtual methods
.method public final c(Ljava/lang/String;Lus0/d$c;Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lus0/d$c;",
            "Lq83/d<",
            "-",
            "Ly42/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Ly42/j$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Ly42/j$a;

    iget v1, v0, Ly42/j$a;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly42/j$a;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Ly42/j$a;

    invoke-direct {v0, p0, p3}, Ly42/j$a;-><init>(Ly42/j;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Ly42/j$a;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ly42/j$a;->F:I

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-ne v2, v4, :cond_2

    iget-object p1, v0, Ly42/j$a;->y:Ljava/lang/Object;

    check-cast p1, Ly42/a;

    iget-object p2, v0, Ly42/j$a;->x:Ljava/lang/Object;

    check-cast p2, Lus0/d$c;

    iget-object p2, v0, Ly42/j$a;->w:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_1
    move-object v10, p2

    move-object p2, p1

    move-object p1, v10

    goto/16 :goto_4

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    iget-object p1, v0, Ly42/j$a;->y:Ljava/lang/Object;

    check-cast p1, Ly42/a;

    iget-object p2, v0, Ly42/j$a;->x:Ljava/lang/Object;

    check-cast p2, Lus0/d$c;

    iget-object p2, v0, Ly42/j$a;->w:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    iget-object p1, v0, Ly42/j$a;->y:Ljava/lang/Object;

    check-cast p1, Ly42/a;

    iget-object p2, v0, Ly42/j$a;->x:Ljava/lang/Object;

    check-cast p2, Lus0/d$c;

    iget-object p2, v0, Ly42/j$a;->w:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Ly42/j;->L:Ljava/util/Map;

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ly42/a;

    if-nez p3, :cond_6

    invoke-direct {p0, p1}, Ly42/j;->f(Ljava/lang/String;)Ly42/a;

    move-result-object p3

    :cond_6
    if-nez p3, :cond_7

    return-object v7

    :cond_7
    invoke-interface {p3}, Ly42/a;->l()Lec3/t1;

    move-result-object v2

    invoke-interface {v2}, Lec3/t1;->getReplayCache()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    sget-object v8, Lc52/b$c;->a:Lc52/b$c;

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {p3, p2}, Ly42/a;->C(Lus0/d$c;)V

    sget-object p2, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/16 p2, 0xa

    sget-object v2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {p2, v2}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v8

    iput-object p1, v0, Ly42/j$a;->w:Ljava/lang/Object;

    iput-object v7, v0, Ly42/j$a;->x:Ljava/lang/Object;

    iput-object p3, v0, Ly42/j$a;->y:Ljava/lang/Object;

    iput v6, v0, Ly42/j$a;->F:I

    invoke-static {v8, v9, v0}, Lbc3/m0;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_8

    goto :goto_3

    :cond_8
    move-object p2, p1

    move-object p1, p3

    :goto_1
    iput-object p2, v0, Ly42/j$a;->w:Ljava/lang/Object;

    iput-object v7, v0, Ly42/j$a;->x:Ljava/lang/Object;

    iput-object p1, v0, Ly42/j$a;->y:Ljava/lang/Object;

    iput v5, v0, Ly42/j$a;->F:I

    invoke-static {p1, v0}, Ly42/i;->a(Ly42/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_9

    goto :goto_3

    :cond_9
    :goto_2
    instance-of p3, p3, Lc52/b$c;

    if-eqz p3, :cond_a

    iget-object p1, p0, Ly42/j;->w:Ltr2/n;

    const-string p3, "Failed to connect to puffin "

    invoke-static {p3, p2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-array p3, v3, [Lqr2/a$a;

    invoke-interface {p1, p2, p3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v7

    :cond_a
    iget-object p3, p0, Ly42/j;->L:Ljava/util/Map;

    invoke-interface {p3, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p3, p0, Ly42/j;->M:Lec3/o1;

    iput-object p2, v0, Ly42/j$a;->w:Ljava/lang/Object;

    iput-object v7, v0, Ly42/j$a;->x:Ljava/lang/Object;

    iput-object p1, v0, Ly42/j$a;->y:Ljava/lang/Object;

    iput v4, v0, Ly42/j$a;->F:I

    invoke-interface {p3, p1, v0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_1

    :goto_3
    return-object v1

    :goto_4
    move-object p3, p2

    goto :goto_5

    :cond_b
    iget-object p2, p0, Ly42/j;->w:Ltr2/n;

    invoke-interface {p3}, Ly42/a;->l()Lec3/t1;

    move-result-object v0

    invoke-interface {v0}, Lec3/t1;->getReplayCache()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Puffin "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " connection state "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {p2, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_5
    iget-object p2, p0, Ly42/j;->H:Lx42/d;

    invoke-interface {p2, p1, p3}, Lx42/d;->a(Ljava/lang/String;Ly42/a;)V

    return-object p3
.end method

.method public final d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ly42/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ly42/j;->M:Lec3/o1;

    invoke-interface {v0}, Lec3/t1;->getReplayCache()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lec3/t1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Ly42/j;->M:Lec3/o1;

    new-instance v1, Lch/i;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Lch/i;-><init>(Lec3/l;I)V

    iget-object v0, p0, Ly42/j;->E:Lbc3/c0;

    sget-object v2, Lec3/z1;->b:Lec3/b2;

    const/4 v3, 0x1

    invoke-static {v1, v0, v2, v3}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object v0

    return-object v0
.end method

.method public onCreate(Landroidx/lifecycle/g0;)V
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ly42/j;->M:Lec3/o1;

    new-instance v0, Lch/i;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lch/i;-><init>(Lec3/l;I)V

    new-instance p1, Ly42/j$b;

    const/4 v1, 0x0

    invoke-direct {p1, v1}, Ly42/j$b;-><init>(Lq83/d;)V

    invoke-static {v0, p1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v0, Ly42/j$c;

    invoke-direct {v0, p1, p0}, Ly42/j$c;-><init>(Lec3/l;Ly42/j;)V

    iget-object p1, p0, Ly42/j;->E:Lbc3/c0;

    invoke-static {v0, p1}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    return-void
.end method

.method public bridge onDestroy(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onDestroy(Landroidx/lifecycle/g0;)V

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
