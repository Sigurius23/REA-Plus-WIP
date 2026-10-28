.class public final enum Ljz/a;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lvy/b;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ljz/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic E:[Ljz/a;

.field public static final enum x:Ljz/a;

.field public static final enum y:Ljz/a;

.field public static final enum z:Ljz/a;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Ljz/a;

    const/4 v1, 0x0

    const-string v2, "unspecified"

    const-string v3, "Unspecified"

    invoke-direct {v0, v3, v1, v2}, Ljz/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ljz/a;->x:Ljz/a;

    new-instance v1, Ljz/a;

    const/4 v2, 0x1

    const-string v3, "limited"

    const-string v4, "Limited"

    invoke-direct {v1, v4, v2, v3}, Ljz/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Ljz/a;->y:Ljz/a;

    new-instance v2, Ljz/a;

    const/4 v3, 0x2

    const-string v4, "always"

    const-string v5, "Always"

    invoke-direct {v2, v5, v3, v4}, Ljz/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Ljz/a;->z:Ljz/a;

    filled-new-array {v0, v1, v2}, [Ljz/a;

    move-result-object v0

    sput-object v0, Ljz/a;->E:[Ljz/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    new-instance v0, Lgp/r0;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lgp/r0;-><init>(I)V

    sput-object v0, Ljz/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ljz/a;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ljz/a;
    .locals 1

    const-class v0, Ljz/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljz/a;

    return-object p0
.end method

.method public static values()[Ljz/a;
    .locals 1

    sget-object v0, Ljz/a;->E:[Ljz/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljz/a;

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
