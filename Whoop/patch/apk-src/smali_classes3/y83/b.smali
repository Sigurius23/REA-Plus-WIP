.class public final enum Ly83/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic E:[Ly83/b;

.field public static final enum w:Ly83/b;

.field public static final enum x:Ly83/b;

.field public static final enum y:Ly83/b;

.field public static final enum z:Ly83/b;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Ly83/b;

    const-string v1, "PRESENT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly83/b;->w:Ly83/b;

    new-instance v1, Ly83/b;

    const-string v2, "ABSENT"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ly83/b;->x:Ly83/b;

    new-instance v2, Ly83/b;

    const-string v3, "PRESENT_OPTIONAL"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Ly83/b;->y:Ly83/b;

    new-instance v3, Ly83/b;

    const-string v4, "ABSENT_OPTIONAL"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ly83/b;->z:Ly83/b;

    filled-new-array {v0, v1, v2, v3}, [Ly83/b;

    move-result-object v0

    sput-object v0, Ly83/b;->E:[Ly83/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ly83/b;
    .locals 1

    const-class v0, Ly83/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly83/b;

    return-object p0
.end method

.method public static values()[Ly83/b;
    .locals 1

    sget-object v0, Ly83/b;->E:[Ly83/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly83/b;

    return-object v0
.end method
