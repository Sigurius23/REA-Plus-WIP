.class public final Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/moshi/JsonAdapter<",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0018R\"\u0010\u001d\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u0018R\u001a\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u0018R \u0010#\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\"0\u001c0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010\u0018R \u0010%\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020$0\u001c0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010\u0018R \u0010\'\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020&0\u001c0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010\u0018R \u0010)\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020(0\u001c0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010\u0018R\u001a\u0010+\u001a\u0008\u0012\u0004\u0012\u00020*0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010\u0018R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010\u0018R \u0010-\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u001c0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010\u0018R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010\u0018R \u00100\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020/0\u001c0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u0010\u0018R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u0010\u0018R&\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u000203020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u0010\u0018R\u001e\u00106\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00086\u00107\u00a8\u00068"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;",
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
        "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;",
        "Lqx/c0;",
        "writer",
        "value_",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;)V",
        "Lqx/v;",
        "options",
        "Lqx/v;",
        "stringAdapter",
        "Lcom/squareup/moshi/JsonAdapter;",
        "nullableStringAdapter",
        "",
        "intAdapter",
        "",
        "nullableListOfStringAdapter",
        "",
        "booleanAdapter",
        "Ljava/util/Date;",
        "nullableDateAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
        "listOfDownstreamMessageDtoAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;",
        "listOfDownstreamMemberDtoAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
        "listOfDownstreamUserDtoAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;",
        "listOfDownstreamChannelUserReadAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;",
        "configDtoAdapter",
        "nullableDownstreamUserDtoAdapter",
        "listOfStringAdapter",
        "nullableDownstreamMemberDtoAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;",
        "listOfDownstreamLocationDtoAdapter",
        "nullableIntAdapter",
        "",
        "",
        "mapOfStringAnyAdapter",
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
.field private final booleanAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final configDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;",
            ">;"
        }
    .end annotation
.end field

.field private volatile constructorRef:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
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

.field private final listOfDownstreamLocationDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;",
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

.field private final listOfStringAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
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

.field private final nullableDownstreamMemberDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;",
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

