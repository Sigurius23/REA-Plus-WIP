.class public final enum Ly00/h4;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lvy/b;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ly00/h4;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum x:Ly00/h4;

.field public static final synthetic y:[Ly00/h4;

.field public static final synthetic z:Lt83/b;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Ly00/h4;

    const/4 v1, 0x0

    const-string v2, "unknown"

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Ly00/h4;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly00/h4;->x:Ly00/h4;

    new-instance v1, Ly00/h4;

    const/4 v2, 0x1

    const-string v3, "individual"

    const-string v4, "INDIVIDUAL"

    invoke-direct {v1, v4, v2, v3}, Ly00/h4;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v2, Ly00/h4;

    const/4 v3, 0x2

    const-string v4, "company"

    const-string v5, "COMPANY"

    invoke-direct {v2, v5, v3, v4}, Ly00/h4;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    filled-new-array {v0, v1, v2}, [Ly00/h4;

    move-result-object v0

    sput-object v0, Ly00/h4;->y:[Ly00/h4;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ly00/h4;->z:Lt83/b;

    new-instance v0, Ly00/u2;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Ly00/u2;-><init>(I)V

    sput-object v0, Ly00/h4;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ly00/h4;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ly00/h4;
    .locals 1

    const-class v0, Ly00/h4;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly00/h4;

    return-object p0
.end method

.method public static values()[Ly00/h4;
    .locals 1

    sget-object v0, Ly00/h4;->y:[Ly00/h4;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly00/h4;

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
