.class public final Ly00/m6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvy/b;
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ly00/m6;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Ljava/lang/String;

.field public final F:Ljava/lang/Boolean;

.field public final G:Ly00/l6;

.field public final H:Lcom/stripe/android/model/Source$Status;

.field public final I:Ljava/util/Map;

.field public final J:Ly00/y6;

.field public final K:Ljava/lang/String;

.field public final L:Ljava/lang/String;

.field public final M:Lcom/stripe/android/model/Source$Usage;

.field public final N:Ly00/q6;

.field public final O:Ljava/lang/String;

.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/Long;

.field public final y:Ljava/lang/String;

.field public final z:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly00/r5;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Ly00/r5;-><init>(I)V

    sput-object v0, Ly00/m6;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ly00/l6;Lcom/stripe/android/model/Source$Status;Ljava/util/Map;Ly00/y6;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Source$Usage;Ly00/q6;Ljava/lang/String;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeRaw"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly00/m6;->w:Ljava/lang/String;

    iput-object p2, p0, Ly00/m6;->x:Ljava/lang/Long;

    iput-object p3, p0, Ly00/m6;->y:Ljava/lang/String;

    iput-object p4, p0, Ly00/m6;->z:Ljava/lang/Long;

    iput-object p5, p0, Ly00/m6;->E:Ljava/lang/String;

    iput-object p6, p0, Ly00/m6;->F:Ljava/lang/Boolean;

    iput-object p7, p0, Ly00/m6;->G:Ly00/l6;

    iput-object p8, p0, Ly00/m6;->H:Lcom/stripe/android/model/Source$Status;

    iput-object p9, p0, Ly00/m6;->I:Ljava/util/Map;

    iput-object p10, p0, Ly00/m6;->J:Ly00/y6;

    iput-object p11, p0, Ly00/m6;->K:Ljava/lang/String;

    iput-object p12, p0, Ly00/m6;->L:Ljava/lang/String;

    iput-object p13, p0, Ly00/m6;->M:Lcom/stripe/android/model/Source$Usage;

    iput-object p14, p0, Ly00/m6;->N:Ly00/q6;

    move-object/from16 p1, p15

    iput-object p1, p0, Ly00/m6;->O:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ly00/m6;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly00/m6;

    iget-object v1, p0, Ly00/m6;->w:Ljava/lang/String;

    iget-object v3, p1, Ly00/m6;->w:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ly00/m6;->x:Ljava/lang/Long;

    iget-object v3, p1, Ly00/m6;->x:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ly00/m6;->y:Ljava/lang/String;

    iget-object v3, p1, Ly00/m6;->y:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ly00/m6;->z:Ljava/lang/Long;

    iget-object v3, p1, Ly00/m6;->z:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ly00/m6;->E:Ljava/lang/String;

    iget-object v3, p1, Ly00/m6;->E:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Ly00/m6;->F:Ljava/lang/Boolean;

    iget-object v3, p1, Ly00/m6;->F:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Ly00/m6;->G:Ly00/l6;

    iget-object v3, p1, Ly00/m6;->G:Ly00/l6;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Ly00/m6;->H:Lcom/stripe/android/model/Source$Status;

    iget-object v3, p1, Ly00/m6;->H:Lcom/stripe/android/model/Source$Status;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Ly00/m6;->I:Ljava/util/Map;

    iget-object v3, p1, Ly00/m6;->I:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Ly00/m6;->J:Ly00/y6;

    iget-object v3, p1, Ly00/m6;->J:Ly00/y6;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Ly00/m6;->K:Ljava/lang/String;

    iget-object v3, p1, Ly00/m6;->K:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Ly00/m6;->L:Ljava/lang/String;

    iget-object v3, p1, Ly00/m6;->L:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Ly00/m6;->M:Lcom/stripe/android/model/Source$Usage;

    iget-object v3, p1, Ly00/m6;->M:Lcom/stripe/android/model/Source$Usage;

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Ly00/m6;->N:Ly00/q6;

    iget-object v3, p1, Ly00/m6;->N:Ly00/q6;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Ly00/m6;->O:Ljava/lang/String;

    iget-object p1, p1, Ly00/m6;->O:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    return v2

    :cond_10
    return v0
.end method

