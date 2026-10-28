.class public final Lcom/google/android/gms/location/LocationRequest;
.super Lvo/a;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/location/LocationRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public E:J

.field public F:I

.field public G:F

.field public H:J

.field public I:Z

.field public w:I

.field public x:J

.field public y:J

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ltp/a0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ltp/a0;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/location/LocationRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x66

    iput v0, p0, Lcom/google/android/gms/location/LocationRequest;->w:I

    const-wide/32 v0, 0x36ee80

    iput-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->x:J

    const-wide/32 v0, 0x927c0

    iput-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->y:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/location/LocationRequest;->z:Z

    const-wide v1, 0x7fffffffffffffffL

    iput-wide v1, p0, Lcom/google/android/gms/location/LocationRequest;->E:J

    const v1, 0x7fffffff

    iput v1, p0, Lcom/google/android/gms/location/LocationRequest;->F:I

    const/4 v1, 0x0

    iput v1, p0, Lcom/google/android/gms/location/LocationRequest;->G:F

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/google/android/gms/location/LocationRequest;->H:J

    iput-boolean v0, p0, Lcom/google/android/gms/location/LocationRequest;->I:Z

    return-void
.end method

.method public static b()Lcom/google/android/gms/location/LocationRequest;
    .locals 2

    new-instance v0, Lcom/google/android/gms/location/LocationRequest;

    invoke-direct {v0}, Lcom/google/android/gms/location/LocationRequest;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/google/android/gms/location/LocationRequest;->I:Z

    return-object v0
.end method

.method public static x(J)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-ltz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x26

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "invalid interval: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 8

    instance-of v0, p1, Lcom/google/android/gms/location/LocationRequest;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/google/android/gms/location/LocationRequest;

    iget v0, p0, Lcom/google/android/gms/location/LocationRequest;->w:I

    iget v1, p1, Lcom/google/android/gms/location/LocationRequest;->w:I

    if-ne v0, v1, :cond_2

    iget-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->x:J

    iget-wide v2, p1, Lcom/google/android/gms/location/LocationRequest;->x:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_2

    iget-wide v4, p0, Lcom/google/android/gms/location/LocationRequest;->y:J

    iget-wide v6, p1, Lcom/google/android/gms/location/LocationRequest;->y:J

    cmp-long v4, v4, v6

    if-nez v4, :cond_2

    iget-boolean v4, p0, Lcom/google/android/gms/location/LocationRequest;->z:Z

    iget-boolean v5, p1, Lcom/google/android/gms/location/LocationRequest;->z:Z

    if-ne v4, v5, :cond_2

    iget-wide v4, p0, Lcom/google/android/gms/location/LocationRequest;->E:J

    iget-wide v6, p1, Lcom/google/android/gms/location/LocationRequest;->E:J

    cmp-long v4, v4, v6

    if-nez v4, :cond_2

    iget v4, p0, Lcom/google/android/gms/location/LocationRequest;->F:I

    iget v5, p1, Lcom/google/android/gms/location/LocationRequest;->F:I

    if-ne v4, v5, :cond_2

    iget v4, p0, Lcom/google/android/gms/location/LocationRequest;->G:F

    iget v5, p1, Lcom/google/android/gms/location/LocationRequest;->G:F

    cmpl-float v4, v4, v5

    if-nez v4, :cond_2

    iget-wide v4, p0, Lcom/google/android/gms/location/LocationRequest;->H:J

    cmp-long v6, v4, v0

    if-gez v6, :cond_0

    goto :goto_0

    :cond_0
    move-wide v0, v4

    :goto_0
    iget-wide v4, p1, Lcom/google/android/gms/location/LocationRequest;->H:J

    cmp-long v6, v4, v2

    if-gez v6, :cond_1

    goto :goto_1

    :cond_1
    move-wide v2, v4

    :goto_1
    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/google/android/gms/location/LocationRequest;->I:Z

    iget-boolean p1, p1, Lcom/google/android/gms/location/LocationRequest;->I:Z

    if-ne v0, p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final f()V
    .locals 8

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    sub-long v4, v2, v0

    const-wide/16 v6, 0x7530

    cmp-long v4, v6, v4

    if-lez v4, :cond_0

    :goto_0
    iput-wide v2, p0, Lcom/google/android/gms/location/LocationRequest;->E:J

    goto :goto_1

    :cond_0
    add-long v2, v6, v0

    goto :goto_0

    :goto_1
    const-wide/16 v0, 0x0

    cmp-long v2, v2, v0

    if-gez v2, :cond_1

    iput-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->E:J

    :cond_1
    return-void
.end method

.method public final h(J)V
    .locals 1

    invoke-static {p1, p2}, Lcom/google/android/gms/location/LocationRequest;->x(J)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/location/LocationRequest;->z:Z

    iput-wide p1, p0, Lcom/google/android/gms/location/LocationRequest;->y:J

    return-void
.end method

