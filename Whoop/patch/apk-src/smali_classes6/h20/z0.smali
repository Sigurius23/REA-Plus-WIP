.class public final Lh20/z0;
.super Lh20/f1;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lh20/z0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Z

.field public final F:F

.field public final G:F

.field public final H:F

.field public final I:Lh20/y0;

.field public final J:Lh20/y0;

.field public final w:F

.field public final x:F

.field public final y:F

.field public final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lh20/n;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lh20/n;-><init>(I)V

    sput-object v0, Lh20/z0;->CREATOR:Landroid/os/Parcelable$Creator;

    sget-object v0, Ld40/q;->f:Ld40/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Ld40/q;->m:Ld40/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Ld40/q;->g:Ld40/a;

    iget-wide v1, v0, Ld40/a;->a:J

    invoke-static {v1, v2}, Li2/w0;->H(J)I

    move-result v1

    iget-wide v2, v0, Ld40/a;->b:J

    invoke-static {v2, v3}, Li2/w0;->H(J)I

    move-result v0

    new-instance v11, Lh20/y0;

    invoke-direct {v11, v1, v0}, Lh20/y0;-><init>(II)V

    sget-object v0, Ld40/q;->h:Ld40/a;

    iget-wide v1, v0, Ld40/a;->a:J

    invoke-static {v1, v2}, Li2/w0;->H(J)I

    move-result v1

    iget-wide v2, v0, Ld40/a;->b:J

    invoke-static {v2, v3}, Li2/w0;->H(J)I

    move-result v0

    new-instance v12, Lh20/y0;

    invoke-direct {v12, v1, v0}, Lh20/y0;-><init>(II)V

    new-instance v2, Lh20/z0;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v8, 0x0

    move v7, v6

    invoke-direct/range {v2 .. v12}, Lh20/z0;-><init>(FFFZZFFFLh20/y0;Lh20/y0;)V

    return-void
.end method

.method public constructor <init>(FFFZZFFFLh20/y0;Lh20/y0;)V
    .locals 1

    const-string v0, "colorsLight"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "colorsDark"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lh20/z0;->w:F

    iput p2, p0, Lh20/z0;->x:F

    iput p3, p0, Lh20/z0;->y:F

    iput-boolean p4, p0, Lh20/z0;->z:Z

    iput-boolean p5, p0, Lh20/z0;->E:Z

    iput p6, p0, Lh20/z0;->F:F

    iput p7, p0, Lh20/z0;->G:F

    iput p8, p0, Lh20/z0;->H:F

    iput-object p9, p0, Lh20/z0;->I:Lh20/y0;

    iput-object p10, p0, Lh20/z0;->J:Lh20/y0;

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
    instance-of v1, p1, Lh20/z0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lh20/z0;

    iget v1, p0, Lh20/z0;->w:F

    iget v3, p1, Lh20/z0;->w:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lh20/z0;->x:F

    iget v3, p1, Lh20/z0;->x:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lh20/z0;->y:F

    iget v3, p1, Lh20/z0;->y:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lh20/z0;->z:Z

    iget-boolean v3, p1, Lh20/z0;->z:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lh20/z0;->E:Z

    iget-boolean v3, p1, Lh20/z0;->E:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lh20/z0;->F:F

    iget v3, p1, Lh20/z0;->F:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lh20/z0;->G:F

    iget v3, p1, Lh20/z0;->G:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lh20/z0;->H:F

    iget v3, p1, Lh20/z0;->H:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lh20/z0;->I:Lh20/y0;

    iget-object v3, p1, Lh20/z0;->I:Lh20/y0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lh20/z0;->J:Lh20/y0;

    iget-object p1, p1, Lh20/z0;->J:Lh20/y0;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Lh20/z0;->w:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lh20/z0;->x:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lh20/z0;->y:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-boolean v2, p0, Lh20/z0;->z:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lh20/z0;->E:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget v2, p0, Lh20/z0;->F:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lh20/z0;->G:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lh20/z0;->H:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lh20/z0;->I:Lh20/y0;

    invoke-virtual {v2}, Lh20/y0;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lh20/z0;->J:Lh20/y0;

    invoke-virtual {v0}, Lh20/y0;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", startSeparatorInsetDp="

    const-string v1, ", endSeparatorInsetDp="

    const-string v2, "FlatWithCheckmark(separatorThicknessDp="

    iget v3, p0, Lh20/z0;->w:F

    iget v4, p0, Lh20/z0;->x:F

    invoke-static {v2, v3, v0, v4, v1}, Lb9/y;->t(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lh20/z0;->y:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", topSeparatorEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lh20/z0;->z:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", bottomSeparatorEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lh20/z0;->E:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", checkmarkInsetDp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lh20/z0;->F:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", additionalVerticalInsetsDp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", horizontalInsetsDp="

    const-string v2, ", colorsLight="

    iget v3, p0, Lh20/z0;->G:F

    iget v4, p0, Lh20/z0;->H:F

    invoke-static {v0, v3, v1, v4, v2}, Lr;->u(Ljava/lang/StringBuilder;FLjava/lang/String;FLjava/lang/String;)V

    iget-object v1, p0, Lh20/z0;->I:Lh20/y0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", colorsDark="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/z0;->J:Lh20/y0;

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

    iget v0, p0, Lh20/z0;->w:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget v0, p0, Lh20/z0;->x:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget v0, p0, Lh20/z0;->y:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget-boolean v0, p0, Lh20/z0;->z:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lh20/z0;->E:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lh20/z0;->F:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget v0, p0, Lh20/z0;->G:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget v0, p0, Lh20/z0;->H:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget-object v0, p0, Lh20/z0;->I:Lh20/y0;

    invoke-virtual {v0, p1, p2}, Lh20/y0;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lh20/z0;->J:Lh20/y0;

    invoke-virtual {v0, p1, p2}, Lh20/y0;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
