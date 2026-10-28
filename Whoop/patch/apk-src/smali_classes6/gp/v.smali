.class public final enum Lgp/v;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lgp/v;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic w:[Lgp/v;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lgp/v;

    const-string v1, "PUBLIC_KEY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    filled-new-array {v0}, [Lgp/v;

    move-result-object v0

    sput-object v0, Lgp/v;->w:[Lgp/v;

    new-instance v0, Lgp/k0;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lgp/k0;-><init>(I)V

    sput-object v0, Lgp/v;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public static b(Ljava/lang/String;)Lgp/v;
    .locals 5

    invoke-static {}, Lgp/v;->values()[Lgp/v;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "public-key"

    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException;

    const-string v1, "PublicKeyCredentialType "

    const-string v2, " not supported"

    invoke-static {v1, p0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lgp/v;
    .locals 1

    const-class v0, Lgp/v;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lgp/v;

    return-object p0
.end method

.method public static values()[Lgp/v;
    .locals 1

    sget-object v0, Lgp/v;->w:[Lgp/v;

    invoke-virtual {v0}, [Lgp/v;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgp/v;

    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "public-key"

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "public-key"

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
