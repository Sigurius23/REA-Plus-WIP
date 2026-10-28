.class public final Lgp/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lgp/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:Ljava/lang/Enum;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgp/k0;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lgp/k0;-><init>(I)V

    sput-object v0, Lgp/l;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lgp/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    check-cast p1, Ljava/lang/Enum;

    iput-object p1, p0, Lgp/l;->w:Ljava/lang/Enum;

    return-void
.end method

.method public static b(I)Lgp/l;
    .locals 7

    new-instance v0, Lgp/l;

    const/16 v1, -0x106

    if-ne p0, v1, :cond_0

    sget-object p0, Lgp/x;->x:Lgp/x;

    goto :goto_2

    :cond_0
    invoke-static {}, Lgp/x;->values()[Lgp/x;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_2

    aget-object v5, v1, v4

    iget v6, v5, Lgp/x;->w:I

    if-ne v6, p0, :cond_1

    move-object p0, v5

    goto :goto_2

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    invoke-static {}, Lgp/m;->values()[Lgp/m;

    move-result-object v1

    array-length v2, v1

    :goto_1
    if-ge v3, v2, :cond_4

    aget-object v4, v1, v3

    iget v5, v4, Lgp/m;->w:I

    if-ne v5, p0, :cond_3

    move-object p0, v4

    :goto_2
    invoke-direct {v0, p0}, Lgp/l;-><init>(Lgp/a;)V

    return-object v0

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException;

    const-string v1, "Algorithm with COSE value "

    const-string v2, " not supported"

    invoke-static {p0, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lgp/l;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Lgp/l;

    iget-object v0, p0, Lgp/l;->w:Ljava/lang/Enum;

    invoke-interface {v0}, Lgp/a;->a()I

    move-result v0

    iget-object p1, p1, Lgp/l;->w:Ljava/lang/Enum;

    invoke-interface {p1}, Lgp/a;->a()I

    move-result p1

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lgp/l;->w:Ljava/lang/Enum;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lgp/l;->w:Ljava/lang/Enum;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "COSEAlgorithmIdentifier{algorithm="

    const-string v2, "}"

    invoke-static {v1, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-object p2, p0, Lgp/l;->w:Ljava/lang/Enum;

    invoke-interface {p2}, Lgp/a;->a()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
