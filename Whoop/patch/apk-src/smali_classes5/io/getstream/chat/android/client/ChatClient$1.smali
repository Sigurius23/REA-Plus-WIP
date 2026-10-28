.class final synthetic Lio/getstream/chat/android/client/ChatClient$1;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;-><init>(Lio/getstream/chat/android/client/api/ChatApiConfig;Lio/getstream/chat/android/client/api/ChatApi;Lio/getstream/chat/android/client/api2/mapping/DtoMapping;Lio/getstream/chat/android/client/notifications/ChatNotifications;Lio/getstream/chat/android/client/token/TokenManager;Lio/getstream/chat/android/client/user/storage/UserCredentialStorage;Lio/getstream/chat/android/client/clientstate/UserStateService;Lio/getstream/chat/android/client/debugger/ChatClientDebugger;Lio/getstream/chat/android/client/utils/TokenUtils;Lio/getstream/chat/android/client/scope/ClientScope;Lio/getstream/chat/android/client/scope/UserScope;Lr23/d;Lio/getstream/chat/android/client/helpers/AppSettingManager;Lio/getstream/chat/android/client/socket/ChatSocket;Ljava/util/List;Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;Lio/getstream/chat/android/client/user/CurrentUserFetcher;Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory$Provider;Lio/getstream/chat/android/client/audio/AudioPlayer;Lc93/a;Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository;Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;Lio/getstream/chat/android/client/receipts/MessageReceiptManager;Lio/getstream/chat/android/client/cdn/CDN;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/i;",
        "Lc93/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lio/getstream/chat/android/client/ChatClient$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$1;

    invoke-direct {v0}, Lio/getstream/chat/android/client/ChatClient$1;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/ChatClient$1;->INSTANCE:Lio/getstream/chat/android/client/ChatClient$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "<init>()V"

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-class v2, Ljava/util/Date;

    const-string v3, "<init>"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    return-object v0
.end method

.method public final invoke()Ljava/util/Date;
    .locals 1

    .line 2
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    return-object v0
.end method
