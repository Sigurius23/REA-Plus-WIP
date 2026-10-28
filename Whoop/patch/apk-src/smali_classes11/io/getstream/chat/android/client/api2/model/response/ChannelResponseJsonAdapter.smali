.class public final Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/moshi/JsonAdapter<",
        "Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001d0\u001a0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u0019R \u0010\"\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020!0\u001a0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010\u0019R \u0010%\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020$0\u001a0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010\u0019R \u0010\'\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020&0\u001a0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010\u0019R\u001a\u0010)\u001a\u0008\u0012\u0004\u0012\u00020(0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010\u0019R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010\u0019R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010\u0019R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u0010\u0019R\u001e\u00101\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00081\u00102\u00a8\u00063"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;",
        "Lqx/l0;",
        "moshi",
        "<init>",
        "(Lqx/l0;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "Lcom/squareup/moshi/JsonReader;",
        "reader",
        "fromJson",
        "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;",
        "Lqx/c0;",
        "writer",
        "value_",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;)V",
        "Lqx/v;",
        "options",
        "Lqx/v;",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;",
        "downstreamChannelDtoAdapter",
        "Lcom/squareup/moshi/JsonAdapter;",
        "",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
        "listOfDownstreamMessageDtoAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPendingMessageDto;",
        "listOfDownstreamPendingMessageDtoAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;",
        "nullableDownstreamPushPreferenceDtoAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;",
        "listOfDownstreamMemberDtoAdapter",
        "nullableDownstreamMemberDtoAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
        "listOfDownstreamUserDtoAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;",
        "listOfDownstreamChannelUserReadAdapter",
        "",
        "intAdapter",
        "",
        "nullableBooleanAdapter",
        "Ljava/util/Date;",
        "nullableDateAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;",
        "nullableDownstreamDraftDtoAdapter",
        "Ljava/lang/reflect/Constructor;",
        "constructorRef",
        "Ljava/lang/reflect/Constructor;",
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
.field private volatile constructorRef:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;",
            ">;"
        }
    .end annotation
.end field

.field private final downstreamChannelDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;",
            ">;"
        }
    .end annotation
.end field

.field private final intAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final listOfDownstreamChannelUserReadAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;",
            ">;>;"
        }
    .end annotation
.end field

.field private final listOfDownstreamMemberDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;",
            ">;>;"
        }
    .end annotation
.end field

.field private final listOfDownstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
            ">;>;"
        }
    .end annotation
.end field

.field private final listOfDownstreamPendingMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPendingMessageDto;",
            ">;>;"
        }
    .end annotation
.end field

.field private final listOfDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            ">;>;"
        }
    .end annotation
.end field

.field private final nullableBooleanAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableDownstreamDraftDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableDownstreamMemberDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableDownstreamPushPreferenceDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;",
            ">;"
        }
    .end annotation
.end field

.field private final options:Lqx/v;


