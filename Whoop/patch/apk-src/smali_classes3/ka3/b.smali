.class public final enum Lka3/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lka3/b;

.field public static final enum x:Lka3/b;

.field public static final enum y:Lka3/b;

.field public static final synthetic z:[Lka3/b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lka3/b;

    const-string v1, "INFLEXIBLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lka3/b;->w:Lka3/b;

    new-instance v1, Lka3/b;

    const-string v2, "FLEXIBLE_UPPER_BOUND"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lka3/b;->x:Lka3/b;

    new-instance v2, Lka3/b;

    const-string v3, "FLEXIBLE_LOWER_BOUND"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lka3/b;->y:Lka3/b;

    filled-new-array {v0, v1, v2}, [Lka3/b;

    move-result-object v0

    sput-object v0, Lka3/b;->z:[Lka3/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lka3/b;
    .locals 1

    const-class v0, Lka3/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lka3/b;

    return-object p0
.end method

.method public static values()[Lka3/b;
    .locals 1

    sget-object v0, Lka3/b;->z:[Lka3/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lka3/b;

    return-object v0
.end method
