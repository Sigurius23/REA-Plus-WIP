.class final Lio/getstream/chat/android/client/ChatClient$getSyncHistory$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->getSyncHistory(Ljava/util/List;Ljava/lang/String;)Lo23/d;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Ln23/h;",
        "Ll83/a0;",
        "<anonymous>",
        "()Ln23/h;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.ChatClient$getSyncHistory$2"
    f = "ChatClient.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $channelsIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $parsedDate:Ljava/util/Date;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Ljava/util/List;Ljava/util/Date;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Date;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$getSyncHistory$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$getSyncHistory$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$getSyncHistory$2;->$channelsIds:Ljava/util/List;

    iput-object p3, p0, Lio/getstream/chat/android/client/ChatClient$getSyncHistory$2;->$parsedDate:Ljava/util/Date;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$getSyncHistory$2;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$getSyncHistory$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$getSyncHistory$2;->$channelsIds:Ljava/util/List;

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$getSyncHistory$2;->$parsedDate:Ljava/util/Date;

    invoke-direct {v0, v1, v2, v3, p1}, Lio/getstream/chat/android/client/ChatClient$getSyncHistory$2;-><init>(Lio/getstream/chat/android/client/ChatClient;Ljava/util/List;Ljava/util/Date;Lq83/d;)V

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/ChatClient$getSyncHistory$2;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/ChatClient$getSyncHistory$2;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$getSyncHistory$2;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/ChatClient$getSyncHistory$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lio/getstream/chat/android/client/ChatClient$getSyncHistory$2;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$getSyncHistory$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v0, p0, Lio/getstream/chat/android/client/ChatClient$getSyncHistory$2;->$channelsIds:Ljava/util/List;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$getSyncHistory$2;->$parsedDate:Ljava/util/Date;

    invoke-static {p1, v0, v1}, Lio/getstream/chat/android/client/ChatClient;->access$checkSyncHistoryPreconditions(Lio/getstream/chat/android/client/ChatClient;Ljava/util/List;Ljava/util/Date;)Ln23/h;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
