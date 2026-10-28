.class public final Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010#\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001b\u0010\u000c\u001a\u00020\t2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\u000bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\t2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\u0010\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\t2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0006\u00a2\u0006\u0004\u0008\u0013\u0010\u000bJ\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u000eJ\u0015\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u000eJ(\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010 R\u001a\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00070!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u001a\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00070!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010#R\u001a\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00070!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010#R\u001a\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00110!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010#R\u001a\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u00070!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010#R\u001a\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00070!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010#\u00a8\u0006)"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;",
        "",
        "",
        "id",
        "<init>",
        "(I)V",
        "",
        "",
        "cIds",
        "Ll83/a0;",
        "addToFetchChannels",
        "(Ljava/util/List;)V",
        "addToRemoveChannels",
        "cId",
        "(Ljava/lang/String;)V",
        "ids",
        "addToFetchMessages",
        "Lio/getstream/chat/android/models/User;",
        "usersToAdd",
        "addUsers",
        "pollId",
        "addPollToFetch",
        "threadId",
        "addThreadToFetch",
        "Lio/getstream/chat/android/client/api/state/GlobalState;",
        "globalState",
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
        "repos",
        "currentUserId",
        "Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;",
        "build",
        "(Lio/getstream/chat/android/client/api/state/GlobalState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "I",
        "",
        "channelsToFetch",
        "Ljava/util/Set;",
        "channelsToRemove",
        "messagesToFetch",
        "users",
        "pollsToFetch",
        "threadsToFetch",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final channelsToFetch:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final channelsToRemove:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final id:I

.field private final messagesToFetch:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final pollsToFetch:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final threadsToFetch:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final users:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->id:I

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->channelsToFetch:Ljava/util/Set;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->channelsToRemove:Ljava/util/Set;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->messagesToFetch:Ljava/util/Set;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->users:Ljava/util/Set;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->pollsToFetch:Ljava/util/Set;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->threadsToFetch:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final addPollToFetch(Ljava/lang/String;)V
    .locals 1

    const-string v0, "pollId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->pollsToFetch:Ljava/util/Set;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final addThreadToFetch(Ljava/lang/String;)V
    .locals 1

    const-string v0, "threadId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->threadsToFetch:Ljava/util/Set;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final addToFetchChannels(Ljava/lang/String;)V
    .locals 1

    const-string v0, "cId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->channelsToFetch:Ljava/util/Set;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final addToFetchChannels(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "cIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->channelsToFetch:Ljava/util/Set;

    check-cast v0, Ljava/util/Collection;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v0, p1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    return-void
.end method

