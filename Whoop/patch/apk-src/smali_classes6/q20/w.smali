.class public final Lq20/w;
.super Lq20/y;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lq20/w;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final x:Ly00/o4;

.field public final y:Lq20/u;

.field public final z:Ly00/u5;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq20/p;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lq20/p;-><init>(I)V

    sput-object v0, Lq20/w;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ly00/o4;Lq20/u;Ly00/u5;)V
    .locals 1

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq20/w;->x:Ly00/o4;

    iput-object p2, p0, Lq20/w;->y:Lq20/u;

    iput-object p3, p0, Lq20/w;->z:Ly00/u5;

    return-void
.end method

.method public static h(Lq20/w;Ly00/o4;Ly00/l5;I)Lq20/w;
    .locals 1

    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_0

    iget-object p1, p0, Lq20/w;->x:Ly00/o4;

    :cond_0
    iget-object v0, p0, Lq20/w;->y:Lq20/u;

    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_1

    iget-object p2, p0, Lq20/w;->z:Ly00/u5;

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p0, "paymentMethod"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lq20/w;

    invoke-direct {p0, p1, v0, p2}, Lq20/w;-><init>(Ly00/o4;Lq20/u;Ly00/u5;)V

    return-object p0
.end method


# virtual methods
.method public final b()Z
    .locals 2

    iget-object v0, p0, Lq20/w;->x:Ly00/o4;

    iget-object v0, v0, Ly00/o4;->E:Ly00/f4;

    sget-object v1, Ly00/f4;->l0:Ly00/f4;

    if-eq v0, v1, :cond_1

    sget-object v1, Ly00/f4;->L:Ly00/f4;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
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
    instance-of v1, p1, Lq20/w;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lq20/w;

    iget-object v1, p0, Lq20/w;->x:Ly00/o4;

    iget-object v3, p1, Lq20/w;->x:Ly00/o4;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lq20/w;->y:Lq20/u;

    iget-object v3, p1, Lq20/w;->y:Lq20/u;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lq20/w;->z:Ly00/u5;

    iget-object p1, p1, Lq20/w;->z:Ly00/u5;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final f(Ljava/lang/String;Z)Lzy/c;
    .locals 7

    const-string v0, "merchantName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq20/w;->x:Ly00/o4;

    iget-object v0, v0, Ly00/o4;->E:Ly00/f4;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lq20/v;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 p2, 0x2

    if-eq v0, p2, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lm83/y;->w:Lm83/y;

    const v0, 0x7f1410e4

    invoke-static {v0, p1, p2}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    move v6, p2

    invoke-static/range {v0 .. v6}, Ls93/k;->b(Ljava/lang/String;Ljava/lang/String;ZZZZZ)Lzy/c;

    move-result-object p1

    return-object p1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lq20/w;->x:Ly00/o4;

    invoke-virtual {v0}, Ly00/o4;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    const/4 v1, 0x0

    iget-object v2, p0, Lq20/w;->y:Lq20/u;

    if-nez v2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lq20/w;->z:Ly00/u5;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Saved(paymentMethod="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lq20/w;->x:Ly00/o4;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", walletType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq20/w;->y:Lq20/u;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentMethodOptionsParams="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq20/w;->z:Ly00/u5;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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

    iget-object v0, p0, Lq20/w;->x:Ly00/o4;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lq20/w;->y:Lq20/u;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lq20/w;->z:Ly00/u5;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
