.class final Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$insertChannels$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->insertChannels(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;
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
    c = "io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository$insertChannels$2"
    f = "DatabaseChannelRepository.kt"
    l = {
        0x50
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $channelToInsert:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $updatedChannels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;"
        }
    .end annotation
.end field

.field I$0:I

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;Ljava/util/List;Ljava/util/List;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$insertChannels$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$insertChannels$2;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$insertChannels$2;->$channelToInsert:Ljava/util/List;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$insertChannels$2;->$updatedChannels:Ljava/util/List;

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

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$insertChannels$2;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$insertChannels$2;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$insertChannels$2;->$channelToInsert:Ljava/util/List;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$insertChannels$2;->$updatedChannels:Ljava/util/List;

    invoke-direct {v0, v1, v2, v3, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$insertChannels$2;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;Ljava/util/List;Ljava/util/List;Lq83/d;)V

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$insertChannels$2;->invoke(Lq83/d;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$insertChannels$2;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$insertChannels$2;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$insertChannels$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$insertChannels$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$insertChannels$2;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$insertChannels$2;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->access$getLogger(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;)Lb23/k;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$insertChannels$2;->$channelToInsert:Ljava/util/List;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$insertChannels$2;->$updatedChannels:Ljava/util/List;

    iget-object v4, p1, Lb23/k;->c:Lb23/e;

    iget-object v5, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->x:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    const/4 v7, 0x0

    if-eqz v4, :cond_2

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    const-string v4, " entities on DB, updated "

    const-string v8, " on cache"

    const-string v9, "[insertChannels] inserting "

    invoke-static {v1, v3, v9, v4, v8}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v6, v5, v1, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$insertChannels$2;->$channelToInsert:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    move-object p1, v7

    :goto_0
    if-eqz p1, :cond_4

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$insertChannels$2;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->access$getChannelDao$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;

    move-result-object v1

    iput-object v7, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$insertChannels$2;->L$0:Ljava/lang/Object;

    const/4 v3, 0x0

    iput v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$insertChannels$2;->I$0:I

    iput v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$insertChannels$2;->label:I

    invoke-interface {v1, p1, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;->insertMany(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
