.class public final Leu/g0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:F

.field public final synthetic I:J

.field public final synthetic J:Lwp/b;

.field public final synthetic K:J

.field public final synthetic L:Ljava/lang/String;

.field public final synthetic M:Z

.field public final synthetic w:Leu/v;

.field public final synthetic x:Lp1/o;

.field public final synthetic y:Leu/j0;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Leu/v;Lp1/o;Leu/j0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FJLwp/b;JLjava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, Leu/g0;->w:Leu/v;

    iput-object p2, p0, Leu/g0;->x:Lp1/o;

    iput-object p3, p0, Leu/g0;->y:Leu/j0;

    iput-object p4, p0, Leu/g0;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Leu/g0;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Leu/g0;->F:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Leu/g0;->G:Lkotlin/jvm/functions/Function1;

    iput p8, p0, Leu/g0;->H:F

    iput-wide p9, p0, Leu/g0;->I:J

    iput-object p11, p0, Leu/g0;->J:Lwp/b;

    iput-wide p12, p0, Leu/g0;->K:J

    iput-object p14, p0, Leu/g0;->L:Ljava/lang/String;

    iput-boolean p15, p0, Leu/g0;->M:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Leu/g0;->w:Leu/v;

    if-eqz v0, :cond_3

    iget-object v0, v0, Leu/v;->E:Lup/b;

    if-eqz v0, :cond_3

    new-instance v1, Lwp/i;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/high16 v2, 0x3f000000    # 0.5f

    iput v2, v1, Lwp/i;->E:F

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, v1, Lwp/i;->F:F

    const/4 v3, 0x1

    iput-boolean v3, v1, Lwp/i;->H:Z

    const/4 v4, 0x0

    iput-boolean v4, v1, Lwp/i;->I:Z

    const/4 v5, 0x0

    iput v5, v1, Lwp/i;->J:F

    iput v2, v1, Lwp/i;->K:F

    iput v5, v1, Lwp/i;->L:F

    iput v4, v1, Lwp/i;->O:I

    iget v2, p0, Leu/g0;->H:F

    iput v2, v1, Lwp/i;->M:F

    iget-wide v6, p0, Leu/g0;->I:J

    invoke-static {v6, v7}, Lh2/b;->e(J)F

    move-result v2

    invoke-static {v6, v7}, Lh2/b;->f(J)F

    move-result v6

    iput v2, v1, Lwp/i;->E:F

    iput v6, v1, Lwp/i;->F:F

    iput-boolean v4, v1, Lwp/i;->G:Z

    iput-boolean v4, v1, Lwp/i;->I:Z

    iget-object v2, p0, Leu/g0;->J:Lwp/b;

    iput-object v2, v1, Lwp/i;->z:Lwp/b;

    iget-wide v6, p0, Leu/g0;->K:J

    invoke-static {v6, v7}, Lh2/b;->e(J)F

    move-result v2

    invoke-static {v6, v7}, Lh2/b;->f(J)F

    move-result v4

    iput v2, v1, Lwp/i;->K:F

    iput v4, v1, Lwp/i;->L:F

    iget-object v2, p0, Leu/g0;->y:Leu/j0;

    iget-object v2, v2, Leu/j0;->a:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v2, :cond_2

    iput-object v2, v1, Lwp/i;->w:Lcom/google/android/gms/maps/model/LatLng;

    iput v5, v1, Lwp/i;->J:F

    const/4 v2, 0x0

    iput-object v2, v1, Lwp/i;->y:Ljava/lang/String;

    iget-object v4, p0, Leu/g0;->L:Ljava/lang/String;

    iput-object v4, v1, Lwp/i;->x:Ljava/lang/String;

    iget-boolean v4, p0, Leu/g0;->M:Z

    iput-boolean v4, v1, Lwp/i;->H:Z

    iput v5, v1, Lwp/i;->N:F

    :try_start_0
    iget-object v0, v0, Lup/b;->a:Lvp/e;

    invoke-virtual {v0}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v4

    invoke-static {v4, v1}, Lop/h;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 v5, 0xb

    invoke-virtual {v0, v4, v5}, Lip/a;->j0(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v4

    invoke-static {v4}, Lop/b;->n0(Landroid/os/IBinder;)Lop/c;

    move-result-object v4

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    if-eqz v4, :cond_1

    iget v0, v1, Lwp/i;->Q:I

    if-ne v0, v3, :cond_0

    new-instance v0, Lwp/a;

    invoke-direct {v0, v4}, Lwp/h;-><init>(Lop/c;)V

    :goto_0
    move-object v3, v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_0
    new-instance v0, Lwp/h;

    invoke-direct {v0, v4}, Lwp/h;-><init>(Lop/c;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_1
    move-object v3, v2

    :goto_1
    if-eqz v3, :cond_3

    invoke-virtual {v3, v2}, Lwp/h;->c(Ljava/lang/Object;)V

    new-instance v1, Leu/i0;

    iget-object v7, p0, Leu/g0;->F:Lkotlin/jvm/functions/Function1;

    iget-object v8, p0, Leu/g0;->G:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Leu/g0;->x:Lp1/o;

    iget-object v4, p0, Leu/g0;->y:Leu/j0;

    iget-object v5, p0, Leu/g0;->z:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Leu/g0;->E:Lkotlin/jvm/functions/Function1;

    invoke-direct/range {v1 .. v8}, Leu/i0;-><init>(Lp1/o;Lwp/h;Leu/j0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-object v1

    :goto_2
    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "latlng cannot be null - a position is required."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Error adding marker"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
