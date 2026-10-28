.class public final Lno/nordicsemi/android/ble/l;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# static fields
.field public static final synthetic c:I


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lno/nordicsemi/android/ble/l;->a:I

    iput-object p1, p0, Lno/nordicsemi/android/ble/l;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 12

    iget p1, p0, Lno/nordicsemi/android/ble/l;->a:I

    const/4 v0, 0x1

    const/4 v1, -0x1

    const/4 v2, 0x0

    const-string v3, "android.bluetooth.device.extra.DEVICE"

    const/16 v4, 0xa

    iget-object v5, p0, Lno/nordicsemi/android/ble/l;->b:Ljava/lang/Object;

    const/4 v6, 0x3

    packed-switch p1, :pswitch_data_0

    invoke-virtual {p2, v3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    check-cast v5, Lno/nordicsemi/android/ble/c;

    iget-object v0, v5, Lno/nordicsemi/android/ble/c;->b:Lno/nordicsemi/android/ble/b;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/c0;->z1()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "android.bluetooth.device.extra.PAIRING_VARIANT"

    invoke-virtual {p2, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const-string v2, "android.bluetooth.device.extra.PAIRING_KEY"

    invoke-virtual {p2, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "[Broadcast] Action received: android.bluetooth.device.action.PAIRING_REQUEST, pairing variant: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Lrd3/a;->a:[C

    packed-switch v0, :pswitch_data_1

    const-string v2, "UNKNOWN ("

    const-string v3, ")"

    invoke-static {v0, v2, v3}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :pswitch_0
    const-string v2, "PAIRING_VARIANT_OOB_CONSENT"

    goto :goto_0

    :pswitch_1
    const-string v2, "PAIRING_VARIANT_DISPLAY_PIN"

    goto :goto_0

    :pswitch_2
    const-string v2, "PAIRING_VARIANT_DISPLAY_PASSKEY"

    goto :goto_0

    :pswitch_3
    const-string v2, "PAIRING_VARIANT_CONSENT"

    goto :goto_0

    :pswitch_4
    const-string v2, "PAIRING_VARIANT_PASSKEY_CONFIRMATION"

    goto :goto_0

    :pswitch_5
    const-string v2, "PAIRING_VARIANT_PASSKEY"

    goto :goto_0

    :pswitch_6
    const-string v2, "PAIRING_VARIANT_PIN"

    :goto_0
    const-string v3, " ("

    const-string v4, "); key: "

    invoke-static {v0, v2, v3, v4, v1}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v6, v1}, Lno/nordicsemi/android/ble/c;->P(ILjava/lang/String;)V

    invoke-virtual {v5, p1, v0, p2}, Lno/nordicsemi/android/ble/c;->S(Landroid/bluetooth/BluetoothDevice;II)V

    :cond_1
    :goto_1
    return-void

    :pswitch_7
    const-string p1, "android.bluetooth.adapter.extra.STATE"

    invoke-virtual {p2, p1, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    const-string v1, "android.bluetooth.adapter.extra.PREVIOUS_STATE"

    invoke-virtual {p2, v1, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    check-cast v5, Lno/nordicsemi/android/ble/c0;

    new-instance v1, Lno/nordicsemi/android/ble/s;

    invoke-direct {v1, p0, p1}, Lno/nordicsemi/android/ble/s;-><init>(Lno/nordicsemi/android/ble/l;I)V

    invoke-virtual {v5, v6, v1}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    const/16 v1, 0xd

    if-eq p1, v4, :cond_2

    if-eq p1, v1, :cond_2

    goto :goto_2

    :cond_2
    if-eq p2, v1, :cond_6

    if-eq p2, v4, :cond_6

    invoke-static {v5, v0}, Lno/nordicsemi/android/ble/c0;->l1(Lno/nordicsemi/android/ble/c0;Z)V

    const/16 p1, -0x64

    invoke-virtual {v5, p1}, Lno/nordicsemi/android/ble/c0;->w1(I)V

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->m1(Lno/nordicsemi/android/ble/c0;)V

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->J0(Lno/nordicsemi/android/ble/c0;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object v1

    iget v1, v1, Lno/nordicsemi/android/ble/k0;->d:I

    if-eq v1, v6, :cond_3

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object v1

    invoke-virtual {v1, p2, p1}, Lno/nordicsemi/android/ble/k0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->o1(Lno/nordicsemi/android/ble/c0;)V

    :cond_3
    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->K0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/e0;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->K0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/e0;

    move-result-object v1

    invoke-virtual {v1, p2, p1}, Lno/nordicsemi/android/ble/m0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->Y0(Lno/nordicsemi/android/ble/c0;)V

    :cond_4
    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->s1(Lno/nordicsemi/android/ble/c0;)V

    invoke-static {v5, v2}, Lno/nordicsemi/android/ble/c0;->l1(Lno/nordicsemi/android/ble/c0;Z)V

    if-eqz p2, :cond_5

    invoke-virtual {v5, p2, v0}, Lno/nordicsemi/android/ble/c0;->W1(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_5
    invoke-static {v5, v2}, Lno/nordicsemi/android/ble/c0;->Z0(Lno/nordicsemi/android/ble/c0;Z)V

    invoke-static {v5, v2}, Lno/nordicsemi/android/ble/c0;->c1(Lno/nordicsemi/android/ble/c0;I)V

    goto :goto_2

    :cond_6
    invoke-virtual {v5}, Lno/nordicsemi/android/ble/c0;->v1()V

    :goto_2
    return-void

    :pswitch_8
    invoke-virtual {p2, v3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    const-string v2, "android.bluetooth.device.extra.BOND_STATE"

    invoke-virtual {p2, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    const-string v3, "android.bluetooth.device.extra.PREVIOUS_BOND_STATE"

    invoke-virtual {p2, v3, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    check-cast v5, Lno/nordicsemi/android/ble/c0;

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->J0(Lno/nordicsemi/android/ble/c0;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    if-eqz v1, :cond_f

    if-eqz p1, :cond_f

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->J0(Lno/nordicsemi/android/ble/c0;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v3

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto/16 :goto_4

    :cond_7
    new-instance v1, Lno/nordicsemi/android/ble/s;

    const/16 v3, 0x8

    invoke-direct {v1, v2, v3}, Lno/nordicsemi/android/ble/s;-><init>(II)V

    invoke-virtual {v5, v6, v1}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    const/4 v1, 0x4

    const/4 v7, 0x2

    const/4 v8, 0x7

    const/4 v9, 0x6

    const/4 v10, 0x5

    packed-switch v2, :pswitch_data_2

    goto/16 :goto_3

    :pswitch_9
    new-instance p2, Lno/nordicsemi/android/ble/u;

    invoke-direct {p2, v4}, Lno/nordicsemi/android/ble/u;-><init>(I)V

    invoke-virtual {v5, v1, p2}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    invoke-virtual {v5}, Lno/nordicsemi/android/ble/c0;->k2()V

    new-instance p2, Lno/nordicsemi/android/ble/g;

    invoke-direct {p2, p1, v7}, Lno/nordicsemi/android/ble/g;-><init>(Ljava/lang/Object;I)V

    invoke-static {v5, p2}, Lno/nordicsemi/android/ble/c0;->u1(Lno/nordicsemi/android/ble/c0;Lno/nordicsemi/android/ble/g;)V

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    if-eqz p2, :cond_9

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    iget p2, p2, Lno/nordicsemi/android/ble/k0;->d:I

    if-eq p2, v1, :cond_8

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    iget p2, p2, Lno/nordicsemi/android/ble/k0;->d:I

    if-ne p2, v10, :cond_9

    :cond_8
    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    invoke-virtual {p2, p1}, Lno/nordicsemi/android/ble/k0;->h(Landroid/bluetooth/BluetoothDevice;)Z

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->o1(Lno/nordicsemi/android/ble/c0;)V

    goto/16 :goto_3

    :cond_9
    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->W0(Lno/nordicsemi/android/ble/c0;)Z

    move-result p1

    if-nez p1, :cond_f

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->V0(Lno/nordicsemi/android/ble/c0;)Z

    move-result p1

    if-nez p1, :cond_f

    iget-object p1, v5, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    if-eqz p1, :cond_f

    invoke-static {v5, v0}, Lno/nordicsemi/android/ble/c0;->p1(Lno/nordicsemi/android/ble/c0;Z)V

    new-instance p2, Lno/nordicsemi/android/ble/u;

    invoke-direct {p2, v9}, Lno/nordicsemi/android/ble/u;-><init>(I)V

    invoke-virtual {v5, v7, p2}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    new-instance p2, Lno/nordicsemi/android/ble/u;

    invoke-direct {p2, v8}, Lno/nordicsemi/android/ble/u;-><init>(I)V

    invoke-virtual {v5, v6, p2}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    goto/16 :goto_4

    :pswitch_a
    invoke-virtual {v5}, Lno/nordicsemi/android/ble/c0;->k2()V

    new-instance p2, Lno/nordicsemi/android/ble/g;

    invoke-direct {p2, p1, v1}, Lno/nordicsemi/android/ble/g;-><init>(Ljava/lang/Object;I)V

    invoke-static {v5, p2}, Lno/nordicsemi/android/ble/c0;->u1(Lno/nordicsemi/android/ble/c0;Lno/nordicsemi/android/ble/g;)V

    goto/16 :goto_4

    :pswitch_b
    const/16 v2, 0xc

    const/16 v11, 0xb

    if-ne p2, v11, :cond_c

    invoke-virtual {v5}, Lno/nordicsemi/android/ble/c0;->k2()V

    new-instance p2, Lno/nordicsemi/android/ble/g;

    invoke-direct {p2, p1, v6}, Lno/nordicsemi/android/ble/g;-><init>(Ljava/lang/Object;I)V

    invoke-static {v5, p2}, Lno/nordicsemi/android/ble/c0;->u1(Lno/nordicsemi/android/ble/c0;Lno/nordicsemi/android/ble/g;)V

    new-instance p2, Lno/nordicsemi/android/ble/u;

    invoke-direct {p2, v3}, Lno/nordicsemi/android/ble/u;-><init>(I)V

    invoke-virtual {v5, v10, p2}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    if-eqz p2, :cond_b

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    iget p2, p2, Lno/nordicsemi/android/ble/k0;->d:I

    if-eq p2, v1, :cond_a

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    iget p2, p2, Lno/nordicsemi/android/ble/k0;->d:I

    if-eq p2, v10, :cond_a

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    iget p2, p2, Lno/nordicsemi/android/ble/k0;->d:I

    if-eq p2, v8, :cond_a

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    iget p2, p2, Lno/nordicsemi/android/ble/k0;->d:I

    if-eq p2, v11, :cond_a

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    iget p2, p2, Lno/nordicsemi/android/ble/k0;->d:I

    if-eq p2, v4, :cond_a

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    iget p2, p2, Lno/nordicsemi/android/ble/k0;->d:I

    if-ne p2, v2, :cond_b

    :cond_a
    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    const/4 v1, -0x4

    invoke-virtual {p2, p1, v1}, Lno/nordicsemi/android/ble/k0;->e(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->o1(Lno/nordicsemi/android/ble/c0;)V

    :cond_b
    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->W0(Lno/nordicsemi/android/ble/c0;)Z

    move-result p1

    if-nez p1, :cond_e

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->V0(Lno/nordicsemi/android/ble/c0;)Z

    move-result p1

    if-nez p1, :cond_e

    iget-object p1, v5, Lno/nordicsemi/android/ble/c0;->z:Landroid/bluetooth/BluetoothGatt;

    if-eqz p1, :cond_f

    invoke-static {v5, v0}, Lno/nordicsemi/android/ble/c0;->p1(Lno/nordicsemi/android/ble/c0;Z)V

    new-instance p2, Lno/nordicsemi/android/ble/u;

    invoke-direct {p2, v9}, Lno/nordicsemi/android/ble/u;-><init>(I)V

    invoke-virtual {v5, v7, p2}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    new-instance p2, Lno/nordicsemi/android/ble/u;

    invoke-direct {p2, v8}, Lno/nordicsemi/android/ble/u;-><init>(I)V

    invoke-virtual {v5, v6, p2}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    goto :goto_4

    :cond_c
    if-ne p2, v2, :cond_e

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->s1(Lno/nordicsemi/android/ble/c0;)V

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    if-eqz p2, :cond_d

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    iget p2, p2, Lno/nordicsemi/android/ble/k0;->d:I

    if-ne p2, v9, :cond_d

    new-instance p2, Lno/nordicsemi/android/ble/u;

    const/16 v2, 0x9

    invoke-direct {p2, v2}, Lno/nordicsemi/android/ble/u;-><init>(I)V

    invoke-virtual {v5, v1, p2}, Lno/nordicsemi/android/ble/c0;->U1(ILno/nordicsemi/android/ble/b0;)V

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->U0(Lno/nordicsemi/android/ble/c0;)Lno/nordicsemi/android/ble/k0;

    move-result-object p2

    invoke-virtual {p2, p1}, Lno/nordicsemi/android/ble/k0;->h(Landroid/bluetooth/BluetoothDevice;)Z

    invoke-static {v5}, Lno/nordicsemi/android/ble/c0;->o1(Lno/nordicsemi/android/ble/c0;)V

    :cond_d
    invoke-virtual {v5}, Lno/nordicsemi/android/ble/c0;->R1()Z

    move-result p1

    if-nez p1, :cond_e

    invoke-virtual {v5}, Lno/nordicsemi/android/ble/c0;->v1()V

    :cond_e
    :goto_3
    invoke-virtual {v5, v0}, Lno/nordicsemi/android/ble/c0;->V1(Z)V

    :cond_f
    :goto_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0xa
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch
.end method
