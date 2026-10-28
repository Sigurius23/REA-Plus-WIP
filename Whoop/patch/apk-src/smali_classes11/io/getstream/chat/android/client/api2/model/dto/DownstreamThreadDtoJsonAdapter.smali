.class public final Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/moshi/JsonAdapter<",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010\u0019R \u0010&\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020%0$0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\u0019R\u001a\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020%0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010\u0019R\u001a\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010\u0019R\"\u0010*\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020)\u0018\u00010$0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010\u0019R\"\u0010,\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020+\u0018\u00010$0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010\u0019R&\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020.0-0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u0010\u0019\u00a8\u00060"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;",
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
        "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;",
        "Lqx/c0;",
        "writer",
        "value_",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;)V",
        "Lqx/v;",
        "options",
        "Lqx/v;",
        "",
        "nullableIntAdapter",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;",
        "nullableDownstreamChannelDtoAdapter",
        "stringAdapter",
        "Ljava/util/Date;",
        "dateAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
        "nullableDownstreamUserDtoAdapter",
        "nullableDateAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;",
        "nullableDownstreamDraftDtoAdapter",
        "",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
        "listOfDownstreamMessageDtoAdapter",
        "downstreamMessageDtoAdapter",
        "intAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;",
        "nullableListOfDownstreamChannelUserReadAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadParticipantDto;",
        "nullableListOfDownstreamThreadParticipantDtoAdapter",
        "",
        "",
        "mapOfStringAnyAdapter",
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
.field private final dateAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field

.field private final downstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
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

.field private final mapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
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

.field private final nullableDownstreamChannelDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;",
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

.field private final nullableDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableIntAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableListOfDownstreamChannelUserReadAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;",
            ">;>;"
        }
    .end annotation
.end field

.field private final nullableListOfDownstreamThreadParticipantDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadParticipantDto;",
            ">;>;"
        }
    .end annotation
.end field

.field private final options:Lqx/v;

