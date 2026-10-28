.class final Lio/getstream/chat/android/client/ChatClient$keystroke$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


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
    c = "io.getstream.chat.android.client.ChatClient$keystroke$2"
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

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/ChatClient;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
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
            "Lio/getstream/chat/android/client/ChatClient$keystroke$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$2;->$eventType:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$2;->$channelType:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$2;->$channelId:Ljava/lang/String;

    iput-object p5, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$2;->$extraData:Ljava/util/Map;

    iput-object p6, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$2;->$eventTime:Ljava/util/Date;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 8
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

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$keystroke$2;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$2;->$eventType:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$2;->$channelType:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$2;->$channelId:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$2;->$extraData:Ljava/util/Map;

    iget-object v6, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$2;->$eventTime:Ljava/util/Date;

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lio/getstream/chat/android/client/ChatClient$keystroke$2;-><init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;Lq83/d;)V

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/ChatClient$keystroke$2;->invoke(Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/ChatClient$keystroke$2;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$keystroke$2;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/ChatClient$keystroke$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$2;->label:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient;->getPlugins()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$2;->this$0:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$2;->$eventType:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$2;->$channelType:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$2;->$channelId:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$2;->$extraData:Ljava/util/Map;

    iget-object v6, p0, Lio/getstream/chat/android/client/ChatClient$keystroke$2;->$eventTime:Ljava/util/Date;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/plugin/Plugin;

    invoke-static {v0}, Lio/getstream/chat/android/client/ChatClient;->access$getLogger(Lio/getstream/chat/android/client/ChatClient;)Lb23/k;

    move-result-object v7

    iget-object v8, v7, Lb23/k;->c:Lb23/e;

    iget-object v9, v7, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->x:Lb23/g;

    invoke-interface {v8, v10, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_0

    iget-object v7, v7, Lb23/k;->b:Lb23/j;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    sget-object v11, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v11, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-interface {v8}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v8

    const-string v11, "[keystroke] #doOnStart; plugin: "

    invoke-static {v11, v8}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/4 v11, 0x0

    invoke-interface {v7, v10, v9, v8, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-interface/range {v1 .. v6}, Lio/getstream/chat/android/client/plugin/Plugin;->onTypingEventRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)V

    goto :goto_0

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
