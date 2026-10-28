.class public final enum Lmf/p;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lmf/p;

.field public static final synthetic F:[Lmf/p;

.field public static final enum w:Lmf/p;

.field public static final enum x:Lmf/p;

.field public static final enum y:Lmf/p;

.field public static final enum z:Lmf/p;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lmf/p;

    const-string v1, "CONNECT_TIMEOUT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmf/p;->w:Lmf/p;

    new-instance v1, Lmf/p;

    const-string v2, "CONNECTION_ACQUIRE_TIMEOUT"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v2, Lmf/p;

    const-string v3, "TLS_NEGOTIATION_TIMEOUT"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v3, Lmf/p;

    const-string v4, "TLS_NEGOTIATION_ERROR"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lmf/p;->x:Lmf/p;

    new-instance v4, Lmf/p;

    const-string v5, "CONNECTION_CLOSED"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lmf/p;->y:Lmf/p;

    new-instance v5, Lmf/p;

    const-string v6, "SOCKET_TIMEOUT"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lmf/p;->z:Lmf/p;

    new-instance v6, Lmf/p;

    const-string v7, "PROTOCOL_NEGOTIATION_ERROR"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v7, Lmf/p;

    const-string v8, "SDK_UNKNOWN"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lmf/p;->E:Lmf/p;

    filled-new-array/range {v0 .. v7}, [Lmf/p;

    move-result-object v0

    sput-object v0, Lmf/p;->F:[Lmf/p;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lmf/p;
    .locals 1

    const-class v0, Lmf/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmf/p;

    return-object p0
.end method

.method public static values()[Lmf/p;
    .locals 1

    sget-object v0, Lmf/p;->F:[Lmf/p;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmf/p;

    return-object v0
.end method
