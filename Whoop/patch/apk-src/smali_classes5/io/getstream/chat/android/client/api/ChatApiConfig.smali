.class public final Lio/getstream/chat/android/client/api/ChatApiConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u001a\u0008\u0000\u0018\u00002\u00020\u0001B]\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0008\u0012\u0006\u0010\u000c\u001a\u00020\u0008\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013\"\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0013\"\u0004\u0008\u0018\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0019\u0010\u0013\"\u0004\u0008\u001a\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001f\u0010\u001c\"\u0004\u0008 \u0010!R\u0011\u0010\u000c\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0011\u0010\u000f\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\u001cR\u001a\u0010&\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008&\u0010\u001c\"\u0004\u0008\'\u0010!\u00a8\u0006("
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/ChatApiConfig;",
        "",
        "apiKey",
        "",
        "httpUrl",
        "cdnHttpUrl",
        "wssUrl",
        "warmUp",
        "",
        "loggerConfig",
        "Lio/getstream/chat/android/client/logger/ChatLoggerConfig;",
        "distinctApiCalls",
        "debugRequests",
        "notificationConfig",
        "Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;",
        "fastEventParsing",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/getstream/chat/android/client/logger/ChatLoggerConfig;ZZLio/getstream/chat/android/client/notifications/handler/NotificationConfig;Z)V",
        "getApiKey",
        "()Ljava/lang/String;",
        "getHttpUrl",
        "setHttpUrl",
        "(Ljava/lang/String;)V",
        "getCdnHttpUrl",
        "setCdnHttpUrl",
        "getWssUrl",
        "setWssUrl",
        "getWarmUp",
        "()Z",
        "getLoggerConfig",
        "()Lio/getstream/chat/android/client/logger/ChatLoggerConfig;",
        "getDistinctApiCalls",
        "setDistinctApiCalls",
        "(Z)V",
        "getDebugRequests",
        "getNotificationConfig",
        "()Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;",
        "getFastEventParsing",
        "isAnonymous",
        "setAnonymous",
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


# instance fields
.field private final apiKey:Ljava/lang/String;

.field private cdnHttpUrl:Ljava/lang/String;

.field private final debugRequests:Z

.field private distinctApiCalls:Z

.field private final fastEventParsing:Z

.field private httpUrl:Ljava/lang/String;

.field private isAnonymous:Z

.field private final loggerConfig:Lio/getstream/chat/android/client/logger/ChatLoggerConfig;

.field private final notificationConfig:Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;

.field private final warmUp:Z

