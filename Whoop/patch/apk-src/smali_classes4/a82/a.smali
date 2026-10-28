.class public final La82/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\'\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0015\u0010\u0017R\'\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\u0008\u0012\u0004\u0012\u00020\u001a`\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u001c\u001a\u0004\u0008\u0012\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "La82/a;",
        "",
        "Lcom/whoop/data/repositories/CastlePairingChecker;",
        "castlePairingChecker",
        "<init>",
        "(Lcom/whoop/data/repositories/CastlePairingChecker;)V",
        "Landroid/bluetooth/le/ScanResult;",
        "result",
        "",
        "Lst0/v;",
        "devicesServicesIds",
        "d",
        "(Landroid/bluetooth/le/ScanResult;Ljava/util/List;)Lst0/v;",
        "",
        "e",
        "(Landroid/bluetooth/le/ScanResult;)Z",
        "c",
        "(Landroid/bluetooth/le/ScanResult;)Lst0/v;",
        "a",
        "Lcom/whoop/data/repositories/CastlePairingChecker;",
        "Landroid/bluetooth/le/ScanSettings;",
        "b",
        "Landroid/bluetooth/le/ScanSettings;",
        "()Landroid/bluetooth/le/ScanSettings;",
        "lowLatencyScanSettings",
        "Ljava/util/ArrayList;",
        "Landroid/bluetooth/le/ScanFilter;",
        "Lkotlin/collections/ArrayList;",
        "Ljava/util/ArrayList;",
        "()Ljava/util/ArrayList;",
        "emptyScanFilter",
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


# instance fields
.field private final a:Lcom/whoop/data/repositories/CastlePairingChecker;

.field private final b:Landroid/bluetooth/le/ScanSettings;

.field private final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/bluetooth/le/ScanFilter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/CastlePairingChecker;)V
    .locals 1

    const-string v0, "castlePairingChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La82/a;->a:Lcom/whoop/data/repositories/CastlePairingChecker;

    new-instance p1, Landroid/bluetooth/le/ScanSettings$Builder;

    invoke-direct {p1}, Landroid/bluetooth/le/ScanSettings$Builder;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/bluetooth/le/ScanSettings$Builder;->setLegacy(Z)Landroid/bluetooth/le/ScanSettings$Builder;

    move-result-object p1

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/bluetooth/le/ScanSettings$Builder;->setScanMode(I)Landroid/bluetooth/le/ScanSettings$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanSettings$Builder;->build()Landroid/bluetooth/le/ScanSettings;

    move-result-object p1

    const-string v0, "build(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, La82/a;->b:Landroid/bluetooth/le/ScanSettings;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La82/a;->c:Ljava/util/ArrayList;

    return-void
.end method

.method private final d(Landroid/bluetooth/le/ScanResult;Ljava/util/List;)Lst0/v;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/le/ScanResult;",
            "Ljava/util/List<",
            "+",
            "Lst0/v;",
            ">;)",
            "Lst0/v;"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanRecord;->getServiceUuids()Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_2

    :cond_0
    iget-object v1, p0, La82/a;->a:Lcom/whoop/data/repositories/CastlePairingChecker;

    invoke-virtual {v1}, Lcom/whoop/data/repositories/CastlePairingChecker;->isPairingFeatureEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    check-cast p2, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lst0/v;

    sget-object v4, Lst0/v;->MONUMENT:Lst0/v;

    if-eq v3, v4, :cond_2

    sget-object v4, Lst0/v;->SYMPHONY:Lst0/v;

    if-ne v3, v4, :cond_3

    goto :goto_0

    :cond_3
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    move-object p2, v1

    :goto_1
    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lst0/v;

    new-instance v3, Landroid/os/ParcelUuid;

    invoke-virtual {v2}, Lst0/v;->getServiceId()Ljava/util/UUID;

    move-result-object v2

    invoke-direct {v3, v2}, Landroid/os/ParcelUuid;-><init>(Ljava/util/UUID;)V

    invoke-interface {p1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    move-object v0, v1

    :cond_6
    check-cast v0, Lst0/v;

    :cond_7
    :goto_2
    return-object v0
.end method


# virtual methods
.method public final a()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Landroid/bluetooth/le/ScanFilter;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, La82/a;->c:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final b()Landroid/bluetooth/le/ScanSettings;
    .locals 1

    iget-object v0, p0, La82/a;->b:Landroid/bluetooth/le/ScanSettings;

    return-object v0
.end method

.method public final c(Landroid/bluetooth/le/ScanResult;)Lst0/v;
    .locals 2

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lst0/v;->Companion:Lst0/v$a;

    invoke-virtual {v0}, Lst0/v$a;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v0}, Lst0/v$a;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v1, v0}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-direct {p0, p1, v0}, La82/a;->d(Landroid/bluetooth/le/ScanResult;Ljava/util/List;)Lst0/v;

    move-result-object p1

    return-object p1
.end method

.method public final e(Landroid/bluetooth/le/ScanResult;)Z
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lst0/v;->Companion:Lst0/v$a;

    invoke-virtual {v0}, Lst0/v$a;->a()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p1, v0}, La82/a;->d(Landroid/bluetooth/le/ScanResult;Ljava/util/List;)Lst0/v;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
