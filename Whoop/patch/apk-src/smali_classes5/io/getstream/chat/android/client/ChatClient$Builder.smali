.class public final Lio/getstream/chat/android/client/ChatClient$Builder;
.super Lio/getstream/chat/android/client/ChatClient$ChatClientBuilder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/ChatClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0014H\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f\u00a2\u0006\u0004\u0008 \u0010!J\u0015\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"\u00a2\u0006\u0004\u0008#\u0010$J\r\u0010%\u001a\u00020\u0000\u00a2\u0006\u0004\u0008%\u0010&J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\'\u00a2\u0006\u0004\u0008(\u0010)J\u0015\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0002\u00a2\u0006\u0004\u0008+\u0010,J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008-\u0010,J\u0017\u0010.\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008.\u0010,J\u0015\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020/\u00a2\u0006\u0004\u00080\u00101J\u0015\u00102\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0002\u00a2\u0006\u0004\u00082\u0010,J\r\u00103\u001a\u00020\u0000\u00a2\u0006\u0004\u00083\u0010&J\u0015\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u000204\u00a2\u0006\u0004\u00085\u00106J\u0015\u00108\u001a\u00020\u00002\u0006\u00108\u001a\u000207\u00a2\u0006\u0004\u00088\u00109J\u0015\u0010<\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:\u00a2\u0006\u0004\u0008<\u0010=J\u0015\u0010?\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>\u00a2\u0006\u0004\u0008?\u0010@J\r\u0010A\u001a\u00020\u0000\u00a2\u0006\u0004\u0008A\u0010&J\u0015\u0010D\u001a\u00020\u00002\u0006\u0010C\u001a\u00020B\u00a2\u0006\u0004\u0008D\u0010EJ\u0015\u0010F\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u0002\u00a2\u0006\u0004\u0008F\u0010,J\u0015\u0010G\u001a\u00020\u00002\u0006\u0010G\u001a\u00020\u0002\u00a2\u0006\u0004\u0008G\u0010,J\u000f\u0010I\u001a\u00020HH\u0016\u00a2\u0006\u0004\u0008I\u0010JJ\u000f\u0010K\u001a\u00020HH\u0017\u00a2\u0006\u0004\u0008K\u0010JJ\u001d\u0010O\u001a\u0008\u0012\u0004\u0012\u00020N0M2\u0006\u0010L\u001a\u000204H\u0002\u00a2\u0006\u0004\u0008O\u0010PJ\u000f\u0010R\u001a\u00020QH\u0002\u00a2\u0006\u0004\u0008R\u0010SJ\u000f\u0010T\u001a\u00020QH\u0002\u00a2\u0006\u0004\u0008T\u0010SR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010UR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010VR\u0016\u00103\u001a\u00020:8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00083\u0010WR\u0018\u0010-\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008-\u0010UR\u0018\u0010.\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008.\u0010UR\u0016\u0010+\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008+\u0010UR\u0018\u00102\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00082\u0010UR\u0016\u0010\n\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010XR\u0016\u0010Y\u001a\u00020:8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008Y\u0010WR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010ZR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010[R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\\R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010]R\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010^R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008a\u0010bR\u0018\u0010c\u001a\u0004\u0018\u00010\'8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008c\u0010dR\u0018\u0010e\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008e\u0010fR\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008?\u0010gR\u0016\u0010h\u001a\u00020:8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008h\u0010WR\u0016\u0010<\u001a\u00020:8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008<\u0010WR\u0016\u0010L\u001a\u0002048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008L\u0010iR\u0016\u0010D\u001a\u00020B8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008D\u0010jR\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010kR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010lR\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00080\u0010mR\u0018\u0010F\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008F\u0010UR\u0018\u0010G\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008G\u0010U\u00a8\u0006n"
    }
    d2 = {
        "Lio/getstream/chat/android/client/ChatClient$Builder;",
        "Lio/getstream/chat/android/client/ChatClient$ChatClientBuilder;",
        "",
        "apiKey",
        "Landroid/content/Context;",
        "appContext",
        "<init>",
        "(Ljava/lang/String;Landroid/content/Context;)V",
        "Lio/getstream/chat/android/client/logger/ChatLogLevel;",
        "level",
        "logLevel",
        "(Lio/getstream/chat/android/client/logger/ChatLogLevel;)Lio/getstream/chat/android/client/ChatClient$Builder;",
        "Lio/getstream/chat/android/client/logger/ChatLoggerHandler;",
        "loggerHandler",
        "(Lio/getstream/chat/android/client/logger/ChatLoggerHandler;)Lio/getstream/chat/android/client/ChatClient$Builder;",
        "Lio/getstream/chat/android/client/debugger/ChatClientDebugger;",
        "clientDebugger",
        "(Lio/getstream/chat/android/client/debugger/ChatClientDebugger;)Lio/getstream/chat/android/client/ChatClient$Builder;",
        "Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;",
        "notificationConfig",
        "Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;",
        "notificationsHandler",
        "notifications",
        "(Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;)Lio/getstream/chat/android/client/ChatClient$Builder;",
        "Lio/getstream/chat/android/client/uploader/FileTransformer;",
        "fileTransformer",
        "(Lio/getstream/chat/android/client/uploader/FileTransformer;)Lio/getstream/chat/android/client/ChatClient$Builder;",
        "Lio/getstream/chat/android/client/transformer/ApiModelTransformers;",
        "apiModelTransformers",
        "withApiModelTransformer",
        "(Lio/getstream/chat/android/client/transformer/ApiModelTransformers;)Lio/getstream/chat/android/client/ChatClient$Builder;",
        "Lio/getstream/chat/android/client/uploader/FileUploader;",
        "fileUploader",
        "(Lio/getstream/chat/android/client/uploader/FileUploader;)Lio/getstream/chat/android/client/ChatClient$Builder;",
        "Lio/getstream/chat/android/client/interceptor/SendMessageInterceptor;",
        "sendMessageInterceptor",
        "(Lio/getstream/chat/android/client/interceptor/SendMessageInterceptor;)Lio/getstream/chat/android/client/ChatClient$Builder;",
        "disableWarmUp",
        "()Lio/getstream/chat/android/client/ChatClient$Builder;",
        "Lud3/l0;",
        "okHttpClient",
        "(Lud3/l0;)Lio/getstream/chat/android/client/ChatClient$Builder;",
        "value",
        "baseUrl",
        "(Ljava/lang/String;)Lio/getstream/chat/android/client/ChatClient$Builder;",
        "forceHttpUrl",
        "forceWsUrl",
        "Lio/getstream/chat/android/client/cdn/CDN;",
        "cdn",
        "(Lio/getstream/chat/android/client/cdn/CDN;)Lio/getstream/chat/android/client/ChatClient$Builder;",
        "cdnUrl",
        "forceInsecureConnection",
        "Lio/getstream/chat/android/client/api/ChatClientConfig;",
        "config",
        "(Lio/getstream/chat/android/client/api/ChatClientConfig;)Lio/getstream/chat/android/client/ChatClient$Builder;",
        "Lio/getstream/chat/android/client/user/storage/UserCredentialStorage;",
        "credentialStorage",
        "(Lio/getstream/chat/android/client/user/storage/UserCredentialStorage;)Lio/getstream/chat/android/client/ChatClient$Builder;",
        "",
        "shouldDebug",
        "debugRequests",
        "(Z)Lio/getstream/chat/android/client/ChatClient$Builder;",
        "Lr23/d;",
        "retryPolicy",
        "(Lr23/d;)Lio/getstream/chat/android/client/ChatClient$Builder;",
        "disableDistinctApiCalls",
        "Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;",
        "type",
        "uploadAttachmentsNetworkType",
        "(Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;)Lio/getstream/chat/android/client/ChatClient$Builder;",
        "appName",
        "appVersion",
        "Lio/getstream/chat/android/client/ChatClient;",
        "build",
        "()Lio/getstream/chat/android/client/ChatClient;",
        "internalBuild",
        "chatClientConfig",
        "",
        "Lio/getstream/chat/android/client/plugin/factory/PluginFactory;",
        "setupPluginFactories",
        "(Lio/getstream/chat/android/client/api/ChatClientConfig;)Ljava/util/List;",
        "Ll83/a0;",
        "setupStreamLog",
        "()V",
        "warmUpReflection",
        "Ljava/lang/String;",
        "Landroid/content/Context;",
        "Z",
        "Lio/getstream/chat/android/client/logger/ChatLogLevel;",
        "warmUp",
        "Lio/getstream/chat/android/client/logger/ChatLoggerHandler;",
        "Lio/getstream/chat/android/client/debugger/ChatClientDebugger;",
        "Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;",
        "Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;",
        "Lio/getstream/chat/android/client/uploader/FileUploader;",
        "Lio/getstream/chat/android/client/interceptor/SendMessageInterceptor;",
        "Lio/getstream/chat/android/client/token/TokenManager;",
        "tokenManager",
        "Lio/getstream/chat/android/client/token/TokenManager;",
        "customOkHttpClient",
        "Lud3/l0;",
        "userCredentialStorage",
        "Lio/getstream/chat/android/client/user/storage/UserCredentialStorage;",
        "Lr23/d;",
        "distinctApiCalls",
        "Lio/getstream/chat/android/client/api/ChatClientConfig;",
        "Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;",
        "Lio/getstream/chat/android/client/uploader/FileTransformer;",
        "Lio/getstream/chat/android/client/transformer/ApiModelTransformers;",
        "Lio/getstream/chat/android/client/cdn/CDN;",
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

.field private apiModelTransformers:Lio/getstream/chat/android/client/transformer/ApiModelTransformers;

.field private final appContext:Landroid/content/Context;

.field private appName:Ljava/lang/String;

.field private appVersion:Ljava/lang/String;

.field private baseUrl:Ljava/lang/String;

.field private cdn:Lio/getstream/chat/android/client/cdn/CDN;

.field private cdnUrl:Ljava/lang/String;

.field private chatClientConfig:Lio/getstream/chat/android/client/api/ChatClientConfig;

.field private clientDebugger:Lio/getstream/chat/android/client/debugger/ChatClientDebugger;

.field private customOkHttpClient:Lud3/l0;

.field private debugRequests:Z

.field private distinctApiCalls:Z

.field private fileTransformer:Lio/getstream/chat/android/client/uploader/FileTransformer;

.field private fileUploader:Lio/getstream/chat/android/client/uploader/FileUploader;

.field private forceHttpUrl:Ljava/lang/String;

.field private forceInsecureConnection:Z

.field private forceWsUrl:Ljava/lang/String;

.field private logLevel:Lio/getstream/chat/android/client/logger/ChatLogLevel;

.field private loggerHandler:Lio/getstream/chat/android/client/logger/ChatLoggerHandler;

.field private notificationConfig:Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;

.field private notificationsHandler:Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;

.field private retryPolicy:Lr23/d;

.field private sendMessageInterceptor:Lio/getstream/chat/android/client/interceptor/SendMessageInterceptor;

.field private final tokenManager:Lio/getstream/chat/android/client/token/TokenManager;

.field private uploadAttachmentsNetworkType:Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;

.field private userCredentialStorage:Lio/getstream/chat/android/client/user/storage/UserCredentialStorage;

.field private warmUp:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;)V
    .locals 12

    const-string v0, "apiKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->apiKey:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->appContext:Landroid/content/Context;

    const-string p1, "chat.stream-io-api.com"

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->baseUrl:Ljava/lang/String;

    sget-object p1, Lio/getstream/chat/android/client/logger/ChatLogLevel;->NOTHING:Lio/getstream/chat/android/client/logger/ChatLogLevel;

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->logLevel:Lio/getstream/chat/android/client/logger/ChatLogLevel;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->warmUp:Z

    new-instance v0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;

    const/16 v8, 0x7e

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;-><init>(ZLkotlin/jvm/functions/Function1;Ljava/util/List;Lc93/a;Lc93/a;ZLio/getstream/chat/android/client/token/TokenProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->notificationConfig:Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;

    new-instance p2, Lio/getstream/chat/android/client/token/TokenManagerImpl;

    invoke-direct {p2}, Lio/getstream/chat/android/client/token/TokenManagerImpl;-><init>()V

    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->tokenManager:Lio/getstream/chat/android/client/token/TokenManager;

    new-instance p2, Lio/getstream/chat/android/client/utils/retry/NoRetryPolicy;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->retryPolicy:Lr23/d;

    iput-boolean p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->distinctApiCalls:Z

    new-instance v0, Lio/getstream/chat/android/client/api/ChatClientConfig;

    const/16 v10, 0x1ff

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v0 .. v11}, Lio/getstream/chat/android/client/api/ChatClientConfig;-><init>(ZLjava/util/Set;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/api/MessageLimitConfig;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->chatClientConfig:Lio/getstream/chat/android/client/api/ChatClientConfig;

    sget-object p1, Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;->CONNECTED:Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->uploadAttachmentsNetworkType:Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;

    sget-object p1, Lio/getstream/chat/android/client/uploader/NoOpFileTransformer;->INSTANCE:Lio/getstream/chat/android/client/uploader/NoOpFileTransformer;

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->fileTransformer:Lio/getstream/chat/android/client/uploader/FileTransformer;

    new-instance v0, Lio/getstream/chat/android/client/transformer/ApiModelTransformers;

    const/16 v6, 0x1f

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v7}, Lio/getstream/chat/android/client/transformer/ApiModelTransformers;-><init>(Lio/getstream/chat/android/models/MessageTransformer;Lio/getstream/chat/android/models/MessageTransformer;Lio/getstream/chat/android/models/ChannelTransformer;Lio/getstream/chat/android/models/UserTransformer;Lio/getstream/chat/android/models/UserTransformer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->apiModelTransformers:Lio/getstream/chat/android/client/transformer/ApiModelTransformers;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/client/ChatClient$Builder;)Lb9/f0;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/ChatClient$Builder;->internalBuild$lambda$20(Lio/getstream/chat/android/client/ChatClient$Builder;)Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object p0

    check-cast p0, Lb9/f0;

    return-object p0