# direct methods
.method public constructor <init>(Lqx/l0;)V
    .locals 14

    const-string v0, "moshi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    const-string v12, "hide_messages_before"

    const-string v13, "draft"

    const-string v1, "channel"

    const-string v2, "messages"

    const-string v3, "pending_messages"

    const-string v4, "pinned_messages"

    const-string v5, "push_preferences"

    const-string v6, "members"

    const-string v7, "membership"

    const-string v8, "watchers"

    const-string v9, "read"

    const-string v10, "watcher_count"

    const-string v11, "hidden"

    filled-new-array/range {v1 .. v13}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lqx/v;->a([Ljava/lang/String;)Lqx/v;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->options:Lqx/v;

    const-string v0, "channel"

    const-class v1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-virtual {p1, v1, v2, v0}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->downstreamChannelDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/reflect/Type;

    const/4 v3, 0x0

    const-class v4, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    aput-object v4, v1, v3

    const-class v4, Ljava/util/List;

    invoke-static {v4, v1}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v1

    const-string v5, "messages"

    invoke-virtual {p1, v1, v2, v5}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->listOfDownstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v1, v0, [Ljava/lang/reflect/Type;

    const-class v5, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPendingMessageDto;

    aput-object v5, v1, v3

    invoke-static {v4, v1}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v1

    const-string v5, "pending_messages"

    invoke-virtual {p1, v1, v2, v5}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->listOfDownstreamPendingMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;

    const-string v5, "push_preferences"

    invoke-virtual {p1, v1, v2, v5}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->nullableDownstreamPushPreferenceDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v1, v0, [Ljava/lang/reflect/Type;

    const-class v5, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;

    aput-object v5, v1, v3

    invoke-static {v4, v1}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v1

    const-string v6, "members"

    invoke-virtual {p1, v1, v2, v6}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->listOfDownstreamMemberDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-string v1, "membership"

    invoke-virtual {p1, v5, v2, v1}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->nullableDownstreamMemberDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v1, v0, [Ljava/lang/reflect/Type;

    const-class v5, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    aput-object v5, v1, v3

    invoke-static {v4, v1}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v1

    const-string v5, "watchers"

    invoke-virtual {p1, v1, v2, v5}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->listOfDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v0, v0, [Ljava/lang/reflect/Type;

    const-class v1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;

    aput-object v1, v0, v3

    invoke-static {v4, v0}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v0

    const-string v1, "read"

    invoke-virtual {p1, v0, v2, v1}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->listOfDownstreamChannelUserReadAdapter:Lcom/squareup/moshi/JsonAdapter;

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-string v1, "watcher_count"

    invoke-virtual {p1, v0, v2, v1}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Ljava/lang/Boolean;

    const-string v1, "hidden"

    invoke-virtual {p1, v0, v2, v1}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->nullableBooleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Ljava/util/Date;

    const-string v1, "hide_messages_before"

    invoke-virtual {p1, v0, v2, v1}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;

    const-string v1, "draft"

    invoke-virtual {p1, v0, v2, v1}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->nullableDownstreamDraftDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method


# virtual methods
.method public fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;
    .locals 44

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "reader"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 3
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    const/4 v3, 0x0

    const/4 v4, -0x1

    move-object v14, v2

    move-object v6, v3

    move-object v7, v6

    move-object v8, v7

    move-object v10, v8

    move-object v12, v10

    move-object v13, v12

    move-object v15, v13

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v20, v17

    move-object/from16 v22, v20

    move-object/from16 v27, v22

    .line 4
    :goto_0
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v2

    const-string v3, "channel"

    if-eqz v2, :cond_8

    .line 5
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->options:Lqx/v;

    invoke-virtual {v1, v2}, Lcom/squareup/moshi/JsonReader;->T(Lqx/v;)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 6
    :pswitch_0
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->nullableDownstreamDraftDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;

    goto :goto_0

    .line 7
    :pswitch_1
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v27, v2

    check-cast v27, Ljava/util/Date;

    goto :goto_0

    .line 8
    :pswitch_2
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->nullableBooleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Ljava/lang/Boolean;

    goto :goto_0

    .line 9
    :pswitch_3
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Ljava/lang/Integer;

    if-eqz v14, :cond_0

    and-int/lit16 v4, v4, -0x201

    goto :goto_0

    :cond_0
    const-string v2, "watcher_count"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 10
    :pswitch_4
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->listOfDownstreamChannelUserReadAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Ljava/util/List;

    if-eqz v13, :cond_1

    and-int/lit16 v4, v4, -0x101

    goto :goto_0

    .line 11
    :cond_1
    const-string v2, "read"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 12
    :pswitch_5
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->listOfDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Ljava/util/List;

    if-eqz v12, :cond_2

    and-int/lit16 v4, v4, -0x81

    goto :goto_0

    .line 13
    :cond_2
    const-string v2, "watchers"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 14
    :pswitch_6
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->nullableDownstreamMemberDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v22, v2

    check-cast v22, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;

    goto :goto_0

    .line 15
    :pswitch_7
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->listOfDownstreamMemberDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Ljava/util/List;

    if-eqz v10, :cond_3

    and-int/lit8 v4, v4, -0x21

    goto/16 :goto_0

    .line 16
    :cond_3
    const-string v2, "members"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 17
    :pswitch_8
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->nullableDownstreamPushPreferenceDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v20, v2

    check-cast v20, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;

    and-int/lit8 v4, v4, -0x11

    goto/16 :goto_0

    .line 18
    :pswitch_9
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->listOfDownstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ljava/util/List;

    if-eqz v8, :cond_4

    and-int/lit8 v4, v4, -0x9

    goto/16 :goto_0

    .line 19
    :cond_4
    const-string v2, "pinned_messages"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 20
    :pswitch_a
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->listOfDownstreamPendingMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/util/List;

    if-eqz v7, :cond_5

    and-int/lit8 v4, v4, -0x5

    goto/16 :goto_0

    .line 21
    :cond_5
    const-string v2, "pending_messages"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 22
    :pswitch_b
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->listOfDownstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ljava/util/List;

    if-eqz v6, :cond_6

    and-int/lit8 v4, v4, -0x3

    goto/16 :goto_0

    .line 23
    :cond_6
    const-string v2, "messages"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 24
    :pswitch_c
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->downstreamChannelDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    if-eqz v16, :cond_7

    goto/16 :goto_0

    .line 25
    :cond_7
    invoke-static {v3, v3, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 26
    :pswitch_d
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->b0()V

    .line 27
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    goto/16 :goto_0

    .line 28
    :cond_8
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->endObject()V

    const/16 v2, -0x3bf

    if-ne v4, v2, :cond_a

    move-object/from16 v26, v15

    .line 29
    new-instance v15, Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;

    if-eqz v16, :cond_9

    .line 30
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.dto.DownstreamMessageDto>"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    const-string v2, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.dto.DownstreamPendingMessageDto>"

    invoke-static {v7, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.dto.DownstreamMemberDto>"

    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto>"

    invoke-static {v12, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.dto.DownstreamChannelUserRead>"

    invoke-static {v13, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v25

    move-object/from16 v18, v7

    move-object/from16 v19, v8

    move-object/from16 v21, v10

    move-object/from16 v23, v12

    move-object/from16 v24, v13

    move-object/from16 v28, v17

    move-object/from16 v17, v6

    .line 37
    invoke-direct/range {v15 .. v28}, Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;-><init>(Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;Ljava/util/List;Ljava/util/List;ILjava/lang/Boolean;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;)V

    return-object v15

    .line 38
    :cond_9
    invoke-static {v3, v3, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    :cond_a
    move-object/from16 v18, v7

    move-object/from16 v19, v8

    move-object/from16 v21, v10

    move-object/from16 v23, v12

    move-object/from16 v24, v13

    move-object/from16 v26, v15

    move-object/from16 v28, v17

    move-object/from16 v17, v6

    .line 39
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    if-nez v2, :cond_b

    .line 40
    const-class v41, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;

    .line 41
    sget-object v43, Lrx/f;->c:Ljava/lang/Class;

    const-class v29, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    const-class v30, Ljava/util/List;

    const-class v31, Ljava/util/List;

    const-class v32, Ljava/util/List;

    const-class v33, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;

    const-class v34, Ljava/util/List;

    const-class v35, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;

    const-class v36, Ljava/util/List;

    const-class v37, Ljava/util/List;

    sget-object v38, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v39, Ljava/lang/Boolean;

    const-class v40, Ljava/util/Date;

    move-object/from16 v42, v38

    filled-new-array/range {v29 .. v43}, [Ljava/lang/Class;

    move-result-object v2

    .line 42
    const-class v5, Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;

    invoke-virtual {v5, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    .line 43
    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    const-string v5, "also(...)"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_b
    if-eqz v16, :cond_c

    .line 44
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v8, v19

    const/16 v19, 0x0

    move-object/from16 v5, v16

    move-object/from16 v6, v17

    move-object/from16 v7, v18

    move-object/from16 v9, v20

    move-object/from16 v10, v21

    move-object/from16 v11, v22

    move-object/from16 v12, v23

    move-object/from16 v13, v24

    move-object/from16 v15, v26

    move-object/from16 v16, v27

    move-object/from16 v17, v28

    move-object/from16 v18, v1

    .line 45
    filled-new-array/range {v5 .. v19}, [Ljava/lang/Object;

    move-result-object v1

    .line 46
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 47
    const-string v2, "newInstance(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;

    return-object v1

    :cond_c
    invoke-static {v3, v3, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;)V
    .locals 2

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lqx/c0;->h()Lqx/c0;

    .line 3
    const-string v0, "channel"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 4
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->downstreamChannelDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;->getChannel()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 5
    const-string v0, "messages"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 6
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->listOfDownstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;->getMessages()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 7
    const-string v0, "pending_messages"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 8
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->listOfDownstreamPendingMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;->getPending_messages()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 9
    const-string v0, "pinned_messages"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 10
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->listOfDownstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;->getPinned_messages()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 11
    const-string v0, "push_preferences"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 12
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->nullableDownstreamPushPreferenceDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;->getPush_preferences()Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 13
    const-string v0, "members"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 14
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->listOfDownstreamMemberDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;->getMembers()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 15
    const-string v0, "membership"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 16
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->nullableDownstreamMemberDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;->getMembership()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 17
    const-string v0, "watchers"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 18
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->listOfDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;->getWatchers()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 19
    const-string v0, "read"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 20
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->listOfDownstreamChannelUserReadAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;->getRead()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 21
    const-string v0, "watcher_count"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 22
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;->getWatcher_count()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 23
    const-string v0, "hidden"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 24
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->nullableBooleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;->getHidden()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 25
    const-string v0, "hide_messages_before"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 26
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;->getHide_messages_before()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 27
    const-string v0, "draft"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 28
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->nullableDownstreamDraftDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;->getDraft()Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 29
    invoke-virtual {p1}, Lqx/c0;->m()Lqx/c0;

    return-void

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;->toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    const/16 v0, 0x25

    const-string v1, "GeneratedJsonAdapter(ChannelResponse)"

    invoke-static {v0, v1}, Lvl/b;->e(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
