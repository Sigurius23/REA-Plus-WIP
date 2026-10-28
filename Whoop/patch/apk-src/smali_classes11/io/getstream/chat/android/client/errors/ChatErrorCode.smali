.class public final enum Lio/getstream/chat/android/client/errors/ChatErrorCode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/errors/ChatErrorCode$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/getstream/chat/android/client/errors/ChatErrorCode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u001a\u0008\u0086\u0081\u0002\u0018\u0000 \u001e2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001eB\u0019\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lio/getstream/chat/android/client/errors/ChatErrorCode;",
        "",
        "code",
        "",
        "description",
        "",
        "<init>",
        "(Ljava/lang/String;IILjava/lang/String;)V",
        "getCode",
        "()I",
        "getDescription",
        "()Ljava/lang/String;",
        "NETWORK_FAILED",
        "PARSER_ERROR",
        "SOCKET_CLOSED",
        "SOCKET_FAILURE",
        "CANT_PARSE_CONNECTION_EVENT",
        "CANT_PARSE_EVENT",
        "INVALID_TOKEN",
        "UNDEFINED_TOKEN",
        "UNABLE_TO_PARSE_SOCKET_EVENT",
        "NO_ERROR_BODY",
        "VALIDATION_ERROR",
        "AUTHENTICATION_ERROR",
        "DUPLICATE_USERNAME_ERROR",
        "TOKEN_EXPIRED",
        "TOKEN_NOT_VALID",
        "TOKEN_DATE_INCORRECT",
        "TOKEN_SIGNATURE_INCORRECT",
        "API_KEY_NOT_FOUND",
        "Companion",
        "stream-chat-android-core"
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