.field private wssUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/getstream/chat/android/client/logger/ChatLoggerConfig;ZLio/getstream/chat/android/client/notifications/handler/NotificationConfig;)V
    .locals 14

    .line 1
    const-string v0, "apiKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "httpUrl"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cdnHttpUrl"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wssUrl"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loggerConfig"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationConfig"

    move-object/from16 v10, p8

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v12, 0x240

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    move-object v2, p1

    move/from16 v6, p5

    move/from16 v9, p7

    invoke-direct/range {v1 .. v13}, Lio/getstream/chat/android/client/api/ChatApiConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/getstream/chat/android/client/logger/ChatLoggerConfig;ZZLio/getstream/chat/android/client/notifications/handler/NotificationConfig;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/getstream/chat/android/client/logger/ChatLoggerConfig;ZZLio/getstream/chat/android/client/notifications/handler/NotificationConfig;)V
    .locals 14

    .line 2
    const-string v0, "apiKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "httpUrl"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cdnHttpUrl"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wssUrl"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loggerConfig"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationConfig"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v12, 0x200

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    move-object v2, p1

    move/from16 v6, p5

    move/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v1 .. v13}, Lio/getstream/chat/android/client/api/ChatApiConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/getstream/chat/android/client/logger/ChatLoggerConfig;ZZLio/getstream/chat/android/client/notifications/handler/NotificationConfig;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/getstream/chat/android/client/logger/ChatLoggerConfig;ZZLio/getstream/chat/android/client/notifications/handler/NotificationConfig;Z)V
    .locals 1

    const-string v0, "apiKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "httpUrl"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cdnHttpUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wssUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loggerConfig"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationConfig"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lio/getstream/chat/android/client/api/ChatApiConfig;->apiKey:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lio/getstream/chat/android/client/api/ChatApiConfig;->httpUrl:Ljava/lang/String;

    .line 6
    iput-object p3, p0, Lio/getstream/chat/android/client/api/ChatApiConfig;->cdnHttpUrl:Ljava/lang/String;

    .line 7
    iput-object p4, p0, Lio/getstream/chat/android/client/api/ChatApiConfig;->wssUrl:Ljava/lang/String;

    .line 8
    iput-boolean p5, p0, Lio/getstream/chat/android/client/api/ChatApiConfig;->warmUp:Z

    .line 9
    iput-object p6, p0, Lio/getstream/chat/android/client/api/ChatApiConfig;->loggerConfig:Lio/getstream/chat/android/client/logger/ChatLoggerConfig;

    .line 10
    iput-boolean p7, p0, Lio/getstream/chat/android/client/api/ChatApiConfig;->distinctApiCalls:Z

    .line 11
    iput-boolean p8, p0, Lio/getstream/chat/android/client/api/ChatApiConfig;->debugRequests:Z

    .line 12
    iput-object p9, p0, Lio/getstream/chat/android/client/api/ChatApiConfig;->notificationConfig:Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;

    .line 13
    iput-boolean p10, p0, Lio/getstream/chat/android/client/api/ChatApiConfig;->fastEventParsing:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/getstream/chat/android/client/logger/ChatLoggerConfig;ZZLio/getstream/chat/android/client/notifications/handler/NotificationConfig;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    move v9, v1

    goto :goto_0

    :cond_0
    move/from16 v9, p7

    :goto_0
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    move v12, v0

    :goto_1
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move/from16 v7, p5

    move-object/from16 v8, p6

    move/from16 v10, p8

    move-object/from16 v11, p9

    goto :goto_2

    :cond_1
    move/from16 v12, p10

    goto :goto_1

    .line 14
    :goto_2
    invoke-direct/range {v2 .. v12}, Lio/getstream/chat/android/client/api/ChatApiConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/getstream/chat/android/client/logger/ChatLoggerConfig;ZZLio/getstream/chat/android/client/notifications/handler/NotificationConfig;Z)V

    return-void
.end method


# virtual methods
.method public final getApiKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ChatApiConfig;->apiKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getCdnHttpUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ChatApiConfig;->cdnHttpUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getDebugRequests()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/ChatApiConfig;->debugRequests:Z

    return v0
.end method

.method public final getDistinctApiCalls()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/ChatApiConfig;->distinctApiCalls:Z

    return v0
.end method

.method public final getFastEventParsing()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/ChatApiConfig;->fastEventParsing:Z

    return v0
.end method

.method public final getHttpUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ChatApiConfig;->httpUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getLoggerConfig()Lio/getstream/chat/android/client/logger/ChatLoggerConfig;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ChatApiConfig;->loggerConfig:Lio/getstream/chat/android/client/logger/ChatLoggerConfig;

    return-object v0
.end method

.method public final getNotificationConfig()Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ChatApiConfig;->notificationConfig:Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;

    return-object v0
.end method

.method public final getWarmUp()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/ChatApiConfig;->warmUp:Z

    return v0
.end method

.method public final getWssUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ChatApiConfig;->wssUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final isAnonymous()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/ChatApiConfig;->isAnonymous:Z

    return v0
.end method

.method public final setAnonymous(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/client/api/ChatApiConfig;->isAnonymous:Z

    return-void
.end method

.method public final setCdnHttpUrl(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/api/ChatApiConfig;->cdnHttpUrl:Ljava/lang/String;

    return-void
.end method

.method public final setDistinctApiCalls(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/client/api/ChatApiConfig;->distinctApiCalls:Z

    return-void
.end method

.method public final setHttpUrl(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/api/ChatApiConfig;->httpUrl:Ljava/lang/String;

    return-void
.end method

.method public final setWssUrl(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/api/ChatApiConfig;->wssUrl:Ljava/lang/String;

    return-void
.end method
