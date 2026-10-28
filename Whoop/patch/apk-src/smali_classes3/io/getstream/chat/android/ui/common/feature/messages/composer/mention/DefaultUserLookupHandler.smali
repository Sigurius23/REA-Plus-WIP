.class public final Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B)\u0008\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0004\u0008\u0004\u0010\rJ\u001e\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\u000e\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0002\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler;",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;",
        "localHandler",
        "remoteHandler",
        "<init>",
        "(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;)V",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "",
        "channelCid",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter;",
        "Lio/getstream/chat/android/models/User;",
        "localFilter",
        "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter;)V",
        "query",
        "",
        "handleUserLookup",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "stream-chat-android-ui-common_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final localHandler:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;

.field private final logger$delegate:Ll83/h;

.field private final remoteHandler:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "chatClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelCid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler;-><init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter<",
            "Lio/getstream/chat/android/models/User;",
            ">;)V"
        }
    .end annotation

    const-string v0, "chatClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelCid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localFilter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/LocalUserLookupHandler;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/LocalUserLookupHandler;-><init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter;)V

    .line 9
    new-instance p3, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler;

    invoke-direct {p3, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler;-><init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0, v0, p3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;)V

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 6
    new-instance p3, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/DefaultUserQueryFilter;

    const/4 p4, 0x1

    const/4 p5, 0x0

    invoke-direct {p3, p5, p4, p5}, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/DefaultUserQueryFilter;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/StreamTransliterator;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler;-><init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;)V
    .locals 1

    const-string v0, "localHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "remoteHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler;->localHandler:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;

    .line 4
    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler;->remoteHandler:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;

    .line 5
    const-string p1, "Chat:UserLookupHandler"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler;->logger$delegate:Ll83/h;

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method


# virtual methods
.method public final handleUserLookup(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler$handleUserLookup$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler$handleUserLookup$1;

    iget v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler$handleUserLookup$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler$handleUserLookup$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler$handleUserLookup$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler$handleUserLookup$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler$handleUserLookup$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler$handleUserLookup$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler$handleUserLookup$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler$handleUserLookup$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler;->getLogger()Lb23/k;

    move-result-object p2

    iget-object v2, p2, Lb23/k;->c:Lb23/e;

    iget-object v6, p2, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    const-string v2, "[handleUserLookup] query: \""

    const-string v8, "\""

    invoke-static {v2, p1, v8}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v7, v6, v2, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    iget-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler;->localHandler:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;

    iput-object p1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler$handleUserLookup$1;->L$0:Ljava/lang/Object;

    iput v5, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler$handleUserLookup$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;->handleUserLookup(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler;->getLogger()Lb23/k;

    move-result-object p2

    iget-object v2, p2, Lb23/k;->c:Lb23/e;

    iget-object v5, p2, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    const-string v2, "[handleUserLookup] no local results"

    invoke-interface {p2, v6, v5, v2, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    iget-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler;->remoteHandler:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;

    iput-object v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler$handleUserLookup$1;->L$0:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler$handleUserLookup$1;->I$0:I

    iput v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler$handleUserLookup$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;->handleUserLookup(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    :goto_2
    return-object v1

    :cond_7
    :goto_3
    check-cast p2, Ljava/util/List;

    :cond_8
    move-object p1, p2

    check-cast p1, Ljava/util/List;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v1, v4, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const-string v1, "[handleUserLookup] found "

    const-string v5, " users"

    invoke-static {p1, v1, v5}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v4, v2, p1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    return-object p2
.end method
