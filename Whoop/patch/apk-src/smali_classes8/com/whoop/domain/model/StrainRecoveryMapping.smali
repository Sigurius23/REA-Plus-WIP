.class public final Lcom/whoop/domain/model/StrainRecoveryMapping;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;
.implements Ljava/io/Serializable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0087\u0008\u0018\u00002\u00020\u00012\u00020\u0002B\'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0013\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0013J\u0010\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ8\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\u0013J\u001a\u0010%\u001a\u00020$2\u0008\u0010#\u001a\u0004\u0018\u00010\"H\u00d6\u0003\u00a2\u0006\u0004\u0008%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\'\u001a\u0004\u0008(\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010)\u001a\u0004\u0008*\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010)\u001a\u0004\u0008+\u0010\u001cR\u0017\u0010\u0008\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010)\u001a\u0004\u0008,\u0010\u001c\u00a8\u0006-"
    }
    d2 = {
        "Lcom/whoop/domain/model/StrainRecoveryMapping;",
        "Landroid/os/Parcelable;",
        "Ljava/io/Serializable;",
        "",
        "recovery",
        "",
        "lowerRecStrain",
        "recStrain",
        "upperRecStrain",
        "<init>",
        "(IDDD)V",
        "Li93/f;",
        "",
        "getRecStrainPercentRange",
        "()Li93/f;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "Ll83/a0;",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "component1",
        "component2",
        "()D",
        "component3",
        "component4",
        "copy",
        "(IDDD)Lcom/whoop/domain/model/StrainRecoveryMapping;",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getRecovery",
        "D",
        "getLowerRecStrain",
        "getRecStrain",
        "getUpperRecStrain",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/whoop/domain/model/StrainRecoveryMapping;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final lowerRecStrain:D

.field private final recStrain:D

.field private final recovery:I

.field private final upperRecStrain:D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/domain/model/StrainRecoveryMapping$Creator;

    invoke-direct {v0}, Lcom/whoop/domain/model/StrainRecoveryMapping$Creator;-><init>()V

    sput-object v0, Lcom/whoop/domain/model/StrainRecoveryMapping;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IDDD)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->recovery:I

    iput-wide p2, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->lowerRecStrain:D

    iput-wide p4, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->recStrain:D

    iput-wide p6, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->upperRecStrain:D

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/model/StrainRecoveryMapping;IDDDILjava/lang/Object;)Lcom/whoop/domain/model/StrainRecoveryMapping;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget p1, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->recovery:I

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-wide p2, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->lowerRecStrain:D

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-wide p4, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->recStrain:D

    :cond_2
    and-int/lit8 p8, p8, 0x8

    if-eqz p8, :cond_3

    iget-wide p6, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->upperRecStrain:D

    :cond_3
    move-wide p8, p6

    move-wide p6, p4

    move-wide p4, p2

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/domain/model/StrainRecoveryMapping;->copy(IDDD)Lcom/whoop/domain/model/StrainRecoveryMapping;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->recovery:I

    return v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->lowerRecStrain:D

    return-wide v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->recStrain:D

    return-wide v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->upperRecStrain:D

    return-wide v0
.end method

.method public final copy(IDDD)Lcom/whoop/domain/model/StrainRecoveryMapping;
    .locals 8

    new-instance v0, Lcom/whoop/domain/model/StrainRecoveryMapping;

    move v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move-wide v6, p6

    invoke-direct/range {v0 .. v7}, Lcom/whoop/domain/model/StrainRecoveryMapping;-><init>(IDDD)V

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/domain/model/StrainRecoveryMapping;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/model/StrainRecoveryMapping;

    iget v1, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->recovery:I

    iget v3, p1, Lcom/whoop/domain/model/StrainRecoveryMapping;->recovery:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->lowerRecStrain:D

    iget-wide v5, p1, Lcom/whoop/domain/model/StrainRecoveryMapping;->lowerRecStrain:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->recStrain:D

    iget-wide v5, p1, Lcom/whoop/domain/model/StrainRecoveryMapping;->recStrain:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->upperRecStrain:D

    iget-wide v5, p1, Lcom/whoop/domain/model/StrainRecoveryMapping;->upperRecStrain:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getLowerRecStrain()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->lowerRecStrain:D

    return-wide v0
.end method

.method public final getRecStrain()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->recStrain:D

    return-wide v0
.end method

.method public final getRecStrainPercentRange()Li93/f;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li93/f;"
        }
    .end annotation

    iget-wide v0, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->lowerRecStrain:D

    const-wide/high16 v2, 0x4035000000000000L    # 21.0

    div-double/2addr v0, v2

    double-to-float v0, v0

    iget-wide v4, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->upperRecStrain:D

    div-double/2addr v4, v2

    double-to-float v1, v4

    new-instance v2, Li93/e;

    invoke-direct {v2, v0, v1}, Li93/e;-><init>(FF)V

    return-object v2
.end method

.method public final getRecovery()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->recovery:I

    return v0
.end method

.method public final getUpperRecStrain()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->upperRecStrain:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->recovery:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->lowerRecStrain:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->recStrain:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v1, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->upperRecStrain:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-wide v0, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->lowerRecStrain:D

    iget-wide v2, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->recStrain:D

    iget-wide v4, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->upperRecStrain:D

    iget v6, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->recovery:I

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, "-"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-static {v7, v0, v4, v5, v1}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->recovery:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->lowerRecStrain:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget-wide v0, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->recStrain:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget-wide v0, p0, Lcom/whoop/domain/model/StrainRecoveryMapping;->upperRecStrain:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    return-void
.end method
