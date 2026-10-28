.class public final enum Lu30/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lu30/b;

.field public static final enum x:Lu30/b;

.field public static final enum y:Lu30/b;

.field public static final synthetic z:[Lu30/b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lu30/b;

    const-string v1, "Automatic"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lu30/b;->w:Lu30/b;

    new-instance v1, Lu30/b;

    const-string v2, "Never"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lu30/b;->x:Lu30/b;

    new-instance v2, Lu30/b;

    const-string v3, "Full"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lu30/b;->y:Lu30/b;

    filled-new-array {v0, v1, v2}, [Lu30/b;

    move-result-object v0

    sput-object v0, Lu30/b;->z:[Lu30/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lu30/b;
    .locals 1

    const-class v0, Lu30/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lu30/b;

    return-object p0
.end method

.method public static values()[Lu30/b;
    .locals 1

    sget-object v0, Lu30/b;->z:[Lu30/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lu30/b;

    return-object v0
.end method
