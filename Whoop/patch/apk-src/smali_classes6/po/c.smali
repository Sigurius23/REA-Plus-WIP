.class public final Lpo/c;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lpo/c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:Z

.field public final x:[B

.field public final y:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpn/a;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lpn/a;-><init>(I)V

    sput-object v0, Lpo/c;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Z[BLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    invoke-static {p2}, Luo/w;->f(Ljava/lang/Object;)V

    invoke-static {p3}, Luo/w;->f(Ljava/lang/Object;)V

    :cond_0
    iput-boolean p1, p0, Lpo/c;->w:Z

    iput-object p2, p0, Lpo/c;->x:[B

    iput-object p3, p0, Lpo/c;->y:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpo/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpo/c;

    iget-boolean v1, p0, Lpo/c;->w:Z

    iget-boolean v3, p1, Lpo/c;->w:Z

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Lpo/c;->x:[B

    iget-object v3, p1, Lpo/c;->x:[B

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lpo/c;->y:Ljava/lang/String;

    iget-object p1, p1, Lpo/c;->y:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    iget-boolean v0, p0, Lpo/c;->w:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-object v1, p0, Lpo/c;->y:Ljava/lang/String;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpo/c;->x:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const/16 p2, 0x4f45

    invoke-static {p1, p2}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result p2

    const/4 v0, 0x4

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget-boolean v0, p0, Lpo/c;->w:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x2

    iget-object v1, p0, Lpo/c;->x:[B

    invoke-static {p1, v0, v1}, Lvo/c;->f(Landroid/os/Parcel;I[B)V

    const/4 v0, 0x3

    iget-object v1, p0, Lpo/c;->y:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    invoke-static {p1, p2}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
