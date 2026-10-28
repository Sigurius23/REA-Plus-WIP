.class public final synthetic Lio/getstream/chat/android/client/di/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/client/di/ChatModule;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/client/di/ChatModule;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/client/di/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/di/a;->x:Lio/getstream/chat/android/client/di/ChatModule;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/client/di/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/di/a;->x:Lio/getstream/chat/android/client/di/ChatModule;

    invoke-static {v0}, Lio/getstream/chat/android/client/di/ChatModule;->e(Lio/getstream/chat/android/client/di/ChatModule;)Lio/getstream/chat/android/client/parser2/DirectEventParser;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/client/di/a;->x:Lio/getstream/chat/android/client/di/ChatModule;

    invoke-static {v0}, Lio/getstream/chat/android/client/di/ChatModule;->m(Lio/getstream/chat/android/client/di/ChatModule;)Lio/getstream/chat/android/client/api2/mapping/EventMapping;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/client/di/a;->x:Lio/getstream/chat/android/client/di/ChatModule;

    invoke-static {v0}, Lio/getstream/chat/android/client/di/ChatModule;->f(Lio/getstream/chat/android/client/di/ChatModule;)Lio/getstream/chat/android/client/api2/mapping/DtoMapping;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lio/getstream/chat/android/client/di/a;->x:Lio/getstream/chat/android/client/di/ChatModule;

    invoke-static {v0}, Lio/getstream/chat/android/client/di/ChatModule;->p(Lio/getstream/chat/android/client/di/ChatModule;)Lud3/l0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lio/getstream/chat/android/client/di/a;->x:Lio/getstream/chat/android/client/di/ChatModule;

    invoke-static {v0}, Lio/getstream/chat/android/client/di/ChatModule;->c(Lio/getstream/chat/android/client/di/ChatModule;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lio/getstream/chat/android/client/di/a;->x:Lio/getstream/chat/android/client/di/ChatModule;

    invoke-static {v0}, Lio/getstream/chat/android/client/di/ChatModule;->k(Lio/getstream/chat/android/client/di/ChatModule;)Lio/getstream/chat/android/client/user/CurrentUserFetcher;

    move-result-object v0

    return-object v0

    :pswitch_5
    new-instance v0, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;

    iget-object v1, p0, Lio/getstream/chat/android/client/di/a;->x:Lio/getstream/chat/android/client/di/ChatModule;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/di/ChatModule;->getNetworkStateProvider()Lio/getstream/chat/android/client/network/NetworkStateProvider;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;-><init>(Lio/getstream/chat/android/client/network/NetworkStateProvider;)V

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lio/getstream/chat/android/client/di/a;->x:Lio/getstream/chat/android/client/di/ChatModule;

    invoke-static {v0}, Lio/getstream/chat/android/client/di/ChatModule;->h(Lio/getstream/chat/android/client/di/ChatModule;)Lio/getstream/chat/android/client/network/NetworkStateProvider;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lio/getstream/chat/android/client/di/a;->x:Lio/getstream/chat/android/client/di/ChatModule;

    invoke-static {v0}, Lio/getstream/chat/android/client/di/ChatModule;->l(Lio/getstream/chat/android/client/di/ChatModule;)Lio/getstream/chat/android/client/StreamLifecycleObserver;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lio/getstream/chat/android/client/di/a;->x:Lio/getstream/chat/android/client/di/ChatModule;

    invoke-static {v0}, Lio/getstream/chat/android/client/di/ChatModule;->d(Lio/getstream/chat/android/client/di/ChatModule;)Lio/getstream/chat/android/client/uploader/StreamFileUploader;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, Lio/getstream/chat/android/client/di/a;->x:Lio/getstream/chat/android/client/di/ChatModule;

    invoke-static {v0}, Lio/getstream/chat/android/client/di/ChatModule;->i(Lio/getstream/chat/android/client/di/ChatModule;)Lio/getstream/chat/android/client/socket/ChatSocket;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, Lio/getstream/chat/android/client/di/a;->x:Lio/getstream/chat/android/client/di/ChatModule;

    invoke-static {v0}, Lio/getstream/chat/android/client/di/ChatModule;->o(Lio/getstream/chat/android/client/di/ChatModule;)Lio/getstream/chat/android/client/api/ProxyChatApi;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, p0, Lio/getstream/chat/android/client/di/a;->x:Lio/getstream/chat/android/client/di/ChatModule;

    invoke-static {v0}, Lio/getstream/chat/android/client/di/ChatModule;->a(Lio/getstream/chat/android/client/di/ChatModule;)Lio/getstream/chat/android/client/notifications/ChatNotifications;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, p0, Lio/getstream/chat/android/client/di/a;->x:Lio/getstream/chat/android/client/di/ChatModule;

    invoke-static {v0}, Lio/getstream/chat/android/client/di/ChatModule;->g(Lio/getstream/chat/android/client/di/ChatModule;)Lio/getstream/chat/android/client/socket/SocketFactory;

    move-result-object v0

    return-object v0

    :pswitch_d
    iget-object v0, p0, Lio/getstream/chat/android/client/di/a;->x:Lio/getstream/chat/android/client/di/ChatModule;

    invoke-static {v0}, Lio/getstream/chat/android/client/di/ChatModule;->b(Lio/getstream/chat/android/client/di/ChatModule;)Lio/getstream/chat/android/client/parser2/MoshiChatParser;

    move-result-object v0

    return-object v0

    :pswitch_e
    iget-object v0, p0, Lio/getstream/chat/android/client/di/a;->x:Lio/getstream/chat/android/client/di/ChatModule;

    invoke-static {v0}, Lio/getstream/chat/android/client/di/ChatModule;->j(Lio/getstream/chat/android/client/di/ChatModule;)Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
