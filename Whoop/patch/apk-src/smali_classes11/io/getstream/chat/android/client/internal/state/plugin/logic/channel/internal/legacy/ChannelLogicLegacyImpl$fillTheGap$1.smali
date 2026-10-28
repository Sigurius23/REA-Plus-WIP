.class final Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->fillTheGap(ILjava/util/List;Ljava/util/List;)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.ChannelLogicLegacyImpl$fillTheGap$1"
    f = "ChannelLogicLegacyImpl.kt"
    l = {
        0x126,
        0x12e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $loadedMessages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $messageLimit:I

.field final synthetic $requestedMessages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation
.end field

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;ILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;",
            "I",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->$loadedMessages:Ljava/util/List;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->$requestedMessages:Ljava/util/List;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->this$0:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;

    iput p4, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->$messageLimit:I

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

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->$loadedMessages:Ljava/util/List;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->$requestedMessages:Ljava/util/List;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->this$0:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;

    iget v4, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->$messageLimit:I

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;-><init>(Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;ILq83/d;)V

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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$6:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$4:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$3:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$2:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$6:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$4:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$3:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$2:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->$loadedMessages:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/models/Message;

    invoke-static {v5}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrNull(Lio/getstream/chat/android/models/Message;)Ljava/util/Date;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    new-instance p1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1$invokeSuspend$$inlined$sortedBy$1;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-static {v1, p1}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {p1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->$requestedMessages:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lio/getstream/chat/android/models/Message;

    invoke-static {v7}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrNull(Lio/getstream/chat/android/models/Message;)Ljava/util/Date;

    move-result-object v7

    if-eqz v7, :cond_6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    new-instance p1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1$invokeSuspend$$inlined$sortedBy$2;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-static {v5, p1}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {p1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_8
    invoke-static {v5}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v1, p1}, Lm83/s;->K0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->$loadedMessages:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/models/Message;

    new-instance v6, Ljava/util/Date;

    invoke-direct {v6}, Ljava/util/Date;-><init>()V

    invoke-static {v4, v6}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object v4

    :cond_9
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/getstream/chat/android/models/Message;

    new-instance v7, Ljava/util/Date;

    invoke-direct {v7}, Ljava/util/Date;-><init>()V

    invoke-static {v6, v7}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v7

    if-lez v7, :cond_9

    move-object v4, v6

    goto :goto_4

    :cond_a
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->$loadedMessages:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/getstream/chat/android/models/Message;

    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object v7

    invoke-static {v6, v7}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object v6

    :cond_b
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/getstream/chat/android/models/Message;

    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object v8

    invoke-static {v7, v8}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v8

    if-gez v8, :cond_b

    move-object v6, v7

    goto :goto_5

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->$requestedMessages:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_19

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/getstream/chat/android/models/Message;

    new-instance v8, Ljava/util/Date;

    invoke-direct {v8}, Ljava/util/Date;-><init>()V

    invoke-static {v7, v8}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object v7

    :cond_d
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/getstream/chat/android/models/Message;

    new-instance v9, Ljava/util/Date;

    invoke-direct {v9}, Ljava/util/Date;-><init>()V

    invoke-static {v8, v9}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v9

    if-lez v9, :cond_d

    move-object v7, v8

    goto :goto_6

    :cond_e
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->$requestedMessages:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_18

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/getstream/chat/android/models/Message;

    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object v9

    invoke-static {v8, v9}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object v8

    :cond_f
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lio/getstream/chat/android/models/Message;

    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object v10

    invoke-static {v9, v10}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v10

    if-gez v10, :cond_f

    move-object v8, v9

    goto :goto_7

    :cond_10
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_17

    invoke-virtual {v4, v8}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result p1

    const/4 v1, 0x0

    if-lez p1, :cond_12

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->this$0:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;

    iget v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->$messageLimit:I

    invoke-static {v5}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {p1, v2, v4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->access$newerWatchChannelRequest(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;ILjava/lang/String;)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    move-result-object v2

    iput-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$0:Ljava/lang/Object;

    iput-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$1:Ljava/lang/Object;

    iput-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$2:Ljava/lang/Object;

    iput-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$3:Ljava/lang/Object;

    iput-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$4:Ljava/lang/Object;

    iput-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$5:Ljava/lang/Object;

    iput-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$6:Ljava/lang/Object;

    iput v3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->label:I

    invoke-static {p1, v2, p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->access$runChannelQueryOnline(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_11

    goto :goto_9

    :cond_11
    :goto_8
    move-object v1, p1

    check-cast v1, Ln23/h;

    goto :goto_b

    :cond_12
    invoke-virtual {v6, v7}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result p1

    if-gez p1, :cond_14

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->this$0:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;

    iget v3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->$messageLimit:I

    invoke-static {v5}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {p1, v3, v4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->access$olderWatchChannelRequest(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;ILjava/lang/String;)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    move-result-object v3

    iput-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$0:Ljava/lang/Object;

    iput-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$1:Ljava/lang/Object;

    iput-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$2:Ljava/lang/Object;

    iput-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$3:Ljava/lang/Object;

    iput-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$4:Ljava/lang/Object;

    iput-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$5:Ljava/lang/Object;

    iput-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->L$6:Ljava/lang/Object;

    iput v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->label:I

    invoke-static {p1, v3, p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->access$runChannelQueryOnline(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_13

    :goto_9
    return-object v0

    :cond_13
    :goto_a
    move-object v1, p1

    check-cast v1, Ln23/h;

    :cond_14
    :goto_b
    if-eqz v1, :cond_17

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->this$0:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->$messageLimit:I

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;->$loadedMessages:Ljava/util/List;

    instance-of v3, v1, Ln23/g;

    if-eqz v3, :cond_15

    check-cast v1, Ln23/g;

    iget-object v1, v1, Ln23/g;->a:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Channel;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object v1

    invoke-static {p1, v0, v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->access$fillTheGap(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;ILjava/util/List;Ljava/util/List;)V

    goto :goto_c

    :cond_15
    instance-of p1, v1, Ln23/f;

    if-eqz p1, :cond_16

    goto :goto_c

    :cond_16
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_17
    :goto_c
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_18
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    throw p1

    :cond_19
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    throw p1

    :cond_1a
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    throw p1

    :cond_1b
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    throw p1
.end method