.field private final nullableListOfStringAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/lang/String;",
            ">;"
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
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "moshi"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    const-string v28, "message_count"

    const-string v29, "extraData"

    const-string v3, "cid"

    const-string v4, "id"

    const-string v5, "type"

    const-string v6, "name"

    const-string v7, "image"

    const-string v8, "watcher_count"

    const-string v9, "filter_tags"

    const-string v10, "frozen"

    const-string v11, "last_message_at"

    const-string v12, "created_at"

    const-string v13, "deleted_at"

    const-string v14, "updated_at"

    const-string v15, "member_count"

    const-string v16, "messages"

    const-string v17, "members"

    const-string v18, "watchers"

    const-string v19, "read"

    const-string v20, "config"

    const-string v21, "created_by"

    const-string v22, "team"

    const-string v23, "cooldown"

    const-string v24, "pinned_messages"

    const-string v25, "own_capabilities"

    const-string v26, "membership"

    const-string v27, "active_live_locations"

    filled-new-array/range {v3 .. v29}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lqx/v;->a([Ljava/lang/String;)Lqx/v;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->options:Lqx/v;

    const-string v2, "cid"

    const-class v3, Ljava/lang/String;

    sget-object v4, Lm83/a0;->w:Lm83/a0;

    invoke-virtual {v1, v3, v4, v2}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-string v2, "name"

    invoke-virtual {v1, v3, v4, v2}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-string v5, "watcher_count"

    invoke-virtual {v1, v2, v4, v5}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    const/4 v2, 0x1

    new-array v5, v2, [Ljava/lang/reflect/Type;

    const/4 v6, 0x0

    aput-object v3, v5, v6

    const-class v7, Ljava/util/List;

    invoke-static {v7, v5}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v5

    const-string v8, "filter_tags"

    invoke-virtual {v1, v5, v4, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->nullableListOfStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-string v8, "frozen"

    invoke-virtual {v1, v5, v4, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v5, Ljava/util/Date;

    const-string v8, "last_message_at"

    invoke-virtual {v1, v5, v4, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v5, v2, [Ljava/lang/reflect/Type;

    const-class v8, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    aput-object v8, v5, v6

    invoke-static {v7, v5}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v5

    const-string v8, "messages"

    invoke-virtual {v1, v5, v4, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->listOfDownstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v5, v2, [Ljava/lang/reflect/Type;

    const-class v8, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;

    aput-object v8, v5, v6

    invoke-static {v7, v5}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v5

    const-string v9, "members"

    invoke-virtual {v1, v5, v4, v9}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->listOfDownstreamMemberDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v5, v2, [Ljava/lang/reflect/Type;

    const-class v9, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    aput-object v9, v5, v6

    invoke-static {v7, v5}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v5

    const-string v10, "watchers"

    invoke-virtual {v1, v5, v4, v10}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->listOfDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v5, v2, [Ljava/lang/reflect/Type;

    const-class v10, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;

    aput-object v10, v5, v6

    invoke-static {v7, v5}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v5

    const-string v10, "read"

    invoke-virtual {v1, v5, v4, v10}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->listOfDownstreamChannelUserReadAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v5, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;

    const-string v10, "config"

    invoke-virtual {v1, v5, v4, v10}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->configDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-string v5, "created_by"

    invoke-virtual {v1, v9, v4, v5}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->nullableDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v5, v2, [Ljava/lang/reflect/Type;

    aput-object v3, v5, v6

    invoke-static {v7, v5}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v5

    const-string v9, "own_capabilities"

    invoke-virtual {v1, v5, v4, v9}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->listOfStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-string v5, "membership"

    invoke-virtual {v1, v8, v4, v5}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->nullableDownstreamMemberDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v5, v2, [Ljava/lang/reflect/Type;

    const-class v8, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;

    aput-object v8, v5, v6

    invoke-static {v7, v5}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v5

    const-string v7, "active_live_locations"

    invoke-virtual {v1, v5, v4, v7}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->listOfDownstreamLocationDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v5, Ljava/lang/Integer;

    const-string v7, "message_count"

    invoke-virtual {v1, v5, v4, v7}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->nullableIntAdapter:Lcom/squareup/moshi/JsonAdapter;

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

    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->mapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method


# virtual methods
.method public fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;
    .locals 83

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

    move-object v10, v2

    move-object/from16 v17, v10

    move-object/from16 v25, v17

    move-object v2, v3

    move-object v5, v2

    move-object v7, v5

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v22, v16

    move-object/from16 v23, v22

    move-object/from16 v27, v23

    move-object/from16 v28, v27

    move-object/from16 v30, v28

    move-object/from16 v31, v30

    move-object/from16 v33, v31

    move-object/from16 v35, v33

    move-object/from16 v50, v35

    move-object/from16 v52, v50

    move-object/from16 v53, v52

    move v6, v4

    move-object/from16 v4, v53

    .line 4
    :goto_0
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v18

    move-object/from16 v29, v7

    const-string v7, "cid"

    move-object/from16 v19, v10

    const-string v10, "id"

    move-object/from16 v20, v12

    const-string v12, "type"

    move-object/from16 v36, v14

    const-string v14, "frozen"

    move-object/from16 v37, v15

    const-string v15, "config"

    move-object/from16 v51, v5

    const-string v5, "extraData"

    if-eqz v18, :cond_11

    move-object/from16 v49, v13

    .line 5
    iget-object v13, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->options:Lqx/v;

    invoke-virtual {v1, v13}, Lcom/squareup/moshi/JsonReader;->T(Lqx/v;)I

    move-result v13

    packed-switch v13, :pswitch_data_0

    goto :goto_1

    .line 6
    :pswitch_0
    iget-object v7, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->mapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v7, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v53, v7

    check-cast v53, Ljava/util/Map;

    if-eqz v53, :cond_0

    :goto_1
    move-object/from16 v10, v19

    :goto_2
    move-object/from16 v12, v20

    :goto_3
    move-object/from16 v7, v29

    :goto_4
    move-object/from16 v14, v36

    :goto_5
    move-object/from16 v15, v37

    :goto_6
    move-object/from16 v13, v49

    :goto_7
    move-object/from16 v5, v51

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {v5, v5, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 8
    :pswitch_1
    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->nullableIntAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v5, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v52, v5

    check-cast v52, Ljava/lang/Integer;

    const v5, -0x2000001

    :goto_8
    and-int/2addr v6, v5

    goto :goto_1

    .line 9
    :pswitch_2
    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->listOfDownstreamLocationDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v5, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    if-eqz v5, :cond_1

    const v7, -0x1000001

    and-int/2addr v6, v7

    move-object/from16 v10, v19

    move-object/from16 v12, v20

    move-object/from16 v7, v29

    move-object/from16 v14, v36

    move-object/from16 v15, v37

    move-object/from16 v13, v49

    goto :goto_0

    .line 10
    :cond_1
    const-string v2, "active_live_locations"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 11
    :pswitch_3
    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->nullableDownstreamMemberDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v5, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v50, v5

    check-cast v50, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;

    goto :goto_1

    .line 12
    :pswitch_4
    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->listOfStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v5, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v5

    move-object v13, v5

    check-cast v13, Ljava/util/List;

    if-eqz v13, :cond_2

    const v5, -0x400001

    and-int/2addr v6, v5

    move-object/from16 v10, v19

    move-object/from16 v12, v20

    move-object/from16 v7, v29

    move-object/from16 v14, v36

    move-object/from16 v15, v37

    goto :goto_7

    .line 13
    :cond_2
    const-string v2, "own_capabilities"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 14
    :pswitch_5
    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->listOfDownstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v5, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v5

    move-object v11, v5

    check-cast v11, Ljava/util/List;

    if-eqz v11, :cond_3

    const v5, -0x200001

    goto :goto_8

    .line 15
    :cond_3
    const-string v2, "pinned_messages"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 16
    :pswitch_6
    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v5, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v25, v5

    check-cast v25, Ljava/lang/Integer;

    if-eqz v25, :cond_4

    const v5, -0x100001

    goto :goto_8

    :cond_4
    const-string v2, "cooldown"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 17
    :pswitch_7
    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v5, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Ljava/lang/String;

    if-eqz v9, :cond_5

    const v5, -0x80001

    goto/16 :goto_8

    :cond_5
    const-string v2, "team"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 18
    :pswitch_8
    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->nullableDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v5, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v23, v5

    check-cast v23, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    goto/16 :goto_1

    .line 19
    :pswitch_9
    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->configDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v5, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v22, v5

    check-cast v22, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;

    if-eqz v22, :cond_6

    goto/16 :goto_1

    :cond_6
    invoke-static {v15, v15, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 20
    :pswitch_a
    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->listOfDownstreamChannelUserReadAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v5, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Ljava/util/List;

    if-eqz v8, :cond_7

    const v5, -0x10001

    goto/16 :goto_8

    .line 21
    :cond_7
    const-string v2, "read"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 22
    :pswitch_b
    iget-object v4, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->listOfDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v4, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    if-eqz v4, :cond_8

    const v5, -0x8001

    goto/16 :goto_8

    .line 23
    :cond_8
    const-string v2, "watchers"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 24
    :pswitch_c
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->listOfDownstreamMemberDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_9

    and-int/lit16 v6, v6, -0x4001

    goto/16 :goto_1

    .line 25
    :cond_9
    const-string v2, "members"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 26
    :pswitch_d
    iget-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->listOfDownstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v3, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_a

    and-int/lit16 v6, v6, -0x2001

    goto/16 :goto_1

    .line 27
    :cond_a
    const-string v2, "messages"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 28
    :pswitch_e
    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v5, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v17, v5

    check-cast v17, Ljava/lang/Integer;

    if-eqz v17, :cond_b

    and-int/lit16 v6, v6, -0x1001

    goto/16 :goto_1

    :cond_b
    const-string v2, "member_count"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 29
    :pswitch_f
    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v5, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v16, v5

    check-cast v16, Ljava/util/Date;

    goto/16 :goto_1

    .line 30
    :pswitch_10
    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v5, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v5

    move-object v15, v5

    check-cast v15, Ljava/util/Date;

    move-object/from16 v10, v19

    move-object/from16 v12, v20

    move-object/from16 v7, v29

    move-object/from16 v14, v36

    goto/16 :goto_6

    .line 31
    :pswitch_11
    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v5, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v5

    move-object v14, v5

    check-cast v14, Ljava/util/Date;

    move-object/from16 v10, v19

    move-object/from16 v12, v20

    move-object/from16 v7, v29

    goto/16 :goto_5

    .line 32
    :pswitch_12
    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v5, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v35, v5

    check-cast v35, Ljava/util/Date;

    goto/16 :goto_1

    .line 33
    :pswitch_13
    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v5, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v5

    move-object v12, v5

    check-cast v12, Ljava/lang/Boolean;

    if-eqz v12, :cond_c

    move-object/from16 v10, v19

    goto/16 :goto_3

    :cond_c
    invoke-static {v14, v14, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 34
    :pswitch_14
    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->nullableListOfStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v5, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v33, v5

    check-cast v33, Ljava/util/List;

    goto/16 :goto_1

    .line 35
    :pswitch_15
    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v5, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v5

    move-object v10, v5

    check-cast v10, Ljava/lang/Integer;

    if-eqz v10, :cond_d

    and-int/lit8 v6, v6, -0x21

    goto/16 :goto_2

    :cond_d
    const-string v2, "watcher_count"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 36
    :pswitch_16
    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v5, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v31, v5

    check-cast v31, Ljava/lang/String;

    goto/16 :goto_1

    .line 37
    :pswitch_17
    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v5, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v30, v5

    check-cast v30, Ljava/lang/String;

    goto/16 :goto_1

    .line 38
    :pswitch_18
    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v5, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Ljava/lang/String;

    if-eqz v7, :cond_e

    move-object/from16 v10, v19

    move-object/from16 v12, v20

    goto/16 :goto_4

    :cond_e
    invoke-static {v12, v12, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 39
    :pswitch_19
    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v5, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v28, v5

    check-cast v28, Ljava/lang/String;

    if-eqz v28, :cond_f

    goto/16 :goto_1

    :cond_f
    invoke-static {v10, v10, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 40
    :pswitch_1a
    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v5, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v27, v5

    check-cast v27, Ljava/lang/String;

    if-eqz v27, :cond_10

    goto/16 :goto_1

    :cond_10
    invoke-static {v7, v7, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 41
    :pswitch_1b
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->b0()V

    .line 42
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    goto/16 :goto_1

    :cond_11
    move-object/from16 v49, v13

    .line 43
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->endObject()V

    const v13, -0x379f021

    if-ne v6, v13, :cond_18

    .line 44
    new-instance v26, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    if-eqz v27, :cond_17

    if-eqz v28, :cond_16

    if-eqz v29, :cond_15

    .line 45
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Integer;->intValue()I

    move-result v32

    if-eqz v20, :cond_14

    .line 46
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v34

    .line 47
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Integer;->intValue()I

    move-result v39

    .line 48
    const-string v6, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.dto.DownstreamMessageDto>"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    const-string v7, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.dto.DownstreamMemberDto>"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    const-string v7, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto>"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    const-string v7, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.dto.DownstreamChannelUserRead>"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v22, :cond_13

    .line 52
    const-string v7, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v9, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Integer;->intValue()I

    move-result v47

    .line 54
    invoke-static {v11, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    const-string v6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"

    move-object/from16 v13, v49

    invoke-static {v13, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    const-string v6, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.dto.DownstreamLocationDto>"

    move-object/from16 v7, v51

    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v53, :cond_12

    move-object/from16 v41, v2

    move-object/from16 v40, v3

    move-object/from16 v42, v4

    move-object/from16 v51, v7

    move-object/from16 v43, v8

    move-object/from16 v46, v9

    move-object/from16 v48, v11

    move-object/from16 v49, v13

    move-object/from16 v38, v16

    move-object/from16 v44, v22

    move-object/from16 v45, v23

    .line 57
    invoke-direct/range {v26 .. v53}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;)V

    return-object v26

    .line 58
    :cond_12
    invoke-static {v5, v5, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 59
    :cond_13
    invoke-static {v15, v15, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 60
    :cond_14
    invoke-static {v14, v14, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 61
    :cond_15
    invoke-static {v12, v12, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 62
    :cond_16
    invoke-static {v10, v10, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 63
    :cond_17
    invoke-static {v7, v7, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    :cond_18
    move-object/from16 v41, v2

    move-object/from16 v18, v3

    move-object/from16 v42, v4

    move-object/from16 v21, v8

    move-object/from16 v46, v9

    move-object/from16 v48, v11

    .line 64
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    if-nez v2, :cond_19

    .line 65
    const-class v80, Ljava/util/Map;

    sget-object v82, Lrx/f;->c:Ljava/lang/Class;

    const-class v54, Ljava/lang/String;

    const-class v55, Ljava/lang/String;

    const-class v56, Ljava/lang/String;

    const-class v57, Ljava/lang/String;

    const-class v58, Ljava/lang/String;

    sget-object v59, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v60, Ljava/util/List;

    sget-object v61, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-class v62, Ljava/util/Date;

    const-class v63, Ljava/util/Date;

    const-class v64, Ljava/util/Date;

    const-class v65, Ljava/util/Date;

    const-class v67, Ljava/util/List;

    const-class v68, Ljava/util/List;

    const-class v69, Ljava/util/List;

    const-class v70, Ljava/util/List;

    const-class v71, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;

    const-class v72, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    const-class v73, Ljava/lang/String;

    const-class v75, Ljava/util/List;

    const-class v76, Ljava/util/List;

    const-class v77, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;

    const-class v78, Ljava/util/List;

    const-class v79, Ljava/lang/Integer;

    move-object/from16 v66, v59

    move-object/from16 v74, v59

    move-object/from16 v81, v59

    filled-new-array/range {v54 .. v82}, [Ljava/lang/Class;

    move-result-object v2

    .line 66
    const-class v3, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    invoke-virtual {v3, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    .line 67
    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    .line 68
    const-string v3, "also(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_19
    if-eqz v27, :cond_1f

    if-eqz v28, :cond_1e

    if-eqz v29, :cond_1d

    if-eqz v20, :cond_1c

    if-eqz v22, :cond_1b

    if-eqz v53, :cond_1a

    .line 69
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v32

    move-object/from16 v11, v33

    const/16 v33, 0x0

    move-object/from16 v10, v19

    move-object/from16 v12, v20

    move-object/from16 v5, v27

    move-object/from16 v6, v28

    move-object/from16 v7, v29

    move-object/from16 v8, v30

    move-object/from16 v9, v31

    move-object/from16 v13, v35

    move-object/from16 v14, v36

    move-object/from16 v15, v37

    move-object/from16 v19, v41

    move-object/from16 v20, v42

    move-object/from16 v24, v46

    move-object/from16 v26, v48

    move-object/from16 v27, v49

    move-object/from16 v28, v50

    move-object/from16 v29, v51

    move-object/from16 v30, v52

    move-object/from16 v31, v53

    .line 70
    filled-new-array/range {v5 .. v33}, [Ljava/lang/Object;

    move-result-object v1

    .line 71
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 72
    const-string v2, "newInstance(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    return-object v1

    :cond_1a
    invoke-static {v5, v5, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 73
    :cond_1b
    invoke-static {v15, v15, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 74
    :cond_1c
    invoke-static {v14, v14, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 75
    :cond_1d
    invoke-static {v12, v12, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 76
    :cond_1e
    invoke-static {v10, v10, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 77
    :cond_1f
    invoke-static {v7, v7, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
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
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;)V
    .locals 2

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lqx/c0;->h()Lqx/c0;

    .line 3
    const-string v0, "cid"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 4
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 5
    const-string v0, "id"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 6
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 7
    const-string v0, "type"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 8
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 9
    const-string v0, "name"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 10
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 11
    const-string v0, "image"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 12
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->getImage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 13
    const-string v0, "watcher_count"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 14
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->getWatcher_count()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 15
    const-string v0, "filter_tags"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 16
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->nullableListOfStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->getFilter_tags()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 17
    const-string v0, "frozen"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 18
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->getFrozen()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 19
    const-string v0, "last_message_at"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 20
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->getLast_message_at()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 21
    const-string v0, "created_at"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 22
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->getCreated_at()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 23
    const-string v0, "deleted_at"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 24
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->getDeleted_at()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 25
    const-string v0, "updated_at"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 26
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->getUpdated_at()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 27
    const-string v0, "member_count"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 28
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->getMember_count()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 29
    const-string v0, "messages"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 30
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->listOfDownstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->getMessages()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 31
    const-string v0, "members"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 32
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->listOfDownstreamMemberDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->getMembers()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 33
    const-string v0, "watchers"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 34
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->listOfDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->getWatchers()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 35
    const-string v0, "read"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 36
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->listOfDownstreamChannelUserReadAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->getRead()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 37
    const-string v0, "config"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 38
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->configDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->getConfig()Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 39
    const-string v0, "created_by"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 40
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->nullableDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->getCreated_by()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 41
    const-string v0, "team"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 42
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->getTeam()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 43
    const-string v0, "cooldown"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 44
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->getCooldown()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 45
    const-string v0, "pinned_messages"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 46
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->listOfDownstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->getPinned_messages()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 47
    const-string v0, "own_capabilities"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 48
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->listOfStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->getOwn_capabilities()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 49
    const-string v0, "membership"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 50
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->nullableDownstreamMemberDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->getMembership()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 51
    const-string v0, "active_live_locations"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 52
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->listOfDownstreamLocationDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->getActive_live_locations()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 53
    const-string v0, "message_count"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 54
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->nullableIntAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->getMessage_count()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 55
    const-string v0, "extraData"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 56
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->mapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->getExtraData()Ljava/util/Map;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 57
    invoke-virtual {p1}, Lqx/c0;->m()Lqx/c0;

    return-void

    .line 58
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;->toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    const/16 v0, 0x2a

    const-string v1, "GeneratedJsonAdapter(DownstreamChannelDto)"

    invoke-static {v0, v1}, Lvl/b;->e(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
