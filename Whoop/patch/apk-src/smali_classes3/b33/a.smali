.class public final enum Lb33/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lb33/a;

.field public static final enum F:Lb33/a;

.field public static final synthetic G:[Lb33/a;

.field public static final enum w:Lb33/a;

.field public static final enum x:Lb33/a;

.field public static final enum y:Lb33/a;

.field public static final enum z:Lb33/a;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lb33/a;

    const-string v1, "CLIENT_ABORTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb33/a;->w:Lb33/a;

    new-instance v1, Lb33/a;

    const-string v2, "BACKEND_LEAVE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lb33/a;->x:Lb33/a;

    new-instance v2, Lb33/a;

    const-string v3, "NETWORK_OFFLINE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lb33/a;->y:Lb33/a;

    new-instance v3, Lb33/a;

    const-string v4, "RETRY_EXHAUSTED"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lb33/a;->z:Lb33/a;

    new-instance v4, Lb33/a;

    const-string v5, "SDK_DRIVEN_ANDROID"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lb33/a;->E:Lb33/a;

    new-instance v5, Lb33/a;

    const-string v6, "REQUEST_TIMEOUT"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v6, Lb33/a;

    const-string v7, "SFU_ERROR"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v7, Lb33/a;

    const-string v8, "SERVER_ERROR"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v8, Lb33/a;

    const-string v9, "CUSTOM"

    const/16 v10, 0x8

    invoke-direct {v8, v9, v10}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v8, Lb33/a;->F:Lb33/a;

    filled-new-array/range {v0 .. v8}, [Lb33/a;

    move-result-object v0

    sput-object v0, Lb33/a;->G:[Lb33/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb33/a;
    .locals 1

    const-class v0, Lb33/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb33/a;

    return-object p0
.end method

.method public static values()[Lb33/a;
    .locals 1

    sget-object v0, Lb33/a;->G:[Lb33/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb33/a;

    return-object v0
.end method
