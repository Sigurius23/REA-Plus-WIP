.class public final enum Li40/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Li40/i;

.field public static final enum x:Li40/i;

.field public static final enum y:Li40/i;

.field public static final synthetic z:[Li40/i;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Li40/i;

    const-string v1, "Focused"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li40/i;->w:Li40/i;

    new-instance v1, Li40/i;

    const-string v2, "UnfocusedEmpty"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Li40/i;->x:Li40/i;

    new-instance v2, Li40/i;

    const-string v3, "UnfocusedNotEmpty"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Li40/i;->y:Li40/i;

    filled-new-array {v0, v1, v2}, [Li40/i;

    move-result-object v0

    sput-object v0, Li40/i;->z:[Li40/i;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Li40/i;
    .locals 1

    const-class v0, Li40/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li40/i;

    return-object p0
.end method

.method public static values()[Li40/i;
    .locals 1

    sget-object v0, Li40/i;->z:[Li40/i;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li40/i;

    return-object v0
.end method
