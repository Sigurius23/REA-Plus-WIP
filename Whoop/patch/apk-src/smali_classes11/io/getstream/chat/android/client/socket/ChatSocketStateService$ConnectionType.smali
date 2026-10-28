.class public final enum Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/socket/ChatSocketStateService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ConnectionType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "INITIAL_CONNECTION",
        "AUTOMATIC_RECONNECTION",
        "FORCE_RECONNECTION",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

.field public static final enum AUTOMATIC_RECONNECTION:Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

.field public static final enum FORCE_RECONNECTION:Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

.field public static final enum INITIAL_CONNECTION:Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;


# direct methods
.method private static final synthetic $values()[Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;
    .locals 3

    sget-object v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;->INITIAL_CONNECTION:Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    sget-object v1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;->AUTOMATIC_RECONNECTION:Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    sget-object v2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;->FORCE_RECONNECTION:Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    filled-new-array {v0, v1, v2}, [Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    const-string v1, "INITIAL_CONNECTION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;->INITIAL_CONNECTION:Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    new-instance v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    const-string v1, "AUTOMATIC_RECONNECTION"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;->AUTOMATIC_RECONNECTION:Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    new-instance v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    const-string v1, "FORCE_RECONNECTION"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;->FORCE_RECONNECTION:Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    invoke-static {}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;->$values()[Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;->$VALUES:[Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;->$ENTRIES:Lt83/a;

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

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;
    .locals 1

    const-class v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    return-object p0
.end method

.method public static values()[Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;->$VALUES:[Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    return-object v0
.end method
