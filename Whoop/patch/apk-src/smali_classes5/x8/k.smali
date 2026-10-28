.class public abstract Lx8/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Lx8/m;)V
    .locals 2

    :try_start_0
    const-string v0, "phone"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/telephony/TelephonyManager;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lx8/j;

    invoke-direct {v0, p1}, Lx8/j;-><init>(Lx8/m;)V

    iget-object v1, p1, Lx8/m;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v1, v0}, Landroid/telephony/TelephonyManager;->registerTelephonyCallback(Ljava/util/concurrent/Executor;Landroid/telephony/TelephonyCallback;)V

    invoke-virtual {p0, v0}, Landroid/telephony/TelephonyManager;->unregisterTelephonyCallback(Landroid/telephony/TelephonyCallback;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p0, 0x5

    invoke-virtual {p1, p0}, Lx8/m;->c(I)V

    return-void
.end method
