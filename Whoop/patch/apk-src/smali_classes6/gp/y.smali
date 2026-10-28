.class public final enum Lgp/y;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lgp/y;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum x:Lgp/y;

.field public static final synthetic y:[Lgp/y;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lgp/y;

    const-string v1, "RESIDENT_KEY_DISCOURAGED"

    const/4 v2, 0x0

    const-string v3, "discouraged"

    invoke-direct {v0, v1, v2, v3}, Lgp/y;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Lgp/y;

    const-string v2, "RESIDENT_KEY_PREFERRED"

    const/4 v3, 0x1

    const-string v4, "preferred"

    invoke-direct {v1, v2, v3, v4}, Lgp/y;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v2, Lgp/y;

    const-string v3, "RESIDENT_KEY_REQUIRED"

    const/4 v4, 0x2

    const-string v5, "required"

    invoke-direct {v2, v3, v4, v5}, Lgp/y;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lgp/y;->x:Lgp/y;

    filled-new-array {v0, v1, v2}, [Lgp/y;

    move-result-object v0

    sput-object v0, Lgp/y;->y:[Lgp/y;

    new-instance v0, Lgp/k0;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lgp/k0;-><init>(I)V

    sput-object v0, Lgp/y;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lgp/y;->w:Ljava/lang/String;

    return-void
.end method

.method public static b(Ljava/lang/String;)Lgp/y;
    .locals 5

    invoke-static {}, Lgp/y;->values()[Lgp/y;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget-object v4, v3, Lgp/y;->w:Ljava/lang/String;

    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/ResidentKeyRequirement$UnsupportedResidentKeyRequirementException;

    const-string v1, "Resident key requirement "

    const-string v2, " not supported"

    invoke-static {v1, p0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lgp/y;
    .locals 1

    const-class v0, Lgp/y;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lgp/y;

    return-object p0
.end method

.method public static values()[Lgp/y;
    .locals 1

    sget-object v0, Lgp/y;->y:[Lgp/y;

    invoke-virtual {v0}, [Lgp/y;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgp/y;

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

    iget-object v0, p0, Lgp/y;->w:Ljava/lang/String;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-object p2, p0, Lgp/y;->w:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
