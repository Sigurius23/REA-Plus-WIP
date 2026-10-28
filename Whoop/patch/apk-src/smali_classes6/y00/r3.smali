.class public final enum Ly00/r3;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lvy/b;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ly00/r3;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic E:[Ly00/r3;

.field public static final synthetic F:Lt83/b;

.field public static final enum x:Ly00/r3;

.field public static final enum y:Ly00/r3;

.field public static final enum z:Ly00/r3;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Ly00/r3;

    const/4 v1, 0x0

    const-string v2, "unspecified"

    const-string v3, "UNSPECIFIED"

    invoke-direct {v0, v3, v1, v2}, Ly00/r3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly00/r3;->x:Ly00/r3;

    new-instance v1, Ly00/r3;

    const/4 v2, 0x1

    const-string v3, "limited"

    const-string v4, "LIMITED"

    invoke-direct {v1, v4, v2, v3}, Ly00/r3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Ly00/r3;->y:Ly00/r3;

    new-instance v2, Ly00/r3;

    const/4 v3, 0x2

    const-string v4, "always"

    const-string v5, "ALWAYS"

    invoke-direct {v2, v5, v3, v4}, Ly00/r3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Ly00/r3;->z:Ly00/r3;

    filled-new-array {v0, v1, v2}, [Ly00/r3;

    move-result-object v0

    sput-object v0, Ly00/r3;->E:[Ly00/r3;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ly00/r3;->F:Lt83/b;

    new-instance v0, Ly00/u2;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Ly00/u2;-><init>(I)V

    sput-object v0, Ly00/r3;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ly00/r3;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ly00/r3;
    .locals 1

    const-class v0, Ly00/r3;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly00/r3;

    return-object p0
.end method

.method public static values()[Ly00/r3;
    .locals 1

    sget-object v0, Ly00/r3;->E:[Ly00/r3;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly00/r3;

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
