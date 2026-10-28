.class final Lio/getstream/chat/android/client/ChatClient$precondition$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->precondition$stream_chat_android_client_release(Lo23/d;Ljava/util/List;Lc93/m;)Lo23/d;
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
    c = "io.getstream.chat.android.client.ChatClient$precondition$1"
    f = "ChatClient.kt"
    l = {
        0x11fe
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $pluginsList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TR;>;"
        }
    .end annotation
.end field

.field final synthetic $preconditionCheck:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field I$0:I

.field I$1:I

.field I$2:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Ljava/util/List;Lc93/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TR;>;",
            "Lc93/m;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/ChatClient$precondition$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$precondition$1;->$pluginsList:Ljava/util/List;

    iput-object p2, p0, Lio/getstream/chat/android/client/ChatClient$precondition$1;->$preconditionCheck:Lc93/m;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Lio/getstream/chat/android/client/ChatClient$precondition$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$precondition$1;->$pluginsList:Ljava/util/List;

    iget-object v2, p0, Lio/getstream/chat/android/client/ChatClient$precondition$1;->$preconditionCheck:Lc93/m;

    invoke-direct {v0, v1, v2, p1}, Lio/getstream/chat/android/client/ChatClient$precondition$1;-><init>(Ljava/util/List;Lc93/m;Lq83/d;)V

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/ChatClient$precondition$1;->invoke(Lq83/d;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/ChatClient$precondition$1;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/ChatClient$precondition$1;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/ChatClient$precondition$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/ChatClient$precondition$1;->label:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget v1, p0, Lio/getstream/chat/android/client/ChatClient$precondition$1;->I$1:I

    iget v4, p0, Lio/getstream/chat/android/client/ChatClient$precondition$1;->I$0:I

    iget-object v5, p0, Lio/getstream/chat/android/client/ChatClient$precondition$1;->L$7:Ljava/lang/Object;

    check-cast v5, Ljava/util/Collection;

    iget-object v6, p0, Lio/getstream/chat/android/client/ChatClient$precondition$1;->L$4:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v7, p0, Lio/getstream/chat/android/client/ChatClient$precondition$1;->L$3:Ljava/lang/Object;

    check-cast v7, Ljava/util/Collection;

    iget-object v8, p0, Lio/getstream/chat/android/client/ChatClient$precondition$1;->L$2:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    iget-object v8, p0, Lio/getstream/chat/android/client/ChatClient$precondition$1;->L$1:Ljava/lang/Object;

    check-cast v8, Lc93/m;

    iget-object v9, p0, Lio/getstream/chat/android/client/ChatClient$precondition$1;->L$0:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$precondition$1;->$pluginsList:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    iget-object v1, p0, Lio/getstream/chat/android/client/ChatClient$precondition$1;->$preconditionCheck:Lc93/m;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {p1, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v6, p1

    move-object v8, v1

    move v1, v3

    move-object v5, v4

    move v4, v1

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    const/4 v7, 0x0

    if-eqz p1, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    iput-object v7, p0, Lio/getstream/chat/android/client/ChatClient$precondition$1;->L$0:Ljava/lang/Object;

    iput-object v8, p0, Lio/getstream/chat/android/client/ChatClient$precondition$1;->L$1:Ljava/lang/Object;

    iput-object v7, p0, Lio/getstream/chat/android/client/ChatClient$precondition$1;->L$2:Ljava/lang/Object;

    iput-object v5, p0, Lio/getstream/chat/android/client/ChatClient$precondition$1;->L$3:Ljava/lang/Object;

    iput-object v6, p0, Lio/getstream/chat/android/client/ChatClient$precondition$1;->L$4:Ljava/lang/Object;

    iput-object v7, p0, Lio/getstream/chat/android/client/ChatClient$precondition$1;->L$5:Ljava/lang/Object;

    iput-object v7, p0, Lio/getstream/chat/android/client/ChatClient$precondition$1;->L$6:Ljava/lang/Object;

    iput-object v5, p0, Lio/getstream/chat/android/client/ChatClient$precondition$1;->L$7:Ljava/lang/Object;

    iput v4, p0, Lio/getstream/chat/android/client/ChatClient$precondition$1;->I$0:I

    iput v1, p0, Lio/getstream/chat/android/client/ChatClient$precondition$1;->I$1:I

    iput v3, p0, Lio/getstream/chat/android/client/ChatClient$precondition$1;->I$2:I

    iput v2, p0, Lio/getstream/chat/android/client/ChatClient$precondition$1;->label:I

    invoke-interface {v8, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v7, v5

    :goto_1
    check-cast p1, Ln23/h;

    invoke-interface {v5, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v5, v7

    goto :goto_0

    :cond_3
    check-cast v5, Ljava/util/List;

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ln23/h;

    instance-of v1, v1, Ln23/f;

    if-eqz v1, :cond_4

    move-object v7, v0

    :cond_5
    check-cast v7, Ln23/h;

    if-nez v7, :cond_6

    new-instance p1, Ln23/g;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, v0}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_6
    return-object v7
.end method
