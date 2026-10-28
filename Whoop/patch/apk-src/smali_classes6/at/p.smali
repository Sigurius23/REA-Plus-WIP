.class public final enum Lat/p;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lat/p;

.field public static final enum x:Lat/p;

.field public static final enum y:Lat/p;

.field public static final synthetic z:[Lat/p;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lat/p;

    const-string v1, "NIST_P256"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lat/p;->w:Lat/p;

    new-instance v1, Lat/p;

    const-string v2, "NIST_P384"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lat/p;->x:Lat/p;

    new-instance v2, Lat/p;

    const-string v3, "NIST_P521"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lat/p;->y:Lat/p;

    filled-new-array {v0, v1, v2}, [Lat/p;

    move-result-object v0

    sput-object v0, Lat/p;->z:[Lat/p;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lat/p;
    .locals 1

    const-class v0, Lat/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lat/p;

    return-object p0
.end method

.method public static values()[Lat/p;
    .locals 1

    sget-object v0, Lat/p;->z:[Lat/p;

    invoke-virtual {v0}, [Lat/p;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lat/p;

    return-object v0
.end method
