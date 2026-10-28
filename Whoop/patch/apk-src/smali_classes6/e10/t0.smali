.class public final Le10/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le10/v0;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Le10/t0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Z

.field public final F:Z

.field public final w:Ly00/d5;

.field public final x:Ly00/u5;

.field public final y:Ly00/j5;

.field public final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldq/x;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Ldq/x;-><init>(I)V

    sput-object v0, Le10/t0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(Ly00/d5;Ly00/u5;Ly00/j5;Z)V
    .locals 7

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    .line 1
    invoke-direct/range {v0 .. v6}, Le10/t0;-><init>(Ly00/d5;Ly00/u5;Ly00/j5;ZZZ)V

    return-void
.end method

.method public constructor <init>(Ly00/d5;Ly00/u5;Ly00/j5;ZZZ)V
    .locals 1

    const-string v0, "createParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Le10/t0;->w:Ly00/d5;

    .line 4
    iput-object p2, p0, Le10/t0;->x:Ly00/u5;

    .line 5
    iput-object p3, p0, Le10/t0;->y:Ly00/j5;

    .line 6
    iput-boolean p4, p0, Le10/t0;->z:Z

    .line 7
    iput-boolean p5, p0, Le10/t0;->E:Z

    .line 8
    iput-boolean p6, p0, Le10/t0;->F:Z

    return-void
.end method

.method public static b(Le10/t0;Ly00/d5;Ly00/u5;I)Le10/t0;
    .locals 7

    and-int/lit8 v0, p3, 0x2

    if-eqz v0, :cond_0

    iget-object p2, p0, Le10/t0;->x:Ly00/u5;

    :cond_0
    move-object v2, p2

    iget-object v3, p0, Le10/t0;->y:Ly00/j5;

    iget-boolean v4, p0, Le10/t0;->z:Z

    and-int/lit8 p2, p3, 0x10

    const/4 v0, 0x1

    if-eqz p2, :cond_1

    iget-boolean p2, p0, Le10/t0;->E:Z

    move v5, p2

    goto :goto_0

    :cond_1
    move v5, v0

    :goto_0
    and-int/lit8 p2, p3, 0x20

    if-eqz p2, :cond_2

    iget-boolean v0, p0, Le10/t0;->F:Z

    :cond_2
    move v6, v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Le10/t0;

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Le10/t0;-><init>(Ly00/d5;Ly00/u5;Ly00/j5;ZZZ)V

    return-object v0
.end method


# virtual methods
.method public final V()Z
    .locals 2

    iget-object v0, p0, Le10/t0;->y:Ly00/j5;

    instance-of v1, v0, Ly00/f5;

    if-eqz v1, :cond_0

    check-cast v0, Ly00/f5;

    iget-object v0, v0, Ly00/f5;->x:Ljava/lang/Boolean;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0

    :cond_0
    instance-of v1, v0, Ly00/i5;

    if-eqz v1, :cond_1

    check-cast v0, Ly00/i5;

    iget-object v0, v0, Ly00/i5;->x:Ljava/lang/Boolean;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0

    :cond_1
    instance-of v1, v0, Ly00/g5;

    if-eqz v1, :cond_2

    check-cast v0, Ly00/g5;

    iget-object v0, v0, Ly00/g5;->x:Ljava/lang/Boolean;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0

    :cond_2
    instance-of v1, v0, Ly00/h5;

    if-eqz v1, :cond_3

    check-cast v0, Ly00/h5;

    iget-object v0, v0, Ly00/h5;->x:Ljava/lang/Boolean;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0

    :cond_3
    instance-of v1, v0, Ly00/e5;

    if-nez v1, :cond_5

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_5
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final Z(Lh20/u2;)Le10/v0;
    .locals 3

    const-string v0, "intentConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le10/t0;->w:Ly00/d5;

    invoke-static {v0, p1}, Lx30/s0;->L(Ly00/d5;Lh20/u2;)Ly00/d5;

    move-result-object v0

    iget-object v1, p0, Le10/t0;->x:Ly00/u5;

    iget-object v2, v0, Ly00/d5;->w:Ljava/lang/String;

    invoke-static {v1, v2, p1}, Lx30/s0;->K(Ly00/u5;Ljava/lang/String;Lh20/u2;)Ly00/u5;

    move-result-object p1

    const/16 v1, 0x3c

    invoke-static {p0, v0, p1, v1}, Le10/t0;->b(Le10/t0;Ly00/d5;Ly00/u5;I)Le10/t0;

    move-result-object p1

    return-object p1
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
    instance-of v1, p1, Le10/t0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Le10/t0;

    iget-object v1, p0, Le10/t0;->w:Ly00/d5;

    iget-object v3, p1, Le10/t0;->w:Ly00/d5;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Le10/t0;->x:Ly00/u5;

    iget-object v3, p1, Le10/t0;->x:Ly00/u5;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Le10/t0;->y:Ly00/j5;

    iget-object v3, p1, Le10/t0;->y:Ly00/j5;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Le10/t0;->z:Z

    iget-boolean v3, p1, Le10/t0;->z:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Le10/t0;->E:Z

    iget-boolean v3, p1, Le10/t0;->E:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Le10/t0;->F:Z

    iget-boolean p1, p1, Le10/t0;->F:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Le10/t0;->w:Ly00/d5;

    invoke-virtual {v0}, Ly00/d5;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    const/4 v2, 0x0

    iget-object v3, p0, Le10/t0;->x:Ly00/u5;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Le10/t0;->y:Ly00/j5;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Le10/t0;->z:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Le10/t0;->E:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Le10/t0;->F:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final n()Ly00/u5;
    .locals 1

    iget-object v0, p0, Le10/t0;->x:Ly00/u5;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "New(createParams="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Le10/t0;->w:Ly00/d5;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", optionsParams="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le10/t0;->x:Ly00/u5;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", extraParams="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le10/t0;->y:Ly00/j5;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shouldSave="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Le10/t0;->z:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", passiveChallengeComplete="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", attestationComplete="

    const-string v2, ")"

    iget-boolean v3, p0, Le10/t0;->E:Z

    iget-boolean v4, p0, Le10/t0;->F:Z

    invoke-static {v0, v3, v1, v4, v2}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le10/t0;->w:Ly00/d5;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Le10/t0;->x:Ly00/u5;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Le10/t0;->y:Ly00/j5;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-boolean p2, p0, Le10/t0;->z:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Le10/t0;->E:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Le10/t0;->F:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
