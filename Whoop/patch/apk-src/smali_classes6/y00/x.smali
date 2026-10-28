.class public final Ly00/x;
.super Ly00/c0;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ly00/x;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Z

.field public final F:Ljava/lang/String;

.field public final G:Ljava/lang/String;

.field public final H:Ljava/lang/String;

.field public final I:Ly00/y;

.field public final J:Ljava/lang/String;

.field public final y:Ljava/lang/String;

.field public final z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly00/k;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ly00/k;-><init>(I)V

    sput-object v0, Ly00/x;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/y;Ljava/lang/String;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "last4"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bank_account"

    invoke-direct {p0, p3, v0}, Ly00/c0;-><init>(ZLjava/lang/String;)V

    iput-object p1, p0, Ly00/x;->y:Ljava/lang/String;

    iput-object p2, p0, Ly00/x;->z:Ljava/lang/String;

    iput-boolean p3, p0, Ly00/x;->E:Z

    iput-object p4, p0, Ly00/x;->F:Ljava/lang/String;

    iput-object p5, p0, Ly00/x;->G:Ljava/lang/String;

    iput-object p6, p0, Ly00/x;->H:Ljava/lang/String;

    iput-object p7, p0, Ly00/x;->I:Ly00/y;

    iput-object p8, p0, Ly00/x;->J:Ljava/lang/String;

    return-void
.end method

.method public static i(Ly00/x;ZLy00/y;Ljava/lang/String;I)Ly00/x;
    .locals 9

    iget-object v1, p0, Ly00/x;->y:Ljava/lang/String;

    iget-object v2, p0, Ly00/x;->z:Ljava/lang/String;

    and-int/lit8 v0, p4, 0x4

    if-eqz v0, :cond_0

    iget-boolean p1, p0, Ly00/x;->E:Z

    :cond_0
    move v3, p1

    iget-object v4, p0, Ly00/x;->F:Ljava/lang/String;

    iget-object v5, p0, Ly00/x;->G:Ljava/lang/String;

    iget-object v6, p0, Ly00/x;->H:Ljava/lang/String;

    and-int/lit8 p1, p4, 0x40

    if-eqz p1, :cond_1

    iget-object p2, p0, Ly00/x;->I:Ly00/y;

    :cond_1
    move-object v7, p2

    and-int/lit16 p1, p4, 0x80

    if-eqz p1, :cond_2

    iget-object p3, p0, Ly00/x;->J:Ljava/lang/String;

    :cond_2
    move-object v8, p3

    const-string p0, "id"

    invoke-static {v1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "last4"

    invoke-static {v2, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly00/x;

    invoke-direct/range {v0 .. v8}, Ly00/x;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/y;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final b()Ly00/y;
    .locals 1

    iget-object v0, p0, Ly00/x;->I:Ly00/y;

    return-object v0
.end method

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
    instance-of v1, p1, Ly00/x;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly00/x;

    iget-object v1, p0, Ly00/x;->y:Ljava/lang/String;

    iget-object v3, p1, Ly00/x;->y:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ly00/x;->z:Ljava/lang/String;

    iget-object v3, p1, Ly00/x;->z:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Ly00/x;->E:Z

    iget-boolean v3, p1, Ly00/x;->E:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ly00/x;->F:Ljava/lang/String;

    iget-object v3, p1, Ly00/x;->F:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ly00/x;->G:Ljava/lang/String;

    iget-object v3, p1, Ly00/x;->G:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Ly00/x;->H:Ljava/lang/String;

    iget-object v3, p1, Ly00/x;->H:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Ly00/x;->I:Ly00/y;

    iget-object v3, p1, Ly00/x;->I:Ly00/y;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Ly00/x;->J:Ljava/lang/String;

    iget-object p1, p1, Ly00/x;->J:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly00/x;->J:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly00/x;->y:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Ly00/x;->E:Z

    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Ly00/x;->y:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Ly00/x;->z:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Ly00/x;->E:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Ly00/x;->F:Ljava/lang/String;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Ly00/x;->G:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Ly00/x;->H:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Ly00/x;->I:Ly00/y;

    if-nez v3, :cond_3

    move v3, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ly00/y;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Ly00/x;->J:Ljava/lang/String;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", last4="

    const-string v1, ", isDefault="

    const-string v2, "BankAccount(id="

    iget-object v3, p0, Ly00/x;->y:Ljava/lang/String;

    iget-object v4, p0, Ly00/x;->z:Ljava/lang/String;

    invoke-static {v2, v3, v0, v4, v1}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", nickname="

    const-string v2, ", bankAccountName="

    iget-boolean v3, p0, Ly00/x;->E:Z

    iget-object v4, p0, Ly00/x;->F:Ljava/lang/String;

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", bankIconCode="

    const-string v2, ", billingAddress="

    iget-object v3, p0, Ly00/x;->G:Ljava/lang/String;

    iget-object v4, p0, Ly00/x;->H:Ljava/lang/String;

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ly00/x;->I:Ly00/y;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", billingEmailAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/x;->J:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly00/x;->y:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Ly00/x;->z:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Ly00/x;->E:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Ly00/x;->F:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Ly00/x;->G:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Ly00/x;->H:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Ly00/x;->I:Ly00/y;

    if-nez v0, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Ly00/y;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object p2, p0, Ly00/x;->J:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
