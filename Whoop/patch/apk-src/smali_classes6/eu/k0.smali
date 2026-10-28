.class public final Leu/k0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lwp/c;

.field public final synthetic w:Leu/v;

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:J

.field public final synthetic z:Lwp/c;


# direct methods
.method public constructor <init>(Leu/v;Ljava/util/List;JLwp/c;Lwp/c;)V
    .locals 0

    iput-object p1, p0, Leu/k0;->w:Leu/v;

    iput-object p2, p0, Leu/k0;->x:Ljava/util/List;

    iput-wide p3, p0, Leu/k0;->y:J

    iput-object p5, p0, Leu/k0;->z:Lwp/c;

    iput-object p6, p0, Leu/k0;->E:Lwp/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Leu/k0;->w:Leu/v;

    iget-object v0, v0, Leu/v;->E:Lup/b;

    if-eqz v0, :cond_3

    new-instance v1, Lwp/m;

    invoke-direct {v1}, Lwp/m;-><init>()V

    iget-object v2, p0, Leu/k0;->x:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    const-string v3, "points must not be null."

    invoke-static {v2, v3}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/maps/model/LatLng;

    iget-object v4, v1, Lwp/m;->w:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    iput-boolean v2, v1, Lwp/m;->G:Z

    iget-wide v3, p0, Leu/k0;->y:J

    invoke-static {v3, v4}, Li2/w0;->H(J)I

    move-result v3

    iput v3, v1, Lwp/m;->y:I

    iget-object v3, p0, Leu/k0;->z:Lwp/c;

    iput-object v3, v1, Lwp/m;->I:Lwp/d;

    iput-boolean v2, v1, Lwp/m;->F:Z

    iput v2, v1, Lwp/m;->J:I

    const/4 v2, 0x0

    iput-object v2, v1, Lwp/m;->K:Ljava/util/List;

    iget-object v3, p0, Leu/k0;->E:Lwp/c;

    iput-object v3, v1, Lwp/m;->H:Lwp/d;

    const/4 v3, 0x1

    iput-boolean v3, v1, Lwp/m;->E:Z

    const/high16 v3, 0x41200000    # 10.0f

    iput v3, v1, Lwp/m;->x:F

    const/4 v3, 0x0

    iput v3, v1, Lwp/m;->z:F

    :try_start_0
    new-instance v3, Lwp/l;

    iget-object v0, v0, Lup/b;->a:Lvp/e;

    invoke-virtual {v0}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v4

    invoke-static {v4, v1}, Lop/h;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 v1, 0x9

    invoke-virtual {v0, v4, v1}, Lip/a;->j0(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    sget v4, Lop/f;->g:I

    const-string v4, "com.google.android.gms.maps.model.internal.IPolylineDelegate"

    if-nez v1, :cond_1

    move-object v5, v2

    goto :goto_1

    :cond_1
    invoke-interface {v1, v4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v5

    instance-of v6, v5, Lop/g;

    if-eqz v6, :cond_2

    check-cast v5, Lop/g;

    goto :goto_1

    :cond_2
    new-instance v5, Lop/e;

    const/4 v6, 0x3

    invoke-direct {v5, v1, v4, v6}, Lip/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    :goto_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    invoke-direct {v3, v5}, Lwp/l;-><init>(Lop/g;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v3, v2}, Lwp/l;->a(Ljava/lang/Object;)V

    new-instance v0, Leu/n0;

    invoke-direct {v0, v3}, Leu/n0;-><init>(Lwp/l;)V

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Error adding Polyline"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
