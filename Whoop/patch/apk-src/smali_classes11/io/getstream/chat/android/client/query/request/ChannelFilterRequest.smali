.class public final Lio/getstream/chat/android/client/query/request/ChannelFilterRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J2\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/getstream/chat/android/client/query/request/ChannelFilterRequest;",
        "",
        "<init>",
        "()V",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Lio/getstream/chat/android/models/FilterObject;",
        "filter",
        "",
        "offset",
        "limit",
        "",
        "Lio/getstream/chat/android/models/Channel;",
        "filterWithOffset",
        "(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/FilterObject;IILq83/d;)Ljava/lang/Object;",
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


# static fields
.field public static final INSTANCE:Lio/getstream/chat/android/client/query/request/ChannelFilterRequest;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/query/request/ChannelFilterRequest;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/query/request/ChannelFilterRequest;->INSTANCE:Lio/getstream/chat/android/client/query/request/ChannelFilterRequest;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final filterWithOffset(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/FilterObject;IILq83/d;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/models/FilterObject;",
            "II",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p5

    instance-of v1, v0, Lio/getstream/chat/android/client/query/request/ChannelFilterRequest$filterWithOffset$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/client/query/request/ChannelFilterRequest$filterWithOffset$1;

    iget v2, v1, Lio/getstream/chat/android/client/query/request/ChannelFilterRequest$filterWithOffset$1;->label:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lio/getstream/chat/android/client/query/request/ChannelFilterRequest$filterWithOffset$1;->label:I

    move-object/from16 v2, p0

    goto :goto_0

    :cond_0
    new-instance v1, Lio/getstream/chat/android/client/query/request/ChannelFilterRequest$filterWithOffset$1;

    move-object/from16 v2, p0

    invoke-direct {v1, v2, v0}, Lio/getstream/chat/android/client/query/request/ChannelFilterRequest$filterWithOffset$1;-><init>(Lio/getstream/chat/android/client/query/request/ChannelFilterRequest;Lq83/d;)V

    :goto_0
    iget-object v0, v1, Lio/getstream/chat/android/client/query/request/ChannelFilterRequest$filterWithOffset$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v1, Lio/getstream/chat/android/client/query/request/ChannelFilterRequest$filterWithOffset$1;->label:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v1, Lio/getstream/chat/android/client/query/request/ChannelFilterRequest$filterWithOffset$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    iget-object v3, v1, Lio/getstream/chat/android/client/query/request/ChannelFilterRequest$filterWithOffset$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/FilterObject;

    iget-object v1, v1, Lio/getstream/chat/android/client/query/request/ChannelFilterRequest$filterWithOffset$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/ChatClient;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v6, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    new-instance v11, Ljava/lang/Integer;

    const/4 v0, 0x0

    invoke-direct {v11, v0}, Ljava/lang/Integer;-><init>(I)V

    new-instance v12, Ljava/lang/Integer;

    invoke-direct {v12, v0}, Ljava/lang/Integer;-><init>(I)V

    const/16 v16, 0x1c8

    const/16 v17, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v7, p2

    move/from16 v8, p3

    move/from16 v9, p4

    invoke-direct/range {v6 .. v17}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, p1

    invoke-virtual {v0, v6}, Lio/getstream/chat/android/client/ChatClient;->queryChannelsInternal(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lo23/d;

    move-result-object v0

    const/4 v4, 0x0

    iput-object v4, v1, Lio/getstream/chat/android/client/query/request/ChannelFilterRequest$filterWithOffset$1;->L$0:Ljava/lang/Object;

    iput-object v4, v1, Lio/getstream/chat/android/client/query/request/ChannelFilterRequest$filterWithOffset$1;->L$1:Ljava/lang/Object;

    iput-object v4, v1, Lio/getstream/chat/android/client/query/request/ChannelFilterRequest$filterWithOffset$1;->L$2:Ljava/lang/Object;

    iput v8, v1, Lio/getstream/chat/android/client/query/request/ChannelFilterRequest$filterWithOffset$1;->I$0:I

    iput v9, v1, Lio/getstream/chat/android/client/query/request/ChannelFilterRequest$filterWithOffset$1;->I$1:I

    iput v5, v1, Lio/getstream/chat/android/client/query/request/ChannelFilterRequest$filterWithOffset$1;->label:I

    invoke-interface {v0, v1}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_3

    return-object v3

    :cond_3
    :goto_1
    check-cast v0, Ln23/h;

    instance-of v1, v0, Ln23/g;

    if-eqz v1, :cond_4

    check-cast v0, Ln23/g;

    iget-object v0, v0, Ln23/g;->a:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/api/models/QueryChannelsResult;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/api/models/QueryChannelsResult;->getChannels()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_4
    instance-of v0, v0, Ln23/f;

    if-eqz v0, :cond_5

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0

    :cond_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
