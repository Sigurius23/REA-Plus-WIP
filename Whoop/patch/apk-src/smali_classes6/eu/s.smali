.class public final Leu/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks;


# instance fields
.field public final synthetic w:Lup/c;


# direct methods
.method public constructor <init>(Lup/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leu/s;->w:Lup/c;

    return-void
.end method


# virtual methods
.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onLowMemory()V
    .locals 3

    iget-object v0, p0, Leu/s;->w:Lup/c;

    iget-object v0, v0, Lup/c;->w:Lev/i;

    iget-object v0, v0, Lev/i;->a:Ljava/lang/Object;

    check-cast v0, Lq30/w0;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, v0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v0, Lvp/f;

    invoke-virtual {v0}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v1

    const/4 v2, 0x6

    invoke-virtual {v0, v1, v2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    return-void
.end method
