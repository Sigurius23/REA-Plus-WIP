.class public final enum Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;",
        ">;"
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\r\u0008\u0087\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "IDLE",
        "INITIALIZED",
        "PREPARING",
        "PREPARED",
        "STARTED",
        "PAUSED",
        "STOPPED",
        "PLAYBACK_COMPLETED",
        "END",
        "ERROR",
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

.field private static final synthetic $VALUES:[Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

.field public static final enum END:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

.field public static final enum ERROR:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

.field public static final enum IDLE:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

.field public static final enum INITIALIZED:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

.field public static final enum PAUSED:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

.field public static final enum PLAYBACK_COMPLETED:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

.field public static final enum PREPARED:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

.field public static final enum PREPARING:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

.field public static final enum STARTED:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

.field public static final enum STOPPED:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;


# direct methods
.method private static final synthetic $values()[Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;
    .locals 10

    sget-object v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->IDLE:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    sget-object v1, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->INITIALIZED:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    sget-object v2, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->PREPARING:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    sget-object v3, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->PREPARED:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    sget-object v4, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->STARTED:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    sget-object v5, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->PAUSED:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    sget-object v6, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->STOPPED:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    sget-object v7, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->PLAYBACK_COMPLETED:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    sget-object v8, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->END:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    sget-object v9, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->ERROR:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    filled-new-array/range {v0 .. v9}, [Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    const-string v1, "IDLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->IDLE:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    new-instance v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    const-string v1, "INITIALIZED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->INITIALIZED:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    new-instance v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    const-string v1, "PREPARING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->PREPARING:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    new-instance v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    const-string v1, "PREPARED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->PREPARED:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    new-instance v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    const-string v1, "STARTED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->STARTED:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    new-instance v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    const-string v1, "PAUSED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->PAUSED:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    new-instance v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    const-string v1, "STOPPED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->STOPPED:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    new-instance v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    const-string v1, "PLAYBACK_COMPLETED"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->PLAYBACK_COMPLETED:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    new-instance v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    const-string v1, "END"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->END:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    new-instance v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    const-string v1, "ERROR"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->ERROR:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    invoke-static {}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->$values()[Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->$VALUES:[Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;
    .locals 1

    const-class v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    return-object p0
.end method

.method public static values()[Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->$VALUES:[Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    return-object v0
.end method
