.class public final Lh20/d1;
.super Lh20/f1;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lh20/d1;",
            ">;"
        }
    .end annotation
.end field

.field public static final J:Lh20/d1;


# instance fields
.field public final E:Z

.field public final F:F

.field public final G:F

.field public final H:Lh20/c1;

.field public final I:Lh20/c1;

.field public final w:F

.field public final x:F

.field public final y:F

.field public final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lh20/n;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lh20/n;-><init>(I)V

    sput-object v0, Lh20/d1;->CREATOR:Landroid/os/Parcelable$Creator;

    sget-object v0, Ld40/q;->f:Ld40/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Ld40/q;->m:Ld40/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Ld40/q;->i:Ld40/f;

    iget-wide v1, v0, Ld40/f;->a:J

    invoke-static {v1, v2}, Li2/w0;->H(J)I

    move-result v1

    iget-wide v2, v0, Ld40/f;->b:J

    invoke-static {v2, v3}, Li2/w0;->H(J)I

    move-result v2

    iget-wide v3, v0, Ld40/f;->c:J

    invoke-static {v3, v4}, Li2/w0;->H(J)I

    move-result v0

    new-instance v11, Lh20/c1;

    invoke-direct {v11, v1, v2, v0}, Lh20/c1;-><init>(III)V

    sget-object v0, Ld40/q;->j:Ld40/f;

    iget-wide v1, v0, Ld40/f;->a:J

    invoke-static {v1, v2}, Li2/w0;->H(J)I

    move-result v1

    iget-wide v2, v0, Ld40/f;->b:J

    invoke-static {v2, v3}, Li2/w0;->H(J)I

    move-result v2

    iget-wide v3, v0, Ld40/f;->c:J

    invoke-static {v3, v4}, Li2/w0;->H(J)I

    move-result v0

    new-instance v12, Lh20/c1;

    invoke-direct {v12, v1, v2, v0}, Lh20/c1;-><init>(III)V

    new-instance v3, Lh20/d1;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    move v8, v7

    invoke-direct/range {v3 .. v12}, Lh20/d1;-><init>(FFFZZFFLh20/c1;Lh20/c1;)V

    sput-object v3, Lh20/d1;->J:Lh20/d1;

    return-void
.end method

.method public constructor <init>(FFFZZFFLh20/c1;Lh20/c1;)V
    .locals 1

    const-string v0, "colorsLight"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "colorsDark"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lh20/d1;->w:F

    iput p2, p0, Lh20/d1;->x:F

    iput p3, p0, Lh20/d1;->y:F

    iput-boolean p4, p0, Lh20/d1;->z:Z

    iput-boolean p5, p0, Lh20/d1;->E:Z

    iput p6, p0, Lh20/d1;->F:F

    iput p7, p0, Lh20/d1;->G:F

    iput-object p8, p0, Lh20/d1;->H:Lh20/c1;

    iput-object p9, p0, Lh20/d1;->I:Lh20/c1;

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
    instance-of v1, p1, Lh20/d1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lh20/d1;

    iget v1, p0, Lh20/d1;->w:F

    iget v3, p1, Lh20/d1;->w:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lh20/d1;->x:F

    iget v3, p1, Lh20/d1;->x:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lh20/d1;->y:F

    iget v3, p1, Lh20/d1;->y:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lh20/d1;->z:Z

    iget-boolean v3, p1, Lh20/d1;->z:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lh20/d1;->E:Z

    iget-boolean v3, p1, Lh20/d1;->E:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lh20/d1;->F:F

    iget v3, p1, Lh20/d1;->F:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lh20/d1;->G:F

    iget v3, p1, Lh20/d1;->G:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lh20/d1;->H:Lh20/c1;

    iget-object v3, p1, Lh20/d1;->H:Lh20/c1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lh20/d1;->I:Lh20/c1;

    iget-object p1, p1, Lh20/d1;->I:Lh20/c1;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Lh20/d1;->w:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lh20/d1;->x:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lh20/d1;->y:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-boolean v2, p0, Lh20/d1;->z:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lh20/d1;->E:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget v2, p0, Lh20/d1;->F:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lh20/d1;->G:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lh20/d1;->H:Lh20/c1;

    invoke-virtual {v2}, Lh20/c1;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lh20/d1;->I:Lh20/c1;

    invoke-virtual {v0}, Lh20/c1;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", startSeparatorInsetDp="

    const-string v1, ", endSeparatorInsetDp="

    const-string v2, "FlatWithRadio(separatorThicknessDp="

    iget v3, p0, Lh20/d1;->w:F

    iget v4, p0, Lh20/d1;->x:F

    invoke-static {v2, v3, v0, v4, v1}, Lb9/y;->t(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lh20/d1;->y:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", topSeparatorEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lh20/d1;->z:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", bottomSeparatorEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lh20/d1;->E:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", additionalVerticalInsetsDp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lh20/d1;->F:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", horizontalInsetsDp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lh20/d1;->G:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", colorsLight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/d1;->H:Lh20/c1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", colorsDark="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/d1;->I:Lh20/c1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lh20/d1;->w:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget v0, p0, Lh20/d1;->x:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget v0, p0, Lh20/d1;->y:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget-boolean v0, p0, Lh20/d1;->z:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lh20/d1;->E:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lh20/d1;->F:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget v0, p0, Lh20/d1;->G:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget-object v0, p0, Lh20/d1;->H:Lh20/c1;

    invoke-virtual {v0, p1, p2}, Lh20/c1;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lh20/d1;->I:Lh20/c1;

    invoke-virtual {v0, p1, p2}, Lh20/c1;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
