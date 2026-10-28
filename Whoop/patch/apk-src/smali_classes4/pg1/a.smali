.class public final Lpg1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J]\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000c2\u000e\u0010\u0016\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00150\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001d\u0010!\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008!\u0010\u001cJ\u001d\u0010\"\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008\"\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010#\u001a\u0004\u0008$\u0010%R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\'\u00a8\u0006)"
    }
    d2 = {
        "Lpg1/a;",
        "",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Ll83/a0;",
        "a",
        "()V",
        "",
        "address",
        "name",
        "",
        "keepBond",
        "forceDfu",
        "bleFirmwareFilePath",
        "enablePRNs",
        "",
        "numberOfPackets",
        "buttonless",
        "Ljava/lang/Class;",
        "Lno/nordicsemi/android/dfu/DfuBaseService;",
        "dfuService",
        "d",
        "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZIZLjava/lang/Class;)V",
        "Lno/nordicsemi/android/dfu/DfuProgressListener;",
        "dfuProgressListener",
        "c",
        "(Landroid/content/Context;Lno/nordicsemi/android/dfu/DfuProgressListener;)V",
        "Lpg1/c;",
        "logListener",
        "b",
        "(Landroid/content/Context;Lpg1/c;)V",
        "f",
        "e",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "Lno/nordicsemi/android/dfu/DfuServiceController;",
        "Lno/nordicsemi/android/dfu/DfuServiceController;",
        "controller",
        "firmware-update-service_release"
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
.field private final a:Landroid/content/Context;

.field private b:Lno/nordicsemi/android/dfu/DfuServiceController;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpg1/a;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lpg1/a;->a:Landroid/content/Context;

    invoke-static {v0}, Lno/nordicsemi/android/dfu/DfuServiceInitiator;->createDfuNotificationChannel(Landroid/content/Context;)V

    return-void
.end method

.method public final b(Landroid/content/Context;Lpg1/c;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lno/nordicsemi/android/dfu/DfuServiceListenerHelper;->registerLogListener(Landroid/content/Context;Lno/nordicsemi/android/dfu/DfuLogListener;)V

    return-void
.end method

.method public final c(Landroid/content/Context;Lno/nordicsemi/android/dfu/DfuProgressListener;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dfuProgressListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lno/nordicsemi/android/dfu/DfuServiceListenerHelper;->registerProgressListener(Landroid/content/Context;Lno/nordicsemi/android/dfu/DfuProgressListener;)V

    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZIZLjava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZ",
            "Ljava/lang/String;",
            "ZIZ",
            "Ljava/lang/Class<",
            "+",
            "Lno/nordicsemi/android/dfu/DfuBaseService;",
            ">;)V"
        }
    .end annotation

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleFirmwareFilePath"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dfuService"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lno/nordicsemi/android/dfu/DfuServiceInitiator;

    invoke-direct {v0, p1}, Lno/nordicsemi/android/dfu/DfuServiceInitiator;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Lno/nordicsemi/android/dfu/DfuServiceInitiator;->setDeviceName(Ljava/lang/String;)Lno/nordicsemi/android/dfu/DfuServiceInitiator;

    move-result-object p1

    invoke-virtual {p1, p3}, Lno/nordicsemi/android/dfu/DfuServiceInitiator;->setKeepBond(Z)Lno/nordicsemi/android/dfu/DfuServiceInitiator;

    move-result-object p1

    invoke-virtual {p1, p4}, Lno/nordicsemi/android/dfu/DfuServiceInitiator;->setForceDfu(Z)Lno/nordicsemi/android/dfu/DfuServiceInitiator;

    move-result-object p1

    invoke-virtual {p1, p6}, Lno/nordicsemi/android/dfu/DfuServiceInitiator;->setPacketsReceiptNotificationsEnabled(Z)Lno/nordicsemi/android/dfu/DfuServiceInitiator;

    move-result-object p1

    invoke-virtual {p1, p7}, Lno/nordicsemi/android/dfu/DfuServiceInitiator;->setPacketsReceiptNotificationsValue(I)Lno/nordicsemi/android/dfu/DfuServiceInitiator;

    move-result-object p1

    invoke-virtual {p1, p8}, Lno/nordicsemi/android/dfu/DfuServiceInitiator;->setUnsafeExperimentalButtonlessServiceInSecureDfuEnabled(Z)Lno/nordicsemi/android/dfu/DfuServiceInitiator;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p5}, Lno/nordicsemi/android/dfu/DfuServiceInitiator;->setZip(Landroid/net/Uri;Ljava/lang/String;)Lno/nordicsemi/android/dfu/DfuServiceInitiator;

    iget-object p2, p0, Lpg1/a;->a:Landroid/content/Context;

    invoke-virtual {p1, p2, p9}, Lno/nordicsemi/android/dfu/DfuServiceInitiator;->start(Landroid/content/Context;Ljava/lang/Class;)Lno/nordicsemi/android/dfu/DfuServiceController;

    move-result-object p1

    const-string p2, "start(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpg1/a;->b:Lno/nordicsemi/android/dfu/DfuServiceController;

    return-void
.end method

.method public final e(Landroid/content/Context;Lpg1/c;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lno/nordicsemi/android/dfu/DfuServiceListenerHelper;->unregisterLogListener(Landroid/content/Context;Lno/nordicsemi/android/dfu/DfuLogListener;)V

    return-void
.end method

.method public final f(Landroid/content/Context;Lno/nordicsemi/android/dfu/DfuProgressListener;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dfuProgressListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lno/nordicsemi/android/dfu/DfuServiceListenerHelper;->unregisterProgressListener(Landroid/content/Context;Lno/nordicsemi/android/dfu/DfuProgressListener;)V

    return-void
.end method
