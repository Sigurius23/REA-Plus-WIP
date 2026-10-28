.class final Lio/getstream/chat/android/client/api2/MoshiChatApi$deleteFile$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/api2/MoshiChatApi;->deleteFile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lbc3/c0;",
        "Ln23/h;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)Ln23/h;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.api2.MoshiChatApi$deleteFile$1"
    f = "MoshiChatApi.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $channelId:Ljava/lang/String;

.field final synthetic $channelType:Ljava/lang/String;

.field final synthetic $url:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/api2/MoshiChatApi;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/api2/MoshiChatApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api2/MoshiChatApi;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/api2/MoshiChatApi$deleteFile$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$deleteFile$1;->this$0:Lio/getstream/chat/android/client/api2/MoshiChatApi;

    iput-object p2, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$deleteFile$1;->$channelType:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$deleteFile$1;->$channelId:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$deleteFile$1;->$url:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/api2/MoshiChatApi$deleteFile$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$deleteFile$1;->this$0:Lio/getstream/chat/android/client/api2/MoshiChatApi;

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$deleteFile$1;->$channelType:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$deleteFile$1;->$channelId:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$deleteFile$1;->$url:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/api2/MoshiChatApi$deleteFile$1;-><init>(Lio/getstream/chat/android/client/api2/MoshiChatApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi$deleteFile$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/api2/MoshiChatApi$deleteFile$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi$deleteFile$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi$deleteFile$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$deleteFile$1;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$deleteFile$1;->this$0:Lio/getstream/chat/android/client/api2/MoshiChatApi;

    invoke-static {p1}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->access$getFileUploader$p(Lio/getstream/chat/android/client/api2/MoshiChatApi;)Lio/getstream/chat/android/client/uploader/FileUploader;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$deleteFile$1;->$channelType:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$deleteFile$1;->$channelId:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$deleteFile$1;->this$0:Lio/getstream/chat/android/client/api2/MoshiChatApi;

    invoke-static {v2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->access$getUserId(Lio/getstream/chat/android/client/api2/MoshiChatApi;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/MoshiChatApi$deleteFile$1;->$url:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v2, v3}, Lio/getstream/chat/android/client/uploader/FileUploader;->deleteFile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ln23/h;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
