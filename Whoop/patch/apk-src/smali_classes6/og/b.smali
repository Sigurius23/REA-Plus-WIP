.class public final enum Log/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Log/b;

.field public static final synthetic F:[Log/b;

.field public static final enum w:Log/b;

.field public static final enum x:Log/b;

.field public static final enum y:Log/b;

.field public static final enum z:Log/b;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Log/b;

    const-string v1, "Error"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Log/b;->w:Log/b;

    new-instance v1, Log/b;

    const-string v2, "Warning"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Log/b;->x:Log/b;

    new-instance v2, Log/b;

    const-string v3, "Info"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Log/b;->y:Log/b;

    new-instance v3, Log/b;

    const-string v4, "Debug"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Log/b;->z:Log/b;

    new-instance v4, Log/b;

    const-string v5, "Trace"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, Log/b;->E:Log/b;

    filled-new-array {v0, v1, v2, v3, v4}, [Log/b;

    move-result-object v0

    sput-object v0, Log/b;->F:[Log/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Log/b;
    .locals 1

    const-class v0, Log/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Log/b;

    return-object p0
.end method

.method public static values()[Log/b;
    .locals 1

    sget-object v0, Log/b;->F:[Log/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Log/b;

    return-object v0
.end method
