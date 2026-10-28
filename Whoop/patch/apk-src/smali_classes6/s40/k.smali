.class public final Ls40/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ls40/k;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Ljava/util/List;

.field public final F:Ljava/util/List;

.field public final G:Z

.field public final H:Z

.field public final w:Z

.field public final x:Z

.field public final y:Ly00/i;

.field public final z:Ly00/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq30/j0;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lq30/j0;-><init>(I)V

    sput-object v0, Ls40/k;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 9

    .line 10
    sget-object v3, Ly00/i;->X:Ly00/i;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    .line 11
    sget-object v5, Lm83/y;->w:Lm83/y;

    move-object v6, v5

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Ls40/k;-><init>(ZZLy00/i;Ly00/i;Ljava/util/List;Ljava/util/List;ZZ)V

    return-void
.end method

.method public constructor <init>(ZZLy00/i;Ly00/i;Ljava/util/List;Ljava/util/List;ZZ)V
    .locals 1

    const-string v0, "brand"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Ls40/k;->w:Z

    .line 3
    iput-boolean p2, p0, Ls40/k;->x:Z

    .line 4
    iput-object p3, p0, Ls40/k;->y:Ly00/i;

    .line 5
    iput-object p4, p0, Ls40/k;->z:Ly00/i;

    .line 6
    iput-object p5, p0, Ls40/k;->E:Ljava/util/List;

    .line 7
    iput-object p6, p0, Ls40/k;->F:Ljava/util/List;

    .line 8
    iput-boolean p7, p0, Ls40/k;->G:Z

    .line 9
    iput-boolean p8, p0, Ls40/k;->H:Z

    return-void
.end method

.method public static b(Ls40/k;ZLy00/i;Ly00/i;Ljava/util/List;Ljava/util/List;ZZI)Ls40/k;
    .locals 9

    move/from16 v0, p8

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-boolean p1, p0, Ls40/k;->w:Z

    :cond_0
    move v1, p1

    iget-boolean v2, p0, Ls40/k;->x:Z

    and-int/lit8 p1, v0, 0x4

    if-eqz p1, :cond_1

    iget-object p2, p0, Ls40/k;->y:Ly00/i;

    :cond_1
    move-object v3, p2

    and-int/lit8 p1, v0, 0x8

    if-eqz p1, :cond_2

    iget-object p3, p0, Ls40/k;->z:Ly00/i;

    :cond_2
    move-object v4, p3

    and-int/lit8 p1, v0, 0x10

    if-eqz p1, :cond_3

    iget-object p4, p0, Ls40/k;->E:Ljava/util/List;

    :cond_3
    move-object v5, p4

    and-int/lit8 p1, v0, 0x20

    if-eqz p1, :cond_4

    iget-object p5, p0, Ls40/k;->F:Ljava/util/List;

    :cond_4
    move-object v6, p5

    and-int/lit8 p1, v0, 0x40

    if-eqz p1, :cond_5

    iget-boolean p6, p0, Ls40/k;->G:Z

    :cond_5
    move v7, p6

    and-int/lit16 p1, v0, 0x80

    if-eqz p1, :cond_6

    iget-boolean p1, p0, Ls40/k;->H:Z

    move v8, p1

    goto :goto_0

    :cond_6
    move/from16 v8, p7

    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p0, "brand"

    invoke-static {v3, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "possibleBrands"

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "merchantPreferredNetworks"

    invoke-static {v6, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ls40/k;

    invoke-direct/range {v0 .. v8}, Ls40/k;-><init>(ZZLy00/i;Ly00/i;Ljava/util/List;Ljava/util/List;ZZ)V

    return-object v0
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
    instance-of v1, p1, Ls40/k;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ls40/k;

    iget-boolean v1, p0, Ls40/k;->w:Z

    iget-boolean v3, p1, Ls40/k;->w:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Ls40/k;->x:Z

    iget-boolean v3, p1, Ls40/k;->x:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ls40/k;->y:Ly00/i;

    iget-object v3, p1, Ls40/k;->y:Ly00/i;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ls40/k;->z:Ly00/i;

    iget-object v3, p1, Ls40/k;->z:Ly00/i;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ls40/k;->E:Ljava/util/List;

    iget-object v3, p1, Ls40/k;->E:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Ls40/k;->F:Ljava/util/List;

    iget-object v3, p1, Ls40/k;->F:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Ls40/k;->G:Z

    iget-boolean v3, p1, Ls40/k;->G:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Ls40/k;->H:Z

    iget-boolean p1, p1, Ls40/k;->H:Z

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-boolean v0, p0, Ls40/k;->w:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ls40/k;->x:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Ls40/k;->y:Ly00/i;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Ls40/k;->z:Ly00/i;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Ls40/k;->E:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Ls40/k;->F:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v2, p0, Ls40/k;->G:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Ls40/k;->H:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", isLoading="

    const-string v1, ", brand="

    const-string v2, "State(isCbcEligible="

    iget-boolean v3, p0, Ls40/k;->w:Z

    iget-boolean v4, p0, Ls40/k;->x:Z

    invoke-static {v2, v0, v1, v3, v4}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ls40/k;->y:Ly00/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", userSelectedBrand="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ls40/k;->z:Ly00/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", possibleBrands="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", merchantPreferredNetworks="

    const-string v2, ", shouldShowCvc="

    iget-object v3, p0, Ls40/k;->E:Ljava/util/List;

    iget-object v4, p0, Ls40/k;->F:Ljava/util/List;

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    const-string v1, ", shouldShowErrorIcon="

    const-string v2, ")"

    iget-boolean v3, p0, Ls40/k;->G:Z

    iget-boolean v4, p0, Ls40/k;->H:Z

    invoke-static {v0, v3, v1, v4, v2}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p2, p0, Ls40/k;->w:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Ls40/k;->x:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Ls40/k;->y:Ly00/i;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Ls40/k;->z:Ly00/i;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_0
    iget-object p2, p0, Ls40/k;->E:Ljava/util/List;

    invoke-static {p2, p1}, Ld13/a;->o(Ljava/util/List;Landroid/os/Parcel;)Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly00/i;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    iget-object p2, p0, Ls40/k;->F:Ljava/util/List;

    invoke-static {p2, p1}, Ld13/a;->o(Ljava/util/List;Landroid/os/Parcel;)Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly00/i;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    iget-boolean p2, p0, Ls40/k;->G:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Ls40/k;->H:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
