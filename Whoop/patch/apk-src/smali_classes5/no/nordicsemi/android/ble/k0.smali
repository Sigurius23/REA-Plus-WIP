.class public abstract Lno/nordicsemi/android/ble/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic m:I


# instance fields
.field public a:Ljc/x;

.field public b:Lno/nordicsemi/android/ble/d0;

.field public final c:Landroid/os/ConditionVariable;

.field public final d:I

.field public final e:Landroid/bluetooth/BluetoothGattCharacteristic;

.field public f:Lmd3/a;

.field public g:Lmd3/e;

.field public h:Lmd3/c;

.field public i:Lmd3/d;

.field public j:Z

.field public k:Z

.field public l:Z


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lno/nordicsemi/android/ble/k0;->d:I

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lno/nordicsemi/android/ble/k0;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 4
    new-instance p1, Landroid/os/ConditionVariable;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Landroid/os/ConditionVariable;-><init>(Z)V

    iput-object p1, p0, Lno/nordicsemi/android/ble/k0;->c:Landroid/os/ConditionVariable;

    return-void
.end method

.method public constructor <init>(Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput p2, p0, Lno/nordicsemi/android/ble/k0;->d:I

    .line 7
    iput-object p1, p0, Lno/nordicsemi/android/ble/k0;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 8
    new-instance p1, Landroid/os/ConditionVariable;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Landroid/os/ConditionVariable;-><init>(Z)V

    iput-object p1, p0, Lno/nordicsemi/android/ble/k0;->c:Landroid/os/ConditionVariable;

    return-void
.end method


# virtual methods
.method public a(Lmd3/e;)Lno/nordicsemi/android/ble/k0;
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/k0;->g:Lmd3/e;

    return-object p0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/k0;->a:Ljc/x;

    invoke-virtual {v0, p0}, Ljc/x;->F(Lno/nordicsemi/android/ble/k0;)V

    return-void
.end method

.method public c(Lmd3/c;)Lno/nordicsemi/android/ble/k0;
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/k0;->h:Lmd3/c;

    return-object p0
.end method

.method public d(Lmd3/d;)Lno/nordicsemi/android/ble/k0;
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/k0;->i:Lmd3/d;

    return-object p0
.end method

.method public e(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 3

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/k0;->l:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lno/nordicsemi/android/ble/k0;->l:Z

    iget-object v0, p0, Lno/nordicsemi/android/ble/k0;->b:Lno/nordicsemi/android/ble/d0;

    new-instance v1, Landroidx/profileinstaller/a;

    const/4 v2, 0x4

    invoke-direct {v1, p0, p1, p2, v2}, Landroidx/profileinstaller/a;-><init>(Ljava/lang/Object;Landroid/os/Parcelable;II)V

    invoke-interface {v0, v1}, Lno/nordicsemi/android/ble/d0;->e(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public f()V
    .locals 2

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/k0;->l:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lno/nordicsemi/android/ble/k0;->l:Z

    iget-object v0, p0, Lno/nordicsemi/android/ble/k0;->b:Lno/nordicsemi/android/ble/d0;

    new-instance v1, Lno/nordicsemi/android/ble/j0;

    invoke-direct {v1, p0}, Lno/nordicsemi/android/ble/j0;-><init>(Lno/nordicsemi/android/ble/k0;)V

    invoke-interface {v0, v1}, Lno/nordicsemi/android/ble/d0;->e(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public g(Landroid/bluetooth/BluetoothDevice;)V
    .locals 3

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/k0;->k:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lno/nordicsemi/android/ble/k0;->k:Z

    iget-object v0, p0, Lno/nordicsemi/android/ble/k0;->b:Lno/nordicsemi/android/ble/d0;

    new-instance v1, Lno/nordicsemi/android/ble/i0;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Lno/nordicsemi/android/ble/i0;-><init>(Lno/nordicsemi/android/ble/k0;Landroid/bluetooth/BluetoothDevice;I)V

    invoke-interface {v0, v1}, Lno/nordicsemi/android/ble/d0;->e(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public h(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 4

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/k0;->l:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lno/nordicsemi/android/ble/k0;->l:Z

    iget-object v1, p0, Lno/nordicsemi/android/ble/k0;->b:Lno/nordicsemi/android/ble/d0;

    new-instance v2, Lno/nordicsemi/android/ble/i0;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v3}, Lno/nordicsemi/android/ble/i0;-><init>(Lno/nordicsemi/android/ble/k0;Landroid/bluetooth/BluetoothDevice;I)V

    invoke-interface {v1, v2}, Lno/nordicsemi/android/ble/d0;->e(Ljava/lang/Runnable;)V

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public i(Landroid/os/Handler;)Lno/nordicsemi/android/ble/k0;
    .locals 1

    new-instance v0, Lxl/a;

    invoke-direct {v0, p0, p1}, Lxl/a;-><init>(Lno/nordicsemi/android/ble/k0;Landroid/os/Handler;)V

    iput-object v0, p0, Lno/nordicsemi/android/ble/k0;->b:Lno/nordicsemi/android/ble/d0;

    return-object p0
.end method

.method public j(Ljc/x;)V
    .locals 1

    iput-object p1, p0, Lno/nordicsemi/android/ble/k0;->a:Ljc/x;

    iget-object v0, p0, Lno/nordicsemi/android/ble/k0;->b:Lno/nordicsemi/android/ble/d0;

    if-nez v0, :cond_0

    iput-object p1, p0, Lno/nordicsemi/android/ble/k0;->b:Lno/nordicsemi/android/ble/d0;

    :cond_0
    return-void
.end method
