.class public final Leu/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leu/x;


# instance fields
.field public final a:Lp1/o;

.field public final b:Lwp/h;

.field public final c:Leu/j0;

.field public d:Lkotlin/jvm/functions/Function1;

.field public e:Lkotlin/jvm/functions/Function1;

.field public f:Lkotlin/jvm/functions/Function1;

.field public g:Lkotlin/jvm/functions/Function1;

.field public h:Lkotlin/jvm/functions/Function3;

.field public i:Lkotlin/jvm/functions/Function3;


# direct methods
.method public constructor <init>(Lp1/o;Lwp/h;Leu/j0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "markerState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onMarkerClick"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onInfoWindowClick"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onInfoWindowClose"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onInfoWindowLongClick"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leu/i0;->a:Lp1/o;

    iput-object p2, p0, Leu/i0;->b:Lwp/h;

    iput-object p3, p0, Leu/i0;->c:Leu/j0;

    iput-object p4, p0, Leu/i0;->d:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Leu/i0;->e:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Leu/i0;->f:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Leu/i0;->g:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x0

    iput-object p1, p0, Leu/i0;->h:Lkotlin/jvm/functions/Function3;

    iput-object p1, p0, Leu/i0;->i:Lkotlin/jvm/functions/Function3;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Leu/i0;->c:Leu/j0;

    iget-object v1, p0, Leu/i0;->b:Lwp/h;

    invoke-virtual {v0, v1}, Leu/j0;->a(Lwp/h;)V

    return-void
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Leu/i0;->c:Leu/j0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Leu/j0;->a(Lwp/h;)V

    iget-object v0, p0, Leu/i0;->b:Lwp/h;

    :try_start_0
    iget-object v0, v0, Lwp/h;->a:Lop/c;

    check-cast v0, Lop/a;

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

.method public final c()V
    .locals 3

    iget-object v0, p0, Leu/i0;->c:Leu/j0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Leu/j0;->a(Lwp/h;)V

    iget-object v0, p0, Leu/i0;->b:Lwp/h;

    :try_start_0
    iget-object v0, v0, Lwp/h;->a:Lop/c;

    check-cast v0, Lop/a;

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
