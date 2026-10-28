.class public final Lnp/j;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lnp/j;",
            ">;"
        }
    .end annotation
.end field

.field public static final L:Ljava/util/List;


# instance fields
.field public final E:Z

.field public final F:Z

.field public final G:Ljava/lang/String;

.field public final H:Z

.field public I:Z

.field public J:Ljava/lang/String;

.field public K:J

.field public final w:Lcom/google/android/gms/location/LocationRequest;

.field public final x:Ljava/util/List;

.field public final y:Ljava/lang/String;

.field public final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    sput-object v0, Lnp/j;->L:Ljava/util/List;

    new-instance v0, Lmn/b;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lmn/b;-><init>(I)V

    sput-object v0, Lnp/j;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/location/LocationRequest;Ljava/util/List;Ljava/lang/String;ZZZLjava/lang/String;ZZLjava/lang/String;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnp/j;->w:Lcom/google/android/gms/location/LocationRequest;

    iput-object p2, p0, Lnp/j;->x:Ljava/util/List;

    iput-object p3, p0, Lnp/j;->y:Ljava/lang/String;

    iput-boolean p4, p0, Lnp/j;->z:Z

    iput-boolean p5, p0, Lnp/j;->E:Z

    iput-boolean p6, p0, Lnp/j;->F:Z

    iput-object p7, p0, Lnp/j;->G:Ljava/lang/String;

    iput-boolean p8, p0, Lnp/j;->H:Z

    iput-boolean p9, p0, Lnp/j;->I:Z

    iput-object p10, p0, Lnp/j;->J:Ljava/lang/String;

    iput-wide p11, p0, Lnp/j;->K:J

    return-void
.end method

.method public static b(Lcom/google/android/gms/location/LocationRequest;)Lnp/j;
    .locals 13

    new-instance v0, Lnp/j;

    const/4 v10, 0x0

    const-wide v11, 0x7fffffffffffffffL

    sget-object v2, Lnp/j;->L:Ljava/util/List;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v12}, Lnp/j;-><init>(Lcom/google/android/gms/location/LocationRequest;Ljava/util/List;Ljava/lang/String;ZZZLjava/lang/String;ZZLjava/lang/String;J)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lnp/j;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lnp/j;

    iget-object v0, p0, Lnp/j;->w:Lcom/google/android/gms/location/LocationRequest;

    iget-object v2, p1, Lnp/j;->w:Lcom/google/android/gms/location/LocationRequest;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnp/j;->x:Ljava/util/List;

    iget-object v2, p1, Lnp/j;->x:Ljava/util/List;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnp/j;->y:Ljava/lang/String;

    iget-object v2, p1, Lnp/j;->y:Ljava/lang/String;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lnp/j;->z:Z

    iget-boolean v2, p1, Lnp/j;->z:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Lnp/j;->E:Z

    iget-boolean v2, p1, Lnp/j;->E:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Lnp/j;->F:Z

    iget-boolean v2, p1, Lnp/j;->F:Z

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lnp/j;->G:Ljava/lang/String;

    iget-object v2, p1, Lnp/j;->G:Ljava/lang/String;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lnp/j;->H:Z

    iget-boolean v2, p1, Lnp/j;->H:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Lnp/j;->I:Z

    iget-boolean v2, p1, Lnp/j;->I:Z

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lnp/j;->J:Ljava/lang/String;

    iget-object p1, p1, Lnp/j;->J:Ljava/lang/String;

    invoke-static {v0, p1}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final f()V
    .locals 7

    iget-object v0, p0, Lnp/j;->w:Lcom/google/android/gms/location/LocationRequest;

    iget-wide v1, v0, Lcom/google/android/gms/location/LocationRequest;->H:J

    iget-wide v3, v0, Lcom/google/android/gms/location/LocationRequest;->x:J

    cmp-long v5, v1, v3

    if-gez v5, :cond_0

    move-wide v1, v3

    :cond_0
    cmp-long v1, v1, v3

    if-gtz v1, :cond_1

    const-wide/16 v0, 0x2710

    iput-wide v0, p0, Lnp/j;->K:J

    return-void

    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    iget-wide v2, v0, Lcom/google/android/gms/location/LocationRequest;->x:J

    iget-wide v4, v0, Lcom/google/android/gms/location/LocationRequest;->H:J

    cmp-long v0, v4, v2

    if-gez v0, :cond_2

    move-wide v4, v2

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v6, 0x78

    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v6, "could not set max age when location batching is requested, interval="

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "maxWaitTime="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final h(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lnp/j;->J:Ljava/lang/String;

    return-void
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lnp/j;->w:Lcom/google/android/gms/location/LocationRequest;

    invoke-virtual {v0}, Lcom/google/android/gms/location/LocationRequest;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnp/j;->I:Z

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lnp/j;->w:Lcom/google/android/gms/location/LocationRequest;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lnp/j;->y:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v2, " tag="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, p0, Lnp/j;->G:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v2, " moduleId="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    iget-object v1, p0, Lnp/j;->J:Ljava/lang/String;

    if-eqz v1, :cond_2

    const-string v1, " contextAttributionTag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lnp/j;->J:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    const-string v1, " hideAppOps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lnp/j;->z:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " clients="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lnp/j;->x:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " forceCoarseLocation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lnp/j;->E:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lnp/j;->F:Z

    if-eqz v1, :cond_3

    const-string v1, " exemptFromBackgroundThrottle"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-boolean v1, p0, Lnp/j;->H:Z

    if-eqz v1, :cond_4

    const-string v1, " locationSettingsIgnored"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    iget-boolean v1, p0, Lnp/j;->I:Z

    if-eqz v1, :cond_5

    const-string v1, " inaccurateLocationsDelayed"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const/16 v0, 0x4f45

    invoke-static {p1, v0}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result v0

    const/4 v1, 0x1

    iget-object v2, p0, Lnp/j;->w:Lcom/google/android/gms/location/LocationRequest;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/4 p2, 0x5

    iget-object v1, p0, Lnp/j;->x:Ljava/util/List;

    invoke-static {p1, p2, v1}, Lvo/c;->q(Landroid/os/Parcel;ILjava/util/List;)V

    const/4 p2, 0x6

    iget-object v1, p0, Lnp/j;->y:Ljava/lang/String;

    invoke-static {p1, p2, v1}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 p2, 0x7

    const/4 v1, 0x4

    invoke-static {p1, p2, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget-boolean p2, p0, Lnp/j;->z:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/16 p2, 0x8

    invoke-static {p1, p2, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget-boolean v2, p0, Lnp/j;->E:Z

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    const/16 v2, 0x9

    invoke-static {p1, v2, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget-boolean v2, p0, Lnp/j;->F:Z

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    const/16 v2, 0xa

    iget-object v3, p0, Lnp/j;->G:Ljava/lang/String;

    invoke-static {p1, v2, v3}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/16 v2, 0xb

    invoke-static {p1, v2, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget-boolean v2, p0, Lnp/j;->H:Z

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v2, p0, Lnp/j;->I:Z

    const/16 v3, 0xc

    invoke-static {p1, v3, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    const/16 v1, 0xd

    iget-object v2, p0, Lnp/j;->J:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    iget-wide v1, p0, Lnp/j;->K:J

    const/16 v3, 0xe

    invoke-static {p1, v3, p2}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v1, v2}, Landroid/os/Parcel;->writeLong(J)V

    invoke-static {p1, v0}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
