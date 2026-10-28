.class public final synthetic Lno/nordicsemi/android/ble/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:Lno/nordicsemi/android/ble/k0;


# direct methods
.method public synthetic constructor <init>(Lno/nordicsemi/android/ble/k0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/nordicsemi/android/ble/j0;->w:Lno/nordicsemi/android/ble/k0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lno/nordicsemi/android/ble/j0;->w:Lno/nordicsemi/android/ble/k0;

    iget-object v0, v0, Lno/nordicsemi/android/ble/k0;->i:Lmd3/d;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {v0}, Lmd3/d;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    const-string v1, "k0"

    const-string v2, "Exception in Invalid Request callback"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    return-void
.end method
