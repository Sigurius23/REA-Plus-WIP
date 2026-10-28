.class public final enum Lgp/n;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lgp/n;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum E:Lgp/n;

.field public static final enum F:Lgp/n;

.field public static final enum G:Lgp/n;

.field public static final enum H:Lgp/n;

.field public static final enum I:Lgp/n;

.field public static final enum J:Lgp/n;

.field public static final enum K:Lgp/n;

.field public static final enum L:Lgp/n;

.field public static final enum M:Lgp/n;

.field public static final synthetic N:[Lgp/n;

.field public static final enum x:Lgp/n;

.field public static final enum y:Lgp/n;

.field public static final enum z:Lgp/n;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Lgp/n;

    const-string v1, "NOT_SUPPORTED_ERR"

    const/4 v2, 0x0

    const/16 v3, 0x9

    invoke-direct {v0, v1, v2, v3}, Lgp/n;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lgp/n;->x:Lgp/n;

    new-instance v1, Lgp/n;

    const-string v2, "INVALID_STATE_ERR"

    const/4 v4, 0x1

    const/16 v5, 0xb

    invoke-direct {v1, v2, v4, v5}, Lgp/n;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lgp/n;->y:Lgp/n;

    new-instance v2, Lgp/n;

    const/4 v4, 0x2

    const/16 v6, 0x12

    const-string v7, "SECURITY_ERR"

    invoke-direct {v2, v7, v4, v6}, Lgp/n;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lgp/n;->z:Lgp/n;

    move v4, v3

    new-instance v3, Lgp/n;

    const/4 v6, 0x3

    const/16 v7, 0x13

    const-string v8, "NETWORK_ERR"

    invoke-direct {v3, v8, v6, v7}, Lgp/n;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lgp/n;->E:Lgp/n;

    move v6, v4

    new-instance v4, Lgp/n;

    const/4 v7, 0x4

    const/16 v8, 0x14

    const-string v9, "ABORT_ERR"

    invoke-direct {v4, v9, v7, v8}, Lgp/n;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lgp/n;->F:Lgp/n;

    move v7, v5

    new-instance v5, Lgp/n;

    const/4 v8, 0x5

    const/16 v9, 0x17

    const-string v10, "TIMEOUT_ERR"

    invoke-direct {v5, v10, v8, v9}, Lgp/n;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lgp/n;->G:Lgp/n;

    move v8, v6

    new-instance v6, Lgp/n;

    const/4 v9, 0x6

    const/16 v10, 0x1b

    const-string v11, "ENCODING_ERR"

    invoke-direct {v6, v11, v9, v10}, Lgp/n;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lgp/n;->H:Lgp/n;

    move v9, v7

    new-instance v7, Lgp/n;

    const/4 v10, 0x7

    const/16 v11, 0x1c

    const-string v12, "UNKNOWN_ERR"

    invoke-direct {v7, v12, v10, v11}, Lgp/n;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lgp/n;->I:Lgp/n;

    move v10, v8

    new-instance v8, Lgp/n;

    const/16 v11, 0x8

    const/16 v12, 0x1d

    const-string v13, "CONSTRAINT_ERR"

    invoke-direct {v8, v13, v11, v12}, Lgp/n;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lgp/n;->J:Lgp/n;

    move v11, v9

    new-instance v9, Lgp/n;

    const-string v12, "DATA_ERR"

    const/16 v13, 0x1e

    invoke-direct {v9, v12, v10, v13}, Lgp/n;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lgp/n;->K:Lgp/n;

    new-instance v10, Lgp/n;

    const/16 v12, 0xa

    const/16 v13, 0x23

    const-string v14, "NOT_ALLOWED_ERR"

    invoke-direct {v10, v14, v12, v13}, Lgp/n;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lgp/n;->L:Lgp/n;

    move v12, v11

    new-instance v11, Lgp/n;

    const-string v13, "ATTESTATION_NOT_PRIVATE_ERR"

    const/16 v14, 0x24

    invoke-direct {v11, v13, v12, v14}, Lgp/n;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lgp/n;->M:Lgp/n;

    filled-new-array/range {v0 .. v11}, [Lgp/n;

    move-result-object v0

    sput-object v0, Lgp/n;->N:[Lgp/n;

    new-instance v0, Lgp/k0;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lgp/k0;-><init>(I)V

    sput-object v0, Lgp/n;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lgp/n;->w:I

    return-void
.end method

.method public static b(I)Lgp/n;
    .locals 5

    invoke-static {}, Lgp/n;->values()[Lgp/n;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget v4, v3, Lgp/n;->w:I

    if-ne p0, v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/ErrorCode$UnsupportedErrorCodeException;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "Error code "

    const-string v2, " is not supported"

    invoke-static {p0, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lgp/n;
    .locals 1

    const-class v0, Lgp/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lgp/n;

    return-object p0
.end method

.method public static values()[Lgp/n;
    .locals 1

    sget-object v0, Lgp/n;->N:[Lgp/n;

    invoke-virtual {v0}, [Lgp/n;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgp/n;

    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget p2, p0, Lgp/n;->w:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