.field private final stringAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lqx/l0;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "moshi"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    const-string v20, "updated_at"

    const-string v21, "extraData"

    const-string v3, "active_participant_count"

    const-string v4, "channel"

    const-string v5, "channel_cid"

    const-string v6, "created_at"

    const-string v7, "created_by"

    const-string v8, "created_by_user_id"

    const-string v9, "deleted_at"

    const-string v10, "draft"

    const-string v11, "last_message_at"

    const-string v12, "latest_replies"

    const-string v13, "parent_message"

    const-string v14, "parent_message_id"

    const-string v15, "participant_count"

    const-string v16, "read"

    const-string v17, "reply_count"

    const-string v18, "thread_participants"

    const-string v19, "title"

    filled-new-array/range {v3 .. v21}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lqx/v;->a([Ljava/lang/String;)Lqx/v;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->options:Lqx/v;

    const-string v2, "active_participant_count"

    const-class v3, Ljava/lang/Integer;

    sget-object v4, Lm83/a0;->w:Lm83/a0;

    invoke-virtual {v1, v3, v4, v2}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->nullableIntAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v2, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    const-string v3, "channel"

    invoke-virtual {v1, v2, v4, v3}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->nullableDownstreamChannelDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-string v2, "channel_cid"

    const-class v3, Ljava/lang/String;

    invoke-virtual {v1, v3, v4, v2}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-string v2, "created_at"

    const-class v5, Ljava/util/Date;

    invoke-virtual {v1, v5, v4, v2}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v2, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    const-string v6, "created_by"

    invoke-virtual {v1, v2, v4, v6}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->nullableDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-string v2, "deleted_at"

    invoke-virtual {v1, v5, v4, v2}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v2, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;

    const-string v5, "draft"

    invoke-virtual {v1, v2, v4, v5}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->nullableDownstreamDraftDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    const/4 v2, 0x1

    new-array v5, v2, [Ljava/lang/reflect/Type;

    const/4 v6, 0x0

    const-class v7, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    aput-object v7, v5, v6

    const-class v8, Ljava/util/List;

    invoke-static {v8, v5}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v5

    const-string v9, "latest_replies"

    invoke-virtual {v1, v5, v4, v9}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->listOfDownstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-string v5, "parent_message"

    invoke-virtual {v1, v7, v4, v5}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->downstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-string v7, "participant_count"

    invoke-virtual {v1, v5, v4, v7}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v5, v2, [Ljava/lang/reflect/Type;

    const-class v7, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;

    aput-object v7, v5, v6

    invoke-static {v8, v5}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v5

    const-string v7, "read"

    invoke-virtual {v1, v5, v4, v7}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->nullableListOfDownstreamChannelUserReadAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v5, v2, [Ljava/lang/reflect/Type;

    const-class v7, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadParticipantDto;

    aput-object v7, v5, v6

    invoke-static {v8, v5}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v5

    const-string v7, "thread_participants"

    invoke-virtual {v1, v5, v4, v7}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->nullableListOfDownstreamThreadParticipantDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/reflect/Type;

    aput-object v3, v5, v6

    const-class v3, Ljava/lang/Object;

    aput-object v3, v5, v2

    const-class v2, Ljava/util/Map;

    invoke-static {v2, v5}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v2

    const-string v3, "extraData"

    invoke-virtual {v1, v2, v4, v3}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->mapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method


# virtual methods
.method public fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "reader"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    const/4 v2, 0x0

    move-object v4, v2

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v17, v15

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    .line 3
    :goto_0
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v3

    move-object/from16 v16, v2

    const-string v2, "channel_cid"

    move/from16 v23, v3

    const-string v3, "created_at"

    move-object/from16 v24, v4

    const-string v4, "created_by_user_id"

    move-object/from16 v25, v5

    const-string v5, "last_message_at"

    move-object/from16 v26, v6

    const-string v6, "latest_replies"

    move-object/from16 v27, v7

    const-string v7, "parent_message"

    move-object/from16 v28, v8

    const-string v8, "parent_message_id"

    move-object/from16 v29, v9

    const-string v9, "participant_count"

    move-object/from16 v30, v10

    const-string v10, "title"

    move-object/from16 v31, v11

    const-string v11, "updated_at"

    move-object/from16 v32, v12

    const-string v12, "extraData"

    if-eqz v23, :cond_b

    move-object/from16 v23, v13

    .line 4
    iget-object v13, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->options:Lqx/v;

    invoke-virtual {v1, v13}, Lcom/squareup/moshi/JsonReader;->T(Lqx/v;)I

    move-result v13

    packed-switch v13, :pswitch_data_0

    goto :goto_1

    .line 5
    :pswitch_0
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->mapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v22, v2

    check-cast v22, Ljava/util/Map;

    if-eqz v22, :cond_0

    :goto_1
    move-object/from16 v2, v16

    :goto_2
    move-object/from16 v13, v23

    :goto_3
    move-object/from16 v4, v24

    :goto_4
    move-object/from16 v5, v25

    :goto_5
    move-object/from16 v6, v26

    :goto_6
    move-object/from16 v7, v27

    :goto_7
    move-object/from16 v8, v28

    :goto_8
    move-object/from16 v9, v29

    :goto_9
    move-object/from16 v10, v30

    :goto_a
    move-object/from16 v11, v31

    :goto_b
    move-object/from16 v12, v32

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {v12, v12, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 7
    :pswitch_1
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v21, v2

    check-cast v21, Ljava/util/Date;

    if-eqz v21, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v11, v11, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 8
    :pswitch_2
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v20, v2

    check-cast v20, Ljava/lang/String;

    if-eqz v20, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v10, v10, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 9
    :pswitch_3
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->nullableListOfDownstreamThreadParticipantDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v19, v2

    check-cast v19, Ljava/util/List;

    goto :goto_1

    .line 10
    :pswitch_4
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->nullableIntAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Ljava/lang/Integer;

    goto :goto_1

    .line 11
    :pswitch_5
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->nullableListOfDownstreamChannelUserReadAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Ljava/util/List;

    goto :goto_1

    .line 12
    :pswitch_6
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_3

    goto :goto_2

    .line 13
    :cond_3
    invoke-static {v9, v9, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 14
    :pswitch_7
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Ljava/lang/String;

    if-eqz v15, :cond_4

    goto :goto_1

    .line 15
    :cond_4
    invoke-static {v8, v8, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 16
    :pswitch_8
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->downstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    if-eqz v14, :cond_5

    goto/16 :goto_1

    .line 17
    :cond_5
    invoke-static {v7, v7, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 18
    :pswitch_9
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->listOfDownstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Ljava/util/List;

    if-eqz v13, :cond_6

    move-object/from16 v2, v16

    goto/16 :goto_3

    .line 19
    :cond_6
    invoke-static {v6, v6, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 20
    :pswitch_a
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Ljava/util/Date;

    if-eqz v12, :cond_7

    move-object/from16 v2, v16

    move-object/from16 v13, v23

    move-object/from16 v4, v24

    move-object/from16 v5, v25

    move-object/from16 v6, v26

    move-object/from16 v7, v27

    move-object/from16 v8, v28

    move-object/from16 v9, v29

    move-object/from16 v10, v30

    move-object/from16 v11, v31

    goto/16 :goto_0

    .line 21
    :cond_7
    invoke-static {v5, v5, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 22
    :pswitch_b
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->nullableDownstreamDraftDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;

    move-object/from16 v2, v16

    move-object/from16 v13, v23

    move-object/from16 v4, v24

    move-object/from16 v5, v25

    move-object/from16 v6, v26

    move-object/from16 v7, v27

    move-object/from16 v8, v28

    move-object/from16 v9, v29

    move-object/from16 v10, v30

    goto/16 :goto_b

    .line 23
    :pswitch_c
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Ljava/util/Date;

    move-object/from16 v2, v16

    move-object/from16 v13, v23

    move-object/from16 v4, v24

    move-object/from16 v5, v25

    move-object/from16 v6, v26

    move-object/from16 v7, v27

    move-object/from16 v8, v28

    move-object/from16 v9, v29

    goto/16 :goto_a

    .line 24
    :pswitch_d
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Ljava/lang/String;

    if-eqz v9, :cond_8

    move-object/from16 v2, v16

    move-object/from16 v13, v23

    move-object/from16 v4, v24

    move-object/from16 v5, v25

    move-object/from16 v6, v26

    move-object/from16 v7, v27

    move-object/from16 v8, v28

    goto/16 :goto_9

    .line 25
    :cond_8
    invoke-static {v4, v4, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 26
    :pswitch_e
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->nullableDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    move-object/from16 v2, v16

    move-object/from16 v13, v23

    move-object/from16 v4, v24

    move-object/from16 v5, v25

    move-object/from16 v6, v26

    move-object/from16 v7, v27

    goto/16 :goto_8

    .line 27
    :pswitch_f
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/util/Date;

    if-eqz v7, :cond_9

    move-object/from16 v2, v16

    move-object/from16 v13, v23

    move-object/from16 v4, v24

    move-object/from16 v5, v25

    move-object/from16 v6, v26

    goto/16 :goto_7

    :cond_9
    invoke-static {v3, v3, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 28
    :pswitch_10
    iget-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v3, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_a

    move-object/from16 v2, v16

    move-object/from16 v13, v23

    move-object/from16 v4, v24

    move-object/from16 v5, v25

    goto/16 :goto_6

    .line 29
    :cond_a
    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 30
    :pswitch_11
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->nullableDownstreamChannelDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    move-object/from16 v2, v16

    move-object/from16 v13, v23

    move-object/from16 v4, v24

    goto/16 :goto_5

    .line 31
    :pswitch_12
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->nullableIntAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/Integer;

    move-object/from16 v2, v16

    move-object/from16 v13, v23

    goto/16 :goto_4

    .line 32
    :pswitch_13
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->b0()V

    .line 33
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    goto/16 :goto_1

    :cond_b
    move-object/from16 v23, v13

    .line 34
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->endObject()V

    move-object v13, v3

    .line 35
    new-instance v3, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;

    if-eqz v26, :cond_16

    if-eqz v27, :cond_15

    if-eqz v29, :cond_14

    if-eqz v32, :cond_13

    if-eqz v23, :cond_12

    if-eqz v14, :cond_11

    if-eqz v15, :cond_10

    if-eqz v16, :cond_f

    .line 36
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v16

    if-eqz v20, :cond_e

    if-eqz v21, :cond_d

    if-eqz v22, :cond_c

    move-object/from16 v13, v23

    move-object/from16 v4, v24

    move-object/from16 v5, v25

    move-object/from16 v6, v26

    move-object/from16 v7, v27

    move-object/from16 v8, v28

    move-object/from16 v9, v29

    move-object/from16 v10, v30

    move-object/from16 v11, v31

    move-object/from16 v12, v32

    .line 37
    invoke-direct/range {v3 .. v22}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;-><init>(Ljava/lang/Integer;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;Ljava/util/Date;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;ILjava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;)V

    return-object v3

    :cond_c
    move-object v2, v12

    .line 38
    invoke-static {v2, v2, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 39
    :cond_d
    invoke-static {v11, v11, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 40
    :cond_e
    invoke-static {v10, v10, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 41
    :cond_f
    invoke-static {v9, v9, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 42
    :cond_10
    invoke-static {v8, v8, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 43
    :cond_11
    invoke-static {v7, v7, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 44
    :cond_12
    invoke-static {v6, v6, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 45
    :cond_13
    invoke-static {v5, v5, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 46
    :cond_14
    invoke-static {v4, v4, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 47
    :cond_15
    invoke-static {v13, v13, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 48
    :cond_16
    invoke-static {v2, v2, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
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
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;)V
    .locals 2

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lqx/c0;->h()Lqx/c0;

    .line 3
    const-string v0, "active_participant_count"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 4
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->nullableIntAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->getActive_participant_count()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 5
    const-string v0, "channel"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 6
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->nullableDownstreamChannelDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->getChannel()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 7
    const-string v0, "channel_cid"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 8
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->getChannel_cid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 9
    const-string v0, "created_at"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 10
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->getCreated_at()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 11
    const-string v0, "created_by"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 12
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->nullableDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->getCreated_by()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 13
    const-string v0, "created_by_user_id"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 14
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->getCreated_by_user_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 15
    const-string v0, "deleted_at"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 16
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->getDeleted_at()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 17
    const-string v0, "draft"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 18
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->nullableDownstreamDraftDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->getDraft()Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 19
    const-string v0, "last_message_at"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 20
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->getLast_message_at()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 21
    const-string v0, "latest_replies"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 22
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->listOfDownstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->getLatest_replies()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 23
    const-string v0, "parent_message"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 24
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->downstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->getParent_message()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 25
    const-string v0, "parent_message_id"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 26
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->getParent_message_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 27
    const-string v0, "participant_count"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 28
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->getParticipant_count()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 29
    const-string v0, "read"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 30
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->nullableListOfDownstreamChannelUserReadAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->getRead()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 31
    const-string v0, "reply_count"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 32
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->nullableIntAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->getReply_count()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 33
    const-string v0, "thread_participants"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 34
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->nullableListOfDownstreamThreadParticipantDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->getThread_participants()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 35
    const-string v0, "title"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 36
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 37
    const-string v0, "updated_at"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 38
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->getUpdated_at()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 39
    const-string v0, "extraData"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 40
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->mapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->getExtraData()Ljava/util/Map;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 41
    invoke-virtual {p1}, Lqx/c0;->m()Lqx/c0;

    return-void

    .line 42
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;->toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    const/16 v0, 0x29

    const-string v1, "GeneratedJsonAdapter(DownstreamThreadDto)"

    invoke-static {v0, v1}, Lvl/b;->e(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
