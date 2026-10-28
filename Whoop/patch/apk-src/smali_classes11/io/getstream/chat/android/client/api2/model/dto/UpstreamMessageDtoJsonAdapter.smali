.class public final Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/moshi/JsonAdapter<",
        "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001aR \u0010\u001d\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001aR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u001aR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u001aR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010\u001aR\u001a\u0010$\u001a\u0008\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010\u001aR \u0010%\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\"0\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010\u001aR\u001c\u0010\'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010\u001aR&\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020)0(0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010\u001a\u00a8\u0006+"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;",
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
        "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;",
        "Lqx/c0;",
        "writer",
        "value_",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;)V",
        "Lqx/v;",
        "options",
        "Lqx/v;",
        "",
        "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;",
        "listOfAttachmentDtoAdapter",
        "Lcom/squareup/moshi/JsonAdapter;",
        "stringAdapter",
        "nullableStringAdapter",
        "listOfStringAdapter",
        "Ljava/util/Date;",
        "nullableDateAdapter",
        "",
        "nullableBooleanAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;",
        "nullableUpstreamUserDtoAdapter",
        "booleanAdapter",
        "listOfUpstreamUserDtoAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;",
        "nullableUpstreamLocationDtoAdapter",
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
.field private final booleanAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final listOfAttachmentDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;",
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

.field private final listOfUpstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;",
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