.field private static final synthetic $VALUES:[Lio/getstream/chat/android/client/errors/ChatErrorCode;

.field public static final enum API_KEY_NOT_FOUND:Lio/getstream/chat/android/client/errors/ChatErrorCode;

.field public static final enum AUTHENTICATION_ERROR:Lio/getstream/chat/android/client/errors/ChatErrorCode;

.field public static final enum CANT_PARSE_CONNECTION_EVENT:Lio/getstream/chat/android/client/errors/ChatErrorCode;

.field public static final enum CANT_PARSE_EVENT:Lio/getstream/chat/android/client/errors/ChatErrorCode;

.field public static final Companion:Lio/getstream/chat/android/client/errors/ChatErrorCode$Companion;

.field public static final enum DUPLICATE_USERNAME_ERROR:Lio/getstream/chat/android/client/errors/ChatErrorCode;

.field public static final enum INVALID_TOKEN:Lio/getstream/chat/android/client/errors/ChatErrorCode;

.field public static final enum NETWORK_FAILED:Lio/getstream/chat/android/client/errors/ChatErrorCode;

.field public static final enum NO_ERROR_BODY:Lio/getstream/chat/android/client/errors/ChatErrorCode;

.field public static final enum PARSER_ERROR:Lio/getstream/chat/android/client/errors/ChatErrorCode;

.field public static final enum SOCKET_CLOSED:Lio/getstream/chat/android/client/errors/ChatErrorCode;

.field public static final enum SOCKET_FAILURE:Lio/getstream/chat/android/client/errors/ChatErrorCode;

.field public static final enum TOKEN_DATE_INCORRECT:Lio/getstream/chat/android/client/errors/ChatErrorCode;

.field public static final enum TOKEN_EXPIRED:Lio/getstream/chat/android/client/errors/ChatErrorCode;

.field public static final enum TOKEN_NOT_VALID:Lio/getstream/chat/android/client/errors/ChatErrorCode;

.field public static final enum TOKEN_SIGNATURE_INCORRECT:Lio/getstream/chat/android/client/errors/ChatErrorCode;

.field public static final enum UNABLE_TO_PARSE_SOCKET_EVENT:Lio/getstream/chat/android/client/errors/ChatErrorCode;

.field public static final enum UNDEFINED_TOKEN:Lio/getstream/chat/android/client/errors/ChatErrorCode;

.field public static final enum VALIDATION_ERROR:Lio/getstream/chat/android/client/errors/ChatErrorCode;

.field private static final authenticationErrors:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final code:I

.field private final description:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lio/getstream/chat/android/client/errors/ChatErrorCode;
    .locals 19

    sget-object v1, Lio/getstream/chat/android/client/errors/ChatErrorCode;->NETWORK_FAILED:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    sget-object v2, Lio/getstream/chat/android/client/errors/ChatErrorCode;->PARSER_ERROR:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    sget-object v3, Lio/getstream/chat/android/client/errors/ChatErrorCode;->SOCKET_CLOSED:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    sget-object v4, Lio/getstream/chat/android/client/errors/ChatErrorCode;->SOCKET_FAILURE:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    sget-object v5, Lio/getstream/chat/android/client/errors/ChatErrorCode;->CANT_PARSE_CONNECTION_EVENT:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    sget-object v6, Lio/getstream/chat/android/client/errors/ChatErrorCode;->CANT_PARSE_EVENT:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    sget-object v7, Lio/getstream/chat/android/client/errors/ChatErrorCode;->INVALID_TOKEN:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    sget-object v8, Lio/getstream/chat/android/client/errors/ChatErrorCode;->UNDEFINED_TOKEN:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    sget-object v9, Lio/getstream/chat/android/client/errors/ChatErrorCode;->UNABLE_TO_PARSE_SOCKET_EVENT:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    sget-object v10, Lio/getstream/chat/android/client/errors/ChatErrorCode;->NO_ERROR_BODY:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    sget-object v11, Lio/getstream/chat/android/client/errors/ChatErrorCode;->VALIDATION_ERROR:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    sget-object v12, Lio/getstream/chat/android/client/errors/ChatErrorCode;->AUTHENTICATION_ERROR:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    sget-object v13, Lio/getstream/chat/android/client/errors/ChatErrorCode;->DUPLICATE_USERNAME_ERROR:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    sget-object v14, Lio/getstream/chat/android/client/errors/ChatErrorCode;->TOKEN_EXPIRED:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    sget-object v15, Lio/getstream/chat/android/client/errors/ChatErrorCode;->TOKEN_NOT_VALID:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    sget-object v16, Lio/getstream/chat/android/client/errors/ChatErrorCode;->TOKEN_DATE_INCORRECT:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    sget-object v17, Lio/getstream/chat/android/client/errors/ChatErrorCode;->TOKEN_SIGNATURE_INCORRECT:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    sget-object v18, Lio/getstream/chat/android/client/errors/ChatErrorCode;->API_KEY_NOT_FOUND:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    filled-new-array/range {v1 .. v18}, [Lio/getstream/chat/android/client/errors/ChatErrorCode;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;

    const/16 v1, 0x3e8

    const-string v2, "Response is failed. See cause"

    const-string v3, "NETWORK_FAILED"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lio/getstream/chat/android/client/errors/ChatErrorCode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->NETWORK_FAILED:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    new-instance v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;

    const/16 v1, 0x3e9

    const-string v2, "Unable to parse error"

    const-string v3, "PARSER_ERROR"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lio/getstream/chat/android/client/errors/ChatErrorCode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->PARSER_ERROR:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    new-instance v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;

    const/16 v1, 0x3ea

    const-string v2, "Server closed connection"

    const-string v3, "SOCKET_CLOSED"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1, v2}, Lio/getstream/chat/android/client/errors/ChatErrorCode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->SOCKET_CLOSED:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    new-instance v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;

    const/16 v1, 0x3eb

    const-string v2, "See stack trace in logs. Intercept error in error handler of setUser"

    const-string v3, "SOCKET_FAILURE"

    const/4 v5, 0x3

    invoke-direct {v0, v3, v5, v1, v2}, Lio/getstream/chat/android/client/errors/ChatErrorCode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->SOCKET_FAILURE:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    new-instance v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;

    const/16 v1, 0x3ec

    const-string v2, "Unable to parse connection event"

    const-string v3, "CANT_PARSE_CONNECTION_EVENT"

    const/4 v5, 0x4

    invoke-direct {v0, v3, v5, v1, v2}, Lio/getstream/chat/android/client/errors/ChatErrorCode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->CANT_PARSE_CONNECTION_EVENT:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    new-instance v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;

    const/16 v1, 0x3ed

    const-string v2, "Unable to parse event"

    const-string v3, "CANT_PARSE_EVENT"

    const/4 v6, 0x5

    invoke-direct {v0, v3, v6, v1, v2}, Lio/getstream/chat/android/client/errors/ChatErrorCode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->CANT_PARSE_EVENT:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    new-instance v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;

    const/16 v1, 0x3ee

    const-string v2, "Invalid token"

    const-string v3, "INVALID_TOKEN"

    const/4 v7, 0x6

    invoke-direct {v0, v3, v7, v1, v2}, Lio/getstream/chat/android/client/errors/ChatErrorCode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->INVALID_TOKEN:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    new-instance v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;

    const/16 v1, 0x3ef

    const-string v2, "No defined token. Check if client.setUser was called and finished"

    const-string v3, "UNDEFINED_TOKEN"

    const/4 v8, 0x7

    invoke-direct {v0, v3, v8, v1, v2}, Lio/getstream/chat/android/client/errors/ChatErrorCode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->UNDEFINED_TOKEN:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    new-instance v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;

    const/16 v1, 0x3f0

    const-string v2, "Socket event payload either invalid or null"

    const-string v3, "UNABLE_TO_PARSE_SOCKET_EVENT"

    const/16 v8, 0x8

    invoke-direct {v0, v3, v8, v1, v2}, Lio/getstream/chat/android/client/errors/ChatErrorCode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->UNABLE_TO_PARSE_SOCKET_EVENT:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    new-instance v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;

    const/16 v1, 0x3f1

    const-string v2, "No error body. See http status code"

    const-string v3, "NO_ERROR_BODY"

    const/16 v8, 0x9

    invoke-direct {v0, v3, v8, v1, v2}, Lio/getstream/chat/android/client/errors/ChatErrorCode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->NO_ERROR_BODY:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    new-instance v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;

    const/16 v1, 0xa

    const-string v2, "Validation error, check your credentials"

    const-string v3, "VALIDATION_ERROR"

    invoke-direct {v0, v3, v1, v5, v2}, Lio/getstream/chat/android/client/errors/ChatErrorCode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->VALIDATION_ERROR:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    new-instance v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;

    const/16 v1, 0xb

    const-string v2, "Unauthenticated, problem with authentication"

    const-string v3, "AUTHENTICATION_ERROR"

    invoke-direct {v0, v3, v1, v6, v2}, Lio/getstream/chat/android/client/errors/ChatErrorCode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->AUTHENTICATION_ERROR:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    new-instance v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;

    const/16 v1, 0xc

    const-string v2, "Username(s) already exists."

    const-string v3, "DUPLICATE_USERNAME_ERROR"

    invoke-direct {v0, v3, v1, v7, v2}, Lio/getstream/chat/android/client/errors/ChatErrorCode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->DUPLICATE_USERNAME_ERROR:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    new-instance v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;

    const-string v1, "Token expired, new one must be requested."

    const-string v2, "TOKEN_EXPIRED"

    const/16 v3, 0xd

    const/16 v5, 0x28

    invoke-direct {v0, v2, v3, v5, v1}, Lio/getstream/chat/android/client/errors/ChatErrorCode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->TOKEN_EXPIRED:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    new-instance v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;

    const-string v1, "Unauthenticated, token not valid yet"

    const-string v2, "TOKEN_NOT_VALID"

    const/16 v3, 0xe

    const/16 v7, 0x29

    invoke-direct {v0, v2, v3, v7, v1}, Lio/getstream/chat/android/client/errors/ChatErrorCode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->TOKEN_NOT_VALID:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    new-instance v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;

    const-string v1, "Unauthenticated, token date incorrect"

    const-string v2, "TOKEN_DATE_INCORRECT"

    const/16 v3, 0xf

    const/16 v8, 0x2a

    invoke-direct {v0, v2, v3, v8, v1}, Lio/getstream/chat/android/client/errors/ChatErrorCode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->TOKEN_DATE_INCORRECT:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    new-instance v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;

    const-string v1, "Unauthenticated, token signature invalid"

    const-string v2, "TOKEN_SIGNATURE_INCORRECT"

    const/16 v3, 0x10

    const/16 v9, 0x2b

    invoke-direct {v0, v2, v3, v9, v1}, Lio/getstream/chat/android/client/errors/ChatErrorCode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->TOKEN_SIGNATURE_INCORRECT:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    new-instance v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;

    const/16 v1, 0x11

    const-string v2, "Api key is not found, verify it if it\'s correct or was created."

    const-string v3, "API_KEY_NOT_FOUND"

    invoke-direct {v0, v3, v1, v4, v2}, Lio/getstream/chat/android/client/errors/ChatErrorCode;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->API_KEY_NOT_FOUND:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    invoke-static {}, Lio/getstream/chat/android/client/errors/ChatErrorCode;->$values()[Lio/getstream/chat/android/client/errors/ChatErrorCode;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->$VALUES:[Lio/getstream/chat/android/client/errors/ChatErrorCode;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->$ENTRIES:Lt83/a;

    new-instance v0, Lio/getstream/chat/android/client/errors/ChatErrorCode$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->Companion:Lio/getstream/chat/android/client/errors/ChatErrorCode$Companion;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->authenticationErrors:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->code:I

    iput-object p4, p0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->description:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$getAuthenticationErrors$cp()Ljava/util/Set;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->authenticationErrors:Ljava/util/Set;

    return-object v0
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/getstream/chat/android/client/errors/ChatErrorCode;
    .locals 1

    const-class v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/errors/ChatErrorCode;

    return-object p0
.end method

.method public static values()[Lio/getstream/chat/android/client/errors/ChatErrorCode;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->$VALUES:[Lio/getstream/chat/android/client/errors/ChatErrorCode;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/getstream/chat/android/client/errors/ChatErrorCode;

    return-object v0
.end method


# virtual methods
.method public final getCode()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->code:I

    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->description:Ljava/lang/String;

    return-object v0
.end method