.end method

.method public static final synthetic access$warmUpReflection(Lio/getstream/chat/android/client/ChatClient$Builder;)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/ChatClient$Builder;->warmUpReflection()V

    return-void
.end method

.method public static synthetic b()Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/client/ChatClient$Builder;->internalBuild$lambda$21()Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    move-result-object v0

    return-object v0
.end method

.method private static final internalBuild$lambda$20(Lio/getstream/chat/android/client/ChatClient$Builder;)Landroidx/media3/exoplayer/ExoPlayer;
    .locals 2

    new-instance v0, Lb9/p;

    iget-object p0, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->appContext:Landroid/content/Context;

    invoke-direct {v0, p0}, Lb9/p;-><init>(Landroid/content/Context;)V

    new-instance p0, Ld0/o2;

    const/4 v1, 0x7

    invoke-direct {p0, v1}, Ld0/o2;-><init>(I)V

    invoke-virtual {p0}, Ld0/o2;->n()V

    invoke-virtual {p0}, Ld0/o2;->g()Lu8/d;

    move-result-object p0

    invoke-virtual {v0, p0}, Lb9/p;->b(Lu8/d;)V

    invoke-virtual {v0}, Lb9/p;->a()Lb9/f0;

    move-result-object p0

    return-object p0
.end method

.method private static final internalBuild$lambda$21()Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient;->getRepositoryFacade()Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic notifications$default(Lio/getstream/chat/android/client/ChatClient$Builder;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;ILjava/lang/Object;)Lio/getstream/chat/android/client/ChatClient$Builder;
    .locals 14

    and-int/lit8 v0, p3, 0x2

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->appContext:Landroid/content/Context;

    const/16 v12, 0x7fc

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v13}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->createNotificationHandler$default(Landroid/content/Context;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lc93/m;Lc93/a;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;La13/c;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;ILjava/lang/Object;)Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object/from16 v0, p2

    :goto_0
    invoke-virtual {p0, p1, v0}, Lio/getstream/chat/android/client/ChatClient$Builder;->notifications(Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;)Lio/getstream/chat/android/client/ChatClient$Builder;

    return-object p0