.method public final hashCode()I
    .locals 5

    iget v0, p0, Lcom/google/android/gms/location/LocationRequest;->w:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-wide v1, p0, Lcom/google/android/gms/location/LocationRequest;->x:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/location/LocationRequest;->G:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    iget-wide v3, p0, Lcom/google/android/gms/location/LocationRequest;->H:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final i(J)V
    .locals 2

    invoke-static {p1, p2}, Lcom/google/android/gms/location/LocationRequest;->x(J)V

    iput-wide p1, p0, Lcom/google/android/gms/location/LocationRequest;->x:J

    iget-boolean v0, p0, Lcom/google/android/gms/location/LocationRequest;->z:Z

    if-nez v0, :cond_0

    long-to-double p1, p1

    const-wide/high16 v0, 0x4018000000000000L    # 6.0

    div-double/2addr p1, v0

    double-to-long p1, p1

    iput-wide p1, p0, Lcom/google/android/gms/location/LocationRequest;->y:J

    :cond_0
    return-void
.end method

.method public final k(I)V
    .locals 3

    const/16 v0, 0x64

    if-eq p1, v0, :cond_1

    const/16 v0, 0x66

    if-eq p1, v0, :cond_1

    const/16 v0, 0x68

    if-eq p1, v0, :cond_1

    const/16 v0, 0x69

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/16 v1, 0x1c

    const-string v2, "invalid quality: "

    invoke-static {v1, p1, v2}, Lr80/c;->j(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iput p1, p0, Lcom/google/android/gms/location/LocationRequest;->w:I

    return-void
.end method

.method public final s(F)V
    .locals 3

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_0

    iput p1, p0, Lcom/google/android/gms/location/LocationRequest;->G:F

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x25

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "invalid displacement: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    iget v0, p0, Lcom/google/android/gms/location/LocationRequest;->F:I

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Request["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/google/android/gms/location/LocationRequest;->w:I

    const/16 v3, 0x64

    const/16 v4, 0x69

    if-eq v2, v3, :cond_3

    const/16 v3, 0x66

    if-eq v2, v3, :cond_2

    const/16 v3, 0x68

    if-eq v2, v3, :cond_1

    if-eq v2, v4, :cond_0

    const-string v2, "???"

    goto :goto_0

    :cond_0
    const-string v2, "PRIORITY_NO_POWER"

    goto :goto_0

    :cond_1
    const-string v2, "PRIORITY_LOW_POWER"

    goto :goto_0

    :cond_2
    const-string v2, "PRIORITY_BALANCED_POWER_ACCURACY"

    goto :goto_0

    :cond_3
    const-string v2, "PRIORITY_HIGH_ACCURACY"

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/google/android/gms/location/LocationRequest;->w:I

    const-string v3, "ms"

    if-eq v2, v4, :cond_4

    const-string v2, " requested="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, p0, Lcom/google/android/gms/location/LocationRequest;->x:J

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    const-string v2, " fastest="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, p0, Lcom/google/android/gms/location/LocationRequest;->y:J

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, p0, Lcom/google/android/gms/location/LocationRequest;->H:J

    iget-wide v6, p0, Lcom/google/android/gms/location/LocationRequest;->x:J

    cmp-long v2, v4, v6

    if-lez v2, :cond_5

    const-string v2, " maxWait="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, p0, Lcom/google/android/gms/location/LocationRequest;->H:J

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    iget v2, p0, Lcom/google/android/gms/location/LocationRequest;->G:F

    const/4 v4, 0x0

    cmpl-float v2, v2, v4

    if-lez v2, :cond_6

    const-string v2, " smallestDisplacement="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/google/android/gms/location/LocationRequest;->G:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, "m"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    iget-wide v4, p0, Lcom/google/android/gms/location/LocationRequest;->E:J

    const-wide v6, 0x7fffffffffffffffL

    cmp-long v2, v4, v6

    if-eqz v2, :cond_7

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    const-string v2, " expireIn="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sub-long/2addr v4, v6

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    const v2, 0x7fffffff

    if-eq v0, v2, :cond_8

    const-string v2, " num="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_8
    const/16 v0, 0x5d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    const/16 p2, 0x4f45

    invoke-static {p1, p2}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result p2

    iget v0, p0, Lcom/google/android/gms/location/LocationRequest;->w:I

    const/4 v1, 0x1

    const/4 v2, 0x4

    invoke-static {p1, v1, v2}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->x:J

    const/4 v3, 0x2

    const/16 v4, 0x8

    invoke-static {p1, v3, v4}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->y:J

    const/4 v3, 0x3

    invoke-static {p1, v3, v4}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-boolean v0, p0, Lcom/google/android/gms/location/LocationRequest;->z:Z

    invoke-static {p1, v2, v2}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->E:J

    const/4 v3, 0x5

    invoke-static {p1, v3, v4}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget v0, p0, Lcom/google/android/gms/location/LocationRequest;->F:I

    const/4 v1, 0x6

    invoke-static {p1, v1, v2}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/google/android/gms/location/LocationRequest;->G:F

    const/4 v1, 0x7

    invoke-static {p1, v1, v2}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->H:J

    invoke-static {p1, v4, v4}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-boolean v0, p0, Lcom/google/android/gms/location/LocationRequest;->I:Z

    const/16 v1, 0x9

    invoke-static {p1, v1, v2}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {p1, p2}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
