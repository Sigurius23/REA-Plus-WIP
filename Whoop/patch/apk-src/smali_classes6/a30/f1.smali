.class public final La30/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "La30/f1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Lv00/c0;

.field public final w:Lmy/a;

.field public final x:La30/a;

.field public final y:Lq20/y;

.field public final z:La30/e1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La10/a;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, La10/a;-><init>(I)V

    sput-object v0, La30/f1;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(La30/v0;)V
    .locals 7

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    iget-object v2, p1, La30/v0;->w:Lmy/a;

    .line 8
    iget-object v3, p1, La30/v0;->x:La30/a;

    .line 9
    iget-object v4, p1, La30/v0;->y:Lq20/y;

    .line 10
    iget-object v5, p1, La30/v0;->z:La30/e1;

    .line 11
    iget-object v6, p1, La30/v0;->E:Lv00/c0;

    move-object v1, p0

    .line 12
    invoke-direct/range {v1 .. v6}, La30/f1;-><init>(Lmy/a;La30/a;Lq20/y;La30/e1;Lv00/c0;)V

    return-void
.end method

.method public constructor <init>(Lmy/a;La30/a;Lq20/y;La30/e1;Lv00/c0;)V
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodMetadata"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, La30/f1;->w:Lmy/a;

    .line 3
    iput-object p2, p0, La30/f1;->x:La30/a;

    .line 4
    iput-object p3, p0, La30/f1;->y:Lq20/y;

    .line 5
    iput-object p4, p0, La30/f1;->z:La30/e1;

    .line 6
    iput-object p5, p0, La30/f1;->E:Lv00/c0;

    return-void
.end method

.method public static b(La30/f1;La30/a;Lq20/y;Lv00/c0;I)La30/f1;
    .locals 6

    iget-object v1, p0, La30/f1;->w:Lmy/a;

    and-int/lit8 v0, p4, 0x2

    if-eqz v0, :cond_0

    iget-object p1, p0, La30/f1;->x:La30/a;

    :cond_0
    move-object v2, p1

    iget-object v4, p0, La30/f1;->z:La30/e1;

    and-int/lit8 p1, p4, 0x10

    if-eqz p1, :cond_1

    iget-object p3, p0, La30/f1;->E:Lv00/c0;

    :cond_1
    move-object v5, p3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p0, "config"

    invoke-static {v1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "paymentMethodMetadata"

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La30/f1;

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, La30/f1;-><init>(Lmy/a;La30/a;Lq20/y;La30/e1;Lv00/c0;)V

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
    instance-of v1, p1, La30/f1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, La30/f1;

    iget-object v1, p0, La30/f1;->w:Lmy/a;

    iget-object v3, p1, La30/f1;->w:Lmy/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, La30/f1;->x:La30/a;

    iget-object v3, p1, La30/f1;->x:La30/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, La30/f1;->y:Lq20/y;

    iget-object v3, p1, La30/f1;->y:Lq20/y;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, La30/f1;->z:La30/e1;

    iget-object v3, p1, La30/f1;->z:La30/e1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, La30/f1;->E:Lv00/c0;

    iget-object p1, p1, La30/f1;->E:Lv00/c0;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, La30/f1;->w:Lmy/a;

    invoke-virtual {v0}, Lmy/a;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    const/4 v1, 0x0

    iget-object v2, p0, La30/f1;->x:La30/a;

    if-nez v2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, La30/a;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, La30/f1;->y:Lq20/y;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, La30/f1;->z:La30/e1;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, La30/f1;->E:Lv00/c0;

    invoke-virtual {v1}, Lv00/c0;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Full(config="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, La30/f1;->w:Lmy/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", customer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La30/f1;->x:La30/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentSelection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La30/f1;->y:Lq20/y;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", validationError="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La30/f1;->z:La30/e1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentMethodMetadata="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La30/f1;->E:Lv00/c0;

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

    iget-object v0, p0, La30/f1;->w:Lmy/a;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, La30/f1;->x:La30/a;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, La30/f1;->y:Lq20/y;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, La30/f1;->z:La30/e1;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object v0, p0, La30/f1;->E:Lv00/c0;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
