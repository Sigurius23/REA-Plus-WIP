.class public final enum Llg3/u;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Llg3/u;

.field public static final enum x:Llg3/u;

.field public static final enum y:Llg3/u;

.field public static final synthetic z:[Llg3/u;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Llg3/u;

    const-string v1, "STRICT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg3/u;->w:Llg3/u;

    new-instance v1, Llg3/u;

    const-string v2, "SMART"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Llg3/u;->x:Llg3/u;

    new-instance v2, Llg3/u;

    const-string v3, "LENIENT"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Llg3/u;->y:Llg3/u;

    filled-new-array {v0, v1, v2}, [Llg3/u;

    move-result-object v0

    sput-object v0, Llg3/u;->z:[Llg3/u;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Llg3/u;
    .locals 1

    const-class v0, Llg3/u;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llg3/u;

    return-object p0
.end method

.method public static values()[Llg3/u;
    .locals 1

    sget-object v0, Llg3/u;->z:[Llg3/u;

    invoke-virtual {v0}, [Llg3/u;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llg3/u;

    return-object v0
.end method
