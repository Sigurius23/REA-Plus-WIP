.class public final Lh20/h1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lh20/h1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Lh20/y2;

.field public final F:Lh20/g1;

.field public final G:Lh20/j2;

.field public final H:Lh20/h3;

.field public final I:Lh20/j2;

.field public final J:Lh20/i2;

.field public final K:F

.field public final w:Lh20/v1;

.field public final x:Lh20/v1;

.field public final y:Lh20/c3;

.field public final z:Lh20/l3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh20/n;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lh20/n;-><init>(I)V

    sput-object v0, Lh20/h1;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lh20/v1;Lh20/v1;Lh20/c3;Lh20/l3;Lh20/y2;)V
    .locals 13

    const-string v0, "colorsLight"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "colorsDark"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shapes"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typography"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    sget-object v7, Lh20/g1;->E:Lh20/g1;

    .line 14
    sget-object v8, Lh20/j2;->E:Lh20/j2;

    .line 15
    const-string v0, "embeddedAppearance"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    sget-object v10, Lh20/j2;->F:Lh20/j2;

    .line 17
    sget-object v0, Lh20/i2;->w:Lh20/t;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    sget-object v11, Lh20/i2;->x:Lh20/i2;

    .line 19
    sget-object v0, Ld40/q;->a:Ld40/n;

    const/4 v12, 0x0

    .line 20
    sget-object v9, Lh20/h3;->x:Lh20/h3;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v6, p5

    invoke-direct/range {v1 .. v12}, Lh20/h1;-><init>(Lh20/v1;Lh20/v1;Lh20/c3;Lh20/l3;Lh20/y2;Lh20/g1;Lh20/j2;Lh20/h3;Lh20/j2;Lh20/i2;F)V

    return-void
.end method

.method public constructor <init>(Lh20/v1;Lh20/v1;Lh20/c3;Lh20/l3;Lh20/y2;Lh20/g1;Lh20/j2;Lh20/h3;Lh20/j2;Lh20/i2;F)V
    .locals 1

    const-string v0, "colorsLight"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "colorsDark"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shapes"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typography"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryButton"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "embeddedAppearance"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formInsetValues"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sectionSpacing"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textFieldInsets"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconStyle"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lh20/h1;->w:Lh20/v1;

    .line 3
    iput-object p2, p0, Lh20/h1;->x:Lh20/v1;

    .line 4
    iput-object p3, p0, Lh20/h1;->y:Lh20/c3;

    .line 5
    iput-object p4, p0, Lh20/h1;->z:Lh20/l3;

    .line 6
    iput-object p5, p0, Lh20/h1;->E:Lh20/y2;

    .line 7
    iput-object p6, p0, Lh20/h1;->F:Lh20/g1;

    .line 8
    iput-object p7, p0, Lh20/h1;->G:Lh20/j2;

    .line 9
    iput-object p8, p0, Lh20/h1;->H:Lh20/h3;

    .line 10
    iput-object p9, p0, Lh20/h1;->I:Lh20/j2;

    .line 11
    iput-object p10, p0, Lh20/h1;->J:Lh20/i2;

    .line 12
    iput p11, p0, Lh20/h1;->K:F

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
    instance-of v1, p1, Lh20/h1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lh20/h1;

    iget-object v1, p0, Lh20/h1;->w:Lh20/v1;

    iget-object v3, p1, Lh20/h1;->w:Lh20/v1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lh20/h1;->x:Lh20/v1;

    iget-object v3, p1, Lh20/h1;->x:Lh20/v1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lh20/h1;->y:Lh20/c3;

    iget-object v3, p1, Lh20/h1;->y:Lh20/c3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lh20/h1;->z:Lh20/l3;

    iget-object v3, p1, Lh20/h1;->z:Lh20/l3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lh20/h1;->E:Lh20/y2;

    iget-object v3, p1, Lh20/h1;->E:Lh20/y2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lh20/h1;->F:Lh20/g1;

    iget-object v3, p1, Lh20/h1;->F:Lh20/g1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lh20/h1;->G:Lh20/j2;

    iget-object v3, p1, Lh20/h1;->G:Lh20/j2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lh20/h1;->H:Lh20/h3;

    iget-object v3, p1, Lh20/h1;->H:Lh20/h3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lh20/h1;->I:Lh20/j2;

    iget-object v3, p1, Lh20/h1;->I:Lh20/j2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lh20/h1;->J:Lh20/i2;

    iget-object v3, p1, Lh20/h1;->J:Lh20/i2;

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lh20/h1;->K:F

    iget p1, p1, Lh20/h1;->K:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lh20/h1;->w:Lh20/v1;

    invoke-virtual {v0}, Lh20/v1;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lh20/h1;->x:Lh20/v1;

    invoke-virtual {v2}, Lh20/v1;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lh20/h1;->y:Lh20/c3;

    invoke-virtual {v0}, Lh20/c3;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lh20/h1;->z:Lh20/l3;

    invoke-virtual {v2}, Lh20/l3;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lh20/h1;->E:Lh20/y2;

    invoke-virtual {v0}, Lh20/y2;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lh20/h1;->F:Lh20/g1;

    invoke-virtual {v2}, Lh20/g1;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lh20/h1;->G:Lh20/j2;

    invoke-virtual {v0}, Lh20/j2;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lh20/h1;->H:Lh20/h3;

    iget v2, v2, Lh20/h3;->w:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lh20/h1;->I:Lh20/j2;

    invoke-virtual {v2}, Lh20/j2;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lh20/h1;->J:Lh20/i2;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v1, p0, Lh20/h1;->K:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Appearance(colorsLight="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lh20/h1;->w:Lh20/v1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", colorsDark="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/h1;->x:Lh20/v1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shapes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/h1;->y:Lh20/c3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", typography="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/h1;->z:Lh20/l3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", primaryButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/h1;->E:Lh20/y2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", embeddedAppearance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/h1;->F:Lh20/g1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", formInsetValues="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/h1;->G:Lh20/j2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sectionSpacing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/h1;->H:Lh20/h3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textFieldInsets="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/h1;->I:Lh20/j2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", iconStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/h1;->J:Lh20/i2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", verticalModeRowPadding="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    iget v2, p0, Lh20/h1;->K:F

    invoke-static {v2, v1, v0}, Lq63/c;->g(FLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh20/h1;->w:Lh20/v1;

    invoke-virtual {v0, p1, p2}, Lh20/v1;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lh20/h1;->x:Lh20/v1;

    invoke-virtual {v0, p1, p2}, Lh20/v1;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lh20/h1;->y:Lh20/c3;

    invoke-virtual {v0, p1, p2}, Lh20/c3;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lh20/h1;->z:Lh20/l3;

    invoke-virtual {v0, p1, p2}, Lh20/l3;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lh20/h1;->E:Lh20/y2;

    invoke-virtual {v0, p1, p2}, Lh20/y2;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lh20/h1;->F:Lh20/g1;

    invoke-virtual {v0, p1, p2}, Lh20/g1;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lh20/h1;->G:Lh20/j2;

    invoke-virtual {v0, p1, p2}, Lh20/j2;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lh20/h1;->H:Lh20/h3;

    invoke-virtual {v0, p1, p2}, Lh20/h3;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lh20/h1;->I:Lh20/j2;

    invoke-virtual {v0, p1, p2}, Lh20/j2;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Lh20/h1;->J:Lh20/i2;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lh20/h1;->K:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    return-void
.end method
