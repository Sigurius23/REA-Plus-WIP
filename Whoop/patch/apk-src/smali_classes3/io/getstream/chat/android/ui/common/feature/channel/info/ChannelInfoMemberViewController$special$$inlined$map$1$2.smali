.class public final Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $this_unsafeFlow:Lec3/m;

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;


# direct methods
.method public constructor <init>(Lec3/m;Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1$2;->$this_unsafeFlow:Lec3/m;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1$2;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1$2$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1$2$1;

    iget v1, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1$2$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1$2$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1$2$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1$2$1;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1$2;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1$2$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1$2$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1$2$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1$2$1;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1$2;->$this_unsafeFlow:Lec3/m;

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1$2;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object v4

    invoke-static {v2, v4}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->access$setMember$p(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;Lio/getstream/chat/android/models/Member;)V

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1$2;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->getDistinctChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_3
    move-object v4, v5

    :goto_1
    invoke-static {v2, v4}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->access$setDistinctCid$p(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->getChannelData()Lio/getstream/chat/android/models/ChannelData;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/models/ChannelData;->getOwnCapabilities()Ljava/util/Set;

    move-result-object v4

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->getMutedUsers()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    instance-of v7, v6, Ljava/util/Collection;

    const/4 v8, 0x0

    if-eqz v7, :cond_5

    move-object v7, v6

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_5

    :cond_4
    move v6, v8

    goto :goto_3

    :cond_5
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/getstream/chat/android/models/Mute;

    invoke-virtual {v7}, Lio/getstream/chat/android/models/Mute;->getTarget()Lio/getstream/chat/android/models/User;

    move-result-object v7

    if-eqz v7, :cond_7

    invoke-virtual {v7}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    :cond_7
    move-object v7, v5

    :goto_2
    iget-object v9, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1$2;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;

    invoke-static {v9}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->access$getMemberId$p(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    move v6, v3

    :goto_3
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->getBlockedUserIds()Ljava/util/List;

    move-result-object p1

    iget-object v7, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1$2;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;

    invoke-static {v7}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;->access$getMemberId$p(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {p1, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    new-instance v7, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoMemberViewState$Content;

    invoke-direct {v7, v2, v4, v6, p1}, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoMemberViewState$Content;-><init>(Lio/getstream/chat/android/models/Member;Ljava/util/Set;ZZ)V

    iput-object v5, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1$2$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1$2$1;->L$2:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1$2$1;->L$3:Ljava/lang/Object;

    iput v8, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1$2$1;->I$0:I

    iput v3, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$special$$inlined$map$1$2$1;->label:I

    invoke-interface {p2, v7, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    return-object v1

    :cond_8
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