.field private final nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableUpstreamLocationDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableUpstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;",
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
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "moshi"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    const-string v23, "shared_location"

    const-string v24, "extraData"

    const-string v3, "attachments"

    const-string v4, "cid"

    const-string v5, "command"

    const-string v6, "args"

    const-string v7, "html"

    const-string v8, "id"

    const-string v9, "type"

    const-string v10, "mentioned_users"

    const-string v11, "parent_id"

    const-string v12, "pin_expires"

    const-string v13, "pinned"

    const-string v14, "pinned_at"

    const-string v15, "pinned_by"

    const-string v16, "quoted_message_id"

    const-string v17, "shadowed"

    const-string v18, "show_in_channel"

    const-string v19, "silent"

    const-string v20, "text"

    const-string v21, "thread_participants"

    const-string v22, "restricted_visibility"

    filled-new-array/range {v3 .. v24}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lqx/v;->a([Ljava/lang/String;)Lqx/v;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->options:Lqx/v;

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/reflect/Type;

    const/4 v4, 0x0

    const-class v5, Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;

    aput-object v5, v3, v4

    const-class v5, Ljava/util/List;

    invoke-static {v5, v3}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v3

    const-string v6, "attachments"

    sget-object v7, Lm83/a0;->w:Lm83/a0;

    invoke-virtual {v1, v3, v7, v6}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v3

    iput-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->listOfAttachmentDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-string v3, "cid"

    const-class v6, Ljava/lang/String;

    invoke-virtual {v1, v6, v7, v3}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v3

    iput-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-string v3, "command"

    invoke-virtual {v1, v6, v7, v3}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v3

    iput-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v3, v2, [Ljava/lang/reflect/Type;

    aput-object v6, v3, v4

    invoke-static {v5, v3}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v3

    const-string v8, "mentioned_users"

    invoke-virtual {v1, v3, v7, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v3

    iput-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->listOfStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v3, Ljava/util/Date;

    const-string v8, "pin_expires"

    invoke-virtual {v1, v3, v7, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v3

    iput-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v3, Ljava/lang/Boolean;

    const-string v8, "pinned"

    invoke-virtual {v1, v3, v7, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v3

    iput-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->nullableBooleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-string v3, "pinned_by"

    const-class v8, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;

    invoke-virtual {v1, v8, v7, v3}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v3

    iput-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->nullableUpstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-string v9, "shadowed"

    invoke-virtual {v1, v3, v7, v9}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v3

    iput-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v3, v2, [Ljava/lang/reflect/Type;

    aput-object v8, v3, v4

    invoke-static {v5, v3}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v3

    const-string v5, "thread_participants"

    invoke-virtual {v1, v3, v7, v5}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v3

    iput-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->listOfUpstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v3, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;

    const-string v5, "shared_location"

    invoke-virtual {v1, v3, v7, v5}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v3

    iput-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->nullableUpstreamLocationDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/reflect/Type;

    aput-object v6, v3, v4

    const-class v4, Ljava/lang/Object;

    aput-object v4, v3, v2

    const-class v2, Ljava/util/Map;

    invoke-static {v2, v3}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v2

    const-string v3, "extraData"

    invoke-virtual {v1, v2, v7, v3}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->mapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method


# virtual methods
.method public fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;
    .locals 38

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "reader"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    const/4 v2, 0x0

    move-object v3, v2

    move-object v4, v3

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

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v21, v18

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    .line 3
    :goto_0
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v19

    move-object/from16 v20, v2

    const-string v2, "attachments"

    move-object/from16 v26, v3

    const-string v3, "cid"

    move-object/from16 v27, v4

    const-string v4, "html"

    move-object/from16 v28, v5

    const-string v5, "id"

    move-object/from16 v29, v6

    const-string v6, "type"

    move-object/from16 v30, v7

    const-string v7, "mentioned_users"

    move-object/from16 v31, v8

    const-string v8, "shadowed"

    move-object/from16 v32, v9

    const-string v9, "show_in_channel"

    move-object/from16 v33, v10

    const-string v10, "silent"

    move-object/from16 v34, v11

    const-string v11, "text"

    move-object/from16 v35, v12

    const-string v12, "thread_participants"

    move-object/from16 v36, v13

    const-string v13, "restricted_visibility"

    move-object/from16 v37, v14

    const-string v14, "extraData"

    if-eqz v19, :cond_d

    move-object/from16 v19, v15

    .line 4
    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->options:Lqx/v;

    invoke-virtual {v1, v15}, Lcom/squareup/moshi/JsonReader;->T(Lqx/v;)I

    move-result v15

    packed-switch v15, :pswitch_data_0

    goto :goto_1

    .line 5
    :pswitch_0
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->mapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v25, v2

    check-cast v25, Ljava/util/Map;

    if-eqz v25, :cond_0

    :goto_1
    move-object/from16 v15, v19

    :goto_2
    move-object/from16 v2, v20

    :goto_3
    move-object/from16 v3, v26

    :goto_4
    move-object/from16 v4, v27

    :goto_5
    move-object/from16 v5, v28

    :goto_6
    move-object/from16 v6, v29

    :goto_7
    move-object/from16 v7, v30

    :goto_8
    move-object/from16 v8, v31

    :goto_9
    move-object/from16 v9, v32

    :goto_a
    move-object/from16 v10, v33

    :goto_b
    move-object/from16 v11, v34

    :goto_c
    move-object/from16 v12, v35

    :goto_d
    move-object/from16 v13, v36

    :goto_e
    move-object/from16 v14, v37

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {v14, v14, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 7
    :pswitch_1
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->nullableUpstreamLocationDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v24, v2

    check-cast v24, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;

    goto :goto_1

    .line 8
    :pswitch_2
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->listOfStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v23, v2

    check-cast v23, Ljava/util/List;

    if-eqz v23, :cond_1

    goto :goto_1

    .line 9
    :cond_1
    invoke-static {v13, v13, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 10
    :pswitch_3
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->listOfUpstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v22, v2

    check-cast v22, Ljava/util/List;

    if-eqz v22, :cond_2

    goto :goto_1

    .line 11
    :cond_2
    invoke-static {v12, v12, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 12
    :pswitch_4
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v21, v2

    check-cast v21, Ljava/lang/String;

    if-eqz v21, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {v11, v11, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 13
    :pswitch_5
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Ljava/lang/Boolean;

    if-eqz v18, :cond_4

    goto :goto_1

    :cond_4
    invoke-static {v10, v10, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 14
    :pswitch_6
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/Boolean;

    if-eqz v3, :cond_5

    move-object/from16 v15, v19

    move-object/from16 v2, v20

    goto :goto_4

    .line 15
    :cond_5
    invoke-static {v9, v9, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 16
    :pswitch_7
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    if-eqz v2, :cond_6

    move-object/from16 v15, v19

    goto/16 :goto_3

    :cond_6
    invoke-static {v8, v8, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 17
    :pswitch_8
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Ljava/lang/String;

    goto/16 :goto_1

    .line 18
    :pswitch_9
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->nullableUpstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;

    goto/16 :goto_1

    .line 19
    :pswitch_a
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Ljava/util/Date;

    goto/16 :goto_2

    .line 20
    :pswitch_b
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->nullableBooleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Ljava/lang/Boolean;

    move-object/from16 v15, v19

    move-object/from16 v2, v20

    move-object/from16 v3, v26

    move-object/from16 v4, v27

    move-object/from16 v5, v28

    move-object/from16 v6, v29

    move-object/from16 v7, v30

    move-object/from16 v8, v31

    move-object/from16 v9, v32

    move-object/from16 v10, v33

    move-object/from16 v11, v34

    move-object/from16 v12, v35

    move-object/from16 v13, v36

    goto/16 :goto_0

    .line 21
    :pswitch_c
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Ljava/util/Date;

    move-object/from16 v15, v19

    move-object/from16 v2, v20

    move-object/from16 v3, v26

    move-object/from16 v4, v27

    move-object/from16 v5, v28

    move-object/from16 v6, v29

    move-object/from16 v7, v30

    move-object/from16 v8, v31

    move-object/from16 v9, v32

    move-object/from16 v10, v33

    move-object/from16 v11, v34

    move-object/from16 v12, v35

    goto/16 :goto_e

    .line 22
    :pswitch_d
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Ljava/lang/String;

    move-object/from16 v15, v19

    move-object/from16 v2, v20

    move-object/from16 v3, v26

    move-object/from16 v4, v27

    move-object/from16 v5, v28

    move-object/from16 v6, v29

    move-object/from16 v7, v30

    move-object/from16 v8, v31

    move-object/from16 v9, v32

    move-object/from16 v10, v33

    move-object/from16 v11, v34

    goto/16 :goto_d

    .line 23
    :pswitch_e
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->listOfStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Ljava/util/List;

    if-eqz v11, :cond_7

    move-object/from16 v15, v19

    move-object/from16 v2, v20

    move-object/from16 v3, v26

    move-object/from16 v4, v27

    move-object/from16 v5, v28

    move-object/from16 v6, v29

    move-object/from16 v7, v30

    move-object/from16 v8, v31

    move-object/from16 v9, v32

    move-object/from16 v10, v33

    goto/16 :goto_c

    .line 24
    :cond_7
    invoke-static {v7, v7, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 25
    :pswitch_f
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Ljava/lang/String;

    if-eqz v10, :cond_8

    move-object/from16 v15, v19

    move-object/from16 v2, v20

    move-object/from16 v3, v26

    move-object/from16 v4, v27

    move-object/from16 v5, v28

    move-object/from16 v6, v29

    move-object/from16 v7, v30

    move-object/from16 v8, v31

    move-object/from16 v9, v32

    goto/16 :goto_b

    :cond_8
    invoke-static {v6, v6, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 26
    :pswitch_10
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Ljava/lang/String;

    if-eqz v9, :cond_9

    move-object/from16 v15, v19

    move-object/from16 v2, v20

    move-object/from16 v3, v26

    move-object/from16 v4, v27

    move-object/from16 v5, v28

    move-object/from16 v6, v29

    move-object/from16 v7, v30

    move-object/from16 v8, v31

    goto/16 :goto_a

    :cond_9
    invoke-static {v5, v5, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 27
    :pswitch_11
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ljava/lang/String;

    if-eqz v8, :cond_a

    move-object/from16 v15, v19

    move-object/from16 v2, v20

    move-object/from16 v3, v26

    move-object/from16 v4, v27

    move-object/from16 v5, v28

    move-object/from16 v6, v29

    move-object/from16 v7, v30

    goto/16 :goto_9

    :cond_a
    invoke-static {v4, v4, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 28
    :pswitch_12
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/lang/String;

    move-object/from16 v15, v19

    move-object/from16 v2, v20

    move-object/from16 v3, v26

    move-object/from16 v4, v27

    move-object/from16 v5, v28

    move-object/from16 v6, v29

    goto/16 :goto_8

    .line 29
    :pswitch_13
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ljava/lang/String;

    move-object/from16 v15, v19

    move-object/from16 v2, v20

    move-object/from16 v3, v26

    move-object/from16 v4, v27

    move-object/from16 v5, v28

    goto/16 :goto_7

    .line 30
    :pswitch_14
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_b

    move-object/from16 v15, v19

    move-object/from16 v2, v20

    move-object/from16 v3, v26

    move-object/from16 v4, v27

    goto/16 :goto_6

    :cond_b
    invoke-static {v3, v3, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 31
    :pswitch_15
    iget-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->listOfAttachmentDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v3, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/util/List;

    if-eqz v4, :cond_c

    move-object/from16 v15, v19

    move-object/from16 v2, v20

    move-object/from16 v3, v26

    goto/16 :goto_5

    .line 32
    :cond_c
    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 33
    :pswitch_16
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->b0()V

    .line 34
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    goto/16 :goto_1

    :cond_d
    move-object/from16 v19, v15

    .line 35
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->endObject()V

    move-object v15, v3

    .line 36
    new-instance v3, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;

    if-eqz v27, :cond_1a

    if-eqz v28, :cond_19

    if-eqz v31, :cond_18

    if-eqz v32, :cond_17

    if-eqz v33, :cond_16

    if-eqz v34, :cond_15

    if-eqz v20, :cond_14

    .line 37
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v26, :cond_13

    .line 38
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v18, :cond_12

    .line 39
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v20

    if-eqz v21, :cond_11

    if-eqz v22, :cond_10

    if-eqz v23, :cond_f

    if-eqz v25, :cond_e

    move/from16 v18, v2

    move-object/from16 v15, v19

    move-object/from16 v5, v28

    move-object/from16 v6, v29

    move-object/from16 v7, v30

    move-object/from16 v8, v31

    move-object/from16 v9, v32

    move-object/from16 v10, v33

    move-object/from16 v11, v34

    move-object/from16 v12, v35

    move-object/from16 v13, v36

    move-object/from16 v14, v37

    move/from16 v19, v4

    move-object/from16 v4, v27

    .line 40
    invoke-direct/range {v3 .. v25}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Boolean;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;Ljava/lang/String;ZZZLjava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;Ljava/util/Map;)V

    return-object v3

    :cond_e
    move-object v2, v14

    .line 41
    invoke-static {v2, v2, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 42
    :cond_f
    invoke-static {v13, v13, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 43
    :cond_10
    invoke-static {v12, v12, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 44
    :cond_11
    invoke-static {v11, v11, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 45
    :cond_12
    invoke-static {v10, v10, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 46
    :cond_13
    invoke-static {v9, v9, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 47
    :cond_14
    invoke-static {v8, v8, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 48
    :cond_15
    invoke-static {v7, v7, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 49
    :cond_16
    invoke-static {v6, v6, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 50
    :cond_17
    invoke-static {v5, v5, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 51
    :cond_18
    invoke-static {v4, v4, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 52
    :cond_19
    invoke-static {v15, v15, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 53
    :cond_1a
    invoke-static {v2, v2, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    nop

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;)V
    .locals 2

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lqx/c0;->h()Lqx/c0;

    .line 3
    const-string v0, "attachments"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 4
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->listOfAttachmentDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->getAttachments()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 5
    const-string v0, "cid"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 6
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 7
    const-string v0, "command"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 8
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->getCommand()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 9
    const-string v0, "args"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 10
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->getArgs()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 11
    const-string v0, "html"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 12
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->getHtml()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 13
    const-string v0, "id"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 14
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 15
    const-string v0, "type"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 16
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 17
    const-string v0, "mentioned_users"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 18
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->listOfStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->getMentioned_users()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 19
    const-string v0, "parent_id"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 20
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->getParent_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 21
    const-string v0, "pin_expires"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 22
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->getPin_expires()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 23
    const-string v0, "pinned"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 24
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->nullableBooleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->getPinned()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 25
    const-string v0, "pinned_at"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 26
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->getPinned_at()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 27
    const-string v0, "pinned_by"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 28
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->nullableUpstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->getPinned_by()Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 29
    const-string v0, "quoted_message_id"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 30
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->getQuoted_message_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 31
    const-string v0, "shadowed"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 32
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->getShadowed()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 33
    const-string v0, "show_in_channel"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 34
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->getShow_in_channel()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 35
    const-string v0, "silent"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 36
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->getSilent()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 37
    const-string v0, "text"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 38
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 39
    const-string v0, "thread_participants"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 40
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->listOfUpstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->getThread_participants()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 41
    const-string v0, "restricted_visibility"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 42
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->listOfStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->getRestricted_visibility()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 43
    const-string v0, "shared_location"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 44
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->nullableUpstreamLocationDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->getShared_location()Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 45
    const-string v0, "extraData"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 46
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->mapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->getExtraData()Ljava/util/Map;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 47
    invoke-virtual {p1}, Lqx/c0;->m()Lqx/c0;

    return-void

    .line 48
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;->toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    const/16 v0, 0x28

    const-string v1, "GeneratedJsonAdapter(UpstreamMessageDto)"

    invoke-static {v0, v1}, Lvl/b;->e(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
