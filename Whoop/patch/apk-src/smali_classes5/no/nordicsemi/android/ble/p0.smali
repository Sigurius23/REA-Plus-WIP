.class public final synthetic Lno/nordicsemi/android/ble/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:Lno/nordicsemi/android/ble/q0;


# direct methods
.method public synthetic constructor <init>(Lno/nordicsemi/android/ble/q0;Landroid/bluetooth/BluetoothDevice;[BI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/nordicsemi/android/ble/p0;->w:Lno/nordicsemi/android/ble/q0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/p0;->w:Lno/nordicsemi/android/ble/q0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
