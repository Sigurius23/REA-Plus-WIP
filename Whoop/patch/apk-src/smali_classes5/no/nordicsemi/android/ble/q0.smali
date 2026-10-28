.class public final Lno/nordicsemi/android/ble/q0;
.super Lno/nordicsemi/android/ble/n0;
.source "SourceFile"


# instance fields
.field public final r:[B

.field public final s:I

.field public t:[B

.field public u:I

.field public v:Z


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lno/nordicsemi/android/ble/k0;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lno/nordicsemi/android/ble/q0;->u:I

    const/4 p2, 0x0

    .line 3
    iput-object p2, p0, Lno/nordicsemi/android/ble/q0;->r:[B

    .line 4
    iput p1, p0, Lno/nordicsemi/android/ble/q0;->s:I

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lno/nordicsemi/android/ble/q0;->v:Z

    return-void
.end method

.method public constructor <init>(Landroid/bluetooth/BluetoothGattCharacteristic;[BII)V
    .locals 1

    const/4 v0, 0x7

    .line 6
    invoke-direct {p0, p1, v0}, Lno/nordicsemi/android/ble/k0;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    const/4 p1, 0x0

    .line 7
    iput p1, p0, Lno/nordicsemi/android/ble/q0;->u:I

    .line 8
    iput-boolean p1, p0, Lno/nordicsemi/android/ble/q0;->v:Z

    if-eqz p2, :cond_1

    .line 9
    array-length v0, p2

    if-gez v0, :cond_0

    goto :goto_0

    .line 10
    :cond_0
    array-length v0, p2

    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 11
    new-array v0, p3, [B

    .line 12
    invoke-static {p2, p1, v0, p1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 13
    :goto_1
    iput-object v0, p0, Lno/nordicsemi/android/ble/q0;->r:[B

    .line 14
    iput p4, p0, Lno/nordicsemi/android/ble/q0;->s:I

    return-void
.end method


# virtual methods
.method public final a(Lmd3/e;)Lno/nordicsemi/android/ble/k0;
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/k0;->g:Lmd3/e;

    return-object p0
.end method

.method public final c(Lmd3/c;)Lno/nordicsemi/android/ble/k0;
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/k0;->h:Lmd3/c;

    return-object p0
.end method

.method public final d(Lmd3/d;)Lno/nordicsemi/android/ble/k0;
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/k0;->i:Lmd3/d;

    return-object p0
.end method

.method public final i(Landroid/os/Handler;)Lno/nordicsemi/android/ble/k0;
    .locals 0

    const/4 p1, 0x0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/m0;->m(Landroid/os/Handler;)Lno/nordicsemi/android/ble/m0;

    return-object p0
.end method

.method public final j(Ljc/x;)V
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/m0;->n(Ljc/x;)V

    return-void
.end method

.method public final m(Landroid/os/Handler;)Lno/nordicsemi/android/ble/m0;
    .locals 0

    const/4 p1, 0x0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/m0;->m(Landroid/os/Handler;)Lno/nordicsemi/android/ble/m0;

    return-object p0
.end method

.method public final o(Landroid/bluetooth/BluetoothDevice;[B)Z
    .locals 5

    iget v0, p0, Lno/nordicsemi/android/ble/q0;->u:I

    iget-object v1, p0, Lno/nordicsemi/android/ble/q0;->t:[B

    iget-object v2, p0, Lno/nordicsemi/android/ble/k0;->b:Lno/nordicsemi/android/ble/d0;

    new-instance v3, Lno/nordicsemi/android/ble/p0;

    invoke-direct {v3, p0, p1, v1, v0}, Lno/nordicsemi/android/ble/p0;-><init>(Lno/nordicsemi/android/ble/q0;Landroid/bluetooth/BluetoothDevice;[BI)V

    invoke-interface {v2, v3}, Lno/nordicsemi/android/ble/d0;->e(Ljava/lang/Runnable;)V

    iget v0, p0, Lno/nordicsemi/android/ble/q0;->u:I

    const/4 v2, 0x1

    add-int/2addr v0, v2

    iput v0, p0, Lno/nordicsemi/android/ble/q0;->u:I

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/q0;->v:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lno/nordicsemi/android/ble/k0;->b:Lno/nordicsemi/android/ble/d0;

    new-instance v3, Lno/nordicsemi/android/ble/j;

    const/4 v4, 0x2

    invoke-direct {v3, v4, p0, p1}, Lno/nordicsemi/android/ble/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v3}, Lno/nordicsemi/android/ble/d0;->e(Ljava/lang/Runnable;)V

    :cond_0
    iget p1, p0, Lno/nordicsemi/android/ble/q0;->s:I

    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    invoke-static {p2, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1

    :cond_1
    return v2
.end method
