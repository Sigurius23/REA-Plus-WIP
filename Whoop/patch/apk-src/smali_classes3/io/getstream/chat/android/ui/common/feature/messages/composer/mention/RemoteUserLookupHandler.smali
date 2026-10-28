.class public final Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J*\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0004H\u0082@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001e\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0008\u001a\u00020\u0004H\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0018"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler;",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "",
        "channelCid",
        "<init>",
        "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;)V",
        "query",
        "",
        "Lio/getstream/chat/android/models/User;",
        "queryMembersByUsername",
        "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "handleUserLookup",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Ljava/lang/String;",
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

.field private static final Companion:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler$Companion;

.field private static final DEBUG:Z = false

.field private static final QUERY_MEMBERS_REQUEST_LIMIT:I = 0x1e

.field private static final QUERY_MEMBERS_REQUEST_OFFSET:I


# instance fields
.field private final channelCid:Ljava/lang/String;

.field private final chatClient:Lio/getstream/chat/android/client/ChatClient;

.field private final logger$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler;->Companion:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler$Companion;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;)V
    .locals 1

    const-string v0, "chatClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelCid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler;->channelCid:Ljava/lang/String;

    const-string p1, "Chat:UserLookupRemote"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler;->logger$delegate:Ll83/h;

    return-void
.end method

.method public static final synthetic access$queryMembersByUsername(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler;Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler;->queryMembersByUsername(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final queryMembersByUsername(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p3

    move-object/from16 v1, p4

    instance-of v2, v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler$queryMembersByUsername$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler$queryMembersByUsername$1;

    iget v3, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler$queryMembersByUsername$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler$queryMembersByUsername$1;->label:I

    move-object/from16 v3, p0

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler$queryMembersByUsername$1;

    move-object/from16 v3, p0

    invoke-direct {v2, v3, v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler$queryMembersByUsername$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler$queryMembersByUsername$1;->result:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler$queryMembersByUsername$1;->label:I

    sget-object v13, Lm83/y;->w:Lm83/y;

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eqz v5, :cond_2

    if-ne v5, v14, :cond_1

    iget-object v0, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler$queryMembersByUsername$1;->L$4:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler$queryMembersByUsername$1;->L$3:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler$queryMembersByUsername$1;->L$2:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v4, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler$queryMembersByUsername$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v2, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler$queryMembersByUsername$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/client/ChatClient;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static/range {p2 .. p2}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object v1

    iget-object v5, v1, Ll83/k;->w:Ljava/lang/Object;

    move-object v7, v5

    check-cast v7, Ljava/lang/String;

    iget-object v1, v1, Ll83/k;->x:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Ljava/lang/String;

    const-string v1, "name"

    invoke-static {v1, v0}, Lio/getstream/chat/android/models/Filters;->autocomplete(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object v11

    sget-object v5, Lio/getstream/chat/android/models/querysort/QuerySortByField;->Companion:Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;

    invoke-virtual {v5, v1}, Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;->ascByName(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;

    move-result-object v12

    const/4 v9, 0x0

    const/16 v10, 0x1e

    move-object/from16 v6, p1

    invoke-virtual/range {v6 .. v13}, Lio/getstream/chat/android/client/ChatClient;->queryMembers(Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/d;

    move-result-object v1

    iput-object v15, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler$queryMembersByUsername$1;->L$0:Ljava/lang/Object;

    iput-object v15, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler$queryMembersByUsername$1;->L$1:Ljava/lang/Object;

    iput-object v0, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler$queryMembersByUsername$1;->L$2:Ljava/lang/Object;

    iput-object v15, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler$queryMembersByUsername$1;->L$3:Ljava/lang/Object;

    iput-object v15, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler$queryMembersByUsername$1;->L$4:Ljava/lang/Object;

    iput v14, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler$queryMembersByUsername$1;->label:I

    invoke-interface {v1, v2}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_3

    return-object v4

    :cond_3
    :goto_1
    check-cast v1, Ln23/h;

    instance-of v2, v1, Ln23/g;

    if-eqz v2, :cond_7

    check-cast v1, Ln23/g;

    iget-object v1, v1, Ln23/g;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/models/User;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v0, v14}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    return-object v1

    :cond_7
    instance-of v0, v1, Ln23/f;

    if-eqz v0, :cond_9

    invoke-direct {v3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->F:Lb23/g;

    invoke-interface {v2, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    check-cast v1, Ln23/f;

    iget-object v1, v1, Ln23/f;->a:Ln23/e;

    invoke-virtual {v1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "[queryMembersByUsername] failed: "

    invoke-static {v2, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v5, v4, v1, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    return-object v13

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method


# virtual methods
.method public final handleUserLookup(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 2
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

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler;->channelCid:Ljava/lang/String;

    invoke-direct {p0, v0, v1, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/RemoteUserLookupHandler;->queryMembersByUsername(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method