.end method

.method private final setupPluginFactories(Lio/getstream/chat/android/client/api/ChatClientConfig;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/ChatClientConfig;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/plugin/factory/PluginFactory;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v0

    sget-object v1, Lio/getstream/chat/android/client/plugin/factory/ThrottlingPluginFactory;->INSTANCE:Lio/getstream/chat/android/client/plugin/factory/ThrottlingPluginFactory;

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    sget-object v1, Lio/getstream/chat/android/client/plugin/MessageDeliveredPluginFactory;->INSTANCE:Lio/getstream/chat/android/client/plugin/MessageDeliveredPluginFactory;

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    new-instance v1, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->appContext:Landroid/content/Context;

    invoke-direct {v1, p1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;-><init>(Lio/getstream/chat/android/client/api/ChatClientConfig;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/ChatClientConfig;->getOfflineEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v2, Lio/getstream/chat/android/client/internal/offline/plugin/factory/StreamOfflinePluginFactory;

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->appContext:Landroid/content/Context;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/ChatClientConfig;->getIgnoredOfflineChannelTypes()Ljava/util/Set;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lio/getstream/chat/android/client/internal/offline/plugin/factory/StreamOfflinePluginFactory;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v2}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-static {v0}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object p1

    return-object p1
.end method

.method private final setupStreamLog()V
    .locals 5

    sget-boolean v0, Lb23/i;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->logLevel:Lio/getstream/chat/android/client/logger/ChatLogLevel;

    sget-object v1, Lio/getstream/chat/android/client/logger/ChatLogLevel;->NOTHING:Lio/getstream/chat/android/client/logger/ChatLogLevel;

    if-eq v0, v1, :cond_0

    new-instance v1, Lio/getstream/chat/android/client/logger/StreamLogLevelValidator;

    invoke-direct {v1, v0}, Lio/getstream/chat/android/client/logger/StreamLogLevelValidator;-><init>(Lio/getstream/chat/android/client/logger/ChatLogLevel;)V

    sput-object v1, Lb23/i;->d:Lb23/e;

    new-instance v0, Lb23/b;

    new-instance v1, Lb23/a;

    invoke-direct {v1}, Lb23/a;-><init>()V

    new-instance v2, Lio/getstream/chat/android/client/logger/StreamLoggerHandler;

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->loggerHandler:Lio/getstream/chat/android/client/logger/ChatLoggerHandler;

    invoke-direct {v2, v3}, Lio/getstream/chat/android/client/logger/StreamLoggerHandler;-><init>(Lio/getstream/chat/android/client/logger/ChatLoggerHandler;)V

    const/4 v3, 0x2

    new-array v3, v3, [Lb23/j;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v2, v3, v1

    invoke-direct {v0, v3}, Lb23/b;-><init>([Lb23/j;)V

    invoke-static {v0}, Lb23/i;->c(Lb23/j;)V

    :cond_0
    return-void
.end method

.method private final warmUpReflection()V
    .locals 2

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getMembers()Ljava/util/Collection;

    const-class v1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getMembers()Ljava/util/Collection;

    const-class v1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getMembers()Ljava/util/Collection;

    const-class v1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getMembers()Ljava/util/Collection;

    const-class v1, Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getMembers()Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method public final appName(Ljava/lang/String;)Lio/getstream/chat/android/client/ChatClient$Builder;
    .locals 1

    const-string v0, "appName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->appName:Ljava/lang/String;

    return-object p0
.end method

.method public final appVersion(Ljava/lang/String;)Lio/getstream/chat/android/client/ChatClient$Builder;
    .locals 1

    const-string v0, "appVersion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->appVersion:Ljava/lang/String;

    return-object p0
.end method

.method public final baseUrl(Ljava/lang/String;)Lio/getstream/chat/android/client/ChatClient$Builder;
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->extractBaseUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->baseUrl:Ljava/lang/String;

    return-object p0
.end method

.method public final build()Lio/getstream/chat/android/client/ChatClient;
    .locals 1

    invoke-super {p0}, Lio/getstream/chat/android/client/ChatClient$ChatClientBuilder;->build()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v0

    return-object v0
.end method

.method public final cdn(Lio/getstream/chat/android/client/cdn/CDN;)Lio/getstream/chat/android/client/ChatClient$Builder;
    .locals 1

    const-string v0, "cdn"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->cdn:Lio/getstream/chat/android/client/cdn/CDN;

    return-object p0
.end method

.method public final cdnUrl(Ljava/lang/String;)Lio/getstream/chat/android/client/ChatClient$Builder;
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->extractBaseUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->cdnUrl:Ljava/lang/String;

    return-object p0
.end method

.method public final clientDebugger(Lio/getstream/chat/android/client/debugger/ChatClientDebugger;)Lio/getstream/chat/android/client/ChatClient$Builder;
    .locals 1

    const-string v0, "clientDebugger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->clientDebugger:Lio/getstream/chat/android/client/debugger/ChatClientDebugger;

    return-object p0
.end method

.method public final config(Lio/getstream/chat/android/client/api/ChatClientConfig;)Lio/getstream/chat/android/client/ChatClient$Builder;
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->chatClientConfig:Lio/getstream/chat/android/client/api/ChatClientConfig;

    return-object p0
.end method

.method public final credentialStorage(Lio/getstream/chat/android/client/user/storage/UserCredentialStorage;)Lio/getstream/chat/android/client/ChatClient$Builder;
    .locals 1

    const-string v0, "credentialStorage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->userCredentialStorage:Lio/getstream/chat/android/client/user/storage/UserCredentialStorage;

    return-object p0
.end method

.method public final debugRequests(Z)Lio/getstream/chat/android/client/ChatClient$Builder;
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->debugRequests:Z

    return-object p0
.end method

.method public final disableDistinctApiCalls()Lio/getstream/chat/android/client/ChatClient$Builder;
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->distinctApiCalls:Z

    return-object p0
.end method

.method public final disableWarmUp()Lio/getstream/chat/android/client/ChatClient$Builder;
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->warmUp:Z

    return-object p0
.end method

.method public final fileTransformer(Lio/getstream/chat/android/client/uploader/FileTransformer;)Lio/getstream/chat/android/client/ChatClient$Builder;
    .locals 1

    const-string v0, "fileTransformer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->fileTransformer:Lio/getstream/chat/android/client/uploader/FileTransformer;

    return-object p0
.end method

.method public final fileUploader(Lio/getstream/chat/android/client/uploader/FileUploader;)Lio/getstream/chat/android/client/ChatClient$Builder;
    .locals 1

    const-string v0, "fileUploader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->fileUploader:Lio/getstream/chat/android/client/uploader/FileUploader;

    return-object p0
.end method

.method public final forceHttpUrl(Ljava/lang/String;)Lio/getstream/chat/android/client/ChatClient$Builder;
    .locals 1
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->forceHttpUrl:Ljava/lang/String;

    return-object p0
.end method

.method public final forceInsecureConnection()Lio/getstream/chat/android/client/ChatClient$Builder;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->forceInsecureConnection:Z

    return-object p0
.end method

.method public final forceWsUrl(Ljava/lang/String;)Lio/getstream/chat/android/client/ChatClient$Builder;
    .locals 1
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->forceWsUrl:Ljava/lang/String;

    return-object p0
.end method

.method public final internalBuild()Lio/getstream/chat/android/client/ChatClient;
    .locals 33
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->apiKey:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_d

    invoke-static {}, Lio/getstream/chat/android/client/ChatClient;->access$getInstance$cp()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v1, "Chat"

    const-string v2, "[ERROR] You have just re-initialized ChatClient, old configuration has been overridden [ERROR]"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v1, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->forceInsecureConnection:Z

    const/4 v2, 0x0

    if-nez v1, :cond_2

    iget-object v1, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->baseUrl:Ljava/lang/String;

    const-string v3, "localhost"

    invoke-static {v1, v3, v2}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v1, 0x1

    :goto_1
    if-eqz v1, :cond_3

    const-string v3, "http"

    goto :goto_2

    :cond_3
    const-string v3, "https"

    :goto_2
    if-eqz v1, :cond_4

    const-string v1, "ws"

    goto :goto_3

    :cond_4
    const-string v1, "wss"

    :goto_3
    sget-object v4, Landroidx/lifecycle/ProcessLifecycleOwner;->I:Landroidx/lifecycle/ProcessLifecycleOwner;

    iget-object v4, v4, Landroidx/lifecycle/ProcessLifecycleOwner;->F:Landroidx/lifecycle/i0;

    new-instance v5, Lio/getstream/chat/android/client/api/ChatApiConfig;

    iget-object v6, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->apiKey:Ljava/lang/String;

    iget-object v7, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->forceHttpUrl:Ljava/lang/String;

    const-string v8, "/"

    const-string v9, "://"

    if-nez v7, :cond_5

    iget-object v7, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->baseUrl:Ljava/lang/String;

    invoke-static {v3, v9, v7, v8}, Ldc/b;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    :cond_5
    iget-object v10, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->cdnUrl:Ljava/lang/String;

    if-nez v10, :cond_6

    iget-object v10, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->baseUrl:Ljava/lang/String;

    :cond_6
    invoke-static {v3, v9, v10, v8}, Ldc/b;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v10, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->forceWsUrl:Ljava/lang/String;

    if-nez v10, :cond_7

    iget-object v10, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->baseUrl:Ljava/lang/String;

    invoke-static {v1, v9, v10, v8}, Ldc/b;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    :cond_7
    move-object v9, v10

    iget-boolean v10, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->warmUp:Z

    new-instance v11, Lio/getstream/chat/android/client/logger/ChatLoggerConfigImpl;

    iget-object v1, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->logLevel:Lio/getstream/chat/android/client/logger/ChatLogLevel;

    iget-object v8, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->loggerHandler:Lio/getstream/chat/android/client/logger/ChatLoggerHandler;

    invoke-direct {v11, v1, v8}, Lio/getstream/chat/android/client/logger/ChatLoggerConfigImpl;-><init>(Lio/getstream/chat/android/client/logger/ChatLogLevel;Lio/getstream/chat/android/client/logger/ChatLoggerHandler;)V

    iget-boolean v12, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->distinctApiCalls:Z

    iget-boolean v13, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->debugRequests:Z

    iget-object v14, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->notificationConfig:Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;

    iget-object v1, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->chatClientConfig:Lio/getstream/chat/android/client/api/ChatClientConfig;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/api/ChatClientConfig;->getFastEventParsing()Z

    move-result v15

    move-object v8, v3

    invoke-direct/range {v5 .. v15}, Lio/getstream/chat/android/client/api/ChatApiConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/getstream/chat/android/client/logger/ChatLoggerConfig;ZZLio/getstream/chat/android/client/notifications/handler/NotificationConfig;Z)V

    invoke-direct {v0}, Lio/getstream/chat/android/client/ChatClient$Builder;->setupStreamLog()V

    invoke-static {}, Lio/getstream/chat/android/client/scope/ClientScopeKt;->ClientScope()Lio/getstream/chat/android/client/scope/ClientScope;

    move-result-object v15

    invoke-static {v15}, Lio/getstream/chat/android/client/scope/UserScopeKt;->UserScope(Lio/getstream/chat/android/client/scope/ClientScope;)Lio/getstream/chat/android/client/scope/UserScope;

    move-result-object v8

    new-instance v1, Lio/getstream/chat/android/client/ChatClient$Builder$internalBuild$2;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v3}, Lio/getstream/chat/android/client/ChatClient$Builder$internalBuild$2;-><init>(Lio/getstream/chat/android/client/ChatClient$Builder;Lq83/d;)V

    const/4 v6, 0x3

    invoke-static {v15, v3, v3, v1, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v16, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;

    const/16 v22, 0x7

    const/16 v23, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    invoke-direct/range {v16 .. v23}, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;-><init>(Lc93/a;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v5

    new-instance v5, Lio/getstream/chat/android/client/di/ChatModule;

    move-object v9, v6

    iget-object v6, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->appContext:Landroid/content/Context;

    iget-object v10, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->notificationsHandler:Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;

    iget-object v11, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->apiModelTransformers:Lio/getstream/chat/android/client/transformer/ApiModelTransformers;

    iget-object v12, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->fileTransformer:Lio/getstream/chat/android/client/uploader/FileTransformer;

    iget-object v13, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->fileUploader:Lio/getstream/chat/android/client/uploader/FileUploader;

    iget-object v14, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->sendMessageInterceptor:Lio/getstream/chat/android/client/interceptor/SendMessageInterceptor;

    move-object v7, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->cdn:Lio/getstream/chat/android/client/cdn/CDN;

    iget-object v1, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->tokenManager:Lio/getstream/chat/android/client/token/TokenManager;

    iget-object v3, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->customOkHttpClient:Lud3/l0;

    iget-object v2, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->clientDebugger:Lio/getstream/chat/android/client/debugger/ChatClientDebugger;

    move-object/from16 v17, v1

    iget-object v1, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->appName:Ljava/lang/String;

    move-object/from16 v20, v1

    iget-object v1, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->appVersion:Ljava/lang/String;

    move-object/from16 v21, v1

    move-object/from16 v18, v2

    move-object/from16 v19, v4

    move-object/from16 v22, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v3

    invoke-direct/range {v5 .. v22}, Lio/getstream/chat/android/client/di/ChatModule;-><init>(Landroid/content/Context;Lio/getstream/chat/android/client/scope/ClientScope;Lio/getstream/chat/android/client/scope/UserScope;Lio/getstream/chat/android/client/api/ChatApiConfig;Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;Lio/getstream/chat/android/client/transformer/ApiModelTransformers;Lio/getstream/chat/android/client/uploader/FileTransformer;Lio/getstream/chat/android/client/uploader/FileUploader;Lio/getstream/chat/android/client/interceptor/SendMessageInterceptor;Lio/getstream/chat/android/client/cdn/CDN;Lio/getstream/chat/android/client/token/TokenManager;Lud3/l0;Lio/getstream/chat/android/client/debugger/ChatClientDebugger;Landroidx/lifecycle/x;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;)V

    move-object v1, v5

    move-object v15, v7

    move-object v5, v9

    move-object/from16 v16, v22

    invoke-virtual {v1}, Lio/getstream/chat/android/client/di/ChatModule;->api()Lio/getstream/chat/android/client/api/ChatApi;

    move-result-object v2

    new-instance v3, Lio/getstream/chat/android/client/helpers/AppSettingManager;

    invoke-direct {v3, v2}, Lio/getstream/chat/android/client/helpers/AppSettingManager;-><init>(Lio/getstream/chat/android/client/api/ChatApi;)V

    sget-object v4, Lio/getstream/chat/android/client/cdn/internal/StreamMediaDataSource;->INSTANCE:Lio/getstream/chat/android/client/cdn/internal/StreamMediaDataSource;

    iget-object v6, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->appContext:Landroid/content/Context;

    iget-object v7, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->cdn:Lio/getstream/chat/android/client/cdn/CDN;

    invoke-virtual {v4, v6, v7}, Lio/getstream/chat/android/client/cdn/internal/StreamMediaDataSource;->factory(Landroid/content/Context;Lio/getstream/chat/android/client/cdn/CDN;)Lz8/e;

    move-result-object v4

    new-instance v6, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;

    new-instance v7, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;

    new-instance v9, La6/l0;

    const/16 v10, 0x11

    invoke-direct {v9, v0, v10}, La6/l0;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v7, v4, v9}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;-><init>(Lz8/e;Lc93/a;)V

    const/4 v11, 0x4

    const/4 v12, 0x0

    const-wide/16 v9, 0x0

    invoke-direct/range {v6 .. v12}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;-><init>(Lio/getstream/chat/android/client/audio/NativeMediaPlayer;Lio/getstream/chat/android/client/scope/UserScope;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v4, Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase;->Companion:Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase$Companion;

    iget-object v7, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->appContext:Landroid/content/Context;

    invoke-virtual {v4, v7}, Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase$Companion;->build(Landroid/content/Context;)Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase;

    move-result-object v4

    sget-object v7, Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository;->Companion:Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository$Companion;

    invoke-virtual {v7, v4}, Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository$Companion;->from(Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase;)Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository;

    move-result-object v4

    iget-object v7, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->chatClientConfig:Lio/getstream/chat/android/client/api/ChatClientConfig;

    invoke-direct {v0, v7}, Lio/getstream/chat/android/client/ChatClient$Builder;->setupPluginFactories(Lio/getstream/chat/android/client/api/ChatClientConfig;)Ljava/util/List;

    move-result-object v20

    invoke-virtual {v1}, Lio/getstream/chat/android/client/di/ChatModule;->getDtoMapping$stream_chat_android_client_release()Lio/getstream/chat/android/client/api2/mapping/DtoMapping;

    move-result-object v7

    invoke-virtual {v1}, Lio/getstream/chat/android/client/di/ChatModule;->notifications()Lio/getstream/chat/android/client/notifications/ChatNotifications;

    move-result-object v9

    iget-object v10, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->tokenManager:Lio/getstream/chat/android/client/token/TokenManager;

    iget-object v11, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->userCredentialStorage:Lio/getstream/chat/android/client/user/storage/UserCredentialStorage;

    if-nez v11, :cond_8

    new-instance v11, Lio/getstream/chat/android/client/user/storage/SharedPreferencesCredentialStorage;

    iget-object v12, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->appContext:Landroid/content/Context;

    invoke-direct {v11, v12}, Lio/getstream/chat/android/client/user/storage/SharedPreferencesCredentialStorage;-><init>(Landroid/content/Context;)V

    :cond_8
    invoke-virtual {v1}, Lio/getstream/chat/android/client/di/ChatModule;->getUserStateService()Lio/getstream/chat/android/client/clientstate/UserStateService;

    move-result-object v12

    iget-object v13, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->clientDebugger:Lio/getstream/chat/android/client/debugger/ChatClientDebugger;

    if-nez v13, :cond_9

    sget-object v13, Lio/getstream/chat/android/client/debugger/StubChatClientDebugger;->INSTANCE:Lio/getstream/chat/android/client/debugger/StubChatClientDebugger;

    :cond_9
    iget-object v14, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->retryPolicy:Lr23/d;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/di/ChatModule;->getChatSocket$stream_chat_android_client_release()Lio/getstream/chat/android/client/socket/ChatSocket;

    move-result-object v19

    move-object/from16 v17, v1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v18, v3

    move-object/from16 v3, v20

    check-cast v3, Ln83/c;

    move-object/from16 v21, v5

    const/4 v5, 0x0

    invoke-virtual {v3, v5}, Ln83/c;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v3

    :goto_4
    move-object v5, v3

    check-cast v5, Ln83/b;

    invoke-virtual {v5}, Ln83/b;->hasNext()Z

    move-result v22

    if-eqz v22, :cond_b

    invoke-virtual {v5}, Ln83/b;->next()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v22, v3

    instance-of v3, v5, Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory$Provider;

    if-eqz v3, :cond_a

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a
    move-object/from16 v3, v22

    goto :goto_4

    :cond_b
    invoke-static {v1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory$Provider;

    if-nez v1, :cond_c

    sget-object v1, Lio/getstream/chat/android/client/persistance/repository/noop/NoOpRepositoryFactory$Provider;->INSTANCE:Lio/getstream/chat/android/client/persistance/repository/noop/NoOpRepositoryFactory$Provider;

    :cond_c
    move-object/from16 v23, v1

    new-instance v1, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;

    invoke-virtual/range {v17 .. v17}, Lio/getstream/chat/android/client/di/ChatModule;->getNetworkStateProvider()Lio/getstream/chat/android/client/network/NetworkStateProvider;

    move-result-object v3

    invoke-direct {v1, v3}, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;-><init>(Lio/getstream/chat/android/client/network/NetworkStateProvider;)V

    invoke-virtual/range {v17 .. v17}, Lio/getstream/chat/android/client/di/ChatModule;->getCurrentUserFetcher()Lio/getstream/chat/android/client/user/CurrentUserFetcher;

    move-result-object v22

    new-instance v3, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;

    invoke-direct {v3, v8, v4, v2}, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;-><init>(Lbc3/c0;Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;Lio/getstream/chat/android/client/api/ChatApi;)V

    new-instance v5, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;

    move-object/from16 v17, v1

    sget-object v1, Lio/getstream/chat/android/client/ChatClient$Builder$internalBuild$3;->INSTANCE:Lio/getstream/chat/android/client/ChatClient$Builder$internalBuild$3;

    move-object/from16 v28, v3

    new-instance v3, Lim1/l0;

    move-object/from16 v24, v6

    const/4 v6, 0x5

    invoke-direct {v3, v6}, Lim1/l0;-><init>(I)V

    invoke-direct {v5, v1, v3, v4, v2}, Lio/getstream/chat/android/client/receipts/MessageReceiptManager;-><init>(Lc93/a;Lc93/a;Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;Lio/getstream/chat/android/client/api/ChatApi;)V

    iget-object v1, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->cdn:Lio/getstream/chat/android/client/cdn/CDN;

    move-object/from16 v29, v5

    new-instance v5, Lio/getstream/chat/android/client/ChatClient;

    const v31, 0x80100

    const/16 v32, 0x0

    move-object/from16 v6, v21

    move-object/from16 v21, v17

    move-object/from16 v17, v14

    const/4 v14, 0x0

    const/16 v25, 0x0

    move-object/from16 v30, v1

    move-object/from16 v27, v4

    move-object/from16 v26, v16

    move-object/from16 v16, v8

    move-object v8, v7

    move-object v7, v2

    invoke-direct/range {v5 .. v32}, Lio/getstream/chat/android/client/ChatClient;-><init>(Lio/getstream/chat/android/client/api/ChatApiConfig;Lio/getstream/chat/android/client/api/ChatApi;Lio/getstream/chat/android/client/api2/mapping/DtoMapping;Lio/getstream/chat/android/client/notifications/ChatNotifications;Lio/getstream/chat/android/client/token/TokenManager;Lio/getstream/chat/android/client/user/storage/UserCredentialStorage;Lio/getstream/chat/android/client/clientstate/UserStateService;Lio/getstream/chat/android/client/debugger/ChatClientDebugger;Lio/getstream/chat/android/client/utils/TokenUtils;Lio/getstream/chat/android/client/scope/ClientScope;Lio/getstream/chat/android/client/scope/UserScope;Lr23/d;Lio/getstream/chat/android/client/helpers/AppSettingManager;Lio/getstream/chat/android/client/socket/ChatSocket;Ljava/util/List;Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;Lio/getstream/chat/android/client/user/CurrentUserFetcher;Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory$Provider;Lio/getstream/chat/android/client/audio/AudioPlayer;Lc93/a;Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository;Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;Lio/getstream/chat/android/client/receipts/MessageReceiptManager;Lio/getstream/chat/android/client/cdn/CDN;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lio/getstream/chat/android/client/attachment/AttachmentsSender;

    iget-object v7, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->appContext:Landroid/content/Context;

    iget-object v8, v0, Lio/getstream/chat/android/client/ChatClient$Builder;->uploadAttachmentsNetworkType:Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/ChatClient;->getClientState()Lio/getstream/chat/android/client/setup/state/ClientState;

    move-result-object v9

    const/16 v12, 0x10

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object v10, v15

    invoke-direct/range {v6 .. v13}, Lio/getstream/chat/android/client/attachment/AttachmentsSender;-><init>(Landroid/content/Context;Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;Lio/getstream/chat/android/client/setup/state/ClientState;Lbc3/c0;Lio/getstream/chat/android/client/attachment/AttachmentsVerifier;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v6, v5, Lio/getstream/chat/android/client/ChatClient;->attachmentsSender:Lio/getstream/chat/android/client/attachment/AttachmentsSender;

    return-object v5

    :cond_d
    new-instance v1, Ljava/lang/IllegalStateException;

    const-class v2, Lio/getstream/chat/android/client/ChatClient$Builder;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "apiKey is not defined in "

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final logLevel(Lio/getstream/chat/android/client/logger/ChatLogLevel;)Lio/getstream/chat/android/client/ChatClient$Builder;
    .locals 1

    const-string v0, "level"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->logLevel:Lio/getstream/chat/android/client/logger/ChatLogLevel;

    return-object p0
.end method

.method public final loggerHandler(Lio/getstream/chat/android/client/logger/ChatLoggerHandler;)Lio/getstream/chat/android/client/ChatClient$Builder;
    .locals 1

    const-string v0, "loggerHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->loggerHandler:Lio/getstream/chat/android/client/logger/ChatLoggerHandler;

    return-object p0
.end method

.method public final notifications(Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;)Lio/getstream/chat/android/client/ChatClient$Builder;
    .locals 2

    .line 1
    const-string v0, "notificationConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lio/getstream/chat/android/client/ChatClient$Builder;->notifications$default(Lio/getstream/chat/android/client/ChatClient$Builder;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;ILjava/lang/Object;)Lio/getstream/chat/android/client/ChatClient$Builder;

    return-object p0
.end method

.method public final notifications(Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;)Lio/getstream/chat/android/client/ChatClient$Builder;
    .locals 1

    const-string v0, "notificationConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationsHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->notificationConfig:Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->notificationsHandler:Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;

    return-object p0
.end method

.method public final okHttpClient(Lud3/l0;)Lio/getstream/chat/android/client/ChatClient$Builder;
    .locals 1

    const-string v0, "okHttpClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->customOkHttpClient:Lud3/l0;

    return-object p0
.end method

.method public final retryPolicy(Lr23/d;)Lio/getstream/chat/android/client/ChatClient$Builder;
    .locals 1

    const-string v0, "retryPolicy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->retryPolicy:Lr23/d;

    return-object p0
.end method

.method public final sendMessageInterceptor(Lio/getstream/chat/android/client/interceptor/SendMessageInterceptor;)Lio/getstream/chat/android/client/ChatClient$Builder;
    .locals 1

    const-string v0, "sendMessageInterceptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->sendMessageInterceptor:Lio/getstream/chat/android/client/interceptor/SendMessageInterceptor;

    return-object p0
.end method

.method public final uploadAttachmentsNetworkType(Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;)Lio/getstream/chat/android/client/ChatClient$Builder;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->uploadAttachmentsNetworkType:Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;

    return-object p0
.end method

.method public final withApiModelTransformer(Lio/getstream/chat/android/client/transformer/ApiModelTransformers;)Lio/getstream/chat/android/client/ChatClient$Builder;
    .locals 1

    const-string v0, "apiModelTransformers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$Builder;->apiModelTransformers:Lio/getstream/chat/android/client/transformer/ApiModelTransformers;

    return-object p0
.end method
