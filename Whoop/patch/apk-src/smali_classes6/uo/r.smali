.class public abstract Luo/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# direct methods
.method public static b(Landroid/app/Activity;Landroid/content/Intent;I)Luo/p;
    .locals 2

    new-instance v0, Luo/p;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, p2, v1}, Luo/p;-><init>(Landroid/content/Intent;Ljava/lang/Object;II)V

    return-object v0
.end method

.method public static c(Landroidx/fragment/app/m0;Landroid/content/Intent;I)Luo/p;
    .locals 2

    new-instance v0, Luo/p;

    const/4 v1, 0x1

    invoke-direct {v0, p1, p0, p2, v1}, Luo/p;-><init>(Landroid/content/Intent;Ljava/lang/Object;II)V

    return-object v0
.end method

.method public static d(Landroid/content/Intent;Lto/i;)Luo/q;
    .locals 1

    new-instance v0, Luo/q;

    invoke-direct {v0, p0, p1}, Luo/q;-><init>(Landroid/content/Intent;Lto/i;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()V
.end method

.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Luo/r;->a()V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :catch_0
    move-exception p2

    :try_start_1
    const-string v0, "Failed to start resolution intent."

    const-string v1, "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store."

    sget-object v2, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    const-string v3, "generic"

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v3, 0x1

    if-ne v3, v2, :cond_0

    move-object v0, v1

    :cond_0
    const-string v1, "DialogRedirect"

    invoke-static {v1, v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void

    :goto_1
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    throw p2
.end method
