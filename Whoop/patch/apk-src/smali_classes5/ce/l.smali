.class public final enum Lce/l;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic E:[Lce/l;

.field public static final enum w:Lce/l;

.field public static final enum x:Lce/l;

.field public static final enum y:Lce/l;

.field public static final enum z:Lce/l;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lce/l;

    const-string v1, "PROFILE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lce/l;->w:Lce/l;

    new-instance v1, Lce/l;

    const-string v2, "SSO_SESSION"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lce/l;->x:Lce/l;

    new-instance v2, Lce/l;

    const-string v3, "SERVICES"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lce/l;->y:Lce/l;

    new-instance v3, Lce/l;

    const-string v4, "UNKNOWN"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lce/l;->z:Lce/l;

    filled-new-array {v0, v1, v2, v3}, [Lce/l;

    move-result-object v0

    sput-object v0, Lce/l;->E:[Lce/l;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lce/l;
    .locals 1

    const-class v0, Lce/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lce/l;

    return-object p0
.end method

.method public static values()[Lce/l;
    .locals 1

    sget-object v0, Lce/l;->E:[Lce/l;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lce/l;

    return-object v0
.end method
