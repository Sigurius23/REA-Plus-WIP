.class final Lio/getstream/chat/android/client/api2/MoshiChatApi$callPostponeHelper$2$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/api2/MoshiChatApi;-><init>(Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/mapping/EventMapping;Lio/getstream/chat/android/client/api2/mapping/DtoMapping;Lio/getstream/chat/android/client/uploader/FileUploader;Lio/getstream/chat/android/client/uploader/FileTransformer;Lio/getstream/chat/android/client/api2/endpoint/UserApi;Lio/getstream/chat/android/client/api2/endpoint/GuestApi;Lio/getstream/chat/android/client/api2/endpoint/MessageApi;Lio/getstream/chat/android/client/api2/endpoint/ChannelApi;Lio/getstream/chat/android/client/api2/endpoint/DeviceApi;Lio/getstream/chat/android/client/api2/endpoint/ModerationApi;Lio/getstream/chat/android/client/api2/endpoint/GeneralApi;Lio/getstream/chat/android/client/api2/endpoint/ConfigApi;Lio/getstream/chat/android/client/api2/endpoint/FileDownloadApi;Lio/getstream/chat/android/client/api2/endpoint/OpenGraphApi;Lio/getstream/chat/android/client/api2/endpoint/ThreadsApi;Lio/getstream/chat/android/client/api2/endpoint/PollsApi;Lio/getstream/chat/android/client/api2/endpoint/RemindersApi;Lio/getstream/chat/android/client/api2/endpoint/PushPreferencesApi;Lbc3/c0;Lio/getstream/chat/android/client/scope/UserScope;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "<anonymous>",
        "()V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.api2.MoshiChatApi$callPostponeHelper$2$1"
    f = "MoshiChatApi.kt"
    l = {
        0xcb
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/api2/MoshiChatApi;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/api2/MoshiChatApi;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api2/MoshiChatApi;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/api2/MoshiChatApi$callPostponeHelper$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$callPostponeHelper$2$1;->this$0:Lio/getstream/chat/android/client/api2/MoshiChatApi;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/api2/MoshiChatApi$callPostponeHelper$2$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$callPostponeHelper$2$1;->this$0:Lio/getstream/chat/android/client/api2/MoshiChatApi;

    invoke-direct {v0, v1, p1}, Lio/getstream/chat/android/client/api2/MoshiChatApi$callPostponeHelper$2$1;-><init>(Lio/getstream/chat/android/client/api2/MoshiChatApi;Lq83/d;)V

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/api2/MoshiChatApi$callPostponeHelper$2$1;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/api2/MoshiChatApi$callPostponeHelper$2$1;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/api2/MoshiChatApi$callPostponeHelper$2$1;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/api2/MoshiChatApi$callPostponeHelper$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$callPostponeHelper$2$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$callPostponeHelper$2$1;->this$0:Lio/getstream/chat/android/client/api2/MoshiChatApi;

    invoke-static {p1}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->access$get_connectionId$p(Lio/getstream/chat/android/client/api2/MoshiChatApi;)Lec3/p1;

    move-result-object p1

    new-instance v1, Lio/getstream/chat/android/client/api2/MoshiChatApi$callPostponeHelper$2$1$1;

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v1, v4, v3}, Ls83/i;-><init>(ILq83/d;)V

    iput v2, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$callPostponeHelper$2$1;->label:I

    invoke-static {p1, v1, p0}, Lec3/v;->z(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
