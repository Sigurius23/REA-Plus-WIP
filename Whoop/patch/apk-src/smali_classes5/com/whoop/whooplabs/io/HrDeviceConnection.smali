.class public final Lcom/whoop/whooplabs/io/HrDeviceConnection;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whooplabs/io/HrDeviceConnection$a;,
        Lcom/whoop/whooplabs/io/HrDeviceConnection$HrDeviceConnectionException;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00aa\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0012\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001:\u00022uB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@\u00a2\u0006\u0004\u0008\u001d\u0010\u0012J\u0018\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@\u00a2\u0006\u0004\u0008\u001e\u0010\u0012J \u0010 \u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u0013H\u0083@\u00a2\u0006\u0004\u0008 \u0010!J\u0018\u0010$\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\"H\u0082@\u00a2\u0006\u0004\u0008$\u0010%J\u000f\u0010&\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008&\u0010\u0019J\u001d\u0010)\u001a\u00020\u00152\u000c\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00100\'H\u0002\u00a2\u0006\u0004\u0008)\u0010*J\u000f\u0010+\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008+\u0010\u0019J\u000f\u0010,\u001a\u00020\u0015H\u0003\u00a2\u0006\u0004\u0008,\u0010\u0019J\u0017\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020-H\u0002\u00a2\u0006\u0004\u00080\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00082\u00103\u001a\u0004\u00084\u00105R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u00086\u00107\u001a\u0004\u00088\u00109R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u0010;R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010DR\u001a\u0010I\u001a\u0008\u0012\u0004\u0012\u00020\"0F8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008G\u0010HR\u001d\u0010O\u001a\u0008\u0012\u0004\u0012\u00020\"0J8\u0006\u00a2\u0006\u000c\n\u0004\u0008K\u0010L\u001a\u0004\u0008M\u0010NR\u001a\u0010S\u001a\u0008\u0012\u0004\u0012\u00020/0P8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Q\u0010RR\u001a\u0010V\u001a\u0008\u0012\u0004\u0012\u00020T0P8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008U\u0010RR\u001d\u0010\\\u001a\u0008\u0012\u0004\u0012\u00020T0W8\u0006\u00a2\u0006\u000c\n\u0004\u0008X\u0010Y\u001a\u0004\u0008Z\u0010[R$\u0010d\u001a\u0004\u0018\u00010]8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008^\u0010_\u001a\u0004\u0008`\u0010a\"\u0004\u0008b\u0010cR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008e\u0010f\u001a\u0004\u0008g\u0010h\"\u0004\u0008i\u0010jR\u0016\u0010m\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008k\u0010lR\u0014\u0010p\u001a\u00020n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010oR\u001e\u0010r\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\'8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008&\u0010qR\u001d\u0010t\u001a\u0008\u0012\u0004\u0012\u00020/0W8\u0006\u00a2\u0006\u000c\n\u0004\u0008)\u0010Y\u001a\u0004\u0008s\u0010[\u00a8\u0006v"
    }
    d2 = {
        "Lcom/whoop/whooplabs/io/HrDeviceConnection;",
        "",
        "Lbc3/c0;",
        "scope",
        "Landroid/content/Context;",
        "context",
        "Llm0/a;",
        "bleStateChangeReceiver",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Landroid/bluetooth/BluetoothAdapter;",
        "bluetoothAdapter",
        "<init>",
        "(Lbc3/c0;Landroid/content/Context;Llm0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Landroid/bluetooth/BluetoothAdapter;)V",
        "",
        "deviceAddress",
        "Landroid/bluetooth/BluetoothDevice;",
        "v",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "",
        "emitDisconnected",
        "Ll83/a0;",
        "r",
        "(Z)V",
        "t",
        "()V",
        "z",
        "H",
        "()Z",
        "y",
        "x",
        "emitDisconnect",
        "w",
        "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;",
        "",
        "hrData",
        "G",
        "([BLq83/d;)Ljava/lang/Object;",
        "p",
        "Lbc3/k;",
        "continuation",
        "q",
        "(Lbc3/k;)V",
        "o",
        "u",
        "Landroid/bluetooth/BluetoothGattCharacteristic;",
        "characteristic",
        "",
        "E",
        "(Landroid/bluetooth/BluetoothGattCharacteristic;)I",
        "a",
        "Lbc3/c0;",
        "F",
        "()Lbc3/c0;",
        "b",
        "Landroid/content/Context;",
        "B",
        "()Landroid/content/Context;",
        "c",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "d",
        "Landroid/bluetooth/BluetoothAdapter;",
        "Landroid/bluetooth/BluetoothGatt;",
        "e",
        "Landroid/bluetooth/BluetoothGatt;",
        "gatt",
        "Ltr2/n;",
        "f",
        "Ltr2/n;",
        "logger",
        "Lec3/o1;",
        "g",
        "Lec3/o1;",
        "_dataFlow",
        "Lec3/t1;",
        "h",
        "Lec3/t1;",
        "C",
        "()Lec3/t1;",
        "dataFlow",
        "Lec3/p1;",
        "i",
        "Lec3/p1;",
        "_connectionStateFlow",
        "Lcom/whoop/whooplabs/io/HrDeviceConnection$a;",
        "j",
        "_broadcastingStateFlow",
        "Lec3/f2;",
        "k",
        "Lec3/f2;",
        "getBroadcastingStateFlow",
        "()Lec3/f2;",
        "broadcastingStateFlow",
        "Lbc3/k1;",
        "l",
        "Lbc3/k1;",
        "getPauseAndEmitNotBroadcastingJob",
        "()Lbc3/k1;",
        "setPauseAndEmitNotBroadcastingJob",
        "(Lbc3/k1;)V",
        "pauseAndEmitNotBroadcastingJob",
        "m",
        "Ljava/lang/String;",
        "D",
        "()Ljava/lang/String;",
        "I",
        "(Ljava/lang/String;)V",
        "n",
        "Z",
        "shouldAutoReconnect",
        "Lmc3/a;",
        "Lmc3/a;",
        "connectMutex",
        "Lbc3/k;",
        "activeConnectContinuation",
        "A",
        "connectionStateFlow",
        "HrDeviceConnectionException",
        "whooplabs_release"
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
.field private final a:Lbc3/c0;

.field private final b:Landroid/content/Context;

.field private final c:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final d:Landroid/bluetooth/BluetoothAdapter;

.field private e:Landroid/bluetooth/BluetoothGatt;

.field private final f:Ltr2/n;

.field private final g:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final h:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field

.field private final i:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final j:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final k:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private l:Lbc3/k1;

.field public m:Ljava/lang/String;

.field private n:Z

.field private final o:Lmc3/a;

.field private p:Lbc3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc3/k;"
        }
    .end annotation
