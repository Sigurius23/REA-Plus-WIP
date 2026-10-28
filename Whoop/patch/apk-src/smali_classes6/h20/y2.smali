.class public final Lh20/y2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lh20/y2;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:Lh20/z2;

.field public final x:Lh20/z2;

.field public final y:Lh20/a3;

.field public final z:Lh20/b3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh20/f2;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lh20/f2;-><init>(I)V

    sput-object v0, Lh20/y2;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lh20/z2;Lh20/z2;Lh20/a3;Lh20/b3;)V
    .locals 1

    const-string v0, "colorsLight"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "colorsDark"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shape"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typography"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh20/y2;->w:Lh20/z2;

    iput-object p2, p0, Lh20/y2;->x:Lh20/z2;

    iput-object p3, p0, Lh20/y2;->y:Lh20/a3;

    iput-object p4, p0, Lh20/y2;->z:Lh20/b3;

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
    instance-of v1, p1, Lh20/y2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lh20/y2;

    iget-object v1, p0, Lh20/y2;->w:Lh20/z2;

    iget-object v3, p1, Lh20/y2;->w:Lh20/z2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lh20/y2;->x:Lh20/z2;

    iget-object v3, p1, Lh20/y2;->x:Lh20/z2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lh20/y2;->y:Lh20/a3;

    iget-object v3, p1, Lh20/y2;->y:Lh20/a3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lh20/y2;->z:Lh20/b3;

    iget-object p1, p1, Lh20/y2;->z:Lh20/b3;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lh20/y2;->w:Lh20/z2;

    invoke-virtual {v0}, Lh20/z2;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lh20/y2;->x:Lh20/z2;

    invoke-virtual {v1}, Lh20/z2;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lh20/y2;->y:Lh20/a3;

    invoke-virtual {v0}, Lh20/a3;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lh20/y2;->z:Lh20/b3;

    invoke-virtual {v1}, Lh20/b3;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PrimaryButton(colorsLight="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lh20/y2;->w:Lh20/z2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", colorsDark="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/y2;->x:Lh20/z2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shape="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/y2;->y:Lh20/a3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", typography="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/y2;->z:Lh20/b3;

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

    iget-object v0, p0, Lh20/y2;->w:Lh20/z2;

    invoke-virtual {v0, p1, p2}, Lh20/z2;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lh20/y2;->x:Lh20/z2;

    invoke-virtual {v0, p1, p2}, Lh20/z2;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lh20/y2;->y:Lh20/a3;

    invoke-virtual {v0, p1, p2}, Lh20/a3;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lh20/y2;->z:Lh20/b3;

    invoke-virtual {v0, p1, p2}, Lh20/b3;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
