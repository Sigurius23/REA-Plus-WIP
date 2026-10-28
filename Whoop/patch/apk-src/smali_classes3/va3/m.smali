.class public final enum Lva3/m;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lva3/m;

.field public static final enum x:Lva3/m;

.field public static final enum y:Lva3/m;

.field public static final synthetic z:[Lva3/m;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lva3/m;

    const-string v1, "BEGINNING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lva3/m;->w:Lva3/m;

    new-instance v1, Lva3/m;

    const-string v2, "MIDDLE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lva3/m;->x:Lva3/m;

    new-instance v2, Lva3/m;

    const-string v3, "AFTER_DOT"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lva3/m;->y:Lva3/m;

    filled-new-array {v0, v1, v2}, [Lva3/m;

    move-result-object v0

    sput-object v0, Lva3/m;->z:[Lva3/m;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lva3/m;
    .locals 1

    const-class v0, Lva3/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lva3/m;

    return-object p0
.end method

.method public static values()[Lva3/m;
    .locals 1

    sget-object v0, Lva3/m;->z:[Lva3/m;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lva3/m;

    return-object v0
.end method
