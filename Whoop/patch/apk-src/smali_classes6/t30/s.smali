.class public final Lt30/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lt30/s;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Lq30/r0;

.field public final F:I

.field public final G:Lq30/n0;

.field public final w:Lr30/e;

.field public final x:Lr30/b;

.field public final y:Lm30/h;

.field public final z:Lq30/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsp/e;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lsp/e;-><init>(I)V

    sput-object v0, Lt30/s;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lr30/e;Lr30/b;Lm30/h;Lq30/n;Lq30/r0;ILq30/n0;)V
    .locals 1

    const-string v0, "cresData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "creqData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiCustomization"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "creqExecutorConfig"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "creqExecutorFactory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intentData"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt30/s;->w:Lr30/e;

    iput-object p2, p0, Lt30/s;->x:Lr30/b;

    iput-object p3, p0, Lt30/s;->y:Lm30/h;

    iput-object p4, p0, Lt30/s;->z:Lq30/n;

    iput-object p5, p0, Lt30/s;->E:Lq30/r0;

    iput p6, p0, Lt30/s;->F:I

    iput-object p7, p0, Lt30/s;->G:Lq30/n0;

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
    instance-of v1, p1, Lt30/s;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lt30/s;

    iget-object v1, p0, Lt30/s;->w:Lr30/e;

    iget-object v3, p1, Lt30/s;->w:Lr30/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lt30/s;->x:Lr30/b;

    iget-object v3, p1, Lt30/s;->x:Lr30/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lt30/s;->y:Lm30/h;

    iget-object v3, p1, Lt30/s;->y:Lm30/h;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lt30/s;->z:Lq30/n;

    iget-object v3, p1, Lt30/s;->z:Lq30/n;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lt30/s;->E:Lq30/r0;

    iget-object v3, p1, Lt30/s;->E:Lq30/r0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lt30/s;->F:I

    iget v3, p1, Lt30/s;->F:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lt30/s;->G:Lq30/n0;

    iget-object p1, p1, Lt30/s;->G:Lq30/n0;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lt30/s;->w:Lr30/e;

    invoke-virtual {v0}, Lr30/e;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lt30/s;->x:Lr30/b;

    invoke-virtual {v2}, Lr30/b;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lt30/s;->y:Lm30/h;

    invoke-virtual {v0}, Lm30/h;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lt30/s;->z:Lq30/n;

    invoke-virtual {v2}, Lq30/n;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lt30/s;->E:Lq30/r0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lt30/s;->F:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lt30/s;->G:Lq30/n0;

    invoke-virtual {v1}, Lq30/n0;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ChallengeViewArgs(cresData="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lt30/s;->w:Lr30/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", creqData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt30/s;->x:Lr30/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", uiCustomization="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt30/s;->y:Lm30/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", creqExecutorConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt30/s;->z:Lq30/n;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", creqExecutorFactory="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt30/s;->E:Lq30/r0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", timeoutMins="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lt30/s;->F:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", intentData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt30/s;->G:Lq30/n0;

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

    iget-object v0, p0, Lt30/s;->w:Lr30/e;

    invoke-virtual {v0, p1, p2}, Lr30/e;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lt30/s;->x:Lr30/b;

    invoke-virtual {v0, p1, p2}, Lr30/b;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lt30/s;->y:Lm30/h;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lt30/s;->z:Lq30/n;

    invoke-virtual {v0, p1, p2}, Lq30/n;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lt30/s;->E:Lq30/r0;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget v0, p0, Lt30/s;->F:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lt30/s;->G:Lq30/n0;

    invoke-virtual {v0, p1, p2}, Lq30/n0;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
