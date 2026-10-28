.class public final synthetic Lno/nordicsemi/android/ble/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lno/nordicsemi/android/ble/b0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lno/nordicsemi/android/ble/z;->a:I

    iput p2, p0, Lno/nordicsemi/android/ble/z;->b:I

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 5

    sget v0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->b:I

    const-string v0, " and new state: "

    const-string v1, " ("

    iget v2, p0, Lno/nordicsemi/android/ble/z;->a:I

    iget v3, p0, Lno/nordicsemi/android/ble/z;->b:I

    const-string v4, "[Callback] Connection state changed with status: "

    invoke-static {v2, v3, v4, v0, v1}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lrd3/a;->a:[C

    const-string v1, ")"

    if-eqz v3, :cond_3

    const/4 v2, 0x1

    if-eq v3, v2, :cond_2

    const/4 v2, 0x2

    if-eq v3, v2, :cond_1

    const/4 v2, 0x3

    if-eq v3, v2, :cond_0

    const-string v2, "UNKNOWN ("

    invoke-static {v3, v2, v1}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const-string v2, "DISCONNECTING"

    goto :goto_0

    :cond_1
    const-string v2, "CONNECTED"

    goto :goto_0

    :cond_2
    const-string v2, "CONNECTING"

    goto :goto_0

    :cond_3
    const-string v2, "DISCONNECTED"

    :goto_0
    invoke-static {v2, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
