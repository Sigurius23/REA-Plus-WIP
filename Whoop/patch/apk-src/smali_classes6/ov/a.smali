.class public final enum Lov/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic E:[Lov/a;

.field public static final enum w:Lov/a;

.field public static final enum x:Lov/a;

.field public static final enum y:Lov/a;

.field public static final enum z:Lov/a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lov/a;

    const-string v1, "DoubleTap"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lov/a;->w:Lov/a;

    new-instance v1, Lov/a;

    const-string v2, "Scale"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lov/a;->x:Lov/a;

    new-instance v2, Lov/a;

    const-string v3, "ScaleQuickZoom"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lov/a;->y:Lov/a;

    new-instance v3, Lov/a;

    const-string v4, "Shove"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lov/a;->z:Lov/a;

    filled-new-array {v0, v1, v2, v3}, [Lov/a;

    move-result-object v0

    sput-object v0, Lov/a;->E:[Lov/a;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lov/a;
    .locals 1

    const-class v0, Lov/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lov/a;

    return-object p0
.end method

.method public static values()[Lov/a;
    .locals 1

    sget-object v0, Lov/a;->E:[Lov/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lov/a;

    return-object v0
.end method
