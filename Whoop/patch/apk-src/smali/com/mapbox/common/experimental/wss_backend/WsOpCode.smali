.class public final enum Lcom/mapbox/common/experimental/wss_backend/WsOpCode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/mapbox/common/experimental/wss_backend/WsOpCode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/mapbox/common/experimental/wss_backend/WsOpCode;

.field public static final enum BINARY:Lcom/mapbox/common/experimental/wss_backend/WsOpCode;

.field public static final enum CLOSE:Lcom/mapbox/common/experimental/wss_backend/WsOpCode;

.field public static final enum CONTINUATION:Lcom/mapbox/common/experimental/wss_backend/WsOpCode;

.field public static final enum PING:Lcom/mapbox/common/experimental/wss_backend/WsOpCode;

.field public static final enum PONG:Lcom/mapbox/common/experimental/wss_backend/WsOpCode;

.field public static final enum TEXT:Lcom/mapbox/common/experimental/wss_backend/WsOpCode;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/mapbox/common/experimental/wss_backend/WsOpCode;

    const-string v1, "TEXT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/mapbox/common/experimental/wss_backend/WsOpCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mapbox/common/experimental/wss_backend/WsOpCode;->TEXT:Lcom/mapbox/common/experimental/wss_backend/WsOpCode;

    new-instance v1, Lcom/mapbox/common/experimental/wss_backend/WsOpCode;

    const-string v2, "BINARY"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/mapbox/common/experimental/wss_backend/WsOpCode;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/mapbox/common/experimental/wss_backend/WsOpCode;->BINARY:Lcom/mapbox/common/experimental/wss_backend/WsOpCode;

    new-instance v2, Lcom/mapbox/common/experimental/wss_backend/WsOpCode;

    const-string v3, "CONTINUATION"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/mapbox/common/experimental/wss_backend/WsOpCode;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/mapbox/common/experimental/wss_backend/WsOpCode;->CONTINUATION:Lcom/mapbox/common/experimental/wss_backend/WsOpCode;

    new-instance v3, Lcom/mapbox/common/experimental/wss_backend/WsOpCode;

    const-string v4, "CLOSE"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lcom/mapbox/common/experimental/wss_backend/WsOpCode;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/mapbox/common/experimental/wss_backend/WsOpCode;->CLOSE:Lcom/mapbox/common/experimental/wss_backend/WsOpCode;

    new-instance v4, Lcom/mapbox/common/experimental/wss_backend/WsOpCode;

    const-string v5, "PING"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Lcom/mapbox/common/experimental/wss_backend/WsOpCode;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lcom/mapbox/common/experimental/wss_backend/WsOpCode;->PING:Lcom/mapbox/common/experimental/wss_backend/WsOpCode;

    new-instance v5, Lcom/mapbox/common/experimental/wss_backend/WsOpCode;

    const-string v6, "PONG"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Lcom/mapbox/common/experimental/wss_backend/WsOpCode;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/mapbox/common/experimental/wss_backend/WsOpCode;->PONG:Lcom/mapbox/common/experimental/wss_backend/WsOpCode;

    filled-new-array/range {v0 .. v5}, [Lcom/mapbox/common/experimental/wss_backend/WsOpCode;

    move-result-object v0

    sput-object v0, Lcom/mapbox/common/experimental/wss_backend/WsOpCode;->$VALUES:[Lcom/mapbox/common/experimental/wss_backend/WsOpCode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private getValue()I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mapbox/common/experimental/wss_backend/WsOpCode;
    .locals 1

    const-class v0, Lcom/mapbox/common/experimental/wss_backend/WsOpCode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/mapbox/common/experimental/wss_backend/WsOpCode;

    return-object p0
.end method

.method public static values()[Lcom/mapbox/common/experimental/wss_backend/WsOpCode;
    .locals 1

    sget-object v0, Lcom/mapbox/common/experimental/wss_backend/WsOpCode;->$VALUES:[Lcom/mapbox/common/experimental/wss_backend/WsOpCode;

    invoke-virtual {v0}, [Lcom/mapbox/common/experimental/wss_backend/WsOpCode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mapbox/common/experimental/wss_backend/WsOpCode;

    return-object v0
.end method
