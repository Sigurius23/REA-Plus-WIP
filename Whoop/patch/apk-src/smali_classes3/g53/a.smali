.class public final enum Lg53/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lg53/a;

.field public static final enum x:Lg53/a;

.field public static final synthetic y:[Lg53/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lg53/a;

    const-string v1, "LIFECYCLE_RESUME"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg53/a;->w:Lg53/a;

    new-instance v1, Lg53/a;

    const-string v2, "NETWORK_AVAILABLE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lg53/a;->x:Lg53/a;

    filled-new-array {v0, v1}, [Lg53/a;

    move-result-object v0

    sput-object v0, Lg53/a;->y:[Lg53/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lg53/a;
    .locals 1

    const-class v0, Lg53/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg53/a;

    return-object p0
.end method

.method public static values()[Lg53/a;
    .locals 1

    sget-object v0, Lg53/a;->y:[Lg53/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg53/a;

    return-object v0
.end method
