.class public final enum Lkb3/j;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lkb3/j;

.field public static final enum x:Lkb3/j;

.field public static final enum y:Lkb3/j;

.field public static final synthetic z:[Lkb3/j;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkb3/j;

    const-string v1, "NOT_COMPUTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkb3/j;->w:Lkb3/j;

    new-instance v1, Lkb3/j;

    const-string v2, "COMPUTING"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkb3/j;->x:Lkb3/j;

    new-instance v2, Lkb3/j;

    const-string v3, "RECURSION_WAS_DETECTED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lkb3/j;->y:Lkb3/j;

    filled-new-array {v0, v1, v2}, [Lkb3/j;

    move-result-object v0

    sput-object v0, Lkb3/j;->z:[Lkb3/j;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lkb3/j;
    .locals 1

    const-class v0, Lkb3/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkb3/j;

    return-object p0
.end method

.method public static values()[Lkb3/j;
    .locals 1

    sget-object v0, Lkb3/j;->z:[Lkb3/j;

    invoke-virtual {v0}, [Lkb3/j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkb3/j;

    return-object v0
.end method
