.class public final Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/LocalUserLookupHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/LocalUserLookupHandler$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001e\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000c2\u0006\u0010\u000b\u001a\u00020\u0004H\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0010R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/LocalUserLookupHandler;",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "",
        "channelCid",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter;",
        "Lio/getstream/chat/android/models/User;",
        "filter",
        "<init>",
        "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter;)V",
        "query",
        "",
        "handleUserLookup",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Ljava/lang/String;",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Companion",
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

.field private static final Companion:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/LocalUserLookupHandler$Companion;

.field private static final DEBUG:Z = false


# instance fields
.field private final channelCid:Ljava/lang/String;

.field private final chatClient:Lio/getstream/chat/android/client/ChatClient;

.field private final filter:Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation
.end field

.field private final logger$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/LocalUserLookupHandler$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/LocalUserLookupHandler;->Companion:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/LocalUserLookupHandler$Companion;

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

    const-string v0, "filter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/LocalUserLookupHandler;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/LocalUserLookupHandler;->channelCid:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/LocalUserLookupHandler;->filter:Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter;

    .line 5
    const-string p1, "Chat:UserLookupLocal"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/LocalUserLookupHandler;->logger$delegate:Ll83/h;

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
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/LocalUserLookupHandler;-><init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter;)V

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/LocalUserLookupHandler;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method


# virtual methods
.method public final handleUserLookup(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
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

    :try_start_0
    iget-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/LocalUserLookupHandler;->channelCid:Ljava/lang/String;

    invoke-static {p2}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object p2

    iget-object v0, p2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object p2, p2, Ll83/k;->x:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/LocalUserLookupHandler;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {v1}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->getState(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/api/state/StateRegistry;

    move-result-object v1

    invoke-virtual {v1, v0, p2}, Lio/getstream/chat/android/client/api/state/StateRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/channel/state/ChannelState;

    move-result-object p2

    invoke-interface {p2}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getMembers()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-interface {p2}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getMembersCount()Lec3/f2;

    move-result-object p2

    invoke-interface {p2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne p2, v0, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/LocalUserLookupHandler;->filter:Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter;

    invoke-interface {p2, v1, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter;->filter(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :goto_1
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/LocalUserLookupHandler;->getLogger()Lb23/k;

    move-result-object p2

    iget-object v0, p2, Lb23/k;->c:Lb23/e;

    iget-object v1, p2, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->F:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    const-string v0, "[handleUserLookup] failed: "

    invoke-static {p1, v0}, Lb9/y;->j(Ljava/lang/Exception;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v2, v1, v0, p1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method
