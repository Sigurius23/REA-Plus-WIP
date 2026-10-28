.class public final Lno/nordicsemi/android/ble/h0;
.super Lno/nordicsemi/android/ble/n0;
.source "SourceFile"


# instance fields
.field public r:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x1b

    invoke-direct {p0, v0}, Lno/nordicsemi/android/ble/k0;-><init>(I)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lno/nordicsemi/android/ble/h0;->r:Z

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

.method public final o()Z
    .locals 1

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/h0;->r:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/m0;->o:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/k0;->l:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final p(Landroid/bluetooth/BluetoothDevice;[B)V
    .locals 4

    iget-object v0, p0, Lno/nordicsemi/android/ble/n0;->q:Ljava/lang/Object;

    check-cast v0, Lmd3/b;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iput-boolean v1, p0, Lno/nordicsemi/android/ble/h0;->r:Z

    return-void

    :cond_0
    iput-boolean v1, p0, Lno/nordicsemi/android/ble/h0;->r:Z

    new-instance v1, Lnd3/a;

    invoke-direct {v1, p2}, Lnd3/a;-><init>([B)V

    iget-object p2, p0, Lno/nordicsemi/android/ble/k0;->b:Lno/nordicsemi/android/ble/d0;

    new-instance v2, Landroidx/fragment/app/d;

    const/16 v3, 0x10

    invoke-direct {v2, v0, p1, v1, v3}, Landroidx/fragment/app/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {p2, v2}, Lno/nordicsemi/android/ble/d0;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final q(Lmd3/b;)V
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/n0;->q:Ljava/lang/Object;

    return-void
.end method
