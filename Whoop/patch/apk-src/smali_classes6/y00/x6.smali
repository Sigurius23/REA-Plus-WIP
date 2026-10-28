.class public final Ly00/x6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly00/e8;
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ly00/x6;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Lcom/stripe/android/model/Source$Usage;

.field public final F:Ly00/u6;

.field public final G:Ljava/lang/String;

.field public final H:Ljava/util/Map;

.field public final I:Ly00/v6;

.field public final J:Ljava/util/LinkedHashSet;

.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/Long;

.field public final y:Ljava/lang/String;

.field public final z:Ly00/w6;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly00/r5;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Ly00/r5;-><init>(I)V

    sput-object v0, Ly00/x6;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ly00/w6;Lcom/stripe/android/model/Source$Usage;Ly00/u6;Ljava/lang/String;Ljava/util/LinkedHashMap;Ly00/v6;Ljava/util/LinkedHashSet;)V
    .locals 1

    const-string v0, "typeRaw"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiParams"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly00/x6;->w:Ljava/lang/String;

    iput-object p2, p0, Ly00/x6;->x:Ljava/lang/Long;

    iput-object p3, p0, Ly00/x6;->y:Ljava/lang/String;

    iput-object p4, p0, Ly00/x6;->z:Ly00/w6;

    iput-object p5, p0, Ly00/x6;->E:Lcom/stripe/android/model/Source$Usage;

    iput-object p6, p0, Ly00/x6;->F:Ly00/u6;

    iput-object p7, p0, Ly00/x6;->G:Ljava/lang/String;

    iput-object p8, p0, Ly00/x6;->H:Ljava/util/Map;

    iput-object p9, p0, Ly00/x6;->I:Ly00/v6;

    iput-object p10, p0, Ly00/x6;->J:Ljava/util/LinkedHashSet;

    return-void
.end method


