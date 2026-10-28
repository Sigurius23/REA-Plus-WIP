.class public final synthetic Lno/nordicsemi/android/ble/x;
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

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lno/nordicsemi/android/ble/x;->a:I

    iput p2, p0, Lno/nordicsemi/android/ble/x;->b:I

    iput p3, p0, Lno/nordicsemi/android/ble/x;->c:I

    iput p4, p0, Lno/nordicsemi/android/ble/x;->d:I

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 5

    sget v0, Lno/nordicsemi/android/ble/BleManagerHandler$4;->b:I

    const-string v0, "Connection parameters update failed with status "

    const-string v1, " (interval: "

    iget v2, p0, Lno/nordicsemi/android/ble/x;->a:I

    invoke-static {v2, v0, v1}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lno/nordicsemi/android/ble/x;->b:I

    int-to-double v1, v1

    const-wide/high16 v3, 0x3ff4000000000000L    # 1.25

    mul-double/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, "ms, latency: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lno/nordicsemi/android/ble/x;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", timeout: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lno/nordicsemi/android/ble/x;->d:I

    mul-int/lit8 v1, v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "ms)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
