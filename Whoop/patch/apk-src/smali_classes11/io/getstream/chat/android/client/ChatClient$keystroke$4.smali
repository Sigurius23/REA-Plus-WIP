.class final Lio/getstream/chat/android/client/ChatClient$keystroke$4;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->keystroke(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;
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
        "Lio/getstream/chat/android/client/plugin/Plugin;",
        "Ln23/h;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lio/getstream/chat/android/client/plugin/Plugin;)Ln23/h;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.ChatClient$keystroke$4"
    f = "ChatClient.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $channelId:Ljava/lang/String;

.field final synthetic $channelType:Ljava/lang/String;

.field final synthetic $eventTime:Ljava/util/Date;

.field final synthetic $eventType:Ljava/lang/String;

.field final synthetic $extraData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Date;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$keystroke$4;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$4;->$eventType:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$4;->$channelType:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$4;->$channelId:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$4;->$extraData:Ljava/util/Map;

    iput-object p5, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$4;->$eventTime:Ljava/util/Date;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$keystroke$4;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$4;->$eventType:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$4;->$channelType:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$4;->$channelId:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$4;->$extraData:Ljava/util/Map;

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$4;->$eventTime:Ljava/util/Date;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/client/ChatClient$keystroke$4;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/ChatClient$keystroke$4;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lio/getstream/chat/android/client/plugin/Plugin;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/plugin/Plugin;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$keystroke$4;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$keystroke$4;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/ChatClient$keystroke$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lio/getstream/chat/android/client/plugin/Plugin;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient$keystroke$4;->invoke(Lio/getstream/chat/android/client/plugin/Plugin;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$4;->L$0:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/client/plugin/Plugin;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$4;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$4;->$eventType:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$4;->$channelType:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$4;->$channelId:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$4;->$extraData:Ljava/util/Map;

    iget-object v6, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$4;->$eventTime:Ljava/util/Date;

    invoke-interface/range {v1 .. v6}, Lio/getstream/chat/android/client/plugin/Plugin;->onTypingEventPrecondition(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)Ln23/h;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