.end field

.field private final q:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbc3/c0;Landroid/content/Context;Llm0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Landroid/bluetooth/BluetoothAdapter;)V
    .locals 2

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleStateChangeReceiver"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->a:Lbc3/c0;

    .line 3
    iput-object p2, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->b:Landroid/content/Context;

    .line 4
    iput-object p4, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    .line 5
    iput-object p5, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->d:Landroid/bluetooth/BluetoothAdapter;

    .line 6
    const-string p2, "HrDeviceConnection"

    invoke-static {p2}, Lnz2/b;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->f:Ltr2/n;

    const/4 p2, 0x0

    .line 7
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    const/4 p5, 0x7

    const/4 v0, 0x0

    .line 8
    invoke-static {p2, p2, v0, p5}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->g:Lec3/o1;

    .line 9
    invoke-static {p2}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->h:Lec3/t1;

    .line 10
    invoke-static {p4}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->i:Lec3/p1;

    .line 11
    sget-object p5, Lcom/whoop/whooplabs/io/HrDeviceConnection$a;->NOT_BROADCASTING:Lcom/whoop/whooplabs/io/HrDeviceConnection$a;

    invoke-static {p5}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p5

    iput-object p5, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->j:Lec3/p1;

    .line 12
    iput-object p5, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->k:Lec3/f2;

    const/4 p5, 0x1

    .line 13
    iput-boolean p5, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->n:Z

    .line 14
    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p5

    iput-object p5, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->o:Lmc3/a;

    .line 15
    invoke-virtual {p3}, Llm0/a;->d()Lec3/l;

    move-result-object p3

    new-instance p5, Lcom/whoop/whooplabs/io/HrDeviceConnection$f;

    invoke-direct {p5, p0, v0}, Lcom/whoop/whooplabs/io/HrDeviceConnection$f;-><init>(Lcom/whoop/whooplabs/io/HrDeviceConnection;Lq83/d;)V

    .line 16
    new-instance v0, Lec3/l1;

    const/4 v1, 0x1

    invoke-direct {v0, p2, p3, p5, v1}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    .line 17
    sget-object p2, Lec3/z1;->a:Lec3/b2;

    invoke-static {v0, p1, p2, p4}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->q:Lec3/f2;

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;Landroid/content/Context;Llm0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Landroid/bluetooth/BluetoothAdapter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 18
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p5

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 19
    invoke-direct/range {v0 .. v5}, Lcom/whoop/whooplabs/io/HrDeviceConnection;-><init>(Lbc3/c0;Landroid/content/Context;Llm0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Landroid/bluetooth/BluetoothAdapter;)V

    return-void
.end method

