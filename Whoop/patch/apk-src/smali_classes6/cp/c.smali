.class public final Lcp/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcp/f;


# instance fields
.field public final synthetic a:Landroid/os/Bundle;

.field public final synthetic b:Lev/i;


# direct methods
.method public constructor <init>(Lev/i;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcp/c;->a:Landroid/os/Bundle;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcp/c;->b:Lev/i;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final b()V
    .locals 7

    iget-object v0, p0, Lcp/c;->b:Lev/i;

    iget-object v0, v0, Lev/i;->a:Ljava/lang/Object;

    check-cast v0, Lq30/w0;

    iget-object v1, p0, Lcp/c;->a:Landroid/os/Bundle;

    iget-object v2, v0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v2, Landroid/view/ViewGroup;

    iget-object v3, v0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v3, Lvp/f;

    :try_start_0
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    invoke-static {v1, v4}, Lvp/c;->t0(Landroid/os/Bundle;Landroid/os/Bundle;)V

    invoke-virtual {v3}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v5

    invoke-static {v5, v4}, Lop/h;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 v6, 0x2

    invoke-virtual {v3, v5, v6}, Lip/a;->l0(Landroid/os/Parcel;I)V

    invoke-static {v4, v1}, Lvp/c;->t0(Landroid/os/Bundle;Landroid/os/Bundle;)V

    invoke-virtual {v3}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v1

    const/16 v4, 0x8

    invoke-virtual {v3, v1, v4}, Lip/a;->j0(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v3

    invoke-static {v3}, Lcp/b;->X(Landroid/os/IBinder;)Lcp/a;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    invoke-static {v3}, Lcp/b;->c0(Lcp/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    iput-object v1, v0, Lq30/w0;->z:Ljava/lang/Object;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v0, v0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
