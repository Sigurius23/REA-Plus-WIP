.class public final enum Lna3/p;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lna3/p;

.field public static final enum x:Lna3/p;

.field public static final enum y:Lna3/p;

.field public static final synthetic z:[Lna3/p;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lna3/p;

    const-string v1, "FLEXIBLE_LOWER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lna3/p;->w:Lna3/p;

    new-instance v1, Lna3/p;

    const-string v2, "FLEXIBLE_UPPER"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lna3/p;->x:Lna3/p;

    new-instance v2, Lna3/p;

    const-string v3, "INFLEXIBLE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lna3/p;->y:Lna3/p;

    filled-new-array {v0, v1, v2}, [Lna3/p;

    move-result-object v0

    sput-object v0, Lna3/p;->z:[Lna3/p;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lna3/p;
    .locals 1

    const-class v0, Lna3/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lna3/p;

    return-object p0
.end method

.method public static values()[Lna3/p;
    .locals 1

    sget-object v0, Lna3/p;->z:[Lna3/p;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lna3/p;

    return-object v0
.end method
