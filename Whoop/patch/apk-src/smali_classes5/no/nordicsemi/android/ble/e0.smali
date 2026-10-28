.class public final Lno/nordicsemi/android/ble/e0;
.super Lno/nordicsemi/android/ble/m0;
.source "SourceFile"


# instance fields
.field public final q:Landroid/bluetooth/BluetoothDevice;

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:Z

.field public final w:Z


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lno/nordicsemi/android/ble/k0;-><init>(I)V

    const/4 v0, 0x0

    iput v0, p0, Lno/nordicsemi/android/ble/e0;->s:I

    iput v0, p0, Lno/nordicsemi/android/ble/e0;->t:I

    iput v0, p0, Lno/nordicsemi/android/ble/e0;->u:I

    iput-boolean v0, p0, Lno/nordicsemi/android/ble/e0;->v:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lno/nordicsemi/android/ble/e0;->w:Z

    iput-object p1, p0, Lno/nordicsemi/android/ble/e0;->q:Landroid/bluetooth/BluetoothDevice;

    iput v0, p0, Lno/nordicsemi/android/ble/e0;->r:I

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

.method public final l()V
    .locals 2

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/k0;->k:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iput-boolean v1, p0, Lno/nordicsemi/android/ble/m0;->o:Z

    iput-boolean v1, p0, Lno/nordicsemi/android/ble/k0;->l:Z

    return-void

    :cond_0
    iget-boolean v0, p0, Lno/nordicsemi/android/ble/k0;->l:Z

    if-nez v0, :cond_1

    iput-boolean v1, p0, Lno/nordicsemi/android/ble/m0;->o:Z

    iget-object v0, p0, Lno/nordicsemi/android/ble/k0;->a:Ljc/x;

    invoke-virtual {v0}, Ljc/x;->o()V

    :cond_1
    return-void
.end method

.method public final m(Landroid/os/Handler;)Lno/nordicsemi/android/ble/m0;
    .locals 0

    const/4 p1, 0x0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/m0;->m(Landroid/os/Handler;)Lno/nordicsemi/android/ble/m0;

    return-object p0
.end method
