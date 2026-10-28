.class public final enum Lwz/c0;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lwz/c0;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum w:Lwz/c0;

.field public static final enum x:Lwz/c0;

.field public static final enum y:Lwz/c0;

.field public static final synthetic z:[Lwz/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lwz/c0;

    const-string v1, "AUTOMATIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwz/c0;->w:Lwz/c0;

    new-instance v1, Lwz/c0;

    const-string v2, "ALWAYS_LIGHT"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lwz/c0;->x:Lwz/c0;

    new-instance v2, Lwz/c0;

    const-string v3, "ALWAYS_DARK"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lwz/c0;->y:Lwz/c0;

    filled-new-array {v0, v1, v2}, [Lwz/c0;

    move-result-object v0

    sput-object v0, Lwz/c0;->z:[Lwz/c0;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    new-instance v0, Lwx/f;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lwx/f;-><init>(I)V

    sput-object v0, Lwz/c0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lwz/c0;
    .locals 1

    const-class v0, Lwz/c0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lwz/c0;

    return-object p0
.end method

.method public static values()[Lwz/c0;
    .locals 1

    sget-object v0, Lwz/c0;->z:[Lwz/c0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lwz/c0;

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
