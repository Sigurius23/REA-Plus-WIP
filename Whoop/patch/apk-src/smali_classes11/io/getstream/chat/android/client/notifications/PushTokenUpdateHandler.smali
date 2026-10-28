.class public final Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\"\u0010\u000e\u001a\u00020\r2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\r2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR,\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00080\u001c8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001e\u0010\u001f\u0012\u0004\u0008\"\u0010#\u001a\u0004\u0008 \u0010!\u00a8\u0006$"
    }
    d2 = {
        "Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;",
        "",
        "Lio/getstream/chat/android/client/api/ChatApi;",
        "api",
        "<init>",
        "(Lio/getstream/chat/android/client/api/ChatApi;)V",
        "Lio/getstream/chat/android/models/User;",
        "user",
        "Lio/getstream/chat/android/models/Device;",
        "device",
        "",
        "isDeviceRegistered",
        "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Device;)Z",
        "Ll83/a0;",
        "addDevice",
        "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Device;Lq83/d;)Ljava/lang/Object;",
        "deleteDevice",
        "(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/api/ChatApi;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Lmc3/a;",
        "addDeviceLock",
        "Lmc3/a;",
        "",
        "",
        "registeredDeviceInSession",
        "Ljava/util/Map;",
        "getRegisteredDeviceInSession$stream_chat_android_client_release",
        "()Ljava/util/Map;",
        "getRegisteredDeviceInSession$stream_chat_android_client_release$annotations",
        "()V",
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
.field private final addDeviceLock:Lmc3/a;

.field private final api:Lio/getstream/chat/android/client/api/ChatApi;

.field private final logger$delegate:Ll83/h;

.field private final registeredDeviceInSession:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Device;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/api/ChatApi;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;->api:Lio/getstream/chat/android/client/api/ChatApi;

    const-string p1, "Chat:Notifications-UH"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;->logger$delegate:Ll83/h;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;->addDeviceLock:Lmc3/a;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;->registeredDeviceInSession:Ljava/util/Map;

    return-void
.end method

.method public static final synthetic access$getLogger(Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;)Lb23/k;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;->getLogger()Lb23/k;

    move-result-object p0

    return-object p0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public static synthetic getRegisteredDeviceInSession$stream_chat_android_client_release$annotations()V
    .locals 0

    return-void
.end method

.method private final isDeviceRegistered(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Device;)Z
    .locals 2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getDevices()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;->registeredDeviceInSession:Ljava/util/Map;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Device;

    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public final addDevice(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Device;Lq83/d;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Lio/getstream/chat/android/models/Device;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p3

    const-string v3, "[addDevice] Failed to add device "

    const-string v4, "[addDevice] Successfully added device "

    const-string v5, "[addDevice] Device "

    instance-of v6, v2, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$addDevice$1;

    if-eqz v6, :cond_0

    move-object v6, v2

    check-cast v6, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$addDevice$1;

    iget v7, v6, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$addDevice$1;->label:I

    const/high16 v8, -0x80000000

    and-int v9, v7, v8

    if-eqz v9, :cond_0

    sub-int/2addr v7, v8

    iput v7, v6, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$addDevice$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v6, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$addDevice$1;

    invoke-direct {v6, v1, v2}, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$addDevice$1;-><init>(Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;Lq83/d;)V

    :goto_0
    iget-object v2, v6, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$addDevice$1;->result:Ljava/lang/Object;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v8, v6, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$addDevice$1;->label:I

    const/4 v9, 0x0

    const/4 v10, 0x2

    const/4 v11, 0x1

    sget-object v12, Ll83/a0;->a:Ll83/a0;

    const/4 v13, 0x0

    if-eqz v8, :cond_3

    if-eq v8, v11, :cond_2

    if-ne v8, v10, :cond_1

    iget-object v0, v6, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$addDevice$1;->L$2:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lmc3/a;

    iget-object v0, v6, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$addDevice$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/Device;

    iget-object v6, v6, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$addDevice$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/models/User;

    :try_start_0
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v0, v6, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$addDevice$1;->I$0:I

    iget-object v8, v6, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$addDevice$1;->L$2:Ljava/lang/Object;

    check-cast v8, Lmc3/a;

    iget-object v11, v6, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$addDevice$1;->L$1:Ljava/lang/Object;

    check-cast v11, Lio/getstream/chat/android/models/Device;

    iget-object v14, v6, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$addDevice$1;->L$0:Ljava/lang/Object;

    check-cast v14, Lio/getstream/chat/android/models/User;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, v8

    move-object v8, v11

    goto :goto_1

    :cond_3
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    if-nez v0, :cond_5

    invoke-direct {v1}, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/models/Device;->getToken()Ljava/lang/String;

    move-result-object v2

    const-string v5, "[addDevice] User is null, cannot add device "

    invoke-static {v5, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v4, v3, v2, v13}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    return-object v12

    :cond_5
    iget-object v2, v1, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;->addDeviceLock:Lmc3/a;

    iput-object v0, v6, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$addDevice$1;->L$0:Ljava/lang/Object;

    move-object/from16 v8, p2

    iput-object v8, v6, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$addDevice$1;->L$1:Ljava/lang/Object;

    iput-object v2, v6, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$addDevice$1;->L$2:Ljava/lang/Object;

    iput v9, v6, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$addDevice$1;->I$0:I

    iput v11, v6, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$addDevice$1;->label:I

    invoke-interface {v2, v6}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v7, :cond_6

    goto :goto_3

    :cond_6
    move-object v14, v0

    move v0, v9

    :goto_1
    :try_start_1
    invoke-direct {v1, v14, v8}, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;->isDeviceRegistered(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Device;)Z

    move-result v11

    if-eqz v11, :cond_8

    iget-object v0, v1, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;->registeredDeviceInSession:Ljava/util/Map;

    invoke-virtual {v14}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v1}, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v3, v0, Lb23/k;->c:Lb23/e;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->y:Lb23/g;

    invoke-interface {v3, v6, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {v8}, Lio/getstream/chat/android/models/Device;->getToken()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " is already registered for "

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", skipping."

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v6, v4, v3, v13}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v5, v2

    goto/16 :goto_7

    :cond_7
    :goto_2
    invoke-interface {v2, v13}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object v12

    :cond_8
    :try_start_2
    iget-object v5, v1, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;->api:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v5, v8}, Lio/getstream/chat/android/client/api/ChatApi;->addDevice(Lio/getstream/chat/android/models/Device;)Lo23/d;

    move-result-object v5

    iput-object v14, v6, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$addDevice$1;->L$0:Ljava/lang/Object;

    iput-object v8, v6, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$addDevice$1;->L$1:Ljava/lang/Object;

    iput-object v2, v6, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$addDevice$1;->L$2:Ljava/lang/Object;

    iput v0, v6, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$addDevice$1;->I$0:I

    iput v9, v6, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$addDevice$1;->I$1:I

    iput-boolean v11, v6, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$addDevice$1;->Z$0:Z

    iput v10, v6, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$addDevice$1;->label:I

    invoke-interface {v5, v6}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v0, v7, :cond_9

    :goto_3
    return-object v7

    :cond_9
    move-object v5, v2

    move-object v6, v14

    move-object v2, v0

    move-object v0, v8

    :goto_4
    :try_start_3
    check-cast v2, Ln23/h;

    instance-of v7, v2, Ln23/g;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const-string v8, " for "

    if-eqz v7, :cond_a

    :try_start_4
    move-object v7, v2

    check-cast v7, Ln23/g;

    iget-object v7, v7, Ln23/g;->a:Ljava/lang/Object;

    check-cast v7, Ll83/a0;

    iget-object v7, v1, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;->registeredDeviceInSession:Ljava/util/Map;

    invoke-virtual {v6}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v7, v9, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v1}, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;->getLogger()Lb23/k;

    move-result-object v7

    iget-object v9, v7, Lb23/k;->c:Lb23/e;

    iget-object v10, v7, Lb23/k;->a:Ljava/lang/String;

    sget-object v11, Lb23/g;->y:Lb23/g;

    invoke-interface {v9, v11, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_b

    iget-object v7, v7, Lb23/k;->b:Lb23/j;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Device;->getToken()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v14

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v7, v11, v10, v4, v13}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_5

    :cond_a
    instance-of v4, v2, Ln23/f;

    if-eqz v4, :cond_e

    :cond_b
    :goto_5
    instance-of v4, v2, Ln23/g;

    if-nez v4, :cond_d

    instance-of v4, v2, Ln23/f;

    if-eqz v4, :cond_c

    check-cast v2, Ln23/f;

    iget-object v2, v2, Ln23/f;->a:Ln23/e;

    invoke-direct {v1}, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;->getLogger()Lb23/k;

    move-result-object v4

    iget-object v7, v4, Lb23/k;->c:Lb23/e;

    iget-object v9, v4, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->F:Lb23/g;

    invoke-interface {v7, v10, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_d

    iget-object v4, v4, Lb23/k;->b:Lb23/j;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Device;->getToken()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v10, v9, v0, v13}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_c
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_d
    :goto_6
    invoke-interface {v5, v13}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object v12

    :cond_e
    :try_start_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_7
    invoke-interface {v5, v13}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v0
