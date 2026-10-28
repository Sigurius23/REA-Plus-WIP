.class public final Lcom/whoop/service/rearchitect/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/service/rearchitect/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JY\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\t0\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R \u0010\u0019\u001a\u00020\u00188\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010\u001a\u0012\u0004\u0008\u001d\u0010\u0003\u001a\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Lcom/whoop/service/rearchitect/c$b;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Landroid/bluetooth/BluetoothDevice;",
        "bluetoothDevice",
        "Ljava/lang/Class;",
        "Lys0/a;",
        "bleHandlerImpl",
        "Lin2/d;",
        "dispatcherFactory",
        "Lz82/b;",
        "analyticsManager",
        "Lq92/h;",
        "whoopStrapSharedPrefs",
        "Landroid/os/HandlerThread;",
        "handlerThread",
        "Lbc3/c0;",
        "scope",
        "Lcom/whoop/service/rearchitect/c;",
        "a",
        "(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Ljava/lang/Class;Lin2/d;Lz82/b;Lq92/h;Landroid/os/HandlerThread;Lbc3/c0;)Lcom/whoop/service/rearchitect/c;",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "isOnBody",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "c",
        "()Ljava/util/concurrent/atomic/AtomicBoolean;",
        "isOnBody$annotations",
        "",
        "HIGH_FREQ_JOB",
        "Ljava/lang/String;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/service/rearchitect/c$b;-><init>()V

    return-void
.end method

.method public static b(Lcom/whoop/service/rearchitect/c$b;Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Ljava/lang/Class;Lin2/d;Lz82/b;Lq92/h;Landroid/os/HandlerThread;Lbc3/c0;ILjava/lang/Object;)Lcom/whoop/service/rearchitect/c;
    .locals 12

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_0

    new-instance v1, Landroid/os/HandlerThread;

    const-string v2, "Whoop Strap Handler"

    invoke-direct {v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    move-object v10, v1

    goto :goto_0

    :cond_0
    move-object/from16 v10, p7

    :goto_0
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_1

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v0

    invoke-interface/range {p4 .. p4}, Lin2/d;->a()Lq83/j;

    move-result-object v1

    invoke-static {v0, v1}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    move-object v11, v0

    :goto_1
    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    goto :goto_2

    :cond_1
    move-object/from16 v11, p8

    goto :goto_1

    :goto_2
    invoke-virtual/range {v3 .. v11}, Lcom/whoop/service/rearchitect/c$b;->a(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Ljava/lang/Class;Lin2/d;Lz82/b;Lq92/h;Landroid/os/HandlerThread;Lbc3/c0;)Lcom/whoop/service/rearchitect/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Ljava/lang/Class;Lin2/d;Lz82/b;Lq92/h;Landroid/os/HandlerThread;Lbc3/c0;)Lcom/whoop/service/rearchitect/c;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/bluetooth/BluetoothDevice;",
            "Ljava/lang/Class<",
            "+",
            "Lys0/a;",
            ">;",
            "Lin2/d;",
            "Lz82/b;",
            "Lq92/h;",
            "Landroid/os/HandlerThread;",
            "Lbc3/c0;",
            ")",
            "Lcom/whoop/service/rearchitect/c;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothDevice"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleHandlerImpl"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcherFactory"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsManager"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapSharedPrefs"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handlerThread"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    move-object/from16 v10, p8

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/service/rearchitect/c;

    const/16 v11, 0x80

    const/4 v12, 0x0

    const/4 v9, 0x0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v12}, Lcom/whoop/service/rearchitect/c;-><init>(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Ljava/lang/Class;Lin2/d;Lz82/b;Lq92/h;Landroid/os/HandlerThread;Lmc3/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v1, p1, p2, p1}, Lt92/b;->u2(Lt92/b;Landroid/os/Handler;ILjava/lang/Object;)V

    return-object v1
.end method

.method public final c()Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    invoke-static {}, Lcom/whoop/service/rearchitect/c;->R2()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    return-object v0
.end method
