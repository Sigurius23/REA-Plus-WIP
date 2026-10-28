.class public final enum Lgj/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lgj/e;

.field public static final synthetic F:[Lgj/e;

.field public static final enum w:Lgj/e;

.field public static final enum x:Lgj/e;

.field public static final enum y:Lgj/e;

.field public static final enum z:Lgj/e;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lgj/e;

    const-string v1, "SESSIONS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgj/e;->w:Lgj/e;

    new-instance v1, Lgj/e;

    const-string v2, "APP_LIFECYCLES"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lgj/e;->x:Lgj/e;

    new-instance v2, Lgj/e;

    const-string v3, "DEEP_LINKS"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lgj/e;->y:Lgj/e;

    new-instance v3, Lgj/e;

    const-string v4, "SCREEN_VIEWS"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lgj/e;->z:Lgj/e;

    new-instance v4, Lgj/e;

    const-string v5, "ELEMENT_INTERACTIONS"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lgj/e;->E:Lgj/e;

    filled-new-array {v0, v1, v2, v3, v4}, [Lgj/e;

    move-result-object v0

    sput-object v0, Lgj/e;->F:[Lgj/e;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lgj/e;
    .locals 1

    const-class v0, Lgj/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lgj/e;

    return-object p0
.end method

.method public static values()[Lgj/e;
    .locals 1

    sget-object v0, Lgj/e;->F:[Lgj/e;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgj/e;

    return-object v0
.end method