.end method

.method public final deleteDevice(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$deleteDevice$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$deleteDevice$1;

    iget v1, v0, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$deleteDevice$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$deleteDevice$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$deleteDevice$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$deleteDevice$1;-><init>(Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$deleteDevice$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$deleteDevice$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$deleteDevice$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Device;

    iget-object v0, v0, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$deleteDevice$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/User;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, p2

    move-object p2, p1

    move-object p1, v0

    move-object v0, v11

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    if-nez p1, :cond_3

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;->getLogger()Lb23/k;

    move-result-object p1

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    iget-object v0, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v1, Lb23/g;->y:Lb23/g;

    invoke-interface {p2, v1, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_9

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string p2, "[deleteDevice] User is null, cannot delete device."

    invoke-interface {p1, v1, v0, p2, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v5

    :cond_3
    iget-object p2, p0, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;->registeredDeviceInSession:Ljava/util/Map;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/models/Device;

    if-nez p2, :cond_4

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;->getLogger()Lb23/k;

    move-result-object p2

    iget-object v0, p2, Lb23/k;->c:Lb23/e;

    iget-object v1, p2, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p1

    const-string v0, "[deleteDevice] No device tracked in session for user "

    const-string v4, ", skipping deletion."

    invoke-static {v0, p1, v4}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v2, v1, p1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v5

    :cond_4
    iget-object v2, p0, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;->api:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Device;->getToken()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2, v6}, Lio/getstream/chat/android/client/api/ChatApi;->deleteDevice(Ljava/lang/String;)Lo23/d;

    move-result-object v2

    iput-object p1, v0, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$deleteDevice$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$deleteDevice$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler$deleteDevice$1;->label:I

    invoke-interface {v2, v0}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    return-object v1

    :cond_5
    :goto_1
    check-cast v0, Ln23/h;

    instance-of v1, v0, Ln23/g;

    const-string v2, " for "

    if-eqz v1, :cond_6

    move-object v4, v0

    check-cast v4, Ln23/g;

    iget-object v4, v4, Ln23/g;->a:Ljava/lang/Object;

    check-cast v4, Ll83/a0;

    iget-object v4, p0, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;->registeredDeviceInSession:Ljava/util/Map;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;->getLogger()Lb23/k;

    move-result-object v4

    iget-object v6, v4, Lb23/k;->c:Lb23/e;

    iget-object v7, v4, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->y:Lb23/g;

    invoke-interface {v6, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    iget-object v4, v4, Lb23/k;->b:Lb23/j;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Device;->getToken()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v9

    const-string v10, "[deleteDevice] Successfully deleted device "

    invoke-static {v10, v6, v2, v9}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v8, v7, v6, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_6
    instance-of v4, v0, Ln23/f;

    if-eqz v4, :cond_a

    :cond_7
    :goto_2
    if-nez v1, :cond_9

    instance-of v1, v0, Ln23/f;

    if-eqz v1, :cond_8

    check-cast v0, Ln23/f;

    iget-object v0, v0, Ln23/f;->a:Ln23/e;

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v4, v1, Lb23/k;->c:Lb23/e;

    iget-object v6, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->F:Lb23/g;

    invoke-interface {v4, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_9

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Device;->getToken()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p1

    const-string v4, "[deleteDevice] Failed to delete device "

    const-string v8, ", "

    invoke-static {v4, p2, v2, p1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v7, v6, p1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v5

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    return-object v5

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final getRegisteredDeviceInSession$stream_chat_android_client_release()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Device;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;->registeredDeviceInSession:Ljava/util/Map;

    return-object v0
.end method
