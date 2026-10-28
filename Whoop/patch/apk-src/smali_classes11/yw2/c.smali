.class public abstract Lyw2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u001c\u0010\u0006\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0082\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "value",
        "",
        "b",
        "(Ljava/lang/String;)Z",
        "newName",
        "d",
        "(Ljava/lang/String;Ljava/lang/String;)Z",
        "Landroid/bluetooth/BluetoothDevice;",
        "c",
        "(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;",
        "whooplabs_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, Lyw2/c;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static final b(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "BT device"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method public static final c(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p0

    const-string v0, "BT device "

    invoke-static {v0, p0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method

.method private static final d(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lyw2/c;->b(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {p1}, Lyw2/c;->b(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
