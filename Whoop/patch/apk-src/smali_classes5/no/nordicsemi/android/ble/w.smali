.class public final synthetic Lno/nordicsemi/android/ble/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lno/nordicsemi/android/ble/b0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(IIII)V
    .locals 0

    iput p4, p0, Lno/nordicsemi/android/ble/w;->a:I

    iput p1, p0, Lno/nordicsemi/android/ble/w;->b:I

    iput p2, p0, Lno/nordicsemi/android/ble/w;->c:I

    iput p3, p0, Lno/nordicsemi/android/ble/w;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 10

    iget v0, p0, Lno/nordicsemi/android/ble/w;->a:I

    const-string v1, "ms)"

    const-string v2, ", timeout: "

    const-string v3, "ms, latency: "

    const-wide/high16 v4, 0x3ff4000000000000L    # 1.25

    iget v6, p0, Lno/nordicsemi/android/ble/w;->d:I

    iget v7, p0, Lno/nordicsemi/android/ble/w;->c:I

    iget v8, p0, Lno/nordicsemi/android/ble/w;->b:I

    packed-switch v0, :pswitch_data_0

    sget v0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->b:I

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v9, "Connection parameters update failed with status: UNACCEPT CONN INTERVAL (0x3b) (interval: "

    invoke-direct {v0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    int-to-double v8, v8

    mul-double/2addr v8, v4

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    mul-int/lit8 v6, v6, 0xa

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    sget v0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->b:I

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v9, "Connection parameters updated (interval: "

    invoke-direct {v0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    int-to-double v8, v8

    mul-double/2addr v8, v4

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    mul-int/lit8 v6, v6, 0xa

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
