.class final Lvx0/e$d$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvx0/e$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lec3/m;",
        "Lmj0/e;",
        "",
        "error",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;Ljava/lang/Throwable;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.debug.whoopble.WhoopBleDebugViewModel$startScan$2$1"
    f = "WhoopBleDebugViewModel.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lvx0/e;


# direct methods
.method public constructor <init>(Lvx0/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvx0/e;",
            "Lq83/d<",
            "-",
            "Lvx0/e$d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvx0/e$d$a;->y:Lvx0/e;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Ljava/lang/Throwable;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p1, Lvx0/e$d$a;

    iget-object v0, p0, Lvx0/e$d$a;->y:Lvx0/e;

    invoke-direct {p1, v0, p3}, Lvx0/e$d$a;-><init>(Lvx0/e;Lq83/d;)V

    iput-object p2, p1, Lvx0/e$d$a;->x:Ljava/lang/Object;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvx0/e$d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lvx0/e$d$a;->invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lvx0/e$d$a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvx0/e$d$a;->w:I

    if-nez v1, :cond_6

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lvx0/e$d$a;->y:Lvx0/e;

    invoke-static {p1}, Lvx0/e;->j(Lvx0/e;)Lec3/p1;

    move-result-object p1

    :cond_0
    move-object v1, p1

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lvx0/d;

    sget-object v4, Lcom/whoop/ble/api/scan/ScanFailure$PermissionDenied;->w:Lcom/whoop/ble/api/scan/ScanFailure$PermissionDenied;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "BLE permission missing. Grant BLUETOOTH_SCAN/CONNECT in system settings."

    :goto_0
    move-object v8, v4

    goto :goto_1

    :cond_1
    sget-object v4, Lcom/whoop/ble/api/scan/ScanFailure$BluetoothOff;->w:Lcom/whoop/ble/api/scan/ScanFailure$BluetoothOff;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v4, "Bluetooth is off."

    goto :goto_0

    :cond_2
    sget-object v4, Lcom/whoop/ble/api/scan/ScanFailure$BluetoothUnsupported;->w:Lcom/whoop/ble/api/scan/ScanFailure$BluetoothUnsupported;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const-string v4, "No Bluetooth adapter on this device."

    goto :goto_0

    :cond_3
    sget-object v4, Lcom/whoop/ble/api/scan/ScanFailure$LocationServicesOff;->w:Lcom/whoop/ble/api/scan/ScanFailure$LocationServicesOff;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const-string v4, "Turn Location on. Below Android 12 a BLE scan returns nothing without it."

    goto :goto_0

    :cond_4
    instance-of v4, v0, Lcom/whoop/ble/api/scan/ScanFailure$Rejected;

    if-eqz v4, :cond_5

    move-object v4, v0

    check-cast v4, Lcom/whoop/ble/api/scan/ScanFailure$Rejected;

    invoke-virtual {v4}, Lcom/whoop/ble/api/scan/ScanFailure$Rejected;->a()I

    move-result v4

    const-string v5, "Platform rejected the scan (code "

    const-string v6, "). Too many scan restarts?"

    invoke-static {v4, v5, v6}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Scan failed: "

    invoke-static {v5, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :goto_1
    const/16 v10, 0x2f

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-static/range {v3 .. v11}, Lvx0/d;->b(Lvx0/d;Ljava/util/List;Lft0/a;ZLjava/util/List;Ljava/lang/String;ZILjava/lang/Object;)Lvx0/d;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
