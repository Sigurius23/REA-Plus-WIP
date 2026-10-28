.class public final Leu/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leu/x;


# instance fields
.field public final a:Lwp/l;

.field public b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lwp/l;)V
    .locals 1

    sget-object v0, Leu/c;->P:Leu/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leu/n0;->a:Lwp/l;

    iput-object v0, p0, Leu/n0;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final b()V
    .locals 0

    return-void
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Leu/n0;->a:Lwp/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v0, v0, Lwp/l;->a:Lop/g;

    check-cast v0, Lop/e;

    invoke-virtual {v0}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
