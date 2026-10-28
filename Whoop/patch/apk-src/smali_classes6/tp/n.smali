.class public final Ltp/n;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ltp/n;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:Ljava/util/List;

.field public final x:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ltp/a0;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ltp/a0;-><init>(I)V

    sput-object v0, Ltp/n;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltp/n;->w:Ljava/util/List;

    iput p2, p0, Ltp/n;->x:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ltp/n;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ltp/n;

    iget-object v1, p0, Ltp/n;->w:Ljava/util/List;

    iget-object v3, p1, Ltp/n;->w:Ljava/util/List;

    invoke-static {v1, v3}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Ltp/n;->x:I

    iget p1, p1, Ltp/n;->x:I

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Ltp/n;->x:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Ltp/n;->w:Ljava/util/List;

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-static {p1}, Luo/w;->f(Ljava/lang/Object;)V

    const/16 p2, 0x4f45

    invoke-static {p1, p2}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result p2

    const/4 v0, 0x1

    iget-object v1, p0, Ltp/n;->w:Ljava/util/List;

    invoke-static {p1, v0, v1}, Lvo/c;->q(Landroid/os/Parcel;ILjava/util/List;)V

    const/4 v0, 0x4

    const/4 v1, 0x2

    invoke-static {p1, v1, v0}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget v0, p0, Ltp/n;->x:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {p1, p2}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
