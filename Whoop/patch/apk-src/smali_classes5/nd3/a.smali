.class public final Lnd3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lnd3/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final x:[C


# instance fields
.field public w:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "0123456789ABCDEF"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Lnd3/a;->x:[C

    new-instance v0, Landroidx/fragment/app/q1;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Landroidx/fragment/app/q1;-><init>(I)V

    sput-object v0, Lnd3/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnd3/a;->w:[B

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lnd3/a;->w:[B

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    array-length v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-nez v2, :cond_1

    const-string v0, ""

    return-object v0

    :cond_1
    array-length v2, v0

    mul-int/lit8 v2, v2, 0x3

    add-int/lit8 v2, v2, -0x1

    new-array v2, v2, [C

    :goto_1
    array-length v3, v0

    if-ge v1, v3, :cond_3

    aget-byte v3, v0, v1

    and-int/lit16 v4, v3, 0xff

    mul-int/lit8 v5, v1, 0x3

    ushr-int/lit8 v4, v4, 0x4

    sget-object v6, Lnd3/a;->x:[C

    aget-char v4, v6, v4

    aput-char v4, v2, v5

    add-int/lit8 v4, v5, 0x1

    and-int/lit8 v3, v3, 0xf

    aget-char v3, v6, v3

    aput-char v3, v2, v4

    array-length v3, v0

    add-int/lit8 v3, v3, -0x1

    if-eq v1, v3, :cond_2

    add-int/lit8 v5, v5, 0x2

    const/16 v3, 0x2d

    aput-char v3, v2, v5

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>([C)V

    const-string v1, "(0x) "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-object p2, p0, Lnd3/a;->w:[B

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    return-void
.end method
