.class public final enum Lg40/v1;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lg40/w1;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lg40/v1;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum w:Lg40/v1;

.field public static final synthetic x:[Lg40/v1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lg40/v1;

    const-string v1, "Extras"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg40/v1;->w:Lg40/v1;

    filled-new-array {v0}, [Lg40/v1;

    move-result-object v0

    sput-object v0, Lg40/v1;->x:[Lg40/v1;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    new-instance v0, Lg40/i;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lg40/i;-><init>(I)V

    sput-object v0, Lg40/v1;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lg40/v1;
    .locals 1

    const-class v0, Lg40/v1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg40/v1;

    return-object p0
.end method

.method public static values()[Lg40/v1;
    .locals 1

    sget-object v0, Lg40/v1;->x:[Lg40/v1;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg40/v1;

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

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