# virtual methods
.method public final c0()Ljava/util/Map;
    .locals 7

    const-string v0, "type"

    iget-object v1, p0, Ly00/x6;->w:Ljava/lang/String;

    invoke-static {v0, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    iget-object v2, p0, Ly00/x6;->I:Ly00/v6;

    iget-object v2, v2, Ly00/v6;->w:Ljava/lang/Object;

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v4

    :goto_0
    if-eqz v2, :cond_1

    invoke-static {v2, v1}, Lvl/b;->q(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v4

    :goto_1
    sget-object v2, Lm83/z;->w:Lm83/z;

    if-nez v1, :cond_2

    move-object v1, v2

    :cond_2
    invoke-static {v0, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-static {v0, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v1, p0, Ly00/x6;->x:Ljava/lang/Long;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    new-instance v3, Ll83/k;

    const-string v5, "amount"

    invoke-direct {v3, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v1

    goto :goto_2

    :cond_3
    move-object v1, v4

    :goto_2
    if-nez v1, :cond_4

    move-object v1, v2

    :cond_4
    invoke-static {v0, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v1, p0, Ly00/x6;->y:Ljava/lang/String;

    if-eqz v1, :cond_5

    const-string v3, "currency"

    invoke-static {v3, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    goto :goto_3

    :cond_5
    move-object v1, v4

    :goto_3
    if-nez v1, :cond_6

    move-object v1, v2

    :cond_6
    invoke-static {v0, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v1, p0, Ly00/x6;->F:Ly00/u6;

    if-eqz v1, :cond_7

    const-string v3, "source_order"

    invoke-virtual {v1}, Ly00/u6;->c0()Ljava/util/Map;

    move-result-object v1

    invoke-static {v3, v1}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    goto :goto_4

    :cond_7
    move-object v1, v4

    :goto_4
    if-nez v1, :cond_8

    move-object v1, v2

    :cond_8
    invoke-static {v0, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v1, p0, Ly00/x6;->z:Ly00/w6;

    if-eqz v1, :cond_9

    const-string v3, "owner"

    invoke-virtual {v1}, Ly00/w6;->c0()Ljava/util/Map;

    move-result-object v1

    invoke-static {v3, v1}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    goto :goto_5

    :cond_9
    move-object v1, v4

    :goto_5
    if-nez v1, :cond_a

    move-object v1, v2

    :cond_a
    invoke-static {v0, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v1, p0, Ly00/x6;->H:Ljava/util/Map;

    if-eqz v1, :cond_b

    const-string v3, "metadata"

    invoke-static {v3, v1}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    goto :goto_6

    :cond_b
    move-object v1, v4

    :goto_6
    if-nez v1, :cond_c

    move-object v1, v2

    :cond_c
    invoke-static {v0, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v1, p0, Ly00/x6;->G:Ljava/lang/String;

    if-eqz v1, :cond_d

    const-string v3, "token"

    invoke-static {v3, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    goto :goto_7

    :cond_d
    move-object v1, v4

    :goto_7
    if-nez v1, :cond_e

    move-object v1, v2

    :cond_e
    invoke-static {v0, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v1, p0, Ly00/x6;->E:Lcom/stripe/android/model/Source$Usage;

    if-eqz v1, :cond_f

    const-string v3, "usage"

    iget-object v1, v1, Lcom/stripe/android/model/Source$Usage;->w:Ljava/lang/String;

    invoke-static {v3, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    :cond_f
    if-nez v4, :cond_10

    goto :goto_8

    :cond_10
    move-object v2, v4

    :goto_8
    invoke-static {v0, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto/16 :goto_1

    :cond_0
    instance-of v0, p1, Ly00/x6;

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    check-cast p1, Ly00/x6;

    iget-object v0, p0, Ly00/x6;->w:Ljava/lang/String;

    iget-object v1, p1, Ly00/x6;->w:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Ly00/x6;->x:Ljava/lang/Long;

    iget-object v1, p1, Ly00/x6;->x:Ljava/lang/Long;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Ly00/x6;->y:Ljava/lang/String;

    iget-object v1, p1, Ly00/x6;->y:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Ly00/x6;->z:Ly00/w6;

    iget-object v1, p1, Ly00/x6;->z:Ly00/w6;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    iget-object v0, p0, Ly00/x6;->E:Lcom/stripe/android/model/Source$Usage;

    iget-object v1, p1, Ly00/x6;->E:Lcom/stripe/android/model/Source$Usage;

    if-eq v0, v1, :cond_6

    goto :goto_0

    :cond_6
    iget-object v0, p0, Ly00/x6;->F:Ly00/u6;

    iget-object v1, p1, Ly00/x6;->F:Ly00/u6;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    iget-object v0, p0, Ly00/x6;->G:Ljava/lang/String;

    iget-object v1, p1, Ly00/x6;->G:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    iget-object v0, p0, Ly00/x6;->H:Ljava/util/Map;

    iget-object v1, p1, Ly00/x6;->H:Ljava/util/Map;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    :cond_9
    iget-object v0, p0, Ly00/x6;->I:Ly00/v6;

    iget-object v1, p1, Ly00/x6;->I:Ly00/v6;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_0

    :cond_a
    iget-object v0, p0, Ly00/x6;->J:Ljava/util/LinkedHashSet;

    iget-object p1, p1, Ly00/x6;->J:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_b
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Ly00/x6;->w:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit16 v0, v0, 0x3c1

    const/4 v1, 0x0

    iget-object v2, p0, Ly00/x6;->x:Ljava/lang/Long;

    if-nez v2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Ly00/x6;->y:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Ly00/x6;->z:Ly00/w6;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ly00/w6;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Ly00/x6;->E:Lcom/stripe/android/model/Source$Usage;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Ly00/x6;->F:Ly00/u6;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ly00/u6;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Ly00/x6;->G:Ljava/lang/String;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Ly00/x6;->H:Ljava/util/Map;

    if-nez v3, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Ly00/x6;->I:Ly00/v6;

    iget-object v1, v1, Ly00/v6;->w:Ljava/lang/Object;

    invoke-static {v0, v2, v1}, Lte0/d;->c(IILjava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Ly00/x6;->J:Ljava/util/LinkedHashSet;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SourceParams(typeRaw="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ly00/x6;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", typeData=null, amount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/x6;->x:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", currency="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/x6;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", owner="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/x6;->z:Ly00/w6;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", usage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/x6;->E:Lcom/stripe/android/model/Source$Usage;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sourceOrder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/x6;->F:Ly00/u6;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", token="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", metadata="

    const-string v2, ", apiParams="

    iget-object v3, p0, Ly00/x6;->G:Ljava/lang/String;

    iget-object v4, p0, Ly00/x6;->H:Ljava/util/Map;

    invoke-static {v0, v3, v1, v4, v2}, Lvl/b;->w(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    iget-object v1, p0, Ly00/x6;->I:Ly00/v6;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", attribution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/x6;->J:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly00/x6;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Ly00/x6;->x:Ljava/lang/Long;

    if-nez v2, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    :goto_0
    iget-object v2, p0, Ly00/x6;->y:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Ly00/x6;->z:Ly00/w6;

    if-nez v2, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Ly00/w6;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object v2, p0, Ly00/x6;->E:Lcom/stripe/android/model/Source$Usage;

    if-nez v2, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_2
    iget-object v2, p0, Ly00/x6;->F:Ly00/u6;

    if-nez v2, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Ly00/u6;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_3
    iget-object v2, p0, Ly00/x6;->G:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Ly00/x6;->H:Ljava/util/Map;

    if-nez v2, :cond_4

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_5

    :cond_4
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_4

    :cond_5
    :goto_5
    iget-object v0, p0, Ly00/x6;->I:Ly00/v6;

    invoke-virtual {v0, p1, p2}, Ly00/v6;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Ly00/x6;->J:Ljava/util/LinkedHashSet;

    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_6

    :cond_6
    return-void
.end method