.method public final hashCode()I
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Ly00/m6;->w:Ljava/lang/String;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/m6;->x:Ljava/lang/Long;

    if-nez v3, :cond_1

    move v3, v0

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/m6;->y:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v0

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/m6;->z:Ljava/lang/Long;

    if-nez v3, :cond_3

    move v3, v0

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/m6;->E:Ljava/lang/String;

    if-nez v3, :cond_4

    move v3, v0

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/m6;->F:Ljava/lang/Boolean;

    if-nez v3, :cond_5

    move v3, v0

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/m6;->G:Ly00/l6;

    if-nez v3, :cond_6

    move v3, v0

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ly00/l6;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/m6;->H:Lcom/stripe/android/model/Source$Status;

    if-nez v3, :cond_7

    move v3, v0

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/m6;->I:Ljava/util/Map;

    if-nez v3, :cond_8

    move v3, v0

    goto :goto_8

    :cond_8
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/m6;->J:Ly00/y6;

    if-nez v3, :cond_9

    move v3, v0

    goto :goto_9

    :cond_9
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_9
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/m6;->K:Ljava/lang/String;

    invoke-static {v1, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v1

    iget-object v3, p0, Ly00/m6;->L:Ljava/lang/String;

    invoke-static {v1, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v1

    iget-object v3, p0, Ly00/m6;->M:Lcom/stripe/android/model/Source$Usage;

    if-nez v3, :cond_a

    move v3, v0

    goto :goto_a

    :cond_a
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_a
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/m6;->N:Ly00/q6;

    if-nez v3, :cond_b

    move v3, v0

    goto :goto_b

    :cond_b
    invoke-virtual {v3}, Ly00/q6;->hashCode()I

    move-result v3

    :goto_b
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v2, p0, Ly00/m6;->O:Ljava/lang/String;

    if-nez v2, :cond_c

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_c
    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Source(id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ly00/m6;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", amount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/m6;->x:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", clientSecret="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/m6;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", created="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/m6;->z:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", currency="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isLiveMode="

    const-string v2, ", owner="

    iget-object v3, p0, Ly00/m6;->F:Ljava/lang/Boolean;

    iget-object v4, p0, Ly00/m6;->E:Ljava/lang/String;

    invoke-static {v3, v4, v1, v2, v0}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v1, p0, Ly00/m6;->G:Ly00/l6;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/m6;->H:Lcom/stripe/android/model/Source$Status;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sourceTypeData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/m6;->I:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sourceTypeModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/m6;->J:Ly00/y6;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", typeRaw="

    const-string v2, ", usage="

    iget-object v3, p0, Ly00/m6;->K:Ljava/lang/String;

    iget-object v4, p0, Ly00/m6;->L:Ljava/lang/String;

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ly00/m6;->M:Lcom/stripe/android/model/Source$Usage;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sourceOrder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/m6;->N:Ly00/q6;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", statementDescriptor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    iget-object v2, p0, Ly00/m6;->O:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly00/m6;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Ly00/m6;->x:Ljava/lang/Long;

    if-nez v2, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    :goto_0
    iget-object v2, p0, Ly00/m6;->y:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Ly00/m6;->z:Ljava/lang/Long;

    if-nez v2, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    :goto_1
    iget-object v2, p0, Ly00/m6;->E:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Ly00/m6;->F:Ljava/lang/Boolean;

    if-nez v2, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-static {p1, v0, v2}, Lvl/b;->s(Landroid/os/Parcel;ILjava/lang/Boolean;)V

    :goto_2
    iget-object v2, p0, Ly00/m6;->G:Ly00/l6;

    if-nez v2, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Ly00/l6;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_3
    iget-object v2, p0, Ly00/m6;->H:Lcom/stripe/android/model/Source$Status;

    if-nez v2, :cond_4

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_4
    iget-object v2, p0, Ly00/m6;->I:Ljava/util/Map;

    if-nez v2, :cond_5

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_6

    :cond_5
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p1, v4}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    goto :goto_5

    :cond_6
    :goto_6
    iget-object v2, p0, Ly00/m6;->J:Ly00/y6;

    invoke-virtual {p1, v2, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v2, p0, Ly00/m6;->K:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Ly00/m6;->L:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Ly00/m6;->M:Lcom/stripe/android/model/Source$Usage;

    if-nez v2, :cond_7

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_7

    :cond_7
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_7
    iget-object v2, p0, Ly00/m6;->N:Ly00/q6;

    if-nez v2, :cond_8

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_8

    :cond_8
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Ly00/q6;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_8
    iget-object p2, p0, Ly00/m6;->O:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