.method private final E(Landroid/bluetooth/BluetoothGattCharacteristic;)I
    .locals 2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getProperties()I

    move-result v0

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/16 v0, 0x12

    goto :goto_0

    :cond_0
    const/16 v0, 0x11

    :goto_0
    invoke-virtual {p1, v0, v1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getIntValue(II)Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "getIntValue(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1
.end method

.method private final G([BLq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/whoop/whooplabs/io/HrDeviceConnection$g;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$g;

    iget v1, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$g;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$g;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$g;

    invoke-direct {v0, p0, p2}, Lcom/whoop/whooplabs/io/HrDeviceConnection$g;-><init>(Lcom/whoop/whooplabs/io/HrDeviceConnection;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$g;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$g;->z:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v6, :cond_2

    if-ne v2, v5, :cond_1

    iget-object p1, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$g;->w:Ljava/lang/Object;

    check-cast p1, [B

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$g;->w:Ljava/lang/Object;

    check-cast p1, [B

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->g:Lec3/o1;

    iput-object v4, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$g;->w:Ljava/lang/Object;

    iput v6, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$g;->z:I

    invoke-interface {p2, p1, v0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->j:Lec3/p1;

    sget-object p2, Lcom/whoop/whooplabs/io/HrDeviceConnection$a;->BROADCASTING:Lcom/whoop/whooplabs/io/HrDeviceConnection$a;

    iput-object v4, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$g;->w:Ljava/lang/Object;

    iput v5, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$g;->z:I

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, p2, v0}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v3, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    invoke-direct {p0}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->p()V

    return-object v3
.end method

.method private final H()Z
    .locals 2

    iget-object v0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "dwl-android-connection-maintainer-fix"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static final synthetic a(Lcom/whoop/whooplabs/io/HrDeviceConnection;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->o()V

    return-void
.end method

.method public static final synthetic b(Lcom/whoop/whooplabs/io/HrDeviceConnection;Lbc3/k;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->q(Lbc3/k;)V

    return-void
.end method

.method public static final synthetic c(Lcom/whoop/whooplabs/io/HrDeviceConnection;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->u()V

    return-void
.end method

.method public static final synthetic d(Lcom/whoop/whooplabs/io/HrDeviceConnection;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->y(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lcom/whoop/whooplabs/io/HrDeviceConnection;)Lbc3/k;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->p:Lbc3/k;

    return-object p0
.end method

.method public static final synthetic f(Lcom/whoop/whooplabs/io/HrDeviceConnection;)Landroid/bluetooth/BluetoothAdapter;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->d:Landroid/bluetooth/BluetoothAdapter;

    return-object p0
.end method

.method public static final synthetic g(Lcom/whoop/whooplabs/io/HrDeviceConnection;Landroid/bluetooth/BluetoothGattCharacteristic;)I
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->E(Landroid/bluetooth/BluetoothGattCharacteristic;)I

    move-result p0

    return p0
.end method

.method public static final synthetic h(Lcom/whoop/whooplabs/io/HrDeviceConnection;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->f:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic i(Lcom/whoop/whooplabs/io/HrDeviceConnection;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->n:Z

    return p0
.end method

.method public static final synthetic j(Lcom/whoop/whooplabs/io/HrDeviceConnection;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->j:Lec3/p1;

    return-object p0
.end method

.method public static final synthetic k(Lcom/whoop/whooplabs/io/HrDeviceConnection;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->i:Lec3/p1;

    return-object p0
.end method

.method public static final synthetic l(Lcom/whoop/whooplabs/io/HrDeviceConnection;[BLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->G([BLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(Lcom/whoop/whooplabs/io/HrDeviceConnection;Lbc3/k;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->p:Lbc3/k;

    return-void
.end method

.method public static final synthetic n(Lcom/whoop/whooplabs/io/HrDeviceConnection;Landroid/bluetooth/BluetoothGatt;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->e:Landroid/bluetooth/BluetoothGatt;

    return-void
.end method

.method private final o()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->p:Lbc3/k;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lbc3/k;->isActive()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/util/concurrent/CancellationException;

    const-string v2, "Connection closed"

    invoke-direct {v1, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lbc3/k;->cancel(Ljava/lang/Throwable;)Z

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->p:Lbc3/k;

    return-void
.end method

.method private final p()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->l:Lbc3/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->a:Lbc3/c0;

    new-instance v2, Lcom/whoop/whooplabs/io/HrDeviceConnection$b;

    invoke-direct {v2, p0, v1}, Lcom/whoop/whooplabs/io/HrDeviceConnection$b;-><init>(Lcom/whoop/whooplabs/io/HrDeviceConnection;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v1, v1, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->l:Lbc3/k1;

    return-void
.end method

.method private final q(Lbc3/k;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/k;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->p:Lbc3/k;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->p:Lbc3/k;

    :cond_0
    return-void
.end method

.method public static synthetic s(Lcom/whoop/whooplabs/io/HrDeviceConnection;ZILjava/lang/Object;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->r(Z)V

    return-void
.end method

.method private final u()V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->e:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->disconnect()V

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->close()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->e:Landroid/bluetooth/BluetoothGatt;

    return-void
.end method

.method private final w(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lbc3/m;

    invoke-static {p3}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p3

    const/4 v1, 0x1

    invoke-direct {v0, v1, p3}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    invoke-static {p0}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->a(Lcom/whoop/whooplabs/io/HrDeviceConnection;)V

    invoke-static {p0, v0}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->m(Lcom/whoop/whooplabs/io/HrDeviceConnection;Lbc3/k;)V

    new-instance p3, Lcom/whoop/whooplabs/io/HrDeviceConnection$c;

    invoke-direct {p3, p0, v0}, Lcom/whoop/whooplabs/io/HrDeviceConnection$c;-><init>(Lcom/whoop/whooplabs/io/HrDeviceConnection;Lbc3/k;)V

    invoke-virtual {v0, p3}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->I(Ljava/lang/String;)V

    invoke-static {p0}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->c(Lcom/whoop/whooplabs/io/HrDeviceConnection;)V

    const/4 p3, 0x0

    if-eqz p2, :cond_0

    invoke-static {p0}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->k(Lcom/whoop/whooplabs/io/HrDeviceConnection;)Lec3/p1;

    move-result-object v1

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, p3}, Ljava/lang/Integer;-><init>(I)V

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    invoke-static {p0}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->f(Lcom/whoop/whooplabs/io/HrDeviceConnection;)Landroid/bluetooth/BluetoothAdapter;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, p1}, Landroid/bluetooth/BluetoothAdapter;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    const-string v1, "getRemoteDevice(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;

    invoke-direct {v1, p0, p2, v0, p1}, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;-><init>(Lcom/whoop/whooplabs/io/HrDeviceConnection;ZLbc3/k;Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->B()Landroid/content/Context;

    move-result-object p2

    const/4 v2, 0x2

    invoke-virtual {p1, p2, p3, v1, v2}, Landroid/bluetooth/BluetoothDevice;->connectGatt(Landroid/content/Context;ZLandroid/bluetooth/BluetoothGattCallback;I)Landroid/bluetooth/BluetoothGatt;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->n(Lcom/whoop/whooplabs/io/HrDeviceConnection;Landroid/bluetooth/BluetoothGatt;)V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    return-object p1
.end method

.method private final x(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p2}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->w(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final y(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/whoop/whooplabs/io/HrDeviceConnection$e;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$e;

    iget v1, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$e;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$e;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$e;

    invoke-direct {v0, p0, p2}, Lcom/whoop/whooplabs/io/HrDeviceConnection$e;-><init>(Lcom/whoop/whooplabs/io/HrDeviceConnection;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$e;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$e;->G:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$e;->x:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    iget-object v0, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$e;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p2

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$e;->y:I

    iget-object v2, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$e;->x:Ljava/lang/Object;

    check-cast v2, Lmc3/a;

    iget-object v4, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$e;->w:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, v2

    move v2, p1

    move-object p1, v4

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->o:Lmc3/a;

    iput-object p1, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$e;->w:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$e;->x:Ljava/lang/Object;

    iput v5, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$e;->y:I

    iput v4, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$e;->G:I

    invoke-interface {p2, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_2

    :cond_4
    move v2, v5

    :goto_1
    :try_start_1
    iput-object v6, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$e;->w:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$e;->x:Ljava/lang/Object;

    iput v2, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$e;->y:I

    iput v5, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$e;->z:I

    iput v3, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$e;->G:I

    invoke-direct {p0, p1, v5, v0}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->w(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_3
    :try_start_2
    check-cast p2, Landroid/bluetooth/BluetoothDevice;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {p1, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object p2

    :catchall_1
    move-exception p1

    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_4
    invoke-interface {p1, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p2
.end method


# virtual methods
.method public final A()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->q:Lec3/f2;

    return-object v0
.end method

.method public final B()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->b:Landroid/content/Context;

    return-object v0
.end method

.method public final C()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->h:Lec3/t1;

    return-object v0
.end method

.method public final D()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->m:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "deviceAddress"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final F()Lbc3/c0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->a:Lbc3/c0;

    return-object v0
.end method

.method public final I(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->m:Ljava/lang/String;

    return-void
.end method

.method public final r(Z)V
    .locals 2

    invoke-direct {p0}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->o()V

    invoke-direct {p0}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->u()V

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->i:Lec3/p1;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final t()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->n:Z

    invoke-virtual {p0, v0}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->r(Z)V

    return-void
.end method

.method public final v(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->y(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->x(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final z()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection;->n:Z

    return-void
.end method
