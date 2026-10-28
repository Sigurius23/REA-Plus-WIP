.class public final Lc92/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0011\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u0018R\u0011\u0010\u001f\u001a\u00020\u00088G\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u0018\u00a8\u0006 "
    }
    d2 = {
        "Lc92/a;",
        "",
        "Landroid/bluetooth/BluetoothAdapter;",
        "bluetoothAdapter",
        "<init>",
        "(Landroid/bluetooth/BluetoothAdapter;)V",
        "Landroid/bluetooth/BluetoothDevice;",
        "bluetoothDevice",
        "",
        "h",
        "(Landroid/bluetooth/BluetoothDevice;)Z",
        "device",
        "",
        "a",
        "(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;",
        "",
        "state",
        "c",
        "(I)Ljava/lang/String;",
        "Landroid/bluetooth/BluetoothAdapter;",
        "b",
        "()Landroid/bluetooth/BluetoothAdapter;",
        "Z",
        "e",
        "()Z",
        "isBluetoothSupported",
        "d",
        "isBluetoothEnabled",
        "f",
        "isBluetoothSupportedAndEnabled",
        "g",
        "isLe2mSupported",
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


# instance fields
.field private final a:Landroid/bluetooth/BluetoothAdapter;

.field private final b:Z


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothAdapter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc92/a;->a:Landroid/bluetooth/BluetoothAdapter;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lc92/a;->b:Z

    return-void
.end method


# virtual methods
.method public final a(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;
    .locals 3

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    const-string v1, "("

    const-string v2, ")"

    invoke-static {v0, v1, p1, v2}, Ldc/b;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final b()Landroid/bluetooth/BluetoothAdapter;
    .locals 1

    iget-object v0, p0, Lc92/a;->a:Landroid/bluetooth/BluetoothAdapter;

    return-object v0
.end method

.method public final c(I)Ljava/lang/String;
    .locals 0

    packed-switch p1, :pswitch_data_0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_0
    const-string p1, "Turning Off"

    return-object p1

    :pswitch_1
    const-string p1, "On"

    return-object p1

    :pswitch_2
    const-string p1, "Turning On"

    return-object p1

    :pswitch_3
    const-string p1, "Off"

    return-object p1

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Z
    .locals 2

    iget-object v0, p0, Lc92/a;->a:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "bluetooth is not supported on this device"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lc92/a;->b:Z

    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lc92/a;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lc92/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final g()Z
    .locals 2

    iget-object v0, p0, Lc92/a;->a:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isLe2MPhySupported()Z

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "bluetooth is not supported on this device"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final h(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 5

    const-string v0, "Failed to remove bond from "

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v3, "removeBond"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type kotlin.Boolean"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception v2

    goto :goto_0

    :catch_1
    move-exception v2

    goto :goto_1

    :catch_2
    move-exception v2

    goto :goto_2

    :catch_3
    move-exception v2

    goto :goto_3

    :goto_0
    invoke-static {}, Lc92/b;->a()Ltr2/n;

    move-result-object v3

    invoke-static {p1}, Ltt0/a;->a(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v1, [Lqr2/a$a;

    invoke-interface {v3, p1, v2, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_4

    :goto_1
    invoke-static {}, Lc92/b;->a()Ltr2/n;

    move-result-object v3

    invoke-static {p1}, Ltt0/a;->a(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v1, [Lqr2/a$a;

    invoke-interface {v3, p1, v2, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_4

    :goto_2
    invoke-static {}, Lc92/b;->a()Ltr2/n;

    move-result-object v3

    invoke-static {p1}, Ltt0/a;->a(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v1, [Lqr2/a$a;

    invoke-interface {v3, p1, v2, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_4

    :goto_3
    invoke-static {}, Lc92/b;->a()Ltr2/n;

    move-result-object v3

    invoke-static {p1}, Ltt0/a;->a(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v1, [Lqr2/a$a;

    invoke-interface {v3, p1, v2, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_0
    :goto_4
    return v1
.end method