.method public final addToFetchMessages(Ljava/lang/String;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->messagesToFetch:Ljava/util/Set;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final addToFetchMessages(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "ids"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->messagesToFetch:Ljava/util/Set;

    check-cast v0, Ljava/util/Collection;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v0, p1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    return-void
.end method

.method public final addToRemoveChannels(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "cIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->channelsToRemove:Ljava/util/Set;

    check-cast v0, Ljava/util/Collection;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v0, p1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    return-void
.end method

.method public final addUsers(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;)V"
        }
    .end annotation

    const-string v0, "usersToAdd"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->users:Ljava/util/Set;

    check-cast v0, Ljava/util/Collection;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v0, p1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    return-void
.end method

.method public final build(Lio/getstream/chat/android/client/api/state/GlobalState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/state/GlobalState;",
            "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    instance-of v2, v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;

    iget v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;-><init>(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->label:I

    const/16 v5, 0x10

    const/16 v6, 0xa

    const/4 v7, 0x0

    const/4 v8, 0x0

    packed-switch v4, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$4:Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$3:Ljava/lang/Object;

    check-cast v4, Ljava/util/Map;

    iget-object v7, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$2:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$1:Ljava/lang/Object;

    check-cast v9, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iget-object v2, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/client/api/state/GlobalState;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, v7

    :goto_1
    move-object v12, v2

    move-object v13, v9

    goto/16 :goto_b

    :pswitch_1
    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$3:Ljava/lang/Object;

    check-cast v4, Ljava/util/Map;

    iget-object v7, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$2:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$1:Ljava/lang/Object;

    check-cast v9, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$0:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/client/api/state/GlobalState;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v13, v7

    move-object v7, v4

    move-object v4, v2

    move-object v2, v10

    goto/16 :goto_8

    :pswitch_2
    iget v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->I$1:I

    iget v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->I$0:I

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$9:Ljava/lang/Object;

    check-cast v10, Ljava/util/Collection;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$8:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$6:Ljava/lang/Object;

    check-cast v11, Ljava/util/Iterator;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$5:Ljava/lang/Object;

    check-cast v12, Ljava/util/Collection;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$4:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Iterable;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$3:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Iterable;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$2:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v14, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$1:Ljava/lang/Object;

    check-cast v14, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iget-object v15, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$0:Ljava/lang/Object;

    check-cast v15, Lio/getstream/chat/android/client/api/state/GlobalState;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_3
    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$2:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$1:Ljava/lang/Object;

    check-cast v9, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$0:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/client/api/state/GlobalState;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_4
    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$2:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$1:Ljava/lang/Object;

    check-cast v9, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$0:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/client/api/state/GlobalState;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_5
    iget v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->I$0:I

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$6:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$4:Ljava/lang/Object;

    check-cast v9, Ljava/util/Iterator;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$3:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$2:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$1:Ljava/lang/Object;

    check-cast v11, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$0:Ljava/lang/Object;

    check-cast v12, Lio/getstream/chat/android/client/api/state/GlobalState;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v1, v9

    move-object v9, v2

    move-object v2, v11

    move-object v11, v1

    move-object v1, v10

    move v10, v4

    move-object v4, v1

    move-object v1, v12

    goto :goto_2

    :pswitch_6
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->channelsToRemove:Ljava/util/Set;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object/from16 v4, p3

    move-object v11, v1

    move-object v9, v2

    move v10, v7

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    :cond_1
    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_2

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    iput-object v1, v9, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$0:Ljava/lang/Object;

    iput-object v2, v9, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$1:Ljava/lang/Object;

    iput-object v4, v9, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$2:Ljava/lang/Object;

    iput-object v8, v9, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$3:Ljava/lang/Object;

    iput-object v11, v9, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$4:Ljava/lang/Object;

    iput-object v8, v9, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$5:Ljava/lang/Object;

    iput-object v8, v9, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$6:Ljava/lang/Object;

    iput v10, v9, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->I$0:I

    iput v7, v9, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->I$1:I

    const/4 v13, 0x1

    iput v13, v9, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->label:I

    invoke-virtual {v2, v12, v9}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->deleteChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v3, :cond_1

    goto/16 :goto_a

    :cond_2
    iget-object v10, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->users:Ljava/util/Set;

    check-cast v10, Ljava/util/Collection;

    iput-object v1, v9, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$0:Ljava/lang/Object;

    iput-object v2, v9, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$1:Ljava/lang/Object;

    iput-object v4, v9, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$2:Ljava/lang/Object;

    iput-object v8, v9, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$3:Ljava/lang/Object;

    iput-object v8, v9, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$4:Ljava/lang/Object;

    iput-object v8, v9, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$5:Ljava/lang/Object;

    iput-object v8, v9, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$6:Ljava/lang/Object;

    const/4 v11, 0x2

    iput v11, v9, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->label:I

    invoke-virtual {v2, v10, v9}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->insertUsers(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v3, :cond_3

    goto/16 :goto_a

    :cond_3
    move-object v10, v9

    move-object v9, v2

    move-object v2, v10

    move-object v10, v1

    :goto_3
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->messagesToFetch:Ljava/util/Set;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$0:Ljava/lang/Object;

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$1:Ljava/lang/Object;

    iput-object v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$2:Ljava/lang/Object;

    const/4 v11, 0x3

    iput v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->label:I

    invoke-virtual {v9, v1, v2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectMessages(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_4

    goto/16 :goto_a

    :cond_4
    :goto_4
    check-cast v1, Ljava/util/Collection;

    iget-object v11, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->pollsToFetch:Ljava/util/Set;

    check-cast v11, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    move-object v13, v4

    move v4, v7

    move-object v14, v9

    move-object v15, v10

    move-object v10, v1

    move v9, v4

    :goto_5
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$0:Ljava/lang/Object;

    iput-object v14, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$1:Ljava/lang/Object;

    iput-object v13, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$4:Ljava/lang/Object;

    iput-object v12, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$5:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$6:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$7:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$8:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$9:Ljava/lang/Object;

    iput v9, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->I$0:I

    iput v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->I$1:I

    iput v7, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->I$2:I

    const/4 v7, 0x4

    iput v7, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->label:I

    invoke-virtual {v14, v1, v2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectMessagesWithPoll(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_5

    goto/16 :goto_a

    :cond_5
    :goto_6
    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v12, v1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    const/4 v7, 0x0

    goto :goto_5

    :cond_6
    check-cast v12, Ljava/util/List;

    check-cast v12, Ljava/lang/Iterable;

    invoke-static {v10, v12}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-static {v4}, Lm83/g0;->W(I)I

    move-result v4

    if-ge v4, v5, :cond_7

    move v4, v5

    :cond_7
    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v9}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v7, v9, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_8
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->channelsToFetch:Ljava/util/Set;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$0:Ljava/lang/Object;

    iput-object v14, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$1:Ljava/lang/Object;

    iput-object v13, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$2:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$5:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$6:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$7:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$8:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$9:Ljava/lang/Object;

    const/4 v4, 0x5

    iput v4, v2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->label:I

    invoke-virtual {v14, v1, v8, v2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectChannels(Ljava/util/List;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_9

    goto :goto_a

    :cond_9
    move-object v4, v2

    move-object v9, v14

    move-object v2, v15

    :goto_8
    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-static {v10}, Lm83/g0;->W(I)I

    move-result v10

    if-ge v10, v5, :cond_a

    move v10, v5

    :cond_a
    new-instance v11, Ljava/util/LinkedHashMap;

    invoke-direct {v11, v10}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v12, v10

    check-cast v12, Lio/getstream/chat/android/models/Channel;

    invoke-virtual {v12}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v11, v12, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_9

    :cond_b
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->threadsToFetch:Ljava/util/Set;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    iput-object v2, v4, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$0:Ljava/lang/Object;

    iput-object v9, v4, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$1:Ljava/lang/Object;

    iput-object v13, v4, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$2:Ljava/lang/Object;

    iput-object v7, v4, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$3:Ljava/lang/Object;

    iput-object v11, v4, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->L$4:Ljava/lang/Object;

    const/4 v10, 0x6

    iput v10, v4, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder$build$1;->label:I

    invoke-virtual {v9, v1, v4}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectThreads(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_c

    :goto_a
    return-object v3

    :cond_c
    move-object v4, v7

    move-object v3, v11

    move-object v11, v13

    goto/16 :goto_1

    :goto_b
    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    if-ge v2, v5, :cond_d

    move v2, v5

    :cond_d
    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lio/getstream/chat/android/models/Thread;

    invoke-virtual {v9}, Lio/getstream/chat/android/models/Thread;->getParentMessageId()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v7, v9, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_c

    :cond_e
    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    const-string v9, "Chat:EventBatchUpdate"

    invoke-interface {v1, v2, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_f

    sget-object v1, Lb23/i;->c:Lb23/j;

    iget v10, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->id:I

    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v14

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v15

    const-string v5, ", messageMap.size: "

    const-string v6, ", channelMap.size: "

    const-string v8, "[builder.build] id: "

    invoke-static {v10, v14, v8, v5, v6}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-interface {v1, v2, v9, v5, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_f
    iget v10, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->id:I

    invoke-static {v3}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v14

    invoke-static {v4}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v15

    invoke-static {v7}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;->users:Ljava/util/Set;

    check-cast v2, Ljava/lang/Iterable;

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-static {v3}, Lm83/g0;->W(I)I

    move-result v3

    const/16 v4, 0x10

    if-ge v3, v4, :cond_10

    move v5, v4

    goto :goto_d

    :cond_10
    move v5, v3

    :goto_d
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/models/User;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_e

    :cond_11
    invoke-static {v3}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v17

    new-instance v9, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;

    const/16 v18, 0x0

    move-object/from16 v16, v1

    invoke-direct/range {v9 .. v18}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;-><init>(ILjava/lang/String;Lio/getstream/chat/android/client/api/state/GlobalState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
